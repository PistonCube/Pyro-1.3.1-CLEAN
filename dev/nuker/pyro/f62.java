// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import org.jetbrains.annotations.NotNull;

public class f62 extends fH
{
    @NotNull
    public f0f<f60> c;
    
    static {
        throw t;
    }
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f30 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          656
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            648
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            640
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             1244375438
        //    32: goto            37
        //    35: ldc             -1939243931
        //    37: ldc             -1627298304
        //    39: ixor           
        //    40: lookupswitch {
        //          -718614642: 35
        //          325589605: 68
        //          default: 627
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_0        
        //    71: getfield        dev/nuker/pyro/f62.c:Lnet/minecraft/client/Minecraft;
        //    74: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    77: ifnull          616
        //    80: aload_1        
        //    81: goto            85
        //    84: athrow         
        //    85: invokevirtual   dev/nuker/pyro/f30.c:()Ldev/nuker/pyro/f2T;
        //    88: goto            92
        //    91: athrow         
        //    92: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    95: if_acmpne       616
        //    98: aload_1        
        //    99: goto            103
        //   102: athrow         
        //   103: invokevirtual   dev/nuker/pyro/f30.c:()Lnet/minecraft/network/Packet;
        //   106: goto            110
        //   109: athrow         
        //   110: instanceof      Lnet/minecraft/network/play/client/CPacketAnimation;
        //   113: ifeq            121
        //   116: ldc             406157770
        //   118: goto            123
        //   121: ldc             406157771
        //   123: ldc             629857154
        //   125: ixor           
        //   126: tableswitch {
        //          2071938192: 148
        //          2071938193: 616
        //          default: 116
        //        }
        //   148: getstatic       dev/nuker/pyro/fc.1:I
        //   151: ifeq            159
        //   154: ldc             -2115747106
        //   156: goto            161
        //   159: ldc             1347378876
        //   161: ldc             399988248
        //   163: ixor           
        //   164: lookupswitch {
        //          -1775037242: 617
        //          -1244143812: 159
        //          default: 192
        //        }
        //   192: aload_1        
        //   193: getstatic       dev/nuker/pyro/fc.c:I
        //   196: ifge            204
        //   199: ldc             952015255
        //   201: goto            206
        //   204: ldc             -742974380
        //   206: ldc             -512907102
        //   208: ixor           
        //   209: lookupswitch {
        //          -640470731: 629
        //          452322071: 204
        //          default: 236
        //        }
        //   236: goto            240
        //   239: athrow         
        //   240: invokevirtual   dev/nuker/pyro/f30.c:()Lnet/minecraft/network/Packet;
        //   243: goto            247
        //   246: athrow         
        //   247: dup            
        //   248: ifnonnull       256
        //   251: ldc             1745491187
        //   253: goto            258
        //   256: ldc             1745491186
        //   258: ldc             1443171945
        //   260: ixor           
        //   261: tableswitch {
        //          2082354484: 284
        //          2082354485: 356
        //          default: 251
        //        }
        //   284: new             Lkotlin/TypeCastException;
        //   287: dup            
        //   288: ldc             "\u23e0\u1486\u8af3\ub1c4\ucf94\uedeb\ub225\ue6dc\udb77\uefa8\ua73c\u1e0c\ue1f4\uc7b3\u8760\u8970\u57a5\u7704\ubf38\uc65b\u2b08\uc234\u6a5f\u2f49\ud1ca\u3585\u7d66\u89b2\u8215\u8a8c\u84a2\ufb72\u70d4\u981e\u1d82\uf16c\u493c\u887d\uc892\uf924\ub698\u41fe\ub9ef\ub157\u4a67\u8af8\u7c7b\uce36\u7f59\uecc1\ue698\u16d6\uee41\u358b\u40aa\ue1fd\u0a05\u86c8\u1b8a\u0945\u771f\u728c\uc7e1\ub9e5\u9cc9\u6a17\ue2ef\ud023\ua732\u23ce\u89f6\u4f82\u8b53\u1618\ua5c0\u70cf\u55a3\u1c65\u63ff\u1783\u887e\u053b\uf8d2\u2475\u1f0b\ub9ed\u7cf6"
        //   290: goto            294
        //   293: athrow         
        //   294: invokestatic    invokestatic   !!! ERROR
        //   297: goto            301
        //   300: athrow         
        //   301: getstatic       dev/nuker/pyro/fc.c:I
        //   304: ifge            312
        //   307: ldc             -1389945762
        //   309: goto            314
        //   312: ldc             810329099
        //   314: ldc             569478763
        //   316: ixor           
        //   317: lookupswitch {
        //          -1932094923: 312
        //          297609824: 344
        //          default: 625
        //        }
        //   344: goto            348
        //   347: athrow         
        //   348: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   351: goto            355
        //   354: athrow         
        //   355: athrow         
        //   356: checkcast       Lnet/minecraft/network/play/client/CPacketAnimation;
        //   359: astore_2       
        //   360: aload_0        
        //   361: getfield        dev/nuker/pyro/f62.c:Ldev/nuker/pyro/f0f;
        //   364: goto            368
        //   367: athrow         
        //   368: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   371: goto            375
        //   374: athrow         
        //   375: checkcast       Ldev/nuker/pyro/f60;
        //   378: getstatic       dev/nuker/pyro/f61.c:[I
        //   381: swap           
        //   382: getstatic       dev/nuker/pyro/fc.0:I
        //   385: ifeq            393
        //   388: ldc             246966670
        //   390: goto            395
        //   393: ldc             -1694161598
        //   395: ldc             1462270631
        //   397: ixor           
        //   398: lookupswitch {
        //          -869441563: 424
        //          1502614313: 393
        //          default: 619
        //        }
        //   424: goto            428
        //   427: athrow         
        //   428: invokevirtual   dev/nuker/pyro/f60.ordinal:()I
        //   431: goto            435
        //   434: athrow         
        //   435: iaload         
        //   436: tableswitch {
        //                2: 460
        //                3: 519
        //          default: 616
        //        }
        //   460: getstatic       dev/nuker/pyro/fc.1:I
        //   463: ifeq            471
        //   466: ldc             1389581186
        //   468: goto            473
        //   471: ldc             899446288
        //   473: ldc             1089185654
        //   475: ixor           
        //   476: lookupswitch {
        //          305722612: 471
        //          1970786662: 504
        //          default: 621
        //        }
        //   504: aload_1        
        //   505: goto            509
        //   508: athrow         
        //   509: invokevirtual   dev/nuker/pyro/f30.c:()V
        //   512: goto            516
        //   515: athrow         
        //   516: goto            616
        //   519: aload_2        
        //   520: dup            
        //   521: ifnonnull       553
        //   524: new             Lkotlin/TypeCastException;
        //   527: dup            
        //   528: ldc             "\u23e0\u1486\u8af3\ub1c4\ucf94\uedeb\ub225\ue6dc\udb77\uefa8\ua73c\u1e0c\ue1f4\uc7b3\u8760\u8970\u57a5\u7704\ubf38\uc65b\u2b08\uc234\u6a5f\u2f49\ud1ca\u3585\u7d66\u89b2\u8215\u8a8c\u84a2\ufb72\u70d4\u981e\u1d82\uf16c\u493c\u8877\uc892\uf926\ub698\u41fd\ub9f3\ub152\u4a67\u8ae9\u7c27\uce27\u7f46\uecc7\ue6d9\u1696\uee49\u3596\u40a5\ue1fb\u0a19\u868d\u1be7\u0965\u7712\u728e\uc7f3\ub9ae\u9cde\u6a3a\ue2e8\ud02f\ua731\u23db\u89ac\u4fa8\u8b6c\u1617\ua5e2\u70c7\u55a5\u1c74\u63cd\u179e\u8878\u0524"
        //   530: goto            534
        //   533: athrow         
        //   534: invokestatic    invokestatic   !!! ERROR
        //   537: goto            541
        //   540: athrow         
        //   541: goto            545
        //   544: athrow         
        //   545: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   548: goto            552
        //   551: athrow         
        //   552: athrow         
        //   553: checkcast       Ldev/nuker/pyro/mixin/CPacketAnimationAccessor;
        //   556: getstatic       dev/nuker/pyro/fc.c:I
        //   559: ifge            567
        //   562: ldc             -1423699643
        //   564: goto            569
        //   567: ldc             1258064242
        //   569: ldc             -1545209204
        //   571: ixor           
        //   572: lookupswitch {
        //          -384207874: 600
        //          146926537: 567
        //          default: 623
        //        }
        //   600: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //   603: goto            607
        //   606: athrow         
        //   607: invokeinterface dev/nuker/pyro/mixin/CPacketAnimationAccessor.setHand:(Lnet/minecraft/util/EnumHand;)V
        //   612: goto            616
        //   615: athrow         
        //   616: return         
        //   617: aconst_null    
        //   618: athrow         
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
        //   631: pop            
        //   632: goto            24
        //   635: pop            
        //   636: aconst_null    
        //   637: goto            631
        //   640: dup            
        //   641: ifnull          631
        //   644: checkcast       Ljava/lang/Throwable;
        //   647: athrow         
        //   648: dup            
        //   649: ifnull          635
        //   652: checkcast       Ljava/lang/Throwable;
        //   655: athrow         
        //   656: aconst_null    
        //   657: athrow         
        //    StackMapTable: 00 5D 43 07 00 33 04 FF 00 0B 00 00 00 01 07 00 33 FD 00 03 07 00 03 07 00 44 0A 41 01 1E 4F 07 00 33 40 07 00 44 45 07 00 33 40 07 00 49 49 07 00 33 40 07 00 44 45 07 00 33 40 07 00 9F 05 04 41 01 18 0A 41 01 1E 4B 07 00 44 FF 00 01 00 02 07 00 03 07 00 44 00 02 07 00 44 01 5D 07 00 44 42 07 00 33 40 07 00 44 45 07 00 33 40 07 00 9F 43 07 00 9F 44 07 00 9F FF 00 01 00 02 07 00 03 07 00 44 00 02 07 00 9F 01 59 07 00 9F FF 00 08 00 00 00 01 07 00 33 FF 00 00 00 02 07 00 03 07 00 44 00 04 07 00 9F 08 01 1C 08 01 1C 07 00 A1 45 07 00 33 FF 00 00 00 02 07 00 03 07 00 44 00 04 07 00 9F 08 01 1C 08 01 1C 07 00 A1 FF 00 0A 00 02 07 00 03 07 00 44 00 04 07 00 9F 08 01 1C 08 01 1C 07 00 A1 FF 00 01 00 02 07 00 03 07 00 44 00 05 07 00 9F 08 01 1C 08 01 1C 07 00 A1 01 FF 00 1D 00 02 07 00 03 07 00 44 00 04 07 00 9F 08 01 1C 08 01 1C 07 00 A1 42 07 00 22 FF 00 00 00 02 07 00 03 07 00 44 00 04 07 00 9F 08 01 1C 08 01 1C 07 00 A1 45 07 00 33 FF 00 00 00 02 07 00 03 07 00 44 00 02 07 00 9F 07 00 5F 40 07 00 9F FF 00 0A 00 03 07 00 03 07 00 44 07 00 51 00 01 07 00 18 40 07 00 72 45 07 00 33 40 07 00 A3 FF 00 11 00 03 07 00 03 07 00 44 07 00 51 00 02 07 00 A4 07 00 78 FF 00 01 00 03 07 00 03 07 00 44 07 00 51 00 03 07 00 A4 07 00 78 01 FF 00 1C 00 03 07 00 03 07 00 44 07 00 51 00 02 07 00 A4 07 00 78 42 07 00 33 FF 00 00 00 03 07 00 03 07 00 44 07 00 51 00 02 07 00 A4 07 00 78 45 07 00 33 FF 00 00 00 03 07 00 03 07 00 44 07 00 51 00 02 07 00 A4 01 18 0A 41 01 1E 43 07 00 33 40 07 00 44 45 07 00 33 00 02 4D 07 00 26 FF 00 00 00 03 07 00 03 07 00 44 07 00 51 00 04 07 00 51 08 02 0C 08 02 0C 07 00 A1 45 07 00 33 FF 00 00 00 03 07 00 03 07 00 44 07 00 51 00 04 07 00 51 08 02 0C 08 02 0C 07 00 A1 42 07 00 26 FF 00 00 00 03 07 00 03 07 00 44 07 00 51 00 04 07 00 51 08 02 0C 08 02 0C 07 00 A1 45 07 00 33 FF 00 00 00 03 07 00 03 07 00 44 07 00 51 00 02 07 00 51 07 00 5F 40 07 00 51 4D 07 00 90 FF 00 01 00 03 07 00 03 07 00 44 07 00 51 00 02 07 00 90 01 5E 07 00 90 45 07 00 10 FF 00 00 00 03 07 00 03 07 00 44 07 00 51 00 02 07 00 90 07 00 95 47 07 00 33 FA 00 00 00 FF 00 01 00 03 07 00 03 07 00 44 07 00 51 00 02 07 00 A4 07 00 78 01 41 07 00 90 FF 00 01 00 02 07 00 03 07 00 44 00 04 07 00 9F 08 01 1C 08 01 1C 07 00 A1 01 41 07 00 44 41 07 00 33 43 05 44 07 00 33 47 05 47 07 00 33
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     640    648    Ljava/lang/NumberFormatException;
        //  640    648    640    648    Any
        //  656    658    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  84     91     91     92     Any
        //  85     91     84     85     Ljava/lang/ClassCastException;
        //  84     91     84     85     Any
        //  85     91     84     85     Any
        //  84     91     84     85     Ljava/lang/ArithmeticException;
        //  102    109    109    110    Any
        //  103    109    109    110    Ljava/util/ConcurrentModificationException;
        //  103    109    109    110    Any
        //  102    109    102    103    Ljava/lang/EnumConstantNotPresentException;
        //  103    109    102    103    Any
        //  239    246    246    247    Any
        //  240    246    239    240    Any
        //  239    246    3      8      Any
        //  240    246    239    240    Any
        //  239    246    239    240    Any
        //  294    300    300    301    Any
        //  294    300    3      8      Ljava/lang/IllegalArgumentException;
        //  294    300    300    301    Ljava/util/ConcurrentModificationException;
        //  294    300    3      8      Ljava/lang/IllegalStateException;
        //  294    300    3      8      Ljava/lang/IllegalArgumentException;
        //  347    354    354    355    Any
        //  347    354    3      8      Ljava/util/NoSuchElementException;
        //  348    354    347    348    Ljava/lang/IndexOutOfBoundsException;
        //  347    354    3      8      Ljava/lang/NullPointerException;
        //  347    354    3      8      Any
        //  367    374    374    375    Any
        //  368    374    3      8      Ljava/lang/IllegalArgumentException;
        //  368    374    374    375    Any
        //  368    374    374    375    Ljava/lang/RuntimeException;
        //  367    374    367    368    Ljava/util/ConcurrentModificationException;
        //  427    434    434    435    Any
        //  428    434    3      8      Any
        //  428    434    427    428    Ljava/util/NoSuchElementException;
        //  427    434    427    428    Any
        //  428    434    434    435    Ljava/lang/UnsupportedOperationException;
        //  508    515    515    516    Any
        //  509    515    3      8      Ljava/lang/NumberFormatException;
        //  508    515    508    509    Any
        //  509    515    515    516    Any
        //  509    515    508    509    Ljava/lang/StringIndexOutOfBoundsException;
        //  533    540    540    541    Any
        //  534    540    540    541    Ljava/lang/NegativeArraySizeException;
        //  534    540    533    534    Ljava/lang/NumberFormatException;
        //  533    540    533    534    Ljava/lang/ClassCastException;
        //  534    540    540    541    Any
        //  544    551    551    552    Any
        //  545    551    544    545    Ljava/lang/RuntimeException;
        //  545    551    3      8      Ljava/lang/NegativeArraySizeException;
        //  545    551    3      8      Any
        //  545    551    551    552    Ljava/util/NoSuchElementException;
        //  606    615    615    616    Any
        //  606    615    615    616    Ljava/lang/ClassCastException;
        //  606    615    615    616    Any
        //  606    615    606    607    Ljava/lang/NumberFormatException;
        //  606    615    3      8      Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:783)
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
    
    public f62() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u23fd\u1484\u8af6\ub3d7\uc9a2"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u23dd\u1484\u8af6\ub3d7\uc9a2"
        //     8: getstatic       dev/nuker/pyro/fc.1:I
        //    11: ifeq            19
        //    14: ldc             -654845423
        //    16: goto            21
        //    19: ldc             -520456705
        //    21: ldc             -520003601
        //    23: ixor           
        //    24: lookupswitch {
        //          33237520: 52
        //          972457470: 19
        //          default: 230
        //        }
        //    52: invokestatic    invokestatic   !!! ERROR
        //    55: aconst_null    
        //    56: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    59: aload_0        
        //    60: getstatic       dev/nuker/pyro/fc.c:I
        //    63: ifge            71
        //    66: ldc             -905481364
        //    68: goto            73
        //    71: ldc             -26944651
        //    73: ldc             1622371242
        //    75: ixor           
        //    76: lookupswitch {
        //          -1630031649: 104
        //          -1431037754: 71
        //          default: 232
        //        }
        //   104: aload_0        
        //   105: new             Ldev/nuker/pyro/f0f;
        //   108: dup            
        //   109: ldc             "\u23e3\u149c\u8afb\ub3dc"
        //   111: invokestatic    invokestatic   !!! ERROR
        //   114: ldc             "\u23c3\u149c\u8afb\ub3dc"
        //   116: getstatic       dev/nuker/pyro/fc.1:I
        //   119: ifeq            127
        //   122: ldc             583487488
        //   124: goto            129
        //   127: ldc             432483903
        //   129: ldc             -1476813712
        //   131: ixor           
        //   132: lookupswitch {
        //          -2059482000: 234
        //          -140729725: 127
        //          default: 160
        //        }
        //   160: invokestatic    invokestatic   !!! ERROR
        //   163: aconst_null    
        //   164: getstatic       dev/nuker/pyro/f60.c:Ldev/nuker/pyro/f60;
        //   167: checkcast       Ljava/lang/Enum;
        //   170: getstatic       dev/nuker/pyro/fc.c:I
        //   173: ifge            181
        //   176: ldc             -1005880963
        //   178: goto            183
        //   181: ldc             -715813219
        //   183: ldc             106816437
        //   185: ixor           
        //   186: lookupswitch {
        //          -1034511672: 181
        //          -754422488: 212
        //          default: 228
        //        }
        //   212: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   215: checkcast       Ldev/nuker/pyro/f0n;
        //   218: invokevirtual   dev/nuker/pyro/f62.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   221: checkcast       Ldev/nuker/pyro/f0f;
        //   224: putfield        dev/nuker/pyro/f62.c:Ldev/nuker/pyro/f0f;
        //   227: return         
        //   228: aconst_null    
        //   229: athrow         
        //   230: aconst_null    
        //   231: athrow         
        //   232: aconst_null    
        //   233: athrow         
        //   234: aconst_null    
        //   235: athrow         
        //    StackMapTable: 00 10 FF 00 13 00 01 06 00 03 06 07 00 A1 07 00 A1 FF 00 01 00 01 06 00 04 06 07 00 A1 07 00 A1 01 FF 00 1E 00 01 06 00 03 06 07 00 A1 07 00 A1 FF 00 12 00 01 07 00 03 00 01 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5E 07 00 03 FF 00 16 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 69 08 00 69 07 00 A1 07 00 A1 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 69 08 00 69 07 00 A1 07 00 A1 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 69 08 00 69 07 00 A1 07 00 A1 FF 00 14 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 69 08 00 69 07 00 A1 07 00 A1 05 07 00 BD FF 00 01 00 01 07 00 03 00 09 07 00 03 07 00 03 08 00 69 08 00 69 07 00 A1 07 00 A1 05 07 00 BD 01 FF 00 1C 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 69 08 00 69 07 00 A1 07 00 A1 05 07 00 BD FF 00 0F 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 69 08 00 69 07 00 A1 07 00 A1 05 07 00 BD FF 00 01 00 01 06 00 03 06 07 00 A1 07 00 A1 FF 00 01 00 01 07 00 03 00 01 07 00 03 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 69 08 00 69 07 00 A1 07 00 A1
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
    
    @NotNull
    public f0f c() {
        return fbS.h4(this, 669654013);
    }
}
