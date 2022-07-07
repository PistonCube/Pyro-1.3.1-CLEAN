// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;

public class f1c extends f0Z
{
    @NotNull
    @Override
    public f0Z c(final double p0, final double p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          242
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            234
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            226
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ldev/nuker/pyro/f1c;
        //    27: dup            
        //    28: aload_0        
        //    29: goto            33
        //    32: athrow         
        //    33: invokevirtual   dev/nuker/pyro/f1c.4:()D
        //    36: goto            40
        //    39: athrow         
        //    40: dload_1        
        //    41: dsub           
        //    42: getstatic       dev/nuker/pyro/fc.1:I
        //    45: ifeq            53
        //    48: ldc             -2038701717
        //    50: goto            55
        //    53: ldc             1431246302
        //    55: ldc             195197638
        //    57: ixor           
        //    58: lookupswitch {
        //          -1915118675: 53
        //          1592618776: 84
        //          default: 211
        //        }
        //    84: aload_0        
        //    85: goto            89
        //    88: athrow         
        //    89: invokevirtual   dev/nuker/pyro/f1c.3:()D
        //    92: goto            96
        //    95: athrow         
        //    96: getstatic       dev/nuker/pyro/fc.c:I
        //    99: ifge            107
        //   102: ldc             839558670
        //   104: goto            109
        //   107: ldc             1862176107
        //   109: ldc             -2130990599
        //   111: ixor           
        //   112: lookupswitch {
        //          -1292824585: 213
        //          -928264940: 107
        //          default: 140
        //        }
        //   140: dload_3        
        //   141: dsub           
        //   142: getstatic       dev/nuker/pyro/fc.c:I
        //   145: ifge            153
        //   148: ldc             998439891
        //   150: goto            155
        //   153: ldc             -1251894343
        //   155: ldc             1884704730
        //   157: ixor           
        //   158: lookupswitch {
        //          -986196893: 184
        //          1272230921: 153
        //          default: 215
        //        }
        //   184: aload_0        
        //   185: goto            189
        //   188: athrow         
        //   189: invokevirtual   dev/nuker/pyro/f1c.c:()I
        //   192: goto            196
        //   195: athrow         
        //   196: goto            200
        //   199: athrow         
        //   200: invokespecial   dev/nuker/pyro/f1c.<init>:(DDI)V
        //   203: goto            207
        //   206: athrow         
        //   207: checkcast       Ldev/nuker/pyro/f0Z;
        //   210: areturn        
        //   211: aconst_null    
        //   212: athrow         
        //   213: aconst_null    
        //   214: athrow         
        //   215: aconst_null    
        //   216: athrow         
        //   217: pop            
        //   218: goto            24
        //   221: pop            
        //   222: aconst_null    
        //   223: goto            217
        //   226: dup            
        //   227: ifnull          217
        //   230: checkcast       Ljava/lang/Throwable;
        //   233: athrow         
        //   234: dup            
        //   235: ifnull          221
        //   238: checkcast       Ljava/lang/Throwable;
        //   241: athrow         
        //   242: aconst_null    
        //   243: athrow         
        //    StackMapTable: 00 25 43 07 00 1E 04 FF 00 0B 00 00 00 01 07 00 1E FE 00 03 07 00 03 03 03 FF 00 07 00 00 00 01 07 00 1E FF 00 00 00 03 07 00 03 03 03 00 03 08 00 18 08 00 18 07 00 03 45 07 00 1E FF 00 00 00 03 07 00 03 03 03 00 03 08 00 18 08 00 18 03 FF 00 0C 00 03 07 00 03 03 03 00 03 08 00 18 08 00 18 03 FF 00 01 00 03 07 00 03 03 03 00 04 08 00 18 08 00 18 03 01 FF 00 1C 00 03 07 00 03 03 03 00 03 08 00 18 08 00 18 03 43 07 00 12 FF 00 00 00 03 07 00 03 03 03 00 04 08 00 18 08 00 18 03 07 00 03 45 07 00 1E FF 00 00 00 03 07 00 03 03 03 00 04 08 00 18 08 00 18 03 03 FF 00 0A 00 03 07 00 03 03 03 00 04 08 00 18 08 00 18 03 03 FF 00 01 00 03 07 00 03 03 03 00 05 08 00 18 08 00 18 03 03 01 FF 00 1E 00 03 07 00 03 03 03 00 04 08 00 18 08 00 18 03 03 FF 00 0C 00 03 07 00 03 03 03 00 04 08 00 18 08 00 18 03 03 FF 00 01 00 03 07 00 03 03 03 00 05 08 00 18 08 00 18 03 03 01 FF 00 1C 00 03 07 00 03 03 03 00 04 08 00 18 08 00 18 03 03 43 07 00 16 FF 00 00 00 03 07 00 03 03 03 00 05 08 00 18 08 00 18 03 03 07 00 03 45 07 00 1E FF 00 00 00 03 07 00 03 03 03 00 05 08 00 18 08 00 18 03 03 01 42 07 00 1E FF 00 00 00 03 07 00 03 03 03 00 05 08 00 18 08 00 18 03 03 01 45 07 00 1E 40 07 00 03 FF 00 03 00 03 07 00 03 03 03 00 03 08 00 18 08 00 18 03 FF 00 01 00 03 07 00 03 03 03 00 04 08 00 18 08 00 18 03 03 FF 00 01 00 03 07 00 03 03 03 00 04 08 00 18 08 00 18 03 03 41 07 00 3C 43 05 44 07 00 3C 47 05 47 07 00 1E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     226    234    Ljava/lang/EnumConstantNotPresentException;
        //  226    234    226    234    Ljava/lang/NullPointerException;
        //  242    244    3      8      Any
        //  33     39     39     40     Any
        //  33     39     39     40     Any
        //  33     39     3      8      Any
        //  33     39     3      8      Any
        //  33     39     3      8      Ljava/util/NoSuchElementException;
        //  88     95     95     96     Any
        //  88     95     95     96     Any
        //  89     95     95     96     Ljava/lang/NumberFormatException;
        //  88     95     88     89     Ljava/util/ConcurrentModificationException;
        //  89     95     95     96     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  188    195    195    196    Any
        //  189    195    188    189    Ljava/lang/AssertionError;
        //  188    195    195    196    Any
        //  188    195    195    196    Any
        //  188    195    195    196    Any
        //  199    206    206    207    Any
        //  199    206    206    207    Any
        //  199    206    206    207    Any
        //  199    206    199    200    Any
        //  199    206    199    200    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 0], but value was: 5.
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
    
    static {
        throw t;
    }
    
    public f1c(final double n, final double n2, final int n3) {
        while (true) {
            int n4 = 0;
            Label_0018: {
                if (fc.1 != 0) {
                    n4 = -1810529789;
                    break Label_0018;
                }
                n4 = -1049331469;
            }
            switch (n4 ^ 0x622B9623) {
                case 1778515473: {
                    continue;
                }
                default: {
                    super(n, n2, n3);
                }
                case -163703776: {
                    throw null;
                }
            }
            break;
        }
    }
}
