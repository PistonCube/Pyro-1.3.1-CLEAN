// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;

public class f9
{
    public f9(final DefaultConstructorMarker defaultConstructorMarker) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.0 != 0) {
                    n = 1061013230;
                    break Label_0013;
                }
                n = -41009563;
            }
            switch (n ^ 0xCC194FB5) {
                case -2013752991: {
                    continue;
                }
                default: {
                    this();
                }
                case -215709349: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @NotNull
    public fa c(@NotNull final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          433
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            425
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            417
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: new             Ldev/nuker/pyro/fa;
        //    29: dup            
        //    30: getstatic       dev/nuker/pyro/fc.c:I
        //    33: ifge            41
        //    36: ldc             1698828159
        //    38: goto            43
        //    41: ldc             -1609931088
        //    43: ldc             -2502901
        //    45: ixor           
        //    46: lookupswitch {
        //          -1701068684: 41
        //          1607707067: 72
        //          default: 400
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokespecial   dev/nuker/pyro/fa.<init>:()V
        //    79: goto            83
        //    82: athrow         
        //    83: astore_2       
        //    84: aload_2        
        //    85: aload_1        
        //    86: checkcast       Ljava/lang/CharSequence;
        //    89: iconst_1       
        //    90: anewarray       Ljava/lang/String;
        //    93: dup            
        //    94: iconst_0       
        //    95: ldc             "\n"
        //    97: aastore        
        //    98: iconst_0       
        //    99: iconst_0       
        //   100: bipush          6
        //   102: aconst_null    
        //   103: goto            107
        //   106: athrow         
        //   107: invokestatic    kotlin/text/StringsKt.split$default:(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
        //   110: goto            114
        //   113: athrow         
        //   114: checkcast       Ljava/util/Collection;
        //   117: astore_3       
        //   118: getstatic       dev/nuker/pyro/fc.1:I
        //   121: ifeq            129
        //   124: ldc             -1455145426
        //   126: goto            131
        //   129: ldc             -837856314
        //   131: ldc             245746434
        //   133: ixor           
        //   134: lookupswitch {
        //          -1478363860: 129
        //          -1062561596: 160
        //          default: 398
        //        }
        //   160: astore          6
        //   162: iconst_0       
        //   163: istore          4
        //   165: aload_3        
        //   166: getstatic       dev/nuker/pyro/fc.0:I
        //   169: ifeq            177
        //   172: ldc             1456623196
        //   174: goto            179
        //   177: ldc             2043214836
        //   179: ldc             1955389097
        //   181: ixor           
        //   182: lookupswitch {
        //          222569821: 208
        //          576622837: 177
        //          default: 404
        //        }
        //   208: astore          5
        //   210: aload           5
        //   212: iconst_0       
        //   213: anewarray       Ljava/lang/String;
        //   216: goto            220
        //   219: athrow         
        //   220: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   225: goto            229
        //   228: athrow         
        //   229: dup            
        //   230: ifnonnull       238
        //   233: ldc             -1280138329
        //   235: goto            240
        //   238: ldc             -1280138332
        //   240: ldc             -1007126374
        //   242: ixor           
        //   243: tableswitch {
        //          -527059334: 264
        //          -527059333: 335
        //          default: 233
        //        }
        //   264: new             Lkotlin/TypeCastException;
        //   267: dup            
        //   268: ldc             "\u109d\u1486\ub986\ub1c4\ufeaf\ude96\ub225\ud5a9\udb77\ude93\u9441\u1e0c\ud281\uc7b3\ub65b\uba0d\u57a5\u4471\ubf38\uf760\u1875\uc234\u592a\u2f49\ue0f1\u06f8\u7d66\ubac7\u8215\ubbb7\ub7df\ufb72\u43a1\u981e\u2cb9\uc211\u493c\ubb0d\uc898\uc81f\u85a7\u41fa\u8a9d\ub117\u7b78\ub994\u7c7b\ufd43\u7f46\uddb2\ud59f\u1686"
        //   270: getstatic       dev/nuker/pyro/fc.0:I
        //   273: ifeq            281
        //   276: ldc             524437554
        //   278: goto            283
        //   281: ldc             -1800953591
        //   283: ldc             2088346175
        //   285: ixor           
        //   286: lookupswitch {
        //          -388103370: 312
        //          1664870925: 281
        //          default: 402
        //        }
        //   312: goto            316
        //   315: athrow         
        //   316: invokestatic    invokestatic   !!! ERROR
        //   319: goto            323
        //   322: athrow         
        //   323: goto            327
        //   326: athrow         
        //   327: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   330: goto            334
        //   333: athrow         
        //   334: athrow         
        //   335: getstatic       dev/nuker/pyro/fc.1:I
        //   338: ifeq            346
        //   341: ldc             1755190415
        //   343: goto            348
        //   346: ldc             -348412553
        //   348: ldc             -1978664118
        //   350: ixor           
        //   351: lookupswitch {
        //          -493752379: 346
        //          1630821949: 376
        //          default: 406
        //        }
        //   376: astore          7
        //   378: aload           6
        //   380: aload           7
        //   382: checkcast       [Ljava/lang/String;
        //   385: goto            389
        //   388: athrow         
        //   389: invokevirtual   dev/nuker/pyro/fa.c:([Ljava/lang/String;)V
        //   392: goto            396
        //   395: athrow         
        //   396: aload_2        
        //   397: areturn        
        //   398: aconst_null    
        //   399: athrow         
        //   400: aconst_null    
        //   401: athrow         
        //   402: aconst_null    
        //   403: athrow         
        //   404: aconst_null    
        //   405: athrow         
        //   406: aconst_null    
        //   407: athrow         
        //   408: pop            
        //   409: goto            24
        //   412: pop            
        //   413: aconst_null    
        //   414: goto            408
        //   417: dup            
        //   418: ifnull          408
        //   421: checkcast       Ljava/lang/Throwable;
        //   424: athrow         
        //   425: dup            
        //   426: ifnull          412
        //   429: checkcast       Ljava/lang/Throwable;
        //   432: athrow         
        //   433: aconst_null    
        //   434: athrow         
        //    StackMapTable: 00 3A FF 00 03 00 03 07 00 03 07 00 34 07 00 2A 00 01 07 00 28 FA 00 04 FF 00 0B 00 00 00 01 07 00 28 FD 00 03 07 00 03 07 00 34 FF 00 10 00 02 07 00 03 07 00 34 00 02 08 00 1A 08 00 1A FF 00 01 00 02 07 00 03 07 00 34 00 03 08 00 1A 08 00 1A 01 FF 00 1C 00 02 07 00 03 07 00 34 00 02 08 00 1A 08 00 1A 42 07 00 28 FF 00 00 00 02 07 00 03 07 00 34 00 02 08 00 1A 08 00 1A 45 07 00 28 40 07 00 2A FF 00 16 00 03 07 00 03 07 00 34 07 00 2A 00 01 07 00 28 FF 00 00 00 03 07 00 03 07 00 34 07 00 2A 00 07 07 00 2A 07 00 32 07 00 62 01 01 01 05 45 07 00 28 FF 00 00 00 03 07 00 03 07 00 34 07 00 2A 00 02 07 00 2A 07 00 67 FF 00 0E 00 04 07 00 03 07 00 34 07 00 2A 07 00 3E 00 01 07 00 2A FF 00 01 00 04 07 00 03 07 00 34 07 00 2A 07 00 3E 00 02 07 00 2A 01 5C 07 00 2A FF 00 10 00 07 07 00 03 07 00 34 07 00 2A 07 00 3E 01 00 07 00 2A 00 01 07 00 3E FF 00 01 00 07 07 00 03 07 00 34 07 00 2A 07 00 3E 01 00 07 00 2A 00 02 07 00 3E 01 5C 07 00 3E FF 00 0A 00 07 07 00 03 07 00 34 07 00 2A 07 00 3E 01 07 00 3E 07 00 2A 00 01 07 00 28 FF 00 00 00 07 07 00 03 07 00 34 07 00 2A 07 00 3E 01 07 00 3E 07 00 2A 00 02 07 00 3E 07 00 62 47 07 00 28 40 07 00 69 43 07 00 69 44 07 00 69 FF 00 01 00 07 07 00 03 07 00 34 07 00 2A 07 00 3E 01 07 00 3E 07 00 2A 00 02 07 00 69 01 57 07 00 69 FF 00 10 00 07 07 00 03 07 00 34 07 00 2A 07 00 3E 01 07 00 3E 07 00 2A 00 04 07 00 69 08 01 08 08 01 08 07 00 34 FF 00 01 00 07 07 00 03 07 00 34 07 00 2A 07 00 3E 01 07 00 3E 07 00 2A 00 05 07 00 69 08 01 08 08 01 08 07 00 34 01 FF 00 1C 00 07 07 00 03 07 00 34 07 00 2A 07 00 3E 01 07 00 3E 07 00 2A 00 04 07 00 69 08 01 08 08 01 08 07 00 34 42 07 00 28 FF 00 00 00 07 07 00 03 07 00 34 07 00 2A 07 00 3E 01 07 00 3E 07 00 2A 00 04 07 00 69 08 01 08 08 01 08 07 00 34 45 07 00 28 FF 00 00 00 07 07 00 03 07 00 34 07 00 2A 07 00 3E 01 07 00 3E 07 00 2A 00 04 07 00 69 08 01 08 08 01 08 07 00 34 FF 00 02 00 00 00 01 07 00 28 FF 00 00 00 07 07 00 03 07 00 34 07 00 2A 07 00 3E 01 07 00 3E 07 00 2A 00 04 07 00 69 08 01 08 08 01 08 07 00 34 45 07 00 28 FF 00 00 00 07 07 00 03 07 00 34 07 00 2A 07 00 3E 01 07 00 3E 07 00 2A 00 02 07 00 69 07 00 50 40 07 00 69 4A 07 00 69 FF 00 01 00 07 07 00 03 07 00 34 07 00 2A 07 00 3E 01 07 00 3E 07 00 2A 00 02 07 00 69 01 5B 07 00 69 FF 00 0B 00 00 00 01 07 00 28 FF 00 00 00 08 07 00 03 07 00 34 07 00 2A 07 00 3E 01 07 00 3E 07 00 2A 07 00 69 00 02 07 00 2A 07 00 62 45 07 00 28 00 FF 00 01 00 04 07 00 03 07 00 34 07 00 2A 07 00 3E 00 01 07 00 2A FF 00 01 00 02 07 00 03 07 00 34 00 02 08 00 1A 08 00 1A FF 00 01 00 07 07 00 03 07 00 34 07 00 2A 07 00 3E 01 07 00 3E 07 00 2A 00 04 07 00 69 08 01 08 08 01 08 07 00 34 FF 00 01 00 07 07 00 03 07 00 34 07 00 2A 07 00 3E 01 00 07 00 2A 00 01 07 00 3E FF 00 01 00 07 07 00 03 07 00 34 07 00 2A 07 00 3E 01 07 00 3E 07 00 2A 00 01 07 00 69 FF 00 01 00 02 07 00 03 07 00 34 00 01 07 00 6B 43 05 44 07 00 6B 47 05 FF 00 07 00 03 07 00 03 07 00 34 07 00 2A 00 01 07 00 28
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     417    425    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  417    425    417    425    Ljava/lang/ArithmeticException;
        //  433    435    3      8      Any
        //  75     82     82     83     Any
        //  76     82     75     76     Any
        //  76     82     75     76     Any
        //  75     82     82     83     Ljava/lang/EnumConstantNotPresentException;
        //  76     82     82     83     Any
        //  106    113    113    114    Any
        //  107    113    106    107    Any
        //  106    113    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  107    113    3      8      Any
        //  106    113    113    114    Ljava/lang/EnumConstantNotPresentException;
        //  219    228    228    229    Any
        //  220    228    3      8      Any
        //  220    228    228    229    Any
        //  219    228    219    220    Any
        //  219    228    228    229    Any
        //  315    322    322    323    Any
        //  316    322    3      8      Any
        //  315    322    315    316    Any
        //  315    322    322    323    Ljava/lang/AssertionError;
        //  316    322    315    316    Any
        //  327    333    333    334    Any
        //  327    333    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  327    333    3      8      Any
        //  327    333    3      8      Any
        //  327    333    3      8      Ljava/lang/NumberFormatException;
        //  389    395    395    396    Any
        //  389    395    3      8      Ljava/lang/UnsupportedOperationException;
        //  389    395    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  389    395    3      8      Any
        //  389    395    395    396    Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:414)
        //     at com.strobel.assembler.ir.Instruction.accept(Instruction.java:490)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:403)
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
    
    public f9() {
    }
    
    static {
        throw t;
    }
}
