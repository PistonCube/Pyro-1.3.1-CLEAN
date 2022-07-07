// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.gui.ScaledResolution;
import org.jetbrains.annotations.Nullable;
import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import kotlin.jvm.JvmField;
import java.util.Map;

public class f49 extends fbk
{
    @JvmField
    @NotNull
    public Map<String, f0n<?>> c;
    @NotNull
    public String c;
    
    static {
        throw t;
    }
    
    public float c() {
        throw new UnsupportedOperationException("Please report this to the binscure obfuscator developers");
    }
    
    public float 3() {
        throw new UnsupportedOperationException("Please report this to the binscure obfuscator developers");
    }
    
    public f0n c(final f0n p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          353
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            345
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            337
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             -816779485
        //    32: goto            37
        //    35: ldc             1230970719
        //    37: ldc             1754491480
        //    39: ixor           
        //    40: lookupswitch {
        //          -1480358533: 318
        //          -282177777: 35
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: getstatic       dev/nuker/pyro/fc.0:I
        //    72: ifeq            80
        //    75: ldc             1642357623
        //    77: goto            82
        //    80: ldc             148749113
        //    82: ldc             853855637
        //    84: ixor           
        //    85: lookupswitch {
        //          976844460: 112
        //          1392553698: 80
        //          default: 322
        //        }
        //   112: getfield        dev/nuker/pyro/f49.c:Ljava/util/Map;
        //   115: aload_1        
        //   116: dup            
        //   117: ifnonnull       131
        //   120: goto            124
        //   123: athrow         
        //   124: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   127: goto            131
        //   130: athrow         
        //   131: goto            135
        //   134: athrow         
        //   135: invokevirtual   dev/nuker/pyro/f0n.0:()Ljava/lang/String;
        //   138: goto            142
        //   141: athrow         
        //   142: getstatic       dev/nuker/pyro/fc.0:I
        //   145: ifeq            153
        //   148: ldc             1320863927
        //   150: goto            155
        //   153: ldc             -1452243921
        //   155: ldc             -869574674
        //   157: ixor           
        //   158: lookupswitch {
        //          -2104385703: 153
        //          1700516801: 184
        //          default: 324
        //        }
        //   184: aload_1        
        //   185: getstatic       dev/nuker/pyro/fc.c:I
        //   188: ifge            196
        //   191: ldc             99765183
        //   193: goto            198
        //   196: ldc             2044697428
        //   198: ldc             82637947
        //   200: ixor           
        //   201: lookupswitch {
        //          18792388: 326
        //          1267595647: 196
        //          default: 228
        //        }
        //   228: goto            232
        //   231: athrow         
        //   232: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   237: goto            241
        //   240: athrow         
        //   241: pop            
        //   242: aload_1        
        //   243: new             Ldev/nuker/pyro/f48;
        //   246: dup            
        //   247: aload_0        
        //   248: goto            252
        //   251: athrow         
        //   252: invokespecial   dev/nuker/pyro/f48.<init>:(Ldev/nuker/pyro/f49;)V
        //   255: goto            259
        //   258: athrow         
        //   259: checkcast       Ljava/util/function/Consumer;
        //   262: goto            266
        //   265: athrow         
        //   266: invokevirtual   dev/nuker/pyro/f0n.c:(Ljava/util/function/Consumer;)V
        //   269: goto            273
        //   272: athrow         
        //   273: getstatic       dev/nuker/pyro/fc.1:I
        //   276: ifeq            284
        //   279: ldc             741880276
        //   281: goto            286
        //   284: ldc             836635847
        //   286: ldc             -459503154
        //   288: ixor           
        //   289: lookupswitch {
        //          -928729062: 284
        //          -717060855: 316
        //          default: 320
        //        }
        //   316: aload_1        
        //   317: areturn        
        //   318: aconst_null    
        //   319: athrow         
        //   320: aconst_null    
        //   321: athrow         
        //   322: aconst_null    
        //   323: athrow         
        //   324: aconst_null    
        //   325: athrow         
        //   326: aconst_null    
        //   327: athrow         
        //   328: pop            
        //   329: goto            24
        //   332: pop            
        //   333: aconst_null    
        //   334: goto            328
        //   337: dup            
        //   338: ifnull          328
        //   341: checkcast       Ljava/lang/Throwable;
        //   344: athrow         
        //   345: dup            
        //   346: ifnull          332
        //   349: checkcast       Ljava/lang/Throwable;
        //   352: athrow         
        //   353: aconst_null    
        //   354: athrow         
        //    StackMapTable: 00 31 43 07 00 2F 04 FF 00 0B 00 00 00 01 07 00 2F FD 00 03 07 00 03 07 00 45 0A 41 01 1E 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 45 00 02 07 00 03 01 5D 07 00 03 4A 07 00 2F FF 00 00 00 02 07 00 03 07 00 45 00 02 07 00 50 07 00 45 45 07 00 2F FF 00 00 00 02 07 00 03 07 00 45 00 02 07 00 50 07 00 45 FF 00 02 00 00 00 01 07 00 2F FF 00 00 00 02 07 00 03 07 00 45 00 02 07 00 50 07 00 45 45 07 00 2F FF 00 00 00 02 07 00 03 07 00 45 00 02 07 00 50 07 00 63 FF 00 0A 00 02 07 00 03 07 00 45 00 02 07 00 50 07 00 63 FF 00 01 00 02 07 00 03 07 00 45 00 03 07 00 50 07 00 63 01 FF 00 1C 00 02 07 00 03 07 00 45 00 02 07 00 50 07 00 63 FF 00 0B 00 02 07 00 03 07 00 45 00 03 07 00 50 07 00 63 07 00 45 FF 00 01 00 02 07 00 03 07 00 45 00 04 07 00 50 07 00 63 07 00 45 01 FF 00 1D 00 02 07 00 03 07 00 45 00 03 07 00 50 07 00 63 07 00 45 FF 00 02 00 00 00 01 07 00 2F FF 00 00 00 02 07 00 03 07 00 45 00 03 07 00 50 07 00 63 07 00 45 47 07 00 2F 40 07 00 65 FF 00 09 00 00 00 01 07 00 2F FF 00 00 00 02 07 00 03 07 00 45 00 04 07 00 45 08 00 F3 08 00 F3 07 00 03 45 07 00 2F FF 00 00 00 02 07 00 03 07 00 45 00 02 07 00 45 07 00 56 FF 00 05 00 00 00 01 07 00 2F FF 00 00 00 02 07 00 03 07 00 45 00 02 07 00 45 07 00 5B 45 07 00 2F 00 0A 41 01 1D 01 01 41 07 00 03 FF 00 01 00 02 07 00 03 07 00 45 00 02 07 00 50 07 00 63 FF 00 01 00 02 07 00 03 07 00 45 00 03 07 00 50 07 00 63 07 00 45 41 07 00 2F 43 05 44 07 00 2F 47 05 47 07 00 2F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     337    345    Ljava/lang/RuntimeException;
        //  337    345    337    345    Any
        //  353    355    3      8      Any
        //  123    130    130    131    Any
        //  124    130    123    124    Any
        //  124    130    123    124    Any
        //  123    130    123    124    Ljava/lang/NullPointerException;
        //  123    130    130    131    Any
        //  135    141    141    142    Any
        //  135    141    141    142    Any
        //  135    141    141    142    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  135    141    141    142    Any
        //  135    141    141    142    Any
        //  232    240    240    241    Any
        //  232    240    240    241    Any
        //  232    240    240    241    Ljava/lang/IllegalArgumentException;
        //  232    240    3      8      Any
        //  232    240    3      8      Any
        //  252    258    258    259    Any
        //  252    258    258    259    Ljava/util/NoSuchElementException;
        //  252    258    3      8      Ljava/lang/ClassCastException;
        //  252    258    258    259    Any
        //  252    258    258    259    Ljava/lang/IllegalStateException;
        //  266    272    272    273    Any
        //  266    272    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  266    272    3      8      Any
        //  266    272    272    273    Any
        //  266    272    3      8      Any
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
    
    public f49(@NotNull final String c) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.c < 0) {
                    n = 1993372143;
                    break Label_0013;
                }
                n = 1493566814;
            }
            switch (n ^ 0x441CB16D) {
                case 852279426: {
                    continue;
                }
                case 488289331: {
                    while (true) {
                        int n2 = 0;
                        Label_0065: {
                            if (fc.c < 0) {
                                n2 = -477316137;
                                break Label_0065;
                            }
                            n2 = 358322343;
                        }
                        switch (n2 ^ 0x9E2B70B2) {
                            case 2108148581: {
                                continue;
                            }
                            case -1955536875: {
                                this.c = c;
                                this.c = new LinkedHashMap<String, f0n<?>>();
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
    
    public boolean 0() {
        return fbS.e9(this, 1683396547);
    }
    
    public void c(@NotNull final JsonObject jsonObject) {
        fbS.3s(this, 2012052110, jsonObject);
    }
    
    @NotNull
    public JsonObject 2() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          616
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            608
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            600
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lcom/google/gson/JsonObject;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/fc.0:I
        //    31: ifeq            39
        //    34: ldc             1687402837
        //    36: goto            41
        //    39: ldc             -1428220428
        //    41: ldc             -1466151623
        //    43: ixor           
        //    44: lookupswitch {
        //          -871369620: 39
        //          37968077: 72
        //          default: 587
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokespecial   com/google/gson/JsonObject.<init>:()V
        //    79: goto            83
        //    82: athrow         
        //    83: astore_1       
        //    84: new             Lcom/google/gson/JsonObject;
        //    87: dup            
        //    88: goto            92
        //    91: athrow         
        //    92: invokespecial   com/google/gson/JsonObject.<init>:()V
        //    95: goto            99
        //    98: athrow         
        //    99: astore_2       
        //   100: aload_0        
        //   101: getfield        dev/nuker/pyro/f49.c:Ljava/util/Map;
        //   104: getstatic       dev/nuker/pyro/fc.c:I
        //   107: ifge            115
        //   110: ldc             474642960
        //   112: goto            117
        //   115: ldc             -2066712845
        //   117: ldc             1567213175
        //   119: ixor           
        //   120: lookupswitch {
        //          -1847002515: 115
        //          1092861031: 579
        //          default: 148
        //        }
        //   148: astore          5
        //   150: iconst_0       
        //   151: istore          6
        //   153: getstatic       dev/nuker/pyro/fc.c:I
        //   156: ifge            164
        //   159: ldc             951208149
        //   161: goto            166
        //   164: ldc             -680489952
        //   166: ldc             1226705477
        //   168: ixor           
        //   169: lookupswitch {
        //          -1636923803: 196
        //          1907114640: 164
        //          default: 583
        //        }
        //   196: aload           5
        //   198: goto            202
        //   201: athrow         
        //   202: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   207: goto            211
        //   210: athrow         
        //   211: getstatic       dev/nuker/pyro/fc.1:I
        //   214: ifeq            222
        //   217: ldc             -89679299
        //   219: goto            224
        //   222: ldc             -929687663
        //   224: ldc             1833937602
        //   226: ixor           
        //   227: lookupswitch {
        //          -1746390785: 222
        //          -1512456877: 252
        //          default: 589
        //        }
        //   252: goto            256
        //   255: athrow         
        //   256: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   261: goto            265
        //   264: athrow         
        //   265: getstatic       dev/nuker/pyro/fc.0:I
        //   268: ifeq            276
        //   271: ldc             -4620305
        //   273: goto            278
        //   276: ldc             1515870543
        //   278: ldc             -1421175768
        //   280: ixor           
        //   281: lookupswitch {
        //          -250557081: 308
        //          1425271751: 276
        //          default: 585
        //        }
        //   308: astore          4
        //   310: aload           4
        //   312: goto            316
        //   315: athrow         
        //   316: invokeinterface java/util/Iterator.hasNext:()Z
        //   321: goto            325
        //   324: athrow         
        //   325: ifeq            333
        //   328: ldc             -1896117406
        //   330: goto            335
        //   333: ldc             -1896117395
        //   335: ldc             -1221788811
        //   337: ixor           
        //   338: tableswitch {
        //          1940840494: 360
        //          1940840495: 502
        //          default: 328
        //        }
        //   360: aload           4
        //   362: goto            366
        //   365: athrow         
        //   366: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   371: goto            375
        //   374: athrow         
        //   375: checkcast       Ljava/util/Map$Entry;
        //   378: astore_3       
        //   379: aload_3        
        //   380: astore          7
        //   382: iconst_0       
        //   383: istore          8
        //   385: aload           7
        //   387: goto            391
        //   390: athrow         
        //   391: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   396: goto            400
        //   399: athrow         
        //   400: checkcast       Ljava/lang/String;
        //   403: getstatic       dev/nuker/pyro/fc.1:I
        //   406: ifeq            414
        //   409: ldc             -150522306
        //   411: goto            416
        //   414: ldc             1104699973
        //   416: ldc             1203557179
        //   418: ixor           
        //   419: lookupswitch {
        //          -1329863419: 414
        //          107262334: 444
        //          default: 581
        //        }
        //   444: astore          5
        //   446: aload_3        
        //   447: astore          7
        //   449: iconst_0       
        //   450: istore          8
        //   452: aload           7
        //   454: goto            458
        //   457: athrow         
        //   458: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   463: goto            467
        //   466: athrow         
        //   467: checkcast       Ldev/nuker/pyro/f0n;
        //   470: astore          6
        //   472: aload_2        
        //   473: aload           5
        //   475: aload           6
        //   477: goto            481
        //   480: athrow         
        //   481: invokevirtual   dev/nuker/pyro/f0n.c:()Lcom/google/gson/JsonElement;
        //   484: goto            488
        //   487: athrow         
        //   488: goto            492
        //   491: athrow         
        //   492: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   495: goto            499
        //   498: athrow         
        //   499: goto            310
        //   502: aload_1        
        //   503: ldc             "\u23b4\u1496\u8aa2\ub18d\uce25\uedaf\ub223\ue688"
        //   505: goto            509
        //   508: athrow         
        //   509: invokestatic    invokestatic   !!! ERROR
        //   512: goto            516
        //   515: athrow         
        //   516: getstatic       dev/nuker/pyro/fc.c:I
        //   519: ifge            527
        //   522: ldc             1122207869
        //   524: goto            529
        //   527: ldc             975178402
        //   529: ldc             159609275
        //   531: ixor           
        //   532: lookupswitch {
        //          866351897: 560
        //          1264646598: 527
        //          default: 577
        //        }
        //   560: aload_2        
        //   561: checkcast       Lcom/google/gson/JsonElement;
        //   564: goto            568
        //   567: athrow         
        //   568: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   571: goto            575
        //   574: athrow         
        //   575: aload_1        
        //   576: areturn        
        //   577: aconst_null    
        //   578: athrow         
        //   579: aconst_null    
        //   580: athrow         
        //   581: aconst_null    
        //   582: athrow         
        //   583: aconst_null    
        //   584: athrow         
        //   585: aconst_null    
        //   586: athrow         
        //   587: aconst_null    
        //   588: athrow         
        //   589: aconst_null    
        //   590: athrow         
        //   591: pop            
        //   592: goto            24
        //   595: pop            
        //   596: aconst_null    
        //   597: goto            591
        //   600: dup            
        //   601: ifnull          591
        //   604: checkcast       Ljava/lang/Throwable;
        //   607: athrow         
        //   608: dup            
        //   609: ifnull          595
        //   612: checkcast       Ljava/lang/Throwable;
        //   615: athrow         
        //   616: aconst_null    
        //   617: athrow         
        //    StackMapTable: 00 5B 43 07 00 2F 04 FF 00 0B 00 00 00 01 07 00 2F FC 00 03 07 00 03 FF 00 0E 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 01 00 01 07 00 03 00 03 08 00 18 08 00 18 01 FF 00 1E 00 01 07 00 03 00 02 08 00 18 08 00 18 42 07 00 22 FF 00 00 00 01 07 00 03 00 02 08 00 18 08 00 18 45 07 00 2F 40 07 00 92 FF 00 07 00 02 07 00 03 07 00 92 00 01 07 00 2F FF 00 00 00 02 07 00 03 07 00 92 00 02 08 00 54 08 00 54 45 07 00 2F 40 07 00 92 FF 00 0F 00 03 07 00 03 07 00 92 07 00 92 00 01 07 00 50 FF 00 01 00 03 07 00 03 07 00 92 07 00 92 00 02 07 00 50 01 5E 07 00 50 FF 00 0F 00 07 07 00 03 07 00 92 07 00 92 00 00 07 00 50 01 00 00 41 01 1D 44 07 00 1E 40 07 00 50 47 07 00 2F 40 07 00 A5 4A 07 00 A5 FF 00 01 00 07 07 00 03 07 00 92 07 00 92 00 00 07 00 50 01 00 02 07 00 A5 01 5B 07 00 A5 42 07 00 26 40 07 00 A5 47 07 00 2F 40 07 00 AE 4A 07 00 AE FF 00 01 00 07 07 00 03 07 00 92 07 00 92 00 00 07 00 50 01 00 02 07 00 AE 01 5D 07 00 AE FF 00 01 00 06 07 00 03 07 00 92 07 00 92 00 07 00 AE 07 00 65 00 00 44 07 00 2F 40 07 00 AE 47 07 00 2F 40 01 02 04 41 01 18 44 07 00 2F 40 07 00 AE 47 07 00 2F 40 07 00 65 FF 00 0E 00 09 07 00 03 07 00 92 07 00 92 07 00 BA 07 00 AE 07 00 65 00 07 00 BA 01 00 01 07 00 2F 40 07 00 BA 47 07 00 2F 40 07 00 65 4D 07 00 63 FF 00 01 00 09 07 00 03 07 00 92 07 00 92 07 00 BA 07 00 AE 07 00 65 00 07 00 BA 01 00 02 07 00 63 01 5B 07 00 63 FF 00 0C 00 09 07 00 03 07 00 92 07 00 92 07 00 BA 07 00 AE 07 00 63 00 07 00 BA 01 00 01 07 00 26 40 07 00 BA 47 07 00 2F 40 07 00 65 FF 00 0C 00 09 07 00 03 07 00 92 07 00 92 07 00 BA 07 00 AE 07 00 63 07 00 45 07 00 BA 01 00 01 07 00 2F FF 00 00 00 09 07 00 03 07 00 92 07 00 92 07 00 BA 07 00 AE 07 00 63 07 00 45 07 00 BA 01 00 03 07 00 92 07 00 63 07 00 45 45 07 00 2F FF 00 00 00 09 07 00 03 07 00 92 07 00 92 07 00 BA 07 00 AE 07 00 63 07 00 45 07 00 BA 01 00 03 07 00 92 07 00 63 07 00 D6 42 07 00 1A FF 00 00 00 09 07 00 03 07 00 92 07 00 92 07 00 BA 07 00 AE 07 00 63 07 00 45 07 00 BA 01 00 03 07 00 92 07 00 63 07 00 D6 45 07 00 2F 00 FF 00 02 00 06 07 00 03 07 00 92 07 00 92 00 07 00 AE 07 00 65 00 00 45 07 00 2F FF 00 00 00 06 07 00 03 07 00 92 07 00 92 00 07 00 AE 07 00 65 00 02 07 00 92 07 00 63 45 07 00 2F FF 00 00 00 06 07 00 03 07 00 92 07 00 92 00 07 00 AE 07 00 65 00 02 07 00 92 07 00 63 FF 00 0A 00 06 07 00 03 07 00 92 07 00 92 00 07 00 AE 07 00 65 00 02 07 00 92 07 00 63 FF 00 01 00 06 07 00 03 07 00 92 07 00 92 00 07 00 AE 07 00 65 00 03 07 00 92 07 00 63 01 FF 00 1E 00 06 07 00 03 07 00 92 07 00 92 00 07 00 AE 07 00 65 00 02 07 00 92 07 00 63 46 07 00 1A FF 00 00 00 06 07 00 03 07 00 92 07 00 92 00 07 00 AE 07 00 65 00 03 07 00 92 07 00 63 07 00 D6 45 07 00 2F 00 FF 00 01 00 06 07 00 03 07 00 92 07 00 92 00 07 00 AE 07 00 65 00 02 07 00 92 07 00 63 FF 00 01 00 03 07 00 03 07 00 92 07 00 92 00 01 07 00 50 FF 00 01 00 09 07 00 03 07 00 92 07 00 92 07 00 BA 07 00 AE 07 00 65 00 07 00 BA 01 00 01 07 00 63 FF 00 01 00 07 07 00 03 07 00 92 07 00 92 00 00 07 00 50 01 00 00 41 07 00 AE FF 00 01 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 01 00 07 07 00 03 07 00 92 07 00 92 00 00 07 00 50 01 00 01 07 00 A5 FF 00 01 00 01 07 00 03 00 01 07 00 2F 43 05 44 07 00 2F 47 05 47 07 00 2F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     600    608    Any
        //  600    608    600    608    Ljava/util/ConcurrentModificationException;
        //  616    618    3      8      Ljava/lang/IllegalStateException;
        //  75     82     82     83     Any
        //  75     82     3      8      Any
        //  76     82     75     76     Ljava/util/NoSuchElementException;
        //  75     82     82     83     Any
        //  76     82     3      8      Any
        //  91     98     98     99     Any
        //  91     98     3      8      Any
        //  92     98     91     92     Any
        //  91     98     3      8      Any
        //  91     98     91     92     Any
        //  201    210    210    211    Any
        //  201    210    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  202    210    210    211    Ljava/lang/RuntimeException;
        //  201    210    3      8      Ljava/lang/UnsupportedOperationException;
        //  202    210    201    202    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  255    264    264    265    Any
        //  255    264    3      8      Any
        //  255    264    264    265    Any
        //  255    264    264    265    Any
        //  256    264    255    256    Ljava/lang/IllegalStateException;
        //  315    324    324    325    Any
        //  316    324    315    316    Ljava/lang/StringIndexOutOfBoundsException;
        //  316    324    315    316    Any
        //  316    324    324    325    Ljava/lang/IndexOutOfBoundsException;
        //  315    324    324    325    Ljava/lang/NumberFormatException;
        //  365    374    374    375    Any
        //  366    374    3      8      Any
        //  366    374    365    366    Any
        //  366    374    374    375    Any
        //  365    374    365    366    Any
        //  390    399    399    400    Any
        //  391    399    390    391    Any
        //  391    399    399    400    Ljava/lang/StringIndexOutOfBoundsException;
        //  391    399    399    400    Any
        //  391    399    390    391    Ljava/util/ConcurrentModificationException;
        //  457    466    466    467    Any
        //  458    466    457    458    Ljava/lang/IllegalStateException;
        //  458    466    466    467    Ljava/util/NoSuchElementException;
        //  458    466    3      8      Ljava/lang/AssertionError;
        //  457    466    466    467    Ljava/lang/NegativeArraySizeException;
        //  480    487    487    488    Any
        //  480    487    480    481    Any
        //  480    487    480    481    Ljava/lang/IllegalArgumentException;
        //  480    487    487    488    Any
        //  481    487    480    481    Any
        //  491    498    498    499    Any
        //  492    498    3      8      Ljava/lang/IllegalArgumentException;
        //  492    498    491    492    Ljava/lang/ClassCastException;
        //  491    498    498    499    Any
        //  491    498    491    492    Ljava/lang/UnsupportedOperationException;
        //  508    515    515    516    Any
        //  508    515    3      8      Ljava/lang/AssertionError;
        //  509    515    515    516    Any
        //  509    515    508    509    Any
        //  508    515    508    509    Ljava/lang/NegativeArraySizeException;
        //  567    574    574    575    Any
        //  567    574    567    568    Ljava/lang/NegativeArraySizeException;
        //  567    574    567    568    Ljava/lang/ClassCastException;
        //  567    574    3      8      Ljava/lang/AssertionError;
        //  567    574    574    575    Ljava/lang/ArithmeticException;
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
    
    public void c(@Nullable final f4d f4d, final int n, @Nullable final ScaledResolution scaledResolution, final float n2, final float n3) {
        throw new UnsupportedOperationException("Please report this to the binscure obfuscator developers");
    }
    
    public boolean c(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: iflt            35
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            27
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: iconst_0       
        //    17: ireturn        
        //    18: pop            
        //    19: goto            16
        //    22: pop            
        //    23: aconst_null    
        //    24: goto            18
        //    27: dup            
        //    28: ifnull          18
        //    31: checkcast       Ljava/lang/Throwable;
        //    34: athrow         
        //    35: dup            
        //    36: ifnull          22
        //    39: checkcast       Ljava/lang/Throwable;
        //    42: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 2F FF 00 03 00 04 07 00 03 01 01 01 00 00 41 07 00 2F 43 05 44 07 00 2F 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  0      12     27     35     Any
        //  27     35     27     35     Ljava/util/NoSuchElementException;
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
    
    public f0n c(@NotNull final String s) {
        return fbS.4D(this, 1320827207, s);
    }
    
    public boolean 4() {
        return fbS.ea(this, 126340804);
    }
    
    @NotNull
    public String 1() {
        return fbS.4W(this, 1247667914);
    }
}
