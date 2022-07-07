// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import net.minecraft.client.gui.GuiButton;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiScreen;

@SideOnly(Side.CLIENT)
public class f3u extends GuiScreen
{
    public List<String> c;
    @NotNull
    public GuiScreen c;
    
    public void func_146284_a(@NotNull final GuiButton guiButton) {
        fbS.6T(this, 1370346020, guiButton);
    }
    
    public void func_73866_w_() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          540
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            532
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            524
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             -981469042
        //    32: goto            37
        //    35: ldc             -1061628355
        //    37: ldc             -1916599704
        //    39: ixor           
        //    40: lookupswitch {
        //          1220344550: 35
        //          1299960917: 68
        //          default: 503
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f3u.field_146292_n:Ljava/util/List;
        //    72: new             Lnet/minecraft/client/gui/GuiOptionButton;
        //    75: dup            
        //    76: iconst_0       
        //    77: aload_0        
        //    78: getfield        dev/nuker/pyro/f3u.field_146294_l:I
        //    81: iconst_2       
        //    82: idiv           
        //    83: sipush          155
        //    86: isub           
        //    87: bipush          80
        //    89: iadd           
        //    90: aload_0        
        //    91: getfield        dev/nuker/pyro/f3u.field_146295_m:I
        //    94: bipush          6
        //    96: idiv           
        //    97: bipush          110
        //    99: iadd           
        //   100: ldc             "\u23af\u14b8"
        //   102: getstatic       dev/nuker/pyro/fc.0:I
        //   105: ifeq            113
        //   108: ldc             -1710089754
        //   110: goto            115
        //   113: ldc             897401549
        //   115: ldc             -1130586821
        //   117: ixor           
        //   118: lookupswitch {
        //          646874333: 509
        //          1522588579: 113
        //          default: 144
        //        }
        //   144: goto            148
        //   147: athrow         
        //   148: invokestatic    invokestatic   !!! ERROR
        //   151: goto            155
        //   154: athrow         
        //   155: goto            159
        //   158: athrow         
        //   159: invokespecial   net/minecraft/client/gui/GuiOptionButton.<init>:(IIILjava/lang/String;)V
        //   162: goto            166
        //   165: athrow         
        //   166: goto            170
        //   169: athrow         
        //   170: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   175: goto            179
        //   178: athrow         
        //   179: pop            
        //   180: aload_0        
        //   181: getfield        dev/nuker/pyro/f3u.c:Ljava/util/List;
        //   184: goto            188
        //   187: athrow         
        //   188: invokeinterface java/util/List.clear:()V
        //   193: goto            197
        //   196: athrow         
        //   197: aload_0        
        //   198: getfield        dev/nuker/pyro/f3u.c:Ljava/util/List;
        //   201: aload_0        
        //   202: getfield        dev/nuker/pyro/f3u.field_146289_q:Lnet/minecraft/client/gui/FontRenderer;
        //   205: ldc             "\u23b4\u149b\u8a9c\u058d\u1bff\ued83\ub222\ue6b5\u6f69\u3b84\ua752\u1e0c\ue1b7\u7386\u5326\u895d\u5786\u7778\u0b27\u1230\u2b32\uc232\u6a6a\u9b02\u05d8\u35ec\u7d2c\u89d2\u3611\u5eef\u84e3\ufb3d\u70a8\u2c16\uc9af\uf108\u4970\u885b\u7cd2\u2d26\ub6b7\u41e6\ub9c0\u055f\u9e4c\u8a9b\u7c29\uce52\ucb52\u38fb\ue6b6\u16df\uee27\u81da\u949b\ue188\u0a57\u86ac\uafcf\udd3a\u7769\u7285\uc79b\u0dee\u48e8\u6a7c\ue2e8\ud045\u133a\uf7e7\u89d7\u4fa7\u8b11\ua25c\u71e3\u70ba\u55b2\u1c1e\ud7d4\uc3ac\u880a\u0576\uf8b8\u9061\ucb23\ub999\u7cb6"
        //   207: goto            211
        //   210: athrow         
        //   211: invokestatic    invokestatic   !!! ERROR
        //   214: goto            218
        //   217: athrow         
        //   218: aload_0        
        //   219: getstatic       dev/nuker/pyro/fc.1:I
        //   222: ifeq            230
        //   225: ldc             1976973376
        //   227: goto            232
        //   230: ldc             -1613533717
        //   232: ldc             -810395042
        //   234: ixor           
        //   235: lookupswitch {
        //          -1167826402: 511
        //          -937419872: 230
        //          default: 260
        //        }
        //   260: getfield        dev/nuker/pyro/f3u.field_146294_l:I
        //   263: bipush          50
        //   265: isub           
        //   266: getstatic       dev/nuker/pyro/fc.c:I
        //   269: ifge            277
        //   272: ldc             376972844
        //   274: goto            279
        //   277: ldc             2066832786
        //   279: ldc             -2058699669
        //   281: ixor           
        //   282: lookupswitch {
        //          -1825400249: 277
        //          -25435655: 308
        //          default: 513
        //        }
        //   308: goto            312
        //   311: athrow         
        //   312: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78271_c:(Ljava/lang/String;I)Ljava/util/List;
        //   315: goto            319
        //   318: athrow         
        //   319: dup            
        //   320: pop            
        //   321: checkcast       Ljava/util/Collection;
        //   324: goto            328
        //   327: athrow         
        //   328: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   333: goto            337
        //   336: athrow         
        //   337: pop            
        //   338: aload_0        
        //   339: getfield        dev/nuker/pyro/f3u.c:Ljava/util/List;
        //   342: ldc             ""
        //   344: getstatic       dev/nuker/pyro/fc.1:I
        //   347: ifeq            355
        //   350: ldc             2102601927
        //   352: goto            357
        //   355: ldc             1792039356
        //   357: ldc             544722231
        //   359: ixor           
        //   360: lookupswitch {
        //          1252496523: 388
        //          1562699248: 355
        //          default: 505
        //        }
        //   388: goto            392
        //   391: athrow         
        //   392: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   397: goto            401
        //   400: athrow         
        //   401: pop            
        //   402: getstatic       dev/nuker/pyro/fc.0:I
        //   405: ifeq            413
        //   408: ldc             842065549
        //   410: goto            415
        //   413: ldc             2110006667
        //   415: ldc             -528245391
        //   417: ixor           
        //   418: lookupswitch {
        //          -1656243974: 444
        //          -759989252: 413
        //          default: 507
        //        }
        //   444: aload_0        
        //   445: getfield        dev/nuker/pyro/f3u.c:Ljava/util/List;
        //   448: aload_0        
        //   449: getfield        dev/nuker/pyro/f3u.field_146289_q:Lnet/minecraft/client/gui/FontRenderer;
        //   452: ldc             "\u23b4\u149b\u8a9c\u058d\u1bff\ued83\ub222\ue6b5\u6f69\u3b84\ua752\u1e0c\ue193\u73bb\u530e\u8909\u57e4\u7761\u0b3b\u1231\u2b74\uc232\u6a61\u9b02\u05e3\u35f6\u7d6b\u899e\u364b\u5eef\u84f9\ufb3d\u70b3\u2c42\uc9be\uf106\u4972\u8855\u7c91\u2d17\ub6b9\u41fd\ub987\u0559\u9e0d\u8a9c\u7c7d\uce11\ucb4f\u38e9\ue6b1\u16d6\uee25\u81da\u94d6\ue18c\u0a05\u86a0\uafc7\udd73\u7765"
        //   454: goto            458
        //   457: athrow         
        //   458: invokestatic    invokestatic   !!! ERROR
        //   461: goto            465
        //   464: athrow         
        //   465: aload_0        
        //   466: getfield        dev/nuker/pyro/f3u.field_146294_l:I
        //   469: bipush          50
        //   471: isub           
        //   472: goto            476
        //   475: athrow         
        //   476: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78271_c:(Ljava/lang/String;I)Ljava/util/List;
        //   479: goto            483
        //   482: athrow         
        //   483: dup            
        //   484: pop            
        //   485: checkcast       Ljava/util/Collection;
        //   488: goto            492
        //   491: athrow         
        //   492: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   497: goto            501
        //   500: athrow         
        //   501: pop            
        //   502: return         
        //   503: aconst_null    
        //   504: athrow         
        //   505: aconst_null    
        //   506: athrow         
        //   507: aconst_null    
        //   508: athrow         
        //   509: aconst_null    
        //   510: athrow         
        //   511: aconst_null    
        //   512: athrow         
        //   513: aconst_null    
        //   514: athrow         
        //   515: pop            
        //   516: goto            24
        //   519: pop            
        //   520: aconst_null    
        //   521: goto            515
        //   524: dup            
        //   525: ifnull          515
        //   528: checkcast       Ljava/lang/Throwable;
        //   531: athrow         
        //   532: dup            
        //   533: ifnull          519
        //   536: checkcast       Ljava/lang/Throwable;
        //   539: athrow         
        //   540: aconst_null    
        //   541: athrow         
        //    StackMapTable: 00 4D 43 07 00 39 04 FF 00 0B 00 00 00 01 07 00 39 FC 00 03 07 00 03 0A 41 01 1E FF 00 2C 00 01 07 00 03 00 07 07 00 5A 08 00 48 08 00 48 01 01 01 07 00 89 FF 00 01 00 01 07 00 03 00 08 07 00 5A 08 00 48 08 00 48 01 01 01 07 00 89 01 FF 00 1C 00 01 07 00 03 00 07 07 00 5A 08 00 48 08 00 48 01 01 01 07 00 89 FF 00 02 00 00 00 01 07 00 39 FF 00 00 00 01 07 00 03 00 07 07 00 5A 08 00 48 08 00 48 01 01 01 07 00 89 45 07 00 39 FF 00 00 00 01 07 00 03 00 07 07 00 5A 08 00 48 08 00 48 01 01 01 07 00 89 42 07 00 23 FF 00 00 00 01 07 00 03 00 07 07 00 5A 08 00 48 08 00 48 01 01 01 07 00 89 45 07 00 39 FF 00 00 00 01 07 00 03 00 02 07 00 5A 07 00 44 42 07 00 39 FF 00 00 00 01 07 00 03 00 02 07 00 5A 07 00 44 47 07 00 39 40 01 FF 00 07 00 00 00 01 07 00 39 FF 00 00 00 01 07 00 03 00 01 07 00 5A 47 07 00 39 00 4C 07 00 39 FF 00 00 00 01 07 00 03 00 03 07 00 5A 07 00 73 07 00 89 45 07 00 39 FF 00 00 00 01 07 00 03 00 03 07 00 5A 07 00 73 07 00 89 FF 00 0B 00 01 07 00 03 00 04 07 00 5A 07 00 73 07 00 89 07 00 03 FF 00 01 00 01 07 00 03 00 05 07 00 5A 07 00 73 07 00 89 07 00 03 01 FF 00 1B 00 01 07 00 03 00 04 07 00 5A 07 00 73 07 00 89 07 00 03 FF 00 10 00 01 07 00 03 00 04 07 00 5A 07 00 73 07 00 89 01 FF 00 01 00 01 07 00 03 00 05 07 00 5A 07 00 73 07 00 89 01 01 FF 00 1C 00 01 07 00 03 00 04 07 00 5A 07 00 73 07 00 89 01 42 07 00 23 FF 00 00 00 01 07 00 03 00 04 07 00 5A 07 00 73 07 00 89 01 45 07 00 39 FF 00 00 00 01 07 00 03 00 02 07 00 5A 07 00 5A 47 07 00 39 FF 00 00 00 01 07 00 03 00 02 07 00 5A 07 00 79 47 07 00 39 40 01 FF 00 11 00 01 07 00 03 00 02 07 00 5A 07 00 89 FF 00 01 00 01 07 00 03 00 03 07 00 5A 07 00 89 01 FF 00 1E 00 01 07 00 03 00 02 07 00 5A 07 00 89 42 07 00 39 FF 00 00 00 01 07 00 03 00 02 07 00 5A 07 00 89 47 07 00 39 40 01 0B 41 01 1C 4C 07 00 23 FF 00 00 00 01 07 00 03 00 03 07 00 5A 07 00 73 07 00 89 45 07 00 39 FF 00 00 00 01 07 00 03 00 03 07 00 5A 07 00 73 07 00 89 49 07 00 1B FF 00 00 00 01 07 00 03 00 04 07 00 5A 07 00 73 07 00 89 01 45 07 00 39 FF 00 00 00 01 07 00 03 00 02 07 00 5A 07 00 5A FF 00 07 00 00 00 01 07 00 39 FF 00 00 00 01 07 00 03 00 02 07 00 5A 07 00 79 47 07 00 39 40 01 01 FF 00 01 00 01 07 00 03 00 02 07 00 5A 07 00 89 01 FF 00 01 00 01 07 00 03 00 07 07 00 5A 08 00 48 08 00 48 01 01 01 07 00 89 FF 00 01 00 01 07 00 03 00 04 07 00 5A 07 00 73 07 00 89 07 00 03 FF 00 01 00 01 07 00 03 00 04 07 00 5A 07 00 73 07 00 89 01 41 07 00 23 43 05 44 07 00 23 47 05 47 07 00 39
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     524    532    Ljava/lang/IndexOutOfBoundsException;
        //  524    532    524    532    Ljava/util/NoSuchElementException;
        //  540    542    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  148    154    154    155    Any
        //  148    154    3      8      Any
        //  148    154    154    155    Ljava/lang/UnsupportedOperationException;
        //  148    154    154    155    Ljava/lang/RuntimeException;
        //  148    154    3      8      Any
        //  158    165    165    166    Any
        //  158    165    158    159    Ljava/lang/EnumConstantNotPresentException;
        //  159    165    165    166    Ljava/lang/IllegalStateException;
        //  158    165    158    159    Ljava/lang/IndexOutOfBoundsException;
        //  158    165    158    159    Ljava/util/ConcurrentModificationException;
        //  169    178    178    179    Any
        //  169    178    169    170    Any
        //  169    178    178    179    Any
        //  169    178    169    170    Ljava/util/ConcurrentModificationException;
        //  169    178    178    179    Ljava/lang/AssertionError;
        //  188    196    196    197    Any
        //  188    196    3      8      Any
        //  188    196    196    197    Ljava/lang/RuntimeException;
        //  188    196    196    197    Any
        //  188    196    3      8      Any
        //  210    217    217    218    Any
        //  210    217    3      8      Any
        //  210    217    210    211    Any
        //  210    217    210    211    Ljava/lang/EnumConstantNotPresentException;
        //  211    217    217    218    Ljava/lang/ArithmeticException;
        //  311    318    318    319    Any
        //  311    318    3      8      Any
        //  311    318    318    319    Ljava/lang/RuntimeException;
        //  312    318    311    312    Ljava/lang/NumberFormatException;
        //  312    318    311    312    Ljava/lang/NullPointerException;
        //  327    336    336    337    Any
        //  327    336    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  328    336    3      8      Any
        //  328    336    336    337    Any
        //  328    336    327    328    Any
        //  391    400    400    401    Any
        //  391    400    400    401    Ljava/lang/NullPointerException;
        //  391    400    400    401    Ljava/lang/NullPointerException;
        //  391    400    391    392    Any
        //  392    400    391    392    Any
        //  457    464    464    465    Any
        //  457    464    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  457    464    457    458    Ljava/lang/IllegalStateException;
        //  457    464    457    458    Ljava/util/ConcurrentModificationException;
        //  458    464    3      8      Ljava/lang/RuntimeException;
        //  475    482    482    483    Any
        //  475    482    482    483    Any
        //  475    482    475    476    Ljava/lang/IndexOutOfBoundsException;
        //  475    482    482    483    Ljava/lang/NullPointerException;
        //  476    482    3      8      Ljava/lang/IllegalStateException;
        //  492    500    500    501    Any
        //  492    500    500    501    Any
        //  492    500    500    501    Any
        //  492    500    3      8      Any
        //  492    500    500    501    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 0], but value was: 4.
        //     at com.strobel.core.VerifyArgument.inRange(VerifyArgument.java:347)
        //     at com.strobel.assembler.ir.StackMappingVisitor.getStackValue(StackMappingVisitor.java:67)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:691)
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
    public GuiScreen c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: iflt            38
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            30
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getfield        dev/nuker/pyro/f3u.c:Lnet/minecraft/client/gui/GuiScreen;
        //    20: areturn        
        //    21: pop            
        //    22: goto            16
        //    25: pop            
        //    26: aconst_null    
        //    27: goto            21
        //    30: dup            
        //    31: ifnull          21
        //    34: checkcast       Ljava/lang/Throwable;
        //    37: athrow         
        //    38: dup            
        //    39: ifnull          25
        //    42: checkcast       Ljava/lang/Throwable;
        //    45: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 39 FC 00 03 07 00 03 44 07 00 39 43 05 44 07 00 39 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      12     30     38     Any
        //  30     38     30     38     Ljava/util/ConcurrentModificationException;
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
    
    static {
        throw t;
    }
    
    public void func_73863_a(final int p0, final int p1, final float p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          490
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            482
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            474
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   dev/nuker/pyro/f3u.func_146276_q_:()V
        //    32: goto            36
        //    35: athrow         
        //    36: aload_0        
        //    37: aload_0        
        //    38: getfield        dev/nuker/pyro/f3u.field_146289_q:Lnet/minecraft/client/gui/FontRenderer;
        //    41: ldc             "\u23b0\u148a\u8a8b\u9264\uead1\ueda5\ub228\ue6bd\uf8df\ucaec\ua752"
        //    43: goto            47
        //    46: athrow         
        //    47: invokestatic    invokestatic   !!! ERROR
        //    50: goto            54
        //    53: athrow         
        //    54: aload_0        
        //    55: getfield        dev/nuker/pyro/f3u.field_146294_l:I
        //    58: iconst_2       
        //    59: idiv           
        //    60: bipush          70
        //    62: iconst_m1      
        //    63: getstatic       dev/nuker/pyro/fc.1:I
        //    66: ifeq            74
        //    69: ldc             -511561870
        //    71: goto            76
        //    74: ldc             -1465926725
        //    76: ldc             1029617911
        //    78: ixor           
        //    79: lookupswitch {
        //          -1782512820: 104
        //          -589523067: 74
        //          default: 459
        //        }
        //   104: goto            108
        //   107: athrow         
        //   108: invokevirtual   dev/nuker/pyro/f3u.func_73732_a:(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;III)V
        //   111: goto            115
        //   114: athrow         
        //   115: bipush          90
        //   117: istore          4
        //   119: aload_0        
        //   120: getfield        dev/nuker/pyro/f3u.c:Ljava/util/List;
        //   123: goto            127
        //   126: athrow         
        //   127: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   132: goto            136
        //   135: athrow         
        //   136: astore          6
        //   138: aload           6
        //   140: goto            144
        //   143: athrow         
        //   144: invokeinterface java/util/Iterator.hasNext:()Z
        //   149: goto            153
        //   152: athrow         
        //   153: ifeq            439
        //   156: getstatic       dev/nuker/pyro/fc.0:I
        //   159: ifeq            167
        //   162: ldc             -337670655
        //   164: goto            169
        //   167: ldc             297521035
        //   169: ldc             601078776
        //   171: ixor           
        //   172: lookupswitch {
        //          -938723847: 167
        //          845706355: 200
        //          default: 461
        //        }
        //   200: aload           6
        //   202: goto            206
        //   205: athrow         
        //   206: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   211: goto            215
        //   214: athrow         
        //   215: checkcast       Ljava/lang/String;
        //   218: getstatic       dev/nuker/pyro/fc.1:I
        //   221: ifeq            229
        //   224: ldc             2143297706
        //   226: goto            231
        //   229: ldc             520339810
        //   231: ldc             -73507136
        //   233: ixor           
        //   234: lookupswitch {
        //          -2074182038: 229
        //          -459432030: 260
        //          default: 455
        //        }
        //   260: astore          5
        //   262: aload_0        
        //   263: getstatic       dev/nuker/pyro/fc.0:I
        //   266: ifeq            274
        //   269: ldc             -618152216
        //   271: goto            276
        //   274: ldc             -606732590
        //   276: ldc             -1222054212
        //   278: ixor           
        //   279: lookupswitch {
        //          1812942932: 274
        //          1828524142: 304
        //          default: 457
        //        }
        //   304: aload_0        
        //   305: getfield        dev/nuker/pyro/f3u.field_146289_q:Lnet/minecraft/client/gui/FontRenderer;
        //   308: new             Ljava/lang/StringBuilder;
        //   311: dup            
        //   312: goto            316
        //   315: athrow         
        //   316: invokespecial   java/lang/StringBuilder.<init>:()V
        //   319: goto            323
        //   322: athrow         
        //   323: getstatic       com/mojang/realmsclient/gui/ChatFormatting.GRAY:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   326: goto            330
        //   329: athrow         
        //   330: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   333: goto            337
        //   336: athrow         
        //   337: aload           5
        //   339: goto            343
        //   342: athrow         
        //   343: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   346: goto            350
        //   349: athrow         
        //   350: goto            354
        //   353: athrow         
        //   354: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   357: goto            361
        //   360: athrow         
        //   361: aload_0        
        //   362: getfield        dev/nuker/pyro/f3u.field_146294_l:I
        //   365: iconst_2       
        //   366: idiv           
        //   367: iload           4
        //   369: iconst_m1      
        //   370: goto            374
        //   373: athrow         
        //   374: invokevirtual   dev/nuker/pyro/f3u.func_73732_a:(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;III)V
        //   377: goto            381
        //   380: athrow         
        //   381: iload           4
        //   383: aload_0        
        //   384: getfield        dev/nuker/pyro/f3u.field_146289_q:Lnet/minecraft/client/gui/FontRenderer;
        //   387: getstatic       dev/nuker/pyro/fc.0:I
        //   390: ifeq            398
        //   393: ldc             -1324790268
        //   395: goto            400
        //   398: ldc             -218624288
        //   400: ldc             -847107192
        //   402: ixor           
        //   403: lookupswitch {
        //          1064969576: 428
        //          2089510284: 398
        //          default: 463
        //        }
        //   428: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //   431: iconst_2       
        //   432: iadd           
        //   433: iadd           
        //   434: istore          4
        //   436: goto            138
        //   439: aload_0        
        //   440: iload_1        
        //   441: iload_2        
        //   442: fload_3        
        //   443: goto            447
        //   446: athrow         
        //   447: invokespecial   net/minecraft/client/gui/GuiScreen.func_73863_a:(IIF)V
        //   450: goto            454
        //   453: athrow         
        //   454: return         
        //   455: aconst_null    
        //   456: athrow         
        //   457: aconst_null    
        //   458: athrow         
        //   459: aconst_null    
        //   460: athrow         
        //   461: aconst_null    
        //   462: athrow         
        //   463: aconst_null    
        //   464: athrow         
        //   465: pop            
        //   466: goto            24
        //   469: pop            
        //   470: aconst_null    
        //   471: goto            465
        //   474: dup            
        //   475: ifnull          465
        //   478: checkcast       Ljava/lang/Throwable;
        //   481: athrow         
        //   482: dup            
        //   483: ifnull          469
        //   486: checkcast       Ljava/lang/Throwable;
        //   489: athrow         
        //   490: aconst_null    
        //   491: athrow         
        //    StackMapTable: 00 4F 43 07 00 39 04 FF 00 0B 00 00 00 01 07 00 39 FF 00 03 00 04 07 00 03 01 01 02 00 00 FF 00 03 00 00 00 01 07 00 39 FF 00 00 00 04 07 00 03 01 01 02 00 01 07 00 03 45 07 00 39 00 49 07 00 39 FF 00 00 00 04 07 00 03 01 01 02 00 03 07 00 03 07 00 73 07 00 89 45 07 00 39 FF 00 00 00 04 07 00 03 01 01 02 00 03 07 00 03 07 00 73 07 00 89 FF 00 13 00 04 07 00 03 01 01 02 00 06 07 00 03 07 00 73 07 00 89 01 01 01 FF 00 01 00 04 07 00 03 01 01 02 00 07 07 00 03 07 00 73 07 00 89 01 01 01 01 FF 00 1B 00 04 07 00 03 01 01 02 00 06 07 00 03 07 00 73 07 00 89 01 01 01 42 07 00 39 FF 00 00 00 04 07 00 03 01 01 02 00 06 07 00 03 07 00 73 07 00 89 01 01 01 45 07 00 39 00 FF 00 0A 00 05 07 00 03 01 01 02 01 00 01 07 00 39 40 07 00 5A 47 07 00 39 40 07 00 A6 FD 00 01 00 07 00 A6 44 07 00 39 40 07 00 A6 47 07 00 39 40 01 0D 41 01 1E FF 00 04 00 00 00 01 07 00 39 FF 00 00 00 07 07 00 03 01 01 02 01 00 07 00 A6 00 01 07 00 A6 47 07 00 39 40 07 00 D6 4D 07 00 89 FF 00 01 00 07 07 00 03 01 01 02 01 00 07 00 A6 00 02 07 00 89 01 5C 07 00 89 FF 00 0D 00 07 07 00 03 01 01 02 01 07 00 89 07 00 A6 00 01 07 00 03 FF 00 01 00 07 07 00 03 01 01 02 01 07 00 89 07 00 A6 00 02 07 00 03 01 5B 07 00 03 4A 07 00 39 FF 00 00 00 07 07 00 03 01 01 02 01 07 00 89 07 00 A6 00 04 07 00 03 07 00 73 08 01 34 08 01 34 45 07 00 39 FF 00 00 00 07 07 00 03 01 01 02 01 07 00 89 07 00 A6 00 03 07 00 03 07 00 73 07 00 B9 45 07 00 39 FF 00 00 00 07 07 00 03 01 01 02 01 07 00 89 07 00 A6 00 04 07 00 03 07 00 73 07 00 B9 07 00 BD 45 07 00 39 FF 00 00 00 07 07 00 03 01 01 02 01 07 00 89 07 00 A6 00 03 07 00 03 07 00 73 07 00 B9 44 07 00 27 FF 00 00 00 07 07 00 03 01 01 02 01 07 00 89 07 00 A6 00 04 07 00 03 07 00 73 07 00 B9 07 00 89 45 07 00 39 FF 00 00 00 07 07 00 03 01 01 02 01 07 00 89 07 00 A6 00 03 07 00 03 07 00 73 07 00 B9 42 07 00 39 FF 00 00 00 07 07 00 03 01 01 02 01 07 00 89 07 00 A6 00 03 07 00 03 07 00 73 07 00 B9 45 07 00 39 FF 00 00 00 07 07 00 03 01 01 02 01 07 00 89 07 00 A6 00 03 07 00 03 07 00 73 07 00 89 4B 07 00 39 FF 00 00 00 07 07 00 03 01 01 02 01 07 00 89 07 00 A6 00 06 07 00 03 07 00 73 07 00 89 01 01 01 45 07 00 39 00 FF 00 10 00 07 07 00 03 01 01 02 01 07 00 89 07 00 A6 00 02 01 07 00 73 FF 00 01 00 07 07 00 03 01 01 02 01 07 00 89 07 00 A6 00 03 01 07 00 73 01 FF 00 1B 00 07 07 00 03 01 01 02 01 07 00 89 07 00 A6 00 02 01 07 00 73 FF 00 0A 00 07 07 00 03 01 01 02 01 00 07 00 A6 00 00 FF 00 06 00 00 00 01 07 00 39 FF 00 00 00 07 07 00 03 01 01 02 01 00 07 00 A6 00 04 07 00 03 01 01 02 45 07 00 39 00 40 07 00 89 FF 00 01 00 07 07 00 03 01 01 02 01 07 00 89 07 00 A6 00 01 07 00 03 FF 00 01 00 04 07 00 03 01 01 02 00 06 07 00 03 07 00 73 07 00 89 01 01 01 FE 00 01 01 00 07 00 A6 FF 00 01 00 07 07 00 03 01 01 02 01 07 00 89 07 00 A6 00 02 01 07 00 73 FF 00 01 00 04 07 00 03 01 01 02 00 01 07 00 23 43 05 44 07 00 23 47 05 47 07 00 39
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     474    482    Ljava/lang/IllegalStateException;
        //  474    482    474    482    Ljava/lang/IllegalArgumentException;
        //  490    492    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  29     35     35     36     Any
        //  29     35     35     36     Ljava/lang/NumberFormatException;
        //  29     35     35     36     Any
        //  29     35     3      8      Any
        //  29     35     3      8      Any
        //  46     53     53     54     Any
        //  46     53     3      8      Ljava/lang/UnsupportedOperationException;
        //  47     53     46     47     Any
        //  46     53     46     47     Any
        //  46     53     53     54     Any
        //  107    114    114    115    Any
        //  108    114    107    108    Any
        //  107    114    114    115    Any
        //  108    114    3      8      Any
        //  107    114    107    108    Ljava/lang/StringIndexOutOfBoundsException;
        //  126    135    135    136    Any
        //  127    135    135    136    Ljava/lang/EnumConstantNotPresentException;
        //  126    135    135    136    Ljava/lang/AssertionError;
        //  127    135    126    127    Any
        //  126    135    3      8      Ljava/lang/ArithmeticException;
        //  143    152    152    153    Any
        //  143    152    3      8      Ljava/lang/NullPointerException;
        //  143    152    143    144    Ljava/lang/NullPointerException;
        //  143    152    143    144    Any
        //  144    152    143    144    Any
        //  206    214    214    215    Any
        //  206    214    3      8      Any
        //  206    214    3      8      Any
        //  206    214    214    215    Ljava/lang/RuntimeException;
        //  206    214    3      8      Any
        //  315    322    322    323    Any
        //  315    322    315    316    Any
        //  316    322    3      8      Any
        //  315    322    322    323    Ljava/lang/NumberFormatException;
        //  316    322    3      8      Any
        //  329    336    336    337    Any
        //  330    336    336    337    Ljava/lang/EnumConstantNotPresentException;
        //  329    336    336    337    Any
        //  329    336    329    330    Any
        //  330    336    336    337    Ljava/util/NoSuchElementException;
        //  342    349    349    350    Any
        //  343    349    349    350    Ljava/lang/IndexOutOfBoundsException;
        //  343    349    3      8      Any
        //  343    349    3      8      Any
        //  343    349    342    343    Ljava/util/ConcurrentModificationException;
        //  353    360    360    361    Any
        //  354    360    360    361    Ljava/lang/NegativeArraySizeException;
        //  354    360    353    354    Any
        //  354    360    353    354    Any
        //  353    360    353    354    Any
        //  373    380    380    381    Any
        //  373    380    380    381    Any
        //  374    380    373    374    Any
        //  374    380    3      8      Ljava/lang/NegativeArraySizeException;
        //  373    380    3      8      Any
        //  447    453    453    454    Any
        //  447    453    453    454    Ljava/lang/ArithmeticException;
        //  447    453    3      8      Any
        //  447    453    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  447    453    3      8      Ljava/lang/IllegalArgumentException;
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
    
    public f3u(@NotNull final GuiScreen c) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.1 != 0) {
                    n = -957303843;
                    break Label_0013;
                }
                n = -2095441830;
            }
            switch (n ^ 0xF191A61) {
                case -907433540: {
                    continue;
                }
                case -1945959877: {
                    while (true) {
                        int n2 = 0;
                        Label_0060: {
                            if (fc.0 != 0) {
                                n2 = -2014046396;
                                break Label_0060;
                            }
                            n2 = 1279339782;
                        }
                        switch (n2 ^ 0x37F19787) {
                            case -1341816637: {
                                continue;
                            }
                            case 2075179649: {
                                this.c = c;
                                while (true) {
                                    int n3 = 0;
                                    Label_0110: {
                                        if (fc.c < 0) {
                                            n3 = -417118076;
                                            break Label_0110;
                                        }
                                        n3 = 1933961999;
                                    }
                                    switch (n3 ^ 0xAB0DD1A1) {
                                        case 1278122277: {
                                            continue;
                                        }
                                        case -666355026: {
                                            final ArrayList c2 = Lists.newArrayList();
                                            while (true) {
                                                int n4 = 0;
                                                Label_0161: {
                                                    if (fc.1 != 0) {
                                                        n4 = 429692866;
                                                        break Label_0161;
                                                    }
                                                    n4 = 78009068;
                                                }
                                                switch (n4 ^ 0x1BE975C1) {
                                                    case 41280003: {
                                                        continue;
                                                    }
                                                    case 525281069: {
                                                        this.c = (List<String>)c2;
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
                default: {
                    throw null;
                }
            }
            break;
        }
    }
}
