// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.alt.Alt;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.GuiListExtended$IGuiListEntry;

public class fn implements GuiListExtended$IGuiListEntry
{
    public static ResourceLocation c;
    public Minecraft c;
    public fl c;
    public fm c;
    public Alt c;
    public fp c;
    public long c;
    
    public void 0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          891
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            883
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            875
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             -437686778
        //    32: goto            37
        //    35: ldc             1715780250
        //    37: ldc             -1467653858
        //    39: ixor           
        //    40: lookupswitch {
        //          -76152907: 35
        //          1298927384: 846
        //          default: 68
        //        }
        //    68: getstatic       dev/nuker/pyro/alt/AltManager.INSTANCE:Ldev/nuker/pyro/alt/AltManager;
        //    71: aload_0        
        //    72: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/alt/Alt;
        //    75: goto            79
        //    78: athrow         
        //    79: invokevirtual   dev/nuker/pyro/alt/AltManager.makeFirst:(Ldev/nuker/pyro/alt/Alt;)V
        //    82: goto            86
        //    85: athrow         
        //    86: aload_0        
        //    87: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/alt/Alt;
        //    90: getstatic       dev/nuker/pyro/fc.c:I
        //    93: ifge            101
        //    96: ldc             -1682390053
        //    98: goto            103
        //   101: ldc             1455999379
        //   103: ldc             -1677005356
        //   105: ixor           
        //   106: lookupswitch {
        //          -893246393: 132
        //          129117711: 101
        //          default: 844
        //        }
        //   132: goto            136
        //   135: athrow         
        //   136: invokevirtual   dev/nuker/pyro/alt/Alt.isCracked:()Z
        //   139: goto            143
        //   142: athrow         
        //   143: ifeq            151
        //   146: ldc             -1687308381
        //   148: goto            153
        //   151: ldc             -1687308384
        //   153: ldc             84645954
        //   155: ixor           
        //   156: tableswitch {
        //          1020026818: 180
        //          1020026819: 295
        //          default: 146
        //        }
        //   180: aload_0        
        //   181: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/alt/Alt;
        //   184: getstatic       dev/nuker/pyro/fc.0:I
        //   187: ifeq            195
        //   190: ldc             787750971
        //   192: goto            197
        //   195: ldc             -1848226217
        //   197: ldc             1590528945
        //   199: ixor           
        //   200: lookupswitch {
        //          -1136116207: 195
        //          1882827658: 858
        //          default: 228
        //        }
        //   228: goto            232
        //   231: athrow         
        //   232: invokevirtual   dev/nuker/pyro/alt/Alt.getUsername:()Ljava/lang/String;
        //   235: goto            239
        //   238: athrow         
        //   239: getstatic       dev/nuker/pyro/fc.c:I
        //   242: ifge            250
        //   245: ldc             -461266179
        //   247: goto            252
        //   250: ldc             428608720
        //   252: ldc             2099642520
        //   254: ixor           
        //   255: lookupswitch {
        //          -2024140974: 250
        //          -1717067163: 840
        //          default: 280
        //        }
        //   280: goto            284
        //   283: athrow         
        //   284: invokestatic    dev/nuker/pyro/alt/AltLogic.loginOffline:(Ljava/lang/String;)Z
        //   287: goto            291
        //   290: athrow         
        //   291: pop            
        //   292: goto            839
        //   295: aload_0        
        //   296: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/alt/Alt;
        //   299: goto            303
        //   302: athrow         
        //   303: invokevirtual   dev/nuker/pyro/alt/Alt.getEmail:()Ljava/lang/String;
        //   306: goto            310
        //   309: athrow         
        //   310: aload_0        
        //   311: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/alt/Alt;
        //   314: goto            318
        //   317: athrow         
        //   318: invokevirtual   dev/nuker/pyro/alt/Alt.getPassword:()Ljava/lang/String;
        //   321: goto            325
        //   324: athrow         
        //   325: getstatic       dev/nuker/pyro/fc.c:I
        //   328: ifge            336
        //   331: ldc             343955805
        //   333: goto            338
        //   336: ldc             -782438110
        //   338: ldc             -164726981
        //   340: ixor           
        //   341: lookupswitch {
        //          -491901338: 336
        //          661816857: 368
        //          default: 852
        //        }
        //   368: goto            372
        //   371: athrow         
        //   372: invokestatic    dev/nuker/pyro/alt/AltLogic.login:(Ljava/lang/String;Ljava/lang/String;)I
        //   375: goto            379
        //   378: athrow         
        //   379: tableswitch {
        //                0: 404
        //                1: 542
        //                2: 650
        //          default: 839
        //        }
        //   404: getstatic       dev/nuker/pyro/fc.c:I
        //   407: ifge            415
        //   410: ldc             -1232487638
        //   412: goto            417
        //   415: ldc             188526071
        //   417: ldc             2143711144
        //   419: ixor           
        //   420: lookupswitch {
        //          -942956771: 415
        //          -917515134: 842
        //          default: 448
        //        }
        //   448: aload_0        
        //   449: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/fl;
        //   452: iconst_0       
        //   453: putfield        dev/nuker/pyro/fl.0:Z
        //   456: new             Ljava/lang/Thread;
        //   459: dup            
        //   460: aload_0        
        //   461: invokedynamic   BootstrapMethod #0, run:(Ldev/nuker/pyro/fn;)Ljava/lang/Runnable;
        //   466: goto            470
        //   469: athrow         
        //   470: invokespecial   java/lang/Thread.<init>:(Ljava/lang/Runnable;)V
        //   473: goto            477
        //   476: athrow         
        //   477: goto            481
        //   480: athrow         
        //   481: invokevirtual   java/lang/Thread.start:()V
        //   484: goto            488
        //   487: athrow         
        //   488: aload_0        
        //   489: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/fl;
        //   492: ldc             ""
        //   494: getstatic       dev/nuker/pyro/fc.1:I
        //   497: ifeq            505
        //   500: ldc             1416060583
        //   502: goto            507
        //   505: ldc             -1610793448
        //   507: ldc             -139204780
        //   509: ixor           
        //   510: lookupswitch {
        //          -1546339853: 860
        //          -164110843: 505
        //          default: 536
        //        }
        //   536: putfield        dev/nuker/pyro/fl.c:Ljava/lang/String;
        //   539: goto            839
        //   542: aload_0        
        //   543: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/fl;
        //   546: ldc             "\u10cd\u149d\ub9e3\ub19a\ufee1\udeeb\ub220\ud598\udb2f\ude93\u9423\u1e45\ud2f0\uc7a5\ub616\uba6b\u57e4\u440d\ubf7e\uf731\u1805\uc22c\u591a\u2f06\ue0f8"
        //   548: getstatic       dev/nuker/pyro/fc.1:I
        //   551: ifeq            559
        //   554: ldc             1287911
        //   556: goto            561
        //   559: ldc             -1152014976
        //   561: ldc             961719687
        //   563: ixor           
        //   564: lookupswitch {
        //          -2113468409: 592
        //          960564064: 559
        //          default: 848
        //        }
        //   592: goto            596
        //   595: athrow         
        //   596: invokestatic    invokestatic   !!! ERROR
        //   599: goto            603
        //   602: athrow         
        //   603: getstatic       dev/nuker/pyro/fc.c:I
        //   606: ifge            614
        //   609: ldc             -1301319395
        //   611: goto            616
        //   614: ldc             571153982
        //   616: ldc             -1280581796
        //   618: ixor           
        //   619: lookupswitch {
        //          -1109142767: 614
        //          29666881: 854
        //          default: 644
        //        }
        //   644: putfield        dev/nuker/pyro/fl.c:Ljava/lang/String;
        //   647: goto            839
        //   650: getstatic       dev/nuker/pyro/fc.c:I
        //   653: ifge            661
        //   656: ldc             -688374619
        //   658: goto            663
        //   661: ldc             -1390025606
        //   663: ldc             1399569041
        //   665: ixor           
        //   666: lookupswitch {
        //          -2053929420: 661
        //          -28418325: 692
        //          default: 850
        //        }
        //   692: aload_0        
        //   693: getstatic       dev/nuker/pyro/fc.1:I
        //   696: ifeq            704
        //   699: ldc             1320813314
        //   701: goto            706
        //   704: ldc             -2033597863
        //   706: ldc             -1849726336
        //   708: ixor           
        //   709: lookupswitch {
        //          -1882770639: 704
        //          -553293438: 856
        //          default: 736
        //        }
        //   736: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/fl;
        //   739: ldc             "\u10d1\u149d\ub9f4\ub199\ufee1\udee7\ub264\ud5cc\udb25\udede\u9421\u1e43\ud2f2\uc7eb\ub61c\uba7a\u57b0\u445d\ubf6b\uf72d\u1856\uc23a\u5900\u2f00\ue0f4\u0684\u7d25\ubaa2\u825a\ubbba\ub7a5\ufb26\u43c3\u985b\u2ca5\uc223\u496f\ubb7c\uc8d6\uc81f\u85d9\u41e1\u8aff"
        //   741: getstatic       dev/nuker/pyro/fc.c:I
        //   744: ifge            752
        //   747: ldc             -751639545
        //   749: goto            754
        //   752: ldc             -1410413304
        //   754: ldc             -480582788
        //   756: ixor           
        //   757: lookupswitch {
        //          -856866520: 752
        //          812124027: 862
        //          default: 784
        //        }
        //   784: goto            788
        //   787: athrow         
        //   788: invokestatic    invokestatic   !!! ERROR
        //   791: goto            795
        //   794: athrow         
        //   795: getstatic       dev/nuker/pyro/fc.0:I
        //   798: ifeq            806
        //   801: ldc             723911716
        //   803: goto            808
        //   806: ldc             -1317888728
        //   808: ldc             -2036968597
        //   810: ixor           
        //   811: lookupswitch {
        //          -1380952241: 806
        //          937741891: 836
        //          default: 864
        //        }
        //   836: putfield        dev/nuker/pyro/fl.c:Ljava/lang/String;
        //   839: return         
        //   840: aconst_null    
        //   841: athrow         
        //   842: aconst_null    
        //   843: athrow         
        //   844: aconst_null    
        //   845: athrow         
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
        //   866: pop            
        //   867: goto            24
        //   870: pop            
        //   871: aconst_null    
        //   872: goto            866
        //   875: dup            
        //   876: ifnull          866
        //   879: checkcast       Ljava/lang/Throwable;
        //   882: athrow         
        //   883: dup            
        //   884: ifnull          870
        //   887: checkcast       Ljava/lang/Throwable;
        //   890: athrow         
        //   891: aconst_null    
        //   892: athrow         
        //    StackMapTable: 00 72 43 07 00 34 04 FF 00 0B 00 00 00 01 07 00 34 FC 00 03 07 00 03 0A 41 01 1E 49 07 00 34 FF 00 00 00 01 07 00 03 00 02 07 00 3B 07 00 4A 45 07 00 34 00 4E 07 00 4A FF 00 01 00 01 07 00 03 00 02 07 00 4A 01 5C 07 00 4A 42 07 00 34 40 07 00 4A 45 07 00 34 40 01 02 04 41 01 1A 4E 07 00 4A FF 00 01 00 01 07 00 03 00 02 07 00 4A 01 5E 07 00 4A FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 01 07 00 03 00 01 07 00 4A 45 07 00 34 40 07 00 B8 4A 07 00 B8 FF 00 01 00 01 07 00 03 00 02 07 00 B8 01 5B 07 00 B8 42 07 00 34 40 07 00 B8 45 07 00 34 40 01 03 46 07 00 34 40 07 00 4A 45 07 00 34 40 07 00 B8 46 07 00 34 FF 00 00 00 01 07 00 03 00 02 07 00 B8 07 00 4A 45 07 00 34 FF 00 00 00 01 07 00 03 00 02 07 00 B8 07 00 B8 FF 00 0A 00 01 07 00 03 00 02 07 00 B8 07 00 B8 FF 00 01 00 01 07 00 03 00 03 07 00 B8 07 00 B8 01 FF 00 1D 00 01 07 00 03 00 02 07 00 B8 07 00 B8 42 07 00 21 FF 00 00 00 01 07 00 03 00 02 07 00 B8 07 00 B8 45 07 00 34 40 01 18 0A 41 01 1E 54 07 00 34 FF 00 00 00 01 07 00 03 00 03 08 01 C8 08 01 C8 07 00 BA 45 07 00 34 40 07 00 7A 42 07 00 34 40 07 00 7A 45 07 00 34 00 FF 00 10 00 01 07 00 03 00 02 07 00 75 07 00 B8 FF 00 01 00 01 07 00 03 00 03 07 00 75 07 00 B8 01 FF 00 1C 00 01 07 00 03 00 02 07 00 75 07 00 B8 05 FF 00 10 00 01 07 00 03 00 02 07 00 75 07 00 B8 FF 00 01 00 01 07 00 03 00 03 07 00 75 07 00 B8 01 FF 00 1E 00 01 07 00 03 00 02 07 00 75 07 00 B8 42 07 00 2B FF 00 00 00 01 07 00 03 00 02 07 00 75 07 00 B8 45 07 00 34 FF 00 00 00 01 07 00 03 00 02 07 00 75 07 00 B8 FF 00 0A 00 01 07 00 03 00 02 07 00 75 07 00 B8 FF 00 01 00 01 07 00 03 00 03 07 00 75 07 00 B8 01 FF 00 1B 00 01 07 00 03 00 02 07 00 75 07 00 B8 05 0A 41 01 1C 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 FF 00 0F 00 01 07 00 03 00 02 07 00 75 07 00 B8 FF 00 01 00 01 07 00 03 00 03 07 00 75 07 00 B8 01 FF 00 1D 00 01 07 00 03 00 02 07 00 75 07 00 B8 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 01 07 00 03 00 02 07 00 75 07 00 B8 45 07 00 34 FF 00 00 00 01 07 00 03 00 02 07 00 75 07 00 B8 FF 00 0A 00 01 07 00 03 00 02 07 00 75 07 00 B8 FF 00 01 00 01 07 00 03 00 03 07 00 75 07 00 B8 01 FF 00 1B 00 01 07 00 03 00 02 07 00 75 07 00 B8 02 40 07 00 B8 01 41 07 00 4A 01 FF 00 01 00 01 07 00 03 00 02 07 00 75 07 00 B8 01 FF 00 01 00 01 07 00 03 00 02 07 00 B8 07 00 B8 FF 00 01 00 01 07 00 03 00 02 07 00 75 07 00 B8 41 07 00 03 41 07 00 4A FF 00 01 00 01 07 00 03 00 02 07 00 75 07 00 B8 FF 00 01 00 01 07 00 03 00 02 07 00 75 07 00 B8 FF 00 01 00 01 07 00 03 00 02 07 00 75 07 00 B8 41 07 00 1B 43 05 44 07 00 1B 47 05 47 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     875    883    Ljava/lang/IndexOutOfBoundsException;
        //  875    883    875    883    Ljava/lang/NumberFormatException;
        //  891    893    3      8      Any
        //  78     85     85     86     Any
        //  79     85     85     86     Any
        //  78     85     3      8      Any
        //  78     85     78     79     Any
        //  78     85     78     79     Any
        //  135    142    142    143    Any
        //  136    142    3      8      Ljava/lang/NegativeArraySizeException;
        //  136    142    142    143    Ljava/lang/ClassCastException;
        //  135    142    135    136    Any
        //  135    142    3      8      Any
        //  232    238    238    239    Any
        //  232    238    3      8      Any
        //  232    238    3      8      Any
        //  232    238    238    239    Ljava/lang/RuntimeException;
        //  232    238    238    239    Ljava/lang/NullPointerException;
        //  283    290    290    291    Any
        //  284    290    283    284    Any
        //  283    290    283    284    Any
        //  284    290    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  283    290    283    284    Ljava/lang/ArithmeticException;
        //  302    309    309    310    Any
        //  302    309    302    303    Any
        //  302    309    309    310    Any
        //  303    309    3      8      Ljava/lang/IllegalStateException;
        //  303    309    309    310    Ljava/lang/StringIndexOutOfBoundsException;
        //  317    324    324    325    Any
        //  318    324    3      8      Any
        //  318    324    317    318    Any
        //  317    324    324    325    Any
        //  318    324    317    318    Any
        //  371    378    378    379    Any
        //  371    378    371    372    Ljava/lang/ArithmeticException;
        //  372    378    378    379    Any
        //  371    378    378    379    Ljava/util/ConcurrentModificationException;
        //  372    378    3      8      Any
        //  469    476    476    477    Any
        //  469    476    469    470    Any
        //  469    476    469    470    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  470    476    3      8      Ljava/lang/UnsupportedOperationException;
        //  470    476    476    477    Any
        //  480    487    487    488    Any
        //  481    487    3      8      Any
        //  480    487    3      8      Any
        //  481    487    487    488    Any
        //  480    487    480    481    Any
        //  595    602    602    603    Any
        //  595    602    602    603    Any
        //  596    602    602    603    Ljava/lang/IndexOutOfBoundsException;
        //  595    602    602    603    Any
        //  596    602    595    596    Ljava/lang/IllegalArgumentException;
        //  788    794    794    795    Any
        //  788    794    3      8      Any
        //  788    794    794    795    Any
        //  788    794    794    795    Ljava/lang/AssertionError;
        //  788    794    3      8      Ljava/lang/NegativeArraySizeException;
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
    
    public fn(final fm c, final Alt c2) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.0 != 0) {
                    n = 1305422269;
                    break Label_0013;
                }
                n = -370152098;
            }
            switch (n ^ 0x31DD6338) {
                case 631675422: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0062: {
                            if (fc.1 != 0) {
                                n2 = 1051284238;
                                break Label_0062;
                            }
                            n2 = -382532812;
                        }
                        switch (n2 ^ 0xBEB08EAC) {
                            case -2145788510: {
                                continue;
                            }
                            case 1468239256: {
                                this.c = c;
                                while (true) {
                                    int n3 = 0;
                                    Label_0111: {
                                        if (fc.1 != 0) {
                                            n3 = -754529328;
                                            break Label_0111;
                                        }
                                        n3 = 1705934430;
                                    }
                                    switch (n3 ^ 0x9F5A03CC) {
                                        case 1281148956: {
                                            continue;
                                        }
                                        case -84640366: {
                                            this.c = c.1();
                                            while (true) {
                                                int n4 = 0;
                                                Label_0159: {
                                                    if (fc.1 != 0) {
                                                        n4 = -390325133;
                                                        break Label_0159;
                                                    }
                                                    n4 = 1742469768;
                                                }
                                                switch (n4 ^ 0x6C74188E) {
                                                    case -2136444508: {
                                                        continue;
                                                    }
                                                    default: {
                                                        this.c = Minecraft.func_71410_x();
                                                        this.c = c2;
                                                        final fq c3 = this.c.c;
                                                        while (true) {
                                                            int n5 = 0;
                                                            Label_0222: {
                                                                if (fc.1 != 0) {
                                                                    n5 = 842037609;
                                                                    break Label_0222;
                                                                }
                                                                n5 = 2076403980;
                                                            }
                                                            switch (n5 ^ 0x86D10638) {
                                                                case -1260290223: {
                                                                    continue;
                                                                }
                                                                case -49123532: {
                                                                    final fp c4 = c3.c(c2);
                                                                    while (true) {
                                                                        int n6 = 0;
                                                                        Label_0268: {
                                                                            if (fc.1 != 0) {
                                                                                n6 = -457242072;
                                                                                break Label_0268;
                                                                            }
                                                                            n6 = -329398149;
                                                                        }
                                                                        switch (n6 ^ 0xAE167DD5) {
                                                                            case -2130198594: {
                                                                                continue;
                                                                            }
                                                                            default: {
                                                                                this.c = c4;
                                                                                return;
                                                                            }
                                                                            case 1252620285: {
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
                                                    case -2067266307: {
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
                case 2081573509: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void func_192634_a(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final boolean p7, final float p8) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          3077
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            3069
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            3061
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: goto            28
        //    27: athrow         
        //    28: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    31: goto            35
        //    34: athrow         
        //    35: getstatic       dev/nuker/pyro/fc.0:I
        //    38: ifeq            46
        //    41: ldc             1852093833
        //    43: goto            48
        //    46: ldc             -2040908507
        //    48: ldc             545847191
        //    50: ixor           
        //    51: lookupswitch {
        //          -1496137038: 76
        //          1324106270: 46
        //          default: 3050
        //        }
        //    76: aload_0        
        //    77: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/fl;
        //    80: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fq;
        //    83: getfield        dev/nuker/pyro/fq.c:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    86: putfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    89: getstatic       dev/nuker/pyro/fc.1:I
        //    92: ifeq            100
        //    95: ldc             745116252
        //    97: goto            102
        //   100: ldc             -1186201393
        //   102: ldc             1818927240
        //   104: ixor           
        //   105: lookupswitch {
        //          1073951444: 2978
        //          1201766651: 100
        //          default: 132
        //        }
        //   132: aload_0        
        //   133: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/alt/Alt;
        //   136: goto            140
        //   139: athrow         
        //   140: invokevirtual   dev/nuker/pyro/alt/Alt.getUsername:()Ljava/lang/String;
        //   143: goto            147
        //   146: athrow         
        //   147: astore          10
        //   149: getstatic       dev/nuker/pyro/fc.0:I
        //   152: ifeq            160
        //   155: ldc             -1478952327
        //   157: goto            162
        //   160: ldc             -824599739
        //   162: ldc             316636326
        //   164: ixor           
        //   165: lookupswitch {
        //          -1257797921: 160
        //          -603527197: 192
        //          default: 3008
        //        }
        //   192: aload_0        
        //   193: getstatic       dev/nuker/pyro/fc.1:I
        //   196: ifeq            205
        //   199: ldc_w           1955349749
        //   202: goto            208
        //   205: ldc_w           56125847
        //   208: ldc_w           1587834341
        //   211: ixor           
        //   212: lookupswitch {
        //          707275024: 3040
        //          1674895187: 205
        //          default: 240
        //        }
        //   240: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/alt/Alt;
        //   243: goto            247
        //   246: athrow         
        //   247: invokevirtual   dev/nuker/pyro/alt/Alt.isCracked:()Z
        //   250: goto            254
        //   253: athrow         
        //   254: ifeq            263
        //   257: ldc_w           -1434497135
        //   260: goto            266
        //   263: ldc_w           -1434497136
        //   266: ldc_w           -1042100245
        //   269: ixor           
        //   270: tableswitch {
        //          -683998988: 292
        //          -683998987: 542
        //          default: 257
        //        }
        //   292: new             Ljava/lang/StringBuilder;
        //   295: dup            
        //   296: getstatic       dev/nuker/pyro/fc.0:I
        //   299: ifeq            308
        //   302: ldc_w           1553178524
        //   305: goto            311
        //   308: ldc_w           -1992488545
        //   311: ldc_w           -717261543
        //   314: ixor           
        //   315: lookupswitch {
        //          -1985156475: 3042
        //          905666128: 308
        //          default: 340
        //        }
        //   340: goto            344
        //   343: athrow         
        //   344: invokespecial   java/lang/StringBuilder.<init>:()V
        //   347: goto            351
        //   350: athrow         
        //   351: getstatic       net/minecraft/util/text/TextFormatting.RED:Lnet/minecraft/util/text/TextFormatting;
        //   354: getstatic       dev/nuker/pyro/fc.0:I
        //   357: ifeq            366
        //   360: ldc_w           -2061657381
        //   363: goto            369
        //   366: ldc_w           1122257686
        //   369: ldc_w           671340153
        //   372: ixor           
        //   373: lookupswitch {
        //          -1390523230: 3038
        //          1248028165: 366
        //          default: 400
        //        }
        //   400: goto            404
        //   403: athrow         
        //   404: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   407: goto            411
        //   410: athrow         
        //   411: ldc_w           "\u10c7\u1481\ub9f4\u4422\ucb88\udee7\ub220"
        //   414: goto            418
        //   417: athrow         
        //   418: invokestatic    invokestatic   !!! ERROR
        //   421: goto            425
        //   424: athrow         
        //   425: getstatic       dev/nuker/pyro/fc.0:I
        //   428: ifeq            437
        //   431: ldc_w           1256258090
        //   434: goto            440
        //   437: ldc_w           1365195855
        //   440: ldc_w           1030425578
        //   443: ixor           
        //   444: lookupswitch {
        //          1815361445: 472
        //          2005660096: 437
        //          default: 3022
        //        }
        //   472: goto            476
        //   475: athrow         
        //   476: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   479: goto            483
        //   482: athrow         
        //   483: getstatic       dev/nuker/pyro/fc.0:I
        //   486: ifeq            495
        //   489: ldc_w           1820159223
        //   492: goto            498
        //   495: ldc_w           -985254010
        //   498: ldc_w           -99479770
        //   501: ixor           
        //   502: lookupswitch {
        //          -1771084847: 495
        //          1062484128: 528
        //          default: 3004
        //        }
        //   528: goto            532
        //   531: athrow         
        //   532: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   535: goto            539
        //   538: athrow         
        //   539: goto            699
        //   542: new             Ljava/lang/StringBuilder;
        //   545: dup            
        //   546: goto            550
        //   549: athrow         
        //   550: invokespecial   java/lang/StringBuilder.<init>:()V
        //   553: goto            557
        //   556: athrow         
        //   557: getstatic       dev/nuker/pyro/fc.c:I
        //   560: ifge            569
        //   563: ldc_w           -1021294771
        //   566: goto            572
        //   569: ldc_w           -1433712288
        //   572: ldc_w           1027551362
        //   575: ixor           
        //   576: lookupswitch {
        //          -1749779998: 604
        //          -31492145: 569
        //          default: 3048
        //        }
        //   604: getstatic       net/minecraft/util/text/TextFormatting.GRAY:Lnet/minecraft/util/text/TextFormatting;
        //   607: goto            611
        //   610: athrow         
        //   611: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   614: goto            618
        //   617: athrow         
        //   618: aload_0        
        //   619: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/alt/Alt;
        //   622: goto            626
        //   625: athrow         
        //   626: invokevirtual   dev/nuker/pyro/alt/Alt.getEmail:()Ljava/lang/String;
        //   629: goto            633
        //   632: athrow         
        //   633: goto            637
        //   636: athrow         
        //   637: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   640: goto            644
        //   643: athrow         
        //   644: getstatic       dev/nuker/pyro/fc.0:I
        //   647: ifeq            656
        //   650: ldc_w           1580077099
        //   653: goto            659
        //   656: ldc_w           493707711
        //   659: ldc_w           1494604918
        //   662: ixor           
        //   663: lookupswitch {
        //          121359453: 656
        //          1148763593: 688
        //          default: 3010
        //        }
        //   688: goto            692
        //   691: athrow         
        //   692: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   695: goto            699
        //   698: athrow         
        //   699: getstatic       dev/nuker/pyro/fc.0:I
        //   702: ifeq            711
        //   705: ldc_w           -565608576
        //   708: goto            714
        //   711: ldc_w           323014440
        //   714: ldc_w           -626370651
        //   717: ixor           
        //   718: lookupswitch {
        //          -907372403: 744
        //          81995813: 711
        //          default: 2994
        //        }
        //   744: astore          11
        //   746: getstatic       dev/nuker/pyro/fc.1:I
        //   749: ifeq            758
        //   752: ldc_w           -117556832
        //   755: goto            761
        //   758: ldc_w           2120360457
        //   761: ldc_w           -1831487124
        //   764: ixor           
        //   765: lookupswitch {
        //          -851857091: 758
        //          1781235916: 3046
        //          default: 792
        //        }
        //   792: aload_0        
        //   793: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/alt/Alt;
        //   796: getstatic       dev/nuker/pyro/fc.0:I
        //   799: ifeq            808
        //   802: ldc_w           -1826153658
        //   805: goto            811
        //   808: ldc_w           235376569
        //   811: ldc_w           -2010139915
        //   814: ixor           
        //   815: lookupswitch {
        //          119109435: 808
        //          453552563: 3024
        //          default: 840
        //        }
        //   840: goto            844
        //   843: athrow         
        //   844: invokevirtual   dev/nuker/pyro/alt/Alt.isCracked:()Z
        //   847: goto            851
        //   850: athrow         
        //   851: ifeq            988
        //   854: aload_0        
        //   855: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/alt/Alt;
        //   858: goto            862
        //   861: athrow         
        //   862: invokevirtual   dev/nuker/pyro/alt/Alt.getGameProfile:()Lcom/mojang/authlib/GameProfile;
        //   865: goto            869
        //   868: athrow         
        //   869: goto            873
        //   872: athrow         
        //   873: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //   876: goto            880
        //   879: athrow         
        //   880: goto            884
        //   883: athrow         
        //   884: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   887: goto            891
        //   890: athrow         
        //   891: goto            895
        //   894: athrow         
        //   895: invokevirtual   net/minecraft/client/Minecraft.func_110432_I:()Lnet/minecraft/util/Session;
        //   898: goto            902
        //   901: athrow         
        //   902: goto            906
        //   905: athrow         
        //   906: invokevirtual   net/minecraft/util/Session.func_148256_e:()Lcom/mojang/authlib/GameProfile;
        //   909: goto            913
        //   912: athrow         
        //   913: getstatic       dev/nuker/pyro/fc.c:I
        //   916: ifge            925
        //   919: ldc_w           1244721394
        //   922: goto            928
        //   925: ldc_w           1769786946
        //   928: ldc_w           867922158
        //   931: ixor           
        //   932: lookupswitch {
        //          1523039916: 960
        //          2039185436: 925
        //          default: 3026
        //        }
        //   960: goto            964
        //   963: athrow         
        //   964: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //   967: goto            971
        //   970: athrow         
        //   971: goto            975
        //   974: athrow         
        //   975: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   978: goto            982
        //   981: athrow         
        //   982: ifeq            1461
        //   985: goto            1254
        //   988: getstatic       dev/nuker/pyro/fc.1:I
        //   991: ifeq            1000
        //   994: ldc_w           1417875485
        //   997: goto            1003
        //  1000: ldc_w           -1940939408
        //  1003: ldc_w           442971633
        //  1006: ixor           
        //  1007: lookupswitch {
        //          1162072065: 1000
        //          1323574764: 3016
        //          default: 1032
        //        }
        //  1032: aload_0        
        //  1033: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/alt/Alt;
        //  1036: getstatic       dev/nuker/pyro/fc.1:I
        //  1039: ifeq            1048
        //  1042: ldc_w           -260779706
        //  1045: goto            1051
        //  1048: ldc_w           -1134309809
        //  1051: ldc_w           -1115878173
        //  1054: ixor           
        //  1055: lookupswitch {
        //          -414663493: 1048
        //          1292492197: 2964
        //          default: 1080
        //        }
        //  1080: goto            1084
        //  1083: athrow         
        //  1084: invokevirtual   dev/nuker/pyro/alt/Alt.getGameProfile:()Lcom/mojang/authlib/GameProfile;
        //  1087: goto            1091
        //  1090: athrow         
        //  1091: goto            1095
        //  1094: athrow         
        //  1095: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //  1098: goto            1102
        //  1101: athrow         
        //  1102: goto            1106
        //  1105: athrow         
        //  1106: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //  1109: goto            1113
        //  1112: athrow         
        //  1113: getstatic       dev/nuker/pyro/fc.0:I
        //  1116: ifeq            1125
        //  1119: ldc_w           -1663076900
        //  1122: goto            1128
        //  1125: ldc_w           -2089391076
        //  1128: ldc_w           1909436062
        //  1131: ixor           
        //  1132: lookupswitch {
        //          -965297277: 1125
        //          -317662398: 2966
        //          default: 1160
        //        }
        //  1160: goto            1164
        //  1163: athrow         
        //  1164: invokevirtual   net/minecraft/client/Minecraft.func_110432_I:()Lnet/minecraft/util/Session;
        //  1167: goto            1171
        //  1170: athrow         
        //  1171: goto            1175
        //  1174: athrow         
        //  1175: invokevirtual   net/minecraft/util/Session.func_148256_e:()Lcom/mojang/authlib/GameProfile;
        //  1178: goto            1182
        //  1181: athrow         
        //  1182: goto            1186
        //  1185: athrow         
        //  1186: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //  1189: goto            1193
        //  1192: athrow         
        //  1193: getstatic       dev/nuker/pyro/fc.0:I
        //  1196: ifeq            1205
        //  1199: ldc_w           -1092841029
        //  1202: goto            1208
        //  1205: ldc_w           -1670986644
        //  1208: ldc_w           -1541855948
        //  1211: ixor           
        //  1212: lookupswitch {
        //          -44297735: 1205
        //          449164431: 2970
        //          default: 1240
        //        }
        //  1240: goto            1244
        //  1243: athrow         
        //  1244: invokevirtual   java/util/UUID.equals:(Ljava/lang/Object;)Z
        //  1247: goto            1251
        //  1250: athrow         
        //  1251: ifeq            1461
        //  1254: new             Ljava/lang/StringBuilder;
        //  1257: dup            
        //  1258: goto            1262
        //  1261: athrow         
        //  1262: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1265: goto            1269
        //  1268: athrow         
        //  1269: getstatic       dev/nuker/pyro/fc.1:I
        //  1272: ifeq            1281
        //  1275: ldc_w           1504395081
        //  1278: goto            1284
        //  1281: ldc_w           1086598821
        //  1284: ldc_w           740504038
        //  1287: ixor           
        //  1288: lookupswitch {
        //          1697458065: 1281
        //          1971850927: 2996
        //          default: 1316
        //        }
        //  1316: getstatic       net/minecraft/util/text/TextFormatting.BLUE:Lnet/minecraft/util/text/TextFormatting;
        //  1319: getstatic       dev/nuker/pyro/fc.c:I
        //  1322: ifge            1331
        //  1325: ldc_w           -1158841163
        //  1328: goto            1334
        //  1331: ldc_w           1808442883
        //  1334: ldc_w           -180354920
        //  1337: ixor           
        //  1338: lookupswitch {
        //          86783639: 1331
        //          1336769581: 3006
        //          default: 1364
        //        }
        //  1364: goto            1368
        //  1367: athrow         
        //  1368: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1371: goto            1375
        //  1374: athrow         
        //  1375: ldc_w           "\u10cd\u149d\ub9b5\u4414\ucb90\udee7"
        //  1378: goto            1382
        //  1381: athrow         
        //  1382: invokestatic    invokestatic   !!! ERROR
        //  1385: goto            1389
        //  1388: athrow         
        //  1389: getstatic       dev/nuker/pyro/fc.0:I
        //  1392: ifeq            1401
        //  1395: ldc_w           1663435573
        //  1398: goto            1404
        //  1401: ldc_w           -2002108908
        //  1404: ldc_w           1621602324
        //  1407: ixor           
        //  1408: lookupswitch {
        //          -401764864: 1436
        //          58831649: 1401
        //          default: 2992
        //        }
        //  1436: goto            1440
        //  1439: athrow         
        //  1440: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1443: goto            1447
        //  1446: athrow         
        //  1447: goto            1451
        //  1450: athrow         
        //  1451: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1454: goto            1458
        //  1457: athrow         
        //  1458: goto            1463
        //  1461: ldc             ""
        //  1463: astore          12
        //  1465: getstatic       dev/nuker/pyro/fc.1:I
        //  1468: ifeq            1477
        //  1471: ldc_w           1902423770
        //  1474: goto            1480
        //  1477: ldc_w           -35757555
        //  1480: ldc_w           628481685
        //  1483: ixor           
        //  1484: lookupswitch {
        //          -659833704: 1512
        //          1410429007: 1477
        //          default: 3034
        //        }
        //  1512: aload_0        
        //  1513: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/alt/Alt;
        //  1516: goto            1520
        //  1519: athrow         
        //  1520: invokevirtual   dev/nuker/pyro/alt/Alt.isCracked:()Z
        //  1523: goto            1527
        //  1526: athrow         
        //  1527: ifeq            1535
        //  1530: aload           12
        //  1532: goto            1600
        //  1535: new             Ljava/lang/StringBuilder;
        //  1538: dup            
        //  1539: goto            1543
        //  1542: athrow         
        //  1543: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1546: goto            1550
        //  1549: athrow         
        //  1550: getstatic       net/minecraft/util/text/TextFormatting.GREEN:Lnet/minecraft/util/text/TextFormatting;
        //  1553: goto            1557
        //  1556: athrow         
        //  1557: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1560: goto            1564
        //  1563: athrow         
        //  1564: ldc_w           "\u10d4\u1481\ub9f0\u442c\ucb8a\udef7\ub229"
        //  1567: goto            1571
        //  1570: athrow         
        //  1571: invokestatic    invokestatic   !!! ERROR
        //  1574: goto            1578
        //  1577: athrow         
        //  1578: goto            1582
        //  1581: athrow         
        //  1582: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1585: goto            1589
        //  1588: athrow         
        //  1589: goto            1593
        //  1592: athrow         
        //  1593: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1596: goto            1600
        //  1599: athrow         
        //  1600: astore          13
        //  1602: aload_0        
        //  1603: getstatic       dev/nuker/pyro/fc.1:I
        //  1606: ifeq            1615
        //  1609: ldc_w           -1899744793
        //  1612: goto            1618
        //  1615: ldc_w           1219187592
        //  1618: ldc_w           -1990346934
        //  1621: ixor           
        //  1622: lookupswitch {
        //          127501997: 2988
        //          1930035190: 1615
        //          default: 1648
        //        }
        //  1648: getfield        dev/nuker/pyro/fn.c:Lnet/minecraft/client/Minecraft;
        //  1651: getfield        net/minecraft/client/Minecraft.field_71466_p:Lnet/minecraft/client/gui/FontRenderer;
        //  1654: aload           10
        //  1656: getstatic       dev/nuker/pyro/fc.c:I
        //  1659: ifge            1668
        //  1662: ldc_w           -220774084
        //  1665: goto            1671
        //  1668: ldc_w           1232105183
        //  1671: ldc_w           620978353
        //  1674: ixor           
        //  1675: lookupswitch {
        //          -673963635: 3036
        //          652608720: 1668
        //          default: 1700
        //        }
        //  1700: iload_2        
        //  1701: bipush          32
        //  1703: iadd           
        //  1704: iconst_3       
        //  1705: iadd           
        //  1706: iload_3        
        //  1707: iconst_1       
        //  1708: iadd           
        //  1709: iconst_m1      
        //  1710: goto            1714
        //  1713: athrow         
        //  1714: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78276_b:(Ljava/lang/String;III)I
        //  1717: goto            1721
        //  1720: athrow         
        //  1721: pop            
        //  1722: aload_0        
        //  1723: getfield        dev/nuker/pyro/fn.c:Lnet/minecraft/client/Minecraft;
        //  1726: getstatic       dev/nuker/pyro/fc.0:I
        //  1729: ifeq            1738
        //  1732: ldc_w           -1031052853
        //  1735: goto            1741
        //  1738: ldc_w           -1997921507
        //  1741: ldc_w           1248737909
        //  1744: ixor           
        //  1745: lookupswitch {
        //          -1998234690: 1738
        //          -1031530136: 1772
        //          default: 2984
        //        }
        //  1772: getfield        net/minecraft/client/Minecraft.field_71466_p:Lnet/minecraft/client/gui/FontRenderer;
        //  1775: aload           11
        //  1777: getstatic       dev/nuker/pyro/fc.1:I
        //  1780: ifeq            1789
        //  1783: ldc_w           -480423353
        //  1786: goto            1792
        //  1789: ldc_w           1287052743
        //  1792: ldc_w           -1409746920
        //  1795: ixor           
        //  1796: lookupswitch {
        //          -414308897: 1824
        //          1218816607: 1789
        //          default: 2972
        //        }
        //  1824: iload_2        
        //  1825: bipush          32
        //  1827: iadd           
        //  1828: iconst_3       
        //  1829: iadd           
        //  1830: getstatic       dev/nuker/pyro/fc.0:I
        //  1833: ifeq            1842
        //  1836: ldc_w           -1596430742
        //  1839: goto            1845
        //  1842: ldc_w           -926885973
        //  1845: ldc_w           791853935
        //  1848: ixor           
        //  1849: lookupswitch {
        //          -1880433403: 2974
        //          -1003208242: 1842
        //          default: 1876
        //        }
        //  1876: iload_3        
        //  1877: aload_0        
        //  1878: getfield        dev/nuker/pyro/fn.c:Lnet/minecraft/client/Minecraft;
        //  1881: getstatic       dev/nuker/pyro/fc.1:I
        //  1884: ifeq            1893
        //  1887: ldc_w           -678505715
        //  1890: goto            1896
        //  1893: ldc_w           -430973735
        //  1896: ldc_w           1993325830
        //  1899: ixor           
        //  1900: lookupswitch {
        //          -1870634529: 1928
        //          -1589547509: 1893
        //          default: 3014
        //        }
        //  1928: getfield        net/minecraft/client/Minecraft.field_71466_p:Lnet/minecraft/client/gui/FontRenderer;
        //  1931: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //  1934: iadd           
        //  1935: iconst_3       
        //  1936: iadd           
        //  1937: iconst_m1      
        //  1938: goto            1942
        //  1941: athrow         
        //  1942: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78276_b:(Ljava/lang/String;III)I
        //  1945: goto            1949
        //  1948: athrow         
        //  1949: pop            
        //  1950: aload_0        
        //  1951: getstatic       dev/nuker/pyro/fc.0:I
        //  1954: ifeq            1963
        //  1957: ldc_w           1487088039
        //  1960: goto            1966
        //  1963: ldc_w           24158402
        //  1966: ldc_w           586627543
        //  1969: ixor           
        //  1970: lookupswitch {
        //          596089109: 1996
        //          2052329584: 1963
        //          default: 3020
        //        }
        //  1996: getfield        dev/nuker/pyro/fn.c:Lnet/minecraft/client/Minecraft;
        //  1999: getfield        net/minecraft/client/Minecraft.field_71466_p:Lnet/minecraft/client/gui/FontRenderer;
        //  2002: aload           13
        //  2004: getstatic       dev/nuker/pyro/fc.c:I
        //  2007: ifge            2016
        //  2010: ldc_w           802275304
        //  2013: goto            2019
        //  2016: ldc_w           -445924010
        //  2019: ldc_w           1773643880
        //  2022: ixor           
        //  2023: lookupswitch {
        //          -1931733698: 2048
        //          1181095808: 2016
        //          default: 2998
        //        }
        //  2048: iload_2        
        //  2049: bipush          32
        //  2051: iadd           
        //  2052: iconst_3       
        //  2053: iadd           
        //  2054: iload_3        
        //  2055: aload_0        
        //  2056: getfield        dev/nuker/pyro/fn.c:Lnet/minecraft/client/Minecraft;
        //  2059: getstatic       dev/nuker/pyro/fc.1:I
        //  2062: ifeq            2071
        //  2065: ldc_w           856936627
        //  2068: goto            2074
        //  2071: ldc_w           -1554635257
        //  2074: ldc_w           -1731328995
        //  2077: ixor           
        //  2078: lookupswitch {
        //          -1411525458: 2071
        //          999825946: 2104
        //          default: 2976
        //        }
        //  2104: getfield        net/minecraft/client/Minecraft.field_71466_p:Lnet/minecraft/client/gui/FontRenderer;
        //  2107: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //  2110: iadd           
        //  2111: aload_0        
        //  2112: getfield        dev/nuker/pyro/fn.c:Lnet/minecraft/client/Minecraft;
        //  2115: getfield        net/minecraft/client/Minecraft.field_71466_p:Lnet/minecraft/client/gui/FontRenderer;
        //  2118: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //  2121: iadd           
        //  2122: iconst_3       
        //  2123: iadd           
        //  2124: iconst_m1      
        //  2125: goto            2129
        //  2128: athrow         
        //  2129: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78276_b:(Ljava/lang/String;III)I
        //  2132: goto            2136
        //  2135: athrow         
        //  2136: pop            
        //  2137: aload_0        
        //  2138: getfield        dev/nuker/pyro/fn.c:Lnet/minecraft/client/Minecraft;
        //  2141: getfield        net/minecraft/client/Minecraft.field_71466_p:Lnet/minecraft/client/gui/FontRenderer;
        //  2144: aload_0        
        //  2145: getstatic       dev/nuker/pyro/fc.1:I
        //  2148: ifeq            2157
        //  2151: ldc_w           -377726537
        //  2154: goto            2160
        //  2157: ldc_w           -315674630
        //  2160: ldc_w           -355203799
        //  2163: ixor           
        //  2164: lookupswitch {
        //          -1536884617: 2157
        //          61365406: 2982
        //          default: 2192
        //        }
        //  2192: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/alt/Alt;
        //  2195: goto            2199
        //  2198: athrow         
        //  2199: invokevirtual   dev/nuker/pyro/alt/Alt.isCracked:()Z
        //  2202: goto            2206
        //  2205: athrow         
        //  2206: ifeq            2214
        //  2209: ldc             ""
        //  2211: goto            2216
        //  2214: aload           12
        //  2216: iload_2        
        //  2217: bipush          32
        //  2219: iadd           
        //  2220: iconst_3       
        //  2221: iadd           
        //  2222: iload_3        
        //  2223: aload_0        
        //  2224: getstatic       dev/nuker/pyro/fc.0:I
        //  2227: ifeq            2236
        //  2230: ldc_w           1656249600
        //  2233: goto            2239
        //  2236: ldc_w           2119933424
        //  2239: ldc_w           -2110307627
        //  2242: ixor           
        //  2243: lookupswitch {
        //          -527491115: 3030
        //          390998602: 2236
        //          default: 2268
        //        }
        //  2268: getfield        dev/nuker/pyro/fn.c:Lnet/minecraft/client/Minecraft;
        //  2271: getfield        net/minecraft/client/Minecraft.field_71466_p:Lnet/minecraft/client/gui/FontRenderer;
        //  2274: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //  2277: iconst_3       
        //  2278: imul           
        //  2279: iadd           
        //  2280: iconst_3       
        //  2281: iadd           
        //  2282: iconst_m1      
        //  2283: goto            2287
        //  2286: athrow         
        //  2287: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78276_b:(Ljava/lang/String;III)I
        //  2290: goto            2294
        //  2293: athrow         
        //  2294: pop            
        //  2295: fconst_1       
        //  2296: fconst_1       
        //  2297: fconst_1       
        //  2298: fconst_1       
        //  2299: goto            2303
        //  2302: athrow         
        //  2303: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179131_c:(FFFF)V
        //  2306: goto            2310
        //  2309: athrow         
        //  2310: getstatic       dev/nuker/pyro/fc.c:I
        //  2313: ifge            2322
        //  2316: ldc_w           -1170678016
        //  2319: goto            2325
        //  2322: ldc_w           -50901675
        //  2325: ldc_w           944349820
        //  2328: ixor           
        //  2329: lookupswitch {
        //          -2106491524: 2322
        //          -994119895: 2356
        //          default: 3000
        //        }
        //  2356: aload_0        
        //  2357: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/fl;
        //  2360: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fq;
        //  2363: iload_2        
        //  2364: bipush          16
        //  2366: iadd           
        //  2367: getstatic       dev/nuker/pyro/fc.1:I
        //  2370: ifeq            2379
        //  2373: ldc_w           -1192788450
        //  2376: goto            2382
        //  2379: ldc_w           2087138080
        //  2382: ldc_w           -1619111748
        //  2385: ixor           
        //  2386: lookupswitch {
        //          -1864789658: 2379
        //          664350370: 3012
        //          default: 2412
        //        }
        //  2412: iload_3        
        //  2413: iload           5
        //  2415: iadd           
        //  2416: iconst_2       
        //  2417: isub           
        //  2418: bipush          20
        //  2420: aload_0        
        //  2421: getstatic       dev/nuker/pyro/fc.1:I
        //  2424: ifeq            2433
        //  2427: ldc_w           1739449153
        //  2430: goto            2436
        //  2433: ldc_w           -1616566741
        //  2436: ldc_w           -154010752
        //  2439: ixor           
        //  2440: lookupswitch {
        //          -1854138175: 2433
        //          1769266603: 2468
        //          default: 3018
        //        }
        //  2468: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/fp;
        //  2471: getstatic       dev/nuker/pyro/fc.1:I
        //  2474: ifeq            2483
        //  2477: ldc_w           -1335458527
        //  2480: goto            2486
        //  2483: ldc_w           -181971067
        //  2486: ldc_w           -1138695284
        //  2489: ixor           
        //  2490: lookupswitch {
        //          205940397: 2483
        //          1225241609: 2516
        //          default: 3028
        //        }
        //  2516: getfield        dev/nuker/pyro/fp.c:Lnet/minecraft/client/entity/EntityOtherPlayerMP;
        //  2519: goto            2523
        //  2522: athrow         
        //  2523: invokevirtual   dev/nuker/pyro/fq.c:(IIILnet/minecraft/entity/player/EntityPlayer;)V
        //  2526: goto            2530
        //  2529: athrow         
        //  2530: getstatic       dev/nuker/pyro/fc.c:I
        //  2533: ifge            2542
        //  2536: ldc_w           -1007161161
        //  2539: goto            2545
        //  2542: ldc_w           1827297727
        //  2545: ldc_w           -27196712
        //  2548: ixor           
        //  2549: lookupswitch {
        //          1033302639: 2990
        //          1113399970: 2542
        //          default: 2576
        //        }
        //  2576: aload_0        
        //  2577: getstatic       dev/nuker/pyro/fc.0:I
        //  2580: ifeq            2589
        //  2583: ldc_w           -1782684994
        //  2586: goto            2592
        //  2589: ldc_w           312517461
        //  2592: ldc_w           -1419856219
        //  2595: ixor           
        //  2596: lookupswitch {
        //          967416811: 2589
        //          1054921755: 3032
        //          default: 2624
        //        }
        //  2624: getfield        dev/nuker/pyro/fn.c:Lnet/minecraft/client/Minecraft;
        //  2627: getstatic       dev/nuker/pyro/fc.0:I
        //  2630: ifeq            2639
        //  2633: ldc_w           -1597827995
        //  2636: goto            2642
        //  2639: ldc_w           -698136354
        //  2642: ldc_w           -1979439892
        //  2645: ixor           
        //  2646: lookupswitch {
        //          717697161: 3002
        //          814224656: 2639
        //          default: 2672
        //        }
        //  2672: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //  2675: getstatic       dev/nuker/pyro/fc.1:I
        //  2678: ifeq            2687
        //  2681: ldc_w           375202827
        //  2684: goto            2690
        //  2687: ldc_w           909320387
        //  2690: ldc_w           -1258010387
        //  2693: ixor           
        //  2694: lookupswitch {
        //          -1554420506: 2968
        //          312629677: 2687
        //          default: 2720
        //        }
        //  2720: getfield        net/minecraft/client/settings/GameSettings.field_85185_A:Z
        //  2723: ifne            2731
        //  2726: iload           8
        //  2728: ifeq            2963
        //  2731: goto            2735
        //  2734: athrow         
        //  2735: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //  2738: goto            2742
        //  2741: athrow         
        //  2742: fconst_0       
        //  2743: fconst_0       
        //  2744: ldc_w           100.0
        //  2747: getstatic       dev/nuker/pyro/fc.1:I
        //  2750: ifeq            2759
        //  2753: ldc_w           -1711252645
        //  2756: goto            2762
        //  2759: ldc_w           -180394563
        //  2762: ldc_w           -1624219955
        //  2765: ixor           
        //  2766: lookupswitch {
        //          -1296993780: 2759
        //          87033238: 3044
        //          default: 2792
        //        }
        //  2792: goto            2796
        //  2795: athrow         
        //  2796: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //  2799: goto            2803
        //  2802: athrow         
        //  2803: iload_2        
        //  2804: iload_3        
        //  2805: iload_2        
        //  2806: bipush          32
        //  2808: iadd           
        //  2809: iload_3        
        //  2810: bipush          42
        //  2812: iadd           
        //  2813: new             Ljava/awt/Color;
        //  2816: dup            
        //  2817: sipush          255
        //  2820: sipush          255
        //  2823: sipush          255
        //  2826: bipush          30
        //  2828: goto            2832
        //  2831: athrow         
        //  2832: invokespecial   java/awt/Color.<init>:(IIII)V
        //  2835: goto            2839
        //  2838: athrow         
        //  2839: getstatic       dev/nuker/pyro/fc.0:I
        //  2842: ifeq            2851
        //  2845: ldc_w           -1817723654
        //  2848: goto            2854
        //  2851: ldc_w           -1444760997
        //  2854: ldc_w           695769812
        //  2857: ixor           
        //  2858: lookupswitch {
        //          -2137380721: 2884
        //          -1159780818: 2851
        //          default: 2980
        //        }
        //  2884: goto            2888
        //  2887: athrow         
        //  2888: invokevirtual   java/awt/Color.getRGB:()I
        //  2891: goto            2895
        //  2894: athrow         
        //  2895: goto            2899
        //  2898: athrow         
        //  2899: invokestatic    net/minecraft/client/gui/Gui.func_73734_a:(IIIII)V
        //  2902: goto            2906
        //  2905: athrow         
        //  2906: getstatic       dev/nuker/pyro/fc.0:I
        //  2909: ifeq            2918
        //  2912: ldc_w           824343328
        //  2915: goto            2921
        //  2918: ldc_w           -1148164475
        //  2921: ldc_w           445994362
        //  2924: ixor           
        //  2925: lookupswitch {
        //          -1593494529: 2952
        //          733425242: 2918
        //          default: 2986
        //        }
        //  2952: goto            2956
        //  2955: athrow         
        //  2956: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //  2959: goto            2963
        //  2962: athrow         
        //  2963: return         
        //  2964: aconst_null    
        //  2965: athrow         
        //  2966: aconst_null    
        //  2967: athrow         
        //  2968: aconst_null    
        //  2969: athrow         
        //  2970: aconst_null    
        //  2971: athrow         
        //  2972: aconst_null    
        //  2973: athrow         
        //  2974: aconst_null    
        //  2975: athrow         
        //  2976: aconst_null    
        //  2977: athrow         
        //  2978: aconst_null    
        //  2979: athrow         
        //  2980: aconst_null    
        //  2981: athrow         
        //  2982: aconst_null    
        //  2983: athrow         
        //  2984: aconst_null    
        //  2985: athrow         
        //  2986: aconst_null    
        //  2987: athrow         
        //  2988: aconst_null    
        //  2989: athrow         
        //  2990: aconst_null    
        //  2991: athrow         
        //  2992: aconst_null    
        //  2993: athrow         
        //  2994: aconst_null    
        //  2995: athrow         
        //  2996: aconst_null    
        //  2997: athrow         
        //  2998: aconst_null    
        //  2999: athrow         
        //  3000: aconst_null    
        //  3001: athrow         
        //  3002: aconst_null    
        //  3003: athrow         
        //  3004: aconst_null    
        //  3005: athrow         
        //  3006: aconst_null    
        //  3007: athrow         
        //  3008: aconst_null    
        //  3009: athrow         
        //  3010: aconst_null    
        //  3011: athrow         
        //  3012: aconst_null    
        //  3013: athrow         
        //  3014: aconst_null    
        //  3015: athrow         
        //  3016: aconst_null    
        //  3017: athrow         
        //  3018: aconst_null    
        //  3019: athrow         
        //  3020: aconst_null    
        //  3021: athrow         
        //  3022: aconst_null    
        //  3023: athrow         
        //  3024: aconst_null    
        //  3025: athrow         
        //  3026: aconst_null    
        //  3027: athrow         
        //  3028: aconst_null    
        //  3029: athrow         
        //  3030: aconst_null    
        //  3031: athrow         
        //  3032: aconst_null    
        //  3033: athrow         
        //  3034: aconst_null    
        //  3035: athrow         
        //  3036: aconst_null    
        //  3037: athrow         
        //  3038: aconst_null    
        //  3039: athrow         
        //  3040: aconst_null    
        //  3041: athrow         
        //  3042: aconst_null    
        //  3043: athrow         
        //  3044: aconst_null    
        //  3045: athrow         
        //  3046: aconst_null    
        //  3047: athrow         
        //  3048: aconst_null    
        //  3049: athrow         
        //  3050: aconst_null    
        //  3051: athrow         
        //  3052: pop            
        //  3053: goto            24
        //  3056: pop            
        //  3057: aconst_null    
        //  3058: goto            3052
        //  3061: dup            
        //  3062: ifnull          3052
        //  3065: checkcast       Ljava/lang/Throwable;
        //  3068: athrow         
        //  3069: dup            
        //  3070: ifnull          3056
        //  3073: checkcast       Ljava/lang/Throwable;
        //  3076: athrow         
        //  3077: aconst_null    
        //  3078: athrow         
        //    StackMapTable: 01 96 43 07 00 34 04 FF 00 0B 00 00 00 01 07 00 34 FF 00 03 00 0A 07 00 03 01 01 01 01 01 01 01 01 02 00 00 42 07 00 34 00 45 07 00 34 40 07 00 D2 4A 07 00 D2 FF 00 01 00 0A 07 00 03 01 01 01 01 01 01 01 01 02 00 02 07 00 D2 01 5B 07 00 D2 17 41 01 1D 46 07 00 21 40 07 00 4A 45 07 00 34 40 07 00 B8 FC 00 0C 07 00 B8 41 01 1D 4C 07 00 03 FF 00 02 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 00 03 01 5F 07 00 03 45 07 00 1B 40 07 00 4A 45 07 00 34 40 01 02 05 42 01 19 FF 00 0F 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 08 01 24 08 01 24 FF 00 02 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 03 08 01 24 08 01 24 01 FF 00 1C 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 08 01 24 08 01 24 42 07 00 34 FF 00 00 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 08 01 24 08 01 24 45 07 00 34 40 07 01 07 FF 00 0E 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 07 01 0D FF 00 02 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 03 07 01 07 07 01 0D 01 FF 00 1E 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 07 01 0D 42 07 00 1F FF 00 00 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 07 01 0D 45 07 00 34 40 07 01 07 FF 00 05 00 00 00 01 07 00 34 FF 00 00 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 07 00 B8 45 07 00 34 FF 00 00 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 07 00 B8 FF 00 0B 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 07 00 B8 FF 00 02 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 03 07 01 07 07 00 B8 01 FF 00 1F 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 07 00 B8 42 07 00 34 FF 00 00 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 07 00 B8 45 07 00 34 40 07 01 07 4B 07 01 07 FF 00 02 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 01 5D 07 01 07 42 07 00 1B 40 07 01 07 45 07 00 34 40 07 00 B8 02 46 07 00 34 FF 00 00 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 08 02 1E 08 02 1E 45 07 00 34 40 07 01 07 4B 07 01 07 FF 00 02 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 01 5F 07 01 07 FF 00 05 00 00 00 01 07 00 34 FF 00 00 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 07 01 0D 45 07 00 34 40 07 01 07 46 07 00 34 FF 00 00 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 07 00 4A 45 07 00 34 FF 00 00 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 07 00 B8 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 07 00 B8 45 07 00 34 40 07 01 07 4B 07 01 07 FF 00 02 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 01 5C 07 01 07 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 01 07 01 07 45 07 00 34 40 07 00 B8 4B 07 00 B8 FF 00 02 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 00 B8 01 5D 07 00 B8 FC 00 0D 07 00 B8 42 01 1E 4F 07 00 4A FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 00 4A 01 5C 07 00 4A 42 07 00 34 40 07 00 4A 45 07 00 34 40 01 49 07 00 34 40 07 00 4A 45 07 00 34 40 07 01 3E 42 07 00 34 40 07 01 3E 45 07 00 34 40 07 00 B8 42 07 00 34 40 07 00 B8 45 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 00 B8 07 00 D2 42 07 00 1B FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 00 B8 07 00 D2 45 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 00 B8 07 01 47 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 00 B8 07 01 47 45 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 00 B8 07 01 3E FF 00 0B 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 00 B8 07 01 3E FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 03 07 00 B8 07 01 3E 01 FF 00 1F 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 00 B8 07 01 3E 42 07 00 1B FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 00 B8 07 01 3E 45 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 00 B8 07 00 B8 42 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 00 B8 07 00 B8 45 07 00 34 40 01 05 0B 42 01 1C 4F 07 00 4A FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 00 4A 01 5C 07 00 4A 42 07 00 34 40 07 00 4A 45 07 00 34 40 07 01 3E 42 07 00 34 40 07 01 3E 45 07 00 34 40 07 01 63 42 07 00 34 40 07 01 63 45 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 63 07 00 D2 FF 00 0B 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 63 07 00 D2 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 03 07 01 63 07 00 D2 01 FF 00 1F 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 63 07 00 D2 42 07 00 1B FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 63 07 00 D2 45 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 63 07 01 47 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 63 07 01 47 45 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 63 07 01 3E 42 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 63 07 01 3E 45 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 63 07 01 63 FF 00 0B 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 63 07 01 63 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 03 07 01 63 07 01 63 01 FF 00 1F 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 63 07 01 63 42 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 63 07 01 63 45 07 00 34 40 01 02 FF 00 06 00 00 00 01 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 08 04 E6 08 04 E6 45 07 00 34 40 07 01 07 4B 07 01 07 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 07 01 5F 07 01 07 FF 00 0E 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 07 07 01 0D FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 03 07 01 07 07 01 0D 01 FF 00 1D 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 07 07 01 0D FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 07 07 01 0D 45 07 00 34 40 07 01 07 45 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 07 07 00 B8 45 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 07 07 00 B8 FF 00 0B 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 07 07 00 B8 FF 00 02 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 03 07 01 07 07 00 B8 01 FF 00 1F 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 07 07 00 B8 42 07 00 15 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 07 07 00 B8 45 07 00 34 40 07 01 07 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 01 07 01 07 45 07 00 34 40 07 00 B8 02 41 07 00 B8 FC 00 0D 07 00 B8 42 01 1F 46 07 00 34 40 07 00 4A 45 07 00 34 40 01 07 46 07 00 34 FF 00 00 00 0D 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 00 02 08 05 FF 08 05 FF 45 07 00 34 40 07 01 07 45 07 00 19 FF 00 00 00 0D 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 07 07 01 0D 45 07 00 34 40 07 01 07 45 07 00 34 FF 00 00 00 0D 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 07 07 00 B8 45 07 00 34 FF 00 00 00 0D 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 07 07 00 B8 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 0D 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 07 07 00 B8 45 07 00 34 40 07 01 07 42 07 00 34 40 07 01 07 45 07 00 34 40 07 00 B8 FF 00 0E 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 01 07 00 03 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 00 03 01 5D 07 00 03 FF 00 13 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 86 07 00 B8 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 03 07 01 86 07 00 B8 01 FF 00 1C 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 86 07 00 B8 FF 00 0C 00 00 00 01 07 00 34 FF 00 00 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 01 86 07 00 B8 01 01 01 45 07 00 34 40 01 50 07 00 D2 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 00 D2 01 5E 07 00 D2 FF 00 10 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 86 07 00 B8 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 03 07 01 86 07 00 B8 01 FF 00 1F 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 86 07 00 B8 FF 00 11 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 03 07 01 86 07 00 B8 01 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 04 07 01 86 07 00 B8 01 01 FF 00 1E 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 03 07 01 86 07 00 B8 01 FF 00 10 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 01 86 07 00 B8 01 01 07 00 D2 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 06 07 01 86 07 00 B8 01 01 07 00 D2 01 FF 00 1F 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 01 86 07 00 B8 01 01 07 00 D2 4C 07 00 34 FF 00 00 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 01 86 07 00 B8 01 01 01 45 07 00 34 40 01 4D 07 00 03 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 00 03 01 5D 07 00 03 FF 00 13 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 86 07 00 B8 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 03 07 01 86 07 00 B8 01 FF 00 1C 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 86 07 00 B8 FF 00 16 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 01 86 07 00 B8 01 01 07 00 D2 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 06 07 01 86 07 00 B8 01 01 07 00 D2 01 FF 00 1D 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 01 86 07 00 B8 01 01 07 00 D2 57 07 00 34 FF 00 00 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 01 86 07 00 B8 01 01 01 45 07 00 34 40 01 FF 00 14 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 86 07 00 03 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 03 07 01 86 07 00 03 01 FF 00 1F 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 86 07 00 03 45 07 00 34 FF 00 00 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 86 07 00 4A 45 07 00 34 FF 00 00 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 86 01 47 07 01 86 FF 00 01 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 86 07 00 B8 FF 00 13 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 01 86 07 00 B8 01 01 07 00 03 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 06 07 01 86 07 00 B8 01 01 07 00 03 01 FF 00 1C 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 01 86 07 00 B8 01 01 07 00 03 51 07 00 34 FF 00 00 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 01 86 07 00 B8 01 01 01 45 07 00 34 40 01 47 07 00 F0 FF 00 00 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 04 02 02 02 02 45 07 00 34 00 0B 42 01 1E FF 00 16 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 00 E0 01 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 03 07 00 E0 01 01 FF 00 1D 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 00 E0 01 FF 00 14 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 00 E0 01 01 01 07 00 03 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 06 07 00 E0 01 01 01 07 00 03 01 FF 00 1F 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 00 E0 01 01 01 07 00 03 FF 00 0E 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 00 E0 01 01 01 07 00 EA FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 06 07 00 E0 01 01 01 07 00 EA 01 FF 00 1D 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 00 E0 01 01 01 07 00 EA 45 07 00 34 FF 00 00 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 00 E0 01 01 01 07 01 FA 45 07 00 34 00 0B 42 01 1E 4C 07 00 03 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 00 03 01 5F 07 00 03 4E 07 00 D2 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 00 D2 01 5D 07 00 D2 4E 07 01 D2 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 D2 01 5D 07 01 D2 0A 42 07 00 34 00 45 07 00 34 00 FF 00 10 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 03 02 02 02 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 04 02 02 02 01 FF 00 1D 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 03 02 02 02 42 07 00 34 FF 00 00 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 03 02 02 02 45 07 00 34 00 5B 07 00 25 FF 00 00 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 0A 01 01 01 01 08 0A FD 08 0A FD 01 01 01 01 45 07 00 34 FF 00 00 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 01 01 01 01 07 01 E2 FF 00 0B 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 01 01 01 01 07 01 E2 FF 00 02 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 06 01 01 01 01 07 01 E2 01 FF 00 1D 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 01 01 01 01 07 01 E2 42 07 00 34 FF 00 00 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 01 01 01 01 07 01 E2 45 07 00 34 FF 00 00 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 01 01 01 01 01 42 07 00 34 FF 00 00 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 01 01 01 01 01 45 07 00 34 00 0B 42 01 1E 42 07 00 2D 00 45 07 00 34 00 FF 00 00 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 01 07 00 4A FF 00 01 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 63 07 00 D2 FF 00 01 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 01 07 01 D2 FF 00 01 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 63 07 01 63 FF 00 01 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 86 07 00 B8 FF 00 01 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 03 07 01 86 07 00 B8 01 FF 00 01 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 01 86 07 00 B8 01 01 07 00 D2 FF 00 01 00 0A 07 00 03 01 01 01 01 01 01 01 01 02 00 00 FF 00 01 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 01 01 01 01 07 01 E2 FF 00 01 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 86 07 00 03 41 07 00 D2 01 41 07 00 03 01 FF 00 01 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 07 07 00 B8 FF 00 01 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 01 07 00 B8 FF 00 01 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 01 07 01 07 FF 00 01 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 86 07 00 B8 01 41 07 00 D2 FF 00 01 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 01 07 01 07 FF 00 01 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 01 07 07 01 0D FA 00 01 41 07 01 07 FF 00 01 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 00 E0 01 FF 00 01 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 01 86 07 00 B8 01 01 07 00 D2 F9 00 01 FF 00 01 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 00 E0 01 01 01 07 00 03 41 07 00 03 FF 00 01 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 07 00 B8 FF 00 01 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 01 07 00 4A FF 00 01 00 0C 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 00 02 07 00 B8 07 01 3E FF 00 01 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 00 E0 01 01 01 07 00 EA FF 00 01 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 05 07 01 86 07 00 B8 01 01 07 00 03 41 07 00 03 FA 00 01 FF 00 01 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 02 07 01 86 07 00 B8 FF 00 01 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 07 01 07 07 01 0D 41 07 00 03 FF 00 01 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 02 08 01 24 08 01 24 FF 00 01 00 0E 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 07 00 B8 07 00 B8 07 00 B8 00 03 02 02 02 F9 00 01 FF 00 01 00 0B 07 00 03 01 01 01 01 01 01 01 01 02 07 00 B8 00 01 07 01 07 FF 00 01 00 0A 07 00 03 01 01 01 01 01 01 01 01 02 00 01 07 00 D2 41 07 00 34 43 05 44 07 00 34 47 05 47 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     3061   3069   Any
        //  3061   3069   3061   3069   Ljava/lang/StringIndexOutOfBoundsException;
        //  3077   3079   3      8      Ljava/lang/AssertionError;
        //  27     34     34     35     Any
        //  27     34     34     35     Any
        //  27     34     3      8      Ljava/lang/NegativeArraySizeException;
        //  27     34     27     28     Any
        //  28     34     34     35     Any
        //  139    146    146    147    Any
        //  139    146    146    147    Ljava/lang/IllegalStateException;
        //  139    146    3      8      Any
        //  140    146    139    140    Ljava/lang/ArithmeticException;
        //  139    146    146    147    Ljava/lang/IllegalStateException;
        //  246    253    253    254    Any
        //  247    253    246    247    Ljava/lang/NullPointerException;
        //  247    253    253    254    Any
        //  247    253    246    247    Ljava/util/NoSuchElementException;
        //  246    253    3      8      Ljava/lang/RuntimeException;
        //  343    350    350    351    Any
        //  343    350    350    351    Ljava/lang/IllegalStateException;
        //  343    350    3      8      Any
        //  344    350    343    344    Any
        //  344    350    3      8      Ljava/lang/IllegalStateException;
        //  403    410    410    411    Any
        //  403    410    403    404    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  404    410    410    411    Ljava/lang/ClassCastException;
        //  403    410    410    411    Any
        //  404    410    3      8      Any
        //  418    424    424    425    Any
        //  418    424    3      8      Any
        //  418    424    424    425    Any
        //  418    424    424    425    Ljava/lang/ClassCastException;
        //  418    424    3      8      Any
        //  475    482    482    483    Any
        //  476    482    475    476    Any
        //  475    482    475    476    Any
        //  476    482    475    476    Ljava/lang/NegativeArraySizeException;
        //  475    482    475    476    Ljava/lang/IndexOutOfBoundsException;
        //  531    538    538    539    Any
        //  532    538    3      8      Any
        //  532    538    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  531    538    531    532    Ljava/lang/IllegalStateException;
        //  531    538    531    532    Ljava/lang/NumberFormatException;
        //  549    556    556    557    Any
        //  550    556    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  550    556    549    550    Any
        //  550    556    3      8      Ljava/lang/ArithmeticException;
        //  549    556    3      8      Any
        //  611    617    617    618    Any
        //  611    617    3      8      Any
        //  611    617    3      8      Ljava/lang/NumberFormatException;
        //  611    617    3      8      Any
        //  611    617    3      8      Ljava/lang/NegativeArraySizeException;
        //  625    632    632    633    Any
        //  625    632    3      8      Ljava/lang/ArithmeticException;
        //  626    632    632    633    Any
        //  625    632    625    626    Any
        //  626    632    632    633    Ljava/lang/ClassCastException;
        //  637    643    643    644    Any
        //  637    643    3      8      Any
        //  637    643    643    644    Any
        //  637    643    3      8      Any
        //  637    643    643    644    Ljava/lang/UnsupportedOperationException;
        //  692    698    698    699    Any
        //  692    698    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  692    698    698    699    Ljava/lang/IllegalStateException;
        //  692    698    698    699    Any
        //  692    698    3      8      Any
        //  843    850    850    851    Any
        //  843    850    850    851    Any
        //  844    850    3      8      Ljava/lang/IllegalStateException;
        //  843    850    3      8      Ljava/lang/IllegalStateException;
        //  843    850    843    844    Any
        //  861    868    868    869    Any
        //  862    868    861    862    Any
        //  861    868    868    869    Any
        //  861    868    868    869    Ljava/lang/IllegalStateException;
        //  861    868    3      8      Ljava/lang/NullPointerException;
        //  872    879    879    880    Any
        //  873    879    872    873    Any
        //  872    879    879    880    Ljava/util/ConcurrentModificationException;
        //  872    879    879    880    Any
        //  872    879    3      8      Ljava/lang/AssertionError;
        //  883    890    890    891    Any
        //  884    890    883    884    Any
        //  883    890    883    884    Any
        //  883    890    883    884    Ljava/util/NoSuchElementException;
        //  883    890    890    891    Any
        //  894    901    901    902    Any
        //  895    901    3      8      Any
        //  895    901    894    895    Ljava/lang/ArithmeticException;
        //  894    901    894    895    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  895    901    901    902    Any
        //  906    912    912    913    Any
        //  906    912    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  906    912    912    913    Any
        //  906    912    912    913    Any
        //  906    912    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  963    970    970    971    Any
        //  963    970    963    964    Ljava/lang/NumberFormatException;
        //  964    970    970    971    Any
        //  964    970    963    964    Ljava/lang/StringIndexOutOfBoundsException;
        //  964    970    963    964    Ljava/lang/UnsupportedOperationException;
        //  974    981    981    982    Any
        //  974    981    974    975    Ljava/util/NoSuchElementException;
        //  974    981    3      8      Any
        //  974    981    974    975    Any
        //  975    981    981    982    Any
        //  1083   1090   1090   1091   Any
        //  1083   1090   1090   1091   Any
        //  1084   1090   1090   1091   Any
        //  1084   1090   1083   1084   Any
        //  1083   1090   3      8      Any
        //  1094   1101   1101   1102   Any
        //  1095   1101   1094   1095   Ljava/lang/AssertionError;
        //  1094   1101   1101   1102   Any
        //  1095   1101   1094   1095   Ljava/lang/UnsupportedOperationException;
        //  1095   1101   1094   1095   Ljava/lang/NumberFormatException;
        //  1105   1112   1112   1113   Any
        //  1105   1112   3      8      Any
        //  1105   1112   1105   1106   Any
        //  1105   1112   1112   1113   Ljava/lang/AssertionError;
        //  1105   1112   1112   1113   Any
        //  1163   1170   1170   1171   Any
        //  1164   1170   1170   1171   Ljava/lang/NumberFormatException;
        //  1163   1170   1163   1164   Ljava/lang/IndexOutOfBoundsException;
        //  1163   1170   1163   1164   Ljava/lang/ClassCastException;
        //  1163   1170   1163   1164   Ljava/lang/ClassCastException;
        //  1175   1181   1181   1182   Any
        //  1175   1181   1181   1182   Any
        //  1175   1181   3      8      Any
        //  1175   1181   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1175   1181   3      8      Any
        //  1185   1192   1192   1193   Any
        //  1186   1192   1185   1186   Any
        //  1186   1192   1185   1186   Any
        //  1186   1192   1192   1193   Any
        //  1185   1192   1192   1193   Ljava/lang/IllegalArgumentException;
        //  1243   1250   1250   1251   Any
        //  1244   1250   1243   1244   Ljava/util/ConcurrentModificationException;
        //  1243   1250   1243   1244   Any
        //  1243   1250   1243   1244   Any
        //  1243   1250   3      8      Ljava/lang/NullPointerException;
        //  1262   1268   1268   1269   Any
        //  1262   1268   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1262   1268   3      8      Any
        //  1262   1268   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1262   1268   1268   1269   Ljava/lang/IllegalStateException;
        //  1368   1374   1374   1375   Any
        //  1368   1374   3      8      Any
        //  1368   1374   3      8      Any
        //  1368   1374   3      8      Any
        //  1368   1374   1374   1375   Any
        //  1381   1388   1388   1389   Any
        //  1382   1388   1381   1382   Any
        //  1381   1388   1388   1389   Any
        //  1382   1388   3      8      Any
        //  1382   1388   3      8      Any
        //  1439   1446   1446   1447   Any
        //  1440   1446   1439   1440   Ljava/lang/NumberFormatException;
        //  1440   1446   3      8      Ljava/lang/UnsupportedOperationException;
        //  1439   1446   3      8      Any
        //  1440   1446   1446   1447   Any
        //  1451   1457   1457   1458   Any
        //  1451   1457   3      8      Any
        //  1451   1457   1457   1458   Any
        //  1451   1457   1457   1458   Any
        //  1451   1457   1457   1458   Any
        //  1519   1526   1526   1527   Any
        //  1519   1526   1526   1527   Any
        //  1520   1526   1526   1527   Ljava/util/NoSuchElementException;
        //  1519   1526   1526   1527   Any
        //  1520   1526   1519   1520   Any
        //  1542   1549   1549   1550   Any
        //  1542   1549   1542   1543   Any
        //  1543   1549   1549   1550   Ljava/lang/ArithmeticException;
        //  1543   1549   3      8      Any
        //  1542   1549   1549   1550   Any
        //  1556   1563   1563   1564   Any
        //  1557   1563   1563   1564   Ljava/lang/NumberFormatException;
        //  1557   1563   3      8      Ljava/lang/IllegalStateException;
        //  1556   1563   1556   1557   Ljava/lang/ClassCastException;
        //  1556   1563   1563   1564   Any
        //  1570   1577   1577   1578   Any
        //  1570   1577   3      8      Any
        //  1571   1577   3      8      Ljava/lang/UnsupportedOperationException;
        //  1570   1577   1577   1578   Ljava/lang/EnumConstantNotPresentException;
        //  1571   1577   1570   1571   Any
        //  1582   1588   1588   1589   Any
        //  1582   1588   1588   1589   Any
        //  1582   1588   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1582   1588   3      8      Ljava/util/NoSuchElementException;
        //  1582   1588   1588   1589   Any
        //  1592   1599   1599   1600   Any
        //  1593   1599   1592   1593   Any
        //  1593   1599   1592   1593   Ljava/lang/StringIndexOutOfBoundsException;
        //  1592   1599   3      8      Ljava/lang/RuntimeException;
        //  1593   1599   3      8      Any
        //  1714   1720   1720   1721   Any
        //  1714   1720   1720   1721   Any
        //  1714   1720   1720   1721   Ljava/util/NoSuchElementException;
        //  1714   1720   3      8      Any
        //  1714   1720   1720   1721   Ljava/lang/IllegalStateException;
        //  1941   1948   1948   1949   Any
        //  1941   1948   1941   1942   Ljava/lang/ClassCastException;
        //  1941   1948   1948   1949   Ljava/lang/RuntimeException;
        //  1942   1948   3      8      Any
        //  1942   1948   1941   1942   Any
        //  2128   2135   2135   2136   Any
        //  2129   2135   2135   2136   Ljava/lang/NegativeArraySizeException;
        //  2128   2135   2135   2136   Any
        //  2128   2135   2135   2136   Any
        //  2129   2135   2128   2129   Any
        //  2198   2205   2205   2206   Any
        //  2198   2205   3      8      Any
        //  2199   2205   2198   2199   Ljava/lang/NegativeArraySizeException;
        //  2199   2205   2198   2199   Any
        //  2198   2205   2198   2199   Any
        //  2286   2293   2293   2294   Any
        //  2286   2293   2286   2287   Any
        //  2287   2293   3      8      Any
        //  2286   2293   2286   2287   Ljava/lang/NegativeArraySizeException;
        //  2287   2293   2286   2287   Ljava/lang/AssertionError;
        //  2302   2309   2309   2310   Any
        //  2302   2309   3      8      Ljava/lang/ClassCastException;
        //  2303   2309   2309   2310   Any
        //  2303   2309   2309   2310   Ljava/lang/IllegalArgumentException;
        //  2302   2309   2302   2303   Ljava/lang/EnumConstantNotPresentException;
        //  2522   2529   2529   2530   Any
        //  2522   2529   2529   2530   Ljava/lang/IllegalStateException;
        //  2523   2529   2529   2530   Ljava/lang/NullPointerException;
        //  2522   2529   3      8      Any
        //  2522   2529   2522   2523   Any
        //  2734   2741   2741   2742   Any
        //  2734   2741   3      8      Ljava/util/ConcurrentModificationException;
        //  2735   2741   3      8      Ljava/lang/ArithmeticException;
        //  2734   2741   3      8      Ljava/lang/IllegalStateException;
        //  2734   2741   2734   2735   Any
        //  2795   2802   2802   2803   Any
        //  2795   2802   2802   2803   Ljava/lang/RuntimeException;
        //  2796   2802   3      8      Any
        //  2796   2802   2802   2803   Ljava/lang/RuntimeException;
        //  2796   2802   2795   2796   Any
        //  2831   2838   2838   2839   Any
        //  2832   2838   2838   2839   Ljava/lang/IllegalStateException;
        //  2832   2838   2838   2839   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2831   2838   2831   2832   Ljava/lang/StringIndexOutOfBoundsException;
        //  2831   2838   2838   2839   Ljava/lang/AssertionError;
        //  2887   2894   2894   2895   Any
        //  2888   2894   3      8      Any
        //  2887   2894   2887   2888   Any
        //  2887   2894   3      8      Any
        //  2887   2894   2887   2888   Any
        //  2898   2905   2905   2906   Any
        //  2898   2905   3      8      Any
        //  2898   2905   2905   2906   Any
        //  2898   2905   2898   2899   Any
        //  2899   2905   2898   2899   Any
        //  2955   2962   2962   2963   Any
        //  2956   2962   3      8      Ljava/lang/IllegalArgumentException;
        //  2956   2962   2962   2963   Ljava/util/NoSuchElementException;
        //  2955   2962   2955   2956   Ljava/lang/AssertionError;
        //  2955   2962   3      8      Any
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
    
    public void c() {
        fbS.dh(this, 1336034242);
    }
    
    public boolean func_148278_a(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          664
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            656
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            648
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            36
        //    30: ldc_w           -1410985746
        //    33: goto            39
        //    36: ldc_w           -246337438
        //    39: ldc_w           1965975230
        //    42: ixor           
        //    43: lookupswitch {
        //          -2072029476: 68
        //          -557287856: 36
        //          default: 625
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/fm;
        //    72: getstatic       dev/nuker/pyro/fc.c:I
        //    75: ifge            84
        //    78: ldc_w           -830064419
        //    81: goto            87
        //    84: ldc_w           -1742867639
        //    87: ldc_w           -582987202
        //    90: ixor           
        //    91: lookupswitch {
        //          331770595: 84
        //          1163764087: 116
        //          default: 635
        //        }
        //   116: iload_1        
        //   117: goto            121
        //   120: athrow         
        //   121: invokevirtual   dev/nuker/pyro/fm.0:(I)V
        //   124: goto            128
        //   127: athrow         
        //   128: getstatic       dev/nuker/pyro/fc.c:I
        //   131: ifge            140
        //   134: ldc_w           -795348505
        //   137: goto            143
        //   140: ldc_w           1957318025
        //   143: ldc_w           676716640
        //   146: ixor           
        //   147: lookupswitch {
        //          -121499257: 631
        //          279225759: 140
        //          default: 172
        //        }
        //   172: aload_0        
        //   173: getstatic       dev/nuker/pyro/fc.c:I
        //   176: ifge            185
        //   179: ldc_w           -274912159
        //   182: goto            188
        //   185: ldc_w           1764945701
        //   188: ldc_w           -1825183286
        //   191: ixor           
        //   192: lookupswitch {
        //          -100202769: 220
        //          2091435435: 185
        //          default: 619
        //        }
        //   220: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/fl;
        //   223: aload_0        
        //   224: goto            228
        //   227: athrow         
        //   228: invokevirtual   dev/nuker/pyro/fl.1:(Ldev/nuker/pyro/fn;)V
        //   231: goto            235
        //   234: athrow         
        //   235: getstatic       dev/nuker/pyro/fc.1:I
        //   238: ifeq            247
        //   241: ldc_w           -1926616502
        //   244: goto            250
        //   247: ldc_w           -702543399
        //   250: ldc_w           -1336990411
        //   253: ixor           
        //   254: lookupswitch {
        //          704587647: 247
        //          1030033279: 633
        //          default: 280
        //        }
        //   280: iload           5
        //   282: bipush          32
        //   284: if_icmpgt       393
        //   287: getstatic       dev/nuker/pyro/fc.c:I
        //   290: ifge            299
        //   293: ldc_w           1846478523
        //   296: goto            302
        //   299: ldc_w           -68545673
        //   302: ldc_w           903829141
        //   305: ixor           
        //   306: lookupswitch {
        //          1540378670: 621
        //          1782324378: 299
        //          default: 332
        //        }
        //   332: aload_0        
        //   333: getstatic       dev/nuker/pyro/fc.0:I
        //   336: ifeq            345
        //   339: ldc_w           -440101876
        //   342: goto            348
        //   345: ldc_w           -891283591
        //   348: ldc_w           -1578458275
        //   351: ixor           
        //   352: lookupswitch {
        //          -754208424: 345
        //          1143879505: 627
        //          default: 380
        //        }
        //   380: goto            384
        //   383: athrow         
        //   384: invokevirtual   dev/nuker/pyro/fn.0:()V
        //   387: goto            391
        //   390: athrow         
        //   391: iconst_1       
        //   392: ireturn        
        //   393: getstatic       dev/nuker/pyro/fc.1:I
        //   396: ifeq            405
        //   399: ldc_w           1293607687
        //   402: goto            408
        //   405: ldc_w           -1521548556
        //   408: ldc_w           -1249551458
        //   411: ixor           
        //   412: lookupswitch {
        //          -123750247: 629
        //          689202414: 405
        //          default: 440
        //        }
        //   440: goto            444
        //   443: athrow         
        //   444: invokestatic    net/minecraft/client/Minecraft.func_71386_F:()J
        //   447: goto            451
        //   450: athrow         
        //   451: getstatic       dev/nuker/pyro/fc.1:I
        //   454: ifeq            463
        //   457: ldc_w           -1517648923
        //   460: goto            466
        //   463: ldc_w           1578376561
        //   466: ldc_w           730279618
        //   469: ixor           
        //   470: lookupswitch {
        //          -1911706329: 623
        //          -175305482: 463
        //          default: 496
        //        }
        //   496: aload_0        
        //   497: getfield        dev/nuker/pyro/fn.c:J
        //   500: lsub           
        //   501: ldc2_w          250
        //   504: lcmp           
        //   505: ifge            514
        //   508: ldc_w           313469372
        //   511: goto            517
        //   514: ldc_w           313469375
        //   517: ldc_w           587651341
        //   520: ixor           
        //   521: tableswitch {
        //          1666441570: 544
        //          1666441571: 602
        //          default: 508
        //        }
        //   544: getstatic       dev/nuker/pyro/fc.c:I
        //   547: ifge            556
        //   550: ldc_w           -1413192827
        //   553: goto            559
        //   556: ldc_w           -1887758706
        //   559: ldc_w           -1942391262
        //   562: ixor           
        //   563: lookupswitch {
        //          54681772: 588
        //          670897575: 556
        //          default: 637
        //        }
        //   588: aload_0        
        //   589: goto            593
        //   592: athrow         
        //   593: invokevirtual   dev/nuker/pyro/fn.0:()V
        //   596: goto            600
        //   599: athrow         
        //   600: iconst_1       
        //   601: ireturn        
        //   602: aload_0        
        //   603: goto            607
        //   606: athrow         
        //   607: invokestatic    net/minecraft/client/Minecraft.func_71386_F:()J
        //   610: goto            614
        //   613: athrow         
        //   614: putfield        dev/nuker/pyro/fn.c:J
        //   617: iconst_0       
        //   618: ireturn        
        //   619: aconst_null    
        //   620: athrow         
        //   621: aconst_null    
        //   622: athrow         
        //   623: aconst_null    
        //   624: athrow         
        //   625: aconst_null    
        //   626: athrow         
        //   627: aconst_null    
        //   628: athrow         
        //   629: aconst_null    
        //   630: athrow         
        //   631: aconst_null    
        //   632: athrow         
        //   633: aconst_null    
        //   634: athrow         
        //   635: aconst_null    
        //   636: athrow         
        //   637: aconst_null    
        //   638: athrow         
        //   639: pop            
        //   640: goto            24
        //   643: pop            
        //   644: aconst_null    
        //   645: goto            639
        //   648: dup            
        //   649: ifnull          639
        //   652: checkcast       Ljava/lang/Throwable;
        //   655: athrow         
        //   656: dup            
        //   657: ifnull          643
        //   660: checkcast       Ljava/lang/Throwable;
        //   663: athrow         
        //   664: aconst_null    
        //   665: athrow         
        //    StackMapTable: 00 4F 43 07 00 34 04 FF 00 0B 00 00 00 01 07 00 34 FF 00 03 00 07 07 00 03 01 01 01 01 01 01 00 00 0B 42 01 1C 4F 07 00 CA FF 00 02 00 07 07 00 03 01 01 01 01 01 01 00 02 07 00 CA 01 5C 07 00 CA 43 07 00 2D FF 00 00 00 07 07 00 03 01 01 01 01 01 01 00 02 07 00 CA 01 45 07 00 34 00 0B 42 01 1C 4C 07 00 03 FF 00 02 00 07 07 00 03 01 01 01 01 01 01 00 02 07 00 03 01 5F 07 00 03 FF 00 06 00 00 00 01 07 00 34 FF 00 00 00 07 07 00 03 01 01 01 01 01 01 00 02 07 00 75 07 00 03 45 07 00 34 00 0B 42 01 1D 12 42 01 1D 4C 07 00 03 FF 00 02 00 07 07 00 03 01 01 01 01 01 01 00 02 07 00 03 01 5F 07 00 03 FF 00 02 00 00 00 01 07 00 34 FF 00 00 00 07 07 00 03 01 01 01 01 01 01 00 01 07 00 03 45 07 00 34 00 01 0B 42 01 1F 42 07 00 1D 00 45 07 00 34 40 04 4B 04 FF 00 02 00 07 07 00 03 01 01 01 01 01 01 00 02 04 01 5D 04 0B 05 42 01 1A 0B 42 01 1C 43 07 00 34 40 07 00 03 45 07 00 34 00 01 43 07 00 34 40 07 00 03 45 07 00 34 FF 00 00 00 07 07 00 03 01 01 01 01 01 01 00 02 07 00 03 04 44 07 00 03 01 41 04 01 41 07 00 03 01 01 01 41 07 00 CA 01 41 07 00 34 43 05 44 07 00 34 47 05 47 07 00 34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     648    656    Ljava/lang/NegativeArraySizeException;
        //  648    656    648    656    Any
        //  664    666    3      8      Ljava/lang/IllegalArgumentException;
        //  120    127    127    128    Any
        //  121    127    127    128    Ljava/lang/RuntimeException;
        //  120    127    127    128    Ljava/lang/EnumConstantNotPresentException;
        //  120    127    3      8      Any
        //  121    127    120    121    Ljava/lang/AssertionError;
        //  228    234    234    235    Any
        //  228    234    3      8      Ljava/lang/AssertionError;
        //  228    234    3      8      Any
        //  228    234    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  228    234    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  384    390    390    391    Any
        //  384    390    390    391    Ljava/util/ConcurrentModificationException;
        //  384    390    390    391    Ljava/lang/NegativeArraySizeException;
        //  384    390    3      8      Ljava/lang/UnsupportedOperationException;
        //  384    390    390    391    Ljava/lang/StringIndexOutOfBoundsException;
        //  443    450    450    451    Any
        //  443    450    3      8      Any
        //  443    450    3      8      Ljava/lang/IllegalStateException;
        //  444    450    443    444    Ljava/lang/NullPointerException;
        //  444    450    450    451    Ljava/lang/AssertionError;
        //  592    599    599    600    Any
        //  592    599    599    600    Any
        //  592    599    599    600    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  592    599    599    600    Any
        //  592    599    592    593    Any
        //  606    613    613    614    Any
        //  607    613    613    614    Ljava/lang/ArithmeticException;
        //  606    613    613    614    Ljava/lang/RuntimeException;
        //  607    613    606    607    Any
        //  607    613    606    607    Ljava/lang/StringIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 181 out of bounds for length 181
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
    
    public void func_148277_b(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        fbS.1P(this, 835919863, n, n2, n3, n4, n5, n6);
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc_w           "\u10f0\u1496\ub9ed\ubf16\uec71\udef0\ub221\ud5cb\ud5fc\ucc10\u9437\u1e45\ud2b3\uc96b\ua49f\uba6b\u57a8\u4419\ub1d9\ue5b8\u1813\uc237\u5910\u218e\uf261\u0688\u7d24\ubab8\u8c84\ua920\ub7aa\ufb35"
        //     7: invokestatic    invokestatic   !!! ERROR
        //    10: invokespecial   net/minecraft/util/ResourceLocation.<init>:(Ljava/lang/String;)V
        //    13: getstatic       dev/nuker/pyro/fc.0:I
        //    16: ifeq            25
        //    19: ldc_w           -244439732
        //    22: goto            28
        //    25: ldc_w           191156182
        //    28: ldc_w           479643425
        //    31: ixor           
        //    32: lookupswitch {
        //          -302456211: 25
        //          401737975: 60
        //          default: 64
        //        }
        //    60: putstatic       dev/nuker/pyro/fn.c:Lnet/minecraft/util/ResourceLocation;
        //    63: return         
        //    64: aconst_null    
        //    65: athrow         
        //    StackMapTable: 00 04 59 07 02 3E FF 00 02 00 00 00 02 07 02 3E 01 5F 07 02 3E 43 07 02 3E
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2695)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
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
    
    public void func_192633_a(final int p0, final int p1, final int p2, final float p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
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
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 34 FF 00 03 00 05 07 00 03 01 01 01 02 00 00 40 07 00 34 43 05 44 07 00 34 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     26     34     Any
        //  26     34     26     34     Any
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
}
