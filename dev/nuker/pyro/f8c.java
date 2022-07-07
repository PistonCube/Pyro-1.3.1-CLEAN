// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import org.jetbrains.annotations.NotNull;

public class f8c extends fH
{
    public f0f<f7Z> c;
    
    public f8c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u226a\u1483\u8b02\ub3d0\uc958\uec6b"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u224a\u1483\u8b02\ub3d0\uc958\uec6b"
        //     8: getstatic       dev/nuker/pyro/fc.0:I
        //    11: ifeq            19
        //    14: ldc             856993986
        //    16: goto            21
        //    19: ldc             826647684
        //    21: ldc             -1358265443
        //    23: ixor           
        //    24: lookupswitch {
        //          -1675742369: 19
        //          -1638979815: 52
        //          default: 198
        //        }
        //    52: invokestatic    invokestatic   !!! ERROR
        //    55: ldc             "\u2258\u149f\u8b07\ub3d8\uc94f\uec6c\ub264\ue73f\ud96d\ue965\ua6ac\u1e5c\ue00b\uc5ae\u81ac\u88f0\u57ad\u76f6\ubd3a\uc0d9\u2a9c\uc233\u6bf9\u2d5a\ud742\u345c\u7d26\u885c\u8007\u8c0b\u8537\ufb35"
        //    57: invokestatic    invokestatic   !!! ERROR
        //    60: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    63: aload_0        
        //    64: aload_0        
        //    65: new             Ldev/nuker/pyro/f0f;
        //    68: dup            
        //    69: ldc             "\u226a\u1483\u8b02\ub3d0\uc958\uec6b\ub229\ue732\ud96c\ue920"
        //    71: invokestatic    invokestatic   !!! ERROR
        //    74: ldc             "\u2254\u149c\u8b14\ub3dc"
        //    76: invokestatic    invokestatic   !!! ERROR
        //    79: ldc             "\u2254\u149c\u8b14\ub3dc\uc916\uec6b\ub22b\ue77d\ud97d\ue936\ua6ba\u1e0c\ue01f\uc5a8\u81b0\u88a4\u57b7\u76e8\ubd2f\uc090\u2a85\uc22f\u6bf9\u2d58\ud740"
        //    81: invokestatic    invokestatic   !!! ERROR
        //    84: getstatic       dev/nuker/pyro/fc.1:I
        //    87: ifeq            95
        //    90: ldc             1324576082
        //    92: goto            97
        //    95: ldc             -389626747
        //    97: ldc             1817232102
        //    99: ixor           
        //   100: lookupswitch {
        //          88762797: 95
        //          581152692: 194
        //          default: 128
        //        }
        //   128: getstatic       dev/nuker/pyro/f7Z.1:Ldev/nuker/pyro/f7Z;
        //   131: checkcast       Ljava/lang/Enum;
        //   134: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   137: checkcast       Ldev/nuker/pyro/f0n;
        //   140: getstatic       dev/nuker/pyro/fc.c:I
        //   143: ifge            151
        //   146: ldc             1158385089
        //   148: goto            153
        //   151: ldc             -427811488
        //   153: ldc             -506061616
        //   155: ixor           
        //   156: lookupswitch {
        //          -1528983279: 196
        //          523150893: 151
        //          default: 184
        //        }
        //   184: invokevirtual   dev/nuker/pyro/f8c.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   187: checkcast       Ldev/nuker/pyro/f0f;
        //   190: putfield        dev/nuker/pyro/f8c.c:Ldev/nuker/pyro/f0f;
        //   193: return         
        //   194: aconst_null    
        //   195: athrow         
        //   196: aconst_null    
        //   197: athrow         
        //   198: aconst_null    
        //   199: athrow         
        //    StackMapTable: 00 0C FF 00 13 00 01 06 00 03 06 07 00 47 07 00 47 FF 00 01 00 01 06 00 04 06 07 00 47 07 00 47 01 FF 00 1E 00 01 06 00 03 06 07 00 47 07 00 47 FF 00 2A 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 41 08 00 41 07 00 47 07 00 47 07 00 47 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 41 08 00 41 07 00 47 07 00 47 07 00 47 01 FF 00 1E 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 41 08 00 41 07 00 47 07 00 47 07 00 47 FF 00 16 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 3B FF 00 01 00 01 07 00 03 00 04 07 00 03 07 00 03 07 00 3B 01 FF 00 1E 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 3B FF 00 09 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 41 08 00 41 07 00 47 07 00 47 07 00 47 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 3B FF 00 01 00 01 06 00 03 06 07 00 47 07 00 47
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
    
    static {
        throw t;
    }
    
    @f06(2)
    @LauncherEventHide
    public void c(@NotNull final f3i f3i) {
        fbS.fu(this, 1657323819, f3i);
    }
    
    @f06(-1)
    @LauncherEventHide
    public void c(@NotNull final f3e f3e) {
        fbS.5N(this, 1130190454, f3e);
    }
}
