// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.gson.JsonElement;

public class f0g extends f0l
{
    public int c;
    public int 0;
    public int 1;
    
    @NotNull
    @Override
    public JsonElement c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          230
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            222
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            214
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lcom/google/gson/JsonPrimitive;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/fc.0:I
        //    31: ifeq            39
        //    34: ldc             -761268090
        //    36: goto            41
        //    39: ldc             558615525
        //    41: ldc             -1169765571
        //    43: ixor           
        //    44: lookupswitch {
        //          -1387658001: 39
        //          1759065019: 199
        //          default: 72
        //        }
        //    72: aload_0        
        //    73: getstatic       dev/nuker/pyro/fc.1:I
        //    76: ifeq            84
        //    79: ldc             -1426660414
        //    81: goto            86
        //    84: ldc             -943080428
        //    86: ldc             -1394268124
        //    88: ixor           
        //    89: lookupswitch {
        //          -45641166: 84
        //          101960678: 203
        //          default: 116
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokevirtual   dev/nuker/pyro/f0g.5:()Ldev/nuker/pyro/fw;
        //   123: goto            127
        //   126: athrow         
        //   127: goto            131
        //   130: athrow         
        //   131: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   134: goto            138
        //   137: athrow         
        //   138: checkcast       Ljava/lang/Number;
        //   141: getstatic       dev/nuker/pyro/fc.c:I
        //   144: ifge            152
        //   147: ldc             1740731059
        //   149: goto            154
        //   152: ldc             664985957
        //   154: ldc             1428157601
        //   156: ixor           
        //   157: lookupswitch {
        //          853444114: 152
        //          1924994500: 184
        //          default: 201
        //        }
        //   184: goto            188
        //   187: athrow         
        //   188: invokespecial   com/google/gson/JsonPrimitive.<init>:(Ljava/lang/Number;)V
        //   191: goto            195
        //   194: athrow         
        //   195: checkcast       Lcom/google/gson/JsonElement;
        //   198: areturn        
        //   199: aconst_null    
        //   200: athrow         
        //   201: aconst_null    
        //   202: athrow         
        //   203: aconst_null    
        //   204: athrow         
        //   205: pop            
        //   206: goto            24
        //   209: pop            
        //   210: aconst_null    
        //   211: goto            205
        //   214: dup            
        //   215: ifnull          205
        //   218: checkcast       Ljava/lang/Throwable;
        //   221: athrow         
        //   222: dup            
        //   223: ifnull          209
        //   226: checkcast       Ljava/lang/Throwable;
        //   229: athrow         
        //   230: aconst_null    
        //   231: athrow         
        //    StackMapTable: 00 21 43 07 00 1B 04 FF 00 0B 00 00 00 01 07 00 1B FC 00 03 07 00 03 FF 00 0E 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 01 00 01 07 00 03 00 03 08 00 18 08 00 18 01 FF 00 1E 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 0B 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 FF 00 01 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 03 01 FF 00 1D 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 42 07 00 3D FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 45 07 00 1B FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 2B 42 07 00 1B FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 2B 45 07 00 1B FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 3F FF 00 0D 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 30 FF 00 01 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 30 01 FF 00 1D 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 30 42 07 00 3D FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 30 45 07 00 1B 40 07 00 1D FF 00 03 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 01 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 30 FF 00 01 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 41 07 00 3D 43 05 44 07 00 3D 47 05 47 07 00 1B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     214    222    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  214    222    214    222    Ljava/util/NoSuchElementException;
        //  230    232    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  119    126    126    127    Any
        //  120    126    126    127    Ljava/lang/NegativeArraySizeException;
        //  120    126    119    120    Ljava/lang/NegativeArraySizeException;
        //  119    126    119    120    Ljava/util/NoSuchElementException;
        //  120    126    3      8      Any
        //  130    137    137    138    Any
        //  131    137    3      8      Any
        //  130    137    130    131    Any
        //  130    137    130    131    Any
        //  130    137    130    131    Any
        //  187    194    194    195    Any
        //  188    194    187    188    Ljava/lang/ClassCastException;
        //  187    194    187    188    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  187    194    187    188    Ljava/lang/IllegalArgumentException;
        //  188    194    194    195    Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 76 out of bounds for length 76
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
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
    
    public void 0(final int n) {
        fbS.6k(this, 1189881551, n);
    }
    
    @JvmOverloads
    public f0g(@NotNull final String s, @NotNull final String s2, @Nullable final String s3, final int n, final int n2, final int n3) {
        this(s, s2, s3, n, n2, n3, 0, 64, null);
    }
    
    public f0g(final String s, final String s2, final String s3, final int n, final int n2, final int n3, int n4, final int n5, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n5 & 0x40) != 0x0) {
            n4 = n3 - n2;
        }
        while (true) {
            int n6 = 0;
            Label_0028: {
                if (fc.1 != 0) {
                    n6 = 73058467;
                    break Label_0028;
                }
                n6 = 2095900186;
            }
            switch (n6 ^ 0x2152C01D) {
                case 621283518: {
                    continue;
                }
                case 1572742663: {
                    while (true) {
                        int n7 = 0;
                        Label_0071: {
                            if (fc.0 != 0) {
                                n7 = -1345692706;
                                break Label_0071;
                            }
                            n7 = 684095367;
                        }
                        switch (n7 ^ 0x63C11CCC) {
                            case -1002863392: {
                                continue;
                            }
                            default: {
                                while (true) {
                                    int n8 = 0;
                                    Label_0114: {
                                        if (fc.0 != 0) {
                                            n8 = -630834144;
                                            break Label_0114;
                                        }
                                        n8 = 456390396;
                                    }
                                    switch (n8 ^ 0x56EA58AF) {
                                        case 1973874551: {
                                            continue;
                                        }
                                        default: {
                                            while (true) {
                                                int n9 = 0;
                                                Label_0158: {
                                                    if (fc.c < 0) {
                                                        n9 = -1935861272;
                                                        break Label_0158;
                                                    }
                                                    n9 = 83791622;
                                                }
                                                switch (n9 ^ 0x2B094E81) {
                                                    case 772579475: {
                                                        continue;
                                                    }
                                                    default: {
                                                        while (true) {
                                                            int n10 = 0;
                                                            Label_0205: {
                                                                if (fc.c < 0) {
                                                                    n10 = 424993623;
                                                                    break Label_0205;
                                                                }
                                                                n10 = 335624658;
                                                            }
                                                            switch (n10 ^ 0x97C5E6CB) {
                                                                case -1903098468: {
                                                                    continue;
                                                                }
                                                                case -2084249831: {
                                                                    final int n11 = n4;
                                                                    while (true) {
                                                                        int n12 = 0;
                                                                        Label_0253: {
                                                                            if (fc.0 != 0) {
                                                                                n12 = -1533247404;
                                                                                break Label_0253;
                                                                            }
                                                                            n12 = -1975270311;
                                                                        }
                                                                        switch (n12 ^ 0x2EEE6A68) {
                                                                            case -187783004: {
                                                                                continue;
                                                                            }
                                                                            default: {
                                                                                this(s, s2, s3, n, n2, n3, n11);
                                                                                return;
                                                                            }
                                                                            case -1972180420: {
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
                                                    case -1483450519: {
                                                        throw null;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        case -1936956273: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case -871676142: {
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
    
    @JvmOverloads
    public f0g(@NotNull final String s, @NotNull final String s2, @Nullable final String s3, final int i, final int c, final int 0, final int 2) {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.c < 0) {
                    n = -1431661790;
                    break Label_0017;
                }
                n = -1273310834;
            }
            switch (n ^ 0x443A557D) {
                case -700805525: {
                    continue;
                }
                default: {
                    while (true) {
                        int n2 = 0;
                        Label_0063: {
                            if (fc.0 != 0) {
                                n2 = 151441807;
                                break Label_0063;
                            }
                            n2 = 1436592330;
                        }
                        switch (n2 ^ 0x64EC007B) {
                            case 1844105716: {
                                continue;
                            }
                            case 827107505: {
                                while (true) {
                                    int n3 = 0;
                                    Label_0106: {
                                        if (fc.1 != 0) {
                                            n3 = -897973747;
                                            break Label_0106;
                                        }
                                        n3 = -240598360;
                                    }
                                    switch (n3 ^ 0x7700AC2F) {
                                        case -1962016138: {
                                            continue;
                                        }
                                        default: {
                                            while (true) {
                                                int n4 = 0;
                                                Label_0150: {
                                                    if (fc.0 != 0) {
                                                        n4 = 1591560086;
                                                        break Label_0150;
                                                    }
                                                    n4 = -80001367;
                                                }
                                                switch (n4 ^ 0x8C6096D8) {
                                                    case 324307250: {
                                                        continue;
                                                    }
                                                    default: {
                                                        while (true) {
                                                            int n5 = 0;
                                                            Label_0195: {
                                                                if (fc.0 != 0) {
                                                                    n5 = -802572310;
                                                                    break Label_0195;
                                                                }
                                                                n5 = -2032485760;
                                                            }
                                                            switch (n5 ^ 0xF742F5EB) {
                                                                case 661340673: {
                                                                    continue;
                                                                }
                                                                case 1905807211: {
                                                                    final Integer value = i;
                                                                    while (true) {
                                                                        int n6 = 0;
                                                                        Label_0240: {
                                                                            if (fc.0 != 0) {
                                                                                n6 = 1737901067;
                                                                                break Label_0240;
                                                                            }
                                                                            n6 = 1789888555;
                                                                        }
                                                                        switch (n6 ^ 0x5E6A30A8) {
                                                                            case -1150083417: {
                                                                                continue;
                                                                            }
                                                                            default: {
                                                                                super(s, s2, s3, value);
                                                                                this.c = c;
                                                                                while (true) {
                                                                                    int n7 = 0;
                                                                                    Label_0291: {
                                                                                        if (fc.0 != 0) {
                                                                                            n7 = -851155764;
                                                                                            break Label_0291;
                                                                                        }
                                                                                        n7 = -1357340269;
                                                                                    }
                                                                                    switch (n7 ^ 0x1A81ADEE) {
                                                                                        case -674903774: {
                                                                                            continue;
                                                                                        }
                                                                                        case -1248260995: {
                                                                                            this.0 = 0;
                                                                                            while (true) {
                                                                                                int n8 = 0;
                                                                                                Label_0338: {
                                                                                                    if (fc.0 != 0) {
                                                                                                        n8 = -1275500591;
                                                                                                        break Label_0338;
                                                                                                    }
                                                                                                    n8 = 1370071410;
                                                                                                }
                                                                                                switch (n8 ^ 0x1529F229) {
                                                                                                    case -1496279560: {
                                                                                                        continue;
                                                                                                    }
                                                                                                    case 1149260635: {
                                                                                                        this.1 = 2;
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
                                                                            case 972846243: {
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
                                                    case -759312050: {
                                                        throw null;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        case -1116033502: {
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
                case -292501921: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public int c() {
        return fbS.bL(this, 164958158);
    }
    
    static {
        throw t;
    }
    
    @Override
    public int 1() {
        return fbS.bd(this, 1218239430);
    }
    
    public int 0() {
        return fbS.bI(this, 920612479);
    }
    
    public void c(final int n) {
        fbS.6r(this, 1250817064, n);
    }
    
    @Override
    public void c(@NotNull final JsonElement jsonElement) {
        fbS.6W(this, 1978152770, jsonElement);
    }
    
    @NotNull
    @Override
    public f0V 4() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          69
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            61
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            53
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ldev/nuker/pyro/f0I;
        //    27: dup            
        //    28: aload_0        
        //    29: goto            33
        //    32: athrow         
        //    33: invokespecial   dev/nuker/pyro/f0I.<init>:(Ldev/nuker/pyro/f0g;)V
        //    36: goto            40
        //    39: athrow         
        //    40: checkcast       Ldev/nuker/pyro/f0V;
        //    43: areturn        
        //    44: pop            
        //    45: goto            24
        //    48: pop            
        //    49: aconst_null    
        //    50: goto            44
        //    53: dup            
        //    54: ifnull          44
        //    57: checkcast       Ljava/lang/Throwable;
        //    60: athrow         
        //    61: dup            
        //    62: ifnull          48
        //    65: checkcast       Ljava/lang/Throwable;
        //    68: athrow         
        //    69: aconst_null    
        //    70: athrow         
        //    StackMapTable: 00 0D 43 07 00 1B 04 FF 00 0B 00 00 00 01 07 00 1B FC 00 03 07 00 03 47 07 00 1B FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 45 07 00 1B 40 07 00 AC 43 07 00 1B 43 05 44 07 00 1B 47 05 47 07 00 1B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     53     61     Ljava/lang/EnumConstantNotPresentException;
        //  53     61     53     61     Any
        //  69     71     3      8      Any
        //  32     39     39     40     Any
        //  33     39     3      8      Any
        //  33     39     39     40     Ljava/lang/UnsupportedOperationException;
        //  33     39     32     33     Any
        //  33     39     39     40     Any
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
    
    public void 1(final int n) {
        fbS.6x(this, 439583406, n);
    }
}
