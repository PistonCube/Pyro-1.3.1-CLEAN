// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.awt.Font;
import dev.nuker.pyro.api.FontManager$CustomFontConfig;
import dev.nuker.pyro.util.font.GameFontRenderer;

public class fy
{
    public static fy c;
    public GameFontRenderer c;
    public GameFontRenderer 0;
    public GameFontRenderer 1;
    public GameFontRenderer 2;
    public FontManager$CustomFontConfig c;
    public FontManager$CustomFontConfig 0;
    
    public FontManager$CustomFontConfig 0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: iflt            131
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            123
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: getstatic       dev/nuker/pyro/fc.1:I
        //    19: ifeq            27
        //    22: ldc             -648886338
        //    24: goto            29
        //    27: ldc             1295414175
        //    29: ldc             -310638053
        //    31: ixor           
        //    32: lookupswitch {
        //          -1605731964: 60
        //          875482533: 27
        //          default: 112
        //        }
        //    60: aload_0        
        //    61: getfield        dev/nuker/pyro/fy.2:Ldev/nuker/pyro/util/font/GameFontRenderer;
        //    64: ifnull          72
        //    67: ldc             2133776727
        //    69: goto            74
        //    72: ldc             2133776726
        //    74: ldc             1836091347
        //    76: ixor           
        //    77: tableswitch {
        //          616348936: 100
        //          616348937: 107
        //          default: 67
        //        }
        //   100: aload_0        
        //   101: getfield        dev/nuker/pyro/fy.0:Ldev/nuker/pyro/api/FontManager$CustomFontConfig;
        //   104: goto            111
        //   107: aload_0        
        //   108: getfield        dev/nuker/pyro/fy.c:Ldev/nuker/pyro/api/FontManager$CustomFontConfig;
        //   111: areturn        
        //   112: aconst_null    
        //   113: athrow         
        //   114: pop            
        //   115: goto            16
        //   118: pop            
        //   119: aconst_null    
        //   120: goto            114
        //   123: dup            
        //   124: ifnull          114
        //   127: checkcast       Ljava/lang/Throwable;
        //   130: athrow         
        //   131: dup            
        //   132: ifnull          118
        //   135: checkcast       Ljava/lang/Throwable;
        //   138: athrow         
        //    StackMapTable: 00 10 FF 00 0C 00 00 00 01 07 00 16 FC 00 03 07 00 03 0A 41 01 1E 06 04 41 01 19 06 43 07 00 26 00 41 07 00 16 43 05 44 07 00 16 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      12     123    131    Any
        //  123    131    123    131    Ljava/util/ConcurrentModificationException;
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
    
    public static Font c(final String p0, final float p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          477
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            469
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            461
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/lang/StringBuilder;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/fc.1:I
        //    31: ifeq            39
        //    34: ldc             -83618636
        //    36: goto            41
        //    39: ldc             -147995609
        //    41: ldc             -1983987010
        //    43: ixor           
        //    44: lookupswitch {
        //          1924847114: 39
        //          2123564697: 72
        //          default: 444
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokespecial   java/lang/StringBuilder.<init>:()V
        //    79: goto            83
        //    82: athrow         
        //    83: ldc             "\u10d2\u1480\ub9d9\ub1cd\ufebb\udec6\ub26b\ud5e1\udb76\uded2\u9401\u1e5f\ud28c"
        //    85: goto            89
        //    88: athrow         
        //    89: invokestatic    invokestatic   !!! ERROR
        //    92: goto            96
        //    95: athrow         
        //    96: goto            100
        //    99: athrow         
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: goto            107
        //   106: athrow         
        //   107: getstatic       dev/nuker/pyro/fc.1:I
        //   110: ifeq            118
        //   113: ldc             1313604928
        //   115: goto            120
        //   118: ldc             -1184913389
        //   120: ldc             830789017
        //   122: ixor           
        //   123: lookupswitch {
        //          1529382148: 118
        //          2143867097: 446
        //          default: 148
        //        }
        //   148: aload_0        
        //   149: goto            153
        //   152: athrow         
        //   153: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   156: goto            160
        //   159: athrow         
        //   160: goto            164
        //   163: athrow         
        //   164: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   167: goto            171
        //   170: athrow         
        //   171: goto            175
        //   174: athrow         
        //   175: invokestatic    dev/nuker/pyro/Pyro.getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;
        //   178: goto            182
        //   181: athrow         
        //   182: astore_2       
        //   183: iconst_0       
        //   184: aload_2        
        //   185: goto            189
        //   188: athrow         
        //   189: invokestatic    java/awt/Font.createFont:(ILjava/io/InputStream;)Ljava/awt/Font;
        //   192: goto            196
        //   195: athrow         
        //   196: astore_3       
        //   197: getstatic       dev/nuker/pyro/fc.c:I
        //   200: ifge            208
        //   203: ldc             -1752170747
        //   205: goto            210
        //   208: ldc             85013903
        //   210: ldc             -1189382290
        //   212: ixor           
        //   213: lookupswitch {
        //          286619366: 208
        //          781486187: 440
        //          default: 240
        //        }
        //   240: aload_3        
        //   241: iconst_0       
        //   242: getstatic       dev/nuker/pyro/fc.1:I
        //   245: ifeq            253
        //   248: ldc             -482986799
        //   250: goto            255
        //   253: ldc             144338462
        //   255: ldc             -1178857640
        //   257: ixor           
        //   258: lookupswitch {
        //          -1792047673: 253
        //          1519008649: 442
        //          default: 284
        //        }
        //   284: fload_1        
        //   285: goto            289
        //   288: athrow         
        //   289: invokevirtual   java/awt/Font.deriveFont:(IF)Ljava/awt/Font;
        //   292: goto            296
        //   295: athrow         
        //   296: astore_3       
        //   297: aload_2        
        //   298: goto            302
        //   301: athrow         
        //   302: invokevirtual   java/io/InputStream.close:()V
        //   305: goto            309
        //   308: athrow         
        //   309: aload_3        
        //   310: areturn        
        //   311: astore_2       
        //   312: aload_2        
        //   313: goto            317
        //   316: athrow         
        //   317: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   320: goto            324
        //   323: athrow         
        //   324: new             Ljava/awt/Font;
        //   327: dup            
        //   328: ldc             "\u10d7\u1496\ub9cc\ub1c9\ufeba\uded9\ub230"
        //   330: getstatic       dev/nuker/pyro/fc.0:I
        //   333: ifeq            341
        //   336: ldc             993844200
        //   338: goto            343
        //   341: ldc             -608212399
        //   343: ldc             -87513512
        //   345: ixor           
        //   346: lookupswitch {
        //          -1040941648: 341
        //          561499145: 372
        //          default: 448
        //        }
        //   372: goto            376
        //   375: athrow         
        //   376: invokestatic    invokestatic   !!! ERROR
        //   379: goto            383
        //   382: athrow         
        //   383: iconst_0       
        //   384: fload_1        
        //   385: f2i            
        //   386: getstatic       dev/nuker/pyro/fc.0:I
        //   389: ifeq            397
        //   392: ldc             -443593821
        //   394: goto            399
        //   397: ldc             2079021792
        //   399: ldc             1880214030
        //   401: ixor           
        //   402: lookupswitch {
        //          -1784774227: 450
        //          39847146: 397
        //          default: 428
        //        }
        //   428: goto            432
        //   431: athrow         
        //   432: invokespecial   java/awt/Font.<init>:(Ljava/lang/String;II)V
        //   435: goto            439
        //   438: athrow         
        //   439: areturn        
        //   440: aconst_null    
        //   441: athrow         
        //   442: aconst_null    
        //   443: athrow         
        //   444: aconst_null    
        //   445: athrow         
        //   446: aconst_null    
        //   447: athrow         
        //   448: aconst_null    
        //   449: athrow         
        //   450: aconst_null    
        //   451: athrow         
        //   452: pop            
        //   453: goto            24
        //   456: pop            
        //   457: aconst_null    
        //   458: goto            452
        //   461: dup            
        //   462: ifnull          452
        //   465: checkcast       Ljava/lang/Throwable;
        //   468: athrow         
        //   469: dup            
        //   470: ifnull          456
        //   473: checkcast       Ljava/lang/Throwable;
        //   476: athrow         
        //   477: aconst_null    
        //   478: athrow         
        //    StackMapTable: 00 52 43 07 00 16 04 FF 00 0B 00 00 00 01 07 00 16 FD 00 03 07 00 89 02 FF 00 0E 00 02 07 00 89 02 00 02 08 00 18 08 00 18 FF 00 01 00 02 07 00 89 02 00 03 08 00 18 08 00 18 01 FF 00 1E 00 02 07 00 89 02 00 02 08 00 18 08 00 18 42 07 00 16 FF 00 00 00 02 07 00 89 02 00 02 08 00 18 08 00 18 45 07 00 16 40 07 00 45 44 07 00 16 FF 00 00 00 02 07 00 89 02 00 02 07 00 45 07 00 89 45 07 00 16 FF 00 00 00 02 07 00 89 02 00 02 07 00 45 07 00 89 42 07 00 16 FF 00 00 00 02 07 00 89 02 00 02 07 00 45 07 00 89 45 07 00 16 40 07 00 45 4A 07 00 45 FF 00 01 00 02 07 00 89 02 00 02 07 00 45 01 5B 07 00 45 43 07 00 16 FF 00 00 00 02 07 00 89 02 00 02 07 00 45 07 00 89 45 07 00 16 40 07 00 45 42 07 00 16 40 07 00 45 45 07 00 16 40 07 00 89 42 07 00 16 40 07 00 89 45 07 00 16 40 07 00 76 FF 00 05 00 00 00 01 07 00 16 FF 00 00 00 03 07 00 89 02 07 00 76 00 02 01 07 00 76 45 07 00 16 40 07 00 66 FC 00 0B 07 00 66 41 01 1D FF 00 0C 00 04 07 00 89 02 07 00 76 07 00 66 00 02 07 00 66 01 FF 00 01 00 04 07 00 89 02 07 00 76 07 00 66 00 03 07 00 66 01 01 FF 00 1C 00 04 07 00 89 02 07 00 76 07 00 66 00 02 07 00 66 01 43 07 00 16 FF 00 00 00 04 07 00 89 02 07 00 76 07 00 66 00 03 07 00 66 01 02 45 07 00 16 40 07 00 66 44 07 00 35 40 07 00 76 45 07 00 16 00 FF 00 01 00 02 07 00 89 02 00 01 07 00 29 FF 00 04 00 03 07 00 89 02 07 00 29 00 01 07 00 16 40 07 00 29 45 07 00 16 00 FF 00 10 00 03 07 00 89 02 07 00 29 00 03 08 01 44 08 01 44 07 00 89 FF 00 01 00 03 07 00 89 02 07 00 29 00 04 08 01 44 08 01 44 07 00 89 01 FF 00 1C 00 03 07 00 89 02 07 00 29 00 03 08 01 44 08 01 44 07 00 89 42 07 00 2F FF 00 00 00 03 07 00 89 02 07 00 29 00 03 08 01 44 08 01 44 07 00 89 45 07 00 16 FF 00 00 00 03 07 00 89 02 07 00 29 00 03 08 01 44 08 01 44 07 00 89 FF 00 0D 00 03 07 00 89 02 07 00 29 00 05 08 01 44 08 01 44 07 00 89 01 01 FF 00 01 00 03 07 00 89 02 07 00 29 00 06 08 01 44 08 01 44 07 00 89 01 01 01 FF 00 1C 00 03 07 00 89 02 07 00 29 00 05 08 01 44 08 01 44 07 00 89 01 01 42 07 00 39 FF 00 00 00 03 07 00 89 02 07 00 29 00 05 08 01 44 08 01 44 07 00 89 01 01 45 07 00 16 40 07 00 66 FF 00 00 00 04 07 00 89 02 07 00 76 07 00 66 00 00 FF 00 01 00 04 07 00 89 02 07 00 76 07 00 66 00 02 07 00 66 01 FF 00 01 00 02 07 00 89 02 00 02 08 00 18 08 00 18 41 07 00 45 FF 00 01 00 03 07 00 89 02 07 00 29 00 03 08 01 44 08 01 44 07 00 89 FF 00 01 00 03 07 00 89 02 07 00 29 00 05 08 01 44 08 01 44 07 00 89 01 01 FF 00 01 00 02 07 00 89 02 00 01 07 00 16 43 05 44 07 00 16 47 05 47 07 00 16
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  24     188    311    452    Ljava/lang/Exception;
        //  189    310    311    452    Ljava/lang/Exception;
        //  8      20     461    469    Any
        //  461    469    461    469    Ljava/lang/RuntimeException;
        //  477    479    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  75     82     82     83     Any
        //  76     82     75     76     Ljava/lang/IllegalArgumentException;
        //  75     82     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  75     82     82     83     Ljava/lang/IllegalStateException;
        //  76     82     75     76     Any
        //  88     95     95     96     Any
        //  89     95     3      8      Ljava/lang/NumberFormatException;
        //  89     95     3      8      Any
        //  88     95     88     89     Any
        //  89     95     3      8      Ljava/lang/RuntimeException;
        //  99     106    106    107    Any
        //  100    106    3      8      Ljava/lang/ClassCastException;
        //  100    106    3      8      Any
        //  100    106    99     100    Any
        //  100    106    3      8      Any
        //  152    159    159    160    Any
        //  153    159    152    153    Ljava/lang/NumberFormatException;
        //  153    159    152    153    Any
        //  153    159    152    153    Ljava/lang/IndexOutOfBoundsException;
        //  153    159    152    153    Any
        //  163    170    170    171    Any
        //  164    170    3      8      Ljava/lang/UnsupportedOperationException;
        //  164    170    170    171    Ljava/util/ConcurrentModificationException;
        //  163    170    3      8      Ljava/lang/ClassCastException;
        //  164    170    163    164    Any
        //  174    181    181    182    Any
        //  174    181    174    175    Any
        //  175    181    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  175    181    181    182    Any
        //  175    181    174    175    Any
        //  189    195    195    196    Any
        //  189    195    3      8      Ljava/lang/ClassCastException;
        //  189    195    3      8      Any
        //  189    195    195    196    Ljava/lang/RuntimeException;
        //  189    195    3      8      Ljava/lang/UnsupportedOperationException;
        //  288    295    295    296    Any
        //  288    295    288    289    Ljava/lang/AssertionError;
        //  288    295    288    289    Ljava/lang/NumberFormatException;
        //  289    295    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  288    295    295    296    Ljava/lang/IllegalArgumentException;
        //  301    308    308    309    Any
        //  301    308    301    302    Ljava/lang/NumberFormatException;
        //  302    308    308    309    Ljava/lang/EnumConstantNotPresentException;
        //  302    308    3      8      Ljava/lang/ClassCastException;
        //  302    308    308    309    Any
        //  316    323    323    324    Any
        //  317    323    323    324    Ljava/lang/ArithmeticException;
        //  317    323    323    324    Ljava/lang/UnsupportedOperationException;
        //  316    323    323    324    Ljava/lang/ArithmeticException;
        //  316    323    316    317    Any
        //  375    382    382    383    Any
        //  375    382    3      8      Any
        //  376    382    382    383    Any
        //  376    382    382    383    Any
        //  376    382    375    376    Ljava/lang/IllegalArgumentException;
        //  431    438    438    439    Any
        //  431    438    3      8      Any
        //  431    438    431    432    Ljava/lang/UnsupportedOperationException;
        //  432    438    3      8      Any
        //  432    438    438    439    Ljava/lang/ArrayIndexOutOfBoundsException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:776)
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
    
    public GameFontRenderer c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            52
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            44
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getfield        dev/nuker/pyro/fy.2:Ldev/nuker/pyro/util/font/GameFontRenderer;
        //    20: ifnull          30
        //    23: aload_0        
        //    24: getfield        dev/nuker/pyro/fy.2:Ldev/nuker/pyro/util/font/GameFontRenderer;
        //    27: goto            34
        //    30: aload_0        
        //    31: getfield        dev/nuker/pyro/fy.c:Ldev/nuker/pyro/util/font/GameFontRenderer;
        //    34: areturn        
        //    35: pop            
        //    36: goto            16
        //    39: pop            
        //    40: aconst_null    
        //    41: goto            35
        //    44: dup            
        //    45: ifnull          35
        //    48: checkcast       Ljava/lang/Throwable;
        //    51: athrow         
        //    52: dup            
        //    53: ifnull          39
        //    56: checkcast       Ljava/lang/Throwable;
        //    59: athrow         
        //    StackMapTable: 00 08 FF 00 0C 00 00 00 01 07 00 16 FC 00 03 07 00 03 0D 43 07 00 8E 40 07 00 16 43 05 44 07 00 16 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      12     44     52     Any
        //  44     52     44     52     Ljava/lang/StringIndexOutOfBoundsException;
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
    
    static {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.c < 0) {
                    n = -727895361;
                    break Label_0017;
                }
                n = -1256468015;
            }
            switch (n ^ 0xF91C4635) {
                case 763458698: {
                    continue;
                }
                case 1275566052: {
                    fy.c = new fy();
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void 3() {
        fbS.dK(this, 766119406);
    }
    
    public void 2() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1325
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1317
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1309
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: new             Ldev/nuker/pyro/api/FontManager$CustomFontConfig;
        //    28: dup            
        //    29: goto            33
        //    32: athrow         
        //    33: invokespecial   dev/nuker/pyro/api/FontManager$CustomFontConfig.<init>:()V
        //    36: goto            40
        //    39: athrow         
        //    40: getstatic       dev/nuker/pyro/fc.c:I
        //    43: ifge            51
        //    46: ldc             -600443018
        //    48: goto            53
        //    51: ldc             -1901858425
        //    53: ldc             -2043109904
        //    55: ixor           
        //    56: lookupswitch {
        //          -1509657982: 51
        //          1510828678: 1274
        //          default: 84
        //        }
        //    84: putfield        dev/nuker/pyro/fy.c:Ldev/nuker/pyro/api/FontManager$CustomFontConfig;
        //    87: new             Ljava/io/File;
        //    90: dup            
        //    91: ldc             "\u10c3\u148a\ub9d8\ub196\ufebf\uded3\ub22b\ud5e9\udb3c\udebc\u9411\u1e49\ud2c5\uc7e6\ub611\uba42\u57b0\u446c\ubf77\uf72c\u182e\uc235"
        //    93: goto            97
        //    96: athrow         
        //    97: invokestatic    invokestatic   !!! ERROR
        //   100: goto            104
        //   103: athrow         
        //   104: goto            108
        //   107: athrow         
        //   108: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   111: goto            115
        //   114: athrow         
        //   115: astore_1       
        //   116: aload_1        
        //   117: goto            121
        //   120: athrow         
        //   121: invokevirtual   java/io/File.exists:()Z
        //   124: goto            128
        //   127: athrow         
        //   128: ifeq            434
        //   131: new             Ljava/io/FileReader;
        //   134: dup            
        //   135: aload_1        
        //   136: getstatic       dev/nuker/pyro/fc.1:I
        //   139: ifeq            147
        //   142: ldc             234885809
        //   144: goto            149
        //   147: ldc             1088754987
        //   149: ldc             -488051426
        //   151: ixor           
        //   152: lookupswitch {
        //          -1576142795: 180
        //          -320274513: 147
        //          default: 1266
        //        }
        //   180: goto            184
        //   183: athrow         
        //   184: invokespecial   java/io/FileReader.<init>:(Ljava/io/File;)V
        //   187: goto            191
        //   190: athrow         
        //   191: getstatic       dev/nuker/pyro/fc.1:I
        //   194: ifeq            202
        //   197: ldc             77017093
        //   199: goto            204
        //   202: ldc             -620158147
        //   204: ldc             -1036784174
        //   206: ixor           
        //   207: lookupswitch {
        //          -1682661684: 202
        //          -962273833: 1290
        //          default: 232
        //        }
        //   232: astore_2       
        //   233: aload_0        
        //   234: getstatic       dev/nuker/pyro/Pyro.GSON:Lcom/google/gson/Gson;
        //   237: getstatic       dev/nuker/pyro/fc.c:I
        //   240: ifge            248
        //   243: ldc             1352489902
        //   245: goto            250
        //   248: ldc             -684312094
        //   250: ldc             -1281560799
        //   252: ixor           
        //   253: lookupswitch {
        //          -766456797: 248
        //          -486427505: 1268
        //          default: 280
        //        }
        //   280: aload_2        
        //   281: ldc             Ldev/nuker/pyro/api/FontManager$CustomFontConfig;.class
        //   283: goto            287
        //   286: athrow         
        //   287: invokevirtual   com/google/gson/Gson.fromJson:(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;
        //   290: goto            294
        //   293: athrow         
        //   294: checkcast       Ldev/nuker/pyro/api/FontManager$CustomFontConfig;
        //   297: putfield        dev/nuker/pyro/fy.c:Ldev/nuker/pyro/api/FontManager$CustomFontConfig;
        //   300: getstatic       dev/nuker/pyro/fc.c:I
        //   303: ifge            311
        //   306: ldc             1875176171
        //   308: goto            313
        //   311: ldc             790290574
        //   313: ldc             -275001809
        //   315: ixor           
        //   316: lookupswitch {
        //          -2141248316: 311
        //          -1065275743: 344
        //          default: 1278
        //        }
        //   344: aload_2        
        //   345: goto            349
        //   348: athrow         
        //   349: invokevirtual   java/io/FileReader.close:()V
        //   352: goto            356
        //   355: athrow         
        //   356: goto            731
        //   359: astore_2       
        //   360: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   363: ldc             "\u10e3\u148a\ub9d8\ub196\ufeaa\ude95\ub207\ud5e8\udb3d\ude8f\u9411\u1e0c\ud2cd\uc7e8\ub610\uba0e\u57b6\u4427\ubf7c\uf73b\u1861\uc23f\u592f\u2f10\ue0e0\u06a3\u7d27\uba9d\u8211\ubba2\ub79c\ufb3c\u43e1\u9816\u2cb5\uc25b\u4972\ubb40\uc8cf\uc813"
        //   365: goto            369
        //   368: athrow         
        //   369: invokestatic    invokestatic   !!! ERROR
        //   372: goto            376
        //   375: athrow         
        //   376: getstatic       dev/nuker/pyro/fc.1:I
        //   379: ifeq            387
        //   382: ldc             1392812393
        //   384: goto            389
        //   387: ldc             -510740324
        //   389: ldc             1663795823
        //   391: ixor           
        //   392: lookupswitch {
        //          -2132174334: 387
        //          808395526: 1284
        //          default: 420
        //        }
        //   420: goto            424
        //   423: athrow         
        //   424: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   427: goto            431
        //   430: athrow         
        //   431: goto            731
        //   434: new             Ljava/io/FileWriter;
        //   437: dup            
        //   438: aload_1        
        //   439: goto            443
        //   442: athrow         
        //   443: invokespecial   java/io/FileWriter.<init>:(Ljava/io/File;)V
        //   446: goto            450
        //   449: athrow         
        //   450: getstatic       dev/nuker/pyro/fc.0:I
        //   453: ifeq            461
        //   456: ldc             -180003522
        //   458: goto            463
        //   461: ldc             1705577861
        //   463: ldc             -652341025
        //   465: ixor           
        //   466: lookupswitch {
        //          -1407675510: 461
        //          744181217: 1262
        //          default: 492
        //        }
        //   492: astore_2       
        //   493: getstatic       dev/nuker/pyro/Pyro.GSON:Lcom/google/gson/Gson;
        //   496: getstatic       dev/nuker/pyro/fc.c:I
        //   499: ifge            507
        //   502: ldc             836654363
        //   504: goto            509
        //   507: ldc             1010977633
        //   509: ldc             1728365441
        //   511: ixor           
        //   512: lookupswitch {
        //          712234611: 507
        //          1457165978: 1280
        //          default: 540
        //        }
        //   540: aload_0        
        //   541: getfield        dev/nuker/pyro/fy.c:Ldev/nuker/pyro/api/FontManager$CustomFontConfig;
        //   544: getstatic       dev/nuker/pyro/fc.c:I
        //   547: ifge            555
        //   550: ldc             148309119
        //   552: goto            557
        //   555: ldc             -1278523131
        //   557: ldc             836183360
        //   559: ixor           
        //   560: lookupswitch {
        //          -262258856: 555
        //          956309823: 1270
        //          default: 588
        //        }
        //   588: aload_2        
        //   589: goto            593
        //   592: athrow         
        //   593: invokevirtual   com/google/gson/Gson.toJson:(Ljava/lang/Object;Ljava/lang/Appendable;)V
        //   596: goto            600
        //   599: athrow         
        //   600: getstatic       dev/nuker/pyro/fc.0:I
        //   603: ifeq            611
        //   606: ldc             -1856102691
        //   608: goto            613
        //   611: ldc             1885893440
        //   613: ldc             -960663341
        //   615: ixor           
        //   616: lookupswitch {
        //          -1227553901: 644
        //          1474522638: 611
        //          default: 1264
        //        }
        //   644: aload_2        
        //   645: goto            649
        //   648: athrow         
        //   649: invokevirtual   java/io/FileWriter.close:()V
        //   652: goto            656
        //   655: athrow         
        //   656: goto            731
        //   659: astore_2       
        //   660: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   663: ldc             "\u10e3\u148a\ub9d8\ub196\ufeaa\ude95\ub207\ud5e8\udb3d\ude8f\u9411\u1e0c\ud2cd\uc7e8\ub610\uba0e\u57b7\u4423\ubf6b\uf73a\u1861\uc23f\u592f\u2f10\ue0e0\u06a3\u7d27\uba9d\u8211\ubba2\ub79c\ufb3c\u43e1\u9816\u2cb5\uc25b\u4972\ubb40\uc8cf\uc813"
        //   665: goto            669
        //   668: athrow         
        //   669: invokestatic    invokestatic   !!! ERROR
        //   672: goto            676
        //   675: athrow         
        //   676: getstatic       dev/nuker/pyro/fc.c:I
        //   679: ifge            687
        //   682: ldc             -1222048366
        //   684: goto            689
        //   687: ldc             757187578
        //   689: ldc             -1939286211
        //   691: ixor           
        //   692: lookupswitch {
        //          994169519: 1294
        //          1912021074: 687
        //          default: 720
        //        }
        //   720: goto            724
        //   723: athrow         
        //   724: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   727: goto            731
        //   730: athrow         
        //   731: aload_0        
        //   732: new             Ldev/nuker/pyro/util/font/GameFontRenderer;
        //   735: dup            
        //   736: ldc             "\u10e1\u149c\ub9c8\ub196\ufee4\udeda\ub269\ud5ca\udb2d\ude87\u941c\u1e59\ud2ce\uc7a9\ub610\uba5a\u57a2"
        //   738: goto            742
        //   741: athrow         
        //   742: invokestatic    invokestatic   !!! ERROR
        //   745: goto            749
        //   748: athrow         
        //   749: aload_0        
        //   750: getstatic       dev/nuker/pyro/fc.0:I
        //   753: ifeq            761
        //   756: ldc             2058736077
        //   758: goto            763
        //   761: ldc             203693987
        //   763: ldc             -1556025908
        //   765: ixor           
        //   766: lookupswitch {
        //          -1352338833: 792
        //          -638239743: 761
        //          default: 1298
        //        }
        //   792: getfield        dev/nuker/pyro/fy.c:Ldev/nuker/pyro/api/FontManager$CustomFontConfig;
        //   795: getstatic       dev/nuker/pyro/fc.0:I
        //   798: ifeq            806
        //   801: ldc             -1121718925
        //   803: goto            809
        //   806: ldc_w           1795170590
        //   809: ldc_w           1823593242
        //   812: ixor           
        //   813: lookupswitch {
        //          -778944919: 806
        //          129102340: 840
        //          default: 1296
        //        }
        //   840: getfield        dev/nuker/pyro/api/FontManager$CustomFontConfig.size:I
        //   843: i2f            
        //   844: goto            848
        //   847: athrow         
        //   848: invokestatic    dev/nuker/pyro/fy.c:(Ljava/lang/String;F)Ljava/awt/Font;
        //   851: goto            855
        //   854: athrow         
        //   855: aload_0        
        //   856: getfield        dev/nuker/pyro/fy.c:Ldev/nuker/pyro/api/FontManager$CustomFontConfig;
        //   859: goto            863
        //   862: athrow         
        //   863: invokespecial   dev/nuker/pyro/util/font/GameFontRenderer.<init>:(Ljava/awt/Font;Ldev/nuker/pyro/api/FontManager$CustomFontConfig;)V
        //   866: goto            870
        //   869: athrow         
        //   870: getstatic       dev/nuker/pyro/fc.1:I
        //   873: ifeq            882
        //   876: ldc_w           -1560813391
        //   879: goto            885
        //   882: ldc_w           828095259
        //   885: ldc_w           -1419058911
        //   888: ixor           
        //   889: lookupswitch {
        //          161284496: 1272
        //          1096944049: 882
        //          default: 916
        //        }
        //   916: putfield        dev/nuker/pyro/fy.c:Ldev/nuker/pyro/util/font/GameFontRenderer;
        //   919: aload_0        
        //   920: new             Ldev/nuker/pyro/util/font/GameFontRenderer;
        //   923: dup            
        //   924: ldc             "\u10e1\u149c\ub9c8\ub196\ufee4\udeda\ub269\ud5ca\udb2d\ude87\u941c\u1e59\ud2ce\uc7a9\ub610\uba5a\u57a2"
        //   926: goto            930
        //   929: athrow         
        //   930: invokestatic    invokestatic   !!! ERROR
        //   933: goto            937
        //   936: athrow         
        //   937: ldc_w           44.0
        //   940: getstatic       dev/nuker/pyro/fc.0:I
        //   943: ifeq            952
        //   946: ldc_w           -408817432
        //   949: goto            955
        //   952: ldc_w           2073334789
        //   955: ldc_w           703106177
        //   958: ixor           
        //   959: lookupswitch {
        //          -834044823: 952
        //          1383864452: 984
        //          default: 1276
        //        }
        //   984: goto            988
        //   987: athrow         
        //   988: invokestatic    dev/nuker/pyro/fy.c:(Ljava/lang/String;F)Ljava/awt/Font;
        //   991: goto            995
        //   994: athrow         
        //   995: aload_0        
        //   996: getfield        dev/nuker/pyro/fy.c:Ldev/nuker/pyro/api/FontManager$CustomFontConfig;
        //   999: getstatic       dev/nuker/pyro/fc.0:I
        //  1002: ifeq            1011
        //  1005: ldc_w           -1822937355
        //  1008: goto            1014
        //  1011: ldc_w           -283986135
        //  1014: ldc_w           -1444045408
        //  1017: ixor           
        //  1018: lookupswitch {
        //          -260937607: 1011
        //          984986453: 1286
        //          default: 1044
        //        }
        //  1044: goto            1048
        //  1047: athrow         
        //  1048: invokespecial   dev/nuker/pyro/util/font/GameFontRenderer.<init>:(Ljava/awt/Font;Ldev/nuker/pyro/api/FontManager$CustomFontConfig;)V
        //  1051: goto            1055
        //  1054: athrow         
        //  1055: getstatic       dev/nuker/pyro/fc.1:I
        //  1058: ifeq            1067
        //  1061: ldc_w           -311703817
        //  1064: goto            1070
        //  1067: ldc_w           390679032
        //  1070: ldc_w           -1140373477
        //  1073: ixor           
        //  1074: lookupswitch {
        //          -1420951069: 1100
        //          1366068972: 1067
        //          default: 1288
        //        }
        //  1100: putfield        dev/nuker/pyro/fy.0:Ldev/nuker/pyro/util/font/GameFontRenderer;
        //  1103: aload_0        
        //  1104: new             Ldev/nuker/pyro/util/font/GameFontRenderer;
        //  1107: dup            
        //  1108: ldc_w           "\u10d1\u1492\ub9ce\ub198\ufef2\udeda\ub22b\ud5ea\udb66\ude97\u9401\u1e4a"
        //  1111: goto            1115
        //  1114: athrow         
        //  1115: invokestatic    invokestatic   !!! ERROR
        //  1118: goto            1122
        //  1121: athrow         
        //  1122: ldc_w           40.0
        //  1125: getstatic       dev/nuker/pyro/fc.0:I
        //  1128: ifeq            1137
        //  1131: ldc_w           -1511784553
        //  1134: goto            1140
        //  1137: ldc_w           1427403994
        //  1140: ldc_w           -666996613
        //  1143: ixor           
        //  1144: lookupswitch {
        //          629363567: 1137
        //          2111672300: 1282
        //          default: 1172
        //        }
        //  1172: goto            1176
        //  1175: athrow         
        //  1176: invokestatic    dev/nuker/pyro/fy.c:(Ljava/lang/String;F)Ljava/awt/Font;
        //  1179: goto            1183
        //  1182: athrow         
        //  1183: aload_0        
        //  1184: getfield        dev/nuker/pyro/fy.c:Ldev/nuker/pyro/api/FontManager$CustomFontConfig;
        //  1187: goto            1191
        //  1190: athrow         
        //  1191: invokespecial   dev/nuker/pyro/util/font/GameFontRenderer.<init>:(Ljava/awt/Font;Ldev/nuker/pyro/api/FontManager$CustomFontConfig;)V
        //  1194: goto            1198
        //  1197: athrow         
        //  1198: putfield        dev/nuker/pyro/fy.1:Ldev/nuker/pyro/util/font/GameFontRenderer;
        //  1201: getstatic       dev/nuker/pyro/fc.1:I
        //  1204: ifeq            1213
        //  1207: ldc_w           -759235122
        //  1210: goto            1216
        //  1213: ldc_w           -1194797601
        //  1216: ldc_w           -1020998316
        //  1219: ixor           
        //  1220: lookupswitch {
        //          295317658: 1213
        //          2079070347: 1248
        //          default: 1292
        //        }
        //  1248: aload_0        
        //  1249: goto            1253
        //  1252: athrow         
        //  1253: invokevirtual   dev/nuker/pyro/fy.1:()Z
        //  1256: goto            1260
        //  1259: athrow         
        //  1260: pop            
        //  1261: return         
        //  1262: aconst_null    
        //  1263: athrow         
        //  1264: aconst_null    
        //  1265: athrow         
        //  1266: aconst_null    
        //  1267: athrow         
        //  1268: aconst_null    
        //  1269: athrow         
        //  1270: aconst_null    
        //  1271: athrow         
        //  1272: aconst_null    
        //  1273: athrow         
        //  1274: aconst_null    
        //  1275: athrow         
        //  1276: aconst_null    
        //  1277: athrow         
        //  1278: aconst_null    
        //  1279: athrow         
        //  1280: aconst_null    
        //  1281: athrow         
        //  1282: aconst_null    
        //  1283: athrow         
        //  1284: aconst_null    
        //  1285: athrow         
        //  1286: aconst_null    
        //  1287: athrow         
        //  1288: aconst_null    
        //  1289: athrow         
        //  1290: aconst_null    
        //  1291: athrow         
        //  1292: aconst_null    
        //  1293: athrow         
        //  1294: aconst_null    
        //  1295: athrow         
        //  1296: aconst_null    
        //  1297: athrow         
        //  1298: aconst_null    
        //  1299: athrow         
        //  1300: pop            
        //  1301: goto            24
        //  1304: pop            
        //  1305: aconst_null    
        //  1306: goto            1300
        //  1309: dup            
        //  1310: ifnull          1300
        //  1313: checkcast       Ljava/lang/Throwable;
        //  1316: athrow         
        //  1317: dup            
        //  1318: ifnull          1304
        //  1321: checkcast       Ljava/lang/Throwable;
        //  1324: athrow         
        //  1325: aconst_null    
        //  1326: athrow         
        //    StackMapTable: 00 B8 43 07 00 16 04 FF 00 0B 00 00 00 01 07 00 16 FC 00 03 07 00 03 47 07 00 16 FF 00 00 00 01 07 00 03 00 03 07 00 03 08 00 19 08 00 19 45 07 00 16 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 26 FF 00 0A 00 01 07 00 03 00 02 07 00 03 07 00 26 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 26 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 26 4B 07 00 A1 FF 00 00 00 01 07 00 03 00 03 08 00 57 08 00 57 07 00 89 45 07 00 16 FF 00 00 00 01 07 00 03 00 03 08 00 57 08 00 57 07 00 89 42 07 00 41 FF 00 00 00 01 07 00 03 00 03 08 00 57 08 00 57 07 00 89 45 07 00 16 40 07 00 AB FF 00 04 00 02 07 00 03 07 00 AB 00 01 07 00 16 40 07 00 AB 45 07 00 16 40 01 FF 00 12 00 02 07 00 03 07 00 AB 00 03 08 00 83 08 00 83 07 00 AB FF 00 01 00 02 07 00 03 07 00 AB 00 04 08 00 83 08 00 83 07 00 AB 01 FF 00 1E 00 02 07 00 03 07 00 AB 00 03 08 00 83 08 00 83 07 00 AB 42 07 00 3F FF 00 00 00 02 07 00 03 07 00 AB 00 03 08 00 83 08 00 83 07 00 AB 45 07 00 16 40 07 00 B6 4A 07 00 B6 FF 00 01 00 02 07 00 03 07 00 AB 00 02 07 00 B6 01 5B 07 00 B6 FF 00 0F 00 03 07 00 03 07 00 AB 07 00 B6 00 02 07 00 03 07 00 C8 FF 00 01 00 03 07 00 03 07 00 AB 07 00 B6 00 03 07 00 03 07 00 C8 01 FF 00 1D 00 03 07 00 03 07 00 AB 07 00 B6 00 02 07 00 03 07 00 C8 45 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 B6 00 04 07 00 03 07 00 C8 07 00 B6 07 01 27 45 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 B6 00 02 07 00 03 07 00 05 10 41 01 1E 43 07 00 16 40 07 00 B6 45 07 00 16 00 FF 00 02 00 02 07 00 03 07 00 AB 00 01 07 00 9F FF 00 08 00 00 00 01 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 45 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 FF 00 0A 00 03 07 00 03 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 FF 00 01 00 03 07 00 03 07 00 AB 07 00 9F 00 03 07 00 DD 07 00 89 01 FF 00 1E 00 03 07 00 03 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 42 07 00 37 FF 00 00 00 03 07 00 03 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 45 07 00 16 00 FA 00 02 47 07 00 3B FF 00 00 00 02 07 00 03 07 00 AB 00 03 08 01 B2 08 01 B2 07 00 AB 45 07 00 16 40 07 00 E2 4A 07 00 E2 FF 00 01 00 02 07 00 03 07 00 AB 00 02 07 00 E2 01 5C 07 00 E2 FF 00 0E 00 03 07 00 03 07 00 AB 07 00 E2 00 01 07 00 C8 FF 00 01 00 03 07 00 03 07 00 AB 07 00 E2 00 02 07 00 C8 01 5E 07 00 C8 FF 00 0E 00 03 07 00 03 07 00 AB 07 00 E2 00 02 07 00 C8 07 00 26 FF 00 01 00 03 07 00 03 07 00 AB 07 00 E2 00 03 07 00 C8 07 00 26 01 FF 00 1E 00 03 07 00 03 07 00 AB 07 00 E2 00 02 07 00 C8 07 00 26 43 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 E2 00 03 07 00 C8 07 00 26 07 00 E2 45 07 00 16 00 0A 41 01 1E 43 07 00 16 40 07 00 E2 45 07 00 16 00 FF 00 02 00 02 07 00 03 07 00 AB 00 01 07 00 9F FF 00 08 00 03 07 00 03 07 00 AB 07 00 9F 00 01 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 45 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 FF 00 0A 00 03 07 00 03 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 FF 00 01 00 03 07 00 03 07 00 AB 07 00 9F 00 03 07 00 DD 07 00 89 01 FF 00 1E 00 03 07 00 03 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 FF 00 02 00 00 00 01 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 45 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 00 49 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 04 07 00 03 08 02 DC 08 02 DC 07 00 89 45 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 04 07 00 03 08 02 DC 08 02 DC 07 00 89 FF 00 0B 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 02 DC 08 02 DC 07 00 89 07 00 03 FF 00 01 00 03 07 00 03 07 00 AB 07 00 05 00 06 07 00 03 08 02 DC 08 02 DC 07 00 89 07 00 03 01 FF 00 1C 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 02 DC 08 02 DC 07 00 89 07 00 03 FF 00 0D 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 02 DC 08 02 DC 07 00 89 07 00 26 FF 00 02 00 03 07 00 03 07 00 AB 07 00 05 00 06 07 00 03 08 02 DC 08 02 DC 07 00 89 07 00 26 01 FF 00 1E 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 02 DC 08 02 DC 07 00 89 07 00 26 46 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 02 DC 08 02 DC 07 00 89 02 45 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 04 07 00 03 08 02 DC 08 02 DC 07 00 66 46 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 02 DC 08 02 DC 07 00 66 07 00 26 45 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 02 07 00 03 07 00 8E FF 00 0B 00 03 07 00 03 07 00 AB 07 00 05 00 02 07 00 03 07 00 8E FF 00 02 00 03 07 00 03 07 00 AB 07 00 05 00 03 07 00 03 07 00 8E 01 FF 00 1E 00 03 07 00 03 07 00 AB 07 00 05 00 02 07 00 03 07 00 8E FF 00 0C 00 00 00 01 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 04 07 00 03 08 03 98 08 03 98 07 00 89 45 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 04 07 00 03 08 03 98 08 03 98 07 00 89 FF 00 0E 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 03 98 08 03 98 07 00 89 02 FF 00 02 00 03 07 00 03 07 00 AB 07 00 05 00 06 07 00 03 08 03 98 08 03 98 07 00 89 02 01 FF 00 1C 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 03 98 08 03 98 07 00 89 02 42 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 03 98 08 03 98 07 00 89 02 45 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 04 07 00 03 08 03 98 08 03 98 07 00 66 FF 00 0F 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 03 98 08 03 98 07 00 66 07 00 26 FF 00 02 00 03 07 00 03 07 00 AB 07 00 05 00 06 07 00 03 08 03 98 08 03 98 07 00 66 07 00 26 01 FF 00 1D 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 03 98 08 03 98 07 00 66 07 00 26 FF 00 02 00 00 00 01 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 03 98 08 03 98 07 00 66 07 00 26 45 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 02 07 00 03 07 00 8E FF 00 0B 00 03 07 00 03 07 00 AB 07 00 05 00 02 07 00 03 07 00 8E FF 00 02 00 03 07 00 03 07 00 AB 07 00 05 00 03 07 00 03 07 00 8E 01 FF 00 1D 00 03 07 00 03 07 00 AB 07 00 05 00 02 07 00 03 07 00 8E 4D 07 00 33 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 04 07 00 03 08 04 50 08 04 50 07 00 89 45 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 04 07 00 03 08 04 50 08 04 50 07 00 89 FF 00 0E 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 04 50 08 04 50 07 00 89 02 FF 00 02 00 03 07 00 03 07 00 AB 07 00 05 00 06 07 00 03 08 04 50 08 04 50 07 00 89 02 01 FF 00 1F 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 04 50 08 04 50 07 00 89 02 42 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 04 50 08 04 50 07 00 89 02 45 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 04 07 00 03 08 04 50 08 04 50 07 00 66 46 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 04 50 08 04 50 07 00 66 07 00 26 45 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 05 00 02 07 00 03 07 00 8E 0E 42 01 1F 43 07 00 16 40 07 00 03 45 07 00 16 40 01 FF 00 01 00 02 07 00 03 07 00 AB 00 01 07 00 E2 FC 00 01 07 00 E2 FF 00 01 00 02 07 00 03 07 00 AB 00 03 08 00 83 08 00 83 07 00 AB FF 00 01 00 03 07 00 03 07 00 AB 07 00 B6 00 02 07 00 03 07 00 C8 FF 00 01 00 03 07 00 03 07 00 AB 07 00 E2 00 02 07 00 C8 07 00 26 FF 00 01 00 03 07 00 03 07 00 AB 07 00 05 00 02 07 00 03 07 00 8E FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 26 FF 00 01 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 03 98 08 03 98 07 00 89 02 FF 00 01 00 03 07 00 03 07 00 AB 07 00 B6 00 00 FF 00 01 00 03 07 00 03 07 00 AB 07 00 E2 00 01 07 00 C8 FF 00 01 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 04 50 08 04 50 07 00 89 02 FF 00 01 00 03 07 00 03 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 FF 00 01 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 03 98 08 03 98 07 00 66 07 00 26 FF 00 01 00 03 07 00 03 07 00 AB 07 00 05 00 02 07 00 03 07 00 8E FF 00 01 00 02 07 00 03 07 00 AB 00 01 07 00 B6 FC 00 01 07 00 05 FF 00 01 00 03 07 00 03 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 FF 00 01 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 02 DC 08 02 DC 07 00 89 07 00 26 FF 00 01 00 03 07 00 03 07 00 AB 07 00 05 00 05 07 00 03 08 02 DC 08 02 DC 07 00 89 07 00 03 FF 00 01 00 01 07 00 03 00 01 07 00 16 43 05 44 07 00 16 47 05 47 07 00 16
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  131    356    359    434    Ljava/io/IOException;
        //  434    656    659    731    Ljava/io/IOException;
        //  8      20     1309   1317   Any
        //  1309   1317   1309   1317   Any
        //  1325   1327   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  32     39     39     40     Any
        //  32     39     32     33     Ljava/lang/NumberFormatException;
        //  33     39     32     33     Ljava/lang/RuntimeException;
        //  33     39     32     33     Any
        //  32     39     39     40     Any
        //  96     103    103    104    Any
        //  96     103    103    104    Any
        //  96     103    96     97     Ljava/lang/NullPointerException;
        //  96     103    103    104    Any
        //  96     103    103    104    Any
        //  107    114    114    115    Any
        //  107    114    3      8      Any
        //  108    114    3      8      Any
        //  107    114    114    115    Any
        //  108    114    107    108    Ljava/lang/ArithmeticException;
        //  120    127    127    128    Any
        //  120    127    127    128    Ljava/lang/IllegalStateException;
        //  120    127    120    121    Any
        //  121    127    120    121    Ljava/util/NoSuchElementException;
        //  121    127    120    121    Ljava/lang/IllegalArgumentException;
        //  183    190    190    191    Any
        //  184    190    190    191    Any
        //  184    190    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  183    190    183    184    Ljava/lang/EnumConstantNotPresentException;
        //  184    190    190    191    Ljava/lang/NullPointerException;
        //  286    293    293    294    Any
        //  286    293    293    294    Any
        //  286    293    286    287    Any
        //  287    293    293    294    Ljava/lang/IllegalStateException;
        //  286    293    293    294    Ljava/lang/IllegalStateException;
        //  348    355    355    356    Any
        //  348    355    348    349    Ljava/lang/EnumConstantNotPresentException;
        //  349    355    355    356    Any
        //  349    355    348    349    Any
        //  349    355    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  369    375    375    376    Any
        //  369    375    375    376    Ljava/lang/EnumConstantNotPresentException;
        //  369    375    375    376    Ljava/lang/NullPointerException;
        //  369    375    3      8      Ljava/lang/AssertionError;
        //  369    375    375    376    Any
        //  423    430    430    431    Any
        //  424    430    430    431    Any
        //  423    430    3      8      Any
        //  424    430    423    424    Ljava/lang/ClassCastException;
        //  423    430    430    431    Ljava/util/ConcurrentModificationException;
        //  442    449    449    450    Any
        //  443    449    449    450    Any
        //  442    449    449    450    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  442    449    449    450    Any
        //  443    449    442    443    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  592    599    599    600    Any
        //  593    599    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  593    599    592    593    Any
        //  592    599    599    600    Any
        //  593    599    599    600    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  648    655    655    656    Any
        //  648    655    648    649    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  649    655    655    656    Any
        //  648    655    655    656    Ljava/lang/StringIndexOutOfBoundsException;
        //  649    655    648    649    Any
        //  668    675    675    676    Any
        //  668    675    675    676    Any
        //  669    675    675    676    Ljava/lang/NullPointerException;
        //  668    675    668    669    Any
        //  668    675    675    676    Ljava/lang/ArithmeticException;
        //  724    730    730    731    Any
        //  724    730    3      8      Any
        //  724    730    3      8      Any
        //  724    730    730    731    Any
        //  724    730    730    731    Ljava/lang/ArithmeticException;
        //  741    748    748    749    Any
        //  742    748    741    742    Any
        //  742    748    748    749    Ljava/lang/NegativeArraySizeException;
        //  741    748    748    749    Any
        //  741    748    741    742    Any
        //  847    854    854    855    Any
        //  848    854    854    855    Ljava/lang/NegativeArraySizeException;
        //  848    854    3      8      Any
        //  848    854    847    848    Ljava/lang/ArithmeticException;
        //  847    854    847    848    Any
        //  862    869    869    870    Any
        //  863    869    862    863    Ljava/lang/NumberFormatException;
        //  863    869    869    870    Ljava/lang/NumberFormatException;
        //  863    869    862    863    Any
        //  862    869    3      8      Ljava/lang/UnsupportedOperationException;
        //  930    936    936    937    Any
        //  930    936    936    937    Any
        //  930    936    3      8      Ljava/lang/NumberFormatException;
        //  930    936    936    937    Any
        //  930    936    936    937    Any
        //  987    994    994    995    Any
        //  987    994    987    988    Ljava/lang/AssertionError;
        //  987    994    994    995    Ljava/lang/StringIndexOutOfBoundsException;
        //  987    994    987    988    Ljava/lang/UnsupportedOperationException;
        //  987    994    987    988    Any
        //  1048   1054   1054   1055   Any
        //  1048   1054   1054   1055   Ljava/lang/IllegalArgumentException;
        //  1048   1054   3      8      Any
        //  1048   1054   1054   1055   Any
        //  1048   1054   3      8      Ljava/lang/UnsupportedOperationException;
        //  1114   1121   1121   1122   Any
        //  1114   1121   3      8      Any
        //  1114   1121   1114   1115   Ljava/lang/IllegalStateException;
        //  1114   1121   3      8      Ljava/lang/IllegalArgumentException;
        //  1115   1121   1121   1122   Any
        //  1175   1182   1182   1183   Any
        //  1176   1182   1175   1176   Any
        //  1175   1182   1175   1176   Any
        //  1175   1182   1175   1176   Any
        //  1176   1182   1182   1183   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1190   1197   1197   1198   Any
        //  1191   1197   1190   1191   Any
        //  1191   1197   3      8      Ljava/util/NoSuchElementException;
        //  1191   1197   1190   1191   Ljava/util/NoSuchElementException;
        //  1190   1197   1190   1191   Any
        //  1252   1259   1259   1260   Any
        //  1252   1259   3      8      Any
        //  1252   1259   3      8      Ljava/lang/NegativeArraySizeException;
        //  1253   1259   3      8      Any
        //  1253   1259   1252   1253   Any
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
    
    public boolean 1() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1341
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1333
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1325
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            36
        //    30: ldc_w           -1953731212
        //    33: goto            39
        //    36: ldc_w           1487320253
        //    39: ldc_w           281226546
        //    42: ixor           
        //    43: lookupswitch {
        //          -1689305018: 1290
        //          444214658: 36
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: aconst_null    
        //    70: putfield        dev/nuker/pyro/fy.2:Ldev/nuker/pyro/util/font/GameFontRenderer;
        //    73: new             Ljava/io/File;
        //    76: dup            
        //    77: ldc_w           "\u10c3\u148a\ub9d8\ub195\ufebe\uded3\ub22b\ud5e9\udb3f\udecc\u9401\u1e58\ud2c5"
        //    80: getstatic       dev/nuker/pyro/fc.c:I
        //    83: ifge            92
        //    86: ldc_w           642488827
        //    89: goto            95
        //    92: ldc_w           1394560159
        //    95: ldc_w           -761859757
        //    98: ixor           
        //    99: lookupswitch {
        //          -186816344: 1298
        //          1627487123: 92
        //          default: 124
        //        }
        //   124: goto            128
        //   127: athrow         
        //   128: invokestatic    invokestatic   !!! ERROR
        //   131: goto            135
        //   134: athrow         
        //   135: getstatic       dev/nuker/pyro/fc.c:I
        //   138: ifge            147
        //   141: ldc_w           -1308422413
        //   144: goto            150
        //   147: ldc_w           365592905
        //   150: ldc_w           -495742759
        //   153: ixor           
        //   154: lookupswitch {
        //          -138866288: 180
        //          1349557802: 147
        //          default: 1304
        //        }
        //   180: goto            184
        //   183: athrow         
        //   184: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   187: goto            191
        //   190: athrow         
        //   191: astore_1       
        //   192: getstatic       dev/nuker/pyro/fc.0:I
        //   195: ifeq            204
        //   198: ldc_w           -1755595414
        //   201: goto            207
        //   204: ldc_w           830715235
        //   207: ldc_w           -494446650
        //   210: ixor           
        //   211: lookupswitch {
        //          -1002039017: 204
        //          1977412268: 1310
        //          default: 236
        //        }
        //   236: aload_1        
        //   237: goto            241
        //   240: athrow         
        //   241: invokevirtual   java/io/File.exists:()Z
        //   244: goto            248
        //   247: athrow         
        //   248: ifeq            1276
        //   251: new             Ldev/nuker/pyro/api/FontManager$CustomFontConfig;
        //   254: dup            
        //   255: goto            259
        //   258: athrow         
        //   259: invokespecial   dev/nuker/pyro/api/FontManager$CustomFontConfig.<init>:()V
        //   262: goto            266
        //   265: athrow         
        //   266: astore_2       
        //   267: new             Ljava/io/File;
        //   270: dup            
        //   271: ldc_w           "\u10c3\u148a\ub9d8\ub195\ufebe\uded3\ub22b\ud5e9\udb3f\udecc\u941f\u1e5f\ud2cc\uc7ea"
        //   274: goto            278
        //   277: athrow         
        //   278: invokestatic    invokestatic   !!! ERROR
        //   281: goto            285
        //   284: athrow         
        //   285: goto            289
        //   288: athrow         
        //   289: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   292: goto            296
        //   295: athrow         
        //   296: astore_3       
        //   297: aload_3        
        //   298: getstatic       dev/nuker/pyro/fc.1:I
        //   301: ifeq            310
        //   304: ldc_w           1268239583
        //   307: goto            313
        //   310: ldc_w           -1780242114
        //   313: ldc_w           606750115
        //   316: ixor           
        //   317: lookupswitch {
        //          1620130379: 310
        //          1874692476: 1302
        //          default: 344
        //        }
        //   344: goto            348
        //   347: athrow         
        //   348: invokevirtual   java/io/File.exists:()Z
        //   351: goto            355
        //   354: athrow         
        //   355: ifeq            671
        //   358: new             Ljava/io/FileReader;
        //   361: dup            
        //   362: aload_3        
        //   363: getstatic       dev/nuker/pyro/fc.c:I
        //   366: ifge            375
        //   369: ldc_w           -1401813371
        //   372: goto            378
        //   375: ldc_w           1236655345
        //   378: ldc_w           -1862116946
        //   381: ixor           
        //   382: lookupswitch {
        //          -1501113162: 375
        //          1030774571: 1278
        //          default: 408
        //        }
        //   408: goto            412
        //   411: athrow         
        //   412: invokespecial   java/io/FileReader.<init>:(Ljava/io/File;)V
        //   415: goto            419
        //   418: athrow         
        //   419: astore          4
        //   421: getstatic       dev/nuker/pyro/Pyro.GSON:Lcom/google/gson/Gson;
        //   424: aload           4
        //   426: ldc             Ldev/nuker/pyro/api/FontManager$CustomFontConfig;.class
        //   428: goto            432
        //   431: athrow         
        //   432: invokevirtual   com/google/gson/Gson.fromJson:(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;
        //   435: goto            439
        //   438: athrow         
        //   439: checkcast       Ldev/nuker/pyro/api/FontManager$CustomFontConfig;
        //   442: astore_2       
        //   443: aload           4
        //   445: goto            449
        //   448: athrow         
        //   449: invokevirtual   java/io/FileReader.close:()V
        //   452: goto            456
        //   455: athrow         
        //   456: goto            671
        //   459: getstatic       dev/nuker/pyro/fc.1:I
        //   462: ifeq            471
        //   465: ldc_w           -1900099859
        //   468: goto            474
        //   471: ldc_w           -1597334681
        //   474: ldc_w           792417458
        //   477: ixor           
        //   478: lookupswitch {
        //          -1879978027: 504
        //          -1585081761: 471
        //          default: 1280
        //        }
        //   504: astore          4
        //   506: getstatic       dev/nuker/pyro/fc.1:I
        //   509: ifeq            518
        //   512: ldc_w           -1204533089
        //   515: goto            521
        //   518: ldc_w           238786757
        //   521: ldc_w           1130885234
        //   524: ixor           
        //   525: lookupswitch {
        //          -1902720073: 518
        //          -78399251: 1308
        //          default: 552
        //        }
        //   552: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   555: ldc_w           "\u10e3\u148a\ub9d8\ub195\ufeab\ude95\ub207\ud5e8\udb3e\ude8e\u9411\u1e0c\ud2cd\uc7eb\ub611\uba0e\u57b6\u4427\ubf7f\uf73a\u1861\uc23d\u5925\u2f1b\ue0f4\u06f6\u7d28\uba86\u825c\ubba3\ub79a\ufb35"
        //   558: getstatic       dev/nuker/pyro/fc.c:I
        //   561: ifge            570
        //   564: ldc_w           -1125899286
        //   567: goto            573
        //   570: ldc_w           1468806254
        //   573: ldc_w           1459132017
        //   576: ixor           
        //   577: lookupswitch {
        //          -672294356: 570
        //          -367217253: 1306
        //          default: 604
        //        }
        //   604: goto            608
        //   607: athrow         
        //   608: invokestatic    invokestatic   !!! ERROR
        //   611: goto            615
        //   614: athrow         
        //   615: getstatic       dev/nuker/pyro/fc.1:I
        //   618: ifeq            627
        //   621: ldc_w           2046398661
        //   624: goto            630
        //   627: ldc_w           635563328
        //   630: ldc_w           -161924035
        //   633: ixor           
        //   634: lookupswitch {
        //          -1885295368: 1294
        //          -633087291: 627
        //          default: 660
        //        }
        //   660: goto            664
        //   663: athrow         
        //   664: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   667: goto            671
        //   670: athrow         
        //   671: new             Ljava/io/FileInputStream;
        //   674: dup            
        //   675: aload_1        
        //   676: getstatic       dev/nuker/pyro/fc.0:I
        //   679: ifeq            688
        //   682: ldc_w           746550148
        //   685: goto            691
        //   688: ldc_w           1972514329
        //   691: ldc_w           -104945502
        //   694: ixor           
        //   695: lookupswitch {
        //          -708715738: 1292
        //          916947941: 688
        //          default: 720
        //        }
        //   720: goto            724
        //   723: athrow         
        //   724: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   727: goto            731
        //   730: athrow         
        //   731: astore          4
        //   733: iconst_0       
        //   734: getstatic       dev/nuker/pyro/fc.1:I
        //   737: ifeq            746
        //   740: ldc_w           -1969727696
        //   743: goto            749
        //   746: ldc_w           515178485
        //   749: ldc_w           1036108428
        //   752: ixor           
        //   753: lookupswitch {
        //          -1218865732: 1300
        //          1977809993: 746
        //          default: 780
        //        }
        //   780: aload           4
        //   782: goto            786
        //   785: athrow         
        //   786: invokestatic    java/awt/Font.createFont:(ILjava/io/InputStream;)Ljava/awt/Font;
        //   789: goto            793
        //   792: athrow         
        //   793: astore          5
        //   795: getstatic       dev/nuker/pyro/fc.0:I
        //   798: ifeq            807
        //   801: ldc_w           120668096
        //   804: goto            810
        //   807: ldc_w           -1785783886
        //   810: ldc_w           -1487153271
        //   813: ixor           
        //   814: lookupswitch {
        //          -1603606455: 807
        //          852807227: 840
        //          default: 1282
        //        }
        //   840: aload           5
        //   842: iconst_0       
        //   843: aload_2        
        //   844: getstatic       dev/nuker/pyro/fc.1:I
        //   847: ifeq            856
        //   850: ldc_w           -1027561501
        //   853: goto            859
        //   856: ldc_w           -2021750579
        //   859: ldc_w           -1817403520
        //   862: ixor           
        //   863: lookupswitch {
        //          349312845: 888
        //          1366046819: 856
        //          default: 1284
        //        }
        //   888: getfield        dev/nuker/pyro/api/FontManager$CustomFontConfig.size:I
        //   891: i2f            
        //   892: goto            896
        //   895: athrow         
        //   896: invokevirtual   java/awt/Font.deriveFont:(IF)Ljava/awt/Font;
        //   899: goto            903
        //   902: athrow         
        //   903: astore          5
        //   905: getstatic       dev/nuker/pyro/fc.0:I
        //   908: ifeq            917
        //   911: ldc_w           1776511232
        //   914: goto            920
        //   917: ldc_w           403995515
        //   920: ldc_w           -2010902295
        //   923: ixor           
        //   924: lookupswitch {
        //          -1875874926: 952
        //          -507020823: 917
        //          default: 1296
        //        }
        //   952: aload           4
        //   954: goto            958
        //   957: athrow         
        //   958: invokevirtual   java/io/InputStream.close:()V
        //   961: goto            965
        //   964: athrow         
        //   965: getstatic       dev/nuker/pyro/fc.0:I
        //   968: ifeq            977
        //   971: ldc_w           -1654169534
        //   974: goto            980
        //   977: ldc_w           -1187463839
        //   980: ldc_w           -405322269
        //   983: ixor           
        //   984: lookupswitch {
        //          1592785026: 1012
        //          2058364321: 977
        //          default: 1314
        //        }
        //  1012: aload_0        
        //  1013: new             Ldev/nuker/pyro/util/font/GameFontRenderer;
        //  1016: dup            
        //  1017: getstatic       dev/nuker/pyro/fc.c:I
        //  1020: ifge            1029
        //  1023: ldc_w           2014410305
        //  1026: goto            1032
        //  1029: ldc_w           -1686502285
        //  1032: ldc_w           1181322383
        //  1035: ixor           
        //  1036: lookupswitch {
        //          -585922308: 1064
        //          1048115918: 1029
        //          default: 1288
        //        }
        //  1064: aload           5
        //  1066: getstatic       dev/nuker/pyro/fc.1:I
        //  1069: ifeq            1078
        //  1072: ldc_w           -684336788
        //  1075: goto            1081
        //  1078: ldc_w           -170653400
        //  1081: ldc_w           1433774319
        //  1084: ixor           
        //  1085: lookupswitch {
        //          -2109705853: 1078
        //          -1600020025: 1112
        //          default: 1312
        //        }
        //  1112: aload_2        
        //  1113: goto            1117
        //  1116: athrow         
        //  1117: invokespecial   dev/nuker/pyro/util/font/GameFontRenderer.<init>:(Ljava/awt/Font;Ldev/nuker/pyro/api/FontManager$CustomFontConfig;)V
        //  1120: goto            1124
        //  1123: athrow         
        //  1124: putfield        dev/nuker/pyro/fy.2:Ldev/nuker/pyro/util/font/GameFontRenderer;
        //  1127: aload_0        
        //  1128: aload_2        
        //  1129: putfield        dev/nuker/pyro/fy.0:Ldev/nuker/pyro/api/FontManager$CustomFontConfig;
        //  1132: aload_3        
        //  1133: goto            1137
        //  1136: athrow         
        //  1137: invokevirtual   java/io/File.exists:()Z
        //  1140: goto            1144
        //  1143: athrow         
        //  1144: ifne            1242
        //  1147: new             Ljava/io/FileWriter;
        //  1150: dup            
        //  1151: aload_3        
        //  1152: goto            1156
        //  1155: athrow         
        //  1156: invokespecial   java/io/FileWriter.<init>:(Ljava/io/File;)V
        //  1159: goto            1163
        //  1162: athrow         
        //  1163: astore          6
        //  1165: getstatic       dev/nuker/pyro/fc.1:I
        //  1168: ifeq            1177
        //  1171: ldc_w           -1277001341
        //  1174: goto            1180
        //  1177: ldc_w           -515982638
        //  1180: ldc_w           -1023743942
        //  1183: ixor           
        //  1184: lookupswitch {
        //          600068840: 1212
        //          1897425337: 1177
        //          default: 1286
        //        }
        //  1212: getstatic       dev/nuker/pyro/Pyro.GSON:Lcom/google/gson/Gson;
        //  1215: aload_2        
        //  1216: aload           6
        //  1218: goto            1222
        //  1221: athrow         
        //  1222: invokevirtual   com/google/gson/Gson.toJson:(Ljava/lang/Object;Ljava/lang/Appendable;)V
        //  1225: goto            1229
        //  1228: athrow         
        //  1229: aload           6
        //  1231: goto            1235
        //  1234: athrow         
        //  1235: invokevirtual   java/io/FileWriter.close:()V
        //  1238: goto            1242
        //  1241: athrow         
        //  1242: iconst_1       
        //  1243: ireturn        
        //  1244: astore          4
        //  1246: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //  1249: ldc_w           "\u10e3\u148a\ub9d8\ub195\ufeab\ude95\ub207\ud5e8\udb3e\ude8e\u9411\u1e0c\ud2cd\uc7eb\ub611\uba0e\u57a8\u442d\ubf7f\uf73a\u1861\uc238\u593f\u2f06\ue0f4\u06b9\u7d26\ubac9\u8254\ubbaa\ub79d\ufb26"
        //  1252: goto            1256
        //  1255: athrow         
        //  1256: invokestatic    invokestatic   !!! ERROR
        //  1259: goto            1263
        //  1262: athrow         
        //  1263: goto            1267
        //  1266: athrow         
        //  1267: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //  1270: goto            1274
        //  1273: athrow         
        //  1274: iconst_0       
        //  1275: ireturn        
        //  1276: iconst_0       
        //  1277: ireturn        
        //  1278: aconst_null    
        //  1279: athrow         
        //  1280: aconst_null    
        //  1281: athrow         
        //  1282: aconst_null    
        //  1283: athrow         
        //  1284: aconst_null    
        //  1285: athrow         
        //  1286: aconst_null    
        //  1287: athrow         
        //  1288: aconst_null    
        //  1289: athrow         
        //  1290: aconst_null    
        //  1291: athrow         
        //  1292: aconst_null    
        //  1293: athrow         
        //  1294: aconst_null    
        //  1295: athrow         
        //  1296: aconst_null    
        //  1297: athrow         
        //  1298: aconst_null    
        //  1299: athrow         
        //  1300: aconst_null    
        //  1301: athrow         
        //  1302: aconst_null    
        //  1303: athrow         
        //  1304: aconst_null    
        //  1305: athrow         
        //  1306: aconst_null    
        //  1307: athrow         
        //  1308: aconst_null    
        //  1309: athrow         
        //  1310: aconst_null    
        //  1311: athrow         
        //  1312: aconst_null    
        //  1313: athrow         
        //  1314: aconst_null    
        //  1315: athrow         
        //  1316: pop            
        //  1317: goto            24
        //  1320: pop            
        //  1321: aconst_null    
        //  1322: goto            1316
        //  1325: dup            
        //  1326: ifnull          1316
        //  1329: checkcast       Ljava/lang/Throwable;
        //  1332: athrow         
        //  1333: dup            
        //  1334: ifnull          1320
        //  1337: checkcast       Ljava/lang/Throwable;
        //  1340: athrow         
        //  1341: aconst_null    
        //  1342: athrow         
        //    StackMapTable: 00 B4 43 07 00 16 04 FF 00 0B 00 00 00 01 07 00 16 FC 00 03 07 00 03 0B 42 01 1C FF 00 17 00 01 07 00 03 00 03 08 00 49 08 00 49 07 00 89 FF 00 02 00 01 07 00 03 00 04 08 00 49 08 00 49 07 00 89 01 FF 00 1C 00 01 07 00 03 00 03 08 00 49 08 00 49 07 00 89 42 07 00 16 FF 00 00 00 01 07 00 03 00 03 08 00 49 08 00 49 07 00 89 45 07 00 16 FF 00 00 00 01 07 00 03 00 03 08 00 49 08 00 49 07 00 89 FF 00 0B 00 01 07 00 03 00 03 08 00 49 08 00 49 07 00 89 FF 00 02 00 01 07 00 03 00 04 08 00 49 08 00 49 07 00 89 01 FF 00 1D 00 01 07 00 03 00 03 08 00 49 08 00 49 07 00 89 42 07 00 16 FF 00 00 00 01 07 00 03 00 03 08 00 49 08 00 49 07 00 89 45 07 00 16 40 07 00 AB FC 00 0C 07 00 AB 42 01 1C FF 00 03 00 00 00 01 07 00 16 FF 00 00 00 02 07 00 03 07 00 AB 00 01 07 00 AB 45 07 00 16 40 01 49 07 00 2B FF 00 00 00 02 07 00 03 07 00 AB 00 02 08 00 FB 08 00 FB 45 07 00 16 40 07 00 26 FF 00 0A 00 03 07 00 03 07 00 AB 07 00 26 00 01 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 26 00 03 08 01 0B 08 01 0B 07 00 89 45 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 26 00 03 08 01 0B 08 01 0B 07 00 89 42 07 00 16 FF 00 00 00 03 07 00 03 07 00 AB 07 00 26 00 03 08 01 0B 08 01 0B 07 00 89 45 07 00 16 40 07 00 AB FF 00 0D 00 04 07 00 03 07 00 AB 07 00 26 07 00 AB 00 01 07 00 AB FF 00 02 00 04 07 00 03 07 00 AB 07 00 26 07 00 AB 00 02 07 00 AB 01 5E 07 00 AB 42 07 00 16 40 07 00 AB 45 07 00 16 40 01 FF 00 13 00 04 07 00 03 07 00 AB 07 00 26 07 00 AB 00 03 08 01 66 08 01 66 07 00 AB FF 00 02 00 04 07 00 03 07 00 AB 07 00 26 07 00 AB 00 04 08 01 66 08 01 66 07 00 AB 01 FF 00 1D 00 04 07 00 03 07 00 AB 07 00 26 07 00 AB 00 03 08 01 66 08 01 66 07 00 AB 42 07 00 16 FF 00 00 00 04 07 00 03 07 00 AB 07 00 26 07 00 AB 00 03 08 01 66 08 01 66 07 00 AB 45 07 00 16 40 07 00 B6 FF 00 0B 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 B6 00 01 07 00 16 FF 00 00 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 B6 00 03 07 00 C8 07 00 B6 07 01 27 45 07 00 16 40 07 00 05 FF 00 08 00 00 00 01 07 00 16 FF 00 00 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 B6 00 01 07 00 B6 45 07 00 16 00 FF 00 02 00 04 07 00 03 07 00 AB 07 00 26 07 00 AB 00 01 07 00 9F 4B 07 00 9F FF 00 02 00 04 07 00 03 07 00 AB 07 00 26 07 00 AB 00 02 07 00 9F 01 5D 07 00 9F FC 00 0D 07 00 9F 42 01 1E FF 00 11 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 FF 00 02 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 9F 00 03 07 00 DD 07 00 89 01 FF 00 1E 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 42 07 00 A5 FF 00 00 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 45 07 00 16 FF 00 00 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 FF 00 0B 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 FF 00 02 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 9F 00 03 07 00 DD 07 00 89 01 FF 00 1D 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 42 07 00 16 FF 00 00 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 45 07 00 16 FA 00 00 FF 00 10 00 04 07 00 03 07 00 AB 07 00 26 07 00 AB 00 03 08 02 9F 08 02 9F 07 00 AB FF 00 02 00 04 07 00 03 07 00 AB 07 00 26 07 00 AB 00 04 08 02 9F 08 02 9F 07 00 AB 01 FF 00 1C 00 04 07 00 03 07 00 AB 07 00 26 07 00 AB 00 03 08 02 9F 08 02 9F 07 00 AB 42 07 00 16 FF 00 00 00 04 07 00 03 07 00 AB 07 00 26 07 00 AB 00 03 08 02 9F 08 02 9F 07 00 AB 45 07 00 16 40 07 01 4D FF 00 0E 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 00 01 01 FF 00 02 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 00 02 01 01 5E 01 FF 00 04 00 00 00 01 07 00 16 FF 00 00 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 00 02 01 07 01 4D 45 07 00 16 40 07 00 66 FC 00 0D 07 00 66 42 01 1D FF 00 0F 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 03 07 00 66 01 07 00 26 FF 00 02 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 04 07 00 66 01 07 00 26 01 FF 00 1C 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 03 07 00 66 01 07 00 26 46 07 00 A5 FF 00 00 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 03 07 00 66 01 02 45 07 00 16 40 07 00 66 0D 42 01 1F 44 07 00 16 40 07 01 4D 45 07 00 16 00 0B 42 01 1F FF 00 10 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 03 07 00 03 08 03 F5 08 03 F5 FF 00 02 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 04 07 00 03 08 03 F5 08 03 F5 01 FF 00 1F 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 03 07 00 03 08 03 F5 08 03 F5 FF 00 0D 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 04 07 00 03 08 03 F5 08 03 F5 07 00 66 FF 00 02 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 05 07 00 03 08 03 F5 08 03 F5 07 00 66 01 FF 00 1E 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 04 07 00 03 08 03 F5 08 03 F5 07 00 66 43 07 00 16 FF 00 00 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 05 07 00 03 08 03 F5 08 03 F5 07 00 66 07 00 26 45 07 00 16 FF 00 00 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 02 07 00 03 07 00 8E 4B 07 00 2D 40 07 00 AB 45 07 00 16 40 01 FF 00 0A 00 00 00 01 07 00 16 FF 00 00 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 03 08 04 7B 08 04 7B 07 00 AB 45 07 00 16 40 07 00 E2 FC 00 0D 07 00 E2 42 01 1F FF 00 08 00 00 00 01 07 00 16 FF 00 00 00 07 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 07 00 E2 00 03 07 00 C8 07 00 26 07 00 E2 45 07 00 16 00 FF 00 04 00 00 00 01 07 00 16 FF 00 00 00 07 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 07 00 E2 00 01 07 00 E2 45 07 00 16 FA 00 00 FF 00 01 00 04 07 00 03 07 00 AB 07 00 26 07 00 AB 00 01 07 00 29 FF 00 0A 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 29 00 01 07 00 3F FF 00 00 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 29 00 02 07 00 DD 07 00 89 45 07 00 16 FF 00 00 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 29 00 02 07 00 DD 07 00 89 FF 00 02 00 00 00 01 07 00 16 FF 00 00 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 29 00 02 07 00 DD 07 00 89 45 07 00 16 00 F8 00 01 FF 00 01 00 04 07 00 03 07 00 AB 07 00 26 07 00 AB 00 03 08 01 66 08 01 66 07 00 AB 41 07 00 9F FD 00 01 07 01 4D 07 00 66 FF 00 01 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 03 07 00 66 01 07 00 26 FC 00 01 07 00 E2 FF 00 01 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 03 07 00 03 08 03 F5 08 03 F5 FF 00 01 00 01 07 00 03 00 00 FF 00 01 00 04 07 00 03 07 00 AB 07 00 26 07 00 AB 00 03 08 02 9F 08 02 9F 07 00 AB FF 00 01 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 FF 00 01 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 00 FF 00 01 00 01 07 00 03 00 03 08 00 49 08 00 49 07 00 89 FF 00 01 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 00 01 01 FF 00 01 00 04 07 00 03 07 00 AB 07 00 26 07 00 AB 00 01 07 00 AB FF 00 01 00 01 07 00 03 00 03 08 00 49 08 00 49 07 00 89 FF 00 01 00 05 07 00 03 07 00 AB 07 00 26 07 00 AB 07 00 9F 00 02 07 00 DD 07 00 89 01 F8 00 01 FF 00 01 00 06 07 00 03 07 00 AB 07 00 26 07 00 AB 07 01 4D 07 00 66 00 04 07 00 03 08 03 F5 08 03 F5 07 00 66 01 FF 00 01 00 01 07 00 03 00 01 07 00 2B 43 05 44 07 00 2B 47 05 47 07 00 16
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  358    448    459    1310   Ljava/io/IOException;
        //  449    456    459    1310   Ljava/io/IOException;
        //  671    785    1244   1276   Ljava/lang/Exception;
        //  786    1155   1244   1276   Ljava/lang/Exception;
        //  1156   1221   1244   1276   Ljava/lang/Exception;
        //  1222   1234   1244   1276   Ljava/lang/Exception;
        //  1235   1243   1244   1276   Ljava/lang/Exception;
        //  8      20     1325   1333   Ljava/lang/NegativeArraySizeException;
        //  1325   1333   1325   1333   Ljava/lang/NumberFormatException;
        //  1341   1343   3      8      Any
        //  127    134    134    135    Any
        //  128    134    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  128    134    3      8      Any
        //  128    134    3      8      Any
        //  127    134    127    128    Any
        //  183    190    190    191    Any
        //  183    190    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  183    190    183    184    Ljava/util/ConcurrentModificationException;
        //  183    190    183    184    Any
        //  184    190    190    191    Any
        //  241    247    247    248    Any
        //  241    247    3      8      Any
        //  241    247    3      8      Any
        //  241    247    3      8      Ljava/util/ConcurrentModificationException;
        //  241    247    247    248    Any
        //  258    265    265    266    Any
        //  258    265    258    259    Ljava/lang/RuntimeException;
        //  259    265    265    266    Any
        //  258    265    265    266    Ljava/lang/IllegalArgumentException;
        //  259    265    265    266    Any
        //  277    284    284    285    Any
        //  277    284    3      8      Ljava/lang/ArithmeticException;
        //  278    284    3      8      Any
        //  277    284    3      8      Ljava/lang/NumberFormatException;
        //  277    284    277    278    Any
        //  288    295    295    296    Any
        //  289    295    3      8      Ljava/lang/AssertionError;
        //  289    295    288    289    Ljava/util/NoSuchElementException;
        //  289    295    288    289    Any
        //  288    295    295    296    Ljava/lang/AssertionError;
        //  347    354    354    355    Any
        //  347    354    347    348    Any
        //  347    354    3      8      Any
        //  348    354    354    355    Ljava/lang/EnumConstantNotPresentException;
        //  347    354    354    355    Any
        //  411    418    418    419    Any
        //  412    418    411    412    Any
        //  411    418    418    419    Any
        //  411    418    418    419    Any
        //  412    418    411    412    Any
        //  431    438    438    439    Any
        //  432    438    3      8      Ljava/lang/IllegalArgumentException;
        //  432    438    3      8      Ljava/lang/IllegalStateException;
        //  432    438    431    432    Any
        //  432    438    431    432    Any
        //  449    455    455    456    Any
        //  449    455    3      8      Ljava/lang/RuntimeException;
        //  449    455    3      8      Any
        //  449    455    3      8      Ljava/lang/IllegalArgumentException;
        //  449    455    3      8      Any
        //  607    614    614    615    Any
        //  608    614    614    615    Ljava/lang/IllegalArgumentException;
        //  608    614    607    608    Ljava/lang/NegativeArraySizeException;
        //  607    614    3      8      Any
        //  608    614    3      8      Any
        //  663    670    670    671    Any
        //  664    670    663    664    Ljava/lang/IndexOutOfBoundsException;
        //  663    670    663    664    Any
        //  663    670    3      8      Any
        //  663    670    3      8      Ljava/lang/ArithmeticException;
        //  723    730    730    731    Any
        //  723    730    730    731    Ljava/lang/NullPointerException;
        //  723    730    730    731    Any
        //  724    730    3      8      Ljava/lang/NegativeArraySizeException;
        //  724    730    723    724    Any
        //  786    792    792    793    Any
        //  786    792    3      8      Ljava/lang/IllegalArgumentException;
        //  786    792    3      8      Ljava/util/ConcurrentModificationException;
        //  786    792    792    793    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  786    792    3      8      Any
        //  895    902    902    903    Any
        //  895    902    3      8      Any
        //  895    902    902    903    Any
        //  896    902    895    896    Ljava/lang/NegativeArraySizeException;
        //  895    902    3      8      Ljava/lang/UnsupportedOperationException;
        //  957    964    964    965    Any
        //  958    964    957    958    Any
        //  958    964    3      8      Any
        //  958    964    957    958    Any
        //  957    964    3      8      Any
        //  1116   1123   1123   1124   Any
        //  1117   1123   1116   1117   Ljava/util/NoSuchElementException;
        //  1116   1123   1123   1124   Ljava/lang/UnsupportedOperationException;
        //  1116   1123   1116   1117   Any
        //  1116   1123   1116   1117   Any
        //  1136   1143   1143   1144   Any
        //  1136   1143   1143   1144   Any
        //  1137   1143   1143   1144   Ljava/lang/ClassCastException;
        //  1136   1143   1136   1137   Ljava/lang/StringIndexOutOfBoundsException;
        //  1137   1143   1136   1137   Ljava/lang/StringIndexOutOfBoundsException;
        //  1156   1162   1162   1163   Any
        //  1156   1162   1162   1163   Ljava/lang/ArithmeticException;
        //  1156   1162   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1156   1162   1162   1163   Any
        //  1156   1162   3      8      Any
        //  1222   1228   1228   1229   Any
        //  1222   1228   1228   1229   Any
        //  1222   1228   3      8      Any
        //  1222   1228   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1222   1228   1228   1229   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1235   1241   1241   1242   Any
        //  1235   1241   3      8      Any
        //  1235   1241   1241   1242   Ljava/lang/RuntimeException;
        //  1235   1241   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1235   1241   3      8      Any
        //  1255   1262   1262   1263   Any
        //  1256   1262   1262   1263   Any
        //  1255   1262   3      8      Any
        //  1255   1262   1255   1256   Ljava/lang/EnumConstantNotPresentException;
        //  1255   1262   3      8      Ljava/util/NoSuchElementException;
        //  1267   1273   1273   1274   Any
        //  1267   1273   3      8      Ljava/lang/ClassCastException;
        //  1267   1273   1273   1274   Any
        //  1267   1273   1273   1274   Any
        //  1267   1273   3      8      Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:577)
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
}
