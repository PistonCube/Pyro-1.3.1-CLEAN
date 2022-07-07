// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

public class fb2 extends fH
{
    @NotNull
    public f0d c;
    @NotNull
    public f0a c;
    
    static {
        throw t;
    }
    
    @NotNull
    public f0d 0() {
        return fbS.fR(this, 1497921435);
    }
    
    @NotNull
    public f0a c() {
        return fbS.0c(this, 911331767);
    }
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          321
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            313
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            305
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: aload_2        
        //    27: getstatic       dev/nuker/pyro/fc.c:I
        //    30: ifge            38
        //    33: ldc             -650925268
        //    35: goto            40
        //    38: ldc             -526213997
        //    40: ldc             1060658237
        //    42: ixor           
        //    43: lookupswitch {
        //          -543506258: 68
        //          -435423471: 38
        //          default: 294
        //        }
        //    68: aload_3        
        //    69: goto            73
        //    72: athrow         
        //    73: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //    76: goto            80
        //    79: athrow         
        //    80: getstatic       dev/nuker/pyro/f02.c:Ldev/nuker/pyro/f02;
        //    83: ldc             "\u2906\u149a\u8006\ub1cd\uc472"
        //    85: goto            89
        //    88: athrow         
        //    89: invokestatic    invokestatic   !!! ERROR
        //    92: goto            96
        //    95: athrow         
        //    96: goto            100
        //    99: athrow         
        //   100: invokevirtual   dev/nuker/pyro/f02.1:(Ljava/lang/String;)V
        //   103: goto            107
        //   106: athrow         
        //   107: iload_1        
        //   108: ifeq            116
        //   111: ldc             -2041288539
        //   113: goto            118
        //   116: ldc             -2041288540
        //   118: ldc             1183097573
        //   120: ixor           
        //   121: tableswitch {
        //          -2120117120: 144
        //          -2120117119: 289
        //          default: 111
        //        }
        //   144: getstatic       dev/nuker/pyro/f02.c:Ldev/nuker/pyro/f02;
        //   147: ldc             "\u2906\u149a\u8006\ub1cd\uc472"
        //   149: goto            153
        //   152: athrow         
        //   153: invokestatic    invokestatic   !!! ERROR
        //   156: goto            160
        //   159: athrow         
        //   160: getstatic       dev/nuker/pyro/fZ.0:Ldev/nuker/pyro/fZ;
        //   163: getstatic       dev/nuker/pyro/fc.c:I
        //   166: ifge            174
        //   169: ldc             -188402177
        //   171: goto            176
        //   174: ldc             -1702545325
        //   176: ldc             -1639380310
        //   178: ixor           
        //   179: lookupswitch {
        //          80491257: 204
        //          1787576149: 174
        //          default: 292
        //        }
        //   204: aload_0        
        //   205: getfield        dev/nuker/pyro/fb2.c:Ldev/nuker/pyro/f0d;
        //   208: getstatic       dev/nuker/pyro/fc.1:I
        //   211: ifeq            219
        //   214: ldc             998633058
        //   216: goto            221
        //   219: ldc             -1025691976
        //   221: ldc             -430833325
        //   223: ixor           
        //   224: lookupswitch {
        //          -573051087: 219
        //          613363691: 252
        //          default: 290
        //        }
        //   252: goto            256
        //   255: athrow         
        //   256: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   259: goto            263
        //   262: athrow         
        //   263: checkcast       Ljava/lang/Number;
        //   266: goto            270
        //   269: athrow         
        //   270: invokevirtual   java/lang/Number.doubleValue:()D
        //   273: goto            277
        //   276: athrow         
        //   277: d2f            
        //   278: goto            282
        //   281: athrow         
        //   282: invokevirtual   dev/nuker/pyro/f02.c:(Ljava/lang/String;Ldev/nuker/pyro/fZ;F)V
        //   285: goto            289
        //   288: athrow         
        //   289: return         
        //   290: aconst_null    
        //   291: athrow         
        //   292: aconst_null    
        //   293: athrow         
        //   294: aconst_null    
        //   295: athrow         
        //   296: pop            
        //   297: goto            24
        //   300: pop            
        //   301: aconst_null    
        //   302: goto            296
        //   305: dup            
        //   306: ifnull          296
        //   309: checkcast       Ljava/lang/Throwable;
        //   312: athrow         
        //   313: dup            
        //   314: ifnull          300
        //   317: checkcast       Ljava/lang/Throwable;
        //   320: athrow         
        //   321: aconst_null    
        //   322: athrow         
        //    StackMapTable: 00 35 43 07 00 36 04 FF 00 0B 00 00 00 01 07 00 36 FF 00 03 00 04 07 00 03 01 07 00 6D 07 00 6F 00 00 FF 00 0D 00 04 07 00 03 01 07 00 6D 07 00 6F 00 03 07 00 03 01 07 00 6D FF 00 01 00 04 07 00 03 01 07 00 6D 07 00 6F 00 04 07 00 03 01 07 00 6D 01 FF 00 1B 00 04 07 00 03 01 07 00 6D 07 00 6F 00 03 07 00 03 01 07 00 6D FF 00 03 00 00 00 01 07 00 36 FF 00 00 00 04 07 00 03 01 07 00 6D 07 00 6F 00 04 07 00 03 01 07 00 6D 07 00 6F 45 07 00 36 00 47 07 00 36 FF 00 00 00 04 07 00 03 01 07 00 6D 07 00 6F 00 02 07 00 3F 07 00 71 45 07 00 36 FF 00 00 00 04 07 00 03 01 07 00 6D 07 00 6F 00 02 07 00 3F 07 00 71 42 07 00 36 FF 00 00 00 04 07 00 03 01 07 00 6D 07 00 6F 00 02 07 00 3F 07 00 71 45 07 00 36 00 03 04 41 01 19 47 07 00 36 FF 00 00 00 04 07 00 03 01 07 00 6D 07 00 6F 00 02 07 00 3F 07 00 71 45 07 00 36 FF 00 00 00 04 07 00 03 01 07 00 6D 07 00 6F 00 02 07 00 3F 07 00 71 FF 00 0D 00 04 07 00 03 01 07 00 6D 07 00 6F 00 03 07 00 3F 07 00 71 07 00 51 FF 00 01 00 04 07 00 03 01 07 00 6D 07 00 6F 00 04 07 00 3F 07 00 71 07 00 51 01 FF 00 1B 00 04 07 00 03 01 07 00 6D 07 00 6F 00 03 07 00 3F 07 00 71 07 00 51 FF 00 0E 00 04 07 00 03 01 07 00 6D 07 00 6F 00 04 07 00 3F 07 00 71 07 00 51 07 00 5E FF 00 01 00 04 07 00 03 01 07 00 6D 07 00 6F 00 05 07 00 3F 07 00 71 07 00 51 07 00 5E 01 FF 00 1E 00 04 07 00 03 01 07 00 6D 07 00 6F 00 04 07 00 3F 07 00 71 07 00 51 07 00 5E 42 07 00 36 FF 00 00 00 04 07 00 03 01 07 00 6D 07 00 6F 00 04 07 00 3F 07 00 71 07 00 51 07 00 5E 45 07 00 36 FF 00 00 00 04 07 00 03 01 07 00 6D 07 00 6F 00 04 07 00 3F 07 00 71 07 00 51 07 00 73 45 07 00 36 FF 00 00 00 04 07 00 03 01 07 00 6D 07 00 6F 00 04 07 00 3F 07 00 71 07 00 51 07 00 64 45 07 00 36 FF 00 00 00 04 07 00 03 01 07 00 6D 07 00 6F 00 04 07 00 3F 07 00 71 07 00 51 03 43 07 00 36 FF 00 00 00 04 07 00 03 01 07 00 6D 07 00 6F 00 04 07 00 3F 07 00 71 07 00 51 02 45 07 00 36 00 FF 00 00 00 04 07 00 03 01 07 00 6D 07 00 6F 00 04 07 00 3F 07 00 71 07 00 51 07 00 5E FF 00 01 00 04 07 00 03 01 07 00 6D 07 00 6F 00 03 07 00 3F 07 00 71 07 00 51 FF 00 01 00 04 07 00 03 01 07 00 6D 07 00 6F 00 03 07 00 03 01 07 00 6D 41 07 00 36 43 05 44 07 00 36 47 05 47 07 00 36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     305    313    Any
        //  305    313    305    313    Any
        //  321    323    3      8      Ljava/lang/AssertionError;
        //  73     79     79     80     Any
        //  73     79     3      8      Any
        //  73     79     79     80     Any
        //  73     79     79     80     Ljava/lang/UnsupportedOperationException;
        //  73     79     79     80     Ljava/lang/NullPointerException;
        //  88     95     95     96     Any
        //  88     95     95     96     Any
        //  89     95     3      8      Any
        //  88     95     88     89     Any
        //  89     95     88     89     Any
        //  99     106    106    107    Any
        //  100    106    99     100    Ljava/lang/IndexOutOfBoundsException;
        //  99     106    3      8      Any
        //  100    106    3      8      Ljava/lang/ArithmeticException;
        //  99     106    99     100    Any
        //  152    159    159    160    Any
        //  152    159    152    153    Ljava/lang/AssertionError;
        //  152    159    159    160    Ljava/lang/NegativeArraySizeException;
        //  152    159    3      8      Any
        //  152    159    152    153    Ljava/util/NoSuchElementException;
        //  255    262    262    263    Any
        //  256    262    255    256    Any
        //  256    262    262    263    Any
        //  255    262    262    263    Ljava/lang/IndexOutOfBoundsException;
        //  255    262    255    256    Any
        //  269    276    276    277    Any
        //  269    276    3      8      Any
        //  269    276    276    277    Ljava/util/NoSuchElementException;
        //  269    276    3      8      Ljava/util/ConcurrentModificationException;
        //  269    276    269    270    Any
        //  281    288    288    289    Any
        //  282    288    281    282    Ljava/lang/EnumConstantNotPresentException;
        //  281    288    288    289    Ljava/lang/UnsupportedOperationException;
        //  282    288    281    282    Any
        //  282    288    288    289    Any
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
    
    public fb2() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u2906\u149a\u8006\ub3dc\uc663"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u2926\u149a\u8006\ub3dc\uc663"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: ldc             "\u2931\u149b\u800a\ub3d7\uc676\ue711\ub264\uec32\ud960\ue607\uad94\u1e4f\ueb0e\uc5ae\u8e80\u8381\u57b0\u7df0\ubd34\ucfba\u21e5\uc27b\u60ff\u2d5f\ud863\u3f7c\u7d6b\u835b\u8001\u8320\u8e57\ufb36"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    19: aload_0        
        //    20: aload_0        
        //    21: new             Ldev/nuker/pyro/f0d;
        //    24: dup            
        //    25: ldc             "\u291f\u1486\u8007\ub3cd\uc678\ue704\ub228\uec2f\ud96d\ue610"
        //    27: invokestatic    invokestatic   !!! ERROR
        //    30: ldc             "\u293f\u1486\u8007\ub3cd\uc678\ue704\ub228\uec2f\ud96d\ue610"
        //    32: invokestatic    invokestatic   !!! ERROR
        //    35: aconst_null    
        //    36: ldc2_w          2.0
        //    39: ldc2_w          0.1
        //    42: ldc2_w          10.0
        //    45: dconst_0       
        //    46: bipush          64
        //    48: aconst_null    
        //    49: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    52: checkcast       Ldev/nuker/pyro/f0n;
        //    55: invokevirtual   dev/nuker/pyro/fb2.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //    58: checkcast       Ldev/nuker/pyro/f0d;
        //    61: getstatic       dev/nuker/pyro/fc.c:I
        //    64: ifge            72
        //    67: ldc             1989199936
        //    69: goto            74
        //    72: ldc             -165092419
        //    74: ldc             -1165581362
        //    76: ixor           
        //    77: lookupswitch {
        //          -1593394196: 72
        //          -870945906: 464
        //          default: 104
        //        }
        //   104: putfield        dev/nuker/pyro/fb2.c:Ldev/nuker/pyro/f0d;
        //   107: aload_0        
        //   108: aload_0        
        //   109: new             Ldev/nuker/pyro/f0a;
        //   112: dup            
        //   113: ldc             "\u2906\u1483\u8018\ub3ea\uc668\ue71a\ub227"
        //   115: invokestatic    invokestatic   !!! ERROR
        //   118: ldc             "\u2926\u14a3\u8038\ub3ea\uc668\ue71a\ub227"
        //   120: getstatic       dev/nuker/pyro/fc.1:I
        //   123: ifeq            131
        //   126: ldc             -194894797
        //   128: goto            133
        //   131: ldc             -1505657653
        //   133: ldc             -1810680845
        //   135: ixor           
        //   136: lookupswitch {
        //          1616169094: 131
        //          1618024384: 466
        //          default: 164
        //        }
        //   164: invokestatic    invokestatic   !!! ERROR
        //   167: aconst_null    
        //   168: iconst_0       
        //   169: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   172: checkcast       Ldev/nuker/pyro/f0n;
        //   175: invokevirtual   dev/nuker/pyro/fb2.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   178: checkcast       Ldev/nuker/pyro/f0a;
        //   181: getstatic       dev/nuker/pyro/fc.1:I
        //   184: ifeq            192
        //   187: ldc             -1203948914
        //   189: goto            194
        //   192: ldc             381247335
        //   194: ldc             467830801
        //   196: ixor           
        //   197: lookupswitch {
        //          -1545618785: 458
        //          471197039: 192
        //          default: 224
        //        }
        //   224: putfield        dev/nuker/pyro/fb2.c:Ldev/nuker/pyro/f0a;
        //   227: getstatic       dev/nuker/pyro/fc.0:I
        //   230: ifeq            238
        //   233: ldc             -1564137696
        //   235: goto            240
        //   238: ldc             -601977246
        //   240: ldc             -1621876100
        //   242: ixor           
        //   243: lookupswitch {
        //          1032914268: 238
        //          1128967198: 268
        //          default: 462
        //        }
        //   268: aload_0        
        //   269: getstatic       dev/nuker/pyro/fc.0:I
        //   272: ifeq            280
        //   275: ldc             -679276256
        //   277: goto            282
        //   280: ldc             -561510609
        //   282: ldc             -1783634910
        //   284: ixor           
        //   285: lookupswitch {
        //          749344032: 280
        //          1110242562: 470
        //          default: 312
        //        }
        //   312: getfield        dev/nuker/pyro/fb2.c:Ldev/nuker/pyro/f0d;
        //   315: new             Ldev/nuker/pyro/fb1;
        //   318: dup            
        //   319: getstatic       dev/nuker/pyro/fc.0:I
        //   322: ifeq            330
        //   325: ldc             -166216819
        //   327: goto            332
        //   330: ldc             1597242657
        //   332: ldc             1564034824
        //   334: ixor           
        //   335: lookupswitch {
        //          -1422984059: 330
        //          34257449: 360
        //          default: 460
        //        }
        //   360: aload_0        
        //   361: getstatic       dev/nuker/pyro/fc.1:I
        //   364: ifeq            372
        //   367: ldc             1335863833
        //   369: goto            374
        //   372: ldc             1823236790
        //   374: ldc             1953913031
        //   376: ixor           
        //   377: lookupswitch {
        //          495042314: 372
        //          1005187806: 456
        //          default: 404
        //        }
        //   404: invokespecial   dev/nuker/pyro/fb1.<init>:(Ldev/nuker/pyro/fb2;)V
        //   407: checkcast       Ljava/util/function/Consumer;
        //   410: getstatic       dev/nuker/pyro/fc.1:I
        //   413: ifeq            421
        //   416: ldc             870575926
        //   418: goto            423
        //   421: ldc             -1176311313
        //   423: ldc             -1855242996
        //   425: ixor           
        //   426: lookupswitch {
        //          -1568091590: 468
        //          -907143543: 421
        //          default: 452
        //        }
        //   452: invokevirtual   dev/nuker/pyro/f0d.c:(Ljava/util/function/Consumer;)V
        //   455: return         
        //   456: aconst_null    
        //   457: athrow         
        //   458: aconst_null    
        //   459: athrow         
        //   460: aconst_null    
        //   461: athrow         
        //   462: aconst_null    
        //   463: athrow         
        //   464: aconst_null    
        //   465: athrow         
        //   466: aconst_null    
        //   467: athrow         
        //   468: aconst_null    
        //   469: athrow         
        //   470: aconst_null    
        //   471: athrow         
        //    StackMapTable: 00 20 FF 00 48 00 01 07 00 03 00 02 07 00 03 07 00 5E FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 5E 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 5E FF 00 1A 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 6D 08 00 6D 07 00 71 07 00 71 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 6D 08 00 6D 07 00 71 07 00 71 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 6D 08 00 6D 07 00 71 07 00 71 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 95 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 95 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 95 0D 41 01 1B 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 FF 00 11 00 01 07 00 03 00 03 07 00 5E 08 01 3B 08 01 3B FF 00 01 00 01 07 00 03 00 04 07 00 5E 08 01 3B 08 01 3B 01 FF 00 1B 00 01 07 00 03 00 03 07 00 5E 08 01 3B 08 01 3B FF 00 0B 00 01 07 00 03 00 04 07 00 5E 08 01 3B 08 01 3B 07 00 03 FF 00 01 00 01 07 00 03 00 05 07 00 5E 08 01 3B 08 01 3B 07 00 03 01 FF 00 1D 00 01 07 00 03 00 04 07 00 5E 08 01 3B 08 01 3B 07 00 03 FF 00 10 00 01 07 00 03 00 02 07 00 5E 07 00 B9 FF 00 01 00 01 07 00 03 00 03 07 00 5E 07 00 B9 01 FF 00 1C 00 01 07 00 03 00 02 07 00 5E 07 00 B9 FF 00 03 00 01 07 00 03 00 04 07 00 5E 08 01 3B 08 01 3B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 95 FF 00 01 00 01 07 00 03 00 03 07 00 5E 08 01 3B 08 01 3B 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 5E FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 6D 08 00 6D 07 00 71 07 00 71 FF 00 01 00 01 07 00 03 00 02 07 00 5E 07 00 B9 41 07 00 03
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
    
    @f06
    @LauncherEventHide
    public void c(@NotNull final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          858
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            850
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            842
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_0        
        //    27: getstatic       dev/nuker/pyro/fc.0:I
        //    30: ifeq            38
        //    33: ldc             -1536641610
        //    35: goto            40
        //    38: ldc             -1921999050
        //    40: ldc             184101956
        //    42: ixor           
        //    43: lookupswitch {
        //          -2021018766: 68
        //          -1366189582: 38
        //          default: 831
        //        }
        //    68: getstatic       kotlin/jvm/internal/StringCompanionObject.INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;
        //    71: astore_2       
        //    72: ldc             "\u2957\u14dd\u8059\ub1ce"
        //    74: goto            78
        //    77: athrow         
        //    78: invokestatic    invokestatic   !!! ERROR
        //    81: goto            85
        //    84: athrow         
        //    85: astore_3       
        //    86: iconst_1       
        //    87: anewarray       Ljava/lang/Object;
        //    90: dup            
        //    91: iconst_0       
        //    92: bipush          50
        //    94: i2f            
        //    95: getstatic       dev/nuker/pyro/fbk.c:Lnet/minecraft/client/Minecraft;
        //    98: dup            
        //    99: ifnonnull       107
        //   102: ldc             -1261548717
        //   104: goto            109
        //   107: ldc             -1261548692
        //   109: ldc             1086595852
        //   111: ixor           
        //   112: tableswitch {
        //          -401289026: 136
        //          -401289025: 165
        //          default: 102
        //        }
        //   136: new             Lkotlin/TypeCastException;
        //   139: dup            
        //   140: ldc             "\u291c\u1486\u8007\ub1c4\uc420\ue717\ub225\uec28\udb77\ue41c\uadc0\u1e0c\ueb00\uc7b3\u8cd4\u838c\u57a5\u7df0\ubf38\ucdef\u21f4\uc234\u60ab\u2f49\uda7e\u3f79\u7d66\u8346\u8215\u8138\u8e5e\ufb72\u7a20\u981e\u1636\ufb90\u493c\u8283\uc892\uf292\ubc64\u41fd\ub307\ub152\u41d3\u8015\u7c27\uc4d3\u7f46\ue773\uec25\u1696\ue4bd\u3596\u4b11\ueb07\u0a19\u8c79\u1be9\u02e8\u7de1\u7288\ucd0f\ub9b9\u977f\u60e1\ue2f2\udaf3\ua73f\u286d\u8341\u4fb2\u8184\u1616\uae65"
        //   142: goto            146
        //   145: athrow         
        //   146: invokestatic    invokestatic   !!! ERROR
        //   149: goto            153
        //   152: athrow         
        //   153: goto            157
        //   156: athrow         
        //   157: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   160: goto            164
        //   163: athrow         
        //   164: athrow         
        //   165: checkcast       Ldev/nuker/pyro/mixin/MinecraftAccessor;
        //   168: goto            172
        //   171: athrow         
        //   172: invokeinterface dev/nuker/pyro/mixin/MinecraftAccessor.getTimer:()Lnet/minecraft/util/Timer;
        //   177: goto            181
        //   180: athrow         
        //   181: dup            
        //   182: ifnonnull       214
        //   185: new             Lkotlin/TypeCastException;
        //   188: dup            
        //   189: ldc             "\u291c\u1486\u8007\ub1c4\uc420\ue717\ub225\uec28\udb77\ue41c\uadc0\u1e0c\ueb00\uc7b3\u8cd4\u838c\u57a5\u7df0\ubf38\ucdef\u21f4\uc234\u60ab\u2f49\uda7e\u3f79\u7d66\u8346\u8215\u8138\u8e5e\ufb72\u7a20\u981e\u1636\ufb90\u493c\u8283\uc892\uf292\ubc64\u41fd\ub307\ub152\u41d3\u8015\u7c27\uc4d3\u7f46\ue773\uec25\u1696\ue4bd\u3596\u4b11\ueb07\u0a19\u8c79\u1bf0\u02e8\u7de2\u7288\ucd1e\ub98a\u977d\u60e4\ue2e3\udac1\ua72f\u2861\u8356"
        //   191: goto            195
        //   194: athrow         
        //   195: invokestatic    invokestatic   !!! ERROR
        //   198: goto            202
        //   201: athrow         
        //   202: goto            206
        //   205: athrow         
        //   206: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   209: goto            213
        //   212: athrow         
        //   213: athrow         
        //   214: checkcast       Ldev/nuker/pyro/mixin/TimerAccessor;
        //   217: goto            221
        //   220: athrow         
        //   221: invokeinterface dev/nuker/pyro/mixin/TimerAccessor.getTickLength:()F
        //   226: goto            230
        //   229: athrow         
        //   230: fdiv           
        //   231: goto            235
        //   234: athrow         
        //   235: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   238: goto            242
        //   241: athrow         
        //   242: aastore        
        //   243: astore          4
        //   245: astore          6
        //   247: iconst_0       
        //   248: getstatic       dev/nuker/pyro/fc.0:I
        //   251: ifeq            259
        //   254: ldc             145292019
        //   256: goto            261
        //   259: ldc             1384742350
        //   261: ldc             -106304733
        //   263: ixor           
        //   264: lookupswitch {
        //          -1423927571: 292
        //          -251588144: 259
        //          default: 829
        //        }
        //   292: istore          5
        //   294: aload_3        
        //   295: aload           4
        //   297: dup            
        //   298: arraylength    
        //   299: getstatic       dev/nuker/pyro/fc.0:I
        //   302: ifeq            310
        //   305: ldc             -237540274
        //   307: goto            313
        //   310: ldc_w           -539659278
        //   313: ldc_w           -456021406
        //   316: ixor           
        //   317: lookupswitch {
        //          352765484: 817
        //          462960578: 310
        //          default: 344
        //        }
        //   344: goto            348
        //   347: athrow         
        //   348: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   351: goto            355
        //   354: athrow         
        //   355: goto            359
        //   358: athrow         
        //   359: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   362: goto            366
        //   365: athrow         
        //   366: dup            
        //   367: pop            
        //   368: astore          7
        //   370: aload           6
        //   372: aload           7
        //   374: goto            378
        //   377: athrow         
        //   378: invokevirtual   dev/nuker/pyro/fb2.4:(Ljava/lang/String;)V
        //   381: goto            385
        //   384: athrow         
        //   385: aload_0        
        //   386: getstatic       dev/nuker/pyro/fc.1:I
        //   389: ifeq            398
        //   392: ldc_w           1986893251
        //   395: goto            401
        //   398: ldc_w           849715330
        //   401: ldc_w           -1221818279
        //   404: ixor           
        //   405: lookupswitch {
        //          -1052697190: 821
        //          -417445022: 398
        //          default: 432
        //        }
        //   432: getfield        dev/nuker/pyro/fb2.c:Ldev/nuker/pyro/f0a;
        //   435: goto            439
        //   438: athrow         
        //   439: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   442: goto            446
        //   445: athrow         
        //   446: checkcast       Ljava/lang/Boolean;
        //   449: goto            453
        //   452: athrow         
        //   453: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   456: goto            460
        //   459: athrow         
        //   460: ifeq            469
        //   463: ldc_w           155221363
        //   466: goto            472
        //   469: ldc_w           155221360
        //   472: ldc_w           -2136155246
        //   475: ixor           
        //   476: tableswitch {
        //          333008322: 500
        //          333008323: 619
        //          default: 463
        //        }
        //   500: getstatic       dev/nuker/pyro/fc.0:I
        //   503: ifeq            512
        //   506: ldc_w           -586373377
        //   509: goto            515
        //   512: ldc_w           -804969736
        //   515: ldc_w           787946822
        //   518: ixor           
        //   519: lookupswitch {
        //          -1439255420: 512
        //          -201606215: 823
        //          default: 544
        //        }
        //   544: getstatic       dev/nuker/pyro/f02.c:Ldev/nuker/pyro/f02;
        //   547: ldc             "\u2906\u149a\u8006\ub1cd\uc472"
        //   549: goto            553
        //   552: athrow         
        //   553: invokestatic    invokestatic   !!! ERROR
        //   556: goto            560
        //   559: athrow         
        //   560: getstatic       dev/nuker/pyro/fZ.0:Ldev/nuker/pyro/fZ;
        //   563: bipush          50
        //   565: i2f            
        //   566: ldc_w           500.0
        //   569: ldc_w           50.0
        //   572: bipush          20
        //   574: i2f            
        //   575: getstatic       dev/nuker/pyro/fW.c:Ldev/nuker/pyro/fW;
        //   578: dup            
        //   579: pop            
        //   580: goto            584
        //   583: athrow         
        //   584: invokevirtual   dev/nuker/pyro/fW.c:()F
        //   587: goto            591
        //   590: athrow         
        //   591: fdiv           
        //   592: fmul           
        //   593: goto            597
        //   596: athrow         
        //   597: invokestatic    kotlin/ranges/RangesKt.coerceAtMost:(FF)F
        //   600: goto            604
        //   603: athrow         
        //   604: fdiv           
        //   605: goto            609
        //   608: athrow         
        //   609: invokevirtual   dev/nuker/pyro/f02.c:(Ljava/lang/String;Ldev/nuker/pyro/fZ;F)V
        //   612: goto            616
        //   615: athrow         
        //   616: goto            816
        //   619: getstatic       dev/nuker/pyro/fc.0:I
        //   622: ifeq            631
        //   625: ldc_w           1601198556
        //   628: goto            634
        //   631: ldc_w           -1513958363
        //   634: ldc_w           -1777129909
        //   637: ixor           
        //   638: lookupswitch {
        //          -1556745147: 631
        //          -916226153: 825
        //          default: 664
        //        }
        //   664: getstatic       dev/nuker/pyro/f02.c:Ldev/nuker/pyro/f02;
        //   667: ldc             "\u2906\u149a\u8006\ub1cd\uc472"
        //   669: getstatic       dev/nuker/pyro/fc.c:I
        //   672: ifge            681
        //   675: ldc_w           -210870479
        //   678: goto            684
        //   681: ldc_w           -68169360
        //   684: ldc_w           -2139707405
        //   687: ixor           
        //   688: lookupswitch {
        //          -1655749763: 681
        //          1931016386: 827
        //          default: 716
        //        }
        //   716: goto            720
        //   719: athrow         
        //   720: invokestatic    invokestatic   !!! ERROR
        //   723: goto            727
        //   726: athrow         
        //   727: getstatic       dev/nuker/pyro/fZ.0:Ldev/nuker/pyro/fZ;
        //   730: aload_0        
        //   731: getstatic       dev/nuker/pyro/fc.0:I
        //   734: ifeq            743
        //   737: ldc_w           -459897478
        //   740: goto            746
        //   743: ldc_w           -1544955437
        //   746: ldc_w           695580521
        //   749: ixor           
        //   750: lookupswitch {
        //          -840748525: 819
        //          2087510182: 743
        //          default: 776
        //        }
        //   776: getfield        dev/nuker/pyro/fb2.c:Ldev/nuker/pyro/f0d;
        //   779: goto            783
        //   782: athrow         
        //   783: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   786: goto            790
        //   789: athrow         
        //   790: checkcast       Ljava/lang/Number;
        //   793: goto            797
        //   796: athrow         
        //   797: invokevirtual   java/lang/Number.doubleValue:()D
        //   800: goto            804
        //   803: athrow         
        //   804: d2f            
        //   805: goto            809
        //   808: athrow         
        //   809: invokevirtual   dev/nuker/pyro/f02.c:(Ljava/lang/String;Ldev/nuker/pyro/fZ;F)V
        //   812: goto            816
        //   815: athrow         
        //   816: return         
        //   817: aconst_null    
        //   818: athrow         
        //   819: aconst_null    
        //   820: athrow         
        //   821: aconst_null    
        //   822: athrow         
        //   823: aconst_null    
        //   824: athrow         
        //   825: aconst_null    
        //   826: athrow         
        //   827: aconst_null    
        //   828: athrow         
        //   829: aconst_null    
        //   830: athrow         
        //   831: aconst_null    
        //   832: athrow         
        //   833: pop            
        //   834: goto            24
        //   837: pop            
        //   838: aconst_null    
        //   839: goto            833
        //   842: dup            
        //   843: ifnull          833
        //   846: checkcast       Ljava/lang/Throwable;
        //   849: athrow         
        //   850: dup            
        //   851: ifnull          837
        //   854: checkcast       Ljava/lang/Throwable;
        //   857: athrow         
        //   858: aconst_null    
        //   859: athrow         
        //    StackMapTable: 00 88 FF 00 03 00 03 07 00 03 07 01 38 07 00 D3 00 01 07 00 36 FA 00 04 FF 00 0B 00 00 00 01 07 00 36 FD 00 03 07 00 03 07 01 38 4D 07 00 03 FF 00 01 00 02 07 00 03 07 01 38 00 02 07 00 03 01 5B 07 00 03 FF 00 08 00 00 00 01 07 00 36 FF 00 00 00 03 07 00 03 07 01 38 07 00 D3 00 02 07 00 03 07 00 71 45 07 00 36 FF 00 00 00 03 07 00 03 07 01 38 07 00 D3 00 02 07 00 03 07 00 71 FF 00 10 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 06 07 00 03 07 01 3A 07 01 3A 01 02 07 01 3C FF 00 04 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 06 07 00 03 07 01 3A 07 01 3A 01 02 07 01 3C FF 00 01 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 07 07 00 03 07 01 3A 07 01 3A 01 02 07 01 3C 01 FF 00 1A 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 06 07 00 03 07 01 3A 07 01 3A 01 02 07 01 3C 48 07 00 CC FF 00 00 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 09 07 00 03 07 01 3A 07 01 3A 01 02 07 01 3C 08 00 88 08 00 88 07 00 71 45 07 00 36 FF 00 00 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 09 07 00 03 07 01 3A 07 01 3A 01 02 07 01 3C 08 00 88 08 00 88 07 00 71 FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 09 07 00 03 07 01 3A 07 01 3A 01 02 07 01 3C 08 00 88 08 00 88 07 00 71 45 07 00 36 FF 00 00 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 07 07 00 03 07 01 3A 07 01 3A 01 02 07 01 3C 07 00 E3 FF 00 00 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 06 07 00 03 07 01 3A 07 01 3A 01 02 07 01 3C 45 07 00 36 FF 00 00 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 06 07 00 03 07 01 3A 07 01 3A 01 02 07 00 E9 47 07 00 36 FF 00 00 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 06 07 00 03 07 01 3A 07 01 3A 01 02 07 01 3E 4C 07 00 36 FF 00 00 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 09 07 00 03 07 01 3A 07 01 3A 01 02 07 01 3E 08 00 B9 08 00 B9 07 00 71 45 07 00 36 FF 00 00 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 09 07 00 03 07 01 3A 07 01 3A 01 02 07 01 3E 08 00 B9 08 00 B9 07 00 71 42 07 00 36 FF 00 00 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 09 07 00 03 07 01 3A 07 01 3A 01 02 07 01 3E 08 00 B9 08 00 B9 07 00 71 45 07 00 36 FF 00 00 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 07 07 00 03 07 01 3A 07 01 3A 01 02 07 01 3E 07 00 E3 FF 00 00 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 06 07 00 03 07 01 3A 07 01 3A 01 02 07 01 3E 45 07 00 36 FF 00 00 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 06 07 00 03 07 01 3A 07 01 3A 01 02 07 00 F1 47 07 00 36 FF 00 00 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 06 07 00 03 07 01 3A 07 01 3A 01 02 02 43 07 00 36 FF 00 00 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 05 07 00 03 07 01 3A 07 01 3A 01 02 45 07 00 36 FF 00 00 00 04 07 00 03 07 01 38 07 00 D3 07 00 71 00 05 07 00 03 07 01 3A 07 01 3A 01 07 00 F7 FF 00 10 00 07 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 00 07 00 03 00 01 01 FF 00 01 00 07 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 00 07 00 03 00 02 01 01 5E 01 FF 00 11 00 07 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 00 03 07 00 71 07 01 3A 01 FF 00 02 00 07 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 00 04 07 00 71 07 01 3A 01 01 FF 00 1E 00 07 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 00 03 07 00 71 07 01 3A 01 FF 00 02 00 00 00 01 07 00 36 FF 00 00 00 07 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 00 03 07 00 71 07 01 3A 01 45 07 00 36 FF 00 00 00 07 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 00 02 07 00 71 07 01 3A 42 07 00 CC FF 00 00 00 07 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 00 02 07 00 71 07 01 3A 45 07 00 36 40 07 00 71 FF 00 0A 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 01 07 00 36 FF 00 00 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 02 07 00 03 07 00 71 45 07 00 36 00 4C 07 00 03 FF 00 02 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 02 07 00 03 01 5E 07 00 03 45 07 00 20 40 07 00 95 45 07 00 36 40 07 00 73 45 07 00 36 40 07 01 14 45 07 00 36 40 01 02 05 42 01 1B 0B 42 01 1C 47 07 00 36 FF 00 00 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 02 07 00 3F 07 00 71 45 07 00 36 FF 00 00 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 02 07 00 3F 07 00 71 56 07 00 36 FF 00 00 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 08 07 00 3F 07 00 71 07 00 51 02 02 02 02 07 01 22 45 07 00 36 FF 00 00 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 08 07 00 3F 07 00 71 07 00 51 02 02 02 02 02 44 07 00 36 FF 00 00 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 06 07 00 3F 07 00 71 07 00 51 02 02 02 45 07 00 36 FF 00 00 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 05 07 00 3F 07 00 71 07 00 51 02 02 FF 00 03 00 00 00 01 07 00 36 FF 00 00 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 04 07 00 3F 07 00 71 07 00 51 02 45 07 00 36 00 02 0B 42 01 1D FF 00 10 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 02 07 00 3F 07 00 71 FF 00 02 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 03 07 00 3F 07 00 71 01 FF 00 1F 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 02 07 00 3F 07 00 71 42 07 00 36 FF 00 00 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 02 07 00 3F 07 00 71 45 07 00 36 FF 00 00 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 02 07 00 3F 07 00 71 FF 00 0F 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 04 07 00 3F 07 00 71 07 00 51 07 00 03 FF 00 02 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 05 07 00 3F 07 00 71 07 00 51 07 00 03 01 FF 00 1D 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 04 07 00 3F 07 00 71 07 00 51 07 00 03 45 07 00 C4 FF 00 00 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 04 07 00 3F 07 00 71 07 00 51 07 00 5E 45 07 00 36 FF 00 00 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 04 07 00 3F 07 00 71 07 00 51 07 00 73 45 07 00 36 FF 00 00 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 04 07 00 3F 07 00 71 07 00 51 07 00 64 45 07 00 36 FF 00 00 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 04 07 00 3F 07 00 71 07 00 51 03 FF 00 03 00 00 00 01 07 00 36 FF 00 00 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 04 07 00 3F 07 00 71 07 00 51 02 45 07 00 36 00 FF 00 00 00 07 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 00 03 07 00 71 07 01 3A 01 FF 00 01 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 04 07 00 3F 07 00 71 07 00 51 07 00 03 41 07 00 03 01 01 FF 00 01 00 08 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 01 07 00 03 07 00 71 00 02 07 00 3F 07 00 71 FF 00 01 00 07 07 00 03 07 01 38 07 00 D3 07 00 71 07 01 3A 00 07 00 03 00 01 01 FF 00 01 00 02 07 00 03 07 01 38 00 01 07 00 03 41 07 00 CC 43 05 44 07 00 CC 47 05 FF 00 07 00 03 07 00 03 07 01 38 07 00 D3 00 01 07 00 36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     842    850    Ljava/lang/NumberFormatException;
        //  842    850    842    850    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  858    860    3      8      Ljava/lang/ClassCastException;
        //  78     84     84     85     Any
        //  78     84     3      8      Any
        //  78     84     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  78     84     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  78     84     84     85     Any
        //  145    152    152    153    Any
        //  145    152    145    146    Ljava/lang/ArithmeticException;
        //  145    152    152    153    Any
        //  145    152    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  145    152    145    146    Ljava/lang/IndexOutOfBoundsException;
        //  157    163    163    164    Any
        //  157    163    163    164    Any
        //  157    163    3      8      Ljava/lang/ArithmeticException;
        //  157    163    3      8      Any
        //  157    163    163    164    Any
        //  171    180    180    181    Any
        //  172    180    171    172    Any
        //  172    180    3      8      Ljava/lang/IllegalStateException;
        //  171    180    180    181    Ljava/lang/ClassCastException;
        //  171    180    171    172    Ljava/lang/NullPointerException;
        //  194    201    201    202    Any
        //  195    201    201    202    Ljava/lang/NegativeArraySizeException;
        //  195    201    194    195    Any
        //  195    201    194    195    Any
        //  195    201    3      8      Any
        //  205    212    212    213    Any
        //  205    212    212    213    Any
        //  205    212    205    206    Any
        //  205    212    205    206    Ljava/lang/IllegalStateException;
        //  206    212    205    206    Ljava/lang/RuntimeException;
        //  220    229    229    230    Any
        //  221    229    229    230    Ljava/lang/IllegalStateException;
        //  221    229    220    221    Any
        //  220    229    229    230    Any
        //  220    229    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  234    241    241    242    Any
        //  235    241    241    242    Ljava/lang/NullPointerException;
        //  234    241    234    235    Any
        //  235    241    241    242    Any
        //  235    241    234    235    Any
        //  348    354    354    355    Any
        //  348    354    354    355    Ljava/lang/NegativeArraySizeException;
        //  348    354    3      8      Any
        //  348    354    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  348    354    3      8      Any
        //  358    365    365    366    Any
        //  358    365    358    359    Ljava/lang/ArithmeticException;
        //  358    365    358    359    Ljava/lang/NegativeArraySizeException;
        //  358    365    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  358    365    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  377    384    384    385    Any
        //  377    384    3      8      Any
        //  377    384    384    385    Any
        //  377    384    377    378    Any
        //  378    384    377    378    Ljava/lang/NullPointerException;
        //  438    445    445    446    Any
        //  439    445    3      8      Any
        //  438    445    3      8      Any
        //  439    445    438    439    Ljava/lang/UnsupportedOperationException;
        //  439    445    3      8      Ljava/lang/NullPointerException;
        //  452    459    459    460    Any
        //  452    459    3      8      Any
        //  452    459    459    460    Any
        //  453    459    452    453    Any
        //  452    459    3      8      Any
        //  552    559    559    560    Any
        //  553    559    552    553    Ljava/lang/ClassCastException;
        //  553    559    552    553    Ljava/util/NoSuchElementException;
        //  552    559    552    553    Ljava/lang/NegativeArraySizeException;
        //  553    559    552    553    Any
        //  583    590    590    591    Any
        //  584    590    583    584    Any
        //  583    590    3      8      Ljava/lang/IllegalArgumentException;
        //  583    590    3      8      Ljava/lang/RuntimeException;
        //  584    590    583    584    Ljava/lang/NegativeArraySizeException;
        //  596    603    603    604    Any
        //  596    603    596    597    Any
        //  597    603    596    597    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  597    603    596    597    Ljava/lang/RuntimeException;
        //  596    603    596    597    Ljava/util/NoSuchElementException;
        //  609    615    615    616    Any
        //  609    615    615    616    Any
        //  609    615    615    616    Any
        //  609    615    3      8      Any
        //  609    615    615    616    Ljava/lang/UnsupportedOperationException;
        //  719    726    726    727    Any
        //  719    726    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  720    726    726    727    Ljava/lang/NumberFormatException;
        //  719    726    3      8      Any
        //  719    726    719    720    Any
        //  782    789    789    790    Any
        //  782    789    789    790    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  782    789    3      8      Any
        //  783    789    789    790    Ljava/lang/ClassCastException;
        //  782    789    782    783    Ljava/lang/NumberFormatException;
        //  796    803    803    804    Any
        //  796    803    796    797    Any
        //  797    803    803    804    Any
        //  796    803    3      8      Any
        //  797    803    3      8      Any
        //  809    815    815    816    Any
        //  809    815    815    816    Ljava/util/NoSuchElementException;
        //  809    815    815    816    Ljava/lang/IllegalStateException;
        //  809    815    815    816    Ljava/lang/IllegalStateException;
        //  809    815    3      8      Ljava/lang/ArithmeticException;
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
}
