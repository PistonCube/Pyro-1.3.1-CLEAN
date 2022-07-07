// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import net.minecraft.world.World;
import net.minecraft.client.entity.EntityPlayerSP;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import java.util.function.Consumer;
import org.jetbrains.annotations.Nullable;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.util.math.BlockPos;

public class faL extends fH
{
    public f0f<faI> c;
    public f0b c;
    public f0b 0;
    public f0b 1;
    public f0b 2;
    public f0a c;
    public BlockPos c;
    public ConcurrentLinkedQueue<BlockPos> c;
    
    public static void c(final faL faL, final BlockPos c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0039:
            while (true) {
                do {
                    Label_0026: {
                        break Label_0026;
                        while (true) {
                            try {
                                o = null;
                                if (fc.1 > 0) {
                                    continue Label_0039;
                                }
                                null;
                                faL.c = c;
                                return;
                                continue;
                            }
                            catch (NullPointerException ex) {
                                if (ex != null) {
                                    throw ex;
                                }
                                continue;
                            }
                            break;
                        }
                    }
                    continue Label_0039;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    @f06
    @LauncherEventHide
    public void c(@Nullable final f3h p0) {
        public class faK implements Consumer
        {
            public faL c;
            
            @Override
            public void accept(final Object o) {
                fbS.2T(this, 1233833787, o);
            }
            
            static {
                throw t;
            }
            
            public faK(final faL c) {
                while (true) {
                    int n = 0;
                    Label_0015: {
                        if (fc.0 != 0) {
                            n = 1663450798;
                            break Label_0015;
                        }
                        n = 1541899590;
                    }
                    switch (n ^ 0xF73576C8) {
                        case 593332958: {
                            continue;
                        }
                        default: {
                            this.c = c;
                            while (true) {
                                int n2 = 0;
                                Label_0061: {
                                    if (fc.c < 0) {
                                        n2 = -1422840079;
                                        break Label_0061;
                                    }
                                    n2 = 1298782260;
                                }
                                switch (n2 ^ 0x9A64B37A) {
                                    case -674467645: {
                                        continue;
                                    }
                                    default: {
                                        return;
                                    }
                                    case 827694475: {
                                        throw null;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        case -1810675610: {
                            throw null;
                        }
                    }
                    break;
                }
            }
            
            public void c(final Boolean b) {
                fbS.3z(this, 662109149, b);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          622
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            614
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            606
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/faL.c:Ldev/nuker/pyro/f0f;
        //    28: getstatic       dev/nuker/pyro/fc.c:I
        //    31: ifge            39
        //    34: ldc             -1004588271
        //    36: goto            41
        //    39: ldc             -1400153767
        //    41: ldc             -1504042455
        //    43: ixor           
        //    44: lookupswitch {
        //          181500784: 72
        //          1648693560: 39
        //          default: 583
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //    79: goto            83
        //    82: athrow         
        //    83: checkcast       Ldev/nuker/pyro/faI;
        //    86: getstatic       dev/nuker/pyro/faI.c:Ldev/nuker/pyro/faI;
        //    89: if_acmpne       233
        //    92: aload_0        
        //    93: getfield        dev/nuker/pyro/faL.c:Lnet/minecraft/client/Minecraft;
        //    96: getstatic       dev/nuker/pyro/fc.c:I
        //    99: ifge            107
        //   102: ldc             -1859368897
        //   104: goto            109
        //   107: ldc             -1915153276
        //   109: ldc             396926389
        //   111: ixor           
        //   112: lookupswitch {
        //          -2038114934: 587
        //          -1510924807: 107
        //          default: 140
        //        }
        //   140: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //   143: getfield        net/minecraft/client/settings/GameSettings.field_74312_F:Lnet/minecraft/client/settings/KeyBinding;
        //   146: dup            
        //   147: ifnonnull       155
        //   150: ldc             -831399041
        //   152: goto            157
        //   155: ldc             -831399042
        //   157: ldc             1266930351
        //   159: ixor           
        //   160: tableswitch {
        //          199496608: 184
        //          199496609: 213
        //          default: 150
        //        }
        //   184: new             Lkotlin/TypeCastException;
        //   187: dup            
        //   188: ldc             "\u2917\u1486\u803c\ub1c4\uc425\ue71c\ub225\uec13\udb77\ue419\uadcb\u1e0c\ueb3b\uc7b3\u8cd1\u8387\u57a5\u7dcb\ubf38\ucdea\u21ff\uc234\u6090\u2f49\uda7b\u3f72\u7d66\u837d\u8215\u813d\u8e55\ufb72\u7a1b\u981e\u1633\ufb9b\u493c\u82b8\uc892\uf297\ubc6f\u41fd\ub33c\ub152\u41d6\u801e\u7c27\uc4e8\u7f46\ue776\uec2e\u1696\ue486\u3596\u4b14\ueb0c\u0a19\u8c42\u1bef\u02e1\u7dfd\u72af\ucd3e\ub9a5\u977f\u60e5\ue2e8\udaee\ua71d\u2868\u834c\u4fa4\u81bf\u160a\uae7d\u7a21"
        //   190: goto            194
        //   193: athrow         
        //   194: invokestatic    invokestatic   !!! ERROR
        //   197: goto            201
        //   200: athrow         
        //   201: goto            205
        //   204: athrow         
        //   205: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   208: goto            212
        //   211: athrow         
        //   212: athrow         
        //   213: checkcast       Ldev/nuker/pyro/mixin/KeyBindingAccessor;
        //   216: iconst_1       
        //   217: goto            221
        //   220: athrow         
        //   221: invokeinterface dev/nuker/pyro/mixin/KeyBindingAccessor.setPressed:(Z)V
        //   226: goto            230
        //   229: athrow         
        //   230: goto            582
        //   233: aload_0        
        //   234: getfield        dev/nuker/pyro/faL.c:Lnet/minecraft/util/math/BlockPos;
        //   237: getstatic       net/minecraft/util/math/BlockPos.field_177992_a:Lnet/minecraft/util/math/BlockPos;
        //   240: goto            244
        //   243: athrow         
        //   244: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   247: goto            251
        //   250: athrow         
        //   251: ifeq            582
        //   254: getstatic       dev/nuker/pyro/fc.1:I
        //   257: ifeq            265
        //   260: ldc             462415391
        //   262: goto            267
        //   265: ldc             -195510871
        //   267: ldc             1191619109
        //   269: ixor           
        //   270: lookupswitch {
        //          -1285679220: 296
        //          1552501818: 265
        //          default: 593
        //        }
        //   296: aload_0        
        //   297: getfield        dev/nuker/pyro/faL.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   300: getstatic       dev/nuker/pyro/fc.0:I
        //   303: ifeq            311
        //   306: ldc             -203100819
        //   308: goto            313
        //   311: ldc             441813239
        //   313: ldc             -784596076
        //   315: ixor           
        //   316: lookupswitch {
        //          -882275485: 344
        //          584642297: 311
        //          default: 595
        //        }
        //   344: goto            348
        //   347: athrow         
        //   348: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.isEmpty:()Z
        //   351: goto            355
        //   354: athrow         
        //   355: ifne            582
        //   358: aload_0        
        //   359: getfield        dev/nuker/pyro/faL.c:Ldev/nuker/pyro/f0a;
        //   362: goto            366
        //   365: athrow         
        //   366: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   369: goto            373
        //   372: athrow         
        //   373: checkcast       Ljava/lang/Boolean;
        //   376: goto            380
        //   379: athrow         
        //   380: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   383: goto            387
        //   386: athrow         
        //   387: ifeq            582
        //   390: aload_0        
        //   391: aload_0        
        //   392: getfield        dev/nuker/pyro/faL.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   395: goto            399
        //   398: athrow         
        //   399: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.poll:()Ljava/lang/Object;
        //   402: goto            406
        //   405: athrow         
        //   406: checkcast       Lnet/minecraft/util/math/BlockPos;
        //   409: getstatic       dev/nuker/pyro/fc.c:I
        //   412: ifge            420
        //   415: ldc             -1737716357
        //   417: goto            422
        //   420: ldc             -160472732
        //   422: ldc             -866208135
        //   424: ixor           
        //   425: lookupswitch {
        //          976344861: 452
        //          1412578050: 420
        //          default: 591
        //        }
        //   452: putfield        dev/nuker/pyro/faL.c:Lnet/minecraft/util/math/BlockPos;
        //   455: getstatic       dev/nuker/pyro/fx.c:Ldev/nuker/pyro/fx;
        //   458: aload_0        
        //   459: checkcast       Ldev/nuker/pyro/fH;
        //   462: aload_0        
        //   463: getstatic       dev/nuker/pyro/fc.1:I
        //   466: ifeq            474
        //   469: ldc             -2047175631
        //   471: goto            476
        //   474: ldc             2093346354
        //   476: ldc             691024435
        //   478: ixor           
        //   479: lookupswitch {
        //          -1396005374: 585
        //          -1099618756: 474
        //          default: 504
        //        }
        //   504: getfield        dev/nuker/pyro/faL.c:Lnet/minecraft/util/math/BlockPos;
        //   507: iconst_1       
        //   508: new             Ldev/nuker/pyro/faK;
        //   511: dup            
        //   512: getstatic       dev/nuker/pyro/fc.1:I
        //   515: ifeq            523
        //   518: ldc             -1570300301
        //   520: goto            525
        //   523: ldc             931338689
        //   525: ldc             1274303847
        //   527: ixor           
        //   528: lookupswitch {
        //          -376222956: 523
        //          2088193190: 556
        //          default: 589
        //        }
        //   556: aload_0        
        //   557: goto            561
        //   560: athrow         
        //   561: invokespecial   dev/nuker/pyro/faK.<init>:(Ldev/nuker/pyro/faL;)V
        //   564: goto            568
        //   567: athrow         
        //   568: checkcast       Ljava/util/function/Consumer;
        //   571: goto            575
        //   574: athrow         
        //   575: invokevirtual   dev/nuker/pyro/fx.c:(Ldev/nuker/pyro/fH;Lnet/minecraft/util/math/BlockPos;ZLjava/util/function/Consumer;)V
        //   578: goto            582
        //   581: athrow         
        //   582: return         
        //   583: aconst_null    
        //   584: athrow         
        //   585: aconst_null    
        //   586: athrow         
        //   587: aconst_null    
        //   588: athrow         
        //   589: aconst_null    
        //   590: athrow         
        //   591: aconst_null    
        //   592: athrow         
        //   593: aconst_null    
        //   594: athrow         
        //   595: aconst_null    
        //   596: athrow         
        //   597: pop            
        //   598: goto            24
        //   601: pop            
        //   602: aconst_null    
        //   603: goto            597
        //   606: dup            
        //   607: ifnull          597
        //   610: checkcast       Ljava/lang/Throwable;
        //   613: athrow         
        //   614: dup            
        //   615: ifnull          601
        //   618: checkcast       Ljava/lang/Throwable;
        //   621: athrow         
        //   622: aconst_null    
        //   623: athrow         
        //    StackMapTable: 00 57 43 07 00 1A 04 FF 00 0B 00 00 00 01 07 00 1A FD 00 03 07 00 03 07 00 B4 4E 07 00 45 FF 00 01 00 02 07 00 03 07 00 B4 00 02 07 00 45 01 5E 07 00 45 42 07 00 1A 40 07 00 45 45 07 00 1A 40 07 00 B6 57 07 00 56 FF 00 01 00 02 07 00 03 07 00 B4 00 02 07 00 56 01 5E 07 00 56 49 07 00 B8 44 07 00 B8 FF 00 01 00 02 07 00 03 07 00 B4 00 02 07 00 B8 01 5A 07 00 B8 48 07 00 1A FF 00 00 00 02 07 00 03 07 00 B4 00 04 07 00 B8 08 00 B8 08 00 B8 07 00 BA 45 07 00 1A FF 00 00 00 02 07 00 03 07 00 B4 00 04 07 00 B8 08 00 B8 08 00 B8 07 00 BA 42 07 00 1A FF 00 00 00 02 07 00 03 07 00 B4 00 04 07 00 B8 08 00 B8 08 00 B8 07 00 BA 45 07 00 1A FF 00 00 00 02 07 00 03 07 00 B4 00 02 07 00 B8 07 00 65 40 07 00 B8 46 07 00 1A FF 00 00 00 02 07 00 03 07 00 B4 00 02 07 00 72 01 47 07 00 1A 00 02 49 07 00 1A FF 00 00 00 02 07 00 03 07 00 B4 00 02 07 00 1E 07 00 1E 45 07 00 1A 40 01 0D 41 01 1C 4E 07 00 89 FF 00 01 00 02 07 00 03 07 00 B4 00 02 07 00 89 01 5E 07 00 89 FF 00 02 00 00 00 01 07 00 1A FF 00 00 00 02 07 00 03 07 00 B4 00 01 07 00 89 45 07 00 1A 40 01 FF 00 09 00 00 00 01 07 00 1A FF 00 00 00 02 07 00 03 07 00 B4 00 01 07 00 91 45 07 00 1A 40 07 00 B6 45 07 00 1A 40 07 00 94 45 07 00 1A 40 01 4A 07 00 1A FF 00 00 00 02 07 00 03 07 00 B4 00 02 07 00 03 07 00 89 45 07 00 1A FF 00 00 00 02 07 00 03 07 00 B4 00 02 07 00 03 07 00 B6 FF 00 0D 00 02 07 00 03 07 00 B4 00 02 07 00 03 07 00 1E FF 00 01 00 02 07 00 03 07 00 B4 00 03 07 00 03 07 00 1E 01 FF 00 1D 00 02 07 00 03 07 00 B4 00 02 07 00 03 07 00 1E FF 00 15 00 02 07 00 03 07 00 B4 00 03 07 00 9F 07 00 05 07 00 03 FF 00 01 00 02 07 00 03 07 00 B4 00 04 07 00 9F 07 00 05 07 00 03 01 FF 00 1B 00 02 07 00 03 07 00 B4 00 03 07 00 9F 07 00 05 07 00 03 FF 00 12 00 02 07 00 03 07 00 B4 00 06 07 00 9F 07 00 05 07 00 1E 01 08 01 FC 08 01 FC FF 00 01 00 02 07 00 03 07 00 B4 00 07 07 00 9F 07 00 05 07 00 1E 01 08 01 FC 08 01 FC 01 FF 00 1E 00 02 07 00 03 07 00 B4 00 06 07 00 9F 07 00 05 07 00 1E 01 08 01 FC 08 01 FC 43 07 00 2C FF 00 00 00 02 07 00 03 07 00 B4 00 07 07 00 9F 07 00 05 07 00 1E 01 08 01 FC 08 01 FC 07 00 03 45 07 00 1A FF 00 00 00 02 07 00 03 07 00 B4 00 05 07 00 9F 07 00 05 07 00 1E 01 07 00 A7 45 07 00 3A FF 00 00 00 02 07 00 03 07 00 B4 00 05 07 00 9F 07 00 05 07 00 1E 01 07 00 AF 45 07 00 1A 00 40 07 00 45 FF 00 01 00 02 07 00 03 07 00 B4 00 03 07 00 9F 07 00 05 07 00 03 41 07 00 56 FF 00 01 00 02 07 00 03 07 00 B4 00 06 07 00 9F 07 00 05 07 00 1E 01 08 01 FC 08 01 FC FF 00 01 00 02 07 00 03 07 00 B4 00 02 07 00 03 07 00 1E 01 41 07 00 89 41 07 00 1A 43 05 44 07 00 1A 47 05 47 07 00 1A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     606    614    Any
        //  606    614    606    614    Ljava/lang/IndexOutOfBoundsException;
        //  622    624    3      8      Any
        //  75     82     82     83     Any
        //  76     82     3      8      Ljava/lang/NumberFormatException;
        //  76     82     75     76     Ljava/lang/IllegalStateException;
        //  76     82     75     76     Any
        //  75     82     75     76     Any
        //  193    200    200    201    Any
        //  194    200    193    194    Ljava/util/ConcurrentModificationException;
        //  193    200    193    194    Any
        //  193    200    193    194    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  193    200    193    194    Ljava/lang/ClassCastException;
        //  204    211    211    212    Any
        //  205    211    204    205    Any
        //  205    211    211    212    Ljava/lang/NumberFormatException;
        //  204    211    3      8      Ljava/lang/RuntimeException;
        //  205    211    3      8      Ljava/lang/NegativeArraySizeException;
        //  220    229    229    230    Any
        //  220    229    220    221    Ljava/lang/NullPointerException;
        //  220    229    3      8      Ljava/lang/NumberFormatException;
        //  220    229    220    221    Ljava/lang/AssertionError;
        //  220    229    220    221    Any
        //  243    250    250    251    Any
        //  243    250    243    244    Any
        //  243    250    243    244    Ljava/lang/UnsupportedOperationException;
        //  243    250    250    251    Ljava/lang/NumberFormatException;
        //  243    250    250    251    Ljava/lang/NumberFormatException;
        //  348    354    354    355    Any
        //  348    354    354    355    Any
        //  348    354    3      8      Ljava/lang/ClassCastException;
        //  348    354    3      8      Any
        //  348    354    3      8      Any
        //  366    372    372    373    Any
        //  366    372    3      8      Any
        //  366    372    3      8      Any
        //  366    372    3      8      Any
        //  366    372    3      8      Ljava/lang/AssertionError;
        //  379    386    386    387    Any
        //  380    386    379    380    Any
        //  380    386    3      8      Any
        //  380    386    379    380    Ljava/lang/ArithmeticException;
        //  379    386    379    380    Ljava/lang/UnsupportedOperationException;
        //  398    405    405    406    Any
        //  399    405    398    399    Any
        //  398    405    398    399    Any
        //  398    405    398    399    Any
        //  399    405    3      8      Any
        //  560    567    567    568    Any
        //  561    567    567    568    Any
        //  561    567    567    568    Any
        //  560    567    560    561    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  561    567    567    568    Any
        //  574    581    581    582    Any
        //  574    581    574    575    Ljava/lang/StringIndexOutOfBoundsException;
        //  575    581    3      8      Ljava/lang/ClassCastException;
        //  574    581    3      8      Ljava/lang/ClassCastException;
        //  574    581    581    582    Ljava/lang/StringIndexOutOfBoundsException;
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
        //     4: ifnull          360
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            352
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            344
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: aload_2        
        //    27: aload_3        
        //    28: getstatic       dev/nuker/pyro/fc.0:I
        //    31: ifeq            39
        //    34: ldc             557944054
        //    36: goto            41
        //    39: ldc             -1990643175
        //    41: ldc             -1397704289
        //    43: ixor           
        //    44: lookupswitch {
        //          -1913571991: 327
        //          714397954: 39
        //          default: 72
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //    79: goto            83
        //    82: athrow         
        //    83: getstatic       dev/nuker/pyro/fc.c:I
        //    86: ifge            94
        //    89: ldc             -432668720
        //    91: goto            96
        //    94: ldc             -657418227
        //    96: ldc             1493881233
        //    98: ixor           
        //    99: lookupswitch {
        //          -2116400740: 124
        //          -1086378431: 94
        //          default: 333
        //        }
        //   124: aload_0        
        //   125: getstatic       dev/nuker/pyro/fc.1:I
        //   128: ifeq            136
        //   131: ldc             -361525816
        //   133: goto            138
        //   136: ldc             -1482425357
        //   138: ldc             -2109863946
        //   140: ixor           
        //   141: lookupswitch {
        //          1749912126: 329
        //          1871984829: 136
        //          default: 168
        //        }
        //   168: getfield        dev/nuker/pyro/faL.c:Lnet/minecraft/client/Minecraft;
        //   171: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //   174: getfield        net/minecraft/client/settings/GameSettings.field_74312_F:Lnet/minecraft/client/settings/KeyBinding;
        //   177: dup            
        //   178: ifnonnull       210
        //   181: new             Lkotlin/TypeCastException;
        //   184: dup            
        //   185: ldc             "\u2917\u1486\u803c\ub1c4\uc425\ue71c\ub225\uec13\udb77\ue419\uadcb\u1e0c\ueb3b\uc7b3\u8cd1\u8387\u57a5\u7dcb\ubf38\ucdea\u21ff\uc234\u6090\u2f49\uda7b\u3f72\u7d66\u837d\u8215\u813d\u8e55\ufb72\u7a1b\u981e\u1633\ufb9b\u493c\u82b8\uc892\uf297\ubc6f\u41fd\ub33c\ub152\u41d6\u801e\u7c27\uc4e8\u7f46\ue776\uec2e\u1696\ue486\u3596\u4b14\ueb0c\u0a19\u8c42\u1bef\u02e1\u7dfd\u72af\ucd3e\ub9a5\u977f\u60e5\ue2e8\udaee\ua71d\u2868\u834c\u4fa4\u81bf\u160a\uae7d\u7a21"
        //   187: goto            191
        //   190: athrow         
        //   191: invokestatic    invokestatic   !!! ERROR
        //   194: goto            198
        //   197: athrow         
        //   198: goto            202
        //   201: athrow         
        //   202: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   205: goto            209
        //   208: athrow         
        //   209: athrow         
        //   210: checkcast       Ldev/nuker/pyro/mixin/KeyBindingAccessor;
        //   213: iconst_0       
        //   214: goto            218
        //   217: athrow         
        //   218: invokeinterface dev/nuker/pyro/mixin/KeyBindingAccessor.setPressed:(Z)V
        //   223: goto            227
        //   226: athrow         
        //   227: aload_0        
        //   228: aload_0        
        //   229: getstatic       dev/nuker/pyro/fc.c:I
        //   232: ifge            240
        //   235: ldc             1923842147
        //   237: goto            242
        //   240: ldc             -363019915
        //   242: ldc             1637223452
        //   244: ixor           
        //   245: lookupswitch {
        //          322800767: 331
        //          574620816: 240
        //          default: 272
        //        }
        //   272: getfield        dev/nuker/pyro/faL.c:Ldev/nuker/pyro/f0f;
        //   275: goto            279
        //   278: athrow         
        //   279: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   282: goto            286
        //   285: athrow         
        //   286: checkcast       Ldev/nuker/pyro/faI;
        //   289: goto            293
        //   292: athrow         
        //   293: invokevirtual   dev/nuker/pyro/faI.toString:()Ljava/lang/String;
        //   296: goto            300
        //   299: athrow         
        //   300: goto            304
        //   303: athrow         
        //   304: invokevirtual   dev/nuker/pyro/faL.4:(Ljava/lang/String;)V
        //   307: goto            311
        //   310: athrow         
        //   311: aload_0        
        //   312: getfield        dev/nuker/pyro/faL.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   315: goto            319
        //   318: athrow         
        //   319: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.clear:()V
        //   322: goto            326
        //   325: athrow         
        //   326: return         
        //   327: aconst_null    
        //   328: athrow         
        //   329: aconst_null    
        //   330: athrow         
        //   331: aconst_null    
        //   332: athrow         
        //   333: aconst_null    
        //   334: athrow         
        //   335: pop            
        //   336: goto            24
        //   339: pop            
        //   340: aconst_null    
        //   341: goto            335
        //   344: dup            
        //   345: ifnull          335
        //   348: checkcast       Ljava/lang/Throwable;
        //   351: athrow         
        //   352: dup            
        //   353: ifnull          339
        //   356: checkcast       Ljava/lang/Throwable;
        //   359: athrow         
        //   360: aconst_null    
        //   361: athrow         
        //    StackMapTable: 00 3A 43 07 00 1A 04 FF 00 0B 00 00 00 01 07 00 1A FF 00 03 00 04 07 00 03 01 07 00 DC 07 00 DE 00 00 FF 00 0E 00 04 07 00 03 01 07 00 DC 07 00 DE 00 04 07 00 03 01 07 00 DC 07 00 DE FF 00 01 00 04 07 00 03 01 07 00 DC 07 00 DE 00 05 07 00 03 01 07 00 DC 07 00 DE 01 FF 00 1E 00 04 07 00 03 01 07 00 DC 07 00 DE 00 04 07 00 03 01 07 00 DC 07 00 DE 42 07 00 1A FF 00 00 00 04 07 00 03 01 07 00 DC 07 00 DE 00 04 07 00 03 01 07 00 DC 07 00 DE 45 07 00 1A 00 0A 41 01 1B 4B 07 00 03 FF 00 01 00 04 07 00 03 01 07 00 DC 07 00 DE 00 02 07 00 03 01 5D 07 00 03 55 07 00 1A FF 00 00 00 04 07 00 03 01 07 00 DC 07 00 DE 00 04 07 00 B8 08 00 B5 08 00 B5 07 00 BA 45 07 00 1A FF 00 00 00 04 07 00 03 01 07 00 DC 07 00 DE 00 04 07 00 B8 08 00 B5 08 00 B5 07 00 BA FF 00 02 00 00 00 01 07 00 1A FF 00 00 00 04 07 00 03 01 07 00 DC 07 00 DE 00 04 07 00 B8 08 00 B5 08 00 B5 07 00 BA 45 07 00 1A FF 00 00 00 04 07 00 03 01 07 00 DC 07 00 DE 00 02 07 00 B8 07 00 65 40 07 00 B8 46 07 00 1A FF 00 00 00 04 07 00 03 01 07 00 DC 07 00 DE 00 02 07 00 72 01 47 07 00 1A 00 FF 00 0C 00 04 07 00 03 01 07 00 DC 07 00 DE 00 02 07 00 03 07 00 03 FF 00 01 00 04 07 00 03 01 07 00 DC 07 00 DE 00 03 07 00 03 07 00 03 01 FF 00 1D 00 04 07 00 03 01 07 00 DC 07 00 DE 00 02 07 00 03 07 00 03 45 07 00 1A FF 00 00 00 04 07 00 03 01 07 00 DC 07 00 DE 00 02 07 00 03 07 00 45 45 07 00 1A FF 00 00 00 04 07 00 03 01 07 00 DC 07 00 DE 00 02 07 00 03 07 00 B6 45 07 00 1A FF 00 00 00 04 07 00 03 01 07 00 DC 07 00 DE 00 02 07 00 03 07 00 4B 45 07 00 1A FF 00 00 00 04 07 00 03 01 07 00 DC 07 00 DE 00 02 07 00 03 07 00 BA 42 07 00 30 FF 00 00 00 04 07 00 03 01 07 00 DC 07 00 DE 00 02 07 00 03 07 00 BA 45 07 00 1A 00 46 07 00 1A 40 07 00 89 45 07 00 1A 00 FF 00 00 00 04 07 00 03 01 07 00 DC 07 00 DE 00 04 07 00 03 01 07 00 DC 07 00 DE 41 07 00 03 FF 00 01 00 04 07 00 03 01 07 00 DC 07 00 DE 00 02 07 00 03 07 00 03 01 41 07 00 1A 43 05 44 07 00 1A 47 05 47 07 00 1A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     344    352    Ljava/lang/IndexOutOfBoundsException;
        //  344    352    344    352    Any
        //  360    362    3      8      Ljava/lang/NegativeArraySizeException;
        //  75     82     82     83     Any
        //  76     82     3      8      Any
        //  76     82     3      8      Any
        //  75     82     75     76     Ljava/lang/IllegalArgumentException;
        //  75     82     75     76     Any
        //  190    197    197    198    Any
        //  191    197    3      8      Ljava/util/NoSuchElementException;
        //  190    197    190    191    Any
        //  191    197    3      8      Ljava/lang/AssertionError;
        //  190    197    190    191    Any
        //  202    208    208    209    Any
        //  202    208    208    209    Ljava/lang/UnsupportedOperationException;
        //  202    208    3      8      Ljava/lang/ArithmeticException;
        //  202    208    3      8      Any
        //  202    208    208    209    Any
        //  217    226    226    227    Any
        //  217    226    217    218    Any
        //  217    226    3      8      Any
        //  218    226    217    218    Ljava/lang/IllegalArgumentException;
        //  218    226    217    218    Any
        //  278    285    285    286    Any
        //  278    285    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  279    285    278    279    Any
        //  278    285    285    286    Ljava/lang/AssertionError;
        //  279    285    278    279    Any
        //  292    299    299    300    Any
        //  293    299    292    293    Any
        //  292    299    299    300    Any
        //  292    299    292    293    Any
        //  293    299    299    300    Ljava/lang/UnsupportedOperationException;
        //  303    310    310    311    Any
        //  304    310    3      8      Any
        //  304    310    303    304    Ljava/lang/NumberFormatException;
        //  303    310    3      8      Any
        //  303    310    303    304    Ljava/lang/StringIndexOutOfBoundsException;
        //  318    325    325    326    Any
        //  319    325    318    319    Ljava/lang/NullPointerException;
        //  318    325    318    319    Any
        //  318    325    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  318    325    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 127 out of bounds for length 127
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
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f3i f3i) {
        fbS.fv(this, 2139104456, f3i);
    }
    
    public faL() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u2918\u1486\u8024\ub3d6\uc67b\ue716\ub22a\uec18"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u2938\u1486\u8024\ub3d6\uc65b\ue716\ub22a\uec18"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: ldc             "\u2938\u1486\u8024\ub3d6\uc67b\ue71e\ub230\uec14\ud96b\ue604\uadd3\u1e40\ueb20\uc5e7\u8e8a\u838b\u57a8\u7ddc\ubd2e\ucff9\u21ef\uc234\u60c7\u2d58\ud827\u3f70\u7d2e\u8375\u8005\u8362\u8e5a\ufb3e\u7a06\u9a15\u143b"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    19: getstatic       dev/nuker/pyro/fc.0:I
        //    22: ifeq            30
        //    25: ldc             1743116078
        //    27: goto            32
        //    30: ldc             1784042190
        //    32: ldc             1856903215
        //    34: ixor           
        //    35: lookupswitch {
        //          155963137: 1153
        //          2135837860: 30
        //          default: 60
        //        }
        //    60: aload_0        
        //    61: getstatic       dev/nuker/pyro/fc.1:I
        //    64: ifeq            72
        //    67: ldc             -1657103424
        //    69: goto            74
        //    72: ldc             1321734417
        //    74: ldc             1378035389
        //    76: ixor           
        //    77: lookupswitch {
        //          -820396675: 72
        //          485177260: 104
        //          default: 1141
        //        }
        //   104: aload_0        
        //   105: new             Ldev/nuker/pyro/f0f;
        //   108: dup            
        //   109: ldc             "\u2914\u149c\u8034\ub3dc"
        //   111: invokestatic    invokestatic   !!! ERROR
        //   114: ldc             "\u2934\u149c\u8034\ub3dc"
        //   116: getstatic       dev/nuker/pyro/fc.c:I
        //   119: ifge            127
        //   122: ldc             267126197
        //   124: goto            129
        //   127: ldc             -323722041
        //   129: ldc             207923422
        //   131: ixor           
        //   132: lookupswitch {
        //          -998048987: 127
        //          59288939: 1171
        //          default: 160
        //        }
        //   160: invokestatic    invokestatic   !!! ERROR
        //   163: aconst_null    
        //   164: getstatic       dev/nuker/pyro/fc.c:I
        //   167: ifge            175
        //   170: ldc             1132848073
        //   172: goto            177
        //   175: ldc             2010717635
        //   177: ldc_w           570585400
        //   180: ixor           
        //   181: lookupswitch {
        //          -2028814944: 175
        //          1636274929: 1145
        //          default: 208
        //        }
        //   208: getstatic       dev/nuker/pyro/faI.c:Ldev/nuker/pyro/faI;
        //   211: checkcast       Ljava/lang/Enum;
        //   214: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   217: checkcast       Ldev/nuker/pyro/f0n;
        //   220: getstatic       dev/nuker/pyro/fc.0:I
        //   223: ifeq            232
        //   226: ldc_w           698789277
        //   229: goto            235
        //   232: ldc_w           -1080781193
        //   235: ldc_w           -976053135
        //   238: ixor           
        //   239: lookupswitch {
        //          -327929364: 232
        //          2051410438: 264
        //          default: 1165
        //        }
        //   264: invokevirtual   dev/nuker/pyro/faL.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   267: checkcast       Ldev/nuker/pyro/f0f;
        //   270: getstatic       dev/nuker/pyro/fc.c:I
        //   273: ifge            282
        //   276: ldc_w           54725487
        //   279: goto            285
        //   282: ldc_w           -1910128578
        //   285: ldc_w           160106834
        //   288: ixor           
        //   289: lookupswitch {
        //          -934381272: 282
        //          180879933: 1139
        //          default: 316
        //        }
        //   316: putfield        dev/nuker/pyro/faL.c:Ldev/nuker/pyro/f0f;
        //   319: aload_0        
        //   320: aload_0        
        //   321: new             Ldev/nuker/pyro/f0b;
        //   324: dup            
        //   325: ldc_w           "\u290b\u1496\u803e\ub3dd\uc673\ue70d\ub207\uec12\ud964\ue60a\uadcd"
        //   328: getstatic       dev/nuker/pyro/fc.c:I
        //   331: ifge            340
        //   334: ldc_w           807074694
        //   337: goto            343
        //   340: ldc_w           -967658165
        //   343: ldc_w           729439083
        //   346: ixor           
        //   347: lookupswitch {
        //          459317485: 1151
        //          1381042693: 340
        //          default: 372
        //        }
        //   372: invokestatic    invokestatic   !!! ERROR
        //   375: ldc_w           "\u292b\u1496\u803e\ub3dd\uc673\ue70d\ub207\uec12\ud964\ue60a\uadcd"
        //   378: invokestatic    invokestatic   !!! ERROR
        //   381: aconst_null    
        //   382: new             Ldev/nuker/pyro/fS;
        //   385: dup            
        //   386: fconst_0       
        //   387: fconst_1       
        //   388: ldc_w           0.5
        //   391: ldc_w           0.3
        //   394: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   397: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   400: checkcast       Ldev/nuker/pyro/f0n;
        //   403: invokevirtual   dev/nuker/pyro/faL.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   406: checkcast       Ldev/nuker/pyro/f0b;
        //   409: putfield        dev/nuker/pyro/faL.c:Ldev/nuker/pyro/f0b;
        //   412: aload_0        
        //   413: aload_0        
        //   414: new             Ldev/nuker/pyro/f0b;
        //   417: dup            
        //   418: ldc_w           "\u290b\u1496\u803e\ub3dd\uc673\ue71a\ub236\uec32\ud97d\ue611\uadd3\u1e45\ueb37\uc5a2"
        //   421: getstatic       dev/nuker/pyro/fc.c:I
        //   424: ifge            433
        //   427: ldc_w           -2027312339
        //   430: goto            436
        //   433: ldc_w           -559257760
        //   436: ldc_w           1792019734
        //   439: ixor           
        //   440: lookupswitch {
        //          -1267045770: 468
        //          -302406085: 433
        //          default: 1147
        //        }
        //   468: invokestatic    invokestatic   !!! ERROR
        //   471: ldc_w           "\u292b\u1496\u803e\ub3dd\uc673\ue70d\ub20b\uec08\ud97c\ue609\uadd6\u1e42\ueb3c"
        //   474: getstatic       dev/nuker/pyro/fc.c:I
        //   477: ifge            486
        //   480: ldc_w           156499383
        //   483: goto            489
        //   486: ldc_w           1382913893
        //   489: ldc_w           -1333395694
        //   492: ixor           
        //   493: lookupswitch {
        //          -1177156955: 1143
        //          -1095868069: 486
        //          default: 520
        //        }
        //   520: invokestatic    invokestatic   !!! ERROR
        //   523: aconst_null    
        //   524: new             Ldev/nuker/pyro/fS;
        //   527: dup            
        //   528: fconst_0       
        //   529: fconst_1       
        //   530: ldc_w           0.5
        //   533: fconst_1       
        //   534: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   537: getstatic       dev/nuker/pyro/fc.1:I
        //   540: ifeq            549
        //   543: ldc_w           779176020
        //   546: goto            552
        //   549: ldc_w           420663473
        //   552: ldc_w           1525919495
        //   555: ixor           
        //   556: lookupswitch {
        //          1138851766: 584
        //          1954735955: 549
        //          default: 1159
        //        }
        //   584: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   587: checkcast       Ldev/nuker/pyro/f0n;
        //   590: invokevirtual   dev/nuker/pyro/faL.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   593: checkcast       Ldev/nuker/pyro/f0b;
        //   596: putfield        dev/nuker/pyro/faL.0:Ldev/nuker/pyro/f0b;
        //   599: aload_0        
        //   600: new             Ldev/nuker/pyro/f0b;
        //   603: dup            
        //   604: ldc_w           "\u2908\u1486\u8035\ub3cc\uc673\ue73c\ub22b\uec11\ud967\ue617\uad8e"
        //   607: invokestatic    invokestatic   !!! ERROR
        //   610: ldc_w           "\u2928\u1486\u8035\ub3cc\uc673\ue73c\ub22b\uec11\ud967\ue617"
        //   613: invokestatic    invokestatic   !!! ERROR
        //   616: aconst_null    
        //   617: new             Ldev/nuker/pyro/fS;
        //   620: dup            
        //   621: ldc_w           0.475
        //   624: fconst_1       
        //   625: ldc_w           0.5
        //   628: ldc_w           0.3
        //   631: getstatic       dev/nuker/pyro/fc.0:I
        //   634: ifeq            643
        //   637: ldc_w           1600195287
        //   640: goto            646
        //   643: ldc_w           -1352754833
        //   646: ldc_w           1284706006
        //   649: ixor           
        //   650: lookupswitch {
        //          -1516874388: 643
        //          334627841: 1167
        //          default: 676
        //        }
        //   676: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   679: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   682: putfield        dev/nuker/pyro/faL.1:Ldev/nuker/pyro/f0b;
        //   685: aload_0        
        //   686: new             Ldev/nuker/pyro/f0b;
        //   689: dup            
        //   690: ldc_w           "\u2908\u1486\u8035\ub3cc\uc673\ue730\ub231\uec09\ud964\ue60c\uadd1\u1e49\ueb68"
        //   693: invokestatic    invokestatic   !!! ERROR
        //   696: ldc_w           "\u2928\u1486\u8035\ub3cc\uc673\ue730\ub231\uec09\ud964\ue60c\uadd1\u1e49"
        //   699: invokestatic    invokestatic   !!! ERROR
        //   702: aconst_null    
        //   703: new             Ldev/nuker/pyro/fS;
        //   706: dup            
        //   707: ldc_w           0.475
        //   710: fconst_1       
        //   711: ldc_w           0.5
        //   714: fconst_1       
        //   715: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   718: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   721: putfield        dev/nuker/pyro/faL.2:Ldev/nuker/pyro/f0b;
        //   724: getstatic       dev/nuker/pyro/fc.1:I
        //   727: ifeq            736
        //   730: ldc_w           -2128868041
        //   733: goto            739
        //   736: ldc_w           1511251508
        //   739: ldc_w           1280260544
        //   742: ixor           
        //   743: lookupswitch {
        //          -850184969: 736
        //          375187444: 768
        //          default: 1137
        //        }
        //   768: aload_0        
        //   769: new             Ldev/nuker/pyro/f0a;
        //   772: dup            
        //   773: ldc_w           "\u2908\u1486\u8035\ub3cc\uc673"
        //   776: invokestatic    invokestatic   !!! ERROR
        //   779: ldc_w           "\u2928\u1486\u8035\ub3cc\uc673"
        //   782: getstatic       dev/nuker/pyro/fc.1:I
        //   785: ifeq            794
        //   788: ldc_w           -1328985058
        //   791: goto            797
        //   794: ldc_w           1199683496
        //   797: ldc_w           -781367081
        //   800: ixor           
        //   801: lookupswitch {
        //          -1059420439: 794
        //          1638139081: 1149
        //          default: 828
        //        }
        //   828: invokestatic    invokestatic   !!! ERROR
        //   831: aconst_null    
        //   832: iconst_0       
        //   833: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   836: putfield        dev/nuker/pyro/faL.c:Ldev/nuker/pyro/f0a;
        //   839: aload_0        
        //   840: getstatic       net/minecraft/util/math/BlockPos.field_177992_a:Lnet/minecraft/util/math/BlockPos;
        //   843: putfield        dev/nuker/pyro/faL.c:Lnet/minecraft/util/math/BlockPos;
        //   846: aload_0        
        //   847: new             Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   850: dup            
        //   851: invokespecial   java/util/concurrent/ConcurrentLinkedQueue.<init>:()V
        //   854: putfield        dev/nuker/pyro/faL.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   857: getstatic       dev/nuker/pyro/fc.1:I
        //   860: ifeq            869
        //   863: ldc_w           -1970447126
        //   866: goto            872
        //   869: ldc_w           1732607396
        //   872: ldc_w           -1250486242
        //   875: ixor           
        //   876: lookupswitch {
        //          -439001821: 869
        //          1073366260: 1155
        //          default: 904
        //        }
        //   904: aload_0        
        //   905: new             Ldev/nuker/pyro/f0k;
        //   908: dup            
        //   909: aload_0        
        //   910: getstatic       dev/nuker/pyro/fc.1:I
        //   913: ifeq            922
        //   916: ldc_w           -307978906
        //   919: goto            925
        //   922: ldc_w           66511190
        //   925: ldc_w           -119422801
        //   928: ixor           
        //   929: lookupswitch {
        //          -82370055: 956
        //          356867529: 922
        //          default: 1163
        //        }
        //   956: getfield        dev/nuker/pyro/faL.c:Ldev/nuker/pyro/f0a;
        //   959: checkcast       Ldev/nuker/pyro/f0n;
        //   962: iconst_2       
        //   963: anewarray       Ldev/nuker/pyro/f0n;
        //   966: dup            
        //   967: iconst_0       
        //   968: aload_0        
        //   969: getfield        dev/nuker/pyro/faL.1:Ldev/nuker/pyro/f0b;
        //   972: checkcast       Ldev/nuker/pyro/f0n;
        //   975: aastore        
        //   976: dup            
        //   977: iconst_1       
        //   978: getstatic       dev/nuker/pyro/fc.c:I
        //   981: ifge            990
        //   984: ldc_w           -659888035
        //   987: goto            993
        //   990: ldc_w           -331971906
        //   993: ldc_w           -739610450
        //   996: ixor           
        //   997: lookupswitch {
        //          188782835: 990
        //          1071444496: 1024
        //          default: 1161
        //        }
        //  1024: aload_0        
        //  1025: getstatic       dev/nuker/pyro/fc.1:I
        //  1028: ifeq            1037
        //  1031: ldc_w           2004814269
        //  1034: goto            1040
        //  1037: ldc_w           710348070
        //  1040: ldc_w           1820379612
        //  1043: ixor           
        //  1044: lookupswitch {
        //          469745761: 1157
        //          1939762821: 1037
        //          default: 1072
        //        }
        //  1072: getfield        dev/nuker/pyro/faL.2:Ldev/nuker/pyro/f0b;
        //  1075: checkcast       Ldev/nuker/pyro/f0n;
        //  1078: aastore        
        //  1079: invokespecial   dev/nuker/pyro/f0k.<init>:(Ldev/nuker/pyro/f0n;[Ldev/nuker/pyro/f0n;)V
        //  1082: checkcast       Ldev/nuker/pyro/f0n;
        //  1085: getstatic       dev/nuker/pyro/fc.c:I
        //  1088: ifge            1097
        //  1091: ldc_w           257059500
        //  1094: goto            1100
        //  1097: ldc_w           1616664972
        //  1100: ldc_w           1922604236
        //  1103: ixor           
        //  1104: lookupswitch {
        //          314885440: 1132
        //          2110453344: 1097
        //          default: 1169
        //        }
        //  1132: invokevirtual   dev/nuker/pyro/faL.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1135: pop            
        //  1136: return         
        //  1137: aconst_null    
        //  1138: athrow         
        //  1139: aconst_null    
        //  1140: athrow         
        //  1141: aconst_null    
        //  1142: athrow         
        //  1143: aconst_null    
        //  1144: athrow         
        //  1145: aconst_null    
        //  1146: athrow         
        //  1147: aconst_null    
        //  1148: athrow         
        //  1149: aconst_null    
        //  1150: athrow         
        //  1151: aconst_null    
        //  1152: athrow         
        //  1153: aconst_null    
        //  1154: athrow         
        //  1155: aconst_null    
        //  1156: athrow         
        //  1157: aconst_null    
        //  1158: athrow         
        //  1159: aconst_null    
        //  1160: athrow         
        //  1161: aconst_null    
        //  1162: athrow         
        //  1163: aconst_null    
        //  1164: athrow         
        //  1165: aconst_null    
        //  1166: athrow         
        //  1167: aconst_null    
        //  1168: athrow         
        //  1169: aconst_null    
        //  1170: athrow         
        //  1171: aconst_null    
        //  1172: athrow         
        //    StackMapTable: 00 48 FF 00 1E 00 01 07 00 03 00 00 41 01 1B 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 FF 00 16 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 69 08 00 69 07 00 BA 07 00 BA FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 69 08 00 69 07 00 BA 07 00 BA 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 69 08 00 69 07 00 BA 07 00 BA FF 00 0E 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 69 08 00 69 07 00 BA 07 00 BA 05 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 69 08 00 69 07 00 BA 07 00 BA 05 01 FF 00 1E 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 69 08 00 69 07 00 BA 07 00 BA 05 FF 00 17 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 07 FF 00 02 00 01 07 00 03 00 04 07 00 03 07 00 03 07 01 07 01 FF 00 1C 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 07 FF 00 11 00 01 07 00 03 00 02 07 00 03 07 00 45 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 45 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 45 FF 00 17 00 01 07 00 03 00 05 07 00 03 07 00 03 08 01 41 08 01 41 07 00 BA FF 00 02 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 41 08 01 41 07 00 BA 01 FF 00 1C 00 01 07 00 03 00 05 07 00 03 07 00 03 08 01 41 08 01 41 07 00 BA FF 00 3C 00 01 07 00 03 00 05 07 00 03 07 00 03 08 01 9E 08 01 9E 07 00 BA FF 00 02 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 9E 08 01 9E 07 00 BA 01 FF 00 1F 00 01 07 00 03 00 05 07 00 03 07 00 03 08 01 9E 08 01 9E 07 00 BA FF 00 11 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 9E 08 01 9E 07 00 BA 07 00 BA FF 00 02 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 9E 08 01 9E 07 00 BA 07 00 BA 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 9E 08 01 9E 07 00 BA 07 00 BA FF 00 1C 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 9E 08 01 9E 07 00 BA 07 00 BA 05 07 01 1B FF 00 02 00 01 07 00 03 00 09 07 00 03 07 00 03 08 01 9E 08 01 9E 07 00 BA 07 00 BA 05 07 01 1B 01 FF 00 1F 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 9E 08 01 9E 07 00 BA 07 00 BA 05 07 01 1B FF 00 3A 00 01 07 00 03 00 0C 07 00 03 08 02 58 08 02 58 07 00 BA 07 00 BA 05 08 02 69 08 02 69 02 02 02 02 FF 00 02 00 01 07 00 03 00 0D 07 00 03 08 02 58 08 02 58 07 00 BA 07 00 BA 05 08 02 69 08 02 69 02 02 02 02 01 FF 00 1D 00 01 07 00 03 00 0C 07 00 03 08 02 58 08 02 58 07 00 BA 07 00 BA 05 08 02 69 08 02 69 02 02 02 02 3B 42 01 1C FF 00 19 00 01 07 00 03 00 05 07 00 03 08 03 01 08 03 01 07 00 BA 07 00 BA FF 00 02 00 01 07 00 03 00 06 07 00 03 08 03 01 08 03 01 07 00 BA 07 00 BA 01 FF 00 1E 00 01 07 00 03 00 05 07 00 03 08 03 01 08 03 01 07 00 BA 07 00 BA 28 42 01 1F FF 00 11 00 01 07 00 03 00 04 07 00 03 08 03 89 08 03 89 07 00 03 FF 00 02 00 01 07 00 03 00 05 07 00 03 08 03 89 08 03 89 07 00 03 01 FF 00 1E 00 01 07 00 03 00 04 07 00 03 08 03 89 08 03 89 07 00 03 FF 00 21 00 01 07 00 03 00 07 07 00 03 08 03 89 08 03 89 07 01 07 07 01 69 07 01 69 01 FF 00 02 00 01 07 00 03 00 08 07 00 03 08 03 89 08 03 89 07 01 07 07 01 69 07 01 69 01 01 FF 00 1E 00 01 07 00 03 00 07 07 00 03 08 03 89 08 03 89 07 01 07 07 01 69 07 01 69 01 FF 00 0C 00 01 07 00 03 00 08 07 00 03 08 03 89 08 03 89 07 01 07 07 01 69 07 01 69 01 07 00 03 FF 00 02 00 01 07 00 03 00 09 07 00 03 08 03 89 08 03 89 07 01 07 07 01 69 07 01 69 01 07 00 03 01 FF 00 1F 00 01 07 00 03 00 08 07 00 03 08 03 89 08 03 89 07 01 07 07 01 69 07 01 69 01 07 00 03 FF 00 18 00 01 07 00 03 00 02 07 00 03 07 01 07 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 01 07 01 FF 00 1F 00 01 07 00 03 00 02 07 00 03 07 01 07 04 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 45 41 07 00 03 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 9E 08 01 9E 07 00 BA 07 00 BA FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 69 08 00 69 07 00 BA 07 00 BA 05 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 01 9E 08 01 9E 07 00 BA FF 00 01 00 01 07 00 03 00 05 07 00 03 08 03 01 08 03 01 07 00 BA 07 00 BA FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 01 41 08 01 41 07 00 BA 01 01 FF 00 01 00 01 07 00 03 00 08 07 00 03 08 03 89 08 03 89 07 01 07 07 01 69 07 01 69 01 07 00 03 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 9E 08 01 9E 07 00 BA 07 00 BA 05 07 01 1B FF 00 01 00 01 07 00 03 00 07 07 00 03 08 03 89 08 03 89 07 01 07 07 01 69 07 01 69 01 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 03 89 08 03 89 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 01 07 FF 00 01 00 01 07 00 03 00 0C 07 00 03 08 02 58 08 02 58 07 00 BA 07 00 BA 05 08 02 69 08 02 69 02 02 02 02 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 01 07 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 69 08 00 69 07 00 BA 07 00 BA
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
    
    public static BlockPos c(final faL faL) {
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
                            if (fc.0 <= 0) {
                                null;
                                goto Label_0030;
                            }
                            continue Label_0038;
                            return faL.c;
                        }
                        catch (StringIndexOutOfBoundsException ex) {}
                    }
                    continue Label_0038;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public boolean c(@NotNull final f3i f3i, @NotNull final BlockPos blockPos) {
        return fbS.a(this, 105532312, f3i, blockPos);
    }
    
    @Override
    public void c(@Nullable final Vec3d vec3d, final float n) {
        fbS.9c(this, 429710229, vec3d, n);
    }
    
    static {
        throw t;
    }
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f38 p0) {
        public class faJ implements Consumer
        {
            public faL c;
            
            public faJ(final faL c) {
                this.c = c;
            }
            
            static {
                throw t;
            }
            
            public void c(final Boolean b) {
                fbS.3z(this, 662109148, b);
            }
            
            @Override
            public void accept(final Object o) {
                fbS.2W(this, 1794651812, o);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          791
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            783
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            775
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            36
        //    30: ldc_w           171775636
        //    33: goto            39
        //    36: ldc_w           459140728
        //    39: ldc_w           -806891673
        //    42: ixor           
        //    43: lookupswitch {
        //          -975513101: 36
        //          -725999329: 68
        //          default: 746
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_0        
        //    71: getstatic       dev/nuker/pyro/fc.0:I
        //    74: ifeq            83
        //    77: ldc_w           498966542
        //    80: goto            86
        //    83: ldc_w           -1753558568
        //    86: ldc_w           -659853793
        //    89: ixor           
        //    90: lookupswitch {
        //          -988361199: 83
        //          1339146183: 116
        //          default: 758
        //        }
        //   116: getfield        dev/nuker/pyro/faL.c:Ldev/nuker/pyro/f0f;
        //   119: goto            123
        //   122: athrow         
        //   123: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   126: goto            130
        //   129: athrow         
        //   130: checkcast       Ldev/nuker/pyro/faI;
        //   133: getstatic       dev/nuker/pyro/fc.0:I
        //   136: ifeq            145
        //   139: ldc_w           -217702081
        //   142: goto            148
        //   145: ldc_w           593885634
        //   148: ldc_w           -1730358115
        //   151: ixor           
        //   152: lookupswitch {
        //          -121823639: 145
        //          1809511842: 754
        //          default: 180
        //        }
        //   180: getstatic       dev/nuker/pyro/faI.0:Ldev/nuker/pyro/faI;
        //   183: if_acmpne       192
        //   186: ldc_w           -1249270500
        //   189: goto            195
        //   192: ldc_w           -1249270497
        //   195: ldc_w           1069867109
        //   198: ixor           
        //   199: tableswitch {
        //          345672434: 220
        //          345672435: 745
        //          default: 186
        //        }
        //   220: aload_0        
        //   221: getfield        dev/nuker/pyro/faL.c:Ldev/nuker/pyro/f0a;
        //   224: getstatic       dev/nuker/pyro/fc.0:I
        //   227: ifeq            236
        //   230: ldc_w           1960911958
        //   233: goto            239
        //   236: ldc_w           -1083579372
        //   239: ldc_w           -859231502
        //   242: ixor           
        //   243: lookupswitch {
        //          -1205334364: 236
        //          1939918566: 268
        //          default: 750
        //        }
        //   268: goto            272
        //   271: athrow         
        //   272: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   275: goto            279
        //   278: athrow         
        //   279: checkcast       Ljava/lang/Boolean;
        //   282: goto            286
        //   285: athrow         
        //   286: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   289: goto            293
        //   292: athrow         
        //   293: ifeq            541
        //   296: aload_0        
        //   297: getfield        dev/nuker/pyro/faL.c:Lnet/minecraft/util/math/BlockPos;
        //   300: getstatic       net/minecraft/util/math/BlockPos.field_177992_a:Lnet/minecraft/util/math/BlockPos;
        //   303: getstatic       dev/nuker/pyro/fc.c:I
        //   306: ifge            315
        //   309: ldc_w           697607764
        //   312: goto            318
        //   315: ldc_w           -2059194972
        //   318: ldc_w           1746809464
        //   321: ixor           
        //   322: lookupswitch {
        //          -1963179810: 315
        //          1099600940: 760
        //          default: 348
        //        }
        //   348: goto            352
        //   351: athrow         
        //   352: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   355: goto            359
        //   358: athrow         
        //   359: iconst_1       
        //   360: ixor           
        //   361: ifeq            541
        //   364: aload_0        
        //   365: getfield        dev/nuker/pyro/faL.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   368: aload_1        
        //   369: goto            373
        //   372: athrow         
        //   373: invokevirtual   dev/nuker/pyro/f38.c:()Lnet/minecraft/util/math/BlockPos;
        //   376: goto            380
        //   379: athrow         
        //   380: getstatic       dev/nuker/pyro/fc.0:I
        //   383: ifeq            392
        //   386: ldc_w           1154378977
        //   389: goto            395
        //   392: ldc_w           -1477577734
        //   395: ldc_w           -1602438656
        //   398: ixor           
        //   399: lookupswitch {
        //          -458041631: 748
        //          837987287: 392
        //          default: 424
        //        }
        //   424: goto            428
        //   427: athrow         
        //   428: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.contains:(Ljava/lang/Object;)Z
        //   431: goto            435
        //   434: athrow         
        //   435: ifeq            512
        //   438: aload_0        
        //   439: getfield        dev/nuker/pyro/faL.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   442: getstatic       dev/nuker/pyro/fc.0:I
        //   445: ifeq            454
        //   448: ldc_w           13863454
        //   451: goto            457
        //   454: ldc_w           2069007008
        //   457: ldc_w           -1010901610
        //   460: ixor           
        //   461: lookupswitch {
        //          -1607565870: 454
        //          -1016244344: 752
        //          default: 488
        //        }
        //   488: aload_1        
        //   489: goto            493
        //   492: athrow         
        //   493: invokevirtual   dev/nuker/pyro/f38.c:()Lnet/minecraft/util/math/BlockPos;
        //   496: goto            500
        //   499: athrow         
        //   500: goto            504
        //   503: athrow         
        //   504: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.remove:(Ljava/lang/Object;)Z
        //   507: goto            511
        //   510: athrow         
        //   511: pop            
        //   512: aload_0        
        //   513: getfield        dev/nuker/pyro/faL.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //   516: aload_1        
        //   517: goto            521
        //   520: athrow         
        //   521: invokevirtual   dev/nuker/pyro/f38.c:()Lnet/minecraft/util/math/BlockPos;
        //   524: goto            528
        //   527: athrow         
        //   528: goto            532
        //   531: athrow         
        //   532: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.add:(Ljava/lang/Object;)Z
        //   535: goto            539
        //   538: athrow         
        //   539: pop            
        //   540: return         
        //   541: aload_0        
        //   542: aload_1        
        //   543: goto            547
        //   546: athrow         
        //   547: invokevirtual   dev/nuker/pyro/f38.c:()Lnet/minecraft/util/math/BlockPos;
        //   550: goto            554
        //   553: athrow         
        //   554: putfield        dev/nuker/pyro/faL.c:Lnet/minecraft/util/math/BlockPos;
        //   557: getstatic       dev/nuker/pyro/fx.c:Ldev/nuker/pyro/fx;
        //   560: aload_0        
        //   561: checkcast       Ldev/nuker/pyro/fH;
        //   564: getstatic       dev/nuker/pyro/fc.1:I
        //   567: ifeq            576
        //   570: ldc_w           2020553349
        //   573: goto            579
        //   576: ldc_w           -1385720898
        //   579: ldc_w           1891517247
        //   582: ixor           
        //   583: lookupswitch {
        //          147943866: 762
        //          2128094156: 576
        //          default: 608
        //        }
        //   608: aload_1        
        //   609: getstatic       dev/nuker/pyro/fc.c:I
        //   612: ifge            621
        //   615: ldc_w           -988474036
        //   618: goto            624
        //   621: ldc_w           501162219
        //   624: ldc_w           -2054170449
        //   627: ixor           
        //   628: lookupswitch {
        //          -1678064535: 621
        //          1083887075: 764
        //          default: 656
        //        }
        //   656: goto            660
        //   659: athrow         
        //   660: invokevirtual   dev/nuker/pyro/f38.c:()Lnet/minecraft/util/math/BlockPos;
        //   663: goto            667
        //   666: athrow         
        //   667: iconst_1       
        //   668: new             Ldev/nuker/pyro/faJ;
        //   671: dup            
        //   672: aload_0        
        //   673: getstatic       dev/nuker/pyro/fc.1:I
        //   676: ifeq            685
        //   679: ldc_w           38334647
        //   682: goto            688
        //   685: ldc_w           686246073
        //   688: ldc_w           758162167
        //   691: ixor           
        //   692: lookupswitch {
        //          -1097900521: 685
        //          796414528: 756
        //          default: 720
        //        }
        //   720: goto            724
        //   723: athrow         
        //   724: invokespecial   dev/nuker/pyro/faJ.<init>:(Ldev/nuker/pyro/faL;)V
        //   727: goto            731
        //   730: athrow         
        //   731: checkcast       Ljava/util/function/Consumer;
        //   734: goto            738
        //   737: athrow         
        //   738: invokevirtual   dev/nuker/pyro/fx.c:(Ldev/nuker/pyro/fH;Lnet/minecraft/util/math/BlockPos;ZLjava/util/function/Consumer;)V
        //   741: goto            745
        //   744: athrow         
        //   745: return         
        //   746: aconst_null    
        //   747: athrow         
        //   748: aconst_null    
        //   749: athrow         
        //   750: aconst_null    
        //   751: athrow         
        //   752: aconst_null    
        //   753: athrow         
        //   754: aconst_null    
        //   755: athrow         
        //   756: aconst_null    
        //   757: athrow         
        //   758: aconst_null    
        //   759: athrow         
        //   760: aconst_null    
        //   761: athrow         
        //   762: aconst_null    
        //   763: athrow         
        //   764: aconst_null    
        //   765: athrow         
        //   766: pop            
        //   767: goto            24
        //   770: pop            
        //   771: aconst_null    
        //   772: goto            766
        //   775: dup            
        //   776: ifnull          766
        //   779: checkcast       Ljava/lang/Throwable;
        //   782: athrow         
        //   783: dup            
        //   784: ifnull          770
        //   787: checkcast       Ljava/lang/Throwable;
        //   790: athrow         
        //   791: aconst_null    
        //   792: athrow         
        //    StackMapTable: 00 6F 43 07 00 1A 04 FF 00 0B 00 00 00 01 07 00 1A FD 00 03 07 00 03 07 01 8F 0B 42 01 1C 4E 07 00 03 FF 00 02 00 02 07 00 03 07 01 8F 00 02 07 00 03 01 5D 07 00 03 45 07 00 1A 40 07 00 45 45 07 00 1A 40 07 00 B6 4E 07 00 4B FF 00 02 00 02 07 00 03 07 01 8F 00 02 07 00 4B 01 5F 07 00 4B 05 05 42 01 18 4F 07 00 91 FF 00 02 00 02 07 00 03 07 01 8F 00 02 07 00 91 01 5C 07 00 91 42 07 00 BF 40 07 00 91 45 07 00 1A 40 07 00 B6 45 07 00 1A 40 07 00 94 45 07 00 1A 40 01 FF 00 15 00 02 07 00 03 07 01 8F 00 02 07 00 1E 07 00 1E FF 00 02 00 02 07 00 03 07 01 8F 00 03 07 00 1E 07 00 1E 01 FF 00 1D 00 02 07 00 03 07 01 8F 00 02 07 00 1E 07 00 1E 42 07 00 36 FF 00 00 00 02 07 00 03 07 01 8F 00 02 07 00 1E 07 00 1E 45 07 00 1A 40 01 4C 07 00 1A FF 00 00 00 02 07 00 03 07 01 8F 00 02 07 00 89 07 01 8F 45 07 00 1A FF 00 00 00 02 07 00 03 07 01 8F 00 02 07 00 89 07 00 1E FF 00 0B 00 02 07 00 03 07 01 8F 00 02 07 00 89 07 00 1E FF 00 02 00 02 07 00 03 07 01 8F 00 03 07 00 89 07 00 1E 01 FF 00 1C 00 02 07 00 03 07 01 8F 00 02 07 00 89 07 00 1E 42 07 00 1A FF 00 00 00 02 07 00 03 07 01 8F 00 02 07 00 89 07 00 1E 45 07 00 1A 40 01 52 07 00 89 FF 00 02 00 02 07 00 03 07 01 8F 00 02 07 00 89 01 5E 07 00 89 43 07 00 30 FF 00 00 00 02 07 00 03 07 01 8F 00 02 07 00 89 07 01 8F 45 07 00 1A FF 00 00 00 02 07 00 03 07 01 8F 00 02 07 00 89 07 00 1E FF 00 02 00 00 00 01 07 00 1A FF 00 00 00 02 07 00 03 07 01 8F 00 02 07 00 89 07 00 1E 45 07 00 1A 40 01 00 47 07 00 1A FF 00 00 00 02 07 00 03 07 01 8F 00 02 07 00 89 07 01 8F 45 07 00 1A FF 00 00 00 02 07 00 03 07 01 8F 00 02 07 00 89 07 00 1E FF 00 02 00 00 00 01 07 00 1A FF 00 00 00 02 07 00 03 07 01 8F 00 02 07 00 89 07 00 1E 45 07 00 1A 40 01 01 44 07 00 1A FF 00 00 00 02 07 00 03 07 01 8F 00 02 07 00 03 07 01 8F 45 07 00 1A FF 00 00 00 02 07 00 03 07 01 8F 00 02 07 00 03 07 00 1E FF 00 15 00 02 07 00 03 07 01 8F 00 02 07 00 9F 07 00 05 FF 00 02 00 02 07 00 03 07 01 8F 00 03 07 00 9F 07 00 05 01 FF 00 1C 00 02 07 00 03 07 01 8F 00 02 07 00 9F 07 00 05 FF 00 0C 00 02 07 00 03 07 01 8F 00 03 07 00 9F 07 00 05 07 01 8F FF 00 02 00 02 07 00 03 07 01 8F 00 04 07 00 9F 07 00 05 07 01 8F 01 FF 00 1F 00 02 07 00 03 07 01 8F 00 03 07 00 9F 07 00 05 07 01 8F 42 07 00 1A FF 00 00 00 02 07 00 03 07 01 8F 00 03 07 00 9F 07 00 05 07 01 8F 45 07 00 1A FF 00 00 00 02 07 00 03 07 01 8F 00 03 07 00 9F 07 00 05 07 00 1E FF 00 11 00 02 07 00 03 07 01 8F 00 07 07 00 9F 07 00 05 07 00 1E 01 08 02 9C 08 02 9C 07 00 03 FF 00 02 00 02 07 00 03 07 01 8F 00 08 07 00 9F 07 00 05 07 00 1E 01 08 02 9C 08 02 9C 07 00 03 01 FF 00 1F 00 02 07 00 03 07 01 8F 00 07 07 00 9F 07 00 05 07 00 1E 01 08 02 9C 08 02 9C 07 00 03 FF 00 02 00 00 00 01 07 00 1A FF 00 00 00 02 07 00 03 07 01 8F 00 07 07 00 9F 07 00 05 07 00 1E 01 08 02 9C 08 02 9C 07 00 03 45 07 00 1A FF 00 00 00 02 07 00 03 07 01 8F 00 05 07 00 9F 07 00 05 07 00 1E 01 07 01 AA 45 07 00 1A FF 00 00 00 02 07 00 03 07 01 8F 00 05 07 00 9F 07 00 05 07 00 1E 01 07 00 AF 45 07 00 1A 00 00 FF 00 01 00 02 07 00 03 07 01 8F 00 02 07 00 89 07 00 1E 41 07 00 91 41 07 00 89 41 07 00 4B FF 00 01 00 02 07 00 03 07 01 8F 00 07 07 00 9F 07 00 05 07 00 1E 01 08 02 9C 08 02 9C 07 00 03 41 07 00 03 FF 00 01 00 02 07 00 03 07 01 8F 00 02 07 00 1E 07 00 1E FF 00 01 00 02 07 00 03 07 01 8F 00 02 07 00 9F 07 00 05 FF 00 01 00 02 07 00 03 07 01 8F 00 03 07 00 9F 07 00 05 07 01 8F 41 07 00 1A 43 05 44 07 00 1A 47 05 47 07 00 1A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     775    783    Ljava/lang/UnsupportedOperationException;
        //  775    783    775    783    Any
        //  791    793    3      8      Ljava/lang/UnsupportedOperationException;
        //  122    129    129    130    Any
        //  123    129    122    123    Ljava/lang/IllegalStateException;
        //  123    129    122    123    Any
        //  123    129    129    130    Ljava/lang/IndexOutOfBoundsException;
        //  122    129    129    130    Ljava/lang/UnsupportedOperationException;
        //  271    278    278    279    Any
        //  271    278    3      8      Any
        //  271    278    278    279    Ljava/lang/UnsupportedOperationException;
        //  272    278    278    279    Ljava/lang/IllegalArgumentException;
        //  272    278    271    272    Ljava/util/NoSuchElementException;
        //  285    292    292    293    Any
        //  285    292    292    293    Any
        //  285    292    285    286    Any
        //  285    292    292    293    Ljava/lang/IllegalStateException;
        //  286    292    292    293    Any
        //  351    358    358    359    Any
        //  352    358    358    359    Any
        //  351    358    3      8      Ljava/lang/RuntimeException;
        //  352    358    351    352    Ljava/lang/UnsupportedOperationException;
        //  352    358    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  372    379    379    380    Any
        //  372    379    372    373    Any
        //  372    379    372    373    Ljava/lang/AssertionError;
        //  372    379    379    380    Ljava/lang/UnsupportedOperationException;
        //  372    379    379    380    Any
        //  427    434    434    435    Any
        //  428    434    427    428    Any
        //  427    434    427    428    Ljava/lang/IndexOutOfBoundsException;
        //  427    434    3      8      Any
        //  427    434    427    428    Any
        //  492    499    499    500    Any
        //  493    499    492    493    Ljava/lang/IndexOutOfBoundsException;
        //  492    499    492    493    Ljava/lang/ClassCastException;
        //  492    499    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  493    499    3      8      Ljava/lang/ArithmeticException;
        //  504    510    510    511    Any
        //  504    510    510    511    Any
        //  504    510    3      8      Ljava/lang/IllegalStateException;
        //  504    510    3      8      Any
        //  504    510    510    511    Ljava/util/ConcurrentModificationException;
        //  520    527    527    528    Any
        //  521    527    520    521    Any
        //  520    527    527    528    Any
        //  521    527    3      8      Any
        //  521    527    520    521    Any
        //  532    538    538    539    Any
        //  532    538    538    539    Any
        //  532    538    3      8      Any
        //  532    538    538    539    Any
        //  532    538    538    539    Ljava/lang/NegativeArraySizeException;
        //  546    553    553    554    Any
        //  546    553    553    554    Ljava/util/ConcurrentModificationException;
        //  547    553    546    547    Any
        //  546    553    546    547    Any
        //  546    553    3      8      Ljava/lang/NumberFormatException;
        //  659    666    666    667    Any
        //  660    666    3      8      Any
        //  660    666    659    660    Any
        //  660    666    666    667    Any
        //  659    666    659    660    Ljava/lang/NullPointerException;
        //  724    730    730    731    Any
        //  724    730    3      8      Ljava/lang/IllegalArgumentException;
        //  724    730    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  724    730    3      8      Any
        //  724    730    730    731    Ljava/lang/ClassCastException;
        //  737    744    744    745    Any
        //  737    744    737    738    Ljava/lang/UnsupportedOperationException;
        //  738    744    744    745    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  738    744    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  737    744    737    738    Any
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
