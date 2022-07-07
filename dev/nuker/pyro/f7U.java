// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;
import dev.nuker.pyro.security.inject.LauncherEventHide;

public class f7u extends fH
{
    public f0f<f7t> c;
    public int 1;
    public boolean c;
    
    public f7u() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            11
        //     6: ldc             66795374
        //     8: goto            13
        //    11: ldc             341020449
        //    13: ldc             804364673
        //    15: ixor           
        //    16: lookupswitch {
        //          738891503: 245
        //          1118691870: 11
        //          default: 44
        //        }
        //    44: aload_0        
        //    45: ldc             "\u220a\u1492\u8b0e\ub3cd\uc950\uec1d\ub22d\ue73d"
        //    47: invokestatic    invokestatic   !!! ERROR
        //    50: ldc             "\u222a\u1492\u8b0e\ub3cd\uc970\uec1d\ub22d\ue73d"
        //    52: invokestatic    invokestatic   !!! ERROR
        //    55: ldc             "\u222d\u149f\u8b11\ub3d6\uc954\uec19\ub264\ue729\ud967\ue925\ua68a\u1e58\ue01b\uc5e7\u81ba\u889e\u57b2\u76f0\ubd7d\uc08a\u2aff\uc228\u6be9\u2d53\ud740\u3429\u7d22\u8850\u8051\u8c00\u854d\ufb26\u7127\u9a04"
        //    57: invokestatic    invokestatic   !!! ERROR
        //    60: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    63: aload_0        
        //    64: new             Ldev/nuker/pyro/f0f;
        //    67: dup            
        //    68: ldc             "\u2201\u149c\u8b19\ub3dc"
        //    70: invokestatic    invokestatic   !!! ERROR
        //    73: ldc             "\u2221\u149c\u8b19\ub3dc"
        //    75: getstatic       dev/nuker/pyro/fc.1:I
        //    78: ifeq            86
        //    81: ldc             861672395
        //    83: goto            88
        //    86: ldc             -560239094
        //    88: ldc             803829927
        //    90: ixor           
        //    91: lookupswitch {
        //          -244181331: 116
        //          481651564: 86
        //          default: 251
        //        }
        //   116: invokestatic    invokestatic   !!! ERROR
        //   119: aconst_null    
        //   120: getstatic       dev/nuker/pyro/f7t.c:Ldev/nuker/pyro/f7t;
        //   123: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   126: getstatic       dev/nuker/pyro/fc.0:I
        //   129: ifeq            137
        //   132: ldc             -1409858637
        //   134: goto            139
        //   137: ldc             -688712292
        //   139: ldc             -2057093107
        //   141: ixor           
        //   142: lookupswitch {
        //          781452222: 247
        //          1605403324: 137
        //          default: 168
        //        }
        //   168: putfield        dev/nuker/pyro/f7u.c:Ldev/nuker/pyro/f0f;
        //   171: aload_0        
        //   172: iconst_0       
        //   173: putfield        dev/nuker/pyro/f7u.1:I
        //   176: aload_0        
        //   177: iconst_0       
        //   178: putfield        dev/nuker/pyro/f7u.c:Z
        //   181: aload_0        
        //   182: aload_0        
        //   183: getstatic       dev/nuker/pyro/fc.1:I
        //   186: ifeq            194
        //   189: ldc             -1882625106
        //   191: goto            196
        //   194: ldc             467042982
        //   196: ldc             -1873387674
        //   198: ixor           
        //   199: lookupswitch {
        //          -1877770902: 194
        //          530527432: 249
        //          default: 224
        //        }
        //   224: getfield        dev/nuker/pyro/f7u.c:Ldev/nuker/pyro/f0f;
        //   227: invokevirtual   dev/nuker/pyro/f7u.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   230: pop            
        //   231: aload_0        
        //   232: getfield        dev/nuker/pyro/f7u.c:Ldev/nuker/pyro/f0f;
        //   235: aload_0        
        //   236: invokedynamic   BootstrapMethod #0, accept:(Ldev/nuker/pyro/f7u;)Ljava/util/function/Consumer;
        //   241: invokevirtual   dev/nuker/pyro/f0f.c:(Ljava/util/function/Consumer;)V
        //   244: return         
        //   245: aconst_null    
        //   246: athrow         
        //   247: aconst_null    
        //   248: athrow         
        //   249: aconst_null    
        //   250: athrow         
        //   251: aconst_null    
        //   252: athrow         
        //    StackMapTable: 00 10 0B 41 01 1E FF 00 29 00 01 07 00 03 00 05 07 00 03 08 00 40 08 00 40 07 00 5B 07 00 5B FF 00 01 00 01 07 00 03 00 06 07 00 03 08 00 40 08 00 40 07 00 5B 07 00 5B 01 FF 00 1B 00 01 07 00 03 00 05 07 00 03 08 00 40 08 00 40 07 00 5B 07 00 5B FF 00 14 00 01 07 00 03 00 02 07 00 03 07 00 25 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 25 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 25 FF 00 19 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 14 00 01 06 00 00 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 25 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 40 08 00 40 07 00 5B 07 00 5B
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
    
    @f06
    @LauncherEventHide
    public void c(final f34 f34) {
        fbS.0(this, 751898885, f34);
    }
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          197
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            189
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            181
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
        //    39: aload_0        
        //    40: aload_0        
        //    41: getfield        dev/nuker/pyro/f7u.c:Ldev/nuker/pyro/f0f;
        //    44: goto            48
        //    47: athrow         
        //    48: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //    51: goto            55
        //    54: athrow         
        //    55: getstatic       dev/nuker/pyro/fc.1:I
        //    58: ifeq            66
        //    61: ldc             -879852322
        //    63: goto            68
        //    66: ldc             1402220608
        //    68: ldc             1783633447
        //    70: ixor           
        //    71: lookupswitch {
        //          -1579248903: 168
        //          -347478381: 66
        //          default: 96
        //        }
        //    96: goto            100
        //    99: athrow         
        //   100: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   103: goto            107
        //   106: athrow         
        //   107: goto            111
        //   110: athrow         
        //   111: invokevirtual   dev/nuker/pyro/f7u.4:(Ljava/lang/String;)V
        //   114: goto            118
        //   117: athrow         
        //   118: aload_0        
        //   119: iconst_0       
        //   120: getstatic       dev/nuker/pyro/fc.0:I
        //   123: ifeq            131
        //   126: ldc             1382905743
        //   128: goto            133
        //   131: ldc             660532960
        //   133: ldc             -1386860763
        //   135: ixor           
        //   136: lookupswitch {
        //          -1979137595: 164
        //          -12887894: 131
        //          default: 170
        //        }
        //   164: putfield        dev/nuker/pyro/f7u.c:Z
        //   167: return         
        //   168: aconst_null    
        //   169: athrow         
        //   170: aconst_null    
        //   171: athrow         
        //   172: pop            
        //   173: goto            24
        //   176: pop            
        //   177: aconst_null    
        //   178: goto            172
        //   181: dup            
        //   182: ifnull          172
        //   185: checkcast       Ljava/lang/Throwable;
        //   188: athrow         
        //   189: dup            
        //   190: ifnull          176
        //   193: checkcast       Ljava/lang/Throwable;
        //   196: athrow         
        //   197: aconst_null    
        //   198: athrow         
        //    RuntimeInvisibleTypeAnnotations: 00 02 16 01 00 00 66 00 00 16 02 00 00 66 00 00
        //    StackMapTable: 00 21 43 07 00 7A 04 FF 00 0B 00 00 00 01 07 00 7A FF 00 03 00 04 07 00 03 01 07 00 90 07 00 92 00 00 46 07 00 6E FF 00 00 00 04 07 00 03 01 07 00 90 07 00 92 00 04 07 00 03 01 07 00 90 07 00 92 45 07 00 7A 00 FF 00 07 00 00 00 01 07 00 7A FF 00 00 00 04 07 00 03 01 07 00 90 07 00 92 00 02 07 00 03 07 00 25 45 07 00 7A FF 00 00 00 04 07 00 03 01 07 00 90 07 00 92 00 02 07 00 03 07 00 94 FF 00 0A 00 04 07 00 03 01 07 00 90 07 00 92 00 02 07 00 03 07 00 94 FF 00 01 00 04 07 00 03 01 07 00 90 07 00 92 00 03 07 00 03 07 00 94 01 FF 00 1B 00 04 07 00 03 01 07 00 90 07 00 92 00 02 07 00 03 07 00 94 42 07 00 7A FF 00 00 00 04 07 00 03 01 07 00 90 07 00 92 00 02 07 00 03 07 00 94 45 07 00 7A FF 00 00 00 04 07 00 03 01 07 00 90 07 00 92 00 02 07 00 03 07 00 5B 42 07 00 7A FF 00 00 00 04 07 00 03 01 07 00 90 07 00 92 00 02 07 00 03 07 00 5B 45 07 00 7A 00 FF 00 0C 00 04 07 00 03 01 07 00 90 07 00 92 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 01 07 00 90 07 00 92 00 03 07 00 03 01 01 FF 00 1E 00 04 07 00 03 01 07 00 90 07 00 92 00 02 07 00 03 01 FF 00 03 00 04 07 00 03 01 07 00 90 07 00 92 00 02 07 00 03 07 00 94 FF 00 01 00 04 07 00 03 01 07 00 90 07 00 92 00 02 07 00 03 01 41 07 00 96 43 05 44 07 00 96 47 05 47 07 00 7A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     181    189    Ljava/lang/NumberFormatException;
        //  181    189    181    189    Ljava/util/NoSuchElementException;
        //  197    199    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  31     38     38     39     Any
        //  32     38     3      8      Any
        //  32     38     38     39     Any
        //  32     38     31     32     Ljava/lang/AssertionError;
        //  32     38     3      8      Ljava/lang/AssertionError;
        //  48     54     54     55     Any
        //  48     54     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  48     54     3      8      Any
        //  48     54     3      8      Ljava/lang/IllegalArgumentException;
        //  48     54     3      8      Ljava/lang/ArithmeticException;
        //  99     106    106    107    Any
        //  100    106    99     100    Ljava/lang/AssertionError;
        //  99     106    106    107    Ljava/lang/UnsupportedOperationException;
        //  99     106    99     100    Any
        //  100    106    99     100    Any
        //  110    117    117    118    Any
        //  111    117    117    118    Any
        //  110    117    117    118    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  110    117    110    111    Any
        //  110    117    117    118    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 75 out of bounds for length 75
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
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
    
    public void c(final f0n f0n) {
        fbS.dc(this, 4716972, f0n);
    }
    
    @f06(4)
    @LauncherEventHide
    public void c(final f3e f3e) {
        fbS.5P(this, 90819808, f3e);
    }
    
    static {
        throw t;
    }
}
