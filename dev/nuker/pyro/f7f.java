// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;
import dev.nuker.pyro.security.inject.LauncherEventHide;

public class f7F extends fH
{
    public f0f<f7E> c;
    public f0d c;
    public f8W c;
    
    @f06
    @LauncherEventHide
    public void c(final f3i f3i) {
        fbS.fm(this, 2004672071, f3i);
    }
    
    public f7F() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u2231\u149c\u8b22\ub3de\uc998\uec2e\ub229\ue711"
        //     3: getstatic       dev/nuker/pyro/fc.1:I
        //     6: ifeq            14
        //     9: ldc             1781543396
        //    11: goto            16
        //    14: ldc             1003180990
        //    16: ldc             841638136
        //    18: ixor           
        //    19: lookupswitch {
        //          165753670: 44
        //          1478119708: 14
        //          default: 410
        //        }
        //    44: invokestatic    invokestatic   !!! ERROR
        //    47: ldc             "\u2211\u149c\u8b22\ub3de\uc9b8\uec2e\ub229\ue711"
        //    49: getstatic       dev/nuker/pyro/fc.0:I
        //    52: ifeq            60
        //    55: ldc             1663523185
        //    57: goto            62
        //    60: ldc             -96946630
        //    62: ldc             1877037091
        //    64: ixor           
        //    65: lookupswitch {
        //          -1780881895: 92
        //          214305106: 60
        //          default: 414
        //        }
        //    92: invokestatic    invokestatic   !!! ERROR
        //    95: ldc             "\u221c\u149f\u8b20\ub3d6\uc985\uec28\ub264\ue718\ud967\ue9f4\ua6bb\u1e58\ue02a\uc5e7\u816c\u88b5\u57a9\u76d4\ubd7d\uc05b\u2ace\uc229\u6bd8\u2d5e\ud786\u344a"
        //    97: invokestatic    invokestatic   !!! ERROR
        //   100: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   103: aload_0        
        //   104: new             Ldev/nuker/pyro/f0f;
        //   107: dup            
        //   108: ldc             "\u2230\u149c\u8b28\ub3dc"
        //   110: getstatic       dev/nuker/pyro/fc.c:I
        //   113: ifge            121
        //   116: ldc             915740745
        //   118: goto            123
        //   121: ldc             -1634912535
        //   123: ldc             -679016435
        //   125: ixor           
        //   126: lookupswitch {
        //          -1294914530: 121
        //          -518909884: 416
        //          default: 152
        //        }
        //   152: invokestatic    invokestatic   !!! ERROR
        //   155: ldc             "\u2210\u149c\u8b28\ub3dc"
        //   157: invokestatic    invokestatic   !!! ERROR
        //   160: aconst_null    
        //   161: getstatic       dev/nuker/pyro/f7E.1:Ldev/nuker/pyro/f7E;
        //   164: getstatic       dev/nuker/pyro/fc.1:I
        //   167: ifeq            175
        //   170: ldc             313595088
        //   172: goto            177
        //   175: ldc             374426694
        //   177: ldc             -798412163
        //   179: ixor           
        //   180: lookupswitch {
        //          -1026021715: 175
        //          -969376197: 208
        //          default: 412
        //        }
        //   208: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   211: putfield        dev/nuker/pyro/f7F.c:Ldev/nuker/pyro/f0f;
        //   214: aload_0        
        //   215: new             Ldev/nuker/pyro/f0d;
        //   218: dup            
        //   219: ldc             "\u222e\u1483\u8b29\ub3dc\uc996\uec12\ub22a\ue702"
        //   221: invokestatic    invokestatic   !!! ERROR
        //   224: ldc             "\u220e\u1483\u8b29\ub3dc\uc996\uec12\ub22a\ue702"
        //   226: invokestatic    invokestatic   !!! ERROR
        //   229: aconst_null    
        //   230: ldc2_w          1.61
        //   233: dconst_0       
        //   234: ldc2_w          3.0
        //   237: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   240: getstatic       dev/nuker/pyro/fc.0:I
        //   243: ifeq            251
        //   246: ldc             612715451
        //   248: goto            253
        //   251: ldc             982410640
        //   253: ldc             570853308
        //   255: ixor           
        //   256: lookupswitch {
        //          -334419114: 251
        //          109300743: 418
        //          default: 284
        //        }
        //   284: putfield        dev/nuker/pyro/f7F.c:Ldev/nuker/pyro/f0d;
        //   287: aload_0        
        //   288: aload_0        
        //   289: getfield        dev/nuker/pyro/f7F.c:Ldev/nuker/pyro/f0f;
        //   292: invokevirtual   dev/nuker/pyro/f7F.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   295: pop            
        //   296: aload_0        
        //   297: getstatic       dev/nuker/pyro/fc.0:I
        //   300: ifeq            308
        //   303: ldc             1864753051
        //   305: goto            310
        //   308: ldc             -1870053863
        //   310: ldc             -135567162
        //   312: ixor           
        //   313: lookupswitch {
        //          -1731283107: 406
        //          -1288971518: 308
        //          default: 340
        //        }
        //   340: aload_0        
        //   341: getfield        dev/nuker/pyro/f7F.c:Ldev/nuker/pyro/f0d;
        //   344: invokevirtual   dev/nuker/pyro/f7F.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   347: pop            
        //   348: aload_0        
        //   349: getfield        dev/nuker/pyro/f7F.c:Ldev/nuker/pyro/f0f;
        //   352: getstatic       dev/nuker/pyro/fc.0:I
        //   355: ifeq            363
        //   358: ldc             317553307
        //   360: goto            365
        //   363: ldc             -1611975411
        //   365: ldc             245226620
        //   367: ixor           
        //   368: lookupswitch {
        //          -1854477967: 396
        //          477144807: 363
        //          default: 408
        //        }
        //   396: aload_0        
        //   397: invokedynamic   BootstrapMethod #0, accept:(Ldev/nuker/pyro/f7F;)Ljava/util/function/Consumer;
        //   402: invokevirtual   dev/nuker/pyro/f0f.c:(Ljava/util/function/Consumer;)V
        //   405: return         
        //   406: aconst_null    
        //   407: athrow         
        //   408: aconst_null    
        //   409: athrow         
        //   410: aconst_null    
        //   411: athrow         
        //   412: aconst_null    
        //   413: athrow         
        //   414: aconst_null    
        //   415: athrow         
        //   416: aconst_null    
        //   417: athrow         
        //   418: aconst_null    
        //   419: athrow         
        //    StackMapTable: 00 1C FF 00 0E 00 01 06 00 02 06 07 00 7D FF 00 01 00 01 06 00 03 06 07 00 7D 01 FF 00 1B 00 01 06 00 02 06 07 00 7D FF 00 0F 00 01 06 00 03 06 07 00 7D 07 00 7D FF 00 01 00 01 06 00 04 06 07 00 7D 07 00 7D 01 FF 00 1D 00 01 06 00 03 06 07 00 7D 07 00 7D FF 00 1C 00 01 07 00 03 00 04 07 00 03 08 00 68 08 00 68 07 00 7D FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 68 08 00 68 07 00 7D 01 FF 00 1C 00 01 07 00 03 00 04 07 00 03 08 00 68 08 00 68 07 00 7D FF 00 16 00 01 07 00 03 00 07 07 00 03 08 00 68 08 00 68 07 00 7D 07 00 7D 05 07 00 40 FF 00 01 00 01 07 00 03 00 08 07 00 03 08 00 68 08 00 68 07 00 7D 07 00 7D 05 07 00 40 01 FF 00 1E 00 01 07 00 03 00 07 07 00 03 08 00 68 08 00 68 07 00 7D 07 00 7D 05 07 00 40 FF 00 2A 00 01 07 00 03 00 02 07 00 03 07 00 4D FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 4D 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 4D 57 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 56 07 00 35 FF 00 01 00 01 07 00 03 00 02 07 00 35 01 5E 07 00 35 49 07 00 03 41 07 00 35 FF 00 01 00 01 06 00 02 06 07 00 7D FF 00 01 00 01 07 00 03 00 07 07 00 03 08 00 68 08 00 68 07 00 7D 07 00 7D 05 07 00 40 FF 00 01 00 01 06 00 03 06 07 00 7D 07 00 7D FF 00 01 00 01 07 00 03 00 04 07 00 03 08 00 68 08 00 68 07 00 7D FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 4D
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
        //     4: ifnull          373
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            365
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            357
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            35
        //    30: ldc             1469506865
        //    32: goto            37
        //    35: ldc             -1528162754
        //    37: ldc             -1784806529
        //    39: ixor           
        //    40: lookupswitch {
        //          -1039604146: 344
        //          -455095051: 35
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: iload_1        
        //    70: getstatic       dev/nuker/pyro/fc.1:I
        //    73: ifeq            81
        //    76: ldc             1038983293
        //    78: goto            83
        //    81: ldc             -704239177
        //    83: ldc             -111559163
        //    85: ixor           
        //    86: lookupswitch {
        //          -994828680: 81
        //          794793906: 112
        //          default: 336
        //        }
        //   112: aload_2        
        //   113: getstatic       dev/nuker/pyro/fc.c:I
        //   116: ifge            124
        //   119: ldc             -979380289
        //   121: goto            126
        //   124: ldc             -716986167
        //   126: ldc             -598921668
        //   128: ixor           
        //   129: lookupswitch {
        //          151946997: 156
        //          433256835: 124
        //          default: 340
        //        }
        //   156: aload_3        
        //   157: getstatic       dev/nuker/pyro/fc.c:I
        //   160: ifge            168
        //   163: ldc             701937085
        //   165: goto            170
        //   168: ldc             701728571
        //   170: ldc             -1972351622
        //   172: ixor           
        //   173: lookupswitch {
        //          -1549338425: 338
        //          70186008: 168
        //          default: 200
        //        }
        //   200: goto            204
        //   203: athrow         
        //   204: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //   207: goto            211
        //   210: athrow         
        //   211: aload_0        
        //   212: getstatic       dev/nuker/pyro/fc.c:I
        //   215: ifge            223
        //   218: ldc             1399035838
        //   220: goto            225
        //   223: ldc             -1292546271
        //   225: ldc             1889316792
        //   227: ixor           
        //   228: lookupswitch {
        //          603928582: 346
        //          1676639356: 223
        //          default: 256
        //        }
        //   256: goto            260
        //   259: athrow         
        //   260: invokevirtual   dev/nuker/pyro/f7F.c:()V
        //   263: goto            267
        //   266: athrow         
        //   267: getstatic       dev/nuker/pyro/fc.c:I
        //   270: ifge            278
        //   273: ldc             668337190
        //   275: goto            280
        //   278: ldc             -862188517
        //   280: ldc             -2097847098
        //   282: ixor           
        //   283: lookupswitch {
        //          -1524408096: 342
        //          -1224529943: 278
        //          default: 308
        //        }
        //   308: getstatic       dev/nuker/pyro/f02.c:Ldev/nuker/pyro/f02;
        //   311: ldc             "\u2231\u149c\u8b22\ub1cf\ucf8b\uec2e\ub229\ue711"
        //   313: goto            317
        //   316: athrow         
        //   317: invokestatic    invokestatic   !!! ERROR
        //   320: goto            324
        //   323: athrow         
        //   324: goto            328
        //   327: athrow         
        //   328: invokevirtual   dev/nuker/pyro/f02.1:(Ljava/lang/String;)V
        //   331: goto            335
        //   334: athrow         
        //   335: return         
        //   336: aconst_null    
        //   337: athrow         
        //   338: aconst_null    
        //   339: athrow         
        //   340: aconst_null    
        //   341: athrow         
        //   342: aconst_null    
        //   343: athrow         
        //   344: aconst_null    
        //   345: athrow         
        //   346: aconst_null    
        //   347: athrow         
        //   348: pop            
        //   349: goto            24
        //   352: pop            
        //   353: aconst_null    
        //   354: goto            348
        //   357: dup            
        //   358: ifnull          348
        //   361: checkcast       Ljava/lang/Throwable;
        //   364: athrow         
        //   365: dup            
        //   366: ifnull          352
        //   369: checkcast       Ljava/lang/Throwable;
        //   372: athrow         
        //   373: aconst_null    
        //   374: athrow         
        //    RuntimeInvisibleTypeAnnotations: 00 02 16 01 00 00 7F 00 00 16 02 00 00 7F 00 00
        //    StackMapTable: 00 31 43 07 00 8F 04 FF 00 0B 00 00 00 01 07 00 8F FF 00 03 00 04 07 00 03 01 07 00 B1 07 00 B3 00 00 0A 41 01 1E FF 00 0C 00 04 07 00 03 01 07 00 B1 07 00 B3 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 01 07 00 B1 07 00 B3 00 03 07 00 03 01 01 FF 00 1C 00 04 07 00 03 01 07 00 B1 07 00 B3 00 02 07 00 03 01 FF 00 0B 00 04 07 00 03 01 07 00 B1 07 00 B3 00 03 07 00 03 01 07 00 B1 FF 00 01 00 04 07 00 03 01 07 00 B1 07 00 B3 00 04 07 00 03 01 07 00 B1 01 FF 00 1D 00 04 07 00 03 01 07 00 B1 07 00 B3 00 03 07 00 03 01 07 00 B1 FF 00 0B 00 04 07 00 03 01 07 00 B1 07 00 B3 00 04 07 00 03 01 07 00 B1 07 00 B3 FF 00 01 00 04 07 00 03 01 07 00 B1 07 00 B3 00 05 07 00 03 01 07 00 B1 07 00 B3 01 FF 00 1D 00 04 07 00 03 01 07 00 B1 07 00 B3 00 04 07 00 03 01 07 00 B1 07 00 B3 42 07 00 83 FF 00 00 00 04 07 00 03 01 07 00 B1 07 00 B3 00 04 07 00 03 01 07 00 B1 07 00 B3 45 07 00 8F 00 4B 07 00 03 FF 00 01 00 04 07 00 03 01 07 00 B1 07 00 B3 00 02 07 00 03 01 5E 07 00 03 42 07 00 8F 40 07 00 03 45 07 00 8F 00 0A 41 01 1B FF 00 07 00 00 00 01 07 00 8F FF 00 00 00 04 07 00 03 01 07 00 B1 07 00 B3 00 02 07 00 A7 07 00 7D 45 07 00 8F FF 00 00 00 04 07 00 03 01 07 00 B1 07 00 B3 00 02 07 00 A7 07 00 7D FF 00 02 00 00 00 01 07 00 8F FF 00 00 00 04 07 00 03 01 07 00 B1 07 00 B3 00 02 07 00 A7 07 00 7D 45 07 00 8F 00 FF 00 00 00 04 07 00 03 01 07 00 B1 07 00 B3 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 01 07 00 B1 07 00 B3 00 04 07 00 03 01 07 00 B1 07 00 B3 FF 00 01 00 04 07 00 03 01 07 00 B1 07 00 B3 00 03 07 00 03 01 07 00 B1 01 01 41 07 00 03 41 07 00 8F 43 05 44 07 00 8F 47 05 47 07 00 8F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     357    365    Any
        //  357    365    357    365    Any
        //  373    375    3      8      Ljava/lang/NegativeArraySizeException;
        //  203    210    210    211    Any
        //  204    210    203    204    Ljava/lang/RuntimeException;
        //  203    210    210    211    Ljava/lang/EnumConstantNotPresentException;
        //  203    210    210    211    Ljava/lang/StringIndexOutOfBoundsException;
        //  204    210    203    204    Ljava/lang/ArithmeticException;
        //  259    266    266    267    Any
        //  260    266    3      8      Any
        //  259    266    3      8      Ljava/lang/AssertionError;
        //  259    266    259    260    Any
        //  260    266    259    260    Any
        //  317    323    323    324    Any
        //  317    323    3      8      Any
        //  317    323    3      8      Ljava/lang/RuntimeException;
        //  317    323    3      8      Any
        //  317    323    3      8      Any
        //  328    334    334    335    Any
        //  328    334    3      8      Any
        //  328    334    334    335    Any
        //  328    334    334    335    Ljava/lang/ArithmeticException;
        //  328    334    334    335    Ljava/lang/IndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 84 out of bounds for length 84
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
    
    public void c(final f0n f0n) {
        fbS.bX(this, 1640248408, f0n);
    }
    
    @f06
    @LauncherEventHide
    public void c(final f34 f34) {
        fbS.3(this, 1803369828, f34);
    }
    
    @f06
    @LauncherEventHide
    public void c(final f3e f3e) {
        fbS.5H(this, 438468710, f3e);
    }
    
    public void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          423
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            415
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            407
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/f7D.c:[I
        //    27: aload_0        
        //    28: getfield        dev/nuker/pyro/f7F.c:Ldev/nuker/pyro/f0f;
        //    31: getstatic       dev/nuker/pyro/fc.1:I
        //    34: ifeq            42
        //    37: ldc             969660642
        //    39: goto            44
        //    42: ldc             348094484
        //    44: ldc             -2078043885
        //    46: ixor           
        //    47: lookupswitch {
        //          -1868820217: 72
        //          -1108850191: 42
        //          default: 388
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //    79: goto            83
        //    82: athrow         
        //    83: checkcast       Ldev/nuker/pyro/f7E;
        //    86: goto            90
        //    89: athrow         
        //    90: invokevirtual   dev/nuker/pyro/f7E.ordinal:()I
        //    93: goto            97
        //    96: athrow         
        //    97: iaload         
        //    98: tableswitch {
        //                2: 128
        //                3: 194
        //                4: 258
        //                5: 280
        //          default: 387
        //        }
        //   128: getstatic       dev/nuker/pyro/fc.0:I
        //   131: ifeq            139
        //   134: ldc             -2147046769
        //   136: goto            141
        //   139: ldc             -495417498
        //   141: ldc             2110208556
        //   143: ixor           
        //   144: lookupswitch {
        //          -1614824118: 172
        //          -37646173: 139
        //          default: 394
        //        }
        //   172: aload_0        
        //   173: new             Ldev/nuker/pyro/f8V;
        //   176: dup            
        //   177: goto            181
        //   180: athrow         
        //   181: invokespecial   dev/nuker/pyro/f8V.<init>:()V
        //   184: goto            188
        //   187: athrow         
        //   188: putfield        dev/nuker/pyro/f7F.c:Ldev/nuker/pyro/f8W;
        //   191: goto            387
        //   194: aload_0        
        //   195: new             Ldev/nuker/pyro/f8T;
        //   198: dup            
        //   199: goto            203
        //   202: athrow         
        //   203: invokespecial   dev/nuker/pyro/f8T.<init>:()V
        //   206: goto            210
        //   209: athrow         
        //   210: getstatic       dev/nuker/pyro/fc.c:I
        //   213: ifge            221
        //   216: ldc             -250173608
        //   218: goto            223
        //   221: ldc             -807955644
        //   223: ldc             -1209392895
        //   225: ixor           
        //   226: lookupswitch {
        //          -2115776422: 221
        //          1190954585: 390
        //          default: 252
        //        }
        //   252: putfield        dev/nuker/pyro/f7F.c:Ldev/nuker/pyro/f8W;
        //   255: goto            387
        //   258: aload_0        
        //   259: new             Ldev/nuker/pyro/f8U;
        //   262: dup            
        //   263: goto            267
        //   266: athrow         
        //   267: invokespecial   dev/nuker/pyro/f8U.<init>:()V
        //   270: goto            274
        //   273: athrow         
        //   274: putfield        dev/nuker/pyro/f7F.c:Ldev/nuker/pyro/f8W;
        //   277: goto            387
        //   280: getstatic       dev/nuker/pyro/fc.0:I
        //   283: ifeq            291
        //   286: ldc             -980887939
        //   288: goto            293
        //   291: ldc             18490311
        //   293: ldc             -794171290
        //   295: ixor           
        //   296: lookupswitch {
        //          354500123: 396
        //          829065001: 291
        //          default: 324
        //        }
        //   324: aload_0        
        //   325: new             Ldev/nuker/pyro/f8S;
        //   328: dup            
        //   329: goto            333
        //   332: athrow         
        //   333: invokespecial   dev/nuker/pyro/f8S.<init>:()V
        //   336: goto            340
        //   339: athrow         
        //   340: getstatic       dev/nuker/pyro/fc.1:I
        //   343: ifeq            351
        //   346: ldc             1836648743
        //   348: goto            353
        //   351: ldc             -2144685221
        //   353: ldc             -1090746941
        //   355: ixor           
        //   356: lookupswitch {
        //          -746222364: 351
        //          1054226072: 384
        //          default: 392
        //        }
        //   384: putfield        dev/nuker/pyro/f7F.c:Ldev/nuker/pyro/f8W;
        //   387: return         
        //   388: aconst_null    
        //   389: athrow         
        //   390: aconst_null    
        //   391: athrow         
        //   392: aconst_null    
        //   393: athrow         
        //   394: aconst_null    
        //   395: athrow         
        //   396: aconst_null    
        //   397: athrow         
        //   398: pop            
        //   399: goto            24
        //   402: pop            
        //   403: aconst_null    
        //   404: goto            398
        //   407: dup            
        //   408: ifnull          398
        //   411: checkcast       Ljava/lang/Throwable;
        //   414: athrow         
        //   415: dup            
        //   416: ifnull          402
        //   419: checkcast       Ljava/lang/Throwable;
        //   422: athrow         
        //   423: aconst_null    
        //   424: athrow         
        //    StackMapTable: 00 3A 43 07 00 8F 04 FF 00 0B 00 00 00 01 07 00 8F FC 00 03 07 00 03 FF 00 11 00 01 07 00 03 00 02 07 00 FB 07 00 35 FF 00 01 00 01 07 00 03 00 03 07 00 FB 07 00 35 01 FF 00 1B 00 01 07 00 03 00 02 07 00 FB 07 00 35 42 07 00 8F FF 00 00 00 01 07 00 03 00 02 07 00 FB 07 00 35 45 07 00 8F FF 00 00 00 01 07 00 03 00 02 07 00 FB 07 00 FD 45 07 00 81 FF 00 00 00 01 07 00 03 00 02 07 00 FB 07 00 40 45 07 00 8F FF 00 00 00 01 07 00 03 00 02 07 00 FB 01 1E 0A 41 01 1E 47 07 00 8F FF 00 00 00 01 07 00 03 00 03 07 00 03 08 00 AD 08 00 AD 45 07 00 8F FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 E4 05 47 07 00 8F FF 00 00 00 01 07 00 03 00 03 07 00 03 08 00 C3 08 00 C3 45 07 00 8F FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 EA FF 00 0A 00 01 07 00 03 00 02 07 00 03 07 00 EA FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 EA 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 EA 05 FF 00 07 00 00 00 01 07 00 8F FF 00 00 00 01 07 00 03 00 03 07 00 03 08 01 03 08 01 03 45 07 00 8F FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 F0 05 0A 41 01 1E 47 07 00 8F FF 00 00 00 01 07 00 03 00 03 07 00 03 08 01 45 08 01 45 45 07 00 8F FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 F6 FF 00 0A 00 01 07 00 03 00 02 07 00 03 07 00 F6 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 F6 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 F6 02 FF 00 00 00 01 07 00 03 00 02 07 00 FB 07 00 35 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 EA FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 F6 01 01 41 07 00 8F 43 05 44 07 00 8F 47 05 47 07 00 8F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     407    415    Ljava/lang/ClassCastException;
        //  407    415    407    415    Any
        //  423    425    3      8      Ljava/lang/ArithmeticException;
        //  75     82     82     83     Any
        //  76     82     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  75     82     82     83     Any
        //  75     82     75     76     Ljava/lang/UnsupportedOperationException;
        //  76     82     75     76     Any
        //  89     96     96     97     Any
        //  89     96     96     97     Any
        //  90     96     89     90     Ljava/lang/NegativeArraySizeException;
        //  89     96     3      8      Any
        //  90     96     3      8      Ljava/lang/AssertionError;
        //  180    187    187    188    Any
        //  180    187    3      8      Any
        //  180    187    3      8      Any
        //  181    187    180    181    Any
        //  180    187    3      8      Ljava/lang/ClassCastException;
        //  202    209    209    210    Any
        //  202    209    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  202    209    209    210    Any
        //  202    209    3      8      Ljava/lang/NegativeArraySizeException;
        //  202    209    202    203    Any
        //  267    273    273    274    Any
        //  267    273    3      8      Ljava/lang/IllegalStateException;
        //  267    273    3      8      Ljava/util/ConcurrentModificationException;
        //  267    273    273    274    Any
        //  267    273    273    274    Any
        //  332    339    339    340    Any
        //  333    339    332    333    Ljava/lang/UnsupportedOperationException;
        //  332    339    3      8      Any
        //  332    339    332    333    Any
        //  333    339    339    340    Ljava/util/NoSuchElementException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:629)
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
    
    @f06
    @LauncherEventHide
    public void c(final f3h f3h) {
        fbS.hI(this, 1774571264, f3h);
    }
}
