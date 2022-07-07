// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.gui.ScaledResolution;

public class f4e extends f43
{
    public static int c;
    public static int 0;
    public float 4;
    public float 5;
    public f4d c;
    public boolean 4;
    public boolean 5;
    public boolean 6;
    public ScaledResolution c;
    
    public void 0(final boolean b) {
        fbS.4i(this, 315193636, b);
    }
    
    public boolean 0(final int p0, final int p1) {
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
        //    24: iload_1        
        //    25: i2f            
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokevirtual   dev/nuker/pyro/f4e.d:()F
        //    34: goto            38
        //    37: athrow         
        //    38: fcmpl          
        //    39: iflt            336
        //    42: getstatic       dev/nuker/pyro/fc.1:I
        //    45: ifeq            53
        //    48: ldc             -1549741011
        //    50: goto            55
        //    53: ldc             1665196387
        //    55: ldc             -1499678694
        //    57: ixor           
        //    58: lookupswitch {
        //          -975414919: 84
        //          87845943: 53
        //          default: 346
        //        }
        //    84: iload_1        
        //    85: i2f            
        //    86: aload_0        
        //    87: getstatic       dev/nuker/pyro/fc.c:I
        //    90: ifge            98
        //    93: ldc             -64061394
        //    95: goto            100
        //    98: ldc             -294884707
        //   100: ldc             390032892
        //   102: ixor           
        //   103: lookupswitch {
        //          -351146542: 338
        //          1075985828: 98
        //          default: 128
        //        }
        //   128: goto            132
        //   131: athrow         
        //   132: invokevirtual   dev/nuker/pyro/f4e.d:()F
        //   135: goto            139
        //   138: athrow         
        //   139: aload_0        
        //   140: goto            144
        //   143: athrow         
        //   144: invokevirtual   dev/nuker/pyro/f4e.4:()F
        //   147: goto            151
        //   150: athrow         
        //   151: fadd           
        //   152: fcmpg          
        //   153: ifge            336
        //   156: iload_2        
        //   157: i2f            
        //   158: getstatic       dev/nuker/pyro/fc.1:I
        //   161: ifeq            169
        //   164: ldc             -1088522839
        //   166: goto            171
        //   169: ldc             580594999
        //   171: ldc             490055583
        //   173: ixor           
        //   174: lookupswitch {
        //          -1574186442: 342
        //          -391134723: 169
        //          default: 200
        //        }
        //   200: aload_0        
        //   201: goto            205
        //   204: athrow         
        //   205: invokevirtual   dev/nuker/pyro/f4e.6:()F
        //   208: goto            212
        //   211: athrow         
        //   212: fcmpl          
        //   213: iflt            336
        //   216: iload_2        
        //   217: i2f            
        //   218: aload_0        
        //   219: getstatic       dev/nuker/pyro/fc.0:I
        //   222: ifeq            230
        //   225: ldc             373642825
        //   227: goto            232
        //   230: ldc             -632122365
        //   232: ldc             2129936694
        //   234: ixor           
        //   235: lookupswitch {
        //          -1532570315: 260
        //          1756436351: 230
        //          default: 340
        //        }
        //   260: goto            264
        //   263: athrow         
        //   264: invokevirtual   dev/nuker/pyro/f4e.6:()F
        //   267: goto            271
        //   270: athrow         
        //   271: aload_0        
        //   272: getstatic       dev/nuker/pyro/fc.c:I
        //   275: ifge            283
        //   278: ldc             89547402
        //   280: goto            285
        //   283: ldc             -1800248729
        //   285: ldc             46956260
        //   287: ixor           
        //   288: lookupswitch {
        //          53742751: 283
        //          127540334: 344
        //          default: 316
        //        }
        //   316: goto            320
        //   319: athrow         
        //   320: invokevirtual   dev/nuker/pyro/f4e.0:()F
        //   323: goto            327
        //   326: athrow         
        //   327: fadd           
        //   328: fcmpg          
        //   329: ifge            336
        //   332: iconst_1       
        //   333: goto            337
        //   336: iconst_0       
        //   337: ireturn        
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
        //    StackMapTable: 00 37 43 07 00 35 04 FF 00 0B 00 00 00 01 07 00 35 FE 00 03 07 00 03 01 01 45 07 00 1E FF 00 00 00 03 07 00 03 01 01 00 02 02 07 00 03 45 07 00 35 FF 00 00 00 03 07 00 03 01 01 00 02 02 02 0E 41 01 1C FF 00 0D 00 03 07 00 03 01 01 00 02 02 07 00 03 FF 00 01 00 03 07 00 03 01 01 00 03 02 07 00 03 01 FF 00 1B 00 03 07 00 03 01 01 00 02 02 07 00 03 42 07 00 35 FF 00 00 00 03 07 00 03 01 01 00 02 02 07 00 03 45 07 00 35 FF 00 00 00 03 07 00 03 01 01 00 02 02 02 43 07 00 35 FF 00 00 00 03 07 00 03 01 01 00 03 02 02 07 00 03 45 07 00 35 FF 00 00 00 03 07 00 03 01 01 00 03 02 02 02 51 02 FF 00 01 00 03 07 00 03 01 01 00 02 02 01 5C 02 43 07 00 20 FF 00 00 00 03 07 00 03 01 01 00 02 02 07 00 03 45 07 00 35 FF 00 00 00 03 07 00 03 01 01 00 02 02 02 FF 00 11 00 03 07 00 03 01 01 00 02 02 07 00 03 FF 00 01 00 03 07 00 03 01 01 00 03 02 07 00 03 01 FF 00 1B 00 03 07 00 03 01 01 00 02 02 07 00 03 42 07 00 35 FF 00 00 00 03 07 00 03 01 01 00 02 02 07 00 03 45 07 00 35 FF 00 00 00 03 07 00 03 01 01 00 02 02 02 FF 00 0B 00 03 07 00 03 01 01 00 03 02 02 07 00 03 FF 00 01 00 03 07 00 03 01 01 00 04 02 02 07 00 03 01 FF 00 1E 00 03 07 00 03 01 01 00 03 02 02 07 00 03 42 07 00 2A FF 00 00 00 03 07 00 03 01 01 00 03 02 02 07 00 03 45 07 00 35 FF 00 00 00 03 07 00 03 01 01 00 03 02 02 02 08 40 01 FF 00 00 00 03 07 00 03 01 01 00 02 02 07 00 03 FF 00 01 00 03 07 00 03 01 01 00 02 02 07 00 03 41 02 FF 00 01 00 03 07 00 03 01 01 00 03 02 02 07 00 03 01 41 07 00 35 43 05 44 07 00 35 47 05 47 07 00 35
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     357    365    Any
        //  357    365    357    365    Ljava/lang/EnumConstantNotPresentException;
        //  373    375    3      8      Ljava/lang/UnsupportedOperationException;
        //  30     37     37     38     Any
        //  31     37     37     38     Any
        //  31     37     30     31     Ljava/lang/NullPointerException;
        //  30     37     3      8      Ljava/util/NoSuchElementException;
        //  30     37     3      8      Any
        //  131    138    138    139    Any
        //  131    138    131    132    Ljava/util/ConcurrentModificationException;
        //  132    138    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  132    138    138    139    Ljava/lang/UnsupportedOperationException;
        //  131    138    131    132    Any
        //  143    150    150    151    Any
        //  144    150    143    144    Any
        //  144    150    3      8      Ljava/lang/AssertionError;
        //  144    150    150    151    Any
        //  143    150    3      8      Any
        //  204    211    211    212    Any
        //  205    211    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  205    211    3      8      Any
        //  204    211    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  204    211    204    205    Ljava/util/NoSuchElementException;
        //  263    270    270    271    Any
        //  263    270    263    264    Any
        //  264    270    263    264    Any
        //  264    270    270    271    Ljava/lang/IllegalStateException;
        //  263    270    263    264    Ljava/lang/NegativeArraySizeException;
        //  319    326    326    327    Any
        //  320    326    326    327    Any
        //  319    326    3      8      Ljava/lang/AssertionError;
        //  320    326    3      8      Ljava/lang/NumberFormatException;
        //  319    326    319    320    Ljava/lang/IllegalStateException;
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
        f4e.0 = 25;
        f4e.c = 5;
    }
    
    public f4e(final String s, final String s2, final f49 f49) {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.0 != 0) {
                    n = 32959127;
                    break Label_0017;
                }
                n = 981817297;
            }
            switch (n ^ 0x4ACB5D00) {
                case 1262335895: {
                    continue;
                }
                case 1884162769: {
                    super(s, s2, f49, f44.0);
                    this.c = null;
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @Override
    public void c(final int n, final int n2, final int n3) {
        fbS.b4(this, 262210629, n, n2, n3);
    }
    
    @Override
    public void c(final ScaledResolution p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1326
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1318
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1310
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            35
        //    30: ldc             3588952
        //    32: goto            37
        //    35: ldc             957066552
        //    37: ldc             551730030
        //    39: ixor           
        //    40: lookupswitch {
        //          434706006: 68
        //          550795318: 35
        //          default: 1297
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f4e.4:Z
        //    72: ifeq            1260
        //    75: aload_0        
        //    76: iconst_0       
        //    77: getstatic       dev/nuker/pyro/fc.c:I
        //    80: ifge            88
        //    83: ldc             -56353743
        //    85: goto            90
        //    88: ldc             -34861361
        //    90: ldc             1209508500
        //    92: ixor           
        //    93: lookupswitch {
        //          -1263288667: 1285
        //          -1070513276: 88
        //          default: 120
        //        }
        //   120: putfield        dev/nuker/pyro/f4e.4:Z
        //   123: aload_0        
        //   124: iconst_0       
        //   125: putfield        dev/nuker/pyro/f4e.6:Z
        //   128: aload_0        
        //   129: getstatic       dev/nuker/pyro/fc.1:I
        //   132: ifeq            140
        //   135: ldc             -1509707494
        //   137: goto            142
        //   140: ldc             259720260
        //   142: ldc             1041881001
        //   144: ixor           
        //   145: lookupswitch {
        //          -1743100237: 1293
        //          -848074058: 140
        //          default: 172
        //        }
        //   172: aload_0        
        //   173: getstatic       dev/nuker/pyro/fc.c:I
        //   176: ifge            184
        //   179: ldc             -460554623
        //   181: goto            186
        //   184: ldc             -445983108
        //   186: ldc             1833702099
        //   188: ixor           
        //   189: lookupswitch {
        //          -1983878062: 1263
        //          803338497: 184
        //          default: 216
        //        }
        //   216: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f4d;
        //   219: ifnonnull       237
        //   222: aload_0        
        //   223: goto            227
        //   226: athrow         
        //   227: invokespecial   dev/nuker/pyro/f43.d:()F
        //   230: goto            234
        //   233: athrow         
        //   234: goto            503
        //   237: aload_0        
        //   238: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f4d;
        //   241: aload_0        
        //   242: getstatic       dev/nuker/pyro/fc.c:I
        //   245: ifge            253
        //   248: ldc             -1861540654
        //   250: goto            255
        //   253: ldc             1696858358
        //   255: ldc             2084582152
        //   257: ixor           
        //   258: lookupswitch {
        //          -313845798: 253
        //          425997310: 284
        //          default: 1291
        //        }
        //   284: goto            288
        //   287: athrow         
        //   288: invokespecial   dev/nuker/pyro/f43.d:()F
        //   291: goto            295
        //   294: athrow         
        //   295: aload_0        
        //   296: getstatic       dev/nuker/pyro/fc.0:I
        //   299: ifeq            307
        //   302: ldc             -758823329
        //   304: goto            309
        //   307: ldc             1885045255
        //   309: ldc             -1630600945
        //   311: ixor           
        //   312: lookupswitch {
        //          -1165188728: 307
        //          1275742032: 1295
        //          default: 340
        //        }
        //   340: goto            344
        //   343: athrow         
        //   344: invokevirtual   dev/nuker/pyro/f4e.4:()F
        //   347: goto            351
        //   350: athrow         
        //   351: getstatic       dev/nuker/pyro/fc.0:I
        //   354: ifeq            362
        //   357: ldc             -984034356
        //   359: goto            364
        //   362: ldc             546187609
        //   364: ldc             1305482673
        //   366: ixor           
        //   367: lookupswitch {
        //          -2004302211: 362
        //          1834892520: 392
        //          default: 1281
        //        }
        //   392: aload_0        
        //   393: getstatic       dev/nuker/pyro/fc.c:I
        //   396: ifge            404
        //   399: ldc             1783105243
        //   401: goto            406
        //   404: ldc             -1513628389
        //   406: ldc             1743498929
        //   408: ixor           
        //   409: lookupswitch {
        //          -1826249328: 404
        //          228829290: 1265
        //          default: 436
        //        }
        //   436: getfield        dev/nuker/pyro/f4e.c:Lnet/minecraft/client/gui/ScaledResolution;
        //   439: getstatic       dev/nuker/pyro/fc.c:I
        //   442: ifge            450
        //   445: ldc             -557377450
        //   447: goto            452
        //   450: ldc             705242496
        //   452: ldc             807909871
        //   454: ixor           
        //   455: lookupswitch {
        //          -287268423: 450
        //          439262319: 480
        //          default: 1289
        //        }
        //   480: goto            484
        //   483: athrow         
        //   484: invokevirtual   net/minecraft/client/gui/ScaledResolution.func_78326_a:()I
        //   487: goto            491
        //   490: athrow         
        //   491: i2f            
        //   492: goto            496
        //   495: athrow         
        //   496: invokevirtual   dev/nuker/pyro/f4d.0:(FFF)F
        //   499: goto            503
        //   502: athrow         
        //   503: getstatic       dev/nuker/pyro/fc.1:I
        //   506: ifeq            514
        //   509: ldc             2095300994
        //   511: goto            516
        //   514: ldc             1996161399
        //   516: ldc             2121757897
        //   518: ixor           
        //   519: lookupswitch {
        //          43300171: 1269
        //          1576825123: 514
        //          default: 544
        //        }
        //   544: goto            548
        //   547: athrow         
        //   548: invokevirtual   dev/nuker/pyro/f4e.3:(F)V
        //   551: goto            555
        //   554: athrow         
        //   555: aload_0        
        //   556: getstatic       dev/nuker/pyro/fc.0:I
        //   559: ifeq            567
        //   562: ldc             -471011195
        //   564: goto            569
        //   567: ldc             -742431073
        //   569: ldc             -3568124
        //   571: ixor           
        //   572: lookupswitch {
        //          472219265: 567
        //          745990299: 600
        //          default: 1277
        //        }
        //   600: aload_0        
        //   601: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f4d;
        //   604: ifnonnull       612
        //   607: ldc             -560914739
        //   609: goto            614
        //   612: ldc             -560914740
        //   614: ldc             -1088883989
        //   616: ixor           
        //   617: tableswitch {
        //          -1022109620: 640
        //          -1022109619: 655
        //          default: 607
        //        }
        //   640: aload_0        
        //   641: goto            645
        //   644: athrow         
        //   645: invokespecial   dev/nuker/pyro/f43.6:()F
        //   648: goto            652
        //   651: athrow         
        //   652: goto            835
        //   655: getstatic       dev/nuker/pyro/fc.1:I
        //   658: ifeq            666
        //   661: ldc             1816492195
        //   663: goto            668
        //   666: ldc             -207330775
        //   668: ldc             554751820
        //   670: ixor           
        //   671: lookupswitch {
        //          -759909019: 696
        //          1297461231: 666
        //          default: 1287
        //        }
        //   696: aload_0        
        //   697: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f4d;
        //   700: aload_0        
        //   701: goto            705
        //   704: athrow         
        //   705: invokespecial   dev/nuker/pyro/f43.6:()F
        //   708: goto            712
        //   711: athrow         
        //   712: aload_0        
        //   713: goto            717
        //   716: athrow         
        //   717: invokevirtual   dev/nuker/pyro/f4e.0:()F
        //   720: goto            724
        //   723: athrow         
        //   724: aload_0        
        //   725: getstatic       dev/nuker/pyro/fc.c:I
        //   728: ifge            736
        //   731: ldc             -1012175038
        //   733: goto            738
        //   736: ldc             1526654894
        //   738: ldc             904016423
        //   740: ixor           
        //   741: lookupswitch {
        //          -162964123: 736
        //          1864160649: 768
        //          default: 1273
        //        }
        //   768: getfield        dev/nuker/pyro/f4e.c:Lnet/minecraft/client/gui/ScaledResolution;
        //   771: getstatic       dev/nuker/pyro/fc.1:I
        //   774: ifeq            782
        //   777: ldc             56042165
        //   779: goto            784
        //   782: ldc             1292407301
        //   784: ldc             858206566
        //   786: ixor           
        //   787: lookupswitch {
        //          -1292247340: 782
        //          812651475: 1299
        //          default: 812
        //        }
        //   812: goto            816
        //   815: athrow         
        //   816: invokevirtual   net/minecraft/client/gui/ScaledResolution.func_78328_b:()I
        //   819: goto            823
        //   822: athrow         
        //   823: i2f            
        //   824: goto            828
        //   827: athrow         
        //   828: invokevirtual   dev/nuker/pyro/f4d.c:(FFF)F
        //   831: goto            835
        //   834: athrow         
        //   835: goto            839
        //   838: athrow         
        //   839: invokevirtual   dev/nuker/pyro/f4e.1:(F)V
        //   842: goto            846
        //   845: athrow         
        //   846: aload_0        
        //   847: getstatic       dev/nuker/pyro/fc.0:I
        //   850: ifeq            858
        //   853: ldc             -776157733
        //   855: goto            860
        //   858: ldc             1432276377
        //   860: ldc             -561701874
        //   862: ixor           
        //   863: lookupswitch {
        //          255449557: 1271
        //          1009730369: 858
        //          default: 888
        //        }
        //   888: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f4d;
        //   891: ifnull          899
        //   894: ldc             -1780082574
        //   896: goto            901
        //   899: ldc             -1780082563
        //   901: ldc             -1111860139
        //   903: ixor           
        //   904: tableswitch {
        //          1354270798: 928
        //          1354270799: 1260
        //          default: 894
        //        }
        //   928: getstatic       dev/nuker/pyro/f4b.c:[I
        //   931: aload_0        
        //   932: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f4d;
        //   935: goto            939
        //   938: athrow         
        //   939: invokevirtual   dev/nuker/pyro/f4d.ordinal:()I
        //   942: goto            946
        //   945: athrow         
        //   946: iaload         
        //   947: tableswitch {
        //                2: 976
        //                3: 1082
        //                4: 1184
        //                5: 1203
        //          default: 1260
        //        }
        //   976: getstatic       dev/nuker/pyro/fc.1:I
        //   979: ifeq            987
        //   982: ldc             532895707
        //   984: goto            989
        //   987: ldc             1866733037
        //   989: ldc             -1116046197
        //   991: ixor           
        //   992: lookupswitch {
        //          -1564923056: 987
        //          -767661722: 1020
        //          default: 1267
        //        }
        //  1020: getstatic       dev/nuker/pyro/fA.c:Ldev/nuker/pyro/fA;
        //  1023: aload_0        
        //  1024: iconst_3       
        //  1025: getstatic       dev/nuker/pyro/fc.c:I
        //  1028: ifge            1036
        //  1031: ldc             -678214488
        //  1033: goto            1038
        //  1036: ldc             -859255288
        //  1038: ldc             -1741182224
        //  1040: ixor           
        //  1041: lookupswitch {
        //          907682640: 1036
        //          1336208984: 1283
        //          default: 1068
        //        }
        //  1068: goto            1072
        //  1071: athrow         
        //  1072: invokevirtual   dev/nuker/pyro/fA.c:(Ldev/nuker/pyro/f4e;I)V
        //  1075: goto            1079
        //  1078: athrow         
        //  1079: goto            1260
        //  1082: getstatic       dev/nuker/pyro/fc.c:I
        //  1085: ifge            1093
        //  1088: ldc             -975852184
        //  1090: goto            1095
        //  1093: ldc             1566746037
        //  1095: ldc             1843009894
        //  1097: ixor           
        //  1098: lookupswitch {
        //          -1475365874: 1093
        //          817413331: 1124
        //          default: 1275
        //        }
        //  1124: getstatic       dev/nuker/pyro/fA.c:Ldev/nuker/pyro/fA;
        //  1127: getstatic       dev/nuker/pyro/fc.0:I
        //  1130: ifeq            1138
        //  1133: ldc             -819611146
        //  1135: goto            1140
        //  1138: ldc             819078083
        //  1140: ldc             -2093854591
        //  1142: ixor           
        //  1143: lookupswitch {
        //          -1798647757: 1138
        //          1276635511: 1261
        //          default: 1168
        //        }
        //  1168: aload_0        
        //  1169: iconst_0       
        //  1170: goto            1174
        //  1173: athrow         
        //  1174: invokevirtual   dev/nuker/pyro/fA.c:(Ldev/nuker/pyro/f4e;I)V
        //  1177: goto            1181
        //  1180: athrow         
        //  1181: goto            1260
        //  1184: getstatic       dev/nuker/pyro/fA.c:Ldev/nuker/pyro/fA;
        //  1187: aload_0        
        //  1188: iconst_2       
        //  1189: goto            1193
        //  1192: athrow         
        //  1193: invokevirtual   dev/nuker/pyro/fA.c:(Ldev/nuker/pyro/f4e;I)V
        //  1196: goto            1200
        //  1199: athrow         
        //  1200: goto            1260
        //  1203: getstatic       dev/nuker/pyro/fc.0:I
        //  1206: ifeq            1214
        //  1209: ldc             -2054618297
        //  1211: goto            1216
        //  1214: ldc             2056412264
        //  1216: ldc             -302149555
        //  1218: ixor           
        //  1219: lookupswitch {
        //          41748474: 1214
        //          1752470282: 1279
        //          default: 1244
        //        }
        //  1244: getstatic       dev/nuker/pyro/fA.c:Ldev/nuker/pyro/fA;
        //  1247: aload_0        
        //  1248: iconst_1       
        //  1249: goto            1253
        //  1252: athrow         
        //  1253: invokevirtual   dev/nuker/pyro/fA.c:(Ldev/nuker/pyro/f4e;I)V
        //  1256: goto            1260
        //  1259: athrow         
        //  1260: return         
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
        //  1289: aconst_null    
        //  1290: athrow         
        //  1291: aconst_null    
        //  1292: athrow         
        //  1293: aconst_null    
        //  1294: athrow         
        //  1295: aconst_null    
        //  1296: athrow         
        //  1297: aconst_null    
        //  1298: athrow         
        //  1299: aconst_null    
        //  1300: athrow         
        //  1301: pop            
        //  1302: goto            24
        //  1305: pop            
        //  1306: aconst_null    
        //  1307: goto            1301
        //  1310: dup            
        //  1311: ifnull          1301
        //  1314: checkcast       Ljava/lang/Throwable;
        //  1317: athrow         
        //  1318: dup            
        //  1319: ifnull          1305
        //  1322: checkcast       Ljava/lang/Throwable;
        //  1325: athrow         
        //  1326: aconst_null    
        //  1327: athrow         
        //    StackMapTable: 00 AB 43 07 00 35 04 FF 00 0B 00 00 00 01 07 00 35 FD 00 03 07 00 03 07 00 9E 0A 41 01 1E FF 00 13 00 02 07 00 03 07 00 9E 00 02 07 00 03 01 FF 00 01 00 02 07 00 03 07 00 9E 00 03 07 00 03 01 01 FF 00 1D 00 02 07 00 03 07 00 9E 00 02 07 00 03 01 53 07 00 03 FF 00 01 00 02 07 00 03 07 00 9E 00 02 07 00 03 01 5D 07 00 03 FF 00 0B 00 02 07 00 03 07 00 9E 00 02 07 00 03 07 00 03 FF 00 01 00 02 07 00 03 07 00 9E 00 03 07 00 03 07 00 03 01 FF 00 1D 00 02 07 00 03 07 00 9E 00 02 07 00 03 07 00 03 49 07 00 26 FF 00 00 00 02 07 00 03 07 00 9E 00 02 07 00 03 07 00 03 45 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 02 07 00 03 02 42 07 00 03 FF 00 0F 00 02 07 00 03 07 00 9E 00 03 07 00 03 07 00 A4 07 00 03 FF 00 01 00 02 07 00 03 07 00 9E 00 04 07 00 03 07 00 A4 07 00 03 01 FF 00 1C 00 02 07 00 03 07 00 9E 00 03 07 00 03 07 00 A4 07 00 03 42 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 03 07 00 03 07 00 A4 07 00 03 45 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 03 07 00 03 07 00 A4 02 FF 00 0B 00 02 07 00 03 07 00 9E 00 04 07 00 03 07 00 A4 02 07 00 03 FF 00 01 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 07 00 03 01 FF 00 1E 00 02 07 00 03 07 00 9E 00 04 07 00 03 07 00 A4 02 07 00 03 42 07 00 28 FF 00 00 00 02 07 00 03 07 00 9E 00 04 07 00 03 07 00 A4 02 07 00 03 45 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 04 07 00 03 07 00 A4 02 02 FF 00 0A 00 02 07 00 03 07 00 9E 00 04 07 00 03 07 00 A4 02 02 FF 00 01 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 01 FF 00 1B 00 02 07 00 03 07 00 9E 00 04 07 00 03 07 00 A4 02 02 FF 00 0B 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 07 00 03 FF 00 01 00 02 07 00 03 07 00 9E 00 06 07 00 03 07 00 A4 02 02 07 00 03 01 FF 00 1D 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 07 00 03 FF 00 0D 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 07 00 9E FF 00 01 00 02 07 00 03 07 00 9E 00 06 07 00 03 07 00 A4 02 02 07 00 9E 01 FF 00 1B 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 07 00 9E 42 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 07 00 9E 45 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 01 FF 00 03 00 00 00 01 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 02 45 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 02 07 00 03 02 FF 00 0A 00 02 07 00 03 07 00 9E 00 02 07 00 03 02 FF 00 01 00 02 07 00 03 07 00 9E 00 03 07 00 03 02 01 FF 00 1B 00 02 07 00 03 07 00 9E 00 02 07 00 03 02 42 07 00 76 FF 00 00 00 02 07 00 03 07 00 9E 00 02 07 00 03 02 45 07 00 35 00 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 9E 00 02 07 00 03 01 5E 07 00 03 46 07 00 03 44 07 00 03 FF 00 01 00 02 07 00 03 07 00 9E 00 02 07 00 03 01 59 07 00 03 43 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 02 07 00 03 07 00 03 45 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 02 07 00 03 02 42 07 00 03 4A 07 00 03 FF 00 01 00 02 07 00 03 07 00 9E 00 02 07 00 03 01 5B 07 00 03 47 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 03 07 00 03 07 00 A4 07 00 03 45 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 03 07 00 03 07 00 A4 02 43 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 04 07 00 03 07 00 A4 02 07 00 03 45 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 04 07 00 03 07 00 A4 02 02 FF 00 0B 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 07 00 03 FF 00 01 00 02 07 00 03 07 00 9E 00 06 07 00 03 07 00 A4 02 02 07 00 03 01 FF 00 1D 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 07 00 03 FF 00 0D 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 07 00 9E FF 00 01 00 02 07 00 03 07 00 9E 00 06 07 00 03 07 00 A4 02 02 07 00 9E 01 FF 00 1B 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 07 00 9E 42 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 07 00 9E 45 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 01 43 07 00 76 FF 00 00 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 02 45 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 02 07 00 03 02 42 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 02 07 00 03 02 45 07 00 35 00 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 9E 00 02 07 00 03 01 5B 07 00 03 05 04 41 01 1A 49 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 02 07 00 EB 07 00 A4 45 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 02 07 00 EB 01 1D 0A 41 01 1E FF 00 0F 00 02 07 00 03 07 00 9E 00 03 07 00 D8 07 00 03 01 FF 00 01 00 02 07 00 03 07 00 9E 00 04 07 00 D8 07 00 03 01 01 FF 00 1D 00 02 07 00 03 07 00 9E 00 03 07 00 D8 07 00 03 01 42 07 00 78 FF 00 00 00 02 07 00 03 07 00 9E 00 03 07 00 D8 07 00 03 01 45 07 00 35 00 02 0A 41 01 1C 4D 07 00 D8 FF 00 01 00 02 07 00 03 07 00 9E 00 02 07 00 D8 01 5B 07 00 D8 44 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 03 07 00 D8 07 00 03 01 45 07 00 35 00 02 47 07 00 7A FF 00 00 00 02 07 00 03 07 00 9E 00 03 07 00 D8 07 00 03 01 45 07 00 35 00 02 0A 41 01 1B 47 07 00 35 FF 00 00 00 02 07 00 03 07 00 9E 00 03 07 00 D8 07 00 03 01 45 07 00 35 00 40 07 00 D8 FF 00 01 00 02 07 00 03 07 00 9E 00 02 07 00 03 07 00 03 FF 00 01 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 07 00 03 01 FF 00 01 00 02 07 00 03 07 00 9E 00 02 07 00 03 02 41 07 00 03 FF 00 01 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 07 00 03 01 41 07 00 03 01 FF 00 01 00 02 07 00 03 07 00 9E 00 04 07 00 03 07 00 A4 02 02 FF 00 01 00 02 07 00 03 07 00 9E 00 03 07 00 D8 07 00 03 01 FF 00 01 00 02 07 00 03 07 00 9E 00 02 07 00 03 01 41 07 00 03 FF 00 01 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 07 00 9E FF 00 01 00 02 07 00 03 07 00 9E 00 03 07 00 03 07 00 A4 07 00 03 41 07 00 03 FF 00 01 00 02 07 00 03 07 00 9E 00 04 07 00 03 07 00 A4 02 07 00 03 01 FF 00 01 00 02 07 00 03 07 00 9E 00 05 07 00 03 07 00 A4 02 02 07 00 9E 41 07 00 35 43 05 44 07 00 35 47 05 47 07 00 35
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1310   1318   Any
        //  1310   1318   1310   1318   Any
        //  1326   1328   3      8      Any
        //  226    233    233    234    Any
        //  226    233    233    234    Any
        //  227    233    226    227    Ljava/lang/AssertionError;
        //  227    233    3      8      Ljava/lang/ArithmeticException;
        //  226    233    3      8      Ljava/lang/NullPointerException;
        //  287    294    294    295    Any
        //  288    294    3      8      Any
        //  287    294    3      8      Ljava/lang/IllegalArgumentException;
        //  287    294    287    288    Any
        //  287    294    3      8      Any
        //  343    350    350    351    Any
        //  344    350    3      8      Any
        //  344    350    3      8      Ljava/lang/NegativeArraySizeException;
        //  343    350    343    344    Ljava/lang/StringIndexOutOfBoundsException;
        //  344    350    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  483    490    490    491    Any
        //  483    490    490    491    Ljava/lang/IllegalArgumentException;
        //  484    490    483    484    Any
        //  483    490    483    484    Any
        //  484    490    483    484    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  496    502    502    503    Any
        //  496    502    502    503    Any
        //  496    502    3      8      Any
        //  496    502    3      8      Any
        //  496    502    3      8      Ljava/lang/AssertionError;
        //  547    554    554    555    Any
        //  548    554    547    548    Ljava/lang/NegativeArraySizeException;
        //  547    554    547    548    Ljava/lang/RuntimeException;
        //  548    554    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  548    554    547    548    Ljava/lang/NegativeArraySizeException;
        //  644    651    651    652    Any
        //  645    651    3      8      Any
        //  644    651    644    645    Any
        //  644    651    3      8      Ljava/lang/IllegalStateException;
        //  644    651    644    645    Any
        //  704    711    711    712    Any
        //  704    711    704    705    Any
        //  705    711    711    712    Ljava/lang/RuntimeException;
        //  705    711    711    712    Ljava/lang/IllegalStateException;
        //  704    711    704    705    Ljava/util/NoSuchElementException;
        //  716    723    723    724    Any
        //  716    723    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  716    723    723    724    Any
        //  717    723    716    717    Any
        //  717    723    3      8      Ljava/lang/NumberFormatException;
        //  815    822    822    823    Any
        //  815    822    815    816    Any
        //  816    822    3      8      Any
        //  816    822    815    816    Any
        //  815    822    815    816    Any
        //  827    834    834    835    Any
        //  828    834    834    835    Ljava/lang/UnsupportedOperationException;
        //  827    834    827    828    Ljava/lang/IllegalStateException;
        //  827    834    834    835    Ljava/lang/ClassCastException;
        //  827    834    827    828    Ljava/lang/StringIndexOutOfBoundsException;
        //  838    845    845    846    Any
        //  838    845    845    846    Ljava/lang/NumberFormatException;
        //  839    845    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  838    845    838    839    Any
        //  838    845    845    846    Any
        //  938    945    945    946    Any
        //  938    945    938    939    Any
        //  938    945    945    946    Any
        //  939    945    3      8      Any
        //  938    945    3      8      Ljava/lang/ClassCastException;
        //  1071   1078   1078   1079   Any
        //  1072   1078   1078   1079   Any
        //  1072   1078   1078   1079   Any
        //  1072   1078   1071   1072   Ljava/lang/IndexOutOfBoundsException;
        //  1072   1078   3      8      Any
        //  1173   1180   1180   1181   Any
        //  1173   1180   3      8      Any
        //  1174   1180   1173   1174   Ljava/lang/UnsupportedOperationException;
        //  1174   1180   3      8      Any
        //  1174   1180   1173   1174   Ljava/lang/AssertionError;
        //  1192   1199   1199   1200   Any
        //  1192   1199   1192   1193   Ljava/lang/ClassCastException;
        //  1192   1199   3      8      Ljava/util/ConcurrentModificationException;
        //  1193   1199   1199   1200   Ljava/lang/EnumConstantNotPresentException;
        //  1193   1199   1199   1200   Any
        //  1252   1259   1259   1260   Any
        //  1252   1259   3      8      Any
        //  1252   1259   3      8      Any
        //  1253   1259   3      8      Any
        //  1252   1259   1252   1253   Any
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
    public void c(final ScaledResolution p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          4041
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            4033
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            4025
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: aload_1        
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            37
        //    32: ldc             -1722943925
        //    34: goto            39
        //    37: ldc             -955631145
        //    39: ldc             248777596
        //    41: ixor           
        //    42: lookupswitch {
        //          -1751515849: 37
        //          -908184917: 68
        //          default: 3922
        //        }
        //    68: putfield        dev/nuker/pyro/f4e.c:Lnet/minecraft/client/gui/ScaledResolution;
        //    71: aload_0        
        //    72: getfield        dev/nuker/pyro/f4e.4:Z
        //    75: ifeq            83
        //    78: ldc             -1137136951
        //    80: goto            85
        //    83: ldc             -1137136906
        //    85: ldc             547917974
        //    87: ixor           
        //    88: tableswitch {
        //          958428350: 112
        //          958428351: 1810
        //          default: 78
        //        }
        //   112: aload_0        
        //   113: iconst_1       
        //   114: putfield        dev/nuker/pyro/f4e.5:Z
        //   117: getstatic       dev/nuker/pyro/fc.0:I
        //   120: ifeq            128
        //   123: ldc             -1311648590
        //   125: goto            130
        //   128: ldc             -1490983043
        //   130: ldc             2020261974
        //   132: ixor           
        //   133: lookupswitch {
        //          -910486300: 128
        //          -548690133: 160
        //          default: 3936
        //        }
        //   160: aload_0        
        //   161: iload_2        
        //   162: iload_3        
        //   163: goto            167
        //   166: athrow         
        //   167: invokevirtual   dev/nuker/pyro/f4e.c:(II)V
        //   170: goto            174
        //   173: athrow         
        //   174: iload_2        
        //   175: i2f            
        //   176: aload_0        
        //   177: getfield        dev/nuker/pyro/f4e.4:F
        //   180: fsub           
        //   181: fstore          4
        //   183: iload_3        
        //   184: i2f            
        //   185: aload_0        
        //   186: getfield        dev/nuker/pyro/f4e.5:F
        //   189: fsub           
        //   190: getstatic       dev/nuker/pyro/fc.0:I
        //   193: ifeq            201
        //   196: ldc             -1004992674
        //   198: goto            204
        //   201: ldc_w           -1081189149
        //   204: ldc_w           -554697211
        //   207: ixor           
        //   208: lookupswitch {
        //          452393307: 201
        //          1633788646: 236
        //          default: 3996
        //        }
        //   236: fstore          5
        //   238: aload_0        
        //   239: fconst_0       
        //   240: fload           4
        //   242: goto            246
        //   245: athrow         
        //   246: invokestatic    java/lang/Math.max:(FF)F
        //   249: goto            253
        //   252: athrow         
        //   253: getstatic       dev/nuker/pyro/fc.0:I
        //   256: ifeq            265
        //   259: ldc_w           320186112
        //   262: goto            268
        //   265: ldc_w           -2051907394
        //   268: ldc_w           -2008788486
        //   271: ixor           
        //   272: lookupswitch {
        //          -1689127174: 3950
        //          -739062247: 265
        //          default: 300
        //        }
        //   300: aload_1        
        //   301: goto            305
        //   304: athrow         
        //   305: invokevirtual   net/minecraft/client/gui/ScaledResolution.func_78326_a:()I
        //   308: goto            312
        //   311: athrow         
        //   312: i2f            
        //   313: aload_0        
        //   314: getstatic       dev/nuker/pyro/fc.1:I
        //   317: ifeq            326
        //   320: ldc_w           2131113863
        //   323: goto            329
        //   326: ldc_w           -2034419530
        //   329: ldc_w           -529185897
        //   332: ixor           
        //   333: lookupswitch {
        //          -1619823600: 4000
        //          37797313: 326
        //          default: 360
        //        }
        //   360: goto            364
        //   363: athrow         
        //   364: invokevirtual   dev/nuker/pyro/f4e.4:()F
        //   367: goto            371
        //   370: athrow         
        //   371: fsub           
        //   372: goto            376
        //   375: athrow         
        //   376: invokestatic    java/lang/Math.min:(FF)F
        //   379: goto            383
        //   382: athrow         
        //   383: goto            387
        //   386: athrow         
        //   387: invokevirtual   dev/nuker/pyro/f4e.3:(F)V
        //   390: goto            394
        //   393: athrow         
        //   394: getstatic       dev/nuker/pyro/fc.c:I
        //   397: ifge            406
        //   400: ldc_w           -2035342700
        //   403: goto            409
        //   406: ldc_w           1053539724
        //   409: ldc_w           -743284955
        //   412: ixor           
        //   413: lookupswitch {
        //          -310779223: 440
        //          1427996081: 406
        //          default: 4004
        //        }
        //   440: aload_0        
        //   441: fconst_0       
        //   442: fload           5
        //   444: goto            448
        //   447: athrow         
        //   448: invokestatic    java/lang/Math.max:(FF)F
        //   451: goto            455
        //   454: athrow         
        //   455: getstatic       dev/nuker/pyro/fc.1:I
        //   458: ifeq            467
        //   461: ldc_w           -1640951480
        //   464: goto            470
        //   467: ldc_w           2040489289
        //   470: ldc_w           -1948786411
        //   473: ixor           
        //   474: lookupswitch {
        //          367456349: 3906
        //          1985532713: 467
        //          default: 500
        //        }
        //   500: aload_1        
        //   501: goto            505
        //   504: athrow         
        //   505: invokevirtual   net/minecraft/client/gui/ScaledResolution.func_78328_b:()I
        //   508: goto            512
        //   511: athrow         
        //   512: i2f            
        //   513: aload_0        
        //   514: goto            518
        //   517: athrow         
        //   518: invokevirtual   dev/nuker/pyro/f4e.0:()F
        //   521: goto            525
        //   524: athrow         
        //   525: fsub           
        //   526: getstatic       dev/nuker/pyro/fc.0:I
        //   529: ifeq            538
        //   532: ldc_w           -990202652
        //   535: goto            541
        //   538: ldc_w           -2143377629
        //   541: ldc_w           -724648498
        //   544: ixor           
        //   545: lookupswitch {
        //          21443528: 538
        //          271845674: 3976
        //          default: 572
        //        }
        //   572: goto            576
        //   575: athrow         
        //   576: invokestatic    java/lang/Math.min:(FF)F
        //   579: goto            583
        //   582: athrow         
        //   583: getstatic       dev/nuker/pyro/fc.1:I
        //   586: ifeq            595
        //   589: ldc_w           603832147
        //   592: goto            598
        //   595: ldc_w           -884833224
        //   598: ldc_w           -554492562
        //   601: ixor           
        //   602: lookupswitch {
        //          -49372611: 595
        //          363960662: 628
        //          default: 4008
        //        }
        //   628: goto            632
        //   631: athrow         
        //   632: invokevirtual   dev/nuker/pyro/f4e.1:(F)V
        //   635: goto            639
        //   638: athrow         
        //   639: aload_0        
        //   640: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f4d;
        //   643: ifnull          1807
        //   646: fconst_0       
        //   647: fconst_0       
        //   648: fconst_0       
        //   649: fconst_1       
        //   650: goto            654
        //   653: athrow         
        //   654: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179131_c:(FFFF)V
        //   657: goto            661
        //   660: athrow         
        //   661: fload           4
        //   663: aload_0        
        //   664: getstatic       dev/nuker/pyro/fc.1:I
        //   667: ifeq            676
        //   670: ldc_w           1068390219
        //   673: goto            679
        //   676: ldc_w           854634648
        //   679: ldc_w           -120777370
        //   682: ixor           
        //   683: lookupswitch {
        //          -949796307: 676
        //          -901929474: 708
        //          default: 3930
        //        }
        //   708: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f4d;
        //   711: getfield        dev/nuker/pyro/f4d.c:I
        //   714: iconst_m1      
        //   715: if_icmpne       722
        //   718: fconst_2       
        //   719: goto            810
        //   722: aload_0        
        //   723: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f4d;
        //   726: getfield        dev/nuker/pyro/f4d.c:I
        //   729: ifne            796
        //   732: aload_0        
        //   733: getstatic       dev/nuker/pyro/fc.c:I
        //   736: ifge            745
        //   739: ldc_w           770455746
        //   742: goto            748
        //   745: ldc_w           1707449344
        //   748: ldc_w           -43504094
        //   751: ixor           
        //   752: lookupswitch {
        //          -796649760: 3984
        //          720657924: 745
        //          default: 780
        //        }
        //   780: goto            784
        //   783: athrow         
        //   784: invokevirtual   dev/nuker/pyro/f4e.4:()F
        //   787: goto            791
        //   790: athrow         
        //   791: fconst_2       
        //   792: fdiv           
        //   793: goto            810
        //   796: aload_0        
        //   797: goto            801
        //   800: athrow         
        //   801: invokevirtual   dev/nuker/pyro/f4e.4:()F
        //   804: goto            808
        //   807: athrow         
        //   808: fconst_2       
        //   809: fsub           
        //   810: fadd           
        //   811: f2d            
        //   812: getstatic       dev/nuker/pyro/fc.0:I
        //   815: ifeq            824
        //   818: ldc_w           341814275
        //   821: goto            827
        //   824: ldc_w           1508820870
        //   827: ldc_w           -251531084
        //   830: ixor           
        //   831: lookupswitch {
        //          -446800713: 3908
        //          1594461720: 824
        //          default: 856
        //        }
        //   856: dstore          6
        //   858: fload           5
        //   860: aload_0        
        //   861: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f4d;
        //   864: getstatic       dev/nuker/pyro/fc.1:I
        //   867: ifeq            876
        //   870: ldc_w           -1467830267
        //   873: goto            879
        //   876: ldc_w           -1202407059
        //   879: ldc_w           1846442927
        //   882: ixor           
        //   883: lookupswitch {
        //          -963851350: 3904
        //          1007803719: 876
        //          default: 908
        //        }
        //   908: getfield        dev/nuker/pyro/f4d.0:I
        //   911: iconst_m1      
        //   912: if_icmpne       919
        //   915: fconst_2       
        //   916: goto            1005
        //   919: aload_0        
        //   920: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f4d;
        //   923: getfield        dev/nuker/pyro/f4d.0:I
        //   926: ifne            946
        //   929: aload_0        
        //   930: goto            934
        //   933: athrow         
        //   934: invokevirtual   dev/nuker/pyro/f4e.0:()F
        //   937: goto            941
        //   940: athrow         
        //   941: fconst_2       
        //   942: fdiv           
        //   943: goto            1005
        //   946: aload_0        
        //   947: getstatic       dev/nuker/pyro/fc.1:I
        //   950: ifeq            959
        //   953: ldc_w           -2138654506
        //   956: goto            962
        //   959: ldc_w           -20758463
        //   962: ldc_w           -1310147786
        //   965: ixor           
        //   966: lookupswitch {
        //          23804573: 959
        //          829293536: 3910
        //          default: 992
        //        }
        //   992: goto            996
        //   995: athrow         
        //   996: invokevirtual   dev/nuker/pyro/f4e.0:()F
        //   999: goto            1003
        //  1002: athrow         
        //  1003: fconst_2       
        //  1004: fsub           
        //  1005: fadd           
        //  1006: f2d            
        //  1007: dstore          8
        //  1009: aload_0        
        //  1010: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f4d;
        //  1013: getstatic       dev/nuker/pyro/fc.1:I
        //  1016: ifeq            1025
        //  1019: ldc_w           1407888360
        //  1022: goto            1028
        //  1025: ldc_w           -759413843
        //  1028: ldc_w           1701200725
        //  1031: ixor           
        //  1032: lookupswitch {
        //          -1561008030: 1025
        //          915204285: 3982
        //          default: 1060
        //        }
        //  1060: getfield        dev/nuker/pyro/f4d.c:I
        //  1063: lookupswitch {
        //               -1: 1088
        //                1: 1204
        //          default: 1435
        //        }
        //  1088: aload_0        
        //  1089: dconst_0       
        //  1090: getstatic       dev/nuker/pyro/fc.1:I
        //  1093: ifeq            1102
        //  1096: ldc_w           1167875870
        //  1099: goto            1105
        //  1102: ldc_w           -427011345
        //  1105: ldc_w           -1489394343
        //  1108: ixor           
        //  1109: lookupswitch {
        //          -492438969: 3938
        //          1753773260: 1102
        //          default: 1136
        //        }
        //  1136: dload           8
        //  1138: fload           4
        //  1140: f2d            
        //  1141: getstatic       dev/nuker/pyro/fc.c:I
        //  1144: ifge            1153
        //  1147: ldc_w           -2043682509
        //  1150: goto            1156
        //  1153: ldc_w           1039098457
        //  1156: ldc_w           -878684833
        //  1159: ixor           
        //  1160: lookupswitch {
        //          -2107191577: 1153
        //          1301263468: 3990
        //          default: 1188
        //        }
        //  1188: dload           8
        //  1190: goto            1194
        //  1193: athrow         
        //  1194: invokespecial   dev/nuker/pyro/f4e.c:(DDDD)V
        //  1197: goto            1201
        //  1200: athrow         
        //  1201: goto            1435
        //  1204: aload_0        
        //  1205: getstatic       dev/nuker/pyro/fc.0:I
        //  1208: ifeq            1217
        //  1211: ldc_w           1942080890
        //  1214: goto            1220
        //  1217: ldc_w           -528779009
        //  1220: ldc_w           -430356484
        //  1223: ixor           
        //  1224: lookupswitch {
        //          -1785165178: 1217
        //          102907651: 1252
        //          default: 4010
        //        }
        //  1252: aload_1        
        //  1253: getstatic       dev/nuker/pyro/fc.1:I
        //  1256: ifeq            1265
        //  1259: ldc_w           -2093331169
        //  1262: goto            1268
        //  1265: ldc_w           1397098326
        //  1268: ldc_w           -404892077
        //  1271: ixor           
        //  1272: lookupswitch {
        //          -1264856827: 1300
        //          1692900172: 1265
        //          default: 3924
        //        }
        //  1300: goto            1304
        //  1303: athrow         
        //  1304: invokevirtual   net/minecraft/client/gui/ScaledResolution.func_78326_a:()I
        //  1307: goto            1311
        //  1310: athrow         
        //  1311: i2d            
        //  1312: dload           8
        //  1314: getstatic       dev/nuker/pyro/fc.c:I
        //  1317: ifge            1326
        //  1320: ldc_w           803299172
        //  1323: goto            1329
        //  1326: ldc_w           150653308
        //  1329: ldc_w           -1948494768
        //  1332: ixor           
        //  1333: lookupswitch {
        //          -1539503308: 3994
        //          -1128123087: 1326
        //          default: 1360
        //        }
        //  1360: fload           4
        //  1362: aload_0        
        //  1363: goto            1367
        //  1366: athrow         
        //  1367: invokevirtual   dev/nuker/pyro/f4e.4:()F
        //  1370: goto            1374
        //  1373: athrow         
        //  1374: fadd           
        //  1375: f2d            
        //  1376: dload           8
        //  1378: getstatic       dev/nuker/pyro/fc.c:I
        //  1381: ifge            1390
        //  1384: ldc_w           -1894892957
        //  1387: goto            1393
        //  1390: ldc_w           -662620384
        //  1393: ldc_w           -597892559
        //  1396: ixor           
        //  1397: lookupswitch {
        //          81646865: 1424
        //          1397938258: 1390
        //          default: 3968
        //        }
        //  1424: goto            1428
        //  1427: athrow         
        //  1428: invokespecial   dev/nuker/pyro/f4e.c:(DDDD)V
        //  1431: goto            1435
        //  1434: athrow         
        //  1435: aload_0        
        //  1436: getstatic       dev/nuker/pyro/fc.1:I
        //  1439: ifeq            1448
        //  1442: ldc_w           -2136442778
        //  1445: goto            1451
        //  1448: ldc_w           2090632710
        //  1451: ldc_w           -1321951522
        //  1454: ixor           
        //  1455: lookupswitch {
        //          -1946149166: 1448
        //          832366264: 3960
        //          default: 1480
        //        }
        //  1480: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f4d;
        //  1483: getfield        dev/nuker/pyro/f4d.0:I
        //  1486: lookupswitch {
        //               -1: 1512
        //                1: 1669
        //          default: 1807
        //        }
        //  1512: getstatic       dev/nuker/pyro/fc.c:I
        //  1515: ifge            1524
        //  1518: ldc_w           1481056076
        //  1521: goto            1527
        //  1524: ldc_w           516515763
        //  1527: ldc_w           2096932341
        //  1530: ixor           
        //  1531: lookupswitch {
        //          616282809: 1524
        //          1647690310: 1556
        //          default: 3962
        //        }
        //  1556: aload_0        
        //  1557: dload           6
        //  1559: dconst_0       
        //  1560: getstatic       dev/nuker/pyro/fc.0:I
        //  1563: ifeq            1572
        //  1566: ldc_w           1568416233
        //  1569: goto            1575
        //  1572: ldc_w           1115531249
        //  1575: ldc_w           -394777820
        //  1578: ixor           
        //  1579: lookupswitch {
        //          -1442476843: 1604
        //          -1258026291: 1572
        //          default: 3918
        //        }
        //  1604: dload           6
        //  1606: getstatic       dev/nuker/pyro/fc.0:I
        //  1609: ifeq            1618
        //  1612: ldc_w           1816248593
        //  1615: goto            1621
        //  1618: ldc_w           1587791506
        //  1621: ldc_w           -1655746562
        //  1624: ixor           
        //  1625: lookupswitch {
        //          -1007908500: 1652
        //          -250704145: 1618
        //          default: 3966
        //        }
        //  1652: fload           5
        //  1654: f2d            
        //  1655: goto            1659
        //  1658: athrow         
        //  1659: invokespecial   dev/nuker/pyro/f4e.c:(DDDD)V
        //  1662: goto            1666
        //  1665: athrow         
        //  1666: goto            1807
        //  1669: aload_0        
        //  1670: dload           6
        //  1672: aload_1        
        //  1673: goto            1677
        //  1676: athrow         
        //  1677: invokevirtual   net/minecraft/client/gui/ScaledResolution.func_78328_b:()I
        //  1680: goto            1684
        //  1683: athrow         
        //  1684: i2d            
        //  1685: dload           6
        //  1687: fload           5
        //  1689: getstatic       dev/nuker/pyro/fc.1:I
        //  1692: ifeq            1701
        //  1695: ldc_w           1952253642
        //  1698: goto            1704
        //  1701: ldc_w           134165523
        //  1704: ldc_w           -941062043
        //  1707: ixor           
        //  1708: lookupswitch {
        //          -1279947089: 1701
        //          -1072186250: 1736
        //          default: 3988
        //        }
        //  1736: aload_0        
        //  1737: goto            1741
        //  1740: athrow         
        //  1741: invokevirtual   dev/nuker/pyro/f4e.0:()F
        //  1744: goto            1748
        //  1747: athrow         
        //  1748: fadd           
        //  1749: f2d            
        //  1750: getstatic       dev/nuker/pyro/fc.0:I
        //  1753: ifeq            1762
        //  1756: ldc_w           1015321492
        //  1759: goto            1765
        //  1762: ldc_w           -572029535
        //  1765: ldc_w           -1641070092
        //  1768: ixor           
        //  1769: lookupswitch {
        //          -1565797792: 1762
        //          1137230933: 1796
        //          default: 4012
        //        }
        //  1796: goto            1800
        //  1799: athrow         
        //  1800: invokespecial   dev/nuker/pyro/f4e.c:(DDDD)V
        //  1803: goto            1807
        //  1806: athrow         
        //  1807: goto            1973
        //  1810: getstatic       dev/nuker/pyro/fc.0:I
        //  1813: ifeq            1822
        //  1816: ldc_w           -1042241794
        //  1819: goto            1825
        //  1822: ldc_w           -1501507778
        //  1825: ldc_w           1710988503
        //  1828: ixor           
        //  1829: lookupswitch {
        //          -1703411730: 1822
        //          -1541719511: 3986
        //          default: 1856
        //        }
        //  1856: aload_0        
        //  1857: getstatic       dev/nuker/pyro/fc.0:I
        //  1860: ifeq            1869
        //  1863: ldc_w           1899588657
        //  1866: goto            1872
        //  1869: ldc_w           -818210894
        //  1872: ldc_w           -1593965527
        //  1875: ixor           
        //  1876: lookupswitch {
        //          -775460840: 3952
        //          1404290351: 1869
        //          default: 1904
        //        }
        //  1904: getfield        dev/nuker/pyro/f4e.5:Z
        //  1907: ifeq            1973
        //  1910: aload_0        
        //  1911: iconst_0       
        //  1912: getstatic       dev/nuker/pyro/fc.c:I
        //  1915: ifge            1924
        //  1918: ldc_w           882209123
        //  1921: goto            1927
        //  1924: ldc_w           -1713372855
        //  1927: ldc_w           1575055764
        //  1930: ixor           
        //  1931: lookupswitch {
        //          -1006538531: 1956
        //          1769210103: 1924
        //          default: 3972
        //        }
        //  1956: putfield        dev/nuker/pyro/f4e.5:Z
        //  1959: getstatic       dev/nuker/pyro/fA.c:Ldev/nuker/pyro/fA;
        //  1962: goto            1966
        //  1965: athrow         
        //  1966: invokevirtual   dev/nuker/pyro/fA.4:()V
        //  1969: goto            1973
        //  1972: athrow         
        //  1973: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f9H;
        //  1976: goto            1980
        //  1979: athrow         
        //  1980: invokevirtual   dev/nuker/pyro/f9H.c:()Ldev/nuker/pyro/f0a;
        //  1983: goto            1987
        //  1986: athrow         
        //  1987: getstatic       dev/nuker/pyro/fc.1:I
        //  1990: ifeq            1999
        //  1993: ldc_w           1099195654
        //  1996: goto            2002
        //  1999: ldc_w           -1719358341
        //  2002: ldc_w           895916136
        //  2005: ixor           
        //  2006: lookupswitch {
        //          -1394461677: 2032
        //          1961033070: 1999
        //          default: 3998
        //        }
        //  2032: goto            2036
        //  2035: athrow         
        //  2036: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  2039: goto            2043
        //  2042: athrow         
        //  2043: checkcast       Ljava/lang/Boolean;
        //  2046: getstatic       dev/nuker/pyro/fc.c:I
        //  2049: ifge            2058
        //  2052: ldc_w           -258466338
        //  2055: goto            2061
        //  2058: ldc_w           -246650717
        //  2061: ldc_w           921192670
        //  2064: ixor           
        //  2065: lookupswitch {
        //          -1048381901: 2058
        //          -965716736: 3942
        //          default: 2092
        //        }
        //  2092: goto            2096
        //  2095: athrow         
        //  2096: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2099: goto            2103
        //  2102: athrow         
        //  2103: ifeq            2555
        //  2106: getstatic       dev/nuker/pyro/fc.0:I
        //  2109: ifeq            2118
        //  2112: ldc_w           800712098
        //  2115: goto            2121
        //  2118: ldc_w           2223172
        //  2121: ldc_w           1203631724
        //  2124: ixor           
        //  2125: lookupswitch {
        //          1201412648: 2152
        //          1745097678: 2118
        //          default: 3946
        //        }
        //  2152: aload_0        
        //  2153: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f49;
        //  2156: goto            2160
        //  2159: athrow         
        //  2160: invokevirtual   dev/nuker/pyro/f49.4:()Z
        //  2163: goto            2167
        //  2166: athrow         
        //  2167: ifne            2264
        //  2170: getstatic       dev/nuker/pyro/f4e.c:Lnet/minecraft/client/Minecraft;
        //  2173: getstatic       dev/nuker/pyro/fc.0:I
        //  2176: ifeq            2185
        //  2179: ldc_w           -1697909916
        //  2182: goto            2188
        //  2185: ldc_w           805189695
        //  2188: ldc_w           845848363
        //  2191: ixor           
        //  2192: lookupswitch {
        //          -1465815985: 2185
        //          496281364: 2220
        //          default: 3920
        //        }
        //  2220: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //  2223: instanceof      Ldev/nuker/pyro/f42;
        //  2226: ifeq            2235
        //  2229: ldc_w           1224117427
        //  2232: goto            2238
        //  2235: ldc_w           1224117424
        //  2238: ldc_w           718664030
        //  2241: ixor           
        //  2242: tableswitch {
        //          -1001980966: 2264
        //          -1001980965: 2555
        //          default: 2229
        //        }
        //  2264: aload_0        
        //  2265: goto            2269
        //  2268: athrow         
        //  2269: invokevirtual   dev/nuker/pyro/f4e.d:()F
        //  2272: goto            2276
        //  2275: athrow         
        //  2276: aload_0        
        //  2277: goto            2281
        //  2280: athrow         
        //  2281: invokevirtual   dev/nuker/pyro/f4e.6:()F
        //  2284: goto            2288
        //  2287: athrow         
        //  2288: aload_0        
        //  2289: goto            2293
        //  2292: athrow         
        //  2293: invokevirtual   dev/nuker/pyro/f4e.d:()F
        //  2296: goto            2300
        //  2299: athrow         
        //  2300: getstatic       dev/nuker/pyro/fc.c:I
        //  2303: ifge            2312
        //  2306: ldc_w           -755824544
        //  2309: goto            2315
        //  2312: ldc_w           1713629091
        //  2315: ldc_w           -860658794
        //  2318: ixor           
        //  2319: lookupswitch {
        //          -1433369547: 2344
        //          507538422: 2312
        //          default: 4006
        //        }
        //  2344: aload_0        
        //  2345: getstatic       dev/nuker/pyro/fc.1:I
        //  2348: ifeq            2357
        //  2351: ldc_w           877890385
        //  2354: goto            2360
        //  2357: ldc_w           488742471
        //  2360: ldc_w           -452135193
        //  2363: ixor           
        //  2364: lookupswitch {
        //          -782271050: 2357
        //          -131241824: 2392
        //          default: 3954
        //        }
        //  2392: goto            2396
        //  2395: athrow         
        //  2396: invokevirtual   dev/nuker/pyro/f4e.4:()F
        //  2399: goto            2403
        //  2402: athrow         
        //  2403: fadd           
        //  2404: aload_0        
        //  2405: goto            2409
        //  2408: athrow         
        //  2409: invokevirtual   dev/nuker/pyro/f4e.6:()F
        //  2412: goto            2416
        //  2415: athrow         
        //  2416: aload_0        
        //  2417: goto            2421
        //  2420: athrow         
        //  2421: invokevirtual   dev/nuker/pyro/f4e.0:()F
        //  2424: goto            2428
        //  2427: athrow         
        //  2428: fadd           
        //  2429: aload_0        
        //  2430: getstatic       dev/nuker/pyro/fc.c:I
        //  2433: ifge            2442
        //  2436: ldc_w           790099390
        //  2439: goto            2445
        //  2442: ldc_w           -1085761664
        //  2445: ldc_w           -232432252
        //  2448: ixor           
        //  2449: lookupswitch {
        //          -1338307711: 2442
        //          -583882694: 4014
        //          default: 2476
        //        }
        //  2476: goto            2480
        //  2479: athrow         
        //  2480: invokevirtual   dev/nuker/pyro/f4e.7:()Z
        //  2483: goto            2487
        //  2486: athrow         
        //  2487: ifeq            2496
        //  2490: ldc_w           1963986960
        //  2493: goto            2499
        //  2496: ldc_w           1979645952
        //  2499: getstatic       dev/nuker/pyro/fc.0:I
        //  2502: ifeq            2511
        //  2505: ldc_w           -1492509436
        //  2508: goto            2514
        //  2511: ldc_w           1016450726
        //  2514: ldc_w           1981217862
        //  2517: ixor           
        //  2518: lookupswitch {
        //          -786636478: 2511
        //          1250112224: 2544
        //          default: 3944
        //        }
        //  2544: goto            2548
        //  2547: athrow         
        //  2548: invokestatic    dev/nuker/pyro/fbs.c:(FFFFI)V
        //  2551: goto            2555
        //  2554: athrow         
        //  2555: aload_0        
        //  2556: iload_2        
        //  2557: getstatic       dev/nuker/pyro/fc.1:I
        //  2560: ifeq            2569
        //  2563: ldc_w           397641297
        //  2566: goto            2572
        //  2569: ldc_w           687307002
        //  2572: ldc_w           121288948
        //  2575: ixor           
        //  2576: lookupswitch {
        //          -1254175526: 2569
        //          277429925: 3912
        //          default: 2604
        //        }
        //  2604: iload_3        
        //  2605: goto            2609
        //  2608: athrow         
        //  2609: invokevirtual   dev/nuker/pyro/f4e.0:(II)Z
        //  2612: goto            2616
        //  2615: athrow         
        //  2616: ifeq            2950
        //  2619: getstatic       dev/nuker/pyro/fc.c:I
        //  2622: ifge            2631
        //  2625: ldc_w           -329150708
        //  2628: goto            2634
        //  2631: ldc_w           -1223140294
        //  2634: ldc_w           1556494989
        //  2637: ixor           
        //  2638: lookupswitch {
        //          -1331186303: 3992
        //          -142619659: 2631
        //          default: 2664
        //        }
        //  2664: aload_0        
        //  2665: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f49;
        //  2668: goto            2672
        //  2671: athrow         
        //  2672: invokevirtual   dev/nuker/pyro/f49.0:()Z
        //  2675: goto            2679
        //  2678: athrow         
        //  2679: ifeq            2950
        //  2682: aload_0        
        //  2683: getstatic       dev/nuker/pyro/fc.c:I
        //  2686: ifge            2695
        //  2689: ldc_w           -1575542495
        //  2692: goto            2698
        //  2695: ldc_w           1730801265
        //  2698: ldc_w           1780622885
        //  2701: ixor           
        //  2702: lookupswitch {
        //          -936048892: 3914
        //          1883143911: 2695
        //          default: 2728
        //        }
        //  2728: goto            2732
        //  2731: athrow         
        //  2732: invokevirtual   dev/nuker/pyro/f4e.d:()F
        //  2735: goto            2739
        //  2738: athrow         
        //  2739: aload_0        
        //  2740: goto            2744
        //  2743: athrow         
        //  2744: invokevirtual   dev/nuker/pyro/f4e.6:()F
        //  2747: goto            2751
        //  2750: athrow         
        //  2751: aload_0        
        //  2752: getstatic       dev/nuker/pyro/fc.c:I
        //  2755: ifge            2764
        //  2758: ldc_w           583580772
        //  2761: goto            2767
        //  2764: ldc_w           -140700587
        //  2767: ldc_w           -1733101968
        //  2770: ixor           
        //  2771: lookupswitch {
        //          -1166390764: 2764
        //          1865409061: 2796
        //          default: 3974
        //        }
        //  2796: goto            2800
        //  2799: athrow         
        //  2800: invokevirtual   dev/nuker/pyro/f4e.d:()F
        //  2803: goto            2807
        //  2806: athrow         
        //  2807: aload_0        
        //  2808: goto            2812
        //  2811: athrow         
        //  2812: invokevirtual   dev/nuker/pyro/f4e.4:()F
        //  2815: goto            2819
        //  2818: athrow         
        //  2819: fadd           
        //  2820: getstatic       dev/nuker/pyro/fc.1:I
        //  2823: ifeq            2832
        //  2826: ldc_w           -616250816
        //  2829: goto            2835
        //  2832: ldc_w           -557125401
        //  2835: ldc_w           428147173
        //  2838: ixor           
        //  2839: lookupswitch {
        //          -1027488859: 3978
        //          1805082642: 2832
        //          default: 2864
        //        }
        //  2864: aload_0        
        //  2865: getstatic       dev/nuker/pyro/fc.0:I
        //  2868: ifeq            2877
        //  2871: ldc_w           -918500744
        //  2874: goto            2880
        //  2877: ldc_w           -807899043
        //  2880: ldc_w           -60391848
        //  2883: ixor           
        //  2884: lookupswitch {
        //          -733789647: 2877
        //          891728928: 3964
        //          default: 2912
        //        }
        //  2912: goto            2916
        //  2915: athrow         
        //  2916: invokevirtual   dev/nuker/pyro/f4e.6:()F
        //  2919: goto            2923
        //  2922: athrow         
        //  2923: aload_0        
        //  2924: goto            2928
        //  2927: athrow         
        //  2928: invokevirtual   dev/nuker/pyro/f4e.0:()F
        //  2931: goto            2935
        //  2934: athrow         
        //  2935: fadd           
        //  2936: ldc_w           1345864260
        //  2939: goto            2943
        //  2942: athrow         
        //  2943: invokestatic    dev/nuker/pyro/fbs.c:(FFFFI)V
        //  2946: goto            2950
        //  2949: athrow         
        //  2950: goto            2954
        //  2953: athrow         
        //  2954: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //  2957: goto            2961
        //  2960: athrow         
        //  2961: aload_0        
        //  2962: goto            2966
        //  2965: athrow         
        //  2966: invokevirtual   dev/nuker/pyro/f4e.d:()F
        //  2969: goto            2973
        //  2972: athrow         
        //  2973: aload_0        
        //  2974: goto            2978
        //  2977: athrow         
        //  2978: invokevirtual   dev/nuker/pyro/f4e.6:()F
        //  2981: goto            2985
        //  2984: athrow         
        //  2985: fconst_0       
        //  2986: goto            2990
        //  2989: athrow         
        //  2990: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //  2993: goto            2997
        //  2996: athrow         
        //  2997: aload_0        
        //  2998: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f49;
        //  3001: aload_0        
        //  3002: getstatic       dev/nuker/pyro/fc.0:I
        //  3005: ifeq            3014
        //  3008: ldc_w           1618122424
        //  3011: goto            3017
        //  3014: ldc_w           -522260015
        //  3017: ldc_w           31005476
        //  3020: ixor           
        //  3021: lookupswitch {
        //          -374156241: 3014
        //          1638632860: 3970
        //          default: 3048
        //        }
        //  3048: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f4d;
        //  3051: getstatic       dev/nuker/pyro/fc.1:I
        //  3054: ifeq            3063
        //  3057: ldc_w           -1955602045
        //  3060: goto            3066
        //  3063: ldc_w           1915793306
        //  3066: ldc_w           823098136
        //  3069: ixor           
        //  3070: lookupswitch {
        //          -1168074085: 4002
        //          1344348912: 3063
        //          default: 3096
        //        }
        //  3096: aload_0        
        //  3097: goto            3101
        //  3100: athrow         
        //  3101: invokevirtual   dev/nuker/pyro/f4e.d:()F
        //  3104: goto            3108
        //  3107: athrow         
        //  3108: aload_0        
        //  3109: goto            3113
        //  3112: athrow         
        //  3113: invokevirtual   dev/nuker/pyro/f4e.4:()F
        //  3116: goto            3120
        //  3119: athrow         
        //  3120: fconst_2       
        //  3121: fdiv           
        //  3122: fadd           
        //  3123: aload_0        
        //  3124: getfield        dev/nuker/pyro/f4e.c:Lnet/minecraft/client/gui/ScaledResolution;
        //  3127: goto            3131
        //  3130: athrow         
        //  3131: invokevirtual   net/minecraft/client/gui/ScaledResolution.func_78326_a:()I
        //  3134: goto            3138
        //  3137: athrow         
        //  3138: i2f            
        //  3139: fconst_2       
        //  3140: fdiv           
        //  3141: fcmpl          
        //  3142: ifle            3202
        //  3145: aload_0        
        //  3146: goto            3150
        //  3149: athrow         
        //  3150: invokevirtual   dev/nuker/pyro/f4e.6:()F
        //  3153: goto            3157
        //  3156: athrow         
        //  3157: aload_0        
        //  3158: goto            3162
        //  3161: athrow         
        //  3162: invokevirtual   dev/nuker/pyro/f4e.0:()F
        //  3165: goto            3169
        //  3168: athrow         
        //  3169: fconst_2       
        //  3170: fdiv           
        //  3171: fadd           
        //  3172: aload_0        
        //  3173: getfield        dev/nuker/pyro/f4e.c:Lnet/minecraft/client/gui/ScaledResolution;
        //  3176: goto            3180
        //  3179: athrow         
        //  3180: invokevirtual   net/minecraft/client/gui/ScaledResolution.func_78328_b:()I
        //  3183: goto            3187
        //  3186: athrow         
        //  3187: i2f            
        //  3188: fconst_2       
        //  3189: fdiv           
        //  3190: fcmpl          
        //  3191: ifle            3198
        //  3194: iconst_1       
        //  3195: goto            3256
        //  3198: iconst_0       
        //  3199: goto            3256
        //  3202: aload_0        
        //  3203: goto            3207
        //  3206: athrow         
        //  3207: invokevirtual   dev/nuker/pyro/f4e.6:()F
        //  3210: goto            3214
        //  3213: athrow         
        //  3214: aload_0        
        //  3215: goto            3219
        //  3218: athrow         
        //  3219: invokevirtual   dev/nuker/pyro/f4e.0:()F
        //  3222: goto            3226
        //  3225: athrow         
        //  3226: fconst_2       
        //  3227: fdiv           
        //  3228: fadd           
        //  3229: aload_0        
        //  3230: getfield        dev/nuker/pyro/f4e.c:Lnet/minecraft/client/gui/ScaledResolution;
        //  3233: goto            3237
        //  3236: athrow         
        //  3237: invokevirtual   net/minecraft/client/gui/ScaledResolution.func_78328_b:()I
        //  3240: goto            3244
        //  3243: athrow         
        //  3244: i2f            
        //  3245: fconst_2       
        //  3246: fdiv           
        //  3247: fcmpl          
        //  3248: ifle            3255
        //  3251: iconst_2       
        //  3252: goto            3256
        //  3255: iconst_3       
        //  3256: aload_1        
        //  3257: getstatic       dev/nuker/pyro/fc.1:I
        //  3260: ifeq            3269
        //  3263: ldc_w           -282196109
        //  3266: goto            3272
        //  3269: ldc_w           -644199184
        //  3272: ldc_w           -589942225
        //  3275: ixor           
        //  3276: lookupswitch {
        //          88899295: 3304
        //          871904604: 3269
        //          default: 3940
        //        }
        //  3304: iload_2        
        //  3305: i2f            
        //  3306: aload_0        
        //  3307: getstatic       dev/nuker/pyro/fc.c:I
        //  3310: ifge            3319
        //  3313: ldc_w           -1989505457
        //  3316: goto            3322
        //  3319: ldc_w           2044927151
        //  3322: ldc_w           -1356844701
        //  3325: ixor           
        //  3326: lookupswitch {
        //          196000927: 3319
        //          642432812: 3956
        //          default: 3352
        //        }
        //  3352: goto            3356
        //  3355: athrow         
        //  3356: invokevirtual   dev/nuker/pyro/f4e.d:()F
        //  3359: goto            3363
        //  3362: athrow         
        //  3363: fsub           
        //  3364: iload_3        
        //  3365: i2f            
        //  3366: getstatic       dev/nuker/pyro/fc.c:I
        //  3369: ifge            3378
        //  3372: ldc_w           1292469827
        //  3375: goto            3381
        //  3378: ldc_w           -693666843
        //  3381: ldc_w           1356124037
        //  3384: ixor           
        //  3385: lookupswitch {
        //          -2039237536: 3412
        //          501041606: 3378
        //          default: 3934
        //        }
        //  3412: aload_0        
        //  3413: goto            3417
        //  3416: athrow         
        //  3417: invokevirtual   dev/nuker/pyro/f4e.6:()F
        //  3420: goto            3424
        //  3423: athrow         
        //  3424: fsub           
        //  3425: goto            3429
        //  3428: athrow         
        //  3429: invokevirtual   dev/nuker/pyro/f49.c:(Ldev/nuker/pyro/f4d;ILnet/minecraft/client/gui/ScaledResolution;FF)V
        //  3432: goto            3436
        //  3435: athrow         
        //  3436: goto            3440
        //  3439: athrow         
        //  3440: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //  3443: goto            3447
        //  3446: athrow         
        //  3447: aload_0        
        //  3448: getstatic       dev/nuker/pyro/fc.0:I
        //  3451: ifeq            3460
        //  3454: ldc_w           -882010702
        //  3457: goto            3463
        //  3460: ldc_w           1463857359
        //  3463: ldc_w           1795275734
        //  3466: ixor           
        //  3467: lookupswitch {
        //          -1603522972: 3460
        //          1010895641: 3492
        //          default: 3980
        //        }
        //  3492: iload_2        
        //  3493: getstatic       dev/nuker/pyro/fc.0:I
        //  3496: ifeq            3505
        //  3499: ldc_w           -198110227
        //  3502: goto            3508
        //  3505: ldc_w           -404698774
        //  3508: ldc_w           -1551238233
        //  3511: ixor           
        //  3512: lookupswitch {
        //          222886664: 3505
        //          1471735882: 3928
        //          default: 3540
        //        }
        //  3540: iload_3        
        //  3541: goto            3545
        //  3544: athrow         
        //  3545: invokevirtual   dev/nuker/pyro/f4e.0:(II)Z
        //  3548: goto            3552
        //  3551: athrow         
        //  3552: ifeq            3854
        //  3555: aload_0        
        //  3556: getfield        dev/nuker/pyro/f4e.c:Ldev/nuker/pyro/f49;
        //  3559: goto            3563
        //  3562: athrow         
        //  3563: invokevirtual   dev/nuker/pyro/f49.0:()Z
        //  3566: goto            3570
        //  3569: athrow         
        //  3570: ifne            3846
        //  3573: aload_0        
        //  3574: goto            3578
        //  3577: athrow         
        //  3578: invokevirtual   dev/nuker/pyro/f4e.d:()F
        //  3581: goto            3585
        //  3584: athrow         
        //  3585: getstatic       dev/nuker/pyro/fc.0:I
        //  3588: ifeq            3597
        //  3591: ldc_w           2106218621
        //  3594: goto            3600
        //  3597: ldc_w           -1767460469
        //  3600: ldc_w           2015263569
        //  3603: ixor           
        //  3604: lookupswitch {
        //          -289879334: 3632
        //          93594412: 3597
        //          default: 3948
        //        }
        //  3632: aload_0        
        //  3633: getstatic       dev/nuker/pyro/fc.c:I
        //  3636: ifge            3645
        //  3639: ldc_w           1918840970
        //  3642: goto            3648
        //  3645: ldc_w           1583391621
        //  3648: ldc_w           1532304291
        //  3651: ixor           
        //  3652: lookupswitch {
        //          87406630: 3680
        //          688532265: 3645
        //          default: 3916
        //        }
        //  3680: goto            3684
        //  3683: athrow         
        //  3684: invokevirtual   dev/nuker/pyro/f4e.6:()F
        //  3687: goto            3691
        //  3690: athrow         
        //  3691: getstatic       dev/nuker/pyro/fc.1:I
        //  3694: ifeq            3703
        //  3697: ldc_w           1749538581
        //  3700: goto            3706
        //  3703: ldc_w           -556434195
        //  3706: ldc_w           -1478087192
        //  3709: ixor           
        //  3710: lookupswitch {
        //          -811468035: 3703
        //          2033406213: 3736
        //          default: 3958
        //        }
        //  3736: aload_0        
        //  3737: goto            3741
        //  3740: athrow         
        //  3741: invokevirtual   dev/nuker/pyro/f4e.d:()F
        //  3744: goto            3748
        //  3747: athrow         
        //  3748: aload_0        
        //  3749: goto            3753
        //  3752: athrow         
        //  3753: invokevirtual   dev/nuker/pyro/f4e.4:()F
        //  3756: goto            3760
        //  3759: athrow         
        //  3760: fadd           
        //  3761: aload_0        
        //  3762: goto            3766
        //  3765: athrow         
        //  3766: invokevirtual   dev/nuker/pyro/f4e.6:()F
        //  3769: goto            3773
        //  3772: athrow         
        //  3773: aload_0        
        //  3774: getstatic       dev/nuker/pyro/fc.c:I
        //  3777: ifge            3786
        //  3780: ldc_w           -1292598164
        //  3783: goto            3789
        //  3786: ldc_w           1752085137
        //  3789: ldc_w           2103835233
        //  3792: ixor           
        //  3793: lookupswitch {
        //          -812548595: 3786
        //          353061104: 3820
        //          default: 3926
        //        }
        //  3820: goto            3824
        //  3823: athrow         
        //  3824: invokevirtual   dev/nuker/pyro/f4e.0:()F
        //  3827: goto            3831
        //  3830: athrow         
        //  3831: fadd           
        //  3832: ldc_w           1345864260
        //  3835: goto            3839
        //  3838: athrow         
        //  3839: invokestatic    dev/nuker/pyro/fbs.c:(FFFFI)V
        //  3842: goto            3846
        //  3845: athrow         
        //  3846: aload_0        
        //  3847: iconst_1       
        //  3848: putfield        dev/nuker/pyro/f4e.6:Z
        //  3851: goto            3903
        //  3854: aload_0        
        //  3855: iconst_0       
        //  3856: getstatic       dev/nuker/pyro/fc.c:I
        //  3859: ifge            3868
        //  3862: ldc_w           1675823016
        //  3865: goto            3871
        //  3868: ldc_w           889646308
        //  3871: ldc_w           324235682
        //  3874: ixor           
        //  3875: lookupswitch {
        //          643145030: 3900
        //          1890612746: 3868
        //          default: 3932
        //        }
        //  3900: putfield        dev/nuker/pyro/f4e.6:Z
        //  3903: return         
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
        //  3938: aconst_null    
        //  3939: athrow         
        //  3940: aconst_null    
        //  3941: athrow         
        //  3942: aconst_null    
        //  3943: athrow         
        //  3944: aconst_null    
        //  3945: athrow         
        //  3946: aconst_null    
        //  3947: athrow         
        //  3948: aconst_null    
        //  3949: athrow         
        //  3950: aconst_null    
        //  3951: athrow         
        //  3952: aconst_null    
        //  3953: athrow         
        //  3954: aconst_null    
        //  3955: athrow         
        //  3956: aconst_null    
        //  3957: athrow         
        //  3958: aconst_null    
        //  3959: athrow         
        //  3960: aconst_null    
        //  3961: athrow         
        //  3962: aconst_null    
        //  3963: athrow         
        //  3964: aconst_null    
        //  3965: athrow         
        //  3966: aconst_null    
        //  3967: athrow         
        //  3968: aconst_null    
        //  3969: athrow         
        //  3970: aconst_null    
        //  3971: athrow         
        //  3972: aconst_null    
        //  3973: athrow         
        //  3974: aconst_null    
        //  3975: athrow         
        //  3976: aconst_null    
        //  3977: athrow         
        //  3978: aconst_null    
        //  3979: athrow         
        //  3980: aconst_null    
        //  3981: athrow         
        //  3982: aconst_null    
        //  3983: athrow         
        //  3984: aconst_null    
        //  3985: athrow         
        //  3986: aconst_null    
        //  3987: athrow         
        //  3988: aconst_null    
        //  3989: athrow         
        //  3990: aconst_null    
        //  3991: athrow         
        //  3992: aconst_null    
        //  3993: athrow         
        //  3994: aconst_null    
        //  3995: athrow         
        //  3996: aconst_null    
        //  3997: athrow         
        //  3998: aconst_null    
        //  3999: athrow         
        //  4000: aconst_null    
        //  4001: athrow         
        //  4002: aconst_null    
        //  4003: athrow         
        //  4004: aconst_null    
        //  4005: athrow         
        //  4006: aconst_null    
        //  4007: athrow         
        //  4008: aconst_null    
        //  4009: athrow         
        //  4010: aconst_null    
        //  4011: athrow         
        //  4012: aconst_null    
        //  4013: athrow         
        //  4014: aconst_null    
        //  4015: athrow         
        //  4016: pop            
        //  4017: goto            24
        //  4020: pop            
        //  4021: aconst_null    
        //  4022: goto            4016
        //  4025: dup            
        //  4026: ifnull          4016
        //  4029: checkcast       Ljava/lang/Throwable;
        //  4032: athrow         
        //  4033: dup            
        //  4034: ifnull          4020
        //  4037: checkcast       Ljava/lang/Throwable;
        //  4040: athrow         
        //  4041: aconst_null    
        //  4042: athrow         
        //    StackMapTable: 02 24 43 07 00 35 04 FF 00 0B 00 00 00 01 07 00 35 FF 00 03 00 04 07 00 03 07 00 9E 01 01 00 00 FF 00 0C 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 07 00 9E FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 03 07 00 9E 01 FF 00 1C 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 07 00 9E 09 04 41 01 1A 0F 41 01 1D FF 00 05 00 00 00 01 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 03 01 01 45 07 00 35 00 FF 00 1A 00 05 07 00 03 07 00 9E 01 01 02 00 01 02 FF 00 02 00 05 07 00 03 07 00 9E 01 01 02 00 02 02 01 5F 02 FF 00 08 00 06 07 00 03 07 00 9E 01 01 02 02 00 01 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 03 07 00 03 02 02 45 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 07 00 03 02 FF 00 0B 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 07 00 03 02 FF 00 02 00 06 07 00 03 07 00 9E 01 01 02 02 00 03 07 00 03 02 01 FF 00 1F 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 07 00 03 02 43 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 03 07 00 03 02 07 00 9E 45 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 03 07 00 03 02 01 FF 00 0D 00 06 07 00 03 07 00 9E 01 01 02 02 00 04 07 00 03 02 02 07 00 03 FF 00 02 00 06 07 00 03 07 00 9E 01 01 02 02 00 05 07 00 03 02 02 07 00 03 01 FF 00 1E 00 06 07 00 03 07 00 9E 01 01 02 02 00 04 07 00 03 02 02 07 00 03 42 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 04 07 00 03 02 02 07 00 03 45 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 04 07 00 03 02 02 02 43 07 00 7A FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 03 07 00 03 02 02 45 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 07 00 03 02 FF 00 02 00 00 00 01 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 07 00 03 02 45 07 00 35 00 0B 42 01 1E 46 07 00 26 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 03 07 00 03 02 02 45 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 07 00 03 02 FF 00 0B 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 07 00 03 02 FF 00 02 00 06 07 00 03 07 00 9E 01 01 02 02 00 03 07 00 03 02 01 FF 00 1D 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 07 00 03 02 FF 00 03 00 00 00 01 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 03 07 00 03 02 07 00 9E 45 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 03 07 00 03 02 01 FF 00 04 00 00 00 01 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 04 07 00 03 02 02 07 00 03 45 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 04 07 00 03 02 02 02 FF 00 0C 00 06 07 00 03 07 00 9E 01 01 02 02 00 03 07 00 03 02 02 FF 00 02 00 06 07 00 03 07 00 9E 01 01 02 02 00 04 07 00 03 02 02 01 FF 00 1E 00 06 07 00 03 07 00 9E 01 01 02 02 00 03 07 00 03 02 02 42 07 00 76 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 03 07 00 03 02 02 45 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 07 00 03 02 FF 00 0B 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 07 00 03 02 FF 00 02 00 06 07 00 03 07 00 9E 01 01 02 02 00 03 07 00 03 02 01 FF 00 1D 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 07 00 03 02 42 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 07 00 03 02 45 07 00 35 00 FF 00 0D 00 00 00 01 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 04 02 02 02 02 45 07 00 35 00 FF 00 0E 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 02 07 00 03 FF 00 02 00 06 07 00 03 07 00 9E 01 01 02 02 00 03 02 07 00 03 01 FF 00 1C 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 02 07 00 03 4D 02 FF 00 16 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 02 07 00 03 FF 00 02 00 06 07 00 03 07 00 9E 01 01 02 02 00 03 02 07 00 03 01 FF 00 1F 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 02 07 00 03 42 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 02 07 00 03 45 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 02 02 44 02 43 07 00 26 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 02 07 00 03 45 07 00 35 FF 00 00 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 02 02 FF 00 01 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 02 02 4D 03 FF 00 02 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 03 01 5C 03 FF 00 13 00 07 07 00 03 07 00 9E 01 01 02 02 03 00 02 02 07 00 A4 FF 00 02 00 07 07 00 03 07 00 9E 01 01 02 02 03 00 03 02 07 00 A4 01 FF 00 1C 00 07 07 00 03 07 00 9E 01 01 02 02 03 00 02 02 07 00 A4 4A 02 FF 00 0D 00 00 00 01 07 00 35 FF 00 00 00 07 07 00 03 07 00 9E 01 01 02 02 03 00 02 02 07 00 03 45 07 00 35 FF 00 00 00 07 07 00 03 07 00 9E 01 01 02 02 03 00 02 02 02 44 02 FF 00 0C 00 07 07 00 03 07 00 9E 01 01 02 02 03 00 02 02 07 00 03 FF 00 02 00 07 07 00 03 07 00 9E 01 01 02 02 03 00 03 02 07 00 03 01 FF 00 1D 00 07 07 00 03 07 00 9E 01 01 02 02 03 00 02 02 07 00 03 FF 00 02 00 00 00 01 07 00 35 FF 00 00 00 07 07 00 03 07 00 9E 01 01 02 02 03 00 02 02 07 00 03 45 07 00 35 FF 00 00 00 07 07 00 03 07 00 9E 01 01 02 02 03 00 02 02 02 FF 00 01 00 07 07 00 03 07 00 9E 01 01 02 02 03 00 02 02 02 FF 00 13 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 01 07 00 A4 FF 00 02 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 02 07 00 A4 01 5F 07 00 A4 1B FF 00 0D 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 02 07 00 03 03 FF 00 02 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 03 07 00 03 03 01 FF 00 1E 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 02 07 00 03 03 FF 00 10 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 04 07 00 03 03 03 03 FF 00 02 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 03 01 FF 00 1F 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 04 07 00 03 03 03 03 44 07 00 35 FF 00 00 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 03 03 45 07 00 35 00 02 4C 07 00 03 FF 00 02 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 02 07 00 03 01 5F 07 00 03 FF 00 0C 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 02 07 00 03 07 00 9E FF 00 02 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 03 07 00 03 07 00 9E 01 FF 00 1F 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 02 07 00 03 07 00 9E 42 07 00 35 FF 00 00 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 02 07 00 03 07 00 9E 45 07 00 35 FF 00 00 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 02 07 00 03 01 FF 00 0E 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 03 07 00 03 03 03 FF 00 02 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 04 07 00 03 03 03 01 FF 00 1E 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 03 07 00 03 03 03 45 07 00 35 FF 00 00 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 02 07 00 03 45 07 00 35 FF 00 00 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 02 02 FF 00 0F 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 03 03 FF 00 02 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 06 07 00 03 03 03 03 03 01 FF 00 1E 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 03 03 42 07 00 20 FF 00 00 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 03 03 45 07 00 35 00 4C 07 00 03 FF 00 02 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 02 07 00 03 01 5C 07 00 03 1F 0B 42 01 1C FF 00 0F 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 03 07 00 03 03 03 FF 00 02 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 04 07 00 03 03 03 01 FF 00 1C 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 03 07 00 03 03 03 FF 00 0D 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 04 07 00 03 03 03 03 FF 00 02 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 03 01 FF 00 1E 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 04 07 00 03 03 03 03 45 07 00 78 FF 00 00 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 03 03 45 07 00 35 00 02 FF 00 06 00 00 00 01 07 00 35 FF 00 00 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 03 07 00 03 03 07 00 9E 45 07 00 35 FF 00 00 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 03 07 00 03 03 01 FF 00 10 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 03 02 FF 00 02 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 06 07 00 03 03 03 03 02 01 FF 00 1F 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 03 02 43 07 00 35 FF 00 00 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 06 07 00 03 03 03 03 02 07 00 03 45 07 00 35 FF 00 00 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 06 07 00 03 03 03 03 02 02 FF 00 0D 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 03 03 FF 00 02 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 06 07 00 03 03 03 03 03 01 FF 00 1E 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 03 03 42 07 00 35 FF 00 00 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 03 03 45 07 00 35 F9 00 00 F9 00 02 0B 42 01 1E 4C 07 00 03 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 01 5F 07 00 03 FF 00 13 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 01 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 03 01 01 FF 00 1C 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 01 48 07 00 35 40 07 00 D8 45 07 00 35 00 45 07 00 1E 40 07 01 6F 45 07 00 35 40 07 01 77 4B 07 01 77 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 02 07 01 77 01 5D 07 01 77 42 07 00 1C 40 07 01 77 45 07 00 35 40 07 01 FC 4E 07 01 7C FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 02 07 01 7C 01 5E 07 01 7C FF 00 02 00 00 00 01 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 01 07 01 7C 45 07 00 35 40 01 0E 42 01 1E 46 07 00 35 40 07 00 69 45 07 00 35 40 01 51 07 01 93 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 02 07 01 93 01 5F 07 01 93 08 05 42 01 19 43 07 00 35 40 07 00 03 45 07 00 35 40 02 FF 00 03 00 00 00 01 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 02 02 02 43 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 02 FF 00 0B 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 02 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 01 FF 00 1C 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 02 FF 00 0C 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 07 00 03 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 07 00 03 01 FF 00 1F 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 07 00 03 42 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 02 44 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 02 43 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 02 FF 00 0D 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 07 00 03 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 06 02 02 02 02 07 00 03 01 FF 00 1E 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 07 00 03 42 07 00 2C FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 01 FF 00 08 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 02 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 01 FF 00 0B 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 01 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 06 02 02 02 02 01 01 FF 00 1D 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 01 42 07 00 78 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 01 45 07 00 35 00 FF 00 0D 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 01 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 03 01 01 FF 00 1F 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 01 43 07 00 76 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 03 01 01 45 07 00 35 40 01 0E 42 01 1D 46 07 00 2C 40 07 00 69 45 07 00 35 40 01 4F 07 00 03 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 01 5D 07 00 03 42 07 00 20 40 07 00 03 45 07 00 35 40 02 43 07 00 78 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 02 02 02 FF 00 0C 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 07 00 03 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 07 00 03 01 FF 00 1C 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 07 00 03 42 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 02 43 07 00 76 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 02 FF 00 0C 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 02 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 01 FF 00 1C 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 02 FF 00 0C 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 07 00 03 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 07 00 03 01 FF 00 1F 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 07 00 03 FF 00 02 00 00 00 01 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 02 43 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 02 46 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 01 45 07 00 35 00 42 07 00 35 00 45 07 00 35 00 FF 00 03 00 00 00 01 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 01 07 00 03 45 07 00 35 40 02 43 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 02 02 02 43 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 02 45 07 00 35 00 FF 00 10 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 69 07 00 03 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 69 07 00 03 01 FF 00 1E 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 69 07 00 03 FF 00 0E 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 69 07 00 A4 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 69 07 00 A4 01 FF 00 1D 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 69 07 00 A4 43 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 69 07 00 A4 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 69 07 00 A4 02 43 07 00 74 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 07 00 69 07 00 A4 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 07 00 69 07 00 A4 02 02 49 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 07 00 69 07 00 A4 02 07 00 9E 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 07 00 69 07 00 A4 02 01 4A 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 69 07 00 A4 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 69 07 00 A4 02 FF 00 03 00 00 00 01 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 07 00 69 07 00 A4 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 07 00 69 07 00 A4 02 02 49 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 07 00 69 07 00 A4 02 07 00 9E 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 07 00 69 07 00 A4 02 01 FF 00 0A 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 69 07 00 A4 FF 00 03 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 69 07 00 A4 43 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 69 07 00 A4 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 69 07 00 A4 02 43 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 07 00 69 07 00 A4 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 07 00 69 07 00 A4 02 02 49 07 00 76 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 07 00 69 07 00 A4 02 07 00 9E 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 07 00 69 07 00 A4 02 01 FF 00 0A 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 69 07 00 A4 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 69 07 00 A4 01 FF 00 0C 00 04 07 00 03 07 00 9E 01 01 00 04 07 00 69 07 00 A4 01 07 00 9E FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 05 07 00 69 07 00 A4 01 07 00 9E 01 FF 00 1F 00 04 07 00 03 07 00 9E 01 01 00 04 07 00 69 07 00 A4 01 07 00 9E FF 00 0E 00 04 07 00 03 07 00 9E 01 01 00 06 07 00 69 07 00 A4 01 07 00 9E 02 07 00 03 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 07 07 00 69 07 00 A4 01 07 00 9E 02 07 00 03 01 FF 00 1D 00 04 07 00 03 07 00 9E 01 01 00 06 07 00 69 07 00 A4 01 07 00 9E 02 07 00 03 42 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 06 07 00 69 07 00 A4 01 07 00 9E 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 06 07 00 69 07 00 A4 01 07 00 9E 02 02 FF 00 0E 00 04 07 00 03 07 00 9E 01 01 00 06 07 00 69 07 00 A4 01 07 00 9E 02 02 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 07 07 00 69 07 00 A4 01 07 00 9E 02 02 01 FF 00 1E 00 04 07 00 03 07 00 9E 01 01 00 06 07 00 69 07 00 A4 01 07 00 9E 02 02 FF 00 03 00 00 00 01 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 07 07 00 69 07 00 A4 01 07 00 9E 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 07 07 00 69 07 00 A4 01 07 00 9E 02 02 02 43 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 06 07 00 69 07 00 A4 01 07 00 9E 02 02 45 07 00 35 00 FF 00 02 00 00 00 01 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 00 45 07 00 35 00 4C 07 00 03 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 01 5C 07 00 03 FF 00 0C 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 01 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 03 01 01 FF 00 1F 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 01 43 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 03 01 01 45 07 00 35 40 01 49 07 00 35 40 07 00 69 45 07 00 35 40 01 FF 00 06 00 00 00 01 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 01 07 00 03 45 07 00 35 40 02 4B 02 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 02 02 01 5F 02 FF 00 0C 00 04 07 00 03 07 00 9E 01 01 00 02 02 07 00 03 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 03 02 07 00 03 01 FF 00 1F 00 04 07 00 03 07 00 9E 01 01 00 02 02 07 00 03 42 07 00 76 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 02 02 02 FF 00 0B 00 04 07 00 03 07 00 9E 01 01 00 02 02 02 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 01 FF 00 1D 00 04 07 00 03 07 00 9E 01 01 00 02 02 02 FF 00 03 00 00 00 01 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 02 43 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 02 44 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 02 FF 00 0C 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 07 00 03 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 06 02 02 02 02 07 00 03 01 FF 00 1E 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 07 00 03 FF 00 02 00 00 00 01 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 07 00 03 45 07 00 35 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 02 46 07 00 76 FF 00 00 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 01 45 07 00 35 00 07 FF 00 0D 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 01 FF 00 02 00 04 07 00 03 07 00 9E 01 01 00 03 07 00 03 01 01 FF 00 1C 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 01 02 FF 00 00 00 07 07 00 03 07 00 9E 01 01 02 02 03 00 02 02 07 00 A4 FF 00 01 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 07 00 03 02 41 03 FF 00 01 00 07 07 00 03 07 00 9E 01 01 02 02 03 00 02 02 07 00 03 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 01 41 07 00 03 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 02 02 07 00 03 FF 00 01 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 03 07 00 03 03 03 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 01 07 01 93 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 07 00 9E FF 00 01 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 02 07 00 03 07 00 9E FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 07 00 03 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 01 FF 00 01 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 02 07 00 03 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 06 07 00 69 07 00 A4 01 07 00 9E 02 02 01 FF 00 01 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 02 07 00 03 03 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 04 07 00 69 07 00 A4 01 07 00 9E 41 07 01 7C FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 01 01 41 02 FF 00 01 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 07 00 03 02 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 01 07 00 03 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 07 00 03 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 06 07 00 69 07 00 A4 01 07 00 9E 02 07 00 03 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 02 02 02 FF 00 01 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 01 07 00 03 01 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 04 02 02 02 07 00 03 FF 00 01 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 04 07 00 03 03 03 03 FF 00 01 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 03 03 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 69 07 00 03 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 07 00 03 FF 00 01 00 06 07 00 03 07 00 9E 01 01 02 02 00 03 07 00 03 02 02 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 02 41 07 00 03 FF 00 01 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 01 07 00 A4 FF 00 01 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 02 07 00 03 F9 00 01 FF 00 01 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 03 02 FF 00 01 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 04 07 00 03 03 03 03 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 00 FF 00 01 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 03 07 00 03 03 03 FF 00 01 00 05 07 00 03 07 00 9E 01 01 02 00 01 02 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 01 07 01 77 FF 00 01 00 06 07 00 03 07 00 9E 01 01 02 02 00 04 07 00 03 02 02 07 00 03 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 02 07 00 69 07 00 A4 FD 00 01 02 02 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 03 02 02 02 FF 00 01 00 06 07 00 03 07 00 9E 01 01 02 02 00 02 07 00 03 02 FF 00 01 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 01 07 00 03 FF 00 01 00 08 07 00 03 07 00 9E 01 01 02 02 03 03 00 05 07 00 03 03 03 03 03 FF 00 01 00 04 07 00 03 07 00 9E 01 01 00 05 02 02 02 02 07 00 03 41 07 00 35 43 05 44 07 00 35 47 05 47 07 00 35
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     4025   4033   Any
        //  4025   4033   4025   4033   Ljava/lang/UnsupportedOperationException;
        //  4041   4043   3      8      Ljava/lang/AssertionError;
        //  167    173    173    174    Any
        //  167    173    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  167    173    3      8      Any
        //  167    173    173    174    Any
        //  167    173    3      8      Any
        //  245    252    252    253    Any
        //  246    252    252    253    Any
        //  245    252    245    246    Any
        //  246    252    252    253    Any
        //  245    252    3      8      Any
        //  304    311    311    312    Any
        //  305    311    311    312    Any
        //  305    311    3      8      Any
        //  304    311    311    312    Any
        //  304    311    304    305    Any
        //  363    370    370    371    Any
        //  363    370    363    364    Any
        //  363    370    370    371    Ljava/lang/ClassCastException;
        //  363    370    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  363    370    3      8      Any
        //  375    382    382    383    Any
        //  376    382    375    376    Ljava/lang/ClassCastException;
        //  375    382    3      8      Any
        //  376    382    382    383    Any
        //  376    382    3      8      Any
        //  387    393    393    394    Any
        //  387    393    393    394    Any
        //  387    393    3      8      Ljava/util/NoSuchElementException;
        //  387    393    3      8      Any
        //  387    393    393    394    Ljava/util/ConcurrentModificationException;
        //  447    454    454    455    Any
        //  447    454    3      8      Ljava/lang/NullPointerException;
        //  447    454    3      8      Any
        //  447    454    447    448    Ljava/lang/AssertionError;
        //  447    454    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  505    511    511    512    Any
        //  505    511    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  505    511    511    512    Any
        //  505    511    511    512    Ljava/lang/NumberFormatException;
        //  505    511    3      8      Ljava/lang/RuntimeException;
        //  518    524    524    525    Any
        //  518    524    3      8      Any
        //  518    524    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  518    524    3      8      Ljava/lang/NumberFormatException;
        //  518    524    524    525    Any
        //  575    582    582    583    Any
        //  575    582    575    576    Ljava/util/ConcurrentModificationException;
        //  575    582    575    576    Ljava/util/NoSuchElementException;
        //  576    582    575    576    Ljava/util/NoSuchElementException;
        //  576    582    3      8      Any
        //  631    638    638    639    Any
        //  631    638    631    632    Ljava/lang/UnsupportedOperationException;
        //  632    638    3      8      Any
        //  631    638    3      8      Ljava/lang/IllegalArgumentException;
        //  632    638    631    632    Any
        //  654    660    660    661    Any
        //  654    660    660    661    Ljava/lang/IndexOutOfBoundsException;
        //  654    660    660    661    Ljava/lang/NullPointerException;
        //  654    660    3      8      Ljava/lang/AssertionError;
        //  654    660    660    661    Any
        //  783    790    790    791    Any
        //  783    790    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  784    790    783    784    Any
        //  784    790    3      8      Any
        //  784    790    783    784    Ljava/util/NoSuchElementException;
        //  800    807    807    808    Any
        //  800    807    807    808    Any
        //  801    807    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  800    807    807    808    Any
        //  800    807    800    801    Ljava/lang/AssertionError;
        //  934    940    940    941    Any
        //  934    940    940    941    Any
        //  934    940    940    941    Ljava/util/NoSuchElementException;
        //  934    940    940    941    Any
        //  934    940    940    941    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  996    1002   1002   1003   Any
        //  996    1002   3      8      Any
        //  996    1002   1002   1003   Any
        //  996    1002   3      8      Any
        //  996    1002   1002   1003   Any
        //  1193   1200   1200   1201   Any
        //  1193   1200   3      8      Ljava/lang/IllegalArgumentException;
        //  1194   1200   3      8      Any
        //  1194   1200   1200   1201   Any
        //  1194   1200   1193   1194   Any
        //  1303   1310   1310   1311   Any
        //  1304   1310   1303   1304   Ljava/lang/AssertionError;
        //  1304   1310   1303   1304   Ljava/lang/UnsupportedOperationException;
        //  1304   1310   1303   1304   Ljava/lang/NullPointerException;
        //  1304   1310   1310   1311   Ljava/lang/AssertionError;
        //  1366   1373   1373   1374   Any
        //  1367   1373   1366   1367   Any
        //  1367   1373   1366   1367   Ljava/util/ConcurrentModificationException;
        //  1367   1373   1366   1367   Any
        //  1366   1373   1373   1374   Any
        //  1427   1434   1434   1435   Any
        //  1427   1434   1427   1428   Ljava/util/NoSuchElementException;
        //  1427   1434   3      8      Any
        //  1428   1434   1434   1435   Any
        //  1428   1434   3      8      Ljava/lang/NegativeArraySizeException;
        //  1658   1665   1665   1666   Any
        //  1658   1665   3      8      Ljava/lang/RuntimeException;
        //  1658   1665   1658   1659   Ljava/lang/IndexOutOfBoundsException;
        //  1658   1665   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1658   1665   3      8      Any
        //  1677   1683   1683   1684   Any
        //  1677   1683   1683   1684   Ljava/lang/StringIndexOutOfBoundsException;
        //  1677   1683   3      8      Ljava/lang/NullPointerException;
        //  1677   1683   3      8      Ljava/lang/NullPointerException;
        //  1677   1683   3      8      Any
        //  1740   1747   1747   1748   Any
        //  1741   1747   1740   1741   Ljava/lang/IndexOutOfBoundsException;
        //  1741   1747   1740   1741   Any
        //  1741   1747   3      8      Ljava/lang/ArithmeticException;
        //  1740   1747   1740   1741   Any
        //  1799   1806   1806   1807   Any
        //  1800   1806   1799   1800   Ljava/lang/ClassCastException;
        //  1800   1806   1799   1800   Ljava/lang/NegativeArraySizeException;
        //  1799   1806   3      8      Any
        //  1800   1806   1799   1800   Any
        //  1965   1972   1972   1973   Any
        //  1965   1972   3      8      Any
        //  1966   1972   1965   1966   Ljava/lang/AssertionError;
        //  1966   1972   1972   1973   Ljava/lang/ClassCastException;
        //  1966   1972   1965   1966   Ljava/lang/RuntimeException;
        //  1979   1986   1986   1987   Any
        //  1980   1986   1979   1980   Ljava/lang/NullPointerException;
        //  1979   1986   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1980   1986   1986   1987   Ljava/lang/IndexOutOfBoundsException;
        //  1979   1986   3      8      Any
        //  2035   2042   2042   2043   Any
        //  2036   2042   2042   2043   Any
        //  2035   2042   2042   2043   Any
        //  2035   2042   2035   2036   Ljava/lang/UnsupportedOperationException;
        //  2036   2042   3      8      Ljava/lang/AssertionError;
        //  2096   2102   2102   2103   Any
        //  2096   2102   2102   2103   Any
        //  2096   2102   3      8      Ljava/lang/ClassCastException;
        //  2096   2102   2102   2103   Ljava/lang/IllegalStateException;
        //  2096   2102   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2159   2166   2166   2167   Any
        //  2160   2166   2166   2167   Any
        //  2160   2166   2159   2160   Any
        //  2159   2166   2166   2167   Any
        //  2159   2166   3      8      Any
        //  2268   2275   2275   2276   Any
        //  2268   2275   2268   2269   Any
        //  2269   2275   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2269   2275   3      8      Any
        //  2269   2275   3      8      Ljava/lang/UnsupportedOperationException;
        //  2281   2287   2287   2288   Any
        //  2281   2287   3      8      Ljava/lang/IllegalArgumentException;
        //  2281   2287   3      8      Any
        //  2281   2287   2287   2288   Ljava/lang/NumberFormatException;
        //  2281   2287   2287   2288   Any
        //  2292   2299   2299   2300   Any
        //  2293   2299   2299   2300   Any
        //  2292   2299   2299   2300   Ljava/lang/IndexOutOfBoundsException;
        //  2292   2299   2292   2293   Any
        //  2293   2299   2299   2300   Ljava/lang/StringIndexOutOfBoundsException;
        //  2395   2402   2402   2403   Any
        //  2395   2402   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2395   2402   2395   2396   Any
        //  2395   2402   2395   2396   Any
        //  2396   2402   2402   2403   Any
        //  2408   2415   2415   2416   Any
        //  2409   2415   3      8      Any
        //  2409   2415   2408   2409   Any
        //  2409   2415   2408   2409   Any
        //  2409   2415   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2420   2427   2427   2428   Any
        //  2420   2427   2420   2421   Any
        //  2420   2427   2427   2428   Ljava/lang/RuntimeException;
        //  2421   2427   3      8      Any
        //  2421   2427   2420   2421   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2479   2486   2486   2487   Any
        //  2480   2486   2479   2480   Ljava/lang/NegativeArraySizeException;
        //  2479   2486   2486   2487   Any
        //  2479   2486   3      8      Any
        //  2480   2486   3      8      Ljava/lang/NumberFormatException;
        //  2547   2554   2554   2555   Any
        //  2547   2554   2547   2548   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2547   2554   2554   2555   Any
        //  2548   2554   2554   2555   Any
        //  2547   2554   2547   2548   Ljava/lang/IndexOutOfBoundsException;
        //  2608   2615   2615   2616   Any
        //  2608   2615   2615   2616   Any
        //  2608   2615   2615   2616   Any
        //  2609   2615   2615   2616   Any
        //  2609   2615   2608   2609   Ljava/lang/RuntimeException;
        //  2671   2678   2678   2679   Any
        //  2672   2678   2671   2672   Ljava/lang/NegativeArraySizeException;
        //  2671   2678   3      8      Any
        //  2671   2678   2678   2679   Any
        //  2672   2678   3      8      Any
        //  2731   2738   2738   2739   Any
        //  2732   2738   2738   2739   Any
        //  2732   2738   3      8      Ljava/lang/ClassCastException;
        //  2731   2738   2731   2732   Ljava/util/NoSuchElementException;
        //  2731   2738   2738   2739   Ljava/lang/StringIndexOutOfBoundsException;
        //  2743   2750   2750   2751   Any
        //  2743   2750   3      8      Any
        //  2744   2750   2750   2751   Ljava/lang/ClassCastException;
        //  2744   2750   2750   2751   Any
        //  2744   2750   2743   2744   Ljava/lang/IndexOutOfBoundsException;
        //  2799   2806   2806   2807   Any
        //  2800   2806   3      8      Any
        //  2800   2806   2799   2800   Any
        //  2800   2806   2799   2800   Ljava/lang/NegativeArraySizeException;
        //  2799   2806   3      8      Ljava/lang/IllegalArgumentException;
        //  2811   2818   2818   2819   Any
        //  2811   2818   3      8      Any
        //  2812   2818   3      8      Ljava/lang/NullPointerException;
        //  2811   2818   2811   2812   Ljava/lang/NumberFormatException;
        //  2812   2818   2811   2812   Ljava/lang/ArithmeticException;
        //  2916   2922   2922   2923   Any
        //  2916   2922   3      8      Ljava/util/NoSuchElementException;
        //  2916   2922   2922   2923   Any
        //  2916   2922   3      8      Any
        //  2916   2922   2922   2923   Any
        //  2927   2934   2934   2935   Any
        //  2927   2934   2927   2928   Any
        //  2927   2934   2934   2935   Ljava/lang/NegativeArraySizeException;
        //  2928   2934   3      8      Any
        //  2928   2934   3      8      Ljava/util/ConcurrentModificationException;
        //  2942   2949   2949   2950   Any
        //  2943   2949   2942   2943   Any
        //  2942   2949   2942   2943   Ljava/lang/RuntimeException;
        //  2943   2949   3      8      Any
        //  2942   2949   2949   2950   Any
        //  2953   2960   2960   2961   Any
        //  2954   2960   2953   2954   Any
        //  2954   2960   3      8      Any
        //  2954   2960   3      8      Ljava/lang/NullPointerException;
        //  2954   2960   3      8      Ljava/lang/IllegalStateException;
        //  2966   2972   2972   2973   Any
        //  2966   2972   2972   2973   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2966   2972   3      8      Any
        //  2966   2972   3      8      Any
        //  2966   2972   3      8      Ljava/lang/RuntimeException;
        //  2977   2984   2984   2985   Any
        //  2977   2984   3      8      Ljava/lang/NullPointerException;
        //  2978   2984   2984   2985   Ljava/lang/RuntimeException;
        //  2978   2984   3      8      Any
        //  2977   2984   2977   2978   Any
        //  2989   2996   2996   2997   Any
        //  2990   2996   2989   2990   Ljava/lang/EnumConstantNotPresentException;
        //  2990   2996   2996   2997   Any
        //  2989   2996   2996   2997   Ljava/lang/IllegalStateException;
        //  2989   2996   2989   2990   Any
        //  3100   3107   3107   3108   Any
        //  3100   3107   3      8      Ljava/lang/ClassCastException;
        //  3101   3107   3100   3101   Any
        //  3101   3107   3100   3101   Any
        //  3100   3107   3100   3101   Ljava/lang/ArithmeticException;
        //  3112   3119   3119   3120   Any
        //  3113   3119   3      8      Ljava/lang/RuntimeException;
        //  3113   3119   3112   3113   Ljava/lang/IllegalArgumentException;
        //  3113   3119   3119   3120   Ljava/lang/AssertionError;
        //  3113   3119   3      8      Ljava/lang/ClassCastException;
        //  3130   3137   3137   3138   Any
        //  3131   3137   3      8      Any
        //  3130   3137   3137   3138   Any
        //  3130   3137   3130   3131   Any
        //  3130   3137   3130   3131   Any
        //  3149   3156   3156   3157   Any
        //  3150   3156   3149   3150   Any
        //  3150   3156   3149   3150   Ljava/lang/NullPointerException;
        //  3150   3156   3156   3157   Ljava/lang/NullPointerException;
        //  3150   3156   3156   3157   Any
        //  3162   3168   3168   3169   Any
        //  3162   3168   3168   3169   Ljava/lang/NumberFormatException;
        //  3162   3168   3      8      Ljava/lang/NumberFormatException;
        //  3162   3168   3168   3169   Any
        //  3162   3168   3168   3169   Ljava/lang/StringIndexOutOfBoundsException;
        //  3179   3186   3186   3187   Any
        //  3179   3186   3179   3180   Any
        //  3179   3186   3179   3180   Any
        //  3180   3186   3179   3180   Ljava/lang/AssertionError;
        //  3180   3186   3      8      Ljava/lang/UnsupportedOperationException;
        //  3206   3213   3213   3214   Any
        //  3207   3213   3      8      Any
        //  3207   3213   3206   3207   Ljava/lang/IndexOutOfBoundsException;
        //  3207   3213   3213   3214   Ljava/lang/IllegalArgumentException;
        //  3206   3213   3206   3207   Any
        //  3218   3225   3225   3226   Any
        //  3218   3225   3225   3226   Ljava/lang/ArithmeticException;
        //  3219   3225   3225   3226   Ljava/lang/RuntimeException;
        //  3218   3225   3      8      Ljava/lang/NullPointerException;
        //  3219   3225   3218   3219   Any
        //  3236   3243   3243   3244   Any
        //  3237   3243   3236   3237   Ljava/lang/RuntimeException;
        //  3237   3243   3236   3237   Ljava/lang/NegativeArraySizeException;
        //  3236   3243   3      8      Any
        //  3236   3243   3236   3237   Ljava/lang/RuntimeException;
        //  3355   3362   3362   3363   Any
        //  3356   3362   3355   3356   Any
        //  3356   3362   3      8      Ljava/lang/IllegalArgumentException;
        //  3356   3362   3355   3356   Ljava/lang/AssertionError;
        //  3355   3362   3355   3356   Ljava/lang/NumberFormatException;
        //  3417   3423   3423   3424   Any
        //  3417   3423   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  3417   3423   3423   3424   Ljava/lang/IllegalArgumentException;
        //  3417   3423   3423   3424   Any
        //  3417   3423   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  3428   3435   3435   3436   Any
        //  3428   3435   3      8      Any
        //  3429   3435   3      8      Any
        //  3429   3435   3428   3429   Any
        //  3429   3435   3      8      Any
        //  3440   3446   3446   3447   Any
        //  3440   3446   3      8      Ljava/lang/ClassCastException;
        //  3440   3446   3446   3447   Any
        //  3440   3446   3      8      Any
        //  3440   3446   3      8      Ljava/util/ConcurrentModificationException;
        //  3544   3551   3551   3552   Any
        //  3545   3551   3551   3552   Any
        //  3544   3551   3551   3552   Ljava/lang/ArithmeticException;
        //  3544   3551   3      8      Ljava/lang/IllegalStateException;
        //  3545   3551   3544   3545   Any
        //  3562   3569   3569   3570   Any
        //  3562   3569   3      8      Any
        //  3563   3569   3      8      Ljava/lang/ArithmeticException;
        //  3562   3569   3562   3563   Any
        //  3563   3569   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3578   3584   3584   3585   Any
        //  3578   3584   3584   3585   Any
        //  3578   3584   3      8      Ljava/lang/NegativeArraySizeException;
        //  3578   3584   3584   3585   Any
        //  3578   3584   3584   3585   Ljava/lang/IllegalArgumentException;
        //  3683   3690   3690   3691   Any
        //  3684   3690   3690   3691   Ljava/lang/StringIndexOutOfBoundsException;
        //  3684   3690   3690   3691   Any
        //  3683   3690   3      8      Ljava/lang/NullPointerException;
        //  3684   3690   3683   3684   Ljava/lang/RuntimeException;
        //  3741   3747   3747   3748   Any
        //  3741   3747   3747   3748   Ljava/lang/IllegalArgumentException;
        //  3741   3747   3      8      Ljava/lang/NegativeArraySizeException;
        //  3741   3747   3747   3748   Ljava/util/ConcurrentModificationException;
        //  3741   3747   3747   3748   Ljava/lang/IndexOutOfBoundsException;
        //  3752   3759   3759   3760   Any
        //  3752   3759   3      8      Any
        //  3752   3759   3759   3760   Ljava/lang/NegativeArraySizeException;
        //  3753   3759   3752   3753   Ljava/lang/StringIndexOutOfBoundsException;
        //  3752   3759   3752   3753   Any
        //  3765   3772   3772   3773   Any
        //  3765   3772   3765   3766   Any
        //  3765   3772   3765   3766   Any
        //  3766   3772   3      8      Ljava/lang/RuntimeException;
        //  3766   3772   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  3824   3830   3830   3831   Any
        //  3824   3830   3830   3831   Any
        //  3824   3830   3830   3831   Ljava/lang/IllegalStateException;
        //  3824   3830   3830   3831   Ljava/lang/ClassCastException;
        //  3824   3830   3830   3831   Any
        //  3838   3845   3845   3846   Any
        //  3839   3845   3845   3846   Ljava/lang/IndexOutOfBoundsException;
        //  3839   3845   3838   3839   Ljava/lang/ClassCastException;
        //  3839   3845   3838   3839   Ljava/lang/NegativeArraySizeException;
        //  3838   3845   3838   3839   Ljava/lang/ClassCastException;
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
    
    public void c(final int n, final int n2) {
        fbS.1Z(this, 113010196, n, n2);
    }
    
    public void c(final double p0, final double p1, final double p2, final double p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          210
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            202
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            194
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: fconst_1       
        //    25: fconst_1       
        //    26: fconst_1       
        //    27: fconst_1       
        //    28: goto            32
        //    31: athrow         
        //    32: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179131_c:(FFFF)V
        //    35: goto            39
        //    38: athrow         
        //    39: dload_1        
        //    40: getstatic       dev/nuker/pyro/fc.c:I
        //    43: ifge            52
        //    46: ldc_w           1110604807
        //    49: goto            55
        //    52: ldc_w           -1476639097
        //    55: ldc_w           -995922881
        //    58: ixor           
        //    59: lookupswitch {
        //          -2037313480: 52
        //          1667181240: 84
        //          default: 181
        //        }
        //    84: dload_3        
        //    85: dload           5
        //    87: dload           7
        //    89: ldc_w           4.0
        //    92: goto            96
        //    95: athrow         
        //    96: invokestatic    dev/nuker/pyro/fbs.c:(DDDDF)V
        //    99: goto            103
        //   102: athrow         
        //   103: fconst_0       
        //   104: fconst_0       
        //   105: fconst_0       
        //   106: fconst_1       
        //   107: goto            111
        //   110: athrow         
        //   111: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179131_c:(FFFF)V
        //   114: goto            118
        //   117: athrow         
        //   118: dload_1        
        //   119: dload_3        
        //   120: getstatic       dev/nuker/pyro/fc.0:I
        //   123: ifeq            132
        //   126: ldc_w           118736203
        //   129: goto            135
        //   132: ldc_w           1885000390
        //   135: ldc_w           -361171652
        //   138: ixor           
        //   139: lookupswitch {
        //          -1709037574: 164
        //          -311742345: 132
        //          default: 183
        //        }
        //   164: dload           5
        //   166: dload           7
        //   168: fconst_2       
        //   169: goto            173
        //   172: athrow         
        //   173: invokestatic    dev/nuker/pyro/fbs.c:(DDDDF)V
        //   176: goto            180
        //   179: athrow         
        //   180: return         
        //   181: aconst_null    
        //   182: athrow         
        //   183: aconst_null    
        //   184: athrow         
        //   185: pop            
        //   186: goto            24
        //   189: pop            
        //   190: aconst_null    
        //   191: goto            185
        //   194: dup            
        //   195: ifnull          185
        //   198: checkcast       Ljava/lang/Throwable;
        //   201: athrow         
        //   202: dup            
        //   203: ifnull          189
        //   206: checkcast       Ljava/lang/Throwable;
        //   209: athrow         
        //   210: aconst_null    
        //   211: athrow         
        //    StackMapTable: 00 21 43 07 00 35 04 FF 00 0B 00 00 00 01 07 00 35 FF 00 03 00 05 07 00 03 03 03 03 03 00 00 46 07 00 35 FF 00 00 00 05 07 00 03 03 03 03 03 00 04 02 02 02 02 45 07 00 35 00 4C 03 FF 00 02 00 05 07 00 03 03 03 03 03 00 02 03 01 5C 03 FF 00 0A 00 00 00 01 07 00 35 FF 00 00 00 05 07 00 03 03 03 03 03 00 05 03 03 03 03 02 45 07 00 35 00 FF 00 06 00 00 00 01 07 00 35 FF 00 00 00 05 07 00 03 03 03 03 03 00 04 02 02 02 02 45 07 00 35 00 FF 00 0D 00 05 07 00 03 03 03 03 03 00 02 03 03 FF 00 02 00 05 07 00 03 03 03 03 03 00 03 03 03 01 FF 00 1C 00 05 07 00 03 03 03 03 03 00 02 03 03 47 07 00 35 FF 00 00 00 05 07 00 03 03 03 03 03 00 05 03 03 03 03 02 45 07 00 35 00 40 03 FF 00 01 00 05 07 00 03 03 03 03 03 00 02 03 03 41 07 00 35 43 05 44 07 00 35 47 05 47 07 00 35
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     194    202    Any
        //  194    202    194    202    Any
        //  210    212    3      8      Any
        //  31     38     38     39     Any
        //  31     38     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  32     38     31     32     Any
        //  31     38     3      8      Ljava/lang/NegativeArraySizeException;
        //  31     38     31     32     Any
        //  96     102    102    103    Any
        //  96     102    3      8      Ljava/lang/AssertionError;
        //  96     102    102    103    Ljava/util/NoSuchElementException;
        //  96     102    102    103    Any
        //  96     102    3      8      Ljava/lang/NumberFormatException;
        //  111    117    117    118    Any
        //  111    117    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  111    117    117    118    Ljava/lang/NullPointerException;
        //  111    117    3      8      Ljava/lang/RuntimeException;
        //  111    117    3      8      Ljava/lang/NumberFormatException;
        //  172    179    179    180    Any
        //  173    179    172    173    Any
        //  173    179    179    180    Ljava/lang/AssertionError;
        //  173    179    179    180    Ljava/util/NoSuchElementException;
        //  172    179    172    173    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 29 out of bounds for length 29
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
    public void c(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          63
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            55
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            47
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: goto            30
        //    29: athrow         
        //    30: invokespecial   dev/nuker/pyro/f43.c:(Z)V
        //    33: goto            37
        //    36: athrow         
        //    37: return         
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
        //    StackMapTable: 00 0D 43 07 00 35 04 FF 00 0B 00 00 00 01 07 00 35 FD 00 03 07 00 03 01 FF 00 04 00 00 00 01 07 00 35 FF 00 00 00 02 07 00 03 01 00 02 07 00 03 01 45 07 00 35 00 40 07 00 35 43 05 44 07 00 35 47 05 47 07 00 35
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     47     55     Any
        //  47     55     47     55     Any
        //  63     65     3      8      Any
        //  30     36     36     37     Any
        //  30     36     3      8      Ljava/lang/NegativeArraySizeException;
        //  30     36     3      8      Ljava/lang/NegativeArraySizeException;
        //  30     36     36     37     Any
        //  30     36     36     37     Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 25 out of bounds for length 25
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
    
    public void c() {
        fbS.dC(this, 862905324);
    }
    
    public f4e(final String s, final String s2, final f49 f49, final boolean b) {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.1 != 0) {
                    n = 1977462492;
                    break Label_0017;
                }
                n = 427186093;
            }
            switch (n ^ 0xBC4C609A) {
                case 402341252: {
                    continue;
                }
                default: {
                    final f44 0 = f44.0;
                    while (true) {
                        int n2 = 0;
                        Label_0068: {
                            if (fc.1 != 0) {
                                n2 = -1616831523;
                                break Label_0068;
                            }
                            n2 = -491655217;
                        }
                        switch (n2 ^ 0x96501F4) {
                            case -568522563: {
                                continue;
                            }
                            default: {
                                final boolean b2 = !b;
                                while (true) {
                                    int n3 = 0;
                                    Label_0125: {
                                        if (fc.c < 0) {
                                            n3 = 1249893460;
                                            break Label_0125;
                                        }
                                        n3 = 1285765314;
                                    }
                                    switch (n3 ^ 0x63A99FA1) {
                                        case 693329157: {
                                            continue;
                                        }
                                        default: {
                                            super(s, s2, f49, 0, b2);
                                            final ScaledResolution c = null;
                                            while (true) {
                                                int n4 = 0;
                                                Label_0176: {
                                                    if (fc.c < 0) {
                                                        n4 = -1869867611;
                                                        break Label_0176;
                                                    }
                                                    n4 = 839985631;
                                                }
                                                switch (n4 ^ 0xD496ECAF) {
                                                    case 1349018670: {
                                                        continue;
                                                    }
                                                    default: {
                                                        this.c = c;
                                                        return;
                                                    }
                                                    case 1142618378: {
                                                        throw null;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        case 701907957: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case -1765533143: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case -913191354: {
                    throw null;
                }
            }
            break;
        }
    }
}
