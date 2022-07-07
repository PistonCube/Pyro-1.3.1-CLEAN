// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.concurrent.TimeUnit;

public class fbt
{
    public long c;
    
    public long 1() {
        return fbS.bS(this, 561359540);
    }
    
    public boolean c(final long p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          66
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            58
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            50
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: lload_1        
        //    26: getstatic       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //    29: goto            33
        //    32: athrow         
        //    33: invokevirtual   dev/nuker/pyro/fbt.c:(JLjava/util/concurrent/TimeUnit;)Z
        //    36: goto            40
        //    39: athrow         
        //    40: ireturn        
        //    41: pop            
        //    42: goto            24
        //    45: pop            
        //    46: aconst_null    
        //    47: goto            41
        //    50: dup            
        //    51: ifnull          41
        //    54: checkcast       Ljava/lang/Throwable;
        //    57: athrow         
        //    58: dup            
        //    59: ifnull          45
        //    62: checkcast       Ljava/lang/Throwable;
        //    65: athrow         
        //    66: aconst_null    
        //    67: athrow         
        //    StackMapTable: 00 0D 43 07 00 19 04 FF 00 0B 00 00 00 01 07 00 20 FD 00 03 07 00 03 04 47 07 00 20 FF 00 00 00 02 07 00 03 04 00 03 07 00 03 04 07 00 22 45 07 00 20 40 01 40 07 00 20 43 05 44 07 00 20 47 05 47 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     50     58     Any
        //  50     58     50     58     Ljava/lang/IndexOutOfBoundsException;
        //  66     68     3      8      Ljava/util/ConcurrentModificationException;
        //  32     39     39     40     Any
        //  33     39     3      8      Ljava/lang/ClassCastException;
        //  33     39     32     33     Ljava/lang/RuntimeException;
        //  32     39     32     33     Any
        //  32     39     32     33     Ljava/lang/ClassCastException;
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
    
    public long 0() {
        return fbS.bT(this, 404979889);
    }
    
    public void c() {
        fbS.dZ(this, 1802669298);
    }
    
    static {
        throw t;
    }
    
    public boolean c(final long p0, final TimeUnit p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          378
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            370
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            362
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             1944903090
        //    32: goto            37
        //    35: ldc             590497382
        //    37: ldc             1057965176
        //    39: ixor           
        //    40: lookupswitch {
        //          473760286: 68
        //          1289984458: 35
        //          default: 349
        //        }
        //    68: aload_3        
        //    69: goto            73
        //    72: athrow         
        //    73: invokestatic    java/lang/System.nanoTime:()J
        //    76: goto            80
        //    79: athrow         
        //    80: aload_0        
        //    81: getstatic       dev/nuker/pyro/fc.1:I
        //    84: ifeq            92
        //    87: ldc             -1073311902
        //    89: goto            94
        //    92: ldc             1155700376
        //    94: ldc             -462317284
        //    96: ixor           
        //    97: lookupswitch {
        //          -1600974972: 124
        //          611784318: 92
        //          default: 351
        //        }
        //   124: getfield        dev/nuker/pyro/fbt.c:J
        //   127: lsub           
        //   128: getstatic       java/util/concurrent/TimeUnit.NANOSECONDS:Ljava/util/concurrent/TimeUnit;
        //   131: goto            135
        //   134: athrow         
        //   135: invokevirtual   java/util/concurrent/TimeUnit.convert:(JLjava/util/concurrent/TimeUnit;)J
        //   138: goto            142
        //   141: athrow         
        //   142: dup2           
        //   143: getstatic       dev/nuker/pyro/fc.1:I
        //   146: ifeq            154
        //   149: ldc             -2120686150
        //   151: goto            156
        //   154: ldc             -958350878
        //   156: ldc             -245971791
        //   158: ixor           
        //   159: lookupswitch {
        //          934706515: 184
        //          1892557067: 154
        //          default: 343
        //        }
        //   184: lstore          4
        //   186: getstatic       dev/nuker/pyro/fc.c:I
        //   189: ifge            197
        //   192: ldc             -1441771999
        //   194: goto            199
        //   197: ldc             1610322891
        //   199: ldc             518784071
        //   201: ixor           
        //   202: lookupswitch {
        //          -1471085111: 197
        //          -1258534298: 341
        //          default: 228
        //        }
        //   228: lload_1        
        //   229: lcmp           
        //   230: iflt            287
        //   233: aload_0        
        //   234: getstatic       dev/nuker/pyro/fc.1:I
        //   237: ifeq            245
        //   240: ldc             1565360372
        //   242: goto            247
        //   245: ldc             -1440172542
        //   247: ldc             1578779401
        //   249: ixor           
        //   250: lookupswitch {
        //          -1872046048: 245
        //          56083453: 345
        //          default: 276
        //        }
        //   276: goto            280
        //   279: athrow         
        //   280: invokevirtual   dev/nuker/pyro/fbt.c:()V
        //   283: goto            287
        //   286: athrow         
        //   287: getstatic       dev/nuker/pyro/fc.0:I
        //   290: ifeq            298
        //   293: ldc             569103947
        //   295: goto            300
        //   298: ldc             130002888
        //   300: ldc             -30794869
        //   302: ixor           
        //   303: lookupswitch {
        //          -540947008: 347
        //          319691200: 298
        //          default: 328
        //        }
        //   328: lload           4
        //   330: lload_1        
        //   331: lcmp           
        //   332: iflt            339
        //   335: iconst_1       
        //   336: goto            340
        //   339: iconst_0       
        //   340: ireturn        
        //   341: aconst_null    
        //   342: athrow         
        //   343: aconst_null    
        //   344: athrow         
        //   345: aconst_null    
        //   346: athrow         
        //   347: aconst_null    
        //   348: athrow         
        //   349: aconst_null    
        //   350: athrow         
        //   351: aconst_null    
        //   352: athrow         
        //   353: pop            
        //   354: goto            24
        //   357: pop            
        //   358: aconst_null    
        //   359: goto            353
        //   362: dup            
        //   363: ifnull          353
        //   366: checkcast       Ljava/lang/Throwable;
        //   369: athrow         
        //   370: dup            
        //   371: ifnull          357
        //   374: checkcast       Ljava/lang/Throwable;
        //   377: athrow         
        //   378: aconst_null    
        //   379: athrow         
        //    StackMapTable: 00 2F 43 07 00 20 04 FF 00 0B 00 00 00 01 07 00 20 FE 00 03 07 00 03 04 07 00 22 0A 41 01 1E 43 07 00 3B 40 07 00 22 45 07 00 20 FF 00 00 00 03 07 00 03 04 07 00 22 00 02 07 00 22 04 FF 00 0B 00 03 07 00 03 04 07 00 22 00 03 07 00 22 04 07 00 03 FF 00 01 00 03 07 00 03 04 07 00 22 00 04 07 00 22 04 07 00 03 01 FF 00 1D 00 03 07 00 03 04 07 00 22 00 03 07 00 22 04 07 00 03 49 07 00 3D FF 00 00 00 03 07 00 03 04 07 00 22 00 03 07 00 22 04 07 00 22 45 07 00 20 40 04 FF 00 0B 00 03 07 00 03 04 07 00 22 00 02 04 04 FF 00 01 00 03 07 00 03 04 07 00 22 00 03 04 04 01 FF 00 1B 00 03 07 00 03 04 07 00 22 00 02 04 04 FF 00 0C 00 04 07 00 03 04 07 00 22 04 00 01 04 FF 00 01 00 04 07 00 03 04 07 00 22 04 00 02 04 01 5C 04 50 07 00 03 FF 00 01 00 04 07 00 03 04 07 00 22 04 00 02 07 00 03 01 5C 07 00 03 42 07 00 20 40 07 00 03 45 07 00 20 00 0A 41 01 1B 0A 40 01 40 04 FF 00 01 00 03 07 00 03 04 07 00 22 00 02 04 04 FF 00 01 00 04 07 00 03 04 07 00 22 04 00 01 07 00 03 01 FA 00 01 FF 00 01 00 03 07 00 03 04 07 00 22 00 03 07 00 22 04 07 00 03 41 07 00 20 43 05 44 07 00 20 47 05 47 07 00 20
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  8      20     362    370    Any
        //  362    370    362    370    Ljava/lang/IllegalStateException;
        //  378    380    3      8      Any
        //  72     79     79     80     Any
        //  72     79     3      8      Any
        //  73     79     3      8      Ljava/lang/ClassCastException;
        //  72     79     72     73     Ljava/lang/IllegalStateException;
        //  72     79     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  134    141    141    142    Any
        //  134    141    141    142    Ljava/lang/RuntimeException;
        //  134    141    3      8      Ljava/lang/NullPointerException;
        //  134    141    134    135    Ljava/lang/NullPointerException;
        //  134    141    141    142    Ljava/lang/NullPointerException;
        //  279    286    286    287    Any
        //  280    286    279    280    Ljava/lang/IllegalArgumentException;
        //  279    286    279    280    Any
        //  279    286    286    287    Ljava/lang/IndexOutOfBoundsException;
        //  280    286    279    280    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 36 out of bounds for length 36
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
    
    public long c(final TimeUnit p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          172
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            164
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            156
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: goto            29
        //    28: athrow         
        //    29: invokestatic    java/lang/System.nanoTime:()J
        //    32: goto            36
        //    35: athrow         
        //    36: getstatic       dev/nuker/pyro/fc.c:I
        //    39: ifge            47
        //    42: ldc             -794157636
        //    44: goto            49
        //    47: ldc             1279809313
        //    49: ldc             -127160923
        //    51: ixor           
        //    52: lookupswitch {
        //          -1272710524: 80
        //          683782169: 47
        //          default: 145
        //        }
        //    80: aload_0        
        //    81: getstatic       dev/nuker/pyro/fc.c:I
        //    84: ifge            92
        //    87: ldc             -1999311649
        //    89: goto            94
        //    92: ldc             -70056043
        //    94: ldc             1153314371
        //    96: ixor           
        //    97: lookupswitch {
        //          -2093757490: 92
        //          -865418596: 143
        //          default: 124
        //        }
        //   124: getfield        dev/nuker/pyro/fbt.c:J
        //   127: lsub           
        //   128: getstatic       java/util/concurrent/TimeUnit.NANOSECONDS:Ljava/util/concurrent/TimeUnit;
        //   131: goto            135
        //   134: athrow         
        //   135: invokevirtual   java/util/concurrent/TimeUnit.convert:(JLjava/util/concurrent/TimeUnit;)J
        //   138: goto            142
        //   141: athrow         
        //   142: lreturn        
        //   143: aconst_null    
        //   144: athrow         
        //   145: aconst_null    
        //   146: athrow         
        //   147: pop            
        //   148: goto            24
        //   151: pop            
        //   152: aconst_null    
        //   153: goto            147
        //   156: dup            
        //   157: ifnull          147
        //   160: checkcast       Ljava/lang/Throwable;
        //   163: athrow         
        //   164: dup            
        //   165: ifnull          151
        //   168: checkcast       Ljava/lang/Throwable;
        //   171: athrow         
        //   172: aconst_null    
        //   173: athrow         
        //    StackMapTable: 00 19 43 07 00 20 04 FF 00 0B 00 00 00 01 07 00 20 FD 00 03 07 00 03 07 00 22 43 07 00 6A 40 07 00 22 45 07 00 20 FF 00 00 00 02 07 00 03 07 00 22 00 02 07 00 22 04 FF 00 0A 00 02 07 00 03 07 00 22 00 02 07 00 22 04 FF 00 01 00 02 07 00 03 07 00 22 00 03 07 00 22 04 01 FF 00 1E 00 02 07 00 03 07 00 22 00 02 07 00 22 04 FF 00 0B 00 02 07 00 03 07 00 22 00 03 07 00 22 04 07 00 03 FF 00 01 00 02 07 00 03 07 00 22 00 04 07 00 22 04 07 00 03 01 FF 00 1D 00 02 07 00 03 07 00 22 00 03 07 00 22 04 07 00 03 49 07 00 19 FF 00 00 00 02 07 00 03 07 00 22 00 03 07 00 22 04 07 00 22 45 07 00 20 40 04 FF 00 00 00 02 07 00 03 07 00 22 00 03 07 00 22 04 07 00 03 FF 00 01 00 02 07 00 03 07 00 22 00 02 07 00 22 04 41 07 00 19 43 05 44 07 00 19 47 05 47 07 00 20
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     156    164    Ljava/lang/RuntimeException;
        //  156    164    156    164    Ljava/lang/IndexOutOfBoundsException;
        //  172    174    3      8      Ljava/lang/NumberFormatException;
        //  28     35     35     36     Any
        //  29     35     28     29     Ljava/lang/UnsupportedOperationException;
        //  28     35     3      8      Any
        //  29     35     3      8      Any
        //  28     35     3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  134    141    141    142    Any
        //  135    141    3      8      Any
        //  134    141    134    135    Ljava/lang/RuntimeException;
        //  135    141    141    142    Any
        //  134    141    3      8      Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 61 out of bounds for length 61
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
}
