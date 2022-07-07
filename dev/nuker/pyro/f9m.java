// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.awt.Color;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.AxisAlignedBB;

public class f9M
{
    @NotNull
    public AxisAlignedBB c;
    @NotNull
    public BlockPos c;
    public boolean c;
    public f9P c;
    
    @NotNull
    public AxisAlignedBB 1() {
        return fbS.24(this, 1728378912);
    }
    
    public boolean 3() {
        return fbS.eS(this, 1728453469);
    }
    
    @NotNull
    public BlockPos 0() {
        return fbS.7W(this, 491426975);
    }
    
    public int c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          335
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            327
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            319
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f9M.c:Z
        //    28: getstatic       dev/nuker/pyro/fc.c:I
        //    31: ifge            39
        //    34: ldc             135327799
        //    36: goto            41
        //    39: ldc             -1110306162
        //    41: ldc             -465826267
        //    43: ixor           
        //    44: lookupswitch {
        //          -332595694: 39
        //          1508777131: 72
        //          default: 304
        //        }
        //    72: istore_1       
        //    73: iload_1        
        //    74: iconst_1       
        //    75: if_icmpne       206
        //    78: aload_0        
        //    79: getstatic       dev/nuker/pyro/fc.c:I
        //    82: ifge            90
        //    85: ldc             1754265229
        //    87: goto            92
        //    90: ldc             -502645176
        //    92: ldc             1484353686
        //    94: ixor           
        //    95: lookupswitch {
        //          -1129466963: 90
        //          821462555: 308
        //          default: 120
        //        }
        //   120: getfield        dev/nuker/pyro/f9M.c:Ldev/nuker/pyro/f9P;
        //   123: goto            127
        //   126: athrow         
        //   127: invokevirtual   dev/nuker/pyro/f9P.7:()Ldev/nuker/pyro/f0b;
        //   130: goto            134
        //   133: athrow         
        //   134: goto            138
        //   137: athrow         
        //   138: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //   141: goto            145
        //   144: athrow         
        //   145: checkcast       Ldev/nuker/pyro/fS;
        //   148: getstatic       dev/nuker/pyro/fc.c:I
        //   151: ifge            159
        //   154: ldc             527594562
        //   156: goto            161
        //   159: ldc             -1595056809
        //   161: ldc             1193907285
        //   163: ixor           
        //   164: lookupswitch {
        //          -302067870: 159
        //          1482416151: 306
        //          default: 192
        //        }
        //   192: goto            196
        //   195: athrow         
        //   196: invokevirtual   dev/nuker/pyro/fS.5:()I
        //   199: goto            203
        //   202: athrow         
        //   203: goto            303
        //   206: iload_1        
        //   207: ifne            215
        //   210: ldc             764303347
        //   212: goto            217
        //   215: ldc             764303346
        //   217: ldc             -2119901087
        //   219: ixor           
        //   220: tableswitch {
        //          1481994020: 244
        //          1481994021: 287
        //          default: 210
        //        }
        //   244: aload_0        
        //   245: getfield        dev/nuker/pyro/f9M.c:Ldev/nuker/pyro/f9P;
        //   248: goto            252
        //   251: athrow         
        //   252: invokevirtual   dev/nuker/pyro/f9P.5:()Ldev/nuker/pyro/f0b;
        //   255: goto            259
        //   258: athrow         
        //   259: goto            263
        //   262: athrow         
        //   263: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //   266: goto            270
        //   269: athrow         
        //   270: checkcast       Ldev/nuker/pyro/fS;
        //   273: goto            277
        //   276: athrow         
        //   277: invokevirtual   dev/nuker/pyro/fS.5:()I
        //   280: goto            284
        //   283: athrow         
        //   284: goto            303
        //   287: new             Lkotlin/NoWhenBranchMatchedException;
        //   290: dup            
        //   291: goto            295
        //   294: athrow         
        //   295: invokespecial   kotlin/NoWhenBranchMatchedException.<init>:()V
        //   298: goto            302
        //   301: athrow         
        //   302: athrow         
        //   303: ireturn        
        //   304: aconst_null    
        //   305: athrow         
        //   306: aconst_null    
        //   307: athrow         
        //   308: aconst_null    
        //   309: athrow         
        //   310: pop            
        //   311: goto            24
        //   314: pop            
        //   315: aconst_null    
        //   316: goto            310
        //   319: dup            
        //   320: ifnull          310
        //   323: checkcast       Ljava/lang/Throwable;
        //   326: athrow         
        //   327: dup            
        //   328: ifnull          314
        //   331: checkcast       Ljava/lang/Throwable;
        //   334: athrow         
        //   335: aconst_null    
        //   336: athrow         
        //    StackMapTable: 00 38 FF 00 03 00 02 07 00 03 01 00 01 07 00 3E FA 00 04 FF 00 0B 00 00 00 01 07 00 3E FC 00 03 07 00 03 4E 01 FF 00 01 00 01 07 00 03 00 02 01 01 5E 01 FF 00 11 00 02 07 00 03 01 00 01 07 00 03 FF 00 01 00 02 07 00 03 01 00 02 07 00 03 01 5B 07 00 03 45 07 00 3E 40 07 00 4C 45 07 00 3E 40 07 00 52 42 07 00 3E 40 07 00 52 45 07 00 3E 40 07 00 05 4D 07 00 57 FF 00 01 00 02 07 00 03 01 00 02 07 00 57 01 5E 07 00 57 FF 00 02 00 00 00 01 07 00 3E FF 00 00 00 02 07 00 03 01 00 01 07 00 57 45 07 00 3E 40 01 02 03 04 41 01 1A FF 00 06 00 00 00 01 07 00 3E FF 00 00 00 02 07 00 03 01 00 01 07 00 4C 45 07 00 3E 40 07 00 52 42 07 00 3E 40 07 00 52 45 07 00 3E 40 07 00 05 FF 00 05 00 00 00 01 07 00 3E FF 00 00 00 02 07 00 03 01 00 01 07 00 57 45 07 00 3E 40 01 02 46 07 00 3E FF 00 00 00 02 07 00 03 01 00 02 08 01 1F 08 01 1F 45 07 00 3E 40 07 00 64 40 01 FF 00 00 00 01 07 00 03 00 01 01 FF 00 01 00 02 07 00 03 01 00 01 07 00 57 41 07 00 03 FF 00 01 00 01 07 00 03 00 01 07 00 3E 43 05 44 07 00 3E 47 05 FF 00 07 00 02 07 00 03 01 00 01 07 00 3E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     319    327    Any
        //  319    327    319    327    Ljava/lang/NegativeArraySizeException;
        //  335    337    3      8      Any
        //  126    133    133    134    Any
        //  127    133    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  127    133    126    127    Any
        //  126    133    3      8      Any
        //  126    133    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  137    144    144    145    Any
        //  137    144    137    138    Any
        //  138    144    137    138    Any
        //  137    144    144    145    Any
        //  138    144    3      8      Any
        //  196    202    202    203    Any
        //  196    202    3      8      Ljava/lang/NullPointerException;
        //  196    202    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  196    202    3      8      Ljava/lang/ClassCastException;
        //  196    202    202    203    Any
        //  252    258    258    259    Any
        //  252    258    3      8      Ljava/util/NoSuchElementException;
        //  252    258    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  252    258    3      8      Any
        //  252    258    258    259    Any
        //  262    269    269    270    Any
        //  263    269    269    270    Ljava/lang/RuntimeException;
        //  263    269    262    263    Any
        //  263    269    269    270    Any
        //  263    269    3      8      Any
        //  277    283    283    284    Any
        //  277    283    283    284    Any
        //  277    283    283    284    Any
        //  277    283    3      8      Any
        //  277    283    3      8      Ljava/lang/NumberFormatException;
        //  294    301    301    302    Any
        //  294    301    294    295    Ljava/lang/NullPointerException;
        //  295    301    3      8      Ljava/lang/ClassCastException;
        //  295    301    294    295    Any
        //  295    301    3      8      Any
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
    
    public f9M(@NotNull final f9P c, @NotNull final AxisAlignedBB c2, final BlockPos c3, final boolean c4) {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.0 != 0) {
                    n = 583077391;
                    break Label_0017;
                }
                n = -984838103;
            }
            switch (n ^ 0x504F9B1) {
                case 667285438: {
                    continue;
                }
                case -1068996200: {
                    this.c = c;
                    this.c = c2;
                    this.c = c3;
                    while (true) {
                        int n2 = 0;
                        Label_0081: {
                            if (fc.0 != 0) {
                                n2 = -805081062;
                                break Label_0081;
                            }
                            n2 = -613412333;
                        }
                        switch (n2 ^ 0x37A87FB8) {
                            case -408219742: {
                                continue;
                            }
                            case -321360469: {
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
    }
    
    static {
        throw t;
    }
    
    @NotNull
    public Color 2() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          390
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            382
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            374
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            36
        //    31: ldc             1168144068
        //    33: goto            38
        //    36: ldc             -1214430667
        //    38: ldc             646660261
        //    40: ixor           
        //    41: lookupswitch {
        //          -1963995875: 36
        //          1663776353: 359
        //          default: 68
        //        }
        //    68: getfield        dev/nuker/pyro/f9M.c:Z
        //    71: getstatic       dev/nuker/pyro/fc.1:I
        //    74: ifeq            82
        //    77: ldc             1315430999
        //    79: goto            84
        //    82: ldc             -1981298210
        //    84: ldc             -1084598453
        //    86: ixor           
        //    87: lookupswitch {
        //          -247614180: 82
        //          918396565: 112
        //          default: 361
        //        }
        //   112: istore_1       
        //   113: iload_1        
        //   114: iconst_1       
        //   115: if_icmpne       204
        //   118: aload_0        
        //   119: getfield        dev/nuker/pyro/f9M.c:Ldev/nuker/pyro/f9P;
        //   122: goto            126
        //   125: athrow         
        //   126: invokevirtual   dev/nuker/pyro/f9P.0:()Ldev/nuker/pyro/f0b;
        //   129: goto            133
        //   132: athrow         
        //   133: getstatic       dev/nuker/pyro/fc.0:I
        //   136: ifeq            144
        //   139: ldc             -502974201
        //   141: goto            146
        //   144: ldc             664716361
        //   146: ldc             -1261974898
        //   148: ixor           
        //   149: lookupswitch {
        //          -1822880057: 176
        //          1455616905: 144
        //          default: 363
        //        }
        //   176: goto            180
        //   179: athrow         
        //   180: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //   183: goto            187
        //   186: athrow         
        //   187: checkcast       Ldev/nuker/pyro/fS;
        //   190: goto            194
        //   193: athrow         
        //   194: invokevirtual   dev/nuker/pyro/fS.7:()Ljava/awt/Color;
        //   197: goto            201
        //   200: athrow         
        //   201: goto            354
        //   204: getstatic       dev/nuker/pyro/fc.1:I
        //   207: ifeq            215
        //   210: ldc             220589827
        //   212: goto            217
        //   215: ldc             -881333187
        //   217: ldc             -1992034872
        //   219: ixor           
        //   220: lookupswitch {
        //          -2073683253: 215
        //          1110710773: 248
        //          default: 357
        //        }
        //   248: iload_1        
        //   249: ifne            338
        //   252: aload_0        
        //   253: getfield        dev/nuker/pyro/f9M.c:Ldev/nuker/pyro/f9P;
        //   256: goto            260
        //   259: athrow         
        //   260: invokevirtual   dev/nuker/pyro/f9P.4:()Ldev/nuker/pyro/f0b;
        //   263: goto            267
        //   266: athrow         
        //   267: goto            271
        //   270: athrow         
        //   271: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //   274: goto            278
        //   277: athrow         
        //   278: checkcast       Ldev/nuker/pyro/fS;
        //   281: getstatic       dev/nuker/pyro/fc.0:I
        //   284: ifeq            292
        //   287: ldc             66784787
        //   289: goto            294
        //   292: ldc             -1053192815
        //   294: ldc             1437251792
        //   296: ixor           
        //   297: lookupswitch {
        //          -583109502: 292
        //          1448195779: 355
        //          default: 324
        //        }
        //   324: goto            328
        //   327: athrow         
        //   328: invokevirtual   dev/nuker/pyro/fS.7:()Ljava/awt/Color;
        //   331: goto            335
        //   334: athrow         
        //   335: goto            354
        //   338: new             Lkotlin/NoWhenBranchMatchedException;
        //   341: dup            
        //   342: goto            346
        //   345: athrow         
        //   346: invokespecial   kotlin/NoWhenBranchMatchedException.<init>:()V
        //   349: goto            353
        //   352: athrow         
        //   353: athrow         
        //   354: areturn        
        //   355: aconst_null    
        //   356: athrow         
        //   357: aconst_null    
        //   358: athrow         
        //   359: aconst_null    
        //   360: athrow         
        //   361: aconst_null    
        //   362: athrow         
        //   363: aconst_null    
        //   364: athrow         
        //   365: pop            
        //   366: goto            24
        //   369: pop            
        //   370: aconst_null    
        //   371: goto            365
        //   374: dup            
        //   375: ifnull          365
        //   378: checkcast       Ljava/lang/Throwable;
        //   381: athrow         
        //   382: dup            
        //   383: ifnull          369
        //   386: checkcast       Ljava/lang/Throwable;
        //   389: athrow         
        //   390: aconst_null    
        //   391: athrow         
        //    StackMapTable: 00 3C FF 00 03 00 02 07 00 03 01 00 01 07 00 3E FA 00 04 FF 00 0B 00 00 00 01 07 00 3E FC 00 03 07 00 03 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 4D 01 FF 00 01 00 01 07 00 03 00 02 01 01 5B 01 FF 00 0C 00 02 07 00 03 01 00 01 07 00 3E 40 07 00 4C 45 07 00 3E 40 07 00 52 4A 07 00 52 FF 00 01 00 02 07 00 03 01 00 02 07 00 52 01 5D 07 00 52 42 07 00 27 40 07 00 52 45 07 00 3E 40 07 00 05 45 07 00 3E 40 07 00 57 45 07 00 3E 40 07 00 9E 02 0A 41 01 1E 4A 07 00 35 40 07 00 4C 45 07 00 3E 40 07 00 52 42 07 00 3E 40 07 00 52 45 07 00 3E 40 07 00 05 4D 07 00 57 FF 00 01 00 02 07 00 03 01 00 02 07 00 57 01 5D 07 00 57 42 07 00 3E 40 07 00 57 45 07 00 3E 40 07 00 9E 02 46 07 00 3E FF 00 00 00 02 07 00 03 01 00 02 08 01 52 08 01 52 45 07 00 3E 40 07 00 64 40 07 00 9E 40 07 00 57 01 FF 00 01 00 01 07 00 03 00 01 07 00 03 41 01 FF 00 01 00 02 07 00 03 01 00 01 07 00 52 FF 00 01 00 01 07 00 03 00 01 07 00 3E 43 05 44 07 00 3E 47 05 FF 00 07 00 02 07 00 03 01 00 01 07 00 3E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     374    382    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  374    382    374    382    Any
        //  390    392    3      8      Any
        //  125    132    132    133    Any
        //  125    132    132    133    Ljava/lang/IllegalStateException;
        //  125    132    3      8      Any
        //  126    132    125    126    Any
        //  125    132    3      8      Ljava/lang/IllegalStateException;
        //  179    186    186    187    Any
        //  180    186    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  179    186    179    180    Ljava/lang/EnumConstantNotPresentException;
        //  179    186    186    187    Any
        //  179    186    186    187    Any
        //  193    200    200    201    Any
        //  194    200    193    194    Ljava/lang/IllegalArgumentException;
        //  193    200    200    201    Ljava/lang/NegativeArraySizeException;
        //  193    200    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  194    200    193    194    Any
        //  259    266    266    267    Any
        //  260    266    259    260    Ljava/lang/StringIndexOutOfBoundsException;
        //  259    266    259    260    Ljava/util/ConcurrentModificationException;
        //  260    266    3      8      Ljava/lang/NullPointerException;
        //  260    266    3      8      Any
        //  270    277    277    278    Any
        //  270    277    277    278    Any
        //  271    277    270    271    Any
        //  271    277    277    278    Ljava/util/NoSuchElementException;
        //  270    277    3      8      Any
        //  327    334    334    335    Any
        //  327    334    327    328    Ljava/lang/ArithmeticException;
        //  327    334    327    328    Any
        //  327    334    334    335    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  328    334    327    328    Any
        //  345    352    352    353    Any
        //  346    352    345    346    Ljava/lang/IllegalStateException;
        //  346    352    345    346    Any
        //  346    352    3      8      Any
        //  345    352    352    353    Any
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
}
