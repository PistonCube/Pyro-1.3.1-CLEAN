// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.gui.ScaledResolution;

public class f4A extends f49
{
    public fbu c;
    public float c;
    
    @Override
    public void c(final f4d f4d, final int n, final ScaledResolution scaledResolution, final float n2, final float n3) {
        fbS.bR(this, 117163653, f4d, n, scaledResolution, n2, n3);
    }
    
    static {
        throw t;
    }
    
    @Override
    public float 3() {
        return fbS.aV(this, 286621217);
    }
    
    @f06
    public void c(final f34 f34) {
        fbS.4(this, 323096285, f34);
    }
    
    public f4A() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifge            11
        //     6: ldc             893366866
        //     8: goto            13
        //    11: ldc             1700285472
        //    13: ldc             -1438707824
        //    15: ixor           
        //    16: lookupswitch {
        //          -1627341374: 114
        //          -2984524: 11
        //          default: 44
        //        }
        //    44: aload_0        
        //    45: ldc             "\u238c\u1496\u8a9c\ub3cf\uc9f1\ued8b\ub20a\ue6ac\ud97c\ue9b5\ua75c\u1e5f\ue197\uc5a8\u810e\u8906\u57ad\u7768\ubd3a"
        //    47: invokestatic    invokestatic   !!! ERROR
        //    50: invokespecial   dev/nuker/pyro/f49.<init>:(Ljava/lang/String;)V
        //    53: getstatic       dev/nuker/pyro/fc.1:I
        //    56: ifeq            64
        //    59: ldc             -700116552
        //    61: goto            66
        //    64: ldc             -1040630640
        //    66: ldc             -723902341
        //    68: ixor           
        //    69: lookupswitch {
        //          43987395: 116
        //          1545170845: 64
        //          default: 96
        //        }
        //    96: aload_0        
        //    97: new             Ldev/nuker/pyro/fbu;
        //   100: dup            
        //   101: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   104: putfield        dev/nuker/pyro/f4A.c:Ldev/nuker/pyro/fbu;
        //   107: aload_0        
        //   108: ldc             50.0
        //   110: putfield        dev/nuker/pyro/f4A.c:F
        //   113: return         
        //   114: aconst_null    
        //   115: athrow         
        //   116: aconst_null    
        //   117: athrow         
        //    StackMapTable: 00 08 0B 41 01 1E FF 00 13 00 01 07 00 03 00 00 41 01 1D FF 00 11 00 01 06 00 00 FF 00 01 00 01 07 00 03 00 00
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
    
    @Override
    public float c() {
        return fbS.aE(this, 2105225245);
    }
    
    @Override
    public boolean 4() {
        return fbS.eI(this, 673075838);
    }
}
