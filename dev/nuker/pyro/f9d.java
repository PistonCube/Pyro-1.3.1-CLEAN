// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.Nullable;
import net.minecraft.util.math.Vec3d;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import java.util.LinkedList;

public class f9d extends fH
{
    public f0a c;
    public f0d c;
    public f0d 0;
    public f0b c;
    public LinkedList<double[]> c;
    public fbu c;
    
    public f9d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u225b\u1481\u8b75\ub3d8\uc932\uec5c\ub236\ue748\ud965\ue947\ua68c"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u227b\u1481\u8b75\ub3d8\uc932\uec7c\ub236\ue748\ud965\ue947\ua68c"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: ldc             "\u227d\u1481\u8b71\ub3ce\uc925\uec1f\ub225\ue71d\ud978\ue944\ua68b\u1e44\ue039\uc5a1\u81d0\u88cb\u57a9\u76d8\ubd29\uc0f1\u2aae\uc27b\u6b80\u2d5a\ud726\u343f\u7d2e\u8820\u8051\u8c7b\u8516\ufb27\u710f\u9a1e\u1b71\uf0c8\u4979\u89bc\uca81\uffdd\ub76f\u41f6\ub829\ub35c\u4c88\u8b5e\u7c66\ucfad\u7d49\uea3f"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: getstatic       dev/nuker/pyro/fc.1:I
        //    19: ifeq            27
        //    22: ldc             1280047184
        //    24: goto            29
        //    27: ldc             -113084237
        //    29: ldc             -1107960883
        //    31: ixor           
        //    32: lookupswitch {
        //          -239197283: 27
        //          1152885630: 60
        //          default: 665
        //        }
        //    60: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    63: aload_0        
        //    64: new             Ldev/nuker/pyro/f0a;
        //    67: dup            
        //    68: ldc             "\u224b\u1496\u8b7e\ub3dd\uc933\uec4d"
        //    70: invokestatic    invokestatic   !!! ERROR
        //    73: ldc             "\u226b\u1496\u8b7e\ub3dd\uc933\uec4d"
        //    75: invokestatic    invokestatic   !!! ERROR
        //    78: aconst_null    
        //    79: iconst_1       
        //    80: getstatic       dev/nuker/pyro/fc.c:I
        //    83: ifge            91
        //    86: ldc             1173983600
        //    88: goto            93
        //    91: ldc             879928577
        //    93: ldc             -995194693
        //    95: ixor           
        //    96: lookupswitch {
        //          -2124998197: 677
        //          1210982368: 91
        //          default: 124
        //        }
        //   124: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   127: putfield        dev/nuker/pyro/f9d.c:Ldev/nuker/pyro/f0a;
        //   130: getstatic       dev/nuker/pyro/fc.1:I
        //   133: ifeq            141
        //   136: ldc             845461393
        //   138: goto            143
        //   141: ldc             1706400139
        //   143: ldc             -1440077137
        //   145: ixor           
        //   146: lookupswitch {
        //          -1739678402: 141
        //          -811617500: 172
        //          default: 669
        //        }
        //   172: aload_0        
        //   173: new             Ldev/nuker/pyro/f0d;
        //   176: dup            
        //   177: ldc             "\u225d\u1496\u8b7c\ub3d8\uc92f"
        //   179: invokestatic    invokestatic   !!! ERROR
        //   182: ldc             "\u227d\u1496\u8b7c\ub3d8\uc92f"
        //   184: invokestatic    invokestatic   !!! ERROR
        //   187: aconst_null    
        //   188: dconst_0       
        //   189: dconst_0       
        //   190: ldc2_w          10.0
        //   193: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   196: putfield        dev/nuker/pyro/f9d.c:Ldev/nuker/pyro/f0d;
        //   199: aload_0        
        //   200: new             Ldev/nuker/pyro/f0d;
        //   203: dup            
        //   204: ldc             "\u224e\u149a\u8b74\ub3cd\uc93e"
        //   206: invokestatic    invokestatic   !!! ERROR
        //   209: ldc             "\u226e\u149a\u8b74\ub3cd\uc93e"
        //   211: invokestatic    invokestatic   !!! ERROR
        //   214: aconst_null    
        //   215: ldc2_w          1.600000023841858
        //   218: ldc2_w          0.10000000149011612
        //   221: ldc2_w          10.0
        //   224: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   227: getstatic       dev/nuker/pyro/fc.c:I
        //   230: ifge            238
        //   233: ldc             130733215
        //   235: goto            240
        //   238: ldc             -1960540979
        //   240: ldc             124774748
        //   242: ixor           
        //   243: lookupswitch {
        //          -1941213807: 268
        //          10829251: 238
        //          default: 663
        //        }
        //   268: putfield        dev/nuker/pyro/f9d.0:Ldev/nuker/pyro/f0d;
        //   271: aload_0        
        //   272: new             Ldev/nuker/pyro/f0b;
        //   275: dup            
        //   276: ldc             "\u225a\u149c\u8b7c\ub3d6\uc924"
        //   278: getstatic       dev/nuker/pyro/fc.0:I
        //   281: ifeq            289
        //   284: ldc             -459693372
        //   286: goto            291
        //   289: ldc             -233337704
        //   291: ldc             2014176801
        //   293: ixor           
        //   294: lookupswitch {
        //          -1668004635: 671
        //          456939596: 289
        //          default: 320
        //        }
        //   320: invokestatic    invokestatic   !!! ERROR
        //   323: ldc             "\u227a\u149c\u8b7c\ub3d6\uc924"
        //   325: invokestatic    invokestatic   !!! ERROR
        //   328: aconst_null    
        //   329: new             Ldev/nuker/pyro/fS;
        //   332: dup            
        //   333: fconst_0       
        //   334: fconst_1       
        //   335: ldc             0.5
        //   337: fconst_1       
        //   338: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   341: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   344: getstatic       dev/nuker/pyro/fc.c:I
        //   347: ifge            355
        //   350: ldc             -1576916014
        //   352: goto            357
        //   355: ldc             -1365428947
        //   357: ldc             -1556258519
        //   359: ixor           
        //   360: lookupswitch {
        //          -1235388020: 355
        //          20925179: 673
        //          default: 388
        //        }
        //   388: putfield        dev/nuker/pyro/f9d.c:Ldev/nuker/pyro/f0b;
        //   391: getstatic       dev/nuker/pyro/fc.c:I
        //   394: ifge            402
        //   397: ldc             1868535892
        //   399: goto            404
        //   402: ldc             1107003163
        //   404: ldc             -1489341823
        //   406: ixor           
        //   407: lookupswitch {
        //          -932844843: 402
        //          -423496294: 432
        //          default: 667
        //        }
        //   432: aload_0        
        //   433: new             Ljava/util/LinkedList;
        //   436: dup            
        //   437: invokespecial   java/util/LinkedList.<init>:()V
        //   440: putfield        dev/nuker/pyro/f9d.c:Ljava/util/LinkedList;
        //   443: aload_0        
        //   444: new             Ldev/nuker/pyro/fbu;
        //   447: dup            
        //   448: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   451: putfield        dev/nuker/pyro/f9d.c:Ldev/nuker/pyro/fbu;
        //   454: aload_0        
        //   455: aload_0        
        //   456: getstatic       dev/nuker/pyro/fc.1:I
        //   459: ifeq            467
        //   462: ldc             -1557846665
        //   464: goto            469
        //   467: ldc             1663228566
        //   469: ldc             1781837051
        //   471: ixor           
        //   472: lookupswitch {
        //          -921597556: 467
        //          152467053: 500
        //          default: 681
        //        }
        //   500: getfield        dev/nuker/pyro/f9d.c:Ldev/nuker/pyro/f0a;
        //   503: getstatic       dev/nuker/pyro/fc.c:I
        //   506: ifge            514
        //   509: ldc             -1460622919
        //   511: goto            516
        //   514: ldc             328401098
        //   516: ldc             -360404813
        //   518: ixor           
        //   519: lookupswitch {
        //          -1115037649: 514
        //          1114898698: 661
        //          default: 544
        //        }
        //   544: invokevirtual   dev/nuker/pyro/f9d.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   547: pop            
        //   548: getstatic       dev/nuker/pyro/fc.0:I
        //   551: ifeq            559
        //   554: ldc             -1013853689
        //   556: goto            561
        //   559: ldc             -1907139069
        //   561: ldc             1032898900
        //   563: ixor           
        //   564: lookupswitch {
        //          -33481901: 679
        //          1236749165: 559
        //          default: 592
        //        }
        //   592: aload_0        
        //   593: aload_0        
        //   594: getfield        dev/nuker/pyro/f9d.c:Ldev/nuker/pyro/f0d;
        //   597: invokevirtual   dev/nuker/pyro/f9d.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   600: pop            
        //   601: aload_0        
        //   602: aload_0        
        //   603: getstatic       dev/nuker/pyro/fc.0:I
        //   606: ifeq            614
        //   609: ldc             1450385545
        //   611: goto            616
        //   614: ldc             356651337
        //   616: ldc             1548310339
        //   618: ixor           
        //   619: lookupswitch {
        //          171603914: 614
        //          1225475594: 644
        //          default: 675
        //        }
        //   644: getfield        dev/nuker/pyro/f9d.0:Ldev/nuker/pyro/f0d;
        //   647: invokevirtual   dev/nuker/pyro/f9d.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   650: pop            
        //   651: aload_0        
        //   652: aload_0        
        //   653: getfield        dev/nuker/pyro/f9d.c:Ldev/nuker/pyro/f0b;
        //   656: invokevirtual   dev/nuker/pyro/f9d.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   659: pop            
        //   660: return         
        //   661: aconst_null    
        //   662: athrow         
        //   663: aconst_null    
        //   664: athrow         
        //   665: aconst_null    
        //   666: athrow         
        //   667: aconst_null    
        //   668: athrow         
        //   669: aconst_null    
        //   670: athrow         
        //   671: aconst_null    
        //   672: athrow         
        //   673: aconst_null    
        //   674: athrow         
        //   675: aconst_null    
        //   676: athrow         
        //   677: aconst_null    
        //   678: athrow         
        //   679: aconst_null    
        //   680: athrow         
        //   681: aconst_null    
        //   682: athrow         
        //    StackMapTable: 00 2C FF 00 1B 00 01 06 00 04 06 07 00 8B 07 00 8B 07 00 8B FF 00 01 00 01 06 00 05 06 07 00 8B 07 00 8B 07 00 8B 01 FF 00 1E 00 01 06 00 04 06 07 00 8B 07 00 8B 07 00 8B FF 00 1E 00 01 07 00 03 00 07 07 00 03 08 00 40 08 00 40 07 00 8B 07 00 8B 05 01 FF 00 01 00 01 07 00 03 00 08 07 00 03 08 00 40 08 00 40 07 00 8B 07 00 8B 05 01 01 FF 00 1E 00 01 07 00 03 00 07 07 00 03 08 00 40 08 00 40 07 00 8B 07 00 8B 05 01 10 41 01 1C FF 00 41 00 01 07 00 03 00 02 07 00 03 07 00 3B FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 3B 01 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 3B FF 00 14 00 01 07 00 03 00 04 07 00 03 08 01 10 08 01 10 07 00 8B FF 00 01 00 01 07 00 03 00 05 07 00 03 08 01 10 08 01 10 07 00 8B 01 FF 00 1C 00 01 07 00 03 00 04 07 00 03 08 01 10 08 01 10 07 00 8B FF 00 22 00 01 07 00 03 00 02 07 00 03 07 00 55 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 55 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 55 0D 41 01 1B FF 00 22 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 0D 00 01 07 00 03 00 02 07 00 03 07 00 28 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 28 01 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 28 0E 41 01 1E FF 00 15 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 10 00 01 07 00 03 00 02 07 00 03 07 00 28 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 3B FF 00 01 00 01 06 00 04 06 07 00 8B 07 00 8B 07 00 8B FF 00 01 00 01 07 00 03 00 00 01 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 01 10 08 01 10 07 00 8B FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 55 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 00 40 08 00 40 07 00 8B 07 00 8B 05 01 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03
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
    
    static {
        throw t;
    }
    
    @f06
    @LauncherEventHide
    public void c(final f3h f3h) {
        fbS.hJ(this, 1679485928, f3h);
    }
    
    @Override
    public void c(@Nullable final Vec3d p0, final float p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1347
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1339
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1331
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: aload_1        
        //    26: fload_2        
        //    27: goto            31
        //    30: athrow         
        //    31: invokespecial   dev/nuker/pyro/fH.c:(Lnet/minecraft/util/math/Vec3d;F)V
        //    34: goto            38
        //    37: athrow         
        //    38: aload_0        
        //    39: getfield        dev/nuker/pyro/f9d.c:Ldev/nuker/pyro/f0a;
        //    42: goto            46
        //    45: athrow         
        //    46: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //    49: goto            53
        //    52: athrow         
        //    53: checkcast       Ljava/lang/Boolean;
        //    56: goto            60
        //    59: athrow         
        //    60: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    63: goto            67
        //    66: athrow         
        //    67: ifne            71
        //    70: return         
        //    71: aload_0        
        //    72: getstatic       dev/nuker/pyro/fc.c:I
        //    75: ifge            83
        //    78: ldc             -1175101333
        //    80: goto            85
        //    83: ldc             342811246
        //    85: ldc             -325332384
        //    87: ixor           
        //    88: lookupswitch {
        //          -118149106: 116
        //          1433317899: 83
        //          default: 1320
        //        }
        //   116: getfield        dev/nuker/pyro/f9d.c:Ljava/util/LinkedList;
        //   119: dup            
        //   120: getstatic       dev/nuker/pyro/fc.0:I
        //   123: ifeq            131
        //   126: ldc             1591665633
        //   128: goto            133
        //   131: ldc             -1275063284
        //   133: ldc             -683326902
        //   135: ixor           
        //   136: lookupswitch {
        //          -1986289237: 131
        //          1665488454: 164
        //          default: 1296
        //        }
        //   164: astore_3       
        //   165: monitorenter   
        //   166: goto            170
        //   169: athrow         
        //   170: invokestatic    org/lwjgl/opengl/GL11.glPushMatrix:()V
        //   173: goto            177
        //   176: athrow         
        //   177: sipush          3553
        //   180: goto            184
        //   183: athrow         
        //   184: invokestatic    org/lwjgl/opengl/GL11.glDisable:(I)V
        //   187: goto            191
        //   190: athrow         
        //   191: sipush          770
        //   194: sipush          771
        //   197: goto            201
        //   200: athrow         
        //   201: invokestatic    org/lwjgl/opengl/GL11.glBlendFunc:(II)V
        //   204: goto            208
        //   207: athrow         
        //   208: aload_0        
        //   209: getfield        dev/nuker/pyro/f9d.0:Ldev/nuker/pyro/f0d;
        //   212: getstatic       dev/nuker/pyro/fc.0:I
        //   215: ifeq            223
        //   218: ldc             -1884246421
        //   220: goto            225
        //   223: ldc             -316478762
        //   225: ldc             1182390765
        //   227: ixor           
        //   228: lookupswitch {
        //          -909543546: 1312
        //          -881247334: 223
        //          default: 256
        //        }
        //   256: goto            260
        //   259: athrow         
        //   260: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   263: goto            267
        //   266: athrow         
        //   267: checkcast       Ljava/lang/Double;
        //   270: getstatic       dev/nuker/pyro/fc.0:I
        //   273: ifeq            281
        //   276: ldc             -2130054790
        //   278: goto            283
        //   281: ldc             -1872113440
        //   283: ldc             -1203196950
        //   285: ixor           
        //   286: lookupswitch {
        //          960584336: 1318
        //          2028855918: 281
        //          default: 312
        //        }
        //   312: goto            316
        //   315: athrow         
        //   316: invokevirtual   java/lang/Double.doubleValue:()D
        //   319: goto            323
        //   322: athrow         
        //   323: dstore          4
        //   325: dload           4
        //   327: d2f            
        //   328: goto            332
        //   331: athrow         
        //   332: invokestatic    org/lwjgl/opengl/GL11.glLineWidth:(F)V
        //   335: goto            339
        //   338: athrow         
        //   339: sipush          2848
        //   342: getstatic       dev/nuker/pyro/fc.0:I
        //   345: ifeq            353
        //   348: ldc             -959833057
        //   350: goto            355
        //   353: ldc             -124836542
        //   355: ldc             -1523935028
        //   357: ixor           
        //   358: lookupswitch {
        //          1571143054: 384
        //          1675658451: 353
        //          default: 1310
        //        }
        //   384: goto            388
        //   387: athrow         
        //   388: invokestatic    org/lwjgl/opengl/GL11.glEnable:(I)V
        //   391: goto            395
        //   394: athrow         
        //   395: sipush          3042
        //   398: getstatic       dev/nuker/pyro/fc.c:I
        //   401: ifge            409
        //   404: ldc             -1464154049
        //   406: goto            411
        //   409: ldc             1910528686
        //   411: ldc             533650673
        //   413: ixor           
        //   414: lookupswitch {
        //          -1217129266: 409
        //          1848542815: 440
        //          default: 1294
        //        }
        //   440: goto            444
        //   443: athrow         
        //   444: invokestatic    org/lwjgl/opengl/GL11.glEnable:(I)V
        //   447: goto            451
        //   450: athrow         
        //   451: sipush          2929
        //   454: goto            458
        //   457: athrow         
        //   458: invokestatic    org/lwjgl/opengl/GL11.glDisable:(I)V
        //   461: goto            465
        //   464: athrow         
        //   465: getstatic       dev/nuker/pyro/fc.1:I
        //   468: ifeq            476
        //   471: ldc             698288641
        //   473: goto            478
        //   476: ldc             1117863810
        //   478: ldc             1711228584
        //   480: ixor           
        //   481: lookupswitch {
        //          1075831611: 476
        //          1281379497: 1302
        //          default: 508
        //        }
        //   508: aload_0        
        //   509: getfield        dev/nuker/pyro/f9d.c:Lnet/minecraft/client/Minecraft;
        //   512: getstatic       dev/nuker/pyro/fc.c:I
        //   515: ifge            523
        //   518: ldc             -1542511255
        //   520: goto            525
        //   523: ldc             1603549606
        //   525: ldc             1039024928
        //   527: ixor           
        //   528: lookupswitch {
        //          -1713281463: 523
        //          1652193926: 556
        //          default: 1308
        //        }
        //   556: getfield        net/minecraft/client/Minecraft.field_71460_t:Lnet/minecraft/client/renderer/EntityRenderer;
        //   559: goto            563
        //   562: athrow         
        //   563: invokevirtual   net/minecraft/client/renderer/EntityRenderer.func_175072_h:()V
        //   566: goto            570
        //   569: athrow         
        //   570: iconst_3       
        //   571: goto            575
        //   574: athrow         
        //   575: invokestatic    org/lwjgl/opengl/GL11.glBegin:(I)V
        //   578: goto            582
        //   581: athrow         
        //   582: getstatic       dev/nuker/pyro/fc.0:I
        //   585: ifeq            594
        //   588: ldc_w           1469731937
        //   591: goto            597
        //   594: ldc_w           1036161541
        //   597: ldc_w           -1241762103
        //   600: ixor           
        //   601: lookupswitch {
        //          -2009160500: 628
        //          -496606552: 594
        //          default: 1306
        //        }
        //   628: aload_0        
        //   629: getfield        dev/nuker/pyro/f9d.c:Ldev/nuker/pyro/f0b;
        //   632: goto            636
        //   635: athrow         
        //   636: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //   639: goto            643
        //   642: athrow         
        //   643: checkcast       Ldev/nuker/pyro/fS;
        //   646: goto            650
        //   649: athrow         
        //   650: invokevirtual   dev/nuker/pyro/fS.7:()Ljava/awt/Color;
        //   653: goto            657
        //   656: athrow         
        //   657: getstatic       dev/nuker/pyro/fc.c:I
        //   660: ifge            669
        //   663: ldc_w           1244820853
        //   666: goto            672
        //   669: ldc_w           -1922674399
        //   672: ldc_w           1294933473
        //   675: ixor           
        //   676: lookupswitch {
        //          -1068938048: 704
        //          119367828: 669
        //          default: 1314
        //        }
        //   704: goto            708
        //   707: athrow         
        //   708: invokestatic    dev/nuker/pyro/fbo.0:(Ljava/awt/Color;)V
        //   711: goto            715
        //   714: athrow         
        //   715: aload_0        
        //   716: getfield        dev/nuker/pyro/f9d.c:Lnet/minecraft/client/Minecraft;
        //   719: goto            723
        //   722: athrow         
        //   723: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //   726: goto            730
        //   729: athrow         
        //   730: getfield        net/minecraft/client/renderer/entity/RenderManager.field_78730_l:D
        //   733: getstatic       dev/nuker/pyro/fc.0:I
        //   736: ifeq            745
        //   739: ldc_w           1943772830
        //   742: goto            748
        //   745: ldc_w           -998519410
        //   748: ldc_w           -1957048939
        //   751: ixor           
        //   752: lookupswitch {
        //          -125676789: 745
        //          1327628315: 780
        //          default: 1288
        //        }
        //   780: dstore          6
        //   782: aload_0        
        //   783: getfield        dev/nuker/pyro/f9d.c:Lnet/minecraft/client/Minecraft;
        //   786: goto            790
        //   789: athrow         
        //   790: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //   793: goto            797
        //   796: athrow         
        //   797: getfield        net/minecraft/client/renderer/entity/RenderManager.field_78731_m:D
        //   800: dstore          8
        //   802: getstatic       dev/nuker/pyro/fc.1:I
        //   805: ifeq            814
        //   808: ldc_w           -227990719
        //   811: goto            817
        //   814: ldc_w           -1487797449
        //   817: ldc_w           -1368421697
        //   820: ixor           
        //   821: lookupswitch {
        //          -406014567: 814
        //          1543940606: 1290
        //          default: 848
        //        }
        //   848: aload_0        
        //   849: getfield        dev/nuker/pyro/f9d.c:Lnet/minecraft/client/Minecraft;
        //   852: goto            856
        //   855: athrow         
        //   856: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //   859: goto            863
        //   862: athrow         
        //   863: getfield        net/minecraft/client/renderer/entity/RenderManager.field_78728_n:D
        //   866: getstatic       dev/nuker/pyro/fc.1:I
        //   869: ifeq            878
        //   872: ldc_w           1624702543
        //   875: goto            881
        //   878: ldc_w           -1700108032
        //   881: ldc_w           -324129413
        //   884: ixor           
        //   885: lookupswitch {
        //          -1938238668: 878
        //          1979991163: 912
        //          default: 1300
        //        }
        //   912: dstore          10
        //   914: aload_0        
        //   915: getfield        dev/nuker/pyro/f9d.c:Ljava/util/LinkedList;
        //   918: goto            922
        //   921: athrow         
        //   922: invokevirtual   java/util/LinkedList.iterator:()Ljava/util/Iterator;
        //   925: goto            929
        //   928: athrow         
        //   929: astore          12
        //   931: getstatic       dev/nuker/pyro/fc.0:I
        //   934: ifeq            943
        //   937: ldc_w           1340163769
        //   940: goto            946
        //   943: ldc_w           1824843779
        //   946: ldc_w           -1048851669
        //   949: ixor           
        //   950: lookupswitch {
        //          -1902473838: 1316
        //          -90831940: 943
        //          default: 976
        //        }
        //   976: aload           12
        //   978: goto            982
        //   981: athrow         
        //   982: invokeinterface java/util/Iterator.hasNext:()Z
        //   987: goto            991
        //   990: athrow         
        //   991: ifeq            1182
        //   994: aload           12
        //   996: goto            1000
        //   999: athrow         
        //  1000: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1005: goto            1009
        //  1008: athrow         
        //  1009: checkcast       [D
        //  1012: getstatic       dev/nuker/pyro/fc.c:I
        //  1015: ifge            1024
        //  1018: ldc_w           1602000287
        //  1021: goto            1027
        //  1024: ldc_w           -660249194
        //  1027: ldc_w           -567021761
        //  1030: ixor           
        //  1031: lookupswitch {
        //          -2125497696: 1292
        //          -94992084: 1024
        //          default: 1056
        //        }
        //  1056: astore          13
        //  1058: aload           13
        //  1060: iconst_0       
        //  1061: daload         
        //  1062: dload           6
        //  1064: dsub           
        //  1065: aload           13
        //  1067: iconst_1       
        //  1068: daload         
        //  1069: dload           8
        //  1071: dsub           
        //  1072: getstatic       dev/nuker/pyro/fc.c:I
        //  1075: ifge            1084
        //  1078: ldc_w           -998823807
        //  1081: goto            1087
        //  1084: ldc_w           421799004
        //  1087: ldc_w           -1011145182
        //  1090: ixor           
        //  1091: lookupswitch {
        //          -627113346: 1116
        //          130813603: 1084
        //          default: 1298
        //        }
        //  1116: aload           13
        //  1118: iconst_2       
        //  1119: daload         
        //  1120: dload           10
        //  1122: dsub           
        //  1123: getstatic       dev/nuker/pyro/fc.c:I
        //  1126: ifge            1135
        //  1129: ldc_w           1595696329
        //  1132: goto            1138
        //  1135: ldc_w           999151723
        //  1138: ldc_w           -1306594049
        //  1141: ixor           
        //  1142: lookupswitch {
        //          -1986843500: 1168
        //          -318599114: 1135
        //          default: 1304
        //        }
        //  1168: goto            1172
        //  1171: athrow         
        //  1172: invokestatic    org/lwjgl/opengl/GL11.glVertex3d:(DDD)V
        //  1175: goto            1179
        //  1178: athrow         
        //  1179: goto            931
        //  1182: dconst_1       
        //  1183: dconst_1       
        //  1184: dconst_1       
        //  1185: dconst_1       
        //  1186: goto            1190
        //  1189: athrow         
        //  1190: invokestatic    org/lwjgl/opengl/GL11.glColor4d:(DDDD)V
        //  1193: goto            1197
        //  1196: athrow         
        //  1197: goto            1201
        //  1200: athrow         
        //  1201: invokestatic    org/lwjgl/opengl/GL11.glEnd:()V
        //  1204: goto            1208
        //  1207: athrow         
        //  1208: sipush          2929
        //  1211: goto            1215
        //  1214: athrow         
        //  1215: invokestatic    org/lwjgl/opengl/GL11.glEnable:(I)V
        //  1218: goto            1222
        //  1221: athrow         
        //  1222: sipush          2848
        //  1225: goto            1229
        //  1228: athrow         
        //  1229: invokestatic    org/lwjgl/opengl/GL11.glDisable:(I)V
        //  1232: goto            1236
        //  1235: athrow         
        //  1236: sipush          3042
        //  1239: goto            1243
        //  1242: athrow         
        //  1243: invokestatic    org/lwjgl/opengl/GL11.glDisable:(I)V
        //  1246: goto            1250
        //  1249: athrow         
        //  1250: sipush          3553
        //  1253: goto            1257
        //  1256: athrow         
        //  1257: invokestatic    org/lwjgl/opengl/GL11.glEnable:(I)V
        //  1260: goto            1264
        //  1263: athrow         
        //  1264: goto            1268
        //  1267: athrow         
        //  1268: invokestatic    org/lwjgl/opengl/GL11.glPopMatrix:()V
        //  1271: goto            1275
        //  1274: athrow         
        //  1275: aload_3        
        //  1276: monitorexit    
        //  1277: goto            1287
        //  1280: astore          14
        //  1282: aload_3        
        //  1283: monitorexit    
        //  1284: aload           14
        //  1286: athrow         
        //  1287: return         
        //  1288: aconst_null    
        //  1289: athrow         
        //  1290: aconst_null    
        //  1291: athrow         
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
        //  1322: pop            
        //  1323: goto            24
        //  1326: pop            
        //  1327: aconst_null    
        //  1328: goto            1322
        //  1331: dup            
        //  1332: ifnull          1322
        //  1335: checkcast       Ljava/lang/Throwable;
        //  1338: athrow         
        //  1339: dup            
        //  1340: ifnull          1326
        //  1343: checkcast       Ljava/lang/Throwable;
        //  1346: athrow         
        //  1347: aconst_null    
        //  1348: athrow         
        //    RuntimeInvisibleTypeAnnotations: 00 01 16 00 00 00 99 00 00
        //    StackMapTable: 00 CE 43 07 00 B9 04 FF 00 0B 00 00 00 01 07 00 B9 FE 00 03 07 00 03 07 01 5C 02 45 07 00 A1 FF 00 00 00 03 07 00 03 07 01 5C 02 00 03 07 00 03 07 01 5C 02 45 07 00 B9 00 46 07 00 B9 40 07 00 28 45 07 00 B9 40 07 01 5E FF 00 05 00 00 00 01 07 00 B9 FF 00 00 00 03 07 00 03 07 01 5C 02 00 01 07 00 C1 45 07 00 B9 40 01 03 4B 07 00 03 FF 00 01 00 03 07 00 03 07 01 5C 02 00 02 07 00 03 01 5E 07 00 03 FF 00 0E 00 03 07 00 03 07 01 5C 02 00 02 07 00 71 07 00 71 FF 00 01 00 03 07 00 03 07 01 5C 02 00 03 07 00 71 07 00 71 01 FF 00 1E 00 03 07 00 03 07 01 5C 02 00 02 07 00 71 07 00 71 FF 00 04 00 04 07 00 03 07 01 5C 02 07 00 71 00 01 07 00 A7 00 45 07 00 B9 00 45 07 00 B9 40 01 45 07 00 B9 00 48 07 00 B9 FF 00 00 00 04 07 00 03 07 01 5C 02 07 00 71 00 02 01 01 45 07 00 B9 00 4E 07 00 3B FF 00 01 00 04 07 00 03 07 01 5C 02 07 00 71 00 02 07 00 3B 01 5E 07 00 3B 42 07 00 B9 40 07 00 3B 45 07 00 B9 40 07 01 5E 4D 07 00 DE FF 00 01 00 04 07 00 03 07 01 5C 02 07 00 71 00 02 07 00 DE 01 5C 07 00 DE 42 07 00 B9 40 07 00 DE 45 07 00 B9 40 03 FF 00 07 00 00 00 01 07 00 B9 FF 00 00 00 05 07 00 03 07 01 5C 02 07 00 71 03 00 01 02 45 07 00 B9 00 4D 01 FF 00 01 00 05 07 00 03 07 01 5C 02 07 00 71 03 00 02 01 01 5C 01 42 07 00 B9 40 01 45 07 00 B9 00 4D 01 FF 00 01 00 05 07 00 03 07 01 5C 02 07 00 71 03 00 02 01 01 5C 01 42 07 00 B9 40 01 45 07 00 B9 00 45 07 00 A7 40 01 45 07 00 B9 00 0A 41 01 1D 4E 07 00 FD FF 00 01 00 05 07 00 03 07 01 5C 02 07 00 71 03 00 02 07 00 FD 01 5E 07 00 FD FF 00 05 00 00 00 01 07 00 B9 FF 00 00 00 05 07 00 03 07 01 5C 02 07 00 71 03 00 01 07 01 03 45 07 00 B9 00 43 07 00 B9 40 01 45 07 00 B9 00 0B 42 01 1E 46 07 00 B9 40 07 00 55 45 07 00 B9 40 07 01 5E 45 07 00 B5 40 07 00 60 45 07 00 B9 40 07 01 60 4B 07 01 60 FF 00 02 00 05 07 00 03 07 01 5C 02 07 00 71 03 00 02 07 01 60 01 5F 07 01 60 42 07 00 AD 40 07 01 60 45 07 00 B9 00 46 07 00 B5 40 07 00 FD 45 07 00 B9 40 07 01 1F 4E 03 FF 00 02 00 05 07 00 03 07 01 5C 02 07 00 71 03 00 02 03 01 5F 03 FF 00 08 00 06 07 00 03 07 01 5C 02 07 00 71 03 03 00 01 07 00 B9 40 07 00 FD 45 07 00 B9 40 07 01 1F FC 00 10 03 42 01 1E 46 07 00 B9 40 07 00 FD 45 07 00 B9 40 07 01 1F 4E 03 FF 00 02 00 07 07 00 03 07 01 5C 02 07 00 71 03 03 03 00 02 03 01 5E 03 FF 00 08 00 08 07 00 03 07 01 5C 02 07 00 71 03 03 03 03 00 01 07 00 B9 40 07 00 71 45 07 00 B9 40 07 01 3B FC 00 01 07 01 3B 0B 42 01 1D 44 07 00 B9 40 07 01 3B 47 07 00 B9 40 01 FF 00 07 00 00 00 01 07 00 B9 FF 00 00 00 09 07 00 03 07 01 5C 02 07 00 71 03 03 03 03 07 01 3B 00 01 07 01 3B 47 07 00 B9 40 07 01 5E 4E 07 01 43 FF 00 02 00 09 07 00 03 07 01 5C 02 07 00 71 03 03 03 03 07 01 3B 00 02 07 01 43 01 5C 07 01 43 FF 00 1B 00 0A 07 00 03 07 01 5C 02 07 00 71 03 03 03 03 07 01 3B 07 01 43 00 02 03 03 FF 00 02 00 0A 07 00 03 07 01 5C 02 07 00 71 03 03 03 03 07 01 3B 07 01 43 00 03 03 03 01 FF 00 1C 00 0A 07 00 03 07 01 5C 02 07 00 71 03 03 03 03 07 01 3B 07 01 43 00 02 03 03 FF 00 12 00 0A 07 00 03 07 01 5C 02 07 00 71 03 03 03 03 07 01 3B 07 01 43 00 03 03 03 03 FF 00 02 00 0A 07 00 03 07 01 5C 02 07 00 71 03 03 03 03 07 01 3B 07 01 43 00 04 03 03 03 01 FF 00 1D 00 0A 07 00 03 07 01 5C 02 07 00 71 03 03 03 03 07 01 3B 07 01 43 00 03 03 03 03 42 07 00 B9 FF 00 00 00 0A 07 00 03 07 01 5C 02 07 00 71 03 03 03 03 07 01 3B 07 01 43 00 03 03 03 03 45 07 00 B9 00 FA 00 02 46 07 00 AD FF 00 00 00 09 07 00 03 07 01 5C 02 07 00 71 03 03 03 03 07 01 3B 00 04 03 03 03 03 45 07 00 B9 00 42 07 00 B9 00 45 07 00 B9 00 45 07 00 B9 40 01 45 07 00 B9 00 45 07 00 B9 40 01 45 07 00 B9 00 45 07 00 B9 40 01 45 07 00 B9 00 45 07 00 B9 40 01 45 07 00 B9 00 42 07 00 B9 00 45 07 00 B9 00 FF 00 04 00 04 07 00 03 07 01 5C 02 07 00 71 00 01 07 00 B9 FF 00 06 00 09 07 00 03 07 01 5C 02 07 00 71 03 03 03 03 07 01 3B 00 00 FF 00 00 00 05 07 00 03 07 01 5C 02 07 00 71 03 00 01 03 FD 00 01 03 03 FF 00 01 00 09 07 00 03 07 01 5C 02 07 00 71 03 03 03 03 07 01 3B 00 01 07 01 43 FF 00 01 00 05 07 00 03 07 01 5C 02 07 00 71 03 00 01 01 FF 00 01 00 03 07 00 03 07 01 5C 02 00 02 07 00 71 07 00 71 FF 00 01 00 0A 07 00 03 07 01 5C 02 07 00 71 03 03 03 03 07 01 3B 07 01 43 00 02 03 03 FF 00 01 00 07 07 00 03 07 01 5C 02 07 00 71 03 03 03 00 01 03 F9 00 01 FF 00 01 00 0A 07 00 03 07 01 5C 02 07 00 71 03 03 03 03 07 01 3B 07 01 43 00 03 03 03 03 FF 00 01 00 05 07 00 03 07 01 5C 02 07 00 71 03 00 00 41 07 00 FD 41 01 FF 00 01 00 04 07 00 03 07 01 5C 02 07 00 71 00 01 07 00 3B FF 00 01 00 05 07 00 03 07 01 5C 02 07 00 71 03 00 01 07 01 60 FF 00 01 00 09 07 00 03 07 01 5C 02 07 00 71 03 03 03 03 07 01 3B 00 00 FF 00 01 00 04 07 00 03 07 01 5C 02 07 00 71 00 01 07 00 DE FF 00 01 00 03 07 00 03 07 01 5C 02 00 01 07 00 03 41 07 00 B9 43 05 44 07 00 B9 47 05 47 07 00 B9
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  166    331    1280   1287   Any
        //  332    562    1280   1287   Any
        //  563    999    1280   1287   Any
        //  1000   1277   1280   1287   Any
        //  1280   1284   1280   1287   Any
        //  8      20     1331   1339   Ljava/util/ConcurrentModificationException;
        //  1331   1339   1331   1339   Any
        //  1347   1349   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  30     37     37     38     Any
        //  31     37     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  31     37     37     38     Any
        //  30     37     37     38     Any
        //  30     37     30     31     Ljava/lang/NullPointerException;
        //  45     52     52     53     Any
        //  45     52     52     53     Ljava/util/NoSuchElementException;
        //  45     52     45     46     Any
        //  46     52     52     53     Any
        //  45     52     3      8      Any
        //  60     66     66     67     Any
        //  60     66     3      8      Any
        //  60     66     66     67     Any
        //  60     66     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  60     66     66     67     Ljava/lang/IllegalArgumentException;
        //  169    176    176    177    Any
        //  169    176    176    177    Any
        //  170    176    169    170    Ljava/lang/ClassCastException;
        //  169    176    3      8      Any
        //  169    176    176    177    Ljava/lang/UnsupportedOperationException;
        //  183    190    190    191    Any
        //  184    190    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  183    190    183    184    Any
        //  183    190    3      8      Any
        //  183    190    183    184    Ljava/lang/IndexOutOfBoundsException;
        //  200    207    207    208    Any
        //  200    207    200    201    Any
        //  200    207    200    201    Any
        //  200    207    207    208    Ljava/lang/IllegalStateException;
        //  200    207    200    201    Ljava/lang/ArithmeticException;
        //  259    266    266    267    Any
        //  259    266    259    260    Ljava/util/NoSuchElementException;
        //  260    266    259    260    Any
        //  259    266    259    260    Any
        //  259    266    259    260    Any
        //  315    322    322    323    Any
        //  315    322    3      8      Ljava/lang/AssertionError;
        //  316    322    315    316    Any
        //  315    322    315    316    Any
        //  316    322    315    316    Ljava/lang/NullPointerException;
        //  332    338    338    339    Any
        //  332    338    338    339    Any
        //  332    338    3      8      Ljava/lang/IllegalArgumentException;
        //  332    338    338    339    Ljava/util/ConcurrentModificationException;
        //  332    338    338    339    Any
        //  387    394    394    395    Any
        //  388    394    387    388    Any
        //  388    394    387    388    Ljava/lang/IndexOutOfBoundsException;
        //  387    394    3      8      Any
        //  388    394    3      8      Any
        //  443    450    450    451    Any
        //  444    450    443    444    Ljava/lang/NullPointerException;
        //  444    450    3      8      Ljava/lang/ClassCastException;
        //  444    450    443    444    Any
        //  443    450    3      8      Ljava/lang/UnsupportedOperationException;
        //  457    464    464    465    Any
        //  457    464    464    465    Ljava/lang/IndexOutOfBoundsException;
        //  457    464    3      8      Any
        //  458    464    464    465    Ljava/lang/IllegalStateException;
        //  457    464    457    458    Ljava/lang/ClassCastException;
        //  563    569    569    570    Any
        //  563    569    569    570    Any
        //  563    569    3      8      Any
        //  563    569    569    570    Any
        //  563    569    569    570    Any
        //  574    581    581    582    Any
        //  575    581    3      8      Ljava/lang/AssertionError;
        //  575    581    581    582    Ljava/lang/StringIndexOutOfBoundsException;
        //  575    581    574    575    Any
        //  575    581    581    582    Any
        //  635    642    642    643    Any
        //  636    642    635    636    Any
        //  635    642    635    636    Any
        //  635    642    635    636    Ljava/lang/StringIndexOutOfBoundsException;
        //  635    642    642    643    Any
        //  649    656    656    657    Any
        //  650    656    3      8      Any
        //  650    656    649    650    Ljava/lang/IndexOutOfBoundsException;
        //  650    656    649    650    Ljava/lang/ClassCastException;
        //  649    656    649    650    Ljava/util/NoSuchElementException;
        //  707    714    714    715    Any
        //  708    714    707    708    Ljava/lang/IllegalStateException;
        //  707    714    714    715    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  708    714    714    715    Ljava/lang/IllegalArgumentException;
        //  707    714    3      8      Any
        //  722    729    729    730    Any
        //  723    729    722    723    Ljava/lang/IllegalStateException;
        //  722    729    722    723    Ljava/lang/EnumConstantNotPresentException;
        //  722    729    3      8      Any
        //  722    729    3      8      Any
        //  789    796    796    797    Any
        //  789    796    789    790    Any
        //  790    796    789    790    Any
        //  790    796    789    790    Ljava/lang/IndexOutOfBoundsException;
        //  789    796    789    790    Ljava/lang/NullPointerException;
        //  855    862    862    863    Any
        //  856    862    862    863    Ljava/lang/EnumConstantNotPresentException;
        //  855    862    862    863    Ljava/util/NoSuchElementException;
        //  856    862    3      8      Any
        //  856    862    855    856    Any
        //  921    928    928    929    Any
        //  921    928    3      8      Any
        //  922    928    921    922    Any
        //  921    928    3      8      Ljava/util/ConcurrentModificationException;
        //  922    928    921    922    Any
        //  981    990    990    991    Any
        //  982    990    981    982    Any
        //  982    990    990    991    Ljava/lang/AssertionError;
        //  982    990    3      8      Ljava/lang/RuntimeException;
        //  982    990    981    982    Any
        //  1000   1008   1008   1009   Any
        //  1000   1008   3      8      Any
        //  1000   1008   3      8      Any
        //  1000   1008   3      8      Ljava/lang/ArithmeticException;
        //  1000   1008   1008   1009   Any
        //  1171   1178   1178   1179   Any
        //  1171   1178   1171   1172   Any
        //  1171   1178   3      8      Any
        //  1172   1178   1171   1172   Any
        //  1171   1178   1178   1179   Ljava/lang/NumberFormatException;
        //  1189   1196   1196   1197   Any
        //  1190   1196   1196   1197   Ljava/lang/StringIndexOutOfBoundsException;
        //  1190   1196   1196   1197   Ljava/lang/ClassCastException;
        //  1189   1196   1189   1190   Ljava/lang/IllegalStateException;
        //  1189   1196   3      8      Any
        //  1200   1207   1207   1208   Any
        //  1201   1207   1207   1208   Ljava/lang/RuntimeException;
        //  1200   1207   1207   1208   Any
        //  1200   1207   1200   1201   Any
        //  1200   1207   3      8      Ljava/lang/NullPointerException;
        //  1214   1221   1221   1222   Any
        //  1215   1221   1214   1215   Any
        //  1214   1221   1221   1222   Ljava/lang/IllegalStateException;
        //  1214   1221   3      8      Ljava/lang/IllegalArgumentException;
        //  1214   1221   1214   1215   Ljava/lang/IndexOutOfBoundsException;
        //  1228   1235   1235   1236   Any
        //  1229   1235   3      8      Any
        //  1228   1235   1235   1236   Ljava/lang/ArithmeticException;
        //  1229   1235   3      8      Ljava/lang/ArithmeticException;
        //  1228   1235   1228   1229   Any
        //  1242   1249   1249   1250   Any
        //  1243   1249   1242   1243   Any
        //  1243   1249   1249   1250   Ljava/lang/ClassCastException;
        //  1243   1249   1242   1243   Ljava/util/ConcurrentModificationException;
        //  1242   1249   1242   1243   Any
        //  1256   1263   1263   1264   Any
        //  1256   1263   1256   1257   Ljava/lang/IllegalStateException;
        //  1257   1263   3      8      Ljava/util/NoSuchElementException;
        //  1256   1263   1256   1257   Ljava/lang/AssertionError;
        //  1257   1263   1263   1264   Ljava/util/NoSuchElementException;
        //  1267   1274   1274   1275   Any
        //  1268   1274   1267   1268   Ljava/lang/AssertionError;
        //  1267   1274   1274   1275   Any
        //  1268   1274   3      8      Any
        //  1267   1274   1267   1268   Ljava/util/ConcurrentModificationException;
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
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1112
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1104
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1096
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            37
        //    31: ldc_w           1907097517
        //    34: goto            40
        //    37: ldc_w           -1308322791
        //    40: ldc_w           1608331523
        //    43: ixor           
        //    44: lookupswitch {
        //          -41279332: 37
        //          779538094: 1059
        //          default: 72
        //        }
        //    72: iload_1        
        //    73: aload_2        
        //    74: getstatic       dev/nuker/pyro/fc.1:I
        //    77: ifeq            86
        //    80: ldc_w           2082875387
        //    83: goto            89
        //    86: ldc_w           -992157743
        //    89: ldc_w           -201982528
        //    92: ixor           
        //    93: lookupswitch {
        //          -1881941445: 86
        //          925442577: 120
        //          default: 1063
        //        }
        //   120: aload_3        
        //   121: goto            125
        //   124: athrow         
        //   125: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //   128: goto            132
        //   131: athrow         
        //   132: iload_1        
        //   133: ifeq            926
        //   136: aload_0        
        //   137: getstatic       dev/nuker/pyro/fc.c:I
        //   140: ifge            149
        //   143: ldc_w           1215526747
        //   146: goto            152
        //   149: ldc_w           270134683
        //   152: ldc_w           719550839
        //   155: ixor           
        //   156: lookupswitch {
        //          989500652: 184
        //          1653607980: 149
        //          default: 1071
        //        }
        //   184: getfield        dev/nuker/pyro/f9d.c:Lnet/minecraft/client/Minecraft;
        //   187: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   190: ifnonnull       194
        //   193: return         
        //   194: aload_0        
        //   195: getstatic       dev/nuker/pyro/fc.c:I
        //   198: ifge            207
        //   201: ldc_w           255086142
        //   204: goto            210
        //   207: ldc_w           1143373099
        //   210: ldc_w           -196306698
        //   213: ixor           
        //   214: lookupswitch {
        //          -1335171619: 240
        //          -75966776: 207
        //          default: 1079
        //        }
        //   240: getfield        dev/nuker/pyro/f9d.c:Ljava/util/LinkedList;
        //   243: dup            
        //   244: astore          4
        //   246: monitorenter   
        //   247: aload_0        
        //   248: getstatic       dev/nuker/pyro/fc.c:I
        //   251: ifge            260
        //   254: ldc_w           1074845785
        //   257: goto            263
        //   260: ldc_w           -428298227
        //   263: ldc_w           -230614785
        //   266: ixor           
        //   267: lookupswitch {
        //          -1303265114: 260
        //          339323122: 292
        //          default: 1083
        //        }
        //   292: getfield        dev/nuker/pyro/f9d.c:Ljava/util/LinkedList;
        //   295: iconst_3       
        //   296: newarray        D
        //   298: dup            
        //   299: iconst_0       
        //   300: aload_0        
        //   301: getfield        dev/nuker/pyro/f9d.c:Lnet/minecraft/client/Minecraft;
        //   304: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   307: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   310: dastore        
        //   311: dup            
        //   312: iconst_1       
        //   313: getstatic       dev/nuker/pyro/fc.0:I
        //   316: ifeq            325
        //   319: ldc_w           -82931693
        //   322: goto            328
        //   325: ldc_w           -1350395306
        //   328: ldc_w           -766581475
        //   331: ixor           
        //   332: lookupswitch {
        //          692090126: 1075
        //          1167034490: 325
        //          default: 360
        //        }
        //   360: aload_0        
        //   361: getstatic       dev/nuker/pyro/fc.1:I
        //   364: ifeq            373
        //   367: ldc_w           625609160
        //   370: goto            376
        //   373: ldc_w           -917682822
        //   376: ldc_w           -1769111774
        //   379: ixor           
        //   380: lookupswitch {
        //          -1278773526: 373
        //          1606433368: 408
        //          default: 1055
        //        }
        //   408: getfield        dev/nuker/pyro/f9d.c:Lnet/minecraft/client/Minecraft;
        //   411: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   414: goto            418
        //   417: athrow         
        //   418: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   421: goto            425
        //   424: athrow         
        //   425: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
        //   428: aload_0        
        //   429: getfield        dev/nuker/pyro/f9d.c:Lnet/minecraft/client/Minecraft;
        //   432: getstatic       dev/nuker/pyro/fc.0:I
        //   435: ifeq            444
        //   438: ldc_w           937453308
        //   441: goto            447
        //   444: ldc_w           1083505027
        //   447: ldc_w           1288954893
        //   450: ixor           
        //   451: lookupswitch {
        //          1185407520: 444
        //          2066973425: 1073
        //          default: 476
        //        }
        //   476: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   479: getstatic       dev/nuker/pyro/fc.c:I
        //   482: ifge            491
        //   485: ldc_w           -1515905822
        //   488: goto            494
        //   491: ldc_w           -862565547
        //   494: ldc_w           597476829
        //   497: ixor           
        //   498: lookupswitch {
        //          -2043029185: 491
        //          -284520824: 524
        //          default: 1085
        //        }
        //   524: goto            528
        //   527: athrow         
        //   528: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70047_e:()F
        //   531: goto            535
        //   534: athrow         
        //   535: ldc             0.5
        //   537: fmul           
        //   538: f2d            
        //   539: dadd           
        //   540: dastore        
        //   541: dup            
        //   542: iconst_2       
        //   543: aload_0        
        //   544: getfield        dev/nuker/pyro/f9d.c:Lnet/minecraft/client/Minecraft;
        //   547: getstatic       dev/nuker/pyro/fc.c:I
        //   550: ifge            559
        //   553: ldc_w           2094664693
        //   556: goto            562
        //   559: ldc_w           2034879939
        //   562: ldc_w           1642359425
        //   565: ixor           
        //   566: lookupswitch {
        //          414033730: 592
        //          490627444: 559
        //          default: 1065
        //        }
        //   592: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   595: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   598: dastore        
        //   599: goto            603
        //   602: athrow         
        //   603: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   606: goto            610
        //   609: athrow         
        //   610: pop            
        //   611: aload_0        
        //   612: getfield        dev/nuker/pyro/f9d.c:Ljava/util/LinkedList;
        //   615: iconst_3       
        //   616: newarray        D
        //   618: dup            
        //   619: iconst_0       
        //   620: aload_0        
        //   621: getfield        dev/nuker/pyro/f9d.c:Lnet/minecraft/client/Minecraft;
        //   624: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   627: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   630: dastore        
        //   631: dup            
        //   632: iconst_1       
        //   633: aload_0        
        //   634: getfield        dev/nuker/pyro/f9d.c:Lnet/minecraft/client/Minecraft;
        //   637: getstatic       dev/nuker/pyro/fc.c:I
        //   640: ifge            649
        //   643: ldc_w           1085716750
        //   646: goto            652
        //   649: ldc_w           109040713
        //   652: ldc_w           -1898635210
        //   655: ixor           
        //   656: lookupswitch {
        //          -832333512: 1077
        //          683842249: 649
        //          default: 684
        //        }
        //   684: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   687: goto            691
        //   690: athrow         
        //   691: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //   694: goto            698
        //   697: athrow         
        //   698: getstatic       dev/nuker/pyro/fc.1:I
        //   701: ifeq            710
        //   704: ldc_w           583710999
        //   707: goto            713
        //   710: ldc_w           -717075747
        //   713: ldc_w           -658707819
        //   716: ixor           
        //   717: lookupswitch {
        //          -92908670: 1069
        //          1293420369: 710
        //          default: 744
        //        }
        //   744: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
        //   747: dastore        
        //   748: dup            
        //   749: iconst_2       
        //   750: aload_0        
        //   751: getfield        dev/nuker/pyro/f9d.c:Lnet/minecraft/client/Minecraft;
        //   754: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   757: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   760: dastore        
        //   761: goto            765
        //   764: athrow         
        //   765: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   768: goto            772
        //   771: athrow         
        //   772: pop            
        //   773: getstatic       dev/nuker/pyro/fc.0:I
        //   776: ifeq            785
        //   779: ldc_w           -196131441
        //   782: goto            788
        //   785: ldc_w           2062248098
        //   788: ldc_w           2069646306
        //   791: ixor           
        //   792: lookupswitch {
        //          -1894576531: 1053
        //          1580583408: 785
        //          default: 820
        //        }
        //   820: aload           4
        //   822: monitorexit    
        //   823: goto            923
        //   826: astore          5
        //   828: getstatic       dev/nuker/pyro/fc.c:I
        //   831: ifge            840
        //   834: ldc_w           -100796269
        //   837: goto            843
        //   840: ldc_w           -451797307
        //   843: ldc_w           -471341932
        //   846: ixor           
        //   847: lookupswitch {
        //          437918727: 1057
        //          1306557434: 840
        //          default: 872
        //        }
        //   872: aload           4
        //   874: monitorexit    
        //   875: getstatic       dev/nuker/pyro/fc.c:I
        //   878: ifge            887
        //   881: ldc_w           -1642602200
        //   884: goto            890
        //   887: ldc_w           -940731724
        //   890: ldc_w           1445818189
        //   893: ixor           
        //   894: lookupswitch {
        //          -1849623047: 920
        //          -935686555: 887
        //          default: 1061
        //        }
        //   920: aload           5
        //   922: athrow         
        //   923: goto            1052
        //   926: aload_0        
        //   927: getstatic       dev/nuker/pyro/fc.c:I
        //   930: ifge            939
        //   933: ldc_w           -969066542
        //   936: goto            942
        //   939: ldc_w           -1553147641
        //   942: ldc_w           467795903
        //   945: ixor           
        //   946: lookupswitch {
        //          -572733331: 1067
        //          98374146: 939
        //          default: 972
        //        }
        //   972: getfield        dev/nuker/pyro/f9d.c:Ljava/util/LinkedList;
        //   975: dup            
        //   976: getstatic       dev/nuker/pyro/fc.c:I
        //   979: ifge            988
        //   982: ldc_w           -223493084
        //   985: goto            991
        //   988: ldc_w           1596254853
        //   991: ldc_w           2007533161
        //   994: ixor           
        //   995: lookupswitch {
        //          -2063252915: 1081
        //          1528638906: 988
        //          default: 1020
        //        }
        //  1020: astore          4
        //  1022: monitorenter   
        //  1023: aload_0        
        //  1024: getfield        dev/nuker/pyro/f9d.c:Ljava/util/LinkedList;
        //  1027: goto            1031
        //  1030: athrow         
        //  1031: invokevirtual   java/util/LinkedList.clear:()V
        //  1034: goto            1038
        //  1037: athrow         
        //  1038: aload           4
        //  1040: monitorexit    
        //  1041: goto            1052
        //  1044: astore          6
        //  1046: aload           4
        //  1048: monitorexit    
        //  1049: aload           6
        //  1051: athrow         
        //  1052: return         
        //  1053: aconst_null    
        //  1054: athrow         
        //  1055: aconst_null    
        //  1056: athrow         
        //  1057: aconst_null    
        //  1058: athrow         
        //  1059: aconst_null    
        //  1060: athrow         
        //  1061: aconst_null    
        //  1062: athrow         
        //  1063: aconst_null    
        //  1064: athrow         
        //  1065: aconst_null    
        //  1066: athrow         
        //  1067: aconst_null    
        //  1068: athrow         
        //  1069: aconst_null    
        //  1070: athrow         
        //  1071: aconst_null    
        //  1072: athrow         
        //  1073: aconst_null    
        //  1074: athrow         
        //  1075: aconst_null    
        //  1076: athrow         
        //  1077: aconst_null    
        //  1078: athrow         
        //  1079: aconst_null    
        //  1080: athrow         
        //  1081: aconst_null    
        //  1082: athrow         
        //  1083: aconst_null    
        //  1084: athrow         
        //  1085: aconst_null    
        //  1086: athrow         
        //  1087: pop            
        //  1088: goto            24
        //  1091: pop            
        //  1092: aconst_null    
        //  1093: goto            1087
        //  1096: dup            
        //  1097: ifnull          1087
        //  1100: checkcast       Ljava/lang/Throwable;
        //  1103: athrow         
        //  1104: dup            
        //  1105: ifnull          1091
        //  1108: checkcast       Ljava/lang/Throwable;
        //  1111: athrow         
        //  1112: aconst_null    
        //  1113: athrow         
        //    RuntimeInvisibleTypeAnnotations: 00 02 16 01 00 00 99 00 00 16 02 00 00 99 00 00
        //    StackMapTable: 00 6F 43 07 00 B9 04 FF 00 0B 00 00 00 01 07 00 B9 FF 00 03 00 04 07 00 03 01 07 01 78 07 01 B8 00 00 4C 07 00 03 FF 00 02 00 04 07 00 03 01 07 01 78 07 01 B8 00 02 07 00 03 01 5F 07 00 03 FF 00 0D 00 04 07 00 03 01 07 01 78 07 01 B8 00 03 07 00 03 01 07 01 78 FF 00 02 00 04 07 00 03 01 07 01 78 07 01 B8 00 04 07 00 03 01 07 01 78 01 FF 00 1E 00 04 07 00 03 01 07 01 78 07 01 B8 00 03 07 00 03 01 07 01 78 FF 00 03 00 00 00 01 07 00 B9 FF 00 00 00 04 07 00 03 01 07 01 78 07 01 B8 00 04 07 00 03 01 07 01 78 07 01 B8 45 07 00 B9 00 50 07 00 03 FF 00 02 00 04 07 00 03 01 07 01 78 07 01 B8 00 02 07 00 03 01 5F 07 00 03 09 4C 07 00 03 FF 00 02 00 04 07 00 03 01 07 01 78 07 01 B8 00 02 07 00 03 01 5D 07 00 03 FF 00 13 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 01 07 00 03 FF 00 02 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 02 07 00 03 01 5C 07 00 03 FF 00 20 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 04 07 00 71 07 01 43 07 01 43 01 FF 00 02 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 01 FF 00 1F 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 04 07 00 71 07 01 43 07 01 43 01 FF 00 0C 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 07 00 03 FF 00 02 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 06 07 00 71 07 01 43 07 01 43 01 07 00 03 01 FF 00 1F 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 07 00 03 48 07 00 B9 FF 00 00 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 07 01 78 45 07 00 B9 FF 00 00 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 07 01 87 FF 00 12 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 06 07 00 71 07 01 43 07 01 43 01 03 07 00 FD FF 00 02 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 07 07 00 71 07 01 43 07 01 43 01 03 07 00 FD 01 FF 00 1C 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 06 07 00 71 07 01 43 07 01 43 01 03 07 00 FD FF 00 0E 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 06 07 00 71 07 01 43 07 01 43 01 03 07 01 78 FF 00 02 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 07 07 00 71 07 01 43 07 01 43 01 03 07 01 78 01 FF 00 1D 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 06 07 00 71 07 01 43 07 01 43 01 03 07 01 78 42 07 00 B9 FF 00 00 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 06 07 00 71 07 01 43 07 01 43 01 03 07 01 78 45 07 00 B9 FF 00 00 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 06 07 00 71 07 01 43 07 01 43 01 03 02 FF 00 17 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 07 00 FD FF 00 02 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 06 07 00 71 07 01 43 07 01 43 01 07 00 FD 01 FF 00 1D 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 07 00 FD 49 07 00 B5 FF 00 00 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 02 07 00 71 07 01 43 45 07 00 B9 40 01 FF 00 26 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 07 00 FD FF 00 02 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 06 07 00 71 07 01 43 07 01 43 01 07 00 FD 01 FF 00 1F 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 07 00 FD FF 00 05 00 00 00 01 07 00 B9 FF 00 00 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 07 01 78 45 07 00 B9 FF 00 00 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 07 01 87 FF 00 0B 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 07 01 87 FF 00 02 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 06 07 00 71 07 01 43 07 01 43 01 07 01 87 01 FF 00 1E 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 07 01 87 53 07 00 B9 FF 00 00 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 02 07 00 71 07 01 43 45 07 00 B9 40 01 0C 42 01 1F 45 07 00 B9 FC 00 0D 07 00 B9 42 01 1C 0E 42 01 1D FA 00 02 FA 00 02 4C 07 00 03 FF 00 02 00 04 07 00 03 01 07 01 78 07 01 B8 00 02 07 00 03 01 5D 07 00 03 FF 00 0F 00 04 07 00 03 01 07 01 78 07 01 B8 00 02 07 00 71 07 00 71 FF 00 02 00 04 07 00 03 01 07 01 78 07 01 B8 00 03 07 00 71 07 00 71 01 FF 00 1C 00 04 07 00 03 01 07 01 78 07 01 B8 00 02 07 00 71 07 00 71 FF 00 09 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 01 07 00 A3 40 07 00 71 45 07 00 B9 00 45 07 00 B9 07 00 FF 00 01 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 07 00 03 FC 00 01 07 00 B9 FF 00 01 00 04 07 00 03 01 07 01 78 07 01 B8 00 01 07 00 03 FD 00 01 07 00 71 07 00 B9 FF 00 01 00 04 07 00 03 01 07 01 78 07 01 B8 00 03 07 00 03 01 07 01 78 FF 00 01 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 07 00 FD FF 00 01 00 04 07 00 03 01 07 01 78 07 01 B8 00 01 07 00 03 FF 00 01 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 07 01 87 FF 00 01 00 04 07 00 03 01 07 01 78 07 01 B8 00 01 07 00 03 FF 00 01 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 06 07 00 71 07 01 43 07 01 43 01 03 07 00 FD FF 00 01 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 04 07 00 71 07 01 43 07 01 43 01 FF 00 01 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 05 07 00 71 07 01 43 07 01 43 01 07 00 FD FF 00 01 00 04 07 00 03 01 07 01 78 07 01 B8 00 01 07 00 03 FF 00 01 00 04 07 00 03 01 07 01 78 07 01 B8 00 02 07 00 71 07 00 71 FF 00 01 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 01 07 00 03 FF 00 01 00 05 07 00 03 01 07 01 78 07 01 B8 07 00 71 00 06 07 00 71 07 01 43 07 01 43 01 03 07 01 78 FF 00 01 00 04 07 00 03 01 07 01 78 07 01 B8 00 01 07 00 B9 43 05 44 07 00 B9 47 05 47 07 00 B9
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  247    690    826    1063   Any
        //  691    823    826    1063   Any
        //  826    875    826    1063   Any
        //  1023   1041   1044   1052   Any
        //  1044   1049   1044   1052   Any
        //  8      20     1096   1104   Any
        //  1096   1104   1096   1104   Ljava/lang/IllegalStateException;
        //  1112   1114   3      8      Any
        //  125    131    131    132    Any
        //  125    131    3      8      Any
        //  125    131    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  125    131    3      8      Any
        //  125    131    3      8      Ljava/util/ConcurrentModificationException;
        //  417    424    424    425    Any
        //  417    424    424    425    Ljava/lang/EnumConstantNotPresentException;
        //  417    424    3      8      Any
        //  417    424    417    418    Any
        //  417    424    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  527    534    534    535    Any
        //  527    534    527    528    Any
        //  528    534    527    528    Any
        //  527    534    3      8      Ljava/lang/RuntimeException;
        //  528    534    534    535    Any
        //  602    609    609    610    Any
        //  602    609    3      8      Any
        //  602    609    3      8      Ljava/util/NoSuchElementException;
        //  603    609    602    603    Ljava/util/NoSuchElementException;
        //  602    609    602    603    Ljava/lang/StringIndexOutOfBoundsException;
        //  691    697    697    698    Any
        //  691    697    3      8      Any
        //  691    697    3      8      Ljava/lang/ClassCastException;
        //  691    697    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  691    697    3      8      Any
        //  764    771    771    772    Any
        //  764    771    764    765    Ljava/lang/ArithmeticException;
        //  765    771    3      8      Any
        //  765    771    3      8      Any
        //  764    771    764    765    Any
        //  1030   1037   1037   1038   Any
        //  1031   1037   3      8      Any
        //  1030   1037   1037   1038   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1031   1037   1030   1031   Ljava/util/NoSuchElementException;
        //  1030   1037   1037   1038   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 91 out of bounds for length 91
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
}
