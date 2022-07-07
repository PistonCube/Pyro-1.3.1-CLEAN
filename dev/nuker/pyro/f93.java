// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;

public class f93 extends f8W
{
    public double c;
    public double 0;
    public double 1;
    public fbu c;
    
    @Override
    public void 0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          225
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            217
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            209
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             1973850849
        //    32: goto            37
        //    35: ldc             -723023895
        //    37: ldc             1158254263
        //    39: ixor           
        //    40: lookupswitch {
        //          -225204893: 35
        //          816782422: 196
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f93.c:Ldev/nuker/pyro/fbu;
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //    79: goto            83
        //    82: athrow         
        //    83: aload_0        
        //    84: goto            88
        //    87: athrow         
        //    88: invokestatic    dev/nuker/pyro/f8W.1:()D
        //    91: goto            95
        //    94: athrow         
        //    95: putfield        dev/nuker/pyro/f93.c:D
        //    98: aload_0        
        //    99: ldc2_w          2.0
        //   102: getstatic       dev/nuker/pyro/fc.1:I
        //   105: ifeq            113
        //   108: ldc             -327878907
        //   110: goto            115
        //   113: ldc             1551378322
        //   115: ldc             -525555454
        //   117: ixor           
        //   118: lookupswitch {
        //          -708414127: 113
        //          215506439: 198
        //          default: 144
        //        }
        //   144: putfield        dev/nuker/pyro/f93.1:D
        //   147: getstatic       dev/nuker/pyro/fc.c:I
        //   150: ifge            158
        //   153: ldc             -1502497703
        //   155: goto            160
        //   158: ldc             -751346711
        //   160: ldc             191841805
        //   162: ixor           
        //   163: lookupswitch {
        //          -1390480812: 158
        //          -665313820: 188
        //          default: 194
        //        }
        //   188: aload_0        
        //   189: dconst_0       
        //   190: putfield        dev/nuker/pyro/f93.0:D
        //   193: return         
        //   194: aconst_null    
        //   195: athrow         
        //   196: aconst_null    
        //   197: athrow         
        //   198: aconst_null    
        //   199: athrow         
        //   200: pop            
        //   201: goto            24
        //   204: pop            
        //   205: aconst_null    
        //   206: goto            200
        //   209: dup            
        //   210: ifnull          200
        //   213: checkcast       Ljava/lang/Throwable;
        //   216: athrow         
        //   217: dup            
        //   218: ifnull          204
        //   221: checkcast       Ljava/lang/Throwable;
        //   224: athrow         
        //   225: aconst_null    
        //   226: athrow         
        //    StackMapTable: 00 1D 43 07 00 1C 04 FF 00 0B 00 00 00 01 07 00 1C FC 00 03 07 00 03 0A 41 01 1E 46 07 00 13 40 07 00 23 45 07 00 1C 00 43 07 00 15 40 07 00 03 45 07 00 1C FF 00 00 00 01 07 00 03 00 02 07 00 03 03 FF 00 11 00 01 07 00 03 00 02 07 00 03 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 03 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 03 0D 41 01 1B 05 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 03 41 07 00 1C 43 05 44 07 00 1C 47 05 47 07 00 1C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  8      20     209    217    Any
        //  209    217    209    217    Ljava/lang/IndexOutOfBoundsException;
        //  225    227    3      8      Any
        //  75     82     82     83     Any
        //  76     82     3      8      Ljava/lang/RuntimeException;
        //  76     82     3      8      Ljava/lang/ArithmeticException;
        //  75     82     75     76     Ljava/lang/IllegalStateException;
        //  75     82     82     83     Any
        //  87     94     94     95     Any
        //  88     94     87     88     Ljava/lang/IllegalArgumentException;
        //  88     94     94     95     Any
        //  88     94     94     95     Ljava/lang/IllegalArgumentException;
        //  88     94     3      8      Ljava/lang/ArithmeticException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:559)
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
    
    @Override
    public void c() {
        fbS.dZ(this, 1802669299);
    }
    
    @Override
    public void c(@NotNull final f3e p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1734
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1726
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1718
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_1        
        //    27: getstatic       dev/nuker/pyro/fc.1:I
        //    30: ifeq            38
        //    33: ldc             303773877
        //    35: goto            40
        //    38: ldc             -1457976859
        //    40: ldc             1878039811
        //    42: ixor           
        //    43: lookupswitch {
        //          -1371328742: 38
        //          2112595382: 1687
        //          default: 68
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokevirtual   dev/nuker/pyro/f3e.c:()Ldev/nuker/pyro/f2T;
        //    75: goto            79
        //    78: athrow         
        //    79: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    82: if_acmpeq       86
        //    85: return         
        //    86: aload_1        
        //    87: goto            91
        //    90: athrow         
        //    91: invokevirtual   dev/nuker/pyro/f3e.0:()Z
        //    94: goto            98
        //    97: athrow         
        //    98: ifeq            102
        //   101: return         
        //   102: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   105: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   108: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71158_b:Lnet/minecraft/util/MovementInput;
        //   111: getstatic       dev/nuker/pyro/fc.1:I
        //   114: ifeq            122
        //   117: ldc             1152197913
        //   119: goto            124
        //   122: ldc             872436980
        //   124: ldc             -1203289077
        //   126: ixor           
        //   127: lookupswitch {
        //          -1941499649: 152
        //          -51748590: 122
        //          default: 1669
        //        }
        //   152: getfield        net/minecraft/util/MovementInput.field_78901_c:Z
        //   155: ifeq            163
        //   158: ldc             -1030643975
        //   160: goto            165
        //   163: ldc             -1030643976
        //   165: ldc             -139117595
        //   167: ixor           
        //   168: tableswitch {
        //          1783188024: 192
        //          1783188025: 200
        //          default: 158
        //        }
        //   192: aload_0        
        //   193: ldc2_w          2.0
        //   196: putfield        dev/nuker/pyro/f93.1:D
        //   199: return         
        //   200: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   203: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   206: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70122_E:Z
        //   209: ifne            217
        //   212: ldc             1131108780
        //   214: goto            219
        //   217: ldc             1131108783
        //   219: ldc             1534386537
        //   221: ixor           
        //   222: tableswitch {
        //          809464202: 244
        //          809464203: 299
        //          default: 212
        //        }
        //   244: getstatic       dev/nuker/pyro/fc.1:I
        //   247: ifeq            255
        //   250: ldc             -1094595383
        //   252: goto            257
        //   255: ldc             996736366
        //   257: ldc             844557067
        //   259: ixor           
        //   260: lookupswitch {
        //          -1936250942: 255
        //          155063909: 288
        //          default: 1663
        //        }
        //   288: aload_0        
        //   289: getfield        dev/nuker/pyro/f93.1:D
        //   292: ldc2_w          3.0
        //   295: dcmpg          
        //   296: ifne            1658
        //   299: getstatic       dev/nuker/pyro/fc.0:I
        //   302: ifeq            310
        //   305: ldc             1686873894
        //   307: goto            312
        //   310: ldc             -393544803
        //   312: ldc             -1701379617
        //   314: ixor           
        //   315: lookupswitch {
        //          -31676679: 310
        //          1914567234: 340
        //          default: 1691
        //        }
        //   340: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   343: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   346: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70123_F:Z
        //   349: ifne            366
        //   352: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   355: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   358: getfield        net/minecraft/client/entity/EntityPlayerSP.field_191988_bg:F
        //   361: fconst_0       
        //   362: fcmpg          
        //   363: ifne            422
        //   366: getstatic       dev/nuker/pyro/fc.1:I
        //   369: ifeq            377
        //   372: ldc             -472435589
        //   374: goto            379
        //   377: ldc             1585613976
        //   379: ldc             -76104432
        //   381: ixor           
        //   382: lookupswitch {
        //          -1510723192: 408
        //          413239659: 377
        //          default: 1705
        //        }
        //   408: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   411: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   414: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70702_br:F
        //   417: fconst_0       
        //   418: fcmpg          
        //   419: ifeq            1129
        //   422: aload_0        
        //   423: getfield        dev/nuker/pyro/f93.1:D
        //   426: ldc2_w          2.0
        //   429: dcmpg          
        //   430: ifne            498
        //   433: aload_0        
        //   434: dup            
        //   435: getfield        dev/nuker/pyro/f93.c:D
        //   438: ldc2_w          2.149
        //   441: dmul           
        //   442: putfield        dev/nuker/pyro/f93.c:D
        //   445: getstatic       dev/nuker/pyro/fc.0:I
        //   448: ifeq            456
        //   451: ldc             2068388844
        //   453: goto            458
        //   456: ldc             1898446044
        //   458: ldc             262221624
        //   460: ixor           
        //   461: lookupswitch {
        //          1961374932: 456
        //          2122765284: 488
        //          default: 1681
        //        }
        //   488: aload_0        
        //   489: ldc2_w          3.0
        //   492: putfield        dev/nuker/pyro/f93.1:D
        //   495: goto            1129
        //   498: aload_0        
        //   499: getfield        dev/nuker/pyro/f93.1:D
        //   502: ldc2_w          3.0
        //   505: dcmpg          
        //   506: ifne            514
        //   509: ldc             2143697053
        //   511: goto            516
        //   514: ldc             2143697052
        //   516: ldc             362514633
        //   518: ixor           
        //   519: tableswitch {
        //          -725917528: 540
        //          -725917527: 664
        //          default: 509
        //        }
        //   540: aload_0        
        //   541: ldc2_w          2.0
        //   544: putfield        dev/nuker/pyro/f93.1:D
        //   547: aload_0        
        //   548: getstatic       dev/nuker/pyro/fc.1:I
        //   551: ifeq            559
        //   554: ldc             -1850351856
        //   556: goto            561
        //   559: ldc             717458871
        //   561: ldc             -605562039
        //   563: ixor           
        //   564: lookupswitch {
        //          -383834398: 559
        //          1246889049: 1699
        //          default: 592
        //        }
        //   592: aload_0        
        //   593: getfield        dev/nuker/pyro/f93.0:D
        //   596: ldc2_w          0.66
        //   599: aload_0        
        //   600: getfield        dev/nuker/pyro/f93.0:D
        //   603: getstatic       dev/nuker/pyro/fc.c:I
        //   606: ifge            614
        //   609: ldc             -1276142183
        //   611: goto            616
        //   614: ldc             518209620
        //   616: ldc             1116768616
        //   618: ixor           
        //   619: lookupswitch {
        //          -243329807: 1685
        //          535704850: 614
        //          default: 644
        //        }
        //   644: goto            648
        //   647: athrow         
        //   648: invokestatic    dev/nuker/pyro/f8W.1:()D
        //   651: goto            655
        //   654: athrow         
        //   655: dsub           
        //   656: dmul           
        //   657: dsub           
        //   658: putfield        dev/nuker/pyro/f93.c:D
        //   661: goto            1129
        //   664: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   667: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   670: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   673: getstatic       dev/nuker/pyro/fc.c:I
        //   676: ifge            684
        //   679: ldc             1400873376
        //   681: goto            686
        //   684: ldc             -363360304
        //   686: ldc             1751025738
        //   688: ixor           
        //   689: lookupswitch {
        //          992029162: 1697
        //          1551698414: 684
        //          default: 716
        //        }
        //   716: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   719: checkcast       Lnet/minecraft/entity/Entity;
        //   722: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   725: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   728: dup            
        //   729: pop            
        //   730: goto            734
        //   733: athrow         
        //   734: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   737: goto            741
        //   740: athrow         
        //   741: dconst_0       
        //   742: getstatic       dev/nuker/pyro/fc.1:I
        //   745: ifeq            753
        //   748: ldc             -507100389
        //   750: goto            755
        //   753: ldc             -508135581
        //   755: ldc             1667334099
        //   757: ixor           
        //   758: lookupswitch {
        //          -2102969144: 1677
        //          -2048414081: 753
        //          default: 784
        //        }
        //   784: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   787: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   790: getstatic       dev/nuker/pyro/fc.1:I
        //   793: ifeq            801
        //   796: ldc             -2018933037
        //   798: goto            803
        //   801: ldc             -244617782
        //   803: ldc             -1246222873
        //   805: ixor           
        //   806: lookupswitch {
        //          840016692: 801
        //          1154697261: 832
        //          default: 1671
        //        }
        //   832: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //   835: dconst_0       
        //   836: goto            840
        //   839: athrow         
        //   840: invokevirtual   net/minecraft/util/math/AxisAlignedBB.func_72317_d:(DDD)Lnet/minecraft/util/math/AxisAlignedBB;
        //   843: goto            847
        //   846: athrow         
        //   847: goto            851
        //   850: athrow         
        //   851: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_184144_a:(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
        //   854: goto            858
        //   857: athrow         
        //   858: getstatic       dev/nuker/pyro/fc.1:I
        //   861: ifeq            869
        //   864: ldc             476235482
        //   866: goto            871
        //   869: ldc             2050828882
        //   871: ldc             -382472306
        //   873: ixor           
        //   874: lookupswitch {
        //          -1827748388: 900
        //          -179230380: 869
        //          default: 1665
        //        }
        //   900: astore_2       
        //   901: getstatic       dev/nuker/pyro/fc.1:I
        //   904: ifeq            912
        //   907: ldc             1700171233
        //   909: goto            914
        //   912: ldc             -301564336
        //   914: ldc             562912803
        //   916: ixor           
        //   917: lookupswitch {
        //          -812965773: 944
        //          1155257282: 912
        //          default: 1701
        //        }
        //   944: aload_2        
        //   945: goto            949
        //   948: athrow         
        //   949: invokeinterface java/util/List.size:()I
        //   954: goto            958
        //   957: athrow         
        //   958: ifgt            966
        //   961: ldc             -489334097
        //   963: goto            968
        //   966: ldc             -489334098
        //   968: ldc             475333259
        //   970: ixor           
        //   971: tableswitch {
        //          -50286520: 992
        //          -50286519: 1124
        //          default: 961
        //        }
        //   992: getstatic       dev/nuker/pyro/fc.1:I
        //   995: ifeq            1003
        //   998: ldc             -1409704126
        //  1000: goto            1005
        //  1003: ldc             -893945520
        //  1005: ldc             -102746899
        //  1007: ixor           
        //  1008: lookupswitch {
        //          -1888698442: 1003
        //          1377414063: 1675
        //          default: 1036
        //        }
        //  1036: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  1039: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1042: getstatic       dev/nuker/pyro/fc.1:I
        //  1045: ifeq            1053
        //  1048: ldc             -447751162
        //  1050: goto            1055
        //  1053: ldc             1344304693
        //  1055: ldc             -749245123
        //  1057: ixor           
        //  1058: lookupswitch {
        //          757016234: 1053
        //          907587899: 1707
        //          default: 1084
        //        }
        //  1084: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70124_G:Z
        //  1087: ifeq            1095
        //  1090: ldc             1223911376
        //  1092: goto            1097
        //  1095: ldc             1223911383
        //  1097: ldc             1367651579
        //  1099: ixor           
        //  1100: tableswitch {
        //          854566486: 1124
        //          854566487: 1129
        //          default: 1090
        //        }
        //  1124: aload_0        
        //  1125: dconst_1       
        //  1126: putfield        dev/nuker/pyro/f93.1:D
        //  1129: getstatic       dev/nuker/pyro/fc.1:I
        //  1132: ifeq            1140
        //  1135: ldc             63179535
        //  1137: goto            1142
        //  1140: ldc             -2141192911
        //  1142: ldc             169597569
        //  1144: ixor           
        //  1145: lookupswitch {
        //          165663118: 1703
        //          2119423302: 1140
        //          default: 1172
        //        }
        //  1172: aload_1        
        //  1173: goto            1177
        //  1176: athrow         
        //  1177: invokevirtual   dev/nuker/pyro/f3e.c:()V
        //  1180: goto            1184
        //  1183: athrow         
        //  1184: getstatic       dev/nuker/pyro/fc.c:I
        //  1187: ifge            1195
        //  1190: ldc             -2120586817
        //  1192: goto            1197
        //  1195: ldc             -10146535
        //  1197: ldc             1195448594
        //  1199: ixor           
        //  1200: lookupswitch {
        //          -1205586933: 1228
        //          -958697299: 1195
        //          default: 1673
        //        }
        //  1228: aload_1        
        //  1229: getstatic       dev/nuker/pyro/fc.0:I
        //  1232: ifeq            1240
        //  1235: ldc             -2011549212
        //  1237: goto            1242
        //  1240: ldc             -910866464
        //  1242: ldc             430670251
        //  1244: ixor           
        //  1245: lookupswitch {
        //          -1850625969: 1667
        //          1572457344: 1240
        //          default: 1272
        //        }
        //  1272: aload_0        
        //  1273: getfield        dev/nuker/pyro/f93.c:D
        //  1276: getstatic       dev/nuker/pyro/fc.c:I
        //  1279: ifge            1287
        //  1282: ldc             -1403400637
        //  1284: goto            1289
        //  1287: ldc             1965677843
        //  1289: ldc             -1363717958
        //  1291: ixor           
        //  1292: lookupswitch {
        //          49192697: 1693
        //          532259927: 1287
        //          default: 1320
        //        }
        //  1320: goto            1324
        //  1323: athrow         
        //  1324: invokestatic    dev/nuker/pyro/f8W.1:()D
        //  1327: goto            1331
        //  1330: athrow         
        //  1331: goto            1335
        //  1334: athrow         
        //  1335: invokestatic    kotlin/ranges/RangesKt.coerceAtLeast:(DD)D
        //  1338: goto            1342
        //  1341: athrow         
        //  1342: getstatic       dev/nuker/pyro/fc.c:I
        //  1345: ifge            1353
        //  1348: ldc             1181965256
        //  1350: goto            1356
        //  1353: ldc_w           1113325374
        //  1356: ldc_w           172897496
        //  1359: ixor           
        //  1360: lookupswitch {
        //          1209388006: 1388
        //          1279094544: 1353
        //          default: 1689
        //        }
        //  1388: dstore_2       
        //  1389: getstatic       dev/nuker/pyro/fc.1:I
        //  1392: ifeq            1401
        //  1395: ldc_w           1412269240
        //  1398: goto            1404
        //  1401: ldc_w           -44658298
        //  1404: ldc_w           540443432
        //  1407: ixor           
        //  1408: lookupswitch {
        //          -580906322: 1436
        //          1947928464: 1401
        //          default: 1661
        //        }
        //  1436: astore          9
        //  1438: iconst_0       
        //  1439: getstatic       dev/nuker/pyro/fc.c:I
        //  1442: ifge            1451
        //  1445: ldc_w           -1942134215
        //  1448: goto            1454
        //  1451: ldc_w           1734237414
        //  1454: ldc_w           -1755919138
        //  1457: ixor           
        //  1458: lookupswitch {
        //          -267874248: 1484
        //          460041959: 1451
        //          default: 1679
        //        }
        //  1484: istore          4
        //  1486: iconst_0       
        //  1487: istore          5
        //  1489: getstatic       dev/nuker/pyro/fc.c:I
        //  1492: ifge            1501
        //  1495: ldc_w           -1696420084
        //  1498: goto            1504
        //  1501: ldc_w           994772053
        //  1504: ldc_w           -1214973384
        //  1507: ixor           
        //  1508: lookupswitch {
        //          762729780: 1695
        //          828540391: 1501
        //          default: 1536
        //        }
        //  1536: dload_2        
        //  1537: dstore          6
        //  1539: iconst_0       
        //  1540: istore          8
        //  1542: aload_0        
        //  1543: dload           6
        //  1545: getstatic       dev/nuker/pyro/fc.c:I
        //  1548: ifge            1557
        //  1551: ldc_w           -568487335
        //  1554: goto            1560
        //  1557: ldc_w           -1985466049
        //  1560: ldc_w           2073505214
        //  1563: ixor           
        //  1564: lookupswitch {
        //          -1517633561: 1683
        //          1509056415: 1557
        //          default: 1592
        //        }
        //  1592: putfield        dev/nuker/pyro/f93.c:D
        //  1595: getstatic       dev/nuker/pyro/fc.1:I
        //  1598: ifeq            1607
        //  1601: ldc_w           -1323345915
        //  1604: goto            1610
        //  1607: ldc_w           -1877637798
        //  1610: ldc_w           604923418
        //  1613: ixor           
        //  1614: lookupswitch {
        //          -1794032097: 1607
        //          -1273240768: 1640
        //          default: 1659
        //        }
        //  1640: dload_2        
        //  1641: dstore          10
        //  1643: aload           9
        //  1645: dload           10
        //  1647: goto            1651
        //  1650: athrow         
        //  1651: invokestatic    dev/nuker/pyro/fbl.c:(Ldev/nuker/pyro/f3e;D)V
        //  1654: goto            1658
        //  1657: athrow         
        //  1658: return         
        //  1659: aconst_null    
        //  1660: athrow         
        //  1661: aconst_null    
        //  1662: athrow         
        //  1663: aconst_null    
        //  1664: athrow         
        //  1665: aconst_null    
        //  1666: athrow         
        //  1667: aconst_null    
        //  1668: athrow         
        //  1669: aconst_null    
        //  1670: athrow         
        //  1671: aconst_null    
        //  1672: athrow         
        //  1673: aconst_null    
        //  1674: athrow         
        //  1675: aconst_null    
        //  1676: athrow         
        //  1677: aconst_null    
        //  1678: athrow         
        //  1679: aconst_null    
        //  1680: athrow         
        //  1681: aconst_null    
        //  1682: athrow         
        //  1683: aconst_null    
        //  1684: athrow         
        //  1685: aconst_null    
        //  1686: athrow         
        //  1687: aconst_null    
        //  1688: athrow         
        //  1689: aconst_null    
        //  1690: athrow         
        //  1691: aconst_null    
        //  1692: athrow         
        //  1693: aconst_null    
        //  1694: athrow         
        //  1695: aconst_null    
        //  1696: athrow         
        //  1697: aconst_null    
        //  1698: athrow         
        //  1699: aconst_null    
        //  1700: athrow         
        //  1701: aconst_null    
        //  1702: athrow         
        //  1703: aconst_null    
        //  1704: athrow         
        //  1705: aconst_null    
        //  1706: athrow         
        //  1707: aconst_null    
        //  1708: athrow         
        //  1709: pop            
        //  1710: goto            24
        //  1713: pop            
        //  1714: aconst_null    
        //  1715: goto            1709
        //  1718: dup            
        //  1719: ifnull          1709
        //  1722: checkcast       Ljava/lang/Throwable;
        //  1725: athrow         
        //  1726: dup            
        //  1727: ifnull          1713
        //  1730: checkcast       Ljava/lang/Throwable;
        //  1733: athrow         
        //  1734: aconst_null    
        //  1735: athrow         
        //    StackMapTable: 00 B6 43 07 00 1C 04 FF 00 0B 00 00 00 01 07 00 1C FD 00 03 07 00 03 07 00 5C 4D 07 00 5C FF 00 01 00 02 07 00 03 07 00 5C 00 02 07 00 5C 01 5B 07 00 5C 42 07 00 0F 40 07 00 5C 45 07 00 1C 40 07 00 61 06 43 07 00 1C 40 07 00 5C 45 07 00 1C 40 01 03 53 07 00 7B FF 00 01 00 02 07 00 03 07 00 5C 00 02 07 00 7B 01 5B 07 00 7B 05 04 41 01 1A 07 0B 04 41 01 18 0A 41 01 1E 0A 0A 41 01 1B 19 0A 41 01 1C 0D 21 41 01 1D 09 0A 04 41 01 17 52 07 00 03 FF 00 01 00 02 07 00 03 07 00 5C 00 02 07 00 03 01 5E 07 00 03 FF 00 15 00 02 07 00 03 07 00 5C 00 04 07 00 03 03 03 03 FF 00 01 00 02 07 00 03 07 00 5C 00 05 07 00 03 03 03 03 01 FF 00 1B 00 02 07 00 03 07 00 5C 00 04 07 00 03 03 03 03 42 07 00 4F FF 00 00 00 02 07 00 03 07 00 5C 00 04 07 00 03 03 03 03 45 07 00 1C FF 00 00 00 02 07 00 03 07 00 5C 00 05 07 00 03 03 03 03 03 08 FF 00 13 00 02 07 00 03 07 00 5C 00 02 07 00 CB 07 00 6C FF 00 01 00 02 07 00 03 07 00 5C 00 03 07 00 CB 07 00 6C 01 FF 00 1D 00 02 07 00 03 07 00 5C 00 02 07 00 CB 07 00 6C 50 07 00 1C FF 00 00 00 02 07 00 03 07 00 5C 00 03 07 00 CB 07 00 B6 07 00 72 45 07 00 1C FF 00 00 00 02 07 00 03 07 00 5C 00 03 07 00 CB 07 00 B6 07 00 C5 FF 00 0B 00 02 07 00 03 07 00 5C 00 04 07 00 CB 07 00 B6 07 00 C5 03 FF 00 01 00 02 07 00 03 07 00 5C 00 05 07 00 CB 07 00 B6 07 00 C5 03 01 FF 00 1C 00 02 07 00 03 07 00 5C 00 04 07 00 CB 07 00 B6 07 00 C5 03 FF 00 10 00 02 07 00 03 07 00 5C 00 05 07 00 CB 07 00 B6 07 00 C5 03 07 00 72 FF 00 01 00 02 07 00 03 07 00 5C 00 06 07 00 CB 07 00 B6 07 00 C5 03 07 00 72 01 FF 00 1C 00 02 07 00 03 07 00 5C 00 05 07 00 CB 07 00 B6 07 00 C5 03 07 00 72 46 07 00 1C FF 00 00 00 02 07 00 03 07 00 5C 00 06 07 00 CB 07 00 B6 07 00 C5 03 03 03 45 07 00 1C FF 00 00 00 02 07 00 03 07 00 5C 00 03 07 00 CB 07 00 B6 07 00 C5 42 07 00 1C FF 00 00 00 02 07 00 03 07 00 5C 00 03 07 00 CB 07 00 B6 07 00 C5 45 07 00 1C 40 07 00 D7 4A 07 00 D7 FF 00 01 00 02 07 00 03 07 00 5C 00 02 07 00 D7 01 5C 07 00 D7 FC 00 0B 07 00 D7 41 01 1D 43 07 00 1C 40 07 00 D7 47 07 00 1C 40 01 02 04 41 01 17 0A 41 01 1E 50 07 00 72 FF 00 01 00 03 07 00 03 07 00 5C 07 00 D7 00 02 07 00 72 01 5C 07 00 72 05 04 41 01 1A FA 00 04 0A 41 01 1D 43 07 00 1C 40 07 00 5C 45 07 00 1C 00 0A 41 01 1E 4B 07 00 5C FF 00 01 00 02 07 00 03 07 00 5C 00 02 07 00 5C 01 5D 07 00 5C FF 00 0E 00 02 07 00 03 07 00 5C 00 02 07 00 5C 03 FF 00 01 00 02 07 00 03 07 00 5C 00 03 07 00 5C 03 01 FF 00 1E 00 02 07 00 03 07 00 5C 00 02 07 00 5C 03 FF 00 02 00 00 00 01 07 00 1C FF 00 00 00 02 07 00 03 07 00 5C 00 02 07 00 5C 03 45 07 00 1C FF 00 00 00 02 07 00 03 07 00 5C 00 03 07 00 5C 03 03 42 07 00 1C FF 00 00 00 02 07 00 03 07 00 5C 00 03 07 00 5C 03 03 45 07 00 1C FF 00 00 00 02 07 00 03 07 00 5C 00 02 07 00 5C 03 FF 00 0A 00 02 07 00 03 07 00 5C 00 02 07 00 5C 03 FF 00 02 00 02 07 00 03 07 00 5C 00 03 07 00 5C 03 01 FF 00 1F 00 02 07 00 03 07 00 5C 00 02 07 00 5C 03 FF 00 0C 00 03 07 00 03 07 00 5C 03 00 01 07 00 5C FF 00 02 00 03 07 00 03 07 00 5C 03 00 02 07 00 5C 01 5F 07 00 5C FF 00 0E 00 09 07 00 03 07 00 5C 03 00 00 00 00 00 07 00 5C 00 01 01 FF 00 02 00 09 07 00 03 07 00 5C 03 00 00 00 00 00 07 00 5C 00 02 01 01 5D 01 FF 00 10 00 09 07 00 03 07 00 5C 03 01 01 00 00 00 07 00 5C 00 00 42 01 1F FF 00 14 00 08 07 00 03 07 00 5C 03 01 01 03 01 07 00 5C 00 02 07 00 03 03 FF 00 02 00 08 07 00 03 07 00 5C 03 01 01 03 01 07 00 5C 00 03 07 00 03 03 01 FF 00 1F 00 08 07 00 03 07 00 5C 03 01 01 03 01 07 00 5C 00 02 07 00 03 03 0E 42 01 1D FF 00 09 00 00 00 01 07 00 1C FF 00 00 00 09 07 00 03 07 00 5C 03 01 01 03 01 07 00 5C 03 00 02 07 00 5C 03 45 07 00 1C FF 00 00 00 02 07 00 03 07 00 5C 00 00 FF 00 00 00 08 07 00 03 07 00 5C 03 01 01 03 01 07 00 5C 00 00 FF 00 01 00 03 07 00 03 07 00 5C 03 00 01 07 00 5C FA 00 01 41 07 00 D7 41 07 00 5C 41 07 00 7B FF 00 01 00 02 07 00 03 07 00 5C 00 05 07 00 CB 07 00 B6 07 00 C5 03 07 00 72 01 FC 00 01 07 00 D7 FF 00 01 00 02 07 00 03 07 00 5C 00 04 07 00 CB 07 00 B6 07 00 C5 03 FF 00 01 00 09 07 00 03 07 00 5C 03 00 00 00 00 00 07 00 5C 00 01 01 FF 00 01 00 02 07 00 03 07 00 5C 00 00 FF 00 01 00 08 07 00 03 07 00 5C 03 01 01 03 01 07 00 5C 00 02 07 00 03 03 FF 00 01 00 02 07 00 03 07 00 5C 00 04 07 00 03 03 03 03 41 07 00 5C FF 00 01 00 02 07 00 03 07 00 5C 00 02 07 00 5C 03 01 FF 00 01 00 02 07 00 03 07 00 5C 00 02 07 00 5C 03 FF 00 01 00 09 07 00 03 07 00 5C 03 01 01 00 00 00 07 00 5C 00 00 FF 00 01 00 02 07 00 03 07 00 5C 00 02 07 00 CB 07 00 6C 41 07 00 03 FC 00 01 07 00 D7 FA 00 01 01 FF 00 01 00 03 07 00 03 07 00 5C 07 00 D7 00 01 07 00 72 FF 00 01 00 02 07 00 03 07 00 5C 00 01 07 00 1C 43 05 44 07 00 1C 47 05 47 07 00 1C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1718   1726   Ljava/lang/StringIndexOutOfBoundsException;
        //  1718   1726   1718   1726   Any
        //  1734   1736   3      8      Ljava/lang/NegativeArraySizeException;
        //  71     78     78     79     Any
        //  71     78     3      8      Any
        //  71     78     71     72     Ljava/lang/IndexOutOfBoundsException;
        //  72     78     71     72     Ljava/lang/IllegalStateException;
        //  71     78     71     72     Ljava/lang/IndexOutOfBoundsException;
        //  90     97     97     98     Any
        //  91     97     90     91     Any
        //  91     97     97     98     Ljava/lang/NegativeArraySizeException;
        //  91     97     90     91     Ljava/lang/ClassCastException;
        //  90     97     3      8      Any
        //  647    654    654    655    Any
        //  647    654    654    655    Ljava/util/NoSuchElementException;
        //  647    654    654    655    Any
        //  647    654    647    648    Ljava/lang/NumberFormatException;
        //  648    654    654    655    Any
        //  733    740    740    741    Any
        //  734    740    3      8      Any
        //  733    740    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  734    740    733    734    Any
        //  733    740    3      8      Any
        //  839    846    846    847    Any
        //  840    846    846    847    Any
        //  840    846    839    840    Ljava/util/NoSuchElementException;
        //  839    846    846    847    Any
        //  839    846    839    840    Any
        //  850    857    857    858    Any
        //  851    857    850    851    Any
        //  850    857    850    851    Any
        //  850    857    3      8      Ljava/lang/ClassCastException;
        //  850    857    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  948    957    957    958    Any
        //  949    957    3      8      Any
        //  948    957    957    958    Ljava/lang/UnsupportedOperationException;
        //  949    957    948    949    Any
        //  949    957    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1176   1183   1183   1184   Any
        //  1176   1183   1176   1177   Any
        //  1177   1183   1183   1184   Any
        //  1177   1183   1183   1184   Any
        //  1176   1183   3      8      Ljava/util/ConcurrentModificationException;
        //  1324   1330   1330   1331   Any
        //  1324   1330   1330   1331   Ljava/util/ConcurrentModificationException;
        //  1324   1330   1330   1331   Any
        //  1324   1330   3      8      Ljava/lang/NullPointerException;
        //  1324   1330   1330   1331   Ljava/lang/UnsupportedOperationException;
        //  1334   1341   1341   1342   Any
        //  1334   1341   3      8      Any
        //  1334   1341   1334   1335   Any
        //  1334   1341   3      8      Any
        //  1335   1341   1341   1342   Any
        //  1651   1657   1657   1658   Any
        //  1651   1657   1657   1658   Ljava/lang/NegativeArraySizeException;
        //  1651   1657   1657   1658   Any
        //  1651   1657   1657   1658   Any
        //  1651   1657   1657   1658   Ljava/lang/EnumConstantNotPresentException;
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
    
    public f93() {
        this.1 = 2.0;
        while (true) {
            int n = 0;
            Label_0026: {
                if (fc.c < 0) {
                    n = -852779709;
                    break Label_0026;
                }
                n = -1992831133;
            }
            switch (n ^ 0x9A9D314E) {
                case 1471589389: {
                    continue;
                }
                case 329973293: {
                    this.c = new fbu();
                    while (true) {
                        int n2 = 0;
                        Label_0082: {
                            if (fc.c < 0) {
                                n2 = -1595729494;
                                break Label_0082;
                            }
                            n2 = 199634473;
                        }
                        switch (n2 ^ 0xC54EDF26) {
                            case 1705887372: {
                                continue;
                            }
                            case -827789041: {
                                while (true) {
                                    int n3 = 0;
                                    Label_0128: {
                                        if (fc.0 != 0) {
                                            n3 = -1701263310;
                                            break Label_0128;
                                        }
                                        n3 = 1100414035;
                                    }
                                    switch (n3 ^ 0xE811227) {
                                        case -1810245099: {
                                            continue;
                                        }
                                        case 1326968436: {
                                            this.c = f8W.1();
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
    }
    
    @Override
    public void c(@NotNull final f3i p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          903
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            895
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            887
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_1        
        //    27: getstatic       dev/nuker/pyro/fc.c:I
        //    30: ifge            39
        //    33: ldc_w           544305773
        //    36: goto            42
        //    39: ldc_w           -552610090
        //    42: ldc_w           -1802117930
        //    45: ixor           
        //    46: lookupswitch {
        //          -1260081477: 874
        //          1532730425: 39
        //          default: 72
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   dev/nuker/pyro/f3i.c:()Ldev/nuker/pyro/f2T;
        //    79: goto            83
        //    82: athrow         
        //    83: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    86: if_acmpeq       95
        //    89: ldc_w           -1419871118
        //    92: goto            98
        //    95: ldc_w           -1419871119
        //    98: ldc_w           -1684810977
        //   101: ixor           
        //   102: tableswitch {
        //          1637572314: 124
        //          1637572315: 125
        //          default: 89
        //        }
        //   124: return         
        //   125: aload_0        
        //   126: getfield        dev/nuker/pyro/f93.1:D
        //   129: ldc2_w          3.0
        //   132: dcmpg          
        //   133: ifne            364
        //   136: aload_1        
        //   137: goto            141
        //   140: athrow         
        //   141: invokevirtual   dev/nuker/pyro/f3i.c:()V
        //   144: goto            148
        //   147: athrow         
        //   148: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   151: getstatic       dev/nuker/pyro/fc.c:I
        //   154: ifge            163
        //   157: ldc_w           853933006
        //   160: goto            166
        //   163: ldc_w           439447665
        //   166: ldc_w           -1771609454
        //   169: ixor           
        //   170: lookupswitch {
        //          -1534944932: 870
        //          -633704335: 163
        //          default: 196
        //        }
        //   196: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   199: dup            
        //   200: pop            
        //   201: goto            205
        //   204: athrow         
        //   205: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_180425_c:()Lnet/minecraft/util/math/BlockPos;
        //   208: goto            212
        //   211: athrow         
        //   212: goto            216
        //   215: athrow         
        //   216: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   219: goto            223
        //   222: athrow         
        //   223: goto            227
        //   226: athrow         
        //   227: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   230: goto            234
        //   233: athrow         
        //   234: goto            238
        //   237: athrow         
        //   238: invokestatic    dev/nuker/pyro/fbA.c:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/material/Material;
        //   241: goto            245
        //   244: athrow         
        //   245: goto            249
        //   248: athrow         
        //   249: invokevirtual   net/minecraft/block/material/Material.func_76230_c:()Z
        //   252: goto            256
        //   255: athrow         
        //   256: ifeq            290
        //   259: aload_1        
        //   260: aload_1        
        //   261: goto            265
        //   264: athrow         
        //   265: invokevirtual   dev/nuker/pyro/f3i.4:()D
        //   268: goto            272
        //   271: athrow         
        //   272: ldc2_w          0.2
        //   275: dadd           
        //   276: goto            280
        //   279: athrow         
        //   280: invokevirtual   dev/nuker/pyro/f3i.c:(D)V
        //   283: goto            287
        //   286: athrow         
        //   287: goto            364
        //   290: getstatic       dev/nuker/pyro/fc.c:I
        //   293: ifge            302
        //   296: ldc_w           -1957625449
        //   299: goto            305
        //   302: ldc_w           122067347
        //   305: ldc_w           236114894
        //   308: ixor           
        //   309: lookupswitch {
        //          -2059152807: 854
        //          -1250606223: 302
        //          default: 336
        //        }
        //   336: aload_1        
        //   337: aload_1        
        //   338: goto            342
        //   341: athrow         
        //   342: invokevirtual   dev/nuker/pyro/f3i.4:()D
        //   345: goto            349
        //   348: athrow         
        //   349: ldc2_w          0.4
        //   352: dadd           
        //   353: goto            357
        //   356: athrow         
        //   357: invokevirtual   dev/nuker/pyro/f3i.c:(D)V
        //   360: goto            364
        //   363: athrow         
        //   364: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   367: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   370: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   373: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   376: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   379: getstatic       dev/nuker/pyro/fc.c:I
        //   382: ifge            391
        //   385: ldc_w           577056913
        //   388: goto            394
        //   391: ldc_w           1675630005
        //   394: ldc_w           87997777
        //   397: ixor           
        //   398: lookupswitch {
        //          660311488: 391
        //          1725868260: 424
        //          default: 856
        //        }
        //   424: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70169_q:D
        //   427: dsub           
        //   428: getstatic       dev/nuker/pyro/fc.1:I
        //   431: ifeq            440
        //   434: ldc_w           -550764247
        //   437: goto            443
        //   440: ldc_w           -1163117779
        //   443: ldc_w           615025782
        //   446: ixor           
        //   447: lookupswitch {
        //          -1643858085: 472
        //          -75199137: 440
        //          default: 872
        //        }
        //   472: dstore_2       
        //   473: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   476: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   479: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   482: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   485: getstatic       dev/nuker/pyro/fc.1:I
        //   488: ifeq            497
        //   491: ldc_w           254255487
        //   494: goto            500
        //   497: ldc_w           1169143480
        //   500: ldc_w           -192863961
        //   503: ixor           
        //   504: lookupswitch {
        //          -72974248: 862
        //          276868613: 497
        //          default: 532
        //        }
        //   532: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   535: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70166_s:D
        //   538: dsub           
        //   539: dstore          4
        //   541: aload_0        
        //   542: getstatic       dev/nuker/pyro/fc.1:I
        //   545: ifeq            554
        //   548: ldc_w           2058368401
        //   551: goto            557
        //   554: ldc_w           -252887803
        //   557: ldc_w           -994151652
        //   560: ixor           
        //   561: lookupswitch {
        //          -1106360691: 868
        //          1106660717: 554
        //          default: 588
        //        }
        //   588: dload_2        
        //   589: getstatic       dev/nuker/pyro/fc.1:I
        //   592: ifeq            601
        //   595: ldc_w           -831628261
        //   598: goto            604
        //   601: ldc_w           -2016698474
        //   604: ldc_w           1468380161
        //   607: ixor           
        //   608: lookupswitch {
        //          -1712592870: 601
        //          -800183401: 636
        //          default: 864
        //        }
        //   636: dload_2        
        //   637: dmul           
        //   638: dload           4
        //   640: getstatic       dev/nuker/pyro/fc.0:I
        //   643: ifeq            652
        //   646: ldc_w           -1300187001
        //   649: goto            655
        //   652: ldc_w           -941946028
        //   655: ldc_w           1945873811
        //   658: ixor           
        //   659: lookupswitch {
        //          -1363916414: 652
        //          -1048898284: 858
        //          default: 684
        //        }
        //   684: dload           4
        //   686: dmul           
        //   687: dadd           
        //   688: dstore          6
        //   690: getstatic       dev/nuker/pyro/fc.c:I
        //   693: ifge            702
        //   696: ldc_w           -1436076322
        //   699: goto            705
        //   702: ldc_w           1099608738
        //   705: ldc_w           -1055499497
        //   708: ixor           
        //   709: lookupswitch {
        //          -2137200203: 736
        //          1802595785: 702
        //          default: 876
        //        }
        //   736: astore          9
        //   738: iconst_0       
        //   739: istore          8
        //   741: dload           6
        //   743: getstatic       dev/nuker/pyro/fc.0:I
        //   746: ifeq            755
        //   749: ldc_w           -1836074355
        //   752: goto            758
        //   755: ldc_w           117435108
        //   758: ldc_w           -948988423
        //   761: ixor           
        //   762: lookupswitch {
        //          1440755572: 866
        //          2020924040: 755
        //          default: 788
        //        }
        //   788: goto            792
        //   791: athrow         
        //   792: invokestatic    java/lang/Math.sqrt:(D)D
        //   795: goto            799
        //   798: athrow         
        //   799: dstore          10
        //   801: aload           9
        //   803: getstatic       dev/nuker/pyro/fc.1:I
        //   806: ifeq            815
        //   809: ldc_w           967389395
        //   812: goto            818
        //   815: ldc_w           -1364222285
        //   818: ldc_w           -1398245945
        //   821: ixor           
        //   822: lookupswitch {
        //          -1795078892: 815
        //          34073460: 848
        //          default: 860
        //        }
        //   848: dload           10
        //   850: putfield        dev/nuker/pyro/f93.0:D
        //   853: return         
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
        //   866: aconst_null    
        //   867: athrow         
        //   868: aconst_null    
        //   869: athrow         
        //   870: aconst_null    
        //   871: athrow         
        //   872: aconst_null    
        //   873: athrow         
        //   874: aconst_null    
        //   875: athrow         
        //   876: aconst_null    
        //   877: athrow         
        //   878: pop            
        //   879: goto            24
        //   882: pop            
        //   883: aconst_null    
        //   884: goto            878
        //   887: dup            
        //   888: ifnull          878
        //   891: checkcast       Ljava/lang/Throwable;
        //   894: athrow         
        //   895: dup            
        //   896: ifnull          882
        //   899: checkcast       Ljava/lang/Throwable;
        //   902: athrow         
        //   903: aconst_null    
        //   904: athrow         
        //    StackMapTable: 00 6F 43 07 00 1C 04 FF 00 0B 00 00 00 01 07 00 1C FD 00 03 07 00 03 07 01 2A 4E 07 01 2A FF 00 02 00 02 07 00 03 07 01 2A 00 02 07 01 2A 01 5D 07 01 2A 42 07 00 1C 40 07 01 2A 45 07 00 1C 40 07 00 61 05 05 42 01 19 00 4E 07 00 1C 40 07 01 2A 45 07 00 1C 00 4E 07 00 6C FF 00 02 00 02 07 00 03 07 01 2A 00 02 07 00 6C 01 5D 07 00 6C FF 00 07 00 00 00 01 07 00 1C FF 00 00 00 02 07 00 03 07 01 2A 00 01 07 00 72 45 07 00 1C 40 07 01 38 42 07 00 1C 40 07 01 38 45 07 00 1C 40 07 01 38 42 07 00 0F 40 07 01 38 45 07 00 1C 40 07 01 38 42 07 00 13 40 07 01 38 45 07 00 1C 40 07 01 42 42 07 00 1C 40 07 01 42 45 07 00 1C 40 01 47 07 00 1C FF 00 00 00 02 07 00 03 07 01 2A 00 02 07 01 2A 07 01 2A 45 07 00 1C FF 00 00 00 02 07 00 03 07 01 2A 00 02 07 01 2A 03 46 07 00 0F FF 00 00 00 02 07 00 03 07 01 2A 00 02 07 01 2A 03 45 07 00 1C 00 02 0B 42 01 1E 44 07 00 4D FF 00 00 00 02 07 00 03 07 01 2A 00 02 07 01 2A 07 01 2A 45 07 00 1C FF 00 00 00 02 07 00 03 07 01 2A 00 02 07 01 2A 03 46 07 00 1C FF 00 00 00 02 07 00 03 07 01 2A 00 02 07 01 2A 03 45 07 00 1C 00 FF 00 1A 00 02 07 00 03 07 01 2A 00 02 03 07 00 72 FF 00 02 00 02 07 00 03 07 01 2A 00 03 03 07 00 72 01 FF 00 1D 00 02 07 00 03 07 01 2A 00 02 03 07 00 72 4F 03 FF 00 02 00 02 07 00 03 07 01 2A 00 02 03 01 5C 03 FF 00 18 00 03 07 00 03 07 01 2A 03 00 02 03 07 00 6C FF 00 02 00 03 07 00 03 07 01 2A 03 00 03 03 07 00 6C 01 FF 00 1F 00 03 07 00 03 07 01 2A 03 00 02 03 07 00 6C FF 00 15 00 04 07 00 03 07 01 2A 03 03 00 01 07 00 03 FF 00 02 00 04 07 00 03 07 01 2A 03 03 00 02 07 00 03 01 5E 07 00 03 FF 00 0C 00 04 07 00 03 07 01 2A 03 03 00 02 07 00 03 03 FF 00 02 00 04 07 00 03 07 01 2A 03 03 00 03 07 00 03 03 01 FF 00 1F 00 04 07 00 03 07 01 2A 03 03 00 02 07 00 03 03 FF 00 0F 00 04 07 00 03 07 01 2A 03 03 00 03 07 00 03 03 03 FF 00 02 00 04 07 00 03 07 01 2A 03 03 00 04 07 00 03 03 03 01 FF 00 1C 00 04 07 00 03 07 01 2A 03 03 00 03 07 00 03 03 03 FF 00 11 00 05 07 00 03 07 01 2A 03 03 03 00 01 07 00 03 FF 00 02 00 05 07 00 03 07 01 2A 03 03 03 00 02 07 00 03 01 5E 07 00 03 FF 00 12 00 07 07 00 03 07 01 2A 03 03 03 01 07 00 03 00 01 03 FF 00 02 00 07 07 00 03 07 01 2A 03 03 03 01 07 00 03 00 02 03 01 5D 03 42 07 00 1C 40 03 45 07 00 1C 40 03 FF 00 0F 00 08 07 00 03 07 01 2A 03 03 03 01 07 00 03 03 00 01 07 00 03 FF 00 02 00 08 07 00 03 07 01 2A 03 03 03 01 07 00 03 03 00 02 07 00 03 01 5D 07 00 03 FF 00 05 00 02 07 00 03 07 01 2A 00 00 FF 00 01 00 02 07 00 03 07 01 2A 00 02 03 07 00 72 FF 00 01 00 04 07 00 03 07 01 2A 03 03 00 03 07 00 03 03 03 FF 00 01 00 08 07 00 03 07 01 2A 03 03 03 01 07 00 03 03 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 01 2A 03 00 02 03 07 00 6C FF 00 01 00 04 07 00 03 07 01 2A 03 03 00 02 07 00 03 03 FF 00 01 00 07 07 00 03 07 01 2A 03 03 03 01 07 00 03 00 01 03 FF 00 01 00 04 07 00 03 07 01 2A 03 03 00 01 07 00 03 FF 00 01 00 02 07 00 03 07 01 2A 00 01 07 00 6C 41 03 41 07 01 2A FF 00 01 00 05 07 00 03 07 01 2A 03 03 03 00 01 07 00 03 FF 00 01 00 02 07 00 03 07 01 2A 00 01 07 00 1C 43 05 44 07 00 1C 47 05 47 07 00 1C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     887    895    Ljava/lang/NumberFormatException;
        //  887    895    887    895    Any
        //  903    905    3      8      Any
        //  75     82     82     83     Any
        //  75     82     3      8      Any
        //  75     82     82     83     Ljava/util/ConcurrentModificationException;
        //  76     82     75     76     Any
        //  76     82     82     83     Ljava/util/ConcurrentModificationException;
        //  140    147    147    148    Any
        //  140    147    140    141    Ljava/lang/IllegalStateException;
        //  140    147    140    141    Ljava/lang/RuntimeException;
        //  141    147    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  140    147    140    141    Any
        //  205    211    211    212    Any
        //  205    211    211    212    Ljava/lang/EnumConstantNotPresentException;
        //  205    211    211    212    Any
        //  205    211    211    212    Ljava/lang/RuntimeException;
        //  205    211    3      8      Ljava/lang/ArithmeticException;
        //  215    222    222    223    Any
        //  216    222    3      8      Ljava/lang/ArithmeticException;
        //  216    222    3      8      Any
        //  216    222    215    216    Any
        //  216    222    3      8      Any
        //  226    233    233    234    Any
        //  226    233    226    227    Ljava/lang/EnumConstantNotPresentException;
        //  226    233    226    227    Ljava/lang/NumberFormatException;
        //  226    233    233    234    Ljava/lang/ClassCastException;
        //  227    233    226    227    Ljava/lang/NullPointerException;
        //  237    244    244    245    Any
        //  237    244    237    238    Ljava/lang/IllegalStateException;
        //  238    244    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  238    244    3      8      Ljava/util/ConcurrentModificationException;
        //  238    244    3      8      Any
        //  248    255    255    256    Any
        //  249    255    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  248    255    248    249    Any
        //  248    255    255    256    Any
        //  248    255    255    256    Ljava/lang/AssertionError;
        //  264    271    271    272    Any
        //  264    271    271    272    Ljava/lang/StringIndexOutOfBoundsException;
        //  265    271    264    265    Any
        //  264    271    271    272    Any
        //  264    271    264    265    Any
        //  279    286    286    287    Any
        //  280    286    279    280    Ljava/lang/NegativeArraySizeException;
        //  279    286    286    287    Any
        //  279    286    279    280    Ljava/lang/StringIndexOutOfBoundsException;
        //  280    286    3      8      Any
        //  341    348    348    349    Any
        //  342    348    3      8      Ljava/lang/RuntimeException;
        //  341    348    3      8      Ljava/lang/NullPointerException;
        //  342    348    341    342    Ljava/util/NoSuchElementException;
        //  341    348    348    349    Ljava/lang/EnumConstantNotPresentException;
        //  356    363    363    364    Any
        //  357    363    3      8      Any
        //  357    363    356    357    Ljava/lang/NullPointerException;
        //  357    363    363    364    Ljava/lang/NegativeArraySizeException;
        //  357    363    356    357    Any
        //  791    798    798    799    Any
        //  791    798    3      8      Ljava/lang/ClassCastException;
        //  791    798    3      8      Any
        //  792    798    791    792    Any
        //  792    798    791    792    Any
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
}
