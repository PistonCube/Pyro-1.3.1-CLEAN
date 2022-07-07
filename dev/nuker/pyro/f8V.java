// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.util.math.Vec2f;
import org.jetbrains.annotations.NotNull;
import net.minecraft.util.math.BlockPos;
import kotlin.jvm.functions.Function1;

public enum f8v
{
    public static f8v c;
    public static f8v 0;
    public static f8v 1;
    public static f8v 2;
    public static f8v 3;
    public static f8v 4;
    public static f8v 5;
    public static f8v 6;
    public static f8v 7;
    public static f8v 8;
    public static f8v 9;
    public static f8v a;
    public static f8v b;
    public static f8v d;
    public static f8v e;
    public static f8v f;
    public static f8v g;
    public static f8v[] c;
    @NotNull
    public Function1<BlockPos, BlockPos> c;
    public double c;
    @NotNull
    public f8d c;
    
    @NotNull
    public Vec2f 0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          464
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            456
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            448
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lnet/minecraft/util/math/Vec3d;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/fc.0:I
        //    31: ifeq            39
        //    34: ldc             557020216
        //    36: goto            41
        //    39: ldc             -52052156
        //    41: ldc             629851013
        //    43: ixor           
        //    44: lookupswitch {
        //          -220142626: 39
        //          79280061: 429
        //          default: 72
        //        }
        //    72: aload_0        
        //    73: getfield        dev/nuker/pyro/f8v.c:Lkotlin/jvm/functions/Function1;
        //    76: getstatic       net/minecraft/util/math/BlockPos.field_177992_a:Lnet/minecraft/util/math/BlockPos;
        //    79: dup            
        //    80: pop            
        //    81: getstatic       dev/nuker/pyro/fc.0:I
        //    84: ifeq            92
        //    87: ldc             -1302021224
        //    89: goto            94
        //    92: ldc             1305821342
        //    94: ldc             2041654722
        //    96: ixor           
        //    97: lookupswitch {
        //          -875194790: 92
        //          878996828: 124
        //          default: 427
        //        }
        //   124: goto            128
        //   127: athrow         
        //   128: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   133: goto            137
        //   136: athrow         
        //   137: checkcast       Lnet/minecraft/util/math/Vec3i;
        //   140: goto            144
        //   143: athrow         
        //   144: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //   147: goto            151
        //   150: athrow         
        //   151: astore_1       
        //   152: aload_1        
        //   153: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   156: dstore          4
        //   158: iconst_0       
        //   159: getstatic       dev/nuker/pyro/fc.0:I
        //   162: ifeq            170
        //   165: ldc             -104953436
        //   167: goto            172
        //   170: ldc             8168769
        //   172: ldc             1460589837
        //   174: ixor           
        //   175: lookupswitch {
        //          -1364173655: 170
        //          1467117644: 200
        //          default: 433
        //        }
        //   200: istore          6
        //   202: dload           4
        //   204: goto            208
        //   207: athrow         
        //   208: invokestatic    java/lang/Math.asin:(D)D
        //   211: goto            215
        //   214: athrow         
        //   215: dstore_2       
        //   216: aload_1        
        //   217: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   220: dstore          6
        //   222: aload_1        
        //   223: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //   226: dstore          8
        //   228: iconst_0       
        //   229: istore          10
        //   231: dload           6
        //   233: getstatic       dev/nuker/pyro/fc.1:I
        //   236: ifeq            244
        //   239: ldc             678887393
        //   241: goto            246
        //   244: ldc             1093104624
        //   246: ldc             507972615
        //   248: ixor           
        //   249: lookupswitch {
        //          -755386044: 244
        //          909243366: 431
        //          default: 276
        //        }
        //   276: dload           8
        //   278: goto            282
        //   281: athrow         
        //   282: invokestatic    java/lang/Math.atan2:(DD)D
        //   285: goto            289
        //   288: athrow         
        //   289: getstatic       dev/nuker/pyro/fc.0:I
        //   292: ifeq            300
        //   295: ldc             1136538
        //   297: goto            302
        //   300: ldc             -1862784655
        //   302: ldc             -1466518304
        //   304: ixor           
        //   305: lookupswitch {
        //          -1467489414: 437
        //          1726426594: 300
        //          default: 332
        //        }
        //   332: dstore          4
        //   334: getstatic       dev/nuker/pyro/fc.1:I
        //   337: ifeq            345
        //   340: ldc             868434322
        //   342: goto            347
        //   345: ldc             1616506077
        //   347: ldc             16294419
        //   349: ixor           
        //   350: lookupswitch {
        //          -694163625: 345
        //          859562881: 435
        //          default: 376
        //        }
        //   376: dload_2        
        //   377: ldc2_w          180.0
        //   380: dmul           
        //   381: ldc2_w          3.141592653589793
        //   384: ddiv           
        //   385: dstore_2       
        //   386: dload           4
        //   388: ldc2_w          180.0
        //   391: dmul           
        //   392: ldc2_w          3.141592653589793
        //   395: ddiv           
        //   396: dstore          4
        //   398: dload           4
        //   400: ldc2_w          90.0
        //   403: dadd           
        //   404: dstore          4
        //   406: new             Lnet/minecraft/util/math/Vec2f;
        //   409: dup            
        //   410: dload           4
        //   412: d2f            
        //   413: dload_2        
        //   414: d2f            
        //   415: goto            419
        //   418: athrow         
        //   419: invokespecial   net/minecraft/util/math/Vec2f.<init>:(FF)V
        //   422: goto            426
        //   425: athrow         
        //   426: areturn        
        //   427: aconst_null    
        //   428: athrow         
        //   429: aconst_null    
        //   430: athrow         
        //   431: aconst_null    
        //   432: athrow         
        //   433: aconst_null    
        //   434: athrow         
        //   435: aconst_null    
        //   436: athrow         
        //   437: aconst_null    
        //   438: athrow         
        //   439: pop            
        //   440: goto            24
        //   443: pop            
        //   444: aconst_null    
        //   445: goto            439
        //   448: dup            
        //   449: ifnull          439
        //   452: checkcast       Ljava/lang/Throwable;
        //   455: athrow         
        //   456: dup            
        //   457: ifnull          443
        //   460: checkcast       Ljava/lang/Throwable;
        //   463: athrow         
        //   464: aconst_null    
        //   465: athrow         
        //    StackMapTable: 00 35 43 07 00 33 04 FF 00 0B 00 00 00 01 07 00 33 FC 00 03 07 00 03 FF 00 0E 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 01 00 01 07 00 03 00 03 08 00 18 08 00 18 01 FF 00 1E 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 13 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 47 07 00 3E FF 00 01 00 01 07 00 03 00 05 08 00 18 08 00 18 07 00 47 07 00 3E 01 FF 00 1D 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 47 07 00 3E 42 07 00 2A FF 00 00 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 47 07 00 3E 47 07 00 33 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 7D 45 07 00 33 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 4D 45 07 00 33 40 07 00 35 FF 00 12 00 05 07 00 03 07 00 35 00 00 03 00 01 01 FF 00 01 00 05 07 00 03 07 00 35 00 00 03 00 02 01 01 5B 01 FF 00 06 00 06 07 00 03 07 00 35 00 00 03 01 00 01 07 00 33 40 03 45 07 00 33 40 03 FF 00 1C 00 07 07 00 03 07 00 35 03 03 03 03 01 00 01 03 FF 00 01 00 07 07 00 03 07 00 35 03 03 03 03 01 00 02 03 01 5D 03 44 07 00 33 FF 00 00 00 07 07 00 03 07 00 35 03 03 03 03 01 00 02 03 03 45 07 00 33 40 03 4A 03 FF 00 01 00 07 07 00 03 07 00 35 03 03 03 03 01 00 02 03 01 5D 03 0C 41 01 1C 69 07 00 33 FF 00 00 00 07 07 00 03 07 00 35 03 03 03 03 01 00 04 08 01 96 08 01 96 02 02 45 07 00 33 40 07 00 78 FF 00 00 00 01 07 00 03 00 04 08 00 18 08 00 18 07 00 47 07 00 3E FF 00 01 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 01 00 07 07 00 03 07 00 35 03 03 03 03 01 00 01 03 FF 00 01 00 05 07 00 03 07 00 35 00 00 03 00 01 01 FF 00 01 00 07 07 00 03 07 00 35 03 03 03 03 01 00 00 41 03 FF 00 01 00 01 07 00 03 00 01 07 00 2A 43 05 44 07 00 2A 47 05 47 07 00 33
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     448    456    Ljava/lang/NullPointerException;
        //  448    456    448    456    Ljava/util/ConcurrentModificationException;
        //  464    466    3      8      Any
        //  127    136    136    137    Any
        //  128    136    3      8      Ljava/lang/NullPointerException;
        //  128    136    127    128    Ljava/lang/IllegalArgumentException;
        //  127    136    3      8      Any
        //  127    136    127    128    Ljava/lang/ArithmeticException;
        //  143    150    150    151    Any
        //  143    150    143    144    Any
        //  144    150    143    144    Ljava/lang/IndexOutOfBoundsException;
        //  143    150    143    144    Ljava/lang/ArithmeticException;
        //  143    150    150    151    Ljava/lang/IllegalArgumentException;
        //  207    214    214    215    Any
        //  207    214    3      8      Any
        //  208    214    207    208    Any
        //  207    214    207    208    Any
        //  207    214    214    215    Ljava/lang/IndexOutOfBoundsException;
        //  281    288    288    289    Any
        //  281    288    3      8      Ljava/lang/RuntimeException;
        //  281    288    288    289    Any
        //  281    288    281    282    Any
        //  281    288    3      8      Any
        //  418    425    425    426    Any
        //  419    425    418    419    Ljava/lang/NumberFormatException;
        //  419    425    425    426    Any
        //  419    425    425    426    Any
        //  418    425    418    419    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 160 out of bounds for length 160
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
    
    @NotNull
    public Function1 1() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            83
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            75
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getstatic       dev/nuker/pyro/fc.c:I
        //    20: ifge            28
        //    23: ldc             -1535821252
        //    25: goto            30
        //    28: ldc             504599525
        //    30: ldc             663982983
        //    32: ixor           
        //    33: lookupswitch {
        //          -2082035269: 64
        //          -1551340308: 28
        //          default: 60
        //        }
        //    60: getfield        dev/nuker/pyro/f8v.c:Lkotlin/jvm/functions/Function1;
        //    63: areturn        
        //    64: aconst_null    
        //    65: athrow         
        //    66: pop            
        //    67: goto            16
        //    70: pop            
        //    71: aconst_null    
        //    72: goto            66
        //    75: dup            
        //    76: ifnull          66
        //    79: checkcast       Ljava/lang/Throwable;
        //    82: athrow         
        //    83: dup            
        //    84: ifnull          70
        //    87: checkcast       Ljava/lang/Throwable;
        //    90: athrow         
        //    StackMapTable: 00 0A FF 00 0C 00 00 00 01 07 00 33 FC 00 03 07 00 03 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 43 07 00 03 41 07 00 33 43 05 44 07 00 33 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      12     75     83     Any
        //  75     83     75     83     Ljava/lang/RuntimeException;
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
    
    public static f8v c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          67
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            59
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            51
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             Ldev/nuker/pyro/f8v;.class
        //    26: aload_0        
        //    27: goto            31
        //    30: athrow         
        //    31: invokestatic    java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        //    34: goto            38
        //    37: athrow         
        //    38: checkcast       Ldev/nuker/pyro/f8v;
        //    41: areturn        
        //    42: pop            
        //    43: goto            24
        //    46: pop            
        //    47: aconst_null    
        //    48: goto            42
        //    51: dup            
        //    52: ifnull          42
        //    55: checkcast       Ljava/lang/Throwable;
        //    58: athrow         
        //    59: dup            
        //    60: ifnull          46
        //    63: checkcast       Ljava/lang/Throwable;
        //    66: athrow         
        //    67: aconst_null    
        //    68: athrow         
        //    StackMapTable: 00 0D 43 07 00 33 04 FF 00 0B 00 00 00 01 07 00 33 FC 00 03 07 00 99 FF 00 05 00 00 00 01 07 00 33 FF 00 00 00 01 07 00 99 00 02 07 00 9B 07 00 99 45 07 00 33 40 07 00 05 43 07 00 33 43 05 44 07 00 33 47 05 47 07 00 33
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     51     59     Any
        //  51     59     51     59     Ljava/lang/ArithmeticException;
        //  67     69     3      8      Ljava/util/ConcurrentModificationException;
        //  31     37     37     38     Any
        //  31     37     3      8      Any
        //  31     37     37     38     Any
        //  31     37     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  31     37     37     38     Ljava/lang/ClassCastException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 26 out of bounds for length 26
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
    
    public f8v(final String name, final int ordinal, final Function1 c, final double c2, final f8d c3) {
        while (true) {
            Label_0015: {
                if (fc.1 != 0) {
                    n = 249139105;
                    break Label_0015;
                }
                n = -1202850729;
            }
            switch (n ^ 0x58478E7B) {
                case -443708626: {
                    continue;
                }
                default: {
                    super(name, ordinal);
                    while (true) {
                        int n2 = 0;
                        Label_0061: {
                            if (fc.c < 0) {
                                n2 = -1445201390;
                                break Label_0061;
                            }
                            n2 = -217444797;
                        }
                        switch (n2 ^ 0x9B15B42B) {
                            case 1892444695: {
                                continue;
                            }
                            default: {
                                this.c = (Function1<BlockPos, BlockPos>)c;
                                while (true) {
                                    int n3 = 0;
                                    Label_0110: {
                                        if (fc.0 != 0) {
                                            n3 = -2117828224;
                                            break Label_0110;
                                        }
                                        n3 = -1844978919;
                                    }
                                    switch (n3 ^ 0x7D30C3F5) {
                                        case -1511914085: {
                                            continue;
                                        }
                                        default: {
                                            while (true) {
                                                int n4 = 0;
                                                Label_0156: {
                                                    if (fc.1 != 0) {
                                                        n4 = -1633457405;
                                                        break Label_0156;
                                                    }
                                                    n4 = 351043384;
                                                }
                                                switch (n4 ^ 0x95D9A769) {
                                                    case -1908828447: {
                                                        continue;
                                                    }
                                                    default: {
                                                        this.c = c2;
                                                        while (true) {
                                                            int n5 = 0;
                                                            Label_0201: {
                                                                if (fc.0 != 0) {
                                                                    n5 = 1461416500;
                                                                    break Label_0201;
                                                                }
                                                                n5 = -156225802;
                                                            }
                                                            switch (n5 ^ 0x5EB155A1) {
                                                                case 1106095809: {
                                                                    continue;
                                                                }
                                                                default: {
                                                                    this.c = c3;
                                                                    return;
                                                                }
                                                                case 162146197: {
                                                                    throw null;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 192597098: {
                                                        throw null;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        case -51101067: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case 852381241: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 1453195738: {
                    throw null;
                }
            }
            break;
        }
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: anewarray       Ldev/nuker/pyro/f8v;
        //     5: dup            
        //     6: dup            
        //     7: iconst_0       
        //     8: new             Ldev/nuker/pyro/f8v;
        //    11: dup            
        //    12: ldc             "\u2248\u14bc\u8b4a\ubf2c\ufd23\uec44\ub20b\ue762\ud587\udd47"
        //    14: getstatic       dev/nuker/pyro/fc.c:I
        //    17: ifge            25
        //    20: ldc             2034744951
        //    22: goto            27
        //    25: ldc             -1234208049
        //    27: ldc             794952784
        //    29: ixor           
        //    30: lookupswitch {
        //          -1727168865: 56
        //          1445313063: 25
        //          default: 1954
        //        }
        //    56: invokestatic    invokestatic   !!! ERROR
        //    59: iconst_0       
        //    60: getstatic       dev/nuker/pyro/f8e.c:Ldev/nuker/pyro/f8e;
        //    63: checkcast       Lkotlin/jvm/functions/Function1;
        //    66: ldc2_w          3.6
        //    69: getstatic       dev/nuker/pyro/f8d.c:Ldev/nuker/pyro/f8d;
        //    72: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //    75: dup            
        //    76: putstatic       dev/nuker/pyro/f8v.c:Ldev/nuker/pyro/f8v;
        //    79: aastore        
        //    80: dup            
        //    81: iconst_1       
        //    82: new             Ldev/nuker/pyro/f8v;
        //    85: dup            
        //    86: ldc             "\u2248\u14bc\u8b4a\ubf2c\ufd23\uec59\ub20b\ue765\ud587\udd47"
        //    88: getstatic       dev/nuker/pyro/fc.1:I
        //    91: ifeq            99
        //    94: ldc             1268395039
        //    96: goto            101
        //    99: ldc             1642025701
        //   101: ldc             1254551219
        //   103: ixor           
        //   104: lookupswitch {
        //          22856364: 1986
        //          527208982: 99
        //          default: 132
        //        }
        //   132: invokestatic    invokestatic   !!! ERROR
        //   135: iconst_1       
        //   136: getstatic       dev/nuker/pyro/f8n.c:Ldev/nuker/pyro/f8n;
        //   139: checkcast       Lkotlin/jvm/functions/Function1;
        //   142: ldc2_w          3.6
        //   145: getstatic       dev/nuker/pyro/f8d.c:Ldev/nuker/pyro/f8d;
        //   148: getstatic       dev/nuker/pyro/fc.1:I
        //   151: ifeq            159
        //   154: ldc             -308149119
        //   156: goto            161
        //   159: ldc             105132592
        //   161: ldc             -56416287
        //   163: ixor           
        //   164: lookupswitch {
        //          -85518895: 192
        //          285287264: 159
        //          default: 1938
        //        }
        //   192: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //   195: dup            
        //   196: putstatic       dev/nuker/pyro/f8v.0:Ldev/nuker/pyro/f8v;
        //   199: aastore        
        //   200: dup            
        //   201: iconst_2       
        //   202: new             Ldev/nuker/pyro/f8v;
        //   205: dup            
        //   206: ldc             "\u2248\u14bc\u8b4a\ubf2c\ufd23\uec5d\ub201\ue763\ud587"
        //   208: invokestatic    invokestatic   !!! ERROR
        //   211: iconst_2       
        //   212: getstatic       dev/nuker/pyro/f8o.c:Ldev/nuker/pyro/f8o;
        //   215: checkcast       Lkotlin/jvm/functions/Function1;
        //   218: ldc2_w          3.6
        //   221: getstatic       dev/nuker/pyro/f8d.c:Ldev/nuker/pyro/f8d;
        //   224: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //   227: dup            
        //   228: putstatic       dev/nuker/pyro/f8v.1:Ldev/nuker/pyro/f8v;
        //   231: aastore        
        //   232: dup            
        //   233: iconst_3       
        //   234: new             Ldev/nuker/pyro/f8v;
        //   237: dup            
        //   238: ldc             "\u2248\u14bc\u8b4a\ubf2c\ufd23\uec4f\ub205\ue763\ud587"
        //   240: getstatic       dev/nuker/pyro/fc.0:I
        //   243: ifeq            251
        //   246: ldc             713773721
        //   248: goto            253
        //   251: ldc             1771527258
        //   253: ldc             1424823556
        //   255: ixor           
        //   256: lookupswitch {
        //          -371454828: 251
        //          2120632221: 1952
        //          default: 284
        //        }
        //   284: invokestatic    invokestatic   !!! ERROR
        //   287: iconst_3       
        //   288: getstatic       dev/nuker/pyro/f8p.c:Ldev/nuker/pyro/f8p;
        //   291: checkcast       Lkotlin/jvm/functions/Function1;
        //   294: ldc2_w          3.6
        //   297: getstatic       dev/nuker/pyro/fc.c:I
        //   300: ifge            308
        //   303: ldc             -1683619749
        //   305: goto            310
        //   308: ldc             -426991738
        //   310: ldc             -1849180618
        //   312: ixor           
        //   313: lookupswitch {
        //          174177901: 1980
        //          1720777556: 308
        //          default: 340
        //        }
        //   340: getstatic       dev/nuker/pyro/f8d.c:Ldev/nuker/pyro/f8d;
        //   343: getstatic       dev/nuker/pyro/fc.0:I
        //   346: ifeq            354
        //   349: ldc             -1406140119
        //   351: goto            356
        //   354: ldc             -330146828
        //   356: ldc             764351859
        //   358: ixor           
        //   359: lookupswitch {
        //          -2118183846: 354
        //          -1042461049: 384
        //          default: 1966
        //        }
        //   384: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //   387: dup            
        //   388: putstatic       dev/nuker/pyro/f8v.2:Ldev/nuker/pyro/f8v;
        //   391: aastore        
        //   392: dup            
        //   393: iconst_4       
        //   394: new             Ldev/nuker/pyro/f8v;
        //   397: dup            
        //   398: ldc             "\u2248\u14bc\u8b4a\ubf2c\ufd23\uec44\ub20b\ue762\ud587\udd47\ua69d\u1e69\ue047\uc948"
        //   400: invokestatic    invokestatic   !!! ERROR
        //   403: iconst_4       
        //   404: getstatic       dev/nuker/pyro/f8q.c:Ldev/nuker/pyro/f8q;
        //   407: checkcast       Lkotlin/jvm/functions/Function1;
        //   410: ldc2_w          4.4
        //   413: getstatic       dev/nuker/pyro/f8d.c:Ldev/nuker/pyro/f8d;
        //   416: getstatic       dev/nuker/pyro/fc.0:I
        //   419: ifeq            428
        //   422: ldc_w           -1292542471
        //   425: goto            431
        //   428: ldc_w           209259740
        //   431: ldc_w           -56858540
        //   434: ixor           
        //   435: lookupswitch {
        //          -253401976: 460
        //          1315517869: 428
        //          default: 1962
        //        }
        //   460: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //   463: dup            
        //   464: putstatic       dev/nuker/pyro/f8v.3:Ldev/nuker/pyro/f8v;
        //   467: aastore        
        //   468: dup            
        //   469: iconst_5       
        //   470: new             Ldev/nuker/pyro/f8v;
        //   473: dup            
        //   474: ldc_w           "\u2248\u14bc\u8b4a\ubf2c\ufd23\uec59\ub20b\ue765\ud587\udd47\ua69d\u1e69\ue047\uc948"
        //   477: getstatic       dev/nuker/pyro/fc.0:I
        //   480: ifeq            489
        //   483: ldc_w           -780095504
        //   486: goto            492
        //   489: ldc_w           -596601286
        //   492: ldc_w           1619782135
        //   495: ixor           
        //   496: lookupswitch {
        //          -1324661241: 1942
        //          1191560158: 489
        //          default: 524
        //        }
        //   524: invokestatic    invokestatic   !!! ERROR
        //   527: iconst_5       
        //   528: getstatic       dev/nuker/pyro/f8r.c:Ldev/nuker/pyro/f8r;
        //   531: checkcast       Lkotlin/jvm/functions/Function1;
        //   534: ldc2_w          4.4
        //   537: getstatic       dev/nuker/pyro/fc.1:I
        //   540: ifeq            549
        //   543: ldc_w           780830328
        //   546: goto            552
        //   549: ldc_w           592538019
        //   552: ldc_w           1245326247
        //   555: ixor           
        //   556: lookupswitch {
        //          1689300447: 549
        //          1768636932: 584
        //          default: 1976
        //        }
        //   584: getstatic       dev/nuker/pyro/f8d.c:Ldev/nuker/pyro/f8d;
        //   587: getstatic       dev/nuker/pyro/fc.c:I
        //   590: ifge            599
        //   593: ldc_w           1602267972
        //   596: goto            602
        //   599: ldc_w           -275241744
        //   602: ldc_w           1164945518
        //   605: ixor           
        //   606: lookupswitch {
        //          253951267: 599
        //          451871530: 1956
        //          default: 632
        //        }
        //   632: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //   635: dup            
        //   636: putstatic       dev/nuker/pyro/f8v.4:Ldev/nuker/pyro/f8v;
        //   639: aastore        
        //   640: dup            
        //   641: bipush          6
        //   643: new             Ldev/nuker/pyro/f8v;
        //   646: dup            
        //   647: ldc_w           "\u2248\u14bc\u8b4a\ubf2c\ufd23\uec44\ub20b\ue762\ud587\udd47\ua68f\u1e6d\ue047\uc948"
        //   650: getstatic       dev/nuker/pyro/fc.c:I
        //   653: ifge            662
        //   656: ldc_w           1668540346
        //   659: goto            665
        //   662: ldc_w           -929107378
        //   665: ldc_w           -427291252
        //   668: ixor           
        //   669: lookupswitch {
        //          -2047088074: 662
        //          773259202: 696
        //          default: 1984
        //        }
        //   696: invokestatic    invokestatic   !!! ERROR
        //   699: bipush          6
        //   701: getstatic       dev/nuker/pyro/f8s.c:Ldev/nuker/pyro/f8s;
        //   704: checkcast       Lkotlin/jvm/functions/Function1;
        //   707: ldc2_w          4.4
        //   710: getstatic       dev/nuker/pyro/f8d.c:Ldev/nuker/pyro/f8d;
        //   713: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //   716: dup            
        //   717: getstatic       dev/nuker/pyro/fc.0:I
        //   720: ifeq            729
        //   723: ldc_w           -1990343674
        //   726: goto            732
        //   729: ldc_w           1088109331
        //   732: ldc_w           325328085
        //   735: ixor           
        //   736: lookupswitch {
        //          -1707484973: 729
        //          1405036486: 764
        //          default: 1958
        //        }
        //   764: putstatic       dev/nuker/pyro/f8v.5:Ldev/nuker/pyro/f8v;
        //   767: aastore        
        //   768: dup            
        //   769: bipush          7
        //   771: new             Ldev/nuker/pyro/f8v;
        //   774: dup            
        //   775: ldc_w           "\u2248\u14bc\u8b4a\ubf2c\ufd23\uec59\ub20b\ue765\ud587\udd47\ua68f\u1e6d\ue047\uc948"
        //   778: invokestatic    invokestatic   !!! ERROR
        //   781: bipush          7
        //   783: getstatic       dev/nuker/pyro/f8t.c:Ldev/nuker/pyro/f8t;
        //   786: checkcast       Lkotlin/jvm/functions/Function1;
        //   789: ldc2_w          4.4
        //   792: getstatic       dev/nuker/pyro/f8d.c:Ldev/nuker/pyro/f8d;
        //   795: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //   798: dup            
        //   799: getstatic       dev/nuker/pyro/fc.0:I
        //   802: ifeq            811
        //   805: ldc_w           1957628202
        //   808: goto            814
        //   811: ldc_w           -2057090198
        //   814: ldc_w           -1167666878
        //   817: ixor           
        //   818: lookupswitch {
        //          -1197746680: 811
        //          -825632664: 1934
        //          default: 844
        //        }
        //   844: putstatic       dev/nuker/pyro/f8v.6:Ldev/nuker/pyro/f8v;
        //   847: aastore        
        //   848: dup            
        //   849: bipush          8
        //   851: new             Ldev/nuker/pyro/f8v;
        //   854: dup            
        //   855: ldc_w           "\u2248\u14bc\u8b4a\ubf2c"
        //   858: invokestatic    invokestatic   !!! ERROR
        //   861: bipush          8
        //   863: getstatic       dev/nuker/pyro/f8u.c:Ldev/nuker/pyro/f8u;
        //   866: checkcast       Lkotlin/jvm/functions/Function1;
        //   869: ldc2_w          1.3
        //   872: getstatic       dev/nuker/pyro/fc.1:I
        //   875: ifeq            884
        //   878: ldc_w           -1733682377
        //   881: goto            887
        //   884: ldc_w           -1042891002
        //   887: ldc_w           1091465423
        //   890: ixor           
        //   891: lookupswitch {
        //          -2133274679: 916
        //          -643535880: 884
        //          default: 1968
        //        }
        //   916: getstatic       dev/nuker/pyro/f8d.0:Ldev/nuker/pyro/f8d;
        //   919: getstatic       dev/nuker/pyro/fc.c:I
        //   922: ifge            931
        //   925: ldc_w           81495199
        //   928: goto            934
        //   931: ldc_w           -104259531
        //   934: ldc_w           1873116576
        //   937: ixor           
        //   938: lookupswitch {
        //          -1771283051: 964
        //          1803483455: 931
        //          default: 1944
        //        }
        //   964: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //   967: dup            
        //   968: putstatic       dev/nuker/pyro/f8v.7:Ldev/nuker/pyro/f8v;
        //   971: aastore        
        //   972: dup            
        //   973: bipush          9
        //   975: new             Ldev/nuker/pyro/f8v;
        //   978: dup            
        //   979: ldc_w           "\u2242\u14bc\u8b4f\ubf36\ufd34"
        //   982: getstatic       dev/nuker/pyro/fc.c:I
        //   985: ifge            994
        //   988: ldc_w           1013822251
        //   991: goto            997
        //   994: ldc_w           -195968803
        //   997: ldc_w           -1402448489
        //  1000: ixor           
        //  1001: lookupswitch {
        //          -1878661444: 994
        //          1480168778: 1028
        //          default: 1964
        //        }
        //  1028: invokestatic    invokestatic   !!! ERROR
        //  1031: bipush          9
        //  1033: getstatic       dev/nuker/pyro/f8f.c:Ldev/nuker/pyro/f8f;
        //  1036: checkcast       Lkotlin/jvm/functions/Function1;
        //  1039: dconst_1       
        //  1040: getstatic       dev/nuker/pyro/f8d.1:Ldev/nuker/pyro/f8d;
        //  1043: getstatic       dev/nuker/pyro/fc.1:I
        //  1046: ifeq            1055
        //  1049: ldc_w           -578375793
        //  1052: goto            1058
        //  1055: ldc_w           -885309562
        //  1058: ldc_w           1396410438
        //  1061: ixor           
        //  1062: lookupswitch {
        //          -1900206135: 1982
        //          906733980: 1055
        //          default: 1088
        //        }
        //  1088: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //  1091: dup            
        //  1092: putstatic       dev/nuker/pyro/f8v.8:Ldev/nuker/pyro/f8v;
        //  1095: aastore        
        //  1096: dup            
        //  1097: bipush          10
        //  1099: new             Ldev/nuker/pyro/f8v;
        //  1102: dup            
        //  1103: ldc_w           "\u225f\u14bc\u8b48\ubf36\ufd34"
        //  1106: invokestatic    invokestatic   !!! ERROR
        //  1109: bipush          10
        //  1111: getstatic       dev/nuker/pyro/f8g.c:Ldev/nuker/pyro/f8g;
        //  1114: checkcast       Lkotlin/jvm/functions/Function1;
        //  1117: dconst_1       
        //  1118: getstatic       dev/nuker/pyro/fc.1:I
        //  1121: ifeq            1130
        //  1124: ldc_w           -1769969694
        //  1127: goto            1133
        //  1130: ldc_w           -352981446
        //  1133: ldc_w           -2049692843
        //  1136: ixor           
        //  1137: lookupswitch {
        //          -920951852: 1130
        //          324291767: 1940
        //          default: 1164
        //        }
        //  1164: getstatic       dev/nuker/pyro/f8d.1:Ldev/nuker/pyro/f8d;
        //  1167: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //  1170: dup            
        //  1171: putstatic       dev/nuker/pyro/f8v.9:Ldev/nuker/pyro/f8v;
        //  1174: aastore        
        //  1175: dup            
        //  1176: bipush          11
        //  1178: new             Ldev/nuker/pyro/f8v;
        //  1181: dup            
        //  1182: ldc_w           "\u225b\u14b6\u8b4e\ubf36"
        //  1185: getstatic       dev/nuker/pyro/fc.0:I
        //  1188: ifeq            1197
        //  1191: ldc_w           1300772964
        //  1194: goto            1200
        //  1197: ldc_w           -1162742931
        //  1200: ldc_w           -645634192
        //  1203: ixor           
        //  1204: lookupswitch {
        //          -2134387385: 1197
        //          -1811128556: 1978
        //          default: 1232
        //        }
        //  1232: invokestatic    invokestatic   !!! ERROR
        //  1235: bipush          11
        //  1237: getstatic       dev/nuker/pyro/f8h.c:Ldev/nuker/pyro/f8h;
        //  1240: checkcast       Lkotlin/jvm/functions/Function1;
        //  1243: dconst_1       
        //  1244: getstatic       dev/nuker/pyro/f8d.1:Ldev/nuker/pyro/f8d;
        //  1247: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //  1250: dup            
        //  1251: putstatic       dev/nuker/pyro/f8v.a:Ldev/nuker/pyro/f8v;
        //  1254: aastore        
        //  1255: dup            
        //  1256: bipush          12
        //  1258: new             Ldev/nuker/pyro/f8v;
        //  1261: dup            
        //  1262: ldc_w           "\u2249\u14b2\u8b4e\ubf36"
        //  1265: invokestatic    invokestatic   !!! ERROR
        //  1268: bipush          12
        //  1270: getstatic       dev/nuker/pyro/f8i.c:Ldev/nuker/pyro/f8i;
        //  1273: checkcast       Lkotlin/jvm/functions/Function1;
        //  1276: dconst_1       
        //  1277: getstatic       dev/nuker/pyro/f8d.1:Ldev/nuker/pyro/f8d;
        //  1280: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //  1283: dup            
        //  1284: putstatic       dev/nuker/pyro/f8v.b:Ldev/nuker/pyro/f8v;
        //  1287: aastore        
        //  1288: dup            
        //  1289: bipush          13
        //  1291: new             Ldev/nuker/pyro/f8v;
        //  1294: dup            
        //  1295: ldc_w           "\u2242\u14bc\u8b4f\ubf36\ufd34\uec5d\ub201\ue763\ud587"
        //  1298: invokestatic    invokestatic   !!! ERROR
        //  1301: bipush          13
        //  1303: getstatic       dev/nuker/pyro/fc.c:I
        //  1306: ifge            1315
        //  1309: ldc_w           1810637193
        //  1312: goto            1318
        //  1315: ldc_w           134884338
        //  1318: ldc_w           -1731224908
        //  1321: ixor           
        //  1322: lookupswitch {
        //          -369309472: 1315
        //          -215762115: 1932
        //          default: 1348
        //        }
        //  1348: getstatic       dev/nuker/pyro/f8j.c:Ldev/nuker/pyro/f8j;
        //  1351: checkcast       Lkotlin/jvm/functions/Function1;
        //  1354: ldc2_w          1.41421356
        //  1357: getstatic       dev/nuker/pyro/f8d.1:Ldev/nuker/pyro/f8d;
        //  1360: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //  1363: dup            
        //  1364: putstatic       dev/nuker/pyro/f8v.d:Ldev/nuker/pyro/f8v;
        //  1367: aastore        
        //  1368: dup            
        //  1369: bipush          14
        //  1371: new             Ldev/nuker/pyro/f8v;
        //  1374: dup            
        //  1375: ldc_w           "\u225f\u14bc\u8b48\ubf36\ufd34\uec5d\ub201\ue763\ud587"
        //  1378: invokestatic    invokestatic   !!! ERROR
        //  1381: bipush          14
        //  1383: getstatic       dev/nuker/pyro/fc.0:I
        //  1386: ifeq            1395
        //  1389: ldc_w           -1434651961
        //  1392: goto            1398
        //  1395: ldc_w           1750257576
        //  1398: ldc_w           -701846355
        //  1401: ixor           
        //  1402: lookupswitch {
        //          -1099406587: 1428
        //          2086035050: 1395
        //          default: 1930
        //        }
        //  1428: getstatic       dev/nuker/pyro/f8k.c:Ldev/nuker/pyro/f8k;
        //  1431: checkcast       Lkotlin/jvm/functions/Function1;
        //  1434: ldc2_w          1.41421356
        //  1437: getstatic       dev/nuker/pyro/f8d.1:Ldev/nuker/pyro/f8d;
        //  1440: getstatic       dev/nuker/pyro/fc.0:I
        //  1443: ifeq            1452
        //  1446: ldc_w           -1171335236
        //  1449: goto            1455
        //  1452: ldc_w           1366451209
        //  1455: ldc_w           1082718975
        //  1458: ixor           
        //  1459: lookupswitch {
        //          -89772733: 1452
        //          301637366: 1484
        //          default: 1948
        //        }
        //  1484: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //  1487: dup            
        //  1488: getstatic       dev/nuker/pyro/fc.1:I
        //  1491: ifeq            1500
        //  1494: ldc_w           304276405
        //  1497: goto            1503
        //  1500: ldc_w           1174455072
        //  1503: ldc_w           1485000780
        //  1506: ixor           
        //  1507: lookupswitch {
        //          511939436: 1532
        //          1252111353: 1500
        //          default: 1960
        //        }
        //  1532: putstatic       dev/nuker/pyro/f8v.e:Ldev/nuker/pyro/f8v;
        //  1535: aastore        
        //  1536: dup            
        //  1537: bipush          15
        //  1539: new             Ldev/nuker/pyro/f8v;
        //  1542: dup            
        //  1543: ldc_w           "\u2242\u14bc\u8b4f\ubf36\ufd34\uec4f\ub205\ue763\ud587"
        //  1546: getstatic       dev/nuker/pyro/fc.0:I
        //  1549: ifeq            1558
        //  1552: ldc_w           1020015089
        //  1555: goto            1561
        //  1558: ldc_w           1084259247
        //  1561: ldc_w           2046471916
        //  1564: ixor           
        //  1565: lookupswitch {
        //          962254147: 1592
        //          1161207581: 1558
        //          default: 1950
        //        }
        //  1592: invokestatic    invokestatic   !!! ERROR
        //  1595: bipush          15
        //  1597: getstatic       dev/nuker/pyro/f8l.c:Ldev/nuker/pyro/f8l;
        //  1600: checkcast       Lkotlin/jvm/functions/Function1;
        //  1603: ldc2_w          1.41421356
        //  1606: getstatic       dev/nuker/pyro/f8d.1:Ldev/nuker/pyro/f8d;
        //  1609: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //  1612: dup            
        //  1613: putstatic       dev/nuker/pyro/f8v.f:Ldev/nuker/pyro/f8v;
        //  1616: aastore        
        //  1617: dup            
        //  1618: bipush          16
        //  1620: new             Ldev/nuker/pyro/f8v;
        //  1623: dup            
        //  1624: ldc_w           "\u225f\u14bc\u8b48\ubf36\ufd34\uec4f\ub205\ue763\ud587"
        //  1627: getstatic       dev/nuker/pyro/fc.0:I
        //  1630: ifeq            1639
        //  1633: ldc_w           -1777629952
        //  1636: goto            1642
        //  1639: ldc_w           1567973502
        //  1642: ldc_w           -1777689501
        //  1645: ixor           
        //  1646: lookupswitch {
        //          -880804835: 1672
        //            72035: 1639
        //          default: 1936
        //        }
        //  1672: invokestatic    invokestatic   !!! ERROR
        //  1675: bipush          16
        //  1677: getstatic       dev/nuker/pyro/fc.0:I
        //  1680: ifeq            1689
        //  1683: ldc_w           -1350215052
        //  1686: goto            1692
        //  1689: ldc_w           930106246
        //  1692: ldc_w           566446063
        //  1695: ixor           
        //  1696: lookupswitch {
        //          -1908007525: 1689
        //          380832873: 1724
        //          default: 1974
        //        }
        //  1724: getstatic       dev/nuker/pyro/f8m.c:Ldev/nuker/pyro/f8m;
        //  1727: checkcast       Lkotlin/jvm/functions/Function1;
        //  1730: ldc2_w          1.41421356
        //  1733: getstatic       dev/nuker/pyro/fc.c:I
        //  1736: ifge            1745
        //  1739: ldc_w           -746957174
        //  1742: goto            1748
        //  1745: ldc_w           1266436920
        //  1748: ldc_w           227739429
        //  1751: ixor           
        //  1752: lookupswitch {
        //          -555134545: 1928
        //          1935254839: 1745
        //          default: 1780
        //        }
        //  1780: getstatic       dev/nuker/pyro/f8d.1:Ldev/nuker/pyro/f8d;
        //  1783: getstatic       dev/nuker/pyro/fc.0:I
        //  1786: ifeq            1795
        //  1789: ldc_w           1768707005
        //  1792: goto            1798
        //  1795: ldc_w           592888549
        //  1798: ldc_w           891277927
        //  1801: ixor           
        //  1802: lookupswitch {
        //          373887106: 1828
        //          1551073754: 1795
        //          default: 1970
        //        }
        //  1828: invokespecial   dev/nuker/pyro/f8v.<init>:(Ljava/lang/String;ILkotlin/jvm/functions/Function1;DLdev/nuker/pyro/f8d;)V
        //  1831: dup            
        //  1832: getstatic       dev/nuker/pyro/fc.0:I
        //  1835: ifeq            1844
        //  1838: ldc_w           -2056250221
        //  1841: goto            1847
        //  1844: ldc_w           -1625856409
        //  1847: ldc_w           -804181585
        //  1850: ixor           
        //  1851: lookupswitch {
        //          1325813704: 1876
        //          1432433980: 1844
        //          default: 1946
        //        }
        //  1876: putstatic       dev/nuker/pyro/f8v.g:Ldev/nuker/pyro/f8v;
        //  1879: aastore        
        //  1880: getstatic       dev/nuker/pyro/fc.0:I
        //  1883: ifeq            1892
        //  1886: ldc_w           -978774778
        //  1889: goto            1895
        //  1892: ldc_w           732780561
        //  1895: ldc_w           1617330188
        //  1898: ixor           
        //  1899: lookupswitch {
        //          -1513122550: 1972
        //          -914799991: 1892
        //          default: 1924
        //        }
        //  1924: putstatic       dev/nuker/pyro/f8v.c:[Ldev/nuker/pyro/f8v;
        //  1927: return         
        //  1928: aconst_null    
        //  1929: athrow         
        //  1930: aconst_null    
        //  1931: athrow         
        //  1932: aconst_null    
        //  1933: athrow         
        //  1934: aconst_null    
        //  1935: athrow         
        //  1936: aconst_null    
        //  1937: athrow         
        //  1938: aconst_null    
        //  1939: athrow         
        //  1940: aconst_null    
        //  1941: athrow         
        //  1942: aconst_null    
        //  1943: athrow         
        //  1944: aconst_null    
        //  1945: athrow         
        //  1946: aconst_null    
        //  1947: athrow         
        //  1948: aconst_null    
        //  1949: athrow         
        //  1950: aconst_null    
        //  1951: athrow         
        //  1952: aconst_null    
        //  1953: athrow         
        //  1954: aconst_null    
        //  1955: athrow         
        //  1956: aconst_null    
        //  1957: athrow         
        //  1958: aconst_null    
        //  1959: athrow         
        //  1960: aconst_null    
        //  1961: athrow         
        //  1962: aconst_null    
        //  1963: athrow         
        //  1964: aconst_null    
        //  1965: athrow         
        //  1966: aconst_null    
        //  1967: athrow         
        //  1968: aconst_null    
        //  1969: athrow         
        //  1970: aconst_null    
        //  1971: athrow         
        //  1972: aconst_null    
        //  1973: athrow         
        //  1974: aconst_null    
        //  1975: athrow         
        //  1976: aconst_null    
        //  1977: athrow         
        //  1978: aconst_null    
        //  1979: athrow         
        //  1980: aconst_null    
        //  1981: athrow         
        //  1982: aconst_null    
        //  1983: athrow         
        //  1984: aconst_null    
        //  1985: athrow         
        //  1986: aconst_null    
        //  1987: athrow         
        //    StackMapTable: 00 78 FF 00 19 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 00 08 08 00 08 07 00 99 FF 00 01 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 00 08 08 00 08 07 00 99 01 FF 00 1C 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 00 08 08 00 08 07 00 99 FF 00 2A 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 00 52 08 00 52 07 00 99 FF 00 01 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 00 52 08 00 52 07 00 99 01 FF 00 1E 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 00 52 08 00 52 07 00 99 FF 00 1A 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 00 52 08 00 52 07 00 99 01 07 00 47 03 07 00 B4 FF 00 01 00 00 00 0C 07 00 84 07 00 84 07 00 84 01 08 00 52 08 00 52 07 00 99 01 07 00 47 03 07 00 B4 01 FF 00 1E 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 00 52 08 00 52 07 00 99 01 07 00 47 03 07 00 B4 FF 00 3A 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 00 EA 08 00 EA 07 00 99 FF 00 01 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 00 EA 08 00 EA 07 00 99 01 FF 00 1E 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 00 EA 08 00 EA 07 00 99 FF 00 17 00 00 00 0A 07 00 84 07 00 84 07 00 84 01 08 00 EA 08 00 EA 07 00 99 01 07 00 47 03 FF 00 01 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 00 EA 08 00 EA 07 00 99 01 07 00 47 03 01 FF 00 1D 00 00 00 0A 07 00 84 07 00 84 07 00 84 01 08 00 EA 08 00 EA 07 00 99 01 07 00 47 03 FF 00 0D 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 00 EA 08 00 EA 07 00 99 01 07 00 47 03 07 00 B4 FF 00 01 00 00 00 0C 07 00 84 07 00 84 07 00 84 01 08 00 EA 08 00 EA 07 00 99 01 07 00 47 03 07 00 B4 01 FF 00 1B 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 00 EA 08 00 EA 07 00 99 01 07 00 47 03 07 00 B4 FF 00 2B 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 01 8A 08 01 8A 07 00 99 01 07 00 47 03 07 00 B4 FF 00 02 00 00 00 0C 07 00 84 07 00 84 07 00 84 01 08 01 8A 08 01 8A 07 00 99 01 07 00 47 03 07 00 B4 01 FF 00 1C 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 01 8A 08 01 8A 07 00 99 01 07 00 47 03 07 00 B4 FF 00 1C 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 01 D6 08 01 D6 07 00 99 FF 00 02 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 01 D6 08 01 D6 07 00 99 01 FF 00 1F 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 01 D6 08 01 D6 07 00 99 FF 00 18 00 00 00 0A 07 00 84 07 00 84 07 00 84 01 08 01 D6 08 01 D6 07 00 99 01 07 00 47 03 FF 00 02 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 01 D6 08 01 D6 07 00 99 01 07 00 47 03 01 FF 00 1F 00 00 00 0A 07 00 84 07 00 84 07 00 84 01 08 01 D6 08 01 D6 07 00 99 01 07 00 47 03 FF 00 0E 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 01 D6 08 01 D6 07 00 99 01 07 00 47 03 07 00 B4 FF 00 02 00 00 00 0C 07 00 84 07 00 84 07 00 84 01 08 01 D6 08 01 D6 07 00 99 01 07 00 47 03 07 00 B4 01 FF 00 1D 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 01 D6 08 01 D6 07 00 99 01 07 00 47 03 07 00 B4 FF 00 1D 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 02 83 08 02 83 07 00 99 FF 00 02 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 02 83 08 02 83 07 00 99 01 FF 00 1E 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 02 83 08 02 83 07 00 99 FF 00 20 00 00 00 06 07 00 84 07 00 84 07 00 84 01 07 00 03 07 00 03 FF 00 02 00 00 00 07 07 00 84 07 00 84 07 00 84 01 07 00 03 07 00 03 01 FF 00 1F 00 00 00 06 07 00 84 07 00 84 07 00 84 01 07 00 03 07 00 03 FF 00 2E 00 00 00 06 07 00 84 07 00 84 07 00 84 01 07 00 03 07 00 03 FF 00 02 00 00 00 07 07 00 84 07 00 84 07 00 84 01 07 00 03 07 00 03 01 FF 00 1D 00 00 00 06 07 00 84 07 00 84 07 00 84 01 07 00 03 07 00 03 FF 00 27 00 00 00 0A 07 00 84 07 00 84 07 00 84 01 08 03 53 08 03 53 07 00 99 01 07 00 47 03 FF 00 02 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 03 53 08 03 53 07 00 99 01 07 00 47 03 01 FF 00 1C 00 00 00 0A 07 00 84 07 00 84 07 00 84 01 08 03 53 08 03 53 07 00 99 01 07 00 47 03 FF 00 0E 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 03 53 08 03 53 07 00 99 01 07 00 47 03 07 00 B4 FF 00 02 00 00 00 0C 07 00 84 07 00 84 07 00 84 01 08 03 53 08 03 53 07 00 99 01 07 00 47 03 07 00 B4 01 FF 00 1D 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 03 53 08 03 53 07 00 99 01 07 00 47 03 07 00 B4 FF 00 1D 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 03 CF 08 03 CF 07 00 99 FF 00 02 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 03 CF 08 03 CF 07 00 99 01 FF 00 1E 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 03 CF 08 03 CF 07 00 99 FF 00 1A 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 03 CF 08 03 CF 07 00 99 01 07 00 47 03 07 00 B4 FF 00 02 00 00 00 0C 07 00 84 07 00 84 07 00 84 01 08 03 CF 08 03 CF 07 00 99 01 07 00 47 03 07 00 B4 01 FF 00 1D 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 03 CF 08 03 CF 07 00 99 01 07 00 47 03 07 00 B4 FF 00 29 00 00 00 0A 07 00 84 07 00 84 07 00 84 01 08 04 4B 08 04 4B 07 00 99 01 07 00 47 03 FF 00 02 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 04 4B 08 04 4B 07 00 99 01 07 00 47 03 01 FF 00 1E 00 00 00 0A 07 00 84 07 00 84 07 00 84 01 08 04 4B 08 04 4B 07 00 99 01 07 00 47 03 FF 00 20 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 04 9A 08 04 9A 07 00 99 FF 00 02 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 04 9A 08 04 9A 07 00 99 01 FF 00 1F 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 04 9A 08 04 9A 07 00 99 FF 00 52 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 05 0B 08 05 0B 07 00 99 01 FF 00 02 00 00 00 09 07 00 84 07 00 84 07 00 84 01 08 05 0B 08 05 0B 07 00 99 01 01 FF 00 1D 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 05 0B 08 05 0B 07 00 99 01 FF 00 2E 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 05 5B 08 05 5B 07 00 99 01 FF 00 02 00 00 00 09 07 00 84 07 00 84 07 00 84 01 08 05 5B 08 05 5B 07 00 99 01 01 FF 00 1D 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 05 5B 08 05 5B 07 00 99 01 FF 00 17 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 05 5B 08 05 5B 07 00 99 01 07 00 47 03 07 00 B4 FF 00 02 00 00 00 0C 07 00 84 07 00 84 07 00 84 01 08 05 5B 08 05 5B 07 00 99 01 07 00 47 03 07 00 B4 01 FF 00 1C 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 05 5B 08 05 5B 07 00 99 01 07 00 47 03 07 00 B4 FF 00 0F 00 00 00 06 07 00 84 07 00 84 07 00 84 01 07 00 03 07 00 03 FF 00 02 00 00 00 07 07 00 84 07 00 84 07 00 84 01 07 00 03 07 00 03 01 FF 00 1C 00 00 00 06 07 00 84 07 00 84 07 00 84 01 07 00 03 07 00 03 FF 00 19 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 06 03 08 06 03 07 00 99 FF 00 02 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 06 03 08 06 03 07 00 99 01 FF 00 1E 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 06 03 08 06 03 07 00 99 FF 00 2E 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 06 54 08 06 54 07 00 99 FF 00 02 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 06 54 08 06 54 07 00 99 01 FF 00 1D 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 06 54 08 06 54 07 00 99 FF 00 10 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 06 54 08 06 54 07 00 99 01 FF 00 02 00 00 00 09 07 00 84 07 00 84 07 00 84 01 08 06 54 08 06 54 07 00 99 01 01 FF 00 1F 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 06 54 08 06 54 07 00 99 01 FF 00 14 00 00 00 0A 07 00 84 07 00 84 07 00 84 01 08 06 54 08 06 54 07 00 99 01 07 00 47 03 FF 00 02 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 06 54 08 06 54 07 00 99 01 07 00 47 03 01 FF 00 1F 00 00 00 0A 07 00 84 07 00 84 07 00 84 01 08 06 54 08 06 54 07 00 99 01 07 00 47 03 FF 00 0E 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 06 54 08 06 54 07 00 99 01 07 00 47 03 07 00 B4 FF 00 02 00 00 00 0C 07 00 84 07 00 84 07 00 84 01 08 06 54 08 06 54 07 00 99 01 07 00 47 03 07 00 B4 01 FF 00 1D 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 06 54 08 06 54 07 00 99 01 07 00 47 03 07 00 B4 FF 00 0F 00 00 00 06 07 00 84 07 00 84 07 00 84 01 07 00 03 07 00 03 FF 00 02 00 00 00 07 07 00 84 07 00 84 07 00 84 01 07 00 03 07 00 03 01 FF 00 1C 00 00 00 06 07 00 84 07 00 84 07 00 84 01 07 00 03 07 00 03 FF 00 0F 00 00 00 02 07 00 84 07 00 84 FF 00 02 00 00 00 03 07 00 84 07 00 84 01 FF 00 1C 00 00 00 02 07 00 84 07 00 84 FF 00 03 00 00 00 0A 07 00 84 07 00 84 07 00 84 01 08 06 54 08 06 54 07 00 99 01 07 00 47 03 FF 00 01 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 05 5B 08 05 5B 07 00 99 01 FF 00 01 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 05 0B 08 05 0B 07 00 99 01 FF 00 01 00 00 00 06 07 00 84 07 00 84 07 00 84 01 07 00 03 07 00 03 FF 00 01 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 06 54 08 06 54 07 00 99 FF 00 01 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 00 52 08 00 52 07 00 99 01 07 00 47 03 07 00 B4 FF 00 01 00 00 00 0A 07 00 84 07 00 84 07 00 84 01 08 04 4B 08 04 4B 07 00 99 01 07 00 47 03 FF 00 01 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 01 D6 08 01 D6 07 00 99 FF 00 01 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 03 53 08 03 53 07 00 99 01 07 00 47 03 07 00 B4 FF 00 01 00 00 00 06 07 00 84 07 00 84 07 00 84 01 07 00 03 07 00 03 FF 00 01 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 05 5B 08 05 5B 07 00 99 01 07 00 47 03 07 00 B4 FF 00 01 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 06 03 08 06 03 07 00 99 FF 00 01 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 00 EA 08 00 EA 07 00 99 FF 00 01 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 00 08 08 00 08 07 00 99 FF 00 01 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 01 D6 08 01 D6 07 00 99 01 07 00 47 03 07 00 B4 FF 00 01 00 00 00 06 07 00 84 07 00 84 07 00 84 01 07 00 03 07 00 03 FF 00 01 00 00 00 06 07 00 84 07 00 84 07 00 84 01 07 00 03 07 00 03 FF 00 01 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 01 8A 08 01 8A 07 00 99 01 07 00 47 03 07 00 B4 FF 00 01 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 03 CF 08 03 CF 07 00 99 FF 00 01 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 00 EA 08 00 EA 07 00 99 01 07 00 47 03 07 00 B4 FF 00 01 00 00 00 0A 07 00 84 07 00 84 07 00 84 01 08 03 53 08 03 53 07 00 99 01 07 00 47 03 FF 00 01 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 06 54 08 06 54 07 00 99 01 07 00 47 03 07 00 B4 FF 00 01 00 00 00 02 07 00 84 07 00 84 FF 00 01 00 00 00 08 07 00 84 07 00 84 07 00 84 01 08 06 54 08 06 54 07 00 99 01 FF 00 01 00 00 00 0A 07 00 84 07 00 84 07 00 84 01 08 01 D6 08 01 D6 07 00 99 01 07 00 47 03 FF 00 01 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 04 9A 08 04 9A 07 00 99 FF 00 01 00 00 00 0A 07 00 84 07 00 84 07 00 84 01 08 00 EA 08 00 EA 07 00 99 01 07 00 47 03 FF 00 01 00 00 00 0B 07 00 84 07 00 84 07 00 84 01 08 03 CF 08 03 CF 07 00 99 01 07 00 47 03 07 00 B4 FF 00 01 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 02 83 08 02 83 07 00 99 FF 00 01 00 00 00 07 07 00 84 07 00 84 07 00 84 01 08 00 52 08 00 52 07 00 99
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    public f8d c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: iflt            87
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            79
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getstatic       dev/nuker/pyro/fc.1:I
        //    20: ifeq            29
        //    23: ldc_w           -916004794
        //    26: goto            32
        //    29: ldc_w           -1875060499
        //    32: ldc_w           -209962086
        //    35: ixor           
        //    36: lookupswitch {
        //          974838748: 29
        //          1665196919: 64
        //          default: 68
        //        }
        //    64: getfield        dev/nuker/pyro/f8v.c:Ldev/nuker/pyro/f8d;
        //    67: areturn        
        //    68: aconst_null    
        //    69: athrow         
        //    70: pop            
        //    71: goto            16
        //    74: pop            
        //    75: aconst_null    
        //    76: goto            70
        //    79: dup            
        //    80: ifnull          70
        //    83: checkcast       Ljava/lang/Throwable;
        //    86: athrow         
        //    87: dup            
        //    88: ifnull          74
        //    91: checkcast       Ljava/lang/Throwable;
        //    94: athrow         
        //    StackMapTable: 00 0A FF 00 0C 00 00 00 01 07 00 33 FC 00 03 07 00 03 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 43 07 00 03 41 07 00 33 43 05 44 07 00 33 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  0      12     79     87     Any
        //  79     87     79     87     Ljava/lang/ClassCastException;
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
    
    public double 2() {
        return fbS.9N(this, 674074966);
    }
}
