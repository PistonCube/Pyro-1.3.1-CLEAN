// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

public class f7z extends fH
{
    @NotNull
    public f0d c;
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          196
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            188
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            180
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: aload_2        
        //    27: aload_3        
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //    35: goto            39
        //    38: athrow         
        //    39: iload_1        
        //    40: ifne            48
        //    43: ldc             1904634239
        //    45: goto            50
        //    48: ldc             1904634236
        //    50: ldc             -1757093330
        //    52: ixor           
        //    53: tableswitch {
        //          -846915934: 76
        //          -846915933: 168
        //          default: 43
        //        }
        //    76: getstatic       net/minecraft/init/Blocks.field_150432_aD:Lnet/minecraft/block/Block;
        //    79: ldc             0.98
        //    81: goto            85
        //    84: athrow         
        //    85: invokevirtual   net/minecraft/block/Block.setDefaultSlipperiness:(F)V
        //    88: goto            92
        //    91: athrow         
        //    92: getstatic       dev/nuker/pyro/fc.0:I
        //    95: ifeq            103
        //    98: ldc             1387400846
        //   100: goto            105
        //   103: ldc             -877436152
        //   105: ldc             -1167027964
        //   107: ixor           
        //   108: lookupswitch {
        //          -389898358: 169
        //          1956790809: 103
        //          default: 136
        //        }
        //   136: getstatic       net/minecraft/init/Blocks.field_150403_cj:Lnet/minecraft/block/Block;
        //   139: ldc             0.98
        //   141: goto            145
        //   144: athrow         
        //   145: invokevirtual   net/minecraft/block/Block.setDefaultSlipperiness:(F)V
        //   148: goto            152
        //   151: athrow         
        //   152: getstatic       net/minecraft/init/Blocks.field_185778_de:Lnet/minecraft/block/Block;
        //   155: ldc             0.98
        //   157: goto            161
        //   160: athrow         
        //   161: invokevirtual   net/minecraft/block/Block.setDefaultSlipperiness:(F)V
        //   164: goto            168
        //   167: athrow         
        //   168: return         
        //   169: aconst_null    
        //   170: athrow         
        //   171: pop            
        //   172: goto            24
        //   175: pop            
        //   176: aconst_null    
        //   177: goto            171
        //   180: dup            
        //   181: ifnull          171
        //   184: checkcast       Ljava/lang/Throwable;
        //   187: athrow         
        //   188: dup            
        //   189: ifnull          175
        //   192: checkcast       Ljava/lang/Throwable;
        //   195: athrow         
        //   196: aconst_null    
        //   197: athrow         
        //    StackMapTable: 00 21 43 07 00 1B 04 FF 00 0B 00 00 00 01 07 00 1B FF 00 03 00 04 07 00 03 01 07 00 3B 07 00 3D 00 00 46 07 00 1B FF 00 00 00 04 07 00 03 01 07 00 3B 07 00 3D 00 04 07 00 03 01 07 00 3B 07 00 3D 45 07 00 1B 00 03 04 41 01 19 47 07 00 1B FF 00 00 00 04 07 00 03 01 07 00 3B 07 00 3D 00 02 07 00 29 02 45 07 00 1B 00 0A 41 01 1E 47 07 00 1B FF 00 00 00 04 07 00 03 01 07 00 3B 07 00 3D 00 02 07 00 29 02 45 07 00 1B 00 FF 00 07 00 00 00 01 07 00 1B FF 00 00 00 04 07 00 03 01 07 00 3B 07 00 3D 00 02 07 00 29 02 45 07 00 1B 00 00 41 07 00 1B 43 05 44 07 00 1B 47 05 47 07 00 1B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     180    188    Any
        //  180    188    180    188    Ljava/lang/NegativeArraySizeException;
        //  196    198    3      8      Ljava/lang/AssertionError;
        //  31     38     38     39     Any
        //  32     38     31     32     Any
        //  31     38     38     39     Any
        //  32     38     38     39     Any
        //  32     38     38     39     Any
        //  84     91     91     92     Any
        //  84     91     84     85     Any
        //  84     91     91     92     Ljava/lang/AssertionError;
        //  84     91     3      8      Ljava/lang/AssertionError;
        //  84     91     3      8      Any
        //  144    151    151    152    Any
        //  145    151    144    145    Ljava/util/ConcurrentModificationException;
        //  144    151    144    145    Any
        //  144    151    151    152    Ljava/lang/NullPointerException;
        //  145    151    151    152    Ljava/lang/ClassCastException;
        //  161    167    167    168    Any
        //  161    167    3      8      Any
        //  161    167    3      8      Any
        //  161    167    167    168    Any
        //  161    167    167    168    Ljava/lang/ClassCastException;
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
    
    @NotNull
    public f0d c() {
        return fbS.g2(this, 536015685);
    }
    
    @f06
    @LauncherEventHide
    public void c(@Nullable final f3h f3h) {
        fbS.hD(this, 1543018623, f3h);
    }
    
    public f7z() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            11
        //     6: ldc             1112848523
        //     8: goto            13
        //    11: ldc             775255123
        //    13: ldc             1113115966
        //    15: ixor           
        //    16: lookupswitch {
        //          -1994899849: 11
        //           816565: 236
        //          default: 44
        //        }
        //    44: aload_0        
        //    45: ldc             "\u2208\u1490\u8b1d\ub3ca\uc95e\uec02\ub221\ue731"
        //    47: getstatic       dev/nuker/pyro/fc.c:I
        //    50: ifge            58
        //    53: ldc             -1603596268
        //    55: goto            60
        //    58: ldc             1016292430
        //    60: ldc             -746385816
        //    62: ixor           
        //    63: lookupswitch {
        //          -284136922: 88
        //          1944591996: 58
        //          default: 234
        //        }
        //    88: invokestatic    invokestatic   !!! ERROR
        //    91: ldc             "\u2228\u1490\u8b1d\ub3ea\uc95e\uec02\ub221\ue731"
        //    93: invokestatic    invokestatic   !!! ERROR
        //    96: ldc             "\u2220\u149f\u8b14\ub3d6\uc959\uec14\ub264\ue72c\ud967\ue928\ua687\u1e58\ue01e\uc5e7\u81ad\u889d\u57a8\u76fb\ubd7d\uc087\u2af2\uc228\u6bec\u2d53\ud74d\u3424\u7d24\u8855\u8051\u8c13\u8542\ufb37\u716b\u9a56\u1b18\uf087\u497f\u899f\uca83\uffae\ub779\u41fa\ub802\ub34d\u4cb4\u8b54\u7c68\ucfde\u7d4a\uea0f\ue73f\u16ca\uefac\u379d\u4633\ue018\u0a13\u8764\u19dc\u0fcc\u76f9"
        //    98: invokestatic    invokestatic   !!! ERROR
        //   101: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   104: aload_0        
        //   105: aload_0        
        //   106: new             Ldev/nuker/pyro/f0d;
        //   109: dup            
        //   110: ldc             "\u2212\u1483\u8b1d\ub3dc\uc94a"
        //   112: invokestatic    invokestatic   !!! ERROR
        //   115: ldc             "\u2232\u1483\u8b1d\ub3dc\uc94a"
        //   117: invokestatic    invokestatic   !!! ERROR
        //   120: aconst_null    
        //   121: ldc2_w          0.4
        //   124: ldc2_w          0.1
        //   127: ldc2_w          0.98
        //   130: dconst_0       
        //   131: bipush          64
        //   133: aconst_null    
        //   134: getstatic       dev/nuker/pyro/fc.c:I
        //   137: ifge            145
        //   140: ldc             474523291
        //   142: goto            147
        //   145: ldc             1026487096
        //   147: ldc             774047660
        //   149: ixor           
        //   150: lookupswitch {
        //          845914423: 240
        //          1153219401: 145
        //          default: 176
        //        }
        //   176: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   179: checkcast       Ldev/nuker/pyro/f0n;
        //   182: getstatic       dev/nuker/pyro/fc.0:I
        //   185: ifeq            193
        //   188: ldc             -866635059
        //   190: goto            195
        //   193: ldc             -739293281
        //   195: ldc             -1762578064
        //   197: ixor           
        //   198: lookupswitch {
        //          -1779287709: 193
        //          1521025981: 238
        //          default: 224
        //        }
        //   224: invokevirtual   dev/nuker/pyro/f7z.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   227: checkcast       Ldev/nuker/pyro/f0d;
        //   230: putfield        dev/nuker/pyro/f7z.c:Ldev/nuker/pyro/f0d;
        //   233: return         
        //   234: aconst_null    
        //   235: athrow         
        //   236: aconst_null    
        //   237: athrow         
        //   238: aconst_null    
        //   239: athrow         
        //   240: aconst_null    
        //   241: athrow         
        //    StackMapTable: 00 10 0B 41 01 1E FF 00 0D 00 01 06 00 02 06 07 00 81 FF 00 01 00 01 06 00 03 06 07 00 81 01 FF 00 1B 00 01 06 00 02 06 07 00 81 FF 00 38 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 00 6A 08 00 6A 07 00 81 07 00 81 05 03 03 03 03 01 05 FF 00 01 00 01 07 00 03 00 0E 07 00 03 07 00 03 08 00 6A 08 00 6A 07 00 81 07 00 81 05 03 03 03 03 01 05 01 FF 00 1C 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 00 6A 08 00 6A 07 00 81 07 00 81 05 03 03 03 03 01 05 FF 00 10 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 77 FF 00 01 00 01 07 00 03 00 04 07 00 03 07 00 03 07 00 77 01 FF 00 1C 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 77 FF 00 09 00 01 06 00 02 06 07 00 81 01 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 77 FF 00 01 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 00 6A 08 00 6A 07 00 81 07 00 81 05 03 03 03 03 01 05
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
}
