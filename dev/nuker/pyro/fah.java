// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;

public class faH extends fH
{
    public faH() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u2936\u1487\u8035\ub3ca\uc662\ue725\ub22d\uec17\ud96c\ue61c\uadf1"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u2916\u1487\u8035\ub3ca\uc662\ue705\ub22d\uec17\ud96c\ue61c\uadf1"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: ldc             "\u2909\u149c\u8033\ub3ca\uc62a\ue730\ub230\uec18\ud97b\ue611\uade6\u1e5f\ueb7d\uc5b3\u8e96\u83b9\u57b0\u7d9c\ubd24\ucfaa\u21c2\uc27b\u60d8\u2d59\ud87a\u3f44"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: getstatic       dev/nuker/pyro/fc.1:I
        //    19: ifeq            27
        //    22: ldc             -252892800
        //    24: goto            29
        //    27: ldc             -801899118
        //    29: ldc             -1283466400
        //    31: ixor           
        //    32: lookupswitch {
        //          1133703904: 64
        //          1247818771: 27
        //          default: 60
        //        }
        //    60: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    63: return         
        //    64: aconst_null    
        //    65: athrow         
        //    StackMapTable: 00 04 FF 00 1B 00 01 06 00 04 06 07 00 21 07 00 21 07 00 21 FF 00 01 00 01 06 00 05 06 07 00 21 07 00 21 07 00 21 01 FF 00 1E 00 01 06 00 04 06 07 00 21 07 00 21 07 00 21 FF 00 03 00 01 06 00 04 06 07 00 21 07 00 21 07 00 21
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:881)
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
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          543
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            535
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            527
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iload_1        
        //    25: ifeq            507
        //    28: new             Lcom/google/gson/Gson;
        //    31: dup            
        //    32: goto            36
        //    35: athrow         
        //    36: invokespecial   com/google/gson/Gson.<init>:()V
        //    39: goto            43
        //    42: athrow         
        //    43: astore          4
        //    45: new             Ljava/io/File;
        //    48: dup            
        //    49: ldc             "\u2936\u1487\u8035\ub1db\uc491\ue725\ub22d\uec17\udb7d\ue4ef\uadf1\u1e02\ueb37\uc7a5\u8c62\u83b6"
        //    51: goto            55
        //    54: athrow         
        //    55: invokestatic    invokestatic   !!! ERROR
        //    58: goto            62
        //    61: athrow         
        //    62: goto            66
        //    65: athrow         
        //    66: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    69: goto            73
        //    72: athrow         
        //    73: astore          5
        //    75: getstatic       dev/nuker/pyro/fc.1:I
        //    78: ifeq            86
        //    81: ldc             1948383984
        //    83: goto            88
        //    86: ldc             325195633
        //    88: ldc             -654722449
        //    90: ixor           
        //    91: lookupswitch {
        //          -2103979993: 86
        //          -1395113825: 508
        //          default: 116
        //        }
        //   116: aload           5
        //   118: getstatic       dev/nuker/pyro/fc.1:I
        //   121: ifeq            129
        //   124: ldc             -744726470
        //   126: goto            131
        //   129: ldc             -944956709
        //   131: ldc             -1360678258
        //   133: ixor           
        //   134: lookupswitch {
        //          643314420: 129
        //          2105135796: 514
        //          default: 160
        //        }
        //   160: goto            164
        //   163: athrow         
        //   164: invokevirtual   java/io/File.exists:()Z
        //   167: goto            171
        //   170: athrow         
        //   171: ifeq            179
        //   174: ldc             -386940461
        //   176: goto            181
        //   179: ldc             -386940462
        //   181: ldc             556848165
        //   183: ixor           
        //   184: tableswitch {
        //          -1816253460: 208
        //          -1816253459: 424
        //          default: 174
        //        }
        //   208: nop            
        //   209: new             Ljava/io/FileReader;
        //   212: dup            
        //   213: aload           5
        //   215: getstatic       dev/nuker/pyro/fc.0:I
        //   218: ifeq            226
        //   221: ldc             107623881
        //   223: goto            228
        //   226: ldc             -664539567
        //   228: ldc             722978269
        //   230: ixor           
        //   231: lookupswitch {
        //          763228180: 516
        //          1758619049: 226
        //          default: 256
        //        }
        //   256: goto            260
        //   259: athrow         
        //   260: invokespecial   java/io/FileReader.<init>:(Ljava/io/File;)V
        //   263: goto            267
        //   266: athrow         
        //   267: getstatic       dev/nuker/pyro/fc.c:I
        //   270: ifge            278
        //   273: ldc             -1469490075
        //   275: goto            280
        //   278: ldc             1269551872
        //   280: ldc             1877738231
        //   282: ixor           
        //   283: lookupswitch {
        //          -947560814: 512
        //          1902089507: 278
        //          default: 308
        //        }
        //   308: astore          6
        //   310: getstatic       dev/nuker/pyro/faG.c:Ldev/nuker/pyro/faC;
        //   313: aload           4
        //   315: getstatic       dev/nuker/pyro/fc.1:I
        //   318: ifeq            326
        //   321: ldc             1354290741
        //   323: goto            328
        //   326: ldc             -1564337767
        //   328: ldc             -816882522
        //   330: ixor           
        //   331: lookupswitch {
        //          -1611167085: 510
        //          -1506592993: 326
        //          default: 356
        //        }
        //   356: aload           6
        //   358: checkcast       Ljava/io/Reader;
        //   361: ldc             Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig;.class
        //   363: goto            367
        //   366: athrow         
        //   367: invokevirtual   com/google/gson/Gson.fromJson:(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;
        //   370: goto            374
        //   373: athrow         
        //   374: dup            
        //   375: pop            
        //   376: checkcast       Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig;
        //   379: goto            383
        //   382: athrow         
        //   383: invokevirtual   dev/nuker/pyro/faC.c:(Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig;)V
        //   386: goto            390
        //   389: athrow         
        //   390: aload           6
        //   392: goto            396
        //   395: athrow         
        //   396: invokevirtual   java/io/FileReader.close:()V
        //   399: goto            403
        //   402: athrow         
        //   403: goto            507
        //   406: astore          6
        //   408: aload           6
        //   410: goto            414
        //   413: athrow         
        //   414: invokevirtual   java/io/IOException.printStackTrace:()V
        //   417: goto            421
        //   420: athrow         
        //   421: goto            507
        //   424: nop            
        //   425: new             Ljava/io/FileWriter;
        //   428: dup            
        //   429: aload           5
        //   431: goto            435
        //   434: athrow         
        //   435: invokespecial   java/io/FileWriter.<init>:(Ljava/io/File;)V
        //   438: goto            442
        //   441: athrow         
        //   442: astore          6
        //   444: aload           4
        //   446: getstatic       dev/nuker/pyro/faG.c:Ldev/nuker/pyro/faC;
        //   449: goto            453
        //   452: athrow         
        //   453: invokevirtual   dev/nuker/pyro/faC.2:()Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig;
        //   456: goto            460
        //   459: athrow         
        //   460: aload           6
        //   462: checkcast       Ljava/lang/Appendable;
        //   465: goto            469
        //   468: athrow         
        //   469: invokevirtual   com/google/gson/Gson.toJson:(Ljava/lang/Object;Ljava/lang/Appendable;)V
        //   472: goto            476
        //   475: athrow         
        //   476: aload           6
        //   478: goto            482
        //   481: athrow         
        //   482: invokevirtual   java/io/FileWriter.close:()V
        //   485: goto            489
        //   488: athrow         
        //   489: goto            507
        //   492: astore          6
        //   494: aload           6
        //   496: goto            500
        //   499: athrow         
        //   500: invokevirtual   java/io/IOException.printStackTrace:()V
        //   503: goto            507
        //   506: athrow         
        //   507: return         
        //   508: aconst_null    
        //   509: athrow         
        //   510: aconst_null    
        //   511: athrow         
        //   512: aconst_null    
        //   513: athrow         
        //   514: aconst_null    
        //   515: athrow         
        //   516: aconst_null    
        //   517: athrow         
        //   518: pop            
        //   519: goto            24
        //   522: pop            
        //   523: aconst_null    
        //   524: goto            518
        //   527: dup            
        //   528: ifnull          518
        //   531: checkcast       Ljava/lang/Throwable;
        //   534: athrow         
        //   535: dup            
        //   536: ifnull          522
        //   539: checkcast       Ljava/lang/Throwable;
        //   542: athrow         
        //   543: aconst_null    
        //   544: athrow         
        //    StackMapTable: 00 5C 43 07 00 46 04 FF 00 0B 00 00 00 01 07 00 46 FF 00 03 00 04 07 00 03 01 07 00 96 07 00 98 00 00 4A 07 00 46 FF 00 00 00 04 07 00 03 01 07 00 96 07 00 98 00 02 08 00 1C 08 00 1C 45 07 00 46 40 07 00 48 FF 00 0A 00 00 00 01 07 00 46 FF 00 00 00 05 07 00 03 01 07 00 96 07 00 98 07 00 48 00 03 08 00 2D 08 00 2D 07 00 21 45 07 00 46 FF 00 00 00 05 07 00 03 01 07 00 96 07 00 98 07 00 48 00 03 08 00 2D 08 00 2D 07 00 21 FF 00 02 00 00 00 01 07 00 46 FF 00 00 00 05 07 00 03 01 07 00 96 07 00 98 07 00 48 00 03 08 00 2D 08 00 2D 07 00 21 45 07 00 46 40 07 00 4C FC 00 0C 07 00 4C 41 01 1B 4C 07 00 4C FF 00 01 00 06 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 00 02 07 00 4C 01 5C 07 00 4C 42 07 00 46 40 07 00 4C 45 07 00 46 40 01 02 04 41 01 1A FF 00 11 00 06 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 00 03 08 00 D1 08 00 D1 07 00 4C FF 00 01 00 06 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 00 04 08 00 D1 08 00 D1 07 00 4C 01 FF 00 1B 00 06 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 00 03 08 00 D1 08 00 D1 07 00 4C 42 07 00 46 FF 00 00 00 06 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 00 03 08 00 D1 08 00 D1 07 00 4C 45 07 00 46 40 07 00 60 4A 07 00 60 FF 00 01 00 06 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 00 02 07 00 60 01 5B 07 00 60 FF 00 11 00 07 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 07 00 60 00 02 07 00 7D 07 00 48 FF 00 01 00 07 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 07 00 60 00 03 07 00 7D 07 00 48 01 FF 00 1B 00 07 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 07 00 60 00 02 07 00 7D 07 00 48 49 07 00 46 FF 00 00 00 07 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 07 00 60 00 04 07 00 7D 07 00 48 07 00 75 07 00 9A 45 07 00 46 FF 00 00 00 07 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 07 00 60 00 02 07 00 7D 07 00 9C FF 00 07 00 00 00 01 07 00 46 FF 00 00 00 07 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 07 00 60 00 02 07 00 7D 07 00 77 45 07 00 46 00 44 07 00 46 40 07 00 60 45 07 00 46 00 FF 00 02 00 06 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 00 01 07 00 26 FF 00 06 00 07 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 07 00 26 00 01 07 00 2A 40 07 00 26 45 07 00 46 00 FA 00 02 49 07 00 46 FF 00 00 00 06 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 00 03 08 01 A9 08 01 A9 07 00 4C 45 07 00 46 40 07 00 88 FF 00 09 00 07 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 07 00 88 00 01 07 00 46 FF 00 00 00 07 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 07 00 88 00 02 07 00 48 07 00 7D 45 07 00 46 FF 00 00 00 07 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 07 00 88 00 02 07 00 48 07 00 77 FF 00 07 00 00 00 01 07 00 46 FF 00 00 00 07 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 07 00 88 00 03 07 00 48 07 00 77 07 00 8F 45 07 00 46 00 44 07 00 28 40 07 00 88 45 07 00 46 00 FF 00 02 00 06 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 00 01 07 00 26 FF 00 06 00 07 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 07 00 26 00 01 07 00 28 40 07 00 26 45 07 00 46 F8 00 00 FD 00 00 07 00 48 07 00 4C FF 00 01 00 07 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 07 00 60 00 02 07 00 7D 07 00 48 FF 00 01 00 06 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 00 01 07 00 60 41 07 00 4C FF 00 01 00 06 07 00 03 01 07 00 96 07 00 98 07 00 48 07 00 4C 00 03 08 00 D1 08 00 D1 07 00 4C FF 00 01 00 04 07 00 03 01 07 00 96 07 00 98 00 01 07 00 28 43 05 44 07 00 28 47 05 47 07 00 46
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  208    382    406    424    Ljava/io/IOException;
        //  383    403    406    424    Ljava/io/IOException;
        //  424    468    492    507    Ljava/io/IOException;
        //  469    489    492    507    Ljava/io/IOException;
        //  8      20     527    535    Ljava/lang/RuntimeException;
        //  527    535    527    535    Ljava/lang/UnsupportedOperationException;
        //  543    545    3      8      Ljava/lang/IllegalArgumentException;
        //  35     42     42     43     Any
        //  36     42     35     36     Any
        //  35     42     3      8      Any
        //  36     42     42     43     Ljava/lang/NullPointerException;
        //  35     42     35     36     Any
        //  55     61     61     62     Any
        //  55     61     3      8      Ljava/lang/ArithmeticException;
        //  55     61     61     62     Ljava/lang/ClassCastException;
        //  55     61     3      8      Any
        //  55     61     61     62     Any
        //  66     72     72     73     Any
        //  66     72     3      8      Any
        //  66     72     3      8      Any
        //  66     72     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  66     72     3      8      Any
        //  163    170    170    171    Any
        //  164    170    3      8      Any
        //  164    170    163    164    Any
        //  164    170    163    164    Ljava/lang/IndexOutOfBoundsException;
        //  164    170    163    164    Any
        //  259    266    266    267    Any
        //  260    266    3      8      Ljava/lang/IllegalStateException;
        //  260    266    266    267    Any
        //  259    266    259    260    Ljava/util/NoSuchElementException;
        //  259    266    259    260    Any
        //  366    373    373    374    Any
        //  366    373    373    374    Any
        //  367    373    366    367    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  367    373    3      8      Any
        //  366    373    366    367    Any
        //  383    389    389    390    Any
        //  383    389    3      8      Any
        //  383    389    389    390    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  383    389    389    390    Ljava/util/ConcurrentModificationException;
        //  383    389    389    390    Any
        //  395    402    402    403    Any
        //  396    402    395    396    Any
        //  396    402    402    403    Any
        //  396    402    395    396    Any
        //  396    402    3      8      Any
        //  413    420    420    421    Any
        //  413    420    420    421    Any
        //  413    420    3      8      Any
        //  414    420    413    414    Ljava/lang/UnsupportedOperationException;
        //  413    420    3      8      Ljava/lang/NullPointerException;
        //  434    441    441    442    Any
        //  435    441    3      8      Any
        //  434    441    441    442    Ljava/lang/StringIndexOutOfBoundsException;
        //  435    441    434    435    Any
        //  435    441    434    435    Ljava/lang/UnsupportedOperationException;
        //  452    459    459    460    Any
        //  453    459    459    460    Any
        //  452    459    3      8      Any
        //  452    459    452    453    Ljava/util/ConcurrentModificationException;
        //  453    459    452    453    Any
        //  469    475    475    476    Any
        //  469    475    3      8      Any
        //  469    475    3      8      Ljava/util/NoSuchElementException;
        //  469    475    3      8      Ljava/lang/IllegalArgumentException;
        //  469    475    3      8      Any
        //  481    488    488    489    Any
        //  481    488    3      8      Any
        //  481    488    481    482    Ljava/lang/IllegalStateException;
        //  481    488    481    482    Ljava/lang/NegativeArraySizeException;
        //  482    488    481    482    Ljava/lang/RuntimeException;
        //  499    506    506    507    Any
        //  500    506    3      8      Any
        //  500    506    499    500    Ljava/lang/UnsupportedOperationException;
        //  499    506    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  500    506    499    500    Ljava/lang/StringIndexOutOfBoundsException;
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
    
    static {
        throw t;
    }
}
