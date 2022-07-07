// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.block.Block;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

public class f6i extends fH
{
    public f0a c;
    
    public float c(final BlockPos p0, final ItemStack p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          626
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            618
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            610
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //    28: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //    31: aload_1        
        //    32: goto            36
        //    35: athrow         
        //    36: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //    39: goto            43
        //    42: athrow         
        //    43: getstatic       dev/nuker/pyro/fc.c:I
        //    46: ifge            54
        //    49: ldc             1367663270
        //    51: goto            56
        //    54: ldc             938647647
        //    56: ldc             1047791628
        //    58: ixor           
        //    59: lookupswitch {
        //          159819859: 84
        //          1878059690: 54
        //          default: 587
        //        }
        //    84: aload_0        
        //    85: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //    88: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //    91: aload_1        
        //    92: goto            96
        //    95: athrow         
        //    96: invokeinterface net/minecraft/block/state/IBlockState.func_185887_b:(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)F
        //   101: goto            105
        //   104: athrow         
        //   105: getstatic       dev/nuker/pyro/fc.0:I
        //   108: ifeq            116
        //   111: ldc             -380089876
        //   113: goto            118
        //   116: ldc             641921888
        //   118: ldc             -1952056930
        //   120: ixor           
        //   121: lookupswitch {
        //          -1377367298: 148
        //          1660792946: 116
        //          default: 589
        //        }
        //   148: fstore_3       
        //   149: fload_3        
        //   150: fconst_0       
        //   151: fcmpg          
        //   152: ifge            157
        //   155: fconst_0       
        //   156: freturn        
        //   157: getstatic       dev/nuker/pyro/fc.0:I
        //   160: ifeq            168
        //   163: ldc             -297455259
        //   165: goto            170
        //   168: ldc             -467138298
        //   170: ldc             992843291
        //   172: ixor           
        //   173: lookupswitch {
        //          -714561666: 168
        //          -553279715: 200
        //          default: 597
        //        }
        //   200: aload_0        
        //   201: aload_0        
        //   202: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   205: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   208: getstatic       dev/nuker/pyro/fc.1:I
        //   211: ifeq            219
        //   214: ldc             1837170872
        //   216: goto            221
        //   219: ldc             1710382565
        //   221: ldc             1823395672
        //   223: ixor           
        //   224: lookupswitch {
        //          19910624: 219
        //          157061821: 252
        //          default: 599
        //        }
        //   252: aload_1        
        //   253: getstatic       dev/nuker/pyro/fc.c:I
        //   256: ifge            264
        //   259: ldc             1872135924
        //   261: goto            266
        //   264: ldc             1858797218
        //   266: ldc             2107486203
        //   268: ixor           
        //   269: lookupswitch {
        //          -1372754717: 264
        //          302721295: 583
        //          default: 296
        //        }
        //   296: goto            300
        //   299: athrow         
        //   300: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   303: goto            307
        //   306: athrow         
        //   307: goto            311
        //   310: athrow         
        //   311: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   316: goto            320
        //   319: athrow         
        //   320: aload_1        
        //   321: aload_2        
        //   322: goto            326
        //   325: athrow         
        //   326: invokevirtual   dev/nuker/pyro/f6i.c:(Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/ItemStack;)Z
        //   329: goto            333
        //   332: athrow         
        //   333: ifne            418
        //   336: aload_0        
        //   337: getstatic       dev/nuker/pyro/fc.1:I
        //   340: ifeq            348
        //   343: ldc             -630378190
        //   345: goto            350
        //   348: ldc             -1673041890
        //   350: ldc             85265807
        //   352: ixor           
        //   353: lookupswitch {
        //          -1722653295: 380
        //          -545768259: 348
        //          default: 595
        //        }
        //   380: aload_0        
        //   381: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   384: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   387: aload_1        
        //   388: goto            392
        //   391: athrow         
        //   392: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   395: goto            399
        //   398: athrow         
        //   399: aload_1        
        //   400: aload_2        
        //   401: goto            405
        //   404: athrow         
        //   405: invokevirtual   dev/nuker/pyro/f6i.c:(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/ItemStack;)F
        //   408: goto            412
        //   411: athrow         
        //   412: fload_3        
        //   413: fdiv           
        //   414: ldc             100.0
        //   416: fdiv           
        //   417: freturn        
        //   418: getstatic       dev/nuker/pyro/fc.c:I
        //   421: ifge            429
        //   424: ldc             -1943623137
        //   426: goto            431
        //   429: ldc             2104156375
        //   431: ldc             1819405102
        //   433: ixor           
        //   434: lookupswitch {
        //          -531152591: 585
        //          -486816858: 429
        //          default: 460
        //        }
        //   460: aload_0        
        //   461: getstatic       dev/nuker/pyro/fc.c:I
        //   464: ifge            472
        //   467: ldc             810813021
        //   469: goto            474
        //   472: ldc             -133187173
        //   474: ldc             1050975724
        //   476: ixor           
        //   477: lookupswitch {
        //          -1370842446: 472
        //          250649521: 591
        //          default: 504
        //        }
        //   504: aload_0        
        //   505: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   508: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   511: getstatic       dev/nuker/pyro/fc.0:I
        //   514: ifeq            522
        //   517: ldc             493930223
        //   519: goto            524
        //   522: ldc             839812897
        //   524: ldc             -2074017018
        //   526: ixor           
        //   527: lookupswitch {
        //          -1726888471: 522
        //          -1234205657: 552
        //          default: 593
        //        }
        //   552: aload_1        
        //   553: goto            557
        //   556: athrow         
        //   557: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   560: goto            564
        //   563: athrow         
        //   564: aload_1        
        //   565: aload_2        
        //   566: goto            570
        //   569: athrow         
        //   570: invokevirtual   dev/nuker/pyro/f6i.c:(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/ItemStack;)F
        //   573: goto            577
        //   576: athrow         
        //   577: fload_3        
        //   578: fdiv           
        //   579: ldc             30.0
        //   581: fdiv           
        //   582: freturn        
        //   583: aconst_null    
        //   584: athrow         
        //   585: aconst_null    
        //   586: athrow         
        //   587: aconst_null    
        //   588: athrow         
        //   589: aconst_null    
        //   590: athrow         
        //   591: aconst_null    
        //   592: athrow         
        //   593: aconst_null    
        //   594: athrow         
        //   595: aconst_null    
        //   596: athrow         
        //   597: aconst_null    
        //   598: athrow         
        //   599: aconst_null    
        //   600: athrow         
        //   601: pop            
        //   602: goto            24
        //   605: pop            
        //   606: aconst_null    
        //   607: goto            601
        //   610: dup            
        //   611: ifnull          601
        //   614: checkcast       Ljava/lang/Throwable;
        //   617: athrow         
        //   618: dup            
        //   619: ifnull          605
        //   622: checkcast       Ljava/lang/Throwable;
        //   625: athrow         
        //   626: aconst_null    
        //   627: athrow         
        //    StackMapTable: 00 53 43 07 00 23 04 FF 00 0B 00 00 00 01 07 00 23 FE 00 03 07 00 03 07 00 67 07 00 69 4A 07 00 23 FF 00 00 00 03 07 00 03 07 00 67 07 00 69 00 02 07 00 2E 07 00 67 45 07 00 23 40 07 00 37 4A 07 00 37 FF 00 01 00 03 07 00 03 07 00 67 07 00 69 00 02 07 00 37 01 5B 07 00 37 4A 07 00 23 FF 00 00 00 03 07 00 03 07 00 67 07 00 69 00 03 07 00 37 07 00 2E 07 00 67 47 07 00 23 40 02 4A 02 FF 00 01 00 03 07 00 03 07 00 67 07 00 69 00 02 02 01 5D 02 FC 00 08 02 0A 41 01 1D FF 00 12 00 04 07 00 03 07 00 67 07 00 69 02 00 02 07 00 03 07 00 2E FF 00 01 00 04 07 00 03 07 00 67 07 00 69 02 00 03 07 00 03 07 00 2E 01 FF 00 1E 00 04 07 00 03 07 00 67 07 00 69 02 00 02 07 00 03 07 00 2E FF 00 0B 00 04 07 00 03 07 00 67 07 00 69 02 00 03 07 00 03 07 00 2E 07 00 67 FF 00 01 00 04 07 00 03 07 00 67 07 00 69 02 00 04 07 00 03 07 00 2E 07 00 67 01 FF 00 1D 00 04 07 00 03 07 00 67 07 00 69 02 00 03 07 00 03 07 00 2E 07 00 67 42 07 00 23 FF 00 00 00 04 07 00 03 07 00 67 07 00 69 02 00 03 07 00 03 07 00 2E 07 00 67 45 07 00 23 FF 00 00 00 04 07 00 03 07 00 67 07 00 69 02 00 02 07 00 03 07 00 37 42 07 00 23 FF 00 00 00 04 07 00 03 07 00 67 07 00 69 02 00 02 07 00 03 07 00 37 47 07 00 23 FF 00 00 00 04 07 00 03 07 00 67 07 00 69 02 00 02 07 00 03 07 00 6B 44 07 00 23 FF 00 00 00 04 07 00 03 07 00 67 07 00 69 02 00 04 07 00 03 07 00 6B 07 00 67 07 00 69 45 07 00 23 40 01 4E 07 00 03 FF 00 01 00 04 07 00 03 07 00 67 07 00 69 02 00 02 07 00 03 01 5D 07 00 03 FF 00 0A 00 00 00 01 07 00 23 FF 00 00 00 04 07 00 03 07 00 67 07 00 69 02 00 03 07 00 03 07 00 2E 07 00 67 45 07 00 23 FF 00 00 00 04 07 00 03 07 00 67 07 00 69 02 00 02 07 00 03 07 00 37 44 07 00 23 FF 00 00 00 04 07 00 03 07 00 67 07 00 69 02 00 04 07 00 03 07 00 37 07 00 67 07 00 69 45 07 00 23 40 02 05 0A 41 01 1C 4B 07 00 03 FF 00 01 00 04 07 00 03 07 00 67 07 00 69 02 00 02 07 00 03 01 5D 07 00 03 FF 00 11 00 04 07 00 03 07 00 67 07 00 69 02 00 02 07 00 03 07 00 2E FF 00 01 00 04 07 00 03 07 00 67 07 00 69 02 00 03 07 00 03 07 00 2E 01 FF 00 1B 00 04 07 00 03 07 00 67 07 00 69 02 00 02 07 00 03 07 00 2E 43 07 00 23 FF 00 00 00 04 07 00 03 07 00 67 07 00 69 02 00 03 07 00 03 07 00 2E 07 00 67 45 07 00 23 FF 00 00 00 04 07 00 03 07 00 67 07 00 69 02 00 02 07 00 03 07 00 37 FF 00 04 00 00 00 01 07 00 23 FF 00 00 00 04 07 00 03 07 00 67 07 00 69 02 00 04 07 00 03 07 00 37 07 00 67 07 00 69 45 07 00 23 40 02 FF 00 05 00 04 07 00 03 07 00 67 07 00 69 02 00 03 07 00 03 07 00 2E 07 00 67 01 FF 00 01 00 03 07 00 03 07 00 67 07 00 69 00 01 07 00 37 41 02 FF 00 01 00 04 07 00 03 07 00 67 07 00 69 02 00 01 07 00 03 FF 00 01 00 04 07 00 03 07 00 67 07 00 69 02 00 02 07 00 03 07 00 2E 41 07 00 03 01 FF 00 01 00 04 07 00 03 07 00 67 07 00 69 02 00 02 07 00 03 07 00 2E FF 00 01 00 03 07 00 03 07 00 67 07 00 69 00 01 07 00 23 43 05 44 07 00 23 47 05 47 07 00 23
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     610    618    Any
        //  610    618    610    618    Ljava/lang/ArithmeticException;
        //  626    628    3      8      Any
        //  35     42     42     43     Any
        //  36     42     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  35     42     35     36     Any
        //  35     42     35     36     Ljava/lang/IllegalStateException;
        //  36     42     35     36     Ljava/util/NoSuchElementException;
        //  95     104    104    105    Any
        //  96     104    95     96     Ljava/lang/NumberFormatException;
        //  95     104    95     96     Any
        //  96     104    95     96     Any
        //  96     104    95     96     Ljava/lang/ArithmeticException;
        //  299    306    306    307    Any
        //  299    306    299    300    Any
        //  300    306    299    300    Any
        //  300    306    306    307    Ljava/lang/ClassCastException;
        //  299    306    3      8      Any
        //  310    319    319    320    Any
        //  311    319    310    311    Ljava/util/NoSuchElementException;
        //  311    319    310    311    Any
        //  310    319    310    311    Any
        //  310    319    319    320    Ljava/lang/IndexOutOfBoundsException;
        //  325    332    332    333    Any
        //  325    332    325    326    Ljava/lang/UnsupportedOperationException;
        //  325    332    325    326    Any
        //  326    332    332    333    Ljava/lang/RuntimeException;
        //  326    332    332    333    Ljava/lang/NumberFormatException;
        //  392    398    398    399    Any
        //  392    398    3      8      Ljava/lang/RuntimeException;
        //  392    398    3      8      Any
        //  392    398    3      8      Any
        //  392    398    3      8      Any
        //  404    411    411    412    Any
        //  405    411    404    405    Ljava/lang/IllegalArgumentException;
        //  405    411    404    405    Any
        //  405    411    404    405    Any
        //  405    411    3      8      Any
        //  556    563    563    564    Any
        //  556    563    3      8      Ljava/lang/IllegalArgumentException;
        //  556    563    556    557    Any
        //  557    563    556    557    Ljava/lang/UnsupportedOperationException;
        //  556    563    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  570    576    576    577    Any
        //  570    576    3      8      Any
        //  570    576    3      8      Any
        //  570    576    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  570    576    576    577    Ljava/lang/NumberFormatException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:618)
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
    
    public float c(final IBlockState p0, final ItemStack p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          114
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            106
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            98
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: fconst_1       
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            36
        //    31: ldc             -1221330819
        //    33: goto            38
        //    36: ldc             -758226894
        //    38: ldc             1317300855
        //    40: ixor           
        //    41: lookupswitch {
        //          -1672869307: 68
        //          -105410038: 36
        //          default: 87
        //        }
        //    68: fstore_3       
        //    69: fload_3        
        //    70: aload_2        
        //    71: aload_1        
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   net/minecraft/item/ItemStack.func_150997_a:(Lnet/minecraft/block/state/IBlockState;)F
        //    79: goto            83
        //    82: athrow         
        //    83: fmul           
        //    84: fstore_3       
        //    85: fload_3        
        //    86: freturn        
        //    87: aconst_null    
        //    88: athrow         
        //    89: pop            
        //    90: goto            24
        //    93: pop            
        //    94: aconst_null    
        //    95: goto            89
        //    98: dup            
        //    99: ifnull          89
        //   102: checkcast       Ljava/lang/Throwable;
        //   105: athrow         
        //   106: dup            
        //   107: ifnull          93
        //   110: checkcast       Ljava/lang/Throwable;
        //   113: athrow         
        //   114: aconst_null    
        //   115: athrow         
        //    StackMapTable: 00 11 FF 00 03 00 04 07 00 03 07 00 37 07 00 69 02 00 01 07 00 23 FA 00 04 FF 00 0B 00 00 00 01 07 00 23 FE 00 03 07 00 03 07 00 37 07 00 69 4B 02 FF 00 01 00 03 07 00 03 07 00 37 07 00 69 00 02 02 01 5D 02 FF 00 06 00 04 07 00 03 07 00 37 07 00 69 02 00 01 07 00 23 FF 00 00 00 04 07 00 03 07 00 37 07 00 69 02 00 03 02 07 00 69 07 00 37 45 07 00 23 FF 00 00 00 04 07 00 03 07 00 37 07 00 69 02 00 02 02 02 FF 00 03 00 03 07 00 03 07 00 37 07 00 69 00 01 02 41 07 00 23 43 05 44 07 00 23 47 05 FF 00 07 00 04 07 00 03 07 00 37 07 00 69 02 00 01 07 00 23
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  8      20     98     106    Any
        //  98     106    98     106    Any
        //  114    116    3      8      Any
        //  75     82     82     83     Any
        //  76     82     3      8      Any
        //  75     82     82     83     Any
        //  75     82     75     76     Any
        //  75     82     75     76     Ljava/lang/IllegalStateException;
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
    
    @f06
    @LauncherEventHide
    public void c(final f37 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1446
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1438
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1430
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            36
        //    31: ldc             -582711046
        //    33: goto            38
        //    36: ldc             -1579647814
        //    38: ldc             1543291215
        //    40: ixor           
        //    41: lookupswitch {
        //          -2034742859: 1407
        //          2000236321: 36
        //          default: 68
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokevirtual   dev/nuker/pyro/f37.c:()Ldev/nuker/pyro/f2T;
        //    75: goto            79
        //    78: athrow         
        //    79: getstatic       dev/nuker/pyro/fc.c:I
        //    82: ifge            90
        //    85: ldc             -612031056
        //    87: goto            92
        //    90: ldc             -1767053881
        //    92: ldc             -794052112
        //    94: ixor           
        //    95: lookupswitch {
        //          187604032: 90
        //          1174887479: 120
        //          default: 1405
        //        }
        //   120: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //   123: if_acmpne       1378
        //   126: aload_0        
        //   127: getfield        dev/nuker/pyro/f6i.c:Ldev/nuker/pyro/f0a;
        //   130: getstatic       dev/nuker/pyro/fc.1:I
        //   133: ifeq            141
        //   136: ldc             -1858005757
        //   138: goto            143
        //   141: ldc             -766926239
        //   143: ldc             -1049834806
        //   145: ixor           
        //   146: lookupswitch {
        //          -1402706188: 141
        //          1345183689: 1383
        //          default: 172
        //        }
        //   172: goto            176
        //   175: athrow         
        //   176: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   179: goto            183
        //   182: athrow         
        //   183: checkcast       Ljava/lang/Boolean;
        //   186: goto            190
        //   189: athrow         
        //   190: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   193: goto            197
        //   196: athrow         
        //   197: ifeq            1378
        //   200: aload_1        
        //   201: goto            205
        //   204: athrow         
        //   205: invokevirtual   dev/nuker/pyro/f37.c:()Lnet/minecraft/entity/Entity;
        //   208: goto            212
        //   211: athrow         
        //   212: instanceof      Lnet/minecraft/entity/EntityLivingBase;
        //   215: ifeq            1378
        //   218: iconst_m1      
        //   219: istore_2       
        //   220: dconst_0       
        //   221: dstore_3       
        //   222: iconst_0       
        //   223: istore          5
        //   225: iload           5
        //   227: bipush          9
        //   229: if_icmpge       1249
        //   232: getstatic       dev/nuker/pyro/fc.0:I
        //   235: ifeq            243
        //   238: ldc             315635560
        //   240: goto            245
        //   243: ldc             269372022
        //   245: ldc             -380455883
        //   247: ixor           
        //   248: lookupswitch {
        //          -162048462: 243
        //          -75332771: 1409
        //          default: 276
        //        }
        //   276: aload_0        
        //   277: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   280: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   283: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   286: getstatic       dev/nuker/pyro/fc.1:I
        //   289: ifeq            297
        //   292: ldc             -1721763253
        //   294: goto            299
        //   297: ldc             410774634
        //   299: ldc             -1529474771
        //   301: ixor           
        //   302: lookupswitch {
        //          -801279642: 297
        //          1032448870: 1381
        //          default: 328
        //        }
        //   328: iload           5
        //   330: getstatic       dev/nuker/pyro/fc.c:I
        //   333: ifge            341
        //   336: ldc             594714092
        //   338: goto            343
        //   341: ldc             759715113
        //   343: ldc             570604788
        //   345: ixor           
        //   346: lookupswitch {
        //          24125720: 1391
        //          275151253: 341
        //          default: 372
        //        }
        //   372: goto            376
        //   375: athrow         
        //   376: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70301_a:(I)Lnet/minecraft/item/ItemStack;
        //   379: goto            383
        //   382: athrow         
        //   383: astore          6
        //   385: getstatic       dev/nuker/pyro/fc.0:I
        //   388: ifeq            396
        //   391: ldc             -1172622295
        //   393: goto            398
        //   396: ldc             104371692
        //   398: ldc             -556804069
        //   400: ixor           
        //   401: lookupswitch {
        //          -1738682363: 396
        //          1691675698: 1393
        //          default: 428
        //        }
        //   428: aload           6
        //   430: ifnull          438
        //   433: ldc             1494947951
        //   435: goto            440
        //   438: ldc             1494947948
        //   440: ldc             1680260654
        //   442: ixor           
        //   443: tableswitch {
        //          2054900866: 464
        //          2054900867: 1243
        //          default: 433
        //        }
        //   464: getstatic       dev/nuker/pyro/fc.c:I
        //   467: ifge            475
        //   470: ldc             1318748584
        //   472: goto            477
        //   475: ldc             2068628648
        //   477: ldc             2011952319
        //   479: ixor           
        //   480: lookupswitch {
        //          -1351347540: 475
        //          963736855: 1411
        //          default: 508
        //        }
        //   508: aload           6
        //   510: goto            514
        //   513: athrow         
        //   514: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   517: goto            521
        //   520: athrow         
        //   521: instanceof      Lnet/minecraft/item/ItemSword;
        //   524: ifne            589
        //   527: aload           6
        //   529: getstatic       dev/nuker/pyro/fc.1:I
        //   532: ifeq            540
        //   535: ldc             1581172780
        //   537: goto            542
        //   540: ldc             -174811971
        //   542: ldc             -677638702
        //   544: ixor           
        //   545: lookupswitch {
        //          -1985821186: 1415
        //          2028004492: 540
        //          default: 572
        //        }
        //   572: goto            576
        //   575: athrow         
        //   576: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   579: goto            583
        //   582: athrow         
        //   583: instanceof      Lnet/minecraft/item/ItemTool;
        //   586: ifeq            1243
        //   589: getstatic       dev/nuker/pyro/fc.c:I
        //   592: ifge            600
        //   595: ldc             256479900
        //   597: goto            602
        //   600: ldc             -426213771
        //   602: ldc             545259222
        //   604: ixor           
        //   605: lookupswitch {
        //          792095818: 1397
        //          1510779282: 600
        //          default: 632
        //        }
        //   632: iload_2        
        //   633: iconst_m1      
        //   634: if_icmpne       642
        //   637: ldc             -243058703
        //   639: goto            644
        //   642: ldc             -243058698
        //   644: ldc             857404490
        //   646: ixor           
        //   647: tableswitch {
        //          -2060220554: 668
        //          -2060220553: 671
        //          default: 637
        //        }
        //   668: iload           5
        //   670: istore_2       
        //   671: getstatic       dev/nuker/pyro/fc.1:I
        //   674: ifeq            682
        //   677: ldc             -488161096
        //   679: goto            684
        //   682: ldc             313953209
        //   684: ldc             -1591626280
        //   686: ixor           
        //   687: lookupswitch {
        //          -801945890: 682
        //          1137112416: 1399
        //          default: 712
        //        }
        //   712: aload           6
        //   714: goto            718
        //   717: athrow         
        //   718: invokestatic    net/minecraft/enchantment/EnchantmentHelper.func_82781_a:(Lnet/minecraft/item/ItemStack;)Ljava/util/Map;
        //   721: goto            725
        //   724: athrow         
        //   725: getstatic       dev/nuker/pyro/fc.1:I
        //   728: ifeq            736
        //   731: ldc             -570806916
        //   733: goto            738
        //   736: ldc             1333011492
        //   738: ldc             -56554833
        //   740: ixor           
        //   741: lookupswitch {
        //          -1277874549: 768
        //          559622099: 736
        //          default: 1403
        //        }
        //   768: goto            772
        //   771: athrow         
        //   772: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   777: goto            781
        //   780: athrow         
        //   781: goto            785
        //   784: athrow         
        //   785: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   790: goto            794
        //   793: athrow         
        //   794: getstatic       dev/nuker/pyro/fc.c:I
        //   797: ifge            805
        //   800: ldc             1980678592
        //   802: goto            807
        //   805: ldc             -423229562
        //   807: ldc             790876153
        //   809: ixor           
        //   810: lookupswitch {
        //          738571985: 805
        //          1496124985: 1389
        //          default: 836
        //        }
        //   836: astore          7
        //   838: aload           7
        //   840: goto            844
        //   843: athrow         
        //   844: invokeinterface java/util/Iterator.hasNext:()Z
        //   849: goto            853
        //   852: athrow         
        //   853: ifeq            1243
        //   856: aload           7
        //   858: getstatic       dev/nuker/pyro/fc.c:I
        //   861: ifge            869
        //   864: ldc             -1261351021
        //   866: goto            871
        //   869: ldc             -566782532
        //   871: ldc             1360849682
        //   873: ixor           
        //   874: lookupswitch {
        //          -1892974930: 900
        //          -439507839: 869
        //          default: 1417
        //        }
        //   900: goto            904
        //   903: athrow         
        //   904: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   909: goto            913
        //   912: athrow         
        //   913: checkcast       Lnet/minecraft/enchantment/Enchantment;
        //   916: astore          8
        //   918: aload           8
        //   920: instanceof      Lnet/minecraft/enchantment/EnchantmentDamage;
        //   923: ifeq            932
        //   926: ldc_w           -1113587362
        //   929: goto            935
        //   932: ldc_w           -1113587361
        //   935: ldc_w           -2031776840
        //   938: ixor           
        //   939: tableswitch {
        //          1988826572: 960
        //          1988826573: 1240
        //          default: 926
        //        }
        //   960: aload           8
        //   962: checkcast       Lnet/minecraft/enchantment/EnchantmentDamage;
        //   965: astore          9
        //   967: aload           9
        //   969: getfield        net/minecraft/enchantment/EnchantmentDamage.field_77361_a:I
        //   972: ifeq            978
        //   975: goto            838
        //   978: getstatic       dev/nuker/pyro/fc.1:I
        //   981: ifeq            990
        //   984: ldc_w           279881329
        //   987: goto            993
        //   990: ldc_w           993182890
        //   993: ldc_w           1744620332
        //   996: ixor           
        //   997: lookupswitch {
        //          1557008262: 1024
        //          2001890653: 990
        //          default: 1413
        //        }
        //  1024: aload           8
        //  1026: getstatic       dev/nuker/pyro/fc.0:I
        //  1029: ifeq            1038
        //  1032: ldc_w           -1081451482
        //  1035: goto            1041
        //  1038: ldc_w           1786348944
        //  1041: ldc_w           599187593
        //  1044: ixor           
        //  1045: lookupswitch {
        //          -1673741137: 1038
        //          1238328601: 1072
        //          default: 1395
        //        }
        //  1072: aload           6
        //  1074: goto            1078
        //  1077: athrow         
        //  1078: invokestatic    net/minecraft/enchantment/EnchantmentHelper.func_77506_a:(Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/item/ItemStack;)I
        //  1081: goto            1085
        //  1084: athrow         
        //  1085: i2d            
        //  1086: getstatic       dev/nuker/pyro/fc.0:I
        //  1089: ifeq            1098
        //  1092: ldc_w           -683841113
        //  1095: goto            1101
        //  1098: ldc_w           246848695
        //  1101: ldc_w           -2124813527
        //  1104: ixor           
        //  1105: lookupswitch {
        //          -1192225636: 1098
        //          1449427598: 1401
        //          default: 1132
        //        }
        //  1132: dstore          10
        //  1134: getstatic       dev/nuker/pyro/fc.0:I
        //  1137: ifeq            1146
        //  1140: ldc_w           660843384
        //  1143: goto            1149
        //  1146: ldc_w           -558270950
        //  1149: ldc_w           -2098501447
        //  1152: ixor           
        //  1153: lookupswitch {
        //          -1517763647: 1146
        //          1548885667: 1180
        //          default: 1379
        //        }
        //  1180: dload           10
        //  1182: dload_3        
        //  1183: dcmpl          
        //  1184: ifle            1240
        //  1187: dload           10
        //  1189: getstatic       dev/nuker/pyro/fc.c:I
        //  1192: ifge            1201
        //  1195: ldc_w           -516386323
        //  1198: goto            1204
        //  1201: ldc_w           1718877283
        //  1204: ldc_w           84132839
        //  1207: ixor           
        //  1208: lookupswitch {
        //          -465874422: 1387
        //          1972892685: 1201
        //          default: 1236
        //        }
        //  1236: dstore_3       
        //  1237: iload           5
        //  1239: istore_2       
        //  1240: goto            838
        //  1243: iinc            5, 1
        //  1246: goto            225
        //  1249: iload_2        
        //  1250: iconst_m1      
        //  1251: if_icmpeq       1378
        //  1254: getstatic       dev/nuker/pyro/fc.0:I
        //  1257: ifeq            1266
        //  1260: ldc_w           538584603
        //  1263: goto            1269
        //  1266: ldc_w           -428990789
        //  1269: ldc_w           -374265016
        //  1272: ixor           
        //  1273: lookupswitch {
        //          -911536813: 1266
        //          266286579: 1300
        //          default: 1419
        //        }
        //  1300: aload_0        
        //  1301: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //  1304: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1307: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  1310: iload_2        
        //  1311: putfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //  1314: getstatic       dev/nuker/pyro/fc.1:I
        //  1317: ifeq            1326
        //  1320: ldc_w           -286756532
        //  1323: goto            1329
        //  1326: ldc_w           -262457891
        //  1329: ldc_w           623746248
        //  1332: ixor           
        //  1333: lookupswitch {
        //          -876221052: 1326
        //          -713643755: 1360
        //          default: 1385
        //        }
        //  1360: aload_0        
        //  1361: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //  1364: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  1367: goto            1371
        //  1370: athrow         
        //  1371: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78765_e:()V
        //  1374: goto            1378
        //  1377: athrow         
        //  1378: return         
        //  1379: aconst_null    
        //  1380: athrow         
        //  1381: aconst_null    
        //  1382: athrow         
        //  1383: aconst_null    
        //  1384: athrow         
        //  1385: aconst_null    
        //  1386: athrow         
        //  1387: aconst_null    
        //  1388: athrow         
        //  1389: aconst_null    
        //  1390: athrow         
        //  1391: aconst_null    
        //  1392: athrow         
        //  1393: aconst_null    
        //  1394: athrow         
        //  1395: aconst_null    
        //  1396: athrow         
        //  1397: aconst_null    
        //  1398: athrow         
        //  1399: aconst_null    
        //  1400: athrow         
        //  1401: aconst_null    
        //  1402: athrow         
        //  1403: aconst_null    
        //  1404: athrow         
        //  1405: aconst_null    
        //  1406: athrow         
        //  1407: aconst_null    
        //  1408: athrow         
        //  1409: aconst_null    
        //  1410: athrow         
        //  1411: aconst_null    
        //  1412: athrow         
        //  1413: aconst_null    
        //  1414: athrow         
        //  1415: aconst_null    
        //  1416: athrow         
        //  1417: aconst_null    
        //  1418: athrow         
        //  1419: aconst_null    
        //  1420: athrow         
        //  1421: pop            
        //  1422: goto            24
        //  1425: pop            
        //  1426: aconst_null    
        //  1427: goto            1421
        //  1430: dup            
        //  1431: ifnull          1421
        //  1434: checkcast       Ljava/lang/Throwable;
        //  1437: athrow         
        //  1438: dup            
        //  1439: ifnull          1425
        //  1442: checkcast       Ljava/lang/Throwable;
        //  1445: athrow         
        //  1446: aconst_null    
        //  1447: athrow         
        //    StackMapTable: 00 A9 43 07 00 23 04 FF 00 0B 00 00 00 01 07 00 23 FD 00 03 07 00 03 07 00 83 4B 07 00 83 FF 00 01 00 02 07 00 03 07 00 83 00 02 07 00 83 01 5D 07 00 83 FF 00 02 00 00 00 01 07 00 23 FF 00 00 00 02 07 00 03 07 00 83 00 01 07 00 83 45 07 00 23 40 07 00 8B 4A 07 00 8B FF 00 01 00 02 07 00 03 07 00 83 00 02 07 00 8B 01 5B 07 00 8B 54 07 00 95 FF 00 01 00 02 07 00 03 07 00 83 00 02 07 00 95 01 5C 07 00 95 FF 00 02 00 00 00 01 07 00 23 FF 00 00 00 02 07 00 03 07 00 83 00 01 07 00 95 45 07 00 23 40 07 01 2F 45 07 00 23 40 07 00 9B 45 07 00 23 40 01 46 07 00 7A 40 07 00 83 45 07 00 23 40 07 01 31 FE 00 0C 01 03 01 11 41 01 1E 54 07 00 B9 FF 00 01 00 05 07 00 03 07 00 83 01 03 01 00 02 07 00 B9 01 5C 07 00 B9 FF 00 0C 00 05 07 00 03 07 00 83 01 03 01 00 02 07 00 B9 01 FF 00 01 00 05 07 00 03 07 00 83 01 03 01 00 03 07 00 B9 01 01 FF 00 1C 00 05 07 00 03 07 00 83 01 03 01 00 02 07 00 B9 01 42 07 00 23 FF 00 00 00 05 07 00 03 07 00 83 01 03 01 00 02 07 00 B9 01 45 07 00 23 40 07 00 69 FC 00 0C 07 00 69 41 01 1D 04 04 41 01 17 0A 41 01 1E 44 07 00 23 40 07 00 69 45 07 00 23 40 07 01 33 52 07 00 69 FF 00 01 00 06 07 00 03 07 00 83 01 03 01 07 00 69 00 02 07 00 69 01 5D 07 00 69 42 07 00 23 40 07 00 69 45 07 00 23 40 07 01 33 05 0A 41 01 1D 04 04 41 01 17 02 0A 41 01 1B FF 00 04 00 00 00 01 07 00 23 FF 00 00 00 06 07 00 03 07 00 83 01 03 01 07 00 69 00 01 07 00 69 45 07 00 23 40 07 00 E5 4A 07 00 E5 FF 00 01 00 06 07 00 03 07 00 83 01 03 01 07 00 69 00 02 07 00 E5 01 5D 07 00 E5 42 07 00 23 40 07 00 E5 47 07 00 23 40 07 00 EB 42 07 00 23 40 07 00 EB 47 07 00 23 40 07 00 F4 4A 07 00 F4 FF 00 01 00 06 07 00 03 07 00 83 01 03 01 07 00 69 00 02 07 00 F4 01 5C 07 00 F4 FC 00 01 07 00 F4 FF 00 04 00 00 00 01 07 00 23 FF 00 00 00 07 07 00 03 07 00 83 01 03 01 07 00 69 07 00 F4 00 01 07 00 F4 47 07 00 23 40 01 4F 07 00 F4 FF 00 01 00 07 07 00 03 07 00 83 01 03 01 07 00 69 07 00 F4 00 02 07 00 F4 01 5C 07 00 F4 FF 00 02 00 00 00 01 07 00 23 FF 00 00 00 07 07 00 03 07 00 83 01 03 01 07 00 69 07 00 F4 00 01 07 00 F4 47 07 00 23 40 07 01 2F FC 00 0C 07 00 FF 05 42 01 18 FC 00 11 07 01 01 0B 42 01 1E 4D 07 00 FF FF 00 02 00 09 07 00 03 07 00 83 01 03 01 07 00 69 07 00 F4 07 00 FF 07 01 01 00 02 07 00 FF 01 5E 07 00 FF FF 00 04 00 00 00 01 07 00 23 FF 00 00 00 09 07 00 03 07 00 83 01 03 01 07 00 69 07 00 F4 07 00 FF 07 01 01 00 02 07 00 FF 07 00 69 45 07 00 23 40 01 4C 03 FF 00 02 00 09 07 00 03 07 00 83 01 03 01 07 00 69 07 00 F4 07 00 FF 07 01 01 00 02 03 01 5E 03 FC 00 0D 03 42 01 1E 54 03 FF 00 02 00 0A 07 00 03 07 00 83 01 03 01 07 00 69 07 00 F4 07 00 FF 07 01 01 03 00 02 03 01 5F 03 F9 00 03 F9 00 02 FA 00 05 10 42 01 1E 19 42 01 1E 49 07 00 12 40 07 01 29 45 07 00 23 F8 00 00 FF 00 00 00 0A 07 00 03 07 00 83 01 03 01 07 00 69 07 00 F4 07 00 FF 07 01 01 03 00 00 FF 00 01 00 05 07 00 03 07 00 83 01 03 01 00 01 07 00 B9 FF 00 01 00 02 07 00 03 07 00 83 00 01 07 00 95 FE 00 01 01 03 01 FF 00 01 00 0A 07 00 03 07 00 83 01 03 01 07 00 69 07 00 F4 07 00 FF 07 01 01 03 00 01 03 FF 00 01 00 06 07 00 03 07 00 83 01 03 01 07 00 69 00 01 07 00 F4 FF 00 01 00 05 07 00 03 07 00 83 01 03 01 00 02 07 00 B9 01 FC 00 01 07 00 69 FF 00 01 00 09 07 00 03 07 00 83 01 03 01 07 00 69 07 00 F4 07 00 FF 07 01 01 00 01 07 00 FF F8 00 01 01 FF 00 01 00 09 07 00 03 07 00 83 01 03 01 07 00 69 07 00 F4 07 00 FF 07 01 01 00 01 03 FF 00 01 00 06 07 00 03 07 00 83 01 03 01 07 00 69 00 01 07 00 E5 FF 00 01 00 02 07 00 03 07 00 83 00 01 07 00 8B 41 07 00 83 FE 00 01 01 03 01 FC 00 01 07 00 69 FE 00 01 07 00 F4 07 00 FF 07 01 01 FF 00 01 00 06 07 00 03 07 00 83 01 03 01 07 00 69 00 01 07 00 69 FF 00 01 00 07 07 00 03 07 00 83 01 03 01 07 00 69 07 00 F4 00 01 07 00 F4 F9 00 01 FF 00 01 00 02 07 00 03 07 00 83 00 01 07 00 16 43 05 44 07 00 16 47 05 47 07 00 23
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1430   1438   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1430   1438   1430   1438   Ljava/lang/IndexOutOfBoundsException;
        //  1446   1448   3      8      Any
        //  72     78     78     79     Any
        //  72     78     78     79     Any
        //  72     78     78     79     Any
        //  72     78     3      8      Ljava/lang/RuntimeException;
        //  72     78     3      8      Ljava/lang/ClassCastException;
        //  176    182    182    183    Any
        //  176    182    182    183    Ljava/lang/AssertionError;
        //  176    182    3      8      Any
        //  176    182    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  176    182    182    183    Ljava/lang/IllegalStateException;
        //  189    196    196    197    Any
        //  190    196    196    197    Any
        //  190    196    189    190    Any
        //  190    196    3      8      Any
        //  190    196    196    197    Ljava/lang/UnsupportedOperationException;
        //  204    211    211    212    Any
        //  205    211    204    205    Ljava/lang/NegativeArraySizeException;
        //  205    211    211    212    Ljava/lang/IllegalArgumentException;
        //  205    211    3      8      Any
        //  204    211    211    212    Any
        //  375    382    382    383    Any
        //  376    382    3      8      Ljava/lang/RuntimeException;
        //  376    382    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  376    382    382    383    Any
        //  375    382    375    376    Any
        //  513    520    520    521    Any
        //  513    520    520    521    Ljava/lang/RuntimeException;
        //  513    520    513    514    Any
        //  514    520    3      8      Any
        //  514    520    3      8      Ljava/lang/NegativeArraySizeException;
        //  575    582    582    583    Any
        //  575    582    582    583    Any
        //  575    582    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  576    582    582    583    Any
        //  576    582    575    576    Any
        //  718    724    724    725    Any
        //  718    724    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  718    724    724    725    Any
        //  718    724    724    725    Any
        //  718    724    3      8      Ljava/lang/NegativeArraySizeException;
        //  771    780    780    781    Any
        //  771    780    780    781    Any
        //  771    780    771    772    Any
        //  771    780    780    781    Ljava/util/NoSuchElementException;
        //  771    780    780    781    Any
        //  784    793    793    794    Any
        //  784    793    3      8      Any
        //  785    793    3      8      Ljava/lang/RuntimeException;
        //  785    793    784    785    Any
        //  784    793    3      8      Any
        //  844    852    852    853    Any
        //  844    852    3      8      Any
        //  844    852    852    853    Any
        //  844    852    3      8      Any
        //  844    852    852    853    Ljava/lang/NegativeArraySizeException;
        //  904    912    912    913    Any
        //  904    912    3      8      Any
        //  904    912    3      8      Ljava/lang/IllegalArgumentException;
        //  904    912    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  904    912    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1078   1084   1084   1085   Any
        //  1078   1084   3      8      Ljava/util/ConcurrentModificationException;
        //  1078   1084   1084   1085   Ljava/lang/AssertionError;
        //  1078   1084   1084   1085   Ljava/lang/EnumConstantNotPresentException;
        //  1078   1084   3      8      Ljava/lang/UnsupportedOperationException;
        //  1370   1377   1377   1378   Any
        //  1371   1377   1377   1378   Ljava/lang/IllegalStateException;
        //  1370   1377   1370   1371   Ljava/lang/NumberFormatException;
        //  1370   1377   3      8      Any
        //  1371   1377   3      8      Ljava/lang/IndexOutOfBoundsException;
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
    
    static {
        throw t;
    }
    
    @f06
    @LauncherEventHide
    public void c(final f39 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          555
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            547
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            539
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: aload_1        
        //    26: goto            30
        //    29: athrow         
        //    30: invokevirtual   dev/nuker/pyro/f39.0:()Lnet/minecraft/util/math/BlockPos;
        //    33: goto            37
        //    36: athrow         
        //    37: getstatic       dev/nuker/pyro/fc.c:I
        //    40: ifge            49
        //    43: ldc_w           -199748439
        //    46: goto            52
        //    49: ldc_w           -1652840615
        //    52: ldc_w           1120928150
        //    55: ixor           
        //    56: lookupswitch {
        //          -1782259664: 49
        //          -1228401345: 512
        //          default: 84
        //        }
        //    84: goto            88
        //    87: athrow         
        //    88: invokevirtual   dev/nuker/pyro/f6i.c:(Lnet/minecraft/util/math/BlockPos;)I
        //    91: goto            95
        //    94: athrow         
        //    95: istore_2       
        //    96: getstatic       dev/nuker/pyro/fc.1:I
        //    99: ifeq            108
        //   102: ldc_w           607894965
        //   105: goto            111
        //   108: ldc_w           -548983508
        //   111: ldc_w           -1677416767
        //   114: ixor           
        //   115: lookupswitch {
        //          -1203823756: 108
        //          1128500205: 140
        //          default: 522
        //        }
        //   140: iload_2        
        //   141: iconst_m1      
        //   142: if_icmpeq       511
        //   145: getstatic       dev/nuker/pyro/fc.0:I
        //   148: ifeq            157
        //   151: ldc_w           -1450924138
        //   154: goto            160
        //   157: ldc_w           -784499064
        //   160: ldc_w           848780216
        //   163: ixor           
        //   164: lookupswitch {
        //          -1693189074: 157
        //          -475388624: 192
        //          default: 524
        //        }
        //   192: aload_0        
        //   193: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   196: getstatic       dev/nuker/pyro/fc.1:I
        //   199: ifeq            208
        //   202: ldc_w           -1002995357
        //   205: goto            211
        //   208: ldc_w           -866711321
        //   211: ldc_w           1576584165
        //   214: ixor           
        //   215: lookupswitch {
        //          -1850750206: 240
        //          -1714470266: 208
        //          default: 526
        //        }
        //   240: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   243: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   246: getstatic       dev/nuker/pyro/fc.1:I
        //   249: ifeq            258
        //   252: ldc_w           -240661840
        //   255: goto            261
        //   258: ldc_w           211679571
        //   261: ldc_w           1155876890
        //   264: ixor           
        //   265: lookupswitch {
        //          -1253932374: 258
        //          1215869257: 292
        //          default: 528
        //        }
        //   292: getfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //   295: getstatic       dev/nuker/pyro/fc.0:I
        //   298: ifeq            307
        //   301: ldc_w           858346627
        //   304: goto            310
        //   307: ldc_w           -1283567140
        //   310: ldc_w           -304743529
        //   313: ixor           
        //   314: lookupswitch {
        //          -553865452: 516
        //          556611382: 307
        //          default: 340
        //        }
        //   340: iload_2        
        //   341: if_icmpeq       511
        //   344: getstatic       dev/nuker/pyro/fc.0:I
        //   347: ifeq            356
        //   350: ldc_w           -1296223961
        //   353: goto            359
        //   356: ldc_w           -1359292499
        //   359: ldc_w           1589012781
        //   362: ixor           
        //   363: lookupswitch {
        //          -334800886: 518
        //          1580706521: 356
        //          default: 388
        //        }
        //   388: aload_0        
        //   389: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   392: getstatic       dev/nuker/pyro/fc.1:I
        //   395: ifeq            404
        //   398: ldc_w           1599261316
        //   401: goto            407
        //   404: ldc_w           1719826467
        //   407: ldc_w           543214756
        //   410: ixor           
        //   411: lookupswitch {
        //          1189262471: 436
        //          2133984800: 404
        //          default: 520
        //        }
        //   436: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   439: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   442: iload_2        
        //   443: putfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //   446: aload_0        
        //   447: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   450: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   453: getstatic       dev/nuker/pyro/fc.0:I
        //   456: ifeq            465
        //   459: ldc_w           1548214097
        //   462: goto            468
        //   465: ldc_w           -1493149343
        //   468: ldc_w           -107986236
        //   471: ixor           
        //   472: lookupswitch {
        //          -1512596075: 465
        //          1586502565: 500
        //          default: 514
        //        }
        //   500: goto            504
        //   503: athrow         
        //   504: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78765_e:()V
        //   507: goto            511
        //   510: athrow         
        //   511: return         
        //   512: aconst_null    
        //   513: athrow         
        //   514: aconst_null    
        //   515: athrow         
        //   516: aconst_null    
        //   517: athrow         
        //   518: aconst_null    
        //   519: athrow         
        //   520: aconst_null    
        //   521: athrow         
        //   522: aconst_null    
        //   523: athrow         
        //   524: aconst_null    
        //   525: athrow         
        //   526: aconst_null    
        //   527: athrow         
        //   528: aconst_null    
        //   529: athrow         
        //   530: pop            
        //   531: goto            24
        //   534: pop            
        //   535: aconst_null    
        //   536: goto            530
        //   539: dup            
        //   540: ifnull          530
        //   543: checkcast       Ljava/lang/Throwable;
        //   546: athrow         
        //   547: dup            
        //   548: ifnull          534
        //   551: checkcast       Ljava/lang/Throwable;
        //   554: athrow         
        //   555: aconst_null    
        //   556: athrow         
        //    StackMapTable: 00 39 43 07 00 23 04 FF 00 0B 00 00 00 01 07 00 23 FD 00 03 07 00 03 07 01 3A 44 07 00 23 FF 00 00 00 02 07 00 03 07 01 3A 00 02 07 00 03 07 01 3A 45 07 00 23 FF 00 00 00 02 07 00 03 07 01 3A 00 02 07 00 03 07 00 67 FF 00 0B 00 02 07 00 03 07 01 3A 00 02 07 00 03 07 00 67 FF 00 02 00 02 07 00 03 07 01 3A 00 03 07 00 03 07 00 67 01 FF 00 1F 00 02 07 00 03 07 01 3A 00 02 07 00 03 07 00 67 42 07 00 10 FF 00 00 00 02 07 00 03 07 01 3A 00 02 07 00 03 07 00 67 45 07 00 23 40 01 FC 00 0C 01 42 01 1C 10 42 01 1F 4F 07 00 28 FF 00 02 00 03 07 00 03 07 01 3A 01 00 02 07 00 28 01 5C 07 00 28 51 07 00 B9 FF 00 02 00 03 07 00 03 07 01 3A 01 00 02 07 00 B9 01 5E 07 00 B9 4E 01 FF 00 02 00 03 07 00 03 07 01 3A 01 00 02 01 01 5D 01 0F 42 01 1C 4F 07 00 28 FF 00 02 00 03 07 00 03 07 01 3A 01 00 02 07 00 28 01 5C 07 00 28 5C 07 01 29 FF 00 02 00 03 07 00 03 07 01 3A 01 00 02 07 01 29 01 5F 07 01 29 42 07 00 23 40 07 01 29 45 07 00 23 00 FF 00 00 00 02 07 00 03 07 01 3A 00 02 07 00 03 07 00 67 FF 00 01 00 03 07 00 03 07 01 3A 01 00 01 07 01 29 41 01 01 41 07 00 28 01 01 41 07 00 28 41 07 00 B9 FF 00 01 00 02 07 00 03 07 01 3A 00 01 07 00 1A 43 05 44 07 00 1A 47 05 47 07 00 23
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     539    547    Ljava/util/NoSuchElementException;
        //  539    547    539    547    Ljava/lang/NullPointerException;
        //  555    557    3      8      Ljava/lang/UnsupportedOperationException;
        //  29     36     36     37     Any
        //  29     36     3      8      Ljava/lang/NullPointerException;
        //  29     36     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  29     36     3      8      Any
        //  29     36     29     30     Any
        //  87     94     94     95     Any
        //  87     94     3      8      Ljava/lang/IllegalStateException;
        //  88     94     3      8      Any
        //  87     94     3      8      Ljava/lang/NegativeArraySizeException;
        //  87     94     87     88     Ljava/util/NoSuchElementException;
        //  503    510    510    511    Any
        //  503    510    510    511    Any
        //  504    510    510    511    Any
        //  504    510    3      8      Any
        //  504    510    503    504    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 153 out of bounds for length 153
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
    
    public int c(final BlockPos blockPos) {
        return fbS.3V(this, 142918869, blockPos);
    }
    
    public f6i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u2230\u1486\u8b3c\ub3d6\uc98a\uec38\ub22b\ue709"
        //     4: getstatic       dev/nuker/pyro/fc.0:I
        //     7: ifeq            16
        //    10: ldc_w           460073562
        //    13: goto            19
        //    16: ldc_w           -89180226
        //    19: ldc_w           1613899425
        //    22: ixor           
        //    23: lookupswitch {
        //          -1700982497: 48
        //          2069761275: 16
        //          default: 244
        //        }
        //    48: invokestatic    invokestatic   !!! ERROR
        //    51: ldc_w           "\u2210\u1486\u8b3c\ub3d6\uc9aa\uec38\ub22b\ue709"
        //    54: invokestatic    invokestatic   !!! ERROR
        //    57: ldc_w           "\u2210\u1486\u8b3c\ub3d6\uc993\uec36\ub230\ue70c\ud96b\ue9ec\ua6fb\u1e40\ue038\uc5e7\u8179\u88bb\u57ad\u76d4\ubd3e\uc059\u2ac6\uc228\u6b88\u2d42\ud780\u3414\u7d3f\u8863\u8014\u8c8a\u8573\ufb37\u7104\u9a02\u1b98\uf0a2\u4973\u89ab\uca8a"
        //    60: invokestatic    invokestatic   !!! ERROR
        //    63: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    66: aload_0        
        //    67: new             Ldev/nuker/pyro/f0a;
        //    70: dup            
        //    71: ldc_w           "\u2234\u149d\u8b3c\ub3d0\uc98a\uec3e\ub221\ue716"
        //    74: getstatic       dev/nuker/pyro/fc.c:I
        //    77: ifge            86
        //    80: ldc_w           -1038654090
        //    83: goto            89
        //    86: ldc_w           1555309617
        //    89: ldc_w           326105830
        //    92: ixor           
        //    93: lookupswitch {
        //          -1850279880: 86
        //          -780623984: 248
        //          default: 120
        //        }
        //   120: invokestatic    invokestatic   !!! ERROR
        //   123: ldc_w           "\u2214\u149d\u8b3c\ub3d0\uc98a\uec3e\ub221\ue716"
        //   126: getstatic       dev/nuker/pyro/fc.0:I
        //   129: ifeq            138
        //   132: ldc_w           1448715344
        //   135: goto            141
        //   138: ldc_w           -1082587773
        //   141: ldc_w           295639334
        //   144: ixor           
        //   145: lookupswitch {
        //          -1360651099: 172
        //          1204206966: 138
        //          default: 250
        //        }
        //   172: invokestatic    invokestatic   !!! ERROR
        //   175: ldc_w           "\u2212\u149b\u8b27\ub3d6\uc98d\uec32\ub264\ue707\ud96d\ue9fe\ua6e3\u1e0c\ue032\uc5b0\u8165\u88be\u57a0\u7680\ubd2a\uc059\u2aca\uc237\u6bcd\u2d16\ud787\u345d\u7d3f\u887f\u8018\u8cc4\u8576\ufb72\u7112\u9a18\u1bcc\uf0bf\u4968\u89ad\uca83\uff69"
        //   178: invokestatic    invokestatic   !!! ERROR
        //   181: iconst_1       
        //   182: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   185: putfield        dev/nuker/pyro/f6i.c:Ldev/nuker/pyro/f0a;
        //   188: aload_0        
        //   189: aload_0        
        //   190: getstatic       dev/nuker/pyro/fc.1:I
        //   193: ifeq            202
        //   196: ldc_w           517392864
        //   199: goto            205
        //   202: ldc_w           -281037740
        //   205: ldc_w           -2069573482
        //   208: ixor           
        //   209: lookupswitch {
        //          -1703798410: 202
        //          1805345986: 236
        //          default: 246
        //        }
        //   236: getfield        dev/nuker/pyro/f6i.c:Ldev/nuker/pyro/f0a;
        //   239: invokevirtual   dev/nuker/pyro/f6i.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   242: pop            
        //   243: return         
        //   244: aconst_null    
        //   245: athrow         
        //   246: aconst_null    
        //   247: athrow         
        //   248: aconst_null    
        //   249: athrow         
        //   250: aconst_null    
        //   251: athrow         
        //    StackMapTable: 00 10 FF 00 10 00 01 06 00 02 06 07 01 8B FF 00 02 00 01 06 00 03 06 07 01 8B 01 FF 00 1C 00 01 06 00 02 06 07 01 8B FF 00 25 00 01 07 00 03 00 04 07 00 03 08 00 43 08 00 43 07 01 8B FF 00 02 00 01 07 00 03 00 05 07 00 03 08 00 43 08 00 43 07 01 8B 01 FF 00 1E 00 01 07 00 03 00 04 07 00 03 08 00 43 08 00 43 07 01 8B FF 00 11 00 01 07 00 03 00 05 07 00 03 08 00 43 08 00 43 07 01 8B 07 01 8B FF 00 02 00 01 07 00 03 00 06 07 00 03 08 00 43 08 00 43 07 01 8B 07 01 8B 01 FF 00 1E 00 01 07 00 03 00 05 07 00 03 08 00 43 08 00 43 07 01 8B 07 01 8B FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 07 00 01 06 00 02 06 07 01 8B FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 00 43 08 00 43 07 01 8B FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 43 08 00 43 07 01 8B 07 01 8B
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
    
    public boolean c(final Block p0, final BlockPos p1, final ItemStack p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          841
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            833
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            825
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            36
        //    30: ldc_w           -270497436
        //    33: goto            39
        //    36: ldc_w           335523698
        //    39: ldc_w           2020237060
        //    42: ixor           
        //    43: lookupswitch {
        //          -1752508832: 796
        //          1605869061: 36
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //    72: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //    75: aload_2        
        //    76: goto            80
        //    79: athrow         
        //    80: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //    83: goto            87
        //    86: athrow         
        //    87: astore          4
        //    89: aload           4
        //    91: getstatic       dev/nuker/pyro/fc.c:I
        //    94: ifge            103
        //    97: ldc_w           1477865025
        //   100: goto            106
        //   103: ldc_w           -1583405711
        //   106: ldc_w           1581378398
        //   109: ixor           
        //   110: lookupswitch {
        //          -2175441: 136
        //          106399007: 103
        //          default: 804
        //        }
        //   136: goto            140
        //   139: athrow         
        //   140: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   145: goto            149
        //   148: athrow         
        //   149: aload           4
        //   151: aload_0        
        //   152: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   155: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   158: getstatic       dev/nuker/pyro/fc.c:I
        //   161: ifge            170
        //   164: ldc_w           1768389413
        //   167: goto            173
        //   170: ldc_w           -1144367660
        //   173: ldc_w           191023741
        //   176: ixor           
        //   177: lookupswitch {
        //          -485288847: 170
        //          1644540248: 806
        //          default: 204
        //        }
        //   204: aload_2        
        //   205: goto            209
        //   208: athrow         
        //   209: invokevirtual   net/minecraft/block/Block.func_176221_a:(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   212: goto            216
        //   215: athrow         
        //   216: astore          4
        //   218: aload           4
        //   220: goto            224
        //   223: athrow         
        //   224: invokeinterface net/minecraft/block/state/IBlockState.func_185904_a:()Lnet/minecraft/block/material/Material;
        //   229: goto            233
        //   232: athrow         
        //   233: getstatic       dev/nuker/pyro/fc.0:I
        //   236: ifeq            245
        //   239: ldc_w           -1654370530
        //   242: goto            248
        //   245: ldc_w           -1729280312
        //   248: ldc_w           -774674662
        //   251: ixor           
        //   252: lookupswitch {
        //          1228808658: 280
        //          1287071748: 245
        //          default: 800
        //        }
        //   280: goto            284
        //   283: athrow         
        //   284: invokevirtual   net/minecraft/block/material/Material.func_76229_l:()Z
        //   287: goto            291
        //   290: athrow         
        //   291: ifeq            300
        //   294: ldc_w           -1898446209
        //   297: goto            303
        //   300: ldc_w           -1898446210
        //   303: ldc_w           -1925969323
        //   306: ixor           
        //   307: tableswitch {
        //          131600468: 328
        //          131600469: 330
        //          default: 294
        //        }
        //   328: iconst_1       
        //   329: ireturn        
        //   330: getstatic       dev/nuker/pyro/fc.1:I
        //   333: ifeq            342
        //   336: ldc_w           307409930
        //   339: goto            345
        //   342: ldc_w           313798435
        //   345: ldc_w           -153014077
        //   348: ixor           
        //   349: lookupswitch {
        //          -457997111: 808
        //          759884956: 342
        //          default: 376
        //        }
        //   376: aload_1        
        //   377: getstatic       dev/nuker/pyro/fc.1:I
        //   380: ifeq            389
        //   383: ldc_w           -1395912153
        //   386: goto            392
        //   389: ldc_w           28711024
        //   392: ldc_w           1550590724
        //   395: ixor           
        //   396: lookupswitch {
        //          -257937117: 389
        //          1574583156: 424
        //          default: 802
        //        }
        //   424: aload           4
        //   426: goto            430
        //   429: athrow         
        //   430: invokevirtual   net/minecraft/block/Block.getHarvestTool:(Lnet/minecraft/block/state/IBlockState;)Ljava/lang/String;
        //   433: goto            437
        //   436: athrow         
        //   437: astore          5
        //   439: aload_3        
        //   440: goto            444
        //   443: athrow         
        //   444: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //   447: goto            451
        //   450: athrow         
        //   451: ifne            459
        //   454: aload           5
        //   456: ifnonnull       569
        //   459: aload_0        
        //   460: getstatic       dev/nuker/pyro/fc.1:I
        //   463: ifeq            472
        //   466: ldc_w           331961826
        //   469: goto            475
        //   472: ldc_w           1993620781
        //   475: ldc_w           446281700
        //   478: ixor           
        //   479: lookupswitch {
        //          156295686: 812
        //          1410685875: 472
        //          default: 504
        //        }
        //   504: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   507: getstatic       dev/nuker/pyro/fc.0:I
        //   510: ifeq            519
        //   513: ldc_w           -760933228
        //   516: goto            522
        //   519: ldc_w           -520273984
        //   522: ldc_w           2018058731
        //   525: ixor           
        //   526: lookupswitch {
        //          -1733026261: 552
        //          -1427360385: 519
        //          default: 814
        //        }
        //   552: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   555: aload           4
        //   557: goto            561
        //   560: athrow         
        //   561: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184823_b:(Lnet/minecraft/block/state/IBlockState;)Z
        //   564: goto            568
        //   567: athrow         
        //   568: ireturn        
        //   569: aload_3        
        //   570: getstatic       dev/nuker/pyro/fc.0:I
        //   573: ifeq            582
        //   576: ldc_w           -521168130
        //   579: goto            585
        //   582: ldc_w           1133049607
        //   585: ldc_w           1519970342
        //   588: ixor           
        //   589: lookupswitch {
        //          -1166576936: 794
        //          949375799: 582
        //          default: 616
        //        }
        //   616: goto            620
        //   619: athrow         
        //   620: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   623: goto            627
        //   626: athrow         
        //   627: aload_3        
        //   628: aload           5
        //   630: aload_0        
        //   631: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   634: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   637: aload           4
        //   639: goto            643
        //   642: athrow         
        //   643: invokevirtual   net/minecraft/item/Item.getHarvestLevel:(Lnet/minecraft/item/ItemStack;Ljava/lang/String;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/block/state/IBlockState;)I
        //   646: goto            650
        //   649: athrow         
        //   650: istore          6
        //   652: getstatic       dev/nuker/pyro/fc.c:I
        //   655: ifge            664
        //   658: ldc_w           -317088018
        //   661: goto            667
        //   664: ldc_w           -649852444
        //   667: ldc_w           -687589759
        //   670: ixor           
        //   671: lookupswitch {
        //          239091557: 696
        //          975022191: 664
        //          default: 798
        //        }
        //   696: iload           6
        //   698: ifge            769
        //   701: getstatic       dev/nuker/pyro/fc.c:I
        //   704: ifge            713
        //   707: ldc_w           -1428981538
        //   710: goto            716
        //   713: ldc_w           37179428
        //   716: ldc_w           -931173525
        //   719: ixor           
        //   720: lookupswitch {
        //          -901235889: 748
        //          1655444405: 713
        //          default: 810
        //        }
        //   748: aload_0        
        //   749: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   752: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   755: aload           4
        //   757: goto            761
        //   760: athrow         
        //   761: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184823_b:(Lnet/minecraft/block/state/IBlockState;)Z
        //   764: goto            768
        //   767: athrow         
        //   768: ireturn        
        //   769: iload           6
        //   771: aload_1        
        //   772: aload           4
        //   774: goto            778
        //   777: athrow         
        //   778: invokevirtual   net/minecraft/block/Block.getHarvestLevel:(Lnet/minecraft/block/state/IBlockState;)I
        //   781: goto            785
        //   784: athrow         
        //   785: if_icmplt       792
        //   788: iconst_1       
        //   789: goto            793
        //   792: iconst_0       
        //   793: ireturn        
        //   794: aconst_null    
        //   795: athrow         
        //   796: aconst_null    
        //   797: athrow         
        //   798: aconst_null    
        //   799: athrow         
        //   800: aconst_null    
        //   801: athrow         
        //   802: aconst_null    
        //   803: athrow         
        //   804: aconst_null    
        //   805: athrow         
        //   806: aconst_null    
        //   807: athrow         
        //   808: aconst_null    
        //   809: athrow         
        //   810: aconst_null    
        //   811: athrow         
        //   812: aconst_null    
        //   813: athrow         
        //   814: aconst_null    
        //   815: athrow         
        //   816: pop            
        //   817: goto            24
        //   820: pop            
        //   821: aconst_null    
        //   822: goto            816
        //   825: dup            
        //   826: ifnull          816
        //   829: checkcast       Ljava/lang/Throwable;
        //   832: athrow         
        //   833: dup            
        //   834: ifnull          820
        //   837: checkcast       Ljava/lang/Throwable;
        //   840: athrow         
        //   841: aconst_null    
        //   842: athrow         
        //    StackMapTable: 00 6F FF 00 03 00 05 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 00 01 07 00 23 FA 00 04 FF 00 0B 00 00 00 01 07 00 23 FF 00 03 00 04 07 00 03 07 00 6B 07 00 67 07 00 69 00 00 0B 42 01 1C 4A 07 00 23 FF 00 00 00 04 07 00 03 07 00 6B 07 00 67 07 00 69 00 02 07 00 2E 07 00 67 45 07 00 23 40 07 00 37 FF 00 0F 00 05 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 00 01 07 00 37 FF 00 02 00 05 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 00 02 07 00 37 01 5D 07 00 37 42 07 00 18 40 07 00 37 47 07 00 23 40 07 00 6B FF 00 14 00 05 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 00 03 07 00 6B 07 00 37 07 00 2E FF 00 02 00 05 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 00 04 07 00 6B 07 00 37 07 00 2E 01 FF 00 1E 00 05 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 00 03 07 00 6B 07 00 37 07 00 2E 43 07 00 23 FF 00 00 00 05 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 00 04 07 00 6B 07 00 37 07 00 2E 07 00 67 45 07 00 23 40 07 00 37 46 07 00 23 40 07 00 37 47 07 00 23 40 07 01 A3 4B 07 01 A3 FF 00 02 00 05 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 00 02 07 01 A3 01 5F 07 01 A3 42 07 00 23 40 07 01 A3 45 07 00 23 40 01 02 05 42 01 18 01 0B 42 01 1E 4C 07 00 6B FF 00 02 00 05 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 00 02 07 00 6B 01 5F 07 00 6B 44 07 00 23 FF 00 00 00 05 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 00 02 07 00 6B 07 00 37 45 07 00 23 40 07 01 8B FF 00 05 00 00 00 01 07 00 23 FF 00 00 00 06 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 07 01 8B 00 01 07 00 69 45 07 00 23 40 01 07 4C 07 00 03 FF 00 02 00 06 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 07 01 8B 00 02 07 00 03 01 5C 07 00 03 4E 07 00 28 FF 00 02 00 06 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 07 01 8B 00 02 07 00 28 01 5D 07 00 28 47 07 00 16 FF 00 00 00 06 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 07 01 8B 00 02 07 00 AD 07 00 37 45 07 00 23 40 01 00 4C 07 00 69 FF 00 02 00 06 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 07 01 8B 00 02 07 00 69 01 5E 07 00 69 42 07 00 16 40 07 00 69 45 07 00 23 40 07 01 33 4E 07 00 1A FF 00 00 00 06 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 07 01 8B 00 05 07 01 33 07 00 69 07 01 8B 07 00 AD 07 00 37 45 07 00 23 40 01 FC 00 0D 01 42 01 1C 10 42 01 1F 4B 07 00 1A FF 00 00 00 07 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 07 01 8B 01 00 02 07 00 AD 07 00 37 45 07 00 23 40 01 00 47 07 00 23 FF 00 00 00 07 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 07 01 8B 01 00 03 01 07 00 6B 07 00 37 45 07 00 23 FF 00 00 00 07 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 07 01 8B 01 00 02 01 01 06 40 01 FF 00 00 00 06 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 07 01 8B 00 01 07 00 69 F9 00 01 FE 00 01 07 00 37 07 01 8B 01 FF 00 01 00 05 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 00 01 07 01 A3 41 07 00 6B 41 07 00 37 FF 00 01 00 05 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 00 03 07 00 6B 07 00 37 07 00 2E 01 FD 00 01 07 01 8B 01 FF 00 01 00 06 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 07 01 8B 00 01 07 00 03 41 07 00 28 FF 00 01 00 04 07 00 03 07 00 6B 07 00 67 07 00 69 00 01 07 00 23 43 05 44 07 00 23 47 05 FF 00 07 00 05 07 00 03 07 00 6B 07 00 67 07 00 69 07 00 37 00 01 07 00 23
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     825    833    Any
        //  825    833    825    833    Any
        //  841    843    3      8      Ljava/lang/ArithmeticException;
        //  79     86     86     87     Any
        //  79     86     79     80     Any
        //  79     86     79     80     Any
        //  80     86     86     87     Any
        //  80     86     86     87     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  139    148    148    149    Any
        //  140    148    3      8      Ljava/lang/IllegalStateException;
        //  140    148    139    140    Ljava/lang/UnsupportedOperationException;
        //  140    148    3      8      Ljava/lang/ClassCastException;
        //  140    148    148    149    Any
        //  208    215    215    216    Any
        //  208    215    3      8      Any
        //  209    215    208    209    Any
        //  209    215    215    216    Any
        //  208    215    3      8      Ljava/lang/NumberFormatException;
        //  223    232    232    233    Any
        //  223    232    232    233    Any
        //  223    232    223    224    Any
        //  224    232    223    224    Ljava/lang/NegativeArraySizeException;
        //  224    232    232    233    Ljava/lang/NumberFormatException;
        //  283    290    290    291    Any
        //  284    290    283    284    Ljava/lang/NumberFormatException;
        //  284    290    283    284    Any
        //  284    290    283    284    Any
        //  283    290    290    291    Any
        //  429    436    436    437    Any
        //  430    436    429    430    Any
        //  429    436    3      8      Any
        //  429    436    429    430    Any
        //  429    436    429    430    Any
        //  444    450    450    451    Any
        //  444    450    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  444    450    450    451    Ljava/lang/AssertionError;
        //  444    450    450    451    Any
        //  444    450    450    451    Ljava/lang/IndexOutOfBoundsException;
        //  560    567    567    568    Any
        //  561    567    560    561    Ljava/lang/IndexOutOfBoundsException;
        //  560    567    567    568    Ljava/lang/IllegalStateException;
        //  560    567    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  560    567    567    568    Any
        //  619    626    626    627    Any
        //  620    626    3      8      Any
        //  619    626    3      8      Any
        //  620    626    3      8      Ljava/lang/UnsupportedOperationException;
        //  619    626    619    620    Ljava/lang/IndexOutOfBoundsException;
        //  642    649    649    650    Any
        //  643    649    642    643    Ljava/lang/NegativeArraySizeException;
        //  643    649    649    650    Any
        //  642    649    649    650    Any
        //  643    649    642    643    Ljava/lang/NullPointerException;
        //  760    767    767    768    Any
        //  761    767    767    768    Ljava/lang/NegativeArraySizeException;
        //  761    767    760    761    Ljava/lang/ClassCastException;
        //  761    767    767    768    Any
        //  761    767    760    761    Ljava/lang/ArithmeticException;
        //  777    784    784    785    Any
        //  777    784    784    785    Any
        //  778    784    777    778    Any
        //  778    784    784    785    Ljava/lang/ArithmeticException;
        //  778    784    3      8      Ljava/lang/IndexOutOfBoundsException;
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
    
    public float c(final IBlockState p0, final BlockPos p1, final ItemStack p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1484
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1476
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1468
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: aload_1        
        //    26: aload_3        
        //    27: goto            31
        //    30: athrow         
        //    31: invokevirtual   dev/nuker/pyro/f6i.c:(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/item/ItemStack;)F
        //    34: goto            38
        //    37: athrow         
        //    38: fstore          4
        //    40: fload           4
        //    42: fconst_1       
        //    43: fcmpl          
        //    44: ifle            274
        //    47: aload_0        
        //    48: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //    51: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    54: getstatic       dev/nuker/pyro/fc.c:I
        //    57: ifge            66
        //    60: ldc_w           1406677257
        //    63: goto            69
        //    66: ldc_w           -1942995437
        //    69: ldc_w           1165441568
        //    72: ixor           
        //    73: lookupswitch {
        //          -918092749: 100
        //          380570409: 66
        //          default: 1423
        //        }
        //   100: goto            104
        //   103: athrow         
        //   104: invokestatic    net/minecraft/enchantment/EnchantmentHelper.func_185293_e:(Lnet/minecraft/entity/EntityLivingBase;)I
        //   107: goto            111
        //   110: athrow         
        //   111: istore          5
        //   113: iload           5
        //   115: ifle            274
        //   118: aload_3        
        //   119: goto            123
        //   122: athrow         
        //   123: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //   126: goto            130
        //   129: athrow         
        //   130: ifne            139
        //   133: ldc_w           -1376689721
        //   136: goto            142
        //   139: ldc_w           -1376689728
        //   142: ldc_w           -220743724
        //   145: ixor           
        //   146: tableswitch {
        //          -1102205914: 168
        //          -1102205913: 274
        //          default: 133
        //        }
        //   168: fload           4
        //   170: getstatic       dev/nuker/pyro/fc.c:I
        //   173: ifge            182
        //   176: ldc_w           -1581007658
        //   179: goto            185
        //   182: ldc_w           2147090262
        //   185: ldc_w           1891565715
        //   188: ixor           
        //   189: lookupswitch {
        //          -780354491: 182
        //          256311237: 216
        //          default: 1457
        //        }
        //   216: iload           5
        //   218: iload           5
        //   220: imul           
        //   221: iconst_1       
        //   222: iadd           
        //   223: i2f            
        //   224: fadd           
        //   225: getstatic       dev/nuker/pyro/fc.c:I
        //   228: ifge            237
        //   231: ldc_w           -1724784714
        //   234: goto            240
        //   237: ldc_w           -1004719753
        //   240: ldc_w           -408246950
        //   243: ixor           
        //   244: lookupswitch {
        //          -888885035: 237
        //          2124118764: 1447
        //          default: 272
        //        }
        //   272: fstore          4
        //   274: getstatic       dev/nuker/pyro/fc.0:I
        //   277: ifeq            286
        //   280: ldc_w           508074710
        //   283: goto            289
        //   286: ldc_w           -1516719274
        //   289: ldc_w           -1452326343
        //   292: ixor           
        //   293: lookupswitch {
        //          -1385842073: 286
        //          -1222125329: 1435
        //          default: 320
        //        }
        //   320: aload_0        
        //   321: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   324: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   327: getstatic       dev/nuker/pyro/fc.c:I
        //   330: ifge            339
        //   333: ldc_w           -1998867453
        //   336: goto            342
        //   339: ldc_w           -689127798
        //   342: ldc_w           -2057342960
        //   345: ixor           
        //   346: lookupswitch {
        //          226804755: 339
        //          1404292762: 372
        //          default: 1429
        //        }
        //   372: getstatic       net/minecraft/init/MobEffects.field_76422_e:Lnet/minecraft/potion/Potion;
        //   375: goto            379
        //   378: athrow         
        //   379: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70644_a:(Lnet/minecraft/potion/Potion;)Z
        //   382: goto            386
        //   385: athrow         
        //   386: ifeq            395
        //   389: ldc_w           -319516923
        //   392: goto            398
        //   395: ldc_w           -319516924
        //   398: ldc_w           1909637611
        //   401: ixor           
        //   402: tableswitch {
        //          978099676: 424
        //          978099677: 562
        //          default: 389
        //        }
        //   424: fload           4
        //   426: fconst_1       
        //   427: aload_0        
        //   428: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   431: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   434: getstatic       dev/nuker/pyro/fc.1:I
        //   437: ifeq            446
        //   440: ldc_w           947275813
        //   443: goto            449
        //   446: ldc_w           -1491605180
        //   449: ldc_w           -128305103
        //   452: ixor           
        //   453: lookupswitch {
        //          -1070829548: 446
        //          1598935413: 480
        //          default: 1455
        //        }
        //   480: getstatic       net/minecraft/init/MobEffects.field_76422_e:Lnet/minecraft/potion/Potion;
        //   483: goto            487
        //   486: athrow         
        //   487: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70660_b:(Lnet/minecraft/potion/Potion;)Lnet/minecraft/potion/PotionEffect;
        //   490: goto            494
        //   493: athrow         
        //   494: getstatic       dev/nuker/pyro/fc.1:I
        //   497: ifeq            506
        //   500: ldc_w           -293471899
        //   503: goto            509
        //   506: ldc_w           810787891
        //   509: ldc_w           1549703573
        //   512: ixor           
        //   513: lookupswitch {
        //          -1293983504: 1443
        //          948534240: 506
        //          default: 540
        //        }
        //   540: goto            544
        //   543: athrow         
        //   544: invokevirtual   net/minecraft/potion/PotionEffect.func_76458_c:()I
        //   547: goto            551
        //   550: athrow         
        //   551: iconst_1       
        //   552: iadd           
        //   553: i2f            
        //   554: ldc_w           0.2
        //   557: fmul           
        //   558: fadd           
        //   559: fmul           
        //   560: fstore          4
        //   562: aload_0        
        //   563: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   566: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   569: getstatic       net/minecraft/init/MobEffects.field_76419_f:Lnet/minecraft/potion/Potion;
        //   572: getstatic       dev/nuker/pyro/fc.1:I
        //   575: ifeq            584
        //   578: ldc_w           -2058085596
        //   581: goto            587
        //   584: ldc_w           1811705284
        //   587: ldc_w           1252728782
        //   590: ixor           
        //   591: lookupswitch {
        //          -805370646: 1449
        //          1041909225: 584
        //          default: 616
        //        }
        //   616: goto            620
        //   619: athrow         
        //   620: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70644_a:(Lnet/minecraft/potion/Potion;)Z
        //   623: goto            627
        //   626: athrow         
        //   627: ifeq            911
        //   630: getstatic       dev/nuker/pyro/fc.c:I
        //   633: ifge            642
        //   636: ldc_w           -1171522696
        //   639: goto            645
        //   642: ldc_w           1831802420
        //   645: ldc_w           -2056270478
        //   648: ixor           
        //   649: lookupswitch {
        //          1061434890: 1437
        //          2099084881: 642
        //          default: 676
        //        }
        //   676: aload_0        
        //   677: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   680: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   683: getstatic       net/minecraft/init/MobEffects.field_76419_f:Lnet/minecraft/potion/Potion;
        //   686: goto            690
        //   689: athrow         
        //   690: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70660_b:(Lnet/minecraft/potion/Potion;)Lnet/minecraft/potion/PotionEffect;
        //   693: goto            697
        //   696: athrow         
        //   697: getstatic       dev/nuker/pyro/fc.c:I
        //   700: ifge            709
        //   703: ldc_w           1127839836
        //   706: goto            712
        //   709: ldc_w           876803012
        //   712: ldc_w           -1991078906
        //   715: ixor           
        //   716: lookupswitch {
        //          -1122992190: 744
        //          -898894758: 709
        //          default: 1453
        //        }
        //   744: goto            748
        //   747: athrow         
        //   748: invokevirtual   net/minecraft/potion/PotionEffect.func_76458_c:()I
        //   751: goto            755
        //   754: athrow         
        //   755: tableswitch {
        //                0: 784
        //                1: 792
        //                2: 845
        //                3: 853
        //          default: 853
        //        }
        //   784: ldc_w           0.3
        //   787: fstore          5
        //   789: goto            858
        //   792: ldc_w           0.09
        //   795: getstatic       dev/nuker/pyro/fc.1:I
        //   798: ifeq            807
        //   801: ldc_w           -586514317
        //   804: goto            810
        //   807: ldc_w           255178397
        //   810: ldc_w           466240830
        //   813: ixor           
        //   814: lookupswitch {
        //          -1807346787: 807
        //          -960445107: 1445
        //          default: 840
        //        }
        //   840: fstore          5
        //   842: goto            858
        //   845: ldc_w           0.0027
        //   848: fstore          5
        //   850: goto            858
        //   853: ldc_w           8.1E-4
        //   856: fstore          5
        //   858: getstatic       dev/nuker/pyro/fc.1:I
        //   861: ifeq            870
        //   864: ldc_w           -2054587401
        //   867: goto            873
        //   870: ldc_w           1160720967
        //   873: ldc_w           -986930859
        //   876: ixor           
        //   877: lookupswitch {
        //          -2147249390: 904
        //          1084611234: 870
        //          default: 1427
        //        }
        //   904: fload           4
        //   906: fload           5
        //   908: fmul           
        //   909: fstore          4
        //   911: aload_0        
        //   912: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   915: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   918: getstatic       net/minecraft/block/material/Material.field_151586_h:Lnet/minecraft/block/material/Material;
        //   921: goto            925
        //   924: athrow         
        //   925: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70055_a:(Lnet/minecraft/block/material/Material;)Z
        //   928: goto            932
        //   931: athrow         
        //   932: ifeq            1054
        //   935: aload_0        
        //   936: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //   939: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   942: getstatic       dev/nuker/pyro/fc.1:I
        //   945: ifeq            954
        //   948: ldc_w           -1443965022
        //   951: goto            957
        //   954: ldc_w           -1162441866
        //   957: ldc_w           -1038192287
        //   960: ixor           
        //   961: lookupswitch {
        //          1810933443: 1431
        //          1813223549: 954
        //          default: 988
        //        }
        //   988: goto            992
        //   991: athrow         
        //   992: invokestatic    net/minecraft/enchantment/EnchantmentHelper.func_185287_i:(Lnet/minecraft/entity/EntityLivingBase;)Z
        //   995: goto            999
        //   998: athrow         
        //   999: ifne            1054
        //  1002: fload           4
        //  1004: ldc_w           5.0
        //  1007: fdiv           
        //  1008: getstatic       dev/nuker/pyro/fc.c:I
        //  1011: ifge            1020
        //  1014: ldc_w           -63657242
        //  1017: goto            1023
        //  1020: ldc_w           576234860
        //  1023: ldc_w           -267649651
        //  1026: ixor           
        //  1027: lookupswitch {
        //          -766289695: 1052
        //          205477739: 1020
        //          default: 1441
        //        }
        //  1052: fstore          4
        //  1054: aload_0        
        //  1055: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //  1058: getstatic       dev/nuker/pyro/fc.c:I
        //  1061: ifge            1070
        //  1064: ldc_w           1020546965
        //  1067: goto            1073
        //  1070: ldc_w           -17301680
        //  1073: ldc_w           -719734767
        //  1076: ixor           
        //  1077: lookupswitch {
        //          -372377724: 1070
        //          737036097: 1104
        //          default: 1439
        //        }
        //  1104: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1107: getstatic       dev/nuker/pyro/fc.c:I
        //  1110: ifge            1119
        //  1113: ldc_w           731579831
        //  1116: goto            1122
        //  1119: ldc_w           530359807
        //  1122: ldc_w           -574248270
        //  1125: ixor           
        //  1126: lookupswitch {
        //          -1034350771: 1152
        //          -161566971: 1119
        //          default: 1419
        //        }
        //  1152: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70122_E:Z
        //  1155: ifne            1212
        //  1158: getstatic       dev/nuker/pyro/fc.0:I
        //  1161: ifeq            1170
        //  1164: ldc_w           -2130083730
        //  1167: goto            1173
        //  1170: ldc_w           -2046439948
        //  1173: ldc_w           -862247990
        //  1176: ixor           
        //  1177: lookupswitch {
        //          1251929662: 1204
        //          1301455780: 1170
        //          default: 1421
        //        }
        //  1204: fload           4
        //  1206: ldc_w           5.0
        //  1209: fdiv           
        //  1210: fstore          4
        //  1212: getstatic       dev/nuker/pyro/fc.1:I
        //  1215: ifeq            1224
        //  1218: ldc_w           575031765
        //  1221: goto            1227
        //  1224: ldc_w           2062471679
        //  1227: ldc_w           1229417726
        //  1230: ixor           
        //  1231: lookupswitch {
        //          -1380450343: 1224
        //          1795237163: 1433
        //          default: 1256
        //        }
        //  1256: aload_0        
        //  1257: getfield        dev/nuker/pyro/f6i.c:Lnet/minecraft/client/Minecraft;
        //  1260: getstatic       dev/nuker/pyro/fc.0:I
        //  1263: ifeq            1272
        //  1266: ldc_w           -817738658
        //  1269: goto            1275
        //  1272: ldc_w           -1036222011
        //  1275: ldc_w           -49348557
        //  1278: ixor           
        //  1279: lookupswitch {
        //          320963159: 1272
        //          843926637: 1451
        //          default: 1304
        //        }
        //  1304: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1307: aload_1        
        //  1308: getstatic       dev/nuker/pyro/fc.1:I
        //  1311: ifeq            1320
        //  1314: ldc_w           -597475747
        //  1317: goto            1323
        //  1320: ldc_w           -1504747145
        //  1323: ldc_w           928533687
        //  1326: ixor           
        //  1327: lookupswitch {
        //          -348425494: 1425
        //          1803072116: 1320
        //          default: 1352
        //        }
        //  1352: fload           4
        //  1354: aload_2        
        //  1355: goto            1359
        //  1358: athrow         
        //  1359: invokestatic    net/minecraftforge/event/ForgeEventFactory.getBreakSpeed:(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/block/state/IBlockState;FLnet/minecraft/util/math/BlockPos;)F
        //  1362: goto            1366
        //  1365: athrow         
        //  1366: fstore          4
        //  1368: fload           4
        //  1370: fconst_0       
        //  1371: fcmpg          
        //  1372: ifge            1381
        //  1375: ldc_w           2143325582
        //  1378: goto            1384
        //  1381: ldc_w           2143325581
        //  1384: ldc_w           -505523337
        //  1387: ixor           
        //  1388: tableswitch {
        //          1010679282: 1412
        //          1010679283: 1416
        //          default: 1375
        //        }
        //  1412: fconst_0       
        //  1413: goto            1418
        //  1416: fload           4
        //  1418: freturn        
        //  1419: aconst_null    
        //  1420: athrow         
        //  1421: aconst_null    
        //  1422: athrow         
        //  1423: aconst_null    
        //  1424: athrow         
        //  1425: aconst_null    
        //  1426: athrow         
        //  1427: aconst_null    
        //  1428: athrow         
        //  1429: aconst_null    
        //  1430: athrow         
        //  1431: aconst_null    
        //  1432: athrow         
        //  1433: aconst_null    
        //  1434: athrow         
        //  1435: aconst_null    
        //  1436: athrow         
        //  1437: aconst_null    
        //  1438: athrow         
        //  1439: aconst_null    
        //  1440: athrow         
        //  1441: aconst_null    
        //  1442: athrow         
        //  1443: aconst_null    
        //  1444: athrow         
        //  1445: aconst_null    
        //  1446: athrow         
        //  1447: aconst_null    
        //  1448: athrow         
        //  1449: aconst_null    
        //  1450: athrow         
        //  1451: aconst_null    
        //  1452: athrow         
        //  1453: aconst_null    
        //  1454: athrow         
        //  1455: aconst_null    
        //  1456: athrow         
        //  1457: aconst_null    
        //  1458: athrow         
        //  1459: pop            
        //  1460: goto            24
        //  1463: pop            
        //  1464: aconst_null    
        //  1465: goto            1459
        //  1468: dup            
        //  1469: ifnull          1459
        //  1472: checkcast       Ljava/lang/Throwable;
        //  1475: athrow         
        //  1476: dup            
        //  1477: ifnull          1463
        //  1480: checkcast       Ljava/lang/Throwable;
        //  1483: athrow         
        //  1484: aconst_null    
        //  1485: athrow         
        //    StackMapTable: 00 A1 43 07 00 23 04 FF 00 0B 00 00 00 01 07 00 23 FF 00 03 00 04 07 00 03 07 00 37 07 00 67 07 00 69 00 00 45 07 00 23 FF 00 00 00 04 07 00 03 07 00 37 07 00 67 07 00 69 00 03 07 00 03 07 00 37 07 00 69 45 07 00 23 40 02 FF 00 1B 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 01 07 00 AD FF 00 02 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 00 AD 01 5E 07 00 AD 42 07 00 0A 40 07 00 AD 45 07 00 23 40 01 FF 00 0A 00 06 07 00 03 07 00 37 07 00 67 07 00 69 02 01 00 01 07 00 1A 40 07 00 69 45 07 00 23 40 01 02 05 42 01 19 4D 02 FF 00 02 00 06 07 00 03 07 00 37 07 00 67 07 00 69 02 01 00 02 02 01 5E 02 54 02 FF 00 02 00 06 07 00 03 07 00 37 07 00 67 07 00 69 02 01 00 02 02 01 5F 02 FA 00 01 0B 42 01 1E 52 07 00 AD FF 00 02 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 00 AD 01 5D 07 00 AD 45 07 00 1A FF 00 00 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 00 AD 07 02 50 45 07 00 23 40 01 02 05 42 01 19 FF 00 15 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 03 02 02 07 00 AD FF 00 02 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 04 02 02 07 00 AD 01 FF 00 1E 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 03 02 02 07 00 AD FF 00 05 00 00 00 01 07 00 23 FF 00 00 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 04 02 02 07 00 AD 07 02 50 45 07 00 23 FF 00 00 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 03 02 02 07 02 01 FF 00 0B 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 03 02 02 07 02 01 FF 00 02 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 04 02 02 07 02 01 01 FF 00 1E 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 03 02 02 07 02 01 42 07 00 23 FF 00 00 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 03 02 02 07 02 01 45 07 00 23 FF 00 00 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 03 02 02 01 0A FF 00 15 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 00 AD 07 02 50 FF 00 02 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 03 07 00 AD 07 02 50 01 FF 00 1C 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 00 AD 07 02 50 42 07 00 23 FF 00 00 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 00 AD 07 02 50 45 07 00 23 40 01 0E 42 01 1E 4C 07 00 23 FF 00 00 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 00 AD 07 02 50 45 07 00 23 40 07 02 01 4B 07 02 01 FF 00 02 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 02 01 01 5F 07 02 01 42 07 00 0A 40 07 02 01 45 07 00 23 40 01 1C 07 4E 02 FF 00 02 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 02 01 5D 02 04 07 FC 00 04 02 0B 42 01 1E FA 00 06 4C 07 01 8D FF 00 00 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 00 AD 07 01 A3 45 07 00 23 40 01 55 07 00 AD FF 00 02 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 00 AD 01 5E 07 00 AD 42 07 00 0A 40 07 00 AD 45 07 00 23 40 01 54 02 FF 00 02 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 02 01 5C 02 01 4F 07 00 28 FF 00 02 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 00 28 01 5E 07 00 28 4E 07 00 AD FF 00 02 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 00 AD 01 5D 07 00 AD 11 42 01 1E 07 0B 42 01 1C 4F 07 00 28 FF 00 02 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 00 28 01 5C 07 00 28 FF 00 0F 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 00 AD 07 00 37 FF 00 02 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 03 07 00 AD 07 00 37 01 FF 00 1C 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 00 AD 07 00 37 45 07 00 23 FF 00 00 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 04 07 00 AD 07 00 37 02 07 00 67 45 07 00 23 40 02 08 05 42 01 1B 03 41 02 40 07 00 AD 01 41 07 00 AD FF 00 01 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 00 AD 07 00 37 FC 00 01 02 FF 00 01 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 01 07 00 AD 41 07 00 AD 01 01 01 41 07 00 28 41 02 FF 00 01 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 03 02 02 07 02 01 41 02 FF 00 01 00 06 07 00 03 07 00 37 07 00 67 07 00 69 02 01 00 01 02 FF 00 01 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 02 07 00 AD 07 02 50 41 07 00 28 41 07 02 01 FF 00 01 00 05 07 00 03 07 00 37 07 00 67 07 00 69 02 00 03 02 02 07 00 AD FF 00 01 00 06 07 00 03 07 00 37 07 00 67 07 00 69 02 01 00 01 02 FF 00 01 00 04 07 00 03 07 00 37 07 00 67 07 00 69 00 01 07 00 23 43 05 44 07 00 23 47 05 47 07 00 23
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1468   1476   Ljava/lang/RuntimeException;
        //  1468   1476   1468   1476   Any
        //  1484   1486   3      8      Any
        //  30     37     37     38     Any
        //  30     37     30     31     Any
        //  31     37     3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  31     37     3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  30     37     30     31     Any
        //  103    110    110    111    Any
        //  104    110    110    111    Ljava/lang/EnumConstantNotPresentException;
        //  104    110    110    111    Ljava/util/NoSuchElementException;
        //  104    110    103    104    Ljava/lang/ArithmeticException;
        //  104    110    110    111    Ljava/util/ConcurrentModificationException;
        //  122    129    129    130    Any
        //  122    129    122    123    Ljava/util/ConcurrentModificationException;
        //  122    129    129    130    Any
        //  122    129    122    123    Ljava/lang/RuntimeException;
        //  123    129    3      8      Any
        //  378    385    385    386    Any
        //  378    385    378    379    Ljava/lang/EnumConstantNotPresentException;
        //  378    385    3      8      Any
        //  378    385    378    379    Ljava/lang/NegativeArraySizeException;
        //  378    385    3      8      Ljava/lang/IllegalStateException;
        //  487    493    493    494    Any
        //  487    493    493    494    Any
        //  487    493    3      8      Any
        //  487    493    493    494    Ljava/util/NoSuchElementException;
        //  487    493    3      8      Ljava/lang/NegativeArraySizeException;
        //  543    550    550    551    Any
        //  544    550    3      8      Any
        //  543    550    543    544    Any
        //  544    550    550    551    Ljava/lang/StringIndexOutOfBoundsException;
        //  543    550    550    551    Ljava/lang/IllegalArgumentException;
        //  619    626    626    627    Any
        //  620    626    619    620    Ljava/util/ConcurrentModificationException;
        //  619    626    619    620    Any
        //  619    626    626    627    Ljava/lang/ClassCastException;
        //  620    626    626    627    Any
        //  689    696    696    697    Any
        //  690    696    3      8      Ljava/lang/UnsupportedOperationException;
        //  690    696    696    697    Ljava/lang/UnsupportedOperationException;
        //  690    696    689    690    Any
        //  690    696    3      8      Any
        //  747    754    754    755    Any
        //  747    754    747    748    Ljava/lang/ArithmeticException;
        //  747    754    754    755    Ljava/lang/ArithmeticException;
        //  747    754    754    755    Any
        //  748    754    754    755    Any
        //  924    931    931    932    Any
        //  925    931    931    932    Any
        //  925    931    924    925    Ljava/lang/StringIndexOutOfBoundsException;
        //  925    931    3      8      Ljava/lang/RuntimeException;
        //  924    931    3      8      Ljava/lang/IllegalStateException;
        //  991    998    998    999    Any
        //  991    998    998    999    Any
        //  991    998    991    992    Ljava/lang/ArithmeticException;
        //  992    998    3      8      Any
        //  992    998    998    999    Any
        //  1358   1365   1365   1366   Any
        //  1359   1365   1358   1359   Any
        //  1359   1365   3      8      Any
        //  1358   1365   1365   1366   Any
        //  1358   1365   1358   1359   Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:577)
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
