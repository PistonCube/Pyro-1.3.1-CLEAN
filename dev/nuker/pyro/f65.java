// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;

public class f65 extends fH
{
    public float c;
    
    public f65() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u23ec\u149d\u8ae8\ub3d0\uc9a3\uede2\ub229"
        //     3: getstatic       dev/nuker/pyro/fc.1:I
        //     6: ifeq            14
        //     9: ldc             1525264079
        //    11: goto            16
        //    14: ldc             1066811065
        //    16: ldc             1901285868
        //    18: ixor           
        //    19: lookupswitch {
        //          733675299: 14
        //          1321561941: 44
        //          default: 111
        //        }
        //    44: invokestatic    invokestatic   !!! ERROR
        //    47: ldc             "\u23cc\u149d\u8ae8\ub3d0\uc983\uede2\ub229"
        //    49: invokestatic    invokestatic   !!! ERROR
        //    52: ldc             "\u23de\u1483\u8af5\ub3d7\uc9a0\uede4\ub230"
        //    54: invokestatic    invokestatic   !!! ERROR
        //    57: getstatic       dev/nuker/pyro/fc.c:I
        //    60: ifge            68
        //    63: ldc             -449656287
        //    65: goto            70
        //    68: ldc             -491491833
        //    70: ldc             7219529
        //    72: ixor           
        //    73: lookupswitch {
        //          -446897304: 109
        //          1708286840: 68
        //          default: 100
        //        }
        //   100: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   103: aload_0        
        //   104: fconst_0       
        //   105: putfield        dev/nuker/pyro/f65.c:F
        //   108: return         
        //   109: aconst_null    
        //   110: athrow         
        //   111: aconst_null    
        //   112: athrow         
        //    StackMapTable: 00 08 FF 00 0E 00 01 06 00 02 06 07 00 2A FF 00 01 00 01 06 00 03 06 07 00 2A 01 FF 00 1B 00 01 06 00 02 06 07 00 2A FF 00 17 00 01 06 00 04 06 07 00 2A 07 00 2A 07 00 2A FF 00 01 00 01 06 00 05 06 07 00 2A 07 00 2A 07 00 2A 01 FF 00 1D 00 01 06 00 04 06 07 00 2A 07 00 2A 07 00 2A FF 00 08 00 01 06 00 04 06 07 00 2A 07 00 2A 07 00 2A FF 00 01 00 01 06 00 02 06 07 00 2A
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
    
    @f06(-30)
    @LauncherEventHide
    public void c(final f3i f3i) {
        fbS.fw(this, 1073650619, f3i);
    }
    
    static {
        throw t;
    }
}
