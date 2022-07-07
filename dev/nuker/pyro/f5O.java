// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;

public class f5o extends fH
{
    public f5o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifge            11
        //     6: ldc             -759012683
        //     8: goto            13
        //    11: ldc             -219565474
        //    13: ldc             -1214743858
        //    15: ixor           
        //    16: lookupswitch {
        //          1165084816: 44
        //          1700403323: 11
        //          default: 182
        //        }
        //    44: aload_0        
        //    45: ldc             "\u23ce\u1481\u8ac8\ub3dc\uc989\uedca\ub237"
        //    47: invokestatic    invokestatic   !!! ERROR
        //    50: ldc             "\u23ee\u1481\u8ac8\ub3dc\uc989\uedca\ub237"
        //    52: invokestatic    invokestatic   !!! ERROR
        //    55: ldc             "\u23ef\u149f\u8ace\ub3db\uc986\uedc2\ub228\ue6f5\ud928\ue9f1\ua700\u1e4d\ue1ca\uc5ab\u8176\u8946\u57eb\u772d\ubd34\uc05b\u2b3b\uc239\u6a2d\u2d53\ud785\u35ed\u7d2d\u8990\u8018\u8cd6\u8486\ufb36\u70ed"
        //    57: invokestatic    invokestatic   !!! ERROR
        //    60: iconst_1       
        //    61: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //    64: getstatic       dev/nuker/pyro/fc.0:I
        //    67: ifeq            75
        //    70: ldc             1190535278
        //    72: goto            77
        //    75: ldc             -1242734011
        //    77: ldc             1196688049
        //    79: ixor           
        //    80: lookupswitch {
        //          -1912099892: 75
        //          27402975: 184
        //          default: 108
        //        }
        //   108: aload_0        
        //   109: new             Ldev/nuker/pyro/fz;
        //   112: dup            
        //   113: iconst_1       
        //   114: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   117: new             Ldev/nuker/pyro/f5n;
        //   120: dup            
        //   121: aload_0        
        //   122: getstatic       dev/nuker/pyro/fc.0:I
        //   125: ifeq            133
        //   128: ldc             -700274822
        //   130: goto            135
        //   133: ldc             -1879404838
        //   135: ldc             1741297568
        //   137: ixor           
        //   138: lookupswitch {
        //          -1316441894: 133
        //          -399468166: 164
        //          default: 180
        //        }
        //   164: invokespecial   dev/nuker/pyro/f5n.<init>:(Ldev/nuker/pyro/f5o;)V
        //   167: checkcast       Ljava/util/function/Consumer;
        //   170: invokespecial   dev/nuker/pyro/fz.<init>:(Ljava/lang/Object;Ljava/util/function/Consumer;)V
        //   173: checkcast       Ldev/nuker/pyro/fw;
        //   176: putfield        dev/nuker/pyro/f5o.c:Ldev/nuker/pyro/fw;
        //   179: return         
        //   180: aconst_null    
        //   181: athrow         
        //   182: aconst_null    
        //   183: athrow         
        //   184: aconst_null    
        //   185: athrow         
        //    StackMapTable: 00 0C 0B 41 01 1E FF 00 1E 00 01 07 00 03 00 00 41 01 1E FF 00 18 00 01 07 00 03 00 07 07 00 03 08 00 6D 08 00 6D 07 00 28 08 00 75 08 00 75 07 00 03 FF 00 01 00 01 07 00 03 00 08 07 00 03 08 00 6D 08 00 6D 07 00 28 08 00 75 08 00 75 07 00 03 01 FF 00 1C 00 01 07 00 03 00 07 07 00 03 08 00 6D 08 00 6D 07 00 28 08 00 75 08 00 75 07 00 03 FF 00 0F 00 01 07 00 03 00 07 07 00 03 08 00 6D 08 00 6D 07 00 28 08 00 75 08 00 75 07 00 03 FF 00 01 00 01 06 00 00 FF 00 01 00 01 07 00 03 00 00
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
    
    @Override
    public void c(final boolean b, @Nullable final EntityPlayerSP entityPlayerSP, @Nullable final World world) {
        fbS.5Y(this, 359552197, b, entityPlayerSP, world);
    }
    
    public static void c(final f5o p0, final Minecraft p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            39
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            31
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: aload_1        
        //    18: putfield        dev/nuker/pyro/f5o.c:Lnet/minecraft/client/Minecraft;
        //    21: return         
        //    22: pop            
        //    23: goto            16
        //    26: pop            
        //    27: aconst_null    
        //    28: goto            22
        //    31: dup            
        //    32: ifnull          22
        //    35: checkcast       Ljava/lang/Throwable;
        //    38: athrow         
        //    39: dup            
        //    40: ifnull          26
        //    43: checkcast       Ljava/lang/Throwable;
        //    46: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 4F FD 00 03 07 00 03 07 00 54 45 07 00 4F 43 05 44 07 00 4F 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     31     39     Any
        //  31     39     31     39     Any
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
    
    public static Minecraft c(final f5o p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            129
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            121
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: getstatic       dev/nuker/pyro/fc.0:I
        //    19: ifeq            27
        //    22: ldc             487476267
        //    24: goto            29
        //    27: ldc             1847684608
        //    29: ldc             -448787250
        //    31: ixor           
        //    32: lookupswitch {
        //          -1956551986: 60
        //          -129089307: 27
        //          default: 108
        //        }
        //    60: aload_0        
        //    61: getstatic       dev/nuker/pyro/fc.1:I
        //    64: ifeq            72
        //    67: ldc             -1749211868
        //    69: goto            74
        //    72: ldc             1080755890
        //    74: ldc             101535404
        //    76: ixor           
        //    77: lookupswitch {
        //          -1850709112: 110
        //          1739631292: 72
        //          default: 104
        //        }
        //   104: getfield        dev/nuker/pyro/f5o.c:Lnet/minecraft/client/Minecraft;
        //   107: areturn        
        //   108: aconst_null    
        //   109: athrow         
        //   110: aconst_null    
        //   111: athrow         
        //   112: pop            
        //   113: goto            16
        //   116: pop            
        //   117: aconst_null    
        //   118: goto            112
        //   121: dup            
        //   122: ifnull          112
        //   125: checkcast       Ljava/lang/Throwable;
        //   128: athrow         
        //   129: dup            
        //   130: ifnull          116
        //   133: checkcast       Ljava/lang/Throwable;
        //   136: athrow         
        //    StackMapTable: 00 0E FF 00 0C 00 00 00 01 07 00 4F FC 00 03 07 00 03 0A 41 01 1E 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 03 41 07 00 03 41 07 00 4F 43 05 44 07 00 4F 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  0      12     121    129    Any
        //  121    129    121    129    Ljava/lang/ArrayIndexOutOfBoundsException;
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
