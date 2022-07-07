// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.Map;
import com.google.common.collect.Multimaps;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import com.google.common.collect.Multimap;

public class f07 implements f05
{
    public Multimap<Class<?>, f08> c;
    public Multimap<Object, f08> 0;
    public static Multimap<String, f08> 1;
    
    public static boolean c(final Method p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          211
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            203
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            195
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             -785079318
        //    32: goto            37
        //    35: ldc             -100758697
        //    37: ldc             -1954673574
        //    39: ixor           
        //    40: lookupswitch {
        //          619890614: 35
        //          1514844080: 182
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: ldc             Ldev/nuker/pyro/f06;.class
        //    71: getstatic       dev/nuker/pyro/fc.1:I
        //    74: ifeq            82
        //    77: ldc             1751079457
        //    79: goto            84
        //    82: ldc             1872036499
        //    84: ldc             549442161
        //    86: ixor           
        //    87: lookupswitch {
        //          1222674512: 82
        //          1328206050: 112
        //          default: 184
        //        }
        //   112: goto            116
        //   115: athrow         
        //   116: invokevirtual   java/lang/reflect/Method.isAnnotationPresent:(Ljava/lang/Class;)Z
        //   119: goto            123
        //   122: athrow         
        //   123: ifeq            180
        //   126: aload_0        
        //   127: goto            131
        //   130: athrow         
        //   131: invokevirtual   java/lang/reflect/Method.getParameterCount:()I
        //   134: goto            138
        //   137: athrow         
        //   138: iconst_1       
        //   139: if_icmpne       147
        //   142: ldc             -1015745368
        //   144: goto            149
        //   147: ldc             -1015745365
        //   149: ldc             -1334258679
        //   151: ixor           
        //   152: tableswitch {
        //          -434618046: 176
        //          -434618045: 180
        //          default: 142
        //        }
        //   176: iconst_1       
        //   177: goto            181
        //   180: iconst_0       
        //   181: ireturn        
        //   182: aconst_null    
        //   183: athrow         
        //   184: aconst_null    
        //   185: athrow         
        //   186: pop            
        //   187: goto            24
        //   190: pop            
        //   191: aconst_null    
        //   192: goto            186
        //   195: dup            
        //   196: ifnull          186
        //   199: checkcast       Ljava/lang/Throwable;
        //   202: athrow         
        //   203: dup            
        //   204: ifnull          190
        //   207: checkcast       Ljava/lang/Throwable;
        //   210: athrow         
        //   211: aconst_null    
        //   212: athrow         
        //    StackMapTable: 00 1F 43 07 00 20 04 FF 00 0B 00 00 00 01 07 00 20 FC 00 03 07 00 2C 0A 41 01 1E FF 00 0D 00 01 07 00 2C 00 02 07 00 2C 07 00 39 FF 00 01 00 01 07 00 2C 00 03 07 00 2C 07 00 39 01 FF 00 1B 00 01 07 00 2C 00 02 07 00 2C 07 00 39 FF 00 02 00 00 00 01 07 00 20 FF 00 00 00 01 07 00 2C 00 02 07 00 2C 07 00 39 45 07 00 20 40 01 46 07 00 20 40 07 00 2C 45 07 00 20 40 01 03 04 41 01 1A 03 40 01 00 FF 00 01 00 01 07 00 2C 00 02 07 00 2C 07 00 39 41 07 00 20 43 05 44 07 00 20 47 05 47 07 00 20
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     195    203    Any
        //  195    203    195    203    Any
        //  211    213    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  116    122    122    123    Any
        //  116    122    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  116    122    3      8      Any
        //  116    122    3      8      Ljava/lang/NegativeArraySizeException;
        //  116    122    122    123    Ljava/lang/NumberFormatException;
        //  130    137    137    138    Any
        //  130    137    137    138    Any
        //  131    137    3      8      Ljava/lang/IllegalArgumentException;
        //  130    137    130    131    Any
        //  130    137    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 63 out of bounds for length 63
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
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
    
    static {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.1 != 0) {
                    n = 1045350242;
                    break Label_0017;
                }
                n = 1227131327;
            }
            switch (n ^ 0xCA82C65A) {
                case -187956936: {
                    continue;
                }
                case -2086252571: {
                    f07.1 = (Multimap<String, f08>)Multimaps.newSetMultimap((Map)new ConcurrentHashMap(), ConcurrentHashMap::newKeySet);
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static int c(final f08 p0, final f08 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          177
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            169
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            161
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            35
        //    30: ldc             786369495
        //    32: goto            37
        //    35: ldc             712471680
        //    37: ldc             -840426575
        //    39: ixor           
        //    40: lookupswitch {
        //          -1968732642: 35
        //          -482930586: 150
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: goto            73
        //    72: athrow         
        //    73: invokevirtual   dev/nuker/pyro/f08.0:()I
        //    76: goto            80
        //    79: athrow         
        //    80: aload_0        
        //    81: goto            85
        //    84: athrow         
        //    85: invokevirtual   dev/nuker/pyro/f08.0:()I
        //    88: goto            92
        //    91: athrow         
        //    92: getstatic       dev/nuker/pyro/fc.0:I
        //    95: ifeq            103
        //    98: ldc             1612549928
        //   100: goto            105
        //   103: ldc             -1172320401
        //   105: ldc             -2114740449
        //   107: ixor           
        //   108: lookupswitch {
        //          -504491977: 103
        //          1005342832: 136
        //          default: 148
        //        }
        //   136: goto            140
        //   139: athrow         
        //   140: invokestatic    java/lang/Integer.compare:(II)I
        //   143: goto            147
        //   146: athrow         
        //   147: ireturn        
        //   148: aconst_null    
        //   149: athrow         
        //   150: aconst_null    
        //   151: athrow         
        //   152: pop            
        //   153: goto            24
        //   156: pop            
        //   157: aconst_null    
        //   158: goto            152
        //   161: dup            
        //   162: ifnull          152
        //   165: checkcast       Ljava/lang/Throwable;
        //   168: athrow         
        //   169: dup            
        //   170: ifnull          156
        //   173: checkcast       Ljava/lang/Throwable;
        //   176: athrow         
        //   177: aconst_null    
        //   178: athrow         
        //    StackMapTable: 00 1D 43 07 00 20 04 FF 00 0B 00 00 00 01 07 00 20 FD 00 03 07 00 6F 07 00 6F 0A 41 01 1E 43 07 00 20 40 07 00 6F 45 07 00 20 40 01 43 07 00 20 FF 00 00 00 02 07 00 6F 07 00 6F 00 02 01 07 00 6F 45 07 00 20 FF 00 00 00 02 07 00 6F 07 00 6F 00 02 01 01 FF 00 0A 00 02 07 00 6F 07 00 6F 00 02 01 01 FF 00 01 00 02 07 00 6F 07 00 6F 00 03 01 01 01 FF 00 1E 00 02 07 00 6F 07 00 6F 00 02 01 01 42 07 00 62 FF 00 00 00 02 07 00 6F 07 00 6F 00 02 01 01 45 07 00 20 40 01 FF 00 00 00 02 07 00 6F 07 00 6F 00 02 01 01 01 41 07 00 20 43 05 44 07 00 20 47 05 47 07 00 20
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     161    169    Any
        //  161    169    161    169    Any
        //  177    179    3      8      Ljava/lang/NullPointerException;
        //  72     79     79     80     Any
        //  72     79     79     80     Ljava/lang/AssertionError;
        //  72     79     3      8      Ljava/lang/NumberFormatException;
        //  73     79     79     80     Any
        //  72     79     72     73     Any
        //  84     91     91     92     Any
        //  84     91     3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  84     91     84     85     Ljava/lang/IndexOutOfBoundsException;
        //  85     91     84     85     Ljava/lang/AssertionError;
        //  85     91     3      8      Any
        //  139    146    146    147    Any
        //  140    146    146    147    Any
        //  139    146    146    147    Ljava/lang/UnsupportedOperationException;
        //  139    146    146    147    Any
        //  139    146    139    140    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 36 out of bounds for length 36
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
    
    @Override
    public void 1(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          178
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            170
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            162
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             -1976811644
        //    32: goto            37
        //    35: ldc             -1890068092
        //    37: ldc             -1847477238
        //    39: ixor           
        //    40: lookupswitch {
        //          466453390: 35
        //          515270030: 68
        //          default: 149
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f07.0:Lcom/google/common/collect/Multimap;
        //    72: aload_1        
        //    73: getstatic       dev/nuker/pyro/fc.1:I
        //    76: ifeq            84
        //    79: ldc             1189657581
        //    81: goto            86
        //    84: ldc             12357601
        //    86: ldc             712610853
        //    88: ixor           
        //    89: lookupswitch {
        //          574580404: 84
        //          1821454280: 151
        //          default: 116
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokeinterface com/google/common/collect/Multimap.get:(Ljava/lang/Object;)Ljava/util/Collection;
        //   125: goto            129
        //   128: athrow         
        //   129: aload_0        
        //   130: invokedynamic   BootstrapMethod #1, accept:(Ldev/nuker/pyro/f07;)Ljava/util/function/Consumer;
        //   135: goto            139
        //   138: athrow         
        //   139: invokeinterface java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
        //   144: goto            148
        //   147: athrow         
        //   148: return         
        //   149: aconst_null    
        //   150: athrow         
        //   151: aconst_null    
        //   152: athrow         
        //   153: pop            
        //   154: goto            24
        //   157: pop            
        //   158: aconst_null    
        //   159: goto            153
        //   162: dup            
        //   163: ifnull          153
        //   166: checkcast       Ljava/lang/Throwable;
        //   169: athrow         
        //   170: dup            
        //   171: ifnull          157
        //   174: checkcast       Ljava/lang/Throwable;
        //   177: athrow         
        //   178: aconst_null    
        //   179: athrow         
        //    StackMapTable: 00 19 43 07 00 20 04 FF 00 0B 00 00 00 01 07 00 20 FD 00 03 07 00 03 07 00 05 0A 41 01 1E FF 00 0F 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 05 FF 00 01 00 02 07 00 03 07 00 05 00 03 07 00 87 07 00 05 01 FF 00 1D 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 05 42 07 00 20 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 05 47 07 00 20 40 07 00 96 FF 00 08 00 00 00 01 07 00 20 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 00 96 07 00 9C 47 07 00 20 00 00 FF 00 01 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 05 41 07 00 20 43 05 44 07 00 20 47 05 47 07 00 20
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     162    170    Any
        //  162    170    162    170    Any
        //  178    180    3      8      Any
        //  119    128    128    129    Any
        //  120    128    119    120    Ljava/lang/IllegalArgumentException;
        //  120    128    119    120    Ljava/lang/AssertionError;
        //  120    128    128    129    Ljava/lang/IllegalArgumentException;
        //  120    128    119    120    Ljava/lang/ArithmeticException;
        //  139    147    147    148    Any
        //  139    147    3      8      Ljava/lang/IllegalArgumentException;
        //  139    147    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  139    147    147    148    Any
        //  139    147    3      8      Any
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
    
    public void c(final Object p0, final Method p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          725
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            717
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            709
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_2        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   java/lang/reflect/Method.isAccessible:()Z
        //    32: goto            36
        //    35: athrow         
        //    36: getstatic       dev/nuker/pyro/fc.0:I
        //    39: ifeq            47
        //    42: ldc             882795348
        //    44: goto            49
        //    47: ldc             -1882768566
        //    49: ldc             -471685967
        //    51: ixor           
        //    52: lookupswitch {
        //          -679688219: 47
        //          1814405115: 80
        //          default: 692
        //        }
        //    80: istore          4
        //    82: aload_2        
        //    83: iconst_1       
        //    84: goto            88
        //    87: athrow         
        //    88: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
        //    91: goto            95
        //    94: athrow         
        //    95: new             Ldev/nuker/pyro/f09;
        //    98: dup            
        //    99: aload_1        
        //   100: getstatic       dev/nuker/pyro/fc.1:I
        //   103: ifeq            111
        //   106: ldc             -838827414
        //   108: goto            113
        //   111: ldc             -843137006
        //   113: ldc             812591693
        //   115: ixor           
        //   116: lookupswitch {
        //          -26236889: 678
        //          1069474319: 111
        //          default: 144
        //        }
        //   144: aload_2        
        //   145: goto            149
        //   148: athrow         
        //   149: invokespecial   dev/nuker/pyro/f09.<init>:(Ljava/lang/Object;Ljava/lang/reflect/Method;)V
        //   152: goto            156
        //   155: athrow         
        //   156: astore          5
        //   158: getstatic       dev/nuker/pyro/fc.c:I
        //   161: ifge            169
        //   164: ldc             -275122622
        //   166: goto            171
        //   169: ldc             -2059278066
        //   171: ldc             -52443370
        //   173: ixor           
        //   174: lookupswitch {
        //          323367252: 169
        //          2040409624: 200
        //          default: 688
        //        }
        //   200: aload           5
        //   202: iload_3        
        //   203: goto            207
        //   206: athrow         
        //   207: invokevirtual   dev/nuker/pyro/f09.c:(I)V
        //   210: goto            214
        //   213: athrow         
        //   214: aload_2        
        //   215: iload           4
        //   217: getstatic       dev/nuker/pyro/fc.c:I
        //   220: ifge            228
        //   223: ldc             596883170
        //   225: goto            230
        //   228: ldc             -288355048
        //   230: ldc             840118914
        //   232: ixor           
        //   233: lookupswitch {
        //          -591183974: 260
        //          293635168: 228
        //          default: 680
        //        }
        //   260: goto            264
        //   263: athrow         
        //   264: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
        //   267: goto            271
        //   270: athrow         
        //   271: aload           5
        //   273: ifnull          677
        //   276: aload_0        
        //   277: getfield        dev/nuker/pyro/f07.0:Lcom/google/common/collect/Multimap;
        //   280: getstatic       dev/nuker/pyro/fc.c:I
        //   283: ifge            291
        //   286: ldc             -1159008089
        //   288: goto            293
        //   291: ldc             1381274613
        //   293: ldc             981073752
        //   295: ixor           
        //   296: lookupswitch {
        //          -2137845761: 291
        //          1747807405: 324
        //          default: 694
        //        }
        //   324: aload_1        
        //   325: aload           5
        //   327: getstatic       dev/nuker/pyro/fc.0:I
        //   330: ifeq            338
        //   333: ldc             -16547678
        //   335: goto            340
        //   338: ldc             -609361964
        //   340: ldc             1997569534
        //   342: ixor           
        //   343: lookupswitch {
        //          -2011955876: 690
        //          -1041796507: 338
        //          default: 368
        //        }
        //   368: goto            372
        //   371: athrow         
        //   372: invokeinterface com/google/common/collect/Multimap.containsEntry:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   377: goto            381
        //   380: athrow         
        //   381: ifne            506
        //   384: getstatic       dev/nuker/pyro/fc.0:I
        //   387: ifeq            395
        //   390: ldc             1054841327
        //   392: goto            397
        //   395: ldc             -1323102868
        //   397: ldc             -1439922197
        //   399: ixor           
        //   400: lookupswitch {
        //          -1796006396: 684
        //          -537444140: 395
        //          default: 428
        //        }
        //   428: aload_0        
        //   429: getfield        dev/nuker/pyro/f07.0:Lcom/google/common/collect/Multimap;
        //   432: getstatic       dev/nuker/pyro/fc.0:I
        //   435: ifeq            443
        //   438: ldc             69892959
        //   440: goto            445
        //   443: ldc             1441483986
        //   445: ldc             -185998932
        //   447: ixor           
        //   448: lookupswitch {
        //          -1593660034: 476
        //          -255616269: 443
        //          default: 698
        //        }
        //   476: aload_1        
        //   477: goto            481
        //   480: athrow         
        //   481: invokeinterface com/google/common/collect/Multimap.get:(Ljava/lang/Object;)Ljava/util/Collection;
        //   486: goto            490
        //   489: athrow         
        //   490: aload           5
        //   492: goto            496
        //   495: athrow         
        //   496: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   501: goto            505
        //   504: athrow         
        //   505: pop            
        //   506: aload_0        
        //   507: getstatic       dev/nuker/pyro/fc.1:I
        //   510: ifeq            518
        //   513: ldc             2053626925
        //   515: goto            520
        //   518: ldc             2006998881
        //   520: ldc             1368648304
        //   522: ixor           
        //   523: lookupswitch {
        //          737424989: 696
        //          1827664581: 518
        //          default: 548
        //        }
        //   548: getfield        dev/nuker/pyro/f07.c:Lcom/google/common/collect/Multimap;
        //   551: aload           5
        //   553: getstatic       dev/nuker/pyro/fc.0:I
        //   556: ifeq            564
        //   559: ldc             -486347479
        //   561: goto            566
        //   564: ldc             351860584
        //   566: ldc             1480886703
        //   568: ixor           
        //   569: lookupswitch {
        //          -1153014650: 682
        //          1255150792: 564
        //          default: 596
        //        }
        //   596: goto            600
        //   599: athrow         
        //   600: invokevirtual   dev/nuker/pyro/f09.c:()Ljava/lang/Class;
        //   603: goto            607
        //   606: athrow         
        //   607: getstatic       dev/nuker/pyro/fc.1:I
        //   610: ifeq            618
        //   613: ldc             1112854130
        //   615: goto            620
        //   618: ldc             1379297858
        //   620: ldc             358136425
        //   622: ixor           
        //   623: lookupswitch {
        //          977164484: 618
        //          1460433947: 686
        //          default: 648
        //        }
        //   648: goto            652
        //   651: athrow         
        //   652: invokeinterface com/google/common/collect/Multimap.get:(Ljava/lang/Object;)Ljava/util/Collection;
        //   657: goto            661
        //   660: athrow         
        //   661: aload           5
        //   663: goto            667
        //   666: athrow         
        //   667: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   672: goto            676
        //   675: athrow         
        //   676: pop            
        //   677: return         
        //   678: aconst_null    
        //   679: athrow         
        //   680: aconst_null    
        //   681: athrow         
        //   682: aconst_null    
        //   683: athrow         
        //   684: aconst_null    
        //   685: athrow         
        //   686: aconst_null    
        //   687: athrow         
        //   688: aconst_null    
        //   689: athrow         
        //   690: aconst_null    
        //   691: athrow         
        //   692: aconst_null    
        //   693: athrow         
        //   694: aconst_null    
        //   695: athrow         
        //   696: aconst_null    
        //   697: athrow         
        //   698: aconst_null    
        //   699: athrow         
        //   700: pop            
        //   701: goto            24
        //   704: pop            
        //   705: aconst_null    
        //   706: goto            700
        //   709: dup            
        //   710: ifnull          700
        //   713: checkcast       Ljava/lang/Throwable;
        //   716: athrow         
        //   717: dup            
        //   718: ifnull          704
        //   721: checkcast       Ljava/lang/Throwable;
        //   724: athrow         
        //   725: aconst_null    
        //   726: athrow         
        //    StackMapTable: 00 63 FF 00 03 00 05 07 00 03 07 00 05 07 00 2C 01 01 00 01 07 00 20 FA 00 04 FF 00 0B 00 00 00 01 07 00 20 FF 00 03 00 04 07 00 03 07 00 05 07 00 2C 01 00 00 43 07 00 9F 40 07 00 2C 45 07 00 20 40 01 4A 01 FF 00 01 00 04 07 00 03 07 00 05 07 00 2C 01 00 02 01 01 5E 01 FF 00 06 00 05 07 00 03 07 00 05 07 00 2C 01 01 00 01 07 00 7D FF 00 00 00 05 07 00 03 07 00 05 07 00 2C 01 01 00 02 07 00 2C 01 45 07 00 20 00 FF 00 0F 00 05 07 00 03 07 00 05 07 00 2C 01 01 00 03 08 00 5F 08 00 5F 07 00 05 FF 00 01 00 05 07 00 03 07 00 05 07 00 2C 01 01 00 04 08 00 5F 08 00 5F 07 00 05 01 FF 00 1E 00 05 07 00 03 07 00 05 07 00 2C 01 01 00 03 08 00 5F 08 00 5F 07 00 05 43 07 00 7D FF 00 00 00 05 07 00 03 07 00 05 07 00 2C 01 01 00 04 08 00 5F 08 00 5F 07 00 05 07 00 2C 45 07 00 20 40 07 00 B6 FC 00 0C 07 00 B6 41 01 1C 45 07 00 20 FF 00 00 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 B6 01 45 07 00 20 00 FF 00 0D 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 2C 01 FF 00 01 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 03 07 00 2C 01 01 FF 00 1D 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 2C 01 42 07 00 13 FF 00 00 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 2C 01 45 07 00 20 00 53 07 00 87 FF 00 01 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 87 01 5E 07 00 87 FF 00 0D 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 03 07 00 87 07 00 05 07 00 B6 FF 00 01 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 04 07 00 87 07 00 05 07 00 B6 01 FF 00 1B 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 03 07 00 87 07 00 05 07 00 B6 42 07 00 20 FF 00 00 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 03 07 00 87 07 00 05 07 00 B6 47 07 00 20 40 01 0D 41 01 1E 4E 07 00 87 FF 00 01 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 87 01 5E 07 00 87 FF 00 03 00 00 00 01 07 00 20 FF 00 00 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 87 07 00 05 47 07 00 20 40 07 00 96 44 07 00 20 FF 00 00 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 96 07 00 B6 47 07 00 20 40 01 00 4B 07 00 03 FF 00 01 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 03 01 5B 07 00 03 FF 00 0F 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 87 07 00 B6 FF 00 01 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 03 07 00 87 07 00 B6 01 FF 00 1D 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 87 07 00 B6 FF 00 02 00 00 00 01 07 00 20 FF 00 00 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 87 07 00 B6 45 07 00 20 FF 00 00 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 87 07 00 39 FF 00 0A 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 87 07 00 39 FF 00 01 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 03 07 00 87 07 00 39 01 FF 00 1B 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 87 07 00 39 42 07 00 20 FF 00 00 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 87 07 00 39 47 07 00 20 40 07 00 96 FF 00 04 00 00 00 01 07 00 20 FF 00 00 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 96 07 00 B6 47 07 00 20 40 01 00 FF 00 00 00 05 07 00 03 07 00 05 07 00 2C 01 01 00 03 08 00 5F 08 00 5F 07 00 05 FF 00 01 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 2C 01 FF 00 01 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 87 07 00 B6 01 FF 00 01 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 02 07 00 87 07 00 39 01 FF 00 01 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 03 07 00 87 07 00 05 07 00 B6 FF 00 01 00 04 07 00 03 07 00 05 07 00 2C 01 00 01 01 FF 00 01 00 06 07 00 03 07 00 05 07 00 2C 01 01 07 00 B6 00 01 07 00 87 41 07 00 03 41 07 00 87 FF 00 01 00 04 07 00 03 07 00 05 07 00 2C 01 00 01 07 00 20 43 05 44 07 00 20 47 05 FF 00 07 00 05 07 00 03 07 00 05 07 00 2C 01 01 00 01 07 00 20
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     709    717    Any
        //  709    717    709    717    Any
        //  725    727    3      8      Any
        //  28     35     35     36     Any
        //  29     35     28     29     Ljava/lang/NullPointerException;
        //  29     35     28     29     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  28     35     28     29     Ljava/lang/RuntimeException;
        //  29     35     28     29     Ljava/lang/EnumConstantNotPresentException;
        //  87     94     94     95     Any
        //  88     94     3      8      Any
        //  88     94     87     88     Ljava/lang/ArithmeticException;
        //  88     94     3      8      Any
        //  88     94     94     95     Ljava/util/NoSuchElementException;
        //  148    155    155    156    Any
        //  148    155    155    156    Any
        //  149    155    148    149    Ljava/lang/ArithmeticException;
        //  149    155    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  149    155    155    156    Ljava/lang/ClassCastException;
        //  206    213    213    214    Any
        //  206    213    206    207    Any
        //  207    213    3      8      Ljava/lang/NumberFormatException;
        //  206    213    3      8      Any
        //  207    213    3      8      Any
        //  263    270    270    271    Any
        //  263    270    263    264    Ljava/lang/StringIndexOutOfBoundsException;
        //  264    270    3      8      Ljava/lang/NumberFormatException;
        //  263    270    3      8      Ljava/lang/UnsupportedOperationException;
        //  263    270    3      8      Ljava/util/ConcurrentModificationException;
        //  371    380    380    381    Any
        //  371    380    3      8      Ljava/lang/IllegalStateException;
        //  372    380    371    372    Ljava/lang/RuntimeException;
        //  372    380    371    372    Any
        //  371    380    3      8      Any
        //  481    489    489    490    Any
        //  481    489    489    490    Any
        //  481    489    3      8      Ljava/lang/ArithmeticException;
        //  481    489    489    490    Ljava/lang/EnumConstantNotPresentException;
        //  481    489    3      8      Any
        //  495    504    504    505    Any
        //  495    504    495    496    Any
        //  495    504    495    496    Any
        //  495    504    504    505    Any
        //  495    504    495    496    Any
        //  600    606    606    607    Any
        //  600    606    606    607    Ljava/lang/StringIndexOutOfBoundsException;
        //  600    606    606    607    Any
        //  600    606    3      8      Ljava/lang/UnsupportedOperationException;
        //  600    606    606    607    Ljava/lang/AssertionError;
        //  651    660    660    661    Any
        //  652    660    651    652    Ljava/lang/RuntimeException;
        //  652    660    651    652    Any
        //  651    660    651    652    Any
        //  651    660    651    652    Ljava/lang/IllegalStateException;
        //  667    675    675    676    Any
        //  667    675    675    676    Any
        //  667    675    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  667    675    3      8      Ljava/util/ConcurrentModificationException;
        //  667    675    675    676    Ljava/lang/ArrayIndexOutOfBoundsException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visitVariable(StackMappingVisitor.java:470)
        //     at com.strobel.assembler.ir.Instruction.accept(Instruction.java:556)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:403)
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
    
    public void c(final f08 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          543
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            535
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            527
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/util/ArrayList;
        //    27: dup            
        //    28: aload_0        
        //    29: getstatic       dev/nuker/pyro/fc.0:I
        //    32: ifeq            40
        //    35: ldc             -196505509
        //    37: goto            42
        //    40: ldc             928584904
        //    42: ldc             1193480420
        //    44: ixor           
        //    45: lookupswitch {
        //          -1284865857: 40
        //          1887044652: 72
        //          default: 502
        //        }
        //    72: getfield        dev/nuker/pyro/f07.c:Lcom/google/common/collect/Multimap;
        //    75: getstatic       dev/nuker/pyro/fc.c:I
        //    78: ifge            86
        //    81: ldc             233062038
        //    83: goto            88
        //    86: ldc             1535922613
        //    88: ldc             -1527037792
        //    90: ixor           
        //    91: lookupswitch {
        //          -1457553866: 510
        //          -1404659159: 86
        //          default: 116
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokeinterface com/google/common/collect/Multimap.keySet:()Ljava/util/Set;
        //   125: goto            129
        //   128: athrow         
        //   129: goto            133
        //   132: athrow         
        //   133: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //   136: goto            140
        //   139: athrow         
        //   140: getstatic       dev/nuker/pyro/fc.0:I
        //   143: ifeq            151
        //   146: ldc             313572076
        //   148: goto            153
        //   151: ldc             416208081
        //   153: ldc             -511380865
        //   155: ixor           
        //   156: lookupswitch {
        //          -214677357: 516
        //          572372734: 151
        //          default: 184
        //        }
        //   184: astore_2       
        //   185: getstatic       dev/nuker/pyro/fc.c:I
        //   188: ifge            196
        //   191: ldc             -1990525293
        //   193: goto            198
        //   196: ldc             -764464044
        //   198: ldc             762095842
        //   200: ixor           
        //   201: lookupswitch {
        //          -1539942799: 512
        //          -1131372418: 196
        //          default: 228
        //        }
        //   228: aload_2        
        //   229: goto            233
        //   232: athrow         
        //   233: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   236: goto            240
        //   239: athrow         
        //   240: astore_3       
        //   241: getstatic       dev/nuker/pyro/fc.c:I
        //   244: ifge            253
        //   247: ldc_w           1603464766
        //   250: goto            256
        //   253: ldc_w           714388489
        //   256: ldc_w           464863697
        //   259: ixor           
        //   260: lookupswitch {
        //          824309208: 288
        //          1143451631: 253
        //          default: 514
        //        }
        //   288: aload_3        
        //   289: goto            293
        //   292: athrow         
        //   293: invokeinterface java/util/Iterator.hasNext:()Z
        //   298: goto            302
        //   301: athrow         
        //   302: ifeq            501
        //   305: getstatic       dev/nuker/pyro/fc.1:I
        //   308: ifeq            317
        //   311: ldc_w           302986307
        //   314: goto            320
        //   317: ldc_w           -682390237
        //   320: ldc_w           -1557431132
        //   323: ixor           
        //   324: lookupswitch {
        //          -1323022105: 317
        //          1954083207: 352
        //          default: 504
        //        }
        //   352: aload_3        
        //   353: goto            357
        //   356: athrow         
        //   357: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   362: goto            366
        //   365: athrow         
        //   366: checkcast       Ljava/lang/Class;
        //   369: getstatic       dev/nuker/pyro/fc.c:I
        //   372: ifge            381
        //   375: ldc_w           270964657
        //   378: goto            384
        //   381: ldc_w           390756935
        //   384: ldc_w           -694249603
        //   387: ixor           
        //   388: lookupswitch {
        //          -961019700: 506
        //          -856513700: 381
        //          default: 416
        //        }
        //   416: astore          4
        //   418: aload_0        
        //   419: getfield        dev/nuker/pyro/f07.c:Lcom/google/common/collect/Multimap;
        //   422: aload           4
        //   424: goto            428
        //   427: athrow         
        //   428: invokeinterface com/google/common/collect/Multimap.get:(Ljava/lang/Object;)Ljava/util/Collection;
        //   433: goto            437
        //   436: athrow         
        //   437: aload_1        
        //   438: getstatic       dev/nuker/pyro/fc.c:I
        //   441: ifge            450
        //   444: ldc_w           1031076433
        //   447: goto            453
        //   450: ldc_w           417259763
        //   453: ldc_w           -553410709
        //   456: ixor           
        //   457: lookupswitch {
        //          -941785192: 484
        //          -495491782: 450
        //          default: 508
        //        }
        //   484: goto            488
        //   487: athrow         
        //   488: invokeinterface java/util/Collection.remove:(Ljava/lang/Object;)Z
        //   493: goto            497
        //   496: athrow         
        //   497: pop            
        //   498: goto            241
        //   501: return         
        //   502: aconst_null    
        //   503: athrow         
        //   504: aconst_null    
        //   505: athrow         
        //   506: aconst_null    
        //   507: athrow         
        //   508: aconst_null    
        //   509: athrow         
        //   510: aconst_null    
        //   511: athrow         
        //   512: aconst_null    
        //   513: athrow         
        //   514: aconst_null    
        //   515: athrow         
        //   516: aconst_null    
        //   517: athrow         
        //   518: pop            
        //   519: goto            24
        //   522: pop            
        //   523: aconst_null    
        //   524: goto            518
        //   527: dup            
        //   528: ifnull          518
        //   531: checkcast       Ljava/lang/Throwable;
        //   534: athrow         
        //   535: dup            
        //   536: ifnull          522
        //   539: checkcast       Ljava/lang/Throwable;
        //   542: athrow         
        //   543: aconst_null    
        //   544: athrow         
        //    StackMapTable: 00 47 43 07 00 20 04 FF 00 0B 00 00 00 01 07 00 20 FD 00 03 07 00 03 07 00 6F FF 00 0F 00 02 07 00 03 07 00 6F 00 03 08 00 18 08 00 18 07 00 03 FF 00 01 00 02 07 00 03 07 00 6F 00 04 08 00 18 08 00 18 07 00 03 01 FF 00 1D 00 02 07 00 03 07 00 6F 00 03 08 00 18 08 00 18 07 00 03 FF 00 0D 00 02 07 00 03 07 00 6F 00 03 08 00 18 08 00 18 07 00 87 FF 00 01 00 02 07 00 03 07 00 6F 00 04 08 00 18 08 00 18 07 00 87 01 FF 00 1B 00 02 07 00 03 07 00 6F 00 03 08 00 18 08 00 18 07 00 87 42 07 00 20 FF 00 00 00 02 07 00 03 07 00 6F 00 03 08 00 18 08 00 18 07 00 87 47 07 00 20 FF 00 00 00 02 07 00 03 07 00 6F 00 03 08 00 18 08 00 18 07 01 18 42 07 00 20 FF 00 00 00 02 07 00 03 07 00 6F 00 03 08 00 18 08 00 18 07 01 18 45 07 00 20 40 07 00 E9 4A 07 00 E9 FF 00 01 00 02 07 00 03 07 00 6F 00 02 07 00 E9 01 5E 07 00 E9 FC 00 0B 07 00 E9 41 01 1D 43 07 00 A9 40 07 00 E9 45 07 00 20 40 07 01 04 FC 00 00 07 01 04 0B 42 01 1F 43 07 00 A7 40 07 01 04 47 07 00 20 40 01 0E 42 01 1F 43 07 00 20 40 07 01 04 47 07 00 20 40 07 00 05 4E 07 00 39 FF 00 02 00 04 07 00 03 07 00 6F 07 00 E9 07 01 04 00 02 07 00 39 01 5F 07 00 39 FF 00 0A 00 05 07 00 03 07 00 6F 07 00 E9 07 01 04 07 00 39 00 01 07 00 20 FF 00 00 00 05 07 00 03 07 00 6F 07 00 E9 07 01 04 07 00 39 00 02 07 00 87 07 00 39 47 07 00 20 40 07 00 96 FF 00 0C 00 05 07 00 03 07 00 6F 07 00 E9 07 01 04 07 00 39 00 02 07 00 96 07 00 6F FF 00 02 00 05 07 00 03 07 00 6F 07 00 E9 07 01 04 07 00 39 00 03 07 00 96 07 00 6F 01 FF 00 1E 00 05 07 00 03 07 00 6F 07 00 E9 07 01 04 07 00 39 00 02 07 00 96 07 00 6F 42 07 00 17 FF 00 00 00 05 07 00 03 07 00 6F 07 00 E9 07 01 04 07 00 39 00 02 07 00 96 07 00 6F 47 07 00 20 40 01 FA 00 03 FF 00 00 00 02 07 00 03 07 00 6F 00 03 08 00 18 08 00 18 07 00 03 FD 00 01 07 00 E9 07 01 04 41 07 00 39 FF 00 01 00 05 07 00 03 07 00 6F 07 00 E9 07 01 04 07 00 39 00 02 07 00 96 07 00 6F FF 00 01 00 02 07 00 03 07 00 6F 00 03 08 00 18 08 00 18 07 00 87 FC 00 01 07 00 E9 FC 00 01 07 01 04 FF 00 01 00 02 07 00 03 07 00 6F 00 01 07 00 E9 41 07 00 20 43 05 44 07 00 20 47 05 47 07 00 20
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     527    535    Any
        //  527    535    527    535    Ljava/util/NoSuchElementException;
        //  543    545    3      8      Any
        //  119    128    128    129    Any
        //  119    128    119    120    Any
        //  119    128    128    129    Ljava/lang/RuntimeException;
        //  120    128    3      8      Any
        //  119    128    119    120    Ljava/lang/AssertionError;
        //  132    139    139    140    Any
        //  132    139    132    133    Any
        //  133    139    3      8      Any
        //  133    139    132    133    Any
        //  133    139    3      8      Ljava/lang/ClassCastException;
        //  232    239    239    240    Any
        //  233    239    239    240    Ljava/util/NoSuchElementException;
        //  232    239    239    240    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  233    239    239    240    Any
        //  233    239    232    233    Ljava/lang/IllegalStateException;
        //  292    301    301    302    Any
        //  293    301    301    302    Ljava/lang/UnsupportedOperationException;
        //  292    301    3      8      Any
        //  293    301    301    302    Ljava/lang/AssertionError;
        //  292    301    292    293    Ljava/util/ConcurrentModificationException;
        //  356    365    365    366    Any
        //  356    365    356    357    Any
        //  357    365    365    366    Ljava/lang/IllegalStateException;
        //  357    365    356    357    Ljava/lang/AssertionError;
        //  356    365    365    366    Ljava/lang/AssertionError;
        //  427    436    436    437    Any
        //  428    436    427    428    Ljava/lang/StringIndexOutOfBoundsException;
        //  427    436    427    428    Any
        //  427    436    3      8      Ljava/util/ConcurrentModificationException;
        //  428    436    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  487    496    496    497    Any
        //  488    496    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  487    496    487    488    Ljava/lang/NumberFormatException;
        //  487    496    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  488    496    3      8      Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:414)
        //     at com.strobel.assembler.ir.Instruction.accept(Instruction.java:490)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:403)
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
    public void c(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          191
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            183
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            175
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f07.c:Lcom/google/common/collect/Multimap;
        //    28: aload_1        
        //    29: goto            33
        //    32: athrow         
        //    33: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    36: goto            40
        //    39: athrow         
        //    40: getstatic       dev/nuker/pyro/fc.c:I
        //    43: ifge            52
        //    46: ldc_w           353359042
        //    49: goto            55
        //    52: ldc_w           494545552
        //    55: ldc_w           1310739889
        //    58: ixor           
        //    59: lookupswitch {
        //          1529846131: 164
        //          1827698398: 52
        //          default: 84
        //        }
        //    84: goto            88
        //    87: athrow         
        //    88: invokeinterface com/google/common/collect/Multimap.get:(Ljava/lang/Object;)Ljava/util/Collection;
        //    93: goto            97
        //    96: athrow         
        //    97: goto            101
        //   100: athrow         
        //   101: invokeinterface java/util/Collection.stream:()Ljava/util/stream/Stream;
        //   106: goto            110
        //   109: athrow         
        //   110: invokedynamic   BootstrapMethod #2, compare:()Ljava/util/Comparator;
        //   115: goto            119
        //   118: athrow         
        //   119: invokeinterface java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
        //   124: goto            128
        //   127: athrow         
        //   128: aload_1        
        //   129: invokedynamic   BootstrapMethod #3, accept:(Ljava/lang/Object;)Ljava/util/function/Consumer;
        //   134: goto            138
        //   137: athrow         
        //   138: invokeinterface java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        //   143: goto            147
        //   146: athrow         
        //   147: goto            163
        //   150: astore_2       
        //   151: aload_2        
        //   152: goto            156
        //   155: athrow         
        //   156: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   159: goto            163
        //   162: athrow         
        //   163: return         
        //   164: aconst_null    
        //   165: athrow         
        //   166: pop            
        //   167: goto            24
        //   170: pop            
        //   171: aconst_null    
        //   172: goto            166
        //   175: dup            
        //   176: ifnull          166
        //   179: checkcast       Ljava/lang/Throwable;
        //   182: athrow         
        //   183: dup            
        //   184: ifnull          170
        //   187: checkcast       Ljava/lang/Throwable;
        //   190: athrow         
        //   191: aconst_null    
        //   192: athrow         
        //    StackMapTable: 00 26 43 07 00 20 04 FF 00 0B 00 00 00 01 07 00 20 FD 00 03 07 00 03 07 00 05 FF 00 07 00 00 00 01 07 00 20 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 05 45 07 00 20 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 39 FF 00 0B 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 39 FF 00 02 00 02 07 00 03 07 00 05 00 03 07 00 87 07 00 39 01 FF 00 1C 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 39 42 07 00 20 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 39 47 07 00 20 40 07 00 96 FF 00 02 00 00 00 01 07 00 20 FF 00 00 00 02 07 00 03 07 00 05 00 01 07 00 96 47 07 00 20 40 07 01 2F 47 07 00 20 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 01 2F 07 01 40 47 07 00 20 40 07 01 2F FF 00 08 00 00 00 01 07 00 20 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 01 2F 07 00 9C 47 07 00 20 00 42 07 01 1A FF 00 04 00 03 07 00 03 07 00 05 07 01 1A 00 01 07 00 20 40 07 01 1A 45 07 00 20 FA 00 00 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 39 41 07 00 20 43 05 44 07 00 20 47 05 47 07 00 20
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  24     32     150    163    Ljava/lang/Exception;
        //  33     100    150    163    Ljava/lang/Exception;
        //  101    137    150    163    Ljava/lang/Exception;
        //  138    147    150    163    Ljava/lang/Exception;
        //  8      20     175    183    Ljava/lang/NullPointerException;
        //  175    183    175    183    Any
        //  191    193    3      8      Ljava/lang/NegativeArraySizeException;
        //  33     39     39     40     Any
        //  33     39     3      8      Any
        //  33     39     39     40     Ljava/lang/EnumConstantNotPresentException;
        //  33     39     39     40     Ljava/lang/IllegalArgumentException;
        //  33     39     39     40     Any
        //  87     96     96     97     Any
        //  88     96     3      8      Ljava/lang/NullPointerException;
        //  88     96     96     97     Any
        //  88     96     87     88     Any
        //  87     96     3      8      Any
        //  101    109    109    110    Any
        //  101    109    109    110    Ljava/lang/StringIndexOutOfBoundsException;
        //  101    109    3      8      Any
        //  101    109    109    110    Ljava/lang/ArithmeticException;
        //  101    109    3      8      Any
        //  118    127    127    128    Any
        //  119    127    118    119    Any
        //  118    127    127    128    Ljava/lang/StringIndexOutOfBoundsException;
        //  118    127    127    128    Ljava/lang/IllegalStateException;
        //  119    127    118    119    Ljava/lang/IllegalStateException;
        //  138    146    146    147    Any
        //  138    146    3      8      Any
        //  138    146    146    147    Any
        //  138    146    146    147    Ljava/lang/AssertionError;
        //  138    146    3      8      Any
        //  155    162    162    163    Any
        //  156    162    162    163    Ljava/lang/NegativeArraySizeException;
        //  155    162    162    163    Any
        //  155    162    155    156    Any
        //  156    162    3      8      Ljava/lang/ClassCastException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:738)
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
    
    public static void c(final Object o, final f08 f08) {
        Object o2 = null;
        Label_0008: {
            break Label_0008;
        Label_0104:
            while (true) {
            Block_6_Outer:
                do {
                    Label_0091: {
                        break Label_0091;
                        try {
                            o2 = null;
                            if (fc.0 <= 0) {
                                null;
                                goto Label_0096;
                            }
                            continue Label_0104;
                            // switch([Lcom.strobel.decompiler.ast.Label;@689e519f, n ^ 0x86020ACD)
                            while (true) {
                                while (true) {
                                    Label_0037: {
                                        final int n = -1703840094;
                                    }
                                    continue Block_6_Outer;
                                    final int n = 483991403;
                                    continue Block_6_Outer;
                                }
                                Label_0085: {
                                    throw null;
                                }
                                Label_0072:
                                Label_0077: {
                                    break Label_0077;
                                    try {
                                        f08.accept(o);
                                    }
                                    catch (UnsupportedOperationException ex) {}
                                    finally {
                                        throw;
                                    }
                                }
                                return;
                                continue;
                            }
                        }
                        // iftrue(Label_0037:, fc.1 == 0)
                        catch (ClassCastException ex2) {}
                    }
                    continue Label_0104;
                } while (o2 == null);
                break;
            }
        }
        throw (Throwable)o2;
    }
    
    public f07() {
        while (true) {
            int n = 0;
            Label_0015: {
                if (fc.0 != 0) {
                    n = -1885630882;
                    break Label_0015;
                }
                n = 1219714965;
            }
            switch (n ^ 0xE73A9941) {
                case 1755387679: {
                    continue;
                }
                case -1349925164: {
                    this.c = (Multimap<Class<?>, f08>)Multimaps.newSetMultimap((Map)new ConcurrentHashMap(), ConcurrentHashMap::newKeySet);
                    while (true) {
                        int n2 = 0;
                        Label_0082: {
                            if (fc.c < 0) {
                                n2 = -1442283445;
                                break Label_0082;
                            }
                            n2 = 2056483043;
                        }
                        switch (n2 ^ 0x77CA9A3E) {
                            case -574481803: {
                                continue;
                            }
                            case 223996637: {
                                while (true) {
                                    int n3 = 0;
                                    Label_0132: {
                                        if (fc.c < 0) {
                                            n3 = -1988667310;
                                            break Label_0132;
                                        }
                                        n3 = 160036040;
                                    }
                                    switch (n3 ^ 0xAE73555B) {
                                        case -2123307870: {
                                            continue;
                                        }
                                        default: {
                                            this.0 = (Multimap<Object, f08>)Multimaps.newSetMultimap((Map)new ConcurrentHashMap(), ConcurrentHashMap::newKeySet);
                                            return;
                                        }
                                        case 654576905: {
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
    
    public void c(final Object p0, final Method p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          189
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            181
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            173
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            36
        //    30: ldc_w           552998164
        //    33: goto            39
        //    36: ldc_w           498899890
        //    39: ldc_w           1556971632
        //    42: ixor           
        //    43: lookupswitch {
        //          915218148: 36
        //          2084279652: 162
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: getstatic       dev/nuker/pyro/fc.c:I
        //    72: ifge            81
        //    75: ldc_w           -506098691
        //    78: goto            84
        //    81: ldc_w           -343982048
        //    84: ldc_w           701610904
        //    87: ixor           
        //    88: lookupswitch {
        //          -939249563: 160
        //          2037672743: 81
        //          default: 116
        //        }
        //   116: aload_1        
        //   117: aload_2        
        //   118: aload_2        
        //   119: ldc             Ldev/nuker/pyro/f06;.class
        //   121: goto            125
        //   124: athrow         
        //   125: invokevirtual   java/lang/reflect/Method.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //   128: goto            132
        //   131: athrow         
        //   132: checkcast       Ldev/nuker/pyro/f06;
        //   135: goto            139
        //   138: athrow         
        //   139: invokeinterface dev/nuker/pyro/f06.c:()I
        //   144: goto            148
        //   147: athrow         
        //   148: goto            152
        //   151: athrow         
        //   152: invokespecial   dev/nuker/pyro/f07.c:(Ljava/lang/Object;Ljava/lang/reflect/Method;I)V
        //   155: goto            159
        //   158: athrow         
        //   159: return         
        //   160: aconst_null    
        //   161: athrow         
        //   162: aconst_null    
        //   163: athrow         
        //   164: pop            
        //   165: goto            24
        //   168: pop            
        //   169: aconst_null    
        //   170: goto            164
        //   173: dup            
        //   174: ifnull          164
        //   177: checkcast       Ljava/lang/Throwable;
        //   180: athrow         
        //   181: dup            
        //   182: ifnull          168
        //   185: checkcast       Ljava/lang/Throwable;
        //   188: athrow         
        //   189: aconst_null    
        //   190: athrow         
        //    StackMapTable: 00 1D 43 07 00 20 04 FF 00 0B 00 00 00 01 07 00 20 FE 00 03 07 00 03 07 00 05 07 00 2C 0B 42 01 1C 4C 07 00 03 FF 00 02 00 03 07 00 03 07 00 05 07 00 2C 00 02 07 00 03 01 5F 07 00 03 47 07 00 20 FF 00 00 00 03 07 00 03 07 00 05 07 00 2C 00 05 07 00 03 07 00 05 07 00 2C 07 00 2C 07 00 39 45 07 00 20 FF 00 00 00 03 07 00 03 07 00 05 07 00 2C 00 04 07 00 03 07 00 05 07 00 2C 07 01 5F 45 07 00 20 FF 00 00 00 03 07 00 03 07 00 05 07 00 2C 00 04 07 00 03 07 00 05 07 00 2C 07 00 27 47 07 00 20 FF 00 00 00 03 07 00 03 07 00 05 07 00 2C 00 04 07 00 03 07 00 05 07 00 2C 01 42 07 00 20 FF 00 00 00 03 07 00 03 07 00 05 07 00 2C 00 04 07 00 03 07 00 05 07 00 2C 01 45 07 00 20 00 40 07 00 03 01 41 07 00 20 43 05 44 07 00 20 47 05 47 07 00 20
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  8      20     173    181    Any
        //  173    181    173    181    Any
        //  189    191    3      8      Ljava/lang/ClassCastException;
        //  124    131    131    132    Any
        //  125    131    131    132    Any
        //  125    131    124    125    Any
        //  125    131    131    132    Any
        //  125    131    131    132    Any
        //  138    147    147    148    Any
        //  139    147    138    139    Any
        //  138    147    3      8      Any
        //  139    147    147    148    Any
        //  139    147    3      8      Any
        //  151    158    158    159    Any
        //  152    158    3      8      Any
        //  152    158    3      8      Ljava/lang/RuntimeException;
        //  151    158    158    159    Any
        //  152    158    151    152    Any
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
    
    @Override
    public void 0(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          805
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            797
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            789
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    32: goto            36
        //    35: athrow         
        //    36: goto            40
        //    39: athrow         
        //    40: invokevirtual   java/lang/Class.getDeclaredMethods:()[Ljava/lang/reflect/Method;
        //    43: goto            47
        //    46: athrow         
        //    47: goto            51
        //    50: athrow         
        //    51: invokestatic    java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
        //    54: goto            58
        //    57: athrow         
        //    58: invokedynamic   BootstrapMethod #4, test:()Ljava/util/function/Predicate;
        //    63: goto            67
        //    66: athrow         
        //    67: invokeinterface java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        //    72: goto            76
        //    75: athrow         
        //    76: getstatic       dev/nuker/pyro/fc.1:I
        //    79: ifeq            88
        //    82: ldc_w           1867263232
        //    85: goto            91
        //    88: ldc_w           -1541962724
        //    91: ldc_w           315387410
        //    94: ixor           
        //    95: lookupswitch {
        //          1963431970: 88
        //          2105557778: 766
        //          default: 120
        //        }
        //   120: aload_0        
        //   121: getstatic       dev/nuker/pyro/fc.0:I
        //   124: ifeq            133
        //   127: ldc_w           -716742654
        //   130: goto            136
        //   133: ldc_w           -1874032922
        //   136: ldc_w           -1620203711
        //   139: ixor           
        //   140: lookupswitch {
        //          253829543: 168
        //          1244317507: 133
        //          default: 768
        //        }
        //   168: aload_1        
        //   169: invokedynamic   BootstrapMethod #5, accept:(Ldev/nuker/pyro/f07;Ljava/lang/Object;)Ljava/util/function/Consumer;
        //   174: goto            178
        //   177: athrow         
        //   178: invokeinterface java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        //   183: goto            187
        //   186: athrow         
        //   187: getstatic       dev/nuker/pyro/f07.1:Lcom/google/common/collect/Multimap;
        //   190: aload_1        
        //   191: getstatic       dev/nuker/pyro/fc.0:I
        //   194: ifeq            203
        //   197: ldc_w           -1789657945
        //   200: goto            206
        //   203: ldc_w           -1805784154
        //   206: ldc_w           289490110
        //   209: ixor           
        //   210: lookupswitch {
        //          -2079148007: 203
        //          -2061717736: 236
        //          default: 770
        //        }
        //   236: goto            240
        //   239: athrow         
        //   240: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   243: goto            247
        //   246: athrow         
        //   247: getstatic       dev/nuker/pyro/fc.1:I
        //   250: ifeq            259
        //   253: ldc_w           -1265832642
        //   256: goto            262
        //   259: ldc_w           807931404
        //   262: ldc_w           -1930613792
        //   265: ixor           
        //   266: lookupswitch {
        //          945931998: 772
        //          1181607349: 259
        //          default: 292
        //        }
        //   292: goto            296
        //   295: athrow         
        //   296: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   299: goto            303
        //   302: athrow         
        //   303: goto            307
        //   306: athrow         
        //   307: invokeinterface com/google/common/collect/Multimap.containsKey:(Ljava/lang/Object;)Z
        //   312: goto            316
        //   315: athrow         
        //   316: ifeq            325
        //   319: ldc_w           1750769025
        //   322: goto            328
        //   325: ldc_w           1750769024
        //   328: ldc_w           1032518415
        //   331: ixor           
        //   332: tableswitch {
        //          -1415525092: 356
        //          -1415525091: 763
        //          default: 319
        //        }
        //   356: getstatic       dev/nuker/pyro/f07.1:Lcom/google/common/collect/Multimap;
        //   359: aload_1        
        //   360: goto            364
        //   363: athrow         
        //   364: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   367: goto            371
        //   370: athrow         
        //   371: goto            375
        //   374: athrow         
        //   375: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   378: goto            382
        //   381: athrow         
        //   382: goto            386
        //   385: athrow         
        //   386: invokeinterface com/google/common/collect/Multimap.get:(Ljava/lang/Object;)Ljava/util/Collection;
        //   391: goto            395
        //   394: athrow         
        //   395: goto            399
        //   398: athrow         
        //   399: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   404: goto            408
        //   407: athrow         
        //   408: astore_2       
        //   409: aload_2        
        //   410: getstatic       dev/nuker/pyro/fc.1:I
        //   413: ifeq            422
        //   416: ldc_w           965266089
        //   419: goto            425
        //   422: ldc_w           1944571649
        //   425: ldc_w           1891930296
        //   428: ixor           
        //   429: lookupswitch {
        //          1229740561: 778
        //          1826665802: 422
        //          default: 456
        //        }
        //   456: goto            460
        //   459: athrow         
        //   460: invokeinterface java/util/Iterator.hasNext:()Z
        //   465: goto            469
        //   468: athrow         
        //   469: ifeq            478
        //   472: ldc_w           1446999566
        //   475: goto            481
        //   478: ldc_w           1446999565
        //   481: ldc_w           1858790899
        //   484: ixor           
        //   485: tableswitch {
        //          1911236602: 508
        //          1911236603: 763
        //          default: 472
        //        }
        //   508: getstatic       dev/nuker/pyro/fc.1:I
        //   511: ifeq            520
        //   514: ldc_w           -1405907322
        //   517: goto            523
        //   520: ldc_w           11786760
        //   523: ldc_w           -2085262027
        //   526: ixor           
        //   527: lookupswitch {
        //          -103333161: 520
        //          797369267: 764
        //          default: 552
        //        }
        //   552: aload_2        
        //   553: goto            557
        //   556: athrow         
        //   557: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   562: goto            566
        //   565: athrow         
        //   566: checkcast       Ldev/nuker/pyro/f08;
        //   569: astore_3       
        //   570: aload_0        
        //   571: getfield        dev/nuker/pyro/f07.0:Lcom/google/common/collect/Multimap;
        //   574: aload_1        
        //   575: aload_3        
        //   576: getstatic       dev/nuker/pyro/fc.0:I
        //   579: ifeq            588
        //   582: ldc_w           1137424596
        //   585: goto            591
        //   588: ldc_w           -960503434
        //   591: ldc_w           2055290040
        //   594: ixor           
        //   595: lookupswitch {
        //          -1136730674: 620
        //          961184876: 588
        //          default: 774
        //        }
        //   620: goto            624
        //   623: athrow         
        //   624: invokeinterface com/google/common/collect/Multimap.containsEntry:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   629: goto            633
        //   632: athrow         
        //   633: ifne            716
        //   636: aload_0        
        //   637: getfield        dev/nuker/pyro/f07.0:Lcom/google/common/collect/Multimap;
        //   640: aload_1        
        //   641: getstatic       dev/nuker/pyro/fc.1:I
        //   644: ifeq            653
        //   647: ldc_w           -590707880
        //   650: goto            656
        //   653: ldc_w           571983857
        //   656: ldc_w           449259309
        //   659: ixor           
        //   660: lookupswitch {
        //          -1355759794: 653
        //          -972184459: 776
        //          default: 688
        //        }
        //   688: goto            692
        //   691: athrow         
        //   692: invokeinterface com/google/common/collect/Multimap.get:(Ljava/lang/Object;)Ljava/util/Collection;
        //   697: goto            701
        //   700: athrow         
        //   701: aload_3        
        //   702: goto            706
        //   705: athrow         
        //   706: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   711: goto            715
        //   714: athrow         
        //   715: pop            
        //   716: aload_0        
        //   717: getfield        dev/nuker/pyro/f07.c:Lcom/google/common/collect/Multimap;
        //   720: aload_3        
        //   721: goto            725
        //   724: athrow         
        //   725: invokevirtual   dev/nuker/pyro/f08.c:()Ljava/lang/Class;
        //   728: goto            732
        //   731: athrow         
        //   732: goto            736
        //   735: athrow         
        //   736: invokeinterface com/google/common/collect/Multimap.get:(Ljava/lang/Object;)Ljava/util/Collection;
        //   741: goto            745
        //   744: athrow         
        //   745: aload_3        
        //   746: goto            750
        //   749: athrow         
        //   750: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   755: goto            759
        //   758: athrow         
        //   759: pop            
        //   760: goto            409
        //   763: return         
        //   764: aconst_null    
        //   765: athrow         
        //   766: aconst_null    
        //   767: athrow         
        //   768: aconst_null    
        //   769: athrow         
        //   770: aconst_null    
        //   771: athrow         
        //   772: aconst_null    
        //   773: athrow         
        //   774: aconst_null    
        //   775: athrow         
        //   776: aconst_null    
        //   777: athrow         
        //   778: aconst_null    
        //   779: athrow         
        //   780: pop            
        //   781: goto            24
        //   784: pop            
        //   785: aconst_null    
        //   786: goto            780
        //   789: dup            
        //   790: ifnull          780
        //   793: checkcast       Ljava/lang/Throwable;
        //   796: athrow         
        //   797: dup            
        //   798: ifnull          784
        //   801: checkcast       Ljava/lang/Throwable;
        //   804: athrow         
        //   805: aconst_null    
        //   806: athrow         
        //    StackMapTable: 00 84 43 07 00 20 04 FF 00 0B 00 00 00 01 07 00 20 FD 00 03 07 00 03 07 00 05 FF 00 03 00 00 00 01 07 00 20 FF 00 00 00 02 07 00 03 07 00 05 00 01 07 00 05 45 07 00 20 40 07 00 39 42 07 00 20 40 07 00 39 45 07 00 20 40 07 01 A6 42 07 00 11 40 07 01 A6 45 07 00 20 40 07 01 2F FF 00 07 00 00 00 01 07 00 20 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 01 2F 07 01 A8 47 07 00 20 40 07 01 2F 4B 07 01 2F FF 00 02 00 02 07 00 03 07 00 05 00 02 07 01 2F 01 5C 07 01 2F FF 00 0C 00 02 07 00 03 07 00 05 00 02 07 01 2F 07 00 03 FF 00 02 00 02 07 00 03 07 00 05 00 03 07 01 2F 07 00 03 01 FF 00 1F 00 02 07 00 03 07 00 05 00 02 07 01 2F 07 00 03 48 07 00 20 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 01 2F 07 00 9C 47 07 00 20 00 FF 00 0F 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 05 FF 00 02 00 02 07 00 03 07 00 05 00 03 07 00 87 07 00 05 01 FF 00 1D 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 05 FF 00 02 00 00 00 01 07 00 20 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 05 45 07 00 20 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 39 FF 00 0B 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 39 FF 00 02 00 02 07 00 03 07 00 05 00 03 07 00 87 07 00 39 01 FF 00 1D 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 39 42 07 00 11 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 39 45 07 00 20 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 00 87 07 01 AA 42 07 00 62 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 00 87 07 01 AA 47 07 00 20 40 01 02 05 42 01 1B 46 07 00 19 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 05 45 07 00 20 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 39 42 07 00 9F FF 00 00 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 39 45 07 00 20 FF 00 00 00 02 07 00 03 07 00 05 00 02 07 00 87 07 01 AA 42 07 00 9F FF 00 00 00 02 07 00 03 07 00 05 00 02 07 00 87 07 01 AA 47 07 00 20 40 07 00 96 42 07 00 A5 40 07 00 96 47 07 00 20 40 07 01 04 FC 00 00 07 01 04 4C 07 01 04 FF 00 02 00 03 07 00 03 07 00 05 07 01 04 00 02 07 01 04 01 5E 07 01 04 FF 00 02 00 00 00 01 07 00 20 FF 00 00 00 03 07 00 03 07 00 05 07 01 04 00 01 07 01 04 47 07 00 20 40 01 02 05 42 01 1A 0B 42 01 1C 43 07 00 66 40 07 01 04 47 07 00 20 40 07 00 05 FF 00 15 00 04 07 00 03 07 00 05 07 01 04 07 00 6F 00 03 07 00 87 07 00 05 07 00 6F FF 00 02 00 04 07 00 03 07 00 05 07 01 04 07 00 6F 00 04 07 00 87 07 00 05 07 00 6F 01 FF 00 1C 00 04 07 00 03 07 00 05 07 01 04 07 00 6F 00 03 07 00 87 07 00 05 07 00 6F 42 07 00 20 FF 00 00 00 04 07 00 03 07 00 05 07 01 04 07 00 6F 00 03 07 00 87 07 00 05 07 00 6F 47 07 00 20 40 01 FF 00 13 00 04 07 00 03 07 00 05 07 01 04 07 00 6F 00 02 07 00 87 07 00 05 FF 00 02 00 04 07 00 03 07 00 05 07 01 04 07 00 6F 00 03 07 00 87 07 00 05 01 FF 00 1F 00 04 07 00 03 07 00 05 07 01 04 07 00 6F 00 02 07 00 87 07 00 05 42 07 00 20 FF 00 00 00 04 07 00 03 07 00 05 07 01 04 07 00 6F 00 02 07 00 87 07 00 05 47 07 00 20 40 07 00 96 43 07 00 20 FF 00 00 00 04 07 00 03 07 00 05 07 01 04 07 00 6F 00 02 07 00 96 07 00 6F 47 07 00 20 40 01 00 47 07 00 20 FF 00 00 00 04 07 00 03 07 00 05 07 01 04 07 00 6F 00 02 07 00 87 07 00 6F 45 07 00 20 FF 00 00 00 04 07 00 03 07 00 05 07 01 04 07 00 6F 00 02 07 00 87 07 00 39 42 07 00 20 FF 00 00 00 04 07 00 03 07 00 05 07 01 04 07 00 6F 00 02 07 00 87 07 00 39 47 07 00 20 40 07 00 96 FF 00 03 00 00 00 01 07 00 20 FF 00 00 00 04 07 00 03 07 00 05 07 01 04 07 00 6F 00 02 07 00 96 07 00 6F 47 07 00 20 40 01 F9 00 03 FC 00 00 07 01 04 FF 00 01 00 02 07 00 03 07 00 05 00 01 07 01 2F FF 00 01 00 02 07 00 03 07 00 05 00 02 07 01 2F 07 00 03 FF 00 01 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 05 FF 00 01 00 02 07 00 03 07 00 05 00 02 07 00 87 07 00 39 FF 00 01 00 04 07 00 03 07 00 05 07 01 04 07 00 6F 00 03 07 00 87 07 00 05 07 00 6F FF 00 01 00 04 07 00 03 07 00 05 07 01 04 07 00 6F 00 02 07 00 87 07 00 05 FF 00 01 00 03 07 00 03 07 00 05 07 01 04 00 01 07 01 04 FF 00 01 00 02 07 00 03 07 00 05 00 01 07 00 20 43 05 44 07 00 20 47 05 47 07 00 20
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     789    797    Ljava/lang/EnumConstantNotPresentException;
        //  789    797    789    797    Any
        //  805    807    3      8      Any
        //  29     35     35     36     Any
        //  29     35     3      8      Ljava/lang/NullPointerException;
        //  29     35     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  29     35     35     36     Ljava/util/NoSuchElementException;
        //  29     35     35     36     Any
        //  39     46     46     47     Any
        //  39     46     3      8      Any
        //  40     46     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  40     46     39     40     Any
        //  40     46     46     47     Any
        //  50     57     57     58     Any
        //  51     57     3      8      Any
        //  50     57     50     51     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  51     57     57     58     Ljava/lang/AssertionError;
        //  50     57     57     58     Any
        //  67     75     75     76     Any
        //  67     75     75     76     Ljava/util/NoSuchElementException;
        //  67     75     3      8      Any
        //  67     75     3      8      Any
        //  67     75     3      8      Any
        //  177    186    186    187    Any
        //  177    186    177    178    Any
        //  177    186    3      8      Any
        //  178    186    3      8      Ljava/util/ConcurrentModificationException;
        //  178    186    186    187    Any
        //  240    246    246    247    Any
        //  240    246    3      8      Any
        //  240    246    246    247    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  240    246    246    247    Any
        //  240    246    3      8      Any
        //  295    302    302    303    Any
        //  295    302    302    303    Any
        //  296    302    3      8      Any
        //  295    302    302    303    Ljava/util/NoSuchElementException;
        //  295    302    295    296    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  306    315    315    316    Any
        //  306    315    306    307    Ljava/lang/NullPointerException;
        //  306    315    315    316    Ljava/lang/IndexOutOfBoundsException;
        //  307    315    3      8      Any
        //  307    315    315    316    Ljava/util/ConcurrentModificationException;
        //  363    370    370    371    Any
        //  363    370    370    371    Ljava/lang/IllegalStateException;
        //  364    370    363    364    Ljava/lang/IllegalArgumentException;
        //  363    370    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  363    370    3      8      Any
        //  374    381    381    382    Any
        //  375    381    381    382    Any
        //  375    381    381    382    Any
        //  375    381    374    375    Ljava/util/NoSuchElementException;
        //  374    381    374    375    Ljava/util/ConcurrentModificationException;
        //  385    394    394    395    Any
        //  385    394    385    386    Ljava/util/ConcurrentModificationException;
        //  386    394    385    386    Ljava/util/NoSuchElementException;
        //  385    394    3      8      Any
        //  385    394    394    395    Any
        //  398    407    407    408    Any
        //  399    407    398    399    Ljava/lang/ClassCastException;
        //  398    407    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  399    407    407    408    Any
        //  398    407    407    408    Ljava/lang/AssertionError;
        //  460    468    468    469    Any
        //  460    468    3      8      Any
        //  460    468    3      8      Ljava/lang/RuntimeException;
        //  460    468    3      8      Any
        //  460    468    3      8      Ljava/util/NoSuchElementException;
        //  556    565    565    566    Any
        //  556    565    565    566    Any
        //  556    565    565    566    Any
        //  556    565    556    557    Ljava/lang/IndexOutOfBoundsException;
        //  557    565    565    566    Ljava/lang/UnsupportedOperationException;
        //  623    632    632    633    Any
        //  624    632    623    624    Any
        //  623    632    632    633    Any
        //  624    632    3      8      Ljava/util/ConcurrentModificationException;
        //  623    632    623    624    Ljava/lang/IllegalStateException;
        //  691    700    700    701    Any
        //  692    700    691    692    Any
        //  691    700    691    692    Ljava/lang/IllegalStateException;
        //  692    700    691    692    Ljava/lang/IllegalStateException;
        //  692    700    700    701    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  705    714    714    715    Any
        //  706    714    3      8      Ljava/lang/IllegalStateException;
        //  705    714    714    715    Any
        //  705    714    705    706    Any
        //  705    714    3      8      Ljava/lang/ArithmeticException;
        //  724    731    731    732    Any
        //  725    731    724    725    Ljava/util/ConcurrentModificationException;
        //  724    731    724    725    Any
        //  725    731    731    732    Ljava/lang/IllegalArgumentException;
        //  725    731    731    732    Ljava/lang/IllegalArgumentException;
        //  735    744    744    745    Any
        //  736    744    744    745    Any
        //  736    744    735    736    Ljava/lang/NegativeArraySizeException;
        //  735    744    3      8      Ljava/util/ConcurrentModificationException;
        //  735    744    735    736    Ljava/lang/AssertionError;
        //  750    758    758    759    Any
        //  750    758    758    759    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  750    758    3      8      Any
        //  750    758    3      8      Ljava/util/NoSuchElementException;
        //  750    758    758    759    Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:738)
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
