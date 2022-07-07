// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

public class f84 extends fH
{
    @NotNull
    public f0g c;
    @NotNull
    public f0a c;
    @NotNull
    public f0g 0;
    public int 1;
    public float c;
    
    public void 3(final int n) {
        fbS.6t(this, 462360648, n);
    }
    
    public void c(final float n) {
        fbS.8v(this, 203608477, n);
    }
    
    @NotNull
    public f0g 2() {
        return fbS.8R(this, 1756254154);
    }
    
    public int 1() {
        return fbS.bg(this, 2031075164);
    }
    
    public float 3() {
        return fbS.av(this, 823516470);
    }
    
    public float c(final float p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          120
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            112
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            104
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: fload_1        
        //    25: ldc             360.0
        //    27: iload_2        
        //    28: i2f            
        //    29: fdiv           
        //    30: fdiv           
        //    31: goto            35
        //    34: athrow         
        //    35: invokestatic    kotlin/math/MathKt.roundToInt:(F)I
        //    38: goto            42
        //    41: athrow         
        //    42: i2f            
        //    43: ldc             360.0
        //    45: getstatic       dev/nuker/pyro/fc.1:I
        //    48: ifeq            56
        //    51: ldc             -139003103
        //    53: goto            58
        //    56: ldc             -1873607262
        //    58: ldc             -505159381
        //    60: ixor           
        //    61: lookupswitch {
        //          374675978: 56
        //          1907418249: 88
        //          default: 93
        //        }
        //    88: iload_2        
        //    89: i2f            
        //    90: fdiv           
        //    91: fmul           
        //    92: freturn        
        //    93: aconst_null    
        //    94: athrow         
        //    95: pop            
        //    96: goto            24
        //    99: pop            
        //   100: aconst_null    
        //   101: goto            95
        //   104: dup            
        //   105: ifnull          95
        //   108: checkcast       Ljava/lang/Throwable;
        //   111: athrow         
        //   112: dup            
        //   113: ifnull          99
        //   116: checkcast       Ljava/lang/Throwable;
        //   119: athrow         
        //   120: aconst_null    
        //   121: athrow         
        //    StackMapTable: 00 11 43 07 00 3E 04 FF 00 0B 00 00 00 01 07 00 3E FE 00 03 07 00 03 02 01 49 07 00 36 40 02 45 07 00 3E 40 01 FF 00 0D 00 03 07 00 03 02 01 00 02 02 02 FF 00 01 00 03 07 00 03 02 01 00 03 02 02 01 FF 00 1D 00 03 07 00 03 02 01 00 02 02 02 FF 00 04 00 03 07 00 03 02 01 00 02 02 02 41 07 00 3E 43 05 44 07 00 3E 47 05 47 07 00 3E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  8      20     104    112    Any
        //  104    112    104    112    Any
        //  120    122    3      8      Ljava/lang/ArithmeticException;
        //  34     41     41     42     Any
        //  35     41     3      8      Any
        //  34     41     3      8      Ljava/lang/RuntimeException;
        //  34     41     34     35     Ljava/lang/IllegalStateException;
        //  35     41     3      8      Ljava/lang/NegativeArraySizeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 27 out of bounds for length 27
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
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
    
    static {
        throw t;
    }
    
    public f84() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u2237\u1492\u8b28\ub3e6\uc969\uec27\ub227\ue719"
        //     3: getstatic       dev/nuker/pyro/fc.1:I
        //     6: ifeq            14
        //     9: ldc             2021338120
        //    11: goto            16
        //    14: ldc             -279482676
        //    16: ldc             -1363825278
        //    18: ixor           
        //    19: lookupswitch {
        //          -691109494: 459
        //          1900355767: 14
        //          default: 44
        //        }
        //    44: invokestatic    invokestatic   !!! ERROR
        //    47: ldc             "\u2217\u1492\u8b28\ub3f5\uc96a\uec2b\ub22f"
        //    49: getstatic       dev/nuker/pyro/fc.0:I
        //    52: ifeq            60
        //    55: ldc             -1844255900
        //    57: goto            62
        //    60: ldc             -707311996
        //    62: ldc             -2079124361
        //    64: ixor           
        //    65: lookupswitch {
        //          369227539: 60
        //          1371820787: 92
        //          default: 451
        //        }
        //    92: invokestatic    invokestatic   !!! ERROR
        //    95: ldc             "\u2202\u149c\u8b3c\ub3d2\uc925\uec31\ub22b\ue707\ud97a\ue956\ua6f1\u1e4d\ue021\uc5e7\u8182\u88bc\u57e4\u76ce\ubd32\uc0bf\u2a9c\uc238\u6bde\u2d58\ud734\u344d\u7d27\u8865\u8051\u8c22\u857a\ufb20\u7101\u9a1f\u1b24\uf0a1\u4968\u89f3\uca82\uff8e\ub701\u41fd\ub866\ub349\u4c93\u8b33\u7c60\ucff0\u7d46\uea73\ue717\u16c1"
        //    97: invokestatic    invokestatic   !!! ERROR
        //   100: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   103: aload_0        
        //   104: aload_0        
        //   105: new             Ldev/nuker/pyro/f0g;
        //   108: dup            
        //   109: ldc             "\u222a\u149a\u8b2d\ub3dc\uc966\uec3c\ub22d\ue71d\ud966\ue905"
        //   111: invokestatic    invokestatic   !!! ERROR
        //   114: ldc             "\u220a\u149a\u8b2d\ub3dc\uc966\uec3c\ub22d\ue71d\ud966\ue905"
        //   116: invokestatic    invokestatic   !!! ERROR
        //   119: ldc             "\u2200\u1486\u8b32\ub3db\uc960\uec3a\ub264\ue71d\ud96e\ue956\ua6fb\u1e42\ue037\uc5b7\u81d1\u88b7\u57ad\u76c5\ubd38\uc0a9\u2ac8\uc232\u6bd0\u2d58\ud767\u3405\u7d6b\u885d\u8051\u8c3c\u857b\ufb3e\u7114\u9a1f\u1b33\uf0a5\u4979\u89f3\uca89\uff87\ub756\u41a1\ub866\ub341\u4cc0\u8b7b\u7c7b\ucff2\u7d4d\uea6b\ue71b\u16d5\uef81\u3780\u4608\ue037\u0a13"
        //   121: invokestatic    invokestatic   !!! ERROR
        //   124: bipush          8
        //   126: iconst_2       
        //   127: bipush          16
        //   129: iconst_0       
        //   130: bipush          64
        //   132: aconst_null    
        //   133: invokespecial   dev/nuker/pyro/f0g.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   136: checkcast       Ldev/nuker/pyro/f0n;
        //   139: getstatic       dev/nuker/pyro/fc.0:I
        //   142: ifeq            150
        //   145: ldc             -1559191046
        //   147: goto            152
        //   150: ldc             -1319259102
        //   152: ldc             -305493499
        //   154: ixor           
        //   155: lookupswitch {
        //          1322920959: 150
        //          1553415719: 180
        //          default: 461
        //        }
        //   180: invokevirtual   dev/nuker/pyro/f84.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   183: checkcast       Ldev/nuker/pyro/f0g;
        //   186: putfield        dev/nuker/pyro/f84.c:Ldev/nuker/pyro/f0g;
        //   189: aload_0        
        //   190: aload_0        
        //   191: new             Ldev/nuker/pyro/f0a;
        //   194: dup            
        //   195: ldc             "\u2222\u149c\u8b3c\ub3d2\uc95a\uec25\ub22b\ue707\ud97b\ue913"
        //   197: invokestatic    invokestatic   !!! ERROR
        //   200: ldc             "\u2202\u149c\u8b3c\ub3d2\uc925\uec05\ub22b\ue707\ud97b\ue913"
        //   202: invokestatic    invokestatic   !!! ERROR
        //   205: ldc             "\u2217\u149c\u8b2a\ub399\uc966\uec29\ub22a\ue755\ud97c\ue956\ua6e5\u1e43\ue020\uc5a2\u81d1\u88a7\u57ac\u76d2\ubd7d\uc0a7\u2ad3\uc22e\u6bcc\u2d53\ud734\u344a\u7d3f\u883c\u8010\u8c3d\u8562\ufb7c\u714e"
        //   207: getstatic       dev/nuker/pyro/fc.0:I
        //   210: ifeq            218
        //   213: ldc             -210748738
        //   215: goto            220
        //   218: ldc             -1687580141
        //   220: ldc             82095748
        //   222: ixor           
        //   223: lookupswitch {
        //          -1618133865: 248
        //          -141257670: 218
        //          default: 463
        //        }
        //   248: invokestatic    invokestatic   !!! ERROR
        //   251: iconst_0       
        //   252: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   255: checkcast       Ldev/nuker/pyro/f0n;
        //   258: invokevirtual   dev/nuker/pyro/f84.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   261: checkcast       Ldev/nuker/pyro/f0a;
        //   264: putfield        dev/nuker/pyro/f84.c:Ldev/nuker/pyro/f0a;
        //   267: aload_0        
        //   268: aload_0        
        //   269: new             Ldev/nuker/pyro/f0g;
        //   272: dup            
        //   273: ldc             "\u223d\u149d\u8b3e\ub3c9\uc95a\uec3c\ub22d\ue711\ud963\ue905"
        //   275: invokestatic    invokestatic   !!! ERROR
        //   278: ldc             "\u221d\u149d\u8b3e\ub3c9\uc925\uec1c\ub22d\ue711\ud963\ue905"
        //   280: invokestatic    invokestatic   !!! ERROR
        //   283: ldc             "\u220a\u1496\u8b33\ub3d8\uc97c\uec68\ub226\ue717\ud97c\ue901\ua6ed\u1e49\ue038\uc5e7\u819c\u88bc\u57b1\u76c4\ubd38\uc0ea\u2ad1\uc234\u6bc9\u2d53\ud779\u344e\u7d25\u8868\u8051\u8c30\u8560\ufb36\u7140\u9a05\u1b2d\uf0a8\u496c\u89a3\uca8f\uff8f\ub711\u41b3\ub832\ub347\u4c93\u8b22\u7c68\ucfe0"
        //   285: invokestatic    invokestatic   !!! ERROR
        //   288: bipush          10
        //   290: iconst_0       
        //   291: sipush          200
        //   294: iconst_0       
        //   295: bipush          64
        //   297: aconst_null    
        //   298: getstatic       dev/nuker/pyro/fc.0:I
        //   301: ifeq            309
        //   304: ldc             -113031580
        //   306: goto            311
        //   309: ldc             -1581316081
        //   311: ldc             -922868044
        //   313: ixor           
        //   314: lookupswitch {
        //          834494672: 309
        //          1765879483: 340
        //          default: 453
        //        }
        //   340: invokespecial   dev/nuker/pyro/f0g.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   343: checkcast       Ldev/nuker/pyro/f0n;
        //   346: getstatic       dev/nuker/pyro/fc.c:I
        //   349: ifge            357
        //   352: ldc             710109155
        //   354: goto            359
        //   357: ldc             -1768183862
        //   359: ldc             2135738601
        //   361: ixor           
        //   362: lookupswitch {
        //          -1705504388: 357
        //          1428139786: 457
        //          default: 388
        //        }
        //   388: invokevirtual   dev/nuker/pyro/f84.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   391: checkcast       Ldev/nuker/pyro/f0g;
        //   394: putfield        dev/nuker/pyro/f84.0:Ldev/nuker/pyro/f0g;
        //   397: aload_0        
        //   398: getstatic       kotlin/jvm/internal/FloatCompanionObject.INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;
        //   401: getstatic       dev/nuker/pyro/fc.c:I
        //   404: ifge            412
        //   407: ldc             -1283183751
        //   409: goto            414
        //   412: ldc             -2059982532
        //   414: ldc             -1606240703
        //   416: ixor           
        //   417: lookupswitch {
        //          -218373413: 412
        //          331783480: 455
        //          default: 444
        //        }
        //   444: invokevirtual   kotlin/jvm/internal/FloatCompanionObject.getMIN_VALUE:()F
        //   447: putfield        dev/nuker/pyro/f84.c:F
        //   450: return         
        //   451: aconst_null    
        //   452: athrow         
        //   453: aconst_null    
        //   454: athrow         
        //   455: aconst_null    
        //   456: athrow         
        //   457: aconst_null    
        //   458: athrow         
        //   459: aconst_null    
        //   460: athrow         
        //   461: aconst_null    
        //   462: athrow         
        //   463: aconst_null    
        //   464: athrow         
        //    StackMapTable: 00 1C FF 00 0E 00 01 06 00 02 06 07 00 A7 FF 00 01 00 01 06 00 03 06 07 00 A7 01 FF 00 1B 00 01 06 00 02 06 07 00 A7 FF 00 0F 00 01 06 00 03 06 07 00 A7 07 00 A7 FF 00 01 00 01 06 00 04 06 07 00 A7 07 00 A7 01 FF 00 1D 00 01 06 00 03 06 07 00 A7 07 00 A7 FF 00 39 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 6F FF 00 01 00 01 07 00 03 00 04 07 00 03 07 00 03 07 00 6F 01 FF 00 1B 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 6F FF 00 25 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 BF 08 00 BF 07 00 A7 07 00 A7 07 00 A7 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 BF 08 00 BF 07 00 A7 07 00 A7 07 00 A7 01 FF 00 1B 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 BF 08 00 BF 07 00 A7 07 00 A7 07 00 A7 FF 00 3C 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 01 0D 08 01 0D 07 00 A7 07 00 A7 07 00 A7 01 01 01 01 01 05 FF 00 01 00 01 07 00 03 00 0E 07 00 03 07 00 03 08 01 0D 08 01 0D 07 00 A7 07 00 A7 07 00 A7 01 01 01 01 01 05 01 FF 00 1C 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 01 0D 08 01 0D 07 00 A7 07 00 A7 07 00 A7 01 01 01 01 01 05 FF 00 10 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 6F FF 00 01 00 01 07 00 03 00 04 07 00 03 07 00 03 07 00 6F 01 FF 00 1C 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 6F FF 00 17 00 01 07 00 03 00 02 07 00 03 07 00 99 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 99 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 99 FF 00 06 00 01 06 00 03 06 07 00 A7 07 00 A7 FF 00 01 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 01 0D 08 01 0D 07 00 A7 07 00 A7 07 00 A7 01 01 01 01 01 05 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 99 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 6F FF 00 01 00 01 06 00 02 06 07 00 A7 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 6F FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 BF 08 00 BF 07 00 A7 07 00 A7 07 00 A7
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
    
    @NotNull
    public f0a c() {
        return fbS.z(this, 1081501786);
    }
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          557
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            549
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            541
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            36
        //    31: ldc             -363419154
        //    33: goto            38
        //    36: ldc             -728957241
        //    38: ldc             -1195124399
        //    40: ixor           
        //    41: lookupswitch {
        //          -1162130363: 36
        //          1385525439: 530
        //          default: 68
        //        }
        //    68: iload_1        
        //    69: aload_2        
        //    70: getstatic       dev/nuker/pyro/fc.1:I
        //    73: ifeq            81
        //    76: ldc             -911140024
        //    78: goto            83
        //    81: ldc             1337533891
        //    83: ldc             1461002851
        //    85: ixor           
        //    86: lookupswitch {
        //          -1633404629: 522
        //          -399081393: 81
        //          default: 112
        //        }
        //   112: aload_3        
        //   113: getstatic       dev/nuker/pyro/fc.c:I
        //   116: ifge            124
        //   119: ldc             754229091
        //   121: goto            126
        //   124: ldc             446332646
        //   126: ldc             -1717617806
        //   128: ixor           
        //   129: lookupswitch {
        //          -1251236847: 524
        //          1504841793: 124
        //          default: 156
        //        }
        //   156: goto            160
        //   159: athrow         
        //   160: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //   163: goto            167
        //   166: athrow         
        //   167: getstatic       dev/nuker/pyro/fc.0:I
        //   170: ifeq            178
        //   173: ldc             -160840843
        //   175: goto            180
        //   178: ldc             -1562325704
        //   180: ldc             -1258058207
        //   182: ixor           
        //   183: lookupswitch {
        //          -898990130: 178
        //          1131040084: 528
        //          default: 208
        //        }
        //   208: aload_2        
        //   209: ifnonnull       217
        //   212: ldc             -79994183
        //   214: goto            219
        //   217: ldc             -79994184
        //   219: ldc             2070716561
        //   221: ixor           
        //   222: tableswitch {
        //          11502672: 244
        //          11502673: 245
        //          default: 212
        //        }
        //   244: return         
        //   245: aload_0        
        //   246: iload_1        
        //   247: ifeq            255
        //   250: ldc             -847691191
        //   252: goto            257
        //   255: ldc             -847691194
        //   257: ldc             991833582
        //   259: ixor           
        //   260: tableswitch {
        //          -321986738: 284
        //          -321986737: 495
        //          default: 250
        //        }
        //   284: getstatic       dev/nuker/pyro/fc.c:I
        //   287: ifge            295
        //   290: ldc             1434863771
        //   292: goto            297
        //   295: ldc             2089854435
        //   297: ldc             -331504097
        //   299: ixor           
        //   300: lookupswitch {
        //          -1867709444: 328
        //          -1178866044: 295
        //          default: 526
        //        }
        //   328: aload_0        
        //   329: getfield        dev/nuker/pyro/f84.c:Ldev/nuker/pyro/f0a;
        //   332: getstatic       dev/nuker/pyro/fc.0:I
        //   335: ifeq            343
        //   338: ldc             -483277255
        //   340: goto            345
        //   343: ldc             1189222593
        //   345: ldc             253797567
        //   347: ixor           
        //   348: lookupswitch {
        //          -334404986: 343
        //          1237499006: 376
        //          default: 518
        //        }
        //   376: goto            380
        //   379: athrow         
        //   380: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   383: goto            387
        //   386: athrow         
        //   387: checkcast       Ljava/lang/Boolean;
        //   390: goto            394
        //   393: athrow         
        //   394: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   397: goto            401
        //   400: athrow         
        //   401: ifeq            495
        //   404: aload_0        
        //   405: aload_2        
        //   406: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   409: aload_0        
        //   410: getfield        dev/nuker/pyro/f84.c:Ldev/nuker/pyro/f0g;
        //   413: getstatic       dev/nuker/pyro/fc.1:I
        //   416: ifeq            424
        //   419: ldc             -1980150866
        //   421: goto            426
        //   424: ldc             -1664479597
        //   426: ldc             -2009773129
        //   428: ixor           
        //   429: lookupswitch {
        //          30146585: 424
        //          352273700: 456
        //          default: 520
        //        }
        //   456: goto            460
        //   459: athrow         
        //   460: invokevirtual   dev/nuker/pyro/f0g.3:()Ljava/lang/Object;
        //   463: goto            467
        //   466: athrow         
        //   467: checkcast       Ljava/lang/Number;
        //   470: goto            474
        //   473: athrow         
        //   474: invokevirtual   java/lang/Number.intValue:()I
        //   477: goto            481
        //   480: athrow         
        //   481: goto            485
        //   484: athrow         
        //   485: invokevirtual   dev/nuker/pyro/f84.c:(FI)F
        //   488: goto            492
        //   491: athrow         
        //   492: goto            509
        //   495: getstatic       kotlin/jvm/internal/FloatCompanionObject.INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;
        //   498: goto            502
        //   501: athrow         
        //   502: invokevirtual   kotlin/jvm/internal/FloatCompanionObject.getMIN_VALUE:()F
        //   505: goto            509
        //   508: athrow         
        //   509: putfield        dev/nuker/pyro/f84.c:F
        //   512: aload_0        
        //   513: iconst_0       
        //   514: putfield        dev/nuker/pyro/f84.1:I
        //   517: return         
        //   518: aconst_null    
        //   519: athrow         
        //   520: aconst_null    
        //   521: athrow         
        //   522: aconst_null    
        //   523: athrow         
        //   524: aconst_null    
        //   525: athrow         
        //   526: aconst_null    
        //   527: athrow         
        //   528: aconst_null    
        //   529: athrow         
        //   530: aconst_null    
        //   531: athrow         
        //   532: pop            
        //   533: goto            24
        //   536: pop            
        //   537: aconst_null    
        //   538: goto            532
        //   541: dup            
        //   542: ifnull          532
        //   545: checkcast       Ljava/lang/Throwable;
        //   548: athrow         
        //   549: dup            
        //   550: ifnull          536
        //   553: checkcast       Ljava/lang/Throwable;
        //   556: athrow         
        //   557: aconst_null    
        //   558: athrow         
        //    StackMapTable: 00 4B 43 07 00 3E 04 FF 00 0B 00 00 00 01 07 00 3E FF 00 03 00 04 07 00 03 01 07 00 E4 07 00 F5 00 00 4B 07 00 03 FF 00 01 00 04 07 00 03 01 07 00 E4 07 00 F5 00 02 07 00 03 01 5D 07 00 03 FF 00 0C 00 04 07 00 03 01 07 00 E4 07 00 F5 00 03 07 00 03 01 07 00 E4 FF 00 01 00 04 07 00 03 01 07 00 E4 07 00 F5 00 04 07 00 03 01 07 00 E4 01 FF 00 1C 00 04 07 00 03 01 07 00 E4 07 00 F5 00 03 07 00 03 01 07 00 E4 FF 00 0B 00 04 07 00 03 01 07 00 E4 07 00 F5 00 04 07 00 03 01 07 00 E4 07 00 F5 FF 00 01 00 04 07 00 03 01 07 00 E4 07 00 F5 00 05 07 00 03 01 07 00 E4 07 00 F5 01 FF 00 1D 00 04 07 00 03 01 07 00 E4 07 00 F5 00 04 07 00 03 01 07 00 E4 07 00 F5 42 07 00 34 FF 00 00 00 04 07 00 03 01 07 00 E4 07 00 F5 00 04 07 00 03 01 07 00 E4 07 00 F5 45 07 00 3E 00 0A 41 01 1B 03 04 41 01 18 00 44 07 00 03 44 07 00 03 FF 00 01 00 04 07 00 03 01 07 00 E4 07 00 F5 00 02 07 00 03 01 5A 07 00 03 4A 07 00 03 FF 00 01 00 04 07 00 03 01 07 00 E4 07 00 F5 00 02 07 00 03 01 5E 07 00 03 FF 00 0E 00 04 07 00 03 01 07 00 E4 07 00 F5 00 02 07 00 03 07 00 79 FF 00 01 00 04 07 00 03 01 07 00 E4 07 00 F5 00 03 07 00 03 07 00 79 01 FF 00 1E 00 04 07 00 03 01 07 00 E4 07 00 F5 00 02 07 00 03 07 00 79 42 07 00 38 FF 00 00 00 04 07 00 03 01 07 00 E4 07 00 F5 00 02 07 00 03 07 00 79 45 07 00 3E FF 00 00 00 04 07 00 03 01 07 00 E4 07 00 F5 00 02 07 00 03 07 00 F7 45 07 00 3E FF 00 00 00 04 07 00 03 01 07 00 E4 07 00 F5 00 02 07 00 03 07 00 DE 45 07 00 3E FF 00 00 00 04 07 00 03 01 07 00 E4 07 00 F5 00 02 07 00 03 01 FF 00 16 00 04 07 00 03 01 07 00 E4 07 00 F5 00 04 07 00 03 07 00 03 02 07 00 64 FF 00 01 00 04 07 00 03 01 07 00 E4 07 00 F5 00 05 07 00 03 07 00 03 02 07 00 64 01 FF 00 1D 00 04 07 00 03 01 07 00 E4 07 00 F5 00 04 07 00 03 07 00 03 02 07 00 64 42 07 00 B7 FF 00 00 00 04 07 00 03 01 07 00 E4 07 00 F5 00 04 07 00 03 07 00 03 02 07 00 64 45 07 00 3E FF 00 00 00 04 07 00 03 01 07 00 E4 07 00 F5 00 04 07 00 03 07 00 03 02 07 00 F7 45 07 00 3E FF 00 00 00 04 07 00 03 01 07 00 E4 07 00 F5 00 04 07 00 03 07 00 03 02 07 00 ED 45 07 00 3E FF 00 00 00 04 07 00 03 01 07 00 E4 07 00 F5 00 04 07 00 03 07 00 03 02 01 42 07 00 3E FF 00 00 00 04 07 00 03 01 07 00 E4 07 00 F5 00 04 07 00 03 07 00 03 02 01 45 07 00 3E FF 00 00 00 04 07 00 03 01 07 00 E4 07 00 F5 00 02 07 00 03 02 42 07 00 03 45 07 00 3E FF 00 00 00 04 07 00 03 01 07 00 E4 07 00 F5 00 02 07 00 03 07 00 99 45 07 00 3E FF 00 00 00 04 07 00 03 01 07 00 E4 07 00 F5 00 02 07 00 03 02 FF 00 08 00 04 07 00 03 01 07 00 E4 07 00 F5 00 02 07 00 03 07 00 79 FF 00 01 00 04 07 00 03 01 07 00 E4 07 00 F5 00 04 07 00 03 07 00 03 02 07 00 64 FF 00 01 00 04 07 00 03 01 07 00 E4 07 00 F5 00 03 07 00 03 01 07 00 E4 FF 00 01 00 04 07 00 03 01 07 00 E4 07 00 F5 00 04 07 00 03 01 07 00 E4 07 00 F5 41 07 00 03 01 41 07 00 03 41 07 00 3E 43 05 44 07 00 3E 47 05 47 07 00 3E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     541    549    Any
        //  541    549    541    549    Any
        //  557    559    3      8      Any
        //  159    166    166    167    Any
        //  160    166    159    160    Ljava/lang/NegativeArraySizeException;
        //  159    166    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  160    166    159    160    Ljava/util/ConcurrentModificationException;
        //  160    166    166    167    Ljava/lang/StringIndexOutOfBoundsException;
        //  379    386    386    387    Any
        //  380    386    3      8      Any
        //  379    386    386    387    Any
        //  379    386    3      8      Any
        //  380    386    379    380    Ljava/lang/NegativeArraySizeException;
        //  393    400    400    401    Any
        //  393    400    393    394    Any
        //  393    400    3      8      Any
        //  394    400    3      8      Ljava/lang/NumberFormatException;
        //  394    400    400    401    Any
        //  459    466    466    467    Any
        //  459    466    466    467    Ljava/lang/IndexOutOfBoundsException;
        //  459    466    3      8      Ljava/lang/NullPointerException;
        //  459    466    459    460    Ljava/lang/NumberFormatException;
        //  459    466    466    467    Any
        //  473    480    480    481    Any
        //  473    480    473    474    Any
        //  474    480    473    474    Ljava/lang/NumberFormatException;
        //  474    480    473    474    Ljava/lang/IllegalArgumentException;
        //  474    480    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  484    491    491    492    Any
        //  485    491    491    492    Any
        //  485    491    484    485    Any
        //  484    491    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  485    491    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  501    508    508    509    Any
        //  501    508    501    502    Any
        //  502    508    3      8      Ljava/lang/IllegalStateException;
        //  501    508    3      8      Ljava/lang/NullPointerException;
        //  502    508    501    502    Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:595)
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
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f2V f2V) {
        fbS.2p(this, 1973625901, f2V);
    }
    
    @NotNull
    public f0g 0() {
        return fbS.8N(this, 116197545);
    }
}
