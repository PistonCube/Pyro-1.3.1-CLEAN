// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.state.IBlockState;
import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.BlockPos;

public class fax
{
    @NotNull
    public BlockPos c;
    @NotNull
    public IBlockState c;
    @Nullable
    public TileEntity c;
    @NotNull
    public static List<faw> c;
    public static fav c;
    
    public static void c(final List list) {
        fbS.fD(null, 471394636, list);
    }
    
    public void c(@NotNull final BlockPos blockPos) {
        fbS.3Z(this, 110723364, blockPos);
    }
    
    @Nullable
    public TileEntity 1() {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0083:
            while (true) {
            Label_0066_Outer:
                do {
                    Label_0070: {
                        break Label_0070;
                        while (true) {
                            try {
                                o = null;
                                if (fc.1 > 0) {
                                    continue Label_0083;
                                }
                                null;
                                // iftrue(Label_0028:, fc.1 == 0)
                                Label_0030: {
                                    while (true) {
                                        final int n = -320750616;
                                        break Label_0030;
                                        Label_0064: {
                                            throw null;
                                        }
                                        continue Label_0066_Outer;
                                    }
                                    Label_0028: {
                                        final int n = 1419014472;
                                    }
                                }
                                // switch([Lcom.strobel.decompiler.ast.Label;@7ce167fc, n ^ 0xA0AA901D)
                                continue;
                                Label_0060: {
                                    return this.c;
                                }
                            }
                            catch (IllegalStateException ex) {
                                if (ex != null) {
                                    throw ex;
                                }
                                continue;
                            }
                            break;
                        }
                    }
                    continue Label_0083;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public fax(@NotNull final BlockPos c, @NotNull final IBlockState c2, @Nullable final TileEntity c3) {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.0 != 0) {
                    n = 43464273;
                    break Label_0017;
                }
                n = -2044592360;
            }
            switch (n ^ 0x488999F7) {
                case -255911878: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0062: {
                            if (fc.c < 0) {
                                n2 = -827815623;
                                break Label_0062;
                            }
                            n2 = -651146284;
                        }
                        switch (n2 ^ 0x21356538) {
                            case -505933015: {
                                continue;
                            }
                            default: {
                                this.c = c;
                                while (true) {
                                    int n3 = 0;
                                    Label_0113: {
                                        if (fc.c < 0) {
                                            n3 = -1071752031;
                                            break Label_0113;
                                        }
                                        n3 = 1762352293;
                                    }
                                    switch (n3 ^ 0xE305543B) {
                                        case 588974234: {
                                            continue;
                                        }
                                        case -1978791778: {
                                            while (true) {
                                                int n4 = 0;
                                                Label_0158: {
                                                    if (fc.c < 0) {
                                                        n4 = 1604519689;
                                                        break Label_0158;
                                                    }
                                                    n4 = -1045581575;
                                                }
                                                switch (n4 ^ 0x554E2800) {
                                                    case -294274300: {
                                                        continue;
                                                    }
                                                    default: {
                                                        this.c = c2;
                                                        while (true) {
                                                            int n5 = 0;
                                                            Label_0206: {
                                                                if (fc.c < 0) {
                                                                    n5 = -504785378;
                                                                    break Label_0206;
                                                                }
                                                                n5 = -260588731;
                                                            }
                                                            switch (n5 ^ 0x8B06724C) {
                                                                case 1794106450: {
                                                                    continue;
                                                                }
                                                                case 2071054601: {
                                                                    this.c = c3;
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
                                                    case 183316233: {
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
                            case -274863103: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 1243525030: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static List 2() {
        return fbS.gC(null, 1135406151);
    }
    
    @NotNull
    public BlockPos c() {
        return fbS.7P(this, 166591368);
    }
    
    @NotNull
    public String 0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          472
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            464
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            456
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/lang/StringBuilder;
        //    27: dup            
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   java/lang/StringBuilder.<init>:()V
        //    35: goto            39
        //    38: athrow         
        //    39: ldc             "["
        //    41: goto            45
        //    44: athrow         
        //    45: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    48: goto            52
        //    51: athrow         
        //    52: aload_0        
        //    53: getfield        dev/nuker/pyro/fax.c:Lnet/minecraft/util/math/BlockPos;
        //    56: goto            60
        //    59: athrow         
        //    60: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //    63: goto            67
        //    66: athrow         
        //    67: goto            71
        //    70: athrow         
        //    71: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    74: goto            78
        //    77: athrow         
        //    78: ldc             " "
        //    80: goto            84
        //    83: athrow         
        //    84: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    87: goto            91
        //    90: athrow         
        //    91: getstatic       dev/nuker/pyro/fc.0:I
        //    94: ifeq            102
        //    97: ldc             1524283344
        //    99: goto            104
        //   102: ldc             68576058
        //   104: ldc             -1284838155
        //   106: ixor           
        //   107: lookupswitch {
        //          -374318299: 439
        //          1634322134: 102
        //          default: 132
        //        }
        //   132: aload_0        
        //   133: getfield        dev/nuker/pyro/fax.c:Lnet/minecraft/util/math/BlockPos;
        //   136: getstatic       dev/nuker/pyro/fc.0:I
        //   139: ifeq            147
        //   142: ldc             -1568834615
        //   144: goto            149
        //   147: ldc             548946927
        //   149: ldc             159954821
        //   151: ixor           
        //   152: lookupswitch {
        //          -1409954740: 437
        //          -1000148358: 147
        //          default: 180
        //        }
        //   180: goto            184
        //   183: athrow         
        //   184: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //   187: goto            191
        //   190: athrow         
        //   191: goto            195
        //   194: athrow         
        //   195: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   198: goto            202
        //   201: athrow         
        //   202: ldc             " "
        //   204: goto            208
        //   207: athrow         
        //   208: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   211: goto            215
        //   214: athrow         
        //   215: getstatic       dev/nuker/pyro/fc.c:I
        //   218: ifge            226
        //   221: ldc             -1766126083
        //   223: goto            228
        //   226: ldc             -1171808339
        //   228: ldc             1542903988
        //   230: ixor           
        //   231: lookupswitch {
        //          -850537143: 226
        //          -506378471: 256
        //          default: 441
        //        }
        //   256: aload_0        
        //   257: getstatic       dev/nuker/pyro/fc.0:I
        //   260: ifeq            268
        //   263: ldc             1022265109
        //   265: goto            270
        //   268: ldc             1902100120
        //   270: ldc             560039469
        //   272: ixor           
        //   273: lookupswitch {
        //          495911224: 443
        //          1986329931: 268
        //          default: 300
        //        }
        //   300: getfield        dev/nuker/pyro/fax.c:Lnet/minecraft/util/math/BlockPos;
        //   303: goto            307
        //   306: athrow         
        //   307: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //   310: goto            314
        //   313: athrow         
        //   314: getstatic       dev/nuker/pyro/fc.0:I
        //   317: ifeq            325
        //   320: ldc             -2132860561
        //   322: goto            327
        //   325: ldc             2016610862
        //   327: ldc             527262219
        //   329: ixor           
        //   330: lookupswitch {
        //          -1615707292: 325
        //          1734240293: 356
        //          default: 435
        //        }
        //   356: goto            360
        //   359: athrow         
        //   360: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   363: goto            367
        //   366: athrow         
        //   367: ldc             "]"
        //   369: getstatic       dev/nuker/pyro/fc.c:I
        //   372: ifge            380
        //   375: ldc             -362973734
        //   377: goto            382
        //   380: ldc             -97600470
        //   382: ldc             -5801006
        //   384: ixor           
        //   385: lookupswitch {
        //          92915704: 412
        //          368709128: 380
        //          default: 445
        //        }
        //   412: goto            416
        //   415: athrow         
        //   416: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   419: goto            423
        //   422: athrow         
        //   423: goto            427
        //   426: athrow         
        //   427: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   430: goto            434
        //   433: athrow         
        //   434: areturn        
        //   435: aconst_null    
        //   436: athrow         
        //   437: aconst_null    
        //   438: athrow         
        //   439: aconst_null    
        //   440: athrow         
        //   441: aconst_null    
        //   442: athrow         
        //   443: aconst_null    
        //   444: athrow         
        //   445: aconst_null    
        //   446: athrow         
        //   447: pop            
        //   448: goto            24
        //   451: pop            
        //   452: aconst_null    
        //   453: goto            447
        //   456: dup            
        //   457: ifnull          447
        //   460: checkcast       Ljava/lang/Throwable;
        //   463: athrow         
        //   464: dup            
        //   465: ifnull          451
        //   468: checkcast       Ljava/lang/Throwable;
        //   471: athrow         
        //   472: aconst_null    
        //   473: athrow         
        //    StackMapTable: 00 51 43 07 00 27 04 FF 00 0B 00 00 00 01 07 00 27 FC 00 03 07 00 03 FF 00 06 00 00 00 01 07 00 27 FF 00 00 00 01 07 00 03 00 02 08 00 18 08 00 18 45 07 00 27 40 07 00 75 FF 00 04 00 00 00 01 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 75 07 00 A4 45 07 00 27 40 07 00 75 46 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 75 07 00 4B 45 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 75 01 42 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 75 01 45 07 00 27 40 07 00 75 44 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 75 07 00 A4 45 07 00 27 40 07 00 75 4A 07 00 75 FF 00 01 00 01 07 00 03 00 02 07 00 75 01 5B 07 00 75 FF 00 0E 00 01 07 00 03 00 02 07 00 75 07 00 4B FF 00 01 00 01 07 00 03 00 03 07 00 75 07 00 4B 01 FF 00 1E 00 01 07 00 03 00 02 07 00 75 07 00 4B 42 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 75 07 00 4B 45 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 75 01 FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 75 01 45 07 00 27 40 07 00 75 44 07 00 73 FF 00 00 00 01 07 00 03 00 02 07 00 75 07 00 A4 45 07 00 27 40 07 00 75 4A 07 00 75 FF 00 01 00 01 07 00 03 00 02 07 00 75 01 5B 07 00 75 FF 00 0B 00 01 07 00 03 00 02 07 00 75 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 75 07 00 03 01 FF 00 1D 00 01 07 00 03 00 02 07 00 75 07 00 03 45 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 75 07 00 4B 45 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 75 01 FF 00 0A 00 01 07 00 03 00 02 07 00 75 01 FF 00 01 00 01 07 00 03 00 03 07 00 75 01 01 FF 00 1C 00 01 07 00 03 00 02 07 00 75 01 42 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 75 01 45 07 00 27 40 07 00 75 FF 00 0C 00 01 07 00 03 00 02 07 00 75 07 00 A4 FF 00 01 00 01 07 00 03 00 03 07 00 75 07 00 A4 01 FF 00 1D 00 01 07 00 03 00 02 07 00 75 07 00 A4 FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 75 07 00 A4 45 07 00 27 40 07 00 75 42 07 00 73 40 07 00 75 45 07 00 27 40 07 00 A4 FF 00 00 00 01 07 00 03 00 02 07 00 75 01 FF 00 01 00 01 07 00 03 00 02 07 00 75 07 00 4B 41 07 00 75 41 07 00 75 FF 00 01 00 01 07 00 03 00 02 07 00 75 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 75 07 00 A4 41 07 00 5F 43 05 44 07 00 5F 47 05 47 07 00 27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     456    464    Ljava/lang/IllegalArgumentException;
        //  456    464    456    464    Ljava/lang/NumberFormatException;
        //  472    474    3      8      Any
        //  32     38     38     39     Any
        //  32     38     38     39     Ljava/lang/EnumConstantNotPresentException;
        //  32     38     3      8      Ljava/lang/NegativeArraySizeException;
        //  32     38     38     39     Ljava/lang/NegativeArraySizeException;
        //  32     38     3      8      Ljava/lang/ArithmeticException;
        //  45     51     51     52     Any
        //  45     51     51     52     Ljava/lang/IllegalArgumentException;
        //  45     51     51     52     Any
        //  45     51     3      8      Ljava/lang/AssertionError;
        //  45     51     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  59     66     66     67     Any
        //  59     66     66     67     Any
        //  59     66     66     67     Ljava/lang/AssertionError;
        //  60     66     59     60     Ljava/lang/NumberFormatException;
        //  59     66     59     60     Any
        //  70     77     77     78     Any
        //  70     77     70     71     Ljava/lang/NullPointerException;
        //  70     77     70     71     Any
        //  70     77     70     71     Ljava/util/ConcurrentModificationException;
        //  70     77     77     78     Ljava/lang/ClassCastException;
        //  83     90     90     91     Any
        //  84     90     83     84     Any
        //  83     90     83     84     Any
        //  83     90     83     84     Any
        //  83     90     3      8      Ljava/lang/ClassCastException;
        //  183    190    190    191    Any
        //  184    190    183    184    Any
        //  184    190    190    191    Any
        //  184    190    3      8      Ljava/lang/ArithmeticException;
        //  184    190    190    191    Ljava/lang/ClassCastException;
        //  195    201    201    202    Any
        //  195    201    201    202    Any
        //  195    201    201    202    Any
        //  195    201    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  195    201    201    202    Any
        //  207    214    214    215    Any
        //  208    214    214    215    Any
        //  207    214    214    215    Ljava/lang/IllegalArgumentException;
        //  208    214    207    208    Ljava/lang/RuntimeException;
        //  208    214    3      8      Ljava/lang/IllegalStateException;
        //  306    313    313    314    Any
        //  306    313    306    307    Any
        //  307    313    313    314    Any
        //  306    313    306    307    Ljava/lang/IllegalArgumentException;
        //  307    313    306    307    Ljava/lang/RuntimeException;
        //  359    366    366    367    Any
        //  359    366    359    360    Any
        //  359    366    359    360    Ljava/lang/AssertionError;
        //  359    366    366    367    Ljava/lang/IllegalStateException;
        //  360    366    359    360    Any
        //  416    422    422    423    Any
        //  416    422    3      8      Any
        //  416    422    3      8      Ljava/lang/NumberFormatException;
        //  416    422    422    423    Ljava/lang/EnumConstantNotPresentException;
        //  416    422    3      8      Ljava/lang/NegativeArraySizeException;
        //  426    433    433    434    Any
        //  426    433    3      8      Any
        //  427    433    3      8      Ljava/util/ConcurrentModificationException;
        //  427    433    426    427    Ljava/lang/NumberFormatException;
        //  427    433    426    427    Ljava/lang/NullPointerException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:776)
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
    
    public void c(@NotNull final IBlockState c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0087:
            while (true) {
                do {
                    Label_0074: {
                        break Label_0074;
                        while (true) {
                            try {
                                o = null;
                                if (fc.c < 0) {
                                    continue Label_0087;
                                }
                                null;
                                Label_0064: {
                                    this.c = c;
                                }
                                return;
                                break Label_0070;
                                // iftrue(Label_0031:, fc.0 == 0)
                                Label_0033: {
                                    while (true) {
                                        int n = -1253635728;
                                        break Label_0033;
                                        Label_0031:
                                        n = 1717926732;
                                        break Label_0033;
                                        continue;
                                    }
                                    Label_0068:
                                    throw null;
                                }
                            }
                            // switch([Lcom.strobel.decompiler.ast.Label;@5ee5fbf2, n ^ 0x687E2AAF)
                            catch (UnsupportedOperationException ex) {
                                if (ex != null) {
                                    throw ex;
                                }
                                continue;
                            }
                            break;
                        }
                    }
                    continue Label_0087;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    static {
        fax.c = new fav(null);
        fax.c = new ArrayList<faw>();
    }
    
    public boolean 4() {
        return fbS.ej(this, 1278535471);
    }
    
    public void c(@Nullable final TileEntity p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: iflt            129
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            121
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getstatic       dev/nuker/pyro/fc.0:I
        //    20: ifeq            28
        //    23: ldc             1673810794
        //    25: goto            30
        //    28: ldc             -1125877878
        //    30: ldc             -936124341
        //    32: ixor           
        //    33: lookupswitch {
        //          -1409830111: 28
        //          1960286145: 60
        //          default: 110
        //        }
        //    60: aload_1        
        //    61: getstatic       dev/nuker/pyro/fc.c:I
        //    64: ifge            72
        //    67: ldc             1480298655
        //    69: goto            74
        //    72: ldc             610932072
        //    74: ldc             1298901464
        //    76: ixor           
        //    77: lookupswitch {
        //          -1263606888: 72
        //          357579079: 108
        //          default: 104
        //        }
        //   104: putfield        dev/nuker/pyro/fax.c:Lnet/minecraft/tileentity/TileEntity;
        //   107: return         
        //   108: aconst_null    
        //   109: athrow         
        //   110: aconst_null    
        //   111: athrow         
        //   112: pop            
        //   113: goto            16
        //   116: pop            
        //   117: aconst_null    
        //   118: goto            112
        //   121: dup            
        //   122: ifnull          112
        //   125: checkcast       Ljava/lang/Throwable;
        //   128: athrow         
        //   129: dup            
        //   130: ifnull          116
        //   133: checkcast       Ljava/lang/Throwable;
        //   136: athrow         
        //    StackMapTable: 00 0E FF 00 0C 00 00 00 01 07 00 27 FD 00 03 07 00 03 07 00 4F 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 4F 00 02 07 00 03 01 5D 07 00 03 FF 00 0B 00 02 07 00 03 07 00 4F 00 02 07 00 03 07 00 4F FF 00 01 00 02 07 00 03 07 00 4F 00 03 07 00 03 07 00 4F 01 FF 00 1D 00 02 07 00 03 07 00 4F 00 02 07 00 03 07 00 4F FF 00 03 00 02 07 00 03 07 00 4F 00 02 07 00 03 07 00 4F 41 07 00 03 41 07 00 27 43 05 44 07 00 27 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  0      12     121    129    Any
        //  121    129    121    129    Ljava/lang/ArrayIndexOutOfBoundsException;
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
    public fa 5() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          702
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            694
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            686
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            35
        //    30: ldc             387765979
        //    32: goto            37
        //    35: ldc             -1774096372
        //    37: ldc             937984534
        //    39: ixor           
        //    40: lookupswitch {
        //          273977455: 35
        //          552883405: 673
        //          default: 68
        //        }
        //    68: getstatic       dev/nuker/pyro/fa.c:Ldev/nuker/pyro/f9;
        //    71: new             Ljava/lang/StringBuilder;
        //    74: dup            
        //    75: getstatic       dev/nuker/pyro/fc.c:I
        //    78: ifge            86
        //    81: ldc             1103707098
        //    83: goto            88
        //    86: ldc             1583844644
        //    88: ldc             839964223
        //    90: ixor           
        //    91: lookupswitch {
        //          1819761435: 116
        //          1943662053: 86
        //          default: 657
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokespecial   java/lang/StringBuilder.<init>:()V
        //   123: goto            127
        //   126: athrow         
        //   127: aload_0        
        //   128: getstatic       dev/nuker/pyro/fc.0:I
        //   131: ifeq            139
        //   134: ldc             629015192
        //   136: goto            141
        //   139: ldc             -1618823808
        //   141: ldc             612711613
        //   143: ixor           
        //   144: lookupswitch {
        //          11240943: 139
        //          33242661: 659
        //          default: 172
        //        }
        //   172: getfield        dev/nuker/pyro/fax.c:Lnet/minecraft/block/state/IBlockState;
        //   175: goto            179
        //   178: athrow         
        //   179: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   184: goto            188
        //   187: athrow         
        //   188: dup            
        //   189: pop            
        //   190: goto            194
        //   193: athrow         
        //   194: invokevirtual   net/minecraft/block/Block.func_149732_F:()Ljava/lang/String;
        //   197: goto            201
        //   200: athrow         
        //   201: getstatic       dev/nuker/pyro/fc.0:I
        //   204: ifeq            212
        //   207: ldc             -932743467
        //   209: goto            214
        //   212: ldc             -416497508
        //   214: ldc             -417004049
        //   216: ixor           
        //   217: lookupswitch {
        //          273766703: 212
        //          792884026: 675
        //          default: 244
        //        }
        //   244: goto            248
        //   247: athrow         
        //   248: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   251: goto            255
        //   254: athrow         
        //   255: ldc             " "
        //   257: getstatic       dev/nuker/pyro/fc.c:I
        //   260: ifge            268
        //   263: ldc             1981922903
        //   265: goto            270
        //   268: ldc             -8623030
        //   270: ldc             -1348188124
        //   272: ixor           
        //   273: lookupswitch {
        //          -2112575108: 268
        //          -645532045: 661
        //          default: 300
        //        }
        //   300: goto            304
        //   303: athrow         
        //   304: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   307: goto            311
        //   310: athrow         
        //   311: aload_0        
        //   312: goto            316
        //   315: athrow         
        //   316: invokevirtual   dev/nuker/pyro/fax.0:()Ljava/lang/String;
        //   319: goto            323
        //   322: athrow         
        //   323: goto            327
        //   326: athrow         
        //   327: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   330: goto            334
        //   333: athrow         
        //   334: goto            338
        //   337: athrow         
        //   338: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   341: goto            345
        //   344: athrow         
        //   345: goto            349
        //   348: athrow         
        //   349: invokevirtual   dev/nuker/pyro/f9.c:(Ljava/lang/String;)Ldev/nuker/pyro/fa;
        //   352: goto            356
        //   355: athrow         
        //   356: getstatic       dev/nuker/pyro/fc.1:I
        //   359: ifeq            367
        //   362: ldc             -1702626949
        //   364: goto            369
        //   367: ldc             690577204
        //   369: ldc             321363339
        //   371: ixor           
        //   372: lookupswitch {
        //          -1985714960: 367
        //          974045887: 400
        //          default: 669
        //        }
        //   400: astore_1       
        //   401: getstatic       dev/nuker/pyro/fax.c:Ljava/util/List;
        //   404: goto            408
        //   407: athrow         
        //   408: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   413: goto            417
        //   416: athrow         
        //   417: astore_3       
        //   418: aload_3        
        //   419: goto            423
        //   422: athrow         
        //   423: invokeinterface java/util/Iterator.hasNext:()Z
        //   428: goto            432
        //   431: athrow         
        //   432: ifeq            655
        //   435: aload_3        
        //   436: getstatic       dev/nuker/pyro/fc.1:I
        //   439: ifeq            447
        //   442: ldc             -1640144593
        //   444: goto            449
        //   447: ldc             -735255706
        //   449: ldc_w           -1262673779
        //   452: ixor           
        //   453: lookupswitch {
        //          713048482: 447
        //          1620165611: 480
        //          default: 665
        //        }
        //   480: goto            484
        //   483: athrow         
        //   484: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   489: goto            493
        //   492: athrow         
        //   493: checkcast       Ldev/nuker/pyro/faw;
        //   496: getstatic       dev/nuker/pyro/fc.0:I
        //   499: ifeq            508
        //   502: ldc_w           2069820577
        //   505: goto            511
        //   508: ldc_w           1514769301
        //   511: ldc_w           -1113091359
        //   514: ixor           
        //   515: lookupswitch {
        //          -956733888: 671
        //          -302788748: 508
        //          default: 540
        //        }
        //   540: astore_2       
        //   541: getstatic       dev/nuker/pyro/fc.1:I
        //   544: ifeq            553
        //   547: ldc_w           -1737618467
        //   550: goto            556
        //   553: ldc_w           543214639
        //   556: ldc_w           1660456679
        //   559: ixor           
        //   560: lookupswitch {
        //          -90798790: 553
        //          1117274824: 588
        //          default: 663
        //        }
        //   588: aload_2        
        //   589: getstatic       dev/nuker/pyro/fc.c:I
        //   592: ifge            601
        //   595: ldc_w           -1837346742
        //   598: goto            604
        //   601: ldc_w           816494085
        //   604: ldc_w           -1174257889
        //   607: ixor           
        //   608: lookupswitch {
        //          -1968666342: 636
        //          679374677: 601
        //          default: 667
        //        }
        //   636: aload_0        
        //   637: aload_1        
        //   638: goto            642
        //   641: athrow         
        //   642: invokeinterface dev/nuker/pyro/faw.c:(Ldev/nuker/pyro/fax;Ldev/nuker/pyro/fa;)Z
        //   647: goto            651
        //   650: athrow         
        //   651: pop            
        //   652: goto            418
        //   655: aload_1        
        //   656: areturn        
        //   657: aconst_null    
        //   658: athrow         
        //   659: aconst_null    
        //   660: athrow         
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
        //   677: pop            
        //   678: goto            24
        //   681: pop            
        //   682: aconst_null    
        //   683: goto            677
        //   686: dup            
        //   687: ifnull          677
        //   690: checkcast       Ljava/lang/Throwable;
        //   693: athrow         
        //   694: dup            
        //   695: ifnull          681
        //   698: checkcast       Ljava/lang/Throwable;
        //   701: athrow         
        //   702: aconst_null    
        //   703: athrow         
        //    StackMapTable: 00 67 43 07 00 27 04 FF 00 0B 00 00 00 01 07 00 27 FC 00 03 07 00 03 0A 41 01 1E FF 00 11 00 01 07 00 03 00 03 07 00 EE 08 00 47 08 00 47 FF 00 01 00 01 07 00 03 00 04 07 00 EE 08 00 47 08 00 47 01 FF 00 1B 00 01 07 00 03 00 03 07 00 EE 08 00 47 08 00 47 42 07 00 20 FF 00 00 00 01 07 00 03 00 03 07 00 EE 08 00 47 08 00 47 45 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 EE 07 00 75 FF 00 0B 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 03 FF 00 01 00 01 07 00 03 00 04 07 00 EE 07 00 75 07 00 03 01 FF 00 1E 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 03 45 07 00 27 FF 00 00 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 4D 47 07 00 27 FF 00 00 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 E1 44 07 00 27 FF 00 00 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 E1 45 07 00 27 FF 00 00 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 A4 FF 00 0A 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 A4 FF 00 01 00 01 07 00 03 00 04 07 00 EE 07 00 75 07 00 A4 01 FF 00 1D 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 A4 42 07 00 73 FF 00 00 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 A4 45 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 EE 07 00 75 FF 00 0C 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 A4 FF 00 01 00 01 07 00 03 00 04 07 00 EE 07 00 75 07 00 A4 01 FF 00 1D 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 A4 FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 A4 45 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 EE 07 00 75 43 07 00 A7 FF 00 00 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 03 45 07 00 27 FF 00 00 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 A4 42 07 00 5F FF 00 00 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 A4 45 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 EE 07 00 75 42 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 EE 07 00 75 45 07 00 27 FF 00 00 00 01 07 00 03 00 02 07 00 EE 07 00 A4 42 07 00 73 FF 00 00 00 01 07 00 03 00 02 07 00 EE 07 00 A4 45 07 00 27 40 07 00 D2 4A 07 00 D2 FF 00 01 00 01 07 00 03 00 02 07 00 D2 01 5E 07 00 D2 FF 00 06 00 00 00 01 07 00 27 FF 00 00 00 02 07 00 03 07 00 D2 00 01 07 00 B7 47 07 00 27 40 07 00 FA FD 00 00 00 07 00 FA 43 07 00 27 40 07 00 FA 47 07 00 27 40 01 4E 07 00 FA FF 00 01 00 04 07 00 03 07 00 D2 00 07 00 FA 00 02 07 00 FA 01 5E 07 00 FA 42 07 00 27 40 07 00 FA 47 07 00 27 40 07 00 05 4E 07 01 06 FF 00 02 00 04 07 00 03 07 00 D2 00 07 00 FA 00 02 07 01 06 01 5C 07 01 06 FF 00 0C 00 04 07 00 03 07 00 D2 07 01 06 07 00 FA 00 00 42 01 1F 4C 07 01 06 FF 00 02 00 04 07 00 03 07 00 D2 07 01 06 07 00 FA 00 02 07 01 06 01 5F 07 01 06 FF 00 04 00 00 00 01 07 00 27 FF 00 00 00 04 07 00 03 07 00 D2 07 01 06 07 00 FA 00 03 07 01 06 07 00 03 07 00 D2 47 07 00 27 40 01 FF 00 03 00 04 07 00 03 07 00 D2 00 07 00 FA 00 00 FF 00 01 00 01 07 00 03 00 03 07 00 EE 08 00 47 08 00 47 FF 00 01 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 A4 FE 00 01 07 00 D2 07 01 06 07 00 FA FF 00 01 00 04 07 00 03 07 00 D2 00 07 00 FA 00 01 07 00 FA FF 00 01 00 04 07 00 03 07 00 D2 07 01 06 07 00 FA 00 01 07 01 06 FF 00 01 00 01 07 00 03 00 01 07 00 D2 FF 00 01 00 04 07 00 03 07 00 D2 00 07 00 FA 00 01 07 01 06 F8 00 01 FF 00 01 00 01 07 00 03 00 03 07 00 EE 07 00 75 07 00 A4 41 07 00 27 43 05 44 07 00 27 47 05 47 07 00 27
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     686    694    Any
        //  686    694    686    694    Ljava/lang/EnumConstantNotPresentException;
        //  702    704    3      8      Any
        //  119    126    126    127    Any
        //  120    126    126    127    Any
        //  119    126    3      8      Ljava/util/ConcurrentModificationException;
        //  119    126    119    120    Ljava/lang/IllegalStateException;
        //  120    126    126    127    Ljava/util/ConcurrentModificationException;
        //  178    187    187    188    Any
        //  179    187    178    179    Any
        //  179    187    178    179    Ljava/lang/RuntimeException;
        //  179    187    178    179    Any
        //  178    187    178    179    Any
        //  193    200    200    201    Any
        //  194    200    200    201    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  194    200    200    201    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  193    200    200    201    Any
        //  193    200    193    194    Any
        //  247    254    254    255    Any
        //  248    254    247    248    Ljava/util/NoSuchElementException;
        //  248    254    3      8      Any
        //  247    254    247    248    Ljava/lang/NumberFormatException;
        //  247    254    3      8      Ljava/lang/UnsupportedOperationException;
        //  304    310    310    311    Any
        //  304    310    3      8      Any
        //  304    310    310    311    Any
        //  304    310    310    311    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  304    310    310    311    Any
        //  315    322    322    323    Any
        //  315    322    3      8      Ljava/lang/IllegalStateException;
        //  316    322    322    323    Ljava/lang/RuntimeException;
        //  315    322    3      8      Any
        //  315    322    315    316    Ljava/lang/UnsupportedOperationException;
        //  326    333    333    334    Any
        //  327    333    326    327    Ljava/lang/IllegalArgumentException;
        //  326    333    3      8      Any
        //  327    333    3      8      Any
        //  326    333    3      8      Any
        //  337    344    344    345    Any
        //  338    344    344    345    Any
        //  337    344    337    338    Ljava/lang/NullPointerException;
        //  337    344    337    338    Any
        //  338    344    344    345    Any
        //  348    355    355    356    Any
        //  348    355    3      8      Ljava/lang/IllegalArgumentException;
        //  348    355    348    349    Ljava/lang/RuntimeException;
        //  348    355    348    349    Ljava/util/ConcurrentModificationException;
        //  348    355    355    356    Ljava/lang/NegativeArraySizeException;
        //  408    416    416    417    Any
        //  408    416    416    417    Any
        //  408    416    416    417    Ljava/lang/EnumConstantNotPresentException;
        //  408    416    3      8      Ljava/util/NoSuchElementException;
        //  408    416    3      8      Any
        //  422    431    431    432    Any
        //  422    431    3      8      Ljava/lang/IllegalArgumentException;
        //  422    431    3      8      Ljava/lang/RuntimeException;
        //  423    431    431    432    Ljava/lang/NegativeArraySizeException;
        //  423    431    422    423    Any
        //  483    492    492    493    Any
        //  483    492    483    484    Ljava/util/NoSuchElementException;
        //  483    492    483    484    Any
        //  484    492    492    493    Any
        //  484    492    492    493    Any
        //  642    650    650    651    Any
        //  642    650    650    651    Any
        //  642    650    3      8      Any
        //  642    650    3      8      Ljava/lang/RuntimeException;
        //  642    650    3      8      Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:776)
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
    public IBlockState 3() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            38
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            30
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getfield        dev/nuker/pyro/fax.c:Lnet/minecraft/block/state/IBlockState;
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
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 27 FC 00 03 07 00 03 44 07 00 27 43 05 44 07 00 27 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     30     38     Any
        //  30     38     30     38     Any
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
