// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;

public class f3I extends f3G
{
    public void c(final fH p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          218
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            210
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            202
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.0:I
        //    28: ifeq            36
        //    31: ldc             1272032329
        //    33: goto            38
        //    36: ldc             1728618725
        //    38: ldc             -831784991
        //    40: ixor           
        //    41: lookupswitch {
        //          -2051384408: 187
        //          418681154: 36
        //          default: 68
        //        }
        //    68: getfield        dev/nuker/pyro/f3I.c:Ljava/util/List;
        //    71: new             Ldev/nuker/pyro/f3H;
        //    74: dup            
        //    75: getstatic       dev/nuker/pyro/fc.0:I
        //    78: ifeq            86
        //    81: ldc             -1348642776
        //    83: goto            88
        //    86: ldc             968469266
        //    88: ldc             81197267
        //    90: ixor           
        //    91: lookupswitch {
        //          -1421106949: 189
        //          551125693: 86
        //          default: 116
        //        }
        //   116: aload_1        
        //   117: goto            121
        //   120: athrow         
        //   121: invokespecial   dev/nuker/pyro/f3H.<init>:(Ldev/nuker/pyro/fH;)V
        //   124: goto            128
        //   127: athrow         
        //   128: getstatic       dev/nuker/pyro/fc.1:I
        //   131: ifeq            139
        //   134: ldc             -241232466
        //   136: goto            141
        //   139: ldc             348680837
        //   141: ldc             1524533890
        //   143: ixor           
        //   144: lookupswitch {
        //          -1421762772: 191
        //          -215486472: 139
        //          default: 172
        //        }
        //   172: goto            176
        //   175: athrow         
        //   176: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   181: goto            185
        //   184: athrow         
        //   185: pop            
        //   186: return         
        //   187: aconst_null    
        //   188: athrow         
        //   189: aconst_null    
        //   190: athrow         
        //   191: aconst_null    
        //   192: athrow         
        //   193: pop            
        //   194: goto            24
        //   197: pop            
        //   198: aconst_null    
        //   199: goto            193
        //   202: dup            
        //   203: ifnull          193
        //   206: checkcast       Ljava/lang/Throwable;
        //   209: athrow         
        //   210: dup            
        //   211: ifnull          197
        //   214: checkcast       Ljava/lang/Throwable;
        //   217: athrow         
        //   218: aconst_null    
        //   219: athrow         
        //    StackMapTable: 00 1D 43 07 00 19 04 FF 00 0B 00 00 00 01 07 00 19 FD 00 03 07 00 03 07 00 35 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 35 00 02 07 00 03 01 5D 07 00 03 FF 00 11 00 02 07 00 03 07 00 35 00 03 07 00 2F 08 00 47 08 00 47 FF 00 01 00 02 07 00 03 07 00 35 00 04 07 00 2F 08 00 47 08 00 47 01 FF 00 1B 00 02 07 00 03 07 00 35 00 03 07 00 2F 08 00 47 08 00 47 43 07 00 19 FF 00 00 00 02 07 00 03 07 00 35 00 04 07 00 2F 08 00 47 08 00 47 07 00 35 45 07 00 19 FF 00 00 00 02 07 00 03 07 00 35 00 02 07 00 2F 07 00 21 FF 00 0A 00 02 07 00 03 07 00 35 00 02 07 00 2F 07 00 21 FF 00 01 00 02 07 00 03 07 00 35 00 03 07 00 2F 07 00 21 01 FF 00 1E 00 02 07 00 03 07 00 35 00 02 07 00 2F 07 00 21 FF 00 02 00 00 00 01 07 00 19 FF 00 00 00 02 07 00 03 07 00 35 00 02 07 00 2F 07 00 21 47 07 00 19 40 01 41 07 00 03 FF 00 01 00 02 07 00 03 07 00 35 00 03 07 00 2F 08 00 47 08 00 47 FF 00 01 00 02 07 00 03 07 00 35 00 02 07 00 2F 07 00 21 41 07 00 37 43 05 44 07 00 37 47 05 47 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     202    210    Ljava/lang/EnumConstantNotPresentException;
        //  202    210    202    210    Ljava/lang/ClassCastException;
        //  218    220    3      8      Any
        //  120    127    127    128    Any
        //  121    127    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  121    127    127    128    Any
        //  120    127    3      8      Ljava/lang/IllegalArgumentException;
        //  121    127    120    121    Any
        //  176    184    184    185    Any
        //  176    184    184    185    Any
        //  176    184    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  176    184    3      8      Any
        //  176    184    184    185    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 71 out of bounds for length 71
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
    
    public f3I(final String s, final float n, final float n2) {
        super(s, n, n2);
        this.c(true);
        final Stream stream = fQ.c.1().stream();
        final Predicate<? super Object> predicate = f3I::c;
        while (true) {
            int n3 = 0;
            Label_0042: {
                if (fc.1 != 0) {
                    n3 = 944799517;
                    break Label_0042;
                }
                n3 = -1516922251;
            }
            switch (n3 ^ 0x99C9B1B7) {
                case -1583755606: {
                    continue;
                }
                case 1012673474: {
                    final List<Object> list = stream.filter(predicate).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList());
                    while (true) {
                        int n4 = 0;
                        Label_0103: {
                            if (fc.0 != 0) {
                                n4 = 989647400;
                                break Label_0103;
                            }
                            n4 = 1375553832;
                        }
                        switch (n4 ^ 0xC39A169) {
                            case 918909761: {
                                continue;
                            }
                            case 1573185601: {
                                final List<Object> list2 = list;
                                final Comparator<? super Object> comparing = Comparator.comparing((Function<? super Object, ? extends Comparable>)fH::9);
                                while (true) {
                                    int n5 = 0;
                                    Label_0155: {
                                        if (fc.0 != 0) {
                                            n5 = 2095096500;
                                            break Label_0155;
                                        }
                                        n5 = 1056294229;
                                    }
                                    switch (n5 ^ 0x5582C5CC) {
                                        case 694314872: {
                                            continue;
                                        }
                                        case 1802961049: {
                                            list2.sort(comparing);
                                            final List<Object> list3 = list;
                                            while (true) {
                                                int n6 = 0;
                                                Label_0204: {
                                                    if (fc.c < 0) {
                                                        n6 = 476514406;
                                                        break Label_0204;
                                                    }
                                                    n6 = -1062607472;
                                                }
                                                switch (n6 ^ 0x1AB2A611) {
                                                    case -191663851: {
                                                        continue;
                                                    }
                                                    default: {
                                                        final Consumer<fH> action = this::c;
                                                        while (true) {
                                                            int n7 = 0;
                                                            Label_0251: {
                                                                if (fc.0 != 0) {
                                                                    n7 = 1659338089;
                                                                    break Label_0251;
                                                                }
                                                                n7 = -521753244;
                                                            }
                                                            switch (n7 ^ 0x4F1F87B9) {
                                                                case -1173624891: {
                                                                    continue;
                                                                }
                                                                default: {
                                                                    list3.forEach((Consumer<? super Object>)action);
                                                                    return;
                                                                }
                                                                case 771291856: {
                                                                    throw null;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 114667127: {
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
    
    public static boolean c(final String p0, final fH p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          119
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            111
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            103
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   dev/nuker/pyro/fH.5:()Ljava/lang/String;
        //    32: goto            36
        //    35: athrow         
        //    36: aload_0        
        //    37: getstatic       dev/nuker/pyro/fc.0:I
        //    40: ifeq            48
        //    43: ldc             -1921193281
        //    45: goto            50
        //    48: ldc             1712359650
        //    50: ldc             2065796943
        //    52: ixor           
        //    53: lookupswitch {
        //          -1504506583: 48
        //          -161651216: 92
        //          default: 80
        //        }
        //    80: goto            84
        //    83: athrow         
        //    84: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    87: goto            91
        //    90: athrow         
        //    91: ireturn        
        //    92: aconst_null    
        //    93: athrow         
        //    94: pop            
        //    95: goto            24
        //    98: pop            
        //    99: aconst_null    
        //   100: goto            94
        //   103: dup            
        //   104: ifnull          94
        //   107: checkcast       Ljava/lang/Throwable;
        //   110: athrow         
        //   111: dup            
        //   112: ifnull          98
        //   115: checkcast       Ljava/lang/Throwable;
        //   118: athrow         
        //   119: aconst_null    
        //   120: athrow         
        //    StackMapTable: 00 15 43 07 00 19 04 FF 00 0B 00 00 00 01 07 00 19 FD 00 03 07 00 A3 07 00 35 FF 00 03 00 00 00 01 07 00 19 FF 00 00 00 02 07 00 A3 07 00 35 00 01 07 00 35 45 07 00 19 40 07 00 A3 FF 00 0B 00 02 07 00 A3 07 00 35 00 02 07 00 A3 07 00 A3 FF 00 01 00 02 07 00 A3 07 00 35 00 03 07 00 A3 07 00 A3 01 FF 00 1D 00 02 07 00 A3 07 00 35 00 02 07 00 A3 07 00 A3 FF 00 02 00 00 00 01 07 00 19 FF 00 00 00 02 07 00 A3 07 00 35 00 02 07 00 A3 07 00 A3 45 07 00 19 40 01 FF 00 00 00 02 07 00 A3 07 00 35 00 02 07 00 A3 07 00 A3 41 07 00 19 43 05 44 07 00 19 47 05 47 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     103    111    Any
        //  103    111    103    111    Any
        //  119    121    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  29     35     35     36     Any
        //  29     35     3      8      Ljava/lang/RuntimeException;
        //  29     35     35     36     Any
        //  29     35     3      8      Any
        //  29     35     35     36     Any
        //  84     90     90     91     Any
        //  84     90     90     91     Ljava/util/NoSuchElementException;
        //  84     90     3      8      Any
        //  84     90     90     91     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  84     90     3      8      Any
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
    
    static {
        throw t;
    }
}
