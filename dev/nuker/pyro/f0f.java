// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;
import kotlin.jvm.JvmField;

public class f0F extends f0P
{
    @JvmField
    @NotNull
    public fw<Object> c;
    public String c;
    public Enum[] c;
    public String 0;
    public double c;
    public boolean c;
    
    @Override
    public int 0(@NotNull final f0w p0, @NotNull final f0y p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          298
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            290
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            282
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_2        
        //    27: pop            
        //    28: aload_1        
        //    29: goto            33
        //    32: athrow         
        //    33: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //    36: goto            40
        //    39: athrow         
        //    40: new             Ljava/lang/StringBuilder;
        //    43: dup            
        //    44: goto            48
        //    47: athrow         
        //    48: invokespecial   java/lang/StringBuilder.<init>:()V
        //    51: goto            55
        //    54: athrow         
        //    55: getstatic       dev/nuker/pyro/fc.c:I
        //    58: ifge            66
        //    61: ldc             -27692171
        //    63: goto            68
        //    66: ldc             1415863700
        //    68: ldc             360334583
        //    70: ixor           
        //    71: lookupswitch {
        //          -350013566: 66
        //          1092491619: 96
        //          default: 267
        //        }
        //    96: aload_0        
        //    97: getfield        dev/nuker/pyro/f0F.c:Ljava/lang/String;
        //   100: getstatic       dev/nuker/pyro/fc.1:I
        //   103: ifeq            111
        //   106: ldc             483266600
        //   108: goto            113
        //   111: ldc             -1454651720
        //   113: ldc             1851060399
        //   115: ixor           
        //   116: lookupswitch {
        //          -2010633885: 111
        //          1922752647: 269
        //          default: 144
        //        }
        //   144: goto            148
        //   147: athrow         
        //   148: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   151: goto            155
        //   154: athrow         
        //   155: ldc             "\u2354\u14d3"
        //   157: goto            161
        //   160: athrow         
        //   161: invokestatic    invokestatic   !!! ERROR
        //   164: goto            168
        //   167: athrow         
        //   168: goto            172
        //   171: athrow         
        //   172: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   175: goto            179
        //   178: athrow         
        //   179: aload_0        
        //   180: getstatic       dev/nuker/pyro/fc.0:I
        //   183: ifeq            191
        //   186: ldc             -952097768
        //   188: goto            193
        //   191: ldc             -493194857
        //   193: ldc             282277350
        //   195: ixor           
        //   196: lookupswitch {
        //          -678227458: 271
        //          744137460: 191
        //          default: 224
        //        }
        //   224: getfield        dev/nuker/pyro/f0F.0:Ljava/lang/String;
        //   227: goto            231
        //   230: athrow         
        //   231: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   234: goto            238
        //   237: athrow         
        //   238: goto            242
        //   241: athrow         
        //   242: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   245: goto            249
        //   248: athrow         
        //   249: goto            253
        //   252: athrow         
        //   253: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78256_a:(Ljava/lang/String;)I
        //   256: goto            260
        //   259: athrow         
        //   260: getstatic       dev/nuker/pyro/f0y.c:I
        //   263: iconst_2       
        //   264: imul           
        //   265: iadd           
        //   266: ireturn        
        //   267: aconst_null    
        //   268: athrow         
        //   269: aconst_null    
        //   270: athrow         
        //   271: aconst_null    
        //   272: athrow         
        //   273: pop            
        //   274: goto            24
        //   277: pop            
        //   278: aconst_null    
        //   279: goto            273
        //   282: dup            
        //   283: ifnull          273
        //   286: checkcast       Ljava/lang/Throwable;
        //   289: athrow         
        //   290: dup            
        //   291: ifnull          277
        //   294: checkcast       Ljava/lang/Throwable;
        //   297: athrow         
        //   298: aconst_null    
        //   299: athrow         
        //    StackMapTable: 00 35 43 07 00 2E 04 FF 00 0B 00 00 00 01 07 00 2E FE 00 03 07 00 03 07 00 30 07 00 62 FF 00 07 00 00 00 01 07 00 2E FF 00 00 00 03 07 00 03 07 00 30 07 00 62 00 01 07 00 30 45 07 00 2E 40 07 00 5C 46 07 00 2E FF 00 00 00 03 07 00 03 07 00 30 07 00 62 00 03 07 00 5C 08 00 28 08 00 28 45 07 00 2E FF 00 00 00 03 07 00 03 07 00 30 07 00 62 00 02 07 00 5C 07 00 36 FF 00 0A 00 03 07 00 03 07 00 30 07 00 62 00 02 07 00 5C 07 00 36 FF 00 01 00 03 07 00 03 07 00 30 07 00 62 00 03 07 00 5C 07 00 36 01 FF 00 1B 00 03 07 00 03 07 00 30 07 00 62 00 02 07 00 5C 07 00 36 FF 00 0E 00 03 07 00 03 07 00 30 07 00 62 00 03 07 00 5C 07 00 36 07 00 65 FF 00 01 00 03 07 00 03 07 00 30 07 00 62 00 04 07 00 5C 07 00 36 07 00 65 01 FF 00 1E 00 03 07 00 03 07 00 30 07 00 62 00 03 07 00 5C 07 00 36 07 00 65 42 07 00 2E FF 00 00 00 03 07 00 03 07 00 30 07 00 62 00 03 07 00 5C 07 00 36 07 00 65 45 07 00 2E FF 00 00 00 03 07 00 03 07 00 30 07 00 62 00 02 07 00 5C 07 00 36 44 07 00 1D FF 00 00 00 03 07 00 03 07 00 30 07 00 62 00 03 07 00 5C 07 00 36 07 00 65 45 07 00 2E FF 00 00 00 03 07 00 03 07 00 30 07 00 62 00 03 07 00 5C 07 00 36 07 00 65 FF 00 02 00 00 00 01 07 00 2E FF 00 00 00 03 07 00 03 07 00 30 07 00 62 00 03 07 00 5C 07 00 36 07 00 65 45 07 00 2E FF 00 00 00 03 07 00 03 07 00 30 07 00 62 00 02 07 00 5C 07 00 36 FF 00 0B 00 03 07 00 03 07 00 30 07 00 62 00 03 07 00 5C 07 00 36 07 00 03 FF 00 01 00 03 07 00 03 07 00 30 07 00 62 00 04 07 00 5C 07 00 36 07 00 03 01 FF 00 1E 00 03 07 00 03 07 00 30 07 00 62 00 03 07 00 5C 07 00 36 07 00 03 FF 00 05 00 00 00 01 07 00 2E FF 00 00 00 03 07 00 03 07 00 30 07 00 62 00 03 07 00 5C 07 00 36 07 00 65 45 07 00 2E FF 00 00 00 03 07 00 03 07 00 30 07 00 62 00 02 07 00 5C 07 00 36 42 07 00 2E FF 00 00 00 03 07 00 03 07 00 30 07 00 62 00 02 07 00 5C 07 00 36 45 07 00 2E FF 00 00 00 03 07 00 03 07 00 30 07 00 62 00 02 07 00 5C 07 00 65 42 07 00 2E FF 00 00 00 03 07 00 03 07 00 30 07 00 62 00 02 07 00 5C 07 00 65 45 07 00 2E 40 01 FF 00 06 00 03 07 00 03 07 00 30 07 00 62 00 02 07 00 5C 07 00 36 FF 00 01 00 03 07 00 03 07 00 30 07 00 62 00 03 07 00 5C 07 00 36 07 00 65 FF 00 01 00 03 07 00 03 07 00 30 07 00 62 00 03 07 00 5C 07 00 36 07 00 03 41 07 00 13 43 05 44 07 00 13 47 05 47 07 00 2E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     282    290    Ljava/lang/RuntimeException;
        //  282    290    282    290    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  298    300    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  33     39     39     40     Any
        //  33     39     39     40     Ljava/lang/IllegalArgumentException;
        //  33     39     3      8      Any
        //  33     39     3      8      Any
        //  33     39     39     40     Any
        //  47     54     54     55     Any
        //  48     54     54     55     Any
        //  48     54     47     48     Any
        //  47     54     47     48     Any
        //  47     54     54     55     Any
        //  147    154    154    155    Any
        //  148    154    147    148    Any
        //  147    154    154    155    Ljava/lang/IllegalArgumentException;
        //  148    154    3      8      Ljava/lang/ClassCastException;
        //  148    154    154    155    Any
        //  160    167    167    168    Any
        //  161    167    167    168    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  160    167    160    161    Ljava/lang/UnsupportedOperationException;
        //  160    167    3      8      Ljava/lang/UnsupportedOperationException;
        //  161    167    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  172    178    178    179    Any
        //  172    178    178    179    Any
        //  172    178    178    179    Ljava/lang/ArithmeticException;
        //  172    178    178    179    Any
        //  172    178    178    179    Any
        //  231    237    237    238    Any
        //  231    237    3      8      Ljava/util/ConcurrentModificationException;
        //  231    237    237    238    Ljava/lang/IllegalStateException;
        //  231    237    237    238    Any
        //  231    237    3      8      Any
        //  241    248    248    249    Any
        //  241    248    248    249    Any
        //  241    248    241    242    Any
        //  242    248    248    249    Ljava/lang/IllegalArgumentException;
        //  242    248    3      8      Any
        //  252    259    259    260    Any
        //  253    259    252    253    Any
        //  252    259    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  253    259    259    260    Ljava/lang/NullPointerException;
        //  252    259    252    253    Ljava/lang/ArithmeticException;
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
    
    static {
        throw t;
    }
    
    @Override
    public void 0(@NotNull final f0w f0w, @NotNull final f0y f0y, @NotNull final f0Z f0Z) {
        fbS.4M(this, 1123261517, f0w, f0y, f0Z);
    }
    
    public f0F(@NotNull final f0f p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: pop            
        //     2: aload_0        
        //     3: getstatic       dev/nuker/pyro/fc.0:I
        //     6: ifeq            14
        //     9: ldc             -819403984
        //    11: goto            16
        //    14: ldc             -480903854
        //    16: ldc             724790742
        //    18: ixor           
        //    19: lookupswitch {
        //          -2105365953: 14
        //          -467955994: 745
        //          default: 44
        //        }
        //    44: aload_1        
        //    45: checkcast       Ldev/nuker/pyro/f0n;
        //    48: getstatic       dev/nuker/pyro/fc.c:I
        //    51: ifge            59
        //    54: ldc             -432691246
        //    56: goto            61
        //    59: ldc             -181841136
        //    61: ldc             1073263169
        //    63: ixor           
        //    64: lookupswitch {
        //          -892214959: 92
        //          -640871021: 59
        //          default: 747
        //        }
        //    92: invokespecial   dev/nuker/pyro/f0P.<init>:(Ldev/nuker/pyro/f0n;)V
        //    95: getstatic       dev/nuker/pyro/fc.0:I
        //    98: ifeq            106
        //   101: ldc             499795680
        //   103: goto            108
        //   106: ldc             -589486486
        //   108: ldc             -1193792947
        //   110: ixor           
        //   111: lookupswitch {
        //          -1525519187: 729
        //          -51199119: 106
        //          default: 136
        //        }
        //   136: aload_0        
        //   137: getstatic       dev/nuker/pyro/fc.c:I
        //   140: ifge            148
        //   143: ldc             -989972241
        //   145: goto            150
        //   148: ldc             -1753549369
        //   150: ldc             911586522
        //   152: ixor           
        //   153: lookupswitch {
        //          -1213038133: 148
        //          -223638475: 739
        //          default: 180
        //        }
        //   180: aload_1        
        //   181: invokevirtual   dev/nuker/pyro/f0f.c:()Ljava/lang/String;
        //   184: getstatic       dev/nuker/pyro/fc.1:I
        //   187: ifeq            195
        //   190: ldc             1080052047
        //   192: goto            197
        //   195: ldc             -1764430974
        //   197: ldc             706825692
        //   199: ixor           
        //   200: lookupswitch {
        //          -370305057: 195
        //          1782645907: 749
        //          default: 228
        //        }
        //   228: putfield        dev/nuker/pyro/f0F.c:Ljava/lang/String;
        //   231: aload_0        
        //   232: ldc             ""
        //   234: putfield        dev/nuker/pyro/f0F.0:Ljava/lang/String;
        //   237: aload_0        
        //   238: getstatic       dev/nuker/pyro/fc.1:I
        //   241: ifeq            249
        //   244: ldc             2084359746
        //   246: goto            251
        //   249: ldc             -474348707
        //   251: ldc             1409529910
        //   253: ixor           
        //   254: lookupswitch {
        //          -131987984: 249
        //          675247732: 751
        //          default: 280
        //        }
        //   280: aload_1        
        //   281: invokevirtual   dev/nuker/pyro/f0f.5:()Ldev/nuker/pyro/fw;
        //   284: putfield        dev/nuker/pyro/f0F.c:Ldev/nuker/pyro/fw;
        //   287: aload_0        
        //   288: getstatic       dev/nuker/pyro/fc.1:I
        //   291: ifeq            299
        //   294: ldc             1752178704
        //   296: goto            301
        //   299: ldc             -1983618152
        //   301: ldc             864359592
        //   303: ixor           
        //   304: lookupswitch {
        //          1276264604: 299
        //          1542796472: 741
        //          default: 332
        //        }
        //   332: aload_0        
        //   333: getfield        dev/nuker/pyro/f0F.c:Ldev/nuker/pyro/fw;
        //   336: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   339: dup            
        //   340: ifnonnull       346
        //   343: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   346: checkcast       Ljava/lang/Enum;
        //   349: getstatic       dev/nuker/pyro/fc.0:I
        //   352: ifeq            360
        //   355: ldc             749051240
        //   357: goto            362
        //   360: ldc             1337652839
        //   362: ldc             1381027508
        //   364: ixor           
        //   365: lookupswitch {
        //          501889235: 392
        //          2130007004: 360
        //          default: 743
        //        }
        //   392: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   395: getstatic       dev/nuker/pyro/fc.0:I
        //   398: ifeq            406
        //   401: ldc             -1916678668
        //   403: goto            408
        //   406: ldc             -806387001
        //   408: ldc             -1207648491
        //   410: ixor           
        //   411: lookupswitch {
        //          902132449: 406
        //          2011905490: 436
        //          default: 737
        //        }
        //   436: invokevirtual   java/lang/Class.getEnumConstants:()[Ljava/lang/Object;
        //   439: dup            
        //   440: ifnonnull       456
        //   443: new             Lkotlin/TypeCastException;
        //   446: dup            
        //   447: ldc             "\u231a\u1486\u8a09\ub3d5\uc83b\ued11\ub225\ue626\ud966\ue807\ua7c6\u1e0c\ue10e\uc5a2\u80cf\u898a\u57a5\u77fe\ubd29\uc1f4\u2bf2\uc234\u6aa5\u2d58\ud665\u357f\u7d66\u8948\u8004\u8d23\u8458\ufb72\u702e\u9a0f\u1a2d\uf196\u493c\u8882\uca89\ufe8b\ub620\u41fa\ub912\ub306\u4dec\u8a13\u7c7b\ucecc\u7d57\ueb26\ue618\u1686"
        //   449: invokestatic    invokestatic   !!! ERROR
        //   452: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   455: athrow         
        //   456: checkcast       [Ljava/lang/Enum;
        //   459: getstatic       dev/nuker/pyro/fc.c:I
        //   462: ifge            470
        //   465: ldc             -1956093165
        //   467: goto            472
        //   470: ldc             1535967150
        //   472: ldc             412279280
        //   474: ixor           
        //   475: lookupswitch {
        //          -1812299037: 733
        //          987947583: 470
        //          default: 500
        //        }
        //   500: putfield        dev/nuker/pyro/f0F.c:[Ljava/lang/Enum;
        //   503: aload_0        
        //   504: getstatic       dev/nuker/pyro/fc.1:I
        //   507: ifeq            515
        //   510: ldc             499620560
        //   512: goto            517
        //   515: ldc             109196665
        //   517: ldc             -681866668
        //   519: ixor           
        //   520: lookupswitch {
        //          -895741820: 753
        //          6029331: 515
        //          default: 548
        //        }
        //   548: getfield        dev/nuker/pyro/f0F.c:[Ljava/lang/Enum;
        //   551: astore          4
        //   553: aload           4
        //   555: arraylength    
        //   556: istore          5
        //   558: iconst_0       
        //   559: istore_3       
        //   560: getstatic       dev/nuker/pyro/fc.0:I
        //   563: ifeq            571
        //   566: ldc             376802695
        //   568: goto            573
        //   571: ldc             1641477544
        //   573: ldc             -1334892147
        //   575: ixor           
        //   576: lookupswitch {
        //          -1508203510: 735
        //          -675931223: 571
        //          default: 604
        //        }
        //   604: iload_3        
        //   605: iload           5
        //   607: if_icmpge       728
        //   610: aload           4
        //   612: iload_3        
        //   613: aaload         
        //   614: astore_2       
        //   615: aload_2        
        //   616: dup            
        //   617: ifnonnull       623
        //   620: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   623: invokevirtual   java/lang/Enum.name:()Ljava/lang/String;
        //   626: invokevirtual   java/lang/String.length:()I
        //   629: aload_0        
        //   630: getfield        dev/nuker/pyro/f0F.0:Ljava/lang/String;
        //   633: invokevirtual   java/lang/String.length:()I
        //   636: if_icmple       644
        //   639: ldc             1397109802
        //   641: goto            646
        //   644: ldc             1397109803
        //   646: ldc             821164760
        //   648: ixor           
        //   649: tableswitch {
        //          -948986396: 672
        //          -948986395: 722
        //          default: 639
        //        }
        //   672: aload_0        
        //   673: aload_2        
        //   674: getstatic       dev/nuker/pyro/fc.c:I
        //   677: ifge            685
        //   680: ldc             -808924811
        //   682: goto            687
        //   685: ldc             -217633090
        //   687: ldc             -1186540273
        //   689: ixor           
        //   690: lookupswitch {
        //          1523023301: 685
        //          1989024890: 731
        //          default: 716
        //        }
        //   716: invokevirtual   java/lang/Enum.name:()Ljava/lang/String;
        //   719: putfield        dev/nuker/pyro/f0F.0:Ljava/lang/String;
        //   722: iinc            3, 1
        //   725: goto            560
        //   728: return         
        //   729: aconst_null    
        //   730: athrow         
        //   731: aconst_null    
        //   732: athrow         
        //   733: aconst_null    
        //   734: athrow         
        //   735: aconst_null    
        //   736: athrow         
        //   737: aconst_null    
        //   738: athrow         
        //   739: aconst_null    
        //   740: athrow         
        //   741: aconst_null    
        //   742: athrow         
        //   743: aconst_null    
        //   744: athrow         
        //   745: aconst_null    
        //   746: athrow         
        //   747: aconst_null    
        //   748: athrow         
        //   749: aconst_null    
        //   750: athrow         
        //   751: aconst_null    
        //   752: athrow         
        //   753: aconst_null    
        //   754: athrow         
        //    StackMapTable: 00 3E 4E 06 FF 00 01 00 02 06 07 00 83 00 02 06 01 5B 06 FF 00 0E 00 02 06 07 00 83 00 02 06 07 00 75 FF 00 01 00 02 06 07 00 83 00 03 06 07 00 75 01 FF 00 1E 00 02 06 07 00 83 00 02 06 07 00 75 FF 00 0D 00 02 07 00 03 07 00 83 00 00 41 01 1B 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 83 00 02 07 00 03 01 5D 07 00 03 FF 00 0E 00 02 07 00 03 07 00 83 00 02 07 00 03 07 00 65 FF 00 01 00 02 07 00 03 07 00 83 00 03 07 00 03 07 00 65 01 FF 00 1E 00 02 07 00 03 07 00 83 00 02 07 00 03 07 00 65 54 07 00 03 FF 00 01 00 02 07 00 03 07 00 83 00 02 07 00 03 01 5C 07 00 03 52 07 00 03 FF 00 01 00 02 07 00 03 07 00 83 00 02 07 00 03 01 5E 07 00 03 FF 00 0D 00 02 07 00 03 07 00 83 00 02 07 00 03 07 00 A7 FF 00 0D 00 02 07 00 03 07 00 83 00 02 07 00 03 07 00 A2 FF 00 01 00 02 07 00 03 07 00 83 00 03 07 00 03 07 00 A2 01 FF 00 1D 00 02 07 00 03 07 00 83 00 02 07 00 03 07 00 A2 FF 00 0D 00 02 07 00 03 07 00 83 00 02 07 00 03 07 00 B0 FF 00 01 00 02 07 00 03 07 00 83 00 03 07 00 03 07 00 B0 01 FF 00 1B 00 02 07 00 03 07 00 83 00 02 07 00 03 07 00 B0 FF 00 13 00 02 07 00 03 07 00 83 00 02 07 00 03 07 00 D6 FF 00 0D 00 02 07 00 03 07 00 83 00 02 07 00 03 07 00 BC FF 00 01 00 02 07 00 03 07 00 83 00 03 07 00 03 07 00 BC 01 FF 00 1B 00 02 07 00 03 07 00 83 00 02 07 00 03 07 00 BC 4E 07 00 03 FF 00 01 00 02 07 00 03 07 00 83 00 02 07 00 03 01 5E 07 00 03 FF 00 0B 00 06 07 00 03 07 00 83 00 01 07 00 BC 01 00 00 0A 41 01 1E FF 00 12 00 06 07 00 03 07 00 83 07 00 A2 01 07 00 BC 01 00 01 07 00 A2 0F 04 41 01 19 FF 00 0C 00 06 07 00 03 07 00 83 07 00 A2 01 07 00 BC 01 00 02 07 00 03 07 00 A2 FF 00 01 00 06 07 00 03 07 00 83 07 00 A2 01 07 00 BC 01 00 03 07 00 03 07 00 A2 01 FF 00 1C 00 06 07 00 03 07 00 83 07 00 A2 01 07 00 BC 01 00 02 07 00 03 07 00 A2 05 FF 00 05 00 06 07 00 03 07 00 83 00 01 07 00 BC 01 00 00 FF 00 00 00 02 07 00 03 07 00 83 00 00 FF 00 01 00 06 07 00 03 07 00 83 07 00 A2 01 07 00 BC 01 00 02 07 00 03 07 00 A2 FF 00 01 00 02 07 00 03 07 00 83 00 02 07 00 03 07 00 BC FF 00 01 00 06 07 00 03 07 00 83 00 01 07 00 BC 01 00 00 FF 00 01 00 02 07 00 03 07 00 83 00 02 07 00 03 07 00 B0 41 07 00 03 41 07 00 03 FF 00 01 00 02 07 00 03 07 00 83 00 02 07 00 03 07 00 A2 FF 00 01 00 02 06 07 00 83 00 01 06 FF 00 01 00 02 06 07 00 83 00 02 06 07 00 75 FF 00 01 00 02 07 00 03 07 00 83 00 02 07 00 03 07 00 65 41 07 00 03 41 07 00 03
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
    
    @Override
    public void 2(@NotNull final f0w p0, final double p1, final double p2, @NotNull final f0y p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1459
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1451
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1443
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload           6
        //    28: pop            
        //    29: getstatic       dev/nuker/pyro/fc.1:I
        //    32: ifeq            40
        //    35: ldc             -717149493
        //    37: goto            42
        //    40: ldc             -1626269774
        //    42: ldc             937997408
        //    44: ixor           
        //    45: lookupswitch {
        //          -492200277: 1422
        //          -246282743: 40
        //          default: 72
        //        }
        //    72: aload_0        
        //    73: aload_1        
        //    74: dload_2        
        //    75: dload           4
        //    77: aload           6
        //    79: goto            83
        //    82: athrow         
        //    83: invokespecial   dev/nuker/pyro/f0P.2:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)V
        //    86: goto            90
        //    89: athrow         
        //    90: getstatic       dev/nuker/pyro/f0A.c:Ldev/nuker/pyro/f0A;
        //    93: aload_1        
        //    94: goto            98
        //    97: athrow         
        //    98: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   101: goto            105
        //   104: athrow         
        //   105: aload_0        
        //   106: getfield        dev/nuker/pyro/f0F.c:Ljava/lang/String;
        //   109: iconst_0       
        //   110: getstatic       dev/nuker/pyro/f0y.c:I
        //   113: aload_1        
        //   114: goto            118
        //   117: athrow         
        //   118: invokevirtual   dev/nuker/pyro/f0w.5:()I
        //   121: goto            125
        //   124: athrow         
        //   125: iconst_4       
        //   126: isub           
        //   127: aload_1        
        //   128: goto            132
        //   131: athrow         
        //   132: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   135: goto            139
        //   138: athrow         
        //   139: getstatic       dev/nuker/pyro/fc.c:I
        //   142: ifge            150
        //   145: ldc             -969942475
        //   147: goto            152
        //   150: ldc             885591169
        //   152: ldc             608307308
        //   154: ixor           
        //   155: lookupswitch {
        //          -496119207: 150
        //          277546221: 180
        //          default: 1418
        //        }
        //   180: getstatic       dev/nuker/pyro/f0y.c:I
        //   183: iconst_2       
        //   184: imul           
        //   185: isub           
        //   186: iconst_4       
        //   187: isub           
        //   188: getstatic       dev/nuker/pyro/fc.0:I
        //   191: ifeq            199
        //   194: ldc             -1069161988
        //   196: goto            201
        //   199: ldc             2029164037
        //   201: ldc             -1375844808
        //   203: ixor           
        //   204: lookupswitch {
        //          -720580547: 232
        //          1841014724: 199
        //          default: 1426
        //        }
        //   232: getstatic       dev/nuker/pyro/f0x.c:Ldev/nuker/pyro/f0x;
        //   235: getstatic       dev/nuker/pyro/f0y.c:I
        //   238: aload           6
        //   240: goto            244
        //   243: athrow         
        //   244: invokevirtual   dev/nuker/pyro/f0y.0:()I
        //   247: goto            251
        //   250: athrow         
        //   251: iconst_0       
        //   252: sipush          512
        //   255: aconst_null    
        //   256: goto            260
        //   259: athrow         
        //   260: invokestatic    dev/nuker/pyro/f0A.c:(Ldev/nuker/pyro/f0A;Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;IIIILdev/nuker/pyro/f0x;IIZILjava/lang/Object;)V
        //   263: goto            267
        //   266: athrow         
        //   267: getstatic       dev/nuker/pyro/f0A.c:Ldev/nuker/pyro/f0A;
        //   270: aload_1        
        //   271: goto            275
        //   274: athrow         
        //   275: invokevirtual   dev/nuker/pyro/f0w.1:()Lnet/minecraft/client/gui/FontRenderer;
        //   278: goto            282
        //   281: athrow         
        //   282: getstatic       dev/nuker/pyro/fc.0:I
        //   285: ifeq            294
        //   288: ldc_w           -866895807
        //   291: goto            297
        //   294: ldc_w           1482632195
        //   297: ldc_w           1557058683
        //   300: ixor           
        //   301: lookupswitch {
        //          -1868895174: 1428
        //          -1452583775: 294
        //          default: 328
        //        }
        //   328: aload_0        
        //   329: getfield        dev/nuker/pyro/f0F.c:Ldev/nuker/pyro/fw;
        //   332: goto            336
        //   335: athrow         
        //   336: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   339: goto            343
        //   342: athrow         
        //   343: dup            
        //   344: ifnonnull       403
        //   347: getstatic       dev/nuker/pyro/fc.c:I
        //   350: ifge            359
        //   353: ldc_w           -1662100131
        //   356: goto            362
        //   359: ldc_w           378172290
        //   362: ldc_w           1641585250
        //   365: ixor           
        //   366: lookupswitch {
        //          -46741697: 1424
        //          1279913802: 359
        //          default: 392
        //        }
        //   392: goto            396
        //   395: athrow         
        //   396: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   399: goto            403
        //   402: athrow         
        //   403: checkcast       Ljava/lang/Enum;
        //   406: goto            410
        //   409: athrow         
        //   410: invokevirtual   java/lang/Enum.name:()Ljava/lang/String;
        //   413: goto            417
        //   416: athrow         
        //   417: iconst_0       
        //   418: getstatic       dev/nuker/pyro/f0y.c:I
        //   421: aload_1        
        //   422: goto            426
        //   425: athrow         
        //   426: invokevirtual   dev/nuker/pyro/f0w.5:()I
        //   429: goto            433
        //   432: athrow         
        //   433: iconst_4       
        //   434: isub           
        //   435: aload_1        
        //   436: goto            440
        //   439: athrow         
        //   440: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   443: goto            447
        //   446: athrow         
        //   447: getstatic       dev/nuker/pyro/f0y.c:I
        //   450: iconst_2       
        //   451: imul           
        //   452: isub           
        //   453: iconst_4       
        //   454: isub           
        //   455: getstatic       dev/nuker/pyro/f0x.0:Ldev/nuker/pyro/f0x;
        //   458: getstatic       dev/nuker/pyro/fc.1:I
        //   461: ifeq            470
        //   464: ldc_w           -835225550
        //   467: goto            473
        //   470: ldc_w           1751461837
        //   473: ldc_w           1337152518
        //   476: ixor           
        //   477: lookupswitch {
        //          -2122044364: 470
        //          668367819: 504
        //          default: 1420
        //        }
        //   504: getstatic       dev/nuker/pyro/f0y.c:I
        //   507: aload           6
        //   509: goto            513
        //   512: athrow         
        //   513: invokevirtual   dev/nuker/pyro/f0y.0:()I
        //   516: goto            520
        //   519: athrow         
        //   520: iconst_0       
        //   521: sipush          512
        //   524: aconst_null    
        //   525: getstatic       dev/nuker/pyro/fc.0:I
        //   528: ifeq            537
        //   531: ldc_w           -549266794
        //   534: goto            540
        //   537: ldc_w           1870738196
        //   540: ldc_w           509738941
        //   543: ixor           
        //   544: lookupswitch {
        //          -1054661333: 1414
        //          1644132407: 537
        //          default: 572
        //        }
        //   572: goto            576
        //   575: athrow         
        //   576: invokestatic    dev/nuker/pyro/f0A.c:(Ldev/nuker/pyro/f0A;Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;IIIILdev/nuker/pyro/f0x;IIZILjava/lang/Object;)V
        //   579: goto            583
        //   582: athrow         
        //   583: aload_1        
        //   584: goto            588
        //   587: athrow         
        //   588: invokevirtual   dev/nuker/pyro/f0w.5:()I
        //   591: goto            595
        //   594: athrow         
        //   595: getstatic       dev/nuker/pyro/f0y.c:I
        //   598: iconst_2       
        //   599: imul           
        //   600: isub           
        //   601: getstatic       dev/nuker/pyro/fc.c:I
        //   604: ifge            613
        //   607: ldc_w           -109930722
        //   610: goto            616
        //   613: ldc_w           -2125476767
        //   616: ldc_w           815207246
        //   619: ixor           
        //   620: lookupswitch {
        //          -907705264: 1406
        //          -112938276: 613
        //          default: 648
        //        }
        //   648: aload_0        
        //   649: getfield        dev/nuker/pyro/f0F.c:[Ljava/lang/Enum;
        //   652: arraylength    
        //   653: idiv           
        //   654: getstatic       dev/nuker/pyro/fc.1:I
        //   657: ifeq            666
        //   660: ldc_w           -843618809
        //   663: goto            669
        //   666: ldc_w           2032692626
        //   669: ldc_w           -1097875413
        //   672: ixor           
        //   673: lookupswitch {
        //          -906687499: 666
        //          1933092396: 1416
        //          default: 700
        //        }
        //   700: istore          7
        //   702: iload           7
        //   704: aload_0        
        //   705: getfield        dev/nuker/pyro/f0F.c:Ldev/nuker/pyro/fw;
        //   708: goto            712
        //   711: athrow         
        //   712: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   715: goto            719
        //   718: athrow         
        //   719: dup            
        //   720: ifnonnull       729
        //   723: ldc_w           -1445368771
        //   726: goto            732
        //   729: ldc_w           -1445368770
        //   732: ldc_w           -848647544
        //   735: ixor           
        //   736: tableswitch {
        //          -915960470: 760
        //          -915960469: 771
        //          default: 723
        //        }
        //   760: goto            764
        //   763: athrow         
        //   764: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   767: goto            771
        //   770: athrow         
        //   771: checkcast       Ljava/lang/Enum;
        //   774: goto            778
        //   777: athrow         
        //   778: invokevirtual   java/lang/Enum.ordinal:()I
        //   781: goto            785
        //   784: athrow         
        //   785: imul           
        //   786: istore          8
        //   788: aload_0        
        //   789: getstatic       dev/nuker/pyro/fc.c:I
        //   792: ifge            801
        //   795: ldc_w           -1271230845
        //   798: goto            804
        //   801: ldc_w           -787681406
        //   804: ldc_w           -1388048484
        //   807: ixor           
        //   808: lookupswitch {
        //          427720991: 801
        //          2085150750: 836
        //          default: 1408
        //        }
        //   836: getfield        dev/nuker/pyro/f0F.c:Ldev/nuker/pyro/fw;
        //   839: goto            843
        //   842: athrow         
        //   843: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   846: goto            850
        //   849: athrow         
        //   850: dup            
        //   851: ifnonnull       865
        //   854: goto            858
        //   857: athrow         
        //   858: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   861: goto            865
        //   864: athrow         
        //   865: checkcast       Ljava/lang/Enum;
        //   868: goto            872
        //   871: athrow         
        //   872: invokevirtual   java/lang/Enum.ordinal:()I
        //   875: goto            879
        //   878: athrow         
        //   879: getstatic       dev/nuker/pyro/fc.0:I
        //   882: ifeq            891
        //   885: ldc_w           -1544618329
        //   888: goto            894
        //   891: ldc_w           1794497003
        //   894: ldc_w           474340847
        //   897: ixor           
        //   898: lookupswitch {
        //          -1079303352: 891
        //          1991246852: 924
        //          default: 1410
        //        }
        //   924: aload_0        
        //   925: getstatic       dev/nuker/pyro/fc.0:I
        //   928: ifeq            937
        //   931: ldc_w           -178430938
        //   934: goto            940
        //   937: ldc_w           1345708860
        //   940: ldc_w           362791753
        //   943: ixor           
        //   944: lookupswitch {
        //          -524116113: 937
        //          1168777333: 972
        //          default: 1412
        //        }
        //   972: getfield        dev/nuker/pyro/f0F.c:[Ljava/lang/Enum;
        //   975: arraylength    
        //   976: iconst_1       
        //   977: isub           
        //   978: if_icmpne       987
        //   981: ldc_w           207775315
        //   984: goto            990
        //   987: ldc_w           207775314
        //   990: ldc_w           -403284001
        //   993: ixor           
        //   994: tableswitch {
        //          -685214952: 1016
        //          -685214951: 1037
        //          default: 981
        //        }
        //  1016: aload_1        
        //  1017: goto            1021
        //  1020: athrow         
        //  1021: invokevirtual   dev/nuker/pyro/f0w.5:()I
        //  1024: goto            1028
        //  1027: athrow         
        //  1028: getstatic       dev/nuker/pyro/f0y.c:I
        //  1031: iconst_2       
        //  1032: imul           
        //  1033: isub           
        //  1034: goto            1120
        //  1037: iload           7
        //  1039: aload_0        
        //  1040: getfield        dev/nuker/pyro/f0F.c:Ldev/nuker/pyro/fw;
        //  1043: goto            1047
        //  1046: athrow         
        //  1047: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //  1050: goto            1054
        //  1053: athrow         
        //  1054: dup            
        //  1055: ifnonnull       1064
        //  1058: ldc_w           -76501196
        //  1061: goto            1067
        //  1064: ldc_w           -76501193
        //  1067: ldc_w           327643345
        //  1070: ixor           
        //  1071: tableswitch {
        //          -772816950: 1092
        //          -772816949: 1103
        //          default: 1058
        //        }
        //  1092: goto            1096
        //  1095: athrow         
        //  1096: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1099: goto            1103
        //  1102: athrow         
        //  1103: checkcast       Ljava/lang/Enum;
        //  1106: goto            1110
        //  1109: athrow         
        //  1110: invokevirtual   java/lang/Enum.ordinal:()I
        //  1113: goto            1117
        //  1116: athrow         
        //  1117: iconst_1       
        //  1118: iadd           
        //  1119: imul           
        //  1120: istore          9
        //  1122: getstatic       dev/nuker/pyro/fc.0:I
        //  1125: ifeq            1134
        //  1128: ldc_w           -431267975
        //  1131: goto            1137
        //  1134: ldc_w           -1581462353
        //  1137: ldc_w           549048941
        //  1140: ixor           
        //  1141: lookupswitch {
        //          -957182700: 1432
        //          -252054272: 1134
        //          default: 1168
        //        }
        //  1168: getstatic       dev/nuker/pyro/f0y.c:I
        //  1171: aload_1        
        //  1172: getstatic       dev/nuker/pyro/fc.1:I
        //  1175: ifeq            1184
        //  1178: ldc_w           -1607921200
        //  1181: goto            1187
        //  1184: ldc_w           -1889517981
        //  1187: ldc_w           742514804
        //  1190: ixor           
        //  1191: lookupswitch {
        //          -1939279452: 1404
        //          1834453527: 1184
        //          default: 1216
        //        }
        //  1216: goto            1220
        //  1219: athrow         
        //  1220: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //  1223: goto            1227
        //  1226: athrow         
        //  1227: getstatic       dev/nuker/pyro/f0y.c:I
        //  1230: isub           
        //  1231: aload_1        
        //  1232: goto            1236
        //  1235: athrow         
        //  1236: invokevirtual   dev/nuker/pyro/f0w.5:()I
        //  1239: goto            1243
        //  1242: athrow         
        //  1243: getstatic       dev/nuker/pyro/f0y.c:I
        //  1246: isub           
        //  1247: aload_1        
        //  1248: goto            1252
        //  1251: athrow         
        //  1252: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //  1255: goto            1259
        //  1258: athrow         
        //  1259: getstatic       dev/nuker/pyro/f0y.c:I
        //  1262: isub           
        //  1263: iconst_1       
        //  1264: isub           
        //  1265: aload           6
        //  1267: goto            1271
        //  1270: athrow         
        //  1271: invokevirtual   dev/nuker/pyro/f0y.0:()I
        //  1274: goto            1278
        //  1277: athrow         
        //  1278: goto            1282
        //  1281: athrow         
        //  1282: invokestatic    net/minecraft/client/gui/Gui.func_73734_a:(IIIII)V
        //  1285: goto            1289
        //  1288: athrow         
        //  1289: getstatic       dev/nuker/pyro/f0y.c:I
        //  1292: getstatic       dev/nuker/pyro/fc.c:I
        //  1295: ifge            1304
        //  1298: ldc_w           2096462262
        //  1301: goto            1307
        //  1304: ldc_w           1715318509
        //  1307: ldc_w           1494386478
        //  1310: ixor           
        //  1311: lookupswitch {
        //          635960984: 1304
        //          1060055491: 1336
        //          default: 1430
        //        }
        //  1336: iload           8
        //  1338: iadd           
        //  1339: aload_1        
        //  1340: goto            1344
        //  1343: athrow         
        //  1344: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //  1347: goto            1351
        //  1350: athrow         
        //  1351: getstatic       dev/nuker/pyro/f0y.c:I
        //  1354: isub           
        //  1355: getstatic       dev/nuker/pyro/f0y.c:I
        //  1358: iload           9
        //  1360: iadd           
        //  1361: aload_1        
        //  1362: goto            1366
        //  1365: athrow         
        //  1366: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //  1369: goto            1373
        //  1372: athrow         
        //  1373: getstatic       dev/nuker/pyro/f0y.c:I
        //  1376: isub           
        //  1377: iconst_1       
        //  1378: isub           
        //  1379: aload           6
        //  1381: goto            1385
        //  1384: athrow         
        //  1385: invokevirtual   dev/nuker/pyro/f0y.6:()I
        //  1388: goto            1392
        //  1391: athrow         
        //  1392: goto            1396
        //  1395: athrow         
        //  1396: invokestatic    net/minecraft/client/gui/Gui.func_73734_a:(IIIII)V
        //  1399: goto            1403
        //  1402: athrow         
        //  1403: return         
        //  1404: aconst_null    
        //  1405: athrow         
        //  1406: aconst_null    
        //  1407: athrow         
        //  1408: aconst_null    
        //  1409: athrow         
        //  1410: aconst_null    
        //  1411: athrow         
        //  1412: aconst_null    
        //  1413: athrow         
        //  1414: aconst_null    
        //  1415: athrow         
        //  1416: aconst_null    
        //  1417: athrow         
        //  1418: aconst_null    
        //  1419: athrow         
        //  1420: aconst_null    
        //  1421: athrow         
        //  1422: aconst_null    
        //  1423: athrow         
        //  1424: aconst_null    
        //  1425: athrow         
        //  1426: aconst_null    
        //  1427: athrow         
        //  1428: aconst_null    
        //  1429: athrow         
        //  1430: aconst_null    
        //  1431: athrow         
        //  1432: aconst_null    
        //  1433: athrow         
        //  1434: pop            
        //  1435: goto            24
        //  1438: pop            
        //  1439: aconst_null    
        //  1440: goto            1434
        //  1443: dup            
        //  1444: ifnull          1434
        //  1447: checkcast       Ljava/lang/Throwable;
        //  1450: athrow         
        //  1451: dup            
        //  1452: ifnull          1438
        //  1455: checkcast       Ljava/lang/Throwable;
        //  1458: athrow         
        //  1459: aconst_null    
        //  1460: athrow         
        //    StackMapTable: 00 DB 43 07 00 2E 04 FF 00 0B 00 00 00 01 07 00 2E FF 00 03 00 05 07 00 03 07 00 30 03 03 07 00 62 00 00 0F 41 01 1D 49 07 00 DC FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 05 07 00 03 07 00 30 03 03 07 00 62 45 07 00 2E 00 46 07 00 13 FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 02 07 00 E9 07 00 30 45 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 02 07 00 E9 07 00 5C 4B 07 00 27 FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 06 07 00 E9 07 00 5C 07 00 65 01 01 07 00 30 45 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 06 07 00 E9 07 00 5C 07 00 65 01 01 01 45 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 07 07 00 E9 07 00 5C 07 00 65 01 01 01 07 00 30 45 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 07 07 00 E9 07 00 5C 07 00 65 01 01 01 01 FF 00 0A 00 05 07 00 03 07 00 30 03 03 07 00 62 00 07 07 00 E9 07 00 5C 07 00 65 01 01 01 01 FF 00 01 00 05 07 00 03 07 00 30 03 03 07 00 62 00 08 07 00 E9 07 00 5C 07 00 65 01 01 01 01 01 FF 00 1B 00 05 07 00 03 07 00 30 03 03 07 00 62 00 07 07 00 E9 07 00 5C 07 00 65 01 01 01 01 FF 00 12 00 05 07 00 03 07 00 30 03 03 07 00 62 00 07 07 00 E9 07 00 5C 07 00 65 01 01 01 01 FF 00 01 00 05 07 00 03 07 00 30 03 03 07 00 62 00 08 07 00 E9 07 00 5C 07 00 65 01 01 01 01 01 FF 00 1E 00 05 07 00 03 07 00 30 03 03 07 00 62 00 07 07 00 E9 07 00 5C 07 00 65 01 01 01 01 FF 00 0A 00 00 00 01 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 0A 07 00 E9 07 00 5C 07 00 65 01 01 01 01 07 00 F9 01 07 00 62 45 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 0A 07 00 E9 07 00 5C 07 00 65 01 01 01 01 07 00 F9 01 01 FF 00 07 00 00 00 01 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 0D 07 00 E9 07 00 5C 07 00 65 01 01 01 01 07 00 F9 01 01 01 01 05 45 07 00 2E 00 46 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 02 07 00 E9 07 00 30 45 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 02 07 00 E9 07 00 5C FF 00 0B 00 05 07 00 03 07 00 30 03 03 07 00 62 00 02 07 00 E9 07 00 5C FF 00 02 00 05 07 00 03 07 00 30 03 03 07 00 62 00 03 07 00 E9 07 00 5C 01 FF 00 1E 00 05 07 00 03 07 00 30 03 03 07 00 62 00 02 07 00 E9 07 00 5C 46 07 00 13 FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 03 07 00 E9 07 00 5C 07 00 98 45 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 03 07 00 E9 07 00 5C 07 00 A7 FF 00 0F 00 05 07 00 03 07 00 30 03 03 07 00 62 00 03 07 00 E9 07 00 5C 07 00 A7 FF 00 02 00 05 07 00 03 07 00 30 03 03 07 00 62 00 04 07 00 E9 07 00 5C 07 00 A7 01 FF 00 1D 00 05 07 00 03 07 00 30 03 03 07 00 62 00 03 07 00 E9 07 00 5C 07 00 A7 FF 00 02 00 00 00 01 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 03 07 00 E9 07 00 5C 07 00 A7 45 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 03 07 00 E9 07 00 5C 07 00 A7 45 07 00 21 FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 03 07 00 E9 07 00 5C 07 00 A2 45 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 03 07 00 E9 07 00 5C 07 00 65 47 07 00 13 FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 06 07 00 E9 07 00 5C 07 00 65 01 01 07 00 30 45 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 06 07 00 E9 07 00 5C 07 00 65 01 01 01 45 07 00 23 FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 07 07 00 E9 07 00 5C 07 00 65 01 01 01 07 00 30 45 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 07 07 00 E9 07 00 5C 07 00 65 01 01 01 01 FF 00 16 00 05 07 00 03 07 00 30 03 03 07 00 62 00 08 07 00 E9 07 00 5C 07 00 65 01 01 01 01 07 00 F9 FF 00 02 00 05 07 00 03 07 00 30 03 03 07 00 62 00 09 07 00 E9 07 00 5C 07 00 65 01 01 01 01 07 00 F9 01 FF 00 1E 00 05 07 00 03 07 00 30 03 03 07 00 62 00 08 07 00 E9 07 00 5C 07 00 65 01 01 01 01 07 00 F9 FF 00 07 00 00 00 01 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 0A 07 00 E9 07 00 5C 07 00 65 01 01 01 01 07 00 F9 01 07 00 62 45 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 0A 07 00 E9 07 00 5C 07 00 65 01 01 01 01 07 00 F9 01 01 FF 00 10 00 05 07 00 03 07 00 30 03 03 07 00 62 00 0D 07 00 E9 07 00 5C 07 00 65 01 01 01 01 07 00 F9 01 01 01 01 05 FF 00 02 00 05 07 00 03 07 00 30 03 03 07 00 62 00 0E 07 00 E9 07 00 5C 07 00 65 01 01 01 01 07 00 F9 01 01 01 01 05 01 FF 00 1F 00 05 07 00 03 07 00 30 03 03 07 00 62 00 0D 07 00 E9 07 00 5C 07 00 65 01 01 01 01 07 00 F9 01 01 01 01 05 42 07 00 2E FF 00 00 00 05 07 00 03 07 00 30 03 03 07 00 62 00 0D 07 00 E9 07 00 5C 07 00 65 01 01 01 01 07 00 F9 01 01 01 01 05 45 07 00 2E 00 43 07 00 2E 40 07 00 30 45 07 00 2E 40 01 51 01 FF 00 02 00 05 07 00 03 07 00 30 03 03 07 00 62 00 02 01 01 5F 01 51 01 FF 00 02 00 05 07 00 03 07 00 30 03 03 07 00 62 00 02 01 01 5E 01 FF 00 0A 00 06 07 00 03 07 00 30 03 03 07 00 62 01 00 01 07 00 2E FF 00 00 00 06 07 00 03 07 00 30 03 03 07 00 62 01 00 02 01 07 00 98 45 07 00 2E FF 00 00 00 06 07 00 03 07 00 30 03 03 07 00 62 01 00 02 01 07 00 A7 FF 00 03 00 06 07 00 03 07 00 30 03 03 07 00 62 01 00 02 01 07 00 A7 FF 00 05 00 06 07 00 03 07 00 30 03 03 07 00 62 01 00 02 01 07 00 A7 FF 00 02 00 06 07 00 03 07 00 30 03 03 07 00 62 01 00 03 01 07 00 A7 01 FF 00 1B 00 06 07 00 03 07 00 30 03 03 07 00 62 01 00 02 01 07 00 A7 42 07 00 2E FF 00 00 00 06 07 00 03 07 00 30 03 03 07 00 62 01 00 02 01 07 00 A7 45 07 00 2E FF 00 00 00 06 07 00 03 07 00 30 03 03 07 00 62 01 00 02 01 07 00 A7 FF 00 05 00 00 00 01 07 00 2E FF 00 00 00 06 07 00 03 07 00 30 03 03 07 00 62 01 00 02 01 07 00 A2 45 07 00 2E FF 00 00 00 06 07 00 03 07 00 30 03 03 07 00 62 01 00 02 01 01 FF 00 0F 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 01 07 00 03 FF 00 02 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 02 07 00 03 01 5F 07 00 03 45 07 00 2E 40 07 00 98 45 07 00 2E 40 07 00 A7 46 07 00 13 40 07 00 A7 45 07 00 2E 40 07 00 A7 45 07 00 2E 40 07 00 A2 45 07 00 2E 40 01 4B 01 FF 00 02 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 02 01 01 5D 01 FF 00 0C 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 02 01 07 00 03 FF 00 02 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 03 01 07 00 03 01 FF 00 1F 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 02 01 07 00 03 08 05 42 01 19 43 07 00 2E 40 07 00 30 45 07 00 2E 40 01 08 48 07 00 2E FF 00 00 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 02 01 07 00 98 45 07 00 2E FF 00 00 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 02 01 07 00 A7 FF 00 03 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 02 01 07 00 A7 FF 00 05 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 02 01 07 00 A7 FF 00 02 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 03 01 07 00 A7 01 FF 00 18 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 02 01 07 00 A7 42 07 00 2E FF 00 00 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 02 01 07 00 A7 45 07 00 2E FF 00 00 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 02 01 07 00 A7 45 07 00 15 FF 00 00 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 02 01 07 00 A2 45 07 00 2E FF 00 00 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 02 01 01 42 01 FC 00 0D 01 42 01 1E FF 00 0F 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 02 01 07 00 30 FF 00 02 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 03 01 07 00 30 01 FF 00 1C 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 02 01 07 00 30 42 07 00 2E FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 02 01 07 00 30 45 07 00 2E FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 02 01 01 47 07 00 2E FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 03 01 01 07 00 30 45 07 00 2E FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 03 01 01 01 47 07 00 21 FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 04 01 01 01 07 00 30 45 07 00 2E FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 04 01 01 01 01 4A 07 00 2E FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 05 01 01 01 01 07 00 62 45 07 00 2E FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 05 01 01 01 01 01 FF 00 02 00 00 00 01 07 00 2E FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 05 01 01 01 01 01 45 07 00 2E 00 4E 01 FF 00 02 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 02 01 01 5C 01 FF 00 06 00 00 00 01 07 00 2E FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 02 01 07 00 30 45 07 00 2E FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 02 01 01 FF 00 0D 00 00 00 01 07 00 2E FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 04 01 01 01 07 00 30 45 07 00 2E FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 04 01 01 01 01 4A 07 00 27 FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 05 01 01 01 01 07 00 62 45 07 00 2E FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 05 01 01 01 01 01 42 07 00 E2 FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 05 01 01 01 01 01 45 07 00 2E 00 FF 00 00 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 02 01 07 00 30 FF 00 01 00 05 07 00 03 07 00 30 03 03 07 00 62 00 01 01 FF 00 01 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 01 07 00 03 41 01 FF 00 01 00 07 07 00 03 07 00 30 03 03 07 00 62 01 01 00 02 01 07 00 03 FF 00 01 00 05 07 00 03 07 00 30 03 03 07 00 62 00 0D 07 00 E9 07 00 5C 07 00 65 01 01 01 01 07 00 F9 01 01 01 01 05 41 01 FF 00 01 00 05 07 00 03 07 00 30 03 03 07 00 62 00 07 07 00 E9 07 00 5C 07 00 65 01 01 01 01 FF 00 01 00 05 07 00 03 07 00 30 03 03 07 00 62 00 08 07 00 E9 07 00 5C 07 00 65 01 01 01 01 07 00 F9 01 FF 00 01 00 05 07 00 03 07 00 30 03 03 07 00 62 00 03 07 00 E9 07 00 5C 07 00 A7 FF 00 01 00 05 07 00 03 07 00 30 03 03 07 00 62 00 07 07 00 E9 07 00 5C 07 00 65 01 01 01 01 FF 00 01 00 05 07 00 03 07 00 30 03 03 07 00 62 00 02 07 00 E9 07 00 5C FF 00 01 00 08 07 00 03 07 00 30 03 03 07 00 62 01 01 01 00 01 01 01 FF 00 01 00 05 07 00 03 07 00 30 03 03 07 00 62 00 01 07 00 13 43 05 44 07 00 13 47 05 47 07 00 2E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1443   1451   Ljava/lang/ArithmeticException;
        //  1443   1451   1443   1451   Ljava/lang/EnumConstantNotPresentException;
        //  1459   1461   3      8      Ljava/lang/IllegalArgumentException;
        //  82     89     89     90     Any
        //  82     89     82     83     Ljava/util/NoSuchElementException;
        //  82     89     89     90     Any
        //  82     89     89     90     Any
        //  82     89     3      8      Ljava/lang/UnsupportedOperationException;
        //  97     104    104    105    Any
        //  98     104    3      8      Any
        //  98     104    104    105    Any
        //  97     104    97     98     Ljava/lang/EnumConstantNotPresentException;
        //  97     104    97     98     Ljava/util/ConcurrentModificationException;
        //  117    124    124    125    Any
        //  118    124    3      8      Ljava/lang/NegativeArraySizeException;
        //  118    124    117    118    Ljava/lang/NullPointerException;
        //  118    124    3      8      Ljava/util/NoSuchElementException;
        //  118    124    124    125    Ljava/util/NoSuchElementException;
        //  131    138    138    139    Any
        //  132    138    3      8      Any
        //  131    138    131    132    Any
        //  132    138    138    139    Ljava/lang/AssertionError;
        //  131    138    131    132    Any
        //  244    250    250    251    Any
        //  244    250    250    251    Any
        //  244    250    250    251    Ljava/lang/ArithmeticException;
        //  244    250    250    251    Ljava/lang/ArithmeticException;
        //  244    250    250    251    Ljava/lang/UnsupportedOperationException;
        //  260    266    266    267    Any
        //  260    266    3      8      Any
        //  260    266    266    267    Ljava/lang/RuntimeException;
        //  260    266    3      8      Ljava/lang/ClassCastException;
        //  260    266    266    267    Ljava/lang/NullPointerException;
        //  274    281    281    282    Any
        //  274    281    274    275    Any
        //  275    281    3      8      Ljava/lang/UnsupportedOperationException;
        //  275    281    281    282    Any
        //  274    281    274    275    Ljava/lang/EnumConstantNotPresentException;
        //  335    342    342    343    Any
        //  336    342    335    336    Ljava/lang/RuntimeException;
        //  335    342    342    343    Ljava/lang/StringIndexOutOfBoundsException;
        //  336    342    342    343    Any
        //  335    342    3      8      Any
        //  396    402    402    403    Any
        //  396    402    3      8      Any
        //  396    402    402    403    Any
        //  396    402    3      8      Any
        //  396    402    402    403    Any
        //  409    416    416    417    Any
        //  410    416    409    410    Ljava/lang/ArithmeticException;
        //  410    416    416    417    Any
        //  409    416    416    417    Ljava/lang/RuntimeException;
        //  410    416    3      8      Any
        //  425    432    432    433    Any
        //  426    432    425    426    Ljava/lang/NullPointerException;
        //  425    432    432    433    Ljava/lang/IllegalStateException;
        //  425    432    425    426    Ljava/lang/IllegalStateException;
        //  426    432    425    426    Ljava/lang/IllegalStateException;
        //  439    446    446    447    Any
        //  440    446    446    447    Any
        //  440    446    446    447    Ljava/lang/UnsupportedOperationException;
        //  439    446    446    447    Ljava/lang/IllegalStateException;
        //  440    446    439    440    Ljava/util/ConcurrentModificationException;
        //  513    519    519    520    Any
        //  513    519    519    520    Any
        //  513    519    519    520    Ljava/lang/IllegalStateException;
        //  513    519    519    520    Ljava/util/NoSuchElementException;
        //  513    519    3      8      Any
        //  575    582    582    583    Any
        //  576    582    3      8      Ljava/lang/ArithmeticException;
        //  576    582    575    576    Ljava/lang/StringIndexOutOfBoundsException;
        //  576    582    575    576    Any
        //  575    582    3      8      Ljava/lang/NullPointerException;
        //  587    594    594    595    Any
        //  588    594    587    588    Any
        //  587    594    587    588    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  588    594    3      8      Any
        //  587    594    587    588    Ljava/lang/IllegalStateException;
        //  711    718    718    719    Any
        //  712    718    711    712    Ljava/lang/NegativeArraySizeException;
        //  712    718    711    712    Ljava/lang/EnumConstantNotPresentException;
        //  711    718    3      8      Any
        //  712    718    711    712    Any
        //  763    770    770    771    Any
        //  764    770    3      8      Ljava/lang/AssertionError;
        //  764    770    763    764    Any
        //  763    770    763    764    Ljava/lang/IllegalStateException;
        //  764    770    770    771    Ljava/lang/UnsupportedOperationException;
        //  778    784    784    785    Any
        //  778    784    3      8      Ljava/lang/RuntimeException;
        //  778    784    784    785    Any
        //  778    784    3      8      Ljava/lang/UnsupportedOperationException;
        //  778    784    784    785    Any
        //  842    849    849    850    Any
        //  842    849    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  843    849    849    850    Any
        //  842    849    842    843    Any
        //  842    849    842    843    Ljava/lang/IndexOutOfBoundsException;
        //  857    864    864    865    Any
        //  857    864    857    858    Ljava/lang/UnsupportedOperationException;
        //  857    864    3      8      Ljava/lang/AssertionError;
        //  857    864    3      8      Any
        //  858    864    857    858    Ljava/lang/NegativeArraySizeException;
        //  871    878    878    879    Any
        //  871    878    878    879    Ljava/lang/StringIndexOutOfBoundsException;
        //  871    878    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  872    878    871    872    Any
        //  872    878    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1020   1027   1027   1028   Any
        //  1020   1027   1020   1021   Any
        //  1020   1027   1020   1021   Ljava/lang/IllegalStateException;
        //  1020   1027   1020   1021   Any
        //  1021   1027   3      8      Any
        //  1046   1053   1053   1054   Any
        //  1047   1053   1046   1047   Any
        //  1046   1053   3      8      Ljava/util/ConcurrentModificationException;
        //  1046   1053   3      8      Any
        //  1046   1053   1046   1047   Any
        //  1095   1102   1102   1103   Any
        //  1095   1102   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1096   1102   3      8      Any
        //  1095   1102   3      8      Any
        //  1096   1102   1095   1096   Any
        //  1109   1116   1116   1117   Any
        //  1110   1116   1116   1117   Ljava/lang/UnsupportedOperationException;
        //  1110   1116   3      8      Ljava/lang/IllegalStateException;
        //  1110   1116   1109   1110   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1110   1116   1116   1117   Ljava/lang/IllegalArgumentException;
        //  1219   1226   1226   1227   Any
        //  1219   1226   1219   1220   Any
        //  1219   1226   1219   1220   Any
        //  1220   1226   1226   1227   Ljava/lang/ArithmeticException;
        //  1219   1226   1219   1220   Ljava/lang/NumberFormatException;
        //  1235   1242   1242   1243   Any
        //  1236   1242   1242   1243   Any
        //  1235   1242   3      8      Any
        //  1235   1242   1235   1236   Any
        //  1235   1242   3      8      Any
        //  1251   1258   1258   1259   Any
        //  1251   1258   3      8      Any
        //  1251   1258   3      8      Any
        //  1252   1258   1251   1252   Ljava/lang/ArithmeticException;
        //  1251   1258   3      8      Ljava/util/NoSuchElementException;
        //  1270   1277   1277   1278   Any
        //  1270   1277   3      8      Any
        //  1270   1277   1270   1271   Any
        //  1270   1277   1277   1278   Ljava/lang/AssertionError;
        //  1270   1277   1277   1278   Any
        //  1282   1288   1288   1289   Any
        //  1282   1288   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1282   1288   3      8      Ljava/lang/NumberFormatException;
        //  1282   1288   1288   1289   Ljava/util/ConcurrentModificationException;
        //  1282   1288   1288   1289   Any
        //  1344   1350   1350   1351   Any
        //  1344   1350   3      8      Any
        //  1344   1350   3      8      Any
        //  1344   1350   3      8      Any
        //  1344   1350   3      8      Any
        //  1366   1372   1372   1373   Any
        //  1366   1372   1372   1373   Any
        //  1366   1372   3      8      Ljava/lang/ClassCastException;
        //  1366   1372   3      8      Ljava/util/NoSuchElementException;
        //  1366   1372   1372   1373   Any
        //  1384   1391   1391   1392   Any
        //  1384   1391   3      8      Any
        //  1385   1391   1384   1385   Ljava/lang/NullPointerException;
        //  1385   1391   3      8      Any
        //  1384   1391   3      8      Any
        //  1395   1402   1402   1403   Any
        //  1396   1402   1395   1396   Ljava/lang/NumberFormatException;
        //  1396   1402   1402   1403   Any
        //  1396   1402   3      8      Any
        //  1396   1402   1402   1403   Ljava/lang/IllegalArgumentException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:600)
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
    public int c(@NotNull final f0w f0w, @NotNull final f0y f0y) {
        return fbS.95(this, 1417605206, f0w, f0y);
    }
    
    public void c(final int n) {
        fbS.68(this, 623385736, n);
    }
}
