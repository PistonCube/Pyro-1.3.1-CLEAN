// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.NotNull;

public class f91 extends f8W
{
    public double c;
    public double 0;
    public int c;
    public boolean c;
    
    public void c(final int n) {
        fbS.6w(this, 1948760618, n);
    }
    
    @Override
    public void 0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          75
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            67
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            59
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: goto            29
        //    28: athrow         
        //    29: invokestatic    dev/nuker/pyro/f8W.1:()D
        //    32: goto            36
        //    35: athrow         
        //    36: putfield        dev/nuker/pyro/f91.c:D
        //    39: aload_0        
        //    40: iconst_4       
        //    41: putfield        dev/nuker/pyro/f91.c:I
        //    44: aload_0        
        //    45: dconst_0       
        //    46: putfield        dev/nuker/pyro/f91.0:D
        //    49: return         
        //    50: pop            
        //    51: goto            24
        //    54: pop            
        //    55: aconst_null    
        //    56: goto            50
        //    59: dup            
        //    60: ifnull          50
        //    63: checkcast       Ljava/lang/Throwable;
        //    66: athrow         
        //    67: dup            
        //    68: ifnull          54
        //    71: checkcast       Ljava/lang/Throwable;
        //    74: athrow         
        //    75: aconst_null    
        //    76: athrow         
        //    StackMapTable: 00 0D 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FC 00 03 07 00 03 43 07 00 19 40 07 00 03 45 07 00 21 FF 00 00 00 01 07 00 03 00 02 07 00 03 03 4D 07 00 21 43 05 44 07 00 21 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     59     67     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  59     67     59     67     Any
        //  75     77     3      7      Ljava/lang/IllegalStateException;
        //  28     35     35     36     Any
        //  28     35     28     29     Ljava/lang/RuntimeException;
        //  29     35     35     36     Any
        //  28     35     28     29     Ljava/lang/IllegalArgumentException;
        //  28     35     3      7      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 39 out of bounds for length 39
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
    
    @Override
    public void c(@NotNull final f3i p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          371
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            363
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            355
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_1        
        //    27: getstatic       dev/nuker/pyro/fc.0:I
        //    30: ifeq            38
        //    33: ldc             -1034616513
        //    35: goto            40
        //    38: ldc             -1495777818
        //    40: ldc             -784015900
        //    42: ixor           
        //    43: lookupswitch {
        //          319937755: 38
        //          2006769666: 68
        //          default: 338
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokevirtual   dev/nuker/pyro/f3i.c:()Ldev/nuker/pyro/f2T;
        //    75: goto            79
        //    78: athrow         
        //    79: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    82: if_acmpeq       86
        //    85: return         
        //    86: getstatic       dev/nuker/pyro/fc.1:I
        //    89: ifeq            97
        //    92: ldc             682557357
        //    94: goto            99
        //    97: ldc             -1254681058
        //    99: ldc             -1637177263
        //   101: ixor           
        //   102: lookupswitch {
        //          -1228646404: 336
        //          1675794253: 97
        //          default: 128
        //        }
        //   128: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   131: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   134: getstatic       dev/nuker/pyro/fc.1:I
        //   137: ifeq            145
        //   140: ldc             -957505516
        //   142: goto            147
        //   145: ldc             -307716240
        //   147: ldc             -1015755251
        //   149: ixor           
        //   150: lookupswitch {
        //          93941273: 145
        //          786190717: 176
        //          default: 344
        //        }
        //   176: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   179: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   182: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   185: getstatic       dev/nuker/pyro/fc.0:I
        //   188: ifeq            196
        //   191: ldc             -786717862
        //   193: goto            198
        //   196: ldc             -573187645
        //   198: ldc             186567050
        //   200: ixor           
        //   201: lookupswitch {
        //          -691335095: 228
        //          -637179184: 196
        //          default: 342
        //        }
        //   228: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70169_q:D
        //   231: dsub           
        //   232: dstore_2       
        //   233: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   236: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   239: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   242: getstatic       dev/nuker/pyro/fc.1:I
        //   245: ifeq            253
        //   248: ldc             1539650558
        //   250: goto            255
        //   253: ldc             1920703387
        //   255: ldc             -244414809
        //   257: ixor           
        //   258: lookupswitch {
        //          -2095768260: 284
        //          -1431587495: 253
        //          default: 340
        //        }
        //   284: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   287: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   290: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70166_s:D
        //   293: dsub           
        //   294: dstore          4
        //   296: aload_0        
        //   297: dload_2        
        //   298: dload_2        
        //   299: dmul           
        //   300: dload           4
        //   302: dload           4
        //   304: dmul           
        //   305: dadd           
        //   306: dstore          6
        //   308: astore          9
        //   310: iconst_0       
        //   311: istore          8
        //   313: dload           6
        //   315: goto            319
        //   318: athrow         
        //   319: invokestatic    java/lang/Math.sqrt:(D)D
        //   322: goto            326
        //   325: athrow         
        //   326: dstore          10
        //   328: aload           9
        //   330: dload           10
        //   332: putfield        dev/nuker/pyro/f91.0:D
        //   335: return         
        //   336: aconst_null    
        //   337: athrow         
        //   338: aconst_null    
        //   339: athrow         
        //   340: aconst_null    
        //   341: athrow         
        //   342: aconst_null    
        //   343: athrow         
        //   344: aconst_null    
        //   345: athrow         
        //   346: pop            
        //   347: goto            24
        //   350: pop            
        //   351: aconst_null    
        //   352: goto            346
        //   355: dup            
        //   356: ifnull          346
        //   359: checkcast       Ljava/lang/Throwable;
        //   362: athrow         
        //   363: dup            
        //   364: ifnull          350
        //   367: checkcast       Ljava/lang/Throwable;
        //   370: athrow         
        //   371: aconst_null    
        //   372: athrow         
        //    StackMapTable: 00 26 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FD 00 03 07 00 03 07 00 38 4D 07 00 38 FF 00 01 00 02 07 00 03 07 00 38 00 02 07 00 38 01 5B 07 00 38 42 07 00 21 40 07 00 38 45 07 00 21 40 07 00 3D 06 0A 41 01 1C 50 07 00 53 FF 00 01 00 02 07 00 03 07 00 38 00 02 07 00 53 01 5C 07 00 53 FF 00 13 00 02 07 00 03 07 00 38 00 02 03 07 00 53 FF 00 01 00 02 07 00 03 07 00 38 00 03 03 07 00 53 01 FF 00 1D 00 02 07 00 03 07 00 38 00 02 03 07 00 53 FF 00 18 00 03 07 00 03 07 00 38 03 00 01 03 FF 00 01 00 03 07 00 03 07 00 38 03 00 02 03 01 5C 03 FF 00 21 00 00 00 01 07 00 21 FF 00 00 00 07 07 00 03 07 00 38 03 03 03 01 07 00 03 00 01 03 45 07 00 21 40 03 FF 00 09 00 02 07 00 03 07 00 38 00 00 41 07 00 38 FF 00 01 00 03 07 00 03 07 00 38 03 00 01 03 FF 00 01 00 02 07 00 03 07 00 38 00 02 03 07 00 53 41 07 00 53 41 07 00 19 43 05 44 07 00 19 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     355    363    Ljava/lang/EnumConstantNotPresentException;
        //  355    363    355    363    Ljava/lang/IllegalArgumentException;
        //  371    373    3      8      Any
        //  71     78     78     79     Any
        //  72     78     71     72     Any
        //  72     78     71     72     Any
        //  71     78     78     79     Ljava/lang/RuntimeException;
        //  72     78     3      8      Ljava/lang/IllegalArgumentException;
        //  319    325    325    326    Any
        //  319    325    325    326    Ljava/util/NoSuchElementException;
        //  319    325    3      8      Any
        //  319    325    325    326    Ljava/lang/AssertionError;
        //  319    325    325    326    Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:667)
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
    
    public int c() {
        return fbS.bk(this, 298917915);
    }
    
    @Override
    public void c(@NotNull final f3e p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2401
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            2393
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2385
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            37
        //    32: ldc             248059098
        //    34: goto            39
        //    37: ldc             696821646
        //    39: ldc             1657763130
        //    41: ixor           
        //    42: lookupswitch {
        //          198993895: 37
        //          1812357600: 2346
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: goto            73
        //    72: athrow         
        //    73: invokevirtual   dev/nuker/pyro/f3e.c:()Ldev/nuker/pyro/f2T;
        //    76: goto            80
        //    79: athrow         
        //    80: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    83: if_acmpne       142
        //    86: aload_1        
        //    87: getstatic       dev/nuker/pyro/fc.1:I
        //    90: ifeq            98
        //    93: ldc             -871875093
        //    95: goto            100
        //    98: ldc             -1101437111
        //   100: ldc             2085997370
        //   102: ixor           
        //   103: lookupswitch {
        //          -1336019247: 98
        //          -1039356813: 128
        //          default: 2336
        //        }
        //   128: goto            132
        //   131: athrow         
        //   132: invokevirtual   dev/nuker/pyro/f3e.0:()Z
        //   135: goto            139
        //   138: athrow         
        //   139: ifeq            143
        //   142: return         
        //   143: goto            147
        //   146: athrow         
        //   147: invokestatic    dev/nuker/pyro/fbl.7:()Z
        //   150: goto            154
        //   153: athrow         
        //   154: ifeq            172
        //   157: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   160: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   163: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70143_R:F
        //   166: ldc             5.0
        //   168: fcmpl          
        //   169: ifle            200
        //   172: getstatic       dev/nuker/pyro/f02.c:Ldev/nuker/pyro/f02;
        //   175: ldc             "\u2219\u1483\u8b06\ub1cd\ucf6c\uec04\ub225\ue736"
        //   177: goto            181
        //   180: athrow         
        //   181: invokestatic    invokestatic   !!! ERROR
        //   184: goto            188
        //   187: athrow         
        //   188: goto            192
        //   191: athrow         
        //   192: invokevirtual   dev/nuker/pyro/f02.1:(Ljava/lang/String;)V
        //   195: goto            199
        //   198: athrow         
        //   199: return         
        //   200: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f82;
        //   203: getfield        dev/nuker/pyro/f82.c:Ldev/nuker/pyro/fw;
        //   206: goto            210
        //   209: athrow         
        //   210: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   213: goto            217
        //   216: athrow         
        //   217: dup            
        //   218: pop            
        //   219: checkcast       Ljava/lang/Boolean;
        //   222: getstatic       dev/nuker/pyro/fc.c:I
        //   225: ifge            233
        //   228: ldc             -724114270
        //   230: goto            235
        //   233: ldc             -558246698
        //   235: ldc             -1942004614
        //   237: ixor           
        //   238: lookupswitch {
        //          1491712216: 2348
        //          1736833845: 233
        //          default: 264
        //        }
        //   264: goto            268
        //   267: athrow         
        //   268: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   271: goto            275
        //   274: athrow         
        //   275: ifeq            374
        //   278: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f82;
        //   281: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f82;
        //   284: getstatic       dev/nuker/pyro/fc.0:I
        //   287: ifeq            295
        //   290: ldc             -353967702
        //   292: goto            297
        //   295: ldc             1688500440
        //   297: ldc             -36245670
        //   299: ixor           
        //   300: lookupswitch {
        //          -1720543358: 328
        //          389025520: 295
        //          default: 2326
        //        }
        //   328: getfield        dev/nuker/pyro/f82.c:Ldev/nuker/pyro/f0d;
        //   331: goto            335
        //   334: athrow         
        //   335: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   338: goto            342
        //   341: athrow         
        //   342: checkcast       Ljava/lang/Number;
        //   345: goto            349
        //   348: athrow         
        //   349: invokevirtual   java/lang/Number.doubleValue:()D
        //   352: goto            356
        //   355: athrow         
        //   356: goto            360
        //   359: athrow         
        //   360: invokevirtual   dev/nuker/pyro/f82.0:(D)D
        //   363: goto            367
        //   366: athrow         
        //   367: fconst_0       
        //   368: f2d            
        //   369: dcmpl          
        //   370: ifle            374
        //   373: return         
        //   374: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f7Y;
        //   377: getstatic       dev/nuker/pyro/fc.1:I
        //   380: ifeq            388
        //   383: ldc             398220999
        //   385: goto            390
        //   388: ldc             -117623076
        //   390: ldc             420033776
        //   392: ixor           
        //   393: lookupswitch {
        //          -1414886020: 388
        //          246770231: 2358
        //          default: 420
        //        }
        //   420: goto            424
        //   423: athrow         
        //   424: invokevirtual   dev/nuker/pyro/f7Y.1:()Ldev/nuker/pyro/f0a;
        //   427: goto            431
        //   430: athrow         
        //   431: goto            435
        //   434: athrow         
        //   435: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   438: goto            442
        //   441: athrow         
        //   442: checkcast       Ljava/lang/Boolean;
        //   445: goto            449
        //   448: athrow         
        //   449: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   452: goto            456
        //   455: athrow         
        //   456: ifeq            464
        //   459: ldc             -1873904089
        //   461: goto            466
        //   464: ldc             -1873904092
        //   466: ldc             -1504656638
        //   468: ixor           
        //   469: tableswitch {
        //          1815968330: 492
        //          1815968331: 611
        //          default: 459
        //        }
        //   492: getstatic       dev/nuker/pyro/fc.c:I
        //   495: ifge            503
        //   498: ldc             -1627043219
        //   500: goto            505
        //   503: ldc             908040576
        //   505: ldc             -6145309
        //   507: ixor           
        //   508: lookupswitch {
        //          1621586062: 2338
        //          1847204692: 503
        //          default: 536
        //        }
        //   536: getstatic       dev/nuker/pyro/f02.c:Ldev/nuker/pyro/f02;
        //   539: ldc             "\u2219\u1483\u8b06\ub1cd\ucf6c\uec04\ub225\ue736"
        //   541: goto            545
        //   544: athrow         
        //   545: invokestatic    invokestatic   !!! ERROR
        //   548: goto            552
        //   551: athrow         
        //   552: getstatic       dev/nuker/pyro/fZ.0:Ldev/nuker/pyro/fZ;
        //   555: ldc             1.088
        //   557: getstatic       dev/nuker/pyro/fc.0:I
        //   560: ifeq            568
        //   563: ldc             1754309801
        //   565: goto            570
        //   568: ldc             1449483416
        //   570: ldc             -1972129808
        //   572: ixor           
        //   573: lookupswitch {
        //          -931147753: 568
        //          -488436903: 2342
        //          default: 600
        //        }
        //   600: goto            604
        //   603: athrow         
        //   604: invokevirtual   dev/nuker/pyro/f02.c:(Ljava/lang/String;Ldev/nuker/pyro/fZ;F)V
        //   607: goto            611
        //   610: athrow         
        //   611: aload_0        
        //   612: getfield        dev/nuker/pyro/f91.c:I
        //   615: iconst_1       
        //   616: if_icmpne       750
        //   619: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   622: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   625: getfield        net/minecraft/client/entity/EntityPlayerSP.field_191988_bg:F
        //   628: fconst_0       
        //   629: fcmpg          
        //   630: ifne            638
        //   633: ldc             -985740170
        //   635: goto            640
        //   638: ldc             -985740175
        //   640: ldc             198220661
        //   642: ixor           
        //   643: tableswitch {
        //          -1646481914: 664
        //          -1646481913: 678
        //          default: 633
        //        }
        //   664: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   667: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   670: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70702_br:F
        //   673: fconst_0       
        //   674: fcmpg          
        //   675: ifeq            750
        //   678: getstatic       dev/nuker/pyro/fc.c:I
        //   681: ifge            689
        //   684: ldc             -138972128
        //   686: goto            692
        //   689: ldc_w           49864620
        //   692: ldc_w           1937745389
        //   695: ixor           
        //   696: lookupswitch {
        //          -2067213875: 689
        //          1904704065: 724
        //          default: 2374
        //        }
        //   724: aload_0        
        //   725: ldc2_w          1.35
        //   728: goto            732
        //   731: athrow         
        //   732: invokestatic    dev/nuker/pyro/f8W.1:()D
        //   735: goto            739
        //   738: athrow         
        //   739: dmul           
        //   740: ldc2_w          0.01
        //   743: dsub           
        //   744: putfield        dev/nuker/pyro/f91.c:D
        //   747: goto            2007
        //   750: aload_0        
        //   751: getfield        dev/nuker/pyro/f91.c:I
        //   754: iconst_2       
        //   755: if_icmpne       1392
        //   758: getstatic       dev/nuker/pyro/fc.0:I
        //   761: ifeq            770
        //   764: ldc_w           -1082254613
        //   767: goto            773
        //   770: ldc_w           857543243
        //   773: ldc_w           -2024883237
        //   776: ixor           
        //   777: lookupswitch {
        //          -2029828394: 770
        //          942711088: 2350
        //          default: 804
        //        }
        //   804: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   807: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   810: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70124_G:Z
        //   813: ifeq            1392
        //   816: getstatic       dev/nuker/pyro/fc.1:I
        //   819: ifeq            828
        //   822: ldc_w           544165656
        //   825: goto            831
        //   828: ldc_w           1157239351
        //   831: ldc_w           536979450
        //   834: ixor           
        //   835: lookupswitch {
        //          -1542131728: 828
        //          7268578: 2316
        //          default: 860
        //        }
        //   860: aload_1        
        //   861: ldc2_w          0.4
        //   864: dstore_2       
        //   865: astore          9
        //   867: iconst_0       
        //   868: istore          4
        //   870: iconst_0       
        //   871: getstatic       dev/nuker/pyro/fc.0:I
        //   874: ifeq            883
        //   877: ldc_w           -1003161827
        //   880: goto            886
        //   883: ldc_w           180570623
        //   886: ldc_w           707723729
        //   889: ixor           
        //   890: lookupswitch {
        //          -300157236: 883
        //          552355886: 916
        //          default: 2368
        //        }
        //   916: istore          5
        //   918: getstatic       dev/nuker/pyro/fc.c:I
        //   921: ifge            930
        //   924: ldc_w           -1170537003
        //   927: goto            933
        //   930: ldc_w           929766172
        //   933: ldc_w           -1114257050
        //   936: ixor           
        //   937: lookupswitch {
        //          -1963011462: 964
        //          128896179: 930
        //          default: 2334
        //        }
        //   964: dload_2        
        //   965: dstore          6
        //   967: iconst_0       
        //   968: istore          8
        //   970: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //   973: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   976: dload           6
        //   978: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //   981: getstatic       dev/nuker/pyro/fc.1:I
        //   984: ifeq            993
        //   987: ldc_w           1096626387
        //   990: goto            996
        //   993: ldc_w           94670231
        //   996: ldc_w           201378965
        //   999: ixor           
        //  1000: lookupswitch {
        //          161759490: 1028
        //          1298005062: 993
        //          default: 2324
        //        }
        //  1028: dload_2        
        //  1029: getstatic       dev/nuker/pyro/fc.c:I
        //  1032: ifge            1041
        //  1035: ldc_w           762661114
        //  1038: goto            1044
        //  1041: ldc_w           2029295365
        //  1044: ldc_w           268729929
        //  1047: ixor           
        //  1048: lookupswitch {
        //          1030829747: 1041
        //          1760618828: 1076
        //          default: 2320
        //        }
        //  1076: dstore          10
        //  1078: getstatic       dev/nuker/pyro/fc.c:I
        //  1081: ifge            1090
        //  1084: ldc_w           1344967179
        //  1087: goto            1093
        //  1090: ldc_w           -2027204677
        //  1093: ldc_w           -333931712
        //  1096: ixor           
        //  1097: lookupswitch {
        //          -1137571509: 2370
        //          -258278973: 1090
        //          default: 1124
        //        }
        //  1124: aload           9
        //  1126: dload           10
        //  1128: goto            1132
        //  1131: athrow         
        //  1132: invokevirtual   dev/nuker/pyro/f3e.c:(D)V
        //  1135: goto            1139
        //  1138: athrow         
        //  1139: aload_0        
        //  1140: aload_0        
        //  1141: getstatic       dev/nuker/pyro/fc.c:I
        //  1144: ifge            1153
        //  1147: ldc_w           803354492
        //  1150: goto            1156
        //  1153: ldc_w           -543372022
        //  1156: ldc_w           -791432565
        //  1159: ixor           
        //  1160: lookupswitch {
        //          -13531657: 2356
        //          1414342381: 1153
        //          default: 1188
        //        }
        //  1188: getfield        dev/nuker/pyro/f91.c:Z
        //  1191: ifne            1200
        //  1194: ldc_w           1102791094
        //  1197: goto            1203
        //  1200: ldc_w           1102791093
        //  1203: ldc_w           1897403255
        //  1206: ixor           
        //  1207: tableswitch {
        //          1632019842: 1228
        //          1632019843: 1232
        //          default: 1194
        //        }
        //  1228: iconst_1       
        //  1229: goto            1233
        //  1232: iconst_0       
        //  1233: getstatic       dev/nuker/pyro/fc.c:I
        //  1236: ifge            1245
        //  1239: ldc_w           1141016466
        //  1242: goto            1248
        //  1245: ldc_w           -934791607
        //  1248: ldc_w           -634825682
        //  1251: ixor           
        //  1252: lookupswitch {
        //          -1641294916: 1245
        //          308372071: 1280
        //          default: 2314
        //        }
        //  1280: putfield        dev/nuker/pyro/f91.c:Z
        //  1283: getstatic       dev/nuker/pyro/fc.0:I
        //  1286: ifeq            1295
        //  1289: ldc_w           -38814639
        //  1292: goto            1298
        //  1295: ldc_w           813600113
        //  1298: ldc_w           1762167257
        //  1301: ixor           
        //  1302: lookupswitch {
        //          -1800981112: 2322
        //          -673734552: 1295
        //          default: 1328
        //        }
        //  1328: aload_0        
        //  1329: dup            
        //  1330: getfield        dev/nuker/pyro/f91.c:D
        //  1333: aload_0        
        //  1334: getfield        dev/nuker/pyro/f91.c:Z
        //  1337: ifeq            1346
        //  1340: ldc_w           1382566771
        //  1343: goto            1349
        //  1346: ldc_w           1382566768
        //  1349: ldc_w           -405631402
        //  1352: ixor           
        //  1353: tableswitch {
        //          1802865226: 1376
        //          1802865227: 1382
        //          default: 1340
        //        }
        //  1376: ldc2_w          1.6835
        //  1379: goto            1385
        //  1382: ldc2_w          1.395
        //  1385: dmul           
        //  1386: putfield        dev/nuker/pyro/f91.c:D
        //  1389: goto            2007
        //  1392: getstatic       dev/nuker/pyro/fc.0:I
        //  1395: ifeq            1404
        //  1398: ldc_w           258191219
        //  1401: goto            1407
        //  1404: ldc_w           748582315
        //  1407: ldc_w           -1830667810
        //  1410: ixor           
        //  1411: lookupswitch {
        //          -1652451667: 1404
        //          -1099150219: 1436
        //          default: 2328
        //        }
        //  1436: aload_0        
        //  1437: getfield        dev/nuker/pyro/f91.c:I
        //  1440: iconst_3       
        //  1441: if_icmpne       1570
        //  1444: ldc2_w          0.66
        //  1447: aload_0        
        //  1448: getfield        dev/nuker/pyro/f91.0:D
        //  1451: goto            1455
        //  1454: athrow         
        //  1455: invokestatic    dev/nuker/pyro/f8W.1:()D
        //  1458: goto            1462
        //  1461: athrow         
        //  1462: dsub           
        //  1463: dmul           
        //  1464: dstore_2       
        //  1465: aload_0        
        //  1466: aload_0        
        //  1467: getfield        dev/nuker/pyro/f91.0:D
        //  1470: getstatic       dev/nuker/pyro/fc.c:I
        //  1473: ifge            1482
        //  1476: ldc_w           68309845
        //  1479: goto            1485
        //  1482: ldc_w           114114648
        //  1485: ldc_w           1360397258
        //  1488: ixor           
        //  1489: lookupswitch {
        //          1426346143: 1482
        //          1473987474: 1516
        //          default: 2360
        //        }
        //  1516: dload_2        
        //  1517: dsub           
        //  1518: getstatic       dev/nuker/pyro/fc.0:I
        //  1521: ifeq            1530
        //  1524: ldc_w           -860198340
        //  1527: goto            1533
        //  1530: ldc_w           1947906302
        //  1533: ldc_w           2078174905
        //  1536: ixor           
        //  1537: lookupswitch {
        //          -1218182011: 2344
        //          1290723396: 1530
        //          default: 1564
        //        }
        //  1564: putfield        dev/nuker/pyro/f91.c:D
        //  1567: goto            2007
        //  1570: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  1573: getstatic       dev/nuker/pyro/fc.c:I
        //  1576: ifge            1585
        //  1579: ldc_w           -1101089450
        //  1582: goto            1588
        //  1585: ldc_w           209302201
        //  1588: ldc_w           1373943201
        //  1591: ixor           
        //  1592: lookupswitch {
        //          -273022729: 2364
        //          448626361: 1585
        //          default: 1620
        //        }
        //  1620: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1623: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  1626: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1629: checkcast       Lnet/minecraft/entity/Entity;
        //  1632: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  1635: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1638: dup            
        //  1639: pop            
        //  1640: goto            1644
        //  1643: athrow         
        //  1644: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_174813_aQ:()Lnet/minecraft/util/math/AxisAlignedBB;
        //  1647: goto            1651
        //  1650: athrow         
        //  1651: dconst_0       
        //  1652: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  1655: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1658: getstatic       dev/nuker/pyro/fc.1:I
        //  1661: ifeq            1670
        //  1664: ldc_w           -1615613820
        //  1667: goto            1673
        //  1670: ldc_w           513667253
        //  1673: ldc_w           -238057446
        //  1676: ixor           
        //  1677: lookupswitch {
        //          1136772743: 1670
        //          1853634718: 2318
        //          default: 1704
        //        }
        //  1704: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70181_x:D
        //  1707: dconst_0       
        //  1708: goto            1712
        //  1711: athrow         
        //  1712: invokevirtual   net/minecraft/util/math/AxisAlignedBB.func_72317_d:(DDD)Lnet/minecraft/util/math/AxisAlignedBB;
        //  1715: goto            1719
        //  1718: athrow         
        //  1719: goto            1723
        //  1722: athrow         
        //  1723: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_184144_a:(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
        //  1726: goto            1730
        //  1729: athrow         
        //  1730: astore_2       
        //  1731: getstatic       dev/nuker/pyro/fc.1:I
        //  1734: ifeq            1743
        //  1737: ldc_w           -901116598
        //  1740: goto            1746
        //  1743: ldc_w           1497025942
        //  1746: ldc_w           -510942275
        //  1749: ixor           
        //  1750: lookupswitch {
        //          -630495831: 1743
        //          734113527: 2372
        //          default: 1776
        //        }
        //  1776: aload_2        
        //  1777: goto            1781
        //  1780: athrow         
        //  1781: invokeinterface java/util/List.size:()I
        //  1786: goto            1790
        //  1789: athrow         
        //  1790: ifgt            1799
        //  1793: ldc_w           -1578082141
        //  1796: goto            1802
        //  1799: ldc_w           -1578082148
        //  1802: ldc_w           -5540356
        //  1805: ixor           
        //  1806: tableswitch {
        //          -1128912194: 1828
        //          -1128912193: 1840
        //          default: 1793
        //        }
        //  1828: getstatic       dev/nuker/pyro/f8W.c:Lnet/minecraft/client/Minecraft;
        //  1831: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1834: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70124_G:Z
        //  1837: ifeq            1943
        //  1840: getstatic       dev/nuker/pyro/fc.1:I
        //  1843: ifeq            1852
        //  1846: ldc_w           -1092487898
        //  1849: goto            1855
        //  1852: ldc_w           -1059754516
        //  1855: ldc_w           -1175714773
        //  1858: ixor           
        //  1859: lookupswitch {
        //          -181015380: 1852
        //          118354189: 2330
        //          default: 1884
        //        }
        //  1884: aload_0        
        //  1885: getstatic       dev/nuker/pyro/fc.1:I
        //  1888: ifeq            1897
        //  1891: ldc_w           1868382212
        //  1894: goto            1900
        //  1897: ldc_w           1983779230
        //  1900: ldc_w           1075597510
        //  1903: ixor           
        //  1904: lookupswitch {
        //          792793282: 1897
        //          908214616: 1932
        //          default: 2352
        //        }
        //  1932: getfield        dev/nuker/pyro/f91.c:I
        //  1935: ifle            1943
        //  1938: aload_0        
        //  1939: iconst_1       
        //  1940: putfield        dev/nuker/pyro/f91.c:I
        //  1943: aload_0        
        //  1944: aload_0        
        //  1945: getstatic       dev/nuker/pyro/fc.1:I
        //  1948: ifeq            1957
        //  1951: ldc_w           -520654837
        //  1954: goto            1960
        //  1957: ldc_w           581310906
        //  1960: ldc_w           1876752541
        //  1963: ixor           
        //  1964: lookupswitch {
        //          -1892972394: 2340
        //          318301825: 1957
        //          default: 1992
        //        }
        //  1992: getfield        dev/nuker/pyro/f91.0:D
        //  1995: aload_0        
        //  1996: getfield        dev/nuker/pyro/f91.0:D
        //  1999: ldc2_w          159.0
        //  2002: ddiv           
        //  2003: dsub           
        //  2004: putfield        dev/nuker/pyro/f91.c:D
        //  2007: getstatic       dev/nuker/pyro/fc.c:I
        //  2010: ifge            2019
        //  2013: ldc_w           -89715754
        //  2016: goto            2022
        //  2019: ldc_w           -879919915
        //  2022: ldc_w           -337796083
        //  2025: ixor           
        //  2026: lookupswitch {
        //          293253083: 2312
        //          1096151223: 2019
        //          default: 2052
        //        }
        //  2052: aload_1        
        //  2053: getstatic       dev/nuker/pyro/fc.0:I
        //  2056: ifeq            2065
        //  2059: ldc_w           -1185434824
        //  2062: goto            2068
        //  2065: ldc_w           -290644029
        //  2068: ldc_w           -1648471620
        //  2071: ixor           
        //  2072: lookupswitch {
        //          619307652: 2065
        //          1930645119: 2100
        //          default: 2354
        //        }
        //  2100: goto            2104
        //  2103: athrow         
        //  2104: invokevirtual   dev/nuker/pyro/f3e.c:()V
        //  2107: goto            2111
        //  2110: athrow         
        //  2111: aload_0        
        //  2112: aload_0        
        //  2113: getstatic       dev/nuker/pyro/fc.c:I
        //  2116: ifge            2125
        //  2119: ldc_w           -1797977916
        //  2122: goto            2128
        //  2125: ldc_w           1944247195
        //  2128: ldc_w           -888306436
        //  2131: ixor           
        //  2132: lookupswitch {
        //          -1192272025: 2160
        //          1608027192: 2125
        //          default: 2366
        //        }
        //  2160: getfield        dev/nuker/pyro/f91.c:D
        //  2163: goto            2167
        //  2166: athrow         
        //  2167: invokestatic    dev/nuker/pyro/f8W.1:()D
        //  2170: goto            2174
        //  2173: athrow         
        //  2174: getstatic       dev/nuker/pyro/fc.c:I
        //  2177: ifge            2186
        //  2180: ldc_w           2103435849
        //  2183: goto            2189
        //  2186: ldc_w           -1873758379
        //  2189: ldc_w           -1299366606
        //  2192: ixor           
        //  2193: lookupswitch {
        //          -808263813: 2186
        //          584944231: 2220
        //          default: 2332
        //        }
        //  2220: goto            2224
        //  2223: athrow         
        //  2224: invokestatic    java/lang/Math.max:(DD)D
        //  2227: goto            2231
        //  2230: athrow         
        //  2231: putfield        dev/nuker/pyro/f91.c:D
        //  2234: aload_1        
        //  2235: aload_0        
        //  2236: getfield        dev/nuker/pyro/f91.c:D
        //  2239: goto            2243
        //  2242: athrow         
        //  2243: invokestatic    dev/nuker/pyro/fbl.c:(Ldev/nuker/pyro/f3e;D)V
        //  2246: goto            2250
        //  2249: athrow         
        //  2250: getstatic       dev/nuker/pyro/fc.1:I
        //  2253: ifeq            2262
        //  2256: ldc_w           -1772393998
        //  2259: goto            2265
        //  2262: ldc_w           2089588722
        //  2265: ldc_w           -1559091918
        //  2268: ixor           
        //  2269: lookupswitch {
        //          866437751: 2262
        //          893996224: 2362
        //          default: 2296
        //        }
        //  2296: aload_0        
        //  2297: dup            
        //  2298: dup            
        //  2299: getfield        dev/nuker/pyro/f91.c:I
        //  2302: iconst_1       
        //  2303: iadd           
        //  2304: putfield        dev/nuker/pyro/f91.c:I
        //  2307: getfield        dev/nuker/pyro/f91.c:I
        //  2310: pop            
        //  2311: return         
        //  2312: aconst_null    
        //  2313: athrow         
        //  2314: aconst_null    
        //  2315: athrow         
        //  2316: aconst_null    
        //  2317: athrow         
        //  2318: aconst_null    
        //  2319: athrow         
        //  2320: aconst_null    
        //  2321: athrow         
        //  2322: aconst_null    
        //  2323: athrow         
        //  2324: aconst_null    
        //  2325: athrow         
        //  2326: aconst_null    
        //  2327: athrow         
        //  2328: aconst_null    
        //  2329: athrow         
        //  2330: aconst_null    
        //  2331: athrow         
        //  2332: aconst_null    
        //  2333: athrow         
        //  2334: aconst_null    
        //  2335: athrow         
        //  2336: aconst_null    
        //  2337: athrow         
        //  2338: aconst_null    
        //  2339: athrow         
        //  2340: aconst_null    
        //  2341: athrow         
        //  2342: aconst_null    
        //  2343: athrow         
        //  2344: aconst_null    
        //  2345: athrow         
        //  2346: aconst_null    
        //  2347: athrow         
        //  2348: aconst_null    
        //  2349: athrow         
        //  2350: aconst_null    
        //  2351: athrow         
        //  2352: aconst_null    
        //  2353: athrow         
        //  2354: aconst_null    
        //  2355: athrow         
        //  2356: aconst_null    
        //  2357: athrow         
        //  2358: aconst_null    
        //  2359: athrow         
        //  2360: aconst_null    
        //  2361: athrow         
        //  2362: aconst_null    
        //  2363: athrow         
        //  2364: aconst_null    
        //  2365: athrow         
        //  2366: aconst_null    
        //  2367: athrow         
        //  2368: aconst_null    
        //  2369: athrow         
        //  2370: aconst_null    
        //  2371: athrow         
        //  2372: aconst_null    
        //  2373: athrow         
        //  2374: aconst_null    
        //  2375: athrow         
        //  2376: pop            
        //  2377: goto            24
        //  2380: pop            
        //  2381: aconst_null    
        //  2382: goto            2376
        //  2385: dup            
        //  2386: ifnull          2376
        //  2389: checkcast       Ljava/lang/Throwable;
        //  2392: athrow         
        //  2393: dup            
        //  2394: ifnull          2380
        //  2397: checkcast       Ljava/lang/Throwable;
        //  2400: athrow         
        //  2401: aconst_null    
        //  2402: athrow         
        //    StackMapTable: 01 15 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FD 00 03 07 00 03 07 00 8C 0C 41 01 1C 43 07 00 21 40 07 00 8C 45 07 00 21 40 07 00 3D 51 07 00 8C FF 00 01 00 02 07 00 03 07 00 8C 00 02 07 00 8C 01 5B 07 00 8C 42 07 00 19 40 07 00 8C 45 07 00 21 40 01 02 00 42 07 00 21 00 45 07 00 21 40 01 11 47 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 02 07 00 9F 07 01 91 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 02 07 00 9F 07 01 91 FF 00 02 00 00 00 01 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 02 07 00 9F 07 01 91 45 07 00 21 00 00 48 07 00 21 40 07 00 B8 45 07 00 21 40 07 01 93 4F 07 00 BD FF 00 01 00 02 07 00 03 07 00 8C 00 02 07 00 BD 01 5C 07 00 BD FF 00 02 00 00 00 01 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 01 07 00 BD 45 07 00 21 40 01 FF 00 13 00 02 07 00 03 07 00 8C 00 02 07 00 B3 07 00 B3 FF 00 01 00 02 07 00 03 07 00 8C 00 03 07 00 B3 07 00 B3 01 FF 00 1E 00 02 07 00 03 07 00 8C 00 02 07 00 B3 07 00 B3 FF 00 05 00 00 00 01 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 02 07 00 B3 07 00 CB 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 02 07 00 B3 07 01 93 45 07 00 19 FF 00 00 00 02 07 00 03 07 00 8C 00 02 07 00 B3 07 00 D0 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 02 07 00 B3 03 FF 00 02 00 00 00 01 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 02 07 00 B3 03 45 07 00 21 40 03 06 4D 07 00 DD FF 00 01 00 02 07 00 03 07 00 8C 00 02 07 00 DD 01 5D 07 00 DD 42 07 00 76 40 07 00 DD 45 07 00 21 40 07 00 E2 42 07 00 21 40 07 00 E2 45 07 00 21 40 07 01 93 45 07 00 21 40 07 00 BD 45 07 00 21 40 01 02 04 41 01 19 0A 41 01 1E 47 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 02 07 00 9F 07 01 91 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 02 07 00 9F 07 01 91 FF 00 0F 00 02 07 00 03 07 00 8C 00 04 07 00 9F 07 01 91 07 00 EB 02 FF 00 01 00 02 07 00 03 07 00 8C 00 05 07 00 9F 07 01 91 07 00 EB 02 01 FF 00 1D 00 02 07 00 03 07 00 8C 00 04 07 00 9F 07 01 91 07 00 EB 02 42 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 04 07 00 9F 07 01 91 07 00 EB 02 45 07 00 21 00 15 04 41 01 17 0D 0A 42 01 1F FF 00 06 00 00 00 01 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 02 07 00 03 03 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 03 07 00 03 03 03 0A 13 42 01 1E 17 42 01 1C FF 00 16 00 09 07 00 03 07 00 8C 03 01 00 00 00 00 07 00 8C 00 01 01 FF 00 02 00 09 07 00 03 07 00 8C 03 01 00 00 00 00 07 00 8C 00 02 01 01 5D 01 FF 00 0D 00 09 07 00 03 07 00 8C 03 01 01 00 00 00 07 00 8C 00 00 42 01 1E FF 00 1C 00 08 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 00 00 42 01 1F 4C 03 FF 00 02 00 08 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 00 02 03 01 5F 03 FC 00 0D 03 42 01 1E 46 07 00 15 FF 00 00 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 02 07 00 8C 03 45 07 00 21 00 FF 00 0D 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 02 07 00 03 07 00 03 FF 00 02 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 03 07 00 03 07 00 03 01 FF 00 1F 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 02 07 00 03 07 00 03 45 07 00 03 45 07 00 03 FF 00 02 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 02 07 00 03 01 58 07 00 03 43 07 00 03 FF 00 00 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 02 07 00 03 01 FF 00 0B 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 02 07 00 03 01 FF 00 02 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 03 07 00 03 01 01 FF 00 1F 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 02 07 00 03 01 0E 42 01 1D FF 00 0B 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 02 07 00 03 03 FF 00 05 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 02 07 00 03 03 FF 00 02 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 03 07 00 03 03 01 FF 00 1A 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 02 07 00 03 03 FF 00 05 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 02 07 00 03 03 FF 00 02 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 03 07 00 03 03 03 FF 00 06 00 02 07 00 03 07 00 8C 00 00 0B 42 01 1C 51 07 00 7C FF 00 00 00 02 07 00 03 07 00 8C 00 02 03 03 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 03 03 03 03 FF 00 13 00 03 07 00 03 07 00 8C 03 00 02 07 00 03 03 FF 00 02 00 03 07 00 03 07 00 8C 03 00 03 07 00 03 03 01 FF 00 1E 00 03 07 00 03 07 00 8C 03 00 02 07 00 03 03 FF 00 0D 00 03 07 00 03 07 00 8C 03 00 02 07 00 03 03 FF 00 02 00 03 07 00 03 07 00 8C 03 00 03 07 00 03 03 01 FF 00 1E 00 03 07 00 03 07 00 8C 03 00 02 07 00 03 03 FA 00 05 4E 07 00 4A FF 00 02 00 02 07 00 03 07 00 8C 00 02 07 00 4A 01 5F 07 00 4A 56 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 03 07 01 5D 07 01 4E 07 00 53 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 03 07 01 5D 07 01 4E 07 01 57 FF 00 12 00 02 07 00 03 07 00 8C 00 05 07 01 5D 07 01 4E 07 01 57 03 07 00 53 FF 00 02 00 02 07 00 03 07 00 8C 00 06 07 01 5D 07 01 4E 07 01 57 03 07 00 53 01 FF 00 1E 00 02 07 00 03 07 00 8C 00 05 07 01 5D 07 01 4E 07 01 57 03 07 00 53 46 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 06 07 01 5D 07 01 4E 07 01 57 03 03 03 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 03 07 01 5D 07 01 4E 07 01 57 42 07 00 19 FF 00 00 00 02 07 00 03 07 00 8C 00 03 07 01 5D 07 01 4E 07 01 57 45 07 00 21 40 07 01 66 FC 00 0C 07 01 66 42 01 1D FF 00 03 00 00 00 01 07 00 21 FF 00 00 00 03 07 00 03 07 00 8C 07 01 66 00 01 07 01 66 47 07 00 21 40 01 02 05 42 01 19 0B 0B 42 01 1C 4C 07 00 03 FF 00 02 00 03 07 00 03 07 00 8C 07 01 66 00 02 07 00 03 01 5F 07 00 03 0A FF 00 0D 00 03 07 00 03 07 00 8C 07 01 66 00 02 07 00 03 07 00 03 FF 00 02 00 03 07 00 03 07 00 8C 07 01 66 00 03 07 00 03 07 00 03 01 FF 00 1F 00 03 07 00 03 07 00 8C 07 01 66 00 02 07 00 03 07 00 03 FA 00 0E 0B 42 01 1D 4C 07 00 8C FF 00 02 00 02 07 00 03 07 00 8C 00 02 07 00 8C 01 5F 07 00 8C 42 07 00 7C 40 07 00 8C 45 07 00 21 00 FF 00 0D 00 02 07 00 03 07 00 8C 00 02 07 00 03 07 00 03 FF 00 02 00 02 07 00 03 07 00 8C 00 03 07 00 03 07 00 03 01 FF 00 1F 00 02 07 00 03 07 00 8C 00 02 07 00 03 07 00 03 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 02 07 00 03 03 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 03 07 00 03 03 03 FF 00 0B 00 02 07 00 03 07 00 8C 00 03 07 00 03 03 03 FF 00 02 00 02 07 00 03 07 00 8C 00 04 07 00 03 03 03 01 FF 00 1E 00 02 07 00 03 07 00 8C 00 03 07 00 03 03 03 42 07 00 1B FF 00 00 00 02 07 00 03 07 00 8C 00 03 07 00 03 03 03 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 02 07 00 03 03 4A 07 00 21 FF 00 00 00 02 07 00 03 07 00 8C 00 02 07 00 8C 03 45 07 00 21 00 0B 42 01 1E 0F FF 00 01 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 02 07 00 03 01 FF 00 01 00 02 07 00 03 07 00 8C 00 00 FF 00 01 00 02 07 00 03 07 00 8C 00 05 07 01 5D 07 01 4E 07 01 57 03 07 00 53 FF 00 01 00 08 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 00 01 03 FC 00 01 03 FA 00 01 FF 00 01 00 02 07 00 03 07 00 8C 00 02 07 00 B3 07 00 B3 01 FC 00 01 07 01 66 FF 00 01 00 02 07 00 03 07 00 8C 00 03 07 00 03 03 03 FF 00 01 00 09 07 00 03 07 00 8C 03 01 01 00 00 00 07 00 8C 00 00 FF 00 01 00 02 07 00 03 07 00 8C 00 01 07 00 8C 01 FF 00 01 00 03 07 00 03 07 00 8C 07 01 66 00 02 07 00 03 07 00 03 FF 00 01 00 02 07 00 03 07 00 8C 00 04 07 00 9F 07 01 91 07 00 EB 02 FF 00 01 00 03 07 00 03 07 00 8C 03 00 02 07 00 03 03 FA 00 01 41 07 00 BD 01 FF 00 01 00 03 07 00 03 07 00 8C 07 01 66 00 01 07 00 03 FF 00 01 00 02 07 00 03 07 00 8C 00 01 07 00 8C FF 00 01 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 02 07 00 03 07 00 03 FF 00 01 00 02 07 00 03 07 00 8C 00 01 07 00 DD FF 00 01 00 03 07 00 03 07 00 8C 03 00 02 07 00 03 03 FA 00 01 41 07 00 4A FF 00 01 00 02 07 00 03 07 00 8C 00 02 07 00 03 07 00 03 FF 00 01 00 09 07 00 03 07 00 8C 03 01 00 00 00 00 07 00 8C 00 01 01 FF 00 01 00 09 07 00 03 07 00 8C 03 01 01 03 01 07 00 8C 03 00 00 FF 00 01 00 03 07 00 03 07 00 8C 07 01 66 00 00 FA 00 01 41 07 00 21 43 05 44 07 00 21 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2385   2393   Any
        //  2385   2393   2385   2393   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2401   2403   3      8      Ljava/lang/NegativeArraySizeException;
        //  72     79     79     80     Any
        //  72     79     79     80     Ljava/lang/NumberFormatException;
        //  72     79     72     73     Any
        //  73     79     72     73     Any
        //  72     79     3      8      Any
        //  131    138    138    139    Any
        //  131    138    3      8      Any
        //  132    138    3      8      Any
        //  131    138    131    132    Ljava/util/ConcurrentModificationException;
        //  131    138    131    132    Ljava/lang/IndexOutOfBoundsException;
        //  146    153    153    154    Any
        //  146    153    146    147    Ljava/lang/IllegalArgumentException;
        //  147    153    3      8      Any
        //  147    153    153    154    Ljava/util/ConcurrentModificationException;
        //  147    153    146    147    Ljava/lang/AssertionError;
        //  180    187    187    188    Any
        //  180    187    3      8      Any
        //  181    187    180    181    Ljava/lang/StringIndexOutOfBoundsException;
        //  180    187    187    188    Ljava/lang/NullPointerException;
        //  181    187    180    181    Ljava/lang/AssertionError;
        //  192    198    198    199    Any
        //  192    198    198    199    Ljava/util/NoSuchElementException;
        //  192    198    198    199    Any
        //  192    198    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  192    198    198    199    Any
        //  209    216    216    217    Any
        //  209    216    3      8      Ljava/lang/NegativeArraySizeException;
        //  209    216    209    210    Ljava/util/NoSuchElementException;
        //  210    216    209    210    Any
        //  209    216    209    210    Any
        //  268    274    274    275    Any
        //  268    274    3      8      Any
        //  268    274    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  268    274    3      8      Ljava/lang/UnsupportedOperationException;
        //  268    274    274    275    Ljava/lang/EnumConstantNotPresentException;
        //  335    341    341    342    Any
        //  335    341    3      8      Any
        //  335    341    341    342    Any
        //  335    341    3      8      Ljava/lang/IllegalStateException;
        //  335    341    3      8      Ljava/lang/IllegalStateException;
        //  348    355    355    356    Any
        //  349    355    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  349    355    3      8      Ljava/lang/ClassCastException;
        //  349    355    3      8      Any
        //  348    355    348    349    Ljava/lang/RuntimeException;
        //  360    366    366    367    Any
        //  360    366    366    367    Any
        //  360    366    366    367    Any
        //  360    366    366    367    Any
        //  360    366    366    367    Any
        //  423    430    430    431    Any
        //  423    430    423    424    Ljava/lang/NegativeArraySizeException;
        //  424    430    430    431    Any
        //  424    430    3      8      Ljava/util/NoSuchElementException;
        //  424    430    3      8      Ljava/lang/AssertionError;
        //  434    441    441    442    Any
        //  435    441    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  434    441    441    442    Any
        //  434    441    434    435    Any
        //  435    441    3      8      Ljava/lang/AssertionError;
        //  448    455    455    456    Any
        //  449    455    3      8      Ljava/lang/NullPointerException;
        //  449    455    455    456    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  449    455    448    449    Any
        //  448    455    448    449    Ljava/lang/IndexOutOfBoundsException;
        //  544    551    551    552    Any
        //  545    551    544    545    Ljava/lang/ArithmeticException;
        //  545    551    544    545    Any
        //  544    551    551    552    Ljava/lang/NegativeArraySizeException;
        //  545    551    3      8      Any
        //  603    610    610    611    Any
        //  604    610    603    604    Any
        //  603    610    603    604    Any
        //  603    610    603    604    Any
        //  604    610    610    611    Ljava/lang/IndexOutOfBoundsException;
        //  732    738    738    739    Any
        //  732    738    3      8      Ljava/lang/UnsupportedOperationException;
        //  732    738    738    739    Ljava/lang/IllegalArgumentException;
        //  732    738    738    739    Any
        //  732    738    738    739    Any
        //  1131   1138   1138   1139   Any
        //  1131   1138   1131   1132   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1132   1138   3      8      Ljava/util/NoSuchElementException;
        //  1132   1138   1138   1139   Ljava/lang/NullPointerException;
        //  1132   1138   1138   1139   Ljava/lang/NumberFormatException;
        //  1454   1461   1461   1462   Any
        //  1454   1461   1461   1462   Any
        //  1455   1461   3      8      Ljava/lang/ArithmeticException;
        //  1454   1461   1454   1455   Ljava/lang/IndexOutOfBoundsException;
        //  1455   1461   3      8      Any
        //  1643   1650   1650   1651   Any
        //  1644   1650   1643   1644   Any
        //  1643   1650   1643   1644   Any
        //  1643   1650   3      8      Ljava/lang/UnsupportedOperationException;
        //  1644   1650   3      8      Any
        //  1711   1718   1718   1719   Any
        //  1711   1718   1718   1719   Ljava/lang/NullPointerException;
        //  1711   1718   1711   1712   Any
        //  1712   1718   1718   1719   Ljava/lang/AssertionError;
        //  1711   1718   1718   1719   Any
        //  1722   1729   1729   1730   Any
        //  1723   1729   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1723   1729   1722   1723   Ljava/util/NoSuchElementException;
        //  1722   1729   1722   1723   Ljava/lang/NullPointerException;
        //  1723   1729   1729   1730   Any
        //  1781   1789   1789   1790   Any
        //  1781   1789   1789   1790   Ljava/lang/RuntimeException;
        //  1781   1789   3      8      Ljava/lang/ClassCastException;
        //  1781   1789   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1781   1789   3      8      Any
        //  2103   2110   2110   2111   Any
        //  2103   2110   2110   2111   Ljava/lang/IllegalStateException;
        //  2103   2110   3      8      Ljava/lang/ClassCastException;
        //  2103   2110   2110   2111   Ljava/lang/ClassCastException;
        //  2104   2110   2103   2104   Ljava/lang/IndexOutOfBoundsException;
        //  2166   2173   2173   2174   Any
        //  2167   2173   2166   2167   Ljava/lang/IndexOutOfBoundsException;
        //  2166   2173   2166   2167   Ljava/lang/AssertionError;
        //  2167   2173   3      8      Any
        //  2166   2173   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2223   2230   2230   2231   Any
        //  2223   2230   3      8      Any
        //  2223   2230   2223   2224   Ljava/lang/IllegalArgumentException;
        //  2223   2230   3      8      Ljava/lang/RuntimeException;
        //  2223   2230   3      8      Any
        //  2242   2249   2249   2250   Any
        //  2243   2249   2242   2243   Any
        //  2242   2249   2249   2250   Any
        //  2243   2249   2242   2243   Any
        //  2242   2249   2249   2250   Any
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
    
    public f91() {
        while (true) {
            int n = 0;
            Label_0019: {
                if (fc.0 != 0) {
                    n = 1428252148;
                    break Label_0019;
                }
                n = 1829441775;
            }
            switch (n ^ 0x8121E52E) {
                case -738164518: {
                    continue;
                }
                case -332728895: {
                    this.c = 4;
                    this.c = f8W.1();
                }
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @Override
    public void c() {
        fbS.dt(this, 983082190);
    }
}
