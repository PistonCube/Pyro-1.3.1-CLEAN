// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.awt.Color;

public class fbI
{
    public float c;
    public float[] c;
    public Color c;
    
    public static Color c(final float[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          63
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            55
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            47
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: fconst_1       
        //    26: goto            30
        //    29: athrow         
        //    30: invokestatic    dev/nuker/pyro/fbI.c:([FF)Ljava/awt/Color;
        //    33: goto            37
        //    36: athrow         
        //    37: areturn        
        //    38: pop            
        //    39: goto            24
        //    42: pop            
        //    43: aconst_null    
        //    44: goto            38
        //    47: dup            
        //    48: ifnull          38
        //    51: checkcast       Ljava/lang/Throwable;
        //    54: athrow         
        //    55: dup            
        //    56: ifnull          42
        //    59: checkcast       Ljava/lang/Throwable;
        //    62: athrow         
        //    63: aconst_null    
        //    64: athrow         
        //    StackMapTable: 00 0D 43 07 00 18 04 FF 00 0B 00 00 00 01 07 00 18 FC 00 03 07 00 1C FF 00 04 00 00 00 01 07 00 18 FF 00 00 00 01 07 00 1C 00 02 07 00 1C 02 45 07 00 18 40 07 00 1E 40 07 00 0C 43 05 44 07 00 0C 47 05 47 07 00 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     47     55     Ljava/lang/RuntimeException;
        //  47     55     47     55     Ljava/lang/IllegalStateException;
        //  63     65     3      8      Any
        //  30     36     36     37     Any
        //  30     36     36     37     Any
        //  30     36     3      8      Any
        //  30     36     3      8      Ljava/lang/RuntimeException;
        //  30     36     36     37     Ljava/lang/StringIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 32 out of bounds for length 32
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
    
    public Color c(final float n) {
        return fbS.7y(this, 2114559822, n);
    }
    
    @Override
    public String toString() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          651
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            643
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            635
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/lang/StringBuilder;
        //    27: dup            
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   java/lang/StringBuilder.<init>:()V
        //    35: goto            39
        //    38: athrow         
        //    39: iconst_0       
        //    40: ldc             "\u292d\u14a0\u8038\ue3e4\ub64f\ue70f\ub22b\uec2b\u894d\u963b\uad9e"
        //    42: getstatic       dev/nuker/pyro/fc.1:I
        //    45: ifeq            53
        //    48: ldc             251690931
        //    50: goto            55
        //    53: ldc             -1158427279
        //    55: ldc             -557754067
        //    57: ixor           
        //    58: lookupswitch {
        //          -775870818: 612
        //          749618086: 53
        //          default: 84
        //        }
        //    84: goto            88
        //    87: athrow         
        //    88: invokestatic    invokestatic   !!! ERROR
        //    91: goto            95
        //    94: athrow         
        //    95: getstatic       dev/nuker/pyro/fc.c:I
        //    98: ifge            106
        //   101: ldc             764309957
        //   103: goto            108
        //   106: ldc             914575213
        //   108: ldc             -895241944
        //   110: ixor           
        //   111: lookupswitch {
        //          -416431891: 106
        //          -64946619: 136
        //          default: 608
        //        }
        //   136: goto            140
        //   139: athrow         
        //   140: invokevirtual   java/lang/StringBuilder.insert:(ILjava/lang/String;)Ljava/lang/StringBuilder;
        //   143: goto            147
        //   146: athrow         
        //   147: aload_0        
        //   148: getfield        dev/nuker/pyro/fbI.c:[F
        //   151: iconst_0       
        //   152: faload         
        //   153: getstatic       dev/nuker/pyro/fc.c:I
        //   156: ifge            164
        //   159: ldc             -1831028063
        //   161: goto            166
        //   164: ldc             -1607270068
        //   166: ldc             -118755865
        //   168: ixor           
        //   169: lookupswitch {
        //          -902417887: 164
        //          1782011718: 624
        //          default: 196
        //        }
        //   196: goto            200
        //   199: athrow         
        //   200: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   203: goto            207
        //   206: athrow         
        //   207: ldc             "\u2949\u1480\u8049"
        //   209: goto            213
        //   212: athrow         
        //   213: invokestatic    invokestatic   !!! ERROR
        //   216: goto            220
        //   219: athrow         
        //   220: goto            224
        //   223: athrow         
        //   224: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   227: goto            231
        //   230: athrow         
        //   231: getstatic       dev/nuker/pyro/fc.0:I
        //   234: ifeq            242
        //   237: ldc             -216433281
        //   239: goto            244
        //   242: ldc             1201430773
        //   244: ldc             -1562632324
        //   246: ixor           
        //   247: lookupswitch {
        //          783277345: 242
        //          1371890179: 620
        //          default: 272
        //        }
        //   272: aload_0        
        //   273: getfield        dev/nuker/pyro/fbI.c:[F
        //   276: iconst_1       
        //   277: faload         
        //   278: goto            282
        //   281: athrow         
        //   282: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   285: goto            289
        //   288: athrow         
        //   289: ldc             "\u2949\u149f\u8049"
        //   291: goto            295
        //   294: athrow         
        //   295: invokestatic    invokestatic   !!! ERROR
        //   298: goto            302
        //   301: athrow         
        //   302: goto            306
        //   305: athrow         
        //   306: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   309: goto            313
        //   312: athrow         
        //   313: getstatic       dev/nuker/pyro/fc.0:I
        //   316: ifeq            324
        //   319: ldc             336582536
        //   321: goto            326
        //   324: ldc             361850854
        //   326: ldc             820092094
        //   328: ixor           
        //   329: lookupswitch {
        //          -1684830074: 324
        //          619596598: 610
        //          default: 356
        //        }
        //   356: aload_0        
        //   357: getstatic       dev/nuker/pyro/fc.1:I
        //   360: ifeq            368
        //   363: ldc             1016915868
        //   365: goto            370
        //   368: ldc             274450215
        //   370: ldc             -561718262
        //   372: ixor           
        //   373: lookupswitch {
        //          -824239315: 400
        //          -501728362: 368
        //          default: 616
        //        }
        //   400: getfield        dev/nuker/pyro/fbI.c:[F
        //   403: iconst_2       
        //   404: faload         
        //   405: goto            409
        //   408: athrow         
        //   409: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   412: goto            416
        //   415: athrow         
        //   416: ldc             "\u2949\u1492\u8018\ue3d7\ub648\ue702\ub279"
        //   418: goto            422
        //   421: athrow         
        //   422: invokestatic    invokestatic   !!! ERROR
        //   425: goto            429
        //   428: athrow         
        //   429: getstatic       dev/nuker/pyro/fc.c:I
        //   432: ifge            440
        //   435: ldc             1670515187
        //   437: goto            442
        //   440: ldc             -625988755
        //   442: ldc             1193502599
        //   444: ixor           
        //   445: lookupswitch {
        //          -240427514: 440
        //          615607924: 618
        //          default: 472
        //        }
        //   472: goto            476
        //   475: athrow         
        //   476: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   479: goto            483
        //   482: athrow         
        //   483: aload_0        
        //   484: getfield        dev/nuker/pyro/fbI.c:F
        //   487: getstatic       dev/nuker/pyro/fc.1:I
        //   490: ifeq            498
        //   493: ldc             767325178
        //   495: goto            500
        //   498: ldc             -630385287
        //   500: ldc             1387120869
        //   502: ixor           
        //   503: lookupswitch {
        //          -2000626276: 528
        //          2131868447: 498
        //          default: 622
        //        }
        //   528: goto            532
        //   531: athrow         
        //   532: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   535: goto            539
        //   538: athrow         
        //   539: ldc             "]"
        //   541: goto            545
        //   544: athrow         
        //   545: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   548: goto            552
        //   551: athrow         
        //   552: getstatic       dev/nuker/pyro/fc.c:I
        //   555: ifge            563
        //   558: ldc             1113705116
        //   560: goto            565
        //   563: ldc             -1740346905
        //   565: ldc             -732952957
        //   567: ixor           
        //   568: lookupswitch {
        //          -1775121377: 563
        //          1276407652: 596
        //          default: 614
        //        }
        //   596: goto            600
        //   599: athrow         
        //   600: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   603: goto            607
        //   606: athrow         
        //   607: areturn        
        //   608: aconst_null    
        //   609: athrow         
        //   610: aconst_null    
        //   611: athrow         
        //   612: aconst_null    
        //   613: athrow         
        //   614: aconst_null    
        //   615: athrow         
        //   616: aconst_null    
        //   617: athrow         
        //   618: aconst_null    
        //   619: athrow         
        //   620: aconst_null    
        //   621: athrow         
        //   622: aconst_null    
        //   623: athrow         
        //   624: aconst_null    
        //   625: athrow         
        //   626: pop            
        //   627: goto            24
        //   630: pop            
        //   631: aconst_null    
        //   632: goto            626
        //   635: dup            
        //   636: ifnull          626
        //   639: checkcast       Ljava/lang/Throwable;
        //   642: athrow         
        //   643: dup            
        //   644: ifnull          630
        //   647: checkcast       Ljava/lang/Throwable;
        //   650: athrow         
        //   651: aconst_null    
        //   652: athrow         
        //    StackMapTable: 00 69 43 07 00 18 04 FF 00 0B 00 00 00 01 07 00 18 FC 00 03 07 00 03 46 07 00 18 FF 00 00 00 01 07 00 03 00 02 08 00 18 08 00 18 45 07 00 18 40 07 00 40 FF 00 0D 00 01 07 00 03 00 03 07 00 40 01 07 00 86 FF 00 01 00 01 07 00 03 00 04 07 00 40 01 07 00 86 01 FF 00 1C 00 01 07 00 03 00 03 07 00 40 01 07 00 86 42 07 00 2E FF 00 00 00 01 07 00 03 00 03 07 00 40 01 07 00 86 45 07 00 18 FF 00 00 00 01 07 00 03 00 03 07 00 40 01 07 00 86 FF 00 0A 00 01 07 00 03 00 03 07 00 40 01 07 00 86 FF 00 01 00 01 07 00 03 00 04 07 00 40 01 07 00 86 01 FF 00 1B 00 01 07 00 03 00 03 07 00 40 01 07 00 86 FF 00 02 00 00 00 01 07 00 18 FF 00 00 00 01 07 00 03 00 03 07 00 40 01 07 00 86 45 07 00 18 40 07 00 40 FF 00 10 00 01 07 00 03 00 02 07 00 40 02 FF 00 01 00 01 07 00 03 00 03 07 00 40 02 01 FF 00 1D 00 01 07 00 03 00 02 07 00 40 02 42 07 00 18 FF 00 00 00 01 07 00 03 00 02 07 00 40 02 45 07 00 18 40 07 00 40 44 07 00 18 FF 00 00 00 01 07 00 03 00 02 07 00 40 07 00 86 45 07 00 18 FF 00 00 00 01 07 00 03 00 02 07 00 40 07 00 86 42 07 00 2A FF 00 00 00 01 07 00 03 00 02 07 00 40 07 00 86 45 07 00 18 40 07 00 40 4A 07 00 40 FF 00 01 00 01 07 00 03 00 02 07 00 40 01 5B 07 00 40 48 07 00 10 FF 00 00 00 01 07 00 03 00 02 07 00 40 02 45 07 00 18 40 07 00 40 44 07 00 18 FF 00 00 00 01 07 00 03 00 02 07 00 40 07 00 86 45 07 00 18 FF 00 00 00 01 07 00 03 00 02 07 00 40 07 00 86 FF 00 02 00 00 00 01 07 00 18 FF 00 00 00 01 07 00 03 00 02 07 00 40 07 00 86 45 07 00 18 40 07 00 40 4A 07 00 40 FF 00 01 00 01 07 00 03 00 02 07 00 40 01 5D 07 00 40 FF 00 0B 00 01 07 00 03 00 02 07 00 40 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 40 07 00 03 01 FF 00 1D 00 01 07 00 03 00 02 07 00 40 07 00 03 47 07 00 0C FF 00 00 00 01 07 00 03 00 02 07 00 40 02 45 07 00 18 40 07 00 40 44 07 00 18 FF 00 00 00 01 07 00 03 00 02 07 00 40 07 00 86 45 07 00 18 FF 00 00 00 01 07 00 03 00 02 07 00 40 07 00 86 FF 00 0A 00 01 07 00 03 00 02 07 00 40 07 00 86 FF 00 01 00 01 07 00 03 00 03 07 00 40 07 00 86 01 FF 00 1D 00 01 07 00 03 00 02 07 00 40 07 00 86 42 07 00 36 FF 00 00 00 01 07 00 03 00 02 07 00 40 07 00 86 45 07 00 18 40 07 00 40 FF 00 0E 00 01 07 00 03 00 02 07 00 40 02 FF 00 01 00 01 07 00 03 00 03 07 00 40 02 01 FF 00 1B 00 01 07 00 03 00 02 07 00 40 02 42 07 00 18 FF 00 00 00 01 07 00 03 00 02 07 00 40 02 45 07 00 18 40 07 00 40 44 07 00 38 FF 00 00 00 01 07 00 03 00 02 07 00 40 07 00 86 45 07 00 18 40 07 00 40 4A 07 00 40 FF 00 01 00 01 07 00 03 00 02 07 00 40 01 5E 07 00 40 42 07 00 18 40 07 00 40 45 07 00 18 40 07 00 86 FF 00 00 00 01 07 00 03 00 03 07 00 40 01 07 00 86 41 07 00 40 FF 00 01 00 01 07 00 03 00 03 07 00 40 01 07 00 86 41 07 00 40 FF 00 01 00 01 07 00 03 00 02 07 00 40 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 40 07 00 86 41 07 00 40 FF 00 01 00 01 07 00 03 00 02 07 00 40 02 FF 00 01 00 01 07 00 03 00 02 07 00 40 02 41 07 00 18 43 05 44 07 00 18 47 05 47 07 00 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     635    643    Ljava/lang/NegativeArraySizeException;
        //  635    643    635    643    Any
        //  651    653    3      8      Any
        //  31     38     38     39     Any
        //  31     38     31     32     Any
        //  32     38     38     39     Any
        //  31     38     31     32     Ljava/util/NoSuchElementException;
        //  32     38     38     39     Any
        //  87     94     94     95     Any
        //  87     94     87     88     Ljava/lang/ClassCastException;
        //  88     94     94     95     Any
        //  87     94     94     95     Ljava/lang/IndexOutOfBoundsException;
        //  87     94     87     88     Ljava/lang/ClassCastException;
        //  140    146    146    147    Any
        //  140    146    3      8      Ljava/lang/NegativeArraySizeException;
        //  140    146    146    147    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  140    146    3      8      Any
        //  140    146    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  199    206    206    207    Any
        //  200    206    3      8      Ljava/lang/RuntimeException;
        //  199    206    3      8      Any
        //  200    206    206    207    Ljava/lang/ArithmeticException;
        //  199    206    199    200    Any
        //  212    219    219    220    Any
        //  212    219    212    213    Any
        //  212    219    212    213    Any
        //  213    219    219    220    Any
        //  212    219    212    213    Ljava/lang/NegativeArraySizeException;
        //  223    230    230    231    Any
        //  223    230    230    231    Ljava/util/ConcurrentModificationException;
        //  223    230    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  223    230    3      8      Ljava/lang/RuntimeException;
        //  224    230    223    224    Ljava/lang/NegativeArraySizeException;
        //  281    288    288    289    Any
        //  282    288    3      8      Any
        //  281    288    288    289    Any
        //  281    288    281    282    Ljava/lang/StringIndexOutOfBoundsException;
        //  281    288    3      8      Any
        //  294    301    301    302    Any
        //  295    301    301    302    Any
        //  294    301    294    295    Ljava/lang/EnumConstantNotPresentException;
        //  294    301    294    295    Any
        //  295    301    301    302    Any
        //  306    312    312    313    Any
        //  306    312    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  306    312    312    313    Any
        //  306    312    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  306    312    3      8      Ljava/lang/NumberFormatException;
        //  408    415    415    416    Any
        //  409    415    3      8      Any
        //  408    415    408    409    Ljava/lang/NullPointerException;
        //  408    415    415    416    Any
        //  408    415    408    409    Ljava/util/NoSuchElementException;
        //  421    428    428    429    Any
        //  422    428    428    429    Any
        //  421    428    421    422    Any
        //  421    428    421    422    Ljava/lang/NumberFormatException;
        //  422    428    3      8      Ljava/lang/ClassCastException;
        //  475    482    482    483    Any
        //  476    482    482    483    Any
        //  476    482    3      8      Any
        //  475    482    475    476    Ljava/util/ConcurrentModificationException;
        //  475    482    482    483    Ljava/lang/NumberFormatException;
        //  531    538    538    539    Any
        //  531    538    3      8      Ljava/util/NoSuchElementException;
        //  532    538    531    532    Any
        //  531    538    531    532    Any
        //  531    538    531    532    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  544    551    551    552    Any
        //  544    551    3      8      Ljava/lang/NegativeArraySizeException;
        //  544    551    3      8      Any
        //  545    551    3      8      Ljava/lang/RuntimeException;
        //  544    551    544    545    Ljava/lang/EnumConstantNotPresentException;
        //  599    606    606    607    Any
        //  599    606    606    607    Ljava/lang/EnumConstantNotPresentException;
        //  600    606    599    600    Any
        //  599    606    606    607    Any
        //  600    606    3      8      Ljava/lang/UnsupportedOperationException;
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
    
    public static Color c(final float[] p0, final float p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          114
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            106
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            98
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iconst_0       
        //    26: faload         
        //    27: getstatic       dev/nuker/pyro/fc.c:I
        //    30: ifge            38
        //    33: ldc             -897408964
        //    35: goto            40
        //    38: ldc             -1266161873
        //    40: ldc             280804988
        //    42: ixor           
        //    43: lookupswitch {
        //          -1539614381: 68
        //          -633463232: 38
        //          default: 87
        //        }
        //    68: aload_0        
        //    69: iconst_1       
        //    70: faload         
        //    71: aload_0        
        //    72: iconst_2       
        //    73: faload         
        //    74: fload_1        
        //    75: goto            79
        //    78: athrow         
        //    79: invokestatic    dev/nuker/pyro/fbI.c:(FFFF)Ljava/awt/Color;
        //    82: goto            86
        //    85: athrow         
        //    86: areturn        
        //    87: aconst_null    
        //    88: athrow         
        //    89: pop            
        //    90: goto            24
        //    93: pop            
        //    94: aconst_null    
        //    95: goto            89
        //    98: dup            
        //    99: ifnull          89
        //   102: checkcast       Ljava/lang/Throwable;
        //   105: athrow         
        //   106: dup            
        //   107: ifnull          93
        //   110: checkcast       Ljava/lang/Throwable;
        //   113: athrow         
        //   114: aconst_null    
        //   115: athrow         
        //    StackMapTable: 00 11 43 07 00 18 04 FF 00 0B 00 00 00 01 07 00 18 FD 00 03 07 00 1C 02 4D 02 FF 00 01 00 02 07 00 1C 02 00 02 02 01 5B 02 49 07 00 18 FF 00 00 00 02 07 00 1C 02 00 04 02 02 02 02 45 07 00 18 40 07 00 1E 40 02 41 07 00 18 43 05 44 07 00 18 47 05 47 07 00 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  8      20     98     106    Any
        //  98     106    98     106    Any
        //  114    116    3      8      Any
        //  78     85     85     86     Any
        //  78     85     78     79     Any
        //  79     85     85     86     Ljava/lang/AssertionError;
        //  79     85     3      8      Ljava/lang/NegativeArraySizeException;
        //  79     85     3      8      Any
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
    
    public Color 0(final float p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          373
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            365
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            357
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             100.0
        //    26: fload_1        
        //    27: fsub           
        //    28: ldc             100.0
        //    30: fdiv           
        //    31: fstore_1       
        //    32: fconst_0       
        //    33: aload_0        
        //    34: getfield        dev/nuker/pyro/fbI.c:[F
        //    37: iconst_2       
        //    38: faload         
        //    39: getstatic       dev/nuker/pyro/fc.1:I
        //    42: ifeq            50
        //    45: ldc             -294471810
        //    47: goto            52
        //    50: ldc             -367915595
        //    52: ldc             -860853569
        //    54: ixor           
        //    55: lookupswitch {
        //          583196097: 344
        //          1403010423: 50
        //          default: 80
        //        }
        //    80: fload_1        
        //    81: fmul           
        //    82: getstatic       dev/nuker/pyro/fc.1:I
        //    85: ifeq            93
        //    88: ldc             572717976
        //    90: goto            95
        //    93: ldc             -614229181
        //    95: ldc             552712014
        //    97: ixor           
        //    98: lookupswitch {
        //          47402198: 340
        //          861969359: 93
        //          default: 124
        //        }
        //   124: goto            128
        //   127: athrow         
        //   128: invokestatic    java/lang/Math.max:(FF)F
        //   131: goto            135
        //   134: athrow         
        //   135: fstore_1       
        //   136: getstatic       dev/nuker/pyro/fc.1:I
        //   139: ifeq            147
        //   142: ldc             1035458254
        //   144: goto            149
        //   147: ldc             1349545680
        //   149: ldc             1191247514
        //   151: ixor           
        //   152: lookupswitch {
        //          393252938: 180
        //          2058823764: 147
        //          default: 346
        //        }
        //   180: aload_0        
        //   181: getstatic       dev/nuker/pyro/fc.c:I
        //   184: ifge            192
        //   187: ldc             240394722
        //   189: goto            194
        //   192: ldc             2131404610
        //   194: ldc             1344975721
        //   196: ixor           
        //   197: lookupswitch {
        //          790631467: 224
        //          1585353355: 192
        //          default: 342
        //        }
        //   224: getfield        dev/nuker/pyro/fbI.c:[F
        //   227: iconst_0       
        //   228: faload         
        //   229: aload_0        
        //   230: getfield        dev/nuker/pyro/fbI.c:[F
        //   233: iconst_1       
        //   234: faload         
        //   235: getstatic       dev/nuker/pyro/fc.c:I
        //   238: ifge            246
        //   241: ldc             1905058415
        //   243: goto            248
        //   246: ldc             103586233
        //   248: ldc             -997388067
        //   250: ixor           
        //   251: lookupswitch {
        //          -1258163534: 336
        //          -1019327310: 246
        //          default: 276
        //        }
        //   276: fload_1        
        //   277: getstatic       dev/nuker/pyro/fc.c:I
        //   280: ifge            288
        //   283: ldc             1939067922
        //   285: goto            290
        //   288: ldc             952978849
        //   290: ldc             1183579211
        //   292: ixor           
        //   293: lookupswitch {
        //          -1232710337: 288
        //          890775641: 338
        //          default: 320
        //        }
        //   320: aload_0        
        //   321: getfield        dev/nuker/pyro/fbI.c:F
        //   324: goto            328
        //   327: athrow         
        //   328: invokestatic    dev/nuker/pyro/fbI.c:(FFFF)Ljava/awt/Color;
        //   331: goto            335
        //   334: athrow         
        //   335: areturn        
        //   336: aconst_null    
        //   337: athrow         
        //   338: aconst_null    
        //   339: athrow         
        //   340: aconst_null    
        //   341: athrow         
        //   342: aconst_null    
        //   343: athrow         
        //   344: aconst_null    
        //   345: athrow         
        //   346: aconst_null    
        //   347: athrow         
        //   348: pop            
        //   349: goto            24
        //   352: pop            
        //   353: aconst_null    
        //   354: goto            348
        //   357: dup            
        //   358: ifnull          348
        //   361: checkcast       Ljava/lang/Throwable;
        //   364: athrow         
        //   365: dup            
        //   366: ifnull          352
        //   369: checkcast       Ljava/lang/Throwable;
        //   372: athrow         
        //   373: aconst_null    
        //   374: athrow         
        //    StackMapTable: 00 29 43 07 00 18 04 FF 00 0B 00 00 00 01 07 00 18 FD 00 03 07 00 03 02 FF 00 19 00 02 07 00 03 02 00 02 02 02 FF 00 01 00 02 07 00 03 02 00 03 02 02 01 FF 00 1B 00 02 07 00 03 02 00 02 02 02 FF 00 0C 00 02 07 00 03 02 00 02 02 02 FF 00 01 00 02 07 00 03 02 00 03 02 02 01 FF 00 1C 00 02 07 00 03 02 00 02 02 02 42 07 00 18 FF 00 00 00 02 07 00 03 02 00 02 02 02 45 07 00 18 40 02 0B 41 01 1E 4B 07 00 03 FF 00 01 00 02 07 00 03 02 00 02 07 00 03 01 5D 07 00 03 FF 00 15 00 02 07 00 03 02 00 02 02 02 FF 00 01 00 02 07 00 03 02 00 03 02 02 01 FF 00 1B 00 02 07 00 03 02 00 02 02 02 FF 00 0B 00 02 07 00 03 02 00 03 02 02 02 FF 00 01 00 02 07 00 03 02 00 04 02 02 02 01 FF 00 1D 00 02 07 00 03 02 00 03 02 02 02 46 07 00 18 FF 00 00 00 02 07 00 03 02 00 04 02 02 02 02 45 07 00 18 40 07 00 1E FF 00 00 00 02 07 00 03 02 00 02 02 02 FF 00 01 00 02 07 00 03 02 00 03 02 02 02 FF 00 01 00 02 07 00 03 02 00 02 02 02 41 07 00 03 FF 00 01 00 02 07 00 03 02 00 02 02 02 01 41 07 00 18 43 05 44 07 00 18 47 05 47 07 00 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     357    365    Any
        //  357    365    357    365    Ljava/lang/IllegalStateException;
        //  373    375    3      8      Any
        //  127    134    134    135    Any
        //  127    134    3      8      Any
        //  128    134    134    135    Ljava/lang/ClassCastException;
        //  128    134    127    128    Any
        //  128    134    127    128    Ljava/lang/AssertionError;
        //  327    334    334    335    Any
        //  327    334    327    328    Any
        //  328    334    334    335    Ljava/lang/ArithmeticException;
        //  328    334    334    335    Any
        //  327    334    334    335    Ljava/lang/EnumConstantNotPresentException;
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
    
    public float 1() {
        return fbS.aC(this, 1319004961);
    }
    
    public Color 3(final float n) {
        return fbS.7y(this, 2114559817, n);
    }
    
    public fbI(final Color c) {
        while (true) {
            int n = 0;
            Label_0014: {
                if (fc.0 != 0) {
                    n = -419288510;
                    break Label_0014;
                }
                n = 1728535188;
            }
            switch (n ^ 0x908AAAE7) {
                case -774725655: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0061: {
                            if (fc.1 != 0) {
                                n2 = -1553001997;
                                break Label_0061;
                            }
                            n2 = -529022697;
                        }
                        switch (n2 ^ 0x9A9509C3) {
                            case -53650780: {
                                continue;
                            }
                            default: {
                                while (true) {
                                    int n3 = 0;
                                    Label_0106: {
                                        if (fc.1 != 0) {
                                            n3 = -999738616;
                                            break Label_0106;
                                        }
                                        n3 = -1590011399;
                                    }
                                    switch (n3 ^ 0xAED05E0) {
                                        case -830195992: {
                                            continue;
                                        }
                                        case -1411949543: {
                                            this.c = c;
                                            while (true) {
                                                int n4 = 0;
                                                Label_0154: {
                                                    if (fc.c < 0) {
                                                        n4 = 1901972058;
                                                        break Label_0154;
                                                    }
                                                    n4 = 408566940;
                                                }
                                                switch (n4 ^ 0x4138D2D9) {
                                                    case 811931779: {
                                                        continue;
                                                    }
                                                    case 1499655749: {
                                                        this.c = c(c);
                                                        final float c2 = c.getAlpha() / 255.0f;
                                                        while (true) {
                                                            int n5 = 0;
                                                            Label_0212: {
                                                                if (fc.0 != 0) {
                                                                    n5 = 1615861651;
                                                                    break Label_0212;
                                                                }
                                                                n5 = -1577488305;
                                                            }
                                                            switch (n5 ^ 0xC4B84E32) {
                                                                case 375177717: {
                                                                    continue;
                                                                }
                                                                default: {
                                                                    this.c = c2;
                                                                    return;
                                                                }
                                                                case -1528276575: {
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
                            case 972691504: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 2005434533: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static float[] c(final Color p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1408
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1400
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1392
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: aconst_null    
        //    26: goto            30
        //    29: athrow         
        //    30: invokevirtual   java/awt/Color.getRGBColorComponents:([F)[F
        //    33: goto            37
        //    36: athrow         
        //    37: astore_1       
        //    38: aload_1        
        //    39: iconst_0       
        //    40: faload         
        //    41: getstatic       dev/nuker/pyro/fc.0:I
        //    44: ifeq            52
        //    47: ldc             2084880047
        //    49: goto            54
        //    52: ldc             -1521060449
        //    54: ldc             -1781380714
        //    56: ixor           
        //    57: lookupswitch {
        //          -375982279: 52
        //          813972489: 84
        //          default: 1367
        //        }
        //    84: fstore_2       
        //    85: getstatic       dev/nuker/pyro/fc.c:I
        //    88: ifge            96
        //    91: ldc             697434631
        //    93: goto            98
        //    96: ldc             332718132
        //    98: ldc             1032292246
        //   100: ixor           
        //   101: lookupswitch {
        //          -1225533171: 96
        //          336954769: 1345
        //          default: 128
        //        }
        //   128: aload_1        
        //   129: iconst_1       
        //   130: faload         
        //   131: fstore_3       
        //   132: getstatic       dev/nuker/pyro/fc.c:I
        //   135: ifge            143
        //   138: ldc             -821230167
        //   140: goto            145
        //   143: ldc             -425340798
        //   145: ldc             -1450276152
        //   147: ixor           
        //   148: lookupswitch {
        //          1077176786: 143
        //          1719897953: 1355
        //          default: 176
        //        }
        //   176: aload_1        
        //   177: iconst_2       
        //   178: faload         
        //   179: fstore          4
        //   181: fload_2        
        //   182: fload_3        
        //   183: fload           4
        //   185: getstatic       dev/nuker/pyro/fc.0:I
        //   188: ifeq            196
        //   191: ldc             -175885780
        //   193: goto            198
        //   196: ldc             -2033249367
        //   198: ldc             1399481359
        //   200: ixor           
        //   201: lookupswitch {
        //          -1494329821: 196
        //          -710576218: 228
        //          default: 1363
        //        }
        //   228: goto            232
        //   231: athrow         
        //   232: invokestatic    java/lang/Math.min:(FF)F
        //   235: goto            239
        //   238: athrow         
        //   239: goto            243
        //   242: athrow         
        //   243: invokestatic    java/lang/Math.min:(FF)F
        //   246: goto            250
        //   249: athrow         
        //   250: fstore          5
        //   252: fload_2        
        //   253: getstatic       dev/nuker/pyro/fc.c:I
        //   256: ifge            264
        //   259: ldc             -1273675009
        //   261: goto            266
        //   264: ldc             -1324419130
        //   266: ldc             -1559763232
        //   268: ixor           
        //   269: lookupswitch {
        //          380240456: 264
        //          387097631: 1365
        //          default: 296
        //        }
        //   296: fload_3        
        //   297: fload           4
        //   299: goto            303
        //   302: athrow         
        //   303: invokestatic    java/lang/Math.max:(FF)F
        //   306: goto            310
        //   309: athrow         
        //   310: goto            314
        //   313: athrow         
        //   314: invokestatic    java/lang/Math.max:(FF)F
        //   317: goto            321
        //   320: athrow         
        //   321: fstore          6
        //   323: fconst_0       
        //   324: getstatic       dev/nuker/pyro/fc.c:I
        //   327: ifge            335
        //   330: ldc             759024016
        //   332: goto            337
        //   335: ldc             208673000
        //   337: ldc             902949015
        //   339: ixor           
        //   340: lookupswitch {
        //          418128135: 335
        //          966914175: 368
        //          default: 1379
        //        }
        //   368: fstore          7
        //   370: fload           6
        //   372: getstatic       dev/nuker/pyro/fc.1:I
        //   375: ifeq            383
        //   378: ldc             1754466225
        //   380: goto            385
        //   383: ldc             -1274557513
        //   385: ldc             1530172001
        //   387: ixor           
        //   388: lookupswitch {
        //          -2064516753: 383
        //          866620880: 1369
        //          default: 416
        //        }
        //   416: fload           5
        //   418: fcmpl          
        //   419: ifne            473
        //   422: fconst_0       
        //   423: fstore          7
        //   425: fload           6
        //   427: getstatic       dev/nuker/pyro/fc.0:I
        //   430: ifeq            438
        //   433: ldc             6269278
        //   435: goto            440
        //   438: ldc             -2031440406
        //   440: ldc             -769452675
        //   442: ixor           
        //   443: lookupswitch {
        //          -763577309: 438
        //          1422506135: 468
        //          default: 1361
        //        }
        //   468: fstore          8
        //   470: goto            928
        //   473: fload           6
        //   475: fload_2        
        //   476: fcmpl          
        //   477: ifne            485
        //   480: ldc             -1441276331
        //   482: goto            487
        //   485: ldc             -1441276332
        //   487: ldc             82437693
        //   489: ixor           
        //   490: tableswitch {
        //          1576825040: 512
        //          1576825041: 625
        //          default: 480
        //        }
        //   512: ldc             60.0
        //   514: fload_3        
        //   515: fload           4
        //   517: fsub           
        //   518: fmul           
        //   519: fload           6
        //   521: fload           5
        //   523: fsub           
        //   524: fdiv           
        //   525: ldc             360.0
        //   527: fadd           
        //   528: ldc             360.0
        //   530: frem           
        //   531: getstatic       dev/nuker/pyro/fc.0:I
        //   534: ifeq            542
        //   537: ldc             -1084604345
        //   539: goto            544
        //   542: ldc             -736033131
        //   544: ldc             602906241
        //   546: ixor           
        //   547: lookupswitch {
        //          -1665802554: 1373
        //          -1319700111: 542
        //          default: 572
        //        }
        //   572: fstore          7
        //   574: fload           6
        //   576: getstatic       dev/nuker/pyro/fc.c:I
        //   579: ifge            587
        //   582: ldc             -1541495248
        //   584: goto            589
        //   587: ldc             -1832824168
        //   589: ldc             -2076480261
        //   591: ixor           
        //   592: lookupswitch {
        //          539347659: 1377
        //          1447802473: 587
        //          default: 620
        //        }
        //   620: fstore          8
        //   622: goto            928
        //   625: fload           6
        //   627: getstatic       dev/nuker/pyro/fc.c:I
        //   630: ifge            638
        //   633: ldc             -147038232
        //   635: goto            640
        //   638: ldc             -1681714477
        //   640: ldc             -883924852
        //   642: ixor           
        //   643: lookupswitch {
        //          1013727076: 638
        //          1351840351: 668
        //          default: 1375
        //        }
        //   668: fload_3        
        //   669: fcmpl          
        //   670: ifne            678
        //   673: ldc             264351010
        //   675: goto            680
        //   678: ldc             264351011
        //   680: ldc             -1529134668
        //   682: ixor           
        //   683: tableswitch {
        //          1446369580: 704
        //          1446369581: 771
        //          default: 673
        //        }
        //   704: ldc             60.0
        //   706: fload           4
        //   708: fload_2        
        //   709: fsub           
        //   710: fmul           
        //   711: fload           6
        //   713: fload           5
        //   715: fsub           
        //   716: fdiv           
        //   717: ldc             120.0
        //   719: fadd           
        //   720: fstore          7
        //   722: getstatic       dev/nuker/pyro/fc.1:I
        //   725: ifeq            733
        //   728: ldc             -233889444
        //   730: goto            735
        //   733: ldc             1359410949
        //   735: ldc_w           459973945
        //   738: ixor           
        //   739: lookupswitch {
        //          -379222939: 733
        //          1248612924: 764
        //          default: 1359
        //        }
        //   764: fload           6
        //   766: fstore          8
        //   768: goto            928
        //   771: fload           6
        //   773: fload           4
        //   775: fcmpl          
        //   776: ifne            785
        //   779: ldc_w           -4491475
        //   782: goto            788
        //   785: ldc_w           -4491476
        //   788: ldc_w           -576497641
        //   791: ixor           
        //   792: tableswitch {
        //          1144020596: 816
        //          1144020597: 880
        //          default: 779
        //        }
        //   816: ldc             60.0
        //   818: getstatic       dev/nuker/pyro/fc.c:I
        //   821: ifge            830
        //   824: ldc_w           -1952817378
        //   827: goto            833
        //   830: ldc_w           699159680
        //   833: ldc_w           481167783
        //   836: ixor           
        //   837: lookupswitch {
        //          -1758177607: 1347
        //          -1721208698: 830
        //          default: 864
        //        }
        //   864: fload_2        
        //   865: fload_3        
        //   866: fsub           
        //   867: fmul           
        //   868: fload           6
        //   870: fload           5
        //   872: fsub           
        //   873: fdiv           
        //   874: ldc_w           240.0
        //   877: fadd           
        //   878: fstore          7
        //   880: getstatic       dev/nuker/pyro/fc.c:I
        //   883: ifge            892
        //   886: ldc_w           -1886159606
        //   889: goto            895
        //   892: ldc_w           1242653745
        //   895: ldc_w           1609051306
        //   898: ixor           
        //   899: lookupswitch {
        //          -797224544: 1381
        //          477100944: 892
        //          default: 924
        //        }
        //   924: fload           6
        //   926: fstore          8
        //   928: fload           8
        //   930: fload           5
        //   932: fadd           
        //   933: fconst_2       
        //   934: fdiv           
        //   935: getstatic       dev/nuker/pyro/fc.0:I
        //   938: ifeq            947
        //   941: ldc_w           -620438056
        //   944: goto            950
        //   947: ldc_w           -1384120289
        //   950: ldc_w           1310355433
        //   953: ixor           
        //   954: lookupswitch {
        //          -1793150415: 1349
        //          -517545154: 947
        //          default: 980
        //        }
        //   980: fstore          9
        //   982: fload           6
        //   984: fload           5
        //   986: fcmpl          
        //   987: ifne            996
        //   990: fconst_0       
        //   991: fstore          10
        //   993: goto            1273
        //   996: getstatic       dev/nuker/pyro/fc.0:I
        //   999: ifeq            1008
        //  1002: ldc_w           762051420
        //  1005: goto            1011
        //  1008: ldc_w           -730267819
        //  1011: ldc_w           -1243459246
        //  1014: ixor           
        //  1015: lookupswitch {
        //          -1735808498: 1008
        //          1637527047: 1040
        //          default: 1351
        //        }
        //  1040: fload           9
        //  1042: ldc_w           0.5
        //  1045: getstatic       dev/nuker/pyro/fc.0:I
        //  1048: ifeq            1057
        //  1051: ldc_w           -802351890
        //  1054: goto            1060
        //  1057: ldc_w           19430222
        //  1060: ldc_w           -1219566631
        //  1063: ixor           
        //  1064: lookupswitch {
        //          -1234790249: 1092
        //          1734604599: 1057
        //          default: 1357
        //        }
        //  1092: goto            1096
        //  1095: athrow         
        //  1096: invokestatic    dev/nuker/pyro/fbI.c:(FF)F
        //  1099: goto            1103
        //  1102: athrow         
        //  1103: fstore          11
        //  1105: fload           6
        //  1107: fstore          12
        //  1109: fload           11
        //  1111: fconst_0       
        //  1112: fcmpg          
        //  1113: ifgt            1122
        //  1116: ldc_w           724838459
        //  1119: goto            1125
        //  1122: ldc_w           724838456
        //  1125: ldc_w           -1954626974
        //  1128: ixor           
        //  1129: tableswitch {
        //          1083561138: 1152
        //          1083561139: 1258
        //          default: 1116
        //        }
        //  1152: getstatic       dev/nuker/pyro/fc.1:I
        //  1155: ifeq            1164
        //  1158: ldc_w           -671246756
        //  1161: goto            1167
        //  1164: ldc_w           -1830700520
        //  1167: ldc_w           690505038
        //  1170: ixor           
        //  1171: lookupswitch {
        //          -366643624: 1164
        //          -19541230: 1353
        //          default: 1196
        //        }
        //  1196: fload           12
        //  1198: getstatic       dev/nuker/pyro/fc.1:I
        //  1201: ifeq            1210
        //  1204: ldc_w           1684284895
        //  1207: goto            1213
        //  1210: ldc_w           444824241
        //  1213: ldc_w           -612503931
        //  1216: ixor           
        //  1217: lookupswitch {
        //          -1088828582: 1371
        //          133943828: 1210
        //          default: 1244
        //        }
        //  1244: fload           5
        //  1246: fsub           
        //  1247: fload           6
        //  1249: fload           5
        //  1251: fadd           
        //  1252: fdiv           
        //  1253: fstore          10
        //  1255: goto            1273
        //  1258: fload           12
        //  1260: fload           5
        //  1262: fsub           
        //  1263: fconst_2       
        //  1264: fload           6
        //  1266: fsub           
        //  1267: fload           5
        //  1269: fsub           
        //  1270: fdiv           
        //  1271: fstore          10
        //  1273: iconst_3       
        //  1274: newarray        F
        //  1276: dup            
        //  1277: iconst_0       
        //  1278: fload           7
        //  1280: fastore        
        //  1281: dup            
        //  1282: iconst_1       
        //  1283: getstatic       dev/nuker/pyro/fc.0:I
        //  1286: ifeq            1295
        //  1289: ldc_w           1991013360
        //  1292: goto            1298
        //  1295: ldc_w           1417606220
        //  1298: ldc_w           390266191
        //  1301: ixor           
        //  1302: lookupswitch {
        //          -1182342948: 1295
        //          1643024063: 1343
        //          default: 1328
        //        }
        //  1328: fload           10
        //  1330: ldc             100.0
        //  1332: fmul           
        //  1333: fastore        
        //  1334: dup            
        //  1335: iconst_2       
        //  1336: fload           9
        //  1338: ldc             100.0
        //  1340: fmul           
        //  1341: fastore        
        //  1342: areturn        
        //  1343: aconst_null    
        //  1344: athrow         
        //  1345: aconst_null    
        //  1346: athrow         
        //  1347: aconst_null    
        //  1348: athrow         
        //  1349: aconst_null    
        //  1350: athrow         
        //  1351: aconst_null    
        //  1352: athrow         
        //  1353: aconst_null    
        //  1354: athrow         
        //  1355: aconst_null    
        //  1356: athrow         
        //  1357: aconst_null    
        //  1358: athrow         
        //  1359: aconst_null    
        //  1360: athrow         
        //  1361: aconst_null    
        //  1362: athrow         
        //  1363: aconst_null    
        //  1364: athrow         
        //  1365: aconst_null    
        //  1366: athrow         
        //  1367: aconst_null    
        //  1368: athrow         
        //  1369: aconst_null    
        //  1370: athrow         
        //  1371: aconst_null    
        //  1372: athrow         
        //  1373: aconst_null    
        //  1374: athrow         
        //  1375: aconst_null    
        //  1376: athrow         
        //  1377: aconst_null    
        //  1378: athrow         
        //  1379: aconst_null    
        //  1380: athrow         
        //  1381: aconst_null    
        //  1382: athrow         
        //  1383: pop            
        //  1384: goto            24
        //  1387: pop            
        //  1388: aconst_null    
        //  1389: goto            1383
        //  1392: dup            
        //  1393: ifnull          1383
        //  1396: checkcast       Ljava/lang/Throwable;
        //  1399: athrow         
        //  1400: dup            
        //  1401: ifnull          1387
        //  1404: checkcast       Ljava/lang/Throwable;
        //  1407: athrow         
        //  1408: aconst_null    
        //  1409: athrow         
        //    StackMapTable: 00 89 43 07 00 18 04 FF 00 0B 00 00 00 01 07 00 18 FC 00 03 07 00 1E 44 07 00 18 FF 00 00 00 01 07 00 1E 00 02 07 00 1E 05 45 07 00 18 40 07 00 1C FF 00 0E 00 02 07 00 1E 07 00 1C 00 01 02 FF 00 01 00 02 07 00 1E 07 00 1C 00 02 02 01 5D 02 FC 00 0B 02 41 01 1D FC 00 0E 02 41 01 1E FF 00 13 00 05 07 00 1E 07 00 1C 02 02 02 00 03 02 02 02 FF 00 01 00 05 07 00 1E 07 00 1C 02 02 02 00 04 02 02 02 01 FF 00 1D 00 05 07 00 1E 07 00 1C 02 02 02 00 03 02 02 02 FF 00 02 00 00 00 01 07 00 18 FF 00 00 00 05 07 00 1E 07 00 1C 02 02 02 00 03 02 02 02 45 07 00 18 FF 00 00 00 05 07 00 1E 07 00 1C 02 02 02 00 02 02 02 42 07 00 32 FF 00 00 00 05 07 00 1E 07 00 1C 02 02 02 00 02 02 02 45 07 00 18 40 02 FF 00 0D 00 06 07 00 1E 07 00 1C 02 02 02 02 00 01 02 FF 00 01 00 06 07 00 1E 07 00 1C 02 02 02 02 00 02 02 01 5D 02 45 07 00 0E FF 00 00 00 06 07 00 1E 07 00 1C 02 02 02 02 00 03 02 02 02 45 07 00 18 FF 00 00 00 06 07 00 1E 07 00 1C 02 02 02 02 00 02 02 02 42 07 00 30 FF 00 00 00 06 07 00 1E 07 00 1C 02 02 02 02 00 02 02 02 45 07 00 18 40 02 FF 00 0D 00 07 07 00 1E 07 00 1C 02 02 02 02 02 00 01 02 FF 00 01 00 07 07 00 1E 07 00 1C 02 02 02 02 02 00 02 02 01 5E 02 FF 00 0E 00 08 07 00 1E 07 00 1C 02 02 02 02 02 02 00 01 02 FF 00 01 00 08 07 00 1E 07 00 1C 02 02 02 02 02 02 00 02 02 01 5E 02 55 02 FF 00 01 00 08 07 00 1E 07 00 1C 02 02 02 02 02 02 00 02 02 01 5B 02 04 06 04 41 01 18 5D 02 FF 00 01 00 08 07 00 1E 07 00 1C 02 02 02 02 02 02 00 02 02 01 5B 02 4E 02 FF 00 01 00 08 07 00 1E 07 00 1C 02 02 02 02 02 02 00 02 02 01 5E 02 04 4C 02 FF 00 01 00 08 07 00 1E 07 00 1C 02 02 02 02 02 02 00 02 02 01 5B 02 04 04 41 01 17 1C 41 01 1C 06 07 05 42 01 1B 4D 02 FF 00 02 00 08 07 00 1E 07 00 1C 02 02 02 02 02 02 00 02 02 01 5E 02 0F 0B 42 01 1C FC 00 03 02 52 02 FF 00 02 00 09 07 00 1E 07 00 1C 02 02 02 02 02 02 02 00 02 02 01 5D 02 FC 00 0F 02 0B 42 01 1C FF 00 10 00 0A 07 00 1E 07 00 1C 02 02 02 02 02 02 02 02 00 02 02 02 FF 00 02 00 0A 07 00 1E 07 00 1C 02 02 02 02 02 02 02 02 00 03 02 02 01 FF 00 1F 00 0A 07 00 1E 07 00 1C 02 02 02 02 02 02 02 02 00 02 02 02 42 07 00 18 FF 00 00 00 0A 07 00 1E 07 00 1C 02 02 02 02 02 02 02 02 00 02 02 02 45 07 00 18 40 02 FE 00 0C 00 02 02 05 42 01 1A 0B 42 01 1C 4D 02 FF 00 02 00 0D 07 00 1E 07 00 1C 02 02 02 02 02 02 02 02 00 02 02 00 02 02 01 5E 02 0D FF 00 0E 00 0B 07 00 1E 07 00 1C 02 02 02 02 02 02 02 02 02 00 00 FF 00 15 00 0B 07 00 1E 07 00 1C 02 02 02 02 02 02 02 02 02 00 03 07 00 1C 07 00 1C 01 FF 00 02 00 0B 07 00 1E 07 00 1C 02 02 02 02 02 02 02 02 02 00 04 07 00 1C 07 00 1C 01 01 FF 00 1D 00 0B 07 00 1E 07 00 1C 02 02 02 02 02 02 02 02 02 00 03 07 00 1C 07 00 1C 01 FF 00 0E 00 0B 07 00 1E 07 00 1C 02 02 02 02 02 02 02 02 02 00 03 07 00 1C 07 00 1C 01 FF 00 01 00 03 07 00 1E 07 00 1C 02 00 00 FF 00 01 00 08 07 00 1E 07 00 1C 02 02 02 02 02 02 00 01 02 FF 00 01 00 09 07 00 1E 07 00 1C 02 02 02 02 02 02 02 00 01 02 FC 00 01 02 FE 00 01 00 02 02 FF 00 01 00 04 07 00 1E 07 00 1C 02 02 00 00 FF 00 01 00 0A 07 00 1E 07 00 1C 02 02 02 02 02 02 02 02 00 02 02 02 F9 00 01 41 02 FF 00 01 00 05 07 00 1E 07 00 1C 02 02 02 00 03 02 02 02 FF 00 01 00 06 07 00 1E 07 00 1C 02 02 02 02 00 01 02 FF 00 01 00 02 07 00 1E 07 00 1C 00 01 02 FF 00 01 00 08 07 00 1E 07 00 1C 02 02 02 02 02 02 00 01 02 FF 00 01 00 0D 07 00 1E 07 00 1C 02 02 02 02 02 02 02 02 00 02 02 00 01 02 FF 00 01 00 08 07 00 1E 07 00 1C 02 02 02 02 02 02 00 01 02 41 02 41 02 FF 00 01 00 07 07 00 1E 07 00 1C 02 02 02 02 02 00 01 02 FC 00 01 02 FF 00 01 00 01 07 00 1E 00 01 07 00 18 43 05 44 07 00 18 47 05 47 07 00 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1392   1400   Ljava/lang/IllegalArgumentException;
        //  1392   1400   1392   1400   Any
        //  1408   1410   3      8      Ljava/util/NoSuchElementException;
        //  29     36     36     37     Any
        //  29     36     36     37     Ljava/util/ConcurrentModificationException;
        //  30     36     3      8      Any
        //  30     36     36     37     Any
        //  30     36     29     30     Any
        //  232    238    238    239    Any
        //  232    238    238    239    Any
        //  232    238    3      8      Ljava/lang/NegativeArraySizeException;
        //  232    238    238    239    Any
        //  232    238    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  242    249    249    250    Any
        //  243    249    3      8      Ljava/lang/NumberFormatException;
        //  243    249    242    243    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  242    249    249    250    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  243    249    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  302    309    309    310    Any
        //  303    309    309    310    Any
        //  302    309    309    310    Ljava/lang/AssertionError;
        //  303    309    302    303    Ljava/lang/IllegalStateException;
        //  302    309    309    310    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  313    320    320    321    Any
        //  313    320    3      8      Any
        //  313    320    313    314    Ljava/lang/IndexOutOfBoundsException;
        //  314    320    320    321    Any
        //  313    320    3      8      Any
        //  1095   1102   1102   1103   Any
        //  1095   1102   1095   1096   Any
        //  1095   1102   1102   1103   Ljava/lang/AssertionError;
        //  1096   1102   1102   1103   Any
        //  1096   1102   1102   1103   Any
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
    
    public static float c(final float n, final float n2) {
        return fbS.1L(null, 1413122495, n, n2);
    }
    
    public static Color c(final float p0, final float p1, final float p2, final float p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1314
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1306
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1298
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           -20073115
        //    33: goto            39
        //    36: ldc_w           -2103393515
        //    39: ldc_w           1494604731
        //    42: ixor           
        //    43: lookupswitch {
        //          -1478988066: 1267
        //          -553817583: 36
        //          default: 68
        //        }
        //    68: fload_1        
        //    69: fconst_0       
        //    70: fcmpg          
        //    71: iflt            116
        //    74: fload_1        
        //    75: ldc             100.0
        //    77: fcmpl          
        //    78: ifle            87
        //    81: ldc_w           -1308703514
        //    84: goto            90
        //    87: ldc_w           -1308703513
        //    90: ldc_w           659393280
        //    93: ixor           
        //    94: tableswitch {
        //          761700300: 116
        //          761700301: 146
        //          default: 81
        //        }
        //   116: new             Ljava/lang/IllegalArgumentException;
        //   119: dup            
        //   120: ldc_w           "\u2926\u149c\u8018\ub1c7\uc46b\ue743\ub234\uec38\udb6b\ue40b\uadce\u1e49\ueb09\uc7b3\u8c9f\u83d8\u57ab\u7de9\ubf38\ucda5\u21fe\uc23f\u60f1\u2f07\uda67\u3f66\u7d6b\u8352\u8218\u813d\u8e40\ufb31\u7a3f\u9802\u163b\ufbc2\u496e\u8299\uc899\uf29a\ubc38\u41b3\ub340\ub119\u41fc\u8011\u7c7d\uc4c9\u7f4d\ue779\uec29\u16d1\ue4a0\u3591"
        //   123: goto            127
        //   126: athrow         
        //   127: invokestatic    invokestatic   !!! ERROR
        //   130: goto            134
        //   133: athrow         
        //   134: goto            138
        //   137: athrow         
        //   138: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   141: goto            145
        //   144: athrow         
        //   145: athrow         
        //   146: fload_2        
        //   147: fconst_0       
        //   148: fcmpg          
        //   149: iflt            196
        //   152: fload_2        
        //   153: ldc             100.0
        //   155: fcmpl          
        //   156: ifle            165
        //   159: ldc_w           1096530819
        //   162: goto            168
        //   165: ldc_w           1096530818
        //   168: ldc_w           669817465
        //   171: ixor           
        //   172: tableswitch {
        //          -848411660: 196
        //          -848411659: 226
        //          default: 159
        //        }
        //   196: new             Ljava/lang/IllegalArgumentException;
        //   199: dup            
        //   200: ldc_w           "\u2926\u149c\u8018\ub1c7\uc46b\ue743\ub234\uec38\udb6b\ue40b\uadce\u1e49\ueb09\uc7b3\u8c9f\u83d8\u57ab\u7de9\ubf38\ucda5\u21fe\uc23f\u60f1\u2f07\uda67\u3f66\u7d6b\u8352\u8218\u813d\u8e40\ufb31\u7a3f\u9802\u163b\ufbc2\u496e\u8299\uc899\uf29a\ubc38\u41b3\ub340\ub119\u41e3\u8019\u7c6e\uc4d4\u7f4b\ue776\uec38\u16cb\ue4bc"
        //   203: goto            207
        //   206: athrow         
        //   207: invokestatic    invokestatic   !!! ERROR
        //   210: goto            214
        //   213: athrow         
        //   214: goto            218
        //   217: athrow         
        //   218: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   221: goto            225
        //   224: athrow         
        //   225: athrow         
        //   226: getstatic       dev/nuker/pyro/fc.0:I
        //   229: ifeq            238
        //   232: ldc_w           -503699393
        //   235: goto            241
        //   238: ldc_w           685919491
        //   241: ldc_w           1669882717
        //   244: ixor           
        //   245: lookupswitch {
        //          -2106438814: 1271
        //          -81500565: 238
        //          default: 272
        //        }
        //   272: fload_3        
        //   273: fconst_0       
        //   274: fcmpg          
        //   275: iflt            284
        //   278: fload_3        
        //   279: fconst_1       
        //   280: fcmpl          
        //   281: ifle            314
        //   284: new             Ljava/lang/IllegalArgumentException;
        //   287: dup            
        //   288: ldc_w           "\u2926\u149c\u8018\ub1c7\uc46b\ue743\ub234\uec38\udb6b\ue40b\uadce\u1e49\ueb09\uc7b3\u8c9f\u83d8\u57ab\u7de9\ubf38\ucda5\u21fe\uc23f\u60f1\u2f07\uda67\u3f66\u7d6b\u8352\u8218\u813d\u8e40\ufb31\u7a3f\u9802\u163b\ufbc2\u496e\u8299\uc899\uf29a\ubc38\u41b3\ub340\ub119\u41ee\u801c\u7c79\uc4d4\u7f5e"
        //   291: goto            295
        //   294: athrow         
        //   295: invokestatic    invokestatic   !!! ERROR
        //   298: goto            302
        //   301: athrow         
        //   302: goto            306
        //   305: athrow         
        //   306: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   309: goto            313
        //   312: athrow         
        //   313: athrow         
        //   314: fload_0        
        //   315: ldc             360.0
        //   317: frem           
        //   318: dup            
        //   319: fstore_0       
        //   320: ldc             360.0
        //   322: fdiv           
        //   323: fstore_0       
        //   324: getstatic       dev/nuker/pyro/fc.1:I
        //   327: ifeq            336
        //   330: ldc_w           783572932
        //   333: goto            339
        //   336: ldc_w           1589151904
        //   339: ldc_w           -1182688322
        //   342: ixor           
        //   343: lookupswitch {
        //          -1758083974: 336
        //          -415689954: 368
        //          default: 1265
        //        }
        //   368: fload_1        
        //   369: ldc             100.0
        //   371: fdiv           
        //   372: fstore_1       
        //   373: fload_2        
        //   374: ldc             100.0
        //   376: fdiv           
        //   377: fstore_2       
        //   378: fload_2        
        //   379: f2d            
        //   380: dconst_0       
        //   381: dcmpg          
        //   382: ifge            441
        //   385: fload_2        
        //   386: fconst_1       
        //   387: fload_1        
        //   388: fadd           
        //   389: fmul           
        //   390: getstatic       dev/nuker/pyro/fc.0:I
        //   393: ifeq            402
        //   396: ldc_w           750514118
        //   399: goto            405
        //   402: ldc_w           -1151135427
        //   405: ldc_w           -610972188
        //   408: ixor           
        //   409: lookupswitch {
        //          -147938782: 402
        //          1626758361: 436
        //          default: 1253
        //        }
        //   436: fstore          4
        //   438: goto            450
        //   441: fload_2        
        //   442: fload_1        
        //   443: fadd           
        //   444: fload_1        
        //   445: fload_2        
        //   446: fmul           
        //   447: fsub           
        //   448: fstore          4
        //   450: fconst_2       
        //   451: fload_2        
        //   452: fmul           
        //   453: fload           4
        //   455: fsub           
        //   456: getstatic       dev/nuker/pyro/fc.1:I
        //   459: ifeq            468
        //   462: ldc_w           -1717601449
        //   465: goto            471
        //   468: ldc_w           -648442032
        //   471: ldc_w           1966371762
        //   474: ixor           
        //   475: lookupswitch {
        //          -1402077982: 500
        //          -324335387: 468
        //          default: 1263
        //        }
        //   500: fstore_1       
        //   501: fconst_0       
        //   502: getstatic       dev/nuker/pyro/fc.0:I
        //   505: ifeq            514
        //   508: ldc_w           -1196079427
        //   511: goto            517
        //   514: ldc_w           -1303123053
        //   517: ldc_w           706055140
        //   520: ixor           
        //   521: lookupswitch {
        //          -1834955431: 514
        //          -1740218249: 548
        //          default: 1273
        //        }
        //   548: fload_1        
        //   549: getstatic       dev/nuker/pyro/fc.0:I
        //   552: ifeq            561
        //   555: ldc_w           749699558
        //   558: goto            564
        //   561: ldc_w           923719023
        //   564: ldc_w           -1023652132
        //   567: ixor           
        //   568: lookupswitch {
        //          -296497350: 561
        //          -168649805: 596
        //          default: 1255
        //        }
        //   596: fload           4
        //   598: getstatic       dev/nuker/pyro/fc.c:I
        //   601: ifge            610
        //   604: ldc_w           -1797764891
        //   607: goto            613
        //   610: ldc_w           797301872
        //   613: ldc_w           764601311
        //   616: ixor           
        //   617: lookupswitch {
        //          -1186288838: 1283
        //          291666947: 610
        //          default: 644
        //        }
        //   644: fload_0        
        //   645: ldc_w           0.33333334
        //   648: fadd           
        //   649: getstatic       dev/nuker/pyro/fc.c:I
        //   652: ifge            661
        //   655: ldc_w           -2136064320
        //   658: goto            664
        //   661: ldc_w           -931727393
        //   664: ldc_w           556260086
        //   667: ixor           
        //   668: lookupswitch {
        //          -1584798666: 1277
        //          -1325392072: 661
        //          default: 696
        //        }
        //   696: goto            700
        //   699: athrow         
        //   700: invokestatic    dev/nuker/pyro/fbI.c:(FFF)F
        //   703: goto            707
        //   706: athrow         
        //   707: goto            711
        //   710: athrow         
        //   711: invokestatic    java/lang/Math.max:(FF)F
        //   714: goto            718
        //   717: athrow         
        //   718: getstatic       dev/nuker/pyro/fc.1:I
        //   721: ifeq            730
        //   724: ldc_w           -804686433
        //   727: goto            733
        //   730: ldc_w           -1732523252
        //   733: ldc_w           1897098448
        //   736: ixor           
        //   737: lookupswitch {
        //          -1592125105: 730
        //          -374822948: 764
        //          default: 1269
        //        }
        //   764: fstore_2       
        //   765: fconst_0       
        //   766: fload_1        
        //   767: fload           4
        //   769: getstatic       dev/nuker/pyro/fc.0:I
        //   772: ifeq            781
        //   775: ldc_w           -220927824
        //   778: goto            784
        //   781: ldc_w           1836859052
        //   784: ldc_w           275809085
        //   787: ixor           
        //   788: lookupswitch {
        //          -492541043: 781
        //          2097986961: 816
        //          default: 1259
        //        }
        //   816: fload_0        
        //   817: goto            821
        //   820: athrow         
        //   821: invokestatic    dev/nuker/pyro/fbI.c:(FFF)F
        //   824: goto            828
        //   827: athrow         
        //   828: goto            832
        //   831: athrow         
        //   832: invokestatic    java/lang/Math.max:(FF)F
        //   835: goto            839
        //   838: athrow         
        //   839: fstore          5
        //   841: fconst_0       
        //   842: getstatic       dev/nuker/pyro/fc.c:I
        //   845: ifge            854
        //   848: ldc_w           1603670245
        //   851: goto            857
        //   854: ldc_w           510531307
        //   857: ldc_w           332551972
        //   860: ixor           
        //   861: lookupswitch {
        //          1279543233: 1279
        //          1493812371: 854
        //          default: 888
        //        }
        //   888: fload_1        
        //   889: fload           4
        //   891: fload_0        
        //   892: ldc_w           0.33333334
        //   895: fsub           
        //   896: getstatic       dev/nuker/pyro/fc.c:I
        //   899: ifge            908
        //   902: ldc_w           -479712154
        //   905: goto            911
        //   908: ldc_w           -324256692
        //   911: ldc_w           -1934998119
        //   914: ixor           
        //   915: lookupswitch {
        //          1233266804: 908
        //          1875012095: 1285
        //          default: 940
        //        }
        //   940: goto            944
        //   943: athrow         
        //   944: invokestatic    dev/nuker/pyro/fbI.c:(FFF)F
        //   947: goto            951
        //   950: athrow         
        //   951: goto            955
        //   954: athrow         
        //   955: invokestatic    java/lang/Math.max:(FF)F
        //   958: goto            962
        //   961: athrow         
        //   962: getstatic       dev/nuker/pyro/fc.1:I
        //   965: ifeq            974
        //   968: ldc_w           217134174
        //   971: goto            977
        //   974: ldc_w           2036105024
        //   977: ldc_w           577376533
        //   980: ixor           
        //   981: lookupswitch {
        //          781919563: 974
        //          1530293845: 1008
        //          default: 1275
        //        }
        //  1008: fstore_1       
        //  1009: fload_2        
        //  1010: fconst_1       
        //  1011: goto            1015
        //  1014: athrow         
        //  1015: invokestatic    java/lang/Math.min:(FF)F
        //  1018: goto            1022
        //  1021: athrow         
        //  1022: fstore_2       
        //  1023: getstatic       dev/nuker/pyro/fc.0:I
        //  1026: ifeq            1035
        //  1029: ldc_w           -1874098107
        //  1032: goto            1038
        //  1035: ldc_w           1535024934
        //  1038: ldc_w           210995715
        //  1041: ixor           
        //  1042: lookupswitch {
        //          -1663565242: 1257
        //          639505111: 1035
        //          default: 1068
        //        }
        //  1068: fload           5
        //  1070: fconst_1       
        //  1071: goto            1075
        //  1074: athrow         
        //  1075: invokestatic    java/lang/Math.min:(FF)F
        //  1078: goto            1082
        //  1081: athrow         
        //  1082: fstore          6
        //  1084: getstatic       dev/nuker/pyro/fc.c:I
        //  1087: ifge            1096
        //  1090: ldc_w           -2103993255
        //  1093: goto            1099
        //  1096: ldc_w           -996515342
        //  1099: ldc_w           -1432459285
        //  1102: ixor           
        //  1103: lookupswitch {
        //          671742898: 1096
        //          1845757465: 1128
        //          default: 1261
        //        }
        //  1128: fload_1        
        //  1129: fconst_1       
        //  1130: goto            1134
        //  1133: athrow         
        //  1134: invokestatic    java/lang/Math.min:(FF)F
        //  1137: goto            1141
        //  1140: athrow         
        //  1141: fstore_1       
        //  1142: new             Ljava/awt/Color;
        //  1145: dup            
        //  1146: getstatic       dev/nuker/pyro/fc.1:I
        //  1149: ifeq            1158
        //  1152: ldc_w           1041930655
        //  1155: goto            1161
        //  1158: ldc_w           -270267900
        //  1161: ldc_w           -388491007
        //  1164: ixor           
        //  1165: lookupswitch {
        //          -691896162: 1158
        //          121377541: 1192
        //          default: 1281
        //        }
        //  1192: fload_2        
        //  1193: fload           6
        //  1195: fload_1        
        //  1196: getstatic       dev/nuker/pyro/fc.1:I
        //  1199: ifeq            1208
        //  1202: ldc_w           1405835735
        //  1205: goto            1211
        //  1208: ldc_w           8098129
        //  1211: ldc_w           -1389506464
        //  1214: ixor           
        //  1215: lookupswitch {
        //          -1386856143: 1240
        //          -18445897: 1208
        //          default: 1287
        //        }
        //  1240: fload_3        
        //  1241: goto            1245
        //  1244: athrow         
        //  1245: invokespecial   java/awt/Color.<init>:(FFFF)V
        //  1248: goto            1252
        //  1251: athrow         
        //  1252: areturn        
        //  1253: aconst_null    
        //  1254: athrow         
        //  1255: aconst_null    
        //  1256: athrow         
        //  1257: aconst_null    
        //  1258: athrow         
        //  1259: aconst_null    
        //  1260: athrow         
        //  1261: aconst_null    
        //  1262: athrow         
        //  1263: aconst_null    
        //  1264: athrow         
        //  1265: aconst_null    
        //  1266: athrow         
        //  1267: aconst_null    
        //  1268: athrow         
        //  1269: aconst_null    
        //  1270: athrow         
        //  1271: aconst_null    
        //  1272: athrow         
        //  1273: aconst_null    
        //  1274: athrow         
        //  1275: aconst_null    
        //  1276: athrow         
        //  1277: aconst_null    
        //  1278: athrow         
        //  1279: aconst_null    
        //  1280: athrow         
        //  1281: aconst_null    
        //  1282: athrow         
        //  1283: aconst_null    
        //  1284: athrow         
        //  1285: aconst_null    
        //  1286: athrow         
        //  1287: aconst_null    
        //  1288: athrow         
        //  1289: pop            
        //  1290: goto            24
        //  1293: pop            
        //  1294: aconst_null    
        //  1295: goto            1289
        //  1298: dup            
        //  1299: ifnull          1289
        //  1302: checkcast       Ljava/lang/Throwable;
        //  1305: athrow         
        //  1306: dup            
        //  1307: ifnull          1293
        //  1310: checkcast       Ljava/lang/Throwable;
        //  1313: athrow         
        //  1314: aconst_null    
        //  1315: athrow         
        //    StackMapTable: 00 9F 43 07 00 18 04 FF 00 0B 00 00 00 01 07 00 18 FF 00 03 00 04 02 02 02 02 00 00 0B 42 01 1C 0C 05 42 01 19 49 07 00 36 FF 00 00 00 04 02 02 02 02 00 03 08 00 74 08 00 74 07 00 86 45 07 00 18 FF 00 00 00 04 02 02 02 02 00 03 08 00 74 08 00 74 07 00 86 FF 00 02 00 00 00 01 07 00 18 FF 00 00 00 04 02 02 02 02 00 03 08 00 74 08 00 74 07 00 86 45 07 00 18 40 07 00 CC 00 0C 05 42 01 1B 49 07 00 0C FF 00 00 00 04 02 02 02 02 00 03 08 00 C4 08 00 C4 07 00 86 45 07 00 18 FF 00 00 00 04 02 02 02 02 00 03 08 00 C4 08 00 C4 07 00 86 FF 00 02 00 00 00 01 07 00 18 FF 00 00 00 04 02 02 02 02 00 03 08 00 C4 08 00 C4 07 00 86 45 07 00 18 40 07 00 CC 00 0B 42 01 1E 0B 49 07 00 0E FF 00 00 00 04 02 02 02 02 00 03 08 01 1C 08 01 1C 07 00 86 45 07 00 18 FF 00 00 00 04 02 02 02 02 00 03 08 01 1C 08 01 1C 07 00 86 42 07 00 34 FF 00 00 00 04 02 02 02 02 00 03 08 01 1C 08 01 1C 07 00 86 45 07 00 18 40 07 00 CC 00 15 42 01 1C 61 02 FF 00 02 00 04 02 02 02 02 00 02 02 01 5E 02 04 FC 00 08 02 51 02 FF 00 02 00 05 02 02 02 02 02 00 02 02 01 5C 02 4D 02 FF 00 02 00 05 02 02 02 02 02 00 02 02 01 5E 02 FF 00 0C 00 05 02 02 02 02 02 00 02 02 02 FF 00 02 00 05 02 02 02 02 02 00 03 02 02 01 FF 00 1F 00 05 02 02 02 02 02 00 02 02 02 FF 00 0D 00 05 02 02 02 02 02 00 03 02 02 02 FF 00 02 00 05 02 02 02 02 02 00 04 02 02 02 01 FF 00 1E 00 05 02 02 02 02 02 00 03 02 02 02 FF 00 10 00 05 02 02 02 02 02 00 04 02 02 02 02 FF 00 02 00 05 02 02 02 02 02 00 05 02 02 02 02 01 FF 00 1F 00 05 02 02 02 02 02 00 04 02 02 02 02 FF 00 02 00 00 00 01 07 00 18 FF 00 00 00 05 02 02 02 02 02 00 04 02 02 02 02 45 07 00 18 FF 00 00 00 05 02 02 02 02 02 00 02 02 02 42 07 00 10 FF 00 00 00 05 02 02 02 02 02 00 02 02 02 45 07 00 18 40 02 4B 02 FF 00 02 00 05 02 02 02 02 02 00 02 02 01 5E 02 FF 00 10 00 05 02 02 02 02 02 00 03 02 02 02 FF 00 02 00 05 02 02 02 02 02 00 04 02 02 02 01 FF 00 1F 00 05 02 02 02 02 02 00 03 02 02 02 43 07 00 18 FF 00 00 00 05 02 02 02 02 02 00 04 02 02 02 02 45 07 00 18 FF 00 00 00 05 02 02 02 02 02 00 02 02 02 42 07 00 36 FF 00 00 00 05 02 02 02 02 02 00 02 02 02 45 07 00 18 40 02 FF 00 0E 00 06 02 02 02 02 02 02 00 01 02 FF 00 02 00 06 02 02 02 02 02 02 00 02 02 01 5E 02 FF 00 13 00 06 02 02 02 02 02 02 00 04 02 02 02 02 FF 00 02 00 06 02 02 02 02 02 02 00 05 02 02 02 02 01 FF 00 1C 00 06 02 02 02 02 02 02 00 04 02 02 02 02 42 07 00 18 FF 00 00 00 06 02 02 02 02 02 02 00 04 02 02 02 02 45 07 00 18 FF 00 00 00 06 02 02 02 02 02 02 00 02 02 02 42 07 00 36 FF 00 00 00 06 02 02 02 02 02 02 00 02 02 02 45 07 00 18 40 02 4B 02 FF 00 02 00 06 02 02 02 02 02 02 00 02 02 01 5E 02 FF 00 05 00 00 00 01 07 00 18 FF 00 00 00 06 02 02 02 02 02 02 00 02 02 02 45 07 00 18 40 02 0C 42 01 1D 45 07 00 0C FF 00 00 00 06 02 02 02 02 02 02 00 02 02 02 45 07 00 18 40 02 FC 00 0D 02 42 01 1C 44 07 00 18 FF 00 00 00 07 02 02 02 02 02 02 02 00 02 02 02 45 07 00 18 40 02 FF 00 10 00 07 02 02 02 02 02 02 02 00 02 08 04 76 08 04 76 FF 00 02 00 07 02 02 02 02 02 02 02 00 03 08 04 76 08 04 76 01 FF 00 1E 00 07 02 02 02 02 02 02 02 00 02 08 04 76 08 04 76 FF 00 0F 00 07 02 02 02 02 02 02 02 00 05 08 04 76 08 04 76 02 02 02 FF 00 02 00 07 02 02 02 02 02 02 02 00 06 08 04 76 08 04 76 02 02 02 01 FF 00 1C 00 07 02 02 02 02 02 02 02 00 05 08 04 76 08 04 76 02 02 02 FF 00 03 00 00 00 01 07 00 18 FF 00 00 00 07 02 02 02 02 02 02 02 00 06 08 04 76 08 04 76 02 02 02 02 45 07 00 18 40 07 00 1E FF 00 00 00 04 02 02 02 02 00 01 02 FF 00 01 00 05 02 02 02 02 02 00 02 02 02 FC 00 01 02 FF 00 01 00 05 02 02 02 02 02 00 03 02 02 02 FD 00 01 02 02 FF 00 01 00 05 02 02 02 02 02 00 01 02 FA 00 01 01 FF 00 01 00 05 02 02 02 02 02 00 01 02 FA 00 01 FF 00 01 00 05 02 02 02 02 02 00 01 02 FF 00 01 00 06 02 02 02 02 02 02 00 01 02 FF 00 01 00 05 02 02 02 02 02 00 04 02 02 02 02 FF 00 01 00 06 02 02 02 02 02 02 00 01 02 FF 00 01 00 07 02 02 02 02 02 02 02 00 02 08 04 76 08 04 76 FF 00 01 00 05 02 02 02 02 02 00 03 02 02 02 FF 00 01 00 06 02 02 02 02 02 02 00 04 02 02 02 02 FF 00 01 00 07 02 02 02 02 02 02 02 00 05 08 04 76 08 04 76 02 02 02 FF 00 01 00 04 02 02 02 02 00 01 07 00 18 43 05 44 07 00 18 47 05 47 07 00 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1298   1306   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1298   1306   1298   1306   Any
        //  1314   1316   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  126    133    133    134    Any
        //  126    133    126    127    Ljava/util/ConcurrentModificationException;
        //  126    133    3      8      Any
        //  127    133    3      8      Any
        //  126    133    133    134    Any
        //  138    144    144    145    Any
        //  138    144    3      8      Any
        //  138    144    144    145    Any
        //  138    144    144    145    Ljava/lang/EnumConstantNotPresentException;
        //  138    144    3      8      Any
        //  206    213    213    214    Any
        //  206    213    3      8      Any
        //  207    213    213    214    Any
        //  207    213    206    207    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  206    213    206    207    Ljava/lang/ClassCastException;
        //  218    224    224    225    Any
        //  218    224    224    225    Any
        //  218    224    224    225    Any
        //  218    224    3      8      Ljava/lang/ArithmeticException;
        //  218    224    3      8      Any
        //  294    301    301    302    Any
        //  295    301    294    295    Ljava/lang/IllegalStateException;
        //  294    301    3      8      Any
        //  294    301    301    302    Ljava/util/ConcurrentModificationException;
        //  294    301    3      8      Any
        //  305    312    312    313    Any
        //  305    312    312    313    Any
        //  306    312    312    313    Any
        //  305    312    305    306    Ljava/lang/ArithmeticException;
        //  305    312    3      8      Any
        //  700    706    706    707    Any
        //  700    706    3      8      Ljava/lang/NumberFormatException;
        //  700    706    3      8      Any
        //  700    706    706    707    Ljava/util/ConcurrentModificationException;
        //  700    706    706    707    Ljava/lang/IllegalArgumentException;
        //  710    717    717    718    Any
        //  710    717    717    718    Any
        //  711    717    3      8      Ljava/lang/ArithmeticException;
        //  710    717    710    711    Ljava/lang/StringIndexOutOfBoundsException;
        //  710    717    3      8      Ljava/util/ConcurrentModificationException;
        //  820    827    827    828    Any
        //  820    827    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  820    827    827    828    Ljava/lang/NegativeArraySizeException;
        //  820    827    820    821    Any
        //  821    827    827    828    Any
        //  831    838    838    839    Any
        //  832    838    838    839    Any
        //  832    838    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  831    838    831    832    Ljava/util/ConcurrentModificationException;
        //  832    838    838    839    Any
        //  943    950    950    951    Any
        //  943    950    943    944    Any
        //  944    950    943    944    Any
        //  944    950    950    951    Any
        //  943    950    3      8      Any
        //  954    961    961    962    Any
        //  955    961    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  955    961    961    962    Any
        //  955    961    954    955    Ljava/util/ConcurrentModificationException;
        //  955    961    961    962    Ljava/lang/EnumConstantNotPresentException;
        //  1015   1021   1021   1022   Any
        //  1015   1021   1021   1022   Ljava/lang/ArithmeticException;
        //  1015   1021   3      8      Any
        //  1015   1021   3      8      Any
        //  1015   1021   1021   1022   Any
        //  1074   1081   1081   1082   Any
        //  1074   1081   1081   1082   Ljava/lang/NumberFormatException;
        //  1074   1081   1081   1082   Any
        //  1075   1081   1074   1075   Ljava/util/ConcurrentModificationException;
        //  1075   1081   1074   1075   Ljava/lang/NegativeArraySizeException;
        //  1133   1140   1140   1141   Any
        //  1134   1140   1133   1134   Any
        //  1134   1140   1140   1141   Any
        //  1134   1140   1133   1134   Any
        //  1134   1140   1140   1141   Ljava/lang/UnsupportedOperationException;
        //  1245   1251   1251   1252   Any
        //  1245   1251   1251   1252   Ljava/lang/EnumConstantNotPresentException;
        //  1245   1251   1251   1252   Any
        //  1245   1251   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1245   1251   3      8      Ljava/util/ConcurrentModificationException;
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
    
    public float c() {
        return fbS.b1(this, 1936957387);
    }
    
    public static float c(final float n, final float n2, final float n3) {
        return fbS.n(null, 364118851, n, n2, n3);
    }
    
    public Color 1(final float n) {
        return fbS.7x(this, 1965371456, n);
    }
    
    public fbI(final float[] c, final float c2) {
        while (true) {
            int n = 0;
            Label_0016: {
                if (fc.c < 0) {
                    n = -924303213;
                    break Label_0016;
                }
                n = -1835301315;
            }
            switch (n ^ 0xC776822) {
                case -996202319: {
                    continue;
                }
                case -1628639713: {
                    this.c = c;
                    while (true) {
                        int n2 = 0;
                        Label_0072: {
                            if (fc.c < 0) {
                                n2 = 790907878;
                                break Label_0072;
                            }
                            n2 = 1553369283;
                        }
                        switch (n2 ^ 0x7D61E7DE) {
                            case 1380297784: {
                                continue;
                            }
                            case 569863965: {
                                this.c = c2;
                                this.c = c(c, c2);
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
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    static {
        throw t;
    }
    
    public float 4() {
        return fbS.aO(this, 3378008);
    }
    
    public fbI(final float n, final float n2, final float n3, final float c) {
        final float[] array = new float[3];
        while (true) {
            int n4 = 0;
            Label_0025: {
                if (fc.c < 0) {
                    n4 = -1814572597;
                    break Label_0025;
                }
                n4 = -1104223735;
            }
            switch (n4 ^ 0xC0FAB001) {
                case 1395483082: {
                    continue;
                }
                case 2127843848: {
                    final float[] c2 = array;
                    c2[0] = n;
                    while (true) {
                        int n5 = 0;
                        Label_0078: {
                            if (fc.1 != 0) {
                                n5 = 664839349;
                                break Label_0078;
                            }
                            n5 = 1504612546;
                        }
                        switch (n5 ^ 0x5BF7DEA1) {
                            case 2086107668: {
                                continue;
                            }
                            case 39407203: {
                                c2[1] = n2;
                                final float[] array2 = c2;
                                final int n6 = 2;
                                while (true) {
                                    int n7 = 0;
                                    Label_0131: {
                                        if (fc.0 != 0) {
                                            n7 = -1540746105;
                                            break Label_0131;
                                        }
                                        n7 = -2024901415;
                                    }
                                    switch (n7 ^ 0xF0AFEFAF) {
                                        case 1418066728: {
                                            continue;
                                        }
                                        case 2011274102: {
                                            array2[n6] = n3;
                                            this.c = c2;
                                            while (true) {
                                                int n8 = 0;
                                                Label_0184: {
                                                    if (fc.1 != 0) {
                                                        n8 = 2007248029;
                                                        break Label_0184;
                                                    }
                                                    n8 = 1746903123;
                                                }
                                                switch (n8 ^ 0xB7DD9F36) {
                                                    case -1065765973: {
                                                        continue;
                                                    }
                                                    case -540917915: {
                                                        while (true) {
                                                            int n9 = 0;
                                                            Label_0233: {
                                                                if (fc.0 != 0) {
                                                                    n9 = -1777365133;
                                                                    break Label_0233;
                                                                }
                                                                n9 = -1972617093;
                                                            }
                                                            switch (n9 ^ 0x3B386686) {
                                                                case -1432323930: {
                                                                    continue;
                                                                }
                                                                default: {
                                                                    this.c = c;
                                                                    while (true) {
                                                                        int n10 = 0;
                                                                        Label_0284: {
                                                                            if (fc.1 != 0) {
                                                                                n10 = 1726404422;
                                                                                break Label_0284;
                                                                            }
                                                                            n10 = 627196605;
                                                                        }
                                                                        switch (n10 ^ 0xECC6F00D) {
                                                                            case -1977604277: {
                                                                                continue;
                                                                            }
                                                                            case -911953232: {
                                                                                this.c = c(this.c, c);
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
                                                                case -1388844555: {
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
                    break;
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public Color 3() {
        return fbS.1Y(this, 826255340);
    }
    
    public float[] 5() {
        return fbS.l(this, 1153894914);
    }
    
    public Color 2(final float n) {
        return fbS.7x(this, 1965371459, n);
    }
    
    public static Color 0(final float p0, final float p1, final float p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          111
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            103
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            95
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: fload_0        
        //    25: fload_1        
        //    26: fload_2        
        //    27: fconst_1       
        //    28: getstatic       dev/nuker/pyro/fc.c:I
        //    31: ifge            40
        //    34: ldc_w           1731880741
        //    37: goto            43
        //    40: ldc_w           772139503
        //    43: ldc_w           231152086
        //    46: ixor           
        //    47: lookupswitch {
        //          599978041: 72
        //          1794998003: 40
        //          default: 84
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokestatic    dev/nuker/pyro/fbI.c:(FFFF)Ljava/awt/Color;
        //    79: goto            83
        //    82: athrow         
        //    83: areturn        
        //    84: aconst_null    
        //    85: athrow         
        //    86: pop            
        //    87: goto            24
        //    90: pop            
        //    91: aconst_null    
        //    92: goto            86
        //    95: dup            
        //    96: ifnull          86
        //    99: checkcast       Ljava/lang/Throwable;
        //   102: athrow         
        //   103: dup            
        //   104: ifnull          90
        //   107: checkcast       Ljava/lang/Throwable;
        //   110: athrow         
        //   111: aconst_null    
        //   112: athrow         
        //    StackMapTable: 00 11 43 07 00 18 04 FF 00 0B 00 00 00 01 07 00 18 FE 00 03 02 02 02 FF 00 0F 00 03 02 02 02 00 04 02 02 02 02 FF 00 02 00 03 02 02 02 00 05 02 02 02 02 01 FF 00 1C 00 03 02 02 02 00 04 02 02 02 02 42 07 00 18 FF 00 00 00 03 02 02 02 00 04 02 02 02 02 45 07 00 18 40 07 00 1E FF 00 00 00 03 02 02 02 00 04 02 02 02 02 41 07 00 0C 43 05 44 07 00 0C 47 05 47 07 00 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      20     95     103    Ljava/lang/RuntimeException;
        //  95     103    95     103    Ljava/util/NoSuchElementException;
        //  111    113    3      8      Any
        //  75     82     82     83     Any
        //  76     82     3      8      Any
        //  75     82     3      8      Any
        //  76     82     75     76     Any
        //  75     82     82     83     Ljava/lang/IllegalArgumentException;
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
    
    public fbI(final float n, final float n2, final float n3) {
        while (true) {
            int n4 = 0;
            Label_0018: {
                if (fc.0 != 0) {
                    n4 = -95683777;
                    break Label_0018;
                }
                n4 = -160749857;
            }
            switch (n4 ^ 0xEE27150F) {
                case 958393762: {
                    continue;
                }
                default: {
                    final float n5 = 1.0f;
                    while (true) {
                        int n6 = 0;
                        Label_0065: {
                            if (fc.c < 0) {
                                n6 = -550956013;
                                break Label_0065;
                            }
                            n6 = 1223888975;
                        }
                        switch (n6 ^ 0x1B3A49B4) {
                            case 2006263775: {
                                continue;
                            }
                            default: {
                                this(n, n2, n3, n5);
                                return;
                            }
                            case -1005363801: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 342683184: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public Color 2() {
        return fbS.1Y(this, 826255341);
    }
    
    public fbI(final float[] array) {
        this(array, 1.0f);
    }
    
    public float 0() {
        return fbS.ao(this, 328315198);
    }
}
