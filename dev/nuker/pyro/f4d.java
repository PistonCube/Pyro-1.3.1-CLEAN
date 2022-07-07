// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.gui.ScaledResolution;

public class f4D extends f4C
{
    public String 0;
    
    public f4D() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u2386\u1483\u8a98"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: invokespecial   dev/nuker/pyro/f4C.<init>:(Ljava/lang/String;)V
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifeq            20
        //    15: ldc             1069377249
        //    17: goto            22
        //    20: ldc             1689463460
        //    22: ldc             -2147322173
        //    24: ixor           
        //    25: lookupswitch {
        //          -1077997534: 62
        //          -568534768: 20
        //          default: 52
        //        }
        //    52: aload_0        
        //    53: ldc             "\u23a6\u14a3\u8ab8"
        //    55: invokestatic    invokestatic   !!! ERROR
        //    58: putfield        dev/nuker/pyro/f4D.0:Ljava/lang/String;
        //    61: return         
        //    62: aconst_null    
        //    63: athrow         
        //    StackMapTable: 00 04 FF 00 14 00 01 07 00 03 00 00 41 01 1D 09
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
    public void c(final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          442
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            434
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            426
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: new             Ljava/lang/StringBuilder;
        //    28: dup            
        //    29: ldc             "\u23a6\u14a3\u8ab8\ub188"
        //    31: goto            35
        //    34: athrow         
        //    35: invokestatic    invokestatic   !!! ERROR
        //    38: goto            42
        //    41: athrow         
        //    42: goto            46
        //    45: athrow         
        //    46: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    49: goto            53
        //    52: athrow         
        //    53: getstatic       com/mojang/realmsclient/gui/ChatFormatting.WHITE:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //    56: getstatic       dev/nuker/pyro/fc.0:I
        //    59: ifeq            67
        //    62: ldc             27711924
        //    64: goto            69
        //    67: ldc             -1693444331
        //    69: ldc             107802781
        //    71: ixor           
        //    72: lookupswitch {
        //          -1652758648: 100
        //          130689321: 67
        //          default: 405
        //        }
        //   100: goto            104
        //   103: athrow         
        //   104: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   107: goto            111
        //   110: athrow         
        //   111: ldc             "\u23d7\u14dd\u8ada\ub1ce"
        //   113: getstatic       dev/nuker/pyro/fc.0:I
        //   116: ifeq            124
        //   119: ldc             1399588223
        //   121: goto            126
        //   124: ldc             -854146244
        //   126: ldc             -1981789087
        //   128: ixor           
        //   129: lookupswitch {
        //          -628340450: 413
        //          49660960: 124
        //          default: 156
        //        }
        //   156: goto            160
        //   159: athrow         
        //   160: invokestatic    invokestatic   !!! ERROR
        //   163: goto            167
        //   166: athrow         
        //   167: iconst_1       
        //   168: anewarray       Ljava/lang/Object;
        //   171: dup            
        //   172: iconst_0       
        //   173: getstatic       dev/nuker/pyro/fc.c:I
        //   176: ifge            184
        //   179: ldc             1634268493
        //   181: goto            186
        //   184: ldc             1867194440
        //   186: ldc             834415239
        //   188: ixor           
        //   189: lookupswitch {
        //          -1390897631: 184
        //          1356128202: 415
        //          default: 216
        //        }
        //   216: getstatic       dev/nuker/pyro/fW.c:Ldev/nuker/pyro/fW;
        //   219: getstatic       dev/nuker/pyro/fc.1:I
        //   222: ifeq            230
        //   225: ldc             -673986751
        //   227: goto            232
        //   230: ldc             31756436
        //   232: ldc             742546641
        //   234: ixor           
        //   235: lookupswitch {
        //          -878432987: 230
        //          -74343536: 411
        //          default: 260
        //        }
        //   260: goto            264
        //   263: athrow         
        //   264: invokevirtual   dev/nuker/pyro/fW.c:()F
        //   267: goto            271
        //   270: athrow         
        //   271: getstatic       dev/nuker/pyro/fc.c:I
        //   274: ifge            282
        //   277: ldc             107581907
        //   279: goto            284
        //   282: ldc             -1944571652
        //   284: ldc             1907881751
        //   286: ixor           
        //   287: lookupswitch {
        //          -1527428349: 282
        //          2011064004: 407
        //          default: 312
        //        }
        //   312: goto            316
        //   315: athrow         
        //   316: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   319: goto            323
        //   322: athrow         
        //   323: aastore        
        //   324: getstatic       dev/nuker/pyro/fc.0:I
        //   327: ifeq            335
        //   330: ldc             -117993354
        //   332: goto            337
        //   335: ldc             971143965
        //   337: ldc             -815875918
        //   339: ixor           
        //   340: lookupswitch {
        //          933832900: 409
        //          1482358268: 335
        //          default: 368
        //        }
        //   368: goto            372
        //   371: athrow         
        //   372: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   375: goto            379
        //   378: athrow         
        //   379: goto            383
        //   382: athrow         
        //   383: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   386: goto            390
        //   389: athrow         
        //   390: goto            394
        //   393: athrow         
        //   394: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   397: goto            401
        //   400: athrow         
        //   401: putfield        dev/nuker/pyro/f4D.0:Ljava/lang/String;
        //   404: return         
        //   405: aconst_null    
        //   406: athrow         
        //   407: aconst_null    
        //   408: athrow         
        //   409: aconst_null    
        //   410: athrow         
        //   411: aconst_null    
        //   412: athrow         
        //   413: aconst_null    
        //   414: athrow         
        //   415: aconst_null    
        //   416: athrow         
        //   417: pop            
        //   418: goto            24
        //   421: pop            
        //   422: aconst_null    
        //   423: goto            417
        //   426: dup            
        //   427: ifnull          417
        //   430: checkcast       Ljava/lang/Throwable;
        //   433: athrow         
        //   434: dup            
        //   435: ifnull          421
        //   438: checkcast       Ljava/lang/Throwable;
        //   441: athrow         
        //   442: aconst_null    
        //   443: athrow         
        //    StackMapTable: 00 45 43 07 00 3C 04 FF 00 0B 00 00 00 01 07 00 3C FD 00 03 07 00 03 07 00 81 49 07 00 3C FF 00 00 00 02 07 00 03 07 00 81 00 04 07 00 03 08 00 19 08 00 19 07 00 74 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 81 00 04 07 00 03 08 00 19 08 00 19 07 00 74 42 07 00 3C FF 00 00 00 02 07 00 03 07 00 81 00 04 07 00 03 08 00 19 08 00 19 07 00 74 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 81 00 02 07 00 03 07 00 3E FF 00 0D 00 02 07 00 03 07 00 81 00 03 07 00 03 07 00 3E 07 00 43 FF 00 01 00 02 07 00 03 07 00 81 00 04 07 00 03 07 00 3E 07 00 43 01 FF 00 1E 00 02 07 00 03 07 00 81 00 03 07 00 03 07 00 3E 07 00 43 42 07 00 28 FF 00 00 00 02 07 00 03 07 00 81 00 03 07 00 03 07 00 3E 07 00 43 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 81 00 02 07 00 03 07 00 3E FF 00 0C 00 02 07 00 03 07 00 81 00 03 07 00 03 07 00 3E 07 00 74 FF 00 01 00 02 07 00 03 07 00 81 00 04 07 00 03 07 00 3E 07 00 74 01 FF 00 1D 00 02 07 00 03 07 00 81 00 03 07 00 03 07 00 3E 07 00 74 42 07 00 3C FF 00 00 00 02 07 00 03 07 00 81 00 03 07 00 03 07 00 3E 07 00 74 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 81 00 03 07 00 03 07 00 3E 07 00 74 FF 00 10 00 02 07 00 03 07 00 81 00 06 07 00 03 07 00 3E 07 00 74 07 00 83 07 00 83 01 FF 00 01 00 02 07 00 03 07 00 81 00 07 07 00 03 07 00 3E 07 00 74 07 00 83 07 00 83 01 01 FF 00 1D 00 02 07 00 03 07 00 81 00 06 07 00 03 07 00 3E 07 00 74 07 00 83 07 00 83 01 FF 00 0D 00 02 07 00 03 07 00 81 00 07 07 00 03 07 00 3E 07 00 74 07 00 83 07 00 83 01 07 00 5A FF 00 01 00 02 07 00 03 07 00 81 00 08 07 00 03 07 00 3E 07 00 74 07 00 83 07 00 83 01 07 00 5A 01 FF 00 1B 00 02 07 00 03 07 00 81 00 07 07 00 03 07 00 3E 07 00 74 07 00 83 07 00 83 01 07 00 5A 42 07 00 2E FF 00 00 00 02 07 00 03 07 00 81 00 07 07 00 03 07 00 3E 07 00 74 07 00 83 07 00 83 01 07 00 5A 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 81 00 07 07 00 03 07 00 3E 07 00 74 07 00 83 07 00 83 01 02 FF 00 0A 00 02 07 00 03 07 00 81 00 07 07 00 03 07 00 3E 07 00 74 07 00 83 07 00 83 01 02 FF 00 01 00 02 07 00 03 07 00 81 00 08 07 00 03 07 00 3E 07 00 74 07 00 83 07 00 83 01 02 01 FF 00 1B 00 02 07 00 03 07 00 81 00 07 07 00 03 07 00 3E 07 00 74 07 00 83 07 00 83 01 02 42 07 00 3C FF 00 00 00 02 07 00 03 07 00 81 00 07 07 00 03 07 00 3E 07 00 74 07 00 83 07 00 83 01 02 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 81 00 07 07 00 03 07 00 3E 07 00 74 07 00 83 07 00 83 01 07 00 6B FF 00 0B 00 02 07 00 03 07 00 81 00 04 07 00 03 07 00 3E 07 00 74 07 00 83 FF 00 01 00 02 07 00 03 07 00 81 00 05 07 00 03 07 00 3E 07 00 74 07 00 83 01 FF 00 1E 00 02 07 00 03 07 00 81 00 04 07 00 03 07 00 3E 07 00 74 07 00 83 42 07 00 3C FF 00 00 00 02 07 00 03 07 00 81 00 04 07 00 03 07 00 3E 07 00 74 07 00 83 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 81 00 03 07 00 03 07 00 3E 07 00 74 FF 00 02 00 00 00 01 07 00 3C FF 00 00 00 02 07 00 03 07 00 81 00 03 07 00 03 07 00 3E 07 00 74 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 81 00 02 07 00 03 07 00 3E FF 00 02 00 00 00 01 07 00 3C FF 00 00 00 02 07 00 03 07 00 81 00 02 07 00 03 07 00 3E 45 07 00 3C FF 00 00 00 02 07 00 03 07 00 81 00 02 07 00 03 07 00 74 FF 00 03 00 02 07 00 03 07 00 81 00 03 07 00 03 07 00 3E 07 00 43 FF 00 01 00 02 07 00 03 07 00 81 00 07 07 00 03 07 00 3E 07 00 74 07 00 83 07 00 83 01 02 FF 00 01 00 02 07 00 03 07 00 81 00 04 07 00 03 07 00 3E 07 00 74 07 00 83 FF 00 01 00 02 07 00 03 07 00 81 00 07 07 00 03 07 00 3E 07 00 74 07 00 83 07 00 83 01 07 00 5A FF 00 01 00 02 07 00 03 07 00 81 00 03 07 00 03 07 00 3E 07 00 74 FF 00 01 00 02 07 00 03 07 00 81 00 06 07 00 03 07 00 3E 07 00 74 07 00 83 07 00 83 01 41 07 00 28 43 05 44 07 00 28 47 05 47 07 00 3C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     426    434    Ljava/lang/UnsupportedOperationException;
        //  426    434    426    434    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  442    444    3      8      Any
        //  34     41     41     42     Any
        //  35     41     34     35     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  34     41     41     42     Any
        //  35     41     3      8      Any
        //  34     41     34     35     Any
        //  45     52     52     53     Any
        //  45     52     45     46     Any
        //  45     52     52     53     Any
        //  46     52     45     46     Any
        //  46     52     45     46     Any
        //  103    110    110    111    Any
        //  104    110    103    104    Ljava/lang/RuntimeException;
        //  103    110    3      8      Ljava/lang/IllegalStateException;
        //  104    110    3      8      Ljava/lang/AssertionError;
        //  104    110    110    111    Any
        //  159    166    166    167    Any
        //  160    166    166    167    Any
        //  160    166    166    167    Ljava/lang/IllegalArgumentException;
        //  159    166    159    160    Any
        //  159    166    3      8      Any
        //  263    270    270    271    Any
        //  264    270    263    264    Ljava/lang/IllegalArgumentException;
        //  264    270    3      8      Ljava/lang/IllegalArgumentException;
        //  263    270    270    271    Ljava/lang/StringIndexOutOfBoundsException;
        //  264    270    3      8      Ljava/lang/ClassCastException;
        //  315    322    322    323    Any
        //  316    322    315    316    Ljava/lang/NullPointerException;
        //  316    322    3      8      Any
        //  315    322    322    323    Any
        //  316    322    315    316    Any
        //  371    378    378    379    Any
        //  372    378    3      8      Any
        //  371    378    3      8      Ljava/lang/ClassCastException;
        //  372    378    371    372    Any
        //  371    378    3      8      Ljava/lang/NullPointerException;
        //  383    389    389    390    Any
        //  383    389    3      8      Ljava/lang/NullPointerException;
        //  383    389    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  383    389    389    390    Any
        //  383    389    3      8      Any
        //  394    400    400    401    Any
        //  394    400    400    401    Ljava/lang/StringIndexOutOfBoundsException;
        //  394    400    3      8      Ljava/lang/IllegalArgumentException;
        //  394    400    400    401    Any
        //  394    400    3      8      Ljava/util/ConcurrentModificationException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:738)
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
    
    @Override
    public String 2() {
        return fbS.5e(this, 4103935);
    }
    
    @Override
    public int c(final ScaledResolution scaledResolution, final float n, final float n2) {
        return fbS.9G(this, 116141211, scaledResolution, n, n2);
    }
    
    static {
        throw t;
    }
}
