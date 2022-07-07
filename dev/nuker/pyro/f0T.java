// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import kotlin.jvm.JvmStatic;

public class f0t
{
    static {
        throw t;
    }
    
    @JvmStatic
    @NotNull
    public f0u c(final double p0, final double p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          520
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            512
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            504
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             1983648720
        //    32: goto            37
        //    35: ldc             -884309980
        //    37: ldc             1482271787
        //    39: ixor           
        //    40: lookupswitch {
        //          -1827460081: 68
        //          778420219: 35
        //          default: 485
        //        }
        //    68: dload_1        
        //    69: dstore          7
        //    71: getstatic       dev/nuker/pyro/fc.0:I
        //    74: ifeq            82
        //    77: ldc             -222107377
        //    79: goto            84
        //    82: ldc             772202849
        //    84: ldc             -1857299451
        //    86: ixor           
        //    87: lookupswitch {
        //          -1085457052: 112
        //          1669936394: 82
        //          default: 489
        //        }
        //   112: dload_3        
        //   113: dstore          9
        //   115: iconst_0       
        //   116: istore          11
        //   118: iconst_0       
        //   119: istore          12
        //   121: dload           7
        //   123: iload           5
        //   125: i2d            
        //   126: ldc2_w          2.0
        //   129: ddiv           
        //   130: dcmpg          
        //   131: ifge            140
        //   134: iconst_m1      
        //   135: istore          11
        //   137: goto            194
        //   140: iconst_1       
        //   141: getstatic       dev/nuker/pyro/fc.c:I
        //   144: ifge            152
        //   147: ldc             -859175744
        //   149: goto            154
        //   152: ldc             342110070
        //   154: ldc             -854804987
        //   156: ixor           
        //   157: lookupswitch {
        //          29799109: 487
        //          610359891: 152
        //          default: 184
        //        }
        //   184: istore          11
        //   186: iload           5
        //   188: i2d            
        //   189: dload           7
        //   191: dsub           
        //   192: dstore          7
        //   194: dload           9
        //   196: getstatic       dev/nuker/pyro/fc.c:I
        //   199: ifge            207
        //   202: ldc             2092634008
        //   204: goto            209
        //   207: ldc             -407924437
        //   209: ldc             -1989758952
        //   211: ixor           
        //   212: lookupswitch {
        //          -170016896: 207
        //          1858674995: 240
        //          default: 493
        //        }
        //   240: iload           6
        //   242: i2d            
        //   243: ldc2_w          2.0
        //   246: ddiv           
        //   247: dcmpg          
        //   248: ifge            301
        //   251: iconst_m1      
        //   252: getstatic       dev/nuker/pyro/fc.c:I
        //   255: ifge            263
        //   258: ldc             807259703
        //   260: goto            265
        //   263: ldc             -580298863
        //   265: ldc             2028638428
        //   267: ixor           
        //   268: lookupswitch {
        //          -1518090419: 296
        //          1224171243: 263
        //          default: 483
        //        }
        //   296: istore          12
        //   298: goto            354
        //   301: iconst_1       
        //   302: getstatic       dev/nuker/pyro/fc.1:I
        //   305: ifeq            313
        //   308: ldc             455331741
        //   310: goto            315
        //   313: ldc             154304447
        //   315: ldc             1253750157
        //   317: ixor           
        //   318: lookupswitch {
        //          1133038130: 344
        //          1369012752: 313
        //          default: 491
        //        }
        //   344: istore          12
        //   346: iload           6
        //   348: i2d            
        //   349: dload           9
        //   351: dsub           
        //   352: dstore          9
        //   354: new             Ldev/nuker/pyro/f0u;
        //   357: dup            
        //   358: getstatic       dev/nuker/pyro/f0s.c:Ldev/nuker/pyro/f0r;
        //   361: getstatic       dev/nuker/pyro/fc.0:I
        //   364: ifeq            372
        //   367: ldc             -1330112414
        //   369: goto            374
        //   372: ldc             749050437
        //   374: ldc             1462386591
        //   376: ixor           
        //   377: lookupswitch {
        //          -947279981: 372
        //          -409851907: 481
        //          default: 404
        //        }
        //   404: iload           11
        //   406: iload           12
        //   408: getstatic       dev/nuker/pyro/fc.0:I
        //   411: ifeq            419
        //   414: ldc             -1683030154
        //   416: goto            421
        //   419: ldc             -1629659726
        //   421: ldc             754244069
        //   423: ixor           
        //   424: lookupswitch {
        //          -1218828653: 479
        //          1201585268: 419
        //          default: 452
        //        }
        //   452: goto            456
        //   455: athrow         
        //   456: invokevirtual   dev/nuker/pyro/f0r.c:(II)Ldev/nuker/pyro/f0s;
        //   459: goto            463
        //   462: athrow         
        //   463: dload           7
        //   465: dload           9
        //   467: goto            471
        //   470: athrow         
        //   471: invokespecial   dev/nuker/pyro/f0u.<init>:(Ldev/nuker/pyro/f0s;DD)V
        //   474: goto            478
        //   477: athrow         
        //   478: areturn        
        //   479: aconst_null    
        //   480: athrow         
        //   481: aconst_null    
        //   482: athrow         
        //   483: aconst_null    
        //   484: athrow         
        //   485: aconst_null    
        //   486: athrow         
        //   487: aconst_null    
        //   488: athrow         
        //   489: aconst_null    
        //   490: athrow         
        //   491: aconst_null    
        //   492: athrow         
        //   493: aconst_null    
        //   494: athrow         
        //   495: pop            
        //   496: goto            24
        //   499: pop            
        //   500: aconst_null    
        //   501: goto            495
        //   504: dup            
        //   505: ifnull          495
        //   508: checkcast       Ljava/lang/Throwable;
        //   511: athrow         
        //   512: dup            
        //   513: ifnull          499
        //   516: checkcast       Ljava/lang/Throwable;
        //   519: athrow         
        //   520: aconst_null    
        //   521: athrow         
        //    StackMapTable: 00 35 FF 00 03 00 09 07 00 03 03 03 01 01 03 03 01 01 00 01 07 00 1D FF 00 04 00 05 07 00 03 03 03 01 01 00 00 FF 00 0B 00 00 00 01 07 00 1D FF 00 03 00 05 07 00 03 03 03 01 01 00 00 0A 41 01 1E FC 00 0D 03 41 01 1B FE 00 1B 03 01 01 4B 01 FF 00 01 00 09 07 00 03 03 03 01 01 03 03 01 01 00 02 01 01 5D 01 09 4C 03 FF 00 01 00 09 07 00 03 03 03 01 01 03 03 01 01 00 02 03 01 5E 03 56 01 FF 00 01 00 09 07 00 03 03 03 01 01 03 03 01 01 00 02 01 01 5E 01 04 4B 01 FF 00 01 00 09 07 00 03 03 03 01 01 03 03 01 01 00 02 01 01 5C 01 09 FF 00 11 00 09 07 00 03 03 03 01 01 03 03 01 01 00 03 08 01 62 08 01 62 07 00 45 FF 00 01 00 09 07 00 03 03 03 01 01 03 03 01 01 00 04 08 01 62 08 01 62 07 00 45 01 FF 00 1D 00 09 07 00 03 03 03 01 01 03 03 01 01 00 03 08 01 62 08 01 62 07 00 45 FF 00 0E 00 09 07 00 03 03 03 01 01 03 03 01 01 00 05 08 01 62 08 01 62 07 00 45 01 01 FF 00 01 00 09 07 00 03 03 03 01 01 03 03 01 01 00 06 08 01 62 08 01 62 07 00 45 01 01 01 FF 00 1E 00 09 07 00 03 03 03 01 01 03 03 01 01 00 05 08 01 62 08 01 62 07 00 45 01 01 FF 00 02 00 00 00 01 07 00 1D FF 00 00 00 09 07 00 03 03 03 01 01 03 03 01 01 00 05 08 01 62 08 01 62 07 00 45 01 01 45 07 00 1D FF 00 00 00 09 07 00 03 03 03 01 01 03 03 01 01 00 03 08 01 62 08 01 62 07 00 3A 46 07 00 15 FF 00 00 00 09 07 00 03 03 03 01 01 03 03 01 01 00 05 08 01 62 08 01 62 07 00 3A 03 03 45 07 00 1D 40 07 00 38 FF 00 00 00 09 07 00 03 03 03 01 01 03 03 01 01 00 05 08 01 62 08 01 62 07 00 45 01 01 FF 00 01 00 09 07 00 03 03 03 01 01 03 03 01 01 00 03 08 01 62 08 01 62 07 00 45 41 01 FF 00 01 00 05 07 00 03 03 03 01 01 00 00 FF 00 01 00 09 07 00 03 03 03 01 01 03 03 01 01 00 01 01 F8 00 01 FF 00 01 00 09 07 00 03 03 03 01 01 03 03 01 01 00 01 01 41 03 FF 00 01 00 05 07 00 03 03 03 01 01 00 01 07 00 4E 43 05 44 07 00 4E 47 05 FF 00 07 00 09 07 00 03 03 03 01 01 03 03 01 01 00 01 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     504    512    Ljava/lang/NegativeArraySizeException;
        //  504    512    504    512    Ljava/lang/UnsupportedOperationException;
        //  520    522    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  456    462    462    463    Any
        //  456    462    462    463    Any
        //  456    462    462    463    Any
        //  456    462    462    463    Ljava/lang/EnumConstantNotPresentException;
        //  456    462    462    463    Any
        //  470    477    477    478    Any
        //  471    477    477    478    Any
        //  470    477    470    471    Ljava/lang/IllegalArgumentException;
        //  470    477    3      8      Any
        //  471    477    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 4], but value was: 5.
        //     at com.strobel.core.VerifyArgument.inRange(VerifyArgument.java:347)
        //     at com.strobel.assembler.ir.StackMappingVisitor.getStackValue(StackMappingVisitor.java:67)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:691)
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
    
    public f0t() {
        while (true) {
            int n = 0;
            Label_0014: {
                if (fc.0 != 0) {
                    n = 1931329218;
                    break Label_0014;
                }
                n = 439689096;
            }
            switch (n ^ 0x83210FA5) {
                case -264457881: {
                    continue;
                }
                case -1726738387: {}
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public f0t(final DefaultConstructorMarker defaultConstructorMarker) {
        while (true) {
            int n = 0;
            Label_0014: {
                if (fc.1 != 0) {
                    n = 61954211;
                    break Label_0014;
                }
                n = -539763627;
            }
            switch (n ^ 0x78C90166) {
                case 810675271: {
                    continue;
                }
                default: {
                    this();
                }
                case 2071484869: {
                    throw null;
                }
            }
            break;
        }
    }
}
