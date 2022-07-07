// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.entity.player.EntityPlayer;
import java.util.function.Predicate;
import org.jetbrains.annotations.NotNull;

public class f4G extends f47
{
    @NotNull
    public f0a c;
    
    @NotNull
    public f0a c() {
        return fbS.y(this, 11630927);
    }
    
    @f06
    public void c(@NotNull final f3h p0) {
        public class f4F implements Predicate
        {
            public f43 c;
            
            public f4F(final f43 c) {
                while (true) {
                    int n = 0;
                    Label_0014: {
                        if (fc.c < 0) {
                            n = -1973586377;
                            break Label_0014;
                        }
                        n = 2142390419;
                    }
                    switch (n ^ 0x386B7C92) {
                        case -660730983: {
                            continue;
                        }
                        default: {
                            this.c = c;
                        }
                        case -1305081179: {
                            throw null;
                        }
                    }
                    break;
                }
            }
            
            public boolean c(final EntityPlayer p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          212
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.c:I
                //    12: iflt            204
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            196
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: aload_1        
                //    25: dup            
                //    26: pop            
                //    27: goto            31
                //    30: athrow         
                //    31: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_145782_y:()I
                //    34: goto            38
                //    37: athrow         
                //    38: aload_0        
                //    39: getstatic       dev/nuker/pyro/fc.0:I
                //    42: ifeq            50
                //    45: ldc             -530294547
                //    47: goto            52
                //    50: ldc             -1063388461
                //    52: ldc             1580215643
                //    54: ixor           
                //    55: lookupswitch {
                //          -1632774264: 80
                //          -1101761098: 50
                //          default: 185
                //        }
                //    80: getfield        dev/nuker/pyro/f4F.c:Ldev/nuker/pyro/f43;
                //    83: getfield        dev/nuker/pyro/f43.c:Ldev/nuker/pyro/f49;
                //    86: dup            
                //    87: ifnonnull       160
                //    90: new             Lkotlin/TypeCastException;
                //    93: dup            
                //    94: ldc             "\u239e\u1486\u8a85\ub1c4\ucfae\ued95\ub225\ue6aa\udb77\uef92\ua742\u1e0c\ue182\uc7b3\u875a\u890e\u57a5\u7772\ubf38\uc661\u2b76\uc234\u6a29\u2f49\ud1f0\u35fb\u7d66\u89c4\u8215\u8ab6\u84dc\ufb72\u70a2\u981e\u1db8\uf112\u493c\u8801\uc892\uf91c\ub6e6\u41fd\ub985\ub152\u4a5d\u8a97\u7c27\uce51\u7f46\uecfd\ue6a7\u1696\uee35\u358a\u408e\ue1c2\u0a1f\u86a0\u1bc0\u0921\u7764\u7299\uc78b\ub9a6\u9ce3\u6a2b\ue2d2\ud055\ua724\u23f4\u89f4\u4fa0\u8b11\u1618\ua5eb\u708a\u55aa\u1c06\u63c7\u17b2\u881b"
                //    96: goto            100
                //    99: athrow         
                //   100: invokestatic    invokestatic   !!! ERROR
                //   103: goto            107
                //   106: athrow         
                //   107: getstatic       dev/nuker/pyro/fc.0:I
                //   110: ifeq            118
                //   113: ldc             420443170
                //   115: goto            120
                //   118: ldc             1829027091
                //   120: ldc             921594600
                //   122: ixor           
                //   123: lookupswitch {
                //          803282634: 118
                //          1542117371: 148
                //          default: 183
                //        }
                //   148: goto            152
                //   151: athrow         
                //   152: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
                //   155: goto            159
                //   158: athrow         
                //   159: athrow         
                //   160: checkcast       Ldev/nuker/pyro/f4H;
                //   163: goto            167
                //   166: athrow         
                //   167: invokevirtual   dev/nuker/pyro/f4H.0:()I
                //   170: goto            174
                //   173: athrow         
                //   174: if_icmpne       181
                //   177: iconst_1       
                //   178: goto            182
                //   181: iconst_0       
                //   182: ireturn        
                //   183: aconst_null    
                //   184: athrow         
                //   185: aconst_null    
                //   186: athrow         
                //   187: pop            
                //   188: goto            24
                //   191: pop            
                //   192: aconst_null    
                //   193: goto            187
                //   196: dup            
                //   197: ifnull          187
                //   200: checkcast       Ljava/lang/Throwable;
                //   203: athrow         
                //   204: dup            
                //   205: ifnull          191
                //   208: checkcast       Ljava/lang/Throwable;
                //   211: athrow         
                //   212: aconst_null    
                //   213: athrow         
                //    StackMapTable: 00 24 43 07 00 31 04 FF 00 0B 00 00 00 01 07 00 31 FD 00 03 07 00 03 07 00 33 45 07 00 31 40 07 00 33 45 07 00 31 40 01 FF 00 0B 00 02 07 00 03 07 00 33 00 02 01 07 00 03 FF 00 01 00 02 07 00 03 07 00 33 00 03 01 07 00 03 01 FF 00 1B 00 02 07 00 03 07 00 33 00 02 01 07 00 03 52 07 00 31 FF 00 00 00 02 07 00 03 07 00 33 00 05 01 07 00 55 08 00 5A 08 00 5A 07 00 57 45 07 00 31 FF 00 00 00 02 07 00 03 07 00 33 00 05 01 07 00 55 08 00 5A 08 00 5A 07 00 57 FF 00 0A 00 02 07 00 03 07 00 33 00 05 01 07 00 55 08 00 5A 08 00 5A 07 00 57 FF 00 01 00 02 07 00 03 07 00 33 00 06 01 07 00 55 08 00 5A 08 00 5A 07 00 57 01 FF 00 1B 00 02 07 00 03 07 00 33 00 05 01 07 00 55 08 00 5A 08 00 5A 07 00 57 42 07 00 23 FF 00 00 00 02 07 00 03 07 00 33 00 05 01 07 00 55 08 00 5A 08 00 5A 07 00 57 45 07 00 31 FF 00 00 00 02 07 00 03 07 00 33 00 03 01 07 00 55 07 00 42 FF 00 00 00 02 07 00 03 07 00 33 00 02 01 07 00 55 FF 00 05 00 00 00 01 07 00 31 FF 00 00 00 02 07 00 03 07 00 33 00 02 01 07 00 51 45 07 00 31 FF 00 00 00 02 07 00 03 07 00 33 00 02 01 01 06 40 01 FF 00 00 00 02 07 00 03 07 00 33 00 05 01 07 00 55 08 00 5A 08 00 5A 07 00 57 FF 00 01 00 02 07 00 03 07 00 33 00 02 01 07 00 03 41 07 00 29 43 05 44 07 00 29 47 05 47 07 00 31
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                       
                //  -----  -----  -----  -----  -------------------------------------------
                //  8      20     196    204    Ljava/lang/IllegalStateException;
                //  196    204    196    204    Ljava/lang/NullPointerException;
                //  212    214    3      8      Ljava/lang/ArithmeticException;
                //  30     37     37     38     Any
                //  30     37     3      8      Ljava/lang/AssertionError;
                //  31     37     30     31     Ljava/lang/RuntimeException;
                //  30     37     30     31     Any
                //  30     37     30     31     Ljava/lang/AssertionError;
                //  99     106    106    107    Any
                //  99     106    99     100    Any
                //  99     106    3      8      Ljava/util/ConcurrentModificationException;
                //  99     106    3      8      Any
                //  100    106    3      8      Any
                //  151    158    158    159    Any
                //  152    158    3      8      Any
                //  152    158    151    152    Ljava/lang/NullPointerException;
                //  151    158    3      8      Any
                //  152    158    158    159    Any
                //  167    173    173    174    Any
                //  167    173    173    174    Ljava/lang/RuntimeException;
                //  167    173    3      8      Ljava/lang/EnumConstantNotPresentException;
                //  167    173    173    174    Ljava/lang/StringIndexOutOfBoundsException;
                //  167    173    173    174    Any
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
            
            static {
                throw t;
            }
            
            @Override
            public boolean test(final Object o) {
                return fbS.37(this, 1433217383, o);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1743
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1735
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1727
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/f47.c:Lnet/minecraft/client/Minecraft;
        //    29: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //    32: getfield        net/minecraft/client/multiplayer/WorldClient.field_73010_i:Ljava/util/List;
        //    35: astore_2       
        //    36: aload_0        
        //    37: getstatic       dev/nuker/pyro/fc.1:I
        //    40: ifeq            48
        //    43: ldc             -1923326247
        //    45: goto            50
        //    48: ldc             2119725871
        //    50: ldc             -518426246
        //    52: ixor           
        //    53: lookupswitch {
        //          -283002899: 48
        //          1816473507: 1698
        //          default: 80
        //        }
        //    80: getfield        dev/nuker/pyro/f4G.c:Ldev/nuker/pyro/f45;
        //    83: getstatic       dev/nuker/pyro/fc.1:I
        //    86: ifeq            94
        //    89: ldc             2104036676
        //    91: goto            96
        //    94: ldc             -358459482
        //    96: ldc             23407936
        //    98: ixor           
        //    99: lookupswitch {
        //          -339248410: 124
        //          2081169412: 94
        //          default: 1714
        //        }
        //   124: getfield        dev/nuker/pyro/f45.c:Ljava/util/ArrayList;
        //   127: getstatic       dev/nuker/pyro/fc.0:I
        //   130: ifeq            138
        //   133: ldc             -646043985
        //   135: goto            140
        //   138: ldc             -1231950988
        //   140: ldc             -518822512
        //   142: ixor           
        //   143: lookupswitch {
        //          946684735: 138
        //          1468174052: 168
        //          default: 1690
        //        }
        //   168: goto            172
        //   171: athrow         
        //   172: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   175: goto            179
        //   178: athrow         
        //   179: astore          4
        //   181: getstatic       dev/nuker/pyro/fc.1:I
        //   184: ifeq            192
        //   187: ldc             1956751692
        //   189: goto            194
        //   192: ldc             -904419922
        //   194: ldc             -411612804
        //   196: ixor           
        //   197: lookupswitch {
        //          -1814634448: 1700
        //          1060242986: 192
        //          default: 224
        //        }
        //   224: aload           4
        //   226: goto            230
        //   229: athrow         
        //   230: invokeinterface java/util/Iterator.hasNext:()Z
        //   235: goto            239
        //   238: athrow         
        //   239: ifeq            367
        //   242: aload           4
        //   244: goto            248
        //   247: athrow         
        //   248: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   253: goto            257
        //   256: athrow         
        //   257: checkcast       Ldev/nuker/pyro/f43;
        //   260: astore_3       
        //   261: aload_2        
        //   262: goto            266
        //   265: athrow         
        //   266: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //   271: goto            275
        //   274: athrow         
        //   275: new             Ldev/nuker/pyro/f4F;
        //   278: dup            
        //   279: aload_3        
        //   280: goto            284
        //   283: athrow         
        //   284: invokespecial   dev/nuker/pyro/f4F.<init>:(Ldev/nuker/pyro/f43;)V
        //   287: goto            291
        //   290: athrow         
        //   291: checkcast       Ljava/util/function/Predicate;
        //   294: goto            298
        //   297: athrow         
        //   298: invokeinterface java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
        //   303: goto            307
        //   306: athrow         
        //   307: ifne            364
        //   310: getstatic       dev/nuker/pyro/fc.1:I
        //   313: ifeq            321
        //   316: ldc             -522978399
        //   318: goto            323
        //   321: ldc             -631953417
        //   323: ldc             1453536543
        //   325: ixor           
        //   326: lookupswitch {
        //          -1234121026: 1676
        //          1264142396: 321
        //          default: 352
        //        }
        //   352: aload_3        
        //   353: goto            357
        //   356: athrow         
        //   357: invokevirtual   dev/nuker/pyro/f43.b:()V
        //   360: goto            364
        //   363: athrow         
        //   364: goto            181
        //   367: aload_2        
        //   368: goto            372
        //   371: athrow         
        //   372: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   377: goto            381
        //   380: athrow         
        //   381: getstatic       dev/nuker/pyro/fc.1:I
        //   384: ifeq            392
        //   387: ldc             -543434082
        //   389: goto            394
        //   392: ldc             -1707559229
        //   394: ldc             -736704972
        //   396: ixor           
        //   397: lookupswitch {
        //          193797290: 1692
        //          1062943137: 392
        //          default: 424
        //        }
        //   424: astore          4
        //   426: aload           4
        //   428: goto            432
        //   431: athrow         
        //   432: invokeinterface java/util/Iterator.hasNext:()Z
        //   437: goto            441
        //   440: athrow         
        //   441: ifeq            1671
        //   444: getstatic       dev/nuker/pyro/fc.c:I
        //   447: ifge            455
        //   450: ldc             1493826927
        //   452: goto            457
        //   455: ldc             -1327648091
        //   457: ldc             -1837365477
        //   459: ixor           
        //   460: lookupswitch {
        //          -1820821167: 455
        //          -881460620: 1686
        //          default: 488
        //        }
        //   488: aload           4
        //   490: goto            494
        //   493: athrow         
        //   494: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   499: goto            503
        //   502: athrow         
        //   503: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //   506: astore_3       
        //   507: aload_3        
        //   508: getstatic       dev/nuker/pyro/f47.c:Lnet/minecraft/client/Minecraft;
        //   511: getstatic       dev/nuker/pyro/fc.c:I
        //   514: ifge            522
        //   517: ldc             -619071361
        //   519: goto            524
        //   522: ldc             -1164768881
        //   524: ldc             -2048458641
        //   526: ixor           
        //   527: lookupswitch {
        //          1064569312: 552
        //          1593751568: 522
        //          default: 1708
        //        }
        //   552: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   555: getstatic       dev/nuker/pyro/fc.0:I
        //   558: ifeq            566
        //   561: ldc             -1924630249
        //   563: goto            568
        //   566: ldc             -662181873
        //   568: ldc             1377178252
        //   570: ixor           
        //   571: lookupswitch {
        //          -1970144637: 596
        //          -547460197: 566
        //          default: 1704
        //        }
        //   596: goto            600
        //   599: athrow         
        //   600: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   603: goto            607
        //   606: athrow         
        //   607: ifeq            613
        //   610: goto            1668
        //   613: iconst_0       
        //   614: getstatic       dev/nuker/pyro/fc.0:I
        //   617: ifeq            625
        //   620: ldc             1593010893
        //   622: goto            627
        //   625: ldc             1589466042
        //   627: ldc             -1957556201
        //   629: ixor           
        //   630: lookupswitch {
        //          -710837542: 1678
        //          195747285: 625
        //          default: 656
        //        }
        //   656: istore          5
        //   658: aload_0        
        //   659: getfield        dev/nuker/pyro/f4G.c:Ldev/nuker/pyro/f45;
        //   662: getstatic       dev/nuker/pyro/fc.1:I
        //   665: ifeq            673
        //   668: ldc             -861510630
        //   670: goto            675
        //   673: ldc             -174374845
        //   675: ldc             1751630546
        //   677: ixor           
        //   678: lookupswitch {
        //          -1644395887: 704
        //          -1530812728: 673
        //          default: 1716
        //        }
        //   704: getfield        dev/nuker/pyro/f45.c:Ljava/util/ArrayList;
        //   707: goto            711
        //   710: athrow         
        //   711: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   714: goto            718
        //   717: athrow         
        //   718: astore          7
        //   720: aload           7
        //   722: goto            726
        //   725: athrow         
        //   726: invokeinterface java/util/Iterator.hasNext:()Z
        //   731: goto            735
        //   734: athrow         
        //   735: ifeq            1143
        //   738: aload           7
        //   740: goto            744
        //   743: athrow         
        //   744: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   749: goto            753
        //   752: athrow         
        //   753: checkcast       Ldev/nuker/pyro/f43;
        //   756: astore          6
        //   758: aload           6
        //   760: getfield        dev/nuker/pyro/f43.c:Ldev/nuker/pyro/f49;
        //   763: dup            
        //   764: ifnonnull       880
        //   767: new             Lkotlin/TypeCastException;
        //   770: dup            
        //   771: ldc             "\u239f\u1486\u8a84\ub1c4\ucfad\ued94\ub225\ue6ab\udb77\uef91\ua743\u1e0c\ue183\uc7b3\u8759\u890f\u57a5\u7773\ubf38\uc662\u2b77\uc234\u6a28\u2f49\ud1f3\u35fa\u7d66\u89c5\u8215\u8ab5\u84dd\ufb72\u70a3\u981e\u1dbb\uf113\u493c\u8800\uc892\uf91f\ub6e7\u41fd\ub984\ub152\u4a5e\u8a96\u7c27\uce50\u7f46\uecfe\ue6a6\u1696\uee34\u358a\u408d\ue1c3\u0a1f\u86a1\u1bc0\u0922\u7765\u7299\uc78a\ub9a6\u9ce0\u6a2a\ue2d2\ud054\ua724\u23f7\u89f5\u4fa0\u8b10\u1618\ua5e8\u708b\u55aa\u1c07\u63c7\u17b1\u881a"
        //   773: getstatic       dev/nuker/pyro/fc.c:I
        //   776: ifge            784
        //   779: ldc             1486805616
        //   781: goto            786
        //   784: ldc             -1899899071
        //   786: ldc             35240878
        //   788: ixor           
        //   789: lookupswitch {
        //          -871038483: 784
        //          1518821854: 1710
        //          default: 816
        //        }
        //   816: goto            820
        //   819: athrow         
        //   820: invokestatic    invokestatic   !!! ERROR
        //   823: goto            827
        //   826: athrow         
        //   827: getstatic       dev/nuker/pyro/fc.1:I
        //   830: ifeq            838
        //   833: ldc             1191838403
        //   835: goto            840
        //   838: ldc             702825119
        //   840: ldc             -1657285065
        //   842: ixor           
        //   843: lookupswitch {
        //          -1261202264: 868
        //          -633481996: 838
        //          default: 1694
        //        }
        //   868: goto            872
        //   871: athrow         
        //   872: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   875: goto            879
        //   878: athrow         
        //   879: athrow         
        //   880: checkcast       Ldev/nuker/pyro/f4H;
        //   883: goto            887
        //   886: athrow         
        //   887: invokevirtual   dev/nuker/pyro/f4H.0:()I
        //   890: goto            894
        //   893: athrow         
        //   894: getstatic       dev/nuker/pyro/fc.1:I
        //   897: ifeq            905
        //   900: ldc             -1105531814
        //   902: goto            907
        //   905: ldc             -1774332992
        //   907: ldc             1744490795
        //   909: ixor           
        //   910: lookupswitch {
        //          -639615631: 905
        //          -238615829: 936
        //          default: 1682
        //        }
        //   936: aload_3        
        //   937: dup            
        //   938: pop            
        //   939: goto            943
        //   942: athrow         
        //   943: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_145782_y:()I
        //   946: goto            950
        //   949: athrow         
        //   950: if_icmpne       1140
        //   953: aload           6
        //   955: getstatic       dev/nuker/pyro/fc.1:I
        //   958: ifeq            966
        //   961: ldc             1282184354
        //   963: goto            968
        //   966: ldc             -276909670
        //   968: ldc             1165301063
        //   970: ixor           
        //   971: lookupswitch {
        //          -578751994: 966
        //          152666597: 1702
        //          default: 996
        //        }
        //   996: getfield        dev/nuker/pyro/f43.c:Ldev/nuker/pyro/f49;
        //   999: dup            
        //  1000: ifnonnull       1032
        //  1003: new             Lkotlin/TypeCastException;
        //  1006: dup            
        //  1007: ldc             "\u239f\u1486\u8a84\ub1c4\ucfad\ued94\ub225\ue6ab\udb77\uef91\ua743\u1e0c\ue183\uc7b3\u8759\u890f\u57a5\u7773\ubf38\uc662\u2b77\uc234\u6a28\u2f49\ud1f3\u35fa\u7d66\u89c5\u8215\u8ab5\u84dd\ufb72\u70a3\u981e\u1dbb\uf113\u493c\u8800\uc892\uf91f\ub6e7\u41fd\ub984\ub152\u4a5e\u8a96\u7c27\uce50\u7f46\uecfe\ue6a6\u1696\uee34\u358a\u408d\ue1c3\u0a1f\u86a1\u1bc0\u0922\u7765\u7299\uc78a\ub9a6\u9ce0\u6a2a\ue2d2\ud054\ua724\u23f7\u89f5\u4fa0\u8b10\u1618\ua5e8\u708b\u55aa\u1c07\u63c7\u17b1\u881a"
        //  1009: goto            1013
        //  1012: athrow         
        //  1013: invokestatic    invokestatic   !!! ERROR
        //  1016: goto            1020
        //  1019: athrow         
        //  1020: goto            1024
        //  1023: athrow         
        //  1024: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //  1027: goto            1031
        //  1030: athrow         
        //  1031: athrow         
        //  1032: checkcast       Ldev/nuker/pyro/f4H;
        //  1035: getstatic       dev/nuker/pyro/fc.c:I
        //  1038: ifge            1046
        //  1041: ldc             860905278
        //  1043: goto            1048
        //  1046: ldc             -1216550956
        //  1048: ldc             -735637810
        //  1050: ixor           
        //  1051: lookupswitch {
        //          -411610640: 1046
        //          1666967834: 1076
        //          default: 1684
        //        }
        //  1076: goto            1080
        //  1079: athrow         
        //  1080: invokevirtual   dev/nuker/pyro/f4H.1:()V
        //  1083: goto            1087
        //  1086: athrow         
        //  1087: getstatic       dev/nuker/pyro/fc.c:I
        //  1090: ifge            1098
        //  1093: ldc             -1818872609
        //  1095: goto            1100
        //  1098: ldc             -7535390
        //  1100: ldc             -403407906
        //  1102: ixor           
        //  1103: lookupswitch {
        //          -1499249856: 1098
        //          1952599809: 1712
        //          default: 1128
        //        }
        //  1128: aload           6
        //  1130: getfield        dev/nuker/pyro/f43.c:Z
        //  1133: pop            
        //  1134: iconst_1       
        //  1135: istore          5
        //  1137: goto            1143
        //  1140: goto            720
        //  1143: iload           5
        //  1145: ifne            1153
        //  1148: ldc             -1725826244
        //  1150: goto            1155
        //  1153: ldc             -1725826243
        //  1155: ldc             697052870
        //  1157: ixor           
        //  1158: tableswitch {
        //          1633397748: 1180
        //          1633397749: 1668
        //          default: 1148
        //        }
        //  1180: getstatic       dev/nuker/pyro/FriendManager.Companion:Ldev/nuker/pyro/FriendManager$Companion;
        //  1183: aload_3        
        //  1184: dup            
        //  1185: pop            
        //  1186: goto            1190
        //  1189: athrow         
        //  1190: invokevirtual   dev/nuker/pyro/FriendManager$Companion.isFriend:(Lnet/minecraft/entity/player/EntityPlayer;)Z
        //  1193: goto            1197
        //  1196: athrow         
        //  1197: istore          6
        //  1199: aload_0        
        //  1200: getfield        dev/nuker/pyro/f4G.c:Ldev/nuker/pyro/f0a;
        //  1203: goto            1207
        //  1206: athrow         
        //  1207: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1210: goto            1214
        //  1213: athrow         
        //  1214: checkcast       Ljava/lang/Boolean;
        //  1217: getstatic       dev/nuker/pyro/fc.1:I
        //  1220: ifeq            1228
        //  1223: ldc             1229303332
        //  1225: goto            1230
        //  1228: ldc             -473284917
        //  1230: ldc             -2003852070
        //  1232: ixor           
        //  1233: lookupswitch {
        //          -1043723522: 1228
        //          1799723537: 1260
        //          default: 1706
        //        }
        //  1260: goto            1264
        //  1263: athrow         
        //  1264: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1267: goto            1271
        //  1270: athrow         
        //  1271: ifne            1279
        //  1274: ldc             -841091053
        //  1276: goto            1281
        //  1279: ldc             -841091054
        //  1281: ldc             -872512335
        //  1283: ixor           
        //  1284: tableswitch {
        //          205977924: 1308
        //          205977925: 1313
        //          default: 1274
        //        }
        //  1308: iload           6
        //  1310: ifne            1668
        //  1313: aload_0        
        //  1314: getfield        dev/nuker/pyro/f4G.c:Ldev/nuker/pyro/f45;
        //  1317: new             Ldev/nuker/pyro/f43;
        //  1320: dup            
        //  1321: ldc             "\u2385\u1496\u8a90\ub1dc\ucfdf\ued96\ub220\ue6a4\udb6b\uefae\ua75b\u1e4d\ue198\uc7b3\u870b"
        //  1323: goto            1327
        //  1326: athrow         
        //  1327: invokestatic    invokestatic   !!! ERROR
        //  1330: goto            1334
        //  1333: athrow         
        //  1334: ldc_w           "\u23b6\u1496\u8a86\ub1cd\ucfff\ued96\ub228"
        //  1337: getstatic       dev/nuker/pyro/fc.c:I
        //  1340: ifge            1349
        //  1343: ldc_w           -1614438166
        //  1346: goto            1352
        //  1349: ldc_w           -804000080
        //  1352: ldc_w           1933645618
        //  1355: ixor           
        //  1356: lookupswitch {
        //          -1554843262: 1384
        //          -326846504: 1349
        //          default: 1674
        //        }
        //  1384: goto            1388
        //  1387: athrow         
        //  1388: invokestatic    invokestatic   !!! ERROR
        //  1391: goto            1395
        //  1394: athrow         
        //  1395: new             Ldev/nuker/pyro/f4H;
        //  1398: dup            
        //  1399: getstatic       dev/nuker/pyro/fc.0:I
        //  1402: ifeq            1411
        //  1405: ldc_w           1389433314
        //  1408: goto            1414
        //  1411: ldc_w           1488233773
        //  1414: ldc_w           -1037086657
        //  1417: ixor           
        //  1418: lookupswitch {
        //          -1862385187: 1696
        //          -278015203: 1411
        //          default: 1444
        //        }
        //  1444: aload_3        
        //  1445: goto            1449
        //  1448: athrow         
        //  1449: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_70005_c_:()Ljava/lang/String;
        //  1452: goto            1456
        //  1455: athrow         
        //  1456: dup            
        //  1457: pop            
        //  1458: iload           6
        //  1460: aload_3        
        //  1461: getstatic       dev/nuker/pyro/fc.c:I
        //  1464: ifge            1473
        //  1467: ldc_w           1928233499
        //  1470: goto            1476
        //  1473: ldc_w           1044307926
        //  1476: ldc_w           -1151284779
        //  1479: ixor           
        //  1480: lookupswitch {
        //          -2057431549: 1508
        //          -913421362: 1473
        //          default: 1672
        //        }
        //  1508: goto            1512
        //  1511: athrow         
        //  1512: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_70005_c_:()Ljava/lang/String;
        //  1515: goto            1519
        //  1518: athrow         
        //  1519: dup            
        //  1520: pop            
        //  1521: getstatic       dev/nuker/pyro/fc.1:I
        //  1524: ifeq            1533
        //  1527: ldc_w           -220775860
        //  1530: goto            1536
        //  1533: ldc_w           -1437557398
        //  1536: ldc_w           -359663077
        //  1539: ixor           
        //  1540: lookupswitch {
        //          408469591: 1533
        //          1088382833: 1568
        //          default: 1688
        //        }
        //  1568: aload_3        
        //  1569: goto            1573
        //  1572: athrow         
        //  1573: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_145782_y:()I
        //  1576: goto            1580
        //  1579: athrow         
        //  1580: goto            1584
        //  1583: athrow         
        //  1584: invokespecial   dev/nuker/pyro/f4H.<init>:(Ljava/lang/String;ZLjava/lang/String;I)V
        //  1587: goto            1591
        //  1590: athrow         
        //  1591: checkcast       Ldev/nuker/pyro/f49;
        //  1594: aconst_null    
        //  1595: iconst_0       
        //  1596: bipush          24
        //  1598: aconst_null    
        //  1599: getstatic       dev/nuker/pyro/fc.c:I
        //  1602: ifge            1611
        //  1605: ldc_w           -858504074
        //  1608: goto            1614
        //  1611: ldc_w           -965353647
        //  1614: ldc_w           -1907965129
        //  1617: ixor           
        //  1618: lookupswitch {
        //          1116899137: 1680
        //          1581129631: 1611
        //          default: 1644
        //        }
        //  1644: goto            1648
        //  1647: athrow         
        //  1648: invokespecial   dev/nuker/pyro/f43.<init>:(Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/f49;Ldev/nuker/pyro/f44;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1651: goto            1655
        //  1654: athrow         
        //  1655: iconst_0       
        //  1656: goto            1660
        //  1659: athrow         
        //  1660: invokevirtual   dev/nuker/pyro/f45.c:(Ldev/nuker/pyro/f43;Z)Ldev/nuker/pyro/f43;
        //  1663: goto            1667
        //  1666: athrow         
        //  1667: pop            
        //  1668: goto            426
        //  1671: return         
        //  1672: aconst_null    
        //  1673: athrow         
        //  1674: aconst_null    
        //  1675: athrow         
        //  1676: aconst_null    
        //  1677: athrow         
        //  1678: aconst_null    
        //  1679: athrow         
        //  1680: aconst_null    
        //  1681: athrow         
        //  1682: aconst_null    
        //  1683: athrow         
        //  1684: aconst_null    
        //  1685: athrow         
        //  1686: aconst_null    
        //  1687: athrow         
        //  1688: aconst_null    
        //  1689: athrow         
        //  1690: aconst_null    
        //  1691: athrow         
        //  1692: aconst_null    
        //  1693: athrow         
        //  1694: aconst_null    
        //  1695: athrow         
        //  1696: aconst_null    
        //  1697: athrow         
        //  1698: aconst_null    
        //  1699: athrow         
        //  1700: aconst_null    
        //  1701: athrow         
        //  1702: aconst_null    
        //  1703: athrow         
        //  1704: aconst_null    
        //  1705: athrow         
        //  1706: aconst_null    
        //  1707: athrow         
        //  1708: aconst_null    
        //  1709: athrow         
        //  1710: aconst_null    
        //  1711: athrow         
        //  1712: aconst_null    
        //  1713: athrow         
        //  1714: aconst_null    
        //  1715: athrow         
        //  1716: aconst_null    
        //  1717: athrow         
        //  1718: pop            
        //  1719: goto            24
        //  1722: pop            
        //  1723: aconst_null    
        //  1724: goto            1718
        //  1727: dup            
        //  1728: ifnull          1718
        //  1731: checkcast       Ljava/lang/Throwable;
        //  1734: athrow         
        //  1735: dup            
        //  1736: ifnull          1722
        //  1739: checkcast       Ljava/lang/Throwable;
        //  1742: athrow         
        //  1743: aconst_null    
        //  1744: athrow         
        //    StackMapTable: 00 F9 FF 00 03 00 03 07 00 03 07 01 21 07 00 74 00 01 07 00 3A FA 00 04 FF 00 0B 00 00 00 01 07 00 3A FD 00 03 07 00 03 07 01 21 FF 00 17 00 03 07 00 03 07 01 21 07 00 74 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 01 21 07 00 74 00 02 07 00 03 01 5D 07 00 03 4D 07 00 57 FF 00 01 00 03 07 00 03 07 01 21 07 00 74 00 02 07 00 57 01 5B 07 00 57 4D 07 00 5F FF 00 01 00 03 07 00 03 07 01 21 07 00 74 00 02 07 00 5F 01 5B 07 00 5F 42 07 00 3A 40 07 00 5F 45 07 00 3A 40 07 00 68 FD 00 01 00 07 00 68 0A 41 01 1D 44 07 00 1A 40 07 00 68 47 07 00 3A 40 01 47 07 00 3A 40 07 00 68 47 07 00 3A 40 07 01 23 FF 00 07 00 05 07 00 03 07 01 21 07 00 74 07 00 72 07 00 68 00 01 07 00 3A 40 07 00 74 47 07 00 3A 40 07 00 82 47 07 00 3A FF 00 00 00 05 07 00 03 07 01 21 07 00 74 07 00 72 07 00 68 00 04 07 00 82 08 01 13 08 01 13 07 00 72 45 07 00 3A FF 00 00 00 05 07 00 03 07 01 21 07 00 74 07 00 72 07 00 68 00 02 07 00 82 07 00 7A 45 07 00 3A FF 00 00 00 05 07 00 03 07 01 21 07 00 74 07 00 72 07 00 68 00 02 07 00 82 07 00 80 47 07 00 3A 40 01 0D 41 01 1C 43 07 00 3A 40 07 00 72 45 07 00 3A 00 FF 00 02 00 05 07 00 03 07 01 21 07 00 74 00 07 00 68 00 00 FF 00 03 00 00 00 01 07 00 3A FF 00 00 00 05 07 00 03 07 01 21 07 00 74 00 07 00 68 00 01 07 00 74 47 07 00 3A 40 07 00 68 4A 07 00 68 FF 00 01 00 05 07 00 03 07 01 21 07 00 74 00 07 00 68 00 02 07 00 68 01 5D 07 00 68 01 44 07 00 20 40 07 00 68 47 07 00 3A 40 01 0D 41 01 1E 44 07 00 3A 40 07 00 68 47 07 00 3A 40 07 01 23 FF 00 12 00 05 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 00 02 07 00 98 07 00 3F FF 00 01 00 05 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 00 03 07 00 98 07 00 3F 01 FF 00 1B 00 05 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 00 02 07 00 98 07 00 3F FF 00 0D 00 05 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 00 02 07 00 98 07 01 25 FF 00 01 00 05 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 00 03 07 00 98 07 01 25 01 FF 00 1B 00 05 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 00 02 07 00 98 07 01 25 FF 00 02 00 00 00 01 07 00 3A FF 00 00 00 05 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 00 02 07 00 98 07 01 25 45 07 00 3A 40 01 05 4B 01 FF 00 01 00 05 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 00 02 01 01 5C 01 FF 00 10 00 06 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 00 01 07 00 57 FF 00 01 00 06 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 00 02 07 00 57 01 5C 07 00 57 45 07 00 30 40 07 00 5F 45 07 00 3A 40 07 00 68 FD 00 01 00 07 00 68 44 07 00 3A 40 07 00 68 47 07 00 3A 40 01 47 07 00 14 40 07 00 68 47 07 00 3A 40 07 01 23 FF 00 1E 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 04 07 01 16 08 02 FF 08 02 FF 07 01 27 FF 00 01 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 05 07 01 16 08 02 FF 08 02 FF 07 01 27 01 FF 00 1D 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 04 07 01 16 08 02 FF 08 02 FF 07 01 27 42 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 04 07 01 16 08 02 FF 08 02 FF 07 01 27 45 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 04 07 01 16 08 02 FF 08 02 FF 07 01 27 FF 00 0A 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 04 07 01 16 08 02 FF 08 02 FF 07 01 27 FF 00 01 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 05 07 01 16 08 02 FF 08 02 FF 07 01 27 01 FF 00 1B 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 04 07 01 16 08 02 FF 08 02 FF 07 01 27 42 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 04 07 01 16 08 02 FF 08 02 FF 07 01 27 45 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 02 07 01 16 07 00 B3 40 07 01 16 45 07 00 3A 40 07 00 C5 45 07 00 3A 40 01 4A 01 FF 00 01 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 02 01 01 5C 01 45 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 02 01 07 00 98 45 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 02 01 01 4F 07 00 72 FF 00 01 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 02 07 00 72 01 5B 07 00 72 FF 00 0F 00 00 00 01 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 04 07 01 16 08 03 EB 08 03 EB 07 01 27 45 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 04 07 01 16 08 03 EB 08 03 EB 07 01 27 42 07 00 30 FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 04 07 01 16 08 03 EB 08 03 EB 07 01 27 45 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 02 07 01 16 07 00 B3 40 07 01 16 4D 07 00 C5 FF 00 01 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 02 07 00 C5 01 5B 07 00 C5 42 07 00 3A 40 07 00 C5 45 07 00 3A 00 0A 41 01 1B 0B FF 00 02 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 00 07 00 68 00 00 04 04 41 01 18 FF 00 08 00 00 00 01 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 00 07 00 68 00 02 07 00 E7 07 00 98 45 07 00 3A 40 01 FF 00 08 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 01 07 00 1E 40 07 00 EF 45 07 00 3A 40 07 01 23 4D 07 00 F4 FF 00 01 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 02 07 00 F4 01 5D 07 00 F4 42 07 00 3A 40 07 00 F4 45 07 00 3A 40 01 02 04 41 01 1A 04 4C 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 04 07 00 57 08 05 25 08 05 25 07 01 27 45 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 04 07 00 57 08 05 25 08 05 25 07 01 27 FF 00 0E 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 05 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 FF 00 02 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 06 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 01 FF 00 1F 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 05 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 42 07 00 32 FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 05 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 45 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 05 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 FF 00 0F 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 07 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 FF 00 02 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 08 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 01 FF 00 1D 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 07 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 43 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 08 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 07 00 98 45 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 08 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 07 01 27 FF 00 10 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0A 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 07 01 27 01 07 00 98 FF 00 02 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0B 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 07 01 27 01 07 00 98 01 FF 00 1F 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0A 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 07 01 27 01 07 00 98 42 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0A 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 07 01 27 01 07 00 98 45 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0A 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 07 01 27 01 07 01 27 FF 00 0D 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0A 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 07 01 27 01 07 01 27 FF 00 02 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0B 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 07 01 27 01 07 01 27 01 FF 00 1F 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0A 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 07 01 27 01 07 01 27 43 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0B 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 07 01 27 01 07 01 27 07 00 98 45 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0B 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 07 01 27 01 07 01 27 01 42 07 00 30 FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0B 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 07 01 27 01 07 01 27 01 45 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 06 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 07 00 C5 FF 00 13 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0A 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 07 01 16 05 01 01 05 FF 00 02 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0B 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 07 01 16 05 01 01 05 01 FF 00 1D 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0A 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 07 01 16 05 01 01 05 42 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0A 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 07 01 16 05 01 01 05 45 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 02 07 00 57 07 00 72 FF 00 03 00 00 00 01 07 00 3A FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 03 07 00 57 07 00 72 01 45 07 00 3A 40 07 00 72 F8 00 00 FF 00 02 00 05 07 00 03 07 01 21 07 00 74 00 07 00 68 00 00 FF 00 00 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0A 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 07 01 27 01 07 00 98 FF 00 01 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 05 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 FF 00 01 00 05 07 00 03 07 01 21 07 00 74 07 00 72 07 00 68 00 00 FF 00 01 00 05 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 00 01 01 FF 00 01 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0A 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 07 01 16 05 01 01 05 FF 00 01 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 01 01 41 07 00 C5 FF 00 01 00 05 07 00 03 07 01 21 07 00 74 00 07 00 68 00 00 FF 00 01 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 0A 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 07 01 27 01 07 01 27 FF 00 01 00 03 07 00 03 07 01 21 07 00 74 00 01 07 00 5F FF 00 01 00 05 07 00 03 07 01 21 07 00 74 00 07 00 68 00 01 07 00 68 FF 00 01 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 04 07 01 16 08 02 FF 08 02 FF 07 01 27 FF 00 01 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 07 07 00 57 08 05 25 08 05 25 07 01 27 07 01 27 08 05 73 08 05 73 FF 00 01 00 03 07 00 03 07 01 21 07 00 74 00 01 07 00 03 FD 00 01 00 07 00 68 FF 00 01 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 01 07 00 72 FF 00 01 00 05 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 00 02 07 00 98 07 01 25 FF 00 01 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 01 07 00 68 00 01 07 00 F4 FF 00 01 00 05 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 00 02 07 00 98 07 00 3F FF 00 01 00 08 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 07 00 72 07 00 68 00 04 07 01 16 08 02 FF 08 02 FF 07 01 27 01 FF 00 01 00 03 07 00 03 07 01 21 07 00 74 00 01 07 00 57 FF 00 01 00 06 07 00 03 07 01 21 07 00 74 07 00 98 07 00 68 01 00 01 07 00 57 FF 00 01 00 02 07 00 03 07 01 21 00 01 07 00 3A 43 05 44 07 00 3A 47 05 FF 00 07 00 03 07 00 03 07 01 21 07 00 74 00 01 07 00 3A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1727   1735   Any
        //  1727   1735   1727   1735   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1743   1745   3      8      Any
        //  171    178    178    179    Any
        //  171    178    171    172    Ljava/lang/IllegalArgumentException;
        //  172    178    3      8      Ljava/lang/NumberFormatException;
        //  172    178    178    179    Any
        //  172    178    171    172    Any
        //  229    238    238    239    Any
        //  229    238    238    239    Ljava/lang/IllegalArgumentException;
        //  229    238    3      8      Any
        //  229    238    238    239    Any
        //  229    238    229    230    Ljava/lang/ArithmeticException;
        //  247    256    256    257    Any
        //  247    256    3      8      Ljava/lang/UnsupportedOperationException;
        //  247    256    247    248    Ljava/lang/NumberFormatException;
        //  248    256    247    248    Any
        //  247    256    247    248    Ljava/lang/ClassCastException;
        //  265    274    274    275    Any
        //  265    274    265    266    Any
        //  266    274    265    266    Ljava/util/NoSuchElementException;
        //  266    274    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  265    274    3      8      Any
        //  283    290    290    291    Any
        //  283    290    283    284    Any
        //  284    290    3      8      Ljava/lang/NegativeArraySizeException;
        //  284    290    283    284    Ljava/util/ConcurrentModificationException;
        //  283    290    290    291    Ljava/lang/IndexOutOfBoundsException;
        //  297    306    306    307    Any
        //  298    306    297    298    Any
        //  298    306    297    298    Ljava/lang/NumberFormatException;
        //  297    306    297    298    Any
        //  297    306    306    307    Any
        //  356    363    363    364    Any
        //  357    363    363    364    Ljava/lang/ClassCastException;
        //  357    363    3      8      Any
        //  357    363    356    357    Any
        //  356    363    363    364    Ljava/lang/NumberFormatException;
        //  372    380    380    381    Any
        //  372    380    380    381    Any
        //  372    380    380    381    Any
        //  372    380    3      8      Ljava/lang/ArithmeticException;
        //  372    380    3      8      Any
        //  431    440    440    441    Any
        //  431    440    3      8      Any
        //  431    440    3      8      Ljava/lang/IllegalStateException;
        //  431    440    431    432    Ljava/util/NoSuchElementException;
        //  432    440    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  493    502    502    503    Any
        //  494    502    493    494    Any
        //  493    502    502    503    Any
        //  494    502    3      8      Any
        //  494    502    502    503    Any
        //  600    606    606    607    Any
        //  600    606    606    607    Ljava/lang/IllegalArgumentException;
        //  600    606    606    607    Any
        //  600    606    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  600    606    3      8      Any
        //  710    717    717    718    Any
        //  710    717    717    718    Any
        //  710    717    3      8      Ljava/util/ConcurrentModificationException;
        //  710    717    710    711    Ljava/lang/ArithmeticException;
        //  710    717    710    711    Ljava/lang/IllegalArgumentException;
        //  725    734    734    735    Any
        //  726    734    734    735    Any
        //  726    734    725    726    Any
        //  725    734    3      8      Ljava/lang/ClassCastException;
        //  725    734    725    726    Ljava/lang/AssertionError;
        //  743    752    752    753    Any
        //  744    752    3      8      Ljava/util/ConcurrentModificationException;
        //  744    752    3      8      Any
        //  744    752    743    744    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  744    752    3      8      Ljava/lang/NumberFormatException;
        //  819    826    826    827    Any
        //  819    826    826    827    Ljava/lang/ClassCastException;
        //  820    826    819    820    Any
        //  819    826    3      8      Ljava/util/NoSuchElementException;
        //  819    826    819    820    Any
        //  871    878    878    879    Any
        //  871    878    878    879    Ljava/lang/RuntimeException;
        //  871    878    871    872    Any
        //  872    878    878    879    Any
        //  871    878    3      8      Any
        //  886    893    893    894    Any
        //  886    893    886    887    Ljava/lang/NumberFormatException;
        //  886    893    886    887    Any
        //  886    893    893    894    Ljava/util/ConcurrentModificationException;
        //  887    893    3      8      Ljava/lang/UnsupportedOperationException;
        //  942    949    949    950    Any
        //  943    949    949    950    Any
        //  943    949    3      8      Any
        //  943    949    942    943    Any
        //  943    949    949    950    Ljava/util/NoSuchElementException;
        //  1013   1019   1019   1020   Any
        //  1013   1019   1019   1020   Any
        //  1013   1019   1019   1020   Ljava/lang/StringIndexOutOfBoundsException;
        //  1013   1019   1019   1020   Any
        //  1013   1019   1019   1020   Ljava/lang/NumberFormatException;
        //  1023   1030   1030   1031   Any
        //  1024   1030   1023   1024   Ljava/lang/UnsupportedOperationException;
        //  1023   1030   3      8      Any
        //  1023   1030   1030   1031   Any
        //  1023   1030   1023   1024   Ljava/lang/ArithmeticException;
        //  1079   1086   1086   1087   Any
        //  1079   1086   1079   1080   Ljava/util/ConcurrentModificationException;
        //  1079   1086   1086   1087   Any
        //  1079   1086   1086   1087   Ljava/lang/RuntimeException;
        //  1080   1086   1079   1080   Any
        //  1190   1196   1196   1197   Any
        //  1190   1196   1196   1197   Any
        //  1190   1196   1196   1197   Ljava/lang/NegativeArraySizeException;
        //  1190   1196   3      8      Ljava/lang/ArithmeticException;
        //  1190   1196   3      8      Ljava/lang/IllegalStateException;
        //  1206   1213   1213   1214   Any
        //  1206   1213   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1207   1213   1206   1207   Ljava/lang/ClassCastException;
        //  1206   1213   3      8      Any
        //  1207   1213   1213   1214   Any
        //  1263   1270   1270   1271   Any
        //  1263   1270   1263   1264   Any
        //  1264   1270   1263   1264   Any
        //  1263   1270   1270   1271   Any
        //  1263   1270   1270   1271   Any
        //  1326   1333   1333   1334   Any
        //  1326   1333   1326   1327   Any
        //  1326   1333   1326   1327   Ljava/lang/RuntimeException;
        //  1327   1333   1326   1327   Ljava/lang/ClassCastException;
        //  1327   1333   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1387   1394   1394   1395   Any
        //  1388   1394   3      8      Ljava/lang/NullPointerException;
        //  1387   1394   3      8      Ljava/lang/IllegalStateException;
        //  1387   1394   3      8      Ljava/util/ConcurrentModificationException;
        //  1388   1394   1387   1388   Ljava/lang/NullPointerException;
        //  1448   1455   1455   1456   Any
        //  1449   1455   1448   1449   Ljava/util/ConcurrentModificationException;
        //  1449   1455   3      8      Any
        //  1448   1455   1448   1449   Any
        //  1449   1455   1448   1449   Any
        //  1511   1518   1518   1519   Any
        //  1512   1518   1518   1519   Any
        //  1512   1518   1511   1512   Any
        //  1511   1518   1518   1519   Ljava/lang/NumberFormatException;
        //  1512   1518   1511   1512   Any
        //  1572   1579   1579   1580   Any
        //  1573   1579   1572   1573   Ljava/lang/ClassCastException;
        //  1572   1579   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1572   1579   3      8      Any
        //  1572   1579   1572   1573   Any
        //  1583   1590   1590   1591   Any
        //  1584   1590   1583   1584   Ljava/lang/NullPointerException;
        //  1584   1590   1590   1591   Ljava/lang/NullPointerException;
        //  1584   1590   1583   1584   Ljava/lang/EnumConstantNotPresentException;
        //  1584   1590   1583   1584   Ljava/lang/EnumConstantNotPresentException;
        //  1647   1654   1654   1655   Any
        //  1648   1654   1647   1648   Any
        //  1648   1654   1654   1655   Any
        //  1647   1654   3      8      Any
        //  1648   1654   1647   1648   Ljava/lang/AssertionError;
        //  1660   1666   1666   1667   Any
        //  1660   1666   3      8      Ljava/util/ConcurrentModificationException;
        //  1660   1666   1666   1667   Any
        //  1660   1666   3      8      Ljava/lang/NumberFormatException;
        //  1660   1666   3      8      Any
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
    
    static {
        throw t;
    }
    
    public f4G(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u2390\u1481\u8a9a\ub3d8\uc9e7\uedbb\ub22d\ue6b6\ud97c"
        //     4: invokestatic    invokestatic   !!! ERROR
        //     7: iload_1        
        //     8: invokespecial   dev/nuker/pyro/f47.<init>:(Ljava/lang/String;I)V
        //    11: aload_0        
        //    12: aload_0        
        //    13: new             Ldev/nuker/pyro/f0a;
        //    16: dup            
        //    17: ldc_w           "\u2382\u149b\u8a87\ub3ce\uc9d8\ued85\ub22d\ue6a0\ud966\ue989\ua744"
        //    20: invokestatic    invokestatic   !!! ERROR
        //    23: ldc_w           "\u23a2\u149b\u8a87\ub3ce\uc9d8\ued85\ub22d\ue6a0\ud966\ue989\ua744"
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            38
        //    32: ldc_w           158104003
        //    35: goto            41
        //    38: ldc_w           -1845293296
        //    41: ldc_w           -444541937
        //    44: ixor           
        //    45: lookupswitch {
        //          -320033332: 38
        //          2005130015: 72
        //          default: 186
        //        }
        //    72: invokestatic    invokestatic   !!! ERROR
        //    75: aconst_null    
        //    76: iconst_1       
        //    77: getstatic       dev/nuker/pyro/fc.1:I
        //    80: ifeq            89
        //    83: ldc_w           -144017828
        //    86: goto            92
        //    89: ldc_w           -2014171274
        //    92: ldc_w           -1816642622
        //    95: ixor           
        //    96: lookupswitch {
        //          340399284: 124
        //          1691504030: 89
        //          default: 188
        //        }
        //   124: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   127: checkcast       Ldev/nuker/pyro/f0n;
        //   130: invokevirtual   dev/nuker/pyro/f4G.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   133: checkcast       Ldev/nuker/pyro/f0a;
        //   136: getstatic       dev/nuker/pyro/fc.1:I
        //   139: ifeq            148
        //   142: ldc_w           -1572681718
        //   145: goto            151
        //   148: ldc_w           -1376033085
        //   151: ldc_w           1254707847
        //   154: ixor           
        //   155: lookupswitch {
        //          -416140220: 180
        //          -393504115: 148
        //          default: 184
        //        }
        //   180: putfield        dev/nuker/pyro/f4G.c:Ldev/nuker/pyro/f0a;
        //   183: return         
        //   184: aconst_null    
        //   185: athrow         
        //   186: aconst_null    
        //   187: athrow         
        //   188: aconst_null    
        //   189: athrow         
        //    StackMapTable: 00 0C FF 00 26 00 02 07 00 03 01 00 06 07 00 03 07 00 03 08 00 0D 08 00 0D 07 01 27 07 01 27 FF 00 02 00 02 07 00 03 01 00 07 07 00 03 07 00 03 08 00 0D 08 00 0D 07 01 27 07 01 27 01 FF 00 1E 00 02 07 00 03 01 00 06 07 00 03 07 00 03 08 00 0D 08 00 0D 07 01 27 07 01 27 FF 00 10 00 02 07 00 03 01 00 08 07 00 03 07 00 03 08 00 0D 08 00 0D 07 01 27 07 01 27 05 01 FF 00 02 00 02 07 00 03 01 00 09 07 00 03 07 00 03 08 00 0D 08 00 0D 07 01 27 07 01 27 05 01 01 FF 00 1F 00 02 07 00 03 01 00 08 07 00 03 07 00 03 08 00 0D 08 00 0D 07 01 27 07 01 27 05 01 FF 00 17 00 02 07 00 03 01 00 02 07 00 03 07 00 EF FF 00 02 00 02 07 00 03 01 00 03 07 00 03 07 00 EF 01 FF 00 1C 00 02 07 00 03 01 00 02 07 00 03 07 00 EF FF 00 03 00 02 07 00 03 01 00 02 07 00 03 07 00 EF FF 00 01 00 02 07 00 03 01 00 06 07 00 03 07 00 03 08 00 0D 08 00 0D 07 01 27 07 01 27 FF 00 01 00 02 07 00 03 01 00 08 07 00 03 07 00 03 08 00 0D 08 00 0D 07 01 27 07 01 27 05 01
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
}
