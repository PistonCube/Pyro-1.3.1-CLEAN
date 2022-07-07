// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import javax.annotation.Nullable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.entity.Entity;

public class fb8 extends fbk
{
    public static Vec3d c(final Entity p0, final double p1, final double p2, final double p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          372
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            364
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            356
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lnet/minecraft/util/math/Vec3d;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/fc.c:I
        //    31: ifge            39
        //    34: ldc             -18326220
        //    36: goto            41
        //    39: ldc             -1893035517
        //    41: ldc             1854317963
        //    43: ixor           
        //    44: lookupswitch {
        //          -1871775553: 39
        //          -508807288: 72
        //          default: 345
        //        }
        //    72: aload_0        
        //    73: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //    76: aload_0        
        //    77: getstatic       dev/nuker/pyro/fc.0:I
        //    80: ifeq            88
        //    83: ldc             2112528273
        //    85: goto            90
        //    88: ldc             -1464734509
        //    90: ldc             122894911
        //    92: ixor           
        //    93: lookupswitch {
        //          -1688103465: 88
        //          2058986926: 339
        //          default: 120
        //        }
        //   120: getfield        net/minecraft/entity/Entity.field_70142_S:D
        //   123: dsub           
        //   124: getstatic       dev/nuker/pyro/fc.c:I
        //   127: ifge            135
        //   130: ldc             -511164971
        //   132: goto            137
        //   135: ldc             945066387
        //   137: ldc             -507962814
        //   139: ixor           
        //   140: lookupswitch {
        //          -638743599: 168
        //          3221399: 135
        //          default: 335
        //        }
        //   168: dload_1        
        //   169: dmul           
        //   170: aload_0        
        //   171: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //   174: aload_0        
        //   175: getfield        net/minecraft/entity/Entity.field_70137_T:D
        //   178: dsub           
        //   179: dload_3        
        //   180: dmul           
        //   181: getstatic       dev/nuker/pyro/fc.0:I
        //   184: ifeq            192
        //   187: ldc             -37107453
        //   189: goto            194
        //   192: ldc             -458278676
        //   194: ldc             -1626695628
        //   196: ixor           
        //   197: lookupswitch {
        //          1486612879: 192
        //          1656967479: 337
        //          default: 224
        //        }
        //   224: aload_0        
        //   225: getstatic       dev/nuker/pyro/fc.0:I
        //   228: ifeq            236
        //   231: ldc             -1759172131
        //   233: goto            238
        //   236: ldc             1661612350
        //   238: ldc             -122471963
        //   240: ixor           
        //   241: lookupswitch {
        //          -1682372389: 268
        //          1872105528: 236
        //          default: 341
        //        }
        //   268: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   271: aload_0        
        //   272: getfield        net/minecraft/entity/Entity.field_70136_U:D
        //   275: dsub           
        //   276: getstatic       dev/nuker/pyro/fc.0:I
        //   279: ifeq            287
        //   282: ldc             -1173929931
        //   284: goto            289
        //   287: ldc             -1784230227
        //   289: ldc             456956683
        //   291: ixor           
        //   292: lookupswitch {
        //          -1902488154: 320
        //          -1589912770: 287
        //          default: 343
        //        }
        //   320: dload           5
        //   322: dmul           
        //   323: goto            327
        //   326: athrow         
        //   327: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //   330: goto            334
        //   333: athrow         
        //   334: areturn        
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
        //   345: aconst_null    
        //   346: athrow         
        //   347: pop            
        //   348: goto            24
        //   351: pop            
        //   352: aconst_null    
        //   353: goto            347
        //   356: dup            
        //   357: ifnull          347
        //   360: checkcast       Ljava/lang/Throwable;
        //   363: athrow         
        //   364: dup            
        //   365: ifnull          351
        //   368: checkcast       Ljava/lang/Throwable;
        //   371: athrow         
        //   372: aconst_null    
        //   373: athrow         
        //    StackMapTable: 00 25 43 07 00 12 04 FF 00 0B 00 00 00 01 07 00 12 FF 00 03 00 04 07 00 19 03 03 03 00 00 FF 00 0E 00 04 07 00 19 03 03 03 00 02 08 00 18 08 00 18 FF 00 01 00 04 07 00 19 03 03 03 00 03 08 00 18 08 00 18 01 FF 00 1E 00 04 07 00 19 03 03 03 00 02 08 00 18 08 00 18 FF 00 0F 00 04 07 00 19 03 03 03 00 04 08 00 18 08 00 18 03 07 00 19 FF 00 01 00 04 07 00 19 03 03 03 00 05 08 00 18 08 00 18 03 07 00 19 01 FF 00 1D 00 04 07 00 19 03 03 03 00 04 08 00 18 08 00 18 03 07 00 19 FF 00 0E 00 04 07 00 19 03 03 03 00 03 08 00 18 08 00 18 03 FF 00 01 00 04 07 00 19 03 03 03 00 04 08 00 18 08 00 18 03 01 FF 00 1E 00 04 07 00 19 03 03 03 00 03 08 00 18 08 00 18 03 FF 00 17 00 04 07 00 19 03 03 03 00 04 08 00 18 08 00 18 03 03 FF 00 01 00 04 07 00 19 03 03 03 00 05 08 00 18 08 00 18 03 03 01 FF 00 1D 00 04 07 00 19 03 03 03 00 04 08 00 18 08 00 18 03 03 FF 00 0B 00 04 07 00 19 03 03 03 00 05 08 00 18 08 00 18 03 03 07 00 19 FF 00 01 00 04 07 00 19 03 03 03 00 06 08 00 18 08 00 18 03 03 07 00 19 01 FF 00 1D 00 04 07 00 19 03 03 03 00 05 08 00 18 08 00 18 03 03 07 00 19 FF 00 12 00 04 07 00 19 03 03 03 00 05 08 00 18 08 00 18 03 03 03 FF 00 01 00 04 07 00 19 03 03 03 00 06 08 00 18 08 00 18 03 03 03 01 FF 00 1E 00 04 07 00 19 03 03 03 00 05 08 00 18 08 00 18 03 03 03 45 07 00 12 FF 00 00 00 04 07 00 19 03 03 03 00 05 08 00 18 08 00 18 03 03 03 45 07 00 12 40 07 00 14 FF 00 00 00 04 07 00 19 03 03 03 00 03 08 00 18 08 00 18 03 FF 00 01 00 04 07 00 19 03 03 03 00 04 08 00 18 08 00 18 03 03 FF 00 01 00 04 07 00 19 03 03 03 00 04 08 00 18 08 00 18 03 07 00 19 FF 00 01 00 04 07 00 19 03 03 03 00 05 08 00 18 08 00 18 03 03 07 00 19 FF 00 01 00 04 07 00 19 03 03 03 00 05 08 00 18 08 00 18 03 03 03 FF 00 01 00 04 07 00 19 03 03 03 00 02 08 00 18 08 00 18 41 07 00 12 43 05 44 07 00 12 47 05 47 07 00 12
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  8      20     356    364    Any
        //  356    364    356    364    Ljava/lang/RuntimeException;
        //  372    374    3      8      Ljava/lang/RuntimeException;
        //  326    333    333    334    Any
        //  326    333    3      8      Ljava/lang/RuntimeException;
        //  326    333    3      8      Any
        //  326    333    326    327    Any
        //  326    333    333    334    Ljava/lang/IndexOutOfBoundsException;
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
    
    public fb8() {
        while (true) {
            int n = 0;
            Label_0014: {
                if (fc.1 != 0) {
                    n = 592159936;
                    break Label_0014;
                }
                n = -1481738018;
            }
            switch (n ^ 0xA9BB26D8) {
                case -1963949544: {
                    continue;
                }
                case 236281350: {}
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static Vec3d c(final Entity p0, final float p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          191
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            183
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            175
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lnet/minecraft/util/math/Vec3d;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/fc.c:I
        //    31: ifge            39
        //    34: ldc             -724397765
        //    36: goto            41
        //    39: ldc             -598049580
        //    41: ldc             949437015
        //    43: ixor           
        //    44: lookupswitch {
        //          -456311165: 72
        //          -330968212: 39
        //          default: 164
        //        }
        //    72: aload_0        
        //    73: getfield        net/minecraft/entity/Entity.field_70142_S:D
        //    76: aload_0        
        //    77: getfield        net/minecraft/entity/Entity.field_70137_T:D
        //    80: aload_0        
        //    81: getfield        net/minecraft/entity/Entity.field_70136_U:D
        //    84: goto            88
        //    87: athrow         
        //    88: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //    91: goto            95
        //    94: athrow         
        //    95: getstatic       dev/nuker/pyro/fc.0:I
        //    98: ifeq            106
        //   101: ldc             520365905
        //   103: goto            108
        //   106: ldc             648327636
        //   108: ldc             208332602
        //   110: ixor           
        //   111: lookupswitch {
        //          326025323: 106
        //          718165742: 136
        //          default: 162
        //        }
        //   136: aload_0        
        //   137: fload_1        
        //   138: f2d            
        //   139: goto            143
        //   142: athrow         
        //   143: invokestatic    dev/nuker/pyro/fb8.c:(Lnet/minecraft/entity/Entity;D)Lnet/minecraft/util/math/Vec3d;
        //   146: goto            150
        //   149: athrow         
        //   150: goto            154
        //   153: athrow         
        //   154: invokevirtual   net/minecraft/util/math/Vec3d.func_178787_e:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        //   157: goto            161
        //   160: athrow         
        //   161: areturn        
        //   162: aconst_null    
        //   163: athrow         
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
        //    StackMapTable: 00 1D 43 07 00 12 04 FF 00 0B 00 00 00 01 07 00 12 FD 00 03 07 00 19 02 FF 00 0E 00 02 07 00 19 02 00 02 08 00 18 08 00 18 FF 00 01 00 02 07 00 19 02 00 03 08 00 18 08 00 18 01 FF 00 1E 00 02 07 00 19 02 00 02 08 00 18 08 00 18 4E 07 00 12 FF 00 00 00 02 07 00 19 02 00 05 08 00 18 08 00 18 03 03 03 45 07 00 12 40 07 00 14 4A 07 00 14 FF 00 01 00 02 07 00 19 02 00 02 07 00 14 01 5B 07 00 14 45 07 00 12 FF 00 00 00 02 07 00 19 02 00 03 07 00 14 07 00 19 03 45 07 00 12 FF 00 00 00 02 07 00 19 02 00 02 07 00 14 07 00 14 42 07 00 12 FF 00 00 00 02 07 00 19 02 00 02 07 00 14 07 00 14 45 07 00 12 40 07 00 14 40 07 00 14 FF 00 01 00 02 07 00 19 02 00 02 08 00 18 08 00 18 41 07 00 12 43 05 44 07 00 12 47 05 47 07 00 12
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     175    183    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  175    183    175    183    Ljava/lang/AssertionError;
        //  191    193    3      8      Any
        //  87     94     94     95     Any
        //  88     94     94     95     Ljava/lang/ClassCastException;
        //  88     94     94     95     Any
        //  87     94     94     95     Any
        //  87     94     87     88     Any
        //  142    149    149    150    Any
        //  143    149    3      8      Any
        //  143    149    3      8      Ljava/lang/NegativeArraySizeException;
        //  142    149    142    143    Any
        //  143    149    149    150    Ljava/lang/ArithmeticException;
        //  153    160    160    161    Any
        //  153    160    153    154    Any
        //  153    160    3      8      Ljava/lang/AssertionError;
        //  154    160    160    161    Any
        //  154    160    160    161    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 72 out of bounds for length 72
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
    
    public static boolean 6(final Entity entity) {
        return fbS.hj(null, 119090292, entity);
    }
    
    public static BlockPos c(final Entity p0, @Nullable final BlockPos p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          448
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            440
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            432
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            35
        //    30: ldc             1771879033
        //    32: goto            37
        //    35: ldc             1953059905
        //    37: ldc             -190888863
        //    39: ixor           
        //    40: lookupswitch {
        //          -2131357664: 68
        //          -1660682728: 35
        //          default: 417
        //        }
        //    68: aload_0        
        //    69: goto            73
        //    72: athrow         
        //    73: invokevirtual   net/minecraft/entity/Entity.func_174791_d:()Lnet/minecraft/util/math/Vec3d;
        //    76: goto            80
        //    79: athrow         
        //    80: astore_2       
        //    81: aload_1        
        //    82: ifnonnull       200
        //    85: new             Lnet/minecraft/util/math/BlockPos;
        //    88: dup            
        //    89: getstatic       dev/nuker/pyro/fc.0:I
        //    92: ifeq            100
        //    95: ldc             305289653
        //    97: goto            102
        //   100: ldc             -700964303
        //   102: ldc             710383812
        //   104: ixor           
        //   105: lookupswitch {
        //          650028522: 100
        //          946192753: 419
        //          default: 132
        //        }
        //   132: aload_2        
        //   133: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //   136: aload_2        
        //   137: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   140: aload_2        
        //   141: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   144: getstatic       dev/nuker/pyro/fc.c:I
        //   147: ifge            155
        //   150: ldc             602354810
        //   152: goto            157
        //   155: ldc             1571486100
        //   157: ldc             -1856074057
        //   159: ixor           
        //   160: lookupswitch {
        //          -1296450867: 155
        //          -856393949: 188
        //          default: 409
        //        }
        //   188: goto            192
        //   191: athrow         
        //   192: invokespecial   net/minecraft/util/math/BlockPos.<init>:(DDD)V
        //   195: goto            199
        //   198: athrow         
        //   199: areturn        
        //   200: new             Lnet/minecraft/util/math/BlockPos;
        //   203: dup            
        //   204: aload_2        
        //   205: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //   208: getstatic       dev/nuker/pyro/fc.c:I
        //   211: ifge            219
        //   214: ldc             -769280919
        //   216: goto            221
        //   219: ldc             -1936894522
        //   221: ldc             409489330
        //   223: ixor           
        //   224: lookupswitch {
        //          -1796924812: 252
        //          -900858917: 219
        //          default: 413
        //        }
        //   252: aload_2        
        //   253: getstatic       dev/nuker/pyro/fc.c:I
        //   256: ifge            264
        //   259: ldc             1535397638
        //   261: goto            266
        //   264: ldc             -16898095
        //   266: ldc             -38604022
        //   268: ixor           
        //   269: lookupswitch {
        //          -1506362356: 264
        //          55366875: 296
        //          default: 415
        //        }
        //   296: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //   299: getstatic       dev/nuker/pyro/fc.1:I
        //   302: ifeq            310
        //   305: ldc             1817017275
        //   307: goto            312
        //   310: ldc             1169629923
        //   312: ldc             -1710226768
        //   314: ixor           
        //   315: lookupswitch {
        //          -1086382573: 310
        //          -161646325: 411
        //          default: 340
        //        }
        //   340: aload_2        
        //   341: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //   344: goto            348
        //   347: athrow         
        //   348: invokespecial   net/minecraft/util/math/BlockPos.<init>:(DDD)V
        //   351: goto            355
        //   354: athrow         
        //   355: getstatic       dev/nuker/pyro/fc.1:I
        //   358: ifeq            366
        //   361: ldc             824126530
        //   363: goto            368
        //   366: ldc             -1742516442
        //   368: ldc             -1145565051
        //   370: ixor           
        //   371: lookupswitch {
        //          -1968751417: 421
        //          -125370468: 366
        //          default: 396
        //        }
        //   396: aload_1        
        //   397: goto            401
        //   400: athrow         
        //   401: invokevirtual   net/minecraft/util/math/BlockPos.func_177971_a:(Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos;
        //   404: goto            408
        //   407: athrow         
        //   408: areturn        
        //   409: aconst_null    
        //   410: athrow         
        //   411: aconst_null    
        //   412: athrow         
        //   413: aconst_null    
        //   414: athrow         
        //   415: aconst_null    
        //   416: athrow         
        //   417: aconst_null    
        //   418: athrow         
        //   419: aconst_null    
        //   420: athrow         
        //   421: aconst_null    
        //   422: athrow         
        //   423: pop            
        //   424: goto            24
        //   427: pop            
        //   428: aconst_null    
        //   429: goto            423
        //   432: dup            
        //   433: ifnull          423
        //   436: checkcast       Ljava/lang/Throwable;
        //   439: athrow         
        //   440: dup            
        //   441: ifnull          427
        //   444: checkcast       Ljava/lang/Throwable;
        //   447: athrow         
        //   448: aconst_null    
        //   449: athrow         
        //    StackMapTable: 00 36 43 07 00 12 04 FF 00 0B 00 00 00 01 07 00 12 FD 00 03 07 00 19 07 00 83 0A 41 01 1E 43 07 00 09 40 07 00 19 45 07 00 12 40 07 00 14 FF 00 13 00 03 07 00 19 07 00 83 07 00 14 00 02 08 00 55 08 00 55 FF 00 01 00 03 07 00 19 07 00 83 07 00 14 00 03 08 00 55 08 00 55 01 FF 00 1D 00 03 07 00 19 07 00 83 07 00 14 00 02 08 00 55 08 00 55 FF 00 16 00 03 07 00 19 07 00 83 07 00 14 00 05 08 00 55 08 00 55 03 03 03 FF 00 01 00 03 07 00 19 07 00 83 07 00 14 00 06 08 00 55 08 00 55 03 03 03 01 FF 00 1E 00 03 07 00 19 07 00 83 07 00 14 00 05 08 00 55 08 00 55 03 03 03 42 07 00 12 FF 00 00 00 03 07 00 19 07 00 83 07 00 14 00 05 08 00 55 08 00 55 03 03 03 45 07 00 12 40 07 00 83 00 FF 00 12 00 03 07 00 19 07 00 83 07 00 14 00 03 08 00 C8 08 00 C8 03 FF 00 01 00 03 07 00 19 07 00 83 07 00 14 00 04 08 00 C8 08 00 C8 03 01 FF 00 1E 00 03 07 00 19 07 00 83 07 00 14 00 03 08 00 C8 08 00 C8 03 FF 00 0B 00 03 07 00 19 07 00 83 07 00 14 00 04 08 00 C8 08 00 C8 03 07 00 14 FF 00 01 00 03 07 00 19 07 00 83 07 00 14 00 05 08 00 C8 08 00 C8 03 07 00 14 01 FF 00 1D 00 03 07 00 19 07 00 83 07 00 14 00 04 08 00 C8 08 00 C8 03 07 00 14 FF 00 0D 00 03 07 00 19 07 00 83 07 00 14 00 04 08 00 C8 08 00 C8 03 03 FF 00 01 00 03 07 00 19 07 00 83 07 00 14 00 05 08 00 C8 08 00 C8 03 03 01 FF 00 1B 00 03 07 00 19 07 00 83 07 00 14 00 04 08 00 C8 08 00 C8 03 03 46 07 00 09 FF 00 00 00 03 07 00 19 07 00 83 07 00 14 00 05 08 00 C8 08 00 C8 03 03 03 45 07 00 12 40 07 00 83 4A 07 00 83 FF 00 01 00 03 07 00 19 07 00 83 07 00 14 00 02 07 00 83 01 5B 07 00 83 43 07 00 7A FF 00 00 00 03 07 00 19 07 00 83 07 00 14 00 02 07 00 83 07 00 83 45 07 00 12 40 07 00 83 FF 00 00 00 03 07 00 19 07 00 83 07 00 14 00 05 08 00 55 08 00 55 03 03 03 FF 00 01 00 03 07 00 19 07 00 83 07 00 14 00 04 08 00 C8 08 00 C8 03 03 FF 00 01 00 03 07 00 19 07 00 83 07 00 14 00 03 08 00 C8 08 00 C8 03 FF 00 01 00 03 07 00 19 07 00 83 07 00 14 00 04 08 00 C8 08 00 C8 03 07 00 14 FA 00 01 FF 00 01 00 03 07 00 19 07 00 83 07 00 14 00 02 08 00 55 08 00 55 41 07 00 83 FF 00 01 00 02 07 00 19 07 00 83 00 01 07 00 12 43 05 44 07 00 12 47 05 47 07 00 12
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     432    440    Ljava/lang/EnumConstantNotPresentException;
        //  432    440    432    440    Any
        //  448    450    3      8      Any
        //  72     79     79     80     Any
        //  72     79     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  73     79     72     73     Ljava/lang/IllegalArgumentException;
        //  72     79     79     80     Ljava/lang/IllegalArgumentException;
        //  73     79     72     73     Ljava/util/NoSuchElementException;
        //  191    198    198    199    Any
        //  191    198    198    199    Any
        //  191    198    191    192    Any
        //  191    198    3      8      Ljava/lang/RuntimeException;
        //  191    198    191    192    Any
        //  347    354    354    355    Any
        //  347    354    347    348    Ljava/util/NoSuchElementException;
        //  348    354    3      8      Any
        //  347    354    347    348    Ljava/util/ConcurrentModificationException;
        //  348    354    3      8      Ljava/lang/NumberFormatException;
        //  400    407    407    408    Any
        //  401    407    400    401    Ljava/lang/StringIndexOutOfBoundsException;
        //  401    407    3      8      Any
        //  400    407    3      8      Any
        //  401    407    3      8      Ljava/lang/RuntimeException;
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
    
    public static boolean 0(final Entity entity) {
        return fbS.hl(null, 1359932471, entity);
    }
    
    public static int a(final Entity p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          273
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            265
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            257
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: ldc             16777215
        //    26: istore_1       
        //    27: aload_0        
        //    28: goto            32
        //    31: athrow         
        //    32: invokevirtual   net/minecraft/entity/Entity.func_96124_cp:()Lnet/minecraft/scoreboard/Team;
        //    35: goto            39
        //    38: athrow         
        //    39: checkcast       Lnet/minecraft/scoreboard/ScorePlayerTeam;
        //    42: dup            
        //    43: astore_2       
        //    44: ifnull          52
        //    47: ldc             -971227313
        //    49: goto            54
        //    52: ldc             -971227314
        //    54: ldc             434174881
        //    56: ixor           
        //    57: tableswitch {
        //          -1074165284: 80
        //          -1074165283: 242
        //          default: 47
        //        }
        //    80: getstatic       dev/nuker/pyro/fb8.c:Lnet/minecraft/client/Minecraft;
        //    83: getfield        net/minecraft/client/Minecraft.field_71466_p:Lnet/minecraft/client/gui/FontRenderer;
        //    86: pop            
        //    87: aload_2        
        //    88: goto            92
        //    91: athrow         
        //    92: invokevirtual   net/minecraft/scoreboard/ScorePlayerTeam.func_96668_e:()Ljava/lang/String;
        //    95: goto            99
        //    98: athrow         
        //    99: goto            103
        //   102: athrow         
        //   103: invokestatic    net/minecraft/client/gui/FontRenderer.func_78282_e:(Ljava/lang/String;)Ljava/lang/String;
        //   106: goto            110
        //   109: athrow         
        //   110: dup            
        //   111: getstatic       dev/nuker/pyro/fc.0:I
        //   114: ifeq            122
        //   117: ldc             534077434
        //   119: goto            124
        //   122: ldc             724454226
        //   124: ldc             548220409
        //   126: ixor           
        //   127: lookupswitch {
        //          193160875: 152
        //          1064858115: 122
        //          default: 246
        //        }
        //   152: astore_3       
        //   153: getstatic       dev/nuker/pyro/fc.0:I
        //   156: ifeq            164
        //   159: ldc             -553773925
        //   161: goto            166
        //   164: ldc             1107376327
        //   166: ldc             1638855869
        //   168: ixor           
        //   169: lookupswitch {
        //          -1085218778: 244
        //          2068753101: 164
        //          default: 196
        //        }
        //   196: goto            200
        //   199: athrow         
        //   200: invokevirtual   java/lang/String.length:()I
        //   203: goto            207
        //   206: athrow         
        //   207: iconst_2       
        //   208: if_icmplt       242
        //   211: getstatic       dev/nuker/pyro/fb8.c:Lnet/minecraft/client/Minecraft;
        //   214: getfield        net/minecraft/client/Minecraft.field_71466_p:Lnet/minecraft/client/gui/FontRenderer;
        //   217: aload_3        
        //   218: iconst_1       
        //   219: goto            223
        //   222: athrow         
        //   223: invokevirtual   java/lang/String.charAt:(I)C
        //   226: goto            230
        //   229: athrow         
        //   230: goto            234
        //   233: athrow         
        //   234: invokevirtual   net/minecraft/client/gui/FontRenderer.func_175064_b:(C)I
        //   237: goto            241
        //   240: athrow         
        //   241: istore_1       
        //   242: iload_1        
        //   243: ireturn        
        //   244: aconst_null    
        //   245: athrow         
        //   246: aconst_null    
        //   247: athrow         
        //   248: pop            
        //   249: goto            24
        //   252: pop            
        //   253: aconst_null    
        //   254: goto            248
        //   257: dup            
        //   258: ifnull          248
        //   261: checkcast       Ljava/lang/Throwable;
        //   264: athrow         
        //   265: dup            
        //   266: ifnull          252
        //   269: checkcast       Ljava/lang/Throwable;
        //   272: athrow         
        //   273: aconst_null    
        //   274: athrow         
        //    StackMapTable: 00 2E FF 00 03 00 02 07 00 19 01 00 01 07 00 12 FA 00 04 FF 00 0B 00 00 00 01 07 00 12 FC 00 03 07 00 19 FF 00 06 00 02 07 00 19 01 00 01 07 00 12 40 07 00 19 45 07 00 12 40 07 00 DE FC 00 07 07 00 B2 04 41 01 19 4A 07 00 12 40 07 00 B2 45 07 00 12 40 07 00 D0 42 07 00 09 40 07 00 D0 45 07 00 12 40 07 00 D0 FF 00 0B 00 03 07 00 19 01 07 00 B2 00 02 07 00 D0 07 00 D0 FF 00 01 00 03 07 00 19 01 07 00 B2 00 03 07 00 D0 07 00 D0 01 FF 00 1B 00 03 07 00 19 01 07 00 B2 00 02 07 00 D0 07 00 D0 FF 00 0B 00 04 07 00 19 01 07 00 B2 07 00 D0 00 01 07 00 D0 FF 00 01 00 04 07 00 19 01 07 00 B2 07 00 D0 00 02 07 00 D0 01 5D 07 00 D0 42 07 00 12 40 07 00 D0 45 07 00 12 40 01 4E 07 00 12 FF 00 00 00 04 07 00 19 01 07 00 B2 07 00 D0 00 03 07 00 C4 07 00 D0 01 45 07 00 12 FF 00 00 00 04 07 00 19 01 07 00 B2 07 00 D0 00 02 07 00 C4 01 42 07 00 12 FF 00 00 00 04 07 00 19 01 07 00 B2 07 00 D0 00 02 07 00 C4 01 45 07 00 12 40 01 FA 00 00 FF 00 01 00 04 07 00 19 01 07 00 B2 07 00 D0 00 01 07 00 D0 FF 00 01 00 03 07 00 19 01 07 00 B2 00 02 07 00 D0 07 00 D0 FF 00 01 00 01 07 00 19 00 01 07 00 09 43 05 44 07 00 09 47 05 FF 00 07 00 02 07 00 19 01 00 01 07 00 12
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     257    265    Ljava/lang/StringIndexOutOfBoundsException;
        //  257    265    257    265    Ljava/lang/NumberFormatException;
        //  273    275    3      8      Ljava/lang/ClassCastException;
        //  31     38     38     39     Any
        //  32     38     31     32     Any
        //  32     38     38     39     Any
        //  31     38     3      8      Any
        //  32     38     38     39     Ljava/util/ConcurrentModificationException;
        //  91     98     98     99     Any
        //  92     98     91     92     Any
        //  91     98     3      8      Any
        //  92     98     3      8      Ljava/lang/AssertionError;
        //  92     98     91     92     Any
        //  102    109    109    110    Any
        //  103    109    102    103    Ljava/lang/ArithmeticException;
        //  103    109    3      8      Ljava/lang/ClassCastException;
        //  102    109    102    103    Ljava/lang/IndexOutOfBoundsException;
        //  103    109    3      8      Ljava/lang/ClassCastException;
        //  199    206    206    207    Any
        //  200    206    3      8      Any
        //  200    206    199    200    Any
        //  200    206    3      8      Ljava/lang/UnsupportedOperationException;
        //  200    206    206    207    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  222    229    229    230    Any
        //  222    229    229    230    Ljava/lang/AssertionError;
        //  223    229    229    230    Any
        //  223    229    222    223    Any
        //  222    229    222    223    Ljava/lang/ClassCastException;
        //  233    240    240    241    Any
        //  233    240    233    234    Ljava/lang/RuntimeException;
        //  233    240    233    234    Any
        //  233    240    233    234    Any
        //  234    240    3      8      Ljava/lang/AssertionError;
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
    
    public static boolean 8(final Entity entity) {
        return fbS.hm(null, 1885372019, entity);
    }
    
    public static boolean c(final Entity p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          861
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            853
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            845
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             1042352004
        //    32: goto            37
        //    35: ldc             -277469011
        //    37: ldc             -841323536
        //    39: ixor           
        //    40: lookupswitch {
        //          -446435021: 35
        //          -201626508: 816
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: ifnonnull       74
        //    72: iconst_0       
        //    73: ireturn        
        //    74: aload_0        
        //    75: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //    78: getstatic       dev/nuker/pyro/fc.1:I
        //    81: ifeq            89
        //    84: ldc             1218347339
        //    86: goto            91
        //    89: ldc             -420762389
        //    91: ldc             -2022033512
        //    93: ixor           
        //    94: lookupswitch {
        //          -807094573: 89
        //          1636932467: 120
        //          default: 822
        //        }
        //   120: iload_1        
        //   121: ifeq            130
        //   124: ldc2_w          0.03
        //   127: goto            154
        //   130: aload_0        
        //   131: goto            135
        //   134: athrow         
        //   135: invokestatic    dev/nuker/pyro/fb8.2:(Lnet/minecraft/entity/Entity;)Z
        //   138: goto            142
        //   141: athrow         
        //   142: ifeq            151
        //   145: ldc2_w          0.2
        //   148: goto            154
        //   151: ldc2_w          0.5
        //   154: dsub           
        //   155: getstatic       dev/nuker/pyro/fc.0:I
        //   158: ifeq            166
        //   161: ldc             1445970230
        //   163: goto            168
        //   166: ldc             213528289
        //   168: ldc             2004595382
        //   170: ixor           
        //   171: lookupswitch {
        //          559182720: 166
        //          2076286039: 196
        //          default: 830
        //        }
        //   196: dstore_2       
        //   197: aload_0        
        //   198: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //   201: goto            205
        //   204: athrow         
        //   205: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   208: goto            212
        //   211: athrow         
        //   212: getstatic       dev/nuker/pyro/fc.1:I
        //   215: ifeq            224
        //   218: ldc_w           1365898197
        //   221: goto            227
        //   224: ldc_w           1560872705
        //   227: ldc_w           102720110
        //   230: ixor           
        //   231: lookupswitch {
        //          -1189510937: 224
        //          1467388347: 832
        //          default: 256
        //        }
        //   256: istore          4
        //   258: iload           4
        //   260: aload_0        
        //   261: getstatic       dev/nuker/pyro/fc.0:I
        //   264: ifeq            273
        //   267: ldc_w           718379273
        //   270: goto            276
        //   273: ldc_w           316318525
        //   276: ldc_w           1975475954
        //   279: ixor           
        //   280: lookupswitch {
        //          604822743: 273
        //          1601095675: 826
        //          default: 308
        //        }
        //   308: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //   311: getstatic       dev/nuker/pyro/fc.c:I
        //   314: ifge            323
        //   317: ldc_w           95886563
        //   320: goto            326
        //   323: ldc_w           -372718640
        //   326: ldc_w           -1880756148
        //   329: ixor           
        //   330: lookupswitch {
        //          -1974276945: 820
        //          610907078: 323
        //          default: 356
        //        }
        //   356: goto            360
        //   359: athrow         
        //   360: invokestatic    net/minecraft/util/math/MathHelper.func_76143_f:(D)I
        //   363: goto            367
        //   366: athrow         
        //   367: if_icmpge       810
        //   370: aload_0        
        //   371: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   374: getstatic       dev/nuker/pyro/fc.1:I
        //   377: ifeq            386
        //   380: ldc_w           -2055051825
        //   383: goto            389
        //   386: ldc_w           7557123
        //   389: ldc_w           -1769615369
        //   392: ixor           
        //   393: lookupswitch {
        //          -1795279692: 386
        //          319269432: 834
        //          default: 420
        //        }
        //   420: goto            424
        //   423: athrow         
        //   424: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   427: goto            431
        //   430: athrow         
        //   431: getstatic       dev/nuker/pyro/fc.0:I
        //   434: ifeq            443
        //   437: ldc_w           -985757613
        //   440: goto            446
        //   443: ldc_w           -300527567
        //   446: ldc_w           261162637
        //   449: ixor           
        //   450: lookupswitch {
        //          -1646059955: 443
        //          -894464290: 828
        //          default: 476
        //        }
        //   476: istore          5
        //   478: iload           5
        //   480: getstatic       dev/nuker/pyro/fc.c:I
        //   483: ifge            492
        //   486: ldc_w           -953625592
        //   489: goto            495
        //   492: ldc_w           -1746572802
        //   495: ldc_w           621616215
        //   498: ixor           
        //   499: lookupswitch {
        //          -500840353: 824
        //          730549946: 492
        //          default: 524
        //        }
        //   524: aload_0        
        //   525: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   528: goto            532
        //   531: athrow         
        //   532: invokestatic    net/minecraft/util/math/MathHelper.func_76143_f:(D)I
        //   535: goto            539
        //   538: athrow         
        //   539: if_icmpge       804
        //   542: new             Lnet/minecraft/util/math/BlockPos;
        //   545: dup            
        //   546: iload           4
        //   548: dload_2        
        //   549: getstatic       dev/nuker/pyro/fc.c:I
        //   552: ifge            561
        //   555: ldc_w           2057251161
        //   558: goto            564
        //   561: ldc_w           -1487670179
        //   564: ldc_w           -816728345
        //   567: ixor           
        //   568: lookupswitch {
        //          -1244749890: 561
        //          1744978618: 596
        //          default: 812
        //        }
        //   596: goto            600
        //   599: athrow         
        //   600: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   603: goto            607
        //   606: athrow         
        //   607: iload           5
        //   609: goto            613
        //   612: athrow         
        //   613: invokespecial   net/minecraft/util/math/BlockPos.<init>:(III)V
        //   616: goto            620
        //   619: athrow         
        //   620: astore          6
        //   622: getstatic       dev/nuker/pyro/fc.0:I
        //   625: ifeq            634
        //   628: ldc_w           -1332777268
        //   631: goto            637
        //   634: ldc_w           -2015718215
        //   637: ldc_w           2019681007
        //   640: ixor           
        //   641: lookupswitch {
        //          -923890653: 634
        //          -4491690: 668
        //          default: 818
        //        }
        //   668: goto            672
        //   671: athrow         
        //   672: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   675: goto            679
        //   678: athrow         
        //   679: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   682: aload           6
        //   684: goto            688
        //   687: athrow         
        //   688: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   691: goto            695
        //   694: athrow         
        //   695: getstatic       dev/nuker/pyro/fc.1:I
        //   698: ifeq            707
        //   701: ldc_w           1731075109
        //   704: goto            710
        //   707: ldc_w           -1549317205
        //   710: ldc_w           -622027636
        //   713: ixor           
        //   714: lookupswitch {
        //          -1111326551: 814
        //          -788876128: 707
        //          default: 740
        //        }
        //   740: goto            744
        //   743: athrow         
        //   744: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   749: goto            753
        //   752: athrow         
        //   753: instanceof      Lnet/minecraft/block/BlockLiquid;
        //   756: ifeq            765
        //   759: ldc_w           1891051068
        //   762: goto            768
        //   765: ldc_w           1891051059
        //   768: ldc_w           1667589515
        //   771: ixor           
        //   772: tableswitch {
        //          665093998: 796
        //          665093999: 798
        //          default: 759
        //        }
        //   796: iconst_1       
        //   797: ireturn        
        //   798: iinc            5, 1
        //   801: goto            478
        //   804: iinc            4, 1
        //   807: goto            258
        //   810: iconst_0       
        //   811: ireturn        
        //   812: aconst_null    
        //   813: athrow         
        //   814: aconst_null    
        //   815: athrow         
        //   816: aconst_null    
        //   817: athrow         
        //   818: aconst_null    
        //   819: athrow         
        //   820: aconst_null    
        //   821: athrow         
        //   822: aconst_null    
        //   823: athrow         
        //   824: aconst_null    
        //   825: athrow         
        //   826: aconst_null    
        //   827: athrow         
        //   828: aconst_null    
        //   829: athrow         
        //   830: aconst_null    
        //   831: athrow         
        //   832: aconst_null    
        //   833: athrow         
        //   834: aconst_null    
        //   835: athrow         
        //   836: pop            
        //   837: goto            24
        //   840: pop            
        //   841: aconst_null    
        //   842: goto            836
        //   845: dup            
        //   846: ifnull          836
        //   849: checkcast       Ljava/lang/Throwable;
        //   852: athrow         
        //   853: dup            
        //   854: ifnull          840
        //   857: checkcast       Ljava/lang/Throwable;
        //   860: athrow         
        //   861: aconst_null    
        //   862: athrow         
        //    StackMapTable: 00 6E 43 07 00 12 04 FF 00 0B 00 00 00 01 07 00 12 FD 00 03 07 00 19 01 0A 41 01 1E 05 4E 03 FF 00 01 00 02 07 00 19 01 00 02 03 01 5C 03 49 03 FF 00 03 00 00 00 01 07 00 12 FF 00 00 00 02 07 00 19 01 00 02 03 07 00 19 45 07 00 12 FF 00 00 00 02 07 00 19 01 00 02 03 01 48 03 FF 00 02 00 02 07 00 19 01 00 02 03 03 4B 03 FF 00 01 00 02 07 00 19 01 00 02 03 01 5B 03 FF 00 07 00 03 07 00 19 01 03 00 01 07 00 78 40 03 45 07 00 12 40 01 4B 01 FF 00 02 00 03 07 00 19 01 03 00 02 01 01 5C 01 FC 00 01 01 FF 00 0E 00 04 07 00 19 01 03 01 00 02 01 07 00 19 FF 00 02 00 04 07 00 19 01 03 01 00 03 01 07 00 19 01 FF 00 1F 00 04 07 00 19 01 03 01 00 02 01 07 00 19 FF 00 0E 00 04 07 00 19 01 03 01 00 02 01 03 FF 00 02 00 04 07 00 19 01 03 01 00 03 01 03 01 FF 00 1D 00 04 07 00 19 01 03 01 00 02 01 03 42 07 00 12 FF 00 00 00 04 07 00 19 01 03 01 00 02 01 03 45 07 00 12 FF 00 00 00 04 07 00 19 01 03 01 00 02 01 01 52 03 FF 00 02 00 04 07 00 19 01 03 01 00 02 03 01 5E 03 FF 00 02 00 00 00 01 07 00 12 FF 00 00 00 04 07 00 19 01 03 01 00 01 03 45 07 00 12 40 01 4B 01 FF 00 02 00 04 07 00 19 01 03 01 00 02 01 01 5D 01 FC 00 01 01 4D 01 FF 00 02 00 05 07 00 19 01 03 01 01 00 02 01 01 5C 01 46 07 00 09 FF 00 00 00 05 07 00 19 01 03 01 01 00 02 01 03 45 07 00 12 FF 00 00 00 05 07 00 19 01 03 01 01 00 02 01 01 FF 00 15 00 05 07 00 19 01 03 01 01 00 04 08 02 1E 08 02 1E 01 03 FF 00 02 00 05 07 00 19 01 03 01 01 00 05 08 02 1E 08 02 1E 01 03 01 FF 00 1F 00 05 07 00 19 01 03 01 01 00 04 08 02 1E 08 02 1E 01 03 42 07 00 12 FF 00 00 00 05 07 00 19 01 03 01 01 00 04 08 02 1E 08 02 1E 01 03 45 07 00 12 FF 00 00 00 05 07 00 19 01 03 01 01 00 04 08 02 1E 08 02 1E 01 01 44 07 00 09 FF 00 00 00 05 07 00 19 01 03 01 01 00 05 08 02 1E 08 02 1E 01 01 01 45 07 00 12 40 07 00 83 FC 00 0D 07 00 83 42 01 1E FF 00 02 00 00 00 01 07 00 12 FF 00 00 00 06 07 00 19 01 03 01 01 07 00 83 00 00 45 07 00 12 40 07 00 BA 47 07 00 09 FF 00 00 00 06 07 00 19 01 03 01 01 07 00 83 00 02 07 01 28 07 00 83 45 07 00 12 40 07 01 31 4B 07 01 31 FF 00 02 00 06 07 00 19 01 03 01 01 07 00 83 00 02 07 01 31 01 5D 07 01 31 42 07 00 74 40 07 01 31 47 07 00 12 40 07 01 3C 05 05 42 01 1B 01 FA 00 05 FA 00 05 FF 00 01 00 05 07 00 19 01 03 01 01 00 04 08 02 1E 08 02 1E 01 03 FF 00 01 00 06 07 00 19 01 03 01 01 07 00 83 00 01 07 01 31 FF 00 01 00 02 07 00 19 01 00 00 FF 00 01 00 06 07 00 19 01 03 01 01 07 00 83 00 00 FF 00 01 00 04 07 00 19 01 03 01 00 02 01 03 FF 00 01 00 02 07 00 19 01 00 01 03 FF 00 01 00 05 07 00 19 01 03 01 01 00 01 01 FF 00 01 00 04 07 00 19 01 03 01 00 02 01 07 00 19 41 01 FF 00 01 00 02 07 00 19 01 00 01 03 FF 00 01 00 03 07 00 19 01 03 00 01 01 FF 00 01 00 04 07 00 19 01 03 01 00 01 03 FF 00 01 00 02 07 00 19 01 00 01 07 00 12 43 05 44 07 00 12 47 05 47 07 00 12
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     845    853    Ljava/lang/EnumConstantNotPresentException;
        //  845    853    845    853    Any
        //  861    863    3      8      Any
        //  135    141    141    142    Any
        //  135    141    3      8      Any
        //  135    141    141    142    Any
        //  135    141    141    142    Ljava/lang/ClassCastException;
        //  135    141    3      8      Ljava/util/NoSuchElementException;
        //  204    211    211    212    Any
        //  204    211    211    212    Ljava/util/NoSuchElementException;
        //  205    211    3      8      Ljava/lang/RuntimeException;
        //  204    211    204    205    Ljava/lang/NumberFormatException;
        //  204    211    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  359    366    366    367    Any
        //  360    366    3      8      Any
        //  360    366    359    360    Any
        //  359    366    366    367    Any
        //  360    366    366    367    Any
        //  424    430    430    431    Any
        //  424    430    430    431    Ljava/lang/EnumConstantNotPresentException;
        //  424    430    430    431    Any
        //  424    430    3      8      Any
        //  424    430    430    431    Any
        //  531    538    538    539    Any
        //  531    538    3      8      Any
        //  532    538    3      8      Ljava/lang/NullPointerException;
        //  532    538    531    532    Ljava/lang/ArithmeticException;
        //  532    538    531    532    Ljava/lang/NumberFormatException;
        //  599    606    606    607    Any
        //  600    606    599    600    Any
        //  599    606    606    607    Any
        //  599    606    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  599    606    606    607    Any
        //  612    619    619    620    Any
        //  612    619    3      8      Any
        //  612    619    612    613    Ljava/lang/NumberFormatException;
        //  612    619    612    613    Ljava/lang/NegativeArraySizeException;
        //  613    619    619    620    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  672    678    678    679    Any
        //  672    678    678    679    Any
        //  672    678    3      8      Any
        //  672    678    678    679    Any
        //  672    678    678    679    Any
        //  687    694    694    695    Any
        //  687    694    687    688    Ljava/lang/EnumConstantNotPresentException;
        //  687    694    3      8      Ljava/lang/IllegalStateException;
        //  688    694    687    688    Ljava/lang/UnsupportedOperationException;
        //  687    694    694    695    Any
        //  743    752    752    753    Any
        //  743    752    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  743    752    743    744    Ljava/util/NoSuchElementException;
        //  743    752    752    753    Any
        //  744    752    3      8      Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:599)
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
    
    public static double 0(final float n) {
        return fbS.7A(null, 347818076, n);
    }
    
    public static boolean 5(final Entity entity) {
        return fbS.hp(null, 1541059433, entity);
    }
    
    public static boolean 3(final Entity entity) {
        return fbS.hk(null, 1211872237, entity);
    }
    
    public static double c(final float n) {
        return fbS.7A(null, 347818077, n);
    }
    
    public static boolean 4(final Entity entity) {
        return fbS.hn(null, 171443994, entity);
    }
    
    public static Vec3d c(final Entity p0, final Vec3d p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          123
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            115
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            107
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: aload_1        
        //    26: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //    29: getstatic       dev/nuker/pyro/fc.1:I
        //    32: ifeq            41
        //    35: ldc_w           1197581918
        //    38: goto            44
        //    41: ldc_w           1816028877
        //    44: ldc_w           315858801
        //    47: ixor           
        //    48: lookupswitch {
        //          -1630929069: 41
        //          1437743407: 96
        //          default: 76
        //        }
        //    76: aload_1        
        //    77: getfield        net/minecraft/util/math/Vec3d.field_72448_b:D
        //    80: aload_1        
        //    81: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //    84: goto            88
        //    87: athrow         
        //    88: invokestatic    dev/nuker/pyro/fb8.c:(Lnet/minecraft/entity/Entity;DDD)Lnet/minecraft/util/math/Vec3d;
        //    91: goto            95
        //    94: athrow         
        //    95: areturn        
        //    96: aconst_null    
        //    97: athrow         
        //    98: pop            
        //    99: goto            24
        //   102: pop            
        //   103: aconst_null    
        //   104: goto            98
        //   107: dup            
        //   108: ifnull          98
        //   111: checkcast       Ljava/lang/Throwable;
        //   114: athrow         
        //   115: dup            
        //   116: ifnull          102
        //   119: checkcast       Ljava/lang/Throwable;
        //   122: athrow         
        //   123: aconst_null    
        //   124: athrow         
        //    StackMapTable: 00 11 43 07 00 12 04 FF 00 0B 00 00 00 01 07 00 12 FD 00 03 07 00 19 07 00 14 FF 00 10 00 02 07 00 19 07 00 14 00 02 07 00 19 03 FF 00 02 00 02 07 00 19 07 00 14 00 03 07 00 19 03 01 FF 00 1F 00 02 07 00 19 07 00 14 00 02 07 00 19 03 4A 07 00 12 FF 00 00 00 02 07 00 19 07 00 14 00 04 07 00 19 03 03 03 45 07 00 12 40 07 00 14 FF 00 00 00 02 07 00 19 07 00 14 00 02 07 00 19 03 41 07 00 12 43 05 44 07 00 12 47 05 47 07 00 12
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  8      20     107    115    Any
        //  107    115    107    115    Any
        //  123    125    3      8      Any
        //  87     94     94     95     Any
        //  88     94     3      8      Any
        //  87     94     3      8      Any
        //  88     94     87     88     Any
        //  87     94     3      8      Ljava/lang/IndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 41 out of bounds for length 41
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
    
    public static boolean 7(final Entity entity) {
        return fbS.hi(null, 1541595290, entity);
    }
    
    public static Vec3d 0(final Entity p0, final float p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          188
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            180
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            172
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: fload_1        
        //    26: goto            30
        //    29: athrow         
        //    30: invokestatic    dev/nuker/pyro/fb8.c:(Lnet/minecraft/entity/Entity;F)Lnet/minecraft/util/math/Vec3d;
        //    33: goto            37
        //    36: athrow         
        //    37: goto            41
        //    40: athrow         
        //    41: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    44: goto            48
        //    47: athrow         
        //    48: goto            52
        //    51: athrow         
        //    52: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //    55: goto            59
        //    58: athrow         
        //    59: checkcast       Ldev/nuker/pyro/mixin/RenderManagerAccessor;
        //    62: goto            66
        //    65: athrow         
        //    66: invokeinterface dev/nuker/pyro/mixin/RenderManagerAccessor.getRenderPosX:()D
        //    71: goto            75
        //    74: athrow         
        //    75: goto            79
        //    78: athrow         
        //    79: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    82: goto            86
        //    85: athrow         
        //    86: goto            90
        //    89: athrow         
        //    90: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //    93: goto            97
        //    96: athrow         
        //    97: checkcast       Ldev/nuker/pyro/mixin/RenderManagerAccessor;
        //   100: goto            104
        //   103: athrow         
        //   104: invokeinterface dev/nuker/pyro/mixin/RenderManagerAccessor.getRenderPosY:()D
        //   109: goto            113
        //   112: athrow         
        //   113: goto            117
        //   116: athrow         
        //   117: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   120: goto            124
        //   123: athrow         
        //   124: goto            128
        //   127: athrow         
        //   128: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //   131: goto            135
        //   134: athrow         
        //   135: checkcast       Ldev/nuker/pyro/mixin/RenderManagerAccessor;
        //   138: goto            142
        //   141: athrow         
        //   142: invokeinterface dev/nuker/pyro/mixin/RenderManagerAccessor.getRenderPosZ:()D
        //   147: goto            151
        //   150: athrow         
        //   151: goto            155
        //   154: athrow         
        //   155: invokevirtual   net/minecraft/util/math/Vec3d.func_178786_a:(DDD)Lnet/minecraft/util/math/Vec3d;
        //   158: goto            162
        //   161: athrow         
        //   162: areturn        
        //   163: pop            
        //   164: goto            24
        //   167: pop            
        //   168: aconst_null    
        //   169: goto            163
        //   172: dup            
        //   173: ifnull          163
        //   176: checkcast       Ljava/lang/Throwable;
        //   179: athrow         
        //   180: dup            
        //   181: ifnull          167
        //   184: checkcast       Ljava/lang/Throwable;
        //   187: athrow         
        //   188: aconst_null    
        //   189: athrow         
        //    StackMapTable: 00 35 43 07 00 12 04 FF 00 0B 00 00 00 01 07 00 12 FD 00 03 07 00 19 02 FF 00 04 00 00 00 01 07 00 12 FF 00 00 00 02 07 00 19 02 00 02 07 00 19 02 45 07 00 12 40 07 00 14 42 07 00 09 40 07 00 14 45 07 00 12 FF 00 00 00 02 07 00 19 02 00 02 07 00 14 07 00 BA 42 07 00 E6 FF 00 00 00 02 07 00 19 02 00 02 07 00 14 07 00 BA 45 07 00 12 FF 00 00 00 02 07 00 19 02 00 02 07 00 14 07 01 75 45 07 00 12 FF 00 00 00 02 07 00 19 02 00 02 07 00 14 07 01 65 47 07 00 12 FF 00 00 00 02 07 00 19 02 00 02 07 00 14 03 42 07 00 12 FF 00 00 00 02 07 00 19 02 00 02 07 00 14 03 45 07 00 12 FF 00 00 00 02 07 00 19 02 00 03 07 00 14 03 07 00 BA 42 07 00 12 FF 00 00 00 02 07 00 19 02 00 03 07 00 14 03 07 00 BA 45 07 00 12 FF 00 00 00 02 07 00 19 02 00 03 07 00 14 03 07 01 75 FF 00 05 00 00 00 01 07 00 12 FF 00 00 00 02 07 00 19 02 00 03 07 00 14 03 07 01 65 47 07 00 12 FF 00 00 00 02 07 00 19 02 00 03 07 00 14 03 03 42 07 00 12 FF 00 00 00 02 07 00 19 02 00 03 07 00 14 03 03 45 07 00 12 FF 00 00 00 02 07 00 19 02 00 04 07 00 14 03 03 07 00 BA 42 07 00 12 FF 00 00 00 02 07 00 19 02 00 04 07 00 14 03 03 07 00 BA 45 07 00 12 FF 00 00 00 02 07 00 19 02 00 04 07 00 14 03 03 07 01 75 FF 00 05 00 00 00 01 07 00 12 FF 00 00 00 02 07 00 19 02 00 04 07 00 14 03 03 07 01 65 47 07 00 12 FF 00 00 00 02 07 00 19 02 00 04 07 00 14 03 03 03 42 07 00 12 FF 00 00 00 02 07 00 19 02 00 04 07 00 14 03 03 03 45 07 00 12 40 07 00 14 40 07 00 12 43 05 44 07 00 12 47 05 47 07 00 12
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     172    180    Any
        //  172    180    172    180    Any
        //  188    190    3      8      Ljava/lang/UnsupportedOperationException;
        //  30     36     36     37     Any
        //  30     36     3      8      Any
        //  30     36     3      8      Any
        //  30     36     3      8      Any
        //  30     36     3      8      Ljava/lang/RuntimeException;
        //  40     47     47     48     Any
        //  40     47     40     41     Ljava/lang/IndexOutOfBoundsException;
        //  41     47     3      8      Any
        //  40     47     40     41     Ljava/lang/UnsupportedOperationException;
        //  41     47     47     48     Any
        //  51     58     58     59     Any
        //  52     58     51     52     Ljava/lang/NullPointerException;
        //  51     58     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  52     58     58     59     Ljava/lang/NegativeArraySizeException;
        //  52     58     3      8      Any
        //  65     74     74     75     Any
        //  66     74     65     66     Any
        //  65     74     65     66     Any
        //  66     74     74     75     Any
        //  65     74     3      8      Ljava/lang/ArithmeticException;
        //  78     85     85     86     Any
        //  79     85     78     79     Any
        //  78     85     78     79     Ljava/util/ConcurrentModificationException;
        //  79     85     78     79     Any
        //  79     85     3      8      Ljava/lang/IllegalStateException;
        //  89     96     96     97     Any
        //  89     96     3      8      Any
        //  90     96     96     97     Ljava/util/NoSuchElementException;
        //  90     96     89     90     Ljava/lang/EnumConstantNotPresentException;
        //  90     96     89     90     Any
        //  104    112    112    113    Any
        //  104    112    112    113    Any
        //  104    112    112    113    Ljava/lang/IndexOutOfBoundsException;
        //  104    112    112    113    Ljava/lang/ClassCastException;
        //  104    112    3      8      Any
        //  116    123    123    124    Any
        //  116    123    3      8      Any
        //  117    123    3      8      Any
        //  116    123    123    124    Any
        //  116    123    116    117    Any
        //  127    134    134    135    Any
        //  127    134    127    128    Ljava/util/ConcurrentModificationException;
        //  127    134    127    128    Any
        //  127    134    134    135    Ljava/lang/ClassCastException;
        //  128    134    3      8      Ljava/lang/UnsupportedOperationException;
        //  142    150    150    151    Any
        //  142    150    3      8      Any
        //  142    150    150    151    Ljava/lang/StringIndexOutOfBoundsException;
        //  142    150    3      8      Any
        //  142    150    150    151    Any
        //  154    161    161    162    Any
        //  155    161    161    162    Any
        //  155    161    154    155    Ljava/lang/EnumConstantNotPresentException;
        //  154    161    154    155    Any
        //  154    161    161    162    Any
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
    
    static {
        throw t;
    }
    
    public static boolean c(final EntityLivingBase entityLivingBase) {
        return fbS.hs(null, 1585373028, entityLivingBase);
    }
    
    public static boolean 2(final Entity entity) {
        return fbS.ho(null, 267137189, entity);
    }
    
    public static Vec3d c(final Entity p0, final double p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          163
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            155
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            147
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.0:I
        //    28: ifeq            37
        //    31: ldc_w           -927113764
        //    34: goto            40
        //    37: ldc_w           -556625237
        //    40: ldc_w           1221499345
        //    43: ixor           
        //    44: lookupswitch {
        //          -2139896819: 134
        //          -36798516: 37
        //          default: 72
        //        }
        //    72: dload_1        
        //    73: getstatic       dev/nuker/pyro/fc.c:I
        //    76: ifge            85
        //    79: ldc_w           -631021092
        //    82: goto            88
        //    85: ldc_w           -749420762
        //    88: ldc_w           -1342122186
        //    91: ixor           
        //    92: lookupswitch {
        //          1666476048: 120
        //          1784919786: 85
        //          default: 136
        //        }
        //   120: dload_1        
        //   121: dload_1        
        //   122: goto            126
        //   125: athrow         
        //   126: invokestatic    dev/nuker/pyro/fb8.c:(Lnet/minecraft/entity/Entity;DDD)Lnet/minecraft/util/math/Vec3d;
        //   129: goto            133
        //   132: athrow         
        //   133: areturn        
        //   134: aconst_null    
        //   135: athrow         
        //   136: aconst_null    
        //   137: athrow         
        //   138: pop            
        //   139: goto            24
        //   142: pop            
        //   143: aconst_null    
        //   144: goto            138
        //   147: dup            
        //   148: ifnull          138
        //   151: checkcast       Ljava/lang/Throwable;
        //   154: athrow         
        //   155: dup            
        //   156: ifnull          142
        //   159: checkcast       Ljava/lang/Throwable;
        //   162: athrow         
        //   163: aconst_null    
        //   164: athrow         
        //    StackMapTable: 00 15 43 07 00 12 04 FF 00 0B 00 00 00 01 07 00 12 FD 00 03 07 00 19 03 4C 07 00 19 FF 00 02 00 02 07 00 19 03 00 02 07 00 19 01 5F 07 00 19 FF 00 0C 00 02 07 00 19 03 00 02 07 00 19 03 FF 00 02 00 02 07 00 19 03 00 03 07 00 19 03 01 FF 00 1F 00 02 07 00 19 03 00 02 07 00 19 03 44 07 00 12 FF 00 00 00 02 07 00 19 03 00 04 07 00 19 03 03 03 45 07 00 12 40 07 00 14 40 07 00 19 FF 00 01 00 02 07 00 19 03 00 02 07 00 19 03 41 07 00 12 43 05 44 07 00 12 47 05 47 07 00 12
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     147    155    Ljava/lang/UnsupportedOperationException;
        //  147    155    147    155    Any
        //  163    165    3      8      Ljava/lang/ArithmeticException;
        //  125    132    132    133    Any
        //  125    132    132    133    Any
        //  125    132    3      8      Any
        //  125    132    125    126    Any
        //  125    132    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 55 out of bounds for length 55
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
    
    public static boolean 1(final Entity p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          459
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            451
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            443
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: ifnonnull       30
        //    28: iconst_0       
        //    29: ireturn        
        //    30: getstatic       dev/nuker/pyro/fc.1:I
        //    33: ifeq            42
        //    36: ldc_w           1493874824
        //    39: goto            45
        //    42: ldc_w           1142512376
        //    45: ldc_w           64515636
        //    48: ixor           
        //    49: lookupswitch {
        //          1523766972: 430
        //          1716057142: 42
        //          default: 76
        //        }
        //    76: aload_0        
        //    77: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //    80: ldc2_w          0.01
        //    83: dadd           
        //    84: getstatic       dev/nuker/pyro/fc.c:I
        //    87: ifge            96
        //    90: ldc_w           297488132
        //    93: goto            99
        //    96: ldc_w           1621725325
        //    99: ldc_w           -27954767
        //   102: ixor           
        //   103: lookupswitch {
        //          -1627594436: 128
        //          -269599051: 96
        //          default: 424
        //        }
        //   128: dstore_1       
        //   129: aload_0        
        //   130: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //   133: goto            137
        //   136: athrow         
        //   137: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   140: goto            144
        //   143: athrow         
        //   144: istore_3       
        //   145: getstatic       dev/nuker/pyro/fc.1:I
        //   148: ifeq            157
        //   151: ldc_w           1403940509
        //   154: goto            160
        //   157: ldc_w           -515399449
        //   160: ldc_w           -108793099
        //   163: ixor           
        //   164: lookupswitch {
        //          -1439851416: 432
        //          2135280602: 157
        //          default: 192
        //        }
        //   192: iload_3        
        //   193: aload_0        
        //   194: getstatic       dev/nuker/pyro/fc.1:I
        //   197: ifeq            206
        //   200: ldc_w           -1816002257
        //   203: goto            209
        //   206: ldc_w           2079367835
        //   209: ldc_w           933402676
        //   212: ixor           
        //   213: lookupswitch {
        //          -1558591574: 206
        //          -1537173221: 426
        //          default: 240
        //        }
        //   240: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //   243: goto            247
        //   246: athrow         
        //   247: invokestatic    net/minecraft/util/math/MathHelper.func_76143_f:(D)I
        //   250: goto            254
        //   253: athrow         
        //   254: if_icmpge       422
        //   257: aload_0        
        //   258: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   261: goto            265
        //   264: athrow         
        //   265: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   268: goto            272
        //   271: athrow         
        //   272: istore          4
        //   274: iload           4
        //   276: aload_0        
        //   277: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   280: goto            284
        //   283: athrow         
        //   284: invokestatic    net/minecraft/util/math/MathHelper.func_76143_f:(D)I
        //   287: goto            291
        //   290: athrow         
        //   291: if_icmpge       416
        //   294: new             Lnet/minecraft/util/math/BlockPos;
        //   297: dup            
        //   298: iload_3        
        //   299: dload_1        
        //   300: d2i            
        //   301: iload           4
        //   303: goto            307
        //   306: athrow         
        //   307: invokespecial   net/minecraft/util/math/BlockPos.<init>:(III)V
        //   310: goto            314
        //   313: athrow         
        //   314: astore          5
        //   316: goto            320
        //   319: athrow         
        //   320: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   323: goto            327
        //   326: athrow         
        //   327: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   330: getstatic       dev/nuker/pyro/fc.0:I
        //   333: ifeq            342
        //   336: ldc_w           98886027
        //   339: goto            345
        //   342: ldc_w           -689358877
        //   345: ldc_w           1402982707
        //   348: ixor           
        //   349: lookupswitch {
        //          662891330: 342
        //          1450913976: 428
        //          default: 376
        //        }
        //   376: aload           5
        //   378: goto            382
        //   381: athrow         
        //   382: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   385: goto            389
        //   388: athrow         
        //   389: goto            393
        //   392: athrow         
        //   393: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   398: goto            402
        //   401: athrow         
        //   402: instanceof      Lnet/minecraft/block/BlockLiquid;
        //   405: ifeq            410
        //   408: iconst_1       
        //   409: ireturn        
        //   410: iinc            4, 1
        //   413: goto            274
        //   416: iinc            3, 1
        //   419: goto            145
        //   422: iconst_0       
        //   423: ireturn        
        //   424: aconst_null    
        //   425: athrow         
        //   426: aconst_null    
        //   427: athrow         
        //   428: aconst_null    
        //   429: athrow         
        //   430: aconst_null    
        //   431: athrow         
        //   432: aconst_null    
        //   433: athrow         
        //   434: pop            
        //   435: goto            24
        //   438: pop            
        //   439: aconst_null    
        //   440: goto            434
        //   443: dup            
        //   444: ifnull          434
        //   447: checkcast       Ljava/lang/Throwable;
        //   450: athrow         
        //   451: dup            
        //   452: ifnull          438
        //   455: checkcast       Ljava/lang/Throwable;
        //   458: athrow         
        //   459: aconst_null    
        //   460: athrow         
        //    StackMapTable: 00 43 FF 00 03 00 02 07 00 19 03 00 01 07 00 12 FA 00 04 FF 00 0B 00 00 00 01 07 00 12 FC 00 03 07 00 19 05 0B 42 01 1E 53 03 FF 00 02 00 01 07 00 19 00 02 03 01 5C 03 FF 00 07 00 00 00 01 07 00 12 FF 00 00 00 02 07 00 19 03 00 01 03 45 07 00 12 40 01 FC 00 00 01 0B 42 01 1F FF 00 0D 00 03 07 00 19 03 01 00 02 01 07 00 19 FF 00 02 00 03 07 00 19 03 01 00 03 01 07 00 19 01 FF 00 1E 00 03 07 00 19 03 01 00 02 01 07 00 19 45 07 00 12 FF 00 00 00 03 07 00 19 03 01 00 02 01 03 45 07 00 12 FF 00 00 00 03 07 00 19 03 01 00 02 01 01 49 07 00 12 40 03 45 07 00 12 40 01 FC 00 01 01 48 07 00 12 FF 00 00 00 04 07 00 19 03 01 01 00 02 01 03 45 07 00 12 FF 00 00 00 04 07 00 19 03 01 01 00 02 01 01 4E 07 00 12 FF 00 00 00 04 07 00 19 03 01 01 00 05 08 01 26 08 01 26 01 01 01 45 07 00 12 40 07 00 83 FF 00 04 00 00 00 01 07 00 12 FF 00 00 00 05 07 00 19 03 01 01 07 00 83 00 00 45 07 00 12 40 07 00 BA 4E 07 01 28 FF 00 02 00 05 07 00 19 03 01 01 07 00 83 00 02 07 01 28 01 5E 07 01 28 44 07 00 12 FF 00 00 00 05 07 00 19 03 01 01 07 00 83 00 02 07 01 28 07 00 83 45 07 00 12 40 07 01 31 42 07 00 12 40 07 01 31 47 07 00 12 40 07 01 3C 07 FA 00 05 FA 00 05 FF 00 01 00 01 07 00 19 00 01 03 FF 00 01 00 03 07 00 19 03 01 00 02 01 07 00 19 FF 00 01 00 05 07 00 19 03 01 01 07 00 83 00 01 07 01 28 FF 00 01 00 01 07 00 19 00 00 FD 00 01 03 01 FF 00 01 00 01 07 00 19 00 01 07 00 12 43 05 44 07 00 12 47 05 FF 00 07 00 02 07 00 19 03 00 01 07 00 12
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  8      20     443    451    Any
        //  443    451    443    451    Any
        //  459    461    3      8      Any
        //  137    143    143    144    Any
        //  137    143    143    144    Ljava/lang/IllegalStateException;
        //  137    143    3      8      Any
        //  137    143    3      8      Any
        //  137    143    3      8      Any
        //  246    253    253    254    Any
        //  246    253    3      8      Any
        //  247    253    246    247    Any
        //  246    253    3      8      Ljava/lang/NegativeArraySizeException;
        //  247    253    3      8      Any
        //  264    271    271    272    Any
        //  265    271    264    265    Any
        //  264    271    3      8      Ljava/lang/NullPointerException;
        //  264    271    264    265    Ljava/lang/NegativeArraySizeException;
        //  264    271    264    265    Any
        //  283    290    290    291    Any
        //  284    290    283    284    Any
        //  284    290    283    284    Any
        //  283    290    290    291    Any
        //  284    290    3      8      Any
        //  306    313    313    314    Any
        //  306    313    3      8      Any
        //  306    313    3      8      Any
        //  307    313    306    307    Any
        //  307    313    313    314    Ljava/lang/RuntimeException;
        //  320    326    326    327    Any
        //  320    326    326    327    Ljava/lang/IllegalArgumentException;
        //  320    326    3      8      Any
        //  320    326    3      8      Any
        //  320    326    326    327    Any
        //  381    388    388    389    Any
        //  382    388    3      8      Ljava/lang/IllegalArgumentException;
        //  382    388    388    389    Any
        //  381    388    388    389    Any
        //  382    388    381    382    Any
        //  392    401    401    402    Any
        //  393    401    3      8      Any
        //  392    401    392    393    Any
        //  393    401    3      8      Ljava/util/NoSuchElementException;
        //  393    401    401    402    Any
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
    
    public static double[] c(final double p0, final double p1, final double p2, final EntityPlayer p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          627
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            619
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            611
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload           6
        //    26: getfield        net/minecraft/entity/player/EntityPlayer.field_70165_t:D
        //    29: dload_0        
        //    30: dsub           
        //    31: dstore          7
        //    33: aload           6
        //    35: getfield        net/minecraft/entity/player/EntityPlayer.field_70163_u:D
        //    38: dload_2        
        //    39: dsub           
        //    40: getstatic       dev/nuker/pyro/fc.0:I
        //    43: ifeq            52
        //    46: ldc_w           66869927
        //    49: goto            55
        //    52: ldc_w           -1214279401
        //    55: ldc_w           -1784706554
        //    58: ixor           
        //    59: lookupswitch {
        //          -1771843423: 588
        //          -1650319082: 52
        //          default: 84
        //        }
        //    84: dstore          9
        //    86: aload           6
        //    88: getfield        net/minecraft/entity/player/EntityPlayer.field_70161_v:D
        //    91: dload           4
        //    93: dsub           
        //    94: dstore          11
        //    96: dload           7
        //    98: getstatic       dev/nuker/pyro/fc.0:I
        //   101: ifeq            110
        //   104: ldc_w           1813481150
        //   107: goto            113
        //   110: ldc_w           -249447850
        //   113: ldc_w           1790090577
        //   116: ixor           
        //   117: lookupswitch {
        //          -1684855033: 144
        //          111483887: 110
        //          default: 600
        //        }
        //   144: dload           7
        //   146: dmul           
        //   147: dload           9
        //   149: dload           9
        //   151: dmul           
        //   152: dadd           
        //   153: dload           11
        //   155: dload           11
        //   157: dmul           
        //   158: dadd           
        //   159: goto            163
        //   162: athrow         
        //   163: invokestatic    java/lang/Math.sqrt:(D)D
        //   166: goto            170
        //   169: athrow         
        //   170: dstore          13
        //   172: dload           7
        //   174: dload           13
        //   176: ddiv           
        //   177: dstore          7
        //   179: dload           9
        //   181: dload           13
        //   183: ddiv           
        //   184: getstatic       dev/nuker/pyro/fc.c:I
        //   187: ifge            196
        //   190: ldc_w           -1730396292
        //   193: goto            199
        //   196: ldc_w           1274946878
        //   199: ldc_w           -1506560403
        //   202: ixor           
        //   203: lookupswitch {
        //          -305294509: 228
        //          1055885585: 196
        //          default: 596
        //        }
        //   228: dstore          9
        //   230: getstatic       dev/nuker/pyro/fc.0:I
        //   233: ifeq            242
        //   236: ldc_w           -1822087560
        //   239: goto            245
        //   242: ldc_w           356836764
        //   245: ldc_w           1940252350
        //   248: ixor           
        //   249: lookupswitch {
        //          -524238650: 242
        //          1726022434: 276
        //          default: 590
        //        }
        //   276: dload           11
        //   278: dload           13
        //   280: ddiv           
        //   281: dstore          11
        //   283: dload           9
        //   285: goto            289
        //   288: athrow         
        //   289: invokestatic    java/lang/Math.asin:(D)D
        //   292: goto            296
        //   295: athrow         
        //   296: getstatic       dev/nuker/pyro/fc.1:I
        //   299: ifeq            308
        //   302: ldc_w           1824768338
        //   305: goto            311
        //   308: ldc_w           371521165
        //   311: ldc_w           611450765
        //   314: ixor           
        //   315: lookupswitch {
        //          844433664: 340
        //          1219641055: 308
        //          default: 586
        //        }
        //   340: dstore          15
        //   342: dload           11
        //   344: getstatic       dev/nuker/pyro/fc.0:I
        //   347: ifeq            356
        //   350: ldc_w           -12548740
        //   353: goto            359
        //   356: ldc_w           720732193
        //   359: ldc_w           -424476451
        //   362: ixor           
        //   363: lookupswitch {
        //          -867794692: 388
        //          435389857: 356
        //          default: 592
        //        }
        //   388: dload           7
        //   390: goto            394
        //   393: athrow         
        //   394: invokestatic    java/lang/Math.atan2:(DD)D
        //   397: goto            401
        //   400: athrow         
        //   401: dstore          17
        //   403: dload           15
        //   405: ldc2_w          180.0
        //   408: dmul           
        //   409: ldc2_w          3.141592653589793
        //   412: ddiv           
        //   413: dstore          15
        //   415: getstatic       dev/nuker/pyro/fc.0:I
        //   418: ifeq            427
        //   421: ldc_w           1690355148
        //   424: goto            430
        //   427: ldc_w           -1359037896
        //   430: ldc_w           139964778
        //   433: ixor           
        //   434: lookupswitch {
        //          1821865126: 584
        //          1972447572: 427
        //          default: 460
        //        }
        //   460: dload           17
        //   462: ldc2_w          180.0
        //   465: dmul           
        //   466: ldc2_w          3.141592653589793
        //   469: ddiv           
        //   470: dstore          17
        //   472: dload           17
        //   474: ldc2_w          90.0
        //   477: dadd           
        //   478: getstatic       dev/nuker/pyro/fc.c:I
        //   481: ifge            490
        //   484: ldc_w           2112625568
        //   487: goto            493
        //   490: ldc_w           1830637049
        //   493: ldc_w           -2055205654
        //   496: ixor           
        //   497: lookupswitch {
        //          -392347373: 524
        //          -127133878: 490
        //          default: 598
        //        }
        //   524: dstore          17
        //   526: iconst_2       
        //   527: newarray        D
        //   529: dup            
        //   530: iconst_0       
        //   531: dload           17
        //   533: dastore        
        //   534: dup            
        //   535: iconst_1       
        //   536: getstatic       dev/nuker/pyro/fc.c:I
        //   539: ifge            548
        //   542: ldc_w           193894395
        //   545: goto            551
        //   548: ldc_w           -2043852332
        //   551: ldc_w           1164890109
        //   554: ixor           
        //   555: lookupswitch {
        //          -1018984919: 580
        //          1323325446: 548
        //          default: 594
        //        }
        //   580: dload           15
        //   582: dastore        
        //   583: areturn        
        //   584: aconst_null    
        //   585: athrow         
        //   586: aconst_null    
        //   587: athrow         
        //   588: aconst_null    
        //   589: athrow         
        //   590: aconst_null    
        //   591: athrow         
        //   592: aconst_null    
        //   593: athrow         
        //   594: aconst_null    
        //   595: athrow         
        //   596: aconst_null    
        //   597: athrow         
        //   598: aconst_null    
        //   599: athrow         
        //   600: aconst_null    
        //   601: athrow         
        //   602: pop            
        //   603: goto            24
        //   606: pop            
        //   607: aconst_null    
        //   608: goto            602
        //   611: dup            
        //   612: ifnull          602
        //   615: checkcast       Ljava/lang/Throwable;
        //   618: athrow         
        //   619: dup            
        //   620: ifnull          606
        //   623: checkcast       Ljava/lang/Throwable;
        //   626: athrow         
        //   627: aconst_null    
        //   628: athrow         
        //    StackMapTable: 00 39 FF 00 03 00 07 03 03 03 07 01 9B 03 03 03 00 01 07 00 12 F8 00 04 FF 00 0B 00 00 00 01 07 00 12 FF 00 03 00 04 03 03 03 07 01 9B 00 00 FF 00 1B 00 05 03 03 03 07 01 9B 03 00 01 03 FF 00 02 00 05 03 03 03 07 01 9B 03 00 02 03 01 5C 03 FF 00 19 00 07 03 03 03 07 01 9B 03 03 03 00 01 03 FF 00 02 00 07 03 03 03 07 01 9B 03 03 03 00 02 03 01 5E 03 51 07 00 12 40 03 45 07 00 12 40 03 FF 00 19 00 08 03 03 03 07 01 9B 03 03 03 03 00 01 03 FF 00 02 00 08 03 03 03 07 01 9B 03 03 03 03 00 02 03 01 5C 03 0D 42 01 1E 4B 07 00 12 40 03 45 07 00 12 40 03 4B 03 FF 00 02 00 08 03 03 03 07 01 9B 03 03 03 03 00 02 03 01 5C 03 FF 00 0F 00 09 03 03 03 07 01 9B 03 03 03 03 03 00 01 03 FF 00 02 00 09 03 03 03 07 01 9B 03 03 03 03 03 00 02 03 01 5C 03 44 07 00 12 FF 00 00 00 09 03 03 03 07 01 9B 03 03 03 03 03 00 02 03 03 45 07 00 12 40 03 FC 00 19 03 42 01 1D 5D 03 FF 00 02 00 0A 03 03 03 07 01 9B 03 03 03 03 03 03 00 02 03 01 5E 03 FF 00 17 00 0A 03 03 03 07 01 9B 03 03 03 03 03 03 00 03 07 01 CE 07 01 CE 01 FF 00 02 00 0A 03 03 03 07 01 9B 03 03 03 03 03 03 00 04 07 01 CE 07 01 CE 01 01 FF 00 1C 00 0A 03 03 03 07 01 9B 03 03 03 03 03 03 00 03 07 01 CE 07 01 CE 01 03 FF 00 01 00 08 03 03 03 07 01 9B 03 03 03 03 00 01 03 FF 00 01 00 05 03 03 03 07 01 9B 03 00 01 03 FE 00 01 03 03 03 FF 00 01 00 09 03 03 03 07 01 9B 03 03 03 03 03 00 01 03 FF 00 01 00 0A 03 03 03 07 01 9B 03 03 03 03 03 03 00 03 07 01 CE 07 01 CE 01 FF 00 01 00 08 03 03 03 07 01 9B 03 03 03 03 00 01 03 FF 00 01 00 0A 03 03 03 07 01 9B 03 03 03 03 03 03 00 01 03 FF 00 01 00 07 03 03 03 07 01 9B 03 03 03 00 01 03 FF 00 01 00 04 03 03 03 07 01 9B 00 01 07 00 12 43 05 44 07 00 12 47 05 FF 00 07 00 07 03 03 03 07 01 9B 03 03 03 00 01 07 00 12
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     611    619    Any
        //  611    619    611    619    Ljava/lang/StringIndexOutOfBoundsException;
        //  627    629    3      8      Ljava/util/NoSuchElementException;
        //  162    169    169    170    Any
        //  162    169    3      8      Any
        //  163    169    162    163    Any
        //  163    169    162    163    Any
        //  163    169    3      8      Any
        //  288    295    295    296    Any
        //  288    295    3      8      Ljava/lang/NumberFormatException;
        //  289    295    3      8      Any
        //  288    295    288    289    Any
        //  289    295    3      8      Ljava/lang/NullPointerException;
        //  393    400    400    401    Any
        //  393    400    393    394    Any
        //  394    400    393    394    Ljava/util/ConcurrentModificationException;
        //  394    400    393    394    Any
        //  393    400    3      8      Ljava/util/ConcurrentModificationException;
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
    
    public static boolean 9(final Entity entity) {
        return fbS.hh(null, 1566946954, entity);
    }
    
    public static boolean c(final Entity entity) {
        return fbS.hf(null, 2097471876, entity);
    }
}
