// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.Map;

public class f3C extends f3A
{
    public fH c;
    public f3H c;
    
    @Override
    public boolean c(final float n, final float n2, final float n3) {
        return fbS.i(this, 1066211694, n, n2, n3);
    }
    
    @Override
    public void c(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          256
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            248
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            240
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             1034816407
        //    32: goto            37
        //    35: ldc             -1241383399
        //    37: ldc             1444620009
        //    39: ixor           
        //    40: lookupswitch {
        //          -535111440: 68
        //          1807035774: 35
        //          default: 225
        //        }
        //    68: aload_0        
        //    69: getstatic       dev/nuker/pyro/fc.1:I
        //    72: ifeq            80
        //    75: ldc             -292939828
        //    77: goto            82
        //    80: ldc             1547254702
        //    82: ldc             1400573880
        //    84: ixor           
        //    85: lookupswitch {
        //          -1108273036: 227
        //          145275492: 80
        //          default: 112
        //        }
        //   112: iload_1        
        //   113: iload_2        
        //   114: iload_3        
        //   115: getstatic       dev/nuker/pyro/fc.1:I
        //   118: ifeq            126
        //   121: ldc             -320970659
        //   123: goto            128
        //   126: ldc             607854216
        //   128: ldc             -1252428998
        //   130: ixor           
        //   131: lookupswitch {
        //          -544739099: 126
        //          1502024551: 229
        //          default: 156
        //        }
        //   156: goto            160
        //   159: athrow         
        //   160: invokespecial   dev/nuker/pyro/f3A.c:(III)V
        //   163: goto            167
        //   166: athrow         
        //   167: iload_3        
        //   168: ifne            224
        //   171: aload_0        
        //   172: getfield        dev/nuker/pyro/f3C.c:Ldev/nuker/pyro/fH;
        //   175: getfield        dev/nuker/pyro/fH.c:Ljava/util/Map;
        //   178: goto            182
        //   181: athrow         
        //   182: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   187: goto            191
        //   190: athrow         
        //   191: invokedynamic   BootstrapMethod #0, accept:()Ljava/util/function/Consumer;
        //   196: goto            200
        //   199: athrow         
        //   200: invokeinterface java/util/Set.forEach:(Ljava/util/function/Consumer;)V
        //   205: goto            209
        //   208: athrow         
        //   209: aload_0        
        //   210: getfield        dev/nuker/pyro/f3C.c:Ldev/nuker/pyro/f3H;
        //   213: goto            217
        //   216: athrow         
        //   217: invokevirtual   dev/nuker/pyro/f3H.0:()V
        //   220: goto            224
        //   223: athrow         
        //   224: return         
        //   225: aconst_null    
        //   226: athrow         
        //   227: aconst_null    
        //   228: athrow         
        //   229: aconst_null    
        //   230: athrow         
        //   231: pop            
        //   232: goto            24
        //   235: pop            
        //   236: aconst_null    
        //   237: goto            231
        //   240: dup            
        //   241: ifnull          231
        //   244: checkcast       Ljava/lang/Throwable;
        //   247: athrow         
        //   248: dup            
        //   249: ifnull          235
        //   252: checkcast       Ljava/lang/Throwable;
        //   255: athrow         
        //   256: aconst_null    
        //   257: athrow         
        //    StackMapTable: 00 25 43 07 00 29 04 FF 00 0B 00 00 00 01 07 00 29 FF 00 03 00 04 07 00 03 01 01 01 00 00 0A 41 01 1E 4B 07 00 03 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 03 01 5D 07 00 03 FF 00 0D 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 FF 00 01 00 04 07 00 03 01 01 01 00 05 07 00 03 01 01 01 01 FF 00 1B 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 42 07 00 1B FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 45 07 00 29 00 4D 07 00 29 40 07 00 40 47 07 00 29 40 07 00 58 47 07 00 29 FF 00 00 00 04 07 00 03 01 01 01 00 02 07 00 58 07 00 65 47 07 00 29 00 FF 00 06 00 00 00 01 07 00 29 FF 00 00 00 04 07 00 03 01 01 01 00 01 07 00 60 45 07 00 29 00 00 41 07 00 03 FF 00 01 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 41 07 00 67 43 05 44 07 00 67 47 05 47 07 00 29
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     240    248    Ljava/util/ConcurrentModificationException;
        //  240    248    240    248    Ljava/lang/EnumConstantNotPresentException;
        //  256    258    3      8      Any
        //  159    166    166    167    Any
        //  159    166    166    167    Any
        //  159    166    166    167    Ljava/lang/UnsupportedOperationException;
        //  159    166    166    167    Ljava/lang/ArithmeticException;
        //  159    166    159    160    Ljava/lang/IllegalArgumentException;
        //  181    190    190    191    Any
        //  182    190    3      8      Any
        //  182    190    190    191    Ljava/util/ConcurrentModificationException;
        //  182    190    3      8      Ljava/lang/NegativeArraySizeException;
        //  181    190    181    182    Any
        //  199    208    208    209    Any
        //  200    208    3      8      Ljava/lang/ClassCastException;
        //  200    208    199    200    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  200    208    199    200    Any
        //  199    208    208    209    Any
        //  217    223    223    224    Any
        //  217    223    3      8      Ljava/lang/UnsupportedOperationException;
        //  217    223    3      8      Any
        //  217    223    223    224    Any
        //  217    223    223    224    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 87 out of bounds for length 87
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
    
    public f3C(final fH p0, final f3H p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            11
        //     6: ldc             695090194
        //     8: goto            13
        //    11: ldc             306408446
        //    13: ldc             734123236
        //    15: ixor           
        //    16: lookupswitch {
        //          45082870: 200
        //          48860665: 11
        //          default: 44
        //        }
        //    44: aload_0        
        //    45: ldc             "\u2396\u1496\u8aad\ub3d8\uc804\uedb8\ub230\ue695"
        //    47: invokestatic    invokestatic   !!! ERROR
        //    50: fconst_0       
        //    51: fconst_0       
        //    52: ldc             115.0
        //    54: invokestatic    dev/nuker/pyro/fbs.c:()F
        //    57: fconst_2       
        //    58: fadd           
        //    59: getstatic       dev/nuker/pyro/fc.c:I
        //    62: ifge            70
        //    65: ldc             -1878072992
        //    67: goto            72
        //    70: ldc             -460428453
        //    72: ldc             2047021924
        //    74: ixor           
        //    75: lookupswitch {
        //          -1545924660: 70
        //          -368184828: 206
        //          default: 100
        //        }
        //   100: invokespecial   dev/nuker/pyro/f3A.<init>:(Ljava/lang/String;FFFF)V
        //   103: aload_0        
        //   104: aload_1        
        //   105: getstatic       dev/nuker/pyro/fc.1:I
        //   108: ifeq            116
        //   111: ldc             872196142
        //   113: goto            118
        //   116: ldc             2133828501
        //   118: ldc             1572000964
        //   120: ixor           
        //   121: lookupswitch {
        //          -487246596: 116
        //          1850637546: 204
        //          default: 148
        //        }
        //   148: putfield        dev/nuker/pyro/f3C.c:Ldev/nuker/pyro/fH;
        //   151: aload_0        
        //   152: aload_2        
        //   153: getstatic       dev/nuker/pyro/fc.c:I
        //   156: ifge            164
        //   159: ldc             -534986102
        //   161: goto            166
        //   164: ldc             -2009714520
        //   166: ldc             -1077123244
        //   168: ixor           
        //   169: lookupswitch {
        //          1607509470: 202
        //          1883252009: 164
        //          default: 196
        //        }
        //   196: putfield        dev/nuker/pyro/f3C.c:Ldev/nuker/pyro/f3H;
        //   199: return         
        //   200: aconst_null    
        //   201: athrow         
        //   202: aconst_null    
        //   203: athrow         
        //   204: aconst_null    
        //   205: athrow         
        //   206: aconst_null    
        //   207: athrow         
        //    StackMapTable: 00 10 0B 41 01 1E FF 00 19 00 03 06 07 00 3B 07 00 60 00 06 06 07 00 89 02 02 02 02 FF 00 01 00 03 06 07 00 3B 07 00 60 00 07 06 07 00 89 02 02 02 02 01 FF 00 1B 00 03 06 07 00 3B 07 00 60 00 06 06 07 00 89 02 02 02 02 FF 00 0F 00 03 07 00 03 07 00 3B 07 00 60 00 02 07 00 03 07 00 3B FF 00 01 00 03 07 00 03 07 00 3B 07 00 60 00 03 07 00 03 07 00 3B 01 FF 00 1D 00 03 07 00 03 07 00 3B 07 00 60 00 02 07 00 03 07 00 3B FF 00 0F 00 03 07 00 03 07 00 3B 07 00 60 00 02 07 00 03 07 00 60 FF 00 01 00 03 07 00 03 07 00 3B 07 00 60 00 03 07 00 03 07 00 60 01 FF 00 1D 00 03 07 00 03 07 00 3B 07 00 60 00 02 07 00 03 07 00 60 FF 00 03 00 03 06 07 00 3B 07 00 60 00 00 FF 00 01 00 03 07 00 03 07 00 3B 07 00 60 00 02 07 00 03 07 00 60 FF 00 01 00 03 07 00 03 07 00 3B 07 00 60 00 02 07 00 03 07 00 3B FF 00 01 00 03 06 07 00 3B 07 00 60 00 06 06 07 00 89 02 02 02 02
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
    
    public static void c(final Map.Entry entry) {
        fbS.eT(null, 2140814652, entry);
    }
    
    static {
        throw t;
    }
}
