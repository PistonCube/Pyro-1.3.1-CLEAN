// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.util.math.Vec3d;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class fbB
{
    public BlockPos c;
    public EnumFacing c;
    public Vec3d c;
    public fbQ c;
    
    public fbQ 2() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: iflt            84
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            76
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: getstatic       dev/nuker/pyro/fc.0:I
        //    19: ifeq            27
        //    22: ldc             1573842951
        //    24: goto            29
        //    27: ldc             -13530359
        //    29: ldc             1508742778
        //    31: ixor           
        //    32: lookupswitch {
        //          69428861: 65
        //          532221925: 27
        //          default: 60
        //        }
        //    60: aload_0        
        //    61: getfield        dev/nuker/pyro/fbB.c:Ldev/nuker/pyro/fbQ;
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
        //    StackMapTable: 00 0A FF 00 0C 00 00 00 01 07 00 15 FC 00 03 07 00 03 0A 41 01 1E 04 41 07 00 15 43 05 44 07 00 15 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  0      12     76     84     Any
        //  76     84     76     84     Ljava/lang/ArithmeticException;
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
    
    public fbB(final BlockPos c, final EnumFacing c2, final Vec3d c3) {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.0 != 0) {
                    n = -1661125551;
                    break Label_0017;
                }
                n = 63265004;
            }
            switch (n ^ 0x9B9DF7CC) {
                case 123784093: {
                    continue;
                }
                case -1739018464: {
                    this.c = null;
                    this.c = c;
                    while (true) {
                        int n2 = 0;
                        Label_0071: {
                            if (fc.1 != 0) {
                                n2 = -586728558;
                                break Label_0071;
                            }
                            n2 = -1824001876;
                        }
                        switch (n2 ^ 0x4019FC83) {
                            case -1315909177: {
                                continue;
                            }
                            default: {
                                while (true) {
                                    int n3 = 0;
                                    Label_0114: {
                                        if (fc.0 != 0) {
                                            n3 = -414041784;
                                            break Label_0114;
                                        }
                                        n3 = -1883510120;
                                    }
                                    switch (n3 ^ 0x804869F8) {
                                        case -577357947: {
                                            continue;
                                        }
                                        default: {
                                            this.c = c2;
                                            while (true) {
                                                int n4 = 0;
                                                Label_0162: {
                                                    if (fc.c < 0) {
                                                        n4 = -687633355;
                                                        break Label_0162;
                                                    }
                                                    n4 = -500880386;
                                                }
                                                switch (n4 ^ 0x9F18E3B) {
                                                    case -2039586890: {
                                                        continue;
                                                    }
                                                    default: {
                                                        this.c = c3;
                                                        return;
                                                    }
                                                    case -554565106: {
                                                        throw null;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        case 1729777840: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case -1658927343: {
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
    
    public BlockPos c() {
        return fbS.7V(this, 899772972);
    }
    
    public static fbB c(final BlockPos p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          715
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            707
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            699
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             -1980644212
        //    32: goto            37
        //    35: ldc             -619166408
        //    37: ldc             -1444662167
        //    39: ixor           
        //    40: lookupswitch {
        //          538308837: 35
        //          1929146705: 68
        //          default: 686
        //        }
        //    68: aload_0        
        //    69: iconst_0       
        //    70: iconst_m1      
        //    71: iconst_0       
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   net/minecraft/util/math/BlockPos.func_177982_a:(III)Lnet/minecraft/util/math/BlockPos;
        //    79: goto            83
        //    82: athrow         
        //    83: goto            87
        //    86: athrow         
        //    87: invokestatic    dev/nuker/pyro/fbA.3:(Lnet/minecraft/util/math/BlockPos;)Z
        //    90: goto            94
        //    93: athrow         
        //    94: ifeq            174
        //    97: new             Ldev/nuker/pyro/fbB;
        //   100: dup            
        //   101: aload_0        
        //   102: iconst_0       
        //   103: iconst_m1      
        //   104: iconst_0       
        //   105: getstatic       dev/nuker/pyro/fc.1:I
        //   108: ifeq            116
        //   111: ldc             37501692
        //   113: goto            118
        //   116: ldc             400601491
        //   118: ldc             -662183506
        //   120: ixor           
        //   121: lookupswitch {
        //          -625222830: 680
        //          -211110546: 116
        //          default: 148
        //        }
        //   148: goto            152
        //   151: athrow         
        //   152: invokevirtual   net/minecraft/util/math/BlockPos.func_177982_a:(III)Lnet/minecraft/util/math/BlockPos;
        //   155: goto            159
        //   158: athrow         
        //   159: getstatic       net/minecraft/util/EnumFacing.UP:Lnet/minecraft/util/EnumFacing;
        //   162: goto            166
        //   165: athrow         
        //   166: invokespecial   dev/nuker/pyro/fbB.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V
        //   169: goto            173
        //   172: athrow         
        //   173: areturn        
        //   174: aload_0        
        //   175: iconst_m1      
        //   176: iconst_0       
        //   177: iconst_0       
        //   178: goto            182
        //   181: athrow         
        //   182: invokevirtual   net/minecraft/util/math/BlockPos.func_177982_a:(III)Lnet/minecraft/util/math/BlockPos;
        //   185: goto            189
        //   188: athrow         
        //   189: goto            193
        //   192: athrow         
        //   193: invokestatic    dev/nuker/pyro/fbA.3:(Lnet/minecraft/util/math/BlockPos;)Z
        //   196: goto            200
        //   199: athrow         
        //   200: ifeq            280
        //   203: new             Ldev/nuker/pyro/fbB;
        //   206: dup            
        //   207: aload_0        
        //   208: iconst_m1      
        //   209: iconst_0       
        //   210: iconst_0       
        //   211: goto            215
        //   214: athrow         
        //   215: invokevirtual   net/minecraft/util/math/BlockPos.func_177982_a:(III)Lnet/minecraft/util/math/BlockPos;
        //   218: goto            222
        //   221: athrow         
        //   222: getstatic       net/minecraft/util/EnumFacing.EAST:Lnet/minecraft/util/EnumFacing;
        //   225: getstatic       dev/nuker/pyro/fc.c:I
        //   228: ifge            236
        //   231: ldc             136922677
        //   233: goto            238
        //   236: ldc             985426778
        //   238: ldc             275027277
        //   240: ixor           
        //   241: lookupswitch {
        //          407753592: 688
        //          969896861: 236
        //          default: 268
        //        }
        //   268: goto            272
        //   271: athrow         
        //   272: invokespecial   dev/nuker/pyro/fbB.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V
        //   275: goto            279
        //   278: athrow         
        //   279: areturn        
        //   280: aload_0        
        //   281: iconst_1       
        //   282: iconst_0       
        //   283: iconst_0       
        //   284: goto            288
        //   287: athrow         
        //   288: invokevirtual   net/minecraft/util/math/BlockPos.func_177982_a:(III)Lnet/minecraft/util/math/BlockPos;
        //   291: goto            295
        //   294: athrow         
        //   295: goto            299
        //   298: athrow         
        //   299: invokestatic    dev/nuker/pyro/fbA.3:(Lnet/minecraft/util/math/BlockPos;)Z
        //   302: goto            306
        //   305: athrow         
        //   306: ifeq            386
        //   309: new             Ldev/nuker/pyro/fbB;
        //   312: dup            
        //   313: getstatic       dev/nuker/pyro/fc.0:I
        //   316: ifeq            324
        //   319: ldc             877296093
        //   321: goto            326
        //   324: ldc             -1069084554
        //   326: ldc             980184012
        //   328: ixor           
        //   329: lookupswitch {
        //          -2084971809: 324
        //          237376017: 676
        //          default: 356
        //        }
        //   356: aload_0        
        //   357: iconst_1       
        //   358: iconst_0       
        //   359: iconst_0       
        //   360: goto            364
        //   363: athrow         
        //   364: invokevirtual   net/minecraft/util/math/BlockPos.func_177982_a:(III)Lnet/minecraft/util/math/BlockPos;
        //   367: goto            371
        //   370: athrow         
        //   371: getstatic       net/minecraft/util/EnumFacing.WEST:Lnet/minecraft/util/EnumFacing;
        //   374: goto            378
        //   377: athrow         
        //   378: invokespecial   dev/nuker/pyro/fbB.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V
        //   381: goto            385
        //   384: athrow         
        //   385: areturn        
        //   386: getstatic       dev/nuker/pyro/fc.1:I
        //   389: ifeq            397
        //   392: ldc             1584821619
        //   394: goto            399
        //   397: ldc             -1668555806
        //   399: ldc             798761433
        //   401: ixor           
        //   402: lookupswitch {
        //          1207262254: 397
        //          1911182506: 682
        //          default: 428
        //        }
        //   428: aload_0        
        //   429: iconst_0       
        //   430: iconst_0       
        //   431: iconst_m1      
        //   432: getstatic       dev/nuker/pyro/fc.c:I
        //   435: ifge            443
        //   438: ldc             -748025625
        //   440: goto            445
        //   443: ldc             -2104312423
        //   445: ldc             -1461163489
        //   447: ixor           
        //   448: lookupswitch {
        //          712693638: 476
        //          2072142584: 443
        //          default: 684
        //        }
        //   476: goto            480
        //   479: athrow         
        //   480: invokevirtual   net/minecraft/util/math/BlockPos.func_177982_a:(III)Lnet/minecraft/util/math/BlockPos;
        //   483: goto            487
        //   486: athrow         
        //   487: goto            491
        //   490: athrow         
        //   491: invokestatic    dev/nuker/pyro/fbA.3:(Lnet/minecraft/util/math/BlockPos;)Z
        //   494: goto            498
        //   497: athrow         
        //   498: ifeq            578
        //   501: new             Ldev/nuker/pyro/fbB;
        //   504: dup            
        //   505: getstatic       dev/nuker/pyro/fc.c:I
        //   508: ifge            516
        //   511: ldc             198736721
        //   513: goto            518
        //   516: ldc             184917370
        //   518: ldc             -734273758
        //   520: ixor           
        //   521: lookupswitch {
        //          -549567912: 548
        //          -538729357: 516
        //          default: 678
        //        }
        //   548: aload_0        
        //   549: iconst_0       
        //   550: iconst_0       
        //   551: iconst_m1      
        //   552: goto            556
        //   555: athrow         
        //   556: invokevirtual   net/minecraft/util/math/BlockPos.func_177982_a:(III)Lnet/minecraft/util/math/BlockPos;
        //   559: goto            563
        //   562: athrow         
        //   563: getstatic       net/minecraft/util/EnumFacing.SOUTH:Lnet/minecraft/util/EnumFacing;
        //   566: goto            570
        //   569: athrow         
        //   570: invokespecial   dev/nuker/pyro/fbB.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V
        //   573: goto            577
        //   576: athrow         
        //   577: areturn        
        //   578: aload_0        
        //   579: iconst_0       
        //   580: iconst_0       
        //   581: iconst_1       
        //   582: goto            586
        //   585: athrow         
        //   586: invokevirtual   net/minecraft/util/math/BlockPos.func_177982_a:(III)Lnet/minecraft/util/math/BlockPos;
        //   589: goto            593
        //   592: athrow         
        //   593: goto            597
        //   596: athrow         
        //   597: invokestatic    dev/nuker/pyro/fbA.3:(Lnet/minecraft/util/math/BlockPos;)Z
        //   600: goto            604
        //   603: athrow         
        //   604: ifeq            612
        //   607: ldc             -806693097
        //   609: goto            614
        //   612: ldc             -806693098
        //   614: ldc             -648412083
        //   616: ixor           
        //   617: tableswitch {
        //          761374388: 640
        //          761374389: 674
        //          default: 607
        //        }
        //   640: new             Ldev/nuker/pyro/fbB;
        //   643: dup            
        //   644: aload_0        
        //   645: iconst_0       
        //   646: iconst_0       
        //   647: iconst_1       
        //   648: goto            652
        //   651: athrow         
        //   652: invokevirtual   net/minecraft/util/math/BlockPos.func_177982_a:(III)Lnet/minecraft/util/math/BlockPos;
        //   655: goto            659
        //   658: athrow         
        //   659: getstatic       net/minecraft/util/EnumFacing.NORTH:Lnet/minecraft/util/EnumFacing;
        //   662: goto            666
        //   665: athrow         
        //   666: invokespecial   dev/nuker/pyro/fbB.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V
        //   669: goto            673
        //   672: athrow         
        //   673: areturn        
        //   674: aconst_null    
        //   675: areturn        
        //   676: aconst_null    
        //   677: athrow         
        //   678: aconst_null    
        //   679: athrow         
        //   680: aconst_null    
        //   681: athrow         
        //   682: aconst_null    
        //   683: athrow         
        //   684: aconst_null    
        //   685: athrow         
        //   686: aconst_null    
        //   687: athrow         
        //   688: aconst_null    
        //   689: athrow         
        //   690: pop            
        //   691: goto            24
        //   694: pop            
        //   695: aconst_null    
        //   696: goto            690
        //   699: dup            
        //   700: ifnull          690
        //   703: checkcast       Ljava/lang/Throwable;
        //   706: athrow         
        //   707: dup            
        //   708: ifnull          694
        //   711: checkcast       Ljava/lang/Throwable;
        //   714: athrow         
        //   715: aconst_null    
        //   716: athrow         
        //    StackMapTable: 00 7E 43 07 00 15 04 FF 00 0B 00 00 00 01 07 00 15 FC 00 03 07 00 39 0A 41 01 1E 46 07 00 15 FF 00 00 00 01 07 00 39 00 04 07 00 39 01 01 01 45 07 00 15 40 07 00 39 42 07 00 15 40 07 00 39 45 07 00 15 40 01 FF 00 15 00 01 07 00 39 00 06 08 00 61 08 00 61 07 00 39 01 01 01 FF 00 01 00 01 07 00 39 00 07 08 00 61 08 00 61 07 00 39 01 01 01 01 FF 00 1D 00 01 07 00 39 00 06 08 00 61 08 00 61 07 00 39 01 01 01 42 07 00 15 FF 00 00 00 01 07 00 39 00 06 08 00 61 08 00 61 07 00 39 01 01 01 45 07 00 15 FF 00 00 00 01 07 00 39 00 03 08 00 61 08 00 61 07 00 39 45 07 00 15 FF 00 00 00 01 07 00 39 00 04 08 00 61 08 00 61 07 00 39 07 00 3B 45 07 00 15 40 07 00 03 00 46 07 00 0E FF 00 00 00 01 07 00 39 00 04 07 00 39 01 01 01 45 07 00 15 40 07 00 39 42 07 00 15 40 07 00 39 45 07 00 15 40 01 4D 07 00 56 FF 00 00 00 01 07 00 39 00 06 08 00 CB 08 00 CB 07 00 39 01 01 01 45 07 00 15 FF 00 00 00 01 07 00 39 00 03 08 00 CB 08 00 CB 07 00 39 FF 00 0D 00 01 07 00 39 00 04 08 00 CB 08 00 CB 07 00 39 07 00 3B FF 00 01 00 01 07 00 39 00 05 08 00 CB 08 00 CB 07 00 39 07 00 3B 01 FF 00 1D 00 01 07 00 39 00 04 08 00 CB 08 00 CB 07 00 39 07 00 3B 42 07 00 58 FF 00 00 00 01 07 00 39 00 04 08 00 CB 08 00 CB 07 00 39 07 00 3B 45 07 00 15 40 07 00 03 00 46 07 00 15 FF 00 00 00 01 07 00 39 00 04 07 00 39 01 01 01 45 07 00 15 40 07 00 39 42 07 00 56 40 07 00 39 45 07 00 15 40 01 FF 00 11 00 01 07 00 39 00 02 08 01 35 08 01 35 FF 00 01 00 01 07 00 39 00 03 08 01 35 08 01 35 01 FF 00 1D 00 01 07 00 39 00 02 08 01 35 08 01 35 FF 00 06 00 00 00 01 07 00 15 FF 00 00 00 01 07 00 39 00 06 08 01 35 08 01 35 07 00 39 01 01 01 45 07 00 15 FF 00 00 00 01 07 00 39 00 03 08 01 35 08 01 35 07 00 39 45 07 00 48 FF 00 00 00 01 07 00 39 00 04 08 01 35 08 01 35 07 00 39 07 00 3B 45 07 00 15 40 07 00 03 00 0A 41 01 1C FF 00 0E 00 01 07 00 39 00 04 07 00 39 01 01 01 FF 00 01 00 01 07 00 39 00 05 07 00 39 01 01 01 01 FF 00 1E 00 01 07 00 39 00 04 07 00 39 01 01 01 42 07 00 15 FF 00 00 00 01 07 00 39 00 04 07 00 39 01 01 01 45 07 00 15 40 07 00 39 42 07 00 48 40 07 00 39 45 07 00 15 40 01 FF 00 11 00 01 07 00 39 00 02 08 01 F5 08 01 F5 FF 00 01 00 01 07 00 39 00 03 08 01 F5 08 01 F5 01 FF 00 1D 00 01 07 00 39 00 02 08 01 F5 08 01 F5 46 07 00 0E FF 00 00 00 01 07 00 39 00 06 08 01 F5 08 01 F5 07 00 39 01 01 01 45 07 00 15 FF 00 00 00 01 07 00 39 00 03 08 01 F5 08 01 F5 07 00 39 45 07 00 5C FF 00 00 00 01 07 00 39 00 04 08 01 F5 08 01 F5 07 00 39 07 00 3B 45 07 00 15 40 07 00 03 00 FF 00 06 00 00 00 01 07 00 15 FF 00 00 00 01 07 00 39 00 04 07 00 39 01 01 01 45 07 00 15 40 07 00 39 42 07 00 15 40 07 00 39 45 07 00 15 40 01 02 04 41 01 19 4A 07 00 15 FF 00 00 00 01 07 00 39 00 06 08 02 80 08 02 80 07 00 39 01 01 01 45 07 00 15 FF 00 00 00 01 07 00 39 00 03 08 02 80 08 02 80 07 00 39 FF 00 05 00 00 00 01 07 00 15 FF 00 00 00 01 07 00 39 00 04 08 02 80 08 02 80 07 00 39 07 00 3B 45 07 00 15 40 07 00 03 00 FF 00 01 00 01 07 00 39 00 02 08 01 35 08 01 35 FF 00 01 00 01 07 00 39 00 02 08 01 F5 08 01 F5 FF 00 01 00 01 07 00 39 00 06 08 00 61 08 00 61 07 00 39 01 01 01 01 FF 00 01 00 01 07 00 39 00 04 07 00 39 01 01 01 01 FF 00 01 00 01 07 00 39 00 04 08 00 CB 08 00 CB 07 00 39 07 00 3B 41 07 00 15 43 05 44 07 00 15 47 05 47 07 00 15
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     699    707    Any
        //  699    707    699    707    Ljava/lang/RuntimeException;
        //  715    717    3      8      Ljava/lang/UnsupportedOperationException;
        //  75     82     82     83     Any
        //  76     82     3      8      Any
        //  76     82     82     83     Any
        //  76     82     75     76     Any
        //  75     82     3      8      Ljava/lang/NegativeArraySizeException;
        //  86     93     93     94     Any
        //  87     93     86     87     Ljava/lang/ArithmeticException;
        //  86     93     93     94     Ljava/lang/ArithmeticException;
        //  87     93     93     94     Any
        //  87     93     86     87     Any
        //  151    158    158    159    Any
        //  151    158    3      8      Any
        //  152    158    3      8      Any
        //  152    158    151    152    Any
        //  152    158    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  165    172    172    173    Any
        //  166    172    165    166    Any
        //  165    172    3      8      Ljava/lang/NegativeArraySizeException;
        //  166    172    165    166    Any
        //  165    172    3      8      Ljava/lang/RuntimeException;
        //  181    188    188    189    Any
        //  181    188    181    182    Ljava/lang/ArithmeticException;
        //  181    188    188    189    Any
        //  181    188    188    189    Any
        //  182    188    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  192    199    199    200    Any
        //  192    199    192    193    Any
        //  192    199    192    193    Any
        //  193    199    3      8      Any
        //  192    199    199    200    Ljava/lang/StringIndexOutOfBoundsException;
        //  214    221    221    222    Any
        //  214    221    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  214    221    3      8      Any
        //  214    221    221    222    Ljava/lang/ClassCastException;
        //  214    221    214    215    Ljava/lang/IllegalStateException;
        //  271    278    278    279    Any
        //  271    278    271    272    Ljava/lang/NullPointerException;
        //  271    278    278    279    Any
        //  271    278    3      8      Ljava/lang/IllegalArgumentException;
        //  272    278    3      8      Any
        //  287    294    294    295    Any
        //  287    294    287    288    Ljava/util/ConcurrentModificationException;
        //  288    294    294    295    Ljava/util/NoSuchElementException;
        //  288    294    287    288    Ljava/lang/NullPointerException;
        //  288    294    287    288    Ljava/lang/AssertionError;
        //  298    305    305    306    Any
        //  299    305    298    299    Ljava/lang/IllegalStateException;
        //  298    305    305    306    Ljava/util/NoSuchElementException;
        //  299    305    3      8      Any
        //  299    305    305    306    Ljava/lang/RuntimeException;
        //  364    370    370    371    Any
        //  364    370    3      8      Any
        //  364    370    3      8      Any
        //  364    370    3      8      Any
        //  364    370    370    371    Ljava/lang/IllegalArgumentException;
        //  377    384    384    385    Any
        //  377    384    3      8      Any
        //  377    384    384    385    Any
        //  377    384    377    378    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  377    384    377    378    Ljava/lang/ClassCastException;
        //  479    486    486    487    Any
        //  480    486    3      8      Ljava/lang/IllegalStateException;
        //  479    486    479    480    Any
        //  479    486    3      8      Any
        //  480    486    486    487    Any
        //  490    497    497    498    Any
        //  491    497    490    491    Ljava/util/ConcurrentModificationException;
        //  490    497    3      8      Ljava/lang/UnsupportedOperationException;
        //  490    497    497    498    Ljava/lang/NullPointerException;
        //  491    497    490    491    Ljava/lang/IndexOutOfBoundsException;
        //  555    562    562    563    Any
        //  555    562    562    563    Any
        //  556    562    3      8      Ljava/lang/RuntimeException;
        //  556    562    3      8      Any
        //  556    562    555    556    Ljava/lang/ArithmeticException;
        //  569    576    576    577    Any
        //  570    576    3      8      Ljava/lang/AssertionError;
        //  570    576    576    577    Any
        //  569    576    569    570    Ljava/util/ConcurrentModificationException;
        //  569    576    3      8      Any
        //  586    592    592    593    Any
        //  586    592    3      8      Any
        //  586    592    592    593    Any
        //  586    592    3      8      Ljava/lang/IllegalArgumentException;
        //  586    592    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  596    603    603    604    Any
        //  596    603    603    604    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  597    603    603    604    Any
        //  596    603    596    597    Any
        //  597    603    603    604    Ljava/lang/RuntimeException;
        //  651    658    658    659    Any
        //  652    658    651    652    Ljava/lang/EnumConstantNotPresentException;
        //  651    658    651    652    Ljava/util/NoSuchElementException;
        //  651    658    651    652    Any
        //  651    658    658    659    Ljava/util/NoSuchElementException;
        //  666    672    672    673    Any
        //  666    672    672    673    Any
        //  666    672    3      8      Any
        //  666    672    672    673    Any
        //  666    672    3      8      Ljava/lang/RuntimeException;
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
    
    public fbB(final BlockPos c, final EnumFacing c2) {
        final fbQ c3 = null;
        while (true) {
            int n = 0;
            Label_0019: {
                if (fc.1 != 0) {
                    n = 1021281991;
                    break Label_0019;
                }
                n = -1090321264;
            }
            switch (n ^ 0xD7663B96) {
                case -340148911: {
                    continue;
                }
                case 1751465734: {
                    this.c = c3;
                    this.c = c;
                    while (true) {
                        int n2 = 0;
                        Label_0070: {
                            if (fc.c < 0) {
                                n2 = 1570488016;
                                break Label_0070;
                            }
                            n2 = 1590600230;
                        }
                        switch (n2 ^ 0x410ED19E) {
                            case 479555406: {
                                continue;
                            }
                            case 532706232: {
                                this.c = c2;
                                while (true) {
                                    int n3 = 0;
                                    Label_0123: {
                                        if (fc.c < 0) {
                                            n3 = 1436363759;
                                            break Label_0123;
                                        }
                                        n3 = -221354704;
                                    }
                                    switch (n3 ^ 0xA113A0A7) {
                                        case -1132970954: {
                                            continue;
                                        }
                                        default: {
                                            this.c = new Vec3d(c.func_177958_n() + 0.5, c.func_177956_o() + 0.5, c.func_177952_p() + 0.5);
                                            return;
                                        }
                                        case -191984824: {
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
    
    public fbB(final BlockPos c, final EnumFacing c2, final Vec3d c3, final fbQ c4) {
        while (true) {
            int n = 0;
            Label_0014: {
                if (fc.1 != 0) {
                    n = 454411031;
                    break Label_0014;
                }
                n = -688790883;
            }
            switch (n ^ 0x2386C097) {
                case -1283741668: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0060: {
                            if (fc.1 != 0) {
                                n2 = -586245461;
                                break Label_0060;
                            }
                            n2 = 2145794077;
                        }
                        switch (n2 ^ 0x5E3137FD) {
                            case 894794236: {
                                continue;
                            }
                            default: {
                                this.c = null;
                                while (true) {
                                    int n3 = 0;
                                    Label_0107: {
                                        if (fc.c < 0) {
                                            n3 = 121551615;
                                            break Label_0107;
                                        }
                                        n3 = 148386725;
                                    }
                                    switch (n3 ^ 0x29CDC02E) {
                                        case 1718101199: {
                                            continue;
                                        }
                                        default: {
                                            this.c = c;
                                            while (true) {
                                                int n4 = 0;
                                                Label_0154: {
                                                    if (fc.1 != 0) {
                                                        n4 = 220594375;
                                                        break Label_0154;
                                                    }
                                                    n4 = 1924364624;
                                                }
                                                switch (n4 ^ 0x32D247FA) {
                                                    case -295912197: {
                                                        continue;
                                                    }
                                                    default: {
                                                        this.c = c2;
                                                        this.c = c3;
                                                        while (true) {
                                                            int n5 = 0;
                                                            Label_0206: {
                                                                if (fc.c < 0) {
                                                                    n5 = 1990179984;
                                                                    break Label_0206;
                                                                }
                                                                n5 = 455117803;
                                                            }
                                                            switch (n5 ^ 0xC323EC17) {
                                                                case -1245949817: {
                                                                    continue;
                                                                }
                                                                case -670865412: {
                                                                    while (true) {
                                                                        int n6 = 0;
                                                                        Label_0250: {
                                                                            if (fc.c < 0) {
                                                                                n6 = 1802354960;
                                                                                break Label_0250;
                                                                            }
                                                                            n6 = -457789761;
                                                                        }
                                                                        switch (n6 ^ 0xADA53CA1) {
                                                                            case -959906383: {
                                                                                continue;
                                                                            }
                                                                            case 1226019358: {
                                                                                this.c = c4;
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
                                                    case 1072973629: {
                                                        throw null;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        case 787708625: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case -2092978858: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 949158784: {
                    throw null;
                }
            }
            break;
        }
    }
    
    static {
        throw t;
    }
    
    public Vec3d 0() {
        return fbS.26(this, 2061242139);
    }
    
    public EnumFacing 1() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            83
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            75
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getstatic       dev/nuker/pyro/fc.0:I
        //    20: ifeq            28
        //    23: ldc             1091180024
        //    25: goto            30
        //    28: ldc             -1745861271
        //    30: ldc             1393617479
        //    32: ixor           
        //    33: lookupswitch {
        //          303759295: 64
        //          1252496106: 28
        //          default: 60
        //        }
        //    60: getfield        dev/nuker/pyro/fbB.c:Lnet/minecraft/util/EnumFacing;
        //    63: areturn        
        //    64: aconst_null    
        //    65: athrow         
        //    66: pop            
        //    67: goto            16
        //    70: pop            
        //    71: aconst_null    
        //    72: goto            66
        //    75: dup            
        //    76: ifnull          66
        //    79: checkcast       Ljava/lang/Throwable;
        //    82: athrow         
        //    83: dup            
        //    84: ifnull          70
        //    87: checkcast       Ljava/lang/Throwable;
        //    90: athrow         
        //    StackMapTable: 00 0A FF 00 0C 00 00 00 01 07 00 15 FC 00 03 07 00 03 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 43 07 00 03 41 07 00 15 43 05 44 07 00 15 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     75     83     Any
        //  75     83     75     83     Any
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
