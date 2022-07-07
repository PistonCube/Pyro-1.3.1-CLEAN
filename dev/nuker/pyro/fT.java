// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.gui.ClickGui$Window;
import com.google.gson.JsonObject;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class fT extends fH
{
    public fT(@NotNull final String s, @NotNull final String s2, @Nullable final String s3) {
        while (true) {
            int n = 0;
            Label_0015: {
                if (fc.c < 0) {
                    n = 1666402013;
                    break Label_0015;
                }
                n = -1882709894;
            }
            switch (n ^ 0xF5686524) {
                case -1774509063: {
                    continue;
                }
                case 2057323870: {
                    super(s, s2, s3);
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    static {
        throw t;
    }
    
    @Override
    public void c(@NotNull final JsonObject p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          631
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            623
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            615
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_0        
        //    27: getstatic       dev/nuker/pyro/fc.1:I
        //    30: ifeq            38
        //    33: ldc             340406353
        //    35: goto            40
        //    38: ldc             418785927
        //    40: ldc             -1892672699
        //    42: ixor           
        //    43: lookupswitch {
        //          -1686492396: 588
        //          343577033: 38
        //          default: 68
        //        }
        //    68: getfield        dev/nuker/pyro/fT.c:Ldev/nuker/pyro/fw;
        //    71: aload_1        
        //    72: ldc             "\u10fb\u149d\ub9ee\ub1ca\ufec8\udefd\ub220"
        //    74: getstatic       dev/nuker/pyro/fc.1:I
        //    77: ifeq            85
        //    80: ldc             713896015
        //    82: goto            87
        //    85: ldc             -711904830
        //    87: ldc             -1666869134
        //    89: ixor           
        //    90: lookupswitch {
        //          -1238849475: 602
        //          233175813: 85
        //          default: 116
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokestatic    invokestatic   !!! ERROR
        //   123: goto            127
        //   126: athrow         
        //   127: getstatic       dev/nuker/pyro/fc.0:I
        //   130: ifeq            138
        //   133: ldc             1068723581
        //   135: goto            140
        //   138: ldc             450746023
        //   140: ldc             813729975
        //   142: ixor           
        //   143: lookupswitch {
        //          255059402: 604
        //          809503022: 138
        //          default: 168
        //        }
        //   168: goto            172
        //   171: athrow         
        //   172: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   175: goto            179
        //   178: athrow         
        //   179: dup            
        //   180: pop            
        //   181: goto            185
        //   184: athrow         
        //   185: invokevirtual   com/google/gson/JsonElement.getAsBoolean:()Z
        //   188: goto            192
        //   191: athrow         
        //   192: getstatic       dev/nuker/pyro/fc.c:I
        //   195: ifge            203
        //   198: ldc             899776281
        //   200: goto            205
        //   203: ldc             -1314800024
        //   205: ldc             -638022405
        //   207: ixor           
        //   208: lookupswitch {
        //          -500713597: 203
        //          -329649182: 592
        //          default: 236
        //        }
        //   236: goto            240
        //   239: athrow         
        //   240: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   243: goto            247
        //   246: athrow         
        //   247: goto            251
        //   250: athrow         
        //   251: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   254: goto            258
        //   257: athrow         
        //   258: getstatic       dev/nuker/pyro/fc.0:I
        //   261: ifeq            269
        //   264: ldc             1059220812
        //   266: goto            271
        //   269: ldc             -1895688287
        //   271: ldc             331510733
        //   273: ixor           
        //   274: lookupswitch {
        //          -1390526644: 269
        //          752885377: 594
        //          default: 300
        //        }
        //   300: aload_0        
        //   301: getfield        dev/nuker/pyro/fT.0:Ldev/nuker/pyro/fw;
        //   304: getstatic       dev/nuker/pyro/fc.1:I
        //   307: ifeq            315
        //   310: ldc             1454000224
        //   312: goto            317
        //   315: ldc             -1039167971
        //   317: ldc             1420912118
        //   319: ixor           
        //   320: lookupswitch {
        //          35335574: 596
        //          1105851700: 315
        //          default: 348
        //        }
        //   348: aload_1        
        //   349: ldc             "\u10fb\u148b\ub9ff\ub1c9\ufeca\udefc\ub221\ud5c6"
        //   351: goto            355
        //   354: athrow         
        //   355: invokestatic    invokestatic   !!! ERROR
        //   358: goto            362
        //   361: athrow         
        //   362: goto            366
        //   365: athrow         
        //   366: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   369: goto            373
        //   372: athrow         
        //   373: dup            
        //   374: pop            
        //   375: goto            379
        //   378: athrow         
        //   379: invokevirtual   com/google/gson/JsonElement.getAsBoolean:()Z
        //   382: goto            386
        //   385: athrow         
        //   386: goto            390
        //   389: athrow         
        //   390: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   393: goto            397
        //   396: athrow         
        //   397: getstatic       dev/nuker/pyro/fc.0:I
        //   400: ifeq            408
        //   403: ldc             1881494846
        //   405: goto            410
        //   408: ldc             -2106074381
        //   410: ldc             -816063666
        //   412: ixor           
        //   413: lookupswitch {
        //          -1082225040: 598
        //          -300707035: 408
        //          default: 440
        //        }
        //   440: goto            444
        //   443: athrow         
        //   444: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   447: goto            451
        //   450: athrow         
        //   451: aload_0        
        //   452: getstatic       dev/nuker/pyro/fc.c:I
        //   455: ifge            463
        //   458: ldc             1246026144
        //   460: goto            465
        //   463: ldc             -1779737194
        //   465: ldc             -1996689009
        //   467: ixor           
        //   468: lookupswitch {
        //          -1028118481: 463
        //          488090649: 496
        //          default: 600
        //        }
        //   496: aload_1        
        //   497: ldc             "\u10f5\u1496\ub9f6\ub1ca\ufecd\udef6\ub220"
        //   499: goto            503
        //   502: athrow         
        //   503: invokestatic    invokestatic   !!! ERROR
        //   506: goto            510
        //   509: athrow         
        //   510: goto            514
        //   513: athrow         
        //   514: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   517: goto            521
        //   520: athrow         
        //   521: dup            
        //   522: pop            
        //   523: goto            527
        //   526: athrow         
        //   527: invokevirtual   com/google/gson/JsonElement.getAsInt:()I
        //   530: goto            534
        //   533: athrow         
        //   534: getstatic       dev/nuker/pyro/fc.c:I
        //   537: ifge            545
        //   540: ldc             -1773249098
        //   542: goto            547
        //   545: ldc             -1294090199
        //   547: ldc             964068696
        //   549: ixor           
        //   550: lookupswitch {
        //          -1951709839: 576
        //          -1355228946: 545
        //          default: 590
        //        }
        //   576: goto            580
        //   579: athrow         
        //   580: invokevirtual   dev/nuker/pyro/fT.1:(I)V
        //   583: goto            587
        //   586: athrow         
        //   587: return         
        //   588: aconst_null    
        //   589: athrow         
        //   590: aconst_null    
        //   591: athrow         
        //   592: aconst_null    
        //   593: athrow         
        //   594: aconst_null    
        //   595: athrow         
        //   596: aconst_null    
        //   597: athrow         
        //   598: aconst_null    
        //   599: athrow         
        //   600: aconst_null    
        //   601: athrow         
        //   602: aconst_null    
        //   603: athrow         
        //   604: aconst_null    
        //   605: athrow         
        //   606: pop            
        //   607: goto            24
        //   610: pop            
        //   611: aconst_null    
        //   612: goto            606
        //   615: dup            
        //   616: ifnull          606
        //   619: checkcast       Ljava/lang/Throwable;
        //   622: athrow         
        //   623: dup            
        //   624: ifnull          610
        //   627: checkcast       Ljava/lang/Throwable;
        //   630: athrow         
        //   631: aconst_null    
        //   632: athrow         
        //    StackMapTable: 00 65 43 07 00 32 04 FF 00 0B 00 00 00 01 07 00 32 FD 00 03 07 00 03 07 00 4A 4D 07 00 03 FF 00 01 00 02 07 00 03 07 00 4A 00 02 07 00 03 01 5B 07 00 03 FF 00 10 00 02 07 00 03 07 00 4A 00 03 07 00 5F 07 00 4A 07 00 80 FF 00 01 00 02 07 00 03 07 00 4A 00 04 07 00 5F 07 00 4A 07 00 80 01 FF 00 1C 00 02 07 00 03 07 00 4A 00 03 07 00 5F 07 00 4A 07 00 80 42 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 03 07 00 5F 07 00 4A 07 00 80 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 03 07 00 5F 07 00 4A 07 00 80 FF 00 0A 00 02 07 00 03 07 00 4A 00 03 07 00 5F 07 00 4A 07 00 80 FF 00 01 00 02 07 00 03 07 00 4A 00 04 07 00 5F 07 00 4A 07 00 80 01 FF 00 1B 00 02 07 00 03 07 00 4A 00 03 07 00 5F 07 00 4A 07 00 80 42 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 03 07 00 5F 07 00 4A 07 00 80 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 5F 07 00 50 44 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 5F 07 00 50 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 5F 01 FF 00 0A 00 02 07 00 03 07 00 4A 00 02 07 00 5F 01 FF 00 01 00 02 07 00 03 07 00 4A 00 03 07 00 5F 01 01 FF 00 1E 00 02 07 00 03 07 00 4A 00 02 07 00 5F 01 42 07 00 1B FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 5F 01 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 5F 07 00 59 42 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 5F 07 00 59 45 07 00 32 00 0A 41 01 1C 4E 07 00 5F FF 00 01 00 02 07 00 03 07 00 4A 00 02 07 00 5F 01 5E 07 00 5F 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 03 07 00 5F 07 00 4A 07 00 80 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 03 07 00 5F 07 00 4A 07 00 80 42 07 00 25 FF 00 00 00 02 07 00 03 07 00 4A 00 03 07 00 5F 07 00 4A 07 00 80 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 5F 07 00 50 44 07 00 21 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 5F 07 00 50 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 5F 01 FF 00 02 00 00 00 01 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 5F 01 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 5F 07 00 59 FF 00 0A 00 02 07 00 03 07 00 4A 00 02 07 00 5F 07 00 59 FF 00 01 00 02 07 00 03 07 00 4A 00 03 07 00 5F 07 00 59 01 FF 00 1D 00 02 07 00 03 07 00 4A 00 02 07 00 5F 07 00 59 FF 00 02 00 00 00 01 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 5F 07 00 59 45 07 00 32 00 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 4A 00 02 07 00 03 01 5E 07 00 03 45 07 00 19 FF 00 00 00 02 07 00 03 07 00 4A 00 03 07 00 03 07 00 4A 07 00 80 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 03 07 00 03 07 00 4A 07 00 80 42 07 00 2B FF 00 00 00 02 07 00 03 07 00 4A 00 03 07 00 03 07 00 4A 07 00 80 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 03 07 00 50 44 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 03 07 00 50 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 03 01 FF 00 0A 00 02 07 00 03 07 00 4A 00 02 07 00 03 01 FF 00 01 00 02 07 00 03 07 00 4A 00 03 07 00 03 01 01 FF 00 1C 00 02 07 00 03 07 00 4A 00 02 07 00 03 01 42 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 03 01 45 07 00 32 00 40 07 00 03 FF 00 01 00 02 07 00 03 07 00 4A 00 02 07 00 03 01 FF 00 01 00 02 07 00 03 07 00 4A 00 02 07 00 5F 01 01 41 07 00 5F FF 00 01 00 02 07 00 03 07 00 4A 00 02 07 00 5F 07 00 59 41 07 00 03 FF 00 01 00 02 07 00 03 07 00 4A 00 03 07 00 5F 07 00 4A 07 00 80 FF 00 01 00 02 07 00 03 07 00 4A 00 03 07 00 5F 07 00 4A 07 00 80 41 07 00 32 43 05 44 07 00 32 47 05 47 07 00 32
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     615    623    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  615    623    615    623    Any
        //  631    633    3      8      Ljava/lang/NumberFormatException;
        //  119    126    126    127    Any
        //  120    126    3      8      Ljava/lang/AssertionError;
        //  120    126    126    127    Any
        //  119    126    119    120    Ljava/lang/StringIndexOutOfBoundsException;
        //  119    126    119    120    Any
        //  171    178    178    179    Any
        //  171    178    178    179    Ljava/lang/AssertionError;
        //  171    178    3      8      Any
        //  172    178    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  171    178    171    172    Any
        //  184    191    191    192    Any
        //  184    191    191    192    Ljava/lang/NumberFormatException;
        //  184    191    3      8      Ljava/lang/UnsupportedOperationException;
        //  184    191    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  185    191    184    185    Any
        //  239    246    246    247    Any
        //  240    246    246    247    Ljava/lang/ClassCastException;
        //  239    246    246    247    Any
        //  240    246    3      8      Ljava/lang/RuntimeException;
        //  240    246    239    240    Ljava/lang/NumberFormatException;
        //  250    257    257    258    Any
        //  251    257    250    251    Any
        //  251    257    250    251    Ljava/lang/StringIndexOutOfBoundsException;
        //  250    257    3      8      Any
        //  250    257    257    258    Ljava/lang/RuntimeException;
        //  354    361    361    362    Any
        //  355    361    361    362    Any
        //  354    361    361    362    Any
        //  355    361    3      8      Ljava/lang/UnsupportedOperationException;
        //  354    361    354    355    Any
        //  365    372    372    373    Any
        //  365    372    372    373    Ljava/lang/UnsupportedOperationException;
        //  365    372    3      8      Any
        //  365    372    372    373    Any
        //  366    372    365    366    Ljava/lang/ClassCastException;
        //  378    385    385    386    Any
        //  379    385    378    379    Ljava/lang/EnumConstantNotPresentException;
        //  379    385    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  378    385    3      8      Any
        //  379    385    385    386    Any
        //  390    396    396    397    Any
        //  390    396    396    397    Any
        //  390    396    396    397    Ljava/lang/EnumConstantNotPresentException;
        //  390    396    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  390    396    3      8      Any
        //  444    450    450    451    Any
        //  444    450    450    451    Ljava/lang/NullPointerException;
        //  444    450    450    451    Any
        //  444    450    3      8      Any
        //  444    450    3      8      Ljava/lang/UnsupportedOperationException;
        //  502    509    509    510    Any
        //  503    509    509    510    Any
        //  503    509    502    503    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  503    509    509    510    Ljava/lang/AssertionError;
        //  502    509    509    510    Ljava/lang/AssertionError;
        //  513    520    520    521    Any
        //  514    520    3      8      Any
        //  513    520    520    521    Any
        //  513    520    3      8      Any
        //  514    520    513    514    Ljava/lang/IllegalStateException;
        //  526    533    533    534    Any
        //  527    533    3      8      Ljava/lang/IllegalArgumentException;
        //  526    533    526    527    Ljava/lang/StringIndexOutOfBoundsException;
        //  527    533    526    527    Any
        //  527    533    3      8      Any
        //  579    586    586    587    Any
        //  579    586    579    580    Any
        //  580    586    3      8      Any
        //  579    586    3      8      Ljava/lang/ClassCastException;
        //  579    586    579    580    Ljava/lang/RuntimeException;
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
    
    public void c() {
        fbS.di(this, 1298860022);
    }
    
    @NotNull
    @Override
    public JsonObject 4() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          349
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            341
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            333
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lcom/google/gson/JsonObject;
        //    27: dup            
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   com/google/gson/JsonObject.<init>:()V
        //    35: goto            39
        //    38: athrow         
        //    39: astore_1       
        //    40: getstatic       dev/nuker/pyro/fc.0:I
        //    43: ifeq            51
        //    46: ldc             1714100936
        //    48: goto            53
        //    51: ldc             1999408466
        //    53: ldc             -447156658
        //    55: ixor           
        //    56: lookupswitch {
        //          -2089552762: 320
        //          -1648885648: 51
        //          default: 84
        //        }
        //    84: aload_1        
        //    85: ldc             "\u10fb\u149d\ub9ee\ub19d\ufd1f\udefd\ub220"
        //    87: goto            91
        //    90: athrow         
        //    91: invokestatic    invokestatic   !!! ERROR
        //    94: goto            98
        //    97: athrow         
        //    98: new             Lcom/google/gson/JsonPrimitive;
        //   101: dup            
        //   102: aload_0        
        //   103: getfield        dev/nuker/pyro/fT.c:Ldev/nuker/pyro/fw;
        //   106: goto            110
        //   109: athrow         
        //   110: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   113: goto            117
        //   116: athrow         
        //   117: checkcast       Ljava/lang/Boolean;
        //   120: goto            124
        //   123: athrow         
        //   124: invokespecial   com/google/gson/JsonPrimitive.<init>:(Ljava/lang/Boolean;)V
        //   127: goto            131
        //   130: athrow         
        //   131: checkcast       Lcom/google/gson/JsonElement;
        //   134: goto            138
        //   137: athrow         
        //   138: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   141: goto            145
        //   144: athrow         
        //   145: aload_1        
        //   146: ldc             "\u10fb\u148b\ub9ff\ub19e\ufd1d\udefc\ub221\ud5c6"
        //   148: goto            152
        //   151: athrow         
        //   152: invokestatic    invokestatic   !!! ERROR
        //   155: goto            159
        //   158: athrow         
        //   159: new             Lcom/google/gson/JsonPrimitive;
        //   162: dup            
        //   163: aload_0        
        //   164: getfield        dev/nuker/pyro/fT.0:Ldev/nuker/pyro/fw;
        //   167: goto            171
        //   170: athrow         
        //   171: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   174: goto            178
        //   177: athrow         
        //   178: checkcast       Ljava/lang/Boolean;
        //   181: getstatic       dev/nuker/pyro/fc.1:I
        //   184: ifeq            192
        //   187: ldc             517746883
        //   189: goto            194
        //   192: ldc             688692923
        //   194: ldc             1826266172
        //   196: ixor           
        //   197: lookupswitch {
        //          374212239: 192
        //          1913040127: 322
        //          default: 224
        //        }
        //   224: goto            228
        //   227: athrow         
        //   228: invokespecial   com/google/gson/JsonPrimitive.<init>:(Ljava/lang/Boolean;)V
        //   231: goto            235
        //   234: athrow         
        //   235: checkcast       Lcom/google/gson/JsonElement;
        //   238: goto            242
        //   241: athrow         
        //   242: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   245: goto            249
        //   248: athrow         
        //   249: aload_1        
        //   250: ldc             "\u10f5\u1496\ub9f6\ub19d\ufd1a\udef6\ub220"
        //   252: goto            256
        //   255: athrow         
        //   256: invokestatic    invokestatic   !!! ERROR
        //   259: goto            263
        //   262: athrow         
        //   263: new             Lcom/google/gson/JsonPrimitive;
        //   266: dup            
        //   267: aload_0        
        //   268: goto            272
        //   271: athrow         
        //   272: invokevirtual   dev/nuker/pyro/fT.7:()I
        //   275: goto            279
        //   278: athrow         
        //   279: goto            283
        //   282: athrow         
        //   283: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   286: goto            290
        //   289: athrow         
        //   290: checkcast       Ljava/lang/Number;
        //   293: goto            297
        //   296: athrow         
        //   297: invokespecial   com/google/gson/JsonPrimitive.<init>:(Ljava/lang/Number;)V
        //   300: goto            304
        //   303: athrow         
        //   304: checkcast       Lcom/google/gson/JsonElement;
        //   307: goto            311
        //   310: athrow         
        //   311: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   314: goto            318
        //   317: athrow         
        //   318: aload_1        
        //   319: areturn        
        //   320: aconst_null    
        //   321: athrow         
        //   322: aconst_null    
        //   323: athrow         
        //   324: pop            
        //   325: goto            24
        //   328: pop            
        //   329: aconst_null    
        //   330: goto            324
        //   333: dup            
        //   334: ifnull          324
        //   337: checkcast       Ljava/lang/Throwable;
        //   340: athrow         
        //   341: dup            
        //   342: ifnull          328
        //   345: checkcast       Ljava/lang/Throwable;
        //   348: athrow         
        //   349: aconst_null    
        //   350: athrow         
        //    StackMapTable: 00 49 43 07 00 32 04 FF 00 0B 00 00 00 01 07 00 32 FC 00 03 07 00 03 FF 00 06 00 00 00 01 07 00 32 FF 00 00 00 01 07 00 03 00 02 08 00 18 08 00 18 45 07 00 32 40 07 00 4A FC 00 0B 07 00 4A 41 01 1E 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 4A 07 00 80 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 4A 07 00 80 4A 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 05 07 00 4A 07 00 80 08 00 62 08 00 62 07 00 5F 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 05 07 00 4A 07 00 80 08 00 62 08 00 62 07 00 B9 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 05 07 00 4A 07 00 80 08 00 62 08 00 62 07 00 59 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 03 07 00 4A 07 00 80 07 00 99 45 07 00 27 FF 00 00 00 02 07 00 03 07 00 4A 00 03 07 00 4A 07 00 80 07 00 50 45 07 00 32 00 FF 00 05 00 00 00 01 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 4A 07 00 80 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 4A 07 00 80 4A 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 05 07 00 4A 07 00 80 08 00 9F 08 00 9F 07 00 5F 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 05 07 00 4A 07 00 80 08 00 9F 08 00 9F 07 00 B9 FF 00 0D 00 02 07 00 03 07 00 4A 00 05 07 00 4A 07 00 80 08 00 9F 08 00 9F 07 00 59 FF 00 01 00 02 07 00 03 07 00 4A 00 06 07 00 4A 07 00 80 08 00 9F 08 00 9F 07 00 59 01 FF 00 1D 00 02 07 00 03 07 00 4A 00 05 07 00 4A 07 00 80 08 00 9F 08 00 9F 07 00 59 42 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 05 07 00 4A 07 00 80 08 00 9F 08 00 9F 07 00 59 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 03 07 00 4A 07 00 80 07 00 99 FF 00 05 00 00 00 01 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 03 07 00 4A 07 00 80 07 00 50 45 07 00 32 00 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 4A 07 00 80 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 02 07 00 4A 07 00 80 47 07 00 8C FF 00 00 00 02 07 00 03 07 00 4A 00 05 07 00 4A 07 00 80 08 01 07 08 01 07 07 00 03 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 05 07 00 4A 07 00 80 08 01 07 08 01 07 01 FF 00 02 00 00 00 01 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 05 07 00 4A 07 00 80 08 01 07 08 01 07 01 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 05 07 00 4A 07 00 80 08 01 07 08 01 07 07 00 AF 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 05 07 00 4A 07 00 80 08 01 07 08 01 07 07 00 B4 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 03 07 00 4A 07 00 80 07 00 99 45 07 00 27 FF 00 00 00 02 07 00 03 07 00 4A 00 03 07 00 4A 07 00 80 07 00 50 45 07 00 32 00 01 FF 00 01 00 02 07 00 03 07 00 4A 00 05 07 00 4A 07 00 80 08 00 9F 08 00 9F 07 00 59 FF 00 01 00 01 07 00 03 00 01 07 00 27 43 05 44 07 00 27 47 05 47 07 00 32
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     333    341    Ljava/lang/IllegalArgumentException;
        //  333    341    333    341    Ljava/lang/UnsupportedOperationException;
        //  349    351    3      8      Ljava/lang/NegativeArraySizeException;
        //  32     38     38     39     Any
        //  32     38     3      8      Any
        //  32     38     3      8      Ljava/lang/NullPointerException;
        //  32     38     3      8      Ljava/lang/IllegalStateException;
        //  32     38     3      8      Any
        //  90     97     97     98     Any
        //  90     97     90     91     Any
        //  90     97     3      8      Any
        //  91     97     97     98     Any
        //  90     97     3      8      Ljava/lang/ClassCastException;
        //  109    116    116    117    Any
        //  109    116    109    110    Any
        //  109    116    109    110    Any
        //  109    116    109    110    Ljava/lang/NumberFormatException;
        //  109    116    109    110    Any
        //  123    130    130    131    Any
        //  124    130    3      8      Any
        //  124    130    3      8      Any
        //  123    130    123    124    Any
        //  124    130    130    131    Ljava/lang/NumberFormatException;
        //  137    144    144    145    Any
        //  137    144    144    145    Any
        //  137    144    137    138    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  138    144    144    145    Any
        //  137    144    137    138    Ljava/util/NoSuchElementException;
        //  152    158    158    159    Any
        //  152    158    3      8      Any
        //  152    158    158    159    Any
        //  152    158    158    159    Ljava/lang/EnumConstantNotPresentException;
        //  152    158    3      8      Ljava/lang/IllegalArgumentException;
        //  170    177    177    178    Any
        //  171    177    3      8      Any
        //  171    177    170    171    Any
        //  170    177    177    178    Ljava/lang/EnumConstantNotPresentException;
        //  171    177    3      8      Ljava/lang/IllegalStateException;
        //  227    234    234    235    Any
        //  227    234    227    228    Ljava/lang/IllegalArgumentException;
        //  228    234    227    228    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  227    234    227    228    Any
        //  228    234    3      8      Any
        //  242    248    248    249    Any
        //  242    248    248    249    Any
        //  242    248    248    249    Any
        //  242    248    3      8      Any
        //  242    248    3      8      Any
        //  255    262    262    263    Any
        //  256    262    255    256    Any
        //  256    262    255    256    Ljava/lang/EnumConstantNotPresentException;
        //  256    262    255    256    Any
        //  255    262    255    256    Ljava/lang/EnumConstantNotPresentException;
        //  271    278    278    279    Any
        //  272    278    3      8      Ljava/lang/ArithmeticException;
        //  272    278    3      8      Ljava/lang/ClassCastException;
        //  271    278    271    272    Ljava/lang/NegativeArraySizeException;
        //  272    278    278    279    Any
        //  283    289    289    290    Any
        //  283    289    3      8      Ljava/lang/NumberFormatException;
        //  283    289    3      8      Ljava/lang/ClassCastException;
        //  283    289    3      8      Ljava/lang/RuntimeException;
        //  283    289    3      8      Any
        //  296    303    303    304    Any
        //  297    303    296    297    Any
        //  296    303    296    297    Any
        //  297    303    3      8      Any
        //  297    303    3      8      Any
        //  310    317    317    318    Any
        //  311    317    317    318    Ljava/lang/AssertionError;
        //  311    317    310    311    Ljava/lang/EnumConstantNotPresentException;
        //  311    317    3      8      Any
        //  310    317    310    311    Ljava/lang/ArithmeticException;
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
    
    @Override
    public void c(@NotNull final ClickGui$Window p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          212
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            204
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            196
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             -59114859
        //    32: goto            37
        //    35: ldc             918818725
        //    37: ldc             405488870
        //    39: ixor           
        //    40: lookupswitch {
        //          -464339341: 35
        //          787434307: 68
        //          default: 183
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_0        
        //    71: goto            75
        //    74: athrow         
        //    75: invokevirtual   dev/nuker/pyro/fT.c:()V
        //    78: goto            82
        //    81: athrow         
        //    82: getstatic       dev/nuker/pyro/fc.1:I
        //    85: ifeq            93
        //    88: ldc             525256777
        //    90: goto            95
        //    93: ldc             -214899605
        //    95: ldc             2114213198
        //    97: ixor           
        //    98: lookupswitch {
        //          1032904350: 93
        //          1632279815: 181
        //          default: 124
        //        }
        //   124: aload_0        
        //   125: getstatic       dev/nuker/pyro/fc.1:I
        //   128: ifeq            136
        //   131: ldc             -2136849256
        //   133: goto            138
        //   136: ldc             704775315
        //   138: ldc             -374254922
        //   140: ixor           
        //   141: lookupswitch {
        //          563162389: 136
        //          1762858542: 185
        //          default: 168
        //        }
        //   168: aload_1        
        //   169: goto            173
        //   172: athrow         
        //   173: invokespecial   dev/nuker/pyro/fH.c:(Ldev/nuker/pyro/gui/ClickGui$Window;)V
        //   176: goto            180
        //   179: athrow         
        //   180: return         
        //   181: aconst_null    
        //   182: athrow         
        //   183: aconst_null    
        //   184: athrow         
        //   185: aconst_null    
        //   186: athrow         
        //   187: pop            
        //   188: goto            24
        //   191: pop            
        //   192: aconst_null    
        //   193: goto            187
        //   196: dup            
        //   197: ifnull          187
        //   200: checkcast       Ljava/lang/Throwable;
        //   203: athrow         
        //   204: dup            
        //   205: ifnull          191
        //   208: checkcast       Ljava/lang/Throwable;
        //   211: athrow         
        //   212: aconst_null    
        //   213: athrow         
        //    StackMapTable: 00 1D 43 07 00 27 04 FF 00 0B 00 00 00 01 07 00 32 FD 00 03 07 00 03 07 00 CB 0A 41 01 1E 45 07 00 32 40 07 00 03 45 07 00 32 00 0A 41 01 1C 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 CB 00 02 07 00 03 01 5D 07 00 03 43 07 00 32 FF 00 00 00 02 07 00 03 07 00 CB 00 02 07 00 03 07 00 CB 45 07 00 32 00 00 01 41 07 00 03 41 07 00 27 43 05 44 07 00 27 47 05 47 07 00 27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     196    204    Ljava/lang/NegativeArraySizeException;
        //  196    204    196    204    Ljava/lang/IllegalStateException;
        //  212    214    3      8      Ljava/lang/ArithmeticException;
        //  74     81     81     82     Any
        //  75     81     81     82     Any
        //  74     81     74     75     Any
        //  75     81     74     75     Any
        //  75     81     3      8      Ljava/util/NoSuchElementException;
        //  172    179    179    180    Any
        //  173    179    172    173    Any
        //  173    179    179    180    Any
        //  172    179    179    180    Ljava/util/ConcurrentModificationException;
        //  173    179    3      8      Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 71 out of bounds for length 71
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
}
