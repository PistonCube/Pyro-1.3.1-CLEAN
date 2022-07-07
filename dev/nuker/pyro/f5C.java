// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.math.BlockPos;

public class f5c extends fH
{
    public f0d c;
    
    public void 0(final BlockPos p0, final EntityPlayerSP p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          423
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            415
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            407
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //    28: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    31: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //    34: new             Lnet/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock;
        //    37: dup            
        //    38: aload_1        
        //    39: getstatic       net/minecraft/util/EnumFacing.UP:Lnet/minecraft/util/EnumFacing;
        //    42: aload_0        
        //    43: getstatic       dev/nuker/pyro/fc.c:I
        //    46: ifge            54
        //    49: ldc             -1161630636
        //    51: goto            56
        //    54: ldc             -1256011213
        //    56: ldc             -1944529846
        //    58: ixor           
        //    59: lookupswitch {
        //          920270878: 394
        //          2029646758: 54
        //          default: 84
        //        }
        //    84: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //    87: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    90: goto            94
        //    93: athrow         
        //    94: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184592_cb:()Lnet/minecraft/item/ItemStack;
        //    97: goto            101
        //   100: athrow         
        //   101: getstatic       dev/nuker/pyro/fc.c:I
        //   104: ifge            112
        //   107: ldc             -2076712316
        //   109: goto            114
        //   112: ldc             -457684220
        //   114: ldc             -780290725
        //   116: ixor           
        //   117: lookupswitch {
        //          902168159: 144
        //          1430935519: 112
        //          default: 390
        //        }
        //   144: goto            148
        //   147: athrow         
        //   148: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   151: goto            155
        //   154: athrow         
        //   155: getstatic       net/minecraft/init/Items.field_151104_aV:Lnet/minecraft/item/Item;
        //   158: if_acmpne       210
        //   161: getstatic       dev/nuker/pyro/fc.0:I
        //   164: ifeq            172
        //   167: ldc             1691671716
        //   169: goto            174
        //   172: ldc             1058466272
        //   174: ldc             855730603
        //   176: ixor           
        //   177: lookupswitch {
        //          202866763: 204
        //          1473623311: 172
        //          default: 386
        //        }
        //   204: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //   207: goto            255
        //   210: getstatic       dev/nuker/pyro/fc.1:I
        //   213: ifeq            221
        //   216: ldc             1827432493
        //   218: goto            223
        //   221: ldc             385063247
        //   223: ldc             -2131165446
        //   225: ixor           
        //   226: lookupswitch {
        //          -1777637451: 252
        //          -334194985: 221
        //          default: 396
        //        }
        //   252: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //   255: fconst_0       
        //   256: fconst_0       
        //   257: fconst_0       
        //   258: goto            262
        //   261: athrow         
        //   262: invokespecial   net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumHand;FFF)V
        //   265: goto            269
        //   268: athrow         
        //   269: goto            273
        //   272: athrow         
        //   273: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   276: goto            280
        //   279: athrow         
        //   280: aload_0        
        //   281: getstatic       dev/nuker/pyro/fc.c:I
        //   284: ifge            292
        //   287: ldc             -1335025903
        //   289: goto            294
        //   292: ldc             425583226
        //   294: ldc             -1362754583
        //   296: ixor           
        //   297: lookupswitch {
        //          -1214520941: 324
        //          514530552: 292
        //          default: 388
        //        }
        //   324: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   327: getstatic       dev/nuker/pyro/fc.0:I
        //   330: ifeq            338
        //   333: ldc             -599114636
        //   335: goto            340
        //   338: ldc             655305527
        //   340: ldc             -1796257863
        //   342: ixor           
        //   343: lookupswitch {
        //          -1277137778: 368
        //          1218804685: 338
        //          default: 392
        //        }
        //   368: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   371: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //   374: goto            378
        //   377: athrow         
        //   378: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184609_a:(Lnet/minecraft/util/EnumHand;)V
        //   381: goto            385
        //   384: athrow         
        //   385: return         
        //   386: aconst_null    
        //   387: athrow         
        //   388: aconst_null    
        //   389: athrow         
        //   390: aconst_null    
        //   391: athrow         
        //   392: aconst_null    
        //   393: athrow         
        //   394: aconst_null    
        //   395: athrow         
        //   396: aconst_null    
        //   397: athrow         
        //   398: pop            
        //   399: goto            24
        //   402: pop            
        //   403: aconst_null    
        //   404: goto            398
        //   407: dup            
        //   408: ifnull          398
        //   411: checkcast       Ljava/lang/Throwable;
        //   414: athrow         
        //   415: dup            
        //   416: ifnull          402
        //   419: checkcast       Ljava/lang/Throwable;
        //   422: athrow         
        //   423: aconst_null    
        //   424: athrow         
        //    StackMapTable: 00 37 43 07 00 1D 04 FF 00 0B 00 00 00 01 07 00 1D FE 00 03 07 00 03 07 00 73 07 00 28 FF 00 1D 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 03 FF 00 01 00 03 07 00 03 07 00 73 07 00 28 00 07 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 03 01 FF 00 1B 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 03 48 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 28 45 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 42 FF 00 0A 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 42 FF 00 01 00 03 07 00 03 07 00 73 07 00 28 00 07 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 42 01 FF 00 1D 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 42 42 07 00 75 FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 42 45 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 77 FF 00 10 00 03 07 00 03 07 00 73 07 00 28 00 05 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 FF 00 01 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 01 FF 00 1D 00 03 07 00 03 07 00 73 07 00 28 00 05 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 FF 00 05 00 03 07 00 03 07 00 73 07 00 28 00 05 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 FF 00 0A 00 03 07 00 03 07 00 73 07 00 28 00 05 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 FF 00 01 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 01 FF 00 1C 00 03 07 00 03 07 00 73 07 00 28 00 05 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 FF 00 02 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 53 45 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 09 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 53 02 02 02 45 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 02 07 00 63 07 00 2E 42 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 02 07 00 63 07 00 2E 45 07 00 1D 00 4B 07 00 03 FF 00 01 00 03 07 00 03 07 00 73 07 00 28 00 02 07 00 03 01 5D 07 00 03 4D 07 00 22 FF 00 01 00 03 07 00 03 07 00 73 07 00 28 00 02 07 00 22 01 5B 07 00 22 48 07 00 0F FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 02 07 00 28 07 00 53 45 07 00 1D 00 FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 05 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 41 07 00 03 FF 00 01 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 42 41 07 00 22 FF 00 01 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 03 FF 00 01 00 03 07 00 03 07 00 73 07 00 28 00 05 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 41 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     407    415    Ljava/lang/NegativeArraySizeException;
        //  407    415    407    415    Any
        //  423    425    3      8      Ljava/lang/IllegalStateException;
        //  93     100    100    101    Any
        //  93     100    3      8      Any
        //  93     100    3      8      Any
        //  93     100    93     94     Any
        //  94     100    3      8      Any
        //  147    154    154    155    Any
        //  148    154    154    155    Ljava/lang/StringIndexOutOfBoundsException;
        //  148    154    147    148    Ljava/lang/EnumConstantNotPresentException;
        //  148    154    147    148    Ljava/lang/ArithmeticException;
        //  147    154    154    155    Any
        //  261    268    268    269    Any
        //  261    268    261    262    Any
        //  262    268    261    262    Any
        //  261    268    268    269    Any
        //  261    268    261    262    Ljava/lang/AssertionError;
        //  272    279    279    280    Any
        //  272    279    272    273    Any
        //  272    279    272    273    Any
        //  272    279    3      8      Any
        //  272    279    272    273    Any
        //  377    384    384    385    Any
        //  377    384    3      8      Ljava/lang/IllegalStateException;
        //  378    384    384    385    Any
        //  377    384    377    378    Ljava/lang/StringIndexOutOfBoundsException;
        //  378    384    3      8      Ljava/lang/IllegalStateException;
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
    
    public f5c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u23dd\u1486\u8ad9\ub3d6\uc9b1\ueddf\ub220\ue6e2\ud967\ue9cd\ua718"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u23fd\u1486\u8ad9\ub3d6\uc991\ueddf\ub220\ue6c2\ud967\ue9cd\ua718"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: ldc             "\u23fd\u1486\u8ad9\ub3d6\uc9be\ueddb\ub230\ue6e9\ud96b\ue9c1\ua716\u1e40\ue1dd\uc5e7\u8157\u894d\u57a5\u7726\ubd38\uc06f\u2b6e\uc23a\u6a23\u2d52\ud7e2\u35bd\u7d2e\u899d\u8005\u8cf5\u8493\ufb2b\u70e1\u9a56\u1bf7\uf15e\u4978\u8852\ucac6\uff56\ub6f0\u41b3\ub9d1\ub346\u4c00\u8ac4\u7c60\uce00\u7d5d"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    19: aload_0        
        //    20: new             Ldev/nuker/pyro/f0d;
        //    23: dup            
        //    24: ldc             "\u23ce\u1492\u8ac3\ub3de\uc9b6"
        //    26: invokestatic    invokestatic   !!! ERROR
        //    29: ldc             "\u23ee\u1492\u8ac3\ub3de\uc9b6"
        //    31: invokestatic    invokestatic   !!! ERROR
        //    34: aconst_null    
        //    35: ldc2_w          6.0
        //    38: dconst_1       
        //    39: ldc2_w          6.0
        //    42: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //    45: putfield        dev/nuker/pyro/f5c.c:Ldev/nuker/pyro/f0d;
        //    48: getstatic       dev/nuker/pyro/fc.1:I
        //    51: ifeq            59
        //    54: ldc             -913962056
        //    56: goto            61
        //    59: ldc             -333529422
        //    61: ldc             1553470427
        //    63: ixor           
        //    64: lookupswitch {
        //          -1793189789: 229
        //          2093195383: 59
        //          default: 92
        //        }
        //    92: aload_0        
        //    93: getstatic       dev/nuker/pyro/fc.1:I
        //    96: ifeq            104
        //    99: ldc             -1047302542
        //   101: goto            106
        //   104: ldc             -1817227934
        //   106: ldc             -2083895384
        //   108: ixor           
        //   109: lookupswitch {
        //          -519988404: 104
        //          1113139674: 231
        //          default: 136
        //        }
        //   136: aload_0        
        //   137: getstatic       dev/nuker/pyro/fc.1:I
        //   140: ifeq            148
        //   143: ldc             1774639143
        //   145: goto            150
        //   148: ldc             -590114515
        //   150: ldc             1720019315
        //   152: ixor           
        //   153: lookupswitch {
        //          -1168705442: 180
        //          256094548: 148
        //          default: 235
        //        }
        //   180: getfield        dev/nuker/pyro/f5c.c:Ldev/nuker/pyro/f0d;
        //   183: getstatic       dev/nuker/pyro/fc.c:I
        //   186: ifge            194
        //   189: ldc             366887788
        //   191: goto            196
        //   194: ldc             -652627291
        //   196: ldc             77084157
        //   198: ixor           
        //   199: lookupswitch {
        //          289830545: 233
        //          307401650: 194
        //          default: 224
        //        }
        //   224: invokevirtual   dev/nuker/pyro/f5c.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   227: pop            
        //   228: return         
        //   229: aconst_null    
        //   230: athrow         
        //   231: aconst_null    
        //   232: athrow         
        //   233: aconst_null    
        //   234: athrow         
        //   235: aconst_null    
        //   236: athrow         
        //    StackMapTable: 00 10 FF 00 3B 00 01 07 00 03 00 00 41 01 1E 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 FF 00 0B 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 0D 00 01 07 00 03 00 02 07 00 03 07 00 88 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 88 01 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 88 04 41 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 88 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03
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
    
    static {
        throw t;
    }
    
    public EnumFacing c(final BlockPos p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1907
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1899
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1891
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //    28: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //    31: aload_1        
        //    32: goto            36
        //    35: athrow         
        //    36: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //    39: goto            43
        //    42: athrow         
        //    43: astore_2       
        //    44: aload_2        
        //    45: goto            49
        //    48: athrow         
        //    49: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //    54: goto            58
        //    57: athrow         
        //    58: astore_3       
        //    59: aload_3        
        //    60: aload_0        
        //    61: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //    64: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //    67: aload_1        
        //    68: goto            72
        //    71: athrow         
        //    72: invokevirtual   net/minecraft/block/Block.func_176200_f:(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z
        //    75: goto            79
        //    78: athrow         
        //    79: getstatic       dev/nuker/pyro/fc.0:I
        //    82: ifeq            90
        //    85: ldc             -283775908
        //    87: goto            92
        //    90: ldc             941711054
        //    92: ldc             753903426
        //    94: ixor           
        //    95: lookupswitch {
        //          -1007006946: 1852
        //          1441058795: 90
        //          default: 120
        //        }
        //   120: istore          4
        //   122: iload           4
        //   124: ifne            181
        //   127: getstatic       dev/nuker/pyro/fc.0:I
        //   130: ifeq            138
        //   133: ldc             1253431147
        //   135: goto            140
        //   138: ldc             -47278727
        //   140: ldc             -427749843
        //   142: ixor           
        //   143: lookupswitch {
        //          -1405822650: 1850
        //          460296922: 138
        //          default: 168
        //        }
        //   168: aload_1        
        //   169: goto            173
        //   172: athrow         
        //   173: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   176: goto            180
        //   179: athrow         
        //   180: astore_1       
        //   181: aload_0        
        //   182: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   185: getstatic       dev/nuker/pyro/fc.c:I
        //   188: ifge            196
        //   191: ldc             497816045
        //   193: goto            198
        //   196: ldc             -988473862
        //   198: ldc             -358604818
        //   200: ixor           
        //   201: lookupswitch {
        //          -150204925: 196
        //          800393748: 228
        //          default: 1832
        //        }
        //   228: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   231: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   234: ldc             4.0
        //   236: fmul           
        //   237: ldc             360.0
        //   239: fdiv           
        //   240: f2d            
        //   241: ldc2_w          0.5
        //   244: dadd           
        //   245: goto            249
        //   248: athrow         
        //   249: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   252: goto            256
        //   255: athrow         
        //   256: iconst_3       
        //   257: iand           
        //   258: istore          5
        //   260: iload           5
        //   262: goto            266
        //   265: athrow         
        //   266: invokestatic    net/minecraft/util/EnumFacing.func_176731_b:(I)Lnet/minecraft/util/EnumFacing;
        //   269: goto            273
        //   272: athrow         
        //   273: getstatic       dev/nuker/pyro/fc.c:I
        //   276: ifge            284
        //   279: ldc             108706029
        //   281: goto            286
        //   284: ldc             1465135559
        //   286: ldc             -1848118927
        //   288: ixor           
        //   289: lookupswitch {
        //          -1750251108: 1846
        //          1558405367: 284
        //          default: 316
        //        }
        //   316: astore          6
        //   318: aload_1        
        //   319: aload           6
        //   321: goto            325
        //   324: athrow         
        //   325: invokevirtual   net/minecraft/util/math/BlockPos.func_177972_a:(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;
        //   328: goto            332
        //   331: athrow         
        //   332: astore          7
        //   334: aload_0        
        //   335: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   338: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   341: getstatic       dev/nuker/pyro/fc.1:I
        //   344: ifeq            352
        //   347: ldc             217165041
        //   349: goto            354
        //   352: ldc             1797772464
        //   354: ldc             757471367
        //   356: ixor           
        //   357: lookupswitch {
        //          567784566: 352
        //          1174522935: 384
        //          default: 1874
        //        }
        //   384: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //   387: goto            391
        //   390: athrow         
        //   391: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184586_b:(Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
        //   394: goto            398
        //   397: athrow         
        //   398: getstatic       dev/nuker/pyro/fc.0:I
        //   401: ifeq            409
        //   404: ldc             298055620
        //   406: goto            411
        //   409: ldc             -1615606815
        //   411: ldc             -794645327
        //   413: ixor           
        //   414: lookupswitch {
        //          -1714155071: 409
        //          -1050584203: 1840
        //          default: 440
        //        }
        //   440: astore          8
        //   442: aload_0        
        //   443: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   446: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   449: getstatic       dev/nuker/pyro/fc.1:I
        //   452: ifeq            460
        //   455: ldc             380484621
        //   457: goto            462
        //   460: ldc             603377506
        //   462: ldc             851590286
        //   464: ixor           
        //   465: lookupswitch {
        //          288682988: 492
        //          611287171: 460
        //          default: 1828
        //        }
        //   492: aload_1        
        //   493: aload           6
        //   495: aload           8
        //   497: goto            501
        //   500: athrow         
        //   501: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_175151_a:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/item/ItemStack;)Z
        //   504: goto            508
        //   507: athrow         
        //   508: ifeq            1826
        //   511: getstatic       dev/nuker/pyro/fc.0:I
        //   514: ifeq            523
        //   517: ldc_w           743634586
        //   520: goto            526
        //   523: ldc_w           207159459
        //   526: ldc_w           -1745853779
        //   529: ixor           
        //   530: lookupswitch {
        //          -1146973129: 1862
        //          -243287198: 523
        //          default: 556
        //        }
        //   556: aload_0        
        //   557: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   560: getstatic       dev/nuker/pyro/fc.c:I
        //   563: ifge            572
        //   566: ldc_w           -1968783780
        //   569: goto            575
        //   572: ldc_w           1469208768
        //   575: ldc_w           -2020812072
        //   578: ixor           
        //   579: lookupswitch {
        //          220882052: 1830
        //          2056369833: 572
        //          default: 604
        //        }
        //   604: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   607: getstatic       dev/nuker/pyro/fc.c:I
        //   610: ifge            619
        //   613: ldc_w           811708649
        //   616: goto            622
        //   619: ldc_w           -679357394
        //   622: ldc_w           -812695098
        //   625: ixor           
        //   626: lookupswitch {
        //          -38397801: 619
        //          -1117905: 1844
        //          default: 652
        //        }
        //   652: aload           7
        //   654: getstatic       dev/nuker/pyro/fc.c:I
        //   657: ifge            666
        //   660: ldc_w           -117155993
        //   663: goto            669
        //   666: ldc_w           -341267142
        //   669: ldc_w           -1731925524
        //   672: ixor           
        //   673: lookupswitch {
        //          165423271: 666
        //          1640021643: 1870
        //          default: 700
        //        }
        //   700: aload           6
        //   702: aload           8
        //   704: getstatic       dev/nuker/pyro/fc.1:I
        //   707: ifeq            716
        //   710: ldc_w           -9741593
        //   713: goto            719
        //   716: ldc_w           325614513
        //   719: ldc_w           931619931
        //   722: ixor           
        //   723: lookupswitch {
        //          -924041540: 1878
        //          1350329328: 716
        //          default: 748
        //        }
        //   748: goto            752
        //   751: athrow         
        //   752: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_175151_a:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/item/ItemStack;)Z
        //   755: goto            759
        //   758: athrow         
        //   759: ifeq            1826
        //   762: aload_0        
        //   763: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   766: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   769: getstatic       dev/nuker/pyro/fc.1:I
        //   772: ifeq            781
        //   775: ldc_w           1105666641
        //   778: goto            784
        //   781: ldc_w           1138178723
        //   784: ldc_w           1587527519
        //   787: ixor           
        //   788: lookupswitch {
        //          -139229825: 781
        //          527998222: 1834
        //          default: 816
        //        }
        //   816: aload           7
        //   818: getstatic       dev/nuker/pyro/fc.1:I
        //   821: ifeq            830
        //   824: ldc_w           793242185
        //   827: goto            833
        //   830: ldc_w           -1961254136
        //   833: ldc_w           -617681279
        //   836: ixor           
        //   837: lookupswitch {
        //          -873385539: 830
        //          -194444088: 1836
        //          default: 864
        //        }
        //   864: goto            868
        //   867: athrow         
        //   868: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   871: goto            875
        //   874: athrow         
        //   875: astore          9
        //   877: aload           9
        //   879: getstatic       dev/nuker/pyro/fc.0:I
        //   882: ifeq            891
        //   885: ldc_w           1793302227
        //   888: goto            894
        //   891: ldc_w           -1986527891
        //   894: ldc_w           1124406391
        //   897: ixor           
        //   898: lookupswitch {
        //          -1160109459: 891
        //          702974628: 1858
        //          default: 924
        //        }
        //   924: goto            928
        //   927: athrow         
        //   928: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   933: goto            937
        //   936: athrow         
        //   937: aload_0        
        //   938: getstatic       dev/nuker/pyro/fc.0:I
        //   941: ifeq            950
        //   944: ldc_w           947582029
        //   947: goto            953
        //   950: ldc_w           2117028117
        //   953: ldc_w           -466707648
        //   956: ixor           
        //   957: lookupswitch {
        //          -1711156651: 984
        //          -598446323: 950
        //          default: 1838
        //        }
        //   984: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   987: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   990: aload           7
        //   992: goto            996
        //   995: athrow         
        //   996: invokevirtual   net/minecraft/block/Block.func_176200_f:(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z
        //   999: goto            1003
        //  1002: athrow         
        //  1003: istore          10
        //  1005: getstatic       dev/nuker/pyro/fc.0:I
        //  1008: ifeq            1017
        //  1011: ldc_w           844717928
        //  1014: goto            1020
        //  1017: ldc_w           1919399993
        //  1020: ldc_w           752702181
        //  1023: ixor           
        //  1024: lookupswitch {
        //          477082070: 1017
        //          511970701: 1842
        //          default: 1052
        //        }
        //  1052: iload           4
        //  1054: ifne            1063
        //  1057: ldc_w           -1959775508
        //  1060: goto            1066
        //  1063: ldc_w           -1959775507
        //  1066: ldc_w           -1897706918
        //  1069: ixor           
        //  1070: tableswitch {
        //          195490156: 1092
        //          195490157: 1158
        //          default: 1057
        //        }
        //  1092: aload_0        
        //  1093: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  1096: getstatic       dev/nuker/pyro/fc.1:I
        //  1099: ifeq            1108
        //  1102: ldc_w           -1854795115
        //  1105: goto            1111
        //  1108: ldc_w           -1976586846
        //  1111: ldc_w           1988094843
        //  1114: ixor           
        //  1115: lookupswitch {
        //          -418514450: 1108
        //          -61847847: 1140
        //          default: 1860
        //        }
        //  1140: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1143: aload_1        
        //  1144: goto            1148
        //  1147: athrow         
        //  1148: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_175623_d:(Lnet/minecraft/util/math/BlockPos;)Z
        //  1151: goto            1155
        //  1154: athrow         
        //  1155: ifeq            1162
        //  1158: iconst_1       
        //  1159: goto            1163
        //  1162: iconst_0       
        //  1163: getstatic       dev/nuker/pyro/fc.0:I
        //  1166: ifeq            1175
        //  1169: ldc_w           -1304369060
        //  1172: goto            1178
        //  1175: ldc_w           -146364394
        //  1178: ldc_w           -1314517999
        //  1181: ixor           
        //  1182: lookupswitch {
        //          65463373: 1175
        //          1189127175: 1208
        //          default: 1866
        //        }
        //  1208: istore          11
        //  1210: iload           10
        //  1212: ifne            1221
        //  1215: ldc_w           792414395
        //  1218: goto            1224
        //  1221: ldc_w           792414394
        //  1224: ldc_w           554508099
        //  1227: ixor           
        //  1228: tableswitch {
        //          476884976: 1252
        //          476884977: 1400
        //          default: 1215
        //        }
        //  1252: aload_0        
        //  1253: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  1256: getstatic       dev/nuker/pyro/fc.1:I
        //  1259: ifeq            1268
        //  1262: ldc_w           -2017344243
        //  1265: goto            1271
        //  1268: ldc_w           497450909
        //  1271: ldc_w           -136746990
        //  1274: ixor           
        //  1275: lookupswitch {
        //          1205003357: 1268
        //          1880665375: 1872
        //          default: 1300
        //        }
        //  1300: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1303: getstatic       dev/nuker/pyro/fc.1:I
        //  1306: ifeq            1315
        //  1309: ldc_w           1044269264
        //  1312: goto            1318
        //  1315: ldc_w           479226514
        //  1318: ldc_w           1647427665
        //  1321: ixor           
        //  1322: lookupswitch {
        //          1544521857: 1315
        //          2124524227: 1348
        //          default: 1876
        //        }
        //  1348: aload           7
        //  1350: goto            1354
        //  1353: athrow         
        //  1354: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_175623_d:(Lnet/minecraft/util/math/BlockPos;)Z
        //  1357: goto            1361
        //  1360: athrow         
        //  1361: ifeq            1370
        //  1364: ldc_w           954993479
        //  1367: goto            1373
        //  1370: ldc_w           954993476
        //  1373: ldc_w           -1893675466
        //  1376: ixor           
        //  1377: tableswitch {
        //          1872333538: 1400
        //          1872333539: 1404
        //          default: 1364
        //        }
        //  1400: iconst_1       
        //  1401: goto            1405
        //  1404: iconst_0       
        //  1405: getstatic       dev/nuker/pyro/fc.0:I
        //  1408: ifeq            1417
        //  1411: ldc_w           527318011
        //  1414: goto            1420
        //  1417: ldc_w           1677189078
        //  1420: ldc_w           -1800904657
        //  1423: ixor           
        //  1424: lookupswitch {
        //          -1949934636: 1864
        //          -617319456: 1417
        //          default: 1452
        //        }
        //  1452: istore          12
        //  1454: iload           11
        //  1456: ifeq            1826
        //  1459: getstatic       dev/nuker/pyro/fc.c:I
        //  1462: ifge            1471
        //  1465: ldc_w           243084904
        //  1468: goto            1474
        //  1471: ldc_w           1935770609
        //  1474: ldc_w           1935136022
        //  1477: ixor           
        //  1478: lookupswitch {
        //          3561191: 1504
        //          2099968894: 1471
        //          default: 1848
        //        }
        //  1504: iload           12
        //  1506: ifeq            1826
        //  1509: aload_0        
        //  1510: getstatic       dev/nuker/pyro/fc.c:I
        //  1513: ifge            1522
        //  1516: ldc_w           1928755587
        //  1519: goto            1525
        //  1522: ldc_w           1962789659
        //  1525: ldc_w           -720726205
        //  1528: ixor           
        //  1529: lookupswitch {
        //          -1476596032: 1880
        //          241778693: 1522
        //          default: 1556
        //        }
        //  1556: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  1559: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1562: getstatic       dev/nuker/pyro/fc.0:I
        //  1565: ifeq            1574
        //  1568: ldc_w           1413213000
        //  1571: goto            1577
        //  1574: ldc_w           9380803
        //  1577: ldc_w           1128284095
        //  1580: ixor           
        //  1581: lookupswitch {
        //          -508056761: 1574
        //          393991415: 1854
        //          default: 1608
        //        }
        //  1608: aload_1        
        //  1609: goto            1613
        //  1612: athrow         
        //  1613: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //  1616: goto            1620
        //  1619: athrow         
        //  1620: goto            1624
        //  1623: athrow         
        //  1624: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  1627: goto            1631
        //  1630: athrow         
        //  1631: goto            1635
        //  1634: athrow         
        //  1635: invokeinterface net/minecraft/block/state/IBlockState.func_185896_q:()Z
        //  1640: goto            1644
        //  1643: athrow         
        //  1644: ifeq            1653
        //  1647: ldc_w           -1599066294
        //  1650: goto            1656
        //  1653: ldc_w           -1599066293
        //  1656: ldc_w           260564458
        //  1659: ixor           
        //  1660: tableswitch {
        //          1584371008: 1684
        //          1584371009: 1826
        //          default: 1647
        //        }
        //  1684: aload_0        
        //  1685: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  1688: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1691: getstatic       dev/nuker/pyro/fc.c:I
        //  1694: ifge            1703
        //  1697: ldc_w           355418572
        //  1700: goto            1706
        //  1703: ldc_w           432702180
        //  1706: ldc_w           115887270
        //  1709: ixor           
        //  1710: lookupswitch {
        //          331812202: 1856
        //          1352787968: 1703
        //          default: 1736
        //        }
        //  1736: aload           7
        //  1738: goto            1742
        //  1741: athrow         
        //  1742: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //  1745: goto            1749
        //  1748: athrow         
        //  1749: getstatic       dev/nuker/pyro/fc.1:I
        //  1752: ifeq            1761
        //  1755: ldc_w           -661178811
        //  1758: goto            1764
        //  1761: ldc_w           -2079223281
        //  1764: ldc_w           1208438765
        //  1767: ixor           
        //  1768: lookupswitch {
        //          -1869579864: 1761
        //          -870916638: 1796
        //          default: 1868
        //        }
        //  1796: goto            1800
        //  1799: athrow         
        //  1800: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  1803: goto            1807
        //  1806: athrow         
        //  1807: goto            1811
        //  1810: athrow         
        //  1811: invokeinterface net/minecraft/block/state/IBlockState.func_185896_q:()Z
        //  1816: goto            1820
        //  1819: athrow         
        //  1820: ifeq            1826
        //  1823: aload           6
        //  1825: areturn        
        //  1826: aconst_null    
        //  1827: areturn        
        //  1828: aconst_null    
        //  1829: athrow         
        //  1830: aconst_null    
        //  1831: athrow         
        //  1832: aconst_null    
        //  1833: athrow         
        //  1834: aconst_null    
        //  1835: athrow         
        //  1836: aconst_null    
        //  1837: athrow         
        //  1838: aconst_null    
        //  1839: athrow         
        //  1840: aconst_null    
        //  1841: athrow         
        //  1842: aconst_null    
        //  1843: athrow         
        //  1844: aconst_null    
        //  1845: athrow         
        //  1846: aconst_null    
        //  1847: athrow         
        //  1848: aconst_null    
        //  1849: athrow         
        //  1850: aconst_null    
        //  1851: athrow         
        //  1852: aconst_null    
        //  1853: athrow         
        //  1854: aconst_null    
        //  1855: athrow         
        //  1856: aconst_null    
        //  1857: athrow         
        //  1858: aconst_null    
        //  1859: athrow         
        //  1860: aconst_null    
        //  1861: athrow         
        //  1862: aconst_null    
        //  1863: athrow         
        //  1864: aconst_null    
        //  1865: athrow         
        //  1866: aconst_null    
        //  1867: athrow         
        //  1868: aconst_null    
        //  1869: athrow         
        //  1870: aconst_null    
        //  1871: athrow         
        //  1872: aconst_null    
        //  1873: athrow         
        //  1874: aconst_null    
        //  1875: athrow         
        //  1876: aconst_null    
        //  1877: athrow         
        //  1878: aconst_null    
        //  1879: athrow         
        //  1880: aconst_null    
        //  1881: athrow         
        //  1882: pop            
        //  1883: goto            24
        //  1886: pop            
        //  1887: aconst_null    
        //  1888: goto            1882
        //  1891: dup            
        //  1892: ifnull          1882
        //  1895: checkcast       Ljava/lang/Throwable;
        //  1898: athrow         
        //  1899: dup            
        //  1900: ifnull          1886
        //  1903: checkcast       Ljava/lang/Throwable;
        //  1906: athrow         
        //  1907: aconst_null    
        //  1908: athrow         
        //    StackMapTable: 00 E0 FF 00 03 00 03 07 00 03 07 00 73 07 00 C1 00 01 07 00 1D FA 00 04 FF 00 0B 00 00 00 01 07 00 1D FD 00 03 07 00 03 07 00 73 4A 07 00 1D FF 00 00 00 02 07 00 03 07 00 73 00 02 07 00 BB 07 00 73 45 07 00 1D 40 07 00 C1 FF 00 04 00 03 07 00 03 07 00 73 07 00 C1 00 01 07 00 1D 40 07 00 C1 47 07 00 1D 40 07 00 C7 FF 00 0C 00 00 00 01 07 00 1D FF 00 00 00 04 07 00 03 07 00 73 07 00 C1 07 00 C7 00 03 07 00 C7 07 00 BB 07 00 73 45 07 00 1D 40 01 4A 01 FF 00 01 00 04 07 00 03 07 00 73 07 00 C1 07 00 C7 00 02 01 01 5B 01 FC 00 11 01 41 01 1B 43 07 00 1D 40 07 00 73 45 07 00 1D 40 07 00 73 00 4E 07 00 22 FF 00 01 00 05 07 00 03 07 00 73 07 00 C1 07 00 C7 01 00 02 07 00 22 01 5D 07 00 22 53 07 00 1D 40 03 45 07 00 1D 40 01 FF 00 08 00 00 00 01 07 00 1D FF 00 00 00 06 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 00 01 01 45 07 00 1D 40 07 00 30 4A 07 00 30 FF 00 01 00 06 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 00 02 07 00 30 01 5D 07 00 30 FF 00 07 00 00 00 01 07 00 1D FF 00 00 00 07 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 00 02 07 00 73 07 00 30 45 07 00 1D 40 07 00 73 FF 00 13 00 08 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 00 01 07 00 28 FF 00 01 00 08 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 00 02 07 00 28 01 5D 07 00 28 FF 00 05 00 00 00 01 07 00 1D FF 00 00 00 08 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 00 02 07 00 28 07 00 53 45 07 00 1D 40 07 00 42 4A 07 00 42 FF 00 01 00 08 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 00 02 07 00 42 01 5C 07 00 42 FF 00 13 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 01 07 00 28 FF 00 01 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 02 07 00 28 01 5D 07 00 28 FF 00 07 00 00 00 01 07 00 1D FF 00 00 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 04 07 00 28 07 00 73 07 00 30 07 00 42 45 07 00 1D 40 01 0E 42 01 1D 4F 07 00 22 FF 00 02 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 02 07 00 22 01 5C 07 00 22 4E 07 00 28 FF 00 02 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 02 07 00 28 01 5D 07 00 28 FF 00 0D 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 02 07 00 28 07 00 73 FF 00 02 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 03 07 00 28 07 00 73 01 FF 00 1E 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 02 07 00 28 07 00 73 FF 00 0F 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 04 07 00 28 07 00 73 07 00 30 07 00 42 FF 00 02 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 05 07 00 28 07 00 73 07 00 30 07 00 42 01 FF 00 1C 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 04 07 00 28 07 00 73 07 00 30 07 00 42 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 04 07 00 28 07 00 73 07 00 30 07 00 42 45 07 00 1D 40 01 55 07 00 BB FF 00 02 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 02 07 00 BB 01 5F 07 00 BB FF 00 0D 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 02 07 00 BB 07 00 73 FF 00 02 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 03 07 00 BB 07 00 73 01 FF 00 1E 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 02 07 00 BB 07 00 73 42 07 00 1D FF 00 00 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 02 07 00 BB 07 00 73 45 07 00 1D 40 07 00 C1 FF 00 0F 00 0A 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 00 01 07 00 C1 FF 00 02 00 0A 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 00 02 07 00 C1 01 5D 07 00 C1 42 07 00 1D 40 07 00 C1 47 07 00 1D 40 07 00 C7 FF 00 0C 00 0A 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 00 02 07 00 C7 07 00 03 FF 00 02 00 0A 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 00 03 07 00 C7 07 00 03 01 FF 00 1E 00 0A 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 00 02 07 00 C7 07 00 03 4A 07 00 1D FF 00 00 00 0A 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 00 03 07 00 C7 07 00 BB 07 00 73 45 07 00 1D 40 01 FC 00 0D 01 42 01 1F 04 05 42 01 19 4F 07 00 22 FF 00 02 00 0B 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 00 02 07 00 22 01 5C 07 00 22 46 07 00 1D FF 00 00 00 0B 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 00 02 07 00 BB 07 00 73 45 07 00 1D 40 01 02 03 40 01 4B 01 FF 00 02 00 0B 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 00 02 01 01 5D 01 FC 00 06 01 05 42 01 1B 4F 07 00 22 FF 00 02 00 0C 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 00 02 07 00 22 01 5C 07 00 22 4E 07 00 BB FF 00 02 00 0C 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 00 02 07 00 BB 01 5D 07 00 BB 44 07 00 1D FF 00 00 00 0C 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 00 02 07 00 BB 07 00 73 45 07 00 1D 40 01 02 05 42 01 1A 03 40 01 4B 01 FF 00 02 00 0C 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 00 02 01 01 5F 01 FC 00 12 01 42 01 1D 51 07 00 03 FF 00 02 00 0D 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 01 00 02 07 00 03 01 5E 07 00 03 51 07 00 BB FF 00 02 00 0D 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 01 00 02 07 00 BB 01 5E 07 00 BB 43 07 00 1D FF 00 00 00 0D 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 01 00 02 07 00 BB 07 00 73 45 07 00 1D FF 00 00 00 0D 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 01 00 02 07 00 BB 07 00 73 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 0D 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 01 00 02 07 00 BB 07 00 73 45 07 00 1D 40 07 00 C1 42 07 00 1D 40 07 00 C1 47 07 00 1D 40 01 02 05 42 01 1B 52 07 00 BB FF 00 02 00 0D 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 01 00 02 07 00 BB 01 5D 07 00 BB 44 07 00 AF FF 00 00 00 0D 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 01 00 02 07 00 BB 07 00 73 45 07 00 1D FF 00 00 00 0D 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 01 00 02 07 00 BB 07 00 73 FF 00 0B 00 0D 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 01 00 02 07 00 BB 07 00 73 FF 00 02 00 0D 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 01 00 03 07 00 BB 07 00 73 01 FF 00 1F 00 0D 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 01 00 02 07 00 BB 07 00 73 42 07 00 1D FF 00 00 00 0D 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 01 00 02 07 00 BB 07 00 73 45 07 00 1D 40 07 00 C1 42 07 00 1D 40 07 00 C1 47 07 00 1D 40 01 FF 00 05 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 00 41 07 00 28 41 07 00 22 FF 00 01 00 05 07 00 03 07 00 73 07 00 C1 07 00 C7 01 00 01 07 00 22 FF 00 01 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 01 07 00 BB FF 00 01 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 02 07 00 BB 07 00 73 FF 00 01 00 0A 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 00 02 07 00 C7 07 00 03 FF 00 01 00 08 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 00 01 07 00 42 FE 00 01 07 00 42 07 00 C1 01 FF 00 01 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 01 07 00 28 FF 00 01 00 06 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 00 01 07 00 30 FF 00 01 00 0D 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 01 00 00 FF 00 01 00 05 07 00 03 07 00 73 07 00 C1 07 00 C7 01 00 00 FF 00 01 00 04 07 00 03 07 00 73 07 00 C1 07 00 C7 00 01 01 FF 00 01 00 0D 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 01 00 01 07 00 BB 41 07 00 BB FF 00 01 00 0A 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 00 01 07 00 C1 FF 00 01 00 0B 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 00 01 07 00 22 F9 00 01 FF 00 01 00 0C 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 00 01 01 FF 00 01 00 0B 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 00 01 01 FF 00 01 00 0D 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 01 00 02 07 00 BB 07 00 73 FF 00 01 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 02 07 00 28 07 00 73 FF 00 01 00 0C 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 00 01 07 00 22 FF 00 01 00 08 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 00 01 07 00 28 FF 00 01 00 0C 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 00 01 07 00 BB FF 00 01 00 09 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 00 04 07 00 28 07 00 73 07 00 30 07 00 42 FF 00 01 00 0D 07 00 03 07 00 73 07 00 C1 07 00 C7 01 01 07 00 30 07 00 73 07 00 42 07 00 C1 01 01 01 00 01 07 00 03 FF 00 01 00 02 07 00 03 07 00 73 00 01 07 00 1D 43 05 44 07 00 1D 47 05 FF 00 07 00 03 07 00 03 07 00 73 07 00 C1 00 01 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1891   1899   Any
        //  1891   1899   1891   1899   Ljava/lang/RuntimeException;
        //  1907   1909   3      8      Any
        //  35     42     42     43     Any
        //  35     42     42     43     Any
        //  35     42     35     36     Any
        //  36     42     35     36     Ljava/lang/RuntimeException;
        //  35     42     35     36     Ljava/lang/UnsupportedOperationException;
        //  48     57     57     58     Any
        //  48     57     48     49     Any
        //  49     57     57     58     Any
        //  49     57     3      8      Any
        //  49     57     3      8      Any
        //  72     78     78     79     Any
        //  72     78     78     79     Ljava/lang/StringIndexOutOfBoundsException;
        //  72     78     78     79     Any
        //  72     78     3      8      Any
        //  72     78     78     79     Any
        //  172    179    179    180    Any
        //  172    179    172    173    Any
        //  172    179    172    173    Any
        //  172    179    179    180    Ljava/lang/ClassCastException;
        //  172    179    172    173    Ljava/lang/IllegalArgumentException;
        //  248    255    255    256    Any
        //  248    255    3      8      Any
        //  249    255    3      8      Any
        //  249    255    3      8      Any
        //  249    255    248    249    Any
        //  266    272    272    273    Any
        //  266    272    272    273    Any
        //  266    272    3      8      Ljava/lang/IllegalStateException;
        //  266    272    3      8      Ljava/lang/NumberFormatException;
        //  266    272    272    273    Ljava/lang/NullPointerException;
        //  325    331    331    332    Any
        //  325    331    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  325    331    331    332    Any
        //  325    331    3      8      Any
        //  325    331    331    332    Any
        //  391    397    397    398    Any
        //  391    397    397    398    Ljava/lang/ClassCastException;
        //  391    397    397    398    Ljava/lang/IndexOutOfBoundsException;
        //  391    397    397    398    Any
        //  391    397    3      8      Ljava/lang/NegativeArraySizeException;
        //  501    507    507    508    Any
        //  501    507    507    508    Ljava/lang/IllegalStateException;
        //  501    507    3      8      Any
        //  501    507    3      8      Any
        //  501    507    3      8      Ljava/lang/ClassCastException;
        //  752    758    758    759    Any
        //  752    758    3      8      Any
        //  752    758    758    759    Ljava/lang/NumberFormatException;
        //  752    758    758    759    Ljava/lang/RuntimeException;
        //  752    758    758    759    Ljava/util/ConcurrentModificationException;
        //  867    874    874    875    Any
        //  867    874    3      8      Ljava/lang/IllegalArgumentException;
        //  868    874    867    868    Ljava/lang/IllegalStateException;
        //  867    874    867    868    Ljava/lang/IllegalArgumentException;
        //  867    874    867    868    Any
        //  927    936    936    937    Any
        //  928    936    927    928    Any
        //  928    936    3      8      Ljava/lang/UnsupportedOperationException;
        //  928    936    3      8      Any
        //  927    936    927    928    Ljava/lang/UnsupportedOperationException;
        //  995    1002   1002   1003   Any
        //  996    1002   1002   1003   Any
        //  996    1002   1002   1003   Any
        //  996    1002   995    996    Any
        //  995    1002   3      8      Ljava/lang/NumberFormatException;
        //  1147   1154   1154   1155   Any
        //  1147   1154   1154   1155   Ljava/lang/IllegalStateException;
        //  1148   1154   3      8      Any
        //  1148   1154   3      8      Ljava/lang/UnsupportedOperationException;
        //  1148   1154   1147   1148   Any
        //  1353   1360   1360   1361   Any
        //  1353   1360   1353   1354   Any
        //  1353   1360   1360   1361   Ljava/lang/ArithmeticException;
        //  1353   1360   1360   1361   Ljava/util/NoSuchElementException;
        //  1353   1360   1360   1361   Ljava/lang/IllegalStateException;
        //  1612   1619   1619   1620   Any
        //  1613   1619   3      8      Ljava/lang/RuntimeException;
        //  1613   1619   1619   1620   Ljava/lang/StringIndexOutOfBoundsException;
        //  1612   1619   3      8      Ljava/lang/UnsupportedOperationException;
        //  1613   1619   1612   1613   Any
        //  1624   1630   1630   1631   Any
        //  1624   1630   3      8      Any
        //  1624   1630   1630   1631   Ljava/lang/NullPointerException;
        //  1624   1630   1630   1631   Ljava/lang/ClassCastException;
        //  1624   1630   3      8      Ljava/lang/NullPointerException;
        //  1634   1643   1643   1644   Any
        //  1634   1643   1643   1644   Any
        //  1635   1643   3      8      Any
        //  1634   1643   1634   1635   Any
        //  1635   1643   3      8      Ljava/util/ConcurrentModificationException;
        //  1741   1748   1748   1749   Any
        //  1742   1748   3      8      Ljava/lang/NegativeArraySizeException;
        //  1742   1748   1748   1749   Ljava/lang/ClassCastException;
        //  1742   1748   1741   1742   Ljava/lang/NullPointerException;
        //  1742   1748   3      8      Ljava/lang/ClassCastException;
        //  1799   1806   1806   1807   Any
        //  1800   1806   3      8      Any
        //  1799   1806   3      8      Any
        //  1800   1806   1799   1800   Any
        //  1800   1806   1799   1800   Any
        //  1810   1819   1819   1820   Any
        //  1811   1819   1810   1811   Any
        //  1811   1819   1810   1811   Ljava/lang/EnumConstantNotPresentException;
        //  1810   1819   3      8      Ljava/lang/IllegalStateException;
        //  1810   1819   3      8      Any
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
    
    public float c(final BlockPos p0, final EntityLivingBase p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          309
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            301
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            293
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: aload_1        
        //    26: getstatic       dev/nuker/pyro/fc.0:I
        //    29: ifeq            38
        //    32: ldc_w           -1090125164
        //    35: goto            41
        //    38: ldc_w           1999173395
        //    41: ldc_w           937154715
        //    44: ixor           
        //    45: lookupswitch {
        //          -1998726641: 38
        //          1089679240: 72
        //          default: 276
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokestatic    dev/nuker/pyro/fbA.1:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //    79: goto            83
        //    82: athrow         
        //    83: getstatic       dev/nuker/pyro/fc.0:I
        //    86: ifeq            95
        //    89: ldc_w           -277556504
        //    92: goto            98
        //    95: ldc_w           688463820
        //    98: ldc_w           -372140323
        //   101: ixor           
        //   102: lookupswitch {
        //          -1059550959: 128
        //          111494197: 95
        //          default: 278
        //        }
        //   128: getstatic       net/minecraft/block/BlockHorizontal.field_185512_D:Lnet/minecraft/block/properties/PropertyDirection;
        //   131: getstatic       dev/nuker/pyro/fc.c:I
        //   134: ifge            143
        //   137: ldc_w           1402838567
        //   140: goto            146
        //   143: ldc_w           -1310773490
        //   146: ldc_w           -1500811043
        //   149: ixor           
        //   150: lookupswitch {
        //          -183046406: 143
        //          391405523: 176
        //          default: 280
        //        }
        //   176: goto            180
        //   179: athrow         
        //   180: invokeinterface net/minecraft/block/state/IBlockState.func_177229_b:(Lnet/minecraft/block/properties/IProperty;)Ljava/lang/Comparable;
        //   185: goto            189
        //   188: athrow         
        //   189: checkcast       Lnet/minecraft/util/EnumFacing;
        //   192: goto            196
        //   195: athrow         
        //   196: invokevirtual   net/minecraft/util/EnumFacing.func_176734_d:()Lnet/minecraft/util/EnumFacing;
        //   199: goto            203
        //   202: athrow         
        //   203: goto            207
        //   206: athrow         
        //   207: invokevirtual   net/minecraft/util/math/BlockPos.func_177972_a:(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;
        //   210: goto            214
        //   213: athrow         
        //   214: getstatic       dev/nuker/pyro/fc.c:I
        //   217: ifge            226
        //   220: ldc_w           -1434487616
        //   223: goto            229
        //   226: ldc_w           -1014560293
        //   229: ldc_w           -1548233042
        //   232: ixor           
        //   233: lookupswitch {
        //          164143726: 226
        //          1613815669: 260
        //          default: 282
        //        }
        //   260: astore_3       
        //   261: aload_0        
        //   262: aload_3        
        //   263: aload_2        
        //   264: goto            268
        //   267: athrow         
        //   268: invokespecial   dev/nuker/pyro/f5c.0:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/EntityLivingBase;)F
        //   271: goto            275
        //   274: athrow         
        //   275: freturn        
        //   276: aconst_null    
        //   277: athrow         
        //   278: aconst_null    
        //   279: athrow         
        //   280: aconst_null    
        //   281: athrow         
        //   282: aconst_null    
        //   283: athrow         
        //   284: pop            
        //   285: goto            24
        //   288: pop            
        //   289: aconst_null    
        //   290: goto            284
        //   293: dup            
        //   294: ifnull          284
        //   297: checkcast       Ljava/lang/Throwable;
        //   300: athrow         
        //   301: dup            
        //   302: ifnull          288
        //   305: checkcast       Ljava/lang/Throwable;
        //   308: athrow         
        //   309: aconst_null    
        //   310: athrow         
        //    StackMapTable: 00 2D 43 07 00 1D 04 FF 00 0B 00 00 00 01 07 00 1D FE 00 03 07 00 03 07 00 73 07 01 78 FF 00 0D 00 03 07 00 03 07 00 73 07 01 78 00 02 07 00 73 07 00 73 FF 00 02 00 03 07 00 03 07 00 73 07 01 78 00 03 07 00 73 07 00 73 01 FF 00 1E 00 03 07 00 03 07 00 73 07 01 78 00 02 07 00 73 07 00 73 42 07 00 75 FF 00 00 00 03 07 00 03 07 00 73 07 01 78 00 02 07 00 73 07 00 73 45 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 01 78 00 02 07 00 73 07 00 C1 FF 00 0B 00 03 07 00 03 07 00 73 07 01 78 00 02 07 00 73 07 00 C1 FF 00 02 00 03 07 00 03 07 00 73 07 01 78 00 03 07 00 73 07 00 C1 01 FF 00 1D 00 03 07 00 03 07 00 73 07 01 78 00 02 07 00 73 07 00 C1 FF 00 0E 00 03 07 00 03 07 00 73 07 01 78 00 03 07 00 73 07 00 C1 07 01 7A FF 00 02 00 03 07 00 03 07 00 73 07 01 78 00 04 07 00 73 07 00 C1 07 01 7A 01 FF 00 1D 00 03 07 00 03 07 00 73 07 01 78 00 03 07 00 73 07 00 C1 07 01 7A 42 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 01 78 00 03 07 00 73 07 00 C1 07 01 7A 47 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 01 78 00 02 07 00 73 07 01 7C 45 07 00 75 FF 00 00 00 03 07 00 03 07 00 73 07 01 78 00 02 07 00 73 07 00 30 45 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 01 78 00 02 07 00 73 07 00 30 42 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 01 78 00 02 07 00 73 07 00 30 45 07 00 1D 40 07 00 73 4B 07 00 73 FF 00 02 00 03 07 00 03 07 00 73 07 01 78 00 02 07 00 73 01 5E 07 00 73 FF 00 06 00 04 07 00 03 07 00 73 07 01 78 07 00 73 00 01 07 00 1D FF 00 00 00 04 07 00 03 07 00 73 07 01 78 07 00 73 00 03 07 00 03 07 00 73 07 01 78 45 07 00 1D 40 02 FF 00 00 00 03 07 00 03 07 00 73 07 01 78 00 02 07 00 73 07 00 73 FF 00 01 00 03 07 00 03 07 00 73 07 01 78 00 02 07 00 73 07 00 C1 FF 00 01 00 03 07 00 03 07 00 73 07 01 78 00 03 07 00 73 07 00 C1 07 01 7A 41 07 00 73 41 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     293    301    Ljava/lang/AssertionError;
        //  293    301    293    301    Any
        //  309    311    3      8      Ljava/lang/NumberFormatException;
        //  75     82     82     83     Any
        //  76     82     75     76     Ljava/lang/RuntimeException;
        //  75     82     82     83     Any
        //  75     82     82     83     Any
        //  76     82     3      8      Any
        //  179    188    188    189    Any
        //  179    188    188    189    Any
        //  180    188    179    180    Any
        //  180    188    3      8      Any
        //  180    188    179    180    Any
        //  195    202    202    203    Any
        //  195    202    195    196    Ljava/lang/EnumConstantNotPresentException;
        //  196    202    202    203    Any
        //  196    202    3      8      Ljava/lang/IllegalArgumentException;
        //  196    202    195    196    Ljava/lang/IllegalArgumentException;
        //  206    213    213    214    Any
        //  206    213    206    207    Any
        //  207    213    213    214    Any
        //  206    213    213    214    Any
        //  207    213    213    214    Ljava/lang/AssertionError;
        //  267    274    274    275    Any
        //  267    274    267    268    Any
        //  267    274    274    275    Any
        //  267    274    274    275    Any
        //  268    274    274    275    Any
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
    
    public void c(final BlockPos p0, final EntityPlayerSP p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          545
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            537
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            529
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //    28: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    31: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //    34: new             Lnet/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock;
        //    37: dup            
        //    38: aload_1        
        //    39: getstatic       net/minecraft/util/EnumFacing.UP:Lnet/minecraft/util/EnumFacing;
        //    42: aload_0        
        //    43: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //    46: getstatic       dev/nuker/pyro/fc.1:I
        //    49: ifeq            58
        //    52: ldc_w           -926985535
        //    55: goto            61
        //    58: ldc_w           -1554395964
        //    61: ldc_w           1096307290
        //    64: ixor           
        //    65: lookupswitch {
        //          -1981349733: 58
        //          -503210338: 92
        //          default: 506
        //        }
        //    92: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    95: goto            99
        //    98: athrow         
        //    99: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184592_cb:()Lnet/minecraft/item/ItemStack;
        //   102: goto            106
        //   105: athrow         
        //   106: getstatic       dev/nuker/pyro/fc.0:I
        //   109: ifeq            118
        //   112: ldc_w           227810040
        //   115: goto            121
        //   118: ldc_w           -597157273
        //   121: ldc_w           -173535118
        //   124: ixor           
        //   125: lookupswitch {
        //          -130282870: 118
        //          700451349: 152
        //          default: 518
        //        }
        //   152: goto            156
        //   155: athrow         
        //   156: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   159: goto            163
        //   162: athrow         
        //   163: getstatic       net/minecraft/init/Items.field_151104_aV:Lnet/minecraft/item/Item;
        //   166: if_acmpne       222
        //   169: getstatic       dev/nuker/pyro/fc.c:I
        //   172: ifge            181
        //   175: ldc_w           71930848
        //   178: goto            184
        //   181: ldc_w           -918274347
        //   184: ldc_w           1075795910
        //   187: ixor           
        //   188: lookupswitch {
        //          -1990498029: 216
        //          1146536998: 181
        //          default: 504
        //        }
        //   216: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //   219: goto            271
        //   222: getstatic       dev/nuker/pyro/fc.c:I
        //   225: ifge            234
        //   228: ldc_w           812900250
        //   231: goto            237
        //   234: ldc_w           -1716232084
        //   237: ldc_w           5137824
        //   240: ixor           
        //   241: lookupswitch {
        //          -2026109316: 234
        //          809351738: 512
        //          default: 268
        //        }
        //   268: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //   271: fconst_0       
        //   272: fconst_0       
        //   273: fconst_0       
        //   274: getstatic       dev/nuker/pyro/fc.0:I
        //   277: ifeq            286
        //   280: ldc_w           510470971
        //   283: goto            289
        //   286: ldc_w           1420179426
        //   289: ldc_w           -332440710
        //   292: ixor           
        //   293: lookupswitch {
        //          -1198953320: 320
        //          -230526911: 286
        //          default: 514
        //        }
        //   320: goto            324
        //   323: athrow         
        //   324: invokespecial   net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumHand;FFF)V
        //   327: goto            331
        //   330: athrow         
        //   331: goto            335
        //   334: athrow         
        //   335: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   338: goto            342
        //   341: athrow         
        //   342: getstatic       dev/nuker/pyro/fc.0:I
        //   345: ifeq            354
        //   348: ldc_w           410590854
        //   351: goto            357
        //   354: ldc_w           643747899
        //   357: ldc_w           275226678
        //   360: ixor           
        //   361: lookupswitch {
        //          -1500697701: 354
        //          136232624: 516
        //          default: 388
        //        }
        //   388: aload_0        
        //   389: getstatic       dev/nuker/pyro/fc.1:I
        //   392: ifeq            401
        //   395: ldc_w           -1553413790
        //   398: goto            404
        //   401: ldc_w           1834721561
        //   404: ldc_w           -1301811608
        //   407: ixor           
        //   408: lookupswitch {
        //          286205706: 508
        //          1711511275: 401
        //          default: 436
        //        }
        //   436: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   439: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   442: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //   445: getstatic       dev/nuker/pyro/fc.c:I
        //   448: ifge            457
        //   451: ldc_w           2138091117
        //   454: goto            460
        //   457: ldc_w           -914404626
        //   460: ldc_w           -412358944
        //   463: ixor           
        //   464: lookupswitch {
        //          -1743042419: 457
        //          773106702: 492
        //          default: 510
        //        }
        //   492: goto            496
        //   495: athrow         
        //   496: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184609_a:(Lnet/minecraft/util/EnumHand;)V
        //   499: goto            503
        //   502: athrow         
        //   503: return         
        //   504: aconst_null    
        //   505: athrow         
        //   506: aconst_null    
        //   507: athrow         
        //   508: aconst_null    
        //   509: athrow         
        //   510: aconst_null    
        //   511: athrow         
        //   512: aconst_null    
        //   513: athrow         
        //   514: aconst_null    
        //   515: athrow         
        //   516: aconst_null    
        //   517: athrow         
        //   518: aconst_null    
        //   519: athrow         
        //   520: pop            
        //   521: goto            24
        //   524: pop            
        //   525: aconst_null    
        //   526: goto            520
        //   529: dup            
        //   530: ifnull          520
        //   533: checkcast       Ljava/lang/Throwable;
        //   536: athrow         
        //   537: dup            
        //   538: ifnull          524
        //   541: checkcast       Ljava/lang/Throwable;
        //   544: athrow         
        //   545: aconst_null    
        //   546: athrow         
        //    StackMapTable: 00 3F 43 07 00 1D 04 FF 00 0B 00 00 00 01 07 00 1D FE 00 03 07 00 03 07 00 73 07 00 28 FF 00 21 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 22 FF 00 02 00 03 07 00 03 07 00 73 07 00 28 00 07 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 22 01 FF 00 1E 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 22 45 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 28 45 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 42 FF 00 0B 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 42 FF 00 02 00 03 07 00 03 07 00 73 07 00 28 00 07 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 42 01 FF 00 1E 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 42 42 07 00 AB FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 42 45 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 77 FF 00 11 00 03 07 00 03 07 00 73 07 00 28 00 05 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 FF 00 02 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 01 FF 00 1F 00 03 07 00 03 07 00 73 07 00 28 00 05 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 FF 00 05 00 03 07 00 03 07 00 73 07 00 28 00 05 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 FF 00 0B 00 03 07 00 03 07 00 73 07 00 28 00 05 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 FF 00 02 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 01 FF 00 1E 00 03 07 00 03 07 00 73 07 00 28 00 05 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 FF 00 02 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 53 FF 00 0E 00 03 07 00 03 07 00 73 07 00 28 00 09 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 53 02 02 02 FF 00 02 00 03 07 00 03 07 00 73 07 00 28 00 0A 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 53 02 02 02 01 FF 00 1E 00 03 07 00 03 07 00 73 07 00 28 00 09 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 53 02 02 02 42 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 09 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 53 02 02 02 45 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 02 07 00 63 07 00 2E 42 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 02 07 00 63 07 00 2E 45 07 00 1D 00 0B 42 01 1E 4C 07 00 03 FF 00 02 00 03 07 00 03 07 00 73 07 00 28 00 02 07 00 03 01 5F 07 00 03 FF 00 14 00 03 07 00 03 07 00 73 07 00 28 00 02 07 00 28 07 00 53 FF 00 02 00 03 07 00 03 07 00 73 07 00 28 00 03 07 00 28 07 00 53 01 FF 00 1F 00 03 07 00 03 07 00 73 07 00 28 00 02 07 00 28 07 00 53 42 07 00 1D FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 02 07 00 28 07 00 53 45 07 00 1D 00 FF 00 00 00 03 07 00 03 07 00 73 07 00 28 00 05 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 FF 00 01 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 22 41 07 00 03 FF 00 01 00 03 07 00 03 07 00 73 07 00 28 00 02 07 00 28 07 00 53 FF 00 01 00 03 07 00 03 07 00 73 07 00 28 00 05 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 FF 00 01 00 03 07 00 03 07 00 73 07 00 28 00 09 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 53 02 02 02 01 FF 00 01 00 03 07 00 03 07 00 73 07 00 28 00 06 07 00 63 08 00 22 08 00 22 07 00 73 07 00 30 07 00 42 41 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     529    537    Ljava/util/NoSuchElementException;
        //  529    537    529    537    Any
        //  545    547    3      8      Ljava/lang/UnsupportedOperationException;
        //  98     105    105    106    Any
        //  99     105    98     99     Any
        //  98     105    98     99     Any
        //  98     105    3      8      Any
        //  98     105    98     99     Any
        //  155    162    162    163    Any
        //  156    162    3      8      Any
        //  155    162    3      8      Any
        //  155    162    162    163    Ljava/lang/NumberFormatException;
        //  155    162    155    156    Ljava/lang/IllegalArgumentException;
        //  323    330    330    331    Any
        //  323    330    3      8      Any
        //  323    330    323    324    Ljava/lang/IllegalStateException;
        //  323    330    323    324    Any
        //  324    330    323    324    Ljava/lang/IllegalArgumentException;
        //  334    341    341    342    Any
        //  335    341    334    335    Any
        //  334    341    334    335    Any
        //  335    341    341    342    Ljava/util/ConcurrentModificationException;
        //  335    341    334    335    Any
        //  495    502    502    503    Any
        //  495    502    495    496    Any
        //  495    502    502    503    Any
        //  496    502    3      8      Any
        //  495    502    502    503    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 154 out of bounds for length 154
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
    
    @f06
    public void c(final f3i p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          5881
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            5873
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            5865
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   dev/nuker/pyro/f3i.c:()Ldev/nuker/pyro/f2T;
        //    32: goto            36
        //    35: athrow         
        //    36: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    39: if_acmpne       5689
        //    42: aload_1        
        //    43: getstatic       dev/nuker/pyro/fc.c:I
        //    46: ifge            55
        //    49: ldc_w           1575293264
        //    52: goto            58
        //    55: ldc_w           1850446508
        //    58: ldc_w           -979842074
        //    61: ixor           
        //    62: lookupswitch {
        //          -1736582474: 55
        //          -1412212406: 88
        //          default: 5700
        //        }
        //    88: goto            92
        //    91: athrow         
        //    92: invokevirtual   dev/nuker/pyro/f3i.0:()Z
        //    95: goto            99
        //    98: athrow         
        //    99: ifne            5689
        //   102: aload_0        
        //   103: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   106: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   109: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71093_bK:I
        //   112: ifne            116
        //   115: return         
        //   116: aload_0        
        //   117: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   120: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   123: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   126: aload_0        
        //   127: getfield        dev/nuker/pyro/f5c.c:Ldev/nuker/pyro/f0d;
        //   130: goto            134
        //   133: athrow         
        //   134: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   137: goto            141
        //   140: athrow         
        //   141: checkcast       Ljava/lang/Double;
        //   144: getstatic       dev/nuker/pyro/fc.0:I
        //   147: ifeq            156
        //   150: ldc_w           -27990729
        //   153: goto            159
        //   156: ldc_w           -811704019
        //   159: ldc_w           1744055771
        //   162: ixor           
        //   163: lookupswitch {
        //          -1717516052: 5758
        //          -1099612562: 156
        //          default: 188
        //        }
        //   188: goto            192
        //   191: athrow         
        //   192: invokevirtual   java/lang/Double.doubleValue:()D
        //   195: goto            199
        //   198: athrow         
        //   199: dsub           
        //   200: d2i            
        //   201: istore_2       
        //   202: aload_0        
        //   203: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   206: getstatic       dev/nuker/pyro/fc.c:I
        //   209: ifge            218
        //   212: ldc_w           -834771991
        //   215: goto            221
        //   218: ldc_w           1844195007
        //   221: ldc_w           1835291118
        //   224: ixor           
        //   225: lookupswitch {
        //          -1646040088: 218
        //          -1554370041: 5852
        //          default: 252
        //        }
        //   252: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   255: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   258: aload_0        
        //   259: getfield        dev/nuker/pyro/f5c.c:Ldev/nuker/pyro/f0d;
        //   262: goto            266
        //   265: athrow         
        //   266: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   269: goto            273
        //   272: athrow         
        //   273: checkcast       Ljava/lang/Double;
        //   276: goto            280
        //   279: athrow         
        //   280: invokevirtual   java/lang/Double.doubleValue:()D
        //   283: goto            287
        //   286: athrow         
        //   287: dadd           
        //   288: d2i            
        //   289: getstatic       dev/nuker/pyro/fc.c:I
        //   292: ifge            301
        //   295: ldc_w           400456749
        //   298: goto            304
        //   301: ldc_w           107274647
        //   304: ldc_w           -1113433997
        //   307: ixor           
        //   308: lookupswitch {
        //          -1434704802: 5736
        //          1477443328: 301
        //          default: 336
        //        }
        //   336: istore_3       
        //   337: aload_0        
        //   338: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   341: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   344: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   347: aload_0        
        //   348: getstatic       dev/nuker/pyro/fc.1:I
        //   351: ifeq            360
        //   354: ldc_w           -939335231
        //   357: goto            363
        //   360: ldc_w           1145223433
        //   363: ldc_w           -969377945
        //   366: ixor           
        //   367: lookupswitch {
        //          -877117059: 360
        //          238720678: 5804
        //          default: 392
        //        }
        //   392: getfield        dev/nuker/pyro/f5c.c:Ldev/nuker/pyro/f0d;
        //   395: goto            399
        //   398: athrow         
        //   399: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   402: goto            406
        //   405: athrow         
        //   406: checkcast       Ljava/lang/Double;
        //   409: goto            413
        //   412: athrow         
        //   413: invokevirtual   java/lang/Double.doubleValue:()D
        //   416: goto            420
        //   419: athrow         
        //   420: dsub           
        //   421: d2i            
        //   422: istore          4
        //   424: aload_0        
        //   425: getstatic       dev/nuker/pyro/fc.0:I
        //   428: ifeq            437
        //   431: ldc_w           257365324
        //   434: goto            440
        //   437: ldc_w           804968386
        //   440: ldc_w           1427950596
        //   443: ixor           
        //   444: lookupswitch {
        //          1514920264: 437
        //          2061900742: 472
        //          default: 5692
        //        }
        //   472: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   475: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   478: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   481: aload_0        
        //   482: getfield        dev/nuker/pyro/f5c.c:Ldev/nuker/pyro/f0d;
        //   485: goto            489
        //   488: athrow         
        //   489: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   492: goto            496
        //   495: athrow         
        //   496: checkcast       Ljava/lang/Double;
        //   499: goto            503
        //   502: athrow         
        //   503: invokevirtual   java/lang/Double.doubleValue:()D
        //   506: goto            510
        //   509: athrow         
        //   510: dadd           
        //   511: d2i            
        //   512: getstatic       dev/nuker/pyro/fc.c:I
        //   515: ifge            524
        //   518: ldc_w           -127127451
        //   521: goto            527
        //   524: ldc_w           -604496041
        //   527: ldc_w           1652555872
        //   530: ixor           
        //   531: lookupswitch {
        //          -1695797243: 524
        //          -1183310025: 556
        //          default: 5814
        //        }
        //   556: istore          5
        //   558: aload_0        
        //   559: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   562: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   565: getstatic       dev/nuker/pyro/fc.1:I
        //   568: ifeq            577
        //   571: ldc_w           354545912
        //   574: goto            580
        //   577: ldc_w           1321243934
        //   580: ldc_w           1077439816
        //   583: ixor           
        //   584: lookupswitch {
        //          251197526: 612
        //          1427742128: 577
        //          default: 5774
        //        }
        //   612: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   615: aload_0        
        //   616: getfield        dev/nuker/pyro/f5c.c:Ldev/nuker/pyro/f0d;
        //   619: goto            623
        //   622: athrow         
        //   623: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   626: goto            630
        //   629: athrow         
        //   630: checkcast       Ljava/lang/Double;
        //   633: getstatic       dev/nuker/pyro/fc.1:I
        //   636: ifeq            645
        //   639: ldc_w           -1235489042
        //   642: goto            648
        //   645: ldc_w           1769229216
        //   648: ldc_w           1107625315
        //   651: ixor           
        //   652: lookupswitch {
        //          -550918042: 645
        //          -195105907: 5850
        //          default: 680
        //        }
        //   680: goto            684
        //   683: athrow         
        //   684: invokevirtual   java/lang/Double.doubleValue:()D
        //   687: goto            691
        //   690: athrow         
        //   691: dsub           
        //   692: d2i            
        //   693: getstatic       dev/nuker/pyro/fc.1:I
        //   696: ifeq            705
        //   699: ldc_w           529854421
        //   702: goto            708
        //   705: ldc_w           -628019740
        //   708: ldc_w           985353966
        //   711: ixor           
        //   712: lookupswitch {
        //          -534093046: 740
        //          623878459: 705
        //          default: 5714
        //        }
        //   740: istore          6
        //   742: aload_0        
        //   743: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   746: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   749: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   752: aload_0        
        //   753: getfield        dev/nuker/pyro/f5c.c:Ldev/nuker/pyro/f0d;
        //   756: goto            760
        //   759: athrow         
        //   760: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   763: goto            767
        //   766: athrow         
        //   767: checkcast       Ljava/lang/Double;
        //   770: getstatic       dev/nuker/pyro/fc.0:I
        //   773: ifeq            782
        //   776: ldc_w           -1619491635
        //   779: goto            785
        //   782: ldc_w           -2086808755
        //   785: ldc_w           -1849151591
        //   788: ixor           
        //   789: lookupswitch {
        //          246459220: 782
        //          307625172: 816
        //          default: 5820
        //        }
        //   816: goto            820
        //   819: athrow         
        //   820: invokevirtual   java/lang/Double.doubleValue:()D
        //   823: goto            827
        //   826: athrow         
        //   827: dadd           
        //   828: d2i            
        //   829: istore          7
        //   831: aconst_null    
        //   832: astore          8
        //   834: fconst_0       
        //   835: fstore          9
        //   837: aconst_null    
        //   838: astore          10
        //   840: aconst_null    
        //   841: astore          11
        //   843: new             Ljava/util/ArrayList;
        //   846: dup            
        //   847: aload_0        
        //   848: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   851: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   854: getstatic       dev/nuker/pyro/fc.1:I
        //   857: ifeq            866
        //   860: ldc_w           2003413871
        //   863: goto            869
        //   866: ldc_w           2084165771
        //   869: ldc_w           708149698
        //   872: ixor           
        //   873: lookupswitch {
        //          -934162580: 866
        //          1566321325: 5840
        //          default: 900
        //        }
        //   900: getfield        net/minecraft/client/multiplayer/WorldClient.field_73010_i:Ljava/util/List;
        //   903: goto            907
        //   906: athrow         
        //   907: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //   910: goto            914
        //   913: athrow         
        //   914: astore          12
        //   916: iload_2        
        //   917: getstatic       dev/nuker/pyro/fc.c:I
        //   920: ifge            929
        //   923: ldc_w           1514205572
        //   926: goto            932
        //   929: ldc_w           -955633880
        //   932: ldc_w           268295111
        //   935: ixor           
        //   936: lookupswitch {
        //          155754698: 929
        //          1438460483: 5780
        //          default: 964
        //        }
        //   964: istore          13
        //   966: iload           13
        //   968: iload_3        
        //   969: if_icmpge       2625
        //   972: iload           4
        //   974: istore          14
        //   976: getstatic       dev/nuker/pyro/fc.c:I
        //   979: ifge            988
        //   982: ldc_w           118065489
        //   985: goto            991
        //   988: ldc_w           1570787171
        //   991: ldc_w           -1043627670
        //   994: ixor           
        //   995: lookupswitch {
        //          -1670656503: 1020
        //          -960362437: 988
        //          default: 5728
        //        }
        //  1020: iload           14
        //  1022: iload           5
        //  1024: if_icmpge       2619
        //  1027: iload           6
        //  1029: istore          15
        //  1031: getstatic       dev/nuker/pyro/fc.0:I
        //  1034: ifeq            1043
        //  1037: ldc_w           -1535648370
        //  1040: goto            1046
        //  1043: ldc_w           -974803651
        //  1046: ldc_w           -1808692826
        //  1049: ixor           
        //  1050: lookupswitch {
        //          -1608317469: 1043
        //          809915432: 5704
        //          default: 1076
        //        }
        //  1076: iload           15
        //  1078: iload           7
        //  1080: if_icmpge       1089
        //  1083: ldc_w           -1571475595
        //  1086: goto            1092
        //  1089: ldc_w           -1571475594
        //  1092: ldc_w           1902804380
        //  1095: ixor           
        //  1096: tableswitch {
        //          -1501649454: 1120
        //          -1501649453: 2613
        //          default: 1083
        //        }
        //  1120: new             Lnet/minecraft/util/math/BlockPos;
        //  1123: dup            
        //  1124: iload           13
        //  1126: iload           14
        //  1128: getstatic       dev/nuker/pyro/fc.c:I
        //  1131: ifge            1140
        //  1134: ldc_w           -2079513663
        //  1137: goto            1143
        //  1140: ldc_w           -2058541831
        //  1143: ldc_w           1675483071
        //  1146: ixor           
        //  1147: lookupswitch {
        //          -426708154: 1172
        //          -405736322: 1140
        //          default: 5726
        //        }
        //  1172: iload           15
        //  1174: goto            1178
        //  1177: athrow         
        //  1178: invokespecial   net/minecraft/util/math/BlockPos.<init>:(III)V
        //  1181: goto            1185
        //  1184: athrow         
        //  1185: astore          16
        //  1187: aload_0        
        //  1188: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  1191: getstatic       dev/nuker/pyro/fc.c:I
        //  1194: ifge            1203
        //  1197: ldc_w           563525916
        //  1200: goto            1206
        //  1203: ldc_w           -339030200
        //  1206: ldc_w           -399263851
        //  1209: ixor           
        //  1210: lookupswitch {
        //          -911929719: 1203
        //          66681053: 1236
        //          default: 5796
        //        }
        //  1236: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1239: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  1242: getstatic       dev/nuker/pyro/fc.c:I
        //  1245: ifge            1254
        //  1248: ldc_w           1131795438
        //  1251: goto            1257
        //  1254: ldc_w           1685432497
        //  1257: ldc_w           -2088441343
        //  1260: ixor           
        //  1261: lookupswitch {
        //          -1057932817: 1254
        //          -403619152: 1288
        //          default: 5750
        //        }
        //  1288: aload           16
        //  1290: getstatic       dev/nuker/pyro/fc.0:I
        //  1293: ifeq            1302
        //  1296: ldc_w           1981228833
        //  1299: goto            1305
        //  1302: ldc_w           -608715568
        //  1305: ldc_w           -1527320263
        //  1308: ixor           
        //  1309: lookupswitch {
        //          -756951528: 1302
        //          2134986217: 1336
        //          default: 5744
        //        }
        //  1336: goto            1340
        //  1339: athrow         
        //  1340: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //  1343: goto            1347
        //  1346: athrow         
        //  1347: i2d            
        //  1348: ldc2_w          0.5
        //  1351: dadd           
        //  1352: dsub           
        //  1353: dstore          17
        //  1355: getstatic       dev/nuker/pyro/fc.0:I
        //  1358: ifeq            1367
        //  1361: ldc_w           855828340
        //  1364: goto            1370
        //  1367: ldc_w           575907584
        //  1370: ldc_w           140048386
        //  1373: ixor           
        //  1374: lookupswitch {
        //          705388290: 1400
        //          995762038: 1367
        //          default: 5702
        //        }
        //  1400: aload_0        
        //  1401: getstatic       dev/nuker/pyro/fc.0:I
        //  1404: ifeq            1413
        //  1407: ldc_w           870929451
        //  1410: goto            1416
        //  1413: ldc_w           523966576
        //  1416: ldc_w           56463821
        //  1419: ixor           
        //  1420: lookupswitch {
        //          -1657890688: 1413
        //          817153510: 5782
        //          default: 1448
        //        }
        //  1448: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  1451: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1454: getstatic       dev/nuker/pyro/fc.0:I
        //  1457: ifeq            1466
        //  1460: ldc_w           595016416
        //  1463: goto            1469
        //  1466: ldc_w           -1061321185
        //  1469: ldc_w           -1159511658
        //  1472: ixor           
        //  1473: lookupswitch {
        //          -1718322314: 5824
        //          -86574686: 1466
        //          default: 1500
        //        }
        //  1500: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  1503: aload           16
        //  1505: getstatic       dev/nuker/pyro/fc.c:I
        //  1508: ifge            1517
        //  1511: ldc_w           -644143553
        //  1514: goto            1520
        //  1517: ldc_w           1657706645
        //  1520: ldc_w           -457396631
        //  1523: ixor           
        //  1524: lookupswitch {
        //          -1225524333: 1517
        //          1026000982: 5826
        //          default: 1552
        //        }
        //  1552: goto            1556
        //  1555: athrow         
        //  1556: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //  1559: goto            1563
        //  1562: athrow         
        //  1563: i2d            
        //  1564: ldc2_w          0.5
        //  1567: dadd           
        //  1568: dsub           
        //  1569: ldc2_w          1.5
        //  1572: dadd           
        //  1573: dstore          19
        //  1575: aload_0        
        //  1576: getstatic       dev/nuker/pyro/fc.0:I
        //  1579: ifeq            1588
        //  1582: ldc_w           2123091103
        //  1585: goto            1591
        //  1588: ldc_w           1609775569
        //  1591: ldc_w           -1512206192
        //  1594: ixor           
        //  1595: lookupswitch {
        //          -615097329: 1588
        //          -97605311: 1620
        //          default: 5846
        //        }
        //  1620: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  1623: getstatic       dev/nuker/pyro/fc.c:I
        //  1626: ifge            1635
        //  1629: ldc_w           1534076954
        //  1632: goto            1638
        //  1635: ldc_w           -1229417076
        //  1638: ldc_w           861627518
        //  1641: ixor           
        //  1642: lookupswitch {
        //          281009401: 1635
        //          1747668068: 5716
        //          default: 1668
        //        }
        //  1668: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1671: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  1674: aload           16
        //  1676: goto            1680
        //  1679: athrow         
        //  1680: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //  1683: goto            1687
        //  1686: athrow         
        //  1687: i2d            
        //  1688: ldc2_w          0.5
        //  1691: dadd           
        //  1692: dsub           
        //  1693: dstore          21
        //  1695: dload           17
        //  1697: getstatic       dev/nuker/pyro/fc.1:I
        //  1700: ifeq            1709
        //  1703: ldc_w           272065479
        //  1706: goto            1712
        //  1709: ldc_w           1387453881
        //  1712: ldc_w           -862098899
        //  1715: ixor           
        //  1716: lookupswitch {
        //          -1641039980: 1744
        //          -592836118: 1709
        //          default: 5722
        //        }
        //  1744: dload           17
        //  1746: dmul           
        //  1747: dload           19
        //  1749: dload           19
        //  1751: dmul           
        //  1752: dadd           
        //  1753: dload           21
        //  1755: getstatic       dev/nuker/pyro/fc.0:I
        //  1758: ifeq            1767
        //  1761: ldc_w           -976805736
        //  1764: goto            1770
        //  1767: ldc_w           -1830320204
        //  1770: ldc_w           -1557601244
        //  1773: ixor           
        //  1774: lookupswitch {
        //          -145642427: 1767
        //          1726989500: 5798
        //          default: 1800
        //        }
        //  1800: dload           21
        //  1802: dmul           
        //  1803: dadd           
        //  1804: dstore          23
        //  1806: dload           23
        //  1808: ldc2_w          36.0
        //  1811: dcmpl          
        //  1812: ifle            1818
        //  1815: goto            2607
        //  1818: getstatic       dev/nuker/pyro/fc.0:I
        //  1821: ifeq            1830
        //  1824: ldc_w           -1954240856
        //  1827: goto            1833
        //  1830: ldc_w           -1145569751
        //  1833: ldc_w           218852054
        //  1836: ixor           
        //  1837: lookupswitch {
        //          -2037396354: 5776
        //          -716948762: 1830
        //          default: 1864
        //        }
        //  1864: aload           16
        //  1866: goto            1870
        //  1869: athrow         
        //  1870: invokestatic    dev/nuker/pyro/fbA.0:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/Block;
        //  1873: goto            1877
        //  1876: athrow         
        //  1877: getstatic       dev/nuker/pyro/fc.1:I
        //  1880: ifeq            1889
        //  1883: ldc_w           -1315604411
        //  1886: goto            1892
        //  1889: ldc_w           1519016736
        //  1892: ldc_w           1728927942
        //  1895: ixor           
        //  1896: lookupswitch {
        //          -725897724: 1889
        //          -694673277: 5720
        //          default: 1924
        //        }
        //  1924: astore          25
        //  1926: aload           25
        //  1928: instanceof      Lnet/minecraft/block/BlockBed;
        //  1931: ifeq            1940
        //  1934: ldc_w           666788235
        //  1937: goto            1943
        //  1940: ldc_w           666788276
        //  1943: ldc_w           1427895316
        //  1946: ixor           
        //  1947: tableswitch {
        //          -448058562: 1968
        //          -448058561: 2607
        //          default: 1934
        //        }
        //  1968: getstatic       dev/nuker/pyro/fc.c:I
        //  1971: ifge            1980
        //  1974: ldc_w           1599139589
        //  1977: goto            1983
        //  1980: ldc_w           1048927407
        //  1983: ldc_w           -274270232
        //  1986: ixor           
        //  1987: lookupswitch {
        //          -2108551177: 1980
        //          -1326049043: 5712
        //          default: 2012
        //        }
        //  2012: aload           12
        //  2014: getstatic       dev/nuker/pyro/fc.1:I
        //  2017: ifeq            2026
        //  2020: ldc_w           -1715072495
        //  2023: goto            2029
        //  2026: ldc_w           -217935559
        //  2029: ldc_w           -387195968
        //  2032: ixor           
        //  2033: lookupswitch {
        //          468273913: 2060
        //          1898826193: 2026
        //          default: 5738
        //        }
        //  2060: goto            2064
        //  2063: athrow         
        //  2064: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  2069: goto            2073
        //  2072: athrow         
        //  2073: getstatic       dev/nuker/pyro/fc.0:I
        //  2076: ifeq            2085
        //  2079: ldc_w           -1860887105
        //  2082: goto            2088
        //  2085: ldc_w           -1616619997
        //  2088: ldc_w           -1592087281
        //  2091: ixor           
        //  2092: lookupswitch {
        //          806334640: 2085
        //          1052703532: 2120
        //          default: 5822
        //        }
        //  2120: astore          26
        //  2122: getstatic       dev/nuker/pyro/fc.1:I
        //  2125: ifeq            2134
        //  2128: ldc_w           1499869652
        //  2131: goto            2137
        //  2134: ldc_w           -752248379
        //  2137: ldc_w           -671836305
        //  2140: ixor           
        //  2141: lookupswitch {
        //          -1902991685: 5842
        //          1581560803: 2134
        //          default: 2168
        //        }
        //  2168: aload           26
        //  2170: goto            2174
        //  2173: athrow         
        //  2174: invokeinterface java/util/Iterator.hasNext:()Z
        //  2179: goto            2183
        //  2182: athrow         
        //  2183: ifeq            2607
        //  2186: aload           26
        //  2188: goto            2192
        //  2191: athrow         
        //  2192: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2197: goto            2201
        //  2200: athrow         
        //  2201: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //  2204: getstatic       dev/nuker/pyro/fc.0:I
        //  2207: ifeq            2216
        //  2210: ldc_w           -1745349559
        //  2213: goto            2219
        //  2216: ldc_w           -1797455129
        //  2219: ldc_w           1907881154
        //  2222: ixor           
        //  2223: lookupswitch {
        //          -445975003: 2248
        //          -430972789: 2216
        //          default: 5742
        //        }
        //  2248: astore          27
        //  2250: aload           27
        //  2252: goto            2256
        //  2255: athrow         
        //  2256: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_70089_S:()Z
        //  2259: goto            2263
        //  2262: athrow         
        //  2263: ifeq            2604
        //  2266: getstatic       dev/nuker/pyro/fbq.c:Ldev/nuker/pyro/fbq;
        //  2269: aload           27
        //  2271: goto            2275
        //  2274: athrow         
        //  2275: invokevirtual   dev/nuker/pyro/fbq.c:(Lnet/minecraft/entity/player/EntityPlayer;)Z
        //  2278: goto            2282
        //  2281: athrow         
        //  2282: ifeq            2291
        //  2285: ldc_w           247614277
        //  2288: goto            2294
        //  2291: ldc_w           247614276
        //  2294: ldc_w           -991046239
        //  2297: ixor           
        //  2298: tableswitch {
        //          -1805697592: 2320
        //          -1805697591: 2604
        //          default: 2285
        //        }
        //  2320: getstatic       dev/nuker/pyro/fc.0:I
        //  2323: ifeq            2332
        //  2326: ldc_w           -561346230
        //  2329: goto            2335
        //  2332: ldc_w           547978208
        //  2335: ldc_w           -291965274
        //  2338: ixor           
        //  2339: lookupswitch {
        //          -835613370: 2364
        //          806518764: 2332
        //          default: 5710
        //        }
        //  2364: aload_0        
        //  2365: aload           16
        //  2367: getstatic       dev/nuker/pyro/fc.1:I
        //  2370: ifeq            2379
        //  2373: ldc_w           1197214721
        //  2376: goto            2382
        //  2379: ldc_w           -1777187686
        //  2382: ldc_w           -1143544701
        //  2385: ixor           
        //  2386: lookupswitch {
        //          -58005374: 2379
        //          767860761: 2412
        //          default: 5808
        //        }
        //  2412: aload           27
        //  2414: getstatic       dev/nuker/pyro/fc.1:I
        //  2417: ifeq            2426
        //  2420: ldc_w           1100519266
        //  2423: goto            2429
        //  2426: ldc_w           -308332510
        //  2429: ldc_w           -1094056686
        //  2432: ixor           
        //  2433: lookupswitch {
        //          -1794939746: 2426
        //          -11365776: 5790
        //          default: 2460
        //        }
        //  2460: goto            2464
        //  2463: athrow         
        //  2464: invokespecial   dev/nuker/pyro/f5c.c:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/EntityLivingBase;)F
        //  2467: goto            2471
        //  2470: athrow         
        //  2471: fstore          28
        //  2473: aload_0        
        //  2474: aload           16
        //  2476: aload_0        
        //  2477: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  2480: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2483: goto            2487
        //  2486: athrow         
        //  2487: invokespecial   dev/nuker/pyro/f5c.c:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/EntityLivingBase;)F
        //  2490: goto            2494
        //  2493: athrow         
        //  2494: getstatic       dev/nuker/pyro/fc.0:I
        //  2497: ifeq            2506
        //  2500: ldc_w           996398618
        //  2503: goto            2509
        //  2506: ldc_w           1666770490
        //  2509: ldc_w           1188688694
        //  2512: ixor           
        //  2513: lookupswitch {
        //          629216524: 2540
        //          2109351212: 2506
        //          default: 5810
        //        }
        //  2540: fstore          29
        //  2542: fload           28
        //  2544: fload           9
        //  2546: fcmpl          
        //  2547: iflt            2604
        //  2550: getstatic       dev/nuker/pyro/fc.1:I
        //  2553: ifeq            2562
        //  2556: ldc_w           421470472
        //  2559: goto            2565
        //  2562: ldc_w           1719533844
        //  2565: ldc_w           538164347
        //  2568: ixor           
        //  2569: lookupswitch {
        //          957128051: 2562
        //          1181597039: 2596
        //          default: 5754
        //        }
        //  2596: aload           16
        //  2598: astore          8
        //  2600: fload           28
        //  2602: fstore          9
        //  2604: goto            2122
        //  2607: iinc            15, 1
        //  2610: goto            1031
        //  2613: iinc            14, 1
        //  2616: goto            976
        //  2619: iinc            13, 1
        //  2622: goto            966
        //  2625: aload           8
        //  2627: ifnull          3126
        //  2630: goto            2634
        //  2633: athrow         
        //  2634: invokestatic    dev/nuker/pyro/fbP.1:()Ldev/nuker/pyro/fbP;
        //  2637: goto            2641
        //  2640: athrow         
        //  2641: getstatic       dev/nuker/pyro/fc.0:I
        //  2644: ifeq            2653
        //  2647: ldc_w           1440751906
        //  2650: goto            2656
        //  2653: ldc_w           -106303625
        //  2656: ldc_w           -1889481949
        //  2659: ixor           
        //  2660: lookupswitch {
        //          -629085695: 2653
        //          1992893524: 2688
        //          default: 5772
        //        }
        //  2688: aload           8
        //  2690: getstatic       dev/nuker/pyro/fc.0:I
        //  2693: ifeq            2702
        //  2696: ldc_w           -834452673
        //  2699: goto            2705
        //  2702: ldc_w           1819949479
        //  2705: ldc_w           2052362251
        //  2708: ixor           
        //  2709: lookupswitch {
        //          -1273507020: 5792
        //          1266146857: 2702
        //          default: 2736
        //        }
        //  2736: goto            2740
        //  2739: athrow         
        //  2740: invokevirtual   dev/nuker/pyro/fbP.0:(Lnet/minecraft/util/math/BlockPos;)Ldev/nuker/pyro/fbQ;
        //  2743: goto            2747
        //  2746: athrow         
        //  2747: astore          13
        //  2749: getstatic       dev/nuker/pyro/fc.0:I
        //  2752: ifeq            2761
        //  2755: ldc_w           246051619
        //  2758: goto            2764
        //  2761: ldc_w           757493407
        //  2764: ldc_w           1966399630
        //  2767: ixor           
        //  2768: lookupswitch {
        //          1477611025: 2796
        //          2073990061: 2761
        //          default: 5724
        //        }
        //  2796: aload           13
        //  2798: ifnull          2807
        //  2801: ldc_w           1303199365
        //  2804: goto            2810
        //  2807: ldc_w           1303199364
        //  2810: ldc_w           -535076427
        //  2813: ixor           
        //  2814: tableswitch {
        //          1533853280: 2836
        //          1533853281: 3123
        //          default: 2801
        //        }
        //  2836: getstatic       dev/nuker/pyro/fc.1:I
        //  2839: ifeq            2848
        //  2842: ldc_w           -1548881059
        //  2845: goto            2851
        //  2848: ldc_w           687017662
        //  2851: ldc_w           2009009928
        //  2854: ixor           
        //  2855: lookupswitch {
        //          -736953259: 2848
        //          1598816694: 2880
        //          default: 5690
        //        }
        //  2880: aload_1        
        //  2881: goto            2885
        //  2884: athrow         
        //  2885: invokevirtual   dev/nuker/pyro/f3i.c:()V
        //  2888: goto            2892
        //  2891: athrow         
        //  2892: aload_1        
        //  2893: getstatic       dev/nuker/pyro/fc.0:I
        //  2896: ifeq            2905
        //  2899: ldc_w           -961212456
        //  2902: goto            2908
        //  2905: ldc_w           1203998677
        //  2908: ldc_w           287847366
        //  2911: ixor           
        //  2912: lookupswitch {
        //          -677561314: 5740
        //          1962658471: 2905
        //          default: 2940
        //        }
        //  2940: aload           13
        //  2942: goto            2946
        //  2945: athrow         
        //  2946: invokevirtual   dev/nuker/pyro/fbQ.1:()Ldev/nuker/pyro/fbN;
        //  2949: goto            2953
        //  2952: athrow         
        //  2953: goto            2957
        //  2956: athrow         
        //  2957: invokevirtual   dev/nuker/pyro/fbN.2:()F
        //  2960: goto            2964
        //  2963: athrow         
        //  2964: goto            2968
        //  2967: athrow         
        //  2968: invokevirtual   dev/nuker/pyro/f3i.0:(F)V
        //  2971: goto            2975
        //  2974: athrow         
        //  2975: aload_1        
        //  2976: getstatic       dev/nuker/pyro/fc.0:I
        //  2979: ifeq            2988
        //  2982: ldc_w           -1518117001
        //  2985: goto            2991
        //  2988: ldc_w           1011771868
        //  2991: ldc_w           2015900081
        //  2994: ixor           
        //  2995: lookupswitch {
        //          -575967546: 2988
        //          1147557997: 3020
        //          default: 5830
        //        }
        //  3020: aload           13
        //  3022: goto            3026
        //  3025: athrow         
        //  3026: invokevirtual   dev/nuker/pyro/fbQ.1:()Ldev/nuker/pyro/fbN;
        //  3029: goto            3033
        //  3032: athrow         
        //  3033: goto            3037
        //  3036: athrow         
        //  3037: invokevirtual   dev/nuker/pyro/fbN.c:()F
        //  3040: goto            3044
        //  3043: athrow         
        //  3044: getstatic       dev/nuker/pyro/fc.c:I
        //  3047: ifge            3056
        //  3050: ldc_w           640046276
        //  3053: goto            3059
        //  3056: ldc_w           979076701
        //  3059: ldc_w           -802617129
        //  3062: ixor           
        //  3063: lookupswitch {
        //          -361591158: 3088
        //          -166765549: 3056
        //          default: 5698
        //        }
        //  3088: goto            3092
        //  3091: athrow         
        //  3092: invokevirtual   dev/nuker/pyro/f3i.c:(F)V
        //  3095: goto            3099
        //  3098: athrow         
        //  3099: aload           8
        //  3101: astore          14
        //  3103: aload_1        
        //  3104: aload_0        
        //  3105: aload           14
        //  3107: invokedynamic   BootstrapMethod #0, accept:(Ldev/nuker/pyro/f5c;Lnet/minecraft/util/math/BlockPos;)Ljava/util/function/Consumer;
        //  3112: goto            3116
        //  3115: athrow         
        //  3116: invokevirtual   dev/nuker/pyro/f3i.c:(Ljava/util/function/Consumer;)V
        //  3119: goto            3123
        //  3122: athrow         
        //  3123: goto            5689
        //  3126: iload_2        
        //  3127: istore          13
        //  3129: getstatic       dev/nuker/pyro/fc.c:I
        //  3132: ifge            3141
        //  3135: ldc_w           -746776475
        //  3138: goto            3144
        //  3141: ldc_w           1797097852
        //  3144: ldc_w           1044990932
        //  3147: ixor           
        //  3148: lookupswitch {
        //          -315337807: 3141
        //          1431618216: 3176
        //          default: 5838
        //        }
        //  3176: iload           13
        //  3178: iload_3        
        //  3179: if_icmpge       4985
        //  3182: iload           4
        //  3184: istore          14
        //  3186: getstatic       dev/nuker/pyro/fc.1:I
        //  3189: ifeq            3198
        //  3192: ldc_w           1395786679
        //  3195: goto            3201
        //  3198: ldc_w           -905554448
        //  3201: ldc_w           -1195430234
        //  3204: ixor           
        //  3205: lookupswitch {
        //          -343069423: 5832
        //          1398359591: 3198
        //          default: 3232
        //        }
        //  3232: iload           14
        //  3234: getstatic       dev/nuker/pyro/fc.1:I
        //  3237: ifeq            3246
        //  3240: ldc_w           -2045898881
        //  3243: goto            3249
        //  3246: ldc_w           1658509292
        //  3249: ldc_w           -2125921639
        //  3252: ixor           
        //  3253: lookupswitch {
        //          -476850827: 3280
        //          122097126: 3246
        //          default: 5760
        //        }
        //  3280: iload           5
        //  3282: if_icmpge       4979
        //  3285: getstatic       dev/nuker/pyro/fc.c:I
        //  3288: ifge            3297
        //  3291: ldc_w           -116364087
        //  3294: goto            3300
        //  3297: ldc_w           -617189871
        //  3300: ldc_w           338041112
        //  3303: ixor           
        //  3304: lookupswitch {
        //          -315197999: 5844
        //          721067515: 3297
        //          default: 3332
        //        }
        //  3332: iload           6
        //  3334: getstatic       dev/nuker/pyro/fc.0:I
        //  3337: ifeq            3346
        //  3340: ldc_w           1563519663
        //  3343: goto            3349
        //  3346: ldc_w           229703290
        //  3349: ldc_w           136232855
        //  3352: ixor           
        //  3353: lookupswitch {
        //          95306221: 3380
        //          1429198136: 3346
        //          default: 5762
        //        }
        //  3380: istore          15
        //  3382: iload           15
        //  3384: iload           7
        //  3386: if_icmpge       4973
        //  3389: new             Lnet/minecraft/util/math/BlockPos;
        //  3392: dup            
        //  3393: iload           13
        //  3395: getstatic       dev/nuker/pyro/fc.c:I
        //  3398: ifge            3407
        //  3401: ldc_w           -410872933
        //  3404: goto            3410
        //  3407: ldc_w           -118204589
        //  3410: ldc_w           596684168
        //  3413: ixor           
        //  3414: lookupswitch {
        //          -1005437421: 3407
        //          -614139173: 3440
        //          default: 5746
        //        }
        //  3440: iload           14
        //  3442: iload           15
        //  3444: goto            3448
        //  3447: athrow         
        //  3448: invokespecial   net/minecraft/util/math/BlockPos.<init>:(III)V
        //  3451: goto            3455
        //  3454: athrow         
        //  3455: getstatic       dev/nuker/pyro/fc.0:I
        //  3458: ifeq            3467
        //  3461: ldc_w           -1258109497
        //  3464: goto            3470
        //  3467: ldc_w           -1620714612
        //  3470: ldc_w           -958788725
        //  3473: ixor           
        //  3474: lookupswitch {
        //          944650442: 3467
        //          1943588428: 5730
        //          default: 3500
        //        }
        //  3500: astore          16
        //  3502: aload_0        
        //  3503: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  3506: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3509: getstatic       dev/nuker/pyro/fc.0:I
        //  3512: ifeq            3521
        //  3515: ldc_w           2060273251
        //  3518: goto            3524
        //  3521: ldc_w           1221217289
        //  3524: ldc_w           -1475055493
        //  3527: ixor           
        //  3528: lookupswitch {
        //          -757516776: 3521
        //          -522306446: 3556
        //          default: 5734
        //        }
        //  3556: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  3559: aload           16
        //  3561: goto            3565
        //  3564: athrow         
        //  3565: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //  3568: goto            3572
        //  3571: athrow         
        //  3572: i2d            
        //  3573: ldc2_w          0.5
        //  3576: dadd           
        //  3577: dsub           
        //  3578: dstore          17
        //  3580: aload_0        
        //  3581: getstatic       dev/nuker/pyro/fc.c:I
        //  3584: ifge            3593
        //  3587: ldc_w           -969142816
        //  3590: goto            3596
        //  3593: ldc_w           1628368770
        //  3596: ldc_w           -489672011
        //  3599: ixor           
        //  3600: lookupswitch {
        //          -2082546377: 3628
        //          619462485: 3593
        //          default: 5748
        //        }
        //  3628: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  3631: getstatic       dev/nuker/pyro/fc.1:I
        //  3634: ifeq            3643
        //  3637: ldc_w           -738227429
        //  3640: goto            3646
        //  3643: ldc_w           732258278
        //  3646: ldc_w           399453257
        //  3649: ixor           
        //  3650: lookupswitch {
        //          -1003444398: 3643
        //          1013609391: 3676
        //          default: 5834
        //        }
        //  3676: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3679: getstatic       dev/nuker/pyro/fc.c:I
        //  3682: ifge            3691
        //  3685: ldc_w           -288743806
        //  3688: goto            3694
        //  3691: ldc_w           -1136664374
        //  3694: ldc_w           2005154870
        //  3697: ixor           
        //  3698: lookupswitch {
        //          -1722932556: 3691
        //          -876880644: 3724
        //          default: 5818
        //        }
        //  3724: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  3727: aload           16
        //  3729: goto            3733
        //  3732: athrow         
        //  3733: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //  3736: goto            3740
        //  3739: athrow         
        //  3740: i2d            
        //  3741: ldc2_w          0.5
        //  3744: dadd           
        //  3745: dsub           
        //  3746: ldc2_w          1.5
        //  3749: dadd           
        //  3750: dstore          19
        //  3752: aload_0        
        //  3753: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  3756: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3759: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  3762: aload           16
        //  3764: goto            3768
        //  3767: athrow         
        //  3768: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //  3771: goto            3775
        //  3774: athrow         
        //  3775: i2d            
        //  3776: ldc2_w          0.5
        //  3779: dadd           
        //  3780: dsub           
        //  3781: dstore          21
        //  3783: dload           17
        //  3785: dload           17
        //  3787: dmul           
        //  3788: getstatic       dev/nuker/pyro/fc.1:I
        //  3791: ifeq            3800
        //  3794: ldc_w           1133880885
        //  3797: goto            3803
        //  3800: ldc_w           1449696027
        //  3803: ldc_w           1431509706
        //  3806: ixor           
        //  3807: lookupswitch {
        //          382123263: 5816
        //          1940644961: 3800
        //          default: 3832
        //        }
        //  3832: dload           19
        //  3834: dload           19
        //  3836: dmul           
        //  3837: dadd           
        //  3838: getstatic       dev/nuker/pyro/fc.0:I
        //  3841: ifeq            3850
        //  3844: ldc_w           237957363
        //  3847: goto            3853
        //  3850: ldc_w           1246655734
        //  3853: ldc_w           586247359
        //  3856: ixor           
        //  3857: lookupswitch {
        //          752852044: 5696
        //          1113594406: 3850
        //          default: 3884
        //        }
        //  3884: dload           21
        //  3886: dload           21
        //  3888: dmul           
        //  3889: dadd           
        //  3890: dstore          23
        //  3892: dload           23
        //  3894: ldc2_w          36.0
        //  3897: dcmpl          
        //  3898: ifle            3904
        //  3901: goto            4967
        //  3904: getstatic       dev/nuker/pyro/fc.0:I
        //  3907: ifeq            3916
        //  3910: ldc_w           -1503222240
        //  3913: goto            3919
        //  3916: ldc_w           -1594111331
        //  3919: ldc_w           -1844574699
        //  3922: ixor           
        //  3923: lookupswitch {
        //          854969480: 3948
        //          879271989: 3916
        //          default: 5756
        //        }
        //  3948: aload           16
        //  3950: getstatic       dev/nuker/pyro/fc.0:I
        //  3953: ifeq            3962
        //  3956: ldc_w           -946812245
        //  3959: goto            3965
        //  3962: ldc_w           229172835
        //  3965: ldc_w           -623096009
        //  3968: ixor           
        //  3969: lookupswitch {
        //          -680220332: 3996
        //          491554204: 3962
        //          default: 5764
        //        }
        //  3996: goto            4000
        //  3999: athrow         
        //  4000: invokestatic    dev/nuker/pyro/fbA.0:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/Block;
        //  4003: goto            4007
        //  4006: athrow         
        //  4007: getstatic       net/minecraft/init/Blocks.field_150350_a:Lnet/minecraft/block/Block;
        //  4010: goto            4014
        //  4013: athrow         
        //  4014: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //  4017: goto            4021
        //  4020: athrow         
        //  4021: ifne            4967
        //  4024: aload_0        
        //  4025: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  4028: getstatic       dev/nuker/pyro/fc.1:I
        //  4031: ifeq            4040
        //  4034: ldc_w           429534797
        //  4037: goto            4043
        //  4040: ldc_w           808520111
        //  4043: ldc_w           493296535
        //  4046: ixor           
        //  4047: lookupswitch {
        //          -1243502472: 4040
        //          83703258: 5848
        //          default: 4072
        //        }
        //  4072: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  4075: aconst_null    
        //  4076: new             Lnet/minecraft/util/math/AxisAlignedBB;
        //  4079: dup            
        //  4080: getstatic       dev/nuker/pyro/fc.c:I
        //  4083: ifge            4092
        //  4086: ldc_w           593094601
        //  4089: goto            4095
        //  4092: ldc_w           736648616
        //  4095: ldc_w           -1956671668
        //  4098: ixor           
        //  4099: lookupswitch {
        //          -1598565660: 4124
        //          -1475975035: 4092
        //          default: 5800
        //        }
        //  4124: iload           13
        //  4126: i2d            
        //  4127: getstatic       dev/nuker/pyro/fc.c:I
        //  4130: ifge            4139
        //  4133: ldc_w           -1667641050
        //  4136: goto            4142
        //  4139: ldc_w           -1947001031
        //  4142: ldc_w           336631380
        //  4145: ixor           
        //  4146: lookupswitch {
        //          -2004269198: 4139
        //          -1612478099: 4172
        //          default: 5828
        //        }
        //  4172: iload           14
        //  4174: i2d            
        //  4175: getstatic       dev/nuker/pyro/fc.0:I
        //  4178: ifeq            4187
        //  4181: ldc_w           -1986701532
        //  4184: goto            4190
        //  4187: ldc_w           -1582921626
        //  4190: ldc_w           1928122021
        //  4193: ixor           
        //  4194: lookupswitch {
        //          -750106941: 4220
        //          -75916927: 4187
        //          default: 5802
        //        }
        //  4220: iload           15
        //  4222: i2d            
        //  4223: iload           13
        //  4225: iconst_1       
        //  4226: iadd           
        //  4227: i2d            
        //  4228: iload           14
        //  4230: iconst_1       
        //  4231: iadd           
        //  4232: i2d            
        //  4233: iload           15
        //  4235: iconst_1       
        //  4236: iadd           
        //  4237: i2d            
        //  4238: getstatic       dev/nuker/pyro/fc.1:I
        //  4241: ifeq            4250
        //  4244: ldc_w           910811626
        //  4247: goto            4253
        //  4250: ldc_w           1396749351
        //  4253: ldc_w           -1031519529
        //  4256: ixor           
        //  4257: lookupswitch {
        //          -462614138: 4250
        //          -187849923: 5770
        //          default: 4284
        //        }
        //  4284: goto            4288
        //  4287: athrow         
        //  4288: invokespecial   net/minecraft/util/math/AxisAlignedBB.<init>:(DDDDDD)V
        //  4291: goto            4295
        //  4294: athrow         
        //  4295: goto            4299
        //  4298: athrow         
        //  4299: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_72839_b:(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
        //  4302: goto            4306
        //  4305: athrow         
        //  4306: goto            4310
        //  4309: athrow         
        //  4310: invokeinterface java/util/List.isEmpty:()Z
        //  4315: goto            4319
        //  4318: athrow         
        //  4319: ifeq            4967
        //  4322: getstatic       dev/nuker/pyro/fc.0:I
        //  4325: ifeq            4334
        //  4328: ldc_w           -1313583140
        //  4331: goto            4337
        //  4334: ldc_w           -1659980051
        //  4337: ldc_w           -904475133
        //  4340: ixor           
        //  4341: lookupswitch {
        //          1461221614: 4368
        //          2074247647: 4334
        //          default: 5768
        //        }
        //  4368: aload_0        
        //  4369: aload           16
        //  4371: goto            4375
        //  4374: athrow         
        //  4375: invokespecial   dev/nuker/pyro/f5c.c:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/EnumFacing;
        //  4378: goto            4382
        //  4381: athrow         
        //  4382: astore          25
        //  4384: aload           25
        //  4386: ifnull          4967
        //  4389: getstatic       dev/nuker/pyro/fc.1:I
        //  4392: ifeq            4401
        //  4395: ldc_w           1003373197
        //  4398: goto            4404
        //  4401: ldc_w           -1009217509
        //  4404: ldc_w           1083835159
        //  4407: ixor           
        //  4408: lookupswitch {
        //          -2092788980: 4436
        //          2069119386: 4401
        //          default: 5854
        //        }
        //  4436: aload           12
        //  4438: goto            4442
        //  4441: athrow         
        //  4442: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  4447: goto            4451
        //  4450: athrow         
        //  4451: astore          26
        //  4453: aload           26
        //  4455: getstatic       dev/nuker/pyro/fc.1:I
        //  4458: ifeq            4467
        //  4461: ldc_w           1061659644
        //  4464: goto            4470
        //  4467: ldc_w           -399778053
        //  4470: ldc_w           -254290784
        //  4473: ixor           
        //  4474: lookupswitch {
        //          -812615844: 4467
        //          419170907: 4500
        //          default: 5752
        //        }
        //  4500: goto            4504
        //  4503: athrow         
        //  4504: invokeinterface java/util/Iterator.hasNext:()Z
        //  4509: goto            4513
        //  4512: athrow         
        //  4513: ifeq            4522
        //  4516: ldc_w           1383591546
        //  4519: goto            4525
        //  4522: ldc_w           1383591547
        //  4525: ldc_w           406093988
        //  4528: ixor           
        //  4529: tableswitch {
        //          -1803100740: 4552
        //          -1803100739: 4967
        //          default: 4516
        //        }
        //  4552: aload           26
        //  4554: getstatic       dev/nuker/pyro/fc.1:I
        //  4557: ifeq            4566
        //  4560: ldc_w           -785995396
        //  4563: goto            4569
        //  4566: ldc_w           -2117635682
        //  4569: ldc_w           1193561096
        //  4572: ixor           
        //  4573: lookupswitch {
        //          -1778195084: 4566
        //          -958186090: 4600
        //          default: 5812
        //        }
        //  4600: goto            4604
        //  4603: athrow         
        //  4604: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  4609: goto            4613
        //  4612: athrow         
        //  4613: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //  4616: astore          27
        //  4618: getstatic       dev/nuker/pyro/fc.0:I
        //  4621: ifeq            4630
        //  4624: ldc_w           -225076163
        //  4627: goto            4633
        //  4630: ldc_w           1241976906
        //  4633: ldc_w           -851313339
        //  4636: ixor           
        //  4637: lookupswitch {
        //          -2025394929: 4664
        //          1070883192: 4630
        //          default: 5694
        //        }
        //  4664: aload           27
        //  4666: goto            4670
        //  4669: athrow         
        //  4670: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_70089_S:()Z
        //  4673: goto            4677
        //  4676: athrow         
        //  4677: ifeq            4686
        //  4680: ldc_w           -1341364993
        //  4683: goto            4689
        //  4686: ldc_w           -1341364996
        //  4689: ldc_w           1063384250
        //  4692: ixor           
        //  4693: tableswitch {
        //          517677194: 4716
        //          517677195: 4964
        //          default: 4680
        //        }
        //  4716: getstatic       dev/nuker/pyro/fbq.c:Ldev/nuker/pyro/fbq;
        //  4719: aload           27
        //  4721: goto            4725
        //  4724: athrow         
        //  4725: invokevirtual   dev/nuker/pyro/fbq.c:(Lnet/minecraft/entity/player/EntityPlayer;)Z
        //  4728: goto            4732
        //  4731: athrow         
        //  4732: ifeq            4964
        //  4735: aload_0        
        //  4736: aload           16
        //  4738: aload           27
        //  4740: getstatic       dev/nuker/pyro/fc.1:I
        //  4743: ifeq            4752
        //  4746: ldc_w           -1588484704
        //  4749: goto            4755
        //  4752: ldc_w           -1734336284
        //  4755: ldc_w           -1186452610
        //  4758: ixor           
        //  4759: lookupswitch {
        //          404328158: 4752
        //          568855450: 4784
        //          default: 5836
        //        }
        //  4784: goto            4788
        //  4787: athrow         
        //  4788: invokespecial   dev/nuker/pyro/f5c.0:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/EntityLivingBase;)F
        //  4791: goto            4795
        //  4794: athrow         
        //  4795: getstatic       dev/nuker/pyro/fc.c:I
        //  4798: ifge            4807
        //  4801: ldc_w           -764519503
        //  4804: goto            4810
        //  4807: ldc_w           -702582141
        //  4810: ldc_w           -1376414029
        //  4813: ixor           
        //  4814: lookupswitch {
        //          2078991408: 4840
        //          2140916994: 4807
        //          default: 5794
        //        }
        //  4840: fstore          28
        //  4842: aload_0        
        //  4843: aload           16
        //  4845: aload_0        
        //  4846: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  4849: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4852: goto            4856
        //  4855: athrow         
        //  4856: invokespecial   dev/nuker/pyro/f5c.0:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/EntityLivingBase;)F
        //  4859: goto            4863
        //  4862: athrow         
        //  4863: getstatic       dev/nuker/pyro/fc.0:I
        //  4866: ifeq            4875
        //  4869: ldc_w           -644807026
        //  4872: goto            4878
        //  4875: ldc_w           728854199
        //  4878: ldc_w           -1471573010
        //  4881: ixor           
        //  4882: lookupswitch {
        //          -2093417127: 4908
        //          1910019424: 4875
        //          default: 5784
        //        }
        //  4908: fstore          29
        //  4910: fload           28
        //  4912: fload           9
        //  4914: fcmpl          
        //  4915: iflt            4924
        //  4918: ldc_w           673503011
        //  4921: goto            4927
        //  4924: ldc_w           673503068
        //  4927: ldc_w           -1442595940
        //  4930: ixor           
        //  4931: tableswitch {
        //          72276350: 4952
        //          72276351: 4964
        //          default: 4918
        //        }
        //  4952: aload           16
        //  4954: astore          10
        //  4956: fload           28
        //  4958: fstore          9
        //  4960: aload           25
        //  4962: astore          11
        //  4964: goto            4453
        //  4967: iinc            15, 1
        //  4970: goto            3382
        //  4973: iinc            14, 1
        //  4976: goto            3186
        //  4979: iinc            13, 1
        //  4982: goto            3129
        //  4985: aload           10
        //  4987: ifnull          5689
        //  4990: aload           11
        //  4992: ifnull          5689
        //  4995: aload_1        
        //  4996: goto            5000
        //  4999: athrow         
        //  5000: invokevirtual   dev/nuker/pyro/f3i.c:()V
        //  5003: goto            5007
        //  5006: athrow         
        //  5007: iconst_0       
        //  5008: istore          13
        //  5010: iload           13
        //  5012: bipush          9
        //  5014: if_icmpge       5023
        //  5017: ldc_w           1095714858
        //  5020: goto            5026
        //  5023: ldc_w           1095714859
        //  5026: ldc_w           2046254954
        //  5029: ixor           
        //  5030: tableswitch {
        //          1903177344: 5052
        //          1903177345: 5689
        //          default: 5017
        //        }
        //  5052: aload_0        
        //  5053: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  5056: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  5059: getstatic       dev/nuker/pyro/fc.1:I
        //  5062: ifeq            5071
        //  5065: ldc_w           921831362
        //  5068: goto            5074
        //  5071: ldc_w           -579683964
        //  5074: ldc_w           -779468918
        //  5077: ixor           
        //  5078: lookupswitch {
        //          -411551672: 5806
        //          976914535: 5071
        //          default: 5104
        //        }
        //  5104: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  5107: iload           13
        //  5109: getstatic       dev/nuker/pyro/fc.c:I
        //  5112: ifge            5121
        //  5115: ldc_w           -997065466
        //  5118: goto            5124
        //  5121: ldc_w           2107098659
        //  5124: ldc_w           759678509
        //  5127: ixor           
        //  5128: lookupswitch {
        //          -629712087: 5121
        //          -371836117: 5766
        //          default: 5156
        //        }
        //  5156: goto            5160
        //  5159: athrow         
        //  5160: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70301_a:(I)Lnet/minecraft/item/ItemStack;
        //  5163: goto            5167
        //  5166: athrow         
        //  5167: getstatic       dev/nuker/pyro/fc.c:I
        //  5170: ifge            5179
        //  5173: ldc_w           1168010826
        //  5176: goto            5182
        //  5179: ldc_w           -320808690
        //  5182: ldc_w           671516132
        //  5185: ixor           
        //  5186: lookupswitch {
        //          -991535894: 5212
        //          1838738350: 5179
        //          default: 5706
        //        }
        //  5212: goto            5216
        //  5215: athrow         
        //  5216: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  5219: goto            5223
        //  5222: athrow         
        //  5223: getstatic       net/minecraft/init/Items.field_151104_aV:Lnet/minecraft/item/Item;
        //  5226: getstatic       dev/nuker/pyro/fc.0:I
        //  5229: ifeq            5238
        //  5232: ldc_w           666727
        //  5235: goto            5241
        //  5238: ldc_w           537606016
        //  5241: ldc_w           -337806870
        //  5244: ixor           
        //  5245: lookupswitch {
        //          -338209395: 5788
        //          745739335: 5238
        //          default: 5272
        //        }
        //  5272: goto            5276
        //  5275: athrow         
        //  5276: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //  5279: goto            5283
        //  5282: athrow         
        //  5283: ifeq            5683
        //  5286: aload_0        
        //  5287: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  5290: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  5293: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  5296: iload           13
        //  5298: putfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //  5301: aload_0        
        //  5302: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  5305: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  5308: goto            5312
        //  5311: athrow         
        //  5312: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78765_e:()V
        //  5315: goto            5319
        //  5318: athrow         
        //  5319: aload           10
        //  5321: goto            5325
        //  5324: athrow         
        //  5325: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //  5328: goto            5332
        //  5331: athrow         
        //  5332: i2d            
        //  5333: ldc2_w          0.5
        //  5336: dadd           
        //  5337: aload           10
        //  5339: goto            5343
        //  5342: athrow         
        //  5343: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //  5346: goto            5350
        //  5349: athrow         
        //  5350: i2d            
        //  5351: aload           10
        //  5353: goto            5357
        //  5356: athrow         
        //  5357: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //  5360: goto            5364
        //  5363: athrow         
        //  5364: i2d            
        //  5365: ldc2_w          0.5
        //  5368: dadd           
        //  5369: goto            5373
        //  5372: athrow         
        //  5373: invokestatic    dev/nuker/pyro/fby.c:(DDD)[F
        //  5376: goto            5380
        //  5379: athrow         
        //  5380: getstatic       dev/nuker/pyro/fc.c:I
        //  5383: ifge            5392
        //  5386: ldc_w           -1017015641
        //  5389: goto            5395
        //  5392: ldc_w           -1353986742
        //  5395: ldc_w           -765348112
        //  5398: ixor           
        //  5399: lookupswitch {
        //          285221975: 5718
        //          1256127627: 5392
        //          default: 5424
        //        }
        //  5424: astore          14
        //  5426: getstatic       dev/nuker/pyro/fc.1:I
        //  5429: ifeq            5438
        //  5432: ldc_w           -106448314
        //  5435: goto            5441
        //  5438: ldc_w           1278371882
        //  5441: ldc_w           885082422
        //  5444: ixor           
        //  5445: lookupswitch {
        //          -848891024: 5438
        //          2029199644: 5472
        //          default: 5732
        //        }
        //  5472: aload           14
        //  5474: ifnull          5683
        //  5477: aload_1        
        //  5478: goto            5482
        //  5481: athrow         
        //  5482: invokevirtual   dev/nuker/pyro/f3i.c:()V
        //  5485: goto            5489
        //  5488: athrow         
        //  5489: aload_1        
        //  5490: aload           14
        //  5492: iconst_1       
        //  5493: faload         
        //  5494: goto            5498
        //  5497: athrow         
        //  5498: invokevirtual   dev/nuker/pyro/f3i.0:(F)V
        //  5501: goto            5505
        //  5504: athrow         
        //  5505: aload_1        
        //  5506: aload           14
        //  5508: iconst_0       
        //  5509: faload         
        //  5510: goto            5514
        //  5513: athrow         
        //  5514: invokevirtual   dev/nuker/pyro/f3i.c:(F)V
        //  5517: goto            5521
        //  5520: athrow         
        //  5521: aload           10
        //  5523: getstatic       dev/nuker/pyro/fc.0:I
        //  5526: ifeq            5535
        //  5529: ldc_w           -1469200718
        //  5532: goto            5538
        //  5535: ldc_w           2022812031
        //  5538: ldc_w           -1072186809
        //  5541: ixor           
        //  5542: lookupswitch {
        //          -1837580551: 5535
        //          1752857845: 5786
        //          default: 5568
        //        }
        //  5568: astore          15
        //  5570: getstatic       dev/nuker/pyro/fc.1:I
        //  5573: ifeq            5582
        //  5576: ldc_w           1322666363
        //  5579: goto            5585
        //  5582: ldc_w           -67289393
        //  5585: ldc_w           2037068609
        //  5588: ixor           
        //  5589: lookupswitch {
        //          -1116050368: 5582
        //          935164474: 5778
        //          default: 5616
        //        }
        //  5616: aload_1        
        //  5617: getstatic       dev/nuker/pyro/fc.1:I
        //  5620: ifeq            5629
        //  5623: ldc_w           2126827118
        //  5626: goto            5632
        //  5629: ldc_w           -1131724400
        //  5632: ldc_w           1701132560
        //  5635: ixor           
        //  5636: lookupswitch {
        //          463599486: 5708
        //          1096319478: 5629
        //          default: 5664
        //        }
        //  5664: aload_0        
        //  5665: aload           15
        //  5667: invokedynamic   BootstrapMethod #1, accept:(Ldev/nuker/pyro/f5c;Lnet/minecraft/util/math/BlockPos;)Ljava/util/function/Consumer;
        //  5672: goto            5676
        //  5675: athrow         
        //  5676: invokevirtual   dev/nuker/pyro/f3i.c:(Ljava/util/function/Consumer;)V
        //  5679: goto            5683
        //  5682: athrow         
        //  5683: iinc            13, 1
        //  5686: goto            5010
        //  5689: return         
        //  5690: aconst_null    
        //  5691: athrow         
        //  5692: aconst_null    
        //  5693: athrow         
        //  5694: aconst_null    
        //  5695: athrow         
        //  5696: aconst_null    
        //  5697: athrow         
        //  5698: aconst_null    
        //  5699: athrow         
        //  5700: aconst_null    
        //  5701: athrow         
        //  5702: aconst_null    
        //  5703: athrow         
        //  5704: aconst_null    
        //  5705: athrow         
        //  5706: aconst_null    
        //  5707: athrow         
        //  5708: aconst_null    
        //  5709: athrow         
        //  5710: aconst_null    
        //  5711: athrow         
        //  5712: aconst_null    
        //  5713: athrow         
        //  5714: aconst_null    
        //  5715: athrow         
        //  5716: aconst_null    
        //  5717: athrow         
        //  5718: aconst_null    
        //  5719: athrow         
        //  5720: aconst_null    
        //  5721: athrow         
        //  5722: aconst_null    
        //  5723: athrow         
        //  5724: aconst_null    
        //  5725: athrow         
        //  5726: aconst_null    
        //  5727: athrow         
        //  5728: aconst_null    
        //  5729: athrow         
        //  5730: aconst_null    
        //  5731: athrow         
        //  5732: aconst_null    
        //  5733: athrow         
        //  5734: aconst_null    
        //  5735: athrow         
        //  5736: aconst_null    
        //  5737: athrow         
        //  5738: aconst_null    
        //  5739: athrow         
        //  5740: aconst_null    
        //  5741: athrow         
        //  5742: aconst_null    
        //  5743: athrow         
        //  5744: aconst_null    
        //  5745: athrow         
        //  5746: aconst_null    
        //  5747: athrow         
        //  5748: aconst_null    
        //  5749: athrow         
        //  5750: aconst_null    
        //  5751: athrow         
        //  5752: aconst_null    
        //  5753: athrow         
        //  5754: aconst_null    
        //  5755: athrow         
        //  5756: aconst_null    
        //  5757: athrow         
        //  5758: aconst_null    
        //  5759: athrow         
        //  5760: aconst_null    
        //  5761: athrow         
        //  5762: aconst_null    
        //  5763: athrow         
        //  5764: aconst_null    
        //  5765: athrow         
        //  5766: aconst_null    
        //  5767: athrow         
        //  5768: aconst_null    
        //  5769: athrow         
        //  5770: aconst_null    
        //  5771: athrow         
        //  5772: aconst_null    
        //  5773: athrow         
        //  5774: aconst_null    
        //  5775: athrow         
        //  5776: aconst_null    
        //  5777: athrow         
        //  5778: aconst_null    
        //  5779: athrow         
        //  5780: aconst_null    
        //  5781: athrow         
        //  5782: aconst_null    
        //  5783: athrow         
        //  5784: aconst_null    
        //  5785: athrow         
        //  5786: aconst_null    
        //  5787: athrow         
        //  5788: aconst_null    
        //  5789: athrow         
        //  5790: aconst_null    
        //  5791: athrow         
        //  5792: aconst_null    
        //  5793: athrow         
        //  5794: aconst_null    
        //  5795: athrow         
        //  5796: aconst_null    
        //  5797: athrow         
        //  5798: aconst_null    
        //  5799: athrow         
        //  5800: aconst_null    
        //  5801: athrow         
        //  5802: aconst_null    
        //  5803: athrow         
        //  5804: aconst_null    
        //  5805: athrow         
        //  5806: aconst_null    
        //  5807: athrow         
        //  5808: aconst_null    
        //  5809: athrow         
        //  5810: aconst_null    
        //  5811: athrow         
        //  5812: aconst_null    
        //  5813: athrow         
        //  5814: aconst_null    
        //  5815: athrow         
        //  5816: aconst_null    
        //  5817: athrow         
        //  5818: aconst_null    
        //  5819: athrow         
        //  5820: aconst_null    
        //  5821: athrow         
        //  5822: aconst_null    
        //  5823: athrow         
        //  5824: aconst_null    
        //  5825: athrow         
        //  5826: aconst_null    
        //  5827: athrow         
        //  5828: aconst_null    
        //  5829: athrow         
        //  5830: aconst_null    
        //  5831: athrow         
        //  5832: aconst_null    
        //  5833: athrow         
        //  5834: aconst_null    
        //  5835: athrow         
        //  5836: aconst_null    
        //  5837: athrow         
        //  5838: aconst_null    
        //  5839: athrow         
        //  5840: aconst_null    
        //  5841: athrow         
        //  5842: aconst_null    
        //  5843: athrow         
        //  5844: aconst_null    
        //  5845: athrow         
        //  5846: aconst_null    
        //  5847: athrow         
        //  5848: aconst_null    
        //  5849: athrow         
        //  5850: aconst_null    
        //  5851: athrow         
        //  5852: aconst_null    
        //  5853: athrow         
        //  5854: aconst_null    
        //  5855: athrow         
        //  5856: pop            
        //  5857: goto            24
        //  5860: pop            
        //  5861: aconst_null    
        //  5862: goto            5856
        //  5865: dup            
        //  5866: ifnull          5856
        //  5869: checkcast       Ljava/lang/Throwable;
        //  5872: athrow         
        //  5873: dup            
        //  5874: ifnull          5860
        //  5877: checkcast       Ljava/lang/Throwable;
        //  5880: athrow         
        //  5881: aconst_null    
        //  5882: athrow         
        //    StackMapTable: 02 99 43 07 00 1D 04 FF 00 0B 00 00 00 01 07 00 1D FD 00 03 07 00 03 07 01 9A 43 07 00 1D 40 07 01 9A 45 07 00 1D 40 07 01 9F 52 07 01 9A FF 00 02 00 02 07 00 03 07 01 9A 00 02 07 01 9A 01 5D 07 01 9A 42 07 00 1D 40 07 01 9A 45 07 00 1D 40 01 10 50 07 00 1D FF 00 00 00 02 07 00 03 07 01 9A 00 02 03 07 00 88 45 07 00 1D FF 00 00 00 02 07 00 03 07 01 9A 00 02 03 07 02 F3 FF 00 0E 00 02 07 00 03 07 01 9A 00 02 03 07 01 B4 FF 00 02 00 02 07 00 03 07 01 9A 00 03 03 07 01 B4 01 FF 00 1C 00 02 07 00 03 07 01 9A 00 02 03 07 01 B4 42 07 00 75 FF 00 00 00 02 07 00 03 07 01 9A 00 02 03 07 01 B4 45 07 00 1D FF 00 00 00 02 07 00 03 07 01 9A 00 02 03 03 FF 00 12 00 03 07 00 03 07 01 9A 01 00 01 07 00 22 FF 00 02 00 03 07 00 03 07 01 9A 01 00 02 07 00 22 01 5E 07 00 22 4C 07 00 A7 FF 00 00 00 03 07 00 03 07 01 9A 01 00 02 03 07 00 88 45 07 00 1D FF 00 00 00 03 07 00 03 07 01 9A 01 00 02 03 07 02 F3 45 07 00 B3 FF 00 00 00 03 07 00 03 07 01 9A 01 00 02 03 07 01 B4 45 07 00 1D FF 00 00 00 03 07 00 03 07 01 9A 01 00 02 03 03 4D 01 FF 00 02 00 03 07 00 03 07 01 9A 01 00 02 01 01 5F 01 FF 00 17 00 04 07 00 03 07 01 9A 01 01 00 02 03 07 00 03 FF 00 02 00 04 07 00 03 07 01 9A 01 01 00 03 03 07 00 03 01 FF 00 1C 00 04 07 00 03 07 01 9A 01 01 00 02 03 07 00 03 45 07 00 1D FF 00 00 00 04 07 00 03 07 01 9A 01 01 00 02 03 07 00 88 45 07 00 1D FF 00 00 00 04 07 00 03 07 01 9A 01 01 00 02 03 07 02 F3 FF 00 05 00 00 00 01 07 00 1D FF 00 00 00 04 07 00 03 07 01 9A 01 01 00 02 03 07 01 B4 45 07 00 1D FF 00 00 00 04 07 00 03 07 01 9A 01 01 00 02 03 03 FF 00 10 00 05 07 00 03 07 01 9A 01 01 01 00 01 07 00 03 FF 00 02 00 05 07 00 03 07 01 9A 01 01 01 00 02 07 00 03 01 5F 07 00 03 4F 07 00 1D FF 00 00 00 05 07 00 03 07 01 9A 01 01 01 00 02 03 07 00 88 45 07 00 1D FF 00 00 00 05 07 00 03 07 01 9A 01 01 01 00 02 03 07 02 F3 45 07 00 1D FF 00 00 00 05 07 00 03 07 01 9A 01 01 01 00 02 03 07 01 B4 45 07 00 1D FF 00 00 00 05 07 00 03 07 01 9A 01 01 01 00 02 03 03 4D 01 FF 00 02 00 05 07 00 03 07 01 9A 01 01 01 00 02 01 01 5C 01 FF 00 14 00 06 07 00 03 07 01 9A 01 01 01 01 00 01 07 00 28 FF 00 02 00 06 07 00 03 07 01 9A 01 01 01 01 00 02 07 00 28 01 5F 07 00 28 49 07 00 1D FF 00 00 00 06 07 00 03 07 01 9A 01 01 01 01 00 02 03 07 00 88 45 07 00 1D FF 00 00 00 06 07 00 03 07 01 9A 01 01 01 01 00 02 03 07 02 F3 FF 00 0E 00 06 07 00 03 07 01 9A 01 01 01 01 00 02 03 07 01 B4 FF 00 02 00 06 07 00 03 07 01 9A 01 01 01 01 00 03 03 07 01 B4 01 FF 00 1F 00 06 07 00 03 07 01 9A 01 01 01 01 00 02 03 07 01 B4 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 06 07 00 03 07 01 9A 01 01 01 01 00 02 03 07 01 B4 45 07 00 1D FF 00 00 00 06 07 00 03 07 01 9A 01 01 01 01 00 02 03 03 4D 01 FF 00 02 00 06 07 00 03 07 01 9A 01 01 01 01 00 02 01 01 5F 01 FF 00 12 00 07 07 00 03 07 01 9A 01 01 01 01 01 00 01 07 00 1D FF 00 00 00 07 07 00 03 07 01 9A 01 01 01 01 01 00 02 03 07 00 88 45 07 00 1D FF 00 00 00 07 07 00 03 07 01 9A 01 01 01 01 01 00 02 03 07 02 F3 FF 00 0E 00 07 07 00 03 07 01 9A 01 01 01 01 01 00 02 03 07 01 B4 FF 00 02 00 07 07 00 03 07 01 9A 01 01 01 01 01 00 03 03 07 01 B4 01 FF 00 1E 00 07 07 00 03 07 01 9A 01 01 01 01 01 00 02 03 07 01 B4 42 07 00 75 FF 00 00 00 07 07 00 03 07 01 9A 01 01 01 01 01 00 02 03 07 01 B4 45 07 00 1D FF 00 00 00 07 07 00 03 07 01 9A 01 01 01 01 01 00 02 03 03 FF 00 26 00 0C 07 00 03 07 01 9A 01 01 01 01 01 01 05 02 05 05 00 03 08 03 4B 08 03 4B 07 00 BB FF 00 02 00 0C 07 00 03 07 01 9A 01 01 01 01 01 01 05 02 05 05 00 04 08 03 4B 08 03 4B 07 00 BB 01 FF 00 1E 00 0C 07 00 03 07 01 9A 01 01 01 01 01 01 05 02 05 05 00 03 08 03 4B 08 03 4B 07 00 BB 45 07 00 1D FF 00 00 00 0C 07 00 03 07 01 9A 01 01 01 01 01 01 05 02 05 05 00 03 08 03 4B 08 03 4B 07 02 3F 45 07 00 1D 40 07 01 DE FF 00 0E 00 0D 07 00 03 07 01 9A 01 01 01 01 01 01 05 02 05 05 07 01 DE 00 01 01 FF 00 02 00 0D 07 00 03 07 01 9A 01 01 01 01 01 01 05 02 05 05 07 01 DE 00 02 01 01 5F 01 FF 00 01 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 00 00 FC 00 09 01 0B 42 01 1C FC 00 0A 01 0B 42 01 1D 06 05 42 01 1B FF 00 13 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 00 04 08 04 60 08 04 60 01 01 FF 00 02 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 00 05 08 04 60 08 04 60 01 01 01 FF 00 1C 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 00 04 08 04 60 08 04 60 01 01 FF 00 04 00 00 00 01 07 00 1D FF 00 00 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 00 05 08 04 60 08 04 60 01 01 01 45 07 00 1D 40 07 00 73 FF 00 11 00 11 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 00 01 07 00 22 FF 00 02 00 11 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 00 02 07 00 22 01 5D 07 00 22 51 03 FF 00 02 00 11 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 00 02 03 01 5E 03 FF 00 0D 00 11 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 00 02 03 07 00 73 FF 00 02 00 11 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 00 03 03 07 00 73 01 FF 00 1E 00 11 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 00 02 03 07 00 73 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 11 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 00 02 03 07 00 73 45 07 00 1D FF 00 00 00 11 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 00 02 03 01 FC 00 13 03 42 01 1D 4C 07 00 03 FF 00 02 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 00 02 07 00 03 01 5F 07 00 03 51 07 00 28 FF 00 02 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 00 02 07 00 28 01 5E 07 00 28 FF 00 10 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 00 02 03 07 00 73 FF 00 02 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 00 03 03 07 00 73 01 FF 00 1F 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 00 02 03 07 00 73 42 07 00 1D FF 00 00 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 00 02 03 07 00 73 45 07 00 1D FF 00 00 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 00 02 03 01 FF 00 18 00 13 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 00 01 07 00 03 FF 00 02 00 13 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 00 02 07 00 03 01 5C 07 00 03 4E 07 00 22 FF 00 02 00 13 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 00 02 07 00 22 01 5D 07 00 22 4A 07 00 1D FF 00 00 00 13 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 00 02 03 07 00 73 45 07 00 1D FF 00 00 00 13 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 00 02 03 01 FF 00 15 00 14 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 00 01 03 FF 00 02 00 14 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 00 02 03 01 5F 03 FF 00 16 00 14 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 00 02 03 03 FF 00 02 00 14 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 00 03 03 03 01 FF 00 1D 00 14 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 00 02 03 03 FC 00 11 03 0B 42 01 1E 44 07 00 1D 40 07 00 73 45 07 00 1D 40 07 00 C7 4B 07 00 C7 FF 00 02 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 02 07 00 C7 01 5F 07 00 C7 FC 00 09 07 00 C7 05 42 01 18 0B 42 01 1C 4D 07 01 DE FF 00 02 00 16 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 00 02 07 01 DE 01 5E 07 01 DE 42 07 00 1D 40 07 01 DE 47 07 00 1D 40 07 02 4B 4B 07 02 4B FF 00 02 00 16 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 00 02 07 02 4B 01 5F 07 02 4B FC 00 01 07 02 4B 0B 42 01 1E FF 00 04 00 00 00 01 07 00 1D FF 00 00 00 17 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 00 01 07 02 4B 47 07 00 1D 40 01 47 07 00 1D 40 07 02 4B 47 07 00 1D 40 07 02 F3 4E 07 02 53 FF 00 02 00 17 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 00 02 07 02 53 01 5C 07 02 53 FF 00 06 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 00 01 07 00 75 40 07 02 53 45 07 00 1D 40 01 4A 07 00 1D FF 00 00 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 00 02 07 02 5B 07 02 53 45 07 00 1D 40 01 02 05 42 01 19 0B 42 01 1C FF 00 0E 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 00 02 07 00 03 07 00 73 FF 00 02 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 00 03 07 00 03 07 00 73 01 FF 00 1D 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 00 02 07 00 03 07 00 73 FF 00 0D 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 00 03 07 00 03 07 00 73 07 02 53 FF 00 02 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 00 04 07 00 03 07 00 73 07 02 53 01 FF 00 1E 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 00 03 07 00 03 07 00 73 07 02 53 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 00 03 07 00 03 07 00 73 07 02 53 45 07 00 1D 40 02 FF 00 0E 00 19 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 02 00 01 07 00 1D FF 00 00 00 19 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 02 00 03 07 00 03 07 00 73 07 00 28 45 07 00 1D 40 02 4B 02 FF 00 02 00 19 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 02 00 02 02 01 5E 02 FC 00 15 02 42 01 1E F9 00 07 F8 00 02 FF 00 05 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 00 00 FA 00 05 FA 00 05 47 07 00 15 00 45 07 00 1D 40 07 02 77 4B 07 02 77 FF 00 02 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 00 02 07 02 77 01 5F 07 02 77 FF 00 0D 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 00 02 07 02 77 07 00 73 FF 00 02 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 00 03 07 02 77 07 00 73 01 FF 00 1E 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 00 02 07 02 77 07 00 73 42 07 00 75 FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 00 02 07 02 77 07 00 73 45 07 00 1D 40 07 02 93 FF 00 0D 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 00 42 01 1F 04 05 42 01 19 0B 42 01 1C 43 07 00 1D 40 07 01 9A 45 07 00 1D 00 4C 07 01 9A FF 00 02 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 02 07 01 9A 01 5F 07 01 9A FF 00 04 00 00 00 01 07 00 1D FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 02 07 01 9A 07 02 93 45 07 00 1D FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 02 07 01 9A 07 02 98 42 07 00 75 FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 02 07 01 9A 07 02 98 45 07 00 1D FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 02 07 01 9A 02 42 07 00 A9 FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 02 07 01 9A 02 45 07 00 1D 00 4C 07 01 9A FF 00 02 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 02 07 01 9A 01 5C 07 01 9A 44 07 00 1D FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 02 07 01 9A 07 02 93 45 07 00 1D FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 02 07 01 9A 07 02 98 42 07 00 1D FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 02 07 01 9A 07 02 98 45 07 00 1D FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 02 07 01 9A 02 FF 00 0B 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 02 07 01 9A 02 FF 00 02 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 03 07 01 9A 02 01 FF 00 1C 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 02 07 01 9A 02 42 07 00 1D FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 02 07 01 9A 02 45 07 00 1D 00 FF 00 0F 00 0F 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 07 00 73 00 01 07 00 1D FF 00 00 00 0F 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 07 00 73 00 02 07 01 9A 07 03 74 45 07 00 1D FA 00 00 FF 00 02 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 00 00 FF 00 02 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 00 0B 42 01 1F FC 00 09 01 0B 42 01 1E 4D 01 FF 00 02 00 0F 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 00 02 01 01 5E 01 10 42 01 1F 4D 01 FF 00 02 00 0F 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 00 02 01 01 5E 01 FC 00 01 01 FF 00 18 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 00 03 08 0D 3D 08 0D 3D 01 FF 00 02 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 00 04 08 0D 3D 08 0D 3D 01 01 FF 00 1D 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 00 03 08 0D 3D 08 0D 3D 01 46 07 00 1D FF 00 00 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 00 05 08 0D 3D 08 0D 3D 01 01 01 45 07 00 1D 40 07 00 73 4B 07 00 73 FF 00 02 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 00 02 07 00 73 01 5D 07 00 73 FF 00 14 00 11 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 00 01 07 00 28 FF 00 02 00 11 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 00 02 07 00 28 01 5F 07 00 28 47 07 00 75 FF 00 00 00 11 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 00 02 03 07 00 73 45 07 00 1D FF 00 00 00 11 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 00 02 03 01 FF 00 14 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 00 01 07 00 03 FF 00 02 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 00 02 07 00 03 01 5F 07 00 03 4E 07 00 22 FF 00 02 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 00 02 07 00 22 01 5D 07 00 22 4E 07 00 28 FF 00 02 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 00 02 07 00 28 01 5D 07 00 28 47 07 00 A9 FF 00 00 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 00 02 03 07 00 73 45 07 00 1D FF 00 00 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 00 02 03 01 FF 00 1A 00 13 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 00 01 07 00 75 FF 00 00 00 13 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 00 02 03 07 00 73 45 07 00 1D FF 00 00 00 13 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 00 02 03 01 FF 00 18 00 14 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 00 01 03 FF 00 02 00 14 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 00 02 03 01 5C 03 51 03 FF 00 02 00 14 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 00 02 03 01 5E 03 FC 00 13 03 0B 42 01 1C 4D 07 00 73 FF 00 02 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 02 07 00 73 01 5E 07 00 73 42 07 00 1D 40 07 00 73 45 07 00 1D 40 07 00 C7 45 07 00 1D FF 00 00 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 02 07 00 C7 07 00 C7 45 07 00 1D 40 01 52 07 00 22 FF 00 02 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 02 07 00 22 01 5C 07 00 22 FF 00 13 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 04 07 00 BB 05 08 0F EC 08 0F EC FF 00 02 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 05 07 00 BB 05 08 0F EC 08 0F EC 01 FF 00 1C 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 04 07 00 BB 05 08 0F EC 08 0F EC FF 00 0E 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 05 07 00 BB 05 08 0F EC 08 0F EC 03 FF 00 02 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 06 07 00 BB 05 08 0F EC 08 0F EC 03 01 FF 00 1D 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 05 07 00 BB 05 08 0F EC 08 0F EC 03 FF 00 0E 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 06 07 00 BB 05 08 0F EC 08 0F EC 03 03 FF 00 02 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 07 07 00 BB 05 08 0F EC 08 0F EC 03 03 01 FF 00 1D 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 06 07 00 BB 05 08 0F EC 08 0F EC 03 03 FF 00 1D 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 0A 07 00 BB 05 08 0F EC 08 0F EC 03 03 03 03 03 03 FF 00 02 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 0B 07 00 BB 05 08 0F EC 08 0F EC 03 03 03 03 03 03 01 FF 00 1E 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 0A 07 00 BB 05 08 0F EC 08 0F EC 03 03 03 03 03 03 42 07 00 1D FF 00 00 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 0A 07 00 BB 05 08 0F EC 08 0F EC 03 03 03 03 03 03 45 07 00 1D FF 00 00 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 03 07 00 BB 05 07 02 FC 42 07 00 1D FF 00 00 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 03 07 00 BB 05 07 02 FC 45 07 00 1D 40 07 02 3F 42 07 00 B5 40 07 02 3F 47 07 00 1D 40 01 0E 42 01 1E 45 07 00 75 FF 00 00 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 02 07 00 03 07 00 73 45 07 00 1D 40 07 00 30 FC 00 12 07 00 30 42 01 1F 44 07 00 AF 40 07 01 DE 47 07 00 1D 40 07 02 4B FC 00 01 07 02 4B 4D 07 02 4B FF 00 02 00 17 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 00 02 07 02 4B 01 5D 07 02 4B 42 07 00 0B 40 07 02 4B 47 07 00 1D 40 01 02 05 42 01 1A 4D 07 02 4B FF 00 02 00 17 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 00 02 07 02 4B 01 5E 07 02 4B FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 17 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 00 01 07 02 4B 47 07 00 1D 40 07 02 F3 FC 00 10 07 02 53 42 01 1E FF 00 04 00 00 00 01 07 00 1D FF 00 00 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 07 02 53 00 01 07 02 53 45 07 00 1D 40 01 02 05 42 01 1A 47 07 00 1D FF 00 00 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 07 02 53 00 02 07 02 5B 07 02 53 45 07 00 1D 40 01 FF 00 13 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 07 02 53 00 03 07 00 03 07 00 73 07 02 53 FF 00 02 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 07 02 53 00 04 07 00 03 07 00 73 07 02 53 01 FF 00 1C 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 07 02 53 00 03 07 00 03 07 00 73 07 02 53 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 07 02 53 00 03 07 00 03 07 00 73 07 02 53 45 07 00 1D 40 02 4B 02 FF 00 02 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 07 02 53 00 02 02 01 5D 02 FF 00 0E 00 19 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 07 02 53 02 00 01 07 00 B1 FF 00 00 00 19 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 07 02 53 02 00 03 07 00 03 07 00 73 07 00 28 45 07 00 1D 40 02 4B 02 FF 00 02 00 19 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 07 02 53 02 00 02 02 01 5D 02 FC 00 09 02 05 42 01 18 F9 00 0B F8 00 02 FF 00 05 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 00 00 FA 00 05 FA 00 05 4D 07 00 1D 40 07 01 9A 45 07 00 1D 00 02 06 05 42 01 19 52 07 00 28 FF 00 02 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 02 07 00 28 01 5D 07 00 28 FF 00 10 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 02 07 03 44 01 FF 00 02 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 03 07 03 44 01 01 FF 00 1F 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 02 07 03 44 01 42 07 00 B5 FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 02 07 03 44 01 45 07 00 1D 40 07 00 42 4B 07 00 42 FF 00 02 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 02 07 00 42 01 5D 07 00 42 42 07 00 1D 40 07 00 42 45 07 00 1D 40 07 00 77 FF 00 0E 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 02 07 00 77 07 00 77 FF 00 02 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 03 07 00 77 07 00 77 01 FF 00 1E 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 02 07 00 77 07 00 77 42 07 00 1D FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 02 07 00 77 07 00 77 45 07 00 1D 40 01 5B 07 01 98 40 07 03 57 45 07 00 1D 00 44 07 00 B1 40 07 00 73 45 07 00 1D 40 01 49 07 00 1D FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 02 03 07 00 73 45 07 00 1D FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 02 03 01 45 07 01 98 FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 03 03 03 07 00 73 45 07 00 1D FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 03 03 03 01 47 07 00 1D FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 03 03 03 03 45 07 00 1D 40 07 03 76 4B 07 03 76 FF 00 02 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 02 07 03 76 01 5C 07 03 76 FC 00 0D 07 03 76 42 01 1E 48 07 00 1D 40 07 01 9A 45 07 00 1D 00 47 07 00 1D FF 00 00 00 0F 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 07 03 76 00 02 07 01 9A 02 45 07 00 1D 00 47 07 00 AB FF 00 00 00 0F 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 07 03 76 00 02 07 01 9A 02 45 07 00 1D 00 4D 07 00 73 FF 00 02 00 0F 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 07 03 76 00 02 07 00 73 01 5D 07 00 73 FC 00 0D 07 00 73 42 01 1E 4C 07 01 9A FF 00 02 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 07 03 76 07 00 73 00 02 07 01 9A 01 5F 07 01 9A 4A 07 00 13 FF 00 00 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 07 03 76 07 00 73 00 02 07 01 9A 07 03 74 45 07 00 1D F9 00 00 FF 00 05 00 02 07 00 03 07 01 9A 00 00 FF 00 00 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 00 FF 00 01 00 05 07 00 03 07 01 9A 01 01 01 00 01 07 00 03 FF 00 01 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 07 02 53 00 00 FF 00 01 00 14 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 00 01 03 FF 00 01 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 02 07 01 9A 02 FF 00 01 00 02 07 00 03 07 01 9A 00 01 07 01 9A FF 00 01 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 00 00 F9 00 01 FF 00 01 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 01 07 00 42 FF 00 01 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 07 03 76 07 00 73 00 01 07 01 9A FF 00 01 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 00 00 F9 00 01 FF 00 01 00 06 07 00 03 07 01 9A 01 01 01 01 00 01 01 FF 00 01 00 13 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 00 01 07 00 22 FF 00 01 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 01 07 03 76 FF 00 01 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 01 07 00 C7 FF 00 01 00 14 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 00 01 03 FF 00 01 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 00 FF 00 01 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 00 04 08 04 60 08 04 60 01 01 FA 00 01 FF 00 01 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 00 01 07 00 73 FF 00 01 00 0F 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 07 03 76 00 00 FF 00 01 00 11 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 00 01 07 00 28 FF 00 01 00 03 07 00 03 07 01 9A 01 00 01 01 FF 00 01 00 16 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 00 01 07 01 DE FF 00 01 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 01 07 01 9A FF 00 01 00 17 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 00 01 07 02 53 FF 00 01 00 11 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 00 02 03 07 00 73 FF 00 01 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 00 03 08 0D 3D 08 0D 3D 01 FF 00 01 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 00 01 07 00 03 FF 00 01 00 11 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 00 01 03 FF 00 01 00 17 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 00 01 07 02 4B FF 00 01 00 1A 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 02 02 00 00 FF 00 01 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 00 FF 00 01 00 02 07 00 03 07 01 9A 00 02 03 07 01 B4 FF 00 01 00 0F 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 00 01 01 41 01 FF 00 01 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 01 07 00 73 FF 00 01 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 02 07 03 44 01 FF 00 01 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 00 FF 00 01 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 0A 07 00 BB 05 08 0F EC 08 0F EC 03 03 03 03 03 03 FF 00 01 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 00 01 07 02 77 FF 00 01 00 06 07 00 03 07 01 9A 01 01 01 01 00 01 07 00 28 FF 00 01 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 00 FF 00 01 00 10 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 07 03 76 07 00 73 00 00 FF 00 01 00 0D 07 00 03 07 01 9A 01 01 01 01 01 01 05 02 05 05 07 01 DE 00 01 01 FF 00 01 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 00 01 07 00 03 FF 00 01 00 19 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 07 02 53 02 00 01 02 FF 00 01 00 0F 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 07 03 76 00 01 07 00 73 FF 00 01 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 02 07 00 77 07 00 77 FF 00 01 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 00 03 07 00 03 07 00 73 07 02 53 FF 00 01 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 00 02 07 02 77 07 00 73 FF 00 01 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 07 02 53 00 01 02 FF 00 01 00 11 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 00 01 07 00 22 FF 00 01 00 14 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 00 02 03 03 FF 00 01 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 04 07 00 BB 05 08 0F EC 08 0F EC FF 00 01 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 06 07 00 BB 05 08 0F EC 08 0F EC 03 03 FF 00 01 00 04 07 00 03 07 01 9A 01 01 00 02 03 07 00 03 FF 00 01 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 01 07 00 28 FF 00 01 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 00 02 07 00 03 07 00 73 FF 00 01 00 19 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 07 02 53 02 00 01 02 FF 00 01 00 17 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 00 01 07 02 4B FF 00 01 00 05 07 00 03 07 01 9A 01 01 01 00 01 01 FF 00 01 00 14 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 00 01 03 FF 00 01 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 00 01 07 00 28 FF 00 01 00 07 07 00 03 07 01 9A 01 01 01 01 01 00 02 03 07 01 B4 FF 00 01 00 16 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 00 01 07 02 4B FF 00 01 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 00 01 07 00 28 FF 00 01 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 00 02 03 07 00 73 FF 00 01 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 05 07 00 BB 05 08 0F EC 08 0F EC 03 FF 00 01 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 07 02 93 00 01 07 01 9A FF 00 01 00 0F 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 00 00 FF 00 01 00 12 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 00 01 07 00 22 FF 00 01 00 18 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 07 02 4B 07 02 53 00 03 07 00 03 07 00 73 07 02 53 FF 00 01 00 0E 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 00 00 FF 00 01 00 0C 07 00 03 07 01 9A 01 01 01 01 01 01 05 02 05 05 00 03 08 03 4B 08 03 4B 07 00 BB FF 00 01 00 17 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 C7 07 02 4B 00 00 FF 00 01 00 0F 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 00 00 FF 00 01 00 13 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 05 05 07 01 DE 01 01 01 07 00 73 03 03 00 01 07 00 03 FF 00 01 00 15 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 00 01 07 00 22 FF 00 01 00 06 07 00 03 07 01 9A 01 01 01 01 00 02 03 07 01 B4 FF 00 01 00 03 07 00 03 07 01 9A 01 00 01 07 00 22 FF 00 01 00 16 07 00 03 07 01 9A 01 01 01 01 01 01 07 00 73 02 07 00 73 07 00 30 07 01 DE 01 01 01 07 00 73 03 03 03 03 07 00 30 00 00 FF 00 01 00 02 07 00 03 07 01 9A 00 01 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     5865   5873   Any
        //  5865   5873   5865   5873   Any
        //  5881   5883   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  28     35     35     36     Any
        //  28     35     35     36     Any
        //  29     35     35     36     Any
        //  29     35     35     36     Ljava/lang/ClassCastException;
        //  28     35     28     29     Any
        //  91     98     98     99     Any
        //  91     98     3      8      Any
        //  92     98     91     92     Any
        //  92     98     3      8      Any
        //  91     98     98     99     Ljava/lang/StringIndexOutOfBoundsException;
        //  133    140    140    141    Any
        //  133    140    3      8      Ljava/lang/AssertionError;
        //  133    140    133    134    Any
        //  133    140    3      8      Any
        //  133    140    140    141    Ljava/lang/RuntimeException;
        //  191    198    198    199    Any
        //  192    198    191    192    Ljava/lang/StringIndexOutOfBoundsException;
        //  192    198    191    192    Ljava/lang/EnumConstantNotPresentException;
        //  191    198    3      8      Ljava/lang/ArithmeticException;
        //  192    198    198    199    Ljava/lang/IndexOutOfBoundsException;
        //  265    272    272    273    Any
        //  265    272    272    273    Ljava/lang/AssertionError;
        //  266    272    265    266    Ljava/lang/UnsupportedOperationException;
        //  265    272    265    266    Ljava/lang/UnsupportedOperationException;
        //  265    272    272    273    Any
        //  279    286    286    287    Any
        //  279    286    286    287    Any
        //  280    286    279    280    Ljava/util/ConcurrentModificationException;
        //  279    286    3      8      Ljava/util/NoSuchElementException;
        //  280    286    286    287    Any
        //  398    405    405    406    Any
        //  398    405    3      8      Any
        //  399    405    398    399    Any
        //  399    405    398    399    Ljava/lang/EnumConstantNotPresentException;
        //  398    405    3      8      Ljava/lang/IllegalStateException;
        //  413    419    419    420    Any
        //  413    419    3      8      Ljava/lang/UnsupportedOperationException;
        //  413    419    419    420    Any
        //  413    419    3      8      Ljava/lang/AssertionError;
        //  413    419    419    420    Any
        //  488    495    495    496    Any
        //  489    495    488    489    Any
        //  488    495    488    489    Ljava/lang/ClassCastException;
        //  488    495    495    496    Ljava/lang/IndexOutOfBoundsException;
        //  488    495    495    496    Any
        //  502    509    509    510    Any
        //  502    509    502    503    Any
        //  502    509    509    510    Ljava/lang/IllegalArgumentException;
        //  503    509    502    503    Any
        //  502    509    502    503    Ljava/lang/IndexOutOfBoundsException;
        //  622    629    629    630    Any
        //  623    629    622    623    Ljava/lang/ArithmeticException;
        //  623    629    622    623    Ljava/lang/StringIndexOutOfBoundsException;
        //  622    629    629    630    Any
        //  623    629    622    623    Any
        //  684    690    690    691    Any
        //  684    690    690    691    Any
        //  684    690    690    691    Any
        //  684    690    690    691    Any
        //  684    690    3      8      Ljava/lang/NumberFormatException;
        //  759    766    766    767    Any
        //  759    766    759    760    Ljava/lang/NumberFormatException;
        //  759    766    759    760    Any
        //  759    766    3      8      Ljava/util/NoSuchElementException;
        //  759    766    766    767    Any
        //  819    826    826    827    Any
        //  820    826    3      8      Any
        //  819    826    826    827    Any
        //  819    826    819    820    Ljava/lang/StringIndexOutOfBoundsException;
        //  819    826    819    820    Ljava/lang/NumberFormatException;
        //  906    913    913    914    Any
        //  906    913    3      8      Any
        //  907    913    906    907    Ljava/lang/IndexOutOfBoundsException;
        //  907    913    906    907    Any
        //  906    913    913    914    Ljava/lang/IllegalStateException;
        //  1178   1184   1184   1185   Any
        //  1178   1184   1184   1185   Ljava/lang/IllegalArgumentException;
        //  1178   1184   1184   1185   Ljava/lang/UnsupportedOperationException;
        //  1178   1184   3      8      Ljava/lang/NumberFormatException;
        //  1178   1184   3      8      Any
        //  1340   1346   1346   1347   Any
        //  1340   1346   1346   1347   Ljava/lang/ClassCastException;
        //  1340   1346   3      8      Ljava/lang/ArithmeticException;
        //  1340   1346   3      8      Any
        //  1340   1346   3      8      Any
        //  1555   1562   1562   1563   Any
        //  1555   1562   1555   1556   Ljava/util/ConcurrentModificationException;
        //  1556   1562   1555   1556   Ljava/lang/ArithmeticException;
        //  1556   1562   1562   1563   Any
        //  1556   1562   1555   1556   Any
        //  1679   1686   1686   1687   Any
        //  1680   1686   1679   1680   Any
        //  1680   1686   1679   1680   Ljava/lang/IllegalArgumentException;
        //  1680   1686   1679   1680   Ljava/util/NoSuchElementException;
        //  1679   1686   3      8      Any
        //  1869   1876   1876   1877   Any
        //  1869   1876   1869   1870   Any
        //  1870   1876   1869   1870   Ljava/lang/NumberFormatException;
        //  1870   1876   1869   1870   Ljava/lang/StringIndexOutOfBoundsException;
        //  1869   1876   3      8      Ljava/lang/IllegalArgumentException;
        //  2063   2072   2072   2073   Any
        //  2063   2072   2072   2073   Any
        //  2064   2072   3      8      Ljava/lang/ArithmeticException;
        //  2063   2072   2063   2064   Any
        //  2064   2072   3      8      Any
        //  2174   2182   2182   2183   Any
        //  2174   2182   2182   2183   Any
        //  2174   2182   2182   2183   Any
        //  2174   2182   3      8      Ljava/lang/UnsupportedOperationException;
        //  2174   2182   2182   2183   Any
        //  2191   2200   2200   2201   Any
        //  2192   2200   2191   2192   Any
        //  2192   2200   2191   2192   Ljava/lang/StringIndexOutOfBoundsException;
        //  2192   2200   2191   2192   Ljava/lang/EnumConstantNotPresentException;
        //  2191   2200   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2255   2262   2262   2263   Any
        //  2256   2262   2262   2263   Ljava/lang/IllegalArgumentException;
        //  2255   2262   3      8      Any
        //  2256   2262   3      8      Any
        //  2256   2262   2255   2256   Ljava/lang/RuntimeException;
        //  2274   2281   2281   2282   Any
        //  2275   2281   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2274   2281   2274   2275   Any
        //  2274   2281   2274   2275   Ljava/lang/IllegalStateException;
        //  2274   2281   2281   2282   Any
        //  2464   2470   2470   2471   Any
        //  2464   2470   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2464   2470   2470   2471   Any
        //  2464   2470   3      8      Ljava/lang/IllegalArgumentException;
        //  2464   2470   3      8      Ljava/lang/NullPointerException;
        //  2486   2493   2493   2494   Any
        //  2486   2493   3      8      Ljava/util/NoSuchElementException;
        //  2486   2493   2486   2487   Any
        //  2487   2493   2486   2487   Ljava/lang/IndexOutOfBoundsException;
        //  2487   2493   2493   2494   Ljava/lang/ClassCastException;
        //  2633   2640   2640   2641   Any
        //  2633   2640   2633   2634   Ljava/lang/AssertionError;
        //  2634   2640   2640   2641   Any
        //  2633   2640   3      8      Any
        //  2634   2640   3      8      Any
        //  2739   2746   2746   2747   Any
        //  2739   2746   2739   2740   Ljava/lang/NegativeArraySizeException;
        //  2739   2746   2739   2740   Ljava/lang/ClassCastException;
        //  2739   2746   2746   2747   Any
        //  2740   2746   3      8      Any
        //  2884   2891   2891   2892   Any
        //  2884   2891   2891   2892   Any
        //  2885   2891   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2884   2891   2884   2885   Any
        //  2885   2891   3      8      Ljava/lang/NegativeArraySizeException;
        //  2946   2952   2952   2953   Any
        //  2946   2952   2952   2953   Any
        //  2946   2952   2952   2953   Ljava/lang/NegativeArraySizeException;
        //  2946   2952   3      8      Any
        //  2946   2952   2952   2953   Any
        //  2956   2963   2963   2964   Any
        //  2957   2963   2963   2964   Ljava/lang/IndexOutOfBoundsException;
        //  2957   2963   2956   2957   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2957   2963   3      8      Ljava/lang/IllegalStateException;
        //  2956   2963   2956   2957   Ljava/lang/ClassCastException;
        //  2967   2974   2974   2975   Any
        //  2967   2974   2974   2975   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2967   2974   2974   2975   Any
        //  2967   2974   2967   2968   Ljava/lang/ClassCastException;
        //  2967   2974   2974   2975   Any
        //  3025   3032   3032   3033   Any
        //  3026   3032   3      8      Any
        //  3025   3032   3025   3026   Any
        //  3026   3032   3      8      Ljava/lang/NumberFormatException;
        //  3025   3032   3025   3026   Ljava/util/ConcurrentModificationException;
        //  3036   3043   3043   3044   Any
        //  3036   3043   3036   3037   Any
        //  3037   3043   3      8      Ljava/lang/UnsupportedOperationException;
        //  3036   3043   3      8      Any
        //  3037   3043   3036   3037   Ljava/util/NoSuchElementException;
        //  3091   3098   3098   3099   Any
        //  3092   3098   3098   3099   Any
        //  3092   3098   3      8      Any
        //  3092   3098   3091   3092   Any
        //  3091   3098   3098   3099   Ljava/lang/EnumConstantNotPresentException;
        //  3115   3122   3122   3123   Any
        //  3116   3122   3115   3116   Ljava/lang/IndexOutOfBoundsException;
        //  3116   3122   3122   3123   Ljava/lang/StringIndexOutOfBoundsException;
        //  3115   3122   3115   3116   Any
        //  3116   3122   3115   3116   Ljava/lang/NullPointerException;
        //  3447   3454   3454   3455   Any
        //  3448   3454   3      8      Ljava/lang/UnsupportedOperationException;
        //  3447   3454   3447   3448   Any
        //  3448   3454   3      8      Any
        //  3447   3454   3447   3448   Ljava/lang/AssertionError;
        //  3564   3571   3571   3572   Any
        //  3564   3571   3      8      Any
        //  3564   3571   3564   3565   Ljava/lang/IndexOutOfBoundsException;
        //  3564   3571   3571   3572   Ljava/lang/RuntimeException;
        //  3565   3571   3564   3565   Ljava/lang/IllegalStateException;
        //  3732   3739   3739   3740   Any
        //  3732   3739   3732   3733   Ljava/lang/ClassCastException;
        //  3732   3739   3      8      Ljava/lang/UnsupportedOperationException;
        //  3733   3739   3739   3740   Ljava/util/NoSuchElementException;
        //  3733   3739   3739   3740   Any
        //  3767   3774   3774   3775   Any
        //  3768   3774   3774   3775   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3767   3774   3      8      Any
        //  3768   3774   3767   3768   Ljava/lang/StringIndexOutOfBoundsException;
        //  3768   3774   3767   3768   Ljava/lang/NullPointerException;
        //  3999   4006   4006   4007   Any
        //  4000   4006   4006   4007   Any
        //  3999   4006   3999   4000   Ljava/util/ConcurrentModificationException;
        //  3999   4006   3999   4000   Any
        //  4000   4006   3      8      Any
        //  4013   4020   4020   4021   Any
        //  4013   4020   4013   4014   Ljava/lang/EnumConstantNotPresentException;
        //  4014   4020   3      8      Ljava/lang/NullPointerException;
        //  4013   4020   4013   4014   Any
        //  4013   4020   4020   4021   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4287   4294   4294   4295   Any
        //  4288   4294   3      8      Any
        //  4287   4294   4287   4288   Any
        //  4287   4294   4287   4288   Ljava/lang/UnsupportedOperationException;
        //  4287   4294   3      8      Any
        //  4298   4305   4305   4306   Any
        //  4298   4305   4298   4299   Any
        //  4298   4305   4305   4306   Any
        //  4298   4305   4305   4306   Ljava/lang/EnumConstantNotPresentException;
        //  4299   4305   4305   4306   Any
        //  4309   4318   4318   4319   Any
        //  4310   4318   4309   4310   Ljava/util/NoSuchElementException;
        //  4309   4318   4318   4319   Ljava/util/ConcurrentModificationException;
        //  4310   4318   3      8      Any
        //  4309   4318   4318   4319   Any
        //  4374   4381   4381   4382   Any
        //  4374   4381   4381   4382   Ljava/lang/IllegalArgumentException;
        //  4375   4381   3      8      Any
        //  4375   4381   4374   4375   Ljava/lang/RuntimeException;
        //  4375   4381   4381   4382   Any
        //  4441   4450   4450   4451   Any
        //  4441   4450   4441   4442   Ljava/lang/NullPointerException;
        //  4441   4450   4450   4451   Any
        //  4442   4450   3      8      Any
        //  4442   4450   3      8      Any
        //  4503   4512   4512   4513   Any
        //  4503   4512   4503   4504   Ljava/lang/NegativeArraySizeException;
        //  4503   4512   4512   4513   Ljava/lang/AssertionError;
        //  4504   4512   4512   4513   Any
        //  4504   4512   3      8      Any
        //  4604   4612   4612   4613   Any
        //  4604   4612   4612   4613   Any
        //  4604   4612   4612   4613   Ljava/lang/StringIndexOutOfBoundsException;
        //  4604   4612   3      8      Ljava/lang/IllegalArgumentException;
        //  4604   4612   3      8      Any
        //  4670   4676   4676   4677   Any
        //  4670   4676   4676   4677   Ljava/lang/NumberFormatException;
        //  4670   4676   4676   4677   Ljava/lang/ClassCastException;
        //  4670   4676   3      8      Any
        //  4670   4676   3      8      Ljava/lang/RuntimeException;
        //  4724   4731   4731   4732   Any
        //  4725   4731   4731   4732   Any
        //  4724   4731   4724   4725   Any
        //  4725   4731   4724   4725   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4724   4731   3      8      Ljava/lang/AssertionError;
        //  4788   4794   4794   4795   Any
        //  4788   4794   4794   4795   Ljava/lang/NegativeArraySizeException;
        //  4788   4794   3      8      Any
        //  4788   4794   3      8      Any
        //  4788   4794   3      8      Any
        //  4855   4862   4862   4863   Any
        //  4856   4862   4855   4856   Ljava/lang/IndexOutOfBoundsException;
        //  4855   4862   4862   4863   Any
        //  4856   4862   4862   4863   Ljava/lang/IndexOutOfBoundsException;
        //  4856   4862   3      8      Any
        //  4999   5006   5006   5007   Any
        //  4999   5006   4999   5000   Any
        //  4999   5006   5006   5007   Any
        //  5000   5006   5006   5007   Any
        //  5000   5006   5006   5007   Any
        //  5159   5166   5166   5167   Any
        //  5159   5166   5159   5160   Ljava/util/NoSuchElementException;
        //  5160   5166   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  5159   5166   5166   5167   Ljava/util/ConcurrentModificationException;
        //  5159   5166   5166   5167   Any
        //  5215   5222   5222   5223   Any
        //  5215   5222   5222   5223   Any
        //  5216   5222   5215   5216   Any
        //  5215   5222   3      8      Any
        //  5216   5222   5215   5216   Any
        //  5275   5282   5282   5283   Any
        //  5275   5282   5282   5283   Ljava/lang/UnsupportedOperationException;
        //  5276   5282   3      8      Ljava/lang/IllegalArgumentException;
        //  5276   5282   5275   5276   Any
        //  5276   5282   5275   5276   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  5311   5318   5318   5319   Any
        //  5312   5318   5311   5312   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  5312   5318   3      8      Any
        //  5312   5318   3      8      Ljava/lang/NumberFormatException;
        //  5312   5318   5318   5319   Any
        //  5324   5331   5331   5332   Any
        //  5325   5331   5331   5332   Any
        //  5325   5331   5331   5332   Any
        //  5324   5331   3      8      Any
        //  5325   5331   5324   5325   Ljava/lang/IndexOutOfBoundsException;
        //  5342   5349   5349   5350   Any
        //  5342   5349   5342   5343   Ljava/lang/ArithmeticException;
        //  5342   5349   5342   5343   Any
        //  5343   5349   5349   5350   Ljava/util/NoSuchElementException;
        //  5342   5349   5349   5350   Any
        //  5356   5363   5363   5364   Any
        //  5357   5363   5363   5364   Ljava/lang/IndexOutOfBoundsException;
        //  5357   5363   5363   5364   Ljava/lang/ClassCastException;
        //  5356   5363   5356   5357   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  5357   5363   5363   5364   Any
        //  5372   5379   5379   5380   Any
        //  5372   5379   5379   5380   Any
        //  5373   5379   5372   5373   Any
        //  5372   5379   5379   5380   Ljava/lang/StringIndexOutOfBoundsException;
        //  5373   5379   5379   5380   Any
        //  5481   5488   5488   5489   Any
        //  5482   5488   3      8      Any
        //  5481   5488   5488   5489   Ljava/util/ConcurrentModificationException;
        //  5482   5488   5488   5489   Any
        //  5481   5488   5481   5482   Any
        //  5497   5504   5504   5505   Any
        //  5498   5504   5497   5498   Any
        //  5498   5504   5504   5505   Ljava/lang/ArithmeticException;
        //  5497   5504   5504   5505   Ljava/lang/NegativeArraySizeException;
        //  5498   5504   3      8      Ljava/lang/IllegalStateException;
        //  5513   5520   5520   5521   Any
        //  5514   5520   5513   5514   Ljava/lang/IllegalArgumentException;
        //  5513   5520   5520   5521   Any
        //  5514   5520   3      8      Ljava/lang/RuntimeException;
        //  5513   5520   3      8      Any
        //  5675   5682   5682   5683   Any
        //  5676   5682   5682   5683   Ljava/util/NoSuchElementException;
        //  5675   5682   3      8      Any
        //  5675   5682   5675   5676   Ljava/lang/ArithmeticException;
        //  5676   5682   5682   5683   Any
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
    
    public float 0(final BlockPos p0, final EntityLivingBase p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2130
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            2122
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2114
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            36
        //    30: ldc_w           -442707743
        //    33: goto            39
        //    36: ldc_w           1717571569
        //    39: ldc_w           999830473
        //    42: ixor           
        //    43: lookupswitch {
        //          -677870338: 36
        //          -570105048: 2047
        //          default: 68
        //        }
        //    68: aload_2        
        //    69: aload_0        
        //    70: getstatic       dev/nuker/pyro/fc.1:I
        //    73: ifeq            82
        //    76: ldc_w           160766621
        //    79: goto            85
        //    82: ldc_w           -1005933420
        //    85: ldc_w           -1032009402
        //    88: ixor           
        //    89: lookupswitch {
        //          -1168722709: 82
        //          -873868325: 2043
        //          default: 116
        //        }
        //   116: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   119: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   122: if_acmpne       318
        //   125: getstatic       dev/nuker/pyro/fc.c:I
        //   128: ifge            137
        //   131: ldc_w           990068750
        //   134: goto            140
        //   137: ldc_w           -830948790
        //   140: ldc_w           -92953659
        //   143: ixor           
        //   144: lookupswitch {
        //          -1049173045: 2061
        //          1116028727: 137
        //          default: 172
        //        }
        //   172: aload_0        
        //   173: getstatic       dev/nuker/pyro/fc.0:I
        //   176: ifeq            185
        //   179: ldc_w           -1182312907
        //   182: goto            188
        //   185: ldc_w           2021720525
        //   188: ldc_w           1904644322
        //   191: ixor           
        //   192: lookupswitch {
        //          -939407657: 185
        //          151490863: 220
        //          default: 2081
        //        }
        //   220: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //   223: getstatic       dev/nuker/pyro/fc.0:I
        //   226: ifeq            235
        //   229: ldc_w           -1208327805
        //   232: goto            238
        //   235: ldc_w           1142609245
        //   238: ldc_w           -1851115652
        //   241: ixor           
        //   242: lookupswitch {
        //          -709828063: 268
        //          642799359: 235
        //          default: 2089
        //        }
        //   268: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   271: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71075_bZ:Lnet/minecraft/entity/player/PlayerCapabilities;
        //   274: getfield        net/minecraft/entity/player/PlayerCapabilities.field_75098_d:Z
        //   277: ifeq            286
        //   280: ldc_w           609787071
        //   283: goto            289
        //   286: ldc_w           609787068
        //   289: ldc_w           -1522113870
        //   292: ixor           
        //   293: tableswitch {
        //          37616666: 316
        //          37616667: 318
        //          default: 280
        //        }
        //   316: fconst_0       
        //   317: freturn        
        //   318: aload_1        
        //   319: getstatic       dev/nuker/pyro/fc.c:I
        //   322: ifge            331
        //   325: ldc_w           454611667
        //   328: goto            334
        //   331: ldc_w           -687863721
        //   334: ldc_w           1570379525
        //   337: ixor           
        //   338: lookupswitch {
        //          1182975446: 2049
        //          1453219811: 331
        //          default: 364
        //        }
        //   364: goto            368
        //   367: athrow         
        //   368: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //   371: goto            375
        //   374: athrow         
        //   375: i2d            
        //   376: ldc2_w          0.5
        //   379: dadd           
        //   380: dstore_3       
        //   381: aload_1        
        //   382: goto            386
        //   385: athrow         
        //   386: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //   389: goto            393
        //   392: athrow         
        //   393: i2d            
        //   394: ldc2_w          0.5
        //   397: dadd           
        //   398: getstatic       dev/nuker/pyro/fc.c:I
        //   401: ifge            410
        //   404: ldc_w           1849114401
        //   407: goto            413
        //   410: ldc_w           -763059898
        //   413: ldc_w           -1012352050
        //   416: ixor           
        //   417: lookupswitch {
        //          -1382054673: 410
        //          288103048: 444
        //          default: 2087
        //        }
        //   444: dstore          5
        //   446: aload_1        
        //   447: getstatic       dev/nuker/pyro/fc.c:I
        //   450: ifge            459
        //   453: ldc_w           510322874
        //   456: goto            462
        //   459: ldc_w           -1221300304
        //   462: ldc_w           -186799774
        //   465: ixor           
        //   466: lookupswitch {
        //          -357088808: 459
        //          1139394258: 492
        //          default: 2069
        //        }
        //   492: goto            496
        //   495: athrow         
        //   496: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //   499: goto            503
        //   502: athrow         
        //   503: i2d            
        //   504: ldc2_w          0.5
        //   507: dadd           
        //   508: getstatic       dev/nuker/pyro/fc.0:I
        //   511: ifeq            520
        //   514: ldc_w           1497185493
        //   517: goto            523
        //   520: ldc_w           622910637
        //   523: ldc_w           -1613899147
        //   526: ixor           
        //   527: lookupswitch {
        //          -1158871336: 552
        //          -957290848: 520
        //          default: 2085
        //        }
        //   552: dstore          7
        //   554: ldc_w           5.0
        //   557: fstore          9
        //   559: ldc_w           10.0
        //   562: fstore          10
        //   564: aload_2        
        //   565: dload_3        
        //   566: dload           5
        //   568: dload           7
        //   570: goto            574
        //   573: athrow         
        //   574: invokevirtual   net/minecraft/entity/EntityLivingBase.func_70011_f:(DDD)D
        //   577: goto            581
        //   580: athrow         
        //   581: fload           10
        //   583: f2d            
        //   584: ddiv           
        //   585: getstatic       dev/nuker/pyro/fc.c:I
        //   588: ifge            597
        //   591: ldc_w           -495345531
        //   594: goto            600
        //   597: ldc_w           -1110398537
        //   600: ldc_w           1492461469
        //   603: ixor           
        //   604: lookupswitch {
        //          -1237287956: 597
        //          -1165195496: 2051
        //          default: 632
        //        }
        //   632: dstore          11
        //   634: dload           11
        //   636: dconst_1       
        //   637: dcmpg          
        //   638: ifgt            2041
        //   641: getstatic       dev/nuker/pyro/fc.c:I
        //   644: ifge            653
        //   647: ldc_w           1965463829
        //   650: goto            656
        //   653: ldc_w           1868747121
        //   656: ldc_w           -1253458473
        //   659: ixor           
        //   660: lookupswitch {
        //          -1066457918: 2103
        //          1111153932: 653
        //          default: 688
        //        }
        //   688: aload_2        
        //   689: getstatic       dev/nuker/pyro/fc.0:I
        //   692: ifeq            701
        //   695: ldc_w           1998396838
        //   698: goto            704
        //   701: ldc_w           -2082435197
        //   704: ldc_w           355305435
        //   707: ixor           
        //   708: lookupswitch {
        //          671336541: 701
        //          1647352445: 2099
        //          default: 736
        //        }
        //   736: getfield        net/minecraft/entity/EntityLivingBase.field_70165_t:D
        //   739: dload_3        
        //   740: dsub           
        //   741: getstatic       dev/nuker/pyro/fc.1:I
        //   744: ifeq            753
        //   747: ldc_w           -1546594250
        //   750: goto            756
        //   753: ldc_w           520174599
        //   756: ldc_w           789817892
        //   759: ixor           
        //   760: lookupswitch {
        //          -1933348334: 2071
        //          32084239: 753
        //          default: 788
        //        }
        //   788: dstore          13
        //   790: aload_2        
        //   791: getfield        net/minecraft/entity/EntityLivingBase.field_70163_u:D
        //   794: getstatic       dev/nuker/pyro/fc.1:I
        //   797: ifeq            806
        //   800: ldc_w           -1848881187
        //   803: goto            809
        //   806: ldc_w           -342683592
        //   809: ldc_w           -1597244354
        //   812: ixor           
        //   813: lookupswitch {
        //          715280769: 806
        //          822588387: 2053
        //          default: 840
        //        }
        //   840: aload_2        
        //   841: goto            845
        //   844: athrow         
        //   845: invokevirtual   net/minecraft/entity/EntityLivingBase.func_70047_e:()F
        //   848: goto            852
        //   851: athrow         
        //   852: f2d            
        //   853: dadd           
        //   854: dload           5
        //   856: dsub           
        //   857: dstore          15
        //   859: aload_2        
        //   860: getfield        net/minecraft/entity/EntityLivingBase.field_70161_v:D
        //   863: dload           7
        //   865: dsub           
        //   866: dstore          17
        //   868: getstatic       dev/nuker/pyro/fc.0:I
        //   871: ifeq            880
        //   874: ldc_w           1004368835
        //   877: goto            883
        //   880: ldc_w           1717719974
        //   883: ldc_w           1416159384
        //   886: ixor           
        //   887: lookupswitch {
        //          839562046: 912
        //          1874170715: 880
        //          default: 2055
        //        }
        //   912: dload           13
        //   914: getstatic       dev/nuker/pyro/fc.c:I
        //   917: ifge            926
        //   920: ldc_w           1936836847
        //   923: goto            929
        //   926: ldc_w           -617267287
        //   929: ldc_w           920762337
        //   932: ixor           
        //   933: lookupswitch {
        //          -304838584: 960
        //          1167097614: 926
        //          default: 2079
        //        }
        //   960: dload           13
        //   962: dmul           
        //   963: dload           15
        //   965: dload           15
        //   967: dmul           
        //   968: dadd           
        //   969: dload           17
        //   971: dload           17
        //   973: dmul           
        //   974: dadd           
        //   975: goto            979
        //   978: athrow         
        //   979: invokestatic    net/minecraft/util/math/MathHelper.func_76133_a:(D)F
        //   982: goto            986
        //   985: athrow         
        //   986: f2d            
        //   987: dstore          19
        //   989: dload           19
        //   991: dconst_0       
        //   992: dcmpl          
        //   993: ifeq            1002
        //   996: ldc_w           1350381373
        //   999: goto            1005
        //  1002: ldc_w           1350381372
        //  1005: ldc_w           -472026065
        //  1008: ixor           
        //  1009: tableswitch {
        //          1732294180: 1032
        //          1732294181: 2041
        //          default: 996
        //        }
        //  1032: dload           13
        //  1034: dload           19
        //  1036: ddiv           
        //  1037: dstore          13
        //  1039: getstatic       dev/nuker/pyro/fc.1:I
        //  1042: ifeq            1051
        //  1045: ldc_w           -1553774163
        //  1048: goto            1054
        //  1051: ldc_w           1743396574
        //  1054: ldc_w           -68812561
        //  1057: ixor           
        //  1058: lookupswitch {
        //          596356209: 1051
        //          1485130050: 2057
        //          default: 1084
        //        }
        //  1084: dload           15
        //  1086: dload           19
        //  1088: ddiv           
        //  1089: dstore          15
        //  1091: dload           17
        //  1093: dload           19
        //  1095: ddiv           
        //  1096: dstore          17
        //  1098: aload_0        
        //  1099: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  1102: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1105: new             Lnet/minecraft/util/math/Vec3d;
        //  1108: dup            
        //  1109: dload_3        
        //  1110: dload           5
        //  1112: dload           7
        //  1114: goto            1118
        //  1117: athrow         
        //  1118: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //  1121: goto            1125
        //  1124: athrow         
        //  1125: aload_2        
        //  1126: goto            1130
        //  1129: athrow         
        //  1130: invokevirtual   net/minecraft/entity/EntityLivingBase.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //  1133: goto            1137
        //  1136: athrow         
        //  1137: goto            1141
        //  1140: athrow         
        //  1141: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_72842_a:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/AxisAlignedBB;)F
        //  1144: goto            1148
        //  1147: athrow         
        //  1148: f2d            
        //  1149: dstore          21
        //  1151: dconst_1       
        //  1152: dload           11
        //  1154: dsub           
        //  1155: dload           21
        //  1157: dmul           
        //  1158: dstore          23
        //  1160: dload           23
        //  1162: dload           23
        //  1164: dmul           
        //  1165: getstatic       dev/nuker/pyro/fc.1:I
        //  1168: ifeq            1177
        //  1171: ldc_w           -1482913645
        //  1174: goto            1180
        //  1177: ldc_w           964071011
        //  1180: ldc_w           -2053768133
        //  1183: ixor           
        //  1184: lookupswitch {
        //          -1125944744: 1212
        //          571045032: 1177
        //          default: 2101
        //        }
        //  1212: dload           23
        //  1214: dadd           
        //  1215: ldc2_w          2.0
        //  1218: ddiv           
        //  1219: ldc2_w          7.0
        //  1222: dmul           
        //  1223: fload           10
        //  1225: f2d            
        //  1226: dmul           
        //  1227: dconst_1       
        //  1228: dadd           
        //  1229: d2i            
        //  1230: i2f            
        //  1231: fstore          25
        //  1233: aload_0        
        //  1234: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  1237: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1240: getstatic       dev/nuker/pyro/fc.c:I
        //  1243: ifge            1252
        //  1246: ldc_w           956238635
        //  1249: goto            1255
        //  1252: ldc_w           -742846727
        //  1255: ldc_w           1285186273
        //  1258: ixor           
        //  1259: lookupswitch {
        //          -1625068520: 1284
        //          1952803274: 1252
        //          default: 2073
        //        }
        //  1284: goto            1288
        //  1287: athrow         
        //  1288: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_175659_aa:()Lnet/minecraft/world/EnumDifficulty;
        //  1291: goto            1295
        //  1294: athrow         
        //  1295: getstatic       net/minecraft/world/EnumDifficulty.PEACEFUL:Lnet/minecraft/world/EnumDifficulty;
        //  1298: if_acmpne       1307
        //  1301: fconst_0       
        //  1302: fstore          25
        //  1304: goto            1786
        //  1307: aload_0        
        //  1308: getstatic       dev/nuker/pyro/fc.1:I
        //  1311: ifeq            1320
        //  1314: ldc_w           -1127928267
        //  1317: goto            1323
        //  1320: ldc_w           1813916522
        //  1323: ldc_w           713770117
        //  1326: ixor           
        //  1327: lookupswitch {
        //          -1773245776: 2097
        //          -1728372505: 1320
        //          default: 1352
        //        }
        //  1352: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  1355: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1358: getstatic       dev/nuker/pyro/fc.c:I
        //  1361: ifge            1370
        //  1364: ldc_w           1642195378
        //  1367: goto            1373
        //  1370: ldc_w           -1394282217
        //  1373: ldc_w           1369560807
        //  1376: ixor           
        //  1377: lookupswitch {
        //          563408223: 1370
        //          809516885: 2075
        //          default: 1404
        //        }
        //  1404: goto            1408
        //  1407: athrow         
        //  1408: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_175659_aa:()Lnet/minecraft/world/EnumDifficulty;
        //  1411: goto            1415
        //  1414: athrow         
        //  1415: getstatic       net/minecraft/world/EnumDifficulty.EASY:Lnet/minecraft/world/EnumDifficulty;
        //  1418: if_acmpne       1427
        //  1421: ldc_w           -262360814
        //  1424: goto            1430
        //  1427: ldc_w           -262360787
        //  1430: ldc_w           1790094285
        //  1433: ixor           
        //  1434: tableswitch {
        //          903624126: 1456
        //          903624127: 1569
        //          default: 1421
        //        }
        //  1456: fload           25
        //  1458: fconst_2       
        //  1459: fdiv           
        //  1460: fconst_1       
        //  1461: fadd           
        //  1462: fload           25
        //  1464: getstatic       dev/nuker/pyro/fc.c:I
        //  1467: ifge            1476
        //  1470: ldc_w           230223077
        //  1473: goto            1479
        //  1476: ldc_w           -1953778432
        //  1479: ldc_w           -993800384
        //  1482: ixor           
        //  1483: lookupswitch {
        //          -914676827: 1476
        //          1330149952: 1508
        //          default: 2059
        //        }
        //  1508: goto            1512
        //  1511: athrow         
        //  1512: invokestatic    java/lang/Math.min:(FF)F
        //  1515: goto            1519
        //  1518: athrow         
        //  1519: getstatic       dev/nuker/pyro/fc.1:I
        //  1522: ifeq            1531
        //  1525: ldc_w           1676207326
        //  1528: goto            1534
        //  1531: ldc_w           863233007
        //  1534: ldc_w           505177492
        //  1537: ixor           
        //  1538: lookupswitch {
        //          762283643: 1564
        //          2113175882: 1531
        //          default: 2045
        //        }
        //  1564: fstore          25
        //  1566: goto            1786
        //  1569: aload_0        
        //  1570: getstatic       dev/nuker/pyro/fc.0:I
        //  1573: ifeq            1582
        //  1576: ldc_w           1865473675
        //  1579: goto            1585
        //  1582: ldc_w           1537649056
        //  1585: ldc_w           26028844
        //  1588: ixor           
        //  1589: lookupswitch {
        //          1512800908: 1616
        //          1857942951: 1582
        //          default: 2095
        //        }
        //  1616: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  1619: getstatic       dev/nuker/pyro/fc.0:I
        //  1622: ifeq            1631
        //  1625: ldc_w           -1103584161
        //  1628: goto            1634
        //  1631: ldc_w           1537037809
        //  1634: ldc_w           2028770000
        //  1637: ixor           
        //  1638: lookupswitch {
        //          -959170929: 1631
        //          594659105: 1664
        //          default: 2083
        //        }
        //  1664: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1667: goto            1671
        //  1670: athrow         
        //  1671: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_175659_aa:()Lnet/minecraft/world/EnumDifficulty;
        //  1674: goto            1678
        //  1677: athrow         
        //  1678: getstatic       dev/nuker/pyro/fc.1:I
        //  1681: ifeq            1690
        //  1684: ldc_w           36713227
        //  1687: goto            1693
        //  1690: ldc_w           1173945873
        //  1693: ldc_w           1756108485
        //  1696: ixor           
        //  1697: lookupswitch {
        //          -1273815751: 1690
        //          1788618190: 2077
        //          default: 1724
        //        }
        //  1724: getstatic       net/minecraft/world/EnumDifficulty.HARD:Lnet/minecraft/world/EnumDifficulty;
        //  1727: if_acmpne       1786
        //  1730: fload           25
        //  1732: ldc_w           3.0
        //  1735: fmul           
        //  1736: fconst_2       
        //  1737: fdiv           
        //  1738: getstatic       dev/nuker/pyro/fc.c:I
        //  1741: ifge            1750
        //  1744: ldc_w           1600165301
        //  1747: goto            1753
        //  1750: ldc_w           -1213133359
        //  1753: ldc_w           -228550229
        //  1756: ixor           
        //  1757: lookupswitch {
        //          -1789938605: 1750
        //          -1392505826: 2091
        //          default: 1784
        //        }
        //  1784: fstore          25
        //  1786: getstatic       dev/nuker/pyro/fc.1:I
        //  1789: ifeq            1798
        //  1792: ldc_w           1162418267
        //  1795: goto            1801
        //  1798: ldc_w           76768847
        //  1801: ldc_w           -1719502463
        //  1804: ixor           
        //  1805: lookupswitch {
        //          -590650918: 2093
        //          475753747: 1798
        //          default: 1832
        //        }
        //  1832: fload           25
        //  1834: aload_0        
        //  1835: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  1838: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1841: goto            1845
        //  1844: athrow         
        //  1845: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70658_aO:()I
        //  1848: goto            1852
        //  1851: athrow         
        //  1852: i2f            
        //  1853: aload_0        
        //  1854: getstatic       dev/nuker/pyro/fc.c:I
        //  1857: ifge            1866
        //  1860: ldc_w           1177271381
        //  1863: goto            1869
        //  1866: ldc_w           1452290195
        //  1869: ldc_w           -35311645
        //  1872: ixor           
        //  1873: lookupswitch {
        //          -1418387600: 1900
        //          -1144089674: 1866
        //          default: 2067
        //        }
        //  1900: getfield        dev/nuker/pyro/f5c.c:Lnet/minecraft/client/Minecraft;
        //  1903: getstatic       dev/nuker/pyro/fc.c:I
        //  1906: ifge            1915
        //  1909: ldc_w           908793628
        //  1912: goto            1918
        //  1915: ldc_w           -73298880
        //  1918: ldc_w           1957956379
        //  1921: ixor           
        //  1922: lookupswitch {
        //          -1894414501: 1948
        //          1117723655: 1915
        //          default: 2063
        //        }
        //  1948: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1951: getstatic       net/minecraft/entity/SharedMonsterAttributes.field_189429_h:Lnet/minecraft/entity/ai/attributes/IAttribute;
        //  1954: goto            1958
        //  1957: athrow         
        //  1958: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_110148_a:(Lnet/minecraft/entity/ai/attributes/IAttribute;)Lnet/minecraft/entity/ai/attributes/IAttributeInstance;
        //  1961: goto            1965
        //  1964: athrow         
        //  1965: goto            1969
        //  1968: athrow         
        //  1969: invokeinterface net/minecraft/entity/ai/attributes/IAttributeInstance.func_111126_e:()D
        //  1974: goto            1978
        //  1977: athrow         
        //  1978: d2f            
        //  1979: goto            1983
        //  1982: athrow         
        //  1983: invokestatic    net/minecraft/util/CombatRules.func_189427_a:(FFF)F
        //  1986: goto            1990
        //  1989: athrow         
        //  1990: getstatic       dev/nuker/pyro/fc.0:I
        //  1993: ifeq            2002
        //  1996: ldc_w           522372811
        //  1999: goto            2005
        //  2002: ldc_w           -2133341160
        //  2005: ldc_w           1788354583
        //  2008: ixor           
        //  2009: lookupswitch {
        //          -363860977: 2036
        //          1975183068: 2002
        //          default: 2065
        //        }
        //  2036: fstore          25
        //  2038: fload           25
        //  2040: freturn        
        //  2041: fconst_0       
        //  2042: freturn        
        //  2043: aconst_null    
        //  2044: athrow         
        //  2045: aconst_null    
        //  2046: athrow         
        //  2047: aconst_null    
        //  2048: athrow         
        //  2049: aconst_null    
        //  2050: athrow         
        //  2051: aconst_null    
        //  2052: athrow         
        //  2053: aconst_null    
        //  2054: athrow         
        //  2055: aconst_null    
        //  2056: athrow         
        //  2057: aconst_null    
        //  2058: athrow         
        //  2059: aconst_null    
        //  2060: athrow         
        //  2061: aconst_null    
        //  2062: athrow         
        //  2063: aconst_null    
        //  2064: athrow         
        //  2065: aconst_null    
        //  2066: athrow         
        //  2067: aconst_null    
        //  2068: athrow         
        //  2069: aconst_null    
        //  2070: athrow         
        //  2071: aconst_null    
        //  2072: athrow         
        //  2073: aconst_null    
        //  2074: athrow         
        //  2075: aconst_null    
        //  2076: athrow         
        //  2077: aconst_null    
        //  2078: athrow         
        //  2079: aconst_null    
        //  2080: athrow         
        //  2081: aconst_null    
        //  2082: athrow         
        //  2083: aconst_null    
        //  2084: athrow         
        //  2085: aconst_null    
        //  2086: athrow         
        //  2087: aconst_null    
        //  2088: athrow         
        //  2089: aconst_null    
        //  2090: athrow         
        //  2091: aconst_null    
        //  2092: athrow         
        //  2093: aconst_null    
        //  2094: athrow         
        //  2095: aconst_null    
        //  2096: athrow         
        //  2097: aconst_null    
        //  2098: athrow         
        //  2099: aconst_null    
        //  2100: athrow         
        //  2101: aconst_null    
        //  2102: athrow         
        //  2103: aconst_null    
        //  2104: athrow         
        //  2105: pop            
        //  2106: goto            24
        //  2109: pop            
        //  2110: aconst_null    
        //  2111: goto            2105
        //  2114: dup            
        //  2115: ifnull          2105
        //  2118: checkcast       Ljava/lang/Throwable;
        //  2121: athrow         
        //  2122: dup            
        //  2123: ifnull          2109
        //  2126: checkcast       Ljava/lang/Throwable;
        //  2129: athrow         
        //  2130: aconst_null    
        //  2131: athrow         
        //    StackMapTable: 00 DA FF 00 03 00 04 07 00 03 07 00 73 07 01 78 03 00 01 07 00 1D FA 00 04 FF 00 0B 00 00 00 01 07 00 1D FE 00 03 07 00 03 07 00 73 07 01 78 0B 42 01 1C FF 00 0D 00 03 07 00 03 07 00 73 07 01 78 00 02 07 01 78 07 00 03 FF 00 02 00 03 07 00 03 07 00 73 07 01 78 00 03 07 01 78 07 00 03 01 FF 00 1E 00 03 07 00 03 07 00 73 07 01 78 00 02 07 01 78 07 00 03 14 42 01 1F 4C 07 00 03 FF 00 02 00 03 07 00 03 07 00 73 07 01 78 00 02 07 00 03 01 5F 07 00 03 4E 07 00 22 FF 00 02 00 03 07 00 03 07 00 73 07 01 78 00 02 07 00 22 01 5D 07 00 22 0B 05 42 01 1A 01 4C 07 00 73 FF 00 02 00 03 07 00 03 07 00 73 07 01 78 00 02 07 00 73 01 5D 07 00 73 42 07 00 1D 40 07 00 73 45 07 00 1D 40 01 FF 00 09 00 04 07 00 03 07 00 73 07 01 78 03 00 01 07 00 75 40 07 00 73 45 07 00 1D 40 01 50 03 FF 00 02 00 04 07 00 03 07 00 73 07 01 78 03 00 02 03 01 5E 03 FF 00 0E 00 05 07 00 03 07 00 73 07 01 78 03 03 00 01 07 00 73 FF 00 02 00 05 07 00 03 07 00 73 07 01 78 03 03 00 02 07 00 73 01 5D 07 00 73 42 07 00 1D 40 07 00 73 45 07 00 1D 40 01 50 03 FF 00 02 00 05 07 00 03 07 00 73 07 01 78 03 03 00 02 03 01 5C 03 FF 00 14 00 08 07 00 03 07 00 73 07 01 78 03 03 03 02 02 00 01 07 00 1D FF 00 00 00 08 07 00 03 07 00 73 07 01 78 03 03 03 02 02 00 04 07 01 78 03 03 03 45 07 00 1D 40 03 4F 03 FF 00 02 00 08 07 00 03 07 00 73 07 01 78 03 03 03 02 02 00 02 03 01 5F 03 FC 00 14 03 42 01 1F 4C 07 01 78 FF 00 02 00 09 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 00 02 07 01 78 01 5F 07 01 78 50 03 FF 00 02 00 09 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 00 02 03 01 5F 03 FF 00 11 00 0A 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 00 01 03 FF 00 02 00 0A 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 00 02 03 01 5E 03 43 07 00 AD FF 00 00 00 0A 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 00 02 03 07 01 78 45 07 00 1D FF 00 00 00 0A 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 00 02 03 02 FD 00 1B 03 03 42 01 1C 4D 03 FF 00 02 00 0C 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 00 02 03 01 5E 03 51 07 00 A9 40 03 45 07 00 1D 40 02 FC 00 09 03 05 42 01 1A 12 42 01 1D 60 07 00 1D FF 00 00 00 0D 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 00 06 07 00 BB 08 04 51 08 04 51 03 03 03 45 07 00 1D FF 00 00 00 0D 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 00 02 07 00 BB 07 03 CB 43 07 00 0B FF 00 00 00 0D 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 00 03 07 00 BB 07 03 CB 07 01 78 45 07 00 1D FF 00 00 00 0D 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 00 03 07 00 BB 07 03 CB 07 02 FC 42 07 00 1D FF 00 00 00 0D 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 00 03 07 00 BB 07 03 CB 07 02 FC 45 07 00 1D 40 02 FF 00 1C 00 0F 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 00 01 03 FF 00 02 00 0F 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 00 02 03 01 5F 03 FF 00 27 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 01 07 00 BB FF 00 02 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 02 07 00 BB 01 5C 07 00 BB 42 07 00 1D 40 07 00 BB 45 07 00 1D 40 07 03 E6 0B 4C 07 00 03 FF 00 02 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 02 07 00 03 01 5C 07 00 03 51 07 00 BB FF 00 02 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 02 07 00 BB 01 5E 07 00 BB 42 07 00 B3 40 07 00 BB 45 07 00 1D 40 07 03 E6 05 05 42 01 19 FF 00 13 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 02 02 02 FF 00 02 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 03 02 02 01 FF 00 1C 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 02 02 02 42 07 00 1D FF 00 00 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 02 02 02 45 07 00 1D 40 02 4B 02 FF 00 02 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 02 02 01 5D 02 04 4C 07 00 03 FF 00 02 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 02 07 00 03 01 5E 07 00 03 4E 07 00 22 FF 00 02 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 02 07 00 22 01 5D 07 00 22 FF 00 05 00 00 00 01 07 00 1D FF 00 00 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 01 07 00 BB 45 07 00 1D 40 07 03 E6 4B 07 03 E6 FF 00 02 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 02 07 03 E6 01 5E 07 03 E6 59 02 FF 00 02 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 02 02 01 5E 02 01 0B 42 01 1E 4B 07 00 1D FF 00 00 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 02 02 07 00 28 45 07 00 1D FF 00 00 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 02 02 01 FF 00 0D 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 03 02 02 07 00 03 FF 00 02 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 04 02 02 07 00 03 01 FF 00 1E 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 03 02 02 07 00 03 FF 00 0E 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 03 02 02 07 00 22 FF 00 02 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 04 02 02 07 00 22 01 FF 00 1D 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 03 02 02 07 00 22 48 07 00 1D FF 00 00 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 04 02 02 07 00 28 07 04 38 45 07 00 1D FF 00 00 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 03 02 02 07 04 2A 42 07 00 1D FF 00 00 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 03 02 02 07 04 2A 47 07 00 1D FF 00 00 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 03 02 02 03 43 07 00 1D FF 00 00 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 03 02 02 02 45 07 00 1D 40 02 4B 02 FF 00 02 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 02 02 01 5E 02 FF 00 04 00 09 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 00 00 FF 00 01 00 03 07 00 03 07 00 73 07 01 78 00 02 07 01 78 07 00 03 FF 00 01 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 01 02 FF 00 01 00 03 07 00 03 07 00 73 07 01 78 00 00 41 07 00 73 FF 00 01 00 08 07 00 03 07 00 73 07 01 78 03 03 03 02 02 00 01 03 FF 00 01 00 0A 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 00 01 03 FD 00 01 03 03 FC 00 01 03 FF 00 01 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 02 02 02 FF 00 01 00 03 07 00 03 07 00 73 07 01 78 00 00 FF 00 01 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 03 02 02 07 00 22 41 02 FF 00 01 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 03 02 02 07 00 03 FF 00 01 00 05 07 00 03 07 00 73 07 01 78 03 03 00 01 07 00 73 FF 00 01 00 09 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 00 01 03 FF 00 01 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 01 07 00 BB 41 07 00 BB 41 07 03 E6 FF 00 01 00 0C 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 00 01 03 FF 00 01 00 03 07 00 03 07 00 73 07 01 78 00 01 07 00 03 FF 00 01 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 01 07 00 22 FF 00 01 00 05 07 00 03 07 00 73 07 01 78 03 03 00 01 03 FF 00 01 00 04 07 00 03 07 00 73 07 01 78 03 00 01 03 FF 00 01 00 03 07 00 03 07 00 73 07 01 78 00 01 07 00 22 FF 00 01 00 10 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 02 00 01 02 01 41 07 00 03 41 07 00 03 FF 00 01 00 09 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 00 01 07 01 78 FF 00 01 00 0F 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 03 03 03 03 03 03 00 01 03 FF 00 01 00 09 07 00 03 07 00 73 07 01 78 03 03 03 02 02 03 00 00 FF 00 01 00 03 07 00 03 07 00 73 07 01 78 00 01 07 00 1D 43 05 44 07 00 1D 47 05 FF 00 07 00 04 07 00 03 07 00 73 07 01 78 03 00 01 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2114   2122   Ljava/lang/RuntimeException;
        //  2114   2122   2114   2122   Any
        //  2130   2132   3      8      Ljava/lang/NullPointerException;
        //  367    374    374    375    Any
        //  367    374    374    375    Any
        //  368    374    374    375    Any
        //  367    374    367    368    Ljava/util/NoSuchElementException;
        //  368    374    367    368    Any
        //  385    392    392    393    Any
        //  386    392    3      8      Ljava/util/NoSuchElementException;
        //  386    392    385    386    Ljava/lang/UnsupportedOperationException;
        //  386    392    385    386    Ljava/lang/IllegalArgumentException;
        //  385    392    392    393    Any
        //  495    502    502    503    Any
        //  496    502    3      8      Any
        //  496    502    3      8      Any
        //  495    502    495    496    Any
        //  496    502    502    503    Any
        //  573    580    580    581    Any
        //  573    580    573    574    Any
        //  574    580    573    574    Any
        //  574    580    580    581    Any
        //  573    580    3      8      Ljava/lang/ArithmeticException;
        //  844    851    851    852    Any
        //  845    851    851    852    Any
        //  845    851    844    845    Ljava/lang/NumberFormatException;
        //  845    851    3      8      Any
        //  844    851    851    852    Any
        //  978    985    985    986    Any
        //  979    985    3      8      Any
        //  978    985    3      8      Ljava/lang/NumberFormatException;
        //  978    985    978    979    Ljava/lang/ClassCastException;
        //  978    985    985    986    Ljava/util/NoSuchElementException;
        //  1117   1124   1124   1125   Any
        //  1118   1124   1117   1118   Ljava/lang/ClassCastException;
        //  1118   1124   3      8      Any
        //  1118   1124   1117   1118   Any
        //  1118   1124   1124   1125   Ljava/lang/ArithmeticException;
        //  1129   1136   1136   1137   Any
        //  1130   1136   1136   1137   Ljava/lang/EnumConstantNotPresentException;
        //  1130   1136   1129   1130   Ljava/lang/NegativeArraySizeException;
        //  1129   1136   1136   1137   Any
        //  1130   1136   3      8      Ljava/lang/AssertionError;
        //  1140   1147   1147   1148   Any
        //  1140   1147   1140   1141   Any
        //  1141   1147   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1140   1147   1147   1148   Ljava/lang/NullPointerException;
        //  1141   1147   3      8      Any
        //  1287   1294   1294   1295   Any
        //  1288   1294   1287   1288   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1287   1294   1287   1288   Any
        //  1287   1294   1287   1288   Any
        //  1288   1294   3      8      Ljava/lang/ClassCastException;
        //  1407   1414   1414   1415   Any
        //  1407   1414   1407   1408   Ljava/util/ConcurrentModificationException;
        //  1408   1414   1414   1415   Ljava/lang/RuntimeException;
        //  1407   1414   1414   1415   Any
        //  1407   1414   1414   1415   Any
        //  1511   1518   1518   1519   Any
        //  1511   1518   3      8      Any
        //  1511   1518   1511   1512   Ljava/lang/NullPointerException;
        //  1511   1518   1511   1512   Any
        //  1512   1518   3      8      Any
        //  1671   1677   1677   1678   Any
        //  1671   1677   3      8      Any
        //  1671   1677   1677   1678   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1671   1677   3      8      Any
        //  1671   1677   1677   1678   Ljava/lang/StringIndexOutOfBoundsException;
        //  1844   1851   1851   1852   Any
        //  1844   1851   1844   1845   Ljava/lang/IllegalArgumentException;
        //  1845   1851   1851   1852   Ljava/lang/EnumConstantNotPresentException;
        //  1844   1851   1844   1845   Ljava/lang/AssertionError;
        //  1844   1851   1851   1852   Any
        //  1957   1964   1964   1965   Any
        //  1957   1964   3      8      Any
        //  1958   1964   1957   1958   Any
        //  1957   1964   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1957   1964   1957   1958   Ljava/lang/RuntimeException;
        //  1968   1977   1977   1978   Any
        //  1968   1977   1968   1969   Any
        //  1968   1977   1977   1978   Any
        //  1968   1977   3      8      Ljava/lang/AssertionError;
        //  1969   1977   3      8      Any
        //  1982   1989   1989   1990   Any
        //  1983   1989   1982   1983   Any
        //  1983   1989   1982   1983   Any
        //  1983   1989   1982   1983   Any
        //  1983   1989   1989   1990   Ljava/lang/NullPointerException;
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
