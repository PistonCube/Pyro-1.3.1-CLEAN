// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.network.NetworkPlayerInfo;
import java.util.Comparator;

public class f4K implements Comparator
{
    static {
        throw t;
    }
    
    @Override
    public int compare(final Object p0, final Object p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          115
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            107
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            99
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            36
        //    31: ldc             1249771712
        //    33: goto            38
        //    36: ldc             -681183026
        //    38: ldc             1818687364
        //    40: ixor           
        //    41: lookupswitch {
        //          -1157427382: 68
        //          639170372: 36
        //          default: 88
        //        }
        //    68: aload_1        
        //    69: checkcast       Lnet/minecraft/client/network/NetworkPlayerInfo;
        //    72: aload_2        
        //    73: checkcast       Lnet/minecraft/client/network/NetworkPlayerInfo;
        //    76: goto            80
        //    79: athrow         
        //    80: invokevirtual   dev/nuker/pyro/f4K.c:(Lnet/minecraft/client/network/NetworkPlayerInfo;Lnet/minecraft/client/network/NetworkPlayerInfo;)I
        //    83: goto            87
        //    86: athrow         
        //    87: ireturn        
        //    88: aconst_null    
        //    89: athrow         
        //    90: pop            
        //    91: goto            24
        //    94: pop            
        //    95: aconst_null    
        //    96: goto            90
        //    99: dup            
        //   100: ifnull          90
        //   103: checkcast       Ljava/lang/Throwable;
        //   106: athrow         
        //   107: dup            
        //   108: ifnull          94
        //   111: checkcast       Ljava/lang/Throwable;
        //   114: athrow         
        //   115: aconst_null    
        //   116: athrow         
        //    StackMapTable: 00 11 43 07 00 17 04 FF 00 0B 00 00 00 01 07 00 17 FE 00 03 07 00 03 07 00 05 07 00 05 4B 07 00 03 FF 00 01 00 03 07 00 03 07 00 05 07 00 05 00 02 07 00 03 01 5D 07 00 03 FF 00 0A 00 00 00 01 07 00 17 FF 00 00 00 03 07 00 03 07 00 05 07 00 05 00 03 07 00 03 07 00 1F 07 00 1F 45 07 00 17 40 01 40 07 00 03 41 07 00 17 43 05 44 07 00 17 47 05 47 07 00 17
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  8      20     99     107    Any
        //  99     107    99     107    Ljava/lang/ClassCastException;
        //  115    117    3      8      Any
        //  80     86     86     87     Any
        //  80     86     3      8      Any
        //  80     86     86     87     Any
        //  80     86     3      8      Ljava/lang/IllegalStateException;
        //  80     86     86     87     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 38 out of bounds for length 38
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
    
    public int c(final NetworkPlayerInfo p0, final NetworkPlayerInfo p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          648
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            640
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            632
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   net/minecraft/client/network/NetworkPlayerInfo.func_178850_i:()Lnet/minecraft/scoreboard/ScorePlayerTeam;
        //    32: goto            36
        //    35: athrow         
        //    36: astore_3       
        //    37: getstatic       dev/nuker/pyro/fc.c:I
        //    40: ifge            48
        //    43: ldc             594701841
        //    45: goto            50
        //    48: ldc             -407358074
        //    50: ldc             748623270
        //    52: ixor           
        //    53: lookupswitch {
        //          -886628320: 80
        //          267221943: 48
        //          default: 609
        //        }
        //    80: aload_2        
        //    81: getstatic       dev/nuker/pyro/fc.0:I
        //    84: ifeq            92
        //    87: ldc             564005417
        //    89: goto            94
        //    92: ldc             784188613
        //    94: ldc             -33811209
        //    96: ixor           
        //    97: lookupswitch {
        //          -1318480940: 92
        //          -597549346: 611
        //          default: 124
        //        }
        //   124: goto            128
        //   127: athrow         
        //   128: invokevirtual   net/minecraft/client/network/NetworkPlayerInfo.func_178850_i:()Lnet/minecraft/scoreboard/ScorePlayerTeam;
        //   131: goto            135
        //   134: athrow         
        //   135: astore          4
        //   137: goto            141
        //   140: athrow         
        //   141: invokestatic    com/google/common/collect/ComparisonChain.start:()Lcom/google/common/collect/ComparisonChain;
        //   144: goto            148
        //   147: athrow         
        //   148: aload_1        
        //   149: goto            153
        //   152: athrow         
        //   153: invokevirtual   net/minecraft/client/network/NetworkPlayerInfo.func_178848_b:()Lnet/minecraft/world/GameType;
        //   156: goto            160
        //   159: athrow         
        //   160: getstatic       dev/nuker/pyro/fc.1:I
        //   163: ifeq            171
        //   166: ldc             -1316586278
        //   168: goto            173
        //   171: ldc             1970357625
        //   173: ldc             1987240782
        //   175: ixor           
        //   176: lookupswitch {
        //          -940269676: 171
        //          50570807: 204
        //          default: 619
        //        }
        //   204: getstatic       net/minecraft/world/GameType.SPECTATOR:Lnet/minecraft/world/GameType;
        //   207: if_acmpeq       215
        //   210: ldc             1081695857
        //   212: goto            217
        //   215: ldc             1081695858
        //   217: ldc             -299063172
        //   219: ixor           
        //   220: tableswitch {
        //          1554770970: 244
        //          1554770971: 248
        //          default: 210
        //        }
        //   244: iconst_1       
        //   245: goto            249
        //   248: iconst_0       
        //   249: aload_2        
        //   250: goto            254
        //   253: athrow         
        //   254: invokevirtual   net/minecraft/client/network/NetworkPlayerInfo.func_178848_b:()Lnet/minecraft/world/GameType;
        //   257: goto            261
        //   260: athrow         
        //   261: getstatic       net/minecraft/world/GameType.SPECTATOR:Lnet/minecraft/world/GameType;
        //   264: if_acmpeq       272
        //   267: ldc             1279225258
        //   269: goto            274
        //   272: ldc             1279225259
        //   274: ldc             -619564344
        //   276: ixor           
        //   277: tableswitch {
        //          777699012: 300
        //          777699013: 304
        //          default: 267
        //        }
        //   300: iconst_1       
        //   301: goto            305
        //   304: iconst_0       
        //   305: goto            309
        //   308: athrow         
        //   309: invokevirtual   com/google/common/collect/ComparisonChain.compareTrueFirst:(ZZ)Lcom/google/common/collect/ComparisonChain;
        //   312: goto            316
        //   315: athrow         
        //   316: aload_3        
        //   317: ifnull          335
        //   320: aload_3        
        //   321: goto            325
        //   324: athrow         
        //   325: invokevirtual   net/minecraft/scoreboard/ScorePlayerTeam.func_96661_b:()Ljava/lang/String;
        //   328: goto            332
        //   331: athrow         
        //   332: goto            337
        //   335: ldc             ""
        //   337: aload           4
        //   339: ifnull          400
        //   342: getstatic       dev/nuker/pyro/fc.0:I
        //   345: ifeq            353
        //   348: ldc             762852804
        //   350: goto            355
        //   353: ldc             478885802
        //   355: ldc             -1393645679
        //   357: ixor           
        //   358: lookupswitch {
        //          -2120838571: 353
        //          -1335521221: 384
        //          default: 621
        //        }
        //   384: aload           4
        //   386: goto            390
        //   389: athrow         
        //   390: invokevirtual   net/minecraft/scoreboard/ScorePlayerTeam.func_96661_b:()Ljava/lang/String;
        //   393: goto            397
        //   396: athrow         
        //   397: goto            402
        //   400: ldc             ""
        //   402: goto            406
        //   405: athrow         
        //   406: invokevirtual   com/google/common/collect/ComparisonChain.compare:(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lcom/google/common/collect/ComparisonChain;
        //   409: goto            413
        //   412: athrow         
        //   413: getstatic       dev/nuker/pyro/fc.0:I
        //   416: ifeq            424
        //   419: ldc             1979290171
        //   421: goto            426
        //   424: ldc             -1016494654
        //   426: ldc             -1440281844
        //   428: ixor           
        //   429: lookupswitch {
        //          -539059913: 424
        //          1766756046: 456
        //          default: 613
        //        }
        //   456: aload_1        
        //   457: getstatic       dev/nuker/pyro/fc.0:I
        //   460: ifeq            468
        //   463: ldc             1527509136
        //   465: goto            470
        //   468: ldc             242937403
        //   470: ldc             1396230118
        //   472: ixor           
        //   473: lookupswitch {
        //          137574262: 468
        //          1564617181: 500
        //          default: 615
        //        }
        //   500: goto            504
        //   503: athrow         
        //   504: invokevirtual   net/minecraft/client/network/NetworkPlayerInfo.func_178845_a:()Lcom/mojang/authlib/GameProfile;
        //   507: goto            511
        //   510: athrow         
        //   511: getstatic       dev/nuker/pyro/fc.1:I
        //   514: ifeq            522
        //   517: ldc             1294313972
        //   519: goto            524
        //   522: ldc             -2144924902
        //   524: ldc             1313823628
        //   526: ixor           
        //   527: lookupswitch {
        //          -832024426: 552
        //          57340536: 522
        //          default: 617
        //        }
        //   552: goto            556
        //   555: athrow         
        //   556: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //   559: goto            563
        //   562: athrow         
        //   563: aload_2        
        //   564: goto            568
        //   567: athrow         
        //   568: invokevirtual   net/minecraft/client/network/NetworkPlayerInfo.func_178845_a:()Lcom/mojang/authlib/GameProfile;
        //   571: goto            575
        //   574: athrow         
        //   575: goto            579
        //   578: athrow         
        //   579: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //   582: goto            586
        //   585: athrow         
        //   586: goto            590
        //   589: athrow         
        //   590: invokevirtual   com/google/common/collect/ComparisonChain.compare:(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lcom/google/common/collect/ComparisonChain;
        //   593: goto            597
        //   596: athrow         
        //   597: goto            601
        //   600: athrow         
        //   601: invokevirtual   com/google/common/collect/ComparisonChain.result:()I
        //   604: goto            608
        //   607: athrow         
        //   608: ireturn        
        //   609: aconst_null    
        //   610: athrow         
        //   611: aconst_null    
        //   612: athrow         
        //   613: aconst_null    
        //   614: athrow         
        //   615: aconst_null    
        //   616: athrow         
        //   617: aconst_null    
        //   618: athrow         
        //   619: aconst_null    
        //   620: athrow         
        //   621: aconst_null    
        //   622: athrow         
        //   623: pop            
        //   624: goto            24
        //   627: pop            
        //   628: aconst_null    
        //   629: goto            623
        //   632: dup            
        //   633: ifnull          623
        //   636: checkcast       Ljava/lang/Throwable;
        //   639: athrow         
        //   640: dup            
        //   641: ifnull          627
        //   644: checkcast       Ljava/lang/Throwable;
        //   647: athrow         
        //   648: aconst_null    
        //   649: athrow         
        //    StackMapTable: 00 71 43 07 00 17 04 FF 00 0B 00 00 00 01 07 00 17 FE 00 03 07 00 03 07 00 1F 07 00 1F 43 07 00 34 40 07 00 1F 45 07 00 17 40 07 00 66 FC 00 0B 07 00 66 41 01 1D 4B 07 00 1F FF 00 01 00 04 07 00 03 07 00 1F 07 00 1F 07 00 66 00 02 07 00 1F 01 5D 07 00 1F 42 07 00 17 40 07 00 1F 45 07 00 17 40 07 00 66 FF 00 04 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 01 07 00 17 00 45 07 00 17 40 07 00 49 43 07 00 17 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 1F 45 07 00 17 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 56 FF 00 0A 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 56 FF 00 01 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 07 00 56 01 FF 00 1E 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 56 45 07 00 49 44 07 00 49 FF 00 01 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 01 5A 07 00 49 43 07 00 49 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 01 43 07 00 17 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 01 07 00 1F 45 07 00 17 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 01 07 00 56 FF 00 05 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 01 FF 00 04 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 01 FF 00 01 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 01 01 FF 00 19 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 01 FF 00 03 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 01 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 01 01 42 07 00 17 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 01 01 45 07 00 17 40 07 00 49 47 07 00 17 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 66 45 07 00 17 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 8A 42 07 00 49 FF 00 01 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 8A FF 00 0F 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 8A FF 00 01 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 07 00 8A 01 FF 00 1C 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 8A 44 07 00 36 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 07 00 8A 07 00 66 45 07 00 17 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 07 00 8A 07 00 8A FF 00 02 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 8A FF 00 01 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 07 00 8A 07 00 8A 42 07 00 17 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 07 00 8A 07 00 8A 45 07 00 17 40 07 00 49 4A 07 00 49 FF 00 01 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 01 5D 07 00 49 FF 00 0B 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 1F FF 00 01 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 07 00 1F 01 FF 00 1D 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 1F 42 07 00 24 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 1F 45 07 00 17 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 81 FF 00 0A 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 81 FF 00 01 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 07 00 81 01 FF 00 1B 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 81 42 07 00 17 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 81 45 07 00 17 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 8A 43 07 00 17 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 07 00 8A 07 00 1F 45 07 00 17 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 07 00 8A 07 00 81 42 07 00 36 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 07 00 8A 07 00 81 45 07 00 17 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 07 00 8A 07 00 8A 42 07 00 34 FF 00 00 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 03 07 00 49 07 00 8A 07 00 8A 45 07 00 17 40 07 00 49 42 07 00 32 40 07 00 49 45 07 00 17 40 01 FA 00 00 41 07 00 1F FF 00 01 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 01 07 00 49 FF 00 01 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 1F FF 00 01 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 81 FF 00 01 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 56 FF 00 01 00 05 07 00 03 07 00 1F 07 00 1F 07 00 66 07 00 66 00 02 07 00 49 07 00 8A FF 00 01 00 03 07 00 03 07 00 1F 07 00 1F 00 01 07 00 17 43 05 44 07 00 17 47 05 47 07 00 17
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     632    640    Any
        //  632    640    632    640    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  648    650    3      8      Any
        //  28     35     35     36     Any
        //  29     35     28     29     Ljava/util/NoSuchElementException;
        //  28     35     3      8      Any
        //  29     35     28     29     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  28     35     35     36     Ljava/lang/EnumConstantNotPresentException;
        //  127    134    134    135    Any
        //  128    134    127    128    Any
        //  128    134    3      8      Any
        //  127    134    3      8      Any
        //  128    134    3      8      Ljava/lang/NumberFormatException;
        //  140    147    147    148    Any
        //  141    147    147    148    Ljava/lang/IllegalStateException;
        //  141    147    140    141    Any
        //  140    147    3      8      Any
        //  141    147    140    141    Any
        //  152    159    159    160    Any
        //  152    159    159    160    Any
        //  152    159    152    153    Any
        //  152    159    3      8      Ljava/util/NoSuchElementException;
        //  153    159    159    160    Any
        //  253    260    260    261    Any
        //  253    260    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  254    260    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  254    260    253    254    Any
        //  253    260    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  308    315    315    316    Any
        //  308    315    308    309    Ljava/lang/NegativeArraySizeException;
        //  308    315    315    316    Any
        //  308    315    308    309    Any
        //  308    315    315    316    Ljava/lang/ArithmeticException;
        //  324    331    331    332    Any
        //  325    331    324    325    Ljava/lang/AssertionError;
        //  325    331    324    325    Ljava/lang/EnumConstantNotPresentException;
        //  325    331    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  324    331    331    332    Ljava/lang/RuntimeException;
        //  389    396    396    397    Any
        //  389    396    3      8      Ljava/util/NoSuchElementException;
        //  389    396    3      8      Ljava/lang/ClassCastException;
        //  390    396    3      8      Any
        //  389    396    389    390    Ljava/lang/UnsupportedOperationException;
        //  405    412    412    413    Any
        //  405    412    412    413    Ljava/lang/ArithmeticException;
        //  406    412    405    406    Ljava/lang/StringIndexOutOfBoundsException;
        //  406    412    405    406    Any
        //  405    412    3      8      Any
        //  503    510    510    511    Any
        //  504    510    503    504    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  504    510    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  503    510    3      8      Ljava/lang/ArithmeticException;
        //  504    510    510    511    Ljava/lang/NumberFormatException;
        //  555    562    562    563    Any
        //  555    562    555    556    Any
        //  555    562    562    563    Any
        //  555    562    555    556    Any
        //  555    562    562    563    Ljava/lang/UnsupportedOperationException;
        //  567    574    574    575    Any
        //  568    574    3      8      Any
        //  567    574    567    568    Any
        //  567    574    3      8      Any
        //  567    574    3      8      Ljava/lang/NullPointerException;
        //  578    585    585    586    Any
        //  579    585    3      8      Any
        //  579    585    585    586    Ljava/util/NoSuchElementException;
        //  578    585    3      8      Ljava/lang/NullPointerException;
        //  579    585    578    579    Ljava/lang/UnsupportedOperationException;
        //  589    596    596    597    Any
        //  589    596    596    597    Any
        //  590    596    589    590    Ljava/lang/ClassCastException;
        //  589    596    589    590    Ljava/lang/RuntimeException;
        //  590    596    3      8      Any
        //  600    607    607    608    Any
        //  600    607    600    601    Ljava/lang/IndexOutOfBoundsException;
        //  600    607    607    608    Any
        //  601    607    3      8      Ljava/lang/RuntimeException;
        //  601    607    3      8      Ljava/lang/IndexOutOfBoundsException;
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
    
    public f4K() {
    }
    
    public f4K(final f4J f4J) {
        this();
    }
}
