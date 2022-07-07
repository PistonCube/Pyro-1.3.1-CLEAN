// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.Block;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import org.jetbrains.annotations.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;

public class f5z extends fH
{
    public f0a c;
    public f0a 0;
    public f0b c;
    public BlockPos c;
    
    public float[] c(final Vec3d p0, final Vec3d p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          507
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            499
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            491
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_2        
        //    25: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //    28: aload_1        
        //    29: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //    32: dsub           
        //    33: dstore_3       
        //    34: aload_2        
        //    35: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //    38: aload_1        
        //    39: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //    42: dsub           
        //    43: getstatic       dev/nuker/pyro/fc.c:I
        //    46: ifge            54
        //    49: ldc             -422075707
        //    51: goto            56
        //    54: ldc             -2107439174
        //    56: ldc             -1459486426
        //    58: ixor           
        //    59: lookupswitch {
        //          727778972: 84
        //          1339401187: 54
        //          default: 478
        //        }
        //    84: dstore          5
        //    86: aload_2        
        //    87: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //    90: aload_1        
        //    91: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //    94: dsub           
        //    95: dstore          7
        //    97: dload_3        
        //    98: dload_3        
        //    99: dmul           
        //   100: getstatic       dev/nuker/pyro/fc.1:I
        //   103: ifeq            111
        //   106: ldc             2001030545
        //   108: goto            113
        //   111: ldc             481720436
        //   113: ldc             -1169858228
        //   115: ixor           
        //   116: lookupswitch {
        //          -855626531: 472
        //          -282087336: 111
        //          default: 144
        //        }
        //   144: dload           7
        //   146: dload           7
        //   148: dmul           
        //   149: dadd           
        //   150: goto            154
        //   153: athrow         
        //   154: invokestatic    java/lang/Math.sqrt:(D)D
        //   157: goto            161
        //   160: athrow         
        //   161: dstore          9
        //   163: dload           7
        //   165: dload_3        
        //   166: goto            170
        //   169: athrow         
        //   170: invokestatic    java/lang/Math.atan2:(DD)D
        //   173: goto            177
        //   176: athrow         
        //   177: goto            181
        //   180: athrow         
        //   181: invokestatic    java/lang/Math.toDegrees:(D)D
        //   184: goto            188
        //   187: athrow         
        //   188: d2f            
        //   189: ldc             90.0
        //   191: fsub           
        //   192: fstore          11
        //   194: dload           5
        //   196: dload           9
        //   198: getstatic       dev/nuker/pyro/fc.1:I
        //   201: ifeq            209
        //   204: ldc             1292283544
        //   206: goto            211
        //   209: ldc             59552655
        //   211: ldc             1563184118
        //   213: ixor           
        //   214: lookupswitch {
        //          271246702: 209
        //          1587607673: 240
        //          default: 470
        //        }
        //   240: goto            244
        //   243: athrow         
        //   244: invokestatic    java/lang/Math.atan2:(DD)D
        //   247: goto            251
        //   250: athrow         
        //   251: goto            255
        //   254: athrow         
        //   255: invokestatic    java/lang/Math.toDegrees:(D)D
        //   258: goto            262
        //   261: athrow         
        //   262: dneg           
        //   263: d2f            
        //   264: fstore          12
        //   266: iconst_2       
        //   267: newarray        F
        //   269: dup            
        //   270: iconst_0       
        //   271: aload_0        
        //   272: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //   275: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   278: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   281: fload           11
        //   283: aload_0        
        //   284: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //   287: getstatic       dev/nuker/pyro/fc.1:I
        //   290: ifeq            298
        //   293: ldc             -993989008
        //   295: goto            300
        //   298: ldc             1860809802
        //   300: ldc             155434384
        //   302: ixor           
        //   303: lookupswitch {
        //          -847031328: 298
        //          1739196890: 328
        //          default: 474
        //        }
        //   328: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   331: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   334: fsub           
        //   335: goto            339
        //   338: athrow         
        //   339: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //   342: goto            346
        //   345: athrow         
        //   346: fadd           
        //   347: fastore        
        //   348: dup            
        //   349: iconst_1       
        //   350: aload_0        
        //   351: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //   354: getstatic       dev/nuker/pyro/fc.0:I
        //   357: ifeq            365
        //   360: ldc             -1752602731
        //   362: goto            367
        //   365: ldc             -69522269
        //   367: ldc             -1014123481
        //   369: ixor           
        //   370: lookupswitch {
        //          945199236: 396
        //          1409602482: 365
        //          default: 476
        //        }
        //   396: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   399: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //   402: fload           12
        //   404: aload_0        
        //   405: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //   408: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   411: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //   414: fsub           
        //   415: getstatic       dev/nuker/pyro/fc.c:I
        //   418: ifge            426
        //   421: ldc             2106100777
        //   423: goto            428
        //   426: ldc             1785920559
        //   428: ldc             2088182951
        //   430: ixor           
        //   431: lookupswitch {
        //          33532046: 426
        //          369481864: 456
        //          default: 480
        //        }
        //   456: goto            460
        //   459: athrow         
        //   460: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //   463: goto            467
        //   466: athrow         
        //   467: fadd           
        //   468: fastore        
        //   469: areturn        
        //   470: aconst_null    
        //   471: athrow         
        //   472: aconst_null    
        //   473: athrow         
        //   474: aconst_null    
        //   475: athrow         
        //   476: aconst_null    
        //   477: athrow         
        //   478: aconst_null    
        //   479: athrow         
        //   480: aconst_null    
        //   481: athrow         
        //   482: pop            
        //   483: goto            24
        //   486: pop            
        //   487: aconst_null    
        //   488: goto            482
        //   491: dup            
        //   492: ifnull          482
        //   495: checkcast       Ljava/lang/Throwable;
        //   498: athrow         
        //   499: dup            
        //   500: ifnull          486
        //   503: checkcast       Ljava/lang/Throwable;
        //   506: athrow         
        //   507: aconst_null    
        //   508: athrow         
        //    StackMapTable: 00 3D FF 00 03 00 06 07 00 03 07 00 26 07 00 26 03 03 03 00 01 07 00 24 F8 00 04 FF 00 0B 00 00 00 01 07 00 24 FE 00 03 07 00 03 07 00 26 07 00 26 FF 00 1D 00 04 07 00 03 07 00 26 07 00 26 03 00 01 03 FF 00 01 00 04 07 00 03 07 00 26 07 00 26 03 00 02 03 01 5B 03 FF 00 1A 00 06 07 00 03 07 00 26 07 00 26 03 03 03 00 01 03 FF 00 01 00 06 07 00 03 07 00 26 07 00 26 03 03 03 00 02 03 01 5E 03 48 07 00 24 40 03 45 07 00 24 40 03 FF 00 07 00 00 00 01 07 00 24 FF 00 00 00 07 07 00 03 07 00 26 07 00 26 03 03 03 03 00 02 03 03 45 07 00 24 40 03 42 07 00 24 40 03 45 07 00 24 40 03 FF 00 14 00 08 07 00 03 07 00 26 07 00 26 03 03 03 03 02 00 02 03 03 FF 00 01 00 08 07 00 03 07 00 26 07 00 26 03 03 03 03 02 00 03 03 03 01 FF 00 1C 00 08 07 00 03 07 00 26 07 00 26 03 03 03 03 02 00 02 03 03 42 07 00 24 FF 00 00 00 08 07 00 03 07 00 26 07 00 26 03 03 03 03 02 00 02 03 03 45 07 00 24 40 03 FF 00 02 00 00 00 01 07 00 24 FF 00 00 00 08 07 00 03 07 00 26 07 00 26 03 03 03 03 02 00 01 03 45 07 00 24 40 03 FF 00 23 00 09 07 00 03 07 00 26 07 00 26 03 03 03 03 02 02 00 06 07 00 6F 07 00 6F 01 02 02 07 00 51 FF 00 01 00 09 07 00 03 07 00 26 07 00 26 03 03 03 03 02 02 00 07 07 00 6F 07 00 6F 01 02 02 07 00 51 01 FF 00 1B 00 09 07 00 03 07 00 26 07 00 26 03 03 03 03 02 02 00 06 07 00 6F 07 00 6F 01 02 02 07 00 51 49 07 00 24 FF 00 00 00 09 07 00 03 07 00 26 07 00 26 03 03 03 03 02 02 00 05 07 00 6F 07 00 6F 01 02 02 45 07 00 24 FF 00 00 00 09 07 00 03 07 00 26 07 00 26 03 03 03 03 02 02 00 05 07 00 6F 07 00 6F 01 02 02 FF 00 12 00 09 07 00 03 07 00 26 07 00 26 03 03 03 03 02 02 00 04 07 00 6F 07 00 6F 01 07 00 51 FF 00 01 00 09 07 00 03 07 00 26 07 00 26 03 03 03 03 02 02 00 05 07 00 6F 07 00 6F 01 07 00 51 01 FF 00 1C 00 09 07 00 03 07 00 26 07 00 26 03 03 03 03 02 02 00 04 07 00 6F 07 00 6F 01 07 00 51 FF 00 1D 00 09 07 00 03 07 00 26 07 00 26 03 03 03 03 02 02 00 05 07 00 6F 07 00 6F 01 02 02 FF 00 01 00 09 07 00 03 07 00 26 07 00 26 03 03 03 03 02 02 00 06 07 00 6F 07 00 6F 01 02 02 01 FF 00 1B 00 09 07 00 03 07 00 26 07 00 26 03 03 03 03 02 02 00 05 07 00 6F 07 00 6F 01 02 02 42 07 00 24 FF 00 00 00 09 07 00 03 07 00 26 07 00 26 03 03 03 03 02 02 00 05 07 00 6F 07 00 6F 01 02 02 45 07 00 24 FF 00 00 00 09 07 00 03 07 00 26 07 00 26 03 03 03 03 02 02 00 05 07 00 6F 07 00 6F 01 02 02 FF 00 02 00 08 07 00 03 07 00 26 07 00 26 03 03 03 03 02 00 02 03 03 FF 00 01 00 06 07 00 03 07 00 26 07 00 26 03 03 03 00 01 03 FF 00 01 00 09 07 00 03 07 00 26 07 00 26 03 03 03 03 02 02 00 06 07 00 6F 07 00 6F 01 02 02 07 00 51 FF 00 01 00 09 07 00 03 07 00 26 07 00 26 03 03 03 03 02 02 00 04 07 00 6F 07 00 6F 01 07 00 51 FF 00 01 00 04 07 00 03 07 00 26 07 00 26 03 00 01 03 FF 00 01 00 09 07 00 03 07 00 26 07 00 26 03 03 03 03 02 02 00 05 07 00 6F 07 00 6F 01 02 02 FF 00 01 00 03 07 00 03 07 00 26 07 00 26 00 01 07 00 17 43 05 44 07 00 17 47 05 FF 00 07 00 06 07 00 03 07 00 26 07 00 26 03 03 03 00 01 07 00 24
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     491    499    Ljava/lang/IllegalStateException;
        //  491    499    491    499    Ljava/lang/NullPointerException;
        //  507    509    3      8      Any
        //  153    160    160    161    Any
        //  154    160    160    161    Any
        //  154    160    3      8      Ljava/lang/IllegalStateException;
        //  153    160    153    154    Any
        //  154    160    160    161    Ljava/util/ConcurrentModificationException;
        //  170    176    176    177    Any
        //  170    176    3      8      Any
        //  170    176    176    177    Ljava/lang/UnsupportedOperationException;
        //  170    176    3      8      Any
        //  170    176    176    177    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  180    187    187    188    Any
        //  180    187    180    181    Any
        //  180    187    3      8      Any
        //  180    187    187    188    Any
        //  180    187    3      8      Any
        //  243    250    250    251    Any
        //  244    250    243    244    Any
        //  244    250    243    244    Any
        //  244    250    250    251    Any
        //  244    250    250    251    Any
        //  255    261    261    262    Any
        //  255    261    3      8      Ljava/lang/RuntimeException;
        //  255    261    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  255    261    3      8      Any
        //  255    261    261    262    Any
        //  338    345    345    346    Any
        //  338    345    345    346    Ljava/lang/ArithmeticException;
        //  338    345    338    339    Any
        //  339    345    338    339    Ljava/lang/UnsupportedOperationException;
        //  338    345    345    346    Any
        //  459    466    466    467    Any
        //  459    466    459    460    Ljava/lang/IllegalArgumentException;
        //  459    466    459    460    Any
        //  460    466    459    460    Ljava/lang/IllegalStateException;
        //  459    466    466    467    Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:733)
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
    
    public BlockPos[] c(final Entity p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          294
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            286
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            278
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lnet/minecraft/util/math/BlockPos;
        //    27: dup            
        //    28: aload_1        
        //    29: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //    32: goto            36
        //    35: athrow         
        //    36: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //    39: goto            43
        //    42: athrow         
        //    43: aload_1        
        //    44: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //    47: goto            51
        //    50: athrow         
        //    51: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //    54: goto            58
        //    57: athrow         
        //    58: aload_1        
        //    59: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //    62: goto            66
        //    65: athrow         
        //    66: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //    69: goto            73
        //    72: athrow         
        //    73: goto            77
        //    76: athrow         
        //    77: invokespecial   net/minecraft/util/math/BlockPos.<init>:(III)V
        //    80: goto            84
        //    83: athrow         
        //    84: astore_2       
        //    85: iconst_3       
        //    86: anewarray       Lnet/minecraft/util/math/BlockPos;
        //    89: dup            
        //    90: iconst_0       
        //    91: aload_2        
        //    92: goto            96
        //    95: athrow         
        //    96: invokevirtual   net/minecraft/util/math/BlockPos.func_177974_f:()Lnet/minecraft/util/math/BlockPos;
        //    99: goto            103
        //   102: athrow         
        //   103: goto            107
        //   106: athrow         
        //   107: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   110: goto            114
        //   113: athrow         
        //   114: aastore        
        //   115: dup            
        //   116: iconst_1       
        //   117: aload_2        
        //   118: goto            122
        //   121: athrow         
        //   122: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   125: goto            129
        //   128: athrow         
        //   129: getstatic       dev/nuker/pyro/fc.1:I
        //   132: ifeq            140
        //   135: ldc             -1876017339
        //   137: goto            142
        //   140: ldc             -1128170379
        //   142: ldc             1063505097
        //   144: ixor           
        //   145: lookupswitch {
        //          -2086489924: 172
        //          -1353845876: 140
        //          default: 265
        //        }
        //   172: goto            176
        //   175: athrow         
        //   176: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   179: goto            183
        //   182: athrow         
        //   183: goto            187
        //   186: athrow         
        //   187: invokevirtual   net/minecraft/util/math/BlockPos.func_177974_f:()Lnet/minecraft/util/math/BlockPos;
        //   190: goto            194
        //   193: athrow         
        //   194: aastore        
        //   195: dup            
        //   196: iconst_2       
        //   197: getstatic       dev/nuker/pyro/fc.0:I
        //   200: ifeq            208
        //   203: ldc             -1213230116
        //   205: goto            210
        //   208: ldc             991557591
        //   210: ldc             2100300776
        //   212: ixor           
        //   213: lookupswitch {
        //          -895510476: 208
        //          1177156671: 240
        //          default: 267
        //        }
        //   240: aload_2        
        //   241: goto            245
        //   244: athrow         
        //   245: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   248: goto            252
        //   251: athrow         
        //   252: goto            256
        //   255: athrow         
        //   256: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //   259: goto            263
        //   262: athrow         
        //   263: aastore        
        //   264: areturn        
        //   265: aconst_null    
        //   266: athrow         
        //   267: aconst_null    
        //   268: athrow         
        //   269: pop            
        //   270: goto            24
        //   273: pop            
        //   274: aconst_null    
        //   275: goto            269
        //   278: dup            
        //   279: ifnull          269
        //   282: checkcast       Ljava/lang/Throwable;
        //   285: athrow         
        //   286: dup            
        //   287: ifnull          273
        //   290: checkcast       Ljava/lang/Throwable;
        //   293: athrow         
        //   294: aconst_null    
        //   295: athrow         
        //    StackMapTable: 00 3D 43 07 00 24 04 FF 00 0B 00 00 00 01 07 00 24 FD 00 03 07 00 03 07 00 7C 4A 07 00 24 FF 00 00 00 02 07 00 03 07 00 7C 00 03 08 00 18 08 00 18 03 45 07 00 24 FF 00 00 00 02 07 00 03 07 00 7C 00 03 08 00 18 08 00 18 01 46 07 00 17 FF 00 00 00 02 07 00 03 07 00 7C 00 04 08 00 18 08 00 18 01 03 45 07 00 24 FF 00 00 00 02 07 00 03 07 00 7C 00 04 08 00 18 08 00 18 01 01 FF 00 06 00 00 00 01 07 00 24 FF 00 00 00 02 07 00 03 07 00 7C 00 05 08 00 18 08 00 18 01 01 03 45 07 00 24 FF 00 00 00 02 07 00 03 07 00 7C 00 05 08 00 18 08 00 18 01 01 01 42 07 00 24 FF 00 00 00 02 07 00 03 07 00 7C 00 05 08 00 18 08 00 18 01 01 01 45 07 00 24 40 07 00 7A FF 00 0A 00 00 00 01 07 00 24 FF 00 00 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A 45 07 00 24 FF 00 00 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A 42 07 00 24 FF 00 00 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A 45 07 00 24 FF 00 00 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A 46 07 00 17 FF 00 00 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A 45 07 00 24 FF 00 00 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A FF 00 0A 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A FF 00 01 00 03 07 00 03 07 00 7C 07 00 7A 00 05 07 00 9C 07 00 9C 01 07 00 7A 01 FF 00 1D 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A FF 00 02 00 00 00 01 07 00 24 FF 00 00 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A 45 07 00 24 FF 00 00 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A 42 07 00 24 FF 00 00 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A 45 07 00 24 FF 00 00 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A FF 00 0D 00 03 07 00 03 07 00 7C 07 00 7A 00 03 07 00 9C 07 00 9C 01 FF 00 01 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 01 FF 00 1D 00 03 07 00 03 07 00 7C 07 00 7A 00 03 07 00 9C 07 00 9C 01 43 07 00 24 FF 00 00 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A 45 07 00 24 FF 00 00 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A 42 07 00 24 FF 00 00 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A 45 07 00 24 FF 00 00 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A FF 00 01 00 03 07 00 03 07 00 7C 07 00 7A 00 04 07 00 9C 07 00 9C 01 07 00 7A FF 00 01 00 03 07 00 03 07 00 7C 07 00 7A 00 03 07 00 9C 07 00 9C 01 FF 00 01 00 02 07 00 03 07 00 7C 00 01 07 00 24 43 05 44 07 00 24 47 05 47 07 00 24
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     278    286    Ljava/lang/IllegalArgumentException;
        //  278    286    278    286    Any
        //  294    296    3      8      Ljava/lang/NullPointerException;
        //  35     42     42     43     Any
        //  35     42     35     36     Ljava/lang/RuntimeException;
        //  36     42     3      8      Any
        //  35     42     42     43     Ljava/lang/UnsupportedOperationException;
        //  35     42     35     36     Any
        //  50     57     57     58     Any
        //  50     57     57     58     Any
        //  50     57     50     51     Ljava/lang/UnsupportedOperationException;
        //  50     57     3      8      Any
        //  50     57     50     51     Ljava/lang/EnumConstantNotPresentException;
        //  66     72     72     73     Any
        //  66     72     72     73     Any
        //  66     72     72     73     Ljava/lang/IllegalArgumentException;
        //  66     72     3      8      Any
        //  66     72     72     73     Any
        //  76     83     83     84     Any
        //  77     83     3      8      Ljava/util/NoSuchElementException;
        //  76     83     76     77     Ljava/lang/AssertionError;
        //  76     83     76     77     Any
        //  77     83     76     77     Any
        //  96     102    102    103    Any
        //  96     102    3      8      Ljava/util/ConcurrentModificationException;
        //  96     102    3      8      Any
        //  96     102    3      8      Any
        //  96     102    3      8      Ljava/lang/UnsupportedOperationException;
        //  106    113    113    114    Any
        //  107    113    113    114    Ljava/lang/NegativeArraySizeException;
        //  107    113    106    107    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  106    113    106    107    Ljava/lang/AssertionError;
        //  107    113    3      8      Any
        //  121    128    128    129    Any
        //  122    128    128    129    Ljava/util/NoSuchElementException;
        //  121    128    121    122    Ljava/lang/ArithmeticException;
        //  121    128    121    122    Ljava/lang/NullPointerException;
        //  121    128    128    129    Any
        //  176    182    182    183    Any
        //  176    182    182    183    Any
        //  176    182    182    183    Ljava/util/NoSuchElementException;
        //  176    182    182    183    Any
        //  176    182    182    183    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  186    193    193    194    Any
        //  187    193    186    187    Any
        //  187    193    186    187    Any
        //  186    193    193    194    Ljava/lang/ClassCastException;
        //  187    193    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  244    251    251    252    Any
        //  244    251    244    245    Any
        //  244    251    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  244    251    244    245    Ljava/lang/UnsupportedOperationException;
        //  244    251    3      8      Ljava/lang/NullPointerException;
        //  255    262    262    263    Any
        //  255    262    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  255    262    255    256    Any
        //  255    262    3      8      Ljava/lang/ArithmeticException;
        //  256    262    255    256    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 0], but value was: 3.
        //     at com.strobel.core.VerifyArgument.inRange(VerifyArgument.java:347)
        //     at com.strobel.assembler.ir.StackMappingVisitor.getStackValue(StackMappingVisitor.java:67)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:691)
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
    
    public boolean 0(final Entity entity) {
        return fbS.hl(this, 1359932470, entity);
    }
    
    @Override
    public void c(@Nullable final Vec3d vec3d, final float n) {
        fbS.90(this, 1590583313, vec3d, n);
    }
    
    @f06(2)
    @LauncherEventHide
    public void c(final f3i p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          4487
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            4479
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            4471
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
        //    36: getstatic       dev/nuker/pyro/fc.c:I
        //    39: ifge            47
        //    42: ldc             -1312551138
        //    44: goto            49
        //    47: ldc             599569018
        //    49: ldc             1534661663
        //    51: ixor           
        //    52: lookupswitch {
        //          -1190960652: 47
        //          -356705535: 4448
        //          default: 80
        //        }
        //    80: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    83: if_acmpne       143
        //    86: getstatic       dev/nuker/pyro/fc.c:I
        //    89: ifge            97
        //    92: ldc             -85136694
        //    94: goto            99
        //    97: ldc             -1658577945
        //    99: ldc             -1850773409
        //   101: ixor           
        //   102: lookupswitch {
        //          210463672: 128
        //          1799592597: 97
        //          default: 4370
        //        }
        //   128: aload_1        
        //   129: goto            133
        //   132: athrow         
        //   133: invokevirtual   dev/nuker/pyro/f3i.0:()Z
        //   136: goto            140
        //   139: athrow         
        //   140: ifeq            144
        //   143: return         
        //   144: getstatic       dev/nuker/pyro/fc.0:I
        //   147: ifeq            155
        //   150: ldc             -1958874746
        //   152: goto            157
        //   155: ldc             1048914376
        //   157: ldc             710450543
        //   159: ixor           
        //   160: lookupswitch {
        //          -1587188503: 155
        //          350074023: 188
        //          default: 4390
        //        }
        //   188: aload_0        
        //   189: getfield        dev/nuker/pyro/f5z.c:Ldev/nuker/pyro/f0a;
        //   192: goto            196
        //   195: athrow         
        //   196: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   199: goto            203
        //   202: athrow         
        //   203: checkcast       Ljava/lang/Boolean;
        //   206: goto            210
        //   209: athrow         
        //   210: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   213: goto            217
        //   216: athrow         
        //   217: ifeq            331
        //   220: getstatic       dev/nuker/pyro/fc.0:I
        //   223: ifeq            231
        //   226: ldc             -234570961
        //   228: goto            233
        //   231: ldc             1780688986
        //   233: ldc             -2010486309
        //   235: ixor           
        //   236: lookupswitch {
        //          -502709887: 264
        //          2049889012: 231
        //          default: 4438
        //        }
        //   264: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f5E;
        //   267: aload_0        
        //   268: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //   271: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   274: getstatic       dev/nuker/pyro/fc.c:I
        //   277: ifge            285
        //   280: ldc             -1649678371
        //   282: goto            287
        //   285: ldc             2063921329
        //   287: ldc             1281402476
        //   289: ixor           
        //   290: lookupswitch {
        //          -775208527: 4348
        //          1832746719: 285
        //          default: 316
        //        }
        //   316: goto            320
        //   319: athrow         
        //   320: invokevirtual   dev/nuker/pyro/f5E.2:(Lnet/minecraft/entity/Entity;)Z
        //   323: goto            327
        //   326: athrow         
        //   327: ifne            331
        //   330: return         
        //   331: getstatic       dev/nuker/pyro/fc.1:I
        //   334: ifeq            342
        //   337: ldc             -1944516955
        //   339: goto            344
        //   342: ldc             -866909101
        //   344: ldc             1440232629
        //   346: ixor           
        //   347: lookupswitch {
        //          -641650160: 4392
        //          1524101742: 342
        //          default: 372
        //        }
        //   372: aload_0        
        //   373: getstatic       dev/nuker/pyro/fc.1:I
        //   376: ifeq            384
        //   379: ldc             1329215028
        //   381: goto            386
        //   384: ldc             -401911826
        //   386: ldc             1416197045
        //   388: ixor           
        //   389: lookupswitch {
        //          -1134412709: 416
        //          458442113: 384
        //          default: 4350
        //        }
        //   416: getfield        dev/nuker/pyro/f5z.0:Ldev/nuker/pyro/f0a;
        //   419: goto            423
        //   422: athrow         
        //   423: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   426: goto            430
        //   429: athrow         
        //   430: checkcast       Ljava/lang/Boolean;
        //   433: getstatic       dev/nuker/pyro/fc.1:I
        //   436: ifeq            444
        //   439: ldc             895011137
        //   441: goto            446
        //   444: ldc             1972794015
        //   446: ldc             -206050516
        //   448: ixor           
        //   449: lookupswitch {
        //          -2044618317: 476
        //          -957406611: 444
        //          default: 4460
        //        }
        //   476: goto            480
        //   479: athrow         
        //   480: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   483: goto            487
        //   486: athrow         
        //   487: ifeq            582
        //   490: getstatic       dev/nuker/pyro/fc.1:I
        //   493: ifeq            501
        //   496: ldc             -478813826
        //   498: goto            503
        //   501: ldc             -216989183
        //   503: ldc             1652797681
        //   505: ixor           
        //   506: lookupswitch {
        //          -2114563697: 501
        //          -1852656912: 532
        //          default: 4440
        //        }
        //   532: aload_0        
        //   533: aload_0        
        //   534: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //   537: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   540: goto            544
        //   543: athrow         
        //   544: invokevirtual   dev/nuker/pyro/f5z.0:(Lnet/minecraft/entity/Entity;)Z
        //   547: goto            551
        //   550: athrow         
        //   551: ifeq            582
        //   554: aload_0        
        //   555: getfield        dev/nuker/pyro/f5z.c:Ldev/nuker/pyro/fw;
        //   558: iconst_0       
        //   559: goto            563
        //   562: athrow         
        //   563: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   566: goto            570
        //   569: athrow         
        //   570: goto            574
        //   573: athrow         
        //   574: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   577: goto            581
        //   580: athrow         
        //   581: return         
        //   582: iconst_m1      
        //   583: istore_2       
        //   584: iconst_1       
        //   585: getstatic       dev/nuker/pyro/fc.0:I
        //   588: ifeq            597
        //   591: ldc_w           1535530600
        //   594: goto            600
        //   597: ldc_w           -336057233
        //   600: ldc_w           664318756
        //   603: ixor           
        //   604: lookupswitch {
        //          -866082997: 632
        //          2082399564: 597
        //          default: 4442
        //        }
        //   632: istore_3       
        //   633: aload_0        
        //   634: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //   637: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   640: goto            644
        //   643: athrow         
        //   644: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //   647: goto            651
        //   650: athrow         
        //   651: getstatic       dev/nuker/pyro/fc.c:I
        //   654: ifge            663
        //   657: ldc_w           69867146
        //   660: goto            666
        //   663: ldc_w           1359956944
        //   666: ldc_w           -1057674230
        //   669: ixor           
        //   670: lookupswitch {
        //          -1845860390: 696
        //          -992003456: 663
        //          default: 4382
        //        }
        //   696: goto            700
        //   699: athrow         
        //   700: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //   703: goto            707
        //   706: athrow         
        //   707: ifne            999
        //   710: aload_0        
        //   711: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //   714: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   717: goto            721
        //   720: athrow         
        //   721: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //   724: goto            728
        //   727: athrow         
        //   728: goto            732
        //   731: athrow         
        //   732: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   735: goto            739
        //   738: athrow         
        //   739: instanceof      Lnet/minecraft/item/ItemBlock;
        //   742: ifeq            999
        //   745: aload_0        
        //   746: getstatic       dev/nuker/pyro/fc.1:I
        //   749: ifeq            758
        //   752: ldc_w           -245878300
        //   755: goto            761
        //   758: ldc_w           -1705761888
        //   761: ldc_w           726394912
        //   764: ixor           
        //   765: lookupswitch {
        //          -636233276: 4356
        //          559829129: 758
        //          default: 792
        //        }
        //   792: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //   795: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   798: goto            802
        //   801: athrow         
        //   802: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //   805: goto            809
        //   808: athrow         
        //   809: getstatic       dev/nuker/pyro/fc.0:I
        //   812: ifeq            821
        //   815: ldc_w           288321950
        //   818: goto            824
        //   821: ldc_w           401827797
        //   824: ldc_w           -1428778962
        //   827: ixor           
        //   828: lookupswitch {
        //          -1331867479: 821
        //          -1141251664: 4366
        //          default: 856
        //        }
        //   856: goto            860
        //   859: athrow         
        //   860: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   863: goto            867
        //   866: athrow         
        //   867: checkcast       Lnet/minecraft/item/ItemBlock;
        //   870: astore          4
        //   872: aload           4
        //   874: goto            878
        //   877: athrow         
        //   878: invokevirtual   net/minecraft/item/ItemBlock.func_179223_d:()Lnet/minecraft/block/Block;
        //   881: goto            885
        //   884: athrow         
        //   885: getstatic       net/minecraft/init/Blocks.field_150343_Z:Lnet/minecraft/block/Block;
        //   888: goto            892
        //   891: athrow         
        //   892: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   895: goto            899
        //   898: athrow         
        //   899: ifeq            908
        //   902: ldc_w           382395907
        //   905: goto            911
        //   908: ldc_w           382395906
        //   911: ldc_w           -618325259
        //   914: ixor           
        //   915: tableswitch {
        //          -1679820308: 936
        //          -1679820307: 999
        //          default: 902
        //        }
        //   936: aload_0        
        //   937: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //   940: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   943: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   946: getfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //   949: getstatic       dev/nuker/pyro/fc.1:I
        //   952: ifeq            961
        //   955: ldc_w           -2063737182
        //   958: goto            964
        //   961: ldc_w           1457562236
        //   964: ldc_w           -1177990086
        //   967: ixor           
        //   968: lookupswitch {
        //          -282464698: 996
        //          1026855576: 961
        //          default: 4340
        //        }
        //   996: istore_2       
        //   997: iconst_0       
        //   998: istore_3       
        //   999: iload_2        
        //  1000: iconst_m1      
        //  1001: if_icmpne       1437
        //  1004: iconst_0       
        //  1005: istore          4
        //  1007: iload           4
        //  1009: bipush          9
        //  1011: if_icmpge       1020
        //  1014: ldc_w           -1323801835
        //  1017: goto            1023
        //  1020: ldc_w           -1323801834
        //  1023: ldc_w           566790960
        //  1026: ixor           
        //  1027: tableswitch {
        //          564252746: 1048
        //          564252747: 1437
        //          default: 1014
        //        }
        //  1048: aload_0        
        //  1049: getstatic       dev/nuker/pyro/fc.0:I
        //  1052: ifeq            1061
        //  1055: ldc_w           -982025498
        //  1058: goto            1064
        //  1061: ldc_w           1478205693
        //  1064: ldc_w           -1596770826
        //  1067: ixor           
        //  1068: lookupswitch {
        //          -121072373: 1096
        //          1705266960: 1061
        //          default: 4376
        //        }
        //  1096: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  1099: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1102: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  1105: iload           4
        //  1107: goto            1111
        //  1110: athrow         
        //  1111: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70301_a:(I)Lnet/minecraft/item/ItemStack;
        //  1114: goto            1118
        //  1117: athrow         
        //  1118: getstatic       dev/nuker/pyro/fc.0:I
        //  1121: ifeq            1130
        //  1124: ldc_w           782720081
        //  1127: goto            1133
        //  1130: ldc_w           -595080477
        //  1133: ldc_w           -1002132889
        //  1136: ixor           
        //  1137: lookupswitch {
        //          -354159050: 4368
        //          1539036088: 1130
        //          default: 1164
        //        }
        //  1164: goto            1168
        //  1167: athrow         
        //  1168: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  1171: goto            1175
        //  1174: athrow         
        //  1175: instanceof      Lnet/minecraft/item/ItemBlock;
        //  1178: ifeq            1187
        //  1181: ldc_w           -781334531
        //  1184: goto            1190
        //  1187: ldc_w           -781334530
        //  1190: ldc_w           -638123048
        //  1193: ixor           
        //  1194: tableswitch {
        //          288720970: 1216
        //          288720971: 1431
        //          default: 1181
        //        }
        //  1216: aload_0        
        //  1217: getstatic       dev/nuker/pyro/fc.0:I
        //  1220: ifeq            1229
        //  1223: ldc_w           -18972639
        //  1226: goto            1232
        //  1229: ldc_w           -2135028701
        //  1232: ldc_w           -642570177
        //  1235: ixor           
        //  1236: lookupswitch {
        //          661497886: 4450
        //          1406939302: 1229
        //          default: 1264
        //        }
        //  1264: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  1267: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1270: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  1273: iload           4
        //  1275: goto            1279
        //  1278: athrow         
        //  1279: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70301_a:(I)Lnet/minecraft/item/ItemStack;
        //  1282: goto            1286
        //  1285: athrow         
        //  1286: getstatic       dev/nuker/pyro/fc.0:I
        //  1289: ifeq            1298
        //  1292: ldc_w           329271806
        //  1295: goto            1301
        //  1298: ldc_w           -506794451
        //  1301: ldc_w           -1047600229
        //  1304: ixor           
        //  1305: lookupswitch {
        //          -768693659: 4372
        //          1500918786: 1298
        //          default: 1332
        //        }
        //  1332: goto            1336
        //  1335: athrow         
        //  1336: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  1339: goto            1343
        //  1342: athrow         
        //  1343: checkcast       Lnet/minecraft/item/ItemBlock;
        //  1346: astore          5
        //  1348: aload           5
        //  1350: goto            1354
        //  1353: athrow         
        //  1354: invokevirtual   net/minecraft/item/ItemBlock.func_179223_d:()Lnet/minecraft/block/Block;
        //  1357: goto            1361
        //  1360: athrow         
        //  1361: getstatic       dev/nuker/pyro/fc.c:I
        //  1364: ifge            1373
        //  1367: ldc_w           -1302380341
        //  1370: goto            1376
        //  1373: ldc_w           -1884206915
        //  1376: ldc_w           -216256813
        //  1379: ixor           
        //  1380: lookupswitch {
        //          1094938136: 4394
        //          1940505568: 1373
        //          default: 1408
        //        }
        //  1408: getstatic       net/minecraft/init/Blocks.field_150343_Z:Lnet/minecraft/block/Block;
        //  1411: goto            1415
        //  1414: athrow         
        //  1415: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //  1418: goto            1422
        //  1421: athrow         
        //  1422: ifeq            1431
        //  1425: iload           4
        //  1427: istore_2       
        //  1428: goto            1437
        //  1431: iinc            4, 1
        //  1434: goto            1007
        //  1437: iload_2        
        //  1438: iconst_m1      
        //  1439: if_icmpne       1443
        //  1442: return         
        //  1443: aload_0        
        //  1444: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  1447: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1450: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  1453: getfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //  1456: istore          4
        //  1458: aload_0        
        //  1459: getstatic       dev/nuker/pyro/fc.1:I
        //  1462: ifeq            1471
        //  1465: ldc_w           399808536
        //  1468: goto            1474
        //  1471: ldc_w           199486925
        //  1474: ldc_w           56861809
        //  1477: ixor           
        //  1478: lookupswitch {
        //          142625212: 1504
        //          347552873: 1471
        //          default: 4436
        //        }
        //  1504: aload_0        
        //  1505: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  1508: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1511: goto            1515
        //  1514: athrow         
        //  1515: invokevirtual   dev/nuker/pyro/f5z.c:(Lnet/minecraft/entity/Entity;)[Lnet/minecraft/util/math/BlockPos;
        //  1518: goto            1522
        //  1521: athrow         
        //  1522: astore          5
        //  1524: new             Lnet/minecraft/util/math/BlockPos;
        //  1527: dup            
        //  1528: aload_0        
        //  1529: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  1532: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1535: getstatic       dev/nuker/pyro/fc.c:I
        //  1538: ifge            1547
        //  1541: ldc_w           562893227
        //  1544: goto            1550
        //  1547: ldc_w           1787681852
        //  1550: ldc_w           -1504424818
        //  1553: ixor           
        //  1554: lookupswitch {
        //          -2015797979: 1547
        //          -858156878: 1580
        //          default: 4426
        //        }
        //  1580: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  1583: goto            1587
        //  1586: athrow         
        //  1587: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //  1590: goto            1594
        //  1593: athrow         
        //  1594: aload_0        
        //  1595: getstatic       dev/nuker/pyro/fc.0:I
        //  1598: ifeq            1607
        //  1601: ldc_w           -1643894000
        //  1604: goto            1610
        //  1607: ldc_w           -1762260763
        //  1610: ldc_w           1064726635
        //  1613: ixor           
        //  1614: lookupswitch {
        //          -1586340997: 1607
        //          -1451198322: 1640
        //          default: 4378
        //        }
        //  1640: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  1643: getstatic       dev/nuker/pyro/fc.0:I
        //  1646: ifeq            1655
        //  1649: ldc_w           -133967848
        //  1652: goto            1658
        //  1655: ldc_w           575975140
        //  1658: ldc_w           -1331543112
        //  1661: ixor           
        //  1662: lookupswitch {
        //          -674894877: 1655
        //          1218548640: 4416
        //          default: 1688
        //        }
        //  1688: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1691: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  1694: goto            1698
        //  1697: athrow         
        //  1698: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //  1701: goto            1705
        //  1704: athrow         
        //  1705: aload_0        
        //  1706: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  1709: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1712: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  1715: goto            1719
        //  1718: athrow         
        //  1719: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //  1722: goto            1726
        //  1725: athrow         
        //  1726: goto            1730
        //  1729: athrow         
        //  1730: invokespecial   net/minecraft/util/math/BlockPos.<init>:(III)V
        //  1733: goto            1737
        //  1736: athrow         
        //  1737: goto            1741
        //  1740: athrow         
        //  1741: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //  1744: goto            1748
        //  1747: athrow         
        //  1748: goto            1752
        //  1751: athrow         
        //  1752: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //  1755: goto            1759
        //  1758: athrow         
        //  1759: astore          6
        //  1761: new             Lnet/minecraft/util/math/Vec3d;
        //  1764: dup            
        //  1765: getstatic       dev/nuker/pyro/fc.1:I
        //  1768: ifeq            1777
        //  1771: ldc_w           1989504403
        //  1774: goto            1780
        //  1777: ldc_w           307306876
        //  1780: ldc_w           -82067748
        //  1783: ixor           
        //  1784: lookupswitch {
        //          -1920019633: 4342
        //          766326203: 1777
        //          default: 1812
        //        }
        //  1812: aload_0        
        //  1813: getstatic       dev/nuker/pyro/fc.c:I
        //  1816: ifge            1825
        //  1819: ldc_w           1420708400
        //  1822: goto            1828
        //  1825: ldc_w           1803784176
        //  1828: ldc_w           -219241653
        //  1831: ixor           
        //  1832: lookupswitch {
        //          -1505695365: 4396
        //          1561964622: 1825
        //          default: 1860
        //        }
        //  1860: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  1863: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1866: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  1869: getstatic       dev/nuker/pyro/fc.0:I
        //  1872: ifeq            1881
        //  1875: ldc_w           -1264796933
        //  1878: goto            1884
        //  1881: ldc_w           826522203
        //  1884: ldc_w           721426258
        //  1887: ixor           
        //  1888: lookupswitch {
        //          -1617121879: 4352
        //          -1031765808: 1881
        //          default: 1916
        //        }
        //  1916: aload_0        
        //  1917: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  1920: getstatic       dev/nuker/pyro/fc.c:I
        //  1923: ifge            1932
        //  1926: ldc_w           1551111099
        //  1929: goto            1935
        //  1932: ldc_w           -792891453
        //  1935: ldc_w           -347028904
        //  1938: ixor           
        //  1939: lookupswitch {
        //          -1222323741: 1932
        //          1005432219: 1964
        //          default: 4360
        //        }
        //  1964: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1967: getstatic       dev/nuker/pyro/fc.0:I
        //  1970: ifeq            1979
        //  1973: ldc_w           236017293
        //  1976: goto            1982
        //  1979: ldc_w           -225439521
        //  1982: ldc_w           -335912605
        //  1985: ixor           
        //  1986: lookupswitch {
        //          -437569554: 1979
        //          426406332: 2012
        //          default: 4452
        //        }
        //  2012: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  2015: aload_0        
        //  2016: getstatic       dev/nuker/pyro/fc.1:I
        //  2019: ifeq            2028
        //  2022: ldc_w           1058141847
        //  2025: goto            2031
        //  2028: ldc_w           1128584474
        //  2031: ldc_w           1372392894
        //  2034: ixor           
        //  2035: lookupswitch {
        //          311023780: 2060
        //          1859975977: 2028
        //          default: 4410
        //        }
        //  2060: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  2063: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2066: goto            2070
        //  2069: athrow         
        //  2070: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70047_e:()F
        //  2073: goto            2077
        //  2076: athrow         
        //  2077: f2d            
        //  2078: dadd           
        //  2079: aload_0        
        //  2080: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  2083: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2086: getstatic       dev/nuker/pyro/fc.1:I
        //  2089: ifeq            2098
        //  2092: ldc_w           -590971499
        //  2095: goto            2101
        //  2098: ldc_w           -180346213
        //  2101: ldc_w           -707574464
        //  2104: ixor           
        //  2105: lookupswitch {
        //          152385749: 2098
        //          546531291: 2132
        //          default: 4384
        //        }
        //  2132: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  2135: goto            2139
        //  2138: athrow         
        //  2139: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //  2142: goto            2146
        //  2145: athrow         
        //  2146: astore          7
        //  2148: getstatic       dev/nuker/pyro/fc.1:I
        //  2151: ifeq            2160
        //  2154: ldc_w           38562497
        //  2157: goto            2163
        //  2160: ldc_w           -576415481
        //  2163: ldc_w           -304160143
        //  2166: ixor           
        //  2167: lookupswitch {
        //          -275609424: 2160
        //          813333366: 2192
        //          default: 4388
        //        }
        //  2192: aload           5
        //  2194: getstatic       dev/nuker/pyro/fc.1:I
        //  2197: ifeq            2206
        //  2200: ldc_w           -1453704631
        //  2203: goto            2209
        //  2206: ldc_w           1706714827
        //  2209: ldc_w           -98735543
        //  2212: ixor           
        //  2213: lookupswitch {
        //          -1616442238: 2240
        //          1397182464: 2206
        //          default: 4458
        //        }
        //  2240: astore          8
        //  2242: getstatic       dev/nuker/pyro/fc.c:I
        //  2245: ifge            2254
        //  2248: ldc_w           1105696583
        //  2251: goto            2257
        //  2254: ldc_w           1565081017
        //  2257: ldc_w           -179545755
        //  2260: ixor           
        //  2261: lookupswitch {
        //          -1476041508: 2288
        //          -1263808990: 2254
        //          default: 4380
        //        }
        //  2288: aload           8
        //  2290: arraylength    
        //  2291: istore          9
        //  2293: iconst_0       
        //  2294: istore          10
        //  2296: iload           10
        //  2298: iload           9
        //  2300: if_icmpge       4329
        //  2303: getstatic       dev/nuker/pyro/fc.0:I
        //  2306: ifeq            2315
        //  2309: ldc_w           -2071625186
        //  2312: goto            2318
        //  2315: ldc_w           1053633973
        //  2318: ldc_w           -446856125
        //  2321: ixor           
        //  2322: lookupswitch {
        //          1641547357: 4334
        //          1846584186: 2315
        //          default: 2348
        //        }
        //  2348: aload           8
        //  2350: iload           10
        //  2352: aaload         
        //  2353: getstatic       dev/nuker/pyro/fc.0:I
        //  2356: ifeq            2365
        //  2359: ldc_w           885827321
        //  2362: goto            2368
        //  2365: ldc_w           965223591
        //  2368: ldc_w           1737707251
        //  2371: ixor           
        //  2372: lookupswitch {
        //          493907471: 2365
        //          1398794250: 4338
        //          default: 2400
        //        }
        //  2400: astore          11
        //  2402: aload           11
        //  2404: getstatic       dev/nuker/pyro/fc.0:I
        //  2407: ifeq            2416
        //  2410: ldc_w           1812371551
        //  2413: goto            2419
        //  2416: ldc_w           1871513925
        //  2419: ldc_w           -880161740
        //  2422: ixor           
        //  2423: lookupswitch {
        //          -1903051439: 2416
        //          -1483778965: 4428
        //          default: 2448
        //        }
        //  2448: goto            2452
        //  2451: athrow         
        //  2452: invokestatic    dev/nuker/pyro/fbA.4:(Lnet/minecraft/util/math/BlockPos;)Z
        //  2455: goto            2459
        //  2458: athrow         
        //  2459: ifeq            4323
        //  2462: aload_0        
        //  2463: getstatic       dev/nuker/pyro/fc.0:I
        //  2466: ifeq            2475
        //  2469: ldc_w           -1260152093
        //  2472: goto            2478
        //  2475: ldc_w           1162707571
        //  2478: ldc_w           -1406574222
        //  2481: ixor           
        //  2482: lookupswitch {
        //          -379264255: 2508
        //          415955857: 2475
        //          default: 4330
        //        }
        //  2508: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  2511: getstatic       dev/nuker/pyro/fc.c:I
        //  2514: ifge            2523
        //  2517: ldc_w           423629358
        //  2520: goto            2526
        //  2523: ldc_w           -2062682770
        //  2526: ldc_w           -1548703341
        //  2529: ixor           
        //  2530: lookupswitch {
        //          -1158628419: 2523
        //          649944317: 2556
        //          default: 4424
        //        }
        //  2556: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  2559: new             Lnet/minecraft/util/math/AxisAlignedBB;
        //  2562: dup            
        //  2563: aload           11
        //  2565: goto            2569
        //  2568: athrow         
        //  2569: invokespecial   net/minecraft/util/math/AxisAlignedBB.<init>:(Lnet/minecraft/util/math/BlockPos;)V
        //  2572: goto            2576
        //  2575: athrow         
        //  2576: getstatic       dev/nuker/pyro/fc.c:I
        //  2579: ifge            2588
        //  2582: ldc_w           1060818889
        //  2585: goto            2591
        //  2588: ldc_w           739038169
        //  2591: ldc_w           -1345176583
        //  2594: ixor           
        //  2595: lookupswitch {
        //          -2082543584: 2620
        //          -1863781328: 2588
        //          default: 4414
        //        }
        //  2620: goto            2624
        //  2623: athrow         
        //  2624: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_72855_b:(Lnet/minecraft/util/math/AxisAlignedBB;)Z
        //  2627: goto            2631
        //  2630: athrow         
        //  2631: ifeq            4323
        //  2634: getstatic       dev/nuker/pyro/fc.1:I
        //  2637: ifeq            2646
        //  2640: ldc_w           -742630408
        //  2643: goto            2649
        //  2646: ldc_w           -1214560350
        //  2649: ldc_w           601830569
        //  2652: ixor           
        //  2653: lookupswitch {
        //          -1234584631: 2646
        //          -261918895: 4444
        //          default: 2680
        //        }
        //  2680: aload_0        
        //  2681: aload           11
        //  2683: putfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/util/math/BlockPos;
        //  2686: getstatic       dev/nuker/pyro/fc.1:I
        //  2689: ifeq            2698
        //  2692: ldc_w           -878543191
        //  2695: goto            2701
        //  2698: ldc_w           -1175393166
        //  2701: ldc_w           -1777187389
        //  2704: ixor           
        //  2705: lookupswitch {
        //          803383729: 2732
        //          1571830634: 2698
        //          default: 4454
        //        }
        //  2732: goto            2736
        //  2735: athrow         
        //  2736: invokestatic    net/minecraft/util/EnumFacing.values:()[Lnet/minecraft/util/EnumFacing;
        //  2739: goto            2743
        //  2742: athrow         
        //  2743: getstatic       dev/nuker/pyro/fc.1:I
        //  2746: ifeq            2755
        //  2749: ldc_w           -2004884582
        //  2752: goto            2758
        //  2755: ldc_w           -1048258279
        //  2758: ldc_w           -98072059
        //  2761: ixor           
        //  2762: lookupswitch {
        //          787385674: 2755
        //          1918396831: 4398
        //          default: 2788
        //        }
        //  2788: astore          12
        //  2790: aload           12
        //  2792: arraylength    
        //  2793: istore          13
        //  2795: iconst_0       
        //  2796: istore          14
        //  2798: iload           14
        //  2800: getstatic       dev/nuker/pyro/fc.1:I
        //  2803: ifeq            2812
        //  2806: ldc_w           -277087032
        //  2809: goto            2815
        //  2812: ldc_w           1671331151
        //  2815: ldc_w           -504838015
        //  2818: ixor           
        //  2819: lookupswitch {
        //          244528201: 4362
        //          1572928108: 2812
        //          default: 2844
        //        }
        //  2844: iload           13
        //  2846: if_icmpge       4323
        //  2849: aload           12
        //  2851: iload           14
        //  2853: aaload         
        //  2854: getstatic       dev/nuker/pyro/fc.c:I
        //  2857: ifge            2866
        //  2860: ldc_w           1092269007
        //  2863: goto            2869
        //  2866: ldc_w           -80409841
        //  2869: ldc_w           -1114324191
        //  2872: ixor           
        //  2873: lookupswitch {
        //          -57773842: 2866
        //          1185007662: 2900
        //          default: 4344
        //        }
        //  2900: astore          15
        //  2902: aload           11
        //  2904: aload           15
        //  2906: goto            2910
        //  2909: athrow         
        //  2910: invokevirtual   net/minecraft/util/math/BlockPos.func_177972_a:(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;
        //  2913: goto            2917
        //  2916: athrow         
        //  2917: astore          16
        //  2919: aload           15
        //  2921: getstatic       dev/nuker/pyro/fc.1:I
        //  2924: ifeq            2933
        //  2927: ldc_w           326689870
        //  2930: goto            2936
        //  2933: ldc_w           -2040647756
        //  2936: ldc_w           -2099711228
        //  2939: ixor           
        //  2940: lookupswitch {
        //          -1851779254: 2933
        //          75947184: 2968
        //          default: 4386
        //        }
        //  2968: goto            2972
        //  2971: athrow         
        //  2972: invokevirtual   net/minecraft/util/EnumFacing.func_176734_d:()Lnet/minecraft/util/EnumFacing;
        //  2975: goto            2979
        //  2978: athrow         
        //  2979: astore          17
        //  2981: aload_0        
        //  2982: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  2985: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  2988: aload           16
        //  2990: goto            2994
        //  2993: athrow         
        //  2994: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  2997: goto            3001
        //  3000: athrow         
        //  3001: goto            3005
        //  3004: athrow         
        //  3005: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //  3010: goto            3014
        //  3013: athrow         
        //  3014: aload_0        
        //  3015: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  3018: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  3021: getstatic       dev/nuker/pyro/fc.c:I
        //  3024: ifge            3033
        //  3027: ldc_w           -1767732454
        //  3030: goto            3036
        //  3033: ldc_w           669639642
        //  3036: ldc_w           -596738675
        //  3039: ixor           
        //  3040: lookupswitch {
        //          -74998185: 3068
        //          1254946455: 3033
        //          default: 4364
        //        }
        //  3068: aload           16
        //  3070: goto            3074
        //  3073: athrow         
        //  3074: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  3077: goto            3081
        //  3080: athrow         
        //  3081: iconst_0       
        //  3082: getstatic       dev/nuker/pyro/fc.c:I
        //  3085: ifge            3094
        //  3088: ldc_w           -467877684
        //  3091: goto            3097
        //  3094: ldc_w           674038086
        //  3097: ldc_w           -1723080976
        //  3100: ixor           
        //  3101: lookupswitch {
        //          -904296598: 3094
        //          2102861372: 4412
        //          default: 3128
        //        }
        //  3128: goto            3132
        //  3131: athrow         
        //  3132: invokevirtual   net/minecraft/block/Block.func_176209_a:(Lnet/minecraft/block/state/IBlockState;Z)Z
        //  3135: goto            3139
        //  3138: athrow         
        //  3139: ifeq            4317
        //  3142: new             Lnet/minecraft/util/math/Vec3d;
        //  3145: dup            
        //  3146: getstatic       dev/nuker/pyro/fc.1:I
        //  3149: ifeq            3158
        //  3152: ldc_w           -931308862
        //  3155: goto            3161
        //  3158: ldc_w           1536504872
        //  3161: ldc_w           772535845
        //  3164: ixor           
        //  3165: lookupswitch {
        //          -428430105: 4434
        //          1829232302: 3158
        //          default: 3192
        //        }
        //  3192: aload           16
        //  3194: goto            3198
        //  3197: athrow         
        //  3198: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //  3201: goto            3205
        //  3204: athrow         
        //  3205: ldc2_w          0.5
        //  3208: ldc2_w          0.5
        //  3211: ldc2_w          0.5
        //  3214: goto            3218
        //  3217: athrow         
        //  3218: invokevirtual   net/minecraft/util/math/Vec3d.func_72441_c:(DDD)Lnet/minecraft/util/math/Vec3d;
        //  3221: goto            3225
        //  3224: athrow         
        //  3225: new             Lnet/minecraft/util/math/Vec3d;
        //  3228: dup            
        //  3229: getstatic       dev/nuker/pyro/fc.c:I
        //  3232: ifge            3241
        //  3235: ldc_w           708626603
        //  3238: goto            3244
        //  3241: ldc_w           -959240774
        //  3244: ldc_w           2006935438
        //  3247: ixor           
        //  3248: lookupswitch {
        //          -1320402380: 3276
        //          1571008293: 3241
        //          default: 4422
        //        }
        //  3276: aload           17
        //  3278: getstatic       dev/nuker/pyro/fc.c:I
        //  3281: ifge            3290
        //  3284: ldc_w           -1372026947
        //  3287: goto            3293
        //  3290: ldc_w           -1116021286
        //  3293: ldc_w           -608106330
        //  3296: ixor           
        //  3297: lookupswitch {
        //          -1099872474: 3290
        //          1979289371: 4420
        //          default: 3324
        //        }
        //  3324: goto            3328
        //  3327: athrow         
        //  3328: invokevirtual   net/minecraft/util/EnumFacing.func_176730_m:()Lnet/minecraft/util/math/Vec3i;
        //  3331: goto            3335
        //  3334: athrow         
        //  3335: goto            3339
        //  3338: athrow         
        //  3339: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //  3342: goto            3346
        //  3345: athrow         
        //  3346: ldc2_w          0.5
        //  3349: goto            3353
        //  3352: athrow         
        //  3353: invokevirtual   net/minecraft/util/math/Vec3d.func_186678_a:(D)Lnet/minecraft/util/math/Vec3d;
        //  3356: goto            3360
        //  3359: athrow         
        //  3360: goto            3364
        //  3363: athrow         
        //  3364: invokevirtual   net/minecraft/util/math/Vec3d.func_178787_e:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        //  3367: goto            3371
        //  3370: athrow         
        //  3371: getstatic       dev/nuker/pyro/fc.0:I
        //  3374: ifeq            3383
        //  3377: ldc_w           -1083353114
        //  3380: goto            3386
        //  3383: ldc_w           1126011521
        //  3386: ldc_w           1819348863
        //  3389: ixor           
        //  3390: lookupswitch {
        //          -753117031: 3383
        //          795647486: 3416
        //          default: 4402
        //        }
        //  3416: astore          18
        //  3418: aload           7
        //  3420: getstatic       dev/nuker/pyro/fc.1:I
        //  3423: ifeq            3432
        //  3426: ldc_w           -1709721640
        //  3429: goto            3435
        //  3432: ldc_w           -1769095223
        //  3435: ldc_w           449693489
        //  3438: ixor           
        //  3439: lookupswitch {
        //          -2133167895: 3432
        //          -1941931784: 3464
        //          default: 4400
        //        }
        //  3464: aload           18
        //  3466: goto            3470
        //  3469: athrow         
        //  3470: invokevirtual   net/minecraft/util/math/Vec3d.func_72438_d:(Lnet/minecraft/util/math/Vec3d;)D
        //  3473: goto            3477
        //  3476: athrow         
        //  3477: ldc2_w          6.0
        //  3480: dcmpg          
        //  3481: ifgt            4317
        //  3484: aload_0        
        //  3485: getstatic       dev/nuker/pyro/fc.1:I
        //  3488: ifeq            3497
        //  3491: ldc_w           -235701062
        //  3494: goto            3500
        //  3497: ldc_w           380537827
        //  3500: ldc_w           857425132
        //  3503: ixor           
        //  3504: lookupswitch {
        //          -1024968618: 4404
        //          -925106786: 3497
        //          default: 3532
        //        }
        //  3532: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  3535: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  3538: aload           16
        //  3540: goto            3544
        //  3543: athrow         
        //  3544: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  3547: goto            3551
        //  3550: athrow         
        //  3551: goto            3555
        //  3554: athrow         
        //  3555: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //  3560: goto            3564
        //  3563: athrow         
        //  3564: astore          19
        //  3566: getstatic       dev/nuker/pyro/fc.1:I
        //  3569: ifeq            3578
        //  3572: ldc_w           424324109
        //  3575: goto            3581
        //  3578: ldc_w           -433866339
        //  3581: ldc_w           -529686930
        //  3584: ixor           
        //  3585: lookupswitch {
        //          -1221094180: 3578
        //          -114871709: 4432
        //          default: 3612
        //        }
        //  3612: aload           19
        //  3614: aload_0        
        //  3615: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  3618: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  3621: aload           11
        //  3623: aload_0        
        //  3624: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  3627: getstatic       dev/nuker/pyro/fc.1:I
        //  3630: ifeq            3639
        //  3633: ldc_w           -140017629
        //  3636: goto            3642
        //  3639: ldc_w           1289480685
        //  3642: ldc_w           -1311270078
        //  3645: ixor           
        //  3646: lookupswitch {
        //          -49515857: 3672
        //          1181752161: 3639
        //          default: 4336
        //        }
        //  3672: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  3675: getstatic       dev/nuker/pyro/fc.0:I
        //  3678: ifeq            3687
        //  3681: ldc_w           1064928107
        //  3684: goto            3690
        //  3687: ldc_w           -69531582
        //  3690: ldc_w           -1644521355
        //  3693: ixor           
        //  3694: lookupswitch {
        //          -1568466146: 4374
        //          -581252685: 3687
        //          default: 3720
        //        }
        //  3720: aload           11
        //  3722: goto            3726
        //  3725: athrow         
        //  3726: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  3729: goto            3733
        //  3732: athrow         
        //  3733: aload_0        
        //  3734: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  3737: getstatic       dev/nuker/pyro/fc.0:I
        //  3740: ifeq            3749
        //  3743: ldc_w           783336610
        //  3746: goto            3752
        //  3749: ldc_w           -1202509488
        //  3752: ldc_w           -1900532206
        //  3755: ixor           
        //  3756: lookupswitch {
        //          -1610028368: 3749
        //          921372482: 3784
        //          default: 4418
        //        }
        //  3784: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3787: getstatic       dev/nuker/pyro/fc.1:I
        //  3790: ifeq            3799
        //  3793: ldc_w           778623254
        //  3796: goto            3802
        //  3799: ldc_w           4639251
        //  3802: ldc_w           -817019132
        //  3805: ixor           
        //  3806: lookupswitch {
        //          -821326569: 3832
        //          -517628398: 3799
        //          default: 4354
        //        }
        //  3832: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //  3835: aload           15
        //  3837: fconst_0       
        //  3838: fconst_0       
        //  3839: fconst_0       
        //  3840: goto            3844
        //  3843: athrow         
        //  3844: invokevirtual   net/minecraft/block/Block.func_180639_a:(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Z
        //  3847: goto            3851
        //  3850: athrow         
        //  3851: istore          20
        //  3853: aload_0        
        //  3854: aload           7
        //  3856: aload           18
        //  3858: goto            3862
        //  3861: athrow         
        //  3862: invokevirtual   dev/nuker/pyro/f5z.c:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)[F
        //  3865: goto            3869
        //  3868: athrow         
        //  3869: astore          21
        //  3871: aload_1        
        //  3872: getstatic       dev/nuker/pyro/fc.0:I
        //  3875: ifeq            3884
        //  3878: ldc_w           714197449
        //  3881: goto            3887
        //  3884: ldc_w           1708752567
        //  3887: ldc_w           711168662
        //  3890: ixor           
        //  3891: lookupswitch {
        //          15883103: 3884
        //          1337650209: 3916
        //          default: 4406
        //        }
        //  3916: goto            3920
        //  3919: athrow         
        //  3920: invokevirtual   dev/nuker/pyro/f3i.c:()V
        //  3923: goto            3927
        //  3926: athrow         
        //  3927: aload_1        
        //  3928: aload           21
        //  3930: iconst_0       
        //  3931: faload         
        //  3932: goto            3936
        //  3935: athrow         
        //  3936: invokevirtual   dev/nuker/pyro/f3i.c:(F)V
        //  3939: goto            3943
        //  3942: athrow         
        //  3943: getstatic       dev/nuker/pyro/fc.0:I
        //  3946: ifeq            3955
        //  3949: ldc_w           -1675468961
        //  3952: goto            3958
        //  3955: ldc_w           487391903
        //  3958: ldc_w           -337566339
        //  3961: ixor           
        //  3962: lookupswitch {
        //          -152295454: 3988
        //          2009299490: 3955
        //          default: 4430
        //        }
        //  3988: aload_1        
        //  3989: aload           21
        //  3991: iconst_1       
        //  3992: faload         
        //  3993: goto            3997
        //  3996: athrow         
        //  3997: invokevirtual   dev/nuker/pyro/f3i.0:(F)V
        //  4000: goto            4004
        //  4003: athrow         
        //  4004: getstatic       dev/nuker/pyro/fc.0:I
        //  4007: ifeq            4016
        //  4010: ldc_w           1576553542
        //  4013: goto            4019
        //  4016: ldc_w           -939397603
        //  4019: ldc_w           -1340533603
        //  4022: ixor           
        //  4023: lookupswitch {
        //          -303998757: 4016
        //          2014902912: 4048
        //          default: 4332
        //        }
        //  4048: iload_2        
        //  4049: istore          22
        //  4051: iload_3        
        //  4052: getstatic       dev/nuker/pyro/fc.0:I
        //  4055: ifeq            4064
        //  4058: ldc_w           1236335176
        //  4061: goto            4067
        //  4064: ldc_w           1792247614
        //  4067: ldc_w           -1851080120
        //  4070: ixor           
        //  4071: lookupswitch {
        //          -669370368: 4408
        //          1990722006: 4064
        //          default: 4096
        //        }
        //  4096: istore          23
        //  4098: aload_1        
        //  4099: aload_0        
        //  4100: aload           19
        //  4102: getstatic       dev/nuker/pyro/fc.1:I
        //  4105: ifeq            4114
        //  4108: ldc_w           1781259251
        //  4111: goto            4117
        //  4114: ldc_w           149342642
        //  4117: ldc_w           -633418417
        //  4120: ixor           
        //  4121: lookupswitch {
        //          -1340795204: 4114
        //          -757594883: 4148
        //          default: 4446
        //        }
        //  4148: iload           20
        //  4150: getstatic       dev/nuker/pyro/fc.1:I
        //  4153: ifeq            4162
        //  4156: ldc_w           -273031363
        //  4159: goto            4165
        //  4162: ldc_w           1015198340
        //  4165: ldc_w           1408469534
        //  4168: ixor           
        //  4169: lookupswitch {
        //          -1135979229: 4346
        //          1696234874: 4162
        //          default: 4196
        //        }
        //  4196: iload           23
        //  4198: getstatic       dev/nuker/pyro/fc.c:I
        //  4201: ifge            4210
        //  4204: ldc_w           2038036077
        //  4207: goto            4213
        //  4210: ldc_w           -232024796
        //  4213: ldc_w           -627509927
        //  4216: ixor           
        //  4217: lookupswitch {
        //          -1545534668: 4210
        //          682844285: 4244
        //          default: 4358
        //        }
        //  4244: iload           22
        //  4246: aload           16
        //  4248: getstatic       dev/nuker/pyro/fc.c:I
        //  4251: ifge            4260
        //  4254: ldc_w           -2115030693
        //  4257: goto            4263
        //  4260: ldc_w           -175515774
        //  4263: ldc_w           -1420589356
        //  4266: ixor           
        //  4267: lookupswitch {
        //          392726496: 4260
        //          717010831: 4456
        //          default: 4292
        //        }
        //  4292: aload           17
        //  4294: aload           18
        //  4296: iload           4
        //  4298: invokedynamic   BootstrapMethod #0, accept:(Ldev/nuker/pyro/f5z;Lnet/minecraft/block/Block;ZZILnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/Vec3d;I)Ljava/util/function/Consumer;
        //  4303: goto            4307
        //  4306: athrow         
        //  4307: invokevirtual   dev/nuker/pyro/f3i.c:(Ljava/util/function/Consumer;)V
        //  4310: goto            4314
        //  4313: athrow         
        //  4314: goto            4323
        //  4317: iinc            14, 1
        //  4320: goto            2798
        //  4323: iinc            10, 1
        //  4326: goto            2296
        //  4329: return         
        //  4330: aconst_null    
        //  4331: athrow         
        //  4332: aconst_null    
        //  4333: athrow         
        //  4334: aconst_null    
        //  4335: athrow         
        //  4336: aconst_null    
        //  4337: athrow         
        //  4338: aconst_null    
        //  4339: athrow         
        //  4340: aconst_null    
        //  4341: athrow         
        //  4342: aconst_null    
        //  4343: athrow         
        //  4344: aconst_null    
        //  4345: athrow         
        //  4346: aconst_null    
        //  4347: athrow         
        //  4348: aconst_null    
        //  4349: athrow         
        //  4350: aconst_null    
        //  4351: athrow         
        //  4352: aconst_null    
        //  4353: athrow         
        //  4354: aconst_null    
        //  4355: athrow         
        //  4356: aconst_null    
        //  4357: athrow         
        //  4358: aconst_null    
        //  4359: athrow         
        //  4360: aconst_null    
        //  4361: athrow         
        //  4362: aconst_null    
        //  4363: athrow         
        //  4364: aconst_null    
        //  4365: athrow         
        //  4366: aconst_null    
        //  4367: athrow         
        //  4368: aconst_null    
        //  4369: athrow         
        //  4370: aconst_null    
        //  4371: athrow         
        //  4372: aconst_null    
        //  4373: athrow         
        //  4374: aconst_null    
        //  4375: athrow         
        //  4376: aconst_null    
        //  4377: athrow         
        //  4378: aconst_null    
        //  4379: athrow         
        //  4380: aconst_null    
        //  4381: athrow         
        //  4382: aconst_null    
        //  4383: athrow         
        //  4384: aconst_null    
        //  4385: athrow         
        //  4386: aconst_null    
        //  4387: athrow         
        //  4388: aconst_null    
        //  4389: athrow         
        //  4390: aconst_null    
        //  4391: athrow         
        //  4392: aconst_null    
        //  4393: athrow         
        //  4394: aconst_null    
        //  4395: athrow         
        //  4396: aconst_null    
        //  4397: athrow         
        //  4398: aconst_null    
        //  4399: athrow         
        //  4400: aconst_null    
        //  4401: athrow         
        //  4402: aconst_null    
        //  4403: athrow         
        //  4404: aconst_null    
        //  4405: athrow         
        //  4406: aconst_null    
        //  4407: athrow         
        //  4408: aconst_null    
        //  4409: athrow         
        //  4410: aconst_null    
        //  4411: athrow         
        //  4412: aconst_null    
        //  4413: athrow         
        //  4414: aconst_null    
        //  4415: athrow         
        //  4416: aconst_null    
        //  4417: athrow         
        //  4418: aconst_null    
        //  4419: athrow         
        //  4420: aconst_null    
        //  4421: athrow         
        //  4422: aconst_null    
        //  4423: athrow         
        //  4424: aconst_null    
        //  4425: athrow         
        //  4426: aconst_null    
        //  4427: athrow         
        //  4428: aconst_null    
        //  4429: athrow         
        //  4430: aconst_null    
        //  4431: athrow         
        //  4432: aconst_null    
        //  4433: athrow         
        //  4434: aconst_null    
        //  4435: athrow         
        //  4436: aconst_null    
        //  4437: athrow         
        //  4438: aconst_null    
        //  4439: athrow         
        //  4440: aconst_null    
        //  4441: athrow         
        //  4442: aconst_null    
        //  4443: athrow         
        //  4444: aconst_null    
        //  4445: athrow         
        //  4446: aconst_null    
        //  4447: athrow         
        //  4448: aconst_null    
        //  4449: athrow         
        //  4450: aconst_null    
        //  4451: athrow         
        //  4452: aconst_null    
        //  4453: athrow         
        //  4454: aconst_null    
        //  4455: athrow         
        //  4456: aconst_null    
        //  4457: athrow         
        //  4458: aconst_null    
        //  4459: athrow         
        //  4460: aconst_null    
        //  4461: athrow         
        //  4462: pop            
        //  4463: goto            24
        //  4466: pop            
        //  4467: aconst_null    
        //  4468: goto            4462
        //  4471: dup            
        //  4472: ifnull          4462
        //  4475: checkcast       Ljava/lang/Throwable;
        //  4478: athrow         
        //  4479: dup            
        //  4480: ifnull          4466
        //  4483: checkcast       Ljava/lang/Throwable;
        //  4486: athrow         
        //  4487: aconst_null    
        //  4488: athrow         
        //    StackMapTable: 02 17 43 07 00 24 04 FF 00 0B 00 00 00 01 07 00 24 FD 00 03 07 00 03 07 00 B8 43 07 00 24 40 07 00 B8 45 07 00 24 40 07 00 C0 4A 07 00 C0 FF 00 01 00 02 07 00 03 07 00 B8 00 02 07 00 C0 01 5E 07 00 C0 10 41 01 1C 43 07 00 24 40 07 00 B8 45 07 00 24 40 01 02 00 0A 41 01 1E 46 07 00 17 40 07 00 D0 45 07 00 24 40 07 01 2C 45 07 00 1B 40 07 00 D6 45 07 00 24 40 01 0D 41 01 1E FF 00 14 00 02 07 00 03 07 00 B8 00 02 07 00 E6 07 00 57 FF 00 01 00 02 07 00 03 07 00 B8 00 03 07 00 E6 07 00 57 01 FF 00 1C 00 02 07 00 03 07 00 B8 00 02 07 00 E6 07 00 57 42 07 00 17 FF 00 00 00 02 07 00 03 07 00 B8 00 02 07 00 E6 07 00 57 45 07 00 24 40 01 03 0A 41 01 1B 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 B8 00 02 07 00 03 01 5D 07 00 03 45 07 00 72 40 07 00 D0 45 07 00 24 40 07 01 2C 4D 07 00 D6 FF 00 01 00 02 07 00 03 07 00 B8 00 02 07 00 D6 01 5D 07 00 D6 42 07 00 24 40 07 00 D6 45 07 00 24 40 01 0D 41 01 1C 4A 07 00 24 FF 00 00 00 02 07 00 03 07 00 B8 00 02 07 00 03 07 00 57 45 07 00 24 40 01 4A 07 00 24 FF 00 00 00 02 07 00 03 07 00 B8 00 02 07 01 02 01 45 07 00 24 FF 00 00 00 02 07 00 03 07 00 B8 00 02 07 01 02 07 00 D6 FF 00 02 00 00 00 01 07 00 24 FF 00 00 00 02 07 00 03 07 00 B8 00 02 07 01 02 07 00 D6 45 07 00 24 00 00 FF 00 0E 00 03 07 00 03 07 00 B8 01 00 01 01 FF 00 02 00 03 07 00 03 07 00 B8 01 00 02 01 01 5F 01 FF 00 0A 00 04 07 00 03 07 00 B8 01 01 00 01 07 00 24 40 07 00 57 45 07 00 24 40 07 01 11 4B 07 01 11 FF 00 02 00 04 07 00 03 07 00 B8 01 01 00 02 07 01 11 01 5D 07 01 11 42 07 00 17 40 07 01 11 45 07 00 24 40 01 4C 07 00 24 40 07 00 57 45 07 00 24 40 07 01 11 FF 00 02 00 00 00 01 07 00 24 FF 00 00 00 04 07 00 03 07 00 B8 01 01 00 01 07 01 11 45 07 00 24 40 07 02 6B 52 07 00 03 FF 00 02 00 04 07 00 03 07 00 B8 01 01 00 02 07 00 03 01 5E 07 00 03 FF 00 08 00 00 00 01 07 00 24 FF 00 00 00 04 07 00 03 07 00 B8 01 01 00 01 07 00 57 45 07 00 24 40 07 01 11 4B 07 01 11 FF 00 02 00 04 07 00 03 07 00 B8 01 01 00 02 07 01 11 01 5F 07 01 11 42 07 00 24 40 07 01 11 45 07 00 24 40 07 02 6B FF 00 09 00 00 00 01 07 00 24 FF 00 00 00 05 07 00 03 07 00 B8 01 01 07 01 1A 00 01 07 01 1A 45 07 00 24 40 07 01 E8 45 07 00 11 FF 00 00 00 05 07 00 03 07 00 B8 01 01 07 01 1A 00 02 07 01 E8 07 01 E8 45 07 00 24 40 01 02 05 42 01 18 58 01 FF 00 02 00 05 07 00 03 07 00 B8 01 01 07 01 1A 00 02 01 01 5F 01 FA 00 02 FC 00 07 01 06 05 42 01 18 4C 07 00 03 FF 00 02 00 05 07 00 03 07 00 B8 01 01 01 00 02 07 00 03 01 5F 07 00 03 FF 00 0D 00 00 00 01 07 00 24 FF 00 00 00 05 07 00 03 07 00 B8 01 01 01 00 02 07 01 39 01 45 07 00 24 40 07 01 11 4B 07 01 11 FF 00 02 00 05 07 00 03 07 00 B8 01 01 01 00 02 07 01 11 01 5E 07 01 11 42 07 00 24 40 07 01 11 45 07 00 24 40 07 02 6B 05 05 42 01 19 4C 07 00 03 FF 00 02 00 05 07 00 03 07 00 B8 01 01 01 00 02 07 00 03 01 5F 07 00 03 FF 00 0D 00 00 00 01 07 00 24 FF 00 00 00 05 07 00 03 07 00 B8 01 01 01 00 02 07 01 39 01 45 07 00 24 40 07 01 11 4B 07 01 11 FF 00 02 00 05 07 00 03 07 00 B8 01 01 01 00 02 07 01 11 01 5E 07 01 11 FF 00 02 00 00 00 01 07 00 24 FF 00 00 00 05 07 00 03 07 00 B8 01 01 01 00 01 07 01 11 45 07 00 24 40 07 02 6B FF 00 09 00 06 07 00 03 07 00 B8 01 01 01 07 01 1A 00 01 07 00 24 40 07 01 1A 45 07 00 24 40 07 01 E8 4B 07 01 E8 FF 00 02 00 06 07 00 03 07 00 B8 01 01 01 07 01 1A 00 02 07 01 E8 01 5F 07 01 E8 FF 00 05 00 00 00 01 07 00 24 FF 00 00 00 06 07 00 03 07 00 B8 01 01 01 07 01 1A 00 02 07 01 E8 07 01 E8 45 07 00 24 40 01 FA 00 08 FA 00 05 05 FF 00 1B 00 05 07 00 03 07 00 B8 01 01 01 00 01 07 00 03 FF 00 02 00 05 07 00 03 07 00 B8 01 01 01 00 02 07 00 03 01 5D 07 00 03 49 07 00 24 FF 00 00 00 05 07 00 03 07 00 B8 01 01 01 00 02 07 00 03 07 00 57 45 07 00 24 40 07 00 9C FF 00 18 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 03 08 05 F4 08 05 F4 07 00 57 FF 00 02 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 04 08 05 F4 08 05 F4 07 00 57 01 FF 00 1D 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 03 08 05 F4 08 05 F4 07 00 57 45 07 00 24 FF 00 00 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 03 08 05 F4 08 05 F4 03 45 07 00 24 FF 00 00 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 03 08 05 F4 08 05 F4 01 FF 00 0C 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 04 08 05 F4 08 05 F4 01 07 00 03 FF 00 02 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 05 08 05 F4 08 05 F4 01 07 00 03 01 FF 00 1D 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 04 08 05 F4 08 05 F4 01 07 00 03 FF 00 0E 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 04 08 05 F4 08 05 F4 01 07 00 51 FF 00 02 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 05 08 05 F4 08 05 F4 01 07 00 51 01 FF 00 1D 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 04 08 05 F4 08 05 F4 01 07 00 51 48 07 00 24 FF 00 00 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 04 08 05 F4 08 05 F4 01 03 45 07 00 24 FF 00 00 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 04 08 05 F4 08 05 F4 01 01 4C 07 00 17 FF 00 00 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 05 08 05 F4 08 05 F4 01 01 03 45 07 00 24 FF 00 00 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 05 08 05 F4 08 05 F4 01 01 01 FF 00 02 00 00 00 01 07 00 24 FF 00 00 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 05 08 05 F4 08 05 F4 01 01 01 45 07 00 24 40 07 00 7A 42 07 00 13 40 07 00 7A 45 07 00 24 40 07 00 7A 42 07 00 24 40 07 00 7A 45 07 00 24 40 07 00 7A FF 00 11 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 02 08 06 E1 08 06 E1 FF 00 02 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 03 08 06 E1 08 06 E1 01 FF 00 1F 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 02 08 06 E1 08 06 E1 FF 00 0C 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 03 08 06 E1 08 06 E1 07 00 03 FF 00 02 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 04 08 06 E1 08 06 E1 07 00 03 01 FF 00 1F 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 03 08 06 E1 08 06 E1 07 00 03 FF 00 14 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 03 08 06 E1 08 06 E1 03 FF 00 02 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 04 08 06 E1 08 06 E1 03 01 FF 00 1F 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 03 08 06 E1 08 06 E1 03 FF 00 0F 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 04 08 06 E1 08 06 E1 03 07 00 51 FF 00 02 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 05 08 06 E1 08 06 E1 03 07 00 51 01 FF 00 1C 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 04 08 06 E1 08 06 E1 03 07 00 51 FF 00 0E 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 04 08 06 E1 08 06 E1 03 07 00 57 FF 00 02 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 05 08 06 E1 08 06 E1 03 07 00 57 01 FF 00 1D 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 04 08 06 E1 08 06 E1 03 07 00 57 FF 00 0F 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 05 08 06 E1 08 06 E1 03 03 07 00 03 FF 00 02 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 06 08 06 E1 08 06 E1 03 03 07 00 03 01 FF 00 1C 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 05 08 06 E1 08 06 E1 03 03 07 00 03 48 07 00 24 FF 00 00 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 05 08 06 E1 08 06 E1 03 03 07 00 57 45 07 00 24 FF 00 00 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 05 08 06 E1 08 06 E1 03 03 02 FF 00 14 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 05 08 06 E1 08 06 E1 03 03 07 00 57 FF 00 02 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 06 08 06 E1 08 06 E1 03 03 07 00 57 01 FF 00 1E 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 05 08 06 E1 08 06 E1 03 03 07 00 57 45 07 00 24 FF 00 00 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 05 08 06 E1 08 06 E1 03 03 03 45 07 00 24 40 07 00 26 FC 00 0D 07 00 26 42 01 1C 4D 07 00 9C FF 00 02 00 08 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 00 02 07 00 9C 01 5E 07 00 9C FC 00 0D 07 00 9C 42 01 1E FD 00 07 01 01 12 42 01 1D 50 07 00 7A FF 00 02 00 0B 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 00 02 07 00 7A 01 5F 07 00 7A FF 00 0F 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 01 07 00 7A FF 00 02 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 02 07 00 7A 01 5C 07 00 7A 42 07 00 17 40 07 00 7A 45 07 00 24 40 01 4F 07 00 03 FF 00 02 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 02 07 00 03 01 5D 07 00 03 4E 07 00 51 FF 00 02 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 02 07 00 51 01 5D 07 00 51 4B 07 00 24 FF 00 00 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 04 07 01 B1 08 09 FF 08 09 FF 07 00 7A 45 07 00 24 FF 00 00 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 02 07 01 B1 07 01 A9 FF 00 0B 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 02 07 01 B1 07 01 A9 FF 00 02 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 03 07 01 B1 07 01 A9 01 FF 00 1C 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 02 07 01 B1 07 01 A9 FF 00 02 00 00 00 01 07 00 24 FF 00 00 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 02 07 01 B1 07 01 A9 45 07 00 24 40 01 0E 42 01 1E 11 42 01 1E FF 00 02 00 00 00 01 07 00 24 FF 00 00 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 00 45 07 00 24 40 07 02 6D 4B 07 02 6D FF 00 02 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 02 07 02 6D 01 5D 07 02 6D FE 00 09 07 02 6D 01 01 4D 01 FF 00 02 00 0F 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 00 02 01 01 5C 01 55 07 01 BF FF 00 02 00 0F 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 00 02 07 01 BF 01 5E 07 01 BF FF 00 08 00 10 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 00 01 07 00 17 FF 00 00 00 10 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 00 02 07 00 7A 07 01 BF 45 07 00 24 40 07 00 7A FF 00 0F 00 11 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 00 01 07 01 BF FF 00 02 00 11 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 00 02 07 01 BF 01 5F 07 01 BF 42 07 00 17 40 07 01 BF 45 07 00 24 40 07 01 BF FF 00 0D 00 00 00 01 07 00 24 FF 00 00 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 02 07 01 B1 07 00 7A 45 07 00 24 40 07 01 DD FF 00 02 00 00 00 01 07 00 24 FF 00 00 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 01 07 01 DD 47 07 00 24 40 07 01 E8 FF 00 12 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 02 07 01 E8 07 01 B1 FF 00 02 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 03 07 01 E8 07 01 B1 01 FF 00 1F 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 02 07 01 E8 07 01 B1 44 07 00 24 FF 00 00 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 03 07 01 E8 07 01 B1 07 00 7A 45 07 00 24 FF 00 00 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 02 07 01 E8 07 01 DD FF 00 0C 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 03 07 01 E8 07 01 DD 01 FF 00 02 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 04 07 01 E8 07 01 DD 01 01 FF 00 1E 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 03 07 01 E8 07 01 DD 01 42 07 00 1B FF 00 00 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 03 07 01 E8 07 01 DD 01 45 07 00 24 40 01 FF 00 12 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 02 08 0C 46 08 0C 46 FF 00 02 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 03 08 0C 46 08 0C 46 01 FF 00 1E 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 02 08 0C 46 08 0C 46 44 07 00 13 FF 00 00 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 03 08 0C 46 08 0C 46 07 00 7A 45 07 00 24 40 07 00 26 4B 07 00 15 FF 00 00 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 04 07 00 26 03 03 03 45 07 00 24 40 07 00 26 FF 00 0F 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 03 07 00 26 08 0C 99 08 0C 99 FF 00 02 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 04 07 00 26 08 0C 99 08 0C 99 01 FF 00 1F 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 03 07 00 26 08 0C 99 08 0C 99 FF 00 0D 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 04 07 00 26 08 0C 99 08 0C 99 07 01 BF FF 00 02 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 05 07 00 26 08 0C 99 08 0C 99 07 01 BF 01 FF 00 1E 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 04 07 00 26 08 0C 99 08 0C 99 07 01 BF FF 00 02 00 00 00 01 07 00 24 FF 00 00 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 04 07 00 26 08 0C 99 08 0C 99 07 01 BF 45 07 00 24 FF 00 00 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 04 07 00 26 08 0C 99 08 0C 99 07 02 6F 42 07 00 0D FF 00 00 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 04 07 00 26 08 0C 99 08 0C 99 07 02 6F 45 07 00 24 FF 00 00 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 02 07 00 26 07 00 26 45 07 00 1D FF 00 00 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 03 07 00 26 07 00 26 03 45 07 00 24 FF 00 00 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 02 07 00 26 07 00 26 FF 00 02 00 00 00 01 07 00 24 FF 00 00 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 02 07 00 26 07 00 26 45 07 00 24 40 07 00 26 4B 07 00 26 FF 00 02 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 02 07 00 26 01 5D 07 00 26 FF 00 0F 00 13 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 00 01 07 00 26 FF 00 02 00 13 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 00 02 07 00 26 01 5C 07 00 26 44 07 00 24 FF 00 00 00 13 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 00 02 07 00 26 07 00 26 45 07 00 24 40 03 53 07 00 03 FF 00 02 00 13 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 00 02 07 00 03 01 5F 07 00 03 4A 07 00 24 FF 00 00 00 13 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 00 02 07 01 B1 07 00 7A 45 07 00 24 40 07 01 DD 42 07 00 24 40 07 01 DD 47 07 00 24 40 07 01 E8 FC 00 0D 07 01 E8 42 01 1E FF 00 1A 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 04 07 01 E8 07 01 B1 07 00 7A 07 00 51 FF 00 02 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 05 07 01 E8 07 01 B1 07 00 7A 07 00 51 01 FF 00 1D 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 04 07 01 E8 07 01 B1 07 00 7A 07 00 51 FF 00 0E 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 04 07 01 E8 07 01 B1 07 00 7A 07 01 B1 FF 00 02 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 05 07 01 E8 07 01 B1 07 00 7A 07 01 B1 01 FF 00 1D 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 04 07 01 E8 07 01 B1 07 00 7A 07 01 B1 FF 00 04 00 00 00 01 07 00 24 FF 00 00 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 05 07 01 E8 07 01 B1 07 00 7A 07 01 B1 07 00 7A 45 07 00 24 FF 00 00 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 04 07 01 E8 07 01 B1 07 00 7A 07 01 DD FF 00 0F 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 05 07 01 E8 07 01 B1 07 00 7A 07 01 DD 07 00 51 FF 00 02 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 06 07 01 E8 07 01 B1 07 00 7A 07 01 DD 07 00 51 01 FF 00 1F 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 05 07 01 E8 07 01 B1 07 00 7A 07 01 DD 07 00 51 FF 00 0E 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 05 07 01 E8 07 01 B1 07 00 7A 07 01 DD 07 00 57 FF 00 02 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 06 07 01 E8 07 01 B1 07 00 7A 07 01 DD 07 00 57 01 FF 00 1D 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 05 07 01 E8 07 01 B1 07 00 7A 07 01 DD 07 00 57 FF 00 0A 00 00 00 01 07 00 24 FF 00 00 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 0A 07 01 E8 07 01 B1 07 00 7A 07 01 DD 07 00 57 07 02 2A 07 01 BF 02 02 02 45 07 00 24 40 01 FF 00 09 00 15 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 00 01 07 00 24 FF 00 00 00 15 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 00 03 07 00 03 07 00 26 07 00 26 45 07 00 24 40 07 00 6F FF 00 0E 00 16 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 00 01 07 00 B8 FF 00 02 00 16 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 00 02 07 00 B8 01 5C 07 00 B8 42 07 00 24 40 07 00 B8 45 07 00 24 00 47 07 00 15 FF 00 00 00 16 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 00 02 07 00 B8 02 45 07 00 24 00 0B 42 01 1D 47 07 00 17 FF 00 00 00 16 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 00 02 07 00 B8 02 45 07 00 24 00 0B 42 01 1C FF 00 0F 00 17 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 00 01 01 FF 00 02 00 17 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 00 02 01 01 5C 01 FF 00 11 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 03 07 00 B8 07 00 03 07 01 E8 FF 00 02 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 04 07 00 B8 07 00 03 07 01 E8 01 FF 00 1E 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 03 07 00 B8 07 00 03 07 01 E8 FF 00 0D 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 04 07 00 B8 07 00 03 07 01 E8 01 FF 00 02 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 05 07 00 B8 07 00 03 07 01 E8 01 01 FF 00 1E 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 04 07 00 B8 07 00 03 07 01 E8 01 FF 00 0D 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 05 07 00 B8 07 00 03 07 01 E8 01 01 FF 00 02 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 06 07 00 B8 07 00 03 07 01 E8 01 01 01 FF 00 1E 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 05 07 00 B8 07 00 03 07 01 E8 01 01 FF 00 0F 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 07 07 00 B8 07 00 03 07 01 E8 01 01 01 07 00 7A FF 00 02 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 08 07 00 B8 07 00 03 07 01 E8 01 01 01 07 00 7A 01 FF 00 1C 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 07 07 00 B8 07 00 03 07 01 E8 01 01 01 07 00 7A 4D 07 00 72 FF 00 00 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 02 07 00 B8 07 02 71 45 07 00 24 00 FF 00 02 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 00 FF 00 05 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 00 FA 00 05 FF 00 00 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 01 07 00 03 FF 00 01 00 16 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 00 00 FF 00 01 00 0B 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 00 00 FF 00 01 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 04 07 01 E8 07 01 B1 07 00 7A 07 00 51 FF 00 01 00 0B 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 00 01 07 00 7A FF 00 01 00 05 07 00 03 07 00 B8 01 01 07 01 1A 00 01 01 FF 00 01 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 02 08 06 E1 08 06 E1 FF 00 01 00 0F 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 00 01 07 01 BF FF 00 01 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 04 07 00 B8 07 00 03 07 01 E8 01 FF 00 01 00 02 07 00 03 07 00 B8 00 02 07 00 E6 07 00 57 41 07 00 03 FF 00 01 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 03 08 06 E1 08 06 E1 03 FF 00 01 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 05 07 01 E8 07 01 B1 07 00 7A 07 01 DD 07 00 57 FF 00 01 00 04 07 00 03 07 00 B8 01 01 00 01 07 00 03 FF 00 01 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 05 07 00 B8 07 00 03 07 01 E8 01 01 FF 00 01 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 04 08 06 E1 08 06 E1 03 07 00 51 FF 00 01 00 0F 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 00 01 01 FF 00 01 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 02 07 01 E8 07 01 B1 FF 00 01 00 04 07 00 03 07 00 B8 01 01 00 01 07 01 11 FF 00 01 00 05 07 00 03 07 00 B8 01 01 01 00 01 07 01 11 F8 00 01 FF 00 01 00 05 07 00 03 07 00 B8 01 01 01 00 01 07 01 11 FF 00 01 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 04 07 01 E8 07 01 B1 07 00 7A 07 01 B1 FF 00 01 00 05 07 00 03 07 00 B8 01 01 01 00 01 07 00 03 FF 00 01 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 04 08 05 F4 08 05 F4 01 07 00 03 FE 00 01 07 00 7A 07 00 26 07 00 9C FF 00 01 00 04 07 00 03 07 00 B8 01 01 00 01 07 01 11 FF 00 01 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 05 08 06 E1 08 06 E1 03 03 07 00 57 FF 00 01 00 11 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 00 01 07 01 BF FF 00 01 00 08 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 00 00 FF 00 01 00 02 07 00 03 07 00 B8 00 00 01 FF 00 01 00 06 07 00 03 07 00 B8 01 01 01 07 01 1A 00 01 07 01 E8 FF 00 01 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 03 08 06 E1 08 06 E1 07 00 03 FF 00 01 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 01 07 02 6D FF 00 01 00 13 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 00 01 07 00 26 FF 00 01 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 01 07 00 26 FF 00 01 00 13 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 00 01 07 00 03 FF 00 01 00 16 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 00 01 07 00 B8 FF 00 01 00 17 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 00 01 01 FF 00 01 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 05 08 06 E1 08 06 E1 03 03 07 00 03 FF 00 01 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 03 07 01 E8 07 01 DD 01 FF 00 01 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 02 07 01 B1 07 01 A9 FF 00 01 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 04 08 05 F4 08 05 F4 01 07 00 51 FF 00 01 00 14 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 00 05 07 01 E8 07 01 B1 07 00 7A 07 01 DD 07 00 51 FF 00 01 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 04 07 00 26 08 0C 99 08 0C 99 07 01 BF FF 00 01 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 03 07 00 26 08 0C 99 08 0C 99 FF 00 01 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 01 07 00 51 FF 00 01 00 06 07 00 03 07 00 B8 01 01 01 07 00 9C 00 03 08 05 F4 08 05 F4 07 00 57 FF 00 01 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 01 07 00 7A FF 00 01 00 16 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 00 00 F9 00 01 FF 00 01 00 12 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 00 02 08 0C 46 08 0C 46 FF 00 01 00 05 07 00 03 07 00 B8 01 01 01 00 01 07 00 03 F8 00 01 01 FF 00 01 00 03 07 00 03 07 00 B8 01 00 01 01 FF 00 01 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 00 FF 00 01 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 03 07 00 B8 07 00 03 07 01 E8 FF 00 01 00 02 07 00 03 07 00 B8 00 01 07 00 C0 FF 00 01 00 05 07 00 03 07 00 B8 01 01 01 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 00 04 08 06 E1 08 06 E1 03 07 00 57 FF 00 01 00 0C 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 00 00 FF 00 01 00 18 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 07 00 9C 01 01 07 00 7A 07 02 6D 01 01 07 01 BF 07 00 7A 07 01 BF 07 00 26 07 01 E8 01 07 00 6F 01 01 00 07 07 00 B8 07 00 03 07 01 E8 01 01 01 07 00 7A FF 00 01 00 08 07 00 03 07 00 B8 01 01 01 07 00 9C 07 00 7A 07 00 26 00 01 07 00 9C FF 00 01 00 02 07 00 03 07 00 B8 00 01 07 00 D6 41 07 00 24 43 05 44 07 00 24 47 05 47 07 00 24
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     4471   4479   Any
        //  4471   4479   4471   4479   Ljava/lang/EnumConstantNotPresentException;
        //  4487   4489   3      8      Ljava/lang/IllegalArgumentException;
        //  28     35     35     36     Any
        //  28     35     3      8      Any
        //  29     35     35     36     Ljava/lang/EnumConstantNotPresentException;
        //  28     35     28     29     Ljava/lang/RuntimeException;
        //  29     35     28     29     Any
        //  132    139    139    140    Any
        //  132    139    3      8      Ljava/util/NoSuchElementException;
        //  133    139    3      8      Any
        //  132    139    132    133    Any
        //  133    139    132    133    Ljava/lang/IndexOutOfBoundsException;
        //  195    202    202    203    Any
        //  195    202    195    196    Ljava/lang/EnumConstantNotPresentException;
        //  196    202    202    203    Any
        //  196    202    202    203    Any
        //  195    202    195    196    Ljava/lang/StringIndexOutOfBoundsException;
        //  209    216    216    217    Any
        //  210    216    3      8      Ljava/lang/AssertionError;
        //  209    216    3      8      Ljava/lang/AssertionError;
        //  209    216    216    217    Any
        //  210    216    209    210    Ljava/lang/ArithmeticException;
        //  319    326    326    327    Any
        //  320    326    319    320    Ljava/lang/ArithmeticException;
        //  319    326    326    327    Ljava/util/NoSuchElementException;
        //  319    326    319    320    Ljava/lang/NegativeArraySizeException;
        //  319    326    319    320    Ljava/lang/IndexOutOfBoundsException;
        //  422    429    429    430    Any
        //  423    429    429    430    Any
        //  422    429    429    430    Any
        //  423    429    422    423    Ljava/util/NoSuchElementException;
        //  422    429    429    430    Ljava/lang/IndexOutOfBoundsException;
        //  479    486    486    487    Any
        //  479    486    3      8      Any
        //  479    486    3      8      Ljava/lang/ClassCastException;
        //  479    486    479    480    Any
        //  480    486    3      8      Any
        //  543    550    550    551    Any
        //  544    550    3      8      Any
        //  543    550    543    544    Any
        //  543    550    550    551    Ljava/lang/IndexOutOfBoundsException;
        //  544    550    543    544    Any
        //  562    569    569    570    Any
        //  562    569    562    563    Ljava/lang/AssertionError;
        //  563    569    562    563    Ljava/lang/NumberFormatException;
        //  562    569    562    563    Ljava/lang/UnsupportedOperationException;
        //  563    569    562    563    Any
        //  574    580    580    581    Any
        //  574    580    3      8      Any
        //  574    580    580    581    Ljava/lang/EnumConstantNotPresentException;
        //  574    580    580    581    Ljava/lang/IllegalArgumentException;
        //  574    580    3      8      Ljava/lang/IllegalArgumentException;
        //  643    650    650    651    Any
        //  643    650    3      8      Ljava/util/ConcurrentModificationException;
        //  643    650    643    644    Any
        //  643    650    3      8      Ljava/lang/IllegalArgumentException;
        //  643    650    3      8      Any
        //  699    706    706    707    Any
        //  700    706    699    700    Ljava/lang/NegativeArraySizeException;
        //  699    706    699    700    Ljava/lang/IllegalArgumentException;
        //  699    706    699    700    Ljava/lang/ArithmeticException;
        //  700    706    3      8      Any
        //  720    727    727    728    Any
        //  720    727    720    721    Any
        //  721    727    727    728    Ljava/lang/UnsupportedOperationException;
        //  721    727    720    721    Any
        //  721    727    727    728    Ljava/lang/NumberFormatException;
        //  732    738    738    739    Any
        //  732    738    738    739    Ljava/lang/ClassCastException;
        //  732    738    3      8      Ljava/lang/IllegalStateException;
        //  732    738    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  732    738    3      8      Ljava/lang/NumberFormatException;
        //  802    808    808    809    Any
        //  802    808    3      8      Any
        //  802    808    808    809    Ljava/util/ConcurrentModificationException;
        //  802    808    3      8      Any
        //  802    808    808    809    Ljava/lang/NullPointerException;
        //  859    866    866    867    Any
        //  860    866    859    860    Any
        //  860    866    866    867    Ljava/lang/EnumConstantNotPresentException;
        //  860    866    859    860    Ljava/lang/ArithmeticException;
        //  859    866    866    867    Ljava/lang/NullPointerException;
        //  878    884    884    885    Any
        //  878    884    884    885    Any
        //  878    884    884    885    Any
        //  878    884    884    885    Ljava/lang/ClassCastException;
        //  878    884    884    885    Ljava/util/NoSuchElementException;
        //  891    898    898    899    Any
        //  891    898    3      8      Any
        //  891    898    3      8      Any
        //  892    898    891    892    Ljava/util/ConcurrentModificationException;
        //  892    898    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1111   1117   1117   1118   Any
        //  1111   1117   1117   1118   Ljava/lang/EnumConstantNotPresentException;
        //  1111   1117   1117   1118   Any
        //  1111   1117   1117   1118   Ljava/lang/AssertionError;
        //  1111   1117   1117   1118   Any
        //  1167   1174   1174   1175   Any
        //  1168   1174   3      8      Any
        //  1168   1174   1167   1168   Ljava/lang/IllegalArgumentException;
        //  1167   1174   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1167   1174   1167   1168   Any
        //  1279   1285   1285   1286   Any
        //  1279   1285   1285   1286   Any
        //  1279   1285   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1279   1285   3      8      Any
        //  1279   1285   3      8      Any
        //  1336   1342   1342   1343   Any
        //  1336   1342   1342   1343   Ljava/lang/EnumConstantNotPresentException;
        //  1336   1342   1342   1343   Ljava/util/ConcurrentModificationException;
        //  1336   1342   1342   1343   Any
        //  1336   1342   3      8      Any
        //  1353   1360   1360   1361   Any
        //  1353   1360   1353   1354   Any
        //  1354   1360   1353   1354   Ljava/lang/IllegalArgumentException;
        //  1354   1360   3      8      Any
        //  1354   1360   1360   1361   Ljava/lang/StringIndexOutOfBoundsException;
        //  1415   1421   1421   1422   Any
        //  1415   1421   1421   1422   Any
        //  1415   1421   1421   1422   Any
        //  1415   1421   1421   1422   Any
        //  1415   1421   3      8      Any
        //  1514   1521   1521   1522   Any
        //  1515   1521   1521   1522   Ljava/util/NoSuchElementException;
        //  1515   1521   3      8      Any
        //  1514   1521   1514   1515   Any
        //  1515   1521   1521   1522   Ljava/lang/IndexOutOfBoundsException;
        //  1586   1593   1593   1594   Any
        //  1587   1593   1593   1594   Any
        //  1586   1593   1586   1587   Any
        //  1586   1593   1586   1587   Any
        //  1587   1593   1593   1594   Ljava/lang/IllegalStateException;
        //  1697   1704   1704   1705   Any
        //  1698   1704   1697   1698   Any
        //  1698   1704   1697   1698   Any
        //  1697   1704   1704   1705   Any
        //  1697   1704   3      8      Ljava/util/ConcurrentModificationException;
        //  1718   1725   1725   1726   Any
        //  1719   1725   1718   1719   Ljava/lang/ArithmeticException;
        //  1718   1725   1718   1719   Ljava/util/ConcurrentModificationException;
        //  1718   1725   1725   1726   Any
        //  1718   1725   1718   1719   Ljava/lang/StringIndexOutOfBoundsException;
        //  1730   1736   1736   1737   Any
        //  1730   1736   3      8      Any
        //  1730   1736   3      8      Ljava/lang/IllegalArgumentException;
        //  1730   1736   1736   1737   Any
        //  1730   1736   3      8      Ljava/lang/IllegalArgumentException;
        //  1740   1747   1747   1748   Any
        //  1740   1747   1747   1748   Ljava/lang/IllegalStateException;
        //  1740   1747   3      8      Any
        //  1740   1747   1747   1748   Ljava/lang/NullPointerException;
        //  1740   1747   1740   1741   Ljava/lang/UnsupportedOperationException;
        //  1751   1758   1758   1759   Any
        //  1751   1758   3      8      Any
        //  1752   1758   3      8      Ljava/lang/RuntimeException;
        //  1752   1758   1751   1752   Any
        //  1752   1758   1751   1752   Ljava/lang/EnumConstantNotPresentException;
        //  2069   2076   2076   2077   Any
        //  2070   2076   2076   2077   Any
        //  2070   2076   3      8      Ljava/lang/ClassCastException;
        //  2070   2076   2069   2070   Any
        //  2069   2076   2069   2070   Ljava/lang/NullPointerException;
        //  2138   2145   2145   2146   Any
        //  2138   2145   3      8      Any
        //  2138   2145   2145   2146   Ljava/lang/NegativeArraySizeException;
        //  2139   2145   2145   2146   Any
        //  2139   2145   2138   2139   Any
        //  2451   2458   2458   2459   Any
        //  2451   2458   2451   2452   Ljava/lang/IllegalStateException;
        //  2451   2458   2458   2459   Ljava/lang/StringIndexOutOfBoundsException;
        //  2452   2458   2451   2452   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2451   2458   3      8      Any
        //  2568   2575   2575   2576   Any
        //  2569   2575   2568   2569   Any
        //  2568   2575   2575   2576   Any
        //  2569   2575   3      8      Ljava/lang/NumberFormatException;
        //  2569   2575   2575   2576   Ljava/lang/ArithmeticException;
        //  2624   2630   2630   2631   Any
        //  2624   2630   2630   2631   Any
        //  2624   2630   2630   2631   Ljava/lang/ClassCastException;
        //  2624   2630   3      8      Any
        //  2624   2630   2630   2631   Ljava/lang/UnsupportedOperationException;
        //  2736   2742   2742   2743   Any
        //  2736   2742   3      8      Any
        //  2736   2742   2742   2743   Any
        //  2736   2742   2742   2743   Any
        //  2736   2742   3      8      Any
        //  2909   2916   2916   2917   Any
        //  2910   2916   2909   2910   Ljava/lang/IllegalStateException;
        //  2909   2916   2909   2910   Ljava/lang/StringIndexOutOfBoundsException;
        //  2910   2916   3      8      Any
        //  2910   2916   2916   2917   Ljava/lang/StringIndexOutOfBoundsException;
        //  2971   2978   2978   2979   Any
        //  2972   2978   2971   2972   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2972   2978   2971   2972   Ljava/lang/ClassCastException;
        //  2971   2978   2971   2972   Ljava/util/ConcurrentModificationException;
        //  2971   2978   3      8      Any
        //  2994   3000   3000   3001   Any
        //  2994   3000   3000   3001   Any
        //  2994   3000   3      8      Any
        //  2994   3000   3      8      Ljava/lang/RuntimeException;
        //  2994   3000   3      8      Any
        //  3005   3013   3013   3014   Any
        //  3005   3013   3013   3014   Ljava/lang/IndexOutOfBoundsException;
        //  3005   3013   3013   3014   Any
        //  3005   3013   3      8      Ljava/lang/RuntimeException;
        //  3005   3013   3      8      Ljava/lang/ArithmeticException;
        //  3073   3080   3080   3081   Any
        //  3073   3080   3073   3074   Ljava/lang/ArithmeticException;
        //  3073   3080   3073   3074   Ljava/lang/StringIndexOutOfBoundsException;
        //  3074   3080   3080   3081   Any
        //  3074   3080   3073   3074   Any
        //  3131   3138   3138   3139   Any
        //  3131   3138   3138   3139   Any
        //  3131   3138   3138   3139   Any
        //  3132   3138   3      8      Any
        //  3132   3138   3131   3132   Ljava/lang/ArithmeticException;
        //  3197   3204   3204   3205   Any
        //  3198   3204   3204   3205   Ljava/lang/IllegalStateException;
        //  3198   3204   3204   3205   Any
        //  3197   3204   3197   3198   Ljava/lang/UnsupportedOperationException;
        //  3198   3204   3      8      Ljava/lang/ClassCastException;
        //  3217   3224   3224   3225   Any
        //  3217   3224   3224   3225   Any
        //  3217   3224   3      8      Any
        //  3218   3224   3      8      Any
        //  3217   3224   3217   3218   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3328   3334   3334   3335   Any
        //  3328   3334   3334   3335   Ljava/lang/StringIndexOutOfBoundsException;
        //  3328   3334   3334   3335   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3328   3334   3334   3335   Any
        //  3328   3334   3      8      Any
        //  3338   3345   3345   3346   Any
        //  3338   3345   3345   3346   Ljava/lang/AssertionError;
        //  3339   3345   3345   3346   Ljava/util/ConcurrentModificationException;
        //  3338   3345   3338   3339   Ljava/lang/IllegalStateException;
        //  3338   3345   3      8      Ljava/lang/NumberFormatException;
        //  3352   3359   3359   3360   Any
        //  3353   3359   3      8      Any
        //  3352   3359   3352   3353   Ljava/lang/IllegalArgumentException;
        //  3352   3359   3359   3360   Any
        //  3353   3359   3      8      Any
        //  3364   3370   3370   3371   Any
        //  3364   3370   3      8      Ljava/lang/NumberFormatException;
        //  3364   3370   3      8      Ljava/lang/NullPointerException;
        //  3364   3370   3      8      Any
        //  3364   3370   3      8      Ljava/lang/NullPointerException;
        //  3469   3476   3476   3477   Any
        //  3470   3476   3      8      Any
        //  3470   3476   3476   3477   Ljava/lang/IllegalArgumentException;
        //  3469   3476   3476   3477   Ljava/lang/IndexOutOfBoundsException;
        //  3470   3476   3469   3470   Any
        //  3543   3550   3550   3551   Any
        //  3543   3550   3550   3551   Ljava/lang/IndexOutOfBoundsException;
        //  3544   3550   3550   3551   Any
        //  3543   3550   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  3543   3550   3543   3544   Any
        //  3554   3563   3563   3564   Any
        //  3554   3563   3554   3555   Any
        //  3554   3563   3554   3555   Ljava/lang/IllegalStateException;
        //  3554   3563   3554   3555   Any
        //  3555   3563   3563   3564   Any
        //  3726   3732   3732   3733   Any
        //  3726   3732   3      8      Ljava/lang/ArithmeticException;
        //  3726   3732   3      8      Any
        //  3726   3732   3732   3733   Ljava/lang/NumberFormatException;
        //  3726   3732   3      8      Any
        //  3844   3850   3850   3851   Any
        //  3844   3850   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  3844   3850   3850   3851   Any
        //  3844   3850   3      8      Ljava/lang/NegativeArraySizeException;
        //  3844   3850   3      8      Ljava/lang/IllegalArgumentException;
        //  3861   3868   3868   3869   Any
        //  3862   3868   3868   3869   Any
        //  3861   3868   3868   3869   Ljava/util/ConcurrentModificationException;
        //  3862   3868   3861   3862   Any
        //  3862   3868   3868   3869   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3919   3926   3926   3927   Any
        //  3919   3926   3919   3920   Ljava/util/ConcurrentModificationException;
        //  3920   3926   3926   3927   Any
        //  3919   3926   3      8      Any
        //  3919   3926   3919   3920   Any
        //  3935   3942   3942   3943   Any
        //  3935   3942   3      8      Ljava/lang/ArithmeticException;
        //  3936   3942   3935   3936   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3935   3942   3      8      Any
        //  3935   3942   3      8      Ljava/lang/RuntimeException;
        //  3996   4003   4003   4004   Any
        //  3997   4003   3996   3997   Ljava/lang/ClassCastException;
        //  3997   4003   3996   3997   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3997   4003   4003   4004   Any
        //  3997   4003   3      8      Any
        //  4306   4313   4313   4314   Any
        //  4306   4313   3      8      Any
        //  4306   4313   4306   4307   Ljava/util/NoSuchElementException;
        //  4307   4313   4313   4314   Any
        //  4306   4313   3      8      Ljava/lang/IllegalArgumentException;
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
    
    public f5z() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u23d4\u1496\u8ada\ub3df\uc998\uedd3\ub225\ue6eb"
        //     4: invokestatic    invokestatic   !!! ERROR
        //     7: ldc_w           "\u23f4\u1496\u8ada\ub3df\uc9b8\uedd3\ub225\ue6eb"
        //    10: invokestatic    invokestatic   !!! ERROR
        //    13: ldc_w           "\u23e6\u1486\u8ac2\ub3d6\uc981\uedc0\ub230\ue6f2\ud96b\ue9fe\ua70d\u1e40\ue1c6\uc5e7\u816c\u8948\u57a5\u772e\ubd2e\uc003\u2b2c\uc234\u6a23\u2d16\ud794\u35ac\u7d6b\u898c\u801e\u8ccd\u8495\ufb72\u70e1\u9a19\u1bc6\uf145\u493c\u8849\uca89\uff28\ub6f0\u41e7\ub9c7\ub34d\u4c28\u8a92\u7c79\uce12\u7d4f\uea94\ue6fa\u16ca\uee7e\u37ce\u46e6\ue1da\u0a19\u86ad\u19c1\u0f4d\u773d\u7288\uc7c5\ubbfa\u9a9b\u6a3c"
        //    16: invokestatic    invokestatic   !!! ERROR
        //    19: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    22: getstatic       dev/nuker/pyro/fc.0:I
        //    25: ifeq            34
        //    28: ldc_w           -1584555790
        //    31: goto            37
        //    34: ldc_w           1093182916
        //    37: ldc_w           -1731638072
        //    40: ixor           
        //    41: lookupswitch {
        //          -639506164: 68
        //          960812090: 34
        //          default: 379
        //        }
        //    68: aload_0        
        //    69: new             Ldev/nuker/pyro/f0a;
        //    72: dup            
        //    73: ldc_w           "\u23ce\u149d\u8afe\ub3d6\uc980\uedc4\ub20b\ue6f5\ud964\ue9e6"
        //    76: invokestatic    invokestatic   !!! ERROR
        //    79: ldc_w           "\u23ee\u149d\u8afe\ub3d6\uc980\uedc4\ub20b\ue6f5\ud964\ue9e6"
        //    82: invokestatic    invokestatic   !!! ERROR
        //    85: aconst_null    
        //    86: iconst_0       
        //    87: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //    90: getstatic       dev/nuker/pyro/fc.0:I
        //    93: ifeq            102
        //    96: ldc_w           -530317263
        //    99: goto            105
        //   102: ldc_w           -1079822943
        //   105: ldc_w           -1985397837
        //   108: ixor           
        //   109: lookupswitch {
        //          397528927: 102
        //          1775057794: 385
        //          default: 136
        //        }
        //   136: putfield        dev/nuker/pyro/f5z.c:Ldev/nuker/pyro/f0a;
        //   139: aload_0        
        //   140: new             Ldev/nuker/pyro/f0a;
        //   143: dup            
        //   144: ldc_w           "\u23d3\u149c\u8ad1\ub3de\uc980\uedc4\ub20b\ue6f5\ud95c\ue9ed\ua700\u1e5c"
        //   147: invokestatic    invokestatic   !!! ERROR
        //   150: ldc_w           "\u23f3\u149c\u8ad1\ub3de\uc980\uedc4\ub20b\ue6f5\ud95c\ue9ed\ua700\u1e5c"
        //   153: invokestatic    invokestatic   !!! ERROR
        //   156: aconst_null    
        //   157: iconst_0       
        //   158: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   161: putfield        dev/nuker/pyro/f5z.0:Ldev/nuker/pyro/f0a;
        //   164: aload_0        
        //   165: new             Ldev/nuker/pyro/f0b;
        //   168: dup            
        //   169: ldc_w           "\u23c5\u149f\u8ad9\ub3da\uc987\uede2\ub22b\ue6f7\ud967\ue9ed"
        //   172: invokestatic    invokestatic   !!! ERROR
        //   175: ldc_w           "\u23e5\u149f\u8ad9\ub3da\uc987\ued81\ub207\ue6f4\ud964\ue9f0\ua713"
        //   178: invokestatic    invokestatic   !!! ERROR
        //   181: aconst_null    
        //   182: new             Ldev/nuker/pyro/fS;
        //   185: dup            
        //   186: ldc_w           0.5
        //   189: fconst_1       
        //   190: ldc_w           0.5
        //   193: ldc_w           0.33
        //   196: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   199: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   202: putfield        dev/nuker/pyro/f5z.c:Ldev/nuker/pyro/f0b;
        //   205: getstatic       dev/nuker/pyro/fc.1:I
        //   208: ifeq            217
        //   211: ldc_w           -505604782
        //   214: goto            220
        //   217: ldc_w           -620095189
        //   220: ldc_w           1681028813
        //   223: ixor           
        //   224: lookupswitch {
        //          -2047908961: 381
        //          -838496456: 217
        //          default: 252
        //        }
        //   252: aload_0        
        //   253: aconst_null    
        //   254: putfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/util/math/BlockPos;
        //   257: getstatic       dev/nuker/pyro/fc.0:I
        //   260: ifeq            269
        //   263: ldc_w           1417682033
        //   266: goto            272
        //   269: ldc_w           1344329026
        //   272: ldc_w           -1830014065
        //   275: ixor           
        //   276: lookupswitch {
        //          -965988354: 383
        //          1399263629: 269
        //          default: 304
        //        }
        //   304: aload_0        
        //   305: aload_0        
        //   306: getfield        dev/nuker/pyro/f5z.c:Ldev/nuker/pyro/f0a;
        //   309: invokevirtual   dev/nuker/pyro/f5z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   312: pop            
        //   313: getstatic       dev/nuker/pyro/fc.1:I
        //   316: ifeq            325
        //   319: ldc_w           -2123943884
        //   322: goto            328
        //   325: ldc_w           -1029173918
        //   328: ldc_w           1168839447
        //   331: ixor           
        //   332: lookupswitch {
        //          -1568139260: 325
        //          -993254621: 387
        //          default: 360
        //        }
        //   360: aload_0        
        //   361: aload_0        
        //   362: getfield        dev/nuker/pyro/f5z.0:Ldev/nuker/pyro/f0a;
        //   365: invokevirtual   dev/nuker/pyro/f5z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   368: pop            
        //   369: aload_0        
        //   370: aload_0        
        //   371: getfield        dev/nuker/pyro/f5z.c:Ldev/nuker/pyro/f0b;
        //   374: invokevirtual   dev/nuker/pyro/f5z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   377: pop            
        //   378: return         
        //   379: aconst_null    
        //   380: athrow         
        //   381: aconst_null    
        //   382: athrow         
        //   383: aconst_null    
        //   384: athrow         
        //   385: aconst_null    
        //   386: athrow         
        //   387: aconst_null    
        //   388: athrow         
        //    StackMapTable: 00 14 FF 00 22 00 01 07 00 03 00 00 42 01 1E FF 00 21 00 01 07 00 03 00 02 07 00 03 07 00 D0 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 D0 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 D0 FB 00 50 42 01 1F 10 42 01 1F 14 42 01 1F 12 01 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 D0 01
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
    
    public void c(final Block p0, final boolean p1, final boolean p2, final int p3, final BlockPos p4, final EnumFacing p5, final Vec3d p6, final int p7, final EntityPlayerSP p8) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1241
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1233
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1225
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iconst_0       
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            37
        //    31: ldc_w           -1089376800
        //    34: goto            40
        //    37: ldc_w           -479441291
        //    40: ldc_w           1044085137
        //    43: ixor           
        //    44: lookupswitch {
        //          -2127948687: 37
        //          -581486620: 72
        //          default: 1198
        //        }
        //    72: istore          10
        //    74: getstatic       dev/nuker/pyro/fby.c:Ljava/util/List;
        //    77: aload_1        
        //    78: goto            82
        //    81: athrow         
        //    82: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //    87: goto            91
        //    90: athrow         
        //    91: ifne            164
        //    94: getstatic       dev/nuker/pyro/fc.1:I
        //    97: ifeq            106
        //   100: ldc_w           -1087377338
        //   103: goto            109
        //   106: ldc_w           -1888128475
        //   109: ldc_w           577918485
        //   112: ixor           
        //   113: lookupswitch {
        //          -1654806957: 1212
        //          956033213: 106
        //          default: 140
        //        }
        //   140: getstatic       dev/nuker/pyro/fby.0:Ljava/util/List;
        //   143: aload_1        
        //   144: goto            148
        //   147: athrow         
        //   148: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   153: goto            157
        //   156: athrow         
        //   157: ifne            164
        //   160: iload_2        
        //   161: ifeq            350
        //   164: aload_0        
        //   165: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //   168: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   171: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   174: new             Lnet/minecraft/network/play/client/CPacketEntityAction;
        //   177: dup            
        //   178: getstatic       dev/nuker/pyro/fc.1:I
        //   181: ifeq            190
        //   184: ldc_w           1748024536
        //   187: goto            193
        //   190: ldc_w           1284878240
        //   193: ldc_w           -125773981
        //   196: ixor           
        //   197: lookupswitch {
        //          -1867486277: 1206
        //          -543103477: 190
        //          default: 224
        //        }
        //   224: aload_0        
        //   225: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //   228: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   231: getstatic       net/minecraft/network/play/client/CPacketEntityAction$Action.START_SNEAKING:Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //   234: getstatic       dev/nuker/pyro/fc.c:I
        //   237: ifge            246
        //   240: ldc_w           1051167681
        //   243: goto            249
        //   246: ldc_w           -35227068
        //   249: ldc_w           -1596457824
        //   252: ixor           
        //   253: lookupswitch {
        //          -1636796575: 246
        //          1563526884: 280
        //          default: 1200
        //        }
        //   280: goto            284
        //   283: athrow         
        //   284: invokespecial   net/minecraft/network/play/client/CPacketEntityAction.<init>:(Lnet/minecraft/entity/Entity;Lnet/minecraft/network/play/client/CPacketEntityAction$Action;)V
        //   287: goto            291
        //   290: athrow         
        //   291: getstatic       dev/nuker/pyro/fc.0:I
        //   294: ifeq            303
        //   297: ldc_w           258541149
        //   300: goto            306
        //   303: ldc_w           -1460124404
        //   306: ldc_w           -1377785226
        //   309: ixor           
        //   310: lookupswitch {
        //          -1568035797: 1186
        //          -297379290: 303
        //          default: 336
        //        }
        //   336: goto            340
        //   339: athrow         
        //   340: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   343: goto            347
        //   346: athrow         
        //   347: iconst_1       
        //   348: istore          10
        //   350: getstatic       dev/nuker/pyro/fc.1:I
        //   353: ifeq            362
        //   356: ldc_w           1780753717
        //   359: goto            365
        //   362: ldc_w           -269236454
        //   365: ldc_w           2073623008
        //   368: ixor           
        //   369: lookupswitch {
        //          -1804910854: 396
        //          297589973: 362
        //          default: 1208
        //        }
        //   396: iload_3        
        //   397: ifeq            526
        //   400: getstatic       dev/nuker/pyro/fc.0:I
        //   403: ifeq            412
        //   406: ldc_w           -304476537
        //   409: goto            415
        //   412: ldc_w           -2030841729
        //   415: ldc_w           1135755154
        //   418: ixor           
        //   419: lookupswitch {
        //          -1620714787: 412
        //          -1368903403: 1210
        //          default: 444
        //        }
        //   444: aload_0        
        //   445: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //   448: getstatic       dev/nuker/pyro/fc.0:I
        //   451: ifeq            460
        //   454: ldc_w           1027926973
        //   457: goto            463
        //   460: ldc_w           709726717
        //   463: ldc_w           1853997026
        //   466: ixor           
        //   467: lookupswitch {
        //          868783501: 460
        //          1405441119: 1188
        //          default: 492
        //        }
        //   492: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   495: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   498: new             Lnet/minecraft/network/play/client/CPacketHeldItemChange;
        //   501: dup            
        //   502: iload           4
        //   504: goto            508
        //   507: athrow         
        //   508: invokespecial   net/minecraft/network/play/client/CPacketHeldItemChange.<init>:(I)V
        //   511: goto            515
        //   514: athrow         
        //   515: goto            519
        //   518: athrow         
        //   519: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   522: goto            526
        //   525: athrow         
        //   526: aload_0        
        //   527: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //   530: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   533: getstatic       dev/nuker/pyro/fc.0:I
        //   536: ifeq            545
        //   539: ldc_w           1464073681
        //   542: goto            548
        //   545: ldc_w           -752587312
        //   548: ldc_w           -1557944903
        //   551: ixor           
        //   552: lookupswitch {
        //          -195012504: 545
        //          1879558249: 580
        //          default: 1182
        //        }
        //   580: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   583: new             Lnet/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock;
        //   586: dup            
        //   587: getstatic       dev/nuker/pyro/fc.c:I
        //   590: ifge            599
        //   593: ldc_w           -220463321
        //   596: goto            602
        //   599: ldc_w           1991260862
        //   602: ldc_w           1168182424
        //   605: ixor           
        //   606: lookupswitch {
        //          -1216678977: 599
        //          856765990: 632
        //          default: 1192
        //        }
        //   632: aload           5
        //   634: aload           6
        //   636: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //   639: aload           7
        //   641: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //   644: d2f            
        //   645: aload           7
        //   647: getstatic       dev/nuker/pyro/fc.0:I
        //   650: ifeq            659
        //   653: ldc_w           -1080841196
        //   656: goto            662
        //   659: ldc_w           -528252681
        //   662: ldc_w           -447765005
        //   665: ixor           
        //   666: lookupswitch {
        //          453434653: 659
        //          1524369895: 1202
        //          default: 692
        //        }
        //   692: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   695: d2f            
        //   696: aload           7
        //   698: getstatic       dev/nuker/pyro/fc.c:I
        //   701: ifge            710
        //   704: ldc_w           1525387210
        //   707: goto            713
        //   710: ldc_w           1959920880
        //   713: ldc_w           -2031025753
        //   716: ixor           
        //   717: lookupswitch {
        //          -2042051819: 710
        //          -602239379: 1194
        //          default: 744
        //        }
        //   744: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   747: d2f            
        //   748: goto            752
        //   751: athrow         
        //   752: invokespecial   net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumHand;FFF)V
        //   755: goto            759
        //   758: athrow         
        //   759: goto            763
        //   762: athrow         
        //   763: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   766: goto            770
        //   769: athrow         
        //   770: aload_0        
        //   771: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //   774: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   777: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   780: new             Lnet/minecraft/network/play/client/CPacketAnimation;
        //   783: dup            
        //   784: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //   787: goto            791
        //   790: athrow         
        //   791: invokespecial   net/minecraft/network/play/client/CPacketAnimation.<init>:(Lnet/minecraft/util/EnumHand;)V
        //   794: goto            798
        //   797: athrow         
        //   798: goto            802
        //   801: athrow         
        //   802: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   805: goto            809
        //   808: athrow         
        //   809: iload_3        
        //   810: ifeq            943
        //   813: aload_0        
        //   814: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //   817: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   820: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   823: new             Lnet/minecraft/network/play/client/CPacketHeldItemChange;
        //   826: dup            
        //   827: getstatic       dev/nuker/pyro/fc.1:I
        //   830: ifeq            839
        //   833: ldc_w           -310039917
        //   836: goto            842
        //   839: ldc_w           1513881290
        //   842: ldc_w           1373185902
        //   845: ixor           
        //   846: lookupswitch {
        //          -1134817795: 839
        //          199416228: 872
        //          default: 1214
        //        }
        //   872: iload           8
        //   874: goto            878
        //   877: athrow         
        //   878: invokespecial   net/minecraft/network/play/client/CPacketHeldItemChange.<init>:(I)V
        //   881: goto            885
        //   884: athrow         
        //   885: getstatic       dev/nuker/pyro/fc.c:I
        //   888: ifge            897
        //   891: ldc_w           782050915
        //   894: goto            900
        //   897: ldc_w           1757785748
        //   900: ldc_w           2099659048
        //   903: ixor           
        //   904: lookupswitch {
        //          367259580: 932
        //          1404790603: 897
        //          default: 1184
        //        }
        //   932: goto            936
        //   935: athrow         
        //   936: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   939: goto            943
        //   942: athrow         
        //   943: getstatic       dev/nuker/pyro/fc.1:I
        //   946: ifeq            955
        //   949: ldc_w           -196332891
        //   952: goto            958
        //   955: ldc_w           1014975332
        //   958: ldc_w           -2085332800
        //   961: ixor           
        //   962: lookupswitch {
        //          -1077210204: 988
        //          2012768869: 955
        //          default: 1196
        //        }
        //   988: iload           10
        //   990: ifeq            1179
        //   993: aload_0        
        //   994: getstatic       dev/nuker/pyro/fc.c:I
        //   997: ifge            1006
        //  1000: ldc_w           -792235232
        //  1003: goto            1009
        //  1006: ldc_w           -1500045665
        //  1009: ldc_w           1946214271
        //  1012: ixor           
        //  1013: lookupswitch {
        //          -1530418081: 1006
        //          -761806368: 1040
        //          default: 1190
        //        }
        //  1040: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  1043: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1046: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1049: new             Lnet/minecraft/network/play/client/CPacketEntityAction;
        //  1052: dup            
        //  1053: getstatic       dev/nuker/pyro/fc.0:I
        //  1056: ifeq            1065
        //  1059: ldc_w           1157652719
        //  1062: goto            1068
        //  1065: ldc_w           -135459115
        //  1068: ldc_w           -1891046924
        //  1071: ixor           
        //  1072: lookupswitch {
        //          -901215973: 1204
        //          -106251355: 1065
        //          default: 1100
        //        }
        //  1100: aload_0        
        //  1101: getstatic       dev/nuker/pyro/fc.1:I
        //  1104: ifeq            1113
        //  1107: ldc_w           317714095
        //  1110: goto            1116
        //  1113: ldc_w           -24436074
        //  1116: ldc_w           -1952692198
        //  1119: ixor           
        //  1120: lookupswitch {
        //          -1952354173: 1113
        //          -1720473931: 1180
        //          default: 1148
        //        }
        //  1148: getfield        dev/nuker/pyro/f5z.c:Lnet/minecraft/client/Minecraft;
        //  1151: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1154: getstatic       net/minecraft/network/play/client/CPacketEntityAction$Action.STOP_SNEAKING:Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //  1157: goto            1161
        //  1160: athrow         
        //  1161: invokespecial   net/minecraft/network/play/client/CPacketEntityAction.<init>:(Lnet/minecraft/entity/Entity;Lnet/minecraft/network/play/client/CPacketEntityAction$Action;)V
        //  1164: goto            1168
        //  1167: athrow         
        //  1168: goto            1172
        //  1171: athrow         
        //  1172: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  1175: goto            1179
        //  1178: athrow         
        //  1179: return         
        //  1180: aconst_null    
        //  1181: athrow         
        //  1182: aconst_null    
        //  1183: athrow         
        //  1184: aconst_null    
        //  1185: athrow         
        //  1186: aconst_null    
        //  1187: athrow         
        //  1188: aconst_null    
        //  1189: athrow         
        //  1190: aconst_null    
        //  1191: athrow         
        //  1192: aconst_null    
        //  1193: athrow         
        //  1194: aconst_null    
        //  1195: athrow         
        //  1196: aconst_null    
        //  1197: athrow         
        //  1198: aconst_null    
        //  1199: athrow         
        //  1200: aconst_null    
        //  1201: athrow         
        //  1202: aconst_null    
        //  1203: athrow         
        //  1204: aconst_null    
        //  1205: athrow         
        //  1206: aconst_null    
        //  1207: athrow         
        //  1208: aconst_null    
        //  1209: athrow         
        //  1210: aconst_null    
        //  1211: athrow         
        //  1212: aconst_null    
        //  1213: athrow         
        //  1214: aconst_null    
        //  1215: athrow         
        //  1216: pop            
        //  1217: goto            24
        //  1220: pop            
        //  1221: aconst_null    
        //  1222: goto            1216
        //  1225: dup            
        //  1226: ifnull          1216
        //  1229: checkcast       Ljava/lang/Throwable;
        //  1232: athrow         
        //  1233: dup            
        //  1234: ifnull          1220
        //  1237: checkcast       Ljava/lang/Throwable;
        //  1240: athrow         
        //  1241: aconst_null    
        //  1242: athrow         
        //    StackMapTable: 00 8B FF 00 03 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 01 07 00 24 FA 00 04 FF 00 0B 00 00 00 01 07 00 24 FF 00 03 00 0A 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 00 00 4C 01 FF 00 02 00 0A 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 00 02 01 01 5F 01 FF 00 08 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 01 07 00 24 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 BA 07 01 E8 47 07 00 24 40 01 0E 42 01 1E FF 00 06 00 00 00 01 07 00 24 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 BA 07 01 E8 47 07 00 24 40 01 06 FF 00 19 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 03 07 02 DC 08 00 AE 08 00 AE FF 00 02 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 04 07 02 DC 08 00 AE 08 00 AE 01 FF 00 1E 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 03 07 02 DC 08 00 AE 08 00 AE FF 00 15 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 05 07 02 DC 08 00 AE 08 00 AE 07 00 57 07 02 CD FF 00 02 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 06 07 02 DC 08 00 AE 08 00 AE 07 00 57 07 02 CD 01 FF 00 1E 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 05 07 02 DC 08 00 AE 08 00 AE 07 00 57 07 02 CD 42 07 00 24 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 05 07 02 DC 08 00 AE 08 00 AE 07 00 57 07 02 CD 45 07 00 24 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 02 C8 FF 00 0B 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 02 C8 FF 00 02 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 03 07 02 DC 07 02 C8 01 FF 00 1D 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 02 C8 FF 00 02 00 00 00 01 07 00 24 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 02 C8 45 07 00 24 00 02 0B 42 01 1E 0F 42 01 1C 4F 07 00 51 FF 00 02 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 00 51 01 5C 07 00 51 4E 07 00 B4 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 04 07 02 DC 08 01 F2 08 01 F2 01 45 07 00 24 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 02 EB FF 00 02 00 00 00 01 07 00 24 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 02 EB 45 07 00 24 00 52 07 00 57 FF 00 02 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 00 57 01 5F 07 00 57 FF 00 12 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 03 07 02 DC 08 02 47 08 02 47 FF 00 02 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 04 07 02 DC 08 02 47 08 02 47 01 FF 00 1D 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 03 07 02 DC 08 02 47 08 02 47 FF 00 1A 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 08 07 02 DC 08 02 47 08 02 47 07 00 7A 07 01 BF 07 02 2A 02 07 00 26 FF 00 02 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 09 07 02 DC 08 02 47 08 02 47 07 00 7A 07 01 BF 07 02 2A 02 07 00 26 01 FF 00 1D 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 08 07 02 DC 08 02 47 08 02 47 07 00 7A 07 01 BF 07 02 2A 02 07 00 26 FF 00 11 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 09 07 02 DC 08 02 47 08 02 47 07 00 7A 07 01 BF 07 02 2A 02 02 07 00 26 FF 00 02 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 0A 07 02 DC 08 02 47 08 02 47 07 00 7A 07 01 BF 07 02 2A 02 02 07 00 26 01 FF 00 1E 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 09 07 02 DC 08 02 47 08 02 47 07 00 7A 07 01 BF 07 02 2A 02 02 07 00 26 46 07 00 24 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 09 07 02 DC 08 02 47 08 02 47 07 00 7A 07 01 BF 07 02 2A 02 02 02 45 07 00 24 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 02 F3 42 07 00 74 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 02 F3 45 07 00 24 00 53 07 00 24 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 04 07 02 DC 08 03 0C 08 03 0C 07 02 2A 45 07 00 24 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 03 01 42 07 00 B4 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 03 01 45 07 00 24 00 FF 00 1D 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 03 07 02 DC 08 03 37 08 03 37 FF 00 02 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 04 07 02 DC 08 03 37 08 03 37 01 FF 00 1D 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 03 07 02 DC 08 03 37 08 03 37 44 07 00 24 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 04 07 02 DC 08 03 37 08 03 37 01 45 07 00 24 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 02 EB FF 00 0B 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 02 EB FF 00 02 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 03 07 02 DC 07 02 EB 01 FF 00 1F 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 02 EB 42 07 00 74 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 02 EB 45 07 00 24 00 0B 42 01 1D 51 07 00 03 FF 00 02 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 00 03 01 5E 07 00 03 FF 00 18 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 03 07 02 DC 08 04 19 08 04 19 FF 00 02 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 04 07 02 DC 08 04 19 08 04 19 01 FF 00 1F 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 03 07 02 DC 08 04 19 08 04 19 FF 00 0C 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 04 07 02 DC 08 04 19 08 04 19 07 00 03 FF 00 02 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 05 07 02 DC 08 04 19 08 04 19 07 00 03 01 FF 00 1F 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 04 07 02 DC 08 04 19 08 04 19 07 00 03 4B 07 00 76 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 05 07 02 DC 08 04 19 08 04 19 07 00 57 07 02 CD 45 07 00 24 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 02 C8 42 07 00 17 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 02 C8 45 07 00 24 00 FF 00 00 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 04 07 02 DC 08 04 19 08 04 19 07 00 03 41 07 00 57 FF 00 01 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 02 EB FF 00 01 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 02 07 02 DC 07 02 C8 41 07 00 51 41 07 00 03 FF 00 01 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 03 07 02 DC 08 02 47 08 02 47 FF 00 01 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 09 07 02 DC 08 02 47 08 02 47 07 00 7A 07 01 BF 07 02 2A 02 02 07 00 26 01 FF 00 01 00 0A 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 00 01 01 FF 00 01 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 05 07 02 DC 08 00 AE 08 00 AE 07 00 57 07 02 CD FF 00 01 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 08 07 02 DC 08 02 47 08 02 47 07 00 7A 07 01 BF 07 02 2A 02 07 00 26 FF 00 01 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 03 07 02 DC 08 04 19 08 04 19 FF 00 01 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 03 07 02 DC 08 00 AE 08 00 AE 01 01 01 FF 00 01 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 03 07 02 DC 08 03 37 08 03 37 FF 00 01 00 0A 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 00 01 07 00 17 43 05 44 07 00 17 47 05 FF 00 07 00 0B 07 00 03 07 01 E8 01 01 01 07 00 7A 07 01 BF 07 00 26 01 07 00 57 01 00 01 07 00 24
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1225   1233   Ljava/lang/NumberFormatException;
        //  1225   1233   1225   1233   Ljava/lang/ClassCastException;
        //  1241   1243   3      8      Any
        //  81     90     90     91     Any
        //  82     90     81     82     Any
        //  82     90     81     82     Any
        //  81     90     3      8      Any
        //  81     90     3      8      Any
        //  148    156    156    157    Any
        //  148    156    156    157    Any
        //  148    156    3      8      Ljava/lang/IllegalStateException;
        //  148    156    156    157    Any
        //  148    156    3      8      Ljava/lang/IllegalArgumentException;
        //  283    290    290    291    Any
        //  284    290    283    284    Any
        //  284    290    290    291    Ljava/lang/StringIndexOutOfBoundsException;
        //  283    290    3      8      Ljava/lang/UnsupportedOperationException;
        //  283    290    290    291    Ljava/lang/EnumConstantNotPresentException;
        //  340    346    346    347    Any
        //  340    346    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  340    346    3      8      Ljava/lang/NumberFormatException;
        //  340    346    346    347    Any
        //  340    346    346    347    Ljava/lang/IllegalArgumentException;
        //  507    514    514    515    Any
        //  507    514    3      8      Ljava/lang/NumberFormatException;
        //  508    514    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  507    514    514    515    Ljava/lang/NullPointerException;
        //  508    514    507    508    Ljava/lang/StringIndexOutOfBoundsException;
        //  519    525    525    526    Any
        //  519    525    3      8      Any
        //  519    525    525    526    Any
        //  519    525    3      8      Any
        //  519    525    3      8      Any
        //  751    758    758    759    Any
        //  752    758    751    752    Ljava/util/ConcurrentModificationException;
        //  751    758    3      8      Any
        //  751    758    3      8      Ljava/lang/UnsupportedOperationException;
        //  752    758    751    752    Any
        //  762    769    769    770    Any
        //  763    769    769    770    Any
        //  762    769    762    763    Ljava/lang/AssertionError;
        //  763    769    769    770    Ljava/lang/NullPointerException;
        //  762    769    769    770    Any
        //  790    797    797    798    Any
        //  791    797    790    791    Ljava/lang/NullPointerException;
        //  791    797    797    798    Any
        //  791    797    790    791    Any
        //  790    797    797    798    Any
        //  801    808    808    809    Any
        //  802    808    801    802    Ljava/lang/StringIndexOutOfBoundsException;
        //  801    808    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  802    808    801    802    Ljava/lang/StringIndexOutOfBoundsException;
        //  801    808    808    809    Ljava/lang/NegativeArraySizeException;
        //  877    884    884    885    Any
        //  877    884    3      8      Any
        //  877    884    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  877    884    877    878    Any
        //  877    884    877    878    Any
        //  935    942    942    943    Any
        //  936    942    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  936    942    3      8      Any
        //  935    942    942    943    Ljava/lang/UnsupportedOperationException;
        //  935    942    935    936    Ljava/lang/AssertionError;
        //  1160   1167   1167   1168   Any
        //  1160   1167   1167   1168   Ljava/lang/NumberFormatException;
        //  1161   1167   1160   1161   Ljava/lang/NegativeArraySizeException;
        //  1161   1167   3      8      Any
        //  1160   1167   1167   1168   Ljava/lang/ArithmeticException;
        //  1171   1178   1178   1179   Any
        //  1172   1178   1171   1172   Ljava/lang/RuntimeException;
        //  1171   1178   1178   1179   Ljava/lang/StringIndexOutOfBoundsException;
        //  1172   1178   3      8      Ljava/lang/ClassCastException;
        //  1172   1178   3      8      Ljava/lang/UnsupportedOperationException;
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
