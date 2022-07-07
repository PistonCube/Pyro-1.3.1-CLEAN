// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.play.server.SPacketChunkData;
import java.util.function.Predicate;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import java.util.function.Consumer;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.Minecraft;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class f5N extends fH
{
    @NotNull
    public f0b c;
    @NotNull
    public List<fbp<Integer, Integer>> c;
    
    public static void c(final f5N p0, final Minecraft p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: iflt            39
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            31
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: aload_1        
        //    18: putfield        dev/nuker/pyro/f5N.c:Lnet/minecraft/client/Minecraft;
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
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 12 FD 00 03 07 00 03 07 00 17 45 07 00 12 43 05 44 07 00 12 47 05
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
    
    static {
        throw t;
    }
    
    @NotNull
    public List c() {
        return fbS.gE(this, 840080853);
    }
    
    public void c(@NotNull final List list) {
        fbS.fz(this, 1298146526, list);
    }
    
    @f06
    @LauncherEventHide
    public void c(@Nullable final f3n p0) {
        public class f5L implements Consumer
        {
            public f5N c;
            
            public f5L(final f5N c) {
                while (true) {
                    int n = 0;
                    Label_0013: {
                        if (fc.c < 0) {
                            n = 1795536026;
                            break Label_0013;
                        }
                        n = -191444843;
                    }
                    switch (n ^ 0x10F0D89F) {
                        case -610988996: {
                            continue;
                        }
                        default: {
                            this.c = c;
                            while (true) {
                                int n2 = 0;
                                Label_0063: {
                                    if (fc.1 != 0) {
                                        n2 = -841852525;
                                        break Label_0063;
                                    }
                                    n2 = -1296389686;
                                }
                                switch (n2 ^ 0x8EF4BAEA) {
                                    case 1126622073: {
                                        continue;
                                    }
                                    case 1011749664: {
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
                        case 2079681541: {
                            throw null;
                        }
                    }
                    break;
                }
            }
            
            @Override
            public void accept(final Object o) {
                fbS.2D(this, 782411933, o);
            }
            
            static {
                throw t;
            }
            
            public void c(@NotNull final fbp p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          2590
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.c:I
                //    12: iflt            2582
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            2574
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: aload_1        
                //    25: pop            
                //    26: aload_1        
                //    27: goto            31
                //    30: athrow         
                //    31: invokevirtual   dev/nuker/pyro/fbp.0:()Ljava/lang/Object;
                //    34: goto            38
                //    37: athrow         
                //    38: checkcast       Ljava/lang/Number;
                //    41: getstatic       dev/nuker/pyro/fc.0:I
                //    44: ifeq            52
                //    47: ldc             -590998298
                //    49: goto            54
                //    52: ldc             -1156778778
                //    54: ldc             2028596822
                //    56: ixor           
                //    57: lookupswitch {
                //          -1540359504: 52
                //          -1008395600: 84
                //          default: 2543
                //        }
                //    84: goto            88
                //    87: athrow         
                //    88: invokevirtual   java/lang/Number.floatValue:()F
                //    91: goto            95
                //    94: athrow         
                //    95: bipush          16
                //    97: i2f            
                //    98: fmul           
                //    99: getstatic       dev/nuker/pyro/fc.0:I
                //   102: ifeq            110
                //   105: ldc             -538688630
                //   107: goto            112
                //   110: ldc             1767663857
                //   112: ldc             -1520776329
                //   114: ixor           
                //   115: lookupswitch {
                //          217607913: 110
                //          2059307261: 2525
                //          default: 140
                //        }
                //   140: fstore_2       
                //   141: getstatic       dev/nuker/pyro/fc.1:I
                //   144: ifeq            152
                //   147: ldc             -691083154
                //   149: goto            154
                //   152: ldc             -1018981962
                //   154: ldc             -91302463
                //   156: ixor           
                //   157: lookupswitch {
                //          742407599: 2555
                //          1282529021: 152
                //          default: 184
                //        }
                //   184: aload_1        
                //   185: goto            189
                //   188: athrow         
                //   189: invokevirtual   dev/nuker/pyro/fbp.c:()Ljava/lang/Object;
                //   192: goto            196
                //   195: athrow         
                //   196: checkcast       Ljava/lang/Number;
                //   199: goto            203
                //   202: athrow         
                //   203: invokevirtual   java/lang/Number.floatValue:()F
                //   206: goto            210
                //   209: athrow         
                //   210: bipush          16
                //   212: i2f            
                //   213: fmul           
                //   214: fstore_3       
                //   215: getstatic       dev/nuker/pyro/fbs.c:Lnet/minecraft/client/renderer/culling/ICamera;
                //   218: getstatic       dev/nuker/pyro/fc.0:I
                //   221: ifeq            229
                //   224: ldc             -964076417
                //   226: goto            231
                //   229: ldc             -1317302283
                //   231: ldc             723028332
                //   233: ixor           
                //   234: lookupswitch {
                //          -309209837: 2493
                //          1114992079: 229
                //          default: 260
                //        }
                //   260: aload_0        
                //   261: getstatic       dev/nuker/pyro/fc.0:I
                //   264: ifeq            272
                //   267: ldc             -883349864
                //   269: goto            274
                //   272: ldc             -290169892
                //   274: ldc             1196856581
                //   276: ixor           
                //   277: lookupswitch {
                //          -1945128035: 2541
                //          737024643: 272
                //          default: 304
                //        }
                //   304: getfield        dev/nuker/pyro/f5L.c:Ldev/nuker/pyro/f5N;
                //   307: goto            311
                //   310: athrow         
                //   311: invokestatic    dev/nuker/pyro/f5N.c:(Ldev/nuker/pyro/f5N;)Lnet/minecraft/client/Minecraft;
                //   314: goto            318
                //   317: athrow         
                //   318: dup            
                //   319: pop            
                //   320: goto            324
                //   323: athrow         
                //   324: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
                //   327: goto            331
                //   330: athrow         
                //   331: dup            
                //   332: ifnonnull       346
                //   335: goto            339
                //   338: athrow         
                //   339: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
                //   342: goto            346
                //   345: athrow         
                //   346: getfield        net/minecraft/entity/Entity.field_70165_t:D
                //   349: aload_0        
                //   350: getfield        dev/nuker/pyro/f5L.c:Ldev/nuker/pyro/f5N;
                //   353: goto            357
                //   356: athrow         
                //   357: invokestatic    dev/nuker/pyro/f5N.c:(Ldev/nuker/pyro/f5N;)Lnet/minecraft/client/Minecraft;
                //   360: goto            364
                //   363: athrow         
                //   364: dup            
                //   365: pop            
                //   366: getstatic       dev/nuker/pyro/fc.0:I
                //   369: ifeq            377
                //   372: ldc             251922763
                //   374: goto            379
                //   377: ldc             1085125360
                //   379: ldc             1007654055
                //   381: ixor           
                //   382: lookupswitch {
                //          856399340: 2509
                //          1766263380: 377
                //          default: 408
                //        }
                //   408: goto            412
                //   411: athrow         
                //   412: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
                //   415: goto            419
                //   418: athrow         
                //   419: dup            
                //   420: ifnonnull       434
                //   423: goto            427
                //   426: athrow         
                //   427: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
                //   430: goto            434
                //   433: athrow         
                //   434: getstatic       dev/nuker/pyro/fc.c:I
                //   437: ifge            445
                //   440: ldc             -1953436813
                //   442: goto            447
                //   445: ldc             -2109748945
                //   447: ldc             117001345
                //   449: ixor           
                //   450: lookupswitch {
                //          -1922455566: 2557
                //          903548194: 445
                //          default: 476
                //        }
                //   476: getfield        net/minecraft/entity/Entity.field_70163_u:D
                //   479: aload_0        
                //   480: getfield        dev/nuker/pyro/f5L.c:Ldev/nuker/pyro/f5N;
                //   483: goto            487
                //   486: athrow         
                //   487: invokestatic    dev/nuker/pyro/f5N.c:(Ldev/nuker/pyro/f5N;)Lnet/minecraft/client/Minecraft;
                //   490: goto            494
                //   493: athrow         
                //   494: dup            
                //   495: pop            
                //   496: goto            500
                //   499: athrow         
                //   500: invokevirtual   net/minecraft/client/Minecraft.func_175606_aa:()Lnet/minecraft/entity/Entity;
                //   503: goto            507
                //   506: athrow         
                //   507: dup            
                //   508: ifnonnull       563
                //   511: getstatic       dev/nuker/pyro/fc.c:I
                //   514: ifge            522
                //   517: ldc             -468794364
                //   519: goto            524
                //   522: ldc             -1172181968
                //   524: ldc             -1524333269
                //   526: ixor           
                //   527: lookupswitch {
                //          1093288239: 2553
                //          1314240130: 522
                //          default: 552
                //        }
                //   552: goto            556
                //   555: athrow         
                //   556: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
                //   559: goto            563
                //   562: athrow         
                //   563: getstatic       dev/nuker/pyro/fc.0:I
                //   566: ifeq            574
                //   569: ldc             1339397342
                //   571: goto            576
                //   574: ldc             1910368114
                //   576: ldc             -2022556635
                //   578: ixor           
                //   579: lookupswitch {
                //          -928536325: 2561
                //          -189178193: 574
                //          default: 604
                //        }
                //   604: getfield        net/minecraft/entity/Entity.field_70161_v:D
                //   607: goto            611
                //   610: athrow         
                //   611: invokeinterface net/minecraft/client/renderer/culling/ICamera.func_78547_a:(DDD)V
                //   616: goto            620
                //   619: athrow         
                //   620: new             Lnet/minecraft/util/math/AxisAlignedBB;
                //   623: dup            
                //   624: fload_2        
                //   625: f2d            
                //   626: aload_0        
                //   627: getfield        dev/nuker/pyro/f5L.c:Ldev/nuker/pyro/f5N;
                //   630: goto            634
                //   633: athrow         
                //   634: invokestatic    dev/nuker/pyro/f5N.c:(Ldev/nuker/pyro/f5N;)Lnet/minecraft/client/Minecraft;
                //   637: goto            641
                //   640: athrow         
                //   641: dup            
                //   642: pop            
                //   643: getstatic       dev/nuker/pyro/fc.0:I
                //   646: ifeq            654
                //   649: ldc             -507279274
                //   651: goto            656
                //   654: ldc             2050323821
                //   656: ldc             -281060165
                //   658: ixor           
                //   659: lookupswitch {
                //          -342574728: 654
                //          251450605: 2517
                //          default: 684
                //        }
                //   684: goto            688
                //   687: athrow         
                //   688: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
                //   691: goto            695
                //   694: athrow         
                //   695: getfield        net/minecraft/client/renderer/entity/RenderManager.field_78730_l:D
                //   698: dsub           
                //   699: iconst_0       
                //   700: i2d            
                //   701: aload_0        
                //   702: getfield        dev/nuker/pyro/f5L.c:Ldev/nuker/pyro/f5N;
                //   705: getstatic       dev/nuker/pyro/fc.c:I
                //   708: ifge            716
                //   711: ldc             -1270229135
                //   713: goto            718
                //   716: ldc             -1673353902
                //   718: ldc             350151234
                //   720: ixor           
                //   721: lookupswitch {
                //          -2003024112: 748
                //          -1600703181: 716
                //          default: 2547
                //        }
                //   748: goto            752
                //   751: athrow         
                //   752: invokestatic    dev/nuker/pyro/f5N.c:(Ldev/nuker/pyro/f5N;)Lnet/minecraft/client/Minecraft;
                //   755: goto            759
                //   758: athrow         
                //   759: dup            
                //   760: pop            
                //   761: goto            765
                //   764: athrow         
                //   765: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
                //   768: goto            772
                //   771: athrow         
                //   772: getfield        net/minecraft/client/renderer/entity/RenderManager.field_78731_m:D
                //   775: dsub           
                //   776: fload_3        
                //   777: f2d            
                //   778: aload_0        
                //   779: getstatic       dev/nuker/pyro/fc.c:I
                //   782: ifge            790
                //   785: ldc             -1899085974
                //   787: goto            792
                //   790: ldc             -1939233341
                //   792: ldc             -439283566
                //   794: ixor           
                //   795: lookupswitch {
                //          1773712721: 820
                //          1797206008: 790
                //          default: 2499
                //        }
                //   820: getfield        dev/nuker/pyro/f5L.c:Ldev/nuker/pyro/f5N;
                //   823: goto            827
                //   826: athrow         
                //   827: invokestatic    dev/nuker/pyro/f5N.c:(Ldev/nuker/pyro/f5N;)Lnet/minecraft/client/Minecraft;
                //   830: goto            834
                //   833: athrow         
                //   834: dup            
                //   835: pop            
                //   836: goto            840
                //   839: athrow         
                //   840: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
                //   843: goto            847
                //   846: athrow         
                //   847: getfield        net/minecraft/client/renderer/entity/RenderManager.field_78728_n:D
                //   850: dsub           
                //   851: fload_2        
                //   852: bipush          16
                //   854: i2f            
                //   855: fadd           
                //   856: f2d            
                //   857: getstatic       dev/nuker/pyro/fc.0:I
                //   860: ifeq            868
                //   863: ldc             1671146276
                //   865: goto            870
                //   868: ldc             149524057
                //   870: ldc             -548388036
                //   872: ixor           
                //   873: lookupswitch {
                //          -1127487464: 2519
                //          -1046816360: 868
                //          default: 900
                //        }
                //   900: aload_0        
                //   901: getfield        dev/nuker/pyro/f5L.c:Ldev/nuker/pyro/f5N;
                //   904: getstatic       dev/nuker/pyro/fc.0:I
                //   907: ifeq            915
                //   910: ldc             2107374079
                //   912: goto            917
                //   915: ldc             -1440361228
                //   917: ldc             -13610092
                //   919: ixor           
                //   920: lookupswitch {
                //          -2102678933: 2521
                //          -1628400611: 915
                //          default: 948
                //        }
                //   948: goto            952
                //   951: athrow         
                //   952: invokestatic    dev/nuker/pyro/f5N.c:(Ldev/nuker/pyro/f5N;)Lnet/minecraft/client/Minecraft;
                //   955: goto            959
                //   958: athrow         
                //   959: dup            
                //   960: pop            
                //   961: goto            965
                //   964: athrow         
                //   965: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
                //   968: goto            972
                //   971: athrow         
                //   972: getstatic       dev/nuker/pyro/fc.1:I
                //   975: ifeq            983
                //   978: ldc             1690667044
                //   980: goto            985
                //   983: ldc             -443625648
                //   985: ldc             575305102
                //   987: ixor           
                //   988: lookupswitch {
                //          1183841706: 2563
                //          1825251680: 983
                //          default: 1016
                //        }
                //  1016: getfield        net/minecraft/client/renderer/entity/RenderManager.field_78730_l:D
                //  1019: dsub           
                //  1020: iconst_1       
                //  1021: i2d            
                //  1022: aload_0        
                //  1023: getfield        dev/nuker/pyro/f5L.c:Ldev/nuker/pyro/f5N;
                //  1026: goto            1030
                //  1029: athrow         
                //  1030: invokestatic    dev/nuker/pyro/f5N.c:(Ldev/nuker/pyro/f5N;)Lnet/minecraft/client/Minecraft;
                //  1033: goto            1037
                //  1036: athrow         
                //  1037: dup            
                //  1038: pop            
                //  1039: getstatic       dev/nuker/pyro/fc.0:I
                //  1042: ifeq            1050
                //  1045: ldc             224309217
                //  1047: goto            1052
                //  1050: ldc             1346222812
                //  1052: ldc             -1768829152
                //  1054: ixor           
                //  1055: lookupswitch {
                //          -1680908095: 1050
                //          -961776132: 1080
                //          default: 2549
                //        }
                //  1080: goto            1084
                //  1083: athrow         
                //  1084: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
                //  1087: goto            1091
                //  1090: athrow         
                //  1091: getfield        net/minecraft/client/renderer/entity/RenderManager.field_78731_m:D
                //  1094: dsub           
                //  1095: fload_3        
                //  1096: bipush          16
                //  1098: i2f            
                //  1099: fadd           
                //  1100: f2d            
                //  1101: getstatic       dev/nuker/pyro/fc.0:I
                //  1104: ifeq            1112
                //  1107: ldc             -1073028890
                //  1109: goto            1114
                //  1112: ldc             1130635188
                //  1114: ldc             781388093
                //  1116: ixor           
                //  1117: lookupswitch {
                //          -291903013: 1112
                //          1844909705: 1144
                //          default: 2545
                //        }
                //  1144: aload_0        
                //  1145: getfield        dev/nuker/pyro/f5L.c:Ldev/nuker/pyro/f5N;
                //  1148: getstatic       dev/nuker/pyro/fc.0:I
                //  1151: ifeq            1159
                //  1154: ldc             1717366385
                //  1156: goto            1161
                //  1159: ldc             -66368381
                //  1161: ldc             449875407
                //  1163: ixor           
                //  1164: lookupswitch {
                //          -1413241993: 1159
                //          2089575358: 2529
                //          default: 1192
                //        }
                //  1192: goto            1196
                //  1195: athrow         
                //  1196: invokestatic    dev/nuker/pyro/f5N.c:(Ldev/nuker/pyro/f5N;)Lnet/minecraft/client/Minecraft;
                //  1199: goto            1203
                //  1202: athrow         
                //  1203: dup            
                //  1204: pop            
                //  1205: getstatic       dev/nuker/pyro/fc.0:I
                //  1208: ifeq            1216
                //  1211: ldc             540705454
                //  1213: goto            1218
                //  1216: ldc             967386246
                //  1218: ldc             996165592
                //  1220: ixor           
                //  1221: lookupswitch {
                //          458933622: 2511
                //          1895970391: 1216
                //          default: 1248
                //        }
                //  1248: goto            1252
                //  1251: athrow         
                //  1252: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
                //  1255: goto            1259
                //  1258: athrow         
                //  1259: getfield        net/minecraft/client/renderer/entity/RenderManager.field_78728_n:D
                //  1262: dsub           
                //  1263: goto            1267
                //  1266: athrow         
                //  1267: invokespecial   net/minecraft/util/math/AxisAlignedBB.<init>:(DDDDDD)V
                //  1270: goto            1274
                //  1273: athrow         
                //  1274: astore          4
                //  1276: new             Lnet/minecraft/util/math/AxisAlignedBB;
                //  1279: dup            
                //  1280: fload_2        
                //  1281: f2d            
                //  1282: dconst_0       
                //  1283: fload_3        
                //  1284: f2d            
                //  1285: fload_2        
                //  1286: bipush          16
                //  1288: i2f            
                //  1289: fadd           
                //  1290: f2d            
                //  1291: dconst_1       
                //  1292: fload_3        
                //  1293: bipush          16
                //  1295: i2f            
                //  1296: fadd           
                //  1297: f2d            
                //  1298: goto            1302
                //  1301: athrow         
                //  1302: invokespecial   net/minecraft/util/math/AxisAlignedBB.<init>:(DDDDDD)V
                //  1305: goto            1309
                //  1308: athrow         
                //  1309: getstatic       dev/nuker/pyro/fc.1:I
                //  1312: ifeq            1320
                //  1315: ldc             215017668
                //  1317: goto            1322
                //  1320: ldc             -1149510244
                //  1322: ldc             -1593921546
                //  1324: ixor           
                //  1325: lookupswitch {
                //          -1406253262: 2535
                //          1597491963: 1320
                //          default: 1352
                //        }
                //  1352: astore          5
                //  1354: getstatic       dev/nuker/pyro/fbs.c:Lnet/minecraft/client/renderer/culling/ICamera;
                //  1357: aload           5
                //  1359: goto            1363
                //  1362: athrow         
                //  1363: invokeinterface net/minecraft/client/renderer/culling/ICamera.func_78546_a:(Lnet/minecraft/util/math/AxisAlignedBB;)Z
                //  1368: goto            1372
                //  1371: athrow         
                //  1372: ifeq            2492
                //  1375: goto            1379
                //  1378: athrow         
                //  1379: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
                //  1382: goto            1386
                //  1385: athrow         
                //  1386: getstatic       dev/nuker/pyro/fc.0:I
                //  1389: ifeq            1397
                //  1392: ldc             -1488283774
                //  1394: goto            1399
                //  1397: ldc             -1835179197
                //  1399: ldc             1984375692
                //  1401: ixor           
                //  1402: lookupswitch {
                //          -787629042: 1397
                //          -455456561: 1428
                //          default: 2513
                //        }
                //  1428: goto            1432
                //  1431: athrow         
                //  1432: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179147_l:()V
                //  1435: goto            1439
                //  1438: athrow         
                //  1439: goto            1443
                //  1442: athrow         
                //  1443: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179097_i:()V
                //  1446: goto            1450
                //  1449: athrow         
                //  1450: sipush          770
                //  1453: sipush          771
                //  1456: iconst_0       
                //  1457: iconst_1       
                //  1458: goto            1462
                //  1461: athrow         
                //  1462: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179120_a:(IIII)V
                //  1465: goto            1469
                //  1468: athrow         
                //  1469: goto            1473
                //  1472: athrow         
                //  1473: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179090_x:()V
                //  1476: goto            1480
                //  1479: athrow         
                //  1480: iconst_0       
                //  1481: goto            1485
                //  1484: athrow         
                //  1485: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179132_a:(Z)V
                //  1488: goto            1492
                //  1491: athrow         
                //  1492: sipush          2848
                //  1495: getstatic       dev/nuker/pyro/fc.0:I
                //  1498: ifeq            1506
                //  1501: ldc             -1450255769
                //  1503: goto            1508
                //  1506: ldc             -1576725199
                //  1508: ldc             534510261
                //  1510: ixor           
                //  1511: lookupswitch {
                //          -1914481217: 1506
                //          -1235935022: 2531
                //          default: 1536
                //        }
                //  1536: goto            1540
                //  1539: athrow         
                //  1540: invokestatic    org/lwjgl/opengl/GL11.glEnable:(I)V
                //  1543: goto            1547
                //  1546: athrow         
                //  1547: sipush          3154
                //  1550: sipush          4354
                //  1553: goto            1557
                //  1556: athrow         
                //  1557: invokestatic    org/lwjgl/opengl/GL11.glHint:(II)V
                //  1560: goto            1564
                //  1563: athrow         
                //  1564: ldc_w           1.5
                //  1567: getstatic       dev/nuker/pyro/fc.c:I
                //  1570: ifge            1579
                //  1573: ldc_w           1335716345
                //  1576: goto            1582
                //  1579: ldc_w           534133668
                //  1582: ldc_w           -146373643
                //  1585: ixor           
                //  1586: lookupswitch {
                //          -1193547252: 2501
                //          -849295988: 1579
                //          default: 1612
                //        }
                //  1612: goto            1616
                //  1615: athrow         
                //  1616: invokestatic    org/lwjgl/opengl/GL11.glLineWidth:(F)V
                //  1619: goto            1623
                //  1622: athrow         
                //  1623: aload           4
                //  1625: getstatic       dev/nuker/pyro/fc.0:I
                //  1628: ifeq            1637
                //  1631: ldc_w           1119072184
                //  1634: goto            1640
                //  1637: ldc_w           -1612884309
                //  1640: ldc_w           -688660520
                //  1643: ixor           
                //  1644: lookupswitch {
                //          -1807716256: 1637
                //          1227786611: 1672
                //          default: 2527
                //        }
                //  1672: getfield        net/minecraft/util/math/AxisAlignedBB.field_72340_a:D
                //  1675: aload           4
                //  1677: getstatic       dev/nuker/pyro/fc.1:I
                //  1680: ifeq            1689
                //  1683: ldc_w           1111117067
                //  1686: goto            1692
                //  1689: ldc_w           974060657
                //  1692: ldc_w           736059387
                //  1695: ixor           
                //  1696: lookupswitch {
                //          -174397140: 1689
                //          1776620272: 2559
                //          default: 1724
                //        }
                //  1724: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
                //  1727: aload           4
                //  1729: getstatic       dev/nuker/pyro/fc.1:I
                //  1732: ifeq            1741
                //  1735: ldc_w           -1157813175
                //  1738: goto            1744
                //  1741: ldc_w           -505407034
                //  1744: ldc_w           1374998473
                //  1747: ixor           
                //  1748: lookupswitch {
                //          -802989401: 1741
                //          -351673472: 2495
                //          default: 1776
                //        }
                //  1776: getfield        net/minecraft/util/math/AxisAlignedBB.field_72339_c:D
                //  1779: aload           4
                //  1781: getstatic       dev/nuker/pyro/fc.1:I
                //  1784: ifeq            1793
                //  1787: ldc_w           -1868917028
                //  1790: goto            1796
                //  1793: ldc_w           1620610805
                //  1796: ldc_w           -1668572806
                //  1799: ixor           
                //  1800: lookupswitch {
                //          -1306733965: 1793
                //          202444710: 2515
                //          default: 1828
                //        }
                //  1828: getfield        net/minecraft/util/math/AxisAlignedBB.field_72336_d:D
                //  1831: aload           4
                //  1833: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
                //  1836: aload           4
                //  1838: getfield        net/minecraft/util/math/AxisAlignedBB.field_72334_f:D
                //  1841: aload_0        
                //  1842: getfield        dev/nuker/pyro/f5L.c:Ldev/nuker/pyro/f5N;
                //  1845: getstatic       dev/nuker/pyro/fc.1:I
                //  1848: ifeq            1857
                //  1851: ldc_w           867772239
                //  1854: goto            1860
                //  1857: ldc_w           1467354436
                //  1860: ldc_w           -95537145
                //  1863: ixor           
                //  1864: lookupswitch {
                //          -1570069641: 1857
                //          -906551480: 2537
                //          default: 1892
                //        }
                //  1892: goto            1896
                //  1895: athrow         
                //  1896: invokevirtual   dev/nuker/pyro/f5N.0:()Ldev/nuker/pyro/f0b;
                //  1899: goto            1903
                //  1902: athrow         
                //  1903: goto            1907
                //  1906: athrow         
                //  1907: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
                //  1910: goto            1914
                //  1913: athrow         
                //  1914: checkcast       Ldev/nuker/pyro/fS;
                //  1917: getstatic       dev/nuker/pyro/fc.1:I
                //  1920: ifeq            1929
                //  1923: ldc_w           -2097741881
                //  1926: goto            1932
                //  1929: ldc_w           -1560740694
                //  1932: ldc_w           -1496153157
                //  1935: ixor           
                //  1936: lookupswitch {
                //          69893905: 1964
                //          606370940: 1929
                //          default: 2539
                //        }
                //  1964: goto            1968
                //  1967: athrow         
                //  1968: invokevirtual   dev/nuker/pyro/fS.8:()F
                //  1971: goto            1975
                //  1974: athrow         
                //  1975: getstatic       dev/nuker/pyro/fc.c:I
                //  1978: ifge            1987
                //  1981: ldc_w           -1659320779
                //  1984: goto            1990
                //  1987: ldc_w           840538185
                //  1990: ldc_w           -1983867196
                //  1993: ixor           
                //  1994: lookupswitch {
                //          -1143402867: 2020
                //          349720817: 1987
                //          default: 2533
                //        }
                //  2020: aload_0        
                //  2021: getfield        dev/nuker/pyro/f5L.c:Ldev/nuker/pyro/f5N;
                //  2024: getstatic       dev/nuker/pyro/fc.c:I
                //  2027: ifge            2036
                //  2030: ldc_w           -412058245
                //  2033: goto            2039
                //  2036: ldc_w           515502517
                //  2039: ldc_w           -309079914
                //  2042: ixor           
                //  2043: lookupswitch {
                //          -215342813: 2068
                //          182693357: 2036
                //          default: 2523
                //        }
                //  2068: goto            2072
                //  2071: athrow         
                //  2072: invokevirtual   dev/nuker/pyro/f5N.0:()Ldev/nuker/pyro/f0b;
                //  2075: goto            2079
                //  2078: athrow         
                //  2079: goto            2083
                //  2082: athrow         
                //  2083: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
                //  2086: goto            2090
                //  2089: athrow         
                //  2090: checkcast       Ldev/nuker/pyro/fS;
                //  2093: goto            2097
                //  2096: athrow         
                //  2097: invokevirtual   dev/nuker/pyro/fS.2:()F
                //  2100: goto            2104
                //  2103: athrow         
                //  2104: aload_0        
                //  2105: getfield        dev/nuker/pyro/f5L.c:Ldev/nuker/pyro/f5N;
                //  2108: getstatic       dev/nuker/pyro/fc.c:I
                //  2111: ifge            2120
                //  2114: ldc_w           868154330
                //  2117: goto            2123
                //  2120: ldc_w           -1344568339
                //  2123: ldc_w           -858595057
                //  2126: ixor           
                //  2127: lookupswitch {
                //          -1743453649: 2120
                //          -9692459: 2503
                //          default: 2152
                //        }
                //  2152: goto            2156
                //  2155: athrow         
                //  2156: invokevirtual   dev/nuker/pyro/f5N.0:()Ldev/nuker/pyro/f0b;
                //  2159: goto            2163
                //  2162: athrow         
                //  2163: getstatic       dev/nuker/pyro/fc.c:I
                //  2166: ifge            2175
                //  2169: ldc_w           -433352448
                //  2172: goto            2178
                //  2175: ldc_w           678653625
                //  2178: ldc_w           -330176504
                //  2181: ixor           
                //  2182: lookupswitch {
                //          -1004370255: 2208
                //          175798536: 2175
                //          default: 2505
                //        }
                //  2208: goto            2212
                //  2211: athrow         
                //  2212: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
                //  2215: goto            2219
                //  2218: athrow         
                //  2219: checkcast       Ldev/nuker/pyro/fS;
                //  2222: goto            2226
                //  2225: athrow         
                //  2226: invokevirtual   dev/nuker/pyro/fS.b:()F
                //  2229: goto            2233
                //  2232: athrow         
                //  2233: aload_0        
                //  2234: getstatic       dev/nuker/pyro/fc.1:I
                //  2237: ifeq            2246
                //  2240: ldc_w           105733290
                //  2243: goto            2249
                //  2246: ldc_w           -406273825
                //  2249: ldc_w           -2103087606
                //  2252: ixor           
                //  2253: lookupswitch {
                //          -2065157472: 2497
                //          914917233: 2246
                //          default: 2280
                //        }
                //  2280: getfield        dev/nuker/pyro/f5L.c:Ldev/nuker/pyro/f5N;
                //  2283: goto            2287
                //  2286: athrow         
                //  2287: invokevirtual   dev/nuker/pyro/f5N.0:()Ldev/nuker/pyro/f0b;
                //  2290: goto            2294
                //  2293: athrow         
                //  2294: goto            2298
                //  2297: athrow         
                //  2298: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
                //  2301: goto            2305
                //  2304: athrow         
                //  2305: checkcast       Ldev/nuker/pyro/fS;
                //  2308: goto            2312
                //  2311: athrow         
                //  2312: invokevirtual   dev/nuker/pyro/fS.9:()F
                //  2315: goto            2319
                //  2318: athrow         
                //  2319: goto            2323
                //  2322: athrow         
                //  2323: invokestatic    net/minecraft/client/renderer/RenderGlobal.func_189695_b:(DDDDDDFFFF)V
                //  2326: goto            2330
                //  2329: athrow         
                //  2330: sipush          2848
                //  2333: goto            2337
                //  2336: athrow         
                //  2337: invokestatic    org/lwjgl/opengl/GL11.glDisable:(I)V
                //  2340: goto            2344
                //  2343: athrow         
                //  2344: iconst_1       
                //  2345: getstatic       dev/nuker/pyro/fc.c:I
                //  2348: ifge            2357
                //  2351: ldc_w           1184364323
                //  2354: goto            2360
                //  2357: ldc_w           2076032417
                //  2360: ldc_w           -63569579
                //  2363: ixor           
                //  2364: lookupswitch {
                //          -1256795524: 2357
                //          -1163790730: 2551
                //          default: 2392
                //        }
                //  2392: goto            2396
                //  2395: athrow         
                //  2396: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179132_a:(Z)V
                //  2399: goto            2403
                //  2402: athrow         
                //  2403: getstatic       dev/nuker/pyro/fc.c:I
                //  2406: ifge            2415
                //  2409: ldc_w           1218417744
                //  2412: goto            2418
                //  2415: ldc_w           1878439502
                //  2418: ldc_w           406338447
                //  2421: ixor           
                //  2422: lookupswitch {
                //          -748049632: 2415
                //          1353166815: 2507
                //          default: 2448
                //        }
                //  2448: goto            2452
                //  2451: athrow         
                //  2452: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179126_j:()V
                //  2455: goto            2459
                //  2458: athrow         
                //  2459: goto            2463
                //  2462: athrow         
                //  2463: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179098_w:()V
                //  2466: goto            2470
                //  2469: athrow         
                //  2470: goto            2474
                //  2473: athrow         
                //  2474: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179084_k:()V
                //  2477: goto            2481
                //  2480: athrow         
                //  2481: goto            2485
                //  2484: athrow         
                //  2485: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
                //  2488: goto            2492
                //  2491: athrow         
                //  2492: return         
                //  2493: aconst_null    
                //  2494: athrow         
                //  2495: aconst_null    
                //  2496: athrow         
                //  2497: aconst_null    
                //  2498: athrow         
                //  2499: aconst_null    
                //  2500: athrow         
                //  2501: aconst_null    
                //  2502: athrow         
                //  2503: aconst_null    
                //  2504: athrow         
                //  2505: aconst_null    
                //  2506: athrow         
                //  2507: aconst_null    
                //  2508: athrow         
                //  2509: aconst_null    
                //  2510: athrow         
                //  2511: aconst_null    
                //  2512: athrow         
                //  2513: aconst_null    
                //  2514: athrow         
                //  2515: aconst_null    
                //  2516: athrow         
                //  2517: aconst_null    
                //  2518: athrow         
                //  2519: aconst_null    
                //  2520: athrow         
                //  2521: aconst_null    
                //  2522: athrow         
                //  2523: aconst_null    
                //  2524: athrow         
                //  2525: aconst_null    
                //  2526: athrow         
                //  2527: aconst_null    
                //  2528: athrow         
                //  2529: aconst_null    
                //  2530: athrow         
                //  2531: aconst_null    
                //  2532: athrow         
                //  2533: aconst_null    
                //  2534: athrow         
                //  2535: aconst_null    
                //  2536: athrow         
                //  2537: aconst_null    
                //  2538: athrow         
                //  2539: aconst_null    
                //  2540: athrow         
                //  2541: aconst_null    
                //  2542: athrow         
                //  2543: aconst_null    
                //  2544: athrow         
                //  2545: aconst_null    
                //  2546: athrow         
                //  2547: aconst_null    
                //  2548: athrow         
                //  2549: aconst_null    
                //  2550: athrow         
                //  2551: aconst_null    
                //  2552: athrow         
                //  2553: aconst_null    
                //  2554: athrow         
                //  2555: aconst_null    
                //  2556: athrow         
                //  2557: aconst_null    
                //  2558: athrow         
                //  2559: aconst_null    
                //  2560: athrow         
                //  2561: aconst_null    
                //  2562: athrow         
                //  2563: aconst_null    
                //  2564: athrow         
                //  2565: pop            
                //  2566: goto            24
                //  2569: pop            
                //  2570: aconst_null    
                //  2571: goto            2565
                //  2574: dup            
                //  2575: ifnull          2565
                //  2578: checkcast       Ljava/lang/Throwable;
                //  2581: athrow         
                //  2582: dup            
                //  2583: ifnull          2569
                //  2586: checkcast       Ljava/lang/Throwable;
                //  2589: athrow         
                //  2590: aconst_null    
                //  2591: athrow         
                //    StackMapTable: 01 7D 43 07 00 51 04 FF 00 0B 00 00 00 01 07 00 51 FD 00 03 07 00 03 07 00 53 45 07 00 33 40 07 00 53 45 07 00 51 40 07 00 05 4D 07 00 59 FF 00 01 00 02 07 00 03 07 00 53 00 02 07 00 59 01 5D 07 00 59 FF 00 02 00 00 00 01 07 00 51 FF 00 00 00 02 07 00 03 07 00 53 00 01 07 00 59 45 07 00 51 40 02 4E 02 FF 00 01 00 02 07 00 03 07 00 53 00 02 02 01 5B 02 FC 00 0B 02 41 01 1D 43 07 00 51 40 07 00 53 45 07 00 51 40 07 00 05 FF 00 05 00 00 00 01 07 00 51 FF 00 00 00 03 07 00 03 07 00 53 02 00 01 07 00 59 45 07 00 51 40 02 FF 00 12 00 04 07 00 03 07 00 53 02 02 00 01 07 00 9D FF 00 01 00 04 07 00 03 07 00 53 02 02 00 02 07 00 9D 01 5C 07 00 9D FF 00 0B 00 04 07 00 03 07 00 53 02 02 00 02 07 00 9D 07 00 03 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 03 07 00 9D 07 00 03 01 FF 00 1D 00 04 07 00 03 07 00 53 02 02 00 02 07 00 9D 07 00 03 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 02 07 00 9D 07 00 09 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 02 07 00 9D 07 00 7A FF 00 04 00 00 00 01 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 02 07 00 9D 07 00 7A 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 02 07 00 9D 07 00 85 FF 00 06 00 00 00 01 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 02 07 00 9D 07 00 85 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 02 07 00 9D 07 00 85 49 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 03 07 00 9D 03 07 00 09 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 03 07 00 9D 03 07 00 7A FF 00 0C 00 04 07 00 03 07 00 53 02 02 00 03 07 00 9D 03 07 00 7A FF 00 01 00 04 07 00 03 07 00 53 02 02 00 04 07 00 9D 03 07 00 7A 01 FF 00 1C 00 04 07 00 03 07 00 53 02 02 00 03 07 00 9D 03 07 00 7A 42 07 00 31 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 03 07 00 9D 03 07 00 7A 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 03 07 00 9D 03 07 00 85 FF 00 06 00 00 00 01 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 03 07 00 9D 03 07 00 85 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 03 07 00 9D 03 07 00 85 FF 00 0A 00 04 07 00 03 07 00 53 02 02 00 03 07 00 9D 03 07 00 85 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 04 07 00 9D 03 07 00 85 01 FF 00 1C 00 04 07 00 03 07 00 53 02 02 00 03 07 00 9D 03 07 00 85 49 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 04 07 00 9D 03 03 07 00 09 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 04 07 00 9D 03 03 07 00 7A FF 00 04 00 00 00 01 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 04 07 00 9D 03 03 07 00 7A 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 04 07 00 9D 03 03 07 00 85 FF 00 0E 00 04 07 00 03 07 00 53 02 02 00 04 07 00 9D 03 03 07 00 85 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 05 07 00 9D 03 03 07 00 85 01 FF 00 1B 00 04 07 00 03 07 00 53 02 02 00 04 07 00 9D 03 03 07 00 85 FF 00 02 00 00 00 01 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 04 07 00 9D 03 03 07 00 85 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 04 07 00 9D 03 03 07 00 85 FF 00 0A 00 04 07 00 03 07 00 53 02 02 00 04 07 00 9D 03 03 07 00 85 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 05 07 00 9D 03 03 07 00 85 01 FF 00 1B 00 04 07 00 03 07 00 53 02 02 00 04 07 00 9D 03 03 07 00 85 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 04 07 00 9D 03 03 03 47 07 00 51 00 4C 07 00 49 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 04 08 02 6C 08 02 6C 03 07 00 09 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 04 08 02 6C 08 02 6C 03 07 00 7A FF 00 0C 00 04 07 00 03 07 00 53 02 02 00 04 08 02 6C 08 02 6C 03 07 00 7A FF 00 01 00 04 07 00 03 07 00 53 02 02 00 05 08 02 6C 08 02 6C 03 07 00 7A 01 FF 00 1B 00 04 07 00 03 07 00 53 02 02 00 04 08 02 6C 08 02 6C 03 07 00 7A 42 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 04 08 02 6C 08 02 6C 03 07 00 7A 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 04 08 02 6C 08 02 6C 03 07 00 AC FF 00 14 00 04 07 00 03 07 00 53 02 02 00 05 08 02 6C 08 02 6C 03 03 07 00 09 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 06 08 02 6C 08 02 6C 03 03 07 00 09 01 FF 00 1D 00 04 07 00 03 07 00 53 02 02 00 05 08 02 6C 08 02 6C 03 03 07 00 09 42 07 00 31 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 05 08 02 6C 08 02 6C 03 03 07 00 09 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 05 08 02 6C 08 02 6C 03 03 07 00 7A 44 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 05 08 02 6C 08 02 6C 03 03 07 00 7A 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 05 08 02 6C 08 02 6C 03 03 07 00 AC FF 00 11 00 04 07 00 03 07 00 53 02 02 00 06 08 02 6C 08 02 6C 03 03 03 07 00 03 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 07 08 02 6C 08 02 6C 03 03 03 07 00 03 01 FF 00 1B 00 04 07 00 03 07 00 53 02 02 00 06 08 02 6C 08 02 6C 03 03 03 07 00 03 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 06 08 02 6C 08 02 6C 03 03 03 07 00 09 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 06 08 02 6C 08 02 6C 03 03 03 07 00 7A FF 00 04 00 00 00 01 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 06 08 02 6C 08 02 6C 03 03 03 07 00 7A 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 06 08 02 6C 08 02 6C 03 03 03 07 00 AC FF 00 14 00 04 07 00 03 07 00 53 02 02 00 06 08 02 6C 08 02 6C 03 03 03 03 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 07 08 02 6C 08 02 6C 03 03 03 03 01 FF 00 1D 00 04 07 00 03 07 00 53 02 02 00 06 08 02 6C 08 02 6C 03 03 03 03 FF 00 0E 00 04 07 00 03 07 00 53 02 02 00 07 08 02 6C 08 02 6C 03 03 03 03 07 00 09 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 08 08 02 6C 08 02 6C 03 03 03 03 07 00 09 01 FF 00 1E 00 04 07 00 03 07 00 53 02 02 00 07 08 02 6C 08 02 6C 03 03 03 03 07 00 09 42 07 00 49 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 07 08 02 6C 08 02 6C 03 03 03 03 07 00 09 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 07 08 02 6C 08 02 6C 03 03 03 03 07 00 7A 44 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 07 08 02 6C 08 02 6C 03 03 03 03 07 00 7A 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 07 08 02 6C 08 02 6C 03 03 03 03 07 00 AC FF 00 0A 00 04 07 00 03 07 00 53 02 02 00 07 08 02 6C 08 02 6C 03 03 03 03 07 00 AC FF 00 01 00 04 07 00 03 07 00 53 02 02 00 08 08 02 6C 08 02 6C 03 03 03 03 07 00 AC 01 FF 00 1E 00 04 07 00 03 07 00 53 02 02 00 07 08 02 6C 08 02 6C 03 03 03 03 07 00 AC FF 00 0C 00 00 00 01 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 08 08 02 6C 08 02 6C 03 03 03 03 03 07 00 09 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 08 08 02 6C 08 02 6C 03 03 03 03 03 07 00 7A FF 00 0C 00 04 07 00 03 07 00 53 02 02 00 08 08 02 6C 08 02 6C 03 03 03 03 03 07 00 7A FF 00 01 00 04 07 00 03 07 00 53 02 02 00 09 08 02 6C 08 02 6C 03 03 03 03 03 07 00 7A 01 FF 00 1B 00 04 07 00 03 07 00 53 02 02 00 08 08 02 6C 08 02 6C 03 03 03 03 03 07 00 7A FF 00 02 00 00 00 01 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 08 08 02 6C 08 02 6C 03 03 03 03 03 07 00 7A 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 08 08 02 6C 08 02 6C 03 03 03 03 03 07 00 AC FF 00 14 00 04 07 00 03 07 00 53 02 02 00 08 08 02 6C 08 02 6C 03 03 03 03 03 03 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 09 08 02 6C 08 02 6C 03 03 03 03 03 03 01 FF 00 1D 00 04 07 00 03 07 00 53 02 02 00 08 08 02 6C 08 02 6C 03 03 03 03 03 03 FF 00 0E 00 04 07 00 03 07 00 53 02 02 00 09 08 02 6C 08 02 6C 03 03 03 03 03 03 07 00 09 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 0A 08 02 6C 08 02 6C 03 03 03 03 03 03 07 00 09 01 FF 00 1E 00 04 07 00 03 07 00 53 02 02 00 09 08 02 6C 08 02 6C 03 03 03 03 03 03 07 00 09 42 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 09 08 02 6C 08 02 6C 03 03 03 03 03 03 07 00 09 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 09 08 02 6C 08 02 6C 03 03 03 03 03 03 07 00 7A FF 00 0C 00 04 07 00 03 07 00 53 02 02 00 09 08 02 6C 08 02 6C 03 03 03 03 03 03 07 00 7A FF 00 01 00 04 07 00 03 07 00 53 02 02 00 0A 08 02 6C 08 02 6C 03 03 03 03 03 03 07 00 7A 01 FF 00 1D 00 04 07 00 03 07 00 53 02 02 00 09 08 02 6C 08 02 6C 03 03 03 03 03 03 07 00 7A 42 07 00 3B FF 00 00 00 04 07 00 03 07 00 53 02 02 00 09 08 02 6C 08 02 6C 03 03 03 03 03 03 07 00 7A 45 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 09 08 02 6C 08 02 6C 03 03 03 03 03 03 07 00 AC 46 07 00 51 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 08 08 02 6C 08 02 6C 03 03 03 03 03 03 45 07 00 51 40 07 00 A3 FF 00 1A 00 05 07 00 03 07 00 53 02 02 07 00 A3 00 01 07 00 49 FF 00 00 00 05 07 00 03 07 00 53 02 02 07 00 A3 00 08 08 04 FC 08 04 FC 03 03 03 03 03 03 45 07 00 51 40 07 00 A3 4A 07 00 A3 FF 00 01 00 05 07 00 03 07 00 53 02 02 07 00 A3 00 02 07 00 A3 01 5D 07 00 A3 FF 00 09 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 01 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 02 07 00 9D 07 00 A3 47 07 00 51 40 01 FF 00 05 00 00 00 01 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 00 45 07 00 51 00 0A 41 01 1C 42 07 00 51 00 45 07 00 51 00 42 07 00 51 00 45 07 00 51 00 4A 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 04 01 01 01 01 45 07 00 51 00 42 07 00 43 00 45 07 00 51 00 43 07 00 51 40 01 45 07 00 51 00 4D 01 FF 00 01 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 02 01 01 5B 01 FF 00 02 00 00 00 01 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 01 01 45 07 00 51 00 FF 00 08 00 00 00 01 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 02 01 01 45 07 00 51 00 4E 02 FF 00 02 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 02 02 01 5D 02 42 07 00 51 40 02 45 07 00 51 00 4D 07 00 A3 FF 00 02 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 02 07 00 A3 01 5F 07 00 A3 FF 00 10 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 02 03 07 00 A3 FF 00 02 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 03 03 07 00 A3 01 FF 00 1F 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 02 03 07 00 A3 FF 00 10 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 03 03 03 07 00 A3 FF 00 02 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 04 03 03 07 00 A3 01 FF 00 1F 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 03 03 03 07 00 A3 FF 00 10 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 04 03 03 03 07 00 A3 FF 00 02 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 05 03 03 03 07 00 A3 01 FF 00 1F 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 04 03 03 03 07 00 A3 FF 00 1C 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 07 03 03 03 03 03 03 07 00 09 FF 00 02 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 08 03 03 03 03 03 03 07 00 09 01 FF 00 1F 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 07 03 03 03 03 03 03 07 00 09 42 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 07 03 03 03 03 03 03 07 00 09 45 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 07 03 03 03 03 03 03 07 01 2B 42 07 00 49 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 07 03 03 03 03 03 03 07 01 2B 45 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 07 03 03 03 03 03 03 07 00 05 FF 00 0E 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 07 03 03 03 03 03 03 07 01 30 FF 00 02 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 08 03 03 03 03 03 03 07 01 30 01 FF 00 1F 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 07 03 03 03 03 03 03 07 01 30 42 07 00 4F FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 07 03 03 03 03 03 03 07 01 30 45 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 07 03 03 03 03 03 03 02 FF 00 0B 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 07 03 03 03 03 03 03 02 FF 00 02 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 08 03 03 03 03 03 03 02 01 FF 00 1D 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 07 03 03 03 03 03 03 02 FF 00 0F 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 08 03 03 03 03 03 03 02 07 00 09 FF 00 02 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 09 03 03 03 03 03 03 02 07 00 09 01 FF 00 1C 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 08 03 03 03 03 03 03 02 07 00 09 42 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 08 03 03 03 03 03 03 02 07 00 09 45 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 08 03 03 03 03 03 03 02 07 01 2B FF 00 02 00 00 00 01 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 08 03 03 03 03 03 03 02 07 01 2B 45 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 08 03 03 03 03 03 03 02 07 00 05 45 07 00 45 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 08 03 03 03 03 03 03 02 07 01 30 45 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 08 03 03 03 03 03 03 02 02 FF 00 0F 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 09 03 03 03 03 03 03 02 02 07 00 09 FF 00 02 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 0A 03 03 03 03 03 03 02 02 07 00 09 01 FF 00 1C 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 09 03 03 03 03 03 03 02 02 07 00 09 42 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 09 03 03 03 03 03 03 02 02 07 00 09 45 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 09 03 03 03 03 03 03 02 02 07 01 2B FF 00 0B 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 09 03 03 03 03 03 03 02 02 07 01 2B FF 00 02 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 0A 03 03 03 03 03 03 02 02 07 01 2B 01 FF 00 1D 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 09 03 03 03 03 03 03 02 02 07 01 2B 42 07 00 37 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 09 03 03 03 03 03 03 02 02 07 01 2B 45 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 09 03 03 03 03 03 03 02 02 07 00 05 45 07 00 49 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 09 03 03 03 03 03 03 02 02 07 01 30 45 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 09 03 03 03 03 03 03 02 02 02 FF 00 0C 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 0A 03 03 03 03 03 03 02 02 02 07 00 03 FF 00 02 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 0B 03 03 03 03 03 03 02 02 02 07 00 03 01 FF 00 1E 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 0A 03 03 03 03 03 03 02 02 02 07 00 03 45 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 0A 03 03 03 03 03 03 02 02 02 07 00 09 45 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 0A 03 03 03 03 03 03 02 02 02 07 01 2B 42 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 0A 03 03 03 03 03 03 02 02 02 07 01 2B 45 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 0A 03 03 03 03 03 03 02 02 02 07 00 05 45 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 0A 03 03 03 03 03 03 02 02 02 07 01 30 45 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 0A 03 03 03 03 03 03 02 02 02 02 FF 00 02 00 00 00 01 07 00 51 FF 00 00 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 0A 03 03 03 03 03 03 02 02 02 02 45 07 00 51 00 45 07 00 39 40 01 45 07 00 51 00 4C 01 FF 00 02 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 02 01 01 5F 01 42 07 00 3D 40 01 45 07 00 51 00 0B 42 01 1D 42 07 00 51 00 45 07 00 51 00 42 07 00 51 00 45 07 00 51 00 42 07 00 51 00 45 07 00 51 00 42 07 00 51 00 45 07 00 51 00 FF 00 00 00 04 07 00 03 07 00 53 02 02 00 01 07 00 9D FF 00 01 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 03 03 03 07 00 A3 FF 00 01 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 0A 03 03 03 03 03 03 02 02 02 07 00 03 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 06 08 02 6C 08 02 6C 03 03 03 07 00 03 FF 00 01 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 01 02 FF 00 01 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 09 03 03 03 03 03 03 02 02 07 00 09 FF 00 01 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 09 03 03 03 03 03 03 02 02 07 01 2B 01 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 03 07 00 9D 03 07 00 7A FF 00 01 00 04 07 00 03 07 00 53 02 02 00 09 08 02 6C 08 02 6C 03 03 03 03 03 03 07 00 7A FD 00 01 07 00 A3 07 00 A3 FF 00 01 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 04 03 03 03 07 00 A3 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 04 08 02 6C 08 02 6C 03 07 00 7A FF 00 01 00 04 07 00 03 07 00 53 02 02 00 06 08 02 6C 08 02 6C 03 03 03 03 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 07 08 02 6C 08 02 6C 03 03 03 03 07 00 09 FF 00 01 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 08 03 03 03 03 03 03 02 07 00 09 FF 00 01 00 02 07 00 03 07 00 53 00 01 02 FF 00 01 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 01 07 00 A3 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 09 08 02 6C 08 02 6C 03 03 03 03 03 03 07 00 09 FF 00 01 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 01 01 FF 00 01 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 07 03 03 03 03 03 03 02 FF 00 01 00 05 07 00 03 07 00 53 02 02 07 00 A3 00 01 07 00 A3 FF 00 01 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 07 03 03 03 03 03 03 07 00 09 FF 00 01 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 07 03 03 03 03 03 03 07 01 30 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 02 07 00 9D 07 00 03 FF 00 01 00 02 07 00 03 07 00 53 00 01 07 00 59 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 08 08 02 6C 08 02 6C 03 03 03 03 03 03 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 05 08 02 6C 08 02 6C 03 03 07 00 09 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 08 08 02 6C 08 02 6C 03 03 03 03 03 07 00 7A FF 00 01 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 01 01 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 04 07 00 9D 03 03 07 00 85 FA 00 01 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 03 07 00 9D 03 07 00 85 FF 00 01 00 06 07 00 03 07 00 53 02 02 07 00 A3 07 00 A3 00 02 03 07 00 A3 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 04 07 00 9D 03 03 07 00 85 FF 00 01 00 04 07 00 03 07 00 53 02 02 00 07 08 02 6C 08 02 6C 03 03 03 03 07 00 AC FF 00 01 00 02 07 00 03 07 00 53 00 01 07 00 51 43 05 44 07 00 51 47 05 47 07 00 51
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                       
                //  -----  -----  -----  -----  -------------------------------------------
                //  8      20     2574   2582   Any
                //  2574   2582   2574   2582   Any
                //  2590   2592   3      8      Ljava/lang/EnumConstantNotPresentException;
                //  30     37     37     38     Any
                //  31     37     30     31     Ljava/lang/IndexOutOfBoundsException;
                //  30     37     3      8      Any
                //  30     37     3      8      Any
                //  30     37     37     38     Any
                //  88     94     94     95     Any
                //  88     94     3      8      Ljava/util/ConcurrentModificationException;
                //  88     94     94     95     Ljava/lang/NumberFormatException;
                //  88     94     3      8      Ljava/util/ConcurrentModificationException;
                //  88     94     3      8      Any
                //  188    195    195    196    Any
                //  188    195    188    189    Ljava/lang/ArrayIndexOutOfBoundsException;
                //  189    195    3      8      Ljava/lang/StringIndexOutOfBoundsException;
                //  188    195    188    189    Any
                //  188    195    188    189    Any
                //  203    209    209    210    Any
                //  203    209    3      8      Any
                //  203    209    3      8      Any
                //  203    209    209    210    Ljava/lang/UnsupportedOperationException;
                //  203    209    209    210    Ljava/lang/IllegalStateException;
                //  310    317    317    318    Any
                //  311    317    3      8      Ljava/lang/NullPointerException;
                //  310    317    317    318    Ljava/lang/ArrayIndexOutOfBoundsException;
                //  310    317    310    311    Any
                //  311    317    3      8      Any
                //  324    330    330    331    Any
                //  324    330    3      8      Ljava/lang/ArithmeticException;
                //  324    330    3      8      Any
                //  324    330    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
                //  324    330    330    331    Ljava/util/NoSuchElementException;
                //  339    345    345    346    Any
                //  339    345    345    346    Any
                //  339    345    345    346    Any
                //  339    345    3      8      Ljava/lang/ArithmeticException;
                //  339    345    345    346    Ljava/lang/NegativeArraySizeException;
                //  356    363    363    364    Any
                //  357    363    363    364    Any
                //  357    363    363    364    Ljava/lang/EnumConstantNotPresentException;
                //  356    363    3      8      Any
                //  356    363    356    357    Any
                //  411    418    418    419    Any
                //  411    418    418    419    Ljava/lang/ArithmeticException;
                //  412    418    411    412    Ljava/lang/EnumConstantNotPresentException;
                //  411    418    3      8      Any
                //  412    418    3      8      Ljava/lang/StringIndexOutOfBoundsException;
                //  427    433    433    434    Any
                //  427    433    433    434    Any
                //  427    433    433    434    Ljava/lang/RuntimeException;
                //  427    433    3      8      Any
                //  427    433    433    434    Any
                //  486    493    493    494    Any
                //  487    493    486    487    Any
                //  487    493    3      8      Ljava/lang/UnsupportedOperationException;
                //  486    493    493    494    Any
                //  486    493    3      8      Any
                //  500    506    506    507    Any
                //  500    506    3      8      Any
                //  500    506    3      8      Any
                //  500    506    506    507    Any
                //  500    506    506    507    Ljava/lang/ClassCastException;
                //  556    562    562    563    Any
                //  556    562    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
                //  556    562    3      8      Ljava/lang/IllegalArgumentException;
                //  556    562    562    563    Any
                //  556    562    562    563    Ljava/lang/ClassCastException;
                //  610    619    619    620    Any
                //  611    619    610    611    Ljava/lang/NegativeArraySizeException;
                //  611    619    610    611    Ljava/lang/UnsupportedOperationException;
                //  610    619    3      8      Ljava/lang/AssertionError;
                //  611    619    610    611    Any
                //  633    640    640    641    Any
                //  634    640    3      8      Any
                //  634    640    633    634    Ljava/lang/RuntimeException;
                //  633    640    3      8      Ljava/lang/ArithmeticException;
                //  634    640    640    641    Any
                //  687    694    694    695    Any
                //  687    694    694    695    Any
                //  687    694    694    695    Ljava/lang/EnumConstantNotPresentException;
                //  688    694    694    695    Any
                //  688    694    687    688    Any
                //  751    758    758    759    Any
                //  751    758    3      8      Any
                //  752    758    3      8      Ljava/lang/IndexOutOfBoundsException;
                //  751    758    751    752    Ljava/lang/EnumConstantNotPresentException;
                //  751    758    3      8      Any
                //  764    771    771    772    Any
                //  765    771    771    772    Any
                //  765    771    764    765    Any
                //  764    771    764    765    Any
                //  765    771    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
                //  826    833    833    834    Any
                //  826    833    826    827    Ljava/lang/ArrayIndexOutOfBoundsException;
                //  826    833    826    827    Any
                //  827    833    826    827    Any
                //  826    833    826    827    Any
                //  840    846    846    847    Any
                //  840    846    3      8      Any
                //  840    846    3      8      Ljava/lang/IllegalArgumentException;
                //  840    846    3      8      Any
                //  840    846    3      8      Any
                //  951    958    958    959    Any
                //  951    958    951    952    Ljava/util/NoSuchElementException;
                //  952    958    3      8      Ljava/lang/IndexOutOfBoundsException;
                //  951    958    951    952    Ljava/lang/NegativeArraySizeException;
                //  952    958    3      8      Any
                //  964    971    971    972    Any
                //  965    971    964    965    Ljava/lang/IllegalStateException;
                //  965    971    3      8      Any
                //  964    971    971    972    Ljava/lang/RuntimeException;
                //  965    971    964    965    Any
                //  1030   1036   1036   1037   Any
                //  1030   1036   3      8      Any
                //  1030   1036   3      8      Any
                //  1030   1036   1036   1037   Any
                //  1030   1036   3      8      Any
                //  1084   1090   1090   1091   Any
                //  1084   1090   3      8      Ljava/lang/EnumConstantNotPresentException;
                //  1084   1090   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
                //  1084   1090   3      8      Any
                //  1084   1090   1090   1091   Ljava/lang/ClassCastException;
                //  1195   1202   1202   1203   Any
                //  1196   1202   1195   1196   Ljava/lang/RuntimeException;
                //  1195   1202   1202   1203   Ljava/lang/NegativeArraySizeException;
                //  1196   1202   1195   1196   Any
                //  1195   1202   3      8      Ljava/lang/ClassCastException;
                //  1251   1258   1258   1259   Any
                //  1251   1258   1258   1259   Ljava/lang/AssertionError;
                //  1251   1258   3      8      Any
                //  1251   1258   1258   1259   Ljava/lang/ArithmeticException;
                //  1252   1258   1251   1252   Ljava/lang/StringIndexOutOfBoundsException;
                //  1266   1273   1273   1274   Any
                //  1266   1273   3      8      Any
                //  1267   1273   1266   1267   Any
                //  1267   1273   1273   1274   Any
                //  1266   1273   3      8      Ljava/lang/AssertionError;
                //  1301   1308   1308   1309   Any
                //  1302   1308   3      8      Ljava/util/ConcurrentModificationException;
                //  1301   1308   1308   1309   Any
                //  1301   1308   1308   1309   Ljava/lang/IllegalStateException;
                //  1302   1308   1301   1302   Ljava/lang/RuntimeException;
                //  1362   1371   1371   1372   Any
                //  1363   1371   1362   1363   Any
                //  1362   1371   1362   1363   Any
                //  1363   1371   1371   1372   Ljava/lang/IndexOutOfBoundsException;
                //  1362   1371   1371   1372   Any
                //  1379   1385   1385   1386   Any
                //  1379   1385   3      8      Ljava/lang/StringIndexOutOfBoundsException;
                //  1379   1385   3      8      Any
                //  1379   1385   1385   1386   Any
                //  1379   1385   1385   1386   Ljava/lang/RuntimeException;
                //  1431   1438   1438   1439   Any
                //  1431   1438   3      8      Any
                //  1431   1438   1431   1432   Any
                //  1431   1438   3      8      Ljava/lang/EnumConstantNotPresentException;
                //  1431   1438   3      8      Ljava/lang/NullPointerException;
                //  1442   1449   1449   1450   Any
                //  1442   1449   1442   1443   Ljava/lang/RuntimeException;
                //  1443   1449   1442   1443   Any
                //  1443   1449   3      8      Ljava/lang/AssertionError;
                //  1443   1449   1442   1443   Any
                //  1461   1468   1468   1469   Any
                //  1461   1468   1461   1462   Any
                //  1461   1468   1461   1462   Any
                //  1461   1468   3      8      Ljava/lang/EnumConstantNotPresentException;
                //  1461   1468   1461   1462   Ljava/lang/IndexOutOfBoundsException;
                //  1472   1479   1479   1480   Any
                //  1473   1479   1479   1480   Any
                //  1472   1479   1472   1473   Ljava/lang/ArithmeticException;
                //  1472   1479   3      8      Any
                //  1472   1479   1479   1480   Ljava/lang/StringIndexOutOfBoundsException;
                //  1484   1491   1491   1492   Any
                //  1485   1491   1484   1485   Any
                //  1484   1491   3      8      Any
                //  1485   1491   3      8      Any
                //  1485   1491   1484   1485   Any
                //  1540   1546   1546   1547   Any
                //  1540   1546   3      8      Ljava/lang/NegativeArraySizeException;
                //  1540   1546   3      8      Any
                //  1540   1546   3      8      Any
                //  1540   1546   1546   1547   Any
                //  1557   1563   1563   1564   Any
                //  1557   1563   3      8      Ljava/lang/NullPointerException;
                //  1557   1563   3      8      Any
                //  1557   1563   1563   1564   Ljava/lang/StringIndexOutOfBoundsException;
                //  1557   1563   3      8      Any
                //  1615   1622   1622   1623   Any
                //  1616   1622   3      8      Ljava/lang/ArithmeticException;
                //  1616   1622   1615   1616   Any
                //  1616   1622   1622   1623   Ljava/lang/NumberFormatException;
                //  1615   1622   1622   1623   Any
                //  1895   1902   1902   1903   Any
                //  1896   1902   1895   1896   Any
                //  1895   1902   1902   1903   Any
                //  1896   1902   1895   1896   Any
                //  1896   1902   1895   1896   Ljava/lang/ClassCastException;
                //  1906   1913   1913   1914   Any
                //  1906   1913   1913   1914   Any
                //  1907   1913   1906   1907   Ljava/lang/IndexOutOfBoundsException;
                //  1907   1913   1913   1914   Ljava/util/ConcurrentModificationException;
                //  1906   1913   1906   1907   Ljava/lang/ArithmeticException;
                //  1967   1974   1974   1975   Any
                //  1968   1974   3      8      Ljava/lang/IllegalArgumentException;
                //  1968   1974   1974   1975   Ljava/lang/IllegalArgumentException;
                //  1968   1974   1974   1975   Ljava/lang/NullPointerException;
                //  1967   1974   1967   1968   Ljava/lang/AssertionError;
                //  2071   2078   2078   2079   Any
                //  2072   2078   3      8      Ljava/util/NoSuchElementException;
                //  2072   2078   2071   2072   Any
                //  2072   2078   2071   2072   Any
                //  2072   2078   3      8      Ljava/util/NoSuchElementException;
                //  2083   2089   2089   2090   Any
                //  2083   2089   2089   2090   Any
                //  2083   2089   3      8      Ljava/lang/StringIndexOutOfBoundsException;
                //  2083   2089   3      8      Ljava/lang/ClassCastException;
                //  2083   2089   2089   2090   Ljava/lang/AssertionError;
                //  2096   2103   2103   2104   Any
                //  2097   2103   3      8      Any
                //  2096   2103   2096   2097   Ljava/util/NoSuchElementException;
                //  2096   2103   3      8      Ljava/lang/ArithmeticException;
                //  2096   2103   3      8      Any
                //  2155   2162   2162   2163   Any
                //  2156   2162   3      8      Ljava/lang/NumberFormatException;
                //  2155   2162   2155   2156   Ljava/lang/ArrayIndexOutOfBoundsException;
                //  2156   2162   3      8      Any
                //  2156   2162   2155   2156   Ljava/lang/AssertionError;
                //  2211   2218   2218   2219   Any
                //  2212   2218   2218   2219   Ljava/lang/EnumConstantNotPresentException;
                //  2211   2218   2218   2219   Ljava/lang/ArrayIndexOutOfBoundsException;
                //  2211   2218   3      8      Ljava/lang/ClassCastException;
                //  2212   2218   2211   2212   Ljava/lang/NumberFormatException;
                //  2225   2232   2232   2233   Any
                //  2226   2232   2232   2233   Any
                //  2226   2232   2225   2226   Ljava/lang/StringIndexOutOfBoundsException;
                //  2226   2232   3      8      Any
                //  2226   2232   2225   2226   Ljava/util/NoSuchElementException;
                //  2286   2293   2293   2294   Any
                //  2286   2293   2286   2287   Any
                //  2287   2293   2293   2294   Any
                //  2287   2293   2286   2287   Ljava/lang/IllegalArgumentException;
                //  2286   2293   3      8      Ljava/lang/UnsupportedOperationException;
                //  2297   2304   2304   2305   Any
                //  2298   2304   3      8      Ljava/lang/NumberFormatException;
                //  2297   2304   2297   2298   Any
                //  2297   2304   2304   2305   Ljava/lang/UnsupportedOperationException;
                //  2298   2304   2297   2298   Ljava/lang/StringIndexOutOfBoundsException;
                //  2311   2318   2318   2319   Any
                //  2312   2318   3      8      Any
                //  2312   2318   3      8      Any
                //  2311   2318   2311   2312   Ljava/lang/IllegalArgumentException;
                //  2311   2318   2311   2312   Any
                //  2323   2329   2329   2330   Any
                //  2323   2329   3      8      Any
                //  2323   2329   2329   2330   Any
                //  2323   2329   3      8      Any
                //  2323   2329   2329   2330   Any
                //  2336   2343   2343   2344   Any
                //  2337   2343   3      8      Any
                //  2337   2343   2336   2337   Ljava/lang/ArrayIndexOutOfBoundsException;
                //  2337   2343   2343   2344   Any
                //  2337   2343   2343   2344   Ljava/util/NoSuchElementException;
                //  2395   2402   2402   2403   Any
                //  2396   2402   2402   2403   Any
                //  2396   2402   3      8      Any
                //  2396   2402   2395   2396   Ljava/lang/UnsupportedOperationException;
                //  2396   2402   2402   2403   Ljava/lang/ArithmeticException;
                //  2451   2458   2458   2459   Any
                //  2452   2458   2458   2459   Any
                //  2452   2458   2451   2452   Any
                //  2451   2458   2451   2452   Any
                //  2452   2458   3      8      Ljava/lang/NumberFormatException;
                //  2462   2469   2469   2470   Any
                //  2463   2469   2469   2470   Any
                //  2462   2469   3      8      Any
                //  2462   2469   2462   2463   Any
                //  2462   2469   2469   2470   Any
                //  2473   2480   2480   2481   Any
                //  2474   2480   2480   2481   Any
                //  2474   2480   2480   2481   Ljava/lang/IllegalArgumentException;
                //  2474   2480   3      8      Ljava/lang/IllegalStateException;
                //  2474   2480   2473   2474   Any
                //  2484   2491   2491   2492   Any
                //  2485   2491   3      8      Ljava/lang/IndexOutOfBoundsException;
                //  2484   2491   2484   2485   Any
                //  2484   2491   2491   2492   Ljava/lang/NumberFormatException;
                //  2485   2491   2491   2492   Any
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
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:670)
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
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          131
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            123
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            115
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            36
        //    31: ldc             378817021
        //    33: goto            38
        //    36: ldc             430157781
        //    38: ldc             -1842068805
        //    40: ixor           
        //    41: lookupswitch {
        //          -2069886138: 36
        //          -1952977554: 68
        //          default: 104
        //        }
        //    68: getfield        dev/nuker/pyro/f5N.c:Ljava/util/List;
        //    71: new             Ldev/nuker/pyro/f5L;
        //    74: dup            
        //    75: aload_0        
        //    76: goto            80
        //    79: athrow         
        //    80: invokespecial   dev/nuker/pyro/f5L.<init>:(Ldev/nuker/pyro/f5N;)V
        //    83: goto            87
        //    86: athrow         
        //    87: checkcast       Ljava/util/function/Consumer;
        //    90: goto            94
        //    93: athrow         
        //    94: invokeinterface java/util/List.forEach:(Ljava/util/function/Consumer;)V
        //    99: goto            103
        //   102: athrow         
        //   103: return         
        //   104: aconst_null    
        //   105: athrow         
        //   106: pop            
        //   107: goto            24
        //   110: pop            
        //   111: aconst_null    
        //   112: goto            106
        //   115: dup            
        //   116: ifnull          106
        //   119: checkcast       Ljava/lang/Throwable;
        //   122: athrow         
        //   123: dup            
        //   124: ifnull          110
        //   127: checkcast       Ljava/lang/Throwable;
        //   130: athrow         
        //   131: aconst_null    
        //   132: athrow         
        //    StackMapTable: 00 15 43 07 00 12 04 FF 00 0B 00 00 00 01 07 00 12 FD 00 03 07 00 03 07 00 4A 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 4A 00 02 07 00 03 01 5D 07 00 03 4A 07 00 12 FF 00 00 00 02 07 00 03 07 00 4A 00 04 07 00 44 08 00 47 08 00 47 07 00 03 45 07 00 12 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 44 07 00 3C FF 00 05 00 00 00 01 07 00 12 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 44 07 00 42 47 07 00 12 00 40 07 00 03 41 07 00 12 43 05 44 07 00 12 47 05 47 07 00 12
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     115    123    Any
        //  115    123    115    123    Ljava/lang/StringIndexOutOfBoundsException;
        //  131    133    3      8      Any
        //  79     86     86     87     Any
        //  79     86     86     87     Ljava/lang/IndexOutOfBoundsException;
        //  80     86     86     87     Any
        //  80     86     79     80     Any
        //  79     86     79     80     Any
        //  94     102    102    103    Any
        //  94     102    102    103    Ljava/lang/AssertionError;
        //  94     102    102    103    Ljava/lang/UnsupportedOperationException;
        //  94     102    3      8      Any
        //  94     102    3      8      Ljava/lang/NegativeArraySizeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 44 out of bounds for length 44
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
    
    public static Minecraft c(final f5N f5N) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0038:
            while (true) {
                do {
                    Label_0025: {
                        break Label_0025;
                        try {
                            o = null;
                            if (fc.c < 0) {
                                continue Label_0038;
                            }
                            null;
                            return f5N.c;
                        }
                        catch (EnumConstantNotPresentException ex) {
                            if (ex != null) {
                                throw ex;
                            }
                            return f5N.c;
                        }
                    }
                    continue Label_0038;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public f5N() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u23e5\u1496\u8af5\ub3da\uc9d0\uedf8\ub22a\ue6c4\ud97b"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u23c5\u1496\u8af5\ub3fa\uc9d0\uedf8\ub22a\ue6c4\ud97b"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: ldc             "\u23d9\u1496\u8aec\ub3dd\uc9dd\uedff\ub237\ue68f\ud96b\ue9a3\ua738\u1e42\ue1e0\uc5b4\u816c\u8962\u57ac\u770b\ubd29\uc057\u2b18\uc229\u6a07\u2d16\ud7ca\u3582\u7d2a\u89b2\u8002\u8c85\u84ad\ufb3b\u70d8\u9a12\u1bde\uf16d\u496f\u882e\uca88\uff39\ub6c4\u41b3\ub9f4\ub346\u4c2e\u8acd\u7c79\uce23\u7d49\uead6\ue6c7\u1698\uee4a\u378b\u46a3\ue1e1\u0a12\u86cc\u19c6"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    19: aload_0        
        //    20: aload_0        
        //    21: new             Ldev/nuker/pyro/f0b;
        //    24: dup            
        //    25: ldc             "\u23e8\u149c\u8aee\ub3d6\uc9ca"
        //    27: getstatic       dev/nuker/pyro/fc.1:I
        //    30: ifeq            38
        //    33: ldc             -1121096236
        //    35: goto            40
        //    38: ldc             1257161457
        //    40: ldc             -641128925
        //    42: ixor           
        //    43: lookupswitch {
        //          -1826102062: 68
        //          1692683255: 38
        //          default: 254
        //        }
        //    68: invokestatic    invokestatic   !!! ERROR
        //    71: ldc             "\u23c8\u149c\u8aee\ub3d6\uc9ca"
        //    73: invokestatic    invokestatic   !!! ERROR
        //    76: aconst_null    
        //    77: getstatic       dev/nuker/pyro/fc.1:I
        //    80: ifeq            88
        //    83: ldc             -827905377
        //    85: goto            90
        //    88: ldc             -1108846745
        //    90: ldc             1009233163
        //    92: ixor           
        //    93: lookupswitch {
        //          -2117076372: 120
        //          -226457708: 88
        //          default: 252
        //        }
        //   120: getstatic       dev/nuker/pyro/fS.c:Ldev/nuker/pyro/fR;
        //   123: ldc             0.6
        //   125: fconst_0       
        //   126: ldc             0.9333333
        //   128: ldc             0.5
        //   130: invokevirtual   dev/nuker/pyro/fR.0:(FFFF)Ldev/nuker/pyro/fS;
        //   133: getstatic       dev/nuker/pyro/fc.0:I
        //   136: ifeq            144
        //   139: ldc             469835889
        //   141: goto            146
        //   144: ldc             1975470493
        //   146: ldc             -1152918519
        //   148: ixor           
        //   149: lookupswitch {
        //          -1488520072: 144
        //          -822569580: 176
        //          default: 250
        //        }
        //   176: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   179: checkcast       Ldev/nuker/pyro/f0n;
        //   182: invokevirtual   dev/nuker/pyro/f5N.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   185: checkcast       Ldev/nuker/pyro/f0b;
        //   188: getstatic       dev/nuker/pyro/fc.0:I
        //   191: ifeq            199
        //   194: ldc             555415355
        //   196: goto            201
        //   199: ldc             -736606766
        //   201: ldc             -1941895226
        //   203: ixor           
        //   204: lookupswitch {
        //          -1386483459: 199
        //          1482244628: 232
        //          default: 256
        //        }
        //   232: putfield        dev/nuker/pyro/f5N.c:Ldev/nuker/pyro/f0b;
        //   235: aload_0        
        //   236: new             Ljava/util/concurrent/CopyOnWriteArrayList;
        //   239: dup            
        //   240: invokespecial   java/util/concurrent/CopyOnWriteArrayList.<init>:()V
        //   243: checkcast       Ljava/util/List;
        //   246: putfield        dev/nuker/pyro/f5N.c:Ljava/util/List;
        //   249: return         
        //   250: aconst_null    
        //   251: athrow         
        //   252: aconst_null    
        //   253: athrow         
        //   254: aconst_null    
        //   255: athrow         
        //   256: aconst_null    
        //   257: athrow         
        //    StackMapTable: 00 10 FF 00 26 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 15 08 00 15 07 00 91 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 15 08 00 15 07 00 91 01 FF 00 1B 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 15 08 00 15 07 00 91 FF 00 13 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 15 08 00 15 07 00 91 07 00 91 05 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 15 08 00 15 07 00 91 07 00 91 05 01 FF 00 1D 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 15 08 00 15 07 00 91 07 00 91 05 FF 00 17 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 15 08 00 15 07 00 91 07 00 91 05 07 00 6E FF 00 01 00 01 07 00 03 00 09 07 00 03 07 00 03 08 00 15 08 00 15 07 00 91 07 00 91 05 07 00 6E 01 FF 00 1D 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 15 08 00 15 07 00 91 07 00 91 05 07 00 6E FF 00 16 00 01 07 00 03 00 02 07 00 03 07 00 5F FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 5F 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 5F FF 00 11 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 15 08 00 15 07 00 91 07 00 91 05 07 00 6E FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 15 08 00 15 07 00 91 07 00 91 05 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 15 08 00 15 07 00 91 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 5F
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
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f34 p0) {
        public class f5M implements Predicate
        {
            public SPacketChunkData c;
            
            public f5M(final SPacketChunkData c) {
                while (true) {
                    int n = 0;
                    Label_0015: {
                        if (fc.1 != 0) {
                            n = 2080384503;
                            break Label_0015;
                        }
                        n = 1409251905;
                    }
                    switch (n ^ 0x8416E83A) {
                        case -189693104: {
                            continue;
                        }
                        default: {
                            this.c = c;
                            while (true) {
                                int n2 = 0;
                                Label_0061: {
                                    if (fc.1 != 0) {
                                        n2 = 712904324;
                                        break Label_0061;
                                    }
                                    n2 = -594009253;
                                }
                                switch (n2 ^ 0x3ED8C382) {
                                    case 346475782: {
                                        continue;
                                    }
                                    case -499064615: {
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
                        case -132723251: {
                            throw null;
                        }
                    }
                    break;
                }
            }
            
            @Override
            public boolean test(final Object o) {
                return fbS.39(this, 493894522, o);
            }
            
            static {
                throw t;
            }
            
            public boolean c(@NotNull final fbp p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          453
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.1:I
                //    12: ifgt            445
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            437
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: getstatic       dev/nuker/pyro/fc.c:I
                //    27: ifge            35
                //    30: ldc             220866385
                //    32: goto            37
                //    35: ldc             1993296060
                //    37: ldc             -2049892110
                //    39: ixor           
                //    40: lookupswitch {
                //          -1996814429: 35
                //          -216111026: 68
                //          default: 418
                //        }
                //    68: aload_1        
                //    69: pop            
                //    70: aload_1        
                //    71: getstatic       dev/nuker/pyro/fc.c:I
                //    74: ifge            82
                //    77: ldc             1570551277
                //    79: goto            84
                //    82: ldc             1655425496
                //    84: ldc             -1698358273
                //    86: ixor           
                //    87: lookupswitch {
                //          -950424046: 82
                //          -126954969: 112
                //          default: 420
                //        }
                //   112: goto            116
                //   115: athrow         
                //   116: invokevirtual   dev/nuker/pyro/fbp.0:()Ljava/lang/Object;
                //   119: goto            123
                //   122: athrow         
                //   123: checkcast       Ljava/lang/Integer;
                //   126: aload_0        
                //   127: getstatic       dev/nuker/pyro/fc.0:I
                //   130: ifeq            138
                //   133: ldc             -325898704
                //   135: goto            140
                //   138: ldc             -451771471
                //   140: ldc             395457480
                //   142: ixor           
                //   143: lookupswitch {
                //          -226447239: 168
                //          -83812872: 138
                //          default: 422
                //        }
                //   168: getfield        dev/nuker/pyro/f5M.c:Lnet/minecraft/network/play/server/SPacketChunkData;
                //   171: goto            175
                //   174: athrow         
                //   175: invokevirtual   net/minecraft/network/play/server/SPacketChunkData.func_149273_e:()I
                //   178: goto            182
                //   181: athrow         
                //   182: istore_2       
                //   183: dup            
                //   184: ifnonnull       191
                //   187: pop            
                //   188: goto            416
                //   191: goto            195
                //   194: athrow         
                //   195: invokevirtual   java/lang/Integer.intValue:()I
                //   198: goto            202
                //   201: athrow         
                //   202: iload_2        
                //   203: if_icmpne       211
                //   206: ldc             -323193870
                //   208: goto            213
                //   211: ldc             -323193869
                //   213: ldc             882726712
                //   215: ixor           
                //   216: tableswitch {
                //          -1337833068: 240
                //          -1337833067: 416
                //          default: 206
                //        }
                //   240: aload_1        
                //   241: goto            245
                //   244: athrow         
                //   245: invokevirtual   dev/nuker/pyro/fbp.c:()Ljava/lang/Object;
                //   248: goto            252
                //   251: athrow         
                //   252: checkcast       Ljava/lang/Integer;
                //   255: aload_0        
                //   256: getstatic       dev/nuker/pyro/fc.1:I
                //   259: ifeq            267
                //   262: ldc             -55061557
                //   264: goto            269
                //   267: ldc             -1009888497
                //   269: ldc             -8313137
                //   271: ixor           
                //   272: lookupswitch {
                //          -1001274202: 267
                //          53933316: 426
                //          default: 300
                //        }
                //   300: getfield        dev/nuker/pyro/f5M.c:Lnet/minecraft/network/play/server/SPacketChunkData;
                //   303: goto            307
                //   306: athrow         
                //   307: invokevirtual   net/minecraft/network/play/server/SPacketChunkData.func_149271_f:()I
                //   310: goto            314
                //   313: athrow         
                //   314: istore_2       
                //   315: dup            
                //   316: ifnonnull       324
                //   319: ldc             -1182340926
                //   321: goto            326
                //   324: ldc             -1182340927
                //   326: ldc             -610438689
                //   328: ixor           
                //   329: tableswitch {
                //          -1003015622: 352
                //          -1003015621: 356
                //          default: 319
                //        }
                //   352: pop            
                //   353: goto            416
                //   356: goto            360
                //   359: athrow         
                //   360: invokevirtual   java/lang/Integer.intValue:()I
                //   363: goto            367
                //   366: athrow         
                //   367: getstatic       dev/nuker/pyro/fc.1:I
                //   370: ifeq            378
                //   373: ldc             836417851
                //   375: goto            380
                //   378: ldc             1299407015
                //   380: ldc             -1539459093
                //   382: ixor           
                //   383: lookupswitch {
                //          -1951027944: 378
                //          -1780019504: 424
                //          default: 408
                //        }
                //   408: iload_2        
                //   409: if_icmpne       416
                //   412: iconst_1       
                //   413: goto            417
                //   416: iconst_0       
                //   417: ireturn        
                //   418: aconst_null    
                //   419: athrow         
                //   420: aconst_null    
                //   421: athrow         
                //   422: aconst_null    
                //   423: athrow         
                //   424: aconst_null    
                //   425: athrow         
                //   426: aconst_null    
                //   427: athrow         
                //   428: pop            
                //   429: goto            24
                //   432: pop            
                //   433: aconst_null    
                //   434: goto            428
                //   437: dup            
                //   438: ifnull          428
                //   441: checkcast       Ljava/lang/Throwable;
                //   444: athrow         
                //   445: dup            
                //   446: ifnull          432
                //   449: checkcast       Ljava/lang/Throwable;
                //   452: athrow         
                //   453: aconst_null    
                //   454: athrow         
                //    StackMapTable: 00 41 43 07 00 47 04 FF 00 0B 00 00 00 01 07 00 47 FD 00 03 07 00 03 07 00 51 0A 41 01 1E 4D 07 00 51 FF 00 01 00 02 07 00 03 07 00 51 00 02 07 00 51 01 5B 07 00 51 42 07 00 47 40 07 00 51 45 07 00 47 40 07 00 05 FF 00 0E 00 02 07 00 03 07 00 51 00 02 07 00 57 07 00 03 FF 00 01 00 02 07 00 03 07 00 51 00 03 07 00 57 07 00 03 01 FF 00 1B 00 02 07 00 03 07 00 51 00 02 07 00 57 07 00 03 45 07 00 47 FF 00 00 00 02 07 00 03 07 00 51 00 02 07 00 57 07 00 22 45 07 00 47 FF 00 00 00 02 07 00 03 07 00 51 00 02 07 00 57 01 FF 00 08 00 03 07 00 03 07 00 51 01 00 01 07 00 57 42 07 00 47 40 07 00 57 45 07 00 47 40 01 03 04 41 01 1A 43 07 00 47 40 07 00 51 45 07 00 47 40 07 00 05 FF 00 0E 00 03 07 00 03 07 00 51 01 00 02 07 00 57 07 00 03 FF 00 01 00 03 07 00 03 07 00 51 01 00 03 07 00 57 07 00 03 01 FF 00 1E 00 03 07 00 03 07 00 51 01 00 02 07 00 57 07 00 03 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 51 01 00 02 07 00 57 07 00 22 45 07 00 47 FF 00 00 00 03 07 00 03 07 00 51 01 00 02 07 00 57 01 44 07 00 57 44 07 00 57 FF 00 01 00 03 07 00 03 07 00 51 01 00 02 07 00 57 01 59 07 00 57 43 07 00 57 FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 03 07 00 03 07 00 51 01 00 01 07 00 57 45 07 00 47 40 01 4A 01 FF 00 01 00 03 07 00 03 07 00 51 01 00 02 01 01 5B 01 07 40 01 FA 00 00 41 07 00 51 FF 00 01 00 02 07 00 03 07 00 51 00 02 07 00 57 07 00 03 FF 00 01 00 03 07 00 03 07 00 51 01 00 01 01 FF 00 01 00 03 07 00 03 07 00 51 01 00 02 07 00 57 07 00 03 FF 00 01 00 02 07 00 03 07 00 51 00 01 07 00 47 43 05 44 07 00 47 47 05 47 07 00 47
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                       
                //  -----  -----  -----  -----  -------------------------------------------
                //  8      20     437    445    Ljava/lang/IndexOutOfBoundsException;
                //  437    445    437    445    Any
                //  453    455    3      8      Any
                //  115    122    122    123    Any
                //  116    122    115    116    Any
                //  115    122    115    116    Any
                //  115    122    115    116    Any
                //  116    122    3      8      Any
                //  174    181    181    182    Any
                //  175    181    174    175    Any
                //  175    181    181    182    Ljava/lang/EnumConstantNotPresentException;
                //  175    181    181    182    Ljava/lang/StringIndexOutOfBoundsException;
                //  175    181    181    182    Any
                //  194    201    201    202    Any
                //  194    201    201    202    Ljava/lang/NumberFormatException;
                //  195    201    3      8      Ljava/lang/RuntimeException;
                //  195    201    194    195    Any
                //  194    201    3      8      Ljava/util/NoSuchElementException;
                //  244    251    251    252    Any
                //  244    251    244    245    Ljava/lang/IndexOutOfBoundsException;
                //  245    251    244    245    Any
                //  244    251    3      8      Any
                //  245    251    244    245    Ljava/lang/NullPointerException;
                //  306    313    313    314    Any
                //  307    313    3      8      Ljava/lang/UnsupportedOperationException;
                //  306    313    313    314    Any
                //  306    313    313    314    Ljava/lang/EnumConstantNotPresentException;
                //  306    313    306    307    Ljava/lang/ClassCastException;
                //  360    366    366    367    Any
                //  360    366    366    367    Any
                //  360    366    366    367    Ljava/lang/NegativeArraySizeException;
                //  360    366    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
                //  360    366    366    367    Any
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
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:670)
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
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          671
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            663
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            655
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_1        
        //    27: goto            31
        //    30: athrow         
        //    31: invokevirtual   dev/nuker/pyro/f34.c:()Ldev/nuker/pyro/f2T;
        //    34: goto            38
        //    37: athrow         
        //    38: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    41: if_acmpeq       45
        //    44: return         
        //    45: aload_1        
        //    46: getstatic       dev/nuker/pyro/fc.0:I
        //    49: ifeq            57
        //    52: ldc             -615721290
        //    54: goto            59
        //    57: ldc             396075962
        //    59: ldc             1034762087
        //    61: ixor           
        //    62: lookupswitch {
        //          -1650728270: 57
        //          -421404207: 642
        //          default: 88
        //        }
        //    88: goto            92
        //    91: athrow         
        //    92: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //    95: goto            99
        //    98: athrow         
        //    99: instanceof      Lnet/minecraft/network/play/server/SPacketChunkData;
        //   102: ifeq            110
        //   105: ldc             -1735515036
        //   107: goto            112
        //   110: ldc             -1735515035
        //   112: ldc             -1041991152
        //   114: ixor           
        //   115: tableswitch {
        //          -1294680856: 136
        //          -1294680855: 631
        //          default: 105
        //        }
        //   136: getstatic       dev/nuker/pyro/fc.1:I
        //   139: ifeq            147
        //   142: ldc             -850032365
        //   144: goto            149
        //   147: ldc             -1754576910
        //   149: ldc             523213325
        //   151: ixor           
        //   152: lookupswitch {
        //          -2008752641: 180
        //          -763751650: 147
        //          default: 638
        //        }
        //   180: aload_1        
        //   181: goto            185
        //   184: athrow         
        //   185: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //   188: goto            192
        //   191: athrow         
        //   192: dup            
        //   193: ifnonnull       268
        //   196: new             Lkotlin/TypeCastException;
        //   199: dup            
        //   200: ldc             "\u23e5\u1486\u8aee\ub1c4\ucf97\uedee\ub225\ue6c1\udb77\uefab\ua739\u1e0c\ue1e9\uc7b3\u8763\u8975\u57a5\u7719\ubf38\uc658\u2b0d\uc234\u6a42\u2f49\ud1c9\u3580\u7d66\u89af\u8215\u8a8f\u84a7\ufb72\u70c9\u981e\u1d81\uf169\u493c\u8860\uc892\uf927\ub69d\u41fe\ub9f2\ub157\u4a64\u8afd\u7c7b\uce2b\u7f59\uecc2\ue69d\u16d6\uee5c\u358b\u40a9\ue1f8\u0a05\u86d5\u1b8a\u0946\u771a\u728c\uc7fc\ub9e5\u9cda\u6a1b\ue2f4\ud02d\ua739\u23cb\u89f3\u4f92\u8b4e\u1618\ua5c3\u70ca\u55a3\u1c78\u63fd\u1786\u8867\u0538\uf8c5\u2445\u1f00\ub9f3\u7cf9"
        //   202: goto            206
        //   205: athrow         
        //   206: invokestatic    invokestatic   !!! ERROR
        //   209: goto            213
        //   212: athrow         
        //   213: getstatic       dev/nuker/pyro/fc.1:I
        //   216: ifeq            224
        //   219: ldc             245061667
        //   221: goto            226
        //   224: ldc             41173009
        //   226: ldc             1752433556
        //   228: ixor           
        //   229: lookupswitch {
        //          -746369080: 224
        //          1726962615: 636
        //          default: 256
        //        }
        //   256: goto            260
        //   259: athrow         
        //   260: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   263: goto            267
        //   266: athrow         
        //   267: athrow         
        //   268: checkcast       Lnet/minecraft/network/play/server/SPacketChunkData;
        //   271: astore_2       
        //   272: aload_2        
        //   273: goto            277
        //   276: athrow         
        //   277: invokevirtual   net/minecraft/network/play/server/SPacketChunkData.func_149274_i:()Z
        //   280: goto            284
        //   283: athrow         
        //   284: ifne            292
        //   287: ldc             -635666942
        //   289: goto            294
        //   292: ldc             -635666941
        //   294: ldc             -763911634
        //   296: ixor           
        //   297: tableswitch {
        //          282572888: 320
        //          282572889: 631
        //          default: 287
        //        }
        //   320: aload_0        
        //   321: getfield        dev/nuker/pyro/f5N.c:Ljava/util/List;
        //   324: new             Ldev/nuker/pyro/f5M;
        //   327: dup            
        //   328: aload_2        
        //   329: goto            333
        //   332: athrow         
        //   333: invokespecial   dev/nuker/pyro/f5M.<init>:(Lnet/minecraft/network/play/server/SPacketChunkData;)V
        //   336: goto            340
        //   339: athrow         
        //   340: checkcast       Ljava/util/function/Predicate;
        //   343: goto            347
        //   346: athrow         
        //   347: invokeinterface java/util/List.removeIf:(Ljava/util/function/Predicate;)Z
        //   352: goto            356
        //   355: athrow         
        //   356: pop            
        //   357: new             Ldev/nuker/pyro/fbp;
        //   360: dup            
        //   361: aload_2        
        //   362: goto            366
        //   365: athrow         
        //   366: invokevirtual   net/minecraft/network/play/server/SPacketChunkData.func_149273_e:()I
        //   369: goto            373
        //   372: athrow         
        //   373: getstatic       dev/nuker/pyro/fc.0:I
        //   376: ifeq            384
        //   379: ldc             -179126046
        //   381: goto            386
        //   384: ldc             -850221923
        //   386: ldc             -1166306682
        //   388: ixor           
        //   389: lookupswitch {
        //          -990869035: 384
        //          1328108132: 644
        //          default: 416
        //        }
        //   416: goto            420
        //   419: athrow         
        //   420: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   423: goto            427
        //   426: athrow         
        //   427: aload_2        
        //   428: getstatic       dev/nuker/pyro/fc.c:I
        //   431: ifge            439
        //   434: ldc             19126061
        //   436: goto            441
        //   439: ldc             -506730407
        //   441: ldc             -11867034
        //   443: ixor           
        //   444: lookupswitch {
        //          -26657973: 632
        //          -21433415: 439
        //          default: 472
        //        }
        //   472: goto            476
        //   475: athrow         
        //   476: invokevirtual   net/minecraft/network/play/server/SPacketChunkData.func_149271_f:()I
        //   479: goto            483
        //   482: athrow         
        //   483: goto            487
        //   486: athrow         
        //   487: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   490: goto            494
        //   493: athrow         
        //   494: goto            498
        //   497: athrow         
        //   498: invokespecial   dev/nuker/pyro/fbp.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   501: goto            505
        //   504: athrow         
        //   505: astore_3       
        //   506: aload_0        
        //   507: getfield        dev/nuker/pyro/f5N.c:Ljava/util/List;
        //   510: getstatic       dev/nuker/pyro/fc.0:I
        //   513: ifeq            521
        //   516: ldc             1153599791
        //   518: goto            523
        //   521: ldc             1236610922
        //   523: ldc             995536350
        //   525: ixor           
        //   526: lookupswitch {
        //          -678278143: 521
        //          2140415217: 634
        //          default: 552
        //        }
        //   552: aload_3        
        //   553: getstatic       dev/nuker/pyro/fc.0:I
        //   556: ifeq            564
        //   559: ldc             -1788052487
        //   561: goto            566
        //   564: ldc             104617320
        //   566: ldc             1266844606
        //   568: ixor           
        //   569: lookupswitch {
        //          -554764217: 640
        //          1628460354: 564
        //          default: 596
        //        }
        //   596: goto            600
        //   599: athrow         
        //   600: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   605: goto            609
        //   608: athrow         
        //   609: ifne            631
        //   612: aload_0        
        //   613: getfield        dev/nuker/pyro/f5N.c:Ljava/util/List;
        //   616: aload_3        
        //   617: goto            621
        //   620: athrow         
        //   621: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   626: goto            630
        //   629: athrow         
        //   630: pop            
        //   631: return         
        //   632: aconst_null    
        //   633: athrow         
        //   634: aconst_null    
        //   635: athrow         
        //   636: aconst_null    
        //   637: athrow         
        //   638: aconst_null    
        //   639: athrow         
        //   640: aconst_null    
        //   641: athrow         
        //   642: aconst_null    
        //   643: athrow         
        //   644: aconst_null    
        //   645: athrow         
        //   646: pop            
        //   647: goto            24
        //   650: pop            
        //   651: aconst_null    
        //   652: goto            646
        //   655: dup            
        //   656: ifnull          646
        //   659: checkcast       Ljava/lang/Throwable;
        //   662: athrow         
        //   663: dup            
        //   664: ifnull          650
        //   667: checkcast       Ljava/lang/Throwable;
        //   670: athrow         
        //   671: aconst_null    
        //   672: athrow         
        //    StackMapTable: 00 6C 43 07 00 12 04 FF 00 0B 00 00 00 01 07 00 12 FD 00 03 07 00 03 07 00 A6 FF 00 05 00 00 00 01 07 00 12 FF 00 00 00 02 07 00 03 07 00 A6 00 01 07 00 A6 45 07 00 12 40 07 00 AB 06 4B 07 00 A6 FF 00 01 00 02 07 00 03 07 00 A6 00 02 07 00 A6 01 5C 07 00 A6 42 07 00 12 40 07 00 A6 45 07 00 12 40 07 00 FF 05 04 41 01 17 0A 41 01 1E 43 07 00 96 40 07 00 A6 45 07 00 12 40 07 00 FF FF 00 0C 00 00 00 01 07 00 12 FF 00 00 00 02 07 00 03 07 00 A6 00 04 07 00 FF 08 00 C4 08 00 C4 07 00 91 45 07 00 12 FF 00 00 00 02 07 00 03 07 00 A6 00 04 07 00 FF 08 00 C4 08 00 C4 07 00 91 FF 00 0A 00 02 07 00 03 07 00 A6 00 04 07 00 FF 08 00 C4 08 00 C4 07 00 91 FF 00 01 00 02 07 00 03 07 00 A6 00 05 07 00 FF 08 00 C4 08 00 C4 07 00 91 01 FF 00 1D 00 02 07 00 03 07 00 A6 00 04 07 00 FF 08 00 C4 08 00 C4 07 00 91 42 07 00 12 FF 00 00 00 02 07 00 03 07 00 A6 00 04 07 00 FF 08 00 C4 08 00 C4 07 00 91 45 07 00 12 FF 00 00 00 02 07 00 03 07 00 A6 00 02 07 00 FF 07 00 BE 40 07 00 FF FF 00 07 00 03 07 00 03 07 00 A6 07 00 B6 00 01 07 00 A0 40 07 00 B6 45 07 00 12 40 01 02 04 41 01 19 FF 00 0B 00 00 00 01 07 00 12 FF 00 00 00 03 07 00 03 07 00 A6 07 00 B6 00 04 07 00 44 08 01 44 08 01 44 07 00 B6 45 07 00 12 FF 00 00 00 03 07 00 03 07 00 A6 07 00 B6 00 02 07 00 44 07 00 CF 45 07 00 12 FF 00 00 00 03 07 00 03 07 00 A6 07 00 B6 00 02 07 00 44 07 00 D4 47 07 00 12 40 01 FF 00 08 00 00 00 01 07 00 12 FF 00 00 00 03 07 00 03 07 00 A6 07 00 B6 00 03 08 01 65 08 01 65 07 00 B6 45 07 00 12 FF 00 00 00 03 07 00 03 07 00 A6 07 00 B6 00 03 08 01 65 08 01 65 01 FF 00 0A 00 03 07 00 03 07 00 A6 07 00 B6 00 03 08 01 65 08 01 65 01 FF 00 01 00 03 07 00 03 07 00 A6 07 00 B6 00 04 08 01 65 08 01 65 01 01 FF 00 1D 00 03 07 00 03 07 00 A6 07 00 B6 00 03 08 01 65 08 01 65 01 42 07 00 12 FF 00 00 00 03 07 00 03 07 00 A6 07 00 B6 00 03 08 01 65 08 01 65 01 45 07 00 12 FF 00 00 00 03 07 00 03 07 00 A6 07 00 B6 00 03 08 01 65 08 01 65 07 00 E3 FF 00 0B 00 03 07 00 03 07 00 A6 07 00 B6 00 04 08 01 65 08 01 65 07 00 E3 07 00 B6 FF 00 01 00 03 07 00 03 07 00 A6 07 00 B6 00 05 08 01 65 08 01 65 07 00 E3 07 00 B6 01 FF 00 1E 00 03 07 00 03 07 00 A6 07 00 B6 00 04 08 01 65 08 01 65 07 00 E3 07 00 B6 FF 00 02 00 00 00 01 07 00 12 FF 00 00 00 03 07 00 03 07 00 A6 07 00 B6 00 04 08 01 65 08 01 65 07 00 E3 07 00 B6 45 07 00 12 FF 00 00 00 03 07 00 03 07 00 A6 07 00 B6 00 04 08 01 65 08 01 65 07 00 E3 01 42 07 00 12 FF 00 00 00 03 07 00 03 07 00 A6 07 00 B6 00 04 08 01 65 08 01 65 07 00 E3 01 45 07 00 12 FF 00 00 00 03 07 00 03 07 00 A6 07 00 B6 00 04 08 01 65 08 01 65 07 00 E3 07 00 E3 42 07 00 12 FF 00 00 00 03 07 00 03 07 00 A6 07 00 B6 00 04 08 01 65 08 01 65 07 00 E3 07 00 E3 45 07 00 12 40 07 00 DA FF 00 0F 00 04 07 00 03 07 00 A6 07 00 B6 07 00 DA 00 01 07 00 44 FF 00 01 00 04 07 00 03 07 00 A6 07 00 B6 07 00 DA 00 02 07 00 44 01 5C 07 00 44 FF 00 0B 00 04 07 00 03 07 00 A6 07 00 B6 07 00 DA 00 02 07 00 44 07 00 DA FF 00 01 00 04 07 00 03 07 00 A6 07 00 B6 07 00 DA 00 03 07 00 44 07 00 DA 01 FF 00 1D 00 04 07 00 03 07 00 A6 07 00 B6 07 00 DA 00 02 07 00 44 07 00 DA 42 07 00 2F FF 00 00 00 04 07 00 03 07 00 A6 07 00 B6 07 00 DA 00 02 07 00 44 07 00 DA 47 07 00 12 40 01 4A 07 00 A2 FF 00 00 00 04 07 00 03 07 00 A6 07 00 B6 07 00 DA 00 02 07 00 44 07 00 DA 47 07 00 12 40 01 F9 00 00 FF 00 00 00 03 07 00 03 07 00 A6 07 00 B6 00 04 08 01 65 08 01 65 07 00 E3 07 00 B6 FF 00 01 00 04 07 00 03 07 00 A6 07 00 B6 07 00 DA 00 01 07 00 44 FF 00 01 00 02 07 00 03 07 00 A6 00 04 07 00 FF 08 00 C4 08 00 C4 07 00 91 01 FF 00 01 00 04 07 00 03 07 00 A6 07 00 B6 07 00 DA 00 02 07 00 44 07 00 DA FF 00 01 00 02 07 00 03 07 00 A6 00 01 07 00 A6 FF 00 01 00 03 07 00 03 07 00 A6 07 00 B6 00 03 08 01 65 08 01 65 01 FF 00 01 00 02 07 00 03 07 00 A6 00 01 07 00 12 43 05 44 07 00 12 47 05 47 07 00 12
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     655    663    Ljava/lang/NumberFormatException;
        //  655    663    655    663    Any
        //  671    673    3      8      Any
        //  31     37     37     38     Any
        //  31     37     3      8      Any
        //  31     37     3      8      Any
        //  31     37     3      8      Ljava/lang/ArithmeticException;
        //  31     37     37     38     Any
        //  91     98     98     99     Any
        //  92     98     98     99     Any
        //  92     98     91     92     Ljava/lang/IllegalStateException;
        //  91     98     91     92     Any
        //  91     98     91     92     Any
        //  184    191    191    192    Any
        //  185    191    3      8      Ljava/lang/ClassCastException;
        //  184    191    184    185    Ljava/lang/ArithmeticException;
        //  185    191    191    192    Ljava/lang/ArithmeticException;
        //  184    191    3      8      Ljava/lang/IllegalArgumentException;
        //  206    212    212    213    Any
        //  206    212    3      8      Ljava/lang/NegativeArraySizeException;
        //  206    212    212    213    Ljava/lang/NegativeArraySizeException;
        //  206    212    212    213    Any
        //  206    212    212    213    Any
        //  259    266    266    267    Any
        //  260    266    259    260    Any
        //  260    266    259    260    Ljava/lang/EnumConstantNotPresentException;
        //  260    266    3      8      Any
        //  260    266    3      8      Any
        //  276    283    283    284    Any
        //  276    283    276    277    Ljava/lang/NumberFormatException;
        //  276    283    283    284    Any
        //  276    283    3      8      Ljava/lang/IllegalArgumentException;
        //  276    283    276    277    Ljava/lang/NullPointerException;
        //  333    339    339    340    Any
        //  333    339    339    340    Any
        //  333    339    3      8      Ljava/lang/RuntimeException;
        //  333    339    339    340    Ljava/lang/StringIndexOutOfBoundsException;
        //  333    339    3      8      Ljava/lang/RuntimeException;
        //  346    355    355    356    Any
        //  346    355    3      8      Ljava/lang/IllegalArgumentException;
        //  347    355    355    356    Any
        //  347    355    346    347    Any
        //  346    355    346    347    Any
        //  366    372    372    373    Any
        //  366    372    372    373    Any
        //  366    372    372    373    Any
        //  366    372    372    373    Ljava/lang/StringIndexOutOfBoundsException;
        //  366    372    372    373    Any
        //  419    426    426    427    Any
        //  419    426    426    427    Any
        //  419    426    419    420    Ljava/lang/ClassCastException;
        //  419    426    3      8      Any
        //  419    426    419    420    Any
        //  476    482    482    483    Any
        //  476    482    482    483    Ljava/lang/IndexOutOfBoundsException;
        //  476    482    482    483    Any
        //  476    482    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  476    482    482    483    Ljava/lang/EnumConstantNotPresentException;
        //  486    493    493    494    Any
        //  487    493    486    487    Any
        //  487    493    493    494    Any
        //  486    493    486    487    Any
        //  487    493    486    487    Ljava/lang/NegativeArraySizeException;
        //  497    504    504    505    Any
        //  498    504    504    505    Ljava/util/ConcurrentModificationException;
        //  498    504    3      8      Any
        //  498    504    504    505    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  497    504    497    498    Any
        //  599    608    608    609    Any
        //  600    608    599    600    Ljava/lang/IndexOutOfBoundsException;
        //  599    608    608    609    Ljava/lang/IndexOutOfBoundsException;
        //  599    608    608    609    Ljava/lang/ArithmeticException;
        //  599    608    3      8      Any
        //  620    629    629    630    Any
        //  621    629    3      8      Any
        //  620    629    620    621    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  620    629    3      8      Any
        //  620    629    3      8      Any
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
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          111
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            103
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            95
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            36
        //    30: ldc_w           1116423680
        //    33: goto            39
        //    36: ldc_w           1996579279
        //    39: ldc_w           -1803995120
        //    42: ixor           
        //    43: lookupswitch {
        //          -688751088: 84
        //          672347314: 36
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: iload_1        
        //    70: aload_2        
        //    71: aload_3        
        //    72: goto            76
        //    75: athrow         
        //    76: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //    79: goto            83
        //    82: athrow         
        //    83: return         
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
        //    StackMapTable: 00 11 43 07 00 12 04 FF 00 0B 00 00 00 01 07 00 12 FF 00 03 00 04 07 00 03 01 07 01 07 07 01 09 00 00 0B 42 01 1C 46 07 00 12 FF 00 00 00 04 07 00 03 01 07 01 07 07 01 09 00 04 07 00 03 01 07 01 07 07 01 09 45 07 00 12 00 00 41 07 00 12 43 05 44 07 00 12 47 05 47 07 00 12
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  8      20     95     103    Ljava/lang/ArithmeticException;
        //  95     103    95     103    Any
        //  111    113    3      8      Any
        //  75     82     82     83     Any
        //  76     82     3      8      Any
        //  76     82     3      8      Any
        //  75     82     75     76     Any
        //  75     82     82     83     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 45 out of bounds for length 45
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
    
    @NotNull
    public f0b 0() {
        return fbS.1H(this, 1931444284);
    }
}
