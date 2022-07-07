// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public class f3D extends f3A
{
    public boolean 1;
    public float 4;
    public float 5;
    public float 6;
    
    @Override
    public void c(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          714
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            706
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            698
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: getstatic       dev/nuker/pyro/fc.0:I
        //    29: ifeq            37
        //    32: ldc             1849011484
        //    34: goto            39
        //    37: ldc             -772968839
        //    39: ldc             1766733021
        //    41: ixor           
        //    42: lookupswitch {
        //          -1197253980: 68
        //          125540801: 37
        //          default: 681
        //        }
        //    68: iload_2        
        //    69: iload_3        
        //    70: goto            74
        //    73: athrow         
        //    74: invokespecial   dev/nuker/pyro/f3A.c:(III)V
        //    77: goto            81
        //    80: athrow         
        //    81: getstatic       dev/nuker/pyro/f0y.c:Ldev/nuker/pyro/f0y;
        //    84: getstatic       dev/nuker/pyro/fc.1:I
        //    87: ifeq            95
        //    90: ldc             -1418997732
        //    92: goto            97
        //    95: ldc             2098072936
        //    97: ldc             877614173
        //    99: ixor           
        //   100: lookupswitch {
        //          -1624996799: 673
        //          957177129: 95
        //          default: 128
        //        }
        //   128: goto            132
        //   131: athrow         
        //   132: invokevirtual   dev/nuker/pyro/f0y.4:()D
        //   135: goto            139
        //   138: athrow         
        //   139: dstore          4
        //   141: iload_1        
        //   142: i2f            
        //   143: aload_0        
        //   144: goto            148
        //   147: athrow         
        //   148: invokevirtual   dev/nuker/pyro/f3D.5:()F
        //   151: goto            155
        //   154: athrow         
        //   155: fsub           
        //   156: f2d            
        //   157: getstatic       dev/nuker/pyro/fc.0:I
        //   160: ifeq            168
        //   163: ldc             1083957782
        //   165: goto            170
        //   168: ldc             127104060
        //   170: ldc             -2009287628
        //   172: ixor           
        //   173: lookupswitch {
        //          -1501211462: 168
        //          -928557534: 675
        //          default: 200
        //        }
        //   200: dload           4
        //   202: ddiv           
        //   203: d2f            
        //   204: fstore          6
        //   206: getstatic       dev/nuker/pyro/fc.0:I
        //   209: ifeq            217
        //   212: ldc             -340140395
        //   214: goto            219
        //   217: ldc             -485210993
        //   219: ldc             1068222471
        //   221: ixor           
        //   222: lookupswitch {
        //          -737012078: 217
        //          -591426424: 248
        //          default: 671
        //        }
        //   248: iload_2        
        //   249: i2f            
        //   250: aload_0        
        //   251: goto            255
        //   254: athrow         
        //   255: invokevirtual   dev/nuker/pyro/f3D.2:()F
        //   258: goto            262
        //   261: athrow         
        //   262: fsub           
        //   263: f2d            
        //   264: dload           4
        //   266: ddiv           
        //   267: d2f            
        //   268: fstore          7
        //   270: fload           6
        //   272: fconst_0       
        //   273: fcmpl          
        //   274: iflt            668
        //   277: fload           6
        //   279: aload_0        
        //   280: goto            284
        //   283: athrow         
        //   284: invokevirtual   dev/nuker/pyro/f3D.1:()F
        //   287: goto            291
        //   290: athrow         
        //   291: fcmpg          
        //   292: ifgt            668
        //   295: fload           7
        //   297: fconst_0       
        //   298: fcmpl          
        //   299: iflt            668
        //   302: fload           7
        //   304: f2d            
        //   305: getstatic       dev/nuker/pyro/fc.c:I
        //   308: ifge            316
        //   311: ldc             740845270
        //   313: goto            318
        //   316: ldc             71432822
        //   318: ldc             -1308395907
        //   320: ixor           
        //   321: lookupswitch {
        //          -1641344853: 316
        //          -1237152757: 348
        //          default: 669
        //        }
        //   348: aload_0        
        //   349: getstatic       dev/nuker/pyro/fc.1:I
        //   352: ifeq            360
        //   355: ldc             -992727873
        //   357: goto            362
        //   360: ldc             -1506916376
        //   362: ldc             96337000
        //   364: ixor           
        //   365: lookupswitch {
        //          -1550599296: 392
        //          -1050029865: 360
        //          default: 683
        //        }
        //   392: getfield        dev/nuker/pyro/f3D.4:F
        //   395: f2d            
        //   396: dload           4
        //   398: dmul           
        //   399: dcmpg          
        //   400: ifge            668
        //   403: iload_3        
        //   404: ifne            470
        //   407: aload_0        
        //   408: iconst_1       
        //   409: putfield        dev/nuker/pyro/f3D.1:Z
        //   412: aload_0        
        //   413: fload           6
        //   415: putfield        dev/nuker/pyro/f3D.5:F
        //   418: aload_0        
        //   419: fload           7
        //   421: getstatic       dev/nuker/pyro/fc.c:I
        //   424: ifge            432
        //   427: ldc             -348140039
        //   429: goto            434
        //   432: ldc             1119731055
        //   434: ldc             -1355761639
        //   436: ixor           
        //   437: lookupswitch {
        //          -309525130: 464
        //          1141863904: 432
        //          default: 685
        //        }
        //   464: putfield        dev/nuker/pyro/f3D.6:F
        //   467: goto            668
        //   470: getstatic       dev/nuker/pyro/fc.1:I
        //   473: ifeq            481
        //   476: ldc             -261114167
        //   478: goto            483
        //   481: ldc             2064537811
        //   483: ldc             71696814
        //   485: ixor           
        //   486: lookupswitch {
        //          -198592665: 687
        //          1303778268: 481
        //          default: 512
        //        }
        //   512: iload_3        
        //   513: iconst_1       
        //   514: if_icmpne       668
        //   517: aload_0        
        //   518: getstatic       dev/nuker/pyro/fc.c:I
        //   521: ifge            529
        //   524: ldc             -1203652466
        //   526: goto            531
        //   529: ldc             46562982
        //   531: ldc             -846516369
        //   533: ixor           
        //   534: lookupswitch {
        //          501810908: 529
        //          1976211425: 677
        //          default: 560
        //        }
        //   560: aload_0        
        //   561: getstatic       dev/nuker/pyro/fc.c:I
        //   564: ifge            572
        //   567: ldc             -1268818137
        //   569: goto            574
        //   572: ldc             -2103971168
        //   574: ldc             1559271425
        //   576: ixor           
        //   577: lookupswitch {
        //          -563647839: 604
        //          -391133402: 572
        //          default: 679
        //        }
        //   604: goto            608
        //   607: athrow         
        //   608: invokevirtual   dev/nuker/pyro/f3D.0:()Z
        //   611: goto            615
        //   614: athrow         
        //   615: ifne            623
        //   618: ldc             -758290885
        //   620: goto            625
        //   623: ldc             -758290888
        //   625: ldc             1435044010
        //   627: ixor           
        //   628: tableswitch {
        //          243850530: 652
        //          243850531: 656
        //          default: 618
        //        }
        //   652: iconst_1       
        //   653: goto            657
        //   656: iconst_0       
        //   657: goto            661
        //   660: athrow         
        //   661: invokevirtual   dev/nuker/pyro/f3D.c:(Z)V
        //   664: goto            668
        //   667: athrow         
        //   668: return         
        //   669: aconst_null    
        //   670: athrow         
        //   671: aconst_null    
        //   672: athrow         
        //   673: aconst_null    
        //   674: athrow         
        //   675: aconst_null    
        //   676: athrow         
        //   677: aconst_null    
        //   678: athrow         
        //   679: aconst_null    
        //   680: athrow         
        //   681: aconst_null    
        //   682: athrow         
        //   683: aconst_null    
        //   684: athrow         
        //   685: aconst_null    
        //   686: athrow         
        //   687: aconst_null    
        //   688: athrow         
        //   689: pop            
        //   690: goto            24
        //   693: pop            
        //   694: aconst_null    
        //   695: goto            689
        //   698: dup            
        //   699: ifnull          689
        //   702: checkcast       Ljava/lang/Throwable;
        //   705: athrow         
        //   706: dup            
        //   707: ifnull          693
        //   710: checkcast       Ljava/lang/Throwable;
        //   713: athrow         
        //   714: aconst_null    
        //   715: athrow         
        //    StackMapTable: 00 54 43 07 00 2B 04 FF 00 0B 00 00 00 01 07 00 2B FF 00 03 00 04 07 00 03 01 01 01 00 00 FF 00 0C 00 04 07 00 03 01 01 01 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 01 01 01 00 03 07 00 03 01 01 FF 00 1C 00 04 07 00 03 01 01 01 00 02 07 00 03 01 44 07 00 2B FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 45 07 00 2B 00 4D 07 00 32 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 32 01 5E 07 00 32 42 07 00 17 40 07 00 32 45 07 00 2B 40 03 FF 00 07 00 05 07 00 03 01 01 01 03 00 01 07 00 2B FF 00 00 00 05 07 00 03 01 01 01 03 00 02 02 07 00 03 45 07 00 2B FF 00 00 00 05 07 00 03 01 01 01 03 00 02 02 02 4C 03 FF 00 01 00 05 07 00 03 01 01 01 03 00 02 03 01 5D 03 FC 00 10 02 41 01 1C FF 00 05 00 00 00 01 07 00 2B FF 00 00 00 06 07 00 03 01 01 01 03 02 00 02 02 07 00 03 45 07 00 2B FF 00 00 00 06 07 00 03 01 01 01 03 02 00 02 02 02 FF 00 14 00 07 07 00 03 01 01 01 03 02 02 00 01 07 00 2B FF 00 00 00 07 07 00 03 01 01 01 03 02 02 00 02 02 07 00 03 45 07 00 2B FF 00 00 00 07 07 00 03 01 01 01 03 02 02 00 02 02 02 58 03 FF 00 01 00 07 07 00 03 01 01 01 03 02 02 00 02 03 01 5D 03 FF 00 0B 00 07 07 00 03 01 01 01 03 02 02 00 02 03 07 00 03 FF 00 01 00 07 07 00 03 01 01 01 03 02 02 00 03 03 07 00 03 01 FF 00 1D 00 07 07 00 03 01 01 01 03 02 02 00 02 03 07 00 03 FF 00 27 00 07 07 00 03 01 01 01 03 02 02 00 02 07 00 03 02 FF 00 01 00 07 07 00 03 01 01 01 03 02 02 00 03 07 00 03 02 01 FF 00 1D 00 07 07 00 03 01 01 01 03 02 02 00 02 07 00 03 02 05 0A 41 01 1C 50 07 00 03 FF 00 01 00 07 07 00 03 01 01 01 03 02 02 00 02 07 00 03 01 5C 07 00 03 FF 00 0B 00 07 07 00 03 01 01 01 03 02 02 00 02 07 00 03 07 00 03 FF 00 01 00 07 07 00 03 01 01 01 03 02 02 00 03 07 00 03 07 00 03 01 FF 00 1D 00 07 07 00 03 01 01 01 03 02 02 00 02 07 00 03 07 00 03 FF 00 02 00 00 00 01 07 00 2B FF 00 00 00 07 07 00 03 01 01 01 03 02 02 00 02 07 00 03 07 00 03 45 07 00 2B FF 00 00 00 07 07 00 03 01 01 01 03 02 02 00 02 07 00 03 01 42 07 00 03 44 07 00 03 FF 00 01 00 07 07 00 03 01 01 01 03 02 02 00 02 07 00 03 01 5A 07 00 03 43 07 00 03 FF 00 00 00 07 07 00 03 01 01 01 03 02 02 00 02 07 00 03 01 42 07 00 23 FF 00 00 00 07 07 00 03 01 01 01 03 02 02 00 02 07 00 03 01 45 07 00 2B 00 40 03 FA 00 01 FF 00 01 00 04 07 00 03 01 01 01 00 01 07 00 32 FF 00 01 00 05 07 00 03 01 01 01 03 00 01 03 FF 00 01 00 07 07 00 03 01 01 01 03 02 02 00 01 07 00 03 FF 00 01 00 07 07 00 03 01 01 01 03 02 02 00 02 07 00 03 07 00 03 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 03 01 FF 00 01 00 07 07 00 03 01 01 01 03 02 02 00 02 03 07 00 03 FF 00 01 00 07 07 00 03 01 01 01 03 02 02 00 02 07 00 03 02 01 FF 00 01 00 04 07 00 03 01 01 01 00 01 07 00 2B 43 05 44 07 00 2B 47 05 47 07 00 2B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     698    706    Any
        //  698    706    698    706    Ljava/lang/ClassCastException;
        //  714    716    3      8      Any
        //  73     80     80     81     Any
        //  74     80     80     81     Ljava/lang/AssertionError;
        //  74     80     73     74     Any
        //  74     80     80     81     Ljava/util/ConcurrentModificationException;
        //  74     80     3      8      Any
        //  131    138    138    139    Any
        //  132    138    138    139    Any
        //  131    138    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  132    138    131    132    Ljava/lang/NullPointerException;
        //  132    138    3      8      Any
        //  147    154    154    155    Any
        //  147    154    147    148    Ljava/lang/StringIndexOutOfBoundsException;
        //  148    154    3      8      Any
        //  148    154    147    148    Any
        //  147    154    3      8      Ljava/lang/UnsupportedOperationException;
        //  255    261    261    262    Any
        //  255    261    261    262    Any
        //  255    261    261    262    Any
        //  255    261    3      8      Ljava/util/NoSuchElementException;
        //  255    261    261    262    Any
        //  283    290    290    291    Any
        //  283    290    290    291    Any
        //  283    290    3      8      Ljava/lang/UnsupportedOperationException;
        //  284    290    290    291    Ljava/lang/IndexOutOfBoundsException;
        //  284    290    283    284    Any
        //  608    614    614    615    Any
        //  608    614    614    615    Any
        //  608    614    3      8      Any
        //  608    614    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  608    614    614    615    Any
        //  660    667    667    668    Any
        //  660    667    3      8      Ljava/lang/IllegalStateException;
        //  660    667    3      8      Ljava/lang/ClassCastException;
        //  660    667    660    661    Ljava/lang/IllegalArgumentException;
        //  660    667    3      8      Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:617)
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
    public void 0(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          113
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            105
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            97
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
        //    32: invokespecial   dev/nuker/pyro/f3A.0:(III)V
        //    35: goto            39
        //    38: athrow         
        //    39: getstatic       dev/nuker/pyro/fc.c:I
        //    42: ifge            50
        //    45: ldc             192121507
        //    47: goto            52
        //    50: ldc             1049920334
        //    52: ldc             1920489559
        //    54: ixor           
        //    55: lookupswitch {
        //          1290591001: 80
        //          2030818036: 50
        //          default: 86
        //        }
        //    80: aload_0        
        //    81: iconst_0       
        //    82: putfield        dev/nuker/pyro/f3D.1:Z
        //    85: return         
        //    86: aconst_null    
        //    87: athrow         
        //    88: pop            
        //    89: goto            24
        //    92: pop            
        //    93: aconst_null    
        //    94: goto            88
        //    97: dup            
        //    98: ifnull          88
        //   101: checkcast       Ljava/lang/Throwable;
        //   104: athrow         
        //   105: dup            
        //   106: ifnull          92
        //   109: checkcast       Ljava/lang/Throwable;
        //   112: athrow         
        //   113: aconst_null    
        //   114: athrow         
        //    StackMapTable: 00 11 43 07 00 2B 04 FF 00 0B 00 00 00 01 07 00 2B FF 00 03 00 04 07 00 03 01 01 01 00 00 46 07 00 0F FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 45 07 00 2B 00 0A 41 01 1B 05 41 07 00 77 43 05 44 07 00 77 47 05 47 07 00 2B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     97     105    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  97     105    97     105    Ljava/lang/IllegalArgumentException;
        //  113    115    3      7      Any
        //  31     38     38     39     Any
        //  31     38     3      7      Any
        //  32     38     38     39     Ljava/lang/IllegalArgumentException;
        //  31     38     31     32     Ljava/lang/ClassCastException;
        //  31     38     3      7      Ljava/lang/ClassCastException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 48 out of bounds for length 48
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
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
    
    public float 0() {
        return fbS.aE(this, 2105225242);
    }
    
    @Override
    public boolean c(final float p0, final float p1, final float p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          341
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            333
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            325
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f3D.1:Z
        //    28: ifeq            36
        //    31: ldc             1475246549
        //    33: goto            38
        //    36: ldc             1475246548
        //    38: ldc             1106800653
        //    40: ixor           
        //    41: tableswitch {
        //          741086128: 64
        //          741086129: 208
        //          default: 31
        //        }
        //    64: aload_0        
        //    65: fload_1        
        //    66: aload_0        
        //    67: getstatic       dev/nuker/pyro/fc.1:I
        //    70: ifeq            78
        //    73: ldc             -342980135
        //    75: goto            80
        //    78: ldc             -410559448
        //    80: ldc             -386438256
        //    82: ixor           
        //    83: lookupswitch {
        //          -493737864: 78
        //          58319433: 314
        //          default: 108
        //        }
        //   108: goto            112
        //   111: athrow         
        //   112: invokevirtual   dev/nuker/pyro/f3D.5:()F
        //   115: goto            119
        //   118: athrow         
        //   119: fadd           
        //   120: aload_0        
        //   121: getfield        dev/nuker/pyro/f3D.5:F
        //   124: fsub           
        //   125: goto            129
        //   128: athrow         
        //   129: invokevirtual   dev/nuker/pyro/f3D.1:(F)V
        //   132: goto            136
        //   135: athrow         
        //   136: aload_0        
        //   137: fload_2        
        //   138: aload_0        
        //   139: getstatic       dev/nuker/pyro/fc.c:I
        //   142: ifge            150
        //   145: ldc             -2115988600
        //   147: goto            152
        //   150: ldc             1788031286
        //   152: ldc             416264914
        //   154: ixor           
        //   155: lookupswitch {
        //          -1724964518: 150
        //          1918665700: 180
        //          default: 308
        //        }
        //   180: goto            184
        //   183: athrow         
        //   184: invokevirtual   dev/nuker/pyro/f3D.2:()F
        //   187: goto            191
        //   190: athrow         
        //   191: fadd           
        //   192: aload_0        
        //   193: getfield        dev/nuker/pyro/f3D.6:F
        //   196: fsub           
        //   197: goto            201
        //   200: athrow         
        //   201: invokevirtual   dev/nuker/pyro/f3D.3:(F)V
        //   204: goto            208
        //   207: athrow         
        //   208: aload_0        
        //   209: fload_1        
        //   210: fload_2        
        //   211: getstatic       dev/nuker/pyro/fc.0:I
        //   214: ifeq            222
        //   217: ldc             -953234503
        //   219: goto            224
        //   222: ldc             -875320751
        //   224: ldc             -1960393294
        //   226: ixor           
        //   227: lookupswitch {
        //          1275596299: 310
        //          2085864395: 222
        //          default: 252
        //        }
        //   252: fload_3        
        //   253: getstatic       dev/nuker/pyro/fc.1:I
        //   256: ifeq            264
        //   259: ldc             1696544818
        //   261: goto            266
        //   264: ldc             846614151
        //   266: ldc             -1874264008
        //   268: ixor           
        //   269: lookupswitch {
        //          -1572909377: 296
        //          -178898934: 264
        //          default: 312
        //        }
        //   296: goto            300
        //   299: athrow         
        //   300: invokespecial   dev/nuker/pyro/f3A.c:(FFF)Z
        //   303: goto            307
        //   306: athrow         
        //   307: ireturn        
        //   308: aconst_null    
        //   309: athrow         
        //   310: aconst_null    
        //   311: athrow         
        //   312: aconst_null    
        //   313: athrow         
        //   314: aconst_null    
        //   315: athrow         
        //   316: pop            
        //   317: goto            24
        //   320: pop            
        //   321: aconst_null    
        //   322: goto            316
        //   325: dup            
        //   326: ifnull          316
        //   329: checkcast       Ljava/lang/Throwable;
        //   332: athrow         
        //   333: dup            
        //   334: ifnull          320
        //   337: checkcast       Ljava/lang/Throwable;
        //   340: athrow         
        //   341: aconst_null    
        //   342: athrow         
        //    StackMapTable: 00 31 43 07 00 2B 04 FF 00 0B 00 00 00 01 07 00 2B FF 00 03 00 04 07 00 03 02 02 02 00 00 06 04 41 01 19 FF 00 0D 00 04 07 00 03 02 02 02 00 03 07 00 03 02 07 00 03 FF 00 01 00 04 07 00 03 02 02 02 00 04 07 00 03 02 07 00 03 01 FF 00 1B 00 04 07 00 03 02 02 02 00 03 07 00 03 02 07 00 03 42 07 00 2B FF 00 00 00 04 07 00 03 02 02 02 00 03 07 00 03 02 07 00 03 45 07 00 2B FF 00 00 00 04 07 00 03 02 02 02 00 03 07 00 03 02 02 48 07 00 2B FF 00 00 00 04 07 00 03 02 02 02 00 02 07 00 03 02 45 07 00 2B 00 FF 00 0D 00 04 07 00 03 02 02 02 00 03 07 00 03 02 07 00 03 FF 00 01 00 04 07 00 03 02 02 02 00 04 07 00 03 02 07 00 03 01 FF 00 1B 00 04 07 00 03 02 02 02 00 03 07 00 03 02 07 00 03 FF 00 02 00 00 00 01 07 00 2B FF 00 00 00 04 07 00 03 02 02 02 00 03 07 00 03 02 07 00 03 45 07 00 2B FF 00 00 00 04 07 00 03 02 02 02 00 03 07 00 03 02 02 48 07 00 2B FF 00 00 00 04 07 00 03 02 02 02 00 02 07 00 03 02 45 07 00 2B 00 FF 00 0D 00 04 07 00 03 02 02 02 00 03 07 00 03 02 02 FF 00 01 00 04 07 00 03 02 02 02 00 04 07 00 03 02 02 01 FF 00 1B 00 04 07 00 03 02 02 02 00 03 07 00 03 02 02 FF 00 0B 00 04 07 00 03 02 02 02 00 04 07 00 03 02 02 02 FF 00 01 00 04 07 00 03 02 02 02 00 05 07 00 03 02 02 02 01 FF 00 1D 00 04 07 00 03 02 02 02 00 04 07 00 03 02 02 02 42 07 00 77 FF 00 00 00 04 07 00 03 02 02 02 00 04 07 00 03 02 02 02 45 07 00 2B 40 01 FF 00 00 00 04 07 00 03 02 02 02 00 03 07 00 03 02 07 00 03 FF 00 01 00 04 07 00 03 02 02 02 00 03 07 00 03 02 02 FF 00 01 00 04 07 00 03 02 02 02 00 04 07 00 03 02 02 02 FF 00 01 00 04 07 00 03 02 02 02 00 03 07 00 03 02 07 00 03 41 07 00 2B 43 05 44 07 00 2B 47 05 47 07 00 2B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     325    333    Ljava/lang/NullPointerException;
        //  325    333    325    333    Any
        //  341    343    3      8      Ljava/lang/AssertionError;
        //  111    118    118    119    Any
        //  111    118    118    119    Any
        //  112    118    118    119    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  112    118    111    112    Any
        //  112    118    118    119    Any
        //  128    135    135    136    Any
        //  128    135    3      8      Ljava/lang/NumberFormatException;
        //  129    135    135    136    Ljava/util/NoSuchElementException;
        //  129    135    128    129    Any
        //  129    135    135    136    Any
        //  184    190    190    191    Any
        //  184    190    3      8      Ljava/lang/NumberFormatException;
        //  184    190    190    191    Any
        //  184    190    190    191    Ljava/lang/NullPointerException;
        //  184    190    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  200    207    207    208    Any
        //  200    207    200    201    Ljava/util/NoSuchElementException;
        //  200    207    3      8      Ljava/lang/NullPointerException;
        //  201    207    200    201    Any
        //  201    207    200    201    Any
        //  299    306    306    307    Any
        //  300    306    299    300    Ljava/lang/IllegalStateException;
        //  300    306    299    300    Ljava/lang/NullPointerException;
        //  300    306    299    300    Ljava/lang/NegativeArraySizeException;
        //  300    306    3      8      Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:617)
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
    
    public void 4(final float n) {
        fbS.85(this, 859762600, n);
    }
    
    public f3D(final String s, final float n, final float n2, final float n3, final float n4, final float 4) {
        while (true) {
            int n5 = 0;
            Label_0014: {
                if (fc.c < 0) {
                    n5 = -1256343002;
                    break Label_0014;
                }
                n5 = -415378292;
            }
            switch (n5 ^ 0x76AC473D) {
                case -1011745509: {
                    continue;
                }
                case -1852730447: {
                    while (true) {
                        int n6 = 0;
                        Label_0058: {
                            if (fc.c < 0) {
                                n6 = 209741735;
                                break Label_0058;
                            }
                            n6 = -300144024;
                        }
                        switch (n6 ^ 0x25DDB327) {
                            case 564432295: {
                                continue;
                            }
                            default: {
                                while (true) {
                                    int n7 = 0;
                                    Label_0105: {
                                        if (fc.1 != 0) {
                                            n7 = -262110736;
                                            break Label_0105;
                                        }
                                        n7 = -548147980;
                                    }
                                    switch (n7 ^ 0x633A17B7) {
                                        case -1822779833: {
                                            continue;
                                        }
                                        case -1133905085: {
                                            while (true) {
                                                int n8 = 0;
                                                Label_0151: {
                                                    if (fc.0 != 0) {
                                                        n8 = 1825633280;
                                                        break Label_0151;
                                                    }
                                                    n8 = -748958934;
                                                }
                                                switch (n8 ^ 0xC123414A) {
                                                    case -37922133: {
                                                        continue;
                                                    }
                                                    default: {
                                                        super(s, n, n2, n3, n4);
                                                        this.4 = 4;
                                                        return;
                                                    }
                                                    case -1376537270: {
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
                            case 694015104: {
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
}
