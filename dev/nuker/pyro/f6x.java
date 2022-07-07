// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.util.SoundEvent;
import java.util.List;

public class f6x extends fH
{
    public List<SoundEvent> c;
    
    public f6x() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u222e\u149c\u8b2a\ub3d6\uc97a\uec28\ub220\ue718\ud969\ue91b"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u220e\u149c\u8b0a\ub3d6\uc97a\uec28\ub220\ue738\ud969\ue91b"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: aconst_null    
        //    12: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    15: aload_0        
        //    16: bipush          7
        //    18: anewarray       Lnet/minecraft/util/SoundEvent;
        //    21: dup            
        //    22: iconst_0       
        //    23: getstatic       net/minecraft/init/SoundEvents.field_187719_p:Lnet/minecraft/util/SoundEvent;
        //    26: aastore        
        //    27: dup            
        //    28: iconst_1       
        //    29: getstatic       dev/nuker/pyro/fc.0:I
        //    32: ifeq            40
        //    35: ldc             1194053072
        //    37: goto            42
        //    40: ldc             -2006083323
        //    42: ldc             300613635
        //    44: ixor           
        //    45: lookupswitch {
        //          673889349: 40
        //          1455476179: 199
        //          default: 72
        //        }
        //    72: getstatic       net/minecraft/init/SoundEvents.field_191258_p:Lnet/minecraft/util/SoundEvent;
        //    75: aastore        
        //    76: dup            
        //    77: iconst_2       
        //    78: getstatic       dev/nuker/pyro/fc.1:I
        //    81: ifeq            89
        //    84: ldc             1006628203
        //    86: goto            91
        //    89: ldc             687274249
        //    91: ldc             352069114
        //    93: ixor           
        //    94: lookupswitch {
        //          788777105: 203
        //          1698247570: 89
        //          default: 120
        //        }
        //   120: getstatic       net/minecraft/init/SoundEvents.field_187716_o:Lnet/minecraft/util/SoundEvent;
        //   123: aastore        
        //   124: dup            
        //   125: iconst_3       
        //   126: getstatic       net/minecraft/init/SoundEvents.field_187725_r:Lnet/minecraft/util/SoundEvent;
        //   129: aastore        
        //   130: dup            
        //   131: iconst_4       
        //   132: getstatic       net/minecraft/init/SoundEvents.field_187722_q:Lnet/minecraft/util/SoundEvent;
        //   135: aastore        
        //   136: dup            
        //   137: iconst_5       
        //   138: getstatic       net/minecraft/init/SoundEvents.field_187713_n:Lnet/minecraft/util/SoundEvent;
        //   141: aastore        
        //   142: dup            
        //   143: bipush          6
        //   145: getstatic       net/minecraft/init/SoundEvents.field_187728_s:Lnet/minecraft/util/SoundEvent;
        //   148: aastore        
        //   149: getstatic       dev/nuker/pyro/fc.0:I
        //   152: ifeq            160
        //   155: ldc             801757155
        //   157: goto            162
        //   160: ldc             -1308160419
        //   162: ldc             -398703740
        //   164: ixor           
        //   165: lookupswitch {
        //          -940207001: 201
        //          1576258427: 160
        //          default: 192
        //        }
        //   192: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   195: putfield        dev/nuker/pyro/f6x.c:Ljava/util/List;
        //   198: return         
        //   199: aconst_null    
        //   200: athrow         
        //   201: aconst_null    
        //   202: athrow         
        //   203: aconst_null    
        //   204: athrow         
        //    StackMapTable: 00 0C FF 00 28 00 01 07 00 03 00 04 07 00 03 07 00 4C 07 00 4C 01 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 4C 07 00 4C 01 01 FF 00 1D 00 01 07 00 03 00 04 07 00 03 07 00 4C 07 00 4C 01 FF 00 10 00 01 07 00 03 00 04 07 00 03 07 00 4C 07 00 4C 01 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 4C 07 00 4C 01 01 FF 00 1C 00 01 07 00 03 00 04 07 00 03 07 00 4C 07 00 4C 01 FF 00 27 00 01 07 00 03 00 02 07 00 03 07 00 4C FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 4C 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 4C FF 00 06 00 01 07 00 03 00 04 07 00 03 07 00 4C 07 00 4C 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 4C FF 00 01 00 01 07 00 03 00 04 07 00 03 07 00 4C 07 00 4C 01
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
    public void c(final f34 f34) {
        fbS.1(this, 1078337855, f34);
    }
}
