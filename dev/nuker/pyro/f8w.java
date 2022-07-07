// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public class f8W extends fbk
{
    public void c(final f3e f3e) {
        throw new UnsupportedOperationException("Please report this to the binscure obfuscator developers");
    }
    
    public void c() {
        throw new UnsupportedOperationException("Please report this to the binscure obfuscator developers");
    }
    
    public static double c(final double p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          248
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            240
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            232
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iload_2        
        //    25: ifge            44
        //    28: new             Ljava/lang/IllegalArgumentException;
        //    31: dup            
        //    32: goto            36
        //    35: athrow         
        //    36: invokespecial   java/lang/IllegalArgumentException.<init>:()V
        //    39: goto            43
        //    42: athrow         
        //    43: athrow         
        //    44: new             Ljava/math/BigDecimal;
        //    47: dup            
        //    48: dload_0        
        //    49: goto            53
        //    52: athrow         
        //    53: invokespecial   java/math/BigDecimal.<init>:(D)V
        //    56: goto            60
        //    59: athrow         
        //    60: astore_3       
        //    61: aload_3        
        //    62: iload_2        
        //    63: getstatic       dev/nuker/pyro/fc.1:I
        //    66: ifeq            74
        //    69: ldc             1529403470
        //    71: goto            76
        //    74: ldc             -290555060
        //    76: ldc             -264751280
        //    78: ixor           
        //    79: lookupswitch {
        //          -1424953570: 74
        //          513166364: 104
        //          default: 221
        //        }
        //   104: getstatic       java/math/RoundingMode.HALF_UP:Ljava/math/RoundingMode;
        //   107: getstatic       dev/nuker/pyro/fc.1:I
        //   110: ifeq            118
        //   113: ldc             1477925650
        //   115: goto            120
        //   118: ldc             -1903628381
        //   120: ldc             -1001606891
        //   122: ixor           
        //   123: lookupswitch {
        //          -1671697913: 118
        //          1254383286: 148
        //          default: 219
        //        }
        //   148: goto            152
        //   151: athrow         
        //   152: invokevirtual   java/math/BigDecimal.setScale:(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;
        //   155: goto            159
        //   158: athrow         
        //   159: astore_3       
        //   160: getstatic       dev/nuker/pyro/fc.1:I
        //   163: ifeq            171
        //   166: ldc             -1597541939
        //   168: goto            173
        //   171: ldc             -311734614
        //   173: ldc             -1795998847
        //   175: ixor           
        //   176: lookupswitch {
        //          875842124: 171
        //          2040034603: 204
        //          default: 217
        //        }
        //   204: aload_3        
        //   205: goto            209
        //   208: athrow         
        //   209: invokevirtual   java/math/BigDecimal.doubleValue:()D
        //   212: goto            216
        //   215: athrow         
        //   216: dreturn        
        //   217: aconst_null    
        //   218: athrow         
        //   219: aconst_null    
        //   220: athrow         
        //   221: aconst_null    
        //   222: athrow         
        //   223: pop            
        //   224: goto            24
        //   227: pop            
        //   228: aconst_null    
        //   229: goto            223
        //   232: dup            
        //   233: ifnull          223
        //   236: checkcast       Ljava/lang/Throwable;
        //   239: athrow         
        //   240: dup            
        //   241: ifnull          227
        //   244: checkcast       Ljava/lang/Throwable;
        //   247: athrow         
        //   248: aconst_null    
        //   249: athrow         
        //    StackMapTable: 00 26 43 07 00 24 04 FF 00 0B 00 00 00 01 07 00 24 FD 00 03 03 01 4A 07 00 49 FF 00 00 00 02 03 01 00 02 08 00 1C 08 00 1C 45 07 00 24 40 07 00 26 00 47 07 00 24 FF 00 00 00 02 03 01 00 03 08 00 2C 08 00 2C 03 45 07 00 24 40 07 00 2A FF 00 0D 00 03 03 01 07 00 2A 00 02 07 00 2A 01 FF 00 01 00 03 03 01 07 00 2A 00 03 07 00 2A 01 01 FF 00 1B 00 03 03 01 07 00 2A 00 02 07 00 2A 01 FF 00 0D 00 03 03 01 07 00 2A 00 03 07 00 2A 01 07 00 35 FF 00 01 00 03 03 01 07 00 2A 00 04 07 00 2A 01 07 00 35 01 FF 00 1B 00 03 03 01 07 00 2A 00 03 07 00 2A 01 07 00 35 FF 00 02 00 00 00 01 07 00 24 FF 00 00 00 03 03 01 07 00 2A 00 03 07 00 2A 01 07 00 35 45 07 00 24 40 07 00 2A 0B 41 01 1E FF 00 03 00 00 00 01 07 00 24 FF 00 00 00 03 03 01 07 00 2A 00 01 07 00 2A 45 07 00 24 40 03 00 FF 00 01 00 03 03 01 07 00 2A 00 03 07 00 2A 01 07 00 35 FF 00 01 00 03 03 01 07 00 2A 00 02 07 00 2A 01 FF 00 01 00 02 03 01 00 01 07 00 49 43 05 44 07 00 49 47 05 47 07 00 24
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     232    240    Ljava/lang/ClassCastException;
        //  232    240    232    240    Ljava/lang/ArithmeticException;
        //  248    250    3      8      Any
        //  35     42     42     43     Any
        //  35     42     42     43     Ljava/util/NoSuchElementException;
        //  35     42     3      8      Any
        //  36     42     35     36     Ljava/lang/IndexOutOfBoundsException;
        //  35     42     35     36     Ljava/util/NoSuchElementException;
        //  52     59     59     60     Any
        //  53     59     59     60     Any
        //  52     59     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  53     59     59     60     Any
        //  52     59     52     53     Any
        //  152    158    158    159    Any
        //  152    158    3      8      Any
        //  152    158    3      8      Ljava/lang/NegativeArraySizeException;
        //  152    158    3      8      Ljava/lang/UnsupportedOperationException;
        //  152    158    3      8      Ljava/util/NoSuchElementException;
        //  209    215    215    216    Any
        //  209    215    3      8      Ljava/lang/ArithmeticException;
        //  209    215    215    216    Any
        //  209    215    3      8      Ljava/lang/ClassCastException;
        //  209    215    215    216    Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 88 out of bounds for length 88
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
    
    public void c(final f3i f3i) {
        throw new UnsupportedOperationException("Please report this to the binscure obfuscator developers");
    }
    
    public void 0() {
        throw new UnsupportedOperationException("Please report this to the binscure obfuscator developers");
    }
    
    static {
        throw t;
    }
    
    public static double 1() {
        return fbS.a6(null, 1129286726);
    }
}
