// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import kotlin.jvm.JvmOverloads;
import java.util.NoSuchElementException;
import net.minecraft.client.gui.ScaledResolution;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import kotlin.jvm.JvmField;

public class f43 extends fbk
{
    @JvmField
    @NotNull
    public f49 c;
    public float c;
    public float 0;
    public float 1;
    public float 2;
    @JvmField
    public boolean c;
    public boolean 0;
    public boolean 1;
    public float 3;
    @Nullable
    public f45 c;
    @NotNull
    public f44 c;
    public boolean 2;
    @JvmField
    @Nullable
    public Runnable c;
    @NotNull
    public String c;
    @NotNull
    public String 0;
    @JvmField
    public boolean 3;
    
    public void c(@Nullable final ScaledResolution scaledResolution, final int n, final int n2) {
        Object o = null;
        Block_0: {
            break Block_0;
            do {
                return;
                try {
                    o = null;
                    if (fc.0 > 0) {
                        continue;
                    }
                    null;
                    return;
                }
                catch (NegativeArraySizeException ex) {
                    if (ex != null) {
                        throw ex;
                    }
                    return;
                }
            } while (o == null);
        }
        throw (Throwable)o;
    }
    
    static {
        throw t;
    }
    
    public void c(@Nullable final ScaledResolution scaledResolution) {
        Object o = null;
        Block_0: {
            break Block_0;
            do {
                return;
                try {
                    o = null;
                    if (fc.c >= 0) {
                        null;
                        goto Label_0026;
                    }
                    continue;
                }
                catch (NoSuchElementException ex) {}
            } while (o == null);
        }
        throw (Throwable)o;
    }
    
    @NotNull
    public f44 c() {
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
        //    17: getfield        dev/nuker/pyro/f43.c:Ldev/nuker/pyro/f44;
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
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 1E FC 00 03 07 00 03 44 07 00 1E 43 05 44 07 00 1E 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  0      12     30     38     Any
        //  30     38     30     38     Ljava/lang/ArithmeticException;
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
    
    public float 0() {
        return fbS.aA(this, 1306996648);
    }
    
    @Nullable
    public f45 1() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: iflt            84
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            76
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: getstatic       dev/nuker/pyro/fc.c:I
        //    19: ifge            27
        //    22: ldc             -1419728441
        //    24: goto            29
        //    27: ldc             -1403803683
        //    29: ldc             1340315415
        //    31: ixor           
        //    32: lookupswitch {
        //          -1000553855: 27
        //          -461160752: 65
        //          default: 60
        //        }
        //    60: aload_0        
        //    61: getfield        dev/nuker/pyro/f43.c:Ldev/nuker/pyro/f45;
        //    64: areturn        
        //    65: aconst_null    
        //    66: athrow         
        //    67: pop            
        //    68: goto            16
        //    71: pop            
        //    72: aconst_null    
        //    73: goto            67
        //    76: dup            
        //    77: ifnull          67
        //    80: checkcast       Ljava/lang/Throwable;
        //    83: athrow         
        //    84: dup            
        //    85: ifnull          71
        //    88: checkcast       Ljava/lang/Throwable;
        //    91: athrow         
        //    StackMapTable: 00 0A FF 00 0C 00 00 00 01 07 00 1E FC 00 03 07 00 03 0A 41 01 1E 04 41 07 00 1E 43 05 44 07 00 1E 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      12     76     84     Any
        //  76     84     76     84     Ljava/lang/IllegalStateException;
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
    
    @NotNull
    public String 9() {
        return fbS.50(this, 1973037335);
    }
    
    public float a() {
        return fbS.aJ(this, 1096018482);
    }
    
    public void c(@NotNull final f44 c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0087:
            while (true) {
                do {
                    Label_0074: {
                        break Label_0074;
                        try {
                            o = null;
                            if (fc.c >= 0) {
                                null;
                                goto Label_0079;
                            }
                            continue Label_0087;
                            while (true) {
                                int n = -90457820;
                                continue;
                                Label_0068: {
                                    throw null;
                                }
                                Label_0064:
                                this.c = c;
                                return;
                                Label_0031:
                                n = 2137564030;
                                continue;
                            }
                        }
                        // switch([Lcom.strobel.decompiler.ast.Label;@2a3162d5, n ^ 0xDBF35841)
                        // iftrue(Label_0031:, fc.1 == 0)
                        catch (AssertionError assertionError) {}
                    }
                    continue Label_0087;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    @JvmOverloads
    public f43(@NotNull final String s, @NotNull final String s2, @NotNull final f49 f49) {
        this(s, s2, f49, null, false, 24, null);
    }
    
    public void b() {
        fbS.dk(this, 1515395455);
    }
    
    public f43(final String s, final String s2, final f49 f49, f44 f50, boolean b, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x8) != 0x0) {
            final f44 0 = f44.0;
            while (true) {
                int n2 = 0;
                Label_0024: {
                    if (fc.c < 0) {
                        n2 = -1519017395;
                        break Label_0024;
                    }
                    n2 = 1975331948;
                }
                switch (n2 ^ 0x8C04F897) {
                    case 695294682: {
                        continue;
                    }
                    case -105261829: {
                        f50 = 0;
                        break;
                    }
                    default: {
                        throw null;
                    }
                }
                break;
            }
        }
        while (true) {
            int n3 = 0;
            Label_0067: {
                if (fc.c < 0) {
                    n3 = -1743864874;
                    break Label_0067;
                }
                n3 = 1184306219;
            }
            switch (n3 ^ 0x691CC99A) {
                case 153585459: {
                    continue;
                }
                default: {
                    if ((n & 0x10) != 0x0) {
                        b = true;
                    }
                    while (true) {
                        int n4 = 0;
                        Label_0122: {
                            if (fc.0 != 0) {
                                n4 = 383065502;
                                break Label_0122;
                            }
                            n4 = 1503135810;
                        }
                        switch (n4 ^ 0xCE5EC366) {
                            case 2007700402: {
                                continue;
                            }
                            default: {
                                while (true) {
                                    int n5 = 0;
                                    Label_0167: {
                                        if (fc.1 != 0) {
                                            n5 = -1424177391;
                                            break Label_0167;
                                        }
                                        n5 = -1753108918;
                                    }
                                    switch (n5 ^ 0xE9EE55E6) {
                                        case 942875632: {
                                            continue;
                                        }
                                        default: {
                                            final f44 f51 = f50;
                                            while (true) {
                                                int n6 = 0;
                                                Label_0211: {
                                                    if (fc.0 != 0) {
                                                        n6 = 877253427;
                                                        break Label_0211;
                                                    }
                                                    n6 = -1677382843;
                                                }
                                                switch (n6 ^ 0xF097D144) {
                                                    case -992083337: {
                                                        continue;
                                                    }
                                                    case 1821571585: {
                                                        this(s, s2, f49, f51, b);
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
                                        case 1123193591: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case -661922056: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case -250449332: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void 2(final float n) {
        fbS.8p(this, 1378911668, n);
    }
    
    public void 0(final float n) {
        fbS.8x(this, 1683008774, n);
    }
    
    public void e() {
        fbS.dV(this, 21468351);
    }
    
    public float d() {
        return fbS.an(this, 762721579);
    }
    
    @JvmOverloads
    public f43(@NotNull final String s, @NotNull final String s2, @NotNull final f49 f49, @NotNull final f44 f50) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.0 != 0) {
                    n = 1488748075;
                    break Label_0013;
                }
                n = -1030762244;
            }
            switch (n ^ 0xBD9FC9DD) {
                case 969600814: {
                    continue;
                }
                default: {
                    this(s, s2, f49, f50, false, 16, null);
                }
                case -450643978: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void c(final float n) {
        fbS.8E(this, 617733603, n);
    }
    
    public void c(final boolean b) {
        fbS.4w(this, 1643866942, b);
    }
    
    public float 5() {
        return fbS.a9(this, 62228438);
    }
    
    public void 1(final float n) {
        fbS.8m(this, 806428585, n);
    }
    
    public boolean 3() {
        return fbS.ee(this, 665955391);
    }
    
    public boolean c(final float p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1474
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1466
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1458
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             -1167368619
        //    32: goto            37
        //    35: ldc             -1002380625
        //    37: ldc             -1402231515
        //    39: ixor           
        //    40: lookupswitch {
        //          369163120: 35
        //          1747666826: 68
        //          default: 1423
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokestatic    net/minecraft/client/Minecraft.func_175610_ah:()I
        //    75: goto            79
        //    78: athrow         
        //    79: i2f            
        //    80: ldc             60.0
        //    82: fdiv           
        //    83: fstore_3       
        //    84: ldc             3.0
        //    86: getstatic       dev/nuker/pyro/fc.1:I
        //    89: ifeq            97
        //    92: ldc             -1562028439
        //    94: goto            99
        //    97: ldc             -697292728
        //    99: ldc             830787711
        //   101: ixor           
        //   102: lookupswitch {
        //          -1822325226: 97
        //          -403376073: 128
        //          default: 1417
        //        }
        //   128: fload_3        
        //   129: fdiv           
        //   130: fstore          4
        //   132: ldc             4.0
        //   134: fload_3        
        //   135: fdiv           
        //   136: fstore          5
        //   138: getstatic       dev/nuker/pyro/fc.c:I
        //   141: ifge            149
        //   144: ldc             -266540968
        //   146: goto            151
        //   149: ldc             452089201
        //   151: ldc             1249162330
        //   153: ixor           
        //   154: lookupswitch {
        //          -2035828782: 149
        //          -1167565822: 1431
        //          default: 180
        //        }
        //   180: aload_0        
        //   181: getfield        dev/nuker/pyro/f43.3:F
        //   184: fload_1        
        //   185: fcmpg          
        //   186: ifeq            539
        //   189: aload_0        
        //   190: getfield        dev/nuker/pyro/f43.3:F
        //   193: fconst_0       
        //   194: fcmpg          
        //   195: ifne            215
        //   198: aload_0        
        //   199: getfield        dev/nuker/pyro/f43.2:Z
        //   202: ifeq            215
        //   205: aload_0        
        //   206: fload_1        
        //   207: putfield        dev/nuker/pyro/f43.3:F
        //   210: aload_0        
        //   211: iconst_0       
        //   212: putfield        dev/nuker/pyro/f43.2:Z
        //   215: aload_0        
        //   216: getfield        dev/nuker/pyro/f43.3:F
        //   219: fload_1        
        //   220: fcmpl          
        //   221: ifle            294
        //   224: aload_0        
        //   225: dup            
        //   226: getstatic       dev/nuker/pyro/fc.0:I
        //   229: ifeq            237
        //   232: ldc             670661443
        //   234: goto            239
        //   237: ldc             -85467082
        //   239: ldc             -1140813859
        //   241: ixor           
        //   242: lookupswitch {
        //          -1678117730: 1421
        //          -251188208: 237
        //          default: 268
        //        }
        //   268: getfield        dev/nuker/pyro/f43.3:F
        //   271: fload           5
        //   273: fsub           
        //   274: putfield        dev/nuker/pyro/f43.3:F
        //   277: aload_0        
        //   278: getfield        dev/nuker/pyro/f43.3:F
        //   281: fload_1        
        //   282: fcmpg          
        //   283: ifgt            539
        //   286: aload_0        
        //   287: fload_1        
        //   288: putfield        dev/nuker/pyro/f43.3:F
        //   291: goto            539
        //   294: aload_0        
        //   295: getstatic       dev/nuker/pyro/fc.c:I
        //   298: ifge            306
        //   301: ldc             -108133920
        //   303: goto            308
        //   306: ldc             -1271231860
        //   308: ldc             -799424636
        //   310: ixor           
        //   311: lookupswitch {
        //          702004836: 306
        //          1684223240: 336
        //          default: 1427
        //        }
        //   336: getfield        dev/nuker/pyro/f43.3:F
        //   339: getstatic       dev/nuker/pyro/fc.0:I
        //   342: ifeq            350
        //   345: ldc             -1083491540
        //   347: goto            352
        //   350: ldc             -2090013749
        //   352: ldc             -1968189377
        //   354: ixor           
        //   355: lookupswitch {
        //          163789812: 380
        //          902097683: 350
        //          default: 1415
        //        }
        //   380: fload_1        
        //   381: fcmpg          
        //   382: ifge            539
        //   385: getstatic       dev/nuker/pyro/fc.c:I
        //   388: ifge            396
        //   391: ldc             1023526458
        //   393: goto            398
        //   396: ldc             -1306409812
        //   398: ldc             -1174778611
        //   400: ixor           
        //   401: lookupswitch {
        //          -2063889609: 1435
        //          -1225597696: 396
        //          default: 428
        //        }
        //   428: aload_0        
        //   429: dup            
        //   430: getfield        dev/nuker/pyro/f43.3:F
        //   433: fload           5
        //   435: fadd           
        //   436: putfield        dev/nuker/pyro/f43.3:F
        //   439: aload_0        
        //   440: getstatic       dev/nuker/pyro/fc.1:I
        //   443: ifeq            451
        //   446: ldc             -1511507383
        //   448: goto            453
        //   451: ldc             -81504158
        //   453: ldc             -76859857
        //   455: ixor           
        //   456: lookupswitch {
        //          -1730951117: 451
        //          1585646694: 1437
        //          default: 484
        //        }
        //   484: getfield        dev/nuker/pyro/f43.3:F
        //   487: fload_1        
        //   488: fcmpl          
        //   489: iflt            539
        //   492: aload_0        
        //   493: fload_1        
        //   494: getstatic       dev/nuker/pyro/fc.0:I
        //   497: ifeq            505
        //   500: ldc             -1080821030
        //   502: goto            507
        //   505: ldc             239231229
        //   507: ldc             1324152319
        //   509: ixor           
        //   510: lookupswitch {
        //          -243331291: 1439
        //          -7673537: 505
        //          default: 536
        //        }
        //   536: putfield        dev/nuker/pyro/f43.3:F
        //   539: aload_0        
        //   540: getfield        dev/nuker/pyro/f43.c:Z
        //   543: ifeq            1124
        //   546: getstatic       dev/nuker/pyro/fc.0:I
        //   549: ifeq            557
        //   552: ldc             -916494771
        //   554: goto            559
        //   557: ldc             -791263882
        //   559: ldc             -2106085495
        //   561: ixor           
        //   562: lookupswitch {
        //          -354177980: 557
        //          1260964292: 1407
        //          default: 588
        //        }
        //   588: iload_2        
        //   589: ifeq            1124
        //   592: aload_0        
        //   593: getfield        dev/nuker/pyro/f43.c:F
        //   596: bipush          10
        //   598: i2f            
        //   599: fcmpg          
        //   600: ifge            608
        //   603: ldc             2123511573
        //   605: goto            610
        //   608: ldc             2123511572
        //   610: ldc             1014752763
        //   612: ixor           
        //   613: tableswitch {
        //          -2049727012: 636
        //          -2049727011: 1124
        //          default: 603
        //        }
        //   636: getstatic       dev/nuker/pyro/fc.1:I
        //   639: ifeq            647
        //   642: ldc             543004492
        //   644: goto            649
        //   647: ldc             110751182
        //   649: ldc             572871879
        //   651: ixor           
        //   652: lookupswitch {
        //          41468811: 647
        //          616347913: 680
        //          default: 1433
        //        }
        //   680: fload           4
        //   682: fstore          6
        //   684: iconst_0       
        //   685: istore          7
        //   687: iconst_0       
        //   688: istore          8
        //   690: fload           6
        //   692: fstore          9
        //   694: iconst_0       
        //   695: getstatic       dev/nuker/pyro/fc.0:I
        //   698: ifeq            706
        //   701: ldc             1674173526
        //   703: goto            708
        //   706: ldc             -315031872
        //   708: ldc             -1969574403
        //   710: ixor           
        //   711: lookupswitch {
        //          -380407381: 706
        //          1738691389: 736
        //          default: 1405
        //        }
        //   736: istore          10
        //   738: getstatic       dev/nuker/pyro/fc.0:I
        //   741: ifeq            749
        //   744: ldc             -1366834060
        //   746: goto            751
        //   749: ldc             170590129
        //   751: ldc             1346154288
        //   753: ixor           
        //   754: lookupswitch {
        //          -21271740: 749
        //          1511411841: 780
        //          default: 1411
        //        }
        //   780: aload_0        
        //   781: dup            
        //   782: getfield        dev/nuker/pyro/f43.c:F
        //   785: fload           9
        //   787: fadd           
        //   788: getstatic       dev/nuker/pyro/fc.1:I
        //   791: ifeq            799
        //   794: ldc             -284996069
        //   796: goto            801
        //   799: ldc             843247832
        //   801: ldc             381536610
        //   803: ixor           
        //   804: lookupswitch {
        //          -104953991: 799
        //          620706234: 832
        //          default: 1429
        //        }
        //   832: putfield        dev/nuker/pyro/f43.c:F
        //   835: getstatic       dev/nuker/pyro/fc.c:I
        //   838: ifge            846
        //   841: ldc             -1787611245
        //   843: goto            848
        //   846: ldc             396344648
        //   848: ldc             1649662074
        //   850: ixor           
        //   851: lookupswitch {
        //          -148836375: 846
        //          1976329522: 876
        //          default: 1409
        //        }
        //   876: aload_0        
        //   877: getfield        dev/nuker/pyro/f43.c:F
        //   880: bipush          10
        //   882: i2f            
        //   883: fcmpl          
        //   884: iflt            1122
        //   887: aload_0        
        //   888: goto            892
        //   891: athrow         
        //   892: invokevirtual   dev/nuker/pyro/f43.7:()Z
        //   895: goto            899
        //   898: athrow         
        //   899: ifeq            907
        //   902: ldc             1766546838
        //   904: goto            909
        //   907: ldc             1766546839
        //   909: ldc_w           1136581766
        //   912: ixor           
        //   913: tableswitch {
        //          1441464864: 936
        //          1441464865: 1120
        //          default: 902
        //        }
        //   936: aload_0        
        //   937: iconst_1       
        //   938: putfield        dev/nuker/pyro/f43.1:Z
        //   941: getstatic       dev/nuker/pyro/fc.1:I
        //   944: ifeq            953
        //   947: ldc_w           759628674
        //   950: goto            956
        //   953: ldc_w           -1099292666
        //   956: ldc_w           1627629725
        //   959: ixor           
        //   960: lookupswitch {
        //          -1492996091: 953
        //          1279568671: 1445
        //          default: 988
        //        }
        //   988: aload_0        
        //   989: getstatic       dev/nuker/pyro/fc.c:I
        //   992: ifge            1001
        //   995: ldc_w           -1160557932
        //   998: goto            1004
        //  1001: ldc_w           1893154770
        //  1004: ldc_w           646167443
        //  1007: ixor           
        //  1008: lookupswitch {
        //          -1672417017: 1419
        //          -953952149: 1001
        //          default: 1036
        //        }
        //  1036: getfield        dev/nuker/pyro/f43.c:Ljava/lang/Runnable;
        //  1039: ifnull          1120
        //  1042: aload_0        
        //  1043: getfield        dev/nuker/pyro/f43.c:Ljava/lang/Runnable;
        //  1046: dup            
        //  1047: ifnonnull       1107
        //  1050: getstatic       dev/nuker/pyro/fc.1:I
        //  1053: ifeq            1062
        //  1056: ldc_w           1152052465
        //  1059: goto            1065
        //  1062: ldc_w           928312751
        //  1065: ldc_w           -877725557
        //  1068: ixor           
        //  1069: lookupswitch {
        //          -1895558022: 1062
        //          -50719452: 1096
        //          default: 1447
        //        }
        //  1096: goto            1100
        //  1099: athrow         
        //  1100: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //  1103: goto            1107
        //  1106: athrow         
        //  1107: goto            1111
        //  1110: athrow         
        //  1111: invokeinterface java/lang/Runnable.run:()V
        //  1116: goto            1120
        //  1119: athrow         
        //  1120: iconst_1       
        //  1121: ireturn        
        //  1122: iconst_0       
        //  1123: ireturn        
        //  1124: aload_0        
        //  1125: getfield        dev/nuker/pyro/f43.0:Z
        //  1128: ifeq            1403
        //  1131: iload_2        
        //  1132: ifeq            1403
        //  1135: getstatic       dev/nuker/pyro/fc.c:I
        //  1138: ifge            1147
        //  1141: ldc_w           2039780418
        //  1144: goto            1150
        //  1147: ldc_w           -714990918
        //  1150: ldc_w           472986301
        //  1153: ixor           
        //  1154: lookupswitch {
        //          -917297145: 1180
        //          1705355007: 1147
        //          default: 1443
        //        }
        //  1180: aload_0        
        //  1181: getfield        dev/nuker/pyro/f43.c:F
        //  1184: iconst_0       
        //  1185: i2f            
        //  1186: fcmpl          
        //  1187: ifle            1196
        //  1190: ldc_w           -1468301907
        //  1193: goto            1199
        //  1196: ldc_w           -1468301908
        //  1199: ldc_w           1835941145
        //  1202: ixor           
        //  1203: tableswitch {
        //          -1976925848: 1224
        //          -1976925847: 1347
        //          default: 1190
        //        }
        //  1224: getstatic       dev/nuker/pyro/fc.0:I
        //  1227: ifeq            1236
        //  1230: ldc_w           -521477289
        //  1233: goto            1239
        //  1236: ldc_w           741261806
        //  1239: ldc_w           256322962
        //  1242: ixor           
        //  1243: lookupswitch {
        //          -273822011: 1441
        //          1547940808: 1236
        //          default: 1268
        //        }
        //  1268: aload_0        
        //  1269: dup            
        //  1270: getfield        dev/nuker/pyro/f43.c:F
        //  1273: fload           4
        //  1275: fsub           
        //  1276: putfield        dev/nuker/pyro/f43.c:F
        //  1279: aload_0        
        //  1280: fconst_0       
        //  1281: aload_0        
        //  1282: getfield        dev/nuker/pyro/f43.c:F
        //  1285: goto            1289
        //  1288: athrow         
        //  1289: invokestatic    java/lang/Math.max:(FF)F
        //  1292: goto            1296
        //  1295: athrow         
        //  1296: getstatic       dev/nuker/pyro/fc.0:I
        //  1299: ifeq            1308
        //  1302: ldc_w           -1588056919
        //  1305: goto            1311
        //  1308: ldc_w           178365489
        //  1311: ldc_w           715149364
        //  1314: ixor           
        //  1315: lookupswitch {
        //          -1946649443: 1308
        //          536998917: 1340
        //          default: 1425
        //        }
        //  1340: putfield        dev/nuker/pyro/f43.c:F
        //  1343: iconst_0       
        //  1344: goto            1404
        //  1347: aload_0        
        //  1348: iconst_0       
        //  1349: getstatic       dev/nuker/pyro/fc.c:I
        //  1352: ifge            1361
        //  1355: ldc_w           1952791376
        //  1358: goto            1364
        //  1361: ldc_w           76591900
        //  1364: ldc_w           1259034637
        //  1367: ixor           
        //  1368: lookupswitch {
        //          1064199005: 1361
        //          1335618321: 1396
        //          default: 1413
        //        }
        //  1396: putfield        dev/nuker/pyro/f43.0:Z
        //  1399: iconst_1       
        //  1400: goto            1404
        //  1403: iconst_1       
        //  1404: ireturn        
        //  1405: aconst_null    
        //  1406: athrow         
        //  1407: aconst_null    
        //  1408: athrow         
        //  1409: aconst_null    
        //  1410: athrow         
        //  1411: aconst_null    
        //  1412: athrow         
        //  1413: aconst_null    
        //  1414: athrow         
        //  1415: aconst_null    
        //  1416: athrow         
        //  1417: aconst_null    
        //  1418: athrow         
        //  1419: aconst_null    
        //  1420: athrow         
        //  1421: aconst_null    
        //  1422: athrow         
        //  1423: aconst_null    
        //  1424: athrow         
        //  1425: aconst_null    
        //  1426: athrow         
        //  1427: aconst_null    
        //  1428: athrow         
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
        //  1449: pop            
        //  1450: goto            24
        //  1453: pop            
        //  1454: aconst_null    
        //  1455: goto            1449
        //  1458: dup            
        //  1459: ifnull          1449
        //  1462: checkcast       Ljava/lang/Throwable;
        //  1465: athrow         
        //  1466: dup            
        //  1467: ifnull          1453
        //  1470: checkcast       Ljava/lang/Throwable;
        //  1473: athrow         
        //  1474: aconst_null    
        //  1475: athrow         
        //    StackMapTable: 00 89 43 07 00 1E 04 FF 00 0B 00 00 00 01 07 00 1E FE 00 03 07 00 03 02 01 0A 41 01 1E 42 07 00 1E 00 45 07 00 1E 40 01 FF 00 11 00 04 07 00 03 02 01 02 00 01 02 FF 00 01 00 04 07 00 03 02 01 02 00 02 02 01 5C 02 FD 00 14 02 02 41 01 1C 22 FF 00 15 00 06 07 00 03 02 01 02 02 02 00 02 07 00 03 07 00 03 FF 00 01 00 06 07 00 03 02 01 02 02 02 00 03 07 00 03 07 00 03 01 FF 00 1C 00 06 07 00 03 02 01 02 02 02 00 02 07 00 03 07 00 03 19 4B 07 00 03 FF 00 01 00 06 07 00 03 02 01 02 02 02 00 02 07 00 03 01 5B 07 00 03 4D 02 FF 00 01 00 06 07 00 03 02 01 02 02 02 00 02 02 01 5B 02 0F 41 01 1D 56 07 00 03 FF 00 01 00 06 07 00 03 02 01 02 02 02 00 02 07 00 03 01 5E 07 00 03 FF 00 14 00 06 07 00 03 02 01 02 02 02 00 02 07 00 03 02 FF 00 01 00 06 07 00 03 02 01 02 02 02 00 03 07 00 03 02 01 FF 00 1C 00 06 07 00 03 02 01 02 02 02 00 02 07 00 03 02 02 11 41 01 1C 0E 04 41 01 19 0A 41 01 1E FF 00 19 00 0A 07 00 03 02 01 02 02 02 02 01 01 02 00 01 01 FF 00 01 00 0A 07 00 03 02 01 02 02 02 02 01 01 02 00 02 01 01 5B 01 FC 00 0C 01 41 01 1C FF 00 12 00 0B 07 00 03 02 01 02 02 02 02 01 01 02 01 00 02 07 00 03 02 FF 00 01 00 0B 07 00 03 02 01 02 02 02 02 01 01 02 01 00 03 07 00 03 02 01 FF 00 1E 00 0B 07 00 03 02 01 02 02 02 02 01 01 02 01 00 02 07 00 03 02 0D 41 01 1B 4E 07 00 1E 40 07 00 03 45 07 00 1E 40 01 02 04 41 01 1A 10 42 01 1F 4C 07 00 03 FF 00 02 00 0B 07 00 03 02 01 02 02 02 02 01 01 02 01 00 02 07 00 03 01 5F 07 00 03 59 07 01 14 FF 00 02 00 0B 07 00 03 02 01 02 02 02 02 01 01 02 01 00 02 07 01 14 01 5E 07 01 14 42 07 00 17 40 07 01 14 45 07 00 1E 40 07 01 14 42 07 00 1E 40 07 01 14 47 07 00 1E 00 01 FF 00 01 00 06 07 00 03 02 01 02 02 02 00 00 16 42 01 1D 09 05 42 01 18 0B 42 01 1C 53 07 00 1E FF 00 00 00 06 07 00 03 02 01 02 02 02 00 03 07 00 03 02 02 45 07 00 1E FF 00 00 00 06 07 00 03 02 01 02 02 02 00 02 07 00 03 02 FF 00 0B 00 06 07 00 03 02 01 02 02 02 00 02 07 00 03 02 FF 00 02 00 06 07 00 03 02 01 02 02 02 00 03 07 00 03 02 01 FF 00 1C 00 06 07 00 03 02 01 02 02 02 00 02 07 00 03 02 06 FF 00 0D 00 06 07 00 03 02 01 02 02 02 00 02 07 00 03 01 FF 00 02 00 06 07 00 03 02 01 02 02 02 00 03 07 00 03 01 01 FF 00 1F 00 06 07 00 03 02 01 02 02 02 00 02 07 00 03 01 06 40 01 FF 00 00 00 0A 07 00 03 02 01 02 02 02 02 01 01 02 00 01 01 FF 00 01 00 06 07 00 03 02 01 02 02 02 00 00 FF 00 01 00 0B 07 00 03 02 01 02 02 02 02 01 01 02 01 00 00 01 FF 00 01 00 06 07 00 03 02 01 02 02 02 00 02 07 00 03 01 41 02 FF 00 01 00 04 07 00 03 02 01 02 00 01 02 FF 00 01 00 0B 07 00 03 02 01 02 02 02 02 01 01 02 01 00 01 07 00 03 FF 00 01 00 06 07 00 03 02 01 02 02 02 00 02 07 00 03 07 00 03 F8 00 01 FF 00 01 00 06 07 00 03 02 01 02 02 02 00 02 07 00 03 02 41 07 00 03 FF 00 01 00 0B 07 00 03 02 01 02 02 02 02 01 01 02 01 00 02 07 00 03 02 FF 00 01 00 06 07 00 03 02 01 02 02 02 00 00 01 01 41 07 00 03 FF 00 01 00 06 07 00 03 02 01 02 02 02 00 02 07 00 03 02 01 01 FF 00 01 00 0B 07 00 03 02 01 02 02 02 02 01 01 02 01 00 00 41 07 01 14 FF 00 01 00 03 07 00 03 02 01 00 01 07 00 1E 43 05 44 07 00 1E 47 05 47 07 00 1E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1458   1466   Any
        //  1458   1466   1458   1466   Any
        //  1474   1476   3      8      Any
        //  71     78     78     79     Any
        //  72     78     71     72     Any
        //  71     78     78     79     Ljava/lang/ArithmeticException;
        //  71     78     3      8      Ljava/util/ConcurrentModificationException;
        //  71     78     71     72     Ljava/lang/IllegalArgumentException;
        //  891    898    898    899    Any
        //  891    898    898    899    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  891    898    898    899    Ljava/lang/IndexOutOfBoundsException;
        //  892    898    898    899    Ljava/lang/IllegalArgumentException;
        //  892    898    891    892    Any
        //  1099   1106   1106   1107   Any
        //  1100   1106   3      8      Any
        //  1100   1106   1099   1100   Ljava/lang/NegativeArraySizeException;
        //  1099   1106   3      8      Any
        //  1099   1106   1106   1107   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1110   1119   1119   1120   Any
        //  1111   1119   3      8      Any
        //  1110   1119   3      8      Any
        //  1110   1119   1110   1111   Any
        //  1111   1119   3      8      Any
        //  1288   1295   1295   1296   Any
        //  1289   1295   1295   1296   Ljava/lang/ClassCastException;
        //  1288   1295   1288   1289   Any
        //  1289   1295   1288   1289   Any
        //  1288   1295   1288   1289   Any
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
    
    @NotNull
    public String 8() {
        return fbS.50(this, 1973037320);
    }
    
    public boolean 7() {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0084:
            while (true) {
                do {
                    Label_0071: {
                        break Label_0071;
                        try {
                            o = null;
                            if (fc.c >= 0) {
                                null;
                                goto Label_0076;
                            }
                            continue Label_0084;
                            // iftrue(Label_0028:, fc.c >= 0)
                            Block_4: {
                                break Block_4;
                                Label_0065: {
                                    throw null;
                                }
                                Label_0060:
                                return this.3;
                            }
                            int n = -510608666;
                            Label_0031: {
                                break Label_0031;
                                Label_0028: {
                                    n = -1079197550;
                                }
                            }
                        }
                        // switch([Lcom.strobel.decompiler.ast.Label;@3419158b, n ^ 0x6BB49EC1)
                        catch (ArithmeticException ex) {}
                    }
                    continue Label_0084;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public float 4() {
        return fbS.at(this, 1202885136);
    }
    
    public void c(final int n, final int n2, final int n3) {
        fbS.b4(this, 262210628, n, n2, n3);
    }
    
    @JvmOverloads
    public f43(@NotNull final String c, @NotNull final String 0, @NotNull final f49 c2, @NotNull final f44 c3, final boolean 2) {
        while (true) {
            int n = 0;
            Label_0024: {
                if (fc.0 != 0) {
                    n = -1400583085;
                    break Label_0024;
                }
                n = -1682560811;
            }
            switch (n ^ 0x45063871) {
                case 1947073428: {
                    continue;
                }
                default: {
                    this.c = c;
                    while (true) {
                        int n2 = 0;
                        Label_0082: {
                            if (fc.0 != 0) {
                                n2 = -1238865520;
                                break Label_0082;
                            }
                            n2 = 1098689443;
                        }
                        switch (n2 ^ 0xFE3777C0) {
                            case 1209998928: {
                                continue;
                            }
                            case -1085547421: {
                                this.0 = 0;
                                this.3 = 2;
                                this.2 = true;
                                this.0 = true;
                                this.c = c3;
                                while (true) {
                                    int n3 = 0;
                                    Label_0152: {
                                        if (fc.1 != 0) {
                                            n3 = -309511758;
                                            break Label_0152;
                                        }
                                        n3 = -253309317;
                                    }
                                    switch (n3 ^ 0xFC62E091) {
                                        case -1193821106: {
                                            continue;
                                        }
                                        default: {
                                            this.c = c2;
                                            while (true) {
                                                int n4 = 0;
                                                Label_0204: {
                                                    if (fc.0 != 0) {
                                                        n4 = 886888640;
                                                        break Label_0204;
                                                    }
                                                    n4 = 1996537309;
                                                }
                                                switch (n4 ^ 0x2DBE4D83) {
                                                    case 1778907070: {
                                                        continue;
                                                    }
                                                    default: {
                                                        while (true) {
                                                            int n5 = 0;
                                                            Label_0252: {
                                                                if (fc.c < 0) {
                                                                    n5 = -1211682804;
                                                                    break Label_0252;
                                                                }
                                                                n5 = 36990172;
                                                            }
                                                            switch (n5 ^ 0x4B478EAC) {
                                                                case -2042070635: {
                                                                    continue;
                                                                }
                                                                default: {
                                                                    this.c(this.3);
                                                                    return;
                                                                }
                                                                case -58671456: {
                                                                    throw null;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 425891139: {
                                                        throw null;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        case 300931363: {
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
                case -377293790: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void 3(final float n) {
        fbS.8z(this, 1919721839, n);
    }
    
    public float 2() {
        return fbS.aa(this, 2055305633);
    }
    
    public float 6() {
        return fbS.bc(this, 1474922797);
    }
    
    public void c(@Nullable final f45 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: iflt            85
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            77
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: getstatic       dev/nuker/pyro/fc.c:I
        //    19: ifge            28
        //    22: ldc_w           1773784377
        //    25: goto            31
        //    28: ldc_w           1223604416
        //    31: ldc_w           -1121175013
        //    34: ixor           
        //    35: lookupswitch {
        //          -728369374: 66
        //          728221405: 28
        //          default: 60
        //        }
        //    60: aload_0        
        //    61: aload_1        
        //    62: putfield        dev/nuker/pyro/f43.c:Ldev/nuker/pyro/f45;
        //    65: return         
        //    66: aconst_null    
        //    67: athrow         
        //    68: pop            
        //    69: goto            16
        //    72: pop            
        //    73: aconst_null    
        //    74: goto            68
        //    77: dup            
        //    78: ifnull          68
        //    81: checkcast       Ljava/lang/Throwable;
        //    84: athrow         
        //    85: dup            
        //    86: ifnull          72
        //    89: checkcast       Ljava/lang/Throwable;
        //    92: athrow         
        //    StackMapTable: 00 0A FF 00 0C 00 00 00 01 07 00 1E FD 00 03 07 00 03 07 01 6C 0B 42 01 1C 05 41 07 00 1E 43 05 44 07 00 1E 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     77     85     Any
        //  77     85     77     85     Any
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
}
