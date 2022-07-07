// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import org.jetbrains.annotations.Nullable;
import net.minecraft.inventory.IInventory;
import org.jetbrains.annotations.NotNull;

public class f6p extends fH
{
    @NotNull
    public f6n c;
    @NotNull
    public f0f<f6o> c;
    @NotNull
    public f0a c;
    @NotNull
    public f0d c;
    @NotNull
    public fbu c;
    @Nullable
    public IInventory c;
    
    public void 2() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          380
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            372
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            364
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: nop            
        //    25: new             Ljava/io/FileWriter;
        //    28: dup            
        //    29: ldc             "\u2238\u148a\u8b33\ub196\ucfe8\uec2d\ub22c\ue709\udb3b\uefc0\ua6fd\u1e58\ue02d\uc7e6\u875f\u88b0\u57b6\u76f6\ubf74\uc67c\u2adf\uc236\u6bd2\u2f58\ud1bc\u345e\u7d24\u886c"
        //    31: goto            35
        //    34: athrow         
        //    35: invokestatic    invokestatic   !!! ERROR
        //    38: goto            42
        //    41: athrow         
        //    42: goto            46
        //    45: athrow         
        //    46: invokespecial   java/io/FileWriter.<init>:(Ljava/lang/String;)V
        //    49: goto            53
        //    52: athrow         
        //    53: getstatic       dev/nuker/pyro/fc.0:I
        //    56: ifeq            64
        //    59: ldc             -2056040822
        //    61: goto            66
        //    64: ldc             232914663
        //    66: ldc             -2075940761
        //    68: ixor           
        //    69: lookupswitch {
        //          -1985849728: 96
        //          19982061: 64
        //          default: 353
        //        }
        //    96: astore_1       
        //    97: getstatic       dev/nuker/pyro/Pyro.GSON:Lcom/google/gson/Gson;
        //   100: getstatic       dev/nuker/pyro/fc.c:I
        //   103: ifge            111
        //   106: ldc             -465120529
        //   108: goto            113
        //   111: ldc             1709858603
        //   113: ldc             -1078785474
        //   115: ixor           
        //   116: lookupswitch {
        //          -631679723: 144
        //          1542838481: 111
        //          default: 349
        //        }
        //   144: aload_0        
        //   145: getfield        dev/nuker/pyro/f6p.c:Ldev/nuker/pyro/f6n;
        //   148: dup            
        //   149: ifnonnull       218
        //   152: ldc             "\u223b\u1487\u8b2e\ub18b\ucfa6\uec29\ub221"
        //   154: getstatic       dev/nuker/pyro/fc.0:I
        //   157: ifeq            165
        //   160: ldc             827940344
        //   162: goto            167
        //   165: ldc             1312834765
        //   167: ldc             1067658768
        //   169: ixor           
        //   170: lookupswitch {
        //          251294696: 165
        //          1910729437: 196
        //          default: 351
        //        }
        //   196: goto            200
        //   199: athrow         
        //   200: invokestatic    invokestatic   !!! ERROR
        //   203: goto            207
        //   206: athrow         
        //   207: goto            211
        //   210: athrow         
        //   211: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   214: goto            218
        //   217: athrow         
        //   218: getstatic       dev/nuker/pyro/fc.1:I
        //   221: ifeq            229
        //   224: ldc             -1851750963
        //   226: goto            231
        //   229: ldc             959837370
        //   231: ldc             1043974425
        //   233: ixor           
        //   234: lookupswitch {
        //          -1348907820: 345
        //          578118991: 229
        //          default: 260
        //        }
        //   260: aload_1        
        //   261: checkcast       Ljava/lang/Appendable;
        //   264: goto            268
        //   267: athrow         
        //   268: invokevirtual   com/google/gson/Gson.toJson:(Ljava/lang/Object;Ljava/lang/Appendable;)V
        //   271: goto            275
        //   274: athrow         
        //   275: getstatic       dev/nuker/pyro/fc.0:I
        //   278: ifeq            286
        //   281: ldc             1394134336
        //   283: goto            288
        //   286: ldc             -403370463
        //   288: ldc             1933182951
        //   290: ixor           
        //   291: lookupswitch {
        //          -1798370874: 316
        //          539151015: 286
        //          default: 347
        //        }
        //   316: aload_1        
        //   317: goto            321
        //   320: athrow         
        //   321: invokevirtual   java/io/FileWriter.close:()V
        //   324: goto            328
        //   327: athrow         
        //   328: goto            344
        //   331: astore_1       
        //   332: aload_1        
        //   333: goto            337
        //   336: athrow         
        //   337: invokevirtual   java/io/IOException.printStackTrace:()V
        //   340: goto            344
        //   343: athrow         
        //   344: return         
        //   345: aconst_null    
        //   346: athrow         
        //   347: aconst_null    
        //   348: athrow         
        //   349: aconst_null    
        //   350: athrow         
        //   351: aconst_null    
        //   352: athrow         
        //   353: aconst_null    
        //   354: athrow         
        //   355: pop            
        //   356: goto            24
        //   359: pop            
        //   360: aconst_null    
        //   361: goto            355
        //   364: dup            
        //   365: ifnull          355
        //   368: checkcast       Ljava/lang/Throwable;
        //   371: athrow         
        //   372: dup            
        //   373: ifnull          359
        //   376: checkcast       Ljava/lang/Throwable;
        //   379: athrow         
        //   380: aconst_null    
        //   381: athrow         
        //    StackMapTable: 00 3A 43 07 00 2E 04 FF 00 0B 00 00 00 01 07 00 2E FC 00 03 07 00 03 49 07 00 1B FF 00 00 00 01 07 00 03 00 03 08 00 19 08 00 19 07 00 6F 45 07 00 2E FF 00 00 00 01 07 00 03 00 03 08 00 19 08 00 19 07 00 6F 42 07 00 2E FF 00 00 00 01 07 00 03 00 03 08 00 19 08 00 19 07 00 6F 45 07 00 2E 40 07 00 30 4A 07 00 30 FF 00 01 00 01 07 00 03 00 02 07 00 30 01 5D 07 00 30 FF 00 0E 00 02 07 00 03 07 00 30 00 01 07 00 60 FF 00 01 00 02 07 00 03 07 00 30 00 02 07 00 60 01 5E 07 00 60 FF 00 14 00 02 07 00 03 07 00 30 00 03 07 00 60 07 00 71 07 00 6F FF 00 01 00 02 07 00 03 07 00 30 00 04 07 00 60 07 00 71 07 00 6F 01 FF 00 1C 00 02 07 00 03 07 00 30 00 03 07 00 60 07 00 71 07 00 6F FF 00 02 00 00 00 01 07 00 2E FF 00 00 00 02 07 00 03 07 00 30 00 03 07 00 60 07 00 71 07 00 6F 45 07 00 2E FF 00 00 00 02 07 00 03 07 00 30 00 03 07 00 60 07 00 71 07 00 6F 42 07 00 23 FF 00 00 00 02 07 00 03 07 00 30 00 03 07 00 60 07 00 71 07 00 6F 45 07 00 2E FF 00 00 00 02 07 00 03 07 00 30 00 02 07 00 60 07 00 71 FF 00 0A 00 02 07 00 03 07 00 30 00 02 07 00 60 07 00 71 FF 00 01 00 02 07 00 03 07 00 30 00 03 07 00 60 07 00 71 01 FF 00 1C 00 02 07 00 03 07 00 30 00 02 07 00 60 07 00 71 FF 00 06 00 00 00 01 07 00 2E FF 00 00 00 02 07 00 03 07 00 30 00 03 07 00 60 07 00 71 07 00 5E 45 07 00 2E 00 0A 41 01 1B FF 00 03 00 00 00 01 07 00 2E FF 00 00 00 02 07 00 03 07 00 30 00 01 07 00 30 45 07 00 2E 00 FF 00 02 00 01 07 00 03 00 01 07 00 13 FF 00 04 00 00 00 01 07 00 2E FF 00 00 00 02 07 00 03 07 00 13 00 01 07 00 13 45 07 00 2E FF 00 00 00 02 07 00 03 07 00 73 00 00 FF 00 00 00 02 07 00 03 07 00 30 00 02 07 00 60 07 00 71 01 41 07 00 60 FF 00 01 00 02 07 00 03 07 00 30 00 03 07 00 60 07 00 71 07 00 6F FF 00 01 00 01 07 00 03 00 01 07 00 30 41 07 00 2E 43 05 44 07 00 2E 47 05 47 07 00 2E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  24     199    331    344    Ljava/io/IOException;
        //  200    267    331    344    Ljava/io/IOException;
        //  268    320    331    344    Ljava/io/IOException;
        //  321    328    331    344    Ljava/io/IOException;
        //  8      20     364    372    Ljava/lang/AssertionError;
        //  364    372    364    372    Ljava/lang/StringIndexOutOfBoundsException;
        //  380    382    3      8      Any
        //  34     41     41     42     Any
        //  34     41     3      8      Ljava/lang/NegativeArraySizeException;
        //  34     41     34     35     Ljava/lang/UnsupportedOperationException;
        //  35     41     41     42     Any
        //  35     41     3      8      Any
        //  45     52     52     53     Any
        //  45     52     45     46     Any
        //  46     52     52     53     Any
        //  46     52     52     53     Any
        //  46     52     3      8      Ljava/lang/AssertionError;
        //  200    206    206    207    Any
        //  200    206    3      8      Ljava/util/NoSuchElementException;
        //  200    206    206    207    Any
        //  200    206    3      8      Any
        //  200    206    206    207    Ljava/lang/ArithmeticException;
        //  210    217    217    218    Any
        //  210    217    217    218    Ljava/lang/NumberFormatException;
        //  211    217    210    211    Ljava/lang/IndexOutOfBoundsException;
        //  210    217    3      8      Any
        //  210    217    3      8      Any
        //  268    274    274    275    Any
        //  268    274    274    275    Any
        //  268    274    3      8      Ljava/lang/NumberFormatException;
        //  268    274    3      8      Any
        //  268    274    274    275    Ljava/lang/IndexOutOfBoundsException;
        //  321    327    327    328    Any
        //  321    327    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  321    327    327    328    Any
        //  321    327    327    328    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  321    327    327    328    Ljava/lang/ArithmeticException;
        //  337    343    343    344    Any
        //  337    343    343    344    Any
        //  337    343    3      8      Any
        //  337    343    3      8      Any
        //  337    343    3      8      Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0218 (coming from #0217).
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2183)
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
    public f0a 1() {
        return fbS.0q(this, 8898718);
    }
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f3h f3h) {
        fbS.hI(this, 1774571265, f3h);
    }
    
    public void 0(@Nullable final IInventory inventory) {
        fbS.3P(this, 1646846347, inventory);
    }
    
    public void c(@NotNull final IInventory inventory) {
        fbS.3P(this, 1646846348, inventory);
    }
    
    public boolean c(@NotNull final Item p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          295
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            287
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            279
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/fc.c:I
        //    29: ifge            37
        //    32: ldc             -1725885253
        //    34: goto            39
        //    37: ldc             -517059036
        //    39: ldc             1208554402
        //    41: ixor           
        //    42: lookupswitch {
        //          -1457037946: 68
        //          -785905895: 37
        //          default: 268
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f6p.c:Ldev/nuker/pyro/fw;
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //    79: goto            83
        //    82: athrow         
        //    83: dup            
        //    84: pop            
        //    85: checkcast       Ljava/lang/Boolean;
        //    88: goto            92
        //    91: athrow         
        //    92: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    95: goto            99
        //    98: athrow         
        //    99: ifeq            264
        //   102: aload_0        
        //   103: getfield        dev/nuker/pyro/f6p.c:Ldev/nuker/pyro/f6n;
        //   106: dup            
        //   107: ifnonnull       134
        //   110: ldc             "\u223b\u1487\u8b2e\ub1da\ucf97\uec29\ub221"
        //   112: goto            116
        //   115: athrow         
        //   116: invokestatic    invokestatic   !!! ERROR
        //   119: goto            123
        //   122: athrow         
        //   123: goto            127
        //   126: athrow         
        //   127: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   130: goto            134
        //   133: athrow         
        //   134: goto            138
        //   137: athrow         
        //   138: invokevirtual   dev/nuker/pyro/f6n.c:()Ljava/util/List;
        //   141: goto            145
        //   144: athrow         
        //   145: getstatic       net/minecraft/item/Item.field_150901_e:Lnet/minecraft/util/registry/RegistryNamespaced;
        //   148: aload_1        
        //   149: goto            153
        //   152: athrow         
        //   153: invokevirtual   net/minecraft/util/registry/RegistryNamespaced.func_177774_c:(Ljava/lang/Object;)Ljava/lang/Object;
        //   156: goto            160
        //   159: athrow         
        //   160: goto            164
        //   163: athrow         
        //   164: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   167: goto            171
        //   170: athrow         
        //   171: getstatic       dev/nuker/pyro/fc.c:I
        //   174: ifge            182
        //   177: ldc             1444110943
        //   179: goto            184
        //   182: ldc             -161722982
        //   184: ldc             -374418788
        //   186: ixor           
        //   187: lookupswitch {
        //          -1078087485: 182
        //          535994118: 212
        //          default: 266
        //        }
        //   212: goto            216
        //   215: athrow         
        //   216: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   221: goto            225
        //   224: athrow         
        //   225: ifeq            233
        //   228: ldc             -1982000063
        //   230: goto            235
        //   233: ldc             -1982000062
        //   235: ldc             -1060900420
        //   237: ixor           
        //   238: tableswitch {
        //          -1841443846: 260
        //          -1841443845: 264
        //          default: 228
        //        }
        //   260: iconst_1       
        //   261: goto            265
        //   264: iconst_0       
        //   265: ireturn        
        //   266: aconst_null    
        //   267: athrow         
        //   268: aconst_null    
        //   269: athrow         
        //   270: pop            
        //   271: goto            24
        //   274: pop            
        //   275: aconst_null    
        //   276: goto            270
        //   279: dup            
        //   280: ifnull          270
        //   283: checkcast       Ljava/lang/Throwable;
        //   286: athrow         
        //   287: dup            
        //   288: ifnull          274
        //   291: checkcast       Ljava/lang/Throwable;
        //   294: athrow         
        //   295: aconst_null    
        //   296: athrow         
        //    StackMapTable: 00 37 43 07 00 2E 04 FF 00 0B 00 00 00 01 07 00 2E FD 00 03 07 00 03 07 00 AB 0C 41 01 1C 46 07 00 2E 40 07 00 9B 45 07 00 2E 40 07 00 73 47 07 00 2E 40 07 00 A0 45 07 00 2E 40 01 4F 07 00 2E FF 00 00 00 02 07 00 03 07 00 AB 00 02 07 00 71 07 00 6F 45 07 00 2E FF 00 00 00 02 07 00 03 07 00 AB 00 02 07 00 71 07 00 6F 42 07 00 2E FF 00 00 00 02 07 00 03 07 00 AB 00 02 07 00 71 07 00 6F 45 07 00 2E 40 07 00 71 42 07 00 2E 40 07 00 71 45 07 00 2E 40 07 00 BE 46 07 00 2E FF 00 00 00 02 07 00 03 07 00 AB 00 03 07 00 BE 07 00 B1 07 00 AB 45 07 00 2E FF 00 00 00 02 07 00 03 07 00 AB 00 02 07 00 BE 07 00 73 42 07 00 17 FF 00 00 00 02 07 00 03 07 00 AB 00 02 07 00 BE 07 00 73 45 07 00 2E FF 00 00 00 02 07 00 03 07 00 AB 00 02 07 00 BE 07 00 6F FF 00 0A 00 02 07 00 03 07 00 AB 00 02 07 00 BE 07 00 6F FF 00 01 00 02 07 00 03 07 00 AB 00 03 07 00 BE 07 00 6F 01 FF 00 1B 00 02 07 00 03 07 00 AB 00 02 07 00 BE 07 00 6F FF 00 02 00 00 00 01 07 00 2E FF 00 00 00 02 07 00 03 07 00 AB 00 02 07 00 BE 07 00 6F 47 07 00 2E 40 01 02 04 41 01 18 03 40 01 FF 00 00 00 02 07 00 03 07 00 AB 00 02 07 00 BE 07 00 6F 01 41 07 00 2E 43 05 44 07 00 2E 47 05 47 07 00 2E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     279    287    Ljava/lang/EnumConstantNotPresentException;
        //  279    287    279    287    Any
        //  295    297    3      8      Ljava/lang/IllegalArgumentException;
        //  75     82     82     83     Any
        //  76     82     75     76     Any
        //  75     82     82     83     Any
        //  75     82     3      8      Any
        //  75     82     82     83     Any
        //  91     98     98     99     Any
        //  92     98     91     92     Ljava/lang/IllegalStateException;
        //  92     98     3      8      Ljava/lang/NumberFormatException;
        //  91     98     3      8      Ljava/lang/NumberFormatException;
        //  92     98     91     92     Any
        //  115    122    122    123    Any
        //  115    122    115    116    Any
        //  115    122    115    116    Ljava/util/NoSuchElementException;
        //  115    122    115    116    Ljava/lang/ClassCastException;
        //  115    122    115    116    Any
        //  126    133    133    134    Any
        //  126    133    126    127    Any
        //  127    133    126    127    Ljava/lang/IllegalStateException;
        //  127    133    133    134    Any
        //  127    133    133    134    Any
        //  137    144    144    145    Any
        //  138    144    3      8      Any
        //  138    144    137    138    Any
        //  137    144    137    138    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  137    144    137    138    Any
        //  152    159    159    160    Any
        //  153    159    159    160    Ljava/lang/IndexOutOfBoundsException;
        //  152    159    152    153    Ljava/lang/AssertionError;
        //  152    159    152    153    Any
        //  152    159    152    153    Any
        //  163    170    170    171    Any
        //  163    170    170    171    Any
        //  164    170    170    171    Any
        //  164    170    163    164    Ljava/lang/StringIndexOutOfBoundsException;
        //  164    170    170    171    Ljava/lang/NumberFormatException;
        //  216    224    224    225    Any
        //  216    224    224    225    Ljava/lang/RuntimeException;
        //  216    224    224    225    Any
        //  216    224    224    225    Ljava/lang/UnsupportedOperationException;
        //  216    224    224    225    Any
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
    
    public void c(@NotNull final f0f c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0087:
            while (true) {
            Block_4_Outer:
                do {
                    Label_0074: {
                        break Label_0074;
                        try {
                            o = null;
                            if (fc.0 <= 0) {
                                null;
                                goto Label_0079;
                            }
                            continue Label_0087;
                            Label_0027: {
                                final int n = 6779165;
                            }
                            // switch([Lcom.strobel.decompiler.ast.Label;@4b516f97, n ^ 0x953799D5)
                            // iftrue(Label_0027:, fc.c >= 0)
                            while (true) {
                                while (true) {
                                    Label_0068:
                                    throw null;
                                    final int n = -1399889875;
                                    continue Block_4_Outer;
                                }
                                continue;
                            }
                            Label_0060:
                            this.c = (f0f<f6o>)c;
                            return;
                        }
                        catch (StringIndexOutOfBoundsException ex) {}
                    }
                    continue Label_0087;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    @Nullable
    public IInventory c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            38
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            30
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getfield        dev/nuker/pyro/f6p.c:Lnet/minecraft/inventory/IInventory;
        //    20: areturn        
        //    21: pop            
        //    22: goto            16
        //    25: pop            
        //    26: aconst_null    
        //    27: goto            21
        //    30: dup            
        //    31: ifnull          21
        //    34: checkcast       Ljava/lang/Throwable;
        //    37: athrow         
        //    38: dup            
        //    39: ifnull          25
        //    42: checkcast       Ljava/lang/Throwable;
        //    45: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 2E FC 00 03 07 00 03 44 07 00 2E 43 05 44 07 00 2E 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  0      12     30     38     Any
        //  30     38     30     38     Ljava/util/NoSuchElementException;
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
    
    public void 4() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1017
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1009
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1001
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/io/File;
        //    27: dup            
        //    28: ldc             "\u2238\u148a\u8b33\ub190\ucfea\uec2d\ub22c\ue709\udb3d\uefc2\ua6fd\u1e58\ue02d\uc7e0\u875d\u88b0\u57b6\u76f6\ubf72\uc67e\u2adf\uc236\u6bd2\u2f5e\ud1be\u345e\u7d24\u886c"
        //    30: goto            34
        //    33: athrow         
        //    34: invokestatic    invokestatic   !!! ERROR
        //    37: goto            41
        //    40: athrow         
        //    41: getstatic       dev/nuker/pyro/fc.c:I
        //    44: ifge            52
        //    47: ldc             4662106
        //    49: goto            54
        //    52: ldc             572767031
        //    54: ldc             -122919764
        //    56: ixor           
        //    57: lookupswitch {
        //          -628105317: 84
        //          -118798346: 52
        //          default: 982
        //        }
        //    84: goto            88
        //    87: athrow         
        //    88: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    91: goto            95
        //    94: athrow         
        //    95: goto            99
        //    98: athrow         
        //    99: invokevirtual   java/io/File.exists:()Z
        //   102: goto            106
        //   105: athrow         
        //   106: ifeq            283
        //   109: nop            
        //   110: new             Ljava/io/FileReader;
        //   113: dup            
        //   114: ldc             "\u2238\u148a\u8b33\ub190\ucfea\uec2d\ub22c\ue709\udb3d\uefc2\ua6fd\u1e58\ue02d\uc7e0\u875d\u88b0\u57b6\u76f6\ubf72\uc67e\u2adf\uc236\u6bd2\u2f5e\ud1be\u345e\u7d24\u886c"
        //   116: goto            120
        //   119: athrow         
        //   120: invokestatic    invokestatic   !!! ERROR
        //   123: goto            127
        //   126: athrow         
        //   127: goto            131
        //   130: athrow         
        //   131: invokespecial   java/io/FileReader.<init>:(Ljava/lang/String;)V
        //   134: goto            138
        //   137: athrow         
        //   138: astore_1       
        //   139: getstatic       dev/nuker/pyro/fc.c:I
        //   142: ifge            150
        //   145: ldc             -1988641198
        //   147: goto            152
        //   150: ldc             -504071285
        //   152: ldc             -1880466573
        //   154: ixor           
        //   155: lookupswitch {
        //          111011105: 150
        //          1847468280: 180
        //          default: 970
        //        }
        //   180: aload_0        
        //   181: getstatic       dev/nuker/pyro/Pyro.GSON:Lcom/google/gson/Gson;
        //   184: aload_1        
        //   185: checkcast       Ljava/io/Reader;
        //   188: ldc             Ldev/nuker/pyro/f6n;.class
        //   190: goto            194
        //   193: athrow         
        //   194: invokevirtual   com/google/gson/Gson.fromJson:(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;
        //   197: goto            201
        //   200: athrow         
        //   201: dup            
        //   202: pop            
        //   203: checkcast       Ldev/nuker/pyro/f6n;
        //   206: putfield        dev/nuker/pyro/f6p.c:Ldev/nuker/pyro/f6n;
        //   209: aload_1        
        //   210: goto            214
        //   213: athrow         
        //   214: invokevirtual   java/io/FileReader.close:()V
        //   217: goto            221
        //   220: athrow         
        //   221: goto            969
        //   224: astore_1       
        //   225: getstatic       dev/nuker/pyro/fc.1:I
        //   228: ifeq            236
        //   231: ldc             -1018536507
        //   233: goto            238
        //   236: ldc             -85941669
        //   238: ldc             -367676206
        //   240: ixor           
        //   241: lookupswitch {
        //          694151447: 984
        //          1738916051: 236
        //          default: 268
        //        }
        //   268: aload_1        
        //   269: goto            273
        //   272: athrow         
        //   273: invokevirtual   java/io/IOException.printStackTrace:()V
        //   276: goto            280
        //   279: athrow         
        //   280: goto            969
        //   283: getstatic       dev/nuker/pyro/fc.1:I
        //   286: ifeq            294
        //   289: ldc             -2127033982
        //   291: goto            296
        //   294: ldc             1652788772
        //   296: ldc             352393578
        //   298: ixor           
        //   299: lookupswitch {
        //          -1808199448: 294
        //          2005047118: 324
        //          default: 972
        //        }
        //   324: aload_0        
        //   325: new             Ldev/nuker/pyro/f6n;
        //   328: dup            
        //   329: goto            333
        //   332: athrow         
        //   333: invokespecial   dev/nuker/pyro/f6n.<init>:()V
        //   336: goto            340
        //   339: athrow         
        //   340: putfield        dev/nuker/pyro/f6p.c:Ldev/nuker/pyro/f6n;
        //   343: aload_0        
        //   344: getfield        dev/nuker/pyro/f6p.c:Ldev/nuker/pyro/f6n;
        //   347: dup            
        //   348: ifnonnull       419
        //   351: ldc             "\u223b\u1487\u8b2e\ub18d\ucfa4\uec29\ub221"
        //   353: goto            357
        //   356: athrow         
        //   357: invokestatic    invokestatic   !!! ERROR
        //   360: goto            364
        //   363: athrow         
        //   364: getstatic       dev/nuker/pyro/fc.1:I
        //   367: ifeq            375
        //   370: ldc             1063892435
        //   372: goto            377
        //   375: ldc             -1338929217
        //   377: ldc             -2044038070
        //   379: ixor           
        //   380: lookupswitch {
        //          -1186741863: 375
        //          907803637: 408
        //          default: 980
        //        }
        //   408: goto            412
        //   411: athrow         
        //   412: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   415: goto            419
        //   418: athrow         
        //   419: iconst_4       
        //   420: anewarray       Lnet/minecraft/item/Item;
        //   423: dup            
        //   424: iconst_0       
        //   425: getstatic       net/minecraft/init/Items.field_185158_cP:Lnet/minecraft/item/Item;
        //   428: aastore        
        //   429: dup            
        //   430: iconst_1       
        //   431: getstatic       net/minecraft/init/Items.field_151153_ao:Lnet/minecraft/item/Item;
        //   434: aastore        
        //   435: dup            
        //   436: iconst_2       
        //   437: getstatic       net/minecraft/init/Items.field_151062_by:Lnet/minecraft/item/Item;
        //   440: aastore        
        //   441: dup            
        //   442: iconst_3       
        //   443: getstatic       net/minecraft/init/Items.field_151068_bn:Lnet/minecraft/item/ItemPotion;
        //   446: checkcast       Lnet/minecraft/item/Item;
        //   449: aastore        
        //   450: goto            454
        //   453: athrow         
        //   454: invokestatic    kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
        //   457: goto            461
        //   460: athrow         
        //   461: checkcast       Ljava/lang/Iterable;
        //   464: astore_1       
        //   465: getstatic       dev/nuker/pyro/fc.c:I
        //   468: ifge            477
        //   471: ldc_w           877803026
        //   474: goto            480
        //   477: ldc_w           -2076291722
        //   480: ldc_w           495540965
        //   483: ixor           
        //   484: lookupswitch {
        //          -1716054125: 512
        //          702246135: 477
        //          default: 974
        //        }
        //   512: astore          10
        //   514: iconst_0       
        //   515: istore_2       
        //   516: aload_1        
        //   517: astore_3       
        //   518: new             Ljava/util/ArrayList;
        //   521: dup            
        //   522: aload_1        
        //   523: bipush          10
        //   525: goto            529
        //   528: athrow         
        //   529: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   532: goto            536
        //   535: athrow         
        //   536: goto            540
        //   539: athrow         
        //   540: invokespecial   java/util/ArrayList.<init>:(I)V
        //   543: goto            547
        //   546: athrow         
        //   547: checkcast       Ljava/util/Collection;
        //   550: astore          4
        //   552: iconst_0       
        //   553: istore          5
        //   555: aload_3        
        //   556: goto            560
        //   559: athrow         
        //   560: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   565: goto            569
        //   568: athrow         
        //   569: astore          6
        //   571: aload           6
        //   573: goto            577
        //   576: athrow         
        //   577: invokeinterface java/util/Iterator.hasNext:()Z
        //   582: goto            586
        //   585: athrow         
        //   586: ifeq            595
        //   589: ldc_w           118131022
        //   592: goto            598
        //   595: ldc_w           118131021
        //   598: ldc_w           2129504903
        //   601: ixor           
        //   602: tableswitch {
        //          -204585070: 624
        //          -204585069: 841
        //          default: 589
        //        }
        //   624: aload           6
        //   626: goto            630
        //   629: athrow         
        //   630: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   635: goto            639
        //   638: athrow         
        //   639: astore          7
        //   641: aload           4
        //   643: aload           7
        //   645: checkcast       Lnet/minecraft/item/Item;
        //   648: astore          8
        //   650: getstatic       dev/nuker/pyro/fc.1:I
        //   653: ifeq            662
        //   656: ldc_w           -739223917
        //   659: goto            665
        //   662: ldc_w           440629447
        //   665: ldc_w           392946352
        //   668: ixor           
        //   669: lookupswitch {
        //          -996428765: 976
        //          828754097: 662
        //          default: 696
        //        }
        //   696: astore          11
        //   698: iconst_0       
        //   699: istore          9
        //   701: getstatic       net/minecraft/item/Item.field_150901_e:Lnet/minecraft/util/registry/RegistryNamespaced;
        //   704: getstatic       dev/nuker/pyro/fc.0:I
        //   707: ifeq            716
        //   710: ldc_w           384728053
        //   713: goto            719
        //   716: ldc_w           -1684950656
        //   719: ldc_w           1210781269
        //   722: ixor           
        //   723: lookupswitch {
        //          -742735915: 748
        //          1589999008: 716
        //          default: 986
        //        }
        //   748: aload           8
        //   750: goto            754
        //   753: athrow         
        //   754: invokevirtual   net/minecraft/util/registry/RegistryNamespaced.func_177774_c:(Ljava/lang/Object;)Ljava/lang/Object;
        //   757: goto            761
        //   760: athrow         
        //   761: goto            765
        //   764: athrow         
        //   765: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   768: goto            772
        //   771: athrow         
        //   772: astore          12
        //   774: getstatic       dev/nuker/pyro/fc.0:I
        //   777: ifeq            786
        //   780: ldc_w           -886940971
        //   783: goto            789
        //   786: ldc_w           -1952422869
        //   789: ldc_w           1861739454
        //   792: ixor           
        //   793: lookupswitch {
        //          -2115941073: 786
        //          -1512720021: 978
        //          default: 820
        //        }
        //   820: aload           11
        //   822: aload           12
        //   824: goto            828
        //   827: athrow         
        //   828: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   833: goto            837
        //   836: athrow         
        //   837: pop            
        //   838: goto            571
        //   841: getstatic       dev/nuker/pyro/fc.0:I
        //   844: ifeq            853
        //   847: ldc_w           -440674209
        //   850: goto            856
        //   853: ldc_w           1294910360
        //   856: ldc_w           -687857600
        //   859: ixor           
        //   860: lookupswitch {
        //          68320096: 853
        //          851179551: 988
        //          default: 888
        //        }
        //   888: aload           4
        //   890: checkcast       Ljava/util/List;
        //   893: astore          11
        //   895: getstatic       dev/nuker/pyro/fc.1:I
        //   898: ifeq            907
        //   901: ldc_w           70971776
        //   904: goto            910
        //   907: ldc_w           1913927497
        //   910: ldc_w           -1713861175
        //   913: ixor           
        //   914: lookupswitch {
        //          -1646101431: 990
        //          -423665287: 907
        //          default: 940
        //        }
        //   940: aload           10
        //   942: aload           11
        //   944: checkcast       Ljava/util/Collection;
        //   947: goto            951
        //   950: athrow         
        //   951: invokestatic    kotlin/collections/CollectionsKt.toMutableList:(Ljava/util/Collection;)Ljava/util/List;
        //   954: goto            958
        //   957: athrow         
        //   958: goto            962
        //   961: athrow         
        //   962: invokevirtual   dev/nuker/pyro/f6n.c:(Ljava/util/List;)V
        //   965: goto            969
        //   968: athrow         
        //   969: return         
        //   970: aconst_null    
        //   971: athrow         
        //   972: aconst_null    
        //   973: athrow         
        //   974: aconst_null    
        //   975: athrow         
        //   976: aconst_null    
        //   977: athrow         
        //   978: aconst_null    
        //   979: athrow         
        //   980: aconst_null    
        //   981: athrow         
        //   982: aconst_null    
        //   983: athrow         
        //   984: aconst_null    
        //   985: athrow         
        //   986: aconst_null    
        //   987: athrow         
        //   988: aconst_null    
        //   989: athrow         
        //   990: aconst_null    
        //   991: athrow         
        //   992: pop            
        //   993: goto            24
        //   996: pop            
        //   997: aconst_null    
        //   998: goto            992
        //  1001: dup            
        //  1002: ifnull          992
        //  1005: checkcast       Ljava/lang/Throwable;
        //  1008: athrow         
        //  1009: dup            
        //  1010: ifnull          996
        //  1013: checkcast       Ljava/lang/Throwable;
        //  1016: athrow         
        //  1017: aconst_null    
        //  1018: athrow         
        //    StackMapTable: 00 95 43 07 00 2E 04 FF 00 0B 00 00 00 01 07 00 2E FC 00 03 07 00 03 48 07 00 2E FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 6F 45 07 00 2E FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 6F FF 00 0A 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 6F FF 00 01 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 6F 01 FF 00 1D 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 6F FF 00 02 00 00 00 01 07 00 2E FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 6F 45 07 00 2E 40 07 00 D7 42 07 00 25 40 07 00 D7 45 07 00 2E 40 01 4C 07 00 27 FF 00 00 00 01 07 00 03 00 03 08 00 6E 08 00 6E 07 00 6F 45 07 00 2E FF 00 00 00 01 07 00 03 00 03 08 00 6E 08 00 6E 07 00 6F 42 07 00 2E FF 00 00 00 01 07 00 03 00 03 08 00 6E 08 00 6E 07 00 6F 45 07 00 2E 40 07 00 E2 FC 00 0B 07 00 E2 41 01 1B FF 00 0C 00 00 00 01 07 00 2E FF 00 00 00 02 07 00 03 07 00 E2 00 04 07 00 03 07 00 60 07 00 E8 07 01 4A 45 07 00 2E FF 00 00 00 02 07 00 03 07 00 E2 00 02 07 00 03 07 00 73 4B 07 00 2E 40 07 00 E2 45 07 00 2E 00 FF 00 02 00 01 07 00 03 00 01 07 00 13 FC 00 0B 07 00 13 41 01 1D 43 07 00 2E 40 07 00 13 45 07 00 2E 00 FA 00 02 0A 41 01 1B 47 07 00 2E FF 00 00 00 01 07 00 03 00 03 07 00 03 08 01 45 08 01 45 45 07 00 2E FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 71 4F 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 71 07 00 6F 45 07 00 2E FF 00 00 00 01 07 00 03 00 02 07 00 71 07 00 6F FF 00 0A 00 01 07 00 03 00 02 07 00 71 07 00 6F FF 00 01 00 01 07 00 03 00 03 07 00 71 07 00 6F 01 FF 00 1E 00 01 07 00 03 00 02 07 00 71 07 00 6F FF 00 02 00 00 00 01 07 00 2E FF 00 00 00 01 07 00 03 00 02 07 00 71 07 00 6F 45 07 00 2E 40 07 00 71 61 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 71 07 01 4C 45 07 00 2E FF 00 00 00 01 07 00 03 00 02 07 00 71 07 00 BE FF 00 0F 00 02 07 00 03 07 01 12 00 01 07 00 71 FF 00 02 00 02 07 00 03 07 01 12 00 02 07 00 71 01 5F 07 00 71 FF 00 0F 00 0B 07 00 03 07 01 12 01 07 01 12 00 00 00 00 00 00 07 00 71 00 01 07 00 27 FF 00 00 00 0B 07 00 03 07 01 12 01 07 01 12 00 00 00 00 00 00 07 00 71 00 04 08 02 06 08 02 06 07 01 12 01 45 07 00 2E FF 00 00 00 0B 07 00 03 07 01 12 01 07 01 12 00 00 00 00 00 00 07 00 71 00 03 08 02 06 08 02 06 01 FF 00 02 00 00 00 01 07 00 2E FF 00 00 00 0B 07 00 03 07 01 12 01 07 01 12 00 00 00 00 00 00 07 00 71 00 03 08 02 06 08 02 06 01 45 07 00 2E 40 07 01 17 FF 00 0B 00 0B 07 00 03 07 01 12 01 07 01 12 07 01 20 01 00 00 00 00 07 00 71 00 01 07 00 2E 40 07 01 12 47 07 00 2E 40 07 01 26 FF 00 01 00 0B 07 00 03 07 01 12 01 07 01 12 07 01 20 01 07 01 26 00 00 00 07 00 71 00 00 44 07 00 8D 40 07 01 26 47 07 00 2E 40 01 02 05 42 01 19 44 07 00 2E 40 07 01 26 47 07 00 2E 40 07 00 73 FF 00 16 00 0B 07 00 03 07 01 12 01 07 01 12 07 01 20 01 07 01 26 07 00 73 07 00 AB 00 07 00 71 00 01 07 01 20 FF 00 02 00 0B 07 00 03 07 01 12 01 07 01 12 07 01 20 01 07 01 26 07 00 73 07 00 AB 00 07 00 71 00 02 07 01 20 01 5E 07 01 20 FF 00 13 00 0C 07 00 03 07 01 12 01 07 01 12 07 01 20 01 07 01 26 07 00 73 07 00 AB 01 07 00 71 07 01 20 00 01 07 00 B1 FF 00 02 00 0C 07 00 03 07 01 12 01 07 01 12 07 01 20 01 07 01 26 07 00 73 07 00 AB 01 07 00 71 07 01 20 00 02 07 00 B1 01 5C 07 00 B1 FF 00 04 00 00 00 01 07 00 2E FF 00 00 00 0C 07 00 03 07 01 12 01 07 01 12 07 01 20 01 07 01 26 07 00 73 07 00 AB 01 07 00 71 07 01 20 00 02 07 00 B1 07 00 AB 45 07 00 2E 40 07 00 73 42 07 00 2E 40 07 00 73 45 07 00 2E 40 07 00 6F FC 00 0D 07 00 6F 42 01 1E 46 07 00 8F FF 00 00 00 0D 07 00 03 07 01 12 01 07 01 12 07 01 20 01 07 01 26 07 00 73 07 00 AB 01 07 00 71 07 01 20 07 00 6F 00 02 07 01 20 07 00 6F 47 07 00 2E 40 01 FF 00 03 00 0B 07 00 03 07 01 12 01 07 01 12 07 01 20 01 07 01 26 00 00 00 07 00 71 00 00 0B 42 01 1F FC 00 12 07 00 BE 42 01 1D 49 07 00 2E FF 00 00 00 0C 07 00 03 07 01 12 01 07 01 12 07 01 20 01 07 01 26 00 00 00 07 00 71 07 00 BE 00 02 07 00 71 07 01 20 45 07 00 2E FF 00 00 00 0C 07 00 03 07 01 12 01 07 01 12 07 01 20 01 07 01 26 00 00 00 07 00 71 07 00 BE 00 02 07 00 71 07 00 BE FF 00 02 00 00 00 01 07 00 2E FF 00 00 00 0C 07 00 03 07 01 12 01 07 01 12 07 01 20 01 07 01 26 00 00 00 07 00 71 07 00 BE 00 02 07 00 71 07 00 BE 45 07 00 2E FF 00 00 00 02 07 00 03 07 00 73 00 00 FF 00 00 00 02 07 00 03 07 00 E2 00 00 FA 00 01 FF 00 01 00 02 07 00 03 07 01 12 00 01 07 00 71 FF 00 01 00 0B 07 00 03 07 01 12 01 07 01 12 07 01 20 01 07 01 26 07 00 73 07 00 AB 00 07 00 71 00 01 07 01 20 FF 00 01 00 0D 07 00 03 07 01 12 01 07 01 12 07 01 20 01 07 01 26 07 00 73 07 00 AB 01 07 00 71 07 01 20 07 00 6F 00 00 FF 00 01 00 01 07 00 03 00 02 07 00 71 07 00 6F FF 00 01 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 6F FC 00 01 07 00 13 FF 00 01 00 0C 07 00 03 07 01 12 01 07 01 12 07 01 20 01 07 01 26 07 00 73 07 00 AB 01 07 00 71 07 01 20 00 01 07 00 B1 FF 00 01 00 0B 07 00 03 07 01 12 01 07 01 12 07 01 20 01 07 01 26 00 00 00 07 00 71 00 00 FC 00 01 07 00 BE FF 00 01 00 01 07 00 03 00 01 07 00 27 43 05 44 07 00 27 47 05 47 07 00 2E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  109    193    224    283    Ljava/io/IOException;
        //  194    221    224    283    Ljava/io/IOException;
        //  8      20     1001   1009   Ljava/lang/RuntimeException;
        //  1001   1009   1001   1009   Ljava/lang/ClassCastException;
        //  1017   1019   3      8      Any
        //  33     40     40     41     Any
        //  34     40     40     41     Ljava/lang/IllegalStateException;
        //  33     40     40     41     Ljava/lang/IllegalArgumentException;
        //  33     40     40     41     Ljava/lang/NullPointerException;
        //  34     40     33     34     Any
        //  88     94     94     95     Any
        //  88     94     3      8      Any
        //  88     94     94     95     Any
        //  88     94     94     95     Any
        //  88     94     94     95     Any
        //  98     105    105    106    Any
        //  99     105    98     99     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  98     105    105    106    Any
        //  98     105    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  98     105    105    106    Ljava/lang/IllegalStateException;
        //  119    126    126    127    Any
        //  119    126    119    120    Ljava/lang/NullPointerException;
        //  119    126    126    127    Ljava/lang/StringIndexOutOfBoundsException;
        //  120    126    119    120    Ljava/lang/ClassCastException;
        //  119    126    3      8      Ljava/lang/NegativeArraySizeException;
        //  130    137    137    138    Any
        //  131    137    3      8      Any
        //  131    137    130    131    Ljava/lang/AssertionError;
        //  130    137    130    131    Ljava/util/NoSuchElementException;
        //  130    137    130    131    Ljava/lang/IllegalStateException;
        //  194    200    200    201    Any
        //  194    200    3      8      Any
        //  194    200    200    201    Ljava/lang/IllegalArgumentException;
        //  194    200    200    201    Ljava/lang/StringIndexOutOfBoundsException;
        //  194    200    3      8      Any
        //  213    220    220    221    Any
        //  213    220    3      8      Ljava/lang/NegativeArraySizeException;
        //  213    220    213    214    Any
        //  214    220    3      8      Any
        //  214    220    213    214    Any
        //  272    279    279    280    Any
        //  273    279    272    273    Any
        //  273    279    272    273    Ljava/util/ConcurrentModificationException;
        //  273    279    279    280    Ljava/lang/IllegalArgumentException;
        //  272    279    279    280    Ljava/lang/NumberFormatException;
        //  332    339    339    340    Any
        //  333    339    332    333    Any
        //  332    339    3      8      Any
        //  333    339    339    340    Ljava/util/NoSuchElementException;
        //  332    339    3      8      Any
        //  356    363    363    364    Any
        //  357    363    3      8      Any
        //  356    363    3      8      Any
        //  357    363    356    357    Ljava/lang/IllegalArgumentException;
        //  356    363    356    357    Ljava/lang/IndexOutOfBoundsException;
        //  412    418    418    419    Any
        //  412    418    3      8      Any
        //  412    418    418    419    Any
        //  412    418    3      8      Ljava/lang/ClassCastException;
        //  412    418    3      8      Any
        //  453    460    460    461    Any
        //  454    460    453    454    Ljava/lang/StringIndexOutOfBoundsException;
        //  453    460    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  454    460    453    454    Ljava/lang/EnumConstantNotPresentException;
        //  454    460    460    461    Any
        //  528    535    535    536    Any
        //  529    535    3      8      Any
        //  528    535    528    529    Ljava/lang/RuntimeException;
        //  528    535    535    536    Ljava/lang/EnumConstantNotPresentException;
        //  529    535    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  540    546    546    547    Any
        //  540    546    546    547    Ljava/lang/IllegalStateException;
        //  540    546    3      8      Ljava/lang/UnsupportedOperationException;
        //  540    546    3      8      Ljava/lang/NullPointerException;
        //  540    546    546    547    Ljava/util/ConcurrentModificationException;
        //  559    568    568    569    Any
        //  560    568    3      8      Ljava/lang/NullPointerException;
        //  560    568    568    569    Any
        //  560    568    559    560    Any
        //  560    568    568    569    Any
        //  576    585    585    586    Any
        //  577    585    585    586    Any
        //  577    585    585    586    Ljava/lang/StringIndexOutOfBoundsException;
        //  576    585    576    577    Ljava/lang/EnumConstantNotPresentException;
        //  576    585    3      8      Any
        //  629    638    638    639    Any
        //  629    638    638    639    Ljava/lang/ClassCastException;
        //  629    638    629    630    Any
        //  630    638    638    639    Any
        //  629    638    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  754    760    760    761    Any
        //  754    760    3      8      Any
        //  754    760    3      8      Any
        //  754    760    760    761    Ljava/lang/UnsupportedOperationException;
        //  754    760    760    761    Ljava/lang/RuntimeException;
        //  764    771    771    772    Any
        //  764    771    771    772    Any
        //  765    771    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  765    771    764    765    Ljava/lang/AssertionError;
        //  764    771    764    765    Any
        //  827    836    836    837    Any
        //  828    836    836    837    Ljava/lang/RuntimeException;
        //  827    836    827    828    Ljava/lang/IllegalArgumentException;
        //  828    836    836    837    Ljava/lang/UnsupportedOperationException;
        //  828    836    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  950    957    957    958    Any
        //  951    957    950    951    Any
        //  951    957    957    958    Any
        //  951    957    957    958    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  951    957    950    951    Any
        //  962    968    968    969    Any
        //  962    968    968    969    Ljava/lang/StringIndexOutOfBoundsException;
        //  962    968    968    969    Ljava/lang/RuntimeException;
        //  962    968    3      8      Any
        //  962    968    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 0], but value was: 1.
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
    
    @NotNull
    public f0f 5() {
        return fbS.ha(this, 873389091);
    }
    
    public void 3(final int n) {
        fbS.63(this, 1381861695, n);
    }
    
    public void c(@NotNull final f6n p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            41
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            33
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_1        
        //    17: pop            
        //    18: aload_0        
        //    19: aload_1        
        //    20: putfield        dev/nuker/pyro/f6p.c:Ldev/nuker/pyro/f6n;
        //    23: return         
        //    24: pop            
        //    25: goto            16
        //    28: pop            
        //    29: aconst_null    
        //    30: goto            24
        //    33: dup            
        //    34: ifnull          24
        //    37: checkcast       Ljava/lang/Throwable;
        //    40: athrow         
        //    41: dup            
        //    42: ifnull          28
        //    45: checkcast       Ljava/lang/Throwable;
        //    48: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 2E FD 00 03 07 00 03 07 00 71 47 07 00 2E 43 05 44 07 00 2E 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     33     41     Any
        //  33     41     33     41     Any
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
    public fbu 0() {
        return fbS.72(this, 1099174981);
    }
    
    static {
        throw t;
    }
    
    @NotNull
    public f0d 6() {
        return fbS.gf(this, 830698475);
    }
    
    @NotNull
    public f6n 3() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          132
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            124
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            116
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            37
        //    31: ldc_w           -1499578282
        //    34: goto            40
        //    37: ldc_w           1452233193
        //    40: ldc_w           1128797975
        //    43: ixor           
        //    44: lookupswitch {
        //          -438937791: 37
        //          365381374: 72
        //          default: 105
        //        }
        //    72: getfield        dev/nuker/pyro/f6p.c:Ldev/nuker/pyro/f6n;
        //    75: dup            
        //    76: ifnonnull       104
        //    79: ldc_w           "\u223b\u1487\u8b2e\ub18a\ucfa7\uec29\ub221"
        //    82: goto            86
        //    85: athrow         
        //    86: invokestatic    invokestatic   !!! ERROR
        //    89: goto            93
        //    92: athrow         
        //    93: goto            97
        //    96: athrow         
        //    97: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   100: goto            104
        //   103: athrow         
        //   104: areturn        
        //   105: aconst_null    
        //   106: athrow         
        //   107: pop            
        //   108: goto            24
        //   111: pop            
        //   112: aconst_null    
        //   113: goto            107
        //   116: dup            
        //   117: ifnull          107
        //   120: checkcast       Ljava/lang/Throwable;
        //   123: athrow         
        //   124: dup            
        //   125: ifnull          111
        //   128: checkcast       Ljava/lang/Throwable;
        //   131: athrow         
        //   132: aconst_null    
        //   133: athrow         
        //    StackMapTable: 00 15 43 07 00 2E 04 FF 00 0B 00 00 00 01 07 00 2E FC 00 03 07 00 03 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 4C 07 00 2E FF 00 00 00 01 07 00 03 00 02 07 00 71 07 00 6F 45 07 00 2E FF 00 00 00 01 07 00 03 00 02 07 00 71 07 00 6F 42 07 00 2E FF 00 00 00 01 07 00 03 00 02 07 00 71 07 00 6F 45 07 00 2E 40 07 00 71 40 07 00 03 41 07 00 27 43 05 44 07 00 27 47 05 47 07 00 2E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     116    124    Ljava/util/ConcurrentModificationException;
        //  116    124    116    124    Ljava/lang/ClassCastException;
        //  132    134    3      8      Ljava/lang/NegativeArraySizeException;
        //  85     92     92     93     Any
        //  85     92     3      8      Ljava/util/NoSuchElementException;
        //  86     92     3      8      Any
        //  86     92     92     93     Any
        //  85     92     85     86     Any
        //  96     103    103    104    Any
        //  96     103    96     97     Any
        //  97     103    96     97     Any
        //  97     103    96     97     Ljava/lang/IndexOutOfBoundsException;
        //  96     103    3      8      Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 51 out of bounds for length 51
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
    
    public f6p() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u222b\u149b\u8b24\ub3ca\uc973\uec3d\ub230\ue709\ud969\ue918\ua6eb\u1e5e"
        //     4: invokestatic    invokestatic   !!! ERROR
        //     7: ldc_w           "\u220b\u149b\u8b24\ub3ca\uc973\uec1d\ub230\ue709\ud969\ue918\ua6eb\u1e5e"
        //    10: invokestatic    invokestatic   !!! ERROR
        //    13: ldc_w           "\u221c\u1492\u8b2a\ub3dc\uc974\uec6e\ub22d\ue718\ud96d\ue919\ua6fd\u1e0c\ue02e\uc5b5\u819c\u88b8\u57e4\u76ca\ubd32\uc0a6\u2ace\uc23a\u6bc8\u2d58\ud773\u345f\u7d38"
        //    16: invokestatic    invokestatic   !!! ERROR
        //    19: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    22: aload_0        
        //    23: aload_0        
        //    24: new             Ldev/nuker/pyro/f0f;
        //    27: dup            
        //    28: ldc_w           "\u2225\u149c\u8b25\ub3dc"
        //    31: invokestatic    invokestatic   !!! ERROR
        //    34: ldc_w           "\u2205\u149c\u8b25\ub3dc"
        //    37: invokestatic    invokestatic   !!! ERROR
        //    40: aconst_null    
        //    41: getstatic       dev/nuker/pyro/fc.1:I
        //    44: ifeq            53
        //    47: ldc_w           1638877515
        //    50: goto            56
        //    53: ldc_w           735678513
        //    56: ldc_w           1642097680
        //    59: ixor           
        //    60: lookupswitch {
        //          5186907: 53
        //          1245314081: 88
        //          default: 300
        //        }
        //    88: getstatic       dev/nuker/pyro/f6o.0:Ldev/nuker/pyro/f6o;
        //    91: checkcast       Ljava/lang/Enum;
        //    94: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //    97: checkcast       Ldev/nuker/pyro/f0n;
        //   100: invokevirtual   dev/nuker/pyro/f6p.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   103: checkcast       Ldev/nuker/pyro/f0f;
        //   106: putfield        dev/nuker/pyro/f6p.c:Ldev/nuker/pyro/f0f;
        //   109: aload_0        
        //   110: aload_0        
        //   111: new             Ldev/nuker/pyro/f0a;
        //   114: dup            
        //   115: ldc_w           "\u223f\u149b\u8b28\ub3cd\uc962\uec22\ub22d\ue71f\ud97c"
        //   118: getstatic       dev/nuker/pyro/fc.c:I
        //   121: ifge            130
        //   124: ldc_w           1528393015
        //   127: goto            133
        //   130: ldc_w           -601273463
        //   133: ldc_w           2051757018
        //   136: ixor           
        //   137: lookupswitch {
        //          182723083: 130
        //          559038189: 298
        //          default: 164
        //        }
        //   164: invokestatic    invokestatic   !!! ERROR
        //   167: ldc_w           "\u221f\u149b\u8b28\ub3cd\uc962\uec22\ub22d\ue71f\ud97c"
        //   170: invokestatic    invokestatic   !!! ERROR
        //   173: ldc_w           "\u2207\u149d\u8b2d\ub3c0\uc927\uec3a\ub225\ue707\ud96d\ue954\ua6e8\u1e5e\ue027\uc5aa\u81d3\u88a1\u57ac\u76cc\ubd7d\uc0ab\u2ad2\uc23e\u6bd2\u2d42\ud765\u3459\u7d2e\u8863\u801d\u8c36\u857a\ufb72\u7112\u9a1f\u1b32\uf0bb"
        //   176: invokestatic    invokestatic   !!! ERROR
        //   179: iconst_0       
        //   180: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   183: checkcast       Ldev/nuker/pyro/f0n;
        //   186: invokevirtual   dev/nuker/pyro/f6p.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   189: checkcast       Ldev/nuker/pyro/f0a;
        //   192: putfield        dev/nuker/pyro/f6p.c:Ldev/nuker/pyro/f0a;
        //   195: aload_0        
        //   196: getstatic       dev/nuker/pyro/fc.1:I
        //   199: ifeq            208
        //   202: ldc_w           -794840068
        //   205: goto            211
        //   208: ldc_w           -549819713
        //   211: ldc_w           -1474274414
        //   214: ixor           
        //   215: lookupswitch {
        //          -1621671047: 208
        //          2025842798: 302
        //          default: 240
        //        }
        //   240: aload_0        
        //   241: new             Ldev/nuker/pyro/f0d;
        //   244: dup            
        //   245: ldc_w           "\u222c\u1496\u8b2d\ub3d8\uc97e"
        //   248: invokestatic    invokestatic   !!! ERROR
        //   251: ldc_w           "\u220c\u1496\u8b2d\ub3d8\uc97e"
        //   254: invokestatic    invokestatic   !!! ERROR
        //   257: aconst_null    
        //   258: dconst_1       
        //   259: dconst_0       
        //   260: ldc2_w          10.0
        //   263: dconst_0       
        //   264: bipush          64
        //   266: aconst_null    
        //   267: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   270: checkcast       Ldev/nuker/pyro/f0n;
        //   273: invokevirtual   dev/nuker/pyro/f6p.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   276: checkcast       Ldev/nuker/pyro/f0d;
        //   279: putfield        dev/nuker/pyro/f6p.c:Ldev/nuker/pyro/f0d;
        //   282: aload_0        
        //   283: new             Ldev/nuker/pyro/fbu;
        //   286: dup            
        //   287: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   290: putfield        dev/nuker/pyro/f6p.c:Ldev/nuker/pyro/fbu;
        //   293: aload_0        
        //   294: invokevirtual   dev/nuker/pyro/f6p.4:()V
        //   297: return         
        //   298: aconst_null    
        //   299: athrow         
        //   300: aconst_null    
        //   301: athrow         
        //   302: aconst_null    
        //   303: athrow         
        //    StackMapTable: 00 0C FF 00 35 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 18 08 00 18 07 00 6F 07 00 6F 05 FF 00 02 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 18 08 00 18 07 00 6F 07 00 6F 05 01 FF 00 1F 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 18 08 00 18 07 00 6F 07 00 6F 05 FF 00 29 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 6F 08 00 6F 07 00 6F FF 00 02 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 6F 08 00 6F 07 00 6F 01 FF 00 1E 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 6F 08 00 6F 07 00 6F 6B 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 39 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 6F 08 00 6F 07 00 6F FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 18 08 00 18 07 00 6F 07 00 6F 05 41 07 00 03
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
    
    public boolean c(@NotNull final ItemStack p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          270
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            262
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            254
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            36
        //    30: ldc_w           176852229
        //    33: goto            39
        //    36: ldc_w           1374895933
        //    39: ldc_w           1915719936
        //    42: ixor           
        //    43: lookupswitch {
        //          780388236: 36
        //          2024086533: 239
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_1        
        //    71: goto            75
        //    74: athrow         
        //    75: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //    78: goto            82
        //    81: athrow         
        //    82: ifeq            87
        //    85: iconst_0       
        //    86: ireturn        
        //    87: aload_0        
        //    88: getstatic       dev/nuker/pyro/fc.0:I
        //    91: ifeq            100
        //    94: ldc_w           -1781264906
        //    97: goto            103
        //   100: ldc_w           297669773
        //   103: ldc_w           143794468
        //   106: ixor           
        //   107: lookupswitch {
        //          -1656345390: 243
        //          1734513459: 100
        //          default: 132
        //        }
        //   132: getfield        dev/nuker/pyro/f6p.c:Ldev/nuker/pyro/f0a;
        //   135: goto            139
        //   138: athrow         
        //   139: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   142: goto            146
        //   145: athrow         
        //   146: checkcast       Ljava/lang/Boolean;
        //   149: goto            153
        //   152: athrow         
        //   153: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   156: goto            160
        //   159: athrow         
        //   160: ifeq            237
        //   163: aload_0        
        //   164: aload_1        
        //   165: getstatic       dev/nuker/pyro/fc.c:I
        //   168: ifge            177
        //   171: ldc_w           1923561420
        //   174: goto            180
        //   177: ldc_w           -629811962
        //   180: ldc_w           -1956385107
        //   183: ixor           
        //   184: lookupswitch {
        //          -104539807: 177
        //          1360411563: 212
        //          default: 241
        //        }
        //   212: goto            216
        //   215: athrow         
        //   216: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   219: goto            223
        //   222: athrow         
        //   223: dup            
        //   224: pop            
        //   225: goto            229
        //   228: athrow         
        //   229: invokevirtual   dev/nuker/pyro/f6p.c:(Lnet/minecraft/item/Item;)Z
        //   232: goto            236
        //   235: athrow         
        //   236: ireturn        
        //   237: iconst_1       
        //   238: ireturn        
        //   239: aconst_null    
        //   240: athrow         
        //   241: aconst_null    
        //   242: athrow         
        //   243: aconst_null    
        //   244: athrow         
        //   245: pop            
        //   246: goto            24
        //   249: pop            
        //   250: aconst_null    
        //   251: goto            245
        //   254: dup            
        //   255: ifnull          245
        //   258: checkcast       Ljava/lang/Throwable;
        //   261: athrow         
        //   262: dup            
        //   263: ifnull          249
        //   266: checkcast       Ljava/lang/Throwable;
        //   269: athrow         
        //   270: aconst_null    
        //   271: athrow         
        //    StackMapTable: 00 2B 43 07 00 2E 04 FF 00 0B 00 00 00 01 07 00 2E FD 00 03 07 00 03 07 01 BB 0B 42 01 1C 45 07 00 2E 40 07 01 BB 45 07 00 2E 40 01 04 4C 07 00 03 FF 00 02 00 02 07 00 03 07 01 BB 00 02 07 00 03 01 5C 07 00 03 45 07 00 2E 40 07 01 90 45 07 00 2E 40 07 00 73 FF 00 05 00 00 00 01 07 00 2E FF 00 00 00 02 07 00 03 07 01 BB 00 01 07 00 A0 45 07 00 2E 40 01 FF 00 10 00 02 07 00 03 07 01 BB 00 02 07 00 03 07 01 BB FF 00 02 00 02 07 00 03 07 01 BB 00 03 07 00 03 07 01 BB 01 FF 00 1F 00 02 07 00 03 07 01 BB 00 02 07 00 03 07 01 BB FF 00 02 00 00 00 01 07 00 2E FF 00 00 00 02 07 00 03 07 01 BB 00 02 07 00 03 07 01 BB 45 07 00 2E FF 00 00 00 02 07 00 03 07 01 BB 00 02 07 00 03 07 00 AB 44 07 00 1B FF 00 00 00 02 07 00 03 07 01 BB 00 02 07 00 03 07 00 AB 45 07 00 2E 40 01 00 01 FF 00 01 00 02 07 00 03 07 01 BB 00 02 07 00 03 07 01 BB 41 07 00 03 41 07 00 2E 43 05 44 07 00 2E 47 05 47 07 00 2E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     254    262    Any
        //  254    262    254    262    Ljava/lang/NegativeArraySizeException;
        //  270    272    3      8      Ljava/lang/NumberFormatException;
        //  74     81     81     82     Any
        //  74     81     3      8      Any
        //  74     81     74     75     Ljava/lang/AssertionError;
        //  74     81     74     75     Any
        //  74     81     81     82     Any
        //  138    145    145    146    Any
        //  138    145    138    139    Any
        //  139    145    138    139    Any
        //  139    145    138    139    Ljava/lang/IndexOutOfBoundsException;
        //  139    145    145    146    Ljava/lang/ClassCastException;
        //  153    159    159    160    Any
        //  153    159    159    160    Any
        //  153    159    3      8      Ljava/lang/NumberFormatException;
        //  153    159    159    160    Any
        //  153    159    159    160    Ljava/lang/AssertionError;
        //  216    222    222    223    Any
        //  216    222    222    223    Ljava/lang/UnsupportedOperationException;
        //  216    222    222    223    Ljava/util/NoSuchElementException;
        //  216    222    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  216    222    222    223    Ljava/lang/UnsupportedOperationException;
        //  228    235    235    236    Any
        //  228    235    3      8      Ljava/lang/RuntimeException;
        //  228    235    228    229    Ljava/lang/UnsupportedOperationException;
        //  229    235    235    236    Ljava/lang/UnsupportedOperationException;
        //  229    235    3      8      Any
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
    
    public void c(@NotNull final f0a f0a) {
        fbS.6N(this, 517452501, f0a);
    }
    
    public void c(@NotNull final f0d f0d) {
        fbS.gt(this, 946246743, f0d);
    }
}
