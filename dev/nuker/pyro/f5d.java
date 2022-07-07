// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import net.minecraft.client.entity.EntityPlayerSP;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import org.jetbrains.annotations.Nullable;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;

public class f5d extends fH
{
    public f0b c;
    public BlockPos c;
    
    public f5d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u23de\u149a\u8ad8\ub3c0\uc9b0\uedd4\ub237\ue6f2"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u23fe\u149a\u8ad8\ub3c0\uc990\uedd4\ub237\ue6f2"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: ldc             "\u23f0\u149a\u8ac2\ub3dc\uc9a1\ued9b\ub225\ue6a1\ud96a\ue9cd\ua714\u1e4f\ue1ce\uc5e7\u8144\u8959\u57e4\u7725\ubd33\uc03d\u2b20\uc22b\u6a3c\u2d59\ud7ad\u35bd\u7d25\u899b\u8051\u8cf2\u8495\ufb33\u70e7\u9a56\u1bf7\uf15b\u4972\u8800\uca84\uff53\ub6a5\u41f0\ub9dc\ub35c\u4c1d\u8a88\u7c6b\uce0b\u7d5d\ueaa0\ue6e0\u16dc"
        //    13: getstatic       dev/nuker/pyro/fc.0:I
        //    16: ifeq            24
        //    19: ldc             140806900
        //    21: goto            26
        //    24: ldc             306528014
        //    26: ldc             -896936818
        //    28: ixor           
        //    29: lookupswitch {
        //          -1024631174: 24
        //          -657659008: 56
        //          default: 159
        //        }
        //    56: invokestatic    invokestatic   !!! ERROR
        //    59: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    62: aload_0        
        //    63: new             Ldev/nuker/pyro/f0b;
        //    66: dup            
        //    67: ldc             "\u23cf\u1496\u8ac2\ub3dd\uc9b7\uedc9\ub206\ue6ed\ud967\ue9c2\ua710\u1e6f\ue1ca\uc5ab\u8149\u8952"
        //    69: invokestatic    invokestatic   !!! ERROR
        //    72: ldc             "\u23ef\u1496\u8ac2\ub3dd\uc9b7\uedc9\ub206\ue6ed\ud967\ue9c2\ua710\u1e6f\ue1ca\uc5ab\u8149\u8952"
        //    74: invokestatic    invokestatic   !!! ERROR
        //    77: aconst_null    
        //    78: new             Ldev/nuker/pyro/fS;
        //    81: dup            
        //    82: ldc             0.8527778
        //    84: fconst_1       
        //    85: ldc             0.5
        //    87: ldc             0.3
        //    89: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //    92: getstatic       dev/nuker/pyro/fc.1:I
        //    95: ifeq            103
        //    98: ldc             -503357413
        //   100: goto            105
        //   103: ldc             892066551
        //   105: ldc             -1521576525
        //   107: ixor           
        //   108: lookupswitch {
        //          -1872408764: 136
        //          1152513448: 103
        //          default: 157
        //        }
        //   136: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   139: putfield        dev/nuker/pyro/f5d.c:Ldev/nuker/pyro/f0b;
        //   142: aload_0        
        //   143: aconst_null    
        //   144: putfield        dev/nuker/pyro/f5d.c:Lnet/minecraft/util/math/BlockPos;
        //   147: aload_0        
        //   148: aload_0        
        //   149: getfield        dev/nuker/pyro/f5d.c:Ldev/nuker/pyro/f0b;
        //   152: invokevirtual   dev/nuker/pyro/f5d.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   155: pop            
        //   156: return         
        //   157: aconst_null    
        //   158: athrow         
        //   159: aconst_null    
        //   160: athrow         
        //    StackMapTable: 00 08 FF 00 18 00 01 06 00 04 06 07 00 41 07 00 41 07 00 41 FF 00 01 00 01 06 00 05 06 07 00 41 07 00 41 07 00 41 01 FF 00 1D 00 01 06 00 04 06 07 00 41 07 00 41 07 00 41 FF 00 2E 00 01 07 00 03 00 07 07 00 03 08 00 3F 08 00 3F 07 00 41 07 00 41 05 07 00 29 FF 00 01 00 01 07 00 03 00 08 07 00 03 08 00 3F 08 00 3F 07 00 41 07 00 41 05 07 00 29 01 FF 00 1E 00 01 07 00 03 00 07 07 00 03 08 00 3F 08 00 3F 07 00 41 07 00 41 05 07 00 29 FF 00 14 00 01 07 00 03 00 07 07 00 03 08 00 3F 08 00 3F 07 00 41 07 00 41 05 07 00 29 FF 00 01 00 01 06 00 04 06 07 00 41 07 00 41 07 00 41
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:881)
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
    
    @Override
    public void c(@Nullable final Vec3d p0, final float p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          454
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            446
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            438
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             -191791589
        //    32: goto            37
        //    35: ldc             -1710979949
        //    37: ldc             -2080096912
        //    39: ixor           
        //    40: lookupswitch {
        //          503364067: 68
        //          1888830315: 35
        //          default: 419
        //        }
        //    68: aload_0        
        //    69: getstatic       dev/nuker/pyro/fc.c:I
        //    72: ifge            80
        //    75: ldc             806293640
        //    77: goto            82
        //    80: ldc             -1515240122
        //    82: ldc             -72140337
        //    84: ixor           
        //    85: lookupswitch {
        //          -876861113: 80
        //          1578925193: 112
        //          default: 423
        //        }
        //   112: aload_1        
        //   113: fload_2        
        //   114: goto            118
        //   117: athrow         
        //   118: invokespecial   dev/nuker/pyro/fH.c:(Lnet/minecraft/util/math/Vec3d;F)V
        //   121: goto            125
        //   124: athrow         
        //   125: getstatic       dev/nuker/pyro/fc.c:I
        //   128: ifge            136
        //   131: ldc             2145849486
        //   133: goto            138
        //   136: ldc             1490767463
        //   138: ldc             1721869300
        //   140: ixor           
        //   141: lookupswitch {
        //          424063866: 136
        //          1048243603: 168
        //          default: 421
        //        }
        //   168: aload_0        
        //   169: getstatic       dev/nuker/pyro/fc.1:I
        //   172: ifeq            180
        //   175: ldc             -248507831
        //   177: goto            182
        //   180: ldc             -889109822
        //   182: ldc             1402337840
        //   184: ixor           
        //   185: lookupswitch {
        //          -1735083790: 212
        //          -1566185351: 180
        //          default: 427
        //        }
        //   212: getfield        dev/nuker/pyro/f5d.c:Lnet/minecraft/util/math/BlockPos;
        //   215: ifnull          223
        //   218: ldc             739960318
        //   220: goto            225
        //   223: ldc             739960319
        //   225: ldc             -589685358
        //   227: ixor           
        //   228: tableswitch {
        //          -511577896: 252
        //          -511577895: 416
        //          default: 218
        //        }
        //   252: getstatic       dev/nuker/pyro/fbr.c:Ldev/nuker/pyro/fbr;
        //   255: bipush          7
        //   257: goto            261
        //   260: athrow         
        //   261: invokevirtual   dev/nuker/pyro/fbr.c:(I)V
        //   264: goto            268
        //   267: athrow         
        //   268: getstatic       dev/nuker/pyro/fbr.c:Ldev/nuker/pyro/fbr;
        //   271: aload_0        
        //   272: getfield        dev/nuker/pyro/f5d.c:Lnet/minecraft/util/math/BlockPos;
        //   275: aload_0        
        //   276: getstatic       dev/nuker/pyro/fc.0:I
        //   279: ifeq            287
        //   282: ldc             825380320
        //   284: goto            289
        //   287: ldc             391714281
        //   289: ldc             -443191193
        //   291: ixor           
        //   292: lookupswitch {
        //          -727237241: 287
        //          -221485682: 320
        //          default: 417
        //        }
        //   320: getfield        dev/nuker/pyro/f5d.c:Ldev/nuker/pyro/f0b;
        //   323: getstatic       dev/nuker/pyro/fc.1:I
        //   326: ifeq            334
        //   329: ldc             -563266184
        //   331: goto            336
        //   334: ldc             732369855
        //   336: ldc             -1648266130
        //   338: ixor           
        //   339: lookupswitch {
        //          -1234802735: 364
        //          1135364374: 334
        //          default: 425
        //        }
        //   364: goto            368
        //   367: athrow         
        //   368: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //   371: goto            375
        //   374: athrow         
        //   375: checkcast       Ldev/nuker/pyro/fS;
        //   378: goto            382
        //   381: athrow         
        //   382: invokevirtual   dev/nuker/pyro/fS.5:()I
        //   385: goto            389
        //   388: athrow         
        //   389: bipush          63
        //   391: goto            395
        //   394: athrow         
        //   395: invokevirtual   dev/nuker/pyro/fbr.0:(Lnet/minecraft/util/math/BlockPos;II)V
        //   398: goto            402
        //   401: athrow         
        //   402: getstatic       dev/nuker/pyro/fbr.c:Ldev/nuker/pyro/fbr;
        //   405: goto            409
        //   408: athrow         
        //   409: invokevirtual   dev/nuker/pyro/fbr.2:()V
        //   412: goto            416
        //   415: athrow         
        //   416: return         
        //   417: aconst_null    
        //   418: athrow         
        //   419: aconst_null    
        //   420: athrow         
        //   421: aconst_null    
        //   422: athrow         
        //   423: aconst_null    
        //   424: athrow         
        //   425: aconst_null    
        //   426: athrow         
        //   427: aconst_null    
        //   428: athrow         
        //   429: pop            
        //   430: goto            24
        //   433: pop            
        //   434: aconst_null    
        //   435: goto            429
        //   438: dup            
        //   439: ifnull          429
        //   442: checkcast       Ljava/lang/Throwable;
        //   445: athrow         
        //   446: dup            
        //   447: ifnull          433
        //   450: checkcast       Ljava/lang/Throwable;
        //   453: athrow         
        //   454: aconst_null    
        //   455: athrow         
        //    RuntimeInvisibleTypeAnnotations: 00 01 16 00 00 00 43 00 00
        //    StackMapTable: 00 3D 43 07 00 5B 04 FF 00 0B 00 00 00 01 07 00 5B FE 00 03 07 00 03 07 00 8A 02 0A 41 01 1E 4B 07 00 03 FF 00 01 00 03 07 00 03 07 00 8A 02 00 02 07 00 03 01 5D 07 00 03 44 07 00 45 FF 00 00 00 03 07 00 03 07 00 8A 02 00 03 07 00 03 07 00 8A 02 45 07 00 5B 00 0A 41 01 1D 4B 07 00 03 FF 00 01 00 03 07 00 03 07 00 8A 02 00 02 07 00 03 01 5D 07 00 03 05 04 41 01 1A 47 07 00 5B FF 00 00 00 03 07 00 03 07 00 8A 02 00 02 07 00 6E 01 45 07 00 5B 00 FF 00 12 00 03 07 00 03 07 00 8A 02 00 03 07 00 6E 07 00 8C 07 00 03 FF 00 01 00 03 07 00 03 07 00 8A 02 00 04 07 00 6E 07 00 8C 07 00 03 01 FF 00 1E 00 03 07 00 03 07 00 8A 02 00 03 07 00 6E 07 00 8C 07 00 03 FF 00 0D 00 03 07 00 03 07 00 8A 02 00 03 07 00 6E 07 00 8C 07 00 23 FF 00 01 00 03 07 00 03 07 00 8A 02 00 04 07 00 6E 07 00 8C 07 00 23 01 FF 00 1B 00 03 07 00 03 07 00 8A 02 00 03 07 00 6E 07 00 8C 07 00 23 42 07 00 45 FF 00 00 00 03 07 00 03 07 00 8A 02 00 03 07 00 6E 07 00 8C 07 00 23 45 07 00 5B FF 00 00 00 03 07 00 03 07 00 8A 02 00 03 07 00 6E 07 00 8C 07 00 8E 45 07 00 5B FF 00 00 00 03 07 00 03 07 00 8A 02 00 03 07 00 6E 07 00 8C 07 00 29 45 07 00 5B FF 00 00 00 03 07 00 03 07 00 8A 02 00 03 07 00 6E 07 00 8C 01 44 07 00 5B FF 00 00 00 03 07 00 03 07 00 8A 02 00 04 07 00 6E 07 00 8C 01 01 45 07 00 5B 00 45 07 00 55 40 07 00 6E 45 07 00 5B 00 FF 00 00 00 03 07 00 03 07 00 8A 02 00 03 07 00 6E 07 00 8C 07 00 03 01 01 41 07 00 03 FF 00 01 00 03 07 00 03 07 00 8A 02 00 03 07 00 6E 07 00 8C 07 00 23 41 07 00 03 41 07 00 5B 43 05 44 07 00 5B 47 05 47 07 00 5B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     438    446    Ljava/lang/RuntimeException;
        //  438    446    438    446    Any
        //  454    456    3      8      Ljava/util/ConcurrentModificationException;
        //  117    124    124    125    Any
        //  118    124    117    118    Ljava/lang/RuntimeException;
        //  117    124    3      8      Ljava/lang/RuntimeException;
        //  117    124    124    125    Any
        //  118    124    117    118    Ljava/lang/ClassCastException;
        //  260    267    267    268    Any
        //  260    267    3      8      Ljava/lang/AssertionError;
        //  260    267    260    261    Any
        //  260    267    267    268    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  260    267    260    261    Any
        //  367    374    374    375    Any
        //  367    374    367    368    Ljava/lang/NegativeArraySizeException;
        //  368    374    374    375    Ljava/lang/EnumConstantNotPresentException;
        //  368    374    3      8      Any
        //  367    374    367    368    Ljava/util/NoSuchElementException;
        //  381    388    388    389    Any
        //  382    388    3      8      Any
        //  382    388    388    389    Any
        //  381    388    3      8      Any
        //  382    388    381    382    Any
        //  394    401    401    402    Any
        //  394    401    401    402    Ljava/lang/NullPointerException;
        //  394    401    394    395    Any
        //  395    401    394    395    Any
        //  394    401    401    402    Any
        //  408    415    415    416    Any
        //  409    415    3      8      Ljava/lang/IllegalArgumentException;
        //  408    415    408    409    Ljava/lang/NullPointerException;
        //  409    415    3      8      Any
        //  408    415    415    416    Ljava/util/NoSuchElementException;
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
    
    public void c(final Boolean b) {
        fbS.3x(this, 1284819578, b);
    }
    
    static {
        throw t;
    }
    
    @f06
    @LauncherEventHide
    public void c(final f3i f3i) {
        fbS.fq(this, 810562183, f3i);
    }
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1154
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1146
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1138
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            37
        //    32: ldc             -1932442347
        //    34: goto            39
        //    37: ldc             -340418537
        //    39: ldc             1199077757
        //    41: ixor           
        //    42: lookupswitch {
        //          -878101400: 1127
        //          919719749: 37
        //          default: 68
        //        }
        //    68: aload_2        
        //    69: aload_3        
        //    70: goto            74
        //    73: athrow         
        //    74: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //    77: goto            81
        //    80: athrow         
        //    81: getstatic       dev/nuker/pyro/fx.c:Ldev/nuker/pyro/fx;
        //    84: goto            88
        //    87: athrow         
        //    88: invokevirtual   dev/nuker/pyro/fx.c:()Ldev/nuker/pyro/fH;
        //    91: goto            95
        //    94: athrow         
        //    95: ifnull          103
        //    98: ldc             -282401388
        //   100: goto            105
        //   103: ldc             -282401385
        //   105: ldc             857083661
        //   107: ixor           
        //   108: tableswitch {
        //          -1199975118: 132
        //          -1199975117: 248
        //          default: 98
        //        }
        //   132: getstatic       dev/nuker/pyro/fx.c:Ldev/nuker/pyro/fx;
        //   135: getstatic       dev/nuker/pyro/fc.c:I
        //   138: ifge            146
        //   141: ldc             434174541
        //   143: goto            148
        //   146: ldc             147862206
        //   148: ldc             -1554694460
        //   150: ixor           
        //   151: lookupswitch {
        //          -1417343878: 176
        //          -1162492791: 146
        //          default: 1103
        //        }
        //   176: goto            180
        //   179: athrow         
        //   180: invokevirtual   dev/nuker/pyro/fx.c:()Ldev/nuker/pyro/fH;
        //   183: goto            187
        //   186: athrow         
        //   187: aload_0        
        //   188: if_acmpne       248
        //   191: getstatic       dev/nuker/pyro/fc.1:I
        //   194: ifeq            202
        //   197: ldc             909367323
        //   199: goto            204
        //   202: ldc             -766436574
        //   204: ldc             -1605691344
        //   206: ixor           
        //   207: lookupswitch {
        //          -1770471381: 1121
        //          1106983724: 202
        //          default: 232
        //        }
        //   232: getstatic       dev/nuker/pyro/fx.c:Ldev/nuker/pyro/fx;
        //   235: iconst_0       
        //   236: goto            240
        //   239: athrow         
        //   240: invokevirtual   dev/nuker/pyro/fx.c:(Z)V
        //   243: goto            247
        //   246: athrow         
        //   247: return         
        //   248: iload_1        
        //   249: ifeq            257
        //   252: ldc             -2001886590
        //   254: goto            259
        //   257: ldc             -2001886587
        //   259: ldc             -778152335
        //   261: ixor           
        //   262: tableswitch {
        //          -1301812762: 284
        //          -1301812761: 1102
        //          default: 252
        //        }
        //   284: aload_0        
        //   285: getfield        dev/nuker/pyro/f5d.c:Lnet/minecraft/client/Minecraft;
        //   288: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   291: getfield        net/minecraft/client/multiplayer/WorldClient.field_73010_i:Ljava/util/List;
        //   294: getstatic       dev/nuker/pyro/fc.1:I
        //   297: ifeq            305
        //   300: ldc             2142044796
        //   302: goto            307
        //   305: ldc             1867921869
        //   307: ldc             -1007092141
        //   309: ixor           
        //   310: lookupswitch {
        //          -1397831778: 336
        //          -1135215569: 305
        //          default: 1105
        //        }
        //   336: goto            340
        //   339: athrow         
        //   340: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   345: goto            349
        //   348: athrow         
        //   349: getstatic       dev/nuker/pyro/fc.c:I
        //   352: ifge            360
        //   355: ldc             -1386560962
        //   357: goto            362
        //   360: ldc             -246630854
        //   362: ldc             -143132876
        //   364: ixor           
        //   365: lookupswitch {
        //          104546574: 392
        //          1512912138: 360
        //          default: 1107
        //        }
        //   392: astore          4
        //   394: aload           4
        //   396: goto            400
        //   399: athrow         
        //   400: invokeinterface java/util/Iterator.hasNext:()Z
        //   405: goto            409
        //   408: athrow         
        //   409: ifeq            417
        //   412: ldc             -914317174
        //   414: goto            419
        //   417: ldc             -914317171
        //   419: ldc             294415041
        //   421: ixor           
        //   422: tableswitch {
        //          -1340500842: 444
        //          -1340500841: 918
        //          default: 412
        //        }
        //   444: aload           4
        //   446: goto            450
        //   449: athrow         
        //   450: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   455: goto            459
        //   458: athrow         
        //   459: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //   462: astore          5
        //   464: getstatic       dev/nuker/pyro/fc.c:I
        //   467: ifge            475
        //   470: ldc             1678856323
        //   472: goto            477
        //   475: ldc             -637270828
        //   477: ldc             208294205
        //   479: ixor           
        //   480: lookupswitch {
        //          1266256814: 475
        //          1752891838: 1117
        //          default: 508
        //        }
        //   508: aload           5
        //   510: goto            514
        //   513: athrow         
        //   514: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_70089_S:()Z
        //   517: goto            521
        //   520: athrow         
        //   521: ifeq            905
        //   524: aload           5
        //   526: instanceof      Lnet/minecraft/client/entity/EntityPlayerSP;
        //   529: ifne            537
        //   532: ldc             1169814488
        //   534: goto            539
        //   537: ldc             1169814489
        //   539: ldc             -1592348846
        //   541: ixor           
        //   542: tableswitch {
        //          -916539116: 564
        //          -916539115: 905
        //          default: 532
        //        }
        //   564: getstatic       dev/nuker/pyro/fbq.c:Ldev/nuker/pyro/fbq;
        //   567: aload           5
        //   569: goto            573
        //   572: athrow         
        //   573: invokevirtual   dev/nuker/pyro/fbq.c:(Lnet/minecraft/entity/player/EntityPlayer;)Z
        //   576: goto            580
        //   579: athrow         
        //   580: ifeq            905
        //   583: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f9j;
        //   586: getstatic       dev/nuker/pyro/fc.1:I
        //   589: ifeq            598
        //   592: ldc_w           281193181
        //   595: goto            601
        //   598: ldc_w           1595187426
        //   601: ldc_w           -787395603
        //   604: ixor           
        //   605: lookupswitch {
        //          -1912214769: 632
        //          -1043078864: 598
        //          default: 1123
        //        }
        //   632: aload           5
        //   634: goto            638
        //   637: athrow         
        //   638: invokevirtual   dev/nuker/pyro/f9j.0:(Lnet/minecraft/entity/player/EntityPlayer;)Ljava/util/ArrayList;
        //   641: goto            645
        //   644: athrow         
        //   645: goto            649
        //   648: athrow         
        //   649: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   652: goto            656
        //   655: athrow         
        //   656: astore          6
        //   658: aload           6
        //   660: goto            664
        //   663: athrow         
        //   664: invokeinterface java/util/Iterator.hasNext:()Z
        //   669: goto            673
        //   672: athrow         
        //   673: ifeq            905
        //   676: getstatic       dev/nuker/pyro/fc.c:I
        //   679: ifge            688
        //   682: ldc_w           1580912629
        //   685: goto            691
        //   688: ldc_w           1500061741
        //   691: ldc_w           1058640297
        //   694: ixor           
        //   695: lookupswitch {
        //          1629707868: 688
        //          1718661508: 720
        //          default: 1119
        //        }
        //   720: aload           6
        //   722: goto            726
        //   725: athrow         
        //   726: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   731: goto            735
        //   734: athrow         
        //   735: checkcast       Lnet/minecraft/util/math/BlockPos;
        //   738: astore          7
        //   740: aload           7
        //   742: getstatic       dev/nuker/pyro/fc.1:I
        //   745: ifeq            754
        //   748: ldc_w           -1651918032
        //   751: goto            757
        //   754: ldc_w           1170922153
        //   757: ldc_w           1342235391
        //   760: ixor           
        //   761: lookupswitch {
        //          -1253782345: 754
        //          -846636593: 1115
        //          default: 788
        //        }
        //   788: goto            792
        //   791: athrow         
        //   792: invokestatic    dev/nuker/pyro/fbA.5:(Lnet/minecraft/util/math/BlockPos;)Z
        //   795: goto            799
        //   798: athrow         
        //   799: ifeq            902
        //   802: getstatic       dev/nuker/pyro/fc.c:I
        //   805: ifge            814
        //   808: ldc_w           1348757141
        //   811: goto            817
        //   814: ldc_w           -1875497779
        //   817: ldc_w           -490137963
        //   820: ixor           
        //   821: lookupswitch {
        //          -1297256448: 1113
        //          -1249911560: 814
        //          default: 848
        //        }
        //   848: aload_0        
        //   849: aload           7
        //   851: getstatic       dev/nuker/pyro/fc.0:I
        //   854: ifeq            863
        //   857: ldc_w           -520599710
        //   860: goto            866
        //   863: ldc_w           -1521857601
        //   866: ldc_w           437614851
        //   869: ixor           
        //   870: lookupswitch {
        //          -391574047: 863
        //          -85115295: 1109
        //          default: 896
        //        }
        //   896: putfield        dev/nuker/pyro/f5d.c:Lnet/minecraft/util/math/BlockPos;
        //   899: goto            905
        //   902: goto            658
        //   905: aload_0        
        //   906: getfield        dev/nuker/pyro/f5d.c:Lnet/minecraft/util/math/BlockPos;
        //   909: ifnull          915
        //   912: goto            918
        //   915: goto            394
        //   918: aload_0        
        //   919: getfield        dev/nuker/pyro/f5d.c:Lnet/minecraft/util/math/BlockPos;
        //   922: ifnull          1001
        //   925: getstatic       dev/nuker/pyro/fc.1:I
        //   928: ifeq            937
        //   931: ldc_w           -830359272
        //   934: goto            940
        //   937: ldc_w           387751164
        //   940: ldc_w           -2062920190
        //   943: ixor           
        //   944: lookupswitch {
        //          -1844000002: 972
        //          1267461914: 937
        //          default: 1111
        //        }
        //   972: getstatic       dev/nuker/pyro/fx.c:Ldev/nuker/pyro/fx;
        //   975: aload_0        
        //   976: aload_0        
        //   977: getfield        dev/nuker/pyro/f5d.c:Lnet/minecraft/util/math/BlockPos;
        //   980: iconst_1       
        //   981: aload_0        
        //   982: invokedynamic   BootstrapMethod #0, accept:(Ldev/nuker/pyro/f5d;)Ljava/util/function/Consumer;
        //   987: goto            991
        //   990: athrow         
        //   991: invokevirtual   dev/nuker/pyro/fx.c:(Ldev/nuker/pyro/fH;Lnet/minecraft/util/math/BlockPos;ZLjava/util/function/Consumer;)V
        //   994: goto            998
        //   997: athrow         
        //   998: goto            1102
        //  1001: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //  1004: ldc_w           "\u23e9\u149b\u8ac9\ub1da\ucfa4\ued9b\ub22d\ue6f2\udb39\uefdc\ua714\u1e0c\ue1ca\uc7b8\u8750\u8900\u57b0\u772b\ubf6c\uc64d\u2b26\uc22f\u6a35\u2f65\ud1bf\u35ab\u7d38\u89ce"
        //  1007: goto            1011
        //  1010: athrow         
        //  1011: invokestatic    invokestatic   !!! ERROR
        //  1014: goto            1018
        //  1017: athrow         
        //  1018: goto            1022
        //  1021: athrow         
        //  1022: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //  1025: goto            1029
        //  1028: athrow         
        //  1029: aload_0        
        //  1030: getfield        dev/nuker/pyro/f5d.c:Ldev/nuker/pyro/fw;
        //  1033: iconst_0       
        //  1034: getstatic       dev/nuker/pyro/fc.c:I
        //  1037: ifge            1046
        //  1040: ldc_w           -1759860329
        //  1043: goto            1049
        //  1046: ldc_w           -700018071
        //  1049: ldc_w           1255942268
        //  1052: ixor           
        //  1053: lookupswitch {
        //          -574193173: 1125
        //          1990960879: 1046
        //          default: 1080
        //        }
        //  1080: goto            1084
        //  1083: athrow         
        //  1084: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1087: goto            1091
        //  1090: athrow         
        //  1091: goto            1095
        //  1094: athrow         
        //  1095: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //  1098: goto            1102
        //  1101: athrow         
        //  1102: return         
        //  1103: aconst_null    
        //  1104: athrow         
        //  1105: aconst_null    
        //  1106: athrow         
        //  1107: aconst_null    
        //  1108: athrow         
        //  1109: aconst_null    
        //  1110: athrow         
        //  1111: aconst_null    
        //  1112: athrow         
        //  1113: aconst_null    
        //  1114: athrow         
        //  1115: aconst_null    
        //  1116: athrow         
        //  1117: aconst_null    
        //  1118: athrow         
        //  1119: aconst_null    
        //  1120: athrow         
        //  1121: aconst_null    
        //  1122: athrow         
        //  1123: aconst_null    
        //  1124: athrow         
        //  1125: aconst_null    
        //  1126: athrow         
        //  1127: aconst_null    
        //  1128: athrow         
        //  1129: pop            
        //  1130: goto            24
        //  1133: pop            
        //  1134: aconst_null    
        //  1135: goto            1129
        //  1138: dup            
        //  1139: ifnull          1129
        //  1142: checkcast       Ljava/lang/Throwable;
        //  1145: athrow         
        //  1146: dup            
        //  1147: ifnull          1133
        //  1150: checkcast       Ljava/lang/Throwable;
        //  1153: athrow         
        //  1154: aconst_null    
        //  1155: athrow         
        //    RuntimeInvisibleTypeAnnotations: 00 02 16 01 00 00 43 00 00 16 02 00 00 43 00 00
        //    StackMapTable: 00 A1 43 07 00 5B 04 FF 00 0B 00 00 00 01 07 00 5B FF 00 03 00 04 07 00 03 01 07 00 F6 07 01 57 00 00 FF 00 0C 00 04 07 00 03 01 07 00 F6 07 01 57 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 01 07 00 F6 07 01 57 00 03 07 00 03 01 01 FF 00 1C 00 04 07 00 03 01 07 00 F6 07 01 57 00 02 07 00 03 01 FF 00 04 00 00 00 01 07 00 5B FF 00 00 00 04 07 00 03 01 07 00 F6 07 01 57 00 04 07 00 03 01 07 00 F6 07 01 57 45 07 00 5B 00 45 07 00 5B 40 07 00 B0 45 07 00 5B 40 07 00 05 02 04 41 01 1A 4D 07 00 B0 FF 00 01 00 04 07 00 03 01 07 00 F6 07 01 57 00 02 07 00 B0 01 5B 07 00 B0 42 07 00 5B 40 07 00 B0 45 07 00 5B 40 07 00 05 0E 41 01 1B 46 07 00 5B FF 00 00 00 04 07 00 03 01 07 00 F6 07 01 57 00 02 07 00 B0 01 45 07 00 5B 00 00 03 04 41 01 18 54 07 00 D9 FF 00 01 00 04 07 00 03 01 07 00 F6 07 01 57 00 02 07 00 D9 01 5C 07 00 D9 42 07 00 4D 40 07 00 D9 47 07 00 5B 40 07 00 E2 4A 07 00 E2 FF 00 01 00 04 07 00 03 01 07 00 F6 07 01 57 00 02 07 00 E2 01 5D 07 00 E2 FC 00 01 07 00 E2 44 07 00 5B 40 07 00 E2 47 07 00 5B 40 01 02 04 41 01 18 44 07 00 55 40 07 00 E2 47 07 00 5B 40 07 00 8E FC 00 0F 07 00 EE 41 01 1E 44 07 00 5B 40 07 00 EE 45 07 00 5B 40 01 0A 04 41 01 18 FF 00 07 00 00 00 01 07 00 5B FF 00 00 00 06 07 00 03 01 07 00 F6 07 01 57 07 00 E2 07 00 EE 00 02 07 00 FB 07 00 EE 45 07 00 5B 40 01 51 07 01 0B FF 00 02 00 06 07 00 03 01 07 00 F6 07 01 57 07 00 E2 07 00 EE 00 02 07 01 0B 01 5E 07 01 0B 44 07 00 4B FF 00 00 00 06 07 00 03 01 07 00 F6 07 01 57 07 00 E2 07 00 EE 00 02 07 01 0B 07 00 EE 45 07 00 5B 40 07 01 10 42 07 00 5B 40 07 01 10 45 07 00 5B 40 07 00 E2 FC 00 01 07 00 E2 44 07 00 5B 40 07 00 E2 47 07 00 5B 40 01 0E 42 01 1C 44 07 00 45 40 07 00 E2 47 07 00 5B 40 07 00 8E FF 00 12 00 08 07 00 03 01 07 00 F6 07 01 57 07 00 E2 07 00 EE 07 00 E2 07 00 8C 00 01 07 00 8C FF 00 02 00 08 07 00 03 01 07 00 F6 07 01 57 07 00 E2 07 00 EE 07 00 E2 07 00 8C 00 02 07 00 8C 01 5E 07 00 8C FF 00 02 00 00 00 01 07 00 5B FF 00 00 00 08 07 00 03 01 07 00 F6 07 01 57 07 00 E2 07 00 EE 07 00 E2 07 00 8C 00 01 07 00 8C 45 07 00 5B 40 01 0E 42 01 1E FF 00 0E 00 08 07 00 03 01 07 00 F6 07 01 57 07 00 E2 07 00 EE 07 00 E2 07 00 8C 00 02 07 00 03 07 00 8C FF 00 02 00 08 07 00 03 01 07 00 F6 07 01 57 07 00 E2 07 00 EE 07 00 E2 07 00 8C 00 03 07 00 03 07 00 8C 01 FF 00 1D 00 08 07 00 03 01 07 00 F6 07 01 57 07 00 E2 07 00 EE 07 00 E2 07 00 8C 00 02 07 00 03 07 00 8C 05 F9 00 02 09 FA 00 02 12 42 01 1F 51 07 00 5B FF 00 00 00 05 07 00 03 01 07 00 F6 07 01 57 07 00 E2 00 05 07 00 B0 07 00 03 07 00 8C 01 07 01 59 45 07 00 5B 00 02 48 07 00 5B FF 00 00 00 05 07 00 03 01 07 00 F6 07 01 57 07 00 E2 00 02 07 01 3B 07 00 41 45 07 00 5B FF 00 00 00 05 07 00 03 01 07 00 F6 07 01 57 07 00 E2 00 02 07 01 3B 07 00 41 42 07 00 45 FF 00 00 00 05 07 00 03 01 07 00 F6 07 01 57 07 00 E2 00 02 07 01 3B 07 00 41 45 07 00 5B 00 FF 00 10 00 05 07 00 03 01 07 00 F6 07 01 57 07 00 E2 00 02 07 01 53 01 FF 00 02 00 05 07 00 03 01 07 00 F6 07 01 57 07 00 E2 00 03 07 01 53 01 01 FF 00 1E 00 05 07 00 03 01 07 00 F6 07 01 57 07 00 E2 00 02 07 01 53 01 FF 00 02 00 00 00 01 07 00 5B FF 00 00 00 05 07 00 03 01 07 00 F6 07 01 57 07 00 E2 00 02 07 01 53 01 45 07 00 5B FF 00 00 00 05 07 00 03 01 07 00 F6 07 01 57 07 00 E2 00 02 07 01 53 07 01 4D FF 00 02 00 00 00 01 07 00 5B FF 00 00 00 05 07 00 03 01 07 00 F6 07 01 57 07 00 E2 00 02 07 01 53 07 01 4D 45 07 00 5B FA 00 00 40 07 00 B0 41 07 00 D9 41 07 00 E2 FF 00 01 00 08 07 00 03 01 07 00 F6 07 01 57 07 00 E2 07 00 EE 07 00 E2 07 00 8C 00 02 07 00 03 07 00 8C F8 00 01 FE 00 01 07 00 EE 07 00 E2 07 00 8C 41 07 00 8C F9 00 01 FC 00 01 07 00 E2 F8 00 01 FF 00 01 00 06 07 00 03 01 07 00 F6 07 01 57 07 00 E2 07 00 EE 00 01 07 01 0B FF 00 01 00 05 07 00 03 01 07 00 F6 07 01 57 07 00 E2 00 02 07 01 53 01 FF 00 01 00 04 07 00 03 01 07 00 F6 07 01 57 00 02 07 00 03 01 41 07 00 5B 43 05 44 07 00 5B 47 05 47 07 00 5B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1138   1146   Any
        //  1138   1146   1138   1146   Ljava/lang/StringIndexOutOfBoundsException;
        //  1154   1156   3      8      Any
        //  74     80     80     81     Any
        //  74     80     3      8      Ljava/util/NoSuchElementException;
        //  74     80     3      8      Any
        //  74     80     80     81     Ljava/lang/NumberFormatException;
        //  74     80     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  87     94     94     95     Any
        //  87     94     94     95     Ljava/lang/AssertionError;
        //  88     94     87     88     Any
        //  87     94     87     88     Any
        //  87     94     94     95     Ljava/lang/AssertionError;
        //  179    186    186    187    Any
        //  179    186    3      8      Any
        //  180    186    179    180    Any
        //  179    186    3      8      Any
        //  179    186    3      8      Ljava/util/NoSuchElementException;
        //  239    246    246    247    Any
        //  240    246    239    240    Ljava/lang/StringIndexOutOfBoundsException;
        //  240    246    246    247    Any
        //  239    246    239    240    Ljava/lang/NegativeArraySizeException;
        //  240    246    239    240    Any
        //  339    348    348    349    Any
        //  340    348    348    349    Any
        //  339    348    3      8      Any
        //  340    348    339    340    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  340    348    3      8      Ljava/util/ConcurrentModificationException;
        //  399    408    408    409    Any
        //  400    408    408    409    Any
        //  399    408    399    400    Any
        //  399    408    399    400    Ljava/lang/NumberFormatException;
        //  399    408    3      8      Any
        //  449    458    458    459    Any
        //  450    458    458    459    Any
        //  450    458    3      8      Any
        //  450    458    449    450    Ljava/lang/NullPointerException;
        //  449    458    458    459    Any
        //  513    520    520    521    Any
        //  514    520    520    521    Any
        //  514    520    3      8      Any
        //  514    520    520    521    Any
        //  514    520    513    514    Any
        //  573    579    579    580    Any
        //  573    579    3      8      Ljava/lang/ArithmeticException;
        //  573    579    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  573    579    579    580    Any
        //  573    579    3      8      Any
        //  637    644    644    645    Any
        //  637    644    3      8      Any
        //  637    644    637    638    Ljava/lang/AssertionError;
        //  637    644    3      8      Any
        //  638    644    3      8      Any
        //  648    655    655    656    Any
        //  648    655    648    649    Ljava/lang/ClassCastException;
        //  649    655    648    649    Any
        //  648    655    648    649    Ljava/util/NoSuchElementException;
        //  648    655    3      8      Any
        //  663    672    672    673    Any
        //  664    672    663    664    Any
        //  664    672    663    664    Any
        //  663    672    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  663    672    672    673    Ljava/lang/ClassCastException;
        //  725    734    734    735    Any
        //  726    734    725    726    Ljava/lang/ClassCastException;
        //  726    734    734    735    Any
        //  725    734    725    726    Ljava/lang/IllegalArgumentException;
        //  726    734    3      8      Any
        //  792    798    798    799    Any
        //  792    798    798    799    Any
        //  792    798    3      8      Any
        //  792    798    3      8      Any
        //  792    798    3      8      Ljava/util/ConcurrentModificationException;
        //  990    997    997    998    Any
        //  990    997    3      8      Ljava/util/NoSuchElementException;
        //  990    997    3      8      Ljava/lang/ArithmeticException;
        //  990    997    997    998    Any
        //  991    997    990    991    Any
        //  1010   1017   1017   1018   Any
        //  1011   1017   1010   1011   Any
        //  1010   1017   1010   1011   Ljava/lang/ArithmeticException;
        //  1010   1017   1017   1018   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1010   1017   3      8      Any
        //  1021   1028   1028   1029   Any
        //  1022   1028   1021   1022   Ljava/lang/EnumConstantNotPresentException;
        //  1022   1028   1021   1022   Ljava/lang/RuntimeException;
        //  1022   1028   3      8      Any
        //  1021   1028   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1084   1090   1090   1091   Any
        //  1084   1090   1090   1091   Ljava/util/ConcurrentModificationException;
        //  1084   1090   1090   1091   Ljava/lang/RuntimeException;
        //  1084   1090   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1084   1090   3      8      Any
        //  1095   1101   1101   1102   Any
        //  1095   1101   1101   1102   Ljava/lang/IndexOutOfBoundsException;
        //  1095   1101   1101   1102   Ljava/lang/NumberFormatException;
        //  1095   1101   3      8      Any
        //  1095   1101   3      8      Ljava/lang/NumberFormatException;
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
