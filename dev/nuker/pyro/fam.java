// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.state.IBlockState;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.block.Block;
import org.jetbrains.annotations.NotNull;

public class fam extends fH
{
    @NotNull
    public f0g c;
    @NotNull
    public f0g 0;
    @NotNull
    public f0a c;
    @NotNull
    public f0h c;
    @NotNull
    public f0a 0;
    @NotNull
    public fak c;
    public int 1;
    
    public void c(@NotNull final Block p0, @NotNull final BlockRenderLayer p1, @NotNull final CallbackInfoReturnable p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          414
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            406
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            398
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_2        
        //    27: pop            
        //    28: aload_3        
        //    29: pop            
        //    30: aload_0        
        //    31: aload_1        
        //    32: goto            36
        //    35: athrow         
        //    36: invokevirtual   dev/nuker/pyro/fam.c:(Lnet/minecraft/block/Block;)Z
        //    39: goto            43
        //    42: athrow         
        //    43: ifne            51
        //    46: ldc             2052389687
        //    48: goto            53
        //    51: ldc             2052389688
        //    53: ldc             847223104
        //    55: ixor           
        //    56: tableswitch {
        //          -1873361682: 80
        //          -1873361681: 378
        //          default: 46
        //        }
        //    80: getstatic       dev/nuker/pyro/fc.c:I
        //    83: ifge            91
        //    86: ldc             -492930715
        //    88: goto            93
        //    91: ldc             -461245318
        //    93: ldc             -1932893690
        //    95: ixor           
        //    96: lookupswitch {
        //          1749784188: 124
        //          1851005795: 91
        //          default: 387
        //        }
        //   124: aload_3        
        //   125: goto            129
        //   128: athrow         
        //   129: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable.cancel:()V
        //   132: goto            136
        //   135: athrow         
        //   136: getstatic       dev/nuker/pyro/fc.0:I
        //   139: ifeq            147
        //   142: ldc             1116274320
        //   144: goto            149
        //   147: ldc             -2147379486
        //   149: ldc             1046417284
        //   151: ixor           
        //   152: lookupswitch {
        //          -1101096602: 180
        //          2094526740: 147
        //          default: 381
        //        }
        //   180: aload_3        
        //   181: getstatic       dev/nuker/pyro/fc.1:I
        //   184: ifeq            192
        //   187: ldc             852629801
        //   189: goto            194
        //   192: ldc             2092431112
        //   194: ldc             -1518761927
        //   196: ixor           
        //   197: lookupswitch {
        //          -1750363888: 385
        //          1054290888: 192
        //          default: 224
        //        }
        //   224: aload_2        
        //   225: getstatic       dev/nuker/pyro/fc.c:I
        //   228: ifge            236
        //   231: ldc             1441124834
        //   233: goto            238
        //   236: ldc             -1306433504
        //   238: ldc             956580305
        //   240: ixor           
        //   241: lookupswitch {
        //          -1960498703: 268
        //          1826721843: 236
        //          default: 379
        //        }
        //   268: getstatic       net/minecraft/util/BlockRenderLayer.TRANSLUCENT:Lnet/minecraft/util/BlockRenderLayer;
        //   271: if_acmpne       279
        //   274: ldc             -1358240371
        //   276: goto            281
        //   279: ldc             -1358240382
        //   281: ldc             2070218074
        //   283: ixor           
        //   284: tableswitch {
        //          -1461730898: 308
        //          -1461730897: 312
        //          default: 274
        //        }
        //   308: iconst_1       
        //   309: goto            313
        //   312: iconst_0       
        //   313: getstatic       dev/nuker/pyro/fc.1:I
        //   316: ifeq            324
        //   319: ldc             1664071568
        //   321: goto            326
        //   324: ldc             -76401112
        //   326: ldc             -1988971517
        //   328: ixor           
        //   329: lookupswitch {
        //          -996941862: 324
        //          -363002989: 383
        //          default: 356
        //        }
        //   356: goto            360
        //   359: athrow         
        //   360: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   363: goto            367
        //   366: athrow         
        //   367: goto            371
        //   370: athrow         
        //   371: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable.setReturnValue:(Ljava/lang/Object;)V
        //   374: goto            378
        //   377: athrow         
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
        //   389: pop            
        //   390: goto            24
        //   393: pop            
        //   394: aconst_null    
        //   395: goto            389
        //   398: dup            
        //   399: ifnull          389
        //   402: checkcast       Ljava/lang/Throwable;
        //   405: athrow         
        //   406: dup            
        //   407: ifnull          393
        //   410: checkcast       Ljava/lang/Throwable;
        //   413: athrow         
        //   414: aconst_null    
        //   415: athrow         
        //    StackMapTable: 00 37 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FF 00 03 00 04 07 00 03 07 00 59 07 00 43 07 00 30 00 00 4A 07 00 5B FF 00 00 00 04 07 00 03 07 00 59 07 00 43 07 00 30 00 02 07 00 03 07 00 59 45 07 00 25 40 01 02 04 41 01 1A 0A 41 01 1E 43 07 00 25 40 07 00 30 45 07 00 25 00 0A 41 01 1E 4B 07 00 30 FF 00 01 00 04 07 00 03 07 00 59 07 00 43 07 00 30 00 02 07 00 30 01 5D 07 00 30 FF 00 0B 00 04 07 00 03 07 00 59 07 00 43 07 00 30 00 02 07 00 30 07 00 43 FF 00 01 00 04 07 00 03 07 00 59 07 00 43 07 00 30 00 03 07 00 30 07 00 43 01 FF 00 1D 00 04 07 00 03 07 00 59 07 00 43 07 00 30 00 02 07 00 30 07 00 43 45 07 00 30 44 07 00 30 FF 00 01 00 04 07 00 03 07 00 59 07 00 43 07 00 30 00 02 07 00 30 01 5A 07 00 30 43 07 00 30 FF 00 00 00 04 07 00 03 07 00 59 07 00 43 07 00 30 00 02 07 00 30 01 FF 00 0A 00 04 07 00 03 07 00 59 07 00 43 07 00 30 00 02 07 00 30 01 FF 00 01 00 04 07 00 03 07 00 59 07 00 43 07 00 30 00 03 07 00 30 01 01 FF 00 1D 00 04 07 00 03 07 00 59 07 00 43 07 00 30 00 02 07 00 30 01 42 07 00 25 FF 00 00 00 04 07 00 03 07 00 59 07 00 43 07 00 30 00 02 07 00 30 01 45 07 00 25 FF 00 00 00 04 07 00 03 07 00 59 07 00 43 07 00 30 00 02 07 00 30 07 00 4F FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 04 07 00 03 07 00 59 07 00 43 07 00 30 00 02 07 00 30 07 00 4F 45 07 00 25 00 FF 00 00 00 04 07 00 03 07 00 59 07 00 43 07 00 30 00 02 07 00 30 07 00 43 01 FF 00 01 00 04 07 00 03 07 00 59 07 00 43 07 00 30 00 02 07 00 30 01 41 07 00 30 01 41 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     398    406    Any
        //  398    406    398    406    Any
        //  414    416    3      8      Ljava/lang/NullPointerException;
        //  35     42     42     43     Any
        //  35     42     42     43     Ljava/util/NoSuchElementException;
        //  35     42     35     36     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  35     42     35     36     Ljava/lang/ClassCastException;
        //  36     42     3      8      Ljava/lang/NullPointerException;
        //  128    135    135    136    Any
        //  128    135    135    136    Any
        //  128    135    128    129    Any
        //  128    135    128    129    Any
        //  128    135    135    136    Ljava/lang/NegativeArraySizeException;
        //  359    366    366    367    Any
        //  360    366    359    360    Any
        //  359    366    366    367    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  359    366    359    360    Any
        //  359    366    366    367    Ljava/lang/IllegalArgumentException;
        //  371    377    377    378    Any
        //  371    377    377    378    Ljava/lang/ClassCastException;
        //  371    377    377    378    Ljava/lang/StringIndexOutOfBoundsException;
        //  371    377    377    378    Ljava/lang/ArithmeticException;
        //  371    377    3      8      Any
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
    
    @NotNull
    public fak 1() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          160
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            152
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            144
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.0:I
        //    28: ifeq            36
        //    31: ldc             -1004237142
        //    33: goto            38
        //    36: ldc             -1573388368
        //    38: ldc             -1123181575
        //    40: ixor           
        //    41: lookupswitch {
        //          523920457: 68
        //          2032735571: 36
        //          default: 133
        //        }
        //    68: getfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/fak;
        //    71: dup            
        //    72: ifnonnull       80
        //    75: ldc             927539499
        //    77: goto            82
        //    80: ldc             927539500
        //    82: ldc             -1820873336
        //    84: ixor           
        //    85: tableswitch {
        //          1216158022: 108
        //          1216158023: 132
        //          default: 75
        //        }
        //   108: ldc             "\u296d\u1487\u8060\ub188\uc497\ue77f\ub221"
        //   110: goto            114
        //   113: athrow         
        //   114: invokestatic    invokestatic   !!! ERROR
        //   117: goto            121
        //   120: athrow         
        //   121: goto            125
        //   124: athrow         
        //   125: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   128: goto            132
        //   131: athrow         
        //   132: areturn        
        //   133: aconst_null    
        //   134: athrow         
        //   135: pop            
        //   136: goto            24
        //   139: pop            
        //   140: aconst_null    
        //   141: goto            135
        //   144: dup            
        //   145: ifnull          135
        //   148: checkcast       Ljava/lang/Throwable;
        //   151: athrow         
        //   152: dup            
        //   153: ifnull          139
        //   156: checkcast       Ljava/lang/Throwable;
        //   159: athrow         
        //   160: aconst_null    
        //   161: athrow         
        //    StackMapTable: 00 19 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FC 00 03 07 00 03 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 46 07 00 77 44 07 00 77 FF 00 01 00 01 07 00 03 00 02 07 00 77 01 59 07 00 77 44 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 77 07 00 79 45 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 77 07 00 79 42 07 00 60 FF 00 00 00 01 07 00 03 00 02 07 00 77 07 00 79 45 07 00 25 40 07 00 77 40 07 00 03 41 07 00 5B 43 05 44 07 00 5B 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     144    152    Ljava/lang/UnsupportedOperationException;
        //  144    152    144    152    Ljava/lang/NegativeArraySizeException;
        //  160    162    3      8      Any
        //  113    120    120    121    Any
        //  114    120    3      8      Any
        //  113    120    3      8      Ljava/util/NoSuchElementException;
        //  113    120    120    121    Any
        //  113    120    113    114    Any
        //  124    131    131    132    Any
        //  124    131    131    132    Ljava/lang/UnsupportedOperationException;
        //  124    131    124    125    Ljava/lang/IllegalStateException;
        //  125    131    131    132    Any
        //  125    131    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 57 out of bounds for length 57
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
    
    public void c(@NotNull final Block p0, @NotNull final IBlockState p1, @NotNull final IBlockAccess p2, @NotNull final BlockPos p3, @NotNull final EnumFacing p4, @NotNull final CallbackInfoReturnable p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          162
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            154
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            146
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_2        
        //    27: pop            
        //    28: aload_3        
        //    29: pop            
        //    30: aload           4
        //    32: pop            
        //    33: aload           5
        //    35: pop            
        //    36: aload           6
        //    38: pop            
        //    39: aload_0        
        //    40: aload_1        
        //    41: goto            45
        //    44: athrow         
        //    45: invokevirtual   dev/nuker/pyro/fam.c:(Lnet/minecraft/block/Block;)Z
        //    48: goto            52
        //    51: athrow         
        //    52: ifeq            134
        //    55: aload           6
        //    57: goto            61
        //    60: athrow         
        //    61: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable.cancel:()V
        //    64: goto            68
        //    67: athrow         
        //    68: aload           6
        //    70: iconst_1       
        //    71: getstatic       dev/nuker/pyro/fc.1:I
        //    74: ifeq            82
        //    77: ldc             1973722730
        //    79: goto            84
        //    82: ldc             -1473409448
        //    84: ldc             1954915388
        //    86: ixor           
        //    87: lookupswitch {
        //          -592958876: 112
        //          18954838: 82
        //          default: 135
        //        }
        //   112: goto            116
        //   115: athrow         
        //   116: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   119: goto            123
        //   122: athrow         
        //   123: goto            127
        //   126: athrow         
        //   127: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable.setReturnValue:(Ljava/lang/Object;)V
        //   130: goto            134
        //   133: athrow         
        //   134: return         
        //   135: aconst_null    
        //   136: athrow         
        //   137: pop            
        //   138: goto            24
        //   141: pop            
        //   142: aconst_null    
        //   143: goto            137
        //   146: dup            
        //   147: ifnull          137
        //   150: checkcast       Ljava/lang/Throwable;
        //   153: athrow         
        //   154: dup            
        //   155: ifnull          141
        //   158: checkcast       Ljava/lang/Throwable;
        //   161: athrow         
        //   162: aconst_null    
        //   163: athrow         
        //    StackMapTable: 00 1D 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FF 00 03 00 07 07 00 03 07 00 59 07 00 81 07 00 83 07 00 85 07 00 87 07 00 30 00 00 53 07 00 7C FF 00 00 00 07 07 00 03 07 00 59 07 00 81 07 00 83 07 00 85 07 00 87 07 00 30 00 02 07 00 03 07 00 59 45 07 00 25 40 01 47 07 00 25 40 07 00 30 45 07 00 25 00 FF 00 0D 00 07 07 00 03 07 00 59 07 00 81 07 00 83 07 00 85 07 00 87 07 00 30 00 02 07 00 30 01 FF 00 01 00 07 07 00 03 07 00 59 07 00 81 07 00 83 07 00 85 07 00 87 07 00 30 00 03 07 00 30 01 01 FF 00 1B 00 07 07 00 03 07 00 59 07 00 81 07 00 83 07 00 85 07 00 87 07 00 30 00 02 07 00 30 01 42 07 00 7C FF 00 00 00 07 07 00 03 07 00 59 07 00 81 07 00 83 07 00 85 07 00 87 07 00 30 00 02 07 00 30 01 45 07 00 25 FF 00 00 00 07 07 00 03 07 00 59 07 00 81 07 00 83 07 00 85 07 00 87 07 00 30 00 02 07 00 30 07 00 4F 42 07 00 25 FF 00 00 00 07 07 00 03 07 00 59 07 00 81 07 00 83 07 00 85 07 00 87 07 00 30 00 02 07 00 30 07 00 4F 45 07 00 25 00 FF 00 00 00 07 07 00 03 07 00 59 07 00 81 07 00 83 07 00 85 07 00 87 07 00 30 00 02 07 00 30 01 41 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     146    154    Any
        //  146    154    146    154    Ljava/lang/ClassCastException;
        //  162    164    3      8      Any
        //  44     51     51     52     Any
        //  45     51     44     45     Ljava/lang/EnumConstantNotPresentException;
        //  45     51     3      8      Ljava/lang/UnsupportedOperationException;
        //  44     51     51     52     Any
        //  44     51     3      8      Any
        //  60     67     67     68     Any
        //  61     67     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  61     67     67     68     Ljava/lang/RuntimeException;
        //  60     67     67     68     Any
        //  61     67     60     61     Any
        //  115    122    122    123    Any
        //  115    122    122    123    Any
        //  115    122    115    116    Ljava/lang/EnumConstantNotPresentException;
        //  116    122    3      8      Ljava/lang/UnsupportedOperationException;
        //  116    122    3      8      Any
        //  126    133    133    134    Any
        //  127    133    3      8      Any
        //  127    133    126    127    Any
        //  127    133    133    134    Any
        //  127    133    3      8      Any
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
    
    public void 9() {
        public class fal implements Runnable
        {
            public fam c;
            
            public fal(final fam c) {
                this.c = c;
            }
            
            static {
                throw t;
            }
            
            @Override
            public void run() {
                fbS.do(this, 1894809528);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1177
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1169
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1161
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   dev/nuker/pyro/fam.8:()Z
        //    32: goto            36
        //    35: athrow         
        //    36: istore_1       
        //    37: aload_0        
        //    38: getfield        dev/nuker/pyro/fam.1:I
        //    41: aload_0        
        //    42: goto            46
        //    45: athrow         
        //    46: invokevirtual   dev/nuker/pyro/fam.4:()I
        //    49: goto            53
        //    52: athrow         
        //    53: if_icmpge       61
        //    56: ldc             235340960
        //    58: goto            63
        //    61: ldc             235340975
        //    63: ldc             -904914521
        //    65: ixor           
        //    66: tableswitch {
        //          -2010236402: 88
        //          -2010236401: 362
        //          default: 56
        //        }
        //    88: aload_0        
        //    89: dup            
        //    90: getstatic       dev/nuker/pyro/fc.1:I
        //    93: ifeq            101
        //    96: ldc             2136115195
        //    98: goto            103
        //   101: ldc             -1724424073
        //   103: ldc             -1122799240
        //   105: ixor           
        //   106: lookupswitch {
        //          -1035864445: 101
        //          606343439: 132
        //          default: 1132
        //        }
        //   132: getfield        dev/nuker/pyro/fam.1:I
        //   135: getstatic       dev/nuker/pyro/fc.0:I
        //   138: ifeq            146
        //   141: ldc             71314842
        //   143: goto            148
        //   146: ldc             -1066160000
        //   148: ldc             1208695531
        //   150: ixor           
        //   151: lookupswitch {
        //          -2005366165: 176
        //          1279989617: 146
        //          default: 1120
        //        }
        //   176: aload_0        
        //   177: goto            181
        //   180: athrow         
        //   181: invokevirtual   dev/nuker/pyro/fam.4:()I
        //   184: goto            188
        //   187: athrow         
        //   188: aload_0        
        //   189: getfield        dev/nuker/pyro/fam.1:I
        //   192: isub           
        //   193: istore_2       
        //   194: bipush          10
        //   196: istore_3       
        //   197: getstatic       dev/nuker/pyro/fc.c:I
        //   200: ifge            208
        //   203: ldc             -1757464058
        //   205: goto            210
        //   208: ldc             1992594554
        //   210: ldc             -1183653212
        //   212: ixor           
        //   213: lookupswitch {
        //          776853666: 1122
        //          1963717478: 208
        //          default: 240
        //        }
        //   240: istore          6
        //   242: astore          5
        //   244: iconst_0       
        //   245: istore          4
        //   247: iload_2        
        //   248: getstatic       dev/nuker/pyro/fc.1:I
        //   251: ifeq            259
        //   254: ldc             723092524
        //   256: goto            261
        //   259: ldc             2024948835
        //   261: ldc             1056429919
        //   263: ixor           
        //   264: lookupswitch {
        //          367940467: 259
        //          1178964796: 292
        //          default: 1142
        //        }
        //   292: iload_3        
        //   293: getstatic       dev/nuker/pyro/fc.0:I
        //   296: ifeq            304
        //   299: ldc             -1427688637
        //   301: goto            306
        //   304: ldc             -1070230804
        //   306: ldc             -1442188369
        //   308: ixor           
        //   309: lookupswitch {
        //          15646956: 304
        //          1782341955: 336
        //          default: 1148
        //        }
        //   336: goto            340
        //   339: athrow         
        //   340: invokestatic    java/lang/Math.min:(II)I
        //   343: goto            347
        //   346: athrow         
        //   347: istore          7
        //   349: aload           5
        //   351: iload           6
        //   353: iload           7
        //   355: iadd           
        //   356: putfield        dev/nuker/pyro/fam.1:I
        //   359: goto            907
        //   362: aload_0        
        //   363: getfield        dev/nuker/pyro/fam.1:I
        //   366: getstatic       dev/nuker/pyro/fc.c:I
        //   369: ifge            377
        //   372: ldc             -1415313831
        //   374: goto            379
        //   377: ldc             -218916319
        //   379: ldc             -1493487452
        //   381: ixor           
        //   382: lookupswitch {
        //          224343805: 377
        //          1409854085: 408
        //          default: 1116
        //        }
        //   408: aload_0        
        //   409: getstatic       dev/nuker/pyro/fc.c:I
        //   412: ifge            420
        //   415: ldc             -1175787852
        //   417: goto            422
        //   420: ldc             1097070598
        //   422: ldc             -1544630556
        //   424: ixor           
        //   425: lookupswitch {
        //          -494061854: 452
        //          436480080: 420
        //          default: 1134
        //        }
        //   452: goto            456
        //   455: athrow         
        //   456: invokevirtual   dev/nuker/pyro/fam.4:()I
        //   459: goto            463
        //   462: athrow         
        //   463: if_icmple       907
        //   466: getstatic       dev/nuker/pyro/fc.c:I
        //   469: ifge            477
        //   472: ldc             1024749772
        //   474: goto            479
        //   477: ldc             644381760
        //   479: ldc             1111368567
        //   481: ixor           
        //   482: lookupswitch {
        //          1683382071: 508
        //          2133480379: 477
        //          default: 1124
        //        }
        //   508: aload_0        
        //   509: dup            
        //   510: getstatic       dev/nuker/pyro/fc.c:I
        //   513: ifge            521
        //   516: ldc             -1794242107
        //   518: goto            523
        //   521: ldc             -1680242052
        //   523: ldc             -140198237
        //   525: ixor           
        //   526: lookupswitch {
        //          1655355238: 521
        //          1820144863: 552
        //          default: 1140
        //        }
        //   552: getfield        dev/nuker/pyro/fam.1:I
        //   555: getstatic       dev/nuker/pyro/fc.1:I
        //   558: ifeq            566
        //   561: ldc             -1288264713
        //   563: goto            568
        //   566: ldc             1578884292
        //   568: ldc             1330263770
        //   570: ixor           
        //   571: lookupswitch {
        //          -58944211: 566
        //          290581022: 596
        //          default: 1150
        //        }
        //   596: aload_0        
        //   597: getfield        dev/nuker/pyro/fam.1:I
        //   600: aload_0        
        //   601: getstatic       dev/nuker/pyro/fc.0:I
        //   604: ifeq            612
        //   607: ldc             -520770368
        //   609: goto            614
        //   612: ldc             -1364144620
        //   614: ldc             -625039929
        //   616: ixor           
        //   617: lookupswitch {
        //          -648735364: 612
        //          977996039: 1118
        //          default: 644
        //        }
        //   644: goto            648
        //   647: athrow         
        //   648: invokevirtual   dev/nuker/pyro/fam.4:()I
        //   651: goto            655
        //   654: athrow         
        //   655: isub           
        //   656: getstatic       dev/nuker/pyro/fc.c:I
        //   659: ifge            667
        //   662: ldc             -1475966147
        //   664: goto            669
        //   667: ldc             -1195345039
        //   669: ldc             1162378045
        //   671: ixor           
        //   672: lookupswitch {
        //          -313593856: 1136
        //          1670814961: 667
        //          default: 700
        //        }
        //   700: istore_2       
        //   701: bipush          10
        //   703: getstatic       dev/nuker/pyro/fc.1:I
        //   706: ifeq            714
        //   709: ldc             -27315048
        //   711: goto            716
        //   714: ldc             -16387415
        //   716: ldc             101172495
        //   718: ixor           
        //   719: lookupswitch {
        //          -146430270: 714
        //          -128388713: 1128
        //          default: 744
        //        }
        //   744: istore_3       
        //   745: getstatic       dev/nuker/pyro/fc.c:I
        //   748: ifge            756
        //   751: ldc             1680452890
        //   753: goto            758
        //   756: ldc             1046991164
        //   758: ldc             -2032424293
        //   760: ixor           
        //   761: lookupswitch {
        //          -1195607129: 788
        //          -487454847: 756
        //          default: 1144
        //        }
        //   788: istore          6
        //   790: astore          5
        //   792: iconst_0       
        //   793: getstatic       dev/nuker/pyro/fc.0:I
        //   796: ifeq            804
        //   799: ldc             1373122420
        //   801: goto            806
        //   804: ldc             -740700055
        //   806: ldc             -2009185098
        //   808: ixor           
        //   809: lookupswitch {
        //          -639210558: 804
        //          1541903583: 836
        //          default: 1126
        //        }
        //   836: istore          4
        //   838: iload_2        
        //   839: iload_3        
        //   840: getstatic       dev/nuker/pyro/fc.1:I
        //   843: ifeq            851
        //   846: ldc             1078184227
        //   848: goto            853
        //   851: ldc             423142048
        //   853: ldc             -1266982301
        //   855: ixor           
        //   856: lookupswitch {
        //          -1388068669: 884
        //          -197612736: 851
        //          default: 1138
        //        }
        //   884: goto            888
        //   887: athrow         
        //   888: invokestatic    java/lang/Math.min:(II)I
        //   891: goto            895
        //   894: athrow         
        //   895: istore          7
        //   897: aload           5
        //   899: iload           6
        //   901: iload           7
        //   903: isub           
        //   904: putfield        dev/nuker/pyro/fam.1:I
        //   907: iload_1        
        //   908: aload_0        
        //   909: goto            913
        //   912: athrow         
        //   913: invokevirtual   dev/nuker/pyro/fam.8:()Z
        //   916: goto            920
        //   919: athrow         
        //   920: if_icmpeq       1115
        //   923: aload_0        
        //   924: getfield        dev/nuker/pyro/fam.c:Lnet/minecraft/client/Minecraft;
        //   927: getstatic       dev/nuker/pyro/fc.1:I
        //   930: ifeq            938
        //   933: ldc             1251274272
        //   935: goto            940
        //   938: ldc             -477987406
        //   940: ldc             1229779560
        //   942: ixor           
        //   943: lookupswitch {
        //          64494664: 1146
        //          1896331284: 938
        //          default: 968
        //        }
        //   968: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   971: ifnull          1051
        //   974: aload_0        
        //   975: getfield        dev/nuker/pyro/fam.c:Lnet/minecraft/client/Minecraft;
        //   978: getfield        net/minecraft/client/Minecraft.field_71438_f:Lnet/minecraft/client/renderer/RenderGlobal;
        //   981: ifnull          989
        //   984: ldc             -1269008562
        //   986: goto            991
        //   989: ldc             -1269008561
        //   991: ldc             189788498
        //   993: ixor           
        //   994: tableswitch {
        //          2116488248: 1016
        //          2116488249: 1051
        //          default: 984
        //        }
        //  1016: aload_0        
        //  1017: getfield        dev/nuker/pyro/fam.c:Lnet/minecraft/client/Minecraft;
        //  1020: new             Ldev/nuker/pyro/fal;
        //  1023: dup            
        //  1024: aload_0        
        //  1025: goto            1029
        //  1028: athrow         
        //  1029: invokespecial   dev/nuker/pyro/fal.<init>:(Ldev/nuker/pyro/fam;)V
        //  1032: goto            1036
        //  1035: athrow         
        //  1036: checkcast       Ljava/lang/Runnable;
        //  1039: goto            1043
        //  1042: athrow         
        //  1043: invokevirtual   net/minecraft/client/Minecraft.func_152344_a:(Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
        //  1046: goto            1050
        //  1049: athrow         
        //  1050: pop            
        //  1051: aload_0        
        //  1052: goto            1056
        //  1055: athrow         
        //  1056: invokevirtual   dev/nuker/pyro/fam.8:()Z
        //  1059: goto            1063
        //  1062: athrow         
        //  1063: ifne            1070
        //  1066: iconst_1       
        //  1067: goto            1071
        //  1070: iconst_0       
        //  1071: getstatic       dev/nuker/pyro/fc.0:I
        //  1074: ifeq            1082
        //  1077: ldc             1514395710
        //  1079: goto            1084
        //  1082: ldc             1998949916
        //  1084: ldc             -571128453
        //  1086: ixor           
        //  1087: lookupswitch {
        //          -2018075323: 1082
        //          -1429157017: 1112
        //          default: 1130
        //        }
        //  1112: putstatic       net/minecraftforge/common/ForgeModContainer.forgeLightPipelineEnabled:Z
        //  1115: return         
        //  1116: aconst_null    
        //  1117: athrow         
        //  1118: aconst_null    
        //  1119: athrow         
        //  1120: aconst_null    
        //  1121: athrow         
        //  1122: aconst_null    
        //  1123: athrow         
        //  1124: aconst_null    
        //  1125: athrow         
        //  1126: aconst_null    
        //  1127: athrow         
        //  1128: aconst_null    
        //  1129: athrow         
        //  1130: aconst_null    
        //  1131: athrow         
        //  1132: aconst_null    
        //  1133: athrow         
        //  1134: aconst_null    
        //  1135: athrow         
        //  1136: aconst_null    
        //  1137: athrow         
        //  1138: aconst_null    
        //  1139: athrow         
        //  1140: aconst_null    
        //  1141: athrow         
        //  1142: aconst_null    
        //  1143: athrow         
        //  1144: aconst_null    
        //  1145: athrow         
        //  1146: aconst_null    
        //  1147: athrow         
        //  1148: aconst_null    
        //  1149: athrow         
        //  1150: aconst_null    
        //  1151: athrow         
        //  1152: pop            
        //  1153: goto            24
        //  1156: pop            
        //  1157: aconst_null    
        //  1158: goto            1152
        //  1161: dup            
        //  1162: ifnull          1152
        //  1165: checkcast       Ljava/lang/Throwable;
        //  1168: athrow         
        //  1169: dup            
        //  1170: ifnull          1156
        //  1173: checkcast       Ljava/lang/Throwable;
        //  1176: athrow         
        //  1177: aconst_null    
        //  1178: athrow         
        //    StackMapTable: 00 8B 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FC 00 03 07 00 03 43 07 00 25 40 07 00 03 45 07 00 25 40 01 FF 00 08 00 02 07 00 03 01 00 01 07 00 25 FF 00 00 00 02 07 00 03 01 00 02 01 07 00 03 45 07 00 25 FF 00 00 00 02 07 00 03 01 00 02 01 01 02 04 41 01 18 FF 00 0C 00 02 07 00 03 01 00 02 07 00 03 07 00 03 FF 00 01 00 02 07 00 03 01 00 03 07 00 03 07 00 03 01 FF 00 1C 00 02 07 00 03 01 00 02 07 00 03 07 00 03 FF 00 0D 00 02 07 00 03 01 00 02 07 00 03 01 FF 00 01 00 02 07 00 03 01 00 03 07 00 03 01 01 FF 00 1B 00 02 07 00 03 01 00 02 07 00 03 01 43 07 00 25 FF 00 00 00 02 07 00 03 01 00 03 07 00 03 01 07 00 03 45 07 00 25 FF 00 00 00 02 07 00 03 01 00 03 07 00 03 01 01 FF 00 13 00 04 07 00 03 01 01 01 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 01 01 01 00 03 07 00 03 01 01 FF 00 1D 00 04 07 00 03 01 01 01 00 02 07 00 03 01 FF 00 12 00 07 07 00 03 01 01 01 01 07 00 03 01 00 01 01 FF 00 01 00 07 07 00 03 01 01 01 01 07 00 03 01 00 02 01 01 5E 01 FF 00 0B 00 07 07 00 03 01 01 01 01 07 00 03 01 00 02 01 01 FF 00 01 00 07 07 00 03 01 01 01 01 07 00 03 01 00 03 01 01 01 FF 00 1D 00 07 07 00 03 01 01 01 01 07 00 03 01 00 02 01 01 42 07 00 25 FF 00 00 00 07 07 00 03 01 01 01 01 07 00 03 01 00 02 01 01 45 07 00 25 40 01 FF 00 0E 00 02 07 00 03 01 00 00 4E 01 FF 00 01 00 02 07 00 03 01 00 02 01 01 5C 01 FF 00 0B 00 02 07 00 03 01 00 02 01 07 00 03 FF 00 01 00 02 07 00 03 01 00 03 01 07 00 03 01 FF 00 1D 00 02 07 00 03 01 00 02 01 07 00 03 42 07 00 25 FF 00 00 00 02 07 00 03 01 00 02 01 07 00 03 45 07 00 25 FF 00 00 00 02 07 00 03 01 00 02 01 01 0D 41 01 1C FF 00 0C 00 02 07 00 03 01 00 02 07 00 03 07 00 03 FF 00 01 00 02 07 00 03 01 00 03 07 00 03 07 00 03 01 FF 00 1C 00 02 07 00 03 01 00 02 07 00 03 07 00 03 FF 00 0D 00 02 07 00 03 01 00 02 07 00 03 01 FF 00 01 00 02 07 00 03 01 00 03 07 00 03 01 01 FF 00 1B 00 02 07 00 03 01 00 02 07 00 03 01 FF 00 0F 00 02 07 00 03 01 00 04 07 00 03 01 01 07 00 03 FF 00 01 00 02 07 00 03 01 00 05 07 00 03 01 01 07 00 03 01 FF 00 1D 00 02 07 00 03 01 00 04 07 00 03 01 01 07 00 03 42 07 00 25 FF 00 00 00 02 07 00 03 01 00 04 07 00 03 01 01 07 00 03 45 07 00 25 FF 00 00 00 02 07 00 03 01 00 04 07 00 03 01 01 01 FF 00 0B 00 02 07 00 03 01 00 03 07 00 03 01 01 FF 00 01 00 02 07 00 03 01 00 04 07 00 03 01 01 01 FF 00 1E 00 02 07 00 03 01 00 03 07 00 03 01 01 FF 00 0D 00 03 07 00 03 01 01 00 03 07 00 03 01 01 FF 00 01 00 03 07 00 03 01 01 00 04 07 00 03 01 01 01 FF 00 1B 00 03 07 00 03 01 01 00 03 07 00 03 01 01 FF 00 0B 00 04 07 00 03 01 01 01 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 01 01 01 00 03 07 00 03 01 01 FF 00 1D 00 04 07 00 03 01 01 01 00 02 07 00 03 01 FF 00 0F 00 07 07 00 03 01 01 01 00 07 00 03 01 00 01 01 FF 00 01 00 07 07 00 03 01 01 01 00 07 00 03 01 00 02 01 01 5D 01 FF 00 0E 00 07 07 00 03 01 01 01 01 07 00 03 01 00 02 01 01 FF 00 01 00 07 07 00 03 01 01 01 01 07 00 03 01 00 03 01 01 01 FF 00 1E 00 07 07 00 03 01 01 01 01 07 00 03 01 00 02 01 01 42 07 00 1F FF 00 00 00 07 07 00 03 01 01 01 01 07 00 03 01 00 02 01 01 45 07 00 25 40 01 FF 00 0B 00 02 07 00 03 01 00 00 44 07 00 25 FF 00 00 00 02 07 00 03 01 00 02 01 07 00 03 45 07 00 25 FF 00 00 00 02 07 00 03 01 00 02 01 01 51 07 00 D6 FF 00 01 00 02 07 00 03 01 00 02 07 00 D6 01 5B 07 00 D6 0F 04 41 01 18 4B 07 00 25 FF 00 00 00 02 07 00 03 01 00 04 07 00 D6 08 03 FC 08 03 FC 07 00 03 45 07 00 25 FF 00 00 00 02 07 00 03 01 00 02 07 00 D6 07 00 E3 FF 00 05 00 00 00 01 07 00 25 FF 00 00 00 02 07 00 03 01 00 02 07 00 D6 07 00 E9 45 07 00 25 40 07 00 F8 00 43 07 00 8A 40 07 00 03 45 07 00 25 40 01 06 40 01 4A 01 FF 00 01 00 02 07 00 03 01 00 02 01 01 5B 01 02 40 01 FF 00 01 00 02 07 00 03 01 00 04 07 00 03 01 01 07 00 03 FF 00 01 00 02 07 00 03 01 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 03 01 F9 00 01 FF 00 01 00 07 07 00 03 01 01 01 00 07 00 03 01 00 01 01 FF 00 01 00 03 07 00 03 01 01 00 03 07 00 03 01 01 FF 00 01 00 02 07 00 03 01 00 01 01 FF 00 01 00 02 07 00 03 01 00 02 07 00 03 07 00 03 FF 00 01 00 02 07 00 03 01 00 02 01 07 00 03 FF 00 01 00 02 07 00 03 01 00 03 07 00 03 01 01 FF 00 01 00 07 07 00 03 01 01 01 01 07 00 03 01 00 02 01 01 FF 00 01 00 02 07 00 03 01 00 02 07 00 03 07 00 03 FF 00 01 00 07 07 00 03 01 01 01 01 07 00 03 01 00 01 01 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 03 01 FF 00 01 00 02 07 00 03 01 00 01 07 00 D6 FF 00 01 00 07 07 00 03 01 01 01 01 07 00 03 01 00 02 01 01 FF 00 01 00 02 07 00 03 01 00 02 07 00 03 01 FF 00 01 00 01 07 00 03 00 01 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1161   1169   Any
        //  1161   1169   1161   1169   Ljava/lang/NumberFormatException;
        //  1177   1179   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  28     35     35     36     Any
        //  28     35     28     29     Ljava/lang/EnumConstantNotPresentException;
        //  29     35     3      8      Any
        //  28     35     28     29     Ljava/lang/NegativeArraySizeException;
        //  29     35     28     29     Any
        //  45     52     52     53     Any
        //  45     52     45     46     Any
        //  45     52     52     53     Any
        //  45     52     45     46     Ljava/lang/StringIndexOutOfBoundsException;
        //  46     52     52     53     Any
        //  180    187    187    188    Any
        //  181    187    180    181    Any
        //  181    187    187    188    Any
        //  181    187    3      8      Any
        //  181    187    180    181    Any
        //  339    346    346    347    Any
        //  339    346    339    340    Any
        //  339    346    339    340    Ljava/lang/NumberFormatException;
        //  339    346    3      8      Any
        //  339    346    339    340    Ljava/lang/EnumConstantNotPresentException;
        //  455    462    462    463    Any
        //  456    462    462    463    Ljava/lang/ArithmeticException;
        //  456    462    462    463    Ljava/lang/IllegalStateException;
        //  455    462    455    456    Any
        //  456    462    462    463    Any
        //  647    654    654    655    Any
        //  648    654    647    648    Ljava/lang/NumberFormatException;
        //  648    654    647    648    Any
        //  648    654    654    655    Any
        //  647    654    3      8      Ljava/lang/AssertionError;
        //  887    894    894    895    Any
        //  888    894    894    895    Ljava/lang/NullPointerException;
        //  888    894    887    888    Ljava/lang/ArithmeticException;
        //  887    894    894    895    Any
        //  887    894    3      8      Any
        //  912    919    919    920    Any
        //  912    919    912    913    Ljava/lang/NegativeArraySizeException;
        //  913    919    912    913    Any
        //  912    919    3      8      Ljava/lang/NegativeArraySizeException;
        //  913    919    919    920    Any
        //  1028   1035   1035   1036   Any
        //  1029   1035   1035   1036   Any
        //  1029   1035   1028   1029   Any
        //  1029   1035   1035   1036   Any
        //  1029   1035   1035   1036   Ljava/lang/ClassCastException;
        //  1043   1049   1049   1050   Any
        //  1043   1049   1049   1050   Ljava/lang/ClassCastException;
        //  1043   1049   1049   1050   Ljava/lang/RuntimeException;
        //  1043   1049   1049   1050   Ljava/lang/IllegalStateException;
        //  1043   1049   1049   1050   Ljava/lang/StringIndexOutOfBoundsException;
        //  1055   1062   1062   1063   Any
        //  1056   1062   3      8      Ljava/lang/IllegalStateException;
        //  1055   1062   3      8      Any
        //  1056   1062   3      8      Ljava/lang/IllegalStateException;
        //  1055   1062   1055   1056   Ljava/lang/NumberFormatException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:600)
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
    public void c(final boolean b, @Nullable final EntityPlayerSP entityPlayerSP, @Nullable final World world) {
        fbS.5X(this, 1472826009, b, entityPlayerSP, world);
    }
    
    @NotNull
    public f0h c() {
        return fbS.97(this, 45105394);
    }
    
    public int 4() {
        return fbS.bj(this, 353633865);
    }
    
    public void 3(final int n) {
        fbS.6v(this, 1457567346, n);
    }
    
    @NotNull
    public f0g b() {
        return fbS.8L(this, 1201811479);
    }
    
    public int 0() {
        return fbS.bA(this, 1573997939);
    }
    
    public boolean 8() {
        return fbS.eN(this, 1702000258);
    }
    
    @NotNull
    public f0a 5() {
        return fbS.09(this, 1764606767);
    }
    
    public static Minecraft c(final fam fam) {
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
                            return fam.c;
                            return fam.c;
                        }
                        catch (ArrayIndexOutOfBoundsException ex) {
                            if (ex != null) {
                                throw ex;
                            }
                            return fam.c;
                        }
                    }
                    continue Label_0038;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public static void c(final fam fam, final Minecraft c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0039:
            while (true) {
                do {
                    Label_0026: {
                        break Label_0026;
                        try {
                            o = null;
                            if (fc.1 <= 0) {
                                null;
                                goto Label_0031;
                            }
                            continue Label_0039;
                            fam.c = c;
                            return;
                        }
                        catch (IllegalArgumentException ex) {}
                    }
                    continue Label_0039;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    @NotNull
    public f0a 6() {
        return fbS.I(this, 394140006);
    }
    
    public void 2() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1711
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1703
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1695
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/io/File;
        //    27: dup            
        //    28: ldc_w           "\u296e\u148a\u807d\ub196\uc4da\ue760\ub236\uec43\udb31\ue4d9\uadba\u1e40\ueb69\uc7e4\u8c6a\u83f0\u57ea\u7d8d\ubf6e\ucd55\u2182"
        //    31: goto            35
        //    34: athrow         
        //    35: invokestatic    invokestatic   !!! ERROR
        //    38: goto            42
        //    41: athrow         
        //    42: goto            46
        //    45: athrow         
        //    46: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    49: goto            53
        //    52: athrow         
        //    53: getstatic       dev/nuker/pyro/fc.c:I
        //    56: ifge            65
        //    59: ldc_w           -2088094503
        //    62: goto            68
        //    65: ldc_w           -2053655005
        //    68: ldc_w           -775271617
        //    71: ixor           
        //    72: lookupswitch {
        //          1379958758: 65
        //          1415445788: 100
        //          default: 1676
        //        }
        //   100: goto            104
        //   103: athrow         
        //   104: invokevirtual   java/io/File.exists:()Z
        //   107: goto            111
        //   110: athrow         
        //   111: ifeq            342
        //   114: nop            
        //   115: new             Ljava/io/FileReader;
        //   118: dup            
        //   119: ldc_w           "\u296e\u148a\u807d\ub196\uc4da\ue760\ub236\uec43\udb31\ue4d9\uadba\u1e40\ueb69\uc7e4\u8c6a\u83f0\u57ea\u7d8d\ubf6e\ucd55\u2182"
        //   122: goto            126
        //   125: athrow         
        //   126: invokestatic    invokestatic   !!! ERROR
        //   129: goto            133
        //   132: athrow         
        //   133: goto            137
        //   136: athrow         
        //   137: invokespecial   java/io/FileReader.<init>:(Ljava/lang/String;)V
        //   140: goto            144
        //   143: athrow         
        //   144: astore_1       
        //   145: aload_0        
        //   146: getstatic       dev/nuker/pyro/fc.1:I
        //   149: ifeq            158
        //   152: ldc_w           -487108945
        //   155: goto            161
        //   158: ldc_w           259314575
        //   161: ldc_w           -1402129442
        //   164: ixor           
        //   165: lookupswitch {
        //          -1558585263: 192
        //          1318747505: 158
        //          default: 1682
        //        }
        //   192: getstatic       dev/nuker/pyro/Pyro.GSON:Lcom/google/gson/Gson;
        //   195: getstatic       dev/nuker/pyro/fc.0:I
        //   198: ifeq            207
        //   201: ldc_w           300781253
        //   204: goto            210
        //   207: ldc_w           1990841320
        //   210: ldc_w           982268434
        //   213: ixor           
        //   214: lookupswitch {
        //          727823575: 207
        //          1277553146: 240
        //          default: 1652
        //        }
        //   240: aload_1        
        //   241: checkcast       Ljava/io/Reader;
        //   244: ldc             Ldev/nuker/pyro/fak;.class
        //   246: goto            250
        //   249: athrow         
        //   250: invokevirtual   com/google/gson/Gson.fromJson:(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;
        //   253: goto            257
        //   256: athrow         
        //   257: dup            
        //   258: pop            
        //   259: checkcast       Ldev/nuker/pyro/fak;
        //   262: putfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/fak;
        //   265: aload_1        
        //   266: getstatic       dev/nuker/pyro/fc.c:I
        //   269: ifge            278
        //   272: ldc_w           -2117656550
        //   275: goto            281
        //   278: ldc_w           -964780630
        //   281: ldc_w           -844580536
        //   284: ixor           
        //   285: lookupswitch {
        //          -793808583: 278
        //          1282382162: 1644
        //          default: 312
        //        }
        //   312: goto            316
        //   315: athrow         
        //   316: invokevirtual   java/io/FileReader.close:()V
        //   319: goto            323
        //   322: athrow         
        //   323: goto            1643
        //   326: astore_1       
        //   327: aload_1        
        //   328: goto            332
        //   331: athrow         
        //   332: invokevirtual   java/io/IOException.printStackTrace:()V
        //   335: goto            339
        //   338: athrow         
        //   339: goto            1643
        //   342: aload_0        
        //   343: new             Ldev/nuker/pyro/fak;
        //   346: dup            
        //   347: getstatic       dev/nuker/pyro/fc.0:I
        //   350: ifeq            359
        //   353: ldc_w           1193127989
        //   356: goto            362
        //   359: ldc_w           -1370820178
        //   362: ldc_w           433526515
        //   365: ixor           
        //   366: lookupswitch {
        //          -1214388387: 392
        //          1590339270: 359
        //          default: 1678
        //        }
        //   392: goto            396
        //   395: athrow         
        //   396: invokespecial   dev/nuker/pyro/fak.<init>:()V
        //   399: goto            403
        //   402: athrow         
        //   403: putfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/fak;
        //   406: aload_0        
        //   407: getfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/fak;
        //   410: dup            
        //   411: ifnonnull       486
        //   414: ldc_w           "\u296d\u1487\u8060\ub18b\uc494\ue77f\ub221"
        //   417: getstatic       dev/nuker/pyro/fc.c:I
        //   420: ifge            429
        //   423: ldc_w           447893371
        //   426: goto            432
        //   429: ldc_w           -46861699
        //   432: ldc_w           1186467304
        //   435: ixor           
        //   436: lookupswitch {
        //          1376957403: 429
        //          1544176275: 1664
        //          default: 464
        //        }
        //   464: goto            468
        //   467: athrow         
        //   468: invokestatic    invokestatic   !!! ERROR
        //   471: goto            475
        //   474: athrow         
        //   475: goto            479
        //   478: athrow         
        //   479: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   482: goto            486
        //   485: athrow         
        //   486: bipush          32
        //   488: anewarray       Lnet/minecraft/block/Block;
        //   491: dup            
        //   492: iconst_0       
        //   493: getstatic       net/minecraft/init/Blocks.field_150482_ag:Lnet/minecraft/block/Block;
        //   496: aastore        
        //   497: dup            
        //   498: iconst_1       
        //   499: getstatic       dev/nuker/pyro/fc.0:I
        //   502: ifeq            511
        //   505: ldc_w           926373580
        //   508: goto            514
        //   511: ldc_w           383015635
        //   514: ldc_w           -242758652
        //   517: ixor           
        //   518: lookupswitch {
        //          -961504568: 1660
        //          -929939145: 511
        //          default: 544
        //        }
        //   544: getstatic       net/minecraft/init/Blocks.field_150412_bA:Lnet/minecraft/block/Block;
        //   547: aastore        
        //   548: dup            
        //   549: iconst_2       
        //   550: getstatic       net/minecraft/init/Blocks.field_150366_p:Lnet/minecraft/block/Block;
        //   553: aastore        
        //   554: dup            
        //   555: iconst_3       
        //   556: getstatic       net/minecraft/init/Blocks.field_150352_o:Lnet/minecraft/block/Block;
        //   559: aastore        
        //   560: dup            
        //   561: iconst_4       
        //   562: getstatic       net/minecraft/init/Blocks.field_150365_q:Lnet/minecraft/block/Block;
        //   565: aastore        
        //   566: dup            
        //   567: iconst_5       
        //   568: getstatic       net/minecraft/init/Blocks.field_150450_ax:Lnet/minecraft/block/Block;
        //   571: aastore        
        //   572: dup            
        //   573: bipush          6
        //   575: getstatic       dev/nuker/pyro/fc.1:I
        //   578: ifeq            587
        //   581: ldc_w           -2062419935
        //   584: goto            590
        //   587: ldc_w           2044994779
        //   590: ldc_w           1397421203
        //   593: ixor           
        //   594: lookupswitch {
        //          -1319423943: 587
        //          -698676046: 1662
        //          default: 620
        //        }
        //   620: getstatic       net/minecraft/init/Blocks.field_150369_x:Lnet/minecraft/block/Block;
        //   623: aastore        
        //   624: dup            
        //   625: bipush          7
        //   627: getstatic       net/minecraft/init/Blocks.field_150449_bY:Lnet/minecraft/block/Block;
        //   630: aastore        
        //   631: dup            
        //   632: bipush          8
        //   634: getstatic       net/minecraft/init/Blocks.field_150439_ay:Lnet/minecraft/block/Block;
        //   637: aastore        
        //   638: dup            
        //   639: bipush          9
        //   641: getstatic       net/minecraft/init/Blocks.field_150335_W:Lnet/minecraft/block/Block;
        //   644: aastore        
        //   645: dup            
        //   646: bipush          10
        //   648: getstatic       net/minecraft/init/Blocks.field_150461_bJ:Lnet/minecraft/block/BlockBeacon;
        //   651: checkcast       Lnet/minecraft/block/Block;
        //   654: aastore        
        //   655: dup            
        //   656: bipush          11
        //   658: getstatic       net/minecraft/init/Blocks.field_150474_ac:Lnet/minecraft/block/Block;
        //   661: aastore        
        //   662: dup            
        //   663: bipush          12
        //   665: getstatic       dev/nuker/pyro/fc.1:I
        //   668: ifeq            677
        //   671: ldc_w           -763644948
        //   674: goto            680
        //   677: ldc_w           -506082448
        //   680: ldc_w           1531670194
        //   683: ixor           
        //   684: lookupswitch {
        //          -1993286306: 677
        //          -1164007998: 712
        //          default: 1670
        //        }
        //   712: getstatic       net/minecraft/init/Blocks.field_150486_ae:Lnet/minecraft/block/BlockChest;
        //   715: checkcast       Lnet/minecraft/block/Block;
        //   718: aastore        
        //   719: dup            
        //   720: bipush          13
        //   722: getstatic       net/minecraft/init/Blocks.field_150447_bR:Lnet/minecraft/block/Block;
        //   725: aastore        
        //   726: dup            
        //   727: bipush          14
        //   729: getstatic       net/minecraft/init/Blocks.field_150460_al:Lnet/minecraft/block/Block;
        //   732: aastore        
        //   733: dup            
        //   734: bipush          15
        //   736: getstatic       net/minecraft/init/Blocks.field_150470_am:Lnet/minecraft/block/Block;
        //   739: aastore        
        //   740: dup            
        //   741: bipush          16
        //   743: getstatic       dev/nuker/pyro/fc.c:I
        //   746: ifge            755
        //   749: ldc_w           -1486179266
        //   752: goto            758
        //   755: ldc_w           506617311
        //   758: ldc_w           -168996789
        //   761: ixor           
        //   762: lookupswitch {
        //          -337703532: 788
        //          1384637557: 755
        //          default: 1658
        //        }
        //   788: getstatic       net/minecraft/init/Blocks.field_190975_dA:Lnet/minecraft/block/Block;
        //   791: aastore        
        //   792: dup            
        //   793: bipush          17
        //   795: getstatic       net/minecraft/init/Blocks.field_190988_dw:Lnet/minecraft/block/Block;
        //   798: aastore        
        //   799: dup            
        //   800: bipush          18
        //   802: getstatic       net/minecraft/init/Blocks.field_190989_dx:Lnet/minecraft/block/Block;
        //   805: aastore        
        //   806: dup            
        //   807: bipush          19
        //   809: getstatic       net/minecraft/init/Blocks.field_190986_du:Lnet/minecraft/block/Block;
        //   812: aastore        
        //   813: dup            
        //   814: bipush          20
        //   816: getstatic       net/minecraft/init/Blocks.field_190984_ds:Lnet/minecraft/block/Block;
        //   819: aastore        
        //   820: dup            
        //   821: bipush          21
        //   823: getstatic       net/minecraft/init/Blocks.field_190990_dy:Lnet/minecraft/block/Block;
        //   826: aastore        
        //   827: dup            
        //   828: bipush          22
        //   830: getstatic       net/minecraft/init/Blocks.field_190980_do:Lnet/minecraft/block/Block;
        //   833: aastore        
        //   834: dup            
        //   835: bipush          23
        //   837: getstatic       net/minecraft/init/Blocks.field_190982_dq:Lnet/minecraft/block/Block;
        //   840: aastore        
        //   841: dup            
        //   842: bipush          24
        //   844: getstatic       net/minecraft/init/Blocks.field_190979_dn:Lnet/minecraft/block/Block;
        //   847: aastore        
        //   848: dup            
        //   849: bipush          25
        //   851: getstatic       net/minecraft/init/Blocks.field_190978_dm:Lnet/minecraft/block/Block;
        //   854: aastore        
        //   855: dup            
        //   856: bipush          26
        //   858: getstatic       net/minecraft/init/Blocks.field_190983_dr:Lnet/minecraft/block/Block;
        //   861: aastore        
        //   862: dup            
        //   863: bipush          27
        //   865: getstatic       net/minecraft/init/Blocks.field_190987_dv:Lnet/minecraft/block/Block;
        //   868: aastore        
        //   869: dup            
        //   870: bipush          28
        //   872: getstatic       net/minecraft/init/Blocks.field_190991_dz:Lnet/minecraft/block/Block;
        //   875: aastore        
        //   876: dup            
        //   877: bipush          29
        //   879: getstatic       net/minecraft/init/Blocks.field_190985_dt:Lnet/minecraft/block/Block;
        //   882: aastore        
        //   883: dup            
        //   884: bipush          30
        //   886: getstatic       dev/nuker/pyro/fc.1:I
        //   889: ifeq            898
        //   892: ldc_w           -954337209
        //   895: goto            901
        //   898: ldc_w           -34555309
        //   901: ldc_w           404709768
        //   904: ixor           
        //   905: lookupswitch {
        //          -553477681: 1650
        //          -506361412: 898
        //          default: 932
        //        }
        //   932: getstatic       net/minecraft/init/Blocks.field_190977_dl:Lnet/minecraft/block/Block;
        //   935: aastore        
        //   936: dup            
        //   937: bipush          31
        //   939: getstatic       net/minecraft/init/Blocks.field_190981_dp:Lnet/minecraft/block/Block;
        //   942: aastore        
        //   943: goto            947
        //   946: athrow         
        //   947: invokestatic    kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
        //   950: goto            954
        //   953: athrow         
        //   954: checkcast       Ljava/lang/Iterable;
        //   957: astore_1       
        //   958: astore          10
        //   960: iconst_0       
        //   961: istore_2       
        //   962: aload_1        
        //   963: getstatic       dev/nuker/pyro/fc.0:I
        //   966: ifeq            975
        //   969: ldc_w           -749312201
        //   972: goto            978
        //   975: ldc_w           1638287070
        //   978: ldc_w           -2117126253
        //   981: ixor           
        //   982: lookupswitch {
        //          -529960627: 1008
        //          1385779364: 975
        //          default: 1666
        //        }
        //  1008: astore_3       
        //  1009: new             Ljava/util/ArrayList;
        //  1012: dup            
        //  1013: aload_1        
        //  1014: bipush          10
        //  1016: getstatic       dev/nuker/pyro/fc.1:I
        //  1019: ifeq            1028
        //  1022: ldc_w           2019662492
        //  1025: goto            1031
        //  1028: ldc_w           -1842244715
        //  1031: ldc_w           -1429450331
        //  1034: ixor           
        //  1035: lookupswitch {
        //          -1352390520: 1028
        //          -760362183: 1672
        //          default: 1060
        //        }
        //  1060: goto            1064
        //  1063: athrow         
        //  1064: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //  1067: goto            1071
        //  1070: athrow         
        //  1071: goto            1075
        //  1074: athrow         
        //  1075: invokespecial   java/util/ArrayList.<init>:(I)V
        //  1078: goto            1082
        //  1081: athrow         
        //  1082: checkcast       Ljava/util/Collection;
        //  1085: astore          4
        //  1087: iconst_0       
        //  1088: istore          5
        //  1090: aload_3        
        //  1091: goto            1095
        //  1094: athrow         
        //  1095: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1100: goto            1104
        //  1103: athrow         
        //  1104: getstatic       dev/nuker/pyro/fc.c:I
        //  1107: ifge            1116
        //  1110: ldc_w           2024691869
        //  1113: goto            1119
        //  1116: ldc_w           1453742898
        //  1119: ldc_w           -697026275
        //  1122: ixor           
        //  1123: lookupswitch {
        //          -2133695953: 1148
        //          -1361419904: 1116
        //          default: 1684
        //        }
        //  1148: astore          6
        //  1150: aload           6
        //  1152: goto            1156
        //  1155: athrow         
        //  1156: invokeinterface java/util/Iterator.hasNext:()Z
        //  1161: goto            1165
        //  1164: athrow         
        //  1165: ifeq            1174
        //  1168: ldc_w           1812353122
        //  1171: goto            1177
        //  1174: ldc_w           1812353125
        //  1177: ldc_w           2084626913
        //  1180: ixor           
        //  1181: tableswitch {
        //          546136838: 1204
        //          546136839: 1561
        //          default: 1168
        //        }
        //  1204: getstatic       dev/nuker/pyro/fc.0:I
        //  1207: ifeq            1216
        //  1210: ldc_w           -639815327
        //  1213: goto            1219
        //  1216: ldc_w           527020299
        //  1219: ldc_w           28446639
        //  1222: ixor           
        //  1223: lookupswitch {
        //          -663798066: 1656
        //          934461080: 1216
        //          default: 1248
        //        }
        //  1248: aload           6
        //  1250: goto            1254
        //  1253: athrow         
        //  1254: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1259: goto            1263
        //  1262: athrow         
        //  1263: getstatic       dev/nuker/pyro/fc.c:I
        //  1266: ifge            1275
        //  1269: ldc_w           1279440172
        //  1272: goto            1278
        //  1275: ldc_w           -198473821
        //  1278: ldc_w           -906054149
        //  1281: ixor           
        //  1282: lookupswitch {
        //          -2051276585: 1668
        //          1195762126: 1275
        //          default: 1308
        //        }
        //  1308: astore          7
        //  1310: aload           4
        //  1312: aload           7
        //  1314: checkcast       Lnet/minecraft/block/Block;
        //  1317: astore          8
        //  1319: astore          11
        //  1321: iconst_0       
        //  1322: getstatic       dev/nuker/pyro/fc.0:I
        //  1325: ifeq            1334
        //  1328: ldc_w           -76655711
        //  1331: goto            1337
        //  1334: ldc_w           107746087
        //  1337: ldc_w           -88629986
        //  1340: ixor           
        //  1341: lookupswitch {
        //          -52720071: 1368
        //          31051455: 1334
        //          default: 1646
        //        }
        //  1368: istore          9
        //  1370: getstatic       dev/nuker/pyro/fc.1:I
        //  1373: ifeq            1382
        //  1376: ldc_w           133823187
        //  1379: goto            1385
        //  1382: ldc_w           1745460786
        //  1385: ldc_w           -981585994
        //  1388: ixor           
        //  1389: lookupswitch {
        //          -1384664700: 1416
        //          -1031285403: 1382
        //          default: 1648
        //        }
        //  1416: getstatic       net/minecraft/block/Block.field_149771_c:Lnet/minecraft/util/registry/RegistryNamespacedDefaultedByKey;
        //  1419: aload           8
        //  1421: getstatic       dev/nuker/pyro/fc.1:I
        //  1424: ifeq            1433
        //  1427: ldc_w           -752811711
        //  1430: goto            1436
        //  1433: ldc_w           1581717521
        //  1436: ldc_w           -918423045
        //  1439: ixor           
        //  1440: lookupswitch {
        //          -1761156630: 1468
        //          442562746: 1433
        //          default: 1680
        //        }
        //  1468: goto            1472
        //  1471: athrow         
        //  1472: invokevirtual   net/minecraft/util/registry/RegistryNamespacedDefaultedByKey.func_177774_c:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1475: goto            1479
        //  1478: athrow         
        //  1479: checkcast       Lnet/minecraft/util/ResourceLocation;
        //  1482: goto            1486
        //  1485: athrow         
        //  1486: invokevirtual   net/minecraft/util/ResourceLocation.toString:()Ljava/lang/String;
        //  1489: goto            1493
        //  1492: athrow         
        //  1493: astore          12
        //  1495: aload           11
        //  1497: aload           12
        //  1499: getstatic       dev/nuker/pyro/fc.c:I
        //  1502: ifge            1511
        //  1505: ldc_w           -526303665
        //  1508: goto            1514
        //  1511: ldc_w           -509107255
        //  1514: ldc_w           760730048
        //  1517: ixor           
        //  1518: lookupswitch {
        //          -856657399: 1544
        //          -839454833: 1511
        //          default: 1654
        //        }
        //  1544: goto            1548
        //  1547: athrow         
        //  1548: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //  1553: goto            1557
        //  1556: athrow         
        //  1557: pop            
        //  1558: goto            1150
        //  1561: aload           4
        //  1563: checkcast       Ljava/util/List;
        //  1566: astore          11
        //  1568: aload           10
        //  1570: aload           11
        //  1572: checkcast       Ljava/util/Collection;
        //  1575: goto            1579
        //  1578: athrow         
        //  1579: invokestatic    kotlin/collections/CollectionsKt.toMutableList:(Ljava/util/Collection;)Ljava/util/List;
        //  1582: goto            1586
        //  1585: athrow         
        //  1586: getstatic       dev/nuker/pyro/fc.0:I
        //  1589: ifeq            1598
        //  1592: ldc_w           1202233016
        //  1595: goto            1601
        //  1598: ldc_w           -1430763118
        //  1601: ldc_w           -744434389
        //  1604: ixor           
        //  1605: lookupswitch {
        //          -1811395693: 1674
        //          1614225282: 1598
        //          default: 1632
        //        }
        //  1632: goto            1636
        //  1635: athrow         
        //  1636: invokevirtual   dev/nuker/pyro/fak.c:(Ljava/util/List;)V
        //  1639: goto            1643
        //  1642: athrow         
        //  1643: return         
        //  1644: aconst_null    
        //  1645: athrow         
        //  1646: aconst_null    
        //  1647: athrow         
        //  1648: aconst_null    
        //  1649: athrow         
        //  1650: aconst_null    
        //  1651: athrow         
        //  1652: aconst_null    
        //  1653: athrow         
        //  1654: aconst_null    
        //  1655: athrow         
        //  1656: aconst_null    
        //  1657: athrow         
        //  1658: aconst_null    
        //  1659: athrow         
        //  1660: aconst_null    
        //  1661: athrow         
        //  1662: aconst_null    
        //  1663: athrow         
        //  1664: aconst_null    
        //  1665: athrow         
        //  1666: aconst_null    
        //  1667: athrow         
        //  1668: aconst_null    
        //  1669: athrow         
        //  1670: aconst_null    
        //  1671: athrow         
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
        //  1686: pop            
        //  1687: goto            24
        //  1690: pop            
        //  1691: aconst_null    
        //  1692: goto            1686
        //  1695: dup            
        //  1696: ifnull          1686
        //  1699: checkcast       Ljava/lang/Throwable;
        //  1702: athrow         
        //  1703: dup            
        //  1704: ifnull          1690
        //  1707: checkcast       Ljava/lang/Throwable;
        //  1710: athrow         
        //  1711: aconst_null    
        //  1712: athrow         
        //    StackMapTable: 00 BD 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FC 00 03 07 00 03 49 07 00 25 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 79 45 07 00 25 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 79 42 07 00 25 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 79 45 07 00 25 40 07 01 39 4B 07 01 39 FF 00 02 00 01 07 00 03 00 02 07 01 39 01 5F 07 01 39 42 07 01 37 40 07 01 39 45 07 00 25 40 01 4D 07 00 25 FF 00 00 00 01 07 00 03 00 03 08 00 73 08 00 73 07 00 79 45 07 00 25 FF 00 00 00 01 07 00 03 00 03 08 00 73 08 00 73 07 00 79 42 07 00 17 FF 00 00 00 01 07 00 03 00 03 08 00 73 08 00 73 07 00 79 45 07 00 25 40 07 01 45 FF 00 0D 00 02 07 00 03 07 01 45 00 01 07 00 03 FF 00 02 00 02 07 00 03 07 01 45 00 02 07 00 03 01 5E 07 00 03 FF 00 0E 00 02 07 00 03 07 01 45 00 02 07 00 03 07 01 56 FF 00 02 00 02 07 00 03 07 01 45 00 03 07 00 03 07 01 56 01 FF 00 1D 00 02 07 00 03 07 01 45 00 02 07 00 03 07 01 56 48 07 00 25 FF 00 00 00 02 07 00 03 07 01 45 00 04 07 00 03 07 01 56 07 01 54 07 02 40 45 07 00 25 FF 00 00 00 02 07 00 03 07 01 45 00 02 07 00 03 07 02 42 54 07 01 45 FF 00 02 00 02 07 00 03 07 01 45 00 02 07 01 45 01 5E 07 01 45 42 07 00 8C 40 07 01 45 45 07 00 25 00 FF 00 02 00 01 07 00 03 00 01 07 01 33 FF 00 04 00 00 00 01 07 00 25 FF 00 00 00 02 07 00 03 07 01 33 00 01 07 01 33 45 07 00 25 00 FA 00 02 FF 00 10 00 01 07 00 03 00 03 07 00 03 08 01 57 08 01 57 FF 00 02 00 01 07 00 03 00 04 07 00 03 08 01 57 08 01 57 01 FF 00 1D 00 01 07 00 03 00 03 07 00 03 08 01 57 08 01 57 42 07 00 11 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 01 57 08 01 57 45 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 77 FF 00 19 00 01 07 00 03 00 02 07 00 77 07 00 79 FF 00 02 00 01 07 00 03 00 03 07 00 77 07 00 79 01 FF 00 1F 00 01 07 00 03 00 02 07 00 77 07 00 79 42 07 00 5B FF 00 00 00 01 07 00 03 00 02 07 00 77 07 00 79 45 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 77 07 00 79 42 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 77 07 00 79 45 07 00 25 40 07 00 77 FF 00 18 00 01 07 00 03 00 04 07 00 77 07 02 44 07 02 44 01 FF 00 02 00 01 07 00 03 00 05 07 00 77 07 02 44 07 02 44 01 01 FF 00 1D 00 01 07 00 03 00 04 07 00 77 07 02 44 07 02 44 01 FF 00 2A 00 01 07 00 03 00 04 07 00 77 07 02 44 07 02 44 01 FF 00 02 00 01 07 00 03 00 05 07 00 77 07 02 44 07 02 44 01 01 FF 00 1D 00 01 07 00 03 00 04 07 00 77 07 02 44 07 02 44 01 FF 00 38 00 01 07 00 03 00 04 07 00 77 07 02 44 07 02 44 01 FF 00 02 00 01 07 00 03 00 05 07 00 77 07 02 44 07 02 44 01 01 FF 00 1F 00 01 07 00 03 00 04 07 00 77 07 02 44 07 02 44 01 FF 00 2A 00 01 07 00 03 00 04 07 00 77 07 02 44 07 02 44 01 FF 00 02 00 01 07 00 03 00 05 07 00 77 07 02 44 07 02 44 01 01 FF 00 1D 00 01 07 00 03 00 04 07 00 77 07 02 44 07 02 44 01 FF 00 6D 00 01 07 00 03 00 04 07 00 77 07 02 44 07 02 44 01 FF 00 02 00 01 07 00 03 00 05 07 00 77 07 02 44 07 02 44 01 01 FF 00 1E 00 01 07 00 03 00 04 07 00 77 07 02 44 07 02 44 01 4D 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 77 07 02 44 45 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 77 07 02 34 FF 00 14 00 0B 07 00 03 07 01 E9 01 00 00 00 00 00 00 00 07 00 77 00 01 07 01 E9 FF 00 02 00 0B 07 00 03 07 01 E9 01 00 00 00 00 00 00 00 07 00 77 00 02 07 01 E9 01 5D 07 01 E9 FF 00 13 00 0B 07 00 03 07 01 E9 01 07 01 E9 00 00 00 00 00 00 07 00 77 00 04 08 03 F1 08 03 F1 07 01 E9 01 FF 00 02 00 0B 07 00 03 07 01 E9 01 07 01 E9 00 00 00 00 00 00 07 00 77 00 05 08 03 F1 08 03 F1 07 01 E9 01 01 FF 00 1C 00 0B 07 00 03 07 01 E9 01 07 01 E9 00 00 00 00 00 00 07 00 77 00 04 08 03 F1 08 03 F1 07 01 E9 01 42 07 00 1B FF 00 00 00 0B 07 00 03 07 01 E9 01 07 01 E9 00 00 00 00 00 00 07 00 77 00 04 08 03 F1 08 03 F1 07 01 E9 01 45 07 00 25 FF 00 00 00 0B 07 00 03 07 01 E9 01 07 01 E9 00 00 00 00 00 00 07 00 77 00 03 08 03 F1 08 03 F1 01 42 07 00 5B FF 00 00 00 0B 07 00 03 07 01 E9 01 07 01 E9 00 00 00 00 00 00 07 00 77 00 03 08 03 F1 08 03 F1 01 45 07 00 25 40 07 01 EE FF 00 0B 00 0B 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 00 00 00 00 07 00 77 00 01 07 01 37 40 07 01 E9 47 07 00 25 40 07 02 02 4B 07 02 02 FF 00 02 00 0B 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 00 00 00 00 07 00 77 00 02 07 02 02 01 5C 07 02 02 FF 00 01 00 0B 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 00 00 00 07 00 77 00 00 FF 00 04 00 00 00 01 07 00 25 FF 00 00 00 0B 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 00 00 00 07 00 77 00 01 07 02 02 47 07 00 25 40 01 02 05 42 01 1A 0B 42 01 1C 44 07 01 37 40 07 02 02 47 07 00 25 40 07 02 42 4B 07 02 42 FF 00 02 00 0B 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 00 00 00 07 00 77 00 02 07 02 42 01 5D 07 02 42 FF 00 19 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 07 02 42 07 00 59 00 07 00 77 07 01 F9 00 01 01 FF 00 02 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 07 02 42 07 00 59 00 07 00 77 07 01 F9 00 02 01 01 5E 01 FF 00 0D 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 07 02 42 07 00 59 01 07 00 77 07 01 F9 00 00 42 01 1E FF 00 10 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 07 02 42 07 00 59 01 07 00 77 07 01 F9 00 02 07 02 21 07 00 59 FF 00 02 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 07 02 42 07 00 59 01 07 00 77 07 01 F9 00 03 07 02 21 07 00 59 01 FF 00 1F 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 07 02 42 07 00 59 01 07 00 77 07 01 F9 00 02 07 02 21 07 00 59 42 07 00 25 FF 00 00 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 07 02 42 07 00 59 01 07 00 77 07 01 F9 00 02 07 02 21 07 00 59 45 07 00 25 40 07 02 42 45 07 00 5B 40 07 02 27 45 07 00 25 40 07 00 79 FF 00 11 00 0D 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 07 02 42 07 00 59 01 07 00 77 07 01 F9 07 00 79 00 02 07 01 F9 07 00 79 FF 00 02 00 0D 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 07 02 42 07 00 59 01 07 00 77 07 01 F9 07 00 79 00 03 07 01 F9 07 00 79 01 FF 00 1D 00 0D 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 07 02 42 07 00 59 01 07 00 77 07 01 F9 07 00 79 00 02 07 01 F9 07 00 79 42 07 00 8A FF 00 00 00 0D 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 07 02 42 07 00 59 01 07 00 77 07 01 F9 07 00 79 00 02 07 01 F9 07 00 79 47 07 00 25 40 01 FF 00 03 00 0B 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 00 00 00 07 00 77 00 00 FF 00 10 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 00 00 00 07 00 77 07 02 34 00 01 07 00 25 FF 00 00 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 00 00 00 07 00 77 07 02 34 00 02 07 00 77 07 01 F9 45 07 00 25 FF 00 00 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 00 00 00 07 00 77 07 02 34 00 02 07 00 77 07 02 34 FF 00 0B 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 00 00 00 07 00 77 07 02 34 00 02 07 00 77 07 02 34 FF 00 02 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 00 00 00 07 00 77 07 02 34 00 03 07 00 77 07 02 34 01 FF 00 1E 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 00 00 00 07 00 77 07 02 34 00 02 07 00 77 07 02 34 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 00 00 00 07 00 77 07 02 34 00 02 07 00 77 07 02 34 45 07 00 25 FF 00 00 00 02 07 00 03 07 02 42 00 00 FF 00 00 00 02 07 00 03 07 01 45 00 01 07 01 45 FF 00 01 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 07 02 42 07 00 59 00 07 00 77 07 01 F9 00 01 01 FF 00 01 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 07 02 42 07 00 59 01 07 00 77 07 01 F9 00 00 FF 00 01 00 01 07 00 03 00 04 07 00 77 07 02 44 07 02 44 01 FF 00 01 00 02 07 00 03 07 01 45 00 02 07 00 03 07 01 56 FF 00 01 00 0D 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 07 02 42 07 00 59 01 07 00 77 07 01 F9 07 00 79 00 02 07 01 F9 07 00 79 FF 00 01 00 0B 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 00 00 00 07 00 77 00 00 FF 00 01 00 01 07 00 03 00 04 07 00 77 07 02 44 07 02 44 01 FF 00 01 00 01 07 00 03 00 04 07 00 77 07 02 44 07 02 44 01 FF 00 01 00 01 07 00 03 00 04 07 00 77 07 02 44 07 02 44 01 FF 00 01 00 01 07 00 03 00 02 07 00 77 07 00 79 FF 00 01 00 0B 07 00 03 07 01 E9 01 00 00 00 00 00 00 00 07 00 77 00 01 07 01 E9 FF 00 01 00 0B 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 00 00 00 07 00 77 00 01 07 02 42 FF 00 01 00 01 07 00 03 00 04 07 00 77 07 02 44 07 02 44 01 FF 00 01 00 0B 07 00 03 07 01 E9 01 07 01 E9 00 00 00 00 00 00 07 00 77 00 04 08 03 F1 08 03 F1 07 01 E9 01 FF 00 01 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 00 00 00 07 00 77 07 02 34 00 02 07 00 77 07 02 34 FF 00 01 00 01 07 00 03 00 01 07 01 39 FF 00 01 00 01 07 00 03 00 03 07 00 03 08 01 57 08 01 57 FF 00 01 00 0C 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 07 02 02 07 02 42 07 00 59 01 07 00 77 07 01 F9 00 02 07 02 21 07 00 59 FF 00 01 00 02 07 00 03 07 01 45 00 01 07 00 03 FF 00 01 00 0B 07 00 03 07 01 E9 01 07 01 E9 07 01 F9 01 00 00 00 00 07 00 77 00 01 07 02 02 FF 00 01 00 01 07 00 03 00 01 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  114    323    326    342    Ljava/io/IOException;
        //  8      20     1695   1703   Any
        //  1695   1703   1695   1703   Ljava/lang/IllegalStateException;
        //  1711   1713   3      8      Any
        //  34     41     41     42     Any
        //  35     41     41     42     Ljava/lang/IllegalStateException;
        //  35     41     41     42     Any
        //  35     41     34     35     Any
        //  35     41     3      8      Any
        //  45     52     52     53     Any
        //  46     52     45     46     Any
        //  45     52     3      8      Any
        //  45     52     3      8      Any
        //  46     52     52     53     Ljava/lang/NegativeArraySizeException;
        //  103    110    110    111    Any
        //  103    110    3      8      Ljava/util/ConcurrentModificationException;
        //  103    110    103    104    Ljava/lang/IndexOutOfBoundsException;
        //  104    110    110    111    Any
        //  103    110    110    111    Any
        //  125    132    132    133    Any
        //  125    132    125    126    Any
        //  125    132    3      8      Any
        //  126    132    125    126    Ljava/util/NoSuchElementException;
        //  126    132    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  136    143    143    144    Any
        //  137    143    143    144    Ljava/lang/RuntimeException;
        //  136    143    3      8      Any
        //  137    143    136    137    Ljava/lang/ClassCastException;
        //  136    143    143    144    Ljava/lang/ClassCastException;
        //  249    256    256    257    Any
        //  249    256    3      8      Ljava/lang/ArithmeticException;
        //  250    256    256    257    Ljava/lang/EnumConstantNotPresentException;
        //  249    256    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  250    256    249    250    Any
        //  315    322    322    323    Any
        //  315    322    322    323    Any
        //  315    322    3      8      Any
        //  315    322    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  316    322    315    316    Ljava/lang/AssertionError;
        //  332    338    338    339    Any
        //  332    338    3      8      Any
        //  332    338    3      8      Any
        //  332    338    338    339    Ljava/lang/AssertionError;
        //  332    338    338    339    Any
        //  395    402    402    403    Any
        //  395    402    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  395    402    402    403    Ljava/util/ConcurrentModificationException;
        //  396    402    395    396    Ljava/lang/NullPointerException;
        //  396    402    3      8      Ljava/lang/NegativeArraySizeException;
        //  467    474    474    475    Any
        //  467    474    474    475    Any
        //  467    474    467    468    Ljava/lang/ArithmeticException;
        //  468    474    474    475    Any
        //  467    474    467    468    Ljava/lang/IllegalArgumentException;
        //  478    485    485    486    Any
        //  478    485    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  478    485    485    486    Any
        //  479    485    478    479    Any
        //  478    485    3      8      Any
        //  946    953    953    954    Any
        //  946    953    946    947    Any
        //  947    953    946    947    Ljava/lang/IllegalStateException;
        //  946    953    946    947    Any
        //  947    953    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1063   1070   1070   1071   Any
        //  1063   1070   1070   1071   Ljava/lang/UnsupportedOperationException;
        //  1063   1070   1070   1071   Any
        //  1063   1070   1063   1064   Ljava/lang/IllegalArgumentException;
        //  1063   1070   1070   1071   Any
        //  1074   1081   1081   1082   Any
        //  1075   1081   1081   1082   Ljava/lang/RuntimeException;
        //  1074   1081   1074   1075   Ljava/lang/StringIndexOutOfBoundsException;
        //  1074   1081   1074   1075   Ljava/lang/NullPointerException;
        //  1074   1081   1081   1082   Any
        //  1094   1103   1103   1104   Any
        //  1095   1103   1094   1095   Ljava/lang/IndexOutOfBoundsException;
        //  1094   1103   3      8      Ljava/util/ConcurrentModificationException;
        //  1095   1103   3      8      Ljava/lang/IllegalStateException;
        //  1095   1103   1103   1104   Any
        //  1156   1164   1164   1165   Any
        //  1156   1164   1164   1165   Any
        //  1156   1164   1164   1165   Any
        //  1156   1164   3      8      Any
        //  1156   1164   1164   1165   Ljava/lang/ArithmeticException;
        //  1253   1262   1262   1263   Any
        //  1254   1262   1253   1254   Ljava/lang/IndexOutOfBoundsException;
        //  1253   1262   1262   1263   Any
        //  1253   1262   1253   1254   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1253   1262   3      8      Any
        //  1471   1478   1478   1479   Any
        //  1472   1478   1471   1472   Any
        //  1472   1478   3      8      Ljava/lang/IllegalArgumentException;
        //  1471   1478   1471   1472   Any
        //  1471   1478   1478   1479   Ljava/lang/IllegalStateException;
        //  1485   1492   1492   1493   Any
        //  1485   1492   1485   1486   Ljava/lang/IllegalArgumentException;
        //  1485   1492   3      8      Ljava/lang/NullPointerException;
        //  1486   1492   3      8      Ljava/lang/NegativeArraySizeException;
        //  1486   1492   1485   1486   Ljava/util/NoSuchElementException;
        //  1547   1556   1556   1557   Any
        //  1548   1556   3      8      Any
        //  1547   1556   1547   1548   Ljava/lang/NumberFormatException;
        //  1547   1556   1556   1557   Ljava/lang/ArithmeticException;
        //  1547   1556   1556   1557   Any
        //  1578   1585   1585   1586   Any
        //  1579   1585   3      8      Any
        //  1578   1585   1578   1579   Ljava/lang/IllegalArgumentException;
        //  1578   1585   1578   1579   Ljava/lang/NumberFormatException;
        //  1579   1585   1578   1579   Any
        //  1636   1642   1642   1643   Any
        //  1636   1642   1642   1643   Any
        //  1636   1642   3      8      Ljava/lang/ArithmeticException;
        //  1636   1642   3      8      Ljava/lang/NumberFormatException;
        //  1636   1642   1642   1643   Ljava/lang/StringIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 0], but value was: 1.
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
    
    public boolean c(@NotNull final Block block) {
        return fbS.3T(this, 183660013, block);
    }
    
    public void 7() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          253
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            245
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            237
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: nop            
        //    25: new             Ljava/io/FileWriter;
        //    28: dup            
        //    29: ldc_w           "\u296e\u148a\u807d\ub193\uc4df\ue760\ub236\uec43\udb34\ue4dc\uadba\u1e40\ueb69\uc7e1\u8c6f\u83f0\u57ea\u7d8d\ubf6b\ucd50\u2182"
        //    32: goto            36
        //    35: athrow         
        //    36: invokestatic    invokestatic   !!! ERROR
        //    39: goto            43
        //    42: athrow         
        //    43: getstatic       dev/nuker/pyro/fc.1:I
        //    46: ifeq            55
        //    49: ldc_w           -602758120
        //    52: goto            58
        //    55: ldc_w           1073272340
        //    58: ldc_w           -531633958
        //    61: ixor           
        //    62: lookupswitch {
        //          1012747458: 224
        //          1626708926: 55
        //          default: 88
        //        }
        //    88: goto            92
        //    91: athrow         
        //    92: invokespecial   java/io/FileWriter.<init>:(Ljava/lang/String;)V
        //    95: goto            99
        //    98: athrow         
        //    99: astore_1       
        //   100: getstatic       dev/nuker/pyro/Pyro.GSON:Lcom/google/gson/Gson;
        //   103: aload_0        
        //   104: getstatic       dev/nuker/pyro/fc.0:I
        //   107: ifeq            116
        //   110: ldc_w           671399035
        //   113: goto            119
        //   116: ldc_w           -888738706
        //   119: ldc_w           -1965096834
        //   122: ixor           
        //   123: lookupswitch {
        //          -1562657787: 226
        //          -889331781: 116
        //          default: 148
        //        }
        //   148: getfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/fak;
        //   151: dup            
        //   152: ifnonnull       180
        //   155: ldc_w           "\u296d\u1487\u8060\ub18e\uc491\ue77f\ub221"
        //   158: goto            162
        //   161: athrow         
        //   162: invokestatic    invokestatic   !!! ERROR
        //   165: goto            169
        //   168: athrow         
        //   169: goto            173
        //   172: athrow         
        //   173: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   176: goto            180
        //   179: athrow         
        //   180: aload_1        
        //   181: checkcast       Ljava/lang/Appendable;
        //   184: goto            188
        //   187: athrow         
        //   188: invokevirtual   com/google/gson/Gson.toJson:(Ljava/lang/Object;Ljava/lang/Appendable;)V
        //   191: goto            195
        //   194: athrow         
        //   195: aload_1        
        //   196: goto            200
        //   199: athrow         
        //   200: invokevirtual   java/io/FileWriter.close:()V
        //   203: goto            207
        //   206: athrow         
        //   207: goto            223
        //   210: astore_1       
        //   211: aload_1        
        //   212: goto            216
        //   215: athrow         
        //   216: invokevirtual   java/io/IOException.printStackTrace:()V
        //   219: goto            223
        //   222: athrow         
        //   223: return         
        //   224: aconst_null    
        //   225: athrow         
        //   226: aconst_null    
        //   227: athrow         
        //   228: pop            
        //   229: goto            24
        //   232: pop            
        //   233: aconst_null    
        //   234: goto            228
        //   237: dup            
        //   238: ifnull          228
        //   241: checkcast       Ljava/lang/Throwable;
        //   244: athrow         
        //   245: dup            
        //   246: ifnull          232
        //   249: checkcast       Ljava/lang/Throwable;
        //   252: athrow         
        //   253: aconst_null    
        //   254: athrow         
        //    StackMapTable: 00 2E 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FC 00 03 07 00 03 4A 07 00 17 FF 00 00 00 01 07 00 03 00 03 08 00 19 08 00 19 07 00 79 45 07 00 25 FF 00 00 00 01 07 00 03 00 03 08 00 19 08 00 19 07 00 79 FF 00 0B 00 01 07 00 03 00 03 08 00 19 08 00 19 07 00 79 FF 00 02 00 01 07 00 03 00 04 08 00 19 08 00 19 07 00 79 01 FF 00 1D 00 01 07 00 03 00 03 08 00 19 08 00 19 07 00 79 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 01 07 00 03 00 03 08 00 19 08 00 19 07 00 79 45 07 00 25 40 07 02 4C FF 00 10 00 02 07 00 03 07 02 4C 00 02 07 01 56 07 00 03 FF 00 02 00 02 07 00 03 07 02 4C 00 03 07 01 56 07 00 03 01 FF 00 1C 00 02 07 00 03 07 02 4C 00 02 07 01 56 07 00 03 4C 07 00 25 FF 00 00 00 02 07 00 03 07 02 4C 00 03 07 01 56 07 00 77 07 00 79 45 07 00 25 FF 00 00 00 02 07 00 03 07 02 4C 00 03 07 01 56 07 00 77 07 00 79 42 07 00 25 FF 00 00 00 02 07 00 03 07 02 4C 00 03 07 01 56 07 00 77 07 00 79 45 07 00 25 FF 00 00 00 02 07 00 03 07 02 4C 00 02 07 01 56 07 00 77 46 07 00 25 FF 00 00 00 02 07 00 03 07 02 4C 00 03 07 01 56 07 00 77 07 02 59 45 07 00 25 00 43 07 00 5B 40 07 02 4C 45 07 00 25 00 FF 00 02 00 01 07 00 03 00 01 07 01 33 FF 00 04 00 02 07 00 03 07 01 33 00 01 07 00 5B 40 07 01 33 45 07 00 25 FF 00 00 00 02 07 00 03 07 02 42 00 00 FF 00 00 00 01 07 00 03 00 03 08 00 19 08 00 19 07 00 79 FF 00 01 00 02 07 00 03 07 02 4C 00 02 07 01 56 07 00 03 FF 00 01 00 01 07 00 03 00 01 07 00 5B 43 05 44 07 00 5B 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  24     91     210    223    Ljava/io/IOException;
        //  92     207    210    223    Ljava/io/IOException;
        //  8      20     237    245    Ljava/util/ConcurrentModificationException;
        //  237    245    237    245    Ljava/lang/ArithmeticException;
        //  253    255    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  35     42     42     43     Any
        //  35     42     42     43     Any
        //  35     42     35     36     Ljava/lang/ClassCastException;
        //  35     42     3      8      Any
        //  35     42     42     43     Any
        //  92     98     98     99     Any
        //  92     98     3      8      Ljava/lang/IllegalArgumentException;
        //  92     98     98     99     Any
        //  92     98     3      8      Ljava/lang/UnsupportedOperationException;
        //  92     98     3      8      Ljava/lang/ClassCastException;
        //  161    168    168    169    Any
        //  161    168    168    169    Any
        //  162    168    161    162    Ljava/lang/NumberFormatException;
        //  162    168    161    162    Any
        //  161    168    168    169    Ljava/lang/NullPointerException;
        //  172    179    179    180    Any
        //  172    179    179    180    Any
        //  173    179    172    173    Ljava/lang/RuntimeException;
        //  173    179    172    173    Any
        //  172    179    3      8      Any
        //  187    194    194    195    Any
        //  187    194    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  187    194    187    188    Any
        //  187    194    3      8      Ljava/lang/IllegalArgumentException;
        //  188    194    3      8      Any
        //  199    206    206    207    Any
        //  200    206    206    207    Any
        //  199    206    199    200    Ljava/lang/UnsupportedOperationException;
        //  200    206    3      8      Any
        //  200    206    199    200    Ljava/lang/IndexOutOfBoundsException;
        //  215    222    222    223    Any
        //  216    222    215    216    Ljava/lang/NullPointerException;
        //  216    222    222    223    Ljava/lang/IllegalArgumentException;
        //  216    222    222    223    Any
        //  216    222    215    216    Ljava/lang/IndexOutOfBoundsException;
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
    
    static {
        throw t;
    }
    
    @NotNull
    public f0g a() {
        return fbS.8Q(this, 1475682428);
    }
    
    public void c(@NotNull final fak p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: iflt            138
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            130
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_1        
        //    17: pop            
        //    18: getstatic       dev/nuker/pyro/fc.0:I
        //    21: ifeq            30
        //    24: ldc_w           -144421656
        //    27: goto            33
        //    30: ldc_w           -1151634164
        //    33: ldc_w           -337443790
        //    36: ixor           
        //    37: lookupswitch {
        //          478628058: 30
        //          1354264894: 64
        //          default: 119
        //        }
        //    64: aload_0        
        //    65: getstatic       dev/nuker/pyro/fc.c:I
        //    68: ifge            77
        //    71: ldc_w           -1983407622
        //    74: goto            80
        //    77: ldc_w           -250827691
        //    80: ldc_w           819742336
        //    83: ixor           
        //    84: lookupswitch {
        //          -1189355654: 117
        //          -622568810: 77
        //          default: 112
        //        }
        //   112: aload_1        
        //   113: putfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/fak;
        //   116: return         
        //   117: aconst_null    
        //   118: athrow         
        //   119: aconst_null    
        //   120: athrow         
        //   121: pop            
        //   122: goto            16
        //   125: pop            
        //   126: aconst_null    
        //   127: goto            121
        //   130: dup            
        //   131: ifnull          121
        //   134: checkcast       Ljava/lang/Throwable;
        //   137: athrow         
        //   138: dup            
        //   139: ifnull          125
        //   142: checkcast       Ljava/lang/Throwable;
        //   145: athrow         
        //    StackMapTable: 00 0E FF 00 0C 00 00 00 01 07 00 25 FD 00 03 07 00 03 07 00 77 0D 42 01 1E 4C 07 00 03 FF 00 02 00 02 07 00 03 07 00 77 00 02 07 00 03 01 5F 07 00 03 44 07 00 03 01 41 07 00 25 43 05 44 07 00 25 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  0      12     130    138    Any
        //  130    138    130    138    Ljava/lang/AssertionError;
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
    public void c(@NotNull final f2X p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          924
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            916
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            908
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_1        
        //    27: goto            31
        //    30: athrow         
        //    31: invokevirtual   dev/nuker/pyro/f2X.c:()Z
        //    34: goto            38
        //    37: athrow         
        //    38: ifeq            874
        //    41: goto            45
        //    44: athrow         
        //    45: invokestatic    org/lwjgl/input/Keyboard.getEventKey:()I
        //    48: goto            52
        //    51: athrow         
        //    52: istore_2       
        //    53: iload_2        
        //    54: getstatic       dev/nuker/pyro/fc.c:I
        //    57: ifge            66
        //    60: ldc_w           1119506959
        //    63: goto            69
        //    66: ldc_w           -1283715962
        //    69: ldc_w           1658337263
        //    72: ixor           
        //    73: lookupswitch {
        //          9983829: 66
        //          543319520: 893
        //          default: 100
        //        }
        //   100: aload_0        
        //   101: getstatic       dev/nuker/pyro/fc.1:I
        //   104: ifeq            113
        //   107: ldc_w           -256604817
        //   110: goto            116
        //   113: ldc_w           -762731206
        //   116: ldc_w           539523463
        //   119: ixor           
        //   120: lookupswitch {
        //          -795018008: 113
        //          -224273219: 148
        //          default: 877
        //        }
        //   148: getfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/f0h;
        //   151: goto            155
        //   154: athrow         
        //   155: invokevirtual   dev/nuker/pyro/f0h.3:()Ljava/lang/Object;
        //   158: goto            162
        //   161: athrow         
        //   162: checkcast       Ljava/lang/Number;
        //   165: goto            169
        //   168: athrow         
        //   169: invokevirtual   java/lang/Number.intValue:()I
        //   172: goto            176
        //   175: athrow         
        //   176: if_icmpne       874
        //   179: aload_0        
        //   180: getfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/fw;
        //   183: getstatic       dev/nuker/pyro/fc.1:I
        //   186: ifeq            195
        //   189: ldc_w           1504983921
        //   192: goto            198
        //   195: ldc_w           -1092026494
        //   198: ldc_w           775337578
        //   201: ixor           
        //   202: lookupswitch {
        //          -451305523: 195
        //          2005044507: 887
        //          default: 228
        //        }
        //   228: goto            232
        //   231: athrow         
        //   232: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   235: goto            239
        //   238: athrow         
        //   239: dup            
        //   240: pop            
        //   241: checkcast       Ljava/lang/Boolean;
        //   244: getstatic       dev/nuker/pyro/fc.1:I
        //   247: ifeq            256
        //   250: ldc_w           -1975945758
        //   253: goto            259
        //   256: ldc_w           -145506618
        //   259: ldc_w           1271952582
        //   262: ixor           
        //   263: lookupswitch {
        //          -1132213760: 288
        //          -1041694428: 256
        //          default: 883
        //        }
        //   288: goto            292
        //   291: athrow         
        //   292: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   295: goto            299
        //   298: athrow         
        //   299: ifeq            308
        //   302: ldc_w           816810872
        //   305: goto            311
        //   308: ldc_w           816810879
        //   311: ldc_w           1002945443
        //   314: ixor           
        //   315: tableswitch {
        //          382755254: 336
        //          382755255: 634
        //          default: 302
        //        }
        //   336: aload_0        
        //   337: getfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/f0a;
        //   340: getstatic       dev/nuker/pyro/fc.1:I
        //   343: ifeq            352
        //   346: ldc_w           2047416422
        //   349: goto            355
        //   352: ldc_w           982028425
        //   355: ldc_w           -1237043692
        //   358: ixor           
        //   359: lookupswitch {
        //          -1932745059: 384
        //          -867357070: 352
        //          default: 895
        //        }
        //   384: goto            388
        //   387: athrow         
        //   388: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   391: goto            395
        //   394: athrow         
        //   395: checkcast       Ljava/lang/Boolean;
        //   398: goto            402
        //   401: athrow         
        //   402: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   405: goto            409
        //   408: athrow         
        //   409: ifeq            558
        //   412: aload_0        
        //   413: getfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/fw;
        //   416: iconst_0       
        //   417: goto            421
        //   420: athrow         
        //   421: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   424: goto            428
        //   427: athrow         
        //   428: getstatic       dev/nuker/pyro/fc.0:I
        //   431: ifeq            440
        //   434: ldc_w           -1182113353
        //   437: goto            443
        //   440: ldc_w           1782222622
        //   443: ldc_w           1381783697
        //   446: ixor           
        //   447: lookupswitch {
        //          -1351068447: 440
        //          -338282202: 891
        //          default: 472
        //        }
        //   472: goto            476
        //   475: athrow         
        //   476: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   479: goto            483
        //   482: athrow         
        //   483: aload_0        
        //   484: getfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/f0a;
        //   487: iconst_0       
        //   488: goto            492
        //   491: athrow         
        //   492: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   495: goto            499
        //   498: athrow         
        //   499: getstatic       dev/nuker/pyro/fc.c:I
        //   502: ifge            511
        //   505: ldc_w           1106662984
        //   508: goto            514
        //   511: ldc_w           269264740
        //   514: ldc_w           -1235525609
        //   517: ixor           
        //   518: lookupswitch {
        //          -1504196749: 544
        //          -139643297: 511
        //          default: 885
        //        }
        //   544: goto            548
        //   547: athrow         
        //   548: invokevirtual   dev/nuker/pyro/f0a.c:(Ljava/lang/Object;)V
        //   551: goto            555
        //   554: athrow         
        //   555: goto            874
        //   558: getstatic       dev/nuker/pyro/fc.1:I
        //   561: ifeq            570
        //   564: ldc_w           -2110288492
        //   567: goto            573
        //   570: ldc_w           419908564
        //   573: ldc_w           1150592127
        //   576: ixor           
        //   577: lookupswitch {
        //          -962385429: 875
        //          358121547: 570
        //          default: 604
        //        }
        //   604: aload_0        
        //   605: getfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/f0a;
        //   608: iconst_1       
        //   609: goto            613
        //   612: athrow         
        //   613: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   616: goto            620
        //   619: athrow         
        //   620: goto            624
        //   623: athrow         
        //   624: invokevirtual   dev/nuker/pyro/f0a.c:(Ljava/lang/Object;)V
        //   627: goto            631
        //   630: athrow         
        //   631: goto            874
        //   634: getstatic       dev/nuker/pyro/fc.1:I
        //   637: ifeq            646
        //   640: ldc_w           188109939
        //   643: goto            649
        //   646: ldc_w           -777225460
        //   649: ldc_w           469346583
        //   652: ixor           
        //   653: lookupswitch {
        //          -900345317: 680
        //          282066276: 646
        //          default: 881
        //        }
        //   680: aload_0        
        //   681: getstatic       dev/nuker/pyro/fc.c:I
        //   684: ifge            693
        //   687: ldc_w           -1009216598
        //   690: goto            696
        //   693: ldc_w           -2020624022
        //   696: ldc_w           1037540009
        //   699: ixor           
        //   700: lookupswitch {
        //          -1168628797: 728
        //          -32569085: 693
        //          default: 889
        //        }
        //   728: getfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/fw;
        //   731: iconst_1       
        //   732: goto            736
        //   735: athrow         
        //   736: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   739: goto            743
        //   742: athrow         
        //   743: goto            747
        //   746: athrow         
        //   747: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   750: goto            754
        //   753: athrow         
        //   754: getstatic       dev/nuker/pyro/fc.c:I
        //   757: ifge            766
        //   760: ldc_w           -500326125
        //   763: goto            769
        //   766: ldc_w           -837944219
        //   769: ldc_w           -1732034742
        //   772: ixor           
        //   773: lookupswitch {
        //          1456390959: 800
        //          2062458457: 766
        //          default: 897
        //        }
        //   800: aload_0        
        //   801: getstatic       dev/nuker/pyro/fc.0:I
        //   804: ifeq            813
        //   807: ldc_w           1696135724
        //   810: goto            816
        //   813: ldc_w           1456703998
        //   816: ldc_w           1331557407
        //   819: ixor           
        //   820: lookupswitch {
        //          682267543: 813
        //          709168691: 879
        //          default: 848
        //        }
        //   848: getfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/f0a;
        //   851: iconst_1       
        //   852: goto            856
        //   855: athrow         
        //   856: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   859: goto            863
        //   862: athrow         
        //   863: goto            867
        //   866: athrow         
        //   867: invokevirtual   dev/nuker/pyro/f0a.c:(Ljava/lang/Object;)V
        //   870: goto            874
        //   873: athrow         
        //   874: return         
        //   875: aconst_null    
        //   876: athrow         
        //   877: aconst_null    
        //   878: athrow         
        //   879: aconst_null    
        //   880: athrow         
        //   881: aconst_null    
        //   882: athrow         
        //   883: aconst_null    
        //   884: athrow         
        //   885: aconst_null    
        //   886: athrow         
        //   887: aconst_null    
        //   888: athrow         
        //   889: aconst_null    
        //   890: athrow         
        //   891: aconst_null    
        //   892: athrow         
        //   893: aconst_null    
        //   894: athrow         
        //   895: aconst_null    
        //   896: athrow         
        //   897: aconst_null    
        //   898: athrow         
        //   899: pop            
        //   900: goto            24
        //   903: pop            
        //   904: aconst_null    
        //   905: goto            899
        //   908: dup            
        //   909: ifnull          899
        //   912: checkcast       Ljava/lang/Throwable;
        //   915: athrow         
        //   916: dup            
        //   917: ifnull          903
        //   920: checkcast       Ljava/lang/Throwable;
        //   923: athrow         
        //   924: aconst_null    
        //   925: athrow         
        //    StackMapTable: 00 87 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FD 00 03 07 00 03 07 02 71 FF 00 05 00 00 00 01 07 00 25 FF 00 00 00 02 07 00 03 07 02 71 00 01 07 02 71 45 07 00 25 40 01 45 07 00 25 00 45 07 00 25 40 01 FF 00 0D 00 03 07 00 03 07 02 71 01 00 01 01 FF 00 02 00 03 07 00 03 07 02 71 01 00 02 01 01 5E 01 FF 00 0C 00 03 07 00 03 07 02 71 01 00 02 01 07 00 03 FF 00 02 00 03 07 00 03 07 02 71 01 00 03 01 07 00 03 01 FF 00 1F 00 03 07 00 03 07 02 71 01 00 02 01 07 00 03 45 07 00 1F FF 00 00 00 03 07 00 03 07 02 71 01 00 02 01 07 02 82 45 07 00 25 FF 00 00 00 03 07 00 03 07 02 71 01 00 02 01 07 02 42 45 07 00 1F FF 00 00 00 03 07 00 03 07 02 71 01 00 02 01 07 02 86 45 07 00 25 FF 00 00 00 03 07 00 03 07 02 71 01 00 02 01 01 52 07 02 91 FF 00 02 00 03 07 00 03 07 02 71 01 00 02 07 02 91 01 5D 07 02 91 42 07 00 25 40 07 02 91 45 07 00 25 40 07 02 42 50 07 00 4F FF 00 02 00 03 07 00 03 07 02 71 01 00 02 07 00 4F 01 5C 07 00 4F 42 07 00 5B 40 07 00 4F 45 07 00 25 40 01 02 05 42 01 18 4F 07 02 A3 FF 00 02 00 03 07 00 03 07 02 71 01 00 02 07 02 A3 01 5C 07 02 A3 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 03 07 00 03 07 02 71 01 00 01 07 02 A3 45 07 00 25 40 07 02 42 45 07 00 8C 40 07 00 4F 45 07 00 25 40 01 4A 07 00 1F FF 00 00 00 03 07 00 03 07 02 71 01 00 02 07 02 91 01 45 07 00 25 FF 00 00 00 03 07 00 03 07 02 71 01 00 02 07 02 91 07 00 4F FF 00 0B 00 03 07 00 03 07 02 71 01 00 02 07 02 91 07 00 4F FF 00 02 00 03 07 00 03 07 02 71 01 00 03 07 02 91 07 00 4F 01 FF 00 1C 00 03 07 00 03 07 02 71 01 00 02 07 02 91 07 00 4F 42 07 00 25 FF 00 00 00 03 07 00 03 07 02 71 01 00 02 07 02 91 07 00 4F 45 07 00 25 00 47 07 00 7C FF 00 00 00 03 07 00 03 07 02 71 01 00 02 07 02 A3 01 45 07 00 25 FF 00 00 00 03 07 00 03 07 02 71 01 00 02 07 02 A3 07 00 4F FF 00 0B 00 03 07 00 03 07 02 71 01 00 02 07 02 A3 07 00 4F FF 00 02 00 03 07 00 03 07 02 71 01 00 03 07 02 A3 07 00 4F 01 FF 00 1D 00 03 07 00 03 07 02 71 01 00 02 07 02 A3 07 00 4F 42 07 01 35 FF 00 00 00 03 07 00 03 07 02 71 01 00 02 07 02 A3 07 00 4F 45 07 00 25 00 02 0B 42 01 1E 47 07 00 25 FF 00 00 00 03 07 00 03 07 02 71 01 00 02 07 02 A3 01 45 07 00 25 FF 00 00 00 03 07 00 03 07 02 71 01 00 02 07 02 A3 07 00 4F FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 03 07 00 03 07 02 71 01 00 02 07 02 A3 07 00 4F 45 07 00 25 00 02 0B 42 01 1E 4C 07 00 03 FF 00 02 00 03 07 00 03 07 02 71 01 00 02 07 00 03 01 5F 07 00 03 FF 00 06 00 00 00 01 07 00 25 FF 00 00 00 03 07 00 03 07 02 71 01 00 02 07 02 91 01 45 07 00 25 FF 00 00 00 03 07 00 03 07 02 71 01 00 02 07 02 91 07 00 4F 42 07 00 25 FF 00 00 00 03 07 00 03 07 02 71 01 00 02 07 02 91 07 00 4F 45 07 00 25 00 0B 42 01 1E 4C 07 00 03 FF 00 02 00 03 07 00 03 07 02 71 01 00 02 07 00 03 01 5F 07 00 03 FF 00 06 00 00 00 01 07 00 25 FF 00 00 00 03 07 00 03 07 02 71 01 00 02 07 02 A3 01 45 07 00 25 FF 00 00 00 03 07 00 03 07 02 71 01 00 02 07 02 A3 07 00 4F FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 03 07 00 03 07 02 71 01 00 02 07 02 A3 07 00 4F 45 07 00 25 FA 00 00 FC 00 00 01 FF 00 01 00 03 07 00 03 07 02 71 01 00 02 01 07 00 03 41 07 00 03 01 41 07 00 4F FF 00 01 00 03 07 00 03 07 02 71 01 00 02 07 02 A3 07 00 4F 41 07 02 91 41 07 00 03 FF 00 01 00 03 07 00 03 07 02 71 01 00 02 07 02 91 07 00 4F 41 01 41 07 02 A3 01 FF 00 01 00 02 07 00 03 07 02 71 00 01 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     908    916    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  908    916    908    916    Any
        //  924    926    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  31     37     37     38     Any
        //  31     37     3      8      Any
        //  31     37     3      8      Any
        //  31     37     3      8      Any
        //  31     37     37     38     Any
        //  44     51     51     52     Any
        //  45     51     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  45     51     3      8      Ljava/lang/ArithmeticException;
        //  44     51     51     52     Any
        //  44     51     44     45     Any
        //  154    161    161    162    Any
        //  155    161    3      8      Any
        //  155    161    161    162    Any
        //  154    161    161    162    Ljava/lang/IndexOutOfBoundsException;
        //  154    161    154    155    Ljava/lang/ArithmeticException;
        //  168    175    175    176    Any
        //  168    175    3      8      Any
        //  169    175    168    169    Ljava/lang/ArithmeticException;
        //  168    175    3      8      Any
        //  168    175    175    176    Any
        //  231    238    238    239    Any
        //  232    238    3      8      Any
        //  232    238    3      8      Any
        //  231    238    231    232    Any
        //  231    238    231    232    Any
        //  291    298    298    299    Any
        //  292    298    298    299    Any
        //  291    298    291    292    Ljava/lang/NegativeArraySizeException;
        //  291    298    3      8      Any
        //  292    298    291    292    Ljava/lang/EnumConstantNotPresentException;
        //  388    394    394    395    Any
        //  388    394    394    395    Any
        //  388    394    3      8      Any
        //  388    394    3      8      Ljava/lang/NumberFormatException;
        //  388    394    3      8      Any
        //  401    408    408    409    Any
        //  402    408    3      8      Any
        //  402    408    401    402    Ljava/lang/AssertionError;
        //  402    408    3      8      Any
        //  402    408    408    409    Any
        //  420    427    427    428    Any
        //  421    427    3      8      Any
        //  421    427    427    428    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  420    427    420    421    Ljava/lang/ArithmeticException;
        //  421    427    3      8      Any
        //  475    482    482    483    Any
        //  476    482    475    476    Any
        //  476    482    3      8      Ljava/lang/NullPointerException;
        //  475    482    482    483    Any
        //  475    482    3      8      Ljava/lang/NullPointerException;
        //  491    498    498    499    Any
        //  492    498    3      8      Ljava/lang/UnsupportedOperationException;
        //  492    498    491    492    Ljava/lang/EnumConstantNotPresentException;
        //  491    498    3      8      Any
        //  492    498    3      8      Ljava/lang/IllegalStateException;
        //  547    554    554    555    Any
        //  547    554    547    548    Ljava/util/ConcurrentModificationException;
        //  547    554    3      8      Ljava/lang/NullPointerException;
        //  547    554    554    555    Ljava/lang/StringIndexOutOfBoundsException;
        //  548    554    3      8      Ljava/lang/IllegalStateException;
        //  612    619    619    620    Any
        //  612    619    612    613    Ljava/lang/ClassCastException;
        //  613    619    612    613    Any
        //  612    619    3      8      Ljava/util/NoSuchElementException;
        //  613    619    3      8      Ljava/lang/NegativeArraySizeException;
        //  624    630    630    631    Any
        //  624    630    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  624    630    630    631    Ljava/lang/StringIndexOutOfBoundsException;
        //  624    630    3      8      Any
        //  624    630    630    631    Any
        //  736    742    742    743    Any
        //  736    742    3      8      Ljava/util/ConcurrentModificationException;
        //  736    742    3      8      Ljava/lang/ClassCastException;
        //  736    742    3      8      Any
        //  736    742    742    743    Ljava/lang/ClassCastException;
        //  746    753    753    754    Any
        //  746    753    746    747    Any
        //  747    753    3      8      Ljava/lang/UnsupportedOperationException;
        //  746    753    753    754    Ljava/util/ConcurrentModificationException;
        //  747    753    746    747    Any
        //  856    862    862    863    Any
        //  856    862    862    863    Any
        //  856    862    3      8      Any
        //  856    862    862    863    Ljava/lang/EnumConstantNotPresentException;
        //  856    862    862    863    Ljava/lang/StringIndexOutOfBoundsException;
        //  867    873    873    874    Any
        //  867    873    3      8      Ljava/lang/IllegalStateException;
        //  867    873    873    874    Any
        //  867    873    873    874    Ljava/lang/NumberFormatException;
        //  867    873    873    874    Any
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
    
    public fam() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifge            12
        //     6: ldc_w           1734625345
        //     9: goto            15
        //    12: ldc_w           -309665064
        //    15: ldc_w           -534103484
        //    18: ixor           
        //    19: lookupswitch {
        //          -2024902139: 12
        //          228645020: 44
        //          default: 796
        //        }
        //    44: aload_0        
        //    45: ldc_w           "\u2969\u1492\u8063\ub3d5\uc65d\ue779\ub227\uec49"
        //    48: getstatic       dev/nuker/pyro/fc.1:I
        //    51: ifeq            60
        //    54: ldc_w           1486664721
        //    57: goto            63
        //    60: ldc_w           -944852746
        //    63: ldc_w           427687226
        //    66: ixor           
        //    67: lookupswitch {
        //          -202528013: 60
        //          1105283371: 792
        //          default: 92
        //        }
        //    92: invokestatic    invokestatic   !!! ERROR
        //    95: ldc_w           "\u2949\u1492\u8063\ub3d5\uc65d\ue779\ub227\uec49"
        //    98: invokestatic    invokestatic   !!! ERROR
        //   101: ldc_w           "\u294d\u1496\u806a\ub399\uc641\ue770\ub236\uec4d\ud97d\ue621\uadb0\u1e0c\ueb71\uc5a6\u8ead\u83ef\u57b7"
        //   104: invokestatic    invokestatic   !!! ERROR
        //   107: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   110: aload_0        
        //   111: aload_0        
        //   112: new             Ldev/nuker/pyro/f0g;
        //   115: dup            
        //   116: ldc_w           "\u2971\u1483\u806e\ub3da\uc65c\ue76c\ub23d"
        //   119: invokestatic    invokestatic   !!! ERROR
        //   122: ldc_w           "\u2949\u1492\u8063\ub3d5\uc65d\ue779\ub227\uec49\ud928\ue609\uada8\u1e4d\ueb65\uc5ae\u8eb5\u83fa"
        //   125: getstatic       dev/nuker/pyro/fc.1:I
        //   128: ifeq            137
        //   131: ldc_w           -666081679
        //   134: goto            140
        //   137: ldc_w           330687062
        //   140: ldc_w           -1699345906
        //   143: ixor           
        //   144: lookupswitch {
        //          -1996232616: 172
        //          1123708031: 137
        //          default: 800
        //        }
        //   172: invokestatic    invokestatic   !!! ERROR
        //   175: ldc_w           "\u295d\u149b\u806e\ub3d7\uc652\ue77d\ub237\uec02\ud97c\ue62e\uadbd\u1e0c\ueb69\uc5b7\u8ea0\u83e0\u57ad\u7d93\ubd24\ucfda\u2180\uc23e\u6099\u2d53\ud848\u3f5b\u7d24\u832a\u8051\u8313\u8e3b\ufb3c\u7a54\u9a13\u1401\ufbfc\u4978\u82a3\uca84\uf0bd\ubc49\u41f0\ub37d\ub35b"
        //   178: getstatic       dev/nuker/pyro/fc.1:I
        //   181: ifeq            190
        //   184: ldc_w           2019731608
        //   187: goto            193
        //   190: ldc_w           -983350054
        //   193: ldc_w           1695949014
        //   196: ixor           
        //   197: lookupswitch {
        //          494176334: 780
        //          1009448965: 190
        //          default: 224
        //        }
        //   224: invokestatic    invokestatic   !!! ERROR
        //   227: sipush          128
        //   230: iconst_0       
        //   231: sipush          255
        //   234: iconst_0       
        //   235: bipush          64
        //   237: aconst_null    
        //   238: invokespecial   dev/nuker/pyro/f0g.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   241: checkcast       Ldev/nuker/pyro/f0n;
        //   244: invokevirtual   dev/nuker/pyro/fam.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   247: checkcast       Ldev/nuker/pyro/f0g;
        //   250: putfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/f0g;
        //   253: aload_0        
        //   254: aload_0        
        //   255: new             Ldev/nuker/pyro/f0g;
        //   258: dup            
        //   259: ldc_w           "\u2971\u1483\u806e\ub3da\uc65c\ue76c\ub23d\uec7a\ud97a\ue627\uada1"
        //   262: invokestatic    invokestatic   !!! ERROR
        //   265: ldc_w           "\u2946\u1481\u806e\ub3c0\uc615\ue757\ub234\uec43\ud96b\ue62f\uadac\u1e55"
        //   268: invokestatic    invokestatic   !!! ERROR
        //   271: ldc_w           "\u294d\u1492\u8062\ub3dc\uc615\ue779\ub237\uec02\ud969\ue624\uadb7\u1e5a\ueb63\uc5eb\u8ee1\u83e1\u57b1\u7d93\ubd7d\ucf95\u2182\uc237\u6096\u2d16\ud845\u3f1d\u7d2d\u8329\u8012\u8315\u8e2d\ufb72\u7a48\u9a04\u1412\ufbe0"
        //   274: invokestatic    invokestatic   !!! ERROR
        //   277: sipush          128
        //   280: iconst_0       
        //   281: sipush          255
        //   284: iconst_0       
        //   285: bipush          64
        //   287: aconst_null    
        //   288: invokespecial   dev/nuker/pyro/f0g.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   291: checkcast       Ldev/nuker/pyro/f0n;
        //   294: invokevirtual   dev/nuker/pyro/fam.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   297: checkcast       Ldev/nuker/pyro/f0g;
        //   300: getstatic       dev/nuker/pyro/fc.1:I
        //   303: ifeq            312
        //   306: ldc_w           2088410466
        //   309: goto            315
        //   312: ldc_w           -2140391714
        //   315: ldc_w           1305068680
        //   318: ixor           
        //   319: lookupswitch {
        //          -844762538: 344
        //          833837546: 312
        //          default: 786
        //        }
        //   344: putfield        dev/nuker/pyro/fam.0:Ldev/nuker/pyro/f0g;
        //   347: getstatic       dev/nuker/pyro/fc.1:I
        //   350: ifeq            359
        //   353: ldc_w           -2013900257
        //   356: goto            362
        //   359: ldc_w           591787456
        //   362: ldc_w           1265589132
        //   365: ixor           
        //   366: lookupswitch {
        //          -862385773: 798
        //          226184229: 359
        //          default: 392
        //        }
        //   392: aload_0        
        //   393: aload_0        
        //   394: new             Ldev/nuker/pyro/f0a;
        //   397: dup            
        //   398: ldc_w           "\u2966\u1481\u806e\ub3c0"
        //   401: invokestatic    invokestatic   !!! ERROR
        //   404: ldc_w           "\u2946\u1481\u806e\ub3c0"
        //   407: invokestatic    invokestatic   !!! ERROR
        //   410: ldc_w           "\u295b\u149d\u806e\ub3db\uc659\ue77d\ub237\uec02\ud950\ue634\uadb9\u1e55\ueb26\uc5b0\u8ea9\u83e6\u57aa\u7dc7\ubd2a\ucf9b\u2180\uc237\u6087\u2d57\ud847\u3f10\u7d6b\u8325\u8002\u8341\u8e3b\ufb3c\u7a51\u9a14\u141f\ufbfc\u4978"
        //   413: invokestatic    invokestatic   !!! ERROR
        //   416: iconst_0       
        //   417: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   420: checkcast       Ldev/nuker/pyro/f0n;
        //   423: getstatic       dev/nuker/pyro/fc.0:I
        //   426: ifeq            435
        //   429: ldc_w           -1650850974
        //   432: goto            438
        //   435: ldc_w           2057426783
        //   438: ldc_w           -1110119175
        //   441: ixor           
        //   442: lookupswitch {
        //          105397517: 435
        //          542044059: 782
        //          default: 468
        //        }
        //   468: invokevirtual   dev/nuker/pyro/fam.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   471: checkcast       Ldev/nuker/pyro/f0a;
        //   474: putfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/f0a;
        //   477: aload_0        
        //   478: aload_0        
        //   479: new             Ldev/nuker/pyro/f0h;
        //   482: dup            
        //   483: ldc_w           "\u2966\u1481\u806e\ub3c0\uc677\ue771\ub22a\uec46"
        //   486: getstatic       dev/nuker/pyro/fc.1:I
        //   489: ifeq            498
        //   492: ldc_w           1542240527
        //   495: goto            501
        //   498: ldc_w           -2021331000
        //   501: ldc_w           -1615437236
        //   504: ixor           
        //   505: lookupswitch {
        //          -1000678589: 498
        //          405966212: 532
        //          default: 784
        //        }
        //   532: invokestatic    invokestatic   !!! ERROR
        //   535: ldc_w           "\u2949\u1492\u8063\ub3d5\uc65d\ue779\ub227\uec49\ud928\ue604\uadb1\u1e42\ueb62"
        //   538: invokestatic    invokestatic   !!! ERROR
        //   541: ldc_w           "\u2955\u1496\u8076\ub3db\uc65c\ue776\ub220\uec02\ud97c\ue629\uadf8\u1e58\ueb69\uc5a0\u8ea6\u83ef\u57a1\u7dc7\ubd25\ucf88\u218d\uc222\u60c3\u2d16\ud857\u3f14\u7d6b\u8335\u801e\u8314\u8e7e\ufb31\u7a51\u9a18\u1453\ufbec\u496f\u82e6\ucac6\uf0a6\ubc47\u41ff\ub37a\ub340\u43e2\u8068\u7c62\uc4e7\u7d5d\ue551\uec56\u16d9\ue4c6\u378f\u4928\ueb67\u0a1b\u8c4a"
        //   544: invokestatic    invokestatic   !!! ERROR
        //   547: iconst_m1      
        //   548: invokespecial   dev/nuker/pyro/f0h.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
        //   551: checkcast       Ldev/nuker/pyro/f0n;
        //   554: invokevirtual   dev/nuker/pyro/fam.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   557: checkcast       Ldev/nuker/pyro/f0h;
        //   560: putfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/f0h;
        //   563: aload_0        
        //   564: aload_0        
        //   565: new             Ldev/nuker/pyro/f0a;
        //   568: dup            
        //   569: ldc_w           "\u296e\u1481\u806a\ub3d5\uc65a\ue779\ub220"
        //   572: invokestatic    invokestatic   !!! ERROR
        //   575: ldc_w           "\u294e\u1481\u806a\ub3d5\uc65a\ue779\ub220"
        //   578: getstatic       dev/nuker/pyro/fc.1:I
        //   581: ifeq            590
        //   584: ldc_w           764648492
        //   587: goto            593
        //   590: ldc_w           -1323540352
        //   593: ldc_w           1250153725
        //   596: ixor           
        //   597: lookupswitch {
        //          -73419651: 624
        //          1729120465: 590
        //          default: 788
        //        }
        //   624: invokestatic    invokestatic   !!! ERROR
        //   627: ldc_w           "\u294e\u1481\u806a\ub3cb\uc650\ue776\ub220\uec47\ud97a\ue666\uadbd\u1e5a\ueb63\uc5b5\u8eb8\u83f7\u57ac\u7d8e\ubd33\ucf9d\u21cc\uc23a\u609c\u2d16\ud850\u3f09\u7d2a\u8322\u8002\u8311\u8e3f\ufb20\u7a55\u9a18\u1407\ufbb9\u4934\u82f6\uca95\uf0a4\ubc47\u41ff\ub37a\ub351\u43a3\u806a\u7c29\uc4a5\u7d4f\ue550\uec06\u16d1\ue4d0\u378b\u493d\ueb2b"
        //   630: invokestatic    invokestatic   !!! ERROR
        //   633: iconst_0       
        //   634: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   637: checkcast       Ldev/nuker/pyro/f0n;
        //   640: invokevirtual   dev/nuker/pyro/fam.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   643: checkcast       Ldev/nuker/pyro/f0a;
        //   646: putfield        dev/nuker/pyro/fam.0:Ldev/nuker/pyro/f0a;
        //   649: getstatic       dev/nuker/pyro/fc.c:I
        //   652: ifge            661
        //   655: ldc_w           1236213793
        //   658: goto            664
        //   661: ldc_w           -639307350
        //   664: ldc_w           288859307
        //   667: ixor           
        //   668: lookupswitch {
        //          1116038664: 661
        //          1486390410: 794
        //          default: 696
        //        }
        //   696: aload_0        
        //   697: sipush          255
        //   700: putfield        dev/nuker/pyro/fam.1:I
        //   703: getstatic       dev/nuker/pyro/fc.1:I
        //   706: ifeq            715
        //   709: ldc_w           2117502853
        //   712: goto            718
        //   715: ldc_w           -1224025968
        //   718: ldc_w           -323389325
        //   721: ixor           
        //   722: lookupswitch {
        //          -1836056586: 715
        //          1538498787: 748
        //          default: 790
        //        }
        //   748: aload_0        
        //   749: invokevirtual   dev/nuker/pyro/fam.2:()V
        //   752: aload_0        
        //   753: getfield        dev/nuker/pyro/fam.c:Ldev/nuker/pyro/f0a;
        //   756: new             Ldev/nuker/pyro/faj;
        //   759: dup            
        //   760: aload_0        
        //   761: invokespecial   dev/nuker/pyro/faj.<init>:(Ldev/nuker/pyro/fam;)V
        //   764: checkcast       Ljava/util/function/Consumer;
        //   767: invokevirtual   dev/nuker/pyro/f0a.c:(Ljava/util/function/Consumer;)V
        //   770: invokestatic    dev/nuker/pyro/Pyro.getEventManager:()Ldev/nuker/pyro/f05;
        //   773: aload_0        
        //   774: invokeinterface dev/nuker/pyro/f05.0:(Ljava/lang/Object;)V
        //   779: return         
        //   780: aconst_null    
        //   781: athrow         
        //   782: aconst_null    
        //   783: athrow         
        //   784: aconst_null    
        //   785: athrow         
        //   786: aconst_null    
        //   787: athrow         
        //   788: aconst_null    
        //   789: athrow         
        //   790: aconst_null    
        //   791: athrow         
        //   792: aconst_null    
        //   793: athrow         
        //   794: aconst_null    
        //   795: athrow         
        //   796: aconst_null    
        //   797: athrow         
        //   798: aconst_null    
        //   799: athrow         
        //   800: aconst_null    
        //   801: athrow         
        //    StackMapTable: 00 2C 0C 42 01 1C FF 00 0F 00 01 06 00 02 06 07 00 79 FF 00 02 00 01 06 00 03 06 07 00 79 01 FF 00 1C 00 01 06 00 02 06 07 00 79 FF 00 2C 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 70 08 00 70 07 00 79 07 00 79 FF 00 02 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 70 08 00 70 07 00 79 07 00 79 01 FF 00 1F 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 70 08 00 70 07 00 79 07 00 79 FF 00 11 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 70 08 00 70 07 00 79 07 00 79 07 00 79 FF 00 02 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 70 08 00 70 07 00 79 07 00 79 07 00 79 01 FF 00 1E 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 70 08 00 70 07 00 79 07 00 79 07 00 79 FF 00 57 00 01 07 00 03 00 02 07 00 03 07 02 CD FF 00 02 00 01 07 00 03 00 03 07 00 03 07 02 CD 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 02 CD 0E 42 01 1D FF 00 2A 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 DE FF 00 02 00 01 07 00 03 00 04 07 00 03 07 00 03 07 02 DE 01 FF 00 1D 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 DE FF 00 1D 00 01 07 00 03 00 05 07 00 03 07 00 03 08 01 DF 08 01 DF 07 00 79 FF 00 02 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 DF 08 01 DF 07 00 79 01 FF 00 1E 00 01 07 00 03 00 05 07 00 03 07 00 03 08 01 DF 08 01 DF 07 00 79 FF 00 39 00 01 07 00 03 00 06 07 00 03 07 00 03 08 02 35 08 02 35 07 00 79 07 00 79 FF 00 02 00 01 07 00 03 00 07 07 00 03 07 00 03 08 02 35 08 02 35 07 00 79 07 00 79 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 02 35 08 02 35 07 00 79 07 00 79 24 42 01 1F 12 42 01 1D FF 00 1F 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 70 08 00 70 07 00 79 07 00 79 07 00 79 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 02 DE FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 01 DF 08 01 DF 07 00 79 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 02 CD FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 02 35 08 02 35 07 00 79 07 00 79 01 FF 00 01 00 01 06 00 02 06 07 00 79 FF 00 01 00 01 07 00 03 00 00 FF 00 01 00 01 06 00 00 FF 00 01 00 01 07 00 03 00 00 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 70 08 00 70 07 00 79 07 00 79
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
    
    public void c(@NotNull final Block p0, @NotNull final CallbackInfoReturnable p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          285
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            277
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            269
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            38
        //    32: ldc_w           -1366413925
        //    35: goto            41
        //    38: ldc_w           -1129927489
        //    41: ldc_w           1336587851
        //    44: ixor           
        //    45: lookupswitch {
        //          -517694512: 38
        //          -217310476: 72
        //          default: 256
        //        }
        //    72: aload_2        
        //    73: pop            
        //    74: aload_0        
        //    75: aload_1        
        //    76: goto            80
        //    79: athrow         
        //    80: invokevirtual   dev/nuker/pyro/fam.c:(Lnet/minecraft/block/Block;)Z
        //    83: goto            87
        //    86: athrow         
        //    87: ifeq            96
        //    90: ldc_w           445628250
        //    93: goto            99
        //    96: ldc_w           445628253
        //    99: ldc_w           -1970849191
        //   102: ixor           
        //   103: tableswitch {
        //          537987590: 124
        //          537987591: 253
        //          default: 90
        //        }
        //   124: aload_2        
        //   125: getstatic       dev/nuker/pyro/fc.0:I
        //   128: ifeq            137
        //   131: ldc_w           213182058
        //   134: goto            140
        //   137: ldc_w           -1756361212
        //   140: ldc_w           1465894112
        //   143: ixor           
        //   144: lookupswitch {
        //          -1072706844: 172
        //          1542136458: 137
        //          default: 254
        //        }
        //   172: goto            176
        //   175: athrow         
        //   176: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable.cancel:()V
        //   179: goto            183
        //   182: athrow         
        //   183: getstatic       dev/nuker/pyro/fc.c:I
        //   186: ifge            195
        //   189: ldc_w           -142905678
        //   192: goto            198
        //   195: ldc_w           -406828632
        //   198: ldc_w           -951519455
        //   201: ixor           
        //   202: lookupswitch {
        //          808688019: 258
        //          1169325794: 195
        //          default: 228
        //        }
        //   228: aload_2        
        //   229: bipush          15
        //   231: goto            235
        //   234: athrow         
        //   235: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   238: goto            242
        //   241: athrow         
        //   242: goto            246
        //   245: athrow         
        //   246: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable.setReturnValue:(Ljava/lang/Object;)V
        //   249: goto            253
        //   252: athrow         
        //   253: return         
        //   254: aconst_null    
        //   255: athrow         
        //   256: aconst_null    
        //   257: athrow         
        //   258: aconst_null    
        //   259: athrow         
        //   260: pop            
        //   261: goto            24
        //   264: pop            
        //   265: aconst_null    
        //   266: goto            260
        //   269: dup            
        //   270: ifnull          260
        //   273: checkcast       Ljava/lang/Throwable;
        //   276: athrow         
        //   277: dup            
        //   278: ifnull          264
        //   281: checkcast       Ljava/lang/Throwable;
        //   284: athrow         
        //   285: aconst_null    
        //   286: athrow         
        //    StackMapTable: 00 29 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FE 00 03 07 00 03 07 00 59 07 00 30 0D 42 01 1E 46 07 00 25 FF 00 00 00 03 07 00 03 07 00 59 07 00 30 00 02 07 00 03 07 00 59 45 07 00 25 40 01 02 05 42 01 18 4C 07 00 30 FF 00 02 00 03 07 00 03 07 00 59 07 00 30 00 02 07 00 30 01 5F 07 00 30 42 07 00 25 40 07 00 30 45 07 00 25 00 0B 42 01 1D 45 07 00 25 FF 00 00 00 03 07 00 03 07 00 59 07 00 30 00 02 07 00 30 01 45 07 00 25 FF 00 00 00 03 07 00 03 07 00 59 07 00 30 00 02 07 00 30 07 03 3B 42 07 00 19 FF 00 00 00 03 07 00 03 07 00 59 07 00 30 00 02 07 00 30 07 03 3B 45 07 00 25 00 40 07 00 30 01 01 41 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     269    277    Any
        //  269    277    269    277    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  285    287    3      8      Any
        //  79     86     86     87     Any
        //  79     86     79     80     Any
        //  79     86     79     80     Ljava/lang/ClassCastException;
        //  79     86     3      8      Ljava/lang/NegativeArraySizeException;
        //  79     86     79     80     Ljava/lang/IndexOutOfBoundsException;
        //  175    182    182    183    Any
        //  175    182    175    176    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  176    182    175    176    Ljava/lang/NumberFormatException;
        //  175    182    175    176    Any
        //  175    182    175    176    Ljava/lang/NegativeArraySizeException;
        //  234    241    241    242    Any
        //  234    241    234    235    Any
        //  234    241    241    242    Any
        //  234    241    234    235    Ljava/lang/IllegalStateException;
        //  234    241    3      8      Any
        //  245    252    252    253    Any
        //  245    252    252    253    Ljava/lang/UnsupportedOperationException;
        //  246    252    245    246    Ljava/lang/NegativeArraySizeException;
        //  245    252    3      8      Any
        //  245    252    3      8      Ljava/lang/NegativeArraySizeException;
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
