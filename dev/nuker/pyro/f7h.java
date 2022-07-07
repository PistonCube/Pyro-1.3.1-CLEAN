// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;

public class f7H extends fH
{
    public f0f<f7G> c;
    
    @f06
    @LauncherEventHide
    public void c(final f3h f3h) {
        fbS.hG(this, 1581561101, f3h);
    }
    
    public f7H() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u223d\u149c\u8b2c\ub3d8\uc99c\uec39"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u221d\u149c\u8b0c\ub3d8\uc99c\uec39"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: ldc             "\u2212\u149f\u8b26\ub3d6\uc987\uec26\ub264\ue71e\ud967\ue9f6\ua6b5\u1e58\ue02c\uc5e7\u8174\u88bc\u57a1\u76d4\ubd38\uc051\u2ad5\uc27b\u6bcc\u2d57\ud78d\u345a\u7d6b\u886d\u8010\u8cc9\u8572\ufb35\u7110\u9a56\u1bdf\uf0ba\u493c\u89a5\uca83\uff66\ub71f\u41f2\ub83a\ub346\u4c66\u8b25\u7c60\ucff0\u7d4d\uea84\ue706\u16cb\uef85\u378f\u46f7\ue02c\u0a12\u8705"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    19: aload_0        
        //    20: new             Ldev/nuker/pyro/f0f;
        //    23: dup            
        //    24: ldc             "\u223e\u149c\u8b2e\ub3dc"
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            37
        //    32: ldc             -434649340
        //    34: goto            39
        //    37: ldc             -1818122100
        //    39: ldc             2033822991
        //    41: ixor           
        //    42: lookupswitch {
        //          -1898792368: 37
        //          -1624348149: 139
        //          default: 68
        //        }
        //    68: invokestatic    invokestatic   !!! ERROR
        //    71: ldc             "\u221e\u149c\u8b2e\ub3dc"
        //    73: invokestatic    invokestatic   !!! ERROR
        //    76: aconst_null    
        //    77: getstatic       dev/nuker/pyro/f7G.c:Ldev/nuker/pyro/f7G;
        //    80: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //    83: putfield        dev/nuker/pyro/f7H.c:Ldev/nuker/pyro/f0f;
        //    86: aload_0        
        //    87: aload_0        
        //    88: getfield        dev/nuker/pyro/f7H.c:Ldev/nuker/pyro/f0f;
        //    91: getstatic       dev/nuker/pyro/fc.0:I
        //    94: ifeq            102
        //    97: ldc             1171290592
        //    99: goto            104
        //   102: ldc             93916143
        //   104: ldc             692512324
        //   106: ixor           
        //   107: lookupswitch {
        //          752872875: 132
        //          1821810596: 102
        //          default: 137
        //        }
        //   132: invokevirtual   dev/nuker/pyro/f7H.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   135: pop            
        //   136: return         
        //   137: aconst_null    
        //   138: athrow         
        //   139: aconst_null    
        //   140: athrow         
        //    StackMapTable: 00 08 FF 00 25 00 01 07 00 03 00 04 07 00 03 08 00 14 08 00 14 07 00 46 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 14 08 00 14 07 00 46 01 FF 00 1C 00 01 07 00 03 00 04 07 00 03 08 00 14 08 00 14 07 00 46 FF 00 21 00 01 07 00 03 00 02 07 00 03 07 00 25 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 25 01 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 25 FF 00 04 00 01 07 00 03 00 02 07 00 03 07 00 25 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 00 14 08 00 14 07 00 46
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
    
    @f06
    @LauncherEventHide
    public void c(final f30 f30) {
        fbS.7l(this, 1508755793, f30);
    }
}
