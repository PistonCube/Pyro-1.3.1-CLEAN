// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;

public class f6q extends fH
{
    static {
        throw t;
    }
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          232
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            224
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            216
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             -531108805
        //    32: goto            37
        //    35: ldc             -1296790464
        //    37: ldc             1838289256
        //    39: ixor           
        //    40: lookupswitch {
        //          -1916404397: 35
        //          -551117528: 68
        //          default: 201
        //        }
        //    68: aload_0        
        //    69: iload_1        
        //    70: aload_2        
        //    71: aload_3        
        //    72: goto            76
        //    75: athrow         
        //    76: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //    79: goto            83
        //    82: athrow         
        //    83: getstatic       dev/nuker/pyro/fc.0:I
        //    86: ifeq            94
        //    89: ldc             701963030
        //    91: goto            96
        //    94: ldc             -221093819
        //    96: ldc             1201674571
        //    98: ixor           
        //    99: lookupswitch {
        //          -1250789106: 124
        //          1853293149: 94
        //          default: 205
        //        }
        //   124: iload_1        
        //   125: ifeq            186
        //   128: getstatic       dev/nuker/pyro/f4.c:Ldev/nuker/pyro/f4;
        //   131: getstatic       dev/nuker/pyro/fc.c:I
        //   134: ifge            142
        //   137: ldc             1417102875
        //   139: goto            144
        //   142: ldc             -484417441
        //   144: ldc             -1199530546
        //   146: ixor           
        //   147: lookupswitch {
        //          -666420342: 142
        //          -319300651: 203
        //          default: 172
        //        }
        //   172: goto            176
        //   175: athrow         
        //   176: invokevirtual   dev/nuker/pyro/f4.2:()V
        //   179: goto            183
        //   182: athrow         
        //   183: goto            200
        //   186: getstatic       dev/nuker/pyro/f4.c:Ldev/nuker/pyro/f4;
        //   189: goto            193
        //   192: athrow         
        //   193: invokevirtual   dev/nuker/pyro/f4.4:()V
        //   196: goto            200
        //   199: athrow         
        //   200: return         
        //   201: aconst_null    
        //   202: athrow         
        //   203: aconst_null    
        //   204: athrow         
        //   205: aconst_null    
        //   206: athrow         
        //   207: pop            
        //   208: goto            24
        //   211: pop            
        //   212: aconst_null    
        //   213: goto            207
        //   216: dup            
        //   217: ifnull          207
        //   220: checkcast       Ljava/lang/Throwable;
        //   223: athrow         
        //   224: dup            
        //   225: ifnull          211
        //   228: checkcast       Ljava/lang/Throwable;
        //   231: athrow         
        //   232: aconst_null    
        //   233: athrow         
        //    StackMapTable: 00 22 43 07 00 19 04 FF 00 0B 00 00 00 01 07 00 19 FF 00 03 00 04 07 00 03 01 07 00 35 07 00 37 00 00 0A 41 01 1E 46 07 00 19 FF 00 00 00 04 07 00 03 01 07 00 35 07 00 37 00 04 07 00 03 01 07 00 35 07 00 37 45 07 00 19 00 0A 41 01 1B 51 07 00 26 FF 00 01 00 04 07 00 03 01 07 00 35 07 00 37 00 02 07 00 26 01 5B 07 00 26 42 07 00 19 40 07 00 26 45 07 00 19 00 02 45 07 00 19 40 07 00 26 45 07 00 19 00 00 41 07 00 26 01 41 07 00 19 43 05 44 07 00 19 47 05 47 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  8      20     216    224    Any
        //  216    224    216    224    Any
        //  232    234    3      8      Any
        //  75     82     82     83     Any
        //  75     82     75     76     Any
        //  75     82     82     83     Ljava/lang/ClassCastException;
        //  75     82     82     83     Any
        //  75     82     3      8      Ljava/lang/IllegalStateException;
        //  175    182    182    183    Any
        //  175    182    182    183    Ljava/lang/NegativeArraySizeException;
        //  175    182    3      8      Any
        //  176    182    3      8      Ljava/util/NoSuchElementException;
        //  175    182    175    176    Any
        //  192    199    199    200    Any
        //  192    199    192    193    Any
        //  192    199    192    193    Any
        //  193    199    199    200    Any
        //  193    199    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 73 out of bounds for length 73
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
    
    public f6q() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u222d\u149a\u8b33\ub3da\uc969\uec3d\ub220\ue71f\ud978\ue916"
        //     3: getstatic       dev/nuker/pyro/fc.c:I
        //     6: ifge            14
        //     9: ldc             -1024931588
        //    11: goto            16
        //    14: ldc             -588309665
        //    16: ldc             1193249365
        //    18: ixor           
        //    19: lookupswitch {
        //          -2047393111: 106
        //          826717614: 14
        //          default: 44
        //        }
        //    44: invokestatic    invokestatic   !!! ERROR
        //    47: ldc             "\u220d\u149a\u8b33\ub3da\uc969\uec3d\ub220\ue73f\ud958\ue936"
        //    49: invokestatic    invokestatic   !!! ERROR
        //    52: ldc             "\u2219\u148a\u8b32\ub3d6\uc926\uec2b\ub22d\ue71e\ud96b\ue91a\ua6fd\u1e48\ue069\uc5b4\u8186\u88b5\u57b0\u76dd\ubd2e"
        //    54: invokestatic    invokestatic   !!! ERROR
        //    57: iconst_1       
        //    58: getstatic       dev/nuker/pyro/fc.1:I
        //    61: ifeq            69
        //    64: ldc             -398932870
        //    66: goto            71
        //    69: ldc             -1470444594
        //    71: ldc             -1852703703
        //    73: ixor           
        //    74: lookupswitch {
        //          -1877419679: 69
        //          2041133139: 104
        //          default: 100
        //        }
        //   100: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   103: return         
        //   104: aconst_null    
        //   105: athrow         
        //   106: aconst_null    
        //   107: athrow         
        //    StackMapTable: 00 08 FF 00 0E 00 01 06 00 02 06 07 00 51 FF 00 01 00 01 06 00 03 06 07 00 51 01 FF 00 1B 00 01 06 00 02 06 07 00 51 FF 00 18 00 01 06 00 05 06 07 00 51 07 00 51 07 00 51 01 FF 00 01 00 01 06 00 06 06 07 00 51 07 00 51 07 00 51 01 01 FF 00 1C 00 01 06 00 05 06 07 00 51 07 00 51 07 00 51 01 FF 00 03 00 01 06 00 05 06 07 00 51 07 00 51 07 00 51 01 FF 00 01 00 01 06 00 02 06 07 00 51
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
}
