// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.block.Block;
import net.minecraft.util.math.AxisAlignedBB;

public class f95 extends f8W
{
    public double c;
    public int c;
    public double 0;
    public int 0;
    
    public f95() {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.0 != 0) {
                    n = 1744508337;
                    break Label_0017;
                }
                n = -50283612;
            }
            switch (n ^ 0x705107E2) {
                case 879346647: {
                    continue;
                }
                default: {
                    final double c = 0.2873;
                    while (true) {
                        int n2 = 0;
                        Label_0065: {
                            if (fc.0 != 0) {
                                n2 = -475481053;
                                break Label_0065;
                            }
                            n2 = -1588539640;
                        }
                        switch (n2 ^ 0x12C65D0C) {
                            case -1549132628: {
                                continue;
                            }
                            default: {
                                this.c = c;
                                this.c = 1;
                                while (true) {
                                    int n3 = 0;
                                    Label_0117: {
                                        if (fc.c < 0) {
                                            n3 = 524133036;
                                            break Label_0117;
                                        }
                                        n3 = 1146914239;
                                    }
                                    switch (n3 ^ 0xD7DA123B) {
                                        case 1486125198: {
                                            continue;
                                        }
                                        default: {
                                            this.0 = 0.0;
                                            this.c = 0.0;
                                            while (true) {
                                                int n4 = 0;
                                                Label_0171: {
                                                    if (fc.1 != 0) {
                                                        n4 = -1597325040;
                                                        break Label_0171;
                                                    }
                                                    n4 = -1414779861;
                                                }
                                                switch (n4 ^ 0x889EB0B5) {
                                                    case 676622757: {
                                                        continue;
                                                    }
                                                    case 590519454: {
                                                        this.c = 4;
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
                                        case -924340073: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case -244391633: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 397021779: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @Override
    public void 0() {
        fbS.dP(this, 1645269862);
    }
    
    public double c(final double p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          186
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            178
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            170
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/math/BigDecimal;
        //    27: dup            
        //    28: dload_1        
        //    29: goto            33
        //    32: athrow         
        //    33: invokespecial   java/math/BigDecimal.<init>:(D)V
        //    36: goto            40
        //    39: athrow         
        //    40: astore_3       
        //    41: aload_3        
        //    42: iconst_3       
        //    43: getstatic       java/math/RoundingMode.HALF_UP:Ljava/math/RoundingMode;
        //    46: goto            50
        //    49: athrow         
        //    50: invokevirtual   java/math/BigDecimal.setScale:(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;
        //    53: goto            57
        //    56: athrow         
        //    57: getstatic       dev/nuker/pyro/fc.1:I
        //    60: ifeq            68
        //    63: ldc             -397016828
        //    65: goto            70
        //    68: ldc             -1089638340
        //    70: ldc             -1457511137
        //    72: ixor           
        //    73: lookupswitch {
        //          372069667: 100
        //          1098261531: 68
        //          default: 157
        //        }
        //   100: astore_3       
        //   101: getstatic       dev/nuker/pyro/fc.0:I
        //   104: ifeq            112
        //   107: ldc             -287707612
        //   109: goto            114
        //   112: ldc             -479421846
        //   114: ldc             -281887936
        //   116: ixor           
        //   117: lookupswitch {
        //          -2121109374: 112
        //          32200036: 159
        //          default: 144
        //        }
        //   144: aload_3        
        //   145: goto            149
        //   148: athrow         
        //   149: invokevirtual   java/math/BigDecimal.doubleValue:()D
        //   152: goto            156
        //   155: athrow         
        //   156: dreturn        
        //   157: aconst_null    
        //   158: athrow         
        //   159: aconst_null    
        //   160: athrow         
        //   161: pop            
        //   162: goto            24
        //   165: pop            
        //   166: aconst_null    
        //   167: goto            161
        //   170: dup            
        //   171: ifnull          161
        //   174: checkcast       Ljava/lang/Throwable;
        //   177: athrow         
        //   178: dup            
        //   179: ifnull          165
        //   182: checkcast       Ljava/lang/Throwable;
        //   185: athrow         
        //   186: aconst_null    
        //   187: athrow         
        //    StackMapTable: 00 1D 43 07 00 43 04 FF 00 0B 00 00 00 01 07 00 43 FD 00 03 07 00 03 03 47 07 00 35 FF 00 00 00 02 07 00 03 03 00 03 08 00 18 08 00 18 03 45 07 00 43 40 07 00 45 FF 00 08 00 03 07 00 03 03 07 00 45 00 01 07 00 37 FF 00 00 00 03 07 00 03 03 07 00 45 00 03 07 00 45 01 07 00 4A 45 07 00 43 40 07 00 45 4A 07 00 45 FF 00 01 00 03 07 00 03 03 07 00 45 00 02 07 00 45 01 5D 07 00 45 0B 41 01 1D FF 00 03 00 00 00 01 07 00 43 FF 00 00 00 03 07 00 03 03 07 00 45 00 01 07 00 45 45 07 00 43 40 03 40 07 00 45 01 FF 00 01 00 02 07 00 03 03 00 01 07 00 43 43 05 44 07 00 43 47 05 47 07 00 43
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     170    178    Ljava/lang/IllegalStateException;
        //  170    178    170    178    Any
        //  186    188    3      8      Any
        //  32     39     39     40     Any
        //  33     39     39     40     Any
        //  33     39     32     33     Ljava/lang/IllegalArgumentException;
        //  33     39     3      8      Any
        //  33     39     39     40     Ljava/lang/IllegalStateException;
        //  49     56     56     57     Any
        //  50     56     56     57     Any
        //  50     56     3      8      Any
        //  49     56     49     50     Ljava/lang/NegativeArraySizeException;
        //  49     56     56     57     Ljava/util/ConcurrentModificationException;
        //  149    155    155    156    Any
        //  149    155    155    156    Ljava/lang/ArithmeticException;
        //  149    155    3      8      Ljava/lang/AssertionError;
        //  149    155    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  149    155    155    156    Ljava/lang/NullPointerException;
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
    
    @Override
    public void c() {
        fbS.dt(this, 983082191);
    }
    
    static {
        throw t;
    }
    
    @Override
    public void c(final f3i f3i) {
        fbS.fk(this, 1895194702, f3i);
    }
    
    @Override
    public void c(final f3e p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          4169
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            4161
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            4153
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   dev/nuker/pyro/f3e.c:()Ldev/nuker/pyro/f2T;
        //    32: goto            36
        //    35: athrow         
        //    36: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    39: if_acmpne       263
        //    42: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7h;
        //    45: getstatic       dev/nuker/pyro/fc.0:I
        //    48: ifeq            56
        //    51: ldc             1936250801
        //    53: goto            58
        //    56: ldc             -548789632
        //    58: ldc             -1364715019
        //    60: ixor           
        //    61: lookupswitch {
        //          -574566844: 4094
        //          993026258: 56
        //          default: 88
        //        }
        //    88: getfield        dev/nuker/pyro/f7h.c:Ldev/nuker/pyro/fw;
        //    91: getstatic       dev/nuker/pyro/fc.c:I
        //    94: ifge            102
        //    97: ldc             1497568211
        //    99: goto            104
        //   102: ldc             783039514
        //   104: ldc             602519653
        //   106: ixor           
        //   107: lookupswitch {
        //          -945566334: 102
        //          2058005430: 4054
        //          default: 132
        //        }
        //   132: goto            136
        //   135: athrow         
        //   136: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   139: goto            143
        //   142: athrow         
        //   143: checkcast       Ljava/lang/Boolean;
        //   146: getstatic       dev/nuker/pyro/fc.0:I
        //   149: ifeq            157
        //   152: ldc             65524511
        //   154: goto            159
        //   157: ldc             164959960
        //   159: ldc             -1603709931
        //   161: ixor           
        //   162: lookupswitch {
        //          -1760517792: 157
        //          -1550940406: 4142
        //          default: 188
        //        }
        //   188: goto            192
        //   191: athrow         
        //   192: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   195: goto            199
        //   198: athrow         
        //   199: ifeq            205
        //   202: goto            263
        //   205: getstatic       dev/nuker/pyro/fc.1:I
        //   208: ifeq            216
        //   211: ldc             1447414506
        //   213: goto            218
        //   216: ldc             -744784179
        //   218: ldc             1552696668
        //   220: ixor           
        //   221: lookupswitch {
        //          -1894302831: 248
        //          180981686: 216
        //          default: 4134
        //        }
        //   248: aload_1        
        //   249: goto            253
        //   252: athrow         
        //   253: invokevirtual   dev/nuker/pyro/f3e.0:()Z
        //   256: goto            260
        //   259: athrow         
        //   260: ifeq            264
        //   263: return         
        //   264: goto            268
        //   267: athrow         
        //   268: invokestatic    dev/nuker/pyro/fbl.7:()Z
        //   271: goto            275
        //   274: athrow         
        //   275: ifne            283
        //   278: ldc             1689466420
        //   280: goto            285
        //   283: ldc             1689466423
        //   285: ldc             1353428277
        //   287: ixor           
        //   288: tableswitch {
        //          1748055554: 312
        //          1748055555: 313
        //          default: 278
        //        }
        //   312: return         
        //   313: getstatic       dev/nuker/pyro/fc.1:I
        //   316: ifeq            324
        //   319: ldc             -457315735
        //   321: goto            326
        //   324: ldc             -1992652351
        //   326: ldc             -1252265732
        //   328: ixor           
        //   329: lookupswitch {
        //          1013020989: 356
        //          1374034581: 324
        //          default: 4060
        //        }
        //   356: aload_1        
        //   357: goto            361
        //   360: athrow         
        //   361: invokevirtual   dev/nuker/pyro/f3e.c:()V
        //   364: goto            368
        //   367: athrow         
        //   368: aload_0        
        //   369: dup            
        //   370: getfield        dev/nuker/pyro/f95.0:I
        //   373: iconst_1       
        //   374: iadd           
        //   375: putfield        dev/nuker/pyro/f95.0:I
        //   378: aload_0        
        //   379: dup            
        //   380: getstatic       dev/nuker/pyro/fc.0:I
        //   383: ifeq            391
        //   386: ldc             177650773
        //   388: goto            393
        //   391: ldc             531918455
        //   393: ldc             1801020072
        //   395: ixor           
        //   396: lookupswitch {
        //          1641012989: 391
        //          1961692383: 424
        //          default: 4042
        //        }
        //   424: getfield        dev/nuker/pyro/f95.0:I
        //   427: iconst_5       
        //   428: irem           
        //   429: putfield        dev/nuker/pyro/f95.0:I
        //   432: aload_0        
        //   433: getfield        dev/nuker/pyro/f95.0:I
        //   436: ifeq            510
        //   439: getstatic       dev/nuker/pyro/fc.c:I
        //   442: ifge            450
        //   445: ldc             409937583
        //   447: goto            452
        //   450: ldc             -870226139
        //   452: ldc             -2119266892
        //   454: ixor           
        //   455: lookupswitch {
        //          -1715360997: 4120
        //          8513440: 450
        //          default: 480
        //        }
        //   480: getstatic       dev/nuker/pyro/f02.c:Ldev/nuker/pyro/f02;
        //   483: ldc             "\u221d\u1483\u8b1a\ub1cd\ucf70\uec00\ub225\ue72a"
        //   485: goto            489
        //   488: athrow         
        //   489: invokestatic    invokestatic   !!! ERROR
        //   492: goto            496
        //   495: athrow         
        //   496: goto            500
        //   499: athrow         
        //   500: invokevirtual   dev/nuker/pyro/f02.1:(Ljava/lang/String;)V
        //   503: goto            507
        //   506: athrow         
        //   507: goto            846
        //   510: goto            514
        //   513: athrow         
        //   514: invokestatic    dev/nuker/pyro/fbl.d:()Z
        //   517: goto            521
        //   520: athrow         
        //   521: ifeq            846
        //   524: getstatic       dev/nuker/pyro/fc.0:I
        //   527: ifeq            535
        //   530: ldc             855201320
        //   532: goto            537
        //   535: ldc             -1266999808
        //   537: ldc             657159788
        //   539: ixor           
        //   540: lookupswitch {
        //          -1823446932: 568
        //          366092356: 535
        //          default: 4106
        //        }
        //   568: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7Y;
        //   571: goto            575
        //   574: athrow         
        //   575: invokevirtual   dev/nuker/pyro/f7Y.1:()Ldev/nuker/pyro/f0a;
        //   578: goto            582
        //   581: athrow         
        //   582: goto            586
        //   585: athrow         
        //   586: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   589: goto            593
        //   592: athrow         
        //   593: checkcast       Ljava/lang/Boolean;
        //   596: getstatic       dev/nuker/pyro/fc.0:I
        //   599: ifeq            607
        //   602: ldc             1307051779
        //   604: goto            609
        //   607: ldc             1174092482
        //   609: ldc             170081590
        //   611: ixor           
        //   612: lookupswitch {
        //          1204501045: 607
        //          1339557876: 640
        //          default: 4136
        //        }
        //   640: goto            644
        //   643: athrow         
        //   644: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   647: goto            651
        //   650: athrow         
        //   651: ifeq            728
        //   654: getstatic       dev/nuker/pyro/f02.c:Ldev/nuker/pyro/f02;
        //   657: ldc             "\u221d\u1483\u8b1a\ub1cd\ucf70\uec00\ub225\ue72a"
        //   659: goto            663
        //   662: athrow         
        //   663: invokestatic    invokestatic   !!! ERROR
        //   666: goto            670
        //   669: athrow         
        //   670: getstatic       dev/nuker/pyro/fc.1:I
        //   673: ifeq            681
        //   676: ldc             1596133258
        //   678: goto            683
        //   681: ldc             1360268654
        //   683: ldc             243479023
        //   685: ixor           
        //   686: lookupswitch {
        //          27627528: 681
        //          1369456229: 4112
        //          default: 712
        //        }
        //   712: getstatic       dev/nuker/pyro/fZ.0:Ldev/nuker/pyro/fZ;
        //   715: ldc             1.09
        //   717: goto            721
        //   720: athrow         
        //   721: invokevirtual   dev/nuker/pyro/f02.c:(Ljava/lang/String;Ldev/nuker/pyro/fZ;F)V
        //   724: goto            728
        //   727: athrow         
        //   728: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //   731: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   734: dup            
        //   735: getstatic       dev/nuker/pyro/fc.0:I
        //   738: ifeq            746
        //   741: ldc             752416074
        //   743: goto            748
        //   746: ldc             -500834094
        //   748: ldc             25800307
        //   750: ixor           
        //   751: lookupswitch {
        //          760306489: 4052
        //          2100421834: 746
        //          default: 776
        //        }
        //   776: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70159_w:D
        //   779: ldc2_w          1.0199999809265137
        //   782: dmul           
        //   783: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70159_w:D
        //   786: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //   789: getstatic       dev/nuker/pyro/fc.c:I
        //   792: ifge            800
        //   795: ldc             2131893836
        //   797: goto            803
        //   800: ldc_w           204122224
        //   803: ldc_w           1924898843
        //   806: ixor           
        //   807: lookupswitch {
        //          229228119: 4026
        //          1956639407: 800
        //          default: 832
        //        }
        //   832: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   835: dup            
        //   836: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70179_y:D
        //   839: ldc2_w          1.0199999809265137
        //   842: dmul           
        //   843: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70179_y:D
        //   846: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //   849: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   852: getstatic       dev/nuker/pyro/fc.0:I
        //   855: ifeq            864
        //   858: ldc_w           773186401
        //   861: goto            867
        //   864: ldc_w           -784143761
        //   867: ldc_w           1953675632
        //   870: ixor           
        //   871: lookupswitch {
        //          -1523559649: 896
        //          1516722705: 864
        //          default: 4040
        //        }
        //   896: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70122_E:Z
        //   899: ifeq            965
        //   902: goto            906
        //   905: athrow         
        //   906: invokestatic    dev/nuker/pyro/fbl.d:()Z
        //   909: goto            913
        //   912: athrow         
        //   913: ifeq            965
        //   916: getstatic       dev/nuker/pyro/fc.0:I
        //   919: ifeq            928
        //   922: ldc_w           -1309491917
        //   925: goto            931
        //   928: ldc_w           1517166803
        //   931: ldc_w           1148568142
        //   934: ixor           
        //   935: lookupswitch {
        //          -175669379: 928
        //          505143965: 960
        //          default: 4130
        //        }
        //   960: aload_0        
        //   961: iconst_2       
        //   962: putfield        dev/nuker/pyro/f95.c:I
        //   965: getstatic       dev/nuker/pyro/fc.c:I
        //   968: ifge            977
        //   971: ldc_w           -639709858
        //   974: goto            980
        //   977: ldc_w           1749830491
        //   980: ldc_w           -942599678
        //   983: ixor           
        //   984: lookupswitch {
        //          -1561485807: 977
        //          504356700: 4128
        //          default: 1012
        //        }
        //  1012: aload_0        
        //  1013: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //  1016: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1019: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  1022: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //  1025: getstatic       dev/nuker/pyro/fc.0:I
        //  1028: ifeq            1037
        //  1031: ldc_w           1340321850
        //  1034: goto            1040
        //  1037: ldc_w           1950898245
        //  1040: ldc_w           1375192436
        //  1043: ixor           
        //  1044: lookupswitch {
        //          -1944717351: 1037
        //          504657230: 4062
        //          default: 1072
        //        }
        //  1072: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1075: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  1078: d2i            
        //  1079: i2d            
        //  1080: dsub           
        //  1081: getstatic       dev/nuker/pyro/fc.0:I
        //  1084: ifeq            1093
        //  1087: ldc_w           -2012075077
        //  1090: goto            1096
        //  1093: ldc_w           -1379266176
        //  1096: ldc_w           -504990914
        //  1099: ixor           
        //  1100: lookupswitch {
        //          881417011: 1093
        //          1777621125: 4138
        //          default: 1128
        //        }
        //  1128: goto            1132
        //  1131: athrow         
        //  1132: invokespecial   dev/nuker/pyro/f95.c:(D)D
        //  1135: goto            1139
        //  1138: athrow         
        //  1139: aload_0        
        //  1140: ldc2_w          0.138
        //  1143: getstatic       dev/nuker/pyro/fc.c:I
        //  1146: ifge            1155
        //  1149: ldc_w           -1911136717
        //  1152: goto            1158
        //  1155: ldc_w           -833467933
        //  1158: ldc_w           604685500
        //  1161: ixor           
        //  1162: lookupswitch {
        //          -1440966001: 1155
        //          -363295393: 1188
        //          default: 4084
        //        }
        //  1188: goto            1192
        //  1191: athrow         
        //  1192: invokespecial   dev/nuker/pyro/f95.c:(D)D
        //  1195: goto            1199
        //  1198: athrow         
        //  1199: dcmpl          
        //  1200: ifne            1356
        //  1203: getstatic       dev/nuker/pyro/fc.0:I
        //  1206: ifeq            1215
        //  1209: ldc_w           -761112814
        //  1212: goto            1218
        //  1215: ldc_w           -860241738
        //  1218: ldc_w           469002498
        //  1221: ixor           
        //  1222: lookupswitch {
        //          -917094896: 4070
        //          -53316520: 1215
        //          default: 1248
        //        }
        //  1248: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //  1251: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1254: dup            
        //  1255: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  1258: ldc2_w          0.08
        //  1261: dsub           
        //  1262: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  1265: aload_1        
        //  1266: aload_1        
        //  1267: goto            1271
        //  1270: athrow         
        //  1271: invokevirtual   dev/nuker/pyro/f3e.c:()D
        //  1274: goto            1278
        //  1277: athrow         
        //  1278: ldc2_w          0.09316090325960147
        //  1281: dsub           
        //  1282: getstatic       dev/nuker/pyro/fc.1:I
        //  1285: ifeq            1294
        //  1288: ldc_w           863926804
        //  1291: goto            1297
        //  1294: ldc_w           -825784311
        //  1297: ldc_w           851351083
        //  1300: ixor           
        //  1301: lookupswitch {
        //          -228276702: 1294
        //          29420607: 4034
        //          default: 1328
        //        }
        //  1328: goto            1332
        //  1331: athrow         
        //  1332: invokevirtual   dev/nuker/pyro/f3e.c:(D)V
        //  1335: goto            1339
        //  1338: athrow         
        //  1339: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //  1342: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1345: dup            
        //  1346: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  1349: ldc2_w          0.09316090325960147
        //  1352: dsub           
        //  1353: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  1356: aload_0        
        //  1357: getstatic       dev/nuker/pyro/fc.c:I
        //  1360: ifge            1369
        //  1363: ldc_w           671501423
        //  1366: goto            1372
        //  1369: ldc_w           -882946014
        //  1372: ldc_w           -164659683
        //  1375: ixor           
        //  1376: lookupswitch {
        //          -567725454: 4082
        //          1843173015: 1369
        //          default: 1404
        //        }
        //  1404: getfield        dev/nuker/pyro/f95.c:I
        //  1407: iconst_1       
        //  1408: if_icmpne       1562
        //  1411: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //  1414: getstatic       dev/nuker/pyro/fc.c:I
        //  1417: ifge            1426
        //  1420: ldc_w           813792299
        //  1423: goto            1429
        //  1426: ldc_w           -2001777670
        //  1429: ldc_w           982641384
        //  1432: ixor           
        //  1433: lookupswitch {
        //          -1304518382: 1460
        //          168859331: 1426
        //          default: 4072
        //        }
        //  1460: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1463: getfield        net/minecraft/client/entity/EntityPlayerSP.field_191988_bg:F
        //  1466: fconst_0       
        //  1467: fcmpl          
        //  1468: ifne            1485
        //  1471: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //  1474: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1477: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70702_br:F
        //  1480: fconst_0       
        //  1481: fcmpl          
        //  1482: ifeq            1562
        //  1485: aload_0        
        //  1486: iconst_2       
        //  1487: putfield        dev/nuker/pyro/f95.c:I
        //  1490: aload_0        
        //  1491: ldc2_w          1.38
        //  1494: goto            1498
        //  1497: athrow         
        //  1498: invokestatic    dev/nuker/pyro/f95.1:()D
        //  1501: goto            1505
        //  1504: athrow         
        //  1505: dmul           
        //  1506: ldc2_w          0.01
        //  1509: dsub           
        //  1510: getstatic       dev/nuker/pyro/fc.1:I
        //  1513: ifeq            1522
        //  1516: ldc_w           -1290767475
        //  1519: goto            1525
        //  1522: ldc_w           1159742811
        //  1525: ldc_w           -419480340
        //  1528: ixor           
        //  1529: lookupswitch {
        //          -944308468: 1522
        //          1441746785: 4100
        //          default: 1556
        //        }
        //  1556: putfield        dev/nuker/pyro/f95.c:D
        //  1559: goto            2551
        //  1562: aload_0        
        //  1563: getfield        dev/nuker/pyro/f95.c:I
        //  1566: iconst_2       
        //  1567: if_icmpne       1709
        //  1570: getstatic       dev/nuker/pyro/fc.0:I
        //  1573: ifeq            1582
        //  1576: ldc_w           -1613005743
        //  1579: goto            1585
        //  1582: ldc_w           1607813799
        //  1585: ldc_w           -173283841
        //  1588: ixor           
        //  1589: lookupswitch {
        //          -1434538152: 1616
        //          1785764270: 1582
        //          default: 4046
        //        }
        //  1616: aload_0        
        //  1617: iconst_3       
        //  1618: putfield        dev/nuker/pyro/f95.c:I
        //  1621: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //  1624: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1627: ldc2_w          0.399399995803833
        //  1630: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  1633: aload_1        
        //  1634: ldc2_w          0.399399995803833
        //  1637: goto            1641
        //  1640: athrow         
        //  1641: invokevirtual   dev/nuker/pyro/f3e.c:(D)V
        //  1644: goto            1648
        //  1647: athrow         
        //  1648: aload_0        
        //  1649: dup            
        //  1650: getstatic       dev/nuker/pyro/fc.0:I
        //  1653: ifeq            1662
        //  1656: ldc_w           470181797
        //  1659: goto            1665
        //  1662: ldc_w           -727624709
        //  1665: ldc_w           248542525
        //  1668: ixor           
        //  1669: lookupswitch {
        //          -630118714: 1696
        //          316019352: 1662
        //          default: 4064
        //        }
        //  1696: getfield        dev/nuker/pyro/f95.c:D
        //  1699: ldc2_w          2.149
        //  1702: dmul           
        //  1703: putfield        dev/nuker/pyro/f95.c:D
        //  1706: goto            2551
        //  1709: aload_0        
        //  1710: getfield        dev/nuker/pyro/f95.c:I
        //  1713: iconst_3       
        //  1714: if_icmpne       1895
        //  1717: aload_0        
        //  1718: iconst_4       
        //  1719: putfield        dev/nuker/pyro/f95.c:I
        //  1722: ldc2_w          0.66
        //  1725: getstatic       dev/nuker/pyro/fc.0:I
        //  1728: ifeq            1737
        //  1731: ldc_w           -1760794558
        //  1734: goto            1740
        //  1737: ldc_w           1808243180
        //  1740: ldc_w           -767809054
        //  1743: ixor           
        //  1744: lookupswitch {
        //          -846441691: 1737
        //          1160790432: 4090
        //          default: 1772
        //        }
        //  1772: aload_0        
        //  1773: getstatic       dev/nuker/pyro/fc.c:I
        //  1776: ifge            1785
        //  1779: ldc_w           1172066285
        //  1782: goto            1788
        //  1785: ldc_w           -1973968779
        //  1788: ldc_w           444506604
        //  1791: ixor           
        //  1792: lookupswitch {
        //          -1738856022: 1785
        //          1604513281: 4118
        //          default: 1820
        //        }
        //  1820: getfield        dev/nuker/pyro/f95.0:D
        //  1823: getstatic       dev/nuker/pyro/fc.1:I
        //  1826: ifeq            1835
        //  1829: ldc_w           -660573777
        //  1832: goto            1838
        //  1835: ldc_w           1156376861
        //  1838: ldc_w           -1056600025
        //  1841: ixor           
        //  1842: lookupswitch {
        //          -2048296646: 1868
        //          430301576: 1835
        //          default: 4028
        //        }
        //  1868: goto            1872
        //  1871: athrow         
        //  1872: invokestatic    dev/nuker/pyro/f95.1:()D
        //  1875: goto            1879
        //  1878: athrow         
        //  1879: dsub           
        //  1880: dmul           
        //  1881: dstore_2       
        //  1882: aload_0        
        //  1883: aload_0        
        //  1884: getfield        dev/nuker/pyro/f95.0:D
        //  1887: dload_2        
        //  1888: dsub           
        //  1889: putfield        dev/nuker/pyro/f95.c:D
        //  1892: goto            2551
        //  1895: getstatic       dev/nuker/pyro/fc.1:I
        //  1898: ifeq            1907
        //  1901: ldc_w           968820823
        //  1904: goto            1910
        //  1907: ldc_w           -1370863500
        //  1910: ldc_w           701065166
        //  1913: ixor           
        //  1914: lookupswitch {
        //          -624391652: 1907
        //          276197273: 4096
        //          default: 1940
        //        }
        //  1940: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //  1943: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1946: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //  1949: getstatic       dev/nuker/pyro/fc.1:I
        //  1952: ifeq            1961
        //  1955: ldc_w           -1701897002
        //  1958: goto            1964
        //  1961: ldc_w           545645071
        //  1964: ldc_w           -360006055
        //  1967: ixor           
        //  1968: lookupswitch {
        //          1766975018: 1961
        //          1879417487: 4126
        //          default: 1996
        //        }
        //  1996: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1999: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //  2002: getstatic       dev/nuker/pyro/fc.c:I
        //  2005: ifge            2014
        //  2008: ldc_w           -1649055237
        //  2011: goto            2017
        //  2014: ldc_w           866087388
        //  2017: ldc_w           1582378758
        //  2020: ixor           
        //  2021: lookupswitch {
        //          -1008449795: 2014
        //          1842241242: 2048
        //          default: 4108
        //        }
        //  2048: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2051: getstatic       dev/nuker/pyro/fc.1:I
        //  2054: ifeq            2063
        //  2057: ldc_w           954744972
        //  2060: goto            2066
        //  2063: ldc_w           -533624311
        //  2066: ldc_w           -916038761
        //  2069: ixor           
        //  2070: lookupswitch {
        //          -1887333590: 2063
        //          -242345189: 4024
        //          default: 2096
        //        }
        //  2096: goto            2100
        //  2099: athrow         
        //  2100: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //  2103: goto            2107
        //  2106: athrow         
        //  2107: dconst_0       
        //  2108: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //  2111: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2114: getstatic       dev/nuker/pyro/fc.1:I
        //  2117: ifeq            2126
        //  2120: ldc_w           1765711054
        //  2123: goto            2129
        //  2126: ldc_w           563207584
        //  2129: ldc_w           527224597
        //  2132: ixor           
        //  2133: lookupswitch {
        //          1056772789: 2160
        //          1985106907: 2126
        //          default: 4022
        //        }
        //  2160: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  2163: dconst_0       
        //  2164: getstatic       dev/nuker/pyro/fc.c:I
        //  2167: ifge            2176
        //  2170: ldc_w           -1409259917
        //  2173: goto            2179
        //  2176: ldc_w           402816370
        //  2179: ldc_w           2057517097
        //  2182: ixor           
        //  2183: lookupswitch {
        //          -693936550: 2176
        //          1654736219: 2208
        //          default: 4110
        //        }
        //  2208: goto            2212
        //  2211: athrow         
        //  2212: invokevirtual   net/minecraft/util/math/AxisAlignedBB.func_72317_d:(DDD)Lnet/minecraft/util/math/AxisAlignedBB;
        //  2215: goto            2219
        //  2218: athrow         
        //  2219: getstatic       dev/nuker/pyro/fc.1:I
        //  2222: ifeq            2231
        //  2225: ldc_w           1010516763
        //  2228: goto            2234
        //  2231: ldc_w           -878425808
        //  2234: ldc_w           337597240
        //  2237: ixor           
        //  2238: lookupswitch {
        //          -1487313146: 2231
        //          673452067: 4056
        //          default: 2264
        //        }
        //  2264: goto            2268
        //  2267: athrow         
        //  2268: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_184144_a:(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
        //  2271: goto            2275
        //  2274: athrow         
        //  2275: goto            2279
        //  2278: athrow         
        //  2279: invokeinterface java/util/List.size:()I
        //  2284: goto            2288
        //  2287: athrow         
        //  2288: ifgt            2349
        //  2291: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //  2294: getstatic       dev/nuker/pyro/fc.c:I
        //  2297: ifge            2306
        //  2300: ldc_w           -810441340
        //  2303: goto            2309
        //  2306: ldc_w           209015239
        //  2309: ldc_w           -9947402
        //  2312: ixor           
        //  2313: lookupswitch {
        //          -216176847: 2340
        //          819565426: 2306
        //          default: 4092
        //        }
        //  2340: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2343: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70124_G:Z
        //  2346: ifeq            2401
        //  2349: getstatic       dev/nuker/pyro/fc.1:I
        //  2352: ifeq            2361
        //  2355: ldc_w           1394401608
        //  2358: goto            2364
        //  2361: ldc_w           1208905354
        //  2364: ldc_w           -1098105236
        //  2367: ixor           
        //  2368: lookupswitch {
        //          -309272796: 4088
        //          1140149387: 2361
        //          default: 2396
        //        }
        //  2396: aload_0        
        //  2397: iconst_1       
        //  2398: putfield        dev/nuker/pyro/f95.c:I
        //  2401: aload_0        
        //  2402: aload_0        
        //  2403: getstatic       dev/nuker/pyro/fc.c:I
        //  2406: ifge            2415
        //  2409: ldc_w           -1079580301
        //  2412: goto            2418
        //  2415: ldc_w           -866818684
        //  2418: ldc_w           1550519912
        //  2421: ixor           
        //  2422: lookupswitch {
        //          -473045221: 4102
        //          -281123512: 2415
        //          default: 2448
        //        }
        //  2448: getfield        dev/nuker/pyro/f95.0:D
        //  2451: aload_0        
        //  2452: getstatic       dev/nuker/pyro/fc.0:I
        //  2455: ifeq            2464
        //  2458: ldc_w           -554616827
        //  2461: goto            2467
        //  2464: ldc_w           -371448934
        //  2467: ldc_w           -1539789362
        //  2470: ixor           
        //  2471: lookupswitch {
        //          1306824276: 2496
        //          2060031435: 2464
        //          default: 4074
        //        }
        //  2496: getfield        dev/nuker/pyro/f95.0:D
        //  2499: ldc2_w          159.0
        //  2502: ddiv           
        //  2503: dsub           
        //  2504: getstatic       dev/nuker/pyro/fc.1:I
        //  2507: ifeq            2516
        //  2510: ldc_w           -1672959026
        //  2513: goto            2519
        //  2516: ldc_w           -410414982
        //  2519: ldc_w           -1160130288
        //  2522: ixor           
        //  2523: lookupswitch {
        //          92113078: 2516
        //          647068382: 4032
        //          default: 2548
        //        }
        //  2548: putfield        dev/nuker/pyro/f95.c:D
        //  2551: aload_0        
        //  2552: aload_0        
        //  2553: getfield        dev/nuker/pyro/f95.c:D
        //  2556: goto            2560
        //  2559: athrow         
        //  2560: invokestatic    dev/nuker/pyro/f95.1:()D
        //  2563: goto            2567
        //  2566: athrow         
        //  2567: goto            2571
        //  2570: athrow         
        //  2571: invokestatic    java/lang/Math.max:(DD)D
        //  2574: goto            2578
        //  2577: athrow         
        //  2578: putfield        dev/nuker/pyro/f95.c:D
        //  2581: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //  2584: getstatic       dev/nuker/pyro/fc.1:I
        //  2587: ifeq            2596
        //  2590: ldc_w           -543534640
        //  2593: goto            2599
        //  2596: ldc_w           -1733072887
        //  2599: ldc_w           696664742
        //  2602: ixor           
        //  2603: lookupswitch {
        //          -1321915729: 2628
        //          -165932170: 2596
        //          default: 4030
        //        }
        //  2628: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2631: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71158_b:Lnet/minecraft/util/MovementInput;
        //  2634: getfield        net/minecraft/util/MovementInput.field_192832_b:F
        //  2637: getstatic       dev/nuker/pyro/fc.c:I
        //  2640: ifge            2649
        //  2643: ldc_w           1346172556
        //  2646: goto            2652
        //  2649: ldc_w           1117133605
        //  2652: ldc_w           1375586808
        //  2655: ixor           
        //  2656: lookupswitch {
        //          29441908: 4086
        //          1735724142: 2649
        //          default: 2684
        //        }
        //  2684: fstore_2       
        //  2685: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //  2688: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2691: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71158_b:Lnet/minecraft/util/MovementInput;
        //  2694: getfield        net/minecraft/util/MovementInput.field_78902_a:F
        //  2697: fstore_3       
        //  2698: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //  2701: getstatic       dev/nuker/pyro/fc.c:I
        //  2704: ifge            2713
        //  2707: ldc_w           -198207813
        //  2710: goto            2716
        //  2713: ldc_w           -1366705556
        //  2716: ldc_w           1899989341
        //  2719: ixor           
        //  2720: lookupswitch {
        //          -2062540826: 4098
        //          -1106586655: 2713
        //          default: 2748
        //        }
        //  2748: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2751: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //  2754: fstore          4
        //  2756: getstatic       dev/nuker/pyro/fc.1:I
        //  2759: ifeq            2768
        //  2762: ldc_w           1352187229
        //  2765: goto            2771
        //  2768: ldc_w           -1723043479
        //  2771: ldc_w           -719162857
        //  2774: ixor           
        //  2775: lookupswitch {
        //          -2051354806: 4036
        //          771368066: 2768
        //          default: 2800
        //        }
        //  2800: fload_2        
        //  2801: fconst_0       
        //  2802: fcmpl          
        //  2803: ifne            2812
        //  2806: ldc_w           -1412441114
        //  2809: goto            2815
        //  2812: ldc_w           -1412441095
        //  2815: ldc_w           1999509865
        //  2818: ixor           
        //  2819: tableswitch {
        //          -1178368738: 2840
        //          -1178368737: 2920
        //          default: 2806
        //        }
        //  2840: fload_3        
        //  2841: fconst_0       
        //  2842: fcmpl          
        //  2843: ifne            2920
        //  2846: aload_1        
        //  2847: dconst_0       
        //  2848: goto            2852
        //  2851: athrow         
        //  2852: invokevirtual   dev/nuker/pyro/f3e.1:(D)V
        //  2855: goto            2859
        //  2858: athrow         
        //  2859: getstatic       dev/nuker/pyro/fc.c:I
        //  2862: ifge            2871
        //  2865: ldc_w           2124748283
        //  2868: goto            2874
        //  2871: ldc_w           -1699933549
        //  2874: ldc_w           415734554
        //  2877: ixor           
        //  2878: lookupswitch {
        //          -2106947191: 2904
        //          1717735137: 2871
        //          default: 4116
        //        }
        //  2904: aload_1        
        //  2905: dconst_0       
        //  2906: goto            2910
        //  2909: athrow         
        //  2910: invokevirtual   dev/nuker/pyro/f3e.0:(D)V
        //  2913: goto            2917
        //  2916: athrow         
        //  2917: goto            3298
        //  2920: fload_2        
        //  2921: fconst_0       
        //  2922: fcmpl          
        //  2923: ifeq            2932
        //  2926: ldc_w           -915206650
        //  2929: goto            2935
        //  2932: ldc_w           -915206647
        //  2935: ldc_w           -1224454255
        //  2938: ixor           
        //  2939: tableswitch {
        //          -51477714: 2960
        //          -51477713: 3298
        //          default: 2926
        //        }
        //  2960: getstatic       dev/nuker/pyro/fc.c:I
        //  2963: ifge            2972
        //  2966: ldc_w           -1124050492
        //  2969: goto            2975
        //  2972: ldc_w           -655515124
        //  2975: ldc_w           1219088322
        //  2978: ixor           
        //  2979: lookupswitch {
        //          -1874563634: 3004
        //          -173435386: 2972
        //          default: 4114
        //        }
        //  3004: fload_3        
        //  3005: fconst_1       
        //  3006: fcmpl          
        //  3007: iflt            3080
        //  3010: getstatic       dev/nuker/pyro/fc.c:I
        //  3013: ifge            3022
        //  3016: ldc_w           830890180
        //  3019: goto            3025
        //  3022: ldc_w           -1780332456
        //  3025: ldc_w           211226757
        //  3028: ixor           
        //  3029: lookupswitch {
        //          -1720362787: 3056
        //          1024553025: 3022
        //          default: 4058
        //        }
        //  3056: fload           4
        //  3058: fload_2        
        //  3059: fconst_0       
        //  3060: fcmpl          
        //  3061: ifle            3069
        //  3064: bipush          -45
        //  3066: goto            3071
        //  3069: bipush          45
        //  3071: i2f            
        //  3072: fadd           
        //  3073: fstore          4
        //  3075: fconst_0       
        //  3076: fstore_3       
        //  3077: goto            3277
        //  3080: getstatic       dev/nuker/pyro/fc.c:I
        //  3083: ifge            3092
        //  3086: ldc_w           1274383391
        //  3089: goto            3095
        //  3092: ldc_w           -806322942
        //  3095: ldc_w           1077010990
        //  3098: ixor           
        //  3099: lookupswitch {
        //          -345121914: 3092
        //          197422641: 4038
        //          default: 3124
        //        }
        //  3124: fload_3        
        //  3125: ldc_w           -1.0
        //  3128: fcmpg          
        //  3129: ifgt            3138
        //  3132: ldc_w           -886792093
        //  3135: goto            3141
        //  3138: ldc_w           -886792084
        //  3141: ldc_w           -963325820
        //  3144: ixor           
        //  3145: tableswitch {
        //          459334094: 3168
        //          459334095: 3277
        //          default: 3132
        //        }
        //  3168: getstatic       dev/nuker/pyro/fc.c:I
        //  3171: ifge            3180
        //  3174: ldc_w           320950956
        //  3177: goto            3183
        //  3180: ldc_w           209323446
        //  3183: ldc_w           -1940874438
        //  3186: ixor           
        //  3187: lookupswitch {
        //          -1619932778: 4122
        //          543241853: 3180
        //          default: 3212
        //        }
        //  3212: fload           4
        //  3214: fload_2        
        //  3215: fconst_0       
        //  3216: fcmpl          
        //  3217: ifle            3225
        //  3220: bipush          45
        //  3222: goto            3227
        //  3225: bipush          -45
        //  3227: i2f            
        //  3228: fadd           
        //  3229: fstore          4
        //  3231: fconst_0       
        //  3232: getstatic       dev/nuker/pyro/fc.c:I
        //  3235: ifge            3244
        //  3238: ldc_w           -1403296494
        //  3241: goto            3247
        //  3244: ldc_w           -202022509
        //  3247: ldc_w           1998938509
        //  3250: ixor           
        //  3251: lookupswitch {
        //          -1487042085: 3244
        //          -612498273: 4050
        //          default: 3276
        //        }
        //  3276: fstore_3       
        //  3277: fload_2        
        //  3278: fconst_0       
        //  3279: fcmpl          
        //  3280: ifle            3288
        //  3283: fconst_1       
        //  3284: fstore_2       
        //  3285: goto            3298
        //  3288: fload_2        
        //  3289: fconst_0       
        //  3290: fcmpg          
        //  3291: ifge            3298
        //  3294: ldc_w           -1.0
        //  3297: fstore_2       
        //  3298: getstatic       dev/nuker/pyro/fc.1:I
        //  3301: ifeq            3310
        //  3304: ldc_w           -457729234
        //  3307: goto            3313
        //  3310: ldc_w           1688569205
        //  3313: ldc_w           -1035024987
        //  3316: ixor           
        //  3317: lookupswitch {
        //          -1494531888: 3344
        //          653876875: 3310
        //          default: 4140
        //        }
        //  3344: fload           4
        //  3346: ldc_w           90.0
        //  3349: fadd           
        //  3350: f2d            
        //  3351: getstatic       dev/nuker/pyro/fc.0:I
        //  3354: ifeq            3363
        //  3357: ldc_w           1429892483
        //  3360: goto            3366
        //  3363: ldc_w           257693892
        //  3366: ldc_w           801264497
        //  3369: ixor           
        //  3370: lookupswitch {
        //          2063089394: 4078
        //          2086331897: 3363
        //          default: 3396
        //        }
        //  3396: goto            3400
        //  3399: athrow         
        //  3400: invokestatic    java/lang/Math.toRadians:(D)D
        //  3403: goto            3407
        //  3406: athrow         
        //  3407: goto            3411
        //  3410: athrow         
        //  3411: invokestatic    java/lang/Math.cos:(D)D
        //  3414: goto            3418
        //  3417: athrow         
        //  3418: getstatic       dev/nuker/pyro/fc.c:I
        //  3421: ifge            3430
        //  3424: ldc_w           365827538
        //  3427: goto            3433
        //  3430: ldc_w           409597841
        //  3433: ldc_w           -414883945
        //  3436: ixor           
        //  3437: lookupswitch {
        //          -225752507: 4076
        //          1010558705: 3430
        //          default: 3464
        //        }
        //  3464: dstore          5
        //  3466: getstatic       dev/nuker/pyro/fc.c:I
        //  3469: ifge            3478
        //  3472: ldc_w           1011275285
        //  3475: goto            3481
        //  3478: ldc_w           783853062
        //  3481: ldc_w           1734335519
        //  3484: ixor           
        //  3485: lookupswitch {
        //          1528367626: 4066
        //          1687613528: 3478
        //          default: 3512
        //        }
        //  3512: fload           4
        //  3514: ldc_w           90.0
        //  3517: fadd           
        //  3518: f2d            
        //  3519: goto            3523
        //  3522: athrow         
        //  3523: invokestatic    java/lang/Math.toRadians:(D)D
        //  3526: goto            3530
        //  3529: athrow         
        //  3530: goto            3534
        //  3533: athrow         
        //  3534: invokestatic    java/lang/Math.sin:(D)D
        //  3537: goto            3541
        //  3540: athrow         
        //  3541: dstore          7
        //  3543: aload_1        
        //  3544: fload_2        
        //  3545: f2d            
        //  3546: aload_0        
        //  3547: getfield        dev/nuker/pyro/f95.c:D
        //  3550: dmul           
        //  3551: dload           5
        //  3553: dmul           
        //  3554: fload_3        
        //  3555: f2d            
        //  3556: aload_0        
        //  3557: getfield        dev/nuker/pyro/f95.c:D
        //  3560: dmul           
        //  3561: getstatic       dev/nuker/pyro/fc.c:I
        //  3564: ifge            3573
        //  3567: ldc_w           1255961015
        //  3570: goto            3576
        //  3573: ldc_w           1169345226
        //  3576: ldc_w           -1882627186
        //  3579: ixor           
        //  3580: lookupswitch {
        //          -988474823: 3573
        //          -897865404: 3608
        //          default: 4068
        //        }
        //  3608: dload           7
        //  3610: dmul           
        //  3611: dadd           
        //  3612: goto            3616
        //  3615: athrow         
        //  3616: invokevirtual   dev/nuker/pyro/f3e.1:(D)V
        //  3619: goto            3623
        //  3622: athrow         
        //  3623: getstatic       dev/nuker/pyro/fc.c:I
        //  3626: ifge            3635
        //  3629: ldc_w           32198937
        //  3632: goto            3638
        //  3635: ldc_w           769832635
        //  3638: ldc_w           820367116
        //  3641: ixor           
        //  3642: lookupswitch {
        //          487029175: 3668
        //          823041557: 3635
        //          default: 4080
        //        }
        //  3668: aload_1        
        //  3669: getstatic       dev/nuker/pyro/fc.c:I
        //  3672: ifge            3681
        //  3675: ldc_w           -1605056488
        //  3678: goto            3684
        //  3681: ldc_w           1059083623
        //  3684: ldc_w           -1161373132
        //  3687: ixor           
        //  3688: lookupswitch {
        //          -2048487597: 3716
        //          445780524: 3681
        //          default: 4124
        //        }
        //  3716: fload_2        
        //  3717: f2d            
        //  3718: getstatic       dev/nuker/pyro/fc.0:I
        //  3721: ifeq            3730
        //  3724: ldc_w           -293392276
        //  3727: goto            3733
        //  3730: ldc_w           -290869650
        //  3733: ldc_w           -778985071
        //  3736: ixor           
        //  3737: lookupswitch {
        //          1058181629: 4048
        //          2067443784: 3730
        //          default: 3764
        //        }
        //  3764: aload_0        
        //  3765: getfield        dev/nuker/pyro/f95.c:D
        //  3768: dmul           
        //  3769: getstatic       dev/nuker/pyro/fc.0:I
        //  3772: ifeq            3781
        //  3775: ldc_w           929458638
        //  3778: goto            3784
        //  3781: ldc_w           2078480746
        //  3784: ldc_w           662929301
        //  3787: ixor           
        //  3788: lookupswitch {
        //          283448923: 3781
        //          1549821695: 3816
        //          default: 4104
        //        }
        //  3816: dload           7
        //  3818: dmul           
        //  3819: fload_3        
        //  3820: f2d            
        //  3821: aload_0        
        //  3822: getfield        dev/nuker/pyro/f95.c:D
        //  3825: dmul           
        //  3826: dload           5
        //  3828: dmul           
        //  3829: dsub           
        //  3830: goto            3834
        //  3833: athrow         
        //  3834: invokevirtual   dev/nuker/pyro/f3e.0:(D)V
        //  3837: goto            3841
        //  3840: athrow         
        //  3841: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //  3844: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3847: ldc_w           0.6
        //  3850: getstatic       dev/nuker/pyro/fc.1:I
        //  3853: ifeq            3862
        //  3856: ldc_w           777604762
        //  3859: goto            3865
        //  3862: ldc_w           742558642
        //  3865: ldc_w           -94488501
        //  3868: ixor           
        //  3869: lookupswitch {
        //          -776337258: 3862
        //          -737708335: 4044
        //          default: 3896
        //        }
        //  3896: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70138_W:F
        //  3899: fload_2        
        //  3900: fconst_0       
        //  3901: fcmpl          
        //  3902: ifne            4021
        //  3905: fload_3        
        //  3906: fconst_0       
        //  3907: fcmpl          
        //  3908: ifne            3917
        //  3911: ldc_w           -2096683679
        //  3914: goto            3920
        //  3917: ldc_w           -2096683674
        //  3920: ldc_w           557281034
        //  3923: ixor           
        //  3924: tableswitch {
        //          1147180246: 3948
        //          1147180247: 4021
        //          default: 3911
        //        }
        //  3948: aload_1        
        //  3949: dconst_0       
        //  3950: goto            3954
        //  3953: athrow         
        //  3954: invokevirtual   dev/nuker/pyro/f3e.1:(D)V
        //  3957: goto            3961
        //  3960: athrow         
        //  3961: getstatic       dev/nuker/pyro/fc.1:I
        //  3964: ifeq            3973
        //  3967: ldc_w           146441756
        //  3970: goto            3976
        //  3973: ldc_w           1441092449
        //  3976: ldc_w           1228674630
        //  3979: ixor           
        //  3980: lookupswitch {
        //          1099337818: 4132
        //          1463857586: 3973
        //          default: 4008
        //        }
        //  4008: aload_1        
        //  4009: dconst_0       
        //  4010: goto            4014
        //  4013: athrow         
        //  4014: invokevirtual   dev/nuker/pyro/f3e.0:(D)V
        //  4017: goto            4021
        //  4020: athrow         
        //  4021: return         
        //  4022: aconst_null    
        //  4023: athrow         
        //  4024: aconst_null    
        //  4025: athrow         
        //  4026: aconst_null    
        //  4027: athrow         
        //  4028: aconst_null    
        //  4029: athrow         
        //  4030: aconst_null    
        //  4031: athrow         
        //  4032: aconst_null    
        //  4033: athrow         
        //  4034: aconst_null    
        //  4035: athrow         
        //  4036: aconst_null    
        //  4037: athrow         
        //  4038: aconst_null    
        //  4039: athrow         
        //  4040: aconst_null    
        //  4041: athrow         
        //  4042: aconst_null    
        //  4043: athrow         
        //  4044: aconst_null    
        //  4045: athrow         
        //  4046: aconst_null    
        //  4047: athrow         
        //  4048: aconst_null    
        //  4049: athrow         
        //  4050: aconst_null    
        //  4051: athrow         
        //  4052: aconst_null    
        //  4053: athrow         
        //  4054: aconst_null    
        //  4055: athrow         
        //  4056: aconst_null    
        //  4057: athrow         
        //  4058: aconst_null    
        //  4059: athrow         
        //  4060: aconst_null    
        //  4061: athrow         
        //  4062: aconst_null    
        //  4063: athrow         
        //  4064: aconst_null    
        //  4065: athrow         
        //  4066: aconst_null    
        //  4067: athrow         
        //  4068: aconst_null    
        //  4069: athrow         
        //  4070: aconst_null    
        //  4071: athrow         
        //  4072: aconst_null    
        //  4073: athrow         
        //  4074: aconst_null    
        //  4075: athrow         
        //  4076: aconst_null    
        //  4077: athrow         
        //  4078: aconst_null    
        //  4079: athrow         
        //  4080: aconst_null    
        //  4081: athrow         
        //  4082: aconst_null    
        //  4083: athrow         
        //  4084: aconst_null    
        //  4085: athrow         
        //  4086: aconst_null    
        //  4087: athrow         
        //  4088: aconst_null    
        //  4089: athrow         
        //  4090: aconst_null    
        //  4091: athrow         
        //  4092: aconst_null    
        //  4093: athrow         
        //  4094: aconst_null    
        //  4095: athrow         
        //  4096: aconst_null    
        //  4097: athrow         
        //  4098: aconst_null    
        //  4099: athrow         
        //  4100: aconst_null    
        //  4101: athrow         
        //  4102: aconst_null    
        //  4103: athrow         
        //  4104: aconst_null    
        //  4105: athrow         
        //  4106: aconst_null    
        //  4107: athrow         
        //  4108: aconst_null    
        //  4109: athrow         
        //  4110: aconst_null    
        //  4111: athrow         
        //  4112: aconst_null    
        //  4113: athrow         
        //  4114: aconst_null    
        //  4115: athrow         
        //  4116: aconst_null    
        //  4117: athrow         
        //  4118: aconst_null    
        //  4119: athrow         
        //  4120: aconst_null    
        //  4121: athrow         
        //  4122: aconst_null    
        //  4123: athrow         
        //  4124: aconst_null    
        //  4125: athrow         
        //  4126: aconst_null    
        //  4127: athrow         
        //  4128: aconst_null    
        //  4129: athrow         
        //  4130: aconst_null    
        //  4131: athrow         
        //  4132: aconst_null    
        //  4133: athrow         
        //  4134: aconst_null    
        //  4135: athrow         
        //  4136: aconst_null    
        //  4137: athrow         
        //  4138: aconst_null    
        //  4139: athrow         
        //  4140: aconst_null    
        //  4141: athrow         
        //  4142: aconst_null    
        //  4143: athrow         
        //  4144: pop            
        //  4145: goto            24
        //  4148: pop            
        //  4149: aconst_null    
        //  4150: goto            4144
        //  4153: dup            
        //  4154: ifnull          4144
        //  4157: checkcast       Ljava/lang/Throwable;
        //  4160: athrow         
        //  4161: dup            
        //  4162: ifnull          4148
        //  4165: checkcast       Ljava/lang/Throwable;
        //  4168: athrow         
        //  4169: aconst_null    
        //  4170: athrow         
        //    StackMapTable: 01 C1 43 07 00 43 04 FF 00 0B 00 00 00 01 07 00 43 FD 00 03 07 00 03 07 00 7B 43 07 00 43 40 07 00 7B 45 07 00 43 40 07 00 80 53 07 00 8D FF 00 01 00 02 07 00 03 07 00 7B 00 02 07 00 8D 01 5D 07 00 8D 4D 07 00 95 FF 00 01 00 02 07 00 03 07 00 7B 00 02 07 00 95 01 5B 07 00 95 42 07 00 43 40 07 00 95 45 07 00 43 40 07 02 15 4D 07 00 9A FF 00 01 00 02 07 00 03 07 00 7B 00 02 07 00 9A 01 5C 07 00 9A FF 00 02 00 00 00 01 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 01 07 00 9A 45 07 00 43 40 01 05 0A 41 01 1D 43 07 00 43 40 07 00 7B 45 07 00 43 40 01 02 00 42 07 00 6F 00 45 07 00 43 40 01 02 04 41 01 1A 00 0A 41 01 1D 43 07 00 39 40 07 00 7B 45 07 00 43 00 FF 00 16 00 02 07 00 03 07 00 7B 00 02 07 00 03 07 00 03 FF 00 01 00 02 07 00 03 07 00 7B 00 03 07 00 03 07 00 03 01 FF 00 1E 00 02 07 00 03 07 00 7B 00 02 07 00 03 07 00 03 19 41 01 1B 47 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 02 07 00 BC 07 02 17 45 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 02 07 00 BC 07 02 17 42 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 02 07 00 BC 07 02 17 45 07 00 43 00 02 42 07 00 75 00 45 07 00 43 40 01 0D 41 01 1E 45 07 00 43 40 07 00 D4 45 07 00 43 40 07 00 D9 42 07 00 43 40 07 00 D9 45 07 00 43 40 07 02 15 4D 07 00 9A FF 00 01 00 02 07 00 03 07 00 7B 00 02 07 00 9A 01 5E 07 00 9A 42 07 00 43 40 07 00 9A 45 07 00 43 40 01 4A 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 02 07 00 BC 07 02 17 45 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 02 07 00 BC 07 02 17 FF 00 0A 00 02 07 00 03 07 00 7B 00 02 07 00 BC 07 02 17 FF 00 01 00 02 07 00 03 07 00 7B 00 03 07 00 BC 07 02 17 01 FF 00 1C 00 02 07 00 03 07 00 7B 00 02 07 00 BC 07 02 17 FF 00 07 00 00 00 01 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 04 07 00 BC 07 02 17 07 00 E4 02 45 07 00 43 00 FF 00 11 00 02 07 00 03 07 00 7B 00 02 07 00 F9 07 00 F9 FF 00 01 00 02 07 00 03 07 00 7B 00 03 07 00 F9 07 00 F9 01 FF 00 1B 00 02 07 00 03 07 00 7B 00 02 07 00 F9 07 00 F9 57 07 00 F0 FF 00 02 00 02 07 00 03 07 00 7B 00 02 07 00 F0 01 5C 07 00 F0 0D 51 07 00 F9 FF 00 02 00 02 07 00 03 07 00 7B 00 02 07 00 F9 01 5C 07 00 F9 FF 00 08 00 00 00 01 07 00 43 FD 00 00 07 00 03 07 00 7B 45 07 00 43 40 01 0E 42 01 1C 04 0B 42 01 1F FF 00 18 00 02 07 00 03 07 00 7B 00 03 07 00 03 03 07 00 F0 FF 00 02 00 02 07 00 03 07 00 7B 00 04 07 00 03 03 07 00 F0 01 FF 00 1F 00 02 07 00 03 07 00 7B 00 03 07 00 03 03 07 00 F0 FF 00 14 00 02 07 00 03 07 00 7B 00 02 07 00 03 03 FF 00 02 00 02 07 00 03 07 00 7B 00 03 07 00 03 03 01 FF 00 1F 00 02 07 00 03 07 00 7B 00 02 07 00 03 03 FF 00 02 00 00 00 01 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 02 07 00 03 03 45 07 00 43 40 03 FF 00 0F 00 02 07 00 03 07 00 7B 00 03 03 07 00 03 03 FF 00 02 00 02 07 00 03 07 00 7B 00 04 03 07 00 03 03 01 FF 00 1D 00 02 07 00 03 07 00 7B 00 03 03 07 00 03 03 42 07 00 6D FF 00 00 00 02 07 00 03 07 00 7B 00 03 03 07 00 03 03 45 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 02 03 03 0F 42 01 1D 55 07 00 33 FF 00 00 00 02 07 00 03 07 00 7B 00 02 07 00 7B 07 00 7B 45 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 02 07 00 7B 03 FF 00 0F 00 02 07 00 03 07 00 7B 00 02 07 00 7B 03 FF 00 02 00 02 07 00 03 07 00 7B 00 03 07 00 7B 03 01 FF 00 1E 00 02 07 00 03 07 00 7B 00 02 07 00 7B 03 42 07 00 79 FF 00 00 00 02 07 00 03 07 00 7B 00 02 07 00 7B 03 45 07 00 43 00 10 4C 07 00 03 FF 00 02 00 02 07 00 03 07 00 7B 00 02 07 00 03 01 5F 07 00 03 55 07 00 F0 FF 00 02 00 02 07 00 03 07 00 7B 00 02 07 00 F0 01 5E 07 00 F0 18 4B 07 00 6D FF 00 00 00 02 07 00 03 07 00 7B 00 02 07 00 03 03 45 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 03 07 00 03 03 03 FF 00 10 00 02 07 00 03 07 00 7B 00 02 07 00 03 03 FF 00 02 00 02 07 00 03 07 00 7B 00 03 07 00 03 03 01 FF 00 1E 00 02 07 00 03 07 00 7B 00 02 07 00 03 03 05 13 42 01 1E 57 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 02 07 00 7B 03 45 07 00 43 00 FF 00 0D 00 02 07 00 03 07 00 7B 00 02 07 00 03 07 00 03 FF 00 02 00 02 07 00 03 07 00 7B 00 03 07 00 03 07 00 03 01 FF 00 1E 00 02 07 00 03 07 00 7B 00 02 07 00 03 07 00 03 0C 5B 03 FF 00 02 00 02 07 00 03 07 00 7B 00 02 03 01 5F 03 FF 00 0C 00 02 07 00 03 07 00 7B 00 02 03 07 00 03 FF 00 02 00 02 07 00 03 07 00 7B 00 03 03 07 00 03 01 FF 00 1F 00 02 07 00 03 07 00 7B 00 02 03 07 00 03 FF 00 0E 00 02 07 00 03 07 00 7B 00 02 03 03 FF 00 02 00 02 07 00 03 07 00 7B 00 03 03 03 01 FF 00 1D 00 02 07 00 03 07 00 7B 00 02 03 03 42 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 02 03 03 45 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 03 03 03 03 0F 0B 42 01 1D FF 00 14 00 02 07 00 03 07 00 7B 00 02 07 01 82 07 00 F0 FF 00 02 00 02 07 00 03 07 00 7B 00 03 07 01 82 07 00 F0 01 FF 00 1F 00 02 07 00 03 07 00 7B 00 02 07 01 82 07 00 F0 FF 00 11 00 02 07 00 03 07 00 7B 00 03 07 01 82 07 00 F9 07 00 F0 FF 00 02 00 02 07 00 03 07 00 7B 00 04 07 01 82 07 00 F9 07 00 F0 01 FF 00 1E 00 02 07 00 03 07 00 7B 00 03 07 01 82 07 00 F9 07 00 F0 FF 00 0E 00 02 07 00 03 07 00 7B 00 03 07 01 82 07 00 F9 07 00 F9 FF 00 02 00 02 07 00 03 07 00 7B 00 04 07 01 82 07 00 F9 07 00 F9 01 FF 00 1D 00 02 07 00 03 07 00 7B 00 03 07 01 82 07 00 F9 07 00 F9 42 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 03 07 01 82 07 00 F9 07 00 F9 45 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 03 07 01 82 07 00 F9 07 01 79 FF 00 12 00 02 07 00 03 07 00 7B 00 05 07 01 82 07 00 F9 07 01 79 03 07 00 F9 FF 00 02 00 02 07 00 03 07 00 7B 00 06 07 01 82 07 00 F9 07 01 79 03 07 00 F9 01 FF 00 1E 00 02 07 00 03 07 00 7B 00 05 07 01 82 07 00 F9 07 01 79 03 07 00 F9 FF 00 0F 00 02 07 00 03 07 00 7B 00 06 07 01 82 07 00 F9 07 01 79 03 03 03 FF 00 02 00 02 07 00 03 07 00 7B 00 07 07 01 82 07 00 F9 07 01 79 03 03 03 01 FF 00 1C 00 02 07 00 03 07 00 7B 00 06 07 01 82 07 00 F9 07 01 79 03 03 03 42 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 06 07 01 82 07 00 F9 07 01 79 03 03 03 45 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 03 07 01 82 07 00 F9 07 01 79 FF 00 0B 00 02 07 00 03 07 00 7B 00 03 07 01 82 07 00 F9 07 01 79 FF 00 02 00 02 07 00 03 07 00 7B 00 04 07 01 82 07 00 F9 07 01 79 01 FF 00 1D 00 02 07 00 03 07 00 7B 00 03 07 01 82 07 00 F9 07 01 79 FF 00 02 00 00 00 01 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 03 07 01 82 07 00 F9 07 01 79 45 07 00 43 40 07 01 88 42 07 00 43 40 07 01 88 47 07 00 43 40 01 51 07 00 F0 FF 00 02 00 02 07 00 03 07 00 7B 00 02 07 00 F0 01 5E 07 00 F0 08 0B 42 01 1F 04 FF 00 0D 00 02 07 00 03 07 00 7B 00 02 07 00 03 07 00 03 FF 00 02 00 02 07 00 03 07 00 7B 00 03 07 00 03 07 00 03 01 FF 00 1D 00 02 07 00 03 07 00 7B 00 02 07 00 03 07 00 03 FF 00 0F 00 02 07 00 03 07 00 7B 00 03 07 00 03 03 07 00 03 FF 00 02 00 02 07 00 03 07 00 7B 00 04 07 00 03 03 07 00 03 01 FF 00 1C 00 02 07 00 03 07 00 7B 00 03 07 00 03 03 07 00 03 FF 00 13 00 02 07 00 03 07 00 7B 00 02 07 00 03 03 FF 00 02 00 02 07 00 03 07 00 7B 00 03 07 00 03 03 01 FF 00 1C 00 02 07 00 03 07 00 7B 00 02 07 00 03 03 02 FF 00 07 00 00 00 01 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 02 07 00 03 03 45 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 03 07 00 03 03 03 42 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 03 07 00 03 03 03 45 07 00 43 FF 00 00 00 02 07 00 03 07 00 7B 00 02 07 00 03 03 51 07 00 F0 FF 00 02 00 02 07 00 03 07 00 7B 00 02 07 00 F0 01 5C 07 00 F0 54 02 FF 00 02 00 02 07 00 03 07 00 7B 00 02 02 01 5F 02 FF 00 1C 00 04 07 00 03 07 00 7B 02 02 00 01 07 00 F0 FF 00 02 00 04 07 00 03 07 00 7B 02 02 00 02 07 00 F0 01 5F 07 00 F0 FC 00 13 02 42 01 1C 05 05 42 01 18 4A 07 00 43 FF 00 00 00 05 07 00 03 07 00 7B 02 02 02 00 02 07 00 7B 03 45 07 00 43 00 0B 42 01 1D 44 07 00 43 FF 00 00 00 05 07 00 03 07 00 7B 02 02 02 00 02 07 00 7B 03 45 07 00 43 00 02 05 05 42 01 18 0B 42 01 1C 11 42 01 1E 4C 02 FF 00 01 00 05 07 00 03 07 00 7B 02 02 02 00 02 02 01 08 0B 42 01 1C 07 05 42 01 1A 0B 42 01 1C 4C 02 FF 00 01 00 05 07 00 03 07 00 7B 02 02 02 00 02 02 01 50 02 FF 00 02 00 05 07 00 03 07 00 7B 02 02 02 00 02 02 01 5C 02 00 0A 09 0B 42 01 1E 52 03 FF 00 02 00 05 07 00 03 07 00 7B 02 02 02 00 02 03 01 5D 03 42 07 00 43 40 03 45 07 00 43 40 03 42 07 00 3B 40 03 45 07 00 43 40 03 4B 03 FF 00 02 00 05 07 00 03 07 00 7B 02 02 02 00 02 03 01 5E 03 FC 00 0D 03 42 01 1E 49 07 00 43 40 03 45 07 00 43 40 03 42 07 00 43 40 03 45 07 00 43 40 03 FF 00 1F 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 03 07 00 7B 03 03 FF 00 02 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 04 07 00 7B 03 03 01 FF 00 1F 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 03 07 00 7B 03 03 46 07 00 39 FF 00 00 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 02 07 00 7B 03 45 07 00 43 00 0B 42 01 1D 4C 07 00 7B FF 00 02 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 02 07 00 7B 01 5F 07 00 7B FF 00 0D 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 02 07 00 7B 03 FF 00 02 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 03 07 00 7B 03 01 FF 00 1E 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 02 07 00 7B 03 FF 00 10 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 02 07 00 7B 03 FF 00 02 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 03 07 00 7B 03 01 FF 00 1F 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 02 07 00 7B 03 FF 00 10 00 00 00 01 07 00 43 FF 00 00 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 02 07 00 7B 03 45 07 00 43 00 FF 00 14 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 02 07 00 F9 02 FF 00 02 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 03 07 00 F9 02 01 FF 00 1E 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 02 07 00 F9 02 0E 05 42 01 1B 44 07 00 43 FF 00 00 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 02 07 00 7B 03 45 07 00 43 00 0B 42 01 1F 44 07 00 43 FF 00 00 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 02 07 00 7B 03 45 07 00 43 00 FF 00 00 00 02 07 00 03 07 00 7B 00 05 07 01 82 07 00 F9 07 01 79 03 07 00 F9 FF 00 01 00 02 07 00 03 07 00 7B 00 03 07 01 82 07 00 F9 07 00 F9 41 07 00 F0 FF 00 01 00 02 07 00 03 07 00 7B 00 02 03 03 41 07 00 F0 FF 00 01 00 02 07 00 03 07 00 7B 00 02 07 00 03 03 FF 00 01 00 02 07 00 03 07 00 7B 00 02 07 00 7B 03 FE 00 01 02 02 02 01 FF 00 01 00 02 07 00 03 07 00 7B 00 01 07 00 F9 FF 00 01 00 02 07 00 03 07 00 7B 00 02 07 00 03 07 00 03 FF 00 01 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 02 07 00 F9 02 FF 00 01 00 02 07 00 03 07 00 7B 00 00 FF 00 01 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 02 07 00 7B 03 FF 00 01 00 05 07 00 03 07 00 7B 02 02 02 00 01 02 FF 00 01 00 02 07 00 03 07 00 7B 00 02 07 00 F9 07 00 F9 41 07 00 95 FF 00 01 00 02 07 00 03 07 00 7B 00 03 07 01 82 07 00 F9 07 01 79 FE 00 01 02 02 02 F8 00 01 FF 00 01 00 02 07 00 03 07 00 7B 00 03 07 00 03 03 07 00 F0 FF 00 01 00 02 07 00 03 07 00 7B 00 02 07 00 03 07 00 03 FF 00 01 00 06 07 00 03 07 00 7B 02 02 02 03 00 00 FF 00 01 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 03 07 00 7B 03 03 FF 00 01 00 02 07 00 03 07 00 7B 00 00 41 07 00 F0 FF 00 01 00 02 07 00 03 07 00 7B 00 03 07 00 03 03 07 00 03 FF 00 01 00 05 07 00 03 07 00 7B 02 02 02 00 01 03 41 03 FD 00 01 03 03 FF 00 01 00 02 07 00 03 07 00 7B 00 01 07 00 03 FF 00 01 00 02 07 00 03 07 00 7B 00 03 03 07 00 03 03 41 02 01 41 03 41 07 00 F0 41 07 00 8D 01 FF 00 01 00 04 07 00 03 07 00 7B 02 02 00 01 07 00 F0 FF 00 01 00 02 07 00 03 07 00 7B 00 02 07 00 03 03 FF 00 01 00 02 07 00 03 07 00 7B 00 02 07 00 03 07 00 03 FF 00 01 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 02 07 00 7B 03 FF 00 01 00 02 07 00 03 07 00 7B 00 00 FF 00 01 00 02 07 00 03 07 00 7B 00 03 07 01 82 07 00 F9 07 00 F0 FF 00 01 00 02 07 00 03 07 00 7B 00 06 07 01 82 07 00 F9 07 01 79 03 03 03 FF 00 01 00 02 07 00 03 07 00 7B 00 02 07 00 BC 07 02 17 FE 00 01 02 02 02 01 FF 00 01 00 02 07 00 03 07 00 7B 00 02 03 07 00 03 01 FE 00 01 02 02 02 FF 00 01 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 01 07 00 7B FF 00 01 00 02 07 00 03 07 00 7B 00 02 07 01 82 07 00 F0 01 01 FF 00 01 00 07 07 00 03 07 00 7B 02 02 02 03 03 00 00 FF 00 01 00 02 07 00 03 07 00 7B 00 00 41 07 00 9A FF 00 01 00 02 07 00 03 07 00 7B 00 02 07 00 03 03 FE 00 01 02 02 02 FF 00 01 00 02 07 00 03 07 00 7B 00 01 07 00 9A 41 07 00 43 43 05 44 07 00 43 47 05 47 07 00 43
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     4153   4161   Any
        //  4153   4161   4153   4161   Any
        //  4169   4171   3      8      Ljava/lang/UnsupportedOperationException;
        //  28     35     35     36     Any
        //  28     35     35     36     Any
        //  28     35     3      8      Ljava/lang/RuntimeException;
        //  29     35     28     29     Any
        //  29     35     35     36     Ljava/lang/EnumConstantNotPresentException;
        //  135    142    142    143    Any
        //  135    142    3      8      Any
        //  135    142    3      8      Any
        //  135    142    135    136    Any
        //  136    142    135    136    Ljava/lang/ArithmeticException;
        //  192    198    198    199    Any
        //  192    198    3      8      Any
        //  192    198    198    199    Ljava/lang/IndexOutOfBoundsException;
        //  192    198    3      8      Ljava/lang/IllegalArgumentException;
        //  192    198    3      8      Any
        //  252    259    259    260    Any
        //  252    259    252    253    Ljava/lang/IllegalStateException;
        //  252    259    3      8      Any
        //  253    259    252    253    Any
        //  252    259    259    260    Any
        //  267    274    274    275    Any
        //  268    274    267    268    Ljava/lang/EnumConstantNotPresentException;
        //  267    274    3      8      Any
        //  268    274    274    275    Any
        //  268    274    3      8      Any
        //  360    367    367    368    Any
        //  361    367    367    368    Any
        //  360    367    360    361    Ljava/util/ConcurrentModificationException;
        //  360    367    3      8      Ljava/lang/UnsupportedOperationException;
        //  361    367    3      8      Any
        //  488    495    495    496    Any
        //  489    495    495    496    Ljava/lang/NullPointerException;
        //  488    495    488    489    Any
        //  488    495    488    489    Ljava/lang/IndexOutOfBoundsException;
        //  489    495    495    496    Ljava/lang/ClassCastException;
        //  499    506    506    507    Any
        //  500    506    499    500    Ljava/lang/UnsupportedOperationException;
        //  500    506    499    500    Any
        //  499    506    3      8      Ljava/lang/NullPointerException;
        //  499    506    506    507    Ljava/lang/ArithmeticException;
        //  513    520    520    521    Any
        //  514    520    513    514    Ljava/util/NoSuchElementException;
        //  513    520    3      8      Any
        //  513    520    520    521    Ljava/util/ConcurrentModificationException;
        //  514    520    520    521    Any
        //  574    581    581    582    Any
        //  575    581    574    575    Any
        //  574    581    581    582    Ljava/lang/ClassCastException;
        //  575    581    574    575    Any
        //  575    581    3      8      Any
        //  585    592    592    593    Any
        //  586    592    592    593    Ljava/lang/NegativeArraySizeException;
        //  585    592    585    586    Ljava/lang/IllegalStateException;
        //  586    592    3      8      Any
        //  586    592    585    586    Any
        //  643    650    650    651    Any
        //  644    650    650    651    Any
        //  644    650    3      8      Any
        //  644    650    643    644    Ljava/util/ConcurrentModificationException;
        //  644    650    643    644    Any
        //  662    669    669    670    Any
        //  663    669    3      8      Any
        //  663    669    3      8      Any
        //  662    669    662    663    Any
        //  663    669    3      8      Any
        //  721    727    727    728    Any
        //  721    727    727    728    Ljava/lang/StringIndexOutOfBoundsException;
        //  721    727    727    728    Any
        //  721    727    727    728    Any
        //  721    727    727    728    Any
        //  906    912    912    913    Any
        //  906    912    3      8      Ljava/lang/UnsupportedOperationException;
        //  906    912    3      8      Ljava/lang/RuntimeException;
        //  906    912    3      8      Ljava/lang/AssertionError;
        //  906    912    3      8      Any
        //  1132   1138   1138   1139   Any
        //  1132   1138   3      8      Any
        //  1132   1138   1138   1139   Ljava/lang/ArithmeticException;
        //  1132   1138   1138   1139   Any
        //  1132   1138   1138   1139   Any
        //  1191   1198   1198   1199   Any
        //  1192   1198   1191   1192   Ljava/lang/IllegalStateException;
        //  1192   1198   1191   1192   Ljava/lang/RuntimeException;
        //  1191   1198   3      8      Any
        //  1192   1198   1191   1192   Ljava/lang/ClassCastException;
        //  1270   1277   1277   1278   Any
        //  1270   1277   1277   1278   Ljava/util/NoSuchElementException;
        //  1271   1277   1270   1271   Ljava/lang/IllegalStateException;
        //  1271   1277   3      8      Any
        //  1270   1277   1277   1278   Any
        //  1331   1338   1338   1339   Any
        //  1331   1338   1331   1332   Ljava/lang/NumberFormatException;
        //  1331   1338   1338   1339   Ljava/util/ConcurrentModificationException;
        //  1331   1338   1338   1339   Any
        //  1332   1338   1338   1339   Any
        //  1497   1504   1504   1505   Any
        //  1497   1504   1497   1498   Ljava/lang/RuntimeException;
        //  1497   1504   3      8      Ljava/lang/NumberFormatException;
        //  1498   1504   3      8      Ljava/lang/ArithmeticException;
        //  1498   1504   1504   1505   Any
        //  1640   1647   1647   1648   Any
        //  1640   1647   1640   1641   Any
        //  1640   1647   1647   1648   Any
        //  1640   1647   1640   1641   Any
        //  1641   1647   1647   1648   Ljava/lang/StringIndexOutOfBoundsException;
        //  1871   1878   1878   1879   Any
        //  1871   1878   1871   1872   Any
        //  1872   1878   1878   1879   Ljava/lang/ArithmeticException;
        //  1871   1878   1878   1879   Any
        //  1871   1878   1871   1872   Any
        //  2099   2106   2106   2107   Any
        //  2100   2106   2106   2107   Ljava/lang/UnsupportedOperationException;
        //  2100   2106   2106   2107   Ljava/lang/IllegalStateException;
        //  2100   2106   2099   2100   Any
        //  2100   2106   2106   2107   Ljava/lang/IllegalStateException;
        //  2211   2218   2218   2219   Any
        //  2211   2218   3      8      Ljava/lang/UnsupportedOperationException;
        //  2211   2218   2218   2219   Any
        //  2212   2218   2211   2212   Any
        //  2211   2218   2211   2212   Ljava/lang/UnsupportedOperationException;
        //  2268   2274   2274   2275   Any
        //  2268   2274   3      8      Ljava/lang/NumberFormatException;
        //  2268   2274   2274   2275   Any
        //  2268   2274   2274   2275   Ljava/lang/ArithmeticException;
        //  2268   2274   3      8      Any
        //  2278   2287   2287   2288   Any
        //  2278   2287   2287   2288   Any
        //  2279   2287   2278   2279   Any
        //  2279   2287   3      8      Ljava/util/NoSuchElementException;
        //  2279   2287   3      8      Ljava/lang/RuntimeException;
        //  2560   2566   2566   2567   Any
        //  2560   2566   3      8      Any
        //  2560   2566   3      8      Any
        //  2560   2566   2566   2567   Any
        //  2560   2566   3      8      Any
        //  2570   2577   2577   2578   Any
        //  2571   2577   3      8      Ljava/lang/AssertionError;
        //  2570   2577   2570   2571   Ljava/lang/ArithmeticException;
        //  2570   2577   2577   2578   Any
        //  2570   2577   2570   2571   Ljava/lang/AssertionError;
        //  2851   2858   2858   2859   Any
        //  2851   2858   2851   2852   Ljava/util/ConcurrentModificationException;
        //  2852   2858   2858   2859   Ljava/util/ConcurrentModificationException;
        //  2852   2858   2851   2852   Any
        //  2851   2858   2851   2852   Ljava/lang/StringIndexOutOfBoundsException;
        //  2909   2916   2916   2917   Any
        //  2910   2916   2909   2910   Any
        //  2910   2916   3      8      Ljava/lang/UnsupportedOperationException;
        //  2909   2916   2909   2910   Ljava/lang/EnumConstantNotPresentException;
        //  2910   2916   3      8      Any
        //  3399   3406   3406   3407   Any
        //  3399   3406   3399   3400   Ljava/lang/StringIndexOutOfBoundsException;
        //  3399   3406   3399   3400   Any
        //  3399   3406   3      8      Any
        //  3400   3406   3399   3400   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3410   3417   3417   3418   Any
        //  3410   3417   3417   3418   Ljava/lang/NullPointerException;
        //  3410   3417   3410   3411   Ljava/lang/ArithmeticException;
        //  3411   3417   3417   3418   Any
        //  3410   3417   3417   3418   Any
        //  3522   3529   3529   3530   Any
        //  3522   3529   3522   3523   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3522   3529   3522   3523   Any
        //  3522   3529   3529   3530   Any
        //  3522   3529   3522   3523   Ljava/lang/RuntimeException;
        //  3533   3540   3540   3541   Any
        //  3534   3540   3533   3534   Any
        //  3534   3540   3533   3534   Any
        //  3534   3540   3540   3541   Any
        //  3533   3540   3      8      Any
        //  3615   3622   3622   3623   Any
        //  3616   3622   3      8      Ljava/lang/UnsupportedOperationException;
        //  3615   3622   3622   3623   Ljava/lang/NumberFormatException;
        //  3615   3622   3615   3616   Ljava/util/ConcurrentModificationException;
        //  3616   3622   3622   3623   Ljava/lang/EnumConstantNotPresentException;
        //  3834   3840   3840   3841   Any
        //  3834   3840   3840   3841   Any
        //  3834   3840   3      8      Ljava/util/ConcurrentModificationException;
        //  3834   3840   3840   3841   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3834   3840   3      8      Any
        //  3953   3960   3960   3961   Any
        //  3954   3960   3960   3961   Any
        //  3953   3960   3953   3954   Any
        //  3954   3960   3      8      Any
        //  3953   3960   3960   3961   Ljava/lang/IndexOutOfBoundsException;
        //  4013   4020   4020   4021   Any
        //  4013   4020   3      8      Ljava/lang/RuntimeException;
        //  4014   4020   4013   4014   Any
        //  4013   4020   4013   4014   Any
        //  4014   4020   3      8      Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:667)
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
    
    public Block c(final AxisAlignedBB p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          570
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            562
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            554
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: getfield        net/minecraft/util/math/AxisAlignedBB.field_72340_a:D
        //    28: goto            32
        //    31: athrow         
        //    32: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //    35: goto            39
        //    38: athrow         
        //    39: istore_2       
        //    40: iload_2        
        //    41: getstatic       dev/nuker/pyro/fc.c:I
        //    44: ifge            53
        //    47: ldc_w           1143028354
        //    50: goto            56
        //    53: ldc_w           -1713213520
        //    56: ldc_w           823067763
        //    59: ixor           
        //    60: lookupswitch {
        //          -1460835389: 88
        //          1965965041: 53
        //          default: 537
        //        }
        //    88: aload_1        
        //    89: getfield        net/minecraft/util/math/AxisAlignedBB.field_72336_d:D
        //    92: goto            96
        //    95: athrow         
        //    96: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //    99: goto            103
        //   102: athrow         
        //   103: iconst_1       
        //   104: iadd           
        //   105: if_icmpge       114
        //   108: ldc_w           1486441939
        //   111: goto            117
        //   114: ldc_w           1486441964
        //   117: ldc_w           -610992308
        //   120: ixor           
        //   121: tableswitch {
        //          102458686: 144
        //          102458687: 529
        //          default: 108
        //        }
        //   144: getstatic       dev/nuker/pyro/fc.0:I
        //   147: ifeq            156
        //   150: ldc_w           -760054141
        //   153: goto            159
        //   156: ldc_w           1475706062
        //   159: ldc_w           968382493
        //   162: ixor           
        //   163: lookupswitch {
        //          -351656290: 156
        //          1850549459: 188
        //          default: 531
        //        }
        //   188: aload_1        
        //   189: getfield        net/minecraft/util/math/AxisAlignedBB.field_72339_c:D
        //   192: goto            196
        //   195: athrow         
        //   196: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   199: goto            203
        //   202: athrow         
        //   203: getstatic       dev/nuker/pyro/fc.0:I
        //   206: ifeq            215
        //   209: ldc_w           1027193322
        //   212: goto            218
        //   215: ldc_w           151311746
        //   218: ldc_w           1653130719
        //   221: ixor           
        //   222: lookupswitch {
        //          1605467189: 215
        //          1804341341: 248
        //          default: 543
        //        }
        //   248: istore_3       
        //   249: iload_3        
        //   250: aload_1        
        //   251: getfield        net/minecraft/util/math/AxisAlignedBB.field_72334_f:D
        //   254: getstatic       dev/nuker/pyro/fc.1:I
        //   257: ifeq            266
        //   260: ldc_w           -1483222751
        //   263: goto            269
        //   266: ldc_w           -1974159457
        //   269: ldc_w           986307029
        //   272: ixor           
        //   273: lookupswitch {
        //          -1654781708: 533
        //          485085569: 266
        //          default: 300
        //        }
        //   300: goto            304
        //   303: athrow         
        //   304: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   307: goto            311
        //   310: athrow         
        //   311: iconst_1       
        //   312: iadd           
        //   313: if_icmpge       523
        //   316: getstatic       dev/nuker/pyro/f95.c:Lnet/minecraft/client/Minecraft;
        //   319: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   322: new             Lnet/minecraft/util/math/BlockPos;
        //   325: dup            
        //   326: getstatic       dev/nuker/pyro/fc.1:I
        //   329: ifeq            338
        //   332: ldc_w           -809670859
        //   335: goto            341
        //   338: ldc_w           -1526356182
        //   341: ldc_w           -1788152392
        //   344: ixor           
        //   345: lookupswitch {
        //          1244513002: 338
        //          1524077197: 539
        //          default: 372
        //        }
        //   372: iload_2        
        //   373: aload_1        
        //   374: getstatic       dev/nuker/pyro/fc.0:I
        //   377: ifeq            386
        //   380: ldc_w           1296193975
        //   383: goto            389
        //   386: ldc_w           -251287500
        //   389: ldc_w           -78631333
        //   392: ixor           
        //   393: lookupswitch {
        //          -1240303636: 386
        //          173377135: 420
        //          default: 535
        //        }
        //   420: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
        //   423: d2i            
        //   424: iload_3        
        //   425: getstatic       dev/nuker/pyro/fc.0:I
        //   428: ifeq            437
        //   431: ldc_w           477606186
        //   434: goto            440
        //   437: ldc_w           -1636516609
        //   440: ldc_w           746824150
        //   443: ixor           
        //   444: lookupswitch {
        //          -1564173997: 437
        //          821301500: 541
        //          default: 472
        //        }
        //   472: goto            476
        //   475: athrow         
        //   476: invokespecial   net/minecraft/util/math/BlockPos.<init>:(III)V
        //   479: goto            483
        //   482: athrow         
        //   483: goto            487
        //   486: athrow         
        //   487: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   490: goto            494
        //   493: athrow         
        //   494: goto            498
        //   497: athrow         
        //   498: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   503: goto            507
        //   506: athrow         
        //   507: astore          4
        //   509: aload           4
        //   511: ifnull          517
        //   514: aload           4
        //   516: areturn        
        //   517: iinc            3, 1
        //   520: goto            249
        //   523: iinc            2, 1
        //   526: goto            40
        //   529: aconst_null    
        //   530: areturn        
        //   531: aconst_null    
        //   532: athrow         
        //   533: aconst_null    
        //   534: athrow         
        //   535: aconst_null    
        //   536: athrow         
        //   537: aconst_null    
        //   538: athrow         
        //   539: aconst_null    
        //   540: athrow         
        //   541: aconst_null    
        //   542: athrow         
        //   543: aconst_null    
        //   544: athrow         
        //   545: pop            
        //   546: goto            24
        //   549: pop            
        //   550: aconst_null    
        //   551: goto            545
        //   554: dup            
        //   555: ifnull          545
        //   558: checkcast       Ljava/lang/Throwable;
        //   561: athrow         
        //   562: dup            
        //   563: ifnull          549
        //   566: checkcast       Ljava/lang/Throwable;
        //   569: athrow         
        //   570: aconst_null    
        //   571: athrow         
        //    StackMapTable: 00 4A 43 07 00 43 04 FF 00 0B 00 00 00 01 07 00 43 FD 00 03 07 00 03 07 01 79 46 07 00 43 40 03 45 07 00 43 40 01 FC 00 00 01 4C 01 FF 00 02 00 03 07 00 03 07 01 79 01 00 02 01 01 5F 01 46 07 00 6D FF 00 00 00 03 07 00 03 07 01 79 01 00 02 01 03 45 07 00 43 FF 00 00 00 03 07 00 03 07 01 79 01 00 02 01 01 04 05 42 01 1A 0B 42 01 1C 46 07 00 43 40 03 45 07 00 43 40 01 4B 01 FF 00 02 00 03 07 00 03 07 01 79 01 00 02 01 01 5D 01 FC 00 00 01 FF 00 10 00 04 07 00 03 07 01 79 01 01 00 02 01 03 FF 00 02 00 04 07 00 03 07 01 79 01 01 00 03 01 03 01 FF 00 1E 00 04 07 00 03 07 01 79 01 01 00 02 01 03 42 07 00 43 FF 00 00 00 04 07 00 03 07 01 79 01 01 00 02 01 03 45 07 00 43 FF 00 00 00 04 07 00 03 07 01 79 01 01 00 02 01 01 FF 00 1A 00 04 07 00 03 07 01 79 01 01 00 03 07 01 82 08 01 42 08 01 42 FF 00 02 00 04 07 00 03 07 01 79 01 01 00 04 07 01 82 08 01 42 08 01 42 01 FF 00 1E 00 04 07 00 03 07 01 79 01 01 00 03 07 01 82 08 01 42 08 01 42 FF 00 0D 00 04 07 00 03 07 01 79 01 01 00 05 07 01 82 08 01 42 08 01 42 01 07 01 79 FF 00 02 00 04 07 00 03 07 01 79 01 01 00 06 07 01 82 08 01 42 08 01 42 01 07 01 79 01 FF 00 1E 00 04 07 00 03 07 01 79 01 01 00 05 07 01 82 08 01 42 08 01 42 01 07 01 79 FF 00 10 00 04 07 00 03 07 01 79 01 01 00 06 07 01 82 08 01 42 08 01 42 01 01 01 FF 00 02 00 04 07 00 03 07 01 79 01 01 00 07 07 01 82 08 01 42 08 01 42 01 01 01 01 FF 00 1F 00 04 07 00 03 07 01 79 01 01 00 06 07 01 82 08 01 42 08 01 42 01 01 01 42 07 00 3B FF 00 00 00 04 07 00 03 07 01 79 01 01 00 06 07 01 82 08 01 42 08 01 42 01 01 01 45 07 00 43 FF 00 00 00 04 07 00 03 07 01 79 01 01 00 02 07 01 82 07 02 3B 42 07 00 43 FF 00 00 00 04 07 00 03 07 01 79 01 01 00 02 07 01 82 07 02 3B 45 07 00 43 40 07 02 50 42 07 00 43 40 07 02 50 47 07 00 43 40 07 02 56 FC 00 09 07 02 56 FA 00 05 FA 00 05 01 FF 00 01 00 04 07 00 03 07 01 79 01 01 00 02 01 03 FF 00 01 00 04 07 00 03 07 01 79 01 01 00 05 07 01 82 08 01 42 08 01 42 01 07 01 79 FF 00 01 00 03 07 00 03 07 01 79 01 00 01 01 FF 00 01 00 04 07 00 03 07 01 79 01 01 00 03 07 01 82 08 01 42 08 01 42 FF 00 01 00 04 07 00 03 07 01 79 01 01 00 06 07 01 82 08 01 42 08 01 42 01 01 01 FF 00 01 00 03 07 00 03 07 01 79 01 00 01 01 FF 00 01 00 02 07 00 03 07 01 79 00 01 07 00 71 43 05 44 07 00 71 47 05 47 07 00 43
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     554    562    Ljava/lang/IndexOutOfBoundsException;
        //  554    562    554    562    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  570    572    3      8      Any
        //  31     38     38     39     Any
        //  31     38     3      8      Any
        //  32     38     3      8      Ljava/lang/IllegalStateException;
        //  32     38     3      8      Any
        //  32     38     31     32     Any
        //  95     102    102    103    Any
        //  95     102    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  95     102    102    103    Any
        //  95     102    95     96     Ljava/lang/RuntimeException;
        //  95     102    3      8      Any
        //  195    202    202    203    Any
        //  195    202    202    203    Any
        //  195    202    202    203    Any
        //  195    202    202    203    Any
        //  196    202    195    196    Any
        //  303    310    310    311    Any
        //  303    310    303    304    Ljava/util/ConcurrentModificationException;
        //  303    310    310    311    Any
        //  304    310    310    311    Any
        //  304    310    303    304    Any
        //  475    482    482    483    Any
        //  476    482    3      8      Any
        //  476    482    3      8      Ljava/lang/NumberFormatException;
        //  475    482    475    476    Ljava/lang/ArithmeticException;
        //  476    482    482    483    Any
        //  486    493    493    494    Any
        //  486    493    3      8      Ljava/lang/NumberFormatException;
        //  487    493    493    494    Ljava/lang/IllegalStateException;
        //  486    493    486    487    Any
        //  486    493    493    494    Ljava/lang/StringIndexOutOfBoundsException;
        //  497    506    506    507    Any
        //  498    506    3      8      Any
        //  498    506    497    498    Ljava/lang/UnsupportedOperationException;
        //  498    506    497    498    Any
        //  498    506    506    507    Any
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
}
