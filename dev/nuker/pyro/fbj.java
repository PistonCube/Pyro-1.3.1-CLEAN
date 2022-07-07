// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.ArrayList;

public class fbJ
{
    public ArrayList<Integer> c;
    public ArrayList<Integer> 0;
    public fbu c;
    public int c;
    public float c;
    public float 0;
    public float 1;
    
    public fbJ(final int n, final float n2, final float n3, float n4, final int n5, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n5 & 0x8) != 0x0) {
            n4 = 1.0f;
        }
        while (true) {
            int n6 = 0;
            Label_0025: {
                if (fc.1 != 0) {
                    n6 = 372968323;
                    break Label_0025;
                }
                n6 = -990599644;
            }
            switch (n6 ^ 0xFD62D7D2) {
                case 605735967: {
                    continue;
                }
                default: {
                    while (true) {
                        int n7 = 0;
                        Label_0072: {
                            if (fc.0 != 0) {
                                n7 = 1512022498;
                                break Label_0072;
                            }
                            n7 = -1782534713;
                        }
                        switch (n7 ^ 0xC3443E68) {
                            case 1267924264: {
                                continue;
                            }
                            default: {
                                final float n8 = n4;
                                while (true) {
                                    int n9 = 0;
                                    Label_0115: {
                                        if (fc.1 != 0) {
                                            n9 = -208895299;
                                            break Label_0115;
                                        }
                                        n9 = 1352653982;
                                    }
                                    switch (n9 ^ 0xCEC1B8B0) {
                                        case -1848323606: {
                                            continue;
                                        }
                                        default: {
                                            this(n, n2, n3, n8);
                                            return;
                                        }
                                        case 1028471309: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case -1722048630: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case -346432431: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void c(final int n) {
        fbS.64(this, 999497603, n);
    }
    
    static {
        throw t;
    }
    
    public void 3() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          277
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            269
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            261
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            36
        //    31: ldc             -278448265
        //    33: goto            38
        //    36: ldc             -1704971475
        //    38: ldc             1259959870
        //    40: ixor           
        //    41: lookupswitch {
        //          -1535229623: 246
        //          1359613516: 36
        //          default: 68
        //        }
        //    68: getfield        dev/nuker/pyro/fbJ.c:Ldev/nuker/pyro/fbu;
        //    71: getstatic       dev/nuker/pyro/fc.1:I
        //    74: ifeq            82
        //    77: ldc             1288977750
        //    79: goto            84
        //    82: ldc             140783678
        //    84: ldc             -948698198
        //    86: ixor           
        //    87: lookupswitch {
        //          -1952432388: 248
        //          -1115544102: 82
        //          default: 112
        //        }
        //   112: aload_0        
        //   113: getfield        dev/nuker/pyro/fbJ.c:I
        //   116: i2d            
        //   117: goto            121
        //   120: athrow         
        //   121: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //   124: goto            128
        //   127: athrow         
        //   128: ifeq            243
        //   131: getstatic       dev/nuker/pyro/fc.0:I
        //   134: ifeq            142
        //   137: ldc             -33273727
        //   139: goto            144
        //   142: ldc             -1181902078
        //   144: ldc             871713989
        //   146: ixor           
        //   147: lookupswitch {
        //          -839842748: 250
        //          -691057184: 142
        //          default: 172
        //        }
        //   172: aload_0        
        //   173: getfield        dev/nuker/pyro/fbJ.c:Ldev/nuker/pyro/fbu;
        //   176: goto            180
        //   179: athrow         
        //   180: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //   183: goto            187
        //   186: athrow         
        //   187: aload_0        
        //   188: getstatic       dev/nuker/pyro/fc.c:I
        //   191: ifge            199
        //   194: ldc             1846319654
        //   196: goto            201
        //   199: ldc             -770907795
        //   201: ldc             -299000312
        //   203: ixor           
        //   204: lookupswitch {
        //          -2145319890: 244
        //          276332689: 199
        //          default: 232
        //        }
        //   232: goto            236
        //   235: athrow         
        //   236: invokespecial   dev/nuker/pyro/fbJ.2:()V
        //   239: goto            243
        //   242: athrow         
        //   243: return         
        //   244: aconst_null    
        //   245: athrow         
        //   246: aconst_null    
        //   247: athrow         
        //   248: aconst_null    
        //   249: athrow         
        //   250: aconst_null    
        //   251: athrow         
        //   252: pop            
        //   253: goto            24
        //   256: pop            
        //   257: aconst_null    
        //   258: goto            252
        //   261: dup            
        //   262: ifnull          252
        //   265: checkcast       Ljava/lang/Throwable;
        //   268: athrow         
        //   269: dup            
        //   270: ifnull          256
        //   273: checkcast       Ljava/lang/Throwable;
        //   276: athrow         
        //   277: aconst_null    
        //   278: athrow         
        //    StackMapTable: 00 25 43 07 00 3F 04 FF 00 0B 00 00 00 01 07 00 3F FC 00 03 07 00 03 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 4D 07 00 4B FF 00 01 00 01 07 00 03 00 02 07 00 4B 01 5B 07 00 4B 47 07 00 31 FF 00 00 00 01 07 00 03 00 02 07 00 4B 03 45 07 00 3F 40 01 0D 41 01 1B 46 07 00 3F 40 07 00 4B 45 07 00 3F 00 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5E 07 00 03 FF 00 02 00 00 00 01 07 00 3F FF 00 00 00 01 07 00 03 00 01 07 00 03 45 07 00 3F 00 40 07 00 03 41 07 00 03 41 07 00 4B 01 41 07 00 31 43 05 44 07 00 31 47 05 47 07 00 3F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     261    269    Ljava/lang/RuntimeException;
        //  261    269    261    269    Ljava/lang/IllegalArgumentException;
        //  277    279    3      8      Any
        //  120    127    127    128    Any
        //  121    127    3      8      Any
        //  120    127    120    121    Ljava/lang/IllegalStateException;
        //  121    127    127    128    Ljava/lang/RuntimeException;
        //  121    127    120    121    Ljava/lang/NullPointerException;
        //  179    186    186    187    Any
        //  179    186    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  179    186    3      8      Any
        //  179    186    179    180    Any
        //  180    186    186    187    Any
        //  236    242    242    243    Any
        //  236    242    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  236    242    242    243    Any
        //  236    242    3      8      Ljava/util/ConcurrentModificationException;
        //  236    242    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 89 out of bounds for length 89
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
    
    public float 0() {
        return fbS.at(this, 1202885137);
    }
    
    public void 0(final float n) {
        fbS.8q(this, 357756787, n);
    }
    
    public void 2() {
        fbS.ec(this, 1560608080);
    }
    
    public float c() {
        return fbS.ar(this, 828162593);
    }
    
    public float 1() {
        return fbS.aX(this, 750166732);
    }
    
    public void 1(final float n) {
        fbS.8l(this, 1369883712, n);
    }
    
    public void c(final float n) {
        fbS.8e(this, 1252700582, n);
    }
    
    public int 0(final int n) {
        return fbS.5U(this, 454171412, n);
    }
    
    public fbJ(final int c, final float c2, final float 0, final float 2) {
        this.c = c;
        this.c = c2;
    Label_0091_Outer:
        while (true) {
            int n = 0;
            Label_0029: {
                if (fc.1 != 0) {
                    n = 1149503052;
                    break Label_0029;
                }
                n = -1894729979;
            }
            switch (n ^ 0x7D1CCBB5) {
                case 966315513: {
                    continue;
                }
                case -234062672: {
                    this.0 = 0;
                    this.1 = 2;
                    this.c = new ArrayList<Integer>();
                    while (true) {
                        int n2 = 0;
                        Label_0093: {
                            if (fc.0 != 0) {
                                n2 = -740521810;
                                break Label_0093;
                            }
                            n2 = 1377432702;
                        }
                        switch (n2 ^ 0x7E708EA9) {
                            case -1381235193: {
                                continue;
                            }
                            case 745110231: {
                                final ArrayList<Integer> 3 = new ArrayList<Integer>();
                                while (true) {
                                    int n3 = 0;
                                    Label_0145: {
                                        if (fc.1 != 0) {
                                            n3 = -958592625;
                                            break Label_0145;
                                        }
                                        n3 = 375551648;
                                    }
                                    switch (n3 ^ 0x376A2CE2) {
                                        case 1832278803: {
                                            continue;
                                        }
                                        default: {
                                            this.0 = 3;
                                            while (true) {
                                                int n4 = 0;
                                                Label_0192: {
                                                    if (fc.c < 0) {
                                                        n4 = 566912658;
                                                        break Label_0192;
                                                    }
                                                    n4 = -1108592910;
                                                }
                                                switch (n4 ^ 0x992AE062) {
                                                    case 1779626261: {
                                                        continue;
                                                    }
                                                    default: {
                                                        this.c = new fbu();
                                                        final int n5 = 0;
                                                        while (true) {
                                                            int n6 = 0;
                                                            Label_0245: {
                                                                if (fc.0 != 0) {
                                                                    n6 = 678366087;
                                                                    break Label_0245;
                                                                }
                                                                n6 = 1338028308;
                                                            }
                                                            switch (n6 ^ 0xB7643BF3) {
                                                                case -294931858: {
                                                                    continue;
                                                                }
                                                                default: {
                                                                    int i = n5;
                                                                    while (i <= 359) {
                                                                        final ArrayList<Integer> 4 = this.0;
                                                                        final float n7 = (float)i;
                                                                        final float c3 = this.c;
                                                                        final float 5 = this.0;
                                                                        while (true) {
                                                                            int n8 = 0;
                                                                            Label_0319: {
                                                                                if (fc.0 != 0) {
                                                                                    n8 = 1269723460;
                                                                                    break Label_0319;
                                                                                }
                                                                                n8 = -861362972;
                                                                            }
                                                                            switch (n8 ^ 0xD894FC01) {
                                                                                case -504067282: {
                                                                                    continue;
                                                                                }
                                                                                default: {
                                                                                    4.add(fbI.c(n7, c3, 5, this.1).getRGB());
                                                                                    while (true) {
                                                                                        int n9 = 0;
                                                                                        Label_0380: {
                                                                                            if (fc.0 != 0) {
                                                                                                n9 = 14858604;
                                                                                                break Label_0380;
                                                                                            }
                                                                                            n9 = -1793496782;
                                                                                        }
                                                                                        switch (n9 ^ 0x864562A) {
                                                                                            case -1487728749: {
                                                                                                continue;
                                                                                            }
                                                                                            default: {
                                                                                                final ArrayList<Integer> c4 = this.c;
                                                                                                final Integer value = i;
                                                                                                while (true) {
                                                                                                    int n10 = 0;
                                                                                                    Label_0429: {
                                                                                                        if (fc.0 != 0) {
                                                                                                            n10 = 117161472;
                                                                                                            break Label_0429;
                                                                                                        }
                                                                                                        n10 = -663958184;
                                                                                                    }
                                                                                                    switch (n10 ^ 0x34EEF238) {
                                                                                                        case 840256568: {
                                                                                                            continue;
                                                                                                        }
                                                                                                        case -327008416: {
                                                                                                            c4.add(value);
                                                                                                            ++i;
                                                                                                            continue Label_0091_Outer;
                                                                                                        }
                                                                                                        default: {
                                                                                                            throw null;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            case 143060806: {
                                                                                                throw null;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case -1824879291: {
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            break;
                                                                        }
                                                                    }
                                                                    return;
                                                                }
                                                                case -1626656652: {
                                                                    throw null;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case -1193244944: {
                                                        throw null;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        case -239655571: {
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
