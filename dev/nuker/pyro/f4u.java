// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.EntityLivingBase;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.entity.Entity;

public class f4U extends fH
{
    public f0f<f4S> c;
    public f0d c;
    public f0f<f4T> 0;
    public f0g c;
    public f0a c;
    public f0a 0;
    public f0a 1;
    public f0a 2;
    public f0k c;
    public f0a 3;
    public f0a 4;
    public f0a 5;
    public f0a 6;
    public f0a 7;
    public f0a 8;
    public f0a 9;
    public f0a a;
    public f0k 0;
    public f0a b;
    public f0a d;
    public f0a e;
    public f0a f;
    public f0k 1;
    public float[] c;
    public fbu c;
    public Entity c;
    public Entity 0;
    public int 1;
    
    public boolean 2(final Entity entity) {
        return fbS.hk(this, 1211872236, entity);
    }
    
    @f06
    @LauncherEventHide
    public void c(final f3i f3i) {
        fbS.fn(this, 361034394, f3i);
    }
    
    @f06
    @LauncherEventHide
    public void c(final f3t f3t) {
        fbS.1s(this, 1903126168, f3t);
    }
    
    public static Float c(final EntityLivingBase p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          73
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            65
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            57
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   net/minecraft/entity/EntityLivingBase.func_110143_aJ:()F
        //    32: goto            36
        //    35: athrow         
        //    36: goto            40
        //    39: athrow         
        //    40: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    43: goto            47
        //    46: athrow         
        //    47: areturn        
        //    48: pop            
        //    49: goto            24
        //    52: pop            
        //    53: aconst_null    
        //    54: goto            48
        //    57: dup            
        //    58: ifnull          48
        //    61: checkcast       Ljava/lang/Throwable;
        //    64: athrow         
        //    65: dup            
        //    66: ifnull          52
        //    69: checkcast       Ljava/lang/Throwable;
        //    72: athrow         
        //    73: aconst_null    
        //    74: athrow         
        //    StackMapTable: 00 11 43 07 00 47 04 FF 00 0B 00 00 00 01 07 00 47 FC 00 03 07 00 49 43 07 00 3D 40 07 00 49 45 07 00 47 40 02 FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 01 07 00 49 00 01 02 45 07 00 47 40 07 00 4F 40 07 00 47 43 05 44 07 00 47 47 05 47 07 00 47
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     57     65     Any
        //  57     65     57     65     Any
        //  73     75     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  28     35     35     36     Any
        //  28     35     3      8      Ljava/util/ConcurrentModificationException;
        //  28     35     28     29     Ljava/lang/StringIndexOutOfBoundsException;
        //  28     35     35     36     Any
        //  28     35     35     36     Ljava/lang/AssertionError;
        //  40     46     46     47     Any
        //  40     46     3      8      Any
        //  40     46     46     47     Ljava/lang/IllegalStateException;
        //  40     46     46     47     Any
        //  40     46     3      8      Ljava/lang/StringIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 23 out of bounds for length 23
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
    
    public boolean 7(final Entity entity) {
        return fbS.hi(this, 1541595289, entity);
    }
    
    public Float 4(final Entity entity) {
        return fbS.4S(this, 1015701696, entity);
    }
    
    public Float 1(final Entity entity) {
        return fbS.4S(this, 1015701759, entity);
    }
    
    public boolean c() {
        return fbS.eq(this, 979229097);
    }
    
    public Float 6(final Entity entity) {
        return fbS.4R(this, 807787146, entity);
    }
    
    @f06
    @LauncherEventHide
    public void c(final f30 f30) {
        fbS.7j(this, 48374358, f30);
    }
    
    public boolean 8(final Entity entity) {
        return fbS.hr(this, 814237152, entity);
    }
    
    public boolean 3(final Entity entity) {
        return fbS.hq(this, 128694459, entity);
    }
    
    static {
        throw t;
    }
    
    public boolean 0(final Entity entity) {
        return fbS.hh(this, 1566946953, entity);
    }
    
    public Float c(final Entity entity) {
        return fbS.4R(this, 807787147, entity);
    }
    
    public static EntityLivingBase 5(final Entity p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.c:I
        //     4: iflt            84
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            76
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: getstatic       dev/nuker/pyro/fc.c:I
        //    19: ifge            27
        //    22: ldc             -2102033721
        //    24: goto            29
        //    27: ldc             1632933670
        //    29: ldc             -1761827870
        //    31: ixor           
        //    32: lookupswitch {
        //          -2132890555: 27
        //          340336933: 65
        //          default: 60
        //        }
        //    60: aload_0        
        //    61: checkcast       Lnet/minecraft/entity/EntityLivingBase;
        //    64: areturn        
        //    65: aconst_null    
        //    66: athrow         
        //    67: pop            
        //    68: goto            16
        //    71: pop            
        //    72: aconst_null    
        //    73: goto            67
        //    76: dup            
        //    77: ifnull          67
        //    80: checkcast       Ljava/lang/Throwable;
        //    83: athrow         
        //    84: dup            
        //    85: ifnull          71
        //    88: checkcast       Ljava/lang/Throwable;
        //    91: athrow         
        //    StackMapTable: 00 0A FF 00 0C 00 00 00 01 07 00 47 FC 00 03 07 00 85 0A 41 01 1E 04 41 07 00 47 43 05 44 07 00 47 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     76     84     Any
        //  76     84     76     84     Any
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
    
    public f4U() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u2382\u1486\u8a88\ub3d8"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u23a2\u1486\u8a88\ub3d8"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: ldc             "\u23a2\u1487\u8a8e\ub3d8\uc9c3\ued8e\ub237\ue6f7\ud97b\ue9b6\ua749\u1e49\ue190\uc5b3\u8135\u891c\u57a8\u7777\ubd7d\uc00a\u2b7f\uc23e\u6a77\u2d5f\ud7d4\u35f5\u7d6b\u89d0\u801f\u8cd4\u84d1\ufb33\u70ab\u9a11\u1b83"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    19: aload_0        
        //    20: new             Ldev/nuker/pyro/f0f;
        //    23: dup            
        //    24: ldc             "\u238e\u149c\u8a9e\ub3dc"
        //    26: invokestatic    invokestatic   !!! ERROR
        //    29: ldc             "\u23ae\u149c\u8a9e\ub3dc"
        //    31: invokestatic    invokestatic   !!! ERROR
        //    34: aconst_null    
        //    35: getstatic       dev/nuker/pyro/f4S.c:Ldev/nuker/pyro/f4S;
        //    38: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //    41: putfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0f;
        //    44: aload_0        
        //    45: new             Ldev/nuker/pyro/f0d;
        //    48: dup            
        //    49: ldc             "\u2387\u149a\u8a89\ub3cd\uc9c1\ued8b\ub227\ue6b2"
        //    51: getstatic       dev/nuker/pyro/fc.1:I
        //    54: ifeq            62
        //    57: ldc             1026744852
        //    59: goto            64
        //    62: ldc             2030964263
        //    64: ldc             -2032164172
        //    66: ixor           
        //    67: lookupswitch {
        //          -1142079328: 2940
        //          422799630: 62
        //          default: 92
        //        }
        //    92: invokestatic    invokestatic   !!! ERROR
        //    95: ldc             "\u23a7\u149a\u8a89\ub3cd\uc9c1\ued8b\ub227\ue6b2"
        //    97: invokestatic    invokestatic   !!! ERROR
        //   100: aconst_null    
        //   101: ldc2_w          6.0
        //   104: dconst_0       
        //   105: ldc2_w          6.0
        //   108: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   111: putfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0d;
        //   114: aload_0        
        //   115: new             Ldev/nuker/pyro/f0f;
        //   118: dup            
        //   119: ldc             "\u2390\u1484\u8a93\ub3cd\uc9c3\ued8d\ub209\ue6b8\ud96c\ue9b6"
        //   121: invokestatic    invokestatic   !!! ERROR
        //   124: ldc             "\u23b0\u1484\u8a93\ub3cd\uc9c3\ued8d"
        //   126: getstatic       dev/nuker/pyro/fc.1:I
        //   129: ifeq            137
        //   132: ldc             1595996461
        //   134: goto            139
        //   137: ldc             -542897451
        //   139: ldc             149893714
        //   141: ixor           
        //   142: lookupswitch {
        //          -1260379033: 137
        //          1473235839: 2954
        //          default: 168
        //        }
        //   168: invokestatic    invokestatic   !!! ERROR
        //   171: aconst_null    
        //   172: getstatic       dev/nuker/pyro/f4T.1:Ldev/nuker/pyro/f4T;
        //   175: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   178: putfield        dev/nuker/pyro/f4U.0:Ldev/nuker/pyro/f0f;
        //   181: getstatic       dev/nuker/pyro/fc.c:I
        //   184: ifge            192
        //   187: ldc             2145226245
        //   189: goto            194
        //   192: ldc             868091668
        //   194: ldc             -929918718
        //   196: ixor           
        //   197: lookupswitch {
        //          -1219551481: 192
        //          -80964074: 224
        //          default: 2942
        //        }
        //   224: aload_0        
        //   225: new             Ldev/nuker/pyro/f0g;
        //   228: dup            
        //   229: ldc             "\u23a2\u14a3\u8aa9"
        //   231: getstatic       dev/nuker/pyro/fc.c:I
        //   234: ifge            242
        //   237: ldc             876629720
        //   239: goto            244
        //   242: ldc             -699684821
        //   244: ldc             151603059
        //   246: ixor           
        //   247: lookupswitch {
        //          -549261480: 272
        //          1028196779: 242
        //          default: 2986
        //        }
        //   272: invokestatic    invokestatic   !!! ERROR
        //   275: ldc             "\u23a2\u14a3\u8aa9"
        //   277: invokestatic    invokestatic   !!! ERROR
        //   280: ldc             "\u23a2\u1487\u8a8e\ub3d8\uc9c3\ued8e\ub237\ue6f7\ud978\ue9b6\ua757\u1e0c\ue180\uc5a2\u8137\u8911\u57aa\u7776\ubd7d\uc018\u2b78\uc22f\u6a72\u2d16\ud7d9\u35ef\u7d3f\u89dd\u8014\u8c98\u84c2\ufb2b\u70e5\u9a19\u1b80\uf102"
        //   282: invokestatic    invokestatic   !!! ERROR
        //   285: bipush          8
        //   287: iconst_0       
        //   288: bipush          20
        //   290: invokespecial   dev/nuker/pyro/f0g.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V
        //   293: putfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0g;
        //   296: aload_0        
        //   297: new             Ldev/nuker/pyro/f0a;
        //   300: dup            
        //   301: ldc             "\u238b\u149a\u8a8e\ub3fd\uc9c5\ued89\ub225\ue6ae"
        //   303: getstatic       dev/nuker/pyro/fc.c:I
        //   306: ifge            314
        //   309: ldc             1973207636
        //   311: goto            316
        //   314: ldc             279131293
        //   316: ldc             -1511596718
        //   318: ixor           
        //   319: lookupswitch {
        //          -1253709361: 344
        //          -797303034: 314
        //          default: 2930
        //        }
        //   344: invokestatic    invokestatic   !!! ERROR
        //   347: ldc             "\u23ab\u149a\u8a8e\ub3fd\uc9c5\ued89\ub225\ue6ae"
        //   349: invokestatic    invokestatic   !!! ERROR
        //   352: aconst_null    
        //   353: iconst_1       
        //   354: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   357: putfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0a;
        //   360: aload_0        
        //   361: new             Ldev/nuker/pyro/f0a;
        //   364: dup            
        //   365: ldc             "\u2397\u149b\u8a88\ub3d6\uc9d5\ued82\ub22c\ue680\ud969\ue9bf\ua749\u1e5f"
        //   367: invokestatic    invokestatic   !!! ERROR
        //   370: ldc             "\u23b7\u149b\u8a88\ub3d6\uc9d5\ued82\ub22c\ue6f7\ud95f\ue9b2\ua749\u1e40\ue180"
        //   372: invokestatic    invokestatic   !!! ERROR
        //   375: aconst_null    
        //   376: iconst_1       
        //   377: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   380: putfield        dev/nuker/pyro/f4U.0:Ldev/nuker/pyro/f0a;
        //   383: aload_0        
        //   384: new             Ldev/nuker/pyro/f0a;
        //   387: dup            
        //   388: ldc             "\u2397\u1483\u8a89\ub3ea\uc9d9\ued8b\ub227"
        //   390: invokestatic    invokestatic   !!! ERROR
        //   393: ldc             "\u23b7\u14a3\u8aa9\ub3ea\uc9d9\ued8b\ub227"
        //   395: invokestatic    invokestatic   !!! ERROR
        //   398: aconst_null    
        //   399: iconst_1       
        //   400: getstatic       dev/nuker/pyro/fc.1:I
        //   403: ifeq            411
        //   406: ldc             1317517922
        //   408: goto            413
        //   411: ldc             307794607
        //   413: ldc             -834867031
        //   415: ixor           
        //   416: lookupswitch {
        //          -2135209269: 2966
        //          -1438881861: 411
        //          default: 444
        //        }
        //   444: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   447: putfield        dev/nuker/pyro/f4U.1:Ldev/nuker/pyro/f0a;
        //   450: aload_0        
        //   451: new             Ldev/nuker/pyro/f0a;
        //   454: dup            
        //   455: ldc             "\u2382\u1486\u8a8e\ub3d6\uc9e2\ued89\ub22b\ue6b4\ud963"
        //   457: invokestatic    invokestatic   !!! ERROR
        //   460: ldc             "\u23a2\u1486\u8a8e\ub3d6\uc9e2\ued89\ub22b\ue6b4\ud963"
        //   462: invokestatic    invokestatic   !!! ERROR
        //   465: aconst_null    
        //   466: iconst_1       
        //   467: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   470: getstatic       dev/nuker/pyro/fc.1:I
        //   473: ifeq            481
        //   476: ldc             -534887567
        //   478: goto            483
        //   481: ldc             -2036837226
        //   483: ldc             564463783
        //   485: ixor           
        //   486: lookupswitch {
        //          -1489150927: 512
        //          -1044689962: 481
        //          default: 2974
        //        }
        //   512: putfield        dev/nuker/pyro/f4U.2:Ldev/nuker/pyro/f0a;
        //   515: aload_0        
        //   516: new             Ldev/nuker/pyro/f0k;
        //   519: dup            
        //   520: new             Ldev/nuker/pyro/f0e;
        //   523: dup            
        //   524: ldc_w           "\u23ac\u1483\u8a8e\ub3d0\uc9cf\ued8b\ub237"
        //   527: getstatic       dev/nuker/pyro/fc.1:I
        //   530: ifeq            539
        //   533: ldc_w           1082841245
        //   536: goto            542
        //   539: ldc_w           585948143
        //   542: ldc_w           766689535
        //   545: ixor           
        //   546: lookupswitch {
        //          257825552: 572
        //          1832392802: 539
        //          default: 2948
        //        }
        //   572: invokestatic    invokestatic   !!! ERROR
        //   575: ldc_w           "\u23ac\u1483\u8a8e\ub3d0\uc9cf\ued8b\ub237"
        //   578: invokestatic    invokestatic   !!! ERROR
        //   581: ldc_w           "\u23a6\u1497\u8a93\ub3cd\uc980\ued88\ub225\ue6be\ud966\ue9f3\ua74a\u1e5c\ue187\uc5ae\u813b\u8910\u57b7\u7732\ubd32\uc009\u2b31\uc21a\u6a6f\u2d44\ud7d0"
        //   584: invokestatic    invokestatic   !!! ERROR
        //   587: getstatic       dev/nuker/pyro/fc.1:I
        //   590: ifeq            599
        //   593: ldc_w           1216079272
        //   596: goto            602
        //   599: ldc_w           -1467271419
        //   602: ldc_w           -478253245
        //   605: ixor           
        //   606: lookupswitch {
        //          -1425700117: 599
        //          1274370118: 632
        //          default: 2918
        //        }
        //   632: invokespecial   dev/nuker/pyro/f0e.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   635: iconst_5       
        //   636: anewarray       Ldev/nuker/pyro/f0n;
        //   639: dup            
        //   640: iconst_0       
        //   641: getstatic       dev/nuker/pyro/fc.0:I
        //   644: ifeq            653
        //   647: ldc_w           -1864907408
        //   650: goto            656
        //   653: ldc_w           688687818
        //   656: ldc_w           -487998029
        //   659: ixor           
        //   660: lookupswitch {
        //          -1954262918: 653
        //          1916696771: 3002
        //          default: 688
        //        }
        //   688: aload_0        
        //   689: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0a;
        //   692: aastore        
        //   693: dup            
        //   694: iconst_1       
        //   695: aload_0        
        //   696: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0g;
        //   699: aastore        
        //   700: dup            
        //   701: iconst_2       
        //   702: getstatic       dev/nuker/pyro/fc.c:I
        //   705: ifge            714
        //   708: ldc_w           -796183380
        //   711: goto            717
        //   714: ldc_w           -1003150240
        //   717: ldc_w           1163127808
        //   720: ixor           
        //   721: lookupswitch {
        //          -1780950868: 3000
        //          718405060: 714
        //          default: 748
        //        }
        //   748: aload_0        
        //   749: getstatic       dev/nuker/pyro/fc.c:I
        //   752: ifge            761
        //   755: ldc_w           1253477048
        //   758: goto            764
        //   761: ldc_w           195791046
        //   764: ldc_w           1207690588
        //   767: ixor           
        //   768: lookupswitch {
        //          27891992: 761
        //          223178724: 3004
        //          default: 796
        //        }
        //   796: getfield        dev/nuker/pyro/f4U.0:Ldev/nuker/pyro/f0a;
        //   799: aastore        
        //   800: dup            
        //   801: iconst_3       
        //   802: aload_0        
        //   803: getfield        dev/nuker/pyro/f4U.1:Ldev/nuker/pyro/f0a;
        //   806: aastore        
        //   807: dup            
        //   808: iconst_4       
        //   809: getstatic       dev/nuker/pyro/fc.1:I
        //   812: ifeq            821
        //   815: ldc_w           -1163321460
        //   818: goto            824
        //   821: ldc_w           -1975442408
        //   824: ldc_w           1318396173
        //   827: ixor           
        //   828: lookupswitch {
        //          -992738027: 856
        //          -197378431: 821
        //          default: 2964
        //        }
        //   856: aload_0        
        //   857: getfield        dev/nuker/pyro/f4U.2:Ldev/nuker/pyro/f0a;
        //   860: aastore        
        //   861: invokespecial   dev/nuker/pyro/f0k.<init>:(Ldev/nuker/pyro/f0n;[Ldev/nuker/pyro/f0n;)V
        //   864: putfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0k;
        //   867: aload_0        
        //   868: new             Ldev/nuker/pyro/f0a;
        //   871: dup            
        //   872: ldc_w           "\u2393\u1481\u8a95\ub3d3\uc9c5\ued86\ub230\ue6be\ud964\ue9b6\ua756"
        //   875: invokestatic    invokestatic   !!! ERROR
        //   878: ldc_w           "\u23b3\u1481\u8a95\ub3d3\uc9c5\ued86\ub230\ue6be\ud964\ue9b6\ua756"
        //   881: getstatic       dev/nuker/pyro/fc.1:I
        //   884: ifeq            893
        //   887: ldc_w           667864330
        //   890: goto            896
        //   893: ldc_w           -850549186
        //   896: ldc_w           -1425354058
        //   899: ixor           
        //   900: lookupswitch {
        //          -1933303876: 893
        //          1715958920: 928
        //          default: 2980
        //        }
        //   928: invokestatic    invokestatic   !!! ERROR
        //   931: aconst_null    
        //   932: iconst_1       
        //   933: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   936: putfield        dev/nuker/pyro/f4U.3:Ldev/nuker/pyro/f0a;
        //   939: getstatic       dev/nuker/pyro/fc.c:I
        //   942: ifge            951
        //   945: ldc_w           -803783132
        //   948: goto            954
        //   951: ldc_w           -1709305316
        //   954: ldc_w           2099038186
        //   957: ixor           
        //   958: lookupswitch {
        //          -1391724082: 951
        //          -419244554: 984
        //          default: 2976
        //        }
        //   984: aload_0        
        //   985: new             Ldev/nuker/pyro/f0a;
        //   988: dup            
        //   989: ldc_w           "\u2393\u149f\u8a9b\ub3c0\uc9c5\ued97\ub237"
        //   992: invokestatic    invokestatic   !!! ERROR
        //   995: ldc_w           "\u23b3\u149f\u8a9b\ub3c0\uc9c5\ued97\ub237"
        //   998: getstatic       dev/nuker/pyro/fc.c:I
        //  1001: ifge            1010
        //  1004: ldc_w           -891182048
        //  1007: goto            1013
        //  1010: ldc_w           1084350894
        //  1013: ldc_w           -158274162
        //  1016: ixor           
        //  1017: lookupswitch {
        //          -1069046642: 1010
        //          1014057390: 2990
        //          default: 1044
        //        }
        //  1044: invokestatic    invokestatic   !!! ERROR
        //  1047: aconst_null    
        //  1048: iconst_1       
        //  1049: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  1052: putfield        dev/nuker/pyro/f4U.4:Ldev/nuker/pyro/f0a;
        //  1055: getstatic       dev/nuker/pyro/fc.c:I
        //  1058: ifge            1067
        //  1061: ldc_w           -1226426797
        //  1064: goto            1070
        //  1067: ldc_w           -1127757445
        //  1070: ldc_w           -745367501
        //  1073: ixor           
        //  1074: lookupswitch {
        //          -951987957: 1067
        //          1702145632: 2944
        //          default: 1100
        //        }
        //  1100: aload_0        
        //  1101: new             Ldev/nuker/pyro/f0a;
        //  1104: dup            
        //  1105: ldc_w           "\u238e\u149c\u8a94\ub3ca\uc9d4\ued80\ub236\ue6a4"
        //  1108: getstatic       dev/nuker/pyro/fc.1:I
        //  1111: ifeq            1120
        //  1114: ldc_w           537149596
        //  1117: goto            1123
        //  1120: ldc_w           842295273
        //  1123: ldc_w           -1650105629
        //  1126: ixor           
        //  1127: lookupswitch {
        //          -1113513345: 2932
        //          208556677: 1120
        //          default: 1152
        //        }
        //  1152: invokestatic    invokestatic   !!! ERROR
        //  1155: ldc_w           "\u23ae\u149c\u8a94\ub3ca\uc9d4\ued80\ub236\ue6a4"
        //  1158: getstatic       dev/nuker/pyro/fc.1:I
        //  1161: ifeq            1170
        //  1164: ldc_w           -886711643
        //  1167: goto            1173
        //  1170: ldc_w           1968356451
        //  1173: ldc_w           -198755542
        //  1176: ixor           
        //  1177: lookupswitch {
        //          937531721: 1170
        //          1057153423: 2924
        //          default: 1204
        //        }
        //  1204: invokestatic    invokestatic   !!! ERROR
        //  1207: aconst_null    
        //  1208: iconst_1       
        //  1209: getstatic       dev/nuker/pyro/fc.c:I
        //  1212: ifge            1221
        //  1215: ldc_w           -1610606584
        //  1218: goto            1224
        //  1221: ldc_w           -1557378007
        //  1224: ldc_w           -993254760
        //  1227: ixor           
        //  1228: lookupswitch {
        //          1691105936: 1221
        //          1742761649: 1256
        //          default: 2978
        //        }
        //  1256: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  1259: putfield        dev/nuker/pyro/f4U.5:Ldev/nuker/pyro/f0a;
        //  1262: aload_0        
        //  1263: new             Ldev/nuker/pyro/f0a;
        //  1266: dup            
        //  1267: ldc_w           "\u238d\u1496\u8a8f\ub3cd\uc9d2\ued84\ub228\ue6a4"
        //  1270: invokestatic    invokestatic   !!! ERROR
        //  1273: ldc_w           "\u23ad\u1496\u8a8f\ub3cd\uc9d2\ued84\ub228\ue6a4"
        //  1276: getstatic       dev/nuker/pyro/fc.0:I
        //  1279: ifeq            1288
        //  1282: ldc_w           1805679552
        //  1285: goto            1291
        //  1288: ldc_w           -1761738353
        //  1291: ldc_w           -1242843321
        //  1294: ixor           
        //  1295: lookupswitch {
        //          -1177442007: 1288
        //          -565457785: 2934
        //          default: 1320
        //        }
        //  1320: invokestatic    invokestatic   !!! ERROR
        //  1323: aconst_null    
        //  1324: iconst_1       
        //  1325: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  1328: putfield        dev/nuker/pyro/f4U.6:Ldev/nuker/pyro/f0a;
        //  1331: aload_0        
        //  1332: new             Ldev/nuker/pyro/f0a;
        //  1335: dup            
        //  1336: ldc_w           "\u2382\u149d\u8a93\ub3d4\uc9c1\ued89\ub237"
        //  1339: invokestatic    invokestatic   !!! ERROR
        //  1342: ldc_w           "\u23a2\u149d\u8a93\ub3d4\uc9c1\ued89\ub237"
        //  1345: invokestatic    invokestatic   !!! ERROR
        //  1348: aconst_null    
        //  1349: iconst_1       
        //  1350: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  1353: putfield        dev/nuker/pyro/f4U.7:Ldev/nuker/pyro/f0a;
        //  1356: aload_0        
        //  1357: new             Ldev/nuker/pyro/f0a;
        //  1360: dup            
        //  1361: ldc_w           "\u2397\u1492\u8a97\ub3dc\uc9c4"
        //  1364: invokestatic    invokestatic   !!! ERROR
        //  1367: ldc_w           "\u23b7\u1492\u8a97\ub3dc\uc9c4"
        //  1370: invokestatic    invokestatic   !!! ERROR
        //  1373: aconst_null    
        //  1374: iconst_0       
        //  1375: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  1378: putfield        dev/nuker/pyro/f4U.8:Ldev/nuker/pyro/f0a;
        //  1381: getstatic       dev/nuker/pyro/fc.1:I
        //  1384: ifeq            1393
        //  1387: ldc_w           99279490
        //  1390: goto            1396
        //  1393: ldc_w           198258680
        //  1396: ldc_w           1282216855
        //  1399: ixor           
        //  1400: lookupswitch {
        //          -596617134: 1393
        //          1233645845: 2972
        //          default: 1428
        //        }
        //  1428: aload_0        
        //  1429: new             Ldev/nuker/pyro/f0a;
        //  1432: dup            
        //  1433: ldc_w           "\u2390\u149b\u8a8f\ub3d5\uc9cb\ued80\ub236\ue6a4"
        //  1436: invokestatic    invokestatic   !!! ERROR
        //  1439: ldc_w           "\u23b0\u149b\u8a8f\ub3d5\uc9cb\ued80\ub236\ue6a4"
        //  1442: invokestatic    invokestatic   !!! ERROR
        //  1445: aconst_null    
        //  1446: iconst_1       
        //  1447: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  1450: putfield        dev/nuker/pyro/f4U.9:Ldev/nuker/pyro/f0a;
        //  1453: aload_0        
        //  1454: new             Ldev/nuker/pyro/f0a;
        //  1457: dup            
        //  1458: ldc_w           "\u2382\u1481\u8a97\ub3d6\uc9d2\ueda6\ub22c\ue6b2\ud96b\ue9b8"
        //  1461: invokestatic    invokestatic   !!! ERROR
        //  1464: ldc_w           "\u23a2\u1481\u8a97\ub3d6\uc9d2\ueda6\ub22c\ue6b2\ud96b\ue9b8"
        //  1467: getstatic       dev/nuker/pyro/fc.1:I
        //  1470: ifeq            1479
        //  1473: ldc_w           773214115
        //  1476: goto            1482
        //  1479: ldc_w           -1202845537
        //  1482: ldc_w           -1384292307
        //  1485: ixor           
        //  1486: lookupswitch {
        //          -2090127474: 2946
        //          -1742934981: 1479
        //          default: 1512
        //        }
        //  1512: invokestatic    invokestatic   !!! ERROR
        //  1515: aconst_null    
        //  1516: iconst_0       
        //  1517: getstatic       dev/nuker/pyro/fc.1:I
        //  1520: ifeq            1529
        //  1523: ldc_w           833523170
        //  1526: goto            1532
        //  1529: ldc_w           -1768517655
        //  1532: ldc_w           -1093331710
        //  1535: ixor           
        //  1536: lookupswitch {
        //          -1887725344: 2950
        //          961384466: 1529
        //          default: 1564
        //        }
        //  1564: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  1567: putfield        dev/nuker/pyro/f4U.a:Ldev/nuker/pyro/f0a;
        //  1570: aload_0        
        //  1571: new             Ldev/nuker/pyro/f0k;
        //  1574: dup            
        //  1575: new             Ldev/nuker/pyro/f0e;
        //  1578: dup            
        //  1579: ldc_w           "\u2397\u1492\u8a88\ub3de\uc9c5\ued91\ub22d\ue6b9\ud96f"
        //  1582: getstatic       dev/nuker/pyro/fc.1:I
        //  1585: ifeq            1594
        //  1588: ldc_w           199720221
        //  1591: goto            1597
        //  1594: ldc_w           77168416
        //  1597: ldc_w           1817590561
        //  1600: ixor           
        //  1601: lookupswitch {
        //          1739671100: 1594
        //          1758413825: 1628
        //          default: 2992
        //        }
        //  1628: invokestatic    invokestatic   !!! ERROR
        //  1631: ldc_w           "\u23b7\u1492\u8a88\ub3de\uc9c5\ued91\ub22d\ue6b9\ud96f"
        //  1634: invokestatic    invokestatic   !!! ERROR
        //  1637: ldc_w           "\u23a6\u1497\u8a93\ub3cd\uc980\ued91\ub225\ue6a5\ud96f\ue9b6\ua751\u1e45\ue19d\uc5a0\u8174\u8918\u57ab\u7760\ubd7d\uc02e\u2b64\uc229\u6a7b"
        //  1640: invokestatic    invokestatic   !!! ERROR
        //  1643: getstatic       dev/nuker/pyro/fc.0:I
        //  1646: ifeq            1655
        //  1649: ldc_w           -1218243676
        //  1652: goto            1658
        //  1655: ldc_w           -1583329930
        //  1658: ldc_w           -1063046233
        //  1661: ixor           
        //  1662: lookupswitch {
        //          1627619025: 1688
        //          2009079811: 1655
        //          default: 2960
        //        }
        //  1688: invokespecial   dev/nuker/pyro/f0e.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //  1691: bipush          8
        //  1693: anewarray       Ldev/nuker/pyro/f0n;
        //  1696: dup            
        //  1697: iconst_0       
        //  1698: aload_0        
        //  1699: getstatic       dev/nuker/pyro/fc.c:I
        //  1702: ifge            1711
        //  1705: ldc_w           -1560974858
        //  1708: goto            1714
        //  1711: ldc_w           -2041140506
        //  1714: ldc_w           499452471
        //  1717: ixor           
        //  1718: lookupswitch {
        //          -1684823855: 1744
        //          -1087347775: 1711
        //          default: 2956
        //        }
        //  1744: getfield        dev/nuker/pyro/f4U.4:Ldev/nuker/pyro/f0a;
        //  1747: aastore        
        //  1748: dup            
        //  1749: iconst_1       
        //  1750: aload_0        
        //  1751: getfield        dev/nuker/pyro/f4U.5:Ldev/nuker/pyro/f0a;
        //  1754: aastore        
        //  1755: dup            
        //  1756: iconst_2       
        //  1757: aload_0        
        //  1758: getfield        dev/nuker/pyro/f4U.6:Ldev/nuker/pyro/f0a;
        //  1761: aastore        
        //  1762: dup            
        //  1763: iconst_3       
        //  1764: getstatic       dev/nuker/pyro/fc.0:I
        //  1767: ifeq            1776
        //  1770: ldc_w           1987408150
        //  1773: goto            1779
        //  1776: ldc_w           -633070961
        //  1779: ldc_w           -1418485683
        //  1782: ixor           
        //  1783: lookupswitch {
        //          -586755749: 2952
        //          -466837640: 1776
        //          default: 1808
        //        }
        //  1808: aload_0        
        //  1809: getfield        dev/nuker/pyro/f4U.7:Ldev/nuker/pyro/f0a;
        //  1812: aastore        
        //  1813: dup            
        //  1814: iconst_4       
        //  1815: aload_0        
        //  1816: getfield        dev/nuker/pyro/f4U.8:Ldev/nuker/pyro/f0a;
        //  1819: aastore        
        //  1820: dup            
        //  1821: iconst_5       
        //  1822: aload_0        
        //  1823: getstatic       dev/nuker/pyro/fc.c:I
        //  1826: ifge            1835
        //  1829: ldc_w           1915625729
        //  1832: goto            1838
        //  1835: ldc_w           1077244749
        //  1838: ldc_w           579041624
        //  1841: ixor           
        //  1842: lookupswitch {
        //          1353537625: 1835
        //          1656097301: 1868
        //          default: 2938
        //        }
        //  1868: getfield        dev/nuker/pyro/f4U.3:Ldev/nuker/pyro/f0a;
        //  1871: aastore        
        //  1872: dup            
        //  1873: bipush          6
        //  1875: getstatic       dev/nuker/pyro/fc.c:I
        //  1878: ifge            1887
        //  1881: ldc_w           -1886795866
        //  1884: goto            1890
        //  1887: ldc_w           750803690
        //  1890: ldc_w           712433515
        //  1893: ixor           
        //  1894: lookupswitch {
        //          -1510008627: 2970
        //          67838351: 1887
        //          default: 1920
        //        }
        //  1920: aload_0        
        //  1921: getfield        dev/nuker/pyro/f4U.9:Ldev/nuker/pyro/f0a;
        //  1924: aastore        
        //  1925: dup            
        //  1926: bipush          7
        //  1928: getstatic       dev/nuker/pyro/fc.1:I
        //  1931: ifeq            1940
        //  1934: ldc_w           -1035153964
        //  1937: goto            1943
        //  1940: ldc_w           2074371453
        //  1943: ldc_w           701889046
        //  1946: ixor           
        //  1947: lookupswitch {
        //          -342280254: 2982
        //          -18438042: 1940
        //          default: 1972
        //        }
        //  1972: aload_0        
        //  1973: getstatic       dev/nuker/pyro/fc.0:I
        //  1976: ifeq            1985
        //  1979: ldc_w           -595655151
        //  1982: goto            1988
        //  1985: ldc_w           566579297
        //  1988: ldc_w           -1817849255
        //  1991: ixor           
        //  1992: lookupswitch {
        //          -1302298056: 2020
        //          1339741256: 1985
        //          default: 2936
        //        }
        //  2020: getfield        dev/nuker/pyro/f4U.a:Ldev/nuker/pyro/f0a;
        //  2023: aastore        
        //  2024: invokespecial   dev/nuker/pyro/f0k.<init>:(Ldev/nuker/pyro/f0n;[Ldev/nuker/pyro/f0n;)V
        //  2027: getstatic       dev/nuker/pyro/fc.0:I
        //  2030: ifeq            2039
        //  2033: ldc_w           1938457612
        //  2036: goto            2042
        //  2039: ldc_w           -1438993383
        //  2042: ldc_w           836708092
        //  2045: ixor           
        //  2046: lookupswitch {
        //          -1679453467: 2072
        //          1112908528: 2039
        //          default: 2962
        //        }
        //  2072: putfield        dev/nuker/pyro/f4U.0:Ldev/nuker/pyro/f0k;
        //  2075: aload_0        
        //  2076: new             Ldev/nuker/pyro/f0a;
        //  2079: dup            
        //  2080: ldc_w           "\u2393\u1492\u8a8f\ub3ca\uc9c5\uedb2\ub22d\ue6a3\ud960\ue992\ua750\u1e58\ue19c\uc584\u8126\u8907\u57b7\u7766\ubd3c\uc003"
        //  2083: invokestatic    invokestatic   !!! ERROR
        //  2086: ldc_w           "\u23a2\u1486\u8a8e\ub3d6\uc9e3\ued97\ub23d\ue6a4\ud97c\ue9b2\ua749"
        //  2089: invokestatic    invokestatic   !!! ERROR
        //  2092: aconst_null    
        //  2093: iconst_1       
        //  2094: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  2097: putfield        dev/nuker/pyro/f4U.b:Ldev/nuker/pyro/f0a;
        //  2100: aload_0        
        //  2101: new             Ldev/nuker/pyro/f0a;
        //  2104: dup            
        //  2105: ldc_w           "\u2386\u1492\u8a8e\ub3d0\uc9ce\ued82"
        //  2108: invokestatic    invokestatic   !!! ERROR
        //  2111: ldc_w           "\u23a6\u1492\u8a8e\ub3d0\uc9ce\ued82"
        //  2114: invokestatic    invokestatic   !!! ERROR
        //  2117: aconst_null    
        //  2118: iconst_1       
        //  2119: getstatic       dev/nuker/pyro/fc.0:I
        //  2122: ifeq            2131
        //  2125: ldc_w           1312419101
        //  2128: goto            2134
        //  2131: ldc_w           1840548868
        //  2134: ldc_w           902839745
        //  2137: ixor           
        //  2138: lookupswitch {
        //          168303384: 2131
        //          2078920924: 2926
        //          default: 2164
        //        }
        //  2164: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  2167: putfield        dev/nuker/pyro/f4U.d:Ldev/nuker/pyro/f0a;
        //  2170: aload_0        
        //  2171: new             Ldev/nuker/pyro/f0a;
        //  2174: dup            
        //  2175: ldc_w           "\u238e\u149a\u8a94\ub3d0\uc9ce\ued82"
        //  2178: invokestatic    invokestatic   !!! ERROR
        //  2181: ldc_w           "\u23ae\u149a\u8a94\ub3d0\uc9ce\ued82"
        //  2184: invokestatic    invokestatic   !!! ERROR
        //  2187: aconst_null    
        //  2188: iconst_1       
        //  2189: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  2192: putfield        dev/nuker/pyro/f4U.e:Ldev/nuker/pyro/f0a;
        //  2195: aload_0        
        //  2196: new             Ldev/nuker/pyro/f0a;
        //  2199: dup            
        //  2200: ldc_w           "\u239b\u1483\u8a93\ub3d7\uc9c7"
        //  2203: getstatic       dev/nuker/pyro/fc.0:I
        //  2206: ifeq            2215
        //  2209: ldc_w           -1425438766
        //  2212: goto            2218
        //  2215: ldc_w           769477414
        //  2218: ldc_w           -1751760114
        //  2221: ixor           
        //  2222: lookupswitch {
        //          -310160806: 2215
        //          1017103580: 2994
        //          default: 2248
        //        }
        //  2248: invokestatic    invokestatic   !!! ERROR
        //  2251: ldc_w           "\u23bb\u14a3\u8a93\ub3d7\uc9c7"
        //  2254: invokestatic    invokestatic   !!! ERROR
        //  2257: aconst_null    
        //  2258: iconst_1       
        //  2259: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  2262: putfield        dev/nuker/pyro/f4U.f:Ldev/nuker/pyro/f0a;
        //  2265: aload_0        
        //  2266: new             Ldev/nuker/pyro/f0k;
        //  2269: dup            
        //  2270: new             Ldev/nuker/pyro/f0e;
        //  2273: dup            
        //  2274: ldc_w           "\u2393\u1492\u8a8f\ub3ca\uc9c5"
        //  2277: invokestatic    invokestatic   !!! ERROR
        //  2280: ldc_w           "\u23b3\u1492\u8a8f\ub3ca\uc9c5"
        //  2283: getstatic       dev/nuker/pyro/fc.c:I
        //  2286: ifge            2295
        //  2289: ldc_w           1101180569
        //  2292: goto            2298
        //  2295: ldc_w           1255957681
        //  2298: ldc_w           -192554982
        //  2301: ixor           
        //  2302: lookupswitch {
        //          -1255704957: 2984
        //          -846727726: 2295
        //          default: 2328
        //        }
        //  2328: invokestatic    invokestatic   !!! ERROR
        //  2331: ldc_w           "\u23a6\u1497\u8a93\ub3cd\uc980\ued95\ub225\ue6a2\ud97b\ue9ba\ua74b\u1e4b\ue1d3\uc5a8\u8124\u890a\u57ad\u777d\ubd33\uc01c\u2b31\uc23d\u6a75\u2d44\ud791\u35c7\u7d3e\u89cb\u8010"
        //  2334: invokestatic    invokestatic   !!! ERROR
        //  2337: invokespecial   dev/nuker/pyro/f0e.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //  2340: iconst_4       
        //  2341: anewarray       Ldev/nuker/pyro/f0n;
        //  2344: dup            
        //  2345: iconst_0       
        //  2346: aload_0        
        //  2347: getfield        dev/nuker/pyro/f4U.b:Ldev/nuker/pyro/f0a;
        //  2350: aastore        
        //  2351: dup            
        //  2352: iconst_1       
        //  2353: aload_0        
        //  2354: getstatic       dev/nuker/pyro/fc.1:I
        //  2357: ifeq            2366
        //  2360: ldc_w           1153654596
        //  2363: goto            2369
        //  2366: ldc_w           1136160677
        //  2369: ldc_w           -1293913581
        //  2372: ixor           
        //  2373: lookupswitch {
        //          -1570097532: 2366
        //          -165466793: 2996
        //          default: 2400
        //        }
        //  2400: getfield        dev/nuker/pyro/f4U.d:Ldev/nuker/pyro/f0a;
        //  2403: aastore        
        //  2404: dup            
        //  2405: iconst_2       
        //  2406: aload_0        
        //  2407: getfield        dev/nuker/pyro/f4U.e:Ldev/nuker/pyro/f0a;
        //  2410: aastore        
        //  2411: dup            
        //  2412: iconst_3       
        //  2413: aload_0        
        //  2414: getfield        dev/nuker/pyro/f4U.f:Ldev/nuker/pyro/f0a;
        //  2417: aastore        
        //  2418: invokespecial   dev/nuker/pyro/f0k.<init>:(Ldev/nuker/pyro/f0n;[Ldev/nuker/pyro/f0n;)V
        //  2421: putfield        dev/nuker/pyro/f4U.1:Ldev/nuker/pyro/f0k;
        //  2424: aload_0        
        //  2425: aconst_null    
        //  2426: getstatic       dev/nuker/pyro/fc.c:I
        //  2429: ifge            2438
        //  2432: ldc_w           -829433426
        //  2435: goto            2441
        //  2438: ldc_w           615559787
        //  2441: ldc_w           -306522029
        //  2444: ixor           
        //  2445: lookupswitch {
        //          -922064328: 2472
        //          590676477: 2438
        //          default: 2920
        //        }
        //  2472: putfield        dev/nuker/pyro/f4U.c:[F
        //  2475: aload_0        
        //  2476: new             Ldev/nuker/pyro/fbu;
        //  2479: dup            
        //  2480: getstatic       dev/nuker/pyro/fc.1:I
        //  2483: ifeq            2492
        //  2486: ldc_w           591134544
        //  2489: goto            2495
        //  2492: ldc_w           1869103380
        //  2495: ldc_w           -352526637
        //  2498: ixor           
        //  2499: lookupswitch {
        //          -2053857337: 2524
        //          -909696637: 2492
        //          default: 2988
        //        }
        //  2524: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //  2527: putfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/fbu;
        //  2530: aload_0        
        //  2531: aconst_null    
        //  2532: getstatic       dev/nuker/pyro/fc.1:I
        //  2535: ifeq            2544
        //  2538: ldc_w           56745053
        //  2541: goto            2547
        //  2544: ldc_w           1395837337
        //  2547: ldc_w           1014355512
        //  2550: ixor           
        //  2551: lookupswitch {
        //          -1544961605: 2544
        //          1058277989: 2998
        //          default: 2576
        //        }
        //  2576: putfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  2579: aload_0        
        //  2580: aconst_null    
        //  2581: getstatic       dev/nuker/pyro/fc.0:I
        //  2584: ifeq            2593
        //  2587: ldc_w           -264552638
        //  2590: goto            2596
        //  2593: ldc_w           1261958142
        //  2596: ldc_w           1548174022
        //  2599: ixor           
        //  2600: lookupswitch {
        //          -1401127548: 3008
        //          108190061: 2593
        //          default: 2628
        //        }
        //  2628: putfield        dev/nuker/pyro/f4U.0:Lnet/minecraft/entity/Entity;
        //  2631: aload_0        
        //  2632: iconst_0       
        //  2633: putfield        dev/nuker/pyro/f4U.1:I
        //  2636: aload_0        
        //  2637: aload_0        
        //  2638: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0f;
        //  2641: getstatic       dev/nuker/pyro/fc.0:I
        //  2644: ifeq            2653
        //  2647: ldc_w           929974374
        //  2650: goto            2656
        //  2653: ldc_w           1577106700
        //  2656: ldc_w           560046520
        //  2659: ixor           
        //  2660: lookupswitch {
        //          -1580691772: 2653
        //          370141662: 2968
        //          default: 2688
        //        }
        //  2688: invokevirtual   dev/nuker/pyro/f4U.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  2691: pop            
        //  2692: aload_0        
        //  2693: aload_0        
        //  2694: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0d;
        //  2697: invokevirtual   dev/nuker/pyro/f4U.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  2700: pop            
        //  2701: aload_0        
        //  2702: aload_0        
        //  2703: getfield        dev/nuker/pyro/f4U.0:Ldev/nuker/pyro/f0f;
        //  2706: invokevirtual   dev/nuker/pyro/f4U.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  2709: pop            
        //  2710: aload_0        
        //  2711: getstatic       dev/nuker/pyro/fc.1:I
        //  2714: ifeq            2723
        //  2717: ldc_w           1403673994
        //  2720: goto            2726
        //  2723: ldc_w           -1191194985
        //  2726: ldc_w           121392942
        //  2729: ixor           
        //  2730: lookupswitch {
        //          -1077706311: 2756
        //          1419121316: 2723
        //          default: 2958
        //        }
        //  2756: aload_0        
        //  2757: getstatic       dev/nuker/pyro/fc.1:I
        //  2760: ifeq            2769
        //  2763: ldc_w           323130542
        //  2766: goto            2772
        //  2769: ldc_w           650345666
        //  2772: ldc_w           323474815
        //  2775: ixor           
        //  2776: lookupswitch {
        //           344529: 2769
        //          897886653: 2804
        //          default: 2922
        //        }
        //  2804: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0k;
        //  2807: invokevirtual   dev/nuker/pyro/f4U.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  2810: pop            
        //  2811: aload_0        
        //  2812: getstatic       dev/nuker/pyro/fc.c:I
        //  2815: ifge            2824
        //  2818: ldc_w           1889872973
        //  2821: goto            2827
        //  2824: ldc_w           1184878705
        //  2827: ldc_w           1439613925
        //  2830: ixor           
        //  2831: lookupswitch {
        //          324080532: 2856
        //          627830696: 2824
        //          default: 2928
        //        }
        //  2856: aload_0        
        //  2857: getfield        dev/nuker/pyro/f4U.0:Ldev/nuker/pyro/f0k;
        //  2860: getstatic       dev/nuker/pyro/fc.1:I
        //  2863: ifeq            2872
        //  2866: ldc_w           -1706143165
        //  2869: goto            2875
        //  2872: ldc_w           76968046
        //  2875: ldc_w           1335672832
        //  2878: ixor           
        //  2879: lookupswitch {
        //          -707620285: 2872
        //          1258991726: 2904
        //          default: 3006
        //        }
        //  2904: invokevirtual   dev/nuker/pyro/f4U.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  2907: pop            
        //  2908: aload_0        
        //  2909: aload_0        
        //  2910: getfield        dev/nuker/pyro/f4U.1:Ldev/nuker/pyro/f0k;
        //  2913: invokevirtual   dev/nuker/pyro/f4U.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  2916: pop            
        //  2917: return         
        //  2918: aconst_null    
        //  2919: athrow         
        //  2920: aconst_null    
        //  2921: athrow         
        //  2922: aconst_null    
        //  2923: athrow         
        //  2924: aconst_null    
        //  2925: athrow         
        //  2926: aconst_null    
        //  2927: athrow         
        //  2928: aconst_null    
        //  2929: athrow         
        //  2930: aconst_null    
        //  2931: athrow         
        //  2932: aconst_null    
        //  2933: athrow         
        //  2934: aconst_null    
        //  2935: athrow         
        //  2936: aconst_null    
        //  2937: athrow         
        //  2938: aconst_null    
        //  2939: athrow         
        //  2940: aconst_null    
        //  2941: athrow         
        //  2942: aconst_null    
        //  2943: athrow         
        //  2944: aconst_null    
        //  2945: athrow         
        //  2946: aconst_null    
        //  2947: athrow         
        //  2948: aconst_null    
        //  2949: athrow         
        //  2950: aconst_null    
        //  2951: athrow         
        //  2952: aconst_null    
        //  2953: athrow         
        //  2954: aconst_null    
        //  2955: athrow         
        //  2956: aconst_null    
        //  2957: athrow         
        //  2958: aconst_null    
        //  2959: athrow         
        //  2960: aconst_null    
        //  2961: athrow         
        //  2962: aconst_null    
        //  2963: athrow         
        //  2964: aconst_null    
        //  2965: athrow         
        //  2966: aconst_null    
        //  2967: athrow         
        //  2968: aconst_null    
        //  2969: athrow         
        //  2970: aconst_null    
        //  2971: athrow         
        //  2972: aconst_null    
        //  2973: athrow         
        //  2974: aconst_null    
        //  2975: athrow         
        //  2976: aconst_null    
        //  2977: athrow         
        //  2978: aconst_null    
        //  2979: athrow         
        //  2980: aconst_null    
        //  2981: athrow         
        //  2982: aconst_null    
        //  2983: athrow         
        //  2984: aconst_null    
        //  2985: athrow         
        //  2986: aconst_null    
        //  2987: athrow         
        //  2988: aconst_null    
        //  2989: athrow         
        //  2990: aconst_null    
        //  2991: athrow         
        //  2992: aconst_null    
        //  2993: athrow         
        //  2994: aconst_null    
        //  2995: athrow         
        //  2996: aconst_null    
        //  2997: athrow         
        //  2998: aconst_null    
        //  2999: athrow         
        //  3000: aconst_null    
        //  3001: athrow         
        //  3002: aconst_null    
        //  3003: athrow         
        //  3004: aconst_null    
        //  3005: athrow         
        //  3006: aconst_null    
        //  3007: athrow         
        //  3008: aconst_null    
        //  3009: athrow         
        //    StackMapTable: 00 B8 FF 00 3E 00 01 07 00 03 00 04 07 00 03 08 00 2D 08 00 2D 07 01 EB FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 2D 08 00 2D 07 01 EB 01 FF 00 1B 00 01 07 00 03 00 04 07 00 03 08 00 2D 08 00 2D 07 01 EB FF 00 2C 00 01 07 00 03 00 05 07 00 03 08 00 73 08 00 73 07 01 EB 07 01 EB FF 00 01 00 01 07 00 03 00 06 07 00 03 08 00 73 08 00 73 07 01 EB 07 01 EB 01 FF 00 1C 00 01 07 00 03 00 05 07 00 03 08 00 73 08 00 73 07 01 EB 07 01 EB 17 41 01 1D FF 00 11 00 01 07 00 03 00 04 07 00 03 08 00 E1 08 00 E1 07 01 EB FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 E1 08 00 E1 07 01 EB 01 FF 00 1B 00 01 07 00 03 00 04 07 00 03 08 00 E1 08 00 E1 07 01 EB FF 00 29 00 01 07 00 03 00 04 07 00 03 08 01 29 08 01 29 07 01 EB FF 00 01 00 01 07 00 03 00 05 07 00 03 08 01 29 08 01 29 07 01 EB 01 FF 00 1B 00 01 07 00 03 00 04 07 00 03 08 01 29 08 01 29 07 01 EB FF 00 42 00 01 07 00 03 00 07 07 00 03 08 01 80 08 01 80 07 01 EB 07 01 EB 05 01 FF 00 01 00 01 07 00 03 00 08 07 00 03 08 01 80 08 01 80 07 01 EB 07 01 EB 05 01 01 FF 00 1E 00 01 07 00 03 00 07 07 00 03 08 01 80 08 01 80 07 01 EB 07 01 EB 05 01 FF 00 24 00 01 07 00 03 00 02 07 00 03 07 00 D6 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 D6 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 D6 FF 00 1A 00 01 07 00 03 00 06 07 00 03 08 02 04 08 02 04 08 02 08 08 02 08 07 01 EB FF 00 02 00 01 07 00 03 00 07 07 00 03 08 02 04 08 02 04 08 02 08 08 02 08 07 01 EB 01 FF 00 1D 00 01 07 00 03 00 06 07 00 03 08 02 04 08 02 04 08 02 08 08 02 08 07 01 EB FF 00 1A 00 01 07 00 03 00 08 07 00 03 08 02 04 08 02 04 08 02 08 08 02 08 07 01 EB 07 01 EB 07 01 EB FF 00 02 00 01 07 00 03 00 09 07 00 03 08 02 04 08 02 04 08 02 08 08 02 08 07 01 EB 07 01 EB 07 01 EB 01 FF 00 1D 00 01 07 00 03 00 08 07 00 03 08 02 04 08 02 04 08 02 08 08 02 08 07 01 EB 07 01 EB 07 01 EB FF 00 14 00 01 07 00 03 00 07 07 00 03 08 02 04 08 02 04 07 00 FE 07 01 ED 07 01 ED 01 FF 00 02 00 01 07 00 03 00 08 07 00 03 08 02 04 08 02 04 07 00 FE 07 01 ED 07 01 ED 01 01 FF 00 1F 00 01 07 00 03 00 07 07 00 03 08 02 04 08 02 04 07 00 FE 07 01 ED 07 01 ED 01 FF 00 19 00 01 07 00 03 00 07 07 00 03 08 02 04 08 02 04 07 00 FE 07 01 ED 07 01 ED 01 FF 00 02 00 01 07 00 03 00 08 07 00 03 08 02 04 08 02 04 07 00 FE 07 01 ED 07 01 ED 01 01 FF 00 1E 00 01 07 00 03 00 07 07 00 03 08 02 04 08 02 04 07 00 FE 07 01 ED 07 01 ED 01 FF 00 0C 00 01 07 00 03 00 08 07 00 03 08 02 04 08 02 04 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 FF 00 02 00 01 07 00 03 00 09 07 00 03 08 02 04 08 02 04 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 01 FF 00 1F 00 01 07 00 03 00 08 07 00 03 08 02 04 08 02 04 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 FF 00 18 00 01 07 00 03 00 07 07 00 03 08 02 04 08 02 04 07 00 FE 07 01 ED 07 01 ED 01 FF 00 02 00 01 07 00 03 00 08 07 00 03 08 02 04 08 02 04 07 00 FE 07 01 ED 07 01 ED 01 01 FF 00 1F 00 01 07 00 03 00 07 07 00 03 08 02 04 08 02 04 07 00 FE 07 01 ED 07 01 ED 01 FF 00 24 00 01 07 00 03 00 05 07 00 03 08 03 64 08 03 64 07 01 EB 07 01 EB FF 00 02 00 01 07 00 03 00 06 07 00 03 08 03 64 08 03 64 07 01 EB 07 01 EB 01 FF 00 1F 00 01 07 00 03 00 05 07 00 03 08 03 64 08 03 64 07 01 EB 07 01 EB 16 42 01 1D FF 00 19 00 01 07 00 03 00 05 07 00 03 08 03 D9 08 03 D9 07 01 EB 07 01 EB FF 00 02 00 01 07 00 03 00 06 07 00 03 08 03 D9 08 03 D9 07 01 EB 07 01 EB 01 FF 00 1E 00 01 07 00 03 00 05 07 00 03 08 03 D9 08 03 D9 07 01 EB 07 01 EB 16 42 01 1D FF 00 13 00 01 07 00 03 00 04 07 00 03 08 04 4D 08 04 4D 07 01 EB FF 00 02 00 01 07 00 03 00 05 07 00 03 08 04 4D 08 04 4D 07 01 EB 01 FF 00 1C 00 01 07 00 03 00 04 07 00 03 08 04 4D 08 04 4D 07 01 EB FF 00 11 00 01 07 00 03 00 05 07 00 03 08 04 4D 08 04 4D 07 01 EB 07 01 EB FF 00 02 00 01 07 00 03 00 06 07 00 03 08 04 4D 08 04 4D 07 01 EB 07 01 EB 01 FF 00 1E 00 01 07 00 03 00 05 07 00 03 08 04 4D 08 04 4D 07 01 EB 07 01 EB FF 00 10 00 01 07 00 03 00 07 07 00 03 08 04 4D 08 04 4D 07 01 EB 07 01 EB 05 01 FF 00 02 00 01 07 00 03 00 08 07 00 03 08 04 4D 08 04 4D 07 01 EB 07 01 EB 05 01 01 FF 00 1F 00 01 07 00 03 00 07 07 00 03 08 04 4D 08 04 4D 07 01 EB 07 01 EB 05 01 FF 00 1F 00 01 07 00 03 00 05 07 00 03 08 04 EF 08 04 EF 07 01 EB 07 01 EB FF 00 02 00 01 07 00 03 00 06 07 00 03 08 04 EF 08 04 EF 07 01 EB 07 01 EB 01 FF 00 1C 00 01 07 00 03 00 05 07 00 03 08 04 EF 08 04 EF 07 01 EB 07 01 EB FB 00 48 42 01 1F FF 00 32 00 01 07 00 03 00 05 07 00 03 08 05 AE 08 05 AE 07 01 EB 07 01 EB FF 00 02 00 01 07 00 03 00 06 07 00 03 08 05 AE 08 05 AE 07 01 EB 07 01 EB 01 FF 00 1D 00 01 07 00 03 00 05 07 00 03 08 05 AE 08 05 AE 07 01 EB 07 01 EB FF 00 10 00 01 07 00 03 00 07 07 00 03 08 05 AE 08 05 AE 07 01 EB 07 01 EB 05 01 FF 00 02 00 01 07 00 03 00 08 07 00 03 08 05 AE 08 05 AE 07 01 EB 07 01 EB 05 01 01 FF 00 1F 00 01 07 00 03 00 07 07 00 03 08 05 AE 08 05 AE 07 01 EB 07 01 EB 05 01 FF 00 1D 00 01 07 00 03 00 06 07 00 03 08 06 23 08 06 23 08 06 27 08 06 27 07 01 EB FF 00 02 00 01 07 00 03 00 07 07 00 03 08 06 23 08 06 23 08 06 27 08 06 27 07 01 EB 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 08 06 23 08 06 23 08 06 27 08 06 27 07 01 EB FF 00 1A 00 01 07 00 03 00 08 07 00 03 08 06 23 08 06 23 08 06 27 08 06 27 07 01 EB 07 01 EB 07 01 EB FF 00 02 00 01 07 00 03 00 09 07 00 03 08 06 23 08 06 23 08 06 27 08 06 27 07 01 EB 07 01 EB 07 01 EB 01 FF 00 1D 00 01 07 00 03 00 08 07 00 03 08 06 23 08 06 23 08 06 27 08 06 27 07 01 EB 07 01 EB 07 01 EB FF 00 16 00 01 07 00 03 00 08 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 FF 00 02 00 01 07 00 03 00 09 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 01 FF 00 1D 00 01 07 00 03 00 08 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 FF 00 1F 00 01 07 00 03 00 07 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 FF 00 02 00 01 07 00 03 00 08 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 01 FF 00 1C 00 01 07 00 03 00 07 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 FF 00 1A 00 01 07 00 03 00 08 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 FF 00 02 00 01 07 00 03 00 09 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 01 FF 00 1D 00 01 07 00 03 00 08 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 FF 00 12 00 01 07 00 03 00 07 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 FF 00 02 00 01 07 00 03 00 08 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 01 FF 00 1D 00 01 07 00 03 00 07 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 FF 00 13 00 01 07 00 03 00 07 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 FF 00 02 00 01 07 00 03 00 08 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 01 FF 00 1C 00 01 07 00 03 00 07 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 FF 00 0C 00 01 07 00 03 00 08 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 FF 00 02 00 01 07 00 03 00 09 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 01 FF 00 1F 00 01 07 00 03 00 08 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 FF 00 12 00 01 07 00 03 00 02 07 00 03 07 00 FC FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 FC 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 FC FF 00 3A 00 01 07 00 03 00 07 07 00 03 08 08 35 08 08 35 07 01 EB 07 01 EB 05 01 FF 00 02 00 01 07 00 03 00 08 07 00 03 08 08 35 08 08 35 07 01 EB 07 01 EB 05 01 01 FF 00 1D 00 01 07 00 03 00 07 07 00 03 08 08 35 08 08 35 07 01 EB 07 01 EB 05 01 FF 00 32 00 01 07 00 03 00 04 07 00 03 08 08 94 08 08 94 07 01 EB FF 00 02 00 01 07 00 03 00 05 07 00 03 08 08 94 08 08 94 07 01 EB 01 FF 00 1D 00 01 07 00 03 00 04 07 00 03 08 08 94 08 08 94 07 01 EB FF 00 2E 00 01 07 00 03 00 07 07 00 03 08 08 DA 08 08 DA 08 08 DE 08 08 DE 07 01 EB 07 01 EB FF 00 02 00 01 07 00 03 00 08 07 00 03 08 08 DA 08 08 DA 08 08 DE 08 08 DE 07 01 EB 07 01 EB 01 FF 00 1D 00 01 07 00 03 00 07 07 00 03 08 08 DA 08 08 DA 08 08 DE 08 08 DE 07 01 EB 07 01 EB FF 00 25 00 01 07 00 03 00 08 07 00 03 08 08 DA 08 08 DA 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 FF 00 02 00 01 07 00 03 00 09 07 00 03 08 08 DA 08 08 DA 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 01 FF 00 1E 00 01 07 00 03 00 08 07 00 03 08 08 DA 08 08 DA 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 FF 00 25 00 01 07 00 03 00 02 07 00 03 05 FF 00 02 00 01 07 00 03 00 03 07 00 03 05 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 05 FF 00 13 00 01 07 00 03 00 03 07 00 03 08 09 AC 08 09 AC FF 00 02 00 01 07 00 03 00 04 07 00 03 08 09 AC 08 09 AC 01 FF 00 1C 00 01 07 00 03 00 03 07 00 03 08 09 AC 08 09 AC FF 00 13 00 01 07 00 03 00 02 07 00 03 05 FF 00 02 00 01 07 00 03 00 03 07 00 03 05 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 05 FF 00 10 00 01 07 00 03 00 02 07 00 03 05 FF 00 02 00 01 07 00 03 00 03 07 00 03 05 01 FF 00 1F 00 01 07 00 03 00 02 07 00 03 05 FF 00 18 00 01 07 00 03 00 02 07 00 03 07 00 97 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 97 01 FF 00 1F 00 01 07 00 03 00 02 07 00 03 07 00 97 62 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 FF 00 0C 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1F 00 01 07 00 03 00 02 07 00 03 07 00 03 53 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 0F 00 01 07 00 03 00 02 07 00 03 07 00 FC FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 FC 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 FC FF 00 0D 00 01 07 00 03 00 08 07 00 03 08 02 04 08 02 04 08 02 08 08 02 08 07 01 EB 07 01 EB 07 01 EB FF 00 01 00 01 07 00 03 00 02 07 00 03 05 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 04 4D 08 04 4D 07 01 EB 07 01 EB FF 00 01 00 01 07 00 03 00 07 07 00 03 08 08 35 08 08 35 07 01 EB 07 01 EB 05 01 41 07 00 03 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 01 29 08 01 29 07 01 EB FF 00 01 00 01 07 00 03 00 04 07 00 03 08 04 4D 08 04 4D 07 01 EB FF 00 01 00 01 07 00 03 00 05 07 00 03 08 04 EF 08 04 EF 07 01 EB 07 01 EB FF 00 01 00 01 07 00 03 00 08 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 FF 00 01 00 01 07 00 03 00 08 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 00 2D 08 00 2D 07 01 EB 01 01 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 05 AE 08 05 AE 07 01 EB 07 01 EB FF 00 01 00 01 07 00 03 00 06 07 00 03 08 02 04 08 02 04 08 02 08 08 02 08 07 01 EB FF 00 01 00 01 07 00 03 00 07 07 00 03 08 05 AE 08 05 AE 07 01 EB 07 01 EB 05 01 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 73 08 00 73 07 01 EB 07 01 EB FF 00 01 00 01 07 00 03 00 08 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 41 07 00 03 FF 00 01 00 01 07 00 03 00 08 07 00 03 08 06 23 08 06 23 08 06 27 08 06 27 07 01 EB 07 01 EB 07 01 EB FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 FC FF 00 01 00 01 07 00 03 00 07 07 00 03 08 02 04 08 02 04 07 00 FE 07 01 ED 07 01 ED 01 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 01 80 08 01 80 07 01 EB 07 01 EB 05 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 97 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 D6 01 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 04 4D 08 04 4D 07 01 EB 07 01 EB 05 01 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 03 64 08 03 64 07 01 EB 07 01 EB FF 00 01 00 01 07 00 03 00 07 07 00 03 08 06 23 08 06 23 07 00 FE 07 01 ED 07 01 ED 01 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 08 DA 08 08 DA 08 08 DE 08 08 DE 07 01 EB 07 01 EB FF 00 01 00 01 07 00 03 00 04 07 00 03 08 00 E1 08 00 E1 07 01 EB FF 00 01 00 01 07 00 03 00 03 07 00 03 08 09 AC 08 09 AC FF 00 01 00 01 07 00 03 00 05 07 00 03 08 03 D9 08 03 D9 07 01 EB 07 01 EB FF 00 01 00 01 07 00 03 00 06 07 00 03 08 06 23 08 06 23 08 06 27 08 06 27 07 01 EB FF 00 01 00 01 07 00 03 00 04 07 00 03 08 08 94 08 08 94 07 01 EB FF 00 01 00 01 07 00 03 00 08 07 00 03 08 08 DA 08 08 DA 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 05 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 02 04 08 02 04 07 00 FE 07 01 ED 07 01 ED 01 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 02 04 08 02 04 07 00 FE 07 01 ED 07 01 ED 01 FF 00 01 00 01 07 00 03 00 08 07 00 03 08 02 04 08 02 04 07 00 FE 07 01 ED 07 01 ED 01 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 FC FF 00 01 00 01 07 00 03 00 02 07 00 03 05
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2695)
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
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
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          234
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            226
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            218
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            36
        //    30: ldc_w           -129175826
        //    33: goto            39
        //    36: ldc_w           1617908385
        //    39: ldc_w           1049759591
        //    42: ixor           
        //    43: lookupswitch {
        //          -958471799: 36
        //          1593662918: 68
        //          default: 207
        //        }
        //    68: aload_0        
        //    69: iload_1        
        //    70: aload_2        
        //    71: aload_3        
        //    72: goto            76
        //    75: athrow         
        //    76: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //    79: goto            83
        //    82: athrow         
        //    83: aload_0        
        //    84: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/fbu;
        //    87: getstatic       dev/nuker/pyro/fc.0:I
        //    90: ifeq            99
        //    93: ldc_w           -217516659
        //    96: goto            102
        //    99: ldc_w           1946696728
        //   102: ldc_w           -1480711052
        //   105: ixor           
        //   106: lookupswitch {
        //          -743040916: 132
        //          1421267449: 99
        //          default: 203
        //        }
        //   132: goto            136
        //   135: athrow         
        //   136: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //   139: goto            143
        //   142: athrow         
        //   143: aload_0        
        //   144: aconst_null    
        //   145: putfield        dev/nuker/pyro/f4U.c:[F
        //   148: getstatic       dev/nuker/pyro/fc.1:I
        //   151: ifeq            160
        //   154: ldc_w           -353196218
        //   157: goto            163
        //   160: ldc_w           1305707051
        //   163: ldc_w           -943766059
        //   166: ixor           
        //   167: lookupswitch {
        //          -1972582402: 192
        //          760078995: 160
        //          default: 205
        //        }
        //   192: aload_0        
        //   193: aconst_null    
        //   194: putfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //   197: aload_0        
        //   198: aconst_null    
        //   199: putfield        dev/nuker/pyro/f4U.0:Lnet/minecraft/entity/Entity;
        //   202: return         
        //   203: aconst_null    
        //   204: athrow         
        //   205: aconst_null    
        //   206: athrow         
        //   207: aconst_null    
        //   208: athrow         
        //   209: pop            
        //   210: goto            24
        //   213: pop            
        //   214: aconst_null    
        //   215: goto            209
        //   218: dup            
        //   219: ifnull          209
        //   222: checkcast       Ljava/lang/Throwable;
        //   225: athrow         
        //   226: dup            
        //   227: ifnull          213
        //   230: checkcast       Ljava/lang/Throwable;
        //   233: athrow         
        //   234: aconst_null    
        //   235: athrow         
        //    RuntimeInvisibleTypeAnnotations: 00 02 16 01 00 01 EF 00 00 16 02 00 01 EF 00 00
        //    StackMapTable: 00 1D 43 07 00 47 04 FF 00 0B 00 00 00 01 07 00 47 FF 00 03 00 04 07 00 03 01 07 02 06 07 02 08 00 00 0B 42 01 1C 46 07 01 F5 FF 00 00 00 04 07 00 03 01 07 02 06 07 02 08 00 04 07 00 03 01 07 02 06 07 02 08 45 07 00 47 00 4F 07 01 C5 FF 00 02 00 04 07 00 03 01 07 02 06 07 02 08 00 02 07 01 C5 01 5D 07 01 C5 42 07 00 47 40 07 01 C5 45 07 00 47 00 10 42 01 1C 4A 07 01 C5 01 01 41 07 00 47 43 05 44 07 00 47 47 05 47 07 00 47
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     218    226    Ljava/lang/RuntimeException;
        //  218    226    218    226    Ljava/lang/AssertionError;
        //  234    236    3      8      Ljava/lang/ClassCastException;
        //  75     82     82     83     Any
        //  75     82     3      8      Any
        //  75     82     82     83     Any
        //  76     82     82     83     Any
        //  76     82     75     76     Ljava/lang/ArithmeticException;
        //  135    142    142    143    Any
        //  135    142    135    136    Ljava/lang/StringIndexOutOfBoundsException;
        //  136    142    135    136    Any
        //  136    142    135    136    Ljava/lang/NegativeArraySizeException;
        //  136    142    142    143    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 81 out of bounds for length 81
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
    
    public boolean c(final Entity p0, @Nullable final Entity p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          3019
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            3011
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            3003
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: aload_2        
        //    26: if_acmpeq       290
        //    29: aload_0        
        //    30: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //    33: getstatic       dev/nuker/pyro/fc.0:I
        //    36: ifeq            45
        //    39: ldc_w           845054195
        //    42: goto            48
        //    45: ldc_w           1579568767
        //    48: ldc_w           -1673965307
        //    51: ixor           
        //    52: lookupswitch {
        //          -1368927754: 45
        //          -1038147718: 80
        //          default: 2974
        //        }
        //    80: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    83: aload_1        
        //    84: if_acmpeq       290
        //    87: getstatic       dev/nuker/pyro/fc.0:I
        //    90: ifeq            99
        //    93: ldc_w           -233066754
        //    96: goto            102
        //    99: ldc_w           85097240
        //   102: ldc_w           603625638
        //   105: ixor           
        //   106: lookupswitch {
        //          -773769640: 99
        //          652796862: 132
        //          default: 2918
        //        }
        //   132: aload_1        
        //   133: getstatic       dev/nuker/pyro/fc.0:I
        //   136: ifeq            145
        //   139: ldc_w           -43386121
        //   142: goto            148
        //   145: ldc_w           -513113650
        //   148: ldc_w           1635807024
        //   151: ixor           
        //   152: lookupswitch {
        //          -2132087042: 180
        //          -1662413369: 145
        //          default: 2940
        //        }
        //   180: aload_0        
        //   181: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //   184: getstatic       dev/nuker/pyro/fc.1:I
        //   187: ifeq            196
        //   190: ldc_w           -699270210
        //   193: goto            199
        //   196: ldc_w           51698311
        //   199: ldc_w           -1614468466
        //   202: ixor           
        //   203: lookupswitch {
        //          -1663963127: 228
        //          1234489648: 196
        //          default: 2962
        //        }
        //   228: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   231: getstatic       dev/nuker/pyro/fc.1:I
        //   234: ifeq            243
        //   237: ldc_w           -280621039
        //   240: goto            246
        //   243: ldc_w           2053501179
        //   246: ldc_w           1949704772
        //   249: ixor           
        //   250: lookupswitch {
        //          -1687145899: 243
        //          240374463: 276
        //          default: 2928
        //        }
        //   276: goto            280
        //   279: athrow         
        //   280: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184187_bx:()Lnet/minecraft/entity/Entity;
        //   283: goto            287
        //   286: athrow         
        //   287: if_acmpne       292
        //   290: iconst_0       
        //   291: ireturn        
        //   292: aload_1        
        //   293: instanceof      Lnet/minecraft/entity/EntityLivingBase;
        //   296: ifne            676
        //   299: getstatic       dev/nuker/pyro/fc.1:I
        //   302: ifeq            311
        //   305: ldc_w           -1769888694
        //   308: goto            314
        //   311: ldc_w           -172777530
        //   314: ldc_w           -771046791
        //   317: ixor           
        //   318: lookupswitch {
        //          666459583: 344
        //          1149986355: 311
        //          default: 2926
        //        }
        //   344: aload_1        
        //   345: instanceof      Lnet/minecraft/entity/projectile/EntityShulkerBullet;
        //   348: ifne            358
        //   351: aload_1        
        //   352: instanceof      Lnet/minecraft/entity/projectile/EntityFireball;
        //   355: ifeq            362
        //   358: iconst_1       
        //   359: goto            363
        //   362: iconst_0       
        //   363: getstatic       dev/nuker/pyro/fc.c:I
        //   366: ifge            375
        //   369: ldc_w           -1582831397
        //   372: goto            378
        //   375: ldc_w           44187591
        //   378: ldc_w           -770749569
        //   381: ixor           
        //   382: lookupswitch {
        //          877931973: 375
        //          1940431780: 2924
        //          default: 408
        //        }
        //   408: istore          4
        //   410: iload           4
        //   412: ifne            417
        //   415: iconst_0       
        //   416: ireturn        
        //   417: getstatic       dev/nuker/pyro/fc.0:I
        //   420: ifeq            429
        //   423: ldc_w           -1591588161
        //   426: goto            432
        //   429: ldc_w           1591010226
        //   432: ldc_w           463737557
        //   435: ixor           
        //   436: lookupswitch {
        //          -1165600662: 429
        //          1165029735: 464
        //          default: 2938
        //        }
        //   464: iload           4
        //   466: ifeq            475
        //   469: ldc_w           814437835
        //   472: goto            478
        //   475: ldc_w           814437828
        //   478: ldc_w           1222975996
        //   481: ixor           
        //   482: tableswitch {
        //          -253958034: 504
        //          -253958033: 676
        //          default: 469
        //        }
        //   504: aload_0        
        //   505: getstatic       dev/nuker/pyro/fc.0:I
        //   508: ifeq            517
        //   511: ldc_w           1465454459
        //   514: goto            520
        //   517: ldc_w           1484688831
        //   520: ldc_w           -115567173
        //   523: ixor           
        //   524: lookupswitch {
        //          -1371170112: 2970
        //          -145776070: 517
        //          default: 552
        //        }
        //   552: getfield        dev/nuker/pyro/f4U.3:Ldev/nuker/pyro/f0a;
        //   555: getstatic       dev/nuker/pyro/fc.c:I
        //   558: ifge            567
        //   561: ldc_w           -1995801941
        //   564: goto            570
        //   567: ldc_w           228850354
        //   570: ldc_w           -490980384
        //   573: ixor           
        //   574: lookupswitch {
        //          30164091: 567
        //          1807106379: 2964
        //          default: 600
        //        }
        //   600: goto            604
        //   603: athrow         
        //   604: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   607: goto            611
        //   610: athrow         
        //   611: checkcast       Ljava/lang/Boolean;
        //   614: getstatic       dev/nuker/pyro/fc.c:I
        //   617: ifge            626
        //   620: ldc_w           1767818819
        //   623: goto            629
        //   626: ldc_w           -589706465
        //   629: ldc_w           -1303778849
        //   632: ixor           
        //   633: lookupswitch {
        //          -619237476: 626
        //          1854939840: 660
        //          default: 2976
        //        }
        //   660: goto            664
        //   663: athrow         
        //   664: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   667: goto            671
        //   670: athrow         
        //   671: ifne            676
        //   674: iconst_0       
        //   675: ireturn        
        //   676: aload_1        
        //   677: instanceof      Lnet/minecraft/entity/player/EntityPlayer;
        //   680: ifeq            796
        //   683: aload_0        
        //   684: getfield        dev/nuker/pyro/f4U.4:Ldev/nuker/pyro/f0a;
        //   687: goto            691
        //   690: athrow         
        //   691: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   694: goto            698
        //   697: athrow         
        //   698: checkcast       Ljava/lang/Boolean;
        //   701: getstatic       dev/nuker/pyro/fc.c:I
        //   704: ifge            713
        //   707: ldc_w           -1750541974
        //   710: goto            716
        //   713: ldc_w           -277587089
        //   716: ldc_w           1910295286
        //   719: ixor           
        //   720: lookupswitch {
        //          -428600420: 2916
        //          1468546358: 713
        //          default: 748
        //        }
        //   748: goto            752
        //   751: athrow         
        //   752: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   755: goto            759
        //   758: athrow         
        //   759: ifeq            768
        //   762: ldc_w           959741370
        //   765: goto            771
        //   768: ldc_w           959741371
        //   771: ldc_w           -571290196
        //   774: ixor           
        //   775: tableswitch {
        //          -913481684: 796
        //          -913481683: 870
        //          default: 762
        //        }
        //   796: aload_1        
        //   797: instanceof      Lnet/minecraft/entity/player/EntityPlayer;
        //   800: ifeq            872
        //   803: getstatic       dev/nuker/pyro/fbq.c:Ldev/nuker/pyro/fbq;
        //   806: getstatic       dev/nuker/pyro/fc.c:I
        //   809: ifge            818
        //   812: ldc_w           930730713
        //   815: goto            821
        //   818: ldc_w           -1680228718
        //   821: ldc_w           1444720134
        //   824: ixor           
        //   825: lookupswitch {
        //          -842723180: 852
        //          1634041055: 818
        //          default: 2966
        //        }
        //   852: aload_1        
        //   853: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //   856: goto            860
        //   859: athrow         
        //   860: invokevirtual   dev/nuker/pyro/fbq.c:(Lnet/minecraft/entity/player/EntityPlayer;)Z
        //   863: goto            867
        //   866: athrow         
        //   867: ifne            872
        //   870: iconst_0       
        //   871: ireturn        
        //   872: aload_1        
        //   873: instanceof      Lnet/minecraft/entity/player/EntityPlayer;
        //   876: ifeq            1227
        //   879: aload_0        
        //   880: getfield        dev/nuker/pyro/f4U.a:Ldev/nuker/pyro/f0a;
        //   883: goto            887
        //   886: athrow         
        //   887: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   890: goto            894
        //   893: athrow         
        //   894: checkcast       Ljava/lang/Boolean;
        //   897: goto            901
        //   900: athrow         
        //   901: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   904: goto            908
        //   907: athrow         
        //   908: ifeq            1227
        //   911: iconst_0       
        //   912: istore          4
        //   914: aload_1        
        //   915: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //   918: getfield        net/minecraft/entity/player/EntityPlayer.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   921: getfield        net/minecraft/entity/player/InventoryPlayer.field_70460_b:Lnet/minecraft/util/NonNullList;
        //   924: getstatic       dev/nuker/pyro/fc.0:I
        //   927: ifeq            936
        //   930: ldc_w           -272191998
        //   933: goto            939
        //   936: ldc_w           780002021
        //   939: ldc_w           616886474
        //   942: ixor           
        //   943: lookupswitch {
        //          -889037112: 936
        //          179900975: 968
        //          default: 2986
        //        }
        //   968: goto            972
        //   971: athrow         
        //   972: invokevirtual   net/minecraft/util/NonNullList.iterator:()Ljava/util/Iterator;
        //   975: goto            979
        //   978: athrow         
        //   979: astore          5
        //   981: aload           5
        //   983: goto            987
        //   986: athrow         
        //   987: invokeinterface java/util/Iterator.hasNext:()Z
        //   992: goto            996
        //   995: athrow         
        //   996: ifeq            1220
        //   999: aload           5
        //  1001: goto            1005
        //  1004: athrow         
        //  1005: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1010: goto            1014
        //  1013: athrow         
        //  1014: checkcast       Lnet/minecraft/item/ItemStack;
        //  1017: getstatic       dev/nuker/pyro/fc.1:I
        //  1020: ifeq            1029
        //  1023: ldc_w           197984666
        //  1026: goto            1032
        //  1029: ldc_w           320835447
        //  1032: ldc_w           -1453893266
        //  1035: ixor           
        //  1036: lookupswitch {
        //          -1663757500: 1029
        //          -1566942988: 2930
        //          default: 1064
        //        }
        //  1064: astore          6
        //  1066: getstatic       dev/nuker/pyro/fc.1:I
        //  1069: ifeq            1078
        //  1072: ldc_w           1789121754
        //  1075: goto            1081
        //  1078: ldc_w           287873141
        //  1081: ldc_w           2116973759
        //  1084: ixor           
        //  1085: lookupswitch {
        //          344825957: 1078
        //          1862724810: 1112
        //          default: 2960
        //        }
        //  1112: aload           6
        //  1114: goto            1118
        //  1117: athrow         
        //  1118: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //  1121: goto            1125
        //  1124: athrow         
        //  1125: ifne            1134
        //  1128: ldc_w           -1173041860
        //  1131: goto            1137
        //  1134: ldc_w           -1173041917
        //  1137: ldc_w           -258550301
        //  1140: ixor           
        //  1141: tableswitch {
        //          -1794887234: 1164
        //          -1794887233: 1217
        //          default: 1128
        //        }
        //  1164: iconst_1       
        //  1165: getstatic       dev/nuker/pyro/fc.c:I
        //  1168: ifge            1177
        //  1171: ldc_w           1834391285
        //  1174: goto            1180
        //  1177: ldc_w           -1383105300
        //  1180: ldc_w           -773588982
        //  1183: ixor           
        //  1184: lookupswitch {
        //          -1128960257: 2972
        //          337686975: 1177
        //          default: 1212
        //        }
        //  1212: istore          4
        //  1214: goto            1220
        //  1217: goto            981
        //  1220: iload           4
        //  1222: ifne            1227
        //  1225: iconst_0       
        //  1226: ireturn        
        //  1227: aload_1        
        //  1228: goto            1232
        //  1231: athrow         
        //  1232: invokestatic    dev/nuker/pyro/fb8.7:(Lnet/minecraft/entity/Entity;)Z
        //  1235: goto            1239
        //  1238: athrow         
        //  1239: ifeq            1310
        //  1242: aload_0        
        //  1243: getfield        dev/nuker/pyro/f4U.5:Ldev/nuker/pyro/f0a;
        //  1246: goto            1250
        //  1249: athrow         
        //  1250: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1253: goto            1257
        //  1256: athrow         
        //  1257: checkcast       Ljava/lang/Boolean;
        //  1260: goto            1264
        //  1263: athrow         
        //  1264: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1267: goto            1271
        //  1270: athrow         
        //  1271: ifne            1280
        //  1274: ldc_w           1681613569
        //  1277: goto            1283
        //  1280: ldc_w           1681613574
        //  1283: ldc_w           1090447282
        //  1286: ixor           
        //  1287: tableswitch {
        //          1233848678: 1308
        //          1233848679: 1310
        //          default: 1274
        //        }
        //  1308: iconst_0       
        //  1309: ireturn        
        //  1310: aload_1        
        //  1311: getstatic       dev/nuker/pyro/fc.1:I
        //  1314: ifeq            1323
        //  1317: ldc_w           -364755053
        //  1320: goto            1326
        //  1323: ldc_w           -1032031601
        //  1326: ldc_w           982186969
        //  1329: ixor           
        //  1330: lookupswitch {
        //          -792150966: 1323
        //          -118060714: 1356
        //          default: 2956
        //        }
        //  1356: goto            1360
        //  1359: athrow         
        //  1360: invokestatic    dev/nuker/pyro/fb8.0:(Lnet/minecraft/entity/Entity;)Z
        //  1363: goto            1367
        //  1366: athrow         
        //  1367: ifeq            1376
        //  1370: ldc_w           -1524505926
        //  1373: goto            1379
        //  1376: ldc_w           -1524505925
        //  1379: ldc_w           -370953714
        //  1382: ixor           
        //  1383: tableswitch {
        //          -1719361176: 1404
        //          -1719361175: 1482
        //          default: 1370
        //        }
        //  1404: getstatic       dev/nuker/pyro/fc.0:I
        //  1407: ifeq            1416
        //  1410: ldc_w           -198610682
        //  1413: goto            1419
        //  1416: ldc_w           1363233029
        //  1419: ldc_w           905256131
        //  1422: ixor           
        //  1423: lookupswitch {
        //          -1042518587: 1416
        //          1689540038: 1448
        //          default: 2984
        //        }
        //  1448: aload_0        
        //  1449: getfield        dev/nuker/pyro/f4U.6:Ldev/nuker/pyro/f0a;
        //  1452: goto            1456
        //  1455: athrow         
        //  1456: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1459: goto            1463
        //  1462: athrow         
        //  1463: checkcast       Ljava/lang/Boolean;
        //  1466: goto            1470
        //  1469: athrow         
        //  1470: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1473: goto            1477
        //  1476: athrow         
        //  1477: ifne            1482
        //  1480: iconst_0       
        //  1481: ireturn        
        //  1482: getstatic       dev/nuker/pyro/fc.0:I
        //  1485: ifeq            1494
        //  1488: ldc_w           596253512
        //  1491: goto            1497
        //  1494: ldc_w           -551246208
        //  1497: ldc_w           -321685343
        //  1500: ixor           
        //  1501: lookupswitch {
        //          -816225303: 1494
        //          871882273: 1528
        //          default: 2978
        //        }
        //  1528: aload_1        
        //  1529: goto            1533
        //  1532: athrow         
        //  1533: invokestatic    dev/nuker/pyro/fb8.6:(Lnet/minecraft/entity/Entity;)Z
        //  1536: goto            1540
        //  1539: athrow         
        //  1540: ifeq            2090
        //  1543: iconst_0       
        //  1544: istore          4
        //  1546: getstatic       dev/nuker/pyro/fc.c:I
        //  1549: ifge            1558
        //  1552: ldc_w           1341519104
        //  1555: goto            1561
        //  1558: ldc_w           -1979956237
        //  1561: ldc_w           -1689622637
        //  1564: ixor           
        //  1565: lookupswitch {
        //          -725642605: 1558
        //          313926752: 1592
        //          default: 2920
        //        }
        //  1592: aload_1        
        //  1593: instanceof      Lnet/minecraft/entity/passive/EntityTameable;
        //  1596: ifeq            1698
        //  1599: iconst_1       
        //  1600: getstatic       dev/nuker/pyro/fc.0:I
        //  1603: ifeq            1612
        //  1606: ldc_w           12648670
        //  1609: goto            1615
        //  1612: ldc_w           27730780
        //  1615: ldc_w           -1935788550
        //  1618: ixor           
        //  1619: lookupswitch {
        //          -1939917532: 1612
        //          -1925638490: 1644
        //          default: 2922
        //        }
        //  1644: istore          4
        //  1646: aload_1        
        //  1647: checkcast       Lnet/minecraft/entity/passive/EntityTameable;
        //  1650: goto            1654
        //  1653: athrow         
        //  1654: invokevirtual   net/minecraft/entity/passive/EntityTameable.func_70909_n:()Z
        //  1657: goto            1661
        //  1660: athrow         
        //  1661: ifeq            1922
        //  1664: aload_0        
        //  1665: getfield        dev/nuker/pyro/f4U.8:Ldev/nuker/pyro/f0a;
        //  1668: goto            1672
        //  1671: athrow         
        //  1672: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1675: goto            1679
        //  1678: athrow         
        //  1679: checkcast       Ljava/lang/Boolean;
        //  1682: goto            1686
        //  1685: athrow         
        //  1686: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1689: goto            1693
        //  1692: athrow         
        //  1693: ifne            1922
        //  1696: iconst_0       
        //  1697: ireturn        
        //  1698: getstatic       dev/nuker/pyro/fc.1:I
        //  1701: ifeq            1710
        //  1704: ldc_w           -1405069004
        //  1707: goto            1713
        //  1710: ldc_w           -510317815
        //  1713: ldc_w           714846307
        //  1716: ixor           
        //  1717: lookupswitch {
        //          -2032408233: 2942
        //          970174662: 1710
        //          default: 1744
        //        }
        //  1744: aload_1        
        //  1745: instanceof      Lnet/minecraft/entity/passive/AbstractHorse;
        //  1748: ifeq            1922
        //  1751: iconst_1       
        //  1752: istore          4
        //  1754: aload_1        
        //  1755: checkcast       Lnet/minecraft/entity/passive/AbstractHorse;
        //  1758: goto            1762
        //  1761: athrow         
        //  1762: invokevirtual   net/minecraft/entity/passive/AbstractHorse.func_110248_bS:()Z
        //  1765: goto            1769
        //  1768: athrow         
        //  1769: ifeq            1778
        //  1772: ldc_w           -48881905
        //  1775: goto            1781
        //  1778: ldc_w           -48881904
        //  1781: ldc_w           215635648
        //  1784: ixor           
        //  1785: tableswitch {
        //          -476540002: 1808
        //          -476540001: 1922
        //          default: 1772
        //        }
        //  1808: aload_0        
        //  1809: getfield        dev/nuker/pyro/f4U.8:Ldev/nuker/pyro/f0a;
        //  1812: goto            1816
        //  1815: athrow         
        //  1816: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1819: goto            1823
        //  1822: athrow         
        //  1823: checkcast       Ljava/lang/Boolean;
        //  1826: getstatic       dev/nuker/pyro/fc.c:I
        //  1829: ifge            1838
        //  1832: ldc_w           1355099397
        //  1835: goto            1841
        //  1838: ldc_w           -755643791
        //  1841: ldc_w           -1419134962
        //  1844: ixor           
        //  1845: lookupswitch {
        //          -1682558853: 1838
        //          -72575733: 2982
        //          default: 1872
        //        }
        //  1872: goto            1876
        //  1875: athrow         
        //  1876: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1879: goto            1883
        //  1882: athrow         
        //  1883: ifne            1892
        //  1886: ldc_w           -828176334
        //  1889: goto            1895
        //  1892: ldc_w           -828176333
        //  1895: ldc_w           208945216
        //  1898: ixor           
        //  1899: tableswitch {
        //          -2052157212: 1920
        //          -2052157211: 1922
        //          default: 1886
        //        }
        //  1920: iconst_0       
        //  1921: ireturn        
        //  1922: iload           4
        //  1924: ifne            2090
        //  1927: getstatic       dev/nuker/pyro/fc.1:I
        //  1930: ifeq            1939
        //  1933: ldc_w           472712680
        //  1936: goto            1942
        //  1939: ldc_w           809230721
        //  1942: ldc_w           -1485043413
        //  1945: ixor           
        //  1946: lookupswitch {
        //          -1756895062: 1972
        //          -1152316221: 1939
        //          default: 2932
        //        }
        //  1972: aload_0        
        //  1973: getstatic       dev/nuker/pyro/fc.0:I
        //  1976: ifeq            1985
        //  1979: ldc_w           1345065230
        //  1982: goto            1988
        //  1985: ldc_w           -1646786918
        //  1988: ldc_w           48199652
        //  1991: ixor           
        //  1992: lookupswitch {
        //          590918181: 1985
        //          1391683306: 2988
        //          default: 2020
        //        }
        //  2020: getfield        dev/nuker/pyro/f4U.7:Ldev/nuker/pyro/f0a;
        //  2023: goto            2027
        //  2026: athrow         
        //  2027: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  2030: goto            2034
        //  2033: athrow         
        //  2034: checkcast       Ljava/lang/Boolean;
        //  2037: goto            2041
        //  2040: athrow         
        //  2041: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2044: goto            2048
        //  2047: athrow         
        //  2048: ifne            2057
        //  2051: ldc_w           1417020801
        //  2054: goto            2060
        //  2057: ldc_w           1417020800
        //  2060: ldc_w           -1925432251
        //  2063: ixor           
        //  2064: tableswitch {
        //          -1298893944: 2088
        //          -1298893943: 2090
        //          default: 2051
        //        }
        //  2088: iconst_0       
        //  2089: ireturn        
        //  2090: aload_1        
        //  2091: instanceof      Lnet/minecraft/entity/monster/EntityShulker;
        //  2094: ifeq            2222
        //  2097: getstatic       dev/nuker/pyro/fc.c:I
        //  2100: ifge            2109
        //  2103: ldc_w           -1650215359
        //  2106: goto            2112
        //  2109: ldc_w           347314290
        //  2112: ldc_w           1193290183
        //  2115: ixor           
        //  2116: lookupswitch {
        //          -628908154: 2950
        //          1489116502: 2109
        //          default: 2144
        //        }
        //  2144: aload_0        
        //  2145: getfield        dev/nuker/pyro/f4U.9:Ldev/nuker/pyro/f0a;
        //  2148: getstatic       dev/nuker/pyro/fc.0:I
        //  2151: ifeq            2160
        //  2154: ldc_w           -1175677893
        //  2157: goto            2163
        //  2160: ldc_w           -546774163
        //  2163: ldc_w           -2022422915
        //  2166: ixor           
        //  2167: lookupswitch {
        //          1050202694: 2160
        //          1478272272: 2192
        //          default: 2958
        //        }
        //  2192: goto            2196
        //  2195: athrow         
        //  2196: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  2199: goto            2203
        //  2202: athrow         
        //  2203: checkcast       Ljava/lang/Boolean;
        //  2206: goto            2210
        //  2209: athrow         
        //  2210: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2213: goto            2217
        //  2216: athrow         
        //  2217: ifne            2222
        //  2220: iconst_0       
        //  2221: ireturn        
        //  2222: getstatic       dev/nuker/pyro/fc.c:I
        //  2225: ifge            2234
        //  2228: ldc_w           -1180672401
        //  2231: goto            2237
        //  2234: ldc_w           1461607757
        //  2237: ldc_w           -329959138
        //  2240: ixor           
        //  2241: lookupswitch {
        //          -1152687021: 2268
        //          1442146161: 2234
        //          default: 2990
        //        }
        //  2268: aload_1        
        //  2269: getstatic       dev/nuker/pyro/fc.0:I
        //  2272: ifeq            2281
        //  2275: ldc_w           -1325630140
        //  2278: goto            2284
        //  2281: ldc_w           -1598660614
        //  2284: ldc_w           -1194345992
        //  2287: ixor           
        //  2288: lookupswitch {
        //          137610428: 2281
        //          410641922: 2316
        //          default: 2980
        //        }
        //  2316: aload_0        
        //  2317: getstatic       dev/nuker/pyro/fc.c:I
        //  2320: ifge            2329
        //  2323: ldc_w           -571454376
        //  2326: goto            2332
        //  2329: ldc_w           1240233713
        //  2332: ldc_w           -892457216
        //  2335: ixor           
        //  2336: lookupswitch {
        //          -2094900751: 2364
        //          389964632: 2329
        //          default: 2934
        //        }
        //  2364: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  2367: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2370: goto            2374
        //  2373: athrow         
        //  2374: invokevirtual   net/minecraft/entity/Entity.func_70032_d:(Lnet/minecraft/entity/Entity;)F
        //  2377: goto            2381
        //  2380: athrow         
        //  2381: fstore          4
        //  2383: aload_1        
        //  2384: getstatic       dev/nuker/pyro/fc.0:I
        //  2387: ifeq            2396
        //  2390: ldc_w           2036937486
        //  2393: goto            2399
        //  2396: ldc_w           94791613
        //  2399: ldc_w           -1110152036
        //  2402: ixor           
        //  2403: lookupswitch {
        //          -1200485599: 2428
        //          -994222190: 2396
        //          default: 2946
        //        }
        //  2428: aload_0        
        //  2429: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  2432: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2435: goto            2439
        //  2438: athrow         
        //  2439: invokevirtual   net/minecraft/entity/Entity.func_70068_e:(Lnet/minecraft/entity/Entity;)D
        //  2442: goto            2446
        //  2445: athrow         
        //  2446: dstore          5
        //  2448: getstatic       dev/nuker/pyro/fc.1:I
        //  2451: ifeq            2460
        //  2454: ldc_w           1615134927
        //  2457: goto            2463
        //  2460: ldc_w           978842655
        //  2463: ldc_w           -1402352710
        //  2466: ixor           
        //  2467: lookupswitch {
        //          -1078366888: 2460
        //          -869479563: 2952
        //          default: 2492
        //        }
        //  2492: aload_0        
        //  2493: getstatic       dev/nuker/pyro/fc.c:I
        //  2496: ifge            2505
        //  2499: ldc_w           582978189
        //  2502: goto            2508
        //  2505: ldc_w           1470693466
        //  2508: ldc_w           -1044512255
        //  2511: ixor           
        //  2512: lookupswitch {
        //          -486438772: 2968
        //          1160681065: 2505
        //          default: 2540
        //        }
        //  2540: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  2543: getstatic       dev/nuker/pyro/fc.0:I
        //  2546: ifeq            2555
        //  2549: ldc_w           -1682249166
        //  2552: goto            2558
        //  2555: ldc_w           -495812312
        //  2558: ldc_w           1828435555
        //  2561: ixor           
        //  2562: lookupswitch {
        //          -955071551: 2555
        //          -146711471: 2948
        //          default: 2588
        //        }
        //  2588: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2591: aload_1        
        //  2592: goto            2596
        //  2595: athrow         
        //  2596: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70685_l:(Lnet/minecraft/entity/Entity;)Z
        //  2599: goto            2603
        //  2602: athrow         
        //  2603: istore          7
        //  2605: getstatic       dev/nuker/pyro/fc.c:I
        //  2608: ifge            2617
        //  2611: ldc_w           -1664499587
        //  2614: goto            2620
        //  2617: ldc_w           832079641
        //  2620: ldc_w           621434661
        //  2623: ixor           
        //  2624: lookupswitch {
        //          -1178364072: 2617
        //          345165884: 2652
        //          default: 2944
        //        }
        //  2652: iload           7
        //  2654: ifne            2737
        //  2657: aload_0        
        //  2658: getstatic       dev/nuker/pyro/fc.1:I
        //  2661: ifeq            2670
        //  2664: ldc_w           1222807834
        //  2667: goto            2673
        //  2670: ldc_w           259752172
        //  2673: ldc_w           -1390734970
        //  2676: ixor           
        //  2677: lookupswitch {
        //          -547597113: 2670
        //          -436633444: 2954
        //          default: 2704
        //        }
        //  2704: getfield        dev/nuker/pyro/f4U.0:Ldev/nuker/pyro/f0a;
        //  2707: goto            2711
        //  2710: athrow         
        //  2711: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  2714: goto            2718
        //  2717: athrow         
        //  2718: checkcast       Ljava/lang/Boolean;
        //  2721: goto            2725
        //  2724: athrow         
        //  2725: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2728: goto            2732
        //  2731: athrow         
        //  2732: ifne            2737
        //  2735: iconst_0       
        //  2736: ireturn        
        //  2737: getstatic       dev/nuker/pyro/fc.0:I
        //  2740: ifeq            2749
        //  2743: ldc_w           1144475620
        //  2746: goto            2752
        //  2749: ldc_w           834656131
        //  2752: ldc_w           -1028634880
        //  2755: ixor           
        //  2756: lookupswitch {
        //          -2037970716: 2749
        //          -217083773: 2784
        //          default: 2936
        //        }
        //  2784: iload_3        
        //  2785: ifeq            2903
        //  2788: fload           4
        //  2790: f2d            
        //  2791: getstatic       dev/nuker/pyro/fc.0:I
        //  2794: ifeq            2803
        //  2797: ldc_w           715987706
        //  2800: goto            2806
        //  2803: ldc_w           -1569647994
        //  2806: ldc_w           1743118011
        //  2809: ixor           
        //  2810: lookupswitch {
        //          1282744839: 2803
        //          1296614465: 2992
        //          default: 2836
        //        }
        //  2836: aload_0        
        //  2837: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0d;
        //  2840: goto            2844
        //  2843: athrow         
        //  2844: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  2847: goto            2851
        //  2850: athrow         
        //  2851: checkcast       Ljava/lang/Double;
        //  2854: goto            2858
        //  2857: athrow         
        //  2858: invokevirtual   java/lang/Double.doubleValue:()D
        //  2861: goto            2865
        //  2864: athrow         
        //  2865: dcmpl          
        //  2866: ifle            2871
        //  2869: iconst_0       
        //  2870: ireturn        
        //  2871: iload           7
        //  2873: ifeq            2887
        //  2876: dload           5
        //  2878: ldc2_w          36.0
        //  2881: dcmpl          
        //  2882: ifle            2887
        //  2885: iconst_0       
        //  2886: ireturn        
        //  2887: iload           7
        //  2889: ifne            2903
        //  2892: dload           5
        //  2894: ldc2_w          9.0
        //  2897: dcmpl          
        //  2898: ifle            2903
        //  2901: iconst_0       
        //  2902: ireturn        
        //  2903: aload_1        
        //  2904: goto            2908
        //  2907: athrow         
        //  2908: invokevirtual   net/minecraft/entity/Entity.func_70089_S:()Z
        //  2911: goto            2915
        //  2914: athrow         
        //  2915: ireturn        
        //  2916: aconst_null    
        //  2917: athrow         
        //  2918: aconst_null    
        //  2919: athrow         
        //  2920: aconst_null    
        //  2921: athrow         
        //  2922: aconst_null    
        //  2923: athrow         
        //  2924: aconst_null    
        //  2925: athrow         
        //  2926: aconst_null    
        //  2927: athrow         
        //  2928: aconst_null    
        //  2929: athrow         
        //  2930: aconst_null    
        //  2931: athrow         
        //  2932: aconst_null    
        //  2933: athrow         
        //  2934: aconst_null    
        //  2935: athrow         
        //  2936: aconst_null    
        //  2937: athrow         
        //  2938: aconst_null    
        //  2939: athrow         
        //  2940: aconst_null    
        //  2941: athrow         
        //  2942: aconst_null    
        //  2943: athrow         
        //  2944: aconst_null    
        //  2945: athrow         
        //  2946: aconst_null    
        //  2947: athrow         
        //  2948: aconst_null    
        //  2949: athrow         
        //  2950: aconst_null    
        //  2951: athrow         
        //  2952: aconst_null    
        //  2953: athrow         
        //  2954: aconst_null    
        //  2955: athrow         
        //  2956: aconst_null    
        //  2957: athrow         
        //  2958: aconst_null    
        //  2959: athrow         
        //  2960: aconst_null    
        //  2961: athrow         
        //  2962: aconst_null    
        //  2963: athrow         
        //  2964: aconst_null    
        //  2965: athrow         
        //  2966: aconst_null    
        //  2967: athrow         
        //  2968: aconst_null    
        //  2969: athrow         
        //  2970: aconst_null    
        //  2971: athrow         
        //  2972: aconst_null    
        //  2973: athrow         
        //  2974: aconst_null    
        //  2975: athrow         
        //  2976: aconst_null    
        //  2977: athrow         
        //  2978: aconst_null    
        //  2979: athrow         
        //  2980: aconst_null    
        //  2981: athrow         
        //  2982: aconst_null    
        //  2983: athrow         
        //  2984: aconst_null    
        //  2985: athrow         
        //  2986: aconst_null    
        //  2987: athrow         
        //  2988: aconst_null    
        //  2989: athrow         
        //  2990: aconst_null    
        //  2991: athrow         
        //  2992: aconst_null    
        //  2993: athrow         
        //  2994: pop            
        //  2995: goto            24
        //  2998: pop            
        //  2999: aconst_null    
        //  3000: goto            2994
        //  3003: dup            
        //  3004: ifnull          2994
        //  3007: checkcast       Ljava/lang/Throwable;
        //  3010: athrow         
        //  3011: dup            
        //  3012: ifnull          2998
        //  3015: checkcast       Ljava/lang/Throwable;
        //  3018: athrow         
        //  3019: aconst_null    
        //  3020: athrow         
        //    RuntimeInvisibleTypeAnnotations: 00 01 16 01 00 01 EF 00 00
        //    StackMapTable: 01 70 43 07 00 47 04 FF 00 0B 00 00 00 01 07 00 47 FF 00 03 00 04 07 00 03 07 00 85 07 00 85 01 00 00 54 07 02 1F FF 00 02 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 02 1F 01 5F 07 02 1F 12 42 01 1D 4C 07 00 85 FF 00 02 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 00 85 01 5F 07 00 85 FF 00 0F 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 00 85 07 02 1F FF 00 02 00 04 07 00 03 07 00 85 07 00 85 01 00 03 07 00 85 07 02 1F 01 FF 00 1C 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 00 85 07 02 1F FF 00 0E 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 00 85 07 02 06 FF 00 02 00 04 07 00 03 07 00 85 07 00 85 01 00 03 07 00 85 07 02 06 01 FF 00 1D 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 00 85 07 02 06 42 07 00 47 FF 00 00 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 00 85 07 02 06 45 07 00 47 FF 00 00 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 00 85 07 00 85 02 01 12 42 01 1D 0D 03 40 01 4B 01 FF 00 02 00 04 07 00 03 07 00 85 07 00 85 01 00 02 01 01 5D 01 FC 00 08 01 0B 42 01 1F 04 05 42 01 19 4C 07 00 03 FF 00 02 00 05 07 00 03 07 00 85 07 00 85 01 01 00 02 07 00 03 01 5F 07 00 03 4E 07 00 D6 FF 00 02 00 05 07 00 03 07 00 85 07 00 85 01 01 00 02 07 00 D6 01 5D 07 00 D6 42 07 00 47 40 07 00 D6 45 07 00 47 40 07 03 13 4E 07 02 4E FF 00 02 00 05 07 00 03 07 00 85 07 00 85 01 01 00 02 07 02 4E 01 5E 07 02 4E 42 07 01 F3 40 07 02 4E 45 07 00 47 40 01 FA 00 04 4D 07 00 47 40 07 00 D6 45 07 00 47 40 07 03 13 4E 07 02 4E FF 00 02 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 02 4E 01 5F 07 02 4E FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 04 07 00 03 07 00 85 07 00 85 01 00 01 07 02 4E 45 07 00 47 40 01 02 05 42 01 18 55 07 02 5E FF 00 02 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 02 5E 01 5E 07 02 5E FF 00 06 00 00 00 01 07 00 47 FF 00 00 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 02 5E 07 02 56 45 07 00 47 40 01 02 01 4D 07 00 47 40 07 00 D6 45 07 00 47 40 07 03 13 45 07 00 3D 40 07 02 4E 45 07 00 47 40 01 FF 00 1B 00 05 07 00 03 07 00 85 07 00 85 01 01 00 01 07 02 76 FF 00 02 00 05 07 00 03 07 00 85 07 00 85 01 01 00 02 07 02 76 01 5C 07 02 76 42 07 00 47 40 07 02 76 45 07 00 47 40 07 02 7C FC 00 01 07 02 7C 44 07 00 39 40 07 02 7C 47 07 00 47 40 01 47 07 00 47 40 07 02 7C 47 07 00 47 40 07 03 13 4E 07 02 84 FF 00 02 00 06 07 00 03 07 00 85 07 00 85 01 01 07 02 7C 00 02 07 02 84 01 5F 07 02 84 FC 00 0D 07 02 84 42 01 1E 44 07 00 3F 40 07 02 84 45 07 00 47 40 01 02 05 42 01 1A 4C 01 FF 00 02 00 07 07 00 03 07 00 85 07 00 85 01 01 07 02 7C 07 02 84 00 02 01 01 5F 01 04 FA 00 02 F9 00 06 43 07 02 11 40 07 00 85 45 07 00 47 40 01 49 07 02 17 40 07 00 D6 45 07 00 47 40 07 03 13 45 07 00 47 40 07 02 4E 45 07 00 47 40 01 02 05 42 01 18 01 4C 07 00 85 FF 00 02 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 00 85 01 5D 07 00 85 FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 04 07 00 03 07 00 85 07 00 85 01 00 01 07 00 85 45 07 00 47 40 01 02 05 42 01 18 0B 42 01 1C FF 00 06 00 00 00 01 07 00 47 FF 00 00 00 04 07 00 03 07 00 85 07 00 85 01 00 01 07 00 D6 45 07 00 47 40 07 03 13 45 07 01 F7 40 07 02 4E 45 07 00 47 40 01 04 0B 42 01 1E 43 07 02 15 40 07 00 85 45 07 00 47 40 01 FC 00 11 01 42 01 1E 53 01 FF 00 02 00 05 07 00 03 07 00 85 07 00 85 01 01 00 02 01 01 5C 01 48 07 00 47 40 07 02 AF 45 07 00 47 40 01 49 07 00 47 40 07 00 D6 45 07 00 47 40 07 03 13 45 07 00 47 40 07 02 4E 45 07 00 47 40 01 04 0B 42 01 1E FF 00 10 00 00 00 01 07 00 47 FF 00 00 00 05 07 00 03 07 00 85 07 00 85 01 01 00 01 07 02 BA 45 07 00 47 40 01 02 05 42 01 1A 46 07 00 47 40 07 00 D6 45 07 00 47 40 07 03 13 4E 07 02 4E FF 00 02 00 05 07 00 03 07 00 85 07 00 85 01 01 00 02 07 02 4E 01 5E 07 02 4E 42 07 00 47 40 07 02 4E 45 07 00 47 40 01 02 05 42 01 18 01 10 42 01 1D 4C 07 00 03 FF 00 02 00 05 07 00 03 07 00 85 07 00 85 01 01 00 02 07 00 03 01 5F 07 00 03 45 07 00 47 40 07 00 D6 45 07 00 47 40 07 03 13 45 07 00 39 40 07 02 4E 45 07 00 47 40 01 02 05 42 01 1B FA 00 01 12 42 01 1F 4F 07 00 D6 FF 00 02 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 00 D6 01 5C 07 00 D6 42 07 00 47 40 07 00 D6 45 07 00 47 40 07 03 13 45 07 00 47 40 07 02 4E 45 07 00 47 40 01 04 0B 42 01 1E 4C 07 00 85 FF 00 02 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 00 85 01 5F 07 00 85 FF 00 0C 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 00 85 07 00 03 FF 00 02 00 04 07 00 03 07 00 85 07 00 85 01 00 03 07 00 85 07 00 03 01 FF 00 1F 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 00 85 07 00 03 48 07 00 47 FF 00 00 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 00 85 07 02 06 45 07 00 47 40 02 FF 00 0E 00 05 07 00 03 07 00 85 07 00 85 01 02 00 01 07 00 85 FF 00 02 00 05 07 00 03 07 00 85 07 00 85 01 02 00 02 07 00 85 01 5C 07 00 85 49 07 01 F1 FF 00 00 00 05 07 00 03 07 00 85 07 00 85 01 02 00 02 07 00 85 07 02 06 45 07 00 47 40 03 FC 00 0D 03 42 01 1C 4C 07 00 03 FF 00 02 00 06 07 00 03 07 00 85 07 00 85 01 02 03 00 02 07 00 03 01 5F 07 00 03 4E 07 02 1F FF 00 02 00 06 07 00 03 07 00 85 07 00 85 01 02 03 00 02 07 02 1F 01 5D 07 02 1F 46 07 00 47 FF 00 00 00 06 07 00 03 07 00 85 07 00 85 01 02 03 00 02 07 02 06 07 00 85 45 07 00 47 40 01 FC 00 0D 01 42 01 1F 51 07 00 03 FF 00 02 00 07 07 00 03 07 00 85 07 00 85 01 02 03 01 00 02 07 00 03 01 5E 07 00 03 45 07 00 47 40 07 00 D6 45 07 00 47 40 07 03 13 45 07 02 11 40 07 02 4E 45 07 00 47 40 01 04 0B 42 01 1F 52 03 FF 00 02 00 07 07 00 03 07 00 85 07 00 85 01 02 03 01 00 02 03 01 5D 03 46 07 01 F1 FF 00 00 00 07 07 00 03 07 00 85 07 00 85 01 02 03 01 00 02 03 07 00 A7 45 07 00 47 FF 00 00 00 07 07 00 03 07 00 85 07 00 85 01 02 03 01 00 02 03 07 03 13 45 07 00 47 FF 00 00 00 07 07 00 03 07 00 85 07 00 85 01 02 03 01 00 02 03 07 03 06 45 07 00 47 FF 00 00 00 07 07 00 03 07 00 85 07 00 85 01 02 03 01 00 02 03 03 05 0F 0F 43 07 00 47 40 07 00 85 45 07 00 47 40 01 FF 00 00 00 04 07 00 03 07 00 85 07 00 85 01 00 01 07 02 4E 01 FC 00 01 01 41 01 FF 00 01 00 04 07 00 03 07 00 85 07 00 85 01 00 01 01 01 FF 00 01 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 00 85 07 02 06 FF 00 01 00 06 07 00 03 07 00 85 07 00 85 01 01 07 02 7C 00 01 07 02 84 FA 00 01 FF 00 01 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 00 85 07 00 03 FE 00 01 02 03 01 FF 00 01 00 05 07 00 03 07 00 85 07 00 85 01 01 00 00 FF 00 01 00 04 07 00 03 07 00 85 07 00 85 01 00 01 07 00 85 FC 00 01 01 FF 00 01 00 07 07 00 03 07 00 85 07 00 85 01 02 03 01 00 00 FF 00 01 00 05 07 00 03 07 00 85 07 00 85 01 02 00 01 07 00 85 FF 00 01 00 06 07 00 03 07 00 85 07 00 85 01 02 03 00 01 07 02 1F F9 00 01 FD 00 01 02 03 FF 00 01 00 07 07 00 03 07 00 85 07 00 85 01 02 03 01 00 01 07 00 03 FF 00 01 00 04 07 00 03 07 00 85 07 00 85 01 00 01 07 00 85 41 07 00 D6 FE 00 01 01 07 02 7C 07 02 84 FF 00 01 00 04 07 00 03 07 00 85 07 00 85 01 00 02 07 00 85 07 02 1F FF 00 01 00 05 07 00 03 07 00 85 07 00 85 01 01 00 01 07 00 D6 FF 00 01 00 04 07 00 03 07 00 85 07 00 85 01 00 01 07 02 5E FF 00 01 00 06 07 00 03 07 00 85 07 00 85 01 02 03 00 01 07 00 03 FF 00 01 00 05 07 00 03 07 00 85 07 00 85 01 01 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 00 85 07 00 85 01 01 07 02 7C 07 02 84 00 01 01 FF 00 01 00 04 07 00 03 07 00 85 07 00 85 01 00 01 07 02 1F FF 00 01 00 05 07 00 03 07 00 85 07 00 85 01 01 00 01 07 02 4E FA 00 01 41 07 00 85 FF 00 01 00 05 07 00 03 07 00 85 07 00 85 01 01 00 01 07 02 4E FA 00 01 FF 00 01 00 05 07 00 03 07 00 85 07 00 85 01 01 00 01 07 02 76 41 07 00 03 FA 00 01 FF 00 01 00 07 07 00 03 07 00 85 07 00 85 01 02 03 01 00 01 03 FF 00 01 00 04 07 00 03 07 00 85 07 00 85 01 00 01 07 00 47 43 05 44 07 00 47 47 05 47 07 00 47
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     3003   3011   Ljava/util/ConcurrentModificationException;
        //  3003   3011   3003   3011   Any
        //  3019   3021   3      8      Any
        //  279    286    286    287    Any
        //  279    286    286    287    Ljava/lang/ArithmeticException;
        //  279    286    286    287    Any
        //  279    286    279    280    Any
        //  280    286    279    280    Any
        //  603    610    610    611    Any
        //  604    610    3      8      Any
        //  604    610    3      8      Ljava/lang/RuntimeException;
        //  604    610    603    604    Any
        //  603    610    3      8      Ljava/lang/UnsupportedOperationException;
        //  663    670    670    671    Any
        //  664    670    670    671    Any
        //  664    670    3      8      Any
        //  664    670    3      8      Ljava/lang/ArithmeticException;
        //  664    670    663    664    Ljava/lang/ClassCastException;
        //  690    697    697    698    Any
        //  691    697    690    691    Any
        //  690    697    690    691    Any
        //  691    697    697    698    Any
        //  691    697    697    698    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  752    758    758    759    Any
        //  752    758    758    759    Any
        //  752    758    3      8      Ljava/util/ConcurrentModificationException;
        //  752    758    3      8      Any
        //  752    758    758    759    Ljava/util/NoSuchElementException;
        //  860    866    866    867    Any
        //  860    866    866    867    Ljava/lang/NegativeArraySizeException;
        //  860    866    3      8      Ljava/util/ConcurrentModificationException;
        //  860    866    866    867    Any
        //  860    866    3      8      Any
        //  886    893    893    894    Any
        //  887    893    893    894    Ljava/lang/ClassCastException;
        //  887    893    886    887    Ljava/lang/IllegalArgumentException;
        //  887    893    893    894    Any
        //  887    893    886    887    Any
        //  900    907    907    908    Any
        //  900    907    907    908    Any
        //  901    907    907    908    Any
        //  900    907    907    908    Ljava/lang/IllegalArgumentException;
        //  901    907    900    901    Ljava/lang/StringIndexOutOfBoundsException;
        //  971    978    978    979    Any
        //  972    978    971    972    Any
        //  972    978    3      8      Ljava/lang/ArithmeticException;
        //  972    978    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  971    978    971    972    Any
        //  986    995    995    996    Any
        //  986    995    986    987    Ljava/lang/EnumConstantNotPresentException;
        //  986    995    995    996    Any
        //  986    995    3      8      Ljava/lang/RuntimeException;
        //  987    995    995    996    Any
        //  1004   1013   1013   1014   Any
        //  1005   1013   1013   1014   Any
        //  1004   1013   1004   1005   Any
        //  1005   1013   1004   1005   Any
        //  1005   1013   1013   1014   Ljava/lang/NullPointerException;
        //  1117   1124   1124   1125   Any
        //  1117   1124   3      8      Any
        //  1117   1124   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1117   1124   1117   1118   Ljava/lang/AssertionError;
        //  1117   1124   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1231   1238   1238   1239   Any
        //  1232   1238   3      8      Any
        //  1231   1238   1238   1239   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1231   1238   3      8      Any
        //  1231   1238   1231   1232   Ljava/lang/IllegalArgumentException;
        //  1249   1256   1256   1257   Any
        //  1250   1256   1256   1257   Any
        //  1249   1256   1256   1257   Ljava/lang/RuntimeException;
        //  1250   1256   3      8      Any
        //  1249   1256   1249   1250   Ljava/lang/NumberFormatException;
        //  1263   1270   1270   1271   Any
        //  1263   1270   1270   1271   Ljava/lang/NegativeArraySizeException;
        //  1264   1270   1263   1264   Ljava/lang/ArithmeticException;
        //  1264   1270   1263   1264   Ljava/lang/AssertionError;
        //  1263   1270   1263   1264   Ljava/lang/IndexOutOfBoundsException;
        //  1360   1366   1366   1367   Any
        //  1360   1366   3      8      Any
        //  1360   1366   1366   1367   Any
        //  1360   1366   3      8      Ljava/lang/AssertionError;
        //  1360   1366   1366   1367   Any
        //  1456   1462   1462   1463   Any
        //  1456   1462   3      8      Ljava/lang/UnsupportedOperationException;
        //  1456   1462   1462   1463   Any
        //  1456   1462   3      8      Ljava/lang/NullPointerException;
        //  1456   1462   1462   1463   Any
        //  1469   1476   1476   1477   Any
        //  1469   1476   3      8      Ljava/lang/NegativeArraySizeException;
        //  1470   1476   1476   1477   Any
        //  1470   1476   1469   1470   Ljava/lang/NegativeArraySizeException;
        //  1470   1476   1476   1477   Any
        //  1532   1539   1539   1540   Any
        //  1532   1539   3      8      Any
        //  1533   1539   3      8      Ljava/lang/IllegalStateException;
        //  1533   1539   3      8      Any
        //  1533   1539   1532   1533   Ljava/lang/NullPointerException;
        //  1653   1660   1660   1661   Any
        //  1653   1660   3      8      Any
        //  1654   1660   3      8      Ljava/lang/NullPointerException;
        //  1654   1660   1660   1661   Any
        //  1653   1660   1653   1654   Any
        //  1671   1678   1678   1679   Any
        //  1672   1678   1671   1672   Any
        //  1671   1678   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1671   1678   1678   1679   Any
        //  1672   1678   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1685   1692   1692   1693   Any
        //  1685   1692   1692   1693   Any
        //  1685   1692   1685   1686   Ljava/lang/UnsupportedOperationException;
        //  1685   1692   1685   1686   Ljava/lang/AssertionError;
        //  1685   1692   1692   1693   Any
        //  1762   1768   1768   1769   Any
        //  1762   1768   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1762   1768   3      8      Any
        //  1762   1768   1768   1769   Any
        //  1762   1768   3      8      Any
        //  1815   1822   1822   1823   Any
        //  1816   1822   1815   1816   Ljava/lang/ArithmeticException;
        //  1815   1822   1822   1823   Ljava/lang/IllegalArgumentException;
        //  1815   1822   1815   1816   Ljava/lang/RuntimeException;
        //  1815   1822   1815   1816   Any
        //  1875   1882   1882   1883   Any
        //  1875   1882   1875   1876   Ljava/lang/AssertionError;
        //  1875   1882   1882   1883   Ljava/lang/EnumConstantNotPresentException;
        //  1875   1882   1875   1876   Any
        //  1876   1882   1882   1883   Any
        //  2026   2033   2033   2034   Any
        //  2027   2033   2033   2034   Any
        //  2027   2033   2026   2027   Any
        //  2026   2033   2026   2027   Ljava/lang/IllegalArgumentException;
        //  2026   2033   3      8      Any
        //  2040   2047   2047   2048   Any
        //  2040   2047   2047   2048   Any
        //  2041   2047   2047   2048   Ljava/lang/StringIndexOutOfBoundsException;
        //  2041   2047   2047   2048   Any
        //  2041   2047   2040   2041   Ljava/lang/EnumConstantNotPresentException;
        //  2195   2202   2202   2203   Any
        //  2196   2202   2195   2196   Any
        //  2196   2202   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2196   2202   2195   2196   Any
        //  2196   2202   2202   2203   Ljava/lang/AssertionError;
        //  2209   2216   2216   2217   Any
        //  2210   2216   2216   2217   Any
        //  2209   2216   2209   2210   Ljava/lang/IndexOutOfBoundsException;
        //  2210   2216   3      8      Any
        //  2209   2216   2209   2210   Any
        //  2373   2380   2380   2381   Any
        //  2373   2380   3      8      Ljava/util/NoSuchElementException;
        //  2374   2380   2380   2381   Ljava/lang/IllegalArgumentException;
        //  2374   2380   2373   2374   Ljava/util/NoSuchElementException;
        //  2373   2380   2373   2374   Any
        //  2438   2445   2445   2446   Any
        //  2439   2445   3      8      Any
        //  2438   2445   2438   2439   Ljava/lang/NullPointerException;
        //  2438   2445   2438   2439   Ljava/util/NoSuchElementException;
        //  2438   2445   2438   2439   Ljava/lang/EnumConstantNotPresentException;
        //  2595   2602   2602   2603   Any
        //  2595   2602   2602   2603   Ljava/lang/NumberFormatException;
        //  2596   2602   2595   2596   Ljava/util/NoSuchElementException;
        //  2595   2602   2595   2596   Any
        //  2595   2602   3      8      Ljava/lang/ClassCastException;
        //  2710   2717   2717   2718   Any
        //  2711   2717   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2710   2717   2710   2711   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2711   2717   2710   2711   Any
        //  2711   2717   2717   2718   Any
        //  2724   2731   2731   2732   Any
        //  2724   2731   2731   2732   Ljava/util/NoSuchElementException;
        //  2725   2731   2724   2725   Ljava/lang/IllegalArgumentException;
        //  2725   2731   2731   2732   Any
        //  2725   2731   2731   2732   Ljava/lang/IndexOutOfBoundsException;
        //  2843   2850   2850   2851   Any
        //  2844   2850   2843   2844   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2843   2850   2850   2851   Any
        //  2844   2850   2843   2844   Ljava/lang/NegativeArraySizeException;
        //  2844   2850   3      8      Any
        //  2857   2864   2864   2865   Any
        //  2857   2864   2857   2858   Ljava/lang/ClassCastException;
        //  2858   2864   2857   2858   Ljava/lang/NumberFormatException;
        //  2857   2864   2857   2858   Any
        //  2857   2864   2857   2858   Ljava/lang/UnsupportedOperationException;
        //  2907   2914   2914   2915   Any
        //  2908   2914   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2908   2914   3      8      Any
        //  2907   2914   2914   2915   Ljava/lang/IndexOutOfBoundsException;
        //  2907   2914   2907   2908   Any
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
    
    @f06
    @LauncherEventHide
    public void c(final f2V p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          5475
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            5467
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            5459
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //    28: getstatic       dev/nuker/pyro/fc.c:I
        //    31: ifge            40
        //    34: ldc_w           -434798801
        //    37: goto            43
        //    40: ldc_w           -932164665
        //    43: ldc_w           330786463
        //    46: ixor           
        //    47: lookupswitch {
        //          -607703720: 72
        //          -173925968: 40
        //          default: 5426
        //        }
        //    72: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    75: ifnonnull       79
        //    78: return         
        //    79: aload_0        
        //    80: aload_0        
        //    81: getstatic       dev/nuker/pyro/fc.0:I
        //    84: ifeq            93
        //    87: ldc_w           -1835077841
        //    90: goto            96
        //    93: ldc_w           -1390013989
        //    96: ldc_w           -2047126241
        //    99: ixor           
        //   100: lookupswitch {
        //          392542768: 93
        //          685589700: 128
        //          default: 5378
        //        }
        //   128: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0f;
        //   131: goto            135
        //   134: athrow         
        //   135: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   138: goto            142
        //   141: athrow         
        //   142: getstatic       dev/nuker/pyro/fc.c:I
        //   145: ifge            154
        //   148: ldc_w           243552391
        //   151: goto            157
        //   154: ldc_w           231855882
        //   157: ldc_w           -921030649
        //   160: ixor           
        //   161: lookupswitch {
        //          -993270003: 188
        //          -945921920: 154
        //          default: 5370
        //        }
        //   188: goto            192
        //   191: athrow         
        //   192: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   195: goto            199
        //   198: athrow         
        //   199: goto            203
        //   202: athrow         
        //   203: invokevirtual   dev/nuker/pyro/f4U.4:(Ljava/lang/String;)V
        //   206: goto            210
        //   209: athrow         
        //   210: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f57;
        //   213: getfield        dev/nuker/pyro/f57.c:Ldev/nuker/pyro/fw;
        //   216: goto            220
        //   219: athrow         
        //   220: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   223: goto            227
        //   226: athrow         
        //   227: checkcast       Ljava/lang/Boolean;
        //   230: getstatic       dev/nuker/pyro/fc.1:I
        //   233: ifeq            242
        //   236: ldc_w           134296466
        //   239: goto            245
        //   242: ldc_w           -1132017537
        //   245: ldc_w           1719960052
        //   248: ixor           
        //   249: lookupswitch {
        //          -339658762: 242
        //          1854255718: 5414
        //          default: 276
        //        }
        //   276: goto            280
        //   279: athrow         
        //   280: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   283: goto            287
        //   286: athrow         
        //   287: ifeq            300
        //   290: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f57;
        //   293: getfield        dev/nuker/pyro/f57.c:Z
        //   296: ifeq            300
        //   299: return         
        //   300: aload_0        
        //   301: getstatic       dev/nuker/pyro/fc.1:I
        //   304: ifeq            313
        //   307: ldc_w           1008101017
        //   310: goto            316
        //   313: ldc_w           1511452758
        //   316: ldc_w           -1717789134
        //   319: ixor           
        //   320: lookupswitch {
        //          -1517619029: 313
        //          -1014337948: 348
        //          default: 5384
        //        }
        //   348: goto            352
        //   351: athrow         
        //   352: invokevirtual   dev/nuker/pyro/f4U.0:()Z
        //   355: goto            359
        //   358: athrow         
        //   359: istore_2       
        //   360: aload_0        
        //   361: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/fbu;
        //   364: ldc2_w          1000.0
        //   367: goto            371
        //   370: athrow         
        //   371: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //   374: goto            378
        //   377: athrow         
        //   378: ifne            468
        //   381: getstatic       dev/nuker/pyro/fc.1:I
        //   384: ifeq            393
        //   387: ldc_w           -163271097
        //   390: goto            396
        //   393: ldc_w           -861716696
        //   396: ldc_w           -1084339699
        //   399: ixor           
        //   400: lookupswitch {
        //          1036692419: 393
        //          1226499146: 5380
        //          default: 428
        //        }
        //   428: iload_2        
        //   429: ifeq            438
        //   432: ldc_w           2086464047
        //   435: goto            441
        //   438: ldc_w           2086464032
        //   441: ldc_w           756465832
        //   444: ixor           
        //   445: tableswitch {
        //          -1567337202: 468
        //          -1567337201: 633
        //          default: 432
        //        }
        //   468: aload_0        
        //   469: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/fbu;
        //   472: getstatic       dev/nuker/pyro/fc.1:I
        //   475: ifeq            484
        //   478: ldc_w           1981480981
        //   481: goto            487
        //   484: ldc_w           -1974058302
        //   487: ldc_w           -960975328
        //   490: ixor           
        //   491: lookupswitch {
        //          -1843069990: 484
        //          -1331450315: 5446
        //          default: 516
        //        }
        //   516: goto            520
        //   519: athrow         
        //   520: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //   523: goto            527
        //   526: athrow         
        //   527: getstatic       dev/nuker/pyro/fc.0:I
        //   530: ifeq            539
        //   533: ldc_w           168140517
        //   536: goto            542
        //   539: ldc_w           1521792078
        //   542: ldc_w           -945359444
        //   545: ixor           
        //   546: lookupswitch {
        //          -1659747870: 572
        //          -844928183: 539
        //          default: 5448
        //        }
        //   572: aload_0        
        //   573: aconst_null    
        //   574: getstatic       dev/nuker/pyro/fc.1:I
        //   577: ifeq            586
        //   580: ldc_w           -1724686979
        //   583: goto            589
        //   586: ldc_w           2070228363
        //   589: ldc_w           578454470
        //   592: ixor           
        //   593: lookupswitch {
        //          -1152786757: 5318
        //          319943125: 586
        //          default: 620
        //        }
        //   620: putfield        dev/nuker/pyro/f4U.c:[F
        //   623: aload_0        
        //   624: aconst_null    
        //   625: putfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //   628: aload_0        
        //   629: aconst_null    
        //   630: putfield        dev/nuker/pyro/f4U.0:Lnet/minecraft/entity/Entity;
        //   633: iload_2        
        //   634: ifeq            638
        //   637: return         
        //   638: getstatic       dev/nuker/pyro/f4R.c:[I
        //   641: aload_0        
        //   642: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0f;
        //   645: goto            649
        //   648: athrow         
        //   649: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   652: goto            656
        //   655: athrow         
        //   656: checkcast       Ldev/nuker/pyro/f4S;
        //   659: goto            663
        //   662: athrow         
        //   663: invokevirtual   dev/nuker/pyro/f4S.ordinal:()I
        //   666: goto            670
        //   669: athrow         
        //   670: iaload         
        //   671: tableswitch {
        //                2: 700
        //                3: 887
        //                4: 1417
        //                5: 1750
        //          default: 1861
        //        }
        //   700: aload_0        
        //   701: aload_0        
        //   702: getstatic       dev/nuker/pyro/fc.c:I
        //   705: ifge            714
        //   708: ldc_w           -660199497
        //   711: goto            717
        //   714: ldc_w           324396059
        //   717: ldc_w           -743589794
        //   720: ixor           
        //   721: lookupswitch {
        //          -1057465275: 748
        //          185311209: 714
        //          default: 5326
        //        }
        //   748: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //   751: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   754: getfield        net/minecraft/client/multiplayer/WorldClient.field_72996_f:Ljava/util/List;
        //   757: getstatic       dev/nuker/pyro/fc.1:I
        //   760: ifeq            769
        //   763: ldc_w           1435014530
        //   766: goto            772
        //   769: ldc_w           -1333921485
        //   772: ldc_w           -1093860493
        //   775: ixor           
        //   776: lookupswitch {
        //          -1506040797: 769
        //          -347760911: 5340
        //          default: 804
        //        }
        //   804: goto            808
        //   807: athrow         
        //   808: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //   813: goto            817
        //   816: athrow         
        //   817: aload_0        
        //   818: invokedynamic   BootstrapMethod #0, test:(Ldev/nuker/pyro/f4U;)Ljava/util/function/Predicate;
        //   823: goto            827
        //   826: athrow         
        //   827: invokeinterface java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        //   832: goto            836
        //   835: athrow         
        //   836: aload_0        
        //   837: invokedynamic   BootstrapMethod #1, apply:(Ldev/nuker/pyro/f4U;)Ljava/util/function/Function;
        //   842: goto            846
        //   845: athrow         
        //   846: invokestatic    java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        //   849: goto            853
        //   852: athrow         
        //   853: goto            857
        //   856: athrow         
        //   857: invokeinterface java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
        //   862: goto            866
        //   865: athrow         
        //   866: aconst_null    
        //   867: goto            871
        //   870: athrow         
        //   871: invokevirtual   java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        //   874: goto            878
        //   877: athrow         
        //   878: checkcast       Lnet/minecraft/entity/Entity;
        //   881: putfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //   884: goto            1861
        //   887: aload_0        
        //   888: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //   891: ifnonnull       1126
        //   894: aload_0        
        //   895: aload_0        
        //   896: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //   899: getstatic       dev/nuker/pyro/fc.c:I
        //   902: ifge            911
        //   905: ldc_w           -755106007
        //   908: goto            914
        //   911: ldc_w           -540601483
        //   914: ldc_w           1428751382
        //   917: ixor           
        //   918: lookupswitch {
        //          -2016085185: 911
        //          -1964107933: 944
        //          default: 5398
        //        }
        //   944: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   947: getfield        net/minecraft/client/multiplayer/WorldClient.field_72996_f:Ljava/util/List;
        //   950: goto            954
        //   953: athrow         
        //   954: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //   959: goto            963
        //   962: athrow         
        //   963: aload_0        
        //   964: invokedynamic   BootstrapMethod #2, test:(Ldev/nuker/pyro/f4U;)Ljava/util/function/Predicate;
        //   969: goto            973
        //   972: athrow         
        //   973: invokeinterface java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        //   978: goto            982
        //   981: athrow         
        //   982: getstatic       dev/nuker/pyro/fc.0:I
        //   985: ifeq            994
        //   988: ldc_w           1645900296
        //   991: goto            997
        //   994: ldc_w           1172342321
        //   997: ldc_w           -1849384939
        //  1000: ixor           
        //  1001: lookupswitch {
        //          -735828444: 1028
        //          -203501027: 994
        //          default: 5334
        //        }
        //  1028: aload_0        
        //  1029: invokedynamic   BootstrapMethod #3, apply:(Ldev/nuker/pyro/f4U;)Ljava/util/function/Function;
        //  1034: goto            1038
        //  1037: athrow         
        //  1038: invokestatic    java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        //  1041: goto            1045
        //  1044: athrow         
        //  1045: getstatic       dev/nuker/pyro/fc.1:I
        //  1048: ifeq            1057
        //  1051: ldc_w           2067197613
        //  1054: goto            1060
        //  1057: ldc_w           95716170
        //  1060: ldc_w           1710998268
        //  1063: ixor           
        //  1064: lookupswitch {
        //          516762705: 1057
        //          1615806902: 1092
        //          default: 5358
        //        }
        //  1092: goto            1096
        //  1095: athrow         
        //  1096: invokeinterface java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
        //  1101: goto            1105
        //  1104: athrow         
        //  1105: aconst_null    
        //  1106: goto            1110
        //  1109: athrow         
        //  1110: invokevirtual   java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1113: goto            1117
        //  1116: athrow         
        //  1117: checkcast       Lnet/minecraft/entity/Entity;
        //  1120: putfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  1123: goto            1861
        //  1126: aload_0        
        //  1127: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  1130: aload_0        
        //  1131: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  1134: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1137: goto            1141
        //  1140: athrow         
        //  1141: invokevirtual   net/minecraft/entity/Entity.func_70032_d:(Lnet/minecraft/entity/Entity;)F
        //  1144: goto            1148
        //  1147: athrow         
        //  1148: f2d            
        //  1149: aload_0        
        //  1150: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0d;
        //  1153: getstatic       dev/nuker/pyro/fc.0:I
        //  1156: ifeq            1165
        //  1159: ldc_w           1182381624
        //  1162: goto            1168
        //  1165: ldc_w           -838604759
        //  1168: ldc_w           806441969
        //  1171: ixor           
        //  1172: lookupswitch {
        //          1543134762: 1165
        //          1986586057: 5330
        //          default: 1200
        //        }
        //  1200: goto            1204
        //  1203: athrow         
        //  1204: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  1207: goto            1211
        //  1210: athrow         
        //  1211: checkcast       Ljava/lang/Double;
        //  1214: goto            1218
        //  1217: athrow         
        //  1218: invokevirtual   java/lang/Double.doubleValue:()D
        //  1221: goto            1225
        //  1224: athrow         
        //  1225: dcmpl          
        //  1226: ifle            1861
        //  1229: getstatic       dev/nuker/pyro/fc.c:I
        //  1232: ifge            1241
        //  1235: ldc_w           2085235527
        //  1238: goto            1244
        //  1241: ldc_w           -1651809104
        //  1244: ldc_w           34400926
        //  1247: ixor           
        //  1248: lookupswitch {
        //          35218745: 1241
        //          2118566361: 5346
        //          default: 1276
        //        }
        //  1276: aload_0        
        //  1277: getstatic       dev/nuker/pyro/fc.1:I
        //  1280: ifeq            1289
        //  1283: ldc_w           -922874727
        //  1286: goto            1292
        //  1289: ldc_w           -212792473
        //  1292: ldc_w           -526413003
        //  1295: ixor           
        //  1296: lookupswitch {
        //          332306514: 1324
        //          677486508: 1289
        //          default: 5348
        //        }
        //  1324: aload_0        
        //  1325: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  1328: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1331: getfield        net/minecraft/client/multiplayer/WorldClient.field_72996_f:Ljava/util/List;
        //  1334: goto            1338
        //  1337: athrow         
        //  1338: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //  1343: goto            1347
        //  1346: athrow         
        //  1347: aload_0        
        //  1348: invokedynamic   BootstrapMethod #4, test:(Ldev/nuker/pyro/f4U;)Ljava/util/function/Predicate;
        //  1353: goto            1357
        //  1356: athrow         
        //  1357: invokeinterface java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        //  1362: goto            1366
        //  1365: athrow         
        //  1366: aload_0        
        //  1367: invokedynamic   BootstrapMethod #5, apply:(Ldev/nuker/pyro/f4U;)Ljava/util/function/Function;
        //  1372: goto            1376
        //  1375: athrow         
        //  1376: invokestatic    java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        //  1379: goto            1383
        //  1382: athrow         
        //  1383: goto            1387
        //  1386: athrow         
        //  1387: invokeinterface java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
        //  1392: goto            1396
        //  1395: athrow         
        //  1396: aconst_null    
        //  1397: goto            1401
        //  1400: athrow         
        //  1401: invokevirtual   java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1404: goto            1408
        //  1407: athrow         
        //  1408: checkcast       Lnet/minecraft/entity/Entity;
        //  1411: putfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  1414: goto            1861
        //  1417: aload_0        
        //  1418: getstatic       dev/nuker/pyro/fc.1:I
        //  1421: ifeq            1430
        //  1424: ldc_w           -1338085404
        //  1427: goto            1433
        //  1430: ldc_w           280809671
        //  1433: ldc_w           188330397
        //  1436: ixor           
        //  1437: lookupswitch {
        //          -1157112199: 1430
        //          461726042: 1464
        //          default: 5410
        //        }
        //  1464: aload_0        
        //  1465: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  1468: getstatic       dev/nuker/pyro/fc.0:I
        //  1471: ifeq            1480
        //  1474: ldc_w           345306708
        //  1477: goto            1483
        //  1480: ldc_w           -2083322191
        //  1483: ldc_w           -1407995045
        //  1486: ixor           
        //  1487: lookupswitch {
        //          -1199094513: 1480
        //          801158634: 1512
        //          default: 5356
        //        }
        //  1512: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1515: getfield        net/minecraft/client/multiplayer/WorldClient.field_72996_f:Ljava/util/List;
        //  1518: goto            1522
        //  1521: athrow         
        //  1522: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //  1527: goto            1531
        //  1530: athrow         
        //  1531: aload_0        
        //  1532: invokedynamic   BootstrapMethod #6, test:(Ldev/nuker/pyro/f4U;)Ljava/util/function/Predicate;
        //  1537: goto            1541
        //  1540: athrow         
        //  1541: invokeinterface java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        //  1546: goto            1550
        //  1549: athrow         
        //  1550: aload_0        
        //  1551: invokedynamic   BootstrapMethod #7, apply:(Ldev/nuker/pyro/f4U;)Ljava/util/function/Function;
        //  1556: goto            1560
        //  1559: athrow         
        //  1560: invokestatic    java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        //  1563: goto            1567
        //  1566: athrow         
        //  1567: goto            1571
        //  1570: athrow         
        //  1571: invokeinterface java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
        //  1576: goto            1580
        //  1579: athrow         
        //  1580: aconst_null    
        //  1581: goto            1585
        //  1584: athrow         
        //  1585: invokevirtual   java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1588: goto            1592
        //  1591: athrow         
        //  1592: checkcast       Lnet/minecraft/entity/Entity;
        //  1595: getstatic       dev/nuker/pyro/fc.c:I
        //  1598: ifge            1607
        //  1601: ldc_w           959023666
        //  1604: goto            1610
        //  1607: ldc_w           -559460311
        //  1610: ldc_w           1597695124
        //  1613: ixor           
        //  1614: lookupswitch {
        //          -2120371011: 1640
        //          1712549542: 1607
        //          default: 5406
        //        }
        //  1640: putfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  1643: getstatic       dev/nuker/pyro/fc.1:I
        //  1646: ifeq            1655
        //  1649: ldc_w           -1253613201
        //  1652: goto            1658
        //  1655: ldc_w           -1849804658
        //  1658: ldc_w           1351375891
        //  1661: ixor           
        //  1662: lookupswitch {
        //          -1053662051: 1688
        //          -439665284: 1655
        //          default: 5382
        //        }
        //  1688: aload_0        
        //  1689: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  1692: ifnonnull       1861
        //  1695: aload_0        
        //  1696: getstatic       dev/nuker/pyro/fc.c:I
        //  1699: ifge            1708
        //  1702: ldc_w           -1265507993
        //  1705: goto            1711
        //  1708: ldc_w           553393989
        //  1711: ldc_w           -1852693616
        //  1714: ixor           
        //  1715: lookupswitch {
        //          412811812: 1708
        //          621003511: 5364
        //          default: 1740
        //        }
        //  1740: aload_0        
        //  1741: getfield        dev/nuker/pyro/f4U.0:Lnet/minecraft/entity/Entity;
        //  1744: putfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  1747: goto            1861
        //  1750: aload_0        
        //  1751: aload_0        
        //  1752: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  1755: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1758: getfield        net/minecraft/client/multiplayer/WorldClient.field_72996_f:Ljava/util/List;
        //  1761: goto            1765
        //  1764: athrow         
        //  1765: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //  1770: goto            1774
        //  1773: athrow         
        //  1774: aload_0        
        //  1775: invokedynamic   BootstrapMethod #8, test:(Ldev/nuker/pyro/f4U;)Ljava/util/function/Predicate;
        //  1780: goto            1784
        //  1783: athrow         
        //  1784: invokeinterface java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        //  1789: goto            1793
        //  1792: athrow         
        //  1793: invokedynamic   BootstrapMethod #9, apply:()Ljava/util/function/Function;
        //  1798: goto            1802
        //  1801: athrow         
        //  1802: invokeinterface java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        //  1807: goto            1811
        //  1810: athrow         
        //  1811: invokedynamic   BootstrapMethod #10, apply:()Ljava/util/function/Function;
        //  1816: goto            1820
        //  1819: athrow         
        //  1820: invokestatic    java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        //  1823: goto            1827
        //  1826: athrow         
        //  1827: goto            1831
        //  1830: athrow         
        //  1831: invokeinterface java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
        //  1836: goto            1840
        //  1839: athrow         
        //  1840: aconst_null    
        //  1841: goto            1845
        //  1844: athrow         
        //  1845: invokevirtual   java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1848: goto            1852
        //  1851: athrow         
        //  1852: checkcast       Lnet/minecraft/entity/Entity;
        //  1855: putfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  1858: goto            1861
        //  1861: aload_0        
        //  1862: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  1865: ifnull          2097
        //  1868: aload_0        
        //  1869: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  1872: getfield        net/minecraft/entity/Entity.field_70128_L:Z
        //  1875: ifne            2048
        //  1878: getstatic       dev/nuker/pyro/fc.0:I
        //  1881: ifeq            1890
        //  1884: ldc_w           1703456276
        //  1887: goto            1893
        //  1890: ldc_w           307634521
        //  1893: ldc_w           221255844
        //  1896: ixor           
        //  1897: lookupswitch {
        //          526793213: 1924
        //          1756935856: 1890
        //          default: 5422
        //        }
        //  1924: aload_0        
        //  1925: getstatic       dev/nuker/pyro/fc.c:I
        //  1928: ifge            1937
        //  1931: ldc_w           -189463781
        //  1934: goto            1940
        //  1937: ldc_w           1932126370
        //  1940: ldc_w           51219374
        //  1943: ixor           
        //  1944: lookupswitch {
        //          -138901323: 1937
        //          1881432844: 1972
        //          default: 5328
        //        }
        //  1972: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  1975: instanceof      Lnet/minecraft/entity/EntityLivingBase;
        //  1978: ifeq            2097
        //  1981: aload_0        
        //  1982: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  1985: checkcast       Lnet/minecraft/entity/EntityLivingBase;
        //  1988: getstatic       dev/nuker/pyro/fc.0:I
        //  1991: ifeq            2000
        //  1994: ldc_w           1672499149
        //  1997: goto            2003
        //  2000: ldc_w           820703460
        //  2003: ldc_w           -451487634
        //  2006: ixor           
        //  2007: lookupswitch {
        //          -2035902557: 2000
        //          -704894838: 2032
        //          default: 5342
        //        }
        //  2032: goto            2036
        //  2035: athrow         
        //  2036: invokevirtual   net/minecraft/entity/EntityLivingBase.func_110143_aJ:()F
        //  2039: goto            2043
        //  2042: athrow         
        //  2043: fconst_0       
        //  2044: fcmpg          
        //  2045: ifgt            2097
        //  2048: getstatic       dev/nuker/pyro/fc.0:I
        //  2051: ifeq            2060
        //  2054: ldc_w           -2076276198
        //  2057: goto            2063
        //  2060: ldc_w           -379919844
        //  2063: ldc_w           1371892786
        //  2066: ixor           
        //  2067: lookupswitch {
        //          -898109187: 2060
        //          -704911832: 5352
        //          default: 2092
        //        }
        //  2092: aload_0        
        //  2093: aconst_null    
        //  2094: putfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  2097: aload_0        
        //  2098: getstatic       dev/nuker/pyro/fc.0:I
        //  2101: ifeq            2110
        //  2104: ldc_w           54215325
        //  2107: goto            2113
        //  2110: ldc_w           -1378152183
        //  2113: ldc_w           -1968219845
        //  2116: ixor           
        //  2117: lookupswitch {
        //          -1986782298: 5336
        //          -671200189: 2110
        //          default: 2144
        //        }
        //  2144: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  2147: ifnull          2156
        //  2150: ldc_w           806111819
        //  2153: goto            2159
        //  2156: ldc_w           806111818
        //  2159: ldc_w           -550909297
        //  2162: ixor           
        //  2163: tableswitch {
        //          -565509752: 2184
        //          -565509751: 5315
        //          default: 2150
        //        }
        //  2184: getstatic       dev/nuker/pyro/f4R.0:[I
        //  2187: aload_0        
        //  2188: getfield        dev/nuker/pyro/f4U.0:Ldev/nuker/pyro/f0f;
        //  2191: getstatic       dev/nuker/pyro/fc.1:I
        //  2194: ifeq            2203
        //  2197: ldc_w           1571960223
        //  2200: goto            2206
        //  2203: ldc_w           1463588546
        //  2206: ldc_w           -398999072
        //  2209: ixor           
        //  2210: lookupswitch {
        //          -1249512321: 5412
        //          1073785620: 2203
        //          default: 2236
        //        }
        //  2236: goto            2240
        //  2239: athrow         
        //  2240: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //  2243: goto            2247
        //  2246: athrow         
        //  2247: checkcast       Ldev/nuker/pyro/f4T;
        //  2250: goto            2254
        //  2253: athrow         
        //  2254: invokevirtual   dev/nuker/pyro/f4T.ordinal:()I
        //  2257: goto            2261
        //  2260: athrow         
        //  2261: iaload         
        //  2262: tableswitch {
        //                2: 2288
        //                3: 2291
        //                4: 2405
        //          default: 3564
        //        }
        //  2288: goto            3564
        //  2291: aload_0        
        //  2292: getstatic       dev/nuker/pyro/fc.1:I
        //  2295: ifeq            2304
        //  2298: ldc_w           1795809788
        //  2301: goto            2307
        //  2304: ldc_w           -1604146511
        //  2307: ldc_w           522984009
        //  2310: ixor           
        //  2311: lookupswitch {
        //          -1085361928: 2336
        //          1948646325: 2304
        //          default: 5386
        //        }
        //  2336: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  2339: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2342: goto            2346
        //  2345: athrow         
        //  2346: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //  2349: goto            2353
        //  2352: athrow         
        //  2353: goto            2357
        //  2356: athrow         
        //  2357: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  2360: goto            2364
        //  2363: athrow         
        //  2364: instanceof      Lnet/minecraft/item/ItemSword;
        //  2367: ifne            2376
        //  2370: ldc_w           114451578
        //  2373: goto            2379
        //  2376: ldc_w           114451525
        //  2379: ldc_w           -385993883
        //  2382: ixor           
        //  2383: tableswitch {
        //          -598168002: 2404
        //          -598168001: 3564
        //          default: 2370
        //        }
        //  2404: return         
        //  2405: iconst_m1      
        //  2406: getstatic       dev/nuker/pyro/fc.1:I
        //  2409: ifeq            2418
        //  2412: ldc_w           -1998822101
        //  2415: goto            2421
        //  2418: ldc_w           -1751312209
        //  2421: ldc_w           -1184735973
        //  2424: ixor           
        //  2425: lookupswitch {
        //          -1299355888: 2418
        //          834549808: 5444
        //          default: 2452
        //        }
        //  2452: istore_3       
        //  2453: dconst_0       
        //  2454: dstore          4
        //  2456: iconst_0       
        //  2457: istore          6
        //  2459: iload           6
        //  2461: bipush          9
        //  2463: if_icmpge       3386
        //  2466: aload_0        
        //  2467: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  2470: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2473: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  2476: iload           6
        //  2478: getstatic       dev/nuker/pyro/fc.c:I
        //  2481: ifge            2490
        //  2484: ldc_w           1847788987
        //  2487: goto            2493
        //  2490: ldc_w           -246259444
        //  2493: ldc_w           1213881989
        //  2496: ixor           
        //  2497: lookupswitch {
        //          645487422: 5440
        //          856776559: 2490
        //          default: 2524
        //        }
        //  2524: goto            2528
        //  2527: athrow         
        //  2528: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70301_a:(I)Lnet/minecraft/item/ItemStack;
        //  2531: goto            2535
        //  2534: athrow         
        //  2535: astore          7
        //  2537: getstatic       dev/nuker/pyro/fc.1:I
        //  2540: ifeq            2549
        //  2543: ldc_w           2110546438
        //  2546: goto            2552
        //  2549: ldc_w           666159268
        //  2552: ldc_w           -1932895133
        //  2555: ixor           
        //  2556: lookupswitch {
        //          -1417767737: 2584
        //          -251249051: 2549
        //          default: 5360
        //        }
        //  2584: aload           7
        //  2586: ifnull          3380
        //  2589: aload           7
        //  2591: goto            2595
        //  2594: athrow         
        //  2595: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  2598: goto            2602
        //  2601: athrow         
        //  2602: instanceof      Lnet/minecraft/item/ItemSword;
        //  2605: ifne            2708
        //  2608: getstatic       dev/nuker/pyro/fc.c:I
        //  2611: ifge            2620
        //  2614: ldc_w           1390777485
        //  2617: goto            2623
        //  2620: ldc_w           1194931404
        //  2623: ldc_w           534009435
        //  2626: ixor           
        //  2627: lookupswitch {
        //          -96738080: 2620
        //          1295106774: 5418
        //          default: 2652
        //        }
        //  2652: aload           7
        //  2654: goto            2658
        //  2657: athrow         
        //  2658: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  2661: goto            2665
        //  2664: athrow         
        //  2665: instanceof      Lnet/minecraft/item/ItemTool;
        //  2668: ifeq            2677
        //  2671: ldc_w           -45032111
        //  2674: goto            2680
        //  2677: ldc_w           -45032112
        //  2680: ldc_w           -500013259
        //  2683: ixor           
        //  2684: tableswitch {
        //          1053127880: 2708
        //          1053127881: 3380
        //          default: 2671
        //        }
        //  2708: iload_3        
        //  2709: iconst_m1      
        //  2710: if_icmpne       2761
        //  2713: iload           6
        //  2715: getstatic       dev/nuker/pyro/fc.0:I
        //  2718: ifeq            2727
        //  2721: ldc_w           1579293057
        //  2724: goto            2730
        //  2727: ldc_w           317306495
        //  2730: ldc_w           -883917632
        //  2733: ixor           
        //  2734: lookupswitch {
        //          -1787665087: 5396
        //          871022776: 2727
        //          default: 2760
        //        }
        //  2760: istore_3       
        //  2761: aload           7
        //  2763: goto            2767
        //  2766: athrow         
        //  2767: invokestatic    net/minecraft/enchantment/EnchantmentHelper.func_82781_a:(Lnet/minecraft/item/ItemStack;)Ljava/util/Map;
        //  2770: goto            2774
        //  2773: athrow         
        //  2774: getstatic       dev/nuker/pyro/fc.1:I
        //  2777: ifeq            2786
        //  2780: ldc_w           817096298
        //  2783: goto            2789
        //  2786: ldc_w           486947681
        //  2789: ldc_w           1962611965
        //  2792: ixor           
        //  2793: lookupswitch {
        //          1145631383: 2786
        //          1778200476: 2820
        //          default: 5344
        //        }
        //  2820: goto            2824
        //  2823: athrow         
        //  2824: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //  2829: goto            2833
        //  2832: athrow         
        //  2833: goto            2837
        //  2836: athrow         
        //  2837: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  2842: goto            2846
        //  2845: athrow         
        //  2846: astore          8
        //  2848: aload           8
        //  2850: goto            2854
        //  2853: athrow         
        //  2854: invokeinterface java/util/Iterator.hasNext:()Z
        //  2859: goto            2863
        //  2862: athrow         
        //  2863: ifeq            2872
        //  2866: ldc_w           1290915200
        //  2869: goto            2875
        //  2872: ldc_w           1290915201
        //  2875: ldc_w           -822851534
        //  2878: ixor           
        //  2879: tableswitch {
        //          67832676: 2900
        //          67832677: 3380
        //          default: 2866
        //        }
        //  2900: getstatic       dev/nuker/pyro/fc.0:I
        //  2903: ifeq            2912
        //  2906: ldc_w           1445094477
        //  2909: goto            2915
        //  2912: ldc_w           44347728
        //  2915: ldc_w           717033148
        //  2918: ixor           
        //  2919: lookupswitch {
        //          2090822385: 5366
        //          2128618867: 2912
        //          default: 2944
        //        }
        //  2944: aload           8
        //  2946: getstatic       dev/nuker/pyro/fc.c:I
        //  2949: ifge            2958
        //  2952: ldc_w           -2070551392
        //  2955: goto            2961
        //  2958: ldc_w           -666826973
        //  2961: ldc_w           -779263547
        //  2964: ixor           
        //  2965: lookupswitch {
        //          164390630: 2992
        //          1427670373: 2958
        //          default: 5430
        //        }
        //  2992: goto            2996
        //  2995: athrow         
        //  2996: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  3001: goto            3005
        //  3004: athrow         
        //  3005: checkcast       Lnet/minecraft/enchantment/Enchantment;
        //  3008: getstatic       dev/nuker/pyro/fc.1:I
        //  3011: ifeq            3020
        //  3014: ldc_w           -657063724
        //  3017: goto            3023
        //  3020: ldc_w           406017330
        //  3023: ldc_w           350032441
        //  3026: ixor           
        //  3027: lookupswitch {
        //          -871689491: 3020
        //          216942347: 3052
        //          default: 5438
        //        }
        //  3052: astore          9
        //  3054: aload           9
        //  3056: instanceof      Lnet/minecraft/enchantment/EnchantmentDamage;
        //  3059: ifeq            3068
        //  3062: ldc_w           -1080132840
        //  3065: goto            3071
        //  3068: ldc_w           -1080132837
        //  3071: ldc_w           -1382264791
        //  3074: ixor           
        //  3075: tableswitch {
        //          604264034: 3096
        //          604264035: 3377
        //          default: 3062
        //        }
        //  3096: aload           9
        //  3098: checkcast       Lnet/minecraft/enchantment/EnchantmentDamage;
        //  3101: astore          10
        //  3103: getstatic       dev/nuker/pyro/fc.c:I
        //  3106: ifge            3115
        //  3109: ldc_w           -536382444
        //  3112: goto            3118
        //  3115: ldc_w           -39429072
        //  3118: ldc_w           -10741442
        //  3121: ixor           
        //  3122: lookupswitch {
        //          49956110: 3148
        //          526085418: 3115
        //          default: 5376
        //        }
        //  3148: aload           10
        //  3150: getfield        net/minecraft/enchantment/EnchantmentDamage.field_77361_a:I
        //  3153: ifeq            3159
        //  3156: goto            2848
        //  3159: aload           9
        //  3161: aload           7
        //  3163: goto            3167
        //  3166: athrow         
        //  3167: invokestatic    net/minecraft/enchantment/EnchantmentHelper.func_77506_a:(Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/item/ItemStack;)I
        //  3170: goto            3174
        //  3173: athrow         
        //  3174: i2d            
        //  3175: dstore          11
        //  3177: getstatic       dev/nuker/pyro/fc.c:I
        //  3180: ifge            3189
        //  3183: ldc_w           -1224396410
        //  3186: goto            3192
        //  3189: ldc_w           698398568
        //  3192: ldc_w           -1163582604
        //  3195: ixor           
        //  3196: lookupswitch {
        //          -974038077: 3189
        //          228594418: 5338
        //          default: 3224
        //        }
        //  3224: dload           11
        //  3226: getstatic       dev/nuker/pyro/fc.0:I
        //  3229: ifeq            3238
        //  3232: ldc_w           -2023151583
        //  3235: goto            3241
        //  3238: ldc_w           1894404447
        //  3241: ldc_w           344019273
        //  3244: ixor           
        //  3245: lookupswitch {
        //          -1813481112: 3238
        //          1684733974: 3272
        //          default: 5332
        //        }
        //  3272: dload           4
        //  3274: dcmpl          
        //  3275: ifle            3377
        //  3278: getstatic       dev/nuker/pyro/fc.c:I
        //  3281: ifge            3290
        //  3284: ldc_w           1119172793
        //  3287: goto            3293
        //  3290: ldc_w           -1852570240
        //  3293: ldc_w           120690692
        //  3296: ixor           
        //  3297: lookupswitch {
        //          -1767531132: 3324
        //          1166319805: 3290
        //          default: 5390
        //        }
        //  3324: dload           11
        //  3326: getstatic       dev/nuker/pyro/fc.c:I
        //  3329: ifge            3338
        //  3332: ldc_w           849288140
        //  3335: goto            3341
        //  3338: ldc_w           1250201587
        //  3341: ldc_w           1468604836
        //  3344: ixor           
        //  3345: lookupswitch {
        //          -2076292682: 3338
        //          1695955560: 5436
        //          default: 3372
        //        }
        //  3372: dstore          4
        //  3374: iload           6
        //  3376: istore_3       
        //  3377: goto            2848
        //  3380: iinc            6, 1
        //  3383: goto            2459
        //  3386: iload_3        
        //  3387: iconst_m1      
        //  3388: if_icmpeq       3564
        //  3391: aload_0        
        //  3392: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  3395: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3398: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  3401: iload_3        
        //  3402: getstatic       dev/nuker/pyro/fc.1:I
        //  3405: ifeq            3414
        //  3408: ldc_w           -306262685
        //  3411: goto            3417
        //  3414: ldc_w           1081760464
        //  3417: ldc_w           -1944824915
        //  3420: ixor           
        //  3421: lookupswitch {
        //          -865203843: 3448
        //          1638571726: 3414
        //          default: 5354
        //        }
        //  3448: putfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //  3451: getstatic       dev/nuker/pyro/fc.0:I
        //  3454: ifeq            3463
        //  3457: ldc_w           -1808170219
        //  3460: goto            3466
        //  3463: ldc_w           1287784745
        //  3466: ldc_w           -2039764185
        //  3469: ixor           
        //  3470: lookupswitch {
        //          -894852594: 3496
        //          307374130: 3463
        //          default: 5434
        //        }
        //  3496: aload_0        
        //  3497: getstatic       dev/nuker/pyro/fc.c:I
        //  3500: ifge            3509
        //  3503: ldc_w           1137958669
        //  3506: goto            3512
        //  3509: ldc_w           1877627712
        //  3512: ldc_w           -1541152935
        //  3515: ixor           
        //  3516: lookupswitch {
        //          -1994517922: 3509
        //          -403701676: 5420
        //          default: 3544
        //        }
        //  3544: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  3547: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  3550: goto            3554
        //  3553: athrow         
        //  3554: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78765_e:()V
        //  3557: goto            3561
        //  3560: athrow         
        //  3561: goto            3564
        //  3564: goto            3568
        //  3567: athrow         
        //  3568: invokestatic    dev/nuker/pyro/fbP.1:()Ldev/nuker/pyro/fbP;
        //  3571: goto            3575
        //  3574: athrow         
        //  3575: aload_0        
        //  3576: getstatic       dev/nuker/pyro/fc.1:I
        //  3579: ifeq            3588
        //  3582: ldc_w           1752452234
        //  3585: goto            3591
        //  3588: ldc_w           1464334456
        //  3591: ldc_w           -1988905986
        //  3594: ixor           
        //  3595: lookupswitch {
        //          -566998138: 3620
        //          -519569548: 3588
        //          default: 5416
        //        }
        //  3620: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  3623: aload_0        
        //  3624: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0d;
        //  3627: getstatic       dev/nuker/pyro/fc.1:I
        //  3630: ifeq            3639
        //  3633: ldc_w           -334065843
        //  3636: goto            3642
        //  3639: ldc_w           871200612
        //  3642: ldc_w           -1182935898
        //  3645: ixor           
        //  3646: lookupswitch {
        //          -1970232382: 3672
        //          1433099243: 3639
        //          default: 5404
        //        }
        //  3672: goto            3676
        //  3675: athrow         
        //  3676: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  3679: goto            3683
        //  3682: athrow         
        //  3683: checkcast       Ljava/lang/Double;
        //  3686: getstatic       dev/nuker/pyro/fc.c:I
        //  3689: ifge            3698
        //  3692: ldc_w           1865624180
        //  3695: goto            3701
        //  3698: ldc_w           -362761091
        //  3701: ldc_w           310617921
        //  3704: ixor           
        //  3705: lookupswitch {
        //          -119336132: 3732
        //          2108722485: 3698
        //          default: 5362
        //        }
        //  3732: goto            3736
        //  3735: athrow         
        //  3736: invokevirtual   java/lang/Double.doubleValue:()D
        //  3739: goto            3743
        //  3742: athrow         
        //  3743: goto            3747
        //  3746: athrow         
        //  3747: invokevirtual   dev/nuker/pyro/fbP.c:(Lnet/minecraft/entity/Entity;D)Z
        //  3750: goto            3754
        //  3753: athrow         
        //  3754: istore_3       
        //  3755: aconst_null    
        //  3756: astore          4
        //  3758: iload_3        
        //  3759: ifne            3768
        //  3762: ldc_w           -1673241256
        //  3765: goto            3771
        //  3768: ldc_w           -1673241253
        //  3771: ldc_w           -887660671
        //  3774: ixor           
        //  3775: tableswitch {
        //          -1364851278: 3796
        //          -1364851277: 3884
        //          default: 3762
        //        }
        //  3796: goto            3800
        //  3799: athrow         
        //  3800: invokestatic    dev/nuker/pyro/fbP.1:()Ldev/nuker/pyro/fbP;
        //  3803: goto            3807
        //  3806: athrow         
        //  3807: getstatic       dev/nuker/pyro/fc.1:I
        //  3810: ifeq            3819
        //  3813: ldc_w           220354037
        //  3816: goto            3822
        //  3819: ldc_w           546817669
        //  3822: ldc_w           -1742313307
        //  3825: ixor           
        //  3826: lookupswitch {
        //          -1794884272: 5324
        //          89433136: 3819
        //          default: 3852
        //        }
        //  3852: aload_0        
        //  3853: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  3856: goto            3860
        //  3859: athrow         
        //  3860: invokevirtual   net/minecraft/entity/Entity.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //  3863: goto            3867
        //  3866: athrow         
        //  3867: iconst_0       
        //  3868: iconst_1       
        //  3869: iconst_0       
        //  3870: iconst_1       
        //  3871: goto            3875
        //  3874: athrow         
        //  3875: invokevirtual   dev/nuker/pyro/fbP.c:(Lnet/minecraft/util/math/AxisAlignedBB;ZZZZ)Ldev/nuker/pyro/fbQ;
        //  3878: goto            3882
        //  3881: athrow         
        //  3882: astore          4
        //  3884: aload           4
        //  3886: ifnull          4166
        //  3889: aload           4
        //  3891: ifnull          3900
        //  3894: ldc_w           -1449141545
        //  3897: goto            3903
        //  3900: ldc_w           -1449141546
        //  3903: ldc_w           1628383971
        //  3906: ixor           
        //  3907: tableswitch {
        //          -1860050840: 3928
        //          -1860050839: 4166
        //          default: 3894
        //        }
        //  3928: getstatic       dev/nuker/pyro/fc.0:I
        //  3931: ifeq            3940
        //  3934: ldc_w           -1064044356
        //  3937: goto            3943
        //  3940: ldc_w           1275471218
        //  3943: ldc_w           -31932599
        //  3946: ixor           
        //  3947: lookupswitch {
        //          -828933218: 3940
        //          1049315317: 5392
        //          default: 3972
        //        }
        //  3972: goto            3976
        //  3975: athrow         
        //  3976: invokestatic    dev/nuker/pyro/fbP.1:()Ldev/nuker/pyro/fbP;
        //  3979: goto            3983
        //  3982: athrow         
        //  3983: goto            3987
        //  3986: athrow         
        //  3987: invokestatic    dev/nuker/pyro/fbP.1:()Ldev/nuker/pyro/fbP;
        //  3990: goto            3994
        //  3993: athrow         
        //  3994: getfield        dev/nuker/pyro/fbP.0:Ldev/nuker/pyro/fbN;
        //  3997: aload           4
        //  3999: goto            4003
        //  4002: athrow         
        //  4003: invokevirtual   dev/nuker/pyro/fbQ.1:()Ldev/nuker/pyro/fbN;
        //  4006: goto            4010
        //  4009: athrow         
        //  4010: ldc_w           180.0
        //  4013: goto            4017
        //  4016: athrow         
        //  4017: invokevirtual   dev/nuker/pyro/fbP.c:(Ldev/nuker/pyro/fbN;Ldev/nuker/pyro/fbN;F)Ldev/nuker/pyro/fbN;
        //  4020: goto            4024
        //  4023: athrow         
        //  4024: astore          5
        //  4026: aload           5
        //  4028: ifnull          4037
        //  4031: ldc_w           32651507
        //  4034: goto            4040
        //  4037: ldc_w           32651506
        //  4040: ldc_w           -28147529
        //  4043: ixor           
        //  4044: tableswitch {
        //          -12488568: 4068
        //          -12488567: 4166
        //          default: 4031
        //        }
        //  4068: aload_0        
        //  4069: iconst_2       
        //  4070: newarray        F
        //  4072: dup            
        //  4073: iconst_0       
        //  4074: aload           5
        //  4076: goto            4080
        //  4079: athrow         
        //  4080: invokevirtual   dev/nuker/pyro/fbN.c:()F
        //  4083: goto            4087
        //  4086: athrow         
        //  4087: fastore        
        //  4088: dup            
        //  4089: iconst_1       
        //  4090: aload           5
        //  4092: goto            4096
        //  4095: athrow         
        //  4096: invokevirtual   dev/nuker/pyro/fbN.2:()F
        //  4099: goto            4103
        //  4102: athrow         
        //  4103: fastore        
        //  4104: putfield        dev/nuker/pyro/f4U.c:[F
        //  4107: aload_0        
        //  4108: getstatic       dev/nuker/pyro/fc.1:I
        //  4111: ifeq            4120
        //  4114: ldc_w           -255877466
        //  4117: goto            4123
        //  4120: ldc_w           -1798143338
        //  4123: ldc_w           1794367155
        //  4126: ixor           
        //  4127: lookupswitch {
        //          -1706278891: 4120
        //          -31368155: 4152
        //          default: 5428
        //        }
        //  4152: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/fbu;
        //  4155: goto            4159
        //  4158: athrow         
        //  4159: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //  4162: goto            4166
        //  4165: athrow         
        //  4166: iload_3        
        //  4167: ifeq            5315
        //  4170: aload_0        
        //  4171: getfield        dev/nuker/pyro/f4U.1:I
        //  4174: ifle            4188
        //  4177: aload_0        
        //  4178: dup            
        //  4179: getfield        dev/nuker/pyro/f4U.1:I
        //  4182: iconst_1       
        //  4183: isub           
        //  4184: putfield        dev/nuker/pyro/f4U.1:I
        //  4187: return         
        //  4188: aload_0        
        //  4189: getstatic       dev/nuker/pyro/fc.c:I
        //  4192: ifge            4201
        //  4195: ldc_w           -141040975
        //  4198: goto            4204
        //  4201: ldc_w           -846484561
        //  4204: ldc_w           -1845068474
        //  4207: ixor           
        //  4208: lookupswitch {
        //          1603131113: 4236
        //          1704042487: 4201
        //          default: 5350
        //        }
        //  4236: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/fbu;
        //  4239: goto            4243
        //  4242: athrow         
        //  4243: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //  4246: goto            4250
        //  4249: athrow         
        //  4250: aload_0        
        //  4251: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  4254: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4257: goto            4261
        //  4260: athrow         
        //  4261: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184592_cb:()Lnet/minecraft/item/ItemStack;
        //  4264: goto            4268
        //  4267: athrow         
        //  4268: goto            4272
        //  4271: athrow         
        //  4272: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  4275: goto            4279
        //  4278: athrow         
        //  4279: instanceof      Lnet/minecraft/item/ItemShield;
        //  4282: istore          5
        //  4284: getstatic       dev/nuker/pyro/fc.1:I
        //  4287: ifeq            4296
        //  4290: ldc_w           2102175774
        //  4293: goto            4299
        //  4296: ldc_w           246857940
        //  4299: ldc_w           763224718
        //  4302: ixor           
        //  4303: lookupswitch {
        //          600515162: 4328
        //          1345407632: 4296
        //          default: 5432
        //        }
        //  4328: aload_0        
        //  4329: goto            4333
        //  4332: athrow         
        //  4333: invokevirtual   dev/nuker/pyro/f4U.c:()Z
        //  4336: goto            4340
        //  4339: athrow         
        //  4340: ifeq            4971
        //  4343: aload_0        
        //  4344: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0a;
        //  4347: goto            4351
        //  4350: athrow         
        //  4351: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  4354: goto            4358
        //  4357: athrow         
        //  4358: checkcast       Ljava/lang/Boolean;
        //  4361: goto            4365
        //  4364: athrow         
        //  4365: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  4368: goto            4372
        //  4371: athrow         
        //  4372: ifne            4411
        //  4375: aload_0        
        //  4376: bipush          40
        //  4378: aload_0        
        //  4379: getfield        dev/nuker/pyro/f4U.c:Ldev/nuker/pyro/f0g;
        //  4382: goto            4386
        //  4385: athrow         
        //  4386: invokevirtual   dev/nuker/pyro/f0g.3:()Ljava/lang/Object;
        //  4389: goto            4393
        //  4392: athrow         
        //  4393: checkcast       Ljava/lang/Integer;
        //  4396: goto            4400
        //  4399: athrow         
        //  4400: invokevirtual   java/lang/Integer.intValue:()I
        //  4403: goto            4407
        //  4406: athrow         
        //  4407: idiv           
        //  4408: putfield        dev/nuker/pyro/f4U.1:I
        //  4411: iload           5
        //  4413: ifeq            4422
        //  4416: ldc_w           269768666
        //  4419: goto            4425
        //  4422: ldc_w           269768667
        //  4425: ldc_w           -190985670
        //  4428: ixor           
        //  4429: tableswitch {
        //          -921486400: 4452
        //          -921486399: 4682
        //          default: 4416
        //        }
        //  4452: aload_0        
        //  4453: getfield        dev/nuker/pyro/f4U.2:Ldev/nuker/pyro/f0a;
        //  4456: goto            4460
        //  4459: athrow         
        //  4460: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  4463: goto            4467
        //  4466: athrow         
        //  4467: checkcast       Ljava/lang/Boolean;
        //  4470: goto            4474
        //  4473: athrow         
        //  4474: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  4477: goto            4481
        //  4480: athrow         
        //  4481: ifeq            4682
        //  4484: getstatic       dev/nuker/pyro/fc.0:I
        //  4487: ifeq            4496
        //  4490: ldc_w           344248525
        //  4493: goto            4499
        //  4496: ldc_w           2013078717
        //  4499: ldc_w           1200131319
        //  4502: ixor           
        //  4503: lookupswitch {
        //          813017162: 4528
        //          1393318970: 4496
        //          default: 5372
        //        }
        //  4528: aload_0        
        //  4529: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  4532: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4535: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  4538: new             Lnet/minecraft/network/play/client/CPacketPlayerDigging;
        //  4541: dup            
        //  4542: getstatic       net/minecraft/network/play/client/CPacketPlayerDigging$Action.RELEASE_USE_ITEM:Lnet/minecraft/network/play/client/CPacketPlayerDigging$Action;
        //  4545: getstatic       net/minecraft/util/math/BlockPos.field_177992_a:Lnet/minecraft/util/math/BlockPos;
        //  4548: aload_0        
        //  4549: getstatic       dev/nuker/pyro/fc.c:I
        //  4552: ifge            4561
        //  4555: ldc_w           680651113
        //  4558: goto            4564
        //  4561: ldc_w           1195927096
        //  4564: ldc_w           -2069566517
        //  4567: ixor           
        //  4568: lookupswitch {
        //          -2028810833: 4561
        //          -1405812062: 5320
        //          default: 4596
        //        }
        //  4596: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  4599: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4602: goto            4606
        //  4605: athrow         
        //  4606: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174811_aO:()Lnet/minecraft/util/EnumFacing;
        //  4609: goto            4613
        //  4612: athrow         
        //  4613: getstatic       dev/nuker/pyro/fc.1:I
        //  4616: ifeq            4625
        //  4619: ldc_w           1769761906
        //  4622: goto            4628
        //  4625: ldc_w           -1962062337
        //  4628: ldc_w           -2072977464
        //  4631: ixor           
        //  4632: lookupswitch {
        //          -317934662: 4625
        //          259887671: 4660
        //          default: 5322
        //        }
        //  4660: goto            4664
        //  4663: athrow         
        //  4664: invokespecial   net/minecraft/network/play/client/CPacketPlayerDigging.<init>:(Lnet/minecraft/network/play/client/CPacketPlayerDigging$Action;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V
        //  4667: goto            4671
        //  4670: athrow         
        //  4671: goto            4675
        //  4674: athrow         
        //  4675: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  4678: goto            4682
        //  4681: athrow         
        //  4682: aload_0        
        //  4683: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  4686: getstatic       dev/nuker/pyro/fc.c:I
        //  4689: ifge            4698
        //  4692: ldc_w           -1019868463
        //  4695: goto            4701
        //  4698: ldc_w           1582019420
        //  4701: ldc_w           779696169
        //  4704: ixor           
        //  4705: lookupswitch {
        //          -313576712: 4698
        //          1882360693: 4732
        //          default: 5368
        //        }
        //  4732: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  4735: aload_0        
        //  4736: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  4739: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4742: aload_0        
        //  4743: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  4746: goto            4750
        //  4749: athrow         
        //  4750: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78764_a:(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/Entity;)V
        //  4753: goto            4757
        //  4756: athrow         
        //  4757: aload_0        
        //  4758: getstatic       dev/nuker/pyro/fc.c:I
        //  4761: ifge            4770
        //  4764: ldc_w           1400066505
        //  4767: goto            4773
        //  4770: ldc_w           994546146
        //  4773: ldc_w           -441516341
        //  4776: ixor           
        //  4777: lookupswitch {
        //          -1226985726: 4770
        //          -555126999: 4804
        //          default: 5316
        //        }
        //  4804: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  4807: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4810: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //  4813: getstatic       dev/nuker/pyro/fc.1:I
        //  4816: ifeq            4825
        //  4819: ldc_w           1803386294
        //  4822: goto            4828
        //  4825: ldc_w           -275451873
        //  4828: ldc_w           2120092236
        //  4831: ixor           
        //  4832: lookupswitch {
        //          -1848968621: 4860
        //          354646010: 4825
        //          default: 5374
        //        }
        //  4860: goto            4864
        //  4863: athrow         
        //  4864: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184609_a:(Lnet/minecraft/util/EnumHand;)V
        //  4867: goto            4871
        //  4870: athrow         
        //  4871: getstatic       dev/nuker/pyro/fc.0:I
        //  4874: ifeq            4883
        //  4877: ldc_w           -605592207
        //  4880: goto            4886
        //  4883: ldc_w           53536889
        //  4886: ldc_w           1225551656
        //  4889: ixor           
        //  4890: lookupswitch {
        //          -1830090151: 4883
        //          1245480785: 4916
        //          default: 5388
        //        }
        //  4916: aload_0        
        //  4917: aload_0        
        //  4918: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/entity/Entity;
        //  4921: getstatic       dev/nuker/pyro/fc.0:I
        //  4924: ifeq            4933
        //  4927: ldc_w           1443490902
        //  4930: goto            4936
        //  4933: ldc_w           208819055
        //  4936: ldc_w           227660948
        //  4939: ixor           
        //  4940: lookupswitch {
        //          -1078504764: 4933
        //          1536702658: 5424
        //          default: 4968
        //        }
        //  4968: putfield        dev/nuker/pyro/f4U.0:Lnet/minecraft/entity/Entity;
        //  4971: iload           5
        //  4973: ifeq            5315
        //  4976: aload_0        
        //  4977: getstatic       dev/nuker/pyro/fc.1:I
        //  4980: ifeq            4989
        //  4983: ldc_w           -1565132845
        //  4986: goto            4992
        //  4989: ldc_w           249693545
        //  4992: ldc_w           -1528668144
        //  4995: ixor           
        //  4996: lookupswitch {
        //          106403779: 5394
        //          1555992727: 4989
        //          default: 5024
        //        }
        //  5024: getfield        dev/nuker/pyro/f4U.2:Ldev/nuker/pyro/f0a;
        //  5027: goto            5031
        //  5030: athrow         
        //  5031: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  5034: goto            5038
        //  5037: athrow         
        //  5038: checkcast       Ljava/lang/Boolean;
        //  5041: goto            5045
        //  5044: athrow         
        //  5045: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  5048: goto            5052
        //  5051: athrow         
        //  5052: ifeq            5061
        //  5055: ldc_w           930603384
        //  5058: goto            5064
        //  5061: ldc_w           930603367
        //  5064: ldc_w           467502487
        //  5067: ixor           
        //  5068: tableswitch {
        //          1498728926: 5092
        //          1498728927: 5315
        //          default: 5055
        //        }
        //  5092: getstatic       dev/nuker/pyro/fc.0:I
        //  5095: ifeq            5104
        //  5098: ldc_w           -982889151
        //  5101: goto            5107
        //  5104: ldc_w           1148263480
        //  5107: ldc_w           1267824269
        //  5110: ixor           
        //  5111: lookupswitch {
        //          -1896137780: 5104
        //          266365621: 5136
        //          default: 5402
        //        }
        //  5136: aload_0        
        //  5137: getstatic       dev/nuker/pyro/fc.1:I
        //  5140: ifeq            5149
        //  5143: ldc_w           -470415030
        //  5146: goto            5152
        //  5149: ldc_w           -121360650
        //  5152: ldc_w           -1211526260
        //  5155: ixor           
        //  5156: lookupswitch {
        //          -364680704: 5149
        //          1413454534: 5442
        //          default: 5184
        //        }
        //  5184: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //  5187: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  5190: getstatic       dev/nuker/pyro/fc.0:I
        //  5193: ifeq            5202
        //  5196: ldc_w           919491933
        //  5199: goto            5205
        //  5202: ldc_w           -1271158229
        //  5205: ldc_w           -286211724
        //  5208: ixor           
        //  5209: lookupswitch {
        //          -666987479: 5408
        //          1020259811: 5202
        //          default: 5236
        //        }
        //  5236: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  5239: new             Lnet/minecraft/network/play/client/CPacketPlayerTryUseItem;
        //  5242: dup            
        //  5243: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //  5246: goto            5250
        //  5249: athrow         
        //  5250: invokespecial   net/minecraft/network/play/client/CPacketPlayerTryUseItem.<init>:(Lnet/minecraft/util/EnumHand;)V
        //  5253: goto            5257
        //  5256: athrow         
        //  5257: getstatic       dev/nuker/pyro/fc.1:I
        //  5260: ifeq            5269
        //  5263: ldc_w           339472356
        //  5266: goto            5272
        //  5269: ldc_w           -1800055608
        //  5272: ldc_w           -1349137920
        //  5275: ixor           
        //  5276: lookupswitch {
        //          -1146214940: 5269
        //          991993544: 5304
        //          default: 5400
        //        }
        //  5304: goto            5308
        //  5307: athrow         
        //  5308: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  5311: goto            5315
        //  5314: athrow         
        //  5315: return         
        //  5316: aconst_null    
        //  5317: athrow         
        //  5318: aconst_null    
        //  5319: athrow         
        //  5320: aconst_null    
        //  5321: athrow         
        //  5322: aconst_null    
        //  5323: athrow         
        //  5324: aconst_null    
        //  5325: athrow         
        //  5326: aconst_null    
        //  5327: athrow         
        //  5328: aconst_null    
        //  5329: athrow         
        //  5330: aconst_null    
        //  5331: athrow         
        //  5332: aconst_null    
        //  5333: athrow         
        //  5334: aconst_null    
        //  5335: athrow         
        //  5336: aconst_null    
        //  5337: athrow         
        //  5338: aconst_null    
        //  5339: athrow         
        //  5340: aconst_null    
        //  5341: athrow         
        //  5342: aconst_null    
        //  5343: athrow         
        //  5344: aconst_null    
        //  5345: athrow         
        //  5346: aconst_null    
        //  5347: athrow         
        //  5348: aconst_null    
        //  5349: athrow         
        //  5350: aconst_null    
        //  5351: athrow         
        //  5352: aconst_null    
        //  5353: athrow         
        //  5354: aconst_null    
        //  5355: athrow         
        //  5356: aconst_null    
        //  5357: athrow         
        //  5358: aconst_null    
        //  5359: athrow         
        //  5360: aconst_null    
        //  5361: athrow         
        //  5362: aconst_null    
        //  5363: athrow         
        //  5364: aconst_null    
        //  5365: athrow         
        //  5366: aconst_null    
        //  5367: athrow         
        //  5368: aconst_null    
        //  5369: athrow         
        //  5370: aconst_null    
        //  5371: athrow         
        //  5372: aconst_null    
        //  5373: athrow         
        //  5374: aconst_null    
        //  5375: athrow         
        //  5376: aconst_null    
        //  5377: athrow         
        //  5378: aconst_null    
        //  5379: athrow         
        //  5380: aconst_null    
        //  5381: athrow         
        //  5382: aconst_null    
        //  5383: athrow         
        //  5384: aconst_null    
        //  5385: athrow         
        //  5386: aconst_null    
        //  5387: athrow         
        //  5388: aconst_null    
        //  5389: athrow         
        //  5390: aconst_null    
        //  5391: athrow         
        //  5392: aconst_null    
        //  5393: athrow         
        //  5394: aconst_null    
        //  5395: athrow         
        //  5396: aconst_null    
        //  5397: athrow         
        //  5398: aconst_null    
        //  5399: athrow         
        //  5400: aconst_null    
        //  5401: athrow         
        //  5402: aconst_null    
        //  5403: athrow         
        //  5404: aconst_null    
        //  5405: athrow         
        //  5406: aconst_null    
        //  5407: athrow         
        //  5408: aconst_null    
        //  5409: athrow         
        //  5410: aconst_null    
        //  5411: athrow         
        //  5412: aconst_null    
        //  5413: athrow         
        //  5414: aconst_null    
        //  5415: athrow         
        //  5416: aconst_null    
        //  5417: athrow         
        //  5418: aconst_null    
        //  5419: athrow         
        //  5420: aconst_null    
        //  5421: athrow         
        //  5422: aconst_null    
        //  5423: athrow         
        //  5424: aconst_null    
        //  5425: athrow         
        //  5426: aconst_null    
        //  5427: athrow         
        //  5428: aconst_null    
        //  5429: athrow         
        //  5430: aconst_null    
        //  5431: athrow         
        //  5432: aconst_null    
        //  5433: athrow         
        //  5434: aconst_null    
        //  5435: athrow         
        //  5436: aconst_null    
        //  5437: athrow         
        //  5438: aconst_null    
        //  5439: athrow         
        //  5440: aconst_null    
        //  5441: athrow         
        //  5442: aconst_null    
        //  5443: athrow         
        //  5444: aconst_null    
        //  5445: athrow         
        //  5446: aconst_null    
        //  5447: athrow         
        //  5448: aconst_null    
        //  5449: athrow         
        //  5450: pop            
        //  5451: goto            24
        //  5454: pop            
        //  5455: aconst_null    
        //  5456: goto            5450
        //  5459: dup            
        //  5460: ifnull          5450
        //  5463: checkcast       Ljava/lang/Throwable;
        //  5466: athrow         
        //  5467: dup            
        //  5468: ifnull          5454
        //  5471: checkcast       Ljava/lang/Throwable;
        //  5474: athrow         
        //  5475: aconst_null    
        //  5476: athrow         
        //    StackMapTable: 02 B8 43 07 00 47 04 FF 00 0B 00 00 00 01 07 00 47 FD 00 03 07 00 03 07 05 31 4F 07 02 1F FF 00 02 00 02 07 00 03 07 05 31 00 02 07 02 1F 01 5C 07 02 1F 06 FF 00 0D 00 02 07 00 03 07 05 31 00 02 07 00 03 07 00 03 FF 00 02 00 02 07 00 03 07 05 31 00 03 07 00 03 07 00 03 01 FF 00 1F 00 02 07 00 03 07 05 31 00 02 07 00 03 07 00 03 45 07 00 47 FF 00 00 00 02 07 00 03 07 05 31 00 02 07 00 03 07 00 97 45 07 00 47 FF 00 00 00 02 07 00 03 07 05 31 00 02 07 00 03 07 03 13 FF 00 0B 00 02 07 00 03 07 05 31 00 02 07 00 03 07 03 13 FF 00 02 00 02 07 00 03 07 05 31 00 03 07 00 03 07 03 13 01 FF 00 1E 00 02 07 00 03 07 05 31 00 02 07 00 03 07 03 13 42 07 00 39 FF 00 00 00 02 07 00 03 07 05 31 00 02 07 00 03 07 03 13 45 07 00 47 FF 00 00 00 02 07 00 03 07 05 31 00 02 07 00 03 07 01 EB 42 07 02 0F FF 00 00 00 02 07 00 03 07 05 31 00 02 07 00 03 07 01 EB 45 07 00 47 00 FF 00 08 00 00 00 01 07 00 47 FF 00 00 00 02 07 00 03 07 05 31 00 01 07 03 30 45 07 00 47 40 07 03 13 4E 07 02 4E FF 00 02 00 02 07 00 03 07 05 31 00 02 07 02 4E 01 5E 07 02 4E 42 07 00 47 40 07 02 4E 45 07 00 47 40 01 0C 4C 07 00 03 FF 00 02 00 02 07 00 03 07 05 31 00 02 07 00 03 01 5F 07 00 03 42 07 01 F1 40 07 00 03 45 07 00 47 40 01 FF 00 0A 00 03 07 00 03 07 05 31 01 00 01 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 01 C5 03 45 07 00 47 40 01 0E 42 01 1F 03 05 42 01 1A 4F 07 01 C5 FF 00 02 00 03 07 00 03 07 05 31 01 00 02 07 01 C5 01 5C 07 01 C5 FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 01 07 01 C5 45 07 00 47 00 0B 42 01 1D FF 00 0D 00 03 07 00 03 07 05 31 01 00 02 07 00 03 05 FF 00 02 00 03 07 00 03 07 05 31 01 00 03 07 00 03 05 01 FF 00 1E 00 03 07 00 03 07 05 31 01 00 02 07 00 03 05 0C 04 49 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 05 32 07 00 97 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 05 32 07 03 13 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 05 32 07 00 9D 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 05 32 01 1D FF 00 0D 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 00 03 FF 00 02 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 00 03 01 FF 00 1E 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 00 03 FF 00 14 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 6C FF 00 02 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 6C 01 FF 00 1F 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 6C 42 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 6C 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 83 48 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 05 34 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 83 48 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 05 36 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 03 93 42 07 01 F1 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 03 93 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 9D FF 00 03 00 00 00 01 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 9D 05 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 13 08 FF 00 17 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 02 1F FF 00 02 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 02 1F 01 FF 00 1D 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 02 1F 48 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 6C 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 83 48 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 05 34 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 83 FF 00 0B 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 83 FF 00 02 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 01 FF 00 1E 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 83 48 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 05 36 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 03 93 FF 00 0B 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 03 93 FF 00 02 00 03 07 00 03 07 05 31 01 00 04 07 00 03 07 03 83 07 03 93 01 FF 00 1F 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 03 93 FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 03 93 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 9D FF 00 03 00 00 00 01 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 9D 05 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 13 08 4D 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 85 07 02 06 45 07 00 47 40 02 FF 00 10 00 03 07 00 03 07 05 31 01 00 02 03 07 00 A7 FF 00 02 00 03 07 00 03 07 05 31 01 00 03 03 07 00 A7 01 FF 00 1F 00 03 07 00 03 07 05 31 01 00 02 03 07 00 A7 FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 03 07 00 A7 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 03 07 03 13 45 07 02 15 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 03 07 03 06 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 03 03 0F 42 01 1F 4C 07 00 03 FF 00 02 00 03 07 00 03 07 05 31 01 00 02 07 00 03 01 5F 07 00 03 4C 07 01 F1 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 6C 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 83 48 07 02 0B FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 05 34 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 83 48 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 05 36 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 03 93 FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 03 93 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 9D 43 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 9D 05 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 13 08 4C 07 00 03 FF 00 02 00 03 07 00 03 07 05 31 01 00 02 07 00 03 01 5E 07 00 03 FF 00 0F 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 02 1F FF 00 02 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 02 1F 01 FF 00 1C 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 02 1F 48 07 02 0B FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 6C 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 83 48 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 05 34 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 83 FF 00 08 00 00 00 01 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 05 36 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 03 93 FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 03 93 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 9D FF 00 03 00 00 00 01 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 9D 05 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 13 FF 00 0E 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 00 85 FF 00 02 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 00 85 01 FF 00 1D 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 00 85 0E 42 01 1D 53 07 00 03 FF 00 02 00 03 07 00 03 07 05 31 01 00 02 07 00 03 01 5C 07 00 03 09 4D 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 6C 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 83 48 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 05 34 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 83 47 07 01 F1 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 05 36 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 83 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 05 36 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 03 93 42 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 03 93 47 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 9D 43 07 01 F1 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 9D 05 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 13 08 1C 42 01 1E 4C 07 00 03 FF 00 02 00 03 07 00 03 07 05 31 01 00 02 07 00 03 01 5F 07 00 03 5B 07 00 49 FF 00 02 00 03 07 00 03 07 05 31 01 00 02 07 00 49 01 5C 07 00 49 FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 01 07 00 49 45 07 00 47 40 02 04 0B 42 01 1C 04 4C 07 00 03 FF 00 02 00 03 07 00 03 07 05 31 01 00 02 07 00 03 01 5E 07 00 03 05 05 42 01 18 FF 00 12 00 03 07 00 03 07 05 31 01 00 02 07 05 32 07 00 97 FF 00 02 00 03 07 00 03 07 05 31 01 00 03 07 05 32 07 00 97 01 FF 00 1D 00 03 07 00 03 07 05 31 01 00 02 07 05 32 07 00 97 FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 05 32 07 00 97 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 05 32 07 03 13 FF 00 05 00 00 00 01 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 05 32 07 00 BE 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 02 07 05 32 01 1A 02 4C 07 00 03 FF 00 02 00 03 07 00 03 07 05 31 01 00 02 07 00 03 01 5C 07 00 03 FF 00 08 00 00 00 01 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 01 07 02 06 45 07 00 47 40 07 02 84 42 07 00 3B 40 07 02 84 45 07 00 47 40 07 05 38 05 05 42 01 18 00 4C 01 FF 00 02 00 03 07 00 03 07 05 31 01 00 02 01 01 5E 01 FE 00 06 01 03 01 FF 00 1E 00 06 07 00 03 07 05 31 01 01 03 01 00 02 07 02 6D 01 FF 00 02 00 06 07 00 03 07 05 31 01 01 03 01 00 03 07 02 6D 01 01 FF 00 1E 00 06 07 00 03 07 05 31 01 01 03 01 00 02 07 02 6D 01 42 07 00 3B FF 00 00 00 06 07 00 03 07 05 31 01 01 03 01 00 02 07 02 6D 01 45 07 00 47 40 07 02 84 FC 00 0D 07 02 84 42 01 1F 49 07 02 0B 40 07 02 84 45 07 00 47 40 07 05 38 11 42 01 1C 44 07 00 47 40 07 02 84 45 07 00 47 40 07 05 38 05 05 42 01 1B 52 01 FF 00 02 00 07 07 00 03 07 05 31 01 01 03 01 07 02 84 00 02 01 01 5D 01 00 44 07 00 47 40 07 02 84 45 07 00 47 40 07 04 3A 4B 07 04 3A FF 00 02 00 07 07 00 03 07 05 31 01 01 03 01 07 02 84 00 02 07 04 3A 01 5E 07 04 3A FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 07 07 00 03 07 05 31 01 01 03 01 07 02 84 00 01 07 04 3A 47 07 00 47 40 07 04 40 42 07 00 47 40 07 04 40 47 07 00 47 40 07 02 7C FC 00 01 07 02 7C 44 07 01 F1 40 07 02 7C 47 07 00 47 40 01 02 05 42 01 18 0B 42 01 1C 4D 07 02 7C FF 00 02 00 08 07 00 03 07 05 31 01 01 03 01 07 02 84 07 02 7C 00 02 07 02 7C 01 5E 07 02 7C 42 07 00 3D 40 07 02 7C 47 07 00 47 40 07 03 13 4E 07 04 4C FF 00 02 00 08 07 00 03 07 05 31 01 01 03 01 07 02 84 07 02 7C 00 02 07 04 4C 01 5C 07 04 4C FC 00 09 07 04 4C 05 42 01 18 FC 00 12 07 04 51 42 01 1D 0A FF 00 06 00 00 00 01 07 00 47 FF 00 00 00 0A 07 00 03 07 05 31 01 01 03 01 07 02 84 07 02 7C 07 04 4C 07 04 51 00 02 07 04 4C 07 02 84 45 07 00 47 40 01 FC 00 0E 03 42 01 1F 4D 03 FF 00 02 00 0B 07 00 03 07 05 31 01 01 03 01 07 02 84 07 02 7C 07 04 4C 07 04 51 03 00 02 03 01 5E 03 11 42 01 1E 4D 03 FF 00 02 00 0B 07 00 03 07 05 31 01 01 03 01 07 02 84 07 02 7C 07 04 4C 07 04 51 03 00 02 03 01 5E 03 F9 00 04 F9 00 02 FA 00 05 FF 00 1B 00 06 07 00 03 07 05 31 01 01 03 01 00 02 07 02 6D 01 FF 00 02 00 06 07 00 03 07 05 31 01 01 03 01 00 03 07 02 6D 01 01 FF 00 1E 00 06 07 00 03 07 05 31 01 01 03 01 00 02 07 02 6D 01 0E 42 01 1D 4C 07 00 03 FF 00 02 00 06 07 00 03 07 05 31 01 01 03 01 00 02 07 00 03 01 5F 07 00 03 48 07 00 47 40 07 04 7C 45 07 00 47 00 F8 00 02 42 07 00 47 00 45 07 00 47 40 07 04 81 FF 00 0C 00 03 07 00 03 07 05 31 01 00 02 07 04 81 07 00 03 FF 00 02 00 03 07 00 03 07 05 31 01 00 03 07 04 81 07 00 03 01 FF 00 1C 00 03 07 00 03 07 05 31 01 00 02 07 04 81 07 00 03 FF 00 12 00 03 07 00 03 07 05 31 01 00 03 07 04 81 07 00 85 07 00 A7 FF 00 02 00 03 07 00 03 07 05 31 01 00 04 07 04 81 07 00 85 07 00 A7 01 FF 00 1D 00 03 07 00 03 07 05 31 01 00 03 07 04 81 07 00 85 07 00 A7 42 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 04 81 07 00 85 07 00 A7 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 04 81 07 00 85 07 03 13 FF 00 0E 00 03 07 00 03 07 05 31 01 00 03 07 04 81 07 00 85 07 03 06 FF 00 02 00 03 07 00 03 07 05 31 01 00 04 07 04 81 07 00 85 07 03 06 01 FF 00 1E 00 03 07 00 03 07 05 31 01 00 03 07 04 81 07 00 85 07 03 06 42 07 00 3D FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 04 81 07 00 85 07 03 06 45 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 04 81 07 00 85 03 42 07 00 47 FF 00 00 00 03 07 00 03 07 05 31 01 00 03 07 04 81 07 00 85 03 45 07 00 47 40 01 FD 00 07 01 05 05 42 01 18 FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 05 07 00 03 07 05 31 01 01 05 00 00 45 07 00 47 40 07 04 81 4B 07 04 81 FF 00 02 00 05 07 00 03 07 05 31 01 01 05 00 02 07 04 81 01 5D 07 04 81 46 07 00 41 FF 00 00 00 05 07 00 03 07 05 31 01 01 05 00 02 07 04 81 07 00 85 45 07 00 47 FF 00 00 00 05 07 00 03 07 05 31 01 01 05 00 02 07 04 81 07 05 3A 46 07 00 47 FF 00 00 00 05 07 00 03 07 05 31 01 01 05 00 06 07 04 81 07 05 3A 01 01 01 01 45 07 00 47 40 07 04 A8 FF 00 01 00 05 07 00 03 07 05 31 01 01 07 04 A8 00 00 09 05 42 01 18 0B 42 01 1C 42 07 00 47 00 45 07 00 47 40 07 04 81 42 07 00 47 40 07 04 81 45 07 00 47 FF 00 00 00 05 07 00 03 07 05 31 01 01 07 04 A8 00 02 07 04 81 07 04 81 47 07 00 47 FF 00 00 00 05 07 00 03 07 05 31 01 01 07 04 A8 00 03 07 04 81 07 04 B4 07 04 A8 45 07 00 47 FF 00 00 00 05 07 00 03 07 05 31 01 01 07 04 A8 00 03 07 04 81 07 04 B4 07 04 B4 45 07 00 47 FF 00 00 00 05 07 00 03 07 05 31 01 01 07 04 A8 00 04 07 04 81 07 04 B4 07 04 B4 02 45 07 00 47 40 07 04 B4 FC 00 06 07 04 B4 05 42 01 1B 4A 07 00 47 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 07 04 B4 00 05 07 00 03 07 05 3B 07 05 3B 01 07 04 B4 45 07 00 47 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 07 04 B4 00 05 07 00 03 07 05 3B 07 05 3B 01 02 47 07 01 F1 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 07 04 B4 00 05 07 00 03 07 05 3B 07 05 3B 01 07 04 B4 45 07 00 47 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 07 04 B4 00 05 07 00 03 07 05 3B 07 05 3B 01 02 50 07 00 03 FF 00 02 00 06 07 00 03 07 05 31 01 01 07 04 A8 07 04 B4 00 02 07 00 03 01 5C 07 00 03 45 07 00 47 40 07 01 C5 45 07 00 47 FA 00 00 15 4C 07 00 03 FF 00 02 00 05 07 00 03 07 05 31 01 01 07 04 A8 00 02 07 00 03 01 5F 07 00 03 45 07 00 47 40 07 01 C5 45 07 00 47 00 49 07 00 47 40 07 02 06 45 07 00 47 40 07 02 84 42 07 00 47 40 07 02 84 45 07 00 47 40 07 05 38 FC 00 10 01 42 01 1C 43 07 00 47 40 07 00 03 45 07 00 47 40 01 FF 00 09 00 00 00 01 07 00 47 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 01 07 00 D6 45 07 00 47 40 07 03 13 45 07 00 47 40 07 02 4E 45 07 00 47 40 01 4C 07 00 47 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 03 07 00 03 01 07 00 C8 45 07 00 47 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 03 07 00 03 01 07 03 13 45 07 00 47 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 03 07 00 03 01 07 04 CB 45 07 00 47 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 03 07 00 03 01 01 03 04 05 42 01 1A 46 07 00 47 40 07 00 D6 45 07 00 47 40 07 03 13 45 07 00 47 40 07 02 4E 45 07 00 47 40 01 0E 42 01 1C FF 00 20 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 06 07 04 F5 08 11 BA 08 11 BA 07 04 DC 07 04 E2 07 00 03 FF 00 02 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 07 07 04 F5 08 11 BA 08 11 BA 07 04 DC 07 04 E2 07 00 03 01 FF 00 1F 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 06 07 04 F5 08 11 BA 08 11 BA 07 04 DC 07 04 E2 07 00 03 48 07 00 47 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 06 07 04 F5 08 11 BA 08 11 BA 07 04 DC 07 04 E2 07 02 06 45 07 00 47 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 06 07 04 F5 08 11 BA 08 11 BA 07 04 DC 07 04 E2 07 05 3D FF 00 0B 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 06 07 04 F5 08 11 BA 08 11 BA 07 04 DC 07 04 E2 07 05 3D FF 00 02 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 07 07 04 F5 08 11 BA 08 11 BA 07 04 DC 07 04 E2 07 05 3D 01 FF 00 1F 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 06 07 04 F5 08 11 BA 08 11 BA 07 04 DC 07 04 E2 07 05 3D 42 07 00 47 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 06 07 04 F5 08 11 BA 08 11 BA 07 04 DC 07 04 E2 07 05 3D 45 07 00 47 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 04 F5 07 04 DA FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 04 F5 07 04 DA 45 07 00 47 00 4F 07 02 1F FF 00 02 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 02 1F 01 5E 07 02 1F 50 07 00 3D FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 03 07 04 7C 07 02 06 07 00 85 45 07 00 47 00 4C 07 00 03 FF 00 02 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 00 03 01 5E 07 00 03 FF 00 14 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 02 06 07 05 05 FF 00 02 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 03 07 02 06 07 05 05 01 FF 00 1F 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 02 06 07 05 05 42 07 00 47 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 02 06 07 05 05 45 07 00 47 00 0B 42 01 1D FF 00 10 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 00 03 07 00 85 FF 00 02 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 03 07 00 03 07 00 85 01 FF 00 1F 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 00 03 07 00 85 02 51 07 00 03 FF 00 02 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 00 03 01 5F 07 00 03 45 07 00 47 40 07 00 D6 45 07 00 47 40 07 03 13 45 07 00 47 40 07 02 4E 45 07 00 47 40 01 02 05 42 01 1B 0B 42 01 1C 4C 07 00 03 FF 00 02 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 00 03 01 5F 07 00 03 51 07 02 06 FF 00 02 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 02 06 01 5E 07 02 06 4C 07 01 F1 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 04 07 04 F5 08 14 77 08 14 77 07 05 05 45 07 00 47 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 04 F5 07 05 27 FF 00 0B 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 04 F5 07 05 27 FF 00 02 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 03 07 04 F5 07 05 27 01 FF 00 1F 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 04 F5 07 05 27 42 07 00 47 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 04 F5 07 05 27 45 07 00 47 F8 00 00 FF 00 00 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 05 31 01 00 02 07 00 03 05 FF 00 01 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 06 07 04 F5 08 11 BA 08 11 BA 07 04 DC 07 04 E2 07 00 03 FF 00 01 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 06 07 04 F5 08 11 BA 08 11 BA 07 04 DC 07 04 E2 07 05 3D FF 00 01 00 05 07 00 03 07 05 31 01 01 05 00 01 07 04 81 FF 00 01 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 00 03 41 07 00 03 FF 00 01 00 03 07 00 03 07 05 31 01 00 02 03 07 00 A7 FF 00 01 00 0B 07 00 03 07 05 31 01 01 03 01 07 02 84 07 02 7C 07 04 4C 07 04 51 03 00 01 03 FF 00 01 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 83 41 07 00 03 FF 00 01 00 0B 07 00 03 07 05 31 01 01 03 01 07 02 84 07 02 7C 07 04 4C 07 04 51 03 00 00 FF 00 01 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 03 6C 41 07 00 49 FF 00 01 00 07 07 00 03 07 05 31 01 01 03 01 07 02 84 00 01 07 04 3A FF 00 01 00 03 07 00 03 07 05 31 01 00 00 41 07 00 03 FF 00 01 00 05 07 00 03 07 05 31 01 01 07 04 A8 00 01 07 00 03 F9 00 01 FF 00 01 00 06 07 00 03 07 05 31 01 01 03 01 00 02 07 02 6D 01 FF 00 01 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 02 1F FF 00 01 00 03 07 00 03 07 05 31 01 00 03 07 00 03 07 03 83 07 03 93 FF 00 01 00 07 07 00 03 07 05 31 01 01 03 01 07 02 84 00 00 FF 00 01 00 03 07 00 03 07 05 31 01 00 03 07 04 81 07 00 85 07 03 06 41 07 00 03 FF 00 01 00 08 07 00 03 07 05 31 01 01 03 01 07 02 84 07 02 7C 00 00 FF 00 01 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 01 07 02 1F FF 00 01 00 02 07 00 03 07 05 31 00 02 07 00 03 07 03 13 FF 00 01 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 00 FF 00 01 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 02 06 07 05 05 FF 00 01 00 0A 07 00 03 07 05 31 01 01 03 01 07 02 84 07 02 7C 07 04 4C 07 04 51 00 00 FF 00 01 00 02 07 00 03 07 05 31 00 02 07 00 03 07 00 03 FC 00 01 01 01 FF 00 01 00 02 07 00 03 07 05 31 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 05 31 01 00 01 07 00 03 FE 00 01 01 07 04 A8 01 FF 00 01 00 0B 07 00 03 07 05 31 01 01 03 01 07 02 84 07 02 7C 07 04 4C 07 04 51 03 00 00 FF 00 01 00 05 07 00 03 07 05 31 01 01 07 04 A8 00 00 FF 00 01 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 05 31 01 01 03 01 07 02 84 00 01 01 FF 00 01 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 02 1F FF 00 01 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 04 F5 07 05 27 01 FF 00 01 00 03 07 00 03 07 05 31 01 00 03 07 04 81 07 00 85 07 00 A7 FF 00 01 00 03 07 00 03 07 05 31 01 00 02 07 00 03 07 00 85 FF 00 01 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 01 07 02 06 FF 00 01 00 03 07 00 03 07 05 31 01 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 05 31 01 00 02 07 05 32 07 00 97 FF 00 01 00 02 07 00 03 07 05 31 00 01 07 02 4E FF 00 01 00 03 07 00 03 07 05 31 01 00 02 07 04 81 07 00 03 FF 00 01 00 07 07 00 03 07 05 31 01 01 03 01 07 02 84 00 00 FF 00 01 00 06 07 00 03 07 05 31 01 01 03 01 00 01 07 00 03 F8 00 01 FF 00 01 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 02 07 00 03 07 00 85 FF 00 01 00 02 07 00 03 07 05 31 00 01 07 02 1F FF 00 01 00 06 07 00 03 07 05 31 01 01 07 04 A8 07 04 B4 00 01 07 00 03 FF 00 01 00 08 07 00 03 07 05 31 01 01 03 01 07 02 84 07 02 7C 00 01 07 02 7C FF 00 01 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 00 FF 00 01 00 06 07 00 03 07 05 31 01 01 03 01 00 00 FF 00 01 00 0B 07 00 03 07 05 31 01 01 03 01 07 02 84 07 02 7C 07 04 4C 07 04 51 03 00 01 03 FF 00 01 00 08 07 00 03 07 05 31 01 01 03 01 07 02 84 07 02 7C 00 01 07 04 4C FF 00 01 00 06 07 00 03 07 05 31 01 01 03 01 00 02 07 02 6D 01 FF 00 01 00 06 07 00 03 07 05 31 01 01 07 04 A8 01 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 05 31 01 00 01 01 41 07 01 C5 01 FF 00 01 00 02 07 00 03 07 05 31 00 01 07 01 F1 43 05 44 07 01 F1 47 05 47 07 00 47
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     5459   5467   Ljava/lang/UnsupportedOperationException;
        //  5459   5467   5459   5467   Ljava/lang/RuntimeException;
        //  5475   5477   3      8      Any
        //  134    141    141    142    Any
        //  134    141    134    135    Any
        //  134    141    134    135    Any
        //  134    141    141    142    Ljava/lang/EnumConstantNotPresentException;
        //  134    141    141    142    Ljava/lang/StringIndexOutOfBoundsException;
        //  191    198    198    199    Any
        //  191    198    198    199    Ljava/lang/ArithmeticException;
        //  192    198    191    192    Ljava/lang/EnumConstantNotPresentException;
        //  192    198    3      8      Any
        //  191    198    198    199    Any
        //  202    209    209    210    Any
        //  202    209    202    203    Ljava/util/NoSuchElementException;
        //  202    209    209    210    Ljava/lang/NegativeArraySizeException;
        //  202    209    3      8      Ljava/lang/IllegalArgumentException;
        //  202    209    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  220    226    226    227    Any
        //  220    226    226    227    Ljava/lang/NumberFormatException;
        //  220    226    3      8      Ljava/util/ConcurrentModificationException;
        //  220    226    226    227    Any
        //  220    226    3      8      Any
        //  279    286    286    287    Any
        //  279    286    279    280    Ljava/lang/ArithmeticException;
        //  279    286    279    280    Any
        //  279    286    286    287    Ljava/lang/UnsupportedOperationException;
        //  279    286    286    287    Ljava/lang/IllegalArgumentException;
        //  351    358    358    359    Any
        //  351    358    358    359    Ljava/lang/IllegalArgumentException;
        //  351    358    3      8      Any
        //  352    358    3      8      Any
        //  352    358    351    352    Ljava/lang/RuntimeException;
        //  370    377    377    378    Any
        //  370    377    377    378    Ljava/lang/NegativeArraySizeException;
        //  371    377    370    371    Any
        //  371    377    370    371    Ljava/lang/ArithmeticException;
        //  370    377    3      8      Any
        //  520    526    526    527    Any
        //  520    526    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  520    526    3      8      Any
        //  520    526    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  520    526    3      8      Ljava/lang/NullPointerException;
        //  648    655    655    656    Any
        //  648    655    648    649    Any
        //  649    655    655    656    Ljava/util/NoSuchElementException;
        //  648    655    648    649    Any
        //  648    655    655    656    Ljava/lang/NullPointerException;
        //  662    669    669    670    Any
        //  662    669    662    663    Any
        //  662    669    669    670    Ljava/lang/ArithmeticException;
        //  663    669    662    663    Ljava/lang/IllegalStateException;
        //  662    669    662    663    Any
        //  807    816    816    817    Any
        //  808    816    807    808    Any
        //  808    816    807    808    Ljava/lang/EnumConstantNotPresentException;
        //  807    816    816    817    Any
        //  807    816    807    808    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  826    835    835    836    Any
        //  827    835    826    827    Any
        //  827    835    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  826    835    3      8      Any
        //  826    835    835    836    Any
        //  845    852    852    853    Any
        //  845    852    845    846    Any
        //  845    852    852    853    Ljava/lang/StringIndexOutOfBoundsException;
        //  846    852    852    853    Any
        //  846    852    852    853    Ljava/lang/NegativeArraySizeException;
        //  856    865    865    866    Any
        //  856    865    856    857    Ljava/lang/NegativeArraySizeException;
        //  856    865    856    857    Ljava/util/NoSuchElementException;
        //  857    865    856    857    Ljava/lang/NegativeArraySizeException;
        //  856    865    856    857    Ljava/lang/NegativeArraySizeException;
        //  871    877    877    878    Any
        //  871    877    877    878    Any
        //  871    877    3      8      Any
        //  871    877    877    878    Ljava/lang/NullPointerException;
        //  871    877    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  953    962    962    963    Any
        //  954    962    3      8      Any
        //  954    962    962    963    Ljava/lang/UnsupportedOperationException;
        //  953    962    953    954    Any
        //  954    962    3      8      Any
        //  972    981    981    982    Any
        //  972    981    972    973    Any
        //  973    981    972    973    Ljava/lang/StringIndexOutOfBoundsException;
        //  973    981    972    973    Any
        //  973    981    981    982    Ljava/lang/IllegalArgumentException;
        //  1037   1044   1044   1045   Any
        //  1037   1044   1037   1038   Ljava/lang/ClassCastException;
        //  1038   1044   3      8      Ljava/lang/UnsupportedOperationException;
        //  1038   1044   3      8      Any
        //  1037   1044   1037   1038   Any
        //  1096   1104   1104   1105   Any
        //  1096   1104   1104   1105   Ljava/util/NoSuchElementException;
        //  1096   1104   3      8      Ljava/lang/AssertionError;
        //  1096   1104   3      8      Any
        //  1096   1104   1104   1105   Ljava/lang/AssertionError;
        //  1110   1116   1116   1117   Any
        //  1110   1116   3      8      Ljava/lang/RuntimeException;
        //  1110   1116   3      8      Any
        //  1110   1116   3      8      Any
        //  1110   1116   3      8      Any
        //  1140   1147   1147   1148   Any
        //  1140   1147   3      8      Ljava/lang/NullPointerException;
        //  1141   1147   1147   1148   Any
        //  1140   1147   1140   1141   Any
        //  1140   1147   3      8      Any
        //  1204   1210   1210   1211   Any
        //  1204   1210   1210   1211   Any
        //  1204   1210   1210   1211   Ljava/lang/StringIndexOutOfBoundsException;
        //  1204   1210   3      8      Any
        //  1204   1210   3      8      Ljava/lang/NumberFormatException;
        //  1217   1224   1224   1225   Any
        //  1218   1224   3      8      Any
        //  1218   1224   3      8      Any
        //  1217   1224   3      8      Ljava/lang/AssertionError;
        //  1218   1224   1217   1218   Ljava/lang/NullPointerException;
        //  1337   1346   1346   1347   Any
        //  1338   1346   1337   1338   Ljava/lang/ClassCastException;
        //  1337   1346   3      8      Any
        //  1337   1346   3      8      Ljava/util/NoSuchElementException;
        //  1337   1346   1337   1338   Ljava/lang/ArithmeticException;
        //  1356   1365   1365   1366   Any
        //  1356   1365   1365   1366   Any
        //  1356   1365   3      8      Any
        //  1357   1365   1365   1366   Ljava/lang/ArithmeticException;
        //  1356   1365   1356   1357   Ljava/lang/UnsupportedOperationException;
        //  1375   1382   1382   1383   Any
        //  1376   1382   1375   1376   Any
        //  1376   1382   3      8      Ljava/lang/IllegalStateException;
        //  1376   1382   1375   1376   Ljava/lang/IllegalStateException;
        //  1375   1382   1382   1383   Any
        //  1387   1395   1395   1396   Any
        //  1387   1395   3      8      Any
        //  1387   1395   1395   1396   Ljava/util/ConcurrentModificationException;
        //  1387   1395   1395   1396   Any
        //  1387   1395   1395   1396   Any
        //  1400   1407   1407   1408   Any
        //  1401   1407   1400   1401   Any
        //  1401   1407   3      8      Any
        //  1401   1407   3      8      Any
        //  1400   1407   3      8      Ljava/lang/UnsupportedOperationException;
        //  1521   1530   1530   1531   Any
        //  1521   1530   1530   1531   Ljava/util/NoSuchElementException;
        //  1522   1530   1530   1531   Ljava/lang/AssertionError;
        //  1522   1530   1530   1531   Any
        //  1521   1530   1521   1522   Ljava/lang/UnsupportedOperationException;
        //  1540   1549   1549   1550   Any
        //  1540   1549   1540   1541   Any
        //  1541   1549   3      8      Any
        //  1540   1549   1540   1541   Ljava/lang/NullPointerException;
        //  1540   1549   3      8      Ljava/lang/UnsupportedOperationException;
        //  1560   1566   1566   1567   Any
        //  1560   1566   3      8      Ljava/lang/NumberFormatException;
        //  1560   1566   3      8      Any
        //  1560   1566   1566   1567   Any
        //  1560   1566   1566   1567   Ljava/lang/NumberFormatException;
        //  1571   1579   1579   1580   Any
        //  1571   1579   1579   1580   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1571   1579   3      8      Ljava/util/NoSuchElementException;
        //  1571   1579   1579   1580   Any
        //  1571   1579   3      8      Ljava/lang/NegativeArraySizeException;
        //  1585   1591   1591   1592   Any
        //  1585   1591   1591   1592   Any
        //  1585   1591   1591   1592   Ljava/lang/NumberFormatException;
        //  1585   1591   1591   1592   Ljava/lang/EnumConstantNotPresentException;
        //  1585   1591   3      8      Any
        //  1764   1773   1773   1774   Any
        //  1765   1773   3      8      Any
        //  1765   1773   1764   1765   Any
        //  1765   1773   3      8      Ljava/lang/AssertionError;
        //  1764   1773   1764   1765   Any
        //  1783   1792   1792   1793   Any
        //  1784   1792   1783   1784   Any
        //  1784   1792   1792   1793   Any
        //  1783   1792   1792   1793   Ljava/lang/NegativeArraySizeException;
        //  1784   1792   1792   1793   Ljava/lang/ArithmeticException;
        //  1801   1810   1810   1811   Any
        //  1802   1810   1810   1811   Any
        //  1802   1810   1810   1811   Ljava/lang/StringIndexOutOfBoundsException;
        //  1801   1810   1801   1802   Ljava/lang/StringIndexOutOfBoundsException;
        //  1802   1810   1801   1802   Ljava/lang/NumberFormatException;
        //  1819   1826   1826   1827   Any
        //  1820   1826   1819   1820   Any
        //  1820   1826   1826   1827   Any
        //  1819   1826   1819   1820   Ljava/lang/IllegalStateException;
        //  1819   1826   3      8      Any
        //  1830   1839   1839   1840   Any
        //  1831   1839   1839   1840   Ljava/lang/IllegalStateException;
        //  1830   1839   1830   1831   Any
        //  1830   1839   3      8      Ljava/lang/IllegalArgumentException;
        //  1830   1839   1830   1831   Ljava/lang/NegativeArraySizeException;
        //  1844   1851   1851   1852   Any
        //  1844   1851   1844   1845   Ljava/lang/ClassCastException;
        //  1845   1851   3      8      Any
        //  1844   1851   1851   1852   Any
        //  1845   1851   1844   1845   Ljava/lang/NullPointerException;
        //  2036   2042   2042   2043   Any
        //  2036   2042   2042   2043   Any
        //  2036   2042   3      8      Ljava/lang/AssertionError;
        //  2036   2042   3      8      Any
        //  2036   2042   3      8      Any
        //  2240   2246   2246   2247   Any
        //  2240   2246   2246   2247   Any
        //  2240   2246   2246   2247   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2240   2246   2246   2247   Ljava/lang/IllegalStateException;
        //  2240   2246   2246   2247   Any
        //  2254   2260   2260   2261   Any
        //  2254   2260   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2254   2260   2260   2261   Any
        //  2254   2260   2260   2261   Ljava/lang/ClassCastException;
        //  2254   2260   2260   2261   Any
        //  2346   2352   2352   2353   Any
        //  2346   2352   3      8      Ljava/lang/NegativeArraySizeException;
        //  2346   2352   2352   2353   Ljava/lang/IndexOutOfBoundsException;
        //  2346   2352   3      8      Any
        //  2346   2352   2352   2353   Any
        //  2356   2363   2363   2364   Any
        //  2356   2363   2363   2364   Any
        //  2356   2363   2356   2357   Ljava/util/ConcurrentModificationException;
        //  2357   2363   2363   2364   Any
        //  2356   2363   2363   2364   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2527   2534   2534   2535   Any
        //  2528   2534   2527   2528   Ljava/util/ConcurrentModificationException;
        //  2528   2534   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2527   2534   2534   2535   Any
        //  2527   2534   3      8      Any
        //  2594   2601   2601   2602   Any
        //  2594   2601   2594   2595   Ljava/lang/UnsupportedOperationException;
        //  2595   2601   2601   2602   Any
        //  2594   2601   2601   2602   Ljava/lang/IllegalStateException;
        //  2594   2601   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2657   2664   2664   2665   Any
        //  2657   2664   2657   2658   Any
        //  2657   2664   3      8      Ljava/util/NoSuchElementException;
        //  2658   2664   2657   2658   Ljava/lang/EnumConstantNotPresentException;
        //  2658   2664   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2766   2773   2773   2774   Any
        //  2767   2773   2766   2767   Ljava/util/ConcurrentModificationException;
        //  2766   2773   2773   2774   Any
        //  2766   2773   2766   2767   Ljava/lang/AssertionError;
        //  2767   2773   2773   2774   Any
        //  2824   2832   2832   2833   Any
        //  2824   2832   3      8      Any
        //  2824   2832   2832   2833   Ljava/lang/NullPointerException;
        //  2824   2832   3      8      Any
        //  2824   2832   2832   2833   Any
        //  2836   2845   2845   2846   Any
        //  2837   2845   2845   2846   Ljava/util/ConcurrentModificationException;
        //  2837   2845   2845   2846   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2837   2845   2836   2837   Any
        //  2837   2845   2836   2837   Ljava/lang/NumberFormatException;
        //  2853   2862   2862   2863   Any
        //  2853   2862   2853   2854   Ljava/lang/ArithmeticException;
        //  2854   2862   3      8      Ljava/util/ConcurrentModificationException;
        //  2853   2862   2853   2854   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2853   2862   2853   2854   Ljava/lang/UnsupportedOperationException;
        //  2995   3004   3004   3005   Any
        //  2996   3004   3004   3005   Ljava/lang/NullPointerException;
        //  2995   3004   2995   2996   Ljava/lang/StringIndexOutOfBoundsException;
        //  2996   3004   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2995   3004   3004   3005   Ljava/lang/RuntimeException;
        //  3167   3173   3173   3174   Any
        //  3167   3173   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3167   3173   3173   3174   Any
        //  3167   3173   3173   3174   Ljava/lang/RuntimeException;
        //  3167   3173   3173   3174   Ljava/lang/StringIndexOutOfBoundsException;
        //  3553   3560   3560   3561   Any
        //  3553   3560   3553   3554   Any
        //  3554   3560   3560   3561   Ljava/lang/EnumConstantNotPresentException;
        //  3553   3560   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  3553   3560   3560   3561   Any
        //  3567   3574   3574   3575   Any
        //  3568   3574   3567   3568   Any
        //  3567   3574   3574   3575   Any
        //  3568   3574   3567   3568   Any
        //  3567   3574   3574   3575   Any
        //  3675   3682   3682   3683   Any
        //  3676   3682   3682   3683   Ljava/lang/UnsupportedOperationException;
        //  3675   3682   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  3676   3682   3      8      Any
        //  3675   3682   3675   3676   Any
        //  3735   3742   3742   3743   Any
        //  3736   3742   3      8      Ljava/util/ConcurrentModificationException;
        //  3735   3742   3      8      Ljava/lang/IllegalStateException;
        //  3735   3742   3735   3736   Ljava/lang/StringIndexOutOfBoundsException;
        //  3735   3742   3      8      Ljava/util/NoSuchElementException;
        //  3746   3753   3753   3754   Any
        //  3746   3753   3746   3747   Any
        //  3747   3753   3      8      Any
        //  3747   3753   3746   3747   Any
        //  3747   3753   3753   3754   Ljava/lang/RuntimeException;
        //  3800   3806   3806   3807   Any
        //  3800   3806   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3800   3806   3806   3807   Ljava/lang/UnsupportedOperationException;
        //  3800   3806   3      8      Any
        //  3800   3806   3      8      Any
        //  3859   3866   3866   3867   Any
        //  3860   3866   3866   3867   Ljava/lang/ArithmeticException;
        //  3860   3866   3      8      Any
        //  3859   3866   3866   3867   Any
        //  3860   3866   3859   3860   Ljava/lang/IllegalStateException;
        //  3874   3881   3881   3882   Any
        //  3874   3881   3874   3875   Any
        //  3875   3881   3874   3875   Any
        //  3874   3881   3874   3875   Any
        //  3875   3881   3      8      Ljava/lang/IllegalStateException;
        //  3975   3982   3982   3983   Any
        //  3976   3982   3982   3983   Ljava/lang/NullPointerException;
        //  3975   3982   3      8      Any
        //  3976   3982   3975   3976   Any
        //  3975   3982   3      8      Any
        //  3986   3993   3993   3994   Any
        //  3986   3993   3993   3994   Ljava/util/ConcurrentModificationException;
        //  3986   3993   3      8      Any
        //  3986   3993   3      8      Any
        //  3987   3993   3986   3987   Any
        //  4002   4009   4009   4010   Any
        //  4002   4009   4009   4010   Ljava/lang/ClassCastException;
        //  4003   4009   3      8      Any
        //  4002   4009   4009   4010   Ljava/lang/NegativeArraySizeException;
        //  4003   4009   4002   4003   Any
        //  4016   4023   4023   4024   Any
        //  4017   4023   3      8      Ljava/lang/UnsupportedOperationException;
        //  4017   4023   4016   4017   Any
        //  4017   4023   3      8      Ljava/util/NoSuchElementException;
        //  4017   4023   3      8      Ljava/lang/NullPointerException;
        //  4079   4086   4086   4087   Any
        //  4080   4086   4079   4080   Any
        //  4080   4086   3      8      Any
        //  4079   4086   4079   4080   Any
        //  4080   4086   3      8      Any
        //  4095   4102   4102   4103   Any
        //  4095   4102   4095   4096   Ljava/lang/NullPointerException;
        //  4096   4102   4095   4096   Ljava/util/NoSuchElementException;
        //  4095   4102   3      8      Ljava/lang/RuntimeException;
        //  4095   4102   4102   4103   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4158   4165   4165   4166   Any
        //  4159   4165   4165   4166   Any
        //  4158   4165   4158   4159   Any
        //  4159   4165   4158   4159   Any
        //  4159   4165   4165   4166   Any
        //  4242   4249   4249   4250   Any
        //  4243   4249   4242   4243   Any
        //  4243   4249   3      8      Any
        //  4242   4249   3      8      Any
        //  4243   4249   4249   4250   Ljava/lang/ArithmeticException;
        //  4260   4267   4267   4268   Any
        //  4260   4267   4260   4261   Ljava/lang/RuntimeException;
        //  4260   4267   3      8      Any
        //  4260   4267   4260   4261   Any
        //  4260   4267   3      8      Ljava/lang/IllegalArgumentException;
        //  4271   4278   4278   4279   Any
        //  4271   4278   4271   4272   Ljava/util/ConcurrentModificationException;
        //  4271   4278   4271   4272   Any
        //  4272   4278   4278   4279   Ljava/lang/StringIndexOutOfBoundsException;
        //  4271   4278   3      8      Ljava/lang/AssertionError;
        //  4332   4339   4339   4340   Any
        //  4333   4339   4339   4340   Ljava/lang/UnsupportedOperationException;
        //  4332   4339   4332   4333   Ljava/lang/StringIndexOutOfBoundsException;
        //  4332   4339   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4333   4339   4332   4333   Any
        //  4351   4357   4357   4358   Any
        //  4351   4357   4357   4358   Any
        //  4351   4357   3      8      Any
        //  4351   4357   4357   4358   Any
        //  4351   4357   4357   4358   Ljava/util/ConcurrentModificationException;
        //  4364   4371   4371   4372   Any
        //  4364   4371   3      8      Ljava/lang/NegativeArraySizeException;
        //  4365   4371   4364   4365   Any
        //  4365   4371   4364   4365   Ljava/lang/IllegalStateException;
        //  4365   4371   4371   4372   Any
        //  4385   4392   4392   4393   Any
        //  4385   4392   3      8      Any
        //  4385   4392   3      8      Ljava/lang/ArithmeticException;
        //  4386   4392   4385   4386   Any
        //  4386   4392   3      8      Ljava/lang/ClassCastException;
        //  4399   4406   4406   4407   Any
        //  4400   4406   4399   4400   Ljava/lang/RuntimeException;
        //  4400   4406   4399   4400   Any
        //  4400   4406   3      8      Any
        //  4399   4406   4406   4407   Ljava/lang/ClassCastException;
        //  4459   4466   4466   4467   Any
        //  4459   4466   4459   4460   Any
        //  4460   4466   4459   4460   Ljava/lang/NumberFormatException;
        //  4459   4466   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  4460   4466   3      8      Any
        //  4473   4480   4480   4481   Any
        //  4473   4480   4480   4481   Any
        //  4473   4480   4473   4474   Any
        //  4473   4480   4473   4474   Ljava/lang/NullPointerException;
        //  4474   4480   4480   4481   Any
        //  4605   4612   4612   4613   Any
        //  4606   4612   3      8      Ljava/lang/ClassCastException;
        //  4606   4612   4605   4606   Ljava/lang/NegativeArraySizeException;
        //  4605   4612   4605   4606   Any
        //  4605   4612   4605   4606   Ljava/lang/EnumConstantNotPresentException;
        //  4663   4670   4670   4671   Any
        //  4663   4670   4663   4664   Any
        //  4664   4670   4670   4671   Any
        //  4663   4670   4663   4664   Ljava/lang/RuntimeException;
        //  4664   4670   4663   4664   Ljava/lang/NullPointerException;
        //  4675   4681   4681   4682   Any
        //  4675   4681   3      8      Any
        //  4675   4681   3      8      Ljava/lang/IllegalStateException;
        //  4675   4681   3      8      Any
        //  4675   4681   3      8      Any
        //  4749   4756   4756   4757   Any
        //  4750   4756   4756   4757   Ljava/util/ConcurrentModificationException;
        //  4749   4756   4756   4757   Ljava/lang/AssertionError;
        //  4749   4756   3      8      Any
        //  4749   4756   4749   4750   Ljava/lang/StringIndexOutOfBoundsException;
        //  4863   4870   4870   4871   Any
        //  4864   4870   3      8      Ljava/lang/ArithmeticException;
        //  4863   4870   4863   4864   Any
        //  4864   4870   4863   4864   Ljava/lang/EnumConstantNotPresentException;
        //  4864   4870   3      8      Ljava/lang/IllegalArgumentException;
        //  5030   5037   5037   5038   Any
        //  5031   5037   5030   5031   Any
        //  5031   5037   3      8      Ljava/lang/UnsupportedOperationException;
        //  5031   5037   3      8      Any
        //  5030   5037   5037   5038   Any
        //  5044   5051   5051   5052   Any
        //  5044   5051   5051   5052   Ljava/lang/NegativeArraySizeException;
        //  5044   5051   5044   5045   Any
        //  5044   5051   5051   5052   Ljava/lang/NumberFormatException;
        //  5044   5051   5044   5045   Ljava/lang/EnumConstantNotPresentException;
        //  5249   5256   5256   5257   Any
        //  5249   5256   5249   5250   Ljava/lang/IndexOutOfBoundsException;
        //  5249   5256   3      8      Any
        //  5250   5256   5249   5250   Ljava/util/ConcurrentModificationException;
        //  5250   5256   5256   5257   Ljava/lang/RuntimeException;
        //  5307   5314   5314   5315   Any
        //  5307   5314   5307   5308   Any
        //  5307   5314   5314   5315   Any
        //  5308   5314   3      8      Any
        //  5308   5314   3      8      Any
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
    
    public boolean 0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1004
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            996
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            988
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.0:I
        //    28: ifeq            37
        //    31: ldc_w           2027767144
        //    34: goto            40
        //    37: ldc_w           563107674
        //    40: ldc_w           -845529720
        //    43: ixor           
        //    44: lookupswitch {
        //          -1253607200: 37
        //          -334861614: 72
        //          default: 975
        //        }
        //    72: getfield        dev/nuker/pyro/f4U.e:Ldev/nuker/pyro/f0a;
        //    75: getstatic       dev/nuker/pyro/fc.0:I
        //    78: ifeq            87
        //    81: ldc_w           264192302
        //    84: goto            90
        //    87: ldc_w           -1401531370
        //    90: ldc_w           923359817
        //    93: ixor           
        //    94: lookupswitch {
        //          -444848565: 87
        //          951458663: 965
        //          default: 120
        //        }
        //   120: goto            124
        //   123: athrow         
        //   124: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   127: goto            131
        //   130: athrow         
        //   131: checkcast       Ljava/lang/Boolean;
        //   134: getstatic       dev/nuker/pyro/fc.1:I
        //   137: ifeq            146
        //   140: ldc_w           -568821566
        //   143: goto            149
        //   146: ldc_w           780476408
        //   149: ldc_w           1046563263
        //   152: ixor           
        //   153: lookupswitch {
        //          -528928387: 961
        //          478029756: 146
        //          default: 180
        //        }
        //   180: goto            184
        //   183: athrow         
        //   184: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   187: goto            191
        //   190: athrow         
        //   191: ifeq            217
        //   194: aload_0        
        //   195: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //   198: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   201: goto            205
        //   204: athrow         
        //   205: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_181040_m:()Z
        //   208: goto            212
        //   211: athrow         
        //   212: ifeq            217
        //   215: iconst_1       
        //   216: ireturn        
        //   217: aload_0        
        //   218: getfield        dev/nuker/pyro/f4U.d:Ldev/nuker/pyro/f0a;
        //   221: goto            225
        //   224: athrow         
        //   225: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   228: goto            232
        //   231: athrow         
        //   232: checkcast       Ljava/lang/Boolean;
        //   235: goto            239
        //   238: athrow         
        //   239: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   242: goto            246
        //   245: athrow         
        //   246: ifeq            352
        //   249: aload_0        
        //   250: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //   253: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   256: goto            260
        //   259: athrow         
        //   260: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184587_cr:()Z
        //   263: goto            267
        //   266: athrow         
        //   267: ifeq            352
        //   270: aload_0        
        //   271: getstatic       dev/nuker/pyro/fc.c:I
        //   274: ifge            283
        //   277: ldc_w           898787338
        //   280: goto            286
        //   283: ldc_w           1855414040
        //   286: ldc_w           1063018705
        //   289: ixor           
        //   290: lookupswitch {
        //          181274843: 283
        //          1372274633: 316
        //          default: 967
        //        }
        //   316: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //   319: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   322: goto            326
        //   325: athrow         
        //   326: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //   329: goto            333
        //   332: athrow         
        //   333: goto            337
        //   336: athrow         
        //   337: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   340: goto            344
        //   343: athrow         
        //   344: instanceof      Lnet/minecraft/item/ItemFood;
        //   347: ifeq            352
        //   350: iconst_1       
        //   351: ireturn        
        //   352: aload_0        
        //   353: getstatic       dev/nuker/pyro/fc.0:I
        //   356: ifeq            365
        //   359: ldc_w           -453484242
        //   362: goto            368
        //   365: ldc_w           -842398192
        //   368: ldc_w           -1931460595
        //   371: ixor           
        //   372: lookupswitch {
        //          602656510: 365
        //          1746411811: 977
        //          default: 400
        //        }
        //   400: getfield        dev/nuker/pyro/f4U.f:Ldev/nuker/pyro/f0a;
        //   403: goto            407
        //   406: athrow         
        //   407: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   410: goto            414
        //   413: athrow         
        //   414: checkcast       Ljava/lang/Boolean;
        //   417: goto            421
        //   420: athrow         
        //   421: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   424: goto            428
        //   427: athrow         
        //   428: ifeq            674
        //   431: aload_0        
        //   432: getstatic       dev/nuker/pyro/fc.c:I
        //   435: ifge            444
        //   438: ldc_w           -1376102650
        //   441: goto            447
        //   444: ldc_w           1303165933
        //   447: ldc_w           260779259
        //   450: ixor           
        //   451: lookupswitch {
        //          -1569620995: 444
        //          1109890838: 476
        //          default: 969
        //        }
        //   476: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //   479: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //   482: getstatic       dev/nuker/pyro/fc.0:I
        //   485: ifeq            494
        //   488: ldc_w           1005968007
        //   491: goto            497
        //   494: ldc_w           -1702484055
        //   497: ldc_w           -667015081
        //   500: ixor           
        //   501: lookupswitch {
        //          -473173296: 955
        //          1374115471: 494
        //          default: 528
        //        }
        //   528: getfield        net/minecraft/client/settings/GameSettings.field_74366_z:Lnet/minecraft/client/settings/KeyBinding;
        //   531: goto            535
        //   534: athrow         
        //   535: invokevirtual   net/minecraft/client/settings/KeyBinding.func_151470_d:()Z
        //   538: goto            542
        //   541: athrow         
        //   542: ifeq            674
        //   545: aload_0        
        //   546: getfield        dev/nuker/pyro/f4U.c:Lnet/minecraft/client/Minecraft;
        //   549: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   552: getstatic       dev/nuker/pyro/fc.0:I
        //   555: ifeq            564
        //   558: ldc_w           -1471312060
        //   561: goto            567
        //   564: ldc_w           -1957162883
        //   567: ldc_w           -110990995
        //   570: ixor           
        //   571: lookupswitch {
        //          1362093609: 957
        //          1646257985: 564
        //          default: 596
        //        }
        //   596: goto            600
        //   599: athrow         
        //   600: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //   603: goto            607
        //   606: athrow         
        //   607: goto            611
        //   610: athrow         
        //   611: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   614: goto            618
        //   617: athrow         
        //   618: getstatic       net/minecraft/init/Items.field_151062_by:Lnet/minecraft/item/Item;
        //   621: goto            625
        //   624: athrow         
        //   625: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   628: goto            632
        //   631: athrow         
        //   632: ifeq            641
        //   635: ldc_w           -713392799
        //   638: goto            644
        //   641: ldc_w           -713392800
        //   644: ldc_w           -430561049
        //   647: ixor           
        //   648: tableswitch {
        //          1717086988: 672
        //          1717086989: 674
        //          default: 635
        //        }
        //   672: iconst_1       
        //   673: ireturn        
        //   674: getstatic       dev/nuker/pyro/fc.0:I
        //   677: ifeq            686
        //   680: ldc_w           1141641359
        //   683: goto            689
        //   686: ldc_w           1679419331
        //   689: ldc_w           1027454935
        //   692: ixor           
        //   693: lookupswitch {
        //          1495552020: 720
        //          2033297240: 686
        //          default: 971
        //        }
        //   720: aload_0        
        //   721: getstatic       dev/nuker/pyro/fc.c:I
        //   724: ifge            733
        //   727: ldc_w           -1924536620
        //   730: goto            736
        //   733: ldc_w           -372756688
        //   736: ldc_w           428654114
        //   739: ixor           
        //   740: lookupswitch {
        //          -1799005962: 733
        //          -263941870: 768
        //          default: 973
        //        }
        //   768: getfield        dev/nuker/pyro/f4U.b:Ldev/nuker/pyro/f0a;
        //   771: getstatic       dev/nuker/pyro/fc.1:I
        //   774: ifeq            783
        //   777: ldc_w           210400828
        //   780: goto            786
        //   783: ldc_w           -1470188572
        //   786: ldc_w           -1754128000
        //   789: ixor           
        //   790: lookupswitch {
        //          -1678223428: 783
        //          1059885668: 816
        //          default: 963
        //        }
        //   816: goto            820
        //   819: athrow         
        //   820: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   823: goto            827
        //   826: athrow         
        //   827: checkcast       Ljava/lang/Boolean;
        //   830: goto            834
        //   833: athrow         
        //   834: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   837: goto            841
        //   840: athrow         
        //   841: ifeq            953
        //   844: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f55;
        //   847: getfield        dev/nuker/pyro/f55.c:Ldev/nuker/pyro/fw;
        //   850: getstatic       dev/nuker/pyro/fc.0:I
        //   853: ifeq            862
        //   856: ldc_w           -1612873826
        //   859: goto            865
        //   862: ldc_w           -283772006
        //   865: ldc_w           2111606830
        //   868: ixor           
        //   869: lookupswitch {
        //          -503189584: 959
        //          -222247318: 862
        //          default: 896
        //        }
        //   896: goto            900
        //   899: athrow         
        //   900: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   903: goto            907
        //   906: athrow         
        //   907: checkcast       Ljava/lang/Boolean;
        //   910: goto            914
        //   913: athrow         
        //   914: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   917: goto            921
        //   920: athrow         
        //   921: ifeq            953
        //   924: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f55;
        //   927: getfield        dev/nuker/pyro/f55.c:Ldev/nuker/pyro/fbu;
        //   930: ldc2_w          1000.0
        //   933: goto            937
        //   936: athrow         
        //   937: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //   940: goto            944
        //   943: athrow         
        //   944: ifne            951
        //   947: iconst_1       
        //   948: goto            952
        //   951: iconst_0       
        //   952: ireturn        
        //   953: iconst_0       
        //   954: ireturn        
        //   955: aconst_null    
        //   956: athrow         
        //   957: aconst_null    
        //   958: athrow         
        //   959: aconst_null    
        //   960: athrow         
        //   961: aconst_null    
        //   962: athrow         
        //   963: aconst_null    
        //   964: athrow         
        //   965: aconst_null    
        //   966: athrow         
        //   967: aconst_null    
        //   968: athrow         
        //   969: aconst_null    
        //   970: athrow         
        //   971: aconst_null    
        //   972: athrow         
        //   973: aconst_null    
        //   974: athrow         
        //   975: aconst_null    
        //   976: athrow         
        //   977: aconst_null    
        //   978: athrow         
        //   979: pop            
        //   980: goto            24
        //   983: pop            
        //   984: aconst_null    
        //   985: goto            979
        //   988: dup            
        //   989: ifnull          979
        //   992: checkcast       Ljava/lang/Throwable;
        //   995: athrow         
        //   996: dup            
        //   997: ifnull          983
        //  1000: checkcast       Ljava/lang/Throwable;
        //  1003: athrow         
        //  1004: aconst_null    
        //  1005: athrow         
        //    StackMapTable: 00 8F 43 07 00 47 04 FF 00 0B 00 00 00 01 07 00 47 FC 00 03 07 00 03 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 4E 07 00 D6 FF 00 02 00 01 07 00 03 00 02 07 00 D6 01 5D 07 00 D6 42 07 00 47 40 07 00 D6 45 07 00 47 40 07 03 13 4E 07 02 4E FF 00 02 00 01 07 00 03 00 02 07 02 4E 01 5E 07 02 4E 42 07 00 47 40 07 02 4E 45 07 00 47 40 01 4C 07 00 47 40 07 04 7C 45 07 00 47 40 01 04 46 07 00 47 40 07 00 D6 45 07 00 47 40 07 03 13 FF 00 05 00 00 00 01 07 00 47 FF 00 00 00 01 07 00 03 00 01 07 02 4E 45 07 00 47 40 01 FF 00 0C 00 00 00 01 07 00 47 FF 00 00 00 01 07 00 03 00 01 07 02 06 45 07 00 47 40 01 4F 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 FF 00 08 00 00 00 01 07 00 47 FF 00 00 00 01 07 00 03 00 01 07 02 06 45 07 00 47 40 07 02 84 42 07 00 47 40 07 02 84 45 07 00 47 40 07 05 38 07 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 45 07 02 0D 40 07 00 D6 45 07 00 47 40 07 03 13 45 07 00 47 40 07 02 4E 45 07 00 47 40 01 4F 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 51 07 05 60 FF 00 02 00 01 07 00 03 00 02 07 05 60 01 5E 07 05 60 45 07 01 F1 40 07 05 66 45 07 00 47 40 01 55 07 02 06 FF 00 02 00 01 07 00 03 00 02 07 02 06 01 5C 07 02 06 42 07 00 47 40 07 02 06 45 07 00 47 40 07 02 84 42 07 00 47 40 07 02 84 45 07 00 47 40 07 05 38 45 07 02 11 FF 00 00 00 01 07 00 03 00 02 07 05 38 07 05 38 45 07 00 47 40 01 02 05 42 01 1B 01 0B 42 01 1E 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 4E 07 00 D6 FF 00 02 00 01 07 00 03 00 02 07 00 D6 01 5D 07 00 D6 FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 01 07 00 03 00 01 07 00 D6 45 07 00 47 40 07 03 13 45 07 02 0D 40 07 02 4E 45 07 00 47 40 01 54 07 03 30 FF 00 02 00 01 07 00 03 00 02 07 03 30 01 5E 07 03 30 FF 00 02 00 00 00 01 07 00 47 FF 00 00 00 01 07 00 03 00 01 07 03 30 45 07 00 47 40 07 03 13 45 07 00 47 40 07 02 4E 45 07 00 47 40 01 4E 07 00 47 FF 00 00 00 01 07 00 03 00 02 07 01 C5 03 45 07 00 47 40 01 06 40 01 00 41 07 05 60 41 07 02 06 41 07 03 30 41 07 02 4E 41 07 00 D6 41 07 00 D6 41 07 00 03 41 07 00 03 01 41 07 00 03 41 07 00 03 41 07 00 03 41 07 00 47 43 05 44 07 00 47 47 05 47 07 00 47
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     988    996    Any
        //  988    996    988    996    Ljava/lang/IllegalStateException;
        //  1004   1006   3      8      Ljava/util/NoSuchElementException;
        //  123    130    130    131    Any
        //  124    130    123    124    Any
        //  123    130    123    124    Ljava/lang/IllegalArgumentException;
        //  124    130    3      8      Any
        //  123    130    3      8      Any
        //  183    190    190    191    Any
        //  183    190    3      8      Any
        //  183    190    183    184    Any
        //  183    190    183    184    Ljava/util/NoSuchElementException;
        //  184    190    190    191    Ljava/lang/StringIndexOutOfBoundsException;
        //  204    211    211    212    Any
        //  205    211    3      8      Ljava/lang/IllegalStateException;
        //  205    211    211    212    Ljava/lang/UnsupportedOperationException;
        //  205    211    204    205    Any
        //  205    211    204    205    Ljava/lang/StringIndexOutOfBoundsException;
        //  224    231    231    232    Any
        //  225    231    231    232    Ljava/util/NoSuchElementException;
        //  224    231    231    232    Any
        //  224    231    231    232    Ljava/lang/IllegalArgumentException;
        //  225    231    224    225    Any
        //  239    245    245    246    Any
        //  239    245    245    246    Ljava/lang/ClassCastException;
        //  239    245    3      8      Any
        //  239    245    245    246    Ljava/lang/AssertionError;
        //  239    245    245    246    Any
        //  260    266    266    267    Any
        //  260    266    3      8      Ljava/lang/NullPointerException;
        //  260    266    3      8      Any
        //  260    266    3      8      Any
        //  260    266    266    267    Ljava/lang/EnumConstantNotPresentException;
        //  326    332    332    333    Any
        //  326    332    332    333    Any
        //  326    332    332    333    Ljava/lang/ClassCastException;
        //  326    332    332    333    Ljava/lang/ArithmeticException;
        //  326    332    3      8      Any
        //  336    343    343    344    Any
        //  337    343    3      8      Ljava/lang/UnsupportedOperationException;
        //  336    343    336    337    Ljava/lang/NumberFormatException;
        //  337    343    336    337    Any
        //  337    343    343    344    Ljava/lang/ArithmeticException;
        //  406    413    413    414    Any
        //  407    413    413    414    Ljava/lang/EnumConstantNotPresentException;
        //  406    413    406    407    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  406    413    413    414    Ljava/util/NoSuchElementException;
        //  406    413    413    414    Ljava/lang/ClassCastException;
        //  420    427    427    428    Any
        //  420    427    420    421    Any
        //  421    427    427    428    Any
        //  420    427    420    421    Any
        //  420    427    420    421    Any
        //  534    541    541    542    Any
        //  534    541    534    535    Ljava/lang/IllegalStateException;
        //  535    541    534    535    Ljava/lang/RuntimeException;
        //  534    541    3      8      Any
        //  534    541    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  599    606    606    607    Any
        //  599    606    606    607    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  599    606    606    607    Any
        //  599    606    599    600    Any
        //  599    606    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  610    617    617    618    Any
        //  610    617    610    611    Ljava/lang/ArithmeticException;
        //  610    617    617    618    Any
        //  610    617    610    611    Any
        //  611    617    3      8      Any
        //  624    631    631    632    Any
        //  624    631    631    632    Ljava/lang/StringIndexOutOfBoundsException;
        //  624    631    624    625    Ljava/lang/IllegalArgumentException;
        //  625    631    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  624    631    631    632    Any
        //  820    826    826    827    Any
        //  820    826    826    827    Ljava/lang/NullPointerException;
        //  820    826    3      8      Ljava/lang/UnsupportedOperationException;
        //  820    826    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  820    826    3      8      Ljava/util/ConcurrentModificationException;
        //  833    840    840    841    Any
        //  834    840    3      8      Any
        //  833    840    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  834    840    833    834    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  833    840    3      8      Any
        //  900    906    906    907    Any
        //  900    906    906    907    Any
        //  900    906    906    907    Any
        //  900    906    906    907    Any
        //  900    906    3      8      Ljava/lang/ArithmeticException;
        //  913    920    920    921    Any
        //  913    920    3      8      Ljava/lang/NullPointerException;
        //  913    920    3      8      Ljava/lang/ArithmeticException;
        //  913    920    913    914    Any
        //  914    920    920    921    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  936    943    943    944    Any
        //  937    943    3      8      Any
        //  936    943    936    937    Any
        //  937    943    943    944    Any
        //  937    943    943    944    Any
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
}
