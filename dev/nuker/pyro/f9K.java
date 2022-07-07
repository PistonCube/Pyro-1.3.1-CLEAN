// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;

public class f9k extends fH
{
    @NotNull
    public f0g c;
    
    public f9k() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u2253\u1486\u8b5a\ub3cd\uc930\uec5b\ub202\ue74b\ud95e"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u2273\u1486\u8b5a\ub3cd\uc930\uec5b\ub202\ue74b\ud95e"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: ldc             "\u2271\u149f\u8b45\ub3d6\uc928\uec45\ub264\ue77d\ud967\ue959\ua6d6\u1e58\ue04f\uc5e7\u81c4\u88db\u57a1\u76b3\ubd2f\uc0f9\u2aa6\uc23e\u6be9\u2d42\ud726\u3430\u7d6b\u880d\u8010\u8c66\u8515\ufb72\u7150\u9a39\u1b4f"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: iconst_1       
        //    17: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //    20: getstatic       dev/nuker/pyro/fc.1:I
        //    23: ifeq            31
        //    26: ldc             1131275078
        //    28: goto            33
        //    31: ldc             -2087505537
        //    33: ldc             862724818
        //    35: ixor           
        //    36: lookupswitch {
        //          -1325460563: 64
        //          1879163284: 31
        //          default: 196
        //        }
        //    64: aload_0        
        //    65: aload_0        
        //    66: new             Ldev/nuker/pyro/f0g;
        //    69: dup            
        //    70: ldc             "\u2256\u149c\u8b5f"
        //    72: invokestatic    invokestatic   !!! ERROR
        //    75: ldc             "\u2276\u14bc\u8b7f"
        //    77: getstatic       dev/nuker/pyro/fc.0:I
        //    80: ifeq            88
        //    83: ldc             -1311412882
        //    85: goto            90
        //    88: ldc             1533066739
        //    90: ldc             623621545
        //    92: ixor           
        //    93: lookupswitch {
        //          -1795237689: 194
        //          1728608403: 88
        //          default: 120
        //        }
        //   120: invokestatic    invokestatic   !!! ERROR
        //   123: aconst_null    
        //   124: bipush          120
        //   126: bipush          30
        //   128: sipush          150
        //   131: iconst_0       
        //   132: bipush          64
        //   134: aconst_null    
        //   135: invokespecial   dev/nuker/pyro/f0g.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   138: checkcast       Ldev/nuker/pyro/f0n;
        //   141: invokevirtual   dev/nuker/pyro/f9k.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   144: checkcast       Ldev/nuker/pyro/f0g;
        //   147: getstatic       dev/nuker/pyro/fc.c:I
        //   150: ifge            158
        //   153: ldc             -1076643724
        //   155: goto            160
        //   158: ldc             -626590325
        //   160: ldc             2015891126
        //   162: ixor           
        //   163: lookupswitch {
        //          -939804990: 192
        //          1977688650: 158
        //          default: 188
        //        }
        //   188: putfield        dev/nuker/pyro/f9k.c:Ldev/nuker/pyro/f0g;
        //   191: return         
        //   192: aconst_null    
        //   193: athrow         
        //   194: aconst_null    
        //   195: athrow         
        //   196: aconst_null    
        //   197: athrow         
        //    StackMapTable: 00 0C FF 00 1F 00 01 07 00 03 00 00 41 01 1E FF 00 17 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 42 08 00 42 07 00 3E 07 00 3E FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 42 08 00 42 07 00 3E 07 00 3E 01 FF 00 1D 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 42 08 00 42 07 00 3E 07 00 3E FF 00 25 00 01 07 00 03 00 02 07 00 03 07 00 24 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 24 01 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 24 FF 00 03 00 01 07 00 03 00 02 07 00 03 07 00 24 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 42 08 00 42 07 00 3E 07 00 3E 01
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
    
    @NotNull
    public f0g c() {
        return fbS.8K(this, 592872269);
    }
}
