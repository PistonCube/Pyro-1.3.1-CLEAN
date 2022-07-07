// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.EnumFacing;
import org.jetbrains.annotations.Nullable;
import net.minecraft.util.Tuple;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import net.minecraft.client.Minecraft;

public class fbg
{
    public Minecraft c;
    @NotNull
    public static fbg c;
    public static fbd c;
    
    public void c(@NotNull final Vec3d vec3d, final boolean b) {
        fbS.9(this, 1486408616, vec3d, b);
    }
    
    @Nullable
    public Tuple 1(@NotNull final BlockPos p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          577
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            569
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            561
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             -1695050247
        //    32: goto            37
        //    35: ldc             -371471506
        //    37: ldc             695203840
        //    39: ixor           
        //    40: lookupswitch {
        //          -1281856007: 35
        //          -1061932178: 68
        //          default: 544
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: goto            74
        //    73: athrow         
        //    74: invokestatic    net/minecraft/util/EnumFacing.values:()[Lnet/minecraft/util/EnumFacing;
        //    77: goto            81
        //    80: athrow         
        //    81: getstatic       dev/nuker/pyro/fc.c:I
        //    84: ifge            92
        //    87: ldc             1612306050
        //    89: goto            94
        //    92: ldc             -969802730
        //    94: ldc             856289454
        //    96: ixor           
        //    97: lookupswitch {
        //          -180876104: 124
        //          1393567276: 92
        //          default: 548
        //        }
        //   124: astore          4
        //   126: aload           4
        //   128: arraylength    
        //   129: getstatic       dev/nuker/pyro/fc.0:I
        //   132: ifeq            140
        //   135: ldc             640665252
        //   137: goto            142
        //   140: ldc             -598660456
        //   142: ldc             -949077917
        //   144: ixor           
        //   145: lookupswitch {
        //          -515768633: 140
        //          457118459: 172
        //          default: 536
        //        }
        //   172: istore          5
        //   174: iconst_0       
        //   175: getstatic       dev/nuker/pyro/fc.1:I
        //   178: ifeq            186
        //   181: ldc             -2070028952
        //   183: goto            188
        //   186: ldc             1544799414
        //   188: ldc             208117124
        //   190: ixor           
        //   191: lookupswitch {
        //          -1996865300: 186
        //          1349802290: 216
        //          default: 550
        //        }
        //   216: istore_3       
        //   217: iload_3        
        //   218: iload           5
        //   220: if_icmpge       228
        //   223: ldc             -417801196
        //   225: goto            230
        //   228: ldc             -417801195
        //   230: ldc             -568407360
        //   232: ixor           
        //   233: tableswitch {
        //          1913400744: 256
        //          1913400745: 534
        //          default: 223
        //        }
        //   256: aload           4
        //   258: iload_3        
        //   259: aaload         
        //   260: astore_2       
        //   261: getstatic       dev/nuker/pyro/fc.c:I
        //   264: ifge            272
        //   267: ldc             -985350721
        //   269: goto            274
        //   272: ldc             888284992
        //   274: ldc             -572704746
        //   276: ixor           
        //   277: lookupswitch {
        //          -382787754: 304
        //          412714409: 272
        //          default: 546
        //        }
        //   304: aload_1        
        //   305: aload_2        
        //   306: goto            310
        //   309: athrow         
        //   310: invokevirtual   net/minecraft/util/math/BlockPos.func_177972_a:(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;
        //   313: goto            317
        //   316: athrow         
        //   317: getstatic       dev/nuker/pyro/fc.c:I
        //   320: ifge            328
        //   323: ldc             1644826894
        //   325: goto            330
        //   328: ldc             -68931629
        //   330: ldc             680424195
        //   332: ixor           
        //   333: lookupswitch {
        //          -748004144: 360
        //          1250189837: 328
        //          default: 540
        //        }
        //   360: astore          6
        //   362: aload_2        
        //   363: goto            367
        //   366: athrow         
        //   367: invokevirtual   net/minecraft/util/EnumFacing.func_176734_d:()Lnet/minecraft/util/EnumFacing;
        //   370: goto            374
        //   373: athrow         
        //   374: getstatic       dev/nuker/pyro/fc.0:I
        //   377: ifeq            385
        //   380: ldc             -274392341
        //   382: goto            387
        //   385: ldc             627325142
        //   387: ldc             150635069
        //   389: ixor           
        //   390: lookupswitch {
        //          -413165354: 385
        //          765377259: 416
        //          default: 542
        //        }
        //   416: astore          7
        //   418: getstatic       dev/nuker/pyro/fc.0:I
        //   421: ifeq            429
        //   424: ldc             1616430000
        //   426: goto            431
        //   429: ldc             6937982
        //   431: ldc             -1500051558
        //   433: ixor           
        //   434: lookupswitch {
        //          -1296035187: 429
        //          -959462358: 538
        //          default: 460
        //        }
        //   460: aload_0        
        //   461: aload           6
        //   463: goto            467
        //   466: athrow         
        //   467: invokevirtual   dev/nuker/pyro/fbg.3:(Lnet/minecraft/util/math/BlockPos;)Z
        //   470: goto            474
        //   473: athrow         
        //   474: ifeq            482
        //   477: ldc             -791550061
        //   479: goto            484
        //   482: ldc             -791550064
        //   484: ldc             730298374
        //   486: ixor           
        //   487: tableswitch {
        //          -156418262: 508
        //          -156418261: 528
        //          default: 477
        //        }
        //   508: new             Lnet/minecraft/util/Tuple;
        //   511: dup            
        //   512: aload           6
        //   514: aload           7
        //   516: goto            520
        //   519: athrow         
        //   520: invokespecial   net/minecraft/util/Tuple.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   523: goto            527
        //   526: athrow         
        //   527: areturn        
        //   528: iinc            3, 1
        //   531: goto            217
        //   534: aconst_null    
        //   535: areturn        
        //   536: aconst_null    
        //   537: athrow         
        //   538: aconst_null    
        //   539: athrow         
        //   540: aconst_null    
        //   541: athrow         
        //   542: aconst_null    
        //   543: athrow         
        //   544: aconst_null    
        //   545: athrow         
        //   546: aconst_null    
        //   547: athrow         
        //   548: aconst_null    
        //   549: athrow         
        //   550: aconst_null    
        //   551: athrow         
        //   552: pop            
        //   553: goto            24
        //   556: pop            
        //   557: aconst_null    
        //   558: goto            552
        //   561: dup            
        //   562: ifnull          552
        //   565: checkcast       Ljava/lang/Throwable;
        //   568: athrow         
        //   569: dup            
        //   570: ifnull          556
        //   573: checkcast       Ljava/lang/Throwable;
        //   576: athrow         
        //   577: aconst_null    
        //   578: athrow         
        //    StackMapTable: 00 48 FF 00 03 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 01 07 00 2A FF 00 04 00 02 07 00 03 07 00 49 00 00 FF 00 0B 00 00 00 01 07 00 2A FD 00 03 07 00 03 07 00 49 0A 41 01 1E 44 07 00 2A 00 45 07 00 2A 40 07 00 69 4A 07 00 69 FF 00 01 00 02 07 00 03 07 00 49 00 02 07 00 69 01 5D 07 00 69 FF 00 0F 00 05 07 00 03 07 00 49 00 00 07 00 69 00 01 01 FF 00 01 00 05 07 00 03 07 00 49 00 00 07 00 69 00 02 01 01 5D 01 FF 00 0D 00 06 07 00 03 07 00 49 00 00 07 00 69 01 00 01 01 FF 00 01 00 06 07 00 03 07 00 49 00 00 07 00 69 01 00 02 01 01 5B 01 FF 00 00 00 06 07 00 03 07 00 49 00 01 07 00 69 01 00 00 05 04 41 01 19 FF 00 0F 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 00 41 01 1D 44 07 00 2A FF 00 00 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 02 07 00 49 07 00 32 45 07 00 2A 40 07 00 49 4A 07 00 49 FF 00 01 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 02 07 00 49 01 5D 07 00 49 FF 00 05 00 00 00 01 07 00 2A FF 00 00 00 07 07 00 03 07 00 49 07 00 32 01 07 00 69 01 07 00 49 00 01 07 00 32 45 07 00 2A 40 07 00 32 4A 07 00 32 FF 00 01 00 07 07 00 03 07 00 49 07 00 32 01 07 00 69 01 07 00 49 00 02 07 00 32 01 5C 07 00 32 FC 00 0C 07 00 32 41 01 1C 45 07 00 2A FF 00 00 00 08 07 00 03 07 00 49 07 00 32 01 07 00 69 01 07 00 49 07 00 32 00 02 07 00 03 07 00 49 45 07 00 2A 40 01 02 04 41 01 17 4A 07 00 17 FF 00 00 00 08 07 00 03 07 00 49 07 00 32 01 07 00 69 01 07 00 49 07 00 32 00 04 08 01 FC 08 01 FC 07 00 49 07 00 32 45 07 00 2A 40 07 00 63 00 FF 00 05 00 06 07 00 03 07 00 49 00 01 07 00 69 01 00 00 FF 00 01 00 05 07 00 03 07 00 49 00 00 07 00 69 00 01 01 FF 00 01 00 08 07 00 03 07 00 49 07 00 32 01 07 00 69 01 07 00 49 07 00 32 00 00 FF 00 01 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 01 07 00 49 FF 00 01 00 07 07 00 03 07 00 49 07 00 32 01 07 00 69 01 07 00 49 00 01 07 00 32 FF 00 01 00 02 07 00 03 07 00 49 00 00 FF 00 01 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 00 FF 00 01 00 02 07 00 03 07 00 49 00 01 07 00 69 FF 00 01 00 06 07 00 03 07 00 49 00 00 07 00 69 01 00 01 01 FF 00 01 00 02 07 00 03 07 00 49 00 01 07 00 1D 43 05 44 07 00 1D 47 05 FF 00 07 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 01 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     561    569    Ljava/lang/StringIndexOutOfBoundsException;
        //  561    569    561    569    Ljava/lang/NumberFormatException;
        //  577    579    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  73     80     80     81     Any
        //  73     80     73     74     Any
        //  73     80     80     81     Any
        //  73     80     80     81     Ljava/lang/RuntimeException;
        //  73     80     73     74     Any
        //  309    316    316    317    Any
        //  309    316    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  310    316    316    317    Any
        //  310    316    316    317    Any
        //  310    316    309    310    Any
        //  367    373    373    374    Any
        //  367    373    373    374    Ljava/lang/IndexOutOfBoundsException;
        //  367    373    3      8      Any
        //  367    373    3      8      Ljava/lang/AssertionError;
        //  367    373    3      8      Ljava/lang/ArithmeticException;
        //  466    473    473    474    Any
        //  467    473    466    467    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  466    473    466    467    Any
        //  466    473    473    474    Ljava/lang/AssertionError;
        //  466    473    466    467    Ljava/lang/StringIndexOutOfBoundsException;
        //  519    526    526    527    Any
        //  520    526    3      8      Any
        //  519    526    526    527    Any
        //  519    526    3      8      Any
        //  519    526    519    520    Ljava/lang/StringIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 173 out of bounds for length 173
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
    
    public fbg(@NotNull final Minecraft c) {
        while (true) {
            int n = 0;
            Label_0016: {
                if (fc.c < 0) {
                    n = -1723876219;
                    break Label_0016;
                }
                n = -1173633175;
            }
            switch (n ^ 0x913D2FB8) {
                case -2014157071: {
                    continue;
                }
                default: {
                    this.c = c;
                }
                case 134386493: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public boolean c(@NotNull final BlockPos p0, @NotNull final fbe p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2016
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            2008
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2000
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_2        
        //    27: pop            
        //    28: getstatic       dev/nuker/pyro/fc.1:I
        //    31: ifeq            39
        //    34: ldc             -46574268
        //    36: goto            41
        //    39: ldc             860821287
        //    41: ldc             -106498300
        //    43: ixor           
        //    44: lookupswitch {
        //          77570624: 1943
        //          1603484921: 39
        //          default: 72
        //        }
        //    72: aload_0        
        //    73: aload_1        
        //    74: goto            78
        //    77: athrow         
        //    78: invokevirtual   dev/nuker/pyro/fbg.1:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/Tuple;
        //    81: goto            85
        //    84: athrow         
        //    85: getstatic       dev/nuker/pyro/fc.1:I
        //    88: ifeq            96
        //    91: ldc             -419537466
        //    93: goto            98
        //    96: ldc             -1101028961
        //    98: ldc             -1107645876
        //   100: ixor           
        //   101: lookupswitch {
        //          -497904975: 96
        //          1527052170: 1945
        //          default: 128
        //        }
        //   128: astore          4
        //   130: getstatic       dev/nuker/pyro/fc.0:I
        //   133: ifeq            141
        //   136: ldc             -361934464
        //   138: goto            143
        //   141: ldc             -668337240
        //   143: ldc             574541128
        //   145: ixor           
        //   146: lookupswitch {
        //          -934044472: 141
        //          -99141920: 172
        //          default: 1959
        //        }
        //   172: aload           4
        //   174: ifnull          1933
        //   177: aload_0        
        //   178: aload           4
        //   180: getstatic       dev/nuker/pyro/fc.c:I
        //   183: ifge            191
        //   186: ldc             1466670134
        //   188: goto            193
        //   191: ldc             1762590739
        //   193: ldc             -970565178
        //   195: ixor           
        //   196: lookupswitch {
        //          -1857174032: 1947
        //          -86097013: 191
        //          default: 224
        //        }
        //   224: goto            228
        //   227: athrow         
        //   228: invokevirtual   net/minecraft/util/Tuple.func_76341_a:()Ljava/lang/Object;
        //   231: goto            235
        //   234: athrow         
        //   235: checkcast       Lnet/minecraft/util/math/BlockPos;
        //   238: aload_0        
        //   239: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   242: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   245: dup            
        //   246: pop            
        //   247: checkcast       Lnet/minecraft/world/World;
        //   250: getstatic       dev/nuker/pyro/fc.0:I
        //   253: ifeq            261
        //   256: ldc             -722273525
        //   258: goto            263
        //   261: ldc             311355669
        //   263: ldc             -214639605
        //   265: ixor           
        //   266: lookupswitch {
        //          53038352: 261
        //          667297536: 1971
        //          default: 292
        //        }
        //   292: aload           4
        //   294: getstatic       dev/nuker/pyro/fc.1:I
        //   297: ifeq            305
        //   300: ldc             -1979754442
        //   302: goto            307
        //   305: ldc             -849806906
        //   307: ldc             -1378141998
        //   309: ixor           
        //   310: lookupswitch {
        //          -884349311: 305
        //          606363876: 1969
        //          default: 336
        //        }
        //   336: goto            340
        //   339: athrow         
        //   340: invokevirtual   net/minecraft/util/Tuple.func_76340_b:()Ljava/lang/Object;
        //   343: goto            347
        //   346: athrow         
        //   347: dup            
        //   348: pop            
        //   349: checkcast       Lnet/minecraft/util/EnumFacing;
        //   352: goto            356
        //   355: athrow         
        //   356: invokevirtual   dev/nuker/pyro/fbg.c:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/Vec3d;
        //   359: goto            363
        //   362: athrow         
        //   363: astore          5
        //   365: aload_0        
        //   366: goto            370
        //   369: athrow         
        //   370: invokevirtual   dev/nuker/pyro/fbg.1:()Lnet/minecraft/util/math/Vec2f;
        //   373: goto            377
        //   376: athrow         
        //   377: astore          6
        //   379: aload_2        
        //   380: getstatic       dev/nuker/pyro/fc.1:I
        //   383: ifeq            391
        //   386: ldc             -1903102680
        //   388: goto            393
        //   391: ldc             545302360
        //   393: ldc             -1153976436
        //   395: ixor           
        //   396: lookupswitch {
        //          900154020: 1965
        //          1251547460: 391
        //          default: 424
        //        }
        //   424: getstatic       dev/nuker/pyro/fbe.c:Ldev/nuker/pyro/fbe;
        //   427: if_acmpeq       539
        //   430: aload_0        
        //   431: getstatic       dev/nuker/pyro/fc.1:I
        //   434: ifeq            442
        //   437: ldc             1321058353
        //   439: goto            444
        //   442: ldc             -912624560
        //   444: ldc             -1764926828
        //   446: ixor           
        //   447: lookupswitch {
        //          -663709019: 442
        //          1599549124: 472
        //          default: 1935
        //        }
        //   472: aload           5
        //   474: aload_2        
        //   475: getstatic       dev/nuker/pyro/fbe.0:Ldev/nuker/pyro/fbe;
        //   478: if_acmpne       485
        //   481: iconst_1       
        //   482: goto            486
        //   485: iconst_0       
        //   486: getstatic       dev/nuker/pyro/fc.1:I
        //   489: ifeq            497
        //   492: ldc             -6082759
        //   494: goto            499
        //   497: ldc             280557648
        //   499: ldc             295534563
        //   501: ixor           
        //   502: lookupswitch {
        //          -297905958: 497
        //          19236787: 528
        //          default: 1975
        //        }
        //   528: goto            532
        //   531: athrow         
        //   532: invokevirtual   dev/nuker/pyro/fbg.0:(Lnet/minecraft/util/math/Vec3d;Z)V
        //   535: goto            539
        //   538: athrow         
        //   539: iconst_0       
        //   540: istore          7
        //   542: aload_0        
        //   543: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   546: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   549: aload           4
        //   551: goto            555
        //   554: athrow         
        //   555: invokevirtual   net/minecraft/util/Tuple.func_76341_a:()Ljava/lang/Object;
        //   558: goto            562
        //   561: athrow         
        //   562: checkcast       Lnet/minecraft/util/math/BlockPos;
        //   565: goto            569
        //   568: athrow         
        //   569: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   572: goto            576
        //   575: athrow         
        //   576: dup            
        //   577: pop            
        //   578: goto            582
        //   581: athrow         
        //   582: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   587: goto            591
        //   590: athrow         
        //   591: astore          8
        //   593: aload_0        
        //   594: aload           8
        //   596: goto            600
        //   599: athrow         
        //   600: invokevirtual   dev/nuker/pyro/fbg.c:(Lnet/minecraft/block/Block;)Z
        //   603: goto            607
        //   606: athrow         
        //   607: ifeq            613
        //   610: iconst_1       
        //   611: istore          7
        //   613: iload           7
        //   615: ifeq            757
        //   618: aload_0        
        //   619: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   622: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   625: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   628: new             Lnet/minecraft/network/play/client/CPacketEntityAction;
        //   631: dup            
        //   632: aload_0        
        //   633: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   636: getstatic       dev/nuker/pyro/fc.c:I
        //   639: ifge            647
        //   642: ldc             164878746
        //   644: goto            649
        //   647: ldc             -733513971
        //   649: ldc             2010065489
        //   651: ixor           
        //   652: lookupswitch {
        //          -1551344292: 680
        //          2115826635: 647
        //          default: 1941
        //        }
        //   680: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   683: checkcast       Lnet/minecraft/entity/Entity;
        //   686: getstatic       net/minecraft/network/play/client/CPacketEntityAction$Action.START_SNEAKING:Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //   689: getstatic       dev/nuker/pyro/fc.1:I
        //   692: ifeq            700
        //   695: ldc             -838978409
        //   697: goto            702
        //   700: ldc             -195348106
        //   702: ldc             -1707181473
        //   704: ixor           
        //   705: lookupswitch {
        //          -344946696: 700
        //          1472220872: 1949
        //          default: 732
        //        }
        //   732: goto            736
        //   735: athrow         
        //   736: invokespecial   net/minecraft/network/play/client/CPacketEntityAction.<init>:(Lnet/minecraft/entity/Entity;Lnet/minecraft/network/play/client/CPacketEntityAction$Action;)V
        //   739: goto            743
        //   742: athrow         
        //   743: checkcast       Lnet/minecraft/network/Packet;
        //   746: goto            750
        //   749: athrow         
        //   750: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   753: goto            757
        //   756: athrow         
        //   757: iload_3        
        //   758: ifeq            766
        //   761: ldc             -454561481
        //   763: goto            768
        //   766: ldc             -454561488
        //   768: ldc             -350389948
        //   770: ixor           
        //   771: tableswitch {
        //          536154342: 792
        //          536154343: 1310
        //          default: 761
        //        }
        //   792: aload           5
        //   794: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //   797: getstatic       dev/nuker/pyro/fc.c:I
        //   800: ifge            808
        //   803: ldc             1972513644
        //   805: goto            810
        //   808: ldc             578641024
        //   810: ldc_w           -820078829
        //   813: ixor           
        //   814: lookupswitch {
        //          -1165181825: 1985
        //          507121259: 808
        //          default: 840
        //        }
        //   840: aload           4
        //   842: goto            846
        //   845: athrow         
        //   846: invokevirtual   net/minecraft/util/Tuple.func_76341_a:()Ljava/lang/Object;
        //   849: goto            853
        //   852: athrow         
        //   853: dup            
        //   854: pop            
        //   855: checkcast       Lnet/minecraft/util/math/BlockPos;
        //   858: goto            862
        //   861: athrow         
        //   862: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //   865: goto            869
        //   868: athrow         
        //   869: i2d            
        //   870: dsub           
        //   871: d2f            
        //   872: fstore          9
        //   874: getstatic       dev/nuker/pyro/fc.0:I
        //   877: ifeq            886
        //   880: ldc_w           -2147390141
        //   883: goto            889
        //   886: ldc_w           -1548627354
        //   889: ldc_w           -831726309
        //   892: ixor           
        //   893: lookupswitch {
        //          1315811416: 886
        //          1843203965: 920
        //          default: 1939
        //        }
        //   920: aload           5
        //   922: getstatic       dev/nuker/pyro/fc.0:I
        //   925: ifeq            934
        //   928: ldc_w           -1540072975
        //   931: goto            937
        //   934: ldc_w           -759048358
        //   937: ldc_w           267664670
        //   940: ixor           
        //   941: lookupswitch {
        //          -1413454609: 1961
        //          -375465081: 934
        //          default: 968
        //        }
        //   968: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   971: aload           4
        //   973: getstatic       dev/nuker/pyro/fc.1:I
        //   976: ifeq            985
        //   979: ldc_w           235683428
        //   982: goto            988
        //   985: ldc_w           -2045814762
        //   988: ldc_w           -704763993
        //   991: ixor           
        //   992: lookupswitch {
        //          -604890685: 985
        //          1408335793: 1020
        //          default: 1953
        //        }
        //  1020: goto            1024
        //  1023: athrow         
        //  1024: invokevirtual   net/minecraft/util/Tuple.func_76341_a:()Ljava/lang/Object;
        //  1027: goto            1031
        //  1030: athrow         
        //  1031: dup            
        //  1032: pop            
        //  1033: checkcast       Lnet/minecraft/util/math/BlockPos;
        //  1036: goto            1040
        //  1039: athrow         
        //  1040: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //  1043: goto            1047
        //  1046: athrow         
        //  1047: i2d            
        //  1048: dsub           
        //  1049: d2f            
        //  1050: fstore          10
        //  1052: aload           5
        //  1054: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  1057: getstatic       dev/nuker/pyro/fc.1:I
        //  1060: ifeq            1069
        //  1063: ldc_w           347132783
        //  1066: goto            1072
        //  1069: ldc_w           -670467253
        //  1072: ldc_w           1811135270
        //  1075: ixor           
        //  1076: lookupswitch {
        //          -1275412371: 1104
        //          2135124041: 1069
        //          default: 1989
        //        }
        //  1104: aload           4
        //  1106: goto            1110
        //  1109: athrow         
        //  1110: invokevirtual   net/minecraft/util/Tuple.func_76341_a:()Ljava/lang/Object;
        //  1113: goto            1117
        //  1116: athrow         
        //  1117: dup            
        //  1118: pop            
        //  1119: checkcast       Lnet/minecraft/util/math/BlockPos;
        //  1122: goto            1126
        //  1125: athrow         
        //  1126: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //  1129: goto            1133
        //  1132: athrow         
        //  1133: i2d            
        //  1134: dsub           
        //  1135: d2f            
        //  1136: fstore          11
        //  1138: aload_0        
        //  1139: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //  1142: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1145: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1148: new             Lnet/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock;
        //  1151: dup            
        //  1152: getstatic       dev/nuker/pyro/fc.1:I
        //  1155: ifeq            1164
        //  1158: ldc_w           -566997277
        //  1161: goto            1167
        //  1164: ldc_w           -686062065
        //  1167: ldc_w           1052440397
        //  1170: ixor           
        //  1171: lookupswitch {
        //          -527517266: 1955
        //          1284398313: 1164
        //          default: 1196
        //        }
        //  1196: aload           4
        //  1198: goto            1202
        //  1201: athrow         
        //  1202: invokevirtual   net/minecraft/util/Tuple.func_76341_a:()Ljava/lang/Object;
        //  1205: goto            1209
        //  1208: athrow         
        //  1209: checkcast       Lnet/minecraft/util/math/BlockPos;
        //  1212: aload           4
        //  1214: goto            1218
        //  1217: athrow         
        //  1218: invokevirtual   net/minecraft/util/Tuple.func_76340_b:()Ljava/lang/Object;
        //  1221: goto            1225
        //  1224: athrow         
        //  1225: checkcast       Lnet/minecraft/util/EnumFacing;
        //  1228: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //  1231: fload           9
        //  1233: fload           10
        //  1235: fload           11
        //  1237: goto            1241
        //  1240: athrow         
        //  1241: invokespecial   net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock.<init>:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumHand;FFF)V
        //  1244: goto            1248
        //  1247: athrow         
        //  1248: checkcast       Lnet/minecraft/network/Packet;
        //  1251: getstatic       dev/nuker/pyro/fc.1:I
        //  1254: ifeq            1263
        //  1257: ldc_w           949779353
        //  1260: goto            1266
        //  1263: ldc_w           64690662
        //  1266: ldc_w           243473042
        //  1269: ixor           
        //  1270: lookupswitch {
        //          223871860: 1296
        //          908026123: 1263
        //          default: 1977
        //        }
        //  1296: goto            1300
        //  1299: athrow         
        //  1300: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  1303: goto            1307
        //  1306: athrow         
        //  1307: goto            1515
        //  1310: aload_0        
        //  1311: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //  1314: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  1317: aload_0        
        //  1318: getstatic       dev/nuker/pyro/fc.c:I
        //  1321: ifge            1330
        //  1324: ldc_w           -1631509659
        //  1327: goto            1333
        //  1330: ldc_w           1696543458
        //  1333: ldc_w           189075699
        //  1336: ixor           
        //  1337: lookupswitch {
        //          -1786498154: 1330
        //          1851400721: 1364
        //          default: 1957
        //        }
        //  1364: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //  1367: getstatic       dev/nuker/pyro/fc.0:I
        //  1370: ifeq            1379
        //  1373: ldc_w           1536483025
        //  1376: goto            1382
        //  1379: ldc_w           1752259517
        //  1382: ldc_w           -522619840
        //  1385: ixor           
        //  1386: lookupswitch {
        //          -1782604754: 1379
        //          -1152537967: 1963
        //          default: 1412
        //        }
        //  1412: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1415: aload_0        
        //  1416: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //  1419: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1422: aload           4
        //  1424: goto            1428
        //  1427: athrow         
        //  1428: invokevirtual   net/minecraft/util/Tuple.func_76341_a:()Ljava/lang/Object;
        //  1431: goto            1435
        //  1434: athrow         
        //  1435: checkcast       Lnet/minecraft/util/math/BlockPos;
        //  1438: aload           4
        //  1440: goto            1444
        //  1443: athrow         
        //  1444: invokevirtual   net/minecraft/util/Tuple.func_76340_b:()Ljava/lang/Object;
        //  1447: goto            1451
        //  1450: athrow         
        //  1451: checkcast       Lnet/minecraft/util/EnumFacing;
        //  1454: aload           5
        //  1456: getstatic       dev/nuker/pyro/fc.0:I
        //  1459: ifeq            1468
        //  1462: ldc_w           -1908208850
        //  1465: goto            1471
        //  1468: ldc_w           -843615939
        //  1471: ldc_w           -1466077796
        //  1474: ixor           
        //  1475: lookupswitch {
        //          -783483882: 1468
        //          652109490: 1967
        //          default: 1500
        //        }
        //  1500: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //  1503: goto            1507
        //  1506: athrow         
        //  1507: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_187099_a:(Lnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;
        //  1510: goto            1514
        //  1513: athrow         
        //  1514: pop            
        //  1515: getstatic       dev/nuker/pyro/fc.0:I
        //  1518: ifeq            1527
        //  1521: ldc_w           -705825721
        //  1524: goto            1530
        //  1527: ldc_w           1521541154
        //  1530: ldc_w           113644596
        //  1533: ixor           
        //  1534: lookupswitch {
        //          -752099213: 1527
        //          1551299606: 1560
        //          default: 1973
        //        }
        //  1560: aload_0        
        //  1561: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //  1564: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1567: getstatic       dev/nuker/pyro/fc.1:I
        //  1570: ifeq            1579
        //  1573: ldc_w           1568958873
        //  1576: goto            1582
        //  1579: ldc_w           265276244
        //  1582: ldc_w           -1840336969
        //  1585: ixor           
        //  1586: lookupswitch {
        //          -808794578: 1983
        //          1414425045: 1579
        //          default: 1612
        //        }
        //  1612: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //  1615: goto            1619
        //  1618: athrow         
        //  1619: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184609_a:(Lnet/minecraft/util/EnumHand;)V
        //  1622: goto            1626
        //  1625: athrow         
        //  1626: iload           7
        //  1628: ifeq            1863
        //  1631: getstatic       dev/nuker/pyro/fc.0:I
        //  1634: ifeq            1643
        //  1637: ldc_w           1867390123
        //  1640: goto            1646
        //  1643: ldc_w           1187430304
        //  1646: ldc_w           1526969300
        //  1649: ixor           
        //  1650: lookupswitch {
        //          499453044: 1676
        //          877506431: 1643
        //          default: 1987
        //        }
        //  1676: aload_0        
        //  1677: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //  1680: getstatic       dev/nuker/pyro/fc.1:I
        //  1683: ifeq            1692
        //  1686: ldc_w           702113775
        //  1689: goto            1695
        //  1692: ldc_w           -1385155492
        //  1695: ldc_w           642970267
        //  1698: ixor           
        //  1699: lookupswitch {
        //          -2060161555: 1692
        //          260806004: 1937
        //          default: 1724
        //        }
        //  1724: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1727: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1730: new             Lnet/minecraft/network/play/client/CPacketEntityAction;
        //  1733: dup            
        //  1734: aload_0        
        //  1735: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //  1738: getstatic       dev/nuker/pyro/fc.0:I
        //  1741: ifeq            1750
        //  1744: ldc_w           1010846163
        //  1747: goto            1753
        //  1750: ldc_w           -903877201
        //  1753: ldc_w           2045310270
        //  1756: ixor           
        //  1757: lookupswitch {
        //          -1275651951: 1784
        //          1168686317: 1750
        //          default: 1979
        //        }
        //  1784: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1787: checkcast       Lnet/minecraft/entity/Entity;
        //  1790: getstatic       net/minecraft/network/play/client/CPacketEntityAction$Action.STOP_SNEAKING:Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //  1793: goto            1797
        //  1796: athrow         
        //  1797: invokespecial   net/minecraft/network/play/client/CPacketEntityAction.<init>:(Lnet/minecraft/entity/Entity;Lnet/minecraft/network/play/client/CPacketEntityAction$Action;)V
        //  1800: goto            1804
        //  1803: athrow         
        //  1804: checkcast       Lnet/minecraft/network/Packet;
        //  1807: getstatic       dev/nuker/pyro/fc.c:I
        //  1810: ifge            1819
        //  1813: ldc_w           -745746530
        //  1816: goto            1822
        //  1819: ldc_w           1006890894
        //  1822: ldc_w           633103743
        //  1825: ixor           
        //  1826: lookupswitch {
        //          -164582687: 1951
        //          1979102224: 1819
        //          default: 1852
        //        }
        //  1852: goto            1856
        //  1855: athrow         
        //  1856: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  1859: goto            1863
        //  1862: athrow         
        //  1863: aload_2        
        //  1864: getstatic       dev/nuker/pyro/fbe.2:Ldev/nuker/pyro/fbe;
        //  1867: if_acmpne       1931
        //  1870: getstatic       dev/nuker/pyro/fc.0:I
        //  1873: ifeq            1882
        //  1876: ldc_w           787879420
        //  1879: goto            1885
        //  1882: ldc_w           -668585901
        //  1885: ldc_w           -1559426657
        //  1888: ixor           
        //  1889: lookupswitch {
        //          -1912923037: 1882
        //          2066430412: 1916
        //          default: 1981
        //        }
        //  1916: aload_0        
        //  1917: aload           6
        //  1919: iconst_0       
        //  1920: goto            1924
        //  1923: athrow         
        //  1924: invokevirtual   dev/nuker/pyro/fbg.0:(Lnet/minecraft/util/math/Vec2f;Z)V
        //  1927: goto            1931
        //  1930: athrow         
        //  1931: iconst_1       
        //  1932: ireturn        
        //  1933: iconst_0       
        //  1934: ireturn        
        //  1935: aconst_null    
        //  1936: athrow         
        //  1937: aconst_null    
        //  1938: athrow         
        //  1939: aconst_null    
        //  1940: athrow         
        //  1941: aconst_null    
        //  1942: athrow         
        //  1943: aconst_null    
        //  1944: athrow         
        //  1945: aconst_null    
        //  1946: athrow         
        //  1947: aconst_null    
        //  1948: athrow         
        //  1949: aconst_null    
        //  1950: athrow         
        //  1951: aconst_null    
        //  1952: athrow         
        //  1953: aconst_null    
        //  1954: athrow         
        //  1955: aconst_null    
        //  1956: athrow         
        //  1957: aconst_null    
        //  1958: athrow         
        //  1959: aconst_null    
        //  1960: athrow         
        //  1961: aconst_null    
        //  1962: athrow         
        //  1963: aconst_null    
        //  1964: athrow         
        //  1965: aconst_null    
        //  1966: athrow         
        //  1967: aconst_null    
        //  1968: athrow         
        //  1969: aconst_null    
        //  1970: athrow         
        //  1971: aconst_null    
        //  1972: athrow         
        //  1973: aconst_null    
        //  1974: athrow         
        //  1975: aconst_null    
        //  1976: athrow         
        //  1977: aconst_null    
        //  1978: athrow         
        //  1979: aconst_null    
        //  1980: athrow         
        //  1981: aconst_null    
        //  1982: athrow         
        //  1983: aconst_null    
        //  1984: athrow         
        //  1985: aconst_null    
        //  1986: athrow         
        //  1987: aconst_null    
        //  1988: athrow         
        //  1989: aconst_null    
        //  1990: athrow         
        //  1991: pop            
        //  1992: goto            24
        //  1995: pop            
        //  1996: aconst_null    
        //  1997: goto            1991
        //  2000: dup            
        //  2001: ifnull          1991
        //  2004: checkcast       Ljava/lang/Throwable;
        //  2007: athrow         
        //  2008: dup            
        //  2009: ifnull          1995
        //  2012: checkcast       Ljava/lang/Throwable;
        //  2015: athrow         
        //  2016: aconst_null    
        //  2017: athrow         
        //    StackMapTable: 00 F7 43 07 00 2A 04 FF 00 0B 00 00 00 01 07 00 2A FF 00 03 00 04 07 00 03 07 00 49 07 00 B3 01 00 00 0E 41 01 1E 44 07 00 2A FF 00 00 00 04 07 00 03 07 00 49 07 00 B3 01 00 02 07 00 03 07 00 49 45 07 00 2A 40 07 00 63 4A 07 00 63 FF 00 01 00 04 07 00 03 07 00 49 07 00 B3 01 00 02 07 00 63 01 5D 07 00 63 FC 00 0C 07 00 63 41 01 1C FF 00 12 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 02 07 00 03 07 00 63 FF 00 01 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 03 07 00 03 07 00 63 01 FF 00 1E 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 02 07 00 03 07 00 63 42 07 00 2A FF 00 00 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 02 07 00 03 07 00 63 45 07 00 2A FF 00 00 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 02 07 00 03 07 00 05 FF 00 19 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 03 07 00 03 07 00 49 07 00 9F FF 00 01 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 04 07 00 03 07 00 49 07 00 9F 01 FF 00 1C 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 03 07 00 03 07 00 49 07 00 9F FF 00 0C 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 04 07 00 03 07 00 49 07 00 9F 07 00 63 FF 00 01 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 05 07 00 03 07 00 49 07 00 9F 07 00 63 01 FF 00 1C 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 04 07 00 03 07 00 49 07 00 9F 07 00 63 FF 00 02 00 00 00 01 07 00 2A FF 00 00 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 04 07 00 03 07 00 49 07 00 9F 07 00 63 45 07 00 2A FF 00 00 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 04 07 00 03 07 00 49 07 00 9F 07 00 05 47 07 00 2A FF 00 00 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 04 07 00 03 07 00 49 07 00 9F 07 00 32 45 07 00 2A 40 07 00 F9 FF 00 05 00 06 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 00 01 07 00 2A 40 07 00 03 45 07 00 2A 40 07 01 64 FF 00 0D 00 07 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 00 01 07 00 B3 FF 00 01 00 07 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 00 02 07 00 B3 01 5E 07 00 B3 51 07 00 03 FF 00 01 00 07 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 00 02 07 00 03 01 5B 07 00 03 FF 00 0C 00 07 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 00 02 07 00 03 07 00 F9 FF 00 00 00 07 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 00 03 07 00 03 07 00 F9 01 FF 00 0A 00 07 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 00 03 07 00 03 07 00 F9 01 FF 00 01 00 07 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 00 04 07 00 03 07 00 F9 01 01 FF 00 1C 00 07 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 00 03 07 00 03 07 00 F9 01 42 07 00 1B FF 00 00 00 07 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 00 03 07 00 03 07 00 F9 01 45 07 00 2A 00 FF 00 0E 00 08 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 00 01 07 00 2A FF 00 00 00 08 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 00 02 07 00 C2 07 00 63 45 07 00 2A FF 00 00 00 08 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 00 02 07 00 C2 07 00 05 45 07 00 2A FF 00 00 00 08 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 00 02 07 00 C2 07 00 49 45 07 00 2A 40 07 00 C8 44 07 00 1F 40 07 00 C8 47 07 00 2A 40 07 01 66 FF 00 07 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 01 07 00 7F FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 00 03 07 01 66 45 07 00 2A 40 01 05 FF 00 21 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 04 07 00 F0 08 02 74 08 02 74 07 00 74 FF 00 01 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 05 07 00 F0 08 02 74 08 02 74 07 00 74 01 FF 00 1E 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 04 07 00 F0 08 02 74 08 02 74 07 00 74 FF 00 13 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 05 07 00 F0 08 02 74 08 02 74 07 00 E0 07 00 E2 FF 00 01 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 06 07 00 F0 08 02 74 08 02 74 07 00 E0 07 00 E2 01 FF 00 1D 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 05 07 00 F0 08 02 74 08 02 74 07 00 E0 07 00 E2 42 07 00 21 FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 05 07 00 F0 08 02 74 08 02 74 07 00 E0 07 00 E2 45 07 00 2A FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 00 F0 07 00 DB 45 07 00 2A FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 00 F0 07 00 EE 45 07 00 2A 00 03 04 41 01 17 4F 03 FF 00 01 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 03 01 5D 03 44 07 00 2A FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 03 07 00 63 45 07 00 2A FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 03 07 00 05 47 07 00 2A FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 03 07 00 49 45 07 00 2A FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 03 01 FC 00 10 02 42 01 1E 4D 07 00 F9 FF 00 02 00 0A 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 00 02 07 00 F9 01 5E 07 00 F9 FF 00 10 00 0A 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 00 02 03 07 00 63 FF 00 02 00 0A 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 00 03 03 07 00 63 01 FF 00 1F 00 0A 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 00 02 03 07 00 63 42 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 00 02 03 07 00 63 45 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 00 02 03 07 00 05 47 07 00 23 FF 00 00 00 0A 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 00 02 03 07 00 49 45 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 00 02 03 01 FF 00 15 00 0B 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 00 01 03 FF 00 02 00 0B 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 00 02 03 01 5F 03 44 07 00 2A FF 00 00 00 0B 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 00 02 03 07 00 63 45 07 00 2A FF 00 00 00 0B 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 00 02 03 07 00 05 47 07 00 2A FF 00 00 00 0B 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 00 02 03 07 00 49 45 07 00 2A FF 00 00 00 0B 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 00 02 03 01 FF 00 1E 00 0C 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 02 00 03 07 00 F0 08 04 7C 08 04 7C FF 00 02 00 0C 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 02 00 04 07 00 F0 08 04 7C 08 04 7C 01 FF 00 1C 00 0C 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 02 00 03 07 00 F0 08 04 7C 08 04 7C 44 07 00 1D FF 00 00 00 0C 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 02 00 04 07 00 F0 08 04 7C 08 04 7C 07 00 63 45 07 00 2A FF 00 00 00 0C 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 02 00 04 07 00 F0 08 04 7C 08 04 7C 07 00 05 47 07 00 2A FF 00 00 00 0C 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 02 00 05 07 00 F0 08 04 7C 08 04 7C 07 00 49 07 00 63 45 07 00 2A FF 00 00 00 0C 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 02 00 05 07 00 F0 08 04 7C 08 04 7C 07 00 49 07 00 05 4E 07 00 2A FF 00 00 00 0C 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 02 00 09 07 00 F0 08 04 7C 08 04 7C 07 00 49 07 00 32 07 01 23 02 02 02 45 07 00 2A FF 00 00 00 0C 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 02 00 02 07 00 F0 07 01 1E FF 00 0E 00 0C 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 02 00 02 07 00 F0 07 00 EE FF 00 02 00 0C 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 02 00 03 07 00 F0 07 00 EE 01 FF 00 1D 00 0C 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 02 00 02 07 00 F0 07 00 EE 42 07 00 2A FF 00 00 00 0C 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 02 00 02 07 00 F0 07 00 EE 45 07 00 2A 00 F8 00 02 FF 00 13 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 01 3C 07 00 03 FF 00 02 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 03 07 01 3C 07 00 03 01 FF 00 1E 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 01 3C 07 00 03 FF 00 0E 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 01 3C 07 00 74 FF 00 02 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 03 07 01 3C 07 00 74 01 FF 00 1D 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 01 3C 07 00 74 FF 00 0E 00 00 00 01 07 00 2A FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 04 07 01 3C 07 00 D5 07 00 C2 07 00 63 45 07 00 2A FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 04 07 01 3C 07 00 D5 07 00 C2 07 00 05 47 07 00 2A FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 05 07 01 3C 07 00 D5 07 00 C2 07 00 49 07 00 63 45 07 00 2A FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 05 07 01 3C 07 00 D5 07 00 C2 07 00 49 07 00 05 FF 00 10 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 06 07 01 3C 07 00 D5 07 00 C2 07 00 49 07 00 32 07 00 F9 FF 00 02 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 07 07 01 3C 07 00 D5 07 00 C2 07 00 49 07 00 32 07 00 F9 01 FF 00 1C 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 06 07 01 3C 07 00 D5 07 00 C2 07 00 49 07 00 32 07 00 F9 45 07 00 7B FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 07 07 01 3C 07 00 D5 07 00 C2 07 00 49 07 00 32 07 00 F9 07 01 23 45 07 00 2A 40 07 01 68 00 0B 42 01 1D 52 07 00 D5 FF 00 02 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 00 D5 01 5D 07 00 D5 45 07 00 85 FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 00 D5 07 01 23 45 07 00 2A 00 10 42 01 1D 4F 07 00 74 FF 00 02 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 00 74 01 5C 07 00 74 FF 00 19 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 04 07 00 F0 08 06 C2 08 06 C2 07 00 74 FF 00 02 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 05 07 00 F0 08 06 C2 08 06 C2 07 00 74 01 FF 00 1E 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 04 07 00 F0 08 06 C2 08 06 C2 07 00 74 FF 00 0B 00 00 00 01 07 00 2A FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 05 07 00 F0 08 06 C2 08 06 C2 07 00 E0 07 00 E2 45 07 00 2A FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 00 F0 07 00 DB FF 00 0E 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 00 F0 07 00 EE FF 00 02 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 03 07 00 F0 07 00 EE 01 FF 00 1D 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 00 F0 07 00 EE 42 07 00 2A FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 00 F0 07 00 EE 45 07 00 2A 00 12 42 01 1E 46 07 00 87 FF 00 00 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 03 07 00 03 07 01 64 01 45 07 00 2A 00 FF 00 01 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 00 FF 00 01 00 07 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 00 01 07 00 03 FF 00 01 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 01 07 00 74 FC 00 01 02 FF 00 01 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 04 07 00 F0 08 02 74 08 02 74 07 00 74 FF 00 01 00 04 07 00 03 07 00 49 07 00 B3 01 00 00 41 07 00 63 FF 00 01 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 02 07 00 03 07 00 63 FF 00 01 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 05 07 00 F0 08 02 74 08 02 74 07 00 E0 07 00 E2 FF 00 01 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 00 F0 07 00 EE FF 00 01 00 0A 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 00 02 03 07 00 63 FF 00 01 00 0C 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 02 00 03 07 00 F0 08 04 7C 08 04 7C FF 00 01 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 01 3C 07 00 03 FF 00 01 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 00 FF 00 01 00 0A 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 00 01 07 00 F9 FF 00 01 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 02 07 01 3C 07 00 74 FF 00 01 00 07 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 00 01 07 00 B3 FF 00 01 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 06 07 01 3C 07 00 D5 07 00 C2 07 00 49 07 00 32 07 00 F9 FF 00 01 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 04 07 00 03 07 00 49 07 00 9F 07 00 63 FF 00 01 00 05 07 00 03 07 00 49 07 00 B3 01 07 00 63 00 03 07 00 03 07 00 49 07 00 9F FF 00 01 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 00 FF 00 01 00 07 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 00 03 07 00 03 07 00 F9 01 FF 00 01 00 0C 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 02 00 02 07 00 F0 07 00 EE FF 00 01 00 09 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 00 04 07 00 F0 08 06 C2 08 06 C2 07 00 74 01 41 07 00 D5 41 03 01 FF 00 01 00 0B 07 00 03 07 00 49 07 00 B3 01 07 00 63 07 00 F9 07 01 64 01 07 01 66 02 02 00 01 03 FF 00 01 00 04 07 00 03 07 00 49 07 00 B3 01 00 01 07 00 2A 43 05 44 07 00 2A 47 05 47 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2000   2008   Ljava/lang/ClassCastException;
        //  2000   2008   2000   2008   Any
        //  2016   2018   3      8      Ljava/lang/NumberFormatException;
        //  77     84     84     85     Any
        //  77     84     77     78     Any
        //  78     84     84     85     Ljava/lang/NegativeArraySizeException;
        //  77     84     3      8      Any
        //  77     84     84     85     Any
        //  227    234    234    235    Any
        //  228    234    234    235    Ljava/lang/RuntimeException;
        //  227    234    3      8      Any
        //  228    234    227    228    Any
        //  228    234    227    228    Any
        //  340    346    346    347    Any
        //  340    346    3      8      Any
        //  340    346    3      8      Any
        //  340    346    3      8      Ljava/lang/NumberFormatException;
        //  340    346    3      8      Ljava/lang/RuntimeException;
        //  355    362    362    363    Any
        //  355    362    355    356    Any
        //  356    362    362    363    Ljava/lang/ArithmeticException;
        //  355    362    3      8      Ljava/lang/IllegalStateException;
        //  355    362    355    356    Ljava/util/NoSuchElementException;
        //  369    376    376    377    Any
        //  370    376    3      8      Ljava/lang/RuntimeException;
        //  369    376    369    370    Ljava/lang/IllegalStateException;
        //  369    376    369    370    Any
        //  369    376    3      8      Ljava/lang/UnsupportedOperationException;
        //  531    538    538    539    Any
        //  531    538    538    539    Ljava/lang/EnumConstantNotPresentException;
        //  531    538    3      8      Any
        //  532    538    3      8      Ljava/lang/ClassCastException;
        //  532    538    531    532    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  554    561    561    562    Any
        //  554    561    554    555    Any
        //  555    561    554    555    Any
        //  555    561    554    555    Any
        //  554    561    3      8      Any
        //  568    575    575    576    Any
        //  569    575    575    576    Any
        //  569    575    568    569    Ljava/lang/StringIndexOutOfBoundsException;
        //  568    575    3      8      Any
        //  568    575    568    569    Any
        //  581    590    590    591    Any
        //  582    590    590    591    Ljava/util/ConcurrentModificationException;
        //  581    590    590    591    Any
        //  581    590    581    582    Ljava/lang/IndexOutOfBoundsException;
        //  582    590    3      8      Any
        //  599    606    606    607    Any
        //  599    606    606    607    Ljava/lang/IllegalStateException;
        //  599    606    599    600    Ljava/lang/UnsupportedOperationException;
        //  600    606    3      8      Ljava/lang/NumberFormatException;
        //  600    606    3      8      Ljava/lang/NumberFormatException;
        //  735    742    742    743    Any
        //  735    742    742    743    Any
        //  736    742    742    743    Ljava/lang/IllegalStateException;
        //  736    742    735    736    Ljava/lang/AssertionError;
        //  736    742    3      8      Ljava/lang/IllegalStateException;
        //  749    756    756    757    Any
        //  749    756    749    750    Any
        //  750    756    749    750    Ljava/lang/IndexOutOfBoundsException;
        //  749    756    749    750    Any
        //  750    756    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  845    852    852    853    Any
        //  845    852    845    846    Any
        //  846    852    852    853    Any
        //  846    852    852    853    Any
        //  846    852    852    853    Any
        //  861    868    868    869    Any
        //  861    868    861    862    Ljava/lang/StringIndexOutOfBoundsException;
        //  862    868    861    862    Any
        //  861    868    868    869    Any
        //  862    868    861    862    Any
        //  1023   1030   1030   1031   Any
        //  1024   1030   1023   1024   Any
        //  1023   1030   1030   1031   Any
        //  1023   1030   1030   1031   Any
        //  1024   1030   1023   1024   Ljava/lang/IllegalArgumentException;
        //  1039   1046   1046   1047   Any
        //  1039   1046   3      8      Ljava/lang/IllegalStateException;
        //  1040   1046   1046   1047   Ljava/lang/AssertionError;
        //  1039   1046   1039   1040   Ljava/lang/ArithmeticException;
        //  1040   1046   3      8      Any
        //  1109   1116   1116   1117   Any
        //  1110   1116   3      8      Any
        //  1109   1116   3      8      Ljava/lang/ClassCastException;
        //  1110   1116   3      8      Any
        //  1110   1116   1109   1110   Any
        //  1125   1132   1132   1133   Any
        //  1126   1132   1125   1126   Ljava/lang/IllegalArgumentException;
        //  1126   1132   1132   1133   Any
        //  1125   1132   1125   1126   Any
        //  1125   1132   1125   1126   Any
        //  1201   1208   1208   1209   Any
        //  1201   1208   1208   1209   Any
        //  1202   1208   1201   1202   Ljava/lang/IllegalArgumentException;
        //  1202   1208   1208   1209   Ljava/lang/IllegalArgumentException;
        //  1202   1208   1201   1202   Ljava/util/NoSuchElementException;
        //  1217   1224   1224   1225   Any
        //  1218   1224   3      8      Ljava/lang/RuntimeException;
        //  1218   1224   1224   1225   Any
        //  1218   1224   1217   1218   Ljava/lang/NegativeArraySizeException;
        //  1217   1224   1217   1218   Any
        //  1240   1247   1247   1248   Any
        //  1240   1247   1240   1241   Any
        //  1241   1247   1247   1248   Ljava/lang/StringIndexOutOfBoundsException;
        //  1240   1247   3      8      Any
        //  1241   1247   1240   1241   Ljava/lang/AssertionError;
        //  1299   1306   1306   1307   Any
        //  1300   1306   1299   1300   Ljava/lang/NullPointerException;
        //  1299   1306   1299   1300   Ljava/util/ConcurrentModificationException;
        //  1299   1306   3      8      Ljava/util/ConcurrentModificationException;
        //  1299   1306   1299   1300   Any
        //  1428   1434   1434   1435   Any
        //  1428   1434   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1428   1434   3      8      Ljava/lang/AssertionError;
        //  1428   1434   3      8      Any
        //  1428   1434   1434   1435   Ljava/lang/IllegalStateException;
        //  1443   1450   1450   1451   Any
        //  1444   1450   1450   1451   Any
        //  1444   1450   1443   1444   Any
        //  1443   1450   1450   1451   Any
        //  1444   1450   1450   1451   Any
        //  1506   1513   1513   1514   Any
        //  1506   1513   1506   1507   Ljava/lang/IllegalStateException;
        //  1506   1513   1513   1514   Ljava/lang/IllegalStateException;
        //  1507   1513   1513   1514   Ljava/lang/NumberFormatException;
        //  1507   1513   1513   1514   Ljava/lang/StringIndexOutOfBoundsException;
        //  1618   1625   1625   1626   Any
        //  1619   1625   1625   1626   Any
        //  1619   1625   3      8      Ljava/lang/RuntimeException;
        //  1619   1625   1618   1619   Ljava/lang/IllegalArgumentException;
        //  1618   1625   3      8      Ljava/lang/ArithmeticException;
        //  1797   1803   1803   1804   Any
        //  1797   1803   1803   1804   Ljava/lang/AssertionError;
        //  1797   1803   1803   1804   Ljava/lang/NullPointerException;
        //  1797   1803   1803   1804   Any
        //  1797   1803   1803   1804   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1855   1862   1862   1863   Any
        //  1855   1862   3      8      Ljava/lang/NegativeArraySizeException;
        //  1855   1862   1855   1856   Any
        //  1855   1862   1862   1863   Ljava/lang/AssertionError;
        //  1856   1862   1862   1863   Ljava/lang/ClassCastException;
        //  1923   1930   1930   1931   Any
        //  1923   1930   3      8      Ljava/util/NoSuchElementException;
        //  1923   1930   1930   1931   Any
        //  1924   1930   1930   1931   Ljava/lang/StringIndexOutOfBoundsException;
        //  1924   1930   1923   1924   Ljava/lang/NullPointerException;
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
    
    @NotNull
    public Vec2f c(@NotNull final Vec3d p0, @Nullable final EnumFacing p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          690
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            682
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            674
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokevirtual   dev/nuker/pyro/fbg.c:()Lnet/minecraft/util/math/Vec3d;
        //    34: goto            38
        //    37: athrow         
        //    38: astore_3       
        //    39: getstatic       dev/nuker/pyro/fc.1:I
        //    42: ifeq            51
        //    45: ldc_w           2096650856
        //    48: goto            54
        //    51: ldc_w           -877031010
        //    54: ldc_w           -1496027611
        //    57: ixor           
        //    58: lookupswitch {
        //          -634637235: 51
        //          1835925435: 84
        //          default: 653
        //        }
        //    84: aload_1        
        //    85: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //    88: aload_3        
        //    89: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //    92: dsub           
        //    93: getstatic       dev/nuker/pyro/fc.1:I
        //    96: ifeq            105
        //    99: ldc_w           2044833431
        //   102: goto            108
        //   105: ldc_w           1246079091
        //   108: ldc_w           -364479058
        //   111: ixor           
        //   112: lookupswitch {
        //          -1817717959: 105
        //          -1610361379: 140
        //          default: 647
        //        }
        //   140: dstore          4
        //   142: aload_1        
        //   143: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   146: aload_3        
        //   147: getstatic       dev/nuker/pyro/fc.c:I
        //   150: ifge            159
        //   153: ldc_w           -784622004
        //   156: goto            162
        //   159: ldc_w           -1615990159
        //   162: ldc_w           -89553259
        //   165: ixor           
        //   166: lookupswitch {
        //          730994905: 159
        //          1694790884: 192
        //          default: 659
        //        }
        //   192: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   195: dsub           
        //   196: dstore          6
        //   198: aload_1        
        //   199: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   202: aload_3        
        //   203: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   206: dsub           
        //   207: dstore          8
        //   209: dload           4
        //   211: dload           4
        //   213: dmul           
        //   214: dload           8
        //   216: dload           8
        //   218: dmul           
        //   219: dadd           
        //   220: getstatic       dev/nuker/pyro/fc.0:I
        //   223: ifeq            232
        //   226: ldc_w           453291337
        //   229: goto            235
        //   232: ldc_w           683766249
        //   235: ldc_w           -836911814
        //   238: ixor           
        //   239: lookupswitch {
        //          -719777677: 232
        //          -421737261: 264
        //          default: 651
        //        }
        //   264: goto            268
        //   267: athrow         
        //   268: invokestatic    java/lang/Math.sqrt:(D)D
        //   271: goto            275
        //   274: athrow         
        //   275: dstore          10
        //   277: dload           8
        //   279: dload           4
        //   281: goto            285
        //   284: athrow         
        //   285: invokestatic    java/lang/Math.atan2:(DD)D
        //   288: goto            292
        //   291: athrow         
        //   292: goto            296
        //   295: athrow         
        //   296: invokestatic    java/lang/Math.toDegrees:(D)D
        //   299: goto            303
        //   302: athrow         
        //   303: d2f            
        //   304: ldc_w           90.0
        //   307: fsub           
        //   308: fstore          12
        //   310: dload           6
        //   312: dload           10
        //   314: goto            318
        //   317: athrow         
        //   318: invokestatic    java/lang/Math.atan2:(DD)D
        //   321: goto            325
        //   324: athrow         
        //   325: goto            329
        //   328: athrow         
        //   329: invokestatic    java/lang/Math.toDegrees:(D)D
        //   332: goto            336
        //   335: athrow         
        //   336: dneg           
        //   337: d2f            
        //   338: fstore          13
        //   340: new             Lnet/minecraft/util/math/Vec2f;
        //   343: dup            
        //   344: getstatic       dev/nuker/pyro/fc.c:I
        //   347: ifge            356
        //   350: ldc_w           11250035
        //   353: goto            359
        //   356: ldc_w           -707056389
        //   359: ldc_w           -706735221
        //   362: ixor           
        //   363: lookupswitch {
        //          -751027474: 356
        //          -716457224: 655
        //          default: 388
        //        }
        //   388: aload_0        
        //   389: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   392: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   395: getstatic       dev/nuker/pyro/fc.0:I
        //   398: ifeq            407
        //   401: ldc_w           -850952335
        //   404: goto            410
        //   407: ldc_w           -961463656
        //   410: ldc_w           412400144
        //   413: ixor           
        //   414: lookupswitch {
        //          -707541663: 661
        //          2060156552: 407
        //          default: 440
        //        }
        //   440: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   443: fload           12
        //   445: aload_0        
        //   446: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   449: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   452: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   455: fsub           
        //   456: goto            460
        //   459: athrow         
        //   460: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //   463: goto            467
        //   466: athrow         
        //   467: fadd           
        //   468: getstatic       dev/nuker/pyro/fc.1:I
        //   471: ifeq            480
        //   474: ldc_w           -996470261
        //   477: goto            483
        //   480: ldc_w           -1308327247
        //   483: ldc_w           -459801329
        //   486: ixor           
        //   487: lookupswitch {
        //          -763062272: 480
        //          537718532: 657
        //          default: 512
        //        }
        //   512: aload_0        
        //   513: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   516: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   519: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //   522: fload           13
        //   524: getstatic       dev/nuker/pyro/fc.c:I
        //   527: ifge            536
        //   530: ldc_w           -2025709712
        //   533: goto            539
        //   536: ldc_w           1489087075
        //   539: ldc_w           -1471427468
        //   542: ixor           
        //   543: lookupswitch {
        //          -259365353: 568
        //          789172996: 536
        //          default: 663
        //        }
        //   568: aload_0        
        //   569: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   572: getstatic       dev/nuker/pyro/fc.1:I
        //   575: ifeq            584
        //   578: ldc_w           -1172885914
        //   581: goto            587
        //   584: ldc_w           752222331
        //   587: ldc_w           1367868479
        //   590: ixor           
        //   591: lookupswitch {
        //          -2031379078: 584
        //          -341890471: 649
        //          default: 616
        //        }
        //   616: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   619: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //   622: fsub           
        //   623: goto            627
        //   626: athrow         
        //   627: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //   630: goto            634
        //   633: athrow         
        //   634: fadd           
        //   635: goto            639
        //   638: athrow         
        //   639: invokespecial   net/minecraft/util/math/Vec2f.<init>:(FF)V
        //   642: goto            646
        //   645: athrow         
        //   646: areturn        
        //   647: aconst_null    
        //   648: athrow         
        //   649: aconst_null    
        //   650: athrow         
        //   651: aconst_null    
        //   652: athrow         
        //   653: aconst_null    
        //   654: athrow         
        //   655: aconst_null    
        //   656: athrow         
        //   657: aconst_null    
        //   658: athrow         
        //   659: aconst_null    
        //   660: athrow         
        //   661: aconst_null    
        //   662: athrow         
        //   663: aconst_null    
        //   664: athrow         
        //   665: pop            
        //   666: goto            24
        //   669: pop            
        //   670: aconst_null    
        //   671: goto            665
        //   674: dup            
        //   675: ifnull          665
        //   678: checkcast       Ljava/lang/Throwable;
        //   681: athrow         
        //   682: dup            
        //   683: ifnull          669
        //   686: checkcast       Ljava/lang/Throwable;
        //   689: athrow         
        //   690: aconst_null    
        //   691: athrow         
        //    StackMapTable: 00 51 43 07 00 2A 04 FF 00 0B 00 00 00 01 07 00 2A FE 00 03 07 00 03 07 00 F9 07 00 32 FF 00 05 00 00 00 01 07 00 2A FF 00 00 00 03 07 00 03 07 00 F9 07 00 32 00 01 07 00 03 45 07 00 2A 40 07 00 F9 FC 00 0C 07 00 F9 42 01 1D 54 03 FF 00 02 00 04 07 00 03 07 00 F9 07 00 32 07 00 F9 00 02 03 01 5F 03 FF 00 12 00 05 07 00 03 07 00 F9 07 00 32 07 00 F9 03 00 02 03 07 00 F9 FF 00 02 00 05 07 00 03 07 00 F9 07 00 32 07 00 F9 03 00 03 03 07 00 F9 01 FF 00 1D 00 05 07 00 03 07 00 F9 07 00 32 07 00 F9 03 00 02 03 07 00 F9 FF 00 27 00 07 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 00 01 03 FF 00 02 00 07 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 00 02 03 01 5C 03 42 07 00 23 40 03 45 07 00 2A 40 03 FF 00 08 00 08 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 00 01 07 00 2A FF 00 00 00 08 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 00 02 03 03 45 07 00 2A 40 03 FF 00 02 00 00 00 01 07 00 2A FF 00 00 00 08 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 00 01 03 45 07 00 2A 40 03 FF 00 0D 00 09 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 00 01 07 00 2A FF 00 00 00 09 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 00 02 03 03 45 07 00 2A 40 03 42 07 00 7B 40 03 45 07 00 2A 40 03 FF 00 13 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 02 08 01 54 08 01 54 FF 00 02 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 03 08 01 54 08 01 54 01 FF 00 1C 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 02 08 01 54 08 01 54 FF 00 12 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 03 08 01 54 08 01 54 07 00 D5 FF 00 02 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 04 08 01 54 08 01 54 07 00 D5 01 FF 00 1D 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 03 08 01 54 08 01 54 07 00 D5 FF 00 12 00 00 00 01 07 00 2A FF 00 00 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 04 08 01 54 08 01 54 02 02 45 07 00 2A FF 00 00 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 04 08 01 54 08 01 54 02 02 FF 00 0C 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 03 08 01 54 08 01 54 02 FF 00 02 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 04 08 01 54 08 01 54 02 01 FF 00 1C 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 03 08 01 54 08 01 54 02 FF 00 17 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 05 08 01 54 08 01 54 02 02 02 FF 00 02 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 06 08 01 54 08 01 54 02 02 02 01 FF 00 1C 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 05 08 01 54 08 01 54 02 02 02 FF 00 0F 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 06 08 01 54 08 01 54 02 02 02 07 00 74 FF 00 02 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 07 08 01 54 08 01 54 02 02 02 07 00 74 01 FF 00 1C 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 06 08 01 54 08 01 54 02 02 02 07 00 74 49 07 00 23 FF 00 00 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 05 08 01 54 08 01 54 02 02 02 45 07 00 2A FF 00 00 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 05 08 01 54 08 01 54 02 02 02 43 07 00 87 FF 00 00 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 04 08 01 54 08 01 54 02 02 45 07 00 2A 40 07 01 64 FF 00 00 00 04 07 00 03 07 00 F9 07 00 32 07 00 F9 00 01 03 FF 00 01 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 06 08 01 54 08 01 54 02 02 02 07 00 74 FF 00 01 00 07 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 00 01 03 F8 00 01 FF 00 01 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 02 08 01 54 08 01 54 FF 00 01 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 03 08 01 54 08 01 54 02 FF 00 01 00 05 07 00 03 07 00 F9 07 00 32 07 00 F9 03 00 02 03 07 00 F9 FF 00 01 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 03 08 01 54 08 01 54 07 00 D5 FF 00 01 00 0A 07 00 03 07 00 F9 07 00 32 07 00 F9 03 03 03 03 02 02 00 05 08 01 54 08 01 54 02 02 02 FF 00 01 00 03 07 00 03 07 00 F9 07 00 32 00 01 07 00 2A 43 05 44 07 00 2A 47 05 47 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     674    682    Any
        //  674    682    674    682    Ljava/lang/UnsupportedOperationException;
        //  690    692    3      8      Any
        //  31     37     37     38     Any
        //  31     37     3      8      Ljava/lang/IllegalArgumentException;
        //  31     37     3      8      Any
        //  31     37     3      8      Ljava/lang/NullPointerException;
        //  31     37     3      8      Any
        //  267    274    274    275    Any
        //  268    274    274    275    Any
        //  268    274    3      8      Any
        //  267    274    267    268    Ljava/lang/ArithmeticException;
        //  268    274    274    275    Ljava/lang/IllegalArgumentException;
        //  284    291    291    292    Any
        //  285    291    3      8      Ljava/lang/NegativeArraySizeException;
        //  285    291    284    285    Ljava/lang/ClassCastException;
        //  284    291    284    285    Any
        //  285    291    3      8      Ljava/lang/IllegalArgumentException;
        //  296    302    302    303    Any
        //  296    302    302    303    Any
        //  296    302    302    303    Any
        //  296    302    3      8      Ljava/lang/NullPointerException;
        //  296    302    3      8      Any
        //  317    324    324    325    Any
        //  318    324    3      8      Ljava/lang/RuntimeException;
        //  317    324    317    318    Any
        //  317    324    324    325    Any
        //  317    324    324    325    Any
        //  328    335    335    336    Any
        //  328    335    328    329    Ljava/lang/IllegalStateException;
        //  329    335    335    336    Any
        //  328    335    335    336    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  329    335    3      8      Any
        //  460    466    466    467    Any
        //  460    466    466    467    Any
        //  460    466    466    467    Any
        //  460    466    3      8      Ljava/lang/IllegalArgumentException;
        //  460    466    3      8      Any
        //  626    633    633    634    Any
        //  626    633    3      8      Any
        //  626    633    3      8      Any
        //  626    633    626    627    Ljava/lang/ArithmeticException;
        //  626    633    3      8      Any
        //  638    645    645    646    Any
        //  639    645    3      8      Ljava/util/NoSuchElementException;
        //  639    645    638    639    Ljava/lang/NullPointerException;
        //  639    645    645    646    Ljava/lang/StringIndexOutOfBoundsException;
        //  638    645    3      8      Ljava/lang/RuntimeException;
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
    
    public void c(@Nullable final BlockPos p0, @Nullable final EnumFacing p1, @Nullable final Vec3d p2, @Nullable final EnumHand p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          248
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            240
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            232
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //    28: getstatic       dev/nuker/pyro/fc.1:I
        //    31: ifeq            40
        //    34: ldc_w           -1474203821
        //    37: goto            43
        //    40: ldc_w           513064670
        //    43: ldc_w           -1240693532
        //    46: ixor           
        //    47: lookupswitch {
        //          506325943: 217
        //          2125673089: 40
        //          default: 72
        //        }
        //    72: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //    75: getstatic       dev/nuker/pyro/fc.1:I
        //    78: ifeq            87
        //    81: ldc_w           1513065629
        //    84: goto            90
        //    87: ldc_w           -985858977
        //    90: ldc_w           1038516088
        //    93: ixor           
        //    94: lookupswitch {
        //          -119897305: 120
        //          1741288421: 87
        //          default: 219
        //        }
        //   120: aload_0        
        //   121: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   124: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   127: aload_0        
        //   128: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   131: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   134: aload_1        
        //   135: aload_2        
        //   136: aload_3        
        //   137: aload           4
        //   139: goto            143
        //   142: athrow         
        //   143: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_187099_a:(Lnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;
        //   146: goto            150
        //   149: athrow         
        //   150: pop            
        //   151: aload_0        
        //   152: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   155: getstatic       dev/nuker/pyro/fc.1:I
        //   158: ifeq            167
        //   161: ldc_w           -1310355517
        //   164: goto            170
        //   167: ldc_w           1363313950
        //   170: ldc_w           -136957392
        //   173: ixor           
        //   174: lookupswitch {
        //          -1500203218: 200
        //          1177796083: 167
        //          default: 221
        //        }
        //   200: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   203: aload           4
        //   205: goto            209
        //   208: athrow         
        //   209: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184609_a:(Lnet/minecraft/util/EnumHand;)V
        //   212: goto            216
        //   215: athrow         
        //   216: return         
        //   217: aconst_null    
        //   218: athrow         
        //   219: aconst_null    
        //   220: athrow         
        //   221: aconst_null    
        //   222: athrow         
        //   223: pop            
        //   224: goto            24
        //   227: pop            
        //   228: aconst_null    
        //   229: goto            223
        //   232: dup            
        //   233: ifnull          223
        //   236: checkcast       Ljava/lang/Throwable;
        //   239: athrow         
        //   240: dup            
        //   241: ifnull          227
        //   244: checkcast       Ljava/lang/Throwable;
        //   247: athrow         
        //   248: aconst_null    
        //   249: athrow         
        //    StackMapTable: 00 1D 43 07 00 2A 04 FF 00 0B 00 00 00 01 07 00 2A FF 00 03 00 05 07 00 03 07 00 49 07 00 32 07 00 F9 07 01 23 00 00 4F 07 00 74 FF 00 02 00 05 07 00 03 07 00 49 07 00 32 07 00 F9 07 01 23 00 02 07 00 74 01 5C 07 00 74 4E 07 01 3C FF 00 02 00 05 07 00 03 07 00 49 07 00 32 07 00 F9 07 01 23 00 02 07 01 3C 01 5D 07 01 3C 55 07 00 2A FF 00 00 00 05 07 00 03 07 00 49 07 00 32 07 00 F9 07 01 23 00 07 07 01 3C 07 00 D5 07 00 C2 07 00 49 07 00 32 07 00 F9 07 01 23 45 07 00 2A 40 07 01 68 50 07 00 74 FF 00 02 00 05 07 00 03 07 00 49 07 00 32 07 00 F9 07 01 23 00 02 07 00 74 01 5D 07 00 74 FF 00 07 00 00 00 01 07 00 2A FF 00 00 00 05 07 00 03 07 00 49 07 00 32 07 00 F9 07 01 23 00 02 07 00 D5 07 01 23 45 07 00 2A 00 40 07 00 74 41 07 01 3C 41 07 00 74 41 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     232    240    Ljava/lang/IllegalArgumentException;
        //  232    240    232    240    Ljava/lang/NullPointerException;
        //  248    250    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  142    149    149    150    Any
        //  143    149    149    150    Any
        //  143    149    3      8      Any
        //  142    149    149    150    Ljava/lang/IndexOutOfBoundsException;
        //  142    149    142    143    Any
        //  209    215    215    216    Any
        //  209    215    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  209    215    215    216    Any
        //  209    215    215    216    Any
        //  209    215    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 83 out of bounds for length 83
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
    
    public static fbg 0() {
        return fbS.gB(null, 686738607);
    }
    
    @NotNull
    public Vec3d c(@Nullable final BlockPos p0, @NotNull final World p1, @NotNull final EnumFacing p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1351
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1343
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1335
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_2        
        //    25: pop            
        //    26: aload_3        
        //    27: pop            
        //    28: aload_2        
        //    29: aload_1        
        //    30: getstatic       dev/nuker/pyro/fc.1:I
        //    33: ifeq            42
        //    36: ldc_w           -55301552
        //    39: goto            45
        //    42: ldc_w           690296669
        //    45: ldc_w           -742928332
        //    48: ixor           
        //    49: lookupswitch {
        //          788789860: 1302
        //          1150440901: 42
        //          default: 76
        //        }
        //    76: goto            80
        //    79: athrow         
        //    80: invokevirtual   net/minecraft/world/World.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //    83: goto            87
        //    86: athrow         
        //    87: astore          4
        //    89: aload           4
        //    91: getstatic       dev/nuker/pyro/fc.c:I
        //    94: ifge            103
        //    97: ldc_w           -411481109
        //   100: goto            106
        //   103: ldc_w           -723525477
        //   106: ldc_w           1771254865
        //   109: ixor           
        //   110: lookupswitch {
        //          -1897234502: 1316
        //          1613582993: 103
        //          default: 136
        //        }
        //   136: aload_2        
        //   137: checkcast       Lnet/minecraft/world/IBlockAccess;
        //   140: aload_1        
        //   141: goto            145
        //   144: athrow         
        //   145: invokeinterface net/minecraft/block/state/IBlockState.func_185900_c:(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;
        //   150: goto            154
        //   153: athrow         
        //   154: getstatic       dev/nuker/pyro/fc.0:I
        //   157: ifeq            166
        //   160: ldc_w           457421829
        //   163: goto            169
        //   166: ldc_w           1095324877
        //   169: ldc_w           1563054004
        //   172: ixor           
        //   173: lookupswitch {
        //          476257145: 200
        //          1181350833: 166
        //          default: 1292
        //        }
        //   200: astore          5
        //   202: aconst_null    
        //   203: astore          6
        //   205: getstatic       dev/nuker/pyro/fc.0:I
        //   208: ifeq            217
        //   211: ldc_w           661939809
        //   214: goto            220
        //   217: ldc_w           124937919
        //   220: ldc_w           -154799153
        //   223: ixor           
        //   224: lookupswitch {
        //          -776890962: 1304
        //          -731585318: 217
        //          default: 252
        //        }
        //   252: aload           5
        //   254: getfield        net/minecraft/util/math/AxisAlignedBB.field_72340_a:D
        //   257: aload           5
        //   259: getfield        net/minecraft/util/math/AxisAlignedBB.field_72336_d:D
        //   262: aload           5
        //   264: getfield        net/minecraft/util/math/AxisAlignedBB.field_72340_a:D
        //   267: dsub           
        //   268: ldc2_w          2.0
        //   271: ddiv           
        //   272: dadd           
        //   273: dstore          7
        //   275: aload           5
        //   277: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
        //   280: getstatic       dev/nuker/pyro/fc.c:I
        //   283: ifge            292
        //   286: ldc_w           1374312587
        //   289: goto            295
        //   292: ldc_w           -1392958379
        //   295: ldc_w           -1508385599
        //   298: ixor           
        //   299: lookupswitch {
        //          -926516055: 292
        //          -134380470: 1318
        //          default: 324
        //        }
        //   324: aload           5
        //   326: getfield        net/minecraft/util/math/AxisAlignedBB.field_72337_e:D
        //   329: aload           5
        //   331: getstatic       dev/nuker/pyro/fc.1:I
        //   334: ifeq            343
        //   337: ldc_w           520933063
        //   340: goto            346
        //   343: ldc_w           -387659676
        //   346: ldc_w           -1370046507
        //   349: ixor           
        //   350: lookupswitch {
        //          -1319472878: 343
        //          1186101169: 376
        //          default: 1300
        //        }
        //   376: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
        //   379: dsub           
        //   380: ldc2_w          2.0
        //   383: ddiv           
        //   384: dadd           
        //   385: dstore          9
        //   387: getstatic       dev/nuker/pyro/fc.0:I
        //   390: ifeq            399
        //   393: ldc_w           -217148196
        //   396: goto            402
        //   399: ldc_w           -1605928843
        //   402: ldc_w           159509631
        //   405: ixor           
        //   406: lookupswitch {
        //          -1446603766: 432
        //          -91260765: 399
        //          default: 1312
        //        }
        //   432: aload           5
        //   434: getfield        net/minecraft/util/math/AxisAlignedBB.field_72339_c:D
        //   437: aload           5
        //   439: getstatic       dev/nuker/pyro/fc.c:I
        //   442: ifge            451
        //   445: ldc_w           1930249408
        //   448: goto            454
        //   451: ldc_w           -1388345127
        //   454: ldc_w           789000067
        //   457: ixor           
        //   458: lookupswitch {
        //          -2110216358: 484
        //          1544186691: 451
        //          default: 1306
        //        }
        //   484: getfield        net/minecraft/util/math/AxisAlignedBB.field_72334_f:D
        //   487: aload           5
        //   489: getfield        net/minecraft/util/math/AxisAlignedBB.field_72339_c:D
        //   492: dsub           
        //   493: ldc2_w          2.0
        //   496: ddiv           
        //   497: dadd           
        //   498: dstore          11
        //   500: aload_3        
        //   501: goto            505
        //   504: athrow         
        //   505: invokevirtual   net/minecraft/util/EnumFacing.func_176740_k:()Lnet/minecraft/util/EnumFacing$Axis;
        //   508: goto            512
        //   511: athrow         
        //   512: dup            
        //   513: ifnonnull       520
        //   516: pop            
        //   517: goto            1118
        //   520: getstatic       dev/nuker/pyro/fbf.c:[I
        //   523: swap           
        //   524: goto            528
        //   527: athrow         
        //   528: invokevirtual   net/minecraft/util/EnumFacing$Axis.ordinal:()I
        //   531: goto            535
        //   534: athrow         
        //   535: iaload         
        //   536: tableswitch {
        //                2: 564
        //                3: 675
        //                4: 918
        //          default: 1118
        //        }
        //   564: new             Lnet/minecraft/util/math/Vec3d;
        //   567: dup            
        //   568: aload           5
        //   570: getfield        net/minecraft/util/math/AxisAlignedBB.field_72340_a:D
        //   573: getstatic       dev/nuker/pyro/fc.c:I
        //   576: ifge            585
        //   579: ldc_w           -2088036628
        //   582: goto            588
        //   585: ldc_w           334077222
        //   588: ldc_w           -850624645
        //   591: ixor           
        //   592: lookupswitch {
        //          -559553955: 620
        //          1321691543: 585
        //          default: 1294
        //        }
        //   620: aload           5
        //   622: getfield        net/minecraft/util/math/AxisAlignedBB.field_72336_d:D
        //   625: aload           5
        //   627: getfield        net/minecraft/util/math/AxisAlignedBB.field_72340_a:D
        //   630: dsub           
        //   631: aload_3        
        //   632: goto            636
        //   635: athrow         
        //   636: invokevirtual   net/minecraft/util/EnumFacing.func_176743_c:()Lnet/minecraft/util/EnumFacing$AxisDirection;
        //   639: goto            643
        //   642: athrow         
        //   643: getstatic       net/minecraft/util/EnumFacing$AxisDirection.POSITIVE:Lnet/minecraft/util/EnumFacing$AxisDirection;
        //   646: if_acmpne       653
        //   649: iconst_1       
        //   650: goto            654
        //   653: iconst_0       
        //   654: i2d            
        //   655: dmul           
        //   656: dadd           
        //   657: dload           9
        //   659: dload           11
        //   661: goto            665
        //   664: athrow         
        //   665: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //   668: goto            672
        //   671: athrow         
        //   672: goto            1255
        //   675: new             Lnet/minecraft/util/math/Vec3d;
        //   678: dup            
        //   679: getstatic       dev/nuker/pyro/fc.1:I
        //   682: ifeq            691
        //   685: ldc_w           1826497118
        //   688: goto            694
        //   691: ldc_w           -697303613
        //   694: ldc_w           1553774689
        //   697: ixor           
        //   698: lookupswitch {
        //          -2062046416: 691
        //          809671231: 1322
        //          default: 724
        //        }
        //   724: dload           7
        //   726: getstatic       dev/nuker/pyro/fc.0:I
        //   729: ifeq            738
        //   732: ldc_w           1424184421
        //   735: goto            741
        //   738: ldc_w           61481774
        //   741: ldc_w           912665158
        //   744: ixor           
        //   745: lookupswitch {
        //          902564200: 772
        //          1652915747: 738
        //          default: 1308
        //        }
        //   772: aload           5
        //   774: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
        //   777: aload           5
        //   779: getfield        net/minecraft/util/math/AxisAlignedBB.field_72337_e:D
        //   782: aload           5
        //   784: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
        //   787: dsub           
        //   788: getstatic       dev/nuker/pyro/fc.0:I
        //   791: ifeq            800
        //   794: ldc_w           1951181920
        //   797: goto            803
        //   800: ldc_w           1949116272
        //   803: ldc_w           -1177563499
        //   806: ixor           
        //   807: lookupswitch {
        //          -847027467: 800
        //          -840767003: 832
        //          default: 1324
        //        }
        //   832: aload_3        
        //   833: goto            837
        //   836: athrow         
        //   837: invokevirtual   net/minecraft/util/EnumFacing.func_176743_c:()Lnet/minecraft/util/EnumFacing$AxisDirection;
        //   840: goto            844
        //   843: athrow         
        //   844: getstatic       net/minecraft/util/EnumFacing$AxisDirection.POSITIVE:Lnet/minecraft/util/EnumFacing$AxisDirection;
        //   847: if_acmpne       854
        //   850: iconst_1       
        //   851: goto            855
        //   854: iconst_0       
        //   855: i2d            
        //   856: dmul           
        //   857: dadd           
        //   858: dload           11
        //   860: getstatic       dev/nuker/pyro/fc.1:I
        //   863: ifeq            872
        //   866: ldc_w           357597257
        //   869: goto            875
        //   872: ldc_w           161529424
        //   875: ldc_w           66426994
        //   878: ixor           
        //   879: lookupswitch {
        //          173352482: 904
        //          379918395: 872
        //          default: 1314
        //        }
        //   904: goto            908
        //   907: athrow         
        //   908: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //   911: goto            915
        //   914: athrow         
        //   915: goto            1255
        //   918: new             Lnet/minecraft/util/math/Vec3d;
        //   921: dup            
        //   922: getstatic       dev/nuker/pyro/fc.1:I
        //   925: ifeq            934
        //   928: ldc_w           -98161155
        //   931: goto            937
        //   934: ldc_w           -1085966366
        //   937: ldc_w           758809163
        //   940: ixor           
        //   941: lookupswitch {
        //          -1837107799: 968
        //          -685985866: 934
        //          default: 1296
        //        }
        //   968: dload           7
        //   970: getstatic       dev/nuker/pyro/fc.1:I
        //   973: ifeq            982
        //   976: ldc_w           1192244561
        //   979: goto            985
        //   982: ldc_w           1915157853
        //   985: ldc_w           1177976116
        //   988: ixor           
        //   989: lookupswitch {
        //          19286117: 982
        //          873496681: 1016
        //          default: 1310
        //        }
        //  1016: dload           9
        //  1018: aload           5
        //  1020: getfield        net/minecraft/util/math/AxisAlignedBB.field_72339_c:D
        //  1023: aload           5
        //  1025: getfield        net/minecraft/util/math/AxisAlignedBB.field_72334_f:D
        //  1028: getstatic       dev/nuker/pyro/fc.c:I
        //  1031: ifge            1040
        //  1034: ldc_w           -1925665257
        //  1037: goto            1043
        //  1040: ldc_w           989591388
        //  1043: ldc_w           -2121299363
        //  1046: ixor           
        //  1047: lookupswitch {
        //          -1149993727: 1072
        //          213328970: 1040
        //          default: 1298
        //        }
        //  1072: aload           5
        //  1074: getfield        net/minecraft/util/math/AxisAlignedBB.field_72339_c:D
        //  1077: dsub           
        //  1078: aload_3        
        //  1079: goto            1083
        //  1082: athrow         
        //  1083: invokevirtual   net/minecraft/util/EnumFacing.func_176743_c:()Lnet/minecraft/util/EnumFacing$AxisDirection;
        //  1086: goto            1090
        //  1089: athrow         
        //  1090: getstatic       net/minecraft/util/EnumFacing$AxisDirection.POSITIVE:Lnet/minecraft/util/EnumFacing$AxisDirection;
        //  1093: if_acmpne       1100
        //  1096: iconst_1       
        //  1097: goto            1101
        //  1100: iconst_0       
        //  1101: i2d            
        //  1102: dmul           
        //  1103: dadd           
        //  1104: goto            1108
        //  1107: athrow         
        //  1108: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //  1111: goto            1115
        //  1114: athrow         
        //  1115: goto            1255
        //  1118: new             Ljava/lang/IllegalStateException;
        //  1121: dup            
        //  1122: new             Ljava/lang/StringBuilder;
        //  1125: dup            
        //  1126: goto            1130
        //  1129: athrow         
        //  1130: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1133: goto            1137
        //  1136: athrow         
        //  1137: ldc_w           "\u2952\u149d\u8073\ub1d0\uc44b\ue764\ub227\uec4f\udb7c\ue42c\uade1\u1e5a\ueb7e\uc7ba\u8cba\u83ff\u5785\u7d9c\ubf3f\ucd80\u2187\uc23a\u6095\u2f53\uda10\u3f42"
        //  1140: getstatic       dev/nuker/pyro/fc.1:I
        //  1143: ifeq            1152
        //  1146: ldc_w           -2062309763
        //  1149: goto            1155
        //  1152: ldc_w           -411399857
        //  1155: ldc_w           1803240105
        //  1158: ixor           
        //  1159: lookupswitch {
        //          -1946039322: 1184
        //          -295115564: 1152
        //          default: 1320
        //        }
        //  1184: goto            1188
        //  1187: athrow         
        //  1188: invokestatic    invokestatic   !!! ERROR
        //  1191: goto            1195
        //  1194: athrow         
        //  1195: goto            1199
        //  1198: athrow         
        //  1199: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1202: goto            1206
        //  1205: athrow         
        //  1206: aload_3        
        //  1207: goto            1211
        //  1210: athrow         
        //  1211: invokevirtual   net/minecraft/util/EnumFacing.func_176740_k:()Lnet/minecraft/util/EnumFacing$Axis;
        //  1214: goto            1218
        //  1217: athrow         
        //  1218: goto            1222
        //  1221: athrow         
        //  1222: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1225: goto            1229
        //  1228: athrow         
        //  1229: goto            1233
        //  1232: athrow         
        //  1233: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1236: goto            1240
        //  1239: athrow         
        //  1240: goto            1244
        //  1243: athrow         
        //  1244: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1247: goto            1251
        //  1250: athrow         
        //  1251: checkcast       Ljava/lang/Throwable;
        //  1254: athrow         
        //  1255: astore          6
        //  1257: new             Lnet/minecraft/util/math/Vec3d;
        //  1260: dup            
        //  1261: aload_1        
        //  1262: checkcast       Lnet/minecraft/util/math/Vec3i;
        //  1265: goto            1269
        //  1268: athrow         
        //  1269: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //  1272: goto            1276
        //  1275: athrow         
        //  1276: aload           6
        //  1278: goto            1282
        //  1281: athrow         
        //  1282: invokevirtual   net/minecraft/util/math/Vec3d.func_178787_e:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        //  1285: goto            1289
        //  1288: athrow         
        //  1289: dup            
        //  1290: pop            
        //  1291: areturn        
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
        //  1316: aconst_null    
        //  1317: athrow         
        //  1318: aconst_null    
        //  1319: athrow         
        //  1320: aconst_null    
        //  1321: athrow         
        //  1322: aconst_null    
        //  1323: athrow         
        //  1324: aconst_null    
        //  1325: athrow         
        //  1326: pop            
        //  1327: goto            24
        //  1330: pop            
        //  1331: aconst_null    
        //  1332: goto            1326
        //  1335: dup            
        //  1336: ifnull          1326
        //  1339: checkcast       Ljava/lang/Throwable;
        //  1342: athrow         
        //  1343: dup            
        //  1344: ifnull          1330
        //  1347: checkcast       Ljava/lang/Throwable;
        //  1350: athrow         
        //  1351: aconst_null    
        //  1352: athrow         
        //    StackMapTable: 00 A5 FF 00 03 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 07 00 F9 03 03 03 00 01 07 00 2A FF 00 04 00 04 07 00 03 07 00 49 07 00 9F 07 00 32 00 00 FF 00 0B 00 00 00 01 07 00 2A FF 00 03 00 04 07 00 03 07 00 49 07 00 9F 07 00 32 00 00 FF 00 11 00 04 07 00 03 07 00 49 07 00 9F 07 00 32 00 02 07 00 9F 07 00 49 FF 00 02 00 04 07 00 03 07 00 49 07 00 9F 07 00 32 00 03 07 00 9F 07 00 49 01 FF 00 1E 00 04 07 00 03 07 00 49 07 00 9F 07 00 32 00 02 07 00 9F 07 00 49 42 07 00 2A FF 00 00 00 04 07 00 03 07 00 49 07 00 9F 07 00 32 00 02 07 00 9F 07 00 49 45 07 00 2A 40 07 00 C8 FF 00 0F 00 05 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 00 01 07 00 C8 FF 00 02 00 05 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 00 02 07 00 C8 01 5D 07 00 C8 47 07 00 2A FF 00 00 00 05 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 00 03 07 00 C8 07 01 BE 07 00 49 47 07 00 2A 40 07 01 CA 4B 07 01 CA FF 00 02 00 05 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 00 02 07 01 CA 01 5E 07 01 CA FD 00 10 07 01 CA 05 42 01 1F FF 00 27 00 08 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 00 01 03 FF 00 02 00 08 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 00 02 03 01 5C 03 FF 00 12 00 08 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 00 03 03 03 07 01 CA FF 00 02 00 08 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 00 04 03 03 07 01 CA 01 FF 00 1D 00 08 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 00 03 03 03 07 01 CA FC 00 16 03 42 01 1D FF 00 12 00 09 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 00 02 03 07 01 CA FF 00 02 00 09 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 00 03 03 07 01 CA 01 FF 00 1D 00 09 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 00 02 03 07 01 CA FF 00 13 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 01 07 00 1D 40 07 00 32 45 07 00 2A 40 07 01 F5 47 07 01 F5 46 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 02 07 02 42 07 01 F5 45 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 02 07 02 42 01 1C FF 00 14 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 02 34 08 02 34 03 FF 00 02 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 04 08 02 34 08 02 34 03 01 FF 00 1F 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 02 34 08 02 34 03 4E 07 00 1D FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 05 08 02 34 08 02 34 03 03 07 00 32 45 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 05 08 02 34 08 02 34 03 03 07 02 01 FF 00 09 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 04 08 02 34 08 02 34 03 03 FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 05 08 02 34 08 02 34 03 03 01 FF 00 09 00 00 00 01 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 05 08 02 34 08 02 34 03 03 03 45 07 00 2A 40 07 00 F9 02 FF 00 0F 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 02 08 02 A3 08 02 A3 FF 00 02 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 02 A3 08 02 A3 01 FF 00 1D 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 02 08 02 A3 08 02 A3 FF 00 0D 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 02 A3 08 02 A3 03 FF 00 02 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 04 08 02 A3 08 02 A3 03 01 FF 00 1E 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 02 A3 08 02 A3 03 FF 00 1B 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 05 08 02 A3 08 02 A3 03 03 03 FF 00 02 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 06 08 02 A3 08 02 A3 03 03 03 01 FF 00 1C 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 05 08 02 A3 08 02 A3 03 03 03 43 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 06 08 02 A3 08 02 A3 03 03 03 07 00 32 45 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 06 08 02 A3 08 02 A3 03 03 03 07 02 01 FF 00 09 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 05 08 02 A3 08 02 A3 03 03 03 FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 06 08 02 A3 08 02 A3 03 03 03 01 FF 00 10 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 05 08 02 A3 08 02 A3 03 03 03 FF 00 02 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 06 08 02 A3 08 02 A3 03 03 03 01 FF 00 1C 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 05 08 02 A3 08 02 A3 03 03 03 42 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 05 08 02 A3 08 02 A3 03 03 03 45 07 00 2A 40 07 00 F9 02 FF 00 0F 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 02 08 03 96 08 03 96 FF 00 02 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 03 96 08 03 96 01 FF 00 1E 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 02 08 03 96 08 03 96 FF 00 0D 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 03 96 08 03 96 03 FF 00 02 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 04 08 03 96 08 03 96 03 01 FF 00 1E 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 03 96 08 03 96 03 FF 00 17 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 06 08 03 96 08 03 96 03 03 03 03 FF 00 02 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 07 08 03 96 08 03 96 03 03 03 03 01 FF 00 1C 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 06 08 03 96 08 03 96 03 03 03 03 49 07 00 7B FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 07 08 03 96 08 03 96 03 03 03 03 07 00 32 45 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 07 08 03 96 08 03 96 03 03 03 03 07 02 01 FF 00 09 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 06 08 03 96 08 03 96 03 03 03 03 FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 07 08 03 96 08 03 96 03 03 03 03 01 45 07 00 1D FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 05 08 03 96 08 03 96 03 03 03 45 07 00 2A 40 07 00 F9 02 FF 00 0A 00 00 00 01 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 04 08 04 5E 08 04 5E 08 04 62 08 04 62 45 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 04 5E 08 04 5E 07 02 1F FF 00 0E 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 04 08 04 5E 08 04 5E 07 02 1F 07 02 44 FF 00 02 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 05 08 04 5E 08 04 5E 07 02 1F 07 02 44 01 FF 00 1C 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 04 08 04 5E 08 04 5E 07 02 1F 07 02 44 FF 00 02 00 00 00 01 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 04 08 04 5E 08 04 5E 07 02 1F 07 02 44 45 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 04 08 04 5E 08 04 5E 07 02 1F 07 02 44 42 07 00 87 FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 04 08 04 5E 08 04 5E 07 02 1F 07 02 44 45 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 04 5E 08 04 5E 07 02 1F 43 07 00 85 FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 04 08 04 5E 08 04 5E 07 02 1F 07 00 32 45 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 04 08 04 5E 08 04 5E 07 02 1F 07 01 F5 42 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 04 08 04 5E 08 04 5E 07 02 1F 07 01 F5 45 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 04 5E 08 04 5E 07 02 1F 42 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 04 5E 08 04 5E 07 02 1F 45 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 04 5E 08 04 5E 07 02 44 42 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 04 5E 08 04 5E 07 02 44 45 07 00 2A 40 07 00 7B 43 07 00 F9 FF 00 0C 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 07 00 F9 03 03 03 00 01 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 07 00 F9 03 03 03 00 03 08 04 E9 08 04 E9 07 02 3A 45 07 00 2A 40 07 00 F9 44 07 00 2A FF 00 00 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 07 00 F9 03 03 03 00 02 07 00 F9 07 00 F9 45 07 00 2A 40 07 00 F9 FF 00 02 00 05 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 00 01 07 01 CA FF 00 01 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 02 34 08 02 34 03 FF 00 01 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 02 08 03 96 08 03 96 FF 00 01 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 06 08 03 96 08 03 96 03 03 03 03 FF 00 01 00 08 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 00 03 03 03 07 01 CA FF 00 01 00 04 07 00 03 07 00 49 07 00 9F 07 00 32 00 02 07 00 9F 07 00 49 FE 00 01 07 00 C8 07 01 CA 05 FF 00 01 00 09 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 00 02 03 07 01 CA FF 00 01 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 02 A3 08 02 A3 03 FF 00 01 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 03 08 03 96 08 03 96 03 FA 00 01 FF 00 01 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 05 08 02 A3 08 02 A3 03 03 03 FF 00 01 00 05 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 00 01 07 00 C8 FF 00 01 00 08 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 00 01 03 FF 00 01 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 04 08 04 5E 08 04 5E 07 02 1F 07 02 44 FF 00 01 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 02 08 02 A3 08 02 A3 FF 00 01 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 05 03 03 03 00 05 08 02 A3 08 02 A3 03 03 03 FF 00 01 00 04 07 00 03 07 00 49 07 00 9F 07 00 32 00 01 07 00 2A 43 05 44 07 00 2A 47 05 FF 00 07 00 0A 07 00 03 07 00 49 07 00 9F 07 00 32 07 00 C8 07 01 CA 07 00 F9 03 03 03 00 01 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1335   1343   Any
        //  1335   1343   1335   1343   Ljava/util/NoSuchElementException;
        //  1351   1353   3      8      Any
        //  79     86     86     87     Any
        //  79     86     79     80     Any
        //  79     86     79     80     Any
        //  79     86     86     87     Ljava/lang/UnsupportedOperationException;
        //  79     86     79     80     Any
        //  144    153    153    154    Any
        //  145    153    144    145    Ljava/util/ConcurrentModificationException;
        //  145    153    153    154    Ljava/lang/AssertionError;
        //  145    153    144    145    Any
        //  144    153    144    145    Ljava/util/NoSuchElementException;
        //  504    511    511    512    Any
        //  504    511    504    505    Ljava/lang/IndexOutOfBoundsException;
        //  505    511    3      8      Any
        //  505    511    504    505    Ljava/lang/NullPointerException;
        //  504    511    511    512    Ljava/lang/ArithmeticException;
        //  527    534    534    535    Any
        //  528    534    3      8      Any
        //  527    534    534    535    Ljava/lang/EnumConstantNotPresentException;
        //  527    534    527    528    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  527    534    527    528    Any
        //  635    642    642    643    Any
        //  635    642    3      8      Any
        //  636    642    3      8      Any
        //  635    642    635    636    Ljava/lang/IllegalStateException;
        //  636    642    635    636    Ljava/lang/EnumConstantNotPresentException;
        //  665    671    671    672    Any
        //  665    671    3      8      Any
        //  665    671    3      8      Ljava/lang/NullPointerException;
        //  665    671    3      8      Ljava/lang/NullPointerException;
        //  665    671    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  836    843    843    844    Any
        //  836    843    836    837    Any
        //  837    843    3      8      Any
        //  836    843    836    837    Ljava/lang/AssertionError;
        //  837    843    836    837    Ljava/lang/IllegalArgumentException;
        //  907    914    914    915    Any
        //  907    914    907    908    Any
        //  908    914    914    915    Ljava/lang/IllegalArgumentException;
        //  908    914    907    908    Any
        //  907    914    907    908    Ljava/lang/IndexOutOfBoundsException;
        //  1082   1089   1089   1090   Any
        //  1082   1089   3      8      Any
        //  1083   1089   1089   1090   Any
        //  1082   1089   1089   1090   Ljava/lang/RuntimeException;
        //  1082   1089   1082   1083   Ljava/lang/IllegalStateException;
        //  1107   1114   1114   1115   Any
        //  1108   1114   1107   1108   Ljava/lang/UnsupportedOperationException;
        //  1107   1114   3      8      Ljava/lang/IllegalArgumentException;
        //  1108   1114   1107   1108   Ljava/lang/IndexOutOfBoundsException;
        //  1107   1114   1107   1108   Ljava/lang/ArithmeticException;
        //  1130   1136   1136   1137   Any
        //  1130   1136   1136   1137   Any
        //  1130   1136   1136   1137   Any
        //  1130   1136   1136   1137   Any
        //  1130   1136   3      8      Any
        //  1188   1194   1194   1195   Any
        //  1188   1194   3      8      Any
        //  1188   1194   1194   1195   Ljava/lang/NullPointerException;
        //  1188   1194   1194   1195   Ljava/lang/UnsupportedOperationException;
        //  1188   1194   3      8      Any
        //  1198   1205   1205   1206   Any
        //  1198   1205   1198   1199   Ljava/lang/NullPointerException;
        //  1198   1205   1205   1206   Any
        //  1198   1205   1205   1206   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1199   1205   1205   1206   Ljava/lang/UnsupportedOperationException;
        //  1210   1217   1217   1218   Any
        //  1211   1217   3      8      Ljava/util/ConcurrentModificationException;
        //  1211   1217   1210   1211   Ljava/lang/IllegalArgumentException;
        //  1211   1217   1217   1218   Ljava/lang/IndexOutOfBoundsException;
        //  1210   1217   1217   1218   Ljava/lang/IndexOutOfBoundsException;
        //  1221   1228   1228   1229   Any
        //  1221   1228   3      8      Ljava/lang/RuntimeException;
        //  1222   1228   1228   1229   Any
        //  1222   1228   1221   1222   Ljava/lang/NullPointerException;
        //  1222   1228   1221   1222   Any
        //  1232   1239   1239   1240   Any
        //  1232   1239   1232   1233   Any
        //  1232   1239   3      8      Ljava/lang/NegativeArraySizeException;
        //  1233   1239   1239   1240   Ljava/lang/NegativeArraySizeException;
        //  1232   1239   3      8      Any
        //  1243   1250   1250   1251   Any
        //  1243   1250   1243   1244   Any
        //  1244   1250   3      8      Any
        //  1243   1250   1250   1251   Ljava/util/ConcurrentModificationException;
        //  1243   1250   1250   1251   Ljava/util/NoSuchElementException;
        //  1268   1275   1275   1276   Any
        //  1269   1275   1275   1276   Ljava/lang/NumberFormatException;
        //  1268   1275   1268   1269   Any
        //  1269   1275   1268   1269   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1269   1275   1275   1276   Ljava/lang/NegativeArraySizeException;
        //  1281   1288   1288   1289   Any
        //  1281   1288   3      8      Any
        //  1282   1288   1281   1282   Any
        //  1282   1288   1288   1289   Any
        //  1281   1288   3      8      Any
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
    public Vec2f c(@NotNull final Vec3d p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          385
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            377
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            369
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_1        
        //    27: getstatic       dev/nuker/pyro/fc.1:I
        //    30: ifeq            39
        //    33: ldc_w           1164984470
        //    36: goto            42
        //    39: ldc_w           442744714
        //    42: ldc_w           132242650
        //    45: ixor           
        //    46: lookupswitch {
        //          -1233809327: 39
        //          1116838988: 352
        //          default: 72
        //        }
        //    72: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //    75: dstore_2       
        //    76: aload_1        
        //    77: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //    80: dstore          4
        //    82: aload_1        
        //    83: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //    86: getstatic       dev/nuker/pyro/fc.0:I
        //    89: ifeq            98
        //    92: ldc_w           -1273033915
        //    95: goto            101
        //    98: ldc_w           -299353897
        //   101: ldc_w           2068436359
        //   104: ixor           
        //   105: lookupswitch {
        //          -816390462: 356
        //          405885421: 98
        //          default: 132
        //        }
        //   132: dstore          6
        //   134: dload_2        
        //   135: dload_2        
        //   136: dmul           
        //   137: dload           6
        //   139: dload           6
        //   141: dmul           
        //   142: dadd           
        //   143: goto            147
        //   146: athrow         
        //   147: invokestatic    java/lang/Math.sqrt:(D)D
        //   150: goto            154
        //   153: athrow         
        //   154: dstore          8
        //   156: dload           6
        //   158: dload_2        
        //   159: goto            163
        //   162: athrow         
        //   163: invokestatic    java/lang/Math.atan2:(DD)D
        //   166: goto            170
        //   169: athrow         
        //   170: getstatic       dev/nuker/pyro/fc.1:I
        //   173: ifeq            182
        //   176: ldc_w           -1987078421
        //   179: goto            185
        //   182: ldc_w           704370566
        //   185: ldc_w           -324656368
        //   188: ixor           
        //   189: lookupswitch {
        //          -983698282: 216
        //          1697232379: 182
        //          default: 358
        //        }
        //   216: goto            220
        //   219: athrow         
        //   220: invokestatic    java/lang/Math.toDegrees:(D)D
        //   223: goto            227
        //   226: athrow         
        //   227: d2f            
        //   228: ldc_w           90.0
        //   231: fsub           
        //   232: fstore          10
        //   234: dload           4
        //   236: dload           8
        //   238: goto            242
        //   241: athrow         
        //   242: invokestatic    java/lang/Math.atan2:(DD)D
        //   245: goto            249
        //   248: athrow         
        //   249: goto            253
        //   252: athrow         
        //   253: invokestatic    java/lang/Math.toDegrees:(D)D
        //   256: goto            260
        //   259: athrow         
        //   260: dneg           
        //   261: d2f            
        //   262: fstore          11
        //   264: new             Lnet/minecraft/util/math/Vec2f;
        //   267: dup            
        //   268: fload           10
        //   270: getstatic       dev/nuker/pyro/fc.1:I
        //   273: ifeq            282
        //   276: ldc_w           -1582029616
        //   279: goto            285
        //   282: ldc_w           184801192
        //   285: ldc_w           1907046089
        //   288: ixor           
        //   289: lookupswitch {
        //          -1631067973: 282
        //          -803270119: 354
        //          default: 316
        //        }
        //   316: goto            320
        //   319: athrow         
        //   320: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //   323: goto            327
        //   326: athrow         
        //   327: fload           11
        //   329: goto            333
        //   332: athrow         
        //   333: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //   336: goto            340
        //   339: athrow         
        //   340: goto            344
        //   343: athrow         
        //   344: invokespecial   net/minecraft/util/math/Vec2f.<init>:(FF)V
        //   347: goto            351
        //   350: athrow         
        //   351: areturn        
        //   352: aconst_null    
        //   353: athrow         
        //   354: aconst_null    
        //   355: athrow         
        //   356: aconst_null    
        //   357: athrow         
        //   358: aconst_null    
        //   359: athrow         
        //   360: pop            
        //   361: goto            24
        //   364: pop            
        //   365: aconst_null    
        //   366: goto            360
        //   369: dup            
        //   370: ifnull          360
        //   373: checkcast       Ljava/lang/Throwable;
        //   376: athrow         
        //   377: dup            
        //   378: ifnull          364
        //   381: checkcast       Ljava/lang/Throwable;
        //   384: athrow         
        //   385: aconst_null    
        //   386: athrow         
        //    StackMapTable: 00 39 FF 00 03 00 05 07 00 03 07 00 F9 03 03 03 00 01 07 00 2A F8 00 04 FF 00 0B 00 00 00 01 07 00 2A FD 00 03 07 00 03 07 00 F9 4E 07 00 F9 FF 00 02 00 02 07 00 03 07 00 F9 00 02 07 00 F9 01 5D 07 00 F9 FF 00 19 00 04 07 00 03 07 00 F9 03 03 00 01 03 FF 00 02 00 04 07 00 03 07 00 F9 03 03 00 02 03 01 5E 03 FF 00 0D 00 05 07 00 03 07 00 F9 03 03 03 00 01 07 00 83 40 03 45 07 00 2A 40 03 FF 00 07 00 00 00 01 07 00 2A FF 00 00 00 06 07 00 03 07 00 F9 03 03 03 03 00 02 03 03 45 07 00 2A 40 03 4B 03 FF 00 02 00 06 07 00 03 07 00 F9 03 03 03 03 00 02 03 01 5E 03 42 07 00 2A 40 03 45 07 00 2A 40 03 FF 00 0D 00 07 07 00 03 07 00 F9 03 03 03 03 02 00 01 07 00 2A FF 00 00 00 07 07 00 03 07 00 F9 03 03 03 03 02 00 02 03 03 45 07 00 2A 40 03 42 07 00 2A 40 03 45 07 00 2A 40 03 FF 00 15 00 08 07 00 03 07 00 F9 03 03 03 03 02 02 00 03 08 01 08 08 01 08 02 FF 00 02 00 08 07 00 03 07 00 F9 03 03 03 03 02 02 00 04 08 01 08 08 01 08 02 01 FF 00 1E 00 08 07 00 03 07 00 F9 03 03 03 03 02 02 00 03 08 01 08 08 01 08 02 42 07 00 79 FF 00 00 00 08 07 00 03 07 00 F9 03 03 03 03 02 02 00 03 08 01 08 08 01 08 02 45 07 00 2A FF 00 00 00 08 07 00 03 07 00 F9 03 03 03 03 02 02 00 03 08 01 08 08 01 08 02 44 07 00 2A FF 00 00 00 08 07 00 03 07 00 F9 03 03 03 03 02 02 00 04 08 01 08 08 01 08 02 02 45 07 00 2A FF 00 00 00 08 07 00 03 07 00 F9 03 03 03 03 02 02 00 04 08 01 08 08 01 08 02 02 42 07 00 19 FF 00 00 00 08 07 00 03 07 00 F9 03 03 03 03 02 02 00 04 08 01 08 08 01 08 02 02 45 07 00 2A 40 07 01 64 FF 00 00 00 02 07 00 03 07 00 F9 00 01 07 00 F9 FF 00 01 00 08 07 00 03 07 00 F9 03 03 03 03 02 02 00 03 08 01 08 08 01 08 02 FF 00 01 00 04 07 00 03 07 00 F9 03 03 00 01 03 FF 00 01 00 06 07 00 03 07 00 F9 03 03 03 03 00 01 03 FF 00 01 00 02 07 00 03 07 00 F9 00 01 07 00 2A 43 05 44 07 00 2A 47 05 FF 00 07 00 05 07 00 03 07 00 F9 03 03 03 00 01 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     369    377    Ljava/lang/StringIndexOutOfBoundsException;
        //  369    377    369    377    Any
        //  385    387    3      8      Any
        //  146    153    153    154    Any
        //  146    153    3      8      Ljava/util/ConcurrentModificationException;
        //  146    153    153    154    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  147    153    146    147    Ljava/util/ConcurrentModificationException;
        //  146    153    3      8      Any
        //  163    169    169    170    Any
        //  163    169    169    170    Any
        //  163    169    169    170    Ljava/lang/StringIndexOutOfBoundsException;
        //  163    169    3      8      Any
        //  163    169    3      8      Any
        //  219    226    226    227    Any
        //  220    226    219    220    Any
        //  220    226    226    227    Any
        //  220    226    226    227    Any
        //  219    226    3      8      Any
        //  241    248    248    249    Any
        //  241    248    241    242    Ljava/lang/RuntimeException;
        //  241    248    248    249    Ljava/lang/ClassCastException;
        //  241    248    248    249    Any
        //  241    248    241    242    Any
        //  252    259    259    260    Any
        //  252    259    252    253    Ljava/lang/NumberFormatException;
        //  252    259    252    253    Any
        //  252    259    259    260    Ljava/lang/AssertionError;
        //  252    259    252    253    Any
        //  319    326    326    327    Any
        //  319    326    326    327    Ljava/lang/NullPointerException;
        //  319    326    326    327    Any
        //  320    326    319    320    Ljava/lang/NegativeArraySizeException;
        //  320    326    326    327    Any
        //  332    339    339    340    Any
        //  333    339    339    340    Ljava/lang/IllegalArgumentException;
        //  332    339    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  332    339    3      8      Any
        //  333    339    332    333    Any
        //  343    350    350    351    Any
        //  344    350    343    344    Ljava/lang/NumberFormatException;
        //  343    350    3      8      Any
        //  343    350    3      8      Ljava/lang/NumberFormatException;
        //  344    350    350    351    Ljava/lang/IllegalArgumentException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:733)
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
    
    public boolean c(@Nullable final Block block) {
        return fbS.3S(this, 1457819637, block);
    }
    
    @Nullable
    public EnumFacing 2(@Nullable final BlockPos p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          582
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            574
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            566
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            36
        //    30: ldc_w           -482241966
        //    33: goto            39
        //    36: ldc_w           -974438716
        //    39: ldc_w           23705938
        //    42: ixor           
        //    43: lookupswitch {
        //          -1753014407: 36
        //          -500684032: 545
        //          default: 68
        //        }
        //    68: getstatic       net/minecraft/util/EnumFacing.field_82609_l:[Lnet/minecraft/util/EnumFacing;
        //    71: getstatic       dev/nuker/pyro/fc.c:I
        //    74: ifge            83
        //    77: ldc_w           -1030172907
        //    80: goto            86
        //    83: ldc_w           1692023867
        //    86: ldc_w           1365627637
        //    89: ixor           
        //    90: lookupswitch {
        //          -1812128288: 83
        //          901770958: 116
        //          default: 547
        //        }
        //   116: astore          4
        //   118: aload           4
        //   120: arraylength    
        //   121: istore          5
        //   123: iconst_0       
        //   124: istore_3       
        //   125: iload_3        
        //   126: iload           5
        //   128: if_icmpge       539
        //   131: getstatic       dev/nuker/pyro/fc.1:I
        //   134: ifeq            143
        //   137: ldc_w           1466262637
        //   140: goto            146
        //   143: ldc_w           322813595
        //   146: ldc_w           1470330946
        //   149: ixor           
        //   150: lookupswitch {
        //          12983343: 143
        //          1151256281: 176
        //          default: 553
        //        }
        //   176: aload           4
        //   178: iload_3        
        //   179: aaload         
        //   180: astore_2       
        //   181: aload_0        
        //   182: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   185: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   188: new             Lnet/minecraft/util/math/Vec3d;
        //   191: dup            
        //   192: getstatic       dev/nuker/pyro/fc.1:I
        //   195: ifeq            204
        //   198: ldc_w           254118013
        //   201: goto            207
        //   204: ldc_w           1802817042
        //   207: ldc_w           -928205486
        //   210: ixor           
        //   211: lookupswitch {
        //          -947307217: 543
        //          -605906561: 204
        //          default: 236
        //        }
        //   236: aload_0        
        //   237: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   240: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   243: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   246: aload_0        
        //   247: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   250: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   253: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   256: aload_0        
        //   257: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   260: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   263: goto            267
        //   266: athrow         
        //   267: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70047_e:()F
        //   270: goto            274
        //   273: athrow         
        //   274: f2d            
        //   275: dadd           
        //   276: aload_0        
        //   277: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   280: getstatic       dev/nuker/pyro/fc.0:I
        //   283: ifeq            292
        //   286: ldc_w           115568428
        //   289: goto            295
        //   292: ldc_w           1570456240
        //   295: ldc_w           -783473292
        //   298: ixor           
        //   299: lookupswitch {
        //          -676443560: 551
        //          -629109648: 292
        //          default: 324
        //        }
        //   324: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   327: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   330: goto            334
        //   333: athrow         
        //   334: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //   337: goto            341
        //   340: athrow         
        //   341: aload_0        
        //   342: aload_1        
        //   343: aload_0        
        //   344: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   347: getstatic       dev/nuker/pyro/fc.0:I
        //   350: ifeq            359
        //   353: ldc_w           -1564812576
        //   356: goto            362
        //   359: ldc_w           -1450424121
        //   362: ldc_w           286736286
        //   365: ixor           
        //   366: lookupswitch {
        //          -1280449154: 359
        //          -1197770919: 392
        //          default: 549
        //        }
        //   392: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   395: dup            
        //   396: pop            
        //   397: checkcast       Lnet/minecraft/world/World;
        //   400: getstatic       dev/nuker/pyro/fc.c:I
        //   403: ifge            412
        //   406: ldc_w           -1894131970
        //   409: goto            415
        //   412: ldc_w           -1896175717
        //   415: ldc_w           -59792933
        //   418: ixor           
        //   419: lookupswitch {
        //          1922369088: 444
        //          1937143589: 412
        //          default: 541
        //        }
        //   444: aload_2        
        //   445: dup            
        //   446: pop            
        //   447: goto            451
        //   450: athrow         
        //   451: invokevirtual   dev/nuker/pyro/fbg.c:(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/Vec3d;
        //   454: goto            458
        //   457: athrow         
        //   458: iconst_0       
        //   459: iconst_1       
        //   460: iconst_0       
        //   461: getstatic       dev/nuker/pyro/fc.c:I
        //   464: ifge            473
        //   467: ldc_w           -120850779
        //   470: goto            476
        //   473: ldc_w           -1103254959
        //   476: ldc_w           722736357
        //   479: ixor           
        //   480: lookupswitch {
        //          -1501005264: 473
        //          -740302272: 555
        //          default: 508
        //        }
        //   508: goto            512
        //   511: athrow         
        //   512: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_147447_a:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;ZZZ)Lnet/minecraft/util/math/RayTraceResult;
        //   515: goto            519
        //   518: athrow         
        //   519: dup            
        //   520: ifnull          526
        //   523: goto            529
        //   526: pop            
        //   527: aload_2        
        //   528: areturn        
        //   529: dup            
        //   530: pop            
        //   531: astore          6
        //   533: iinc            3, 1
        //   536: goto            125
        //   539: aconst_null    
        //   540: areturn        
        //   541: aconst_null    
        //   542: athrow         
        //   543: aconst_null    
        //   544: athrow         
        //   545: aconst_null    
        //   546: athrow         
        //   547: aconst_null    
        //   548: athrow         
        //   549: aconst_null    
        //   550: athrow         
        //   551: aconst_null    
        //   552: athrow         
        //   553: aconst_null    
        //   554: athrow         
        //   555: aconst_null    
        //   556: athrow         
        //   557: pop            
        //   558: goto            24
        //   561: pop            
        //   562: aconst_null    
        //   563: goto            557
        //   566: dup            
        //   567: ifnull          557
        //   570: checkcast       Ljava/lang/Throwable;
        //   573: athrow         
        //   574: dup            
        //   575: ifnull          561
        //   578: checkcast       Ljava/lang/Throwable;
        //   581: athrow         
        //   582: aconst_null    
        //   583: athrow         
        //    StackMapTable: 00 3D FF 00 03 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 01 07 00 2A FF 00 04 00 02 07 00 03 07 00 49 00 00 FF 00 0B 00 00 00 01 07 00 2A FD 00 03 07 00 03 07 00 49 0B 42 01 1C 4E 07 00 69 FF 00 02 00 02 07 00 03 07 00 49 00 02 07 00 69 01 5D 07 00 69 FF 00 08 00 06 07 00 03 07 00 49 00 01 07 00 69 01 00 00 11 42 01 1D FF 00 1B 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 03 07 00 C2 08 00 BC 08 00 BC FF 00 02 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 04 07 00 C2 08 00 BC 08 00 BC 01 FF 00 1C 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 03 07 00 C2 08 00 BC 08 00 BC 5D 07 00 81 FF 00 00 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 06 07 00 C2 08 00 BC 08 00 BC 03 03 07 00 D5 45 07 00 2A FF 00 00 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 06 07 00 C2 08 00 BC 08 00 BC 03 03 02 FF 00 11 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 06 07 00 C2 08 00 BC 08 00 BC 03 03 07 00 74 FF 00 02 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 07 07 00 C2 08 00 BC 08 00 BC 03 03 07 00 74 01 FF 00 1C 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 06 07 00 C2 08 00 BC 08 00 BC 03 03 07 00 74 48 07 00 2A FF 00 00 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 06 07 00 C2 08 00 BC 08 00 BC 03 03 03 45 07 00 2A FF 00 00 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 02 07 00 C2 07 00 F9 FF 00 11 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 05 07 00 C2 07 00 F9 07 00 03 07 00 49 07 00 74 FF 00 02 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 06 07 00 C2 07 00 F9 07 00 03 07 00 49 07 00 74 01 FF 00 1D 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 05 07 00 C2 07 00 F9 07 00 03 07 00 49 07 00 74 FF 00 13 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 05 07 00 C2 07 00 F9 07 00 03 07 00 49 07 00 9F FF 00 02 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 06 07 00 C2 07 00 F9 07 00 03 07 00 49 07 00 9F 01 FF 00 1C 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 05 07 00 C2 07 00 F9 07 00 03 07 00 49 07 00 9F 45 07 00 2A FF 00 00 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 06 07 00 C2 07 00 F9 07 00 03 07 00 49 07 00 9F 07 00 32 45 07 00 2A FF 00 00 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 03 07 00 C2 07 00 F9 07 00 F9 FF 00 0E 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 06 07 00 C2 07 00 F9 07 00 F9 01 01 01 FF 00 02 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 07 07 00 C2 07 00 F9 07 00 F9 01 01 01 01 FF 00 1F 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 06 07 00 C2 07 00 F9 07 00 F9 01 01 01 42 07 00 7D FF 00 00 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 06 07 00 C2 07 00 F9 07 00 F9 01 01 01 45 07 00 2A 40 07 02 85 46 07 02 85 42 07 02 85 FF 00 09 00 06 07 00 03 07 00 49 00 01 07 00 69 01 00 00 FF 00 01 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 05 07 00 C2 07 00 F9 07 00 03 07 00 49 07 00 9F FF 00 01 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 03 07 00 C2 08 00 BC 08 00 BC FF 00 01 00 02 07 00 03 07 00 49 00 00 41 07 00 69 FF 00 01 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 05 07 00 C2 07 00 F9 07 00 03 07 00 49 07 00 74 FF 00 01 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 06 07 00 C2 08 00 BC 08 00 BC 03 03 07 00 74 FF 00 01 00 06 07 00 03 07 00 49 00 01 07 00 69 01 00 00 FF 00 01 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 06 07 00 C2 07 00 F9 07 00 F9 01 01 01 FF 00 01 00 02 07 00 03 07 00 49 00 01 07 00 1D 43 05 44 07 00 1D 47 05 FF 00 07 00 06 07 00 03 07 00 49 07 00 32 01 07 00 69 01 00 01 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     566    574    Ljava/util/NoSuchElementException;
        //  566    574    566    574    Ljava/lang/NegativeArraySizeException;
        //  582    584    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  266    273    273    274    Any
        //  266    273    266    267    Ljava/lang/EnumConstantNotPresentException;
        //  266    273    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  266    273    3      8      Any
        //  267    273    273    274    Ljava/lang/StringIndexOutOfBoundsException;
        //  333    340    340    341    Any
        //  334    340    333    334    Ljava/lang/ArithmeticException;
        //  334    340    333    334    Ljava/lang/UnsupportedOperationException;
        //  333    340    340    341    Ljava/lang/IllegalStateException;
        //  334    340    333    334    Any
        //  450    457    457    458    Any
        //  450    457    450    451    Any
        //  450    457    3      8      Any
        //  451    457    457    458    Any
        //  451    457    457    458    Ljava/lang/ArithmeticException;
        //  511    518    518    519    Any
        //  512    518    3      8      Ljava/lang/ArithmeticException;
        //  512    518    3      8      Any
        //  511    518    518    519    Any
        //  512    518    511    512    Ljava/util/NoSuchElementException;
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
    public Vec3d c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          211
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            203
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            195
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lnet/minecraft/util/math/Vec3d;
        //    27: dup            
        //    28: aload_0        
        //    29: getstatic       dev/nuker/pyro/fc.c:I
        //    32: ifge            41
        //    35: ldc_w           1749385566
        //    38: goto            44
        //    41: ldc_w           1515285439
        //    44: ldc_w           -1734193971
        //    47: ixor           
        //    48: lookupswitch {
        //          -1024252046: 76
        //          -253244013: 41
        //          default: 184
        //        }
        //    76: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //    79: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    82: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //    85: aload_0        
        //    86: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //    89: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    92: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //    95: getstatic       dev/nuker/pyro/fc.0:I
        //    98: ifeq            107
        //   101: ldc_w           660092681
        //   104: goto            110
        //   107: ldc_w           2077028300
        //   110: ldc_w           -1171711216
        //   113: ixor           
        //   114: lookupswitch {
        //          -1653527527: 182
        //          1563795567: 107
        //          default: 140
        //        }
        //   140: aload_0        
        //   141: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   144: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   147: goto            151
        //   150: athrow         
        //   151: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70047_e:()F
        //   154: goto            158
        //   157: athrow         
        //   158: f2d            
        //   159: dadd           
        //   160: aload_0        
        //   161: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   164: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   167: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   170: goto            174
        //   173: athrow         
        //   174: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //   177: goto            181
        //   180: athrow         
        //   181: areturn        
        //   182: aconst_null    
        //   183: athrow         
        //   184: aconst_null    
        //   185: athrow         
        //   186: pop            
        //   187: goto            24
        //   190: pop            
        //   191: aconst_null    
        //   192: goto            186
        //   195: dup            
        //   196: ifnull          186
        //   199: checkcast       Ljava/lang/Throwable;
        //   202: athrow         
        //   203: dup            
        //   204: ifnull          190
        //   207: checkcast       Ljava/lang/Throwable;
        //   210: athrow         
        //   211: aconst_null    
        //   212: athrow         
        //    StackMapTable: 00 19 43 07 00 1D 04 FF 00 0B 00 00 00 01 07 00 2A FC 00 03 07 00 03 FF 00 10 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 FF 00 02 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 03 01 FF 00 1F 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 FF 00 1E 00 01 07 00 03 00 04 08 00 18 08 00 18 03 03 FF 00 02 00 01 07 00 03 00 05 08 00 18 08 00 18 03 03 01 FF 00 1D 00 01 07 00 03 00 04 08 00 18 08 00 18 03 03 49 07 00 2A FF 00 00 00 01 07 00 03 00 05 08 00 18 08 00 18 03 03 07 00 D5 45 07 00 2A FF 00 00 00 01 07 00 03 00 05 08 00 18 08 00 18 03 03 02 FF 00 0E 00 00 00 01 07 00 2A FF 00 00 00 01 07 00 03 00 05 08 00 18 08 00 18 03 03 03 45 07 00 2A 40 07 00 F9 FF 00 00 00 01 07 00 03 00 04 08 00 18 08 00 18 03 03 FF 00 01 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 41 07 00 2A 43 05 44 07 00 2A 47 05 47 07 00 1D
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     195    203    Any
        //  195    203    195    203    Any
        //  211    213    3      8      Ljava/lang/UnsupportedOperationException;
        //  150    157    157    158    Any
        //  150    157    150    151    Any
        //  150    157    157    158    Any
        //  150    157    150    151    Ljava/lang/IllegalStateException;
        //  151    157    150    151    Any
        //  174    180    180    181    Any
        //  174    180    3      8      Ljava/lang/IllegalStateException;
        //  174    180    180    181    Any
        //  174    180    180    181    Ljava/lang/IllegalArgumentException;
        //  174    180    180    181    Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:586)
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
    
    public void 0(@NotNull final Vec2f p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          251
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            243
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            235
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/fc.c:I
        //    29: ifge            38
        //    32: ldc_w           -187504284
        //    35: goto            41
        //    38: ldc_w           -1306442298
        //    41: ldc_w           63119701
        //    44: ixor           
        //    45: lookupswitch {
        //          -1310563181: 72
        //          -149829583: 38
        //          default: 224
        //        }
        //    72: aload_0        
        //    73: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //    76: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    79: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //    82: new             Lnet/minecraft/network/play/client/CPacketPlayer$Rotation;
        //    85: dup            
        //    86: getstatic       dev/nuker/pyro/fc.0:I
        //    89: ifeq            98
        //    92: ldc_w           -824875081
        //    95: goto            101
        //    98: ldc_w           -1523922411
        //   101: ldc_w           -1366505405
        //   104: ixor           
        //   105: lookupswitch {
        //          1616490484: 222
        //          1623944202: 98
        //          default: 132
        //        }
        //   132: aload_1        
        //   133: getfield        net/minecraft/util/math/Vec2f.field_189982_i:F
        //   136: aload_1        
        //   137: getfield        net/minecraft/util/math/Vec2f.field_189983_j:F
        //   140: aload_0        
        //   141: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   144: getstatic       dev/nuker/pyro/fc.c:I
        //   147: ifge            156
        //   150: ldc_w           -1880464647
        //   153: goto            159
        //   156: ldc_w           -65412955
        //   159: ldc_w           354570102
        //   162: ixor           
        //   163: lookupswitch {
        //          -1698157169: 220
        //          805021176: 156
        //          default: 188
        //        }
        //   188: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   191: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70122_E:Z
        //   194: goto            198
        //   197: athrow         
        //   198: invokespecial   net/minecraft/network/play/client/CPacketPlayer$Rotation.<init>:(FFZ)V
        //   201: goto            205
        //   204: athrow         
        //   205: checkcast       Lnet/minecraft/network/Packet;
        //   208: goto            212
        //   211: athrow         
        //   212: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   215: goto            219
        //   218: athrow         
        //   219: return         
        //   220: aconst_null    
        //   221: athrow         
        //   222: aconst_null    
        //   223: athrow         
        //   224: aconst_null    
        //   225: athrow         
        //   226: pop            
        //   227: goto            24
        //   230: pop            
        //   231: aconst_null    
        //   232: goto            226
        //   235: dup            
        //   236: ifnull          226
        //   239: checkcast       Ljava/lang/Throwable;
        //   242: athrow         
        //   243: dup            
        //   244: ifnull          230
        //   247: checkcast       Ljava/lang/Throwable;
        //   250: athrow         
        //   251: aconst_null    
        //   252: athrow         
        //    StackMapTable: 00 1D 43 07 00 2A 04 FF 00 0B 00 00 00 01 07 00 2A FE 00 03 07 00 03 07 01 64 01 0D 42 01 1E FF 00 19 00 03 07 00 03 07 01 64 01 00 03 07 00 F0 08 00 52 08 00 52 FF 00 02 00 03 07 00 03 07 01 64 01 00 04 07 00 F0 08 00 52 08 00 52 01 FF 00 1E 00 03 07 00 03 07 01 64 01 00 03 07 00 F0 08 00 52 08 00 52 FF 00 17 00 03 07 00 03 07 01 64 01 00 06 07 00 F0 08 00 52 08 00 52 02 02 07 00 74 FF 00 02 00 03 07 00 03 07 01 64 01 00 07 07 00 F0 08 00 52 08 00 52 02 02 07 00 74 01 FF 00 1C 00 03 07 00 03 07 01 64 01 00 06 07 00 F0 08 00 52 08 00 52 02 02 07 00 74 48 07 00 2A FF 00 00 00 03 07 00 03 07 01 64 01 00 06 07 00 F0 08 00 52 08 00 52 02 02 01 45 07 00 2A FF 00 00 00 03 07 00 03 07 01 64 01 00 02 07 00 F0 07 02 90 FF 00 05 00 00 00 01 07 00 2A FF 00 00 00 03 07 00 03 07 01 64 01 00 02 07 00 F0 07 00 EE 45 07 00 2A 00 FF 00 00 00 03 07 00 03 07 01 64 01 00 06 07 00 F0 08 00 52 08 00 52 02 02 07 00 74 FF 00 01 00 03 07 00 03 07 01 64 01 00 03 07 00 F0 08 00 52 08 00 52 01 41 07 00 2A 43 05 44 07 00 2A 47 05 47 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  8      20     235    243    Any
        //  235    243    235    243    Any
        //  251    253    3      8      Ljava/util/NoSuchElementException;
        //  197    204    204    205    Any
        //  197    204    3      8      Any
        //  198    204    204    205    Any
        //  197    204    3      8      Ljava/lang/ArithmeticException;
        //  198    204    197    198    Any
        //  212    218    218    219    Any
        //  212    218    3      8      Ljava/lang/AssertionError;
        //  212    218    218    219    Ljava/lang/NullPointerException;
        //  212    218    3      8      Any
        //  212    218    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 70 out of bounds for length 70
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
    
    public static void c(final fbg fbg) {
        fbS.2a(null, 1342956464, fbg);
    }
    
    @NotNull
    public Vec2f c(@NotNull final Vec3d p0, @NotNull final Vec3d p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1105
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1097
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1089
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_2        
        //    27: pop            
        //    28: aload_2        
        //    29: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //    32: aload_1        
        //    33: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //    36: dsub           
        //    37: dstore_3       
        //    38: aload_2        
        //    39: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //    42: getstatic       dev/nuker/pyro/fc.c:I
        //    45: ifge            54
        //    48: ldc_w           1552225381
        //    51: goto            57
        //    54: ldc_w           1603601
        //    57: ldc_w           -688198415
        //    60: ixor           
        //    61: lookupswitch {
        //          -1971324780: 54
        //          -689793824: 88
        //          default: 1076
        //        }
        //    88: aload_1        
        //    89: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //    92: dsub           
        //    93: dstore          5
        //    95: getstatic       dev/nuker/pyro/fc.0:I
        //    98: ifeq            107
        //   101: ldc_w           -2041736473
        //   104: goto            110
        //   107: ldc_w           2042644823
        //   110: ldc_w           -1830856472
        //   113: ixor           
        //   114: lookupswitch {
        //          -350285377: 140
        //          345164303: 107
        //          default: 1070
        //        }
        //   140: aload_2        
        //   141: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   144: aload_1        
        //   145: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   148: dsub           
        //   149: dstore          7
        //   151: getstatic       dev/nuker/pyro/fc.1:I
        //   154: ifeq            163
        //   157: ldc_w           1081258124
        //   160: goto            166
        //   163: ldc_w           708157713
        //   166: ldc_w           -1408353827
        //   169: ixor           
        //   170: lookupswitch {
        //          -2042914612: 196
        //          -327382703: 163
        //          default: 1064
        //        }
        //   196: dload_3        
        //   197: getstatic       dev/nuker/pyro/fc.0:I
        //   200: ifeq            209
        //   203: ldc_w           -1450579329
        //   206: goto            212
        //   209: ldc_w           -1909135880
        //   212: ldc_w           998728089
        //   215: ixor           
        //   216: lookupswitch {
        //          -1844540442: 209
        //          -1246526367: 244
        //          default: 1078
        //        }
        //   244: dload_3        
        //   245: dmul           
        //   246: getstatic       dev/nuker/pyro/fc.c:I
        //   249: ifge            258
        //   252: ldc_w           1443362177
        //   255: goto            261
        //   258: ldc_w           -1467268035
        //   261: ldc_w           -870819177
        //   264: ixor           
        //   265: lookupswitch {
        //          -1709199594: 258
        //          1687363242: 292
        //          default: 1062
        //        }
        //   292: dload           7
        //   294: getstatic       dev/nuker/pyro/fc.c:I
        //   297: ifge            306
        //   300: ldc_w           -538148248
        //   303: goto            309
        //   306: ldc_w           1473453166
        //   309: ldc_w           -10605359
        //   312: ixor           
        //   313: lookupswitch {
        //          -1467141953: 340
        //          548581049: 306
        //          default: 1058
        //        }
        //   340: dload           7
        //   342: dmul           
        //   343: dadd           
        //   344: goto            348
        //   347: athrow         
        //   348: invokestatic    java/lang/Math.sqrt:(D)D
        //   351: goto            355
        //   354: athrow         
        //   355: getstatic       dev/nuker/pyro/fc.0:I
        //   358: ifeq            367
        //   361: ldc_w           -478871140
        //   364: goto            370
        //   367: ldc_w           1199226125
        //   370: ldc_w           1824480117
        //   373: ixor           
        //   374: lookupswitch {
        //          -2078938299: 367
        //          -1882563863: 1072
        //          default: 400
        //        }
        //   400: dstore          9
        //   402: getstatic       dev/nuker/pyro/fc.1:I
        //   405: ifeq            414
        //   408: ldc_w           1819539170
        //   411: goto            417
        //   414: ldc_w           742274417
        //   417: ldc_w           -453183386
        //   420: ixor           
        //   421: lookupswitch {
        //          -2003890556: 414
        //          -926757609: 448
        //          default: 1066
        //        }
        //   448: dload           7
        //   450: dload_3        
        //   451: getstatic       dev/nuker/pyro/fc.c:I
        //   454: ifge            463
        //   457: ldc_w           1076182618
        //   460: goto            466
        //   463: ldc_w           -392316544
        //   466: ldc_w           332570510
        //   469: ixor           
        //   470: lookupswitch {
        //          -78698994: 496
        //          1408737748: 463
        //          default: 1074
        //        }
        //   496: goto            500
        //   499: athrow         
        //   500: invokestatic    java/lang/Math.atan2:(DD)D
        //   503: goto            507
        //   506: athrow         
        //   507: getstatic       dev/nuker/pyro/fc.1:I
        //   510: ifeq            519
        //   513: ldc_w           -406963327
        //   516: goto            522
        //   519: ldc_w           -824387702
        //   522: ldc_w           -1118631870
        //   525: ixor           
        //   526: lookupswitch {
        //          -625495154: 519
        //          1525494723: 1056
        //          default: 552
        //        }
        //   552: goto            556
        //   555: athrow         
        //   556: invokestatic    java/lang/Math.toDegrees:(D)D
        //   559: goto            563
        //   562: athrow         
        //   563: d2f            
        //   564: ldc_w           90.0
        //   567: fsub           
        //   568: getstatic       dev/nuker/pyro/fc.c:I
        //   571: ifge            580
        //   574: ldc_w           849693722
        //   577: goto            583
        //   580: ldc_w           -229063821
        //   583: ldc_w           1913226085
        //   586: ixor           
        //   587: lookupswitch {
        //          643135433: 580
        //          1085067135: 1052
        //          default: 612
        //        }
        //   612: fstore          11
        //   614: dload           5
        //   616: getstatic       dev/nuker/pyro/fc.1:I
        //   619: ifeq            628
        //   622: ldc_w           1945882904
        //   625: goto            631
        //   628: ldc_w           -1631820019
        //   631: ldc_w           2080066713
        //   634: ixor           
        //   635: lookupswitch {
        //          -448320620: 660
        //          134258049: 628
        //          default: 1068
        //        }
        //   660: dload           9
        //   662: goto            666
        //   665: athrow         
        //   666: invokestatic    java/lang/Math.atan2:(DD)D
        //   669: goto            673
        //   672: athrow         
        //   673: goto            677
        //   676: athrow         
        //   677: invokestatic    java/lang/Math.toDegrees:(D)D
        //   680: goto            684
        //   683: athrow         
        //   684: dneg           
        //   685: d2f            
        //   686: fstore          12
        //   688: new             Lnet/minecraft/util/math/Vec2f;
        //   691: dup            
        //   692: getstatic       dev/nuker/pyro/fc.c:I
        //   695: ifge            704
        //   698: ldc_w           -155856092
        //   701: goto            707
        //   704: ldc_w           -19857698
        //   707: ldc_w           -518423854
        //   710: ixor           
        //   711: lookupswitch {
        //          -1182039369: 704
        //          397191670: 1054
        //          default: 736
        //        }
        //   736: aload_0        
        //   737: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   740: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   743: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   746: getstatic       dev/nuker/pyro/fc.c:I
        //   749: ifge            758
        //   752: ldc_w           821349465
        //   755: goto            761
        //   758: ldc_w           377295831
        //   761: ldc_w           549710173
        //   764: ixor           
        //   765: lookupswitch {
        //          272049412: 758
        //          918485642: 792
        //          default: 1050
        //        }
        //   792: fload           11
        //   794: getstatic       dev/nuker/pyro/fc.0:I
        //   797: ifeq            806
        //   800: ldc_w           -1231045239
        //   803: goto            809
        //   806: ldc_w           1911589774
        //   809: ldc_w           14771413
        //   812: ixor           
        //   813: lookupswitch {
        //          -1233200804: 806
        //          1897000795: 840
        //          default: 1048
        //        }
        //   840: aload_0        
        //   841: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   844: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   847: getstatic       dev/nuker/pyro/fc.0:I
        //   850: ifeq            859
        //   853: ldc_w           1812841878
        //   856: goto            862
        //   859: ldc_w           2099684461
        //   862: ldc_w           -507308308
        //   865: ixor           
        //   866: lookupswitch {
        //          -1915825286: 1044
        //          -1756090193: 859
        //          default: 892
        //        }
        //   892: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   895: fsub           
        //   896: getstatic       dev/nuker/pyro/fc.0:I
        //   899: ifeq            908
        //   902: ldc_w           -2097469235
        //   905: goto            911
        //   908: ldc_w           -119713679
        //   911: ldc_w           1470408704
        //   914: ixor           
        //   915: lookupswitch {
        //          -715161395: 1060
        //          198699645: 908
        //          default: 940
        //        }
        //   940: goto            944
        //   943: athrow         
        //   944: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //   947: goto            951
        //   950: athrow         
        //   951: fadd           
        //   952: aload_0        
        //   953: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   956: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   959: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //   962: fload           12
        //   964: aload_0        
        //   965: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   968: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   971: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //   974: fsub           
        //   975: getstatic       dev/nuker/pyro/fc.1:I
        //   978: ifeq            987
        //   981: ldc_w           1436862130
        //   984: goto            990
        //   987: ldc_w           234230534
        //   990: ldc_w           529326811
        //   993: ixor           
        //   994: lookupswitch {
        //          -2078027160: 987
        //          1244144745: 1046
        //          default: 1020
        //        }
        //  1020: goto            1024
        //  1023: athrow         
        //  1024: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //  1027: goto            1031
        //  1030: athrow         
        //  1031: fadd           
        //  1032: goto            1036
        //  1035: athrow         
        //  1036: invokespecial   net/minecraft/util/math/Vec2f.<init>:(FF)V
        //  1039: goto            1043
        //  1042: athrow         
        //  1043: areturn        
        //  1044: aconst_null    
        //  1045: athrow         
        //  1046: aconst_null    
        //  1047: athrow         
        //  1048: aconst_null    
        //  1049: athrow         
        //  1050: aconst_null    
        //  1051: athrow         
        //  1052: aconst_null    
        //  1053: athrow         
        //  1054: aconst_null    
        //  1055: athrow         
        //  1056: aconst_null    
        //  1057: athrow         
        //  1058: aconst_null    
        //  1059: athrow         
        //  1060: aconst_null    
        //  1061: athrow         
        //  1062: aconst_null    
        //  1063: athrow         
        //  1064: aconst_null    
        //  1065: athrow         
        //  1066: aconst_null    
        //  1067: athrow         
        //  1068: aconst_null    
        //  1069: athrow         
        //  1070: aconst_null    
        //  1071: athrow         
        //  1072: aconst_null    
        //  1073: athrow         
        //  1074: aconst_null    
        //  1075: athrow         
        //  1076: aconst_null    
        //  1077: athrow         
        //  1078: aconst_null    
        //  1079: athrow         
        //  1080: pop            
        //  1081: goto            24
        //  1084: pop            
        //  1085: aconst_null    
        //  1086: goto            1080
        //  1089: dup            
        //  1090: ifnull          1080
        //  1093: checkcast       Ljava/lang/Throwable;
        //  1096: athrow         
        //  1097: dup            
        //  1098: ifnull          1084
        //  1101: checkcast       Ljava/lang/Throwable;
        //  1104: athrow         
        //  1105: aconst_null    
        //  1106: athrow         
        //    StackMapTable: 00 71 FF 00 03 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 01 07 00 2A F8 00 04 FF 00 0B 00 00 00 01 07 00 2A FE 00 03 07 00 03 07 00 F9 07 00 F9 FF 00 1D 00 04 07 00 03 07 00 F9 07 00 F9 03 00 01 03 FF 00 02 00 04 07 00 03 07 00 F9 07 00 F9 03 00 02 03 01 5E 03 FC 00 12 03 42 01 1D FC 00 16 03 42 01 1D 4C 03 FF 00 02 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 02 03 01 5F 03 4D 03 FF 00 02 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 02 03 01 5E 03 FF 00 0D 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 02 03 03 FF 00 02 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 03 03 03 01 FF 00 1E 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 02 03 03 FF 00 06 00 00 00 01 07 00 2A FF 00 00 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 01 03 45 07 00 2A 40 03 4B 03 FF 00 02 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 02 03 01 5D 03 FC 00 0D 03 42 01 1E FF 00 0E 00 07 07 00 03 07 00 F9 07 00 F9 03 03 03 03 00 02 03 03 FF 00 02 00 07 07 00 03 07 00 F9 07 00 F9 03 03 03 03 00 03 03 03 01 FF 00 1D 00 07 07 00 03 07 00 F9 07 00 F9 03 03 03 03 00 02 03 03 42 07 00 2A FF 00 00 00 07 07 00 03 07 00 F9 07 00 F9 03 03 03 03 00 02 03 03 45 07 00 2A 40 03 4B 03 FF 00 02 00 07 07 00 03 07 00 F9 07 00 F9 03 03 03 03 00 02 03 01 5D 03 FF 00 02 00 00 00 01 07 00 2A FF 00 00 00 07 07 00 03 07 00 F9 07 00 F9 03 03 03 03 00 01 03 45 07 00 2A 40 03 50 02 FF 00 02 00 07 07 00 03 07 00 F9 07 00 F9 03 03 03 03 00 02 02 01 5C 02 FF 00 0F 00 08 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 00 01 03 FF 00 02 00 08 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 00 02 03 01 5C 03 44 07 00 79 FF 00 00 00 08 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 00 02 03 03 45 07 00 2A 40 03 42 07 00 2A 40 03 45 07 00 2A 40 03 FF 00 13 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 02 08 02 B0 08 02 B0 FF 00 02 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 03 08 02 B0 08 02 B0 01 FF 00 1C 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 02 08 02 B0 08 02 B0 FF 00 15 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 03 08 02 B0 08 02 B0 02 FF 00 02 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 02 B0 08 02 B0 02 01 FF 00 1E 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 03 08 02 B0 08 02 B0 02 FF 00 0D 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 02 B0 08 02 B0 02 02 FF 00 02 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 05 08 02 B0 08 02 B0 02 02 01 FF 00 1E 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 02 B0 08 02 B0 02 02 FF 00 12 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 05 08 02 B0 08 02 B0 02 02 07 00 D5 FF 00 02 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 06 08 02 B0 08 02 B0 02 02 07 00 D5 01 FF 00 1D 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 05 08 02 B0 08 02 B0 02 02 07 00 D5 FF 00 0F 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 02 B0 08 02 B0 02 02 FF 00 02 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 05 08 02 B0 08 02 B0 02 02 01 FF 00 1C 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 02 B0 08 02 B0 02 02 42 07 00 2A FF 00 00 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 02 B0 08 02 B0 02 02 45 07 00 2A FF 00 00 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 02 B0 08 02 B0 02 02 FF 00 23 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 05 08 02 B0 08 02 B0 02 02 02 FF 00 02 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 06 08 02 B0 08 02 B0 02 02 02 01 FF 00 1D 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 05 08 02 B0 08 02 B0 02 02 02 FF 00 02 00 00 00 01 07 00 2A FF 00 00 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 05 08 02 B0 08 02 B0 02 02 02 45 07 00 2A FF 00 00 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 05 08 02 B0 08 02 B0 02 02 02 43 07 00 2A FF 00 00 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 02 B0 08 02 B0 02 02 45 07 00 2A 40 07 01 64 FF 00 00 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 05 08 02 B0 08 02 B0 02 02 07 00 D5 FF 00 01 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 05 08 02 B0 08 02 B0 02 02 02 FF 00 01 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 02 B0 08 02 B0 02 02 FF 00 01 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 03 08 02 B0 08 02 B0 02 FF 00 01 00 07 07 00 03 07 00 F9 07 00 F9 03 03 03 03 00 01 02 FF 00 01 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 02 08 02 B0 08 02 B0 FF 00 01 00 07 07 00 03 07 00 F9 07 00 F9 03 03 03 03 00 01 03 FF 00 01 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 02 03 03 FF 00 01 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 02 B0 08 02 B0 02 02 FF 00 01 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 01 03 01 FC 00 01 03 FF 00 01 00 08 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 00 01 03 F8 00 01 FF 00 01 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 01 03 FF 00 01 00 07 07 00 03 07 00 F9 07 00 F9 03 03 03 03 00 02 03 03 FF 00 01 00 04 07 00 03 07 00 F9 07 00 F9 03 00 01 03 FF 00 01 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 01 03 FF 00 01 00 03 07 00 03 07 00 F9 07 00 F9 00 01 07 00 1D 43 05 44 07 00 1D 47 05 FF 00 07 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 01 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1089   1097   Ljava/lang/IndexOutOfBoundsException;
        //  1089   1097   1089   1097   Ljava/lang/IllegalStateException;
        //  1105   1107   3      8      Any
        //  348    354    354    355    Any
        //  348    354    3      8      Ljava/util/ConcurrentModificationException;
        //  348    354    3      8      Ljava/lang/NullPointerException;
        //  348    354    354    355    Any
        //  348    354    354    355    Any
        //  499    506    506    507    Any
        //  499    506    506    507    Any
        //  500    506    499    500    Any
        //  499    506    506    507    Any
        //  500    506    506    507    Any
        //  556    562    562    563    Any
        //  556    562    3      8      Ljava/lang/UnsupportedOperationException;
        //  556    562    562    563    Any
        //  556    562    562    563    Any
        //  556    562    562    563    Any
        //  665    672    672    673    Any
        //  665    672    3      8      Ljava/lang/ArithmeticException;
        //  666    672    665    666    Ljava/lang/NegativeArraySizeException;
        //  666    672    3      8      Ljava/lang/ArithmeticException;
        //  665    672    3      8      Any
        //  676    683    683    684    Any
        //  676    683    683    684    Any
        //  676    683    676    677    Any
        //  677    683    3      8      Ljava/lang/AssertionError;
        //  676    683    3      8      Any
        //  943    950    950    951    Any
        //  943    950    3      8      Any
        //  943    950    943    944    Any
        //  944    950    3      8      Ljava/lang/IllegalArgumentException;
        //  943    950    950    951    Ljava/lang/AssertionError;
        //  1024   1030   1030   1031   Any
        //  1024   1030   1030   1031   Any
        //  1024   1030   3      8      Any
        //  1024   1030   1030   1031   Any
        //  1024   1030   1030   1031   Ljava/lang/IndexOutOfBoundsException;
        //  1035   1042   1042   1043   Any
        //  1035   1042   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1035   1042   3      8      Any
        //  1036   1042   1035   1036   Any
        //  1036   1042   1042   1043   Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:733)
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
    
    public void c(@NotNull final Vec2f p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          471
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            463
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            455
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_0        
        //    27: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //    30: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    33: getstatic       dev/nuker/pyro/fc.1:I
        //    36: ifeq            45
        //    39: ldc_w           -1488688871
        //    42: goto            48
        //    45: ldc_w           610916412
        //    48: ldc_w           -1259262698
        //    51: ixor           
        //    52: lookupswitch {
        //          330646543: 438
        //          979100558: 45
        //          default: 80
        //        }
        //    80: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //    83: new             Lnet/minecraft/network/play/client/CPacketPlayer$Rotation;
        //    86: dup            
        //    87: aload_1        
        //    88: getfield        net/minecraft/util/math/Vec2f.field_189982_i:F
        //    91: getstatic       dev/nuker/pyro/fc.1:I
        //    94: ifeq            103
        //    97: ldc_w           1030898437
        //   100: goto            106
        //   103: ldc_w           -1483599878
        //   106: ldc_w           1711277366
        //   109: ixor           
        //   110: lookupswitch {
        //          -1047393588: 136
        //          1534215731: 103
        //          default: 432
        //        }
        //   136: aload_1        
        //   137: getfield        net/minecraft/util/math/Vec2f.field_189983_j:F
        //   140: aload_0        
        //   141: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   144: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   147: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70122_E:Z
        //   150: goto            154
        //   153: athrow         
        //   154: invokespecial   net/minecraft/network/play/client/CPacketPlayer$Rotation.<init>:(FFZ)V
        //   157: goto            161
        //   160: athrow         
        //   161: checkcast       Lnet/minecraft/network/Packet;
        //   164: goto            168
        //   167: athrow         
        //   168: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   171: goto            175
        //   174: athrow         
        //   175: getstatic       dev/nuker/pyro/fc.c:I
        //   178: ifge            187
        //   181: ldc_w           -314012556
        //   184: goto            190
        //   187: ldc_w           -1909322585
        //   190: ldc_w           2008084021
        //   193: ixor           
        //   194: lookupswitch {
        //          -1694997951: 187
        //          -108862830: 220
        //          default: 434
        //        }
        //   220: iload_2        
        //   221: ifeq            431
        //   224: aload_0        
        //   225: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   228: getstatic       dev/nuker/pyro/fc.c:I
        //   231: ifge            240
        //   234: ldc_w           1246881250
        //   237: goto            243
        //   240: ldc_w           787873732
        //   243: ldc_w           230507300
        //   246: ixor           
        //   247: lookupswitch {
        //          591969504: 272
        //          1206691526: 240
        //          default: 436
        //        }
        //   272: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   275: aload_1        
        //   276: getstatic       dev/nuker/pyro/fc.1:I
        //   279: ifeq            288
        //   282: ldc_w           1889878666
        //   285: goto            291
        //   288: ldc_w           836555490
        //   291: ldc_w           1187980702
        //   294: ixor           
        //   295: lookupswitch {
        //          912942868: 288
        //          1997797244: 320
        //          default: 442
        //        }
        //   320: getfield        net/minecraft/util/math/Vec2f.field_189983_j:F
        //   323: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //   326: aload_0        
        //   327: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   330: getstatic       dev/nuker/pyro/fc.c:I
        //   333: ifge            342
        //   336: ldc_w           1257721292
        //   339: goto            345
        //   342: ldc_w           1127678045
        //   345: ldc_w           1693957374
        //   348: ixor           
        //   349: lookupswitch {
        //          666942627: 376
        //          771813682: 342
        //          default: 440
        //        }
        //   376: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   379: aload_1        
        //   380: getfield        net/minecraft/util/math/Vec2f.field_189982_i:F
        //   383: getstatic       dev/nuker/pyro/fc.0:I
        //   386: ifeq            395
        //   389: ldc_w           530213281
        //   392: goto            398
        //   395: ldc_w           1776084560
        //   398: ldc_w           869709403
        //   401: ixor           
        //   402: lookupswitch {
        //          -1797422805: 395
        //          743235578: 444
        //          default: 428
        //        }
        //   428: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   431: return         
        //   432: aconst_null    
        //   433: athrow         
        //   434: aconst_null    
        //   435: athrow         
        //   436: aconst_null    
        //   437: athrow         
        //   438: aconst_null    
        //   439: athrow         
        //   440: aconst_null    
        //   441: athrow         
        //   442: aconst_null    
        //   443: athrow         
        //   444: aconst_null    
        //   445: athrow         
        //   446: pop            
        //   447: goto            24
        //   450: pop            
        //   451: aconst_null    
        //   452: goto            446
        //   455: dup            
        //   456: ifnull          446
        //   459: checkcast       Ljava/lang/Throwable;
        //   462: athrow         
        //   463: dup            
        //   464: ifnull          450
        //   467: checkcast       Ljava/lang/Throwable;
        //   470: athrow         
        //   471: aconst_null    
        //   472: athrow         
        //    StackMapTable: 00 2E 43 07 00 2A 04 FF 00 0B 00 00 00 01 07 00 2A FE 00 03 07 00 03 07 01 64 01 54 07 00 D5 FF 00 02 00 03 07 00 03 07 01 64 01 00 02 07 00 D5 01 5F 07 00 D5 FF 00 16 00 03 07 00 03 07 01 64 01 00 04 07 00 F0 08 00 53 08 00 53 02 FF 00 02 00 03 07 00 03 07 01 64 01 00 05 07 00 F0 08 00 53 08 00 53 02 01 FF 00 1D 00 03 07 00 03 07 01 64 01 00 04 07 00 F0 08 00 53 08 00 53 02 50 07 00 2A FF 00 00 00 03 07 00 03 07 01 64 01 00 06 07 00 F0 08 00 53 08 00 53 02 02 01 45 07 00 2A FF 00 00 00 03 07 00 03 07 01 64 01 00 02 07 00 F0 07 02 90 45 07 00 2A FF 00 00 00 03 07 00 03 07 01 64 01 00 02 07 00 F0 07 00 EE 45 07 00 2A 00 0B 42 01 1D 53 07 00 74 FF 00 02 00 03 07 00 03 07 01 64 01 00 02 07 00 74 01 5C 07 00 74 FF 00 0F 00 03 07 00 03 07 01 64 01 00 02 07 00 D5 07 01 64 FF 00 02 00 03 07 00 03 07 01 64 01 00 03 07 00 D5 07 01 64 01 FF 00 1C 00 03 07 00 03 07 01 64 01 00 02 07 00 D5 07 01 64 55 07 00 74 FF 00 02 00 03 07 00 03 07 01 64 01 00 02 07 00 74 01 5E 07 00 74 FF 00 12 00 03 07 00 03 07 01 64 01 00 02 07 00 D5 02 FF 00 02 00 03 07 00 03 07 01 64 01 00 03 07 00 D5 02 01 FF 00 1D 00 03 07 00 03 07 01 64 01 00 02 07 00 D5 02 02 FF 00 00 00 03 07 00 03 07 01 64 01 00 04 07 00 F0 08 00 53 08 00 53 02 01 41 07 00 74 41 07 00 D5 41 07 00 74 FF 00 01 00 03 07 00 03 07 01 64 01 00 02 07 00 D5 07 01 64 FF 00 01 00 03 07 00 03 07 01 64 01 00 02 07 00 D5 02 41 07 00 2A 43 05 44 07 00 2A 47 05 47 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     455    463    Any
        //  455    463    455    463    Any
        //  471    473    3      8      Any
        //  153    160    160    161    Any
        //  154    160    3      8      Ljava/lang/AssertionError;
        //  153    160    153    154    Any
        //  153    160    160    161    Ljava/lang/StringIndexOutOfBoundsException;
        //  154    160    153    154    Ljava/lang/StringIndexOutOfBoundsException;
        //  167    174    174    175    Any
        //  167    174    3      8      Any
        //  167    174    174    175    Any
        //  168    174    3      8      Ljava/lang/ArithmeticException;
        //  168    174    167    168    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 126 out of bounds for length 126
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
    
    public void c(@NotNull final Vec3d p0, @Nullable final EnumFacing p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          220
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            212
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            204
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_0        
        //    27: aload_0        
        //    28: getstatic       dev/nuker/pyro/fc.0:I
        //    31: ifeq            40
        //    34: ldc_w           195507196
        //    37: goto            43
        //    40: ldc_w           -2067890734
        //    43: ldc_w           -254794035
        //    46: ixor           
        //    47: lookupswitch {
        //          -567182900: 40
        //          -76081871: 193
        //          default: 72
        //        }
        //    72: aload_1        
        //    73: aload_2        
        //    74: getstatic       dev/nuker/pyro/fc.c:I
        //    77: ifge            86
        //    80: ldc_w           -947812368
        //    83: goto            89
        //    86: ldc_w           -525053608
        //    89: ldc_w           273628103
        //    92: ixor           
        //    93: lookupswitch {
        //          -674317257: 191
        //          802706928: 86
        //          default: 120
        //        }
        //   120: goto            124
        //   123: athrow         
        //   124: invokevirtual   dev/nuker/pyro/fbg.c:(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/Vec2f;
        //   127: goto            131
        //   130: athrow         
        //   131: getstatic       dev/nuker/pyro/fc.0:I
        //   134: ifeq            143
        //   137: ldc_w           1057139398
        //   140: goto            146
        //   143: ldc_w           -683194894
        //   146: ldc_w           785095193
        //   149: ixor           
        //   150: lookupswitch {
        //          -981367226: 143
        //          298397919: 189
        //          default: 176
        //        }
        //   176: iload_3        
        //   177: goto            181
        //   180: athrow         
        //   181: invokevirtual   dev/nuker/pyro/fbg.0:(Lnet/minecraft/util/math/Vec2f;Z)V
        //   184: goto            188
        //   187: athrow         
        //   188: return         
        //   189: aconst_null    
        //   190: athrow         
        //   191: aconst_null    
        //   192: athrow         
        //   193: aconst_null    
        //   194: athrow         
        //   195: pop            
        //   196: goto            24
        //   199: pop            
        //   200: aconst_null    
        //   201: goto            195
        //   204: dup            
        //   205: ifnull          195
        //   208: checkcast       Ljava/lang/Throwable;
        //   211: athrow         
        //   212: dup            
        //   213: ifnull          199
        //   216: checkcast       Ljava/lang/Throwable;
        //   219: athrow         
        //   220: aconst_null    
        //   221: athrow         
        //    StackMapTable: 00 1D 43 07 00 2A 04 FF 00 0B 00 00 00 01 07 00 2A FF 00 03 00 04 07 00 03 07 00 F9 07 00 32 01 00 00 FF 00 0F 00 04 07 00 03 07 00 F9 07 00 32 01 00 02 07 00 03 07 00 03 FF 00 02 00 04 07 00 03 07 00 F9 07 00 32 01 00 03 07 00 03 07 00 03 01 FF 00 1C 00 04 07 00 03 07 00 F9 07 00 32 01 00 02 07 00 03 07 00 03 FF 00 0D 00 04 07 00 03 07 00 F9 07 00 32 01 00 04 07 00 03 07 00 03 07 00 F9 07 00 32 FF 00 02 00 04 07 00 03 07 00 F9 07 00 32 01 00 05 07 00 03 07 00 03 07 00 F9 07 00 32 01 FF 00 1E 00 04 07 00 03 07 00 F9 07 00 32 01 00 04 07 00 03 07 00 03 07 00 F9 07 00 32 42 07 00 2A FF 00 00 00 04 07 00 03 07 00 F9 07 00 32 01 00 04 07 00 03 07 00 03 07 00 F9 07 00 32 45 07 00 2A FF 00 00 00 04 07 00 03 07 00 F9 07 00 32 01 00 02 07 00 03 07 01 64 FF 00 0B 00 04 07 00 03 07 00 F9 07 00 32 01 00 02 07 00 03 07 01 64 FF 00 02 00 04 07 00 03 07 00 F9 07 00 32 01 00 03 07 00 03 07 01 64 01 FF 00 1D 00 04 07 00 03 07 00 F9 07 00 32 01 00 02 07 00 03 07 01 64 43 07 00 2A FF 00 00 00 04 07 00 03 07 00 F9 07 00 32 01 00 03 07 00 03 07 01 64 01 45 07 00 2A 00 FF 00 00 00 04 07 00 03 07 00 F9 07 00 32 01 00 02 07 00 03 07 01 64 FF 00 01 00 04 07 00 03 07 00 F9 07 00 32 01 00 04 07 00 03 07 00 03 07 00 F9 07 00 32 FF 00 01 00 04 07 00 03 07 00 F9 07 00 32 01 00 02 07 00 03 07 00 03 41 07 00 2A 43 05 44 07 00 2A 47 05 47 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     204    212    Ljava/lang/IllegalArgumentException;
        //  204    212    204    212    Any
        //  220    222    3      8      Any
        //  123    130    130    131    Any
        //  123    130    130    131    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  124    130    123    124    Any
        //  123    130    123    124    Ljava/lang/EnumConstantNotPresentException;
        //  124    130    3      8      Any
        //  180    187    187    188    Any
        //  181    187    187    188    Ljava/lang/NullPointerException;
        //  181    187    180    181    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  181    187    3      8      Any
        //  181    187    180    181    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 73 out of bounds for length 73
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
    public Block 0(@Nullable final BlockPos blockPos) {
        return fbS.3J(this, 845879815, blockPos);
    }
    
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        while (true) {
            int n = 0;
            Label_0020: {
                if (fc.0 != 0) {
                    n = 31521592;
                    break Label_0020;
                }
                n = -1120197419;
            }
            switch (n ^ 0x3A391171) {
                case 977133660: {
                    continue;
                }
                default: {
                    fbg.c = new fbd(defaultConstructorMarker);
                    fbg.c = new fbg(Minecraft.func_71410_x());
                }
                case 1004137033: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @NotNull
    public Vec2f 0(@NotNull final Vec3d p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          878
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            870
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            862
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/fc.c:I
        //    29: ifge            38
        //    32: ldc_w           803809257
        //    35: goto            41
        //    38: ldc_w           937540167
        //    41: ldc_w           1212214151
        //    44: ixor           
        //    45: lookupswitch {
        //          1739181166: 38
        //          2141278656: 72
        //          default: 847
        //        }
        //    72: aload_0        
        //    73: goto            77
        //    76: athrow         
        //    77: invokevirtual   dev/nuker/pyro/fbg.c:()Lnet/minecraft/util/math/Vec3d;
        //    80: goto            84
        //    83: athrow         
        //    84: getstatic       dev/nuker/pyro/fc.1:I
        //    87: ifeq            96
        //    90: ldc_w           -1419999507
        //    93: goto            99
        //    96: ldc_w           -603653557
        //    99: ldc_w           -137338350
        //   102: ixor           
        //   103: lookupswitch {
        //          1211417898: 96
        //          1552737535: 843
        //          default: 128
        //        }
        //   128: astore_2       
        //   129: aload_1        
        //   130: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //   133: aload_2        
        //   134: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //   137: dsub           
        //   138: dstore_3       
        //   139: aload_1        
        //   140: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   143: aload_2        
        //   144: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   147: dsub           
        //   148: getstatic       dev/nuker/pyro/fc.1:I
        //   151: ifeq            160
        //   154: ldc_w           972561109
        //   157: goto            163
        //   160: ldc_w           423780413
        //   163: ldc_w           1806902413
        //   166: ixor           
        //   167: lookupswitch {
        //          -1418963044: 160
        //          1380662872: 827
        //          default: 192
        //        }
        //   192: dstore          5
        //   194: aload_1        
        //   195: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   198: aload_2        
        //   199: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   202: dsub           
        //   203: dstore          7
        //   205: dload_3        
        //   206: dload_3        
        //   207: dmul           
        //   208: dload           7
        //   210: getstatic       dev/nuker/pyro/fc.1:I
        //   213: ifeq            222
        //   216: ldc_w           -1278064170
        //   219: goto            225
        //   222: ldc_w           1987595802
        //   225: ldc_w           860852766
        //   228: ixor           
        //   229: lookupswitch {
        //          -2137138232: 222
        //          1161288708: 256
        //          default: 833
        //        }
        //   256: dload           7
        //   258: dmul           
        //   259: dadd           
        //   260: goto            264
        //   263: athrow         
        //   264: invokestatic    java/lang/Math.sqrt:(D)D
        //   267: goto            271
        //   270: athrow         
        //   271: dstore          9
        //   273: dload           7
        //   275: dload_3        
        //   276: goto            280
        //   279: athrow         
        //   280: invokestatic    java/lang/Math.atan2:(DD)D
        //   283: goto            287
        //   286: athrow         
        //   287: goto            291
        //   290: athrow         
        //   291: invokestatic    java/lang/Math.toDegrees:(D)D
        //   294: goto            298
        //   297: athrow         
        //   298: d2f            
        //   299: ldc_w           90.0
        //   302: fsub           
        //   303: fstore          11
        //   305: getstatic       dev/nuker/pyro/fc.1:I
        //   308: ifeq            317
        //   311: ldc_w           1969639352
        //   314: goto            320
        //   317: ldc_w           -2008891567
        //   320: ldc_w           318184606
        //   323: ixor           
        //   324: lookupswitch {
        //          -1699372081: 352
        //          1737577254: 317
        //          default: 851
        //        }
        //   352: dload           5
        //   354: dload           9
        //   356: goto            360
        //   359: athrow         
        //   360: invokestatic    java/lang/Math.atan2:(DD)D
        //   363: goto            367
        //   366: athrow         
        //   367: goto            371
        //   370: athrow         
        //   371: invokestatic    java/lang/Math.toDegrees:(D)D
        //   374: goto            378
        //   377: athrow         
        //   378: dneg           
        //   379: d2f            
        //   380: getstatic       dev/nuker/pyro/fc.0:I
        //   383: ifeq            392
        //   386: ldc_w           1945131323
        //   389: goto            395
        //   392: ldc_w           -127870474
        //   395: ldc_w           881342516
        //   398: ixor           
        //   399: lookupswitch {
        //          -857153086: 424
        //          1199071503: 392
        //          default: 835
        //        }
        //   424: fstore          12
        //   426: new             Lnet/minecraft/util/math/Vec2f;
        //   429: dup            
        //   430: aload_0        
        //   431: getstatic       dev/nuker/pyro/fc.c:I
        //   434: ifge            443
        //   437: ldc_w           386149955
        //   440: goto            446
        //   443: ldc_w           868802618
        //   446: ldc_w           -635553752
        //   449: ixor           
        //   450: lookupswitch {
        //          -853928341: 443
        //          -371795950: 476
        //          default: 839
        //        }
        //   476: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   479: getstatic       dev/nuker/pyro/fc.0:I
        //   482: ifeq            491
        //   485: ldc_w           446346267
        //   488: goto            494
        //   491: ldc_w           -571752256
        //   494: ldc_w           2019454483
        //   497: ixor           
        //   498: lookupswitch {
        //          1217392150: 491
        //          1657068040: 829
        //          default: 524
        //        }
        //   524: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   527: getstatic       dev/nuker/pyro/fc.1:I
        //   530: ifeq            539
        //   533: ldc_w           844608638
        //   536: goto            542
        //   539: ldc_w           -783520100
        //   542: ldc_w           -2062397127
        //   545: ixor           
        //   546: lookupswitch {
        //          -1220156089: 539
        //          1415462821: 572
        //          default: 841
        //        }
        //   572: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   575: getstatic       dev/nuker/pyro/fc.0:I
        //   578: ifeq            587
        //   581: ldc_w           -1542191143
        //   584: goto            590
        //   587: ldc_w           -1842637655
        //   590: ldc_w           1211508527
        //   593: ixor           
        //   594: lookupswitch {
        //          -333307658: 849
        //          1227587751: 587
        //          default: 620
        //        }
        //   620: fload           11
        //   622: aload_0        
        //   623: getstatic       dev/nuker/pyro/fc.c:I
        //   626: ifge            635
        //   629: ldc_w           782671479
        //   632: goto            638
        //   635: ldc_w           318094828
        //   638: ldc_w           -1757232252
        //   641: ixor           
        //   642: lookupswitch {
        //          -2051572120: 668
        //          -1176216077: 635
        //          default: 845
        //        }
        //   668: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   671: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   674: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   677: fsub           
        //   678: getstatic       dev/nuker/pyro/fc.0:I
        //   681: ifeq            690
        //   684: ldc_w           1846308626
        //   687: goto            693
        //   690: ldc_w           -1800352182
        //   693: ldc_w           -296437141
        //   696: ixor           
        //   697: lookupswitch {
        //          -2141661831: 690
        //          2061792289: 724
        //          default: 837
        //        }
        //   724: goto            728
        //   727: athrow         
        //   728: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //   731: goto            735
        //   734: athrow         
        //   735: fadd           
        //   736: aload_0        
        //   737: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   740: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   743: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //   746: fload           12
        //   748: aload_0        
        //   749: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   752: getstatic       dev/nuker/pyro/fc.1:I
        //   755: ifeq            764
        //   758: ldc_w           1226496450
        //   761: goto            767
        //   764: ldc_w           734846535
        //   767: ldc_w           1428195893
        //   770: ixor           
        //   771: lookupswitch {
        //          -292493415: 764
        //          473584631: 831
        //          default: 796
        //        }
        //   796: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   799: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //   802: fsub           
        //   803: goto            807
        //   806: athrow         
        //   807: invokestatic    net/minecraft/util/math/MathHelper.func_76142_g:(F)F
        //   810: goto            814
        //   813: athrow         
        //   814: fadd           
        //   815: goto            819
        //   818: athrow         
        //   819: invokespecial   net/minecraft/util/math/Vec2f.<init>:(FF)V
        //   822: goto            826
        //   825: athrow         
        //   826: areturn        
        //   827: aconst_null    
        //   828: athrow         
        //   829: aconst_null    
        //   830: athrow         
        //   831: aconst_null    
        //   832: athrow         
        //   833: aconst_null    
        //   834: athrow         
        //   835: aconst_null    
        //   836: athrow         
        //   837: aconst_null    
        //   838: athrow         
        //   839: aconst_null    
        //   840: athrow         
        //   841: aconst_null    
        //   842: athrow         
        //   843: aconst_null    
        //   844: athrow         
        //   845: aconst_null    
        //   846: athrow         
        //   847: aconst_null    
        //   848: athrow         
        //   849: aconst_null    
        //   850: athrow         
        //   851: aconst_null    
        //   852: athrow         
        //   853: pop            
        //   854: goto            24
        //   857: pop            
        //   858: aconst_null    
        //   859: goto            853
        //   862: dup            
        //   863: ifnull          853
        //   866: checkcast       Ljava/lang/Throwable;
        //   869: athrow         
        //   870: dup            
        //   871: ifnull          857
        //   874: checkcast       Ljava/lang/Throwable;
        //   877: athrow         
        //   878: aconst_null    
        //   879: athrow         
        //    StackMapTable: 00 61 43 07 00 2A 04 FF 00 0B 00 00 00 01 07 00 2A FD 00 03 07 00 03 07 00 F9 0D 42 01 1E FF 00 03 00 00 00 01 07 00 2A FF 00 00 00 02 07 00 03 07 00 F9 00 01 07 00 03 45 07 00 2A 40 07 00 F9 4B 07 00 F9 FF 00 02 00 02 07 00 03 07 00 F9 00 02 07 00 F9 01 5C 07 00 F9 FF 00 1F 00 04 07 00 03 07 00 F9 07 00 F9 03 00 01 03 FF 00 02 00 04 07 00 03 07 00 F9 07 00 F9 03 00 02 03 01 5C 03 FF 00 1D 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 02 03 03 FF 00 02 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 03 03 03 01 FF 00 1E 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 02 03 03 46 07 00 1D 40 03 45 07 00 2A 40 03 FF 00 07 00 00 00 01 07 00 2A FF 00 00 00 07 07 00 03 07 00 F9 07 00 F9 03 03 03 03 00 02 03 03 45 07 00 2A 40 03 42 07 00 2A 40 03 45 07 00 2A 40 03 FC 00 12 02 42 01 1F FF 00 06 00 00 00 01 07 00 2A FF 00 00 00 08 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 00 02 03 03 45 07 00 2A 40 03 42 07 00 21 40 03 45 07 00 2A 40 03 4D 02 FF 00 02 00 08 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 00 02 02 01 5C 02 FF 00 12 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 03 08 01 AA 08 01 AA 07 00 03 FF 00 02 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 01 AA 08 01 AA 07 00 03 01 FF 00 1D 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 03 08 01 AA 08 01 AA 07 00 03 FF 00 0E 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 03 08 01 AA 08 01 AA 07 00 74 FF 00 02 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 01 AA 08 01 AA 07 00 74 01 FF 00 1D 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 03 08 01 AA 08 01 AA 07 00 74 FF 00 0E 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 03 08 01 AA 08 01 AA 07 00 D5 FF 00 02 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 01 AA 08 01 AA 07 00 D5 01 FF 00 1D 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 03 08 01 AA 08 01 AA 07 00 D5 FF 00 0E 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 03 08 01 AA 08 01 AA 02 FF 00 02 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 01 AA 08 01 AA 02 01 FF 00 1D 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 03 08 01 AA 08 01 AA 02 FF 00 0E 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 05 08 01 AA 08 01 AA 02 02 07 00 03 FF 00 02 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 06 08 01 AA 08 01 AA 02 02 07 00 03 01 FF 00 1D 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 05 08 01 AA 08 01 AA 02 02 07 00 03 FF 00 15 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 01 AA 08 01 AA 02 02 FF 00 02 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 05 08 01 AA 08 01 AA 02 02 01 FF 00 1E 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 01 AA 08 01 AA 02 02 FF 00 02 00 00 00 01 07 00 2A FF 00 00 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 01 AA 08 01 AA 02 02 45 07 00 2A FF 00 00 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 01 AA 08 01 AA 02 02 FF 00 1C 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 06 08 01 AA 08 01 AA 02 02 02 07 00 74 FF 00 02 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 07 08 01 AA 08 01 AA 02 02 02 07 00 74 01 FF 00 1C 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 06 08 01 AA 08 01 AA 02 02 02 07 00 74 49 07 00 2A FF 00 00 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 05 08 01 AA 08 01 AA 02 02 02 45 07 00 2A FF 00 00 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 05 08 01 AA 08 01 AA 02 02 02 43 07 00 23 FF 00 00 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 01 AA 08 01 AA 02 02 45 07 00 2A 40 07 01 64 FF 00 00 00 04 07 00 03 07 00 F9 07 00 F9 03 00 01 03 FF 00 01 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 03 08 01 AA 08 01 AA 07 00 74 FF 00 01 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 06 08 01 AA 08 01 AA 02 02 02 07 00 74 FF 00 01 00 06 07 00 03 07 00 F9 07 00 F9 03 03 03 00 02 03 03 FF 00 01 00 08 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 00 01 02 FF 00 01 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 04 08 01 AA 08 01 AA 02 02 FF 00 01 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 03 08 01 AA 08 01 AA 07 00 03 FF 00 01 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 03 08 01 AA 08 01 AA 07 00 D5 FF 00 01 00 02 07 00 03 07 00 F9 00 01 07 00 F9 FF 00 01 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 05 08 01 AA 08 01 AA 02 02 07 00 03 FF 00 01 00 02 07 00 03 07 00 F9 00 00 FF 00 01 00 09 07 00 03 07 00 F9 07 00 F9 03 03 03 03 02 02 00 03 08 01 AA 08 01 AA 02 FA 00 01 FF 00 01 00 02 07 00 03 07 00 F9 00 01 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     862    870    Ljava/lang/NullPointerException;
        //  862    870    862    870    Ljava/util/ConcurrentModificationException;
        //  878    880    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  77     83     83     84     Any
        //  77     83     83     84     Any
        //  77     83     3      8      Ljava/lang/RuntimeException;
        //  77     83     3      8      Any
        //  77     83     83     84     Any
        //  263    270    270    271    Any
        //  263    270    3      8      Ljava/lang/NegativeArraySizeException;
        //  264    270    263    264    Ljava/lang/RuntimeException;
        //  263    270    3      8      Ljava/util/ConcurrentModificationException;
        //  263    270    270    271    Ljava/lang/IllegalArgumentException;
        //  280    286    286    287    Any
        //  280    286    3      8      Any
        //  280    286    286    287    Ljava/lang/ClassCastException;
        //  280    286    3      8      Any
        //  280    286    286    287    Any
        //  290    297    297    298    Any
        //  291    297    290    291    Ljava/util/NoSuchElementException;
        //  291    297    290    291    Any
        //  290    297    3      8      Ljava/lang/UnsupportedOperationException;
        //  290    297    297    298    Ljava/lang/NullPointerException;
        //  360    366    366    367    Any
        //  360    366    3      8      Ljava/util/ConcurrentModificationException;
        //  360    366    366    367    Ljava/lang/EnumConstantNotPresentException;
        //  360    366    3      8      Any
        //  360    366    3      8      Ljava/util/NoSuchElementException;
        //  370    377    377    378    Any
        //  371    377    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  370    377    377    378    Any
        //  371    377    3      8      Any
        //  370    377    370    371    Ljava/lang/AssertionError;
        //  728    734    734    735    Any
        //  728    734    734    735    Any
        //  728    734    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  728    734    3      8      Any
        //  728    734    3      8      Ljava/lang/AssertionError;
        //  806    813    813    814    Any
        //  807    813    813    814    Any
        //  806    813    806    807    Any
        //  807    813    813    814    Ljava/lang/NullPointerException;
        //  806    813    806    807    Ljava/lang/StringIndexOutOfBoundsException;
        //  818    825    825    826    Any
        //  818    825    825    826    Any
        //  819    825    825    826    Ljava/lang/IndexOutOfBoundsException;
        //  819    825    818    819    Ljava/lang/ArithmeticException;
        //  818    825    825    826    Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:733)
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
    public IBlockState c(@Nullable final BlockPos blockPos) {
        return fbS.hu(this, 599070995, blockPos);
    }
    
    @NotNull
    public Vec2f 1() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          224
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            216
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            208
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lnet/minecraft/util/math/Vec2f;
        //    27: dup            
        //    28: aload_0        
        //    29: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //    32: getstatic       dev/nuker/pyro/fc.c:I
        //    35: ifge            44
        //    38: ldc_w           179726374
        //    41: goto            47
        //    44: ldc_w           763004566
        //    47: ldc_w           2007184636
        //    50: ixor           
        //    51: lookupswitch {
        //          1524216426: 76
        //          2098552026: 44
        //          default: 193
        //        }
        //    76: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    79: getstatic       dev/nuker/pyro/fc.1:I
        //    82: ifeq            91
        //    85: ldc_w           2062461250
        //    88: goto            94
        //    91: ldc_w           -1540091065
        //    94: ldc_w           259553703
        //    97: ixor           
        //    98: lookupswitch {
        //          -1421055264: 124
        //          1972818149: 91
        //          default: 195
        //        }
        //   124: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   127: aload_0        
        //   128: getstatic       dev/nuker/pyro/fc.c:I
        //   131: ifge            140
        //   134: ldc_w           758583376
        //   137: goto            143
        //   140: ldc_w           959617341
        //   143: ldc_w           -1035595004
        //   146: ixor           
        //   147: lookupswitch {
        //          -624191646: 140
        //          -277806252: 197
        //          default: 172
        //        }
        //   172: getfield        dev/nuker/pyro/fbg.c:Lnet/minecraft/client/Minecraft;
        //   175: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   178: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //   181: goto            185
        //   184: athrow         
        //   185: invokespecial   net/minecraft/util/math/Vec2f.<init>:(FF)V
        //   188: goto            192
        //   191: athrow         
        //   192: areturn        
        //   193: aconst_null    
        //   194: athrow         
        //   195: aconst_null    
        //   196: athrow         
        //   197: aconst_null    
        //   198: athrow         
        //   199: pop            
        //   200: goto            24
        //   203: pop            
        //   204: aconst_null    
        //   205: goto            199
        //   208: dup            
        //   209: ifnull          199
        //   212: checkcast       Ljava/lang/Throwable;
        //   215: athrow         
        //   216: dup            
        //   217: ifnull          203
        //   220: checkcast       Ljava/lang/Throwable;
        //   223: athrow         
        //   224: aconst_null    
        //   225: athrow         
        //    StackMapTable: 00 19 43 07 00 2A 04 FF 00 0B 00 00 00 01 07 00 2A FC 00 03 07 00 03 FF 00 13 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 74 FF 00 02 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 74 01 FF 00 1C 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 74 FF 00 0E 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 D5 FF 00 02 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 D5 01 FF 00 1D 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 D5 FF 00 0F 00 01 07 00 03 00 04 08 00 18 08 00 18 02 07 00 03 FF 00 02 00 01 07 00 03 00 05 08 00 18 08 00 18 02 07 00 03 01 FF 00 1C 00 01 07 00 03 00 04 08 00 18 08 00 18 02 07 00 03 4B 07 00 2A FF 00 00 00 01 07 00 03 00 04 08 00 18 08 00 18 02 02 45 07 00 2A 40 07 01 64 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 74 FF 00 01 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 D5 FF 00 01 00 01 07 00 03 00 04 08 00 18 08 00 18 02 07 00 03 41 07 00 2A 43 05 44 07 00 2A 47 05 47 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     208    216    Ljava/lang/StringIndexOutOfBoundsException;
        //  208    216    208    216    Any
        //  224    226    3      8      Any
        //  184    191    191    192    Any
        //  185    191    184    185    Any
        //  185    191    3      8      Ljava/lang/NegativeArraySizeException;
        //  185    191    3      8      Any
        //  185    191    184    185    Ljava/lang/NumberFormatException;
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
    
    public void 0(@NotNull final Vec3d vec3d, final boolean b) {
        fbS.9(this, 1486408617, vec3d, b);
    }
    
    public boolean 3(@Nullable final BlockPos blockPos) {
        return fbS.4J(this, 2044048094, blockPos);
    }
    
    @NotNull
    public Vec2f c(@NotNull final EnumFacing p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          188
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            180
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            172
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: new             Lnet/minecraft/util/math/Vec2f;
        //    29: dup            
        //    30: aload_1        
        //    31: getstatic       dev/nuker/pyro/fc.1:I
        //    34: ifeq            43
        //    37: ldc_w           -1252420702
        //    40: goto            46
        //    43: ldc_w           -760863473
        //    46: ldc_w           -593517872
        //    49: ixor           
        //    50: lookupswitch {
        //          1774596466: 161
        //          1923495476: 43
        //          default: 76
        //        }
        //    76: goto            80
        //    79: athrow         
        //    80: invokevirtual   net/minecraft/util/EnumFacing.func_185119_l:()F
        //    83: goto            87
        //    86: athrow         
        //    87: aload_1        
        //    88: getstatic       dev/nuker/pyro/fc.0:I
        //    91: ifeq            100
        //    94: ldc_w           -288266565
        //    97: goto            103
        //   100: ldc_w           727133026
        //   103: ldc_w           -989592829
        //   106: ixor           
        //   107: lookupswitch {
        //          -296540063: 132
        //          735405496: 100
        //          default: 159
        //        }
        //   132: goto            136
        //   135: athrow         
        //   136: invokevirtual   net/minecraft/util/EnumFacing.func_96559_d:()I
        //   139: goto            143
        //   142: athrow         
        //   143: bipush          90
        //   145: imul           
        //   146: i2f            
        //   147: goto            151
        //   150: athrow         
        //   151: invokespecial   net/minecraft/util/math/Vec2f.<init>:(FF)V
        //   154: goto            158
        //   157: athrow         
        //   158: areturn        
        //   159: aconst_null    
        //   160: athrow         
        //   161: aconst_null    
        //   162: athrow         
        //   163: pop            
        //   164: goto            24
        //   167: pop            
        //   168: aconst_null    
        //   169: goto            163
        //   172: dup            
        //   173: ifnull          163
        //   176: checkcast       Ljava/lang/Throwable;
        //   179: athrow         
        //   180: dup            
        //   181: ifnull          167
        //   184: checkcast       Ljava/lang/Throwable;
        //   187: athrow         
        //   188: aconst_null    
        //   189: athrow         
        //    StackMapTable: 00 1D 43 07 00 2A 04 FF 00 0B 00 00 00 01 07 00 2A FD 00 03 07 00 03 07 00 32 FF 00 12 00 02 07 00 03 07 00 32 00 03 08 00 1A 08 00 1A 07 00 32 FF 00 02 00 02 07 00 03 07 00 32 00 04 08 00 1A 08 00 1A 07 00 32 01 FF 00 1D 00 02 07 00 03 07 00 32 00 03 08 00 1A 08 00 1A 07 00 32 42 07 00 1D FF 00 00 00 02 07 00 03 07 00 32 00 03 08 00 1A 08 00 1A 07 00 32 45 07 00 2A FF 00 00 00 02 07 00 03 07 00 32 00 03 08 00 1A 08 00 1A 02 FF 00 0C 00 02 07 00 03 07 00 32 00 04 08 00 1A 08 00 1A 02 07 00 32 FF 00 02 00 02 07 00 03 07 00 32 00 05 08 00 1A 08 00 1A 02 07 00 32 01 FF 00 1C 00 02 07 00 03 07 00 32 00 04 08 00 1A 08 00 1A 02 07 00 32 42 07 00 2A FF 00 00 00 02 07 00 03 07 00 32 00 04 08 00 1A 08 00 1A 02 07 00 32 45 07 00 2A FF 00 00 00 02 07 00 03 07 00 32 00 04 08 00 1A 08 00 1A 02 01 46 07 00 2A FF 00 00 00 02 07 00 03 07 00 32 00 04 08 00 1A 08 00 1A 02 02 45 07 00 2A 40 07 01 64 FF 00 00 00 02 07 00 03 07 00 32 00 04 08 00 1A 08 00 1A 02 07 00 32 FF 00 01 00 02 07 00 03 07 00 32 00 03 08 00 1A 08 00 1A 07 00 32 41 07 00 1D 43 05 44 07 00 1D 47 05 47 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     172    180    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  172    180    172    180    Ljava/lang/ArithmeticException;
        //  188    190    3      8      Any
        //  79     86     86     87     Any
        //  79     86     79     80     Ljava/lang/RuntimeException;
        //  80     86     3      8      Any
        //  80     86     79     80     Ljava/lang/UnsupportedOperationException;
        //  79     86     3      8      Any
        //  135    142    142    143    Any
        //  135    142    135    136    Any
        //  136    142    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  135    142    3      8      Any
        //  135    142    135    136    Any
        //  150    157    157    158    Any
        //  151    157    150    151    Any
        //  151    157    150    151    Any
        //  150    157    157    158    Any
        //  151    157    3      8      Any
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
}
