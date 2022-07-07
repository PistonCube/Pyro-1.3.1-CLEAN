// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.AxisAlignedBB;

public class f8a
{
    public f8a(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    static {
        throw t;
    }
    
    public boolean c(@NotNull final AxisAlignedBB p0, @NotNull final BlockPos p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          434
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            426
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            418
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_2        
        //    27: pop            
        //    28: aload_1        
        //    29: getfield        net/minecraft/util/math/AxisAlignedBB.field_72340_a:D
        //    32: getstatic       dev/nuker/pyro/fc.0:I
        //    35: ifeq            43
        //    38: ldc             1079295726
        //    40: goto            45
        //    43: ldc             -1450215383
        //    45: ldc             1121908327
        //    47: ixor           
        //    48: lookupswitch {
        //          -346976690: 76
        //          42616969: 43
        //          default: 401
        //        }
        //    76: aload_2        
        //    77: goto            81
        //    80: athrow         
        //    81: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //    84: goto            88
        //    87: athrow         
        //    88: i2d            
        //    89: dcmpl          
        //    90: ifle            399
        //    93: aload_1        
        //    94: getstatic       dev/nuker/pyro/fc.c:I
        //    97: ifge            105
        //   100: ldc             2120199477
        //   102: goto            107
        //   105: ldc             981128829
        //   107: ldc             823683525
        //   109: ixor           
        //   110: lookupswitch {
        //          191020984: 136
        //          1330103536: 105
        //          default: 403
        //        }
        //   136: getfield        net/minecraft/util/math/AxisAlignedBB.field_72336_d:D
        //   139: getstatic       dev/nuker/pyro/fc.c:I
        //   142: ifge            150
        //   145: ldc             -705721063
        //   147: goto            152
        //   150: ldc             2007836354
        //   152: ldc             143846762
        //   154: ixor           
        //   155: lookupswitch {
        //          -578985869: 150
        //          2134887336: 180
        //          default: 405
        //        }
        //   180: aload_2        
        //   181: goto            185
        //   184: athrow         
        //   185: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //   188: goto            192
        //   191: athrow         
        //   192: iconst_1       
        //   193: iadd           
        //   194: i2d            
        //   195: dcmpg          
        //   196: ifge            204
        //   199: ldc             -615339458
        //   201: goto            206
        //   204: ldc             -615339457
        //   206: ldc             -262756708
        //   208: ixor           
        //   209: tableswitch {
        //          1443371332: 232
        //          1443371333: 399
        //          default: 199
        //        }
        //   232: aload_1        
        //   233: getstatic       dev/nuker/pyro/fc.c:I
        //   236: ifge            244
        //   239: ldc             -1366073468
        //   241: goto            246
        //   244: ldc             1256021414
        //   246: ldc             -1140525967
        //   248: ixor           
        //   249: lookupswitch {
        //          -153507369: 276
        //          311929845: 244
        //          default: 407
        //        }
        //   276: getfield        net/minecraft/util/math/AxisAlignedBB.field_72338_b:D
        //   279: aload_2        
        //   280: goto            284
        //   283: athrow         
        //   284: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //   287: goto            291
        //   290: athrow         
        //   291: i2d            
        //   292: dcmpl          
        //   293: ifle            301
        //   296: ldc             775207051
        //   298: goto            303
        //   301: ldc             775207050
        //   303: ldc             1641340765
        //   305: ixor           
        //   306: tableswitch {
        //          -1614753876: 328
        //          -1614753875: 399
        //          default: 296
        //        }
        //   328: aload_1        
        //   329: getfield        net/minecraft/util/math/AxisAlignedBB.field_72337_e:D
        //   332: aload_2        
        //   333: goto            337
        //   336: athrow         
        //   337: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //   340: goto            344
        //   343: athrow         
        //   344: iconst_1       
        //   345: iadd           
        //   346: i2d            
        //   347: dcmpg          
        //   348: ifge            399
        //   351: aload_1        
        //   352: getfield        net/minecraft/util/math/AxisAlignedBB.field_72339_c:D
        //   355: aload_2        
        //   356: goto            360
        //   359: athrow         
        //   360: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //   363: goto            367
        //   366: athrow         
        //   367: i2d            
        //   368: dcmpl          
        //   369: ifle            399
        //   372: aload_1        
        //   373: getfield        net/minecraft/util/math/AxisAlignedBB.field_72334_f:D
        //   376: aload_2        
        //   377: goto            381
        //   380: athrow         
        //   381: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //   384: goto            388
        //   387: athrow         
        //   388: iconst_1       
        //   389: iadd           
        //   390: i2d            
        //   391: dcmpg          
        //   392: ifge            399
        //   395: iconst_1       
        //   396: goto            400
        //   399: iconst_0       
        //   400: ireturn        
        //   401: aconst_null    
        //   402: athrow         
        //   403: aconst_null    
        //   404: athrow         
        //   405: aconst_null    
        //   406: athrow         
        //   407: aconst_null    
        //   408: athrow         
        //   409: pop            
        //   410: goto            24
        //   413: pop            
        //   414: aconst_null    
        //   415: goto            409
        //   418: dup            
        //   419: ifnull          409
        //   422: checkcast       Ljava/lang/Throwable;
        //   425: athrow         
        //   426: dup            
        //   427: ifnull          413
        //   430: checkcast       Ljava/lang/Throwable;
        //   433: athrow         
        //   434: aconst_null    
        //   435: athrow         
        //    StackMapTable: 00 3B 43 07 00 2C 04 FF 00 0B 00 00 00 01 07 00 2C FE 00 03 07 00 03 07 00 2E 07 00 3A 52 03 FF 00 01 00 03 07 00 03 07 00 2E 07 00 3A 00 02 03 01 5E 03 43 07 00 2C FF 00 00 00 03 07 00 03 07 00 2E 07 00 3A 00 02 03 07 00 3A 45 07 00 2C FF 00 00 00 03 07 00 03 07 00 2E 07 00 3A 00 02 03 01 50 07 00 2E FF 00 01 00 03 07 00 03 07 00 2E 07 00 3A 00 02 07 00 2E 01 5C 07 00 2E 4D 03 FF 00 01 00 03 07 00 03 07 00 2E 07 00 3A 00 02 03 01 5B 03 43 07 00 13 FF 00 00 00 03 07 00 03 07 00 2E 07 00 3A 00 02 03 07 00 3A 45 07 00 2C FF 00 00 00 03 07 00 03 07 00 2E 07 00 3A 00 02 03 01 06 04 41 01 19 4B 07 00 2E FF 00 01 00 03 07 00 03 07 00 2E 07 00 3A 00 02 07 00 2E 01 5D 07 00 2E 46 07 00 2C FF 00 00 00 03 07 00 03 07 00 2E 07 00 3A 00 02 03 07 00 3A 45 07 00 2C FF 00 00 00 03 07 00 03 07 00 2E 07 00 3A 00 02 03 01 04 04 41 01 18 47 07 00 64 FF 00 00 00 03 07 00 03 07 00 2E 07 00 3A 00 02 03 07 00 3A 45 07 00 2C FF 00 00 00 03 07 00 03 07 00 2E 07 00 3A 00 02 03 01 4E 07 00 25 FF 00 00 00 03 07 00 03 07 00 2E 07 00 3A 00 02 03 07 00 3A 45 07 00 2C FF 00 00 00 03 07 00 03 07 00 2E 07 00 3A 00 02 03 01 4C 07 00 2C FF 00 00 00 03 07 00 03 07 00 2E 07 00 3A 00 02 03 07 00 3A 45 07 00 2C FF 00 00 00 03 07 00 03 07 00 2E 07 00 3A 00 02 03 01 0A 40 01 40 03 41 07 00 2E 41 03 41 07 00 2E 41 07 00 2C 43 05 44 07 00 2C 47 05 47 07 00 2C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     418    426    Ljava/util/NoSuchElementException;
        //  418    426    418    426    Any
        //  434    436    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  80     87     87     88     Any
        //  81     87     87     88     Ljava/util/ConcurrentModificationException;
        //  81     87     3      8      Any
        //  80     87     80     81     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  80     87     80     81     Any
        //  184    191    191    192    Any
        //  185    191    191    192    Any
        //  185    191    191    192    Any
        //  185    191    184    185    Ljava/lang/IndexOutOfBoundsException;
        //  184    191    3      8      Ljava/lang/ArithmeticException;
        //  283    290    290    291    Any
        //  283    290    283    284    Any
        //  284    290    290    291    Ljava/lang/AssertionError;
        //  283    290    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  283    290    283    284    Ljava/lang/IllegalStateException;
        //  336    343    343    344    Any
        //  336    343    336    337    Ljava/lang/NegativeArraySizeException;
        //  336    343    336    337    Ljava/lang/IllegalStateException;
        //  336    343    336    337    Ljava/lang/NumberFormatException;
        //  336    343    343    344    Ljava/lang/IllegalArgumentException;
        //  359    366    366    367    Any
        //  360    366    3      8      Any
        //  359    366    366    367    Ljava/lang/NumberFormatException;
        //  359    366    366    367    Ljava/lang/NumberFormatException;
        //  360    366    359    360    Ljava/lang/StringIndexOutOfBoundsException;
        //  380    387    387    388    Any
        //  380    387    3      8      Ljava/lang/IllegalArgumentException;
        //  380    387    380    381    Any
        //  380    387    3      8      Ljava/lang/NumberFormatException;
        //  380    387    387    388    Any
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
    
    public f8a() {
        while (true) {
            int n = 0;
            Label_0014: {
                if (fc.0 != 0) {
                    n = 1110885667;
                    break Label_0014;
                }
                n = 590767928;
            }
            switch (n ^ 0x7ADE9F8E) {
                case 954751661: {
                    continue;
                }
                case 1508440246: {}
                default: {
                    throw null;
                }
            }
            break;
        }
    }
}
