// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.launcher;

import java.io.File;
import java.net.URL;
import dev.nuker.pyro.dc;

public class LibraryCache$GradleResource
{
    public String url;
    public String pkg;
    public String name;
    public String version;
    
    public String getGradleString() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          613
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/dc.1:I
        //    12: iflt            605
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            597
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/lang/StringBuilder;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/dc.c:I
        //    31: ifne            44
        //    34: ldc2_w          -1600755874
        //    37: l2i            
        //    38: ldc             -1457110020
        //    40: ixor           
        //    41: goto            51
        //    44: ldc2_w          -371470311
        //    47: l2i            
        //    48: ldc             -1089032145
        //    50: ixor           
        //    51: ldc2_w          757101392
        //    54: l2i            
        //    55: ldc             -321741984
        //    57: ixor           
        //    58: ixor           
        //    59: lookupswitch {
        //          -1757444090: 84
        //          -935146350: 44
        //          default: 582
        //        }
        //    84: goto            88
        //    87: athrow         
        //    88: invokespecial   java/lang/StringBuilder.<init>:()V
        //    91: goto            95
        //    94: athrow         
        //    95: aload_0         /* this */
        //    96: getstatic       dev/nuker/pyro/dc.1:I
        //    99: ifge            112
        //   102: ldc2_w          -541004706
        //   105: l2i            
        //   106: ldc             -1473108431
        //   108: ixor           
        //   109: goto            119
        //   112: ldc2_w          -1303214699
        //   115: l2i            
        //   116: ldc             -1501765205
        //   118: ixor           
        //   119: ldc2_w          -246472461
        //   122: l2i            
        //   123: ldc             -913009885
        //   125: ixor           
        //   126: ixor           
        //   127: lookupswitch {
        //          754309102: 152
        //          1328118207: 112
        //          default: 584
        //        }
        //   152: getfield        dev/nuker/pyro/launcher/LibraryCache$GradleResource.pkg:Ljava/lang/String;
        //   155: getstatic       dev/nuker/pyro/dc.1:I
        //   158: ifge            171
        //   161: ldc2_w          -1407893568
        //   164: l2i            
        //   165: ldc             -1281967782
        //   167: ixor           
        //   168: goto            178
        //   171: ldc2_w          -10821735
        //   174: l2i            
        //   175: ldc             -655823902
        //   177: ixor           
        //   178: ldc2_w          1206626967
        //   181: l2i            
        //   182: ldc             2005528155
        //   184: ixor           
        //   185: ixor           
        //   186: lookupswitch {
        //          399536311: 212
        //          803324502: 171
        //          default: 574
        //        }
        //   212: goto            216
        //   215: athrow         
        //   216: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   219: goto            223
        //   222: athrow         
        //   223: ldc             ":"
        //   225: goto            229
        //   228: athrow         
        //   229: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   232: goto            236
        //   235: athrow         
        //   236: getstatic       dev/nuker/pyro/dc.0:I
        //   239: ifgt            252
        //   242: ldc2_w          -450790587
        //   245: l2i            
        //   246: ldc             922118640
        //   248: ixor           
        //   249: goto            259
        //   252: ldc2_w          -25286100
        //   255: l2i            
        //   256: ldc             -501091883
        //   258: ixor           
        //   259: ldc2_w          232183124
        //   262: l2i            
        //   263: ldc             1869566752
        //   265: ixor           
        //   266: ixor           
        //   267: lookupswitch {
        //          -1318153023: 576
        //          381430958: 252
        //          default: 292
        //        }
        //   292: aload_0         /* this */
        //   293: getfield        dev/nuker/pyro/launcher/LibraryCache$GradleResource.name:Ljava/lang/String;
        //   296: getstatic       dev/nuker/pyro/dc.0:I
        //   299: ifgt            312
        //   302: ldc2_w          46324227
        //   305: l2i            
        //   306: ldc             -1891727255
        //   308: ixor           
        //   309: goto            319
        //   312: ldc2_w          -296922752
        //   315: l2i            
        //   316: ldc             12266904
        //   318: ixor           
        //   319: ldc2_w          150008976
        //   322: l2i            
        //   323: ldc             -609939940
        //   325: ixor           
        //   326: ixor           
        //   327: lookupswitch {
        //          1588177126: 580
        //          1846046483: 312
        //          default: 352
        //        }
        //   352: goto            356
        //   355: athrow         
        //   356: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   359: goto            363
        //   362: athrow         
        //   363: ldc             ":"
        //   365: goto            369
        //   368: athrow         
        //   369: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   372: goto            376
        //   375: athrow         
        //   376: getstatic       dev/nuker/pyro/dc.c:I
        //   379: ifne            392
        //   382: ldc2_w          414103836
        //   385: l2i            
        //   386: ldc             423035693
        //   388: ixor           
        //   389: goto            399
        //   392: ldc2_w          2107968141
        //   395: l2i            
        //   396: ldc             -848753803
        //   398: ixor           
        //   399: ldc2_w          86451243
        //   402: l2i            
        //   403: ldc             -1721752925
        //   405: ixor           
        //   406: ixor           
        //   407: lookupswitch {
        //          -1646347079: 392
        //          747308912: 432
        //          default: 572
        //        }
        //   432: aload_0         /* this */
        //   433: getfield        dev/nuker/pyro/launcher/LibraryCache$GradleResource.version:Ljava/lang/String;
        //   436: getstatic       dev/nuker/pyro/dc.1:I
        //   439: ifge            452
        //   442: ldc2_w          1813436576
        //   445: l2i            
        //   446: ldc             1913124583
        //   448: ixor           
        //   449: goto            459
        //   452: ldc2_w          -2035826791
        //   455: l2i            
        //   456: ldc             1347710801
        //   458: ixor           
        //   459: ldc2_w          530380413
        //   462: l2i            
        //   463: ldc             -2015356980
        //   465: ixor           
        //   466: ixor           
        //   467: lookupswitch {
        //          -2039623690: 452
        //          1318007161: 492
        //          default: 578
        //        }
        //   492: goto            496
        //   495: athrow         
        //   496: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   499: goto            503
        //   502: athrow         
        //   503: getstatic       dev/nuker/pyro/dc.0:I
        //   506: ifgt            519
        //   509: ldc2_w          1068502789
        //   512: l2i            
        //   513: ldc             -366675718
        //   515: ixor           
        //   516: goto            526
        //   519: ldc2_w          1357804698
        //   522: l2i            
        //   523: ldc             1821643034
        //   525: ixor           
        //   526: ldc2_w          1244694396
        //   529: l2i            
        //   530: ldc             -1153185806
        //   532: ixor           
        //   533: ixor           
        //   534: lookupswitch {
        //          -1274082600: 519
        //          619165553: 586
        //          default: 560
        //        }
        //   560: goto            564
        //   563: athrow         
        //   564: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   567: goto            571
        //   570: athrow         
        //   571: areturn        
        //   572: aconst_null    
        //   573: athrow         
        //   574: aconst_null    
        //   575: athrow         
        //   576: aconst_null    
        //   577: athrow         
        //   578: aconst_null    
        //   579: athrow         
        //   580: aconst_null    
        //   581: athrow         
        //   582: aconst_null    
        //   583: athrow         
        //   584: aconst_null    
        //   585: athrow         
        //   586: aconst_null    
        //   587: athrow         
        //   588: pop            
        //   589: goto            24
        //   592: pop            
        //   593: aconst_null    
        //   594: goto            588
        //   597: dup            
        //   598: ifnull          588
        //   601: checkcast       Ljava/lang/Throwable;
        //   604: athrow         
        //   605: dup            
        //   606: ifnull          592
        //   609: checkcast       Ljava/lang/Throwable;
        //   612: athrow         
        //   613: aconst_null    
        //   614: athrow         
        //    StackMapTable: 00 45 43 07 00 28 04 FF 00 0B 00 00 00 01 07 00 28 FC 00 03 07 00 03 FF 00 13 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 06 00 01 07 00 03 00 03 08 00 18 08 00 18 01 FF 00 20 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 02 00 00 00 01 07 00 28 FF 00 00 00 01 07 00 03 00 02 08 00 18 08 00 18 45 07 00 28 40 07 00 2A FF 00 10 00 01 07 00 03 00 02 07 00 2A 07 00 03 FF 00 06 00 01 07 00 03 00 03 07 00 2A 07 00 03 01 FF 00 20 00 01 07 00 03 00 02 07 00 2A 07 00 03 FF 00 12 00 01 07 00 03 00 02 07 00 2A 07 00 8F FF 00 06 00 01 07 00 03 00 03 07 00 2A 07 00 8F 01 FF 00 21 00 01 07 00 03 00 02 07 00 2A 07 00 8F 42 07 00 28 FF 00 00 00 01 07 00 03 00 02 07 00 2A 07 00 8F 45 07 00 28 40 07 00 2A FF 00 04 00 00 00 01 07 00 28 FF 00 00 00 01 07 00 03 00 02 07 00 2A 07 00 8F 45 07 00 28 40 07 00 2A 4F 07 00 2A FF 00 06 00 01 07 00 03 00 02 07 00 2A 01 60 07 00 2A FF 00 13 00 01 07 00 03 00 02 07 00 2A 07 00 8F FF 00 06 00 01 07 00 03 00 03 07 00 2A 07 00 8F 01 FF 00 20 00 01 07 00 03 00 02 07 00 2A 07 00 8F FF 00 02 00 00 00 01 07 00 28 FF 00 00 00 01 07 00 03 00 02 07 00 2A 07 00 8F 45 07 00 28 40 07 00 2A 44 07 00 1E FF 00 00 00 01 07 00 03 00 02 07 00 2A 07 00 8F 45 07 00 28 40 07 00 2A 4F 07 00 2A FF 00 06 00 01 07 00 03 00 02 07 00 2A 01 60 07 00 2A FF 00 13 00 01 07 00 03 00 02 07 00 2A 07 00 8F FF 00 06 00 01 07 00 03 00 03 07 00 2A 07 00 8F 01 FF 00 20 00 01 07 00 03 00 02 07 00 2A 07 00 8F 42 07 00 28 FF 00 00 00 01 07 00 03 00 02 07 00 2A 07 00 8F 45 07 00 28 40 07 00 2A 4F 07 00 2A FF 00 06 00 01 07 00 03 00 02 07 00 2A 01 61 07 00 2A 42 07 00 28 40 07 00 2A 45 07 00 28 40 07 00 8F 40 07 00 2A FF 00 01 00 01 07 00 03 00 02 07 00 2A 07 00 8F 41 07 00 2A FF 00 01 00 01 07 00 03 00 02 07 00 2A 07 00 8F FF 00 01 00 01 07 00 03 00 02 07 00 2A 07 00 8F FF 00 01 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 01 00 01 07 00 03 00 02 07 00 2A 07 00 03 41 07 00 2A 41 07 00 28 43 05 44 07 00 28 47 05 47 07 00 28
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     597    605    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  597    605    597    605    Any
        //  613    615    3      8      Any
        //  88     94     94     95     Any
        //  88     94     94     95     Ljava/lang/IllegalArgumentException;
        //  88     94     3      8      Ljava/lang/IllegalArgumentException;
        //  88     94     94     95     Ljava/lang/ArithmeticException;
        //  88     94     3      8      Ljava/lang/NegativeArraySizeException;
        //  215    222    222    223    Any
        //  216    222    222    223    Any
        //  215    222    222    223    Ljava/lang/IllegalStateException;
        //  215    222    215    216    Any
        //  215    222    215    216    Ljava/lang/StringIndexOutOfBoundsException;
        //  229    235    235    236    Any
        //  229    235    3      8      Any
        //  229    235    235    236    Any
        //  229    235    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  229    235    235    236    Ljava/lang/RuntimeException;
        //  356    362    362    363    Any
        //  356    362    362    363    Any
        //  356    362    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  356    362    362    363    Ljava/lang/ArithmeticException;
        //  356    362    362    363    Ljava/lang/NumberFormatException;
        //  368    375    375    376    Any
        //  368    375    375    376    Ljava/lang/UnsupportedOperationException;
        //  368    375    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  368    375    3      8      Any
        //  369    375    368    369    Ljava/lang/UnsupportedOperationException;
        //  495    502    502    503    Any
        //  496    502    495    496    Any
        //  496    502    502    503    Ljava/lang/StringIndexOutOfBoundsException;
        //  496    502    495    496    Ljava/lang/NumberFormatException;
        //  495    502    495    496    Any
        //  563    570    570    571    Any
        //  564    570    563    564    Ljava/lang/NumberFormatException;
        //  564    570    563    564    Any
        //  563    570    570    571    Ljava/lang/ClassCastException;
        //  563    570    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
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
    
    @Override
    public String toString() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          356
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/dc.0:I
        //    12: ifeq            348
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            340
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             "\u5622\uaf41\u5c1c\u9545\u7d8d\udf92\udcc0\u9286\u326e\uf4e5\u1a47\ue484\u0b75\u6506\u9963\ub7b6\u39d5\uc2f6\u9109\u7b8d\u914c\u169b\u0e67\ufc3f\u7d55\ucbe4\u982c\u7dba\uf79a\u6897\uf511\ub247\u03be\ub895\u4c3f\u4e44\u8be9\ub181\u79e9\uc41e\u7f91\udb0b\ue1b5\u22ea\u533f\u17b7\u3275\u7924\u1215\uaac5\uf2e8\u477e\u39c5\u1c56\u5edc\u3845\u3a47\u0b54\ucda2\u17d2\ua58f\ucc2d\u34af\u57af\u65f7\uf359\u6327\u868a\u141c"
        //    26: goto            30
        //    29: athrow         
        //    30: invokestatic    invokestatic   !!! ERROR
        //    33: goto            37
        //    36: athrow         
        //    37: ldc2_w          336670271
        //    40: l2i            
        //    41: ldc             336670265
        //    43: ixor           
        //    44: anewarray       Ljava/lang/Object;
        //    47: dup            
        //    48: ldc2_w          -44513088
        //    51: l2i            
        //    52: ldc             -44513088
        //    54: ixor           
        //    55: getstatic       dev/nuker/pyro/dc.1:I
        //    58: ifge            71
        //    61: ldc2_w          1045600489
        //    64: l2i            
        //    65: ldc             -806061636
        //    67: ixor           
        //    68: goto            78
        //    71: ldc2_w          -2068338956
        //    74: l2i            
        //    75: ldc             1147981190
        //    77: ixor           
        //    78: ldc2_w          361302601
        //    81: l2i            
        //    82: ldc             -238367517
        //    84: ixor           
        //    85: ixor           
        //    86: lookupswitch {
        //          -1530811605: 71
        //          367339519: 329
        //          default: 112
        //        }
        //   112: aload_0         /* this */
        //   113: goto            117
        //   116: athrow         
        //   117: invokevirtual   dev/nuker/pyro/launcher/LibraryCache$GradleResource.getDownloadUrl:()Ljava/lang/String;
        //   120: goto            124
        //   123: athrow         
        //   124: aastore        
        //   125: dup            
        //   126: ldc2_w          1201280168
        //   129: l2i            
        //   130: ldc             1201280169
        //   132: ixor           
        //   133: getstatic       dev/nuker/pyro/dc.c:I
        //   136: ifne            149
        //   139: ldc2_w          -1832507422
        //   142: l2i            
        //   143: ldc             -992876402
        //   145: ixor           
        //   146: goto            156
        //   149: ldc2_w          -49236634
        //   152: l2i            
        //   153: ldc             -126535813
        //   155: ixor           
        //   156: ldc2_w          944212884
        //   159: l2i            
        //   160: ldc             27459598
        //   162: ixor           
        //   163: ixor           
        //   164: lookupswitch {
        //          222144097: 149
        //          1878213878: 327
        //          default: 192
        //        }
        //   192: aload_0         /* this */
        //   193: goto            197
        //   196: athrow         
        //   197: invokevirtual   dev/nuker/pyro/launcher/LibraryCache$GradleResource.getGradleString:()Ljava/lang/String;
        //   200: goto            204
        //   203: athrow         
        //   204: aastore        
        //   205: dup            
        //   206: ldc2_w          -942769722
        //   209: l2i            
        //   210: ldc             -942769724
        //   212: ixor           
        //   213: aload_0         /* this */
        //   214: getfield        dev/nuker/pyro/launcher/LibraryCache$GradleResource.url:Ljava/lang/String;
        //   217: aastore        
        //   218: dup            
        //   219: ldc2_w          -1362865507
        //   222: l2i            
        //   223: ldc             -1362865506
        //   225: ixor           
        //   226: aload_0         /* this */
        //   227: getfield        dev/nuker/pyro/launcher/LibraryCache$GradleResource.pkg:Ljava/lang/String;
        //   230: aastore        
        //   231: dup            
        //   232: ldc2_w          124316081
        //   235: l2i            
        //   236: ldc             124316085
        //   238: ixor           
        //   239: aload_0         /* this */
        //   240: getstatic       dev/nuker/pyro/dc.1:I
        //   243: ifge            256
        //   246: ldc2_w          2087063167
        //   249: l2i            
        //   250: ldc             -681672142
        //   252: ixor           
        //   253: goto            263
        //   256: ldc2_w          -899366139
        //   259: l2i            
        //   260: ldc             -1784977763
        //   262: ixor           
        //   263: ldc2_w          584404355
        //   266: l2i            
        //   267: ldc             1733495486
        //   269: ixor           
        //   270: ixor           
        //   271: lookupswitch {
        //          -1344404317: 256
        //          -289485968: 325
        //          default: 296
        //        }
        //   296: getfield        dev/nuker/pyro/launcher/LibraryCache$GradleResource.name:Ljava/lang/String;
        //   299: aastore        
        //   300: dup            
        //   301: ldc2_w          718033205
        //   304: l2i            
        //   305: ldc             718033200
        //   307: ixor           
        //   308: aload_0         /* this */
        //   309: getfield        dev/nuker/pyro/launcher/LibraryCache$GradleResource.version:Ljava/lang/String;
        //   312: aastore        
        //   313: goto            317
        //   316: athrow         
        //   317: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   320: goto            324
        //   323: athrow         
        //   324: areturn        
        //   325: aconst_null    
        //   326: athrow         
        //   327: aconst_null    
        //   328: athrow         
        //   329: aconst_null    
        //   330: athrow         
        //   331: pop            
        //   332: goto            24
        //   335: pop            
        //   336: aconst_null    
        //   337: goto            331
        //   340: dup            
        //   341: ifnull          331
        //   344: checkcast       Ljava/lang/Throwable;
        //   347: athrow         
        //   348: dup            
        //   349: ifnull          335
        //   352: checkcast       Ljava/lang/Throwable;
        //   355: athrow         
        //   356: aconst_null    
        //   357: athrow         
        //    StackMapTable: 00 25 43 07 00 28 04 FF 00 0B 00 00 00 01 07 00 28 FC 00 03 07 00 03 44 07 00 28 40 07 00 8F 45 07 00 28 40 07 00 8F FF 00 21 00 01 07 00 03 00 04 07 00 8F 07 00 D5 07 00 D5 01 FF 00 06 00 01 07 00 03 00 05 07 00 8F 07 00 D5 07 00 D5 01 01 FF 00 21 00 01 07 00 03 00 04 07 00 8F 07 00 D5 07 00 D5 01 43 07 00 28 FF 00 00 00 01 07 00 03 00 05 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 45 07 00 28 FF 00 00 00 01 07 00 03 00 05 07 00 8F 07 00 D5 07 00 D5 01 07 00 8F FF 00 18 00 01 07 00 03 00 04 07 00 8F 07 00 D5 07 00 D5 01 FF 00 06 00 01 07 00 03 00 05 07 00 8F 07 00 D5 07 00 D5 01 01 FF 00 23 00 01 07 00 03 00 04 07 00 8F 07 00 D5 07 00 D5 01 43 07 00 28 FF 00 00 00 01 07 00 03 00 05 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 45 07 00 28 FF 00 00 00 01 07 00 03 00 05 07 00 8F 07 00 D5 07 00 D5 01 07 00 8F FF 00 33 00 01 07 00 03 00 05 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 FF 00 06 00 01 07 00 03 00 06 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 01 FF 00 20 00 01 07 00 03 00 05 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 53 07 00 1A FF 00 00 00 01 07 00 03 00 02 07 00 8F 07 00 D5 45 07 00 28 40 07 00 8F FF 00 00 00 01 07 00 03 00 05 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 FF 00 01 00 01 07 00 03 00 04 07 00 8F 07 00 D5 07 00 D5 01 FF 00 01 00 01 07 00 03 00 04 07 00 8F 07 00 D5 07 00 D5 01 41 07 00 28 43 05 44 07 00 28 47 05 47 07 00 28
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     340    348    Any
        //  340    348    340    348    Ljava/lang/NumberFormatException;
        //  356    358    3      8      Any
        //  29     36     36     37     Any
        //  29     36     36     37     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  29     36     29     30     Any
        //  30     36     29     30     Any
        //  29     36     3      8      Ljava/lang/RuntimeException;
        //  116    123    123    124    Any
        //  116    123    116    117    Any
        //  116    123    116    117    Ljava/lang/UnsupportedOperationException;
        //  117    123    123    124    Any
        //  117    123    116    117    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  196    203    203    204    Any
        //  196    203    203    204    Any
        //  197    203    3      8      Any
        //  197    203    196    197    Any
        //  196    203    203    204    Any
        //  316    323    323    324    Any
        //  317    323    3      8      Any
        //  316    323    3      8      Any
        //  317    323    323    324    Ljava/util/NoSuchElementException;
        //  316    323    316    317    Ljava/lang/RuntimeException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:660)
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
    
    public LibraryCache$GradleResource(final String resource) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/dc.c:I
        //     4: ifne            17
        //     7: ldc2_w          -793169760
        //    10: l2i            
        //    11: ldc             1114836314
        //    13: ixor           
        //    14: goto            24
        //    17: ldc2_w          -1246000543
        //    20: l2i            
        //    21: ldc             -1319205864
        //    23: ixor           
        //    24: ldc2_w          2047372221
        //    27: l2i            
        //    28: ldc             -180703124
        //    30: ixor           
        //    31: ixor           
        //    32: lookupswitch {
        //          -1948789336: 60
        //          502851115: 17
        //          default: 274
        //        }
        //    60: aload_1         /* resource */
        //    61: ldc             "\u565b\uaf4e"
        //    63: getstatic       dev/nuker/pyro/dc.c:I
        //    66: ifne            79
        //    69: ldc2_w          1118472143
        //    72: l2i            
        //    73: ldc             -2130319641
        //    75: ixor           
        //    76: goto            86
        //    79: ldc2_w          437117959
        //    82: l2i            
        //    83: ldc             1565514509
        //    85: ixor           
        //    86: ldc2_w          395805846
        //    89: l2i            
        //    90: ldc             619667265
        //    92: ixor           
        //    93: ixor           
        //    94: lookupswitch {
        //          -254297345: 79
        //          1950016733: 120
        //          default: 276
        //        }
        //   120: invokestatic    invokestatic   !!! ERROR
        //   123: getstatic       dev/nuker/pyro/dc.0:I
        //   126: ifgt            139
        //   129: ldc2_w          1211898920
        //   132: l2i            
        //   133: ldc             1401378169
        //   135: ixor           
        //   136: goto            146
        //   139: ldc2_w          1560800035
        //   142: l2i            
        //   143: ldc             533169450
        //   145: ixor           
        //   146: ldc2_w          889305610
        //   149: l2i            
        //   150: ldc             -1050902129
        //   152: ixor           
        //   153: ixor           
        //   154: lookupswitch {
        //          -1231202932: 180
        //          -270109996: 139
        //          default: 272
        //        }
        //   180: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   183: ldc2_w          338270279
        //   186: l2i            
        //   187: ldc             338270279
        //   189: ixor           
        //   190: aaload         
        //   191: aload_1         /* resource */
        //   192: ldc             "\u565b\uaf4e"
        //   194: invokestatic    invokestatic   !!! ERROR
        //   197: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   200: ldc2_w          -494213510
        //   203: l2i            
        //   204: ldc             -494213509
        //   206: ixor           
        //   207: aaload         
        //   208: getstatic       dev/nuker/pyro/dc.0:I
        //   211: ifgt            225
        //   214: ldc2_w          649847551
        //   217: l2i            
        //   218: ldc_w           674969412
        //   221: ixor           
        //   222: goto            233
        //   225: ldc2_w          -895762904
        //   228: l2i            
        //   229: ldc_w           436268083
        //   232: ixor           
        //   233: ldc2_w          544626707
        //   236: l2i            
        //   237: ldc_w           40552821
        //   240: ixor           
        //   241: ixor           
        //   242: lookupswitch {
        //          -225983619: 268
        //          748438749: 225
        //          default: 278
        //        }
        //   268: invokespecial   dev/nuker/pyro/launcher/LibraryCache$GradleResource.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   271: return         
        //   272: aconst_null    
        //   273: athrow         
        //   274: aconst_null    
        //   275: athrow         
        //   276: aconst_null    
        //   277: athrow         
        //   278: aconst_null    
        //   279: athrow         
        //    StackMapTable: 00 10 51 06 FF 00 06 00 02 06 07 00 8F 00 02 06 01 63 06 FF 00 12 00 02 06 07 00 8F 00 03 06 07 00 8F 07 00 8F FF 00 06 00 02 06 07 00 8F 00 04 06 07 00 8F 07 00 8F 01 FF 00 21 00 02 06 07 00 8F 00 03 06 07 00 8F 07 00 8F FF 00 12 00 02 06 07 00 8F 00 03 06 07 00 8F 07 00 8F FF 00 06 00 02 06 07 00 8F 00 04 06 07 00 8F 07 00 8F 01 FF 00 21 00 02 06 07 00 8F 00 03 06 07 00 8F 07 00 8F FF 00 2C 00 02 06 07 00 8F 00 03 06 07 00 8F 07 00 8F FF 00 07 00 02 06 07 00 8F 00 04 06 07 00 8F 07 00 8F 01 FF 00 22 00 02 06 07 00 8F 00 03 06 07 00 8F 07 00 8F FF 00 03 00 02 06 07 00 8F 00 03 06 07 00 8F 07 00 8F 41 06 FF 00 01 00 02 06 07 00 8F 00 03 06 07 00 8F 07 00 8F FF 00 01 00 02 06 07 00 8F 00 03 06 07 00 8F 07 00 8F
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
    
    public LibraryCache$DownloadFile getDownloadFile() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          150
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/dc.0:I
        //    12: ifeq            142
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            134
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ldev/nuker/pyro/launcher/LibraryCache$DownloadFile;
        //    27: dup            
        //    28: aload_0         /* this */
        //    29: goto            33
        //    32: athrow         
        //    33: invokevirtual   dev/nuker/pyro/launcher/LibraryCache$GradleResource.getDownloadUri:()Ljava/net/URL;
        //    36: goto            40
        //    39: athrow         
        //    40: aload_0         /* this */
        //    41: getstatic       dev/nuker/pyro/dc.1:I
        //    44: ifge            58
        //    47: ldc2_w          235062494
        //    50: l2i            
        //    51: ldc_w           600636232
        //    54: ixor           
        //    55: goto            66
        //    58: ldc2_w          495514284
        //    61: l2i            
        //    62: ldc_w           -549094422
        //    65: ixor           
        //    66: ldc2_w          621922807
        //    69: l2i            
        //    70: ldc_w           1268814056
        //    73: ixor           
        //    74: ixor           
        //    75: lookupswitch {
        //          -1401106343: 100
        //          1132422793: 58
        //          default: 123
        //        }
        //   100: goto            104
        //   103: athrow         
        //   104: invokevirtual   dev/nuker/pyro/launcher/LibraryCache$GradleResource.getLocalFile:()Ljava/io/File;
        //   107: goto            111
        //   110: athrow         
        //   111: goto            115
        //   114: athrow         
        //   115: invokespecial   dev/nuker/pyro/launcher/LibraryCache$DownloadFile.<init>:(Ljava/net/URL;Ljava/io/File;)V
        //   118: goto            122
        //   121: athrow         
        //   122: areturn        
        //   123: aconst_null    
        //   124: athrow         
        //   125: pop            
        //   126: goto            24
        //   129: pop            
        //   130: aconst_null    
        //   131: goto            125
        //   134: dup            
        //   135: ifnull          125
        //   138: checkcast       Ljava/lang/Throwable;
        //   141: athrow         
        //   142: dup            
        //   143: ifnull          129
        //   146: checkcast       Ljava/lang/Throwable;
        //   149: athrow         
        //   150: aconst_null    
        //   151: athrow         
        //    StackMapTable: 00 19 43 07 00 28 04 FF 00 0B 00 00 00 01 07 00 28 FC 00 03 07 00 03 FF 00 07 00 00 00 01 07 00 28 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 45 07 00 28 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 01 28 FF 00 11 00 01 07 00 03 00 04 08 00 18 08 00 18 07 01 28 07 00 03 FF 00 07 00 01 07 00 03 00 05 08 00 18 08 00 18 07 01 28 07 00 03 01 FF 00 21 00 01 07 00 03 00 04 08 00 18 08 00 18 07 01 28 07 00 03 42 07 00 28 FF 00 00 00 01 07 00 03 00 04 08 00 18 08 00 18 07 01 28 07 00 03 45 07 00 28 FF 00 00 00 01 07 00 03 00 04 08 00 18 08 00 18 07 01 28 07 01 2A FF 00 02 00 00 00 01 07 00 28 FF 00 00 00 01 07 00 03 00 04 08 00 18 08 00 18 07 01 28 07 01 2A 45 07 00 28 40 07 01 12 FF 00 00 00 01 07 00 03 00 04 08 00 18 08 00 18 07 01 28 07 00 03 41 07 00 28 43 05 44 07 00 28 47 05 47 07 00 28
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     134    142    Any
        //  134    142    134    142    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  150    152    3      8      Any
        //  33     39     39     40     Any
        //  33     39     3      8      Ljava/util/NoSuchElementException;
        //  33     39     39     40     Any
        //  33     39     39     40     Ljava/lang/IllegalStateException;
        //  33     39     39     40     Any
        //  103    110    110    111    Any
        //  103    110    103    104    Any
        //  103    110    103    104    Any
        //  103    110    110    111    Any
        //  103    110    3      8      Any
        //  115    121    121    122    Any
        //  115    121    121    122    Any
        //  115    121    3      8      Ljava/util/ConcurrentModificationException;
        //  115    121    121    122    Ljava/lang/EnumConstantNotPresentException;
        //  115    121    121    122    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 28 out of bounds for length 28
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
    
    public LibraryCache$GradleResource(final String url, String resource) {
        while (true) {
            int n = 0;
            Label_0030: {
                if (dc.0 <= 0) {
                    n = ((int)(-82540146L) ^ 0xFA1E1979);
                    break Label_0030;
                }
                n = ((int)(-612694155L) ^ 0x2E6AD835);
            }
            switch (n ^ ((int)1582297250L ^ 0xA7C84C2E)) {
                case -124965765: {
                    continue;
                }
                case 211182540: {
                    while (true) {
                        int n2 = 0;
                        Label_0090: {
                            if (dc.c == 0) {
                                n2 = ((int)(-1798983098L) ^ 0xE81A4A90);
                                break Label_0090;
                            }
                            n2 = ((int)1640438025L ^ 0x67389688);
                        }
                        switch (n2 ^ ((int)101974192L ^ 0x8B2B8CDA)) {
                            case -236948292: {
                                continue;
                            }
                            case -1950350357: {
                                this.url = url;
                                final String s = resource;
                                final int beginIndex = (int)(-40289218L) ^ 0xFD993C3E;
                                while (true) {
                                    int n3 = 0;
                                    Label_0162: {
                                        if (dc.c == 0) {
                                            n3 = ((int)725595999L ^ 0xE38D69D2);
                                            break Label_0162;
                                        }
                                        n3 = ((int)1353201934L ^ 0xCB1B71D7);
                                    }
                                    switch (n3 ^ ((int)(-692478124L) ^ 0x6136408F)) {
                                        case 2134704470: {
                                            continue;
                                        }
                                        case 742168322: {
                                            final String s2 = resource;
                                            final String str = ":";
                                            while (true) {
                                                int n4 = 0;
                                                Label_0224: {
                                                    if (dc.c == 0) {
                                                        n4 = ((int)16400663L ^ 0x145EDABC);
                                                        break Label_0224;
                                                    }
                                                    n4 = ((int)(-1969144421L) ^ 0xA38C0A71);
                                                }
                                                switch (n4 ^ ((int)1773093317L ^ 0xB8DEC7B3)) {
                                                    case 1344092758: {
                                                        continue;
                                                    }
                                                    default: {
                                                        final String substring = s.substring(beginIndex, s2.indexOf(str));
                                                        while (true) {
                                                            int n5 = 0;
                                                            Label_0291: {
                                                                if (dc.1 < 0) {
                                                                    n5 = ((int)(-1222048394L) ^ 0x14ED4F0);
                                                                    break Label_0291;
                                                                }
                                                                n5 = ((int)(-1837244340L) ^ 0x23ECF99E);
                                                            }
                                                            switch (n5 ^ ((int)1990560135L ^ 0xA128A492)) {
                                                                case 1642790035: {
                                                                    continue;
                                                                }
                                                                case 1713124551: {
                                                                    this.pkg = substring;
                                                                    final String s3 = resource;
                                                                    final String s4 = resource;
                                                                    final String str2 = ":";
                                                                    while (true) {
                                                                        int n6 = 0;
                                                                        Label_0360: {
                                                                            if (dc.c == 0) {
                                                                                n6 = ((int)1202546540L ^ 0xFB67BE3B);
                                                                                break Label_0360;
                                                                            }
                                                                            n6 = ((int)4028894L ^ 0xBD389C81);
                                                                        }
                                                                        switch (n6 ^ ((int)899870102L ^ 0x9148EF67)) {
                                                                            case 404806566: {
                                                                                continue;
                                                                            }
                                                                            case 435152814: {
                                                                                resource = s3.substring(s4.indexOf(str2) + ((int)(-422054623L) ^ 0xE6D7F520));
                                                                                while (true) {
                                                                                    int n7 = 0;
                                                                                    Label_0438: {
                                                                                        if (dc.0 <= 0) {
                                                                                            n7 = ((int)1779015640L ^ 0xA1540035);
                                                                                            break Label_0438;
                                                                                        }
                                                                                        n7 = ((int)(-2071651929L) ^ 0xCC4DBFAC);
                                                                                    }
                                                                                    switch (n7 ^ ((int)1926292102L ^ 0xDE9DAA86)) {
                                                                                        case 685734254: {
                                                                                            continue;
                                                                                        }
                                                                                        default: {
                                                                                            final String s5 = resource;
                                                                                            final int beginIndex2 = (int)1258883046L ^ 0x4B0907E6;
                                                                                            final int index = resource.indexOf(":");
                                                                                            while (true) {
                                                                                                int n8 = 0;
                                                                                                Label_0512: {
                                                                                                    if (dc.c == 0) {
                                                                                                        n8 = ((int)(-1797347850L) ^ 0x58D36ADB);
                                                                                                        break Label_0512;
                                                                                                    }
                                                                                                    n8 = ((int)(-805929083L) ^ 0x916D32DC);
                                                                                                }
                                                                                                switch (n8 ^ ((int)950255583L ^ 0xDB5DF5D1)) {
                                                                                                    case 2138920644: {
                                                                                                        continue;
                                                                                                    }
                                                                                                    default: {
                                                                                                        this.name = s5.substring(beginIndex2, index);
                                                                                                        final String s6 = resource;
                                                                                                        final String s7 = resource;
                                                                                                        final String str3 = ":";
                                                                                                        while (true) {
                                                                                                            int n9 = 0;
                                                                                                            Label_0583: {
                                                                                                                if (dc.c == 0) {
                                                                                                                    n9 = ((int)1802022919L ^ 0xE03EACAE);
                                                                                                                    break Label_0583;
                                                                                                                }
                                                                                                                n9 = ((int)288752728L ^ 0x5F67BF5);
                                                                                                            }
                                                                                                            switch (n9 ^ ((int)(-101663819L) ^ 0x3A723BD7)) {
                                                                                                                case 1926013129: {
                                                                                                                    continue;
                                                                                                                }
                                                                                                                default: {
                                                                                                                    final String substring2 = s6.substring(s7.indexOf(str3) + ((int)(-2001059959L) ^ 0x88BA3F88));
                                                                                                                    while (true) {
                                                                                                                        int n10 = 0;
                                                                                                                        Label_0660: {
                                                                                                                            if (dc.c == 0) {
                                                                                                                                n10 = ((int)(-1434328217L) ^ 0x4F2F50C9);
                                                                                                                                break Label_0660;
                                                                                                                            }
                                                                                                                            n10 = ((int)1634812501L ^ 0x5E10C03);
                                                                                                                        }
                                                                                                                        switch (n10 ^ ((int)1032676922L ^ 0xDFC24EA1)) {
                                                                                                                            case -1328152139: {
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            default: {
                                                                                                                                resource = substring2;
                                                                                                                                while (true) {
                                                                                                                                    int n11 = 0;
                                                                                                                                    Label_0723: {
                                                                                                                                        if (dc.0 <= 0) {
                                                                                                                                            n11 = ((int)(-987134885L) ^ 0xB8DB2CD0);
                                                                                                                                            break Label_0723;
                                                                                                                                        }
                                                                                                                                        n11 = ((int)(-1217156627L) ^ 0xE6CAA1EF);
                                                                                                                                    }
                                                                                                                                    switch (n11 ^ ((int)(-831854556L) ^ 0xB909D6EF)) {
                                                                                                                                        case 177313344: {
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                        case 651835081: {
                                                                                                                                            this.version = resource;
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
                                                                                                                            case 132225845: {
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 1221893323: {
                                                                                                                    throw null;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                    case 804488483: {
                                                                                                        throw null;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        case 1729157101: {
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
                                                    case -975888931: {
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
    
    public String getDownloadUrl() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          313
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/dc.c:I
        //    12: ifeq            305
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            297
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc_w           "\u5622\uaf41\u5c13\u59b5\ub249\udfd8\udc96\u929a\ufec9\u3b57\u1a57\ue4ce\u0b6a\ua9a8\u568e\ub7e0\u3986\uc28d\u5dcc\ub445\u9104"
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    invokestatic   !!! ERROR
        //    34: goto            38
        //    37: athrow         
        //    38: ldc2_w          1424986996
        //    41: l2i            
        //    42: ldc_w           1424986994
        //    45: ixor           
        //    46: anewarray       Ljava/lang/Object;
        //    49: dup            
        //    50: ldc2_w          1898991440
        //    53: l2i            
        //    54: ldc_w           1898991440
        //    57: ixor           
        //    58: aload_0         /* this */
        //    59: getstatic       dev/nuker/pyro/dc.c:I
        //    62: ifne            76
        //    65: ldc2_w          -910213856
        //    68: l2i            
        //    69: ldc_w           1587671485
        //    72: ixor           
        //    73: goto            84
        //    76: ldc2_w          -228841237
        //    79: l2i            
        //    80: ldc_w           178097110
        //    83: ixor           
        //    84: ldc2_w          568206834
        //    87: l2i            
        //    88: ldc_w           -2138339674
        //    91: ixor           
        //    92: ixor           
        //    93: lookupswitch {
        //          -901660762: 76
        //          910913481: 284
        //          default: 120
        //        }
        //   120: getfield        dev/nuker/pyro/launcher/LibraryCache$GradleResource.url:Ljava/lang/String;
        //   123: aastore        
        //   124: dup            
        //   125: ldc2_w          -2137601054
        //   128: l2i            
        //   129: ldc_w           -2137601053
        //   132: ixor           
        //   133: aload_0         /* this */
        //   134: getfield        dev/nuker/pyro/launcher/LibraryCache$GradleResource.pkg:Ljava/lang/String;
        //   137: ldc_w           "."
        //   140: ldc_w           "/"
        //   143: goto            147
        //   146: athrow         
        //   147: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   150: goto            154
        //   153: athrow         
        //   154: aastore        
        //   155: dup            
        //   156: ldc2_w          -1992012687
        //   159: l2i            
        //   160: ldc_w           -1992012685
        //   163: ixor           
        //   164: aload_0         /* this */
        //   165: getfield        dev/nuker/pyro/launcher/LibraryCache$GradleResource.name:Ljava/lang/String;
        //   168: aastore        
        //   169: dup            
        //   170: ldc2_w          -2111858788
        //   173: l2i            
        //   174: ldc_w           -2111858785
        //   177: ixor           
        //   178: aload_0         /* this */
        //   179: getstatic       dev/nuker/pyro/dc.c:I
        //   182: ifne            196
        //   185: ldc2_w          -140820322
        //   188: l2i            
        //   189: ldc_w           368872533
        //   192: ixor           
        //   193: goto            204
        //   196: ldc2_w          -1770898490
        //   199: l2i            
        //   200: ldc_w           1877518880
        //   203: ixor           
        //   204: ldc2_w          -1105917623
        //   207: l2i            
        //   208: ldc_w           -455173715
        //   211: ixor           
        //   212: ixor           
        //   213: lookupswitch {
        //          -1554972414: 240
        //          -1196663761: 196
        //          default: 286
        //        }
        //   240: getfield        dev/nuker/pyro/launcher/LibraryCache$GradleResource.version:Ljava/lang/String;
        //   243: aastore        
        //   244: dup            
        //   245: ldc2_w          1889318762
        //   248: l2i            
        //   249: ldc_w           1889318766
        //   252: ixor           
        //   253: aload_0         /* this */
        //   254: getfield        dev/nuker/pyro/launcher/LibraryCache$GradleResource.name:Ljava/lang/String;
        //   257: aastore        
        //   258: dup            
        //   259: ldc2_w          856836817
        //   262: l2i            
        //   263: ldc_w           856836820
        //   266: ixor           
        //   267: aload_0         /* this */
        //   268: getfield        dev/nuker/pyro/launcher/LibraryCache$GradleResource.version:Ljava/lang/String;
        //   271: aastore        
        //   272: goto            276
        //   275: athrow         
        //   276: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   279: goto            283
        //   282: athrow         
        //   283: areturn        
        //   284: aconst_null    
        //   285: athrow         
        //   286: aconst_null    
        //   287: athrow         
        //   288: pop            
        //   289: goto            24
        //   292: pop            
        //   293: aconst_null    
        //   294: goto            288
        //   297: dup            
        //   298: ifnull          288
        //   301: checkcast       Ljava/lang/Throwable;
        //   304: athrow         
        //   305: dup            
        //   306: ifnull          292
        //   309: checkcast       Ljava/lang/Throwable;
        //   312: athrow         
        //   313: aconst_null    
        //   314: athrow         
        //    StackMapTable: 00 1D 43 07 00 28 04 FF 00 0B 00 00 00 01 07 00 28 FC 00 03 07 00 03 45 07 00 28 40 07 00 8F 45 07 00 28 40 07 00 8F FF 00 25 00 01 07 00 03 00 05 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 FF 00 07 00 01 07 00 03 00 06 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 01 FF 00 23 00 01 07 00 03 00 05 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 59 07 00 28 FF 00 00 00 01 07 00 03 00 07 07 00 8F 07 00 D5 07 00 D5 01 07 00 8F 07 00 8F 07 00 8F 45 07 00 28 FF 00 00 00 01 07 00 03 00 05 07 00 8F 07 00 D5 07 00 D5 01 07 00 8F FF 00 29 00 01 07 00 03 00 05 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 FF 00 07 00 01 07 00 03 00 06 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 01 FF 00 23 00 01 07 00 03 00 05 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 62 07 00 1A FF 00 00 00 01 07 00 03 00 02 07 00 8F 07 00 D5 45 07 00 28 40 07 00 8F FF 00 00 00 01 07 00 03 00 05 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 FF 00 01 00 01 07 00 03 00 05 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 41 07 00 28 43 05 44 07 00 28 47 05 47 07 00 28
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     297    305    Any
        //  297    305    297    305    Any
        //  313    315    3      8      Any
        //  30     37     37     38     Any
        //  31     37     30     31     Any
        //  30     37     3      8      Any
        //  31     37     30     31     Any
        //  31     37     30     31     Ljava/lang/AssertionError;
        //  146    153    153    154    Any
        //  147    153    146    147    Ljava/lang/RuntimeException;
        //  147    153    146    147    Any
        //  147    153    146    147    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  147    153    153    154    Any
        //  275    282    282    283    Any
        //  276    282    275    276    Ljava/lang/StringIndexOutOfBoundsException;
        //  275    282    275    276    Ljava/lang/NumberFormatException;
        //  276    282    275    276    Ljava/lang/NumberFormatException;
        //  275    282    3      8      Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:660)
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
    
    public URL getDownloadUri() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          139
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/dc.1:I
        //    12: iflt            131
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            123
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/net/URL;
        //    27: dup            
        //    28: aload_0         /* this */
        //    29: goto            33
        //    32: athrow         
        //    33: invokevirtual   dev/nuker/pyro/launcher/LibraryCache$GradleResource.getDownloadUrl:()Ljava/lang/String;
        //    36: goto            40
        //    39: athrow         
        //    40: getstatic       dev/nuker/pyro/dc.1:I
        //    43: ifge            57
        //    46: ldc2_w          62379194
        //    49: l2i            
        //    50: ldc_w           -104211211
        //    53: ixor           
        //    54: goto            65
        //    57: ldc2_w          472418416
        //    60: l2i            
        //    61: ldc_w           21295598
        //    64: ixor           
        //    65: ldc2_w          -373461433
        //    68: l2i            
        //    69: ldc_w           -989193587
        //    72: ixor           
        //    73: ixor           
        //    74: lookupswitch {
        //          -691438459: 57
        //          836439380: 100
        //          default: 112
        //        }
        //   100: goto            104
        //   103: athrow         
        //   104: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //   107: goto            111
        //   110: athrow         
        //   111: areturn        
        //   112: aconst_null    
        //   113: athrow         
        //   114: pop            
        //   115: goto            24
        //   118: pop            
        //   119: aconst_null    
        //   120: goto            114
        //   123: dup            
        //   124: ifnull          114
        //   127: checkcast       Ljava/lang/Throwable;
        //   130: athrow         
        //   131: dup            
        //   132: ifnull          118
        //   135: checkcast       Ljava/lang/Throwable;
        //   138: athrow         
        //   139: aconst_null    
        //   140: athrow         
        //    StackMapTable: 00 15 43 07 00 28 04 FF 00 0B 00 00 00 01 07 00 28 FC 00 03 07 00 03 47 07 00 28 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 45 07 00 28 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 8F FF 00 10 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 8F FF 00 07 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 8F 01 FF 00 22 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 8F FF 00 02 00 00 00 01 07 00 28 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 8F 45 07 00 28 40 07 01 28 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 8F 41 07 00 28 43 05 44 07 00 28 47 05 47 07 00 28
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     123    131    Any
        //  123    131    123    131    Any
        //  139    141    3      8      Any
        //  32     39     39     40     Any
        //  33     39     32     33     Any
        //  33     39     39     40     Any
        //  33     39     39     40     Any
        //  32     39     39     40     Ljava/lang/StringIndexOutOfBoundsException;
        //  104    110    110    111    Any
        //  104    110    3      8      Any
        //  104    110    3      8      Any
        //  104    110    110    111    Any
        //  104    110    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 0], but value was: 1.
        //     at com.strobel.core.VerifyArgument.inRange(VerifyArgument.java:347)
        //     at com.strobel.assembler.ir.StackMappingVisitor.getStackValue(StackMappingVisitor.java:67)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:691)
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
    
    public File getLocalFile() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          331
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/dc.1:I
        //    12: iflt            323
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            315
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/io/File;
        //    27: dup            
        //    28: ldc_w           "\u5677\uaf4b\u5c4e\ucbbf\u2055\udf9b\udcda\u928b\u6cd4\ua953\u1a56\ue488\u0b2a\u3be8\uc4cc\ub7e0\u3986\uc28c\ucfc3\u2617\u9159\u169e\u0e33\ua289\u20e9\ucba2\u9872"
        //    31: getstatic       dev/nuker/pyro/dc.c:I
        //    34: ifne            48
        //    37: ldc2_w          2046406667
        //    40: l2i            
        //    41: ldc_w           2016134425
        //    44: ixor           
        //    45: goto            56
        //    48: ldc2_w          -671948316
        //    51: l2i            
        //    52: ldc_w           -189054751
        //    55: ixor           
        //    56: ldc2_w          -1469639872
        //    59: l2i            
        //    60: ldc_w           -1288224004
        //    63: ixor           
        //    64: ixor           
        //    65: lookupswitch {
        //          444736686: 304
        //          467595473: 48
        //          default: 92
        //        }
        //    92: goto            96
        //    95: athrow         
        //    96: invokestatic    invokestatic   !!! ERROR
        //    99: goto            103
        //   102: athrow         
        //   103: ldc2_w          -931499328
        //   106: l2i            
        //   107: ldc_w           -931499325
        //   110: ixor           
        //   111: anewarray       Ljava/lang/Object;
        //   114: dup            
        //   115: ldc2_w          -1222537055
        //   118: l2i            
        //   119: ldc_w           -1222537055
        //   122: ixor           
        //   123: aload_0         /* this */
        //   124: getfield        dev/nuker/pyro/launcher/LibraryCache$GradleResource.pkg:Ljava/lang/String;
        //   127: aastore        
        //   128: dup            
        //   129: ldc2_w          -50341812
        //   132: l2i            
        //   133: ldc_w           -50341811
        //   136: ixor           
        //   137: aload_0         /* this */
        //   138: getfield        dev/nuker/pyro/launcher/LibraryCache$GradleResource.name:Ljava/lang/String;
        //   141: aastore        
        //   142: dup            
        //   143: ldc2_w          1689949507
        //   146: l2i            
        //   147: ldc_w           1689949505
        //   150: ixor           
        //   151: aload_0         /* this */
        //   152: getstatic       dev/nuker/pyro/dc.c:I
        //   155: ifne            169
        //   158: ldc2_w          248221126
        //   161: l2i            
        //   162: ldc_w           1647046222
        //   165: ixor           
        //   166: goto            177
        //   169: ldc2_w          -1752348590
        //   172: l2i            
        //   173: ldc_w           -296336621
        //   176: ixor           
        //   177: ldc2_w          -1452876799
        //   180: l2i            
        //   181: ldc_w           938375094
        //   184: ixor           
        //   185: ixor           
        //   186: lookupswitch {
        //          -413949706: 212
        //          -228014017: 169
        //          default: 302
        //        }
        //   212: getfield        dev/nuker/pyro/launcher/LibraryCache$GradleResource.version:Ljava/lang/String;
        //   215: aastore        
        //   216: goto            220
        //   219: athrow         
        //   220: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   223: goto            227
        //   226: athrow         
        //   227: getstatic       dev/nuker/pyro/dc.1:I
        //   230: ifge            244
        //   233: ldc2_w          1580922748
        //   236: l2i            
        //   237: ldc_w           1547942561
        //   240: ixor           
        //   241: goto            252
        //   244: ldc2_w          -800453854
        //   247: l2i            
        //   248: ldc_w           -302982360
        //   251: ixor           
        //   252: ldc2_w          -2038864018
        //   255: l2i            
        //   256: ldc_w           -1218365761
        //   259: ixor           
        //   260: ixor           
        //   261: lookupswitch {
        //          862002188: 300
        //          1877113825: 244
        //          default: 288
        //        }
        //   288: goto            292
        //   291: athrow         
        //   292: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   295: goto            299
        //   298: athrow         
        //   299: areturn        
        //   300: aconst_null    
        //   301: athrow         
        //   302: aconst_null    
        //   303: athrow         
        //   304: aconst_null    
        //   305: athrow         
        //   306: pop            
        //   307: goto            24
        //   310: pop            
        //   311: aconst_null    
        //   312: goto            306
        //   315: dup            
        //   316: ifnull          306
        //   319: checkcast       Ljava/lang/Throwable;
        //   322: athrow         
        //   323: dup            
        //   324: ifnull          310
        //   327: checkcast       Ljava/lang/Throwable;
        //   330: athrow         
        //   331: aconst_null    
        //   332: athrow         
        //    StackMapTable: 00 21 43 07 00 28 04 FF 00 0B 00 00 00 01 07 00 28 FC 00 03 07 00 03 FF 00 17 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 8F FF 00 07 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 8F 01 FF 00 23 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 8F 42 07 01 10 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 8F 45 07 00 28 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 8F FF 00 41 00 01 07 00 03 00 07 08 00 18 08 00 18 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 FF 00 07 00 01 07 00 03 00 08 08 00 18 08 00 18 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 01 FF 00 22 00 01 07 00 03 00 07 08 00 18 08 00 18 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 FF 00 06 00 00 00 01 07 00 28 FF 00 00 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 8F 07 00 D5 45 07 00 28 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 8F FF 00 10 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 8F FF 00 07 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 8F 01 FF 00 23 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 8F 42 07 00 28 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 8F 45 07 00 28 40 07 01 2A FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 8F FF 00 01 00 01 07 00 03 00 07 08 00 18 08 00 18 07 00 8F 07 00 D5 07 00 D5 01 07 00 03 FF 00 01 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 8F 41 07 00 1A 43 05 44 07 00 1A 47 05 47 07 00 28
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     315    323    Ljava/lang/ClassCastException;
        //  315    323    315    323    Ljava/util/NoSuchElementException;
        //  331    333    3      8      Any
        //  95     102    102    103    Any
        //  96     102    95     96     Ljava/lang/EnumConstantNotPresentException;
        //  96     102    102    103    Any
        //  96     102    102    103    Ljava/lang/StringIndexOutOfBoundsException;
        //  96     102    3      8      Any
        //  220    226    226    227    Any
        //  220    226    226    227    Any
        //  220    226    226    227    Any
        //  220    226    3      8      Ljava/lang/ClassCastException;
        //  220    226    3      8      Ljava/lang/RuntimeException;
        //  291    298    298    299    Any
        //  292    298    3      8      Any
        //  291    298    3      8      Ljava/util/NoSuchElementException;
        //  291    298    291    292    Any
        //  291    298    298    299    Any
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
    
    static {
        throw t;
    }
    
    public LibraryCache$GradleResource(final String url, final String pkg, final String name, final String version) {
        while (true) {
            int n = 0;
            Label_0025: {
                if (dc.1 < 0) {
                    n = ((int)749569055L ^ 0xC8F33337);
                    break Label_0025;
                }
                n = ((int)775101221L ^ 0x19EA66E5);
            }
            switch (n ^ ((int)(-251374143L) ^ 0x568FC540)) {
                case -1194785958: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0090: {
                            if (dc.c == 0) {
                                n2 = ((int)1952317731L ^ 0x3E75FE41);
                                break Label_0090;
                            }
                            n2 = ((int)395429960L ^ 0x9AFF097D);
                        }
                        switch (n2 ^ ((int)939175877L ^ 0xB1CAF185)) {
                            case -870604510: {
                                continue;
                            }
                            case 190750581: {
                                this.url = url;
                                while (true) {
                                    int n3 = 0;
                                    Label_0153: {
                                        if (dc.1 < 0) {
                                            n3 = ((int)1175207167L ^ 0xE5048FD);
                                            break Label_0153;
                                        }
                                        n3 = ((int)(-1183496187L) ^ 0x3ED38D72);
                                    }
                                    switch (n3 ^ ((int)917173590L ^ 0x6804C9E)) {
                                        case 2021051850: {
                                            continue;
                                        }
                                        case -1215529793: {
                                            while (true) {
                                                int n4 = 0;
                                                Label_0215: {
                                                    if (dc.1 < 0) {
                                                        n4 = ((int)(-1479090454L) ^ 0xA4CDFD82);
                                                        break Label_0215;
                                                    }
                                                    n4 = ((int)320068389L ^ 0x4D68BC56);
                                                }
                                                switch (n4 ^ ((int)586030923L ^ 0xD04F89CC)) {
                                                    case -2033877073: {
                                                        continue;
                                                    }
                                                    default: {
                                                        this.pkg = pkg;
                                                        while (true) {
                                                            int n5 = 0;
                                                            Label_0281: {
                                                                if (dc.0 <= 0) {
                                                                    n5 = ((int)1708830233L ^ 0x7D944FB3);
                                                                    break Label_0281;
                                                                }
                                                                n5 = ((int)(-1972366998L) ^ 0xB8D6249);
                                                            }
                                                            switch (n5 ^ ((int)(-1084255425L) ^ 0xF175BF20)) {
                                                                case 1449446837: {
                                                                    continue;
                                                                }
                                                                case -807968964: {
                                                                    this.name = name;
                                                                    while (true) {
                                                                        int n6 = 0;
                                                                        Label_0345: {
                                                                            if (dc.0 <= 0) {
                                                                                n6 = ((int)(-141473698L) ^ 0xB0C06E18);
                                                                                break Label_0345;
                                                                            }
                                                                            n6 = ((int)(-189633749L) ^ 0x18F5B820);
                                                                        }
                                                                        switch (n6 ^ ((int)1925475947L ^ 0x16A3BECC)) {
                                                                            case 590804705: {
                                                                                continue;
                                                                            }
                                                                            case -2011167828: {
                                                                                while (true) {
                                                                                    int n7 = 0;
                                                                                    Label_0408: {
                                                                                        if (dc.0 <= 0) {
                                                                                            n7 = ((int)(-1929666958L) ^ 0x1F025A2D);
                                                                                            break Label_0408;
                                                                                        }
                                                                                        n7 = ((int)1317277077L ^ 0x1CD44D79);
                                                                                    }
                                                                                    switch (n7 ^ ((int)764195225L ^ 0xDBF64107)) {
                                                                                        case 1703097537: {
                                                                                            continue;
                                                                                        }
                                                                                        case -1540706190: {
                                                                                            this.version = version;
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
                                                    case -239421969: {
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
                case 1138042793: {
                    throw null;
                }
            }
            break;
        }
    }
}
