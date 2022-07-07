// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;

public class f9I extends fH
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
        //    24: iload_1        
        //    25: ifeq            99
        //    28: aload_0        
        //    29: getfield        dev/nuker/pyro/f9I.c:Ldev/nuker/pyro/fw;
        //    32: iconst_0       
        //    33: goto            37
        //    36: athrow         
        //    37: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    40: goto            44
        //    43: athrow         
        //    44: getstatic       dev/nuker/pyro/fc.c:I
        //    47: ifge            55
        //    50: ldc             1167247426
        //    52: goto            57
        //    55: ldc             1450398294
        //    57: ldc             -1552459360
        //    59: ixor           
        //    60: lookupswitch {
        //          -421162526: 133
        //          1389244064: 55
        //          default: 88
        //        }
        //    88: goto            92
        //    91: athrow         
        //    92: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //    95: goto            99
        //    98: athrow         
        //    99: aload_0        
        //   100: getfield        dev/nuker/pyro/f9I.c:Lnet/minecraft/client/Minecraft;
        //   103: new             Ldev/nuker/pyro/f42;
        //   106: dup            
        //   107: goto            111
        //   110: athrow         
        //   111: invokespecial   dev/nuker/pyro/f42.<init>:()V
        //   114: goto            118
        //   117: athrow         
        //   118: checkcast       Lnet/minecraft/client/gui/GuiScreen;
        //   121: goto            125
        //   124: athrow         
        //   125: invokevirtual   net/minecraft/client/Minecraft.func_147108_a:(Lnet/minecraft/client/gui/GuiScreen;)V
        //   128: goto            132
        //   131: athrow         
        //   132: return         
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
        //    StackMapTable: 00 1D 43 07 00 20 04 FF 00 0B 00 00 00 01 07 00 20 FF 00 03 00 04 07 00 03 01 07 00 46 07 00 48 00 00 FF 00 0B 00 00 00 01 07 00 20 FF 00 00 00 04 07 00 03 01 07 00 46 07 00 48 00 02 07 00 30 01 45 07 00 20 FF 00 00 00 04 07 00 03 01 07 00 46 07 00 48 00 02 07 00 30 07 00 25 FF 00 0A 00 04 07 00 03 01 07 00 46 07 00 48 00 02 07 00 30 07 00 25 FF 00 01 00 04 07 00 03 01 07 00 46 07 00 48 00 03 07 00 30 07 00 25 01 FF 00 1E 00 04 07 00 03 01 07 00 46 07 00 48 00 02 07 00 30 07 00 25 FF 00 02 00 00 00 01 07 00 20 FF 00 00 00 04 07 00 03 01 07 00 46 07 00 48 00 02 07 00 30 07 00 25 45 07 00 20 00 4A 07 00 14 FF 00 00 00 04 07 00 03 01 07 00 46 07 00 48 00 03 07 00 40 08 00 67 08 00 67 45 07 00 20 FF 00 00 00 04 07 00 03 01 07 00 46 07 00 48 00 02 07 00 40 07 00 38 45 07 00 18 FF 00 00 00 04 07 00 03 01 07 00 46 07 00 48 00 02 07 00 40 07 00 3E 45 07 00 20 00 FF 00 00 00 04 07 00 03 01 07 00 46 07 00 48 00 02 07 00 30 07 00 25 41 07 00 20 43 05 44 07 00 20 47 05 47 07 00 20
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     144    152    Any
        //  144    152    144    152    Any
        //  160    162    3      8      Any
        //  37     43     43     44     Any
        //  37     43     43     44     Any
        //  37     43     3      8      Any
        //  37     43     43     44     Any
        //  37     43     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  92     98     98     99     Any
        //  92     98     98     99     Ljava/lang/AssertionError;
        //  92     98     3      8      Any
        //  92     98     98     99     Ljava/lang/EnumConstantNotPresentException;
        //  92     98     98     99     Any
        //  110    117    117    118    Any
        //  111    117    3      8      Ljava/util/NoSuchElementException;
        //  110    117    117    118    Any
        //  110    117    110    111    Ljava/lang/NumberFormatException;
        //  111    117    117    118    Ljava/lang/NumberFormatException;
        //  124    131    131    132    Any
        //  124    131    131    132    Ljava/lang/IndexOutOfBoundsException;
        //  125    131    3      8      Any
        //  124    131    131    132    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  125    131    124    125    Ljava/lang/NullPointerException;
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
    
    public f9I() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u225a\u14a6\u8b4f\ub3fc\uc955\uec7d\ub230\ue749\ud97a"
        //     3: getstatic       dev/nuker/pyro/fc.0:I
        //     6: ifeq            14
        //     9: ldc             873845818
        //    11: goto            16
        //    14: ldc             -1112799718
        //    16: ldc             -243286133
        //    18: ixor           
        //    19: lookupswitch {
        //          -982881359: 14
        //          1288944017: 44
        //          default: 58
        //        }
        //    44: invokestatic    invokestatic   !!! ERROR
        //    47: ldc             "\u225a\u14a6\u8b4f\ub3fc\uc955\uec7d\ub230\ue749\ud97a"
        //    49: invokestatic    invokestatic   !!! ERROR
        //    52: aconst_null    
        //    53: iconst_1       
        //    54: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //    57: return         
        //    58: aconst_null    
        //    59: athrow         
        //    StackMapTable: 00 04 FF 00 0E 00 01 06 00 02 06 07 00 5A FF 00 01 00 01 06 00 03 06 07 00 5A 01 FF 00 1B 00 01 06 00 02 06 07 00 5A FF 00 0D 00 01 06 00 02 06 07 00 5A
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
