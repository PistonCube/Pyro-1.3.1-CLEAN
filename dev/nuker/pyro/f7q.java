// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import org.jetbrains.annotations.NotNull;

public class f7q extends fH
{
    @NotNull
    public f0a c;
    @NotNull
    public f0d c;
    @NotNull
    public f0a 0;
    
    public f7q() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifge            11
        //     6: ldc             -2034615009
        //     8: goto            13
        //    11: ldc             1135724129
        //    13: ldc             2124454235
        //    15: ixor           
        //    16: lookupswitch {
        //          -132471740: 560
        //          1417413349: 11
        //          default: 44
        //        }
        //    44: aload_0        
        //    45: ldc             "\u220d\u149d\u8b15\ub3d0\uc953\uec17\ub227\ue723\ud966\ue920\ua6dc\u1e43\ue004"
        //    47: getstatic       dev/nuker/pyro/fc.c:I
        //    50: ifge            58
        //    53: ldc             606400671
        //    55: goto            60
        //    58: ldc             -824293586
        //    60: ldc             901489128
        //    62: ixor           
        //    63: lookupswitch {
        //          295653751: 558
        //          1670266326: 58
        //          default: 88
        //        }
        //    88: invokestatic    invokestatic   !!! ERROR
        //    91: ldc             "\u222d\u149d\u8b15\ub3d0\uc953\uec17\ub207\ue723\ud966\ue920\ua6dc\u1e43\ue004"
        //    93: invokestatic    invokestatic   !!! ERROR
        //    96: ldc             "\u2229\u149f\u8b0d\ub3d6\uc950\uec1d\ub264\ue735\ud967\ue921\ua68e\u1e58\ue007\uc5e7\u81b0\u889a\u57aa\u76fd\ubd2f\uc087\u2af6\uc27b\u6be9\u2d59\ud744\u347e\u7d2e\u8851\u805d\u8c53\u854c\ufb3d\u7130\u9a1d\u1b04\uf096\u496f\u89cd\uca87\uffad\ub734\u41b3\ub814\ub344\u4cf0\u8b10\u7c68\ucfda\u7d0e\uea51\ue739\u16cc\uefb2\u3781\u463b\ue000\u0a57\u873c\u1995\u0fd5\u76f4\u7289\uc602\ubbb6\u9a5c"
        //    98: getstatic       dev/nuker/pyro/fc.c:I
        //   101: ifge            109
        //   104: ldc             -1766187120
        //   106: goto            111
        //   109: ldc             -508888471
        //   111: ldc             -612952232
        //   113: ixor           
        //   114: lookupswitch {
        //          1305282760: 568
        //          2080721390: 109
        //          default: 140
        //        }
        //   140: invokestatic    invokestatic   !!! ERROR
        //   143: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   146: aload_0        
        //   147: aload_0        
        //   148: new             Ldev/nuker/pyro/f0a;
        //   151: dup            
        //   152: ldc             "\u220b\u149c\u8b0f\ub3cd\uc955\uec01\ub228"
        //   154: invokestatic    invokestatic   !!! ERROR
        //   157: ldc             "\u222b\u149c\u8b0f\ub3cd\uc955\uec01\ub228"
        //   159: invokestatic    invokestatic   !!! ERROR
        //   162: aconst_null    
        //   163: iconst_1       
        //   164: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   167: checkcast       Ldev/nuker/pyro/f0n;
        //   170: invokevirtual   dev/nuker/pyro/f7q.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   173: checkcast       Ldev/nuker/pyro/f0a;
        //   176: getstatic       dev/nuker/pyro/fc.1:I
        //   179: ifeq            187
        //   182: ldc             -303431178
        //   184: goto            189
        //   187: ldc             -1591882187
        //   189: ldc             -18536642
        //   191: ixor           
        //   192: lookupswitch {
        //          319760072: 187
        //          1610148107: 220
        //          default: 554
        //        }
        //   220: putfield        dev/nuker/pyro/f7q.c:Ldev/nuker/pyro/f0a;
        //   223: aload_0        
        //   224: aload_0        
        //   225: new             Ldev/nuker/pyro/f0d;
        //   228: dup            
        //   229: ldc             "\u2202\u1486\u8b0c\ub3c9\uc974\uec1a\ub236\ue729\ud966\ue933\ua6da\u1e44"
        //   231: getstatic       dev/nuker/pyro/fc.0:I
        //   234: ifeq            242
        //   237: ldc             581858544
        //   239: goto            244
        //   242: ldc             1544114794
        //   244: ldc             436628188
        //   246: ixor           
        //   247: lookupswitch {
        //          950541868: 242
        //          1175402678: 272
        //          default: 562
        //        }
        //   272: invokestatic    invokestatic   !!! ERROR
        //   275: ldc             "\u2222\u1486\u8b0c\ub3c9\uc974\uec1a\ub236\ue729\ud966\ue933\ua6da\u1e44"
        //   277: invokestatic    invokestatic   !!! ERROR
        //   280: aconst_null    
        //   281: dconst_1       
        //   282: dconst_0       
        //   283: dconst_1       
        //   284: dconst_0       
        //   285: bipush          64
        //   287: aconst_null    
        //   288: getstatic       dev/nuker/pyro/fc.1:I
        //   291: ifeq            299
        //   294: ldc             -172379486
        //   296: goto            301
        //   299: ldc             -1191405263
        //   301: ldc             -1832941377
        //   303: ixor           
        //   304: lookupswitch {
        //          1728461341: 566
        //          1916129793: 299
        //          default: 332
        //        }
        //   332: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   335: checkcast       Ldev/nuker/pyro/f0n;
        //   338: invokevirtual   dev/nuker/pyro/f7q.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   341: checkcast       Ldev/nuker/pyro/f0d;
        //   344: getstatic       dev/nuker/pyro/fc.c:I
        //   347: ifge            355
        //   350: ldc             1238527496
        //   352: goto            357
        //   355: ldc             -1219964931
        //   357: ldc             1744940146
        //   359: ixor           
        //   360: lookupswitch {
        //          -548838513: 388
        //          567526010: 355
        //          default: 570
        //        }
        //   388: putfield        dev/nuker/pyro/f7q.c:Ldev/nuker/pyro/f0d;
        //   391: aload_0        
        //   392: aload_0        
        //   393: new             Ldev/nuker/pyro/f0a;
        //   396: dup            
        //   397: ldc             "\u2206\u149c\u8b31\ub3d0\uc940\uec2f\ub20d"
        //   399: getstatic       dev/nuker/pyro/fc.c:I
        //   402: ifge            410
        //   405: ldc             -981246392
        //   407: goto            412
        //   410: ldc             659639457
        //   412: ldc             -510950435
        //   414: ixor           
        //   415: lookupswitch {
        //          -835972095: 410
        //          604560789: 552
        //          default: 440
        //        }
        //   440: invokestatic    invokestatic   !!! ERROR
        //   443: ldc             "\u2226\u149c\u8b41\ub3e9\uc94e\uec09\ub264\ue70d\ud941"
        //   445: invokestatic    invokestatic   !!! ERROR
        //   448: aconst_null    
        //   449: iconst_1       
        //   450: getstatic       dev/nuker/pyro/fc.1:I
        //   453: ifeq            461
        //   456: ldc             2062992550
        //   458: goto            463
        //   461: ldc             78558644
        //   463: ldc             2133994560
        //   465: ixor           
        //   466: lookupswitch {
        //          96790758: 556
        //          326034680: 461
        //          default: 492
        //        }
        //   492: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   495: checkcast       Ldev/nuker/pyro/f0n;
        //   498: invokevirtual   dev/nuker/pyro/f7q.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   501: checkcast       Ldev/nuker/pyro/f0a;
        //   504: getstatic       dev/nuker/pyro/fc.1:I
        //   507: ifeq            515
        //   510: ldc             -1887365380
        //   512: goto            517
        //   515: ldc             1302431030
        //   517: ldc             -2092193685
        //   519: ixor           
        //   520: lookupswitch {
        //          214613655: 564
        //          860882840: 515
        //          default: 548
        //        }
        //   548: putfield        dev/nuker/pyro/f7q.0:Ldev/nuker/pyro/f0a;
        //   551: return         
        //   552: aconst_null    
        //   553: athrow         
        //   554: aconst_null    
        //   555: athrow         
        //   556: aconst_null    
        //   557: athrow         
        //   558: aconst_null    
        //   559: athrow         
        //   560: aconst_null    
        //   561: athrow         
        //   562: aconst_null    
        //   563: athrow         
        //   564: aconst_null    
        //   565: athrow         
        //   566: aconst_null    
        //   567: athrow         
        //   568: aconst_null    
        //   569: athrow         
        //   570: aconst_null    
        //   571: athrow         
        //    StackMapTable: 00 28 0B 41 01 1E FF 00 0D 00 01 06 00 02 06 07 00 65 FF 00 01 00 01 06 00 03 06 07 00 65 01 FF 00 1B 00 01 06 00 02 06 07 00 65 FF 00 14 00 01 06 00 04 06 07 00 65 07 00 65 07 00 65 FF 00 01 00 01 06 00 05 06 07 00 65 07 00 65 07 00 65 01 FF 00 1C 00 01 06 00 04 06 07 00 65 07 00 65 07 00 65 FF 00 2E 00 01 07 00 03 00 02 07 00 03 07 00 2A FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 2A 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 2A FF 00 15 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 E1 08 00 E1 07 00 65 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 E1 08 00 E1 07 00 65 01 FF 00 1B 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 E1 08 00 E1 07 00 65 FF 00 1A 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 00 E1 08 00 E1 07 00 65 07 00 65 05 03 03 03 03 01 05 FF 00 01 00 01 07 00 03 00 0E 07 00 03 07 00 03 08 00 E1 08 00 E1 07 00 65 07 00 65 05 03 03 03 03 01 05 01 FF 00 1E 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 00 E1 08 00 E1 07 00 65 07 00 65 05 03 03 03 03 01 05 FF 00 16 00 01 07 00 03 00 02 07 00 03 07 00 40 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 40 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 40 FF 00 15 00 01 07 00 03 00 05 07 00 03 07 00 03 08 01 89 08 01 89 07 00 65 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 89 08 01 89 07 00 65 01 FF 00 1B 00 01 07 00 03 00 05 07 00 03 07 00 03 08 01 89 08 01 89 07 00 65 FF 00 14 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 89 08 01 89 07 00 65 07 00 65 05 01 FF 00 01 00 01 07 00 03 00 09 07 00 03 07 00 03 08 01 89 08 01 89 07 00 65 07 00 65 05 01 01 FF 00 1C 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 89 08 01 89 07 00 65 07 00 65 05 01 FF 00 16 00 01 07 00 03 00 02 07 00 03 07 00 2A FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 2A 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 2A FF 00 03 00 01 07 00 03 00 05 07 00 03 07 00 03 08 01 89 08 01 89 07 00 65 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 2A FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 89 08 01 89 07 00 65 07 00 65 05 01 FF 00 01 00 01 06 00 02 06 07 00 65 01 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 E1 08 00 E1 07 00 65 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 2A FF 00 01 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 00 E1 08 00 E1 07 00 65 07 00 65 05 03 03 03 03 01 05 FF 00 01 00 01 06 00 04 06 07 00 65 07 00 65 07 00 65 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 40
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
    
    @NotNull
    public f0a 1() {
        return fbS.Q(this, 908707515);
    }
    
    @NotNull
    public f0d 0() {
        return fbS.g9(this, 890863958);
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
        //     4: ifnull          320
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            312
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            304
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_0        
        //    27: getfield        dev/nuker/pyro/f7q.c:Lnet/minecraft/client/Minecraft;
        //    30: getstatic       dev/nuker/pyro/fc.1:I
        //    33: ifeq            41
        //    36: ldc             -1067159211
        //    38: goto            43
        //    41: ldc             -1478595361
        //    43: ldc             -1770690536
        //    45: ixor           
        //    46: lookupswitch {
        //          -696292818: 41
        //          1443961165: 293
        //          default: 72
        //        }
        //    72: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    75: dup            
        //    76: pop            
        //    77: goto            81
        //    80: athrow         
        //    81: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_110317_t:()Z
        //    84: goto            88
        //    87: athrow         
        //    88: ifeq            290
        //    91: aload_0        
        //    92: getstatic       dev/nuker/pyro/fc.c:I
        //    95: ifge            103
        //    98: ldc             -1978788411
        //   100: goto            105
        //   103: ldc             1769267764
        //   105: ldc             1739495064
        //   107: ixor           
        //   108: lookupswitch {
        //          -308247715: 291
        //          900371931: 103
        //          default: 136
        //        }
        //   136: getfield        dev/nuker/pyro/f7q.c:Ldev/nuker/pyro/f0d;
        //   139: goto            143
        //   142: athrow         
        //   143: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   146: goto            150
        //   149: athrow         
        //   150: checkcast       Ljava/lang/Number;
        //   153: goto            157
        //   156: athrow         
        //   157: invokevirtual   java/lang/Number.doubleValue:()D
        //   160: goto            164
        //   163: athrow         
        //   164: dconst_0       
        //   165: dcmpl          
        //   166: ifle            174
        //   169: ldc             -987570145
        //   171: goto            176
        //   174: ldc             -987570146
        //   176: ldc             853864921
        //   178: ixor           
        //   179: tableswitch {
        //          -276028532: 200
        //          -276028531: 290
        //          default: 169
        //        }
        //   200: aload_0        
        //   201: getfield        dev/nuker/pyro/f7q.c:Lnet/minecraft/client/Minecraft;
        //   204: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   207: dup            
        //   208: ifnonnull       216
        //   211: ldc             1686128241
        //   213: goto            218
        //   216: ldc             1686128240
        //   218: ldc             1547998963
        //   220: ixor           
        //   221: tableswitch {
        //          1904845060: 244
        //          1904845061: 273
        //          default: 211
        //        }
        //   244: new             Lkotlin/TypeCastException;
        //   247: dup            
        //   248: ldc             "\u2206\u1486\u8b0d\ub1c4\ucf36\uec0d\ub225\ue722\udb77\uef0a\ua6da\u1e0c\ue00a\uc7b3\u87c2\u8896\u57a5\u76fa\ubf38\uc6f9\u2aee\uc234\u6ba1\u2f49\ud168\u3463\u7d66\u884c\u8215\u8a2e\u8544\ufb72\u712a\u981e\u1d20\uf08a\u493c\u8989\uc892\uf984\ub77e\u41fd\ub80d\ub152\u4ac5\u8b0f\u7c27\ucfd9\u7f46\uec65\ue73f\u1696\uefb7\u3596\u4007\ue01d\u0a19\u8773\u1be1\u09f9\u76e1\u7284\uc612\ub9b2\u9c58\u6bf1\ue2e7\ud1c1\ua739\u236a\u886d\u4f91\u8abc\u161a\ua562\u7127\u55b5\u1d9c\u63d1\u173d"
        //   250: goto            254
        //   253: athrow         
        //   254: invokestatic    invokestatic   !!! ERROR
        //   257: goto            261
        //   260: athrow         
        //   261: goto            265
        //   264: athrow         
        //   265: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   268: goto            272
        //   271: athrow         
        //   272: athrow         
        //   273: checkcast       Ldev/nuker/pyro/mixin/EntityPlayerSPAccessor;
        //   276: fconst_1       
        //   277: goto            281
        //   280: athrow         
        //   281: invokeinterface dev/nuker/pyro/mixin/EntityPlayerSPAccessor.setHorseJumpPower:(F)V
        //   286: goto            290
        //   289: athrow         
        //   290: return         
        //   291: aconst_null    
        //   292: athrow         
        //   293: aconst_null    
        //   294: athrow         
        //   295: pop            
        //   296: goto            24
        //   299: pop            
        //   300: aconst_null    
        //   301: goto            295
        //   304: dup            
        //   305: ifnull          295
        //   308: checkcast       Ljava/lang/Throwable;
        //   311: athrow         
        //   312: dup            
        //   313: ifnull          299
        //   316: checkcast       Ljava/lang/Throwable;
        //   319: athrow         
        //   320: aconst_null    
        //   321: athrow         
        //    StackMapTable: 00 32 43 07 00 8A 04 FF 00 0B 00 00 00 01 07 00 8A FD 00 03 07 00 03 07 00 BE 50 07 00 92 FF 00 01 00 02 07 00 03 07 00 BE 00 02 07 00 92 01 5C 07 00 92 47 07 00 8A 40 07 00 98 45 07 00 8A 40 01 4E 07 00 03 FF 00 01 00 02 07 00 03 07 00 BE 00 02 07 00 03 01 5E 07 00 03 45 07 00 7E 40 07 00 40 45 07 00 8A 40 07 00 C0 FF 00 05 00 00 00 01 07 00 8A FF 00 00 00 02 07 00 03 07 00 BE 00 01 07 00 A5 45 07 00 8A 40 03 04 04 41 01 17 4A 07 00 98 44 07 00 98 FF 00 01 00 02 07 00 03 07 00 BE 00 02 07 00 98 01 59 07 00 98 FF 00 08 00 00 00 01 07 00 8A FF 00 00 00 02 07 00 03 07 00 BE 00 04 07 00 98 08 00 F4 08 00 F4 07 00 65 45 07 00 8A FF 00 00 00 02 07 00 03 07 00 BE 00 04 07 00 98 08 00 F4 08 00 F4 07 00 65 42 07 00 8A FF 00 00 00 02 07 00 03 07 00 BE 00 04 07 00 98 08 00 F4 08 00 F4 07 00 65 45 07 00 8A FF 00 00 00 02 07 00 03 07 00 BE 00 02 07 00 98 07 00 B1 40 07 00 98 46 07 00 8A FF 00 00 00 02 07 00 03 07 00 BE 00 02 07 00 B8 02 47 07 00 8A 00 40 07 00 03 41 07 00 92 41 07 00 8A 43 05 44 07 00 8A 47 05 47 07 00 8A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     304    312    Any
        //  304    312    304    312    Ljava/util/ConcurrentModificationException;
        //  320    322    3      8      Ljava/lang/RuntimeException;
        //  80     87     87     88     Any
        //  80     87     80     81     Any
        //  80     87     80     81     Any
        //  80     87     80     81     Any
        //  80     87     80     81     Any
        //  142    149    149    150    Any
        //  143    149    149    150    Ljava/lang/NullPointerException;
        //  143    149    149    150    Any
        //  143    149    142    143    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  143    149    149    150    Any
        //  157    163    163    164    Any
        //  157    163    163    164    Ljava/util/NoSuchElementException;
        //  157    163    163    164    Ljava/lang/EnumConstantNotPresentException;
        //  157    163    163    164    Any
        //  157    163    163    164    Ljava/lang/NumberFormatException;
        //  254    260    260    261    Any
        //  254    260    260    261    Ljava/lang/ArithmeticException;
        //  254    260    3      8      Any
        //  254    260    260    261    Any
        //  254    260    260    261    Ljava/lang/AssertionError;
        //  264    271    271    272    Any
        //  264    271    264    265    Any
        //  264    271    271    272    Any
        //  264    271    264    265    Ljava/lang/NullPointerException;
        //  265    271    3      8      Ljava/lang/AssertionError;
        //  280    289    289    290    Any
        //  280    289    280    281    Any
        //  280    289    289    290    Any
        //  281    289    289    290    Any
        //  280    289    3      8      Any
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
    
    static {
        throw t;
    }
    
    @NotNull
    public f0a c() {
        return fbS.u(this, 1112240731);
    }
}
