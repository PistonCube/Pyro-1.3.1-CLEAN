// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import net.minecraft.client.entity.EntityPlayerSP;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class f7Y extends fH
{
    @NotNull
    public f0f<f7V> c;
    @NotNull
    public f0f<f7T> 0;
    @NotNull
    public f0f<f7W> 1;
    @NotNull
    public f0d c;
    @NotNull
    public f0q<f7U> c;
    @NotNull
    public f0a c;
    @NotNull
    public f0a 0;
    @Nullable
    public f8W c;
    
    @f06
    @LauncherEventHide
    public void c(@Nullable final f3i f3i) {
        fbS.fs(this, 350723876, f3i);
    }
    
    static {
        throw t;
    }
    
    @NotNull
    public f0d 8() {
        return fbS.fV(this, 1618156086);
    }
    
    @NotNull
    public f0f 6() {
        return fbS.ha(this, 873389088);
    }
    
    @Nullable
    public f8W c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.0:I
        //     4: ifgt            84
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            76
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: getstatic       dev/nuker/pyro/fc.c:I
        //    19: ifge            27
        //    22: ldc             -2133039881
        //    24: goto            29
        //    27: ldc             1312181331
        //    29: ldc             287828718
        //    31: ixor           
        //    32: lookupswitch {
        //          -1845785063: 65
        //          1924528008: 27
        //          default: 60
        //        }
        //    60: aload_0        
        //    61: getfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/f8W;
        //    64: areturn        
        //    65: aconst_null    
        //    66: athrow         
        //    67: pop            
        //    68: goto            16
        //    71: pop            
        //    72: aconst_null    
        //    73: goto            67
        //    76: dup            
        //    77: ifnull          67
        //    80: checkcast       Ljava/lang/Throwable;
        //    83: athrow         
        //    84: dup            
        //    85: ifnull          71
        //    88: checkcast       Ljava/lang/Throwable;
        //    91: athrow         
        //    StackMapTable: 00 0A FF 00 0C 00 00 00 01 07 00 35 FC 00 03 07 00 03 0A 41 01 1E 04 41 07 00 35 43 05 44 07 00 35 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     76     84     Any
        //  76     84     76     84     Any
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
    
    @NotNull
    public f0a 3() {
        return fbS.0k(this, 2022225310);
    }
    
    @NotNull
    public f0q 0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.0:I
        //     4: ifgt            38
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            30
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/f0q;
        //    20: areturn        
        //    21: pop            
        //    22: goto            16
        //    25: pop            
        //    26: aconst_null    
        //    27: goto            21
        //    30: dup            
        //    31: ifnull          21
        //    34: checkcast       Ljava/lang/Throwable;
        //    37: athrow         
        //    38: dup            
        //    39: ifnull          25
        //    42: checkcast       Ljava/lang/Throwable;
        //    45: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 35 FC 00 03 07 00 03 44 07 00 35 43 05 44 07 00 35 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     30     38     Any
        //  30     38     30     38     Any
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
    
    @NotNull
    public f0a 1() {
        return fbS.0K(this, 1663969847);
    }
    
    @NotNull
    public f0f 2() {
        return fbS.hb(this, 749955652);
    }
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f34 f34) {
        fbS.1(this, 1078337854, f34);
    }
    
    @f06
    @LauncherEventHide
    public void c(@Nullable final f3h f3h) {
        fbS.hD(this, 1543018620, f3h);
    }
    
    @NotNull
    public f0f 4() {
        return fbS.he(this, 1542885758);
    }
    
    public void 7() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1157
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1149
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1141
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/f0q;
        //    28: goto            32
        //    31: athrow         
        //    32: invokevirtual   dev/nuker/pyro/f0q.0:()Ldev/nuker/pyro/f0f;
        //    35: goto            39
        //    38: athrow         
        //    39: goto            43
        //    42: athrow         
        //    43: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //    46: goto            50
        //    49: athrow         
        //    50: checkcast       Ldev/nuker/pyro/f7U;
        //    53: getstatic       dev/nuker/pyro/f7X.2:[I
        //    56: swap           
        //    57: goto            61
        //    60: athrow         
        //    61: invokevirtual   dev/nuker/pyro/f7U.ordinal:()I
        //    64: goto            68
        //    67: athrow         
        //    68: iaload         
        //    69: tableswitch {
        //                2: 96
        //                3: 680
        //                4: 906
        //          default: 1111
        //        }
        //    96: aload_0        
        //    97: aload_0        
        //    98: getfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/f0f;
        //   101: getstatic       dev/nuker/pyro/fc.1:I
        //   104: ifeq            112
        //   107: ldc             1036798695
        //   109: goto            114
        //   112: ldc             335139123
        //   114: ldc             -1143779957
        //   116: ixor           
        //   117: lookupswitch {
        //          -2044786836: 1126
        //          -984109498: 112
        //          default: 144
        //        }
        //   144: goto            148
        //   147: athrow         
        //   148: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   151: goto            155
        //   154: athrow         
        //   155: checkcast       Ldev/nuker/pyro/f7V;
        //   158: getstatic       dev/nuker/pyro/f7X.c:[I
        //   161: swap           
        //   162: goto            166
        //   165: athrow         
        //   166: invokevirtual   dev/nuker/pyro/f7V.ordinal:()I
        //   169: goto            173
        //   172: athrow         
        //   173: iaload         
        //   174: tableswitch {
        //                2: 236
        //                3: 257
        //                4: 278
        //                5: 341
        //                6: 405
        //                7: 426
        //                8: 447
        //                9: 468
        //               10: 489
        //               11: 553
        //               12: 574
        //               13: 637
        //          default: 658
        //        }
        //   236: new             Ldev/nuker/pyro/f96;
        //   239: dup            
        //   240: goto            244
        //   243: athrow         
        //   244: invokespecial   dev/nuker/pyro/f96.<init>:()V
        //   247: goto            251
        //   250: athrow         
        //   251: checkcast       Ldev/nuker/pyro/f8W;
        //   254: goto            674
        //   257: new             Ldev/nuker/pyro/f8Z;
        //   260: dup            
        //   261: goto            265
        //   264: athrow         
        //   265: invokespecial   dev/nuker/pyro/f8Z.<init>:()V
        //   268: goto            272
        //   271: athrow         
        //   272: checkcast       Ldev/nuker/pyro/f8W;
        //   275: goto            674
        //   278: new             Ldev/nuker/pyro/f95;
        //   281: dup            
        //   282: getstatic       dev/nuker/pyro/fc.0:I
        //   285: ifeq            293
        //   288: ldc             -779499310
        //   290: goto            295
        //   293: ldc             1808075765
        //   295: ldc             1711890247
        //   297: ixor           
        //   298: lookupswitch {
        //          -1216309355: 1120
        //          1535224829: 293
        //          default: 324
        //        }
        //   324: goto            328
        //   327: athrow         
        //   328: invokespecial   dev/nuker/pyro/f95.<init>:()V
        //   331: goto            335
        //   334: athrow         
        //   335: checkcast       Ldev/nuker/pyro/f8W;
        //   338: goto            674
        //   341: new             Ldev/nuker/pyro/f9c;
        //   344: dup            
        //   345: getstatic       dev/nuker/pyro/fc.1:I
        //   348: ifeq            356
        //   351: ldc             -1227904182
        //   353: goto            358
        //   356: ldc             811419742
        //   358: ldc             1196621798
        //   360: ixor           
        //   361: lookupswitch {
        //          -241347412: 1122
        //          -135302621: 356
        //          default: 388
        //        }
        //   388: goto            392
        //   391: athrow         
        //   392: invokespecial   dev/nuker/pyro/f9c.<init>:()V
        //   395: goto            399
        //   398: athrow         
        //   399: checkcast       Ldev/nuker/pyro/f8W;
        //   402: goto            674
        //   405: new             Ldev/nuker/pyro/f98;
        //   408: dup            
        //   409: goto            413
        //   412: athrow         
        //   413: invokespecial   dev/nuker/pyro/f98.<init>:()V
        //   416: goto            420
        //   419: athrow         
        //   420: checkcast       Ldev/nuker/pyro/f8W;
        //   423: goto            674
        //   426: new             Ldev/nuker/pyro/f93;
        //   429: dup            
        //   430: goto            434
        //   433: athrow         
        //   434: invokespecial   dev/nuker/pyro/f93.<init>:()V
        //   437: goto            441
        //   440: athrow         
        //   441: checkcast       Ldev/nuker/pyro/f8W;
        //   444: goto            674
        //   447: new             Ldev/nuker/pyro/f94;
        //   450: dup            
        //   451: goto            455
        //   454: athrow         
        //   455: invokespecial   dev/nuker/pyro/f94.<init>:()V
        //   458: goto            462
        //   461: athrow         
        //   462: checkcast       Ldev/nuker/pyro/f8W;
        //   465: goto            674
        //   468: new             Ldev/nuker/pyro/f8Y;
        //   471: dup            
        //   472: goto            476
        //   475: athrow         
        //   476: invokespecial   dev/nuker/pyro/f8Y.<init>:()V
        //   479: goto            483
        //   482: athrow         
        //   483: checkcast       Ldev/nuker/pyro/f8W;
        //   486: goto            674
        //   489: new             Ldev/nuker/pyro/f97;
        //   492: dup            
        //   493: getstatic       dev/nuker/pyro/fc.c:I
        //   496: ifge            504
        //   499: ldc             -129863186
        //   501: goto            506
        //   504: ldc             857516841
        //   506: ldc             448013556
        //   508: ixor           
        //   509: lookupswitch {
        //          -487172838: 1114
        //          -271810869: 504
        //          default: 536
        //        }
        //   536: goto            540
        //   539: athrow         
        //   540: invokespecial   dev/nuker/pyro/f97.<init>:()V
        //   543: goto            547
        //   546: athrow         
        //   547: checkcast       Ldev/nuker/pyro/f8W;
        //   550: goto            674
        //   553: new             Ldev/nuker/pyro/f91;
        //   556: dup            
        //   557: goto            561
        //   560: athrow         
        //   561: invokespecial   dev/nuker/pyro/f91.<init>:()V
        //   564: goto            568
        //   567: athrow         
        //   568: checkcast       Ldev/nuker/pyro/f8W;
        //   571: goto            674
        //   574: new             Ldev/nuker/pyro/f90;
        //   577: dup            
        //   578: getstatic       dev/nuker/pyro/fc.1:I
        //   581: ifeq            589
        //   584: ldc             -117983911
        //   586: goto            591
        //   589: ldc             999240019
        //   591: ldc             875791711
        //   593: ixor           
        //   594: lookupswitch {
        //          -1736531090: 589
        //          -859557882: 1112
        //          default: 620
        //        }
        //   620: goto            624
        //   623: athrow         
        //   624: invokespecial   dev/nuker/pyro/f90.<init>:()V
        //   627: goto            631
        //   630: athrow         
        //   631: checkcast       Ldev/nuker/pyro/f8W;
        //   634: goto            674
        //   637: new             Ldev/nuker/pyro/f92;
        //   640: dup            
        //   641: goto            645
        //   644: athrow         
        //   645: invokespecial   dev/nuker/pyro/f92.<init>:()V
        //   648: goto            652
        //   651: athrow         
        //   652: checkcast       Ldev/nuker/pyro/f8W;
        //   655: goto            674
        //   658: new             Lkotlin/NoWhenBranchMatchedException;
        //   661: dup            
        //   662: goto            666
        //   665: athrow         
        //   666: invokespecial   kotlin/NoWhenBranchMatchedException.<init>:()V
        //   669: goto            673
        //   672: athrow         
        //   673: athrow         
        //   674: putfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/f8W;
        //   677: goto            1111
        //   680: aload_0        
        //   681: getstatic       dev/nuker/pyro/fc.0:I
        //   684: ifeq            692
        //   687: ldc             -891495246
        //   689: goto            694
        //   692: ldc             -60553294
        //   694: ldc             1623652064
        //   696: ixor           
        //   697: lookupswitch {
        //          -1441125806: 1128
        //          -732152285: 692
        //          default: 724
        //        }
        //   724: aload_0        
        //   725: getstatic       dev/nuker/pyro/fc.c:I
        //   728: ifge            736
        //   731: ldc             -729414172
        //   733: goto            738
        //   736: ldc             1079826163
        //   738: ldc             -89464535
        //   740: ixor           
        //   741: lookupswitch {
        //          -1158268966: 768
        //          774694093: 736
        //          default: 1130
        //        }
        //   768: getfield        dev/nuker/pyro/f7Y.0:Ldev/nuker/pyro/f0f;
        //   771: goto            775
        //   774: athrow         
        //   775: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   778: goto            782
        //   781: athrow         
        //   782: checkcast       Ldev/nuker/pyro/f7T;
        //   785: getstatic       dev/nuker/pyro/f7X.0:[I
        //   788: swap           
        //   789: goto            793
        //   792: athrow         
        //   793: invokevirtual   dev/nuker/pyro/f7T.ordinal:()I
        //   796: goto            800
        //   799: athrow         
        //   800: iaload         
        //   801: tableswitch {
        //                2: 820
        //          default: 841
        //        }
        //   820: new             Ldev/nuker/pyro/f8X;
        //   823: dup            
        //   824: goto            828
        //   827: athrow         
        //   828: invokespecial   dev/nuker/pyro/f8X.<init>:()V
        //   831: goto            835
        //   834: athrow         
        //   835: checkcast       Ldev/nuker/pyro/f8W;
        //   838: goto            900
        //   841: new             Lkotlin/NoWhenBranchMatchedException;
        //   844: dup            
        //   845: getstatic       dev/nuker/pyro/fc.c:I
        //   848: ifge            856
        //   851: ldc             2079067010
        //   853: goto            858
        //   856: ldc             1196014884
        //   858: ldc             940410380
        //   860: ixor           
        //   861: lookupswitch {
        //          1138855310: 856
        //          2135178024: 888
        //          default: 1116
        //        }
        //   888: goto            892
        //   891: athrow         
        //   892: invokespecial   kotlin/NoWhenBranchMatchedException.<init>:()V
        //   895: goto            899
        //   898: athrow         
        //   899: athrow         
        //   900: putfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/f8W;
        //   903: goto            1111
        //   906: aload_0        
        //   907: aload_0        
        //   908: getfield        dev/nuker/pyro/f7Y.1:Ldev/nuker/pyro/f0f;
        //   911: goto            915
        //   914: athrow         
        //   915: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   918: goto            922
        //   921: athrow         
        //   922: checkcast       Ldev/nuker/pyro/f7W;
        //   925: getstatic       dev/nuker/pyro/fc.0:I
        //   928: ifeq            936
        //   931: ldc             -669675094
        //   933: goto            938
        //   936: ldc             -1399477633
        //   938: ldc             1336444122
        //   940: ixor           
        //   941: lookupswitch {
        //          -1749215888: 936
        //          -482529627: 968
        //          default: 1118
        //        }
        //   968: getstatic       dev/nuker/pyro/f7X.1:[I
        //   971: swap           
        //   972: goto            976
        //   975: athrow         
        //   976: invokevirtual   dev/nuker/pyro/f7W.ordinal:()I
        //   979: goto            983
        //   982: athrow         
        //   983: iaload         
        //   984: tableswitch {
        //                2: 1008
        //                3: 1029
        //          default: 1050
        //        }
        //  1008: new             Ldev/nuker/pyro/f9a;
        //  1011: dup            
        //  1012: goto            1016
        //  1015: athrow         
        //  1016: invokespecial   dev/nuker/pyro/f9a.<init>:()V
        //  1019: goto            1023
        //  1022: athrow         
        //  1023: checkcast       Ldev/nuker/pyro/f8W;
        //  1026: goto            1108
        //  1029: new             Ldev/nuker/pyro/f99;
        //  1032: dup            
        //  1033: goto            1037
        //  1036: athrow         
        //  1037: invokespecial   dev/nuker/pyro/f99.<init>:()V
        //  1040: goto            1044
        //  1043: athrow         
        //  1044: checkcast       Ldev/nuker/pyro/f8W;
        //  1047: goto            1108
        //  1050: new             Lkotlin/NoWhenBranchMatchedException;
        //  1053: dup            
        //  1054: getstatic       dev/nuker/pyro/fc.1:I
        //  1057: ifeq            1065
        //  1060: ldc             -1727166889
        //  1062: goto            1067
        //  1065: ldc             -529562769
        //  1067: ldc             -1947349385
        //  1069: ixor           
        //  1070: lookupswitch {
        //          316688416: 1065
        //          1803701528: 1096
        //          default: 1124
        //        }
        //  1096: goto            1100
        //  1099: athrow         
        //  1100: invokespecial   kotlin/NoWhenBranchMatchedException.<init>:()V
        //  1103: goto            1107
        //  1106: athrow         
        //  1107: athrow         
        //  1108: putfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/f8W;
        //  1111: return         
        //  1112: aconst_null    
        //  1113: athrow         
        //  1114: aconst_null    
        //  1115: athrow         
        //  1116: aconst_null    
        //  1117: athrow         
        //  1118: aconst_null    
        //  1119: athrow         
        //  1120: aconst_null    
        //  1121: athrow         
        //  1122: aconst_null    
        //  1123: athrow         
        //  1124: aconst_null    
        //  1125: athrow         
        //  1126: aconst_null    
        //  1127: athrow         
        //  1128: aconst_null    
        //  1129: athrow         
        //  1130: aconst_null    
        //  1131: athrow         
        //  1132: pop            
        //  1133: goto            24
        //  1136: pop            
        //  1137: aconst_null    
        //  1138: goto            1132
        //  1141: dup            
        //  1142: ifnull          1132
        //  1145: checkcast       Ljava/lang/Throwable;
        //  1148: athrow         
        //  1149: dup            
        //  1150: ifnull          1136
        //  1153: checkcast       Ljava/lang/Throwable;
        //  1156: athrow         
        //  1157: aconst_null    
        //  1158: athrow         
        //    StackMapTable: 00 B6 43 07 00 35 04 FF 00 0B 00 00 00 01 07 00 35 FC 00 03 07 00 03 FF 00 06 00 00 00 01 07 00 35 FF 00 00 00 01 07 00 03 00 01 07 00 81 45 07 00 35 40 07 00 85 42 07 00 35 40 07 00 85 45 07 00 35 40 07 00 FE 49 07 00 6B FF 00 00 00 01 07 00 03 00 02 07 00 FF 07 00 8A 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 FF 01 1B FF 00 0F 00 01 07 00 03 00 02 07 00 03 07 00 85 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 85 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 85 FF 00 02 00 00 00 01 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 85 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 FE 49 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 07 00 FF 07 00 9C 45 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 07 00 FF 01 7E 07 00 03 FF 00 06 00 00 00 01 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 00 EC 08 00 EC 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 A1 45 07 00 03 FF 00 06 00 00 00 01 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 01 01 08 01 01 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 A8 45 07 00 03 FF 00 0E 00 01 07 00 03 00 03 07 00 03 08 01 16 08 01 16 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 01 16 08 01 16 01 FF 00 1C 00 01 07 00 03 00 03 07 00 03 08 01 16 08 01 16 42 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 01 16 08 01 16 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 AB 45 07 00 03 FF 00 0E 00 01 07 00 03 00 03 07 00 03 08 01 55 08 01 55 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 01 55 08 01 55 01 FF 00 1D 00 01 07 00 03 00 03 07 00 03 08 01 55 08 01 55 FF 00 02 00 00 00 01 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 01 55 08 01 55 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 B1 45 07 00 03 46 07 00 6F FF 00 00 00 01 07 00 03 00 03 07 00 03 08 01 95 08 01 95 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 B7 45 07 00 03 46 07 00 73 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 01 AA 08 01 AA 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 BA 45 07 00 03 FF 00 06 00 00 00 01 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 01 BF 08 01 BF 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 BD 45 07 00 03 46 07 00 79 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 01 D4 08 01 D4 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 C0 45 07 00 03 FF 00 0E 00 01 07 00 03 00 03 07 00 03 08 01 E9 08 01 E9 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 01 E9 08 01 E9 01 FF 00 1D 00 01 07 00 03 00 03 07 00 03 08 01 E9 08 01 E9 42 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 01 E9 08 01 E9 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 C3 45 07 00 03 46 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 02 29 08 02 29 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 C9 45 07 00 03 FF 00 0E 00 01 07 00 03 00 03 07 00 03 08 02 3E 08 02 3E FF 00 01 00 01 07 00 03 00 04 07 00 03 08 02 3E 08 02 3E 01 FF 00 1C 00 01 07 00 03 00 03 07 00 03 08 02 3E 08 02 3E 42 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 02 3E 08 02 3E 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 CC 45 07 00 03 46 07 00 75 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 02 7D 08 02 7D 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 D2 45 07 00 03 46 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 02 92 08 02 92 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 D5 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 A6 05 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 FF 00 0B 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 03 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 85 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 FE 49 07 00 65 FF 00 00 00 01 07 00 03 00 03 07 00 03 07 00 FF 07 00 E0 45 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 07 00 FF 01 53 07 00 03 FF 00 06 00 00 00 01 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 03 34 08 03 34 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 E5 45 07 00 03 FF 00 0E 00 01 07 00 03 00 03 07 00 03 08 03 49 08 03 49 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 03 49 08 03 49 01 FF 00 1D 00 01 07 00 03 00 03 07 00 03 08 03 49 08 03 49 42 07 00 7D FF 00 00 00 01 07 00 03 00 03 07 00 03 08 03 49 08 03 49 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 D5 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 A6 05 47 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 85 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 FE FF 00 0D 00 01 07 00 03 00 02 07 00 03 07 00 ED FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 ED 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 ED FF 00 06 00 00 00 01 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 07 00 FF 07 00 ED 45 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 07 00 FF 01 58 07 00 03 46 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 03 F0 08 03 F0 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 F5 45 07 00 03 FF 00 06 00 00 00 01 07 00 35 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 04 05 08 04 05 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 F8 45 07 00 03 FF 00 0E 00 01 07 00 03 00 03 07 00 03 08 04 1A 08 04 1A FF 00 01 00 01 07 00 03 00 04 07 00 03 08 04 1A 08 04 1A 01 FF 00 1C 00 01 07 00 03 00 03 07 00 03 08 04 1A 08 04 1A 42 07 00 75 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 04 1A 08 04 1A 45 07 00 35 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 D5 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 A6 02 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 02 3E 08 02 3E FF 00 01 00 01 07 00 03 00 03 07 00 03 08 01 E9 08 01 E9 FF 00 01 00 01 07 00 03 00 03 07 00 03 08 03 49 08 03 49 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 ED FF 00 01 00 01 07 00 03 00 03 07 00 03 08 01 16 08 01 16 FF 00 01 00 01 07 00 03 00 03 07 00 03 08 01 55 08 01 55 FF 00 01 00 01 07 00 03 00 03 07 00 03 08 04 1A 08 04 1A FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 85 41 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03 41 07 00 35 43 05 44 07 00 35 47 05 47 07 00 35
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1141   1149   Any
        //  1141   1149   1141   1149   Any
        //  1157   1159   3      8      Ljava/util/ConcurrentModificationException;
        //  32     38     38     39     Any
        //  32     38     3      8      Any
        //  32     38     38     39     Ljava/lang/ClassCastException;
        //  32     38     38     39     Any
        //  32     38     3      8      Any
        //  42     49     49     50     Any
        //  43     49     49     50     Any
        //  42     49     42     43     Any
        //  42     49     49     50     Ljava/lang/IllegalArgumentException;
        //  43     49     42     43     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  60     67     67     68     Any
        //  60     67     67     68     Ljava/lang/ClassCastException;
        //  60     67     67     68     Any
        //  61     67     3      8      Any
        //  60     67     60     61     Ljava/util/NoSuchElementException;
        //  148    154    154    155    Any
        //  148    154    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  148    154    154    155    Ljava/lang/ArithmeticException;
        //  148    154    3      8      Ljava/lang/IllegalArgumentException;
        //  148    154    154    155    Any
        //  165    172    172    173    Any
        //  165    172    172    173    Any
        //  165    172    165    166    Any
        //  166    172    172    173    Ljava/lang/EnumConstantNotPresentException;
        //  166    172    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  244    250    250    251    Any
        //  244    250    250    251    Any
        //  244    250    250    251    Any
        //  244    250    250    251    Ljava/lang/IllegalStateException;
        //  244    250    3      8      Any
        //  265    271    271    272    Any
        //  265    271    3      8      Ljava/util/NoSuchElementException;
        //  265    271    3      8      Any
        //  265    271    271    272    Ljava/lang/RuntimeException;
        //  265    271    3      8      Any
        //  327    334    334    335    Any
        //  327    334    327    328    Any
        //  327    334    327    328    Ljava/lang/IllegalArgumentException;
        //  328    334    334    335    Any
        //  328    334    3      8      Ljava/lang/ClassCastException;
        //  392    398    398    399    Any
        //  392    398    3      8      Any
        //  392    398    398    399    Any
        //  392    398    398    399    Any
        //  392    398    3      8      Ljava/lang/RuntimeException;
        //  412    419    419    420    Any
        //  413    419    419    420    Any
        //  412    419    419    420    Any
        //  412    419    412    413    Ljava/lang/ArithmeticException;
        //  413    419    419    420    Any
        //  433    440    440    441    Any
        //  434    440    3      8      Ljava/lang/ArithmeticException;
        //  433    440    3      8      Ljava/lang/AssertionError;
        //  434    440    3      8      Any
        //  434    440    433    434    Ljava/lang/IllegalStateException;
        //  455    461    461    462    Any
        //  455    461    461    462    Any
        //  455    461    461    462    Ljava/lang/EnumConstantNotPresentException;
        //  455    461    3      8      Any
        //  455    461    3      8      Ljava/lang/ClassCastException;
        //  475    482    482    483    Any
        //  475    482    482    483    Any
        //  476    482    482    483    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  475    482    482    483    Any
        //  476    482    475    476    Ljava/lang/IndexOutOfBoundsException;
        //  539    546    546    547    Any
        //  539    546    3      8      Ljava/util/ConcurrentModificationException;
        //  539    546    539    540    Any
        //  539    546    546    547    Ljava/lang/StringIndexOutOfBoundsException;
        //  540    546    539    540    Ljava/util/NoSuchElementException;
        //  560    567    567    568    Any
        //  561    567    560    561    Any
        //  561    567    3      8      Ljava/lang/IllegalStateException;
        //  561    567    567    568    Any
        //  561    567    567    568    Ljava/lang/IllegalStateException;
        //  623    630    630    631    Any
        //  624    630    623    624    Any
        //  624    630    623    624    Any
        //  623    630    630    631    Ljava/lang/ClassCastException;
        //  624    630    630    631    Ljava/lang/AssertionError;
        //  644    651    651    652    Any
        //  644    651    3      8      Any
        //  644    651    3      8      Any
        //  645    651    644    645    Ljava/lang/ClassCastException;
        //  645    651    644    645    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  665    672    672    673    Any
        //  666    672    672    673    Ljava/util/ConcurrentModificationException;
        //  665    672    3      8      Any
        //  666    672    665    666    Any
        //  666    672    665    666    Ljava/lang/ClassCastException;
        //  774    781    781    782    Any
        //  774    781    781    782    Any
        //  774    781    3      8      Any
        //  775    781    774    775    Any
        //  774    781    3      8      Ljava/lang/IllegalStateException;
        //  792    799    799    800    Any
        //  792    799    3      8      Any
        //  792    799    792    793    Ljava/lang/ClassCastException;
        //  792    799    799    800    Ljava/lang/AssertionError;
        //  792    799    3      8      Ljava/util/ConcurrentModificationException;
        //  828    834    834    835    Any
        //  828    834    3      8      Any
        //  828    834    834    835    Ljava/lang/ClassCastException;
        //  828    834    3      8      Ljava/util/ConcurrentModificationException;
        //  828    834    3      8      Ljava/lang/NullPointerException;
        //  891    898    898    899    Any
        //  892    898    3      8      Any
        //  891    898    3      8      Any
        //  891    898    891    892    Ljava/lang/NumberFormatException;
        //  891    898    898    899    Any
        //  914    921    921    922    Any
        //  915    921    921    922    Ljava/lang/ArithmeticException;
        //  914    921    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  915    921    914    915    Any
        //  915    921    3      8      Any
        //  976    982    982    983    Any
        //  976    982    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  976    982    982    983    Any
        //  976    982    3      8      Any
        //  976    982    982    983    Any
        //  1015   1022   1022   1023   Any
        //  1016   1022   1022   1023   Ljava/lang/NegativeArraySizeException;
        //  1016   1022   1015   1016   Ljava/lang/ArithmeticException;
        //  1016   1022   1022   1023   Any
        //  1015   1022   1015   1016   Ljava/lang/AssertionError;
        //  1037   1043   1043   1044   Any
        //  1037   1043   1043   1044   Ljava/lang/ClassCastException;
        //  1037   1043   3      8      Any
        //  1037   1043   1043   1044   Ljava/lang/RuntimeException;
        //  1037   1043   3      8      Any
        //  1099   1106   1106   1107   Any
        //  1099   1106   1106   1107   Any
        //  1100   1106   1106   1107   Ljava/lang/NegativeArraySizeException;
        //  1100   1106   1099   1100   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1099   1106   1099   1100   Ljava/lang/ArithmeticException;
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
    
    public f7Y() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifge            12
        //     6: ldc_w           1647753882
        //     9: goto            15
        //    12: ldc_w           189368263
        //    15: ldc_w           580437226
        //    18: ixor           
        //    19: lookupswitch {
        //          701580077: 44
        //          1085177456: 12
        //          default: 1332
        //        }
        //    44: aload_0        
        //    45: ldc_w           "\u2233\u1483\u8b3c\ub3dc\uc96b"
        //    48: invokestatic    invokestatic   !!! ERROR
        //    51: ldc_w           "\u2213\u1483\u8b3c\ub3dc\uc96b"
        //    54: invokestatic    invokestatic   !!! ERROR
        //    57: ldc_w           "\u2201\u149f\u8b35\ub3d6\uc978\uec35\ub264\ue70d\ud967\ue909\ua6a6\u1e58\ue03f\uc5e7\u8189\u88a8\u57aa\u7691\ubd3b\uc0a1\u2ac1\uc22f\u6bdc\u2d44\ud73e\u3451\u7d23\u887b\u801f\u8c7b\u856e\ufb3d\u7114\u9a1b\u1b28\uf0ab"
        //    60: getstatic       dev/nuker/pyro/fc.c:I
        //    63: ifge            72
        //    66: ldc_w           425099658
        //    69: goto            75
        //    72: ldc_w           -1469588785
        //    75: ldc_w           -116823137
        //    78: ixor           
        //    79: lookupswitch {
        //          -802809970: 72
        //          -530585067: 1336
        //          default: 104
        //        }
        //   104: invokestatic    invokestatic   !!! ERROR
        //   107: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   110: getstatic       dev/nuker/pyro/fc.1:I
        //   113: ifeq            122
        //   116: ldc_w           -1479783652
        //   119: goto            125
        //   122: ldc_w           -453221882
        //   125: ldc_w           65872057
        //   128: ixor           
        //   129: lookupswitch {
        //          -1541313627: 122
        //          -418299201: 156
        //          default: 1304
        //        }
        //   156: aload_0        
        //   157: new             Ldev/nuker/pyro/f0f;
        //   160: dup            
        //   161: ldc_w           "\u222e\u1490\u8b29"
        //   164: invokestatic    invokestatic   !!! ERROR
        //   167: ldc_w           "\u220d\u149c\u8b3d\ub3dc"
        //   170: invokestatic    invokestatic   !!! ERROR
        //   173: aconst_null    
        //   174: getstatic       dev/nuker/pyro/f7V.c:Ldev/nuker/pyro/f7V;
        //   177: checkcast       Ljava/lang/Enum;
        //   180: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   183: putfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/f0f;
        //   186: aload_0        
        //   187: new             Ldev/nuker/pyro/f0f;
        //   190: dup            
        //   191: ldc_w           "\u2221\u1492\u8b3a"
        //   194: invokestatic    invokestatic   !!! ERROR
        //   197: ldc_w           "\u220d\u149c\u8b3d\ub3dc"
        //   200: getstatic       dev/nuker/pyro/fc.0:I
        //   203: ifeq            212
        //   206: ldc_w           -294314416
        //   209: goto            215
        //   212: ldc_w           1293728921
        //   215: ldc_w           512343263
        //   218: ixor           
        //   219: lookupswitch {
        //          -251878769: 212
        //          1402273862: 244
        //          default: 1302
        //        }
        //   244: invokestatic    invokestatic   !!! ERROR
        //   247: aconst_null    
        //   248: getstatic       dev/nuker/pyro/fc.c:I
        //   251: ifge            260
        //   254: ldc_w           1097358213
        //   257: goto            263
        //   260: ldc_w           -98219497
        //   263: ldc_w           -430675604
        //   266: ixor           
        //   267: lookupswitch {
        //          -1489227031: 260
        //          477176699: 292
        //          default: 1326
        //        }
        //   292: getstatic       dev/nuker/pyro/f7T.c:Ldev/nuker/pyro/f7T;
        //   295: checkcast       Ljava/lang/Enum;
        //   298: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   301: putfield        dev/nuker/pyro/f7Y.0:Ldev/nuker/pyro/f0f;
        //   304: aload_0        
        //   305: new             Ldev/nuker/pyro/f0f;
        //   308: dup            
        //   309: ldc_w           "\u2236\u1492\u8b37\ub3d0\uc963\uec2a\ub225"
        //   312: getstatic       dev/nuker/pyro/fc.1:I
        //   315: ifeq            324
        //   318: ldc_w           1050364561
        //   321: goto            327
        //   324: ldc_w           2087249986
        //   327: ldc_w           534228758
        //   330: ixor           
        //   331: lookupswitch {
        //          558687623: 324
        //          1673480020: 356
        //          default: 1310
        //        }
        //   356: invokestatic    invokestatic   !!! ERROR
        //   359: ldc_w           "\u220d\u149c\u8b3d\ub3dc"
        //   362: invokestatic    invokestatic   !!! ERROR
        //   365: aconst_null    
        //   366: getstatic       dev/nuker/pyro/f7W.c:Ldev/nuker/pyro/f7W;
        //   369: checkcast       Ljava/lang/Enum;
        //   372: getstatic       dev/nuker/pyro/fc.c:I
        //   375: ifge            384
        //   378: ldc_w           348268055
        //   381: goto            387
        //   384: ldc_w           -987694401
        //   387: ldc_w           -804785803
        //   390: ixor           
        //   391: lookupswitch {
        //          -993667230: 384
        //          354880458: 416
        //          default: 1316
        //        }
        //   416: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   419: putfield        dev/nuker/pyro/f7Y.1:Ldev/nuker/pyro/f0f;
        //   422: aload_0        
        //   423: new             Ldev/nuker/pyro/f0d;
        //   426: dup            
        //   427: ldc_w           "\u2236\u1492\u8b37\ub3d0\uc963\uec2a\ub225\ue727\ud978\ue919\ua6e3\u1e48"
        //   430: invokestatic    invokestatic   !!! ERROR
        //   433: ldc_w           "\u2213\u1483\u8b3c\ub3dc\uc96b"
        //   436: invokestatic    invokestatic   !!! ERROR
        //   439: aconst_null    
        //   440: dconst_1       
        //   441: ldc2_w          0.1
        //   444: ldc2_w          10.0
        //   447: dconst_0       
        //   448: bipush          64
        //   450: aconst_null    
        //   451: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   454: putfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/f0d;
        //   457: getstatic       dev/nuker/pyro/fc.c:I
        //   460: ifge            469
        //   463: ldc_w           820695613
        //   466: goto            472
        //   469: ldc_w           1692515298
        //   472: ldc_w           558287206
        //   475: ixor           
        //   476: lookupswitch {
        //          296491867: 469
        //          1168601732: 504
        //          default: 1330
        //        }
        //   504: aload_0        
        //   505: aload_0        
        //   506: new             Ldev/nuker/pyro/f0q;
        //   509: dup            
        //   510: ldc_w           "\u2221\u149d\u8b2d\ub3d0\uc96c\uec2e\ub221\ue715\ud97c"
        //   513: invokestatic    invokestatic   !!! ERROR
        //   516: ldc_w           "\u2201\u149d\u8b2d\ub3d0\uc94c\uec2e\ub221\ue715\ud97c"
        //   519: getstatic       dev/nuker/pyro/fc.c:I
        //   522: ifge            531
        //   525: ldc_w           -886521075
        //   528: goto            534
        //   531: ldc_w           1114081355
        //   534: ldc_w           654505608
        //   537: ixor           
        //   538: lookupswitch {
        //          -1286474118: 531
        //          -332778107: 1320
        //          default: 564
        //        }
        //   564: invokestatic    invokestatic   !!! ERROR
        //   567: aconst_null    
        //   568: getstatic       dev/nuker/pyro/f7U.c:Ldev/nuker/pyro/f7U;
        //   571: checkcast       Ljava/lang/Enum;
        //   574: iconst_3       
        //   575: anewarray       Ljava/util/List;
        //   578: dup            
        //   579: iconst_0       
        //   580: aload_0        
        //   581: getfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/f0f;
        //   584: invokestatic    kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
        //   587: aastore        
        //   588: dup            
        //   589: iconst_1       
        //   590: aload_0        
        //   591: getstatic       dev/nuker/pyro/fc.1:I
        //   594: ifeq            603
        //   597: ldc_w           -1506674291
        //   600: goto            606
        //   603: ldc_w           -1611542835
        //   606: ldc_w           -160928572
        //   609: ixor           
        //   610: lookupswitch {
        //          1348048201: 603
        //          1771676169: 636
        //          default: 1334
        //        }
        //   636: getfield        dev/nuker/pyro/f7Y.0:Ldev/nuker/pyro/f0f;
        //   639: invokestatic    kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
        //   642: aastore        
        //   643: dup            
        //   644: iconst_2       
        //   645: iconst_2       
        //   646: anewarray       Ldev/nuker/pyro/f0l;
        //   649: dup            
        //   650: iconst_0       
        //   651: aload_0        
        //   652: getstatic       dev/nuker/pyro/fc.c:I
        //   655: ifge            664
        //   658: ldc_w           -273346583
        //   661: goto            667
        //   664: ldc_w           1144551499
        //   667: ldc_w           671248001
        //   670: ixor           
        //   671: lookupswitch {
        //          -944283288: 664
        //          1815746250: 696
        //          default: 1318
        //        }
        //   696: getfield        dev/nuker/pyro/f7Y.1:Ldev/nuker/pyro/f0f;
        //   699: checkcast       Ldev/nuker/pyro/f0l;
        //   702: aastore        
        //   703: dup            
        //   704: iconst_1       
        //   705: aload_0        
        //   706: getfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/f0d;
        //   709: checkcast       Ldev/nuker/pyro/f0l;
        //   712: aastore        
        //   713: invokestatic    kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
        //   716: aastore        
        //   717: getstatic       dev/nuker/pyro/fc.1:I
        //   720: ifeq            729
        //   723: ldc_w           923325207
        //   726: goto            732
        //   729: ldc_w           -1373622396
        //   732: ldc_w           1501154296
        //   735: ixor           
        //   736: lookupswitch {
        //          -2055907258: 729
        //          1852905711: 1308
        //          default: 764
        //        }
        //   764: invokespecial   dev/nuker/pyro/f0q.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;[Ljava/util/List;)V
        //   767: checkcast       Ldev/nuker/pyro/f0n;
        //   770: invokevirtual   dev/nuker/pyro/f7Y.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   773: checkcast       Ldev/nuker/pyro/f0q;
        //   776: getstatic       dev/nuker/pyro/fc.0:I
        //   779: ifeq            788
        //   782: ldc_w           476836164
        //   785: goto            791
        //   788: ldc_w           1407705166
        //   791: ldc_w           263216075
        //   794: ixor           
        //   795: lookupswitch {
        //          -763045809: 788
        //          333163151: 1322
        //          default: 820
        //        }
        //   820: putfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/f0q;
        //   823: aload_0        
        //   824: aload_0        
        //   825: new             Ldev/nuker/pyro/f0a;
        //   828: dup            
        //   829: ldc_w           "\u2233\u1483\u8b3c\ub3dc\uc96b\uec0f\ub22a\ue723\ud969\ue908\ua6e3\u1e5e"
        //   832: getstatic       dev/nuker/pyro/fc.1:I
        //   835: ifeq            844
        //   838: ldc_w           -878318599
        //   841: goto            847
        //   844: ldc_w           -985468994
        //   847: ldc_w           1327038063
        //   850: ixor           
        //   851: lookupswitch {
        //          -2067982954: 844
        //          -1973808687: 876
        //          default: 1312
        //        }
        //   876: invokestatic    invokestatic   !!! ERROR
        //   879: ldc_w           "\u2213\u1483\u8b3c\ub3dc\uc96b\uec0f\ub22a\ue723\ud969\ue908\ua6e3\u1e5e"
        //   882: invokestatic    invokestatic   !!! ERROR
        //   885: ldc_w           "\u2201\u149f\u8b35\ub3d6\uc978\uec35\ub264\ue707\ud978\ue919\ua6e3\u1e48\ue070\uc5b3\u8194\u88fd\u57a2\u76c4\ubd33\uc0a3\u2ac6\uc232\u6bd6\u2d58\ud73e\u344c\u7d25\u883a\u8006\u8c3a\u8574\ufb37\u7114"
        //   888: invokestatic    invokestatic   !!! ERROR
        //   891: iconst_0       
        //   892: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   895: checkcast       Ldev/nuker/pyro/f0n;
        //   898: invokevirtual   dev/nuker/pyro/f7Y.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   901: checkcast       Ldev/nuker/pyro/f0a;
        //   904: putfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/f0a;
        //   907: aload_0        
        //   908: getstatic       dev/nuker/pyro/fc.0:I
        //   911: ifeq            920
        //   914: ldc_w           1863206340
        //   917: goto            923
        //   920: ldc_w           -567204397
        //   923: ldc_w           464235498
        //   926: ixor           
        //   927: lookupswitch {
        //          -1563082049: 920
        //          1957031470: 1324
        //          default: 952
        //        }
        //   952: aload_0        
        //   953: new             Ldev/nuker/pyro/f0a;
        //   956: dup            
        //   957: ldc_w           "\u2235\u1480\u8b3c\ub3ed\uc966\uec2b\ub221\ue706"
        //   960: invokestatic    invokestatic   !!! ERROR
        //   963: ldc_w           "\u2215\u1480\u8b3c\ub3ed\uc966\uec2b\ub221\ue706"
        //   966: getstatic       dev/nuker/pyro/fc.0:I
        //   969: ifeq            978
        //   972: ldc_w           2107549287
        //   975: goto            981
        //   978: ldc_w           -1392378970
        //   981: ldc_w           1887542642
        //   984: ixor           
        //   985: lookupswitch {
        //          -578787628: 1012
        //          220150549: 978
        //          default: 1328
        //        }
        //  1012: invokestatic    invokestatic   !!! ERROR
        //  1015: ldc_w           "\u220d\u149c\u8b3d\ub3d0\uc969\uec2f\ub221\ue707\ud928\ue908\ua6ee\u1e49\ue070\uc5a0\u819a\u88b0\u57a1\u7691\ubd2e\uc0b0\u2ad7\uc23e\u6bdd\u2d16\ud76a\u344a\u7d6b\u887b\u801d\u8c37\u856f\ufb25\u7146\u9a0f\u1b26\uf0b2\u493c\u89a1\uca89\uffcb\ub715\u41fc\ub836\ub34d\u4c99\u8b33\u7c68\ucfe2\u7d5a\uea6b\ue70a"
        //  1018: getstatic       dev/nuker/pyro/fc.c:I
        //  1021: ifge            1030
        //  1024: ldc_w           -1353587156
        //  1027: goto            1033
        //  1030: ldc_w           -708381064
        //  1033: ldc_w           -1839081924
        //  1036: ixor           
        //  1037: lookupswitch {
        //          1026568208: 1030
        //          1202135108: 1064
        //          default: 1300
        //        }
        //  1064: invokestatic    invokestatic   !!! ERROR
        //  1067: iconst_1       
        //  1068: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  1071: checkcast       Ldev/nuker/pyro/f0n;
        //  1074: getstatic       dev/nuker/pyro/fc.c:I
        //  1077: ifge            1086
        //  1080: ldc_w           1931816289
        //  1083: goto            1089
        //  1086: ldc_w           -267489502
        //  1089: ldc_w           64177419
        //  1092: ixor           
        //  1093: lookupswitch {
        //          -203609559: 1120
        //          1895196778: 1086
        //          default: 1306
        //        }
        //  1120: invokevirtual   dev/nuker/pyro/f7Y.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1123: checkcast       Ldev/nuker/pyro/f0a;
        //  1126: putfield        dev/nuker/pyro/f7Y.0:Ldev/nuker/pyro/f0a;
        //  1129: aload_0        
        //  1130: getfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/f0q;
        //  1133: getstatic       dev/nuker/pyro/fc.0:I
        //  1136: ifeq            1145
        //  1139: ldc_w           1906393448
        //  1142: goto            1148
        //  1145: ldc_w           454766809
        //  1148: ldc_w           -1503297355
        //  1151: ixor           
        //  1152: lookupswitch {
        //          -1115770772: 1180
        //          -674971171: 1145
        //          default: 1314
        //        }
        //  1180: invokevirtual   dev/nuker/pyro/f0q.0:()Ldev/nuker/pyro/f0f;
        //  1183: new             Ldev/nuker/pyro/f7P;
        //  1186: dup            
        //  1187: aload_0        
        //  1188: invokespecial   dev/nuker/pyro/f7P.<init>:(Ldev/nuker/pyro/f7Y;)V
        //  1191: checkcast       Ljava/util/function/Consumer;
        //  1194: invokevirtual   dev/nuker/pyro/f0f.c:(Ljava/util/function/Consumer;)V
        //  1197: aload_0        
        //  1198: getstatic       dev/nuker/pyro/fc.0:I
        //  1201: ifeq            1210
        //  1204: ldc_w           -1205207879
        //  1207: goto            1213
        //  1210: ldc_w           1517428962
        //  1213: ldc_w           1996140961
        //  1216: ixor           
        //  1217: lookupswitch {
        //          -825012968: 1298
        //          1443497628: 1210
        //          default: 1244
        //        }
        //  1244: getfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/f0f;
        //  1247: new             Ldev/nuker/pyro/f7Q;
        //  1250: dup            
        //  1251: aload_0        
        //  1252: invokespecial   dev/nuker/pyro/f7Q.<init>:(Ldev/nuker/pyro/f7Y;)V
        //  1255: checkcast       Ljava/util/function/Consumer;
        //  1258: invokevirtual   dev/nuker/pyro/f0f.c:(Ljava/util/function/Consumer;)V
        //  1261: aload_0        
        //  1262: getfield        dev/nuker/pyro/f7Y.0:Ldev/nuker/pyro/f0f;
        //  1265: new             Ldev/nuker/pyro/f7R;
        //  1268: dup            
        //  1269: aload_0        
        //  1270: invokespecial   dev/nuker/pyro/f7R.<init>:(Ldev/nuker/pyro/f7Y;)V
        //  1273: checkcast       Ljava/util/function/Consumer;
        //  1276: invokevirtual   dev/nuker/pyro/f0f.c:(Ljava/util/function/Consumer;)V
        //  1279: aload_0        
        //  1280: getfield        dev/nuker/pyro/f7Y.1:Ldev/nuker/pyro/f0f;
        //  1283: new             Ldev/nuker/pyro/f7S;
        //  1286: dup            
        //  1287: aload_0        
        //  1288: invokespecial   dev/nuker/pyro/f7S.<init>:(Ldev/nuker/pyro/f7Y;)V
        //  1291: checkcast       Ljava/util/function/Consumer;
        //  1294: invokevirtual   dev/nuker/pyro/f0f.c:(Ljava/util/function/Consumer;)V
        //  1297: return         
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
        //  1334: aconst_null    
        //  1335: athrow         
        //  1336: aconst_null    
        //  1337: athrow         
        //    StackMapTable: 00 50 0C 42 01 1C FF 00 1B 00 01 06 00 04 06 07 01 B2 07 01 B2 07 01 B2 FF 00 02 00 01 06 00 05 06 07 01 B2 07 01 B2 07 01 B2 01 FF 00 1C 00 01 06 00 04 06 07 01 B2 07 01 B2 07 01 B2 FF 00 11 00 01 07 00 03 00 00 42 01 1E FF 00 37 00 01 07 00 03 00 05 07 00 03 08 00 BB 08 00 BB 07 01 B2 07 01 B2 FF 00 02 00 01 07 00 03 00 06 07 00 03 08 00 BB 08 00 BB 07 01 B2 07 01 B2 01 FF 00 1C 00 01 07 00 03 00 05 07 00 03 08 00 BB 08 00 BB 07 01 B2 07 01 B2 FF 00 0F 00 01 07 00 03 00 06 07 00 03 08 00 BB 08 00 BB 07 01 B2 07 01 B2 05 FF 00 02 00 01 07 00 03 00 07 07 00 03 08 00 BB 08 00 BB 07 01 B2 07 01 B2 05 01 FF 00 1C 00 01 07 00 03 00 06 07 00 03 08 00 BB 08 00 BB 07 01 B2 07 01 B2 05 FF 00 1F 00 01 07 00 03 00 04 07 00 03 08 01 31 08 01 31 07 01 B2 FF 00 02 00 01 07 00 03 00 05 07 00 03 08 01 31 08 01 31 07 01 B2 01 FF 00 1C 00 01 07 00 03 00 04 07 00 03 08 01 31 08 01 31 07 01 B2 FF 00 1B 00 01 07 00 03 00 07 07 00 03 08 01 31 08 01 31 07 01 B2 07 01 B2 05 07 01 1F FF 00 02 00 01 07 00 03 00 08 07 00 03 08 01 31 08 01 31 07 01 B2 07 01 B2 05 07 01 1F 01 FF 00 1C 00 01 07 00 03 00 07 07 00 03 08 01 31 08 01 31 07 01 B2 07 01 B2 05 07 01 1F 34 42 01 1F FF 00 1A 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 FA 08 01 FA 07 01 B2 07 01 B2 FF 00 02 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 FA 08 01 FA 07 01 B2 07 01 B2 01 FF 00 1D 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 FA 08 01 FA 07 01 B2 07 01 B2 FF 00 26 00 01 07 00 03 00 0C 07 00 03 07 00 03 08 01 FA 08 01 FA 07 01 B2 07 01 B2 05 07 01 1F 07 01 B4 07 01 B4 01 07 00 03 FF 00 02 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 01 FA 08 01 FA 07 01 B2 07 01 B2 05 07 01 1F 07 01 B4 07 01 B4 01 07 00 03 01 FF 00 1D 00 01 07 00 03 00 0C 07 00 03 07 00 03 08 01 FA 08 01 FA 07 01 B2 07 01 B2 05 07 01 1F 07 01 B4 07 01 B4 01 07 00 03 FF 00 1B 00 01 07 00 03 00 0F 07 00 03 07 00 03 08 01 FA 08 01 FA 07 01 B2 07 01 B2 05 07 01 1F 07 01 B4 07 01 B4 01 07 01 B6 07 01 B6 01 07 00 03 FF 00 02 00 01 07 00 03 00 10 07 00 03 07 00 03 08 01 FA 08 01 FA 07 01 B2 07 01 B2 05 07 01 1F 07 01 B4 07 01 B4 01 07 01 B6 07 01 B6 01 07 00 03 01 FF 00 1C 00 01 07 00 03 00 0F 07 00 03 07 00 03 08 01 FA 08 01 FA 07 01 B2 07 01 B2 05 07 01 1F 07 01 B4 07 01 B4 01 07 01 B6 07 01 B6 01 07 00 03 FF 00 20 00 01 07 00 03 00 09 07 00 03 07 00 03 08 01 FA 08 01 FA 07 01 B2 07 01 B2 05 07 01 1F 07 01 B4 FF 00 02 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 01 FA 08 01 FA 07 01 B2 07 01 B2 05 07 01 1F 07 01 B4 01 FF 00 1F 00 01 07 00 03 00 09 07 00 03 07 00 03 08 01 FA 08 01 FA 07 01 B2 07 01 B2 05 07 01 1F 07 01 B4 FF 00 17 00 01 07 00 03 00 02 07 00 03 07 00 81 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 81 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 81 FF 00 17 00 01 07 00 03 00 05 07 00 03 07 00 03 08 03 39 08 03 39 07 01 B2 FF 00 02 00 01 07 00 03 00 06 07 00 03 07 00 03 08 03 39 08 03 39 07 01 B2 01 FF 00 1C 00 01 07 00 03 00 05 07 00 03 07 00 03 08 03 39 08 03 39 07 01 B2 6B 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 19 00 01 07 00 03 00 06 07 00 03 07 00 03 08 03 B9 08 03 B9 07 01 B2 07 01 B2 FF 00 02 00 01 07 00 03 00 07 07 00 03 07 00 03 08 03 B9 08 03 B9 07 01 B2 07 01 B2 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 03 B9 08 03 B9 07 01 B2 07 01 B2 FF 00 11 00 01 07 00 03 00 07 07 00 03 07 00 03 08 03 B9 08 03 B9 07 01 B2 07 01 B2 07 01 B2 FF 00 02 00 01 07 00 03 00 08 07 00 03 07 00 03 08 03 B9 08 03 B9 07 01 B2 07 01 B2 07 01 B2 01 FF 00 1E 00 01 07 00 03 00 07 07 00 03 07 00 03 08 03 B9 08 03 B9 07 01 B2 07 01 B2 07 01 B2 FF 00 15 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 6D FF 00 02 00 01 07 00 03 00 04 07 00 03 07 00 03 07 01 6D 01 FF 00 1E 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 6D 58 07 00 81 FF 00 02 00 01 07 00 03 00 02 07 00 81 01 5F 07 00 81 5D 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5E 07 00 03 75 07 00 03 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 03 B9 08 03 B9 07 01 B2 07 01 B2 07 01 B2 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 BB 08 00 BB 07 01 B2 07 01 B2 01 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 6D FF 00 01 00 01 07 00 03 00 09 07 00 03 07 00 03 08 01 FA 08 01 FA 07 01 B2 07 01 B2 05 07 01 1F 07 01 B4 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 01 31 08 01 31 07 01 B2 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 03 39 08 03 39 07 01 B2 41 07 00 81 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 01 31 08 01 31 07 01 B2 07 01 B2 05 07 01 1F FF 00 01 00 01 07 00 03 00 0F 07 00 03 07 00 03 08 01 FA 08 01 FA 07 01 B2 07 01 B2 05 07 01 1F 07 01 B4 07 01 B4 01 07 01 B6 07 01 B6 01 07 00 03 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 FA 08 01 FA 07 01 B2 07 01 B2 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 81 41 07 00 03 FF 00 01 00 01 07 00 03 00 06 07 00 03 08 00 BB 08 00 BB 07 01 B2 07 01 B2 05 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 03 B9 08 03 B9 07 01 B2 07 01 B2 01 FF 00 01 00 01 06 00 00 FF 00 01 00 01 07 00 03 00 0C 07 00 03 07 00 03 08 01 FA 08 01 FA 07 01 B2 07 01 B2 05 07 01 1F 07 01 B4 07 01 B4 01 07 00 03 FF 00 01 00 01 06 00 04 06 07 01 B2 07 01 B2 07 01 B2
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
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          379
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            371
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            363
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: aload_2        
        //    27: aload_3        
        //    28: getstatic       dev/nuker/pyro/fc.1:I
        //    31: ifeq            40
        //    34: ldc_w           1874984601
        //    37: goto            43
        //    40: ldc_w           -160349199
        //    43: ldc_w           289410378
        //    46: ixor           
        //    47: lookupswitch {
        //          1268106929: 40
        //          2122445779: 348
        //          default: 72
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //    79: goto            83
        //    82: athrow         
        //    83: aload_0        
        //    84: goto            88
        //    87: athrow         
        //    88: invokevirtual   dev/nuker/pyro/f7Y.7:()V
        //    91: goto            95
        //    94: athrow         
        //    95: aload_0        
        //    96: getstatic       dev/nuker/pyro/fc.1:I
        //    99: ifeq            108
        //   102: ldc_w           332463915
        //   105: goto            111
        //   108: ldc_w           -277146593
        //   111: ldc_w           -1302076010
        //   114: ixor           
        //   115: lookupswitch {
        //          -1582097731: 108
        //          1561915785: 140
        //          default: 350
        //        }
        //   140: goto            144
        //   143: athrow         
        //   144: invokevirtual   dev/nuker/pyro/f7Y.5:()V
        //   147: goto            151
        //   150: athrow         
        //   151: getstatic       dev/nuker/pyro/f02.c:Ldev/nuker/pyro/f02;
        //   154: ldc_w           "\u2233\u1483\u8b3c\ub1cd\ucf9a\uec2e\ub225\ue70c"
        //   157: getstatic       dev/nuker/pyro/fc.c:I
        //   160: ifge            169
        //   163: ldc_w           1857551538
        //   166: goto            172
        //   169: ldc_w           -666889880
        //   172: ldc_w           -1688825306
        //   175: ixor           
        //   176: lookupswitch {
        //          -169775468: 169
        //          1125548878: 204
        //          default: 346
        //        }
        //   204: goto            208
        //   207: athrow         
        //   208: invokestatic    invokestatic   !!! ERROR
        //   211: goto            215
        //   214: athrow         
        //   215: getstatic       dev/nuker/pyro/fc.0:I
        //   218: ifeq            227
        //   221: ldc_w           -918433137
        //   224: goto            230
        //   227: ldc_w           814797677
        //   230: ldc_w           -247908655
        //   233: ixor           
        //   234: lookupswitch {
        //          -1045830212: 260
        //          947446878: 227
        //          default: 344
        //        }
        //   260: goto            264
        //   263: athrow         
        //   264: invokevirtual   dev/nuker/pyro/f02.1:(Ljava/lang/String;)V
        //   267: goto            271
        //   270: athrow         
        //   271: getstatic       dev/nuker/pyro/f02.c:Ldev/nuker/pyro/f02;
        //   274: ldc_w           "\u2233\u1483\u8b3c\ub1cd\ucf9b\uec22\ub231\ue704\udb69"
        //   277: goto            281
        //   280: athrow         
        //   281: invokestatic    invokestatic   !!! ERROR
        //   284: goto            288
        //   287: athrow         
        //   288: getstatic       dev/nuker/pyro/fc.c:I
        //   291: ifge            300
        //   294: ldc_w           955774368
        //   297: goto            303
        //   300: ldc_w           64569217
        //   303: ldc_w           -1431475483
        //   306: ixor           
        //   307: lookupswitch {
        //          -1839554747: 352
        //          858768202: 300
        //          default: 332
        //        }
        //   332: goto            336
        //   335: athrow         
        //   336: invokevirtual   dev/nuker/pyro/f02.1:(Ljava/lang/String;)V
        //   339: goto            343
        //   342: athrow         
        //   343: return         
        //   344: aconst_null    
        //   345: athrow         
        //   346: aconst_null    
        //   347: athrow         
        //   348: aconst_null    
        //   349: athrow         
        //   350: aconst_null    
        //   351: athrow         
        //   352: aconst_null    
        //   353: athrow         
        //   354: pop            
        //   355: goto            24
        //   358: pop            
        //   359: aconst_null    
        //   360: goto            354
        //   363: dup            
        //   364: ifnull          354
        //   367: checkcast       Ljava/lang/Throwable;
        //   370: athrow         
        //   371: dup            
        //   372: ifnull          358
        //   375: checkcast       Ljava/lang/Throwable;
        //   378: athrow         
        //   379: aconst_null    
        //   380: athrow         
        //    StackMapTable: 00 39 43 07 00 35 04 FF 00 0B 00 00 00 01 07 00 35 FF 00 03 00 04 07 00 03 01 07 01 DD 07 01 DF 00 00 FF 00 0F 00 04 07 00 03 01 07 01 DD 07 01 DF 00 04 07 00 03 01 07 01 DD 07 01 DF FF 00 02 00 04 07 00 03 01 07 01 DD 07 01 DF 00 05 07 00 03 01 07 01 DD 07 01 DF 01 FF 00 1C 00 04 07 00 03 01 07 01 DD 07 01 DF 00 04 07 00 03 01 07 01 DD 07 01 DF 42 07 00 35 FF 00 00 00 04 07 00 03 01 07 01 DD 07 01 DF 00 04 07 00 03 01 07 01 DD 07 01 DF 45 07 00 35 00 43 07 00 75 40 07 00 03 45 07 00 35 00 4C 07 00 03 FF 00 02 00 04 07 00 03 01 07 01 DD 07 01 DF 00 02 07 00 03 01 5C 07 00 03 42 07 00 35 40 07 00 03 45 07 00 35 00 FF 00 11 00 04 07 00 03 01 07 01 DD 07 01 DF 00 02 07 01 C8 07 01 B2 FF 00 02 00 04 07 00 03 01 07 01 DD 07 01 DF 00 03 07 01 C8 07 01 B2 01 FF 00 1F 00 04 07 00 03 01 07 01 DD 07 01 DF 00 02 07 01 C8 07 01 B2 42 07 00 75 FF 00 00 00 04 07 00 03 01 07 01 DD 07 01 DF 00 02 07 01 C8 07 01 B2 45 07 00 35 FF 00 00 00 04 07 00 03 01 07 01 DD 07 01 DF 00 02 07 01 C8 07 01 B2 FF 00 0B 00 04 07 00 03 01 07 01 DD 07 01 DF 00 02 07 01 C8 07 01 B2 FF 00 02 00 04 07 00 03 01 07 01 DD 07 01 DF 00 03 07 01 C8 07 01 B2 01 FF 00 1D 00 04 07 00 03 01 07 01 DD 07 01 DF 00 02 07 01 C8 07 01 B2 42 07 00 35 FF 00 00 00 04 07 00 03 01 07 01 DD 07 01 DF 00 02 07 01 C8 07 01 B2 45 07 00 35 00 FF 00 08 00 00 00 01 07 00 35 FF 00 00 00 04 07 00 03 01 07 01 DD 07 01 DF 00 02 07 01 C8 07 01 B2 45 07 00 35 FF 00 00 00 04 07 00 03 01 07 01 DD 07 01 DF 00 02 07 01 C8 07 01 B2 FF 00 0B 00 04 07 00 03 01 07 01 DD 07 01 DF 00 02 07 01 C8 07 01 B2 FF 00 02 00 04 07 00 03 01 07 01 DD 07 01 DF 00 03 07 01 C8 07 01 B2 01 FF 00 1C 00 04 07 00 03 01 07 01 DD 07 01 DF 00 02 07 01 C8 07 01 B2 42 07 00 7D FF 00 00 00 04 07 00 03 01 07 01 DD 07 01 DF 00 02 07 01 C8 07 01 B2 45 07 00 35 00 FF 00 00 00 04 07 00 03 01 07 01 DD 07 01 DF 00 02 07 01 C8 07 01 B2 FF 00 01 00 04 07 00 03 01 07 01 DD 07 01 DF 00 02 07 01 C8 07 01 B2 FF 00 01 00 04 07 00 03 01 07 01 DD 07 01 DF 00 04 07 00 03 01 07 01 DD 07 01 DF 41 07 00 03 FF 00 01 00 04 07 00 03 01 07 01 DD 07 01 DF 00 02 07 01 C8 07 01 B2 41 07 00 35 43 05 44 07 00 35 47 05 47 07 00 35
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     363    371    Any
        //  363    371    363    371    Ljava/lang/ArithmeticException;
        //  379    381    3      8      Ljava/lang/NegativeArraySizeException;
        //  75     82     82     83     Any
        //  76     82     75     76     Any
        //  75     82     82     83     Ljava/lang/NumberFormatException;
        //  75     82     82     83     Any
        //  76     82     82     83     Any
        //  87     94     94     95     Any
        //  87     94     94     95     Ljava/lang/StringIndexOutOfBoundsException;
        //  87     94     87     88     Ljava/lang/NullPointerException;
        //  88     94     87     88     Ljava/lang/NegativeArraySizeException;
        //  88     94     3      8      Ljava/util/NoSuchElementException;
        //  143    150    150    151    Any
        //  143    150    3      8      Ljava/util/ConcurrentModificationException;
        //  144    150    143    144    Any
        //  144    150    3      8      Any
        //  143    150    150    151    Any
        //  207    214    214    215    Any
        //  207    214    207    208    Ljava/util/ConcurrentModificationException;
        //  207    214    214    215    Ljava/lang/RuntimeException;
        //  208    214    207    208    Ljava/util/NoSuchElementException;
        //  208    214    214    215    Any
        //  263    270    270    271    Any
        //  263    270    263    264    Any
        //  264    270    270    271    Ljava/lang/NumberFormatException;
        //  263    270    270    271    Ljava/util/NoSuchElementException;
        //  264    270    263    264    Ljava/lang/EnumConstantNotPresentException;
        //  281    287    287    288    Any
        //  281    287    3      8      Any
        //  281    287    287    288    Ljava/lang/IllegalStateException;
        //  281    287    3      8      Ljava/lang/UnsupportedOperationException;
        //  281    287    3      8      Ljava/util/NoSuchElementException;
        //  335    342    342    343    Any
        //  336    342    3      8      Any
        //  336    342    335    336    Ljava/lang/NumberFormatException;
        //  336    342    342    343    Any
        //  336    342    342    343    Ljava/util/ConcurrentModificationException;
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
    
    public void 5() {
        fbS.dE(this, 1062166484);
    }
    
    public void c(@NotNull final f0q c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0041:
            while (true) {
                do {
                    Label_0028: {
                        break Label_0028;
                        try {
                            o = null;
                            if (fc.0 <= 0) {
                                null;
                                goto Label_0033;
                            }
                            continue Label_0041;
                            this.c = (f0q<f7U>)c;
                            return;
                        }
                        catch (RuntimeException ex) {}
                    }
                    continue Label_0041;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    @f06
    @LauncherEventHide
    public void c(@Nullable final f3e f3e) {
        fbS.5O(this, 1994616479, f3e);
    }
    
    public void c(@Nullable final f8W p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            39
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            31
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: aload_1        
        //    18: putfield        dev/nuker/pyro/f7Y.c:Ldev/nuker/pyro/f8W;
        //    21: return         
        //    22: pop            
        //    23: goto            16
        //    26: pop            
        //    27: aconst_null    
        //    28: goto            22
        //    31: dup            
        //    32: ifnull          22
        //    35: checkcast       Ljava/lang/Throwable;
        //    38: athrow         
        //    39: dup            
        //    40: ifnull          26
        //    43: checkcast       Ljava/lang/Throwable;
        //    46: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 35 FD 00 03 07 00 03 07 00 A6 45 07 00 35 43 05 44 07 00 35 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     31     39     Any
        //  31     39     31     39     Any
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
