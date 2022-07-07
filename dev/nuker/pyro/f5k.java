// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public class f5K extends fH
{
    public f5K() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u23f8\u149a\u8af4\ub3cc\uc9d2\uedf6\ub22d\ue6c6\ud97c\ue9ad\ua720\u1e4d\ue1ef\uc5b3"
        //     3: getstatic       dev/nuker/pyro/fc.0:I
        //     6: ifeq            14
        //     9: ldc             284036324
        //    11: goto            16
        //    14: ldc             -1957491855
        //    16: ldc             1167537575
        //    18: ixor           
        //    19: lookupswitch {
        //          -1187924239: 14
        //          1434007875: 104
        //          default: 44
        //        }
        //    44: invokestatic    invokestatic   !!! ERROR
        //    47: ldc             "\u23d8\u149a\u8af4\ub3cc\uc9d2\uedf6\ub20d\ue6c6\ud97c\ue9ad\ua720\u1e4d\ue1ef\uc5b3"
        //    49: invokestatic    invokestatic   !!! ERROR
        //    52: ldc             "\u23d5\u149f\u8ae9\ub3d6\uc9cc\uede1\ub264\ue6d1\ud967\ue9bd\ua772\u1e58\ue1e3\uc5e7\u813f\u8965\u57a5\u770e\ubd38\uc054\u2b04\uc237\u6a0a\u2d55\ud7c1\u3582\u7d6b\u89a9\u801f\u8ccf\u84b8\ufb3b\u70cb\u9a03\u1b94\uf177\u496f"
        //    54: invokestatic    invokestatic   !!! ERROR
        //    57: getstatic       dev/nuker/pyro/fc.1:I
        //    60: ifeq            68
        //    63: ldc             -913336013
        //    65: goto            70
        //    68: ldc             -12452925
        //    70: ldc             -495318467
        //    72: ixor           
        //    73: lookupswitch {
        //          333762004: 68
        //          737514254: 106
        //          default: 100
        //        }
        //   100: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   103: return         
        //   104: aconst_null    
        //   105: athrow         
        //   106: aconst_null    
        //   107: athrow         
        //    StackMapTable: 00 08 FF 00 0E 00 01 06 00 02 06 07 00 26 FF 00 01 00 01 06 00 03 06 07 00 26 01 FF 00 1B 00 01 06 00 02 06 07 00 26 FF 00 17 00 01 06 00 04 06 07 00 26 07 00 26 07 00 26 FF 00 01 00 01 06 00 05 06 07 00 26 07 00 26 07 00 26 01 FF 00 1D 00 01 06 00 04 06 07 00 26 07 00 26 07 00 26 FF 00 03 00 01 06 00 02 06 07 00 26 FF 00 01 00 01 06 00 04 06 07 00 26 07 00 26 07 00 26
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
}
