// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

public class f47 extends f49
{
    public f45 c;
    
    @Override
    public boolean 4() {
        return fbS.e6(this, 1309803711);
    }
    
    @Override
    public float 3() {
        return fbS.aK(this, 1391114825);
    }
    
    static {
        throw t;
    }
    
    public f47(final String s, final int n) {
        while (true) {
            int n2 = 0;
            Label_0013: {
                if (fc.c < 0) {
                    n2 = -806156502;
                    break Label_0013;
                }
                n2 = -1260570752;
            }
            switch (n2 ^ 0x47176BCF) {
                case 1653602512: {
                    continue;
                }
                default: {
                    super(s);
                    while (true) {
                        int n3 = 0;
                        Label_0062: {
                            if (fc.0 != 0) {
                                n3 = -616720522;
                                break Label_0062;
                            }
                            n3 = 1096716887;
                        }
                        switch (n3 ^ 0x47E9C9E0) {
                            case -1076620521: {
                                continue;
                            }
                            default: {
                                final f45 c = new f45(n);
                                while (true) {
                                    int n4 = 0;
                                    Label_0114: {
                                        if (fc.c < 0) {
                                            n4 = -716183894;
                                            break Label_0114;
                                        }
                                        n4 = 1338902139;
                                    }
                                    switch (n4 ^ 0xCB66A589) {
                                        case 577642396: {
                                            continue;
                                        }
                                        default: {
                                            this.c = c;
                                            return;
                                        }
                                        case 506020643: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case -1663803754: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case -1998295835: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @Override
    public void c(final f4d p0, final int p1, final ScaledResolution p2, final float p3, final float p4) {
        public class f46 extends ScaledResolution
        {
            public int c;
            public int 0;
            public f47 c;
            
            public f46(final f47 c, final Minecraft minecraft, final int c2, final int 0) {
                this.c = c;
                this.c = c2;
                this.0 = 0;
                while (true) {
                    int n = 0;
                    Label_0030: {
                        if (fc.1 != 0) {
                            n = -1722583161;
                            break Label_0030;
                        }
                        n = 58772840;
                    }
                    switch (n ^ 0x4A8D0000) {
                        case -338082826: {
                            continue;
                        }
                        default: {
                            super(minecraft);
                        }
                        case -740395129: {
                            throw null;
                        }
                    }
                    break;
                }
            }
            
            static {
                throw t;
            }
            
            public int func_78326_a() {
                return fbS.bw(this, 1611227224);
            }
            
            public int func_78328_b() {
                return fbS.b5(this, 947804048);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          370
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            362
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            354
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f47.c:Ldev/nuker/pyro/f45;
        //    28: iload_2        
        //    29: getstatic       dev/nuker/pyro/fc.c:I
        //    32: ifge            40
        //    35: ldc             -1291170813
        //    37: goto            42
        //    40: ldc             451967661
        //    42: ldc             -1982461880
        //    44: ixor           
        //    45: lookupswitch {
        //          -1758474939: 40
        //          987513931: 343
        //          default: 72
        //        }
        //    72: putfield        dev/nuker/pyro/f45.c:I
        //    75: aload_0        
        //    76: getstatic       dev/nuker/pyro/fc.0:I
        //    79: ifeq            87
        //    82: ldc             1253326539
        //    84: goto            89
        //    87: ldc             -461473811
        //    89: ldc             1105261503
        //    91: ixor           
        //    92: lookupswitch {
        //          18563380: 87
        //          190106996: 337
        //          default: 120
        //        }
        //   120: getfield        dev/nuker/pyro/f47.c:Ldev/nuker/pyro/f45;
        //   123: goto            127
        //   126: athrow         
        //   127: invokevirtual   dev/nuker/pyro/f45.c:()F
        //   130: goto            134
        //   133: athrow         
        //   134: f2i            
        //   135: istore          6
        //   137: aload_0        
        //   138: getfield        dev/nuker/pyro/f47.c:Ldev/nuker/pyro/f45;
        //   141: goto            145
        //   144: athrow         
        //   145: invokevirtual   dev/nuker/pyro/f45.0:()F
        //   148: goto            152
        //   151: athrow         
        //   152: f2i            
        //   153: istore          7
        //   155: aload_0        
        //   156: getfield        dev/nuker/pyro/f47.c:Ldev/nuker/pyro/f45;
        //   159: new             Ldev/nuker/pyro/f46;
        //   162: dup            
        //   163: getstatic       dev/nuker/pyro/fc.c:I
        //   166: ifge            174
        //   169: ldc             58545536
        //   171: goto            176
        //   174: ldc             -1787916757
        //   176: ldc             530738384
        //   178: ixor           
        //   179: lookupswitch {
        //          -1966284037: 204
        //          484391248: 174
        //          default: 339
        //        }
        //   204: aload_0        
        //   205: getstatic       dev/nuker/pyro/fc.0:I
        //   208: ifeq            216
        //   211: ldc             981616485
        //   213: goto            218
        //   216: ldc             88210772
        //   218: ldc             -1686181064
        //   220: ixor           
        //   221: lookupswitch {
        //          -1577276323: 341
        //          -243140400: 216
        //          default: 248
        //        }
        //   248: getstatic       dev/nuker/pyro/f47.c:Lnet/minecraft/client/Minecraft;
        //   251: iload           6
        //   253: iload           7
        //   255: getstatic       dev/nuker/pyro/fc.c:I
        //   258: ifge            266
        //   261: ldc             -1582470108
        //   263: goto            268
        //   266: ldc             1093243969
        //   268: ldc             -1950710685
        //   270: ixor           
        //   271: lookupswitch {
        //          706209863: 335
        //          1551943690: 266
        //          default: 296
        //        }
        //   296: goto            300
        //   299: athrow         
        //   300: invokespecial   dev/nuker/pyro/f46.<init>:(Ldev/nuker/pyro/f47;Lnet/minecraft/client/Minecraft;II)V
        //   303: goto            307
        //   306: athrow         
        //   307: fload           4
        //   309: f2i            
        //   310: fload           5
        //   312: f2i            
        //   313: getstatic       dev/nuker/pyro/f47.c:Lnet/minecraft/client/Minecraft;
        //   316: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //   319: instanceof      Ldev/nuker/pyro/f42;
        //   322: goto            326
        //   325: athrow         
        //   326: invokevirtual   dev/nuker/pyro/f45.c:(Lnet/minecraft/client/gui/ScaledResolution;IIZ)F
        //   329: goto            333
        //   332: athrow         
        //   333: pop            
        //   334: return         
        //   335: aconst_null    
        //   336: athrow         
        //   337: aconst_null    
        //   338: athrow         
        //   339: aconst_null    
        //   340: athrow         
        //   341: aconst_null    
        //   342: athrow         
        //   343: aconst_null    
        //   344: athrow         
        //   345: pop            
        //   346: goto            24
        //   349: pop            
        //   350: aconst_null    
        //   351: goto            345
        //   354: dup            
        //   355: ifnull          345
        //   358: checkcast       Ljava/lang/Throwable;
        //   361: athrow         
        //   362: dup            
        //   363: ifnull          349
        //   366: checkcast       Ljava/lang/Throwable;
        //   369: athrow         
        //   370: aconst_null    
        //   371: athrow         
        //    StackMapTable: 00 2D 43 07 00 4B 04 FF 00 0B 00 00 00 01 07 00 4B FF 00 03 00 06 07 00 03 07 00 74 01 07 00 76 02 02 00 00 FF 00 0F 00 06 07 00 03 07 00 74 01 07 00 76 02 02 00 02 07 00 2E 01 FF 00 01 00 06 07 00 03 07 00 74 01 07 00 76 02 02 00 03 07 00 2E 01 01 FF 00 1D 00 06 07 00 03 07 00 74 01 07 00 76 02 02 00 02 07 00 2E 01 4E 07 00 03 FF 00 01 00 06 07 00 03 07 00 74 01 07 00 76 02 02 00 02 07 00 03 01 5E 07 00 03 45 07 00 4B 40 07 00 2E 45 07 00 4B 40 02 FF 00 09 00 07 07 00 03 07 00 74 01 07 00 76 02 02 01 00 01 07 00 4B 40 07 00 2E 45 07 00 4B 40 02 FF 00 15 00 08 07 00 03 07 00 74 01 07 00 76 02 02 01 01 00 03 07 00 2E 08 00 9F 08 00 9F FF 00 01 00 08 07 00 03 07 00 74 01 07 00 76 02 02 01 01 00 04 07 00 2E 08 00 9F 08 00 9F 01 FF 00 1B 00 08 07 00 03 07 00 74 01 07 00 76 02 02 01 01 00 03 07 00 2E 08 00 9F 08 00 9F FF 00 0B 00 08 07 00 03 07 00 74 01 07 00 76 02 02 01 01 00 04 07 00 2E 08 00 9F 08 00 9F 07 00 03 FF 00 01 00 08 07 00 03 07 00 74 01 07 00 76 02 02 01 01 00 05 07 00 2E 08 00 9F 08 00 9F 07 00 03 01 FF 00 1D 00 08 07 00 03 07 00 74 01 07 00 76 02 02 01 01 00 04 07 00 2E 08 00 9F 08 00 9F 07 00 03 FF 00 11 00 08 07 00 03 07 00 74 01 07 00 76 02 02 01 01 00 07 07 00 2E 08 00 9F 08 00 9F 07 00 03 07 00 69 01 01 FF 00 01 00 08 07 00 03 07 00 74 01 07 00 76 02 02 01 01 00 08 07 00 2E 08 00 9F 08 00 9F 07 00 03 07 00 69 01 01 01 FF 00 1B 00 08 07 00 03 07 00 74 01 07 00 76 02 02 01 01 00 07 07 00 2E 08 00 9F 08 00 9F 07 00 03 07 00 69 01 01 42 07 00 3F FF 00 00 00 08 07 00 03 07 00 74 01 07 00 76 02 02 01 01 00 07 07 00 2E 08 00 9F 08 00 9F 07 00 03 07 00 69 01 01 45 07 00 4B FF 00 00 00 08 07 00 03 07 00 74 01 07 00 76 02 02 01 01 00 02 07 00 2E 07 00 58 51 07 00 43 FF 00 00 00 08 07 00 03 07 00 74 01 07 00 76 02 02 01 01 00 05 07 00 2E 07 00 58 01 01 01 45 07 00 4B 40 02 FF 00 01 00 08 07 00 03 07 00 74 01 07 00 76 02 02 01 01 00 07 07 00 2E 08 00 9F 08 00 9F 07 00 03 07 00 69 01 01 FF 00 01 00 06 07 00 03 07 00 74 01 07 00 76 02 02 00 01 07 00 03 FF 00 01 00 08 07 00 03 07 00 74 01 07 00 76 02 02 01 01 00 03 07 00 2E 08 00 9F 08 00 9F FF 00 01 00 08 07 00 03 07 00 74 01 07 00 76 02 02 01 01 00 04 07 00 2E 08 00 9F 08 00 9F 07 00 03 FF 00 01 00 06 07 00 03 07 00 74 01 07 00 76 02 02 00 02 07 00 2E 01 41 07 00 4B 43 05 44 07 00 4B 47 05 47 07 00 4B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     354    362    Any
        //  354    362    354    362    Ljava/lang/EnumConstantNotPresentException;
        //  370    372    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  126    133    133    134    Any
        //  127    133    3      8      Ljava/lang/NegativeArraySizeException;
        //  127    133    126    127    Any
        //  127    133    3      8      Ljava/lang/IllegalArgumentException;
        //  126    133    3      8      Ljava/lang/RuntimeException;
        //  144    151    151    152    Any
        //  145    151    3      8      Ljava/lang/AssertionError;
        //  145    151    151    152    Ljava/lang/StringIndexOutOfBoundsException;
        //  144    151    144    145    Any
        //  144    151    144    145    Ljava/lang/IllegalArgumentException;
        //  299    306    306    307    Any
        //  299    306    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  299    306    3      8      Any
        //  299    306    299    300    Ljava/lang/NegativeArraySizeException;
        //  299    306    3      8      Any
        //  325    332    332    333    Any
        //  326    332    325    326    Ljava/lang/ArithmeticException;
        //  326    332    325    326    Ljava/lang/RuntimeException;
        //  325    332    3      8      Any
        //  325    332    332    333    Any
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
    
    @Override
    public float c() {
        return fbS.aI(this, 1430270066);
    }
    
    @Override
    public boolean 0() {
        return fbS.eF(this, 1117861379);
    }
    
    @Override
    public boolean c(final int n, final int n2, final int n3) {
        return fbS.fe(this, 2073427143, n, n2, n3);
    }
}
