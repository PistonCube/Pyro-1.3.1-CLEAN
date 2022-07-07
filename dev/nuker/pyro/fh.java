// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.util.math.Vec3d;
import com.google.gson.JsonObject;
import net.minecraft.world.World;
import net.minecraft.client.entity.EntityPlayerSP;
import java.util.LinkedHashMap;
import java.util.function.Consumer;
import dev.nuker.pyro.gui.ClickGui$Window;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import java.util.Map;
import kotlin.jvm.JvmField;
import net.minecraft.client.Minecraft;

public class fH
{
    @JvmField
    public Minecraft c;
    @JvmField
    @NotNull
    public Map<String, f0n<?>> c;
    @JvmField
    @NotNull
    public fw<Boolean> c;
    @JvmField
    @NotNull
    public fw<Boolean> 0;
    @JvmField
    @NotNull
    public fw<Integer> 1;
    public int c;
    @Nullable
    public String c;
    public int 0;
    @Nullable
    public String 0;
    @NotNull
    public fw<Boolean> 2;
    @NotNull
    public String 1;
    @NotNull
    public String 2;
    @Nullable
    public String 3;
    
    public void 4(@Nullable final String s) {
        fbS.9p(this, 603449829, s);
    }
    
    @Nullable
    public String 6() {
        return fbS.59(this, 1283402302);
    }
    
    @NotNull
    public fw 0() {
        return fbS.83(this, 1271439493);
    }
    
    public void c(@NotNull final ClickGui$Window p0) {
        public class fG implements Consumer
        {
            public fH c;
            
            public fG(final fH c) {
                while (true) {
                    int n = 0;
                    Label_0013: {
                        if (fc.1 != 0) {
                            n = 152292381;
                            break Label_0013;
                        }
                        n = 296419818;
                    }
                    switch (n ^ 0xE5D8C21B) {
                        case 319536073: {
                            continue;
                        }
                        default: {
                            while (true) {
                                int n2 = 0;
                                Label_0058: {
                                    if (fc.0 != 0) {
                                        n2 = -149471354;
                                        break Label_0058;
                                    }
                                    n2 = 1970088673;
                                }
                                switch (n2 ^ 0x3D20A887) {
                                    case -902326527: {
                                        continue;
                                    }
                                    case 1213039206: {
                                        this.c = c;
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
                        case -322236922: {
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
            public void accept(final Object o) {
                fbS.2I(this, 765835088, o);
            }
            
            public void c(final Integer p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          168
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.0:I
                //    12: ifgt            160
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            152
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: getstatic       dev/nuker/pyro/fc.0:I
                //    27: ifeq            35
                //    30: ldc             1997079591
                //    32: goto            37
                //    35: ldc             -668653978
                //    37: ldc             -2078659523
                //    39: ixor           
                //    40: lookupswitch {
                //          -216848358: 35
                //          1547635291: 68
                //          default: 141
                //        }
                //    68: aload_0        
                //    69: getfield        dev/nuker/pyro/fG.c:Ldev/nuker/pyro/fH;
                //    72: aload_1        
                //    73: dup            
                //    74: pop            
                //    75: getstatic       dev/nuker/pyro/fc.0:I
                //    78: ifeq            86
                //    81: ldc             -1897697708
                //    83: goto            88
                //    86: ldc             -859285235
                //    88: ldc             -1967443684
                //    90: ixor           
                //    91: lookupswitch {
                //          72900424: 86
                //          1181968401: 116
                //          default: 139
                //        }
                //   116: goto            120
                //   119: athrow         
                //   120: invokevirtual   java/lang/Integer.intValue:()I
                //   123: goto            127
                //   126: athrow         
                //   127: goto            131
                //   130: athrow         
                //   131: invokevirtual   dev/nuker/pyro/fH.1:(I)V
                //   134: goto            138
                //   137: athrow         
                //   138: return         
                //   139: aconst_null    
                //   140: athrow         
                //   141: aconst_null    
                //   142: athrow         
                //   143: pop            
                //   144: goto            24
                //   147: pop            
                //   148: aconst_null    
                //   149: goto            143
                //   152: dup            
                //   153: ifnull          143
                //   156: checkcast       Ljava/lang/Throwable;
                //   159: athrow         
                //   160: dup            
                //   161: ifnull          147
                //   164: checkcast       Ljava/lang/Throwable;
                //   167: athrow         
                //   168: aconst_null    
                //   169: athrow         
                //    StackMapTable: 00 19 43 07 00 3D 04 FF 00 0B 00 00 00 01 07 00 3D FD 00 03 07 00 03 07 00 45 0A 41 01 1E FF 00 11 00 02 07 00 03 07 00 45 00 02 07 00 09 07 00 45 FF 00 01 00 02 07 00 03 07 00 45 00 03 07 00 09 07 00 45 01 FF 00 1B 00 02 07 00 03 07 00 45 00 02 07 00 09 07 00 45 FF 00 02 00 00 00 01 07 00 3D FF 00 00 00 02 07 00 03 07 00 45 00 02 07 00 09 07 00 45 45 07 00 3D FF 00 00 00 02 07 00 03 07 00 45 00 02 07 00 09 01 42 07 00 3D FF 00 00 00 02 07 00 03 07 00 45 00 02 07 00 09 01 45 07 00 3D 00 FF 00 00 00 02 07 00 03 07 00 45 00 02 07 00 09 07 00 45 01 41 07 00 3D 43 05 44 07 00 3D 47 05 47 07 00 3D
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                       
                //  -----  -----  -----  -----  -------------------------------------------
                //  8      20     152    160    Ljava/lang/AssertionError;
                //  152    160    152    160    Any
                //  168    170    3      8      Any
                //  120    126    126    127    Any
                //  120    126    3      8      Any
                //  120    126    3      8      Ljava/lang/StringIndexOutOfBoundsException;
                //  120    126    3      8      Any
                //  120    126    126    127    Ljava/lang/NegativeArraySizeException;
                //  130    137    137    138    Any
                //  131    137    3      8      Ljava/lang/IllegalArgumentException;
                //  131    137    130    131    Any
                //  130    137    137    138    Ljava/lang/IllegalStateException;
                //  130    137    130    131    Ljava/lang/NullPointerException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IndexOutOfBoundsException: Index 60 out of bounds for length 60
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
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:670)
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
        public class fF implements Consumer
        {
            public fH c;
            
            static {
                throw t;
            }
            
            public void c(@NotNull final Boolean b) {
                fbS.3y(this, 532118461, b);
            }
            
            public fF(final fH c) {
                this.c = c;
                while (true) {
                    int n = 0;
                    Label_0018: {
                        if (fc.1 != 0) {
                            n = -298777026;
                            break Label_0018;
                        }
                        n = -684872668;
                    }
                    switch (n ^ 0x4EEA8380) {
                        case 2007097499: {
                            continue;
                        }
                        default: {}
                        case -1596226114: {
                            throw null;
                        }
                    }
                    break;
                }
            }
            
            @Override
            public void accept(final Object o) {
                fbS.3c(this, 468094342, o);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          615
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            607
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            599
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: new             Ljava/util/ArrayList;
        //    29: dup            
        //    30: goto            34
        //    33: athrow         
        //    34: invokespecial   java/util/ArrayList.<init>:()V
        //    37: goto            41
        //    40: athrow         
        //    41: checkcast       Ljava/util/List;
        //    44: astore_2       
        //    45: aload_0        
        //    46: getfield        dev/nuker/pyro/fH.c:Ljava/util/Map;
        //    49: goto            53
        //    52: athrow         
        //    53: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //    58: goto            62
        //    61: athrow         
        //    62: getstatic       dev/nuker/pyro/fc.0:I
        //    65: ifeq            73
        //    68: ldc             -1033201697
        //    70: goto            75
        //    73: ldc             -27526556
        //    75: ldc             105420690
        //    77: ixor           
        //    78: lookupswitch {
        //          -1004404659: 582
        //          -617094490: 73
        //          default: 104
        //        }
        //   104: goto            108
        //   107: athrow         
        //   108: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   113: goto            117
        //   116: athrow         
        //   117: astore          4
        //   119: getstatic       dev/nuker/pyro/fc.c:I
        //   122: ifge            130
        //   125: ldc             -1994671384
        //   127: goto            132
        //   130: ldc             -1961542609
        //   132: ldc             -1528912624
        //   134: ixor           
        //   135: lookupswitch {
        //          767893496: 580
        //          1065035230: 130
        //          default: 160
        //        }
        //   160: aload           4
        //   162: goto            166
        //   165: athrow         
        //   166: invokeinterface java/util/Iterator.hasNext:()Z
        //   171: goto            175
        //   174: athrow         
        //   175: ifeq            312
        //   178: aload           4
        //   180: goto            184
        //   183: athrow         
        //   184: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   189: goto            193
        //   192: athrow         
        //   193: checkcast       Ldev/nuker/pyro/f0n;
        //   196: getstatic       dev/nuker/pyro/fc.0:I
        //   199: ifeq            207
        //   202: ldc             372790556
        //   204: goto            209
        //   207: ldc             106865825
        //   209: ldc             -1709677817
        //   211: ixor           
        //   212: lookupswitch {
        //          -1944046053: 207
        //          -1673082970: 240
        //          default: 586
        //        }
        //   240: astore_3       
        //   241: aload_2        
        //   242: aload_3        
        //   243: getstatic       dev/nuker/pyro/fc.c:I
        //   246: ifge            254
        //   249: ldc             -958874938
        //   251: goto            256
        //   254: ldc             -48736445
        //   256: ldc             -692128150
        //   258: ixor           
        //   259: lookupswitch {
        //          275139756: 576
        //          500452198: 254
        //          default: 284
        //        }
        //   284: goto            288
        //   287: athrow         
        //   288: invokevirtual   dev/nuker/pyro/f0n.4:()Ldev/nuker/pyro/f0V;
        //   291: goto            295
        //   294: athrow         
        //   295: goto            299
        //   298: athrow         
        //   299: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   304: goto            308
        //   307: athrow         
        //   308: pop            
        //   309: goto            119
        //   312: aload_1        
        //   313: aload_0        
        //   314: getfield        dev/nuker/pyro/fH.2:Ljava/lang/String;
        //   317: aload_0        
        //   318: getfield        dev/nuker/pyro/fH.c:Ldev/nuker/pyro/fw;
        //   321: goto            325
        //   324: athrow         
        //   325: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   328: goto            332
        //   331: athrow         
        //   332: dup            
        //   333: pop            
        //   334: checkcast       Ljava/lang/Boolean;
        //   337: goto            341
        //   340: athrow         
        //   341: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   344: goto            348
        //   347: athrow         
        //   348: aload_2        
        //   349: new             Ldev/nuker/pyro/fF;
        //   352: dup            
        //   353: getstatic       dev/nuker/pyro/fc.0:I
        //   356: ifeq            364
        //   359: ldc             -1801802174
        //   361: goto            366
        //   364: ldc             -423986192
        //   366: ldc             1832729757
        //   368: ixor           
        //   369: lookupswitch {
        //          -106458401: 584
        //          65011884: 364
        //          default: 396
        //        }
        //   396: aload_0        
        //   397: goto            401
        //   400: athrow         
        //   401: invokespecial   dev/nuker/pyro/fF.<init>:(Ldev/nuker/pyro/fH;)V
        //   404: goto            408
        //   407: athrow         
        //   408: checkcast       Ljava/util/function/Consumer;
        //   411: new             Ldev/nuker/pyro/fz;
        //   414: dup            
        //   415: aload_0        
        //   416: goto            420
        //   419: athrow         
        //   420: invokevirtual   dev/nuker/pyro/fH.7:()I
        //   423: goto            427
        //   426: athrow         
        //   427: goto            431
        //   430: athrow         
        //   431: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   434: goto            438
        //   437: athrow         
        //   438: new             Ldev/nuker/pyro/fG;
        //   441: dup            
        //   442: aload_0        
        //   443: goto            447
        //   446: athrow         
        //   447: invokespecial   dev/nuker/pyro/fG.<init>:(Ldev/nuker/pyro/fH;)V
        //   450: goto            454
        //   453: athrow         
        //   454: checkcast       Ljava/util/function/Consumer;
        //   457: goto            461
        //   460: athrow         
        //   461: invokespecial   dev/nuker/pyro/fz.<init>:(Ljava/lang/Object;Ljava/util/function/Consumer;)V
        //   464: goto            468
        //   467: athrow         
        //   468: checkcast       Ldev/nuker/pyro/fw;
        //   471: aload_0        
        //   472: getstatic       dev/nuker/pyro/fc.1:I
        //   475: ifeq            483
        //   478: ldc             -437984684
        //   480: goto            485
        //   483: ldc             -48401469
        //   485: ldc             -1075467071
        //   487: ixor           
        //   488: lookupswitch {
        //          -2030940157: 483
        //          1510035093: 588
        //          default: 516
        //        }
        //   516: getfield        dev/nuker/pyro/fH.0:Ldev/nuker/pyro/fw;
        //   519: aload_0        
        //   520: getfield        dev/nuker/pyro/fH.1:Ldev/nuker/pyro/fw;
        //   523: getstatic       dev/nuker/pyro/fc.c:I
        //   526: ifge            534
        //   529: ldc             2011741165
        //   531: goto            536
        //   534: ldc             -403208265
        //   536: ldc             1241253466
        //   538: ixor           
        //   539: lookupswitch {
        //          -1374977555: 564
        //          1041546679: 534
        //          default: 578
        //        }
        //   564: goto            568
        //   567: athrow         
        //   568: invokevirtual   dev/nuker/pyro/gui/ClickGui$Window.addModule:(Ljava/lang/String;ZLjava/util/List;Ljava/util/function/Consumer;Ldev/nuker/pyro/fw;Ldev/nuker/pyro/fw;Ldev/nuker/pyro/fw;)V
        //   571: goto            575
        //   574: athrow         
        //   575: return         
        //   576: aconst_null    
        //   577: athrow         
        //   578: aconst_null    
        //   579: athrow         
        //   580: aconst_null    
        //   581: athrow         
        //   582: aconst_null    
        //   583: athrow         
        //   584: aconst_null    
        //   585: athrow         
        //   586: aconst_null    
        //   587: athrow         
        //   588: aconst_null    
        //   589: athrow         
        //   590: pop            
        //   591: goto            24
        //   594: pop            
        //   595: aconst_null    
        //   596: goto            590
        //   599: dup            
        //   600: ifnull          590
        //   603: checkcast       Ljava/lang/Throwable;
        //   606: athrow         
        //   607: dup            
        //   608: ifnull          594
        //   611: checkcast       Ljava/lang/Throwable;
        //   614: athrow         
        //   615: aconst_null    
        //   616: athrow         
        //    StackMapTable: 00 63 43 07 00 4E 04 FF 00 0B 00 00 00 01 07 00 4E FD 00 03 07 00 03 07 00 BC 48 07 00 4E FF 00 00 00 02 07 00 03 07 00 BC 00 02 08 00 1A 08 00 1A 45 07 00 4E 40 07 00 50 FF 00 0A 00 00 00 01 07 00 4E FF 00 00 00 03 07 00 03 07 00 BC 07 00 56 00 01 07 00 5A 47 07 00 4E 40 07 00 65 4A 07 00 65 FF 00 01 00 03 07 00 03 07 00 BC 07 00 56 00 02 07 00 65 01 5C 07 00 65 42 07 00 4E 40 07 00 65 47 07 00 4E 40 07 00 6E FD 00 01 00 07 00 6E 0A 41 01 1B 44 07 00 4E 40 07 00 6E 47 07 00 4E 40 01 47 07 00 4E 40 07 00 6E 47 07 00 4E 40 07 00 05 4D 07 00 78 FF 00 01 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 02 07 00 78 01 5E 07 00 78 FF 00 0D 00 05 07 00 03 07 00 BC 07 00 56 07 00 78 07 00 6E 00 02 07 00 56 07 00 78 FF 00 01 00 05 07 00 03 07 00 BC 07 00 56 07 00 78 07 00 6E 00 03 07 00 56 07 00 78 01 FF 00 1B 00 05 07 00 03 07 00 BC 07 00 56 07 00 78 07 00 6E 00 02 07 00 56 07 00 78 FF 00 02 00 00 00 01 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 07 00 78 07 00 6E 00 02 07 00 56 07 00 78 45 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 07 00 78 07 00 6E 00 02 07 00 56 07 00 C2 42 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 07 00 78 07 00 6E 00 02 07 00 56 07 00 C2 47 07 00 4E 40 01 FF 00 03 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 00 4B 07 00 30 FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 03 07 00 BC 07 00 C4 07 00 8B 45 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 03 07 00 BC 07 00 C4 07 00 05 47 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 03 07 00 BC 07 00 C4 07 00 8F 45 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 03 07 00 BC 07 00 C4 01 FF 00 0F 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 06 07 00 BC 07 00 C4 01 07 00 56 08 01 5D 08 01 5D FF 00 01 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 07 07 00 BC 07 00 C4 01 07 00 56 08 01 5D 08 01 5D 01 FF 00 1D 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 06 07 00 BC 07 00 C4 01 07 00 56 08 01 5D 08 01 5D 43 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 07 07 00 BC 07 00 C4 01 07 00 56 08 01 5D 08 01 5D 07 00 03 45 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 05 07 00 BC 07 00 C4 01 07 00 56 07 00 94 4A 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 08 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 08 01 9B 08 01 9B 07 00 03 45 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 08 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 08 01 9B 08 01 9B 01 42 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 08 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 08 01 9B 08 01 9B 01 45 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 08 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 08 01 9B 08 01 9B 07 00 A4 47 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 0B 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 08 01 9B 08 01 9B 07 00 A4 08 01 B6 08 01 B6 07 00 03 45 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 09 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 08 01 9B 08 01 9B 07 00 A4 07 00 AA 45 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 09 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 08 01 9B 08 01 9B 07 00 A4 07 00 9C 45 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 06 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 07 00 9E FF 00 0E 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 07 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 07 00 8B 07 00 03 FF 00 01 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 08 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 07 00 8B 07 00 03 01 FF 00 1E 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 07 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 07 00 8B 07 00 03 FF 00 11 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 08 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 07 00 8B 07 00 8B 07 00 8B FF 00 01 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 09 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 07 00 8B 07 00 8B 07 00 8B 01 FF 00 1B 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 08 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 07 00 8B 07 00 8B 07 00 8B 42 07 00 4E FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 08 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 07 00 8B 07 00 8B 07 00 8B 45 07 00 4E 00 FF 00 00 00 05 07 00 03 07 00 BC 07 00 56 07 00 78 07 00 6E 00 02 07 00 56 07 00 78 FF 00 01 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 08 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 07 00 8B 07 00 8B 07 00 8B 01 FF 00 01 00 03 07 00 03 07 00 BC 07 00 56 00 01 07 00 65 FF 00 01 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 06 07 00 BC 07 00 C4 01 07 00 56 08 01 5D 08 01 5D 41 07 00 78 FF 00 01 00 05 07 00 03 07 00 BC 07 00 56 00 07 00 6E 00 07 07 00 BC 07 00 C4 01 07 00 56 07 00 9C 07 00 8B 07 00 03 FF 00 01 00 02 07 00 03 07 00 BC 00 01 07 00 4E 43 05 44 07 00 4E 47 05 47 07 00 4E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     599    607    Any
        //  599    607    599    607    Ljava/lang/ClassCastException;
        //  615    617    3      8      Ljava/lang/ClassCastException;
        //  33     40     40     41     Any
        //  33     40     3      8      Ljava/lang/RuntimeException;
        //  33     40     33     34     Any
        //  34     40     40     41     Ljava/util/ConcurrentModificationException;
        //  33     40     40     41     Ljava/lang/NullPointerException;
        //  53     61     61     62     Any
        //  53     61     61     62     Any
        //  53     61     3      8      Ljava/lang/ArithmeticException;
        //  53     61     61     62     Any
        //  53     61     3      8      Ljava/lang/RuntimeException;
        //  107    116    116    117    Any
        //  108    116    107    108    Any
        //  107    116    116    117    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  107    116    3      8      Any
        //  107    116    116    117    Ljava/lang/ClassCastException;
        //  165    174    174    175    Any
        //  166    174    165    166    Any
        //  165    174    3      8      Any
        //  165    174    174    175    Any
        //  166    174    165    166    Ljava/lang/NullPointerException;
        //  183    192    192    193    Any
        //  183    192    183    184    Any
        //  184    192    3      8      Ljava/lang/ClassCastException;
        //  183    192    3      8      Any
        //  183    192    3      8      Any
        //  288    294    294    295    Any
        //  288    294    3      8      Any
        //  288    294    294    295    Any
        //  288    294    3      8      Any
        //  288    294    294    295    Ljava/lang/IndexOutOfBoundsException;
        //  298    307    307    308    Any
        //  298    307    298    299    Any
        //  299    307    307    308    Any
        //  299    307    3      8      Any
        //  298    307    307    308    Any
        //  324    331    331    332    Any
        //  325    331    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  324    331    331    332    Any
        //  325    331    324    325    Ljava/lang/UnsupportedOperationException;
        //  325    331    324    325    Ljava/lang/NegativeArraySizeException;
        //  340    347    347    348    Any
        //  340    347    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  341    347    340    341    Ljava/lang/UnsupportedOperationException;
        //  341    347    340    341    Any
        //  340    347    347    348    Ljava/util/ConcurrentModificationException;
        //  400    407    407    408    Any
        //  401    407    407    408    Ljava/lang/RuntimeException;
        //  400    407    400    401    Ljava/lang/IllegalArgumentException;
        //  401    407    400    401    Ljava/lang/AssertionError;
        //  401    407    3      8      Any
        //  419    426    426    427    Any
        //  419    426    3      8      Any
        //  420    426    419    420    Ljava/lang/IllegalStateException;
        //  419    426    419    420    Any
        //  419    426    426    427    Any
        //  430    437    437    438    Any
        //  431    437    3      8      Ljava/lang/RuntimeException;
        //  431    437    430    431    Ljava/lang/IllegalArgumentException;
        //  430    437    430    431    Any
        //  430    437    430    431    Any
        //  446    453    453    454    Any
        //  446    453    3      8      Any
        //  446    453    453    454    Ljava/lang/StringIndexOutOfBoundsException;
        //  446    453    446    447    Any
        //  447    453    453    454    Ljava/util/ConcurrentModificationException;
        //  460    467    467    468    Any
        //  461    467    460    461    Any
        //  461    467    467    468    Ljava/lang/UnsupportedOperationException;
        //  461    467    3      8      Ljava/lang/IllegalStateException;
        //  461    467    460    461    Any
        //  567    574    574    575    Any
        //  568    574    574    575    Any
        //  568    574    574    575    Any
        //  568    574    567    568    Any
        //  568    574    574    575    Ljava/util/ConcurrentModificationException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visitVariable(StackMappingVisitor.java:470)
        //     at com.strobel.assembler.ir.Instruction.accept(Instruction.java:556)
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
    
    public void 3(@NotNull final String s) {
        fbS.9n(this, 1563434713, s);
    }
    
    public void c(@Nullable final String s) {
        fbS.9p(this, 603449828, s);
    }
    
    public void 5(@Nullable final String s) {
        fbS.9m(this, 812234696, s);
    }
    
    public void 2(final int n) {
        fbS.6b(this, 1764401548, n);
    }
    
    @Nullable
    public String 8() {
        return fbS.5e(this, 4103934);
    }
    
    public fH(@NotNull final String s, @NotNull final String s2, @Nullable final String s3) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.c < 0) {
                    n = 1874108524;
                    break Label_0013;
                }
                n = -1413950736;
            }
            switch (n ^ 0xC9AB7C2A) {
                case -1375531628: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0061: {
                            if (fc.c < 0) {
                                n2 = 1418984276;
                                break Label_0061;
                            }
                            n2 = 421413179;
                        }
                        switch (n2 ^ 0x3B1A2AE) {
                            case 1461869050: {
                                continue;
                            }
                            case 447734677: {
                                while (true) {
                                    int n3 = 0;
                                    Label_0106: {
                                        if (fc.c < 0) {
                                            n3 = 883102703;
                                            break Label_0106;
                                        }
                                        n3 = 1904525040;
                                    }
                                    switch (n3 ^ 0xD9C844DA) {
                                        case 121094547: {
                                            continue;
                                        }
                                        default: {
                                            this(s, s2, s3, false);
                                            return;
                                        }
                                        case -311732427: {
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
                    break;
                }
                case -1507861434: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @Nullable
    public String 5() {
        return fbS.4U(this, 1849641032);
    }
    
    public void 0(@Nullable final String s) {
        fbS.9i(this, 772409409, s);
    }
    
    public void 2(@NotNull final String s) {
        fbS.9l(this, 2119978916, s);
    }
    
    public fH(@NotNull final String 1, @NotNull final String 2, @Nullable final String 3, final boolean b) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifge            11
        //     6: ldc             -1787981170
        //     8: goto            13
        //    11: ldc             2109744170
        //    13: ldc             -276018201
        //    15: ixor           
        //    16: lookupswitch {
        //          -1840484403: 44
        //          2061621609: 11
        //          default: 951
        //        }
        //    44: aload_1        
        //    45: pop            
        //    46: aload_2        
        //    47: pop            
        //    48: aload_0        
        //    49: invokespecial   java/lang/Object.<init>:()V
        //    52: aload_0        
        //    53: aload_1        
        //    54: getstatic       dev/nuker/pyro/fc.1:I
        //    57: ifeq            65
        //    60: ldc             -1758728561
        //    62: goto            67
        //    65: ldc             -889055469
        //    67: ldc             906395444
        //    69: ixor           
        //    70: lookupswitch {
        //          -1651389390: 65
        //          -1590849093: 955
        //          default: 96
        //        }
        //    96: putfield        dev/nuker/pyro/fH.1:Ljava/lang/String;
        //    99: aload_0        
        //   100: aload_2        
        //   101: getstatic       dev/nuker/pyro/fc.0:I
        //   104: ifeq            112
        //   107: ldc             1519865315
        //   109: goto            114
        //   112: ldc             -1516429934
        //   114: ldc             484721844
        //   116: ixor           
        //   117: lookupswitch {
        //          -1027985789: 112
        //          1181944151: 963
        //          default: 144
        //        }
        //   144: putfield        dev/nuker/pyro/fH.2:Ljava/lang/String;
        //   147: getstatic       dev/nuker/pyro/fc.0:I
        //   150: ifeq            158
        //   153: ldc             653359476
        //   155: goto            161
        //   158: ldc_w           -1642814218
        //   161: ldc_w           -1884051274
        //   164: ixor           
        //   165: lookupswitch {
        //          -1455238718: 947
        //          -198751186: 158
        //          default: 192
        //        }
        //   192: aload_0        
        //   193: getstatic       dev/nuker/pyro/fc.1:I
        //   196: ifeq            205
        //   199: ldc_w           -1666984009
        //   202: goto            208
        //   205: ldc_w           1226848374
        //   208: ldc_w           -928798851
        //   211: ixor           
        //   212: lookupswitch {
        //          -1851211179: 205
        //          1409315018: 943
        //          default: 240
        //        }
        //   240: aload_3        
        //   241: getstatic       dev/nuker/pyro/fc.c:I
        //   244: ifge            253
        //   247: ldc_w           -134474565
        //   250: goto            256
        //   253: ldc_w           923704025
        //   256: ldc_w           -1308510216
        //   259: ixor           
        //   260: lookupswitch {
        //          -324469837: 253
        //          1174250307: 933
        //          default: 288
        //        }
        //   288: putfield        dev/nuker/pyro/fH.3:Ljava/lang/String;
        //   291: getstatic       dev/nuker/pyro/fc.c:I
        //   294: ifge            303
        //   297: ldc_w           -950915241
        //   300: goto            306
        //   303: ldc_w           452198797
        //   306: ldc_w           -1789431915
        //   309: ixor           
        //   310: lookupswitch {
        //          -1887035784: 303
        //          1376075970: 941
        //          default: 336
        //        }
        //   336: aload_0        
        //   337: getstatic       dev/nuker/pyro/fc.c:I
        //   340: ifge            349
        //   343: ldc_w           -423629584
        //   346: goto            352
        //   349: ldc_w           1325995382
        //   352: ldc_w           328234668
        //   355: ixor           
        //   356: lookupswitch {
        //          -181429668: 349
        //          1553556442: 384
        //          default: 939
        //        }
        //   384: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   387: putfield        dev/nuker/pyro/fH.c:Lnet/minecraft/client/Minecraft;
        //   390: aload_0        
        //   391: new             Ljava/util/LinkedHashMap;
        //   394: dup            
        //   395: invokespecial   java/util/LinkedHashMap.<init>:()V
        //   398: checkcast       Ljava/util/Map;
        //   401: getstatic       dev/nuker/pyro/fc.0:I
        //   404: ifeq            413
        //   407: ldc_w           46396231
        //   410: goto            416
        //   413: ldc_w           256149998
        //   416: ldc_w           -989102617
        //   419: ixor           
        //   420: lookupswitch {
        //          -943157600: 931
        //          560624370: 413
        //          default: 448
        //        }
        //   448: putfield        dev/nuker/pyro/fH.c:Ljava/util/Map;
        //   451: aload_0        
        //   452: iconst_m1      
        //   453: putfield        dev/nuker/pyro/fH.c:I
        //   456: aload_0        
        //   457: iconst_m1      
        //   458: putfield        dev/nuker/pyro/fH.0:I
        //   461: aload_0        
        //   462: new             Ldev/nuker/pyro/fz;
        //   465: dup            
        //   466: iconst_0       
        //   467: getstatic       dev/nuker/pyro/fc.c:I
        //   470: ifge            479
        //   473: ldc_w           -1334608884
        //   476: goto            482
        //   479: ldc_w           -843472632
        //   482: ldc_w           598144152
        //   485: ixor           
        //   486: lookupswitch {
        //          -1814722412: 961
        //          -157695086: 479
        //          default: 512
        //        }
        //   512: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   515: new             Ldev/nuker/pyro/fB;
        //   518: dup            
        //   519: aload_0        
        //   520: getstatic       dev/nuker/pyro/fc.0:I
        //   523: ifeq            532
        //   526: ldc_w           307173614
        //   529: goto            535
        //   532: ldc_w           -2063004374
        //   535: ldc_w           1779666863
        //   538: ixor           
        //   539: lookupswitch {
        //          1023630458: 532
        //          2019333953: 953
        //          default: 564
        //        }
        //   564: invokespecial   dev/nuker/pyro/fB.<init>:(Ldev/nuker/pyro/fH;)V
        //   567: checkcast       Ljava/util/function/Consumer;
        //   570: invokespecial   dev/nuker/pyro/fz.<init>:(Ljava/lang/Object;Ljava/util/function/Consumer;)V
        //   573: checkcast       Ldev/nuker/pyro/fw;
        //   576: getstatic       dev/nuker/pyro/fc.c:I
        //   579: ifge            588
        //   582: ldc_w           212558901
        //   585: goto            591
        //   588: ldc_w           1859909713
        //   591: ldc_w           -1423880597
        //   594: ixor           
        //   595: lookupswitch {
        //          -1484117410: 937
        //          760764346: 588
        //          default: 620
        //        }
        //   620: putfield        dev/nuker/pyro/fH.c:Ldev/nuker/pyro/fw;
        //   623: aload_0        
        //   624: new             Ldev/nuker/pyro/fz;
        //   627: dup            
        //   628: iload           4
        //   630: getstatic       dev/nuker/pyro/fc.1:I
        //   633: ifeq            642
        //   636: ldc_w           620265988
        //   639: goto            645
        //   642: ldc_w           118961338
        //   645: ldc_w           -85251233
        //   648: ixor           
        //   649: lookupswitch {
        //          -1540105219: 642
        //          -569136805: 949
        //          default: 676
        //        }
        //   676: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   679: new             Ldev/nuker/pyro/fC;
        //   682: dup            
        //   683: aload_0        
        //   684: invokespecial   dev/nuker/pyro/fC.<init>:(Ldev/nuker/pyro/fH;)V
        //   687: checkcast       Ljava/util/function/Consumer;
        //   690: getstatic       dev/nuker/pyro/fc.c:I
        //   693: ifge            702
        //   696: ldc_w           -1422904114
        //   699: goto            705
        //   702: ldc_w           -984940966
        //   705: ldc_w           874428299
        //   708: ixor           
        //   709: lookupswitch {
        //          -1624341691: 935
        //          785566259: 702
        //          default: 736
        //        }
        //   736: invokespecial   dev/nuker/pyro/fz.<init>:(Ljava/lang/Object;Ljava/util/function/Consumer;)V
        //   739: checkcast       Ldev/nuker/pyro/fw;
        //   742: getstatic       dev/nuker/pyro/fc.c:I
        //   745: ifge            754
        //   748: ldc_w           -796614358
        //   751: goto            757
        //   754: ldc_w           -679792876
        //   757: ldc_w           224499725
        //   760: ixor           
        //   761: lookupswitch {
        //          -572180185: 957
        //          1362222525: 754
        //          default: 788
        //        }
        //   788: putfield        dev/nuker/pyro/fH.2:Ldev/nuker/pyro/fw;
        //   791: getstatic       dev/nuker/pyro/fc.1:I
        //   794: ifeq            803
        //   797: ldc_w           -1482488092
        //   800: goto            806
        //   803: ldc_w           -768898519
        //   806: ldc_w           1066249411
        //   809: ixor           
        //   810: lookupswitch {
        //          -1741772249: 803
        //          -307878166: 836
        //          default: 959
        //        }
        //   836: aload_0        
        //   837: new             Ldev/nuker/pyro/fz;
        //   840: dup            
        //   841: iconst_0       
        //   842: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   845: new             Ldev/nuker/pyro/fD;
        //   848: dup            
        //   849: getstatic       dev/nuker/pyro/fc.1:I
        //   852: ifeq            861
        //   855: ldc_w           266862954
        //   858: goto            864
        //   861: ldc_w           -1291461309
        //   864: ldc_w           -265414947
        //   867: ixor           
        //   868: lookupswitch {
        //          -3795017: 861
        //          1126943646: 896
        //          default: 945
        //        }
        //   896: aload_0        
        //   897: invokespecial   dev/nuker/pyro/fD.<init>:(Ldev/nuker/pyro/fH;)V
        //   900: checkcast       Ljava/util/function/Consumer;
        //   903: invokespecial   dev/nuker/pyro/fz.<init>:(Ljava/lang/Object;Ljava/util/function/Consumer;)V
        //   906: checkcast       Ldev/nuker/pyro/fw;
        //   909: putfield        dev/nuker/pyro/fH.0:Ldev/nuker/pyro/fw;
        //   912: aload_0        
        //   913: new             Ldev/nuker/pyro/fz;
        //   916: dup            
        //   917: iconst_0       
        //   918: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   921: invokespecial   dev/nuker/pyro/fz.<init>:(Ljava/lang/Object;)V
        //   924: checkcast       Ldev/nuker/pyro/fw;
        //   927: putfield        dev/nuker/pyro/fH.1:Ldev/nuker/pyro/fw;
        //   930: return         
        //   931: aconst_null    
        //   932: athrow         
        //   933: aconst_null    
        //   934: athrow         
        //   935: aconst_null    
        //   936: athrow         
        //   937: aconst_null    
        //   938: athrow         
        //   939: aconst_null    
        //   940: athrow         
        //   941: aconst_null    
        //   942: athrow         
        //   943: aconst_null    
        //   944: athrow         
        //   945: aconst_null    
        //   946: athrow         
        //   947: aconst_null    
        //   948: athrow         
        //   949: aconst_null    
        //   950: athrow         
        //   951: aconst_null    
        //   952: athrow         
        //   953: aconst_null    
        //   954: athrow         
        //   955: aconst_null    
        //   956: athrow         
        //   957: aconst_null    
        //   958: athrow         
        //   959: aconst_null    
        //   960: athrow         
        //   961: aconst_null    
        //   962: athrow         
        //   963: aconst_null    
        //   964: athrow         
        //    StackMapTable: 00 44 0B 41 01 1E FF 00 14 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 C4 FF 00 01 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 03 07 00 03 07 00 C4 01 FF 00 1C 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 C4 FF 00 0F 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 C4 FF 00 01 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 03 07 00 03 07 00 C4 01 FF 00 1D 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 C4 0D 42 01 1E 4C 07 00 03 FF 00 02 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 01 5F 07 00 03 FF 00 0C 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 C4 FF 00 02 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 03 07 00 03 07 00 C4 01 FF 00 1F 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 C4 0E 42 01 1D 4C 07 00 03 FF 00 02 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 01 5F 07 00 03 FF 00 1C 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 5A FF 00 02 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 03 07 00 03 07 00 5A 01 FF 00 1F 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 5A FF 00 1E 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 04 07 00 03 08 01 CE 08 01 CE 01 FF 00 02 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 05 07 00 03 08 01 CE 08 01 CE 01 01 FF 00 1D 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 04 07 00 03 08 01 CE 08 01 CE 01 FF 00 13 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 07 07 00 03 08 01 CE 08 01 CE 07 00 8F 08 02 03 08 02 03 07 00 03 FF 00 02 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 08 07 00 03 08 01 CE 08 01 CE 07 00 8F 08 02 03 08 02 03 07 00 03 01 FF 00 1C 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 07 07 00 03 08 01 CE 08 01 CE 07 00 8F 08 02 03 08 02 03 07 00 03 FF 00 17 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 8B FF 00 02 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 03 07 00 03 07 00 8B 01 FF 00 1C 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 8B FF 00 15 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 04 07 00 03 08 02 70 08 02 70 01 FF 00 02 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 05 07 00 03 08 02 70 08 02 70 01 01 FF 00 1E 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 04 07 00 03 08 02 70 08 02 70 01 FF 00 19 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 05 07 00 03 08 02 70 08 02 70 07 00 8F 07 00 9C FF 00 02 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 06 07 00 03 08 02 70 08 02 70 07 00 8F 07 00 9C 01 FF 00 1E 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 05 07 00 03 08 02 70 08 02 70 07 00 8F 07 00 9C FF 00 11 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 8B FF 00 02 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 03 07 00 03 07 00 8B 01 FF 00 1E 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 8B 0E 42 01 1D FF 00 18 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 06 07 00 03 08 03 45 08 03 45 07 00 8F 08 03 4D 08 03 4D FF 00 02 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 07 07 00 03 08 03 45 08 03 45 07 00 8F 08 03 4D 08 03 4D 01 FF 00 1F 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 06 07 00 03 08 03 45 08 03 45 07 00 8F 08 03 4D 08 03 4D FF 00 22 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 5A FF 00 01 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 C4 FF 00 01 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 05 07 00 03 08 02 70 08 02 70 07 00 8F 07 00 9C FF 00 01 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 8B 41 07 00 03 01 41 07 00 03 FF 00 01 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 06 07 00 03 08 03 45 08 03 45 07 00 8F 08 03 4D 08 03 4D 01 FF 00 01 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 04 07 00 03 08 02 70 08 02 70 01 FF 00 01 00 05 06 07 00 C4 07 00 C4 07 00 C4 01 00 00 FF 00 01 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 07 07 00 03 08 01 CE 08 01 CE 07 00 8F 08 02 03 08 02 03 07 00 03 FF 00 01 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 C4 FF 00 01 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 8B 01 FF 00 01 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 04 07 00 03 08 01 CE 08 01 CE 01 FF 00 01 00 05 07 00 03 07 00 C4 07 00 C4 07 00 C4 01 00 02 07 00 03 07 00 C4
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:344)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:173)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:169)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:547)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
    
    @Nullable
    public String 2() {
        return fbS.52(this, 749564102);
    }
    
    public void c(final int n) {
        fbS.6f(this, 1228313657, n);
    }
    
    public void c(final boolean b, @Nullable final EntityPlayerSP entityPlayerSP, @Nullable final World world) {
        fbS.5Z(this, 7889787, b, entityPlayerSP, world);
    }
    
    @NotNull
    public JsonObject 4() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1244
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1236
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1228
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lcom/google/gson/JsonObject;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/fc.0:I
        //    31: ifeq            40
        //    34: ldc_w           1404442231
        //    37: goto            43
        //    40: ldc_w           2105401262
        //    43: ldc_w           -920946793
        //    46: ixor           
        //    47: lookupswitch {
        //          -1699913248: 40
        //          -1268340679: 72
        //          default: 1211
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokespecial   com/google/gson/JsonObject.<init>:()V
        //    79: goto            83
        //    82: athrow         
        //    83: astore_1       
        //    84: aload_1        
        //    85: ldc_w           "\u1087\u149d\ub99a\ub19d\ufd03\ude81\ub220"
        //    88: goto            92
        //    91: athrow         
        //    92: invokestatic    invokestatic   !!! ERROR
        //    95: goto            99
        //    98: athrow         
        //    99: new             Lcom/google/gson/JsonPrimitive;
        //   102: dup            
        //   103: aload_0        
        //   104: getfield        dev/nuker/pyro/fH.c:Ldev/nuker/pyro/fw;
        //   107: goto            111
        //   110: athrow         
        //   111: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   114: goto            118
        //   117: athrow         
        //   118: checkcast       Ljava/lang/Boolean;
        //   121: getstatic       dev/nuker/pyro/fc.c:I
        //   124: ifge            133
        //   127: ldc_w           -575866459
        //   130: goto            136
        //   133: ldc_w           -1472409433
        //   136: ldc_w           -1834407155
        //   139: ixor           
        //   140: lookupswitch {
        //          572164392: 133
        //          1325781672: 1207
        //          default: 168
        //        }
        //   168: goto            172
        //   171: athrow         
        //   172: invokespecial   com/google/gson/JsonPrimitive.<init>:(Ljava/lang/Boolean;)V
        //   175: goto            179
        //   178: athrow         
        //   179: checkcast       Lcom/google/gson/JsonElement;
        //   182: goto            186
        //   185: athrow         
        //   186: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   189: goto            193
        //   192: athrow         
        //   193: getstatic       dev/nuker/pyro/fc.c:I
        //   196: ifge            205
        //   199: ldc_w           -1200766606
        //   202: goto            208
        //   205: ldc_w           1417115889
        //   208: ldc_w           -395683426
        //   211: ixor           
        //   212: lookupswitch {
        //          -1182483630: 205
        //          1342675180: 1213
        //          default: 240
        //        }
        //   240: aload_1        
        //   241: ldc_w           "\u1087\u148b\ub98b\ub19e\ufd01\ude80\ub221\ud5b2"
        //   244: goto            248
        //   247: athrow         
        //   248: invokestatic    invokestatic   !!! ERROR
        //   251: goto            255
        //   254: athrow         
        //   255: new             Lcom/google/gson/JsonPrimitive;
        //   258: dup            
        //   259: aload_0        
        //   260: getstatic       dev/nuker/pyro/fc.0:I
        //   263: ifeq            272
        //   266: ldc_w           959656874
        //   269: goto            275
        //   272: ldc_w           -732789303
        //   275: ldc_w           -2065953828
        //   278: ixor           
        //   279: lookupswitch {
        //          -1108395914: 1193
        //          758297835: 272
        //          default: 304
        //        }
        //   304: getfield        dev/nuker/pyro/fH.0:Ldev/nuker/pyro/fw;
        //   307: goto            311
        //   310: athrow         
        //   311: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   314: goto            318
        //   317: athrow         
        //   318: checkcast       Ljava/lang/Boolean;
        //   321: goto            325
        //   324: athrow         
        //   325: invokespecial   com/google/gson/JsonPrimitive.<init>:(Ljava/lang/Boolean;)V
        //   328: goto            332
        //   331: athrow         
        //   332: checkcast       Lcom/google/gson/JsonElement;
        //   335: goto            339
        //   338: athrow         
        //   339: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   342: goto            346
        //   345: athrow         
        //   346: aload_1        
        //   347: ldc_w           "\u1089\u1496\ub982\ub19d\ufd06\ude8a\ub220"
        //   350: goto            354
        //   353: athrow         
        //   354: invokestatic    invokestatic   !!! ERROR
        //   357: goto            361
        //   360: athrow         
        //   361: new             Lcom/google/gson/JsonPrimitive;
        //   364: dup            
        //   365: aload_0        
        //   366: getstatic       dev/nuker/pyro/fc.c:I
        //   369: ifge            378
        //   372: ldc_w           780969046
        //   375: goto            381
        //   378: ldc_w           443248501
        //   381: ldc_w           352864798
        //   384: ixor           
        //   385: lookupswitch {
        //          258155883: 412
        //          998567496: 378
        //          default: 1215
        //        }
        //   412: goto            416
        //   415: athrow         
        //   416: invokevirtual   dev/nuker/pyro/fH.7:()I
        //   419: goto            423
        //   422: athrow         
        //   423: goto            427
        //   426: athrow         
        //   427: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   430: goto            434
        //   433: athrow         
        //   434: checkcast       Ljava/lang/Number;
        //   437: goto            441
        //   440: athrow         
        //   441: invokespecial   com/google/gson/JsonPrimitive.<init>:(Ljava/lang/Number;)V
        //   444: goto            448
        //   447: athrow         
        //   448: checkcast       Lcom/google/gson/JsonElement;
        //   451: goto            455
        //   454: athrow         
        //   455: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   458: goto            462
        //   461: athrow         
        //   462: getstatic       dev/nuker/pyro/fc.1:I
        //   465: ifeq            474
        //   468: ldc_w           -642927047
        //   471: goto            477
        //   474: ldc_w           990121044
        //   477: ldc_w           -1785395533
        //   480: ixor           
        //   481: lookupswitch {
        //          -1281426394: 474
        //          1278783626: 1205
        //          default: 508
        //        }
        //   508: aload_1        
        //   509: ldc_w           "\u108a\u149a\ub99f\ub19b\ufd0a\ude8a"
        //   512: goto            516
        //   515: athrow         
        //   516: invokestatic    invokestatic   !!! ERROR
        //   519: goto            523
        //   522: athrow         
        //   523: new             Lcom/google/gson/JsonPrimitive;
        //   526: dup            
        //   527: aload_0        
        //   528: getfield        dev/nuker/pyro/fH.2:Ldev/nuker/pyro/fw;
        //   531: goto            535
        //   534: athrow         
        //   535: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   538: goto            542
        //   541: athrow         
        //   542: checkcast       Ljava/lang/Boolean;
        //   545: goto            549
        //   548: athrow         
        //   549: invokespecial   com/google/gson/JsonPrimitive.<init>:(Ljava/lang/Boolean;)V
        //   552: goto            556
        //   555: athrow         
        //   556: checkcast       Lcom/google/gson/JsonElement;
        //   559: goto            563
        //   562: athrow         
        //   563: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   566: goto            570
        //   569: athrow         
        //   570: new             Lcom/google/gson/JsonObject;
        //   573: dup            
        //   574: getstatic       dev/nuker/pyro/fc.c:I
        //   577: ifge            586
        //   580: ldc_w           878542413
        //   583: goto            589
        //   586: ldc_w           -976898899
        //   589: ldc_w           1221562446
        //   592: ixor           
        //   593: lookupswitch {
        //          1846262479: 586
        //          2090003971: 1199
        //          default: 620
        //        }
        //   620: goto            624
        //   623: athrow         
        //   624: invokespecial   com/google/gson/JsonObject.<init>:()V
        //   627: goto            631
        //   630: athrow         
        //   631: astore_2       
        //   632: aload_0        
        //   633: getstatic       dev/nuker/pyro/fc.c:I
        //   636: ifge            645
        //   639: ldc_w           1606217449
        //   642: goto            648
        //   645: ldc_w           -1876390605
        //   648: ldc_w           680220720
        //   651: ixor           
        //   652: lookupswitch {
        //          -1197222653: 680
        //          2000139993: 645
        //          default: 1217
        //        }
        //   680: getfield        dev/nuker/pyro/fH.c:Ljava/util/Map;
        //   683: astore          5
        //   685: iconst_0       
        //   686: istore          6
        //   688: aload           5
        //   690: goto            694
        //   693: athrow         
        //   694: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   699: goto            703
        //   702: athrow         
        //   703: goto            707
        //   706: athrow         
        //   707: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   712: goto            716
        //   715: athrow         
        //   716: astore          4
        //   718: getstatic       dev/nuker/pyro/fc.c:I
        //   721: ifge            730
        //   724: ldc_w           378484125
        //   727: goto            733
        //   730: ldc_w           -1847953443
        //   733: ldc_w           -1638325908
        //   736: ixor           
        //   737: lookupswitch {
        //          -1999235855: 730
        //          260265649: 764
        //          default: 1209
        //        }
        //   764: aload           4
        //   766: goto            770
        //   769: athrow         
        //   770: invokeinterface java/util/Iterator.hasNext:()Z
        //   775: goto            779
        //   778: athrow         
        //   779: ifeq            1157
        //   782: aload           4
        //   784: goto            788
        //   787: athrow         
        //   788: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   793: goto            797
        //   796: athrow         
        //   797: checkcast       Ljava/util/Map$Entry;
        //   800: astore_3       
        //   801: getstatic       dev/nuker/pyro/fc.1:I
        //   804: ifeq            813
        //   807: ldc_w           1686700484
        //   810: goto            816
        //   813: ldc_w           372262982
        //   816: ldc_w           102745510
        //   819: ixor           
        //   820: lookupswitch {
        //          -93546368: 813
        //          1654047842: 1189
        //          default: 848
        //        }
        //   848: aload_3        
        //   849: astore          7
        //   851: iconst_0       
        //   852: istore          8
        //   854: aload           7
        //   856: getstatic       dev/nuker/pyro/fc.c:I
        //   859: ifge            868
        //   862: ldc_w           535908068
        //   865: goto            871
        //   868: ldc_w           1997144119
        //   871: ldc_w           909408706
        //   874: ixor           
        //   875: lookupswitch {
        //          700790566: 1203
        //          1017176414: 868
        //          default: 900
        //        }
        //   900: goto            904
        //   903: athrow         
        //   904: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   909: goto            913
        //   912: athrow         
        //   913: checkcast       Ljava/lang/String;
        //   916: astore          5
        //   918: getstatic       dev/nuker/pyro/fc.1:I
        //   921: ifeq            930
        //   924: ldc_w           541746569
        //   927: goto            933
        //   930: ldc_w           -1733662361
        //   933: ldc_w           -621805991
        //   936: ixor           
        //   937: lookupswitch {
        //          -89809968: 1195
        //          1899058104: 930
        //          default: 964
        //        }
        //   964: aload_3        
        //   965: astore          7
        //   967: iconst_0       
        //   968: istore          8
        //   970: aload           7
        //   972: getstatic       dev/nuker/pyro/fc.1:I
        //   975: ifeq            984
        //   978: ldc_w           -47799383
        //   981: goto            987
        //   984: ldc_w           1140995614
        //   987: ldc_w           -1656289679
        //   990: ixor           
        //   991: lookupswitch {
        //          129064960: 984
        //          1617012184: 1197
        //          default: 1016
        //        }
        //  1016: goto            1020
        //  1019: athrow         
        //  1020: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //  1025: goto            1029
        //  1028: athrow         
        //  1029: checkcast       Ldev/nuker/pyro/f0n;
        //  1032: astore          6
        //  1034: aload_2        
        //  1035: aload           5
        //  1037: getstatic       dev/nuker/pyro/fc.c:I
        //  1040: ifge            1049
        //  1043: ldc_w           341084780
        //  1046: goto            1052
        //  1049: ldc_w           94750734
        //  1052: ldc_w           174921386
        //  1055: ixor           
        //  1056: lookupswitch {
        //          507092166: 1201
        //          1301967737: 1049
        //          default: 1084
        //        }
        //  1084: aload           6
        //  1086: getstatic       dev/nuker/pyro/fc.1:I
        //  1089: ifeq            1098
        //  1092: ldc_w           -1577368505
        //  1095: goto            1101
        //  1098: ldc_w           1031955052
        //  1101: ldc_w           316497214
        //  1104: ixor           
        //  1105: lookupswitch {
        //          -1289348743: 1191
        //          1403965423: 1098
        //          default: 1132
        //        }
        //  1132: goto            1136
        //  1135: athrow         
        //  1136: invokevirtual   dev/nuker/pyro/f0n.c:()Lcom/google/gson/JsonElement;
        //  1139: goto            1143
        //  1142: athrow         
        //  1143: goto            1147
        //  1146: athrow         
        //  1147: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //  1150: goto            1154
        //  1153: athrow         
        //  1154: goto            718
        //  1157: aload_1        
        //  1158: ldc_w           "\u1091\u1496\ub98f\ub18b\ufd06\ude8a\ub223\ud5a5"
        //  1161: goto            1165
        //  1164: athrow         
        //  1165: invokestatic    invokestatic   !!! ERROR
        //  1168: goto            1172
        //  1171: athrow         
        //  1172: aload_2        
        //  1173: checkcast       Lcom/google/gson/JsonElement;
        //  1176: goto            1180
        //  1179: athrow         
        //  1180: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //  1183: goto            1187
        //  1186: athrow         
        //  1187: aload_1        
        //  1188: areturn        
        //  1189: aconst_null    
        //  1190: athrow         
        //  1191: aconst_null    
        //  1192: athrow         
        //  1193: aconst_null    
        //  1194: athrow         
        //  1195: aconst_null    
        //  1196: athrow         
        //  1197: aconst_null    
        //  1198: athrow         
        //  1199: aconst_null    
        //  1200: athrow         
        //  1201: aconst_null    
        //  1202: athrow         
        //  1203: aconst_null    
        //  1204: athrow         
        //  1205: aconst_null    
        //  1206: athrow         
        //  1207: aconst_null    
        //  1208: athrow         
        //  1209: aconst_null    
        //  1210: athrow         
        //  1211: aconst_null    
        //  1212: athrow         
        //  1213: aconst_null    
        //  1214: athrow         
        //  1215: aconst_null    
        //  1216: athrow         
        //  1217: aconst_null    
        //  1218: athrow         
        //  1219: pop            
        //  1220: goto            24
        //  1223: pop            
        //  1224: aconst_null    
        //  1225: goto            1219
        //  1228: dup            
        //  1229: ifnull          1219
        //  1232: checkcast       Ljava/lang/Throwable;
        //  1235: athrow         
        //  1236: dup            
        //  1237: ifnull          1223
        //  1240: checkcast       Ljava/lang/Throwable;
        //  1243: athrow         
        //  1244: aconst_null    
        //  1245: athrow         
        //    StackMapTable: 00 BB 43 07 00 4E 04 FF 00 0B 00 00 00 01 07 00 4E FC 00 03 07 00 03 FF 00 0F 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 02 00 01 07 00 03 00 03 08 00 18 08 00 18 01 FF 00 1C 00 01 07 00 03 00 02 08 00 18 08 00 18 42 07 00 4E FF 00 00 00 01 07 00 03 00 02 08 00 18 08 00 18 45 07 00 4E 40 07 01 5D FF 00 07 00 00 00 01 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 02 07 01 5D 07 00 C4 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 02 07 01 5D 07 00 C4 4A 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 00 63 08 00 63 07 00 8B 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 00 63 08 00 63 07 00 05 FF 00 0E 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 00 63 08 00 63 07 00 8F FF 00 02 00 02 07 00 03 07 01 5D 00 06 07 01 5D 07 00 C4 08 00 63 08 00 63 07 00 8F 01 FF 00 1F 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 00 63 08 00 63 07 00 8F 42 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 00 63 08 00 63 07 00 8F 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 03 07 01 5D 07 00 C4 07 01 6A 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 03 07 01 5D 07 00 C4 07 01 72 45 07 00 4E 00 0B 42 01 1F 46 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 02 07 01 5D 07 00 C4 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 02 07 01 5D 07 00 C4 FF 00 10 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 00 FF 08 00 FF 07 00 03 FF 00 02 00 02 07 00 03 07 01 5D 00 06 07 01 5D 07 00 C4 08 00 FF 08 00 FF 07 00 03 01 FF 00 1C 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 00 FF 08 00 FF 07 00 03 FF 00 05 00 00 00 01 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 00 FF 08 00 FF 07 00 8B 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 00 FF 08 00 FF 07 00 05 FF 00 05 00 00 00 01 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 00 FF 08 00 FF 07 00 8F 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 03 07 01 5D 07 00 C4 07 01 6A 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 03 07 01 5D 07 00 C4 07 01 72 45 07 00 4E 00 46 07 00 46 FF 00 00 00 02 07 00 03 07 01 5D 00 02 07 01 5D 07 00 C4 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 02 07 01 5D 07 00 C4 FF 00 10 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 01 69 08 01 69 07 00 03 FF 00 02 00 02 07 00 03 07 01 5D 00 06 07 01 5D 07 00 C4 08 01 69 08 01 69 07 00 03 01 FF 00 1E 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 01 69 08 01 69 07 00 03 42 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 01 69 08 01 69 07 00 03 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 01 69 08 01 69 01 42 07 00 3A FF 00 00 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 01 69 08 01 69 01 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 01 69 08 01 69 07 00 A4 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 01 69 08 01 69 07 01 84 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 03 07 01 5D 07 00 C4 07 01 6A 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 03 07 01 5D 07 00 C4 07 01 72 45 07 00 4E 00 0B 42 01 1E FF 00 06 00 00 00 01 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 02 07 01 5D 07 00 C4 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 02 07 01 5D 07 00 C4 4A 07 00 30 FF 00 00 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 02 0B 08 02 0B 07 00 8B 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 02 0B 08 02 0B 07 00 05 45 07 00 30 FF 00 00 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 02 0B 08 02 0B 07 00 8F 45 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 03 07 01 5D 07 00 C4 07 01 6A FF 00 05 00 00 00 01 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 03 07 01 5D 07 00 C4 07 01 72 45 07 00 4E 00 FF 00 0F 00 02 07 00 03 07 01 5D 00 02 08 02 3A 08 02 3A FF 00 02 00 02 07 00 03 07 01 5D 00 03 08 02 3A 08 02 3A 01 FF 00 1E 00 02 07 00 03 07 01 5D 00 02 08 02 3A 08 02 3A 42 07 00 4E FF 00 00 00 02 07 00 03 07 01 5D 00 02 08 02 3A 08 02 3A 45 07 00 4E 40 07 01 5D FF 00 0D 00 03 07 00 03 07 01 5D 07 01 5D 00 01 07 00 03 FF 00 02 00 03 07 00 03 07 01 5D 07 01 5D 00 02 07 00 03 01 5F 07 00 03 FF 00 0C 00 00 00 01 07 00 4E FF 00 00 00 07 07 00 03 07 01 5D 07 01 5D 00 00 07 00 5A 01 00 01 07 00 5A 47 07 00 4E 40 07 01 98 FF 00 02 00 00 00 01 07 00 4E FF 00 00 00 07 07 00 03 07 01 5D 07 01 5D 00 00 07 00 5A 01 00 01 07 01 98 47 07 00 4E 40 07 00 6E FF 00 01 00 06 07 00 03 07 01 5D 07 01 5D 00 07 00 6E 07 00 05 00 00 0B 42 01 1E 44 07 00 30 40 07 00 6E 47 07 00 4E 40 01 47 07 00 30 40 07 00 6E 47 07 00 4E 40 07 00 05 FF 00 0F 00 06 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 05 00 00 42 01 1F FF 00 13 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 05 00 07 01 9E 01 00 01 07 01 9E FF 00 02 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 05 00 07 01 9E 01 00 02 07 01 9E 01 5C 07 01 9E 42 07 00 4E 40 07 01 9E 47 07 00 4E 40 07 00 05 FF 00 10 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 C4 00 07 01 9E 01 00 00 42 01 1E 53 07 01 9E FF 00 02 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 C4 00 07 01 9E 01 00 02 07 01 9E 01 5C 07 01 9E 42 07 00 4E 40 07 01 9E 47 07 00 4E 40 07 00 05 FF 00 13 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 C4 07 00 78 07 01 9E 01 00 02 07 01 5D 07 00 C4 FF 00 02 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 C4 07 00 78 07 01 9E 01 00 03 07 01 5D 07 00 C4 01 FF 00 1F 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 C4 07 00 78 07 01 9E 01 00 02 07 01 5D 07 00 C4 FF 00 0D 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 C4 07 00 78 07 01 9E 01 00 03 07 01 5D 07 00 C4 07 00 78 FF 00 02 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 C4 07 00 78 07 01 9E 01 00 04 07 01 5D 07 00 C4 07 00 78 01 FF 00 1E 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 C4 07 00 78 07 01 9E 01 00 03 07 01 5D 07 00 C4 07 00 78 42 07 00 30 FF 00 00 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 C4 07 00 78 07 01 9E 01 00 03 07 01 5D 07 00 C4 07 00 78 45 07 00 4E FF 00 00 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 C4 07 00 78 07 01 9E 01 00 03 07 01 5D 07 00 C4 07 01 72 42 07 00 30 FF 00 00 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 C4 07 00 78 07 01 9E 01 00 03 07 01 5D 07 00 C4 07 01 72 45 07 00 4E 00 FF 00 02 00 06 07 00 03 07 01 5D 07 01 5D 00 07 00 6E 07 00 05 00 00 FF 00 06 00 00 00 01 07 00 4E FF 00 00 00 06 07 00 03 07 01 5D 07 01 5D 00 07 00 6E 07 00 05 00 02 07 01 5D 07 00 C4 45 07 00 4E FF 00 00 00 06 07 00 03 07 01 5D 07 01 5D 00 07 00 6E 07 00 05 00 02 07 01 5D 07 00 C4 46 07 00 4E FF 00 00 00 06 07 00 03 07 01 5D 07 01 5D 00 07 00 6E 07 00 05 00 03 07 01 5D 07 00 C4 07 01 72 45 07 00 4E 00 FF 00 01 00 06 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 05 00 00 FF 00 01 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 C4 07 00 78 07 01 9E 01 00 03 07 01 5D 07 00 C4 07 00 78 FF 00 01 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 00 FF 08 00 FF 07 00 03 FF 00 01 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 C4 00 07 01 9E 01 00 00 41 07 01 9E FF 00 01 00 02 07 00 03 07 01 5D 00 02 08 02 3A 08 02 3A FF 00 01 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 C4 07 00 78 07 01 9E 01 00 02 07 01 5D 07 00 C4 FF 00 01 00 09 07 00 03 07 01 5D 07 01 5D 07 01 9E 07 00 6E 07 00 05 00 07 01 9E 01 00 01 07 01 9E FF 00 01 00 02 07 00 03 07 01 5D 00 00 FF 00 01 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 00 63 08 00 63 07 00 8F FF 00 01 00 06 07 00 03 07 01 5D 07 01 5D 00 07 00 6E 07 00 05 00 00 FF 00 01 00 01 07 00 03 00 02 08 00 18 08 00 18 FC 00 01 07 01 5D FF 00 01 00 02 07 00 03 07 01 5D 00 05 07 01 5D 07 00 C4 08 01 69 08 01 69 07 00 03 FF 00 01 00 03 07 00 03 07 01 5D 07 01 5D 00 01 07 00 03 FF 00 01 00 01 07 00 03 00 01 07 00 4E 43 05 44 07 00 4E 47 05 47 07 00 4E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1228   1236   Any
        //  1228   1236   1228   1236   Ljava/lang/NullPointerException;
        //  1244   1246   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  75     82     82     83     Any
        //  76     82     75     76     Ljava/lang/NumberFormatException;
        //  75     82     3      8      Any
        //  75     82     75     76     Any
        //  75     82     3      8      Any
        //  92     98     98     99     Any
        //  92     98     98     99     Ljava/lang/EnumConstantNotPresentException;
        //  92     98     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  92     98     98     99     Ljava/lang/ClassCastException;
        //  92     98     98     99     Any
        //  110    117    117    118    Any
        //  111    117    110    111    Ljava/lang/RuntimeException;
        //  110    117    117    118    Any
        //  110    117    110    111    Any
        //  111    117    3      8      Ljava/lang/NullPointerException;
        //  171    178    178    179    Any
        //  172    178    171    172    Ljava/lang/NumberFormatException;
        //  171    178    178    179    Ljava/lang/StringIndexOutOfBoundsException;
        //  171    178    171    172    Any
        //  172    178    171    172    Ljava/util/NoSuchElementException;
        //  185    192    192    193    Any
        //  185    192    3      8      Any
        //  186    192    185    186    Any
        //  186    192    3      8      Ljava/lang/ArithmeticException;
        //  185    192    192    193    Ljava/lang/NumberFormatException;
        //  247    254    254    255    Any
        //  248    254    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  248    254    247    248    Any
        //  247    254    254    255    Any
        //  247    254    254    255    Any
        //  311    317    317    318    Any
        //  311    317    3      8      Ljava/lang/NumberFormatException;
        //  311    317    3      8      Any
        //  311    317    3      8      Any
        //  311    317    317    318    Any
        //  325    331    331    332    Any
        //  325    331    3      8      Any
        //  325    331    3      8      Ljava/lang/UnsupportedOperationException;
        //  325    331    3      8      Any
        //  325    331    331    332    Any
        //  338    345    345    346    Any
        //  339    345    3      8      Ljava/lang/IllegalStateException;
        //  338    345    338    339    Any
        //  339    345    338    339    Ljava/lang/ArithmeticException;
        //  338    345    345    346    Any
        //  353    360    360    361    Any
        //  354    360    3      8      Any
        //  354    360    353    354    Ljava/lang/IllegalStateException;
        //  354    360    360    361    Any
        //  354    360    3      8      Any
        //  415    422    422    423    Any
        //  415    422    422    423    Any
        //  415    422    415    416    Ljava/lang/NegativeArraySizeException;
        //  415    422    422    423    Ljava/lang/UnsupportedOperationException;
        //  415    422    415    416    Any
        //  426    433    433    434    Any
        //  427    433    426    427    Ljava/lang/IndexOutOfBoundsException;
        //  427    433    433    434    Any
        //  426    433    433    434    Any
        //  427    433    3      8      Any
        //  440    447    447    448    Any
        //  441    447    440    441    Any
        //  441    447    440    441    Any
        //  440    447    447    448    Ljava/lang/NullPointerException;
        //  441    447    440    441    Any
        //  454    461    461    462    Any
        //  454    461    454    455    Any
        //  454    461    461    462    Any
        //  454    461    454    455    Any
        //  455    461    454    455    Ljava/lang/EnumConstantNotPresentException;
        //  516    522    522    523    Any
        //  516    522    522    523    Ljava/lang/UnsupportedOperationException;
        //  516    522    522    523    Any
        //  516    522    522    523    Any
        //  516    522    3      8      Any
        //  534    541    541    542    Any
        //  534    541    541    542    Any
        //  534    541    541    542    Any
        //  535    541    534    535    Ljava/lang/RuntimeException;
        //  534    541    3      8      Any
        //  548    555    555    556    Any
        //  548    555    548    549    Ljava/lang/UnsupportedOperationException;
        //  548    555    548    549    Ljava/lang/IllegalStateException;
        //  549    555    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  549    555    548    549    Ljava/lang/NumberFormatException;
        //  563    569    569    570    Any
        //  563    569    569    570    Any
        //  563    569    569    570    Ljava/util/NoSuchElementException;
        //  563    569    3      8      Any
        //  563    569    569    570    Any
        //  623    630    630    631    Any
        //  623    630    3      8      Any
        //  623    630    630    631    Any
        //  624    630    3      8      Any
        //  623    630    623    624    Any
        //  694    702    702    703    Any
        //  694    702    3      8      Ljava/lang/ArithmeticException;
        //  694    702    702    703    Any
        //  694    702    702    703    Any
        //  694    702    702    703    Any
        //  707    715    715    716    Any
        //  707    715    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  707    715    3      8      Ljava/lang/NegativeArraySizeException;
        //  707    715    715    716    Any
        //  707    715    715    716    Any
        //  769    778    778    779    Any
        //  769    778    3      8      Any
        //  769    778    778    779    Ljava/util/ConcurrentModificationException;
        //  770    778    769    770    Ljava/lang/NegativeArraySizeException;
        //  769    778    769    770    Ljava/lang/UnsupportedOperationException;
        //  787    796    796    797    Any
        //  788    796    787    788    Ljava/lang/RuntimeException;
        //  787    796    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  788    796    3      8      Any
        //  788    796    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  903    912    912    913    Any
        //  903    912    903    904    Any
        //  904    912    912    913    Ljava/lang/ClassCastException;
        //  904    912    3      8      Any
        //  904    912    3      8      Any
        //  1019   1028   1028   1029   Any
        //  1020   1028   3      8      Ljava/lang/IllegalArgumentException;
        //  1020   1028   1028   1029   Ljava/lang/NegativeArraySizeException;
        //  1020   1028   1019   1020   Any
        //  1020   1028   3      8      Any
        //  1135   1142   1142   1143   Any
        //  1135   1142   1142   1143   Ljava/lang/AssertionError;
        //  1135   1142   1135   1136   Ljava/lang/IllegalStateException;
        //  1135   1142   1135   1136   Ljava/lang/ClassCastException;
        //  1135   1142   1135   1136   Ljava/util/ConcurrentModificationException;
        //  1146   1153   1153   1154   Any
        //  1146   1153   1146   1147   Ljava/lang/RuntimeException;
        //  1147   1153   3      8      Ljava/lang/NumberFormatException;
        //  1146   1153   3      8      Any
        //  1146   1153   3      8      Any
        //  1165   1171   1171   1172   Any
        //  1165   1171   3      8      Any
        //  1165   1171   3      8      Ljava/util/NoSuchElementException;
        //  1165   1171   3      8      Any
        //  1165   1171   3      8      Any
        //  1179   1186   1186   1187   Any
        //  1179   1186   1179   1180   Any
        //  1179   1186   1186   1187   Ljava/lang/ClassCastException;
        //  1180   1186   1179   1180   Any
        //  1179   1186   3      8      Ljava/util/NoSuchElementException;
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
    
    @NotNull
    public String 9() {
        return fbS.4T(this, 35607040);
    }
    
    public void c(@NotNull final JsonObject jsonObject) {
        fbS.3s(this, 2012052111, jsonObject);
    }
    
    public f0n c(final f0n p0) {
        public class fE implements Consumer
        {
            public fH c;
            
            static {
                throw t;
            }
            
            public fE(final fH c) {
                while (true) {
                    int n = 0;
                    Label_0015: {
                        if (fc.1 != 0) {
                            n = 1740361140;
                            break Label_0015;
                        }
                        n = 2045304438;
                    }
                    switch (n ^ 0x5DF21FAB) {
                        case 1385997419: {
                            continue;
                        }
                        default: {
                            this.c = c;
                            while (true) {
                                int n2 = 0;
                                Label_0060: {
                                    if (fc.c < 0) {
                                        n2 = 109980518;
                                        break Label_0060;
                                    }
                                    n2 = -976880592;
                                }
                                switch (n2 ^ 0x769EF4E1) {
                                    case 1858321046: {
                                        continue;
                                    }
                                    default: {
                                        return;
                                    }
                                    case 1880153991: {
                                        throw null;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        case 977916447: {
                            throw null;
                        }
                    }
                    break;
                }
            }
            
            public void c(@NotNull final f0n f0n) {
                fbS.d6(this, 1605737008, f0n);
            }
            
            @Override
            public void accept(final Object o) {
                fbS.2x(this, 1172641956, o);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          258
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            250
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            242
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/fH.c:Ljava/util/Map;
        //    28: aload_1        
        //    29: dup            
        //    30: ifnonnull       39
        //    33: ldc_w           1884698275
        //    36: goto            42
        //    39: ldc_w           1884698272
        //    42: ldc_w           -1625563586
        //    45: ixor           
        //    46: tableswitch {
        //          -560213702: 68
        //          -560213701: 79
        //          default: 33
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //    75: goto            79
        //    78: athrow         
        //    79: goto            83
        //    82: athrow         
        //    83: invokevirtual   dev/nuker/pyro/f0n.0:()Ljava/lang/String;
        //    86: goto            90
        //    89: athrow         
        //    90: aload_1        
        //    91: getstatic       dev/nuker/pyro/fc.1:I
        //    94: ifeq            103
        //    97: ldc_w           143918097
        //   100: goto            106
        //   103: ldc_w           865608552
        //   106: ldc_w           -50569450
        //   109: ixor           
        //   110: lookupswitch {
        //          -815498114: 136
        //          -194487545: 103
        //          default: 231
        //        }
        //   136: goto            140
        //   139: athrow         
        //   140: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   145: goto            149
        //   148: athrow         
        //   149: pop            
        //   150: aload_1        
        //   151: new             Ldev/nuker/pyro/fE;
        //   154: dup            
        //   155: aload_0        
        //   156: goto            160
        //   159: athrow         
        //   160: invokespecial   dev/nuker/pyro/fE.<init>:(Ldev/nuker/pyro/fH;)V
        //   163: goto            167
        //   166: athrow         
        //   167: checkcast       Ljava/util/function/Consumer;
        //   170: getstatic       dev/nuker/pyro/fc.0:I
        //   173: ifeq            182
        //   176: ldc_w           1067791086
        //   179: goto            185
        //   182: ldc_w           -473754723
        //   185: ldc_w           1400089796
        //   188: ixor           
        //   189: lookupswitch {
        //          -1330593959: 216
        //          1826004522: 182
        //          default: 229
        //        }
        //   216: goto            220
        //   219: athrow         
        //   220: invokevirtual   dev/nuker/pyro/f0n.c:(Ljava/util/function/Consumer;)V
        //   223: goto            227
        //   226: athrow         
        //   227: aload_1        
        //   228: areturn        
        //   229: aconst_null    
        //   230: athrow         
        //   231: aconst_null    
        //   232: athrow         
        //   233: pop            
        //   234: goto            24
        //   237: pop            
        //   238: aconst_null    
        //   239: goto            233
        //   242: dup            
        //   243: ifnull          233
        //   246: checkcast       Ljava/lang/Throwable;
        //   249: athrow         
        //   250: dup            
        //   251: ifnull          237
        //   254: checkcast       Ljava/lang/Throwable;
        //   257: athrow         
        //   258: aconst_null    
        //   259: athrow         
        //    StackMapTable: 00 29 43 07 00 4E 04 FF 00 0B 00 00 00 01 07 00 4E FD 00 03 07 00 03 07 00 78 FF 00 08 00 02 07 00 03 07 00 78 00 02 07 00 5A 07 00 78 FF 00 05 00 02 07 00 03 07 00 78 00 02 07 00 5A 07 00 78 FF 00 02 00 02 07 00 03 07 00 78 00 03 07 00 5A 07 00 78 01 FF 00 19 00 02 07 00 03 07 00 78 00 02 07 00 5A 07 00 78 42 07 00 4E FF 00 00 00 02 07 00 03 07 00 78 00 02 07 00 5A 07 00 78 45 07 00 4E FF 00 00 00 02 07 00 03 07 00 78 00 02 07 00 5A 07 00 78 42 07 00 4E FF 00 00 00 02 07 00 03 07 00 78 00 02 07 00 5A 07 00 78 45 07 00 4E FF 00 00 00 02 07 00 03 07 00 78 00 02 07 00 5A 07 00 C4 FF 00 0C 00 02 07 00 03 07 00 78 00 03 07 00 5A 07 00 C4 07 00 78 FF 00 02 00 02 07 00 03 07 00 78 00 04 07 00 5A 07 00 C4 07 00 78 01 FF 00 1D 00 02 07 00 03 07 00 78 00 03 07 00 5A 07 00 C4 07 00 78 FF 00 02 00 00 00 01 07 00 4E FF 00 00 00 02 07 00 03 07 00 78 00 03 07 00 5A 07 00 C4 07 00 78 47 07 00 4E 40 07 00 05 49 07 00 4E FF 00 00 00 02 07 00 03 07 00 78 00 04 07 00 78 08 00 97 08 00 97 07 00 03 45 07 00 4E FF 00 00 00 02 07 00 03 07 00 78 00 02 07 00 78 07 01 DA FF 00 0E 00 02 07 00 03 07 00 78 00 02 07 00 78 07 00 9C FF 00 02 00 02 07 00 03 07 00 78 00 03 07 00 78 07 00 9C 01 FF 00 1E 00 02 07 00 03 07 00 78 00 02 07 00 78 07 00 9C 42 07 00 4E FF 00 00 00 02 07 00 03 07 00 78 00 02 07 00 78 07 00 9C 45 07 00 4E 00 FF 00 01 00 02 07 00 03 07 00 78 00 02 07 00 78 07 00 9C FF 00 01 00 02 07 00 03 07 00 78 00 03 07 00 5A 07 00 C4 07 00 78 41 07 00 4E 43 05 44 07 00 4E 47 05 47 07 00 4E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     242    250    Ljava/lang/IllegalArgumentException;
        //  242    250    242    250    Any
        //  258    260    3      8      Ljava/lang/IllegalArgumentException;
        //  71     78     78     79     Any
        //  71     78     3      8      Ljava/lang/NegativeArraySizeException;
        //  71     78     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  72     78     71     72     Any
        //  72     78     3      8      Ljava/lang/UnsupportedOperationException;
        //  82     89     89     90     Any
        //  82     89     82     83     Ljava/lang/ClassCastException;
        //  82     89     82     83     Any
        //  82     89     82     83     Ljava/lang/NullPointerException;
        //  83     89     82     83     Ljava/lang/AssertionError;
        //  140    148    148    149    Any
        //  140    148    3      8      Ljava/util/NoSuchElementException;
        //  140    148    148    149    Ljava/lang/IllegalStateException;
        //  140    148    148    149    Ljava/lang/NegativeArraySizeException;
        //  140    148    3      8      Ljava/lang/IllegalArgumentException;
        //  159    166    166    167    Any
        //  159    166    3      8      Any
        //  159    166    159    160    Any
        //  159    166    159    160    Ljava/lang/IllegalStateException;
        //  160    166    166    167    Any
        //  219    226    226    227    Any
        //  220    226    219    220    Ljava/util/ConcurrentModificationException;
        //  220    226    226    227    Any
        //  220    226    219    220    Any
        //  220    226    226    227    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 89 out of bounds for length 89
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
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
    
    static {
        throw t;
    }
    
    public void 1(final int n) {
        fbS.6q(this, 209271371, n);
    }
    
    public f0n 1(@NotNull final String s) {
        return fbS.4D(this, 1320827204, s);
    }
    
    public void c(@Nullable final EntityPlayerSP entityPlayerSP, final boolean b, final int n) {
        fbS.0O(this, 297646375, entityPlayerSP, b, n);
    }
    
    @NotNull
    public String 1() {
        return fbS.4T(this, 35607043);
    }
    
    public void 0(final int n) {
        fbS.69(this, 1412457026, n);
    }
    
    public int 7() {
        return fbS.bo(this, 1127969091);
    }
    
    public void c(@NotNull final fw fw) {
        fbS.3L(this, 693520981, fw);
    }
    
    @NotNull
    public String c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          286
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            278
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            270
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/fH.c:Ljava/lang/String;
        //    28: ifnonnull       36
        //    31: aload_0        
        //    32: getfield        dev/nuker/pyro/fH.2:Ljava/lang/String;
        //    35: areturn        
        //    36: new             Ljava/lang/StringBuilder;
        //    39: dup            
        //    40: goto            44
        //    43: athrow         
        //    44: invokespecial   java/lang/StringBuilder.<init>:()V
        //    47: goto            51
        //    50: athrow         
        //    51: aload_0        
        //    52: getstatic       dev/nuker/pyro/fc.0:I
        //    55: ifeq            64
        //    58: ldc_w           231466442
        //    61: goto            67
        //    64: ldc_w           158305507
        //    67: ldc_w           -889562933
        //    70: ixor           
        //    71: lookupswitch {
        //          -1675255723: 64
        //          -953041663: 259
        //          default: 96
        //        }
        //    96: getfield        dev/nuker/pyro/fH.2:Ljava/lang/String;
        //    99: goto            103
        //   102: athrow         
        //   103: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   106: goto            110
        //   109: athrow         
        //   110: ldc_w           " "
        //   113: goto            117
        //   116: athrow         
        //   117: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   120: goto            124
        //   123: athrow         
        //   124: getstatic       com/mojang/realmsclient/gui/ChatFormatting.GRAY:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   127: getstatic       dev/nuker/pyro/fc.0:I
        //   130: ifeq            139
        //   133: ldc_w           1240978717
        //   136: goto            142
        //   139: ldc_w           -2002006475
        //   142: ldc_w           -1433331801
        //   145: ixor           
        //   146: lookupswitch {
        //          -479804742: 255
        //          1378225423: 139
        //          default: 172
        //        }
        //   172: goto            176
        //   175: athrow         
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   179: goto            183
        //   182: athrow         
        //   183: getstatic       dev/nuker/pyro/fc.c:I
        //   186: ifge            195
        //   189: ldc_w           1663588651
        //   192: goto            198
        //   195: ldc_w           -164841746
        //   198: ldc_w           1900985411
        //   201: ixor           
        //   202: lookupswitch {
        //          -1816560363: 195
        //          308733288: 257
        //          default: 228
        //        }
        //   228: aload_0        
        //   229: getfield        dev/nuker/pyro/fH.c:Ljava/lang/String;
        //   232: goto            236
        //   235: athrow         
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: goto            243
        //   242: athrow         
        //   243: goto            247
        //   246: athrow         
        //   247: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   250: goto            254
        //   253: athrow         
        //   254: areturn        
        //   255: aconst_null    
        //   256: athrow         
        //   257: aconst_null    
        //   258: athrow         
        //   259: aconst_null    
        //   260: athrow         
        //   261: pop            
        //   262: goto            24
        //   265: pop            
        //   266: aconst_null    
        //   267: goto            261
        //   270: dup            
        //   271: ifnull          261
        //   274: checkcast       Ljava/lang/Throwable;
        //   277: athrow         
        //   278: dup            
        //   279: ifnull          265
        //   282: checkcast       Ljava/lang/Throwable;
        //   285: athrow         
        //   286: aconst_null    
        //   287: athrow         
        //    StackMapTable: 00 2E 43 07 00 4E 04 FF 00 0B 00 00 00 01 07 00 4E FC 00 03 07 00 03 0B 46 07 00 4E FF 00 00 00 01 07 00 03 00 02 08 00 24 08 00 24 45 07 00 4E 40 07 02 07 FF 00 0C 00 01 07 00 03 00 02 07 02 07 07 00 03 FF 00 02 00 01 07 00 03 00 03 07 02 07 07 00 03 01 FF 00 1C 00 01 07 00 03 00 02 07 02 07 07 00 03 45 07 01 5B FF 00 00 00 01 07 00 03 00 02 07 02 07 07 00 C4 45 07 00 4E 40 07 02 07 FF 00 05 00 00 00 01 07 00 4E FF 00 00 00 01 07 00 03 00 02 07 02 07 07 00 C4 45 07 00 4E 40 07 02 07 FF 00 0E 00 01 07 00 03 00 02 07 02 07 07 02 13 FF 00 02 00 01 07 00 03 00 03 07 02 07 07 02 13 01 FF 00 1D 00 01 07 00 03 00 02 07 02 07 07 02 13 42 07 00 4E FF 00 00 00 01 07 00 03 00 02 07 02 07 07 02 13 45 07 00 4E 40 07 02 07 4B 07 02 07 FF 00 02 00 01 07 00 03 00 02 07 02 07 01 5D 07 02 07 46 07 00 4E FF 00 00 00 01 07 00 03 00 02 07 02 07 07 00 C4 45 07 00 4E 40 07 02 07 42 07 00 4E 40 07 02 07 45 07 00 4E 40 07 00 C4 FF 00 00 00 01 07 00 03 00 02 07 02 07 07 02 13 41 07 02 07 FF 00 01 00 01 07 00 03 00 02 07 02 07 07 00 03 41 07 00 4E 43 05 44 07 00 4E 47 05 47 07 00 4E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     270    278    Any
        //  270    278    270    278    Any
        //  286    288    3      8      Ljava/util/NoSuchElementException;
        //  43     50     50     51     Any
        //  44     50     3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  43     50     43     44     Any
        //  44     50     50     51     Any
        //  43     50     43     44     Any
        //  102    109    109    110    Any
        //  103    109    3      8      Any
        //  103    109    109    110    Any
        //  102    109    109    110    Any
        //  102    109    102    103    Ljava/util/NoSuchElementException;
        //  117    123    123    124    Any
        //  117    123    3      8      Any
        //  117    123    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  117    123    123    124    Ljava/util/ConcurrentModificationException;
        //  117    123    123    124    Ljava/lang/IndexOutOfBoundsException;
        //  175    182    182    183    Any
        //  175    182    175    176    Any
        //  176    182    3      8      Any
        //  175    182    3      8      Ljava/lang/NegativeArraySizeException;
        //  176    182    3      8      Any
        //  235    242    242    243    Any
        //  235    242    242    243    Any
        //  235    242    242    243    Ljava/lang/RuntimeException;
        //  235    242    235    236    Any
        //  236    242    235    236    Any
        //  246    253    253    254    Any
        //  247    253    3      8      Any
        //  246    253    253    254    Ljava/lang/IllegalStateException;
        //  246    253    253    254    Any
        //  246    253    246    247    Any
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
    
    public int 3() {
        return fbS.bM(this, 1037325875);
    }
    
    public void c(@Nullable final Vec3d vec3d, final float n) {
        fbS.8Y(this, 2060063943, vec3d, n);
    }
}
