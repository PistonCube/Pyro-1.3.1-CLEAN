// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import kotlin.jvm.internal.Ref;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.jetbrains.annotations.NotNull;

public class f6H extends fH
{
    @NotNull
    public f0a c;
    @NotNull
    public f0d c;
    @NotNull
    public f0a 0;
    @NotNull
    public f0f<f6F> c;
    @NotNull
    public fbu c;
    @NotNull
    public ConcurrentLinkedQueue<String> c;
    
    @NotNull
    public fbu c() {
        return fbS.75(this, 35899464);
    }
    
    static {
        throw t;
    }
    
    @NotNull
    public f0d 1() {
        return fbS.fY(this, 1209623895);
    }
    
    public f6H() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u23c3\u1483\u8ac8\ub3d4\uc9b2\uedd3\ub236"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u23e3\u1483\u8ac8\ub3d4\uc9b2\uedd3\ub236"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: aconst_null    
        //    12: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    15: getstatic       dev/nuker/pyro/fc.0:I
        //    18: ifeq            26
        //    21: ldc             382194834
        //    23: goto            28
        //    26: ldc             1675570825
        //    28: ldc             1166063730
        //    30: ixor           
        //    31: lookupswitch {
        //          643798779: 56
        //          1397189856: 26
        //          default: 578
        //        }
        //    56: aload_0        
        //    57: aload_0        
        //    58: new             Ldev/nuker/pyro/f0a;
        //    61: dup            
        //    62: ldc             "\u23dc\u149c\u8ac6\ub3c9"
        //    64: getstatic       dev/nuker/pyro/fc.0:I
        //    67: ifeq            75
        //    70: ldc             -121326396
        //    72: goto            77
        //    75: ldc             1454990969
        //    77: ldc             389445878
        //    79: ixor           
        //    80: lookupswitch {
        //          -1781393020: 75
        //          -269300686: 572
        //          default: 108
        //        }
        //   108: invokestatic    invokestatic   !!! ERROR
        //   111: ldc             "\u23fc\u149c\u8ac6\ub3c9"
        //   113: invokestatic    invokestatic   !!! ERROR
        //   116: aconst_null    
        //   117: iconst_1       
        //   118: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   121: checkcast       Ldev/nuker/pyro/f0n;
        //   124: getstatic       dev/nuker/pyro/fc.1:I
        //   127: ifeq            135
        //   130: ldc             -1873109095
        //   132: goto            137
        //   135: ldc             1406648379
        //   137: ldc             -258067383
        //   139: ixor           
        //   140: lookupswitch {
        //          1623501776: 582
        //          1878954493: 135
        //          default: 168
        //        }
        //   168: invokevirtual   dev/nuker/pyro/f6H.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   171: checkcast       Ldev/nuker/pyro/f0a;
        //   174: putfield        dev/nuker/pyro/f6H.c:Ldev/nuker/pyro/f0a;
        //   177: aload_0        
        //   178: aload_0        
        //   179: new             Ldev/nuker/pyro/f0d;
        //   182: dup            
        //   183: ldc             "\u23d4\u1496\u8ac5\ub3d8\uc9a6"
        //   185: getstatic       dev/nuker/pyro/fc.1:I
        //   188: ifeq            196
        //   191: ldc             682584533
        //   193: goto            198
        //   196: ldc             1972285009
        //   198: ldc             470236495
        //   200: ixor           
        //   201: lookupswitch {
        //          883446938: 196
        //          1770623774: 228
        //          default: 584
        //        }
        //   228: invokestatic    invokestatic   !!! ERROR
        //   231: ldc             "\u23f4\u1496\u8ac5\ub3d8\uc9a6"
        //   233: invokestatic    invokestatic   !!! ERROR
        //   236: aconst_null    
        //   237: ldc2_w          1.5
        //   240: dconst_0       
        //   241: ldc2_w          10.0
        //   244: dconst_0       
        //   245: bipush          64
        //   247: aconst_null    
        //   248: getstatic       dev/nuker/pyro/fc.1:I
        //   251: ifeq            259
        //   254: ldc             -1432209717
        //   256: goto            261
        //   259: ldc             1619207125
        //   261: ldc             1058991381
        //   263: ixor           
        //   264: lookupswitch {
        //          -1782785058: 568
        //          -999650646: 259
        //          default: 292
        //        }
        //   292: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   295: checkcast       Ldev/nuker/pyro/f0n;
        //   298: invokevirtual   dev/nuker/pyro/f6H.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   301: checkcast       Ldev/nuker/pyro/f0d;
        //   304: putfield        dev/nuker/pyro/f6H.c:Ldev/nuker/pyro/f0d;
        //   307: aload_0        
        //   308: aload_0        
        //   309: new             Ldev/nuker/pyro/f0a;
        //   312: dup            
        //   313: ldc             "\u23c2\u1492\u8ac7\ub3dd\uc9b0\ueddb"
        //   315: invokestatic    invokestatic   !!! ERROR
        //   318: ldc             "\u23e2\u1492\u8ac7\ub3dd\uc9b0\ueddb"
        //   320: invokestatic    invokestatic   !!! ERROR
        //   323: aconst_null    
        //   324: iconst_0       
        //   325: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   328: checkcast       Ldev/nuker/pyro/f0n;
        //   331: invokevirtual   dev/nuker/pyro/f6H.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   334: checkcast       Ldev/nuker/pyro/f0a;
        //   337: putfield        dev/nuker/pyro/f6H.0:Ldev/nuker/pyro/f0a;
        //   340: aload_0        
        //   341: aload_0        
        //   342: new             Ldev/nuker/pyro/f0f;
        //   345: dup            
        //   346: ldc             "\u23dd\u149c\u8acd\ub3dc"
        //   348: invokestatic    invokestatic   !!! ERROR
        //   351: ldc             "\u23fd\u149c\u8acd\ub3dc"
        //   353: invokestatic    invokestatic   !!! ERROR
        //   356: aconst_null    
        //   357: getstatic       dev/nuker/pyro/f6F.c:Ldev/nuker/pyro/f6F;
        //   360: checkcast       Ljava/lang/Enum;
        //   363: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   366: checkcast       Ldev/nuker/pyro/f0n;
        //   369: invokevirtual   dev/nuker/pyro/f6H.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   372: checkcast       Ldev/nuker/pyro/f0f;
        //   375: getstatic       dev/nuker/pyro/fc.c:I
        //   378: ifge            386
        //   381: ldc             -672397533
        //   383: goto            388
        //   386: ldc             1557478505
        //   388: ldc             -1961018001
        //   390: ixor           
        //   391: lookupswitch {
        //          -674758394: 416
        //          1559312972: 386
        //          default: 576
        //        }
        //   416: putfield        dev/nuker/pyro/f6H.c:Ldev/nuker/pyro/f0f;
        //   419: getstatic       dev/nuker/pyro/fc.1:I
        //   422: ifeq            430
        //   425: ldc             1917466500
        //   427: goto            432
        //   430: ldc             2113026988
        //   432: ldc             937647021
        //   434: ixor           
        //   435: lookupswitch {
        //          1144653384: 430
        //          1168731177: 580
        //          default: 460
        //        }
        //   460: aload_0        
        //   461: new             Ldev/nuker/pyro/fbu;
        //   464: dup            
        //   465: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   468: getstatic       dev/nuker/pyro/fc.c:I
        //   471: ifge            479
        //   474: ldc             -408597265
        //   476: goto            481
        //   479: ldc             1139300754
        //   481: ldc             -147147312
        //   483: ixor           
        //   484: lookupswitch {
        //          -1261245374: 512
        //          278919487: 479
        //          default: 570
        //        }
        //   512: putfield        dev/nuker/pyro/f6H.c:Ldev/nuker/pyro/fbu;
        //   515: getstatic       dev/nuker/pyro/fc.c:I
        //   518: ifge            526
        //   521: ldc             863556371
        //   523: goto            528
        //   526: ldc             2099450425
        //   528: ldc             1620894051
        //   530: ixor           
        //   531: lookupswitch {
        //          1251846067: 526
        //          1407464048: 574
        //          default: 556
        //        }
        //   556: aload_0        
        //   557: new             Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   560: dup            
        //   561: invokespecial   java/util/concurrent/ConcurrentLinkedQueue.<init>:()V
        //   564: putfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   567: return         
        //   568: aconst_null    
        //   569: athrow         
        //   570: aconst_null    
        //   571: athrow         
        //   572: aconst_null    
        //   573: athrow         
        //   574: aconst_null    
        //   575: athrow         
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
        //    StackMapTable: 00 24 FF 00 1A 00 01 07 00 03 00 00 41 01 1B FF 00 12 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 3A 08 00 3A 07 00 96 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 3A 08 00 3A 07 00 96 01 FF 00 1E 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 3A 08 00 3A 07 00 96 FF 00 1A 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 44 FF 00 01 00 01 07 00 03 00 04 07 00 03 07 00 03 07 00 44 01 FF 00 1E 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 44 FF 00 1B 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 B3 08 00 B3 07 00 96 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 B3 08 00 B3 07 00 96 01 FF 00 1D 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 B3 08 00 B3 07 00 96 FF 00 1E 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 00 B3 08 00 B3 07 00 96 07 00 96 05 03 03 03 03 01 05 FF 00 01 00 01 07 00 03 00 0E 07 00 03 07 00 03 08 00 B3 08 00 B3 07 00 96 07 00 96 05 03 03 03 03 01 05 01 FF 00 1E 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 00 B3 08 00 B3 07 00 96 07 00 96 05 03 03 03 03 01 05 FF 00 5D 00 01 07 00 03 00 02 07 00 03 07 00 6B FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 6B 01 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 6B 0D 41 01 1B FF 00 12 00 01 07 00 03 00 02 07 00 03 07 00 85 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 85 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 85 0D 41 01 1B FF 00 0B 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 00 B3 08 00 B3 07 00 96 07 00 96 05 03 03 03 03 01 05 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 85 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 3A 08 00 3A 07 00 96 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 6B 01 01 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 44 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 B3 08 00 B3 07 00 96
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
    
    @NotNull
    public ConcurrentLinkedQueue 2() {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0038:
            while (true) {
                do {
                    Label_0025: {
                        break Label_0025;
                        try {
                            o = null;
                            if (fc.c >= 0) {
                                null;
                                goto Label_0030;
                            }
                            continue Label_0038;
                            return this.c;
                        }
                        catch (RuntimeException ex) {}
                    }
                    continue Label_0038;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    @NotNull
    public f0a 5() {
        return fbS.K(this, 889701130);
    }
    
    @NotNull
    public f0f 0() {
        return fbS.h5(this, 1791617120);
    }
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1490
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1482
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1474
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            37
        //    32: ldc             166564282
        //    34: goto            39
        //    37: ldc             -210695190
        //    39: ldc             1123090651
        //    41: ixor           
        //    42: lookupswitch {
        //          -1317008591: 68
        //          1260163425: 37
        //          default: 1459
        //        }
        //    68: aload_0        
        //    69: aload_0        
        //    70: getstatic       dev/nuker/pyro/fc.c:I
        //    73: ifge            81
        //    76: ldc             1126697754
        //    78: goto            83
        //    81: ldc             -1439101564
        //    83: ldc             701999666
        //    85: ixor           
        //    86: lookupswitch {
        //          -1908856233: 81
        //          1795137832: 1431
        //          default: 112
        //        }
        //   112: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   115: goto            119
        //   118: athrow         
        //   119: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.size:()I
        //   122: goto            126
        //   125: athrow         
        //   126: goto            130
        //   129: athrow         
        //   130: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   133: goto            137
        //   136: athrow         
        //   137: goto            141
        //   140: athrow         
        //   141: invokevirtual   dev/nuker/pyro/f6H.4:(Ljava/lang/String;)V
        //   144: goto            148
        //   147: athrow         
        //   148: aload_0        
        //   149: getfield        dev/nuker/pyro/f6H.c:Ldev/nuker/pyro/fbu;
        //   152: getstatic       dev/nuker/pyro/fc.0:I
        //   155: ifeq            163
        //   158: ldc             -1128247274
        //   160: goto            165
        //   163: ldc             1229646694
        //   165: ldc             -68857177
        //   167: ixor           
        //   168: lookupswitch {
        //          -586976351: 163
        //          1193607857: 1433
        //          default: 196
        //        }
        //   196: aload_0        
        //   197: getfield        dev/nuker/pyro/f6H.c:Ldev/nuker/pyro/f0d;
        //   200: goto            204
        //   203: athrow         
        //   204: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   207: goto            211
        //   210: athrow         
        //   211: checkcast       Ljava/lang/Number;
        //   214: goto            218
        //   217: athrow         
        //   218: invokevirtual   java/lang/Number.doubleValue:()D
        //   221: goto            225
        //   224: athrow         
        //   225: sipush          1000
        //   228: i2d            
        //   229: dmul           
        //   230: getstatic       dev/nuker/pyro/fc.1:I
        //   233: ifeq            241
        //   236: ldc             -9739101
        //   238: goto            243
        //   241: ldc             -300924533
        //   243: ldc             -1822130333
        //   245: ixor           
        //   246: lookupswitch {
        //          -1431310191: 241
        //          1812929472: 1441
        //          default: 272
        //        }
        //   272: goto            276
        //   275: athrow         
        //   276: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //   279: goto            283
        //   282: athrow         
        //   283: ifeq            1428
        //   286: getstatic       dev/nuker/pyro/fc.c:I
        //   289: ifge            297
        //   292: ldc             1616456303
        //   294: goto            299
        //   297: ldc             -1804687836
        //   299: ldc             -1364317242
        //   301: ixor           
        //   302: lookupswitch {
        //          -822672983: 1439
        //          -755304694: 297
        //          default: 328
        //        }
        //   328: aload_0        
        //   329: getfield        dev/nuker/pyro/f6H.c:Ldev/nuker/pyro/fbu;
        //   332: goto            336
        //   335: athrow         
        //   336: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //   339: goto            343
        //   342: athrow         
        //   343: getstatic       dev/nuker/pyro/fc.1:I
        //   346: ifeq            354
        //   349: ldc             1243303609
        //   351: goto            356
        //   354: ldc             1116031306
        //   356: ldc             -2136796430
        //   358: ixor           
        //   359: lookupswitch {
        //          -1037673544: 384
        //          -893887413: 354
        //          default: 1461
        //        }
        //   384: aload_0        
        //   385: getfield        dev/nuker/pyro/f6H.c:Ldev/nuker/pyro/f0f;
        //   388: goto            392
        //   391: athrow         
        //   392: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   395: goto            399
        //   398: athrow         
        //   399: checkcast       Ldev/nuker/pyro/f6F;
        //   402: getstatic       dev/nuker/pyro/f6F.0:Ldev/nuker/pyro/f6F;
        //   405: if_acmpne       1144
        //   408: nop            
        //   409: aload_0        
        //   410: getfield        dev/nuker/pyro/f6H.c:Lnet/minecraft/client/Minecraft;
        //   413: dup            
        //   414: pop            
        //   415: getstatic       dev/nuker/pyro/fc.1:I
        //   418: ifeq            427
        //   421: ldc_w           -1089261671
        //   424: goto            430
        //   427: ldc_w           2117446897
        //   430: ldc_w           -215720093
        //   433: ixor           
        //   434: lookupswitch {
        //          -1928203374: 460
        //          1278701818: 427
        //          default: 1463
        //        }
        //   460: goto            464
        //   463: athrow         
        //   464: invokevirtual   net/minecraft/client/Minecraft.func_147114_u:()Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   467: goto            471
        //   470: athrow         
        //   471: dup            
        //   472: ifnonnull       481
        //   475: ldc_w           -1419261818
        //   478: goto            484
        //   481: ldc_w           -1419261823
        //   484: ldc_w           996299413
        //   487: ixor           
        //   488: tableswitch {
        //          537605158: 512
        //          537605159: 567
        //          default: 475
        //        }
        //   512: getstatic       dev/nuker/pyro/fc.0:I
        //   515: ifeq            524
        //   518: ldc_w           -1695178325
        //   521: goto            527
        //   524: ldc_w           -1141625585
        //   527: ldc_w           -997160455
        //   530: ixor           
        //   531: lookupswitch {
        //          1583687762: 1443
        //          1981806330: 524
        //          default: 556
        //        }
        //   556: goto            560
        //   559: athrow         
        //   560: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   563: goto            567
        //   566: athrow         
        //   567: dup            
        //   568: pop            
        //   569: goto            573
        //   572: athrow         
        //   573: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_175106_d:()Ljava/util/Collection;
        //   576: goto            580
        //   579: athrow         
        //   580: dup            
        //   581: pop            
        //   582: checkcast       Ljava/lang/Iterable;
        //   585: astore_2       
        //   586: iconst_0       
        //   587: getstatic       dev/nuker/pyro/fc.1:I
        //   590: ifeq            599
        //   593: ldc_w           -1622056740
        //   596: goto            602
        //   599: ldc_w           1737641290
        //   602: ldc_w           39696191
        //   605: ixor           
        //   606: lookupswitch {
        //          -1801990791: 599
        //          -1660102685: 1455
        //          default: 632
        //        }
        //   632: istore_3       
        //   633: aload_2        
        //   634: goto            638
        //   637: athrow         
        //   638: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   643: goto            647
        //   646: athrow         
        //   647: astore          4
        //   649: aload           4
        //   651: goto            655
        //   654: athrow         
        //   655: invokeinterface java/util/Iterator.hasNext:()Z
        //   660: goto            664
        //   663: athrow         
        //   664: ifeq            673
        //   667: ldc_w           -47625910
        //   670: goto            676
        //   673: ldc_w           -47625911
        //   676: ldc_w           -530873113
        //   679: ixor           
        //   680: tableswitch {
        //          988126042: 704
        //          988126043: 1093
        //          default: 667
        //        }
        //   704: aload           4
        //   706: goto            710
        //   709: athrow         
        //   710: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   715: goto            719
        //   718: athrow         
        //   719: astore          5
        //   721: aload           5
        //   723: checkcast       Lnet/minecraft/client/network/NetworkPlayerInfo;
        //   726: getstatic       dev/nuker/pyro/fc.0:I
        //   729: ifeq            738
        //   732: ldc_w           -1052503803
        //   735: goto            741
        //   738: ldc_w           19292315
        //   741: ldc_w           -1438168979
        //   744: ixor           
        //   745: lookupswitch {
        //          210101362: 738
        //          1795381608: 1451
        //          default: 772
        //        }
        //   772: astore          6
        //   774: iconst_0       
        //   775: istore          7
        //   777: aload           6
        //   779: dup            
        //   780: pop            
        //   781: goto            785
        //   784: athrow         
        //   785: invokevirtual   net/minecraft/client/network/NetworkPlayerInfo.func_178845_a:()Lcom/mojang/authlib/GameProfile;
        //   788: goto            792
        //   791: athrow         
        //   792: ifnull          1088
        //   795: getstatic       dev/nuker/pyro/fc.0:I
        //   798: ifeq            807
        //   801: ldc_w           -1288432773
        //   804: goto            810
        //   807: ldc_w           1027623695
        //   810: ldc_w           -515187786
        //   813: ixor           
        //   814: lookupswitch {
        //          1384040653: 1447
        //          1779835492: 807
        //          default: 840
        //        }
        //   840: aload           6
        //   842: goto            846
        //   845: athrow         
        //   846: invokevirtual   net/minecraft/client/network/NetworkPlayerInfo.func_178845_a:()Lcom/mojang/authlib/GameProfile;
        //   849: goto            853
        //   852: athrow         
        //   853: dup            
        //   854: pop            
        //   855: goto            859
        //   858: athrow         
        //   859: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //   862: goto            866
        //   865: athrow         
        //   866: astore          8
        //   868: getstatic       dev/nuker/pyro/FriendManager.Companion:Ldev/nuker/pyro/FriendManager$Companion;
        //   871: aload           8
        //   873: dup            
        //   874: pop            
        //   875: goto            879
        //   878: athrow         
        //   879: invokevirtual   dev/nuker/pyro/FriendManager$Companion.isFriend:(Ljava/lang/String;)Z
        //   882: goto            886
        //   885: athrow         
        //   886: ifne            1088
        //   889: aload_0        
        //   890: getfield        dev/nuker/pyro/f6H.c:Lnet/minecraft/client/Minecraft;
        //   893: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   896: new             Ljava/lang/StringBuilder;
        //   899: dup            
        //   900: goto            904
        //   903: athrow         
        //   904: invokespecial   java/lang/StringBuilder.<init>:()V
        //   907: goto            911
        //   910: athrow         
        //   911: ldc_w           "\u239f\u1491\u8ac8\ub1c6\ucfee"
        //   914: getstatic       dev/nuker/pyro/fc.c:I
        //   917: ifge            926
        //   920: ldc_w           -272047126
        //   923: goto            929
        //   926: ldc_w           -1857063908
        //   929: ldc_w           55682964
        //   932: ixor           
        //   933: lookupswitch {
        //          -1843473528: 960
        //          -325499778: 926
        //          default: 1435
        //        }
        //   960: goto            964
        //   963: athrow         
        //   964: invokestatic    invokestatic   !!! ERROR
        //   967: goto            971
        //   970: athrow         
        //   971: goto            975
        //   974: athrow         
        //   975: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   978: goto            982
        //   981: athrow         
        //   982: aload           8
        //   984: goto            988
        //   987: athrow         
        //   988: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   991: goto            995
        //   994: athrow         
        //   995: ldc_w           "\u2390\u14aa\u8ac6\ub1dd\ucfee\uedd7\ub236\ue6e1\udb39\uefdf\ua717\u1e42\ue1ce\uc7b3\u875e\u890c"
        //   998: goto            1002
        //  1001: athrow         
        //  1002: invokestatic    invokestatic   !!! ERROR
        //  1005: goto            1009
        //  1008: athrow         
        //  1009: goto            1013
        //  1012: athrow         
        //  1013: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1016: goto            1020
        //  1019: athrow         
        //  1020: goto            1024
        //  1023: athrow         
        //  1024: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1027: goto            1031
        //  1030: athrow         
        //  1031: getstatic       dev/nuker/pyro/fc.0:I
        //  1034: ifeq            1043
        //  1037: ldc_w           -1247127838
        //  1040: goto            1046
        //  1043: ldc_w           158836628
        //  1046: ldc_w           -1295911970
        //  1049: ixor           
        //  1050: lookupswitch {
        //          -1145678774: 1076
        //          124495164: 1043
        //          default: 1437
        //        }
        //  1076: goto            1080
        //  1079: athrow         
        //  1080: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_71165_d:(Ljava/lang/String;)V
        //  1083: goto            1087
        //  1086: athrow         
        //  1087: return         
        //  1088: nop            
        //  1089: nop            
        //  1090: goto            649
        //  1093: goto            1428
        //  1096: getstatic       dev/nuker/pyro/fc.c:I
        //  1099: ifge            1108
        //  1102: ldc_w           873525529
        //  1105: goto            1111
        //  1108: ldc_w           -1354015091
        //  1111: ldc_w           -1699282616
        //  1114: ixor           
        //  1115: lookupswitch {
        //          -1364725679: 1429
        //          -969098377: 1108
        //          default: 1140
        //        }
        //  1140: astore_2       
        //  1141: goto            1428
        //  1144: aload_0        
        //  1145: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //  1148: goto            1152
        //  1151: athrow         
        //  1152: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.isEmpty:()Z
        //  1155: goto            1159
        //  1158: athrow         
        //  1159: ifeq            1346
        //  1162: aload_0        
        //  1163: getfield        dev/nuker/pyro/f6H.c:Ldev/nuker/pyro/f0a;
        //  1166: goto            1170
        //  1169: athrow         
        //  1170: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1173: goto            1177
        //  1176: athrow         
        //  1177: checkcast       Ljava/lang/Boolean;
        //  1180: getstatic       dev/nuker/pyro/fc.1:I
        //  1183: ifeq            1192
        //  1186: ldc_w           1079630676
        //  1189: goto            1195
        //  1192: ldc_w           -2143818115
        //  1195: ldc_w           37377586
        //  1198: ixor           
        //  1199: lookupswitch {
        //          -2113030065: 1224
        //          1113820518: 1192
        //          default: 1449
        //        }
        //  1224: goto            1228
        //  1227: athrow         
        //  1228: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1231: goto            1235
        //  1234: athrow         
        //  1235: ifeq            1428
        //  1238: getstatic       dev/nuker/pyro/fc.1:I
        //  1241: ifeq            1250
        //  1244: ldc_w           -1060976039
        //  1247: goto            1253
        //  1250: ldc_w           1601152861
        //  1253: ldc_w           -491580252
        //  1256: ixor           
        //  1257: lookupswitch {
        //          -1109609479: 1284
        //          577887997: 1250
        //          default: 1457
        //        }
        //  1284: aload_0        
        //  1285: getstatic       dev/nuker/pyro/fc.0:I
        //  1288: ifeq            1297
        //  1291: ldc_w           1598757421
        //  1294: goto            1300
        //  1297: ldc_w           -739615845
        //  1300: ldc_w           846092536
        //  1303: ixor           
        //  1304: lookupswitch {
        //          -511442077: 1332
        //          1831158485: 1297
        //          default: 1445
        //        }
        //  1332: goto            1336
        //  1335: athrow         
        //  1336: invokespecial   dev/nuker/pyro/f6H.4:()V
        //  1339: goto            1343
        //  1342: athrow         
        //  1343: goto            1428
        //  1346: aload_0        
        //  1347: getfield        dev/nuker/pyro/f6H.c:Lnet/minecraft/client/Minecraft;
        //  1350: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1353: aload_0        
        //  1354: getstatic       dev/nuker/pyro/fc.c:I
        //  1357: ifge            1366
        //  1360: ldc_w           1174904752
        //  1363: goto            1369
        //  1366: ldc_w           1705809091
        //  1369: ldc_w           -1650775502
        //  1372: ixor           
        //  1373: lookupswitch {
        //          -610486910: 1453
        //          690781741: 1366
        //          default: 1400
        //        }
        //  1400: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //  1403: goto            1407
        //  1406: athrow         
        //  1407: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.poll:()Ljava/lang/Object;
        //  1410: goto            1414
        //  1413: athrow         
        //  1414: checkcast       Ljava/lang/String;
        //  1417: goto            1421
        //  1420: athrow         
        //  1421: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_71165_d:(Ljava/lang/String;)V
        //  1424: goto            1428
        //  1427: athrow         
        //  1428: return         
        //  1429: aconst_null    
        //  1430: athrow         
        //  1431: aconst_null    
        //  1432: athrow         
        //  1433: aconst_null    
        //  1434: athrow         
        //  1435: aconst_null    
        //  1436: athrow         
        //  1437: aconst_null    
        //  1438: athrow         
        //  1439: aconst_null    
        //  1440: athrow         
        //  1441: aconst_null    
        //  1442: athrow         
        //  1443: aconst_null    
        //  1444: athrow         
        //  1445: aconst_null    
        //  1446: athrow         
        //  1447: aconst_null    
        //  1448: athrow         
        //  1449: aconst_null    
        //  1450: athrow         
        //  1451: aconst_null    
        //  1452: athrow         
        //  1453: aconst_null    
        //  1454: athrow         
        //  1455: aconst_null    
        //  1456: athrow         
        //  1457: aconst_null    
        //  1458: athrow         
        //  1459: aconst_null    
        //  1460: athrow         
        //  1461: aconst_null    
        //  1462: athrow         
        //  1463: aconst_null    
        //  1464: athrow         
        //  1465: pop            
        //  1466: goto            24
        //  1469: pop            
        //  1470: aconst_null    
        //  1471: goto            1465
        //  1474: dup            
        //  1475: ifnull          1465
        //  1478: checkcast       Ljava/lang/Throwable;
        //  1481: athrow         
        //  1482: dup            
        //  1483: ifnull          1469
        //  1486: checkcast       Ljava/lang/Throwable;
        //  1489: athrow         
        //  1490: aconst_null    
        //  1491: athrow         
        //    StackMapTable: 00 DF 43 07 00 9E 04 FF 00 0B 00 00 00 01 07 00 9E FD 00 03 07 00 03 07 01 88 0C 41 01 1C FF 00 0C 00 02 07 00 03 07 01 88 00 02 07 00 03 07 00 03 FF 00 01 00 02 07 00 03 07 01 88 00 03 07 00 03 07 00 03 01 FF 00 1C 00 02 07 00 03 07 01 88 00 02 07 00 03 07 00 03 45 07 00 9E FF 00 00 00 02 07 00 03 07 01 88 00 02 07 00 03 07 00 91 45 07 00 9E FF 00 00 00 02 07 00 03 07 01 88 00 02 07 00 03 01 FF 00 02 00 00 00 01 07 00 9E FF 00 00 00 02 07 00 03 07 01 88 00 02 07 00 03 01 45 07 00 9E FF 00 00 00 02 07 00 03 07 01 88 00 02 07 00 03 07 00 96 42 07 00 9A FF 00 00 00 02 07 00 03 07 01 88 00 02 07 00 03 07 00 96 45 07 00 9E 00 4E 07 00 85 FF 00 01 00 02 07 00 03 07 01 88 00 02 07 00 85 01 5E 07 00 85 46 07 00 B8 FF 00 00 00 02 07 00 03 07 01 88 00 02 07 00 85 07 00 50 45 07 00 9E FF 00 00 00 02 07 00 03 07 01 88 00 02 07 00 85 07 01 8A FF 00 05 00 00 00 01 07 00 9E FF 00 00 00 02 07 00 03 07 01 88 00 02 07 00 85 07 00 E7 45 07 00 9E FF 00 00 00 02 07 00 03 07 01 88 00 02 07 00 85 03 FF 00 0F 00 02 07 00 03 07 01 88 00 02 07 00 85 03 FF 00 01 00 02 07 00 03 07 01 88 00 03 07 00 85 03 01 FF 00 1C 00 02 07 00 03 07 01 88 00 02 07 00 85 03 42 07 00 9E FF 00 00 00 02 07 00 03 07 01 88 00 02 07 00 85 03 45 07 00 9E 40 01 0D 41 01 1C 46 07 00 B2 40 07 00 85 45 07 00 9E 00 0A 41 01 1B 46 07 00 C0 40 07 00 6B 45 07 00 9E 40 07 01 8A 5B 07 01 04 FF 00 02 00 02 07 00 03 07 01 88 00 02 07 01 04 01 5D 07 01 04 42 07 00 B6 40 07 01 04 45 07 00 9E 40 07 01 15 43 07 01 15 45 07 01 15 FF 00 02 00 02 07 00 03 07 01 88 00 02 07 01 15 01 5B 07 01 15 4B 07 01 15 FF 00 02 00 02 07 00 03 07 01 88 00 02 07 01 15 01 5C 07 01 15 42 07 00 9E 40 07 01 15 45 07 00 9E 40 07 01 15 FF 00 04 00 00 00 01 07 00 9E FF 00 00 00 02 07 00 03 07 01 88 00 01 07 01 15 45 07 00 9E 40 07 01 8C FF 00 12 00 03 07 00 03 07 01 88 07 01 1B 00 01 01 FF 00 02 00 03 07 00 03 07 01 88 07 01 1B 00 02 01 01 5D 01 FF 00 04 00 04 07 00 03 07 01 88 07 01 1B 01 00 01 07 00 9E 40 07 01 1B 47 07 00 9E 40 07 01 24 FC 00 01 07 01 24 44 07 00 9E 40 07 01 24 47 07 00 9E 40 01 02 05 42 01 1B 44 07 00 B4 40 07 01 24 47 07 00 9E 40 07 01 8A FF 00 12 00 06 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 00 01 07 01 30 FF 00 02 00 06 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 00 02 07 01 30 01 5E 07 01 30 FF 00 0B 00 08 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 00 01 07 00 C0 40 07 01 30 45 07 00 9E 40 07 01 3C 0E 42 01 1D 44 07 00 9E 40 07 01 30 45 07 00 9E 40 07 01 3C 44 07 00 9E 40 07 01 3C 45 07 00 9E 40 07 00 96 FF 00 0B 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 01 07 00 9E FF 00 00 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 02 07 01 48 07 00 96 45 07 00 9E 40 01 50 07 00 C6 FF 00 00 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 03 07 01 66 08 03 80 08 03 80 45 07 00 9E FF 00 00 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 02 07 01 66 07 01 52 FF 00 0E 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 03 07 01 66 07 01 52 07 00 96 FF 00 02 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 04 07 01 66 07 01 52 07 00 96 01 FF 00 1E 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 03 07 01 66 07 01 52 07 00 96 FF 00 02 00 00 00 01 07 00 9E FF 00 00 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 03 07 01 66 07 01 52 07 00 96 45 07 00 9E FF 00 00 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 03 07 01 66 07 01 52 07 00 96 42 07 00 9E FF 00 00 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 03 07 01 66 07 01 52 07 00 96 45 07 00 9E FF 00 00 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 02 07 01 66 07 01 52 44 07 00 9E FF 00 00 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 03 07 01 66 07 01 52 07 00 96 45 07 00 9E FF 00 00 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 02 07 01 66 07 01 52 45 07 00 CA FF 00 00 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 03 07 01 66 07 01 52 07 00 96 45 07 00 9E FF 00 00 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 03 07 01 66 07 01 52 07 00 96 42 07 00 B6 FF 00 00 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 03 07 01 66 07 01 52 07 00 96 45 07 00 9E FF 00 00 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 02 07 01 66 07 01 52 42 07 00 9A FF 00 00 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 02 07 01 66 07 01 52 45 07 00 9E FF 00 00 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 02 07 01 66 07 00 96 FF 00 0B 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 02 07 01 66 07 00 96 FF 00 02 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 03 07 01 66 07 00 96 01 FF 00 1D 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 02 07 01 66 07 00 96 FF 00 02 00 00 00 01 07 00 9E FF 00 00 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 02 07 01 66 07 00 96 45 07 00 9E 00 FA 00 00 F8 00 04 FF 00 02 00 02 07 00 03 07 01 88 00 01 07 00 B0 4B 07 00 B0 FF 00 02 00 02 07 00 03 07 01 88 00 02 07 00 B0 01 5C 07 00 B0 03 46 07 00 9E 40 07 00 91 45 07 00 9E 40 01 FF 00 09 00 00 00 01 07 00 9E FF 00 00 00 02 07 00 03 07 01 88 00 01 07 00 38 45 07 00 9E 40 07 01 8A 4E 07 01 72 FF 00 02 00 02 07 00 03 07 01 88 00 02 07 01 72 01 5C 07 01 72 42 07 00 9E 40 07 01 72 45 07 00 9E 40 01 0E 42 01 1E 4C 07 00 03 FF 00 02 00 02 07 00 03 07 01 88 00 02 07 00 03 01 5F 07 00 03 42 07 00 C0 40 07 00 03 45 07 00 9E 00 02 FF 00 13 00 02 07 00 03 07 01 88 00 02 07 01 66 07 00 03 FF 00 02 00 02 07 00 03 07 01 88 00 03 07 01 66 07 00 03 01 FF 00 1E 00 02 07 00 03 07 01 88 00 02 07 01 66 07 00 03 45 07 00 9E FF 00 00 00 02 07 00 03 07 01 88 00 02 07 01 66 07 00 91 45 07 00 9E FF 00 00 00 02 07 00 03 07 01 88 00 02 07 01 66 07 01 8A 45 07 00 9A FF 00 00 00 02 07 00 03 07 01 88 00 02 07 01 66 07 00 96 45 07 00 9E 00 40 07 00 B0 FF 00 01 00 02 07 00 03 07 01 88 00 02 07 00 03 07 00 03 41 07 00 85 FF 00 01 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 03 07 01 66 07 01 52 07 00 96 FF 00 01 00 09 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 07 00 96 00 02 07 01 66 07 00 96 FF 00 01 00 02 07 00 03 07 01 88 00 00 FF 00 01 00 02 07 00 03 07 01 88 00 02 07 00 85 03 41 07 01 15 41 07 00 03 FF 00 01 00 08 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 07 01 30 01 00 00 FF 00 01 00 02 07 00 03 07 01 88 00 01 07 01 72 FF 00 01 00 06 07 00 03 07 01 88 07 01 1B 01 07 01 24 07 01 8A 00 01 07 01 30 FF 00 01 00 02 07 00 03 07 01 88 00 02 07 01 66 07 00 03 FF 00 01 00 03 07 00 03 07 01 88 07 01 1B 00 01 01 FA 00 01 01 01 41 07 01 04 41 07 00 9E 43 05 44 07 00 9E 47 05 47 07 00 9E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  408    572    1096   1144   Ljava/lang/Exception;
        //  573    963    1096   1144   Ljava/lang/Exception;
        //  964    1079   1096   1144   Ljava/lang/Exception;
        //  1080   1093   1096   1144   Ljava/lang/Exception;
        //  8      20     1474   1482   Any
        //  1474   1482   1474   1482   Any
        //  1490   1492   3      8      Ljava/lang/ArithmeticException;
        //  118    125    125    126    Any
        //  118    125    118    119    Ljava/lang/RuntimeException;
        //  118    125    118    119    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  119    125    125    126    Any
        //  119    125    118    119    Any
        //  130    136    136    137    Any
        //  130    136    3      8      Any
        //  130    136    3      8      Ljava/lang/NumberFormatException;
        //  130    136    3      8      Any
        //  130    136    3      8      Any
        //  140    147    147    148    Any
        //  140    147    147    148    Ljava/lang/NumberFormatException;
        //  141    147    3      8      Any
        //  140    147    140    141    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  140    147    140    141    Ljava/lang/NullPointerException;
        //  203    210    210    211    Any
        //  203    210    203    204    Ljava/lang/EnumConstantNotPresentException;
        //  204    210    210    211    Ljava/lang/NumberFormatException;
        //  203    210    210    211    Any
        //  204    210    210    211    Any
        //  218    224    224    225    Any
        //  218    224    224    225    Any
        //  218    224    224    225    Ljava/util/NoSuchElementException;
        //  218    224    224    225    Ljava/lang/EnumConstantNotPresentException;
        //  218    224    3      8      Any
        //  275    282    282    283    Any
        //  275    282    275    276    Any
        //  276    282    275    276    Ljava/lang/NumberFormatException;
        //  275    282    282    283    Ljava/lang/IndexOutOfBoundsException;
        //  275    282    275    276    Ljava/lang/EnumConstantNotPresentException;
        //  335    342    342    343    Any
        //  336    342    335    336    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  336    342    342    343    Any
        //  335    342    3      8      Ljava/lang/NegativeArraySizeException;
        //  336    342    342    343    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  391    398    398    399    Any
        //  392    398    3      8      Any
        //  391    398    398    399    Any
        //  392    398    391    392    Ljava/lang/StringIndexOutOfBoundsException;
        //  391    398    398    399    Ljava/lang/AssertionError;
        //  463    470    470    471    Any
        //  464    470    3      8      Ljava/lang/IllegalArgumentException;
        //  464    470    463    464    Ljava/lang/NullPointerException;
        //  463    470    470    471    Ljava/util/ConcurrentModificationException;
        //  464    470    3      8      Any
        //  559    566    566    567    Any
        //  559    566    566    567    Any
        //  560    566    559    560    Any
        //  559    566    566    567    Any
        //  559    566    559    560    Ljava/lang/RuntimeException;
        //  573    579    579    580    Any
        //  573    579    579    580    Ljava/lang/IllegalArgumentException;
        //  573    579    3      8      Any
        //  573    579    579    580    Ljava/lang/EnumConstantNotPresentException;
        //  573    579    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  637    646    646    647    Any
        //  638    646    637    638    Any
        //  638    646    646    647    Any
        //  638    646    637    638    Ljava/lang/IndexOutOfBoundsException;
        //  637    646    3      8      Any
        //  654    663    663    664    Any
        //  654    663    654    655    Ljava/lang/IndexOutOfBoundsException;
        //  655    663    663    664    Any
        //  655    663    654    655    Any
        //  654    663    3      8      Ljava/lang/NegativeArraySizeException;
        //  709    718    718    719    Any
        //  709    718    718    719    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  709    718    718    719    Ljava/lang/NegativeArraySizeException;
        //  710    718    3      8      Any
        //  709    718    709    710    Ljava/lang/NumberFormatException;
        //  784    791    791    792    Any
        //  785    791    791    792    Ljava/lang/NumberFormatException;
        //  785    791    791    792    Any
        //  784    791    3      8      Ljava/lang/RuntimeException;
        //  784    791    784    785    Ljava/lang/StringIndexOutOfBoundsException;
        //  845    852    852    853    Any
        //  846    852    852    853    Ljava/lang/StringIndexOutOfBoundsException;
        //  845    852    3      8      Any
        //  846    852    845    846    Any
        //  846    852    852    853    Ljava/lang/IllegalStateException;
        //  858    865    865    866    Any
        //  859    865    858    859    Ljava/lang/EnumConstantNotPresentException;
        //  859    865    865    866    Ljava/lang/IllegalStateException;
        //  859    865    3      8      Any
        //  858    865    858    859    Any
        //  878    885    885    886    Any
        //  879    885    3      8      Ljava/lang/IllegalStateException;
        //  879    885    3      8      Any
        //  879    885    3      8      Ljava/lang/IllegalArgumentException;
        //  878    885    878    879    Any
        //  903    910    910    911    Any
        //  903    910    910    911    Ljava/util/ConcurrentModificationException;
        //  904    910    3      8      Any
        //  903    910    3      8      Any
        //  904    910    903    904    Ljava/util/ConcurrentModificationException;
        //  964    970    970    971    Any
        //  964    970    3      8      Ljava/lang/NegativeArraySizeException;
        //  964    970    3      8      Any
        //  964    970    3      8      Any
        //  964    970    970    971    Any
        //  974    981    981    982    Any
        //  974    981    981    982    Any
        //  974    981    3      8      Any
        //  975    981    974    975    Any
        //  975    981    981    982    Any
        //  987    994    994    995    Any
        //  987    994    994    995    Ljava/lang/UnsupportedOperationException;
        //  988    994    987    988    Any
        //  988    994    994    995    Ljava/lang/RuntimeException;
        //  988    994    987    988    Any
        //  1001   1008   1008   1009   Any
        //  1002   1008   1001   1002   Ljava/lang/UnsupportedOperationException;
        //  1002   1008   1008   1009   Ljava/lang/NegativeArraySizeException;
        //  1002   1008   3      8      Any
        //  1002   1008   3      8      Any
        //  1012   1019   1019   1020   Any
        //  1012   1019   3      8      Ljava/lang/UnsupportedOperationException;
        //  1013   1019   3      8      Any
        //  1012   1019   1012   1013   Ljava/lang/NullPointerException;
        //  1013   1019   3      8      Any
        //  1023   1030   1030   1031   Any
        //  1023   1030   1030   1031   Ljava/lang/NegativeArraySizeException;
        //  1024   1030   1023   1024   Ljava/lang/EnumConstantNotPresentException;
        //  1024   1030   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1023   1030   1023   1024   Ljava/lang/ClassCastException;
        //  1080   1086   1086   1087   Any
        //  1080   1086   1086   1087   Any
        //  1080   1086   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1080   1086   3      8      Ljava/util/NoSuchElementException;
        //  1080   1086   1086   1087   Ljava/lang/AssertionError;
        //  1151   1158   1158   1159   Any
        //  1151   1158   1151   1152   Any
        //  1151   1158   1151   1152   Any
        //  1152   1158   3      8      Ljava/util/NoSuchElementException;
        //  1151   1158   1158   1159   Ljava/lang/RuntimeException;
        //  1170   1176   1176   1177   Any
        //  1170   1176   3      8      Ljava/lang/RuntimeException;
        //  1170   1176   3      8      Any
        //  1170   1176   3      8      Any
        //  1170   1176   3      8      Ljava/lang/NullPointerException;
        //  1227   1234   1234   1235   Any
        //  1227   1234   3      8      Any
        //  1227   1234   1234   1235   Any
        //  1228   1234   1227   1228   Any
        //  1227   1234   1227   1228   Any
        //  1335   1342   1342   1343   Any
        //  1336   1342   1335   1336   Ljava/lang/StringIndexOutOfBoundsException;
        //  1335   1342   1342   1343   Any
        //  1335   1342   3      8      Ljava/lang/AssertionError;
        //  1336   1342   1342   1343   Any
        //  1406   1413   1413   1414   Any
        //  1407   1413   1406   1407   Ljava/lang/IndexOutOfBoundsException;
        //  1407   1413   1413   1414   Ljava/util/NoSuchElementException;
        //  1407   1413   3      8      Ljava/util/NoSuchElementException;
        //  1406   1413   1406   1407   Any
        //  1420   1427   1427   1428   Any
        //  1421   1427   1420   1421   Ljava/lang/EnumConstantNotPresentException;
        //  1420   1427   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1421   1427   3      8      Any
        //  1421   1427   1420   1421   Ljava/util/ConcurrentModificationException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:624)
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
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          750
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            742
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            734
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            37
        //    31: ldc_w           -1753651559
        //    34: goto            40
        //    37: ldc_w           -1263177993
        //    40: ldc_w           591234034
        //    43: ixor           
        //    44: lookupswitch {
        //          -1270553237: 719
        //          1457310846: 37
        //          default: 72
        //        }
        //    72: iload_1        
        //    73: getstatic       dev/nuker/pyro/fc.0:I
        //    76: ifeq            85
        //    79: ldc_w           183430791
        //    82: goto            88
        //    85: ldc_w           2130327239
        //    88: ldc_w           693111403
        //    91: ixor           
        //    92: lookupswitch {
        //          599713004: 709
        //          922655783: 85
        //          default: 120
        //        }
        //   120: aload_2        
        //   121: aload_3        
        //   122: getstatic       dev/nuker/pyro/fc.c:I
        //   125: ifge            134
        //   128: ldc_w           654024646
        //   131: goto            137
        //   134: ldc_w           534736566
        //   137: ldc_w           163408274
        //   140: ixor           
        //   141: lookupswitch {
        //          -316011430: 134
        //          793179732: 721
        //          default: 168
        //        }
        //   168: goto            172
        //   171: athrow         
        //   172: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //   175: goto            179
        //   178: athrow         
        //   179: aload_0        
        //   180: getfield        dev/nuker/pyro/f6H.c:Ldev/nuker/pyro/fbu;
        //   183: goto            187
        //   186: athrow         
        //   187: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //   190: goto            194
        //   193: athrow         
        //   194: getstatic       dev/nuker/pyro/fc.0:I
        //   197: ifeq            206
        //   200: ldc_w           -1200460259
        //   203: goto            209
        //   206: ldc_w           1859736822
        //   209: ldc_w           -663877170
        //   212: ixor           
        //   213: lookupswitch {
        //          -1229497032: 240
        //          1612474323: 206
        //          default: 707
        //        }
        //   240: aload_0        
        //   241: getstatic       dev/nuker/pyro/fc.0:I
        //   244: ifeq            253
        //   247: ldc_w           -405375385
        //   250: goto            256
        //   253: ldc_w           -478757465
        //   256: ldc_w           1787172782
        //   259: ixor           
        //   260: lookupswitch {
        //          -1980716535: 288
        //          -1924111927: 253
        //          default: 723
        //        }
        //   288: goto            292
        //   291: athrow         
        //   292: invokespecial   dev/nuker/pyro/f6H.4:()V
        //   295: goto            299
        //   298: athrow         
        //   299: aload_0        
        //   300: getstatic       dev/nuker/pyro/fc.1:I
        //   303: ifeq            312
        //   306: ldc_w           150106813
        //   309: goto            315
        //   312: ldc_w           -1624282778
        //   315: ldc_w           -1741709941
        //   318: ixor           
        //   319: lookupswitch {
        //          -1864503498: 312
        //          117503213: 344
        //          default: 711
        //        }
        //   344: getfield        dev/nuker/pyro/f6H.c:Ldev/nuker/pyro/f0f;
        //   347: goto            351
        //   350: athrow         
        //   351: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   354: goto            358
        //   357: athrow         
        //   358: checkcast       Ldev/nuker/pyro/f6F;
        //   361: getstatic       dev/nuker/pyro/f6F.c:Ldev/nuker/pyro/f6F;
        //   364: if_acmpne       373
        //   367: ldc_w           2084749187
        //   370: goto            376
        //   373: ldc_w           2084749184
        //   376: ldc_w           -475783454
        //   379: ixor           
        //   380: tableswitch {
        //          1070416578: 404
        //          1070416579: 706
        //          default: 367
        //        }
        //   404: aload_0        
        //   405: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   408: goto            412
        //   411: athrow         
        //   412: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.isEmpty:()Z
        //   415: goto            419
        //   418: athrow         
        //   419: ifeq            453
        //   422: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //   425: ldc_w           "\u23e0\u149f\u8acc\ub1c9\ucfbd\uedd3\ub264\ue6e2\udb70\uefd1\ua71a\u1e0c\ue1d4\uc7be\u875f\u890d\u57b7\u7731\ubf2d\uc66c\u2b2f\uc23e\u6a3b\u2f07\ud1b9\u35bc\u7d27\u898f\u8240\u8aed\u8499\ufb26\u70fe\u9847\u1deb\uf158\u4972\u8851\uc892\uf944\ub6fc\u41bd"
        //   428: goto            432
        //   431: athrow         
        //   432: invokestatic    invokestatic   !!! ERROR
        //   435: goto            439
        //   438: athrow         
        //   439: goto            443
        //   442: athrow         
        //   443: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //   446: goto            450
        //   449: athrow         
        //   450: goto            706
        //   453: getstatic       dev/nuker/pyro/fc.1:I
        //   456: ifeq            465
        //   459: ldc_w           2103950361
        //   462: goto            468
        //   465: ldc_w           352152029
        //   468: ldc_w           -78884828
        //   471: ixor           
        //   472: lookupswitch {
        //          -2043941827: 465
        //          -273597959: 500
        //          default: 715
        //        }
        //   500: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //   503: new             Ljava/lang/StringBuilder;
        //   506: dup            
        //   507: goto            511
        //   510: athrow         
        //   511: invokespecial   java/lang/StringBuilder.<init>:()V
        //   514: goto            518
        //   517: athrow         
        //   518: ldc_w           "\u23e3\u1483\u8ac8\ub1c5\ucfa3\uedd3\ub236\ue6a4\udb7f\uefd4\ua71a\u1e49\ue180\uc7be\u875b\u895e\u57e4"
        //   521: goto            525
        //   524: athrow         
        //   525: invokestatic    invokestatic   !!! ERROR
        //   528: goto            532
        //   531: athrow         
        //   532: goto            536
        //   535: athrow         
        //   536: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   539: goto            543
        //   542: athrow         
        //   543: aload_0        
        //   544: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   547: goto            551
        //   550: athrow         
        //   551: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.size:()I
        //   554: goto            558
        //   557: athrow         
        //   558: getstatic       dev/nuker/pyro/fc.1:I
        //   561: ifeq            570
        //   564: ldc_w           1567708909
        //   567: goto            573
        //   570: ldc_w           671355388
        //   573: ldc_w           -1747584071
        //   576: ixor           
        //   577: lookupswitch {
        //          -1076762043: 604
        //          -895177388: 570
        //          default: 717
        //        }
        //   604: goto            608
        //   607: athrow         
        //   608: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   611: goto            615
        //   614: athrow         
        //   615: ldc_w           "\u2390\u149f\u8ac0\ub1c6\ucfab\uedc5\ub264\ue6f0\udb76\uef9d\ua705\u1e5c\ue1c1\uc7bb\u871b"
        //   618: goto            622
        //   621: athrow         
        //   622: invokestatic    invokestatic   !!! ERROR
        //   625: goto            629
        //   628: athrow         
        //   629: goto            633
        //   632: athrow         
        //   633: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   636: goto            640
        //   639: athrow         
        //   640: getstatic       dev/nuker/pyro/fc.1:I
        //   643: ifeq            652
        //   646: ldc_w           711424679
        //   649: goto            655
        //   652: ldc_w           -1827199497
        //   655: ldc_w           -382174224
        //   658: ixor           
        //   659: lookupswitch {
        //          -1017183913: 713
        //          1692189137: 652
        //          default: 684
        //        }
        //   684: goto            688
        //   687: athrow         
        //   688: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   691: goto            695
        //   694: athrow         
        //   695: goto            699
        //   698: athrow         
        //   699: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //   702: goto            706
        //   705: athrow         
        //   706: return         
        //   707: aconst_null    
        //   708: athrow         
        //   709: aconst_null    
        //   710: athrow         
        //   711: aconst_null    
        //   712: athrow         
        //   713: aconst_null    
        //   714: athrow         
        //   715: aconst_null    
        //   716: athrow         
        //   717: aconst_null    
        //   718: athrow         
        //   719: aconst_null    
        //   720: athrow         
        //   721: aconst_null    
        //   722: athrow         
        //   723: aconst_null    
        //   724: athrow         
        //   725: pop            
        //   726: goto            24
        //   729: pop            
        //   730: aconst_null    
        //   731: goto            725
        //   734: dup            
        //   735: ifnull          725
        //   738: checkcast       Ljava/lang/Throwable;
        //   741: athrow         
        //   742: dup            
        //   743: ifnull          729
        //   746: checkcast       Ljava/lang/Throwable;
        //   749: athrow         
        //   750: aconst_null    
        //   751: athrow         
        //    StackMapTable: 00 72 43 07 00 9E 04 FF 00 0B 00 00 00 01 07 00 9E FF 00 03 00 04 07 00 03 01 07 01 66 07 01 C2 00 00 4C 07 00 03 FF 00 02 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 00 03 01 5F 07 00 03 FF 00 0C 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 00 03 01 FF 00 02 00 04 07 00 03 01 07 01 66 07 01 C2 00 03 07 00 03 01 01 FF 00 1F 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 00 03 01 FF 00 0D 00 04 07 00 03 01 07 01 66 07 01 C2 00 04 07 00 03 01 07 01 66 07 01 C2 FF 00 02 00 04 07 00 03 01 07 01 66 07 01 C2 00 05 07 00 03 01 07 01 66 07 01 C2 01 FF 00 1E 00 04 07 00 03 01 07 01 66 07 01 C2 00 04 07 00 03 01 07 01 66 07 01 C2 42 07 00 C6 FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 04 07 00 03 01 07 01 66 07 01 C2 45 07 00 9E 00 46 07 00 CA 40 07 00 85 45 07 00 9E 00 0B 42 01 1E 4C 07 00 03 FF 00 02 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 00 03 01 5F 07 00 03 42 07 00 C8 40 07 00 03 45 07 00 9E 00 4C 07 00 03 FF 00 02 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 00 03 01 5C 07 00 03 45 07 00 9A 40 07 00 6B 45 07 00 9E 40 07 01 8A 08 05 42 01 1B 46 07 00 BE 40 07 00 91 45 07 00 9E 40 01 4B 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 01 A7 07 00 96 45 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 01 A7 07 00 96 42 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 01 A7 07 00 96 45 07 00 9E 00 02 0B 42 01 1F 49 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 03 07 01 A7 08 01 F7 08 01 F7 45 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 01 A7 07 01 52 45 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 03 07 01 A7 07 01 52 07 00 96 45 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 03 07 01 A7 07 01 52 07 00 96 42 07 00 9A FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 03 07 01 A7 07 01 52 07 00 96 45 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 01 A7 07 01 52 FF 00 06 00 00 00 01 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 03 07 01 A7 07 01 52 07 00 91 45 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 03 07 01 A7 07 01 52 01 FF 00 0B 00 04 07 00 03 01 07 01 66 07 01 C2 00 03 07 01 A7 07 01 52 01 FF 00 02 00 04 07 00 03 01 07 01 66 07 01 C2 00 04 07 01 A7 07 01 52 01 01 FF 00 1E 00 04 07 00 03 01 07 01 66 07 01 C2 00 03 07 01 A7 07 01 52 01 42 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 03 07 01 A7 07 01 52 01 45 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 01 A7 07 01 52 45 07 00 CC FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 03 07 01 A7 07 01 52 07 00 96 45 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 03 07 01 A7 07 01 52 07 00 96 42 07 00 BE FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 03 07 01 A7 07 01 52 07 00 96 45 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 01 A7 07 01 52 FF 00 0B 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 01 A7 07 01 52 FF 00 02 00 04 07 00 03 01 07 01 66 07 01 C2 00 03 07 01 A7 07 01 52 01 FF 00 1C 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 01 A7 07 01 52 42 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 01 A7 07 01 52 45 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 01 A7 07 00 96 42 07 00 9E FF 00 00 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 01 A7 07 00 96 45 07 00 9E 00 00 FF 00 01 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 00 03 01 41 07 00 03 FF 00 01 00 04 07 00 03 01 07 01 66 07 01 C2 00 02 07 01 A7 07 01 52 01 FF 00 01 00 04 07 00 03 01 07 01 66 07 01 C2 00 03 07 01 A7 07 01 52 01 41 07 00 03 FF 00 01 00 04 07 00 03 01 07 01 66 07 01 C2 00 04 07 00 03 01 07 01 66 07 01 C2 41 07 00 03 41 07 00 9E 43 05 44 07 00 9E 47 05 47 07 00 9E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     734    742    Any
        //  734    742    734    742    Ljava/util/NoSuchElementException;
        //  750    752    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  171    178    178    179    Any
        //  172    178    3      8      Ljava/lang/NullPointerException;
        //  172    178    171    172    Ljava/util/ConcurrentModificationException;
        //  171    178    178    179    Any
        //  171    178    178    179    Any
        //  186    193    193    194    Any
        //  186    193    3      8      Ljava/lang/UnsupportedOperationException;
        //  187    193    193    194    Any
        //  187    193    3      8      Any
        //  187    193    186    187    Ljava/lang/UnsupportedOperationException;
        //  291    298    298    299    Any
        //  292    298    298    299    Any
        //  291    298    291    292    Ljava/lang/IllegalStateException;
        //  291    298    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  291    298    298    299    Ljava/util/NoSuchElementException;
        //  350    357    357    358    Any
        //  350    357    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  350    357    3      8      Ljava/lang/ArithmeticException;
        //  351    357    3      8      Any
        //  351    357    350    351    Ljava/lang/RuntimeException;
        //  411    418    418    419    Any
        //  411    418    3      8      Ljava/util/NoSuchElementException;
        //  412    418    3      8      Ljava/lang/NullPointerException;
        //  411    418    3      8      Ljava/util/NoSuchElementException;
        //  411    418    411    412    Ljava/lang/NegativeArraySizeException;
        //  431    438    438    439    Any
        //  431    438    3      8      Ljava/lang/NullPointerException;
        //  431    438    438    439    Ljava/lang/StringIndexOutOfBoundsException;
        //  431    438    431    432    Any
        //  432    438    3      8      Ljava/util/NoSuchElementException;
        //  442    449    449    450    Any
        //  443    449    442    443    Any
        //  443    449    449    450    Ljava/lang/NullPointerException;
        //  443    449    442    443    Any
        //  443    449    442    443    Any
        //  510    517    517    518    Any
        //  511    517    517    518    Ljava/lang/NullPointerException;
        //  511    517    510    511    Any
        //  511    517    3      8      Ljava/lang/ClassCastException;
        //  510    517    3      8      Ljava/lang/NullPointerException;
        //  524    531    531    532    Any
        //  524    531    531    532    Any
        //  524    531    3      8      Ljava/lang/IllegalArgumentException;
        //  525    531    524    525    Any
        //  525    531    531    532    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  535    542    542    543    Any
        //  535    542    3      8      Any
        //  536    542    535    536    Ljava/lang/StringIndexOutOfBoundsException;
        //  535    542    535    536    Ljava/lang/UnsupportedOperationException;
        //  536    542    542    543    Any
        //  551    557    557    558    Any
        //  551    557    557    558    Any
        //  551    557    3      8      Any
        //  551    557    3      8      Ljava/util/ConcurrentModificationException;
        //  551    557    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  607    614    614    615    Any
        //  608    614    614    615    Ljava/lang/EnumConstantNotPresentException;
        //  608    614    3      8      Ljava/lang/NullPointerException;
        //  607    614    607    608    Any
        //  608    614    607    608    Any
        //  621    628    628    629    Any
        //  621    628    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  621    628    3      8      Ljava/lang/ArithmeticException;
        //  622    628    628    629    Ljava/lang/NullPointerException;
        //  622    628    621    622    Ljava/lang/ClassCastException;
        //  632    639    639    640    Any
        //  633    639    639    640    Ljava/lang/IllegalStateException;
        //  632    639    639    640    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  632    639    632    633    Ljava/lang/NegativeArraySizeException;
        //  632    639    3      8      Any
        //  687    694    694    695    Any
        //  688    694    694    695    Ljava/lang/NumberFormatException;
        //  687    694    3      8      Any
        //  688    694    3      8      Ljava/lang/NumberFormatException;
        //  688    694    687    688    Any
        //  698    705    705    706    Any
        //  698    705    698    699    Any
        //  699    705    705    706    Any
        //  698    705    705    706    Ljava/lang/StringIndexOutOfBoundsException;
        //  698    705    705    706    Any
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
    public f0a 3() {
        return fbS.F(this, 1344050920);
    }
    
    public void 4() {
        public class f6G extends Lambda implements Function1
        {
            public Ref.ObjectRef c;
            
            public f6G(final Ref.ObjectRef c) {
                this.c = c;
                super(1);
            }
            
            public void c(@NotNull final String s) {
                fbS.9o(this, 1441214042, s);
            }
            
            static {
                throw t;
            }
            
            @Override
            public Object invoke(final Object o) {
                return fbS.1j(this, 969100688, o);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1970
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1962
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1954
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.0:I
        //    28: ifeq            37
        //    31: ldc_w           -1695223791
        //    34: goto            40
        //    37: ldc_w           -445855825
        //    40: ldc_w           -1864087716
        //    43: ixor           
        //    44: lookupswitch {
        //          168867661: 37
        //          1971880179: 72
        //          default: 1925
        //        }
        //    72: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //    75: goto            79
        //    78: athrow         
        //    79: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.clear:()V
        //    82: goto            86
        //    85: athrow         
        //    86: aload_0        
        //    87: getstatic       dev/nuker/pyro/fc.0:I
        //    90: ifeq            99
        //    93: ldc_w           818195751
        //    96: goto            102
        //    99: ldc_w           -592135520
        //   102: ldc_w           1297091063
        //   105: ixor           
        //   106: lookupswitch {
        //          -1847282857: 132
        //          2106893520: 99
        //          default: 1939
        //        }
        //   132: getfield        dev/nuker/pyro/f6H.c:Ldev/nuker/pyro/f0f;
        //   135: goto            139
        //   138: athrow         
        //   139: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   142: goto            146
        //   145: athrow         
        //   146: checkcast       Ldev/nuker/pyro/f6F;
        //   149: getstatic       dev/nuker/pyro/f6F.c:Ldev/nuker/pyro/f6F;
        //   152: if_acmpne       855
        //   155: new             Ljava/io/File;
        //   158: dup            
        //   159: ldc_w           "\u23c0\u148a\u8adb\ub190\ucfb2\uedc5\ub234\ue6e5\udb23\uef83\ua713\u1e5e\ue18e\uc7f5\u8711\u8959"
        //   162: goto            166
        //   165: athrow         
        //   166: invokestatic    invokestatic   !!! ERROR
        //   169: goto            173
        //   172: athrow         
        //   173: goto            177
        //   176: athrow         
        //   177: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   180: goto            184
        //   183: athrow         
        //   184: goto            188
        //   187: athrow         
        //   188: invokevirtual   java/io/File.exists:()Z
        //   191: goto            195
        //   194: athrow         
        //   195: ifeq            204
        //   198: ldc_w           -1368238964
        //   201: goto            207
        //   204: ldc_w           -1368238925
        //   207: ldc_w           1665541843
        //   210: ixor           
        //   211: tableswitch {
        //          -1704401730: 232
        //          -1704401729: 812
        //          default: 198
        //        }
        //   232: nop            
        //   233: new             Ljava/io/FileReader;
        //   236: dup            
        //   237: ldc_w           "\u23c0\u148a\u8adb\ub190\ucfb2\uedc5\ub234\ue6e5\udb23\uef83\ua713\u1e5e\ue18e\uc7f5\u8711\u8959"
        //   240: goto            244
        //   243: athrow         
        //   244: invokestatic    invokestatic   !!! ERROR
        //   247: goto            251
        //   250: athrow         
        //   251: goto            255
        //   254: athrow         
        //   255: invokespecial   java/io/FileReader.<init>:(Ljava/lang/String;)V
        //   258: goto            262
        //   261: athrow         
        //   262: astore_1       
        //   263: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //   266: dup            
        //   267: getstatic       dev/nuker/pyro/fc.c:I
        //   270: ifge            279
        //   273: ldc_w           -1868213579
        //   276: goto            282
        //   279: ldc_w           828132981
        //   282: ldc_w           229980273
        //   285: ixor           
        //   286: lookupswitch {
        //          -1659868476: 1915
        //          -53463900: 279
        //          default: 312
        //        }
        //   312: goto            316
        //   315: athrow         
        //   316: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //   319: goto            323
        //   322: athrow         
        //   323: astore_2       
        //   324: aload_2        
        //   325: new             Ljava/util/ArrayList;
        //   328: dup            
        //   329: getstatic       dev/nuker/pyro/fc.c:I
        //   332: ifge            341
        //   335: ldc_w           -363092945
        //   338: goto            344
        //   341: ldc_w           1249504030
        //   344: ldc_w           744679619
        //   347: ixor           
        //   348: lookupswitch {
        //          -969323284: 341
        //          1713046493: 376
        //          default: 1921
        //        }
        //   376: goto            380
        //   379: athrow         
        //   380: invokespecial   java/util/ArrayList.<init>:()V
        //   383: goto            387
        //   386: athrow         
        //   387: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   390: aload_1        
        //   391: checkcast       Ljava/io/Reader;
        //   394: new             Ldev/nuker/pyro/f6G;
        //   397: dup            
        //   398: aload_2        
        //   399: goto            403
        //   402: athrow         
        //   403: invokespecial   dev/nuker/pyro/f6G.<init>:(Lkotlin/jvm/internal/Ref$ObjectRef;)V
        //   406: goto            410
        //   409: athrow         
        //   410: checkcast       Lkotlin/jvm/functions/Function1;
        //   413: goto            417
        //   416: athrow         
        //   417: invokestatic    kotlin/io/TextStreamsKt.forEachLine:(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)V
        //   420: goto            424
        //   423: athrow         
        //   424: aload_1        
        //   425: goto            429
        //   428: athrow         
        //   429: invokevirtual   java/io/FileReader.close:()V
        //   432: goto            436
        //   435: athrow         
        //   436: aload_0        
        //   437: getstatic       dev/nuker/pyro/fc.0:I
        //   440: ifeq            449
        //   443: ldc_w           1224960545
        //   446: goto            452
        //   449: ldc_w           -1670107792
        //   452: ldc_w           -1678215828
        //   455: ixor           
        //   456: lookupswitch {
        //          -1945970329: 449
        //          -755294387: 1927
        //          default: 484
        //        }
        //   484: getfield        dev/nuker/pyro/f6H.0:Ldev/nuker/pyro/f0a;
        //   487: goto            491
        //   490: athrow         
        //   491: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   494: goto            498
        //   497: athrow         
        //   498: checkcast       Ljava/lang/Boolean;
        //   501: goto            505
        //   504: athrow         
        //   505: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   508: goto            512
        //   511: athrow         
        //   512: ifeq            630
        //   515: aload_2        
        //   516: getstatic       dev/nuker/pyro/fc.0:I
        //   519: ifeq            528
        //   522: ldc_w           1943732834
        //   525: goto            531
        //   528: ldc_w           -316671984
        //   531: ldc_w           902363957
        //   534: ixor           
        //   535: lookupswitch {
        //          -656997595: 560
        //          1175714135: 528
        //          default: 1937
        //        }
        //   560: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   563: checkcast       Ljava/util/ArrayList;
        //   566: checkcast       Ljava/util/List;
        //   569: astore_3       
        //   570: iconst_0       
        //   571: getstatic       dev/nuker/pyro/fc.c:I
        //   574: ifge            583
        //   577: ldc_w           527786009
        //   580: goto            586
        //   583: ldc_w           -1090618637
        //   586: ldc_w           -1345257986
        //   589: ixor           
        //   590: lookupswitch {
        //          -1331323417: 1923
        //          164249867: 583
        //          default: 616
        //        }
        //   616: istore          4
        //   618: aload_3        
        //   619: goto            623
        //   622: athrow         
        //   623: invokestatic    java/util/Collections.shuffle:(Ljava/util/List;)V
        //   626: goto            630
        //   629: athrow         
        //   630: getstatic       dev/nuker/pyro/fc.c:I
        //   633: ifge            642
        //   636: ldc_w           -1381434940
        //   639: goto            645
        //   642: ldc_w           -132452107
        //   645: ldc_w           866292121
        //   648: ixor           
        //   649: lookupswitch {
        //          -1643485091: 642
        //          -877108884: 676
        //          default: 1899
        //        }
        //   676: aload_0        
        //   677: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   680: getstatic       dev/nuker/pyro/fc.1:I
        //   683: ifeq            692
        //   686: ldc_w           -2012333591
        //   689: goto            695
        //   692: ldc_w           553776775
        //   695: ldc_w           943373588
        //   698: ixor           
        //   699: lookupswitch {
        //          -1338735363: 1913
        //          556135528: 692
        //          default: 724
        //        }
        //   724: aload_2        
        //   725: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   728: checkcast       Ljava/util/ArrayList;
        //   731: checkcast       Ljava/util/Collection;
        //   734: goto            738
        //   737: athrow         
        //   738: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.addAll:(Ljava/util/Collection;)Z
        //   741: goto            745
        //   744: athrow         
        //   745: pop            
        //   746: goto            1898
        //   749: getstatic       dev/nuker/pyro/fc.0:I
        //   752: ifeq            761
        //   755: ldc_w           67231892
        //   758: goto            764
        //   761: ldc_w           1427414826
        //   764: ldc_w           864990139
        //   767: ixor           
        //   768: lookupswitch {
        //          932139823: 761
        //          1721379985: 796
        //          default: 1905
        //        }
        //   796: astore_1       
        //   797: aload_1        
        //   798: goto            802
        //   801: athrow         
        //   802: invokevirtual   java/io/IOException.printStackTrace:()V
        //   805: goto            809
        //   808: athrow         
        //   809: goto            1898
        //   812: new             Ljava/io/FileWriter;
        //   815: dup            
        //   816: ldc_w           "\u23c0\u148a\u8adb\ub190\ucfb2\uedc5\ub234\ue6e5\udb23\uef83\ua713\u1e5e\ue18e\uc7f5\u8711\u8959"
        //   819: goto            823
        //   822: athrow         
        //   823: invokestatic    invokestatic   !!! ERROR
        //   826: goto            830
        //   829: athrow         
        //   830: goto            834
        //   833: athrow         
        //   834: invokespecial   java/io/FileWriter.<init>:(Ljava/lang/String;)V
        //   837: goto            841
        //   840: athrow         
        //   841: goto            845
        //   844: athrow         
        //   845: invokevirtual   java/io/FileWriter.close:()V
        //   848: goto            852
        //   851: athrow         
        //   852: goto            1898
        //   855: aload_0        
        //   856: getstatic       dev/nuker/pyro/fc.0:I
        //   859: ifeq            868
        //   862: ldc_w           396592087
        //   865: goto            871
        //   868: ldc_w           -489853963
        //   871: ldc_w           -1711280911
        //   874: ixor           
        //   875: lookupswitch {
        //          -1906544858: 868
        //          2066908932: 900
        //          default: 1929
        //        }
        //   900: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   903: ldc_w           "\ua1ce\u40fa\u015f\u3880\u4de3\ua2bc\u3dae\u64fa\u8f47\u6d90\u289c\u5126\ub372\u9d9d\u0517\ud331\udc32\u2856\uedc9\u49b8"
        //   906: goto            910
        //   909: athrow         
        //   910: invokestatic    invokestatic   !!! ERROR
        //   913: goto            917
        //   916: athrow         
        //   917: getstatic       dev/nuker/pyro/fc.0:I
        //   920: ifeq            929
        //   923: ldc_w           744354335
        //   926: goto            932
        //   929: ldc_w           -1975871679
        //   932: ldc_w           -598142698
        //   935: ixor           
        //   936: lookupswitch {
        //          -268115191: 929
        //          1449363031: 964
        //          default: 1907
        //        }
        //   964: goto            968
        //   967: athrow         
        //   968: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.add:(Ljava/lang/Object;)Z
        //   971: goto            975
        //   974: athrow         
        //   975: pop            
        //   976: aload_0        
        //   977: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   980: ldc_w           "\u6dbb\u36d9\ud9b3\u4ed4\ufe87\ube55\u906e"
        //   983: goto            987
        //   986: athrow         
        //   987: invokestatic    invokestatic   !!! ERROR
        //   990: goto            994
        //   993: athrow         
        //   994: getstatic       dev/nuker/pyro/fc.c:I
        //   997: ifge            1006
        //  1000: ldc_w           -1744409356
        //  1003: goto            1009
        //  1006: ldc_w           1365980656
        //  1009: ldc_w           -1458342300
        //  1012: ixor           
        //  1013: lookupswitch {
        //          -126336108: 1040
        //          823466640: 1006
        //          default: 1935
        //        }
        //  1040: goto            1044
        //  1043: athrow         
        //  1044: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.add:(Ljava/lang/Object;)Z
        //  1047: goto            1051
        //  1050: athrow         
        //  1051: pop            
        //  1052: getstatic       dev/nuker/pyro/fc.0:I
        //  1055: ifeq            1064
        //  1058: ldc_w           -1973561780
        //  1061: goto            1067
        //  1064: ldc_w           1991144793
        //  1067: ldc_w           -1589181327
        //  1070: ixor           
        //  1071: lookupswitch {
        //          -672567000: 1096
        //          723178045: 1064
        //          default: 1943
        //        }
        //  1096: aload_0        
        //  1097: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //  1100: ldc_w           "\u12a7\u25e9\ud693\ue21c\u9c87\udc93\uefa1\ud666\uebc2\ubcfb"
        //  1103: getstatic       dev/nuker/pyro/fc.1:I
        //  1106: ifeq            1115
        //  1109: ldc_w           60167813
        //  1112: goto            1118
        //  1115: ldc_w           -569841243
        //  1118: ldc_w           -430672636
        //  1121: ixor           
        //  1122: lookupswitch {
        //          -440245375: 1115
        //          945593505: 1148
        //          default: 1901
        //        }
        //  1148: goto            1152
        //  1151: athrow         
        //  1152: invokestatic    invokestatic   !!! ERROR
        //  1155: goto            1159
        //  1158: athrow         
        //  1159: goto            1163
        //  1162: athrow         
        //  1163: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.add:(Ljava/lang/Object;)Z
        //  1166: goto            1170
        //  1169: athrow         
        //  1170: pop            
        //  1171: aload_0        
        //  1172: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //  1175: new             Ljava/lang/StringBuilder;
        //  1178: dup            
        //  1179: getstatic       dev/nuker/pyro/fc.0:I
        //  1182: ifeq            1191
        //  1185: ldc_w           503570684
        //  1188: goto            1194
        //  1191: ldc_w           327815058
        //  1194: ldc_w           -111038481
        //  1197: ixor           
        //  1198: lookupswitch {
        //          -412987629: 1941
        //          1261347682: 1191
        //          default: 1224
        //        }
        //  1224: goto            1228
        //  1227: athrow         
        //  1228: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1231: goto            1235
        //  1234: athrow         
        //  1235: ldc_w           "\u6d89\u247f\ud9bc\uec1a\u81a4\ua3bd\u4d6f\ue6a4"
        //  1238: goto            1242
        //  1241: athrow         
        //  1242: invokestatic    invokestatic   !!! ERROR
        //  1245: goto            1249
        //  1248: athrow         
        //  1249: goto            1253
        //  1252: athrow         
        //  1253: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1256: goto            1260
        //  1259: athrow         
        //  1260: goto            1264
        //  1263: athrow         
        //  1264: invokestatic    java/lang/Math.random:()D
        //  1267: goto            1271
        //  1270: athrow         
        //  1271: sipush          10100
        //  1274: i2d            
        //  1275: dmul           
        //  1276: goto            1280
        //  1279: athrow         
        //  1280: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //  1283: goto            1287
        //  1286: athrow         
        //  1287: getstatic       dev/nuker/pyro/fc.c:I
        //  1290: ifge            1299
        //  1293: ldc_w           1162796797
        //  1296: goto            1302
        //  1299: ldc_w           -1624898801
        //  1302: ldc_w           1617002239
        //  1305: ixor           
        //  1306: lookupswitch {
        //          -12091920: 1332
        //          623878146: 1299
        //          default: 1919
        //        }
        //  1332: goto            1336
        //  1335: athrow         
        //  1336: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1339: goto            1343
        //  1342: athrow         
        //  1343: goto            1347
        //  1346: athrow         
        //  1347: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.add:(Ljava/lang/Object;)Z
        //  1350: goto            1354
        //  1353: athrow         
        //  1354: pop            
        //  1355: aload_0        
        //  1356: getstatic       dev/nuker/pyro/fc.c:I
        //  1359: ifge            1368
        //  1362: ldc_w           -54403163
        //  1365: goto            1371
        //  1368: ldc_w           -843557937
        //  1371: ldc_w           1066193628
        //  1374: ixor           
        //  1375: lookupswitch {
        //          -1018360455: 1368
        //          -231440109: 1400
        //          default: 1917
        //        }
        //  1400: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //  1403: goto            1407
        //  1406: athrow         
        //  1407: invokestatic    java/lang/Math.random:()D
        //  1410: goto            1414
        //  1413: athrow         
        //  1414: sipush          3818
        //  1417: i2d            
        //  1418: dmul           
        //  1419: goto            1423
        //  1422: athrow         
        //  1423: invokestatic    java/lang/String.valueOf:(D)Ljava/lang/String;
        //  1426: goto            1430
        //  1429: athrow         
        //  1430: goto            1434
        //  1433: athrow         
        //  1434: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.add:(Ljava/lang/Object;)Z
        //  1437: goto            1441
        //  1440: athrow         
        //  1441: pop            
        //  1442: aload_0        
        //  1443: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //  1446: ldc_w           "\u2383\u14dd\u8a98\ub1cb\ucfac\ued83\ub27d\ue6b6\udb78\uefdb\ua745\u1e19\ue199"
        //  1449: goto            1453
        //  1452: athrow         
        //  1453: invokestatic    invokestatic   !!! ERROR
        //  1456: goto            1460
        //  1459: athrow         
        //  1460: goto            1464
        //  1463: athrow         
        //  1464: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.add:(Ljava/lang/Object;)Z
        //  1467: goto            1471
        //  1470: athrow         
        //  1471: pop            
        //  1472: aload_0        
        //  1473: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //  1476: ldc_w           "\ua846\u4eef\u08d7\ue5f6\ua449\u8ac6\u303a\ub2ba\u9444\u6418\uf37f\u413b\u86d0\u888b\ud87e\udd24\u0b85\u1031\uedc9\u5c3e\ua93c\u9665\ue837"
        //  1479: goto            1483
        //  1482: athrow         
        //  1483: invokestatic    invokestatic   !!! ERROR
        //  1486: goto            1490
        //  1489: athrow         
        //  1490: getstatic       dev/nuker/pyro/fc.c:I
        //  1493: ifge            1502
        //  1496: ldc_w           -818738926
        //  1499: goto            1505
        //  1502: ldc_w           1404161421
        //  1505: ldc_w           -1655658810
        //  1508: ixor           
        //  1509: lookupswitch {
        //          -803381288: 1502
        //          1382264788: 1931
        //          default: 1536
        //        }
        //  1536: goto            1540
        //  1539: athrow         
        //  1540: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.add:(Ljava/lang/Object;)Z
        //  1543: goto            1547
        //  1546: athrow         
        //  1547: pop            
        //  1548: getstatic       dev/nuker/pyro/fc.1:I
        //  1551: ifeq            1560
        //  1554: ldc_w           58304168
        //  1557: goto            1563
        //  1560: ldc_w           -1213194011
        //  1563: ldc_w           1876392784
        //  1566: ixor           
        //  1567: lookupswitch {
        //          -1012342406: 1560
        //          1823399416: 1903
        //          default: 1592
        //        }
        //  1592: aload_0        
        //  1593: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //  1596: ldc_w           "\u05cf\u328c\uacd6\u9780"
        //  1599: getstatic       dev/nuker/pyro/fc.1:I
        //  1602: ifeq            1611
        //  1605: ldc_w           -765945159
        //  1608: goto            1614
        //  1611: ldc_w           1415651219
        //  1614: ldc_w           1863150595
        //  1617: ixor           
        //  1618: lookupswitch {
        //          -1118439750: 1909
        //          641796783: 1611
        //          default: 1644
        //        }
        //  1644: goto            1648
        //  1647: athrow         
        //  1648: invokestatic    invokestatic   !!! ERROR
        //  1651: goto            1655
        //  1654: athrow         
        //  1655: goto            1659
        //  1658: athrow         
        //  1659: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.add:(Ljava/lang/Object;)Z
        //  1662: goto            1666
        //  1665: athrow         
        //  1666: pop            
        //  1667: aload_0        
        //  1668: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //  1671: ldc_w           "\u70a5\u47b7\uba4b\ub1df\u9c87\ua38f\u4d6f\ud666\udb6e\ub39f\ue94f\u2e4d\ue180\u89b8\u8749\ub808\u0a21\u47a3"
        //  1674: goto            1678
        //  1677: athrow         
        //  1678: invokestatic    invokestatic   !!! ERROR
        //  1681: goto            1685
        //  1684: athrow         
        //  1685: goto            1689
        //  1688: athrow         
        //  1689: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.add:(Ljava/lang/Object;)Z
        //  1692: goto            1696
        //  1695: athrow         
        //  1696: pop            
        //  1697: aload_0        
        //  1698: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //  1701: ldc_w           "\u6dbb\u5aca\u7582\u811d\ucfbd\ubeac\uee7e\ud79e\ueb2f\ubcfb\ue94f\u2f09\ud1c1"
        //  1704: goto            1708
        //  1707: athrow         
        //  1708: invokestatic    invokestatic   !!! ERROR
        //  1711: goto            1715
        //  1714: athrow         
        //  1715: goto            1719
        //  1718: athrow         
        //  1719: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.add:(Ljava/lang/Object;)Z
        //  1722: goto            1726
        //  1725: athrow         
        //  1726: pop            
        //  1727: aload_0        
        //  1728: getstatic       dev/nuker/pyro/fc.0:I
        //  1731: ifeq            1740
        //  1734: ldc_w           -1526040029
        //  1737: goto            1743
        //  1740: ldc_w           1985355692
        //  1743: ldc_w           -867845560
        //  1746: ixor           
        //  1747: lookupswitch {
        //          1337996345: 1740
        //          1766834283: 1933
        //          default: 1772
        //        }
        //  1772: getfield        dev/nuker/pyro/f6H.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //  1775: new             Ljava/lang/StringBuilder;
        //  1778: dup            
        //  1779: goto            1783
        //  1782: athrow         
        //  1783: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1786: goto            1790
        //  1789: athrow         
        //  1790: ldc_w           "\u267f"
        //  1793: goto            1797
        //  1796: athrow         
        //  1797: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1800: goto            1804
        //  1803: athrow         
        //  1804: getstatic       dev/nuker/pyro/fc.c:I
        //  1807: ifge            1816
        //  1810: ldc_w           -212925602
        //  1813: goto            1819
        //  1816: ldc_w           -92336774
        //  1819: ldc_w           -304018165
        //  1822: ixor           
        //  1823: lookupswitch {
        //          396230769: 1848
        //          514723413: 1816
        //          default: 1911
        //        }
        //  1848: goto            1852
        //  1851: athrow         
        //  1852: invokestatic    java/lang/Math.random:()D
        //  1855: goto            1859
        //  1858: athrow         
        //  1859: sipush          1387
        //  1862: i2d            
        //  1863: dmul           
        //  1864: goto            1868
        //  1867: athrow         
        //  1868: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //  1871: goto            1875
        //  1874: athrow         
        //  1875: goto            1879
        //  1878: athrow         
        //  1879: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1882: goto            1886
        //  1885: athrow         
        //  1886: goto            1890
        //  1889: athrow         
        //  1890: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.add:(Ljava/lang/Object;)Z
        //  1893: goto            1897
        //  1896: athrow         
        //  1897: pop            
        //  1898: return         
        //  1899: aconst_null    
        //  1900: athrow         
        //  1901: aconst_null    
        //  1902: athrow         
        //  1903: aconst_null    
        //  1904: athrow         
        //  1905: aconst_null    
        //  1906: athrow         
        //  1907: aconst_null    
        //  1908: athrow         
        //  1909: aconst_null    
        //  1910: athrow         
        //  1911: aconst_null    
        //  1912: athrow         
        //  1913: aconst_null    
        //  1914: athrow         
        //  1915: aconst_null    
        //  1916: athrow         
        //  1917: aconst_null    
        //  1918: athrow         
        //  1919: aconst_null    
        //  1920: athrow         
        //  1921: aconst_null    
        //  1922: athrow         
        //  1923: aconst_null    
        //  1924: athrow         
        //  1925: aconst_null    
        //  1926: athrow         
        //  1927: aconst_null    
        //  1928: athrow         
        //  1929: aconst_null    
        //  1930: athrow         
        //  1931: aconst_null    
        //  1932: athrow         
        //  1933: aconst_null    
        //  1934: athrow         
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
        //  1945: pop            
        //  1946: goto            24
        //  1949: pop            
        //  1950: aconst_null    
        //  1951: goto            1945
        //  1954: dup            
        //  1955: ifnull          1945
        //  1958: checkcast       Ljava/lang/Throwable;
        //  1961: athrow         
        //  1962: dup            
        //  1963: ifnull          1949
        //  1966: checkcast       Ljava/lang/Throwable;
        //  1969: athrow         
        //  1970: aconst_null    
        //  1971: athrow         
        //    StackMapTable: 01 3D 43 07 00 9E 04 FF 00 0B 00 00 00 01 07 00 9E FC 00 03 07 00 03 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 FF 00 05 00 00 00 01 07 00 9E FF 00 00 00 01 07 00 03 00 01 07 00 91 45 07 00 9E 00 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 45 07 00 9E 40 07 00 6B 45 07 00 9E 40 07 01 8A 52 07 00 9C FF 00 00 00 01 07 00 03 00 03 08 00 9B 08 00 9B 07 00 96 45 07 00 9E FF 00 00 00 01 07 00 03 00 03 08 00 9B 08 00 9B 07 00 96 42 07 00 C8 FF 00 00 00 01 07 00 03 00 03 08 00 9B 08 00 9B 07 00 96 45 07 00 9E 40 07 01 D3 42 07 00 9E 40 07 01 D3 45 07 00 9E 40 01 02 05 42 01 18 4A 07 00 9E FF 00 00 00 01 07 00 03 00 03 08 00 E9 08 00 E9 07 00 96 45 07 00 9E FF 00 00 00 01 07 00 03 00 03 08 00 E9 08 00 E9 07 00 96 42 07 00 9E FF 00 00 00 01 07 00 03 00 03 08 00 E9 08 00 E9 07 00 96 45 07 00 9E 40 07 01 DF FF 00 10 00 02 07 00 03 07 01 DF 00 02 08 01 07 08 01 07 FF 00 02 00 02 07 00 03 07 01 DF 00 03 08 01 07 08 01 07 01 FF 00 1D 00 02 07 00 03 07 01 DF 00 02 08 01 07 08 01 07 42 07 00 CC FF 00 00 00 02 07 00 03 07 01 DF 00 02 08 01 07 08 01 07 45 07 00 9E 40 07 01 E2 FF 00 11 00 03 07 00 03 07 01 DF 07 01 E2 00 03 07 01 E2 08 01 45 08 01 45 FF 00 02 00 03 07 00 03 07 01 DF 07 01 E2 00 04 07 01 E2 08 01 45 08 01 45 01 FF 00 1F 00 03 07 00 03 07 01 DF 07 01 E2 00 03 07 01 E2 08 01 45 08 01 45 42 07 00 B8 FF 00 00 00 03 07 00 03 07 01 DF 07 01 E2 00 03 07 01 E2 08 01 45 08 01 45 45 07 00 9E FF 00 00 00 03 07 00 03 07 01 DF 07 01 E2 00 02 07 01 E2 07 01 E8 FF 00 0E 00 00 00 01 07 00 9E FF 00 00 00 03 07 00 03 07 01 DF 07 01 E2 00 04 07 01 F2 08 01 8A 08 01 8A 07 01 E2 45 07 00 9E FF 00 00 00 03 07 00 03 07 01 DF 07 01 E2 00 02 07 01 F2 07 01 F4 45 07 00 C6 FF 00 00 00 03 07 00 03 07 01 DF 07 01 E2 00 02 07 01 F2 07 01 F9 45 07 00 9E 00 43 07 00 9E 40 07 01 DF 45 07 00 9E 00 4C 07 00 03 FF 00 02 00 03 07 00 03 07 01 DF 07 01 E2 00 02 07 00 03 01 5F 07 00 03 45 07 00 9E 40 07 00 38 45 07 00 9E 40 07 01 8A 45 07 00 9E 40 07 01 72 45 07 00 9E 40 01 4F 07 01 E2 FF 00 02 00 03 07 00 03 07 01 DF 07 01 E2 00 02 07 01 E2 01 5C 07 01 E2 FF 00 16 00 04 07 00 03 07 01 DF 07 01 E2 07 02 0A 00 01 01 FF 00 02 00 04 07 00 03 07 01 DF 07 01 E2 07 02 0A 00 02 01 01 5D 01 FF 00 05 00 05 07 00 03 07 01 DF 07 01 E2 07 02 0A 01 00 01 07 00 9E 40 07 02 0A 45 07 00 9E F9 00 00 0B 42 01 1E 4F 07 00 91 FF 00 02 00 03 07 00 03 07 01 DF 07 01 E2 00 02 07 00 91 01 5C 07 00 91 4C 07 00 B2 FF 00 00 00 03 07 00 03 07 01 DF 07 01 E2 00 02 07 00 91 07 01 8C 45 07 00 9E 40 01 FF 00 03 00 01 07 00 03 00 01 07 01 C8 4B 07 01 C8 FF 00 02 00 01 07 00 03 00 02 07 01 C8 01 5F 07 01 C8 FF 00 04 00 02 07 00 03 07 01 C8 00 01 07 00 9E 40 07 01 C8 45 07 00 9E 00 FA 00 02 49 07 00 CC FF 00 00 00 01 07 00 03 00 03 08 03 2C 08 03 2C 07 00 96 45 07 00 9E FF 00 00 00 01 07 00 03 00 03 08 03 2C 08 03 2C 07 00 96 FF 00 02 00 00 00 01 07 00 9E FF 00 00 00 01 07 00 03 00 03 08 03 2C 08 03 2C 07 00 96 45 07 00 9E 40 07 02 25 42 07 00 B4 40 07 02 25 45 07 00 9E 00 02 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 48 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 FF 00 0B 00 01 07 00 03 00 02 07 00 91 07 00 96 FF 00 02 00 01 07 00 03 00 03 07 00 91 07 00 96 01 FF 00 1F 00 01 07 00 03 00 02 07 00 91 07 00 96 42 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E 40 01 4A 07 00 9A FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 FF 00 0B 00 01 07 00 03 00 02 07 00 91 07 00 96 FF 00 02 00 01 07 00 03 00 03 07 00 91 07 00 96 01 FF 00 1E 00 01 07 00 03 00 02 07 00 91 07 00 96 42 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E 40 01 0C 42 01 1C FF 00 12 00 01 07 00 03 00 02 07 00 91 07 00 96 FF 00 02 00 01 07 00 03 00 03 07 00 91 07 00 96 01 FF 00 1D 00 01 07 00 03 00 02 07 00 91 07 00 96 FF 00 02 00 00 00 01 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 42 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E 40 01 FF 00 14 00 01 07 00 03 00 03 07 00 91 08 04 97 08 04 97 FF 00 02 00 01 07 00 03 00 04 07 00 91 08 04 97 08 04 97 01 FF 00 1D 00 01 07 00 03 00 03 07 00 91 08 04 97 08 04 97 42 07 00 9E FF 00 00 00 01 07 00 03 00 03 07 00 91 08 04 97 08 04 97 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 01 52 45 07 00 9E FF 00 00 00 01 07 00 03 00 03 07 00 91 07 01 52 07 00 96 45 07 00 9E FF 00 00 00 01 07 00 03 00 03 07 00 91 07 01 52 07 00 96 FF 00 02 00 00 00 01 07 00 9E FF 00 00 00 01 07 00 03 00 03 07 00 91 07 01 52 07 00 96 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 01 52 42 07 00 C6 FF 00 00 00 01 07 00 03 00 02 07 00 91 07 01 52 45 07 00 9E FF 00 00 00 01 07 00 03 00 03 07 00 91 07 01 52 03 FF 00 07 00 00 00 01 07 00 9E FF 00 00 00 01 07 00 03 00 03 07 00 91 07 01 52 03 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 01 52 FF 00 0B 00 01 07 00 03 00 02 07 00 91 07 01 52 FF 00 02 00 01 07 00 03 00 03 07 00 91 07 01 52 01 FF 00 1D 00 01 07 00 03 00 02 07 00 91 07 01 52 FF 00 02 00 00 00 01 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 01 52 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 FF 00 02 00 00 00 01 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E 40 01 4D 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 45 07 00 9E 40 07 00 91 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 03 47 07 00 BA FF 00 00 00 01 07 00 03 00 02 07 00 91 03 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 42 07 00 BE FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E 40 01 4A 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 42 07 00 BC FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E 40 01 4A 07 00 9C FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 FF 00 0B 00 01 07 00 03 00 02 07 00 91 07 00 96 FF 00 02 00 01 07 00 03 00 03 07 00 91 07 00 96 01 FF 00 1E 00 01 07 00 03 00 02 07 00 91 07 00 96 42 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E 40 01 0C 42 01 1C FF 00 12 00 01 07 00 03 00 02 07 00 91 07 00 96 FF 00 02 00 01 07 00 03 00 03 07 00 91 07 00 96 01 FF 00 1D 00 01 07 00 03 00 02 07 00 91 07 00 96 42 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 42 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E 40 01 FF 00 0A 00 00 00 01 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 42 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E 40 01 FF 00 0A 00 00 00 01 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 42 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E 40 01 4D 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 09 00 00 00 01 07 00 9E FF 00 00 00 01 07 00 03 00 03 07 00 91 08 06 EF 08 06 EF 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 01 52 FF 00 05 00 00 00 01 07 00 9E FF 00 00 00 01 07 00 03 00 03 07 00 91 07 01 52 07 00 96 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 01 52 FF 00 0B 00 01 07 00 03 00 02 07 00 91 07 01 52 FF 00 02 00 01 07 00 03 00 03 07 00 91 07 01 52 01 FF 00 1C 00 01 07 00 03 00 02 07 00 91 07 01 52 FF 00 02 00 00 00 01 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 01 52 45 07 00 9E FF 00 00 00 01 07 00 03 00 03 07 00 91 07 01 52 03 47 07 00 9E FF 00 00 00 01 07 00 03 00 03 07 00 91 07 01 52 03 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 01 52 42 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 01 52 45 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 FF 00 02 00 00 00 01 07 00 9E FF 00 00 00 01 07 00 03 00 02 07 00 91 07 00 96 45 07 00 9E 40 01 00 FD 00 00 07 01 DF 07 01 E2 FF 00 01 00 01 07 00 03 00 02 07 00 91 07 00 96 01 41 07 01 C8 FF 00 01 00 01 07 00 03 00 02 07 00 91 07 00 96 FF 00 01 00 01 07 00 03 00 02 07 00 91 07 00 96 FF 00 01 00 01 07 00 03 00 02 07 00 91 07 01 52 FF 00 01 00 03 07 00 03 07 01 DF 07 01 E2 00 01 07 00 91 FF 00 01 00 02 07 00 03 07 01 DF 00 02 08 01 07 08 01 07 FF 00 01 00 01 07 00 03 00 01 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 91 07 01 52 FF 00 01 00 03 07 00 03 07 01 DF 07 01 E2 00 03 07 01 E2 08 01 45 08 01 45 FF 00 01 00 04 07 00 03 07 01 DF 07 01 E2 07 02 0A 00 01 01 FF 00 01 00 01 07 00 03 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 01 DF 07 01 E2 00 01 07 00 03 FF 00 01 00 01 07 00 03 00 01 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 91 07 00 96 41 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 91 07 00 96 FF 00 01 00 03 07 00 03 07 01 DF 07 01 E2 00 01 07 01 E2 FF 00 01 00 01 07 00 03 00 01 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 91 08 04 97 08 04 97 01 41 07 00 9E 43 05 44 07 00 9E 47 05 47 07 00 9E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  232    402    749    812    Ljava/io/IOException;
        //  403    746    749    812    Ljava/io/IOException;
        //  8      20     1954   1962   Any
        //  1954   1962   1954   1962   Any
        //  1970   1972   3      8      Ljava/lang/IllegalStateException;
        //  79     85     85     86     Any
        //  79     85     3      8      Ljava/lang/NullPointerException;
        //  79     85     3      8      Any
        //  79     85     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  79     85     3      8      Any
        //  138    145    145    146    Any
        //  138    145    138    139    Ljava/util/NoSuchElementException;
        //  139    145    138    139    Ljava/lang/IllegalArgumentException;
        //  139    145    138    139    Any
        //  139    145    3      8      Ljava/lang/UnsupportedOperationException;
        //  165    172    172    173    Any
        //  165    172    3      8      Ljava/lang/IllegalStateException;
        //  166    172    165    166    Ljava/lang/ArithmeticException;
        //  165    172    3      8      Ljava/lang/AssertionError;
        //  165    172    3      8      Any
        //  176    183    183    184    Any
        //  177    183    3      8      Any
        //  176    183    176    177    Ljava/lang/IllegalStateException;
        //  177    183    183    184    Any
        //  177    183    183    184    Any
        //  187    194    194    195    Any
        //  188    194    187    188    Ljava/lang/EnumConstantNotPresentException;
        //  187    194    187    188    Ljava/lang/EnumConstantNotPresentException;
        //  188    194    3      8      Ljava/lang/IllegalArgumentException;
        //  187    194    187    188    Any
        //  243    250    250    251    Any
        //  244    250    250    251    Ljava/lang/IllegalStateException;
        //  244    250    243    244    Any
        //  243    250    3      8      Any
        //  244    250    243    244    Ljava/lang/NegativeArraySizeException;
        //  254    261    261    262    Any
        //  255    261    254    255    Any
        //  254    261    254    255    Any
        //  254    261    261    262    Ljava/util/NoSuchElementException;
        //  254    261    3      8      Any
        //  315    322    322    323    Any
        //  315    322    322    323    Ljava/lang/NegativeArraySizeException;
        //  316    322    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  316    322    315    316    Ljava/lang/ClassCastException;
        //  316    322    3      8      Any
        //  379    386    386    387    Any
        //  380    386    3      8      Any
        //  380    386    3      8      Any
        //  379    386    386    387    Ljava/lang/StringIndexOutOfBoundsException;
        //  379    386    379    380    Ljava/lang/EnumConstantNotPresentException;
        //  403    409    409    410    Any
        //  403    409    409    410    Any
        //  403    409    3      8      Ljava/util/NoSuchElementException;
        //  403    409    409    410    Any
        //  403    409    409    410    Ljava/lang/EnumConstantNotPresentException;
        //  416    423    423    424    Any
        //  417    423    416    417    Ljava/util/ConcurrentModificationException;
        //  417    423    3      8      Any
        //  417    423    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  417    423    3      8      Ljava/util/NoSuchElementException;
        //  428    435    435    436    Any
        //  429    435    435    436    Ljava/lang/ArithmeticException;
        //  428    435    3      8      Ljava/lang/IllegalArgumentException;
        //  428    435    3      8      Ljava/lang/NumberFormatException;
        //  428    435    428    429    Any
        //  490    497    497    498    Any
        //  491    497    490    491    Ljava/lang/ClassCastException;
        //  490    497    497    498    Any
        //  490    497    497    498    Any
        //  491    497    490    491    Any
        //  504    511    511    512    Any
        //  504    511    504    505    Ljava/lang/IndexOutOfBoundsException;
        //  504    511    504    505    Ljava/lang/EnumConstantNotPresentException;
        //  505    511    504    505    Any
        //  505    511    3      8      Ljava/lang/ClassCastException;
        //  622    629    629    630    Any
        //  622    629    3      8      Any
        //  623    629    622    623    Any
        //  622    629    3      8      Any
        //  623    629    3      8      Ljava/lang/RuntimeException;
        //  737    744    744    745    Any
        //  737    744    744    745    Ljava/lang/EnumConstantNotPresentException;
        //  737    744    744    745    Any
        //  738    744    737    738    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  737    744    3      8      Any
        //  801    808    808    809    Any
        //  802    808    801    802    Any
        //  802    808    3      8      Ljava/util/NoSuchElementException;
        //  802    808    801    802    Any
        //  802    808    3      8      Any
        //  822    829    829    830    Any
        //  822    829    829    830    Ljava/util/ConcurrentModificationException;
        //  823    829    822    823    Ljava/lang/ClassCastException;
        //  823    829    3      8      Ljava/lang/UnsupportedOperationException;
        //  822    829    829    830    Ljava/lang/AssertionError;
        //  834    840    840    841    Any
        //  834    840    840    841    Any
        //  834    840    840    841    Ljava/lang/UnsupportedOperationException;
        //  834    840    3      8      Any
        //  834    840    840    841    Any
        //  844    851    851    852    Any
        //  844    851    844    845    Ljava/lang/NumberFormatException;
        //  845    851    851    852    Ljava/lang/IndexOutOfBoundsException;
        //  844    851    851    852    Ljava/lang/RuntimeException;
        //  845    851    851    852    Ljava/lang/NullPointerException;
        //  909    916    916    917    Any
        //  909    916    909    910    Ljava/lang/IllegalStateException;
        //  910    916    909    910    Any
        //  909    916    909    910    Any
        //  909    916    916    917    Any
        //  967    974    974    975    Any
        //  967    974    3      8      Any
        //  967    974    967    968    Any
        //  968    974    3      8      Ljava/util/ConcurrentModificationException;
        //  967    974    974    975    Any
        //  986    993    993    994    Any
        //  987    993    986    987    Ljava/lang/IndexOutOfBoundsException;
        //  986    993    993    994    Any
        //  987    993    993    994    Any
        //  987    993    986    987    Ljava/lang/IllegalArgumentException;
        //  1043   1050   1050   1051   Any
        //  1043   1050   1043   1044   Ljava/lang/StringIndexOutOfBoundsException;
        //  1044   1050   1050   1051   Ljava/lang/RuntimeException;
        //  1043   1050   1043   1044   Any
        //  1043   1050   1043   1044   Any
        //  1152   1158   1158   1159   Any
        //  1152   1158   1158   1159   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1152   1158   3      8      Ljava/lang/NegativeArraySizeException;
        //  1152   1158   1158   1159   Any
        //  1152   1158   1158   1159   Any
        //  1162   1169   1169   1170   Any
        //  1162   1169   1162   1163   Ljava/lang/NegativeArraySizeException;
        //  1162   1169   3      8      Ljava/lang/ClassCastException;
        //  1163   1169   1169   1170   Ljava/lang/ArithmeticException;
        //  1163   1169   1162   1163   Any
        //  1227   1234   1234   1235   Any
        //  1228   1234   1227   1228   Any
        //  1227   1234   1234   1235   Ljava/lang/ArithmeticException;
        //  1227   1234   1227   1228   Any
        //  1228   1234   1227   1228   Any
        //  1241   1248   1248   1249   Any
        //  1241   1248   1241   1242   Ljava/util/ConcurrentModificationException;
        //  1241   1248   1241   1242   Any
        //  1242   1248   1248   1249   Any
        //  1241   1248   1241   1242   Any
        //  1253   1259   1259   1260   Any
        //  1253   1259   1259   1260   Ljava/lang/ArithmeticException;
        //  1253   1259   3      8      Any
        //  1253   1259   1259   1260   Ljava/lang/ArithmeticException;
        //  1253   1259   1259   1260   Ljava/lang/ClassCastException;
        //  1263   1270   1270   1271   Any
        //  1264   1270   3      8      Any
        //  1263   1270   1270   1271   Any
        //  1263   1270   1263   1264   Ljava/util/ConcurrentModificationException;
        //  1264   1270   1270   1271   Any
        //  1280   1286   1286   1287   Any
        //  1280   1286   3      8      Ljava/util/ConcurrentModificationException;
        //  1280   1286   1286   1287   Any
        //  1280   1286   1286   1287   Any
        //  1280   1286   1286   1287   Any
        //  1336   1342   1342   1343   Any
        //  1336   1342   1342   1343   Ljava/lang/StringIndexOutOfBoundsException;
        //  1336   1342   1342   1343   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1336   1342   3      8      Ljava/util/ConcurrentModificationException;
        //  1336   1342   1342   1343   Any
        //  1347   1353   1353   1354   Any
        //  1347   1353   3      8      Any
        //  1347   1353   1353   1354   Ljava/lang/UnsupportedOperationException;
        //  1347   1353   1353   1354   Any
        //  1347   1353   3      8      Ljava/lang/NullPointerException;
        //  1406   1413   1413   1414   Any
        //  1406   1413   1406   1407   Ljava/lang/RuntimeException;
        //  1406   1413   1413   1414   Ljava/lang/StringIndexOutOfBoundsException;
        //  1406   1413   1406   1407   Any
        //  1406   1413   1406   1407   Ljava/lang/NullPointerException;
        //  1422   1429   1429   1430   Any
        //  1423   1429   3      8      Ljava/lang/UnsupportedOperationException;
        //  1422   1429   3      8      Any
        //  1423   1429   1422   1423   Ljava/util/NoSuchElementException;
        //  1423   1429   3      8      Any
        //  1433   1440   1440   1441   Any
        //  1433   1440   1440   1441   Ljava/lang/ClassCastException;
        //  1433   1440   3      8      Ljava/lang/NullPointerException;
        //  1433   1440   3      8      Ljava/lang/RuntimeException;
        //  1433   1440   1433   1434   Ljava/lang/NegativeArraySizeException;
        //  1452   1459   1459   1460   Any
        //  1453   1459   1459   1460   Ljava/lang/ClassCastException;
        //  1453   1459   3      8      Ljava/lang/NegativeArraySizeException;
        //  1453   1459   1452   1453   Any
        //  1452   1459   1452   1453   Ljava/lang/ClassCastException;
        //  1463   1470   1470   1471   Any
        //  1463   1470   1463   1464   Ljava/lang/IndexOutOfBoundsException;
        //  1463   1470   1470   1471   Ljava/lang/ClassCastException;
        //  1464   1470   3      8      Ljava/lang/NegativeArraySizeException;
        //  1463   1470   3      8      Any
        //  1482   1489   1489   1490   Any
        //  1483   1489   1489   1490   Ljava/lang/NullPointerException;
        //  1482   1489   3      8      Any
        //  1483   1489   1489   1490   Ljava/util/NoSuchElementException;
        //  1483   1489   1482   1483   Ljava/lang/ArithmeticException;
        //  1539   1546   1546   1547   Any
        //  1539   1546   1546   1547   Ljava/lang/ArithmeticException;
        //  1540   1546   1546   1547   Ljava/lang/StringIndexOutOfBoundsException;
        //  1540   1546   1539   1540   Any
        //  1540   1546   1539   1540   Ljava/util/ConcurrentModificationException;
        //  1647   1654   1654   1655   Any
        //  1648   1654   1654   1655   Ljava/lang/UnsupportedOperationException;
        //  1648   1654   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1647   1654   1654   1655   Any
        //  1648   1654   1647   1648   Any
        //  1658   1665   1665   1666   Any
        //  1658   1665   1665   1666   Ljava/lang/IndexOutOfBoundsException;
        //  1658   1665   1658   1659   Any
        //  1658   1665   1665   1666   Any
        //  1658   1665   3      8      Ljava/lang/ClassCastException;
        //  1678   1684   1684   1685   Any
        //  1678   1684   3      8      Any
        //  1678   1684   3      8      Any
        //  1678   1684   3      8      Ljava/lang/RuntimeException;
        //  1678   1684   1684   1685   Ljava/lang/ClassCastException;
        //  1688   1695   1695   1696   Any
        //  1688   1695   3      8      Any
        //  1689   1695   3      8      Any
        //  1688   1695   1688   1689   Any
        //  1688   1695   3      8      Any
        //  1708   1714   1714   1715   Any
        //  1708   1714   1714   1715   Any
        //  1708   1714   1714   1715   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1708   1714   1714   1715   Any
        //  1708   1714   1714   1715   Any
        //  1718   1725   1725   1726   Any
        //  1719   1725   1718   1719   Any
        //  1718   1725   1725   1726   Any
        //  1719   1725   3      8      Any
        //  1718   1725   3      8      Any
        //  1783   1789   1789   1790   Any
        //  1783   1789   3      8      Any
        //  1783   1789   1789   1790   Any
        //  1783   1789   1789   1790   Any
        //  1783   1789   1789   1790   Any
        //  1797   1803   1803   1804   Any
        //  1797   1803   3      8      Ljava/util/NoSuchElementException;
        //  1797   1803   1803   1804   Any
        //  1797   1803   3      8      Ljava/lang/NullPointerException;
        //  1797   1803   3      8      Any
        //  1852   1858   1858   1859   Any
        //  1852   1858   3      8      Ljava/lang/UnsupportedOperationException;
        //  1852   1858   1858   1859   Any
        //  1852   1858   3      8      Any
        //  1852   1858   1858   1859   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1867   1874   1874   1875   Any
        //  1867   1874   1867   1868   Any
        //  1867   1874   1867   1868   Ljava/lang/UnsupportedOperationException;
        //  1867   1874   3      8      Any
        //  1868   1874   1867   1868   Ljava/lang/StringIndexOutOfBoundsException;
        //  1878   1885   1885   1886   Any
        //  1879   1885   3      8      Any
        //  1879   1885   3      8      Ljava/lang/IllegalArgumentException;
        //  1879   1885   1878   1879   Any
        //  1879   1885   3      8      Ljava/lang/UnsupportedOperationException;
        //  1890   1896   1896   1897   Any
        //  1890   1896   1896   1897   Ljava/util/NoSuchElementException;
        //  1890   1896   1896   1897   Any
        //  1890   1896   1896   1897   Ljava/lang/IllegalArgumentException;
        //  1890   1896   3      8      Ljava/lang/EnumConstantNotPresentException;
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
}
