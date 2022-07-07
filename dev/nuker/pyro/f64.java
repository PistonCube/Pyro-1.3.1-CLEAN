// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import org.jetbrains.annotations.NotNull;

public class f64 extends fH
{
    @NotNull
    public f0a c;
    @NotNull
    public fbu c;
    
    public f64() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifge            11
        //     6: ldc             106425341
        //     8: goto            13
        //    11: ldc             -1818795323
        //    13: ldc             -1204547729
        //    15: ixor           
        //    16: lookupswitch {
        //          -1100749678: 290
        //          -1002837269: 11
        //          default: 44
        //        }
        //    44: aload_0        
        //    45: ldc             "\u23ed\u149d\u8ae9\ub3d0\uc9a2\uedec\ub22f"
        //    47: invokestatic    invokestatic   !!! ERROR
        //    50: ldc             "\u23cd\u149d\u8ae9\ub3d0\uc982\uedcc\ub20f"
        //    52: invokestatic    invokestatic   !!! ERROR
        //    55: ldc             "\u23cd\u1487\u8ae9\ub3dc\uc9ae\uedfa\ub237\ue690\ud97c\ue9df\ua76a\u1e5c\ue1e6\uc5a2\u8141\u8974\u57aa\u7701\ubd7d\uc075\u2b11\uc22e\u6a5d\u2d50\ud7a0\u3586\u7d26\u89fe\u8016\u8cf2\u84b8\ufb26\u70cb\u9a18\u1be2\uf12b\u4977\u8878\uca85\uff4c\ub6d1\u41f7\ub9a4\ub34e\u4c1a\u8aeb\u7c29\uce14\u7d68\uea89\ue69a"
        //    57: invokestatic    invokestatic   !!! ERROR
        //    60: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    63: aload_0        
        //    64: getstatic       dev/nuker/pyro/fc.0:I
        //    67: ifeq            75
        //    70: ldc             -2036125088
        //    72: goto            77
        //    75: ldc             -801902937
        //    77: ldc             -1021090840
        //    79: ixor           
        //    80: lookupswitch {
        //          -895004314: 75
        //          1166037384: 292
        //          default: 108
        //        }
        //   108: aload_0        
        //   109: new             Ldev/nuker/pyro/f0a;
        //   112: dup            
        //   113: ldc             "\u23ff\u1487\u8afc\ub3cd\uc9b0"
        //   115: getstatic       dev/nuker/pyro/fc.1:I
        //   118: ifeq            126
        //   121: ldc             -801601285
        //   123: goto            128
        //   126: ldc             1224512724
        //   128: ldc             -430622698
        //   130: ixor           
        //   131: lookupswitch {
        //          -1364611902: 156
        //          913158381: 126
        //          default: 288
        //        }
        //   156: invokestatic    invokestatic   !!! ERROR
        //   159: ldc             "\u23df\u1487\u8afc\ub3cd\uc9b0"
        //   161: invokestatic    invokestatic   !!! ERROR
        //   164: ldc             "\u23de\u1486\u8af3\ub3ca\uc9e3\uedfe\ub22c\ue6d5\ud928\ue99f\ua739\u1e58\ue1f5\uc5b3\u8144\u8931\u57a7\u771a\ubd30\uc061\u2b1f\uc235\u6a19"
        //   166: invokestatic    invokestatic   !!! ERROR
        //   169: iconst_1       
        //   170: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   173: checkcast       Ldev/nuker/pyro/f0n;
        //   176: getstatic       dev/nuker/pyro/fc.0:I
        //   179: ifeq            187
        //   182: ldc             -2028633101
        //   184: goto            189
        //   187: ldc             2104834347
        //   189: ldc             1590130428
        //   191: ixor           
        //   192: lookupswitch {
        //          -704685631: 187
        //          -640486129: 284
        //          default: 220
        //        }
        //   220: invokevirtual   dev/nuker/pyro/f64.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   223: checkcast       Ldev/nuker/pyro/f0a;
        //   226: putfield        dev/nuker/pyro/f64.c:Ldev/nuker/pyro/f0a;
        //   229: getstatic       dev/nuker/pyro/fc.c:I
        //   232: ifge            240
        //   235: ldc             -1990639122
        //   237: goto            242
        //   240: ldc             1564006207
        //   242: ldc             -1884600172
        //   244: ixor           
        //   245: lookupswitch {
        //          -230824012: 240
        //          116525434: 286
        //          default: 272
        //        }
        //   272: aload_0        
        //   273: new             Ldev/nuker/pyro/fbu;
        //   276: dup            
        //   277: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   280: putfield        dev/nuker/pyro/f64.c:Ldev/nuker/pyro/fbu;
        //   283: return         
        //   284: aconst_null    
        //   285: athrow         
        //   286: aconst_null    
        //   287: athrow         
        //   288: aconst_null    
        //   289: athrow         
        //   290: aconst_null    
        //   291: athrow         
        //   292: aconst_null    
        //   293: athrow         
        //    StackMapTable: 00 14 0B 41 01 1E FF 00 1E 00 01 07 00 03 00 01 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5E 07 00 03 FF 00 11 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 6D 08 00 6D 07 00 4D FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 6D 08 00 6D 07 00 4D 01 FF 00 1B 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 6D 08 00 6D 07 00 4D FF 00 1E 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 3A FF 00 01 00 01 07 00 03 00 04 07 00 03 07 00 03 07 00 3A 01 FF 00 1E 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 3A 13 41 01 1D FF 00 0B 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 3A 01 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 6D 08 00 6D 07 00 4D FF 00 01 00 01 06 00 00 FF 00 01 00 01 07 00 03 00 01 07 00 03
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
    
    @NotNull
    public fbu c() {
        return fbS.71(this, 804793132);
    }
    
    static {
        throw t;
    }
    
    @NotNull
    public f0a 0() {
        return fbS.0D(this, 1744160769);
    }
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f3h f3h) {
        fbS.hG(this, 1581561102, f3h);
    }
}
