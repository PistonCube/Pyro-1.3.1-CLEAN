// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import com.google.gson.JsonObject;
import java.awt.Color;
import org.jetbrains.annotations.NotNull;

public class fR
{
    public fR(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    static {
        throw t;
    }
    
    @NotNull
    public fS c(final int p0, final int p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          129
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            121
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            113
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: checkcast       Ldev/nuker/pyro/fR;
        //    28: iload_1        
        //    29: i2f            
        //    30: ldc             255.0
        //    32: fdiv           
        //    33: iload_2        
        //    34: i2f            
        //    35: ldc             255.0
        //    37: fdiv           
        //    38: iload_3        
        //    39: i2f            
        //    40: ldc             255.0
        //    42: fdiv           
        //    43: getstatic       dev/nuker/pyro/fc.0:I
        //    46: ifeq            54
        //    49: ldc             1828106027
        //    51: goto            56
        //    54: ldc             -1270280938
        //    56: ldc             1474481659
        //    58: ixor           
        //    59: lookupswitch {
        //          -475283219: 84
        //          991191760: 54
        //          default: 102
        //        }
        //    84: iload           4
        //    86: i2f            
        //    87: ldc             255.0
        //    89: fdiv           
        //    90: goto            94
        //    93: athrow         
        //    94: invokevirtual   dev/nuker/pyro/fR.0:(FFFF)Ldev/nuker/pyro/fS;
        //    97: goto            101
        //   100: athrow         
        //   101: areturn        
        //   102: aconst_null    
        //   103: athrow         
        //   104: pop            
        //   105: goto            24
        //   108: pop            
        //   109: aconst_null    
        //   110: goto            104
        //   113: dup            
        //   114: ifnull          104
        //   117: checkcast       Ljava/lang/Throwable;
        //   120: athrow         
        //   121: dup            
        //   122: ifnull          108
        //   125: checkcast       Ljava/lang/Throwable;
        //   128: athrow         
        //   129: aconst_null    
        //   130: athrow         
        //    StackMapTable: 00 11 43 07 00 1B 04 FF 00 0B 00 00 00 01 07 00 1B FF 00 03 00 05 07 00 03 01 01 01 01 00 00 FF 00 1D 00 05 07 00 03 01 01 01 01 00 04 07 00 03 02 02 02 FF 00 01 00 05 07 00 03 01 01 01 01 00 05 07 00 03 02 02 02 01 FF 00 1B 00 05 07 00 03 01 01 01 01 00 04 07 00 03 02 02 02 48 07 00 1B FF 00 00 00 05 07 00 03 01 01 01 01 00 05 07 00 03 02 02 02 02 45 07 00 1B 40 07 00 24 FF 00 00 00 05 07 00 03 01 01 01 01 00 04 07 00 03 02 02 02 41 07 00 1B 43 05 44 07 00 1B 47 05 47 07 00 1B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  8      20     113    121    Any
        //  113    121    113    121    Any
        //  129    131    3      8      Any
        //  93     100    100    101    Any
        //  93     100    100    101    Any
        //  94     100    93     94     Any
        //  93     100    3      8      Ljava/lang/RuntimeException;
        //  94     100    93     94     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 52 out of bounds for length 52
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
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
    
    @NotNull
    public fS c(@NotNull final Color color) {
        return fbS.32(this, 541611965, color);
    }
    
    public float 0(final float p0, final float p1, final float p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.0:I
        //     4: ifgt            360
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            352
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: getstatic       dev/nuker/pyro/fc.1:I
        //    19: ifeq            27
        //    22: ldc             1572845625
        //    24: goto            29
        //    27: ldc             -485645694
        //    29: ldc             -1345610893
        //    31: ixor           
        //    32: lookupswitch {
        //          -227269814: 341
        //          1079000585: 27
        //          default: 60
        //        }
        //    60: fload_1        
        //    61: getstatic       dev/nuker/pyro/fc.1:I
        //    64: ifeq            72
        //    67: ldc             -1727940565
        //    69: goto            74
        //    72: ldc             1998769456
        //    74: ldc             2100754870
        //    76: ixor           
        //    77: lookupswitch {
        //          -1128782825: 72
        //          -466140771: 333
        //          default: 104
        //        }
        //   104: fload_2        
        //   105: fcmpg          
        //   106: ifge            114
        //   109: ldc             -9396825
        //   111: goto            116
        //   114: ldc             -9396832
        //   116: ldc             -728916924
        //   118: ixor           
        //   119: tableswitch {
        //          1476002758: 140
        //          1476002759: 144
        //          default: 109
        //        }
        //   140: fload_1        
        //   141: goto            145
        //   144: fload_2        
        //   145: getstatic       dev/nuker/pyro/fc.1:I
        //   148: ifeq            156
        //   151: ldc             -511248627
        //   153: goto            158
        //   156: ldc             -865935588
        //   158: ldc             -2081636456
        //   160: ixor           
        //   161: lookupswitch {
        //          -943308035: 156
        //          1651132565: 337
        //          default: 188
        //        }
        //   188: fstore          4
        //   190: getstatic       dev/nuker/pyro/fc.1:I
        //   193: ifeq            201
        //   196: ldc             -694462376
        //   198: goto            203
        //   201: ldc             1585572444
        //   203: ldc             88318779
        //   205: ixor           
        //   206: lookupswitch {
        //          -740754589: 201
        //          1539459431: 232
        //          default: 331
        //        }
        //   232: fload           4
        //   234: getstatic       dev/nuker/pyro/fc.1:I
        //   237: ifeq            245
        //   240: ldc             -2048331568
        //   242: goto            247
        //   245: ldc             -1035196120
        //   247: ldc             1267084029
        //   249: ixor           
        //   250: lookupswitch {
        //          -1983249451: 276
        //          -831595987: 245
        //          default: 339
        //        }
        //   276: fload_3        
        //   277: fcmpg          
        //   278: ifge            329
        //   281: getstatic       dev/nuker/pyro/fc.1:I
        //   284: ifeq            292
        //   287: ldc             1654689207
        //   289: goto            294
        //   292: ldc             -1539571545
        //   294: ldc             605543475
        //   296: ixor           
        //   297: lookupswitch {
        //          -2144609132: 324
        //          1186419076: 292
        //          default: 335
        //        }
        //   324: fload           4
        //   326: goto            330
        //   329: fload_3        
        //   330: freturn        
        //   331: aconst_null    
        //   332: athrow         
        //   333: aconst_null    
        //   334: athrow         
        //   335: aconst_null    
        //   336: athrow         
        //   337: aconst_null    
        //   338: athrow         
        //   339: aconst_null    
        //   340: athrow         
        //   341: aconst_null    
        //   342: athrow         
        //   343: pop            
        //   344: goto            16
        //   347: pop            
        //   348: aconst_null    
        //   349: goto            343
        //   352: dup            
        //   353: ifnull          343
        //   356: checkcast       Ljava/lang/Throwable;
        //   359: athrow         
        //   360: dup            
        //   361: ifnull          347
        //   364: checkcast       Ljava/lang/Throwable;
        //   367: athrow         
        //    StackMapTable: 00 26 FF 00 0C 00 00 00 01 07 00 1B FF 00 03 00 04 07 00 03 02 02 02 00 00 0A 41 01 1E 4B 02 FF 00 01 00 04 07 00 03 02 02 02 00 02 02 01 5D 02 04 04 41 01 17 03 40 02 4A 02 FF 00 01 00 04 07 00 03 02 02 02 00 02 02 01 5D 02 FC 00 0C 02 41 01 1C 4C 02 FF 00 01 00 05 07 00 03 02 02 02 02 00 02 02 01 5C 02 0F 41 01 1D 04 40 02 00 FF 00 01 00 04 07 00 03 02 02 02 00 01 02 FC 00 01 02 FF 00 01 00 04 07 00 03 02 02 02 00 01 02 FF 00 01 00 05 07 00 03 02 02 02 02 00 01 02 FA 00 01 41 07 00 1B 43 05 44 07 00 1B 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      12     352    360    Any
        //  352    360    352    360    Ljava/lang/NumberFormatException;
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
    public fS 0(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          239
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            231
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            223
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iload_1        
        //    25: bipush          24
        //    27: iushr          
        //    28: sipush          255
        //    31: iand           
        //    32: istore_2       
        //    33: iload_1        
        //    34: bipush          16
        //    36: iushr          
        //    37: sipush          255
        //    40: iand           
        //    41: istore_3       
        //    42: getstatic       dev/nuker/pyro/fc.1:I
        //    45: ifeq            53
        //    48: ldc             -532938677
        //    50: goto            55
        //    53: ldc             -447999926
        //    55: ldc             963521736
        //    57: ixor           
        //    58: lookupswitch {
        //          -648926077: 53
        //          -601736062: 84
        //          default: 212
        //        }
        //    84: iload_1        
        //    85: bipush          8
        //    87: iushr          
        //    88: sipush          255
        //    91: iand           
        //    92: istore          4
        //    94: getstatic       dev/nuker/pyro/fc.c:I
        //    97: ifge            105
        //   100: ldc             -1714417675
        //   102: goto            107
        //   105: ldc             1510058934
        //   107: ldc             1899838786
        //   109: ixor           
        //   110: lookupswitch {
        //          -387108169: 105
        //          725391092: 136
        //          default: 208
        //        }
        //   136: iload_1        
        //   137: sipush          255
        //   140: iand           
        //   141: getstatic       dev/nuker/pyro/fc.1:I
        //   144: ifeq            152
        //   147: ldc             771002856
        //   149: goto            154
        //   152: ldc             -1086073590
        //   154: ldc             -552521223
        //   156: ixor           
        //   157: lookupswitch {
        //          -219832303: 152
        //          1616045299: 184
        //          default: 210
        //        }
        //   184: istore          5
        //   186: aload_0        
        //   187: checkcast       Ldev/nuker/pyro/fR;
        //   190: iload_3        
        //   191: iload           4
        //   193: iload           5
        //   195: iload_2        
        //   196: goto            200
        //   199: athrow         
        //   200: invokevirtual   dev/nuker/pyro/fR.c:(IIII)Ldev/nuker/pyro/fS;
        //   203: goto            207
        //   206: athrow         
        //   207: areturn        
        //   208: aconst_null    
        //   209: athrow         
        //   210: aconst_null    
        //   211: athrow         
        //   212: aconst_null    
        //   213: athrow         
        //   214: pop            
        //   215: goto            24
        //   218: pop            
        //   219: aconst_null    
        //   220: goto            214
        //   223: dup            
        //   224: ifnull          214
        //   227: checkcast       Ljava/lang/Throwable;
        //   230: athrow         
        //   231: dup            
        //   232: ifnull          218
        //   235: checkcast       Ljava/lang/Throwable;
        //   238: athrow         
        //   239: aconst_null    
        //   240: athrow         
        //    StackMapTable: 00 19 FF 00 03 00 06 07 00 03 01 01 01 01 01 00 01 07 00 1B FF 00 04 00 02 07 00 03 01 00 00 FF 00 0B 00 00 00 01 07 00 1B FD 00 03 07 00 03 01 FD 00 1C 01 01 41 01 1C FC 00 14 01 41 01 1C 4F 01 FF 00 01 00 05 07 00 03 01 01 01 01 00 02 01 01 5D 01 FF 00 0E 00 06 07 00 03 01 01 01 01 01 00 01 07 00 1B FF 00 00 00 06 07 00 03 01 01 01 01 01 00 05 07 00 03 01 01 01 01 45 07 00 1B 40 07 00 24 FA 00 00 41 01 FA 00 01 FF 00 01 00 02 07 00 03 01 00 01 07 00 1B 43 05 44 07 00 1B 47 05 FF 00 07 00 06 07 00 03 01 01 01 01 01 00 01 07 00 1B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  8      20     223    231    Any
        //  223    231    223    231    Any
        //  239    241    3      8      Any
        //  199    206    206    207    Any
        //  199    206    3      8      Ljava/util/NoSuchElementException;
        //  199    206    199    200    Any
        //  199    206    199    200    Any
        //  199    206    3      8      Any
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
    public fS c(@NotNull final JsonObject p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          409
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            401
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            393
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_1        
        //    27: ldc             "\u10f0\u1486\ub994\ub1f7"
        //    29: goto            33
        //    32: athrow         
        //    33: invokestatic    invokestatic   !!! ERROR
        //    36: goto            40
        //    39: athrow         
        //    40: goto            44
        //    43: athrow         
        //    44: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //    47: goto            51
        //    50: athrow         
        //    51: dup            
        //    52: pop            
        //    53: goto            57
        //    56: athrow         
        //    57: invokevirtual   com/google/gson/JsonElement.getAsFloat:()F
        //    60: goto            64
        //    63: athrow         
        //    64: fstore_2       
        //    65: aload_1        
        //    66: ldc             "\u10eb\u1492\ub985\ub1dd\ufed4\udeff\ub230\ud5b5\udb76\udebb"
        //    68: goto            72
        //    71: athrow         
        //    72: invokestatic    invokestatic   !!! ERROR
        //    75: goto            79
        //    78: athrow         
        //    79: goto            83
        //    82: athrow         
        //    83: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //    86: goto            90
        //    89: athrow         
        //    90: dup            
        //    91: pop            
        //    92: goto            96
        //    95: athrow         
        //    96: invokevirtual   com/google/gson/JsonElement.getAsFloat:()F
        //    99: goto            103
        //   102: athrow         
        //   103: getstatic       dev/nuker/pyro/fc.0:I
        //   106: ifeq            114
        //   109: ldc             -1679530011
        //   111: goto            116
        //   114: ldc             1913078435
        //   116: ldc             -2138533067
        //   118: ixor           
        //   119: lookupswitch {
        //          -225455722: 144
        //          460125392: 114
        //          default: 382
        //        }
        //   144: fstore_3       
        //   145: aload_1        
        //   146: ldc             "\u10ee\u1492\ub99d\ub1dd\ufec3"
        //   148: goto            152
        //   151: athrow         
        //   152: invokestatic    invokestatic   !!! ERROR
        //   155: goto            159
        //   158: athrow         
        //   159: goto            163
        //   162: athrow         
        //   163: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   166: goto            170
        //   169: athrow         
        //   170: dup            
        //   171: pop            
        //   172: goto            176
        //   175: athrow         
        //   176: invokevirtual   com/google/gson/JsonElement.getAsFloat:()F
        //   179: goto            183
        //   182: athrow         
        //   183: fstore          4
        //   185: getstatic       dev/nuker/pyro/fc.0:I
        //   188: ifeq            196
        //   191: ldc             -1721794175
        //   193: goto            198
        //   196: ldc             -1585060780
        //   198: ldc             298775858
        //   200: ixor           
        //   201: lookupswitch {
        //          -2003733325: 378
        //          -526463789: 196
        //          default: 228
        //        }
        //   228: aload_1        
        //   229: ldc             "\u10f9\u149f\ub981\ub1c0\ufec7"
        //   231: goto            235
        //   234: athrow         
        //   235: invokestatic    invokestatic   !!! ERROR
        //   238: goto            242
        //   241: athrow         
        //   242: goto            246
        //   245: athrow         
        //   246: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   249: goto            253
        //   252: athrow         
        //   253: dup            
        //   254: pop            
        //   255: goto            259
        //   258: athrow         
        //   259: invokevirtual   com/google/gson/JsonElement.getAsFloat:()F
        //   262: goto            266
        //   265: athrow         
        //   266: fstore          5
        //   268: new             Ldev/nuker/pyro/fS;
        //   271: dup            
        //   272: getstatic       dev/nuker/pyro/fc.c:I
        //   275: ifge            283
        //   278: ldc             111391901
        //   280: goto            285
        //   283: ldc             2057111414
        //   285: ldc             -1445742415
        //   287: ixor           
        //   288: lookupswitch {
        //          -1351611348: 380
        //          -3958045: 283
        //          default: 316
        //        }
        //   316: fload_2        
        //   317: fload_3        
        //   318: getstatic       dev/nuker/pyro/fc.1:I
        //   321: ifeq            329
        //   324: ldc             -1976651582
        //   326: goto            331
        //   329: ldc             346310624
        //   331: ldc             -942615734
        //   333: ixor           
        //   334: lookupswitch {
        //          1088779529: 329
        //          1308517256: 376
        //          default: 360
        //        }
        //   360: fload           4
        //   362: fload           5
        //   364: goto            368
        //   367: athrow         
        //   368: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   371: goto            375
        //   374: athrow         
        //   375: areturn        
        //   376: aconst_null    
        //   377: athrow         
        //   378: aconst_null    
        //   379: athrow         
        //   380: aconst_null    
        //   381: athrow         
        //   382: aconst_null    
        //   383: athrow         
        //   384: pop            
        //   385: goto            24
        //   388: pop            
        //   389: aconst_null    
        //   390: goto            384
        //   393: dup            
        //   394: ifnull          384
        //   397: checkcast       Ljava/lang/Throwable;
        //   400: athrow         
        //   401: dup            
        //   402: ifnull          388
        //   405: checkcast       Ljava/lang/Throwable;
        //   408: athrow         
        //   409: aconst_null    
        //   410: athrow         
        //    StackMapTable: 00 4D 43 07 00 1B 04 FF 00 0B 00 00 00 01 07 00 1B FD 00 03 07 00 03 07 00 77 FF 00 07 00 00 00 01 07 00 1B FF 00 00 00 02 07 00 03 07 00 77 00 02 07 00 77 07 00 98 45 07 00 1B FF 00 00 00 02 07 00 03 07 00 77 00 02 07 00 77 07 00 98 42 07 00 1B FF 00 00 00 02 07 00 03 07 00 77 00 02 07 00 77 07 00 98 45 07 00 1B 40 07 00 7D 44 07 00 1B 40 07 00 7D 45 07 00 1B 40 02 FF 00 06 00 00 00 01 07 00 1B FF 00 00 00 03 07 00 03 07 00 77 02 00 02 07 00 77 07 00 98 45 07 00 1B FF 00 00 00 03 07 00 03 07 00 77 02 00 02 07 00 77 07 00 98 FF 00 02 00 00 00 01 07 00 1B FF 00 00 00 03 07 00 03 07 00 77 02 00 02 07 00 77 07 00 98 45 07 00 1B 40 07 00 7D 44 07 00 1B 40 07 00 7D 45 07 00 1B 40 02 4A 02 FF 00 01 00 03 07 00 03 07 00 77 02 00 02 02 01 5B 02 FF 00 06 00 04 07 00 03 07 00 77 02 02 00 01 07 00 1B FF 00 00 00 04 07 00 03 07 00 77 02 02 00 02 07 00 77 07 00 98 45 07 00 1B FF 00 00 00 04 07 00 03 07 00 77 02 02 00 02 07 00 77 07 00 98 FF 00 02 00 00 00 01 07 00 1B FF 00 00 00 04 07 00 03 07 00 77 02 02 00 02 07 00 77 07 00 98 45 07 00 1B 40 07 00 7D 44 07 00 1B 40 07 00 7D 45 07 00 1B 40 02 FC 00 0C 02 41 01 1D 45 07 00 1B FF 00 00 00 05 07 00 03 07 00 77 02 02 02 00 02 07 00 77 07 00 98 45 07 00 1B FF 00 00 00 05 07 00 03 07 00 77 02 02 02 00 02 07 00 77 07 00 98 42 07 00 1B FF 00 00 00 05 07 00 03 07 00 77 02 02 02 00 02 07 00 77 07 00 98 45 07 00 1B 40 07 00 7D FF 00 04 00 00 00 01 07 00 1B FF 00 00 00 05 07 00 03 07 00 77 02 02 02 00 01 07 00 7D 45 07 00 1B 40 02 FF 00 10 00 06 07 00 03 07 00 77 02 02 02 02 00 02 08 01 0C 08 01 0C FF 00 01 00 06 07 00 03 07 00 77 02 02 02 02 00 03 08 01 0C 08 01 0C 01 FF 00 1E 00 06 07 00 03 07 00 77 02 02 02 02 00 02 08 01 0C 08 01 0C FF 00 0C 00 06 07 00 03 07 00 77 02 02 02 02 00 04 08 01 0C 08 01 0C 02 02 FF 00 01 00 06 07 00 03 07 00 77 02 02 02 02 00 05 08 01 0C 08 01 0C 02 02 01 FF 00 1C 00 06 07 00 03 07 00 77 02 02 02 02 00 04 08 01 0C 08 01 0C 02 02 46 07 00 1B FF 00 00 00 06 07 00 03 07 00 77 02 02 02 02 00 06 08 01 0C 08 01 0C 02 02 02 02 45 07 00 1B 40 07 00 24 FF 00 00 00 06 07 00 03 07 00 77 02 02 02 02 00 04 08 01 0C 08 01 0C 02 02 FA 00 01 FF 00 01 00 06 07 00 03 07 00 77 02 02 02 02 00 02 08 01 0C 08 01 0C FF 00 01 00 03 07 00 03 07 00 77 02 00 01 02 FF 00 01 00 02 07 00 03 07 00 77 00 01 07 00 1B 43 05 44 07 00 1B 47 05 47 07 00 1B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     393    401    Ljava/lang/NullPointerException;
        //  393    401    393    401    Any
        //  409    411    3      8      Any
        //  33     39     39     40     Any
        //  33     39     39     40     Ljava/lang/IllegalArgumentException;
        //  33     39     39     40     Any
        //  33     39     3      8      Any
        //  33     39     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  43     50     50     51     Any
        //  43     50     50     51     Any
        //  43     50     43     44     Any
        //  44     50     50     51     Ljava/lang/RuntimeException;
        //  44     50     3      8      Any
        //  56     63     63     64     Any
        //  56     63     3      8      Any
        //  57     63     3      8      Ljava/lang/NumberFormatException;
        //  56     63     56     57     Any
        //  57     63     56     57     Any
        //  72     78     78     79     Any
        //  72     78     3      8      Any
        //  72     78     78     79     Any
        //  72     78     78     79     Ljava/lang/StringIndexOutOfBoundsException;
        //  72     78     3      8      Ljava/lang/NumberFormatException;
        //  83     89     89     90     Any
        //  83     89     89     90     Any
        //  83     89     89     90     Ljava/lang/EnumConstantNotPresentException;
        //  83     89     89     90     Any
        //  83     89     89     90     Any
        //  95     102    102    103    Any
        //  96     102    102    103    Any
        //  96     102    95     96     Ljava/lang/UnsupportedOperationException;
        //  95     102    102    103    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  96     102    95     96     Any
        //  151    158    158    159    Any
        //  151    158    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  152    158    158    159    Ljava/lang/NegativeArraySizeException;
        //  151    158    151    152    Any
        //  152    158    3      8      Ljava/lang/AssertionError;
        //  163    169    169    170    Any
        //  163    169    169    170    Any
        //  163    169    3      8      Ljava/lang/NumberFormatException;
        //  163    169    169    170    Any
        //  163    169    169    170    Ljava/lang/NullPointerException;
        //  175    182    182    183    Any
        //  175    182    182    183    Any
        //  176    182    182    183    Ljava/lang/NullPointerException;
        //  176    182    3      8      Any
        //  175    182    175    176    Any
        //  234    241    241    242    Any
        //  234    241    241    242    Any
        //  235    241    234    235    Any
        //  234    241    241    242    Any
        //  234    241    3      8      Ljava/lang/ArithmeticException;
        //  245    252    252    253    Any
        //  246    252    252    253    Any
        //  245    252    3      8      Any
        //  246    252    245    246    Any
        //  246    252    3      8      Any
        //  259    265    265    266    Any
        //  259    265    265    266    Ljava/lang/NullPointerException;
        //  259    265    3      8      Ljava/util/ConcurrentModificationException;
        //  259    265    3      8      Any
        //  259    265    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  367    374    374    375    Any
        //  367    374    374    375    Any
        //  367    374    3      8      Ljava/util/ConcurrentModificationException;
        //  368    374    374    375    Ljava/lang/UnsupportedOperationException;
        //  368    374    367    368    Any
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
    
    public float c(final float n, final float n2, final float n3) {
        return fbS.o(this, 1819511147, n, n2, n3);
    }
    
    @NotNull
    public fS 0(final float p0, final float p1, final float p2, final float p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          146
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            138
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            130
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ldev/nuker/pyro/fS;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/fc.c:I
        //    31: ifge            39
        //    34: ldc             -1903416947
        //    36: goto            41
        //    39: ldc             2063827747
        //    41: ldc             422115387
        //    43: ixor           
        //    44: lookupswitch {
        //          -1750806090: 119
        //          -1161449085: 39
        //          default: 72
        //        }
        //    72: aload_0        
        //    73: checkcast       Ldev/nuker/pyro/fR;
        //    76: iconst_4       
        //    77: newarray        F
        //    79: dup            
        //    80: iconst_0       
        //    81: fload_1        
        //    82: fastore        
        //    83: dup            
        //    84: iconst_1       
        //    85: fload_2        
        //    86: fastore        
        //    87: dup            
        //    88: iconst_2       
        //    89: fload_3        
        //    90: fastore        
        //    91: dup            
        //    92: iconst_3       
        //    93: fload           4
        //    95: fastore        
        //    96: goto            100
        //    99: athrow         
        //   100: invokevirtual   dev/nuker/pyro/fR.0:([F)[F
        //   103: goto            107
        //   106: athrow         
        //   107: goto            111
        //   110: athrow         
        //   111: invokespecial   dev/nuker/pyro/fS.<init>:([F)V
        //   114: goto            118
        //   117: athrow         
        //   118: areturn        
        //   119: aconst_null    
        //   120: athrow         
        //   121: pop            
        //   122: goto            24
        //   125: pop            
        //   126: aconst_null    
        //   127: goto            121
        //   130: dup            
        //   131: ifnull          121
        //   134: checkcast       Ljava/lang/Throwable;
        //   137: athrow         
        //   138: dup            
        //   139: ifnull          125
        //   142: checkcast       Ljava/lang/Throwable;
        //   145: athrow         
        //   146: aconst_null    
        //   147: athrow         
        //    StackMapTable: 00 15 43 07 00 1B 04 FF 00 0B 00 00 00 01 07 00 1B FF 00 03 00 05 07 00 03 02 02 02 02 00 00 FF 00 0E 00 05 07 00 03 02 02 02 02 00 02 08 00 18 08 00 18 FF 00 01 00 05 07 00 03 02 02 02 02 00 03 08 00 18 08 00 18 01 FF 00 1E 00 05 07 00 03 02 02 02 02 00 02 08 00 18 08 00 18 5A 07 00 1B FF 00 00 00 05 07 00 03 02 02 02 02 00 04 08 00 18 08 00 18 07 00 03 07 00 A8 45 07 00 1B FF 00 00 00 05 07 00 03 02 02 02 02 00 03 08 00 18 08 00 18 07 00 A8 42 07 00 1B FF 00 00 00 05 07 00 03 02 02 02 02 00 03 08 00 18 08 00 18 07 00 A8 45 07 00 1B 40 07 00 24 FF 00 00 00 05 07 00 03 02 02 02 02 00 02 08 00 18 08 00 18 41 07 00 11 43 05 44 07 00 11 47 05 47 07 00 1B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     130    138    Ljava/lang/NumberFormatException;
        //  130    138    130    138    Ljava/lang/ArithmeticException;
        //  146    148    3      7      Any
        //  99     106    106    107    Any
        //  99     106    106    107    Any
        //  99     106    106    107    Ljava/lang/UnsupportedOperationException;
        //  99     106    99     100    Ljava/lang/AssertionError;
        //  99     106    99     100    Ljava/lang/IllegalStateException;
        //  110    117    117    118    Any
        //  110    117    110    111    Any
        //  110    117    117    118    Ljava/lang/ArithmeticException;
        //  111    117    117    118    Any
        //  110    117    3      7      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 68 out of bounds for length 68
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
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
    
    @NotNull
    public Color c(@NotNull final float[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          331
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            323
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            315
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             228950970
        //    32: goto            37
        //    35: ldc             763908072
        //    37: ldc             -277333298
        //    39: ixor           
        //    40: lookupswitch {
        //          -1024428762: 68
        //          -488785548: 35
        //          default: 300
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_0        
        //    71: checkcast       Ldev/nuker/pyro/fR;
        //    74: aload_1        
        //    75: iconst_0       
        //    76: faload         
        //    77: aload_1        
        //    78: iconst_1       
        //    79: faload         
        //    80: getstatic       dev/nuker/pyro/fc.0:I
        //    83: ifeq            91
        //    86: ldc             -936162553
        //    88: goto            93
        //    91: ldc             14310716
        //    93: ldc             1223650978
        //    95: ixor           
        //    96: lookupswitch {
        //          -2133056091: 296
        //          1881326134: 91
        //          default: 124
        //        }
        //   124: aload_1        
        //   125: iconst_2       
        //   126: faload         
        //   127: aload_1        
        //   128: iconst_3       
        //   129: faload         
        //   130: goto            134
        //   133: athrow         
        //   134: invokevirtual   dev/nuker/pyro/fR.c:(FFFF)[F
        //   137: goto            141
        //   140: athrow         
        //   141: astore_2       
        //   142: new             Ljava/awt/Color;
        //   145: dup            
        //   146: aload_2        
        //   147: iconst_0       
        //   148: faload         
        //   149: aload_2        
        //   150: iconst_1       
        //   151: faload         
        //   152: getstatic       dev/nuker/pyro/fc.0:I
        //   155: ifeq            163
        //   158: ldc             1227268303
        //   160: goto            165
        //   163: ldc             -550210492
        //   165: ldc             -1671398427
        //   167: ixor           
        //   168: lookupswitch {
        //          -2070811187: 163
        //          -716776662: 304
        //          default: 196
        //        }
        //   196: aload_2        
        //   197: iconst_2       
        //   198: faload         
        //   199: getstatic       dev/nuker/pyro/fc.c:I
        //   202: ifge            210
        //   205: ldc             2081939619
        //   207: goto            212
        //   210: ldc             2140884324
        //   212: ldc             2105181902
        //   214: ixor           
        //   215: lookupswitch {
        //          -1868343715: 210
        //          23946861: 298
        //          default: 240
        //        }
        //   240: aload_1        
        //   241: iconst_3       
        //   242: faload         
        //   243: getstatic       dev/nuker/pyro/fc.1:I
        //   246: ifeq            254
        //   249: ldc             2147107599
        //   251: goto            256
        //   254: ldc             733668840
        //   256: ldc             -668800850
        //   258: ixor           
        //   259: lookupswitch {
        //          -1478972511: 302
        //          -572231611: 254
        //          default: 284
        //        }
        //   284: goto            288
        //   287: athrow         
        //   288: invokespecial   java/awt/Color.<init>:(FFFF)V
        //   291: goto            295
        //   294: athrow         
        //   295: areturn        
        //   296: aconst_null    
        //   297: athrow         
        //   298: aconst_null    
        //   299: athrow         
        //   300: aconst_null    
        //   301: athrow         
        //   302: aconst_null    
        //   303: athrow         
        //   304: aconst_null    
        //   305: athrow         
        //   306: pop            
        //   307: goto            24
        //   310: pop            
        //   311: aconst_null    
        //   312: goto            306
        //   315: dup            
        //   316: ifnull          306
        //   319: checkcast       Ljava/lang/Throwable;
        //   322: athrow         
        //   323: dup            
        //   324: ifnull          310
        //   327: checkcast       Ljava/lang/Throwable;
        //   330: athrow         
        //   331: aconst_null    
        //   332: athrow         
        //    StackMapTable: 00 25 43 07 00 1B 04 FF 00 0B 00 00 00 01 07 00 1B FD 00 03 07 00 03 07 00 A8 0A 41 01 1E FF 00 16 00 02 07 00 03 07 00 A8 00 03 07 00 03 02 02 FF 00 01 00 02 07 00 03 07 00 A8 00 04 07 00 03 02 02 01 FF 00 1E 00 02 07 00 03 07 00 A8 00 03 07 00 03 02 02 48 07 00 1B FF 00 00 00 02 07 00 03 07 00 A8 00 05 07 00 03 02 02 02 02 45 07 00 1B 40 07 00 A8 FF 00 15 00 03 07 00 03 07 00 A8 07 00 A8 00 04 08 00 8E 08 00 8E 02 02 FF 00 01 00 03 07 00 03 07 00 A8 07 00 A8 00 05 08 00 8E 08 00 8E 02 02 01 FF 00 1E 00 03 07 00 03 07 00 A8 07 00 A8 00 04 08 00 8E 08 00 8E 02 02 FF 00 0D 00 03 07 00 03 07 00 A8 07 00 A8 00 05 08 00 8E 08 00 8E 02 02 02 FF 00 01 00 03 07 00 03 07 00 A8 07 00 A8 00 06 08 00 8E 08 00 8E 02 02 02 01 FF 00 1B 00 03 07 00 03 07 00 A8 07 00 A8 00 05 08 00 8E 08 00 8E 02 02 02 FF 00 0D 00 03 07 00 03 07 00 A8 07 00 A8 00 06 08 00 8E 08 00 8E 02 02 02 02 FF 00 01 00 03 07 00 03 07 00 A8 07 00 A8 00 07 08 00 8E 08 00 8E 02 02 02 02 01 FF 00 1B 00 03 07 00 03 07 00 A8 07 00 A8 00 06 08 00 8E 08 00 8E 02 02 02 02 42 07 00 AB FF 00 00 00 03 07 00 03 07 00 A8 07 00 A8 00 06 08 00 8E 08 00 8E 02 02 02 02 45 07 00 1B 40 07 00 B6 FF 00 00 00 02 07 00 03 07 00 A8 00 03 07 00 03 02 02 FF 00 01 00 03 07 00 03 07 00 A8 07 00 A8 00 05 08 00 8E 08 00 8E 02 02 02 FA 00 01 FF 00 01 00 03 07 00 03 07 00 A8 07 00 A8 00 06 08 00 8E 08 00 8E 02 02 02 02 FF 00 01 00 03 07 00 03 07 00 A8 07 00 A8 00 04 08 00 8E 08 00 8E 02 02 FF 00 01 00 02 07 00 03 07 00 A8 00 01 07 00 1B 43 05 44 07 00 1B 47 05 47 07 00 1B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     315    323    Ljava/lang/IndexOutOfBoundsException;
        //  315    323    315    323    Any
        //  331    333    3      8      Ljava/lang/RuntimeException;
        //  133    140    140    141    Any
        //  134    140    3      8      Ljava/lang/IllegalArgumentException;
        //  133    140    133    134    Ljava/lang/ClassCastException;
        //  134    140    133    134    Any
        //  133    140    3      8      Ljava/lang/UnsupportedOperationException;
        //  287    294    294    295    Any
        //  288    294    294    295    Any
        //  288    294    294    295    Any
        //  287    294    3      8      Any
        //  288    294    287    288    Ljava/lang/ClassCastException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 117 out of bounds for length 117
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
    
    public float c(final float n, final float n2, final float n3, final float n4, final float n5) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0488:
            while (true) {
            Label_0471_Outer:
                do {
                    Label_0475: {
                        break Label_0475;
                    Label_0412_Outer:
                        while (true) {
                            try {
                                o = null;
                                if (fc.1 > 0) {
                                    continue Label_0488;
                                }
                                null;
                                Label_0160: {
                                    final float n7;
                                    final float n6 = n7 + 6.0f;
                                }
                                // iftrue(Label_0176:, fc.0 == 0)
                                // iftrue(Label_0042:, n4 != n)
                                // iftrue(Label_0456:, n10 <= 0.0f)
                                // switch([Lcom.strobel.decompiler.ast.Label;@790acdfa, n13 ^ 0x739FD0E8)
                                // iftrue(Label_0127:, fc.0 == 0)
                                // switch([Lcom.strobel.decompiler.ast.Label;@29ac469a, n14 ^ 0x375B56C7)
                                // switch([Lcom.strobel.decompiler.ast.Label;@22870e4, n9 ^ 0x10FAE271)
                                // iftrue(Label_0088:, n7 >= 0.0f)
                                // iftrue(Label_0268:, n4 != n2)
                                // iftrue(Label_0224:, fc.0 == 0)
                                // switch([Lcom.strobel.decompiler.ast.Label;@1a103b4b, n17 ^ 0x5A2AC609)
                                // iftrue(Label_0311:, fc.0 == 0)
                                // iftrue(Label_0410:, fc.1 == 0)
                                // switch([Lcom.strobel.decompiler.ast.Label;@355a50ee, n16 ^ 0x75C8D508)
                                // switch([Lcom.strobel.decompiler.ast.Label;@7e894849, n21 ^ 0x33BC520B)
                                // switch([Lcom.strobel.decompiler.ast.Label;@3fe7a82c, n8 ^ 0x434D0F04)
                                // switch([Lcom.strobel.decompiler.ast.Label;@243606f8, n12 ^ 0x664F6932)
                                // switch([Lcom.strobel.decompiler.ast.Label;@438cffb0, n11 ^ 0xB0BB9AD9)
                                // iftrue(Label_0359:, fc.0 == 0)
                                while (true) {
                                    float n10 = 0.0f;
                                    float n19 = 0.0f;
                                    float n20 = 0.0f;
                                    Label_0129: {
                                        Label_0044: {
                                        Label_0361:
                                            while (true) {
                                            Label_0090_Outer:
                                                while (true) {
                                                Label_0090:
                                                    while (true) {
                                                        Block_10: {
                                                            Label_0313: {
                                                            Label_0226:
                                                                while (true) {
                                                                    Block_7: {
                                                                    Label_0178:
                                                                        while (true) {
                                                                            Block_6: {
                                                                                break Block_6;
                                                                                Label_0311:
                                                                                int n8 = 359854774;
                                                                                break Label_0313;
                                                                                float n7;
                                                                                final float n6;
                                                                                int n9;
                                                                                int n11;
                                                                                int n12;
                                                                                int n14;
                                                                                final float n15;
                                                                                int n16;
                                                                                int n17;
                                                                                final float n18;
                                                                                Block_4_Outer:Label_0270_Outer:
                                                                                while (true) {
                                                                                    n8 = -1501082501;
                                                                                    break Label_0313;
                                                                                    Label_0208:
                                                                                    n7 = n6;
                                                                                    return n7 / 6.0f;
                                                                                    Label_0083: {
                                                                                    Label_0270:
                                                                                        while (true) {
                                                                                            while (true) {
                                                                                            Label_0037:
                                                                                                while (true) {
                                                                                                    break Label_0037;
                                                                                                    Label_0268:
                                                                                                    n9 = -430121103;
                                                                                                    break Label_0270;
                                                                                                    Label_0456:
                                                                                                    return n10;
                                                                                                    n11 = 1223135099;
                                                                                                    break Label_0129;
                                                                                                    n10 = n4 - n5;
                                                                                                    continue Label_0270_Outer;
                                                                                                }
                                                                                                n12 = -2102734380;
                                                                                                break Label_0044;
                                                                                                Label_0463:
                                                                                                throw null;
                                                                                                Label_0116:
                                                                                                continue Label_0471_Outer;
                                                                                            }
                                                                                            Label_0440:
                                                                                            n7 = n15 + (n - n2) / n10;
                                                                                            return n7 / 6.0f;
                                                                                            Label_0224:
                                                                                            n16 = 971293678;
                                                                                            break Label_0226;
                                                                                            Label_0068:
                                                                                            n7 = (n2 - n3) / n10;
                                                                                            break Label_0083;
                                                                                            Label_0459:
                                                                                            throw null;
                                                                                            Label_0256:
                                                                                            Label_0263: {
                                                                                                break Label_0263;
                                                                                                Label_0461:
                                                                                                throw null;
                                                                                                Label_0449:
                                                                                                n10 = n7 / 6.0f;
                                                                                                return n10;
                                                                                                Label_0213:
                                                                                                break Block_7;
                                                                                                Label_0176:
                                                                                                n14 = -295353154;
                                                                                                continue Label_0178;
                                                                                            }
                                                                                            n9 = -430121330;
                                                                                            continue Label_0270;
                                                                                        }
                                                                                    }
                                                                                    n17 = -216543862;
                                                                                    break Label_0090;
                                                                                    Label_0127:
                                                                                    n11 = -686730798;
                                                                                    break Label_0129;
                                                                                    Label_0392:
                                                                                    n7 = n18;
                                                                                    return n7 / 6.0f;
                                                                                    Label_0296:
                                                                                    n19 = 2.0f;
                                                                                    n20 = n3 - n;
                                                                                    continue Block_4_Outer;
                                                                                }
                                                                                Label_0397:
                                                                                n15 = 4.0f;
                                                                                break Block_10;
                                                                                final int n21 = 1391520987;
                                                                                break Label_0361;
                                                                            }
                                                                            int n14 = 991426961;
                                                                            continue Label_0178;
                                                                        }
                                                                    }
                                                                    int n16 = 1054941340;
                                                                    continue Label_0226;
                                                                }
                                                            }
                                                        }
                                                        final int n13 = -793146103;
                                                        continue Label_0090_Outer;
                                                        Label_0088:
                                                        int n17 = -216543859;
                                                        continue Label_0090;
                                                    }
                                                    Label_0465:
                                                    throw null;
                                                    continue Label_0412_Outer;
                                                    Label_0410:
                                                    final int n13 = 1968736802;
                                                    continue Label_0090_Outer;
                                                }
                                                Label_0359:
                                                final int n21 = -1001509587;
                                                continue Label_0361;
                                            }
                                            Label_0042:
                                            int n12 = -2102734379;
                                        }
                                        Label_0467:
                                        throw null;
                                    }
                                    Label_0344:
                                    final float n18 = n19 + n20 / n10;
                                    continue;
                                }
                                Label_0469:
                                throw null;
                            }
                            catch (StringIndexOutOfBoundsException ex) {
                                if (ex != null) {
                                    throw ex;
                                }
                                continue;
                            }
                            break;
                        }
                    }
                    continue Label_0488;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    @NotNull
    public float[] 0(@NotNull final float[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          567
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            559
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            551
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: iconst_4       
        //    27: newarray        F
        //    29: astore_2       
        //    30: aload_0        
        //    31: checkcast       Ldev/nuker/pyro/fR;
        //    34: getstatic       dev/nuker/pyro/fc.c:I
        //    37: ifge            45
        //    40: ldc             1951782772
        //    42: goto            47
        //    45: ldc             1851177732
        //    47: ldc             -1369280554
        //    49: ixor           
        //    50: lookupswitch {
        //          -633882462: 530
        //          -423865057: 45
        //          default: 76
        //        }
        //    76: aload_1        
        //    77: iconst_0       
        //    78: faload         
        //    79: aload_1        
        //    80: iconst_1       
        //    81: faload         
        //    82: aload_1        
        //    83: iconst_2       
        //    84: faload         
        //    85: goto            89
        //    88: athrow         
        //    89: invokevirtual   dev/nuker/pyro/fR.c:(FFF)F
        //    92: goto            96
        //    95: athrow         
        //    96: fstore_3       
        //    97: aload_0        
        //    98: checkcast       Ldev/nuker/pyro/fR;
        //   101: getstatic       dev/nuker/pyro/fc.1:I
        //   104: ifeq            112
        //   107: ldc             -252265429
        //   109: goto            114
        //   112: ldc             -1357624998
        //   114: ldc             1056218775
        //   116: ixor           
        //   117: lookupswitch {
        //          -959243882: 112
        //          -838720836: 538
        //          default: 144
        //        }
        //   144: aload_1        
        //   145: iconst_0       
        //   146: faload         
        //   147: getstatic       dev/nuker/pyro/fc.c:I
        //   150: ifge            158
        //   153: ldc             -1626008576
        //   155: goto            160
        //   158: ldc             -23203550
        //   160: ldc             -1924600802
        //   162: ixor           
        //   163: lookupswitch {
        //          308148254: 158
        //          1943346492: 188
        //          default: 526
        //        }
        //   188: aload_1        
        //   189: iconst_1       
        //   190: faload         
        //   191: aload_1        
        //   192: iconst_2       
        //   193: faload         
        //   194: goto            198
        //   197: athrow         
        //   198: invokevirtual   dev/nuker/pyro/fR.0:(FFF)F
        //   201: goto            205
        //   204: athrow         
        //   205: fstore          4
        //   207: getstatic       dev/nuker/pyro/fc.1:I
        //   210: ifeq            218
        //   213: ldc             -1907104187
        //   215: goto            220
        //   218: ldc             2132446795
        //   220: ldc             -1588125711
        //   222: ixor           
        //   223: lookupswitch {
        //          -565341766: 248
        //          788855220: 218
        //          default: 540
        //        }
        //   248: fload_3        
        //   249: fload           4
        //   251: fsub           
        //   252: fstore          5
        //   254: fload           5
        //   256: fconst_0       
        //   257: fcmpl          
        //   258: ifle            310
        //   261: getstatic       dev/nuker/pyro/fc.c:I
        //   264: ifge            272
        //   267: ldc             -1939992333
        //   269: goto            274
        //   272: ldc             -779002631
        //   274: ldc             -1170007577
        //   276: ixor           
        //   277: lookupswitch {
        //          -1793226599: 272
        //          907872532: 528
        //          default: 304
        //        }
        //   304: fload           5
        //   306: fload_3        
        //   307: fdiv           
        //   308: fstore          5
        //   310: aload_2        
        //   311: iconst_0       
        //   312: aload_0        
        //   313: checkcast       Ldev/nuker/pyro/fR;
        //   316: aload_1        
        //   317: iconst_0       
        //   318: faload         
        //   319: getstatic       dev/nuker/pyro/fc.0:I
        //   322: ifeq            330
        //   325: ldc             425053536
        //   327: goto            332
        //   330: ldc             -355346575
        //   332: ldc             -1686499953
        //   334: ixor           
        //   335: lookupswitch {
        //          -2110799633: 330
        //          1907088126: 360
        //          default: 534
        //        }
        //   360: aload_1        
        //   361: iconst_1       
        //   362: faload         
        //   363: getstatic       dev/nuker/pyro/fc.1:I
        //   366: ifeq            374
        //   369: ldc             -1478364411
        //   371: goto            376
        //   374: ldc             2024337341
        //   376: ldc             -1393476368
        //   378: ixor           
        //   379: lookupswitch {
        //          -732310707: 404
        //          185651189: 374
        //          default: 524
        //        }
        //   404: aload_1        
        //   405: iconst_2       
        //   406: faload         
        //   407: fload_3        
        //   408: fload           4
        //   410: goto            414
        //   413: athrow         
        //   414: invokevirtual   dev/nuker/pyro/fR.c:(FFFFF)F
        //   417: goto            421
        //   420: athrow         
        //   421: fastore        
        //   422: getstatic       dev/nuker/pyro/fc.0:I
        //   425: ifeq            433
        //   428: ldc             -687723110
        //   430: goto            435
        //   433: ldc             -1602832114
        //   435: ldc             -862519797
        //   437: ixor           
        //   438: lookupswitch {
        //          -340044163: 433
        //          462738321: 536
        //          default: 464
        //        }
        //   464: aload_2        
        //   465: iconst_1       
        //   466: fload           5
        //   468: fastore        
        //   469: aload_2        
        //   470: iconst_2       
        //   471: fload_3        
        //   472: fastore        
        //   473: getstatic       dev/nuker/pyro/fc.1:I
        //   476: ifeq            484
        //   479: ldc             -606225134
        //   481: goto            486
        //   484: ldc             -1999942073
        //   486: ldc             -292810632
        //   488: ixor           
        //   489: lookupswitch {
        //          894545258: 484
        //          1715953215: 516
        //          default: 532
        //        }
        //   516: aload_2        
        //   517: iconst_3       
        //   518: aload_1        
        //   519: iconst_3       
        //   520: faload         
        //   521: fastore        
        //   522: aload_2        
        //   523: areturn        
        //   524: aconst_null    
        //   525: athrow         
        //   526: aconst_null    
        //   527: athrow         
        //   528: aconst_null    
        //   529: athrow         
        //   530: aconst_null    
        //   531: athrow         
        //   532: aconst_null    
        //   533: athrow         
        //   534: aconst_null    
        //   535: athrow         
        //   536: aconst_null    
        //   537: athrow         
        //   538: aconst_null    
        //   539: athrow         
        //   540: aconst_null    
        //   541: athrow         
        //   542: pop            
        //   543: goto            24
        //   546: pop            
        //   547: aconst_null    
        //   548: goto            542
        //   551: dup            
        //   552: ifnull          542
        //   555: checkcast       Ljava/lang/Throwable;
        //   558: athrow         
        //   559: dup            
        //   560: ifnull          546
        //   563: checkcast       Ljava/lang/Throwable;
        //   566: athrow         
        //   567: aconst_null    
        //   568: athrow         
        //    StackMapTable: 00 3A FF 00 03 00 03 07 00 03 07 00 A8 07 00 A8 00 01 07 00 1B FA 00 04 FF 00 0B 00 00 00 01 07 00 1B FD 00 03 07 00 03 07 00 A8 FF 00 14 00 03 07 00 03 07 00 A8 07 00 A8 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 00 A8 07 00 A8 00 02 07 00 03 01 5C 07 00 03 4B 07 00 1B FF 00 00 00 03 07 00 03 07 00 A8 07 00 A8 00 04 07 00 03 02 02 02 45 07 00 1B 40 02 FF 00 0F 00 04 07 00 03 07 00 A8 07 00 A8 02 00 01 07 00 03 FF 00 01 00 04 07 00 03 07 00 A8 07 00 A8 02 00 02 07 00 03 01 5D 07 00 03 FF 00 0D 00 04 07 00 03 07 00 A8 07 00 A8 02 00 02 07 00 03 02 FF 00 01 00 04 07 00 03 07 00 A8 07 00 A8 02 00 03 07 00 03 02 01 FF 00 1B 00 04 07 00 03 07 00 A8 07 00 A8 02 00 02 07 00 03 02 48 07 00 1B FF 00 00 00 04 07 00 03 07 00 A8 07 00 A8 02 00 04 07 00 03 02 02 02 45 07 00 1B 40 02 FC 00 0C 02 41 01 1B FC 00 17 02 41 01 1D 05 FF 00 13 00 06 07 00 03 07 00 A8 07 00 A8 02 02 02 00 04 07 00 A8 01 07 00 03 02 FF 00 01 00 06 07 00 03 07 00 A8 07 00 A8 02 02 02 00 05 07 00 A8 01 07 00 03 02 01 FF 00 1B 00 06 07 00 03 07 00 A8 07 00 A8 02 02 02 00 04 07 00 A8 01 07 00 03 02 FF 00 0D 00 06 07 00 03 07 00 A8 07 00 A8 02 02 02 00 05 07 00 A8 01 07 00 03 02 02 FF 00 01 00 06 07 00 03 07 00 A8 07 00 A8 02 02 02 00 06 07 00 A8 01 07 00 03 02 02 01 FF 00 1B 00 06 07 00 03 07 00 A8 07 00 A8 02 02 02 00 05 07 00 A8 01 07 00 03 02 02 48 07 00 1B FF 00 00 00 06 07 00 03 07 00 A8 07 00 A8 02 02 02 00 08 07 00 A8 01 07 00 03 02 02 02 02 02 45 07 00 1B FF 00 00 00 06 07 00 03 07 00 A8 07 00 A8 02 02 02 00 03 07 00 A8 01 02 0B 41 01 1C 13 41 01 1D FF 00 07 00 06 07 00 03 07 00 A8 07 00 A8 02 02 02 00 05 07 00 A8 01 07 00 03 02 02 FF 00 01 00 04 07 00 03 07 00 A8 07 00 A8 02 00 02 07 00 03 02 FD 00 01 02 02 FF 00 01 00 03 07 00 03 07 00 A8 07 00 A8 00 01 07 00 03 FE 00 01 02 02 02 FF 00 01 00 06 07 00 03 07 00 A8 07 00 A8 02 02 02 00 04 07 00 A8 01 07 00 03 02 01 FF 00 01 00 04 07 00 03 07 00 A8 07 00 A8 02 00 01 07 00 03 FC 00 01 02 FF 00 01 00 02 07 00 03 07 00 A8 00 01 07 00 1B 43 05 44 07 00 1B 47 05 FF 00 07 00 03 07 00 03 07 00 A8 07 00 A8 00 01 07 00 1B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  8      20     551    559    Ljava/lang/ClassCastException;
        //  551    559    551    559    Any
        //  567    569    3      8      Any
        //  88     95     95     96     Any
        //  88     95     3      8      Any
        //  89     95     3      8      Any
        //  89     95     88     89     Any
        //  89     95     3      8      Any
        //  197    204    204    205    Any
        //  197    204    3      8      Any
        //  197    204    197    198    Any
        //  197    204    204    205    Any
        //  198    204    197    198    Any
        //  413    420    420    421    Any
        //  413    420    413    414    Ljava/lang/NegativeArraySizeException;
        //  414    420    3      8      Any
        //  414    420    3      8      Any
        //  413    420    413    414    Any
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
    
    @NotNull
    public float[] c(final int n) {
        return fbS.5T(this, 404489786, n);
    }
    
    @NotNull
    public float[] c(final float n, final float n2, final float n3, final float n4) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_1200:
            while (true) {
                float[] array2;
                float[] array;
                int n5;
                float n6;
                float n7;
                float n8;
                int n9;
                int n10;
                int n11;
                int n12;
                int n13;
                int n14;
                float[] array3;
                int n15;
                float n16;
                float n17;
                float n19;
                float n18;
                int n20;
                int n21;
                int n22;
                float[] array4;
                int n23;
                float n24;
                float n25;
                float n26;
                float[] array5;
                int n27;
                int n28;
                int n29;
                float[] array6;
                int n30;
                float n31;
                float n32;
                int n33;
                float[] array7;
                int n34;
                int n35;
                int n36;
                int n37;
                int n38;
                float[] array8;
                int n39;
                float n40;
                float n41;
                int n42;
                float[] array9;
                int n43;
                float[] array10;
                int n44;
                float[] array11;
                int n45;
                float n46;
                float n47;
                int n48;
                int n49;
                int n50;
                float[] array12;
                int n51;
                float n52;
                float n53;
                float[] array13;
                int n54;
                int n55;
                Label_0653_Outer:Label_0920_Outer:Label_0032_Outer:Label_0817_Outer:
                do {
                    Label_1187: {
                        break Label_1187;
                        try {
                            o = null;
                            if (fc.1 <= 0) {
                                null;
                                goto Label_1192;
                            }
                            continue Label_1200;
                            Label_1165: {
                                throw null;
                            }
                            Label_0336:
                            array = array2;
                            n5 = 1;
                            n6 = array[n5];
                            n7 = 1.0f;
                            // iftrue(Label_0354:, fc.1 == 0)
                            // iftrue(Label_0698:, fc.c >= 0)
                            // switch([Lcom.strobel.decompiler.ast.Label;@4c14565f, n11 ^ 0x5BF5269C)
                            // switch([Lcom.strobel.decompiler.ast.Label;@48511a84, n14 ^ 0x45788F32)
                            // iftrue(Label_0594:, fc.1 == 0)
                            // iftrue(Label_0206:, fc.1 == 0)
                            // iftrue(Label_0093:, fc.0 == 0)
                            // switch([Lcom.strobel.decompiler.ast.Label;@ce1408d, n13 ^ 0xE7FD5FA0)
                            // iftrue(Label_0482:, fc.1 == 0)
                            // iftrue(Label_0917:, fc.0 == 0)
                            // iftrue(Label_0861:, fc.c >= 0)
                            // switch([Lcom.strobel.decompiler.ast.Label;@1a4fa833, n9 ^ 0x2C4B9CBC)
                            // switch([Lcom.strobel.decompiler.ast.Label;@7407b38b, n36 ^ 0x6935DD4C)
                            // switch([Lcom.strobel.decompiler.ast.Label;@344202b5, n22 ^ 0xD3F46297)
                            // switch([Lcom.strobel.decompiler.ast.Label;@3221d998, n21 ^ 0xBFAAC79D)
                            // iftrue(Label_1099:, fc.c >= 0)
                            // iftrue(Label_0970:, fc.0 == 0)
                            // switch([Lcom.strobel.decompiler.ast.Label;@55c8e1df, n42 ^ 0x2E939A3B)
                            // switch([Lcom.strobel.decompiler.ast.Label;@1c1a8b06, n38 ^ 0xF6056E1E)
                            // iftrue(Label_1048:, fc.1 == 0)
                            // iftrue(Label_0409:, fc.0 == 0)
                            // switch([Lcom.strobel.decompiler.ast.Label;@38e9659a, n33 ^ 0xB3EAC6C7)
                            // switch([Lcom.strobel.decompiler.ast.Label;@4389606, n29 ^ 0xB4884954)
                            // iftrue(Label_0760:, fc.1 == 0)
                            // switch([Lcom.strobel.decompiler.ast.Label;@166c4947, n49)
                            // switch([Lcom.strobel.decompiler.ast.Label;@5e66a237, n10 ^ 0x8A49C6B0)
                            // switch([Lcom.strobel.decompiler.ast.Label;@2dd0c9d4, n28 ^ 0xCCA85A39)
                            // switch([Lcom.strobel.decompiler.ast.Label;@6d98f2ce, n12 ^ 0x9EE5481F)
                            // iftrue(Label_0262:, fc.0 == 0)
                            // iftrue(Label_0650:, fc.0 == 0)
                            // iftrue(Label_0029:, fc.1 == 0)
                            // switch([Lcom.strobel.decompiler.ast.Label;@194aa84b, n35 ^ 0xBB170B71)
                            // iftrue(Label_0814:, fc.1 == 0)
                            // switch([Lcom.strobel.decompiler.ast.Label;@72d6d64f, n50 ^ 0xDD820351)
                            // iftrue(Label_0152:, n >= 1.0f)
                            // switch([Lcom.strobel.decompiler.ast.Label;@59632fa8, n55 ^ 0xA78F7C8D)
                            // iftrue(Label_0541:, fc.c >= 0)
                            // iftrue(Label_1138:, n2 <= 0.0f)
                            // switch([Lcom.strobel.decompiler.ast.Label;@73c7a8c8, n37 ^ 0x1CE6809D)
                            Label_0544: {
                            Label_0817:
                                while (true) {
                                    Block_17: {
                                    Label_0032:
                                        while (true) {
                                            Block_4: {
                                                Label_0485: {
                                                    while (true) {
                                                        while (true) {
                                                            Label_1138: {
                                                                Label_0920:Label_0189_Outer:Label_1102_Outer:
                                                                while (true) {
                                                                    Block_19: {
                                                                    Label_0864:
                                                                        while (true) {
                                                                            Block_18: {
                                                                            Label_1102:
                                                                                while (true) {
                                                                                Label_0763:
                                                                                    while (true) {
                                                                                        Block_16: {
                                                                                        Label_0189:
                                                                                            while (true) {
                                                                                            Label_0653:
                                                                                                while (true) {
                                                                                                Block_14_Outer:
                                                                                                    while (true) {
                                                                                                    Label_0597:
                                                                                                        while (true) {
                                                                                                            while (true) {
                                                                                                                while (true) {
                                                                                                                Block_20_Outer:
                                                                                                                    while (true) {
                                                                                                                        Label_0973: {
                                                                                                                            Label_0357: {
                                                                                                                                Label_0701: {
                                                                                                                                    Label_0412: {
                                                                                                                                        while (true) {
                                                                                                                                        Label_1051_Outer:
                                                                                                                                            while (true) {
                                                                                                                                            Label_1051:
                                                                                                                                                while (true) {
                                                                                                                                                    while (true) {
                                                                                                                                                        while (true) {
                                                                                                                                                            Label_0209: {
                                                                                                                                                                Block_13: {
                                                                                                                                                                    Block_11: {
                                                                                                                                                                        while (true) {
                                                                                                                                                                            Block_5: {
                                                                                                                                                                                Label_0155: {
                                                                                                                                                                                    Block_15: {
                                                                                                                                                                                        Block_9: {
                                                                                                                                                                                            break Block_9;
                                                                                                                                                                                            Label_0684:
                                                                                                                                                                                            n8 = 1.0f;
                                                                                                                                                                                            break Block_15;
                                                                                                                                                                                            n9 = -1011471059;
                                                                                                                                                                                            break Label_0155;
                                                                                                                                                                                            n10 = -1751588631;
                                                                                                                                                                                            break Label_0653;
                                                                                                                                                                                            Label_1173:
                                                                                                                                                                                            throw null;
                                                                                                                                                                                            n12 = 1874283985;
                                                                                                                                                                                            break Label_0973;
                                                                                                                                                                                            Label_0917:
                                                                                                                                                                                            n13 = 1184055838;
                                                                                                                                                                                            break Label_0920;
                                                                                                                                                                                            Label_1159:
                                                                                                                                                                                            throw null;
                                                                                                                                                                                            Label_1161:
                                                                                                                                                                                            throw null;
                                                                                                                                                                                            Label_0576:
                                                                                                                                                                                            array3 = array2;
                                                                                                                                                                                            n15 = 0;
                                                                                                                                                                                            n16 = array3[n15];
                                                                                                                                                                                            n17 = 1.0f;
                                                                                                                                                                                            break Block_13;
                                                                                                                                                                                            n18 = n19;
                                                                                                                                                                                            n20 = (int)n18;
                                                                                                                                                                                            Block_7: {
                                                                                                                                                                                                break Block_7;
                                                                                                                                                                                                Label_0152:
                                                                                                                                                                                                n9 = -1011471058;
                                                                                                                                                                                                break Label_0155;
                                                                                                                                                                                                n21 = 775298381;
                                                                                                                                                                                                break Label_1051;
                                                                                                                                                                                                Label_0064:
                                                                                                                                                                                                array2 = new float[] { n3, n3, 0.0f, 0.0f };
                                                                                                                                                                                                break Block_5;
                                                                                                                                                                                                Label_0093:
                                                                                                                                                                                                n14 = -1955949758;
                                                                                                                                                                                                continue Label_0189_Outer;
                                                                                                                                                                                            }
                                                                                                                                                                                            n22 = -548950922;
                                                                                                                                                                                            break Label_0209;
                                                                                                                                                                                            Label_1004:
                                                                                                                                                                                            array4[n23] = n24 * (n25 - n2 * (1.0f - n26));
                                                                                                                                                                                            array5 = array2;
                                                                                                                                                                                            n27 = 1;
                                                                                                                                                                                            array5[n27] *= 1.0f - n2;
                                                                                                                                                                                            break Label_1138;
                                                                                                                                                                                        }
                                                                                                                                                                                        n28 = -1465921142;
                                                                                                                                                                                        break Label_0357;
                                                                                                                                                                                        Label_0698:
                                                                                                                                                                                        n29 = -1700155062;
                                                                                                                                                                                        break Label_0701;
                                                                                                                                                                                        Label_1149:
                                                                                                                                                                                        throw null;
                                                                                                                                                                                        Label_1147:
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }
                                                                                                                                                                                    n29 = 1260777454;
                                                                                                                                                                                    break Label_0701;
                                                                                                                                                                                    Label_0896:
                                                                                                                                                                                    array6[n30] = n31 * (n32 - n2 * n26);
                                                                                                                                                                                    break Label_1138;
                                                                                                                                                                                    n33 = 2071358222;
                                                                                                                                                                                    break Label_0412;
                                                                                                                                                                                    Label_0457:
                                                                                                                                                                                    array7 = array2;
                                                                                                                                                                                    n34 = 0;
                                                                                                                                                                                    array7[n34] *= 1.0f - n2 * n26;
                                                                                                                                                                                    break Block_11;
                                                                                                                                                                                    Label_0905:
                                                                                                                                                                                    break Block_19;
                                                                                                                                                                                    Label_0848:
                                                                                                                                                                                    break Block_18;
                                                                                                                                                                                    n35 = 1642800833;
                                                                                                                                                                                    break Label_1102;
                                                                                                                                                                                    Label_1179:
                                                                                                                                                                                    throw null;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            n14 = -1819574830;
                                                                                                                                                                            continue Label_0189_Outer;
                                                                                                                                                                        }
                                                                                                                                                                        Label_0206:
                                                                                                                                                                        n22 = -49838604;
                                                                                                                                                                        break Label_0209;
                                                                                                                                                                        Label_0354:
                                                                                                                                                                        n28 = 196848013;
                                                                                                                                                                        break Label_0357;
                                                                                                                                                                    }
                                                                                                                                                                    n37 = 1608232848;
                                                                                                                                                                    break Label_0485;
                                                                                                                                                                }
                                                                                                                                                                n36 = -925262910;
                                                                                                                                                                continue Label_0597;
                                                                                                                                                                Label_1181:
                                                                                                                                                                throw null;
                                                                                                                                                                Label_0409:
                                                                                                                                                                n33 = -355039911;
                                                                                                                                                                break Label_0412;
                                                                                                                                                            }
                                                                                                                                                            Label_0482:
                                                                                                                                                            n37 = 528634302;
                                                                                                                                                            break Label_0485;
                                                                                                                                                            Label_0760:
                                                                                                                                                            n38 = -1787745848;
                                                                                                                                                            break Label_0763;
                                                                                                                                                            Label_1080:
                                                                                                                                                            array8 = array2;
                                                                                                                                                            n39 = 2;
                                                                                                                                                            n40 = array8[n39];
                                                                                                                                                            n41 = 1.0f;
                                                                                                                                                            continue Label_1102_Outer;
                                                                                                                                                        }
                                                                                                                                                        n11 = -978950062;
                                                                                                                                                        continue Block_20_Outer;
                                                                                                                                                        Label_0952:
                                                                                                                                                        array4 = array2;
                                                                                                                                                        n23 = 0;
                                                                                                                                                        n24 = array4[n23];
                                                                                                                                                        n25 = 1.0f;
                                                                                                                                                        continue Label_0920_Outer;
                                                                                                                                                    }
                                                                                                                                                    Label_0970:
                                                                                                                                                    n12 = -2059609572;
                                                                                                                                                    break Label_0973;
                                                                                                                                                    Label_1048:
                                                                                                                                                    n21 = 1050763848;
                                                                                                                                                    continue Label_1051;
                                                                                                                                                }
                                                                                                                                                Label_1177:
                                                                                                                                                throw null;
                                                                                                                                                Label_0029:
                                                                                                                                                n42 = 1898855473;
                                                                                                                                                continue Label_0032;
                                                                                                                                                Label_0444:
                                                                                                                                                array9 = array2;
                                                                                                                                                n43 = 2;
                                                                                                                                                array9[n43] *= 1.0f - n2;
                                                                                                                                                break Label_1138;
                                                                                                                                                Label_1026:
                                                                                                                                                array10 = array2;
                                                                                                                                                n44 = 1;
                                                                                                                                                array10[n44] *= 1.0f - n2;
                                                                                                                                                continue Label_1051_Outer;
                                                                                                                                            }
                                                                                                                                            Label_0388:
                                                                                                                                            array[n5] = n6 * (n7 - n2 * (1.0f - n26));
                                                                                                                                            continue Label_1102_Outer;
                                                                                                                                        }
                                                                                                                                        Label_0180:
                                                                                                                                        n19 = n * 6.0f;
                                                                                                                                        continue Label_0189;
                                                                                                                                        Label_1153:
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                Label_0742:
                                                                                                                                array11 = array2;
                                                                                                                                n45 = 0;
                                                                                                                                n46 = array11[n45];
                                                                                                                                n47 = 1.0f;
                                                                                                                                break Block_16;
                                                                                                                                n48 = -1041738209;
                                                                                                                                break Label_0544;
                                                                                                                                Label_0296:
                                                                                                                                Label_0814:
                                                                                                                                n50 = 1928365605;
                                                                                                                                break Label_0817;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        Label_1132:
                                                                                                                        array8[n39] = n40 * (n41 - n2 * n26);
                                                                                                                        break Label_1138;
                                                                                                                        Label_1151:
                                                                                                                        throw null;
                                                                                                                        Label_1169:
                                                                                                                        throw null;
                                                                                                                        Label_0732:
                                                                                                                        array12[n51] = n52 * (n53 - n2 * (n8 - n26));
                                                                                                                        break Label_1138;
                                                                                                                        Label_0262:
                                                                                                                        n11 = -792850129;
                                                                                                                        continue Block_20_Outer;
                                                                                                                    }
                                                                                                                    Label_1167:
                                                                                                                    throw null;
                                                                                                                    Label_0541:
                                                                                                                    n48 = 1922195785;
                                                                                                                    break Label_0544;
                                                                                                                    Label_0240:
                                                                                                                    n49 = n20;
                                                                                                                    n26 = n18 - n49;
                                                                                                                    continue Label_0032_Outer;
                                                                                                                }
                                                                                                                Label_0628:
                                                                                                                array3[n15] = n16 * (n17 - n2);
                                                                                                                array12 = array2;
                                                                                                                n51 = 2;
                                                                                                                n52 = array12[n51];
                                                                                                                n53 = 1.0f;
                                                                                                                continue Label_0653_Outer;
                                                                                                            }
                                                                                                            break Block_4;
                                                                                                            Label_0594:
                                                                                                            n36 = -1811143978;
                                                                                                            continue Label_0597;
                                                                                                        }
                                                                                                        Label_0792:
                                                                                                        array11[n45] = n46 * (n47 - n2);
                                                                                                        array6 = array2;
                                                                                                        n30 = 1;
                                                                                                        n31 = array6[n30];
                                                                                                        n32 = 1.0f;
                                                                                                        break Block_17;
                                                                                                        Label_1171:
                                                                                                        throw null;
                                                                                                        Label_0516:
                                                                                                        array13 = array2;
                                                                                                        n54 = 2;
                                                                                                        array13[n54] *= 1.0f - n2;
                                                                                                        break Label_1138;
                                                                                                        continue Block_14_Outer;
                                                                                                    }
                                                                                                    Label_0650:
                                                                                                    n10 = -363135188;
                                                                                                    continue Label_0653;
                                                                                                }
                                                                                                Label_0861:
                                                                                                n55 = -763536474;
                                                                                                break Label_0864;
                                                                                                Label_0188:
                                                                                                n19 = 0.0f;
                                                                                                continue Label_0189;
                                                                                            }
                                                                                        }
                                                                                        n38 = 2066105606;
                                                                                        continue Label_0763;
                                                                                    }
                                                                                    Label_1099:
                                                                                    n35 = 2038153238;
                                                                                    continue Label_1102;
                                                                                }
                                                                            }
                                                                            n55 = 430196921;
                                                                            continue Label_0864;
                                                                        }
                                                                    }
                                                                    n13 = -1177687736;
                                                                    continue Label_0920;
                                                                }
                                                            }
                                                            array2[3] = n4;
                                                            return array2;
                                                            Label_0529:
                                                            continue Label_0817_Outer;
                                                        }
                                                        Label_1163:
                                                        throw null;
                                                        Label_0128:
                                                        array2[2] = n3;
                                                        continue;
                                                    }
                                                }
                                                Label_1175:
                                                throw null;
                                            }
                                            n42 = -1988433986;
                                            continue Label_0032;
                                        }
                                    }
                                    n50 = 198444953;
                                    continue Label_0817;
                                }
                                Label_1157:
                                throw null;
                                Label_1155:
                                throw null;
                            }
                        }
                        // switch([Lcom.strobel.decompiler.ast.Label;@3f034e0b, n48 ^ 0xF7C2EEE5)
                        catch (NullPointerException ex) {}
                    }
                    continue Label_1200;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public fR() {
        while (true) {
            int n = 0;
            Label_0015: {
                if (fc.0 != 0) {
                    n = -1291805349;
                    break Label_0015;
                }
                n = -1874396425;
            }
            switch (n ^ 0xEB0C39EF) {
                case 1477223604: {
                    continue;
                }
                case 2068497176: {
                    while (true) {
                        int n2 = 0;
                        Label_0060: {
                            if (fc.0 != 0) {
                                n2 = -789233626;
                                break Label_0060;
                            }
                            n2 = -1385275727;
                        }
                        switch (n2 ^ 0x198583BE) {
                            case -915356776: {
                                continue;
                            }
                            case -1259610865: {
                                return;
                            }
                            default: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @NotNull
    public fS c() {
        return fbS.9z(this, 192715394);
    }
}
