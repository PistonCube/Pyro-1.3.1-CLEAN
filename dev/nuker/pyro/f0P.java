// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.FontRenderer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class f0P implements f0V
{
    public boolean 2;
    @Nullable
    public fz<Object> c;
    @Nullable
    public f0n<?> c;
    @NotNull
    public static String 1;
    public static f0O c;
    
    public int c(final FontRenderer p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          269
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            261
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            253
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             148898227
        //    32: goto            37
        //    35: ldc             -735313385
        //    37: ldc             -310953430
        //    39: ixor           
        //    40: lookupswitch {
        //          -443073639: 238
        //          332370366: 35
        //          default: 68
        //        }
        //    68: getstatic       dev/nuker/pyro/f0A.c:Ldev/nuker/pyro/f0A;
        //    71: aload_1        
        //    72: ldc             "\u2326\u1496\u8a1d\ub1c9\uce65\ued08\ub230\ue625"
        //    74: goto            78
        //    77: athrow         
        //    78: invokestatic    invokestatic   !!! ERROR
        //    81: goto            85
        //    84: athrow         
        //    85: goto            89
        //    88: athrow         
        //    89: invokevirtual   dev/nuker/pyro/f0A.c:(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;)I
        //    92: goto            96
        //    95: athrow         
        //    96: getstatic       dev/nuker/pyro/f0A.c:Ldev/nuker/pyro/f0A;
        //    99: aload_1        
        //   100: getstatic       dev/nuker/pyro/fc.1:I
        //   103: ifeq            111
        //   106: ldc             -321009825
        //   108: goto            113
        //   111: ldc             -1022138250
        //   113: ldc             -624346867
        //   115: ixor           
        //   116: lookupswitch {
        //          433738107: 144
        //          907345490: 111
        //          default: 242
        //        }
        //   144: aload_0        
        //   145: getfield        dev/nuker/pyro/f0P.c:Ldev/nuker/pyro/f0n;
        //   148: dup            
        //   149: ifnonnull       163
        //   152: goto            156
        //   155: athrow         
        //   156: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   159: goto            163
        //   162: athrow         
        //   163: getstatic       dev/nuker/pyro/fc.1:I
        //   166: ifeq            174
        //   169: ldc             480295542
        //   171: goto            176
        //   174: ldc             -2112449322
        //   176: ldc             138503743
        //   178: ixor           
        //   179: lookupswitch {
        //          -1973947671: 204
        //          350346313: 174
        //          default: 240
        //        }
        //   204: goto            208
        //   207: athrow         
        //   208: invokevirtual   dev/nuker/pyro/f0n.2:()Ljava/lang/String;
        //   211: goto            215
        //   214: athrow         
        //   215: goto            219
        //   218: athrow         
        //   219: invokevirtual   dev/nuker/pyro/f0A.c:(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;)I
        //   222: goto            226
        //   225: athrow         
        //   226: goto            230
        //   229: athrow         
        //   230: invokestatic    java/lang/Math.max:(II)I
        //   233: goto            237
        //   236: athrow         
        //   237: ireturn        
        //   238: aconst_null    
        //   239: athrow         
        //   240: aconst_null    
        //   241: athrow         
        //   242: aconst_null    
        //   243: athrow         
        //   244: pop            
        //   245: goto            24
        //   248: pop            
        //   249: aconst_null    
        //   250: goto            244
        //   253: dup            
        //   254: ifnull          244
        //   257: checkcast       Ljava/lang/Throwable;
        //   260: athrow         
        //   261: dup            
        //   262: ifnull          248
        //   265: checkcast       Ljava/lang/Throwable;
        //   268: athrow         
        //   269: aconst_null    
        //   270: athrow         
        //    StackMapTable: 00 2D 43 07 00 37 04 FF 00 0B 00 00 00 01 07 00 37 FD 00 03 07 00 03 07 00 67 0A 41 01 1E 48 07 00 26 FF 00 00 00 02 07 00 03 07 00 67 00 03 07 00 3F 07 00 67 07 00 69 45 07 00 37 FF 00 00 00 02 07 00 03 07 00 67 00 03 07 00 3F 07 00 67 07 00 69 42 07 00 37 FF 00 00 00 02 07 00 03 07 00 67 00 03 07 00 3F 07 00 67 07 00 69 45 07 00 37 40 01 FF 00 0E 00 02 07 00 03 07 00 67 00 03 01 07 00 3F 07 00 67 FF 00 01 00 02 07 00 03 07 00 67 00 04 01 07 00 3F 07 00 67 01 FF 00 1E 00 02 07 00 03 07 00 67 00 03 01 07 00 3F 07 00 67 4A 07 00 22 FF 00 00 00 02 07 00 03 07 00 67 00 04 01 07 00 3F 07 00 67 07 00 5C 45 07 00 37 FF 00 00 00 02 07 00 03 07 00 67 00 04 01 07 00 3F 07 00 67 07 00 5C FF 00 0A 00 02 07 00 03 07 00 67 00 04 01 07 00 3F 07 00 67 07 00 5C FF 00 01 00 02 07 00 03 07 00 67 00 05 01 07 00 3F 07 00 67 07 00 5C 01 FF 00 1B 00 02 07 00 03 07 00 67 00 04 01 07 00 3F 07 00 67 07 00 5C 42 07 00 2A FF 00 00 00 02 07 00 03 07 00 67 00 04 01 07 00 3F 07 00 67 07 00 5C 45 07 00 37 FF 00 00 00 02 07 00 03 07 00 67 00 04 01 07 00 3F 07 00 67 07 00 69 42 07 00 37 FF 00 00 00 02 07 00 03 07 00 67 00 04 01 07 00 3F 07 00 67 07 00 69 45 07 00 37 FF 00 00 00 02 07 00 03 07 00 67 00 02 01 01 42 07 00 20 FF 00 00 00 02 07 00 03 07 00 67 00 02 01 01 45 07 00 37 40 01 00 FF 00 01 00 02 07 00 03 07 00 67 00 04 01 07 00 3F 07 00 67 07 00 5C FF 00 01 00 02 07 00 03 07 00 67 00 03 01 07 00 3F 07 00 67 41 07 00 37 43 05 44 07 00 37 47 05 47 07 00 37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     253    261    Any
        //  253    261    253    261    Ljava/lang/ArithmeticException;
        //  269    271    3      8      Ljava/lang/AssertionError;
        //  77     84     84     85     Any
        //  77     84     77     78     Ljava/lang/NullPointerException;
        //  77     84     3      8      Ljava/lang/UnsupportedOperationException;
        //  77     84     77     78     Ljava/util/NoSuchElementException;
        //  78     84     3      8      Any
        //  88     95     95     96     Any
        //  89     95     95     96     Ljava/lang/AssertionError;
        //  88     95     3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  88     95     88     89     Any
        //  89     95     95     96     Any
        //  155    162    162    163    Any
        //  155    162    155    156    Ljava/util/ConcurrentModificationException;
        //  156    162    162    163    Ljava/lang/ClassCastException;
        //  155    162    162    163    Ljava/lang/RuntimeException;
        //  155    162    162    163    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  207    214    214    215    Any
        //  208    214    3      8      Any
        //  208    214    3      8      Any
        //  208    214    214    215    Ljava/lang/ArithmeticException;
        //  208    214    207    208    Ljava/lang/NegativeArraySizeException;
        //  218    225    225    226    Any
        //  219    225    3      8      Any
        //  218    225    3      8      Ljava/lang/IllegalStateException;
        //  218    225    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  218    225    218    219    Any
        //  229    236    236    237    Any
        //  230    236    3      8      Any
        //  229    236    3      8      Any
        //  230    236    229    230    Ljava/lang/StringIndexOutOfBoundsException;
        //  230    236    3      8      Ljava/lang/IllegalArgumentException;
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
    
    @Override
    public void c(@NotNull final f0w f0w, @NotNull final f0y f0y, @NotNull final f0Z f0Z) {
        fbS.4M(this, 1123261516, f0w, f0y, f0Z);
    }
    
    @Override
    public boolean 1(@NotNull final f0w p0, final double p1, final double p2, @NotNull final f0y p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          763
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            755
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            747
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload           6
        //    28: pop            
        //    29: getstatic       dev/nuker/pyro/fc.1:I
        //    32: ifeq            40
        //    35: ldc             -1781375774
        //    37: goto            42
        //    40: ldc             1900134621
        //    42: ldc             1754406657
        //    44: ixor           
        //    45: lookupswitch {
        //          -46119965: 734
        //          612542716: 40
        //          default: 72
        //        }
        //    72: aload_0        
        //    73: getfield        dev/nuker/pyro/f0P.c:Ldev/nuker/pyro/f0n;
        //    76: ifnonnull       81
        //    79: iconst_0       
        //    80: ireturn        
        //    81: getstatic       dev/nuker/pyro/fc.c:I
        //    84: ifge            92
        //    87: ldc             1115997744
        //    89: goto            94
        //    92: ldc             -1506547951
        //    94: ldc             1231497878
        //    96: ixor           
        //    97: lookupswitch {
        //          -777636369: 92
        //          199486630: 728
        //          default: 124
        //        }
        //   124: aload_0        
        //   125: getfield        dev/nuker/pyro/f0P.2:Z
        //   128: ifeq            715
        //   131: dload           4
        //   133: iconst_0       
        //   134: i2d            
        //   135: dcmpl          
        //   136: iflt            627
        //   139: dload           4
        //   141: aload_1        
        //   142: goto            146
        //   145: athrow         
        //   146: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   149: goto            153
        //   152: athrow         
        //   153: i2d            
        //   154: dcmpg          
        //   155: ifgt            196
        //   158: dload_2        
        //   159: iconst_0       
        //   160: i2d            
        //   161: dcmpl          
        //   162: ifge            170
        //   165: ldc             -1371947172
        //   167: goto            172
        //   170: ldc             -1371947169
        //   172: ldc             -1977750835
        //   174: ixor           
        //   175: tableswitch {
        //          1212721954: 196
        //          1212721955: 536
        //          default: 165
        //        }
        //   196: dload           4
        //   198: aload_0        
        //   199: getstatic       dev/nuker/pyro/fc.0:I
        //   202: ifeq            210
        //   205: ldc             -212397002
        //   207: goto            212
        //   210: ldc             -160590043
        //   212: ldc             -329866566
        //   214: ixor           
        //   215: lookupswitch {
        //          -2104102850: 210
        //          520205964: 724
        //          default: 240
        //        }
        //   240: getfield        dev/nuker/pyro/f0P.c:Ldev/nuker/pyro/f0n;
        //   243: dup            
        //   244: ifnonnull       252
        //   247: ldc             -1850302696
        //   249: goto            254
        //   252: ldc             -1850302695
        //   254: ldc             1043018194
        //   256: ixor           
        //   257: tableswitch {
        //          1597726100: 280
        //          1597726101: 291
        //          default: 247
        //        }
        //   280: goto            284
        //   283: athrow         
        //   284: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   287: goto            291
        //   290: athrow         
        //   291: goto            295
        //   294: athrow         
        //   295: invokevirtual   dev/nuker/pyro/f0n.2:()Ljava/lang/String;
        //   298: goto            302
        //   301: athrow         
        //   302: ifnonnull       370
        //   305: getstatic       dev/nuker/pyro/f0y.c:I
        //   308: iconst_2       
        //   309: imul           
        //   310: aload_1        
        //   311: getstatic       dev/nuker/pyro/fc.1:I
        //   314: ifeq            322
        //   317: ldc             1614781430
        //   319: goto            324
        //   322: ldc             -1026764417
        //   324: ldc             -413816403
        //   326: ixor           
        //   327: lookupswitch {
        //          -2023083429: 322
        //          630814930: 352
        //          default: 736
        //        }
        //   352: goto            356
        //   355: athrow         
        //   356: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   359: goto            363
        //   362: athrow         
        //   363: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //   366: iadd           
        //   367: goto            478
        //   370: getstatic       dev/nuker/pyro/fc.1:I
        //   373: ifeq            381
        //   376: ldc             980192457
        //   378: goto            383
        //   381: ldc             -1923213359
        //   383: ldc             914409074
        //   385: ixor           
        //   386: lookupswitch {
        //          216812219: 722
        //          1651335755: 381
        //          default: 412
        //        }
        //   412: getstatic       dev/nuker/pyro/f0y.c:I
        //   415: iconst_2       
        //   416: imul           
        //   417: iconst_5       
        //   418: iadd           
        //   419: aload_1        
        //   420: goto            424
        //   423: athrow         
        //   424: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   427: goto            431
        //   430: athrow         
        //   431: getstatic       dev/nuker/pyro/fc.0:I
        //   434: ifeq            442
        //   437: ldc             -1853667896
        //   439: goto            444
        //   442: ldc             -1335822326
        //   444: ldc             1147308927
        //   446: ixor           
        //   447: lookupswitch {
        //          -706621769: 730
        //          -635009276: 442
        //          default: 472
        //        }
        //   472: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //   475: iconst_2       
        //   476: imul           
        //   477: iadd           
        //   478: i2d            
        //   479: dcmpg          
        //   480: ifgt            627
        //   483: dload_2        
        //   484: aload_1        
        //   485: goto            489
        //   488: athrow         
        //   489: invokevirtual   dev/nuker/pyro/f0w.5:()I
        //   492: goto            496
        //   495: athrow         
        //   496: getstatic       dev/nuker/pyro/f0y.c:I
        //   499: iadd           
        //   500: i2d            
        //   501: dcmpl          
        //   502: iflt            510
        //   505: ldc             -101878262
        //   507: goto            512
        //   510: ldc             -101878261
        //   512: ldc             -1292475690
        //   514: ixor           
        //   515: tableswitch {
        //          -1774835272: 536
        //          -1774835271: 627
        //          default: 505
        //        }
        //   536: dload_2        
        //   537: aload_1        
        //   538: goto            542
        //   541: athrow         
        //   542: invokevirtual   dev/nuker/pyro/f0w.5:()I
        //   545: goto            549
        //   548: athrow         
        //   549: aload_0        
        //   550: aload_1        
        //   551: goto            555
        //   554: athrow         
        //   555: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   558: goto            562
        //   561: athrow         
        //   562: goto            566
        //   565: athrow         
        //   566: invokespecial   dev/nuker/pyro/f0P.c:(Lnet/minecraft/client/gui/FontRenderer;)I
        //   569: goto            573
        //   572: athrow         
        //   573: iadd           
        //   574: getstatic       dev/nuker/pyro/fc.1:I
        //   577: ifeq            585
        //   580: ldc             975332600
        //   582: goto            587
        //   585: ldc             789548904
        //   587: ldc             1446264883
        //   589: ixor           
        //   590: lookupswitch {
        //          1060029676: 585
        //          1813390539: 726
        //          default: 616
        //        }
        //   616: getstatic       dev/nuker/pyro/f0y.c:I
        //   619: iconst_3       
        //   620: imul           
        //   621: iadd           
        //   622: i2d            
        //   623: dcmpg          
        //   624: ifle            715
        //   627: getstatic       dev/nuker/pyro/fc.0:I
        //   630: ifeq            638
        //   633: ldc             -32637460
        //   635: goto            640
        //   638: ldc             -1285708728
        //   640: ldc             -1226530607
        //   642: ixor           
        //   643: lookupswitch {
        //          96011417: 668
        //          1223253309: 638
        //          default: 720
        //        }
        //   668: aload_0        
        //   669: iconst_0       
        //   670: getstatic       dev/nuker/pyro/fc.1:I
        //   673: ifeq            681
        //   676: ldc             -740011417
        //   678: goto            683
        //   681: ldc             -830698167
        //   683: ldc             637833055
        //   685: ixor           
        //   686: lookupswitch {
        //          -394788330: 712
        //          -169812680: 681
        //          default: 732
        //        }
        //   712: putfield        dev/nuker/pyro/f0P.2:Z
        //   715: aload_0        
        //   716: getfield        dev/nuker/pyro/f0P.2:Z
        //   719: ireturn        
        //   720: aconst_null    
        //   721: athrow         
        //   722: aconst_null    
        //   723: athrow         
        //   724: aconst_null    
        //   725: athrow         
        //   726: aconst_null    
        //   727: athrow         
        //   728: aconst_null    
        //   729: athrow         
        //   730: aconst_null    
        //   731: athrow         
        //   732: aconst_null    
        //   733: athrow         
        //   734: aconst_null    
        //   735: athrow         
        //   736: aconst_null    
        //   737: athrow         
        //   738: pop            
        //   739: goto            24
        //   742: pop            
        //   743: aconst_null    
        //   744: goto            738
        //   747: dup            
        //   748: ifnull          738
        //   751: checkcast       Ljava/lang/Throwable;
        //   754: athrow         
        //   755: dup            
        //   756: ifnull          742
        //   759: checkcast       Ljava/lang/Throwable;
        //   762: athrow         
        //   763: aconst_null    
        //   764: athrow         
        //    StackMapTable: 00 62 43 07 00 37 04 FF 00 0B 00 00 00 01 07 00 37 FF 00 03 00 05 07 00 03 07 00 82 03 03 07 00 91 00 00 0F 41 01 1D 08 0A 41 01 1D 54 07 00 1A FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 07 00 82 45 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 01 0B 04 41 01 17 FF 00 0D 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 07 00 03 FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 03 07 00 03 01 FF 00 1B 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 07 00 03 FF 00 06 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 07 00 5C FF 00 04 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 07 00 5C FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 03 07 00 5C 01 FF 00 19 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 07 00 5C 42 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 07 00 5C 45 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 07 00 5C 42 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 07 00 5C 45 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 07 00 69 FF 00 13 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 03 01 07 00 82 FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 04 03 01 07 00 82 01 FF 00 1B 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 03 01 07 00 82 42 07 00 2E FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 03 01 07 00 82 45 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 03 01 07 00 67 46 03 4A 03 FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 01 5C 03 4A 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 03 01 07 00 82 45 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 03 01 07 00 67 FF 00 0A 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 03 01 07 00 67 FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 04 03 01 07 00 67 01 FF 00 1B 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 03 01 07 00 67 FF 00 05 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 01 FF 00 09 00 00 00 01 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 07 00 82 45 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 01 08 04 41 01 17 44 07 00 26 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 07 00 82 45 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 01 FF 00 04 00 00 00 01 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 04 03 01 07 00 03 07 00 82 45 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 04 03 01 07 00 03 07 00 67 42 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 04 03 01 07 00 03 07 00 67 45 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 03 01 01 FF 00 0B 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 01 FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 03 01 01 FF 00 1C 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 01 0A 0A 41 01 1B FF 00 0C 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 07 00 03 01 FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 07 00 03 01 01 FF 00 1C 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 07 00 03 01 02 04 41 03 FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 07 00 03 FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 01 01 FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 03 01 07 00 67 FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 07 00 03 01 01 FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 03 01 07 00 82 41 07 00 37 43 05 44 07 00 37 47 05 47 07 00 37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     747    755    Ljava/lang/ClassCastException;
        //  747    755    747    755    Any
        //  763    765    3      8      Any
        //  145    152    152    153    Any
        //  145    152    145    146    Ljava/lang/NullPointerException;
        //  145    152    152    153    Ljava/lang/ArithmeticException;
        //  146    152    152    153    Ljava/lang/IllegalStateException;
        //  145    152    152    153    Any
        //  283    290    290    291    Any
        //  284    290    283    284    Any
        //  283    290    283    284    Any
        //  284    290    283    284    Ljava/lang/StringIndexOutOfBoundsException;
        //  283    290    283    284    Ljava/lang/StringIndexOutOfBoundsException;
        //  294    301    301    302    Any
        //  294    301    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  294    301    301    302    Any
        //  295    301    301    302    Any
        //  294    301    294    295    Any
        //  355    362    362    363    Any
        //  356    362    362    363    Any
        //  355    362    362    363    Ljava/util/ConcurrentModificationException;
        //  356    362    3      8      Any
        //  356    362    355    356    Ljava/lang/IndexOutOfBoundsException;
        //  423    430    430    431    Any
        //  424    430    423    424    Ljava/lang/ClassCastException;
        //  424    430    423    424    Any
        //  423    430    430    431    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  424    430    423    424    Any
        //  489    495    495    496    Any
        //  489    495    3      8      Ljava/lang/ClassCastException;
        //  489    495    3      8      Ljava/lang/IllegalStateException;
        //  489    495    3      8      Any
        //  489    495    3      8      Ljava/lang/ClassCastException;
        //  541    548    548    549    Any
        //  541    548    541    542    Ljava/lang/ClassCastException;
        //  542    548    3      8      Ljava/lang/NegativeArraySizeException;
        //  542    548    541    542    Ljava/lang/RuntimeException;
        //  541    548    3      8      Ljava/lang/RuntimeException;
        //  555    561    561    562    Any
        //  555    561    561    562    Ljava/lang/NullPointerException;
        //  555    561    561    562    Ljava/lang/NumberFormatException;
        //  555    561    561    562    Ljava/lang/NegativeArraySizeException;
        //  555    561    561    562    Any
        //  565    572    572    573    Any
        //  565    572    572    573    Ljava/lang/ArithmeticException;
        //  565    572    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  566    572    572    573    Ljava/lang/StringIndexOutOfBoundsException;
        //  565    572    565    566    Any
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
    
    @Override
    public void 1() {
        fbS.dH(this, 2109199729);
    }
    
    public void c(@Nullable final f0n f0n) {
        fbS.bX(this, 1640248407, f0n);
    }
    
    @Nullable
    public fz c() {
        return fbS.7g(this, 297423616);
    }
    
    @Nullable
    public f0n 0() {
        return fbS.7L(this, 1608977833);
    }
    
    @Override
    public void 0(@NotNull final f0w f0w, @NotNull final f0y f0y, @NotNull final f0Z f0Z) {
        Object o = null;
        Label_0008: {
            break Label_0008;
        Label_0153:
            while (true) {
                do {
                    Label_0140: {
                        break Label_0140;
                        try {
                            o = null;
                            if (fc.1 <= 0) {
                                null;
                                goto Label_0145;
                            }
                            continue Label_0153;
                        Label_0068:
                            while (true) {
                                Label_0085: {
                                    Block_5: {
                                        break Block_5;
                                        Label_0083:
                                        final int n = 611531531;
                                        break Label_0085;
                                        Label_0132:
                                        throw null;
                                        final int n2 = 1583588292;
                                        break Label_0039;
                                    }
                                    final int n = 109236471;
                                    break Label_0085;
                                }
                                try {
                                    throw;
                                }
                                catch (StringIndexOutOfBoundsException ex) {}
                                return;
                                Label_0134:
                                throw null;
                                Label_0037:
                                final int n2 = -1107607804;
                                continue;
                            }
                            // iftrue(Label_0083:, fc.1 == 0)
                            // iftrue(Label_0037:, fc.0 == 0)
                            // switch([Lcom.strobel.decompiler.ast.Label;@6e44d89d, n2 ^ 0x915EB580)
                            // switch([Lcom.strobel.decompiler.ast.Label;@694f97bb, n ^ 0xEC9DB487)
                            Label_0116: {
                                goto Label_0124;
                            }
                        }
                        catch (EnumConstantNotPresentException ex2) {}
                    }
                    continue Label_0153;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    @Override
    public void c(@NotNull final f0w p0, final double p1, final double p2, @NotNull final f0y p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1918
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1910
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1902
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload           6
        //    28: pop            
        //    29: getstatic       dev/nuker/pyro/fc.1:I
        //    32: ifeq            40
        //    35: ldc             1857068565
        //    37: goto            42
        //    40: ldc             1587711848
        //    42: ldc             1402611157
        //    44: ixor           
        //    45: lookupswitch {
        //          221817533: 72
        //          1026210752: 40
        //          default: 1869
        //        }
        //    72: dload_2        
        //    73: getstatic       dev/nuker/pyro/fc.0:I
        //    76: ifeq            84
        //    79: ldc             -343384487
        //    81: goto            86
        //    84: ldc             -1234551733
        //    86: ldc             -4693126
        //    88: ixor           
        //    89: lookupswitch {
        //          338705699: 84
        //          1238523697: 116
        //          default: 1875
        //        }
        //   116: dstore          7
        //   118: aload_0        
        //   119: getfield        dev/nuker/pyro/f0P.c:Ldev/nuker/pyro/f0n;
        //   122: ifnonnull       126
        //   125: return         
        //   126: dload           7
        //   128: aload_1        
        //   129: goto            133
        //   132: athrow         
        //   133: invokevirtual   dev/nuker/pyro/f0w.5:()I
        //   136: goto            140
        //   139: athrow         
        //   140: i2d            
        //   141: dsub           
        //   142: getstatic       dev/nuker/pyro/fc.c:I
        //   145: ifge            153
        //   148: ldc             -1435095839
        //   150: goto            155
        //   153: ldc             1516259279
        //   155: ldc             -302046663
        //   157: ixor           
        //   158: lookupswitch {
        //          -1214290442: 184
        //          1200164568: 153
        //          default: 1871
        //        }
        //   184: dstore          7
        //   186: getstatic       dev/nuker/pyro/fc.1:I
        //   189: ifeq            197
        //   192: ldc             -813705265
        //   194: goto            199
        //   197: ldc             1150284596
        //   199: ldc             118947349
        //   201: ixor           
        //   202: lookupswitch {
        //          -932632102: 1873
        //          -456347729: 197
        //          default: 228
        //        }
        //   228: aload_0        
        //   229: getstatic       dev/nuker/pyro/fc.0:I
        //   232: ifeq            240
        //   235: ldc             -1889195549
        //   237: goto            242
        //   240: ldc             -246420550
        //   242: ldc             -1750864763
        //   244: ixor           
        //   245: lookupswitch {
        //          415679846: 240
        //          1726744383: 272
        //          default: 1885
        //        }
        //   272: aload_1        
        //   273: getstatic       dev/nuker/pyro/fc.0:I
        //   276: ifeq            284
        //   279: ldc             75655739
        //   281: goto            286
        //   284: ldc             -954853529
        //   286: ldc             -1026435977
        //   288: ixor           
        //   289: lookupswitch {
        //          -967590324: 284
        //          96977680: 316
        //          default: 1889
        //        }
        //   316: goto            320
        //   319: athrow         
        //   320: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   323: goto            327
        //   326: athrow         
        //   327: goto            331
        //   330: athrow         
        //   331: invokespecial   dev/nuker/pyro/f0P.c:(Lnet/minecraft/client/gui/FontRenderer;)I
        //   334: goto            338
        //   337: athrow         
        //   338: getstatic       dev/nuker/pyro/fc.0:I
        //   341: ifeq            349
        //   344: ldc             -813599304
        //   346: goto            351
        //   349: ldc             -2126369986
        //   351: ldc             -448815053
        //   353: ixor           
        //   354: lookupswitch {
        //          717149579: 349
        //          1685949197: 380
        //          default: 1845
        //        }
        //   380: getstatic       dev/nuker/pyro/f0y.c:I
        //   383: iconst_2       
        //   384: imul           
        //   385: iadd           
        //   386: istore          9
        //   388: aload_1        
        //   389: goto            393
        //   392: athrow         
        //   393: invokevirtual   dev/nuker/pyro/f0w.5:()I
        //   396: goto            400
        //   399: athrow         
        //   400: getstatic       dev/nuker/pyro/f0y.c:I
        //   403: iadd           
        //   404: istore          10
        //   406: iload           10
        //   408: iconst_0       
        //   409: iload           9
        //   411: aload_0        
        //   412: getfield        dev/nuker/pyro/f0P.c:Ldev/nuker/pyro/f0n;
        //   415: dup            
        //   416: ifnonnull       424
        //   419: ldc             954076014
        //   421: goto            426
        //   424: ldc             954076013
        //   426: ldc             700955651
        //   428: ixor           
        //   429: tableswitch {
        //          573796058: 452
        //          573796059: 507
        //          default: 419
        //        }
        //   452: getstatic       dev/nuker/pyro/fc.c:I
        //   455: ifge            463
        //   458: ldc             -1965144899
        //   460: goto            465
        //   463: ldc             -1577645267
        //   465: ldc             -575115270
        //   467: ixor           
        //   468: lookupswitch {
        //          -626009088: 463
        //          1466313543: 1859
        //          default: 496
        //        }
        //   496: goto            500
        //   499: athrow         
        //   500: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   503: goto            507
        //   506: athrow         
        //   507: goto            511
        //   510: athrow         
        //   511: invokevirtual   dev/nuker/pyro/f0n.2:()Ljava/lang/String;
        //   514: goto            518
        //   517: athrow         
        //   518: ifnonnull       587
        //   521: getstatic       dev/nuker/pyro/f0y.c:I
        //   524: iconst_2       
        //   525: imul           
        //   526: getstatic       dev/nuker/pyro/fc.c:I
        //   529: ifge            537
        //   532: ldc             678130913
        //   534: goto            539
        //   537: ldc             -601617395
        //   539: ldc             1900584262
        //   541: ixor           
        //   542: lookupswitch {
        //          1314341312: 537
        //          1495525799: 1847
        //          default: 568
        //        }
        //   568: aload_1        
        //   569: goto            573
        //   572: athrow         
        //   573: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   576: goto            580
        //   579: athrow         
        //   580: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //   583: iadd           
        //   584: goto            610
        //   587: getstatic       dev/nuker/pyro/f0y.c:I
        //   590: iconst_4       
        //   591: imul           
        //   592: aload_1        
        //   593: goto            597
        //   596: athrow         
        //   597: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   600: goto            604
        //   603: athrow         
        //   604: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //   607: iconst_2       
        //   608: imul           
        //   609: iadd           
        //   610: aload           6
        //   612: goto            616
        //   615: athrow         
        //   616: invokevirtual   dev/nuker/pyro/f0y.2:()I
        //   619: goto            623
        //   622: athrow         
        //   623: aload           6
        //   625: goto            629
        //   628: athrow         
        //   629: invokevirtual   dev/nuker/pyro/f0y.6:()I
        //   632: goto            636
        //   635: athrow         
        //   636: iconst_1       
        //   637: goto            641
        //   640: athrow         
        //   641: invokestatic    dev/nuker/pyro/f0A.c:(IIIIIII)V
        //   644: goto            648
        //   647: athrow         
        //   648: aload_0        
        //   649: getfield        dev/nuker/pyro/f0P.c:Ldev/nuker/pyro/f0n;
        //   652: dup            
        //   653: ifnonnull       711
        //   656: getstatic       dev/nuker/pyro/fc.1:I
        //   659: ifeq            667
        //   662: ldc             403688305
        //   664: goto            669
        //   667: ldc             -236817176
        //   669: ldc_w           141924060
        //   672: ixor           
        //   673: lookupswitch {
        //          276454829: 1891
        //          800887949: 667
        //          default: 700
        //        }
        //   700: goto            704
        //   703: athrow         
        //   704: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   707: goto            711
        //   710: athrow         
        //   711: goto            715
        //   714: athrow         
        //   715: invokevirtual   dev/nuker/pyro/f0n.2:()Ljava/lang/String;
        //   718: goto            722
        //   721: athrow         
        //   722: ifnull          891
        //   725: getstatic       dev/nuker/pyro/fc.1:I
        //   728: ifeq            737
        //   731: ldc_w           -1247430973
        //   734: goto            740
        //   737: ldc_w           -2055750984
        //   740: ldc_w           178781352
        //   743: ixor           
        //   744: lookupswitch {
        //          -1882175984: 772
        //          -1090368917: 737
        //          default: 1853
        //        }
        //   772: iload           10
        //   774: aload_1        
        //   775: goto            779
        //   778: athrow         
        //   779: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   782: goto            786
        //   785: athrow         
        //   786: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //   789: getstatic       dev/nuker/pyro/f0y.c:I
        //   792: iconst_2       
        //   793: imul           
        //   794: iadd           
        //   795: iload           10
        //   797: iload           9
        //   799: iadd           
        //   800: aload_1        
        //   801: goto            805
        //   804: athrow         
        //   805: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   808: goto            812
        //   811: athrow         
        //   812: getstatic       dev/nuker/pyro/fc.c:I
        //   815: ifge            824
        //   818: ldc_w           657859842
        //   821: goto            827
        //   824: ldc_w           650573519
        //   827: ldc_w           -513943168
        //   830: ixor           
        //   831: lookupswitch {
        //          -966001534: 824
        //          -946131121: 856
        //          default: 1849
        //        }
        //   856: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //   859: getstatic       dev/nuker/pyro/f0y.c:I
        //   862: iconst_2       
        //   863: imul           
        //   864: iadd           
        //   865: iconst_1       
        //   866: iadd           
        //   867: aload           6
        //   869: goto            873
        //   872: athrow         
        //   873: invokevirtual   dev/nuker/pyro/f0y.6:()I
        //   876: goto            880
        //   879: athrow         
        //   880: goto            884
        //   883: athrow         
        //   884: invokestatic    net/minecraft/client/gui/Gui.func_73734_a:(IIIII)V
        //   887: goto            891
        //   890: athrow         
        //   891: iload           10
        //   893: getstatic       dev/nuker/pyro/f0y.c:I
        //   896: iadd           
        //   897: istore          10
        //   899: getstatic       dev/nuker/pyro/f0A.c:Ldev/nuker/pyro/f0A;
        //   902: aload_1        
        //   903: goto            907
        //   906: athrow         
        //   907: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   910: goto            914
        //   913: athrow         
        //   914: ldc             "\u2326\u1496\u8a1d\ub1c9\uce65\ued08\ub230\ue625"
        //   916: getstatic       dev/nuker/pyro/fc.1:I
        //   919: ifeq            928
        //   922: ldc_w           1869065729
        //   925: goto            931
        //   928: ldc_w           -328984497
        //   931: ldc_w           -2004257919
        //   934: ixor           
        //   935: lookupswitch {
        //          -403776128: 928
        //          1693281230: 960
        //          default: 1881
        //        }
        //   960: goto            964
        //   963: athrow         
        //   964: invokestatic    invokestatic   !!! ERROR
        //   967: goto            971
        //   970: athrow         
        //   971: getstatic       dev/nuker/pyro/fc.c:I
        //   974: ifge            983
        //   977: ldc_w           -1918605969
        //   980: goto            986
        //   983: ldc_w           -1551979113
        //   986: ldc_w           803143054
        //   989: ixor           
        //   990: lookupswitch {
        //          -1935650791: 1016
        //          -1569023775: 983
        //          default: 1855
        //        }
        //  1016: iload           10
        //  1018: getstatic       dev/nuker/pyro/f0y.c:I
        //  1021: iconst_1       
        //  1022: iadd           
        //  1023: dload           4
        //  1025: getstatic       dev/nuker/pyro/fc.1:I
        //  1028: ifeq            1037
        //  1031: ldc_w           -2092348387
        //  1034: goto            1040
        //  1037: ldc_w           -1860662342
        //  1040: ldc_w           -392911176
        //  1043: ixor           
        //  1044: lookupswitch {
        //          1809705637: 1037
        //          2039229698: 1072
        //          default: 1861
        //        }
        //  1072: getstatic       dev/nuker/pyro/f0y.c:I
        //  1075: i2d            
        //  1076: dcmpl          
        //  1077: iflt            1300
        //  1080: dload           7
        //  1082: getstatic       dev/nuker/pyro/f0y.c:I
        //  1085: i2d            
        //  1086: dcmpl          
        //  1087: iflt            1300
        //  1090: dload           4
        //  1092: aload_1        
        //  1093: goto            1097
        //  1096: athrow         
        //  1097: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //  1100: goto            1104
        //  1103: athrow         
        //  1104: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //  1107: getstatic       dev/nuker/pyro/f0y.c:I
        //  1110: iadd           
        //  1111: i2d            
        //  1112: dcmpg          
        //  1113: ifgt            1300
        //  1116: getstatic       dev/nuker/pyro/fc.0:I
        //  1119: ifeq            1128
        //  1122: ldc_w           866742747
        //  1125: goto            1131
        //  1128: ldc_w           -958389502
        //  1131: ldc_w           -2124769875
        //  1134: ixor           
        //  1135: lookupswitch {
        //          -1292639114: 1887
        //          -744069763: 1128
        //          default: 1160
        //        }
        //  1160: dload           7
        //  1162: aload_1        
        //  1163: goto            1167
        //  1166: athrow         
        //  1167: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //  1170: goto            1174
        //  1173: athrow         
        //  1174: ldc             "\u2326\u1496\u8a1d\ub1c9\uce65\ued08\ub230\ue625"
        //  1176: goto            1180
        //  1179: athrow         
        //  1180: invokestatic    invokestatic   !!! ERROR
        //  1183: goto            1187
        //  1186: athrow         
        //  1187: getstatic       dev/nuker/pyro/fc.0:I
        //  1190: ifeq            1199
        //  1193: ldc_w           393541711
        //  1196: goto            1202
        //  1199: ldc_w           -668481347
        //  1202: ldc_w           898621354
        //  1205: ixor           
        //  1206: lookupswitch {
        //          -307751145: 1232
        //          586885093: 1199
        //          default: 1883
        //        }
        //  1232: goto            1236
        //  1235: athrow         
        //  1236: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78256_a:(Ljava/lang/String;)I
        //  1239: goto            1243
        //  1242: athrow         
        //  1243: i2d            
        //  1244: dcmpg          
        //  1245: ifgt            1254
        //  1248: ldc_w           458349366
        //  1251: goto            1257
        //  1254: ldc_w           458349365
        //  1257: ldc_w           1360571543
        //  1260: ixor           
        //  1261: tableswitch {
        //          -1802309822: 1284
        //          -1802309821: 1300
        //          default: 1248
        //        }
        //  1284: aload           6
        //  1286: goto            1290
        //  1289: athrow         
        //  1290: invokevirtual   dev/nuker/pyro/f0y.6:()I
        //  1293: goto            1297
        //  1296: athrow         
        //  1297: goto            1313
        //  1300: aload           6
        //  1302: goto            1306
        //  1305: athrow         
        //  1306: invokevirtual   dev/nuker/pyro/f0y.0:()I
        //  1309: goto            1313
        //  1312: athrow         
        //  1313: goto            1317
        //  1316: athrow         
        //  1317: invokevirtual   dev/nuker/pyro/f0A.0:(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;III)V
        //  1320: goto            1324
        //  1323: athrow         
        //  1324: aload_0        
        //  1325: getstatic       dev/nuker/pyro/fc.0:I
        //  1328: ifeq            1337
        //  1331: ldc_w           -1502020274
        //  1334: goto            1340
        //  1337: ldc_w           -66059018
        //  1340: ldc_w           -1142067193
        //  1343: ixor           
        //  1344: lookupswitch {
        //          496340297: 1851
        //          1813870032: 1337
        //          default: 1372
        //        }
        //  1372: getfield        dev/nuker/pyro/f0P.c:Ldev/nuker/pyro/f0n;
        //  1375: dup            
        //  1376: ifnonnull       1390
        //  1379: goto            1383
        //  1382: athrow         
        //  1383: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1386: goto            1390
        //  1389: athrow         
        //  1390: goto            1394
        //  1393: athrow         
        //  1394: invokevirtual   dev/nuker/pyro/f0n.2:()Ljava/lang/String;
        //  1397: goto            1401
        //  1400: athrow         
        //  1401: ifnull          1410
        //  1404: ldc_w           1989790898
        //  1407: goto            1413
        //  1410: ldc_w           1989790893
        //  1413: ldc_w           -51352611
        //  1416: ixor           
        //  1417: tableswitch {
        //          349392606: 1440
        //          349392607: 1844
        //          default: 1404
        //        }
        //  1440: getstatic       dev/nuker/pyro/f0A.c:Ldev/nuker/pyro/f0A;
        //  1443: getstatic       dev/nuker/pyro/fc.0:I
        //  1446: ifeq            1455
        //  1449: ldc_w           -1157408770
        //  1452: goto            1458
        //  1455: ldc_w           -601275006
        //  1458: ldc_w           -787712236
        //  1461: ixor           
        //  1462: lookupswitch {
        //          -2013303336: 1455
        //          1779376362: 1857
        //          default: 1488
        //        }
        //  1488: aload_1        
        //  1489: goto            1493
        //  1492: athrow         
        //  1493: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //  1496: goto            1500
        //  1499: athrow         
        //  1500: aload_0        
        //  1501: getfield        dev/nuker/pyro/f0P.c:Ldev/nuker/pyro/f0n;
        //  1504: dup            
        //  1505: ifnonnull       1514
        //  1508: ldc_w           -1257442933
        //  1511: goto            1517
        //  1514: ldc_w           -1257442934
        //  1517: ldc_w           2129989709
        //  1520: ixor           
        //  1521: tableswitch {
        //          -1745632372: 1544
        //          -1745632371: 1555
        //          default: 1508
        //        }
        //  1544: goto            1548
        //  1547: athrow         
        //  1548: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1551: goto            1555
        //  1554: athrow         
        //  1555: getstatic       dev/nuker/pyro/fc.c:I
        //  1558: ifge            1567
        //  1561: ldc_w           502341622
        //  1564: goto            1570
        //  1567: ldc_w           206042679
        //  1570: ldc_w           1697901161
        //  1573: ixor           
        //  1574: lookupswitch {
        //          -257341673: 1567
        //          2026042783: 1865
        //          default: 1600
        //        }
        //  1600: goto            1604
        //  1603: athrow         
        //  1604: invokevirtual   dev/nuker/pyro/f0n.2:()Ljava/lang/String;
        //  1607: goto            1611
        //  1610: athrow         
        //  1611: iload           10
        //  1613: getstatic       dev/nuker/pyro/fc.c:I
        //  1616: ifge            1625
        //  1619: ldc_w           -1454355887
        //  1622: goto            1628
        //  1625: ldc_w           765839615
        //  1628: ldc_w           -2032362436
        //  1631: ixor           
        //  1632: lookupswitch {
        //          -1418111805: 1660
        //          797759085: 1625
        //          default: 1877
        //        }
        //  1660: aload_1        
        //  1661: getstatic       dev/nuker/pyro/fc.1:I
        //  1664: ifeq            1673
        //  1667: ldc_w           2004877097
        //  1670: goto            1676
        //  1673: ldc_w           -1721399933
        //  1676: ldc_w           -111482483
        //  1679: ixor           
        //  1680: lookupswitch {
        //          -1910171996: 1879
        //          1101724111: 1673
        //          default: 1708
        //        }
        //  1708: goto            1712
        //  1711: athrow         
        //  1712: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //  1715: goto            1719
        //  1718: athrow         
        //  1719: getstatic       dev/nuker/pyro/fc.c:I
        //  1722: ifge            1731
        //  1725: ldc_w           -807479560
        //  1728: goto            1734
        //  1731: ldc_w           -806800590
        //  1734: ldc_w           633609011
        //  1737: ixor           
        //  1738: lookupswitch {
        //          -367342133: 1731
        //          -366139391: 1764
        //          default: 1863
        //        }
        //  1764: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //  1767: getstatic       dev/nuker/pyro/f0y.c:I
        //  1770: iconst_3       
        //  1771: imul           
        //  1772: iadd           
        //  1773: iconst_1       
        //  1774: iadd           
        //  1775: getstatic       dev/nuker/pyro/fc.0:I
        //  1778: ifeq            1787
        //  1781: ldc_w           -1153093812
        //  1784: goto            1790
        //  1787: ldc_w           542695370
        //  1790: ldc_w           2050772432
        //  1793: ixor           
        //  1794: lookupswitch {
        //          -1049009508: 1787
        //          1516540442: 1820
        //          default: 1867
        //        }
        //  1820: aload           6
        //  1822: goto            1826
        //  1825: athrow         
        //  1826: invokevirtual   dev/nuker/pyro/f0y.0:()I
        //  1829: goto            1833
        //  1832: athrow         
        //  1833: goto            1837
        //  1836: athrow         
        //  1837: invokevirtual   dev/nuker/pyro/f0A.0:(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;III)V
        //  1840: goto            1844
        //  1843: athrow         
        //  1844: return         
        //  1845: aconst_null    
        //  1846: athrow         
        //  1847: aconst_null    
        //  1848: athrow         
        //  1849: aconst_null    
        //  1850: athrow         
        //  1851: aconst_null    
        //  1852: athrow         
        //  1853: aconst_null    
        //  1854: athrow         
        //  1855: aconst_null    
        //  1856: athrow         
        //  1857: aconst_null    
        //  1858: athrow         
        //  1859: aconst_null    
        //  1860: athrow         
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
        //  1893: pop            
        //  1894: goto            24
        //  1897: pop            
        //  1898: aconst_null    
        //  1899: goto            1893
        //  1902: dup            
        //  1903: ifnull          1893
        //  1906: checkcast       Ljava/lang/Throwable;
        //  1909: athrow         
        //  1910: dup            
        //  1911: ifnull          1897
        //  1914: checkcast       Ljava/lang/Throwable;
        //  1917: athrow         
        //  1918: aconst_null    
        //  1919: athrow         
        //    StackMapTable: 01 05 FF 00 03 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 01 07 00 37 FA 00 04 FF 00 0B 00 00 00 01 07 00 37 FF 00 03 00 05 07 00 03 07 00 82 03 03 07 00 91 00 00 0F 41 01 1D 4B 03 FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 01 5D 03 FC 00 09 03 45 07 00 26 FF 00 00 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 02 03 07 00 82 45 07 00 37 FF 00 00 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 02 03 01 4C 03 FF 00 01 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 02 03 01 5C 03 0C 41 01 1C 4B 07 00 03 FF 00 01 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 02 07 00 03 01 5D 07 00 03 FF 00 0B 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 02 07 00 03 07 00 82 FF 00 01 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 03 07 00 03 07 00 82 01 FF 00 1D 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 02 07 00 03 07 00 82 42 07 00 74 FF 00 00 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 02 07 00 03 07 00 82 45 07 00 37 FF 00 00 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 02 07 00 03 07 00 67 42 07 00 18 FF 00 00 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 02 07 00 03 07 00 67 45 07 00 37 40 01 4A 01 FF 00 01 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 02 01 01 5C 01 FF 00 0B 00 07 07 00 03 07 00 82 03 03 07 00 91 03 01 00 01 07 00 30 40 07 00 82 45 07 00 37 40 01 FF 00 12 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 07 00 5C FF 00 04 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 07 00 5C FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 01 01 01 07 00 5C 01 FF 00 19 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 07 00 5C FF 00 0A 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 07 00 5C FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 01 01 01 07 00 5C 01 FF 00 1E 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 07 00 5C 42 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 07 00 5C 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 07 00 5C 42 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 07 00 5C 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 07 00 69 FF 00 12 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 01 FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 01 01 01 01 01 FF 00 1C 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 01 43 07 00 30 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 01 01 01 01 07 00 82 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 01 01 01 01 07 00 67 FF 00 06 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 01 01 01 48 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 01 01 01 01 07 00 82 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 01 01 01 01 07 00 67 FF 00 05 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 01 44 07 00 26 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 01 01 01 01 07 00 91 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 01 01 01 01 01 44 07 00 24 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 01 01 01 01 01 07 00 91 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 01 01 01 01 01 01 43 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 07 01 01 01 01 01 01 01 45 07 00 37 00 52 07 00 5C FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 02 07 00 5C 01 5E 07 00 5C 42 07 00 16 40 07 00 5C 45 07 00 37 40 07 00 5C FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 01 07 00 5C 45 07 00 37 40 07 00 69 0E 42 01 1F FF 00 05 00 00 00 01 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 02 01 07 00 82 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 02 01 07 00 67 51 07 00 1C FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 07 00 82 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 07 00 67 FF 00 0B 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 07 00 67 FF 00 02 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 01 01 01 07 00 67 01 FF 00 1C 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 07 00 67 FF 00 0F 00 00 00 01 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 01 01 01 01 07 00 91 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 01 01 01 01 01 42 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 01 01 01 01 01 45 07 00 37 00 FF 00 0E 00 00 00 01 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 02 07 00 3F 07 00 82 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 02 07 00 3F 07 00 67 FF 00 0D 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 69 FF 00 02 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 07 00 3F 07 00 67 07 00 69 01 FF 00 1C 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 69 42 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 69 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 69 FF 00 0B 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 69 FF 00 02 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 07 00 3F 07 00 67 07 00 69 01 FF 00 1D 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 69 FF 00 14 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 07 00 3F 07 00 67 07 00 69 01 01 03 FF 00 02 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 07 07 00 3F 07 00 67 07 00 69 01 01 03 01 FF 00 1F 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 07 00 3F 07 00 67 07 00 69 01 01 03 57 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 07 07 00 3F 07 00 67 07 00 69 01 01 03 07 00 82 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 07 07 00 3F 07 00 67 07 00 69 01 01 03 07 00 67 FF 00 17 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 01 FF 00 02 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 07 00 3F 07 00 67 07 00 69 01 01 01 FF 00 1C 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 01 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 07 07 00 3F 07 00 67 07 00 69 01 01 03 07 00 82 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 07 07 00 3F 07 00 67 07 00 69 01 01 03 07 00 67 44 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 08 07 00 3F 07 00 67 07 00 69 01 01 03 07 00 67 07 00 69 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 08 07 00 3F 07 00 67 07 00 69 01 01 03 07 00 67 07 00 69 FF 00 0B 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 08 07 00 3F 07 00 67 07 00 69 01 01 03 07 00 67 07 00 69 FF 00 02 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 09 07 00 3F 07 00 67 07 00 69 01 01 03 07 00 67 07 00 69 01 FF 00 1D 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 08 07 00 3F 07 00 67 07 00 69 01 01 03 07 00 67 07 00 69 42 07 00 74 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 08 07 00 3F 07 00 67 07 00 69 01 01 03 07 00 67 07 00 69 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 07 07 00 3F 07 00 67 07 00 69 01 01 03 01 FF 00 04 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 01 FF 00 05 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 01 FF 00 02 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 07 00 3F 07 00 67 07 00 69 01 01 01 FF 00 1A 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 01 44 07 00 1A FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 07 00 3F 07 00 67 07 00 69 01 01 07 00 91 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 07 00 3F 07 00 67 07 00 69 01 01 01 FF 00 02 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 01 44 07 00 1E FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 07 00 3F 07 00 67 07 00 69 01 01 07 00 91 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 07 00 3F 07 00 67 07 00 69 01 01 01 42 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 07 00 3F 07 00 67 07 00 69 01 01 01 45 07 00 37 00 4C 07 00 03 FF 00 02 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 02 07 00 03 01 5F 07 00 03 49 07 00 37 40 07 00 5C 45 07 00 37 40 07 00 5C 42 07 00 37 40 07 00 5C 45 07 00 37 40 07 00 69 02 05 42 01 1A 4E 07 00 3F FF 00 02 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 02 07 00 3F 01 5D 07 00 3F 43 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 02 07 00 3F 07 00 82 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 02 07 00 3F 07 00 67 FF 00 07 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 5C FF 00 05 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 5C FF 00 02 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 07 00 3F 07 00 67 07 00 5C 01 FF 00 1A 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 5C 42 07 00 2A FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 5C 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 5C FF 00 0B 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 5C FF 00 02 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 07 00 3F 07 00 67 07 00 5C 01 FF 00 1D 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 5C 42 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 5C 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 69 FF 00 0D 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 07 00 3F 07 00 67 07 00 69 01 FF 00 02 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 01 FF 00 1F 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 07 00 3F 07 00 67 07 00 69 01 FF 00 0C 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 07 00 82 FF 00 02 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 07 00 3F 07 00 67 07 00 69 01 07 00 82 01 FF 00 1F 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 07 00 82 FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 07 00 82 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 07 00 67 FF 00 0B 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 07 00 67 FF 00 02 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 07 00 3F 07 00 67 07 00 69 01 07 00 67 01 FF 00 1D 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 07 00 67 FF 00 16 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 01 FF 00 02 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 07 00 3F 07 00 67 07 00 69 01 01 01 FF 00 1D 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 01 44 07 00 1A FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 07 00 3F 07 00 67 07 00 69 01 01 07 00 91 45 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 07 00 3F 07 00 67 07 00 69 01 01 01 42 07 00 37 FF 00 00 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 07 00 3F 07 00 67 07 00 69 01 01 01 45 07 00 37 00 FF 00 00 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 01 01 FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 01 FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 07 00 67 41 07 00 03 01 FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 69 41 07 00 3F FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 01 01 01 07 00 5C FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 06 07 00 3F 07 00 67 07 00 69 01 01 03 FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 07 00 67 FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 5C FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 01 F8 00 01 FF 00 01 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 01 03 01 FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 01 03 FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 04 07 00 3F 07 00 67 07 00 69 01 FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 07 00 82 FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 03 07 00 3F 07 00 67 07 00 69 FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 08 07 00 3F 07 00 67 07 00 69 01 01 03 07 00 67 07 00 69 FF 00 01 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 01 07 00 03 FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 05 07 00 3F 07 00 67 07 00 69 01 01 FF 00 01 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 02 07 00 03 07 00 82 FF 00 01 00 08 07 00 03 07 00 82 03 03 07 00 91 03 01 01 00 01 07 00 5C FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 01 07 00 37 43 05 44 07 00 37 47 05 FF 00 07 00 06 07 00 03 07 00 82 03 03 07 00 91 03 00 01 07 00 37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1902   1910   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1902   1910   1902   1910   Any
        //  1918   1920   3      8      Ljava/lang/NullPointerException;
        //  132    139    139    140    Any
        //  133    139    132    133    Ljava/lang/IndexOutOfBoundsException;
        //  132    139    139    140    Any
        //  132    139    132    133    Ljava/lang/NumberFormatException;
        //  133    139    3      8      Ljava/lang/IllegalStateException;
        //  319    326    326    327    Any
        //  319    326    3      8      Ljava/util/NoSuchElementException;
        //  319    326    326    327    Any
        //  319    326    319    320    Ljava/lang/NumberFormatException;
        //  319    326    3      8      Any
        //  330    337    337    338    Any
        //  331    337    330    331    Ljava/lang/AssertionError;
        //  330    337    3      8      Ljava/lang/ArithmeticException;
        //  331    337    337    338    Ljava/lang/IndexOutOfBoundsException;
        //  330    337    337    338    Ljava/lang/IllegalStateException;
        //  392    399    399    400    Any
        //  392    399    399    400    Ljava/lang/ArithmeticException;
        //  392    399    3      8      Ljava/util/ConcurrentModificationException;
        //  393    399    392    393    Ljava/lang/IllegalArgumentException;
        //  392    399    3      8      Any
        //  499    506    506    507    Any
        //  499    506    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  499    506    3      8      Ljava/util/ConcurrentModificationException;
        //  500    506    3      8      Any
        //  500    506    499    500    Any
        //  510    517    517    518    Any
        //  511    517    517    518    Any
        //  511    517    510    511    Any
        //  510    517    510    511    Any
        //  510    517    510    511    Any
        //  572    579    579    580    Any
        //  572    579    572    573    Ljava/lang/IllegalArgumentException;
        //  572    579    579    580    Any
        //  573    579    579    580    Ljava/lang/NumberFormatException;
        //  573    579    3      8      Any
        //  596    603    603    604    Any
        //  597    603    603    604    Ljava/lang/IndexOutOfBoundsException;
        //  597    603    3      8      Any
        //  597    603    3      8      Any
        //  596    603    596    597    Any
        //  615    622    622    623    Any
        //  615    622    615    616    Ljava/lang/StringIndexOutOfBoundsException;
        //  615    622    622    623    Any
        //  616    622    615    616    Ljava/lang/UnsupportedOperationException;
        //  615    622    3      8      Any
        //  628    635    635    636    Any
        //  629    635    3      8      Ljava/lang/NumberFormatException;
        //  628    635    3      8      Ljava/lang/NullPointerException;
        //  628    635    628    629    Ljava/lang/ClassCastException;
        //  628    635    3      8      Any
        //  640    647    647    648    Any
        //  641    647    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  641    647    647    648    Any
        //  641    647    640    641    Any
        //  641    647    647    648    Any
        //  703    710    710    711    Any
        //  703    710    3      8      Any
        //  703    710    3      8      Ljava/util/ConcurrentModificationException;
        //  703    710    703    704    Ljava/lang/ArithmeticException;
        //  703    710    710    711    Ljava/lang/AssertionError;
        //  715    721    721    722    Any
        //  715    721    721    722    Any
        //  715    721    3      8      Ljava/lang/NumberFormatException;
        //  715    721    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  715    721    3      8      Any
        //  779    785    785    786    Any
        //  779    785    3      8      Any
        //  779    785    3      8      Any
        //  779    785    785    786    Ljava/lang/UnsupportedOperationException;
        //  779    785    785    786    Any
        //  804    811    811    812    Any
        //  804    811    804    805    Ljava/lang/UnsupportedOperationException;
        //  805    811    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  804    811    3      8      Any
        //  804    811    811    812    Any
        //  873    879    879    880    Any
        //  873    879    3      8      Ljava/lang/RuntimeException;
        //  873    879    879    880    Ljava/lang/IndexOutOfBoundsException;
        //  873    879    3      8      Ljava/util/ConcurrentModificationException;
        //  873    879    879    880    Ljava/lang/IllegalStateException;
        //  883    890    890    891    Any
        //  884    890    3      8      Ljava/lang/ArithmeticException;
        //  883    890    883    884    Any
        //  883    890    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  883    890    890    891    Any
        //  907    913    913    914    Any
        //  907    913    3      8      Ljava/util/NoSuchElementException;
        //  907    913    3      8      Any
        //  907    913    913    914    Ljava/lang/NumberFormatException;
        //  907    913    913    914    Ljava/lang/IllegalArgumentException;
        //  963    970    970    971    Any
        //  964    970    970    971    Any
        //  963    970    963    964    Any
        //  964    970    963    964    Any
        //  963    970    3      8      Ljava/lang/ClassCastException;
        //  1096   1103   1103   1104   Any
        //  1097   1103   1103   1104   Any
        //  1096   1103   3      8      Ljava/lang/ArithmeticException;
        //  1096   1103   3      8      Ljava/lang/AssertionError;
        //  1097   1103   1096   1097   Any
        //  1166   1173   1173   1174   Any
        //  1167   1173   1173   1174   Any
        //  1167   1173   1166   1167   Any
        //  1166   1173   3      8      Any
        //  1166   1173   1166   1167   Ljava/lang/ArithmeticException;
        //  1179   1186   1186   1187   Any
        //  1180   1186   3      8      Any
        //  1179   1186   1186   1187   Ljava/lang/NullPointerException;
        //  1179   1186   1186   1187   Any
        //  1180   1186   1179   1180   Any
        //  1235   1242   1242   1243   Any
        //  1236   1242   1242   1243   Any
        //  1235   1242   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1236   1242   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1236   1242   1235   1236   Ljava/lang/NumberFormatException;
        //  1289   1296   1296   1297   Any
        //  1289   1296   3      8      Any
        //  1290   1296   1289   1290   Ljava/lang/NullPointerException;
        //  1289   1296   1296   1297   Ljava/lang/AssertionError;
        //  1289   1296   3      8      Ljava/lang/IllegalStateException;
        //  1305   1312   1312   1313   Any
        //  1306   1312   1305   1306   Ljava/util/NoSuchElementException;
        //  1305   1312   3      8      Ljava/lang/NegativeArraySizeException;
        //  1305   1312   3      8      Any
        //  1306   1312   1312   1313   Any
        //  1316   1323   1323   1324   Any
        //  1317   1323   1323   1324   Any
        //  1317   1323   1323   1324   Any
        //  1317   1323   1323   1324   Any
        //  1317   1323   1316   1317   Any
        //  1382   1389   1389   1390   Any
        //  1383   1389   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1382   1389   1382   1383   Ljava/lang/AssertionError;
        //  1383   1389   1382   1383   Any
        //  1382   1389   1382   1383   Any
        //  1393   1400   1400   1401   Any
        //  1393   1400   1393   1394   Ljava/lang/UnsupportedOperationException;
        //  1393   1400   1393   1394   Any
        //  1394   1400   1393   1394   Ljava/lang/NegativeArraySizeException;
        //  1393   1400   3      8      Any
        //  1492   1499   1499   1500   Any
        //  1493   1499   1499   1500   Ljava/lang/IllegalStateException;
        //  1492   1499   3      8      Ljava/lang/NullPointerException;
        //  1492   1499   1492   1493   Any
        //  1492   1499   1499   1500   Any
        //  1547   1554   1554   1555   Any
        //  1548   1554   1554   1555   Any
        //  1548   1554   1547   1548   Ljava/lang/NegativeArraySizeException;
        //  1547   1554   3      8      Ljava/lang/ClassCastException;
        //  1548   1554   3      8      Any
        //  1603   1610   1610   1611   Any
        //  1603   1610   1603   1604   Any
        //  1604   1610   3      8      Ljava/lang/NegativeArraySizeException;
        //  1604   1610   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1604   1610   3      8      Ljava/lang/ArithmeticException;
        //  1712   1718   1718   1719   Any
        //  1712   1718   3      8      Ljava/lang/RuntimeException;
        //  1712   1718   3      8      Ljava/lang/IllegalArgumentException;
        //  1712   1718   3      8      Ljava/lang/AssertionError;
        //  1712   1718   1718   1719   Any
        //  1825   1832   1832   1833   Any
        //  1825   1832   3      8      Any
        //  1825   1832   3      8      Ljava/lang/RuntimeException;
        //  1825   1832   3      8      Any
        //  1826   1832   1825   1826   Ljava/lang/NullPointerException;
        //  1836   1843   1843   1844   Any
        //  1837   1843   3      8      Ljava/lang/AssertionError;
        //  1836   1843   3      8      Any
        //  1836   1843   3      8      Ljava/lang/NegativeArraySizeException;
        //  1837   1843   1836   1837   Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:600)
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
    
    public void c(@Nullable final fz fz) {
        fbS.1R(this, 881111463, fz);
    }
    
    @Override
    public void 2(@NotNull final f0w p0, final double p1, final double p2, @NotNull final f0y p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          251
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            243
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            235
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload           6
        //    28: pop            
        //    29: aload_0        
        //    30: getfield        dev/nuker/pyro/f0P.c:Ldev/nuker/pyro/f0n;
        //    33: ifnonnull       37
        //    36: return         
        //    37: dload_2        
        //    38: iconst_0       
        //    39: i2d            
        //    40: dcmpl          
        //    41: iflt            50
        //    44: ldc_w           844752942
        //    47: goto            53
        //    50: ldc_w           844752943
        //    53: ldc_w           504744788
        //    56: ixor           
        //    57: tableswitch {
        //          1486374644: 80
        //          1486374645: 221
        //          default: 44
        //        }
        //    80: dload           4
        //    82: iconst_0       
        //    83: i2d            
        //    84: dcmpl          
        //    85: iflt            221
        //    88: dload_2        
        //    89: aload_1        
        //    90: goto            94
        //    93: athrow         
        //    94: invokevirtual   dev/nuker/pyro/f0w.5:()I
        //    97: goto            101
        //   100: athrow         
        //   101: i2d            
        //   102: dcmpg          
        //   103: ifgt            221
        //   106: getstatic       dev/nuker/pyro/fc.c:I
        //   109: ifge            118
        //   112: ldc_w           -395216563
        //   115: goto            121
        //   118: ldc_w           -1716075060
        //   121: ldc_w           -1869062075
        //   124: ixor           
        //   125: lookupswitch {
        //          1888075008: 118
        //          2028542216: 224
        //          default: 152
        //        }
        //   152: dload           4
        //   154: aload_1        
        //   155: goto            159
        //   158: athrow         
        //   159: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   162: goto            166
        //   165: athrow         
        //   166: i2d            
        //   167: dcmpg          
        //   168: ifgt            221
        //   171: getstatic       dev/nuker/pyro/fc.0:I
        //   174: ifeq            183
        //   177: ldc_w           -760620288
        //   180: goto            186
        //   183: ldc_w           -1207237361
        //   186: ldc_w           -2025087244
        //   189: ixor           
        //   190: lookupswitch {
        //          1061198843: 216
        //          1440892404: 183
        //          default: 222
        //        }
        //   216: aload_0        
        //   217: iconst_1       
        //   218: putfield        dev/nuker/pyro/f0P.2:Z
        //   221: return         
        //   222: aconst_null    
        //   223: athrow         
        //   224: aconst_null    
        //   225: athrow         
        //   226: pop            
        //   227: goto            24
        //   230: pop            
        //   231: aconst_null    
        //   232: goto            226
        //   235: dup            
        //   236: ifnull          226
        //   239: checkcast       Ljava/lang/Throwable;
        //   242: athrow         
        //   243: dup            
        //   244: ifnull          230
        //   247: checkcast       Ljava/lang/Throwable;
        //   250: athrow         
        //   251: aconst_null    
        //   252: athrow         
        //    StackMapTable: 00 1F 43 07 00 37 04 FF 00 0B 00 00 00 01 07 00 37 FF 00 03 00 05 07 00 03 07 00 82 03 03 07 00 91 00 00 0C 06 05 42 01 1A 4C 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 07 00 82 45 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 01 10 42 01 1E 45 07 00 30 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 07 00 82 45 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 01 10 42 01 1D 04 00 01 41 07 00 37 43 05 44 07 00 37 47 05 47 07 00 37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     235    243    Any
        //  235    243    235    243    Ljava/lang/IllegalArgumentException;
        //  251    253    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  93     100    100    101    Any
        //  93     100    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  94     100    3      8      Any
        //  94     100    93     94     Any
        //  93     100    100    101    Ljava/lang/EnumConstantNotPresentException;
        //  158    165    165    166    Any
        //  158    165    158    159    Ljava/lang/IllegalArgumentException;
        //  158    165    3      8      Any
        //  158    165    3      8      Ljava/util/NoSuchElementException;
        //  158    165    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 52 out of bounds for length 52
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
    
    @Override
    public boolean 0(@NotNull final f0w p0, final double p1, final double p2, @NotNull final f0y p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          527
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            519
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            511
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           -1517231703
        //    33: goto            39
        //    36: ldc_w           1110008568
        //    39: ldc_w           -1149584733
        //    42: ixor           
        //    43: lookupswitch {
        //          -111945637: 68
        //          518675210: 36
        //          default: 486
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: getstatic       dev/nuker/pyro/fc.1:I
        //    73: ifeq            82
        //    76: ldc_w           412726166
        //    79: goto            85
        //    82: ldc_w           1769816630
        //    85: ldc_w           2085512848
        //    88: ixor           
        //    89: lookupswitch {
        //          -511015396: 82
        //          1691866374: 490
        //          default: 116
        //        }
        //   116: aload           6
        //   118: pop            
        //   119: aload_0        
        //   120: getfield        dev/nuker/pyro/f0P.c:Ldev/nuker/pyro/f0n;
        //   123: ifnull          484
        //   126: getstatic       dev/nuker/pyro/fc.c:I
        //   129: ifge            138
        //   132: ldc_w           185846711
        //   135: goto            141
        //   138: ldc_w           -971753353
        //   141: ldc_w           -777831004
        //   144: ixor           
        //   145: lookupswitch {
        //          -625936877: 138
        //          397870547: 172
        //          default: 498
        //        }
        //   172: aload_0        
        //   173: getstatic       dev/nuker/pyro/fc.c:I
        //   176: ifge            185
        //   179: ldc_w           -1090897007
        //   182: goto            188
        //   185: ldc_w           503481947
        //   188: ldc_w           1646812907
        //   191: ixor           
        //   192: lookupswitch {
        //          -590191238: 185
        //          2083182768: 220
        //          default: 488
        //        }
        //   220: aload_1        
        //   221: dload_2        
        //   222: getstatic       dev/nuker/pyro/fc.0:I
        //   225: ifeq            234
        //   228: ldc_w           649663268
        //   231: goto            237
        //   234: ldc_w           -1339770044
        //   237: ldc_w           -367839892
        //   240: ixor           
        //   241: lookupswitch {
        //          -861264312: 500
        //          1253409835: 234
        //          default: 268
        //        }
        //   268: dload           4
        //   270: aload           6
        //   272: goto            276
        //   275: athrow         
        //   276: invokevirtual   dev/nuker/pyro/f0P.1:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)Z
        //   279: goto            283
        //   282: athrow         
        //   283: ifeq            484
        //   286: getstatic       dev/nuker/pyro/fc.c:I
        //   289: ifge            298
        //   292: ldc_w           -1173570505
        //   295: goto            301
        //   298: ldc_w           -368567182
        //   301: ldc_w           -2113179880
        //   304: ixor           
        //   305: lookupswitch {
        //          940036911: 298
        //          1745056618: 332
        //          default: 496
        //        }
        //   332: dload_2        
        //   333: getstatic       dev/nuker/pyro/fc.1:I
        //   336: ifeq            345
        //   339: ldc_w           -128176384
        //   342: goto            348
        //   345: ldc_w           -2083524376
        //   348: ldc_w           -604140931
        //   351: ixor           
        //   352: lookupswitch {
        //          597796221: 492
        //          1081803594: 345
        //          default: 380
        //        }
        //   380: aload_1        
        //   381: goto            385
        //   384: athrow         
        //   385: invokevirtual   dev/nuker/pyro/f0w.5:()I
        //   388: goto            392
        //   391: athrow         
        //   392: getstatic       dev/nuker/pyro/fc.0:I
        //   395: ifeq            404
        //   398: ldc_w           1753640167
        //   401: goto            407
        //   404: ldc_w           -1749152514
        //   407: ldc_w           1324737617
        //   410: ixor           
        //   411: lookupswitch {
        //          -649336657: 436
        //          645105846: 404
        //          default: 494
        //        }
        //   436: getstatic       dev/nuker/pyro/f0y.c:I
        //   439: iadd           
        //   440: i2d            
        //   441: dcmpl          
        //   442: iflt            451
        //   445: ldc_w           -1408157231
        //   448: goto            454
        //   451: ldc_w           -1408157232
        //   454: ldc_w           1128327959
        //   457: ixor           
        //   458: tableswitch {
        //          -559700596: 480
        //          -559700595: 484
        //          default: 445
        //        }
        //   480: iconst_1       
        //   481: goto            485
        //   484: iconst_0       
        //   485: ireturn        
        //   486: aconst_null    
        //   487: athrow         
        //   488: aconst_null    
        //   489: athrow         
        //   490: aconst_null    
        //   491: athrow         
        //   492: aconst_null    
        //   493: athrow         
        //   494: aconst_null    
        //   495: athrow         
        //   496: aconst_null    
        //   497: athrow         
        //   498: aconst_null    
        //   499: athrow         
        //   500: aconst_null    
        //   501: athrow         
        //   502: pop            
        //   503: goto            24
        //   506: pop            
        //   507: aconst_null    
        //   508: goto            502
        //   511: dup            
        //   512: ifnull          502
        //   515: checkcast       Ljava/lang/Throwable;
        //   518: athrow         
        //   519: dup            
        //   520: ifnull          506
        //   523: checkcast       Ljava/lang/Throwable;
        //   526: athrow         
        //   527: aconst_null    
        //   528: athrow         
        //    StackMapTable: 00 37 43 07 00 37 04 FF 00 0B 00 00 00 01 07 00 37 FF 00 03 00 05 07 00 03 07 00 82 03 03 07 00 91 00 00 0B 42 01 1C 0D 42 01 1E 15 42 01 1E 4C 07 00 03 FF 00 02 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 07 00 03 01 5F 07 00 03 FF 00 0D 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 07 00 03 07 00 82 03 FF 00 02 00 05 07 00 03 07 00 82 03 03 07 00 91 00 04 07 00 03 07 00 82 03 01 FF 00 1E 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 07 00 03 07 00 82 03 FF 00 06 00 00 00 01 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 05 07 00 03 07 00 82 03 03 07 00 91 45 07 00 37 40 01 0E 42 01 1E 4C 03 FF 00 02 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 01 5F 03 43 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 07 00 82 45 07 00 37 FF 00 00 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 01 FF 00 0B 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 01 FF 00 02 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 03 01 01 FF 00 1C 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 01 08 05 42 01 19 03 40 01 00 41 07 00 03 01 41 03 FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 02 03 01 01 01 FF 00 01 00 05 07 00 03 07 00 82 03 03 07 00 91 00 03 07 00 03 07 00 82 03 41 07 00 26 43 05 44 07 00 26 47 05 47 07 00 37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     511    519    Ljava/lang/NegativeArraySizeException;
        //  511    519    511    519    Ljava/util/ConcurrentModificationException;
        //  527    529    3      8      Ljava/lang/AssertionError;
        //  276    282    282    283    Any
        //  276    282    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  276    282    282    283    Any
        //  276    282    3      8      Ljava/lang/ClassCastException;
        //  276    282    3      8      Ljava/lang/NegativeArraySizeException;
        //  384    391    391    392    Any
        //  384    391    3      8      Any
        //  385    391    3      8      Any
        //  384    391    3      8      Any
        //  385    391    384    385    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 144 out of bounds for length 144
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
    
    @Override
    public void c(final char c, final int n) {
        fbS.5o(this, 708951611, c, n);
    }
    
    public f0P(@Nullable final f0n c) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        dev/nuker/pyro/f0P.c:Ldev/nuker/pyro/f0n;
        //     9: aload_0        
        //    10: aload_0        
        //    11: getfield        dev/nuker/pyro/f0P.c:Ldev/nuker/pyro/f0n;
        //    14: ifnull          23
        //    17: ldc_w           -1408468216
        //    20: goto            26
        //    23: ldc_w           -1408468215
        //    26: ldc_w           223379346
        //    29: ixor           
        //    30: tableswitch {
        //          1119357236: 52
        //          1119357237: 176
        //          default: 17
        //        }
        //    52: new             Ldev/nuker/pyro/fz;
        //    55: dup            
        //    56: aload_0        
        //    57: getfield        dev/nuker/pyro/f0P.c:Ldev/nuker/pyro/f0n;
        //    60: dup            
        //    61: ifnonnull       67
        //    64: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //    67: getstatic       dev/nuker/pyro/fc.1:I
        //    70: ifeq            79
        //    73: ldc_w           -740145426
        //    76: goto            82
        //    79: ldc_w           -2020598386
        //    82: ldc_w           -2000647713
        //    85: ixor           
        //    86: lookupswitch {
        //          256939089: 112
        //          1529007921: 79
        //          default: 183
        //        }
        //   112: invokevirtual   dev/nuker/pyro/f0n.3:()Ljava/lang/Object;
        //   115: new             Ldev/nuker/pyro/f0N;
        //   118: dup            
        //   119: aload_0        
        //   120: getstatic       dev/nuker/pyro/fc.1:I
        //   123: ifeq            132
        //   126: ldc_w           -1967122687
        //   129: goto            135
        //   132: ldc_w           1017458109
        //   135: ldc_w           425232990
        //   138: ixor           
        //   139: lookupswitch {
        //          -1818714785: 181
        //          -1676739912: 132
        //          default: 164
        //        }
        //   164: invokespecial   dev/nuker/pyro/f0N.<init>:(Ldev/nuker/pyro/f0P;)V
        //   167: checkcast       Ljava/util/function/Consumer;
        //   170: invokespecial   dev/nuker/pyro/fz.<init>:(Ljava/lang/Object;Ljava/util/function/Consumer;)V
        //   173: goto            177
        //   176: aconst_null    
        //   177: putfield        dev/nuker/pyro/f0P.c:Ldev/nuker/pyro/fz;
        //   180: return         
        //   181: aconst_null    
        //   182: athrow         
        //   183: aconst_null    
        //   184: athrow         
        //    StackMapTable: 00 0F FF 00 11 00 02 07 00 03 07 00 5C 00 01 07 00 03 45 07 00 03 FF 00 02 00 02 07 00 03 07 00 5C 00 02 07 00 03 01 59 07 00 03 FF 00 0E 00 02 07 00 03 07 00 5C 00 04 07 00 03 08 00 34 08 00 34 07 00 5C FF 00 0B 00 02 07 00 03 07 00 5C 00 04 07 00 03 08 00 34 08 00 34 07 00 5C FF 00 02 00 02 07 00 03 07 00 5C 00 05 07 00 03 08 00 34 08 00 34 07 00 5C 01 FF 00 1D 00 02 07 00 03 07 00 5C 00 04 07 00 03 08 00 34 08 00 34 07 00 5C FF 00 13 00 02 07 00 03 07 00 5C 00 07 07 00 03 08 00 34 08 00 34 07 00 05 08 00 73 08 00 73 07 00 03 FF 00 02 00 02 07 00 03 07 00 5C 00 08 07 00 03 08 00 34 08 00 34 07 00 05 08 00 73 08 00 73 07 00 03 01 FF 00 1C 00 02 07 00 03 07 00 5C 00 07 07 00 03 08 00 34 08 00 34 07 00 05 08 00 73 08 00 73 07 00 03 4B 07 00 03 FF 00 00 00 02 07 00 03 07 00 5C 00 02 07 00 03 07 01 7C FF 00 03 00 02 07 00 03 07 00 5C 00 07 07 00 03 08 00 34 08 00 34 07 00 05 08 00 73 08 00 73 07 00 03 FF 00 01 00 02 07 00 03 07 00 5C 00 04 07 00 03 08 00 34 08 00 34 07 00 5C
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:344)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:173)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:169)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:547)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: putstatic       dev/nuker/pyro/f0P.1:Ljava/lang/String;
        //     9: new             Ldev/nuker/pyro/f0O;
        //    12: dup            
        //    13: aconst_null    
        //    14: invokespecial   dev/nuker/pyro/f0O.<init>:(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    17: putstatic       dev/nuker/pyro/f0P.c:Ldev/nuker/pyro/f0O;
        //    20: return         
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
}
