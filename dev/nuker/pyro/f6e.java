// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EnumPlayerModelParts;
import java.util.Set;

public class f6E extends fH
{
    public f0d c;
    public f0a c;
    public Set<EnumPlayerModelParts> c;
    public fbu c;
    
    static {
        throw t;
    }
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          574
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            566
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            558
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: aload_2        
        //    27: aload_3        
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //    35: goto            39
        //    38: athrow         
        //    39: aload_0        
        //    40: getfield        dev/nuker/pyro/f6E.c:Lnet/minecraft/client/Minecraft;
        //    43: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //    46: ifnonnull       50
        //    49: return         
        //    50: aload_0        
        //    51: getfield        dev/nuker/pyro/f6E.c:Ljava/util/Set;
        //    54: ifnonnull       121
        //    57: aload_0        
        //    58: getstatic       dev/nuker/pyro/fc.c:I
        //    61: ifge            69
        //    64: ldc             -158392791
        //    66: goto            71
        //    69: ldc             -1681952376
        //    71: ldc             1181382025
        //    73: ixor           
        //    74: lookupswitch {
        //          -1327141984: 547
        //          -614979289: 69
        //          default: 100
        //        }
        //   100: aload_0        
        //   101: getfield        dev/nuker/pyro/f6E.c:Lnet/minecraft/client/Minecraft;
        //   104: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //   107: goto            111
        //   110: athrow         
        //   111: invokevirtual   net/minecraft/client/settings/GameSettings.func_178876_d:()Ljava/util/Set;
        //   114: goto            118
        //   117: athrow         
        //   118: putfield        dev/nuker/pyro/f6E.c:Ljava/util/Set;
        //   121: iload_1        
        //   122: ifne            532
        //   125: aload_0        
        //   126: getfield        dev/nuker/pyro/f6E.c:Lnet/minecraft/client/Minecraft;
        //   129: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   132: ifnull          532
        //   135: goto            139
        //   138: athrow         
        //   139: invokestatic    net/minecraft/entity/player/EnumPlayerModelParts.values:()[Lnet/minecraft/entity/player/EnumPlayerModelParts;
        //   142: goto            146
        //   145: athrow         
        //   146: dup            
        //   147: getstatic       dev/nuker/pyro/fc.c:I
        //   150: ifge            158
        //   153: ldc             -1364301421
        //   155: goto            160
        //   158: ldc             1244413385
        //   160: ldc             -925987065
        //   162: ixor           
        //   163: lookupswitch {
        //          -2099072306: 188
        //          1717626516: 158
        //          default: 539
        //        }
        //   188: astore          4
        //   190: arraylength    
        //   191: getstatic       dev/nuker/pyro/fc.c:I
        //   194: ifge            202
        //   197: ldc             887450204
        //   199: goto            204
        //   202: ldc             -734665570
        //   204: ldc             785335808
        //   206: ixor           
        //   207: lookupswitch {
        //          -84237666: 232
        //          438971484: 202
        //          default: 533
        //        }
        //   232: istore          5
        //   234: iconst_0       
        //   235: istore          6
        //   237: iconst_0       
        //   238: istore          7
        //   240: iload           6
        //   242: iload           5
        //   244: if_icmpge       532
        //   247: aload           4
        //   249: iload           7
        //   251: aaload         
        //   252: getstatic       dev/nuker/pyro/fc.0:I
        //   255: ifeq            263
        //   258: ldc             -279277969
        //   260: goto            265
        //   263: ldc             -131559205
        //   265: ldc             267871610
        //   267: ixor           
        //   268: lookupswitch {
        //          -1621944239: 263
        //          -525473003: 537
        //          default: 296
        //        }
        //   296: astore          8
        //   298: aload_0        
        //   299: getfield        dev/nuker/pyro/f6E.c:Lnet/minecraft/client/Minecraft;
        //   302: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //   305: getstatic       dev/nuker/pyro/fc.0:I
        //   308: ifeq            316
        //   311: ldc             473756946
        //   313: goto            318
        //   316: ldc             652729135
        //   318: ldc             1859484272
        //   320: ixor           
        //   321: lookupswitch {
        //          1211277663: 348
        //          1927909218: 316
        //          default: 541
        //        }
        //   348: astore          9
        //   350: getstatic       dev/nuker/pyro/fc.c:I
        //   353: ifge            361
        //   356: ldc             638233478
        //   358: goto            363
        //   361: ldc             -531299316
        //   363: ldc             1712741603
        //   365: ixor           
        //   366: lookupswitch {
        //          -2042406673: 392
        //          1075640165: 361
        //          default: 535
        //        }
        //   392: aload_0        
        //   393: getfield        dev/nuker/pyro/f6E.c:Ljava/util/Set;
        //   396: getstatic       dev/nuker/pyro/fc.c:I
        //   399: ifge            407
        //   402: ldc             -1910403357
        //   404: goto            409
        //   407: ldc             -1365771941
        //   409: ldc             -1077778935
        //   411: ixor           
        //   412: lookupswitch {
        //          -1154781834: 407
        //          837019882: 545
        //          default: 440
        //        }
        //   440: astore          10
        //   442: aload           8
        //   444: getstatic       dev/nuker/pyro/fc.0:I
        //   447: ifeq            455
        //   450: ldc             -1219428919
        //   452: goto            457
        //   455: ldc             -1366381087
        //   457: ldc             1424059971
        //   459: ixor           
        //   460: lookupswitch {
        //          -474901622: 455
        //          -93338718: 488
        //          default: 543
        //        }
        //   488: astore          11
        //   490: iinc            7, 1
        //   493: aload           9
        //   495: aload           11
        //   497: aload           10
        //   499: aload           11
        //   501: goto            505
        //   504: athrow         
        //   505: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   510: goto            514
        //   513: athrow         
        //   514: goto            518
        //   517: athrow         
        //   518: invokevirtual   net/minecraft/client/settings/GameSettings.func_178878_a:(Lnet/minecraft/entity/player/EnumPlayerModelParts;Z)V
        //   521: goto            525
        //   524: athrow         
        //   525: iload           7
        //   527: istore          6
        //   529: goto            240
        //   532: return         
        //   533: aconst_null    
        //   534: athrow         
        //   535: aconst_null    
        //   536: athrow         
        //   537: aconst_null    
        //   538: athrow         
        //   539: aconst_null    
        //   540: athrow         
        //   541: aconst_null    
        //   542: athrow         
        //   543: aconst_null    
        //   544: athrow         
        //   545: aconst_null    
        //   546: athrow         
        //   547: aconst_null    
        //   548: athrow         
        //   549: pop            
        //   550: goto            24
        //   553: pop            
        //   554: aconst_null    
        //   555: goto            549
        //   558: dup            
        //   559: ifnull          549
        //   562: checkcast       Ljava/lang/Throwable;
        //   565: athrow         
        //   566: dup            
        //   567: ifnull          553
        //   570: checkcast       Ljava/lang/Throwable;
        //   573: athrow         
        //   574: aconst_null    
        //   575: athrow         
        //    RuntimeInvisibleTypeAnnotations: 00 02 16 01 00 00 0F 00 00 16 02 00 00 0F 00 00
        //    StackMapTable: 00 41 43 07 00 2A 04 FF 00 0B 00 00 00 01 07 00 2A FF 00 03 00 04 07 00 03 01 07 00 6E 07 00 70 00 00 46 07 00 15 FF 00 00 00 04 07 00 03 01 07 00 6E 07 00 70 00 04 07 00 03 01 07 00 6E 07 00 70 45 07 00 2A 00 0A 52 07 00 03 FF 00 01 00 04 07 00 03 01 07 00 6E 07 00 70 00 02 07 00 03 01 5C 07 00 03 49 07 00 19 FF 00 00 00 04 07 00 03 01 07 00 6E 07 00 70 00 02 07 00 03 07 00 3C 45 07 00 2A FF 00 00 00 04 07 00 03 01 07 00 6E 07 00 70 00 02 07 00 03 07 00 64 02 50 07 00 21 00 45 07 00 2A 40 07 00 72 FF 00 0B 00 04 07 00 03 01 07 00 6E 07 00 70 00 02 07 00 72 07 00 72 FF 00 01 00 04 07 00 03 01 07 00 6E 07 00 70 00 03 07 00 72 07 00 72 01 FF 00 1B 00 04 07 00 03 01 07 00 6E 07 00 70 00 02 07 00 72 07 00 72 FF 00 0D 00 05 07 00 03 01 07 00 6E 07 00 70 07 00 72 00 01 01 FF 00 01 00 05 07 00 03 01 07 00 6E 07 00 70 07 00 72 00 02 01 01 5B 01 FE 00 07 01 01 01 56 07 00 46 FF 00 01 00 08 07 00 03 01 07 00 6E 07 00 70 07 00 72 01 01 01 00 02 07 00 46 01 5E 07 00 46 FF 00 13 00 09 07 00 03 01 07 00 6E 07 00 70 07 00 72 01 01 01 07 00 46 00 01 07 00 3C FF 00 01 00 09 07 00 03 01 07 00 6E 07 00 70 07 00 72 01 01 01 07 00 46 00 02 07 00 3C 01 5D 07 00 3C FC 00 0C 07 00 3C 41 01 1C 4E 07 00 64 FF 00 01 00 0A 07 00 03 01 07 00 6E 07 00 70 07 00 72 01 01 01 07 00 46 07 00 3C 00 02 07 00 64 01 5E 07 00 64 FF 00 0E 00 0B 07 00 03 01 07 00 6E 07 00 70 07 00 72 01 01 01 07 00 46 07 00 3C 07 00 64 00 01 07 00 46 FF 00 01 00 0B 07 00 03 01 07 00 6E 07 00 70 07 00 72 01 01 01 07 00 46 07 00 3C 07 00 64 00 02 07 00 46 01 5E 07 00 46 FF 00 0F 00 0C 07 00 03 01 07 00 6E 07 00 70 07 00 72 01 01 01 07 00 46 07 00 3C 07 00 64 07 00 46 00 01 07 00 1F FF 00 00 00 0C 07 00 03 01 07 00 6E 07 00 70 07 00 72 01 01 01 07 00 46 07 00 3C 07 00 64 07 00 46 00 04 07 00 3C 07 00 46 07 00 64 07 00 46 47 07 00 2A FF 00 00 00 0C 07 00 03 01 07 00 6E 07 00 70 07 00 72 01 01 01 07 00 46 07 00 3C 07 00 64 07 00 46 00 03 07 00 3C 07 00 46 01 42 07 00 2A FF 00 00 00 0C 07 00 03 01 07 00 6E 07 00 70 07 00 72 01 01 01 07 00 46 07 00 3C 07 00 64 07 00 46 00 03 07 00 3C 07 00 46 01 45 07 00 2A 00 FF 00 06 00 04 07 00 03 01 07 00 6E 07 00 70 00 00 FF 00 00 00 05 07 00 03 01 07 00 6E 07 00 70 07 00 72 00 01 01 FF 00 01 00 0A 07 00 03 01 07 00 6E 07 00 70 07 00 72 01 01 01 07 00 46 07 00 3C 00 00 FF 00 01 00 08 07 00 03 01 07 00 6E 07 00 70 07 00 72 01 01 01 00 01 07 00 46 FF 00 01 00 04 07 00 03 01 07 00 6E 07 00 70 00 02 07 00 72 07 00 72 FF 00 01 00 09 07 00 03 01 07 00 6E 07 00 70 07 00 72 01 01 01 07 00 46 00 01 07 00 3C FF 00 01 00 0B 07 00 03 01 07 00 6E 07 00 70 07 00 72 01 01 01 07 00 46 07 00 3C 07 00 64 00 01 07 00 46 FF 00 01 00 0A 07 00 03 01 07 00 6E 07 00 70 07 00 72 01 01 01 07 00 46 07 00 3C 00 01 07 00 64 FF 00 01 00 04 07 00 03 01 07 00 6E 07 00 70 00 01 07 00 03 41 07 00 2A 43 05 44 07 00 2A 47 05 47 07 00 2A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     558    566    Ljava/util/NoSuchElementException;
        //  558    566    558    566    Any
        //  574    576    3      8      Ljava/lang/NumberFormatException;
        //  31     38     38     39     Any
        //  32     38     3      8      Any
        //  32     38     31     32     Ljava/lang/IndexOutOfBoundsException;
        //  32     38     38     39     Ljava/lang/ArithmeticException;
        //  31     38     38     39     Any
        //  110    117    117    118    Any
        //  110    117    117    118    Any
        //  110    117    3      8      Any
        //  111    117    3      8      Ljava/lang/ArithmeticException;
        //  110    117    110    111    Ljava/lang/ClassCastException;
        //  138    145    145    146    Any
        //  139    145    3      8      Ljava/lang/NullPointerException;
        //  139    145    145    146    Ljava/lang/IllegalArgumentException;
        //  139    145    145    146    Ljava/lang/StringIndexOutOfBoundsException;
        //  139    145    138    139    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  504    513    513    514    Any
        //  505    513    504    505    Ljava/lang/StringIndexOutOfBoundsException;
        //  505    513    513    514    Ljava/lang/UnsupportedOperationException;
        //  504    513    513    514    Any
        //  505    513    513    514    Ljava/lang/IndexOutOfBoundsException;
        //  517    524    524    525    Any
        //  518    524    3      8      Any
        //  517    524    517    518    Any
        //  518    524    517    518    Any
        //  517    524    517    518    Any
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
    
    public f6E() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u23ce\u1498\u8ac5\ub3d7\uc990\uedd7\ub22d\ue6ef\ud963"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u23ee\u1498\u8ac5\ub3d7\uc990\uedd7\ub22d\ue6ef\ud963"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: aconst_null    
        //    12: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    15: getstatic       dev/nuker/pyro/fc.c:I
        //    18: ifge            26
        //    21: ldc             1567584088
        //    23: goto            28
        //    26: ldc             631162603
        //    28: ldc             -1640227090
        //    30: ixor           
        //    31: lookupswitch {
        //          -1017941578: 309
        //          -292160523: 26
        //          default: 56
        //        }
        //    56: aload_0        
        //    57: aload_0        
        //    58: new             Ldev/nuker/pyro/f0d;
        //    61: dup            
        //    62: ldc             "\u23d9\u1496\u8ac0\ub3d8\uc9ab"
        //    64: invokestatic    invokestatic   !!! ERROR
        //    67: ldc             "\u23f9\u1496\u8ac0\ub3d8\uc9ab"
        //    69: getstatic       dev/nuker/pyro/fc.1:I
        //    72: ifeq            80
        //    75: ldc             2060922022
        //    77: goto            82
        //    80: ldc             -1698222260
        //    82: ldc             156088686
        //    84: ixor           
        //    85: lookupswitch {
        //          -1819634142: 112
        //          1939510728: 80
        //          default: 311
        //        }
        //   112: invokestatic    invokestatic   !!! ERROR
        //   115: aconst_null    
        //   116: ldc2_w          0.1
        //   119: dconst_0       
        //   120: ldc2_w          20.0
        //   123: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   126: invokevirtual   dev/nuker/pyro/f6E.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   129: checkcast       Ldev/nuker/pyro/f0d;
        //   132: putfield        dev/nuker/pyro/f6E.c:Ldev/nuker/pyro/f0d;
        //   135: getstatic       dev/nuker/pyro/fc.0:I
        //   138: ifeq            146
        //   141: ldc             1534100588
        //   143: goto            148
        //   146: ldc             1649663692
        //   148: ldc             -1086996928
        //   150: ixor           
        //   151: lookupswitch {
        //          -465225172: 307
        //          2144366748: 146
        //          default: 176
        //        }
        //   176: aload_0        
        //   177: getstatic       dev/nuker/pyro/fc.0:I
        //   180: ifeq            188
        //   183: ldc             -2029654596
        //   185: goto            190
        //   188: ldc             -2079446092
        //   190: ldc             1444134355
        //   192: ixor           
        //   193: lookupswitch {
        //          -787066769: 188
        //          -769812889: 220
        //          default: 305
        //        }
        //   220: aload_0        
        //   221: new             Ldev/nuker/pyro/f0a;
        //   224: dup            
        //   225: ldc             "\u23cf\u1492\u8ac2\ub3dd\uc9bd\uedd6"
        //   227: invokestatic    invokestatic   !!! ERROR
        //   230: ldc             "\u23ef\u1492\u8ac2\ub3dd\uc9bd\uedd6"
        //   232: invokestatic    invokestatic   !!! ERROR
        //   235: aconst_null    
        //   236: iconst_0       
        //   237: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   240: invokevirtual   dev/nuker/pyro/f6E.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   243: checkcast       Ldev/nuker/pyro/f0a;
        //   246: putfield        dev/nuker/pyro/f6E.c:Ldev/nuker/pyro/f0a;
        //   249: aload_0        
        //   250: new             Ldev/nuker/pyro/fbu;
        //   253: dup            
        //   254: getstatic       dev/nuker/pyro/fc.c:I
        //   257: ifge            265
        //   260: ldc             -854885105
        //   262: goto            267
        //   265: ldc             329947057
        //   267: ldc             1605967793
        //   269: ixor           
        //   270: lookupswitch {
        //          -1945104097: 265
        //          -1833803074: 303
        //          default: 296
        //        }
        //   296: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   299: putfield        dev/nuker/pyro/f6E.c:Ldev/nuker/pyro/fbu;
        //   302: return         
        //   303: aconst_null    
        //   304: athrow         
        //   305: aconst_null    
        //   306: athrow         
        //   307: aconst_null    
        //   308: athrow         
        //   309: aconst_null    
        //   310: athrow         
        //   311: aconst_null    
        //   312: athrow         
        //    StackMapTable: 00 14 FF 00 1A 00 01 07 00 03 00 00 41 01 1B FF 00 17 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 3A 08 00 3A 07 00 B7 07 00 B7 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 3A 08 00 3A 07 00 B7 07 00 B7 01 FF 00 1D 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 3A 08 00 3A 07 00 B7 07 00 B7 21 41 01 1B 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 FF 00 2C 00 01 07 00 03 00 03 07 00 03 08 00 FA 08 00 FA FF 00 01 00 01 07 00 03 00 04 07 00 03 08 00 FA 08 00 FA 01 FF 00 1C 00 01 07 00 03 00 03 07 00 03 08 00 FA 08 00 FA FF 00 06 00 01 07 00 03 00 03 07 00 03 08 00 FA 08 00 FA 41 07 00 03 01 01 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 3A 08 00 3A 07 00 B7 07 00 B7
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
    
    @f06
    @LauncherEventHide
    public void c(final f3h f3h) {
        fbS.hH(this, 594014788, f3h);
    }
}
