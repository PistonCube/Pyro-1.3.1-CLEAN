// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.client.entity.EntityPlayerSP;
import java.util.function.Consumer;
import java.util.ConcurrentModificationException;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.Nullable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

public class f5E extends fH
{
    @NotNull
    public f0a c;
    @NotNull
    public f0a 0;
    @NotNull
    public f0a 1;
    @NotNull
    public f0a 2;
    @NotNull
    public f0a 3;
    @NotNull
    public f0h c;
    @NotNull
    public f0b c;
    @NotNull
    public f0b 0;
    @NotNull
    public f0a 4;
    @NotNull
    public f0a 5;
    public Vec3d c;
    public boolean c;
    @Nullable
    public BlockPos[] c;
    public boolean[] c;
    public static f5C c;
    
    public void c(@NotNull final f0a f0a) {
        fbS.6P(this, 90686678, f0a);
    }
    
    @NotNull
    public f0a 6() {
        return fbS.0D(this, 1744160774);
    }
    
    @NotNull
    public f0h 4() {
        return fbS.98(this, 1663602846);
    }
    
    @NotNull
    public BlockPos[] c(@NotNull final Entity p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          348
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            340
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            332
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: new             Lnet/minecraft/util/math/BlockPos;
        //    29: dup            
        //    30: aload_1        
        //    31: getstatic       dev/nuker/pyro/fc.1:I
        //    34: ifeq            42
        //    37: ldc             -1419619630
        //    39: goto            44
        //    42: ldc             -731833002
        //    44: ldc             79301717
        //    46: ixor           
        //    47: lookupswitch {
        //          -1344774521: 42
        //          -790949629: 72
        //          default: 315
        //        }
        //    72: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //    75: goto            79
        //    78: athrow         
        //    79: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //    82: goto            86
        //    85: athrow         
        //    86: getstatic       dev/nuker/pyro/fc.0:I
        //    89: ifeq            97
        //    92: ldc             1433836471
        //    94: goto            99
        //    97: ldc             239873755
        //    99: ldc             -564602844
        //   101: ixor           
        //   102: lookupswitch {
        //          -1959902317: 313
        //          289219501: 97
        //          default: 128
        //        }
        //   128: aload_1        
        //   129: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //   132: getstatic       dev/nuker/pyro/fc.c:I
        //   135: ifge            143
        //   138: ldc             -739075380
        //   140: goto            145
        //   143: ldc             -384085049
        //   145: ldc             -400630602
        //   147: ixor           
        //   148: lookupswitch {
        //          17141617: 176
        //          1005340282: 143
        //          default: 317
        //        }
        //   176: goto            180
        //   179: athrow         
        //   180: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   183: goto            187
        //   186: athrow         
        //   187: getstatic       dev/nuker/pyro/fc.0:I
        //   190: ifeq            198
        //   193: ldc             2140783087
        //   195: goto            200
        //   198: ldc             -1650920495
        //   200: ldc             867316438
        //   202: ixor           
        //   203: lookupswitch {
        //          1277948729: 321
        //          1832547428: 198
        //          default: 228
        //        }
        //   228: aload_1        
        //   229: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   232: goto            236
        //   235: athrow         
        //   236: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   239: goto            243
        //   242: athrow         
        //   243: goto            247
        //   246: athrow         
        //   247: invokespecial   net/minecraft/util/math/BlockPos.<init>:(III)V
        //   250: goto            254
        //   253: athrow         
        //   254: astore_2       
        //   255: aload_0        
        //   256: getstatic       dev/nuker/pyro/fc.c:I
        //   259: ifge            267
        //   262: ldc             -907369829
        //   264: goto            269
        //   267: ldc             -1670800310
        //   269: ldc             1259453590
        //   271: ixor           
        //   272: lookupswitch {
        //          -2097471987: 319
        //          -1787145555: 267
        //          default: 300
        //        }
        //   300: aload_2        
        //   301: goto            305
        //   304: athrow         
        //   305: invokevirtual   dev/nuker/pyro/f5E.0:(Lnet/minecraft/util/math/BlockPos;)[Lnet/minecraft/util/math/BlockPos;
        //   308: goto            312
        //   311: athrow         
        //   312: areturn        
        //   313: aconst_null    
        //   314: athrow         
        //   315: aconst_null    
        //   316: athrow         
        //   317: aconst_null    
        //   318: athrow         
        //   319: aconst_null    
        //   320: athrow         
        //   321: aconst_null    
        //   322: athrow         
        //   323: pop            
        //   324: goto            24
        //   327: pop            
        //   328: aconst_null    
        //   329: goto            323
        //   332: dup            
        //   333: ifnull          323
        //   336: checkcast       Ljava/lang/Throwable;
        //   339: athrow         
        //   340: dup            
        //   341: ifnull          327
        //   344: checkcast       Ljava/lang/Throwable;
        //   347: athrow         
        //   348: aconst_null    
        //   349: athrow         
        //    StackMapTable: 00 31 43 07 00 41 04 FF 00 0B 00 00 00 01 07 00 41 FD 00 03 07 00 03 07 00 4A FF 00 11 00 02 07 00 03 07 00 4A 00 03 08 00 1A 08 00 1A 07 00 4A FF 00 01 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 07 00 4A 01 FF 00 1B 00 02 07 00 03 07 00 4A 00 03 08 00 1A 08 00 1A 07 00 4A 45 07 00 32 FF 00 00 00 02 07 00 03 07 00 4A 00 03 08 00 1A 08 00 1A 03 45 07 00 41 FF 00 00 00 02 07 00 03 07 00 4A 00 03 08 00 1A 08 00 1A 01 FF 00 0A 00 02 07 00 03 07 00 4A 00 03 08 00 1A 08 00 1A 01 FF 00 01 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 01 FF 00 1C 00 02 07 00 03 07 00 4A 00 03 08 00 1A 08 00 1A 01 FF 00 0E 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 03 FF 00 01 00 02 07 00 03 07 00 4A 00 05 08 00 1A 08 00 1A 01 03 01 FF 00 1E 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 03 42 07 00 41 FF 00 00 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 03 45 07 00 41 FF 00 00 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 01 FF 00 0A 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 01 FF 00 01 00 02 07 00 03 07 00 4A 00 05 08 00 1A 08 00 1A 01 01 01 FF 00 1B 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 01 46 07 00 41 FF 00 00 00 02 07 00 03 07 00 4A 00 05 08 00 1A 08 00 1A 01 01 03 45 07 00 41 FF 00 00 00 02 07 00 03 07 00 4A 00 05 08 00 1A 08 00 1A 01 01 01 42 07 00 41 FF 00 00 00 02 07 00 03 07 00 4A 00 05 08 00 1A 08 00 1A 01 01 01 45 07 00 41 40 07 00 43 FF 00 0C 00 03 07 00 03 07 00 4A 07 00 43 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 02 07 00 03 01 5E 07 00 03 43 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 02 07 00 03 07 00 43 45 07 00 41 40 07 00 70 FF 00 00 00 02 07 00 03 07 00 4A 00 03 08 00 1A 08 00 1A 01 FF 00 01 00 02 07 00 03 07 00 4A 00 03 08 00 1A 08 00 1A 07 00 4A FF 00 01 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 03 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 01 07 00 03 FF 00 01 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 01 41 07 00 41 43 05 44 07 00 41 47 05 47 07 00 41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     332    340    Ljava/util/ConcurrentModificationException;
        //  332    340    332    340    Ljava/lang/AssertionError;
        //  348    350    3      8      Ljava/lang/ClassCastException;
        //  78     85     85     86     Any
        //  79     85     85     86     Ljava/lang/IllegalArgumentException;
        //  79     85     85     86     Ljava/util/ConcurrentModificationException;
        //  79     85     3      8      Any
        //  79     85     78     79     Ljava/lang/ClassCastException;
        //  179    186    186    187    Any
        //  180    186    3      8      Ljava/lang/NumberFormatException;
        //  179    186    179    180    Any
        //  179    186    3      8      Any
        //  180    186    3      8      Ljava/lang/NullPointerException;
        //  235    242    242    243    Any
        //  236    242    235    236    Any
        //  235    242    235    236    Ljava/lang/NegativeArraySizeException;
        //  236    242    3      8      Any
        //  236    242    235    236    Any
        //  246    253    253    254    Any
        //  246    253    246    247    Any
        //  246    253    246    247    Ljava/lang/ClassCastException;
        //  247    253    253    254    Any
        //  246    253    3      8      Any
        //  304    311    311    312    Any
        //  304    311    3      8      Any
        //  305    311    304    305    Any
        //  305    311    311    312    Any
        //  304    311    311    312    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 2], but value was: 3.
        //     at com.strobel.core.VerifyArgument.inRange(VerifyArgument.java:347)
        //     at com.strobel.assembler.ir.StackMappingVisitor.getStackValue(StackMappingVisitor.java:67)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:691)
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
    
    @NotNull
    public f0a 5() {
        return fbS.D(this, 1030515166);
    }
    
    public boolean 1(@NotNull final Entity entity) {
        return fbS.hp(this, 1541059432, entity);
    }
    
    @NotNull
    public BlockPos[] 3(@NotNull final Entity p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2043
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            2035
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2027
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: new             Lnet/minecraft/util/math/BlockPos;
        //    29: dup            
        //    30: getstatic       dev/nuker/pyro/fc.1:I
        //    33: ifeq            41
        //    36: ldc             -567722345
        //    38: goto            43
        //    41: ldc             -1310490482
        //    43: ldc             -1955899738
        //    45: ixor           
        //    46: lookupswitch {
        //          -1087183260: 41
        //          1430415409: 1984
        //          default: 72
        //        }
        //    72: aload_1        
        //    73: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //    76: goto            80
        //    79: athrow         
        //    80: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //    83: goto            87
        //    86: athrow         
        //    87: getstatic       dev/nuker/pyro/fc.1:I
        //    90: ifeq            98
        //    93: ldc             -732204902
        //    95: goto            100
        //    98: ldc             1881436806
        //   100: ldc             -1606698103
        //   102: ixor           
        //   103: lookupswitch {
        //          1932797211: 98
        //          1952500499: 2014
        //          default: 128
        //        }
        //   128: aload_1        
        //   129: getstatic       dev/nuker/pyro/fc.c:I
        //   132: ifge            140
        //   135: ldc             -834359
        //   137: goto            142
        //   140: ldc             -538252041
        //   142: ldc             -822825413
        //   144: ixor           
        //   145: lookupswitch {
        //          822602482: 1992
        //          2029469655: 140
        //          default: 172
        //        }
        //   172: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //   175: goto            179
        //   178: athrow         
        //   179: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   182: goto            186
        //   185: athrow         
        //   186: getstatic       dev/nuker/pyro/fc.0:I
        //   189: ifeq            197
        //   192: ldc             953190556
        //   194: goto            199
        //   197: ldc             -346404700
        //   199: ldc             -886851615
        //   201: ixor           
        //   202: lookupswitch {
        //          -202162307: 197
        //          544866117: 228
        //          default: 1980
        //        }
        //   228: aload_1        
        //   229: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   232: goto            236
        //   235: athrow         
        //   236: invokestatic    net/minecraft/util/math/MathHelper.func_76128_c:(D)I
        //   239: goto            243
        //   242: athrow         
        //   243: goto            247
        //   246: athrow         
        //   247: invokespecial   net/minecraft/util/math/BlockPos.<init>:(III)V
        //   250: goto            254
        //   253: athrow         
        //   254: astore_2       
        //   255: aload_0        
        //   256: getfield        dev/nuker/pyro/f5E.3:Ldev/nuker/pyro/f0a;
        //   259: goto            263
        //   262: athrow         
        //   263: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   266: goto            270
        //   269: athrow         
        //   270: checkcast       Ljava/lang/Boolean;
        //   273: getstatic       dev/nuker/pyro/fc.1:I
        //   276: ifeq            284
        //   279: ldc             615095531
        //   281: goto            286
        //   284: ldc             2006777094
        //   286: ldc             -998232960
        //   288: ixor           
        //   289: lookupswitch {
        //          -1289956986: 316
        //          -534138773: 284
        //          default: 1970
        //        }
        //   316: goto            320
        //   319: athrow         
        //   320: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   323: goto            327
        //   326: athrow         
        //   327: ifne            335
        //   330: ldc             159334626
        //   332: goto            337
        //   335: ldc             159334637
        //   337: ldc             -1920640139
        //   339: ixor           
        //   340: tableswitch {
        //          166999854: 364
        //          166999855: 640
        //          default: 330
        //        }
        //   364: aload_0        
        //   365: getfield        dev/nuker/pyro/f5E.c:Ldev/nuker/pyro/f0h;
        //   368: goto            372
        //   371: athrow         
        //   372: invokevirtual   dev/nuker/pyro/f0h.3:()Ljava/lang/Object;
        //   375: goto            379
        //   378: athrow         
        //   379: checkcast       Ljava/lang/Number;
        //   382: goto            386
        //   385: athrow         
        //   386: invokevirtual   java/lang/Number.intValue:()I
        //   389: goto            393
        //   392: athrow         
        //   393: iconst_1       
        //   394: if_icmple       525
        //   397: getstatic       dev/nuker/pyro/fc.1:I
        //   400: ifeq            408
        //   403: ldc             291439297
        //   405: goto            410
        //   408: ldc             -834633319
        //   410: ldc             240055782
        //   412: ixor           
        //   413: lookupswitch {
        //          -1072794497: 440
        //          521271079: 408
        //          default: 2004
        //        }
        //   440: aload_0        
        //   441: getfield        dev/nuker/pyro/f5E.c:Ldev/nuker/pyro/f0h;
        //   444: goto            448
        //   447: athrow         
        //   448: invokevirtual   dev/nuker/pyro/f0h.3:()Ljava/lang/Object;
        //   451: goto            455
        //   454: athrow         
        //   455: checkcast       Ljava/lang/Number;
        //   458: getstatic       dev/nuker/pyro/fc.c:I
        //   461: ifge            469
        //   464: ldc             932836792
        //   466: goto            471
        //   469: ldc             -208562015
        //   471: ldc             808901707
        //   473: ixor           
        //   474: lookupswitch {
        //          -1012448022: 500
        //          128920051: 469
        //          default: 1972
        //        }
        //   500: goto            504
        //   503: athrow         
        //   504: invokevirtual   java/lang/Number.intValue:()I
        //   507: goto            511
        //   510: athrow         
        //   511: goto            515
        //   514: athrow         
        //   515: invokestatic    org/lwjgl/input/Keyboard.isKeyDown:(I)Z
        //   518: goto            522
        //   521: athrow         
        //   522: goto            603
        //   525: aload_0        
        //   526: getfield        dev/nuker/pyro/f5E.c:Ldev/nuker/pyro/f0h;
        //   529: goto            533
        //   532: athrow         
        //   533: invokevirtual   dev/nuker/pyro/f0h.3:()Ljava/lang/Object;
        //   536: goto            540
        //   539: athrow         
        //   540: checkcast       Ljava/lang/Number;
        //   543: goto            547
        //   546: athrow         
        //   547: invokevirtual   java/lang/Number.intValue:()I
        //   550: goto            554
        //   553: athrow         
        //   554: iconst_m1      
        //   555: if_icmpge       602
        //   558: aload_0        
        //   559: getfield        dev/nuker/pyro/f5E.c:Ldev/nuker/pyro/f0h;
        //   562: goto            566
        //   565: athrow         
        //   566: invokevirtual   dev/nuker/pyro/f0h.3:()Ljava/lang/Object;
        //   569: goto            573
        //   572: athrow         
        //   573: checkcast       Ljava/lang/Number;
        //   576: goto            580
        //   579: athrow         
        //   580: invokevirtual   java/lang/Number.intValue:()I
        //   583: goto            587
        //   586: athrow         
        //   587: ineg           
        //   588: goto            592
        //   591: athrow         
        //   592: invokestatic    org/lwjgl/input/Mouse.isButtonDown:(I)Z
        //   595: goto            599
        //   598: athrow         
        //   599: goto            603
        //   602: iconst_0       
        //   603: ifeq            611
        //   606: ldc             -816755918
        //   608: goto            613
        //   611: ldc             -816755917
        //   613: ldc             450910940
        //   615: ixor           
        //   616: tableswitch {
        //          -1419631652: 640
        //          -1419631651: 1368
        //          default: 606
        //        }
        //   640: bipush          12
        //   642: anewarray       Lnet/minecraft/util/math/BlockPos;
        //   645: dup            
        //   646: iconst_0       
        //   647: aload_2        
        //   648: goto            652
        //   651: athrow         
        //   652: invokevirtual   net/minecraft/util/math/BlockPos.func_177978_c:()Lnet/minecraft/util/math/BlockPos;
        //   655: goto            659
        //   658: athrow         
        //   659: goto            663
        //   662: athrow         
        //   663: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //   666: goto            670
        //   669: athrow         
        //   670: dup            
        //   671: pop            
        //   672: aastore        
        //   673: dup            
        //   674: iconst_1       
        //   675: getstatic       dev/nuker/pyro/fc.c:I
        //   678: ifge            686
        //   681: ldc             1427779474
        //   683: goto            688
        //   686: ldc             1265233829
        //   688: ldc             367398881
        //   690: ixor           
        //   691: lookupswitch {
        //          -724712241: 686
        //          1090265203: 1974
        //          default: 716
        //        }
        //   716: aload_2        
        //   717: getstatic       dev/nuker/pyro/fc.c:I
        //   720: ifge            728
        //   723: ldc             -1980827374
        //   725: goto            730
        //   728: ldc             828425069
        //   730: ldc             -364710758
        //   732: ixor           
        //   733: lookupswitch {
        //          -1031303554: 728
        //          1672220040: 2006
        //          default: 760
        //        }
        //   760: goto            764
        //   763: athrow         
        //   764: invokevirtual   net/minecraft/util/math/BlockPos.func_177968_d:()Lnet/minecraft/util/math/BlockPos;
        //   767: goto            771
        //   770: athrow         
        //   771: goto            775
        //   774: athrow         
        //   775: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //   778: goto            782
        //   781: athrow         
        //   782: dup            
        //   783: pop            
        //   784: aastore        
        //   785: dup            
        //   786: iconst_2       
        //   787: getstatic       dev/nuker/pyro/fc.0:I
        //   790: ifeq            798
        //   793: ldc             279895560
        //   795: goto            800
        //   798: ldc             560121344
        //   800: ldc             -1483169346
        //   802: ixor           
        //   803: lookupswitch {
        //          -2030409794: 828
        //          -1221165130: 798
        //          default: 1976
        //        }
        //   828: aload_2        
        //   829: goto            833
        //   832: athrow         
        //   833: invokevirtual   net/minecraft/util/math/BlockPos.func_177976_e:()Lnet/minecraft/util/math/BlockPos;
        //   836: goto            840
        //   839: athrow         
        //   840: goto            844
        //   843: athrow         
        //   844: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //   847: goto            851
        //   850: athrow         
        //   851: dup            
        //   852: pop            
        //   853: aastore        
        //   854: dup            
        //   855: iconst_3       
        //   856: aload_2        
        //   857: getstatic       dev/nuker/pyro/fc.0:I
        //   860: ifeq            868
        //   863: ldc             -1077437218
        //   865: goto            870
        //   868: ldc             -1305131987
        //   870: ldc             -186692895
        //   872: ixor           
        //   873: lookupswitch {
        //          -219415969: 868
        //          1259918911: 2008
        //          default: 900
        //        }
        //   900: goto            904
        //   903: athrow         
        //   904: invokevirtual   net/minecraft/util/math/BlockPos.func_177974_f:()Lnet/minecraft/util/math/BlockPos;
        //   907: goto            911
        //   910: athrow         
        //   911: getstatic       dev/nuker/pyro/fc.1:I
        //   914: ifeq            922
        //   917: ldc             -1868827908
        //   919: goto            924
        //   922: ldc             318025708
        //   924: ldc             754504464
        //   926: ixor           
        //   927: lookupswitch {
        //          -1134353940: 922
        //          1041005820: 952
        //          default: 2000
        //        }
        //   952: goto            956
        //   955: athrow         
        //   956: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //   959: goto            963
        //   962: athrow         
        //   963: dup            
        //   964: pop            
        //   965: aastore        
        //   966: dup            
        //   967: iconst_4       
        //   968: aload_2        
        //   969: goto            973
        //   972: athrow         
        //   973: invokevirtual   net/minecraft/util/math/BlockPos.func_177978_c:()Lnet/minecraft/util/math/BlockPos;
        //   976: goto            980
        //   979: athrow         
        //   980: dup            
        //   981: pop            
        //   982: aastore        
        //   983: dup            
        //   984: iconst_5       
        //   985: getstatic       dev/nuker/pyro/fc.c:I
        //   988: ifge            996
        //   991: ldc             1541076118
        //   993: goto            998
        //   996: ldc             1042954761
        //   998: ldc             -362680133
        //  1000: ixor           
        //  1001: lookupswitch {
        //          -1990872816: 996
        //          -1313143763: 1978
        //          default: 1028
        //        }
        //  1028: aload_2        
        //  1029: goto            1033
        //  1032: athrow         
        //  1033: invokevirtual   net/minecraft/util/math/BlockPos.func_177968_d:()Lnet/minecraft/util/math/BlockPos;
        //  1036: goto            1040
        //  1039: athrow         
        //  1040: dup            
        //  1041: pop            
        //  1042: aastore        
        //  1043: dup            
        //  1044: bipush          6
        //  1046: aload_2        
        //  1047: getstatic       dev/nuker/pyro/fc.c:I
        //  1050: ifge            1058
        //  1053: ldc             -1643906627
        //  1055: goto            1060
        //  1058: ldc             1934604493
        //  1060: ldc             -622208341
        //  1062: ixor           
        //  1063: lookupswitch {
        //          -1767101133: 1058
        //          1156195094: 1990
        //          default: 1088
        //        }
        //  1088: goto            1092
        //  1091: athrow         
        //  1092: invokevirtual   net/minecraft/util/math/BlockPos.func_177976_e:()Lnet/minecraft/util/math/BlockPos;
        //  1095: goto            1099
        //  1098: athrow         
        //  1099: dup            
        //  1100: pop            
        //  1101: aastore        
        //  1102: dup            
        //  1103: bipush          7
        //  1105: aload_2        
        //  1106: goto            1110
        //  1109: athrow         
        //  1110: invokevirtual   net/minecraft/util/math/BlockPos.func_177974_f:()Lnet/minecraft/util/math/BlockPos;
        //  1113: goto            1117
        //  1116: athrow         
        //  1117: dup            
        //  1118: pop            
        //  1119: aastore        
        //  1120: dup            
        //  1121: bipush          8
        //  1123: aload_2        
        //  1124: getstatic       dev/nuker/pyro/fc.1:I
        //  1127: ifeq            1135
        //  1130: ldc             -47727584
        //  1132: goto            1137
        //  1135: ldc             -1324943931
        //  1137: ldc             434269393
        //  1139: ixor           
        //  1140: lookupswitch {
        //          -1461413612: 1168
        //          -456797967: 1135
        //          default: 1998
        //        }
        //  1168: goto            1172
        //  1171: athrow         
        //  1172: invokevirtual   net/minecraft/util/math/BlockPos.func_177978_c:()Lnet/minecraft/util/math/BlockPos;
        //  1175: goto            1179
        //  1178: athrow         
        //  1179: goto            1183
        //  1182: athrow         
        //  1183: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //  1186: goto            1190
        //  1189: athrow         
        //  1190: dup            
        //  1191: pop            
        //  1192: aastore        
        //  1193: dup            
        //  1194: bipush          9
        //  1196: aload_2        
        //  1197: goto            1201
        //  1200: athrow         
        //  1201: invokevirtual   net/minecraft/util/math/BlockPos.func_177968_d:()Lnet/minecraft/util/math/BlockPos;
        //  1204: goto            1208
        //  1207: athrow         
        //  1208: goto            1212
        //  1211: athrow         
        //  1212: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //  1215: goto            1219
        //  1218: athrow         
        //  1219: dup            
        //  1220: pop            
        //  1221: aastore        
        //  1222: dup            
        //  1223: bipush          10
        //  1225: aload_2        
        //  1226: getstatic       dev/nuker/pyro/fc.c:I
        //  1229: ifge            1237
        //  1232: ldc             -385050187
        //  1234: goto            1239
        //  1237: ldc             1293552091
        //  1239: ldc             -1205057270
        //  1241: ixor           
        //  1242: lookupswitch {
        //          -180993839: 1268
        //          1361105087: 1237
        //          default: 1968
        //        }
        //  1268: goto            1272
        //  1271: athrow         
        //  1272: invokevirtual   net/minecraft/util/math/BlockPos.func_177976_e:()Lnet/minecraft/util/math/BlockPos;
        //  1275: goto            1279
        //  1278: athrow         
        //  1279: goto            1283
        //  1282: athrow         
        //  1283: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //  1286: goto            1290
        //  1289: athrow         
        //  1290: dup            
        //  1291: pop            
        //  1292: aastore        
        //  1293: dup            
        //  1294: bipush          11
        //  1296: aload_2        
        //  1297: getstatic       dev/nuker/pyro/fc.c:I
        //  1300: ifge            1308
        //  1303: ldc             -1551630829
        //  1305: goto            1310
        //  1308: ldc             2004625241
        //  1310: ldc             58361979
        //  1312: ixor           
        //  1313: lookupswitch {
        //          -1594263960: 1308
        //          1946595106: 1340
        //          default: 1986
        //        }
        //  1340: goto            1344
        //  1343: athrow         
        //  1344: invokevirtual   net/minecraft/util/math/BlockPos.func_177974_f:()Lnet/minecraft/util/math/BlockPos;
        //  1347: goto            1351
        //  1350: athrow         
        //  1351: goto            1355
        //  1354: athrow         
        //  1355: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //  1358: goto            1362
        //  1361: athrow         
        //  1362: dup            
        //  1363: pop            
        //  1364: aastore        
        //  1365: goto            1965
        //  1368: bipush          8
        //  1370: anewarray       Lnet/minecraft/util/math/BlockPos;
        //  1373: dup            
        //  1374: iconst_0       
        //  1375: getstatic       dev/nuker/pyro/fc.1:I
        //  1378: ifeq            1386
        //  1381: ldc             -1514046494
        //  1383: goto            1388
        //  1386: ldc             1894914259
        //  1388: ldc             1732494842
        //  1390: ixor           
        //  1391: lookupswitch {
        //          -1031619048: 1386
        //          397532457: 1416
        //          default: 2016
        //        }
        //  1416: aload_2        
        //  1417: goto            1421
        //  1420: athrow         
        //  1421: invokevirtual   net/minecraft/util/math/BlockPos.func_177978_c:()Lnet/minecraft/util/math/BlockPos;
        //  1424: goto            1428
        //  1427: athrow         
        //  1428: getstatic       dev/nuker/pyro/fc.1:I
        //  1431: ifeq            1439
        //  1434: ldc             -756210227
        //  1436: goto            1441
        //  1439: ldc             -627131516
        //  1441: ldc_w           787875085
        //  1444: ixor           
        //  1445: lookupswitch {
        //          -194462071: 1472
        //          -65331008: 1439
        //          default: 2012
        //        }
        //  1472: goto            1476
        //  1475: athrow         
        //  1476: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //  1479: goto            1483
        //  1482: athrow         
        //  1483: dup            
        //  1484: pop            
        //  1485: aastore        
        //  1486: dup            
        //  1487: iconst_1       
        //  1488: aload_2        
        //  1489: getstatic       dev/nuker/pyro/fc.c:I
        //  1492: ifge            1501
        //  1495: ldc_w           1235686023
        //  1498: goto            1504
        //  1501: ldc_w           1695183631
        //  1504: ldc_w           233580491
        //  1507: ixor           
        //  1508: lookupswitch {
        //          1145779532: 1501
        //          1759925444: 1536
        //          default: 1988
        //        }
        //  1536: goto            1540
        //  1539: athrow         
        //  1540: invokevirtual   net/minecraft/util/math/BlockPos.func_177968_d:()Lnet/minecraft/util/math/BlockPos;
        //  1543: goto            1547
        //  1546: athrow         
        //  1547: goto            1551
        //  1550: athrow         
        //  1551: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //  1554: goto            1558
        //  1557: athrow         
        //  1558: dup            
        //  1559: pop            
        //  1560: aastore        
        //  1561: dup            
        //  1562: iconst_2       
        //  1563: getstatic       dev/nuker/pyro/fc.1:I
        //  1566: ifeq            1575
        //  1569: ldc_w           1314739665
        //  1572: goto            1578
        //  1575: ldc_w           581950516
        //  1578: ldc_w           112023693
        //  1581: ixor           
        //  1582: lookupswitch {
        //          1223691612: 2002
        //          1459066098: 1575
        //          default: 1608
        //        }
        //  1608: aload_2        
        //  1609: goto            1613
        //  1612: athrow         
        //  1613: invokevirtual   net/minecraft/util/math/BlockPos.func_177976_e:()Lnet/minecraft/util/math/BlockPos;
        //  1616: goto            1620
        //  1619: athrow         
        //  1620: goto            1624
        //  1623: athrow         
        //  1624: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //  1627: goto            1631
        //  1630: athrow         
        //  1631: dup            
        //  1632: pop            
        //  1633: aastore        
        //  1634: dup            
        //  1635: iconst_3       
        //  1636: aload_2        
        //  1637: getstatic       dev/nuker/pyro/fc.0:I
        //  1640: ifeq            1649
        //  1643: ldc_w           -141869934
        //  1646: goto            1652
        //  1649: ldc_w           -1791373688
        //  1652: ldc_w           -1568747421
        //  1655: ixor           
        //  1656: lookupswitch {
        //          730218047: 1649
        //          1442180337: 2010
        //          default: 1684
        //        }
        //  1684: goto            1688
        //  1687: athrow         
        //  1688: invokevirtual   net/minecraft/util/math/BlockPos.func_177974_f:()Lnet/minecraft/util/math/BlockPos;
        //  1691: goto            1695
        //  1694: athrow         
        //  1695: getstatic       dev/nuker/pyro/fc.0:I
        //  1698: ifeq            1707
        //  1701: ldc_w           2078205611
        //  1704: goto            1710
        //  1707: ldc_w           -1322725839
        //  1710: ldc_w           -1970934668
        //  1713: ixor           
        //  1714: lookupswitch {
        //          -790385361: 1707
        //          -245691681: 1966
        //          default: 1740
        //        }
        //  1740: goto            1744
        //  1743: athrow         
        //  1744: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //  1747: goto            1751
        //  1750: athrow         
        //  1751: dup            
        //  1752: pop            
        //  1753: aastore        
        //  1754: dup            
        //  1755: iconst_4       
        //  1756: aload_2        
        //  1757: getstatic       dev/nuker/pyro/fc.c:I
        //  1760: ifge            1769
        //  1763: ldc_w           -323526386
        //  1766: goto            1772
        //  1769: ldc_w           184361265
        //  1772: ldc_w           -717982129
        //  1775: ixor           
        //  1776: lookupswitch {
        //          -540452994: 1804
        //          964892481: 1769
        //          default: 1982
        //        }
        //  1804: goto            1808
        //  1807: athrow         
        //  1808: invokevirtual   net/minecraft/util/math/BlockPos.func_177978_c:()Lnet/minecraft/util/math/BlockPos;
        //  1811: goto            1815
        //  1814: athrow         
        //  1815: dup            
        //  1816: pop            
        //  1817: aastore        
        //  1818: dup            
        //  1819: iconst_5       
        //  1820: aload_2        
        //  1821: getstatic       dev/nuker/pyro/fc.0:I
        //  1824: ifeq            1833
        //  1827: ldc_w           388844253
        //  1830: goto            1836
        //  1833: ldc_w           -419022282
        //  1836: ldc_w           1410855238
        //  1839: ixor           
        //  1840: lookupswitch {
        //          -820594293: 1833
        //          1127922587: 1994
        //          default: 1868
        //        }
        //  1868: goto            1872
        //  1871: athrow         
        //  1872: invokevirtual   net/minecraft/util/math/BlockPos.func_177968_d:()Lnet/minecraft/util/math/BlockPos;
        //  1875: goto            1879
        //  1878: athrow         
        //  1879: dup            
        //  1880: pop            
        //  1881: aastore        
        //  1882: dup            
        //  1883: bipush          6
        //  1885: getstatic       dev/nuker/pyro/fc.1:I
        //  1888: ifeq            1897
        //  1891: ldc_w           -1557502018
        //  1894: goto            1900
        //  1897: ldc_w           81489440
        //  1900: ldc_w           1607676610
        //  1903: ixor           
        //  1904: lookupswitch {
        //          -1050033659: 1897
        //          -50768516: 1996
        //          default: 1932
        //        }
        //  1932: aload_2        
        //  1933: goto            1937
        //  1936: athrow         
        //  1937: invokevirtual   net/minecraft/util/math/BlockPos.func_177976_e:()Lnet/minecraft/util/math/BlockPos;
        //  1940: goto            1944
        //  1943: athrow         
        //  1944: dup            
        //  1945: pop            
        //  1946: aastore        
        //  1947: dup            
        //  1948: bipush          7
        //  1950: aload_2        
        //  1951: goto            1955
        //  1954: athrow         
        //  1955: invokevirtual   net/minecraft/util/math/BlockPos.func_177974_f:()Lnet/minecraft/util/math/BlockPos;
        //  1958: goto            1962
        //  1961: athrow         
        //  1962: dup            
        //  1963: pop            
        //  1964: aastore        
        //  1965: areturn        
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
        //  1988: aconst_null    
        //  1989: athrow         
        //  1990: aconst_null    
        //  1991: athrow         
        //  1992: aconst_null    
        //  1993: athrow         
        //  1994: aconst_null    
        //  1995: athrow         
        //  1996: aconst_null    
        //  1997: athrow         
        //  1998: aconst_null    
        //  1999: athrow         
        //  2000: aconst_null    
        //  2001: athrow         
        //  2002: aconst_null    
        //  2003: athrow         
        //  2004: aconst_null    
        //  2005: athrow         
        //  2006: aconst_null    
        //  2007: athrow         
        //  2008: aconst_null    
        //  2009: athrow         
        //  2010: aconst_null    
        //  2011: athrow         
        //  2012: aconst_null    
        //  2013: athrow         
        //  2014: aconst_null    
        //  2015: athrow         
        //  2016: aconst_null    
        //  2017: athrow         
        //  2018: pop            
        //  2019: goto            24
        //  2022: pop            
        //  2023: aconst_null    
        //  2024: goto            2018
        //  2027: dup            
        //  2028: ifnull          2018
        //  2031: checkcast       Ljava/lang/Throwable;
        //  2034: athrow         
        //  2035: dup            
        //  2036: ifnull          2022
        //  2039: checkcast       Ljava/lang/Throwable;
        //  2042: athrow         
        //  2043: aconst_null    
        //  2044: athrow         
        //    StackMapTable: 01 3E 43 07 00 41 04 FF 00 0B 00 00 00 01 07 00 41 FD 00 03 07 00 03 07 00 4A FF 00 10 00 02 07 00 03 07 00 4A 00 02 08 00 1A 08 00 1A FF 00 01 00 02 07 00 03 07 00 4A 00 03 08 00 1A 08 00 1A 01 FF 00 1C 00 02 07 00 03 07 00 4A 00 02 08 00 1A 08 00 1A FF 00 06 00 00 00 01 07 00 41 FF 00 00 00 02 07 00 03 07 00 4A 00 03 08 00 1A 08 00 1A 03 45 07 00 41 FF 00 00 00 02 07 00 03 07 00 4A 00 03 08 00 1A 08 00 1A 01 FF 00 0A 00 02 07 00 03 07 00 4A 00 03 08 00 1A 08 00 1A 01 FF 00 01 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 01 FF 00 1B 00 02 07 00 03 07 00 4A 00 03 08 00 1A 08 00 1A 01 FF 00 0B 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 07 00 4A FF 00 01 00 02 07 00 03 07 00 4A 00 05 08 00 1A 08 00 1A 01 07 00 4A 01 FF 00 1D 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 07 00 4A 45 07 00 34 FF 00 00 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 03 45 07 00 41 FF 00 00 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 01 FF 00 0A 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 01 FF 00 01 00 02 07 00 03 07 00 4A 00 05 08 00 1A 08 00 1A 01 01 01 FF 00 1C 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 01 46 07 00 41 FF 00 00 00 02 07 00 03 07 00 4A 00 05 08 00 1A 08 00 1A 01 01 03 45 07 00 41 FF 00 00 00 02 07 00 03 07 00 4A 00 05 08 00 1A 08 00 1A 01 01 01 FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 02 07 00 03 07 00 4A 00 05 08 00 1A 08 00 1A 01 01 01 45 07 00 41 40 07 00 43 FF 00 07 00 03 07 00 03 07 00 4A 07 00 43 00 01 07 00 83 40 07 00 9B 45 07 00 41 40 07 01 17 4D 07 00 A0 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 02 07 00 A0 01 5D 07 00 A0 FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 01 07 00 A0 45 07 00 41 40 01 02 04 41 01 1A FF 00 06 00 00 00 01 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 01 07 00 AE 45 07 00 41 40 07 01 17 45 07 00 41 40 07 00 B1 45 07 00 41 40 01 0E 41 01 1D 46 07 00 41 40 07 00 AE 45 07 00 41 40 07 01 17 4D 07 00 B1 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 02 07 00 B1 01 5C 07 00 B1 42 07 00 83 40 07 00 B1 45 07 00 41 40 01 42 07 00 7F 40 01 45 07 00 41 40 01 02 46 07 00 7D 40 07 00 AE 45 07 00 41 40 07 01 17 45 07 00 41 40 07 00 B1 45 07 00 41 40 01 4A 07 00 7D 40 07 00 AE 45 07 00 41 40 07 01 17 45 07 00 41 40 07 00 B1 45 07 00 41 40 01 43 07 00 41 40 01 45 07 00 41 40 01 02 40 01 02 04 41 01 1A 4A 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 0F 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 01 FF 00 1B 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 0B 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 05 07 00 70 07 00 70 01 07 00 43 01 FF 00 1D 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 30 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 0F 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 01 FF 00 1B 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 43 07 00 85 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 7D FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 10 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 05 07 00 70 07 00 70 01 07 00 43 01 FF 00 1D 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 0A 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 05 07 00 70 07 00 70 01 07 00 43 01 FF 00 1B 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 48 07 00 7D FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 0F 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 01 FF 00 1D 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 43 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 11 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 05 07 00 70 07 00 70 01 07 00 43 01 FF 00 1B 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 38 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 49 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 11 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 05 07 00 70 07 00 70 01 07 00 43 01 FF 00 1E 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 7D FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 49 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 11 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 05 07 00 70 07 00 70 01 07 00 43 01 FF 00 1C 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 87 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 11 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 05 07 00 70 07 00 70 01 07 00 43 01 FF 00 1D 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 7B FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 05 FF 00 11 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 01 FF 00 1B 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 43 07 00 8B FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 0A 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 05 07 00 70 07 00 70 01 07 00 43 01 FF 00 1E 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 7D FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 11 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 02 00 03 07 00 03 07 00 4A 07 00 43 00 05 07 00 70 07 00 70 01 07 00 43 01 FF 00 1F 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 10 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 02 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 01 FF 00 1D 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 03 00 00 00 01 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 7D FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 11 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 02 00 03 07 00 03 07 00 4A 07 00 43 00 05 07 00 70 07 00 70 01 07 00 43 01 FF 00 1F 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 0B 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 02 00 03 07 00 03 07 00 4A 07 00 43 00 05 07 00 70 07 00 70 01 07 00 43 01 FF 00 1D 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 11 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 02 00 03 07 00 03 07 00 4A 07 00 43 00 05 07 00 70 07 00 70 01 07 00 43 01 FF 00 1F 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 11 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 02 00 03 07 00 03 07 00 4A 07 00 43 00 05 07 00 70 07 00 70 01 07 00 43 01 FF 00 1F 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 11 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 02 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 01 FF 00 1F 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 43 07 00 87 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 49 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 70 FF 00 00 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 41 07 00 A0 41 07 00 B1 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 01 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 01 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 02 07 00 03 07 00 4A 00 02 08 00 1A 08 00 1A FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 02 07 00 03 07 00 4A 00 04 08 00 1A 08 00 1A 01 07 00 4A FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 01 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 02 07 00 03 07 00 4A 00 03 08 00 1A 08 00 1A 01 FF 00 01 00 03 07 00 03 07 00 4A 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 01 00 02 07 00 03 07 00 4A 00 01 07 00 7D 43 05 44 07 00 7D 47 05 47 07 00 41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2027   2035   Ljava/util/ConcurrentModificationException;
        //  2027   2035   2027   2035   Ljava/lang/ClassCastException;
        //  2043   2045   3      8      Any
        //  80     86     86     87     Any
        //  80     86     86     87     Ljava/lang/UnsupportedOperationException;
        //  80     86     86     87     Ljava/util/ConcurrentModificationException;
        //  80     86     3      8      Any
        //  80     86     86     87     Ljava/lang/NegativeArraySizeException;
        //  178    185    185    186    Any
        //  179    185    3      8      Any
        //  178    185    178    179    Ljava/lang/IllegalArgumentException;
        //  179    185    3      8      Ljava/lang/ClassCastException;
        //  179    185    3      8      Ljava/lang/UnsupportedOperationException;
        //  235    242    242    243    Any
        //  236    242    3      8      Ljava/lang/RuntimeException;
        //  236    242    3      8      Any
        //  235    242    242    243    Ljava/lang/IllegalStateException;
        //  235    242    235    236    Any
        //  247    253    253    254    Any
        //  247    253    253    254    Ljava/lang/IllegalArgumentException;
        //  247    253    253    254    Any
        //  247    253    253    254    Ljava/lang/IllegalArgumentException;
        //  247    253    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  262    269    269    270    Any
        //  263    269    262    263    Ljava/util/NoSuchElementException;
        //  262    269    269    270    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  263    269    3      8      Ljava/lang/ClassCastException;
        //  263    269    3      8      Any
        //  320    326    326    327    Any
        //  320    326    326    327    Any
        //  320    326    3      8      Any
        //  320    326    3      8      Ljava/lang/NumberFormatException;
        //  320    326    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  372    378    378    379    Any
        //  372    378    3      8      Any
        //  372    378    3      8      Any
        //  372    378    3      8      Any
        //  372    378    3      8      Any
        //  385    392    392    393    Any
        //  386    392    3      8      Ljava/lang/ClassCastException;
        //  386    392    392    393    Any
        //  385    392    392    393    Any
        //  385    392    385    386    Any
        //  447    454    454    455    Any
        //  448    454    454    455    Any
        //  448    454    454    455    Ljava/lang/IndexOutOfBoundsException;
        //  447    454    447    448    Any
        //  447    454    454    455    Any
        //  503    510    510    511    Any
        //  504    510    503    504    Ljava/util/NoSuchElementException;
        //  504    510    3      8      Any
        //  504    510    510    511    Any
        //  504    510    510    511    Ljava/lang/UnsupportedOperationException;
        //  514    521    521    522    Any
        //  515    521    3      8      Ljava/util/NoSuchElementException;
        //  514    521    514    515    Ljava/lang/IllegalStateException;
        //  515    521    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  515    521    3      8      Any
        //  532    539    539    540    Any
        //  532    539    539    540    Ljava/lang/RuntimeException;
        //  532    539    532    533    Ljava/lang/NumberFormatException;
        //  532    539    532    533    Ljava/util/ConcurrentModificationException;
        //  532    539    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  546    553    553    554    Any
        //  546    553    546    547    Ljava/lang/AssertionError;
        //  547    553    546    547    Ljava/lang/AssertionError;
        //  547    553    546    547    Any
        //  547    553    546    547    Ljava/lang/NullPointerException;
        //  565    572    572    573    Any
        //  565    572    572    573    Ljava/lang/IllegalArgumentException;
        //  566    572    565    566    Ljava/lang/IndexOutOfBoundsException;
        //  565    572    572    573    Ljava/util/NoSuchElementException;
        //  566    572    565    566    Ljava/lang/ArithmeticException;
        //  579    586    586    587    Any
        //  580    586    579    580    Ljava/lang/RuntimeException;
        //  580    586    579    580    Any
        //  580    586    586    587    Ljava/lang/ClassCastException;
        //  580    586    579    580    Ljava/lang/ClassCastException;
        //  591    598    598    599    Any
        //  591    598    3      8      Ljava/lang/AssertionError;
        //  592    598    598    599    Any
        //  592    598    591    592    Any
        //  592    598    3      8      Any
        //  651    658    658    659    Any
        //  652    658    651    652    Any
        //  652    658    3      8      Any
        //  651    658    651    652    Any
        //  651    658    658    659    Any
        //  662    669    669    670    Any
        //  662    669    662    663    Any
        //  663    669    662    663    Ljava/lang/UnsupportedOperationException;
        //  663    669    3      8      Ljava/lang/UnsupportedOperationException;
        //  663    669    669    670    Ljava/lang/IllegalArgumentException;
        //  763    770    770    771    Any
        //  763    770    770    771    Any
        //  763    770    763    764    Ljava/lang/AssertionError;
        //  764    770    770    771    Ljava/lang/ArithmeticException;
        //  763    770    3      8      Any
        //  774    781    781    782    Any
        //  774    781    774    775    Ljava/lang/UnsupportedOperationException;
        //  774    781    774    775    Any
        //  775    781    3      8      Any
        //  774    781    3      8      Any
        //  832    839    839    840    Any
        //  832    839    3      8      Ljava/lang/RuntimeException;
        //  832    839    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  832    839    3      8      Ljava/lang/RuntimeException;
        //  833    839    832    833    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  843    850    850    851    Any
        //  844    850    3      8      Ljava/lang/UnsupportedOperationException;
        //  844    850    843    844    Ljava/lang/UnsupportedOperationException;
        //  843    850    850    851    Ljava/lang/UnsupportedOperationException;
        //  843    850    843    844    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  903    910    910    911    Any
        //  903    910    910    911    Ljava/util/NoSuchElementException;
        //  904    910    903    904    Ljava/lang/EnumConstantNotPresentException;
        //  904    910    903    904    Any
        //  904    910    903    904    Any
        //  956    962    962    963    Any
        //  956    962    3      8      Ljava/lang/RuntimeException;
        //  956    962    962    963    Any
        //  956    962    962    963    Ljava/lang/EnumConstantNotPresentException;
        //  956    962    962    963    Ljava/lang/NegativeArraySizeException;
        //  972    979    979    980    Any
        //  972    979    3      8      Any
        //  973    979    3      8      Ljava/lang/UnsupportedOperationException;
        //  972    979    972    973    Ljava/lang/NumberFormatException;
        //  973    979    972    973    Ljava/lang/ClassCastException;
        //  1032   1039   1039   1040   Any
        //  1032   1039   1039   1040   Ljava/lang/IndexOutOfBoundsException;
        //  1033   1039   1032   1033   Any
        //  1032   1039   3      8      Any
        //  1033   1039   1039   1040   Ljava/lang/NullPointerException;
        //  1091   1098   1098   1099   Any
        //  1092   1098   1098   1099   Ljava/lang/IllegalArgumentException;
        //  1092   1098   1091   1092   Ljava/lang/NullPointerException;
        //  1091   1098   3      8      Ljava/util/NoSuchElementException;
        //  1091   1098   3      8      Any
        //  1109   1116   1116   1117   Any
        //  1109   1116   3      8      Any
        //  1109   1116   1116   1117   Any
        //  1110   1116   1109   1110   Any
        //  1109   1116   1116   1117   Any
        //  1171   1178   1178   1179   Any
        //  1171   1178   1178   1179   Ljava/lang/UnsupportedOperationException;
        //  1171   1178   3      8      Any
        //  1172   1178   1171   1172   Ljava/lang/NegativeArraySizeException;
        //  1172   1178   1171   1172   Ljava/lang/IllegalStateException;
        //  1182   1189   1189   1190   Any
        //  1182   1189   1182   1183   Any
        //  1182   1189   3      8      Any
        //  1183   1189   1189   1190   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1183   1189   3      8      Any
        //  1200   1207   1207   1208   Any
        //  1201   1207   1207   1208   Ljava/lang/NumberFormatException;
        //  1201   1207   1200   1201   Any
        //  1201   1207   1207   1208   Ljava/lang/NullPointerException;
        //  1200   1207   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1211   1218   1218   1219   Any
        //  1211   1218   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1212   1218   1211   1212   Ljava/lang/RuntimeException;
        //  1212   1218   1211   1212   Any
        //  1211   1218   1211   1212   Ljava/lang/IllegalStateException;
        //  1271   1278   1278   1279   Any
        //  1271   1278   1271   1272   Any
        //  1272   1278   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1271   1278   3      8      Any
        //  1271   1278   1271   1272   Ljava/util/NoSuchElementException;
        //  1282   1289   1289   1290   Any
        //  1282   1289   3      8      Any
        //  1283   1289   3      8      Any
        //  1282   1289   3      8      Any
        //  1282   1289   1282   1283   Ljava/lang/IndexOutOfBoundsException;
        //  1344   1350   1350   1351   Any
        //  1344   1350   1350   1351   Ljava/lang/ArithmeticException;
        //  1344   1350   1350   1351   Ljava/util/ConcurrentModificationException;
        //  1344   1350   3      8      Ljava/lang/UnsupportedOperationException;
        //  1344   1350   3      8      Any
        //  1354   1361   1361   1362   Any
        //  1354   1361   1361   1362   Ljava/lang/NumberFormatException;
        //  1354   1361   1354   1355   Ljava/lang/UnsupportedOperationException;
        //  1355   1361   3      8      Any
        //  1354   1361   3      8      Any
        //  1420   1427   1427   1428   Any
        //  1420   1427   3      8      Any
        //  1420   1427   1427   1428   Ljava/util/NoSuchElementException;
        //  1420   1427   3      8      Ljava/util/NoSuchElementException;
        //  1421   1427   1420   1421   Ljava/lang/ArithmeticException;
        //  1475   1482   1482   1483   Any
        //  1476   1482   1475   1476   Ljava/lang/RuntimeException;
        //  1476   1482   1482   1483   Any
        //  1476   1482   1482   1483   Ljava/lang/NullPointerException;
        //  1475   1482   3      8      Any
        //  1539   1546   1546   1547   Any
        //  1540   1546   3      8      Any
        //  1540   1546   1539   1540   Any
        //  1540   1546   1546   1547   Any
        //  1540   1546   1546   1547   Any
        //  1551   1557   1557   1558   Any
        //  1551   1557   1557   1558   Any
        //  1551   1557   3      8      Any
        //  1551   1557   1557   1558   Any
        //  1551   1557   1557   1558   Ljava/lang/IndexOutOfBoundsException;
        //  1613   1619   1619   1620   Any
        //  1613   1619   1619   1620   Any
        //  1613   1619   1619   1620   Ljava/lang/NullPointerException;
        //  1613   1619   1619   1620   Any
        //  1613   1619   3      8      Any
        //  1623   1630   1630   1631   Any
        //  1623   1630   1623   1624   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1624   1630   1630   1631   Any
        //  1623   1630   1623   1624   Ljava/lang/EnumConstantNotPresentException;
        //  1623   1630   1630   1631   Any
        //  1687   1694   1694   1695   Any
        //  1688   1694   1687   1688   Any
        //  1687   1694   3      8      Ljava/lang/UnsupportedOperationException;
        //  1687   1694   3      8      Ljava/lang/NullPointerException;
        //  1688   1694   1687   1688   Ljava/lang/EnumConstantNotPresentException;
        //  1743   1750   1750   1751   Any
        //  1743   1750   1743   1744   Any
        //  1744   1750   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1743   1750   3      8      Ljava/lang/RuntimeException;
        //  1744   1750   1750   1751   Any
        //  1808   1814   1814   1815   Any
        //  1808   1814   3      8      Ljava/lang/UnsupportedOperationException;
        //  1808   1814   1814   1815   Ljava/util/NoSuchElementException;
        //  1808   1814   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1808   1814   1814   1815   Ljava/lang/RuntimeException;
        //  1871   1878   1878   1879   Any
        //  1871   1878   1871   1872   Ljava/lang/IllegalStateException;
        //  1871   1878   1878   1879   Ljava/lang/StringIndexOutOfBoundsException;
        //  1871   1878   1871   1872   Any
        //  1871   1878   1871   1872   Any
        //  1936   1943   1943   1944   Any
        //  1937   1943   1943   1944   Ljava/lang/StringIndexOutOfBoundsException;
        //  1936   1943   3      8      Any
        //  1936   1943   1936   1937   Ljava/lang/IndexOutOfBoundsException;
        //  1936   1943   1943   1944   Any
        //  1954   1961   1961   1962   Any
        //  1955   1961   3      8      Ljava/lang/NullPointerException;
        //  1954   1961   1961   1962   Any
        //  1954   1961   1954   1955   Any
        //  1954   1961   3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 2], but value was: 3.
        //     at com.strobel.core.VerifyArgument.inRange(VerifyArgument.java:347)
        //     at com.strobel.assembler.ir.StackMappingVisitor.getStackValue(StackMappingVisitor.java:67)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:691)
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
    
    public Vec3d a() {
        return fbS.27(this, 1203197497);
    }
    
    @Nullable
    public BlockPos[] 8() {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0038:
            while (true) {
                do {
                    Label_0025: {
                        break Label_0025;
                        try {
                            o = null;
                            if (fc.c < 0) {
                                continue Label_0038;
                            }
                            null;
                            return this.c;
                            return this.c;
                        }
                        catch (ConcurrentModificationException ex) {
                            if (ex != null) {
                                throw ex;
                            }
                            return this.c;
                        }
                    }
                    continue Label_0038;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public void c(final Vec3d vec3d) {
        fbS.2d(this, 1733518545, vec3d);
    }
    
    @NotNull
    public f0a 9() {
        return fbS.G(this, 1292924447);
    }
    
    static {
        f5E.c = new f5C(null);
    }
    
    public void c(final boolean b) {
        fbS.4v(this, 2101612768, b);
    }
    
    @f06(2)
    @LauncherEventHide
    public void c(@NotNull final f3i p0) {
        public class f5D implements Consumer
        {
            public f5E c;
            public BlockPos c;
            public boolean c;
            public int c;
            
            public f5D(final f5E c, final BlockPos c2, final boolean c3, final int c4) {
                while (true) {
                    int n = 0;
                    Label_0015: {
                        if (fc.0 != 0) {
                            n = 898833051;
                            break Label_0015;
                        }
                        n = -527372931;
                    }
                    switch (n ^ 0xECE93607) {
                        case -660723533: {
                            continue;
                        }
                        default: {
                            this.c = c;
                            while (true) {
                                int n2 = 0;
                                Label_0062: {
                                    if (fc.1 != 0) {
                                        n2 = 602894391;
                                        break Label_0062;
                                    }
                                    n2 = 1158931664;
                                }
                                switch (n2 ^ 0x833E4464) {
                                    case 1282063893: {
                                        continue;
                                    }
                                    default: {
                                        this.c = c2;
                                        while (true) {
                                            int n3 = 0;
                                            Label_0109: {
                                                if (fc.0 != 0) {
                                                    n3 = 1177301149;
                                                    break Label_0109;
                                                }
                                                n3 = 983663934;
                                            }
                                            switch (n3 ^ 0xCB9667B1) {
                                                case -103779661: {
                                                    continue;
                                                }
                                                default: {
                                                    while (true) {
                                                        int n4 = 0;
                                                        Label_0154: {
                                                            if (fc.1 != 0) {
                                                                n4 = -1383949390;
                                                                break Label_0154;
                                                            }
                                                            n4 = -2097018038;
                                                        }
                                                        switch (n4 ^ 0x3BCF8DC2) {
                                                            case 187516256: {
                                                                continue;
                                                            }
                                                            default: {
                                                                this.c = c3;
                                                                while (true) {
                                                                    int n5 = 0;
                                                                    Label_0200: {
                                                                        if (fc.c < 0) {
                                                                            n5 = 1595662789;
                                                                            break Label_0200;
                                                                        }
                                                                        n5 = -1395053468;
                                                                    }
                                                                    switch (n5 ^ 0xBA941233) {
                                                                        case -443550730: {
                                                                            continue;
                                                                        }
                                                                        case 374160983: {
                                                                            this.c = c4;
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
                                                            case -1773332880: {
                                                                throw null;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -1917167828: {
                                                    throw null;
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    case -1596902317: {
                                        throw null;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        case -646304612: {
                            throw null;
                        }
                    }
                    break;
                }
            }
            
            static {
                throw t;
            }
            
            @Override
            public void accept(final Object o) {
                fbS.2L(this, 1732907222, o);
            }
            
            public void c(@Nullable final EntityPlayerSP p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          255
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.0:I
                //    12: ifgt            247
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            239
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: aload_0        
                //    25: getfield        dev/nuker/pyro/f5D.c:Lnet/minecraft/util/math/BlockPos;
                //    28: ifnull          51
                //    31: aload_0        
                //    32: getfield        dev/nuker/pyro/f5D.c:Lnet/minecraft/util/math/BlockPos;
                //    35: ldc             8.0
                //    37: iconst_1       
                //    38: iconst_0       
                //    39: goto            43
                //    42: athrow         
                //    43: invokestatic    dev/nuker/pyro/fby.c:(Lnet/minecraft/util/math/BlockPos;FZZ)Ldev/nuker/pyro/fbw;
                //    46: goto            50
                //    49: athrow         
                //    50: pop            
                //    51: aload_0        
                //    52: getfield        dev/nuker/pyro/f5D.c:Z
                //    55: ifeq            225
                //    58: aload_0        
                //    59: getstatic       dev/nuker/pyro/fc.0:I
                //    62: ifeq            70
                //    65: ldc             296068000
                //    67: goto            72
                //    70: ldc             839452658
                //    72: ldc             -2137468099
                //    74: ixor           
                //    75: lookupswitch {
                //          -1858244451: 228
                //          1023854211: 70
                //          default: 100
                //        }
                //   100: getfield        dev/nuker/pyro/f5D.c:Ldev/nuker/pyro/f5E;
                //   103: goto            107
                //   106: athrow         
                //   107: invokestatic    dev/nuker/pyro/f5E.c:(Ldev/nuker/pyro/f5E;)Lnet/minecraft/client/Minecraft;
                //   110: goto            114
                //   113: athrow         
                //   114: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
                //   117: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
                //   120: getstatic       dev/nuker/pyro/fc.c:I
                //   123: ifge            131
                //   126: ldc             -469484695
                //   128: goto            133
                //   131: ldc             883708466
                //   133: ldc             -638545644
                //   135: ixor           
                //   136: lookupswitch {
                //          -312687834: 164
                //          1039444605: 131
                //          default: 226
                //        }
                //   164: aload_0        
                //   165: getfield        dev/nuker/pyro/f5D.c:I
                //   168: putfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
                //   171: aload_0        
                //   172: getfield        dev/nuker/pyro/f5D.c:Ldev/nuker/pyro/f5E;
                //   175: goto            179
                //   178: athrow         
                //   179: invokestatic    dev/nuker/pyro/f5E.c:(Ldev/nuker/pyro/f5E;)Lnet/minecraft/client/Minecraft;
                //   182: goto            186
                //   185: athrow         
                //   186: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
                //   189: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
                //   192: new             Lnet/minecraft/network/play/client/CPacketHeldItemChange;
                //   195: dup            
                //   196: aload_0        
                //   197: getfield        dev/nuker/pyro/f5D.c:I
                //   200: goto            204
                //   203: athrow         
                //   204: invokespecial   net/minecraft/network/play/client/CPacketHeldItemChange.<init>:(I)V
                //   207: goto            211
                //   210: athrow         
                //   211: checkcast       Lnet/minecraft/network/Packet;
                //   214: goto            218
                //   217: athrow         
                //   218: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
                //   221: goto            225
                //   224: athrow         
                //   225: return         
                //   226: aconst_null    
                //   227: athrow         
                //   228: aconst_null    
                //   229: athrow         
                //   230: pop            
                //   231: goto            24
                //   234: pop            
                //   235: aconst_null    
                //   236: goto            230
                //   239: dup            
                //   240: ifnull          230
                //   243: checkcast       Ljava/lang/Throwable;
                //   246: athrow         
                //   247: dup            
                //   248: ifnull          234
                //   251: checkcast       Ljava/lang/Throwable;
                //   254: athrow         
                //   255: aconst_null    
                //   256: athrow         
                //    StackMapTable: 00 26 43 07 00 58 04 FF 00 0B 00 00 00 01 07 00 58 FD 00 03 07 00 03 07 00 6C FF 00 11 00 00 00 01 07 00 58 FF 00 00 00 02 07 00 03 07 00 6C 00 04 07 00 37 02 01 01 45 07 00 58 40 07 00 8B 00 52 07 00 03 FF 00 01 00 02 07 00 03 07 00 6C 00 02 07 00 03 01 5B 07 00 03 45 07 00 58 40 07 00 09 45 07 00 58 40 07 00 66 50 07 00 75 FF 00 01 00 02 07 00 03 07 00 6C 00 02 07 00 75 01 5E 07 00 75 4D 07 00 58 40 07 00 09 45 07 00 58 40 07 00 66 50 07 00 50 FF 00 00 00 02 07 00 03 07 00 6C 00 04 07 00 85 08 00 C0 08 00 C0 01 45 07 00 58 FF 00 00 00 02 07 00 03 07 00 6C 00 02 07 00 85 07 00 7E 45 07 00 58 FF 00 00 00 02 07 00 03 07 00 6C 00 02 07 00 85 07 00 83 45 07 00 58 00 40 07 00 75 41 07 00 03 41 07 00 50 43 05 44 07 00 50 47 05 47 07 00 58
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                       
                //  -----  -----  -----  -----  -------------------------------------------
                //  8      20     239    247    Ljava/lang/NumberFormatException;
                //  239    247    239    247    Ljava/lang/ClassCastException;
                //  255    257    3      8      Any
                //  43     49     49     50     Any
                //  43     49     49     50     Any
                //  43     49     3      8      Any
                //  43     49     3      8      Ljava/lang/NegativeArraySizeException;
                //  43     49     49     50     Ljava/lang/IllegalStateException;
                //  106    113    113    114    Any
                //  107    113    106    107    Any
                //  107    113    106    107    Ljava/lang/StringIndexOutOfBoundsException;
                //  106    113    106    107    Any
                //  107    113    113    114    Ljava/lang/RuntimeException;
                //  178    185    185    186    Any
                //  179    185    3      8      Ljava/util/ConcurrentModificationException;
                //  178    185    3      8      Ljava/util/ConcurrentModificationException;
                //  179    185    3      8      Ljava/lang/ArithmeticException;
                //  178    185    178    179    Any
                //  203    210    210    211    Any
                //  204    210    3      8      Ljava/lang/NegativeArraySizeException;
                //  203    210    203    204    Ljava/lang/EnumConstantNotPresentException;
                //  204    210    203    204    Ljava/lang/NegativeArraySizeException;
                //  204    210    3      8      Any
                //  217    224    224    225    Any
                //  218    224    224    225    Ljava/lang/IllegalStateException;
                //  218    224    217    218    Any
                //  218    224    3      8      Ljava/lang/ArithmeticException;
                //  218    224    224    225    Any
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
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:670)
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
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          6912
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            6904
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            6896
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            38
        //    32: ldc_w           425552542
        //    35: goto            41
        //    38: ldc_w           1558064146
        //    41: ldc_w           1109897882
        //    44: ixor           
        //    45: lookupswitch {
        //          -123384939: 38
        //          1534777348: 6733
        //          default: 72
        //        }
        //    72: aload_1        
        //    73: goto            77
        //    76: athrow         
        //    77: invokevirtual   dev/nuker/pyro/f3i.c:()Ldev/nuker/pyro/f2T;
        //    80: goto            84
        //    83: athrow         
        //    84: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //    87: if_acmpeq       91
        //    90: return         
        //    91: getstatic       dev/nuker/pyro/fc.0:I
        //    94: ifeq            103
        //    97: ldc_w           -1321002844
        //   100: goto            106
        //   103: ldc_w           -921522882
        //   106: ldc_w           1314998309
        //   109: ixor           
        //   110: lookupswitch {
        //          -14528383: 6867
        //          620596412: 103
        //          default: 136
        //        }
        //   136: aload_0        
        //   137: aload_0        
        //   138: aload_0        
        //   139: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //   142: getstatic       dev/nuker/pyro/fc.0:I
        //   145: ifeq            154
        //   148: ldc_w           1048360187
        //   151: goto            157
        //   154: ldc_w           -124244509
        //   157: ldc_w           341412032
        //   160: ixor           
        //   161: lookupswitch {
        //          -322853597: 188
        //          707083323: 154
        //          default: 6699
        //        }
        //   188: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   191: dup            
        //   192: pop            
        //   193: checkcast       Lnet/minecraft/entity/Entity;
        //   196: goto            200
        //   199: athrow         
        //   200: invokevirtual   dev/nuker/pyro/f5E.3:(Lnet/minecraft/entity/Entity;)[Lnet/minecraft/util/math/BlockPos;
        //   203: goto            207
        //   206: athrow         
        //   207: putfield        dev/nuker/pyro/f5E.c:[Lnet/minecraft/util/math/BlockPos;
        //   210: getstatic       dev/nuker/pyro/fc.c:I
        //   213: ifge            222
        //   216: ldc_w           -789604097
        //   219: goto            225
        //   222: ldc_w           -1884996874
        //   225: ldc_w           -904737319
        //   228: ixor           
        //   229: lookupswitch {
        //          452810022: 222
        //          1169684271: 256
        //          default: 6819
        //        }
        //   256: aload_0        
        //   257: getstatic       dev/nuker/pyro/fc.0:I
        //   260: ifeq            269
        //   263: ldc_w           -958929722
        //   266: goto            272
        //   269: ldc_w           1316589892
        //   272: ldc_w           1198178287
        //   275: ixor           
        //   276: lookupswitch {
        //          -2118296791: 269
        //          152252075: 304
        //          default: 6787
        //        }
        //   304: aload_0        
        //   305: getfield        dev/nuker/pyro/f5E.c:[Lnet/minecraft/util/math/BlockPos;
        //   308: dup            
        //   309: ifnonnull       323
        //   312: goto            316
        //   315: athrow         
        //   316: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   319: goto            323
        //   322: athrow         
        //   323: arraylength    
        //   324: newarray        Z
        //   326: putfield        dev/nuker/pyro/f5E.c:[Z
        //   329: iconst_0       
        //   330: istore_2       
        //   331: getstatic       dev/nuker/pyro/fc.0:I
        //   334: ifeq            343
        //   337: ldc_w           1384962303
        //   340: goto            346
        //   343: ldc_w           1199458864
        //   346: ldc_w           1943120814
        //   349: ixor           
        //   350: lookupswitch {
        //          559772497: 343
        //          883941790: 376
        //          default: 6821
        //        }
        //   376: aload_0        
        //   377: getfield        dev/nuker/pyro/f5E.c:[Lnet/minecraft/util/math/BlockPos;
        //   380: dup            
        //   381: ifnonnull       395
        //   384: goto            388
        //   387: athrow         
        //   388: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   391: goto            395
        //   394: athrow         
        //   395: arraylength    
        //   396: getstatic       dev/nuker/pyro/fc.c:I
        //   399: ifge            408
        //   402: ldc_w           536372314
        //   405: goto            411
        //   408: ldc_w           -1935671778
        //   411: ldc_w           -1675508291
        //   414: ixor           
        //   415: lookupswitch {
        //          -2145340941: 408
        //          -2082889241: 6795
        //          default: 440
        //        }
        //   440: istore_3       
        //   441: iload_2        
        //   442: iload_3        
        //   443: if_icmpge       792
        //   446: getstatic       dev/nuker/pyro/fc.1:I
        //   449: ifeq            458
        //   452: ldc_w           1446619353
        //   455: goto            461
        //   458: ldc_w           1350767051
        //   461: ldc_w           952868538
        //   464: ixor           
        //   465: lookupswitch {
        //          1749585777: 492
        //          1861367395: 458
        //          default: 6771
        //        }
        //   492: aload_0        
        //   493: getfield        dev/nuker/pyro/f5E.c:[Z
        //   496: dup            
        //   497: ifnonnull       570
        //   500: ldc_w           "\u23f4\u149a\u8ae7\ub1c4\ucfc5\uedf0\ub205\ue6d4\udb6b"
        //   503: getstatic       dev/nuker/pyro/fc.0:I
        //   506: ifeq            515
        //   509: ldc_w           1331013179
        //   512: goto            518
        //   515: ldc_w           341588921
        //   518: ldc_w           735055438
        //   521: ixor           
        //   522: lookupswitch {
        //          1066153463: 548
        //          1686481013: 515
        //          default: 6841
        //        }
        //   548: goto            552
        //   551: athrow         
        //   552: invokestatic    invokestatic   !!! ERROR
        //   555: goto            559
        //   558: athrow         
        //   559: goto            563
        //   562: athrow         
        //   563: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   566: goto            570
        //   569: athrow         
        //   570: getstatic       dev/nuker/pyro/fc.c:I
        //   573: ifge            582
        //   576: ldc_w           -33193917
        //   579: goto            585
        //   582: ldc_w           -1526284755
        //   585: ldc_w           -968510210
        //   588: ixor           
        //   589: lookupswitch {
        //          -178498227: 582
        //          943731901: 6825
        //          default: 616
        //        }
        //   616: iload_2        
        //   617: getstatic       dev/nuker/pyro/fc.0:I
        //   620: ifeq            629
        //   623: ldc_w           -135558835
        //   626: goto            632
        //   629: ldc_w           1760596875
        //   632: ldc_w           285387609
        //   635: ixor           
        //   636: lookupswitch {
        //          -420929004: 629
        //          2045917394: 664
        //          default: 6719
        //        }
        //   664: aload_0        
        //   665: getfield        dev/nuker/pyro/f5E.c:[Lnet/minecraft/util/math/BlockPos;
        //   668: dup            
        //   669: ifnonnull       683
        //   672: goto            676
        //   675: athrow         
        //   676: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   679: goto            683
        //   682: athrow         
        //   683: getstatic       dev/nuker/pyro/fc.1:I
        //   686: ifeq            695
        //   689: ldc_w           -809478087
        //   692: goto            698
        //   695: ldc_w           -1635351338
        //   698: ldc_w           2090258055
        //   701: ixor           
        //   702: lookupswitch {
        //          -1286170946: 695
        //          -502248879: 728
        //          default: 6871
        //        }
        //   728: iload_2        
        //   729: aaload         
        //   730: goto            734
        //   733: athrow         
        //   734: invokestatic    dev/nuker/pyro/fbA.4:(Lnet/minecraft/util/math/BlockPos;)Z
        //   737: goto            741
        //   740: athrow         
        //   741: ifne            750
        //   744: ldc_w           497530525
        //   747: goto            753
        //   750: ldc_w           497530526
        //   753: ldc_w           997700676
        //   756: ixor           
        //   757: tableswitch {
        //          1302332850: 780
        //          1302332851: 784
        //          default: 744
        //        }
        //   780: iconst_1       
        //   781: goto            785
        //   784: iconst_0       
        //   785: bastore        
        //   786: iinc            2, 1
        //   789: goto            441
        //   792: aload_0        
        //   793: aload_0        
        //   794: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //   797: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   800: dup            
        //   801: pop            
        //   802: checkcast       Lnet/minecraft/entity/Entity;
        //   805: goto            809
        //   808: athrow         
        //   809: invokevirtual   dev/nuker/pyro/f5E.1:(Lnet/minecraft/entity/Entity;)Z
        //   812: goto            816
        //   815: athrow         
        //   816: ifeq            825
        //   819: ldc_w           -2138650644
        //   822: goto            828
        //   825: ldc_w           -2138650643
        //   828: ldc_w           -1011174024
        //   831: ixor           
        //   832: tableswitch {
        //          -2038897368: 856
        //          -2038897367: 996
        //          default: 819
        //        }
        //   856: aload_0        
        //   857: getfield        dev/nuker/pyro/f5E.c:Ldev/nuker/pyro/f0a;
        //   860: goto            864
        //   863: athrow         
        //   864: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   867: goto            871
        //   870: athrow         
        //   871: checkcast       Ljava/lang/Boolean;
        //   874: getstatic       dev/nuker/pyro/fc.1:I
        //   877: ifeq            886
        //   880: ldc_w           1271027742
        //   883: goto            889
        //   886: ldc_w           1498664413
        //   889: ldc_w           1461671267
        //   892: ixor           
        //   893: lookupswitch {
        //          239900862: 920
        //          484248957: 886
        //          default: 6737
        //        }
        //   920: goto            924
        //   923: athrow         
        //   924: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   927: goto            931
        //   930: athrow         
        //   931: ifeq            940
        //   934: ldc_w           1768645536
        //   937: goto            943
        //   940: ldc_w           1768645539
        //   943: ldc_w           872097237
        //   946: ixor           
        //   947: tableswitch {
        //          -1256157974: 968
        //          -1256157973: 995
        //          default: 934
        //        }
        //   968: aload_0        
        //   969: getfield        dev/nuker/pyro/f5E.c:Ldev/nuker/pyro/fw;
        //   972: iconst_0       
        //   973: goto            977
        //   976: athrow         
        //   977: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   980: goto            984
        //   983: athrow         
        //   984: goto            988
        //   987: athrow         
        //   988: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   991: goto            995
        //   994: athrow         
        //   995: return         
        //   996: aload_0        
        //   997: getfield        dev/nuker/pyro/f5E.c:Z
        //  1000: ifeq            1189
        //  1003: getstatic       dev/nuker/pyro/fc.1:I
        //  1006: ifeq            1015
        //  1009: ldc_w           -912870720
        //  1012: goto            1018
        //  1015: ldc_w           461904073
        //  1018: ldc_w           -867308810
        //  1021: ixor           
        //  1022: lookupswitch {
        //          -399003405: 1015
        //          98261046: 6813
        //          default: 1048
        //        }
        //  1048: aload_0        
        //  1049: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  1052: getstatic       dev/nuker/pyro/fc.1:I
        //  1055: ifeq            1064
        //  1058: ldc_w           2015725319
        //  1061: goto            1067
        //  1064: ldc_w           -1536978187
        //  1067: ldc_w           -223289133
        //  1070: ixor           
        //  1071: lookupswitch {
        //          -1969920044: 6725
        //          1675952188: 1064
        //          default: 1096
        //        }
        //  1096: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1099: getstatic       dev/nuker/pyro/fc.1:I
        //  1102: ifeq            1111
        //  1105: ldc_w           -1068850760
        //  1108: goto            1114
        //  1111: ldc_w           -749525474
        //  1114: ldc_w           211026739
        //  1117: ixor           
        //  1118: lookupswitch {
        //          -857824629: 1111
        //          -540596947: 1144
        //          default: 6809
        //        }
        //  1144: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70122_E:Z
        //  1147: ifeq            1156
        //  1150: ldc_w           283474718
        //  1153: goto            1159
        //  1156: ldc_w           283474719
        //  1159: ldc_w           211715174
        //  1162: ixor           
        //  1163: tableswitch {
        //          955776752: 1184
        //          955776753: 1189
        //          default: 1150
        //        }
        //  1184: aload_0        
        //  1185: iconst_0       
        //  1186: putfield        dev/nuker/pyro/f5E.c:Z
        //  1189: aload_0        
        //  1190: getfield        dev/nuker/pyro/f5E.c:Z
        //  1193: ifne            1803
        //  1196: getstatic       dev/nuker/pyro/fc.1:I
        //  1199: ifeq            1208
        //  1202: ldc_w           -359281422
        //  1205: goto            1211
        //  1208: ldc_w           837674041
        //  1211: ldc_w           577004447
        //  1214: ixor           
        //  1215: lookupswitch {
        //          -923685011: 6805
        //          2112693803: 1208
        //          default: 1240
        //        }
        //  1240: aload_0        
        //  1241: getstatic       dev/nuker/pyro/fc.0:I
        //  1244: ifeq            1253
        //  1247: ldc_w           103320627
        //  1250: goto            1256
        //  1253: ldc_w           -432792344
        //  1256: ldc_w           1736569959
        //  1259: ixor           
        //  1260: lookupswitch {
        //          519567632: 1253
        //          1638496340: 6721
        //          default: 1288
        //        }
        //  1288: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  1291: getstatic       dev/nuker/pyro/fc.1:I
        //  1294: ifeq            1303
        //  1297: ldc_w           1708631143
        //  1300: goto            1306
        //  1303: ldc_w           -68698841
        //  1306: ldc_w           305319446
        //  1309: ixor           
        //  1310: lookupswitch {
        //          1822038376: 1303
        //          2011523697: 6877
        //          default: 1336
        //        }
        //  1336: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1339: getstatic       dev/nuker/pyro/fc.1:I
        //  1342: ifeq            1351
        //  1345: ldc_w           -1966006327
        //  1348: goto            1354
        //  1351: ldc_w           649307391
        //  1354: ldc_w           -1806310452
        //  1357: ixor           
        //  1358: lookupswitch {
        //          -1639554978: 1351
        //          512031749: 6837
        //          default: 1384
        //        }
        //  1384: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70122_E:Z
        //  1387: ifne            1803
        //  1390: aload_0        
        //  1391: getfield        dev/nuker/pyro/f5E.1:Ldev/nuker/pyro/f0a;
        //  1394: goto            1398
        //  1397: athrow         
        //  1398: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1401: goto            1405
        //  1404: athrow         
        //  1405: checkcast       Ljava/lang/Boolean;
        //  1408: goto            1412
        //  1411: athrow         
        //  1412: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1415: goto            1419
        //  1418: athrow         
        //  1419: ifeq            1803
        //  1422: aload_0        
        //  1423: getfield        dev/nuker/pyro/f5E.c:Ldev/nuker/pyro/fw;
        //  1426: iconst_0       
        //  1427: goto            1431
        //  1430: athrow         
        //  1431: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1434: goto            1438
        //  1437: athrow         
        //  1438: getstatic       dev/nuker/pyro/fc.0:I
        //  1441: ifeq            1450
        //  1444: ldc_w           345936555
        //  1447: goto            1453
        //  1450: ldc_w           95512661
        //  1453: ldc_w           -1382287720
        //  1456: ixor           
        //  1457: lookupswitch {
        //          -1190829005: 6773
        //          1258816528: 1450
        //          default: 1484
        //        }
        //  1484: goto            1488
        //  1487: athrow         
        //  1488: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //  1491: goto            1495
        //  1494: athrow         
        //  1495: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //  1498: new             Ljava/lang/StringBuilder;
        //  1501: dup            
        //  1502: goto            1506
        //  1505: athrow         
        //  1506: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1509: goto            1513
        //  1512: athrow         
        //  1513: getstatic       com/mojang/realmsclient/gui/ChatFormatting.AQUA:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1516: getstatic       dev/nuker/pyro/fc.1:I
        //  1519: ifeq            1528
        //  1522: ldc_w           172377398
        //  1525: goto            1531
        //  1528: ldc_w           1160715915
        //  1531: ldc_w           1456352441
        //  1534: ixor           
        //  1535: lookupswitch {
        //          333525554: 1560
        //          1552443791: 1528
        //          default: 6753
        //        }
        //  1560: goto            1564
        //  1563: athrow         
        //  1564: invokevirtual   com/mojang/realmsclient/gui/ChatFormatting.toString:()Ljava/lang/String;
        //  1567: goto            1571
        //  1570: athrow         
        //  1571: goto            1575
        //  1574: athrow         
        //  1575: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1578: goto            1582
        //  1581: athrow         
        //  1582: ldc_w           "\u23c9\u14a0\u8afe\ub1da\ucfd2\uedfb\ub231\ue6c8\udb7d\uef8e\ua76e\u1e0c"
        //  1585: goto            1589
        //  1588: athrow         
        //  1589: invokestatic    invokestatic   !!! ERROR
        //  1592: goto            1596
        //  1595: athrow         
        //  1596: getstatic       dev/nuker/pyro/fc.1:I
        //  1599: ifeq            1608
        //  1602: ldc_w           -713529627
        //  1605: goto            1611
        //  1608: ldc_w           2091097952
        //  1611: ldc_w           412072554
        //  1614: ixor           
        //  1615: lookupswitch {
        //          -839394161: 6723
        //          -660076874: 1608
        //          default: 1640
        //        }
        //  1640: goto            1644
        //  1643: athrow         
        //  1644: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1647: goto            1651
        //  1650: athrow         
        //  1651: getstatic       dev/nuker/pyro/fc.1:I
        //  1654: ifeq            1663
        //  1657: ldc_w           16862624
        //  1660: goto            1666
        //  1663: ldc_w           -1665291466
        //  1666: ldc_w           -213483174
        //  1669: ixor           
        //  1670: lookupswitch {
        //          -230175494: 1663
        //          1878731372: 1696
        //          default: 6705
        //        }
        //  1696: getstatic       com/mojang/realmsclient/gui/ChatFormatting.RESET:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //  1699: getstatic       dev/nuker/pyro/fc.0:I
        //  1702: ifeq            1711
        //  1705: ldc_w           1925728068
        //  1708: goto            1714
        //  1711: ldc_w           -1919136831
        //  1714: ldc_w           -1444366297
        //  1717: ixor           
        //  1718: lookupswitch {
        //          -618594461: 1711
        //          611644390: 1744
        //          default: 6881
        //        }
        //  1744: goto            1748
        //  1747: athrow         
        //  1748: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1751: goto            1755
        //  1754: athrow         
        //  1755: ldc_w           "\u23b2\u148a\u8ae4\ub1dd\ucf80\uedf5\ub236\ue6c3\udb39\uefbc\ua732\u1e4a\ue1a2\uc7b1\u8726\u8960\u57b1\u770d\ubf28\uc643\u2b40\uc22f\u6a04\u2f40\ud1d6\u359b\u7d22\u89a6\u8207\u8ad5"
        //  1758: goto            1762
        //  1761: athrow         
        //  1762: invokestatic    invokestatic   !!! ERROR
        //  1765: goto            1769
        //  1768: athrow         
        //  1769: goto            1773
        //  1772: athrow         
        //  1773: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1776: goto            1780
        //  1779: athrow         
        //  1780: goto            1784
        //  1783: athrow         
        //  1784: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1787: goto            1791
        //  1790: athrow         
        //  1791: goto            1795
        //  1794: athrow         
        //  1795: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //  1798: goto            1802
        //  1801: athrow         
        //  1802: return         
        //  1803: aload_0        
        //  1804: getfield        dev/nuker/pyro/f5E.0:Ldev/nuker/pyro/f0a;
        //  1807: goto            1811
        //  1810: athrow         
        //  1811: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1814: goto            1818
        //  1817: athrow         
        //  1818: checkcast       Ljava/lang/Boolean;
        //  1821: goto            1825
        //  1824: athrow         
        //  1825: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1828: goto            1832
        //  1831: athrow         
        //  1832: ifeq            2615
        //  1835: aload_0        
        //  1836: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/util/math/Vec3d;
        //  1839: getstatic       dev/nuker/pyro/fc.1:I
        //  1842: ifeq            1851
        //  1845: ldc_w           1152331781
        //  1848: goto            1854
        //  1851: ldc_w           1013904405
        //  1854: ldc_w           1231346566
        //  1857: ixor           
        //  1858: lookupswitch {
        //           -88379: 1851
        //          231467907: 6863
        //          default: 1884
        //        }
        //  1884: getstatic       net/minecraft/util/math/Vec3d.field_186680_a:Lnet/minecraft/util/math/Vec3d;
        //  1887: if_acmpeq       1896
        //  1890: ldc_w           1319652977
        //  1893: goto            1899
        //  1896: ldc_w           1319652976
        //  1899: ldc_w           -1062161253
        //  1902: ixor           
        //  1903: tableswitch {
        //          473036244: 1924
        //          473036245: 2615
        //          default: 1890
        //        }
        //  1924: aload_0        
        //  1925: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/util/math/Vec3d;
        //  1928: getstatic       dev/nuker/pyro/fc.c:I
        //  1931: ifge            1940
        //  1934: ldc_w           -870721797
        //  1937: goto            1943
        //  1940: ldc_w           1995273117
        //  1943: ldc_w           -255518162
        //  1946: ixor           
        //  1947: lookupswitch {
        //          1021103317: 6735
        //          1155001596: 1940
        //          default: 1972
        //        }
        //  1972: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  1975: aload_0        
        //  1976: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  1979: getstatic       dev/nuker/pyro/fc.1:I
        //  1982: ifeq            1991
        //  1985: ldc_w           849924074
        //  1988: goto            1994
        //  1991: ldc_w           -1450933953
        //  1994: ldc_w           2105359976
        //  1997: ixor           
        //  1998: lookupswitch {
        //          -721830057: 2024
        //          1339421058: 1991
        //          default: 6789
        //        }
        //  2024: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2027: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  2030: dsub           
        //  2031: goto            2035
        //  2034: athrow         
        //  2035: invokestatic    java/lang/Math.abs:(D)D
        //  2038: goto            2042
        //  2041: athrow         
        //  2042: dstore_2       
        //  2043: getstatic       dev/nuker/pyro/fc.1:I
        //  2046: ifeq            2055
        //  2049: ldc_w           583073312
        //  2052: goto            2058
        //  2055: ldc_w           -1366757126
        //  2058: ldc_w           1364477803
        //  2061: ixor           
        //  2062: lookupswitch {
        //          -2312303: 2088
        //          1939126603: 2055
        //          default: 6747
        //        }
        //  2088: aload_0        
        //  2089: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/util/math/Vec3d;
        //  2092: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  2095: aload_0        
        //  2096: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  2099: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2102: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  2105: dsub           
        //  2106: getstatic       dev/nuker/pyro/fc.c:I
        //  2109: ifge            2118
        //  2112: ldc_w           -1845949568
        //  2115: goto            2121
        //  2118: ldc_w           490225062
        //  2121: ldc_w           818233088
        //  2124: ixor           
        //  2125: lookupswitch {
        //          -1589889920: 6739
        //          996783953: 2118
        //          default: 2152
        //        }
        //  2152: goto            2156
        //  2155: athrow         
        //  2156: invokestatic    java/lang/Math.abs:(D)D
        //  2159: goto            2163
        //  2162: athrow         
        //  2163: dstore          4
        //  2165: dload_2        
        //  2166: ldc2_w          0.1
        //  2169: dcmpg          
        //  2170: ifgt            2226
        //  2173: dload           4
        //  2175: ldc2_w          0.1
        //  2178: dcmpg          
        //  2179: ifgt            2188
        //  2182: ldc_w           -787307772
        //  2185: goto            2191
        //  2188: ldc_w           -787307771
        //  2191: ldc_w           -983111582
        //  2194: ixor           
        //  2195: tableswitch {
        //          686331596: 2216
        //          686331597: 2226
        //          default: 2182
        //        }
        //  2216: aload_0        
        //  2217: getstatic       net/minecraft/util/math/Vec3d.field_186680_a:Lnet/minecraft/util/math/Vec3d;
        //  2220: putfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/util/math/Vec3d;
        //  2223: goto            2615
        //  2226: aload_0        
        //  2227: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/util/math/Vec3d;
        //  2230: getfield        net/minecraft/util/math/Vec3d.field_72450_a:D
        //  2233: aload_0        
        //  2234: getstatic       dev/nuker/pyro/fc.0:I
        //  2237: ifeq            2246
        //  2240: ldc_w           -1220767012
        //  2243: goto            2249
        //  2246: ldc_w           167037754
        //  2249: ldc_w           -1661816708
        //  2252: ixor           
        //  2253: lookupswitch {
        //          -1794737338: 2280
        //          734929568: 2246
        //          default: 6873
        //        }
        //  2280: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  2283: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2286: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  2289: dsub           
        //  2290: getstatic       dev/nuker/pyro/fc.c:I
        //  2293: ifge            2302
        //  2296: ldc_w           717329555
        //  2299: goto            2305
        //  2302: ldc_w           -1687778983
        //  2305: ldc_w           1514538139
        //  2308: ixor           
        //  2309: lookupswitch {
        //          -1054831166: 2336
        //          1887932424: 2302
        //          default: 6823
        //        }
        //  2336: dstore          6
        //  2338: aload_0        
        //  2339: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/util/math/Vec3d;
        //  2342: getfield        net/minecraft/util/math/Vec3d.field_72449_c:D
        //  2345: getstatic       dev/nuker/pyro/fc.1:I
        //  2348: ifeq            2357
        //  2351: ldc_w           -1217482395
        //  2354: goto            2360
        //  2357: ldc_w           -159078067
        //  2360: ldc_w           -921123214
        //  2363: ixor           
        //  2364: lookupswitch {
        //          -882041771: 2357
        //          2121692951: 6829
        //          default: 2392
        //        }
        //  2392: aload_0        
        //  2393: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  2396: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2399: getstatic       dev/nuker/pyro/fc.c:I
        //  2402: ifge            2411
        //  2405: ldc_w           631475192
        //  2408: goto            2414
        //  2411: ldc_w           348451124
        //  2414: ldc_w           -288227129
        //  2417: ixor           
        //  2418: lookupswitch {
        //          -881751233: 2411
        //          -99159565: 2444
        //          default: 6777
        //        }
        //  2444: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  2447: dsub           
        //  2448: dstore          8
        //  2450: getstatic       dev/nuker/pyro/fc.0:I
        //  2453: ifeq            2462
        //  2456: ldc_w           -1950199458
        //  2459: goto            2465
        //  2462: ldc_w           1825571470
        //  2465: ldc_w           1833985185
        //  2468: ixor           
        //  2469: lookupswitch {
        //          -426625537: 2462
        //          25191983: 2496
        //          default: 6767
        //        }
        //  2496: aload_0        
        //  2497: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  2500: getstatic       dev/nuker/pyro/fc.0:I
        //  2503: ifeq            2512
        //  2506: ldc_w           -968662640
        //  2509: goto            2515
        //  2512: ldc_w           -53855383
        //  2515: ldc_w           578570823
        //  2518: ixor           
        //  2519: lookupswitch {
        //          -465622057: 6797
        //          -323343996: 2512
        //          default: 2544
        //        }
        //  2544: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2547: dload           6
        //  2549: iconst_2       
        //  2550: i2d            
        //  2551: ddiv           
        //  2552: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70159_w:D
        //  2555: aload_0        
        //  2556: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  2559: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2562: dload           8
        //  2564: iconst_2       
        //  2565: i2d            
        //  2566: ddiv           
        //  2567: getstatic       dev/nuker/pyro/fc.0:I
        //  2570: ifeq            2579
        //  2573: ldc_w           -2122402461
        //  2576: goto            2582
        //  2579: ldc_w           -406561606
        //  2582: ldc_w           607894279
        //  2585: ixor           
        //  2586: lookupswitch {
        //          -1522200988: 2579
        //          -1006639171: 2612
        //          default: 6743
        //        }
        //  2612: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70179_y:D
        //  2615: iconst_m1      
        //  2616: getstatic       dev/nuker/pyro/fc.1:I
        //  2619: ifeq            2628
        //  2622: ldc_w           909828114
        //  2625: goto            2631
        //  2628: ldc_w           821998863
        //  2631: ldc_w           -1498386168
        //  2634: ixor           
        //  2635: lookupswitch {
        //          -1869967078: 6757
        //          -404719870: 2628
        //          default: 2660
        //        }
        //  2660: istore_2       
        //  2661: iconst_1       
        //  2662: getstatic       dev/nuker/pyro/fc.1:I
        //  2665: ifeq            2674
        //  2668: ldc_w           -1464619242
        //  2671: goto            2677
        //  2674: ldc_w           1691417045
        //  2677: ldc_w           170037264
        //  2680: ixor           
        //  2681: lookupswitch {
        //          -1567539450: 6781
        //          822836372: 2674
        //          default: 2708
        //        }
        //  2708: istore_3       
        //  2709: aload_0        
        //  2710: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  2713: getstatic       dev/nuker/pyro/fc.c:I
        //  2716: ifge            2725
        //  2719: ldc_w           -2013306795
        //  2722: goto            2728
        //  2725: ldc_w           -1860442249
        //  2728: ldc_w           1760461674
        //  2731: ixor           
        //  2732: lookupswitch {
        //          -1412338453: 2725
        //          -284040385: 6775
        //          default: 2760
        //        }
        //  2760: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2763: dup            
        //  2764: pop            
        //  2765: goto            2769
        //  2768: athrow         
        //  2769: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //  2772: goto            2776
        //  2775: athrow         
        //  2776: dup            
        //  2777: pop            
        //  2778: getstatic       dev/nuker/pyro/fc.c:I
        //  2781: ifge            2790
        //  2784: ldc_w           346237731
        //  2787: goto            2793
        //  2790: ldc_w           -73167033
        //  2793: ldc_w           -913969655
        //  2796: ixor           
        //  2797: lookupswitch {
        //          -584661718: 2790
        //          841376078: 2824
        //          default: 6827
        //        }
        //  2824: goto            2828
        //  2827: athrow         
        //  2828: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //  2831: goto            2835
        //  2834: athrow         
        //  2835: ifne            2844
        //  2838: ldc_w           412487254
        //  2841: goto            2847
        //  2844: ldc_w           412487257
        //  2847: ldc_w           328244241
        //  2850: ixor           
        //  2851: tableswitch {
        //          369960078: 2872
        //          369960079: 3151
        //          default: 2838
        //        }
        //  2872: aload_0        
        //  2873: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  2876: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2879: dup            
        //  2880: pop            
        //  2881: goto            2885
        //  2884: athrow         
        //  2885: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //  2888: goto            2892
        //  2891: athrow         
        //  2892: dup            
        //  2893: pop            
        //  2894: goto            2898
        //  2897: athrow         
        //  2898: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  2901: goto            2905
        //  2904: athrow         
        //  2905: instanceof      Lnet/minecraft/item/ItemBlock;
        //  2908: ifeq            3151
        //  2911: aload_0        
        //  2912: getstatic       dev/nuker/pyro/fc.0:I
        //  2915: ifeq            2924
        //  2918: ldc_w           -482920153
        //  2921: goto            2927
        //  2924: ldc_w           -994530819
        //  2927: ldc_w           -1440593099
        //  2930: ixor           
        //  2931: lookupswitch {
        //          1226142226: 2924
        //          1855644360: 2956
        //          default: 6883
        //        }
        //  2956: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  2959: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2962: dup            
        //  2963: pop            
        //  2964: goto            2968
        //  2967: athrow         
        //  2968: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //  2971: goto            2975
        //  2974: athrow         
        //  2975: dup            
        //  2976: pop            
        //  2977: goto            2981
        //  2980: athrow         
        //  2981: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  2984: goto            2988
        //  2987: athrow         
        //  2988: dup            
        //  2989: ifnonnull       3068
        //  2992: new             Lkotlin/TypeCastException;
        //  2995: dup            
        //  2996: ldc_w           "\u23fc\u1486\u8ae7\ub1c4\ucf80\uedf7\ub225\ue6c8\udb77\uefbc\ua720\u1e0c\ue1e0\uc7b3\u8774\u896c\u57a5\u7710\ubf38\uc64f\u2b14\uc234\u6a4b\u2f49\ud1de\u3599\u7d66\u89a6\u8215\u8a98\u84be\ufb72\u70c0\u981e\u1d96\uf170\u493c\u8869\uc892\uf930\ub684\u41fe\ub9fb\ub157\u4a73\u8ae4\u7c7b\uce22\u7f59\uecd5\ue684\u16d1\uee44\u359a\u40a4\ue1a0\u0a3e\u86c3\u1bc1\u094c\u772d\u7281\uc7e3\ub9a8\u9cd5"
        //  2999: goto            3003
        //  3002: athrow         
        //  3003: invokestatic    invokestatic   !!! ERROR
        //  3006: goto            3010
        //  3009: athrow         
        //  3010: getstatic       dev/nuker/pyro/fc.c:I
        //  3013: ifge            3022
        //  3016: ldc_w           1824238670
        //  3019: goto            3025
        //  3022: ldc_w           1186660398
        //  3025: ldc_w           1149421792
        //  3028: ixor           
        //  3029: lookupswitch {
        //          8920802: 3022
        //          674849966: 6799
        //          default: 3056
        //        }
        //  3056: goto            3060
        //  3059: athrow         
        //  3060: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //  3063: goto            3067
        //  3066: athrow         
        //  3067: athrow         
        //  3068: checkcast       Lnet/minecraft/item/ItemBlock;
        //  3071: astore          4
        //  3073: aload           4
        //  3075: goto            3079
        //  3078: athrow         
        //  3079: invokevirtual   net/minecraft/item/ItemBlock.func_179223_d:()Lnet/minecraft/block/Block;
        //  3082: goto            3086
        //  3085: athrow         
        //  3086: getstatic       dev/nuker/pyro/fc.0:I
        //  3089: ifeq            3098
        //  3092: ldc_w           -292680072
        //  3095: goto            3101
        //  3098: ldc_w           -1120763907
        //  3101: ldc_w           13707761
        //  3104: ixor           
        //  3105: lookupswitch {
        //          -1109174772: 3132
        //          -295753847: 3098
        //          default: 6729
        //        }
        //  3132: getstatic       net/minecraft/init/Blocks.field_150343_Z:Lnet/minecraft/block/Block;
        //  3135: goto            3139
        //  3138: athrow         
        //  3139: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3142: goto            3146
        //  3145: athrow         
        //  3146: ifeq            3151
        //  3149: iconst_0       
        //  3150: istore_3       
        //  3151: iload_3        
        //  3152: ifeq            3693
        //  3155: iconst_0       
        //  3156: istore          4
        //  3158: bipush          8
        //  3160: istore          5
        //  3162: getstatic       dev/nuker/pyro/fc.0:I
        //  3165: ifeq            3174
        //  3168: ldc_w           -1532653749
        //  3171: goto            3177
        //  3174: ldc_w           -963055414
        //  3177: ldc_w           -1157944024
        //  3180: ixor           
        //  3181: lookupswitch {
        //          509518435: 3174
        //          2086919650: 3208
        //          default: 6849
        //        }
        //  3208: iload           4
        //  3210: iload           5
        //  3212: if_icmpgt       3650
        //  3215: aload_0        
        //  3216: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  3219: getstatic       dev/nuker/pyro/fc.0:I
        //  3222: ifeq            3231
        //  3225: ldc_w           2145848587
        //  3228: goto            3234
        //  3231: ldc_w           1677156333
        //  3234: ldc_w           -260911100
        //  3237: ixor           
        //  3238: lookupswitch {
        //          -1886003953: 6865
        //          -673332559: 3231
        //          default: 3264
        //        }
        //  3264: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3267: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  3270: getstatic       dev/nuker/pyro/fc.1:I
        //  3273: ifeq            3282
        //  3276: ldc_w           -30742206
        //  3279: goto            3285
        //  3282: ldc_w           2144516649
        //  3285: ldc_w           996811807
        //  3288: ixor           
        //  3289: lookupswitch {
        //          -985608867: 6779
        //          131047087: 3282
        //          default: 3316
        //        }
        //  3316: iload           4
        //  3318: getstatic       dev/nuker/pyro/fc.c:I
        //  3321: ifge            3330
        //  3324: ldc_w           1183228843
        //  3327: goto            3333
        //  3330: ldc_w           190766659
        //  3333: ldc_w           367560325
        //  3336: ixor           
        //  3337: lookupswitch {
        //          515266758: 3364
        //          1399727406: 3330
        //          default: 6759
        //        }
        //  3364: goto            3368
        //  3367: athrow         
        //  3368: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70301_a:(I)Lnet/minecraft/item/ItemStack;
        //  3371: goto            3375
        //  3374: athrow         
        //  3375: dup            
        //  3376: pop            
        //  3377: goto            3381
        //  3380: athrow         
        //  3381: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  3384: goto            3388
        //  3387: athrow         
        //  3388: instanceof      Lnet/minecraft/item/ItemBlock;
        //  3391: ifeq            3644
        //  3394: aload_0        
        //  3395: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  3398: getstatic       dev/nuker/pyro/fc.0:I
        //  3401: ifeq            3410
        //  3404: ldc_w           -821717276
        //  3407: goto            3413
        //  3410: ldc_w           -2103073770
        //  3413: ldc_w           684842086
        //  3416: ixor           
        //  3417: lookupswitch {
        //          -405517694: 6831
        //          1380566676: 3410
        //          default: 3444
        //        }
        //  3444: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3447: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  3450: iload           4
        //  3452: goto            3456
        //  3455: athrow         
        //  3456: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70301_a:(I)Lnet/minecraft/item/ItemStack;
        //  3459: goto            3463
        //  3462: athrow         
        //  3463: dup            
        //  3464: pop            
        //  3465: goto            3469
        //  3468: athrow         
        //  3469: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  3472: goto            3476
        //  3475: athrow         
        //  3476: dup            
        //  3477: ifnonnull       3510
        //  3480: new             Lkotlin/TypeCastException;
        //  3483: dup            
        //  3484: ldc_w           "\u23fc\u1486\u8ae7\ub1c4\ucf80\uedf7\ub225\ue6c8\udb77\uefbc\ua720\u1e0c\ue1e0\uc7b3\u8774\u896c\u57a5\u7710\ubf38\uc64f\u2b14\uc234\u6a4b\u2f49\ud1de\u3599\u7d66\u89a6\u8215\u8a98\u84be\ufb72\u70c0\u981e\u1d96\uf170\u493c\u8869\uc892\uf930\ub684\u41fe\ub9fb\ub157\u4a73\u8ae4\u7c7b\uce22\u7f59\uecd5\ue684\u16d1\uee44\u359a\u40a4\ue1a0\u0a3e\u86c3\u1bc1\u094c\u772d\u7281\uc7e3\ub9a8\u9cd5"
        //  3487: goto            3491
        //  3490: athrow         
        //  3491: invokestatic    invokestatic   !!! ERROR
        //  3494: goto            3498
        //  3497: athrow         
        //  3498: goto            3502
        //  3501: athrow         
        //  3502: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //  3505: goto            3509
        //  3508: athrow         
        //  3509: athrow         
        //  3510: checkcast       Lnet/minecraft/item/ItemBlock;
        //  3513: astore          6
        //  3515: aload           6
        //  3517: getstatic       dev/nuker/pyro/fc.1:I
        //  3520: ifeq            3529
        //  3523: ldc_w           1170805474
        //  3526: goto            3532
        //  3529: ldc_w           -1999254180
        //  3532: ldc_w           -1218035576
        //  3535: ixor           
        //  3536: lookupswitch {
        //          -223391126: 3529
        //          1068731860: 3564
        //          default: 6845
        //        }
        //  3564: goto            3568
        //  3567: athrow         
        //  3568: invokevirtual   net/minecraft/item/ItemBlock.func_179223_d:()Lnet/minecraft/block/Block;
        //  3571: goto            3575
        //  3574: athrow         
        //  3575: getstatic       net/minecraft/init/Blocks.field_150343_Z:Lnet/minecraft/block/Block;
        //  3578: getstatic       dev/nuker/pyro/fc.0:I
        //  3581: ifeq            3590
        //  3584: ldc_w           585104475
        //  3587: goto            3593
        //  3590: ldc_w           -853668803
        //  3593: ldc_w           -1046084880
        //  3596: ixor           
        //  3597: lookupswitch {
        //          -1996856942: 3590
        //          -478544213: 6835
        //          default: 3624
        //        }
        //  3624: goto            3628
        //  3627: athrow         
        //  3628: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3631: goto            3635
        //  3634: athrow         
        //  3635: ifeq            3644
        //  3638: iload           4
        //  3640: istore_2       
        //  3641: goto            3650
        //  3644: iinc            4, 1
        //  3647: goto            3162
        //  3650: iload_2        
        //  3651: iconst_m1      
        //  3652: if_icmpne       3661
        //  3655: ldc_w           1478744339
        //  3658: goto            3664
        //  3661: ldc_w           1478744336
        //  3664: ldc_w           110377278
        //  3667: ixor           
        //  3668: tableswitch {
        //          -1116749734: 3692
        //          -1116749733: 3693
        //          default: 3655
        //        }
        //  3692: return         
        //  3693: aload_0        
        //  3694: getstatic       dev/nuker/pyro/fc.0:I
        //  3697: ifeq            3706
        //  3700: ldc_w           -1692708828
        //  3703: goto            3709
        //  3706: ldc_w           -643531006
        //  3709: ldc_w           -116991144
        //  3712: ixor           
        //  3713: lookupswitch {
        //          1299611198: 3706
        //          1646103420: 6741
        //          default: 3740
        //        }
        //  3740: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  3743: getstatic       dev/nuker/pyro/fc.0:I
        //  3746: ifeq            3755
        //  3749: ldc_w           2048662349
        //  3752: goto            3758
        //  3755: ldc_w           -2102747303
        //  3758: ldc_w           83055273
        //  3761: ixor           
        //  3762: lookupswitch {
        //          -1593359081: 3755
        //          2129611236: 6761
        //          default: 3788
        //        }
        //  3788: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3791: getstatic       dev/nuker/pyro/fc.c:I
        //  3794: ifge            3803
        //  3797: ldc_w           -531702948
        //  3800: goto            3806
        //  3803: ldc_w           259675447
        //  3806: ldc_w           975342747
        //  3809: ixor           
        //  3810: lookupswitch {
        //          -1373715065: 3803
        //          -630433849: 6711
        //          default: 3836
        //        }
        //  3836: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  3839: getfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //  3842: getstatic       dev/nuker/pyro/fc.c:I
        //  3845: ifge            3854
        //  3848: ldc_w           -173628282
        //  3851: goto            3857
        //  3854: ldc_w           -153509853
        //  3857: ldc_w           -244220369
        //  3860: ixor           
        //  3861: lookupswitch {
        //          -1449311345: 3854
        //          81255081: 6727
        //          default: 3888
        //        }
        //  3888: istore          4
        //  3890: getstatic       dev/nuker/pyro/fc.1:I
        //  3893: ifeq            3902
        //  3896: ldc_w           545628466
        //  3899: goto            3905
        //  3902: ldc_w           1810231810
        //  3905: ldc_w           965173004
        //  3908: ixor           
        //  3909: lookupswitch {
        //          419626558: 3902
        //          1382198542: 3936
        //          default: 6875
        //        }
        //  3936: aload_0        
        //  3937: aload_0        
        //  3938: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  3941: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3944: dup            
        //  3945: pop            
        //  3946: checkcast       Lnet/minecraft/entity/Entity;
        //  3949: goto            3953
        //  3952: athrow         
        //  3953: invokevirtual   dev/nuker/pyro/f5E.3:(Lnet/minecraft/entity/Entity;)[Lnet/minecraft/util/math/BlockPos;
        //  3956: goto            3960
        //  3959: athrow         
        //  3960: astore          5
        //  3962: iconst_0       
        //  3963: istore          6
        //  3965: aconst_null    
        //  3966: checkcast       Lnet/minecraft/util/math/BlockPos;
        //  3969: getstatic       dev/nuker/pyro/fc.1:I
        //  3972: ifeq            3981
        //  3975: ldc_w           -1113925221
        //  3978: goto            3984
        //  3981: ldc_w           1390146
        //  3984: ldc_w           2038724726
        //  3987: ixor           
        //  3988: lookupswitch {
        //          -1198318329: 3981
        //          -1004625427: 6861
        //          default: 4016
        //        }
        //  4016: astore          7
        //  4018: iconst_0       
        //  4019: istore          8
        //  4021: aload           5
        //  4023: arraylength    
        //  4024: istore          9
        //  4026: getstatic       dev/nuker/pyro/fc.1:I
        //  4029: ifeq            4038
        //  4032: ldc_w           1365615007
        //  4035: goto            4041
        //  4038: ldc_w           1148495120
        //  4041: ldc_w           -1938641057
        //  4044: ixor           
        //  4045: lookupswitch {
        //          -939128241: 4072
        //          -585691456: 4038
        //          default: 6703
        //        }
        //  4072: iload           8
        //  4074: iload           9
        //  4076: if_icmpge       6531
        //  4079: getstatic       dev/nuker/pyro/fc.c:I
        //  4082: ifge            4091
        //  4085: ldc_w           -1459317817
        //  4088: goto            4094
        //  4091: ldc_w           1922920934
        //  4094: ldc_w           -566187377
        //  4097: ixor           
        //  4098: lookupswitch {
        //          -1394746519: 4124
        //          2000959816: 4091
        //          default: 6807
        //        }
        //  4124: aload           5
        //  4126: getstatic       dev/nuker/pyro/fc.0:I
        //  4129: ifeq            4138
        //  4132: ldc_w           531555401
        //  4135: goto            4141
        //  4138: ldc_w           -744730214
        //  4141: ldc_w           -76112079
        //  4144: ixor           
        //  4145: lookupswitch {
        //          -455574664: 4138
        //          686476971: 4172
        //          default: 6815
        //        }
        //  4172: iload           8
        //  4174: aaload         
        //  4175: astore          10
        //  4177: aload           10
        //  4179: getstatic       dev/nuker/pyro/fc.c:I
        //  4182: ifge            4191
        //  4185: ldc_w           -278711491
        //  4188: goto            4194
        //  4191: ldc_w           -160915277
        //  4194: ldc_w           538433222
        //  4197: ixor           
        //  4198: lookupswitch {
        //          -814422533: 6695
        //          -495926641: 4191
        //          default: 4224
        //        }
        //  4224: goto            4228
        //  4227: athrow         
        //  4228: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //  4231: goto            4235
        //  4234: athrow         
        //  4235: i2d            
        //  4236: getstatic       dev/nuker/pyro/fc.0:I
        //  4239: ifeq            4248
        //  4242: ldc_w           -782115318
        //  4245: goto            4251
        //  4248: ldc_w           -1314138699
        //  4251: ldc_w           -1178760198
        //  4254: ixor           
        //  4255: lookupswitch {
        //          135683663: 4280
        //          1759270384: 4248
        //          default: 6765
        //        }
        //  4280: aload_0        
        //  4281: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  4284: getstatic       dev/nuker/pyro/fc.0:I
        //  4287: ifeq            4296
        //  4290: ldc_w           262197515
        //  4293: goto            4299
        //  4296: ldc_w           1248070921
        //  4299: ldc_w           665383294
        //  4302: ixor           
        //  4303: lookupswitch {
        //          671621237: 4296
        //          1842150519: 4328
        //          default: 6793
        //        }
        //  4328: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4331: getstatic       dev/nuker/pyro/fc.1:I
        //  4334: ifeq            4343
        //  4337: ldc_w           1421447092
        //  4340: goto            4346
        //  4343: ldc_w           -1866557170
        //  4346: ldc_w           -1609550243
        //  4349: ixor           
        //  4350: lookupswitch {
        //          -190203415: 4343
        //          816754515: 4376
        //          default: 6717
        //        }
        //  4376: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  4379: dcmpg          
        //  4380: ifge            4413
        //  4383: aload           10
        //  4385: goto            4389
        //  4388: athrow         
        //  4389: invokevirtual   net/minecraft/util/math/BlockPos.func_177984_a:()Lnet/minecraft/util/math/BlockPos;
        //  4392: goto            4396
        //  4395: athrow         
        //  4396: goto            4400
        //  4399: athrow         
        //  4400: invokestatic    dev/nuker/pyro/fbA.4:(Lnet/minecraft/util/math/BlockPos;)Z
        //  4403: goto            4407
        //  4406: athrow         
        //  4407: ifne            4413
        //  4410: goto            6525
        //  4413: getstatic       dev/nuker/pyro/fc.0:I
        //  4416: ifeq            4425
        //  4419: ldc_w           -525479860
        //  4422: goto            4428
        //  4425: ldc_w           -1617566291
        //  4428: ldc_w           -1586126306
        //  4431: ixor           
        //  4432: lookupswitch {
        //          1054885811: 4460
        //          1104704082: 4425
        //          default: 6833
        //        }
        //  4460: aload_0        
        //  4461: getfield        dev/nuker/pyro/f5E.4:Ldev/nuker/pyro/f0a;
        //  4464: goto            4468
        //  4467: athrow         
        //  4468: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  4471: goto            4475
        //  4474: athrow         
        //  4475: checkcast       Ljava/lang/Boolean;
        //  4478: goto            4482
        //  4481: athrow         
        //  4482: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  4485: goto            4489
        //  4488: athrow         
        //  4489: ifeq            4615
        //  4492: aload_0        
        //  4493: getstatic       dev/nuker/pyro/fc.c:I
        //  4496: ifge            4505
        //  4499: ldc_w           -1556165799
        //  4502: goto            4508
        //  4505: ldc_w           -1912388750
        //  4508: ldc_w           442401962
        //  4511: ixor           
        //  4512: lookupswitch {
        //          -1184870413: 6707
        //          1353170915: 4505
        //          default: 4540
        //        }
        //  4540: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  4543: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  4546: new             Lnet/minecraft/util/math/AxisAlignedBB;
        //  4549: dup            
        //  4550: aload           10
        //  4552: goto            4556
        //  4555: athrow         
        //  4556: invokespecial   net/minecraft/util/math/AxisAlignedBB.<init>:(Lnet/minecraft/util/math/BlockPos;)V
        //  4559: goto            4563
        //  4562: athrow         
        //  4563: goto            4567
        //  4566: athrow         
        //  4567: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_72855_b:(Lnet/minecraft/util/math/AxisAlignedBB;)Z
        //  4570: goto            4574
        //  4573: athrow         
        //  4574: ifne            4583
        //  4577: ldc_w           -1383039951
        //  4580: goto            4586
        //  4583: ldc_w           -1383039946
        //  4586: ldc_w           552029826
        //  4589: ixor           
        //  4590: tableswitch {
        //          451831142: 4612
        //          451831143: 4615
        //          default: 4577
        //        }
        //  4612: goto            6525
        //  4615: getstatic       dev/nuker/pyro/fc.c:I
        //  4618: ifge            4627
        //  4621: ldc_w           -363134866
        //  4624: goto            4630
        //  4627: ldc_w           1255209027
        //  4630: ldc_w           -1326356058
        //  4633: ixor           
        //  4634: lookupswitch {
        //          -98463259: 4660
        //          1521117640: 4627
        //          default: 6731
        //        }
        //  4660: aload           10
        //  4662: goto            4666
        //  4665: athrow         
        //  4666: invokestatic    dev/nuker/pyro/fbA.4:(Lnet/minecraft/util/math/BlockPos;)Z
        //  4669: goto            4673
        //  4672: athrow         
        //  4673: ifeq            6525
        //  4676: iload_3        
        //  4677: ifeq            4857
        //  4680: iload           6
        //  4682: ifne            4857
        //  4685: aload_0        
        //  4686: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  4689: getstatic       dev/nuker/pyro/fc.1:I
        //  4692: ifeq            4701
        //  4695: ldc_w           1648767686
        //  4698: goto            4704
        //  4701: ldc_w           355718688
        //  4704: ldc_w           87226902
        //  4707: ixor           
        //  4708: lookupswitch {
        //          409282840: 4701
        //          1735706832: 6769
        //          default: 4736
        //        }
        //  4736: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4739: getstatic       dev/nuker/pyro/fc.0:I
        //  4742: ifeq            4751
        //  4745: ldc_w           -58845791
        //  4748: goto            4754
        //  4751: ldc_w           1676461827
        //  4754: ldc_w           -995054763
        //  4757: ixor           
        //  4758: lookupswitch {
        //          -1487115178: 4784
        //          953073396: 4751
        //          default: 6847
        //        }
        //  4784: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  4787: getstatic       dev/nuker/pyro/fc.c:I
        //  4790: ifge            4799
        //  4793: ldc_w           612176740
        //  4796: goto            4802
        //  4799: ldc_w           -1292734310
        //  4802: ldc_w           1607892204
        //  4805: ixor           
        //  4806: lookupswitch {
        //          -1681278969: 4799
        //          2074832776: 6749
        //          default: 4832
        //        }
        //  4832: iload_2        
        //  4833: putfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //  4836: aload_0        
        //  4837: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  4840: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  4843: goto            4847
        //  4846: athrow         
        //  4847: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78765_e:()V
        //  4850: goto            4854
        //  4853: athrow         
        //  4854: iconst_1       
        //  4855: istore          6
        //  4857: aload_0        
        //  4858: getfield        dev/nuker/pyro/f5E.5:Ldev/nuker/pyro/f0a;
        //  4861: goto            4865
        //  4864: athrow         
        //  4865: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  4868: goto            4872
        //  4871: athrow         
        //  4872: checkcast       Ljava/lang/Boolean;
        //  4875: getstatic       dev/nuker/pyro/fc.0:I
        //  4878: ifeq            4887
        //  4881: ldc_w           1227462178
        //  4884: goto            4890
        //  4887: ldc_w           1857461044
        //  4890: ldc_w           1441491997
        //  4893: ixor           
        //  4894: lookupswitch {
        //          -836497374: 4887
        //          482540095: 6843
        //          default: 4920
        //        }
        //  4920: goto            4924
        //  4923: athrow         
        //  4924: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  4927: goto            4931
        //  4930: athrow         
        //  4931: ifeq            4940
        //  4934: ldc_w           -566192776
        //  4937: goto            4943
        //  4940: ldc_w           -566192769
        //  4943: ldc_w           -963944101
        //  4946: ixor           
        //  4947: tableswitch {
        //          832038982: 4968
        //          832038983: 4990
        //          default: 4934
        //        }
        //  4968: aload           10
        //  4970: ldc_w           8.0
        //  4973: iconst_1       
        //  4974: iconst_1       
        //  4975: goto            4979
        //  4978: athrow         
        //  4979: invokestatic    dev/nuker/pyro/fby.c:(Lnet/minecraft/util/math/BlockPos;FZZ)Ldev/nuker/pyro/fbw;
        //  4982: goto            4986
        //  4985: athrow         
        //  4986: pop            
        //  4987: goto            6525
        //  4990: new             Lnet/minecraft/util/math/Vec3d;
        //  4993: dup            
        //  4994: aload_0        
        //  4995: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  4998: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  5001: getstatic       dev/nuker/pyro/fc.1:I
        //  5004: ifeq            5013
        //  5007: ldc_w           1637975430
        //  5010: goto            5016
        //  5013: ldc_w           -2115476526
        //  5016: ldc_w           580275371
        //  5019: ixor           
        //  5020: lookupswitch {
        //          206617241: 5013
        //          1127729453: 6803
        //          default: 5048
        //        }
        //  5048: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //  5051: aload_0        
        //  5052: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  5055: getstatic       dev/nuker/pyro/fc.1:I
        //  5058: ifeq            5067
        //  5061: ldc_w           -2118462757
        //  5064: goto            5070
        //  5067: ldc_w           -2030668477
        //  5070: ldc_w           -126843312
        //  5073: ixor           
        //  5074: lookupswitch {
        //          -2025613991: 5067
        //          2043303051: 6709
        //          default: 5100
        //        }
        //  5100: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  5103: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //  5106: aload_0        
        //  5107: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  5110: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  5113: goto            5117
        //  5116: athrow         
        //  5117: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70047_e:()F
        //  5120: goto            5124
        //  5123: athrow         
        //  5124: f2d            
        //  5125: dadd           
        //  5126: aload_0        
        //  5127: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  5130: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  5133: getstatic       dev/nuker/pyro/fc.0:I
        //  5136: ifeq            5145
        //  5139: ldc_w           -701583493
        //  5142: goto            5148
        //  5145: ldc_w           -941739557
        //  5148: ldc_w           -225604061
        //  5151: ixor           
        //  5152: lookupswitch {
        //          614670680: 6853
        //          1324063268: 5145
        //          default: 5180
        //        }
        //  5180: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //  5183: goto            5187
        //  5186: athrow         
        //  5187: invokespecial   net/minecraft/util/math/Vec3d.<init>:(DDD)V
        //  5190: goto            5194
        //  5193: athrow         
        //  5194: astore          11
        //  5196: goto            5200
        //  5199: athrow         
        //  5200: invokestatic    net/minecraft/util/EnumFacing.values:()[Lnet/minecraft/util/EnumFacing;
        //  5203: goto            5207
        //  5206: athrow         
        //  5207: astore          14
        //  5209: aload           14
        //  5211: arraylength    
        //  5212: istore          15
        //  5214: iconst_0       
        //  5215: istore          13
        //  5217: iload           13
        //  5219: iload           15
        //  5221: if_icmpge       6522
        //  5224: aload           14
        //  5226: getstatic       dev/nuker/pyro/fc.c:I
        //  5229: ifge            5238
        //  5232: ldc_w           -994284265
        //  5235: goto            5241
        //  5238: ldc_w           -2014307346
        //  5241: ldc_w           451468664
        //  5244: ixor           
        //  5245: lookupswitch {
        //          -1659320682: 5272
        //          -564875153: 5238
        //          default: 6879
        //        }
        //  5272: iload           13
        //  5274: aaload         
        //  5275: astore          12
        //  5277: aload           10
        //  5279: aload           12
        //  5281: goto            5285
        //  5284: athrow         
        //  5285: invokevirtual   net/minecraft/util/math/BlockPos.func_177972_a:(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;
        //  5288: goto            5292
        //  5291: athrow         
        //  5292: astore          16
        //  5294: aload           12
        //  5296: goto            5300
        //  5299: athrow         
        //  5300: invokevirtual   net/minecraft/util/EnumFacing.func_176734_d:()Lnet/minecraft/util/EnumFacing;
        //  5303: goto            5307
        //  5306: athrow         
        //  5307: astore          17
        //  5309: aload_0        
        //  5310: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  5313: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  5316: aload           16
        //  5318: getstatic       dev/nuker/pyro/fc.1:I
        //  5321: ifeq            5330
        //  5324: ldc_w           -475187279
        //  5327: goto            5333
        //  5330: ldc_w           308969074
        //  5333: ldc_w           -537765069
        //  5336: ixor           
        //  5337: lookupswitch {
        //          -793646166: 5330
        //          1012886658: 6859
        //          default: 5364
        //        }
        //  5364: goto            5368
        //  5367: athrow         
        //  5368: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  5371: goto            5375
        //  5374: athrow         
        //  5375: dup            
        //  5376: pop            
        //  5377: getstatic       dev/nuker/pyro/fc.c:I
        //  5380: ifge            5389
        //  5383: ldc_w           109384098
        //  5386: goto            5392
        //  5389: ldc_w           1196579772
        //  5392: ldc_w           -917700228
        //  5395: ixor           
        //  5396: lookupswitch {
        //          -808972066: 6855
        //          653661564: 5389
        //          default: 5424
        //        }
        //  5424: goto            5428
        //  5427: athrow         
        //  5428: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //  5433: goto            5437
        //  5436: athrow         
        //  5437: aload_0        
        //  5438: getstatic       dev/nuker/pyro/fc.c:I
        //  5441: ifge            5450
        //  5444: ldc_w           -1286172385
        //  5447: goto            5453
        //  5450: ldc_w           1582156731
        //  5453: ldc_w           1830781989
        //  5456: ixor           
        //  5457: lookupswitch {
        //          -565635782: 5450
        //          861032350: 5484
        //          default: 6801
        //        }
        //  5484: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  5487: getstatic       dev/nuker/pyro/fc.0:I
        //  5490: ifeq            5499
        //  5493: ldc_w           257893766
        //  5496: goto            5502
        //  5499: ldc_w           -558017536
        //  5502: ldc_w           624400890
        //  5505: ixor           
        //  5506: lookupswitch {
        //          711507068: 6851
        //          1481530425: 5499
        //          default: 5532
        //        }
        //  5532: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  5535: aload           16
        //  5537: goto            5541
        //  5540: athrow         
        //  5541: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //  5544: goto            5548
        //  5547: athrow         
        //  5548: iconst_0       
        //  5549: getstatic       dev/nuker/pyro/fc.0:I
        //  5552: ifeq            5561
        //  5555: ldc_w           902784889
        //  5558: goto            5564
        //  5561: ldc_w           941371767
        //  5564: ldc_w           -1356277820
        //  5567: ixor           
        //  5568: lookupswitch {
        //          -1696091971: 6885
        //          541472698: 5561
        //          default: 5596
        //        }
        //  5596: goto            5600
        //  5599: athrow         
        //  5600: invokevirtual   net/minecraft/block/Block.func_176209_a:(Lnet/minecraft/block/state/IBlockState;Z)Z
        //  5603: goto            5607
        //  5606: athrow         
        //  5607: ifeq            6516
        //  5610: new             Lnet/minecraft/util/math/Vec3d;
        //  5613: dup            
        //  5614: aload           16
        //  5616: checkcast       Lnet/minecraft/util/math/Vec3i;
        //  5619: goto            5623
        //  5622: athrow         
        //  5623: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //  5626: goto            5630
        //  5629: athrow         
        //  5630: ldc2_w          0.5
        //  5633: ldc2_w          0.5
        //  5636: ldc2_w          0.5
        //  5639: goto            5643
        //  5642: athrow         
        //  5643: invokevirtual   net/minecraft/util/math/Vec3d.func_72441_c:(DDD)Lnet/minecraft/util/math/Vec3d;
        //  5646: goto            5650
        //  5649: athrow         
        //  5650: new             Lnet/minecraft/util/math/Vec3d;
        //  5653: dup            
        //  5654: aload           17
        //  5656: dup            
        //  5657: pop            
        //  5658: goto            5662
        //  5661: athrow         
        //  5662: invokevirtual   net/minecraft/util/EnumFacing.func_176730_m:()Lnet/minecraft/util/math/Vec3i;
        //  5665: goto            5669
        //  5668: athrow         
        //  5669: goto            5673
        //  5672: athrow         
        //  5673: invokespecial   net/minecraft/util/math/Vec3d.<init>:(Lnet/minecraft/util/math/Vec3i;)V
        //  5676: goto            5680
        //  5679: athrow         
        //  5680: ldc2_w          0.5
        //  5683: goto            5687
        //  5686: athrow         
        //  5687: invokevirtual   net/minecraft/util/math/Vec3d.func_186678_a:(D)Lnet/minecraft/util/math/Vec3d;
        //  5690: goto            5694
        //  5693: athrow         
        //  5694: getstatic       dev/nuker/pyro/fc.1:I
        //  5697: ifeq            5706
        //  5700: ldc_w           250025944
        //  5703: goto            5709
        //  5706: ldc_w           1692996127
        //  5709: ldc_w           -1342490465
        //  5712: ixor           
        //  5713: lookupswitch {
        //          -1591988409: 6701
        //          1838825789: 5706
        //          default: 5740
        //        }
        //  5740: goto            5744
        //  5743: athrow         
        //  5744: invokevirtual   net/minecraft/util/math/Vec3d.func_178787_e:(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
        //  5747: goto            5751
        //  5750: athrow         
        //  5751: astore          18
        //  5753: aload           11
        //  5755: aload           18
        //  5757: goto            5761
        //  5760: athrow         
        //  5761: invokevirtual   net/minecraft/util/math/Vec3d.func_72438_d:(Lnet/minecraft/util/math/Vec3d;)D
        //  5764: goto            5768
        //  5767: athrow         
        //  5768: ldc_w           8.0
        //  5771: f2d            
        //  5772: dcmpg          
        //  5773: ifgt            6516
        //  5776: getstatic       dev/nuker/pyro/fc.1:I
        //  5779: ifeq            5788
        //  5782: ldc_w           2013040050
        //  5785: goto            5791
        //  5788: ldc_w           -778466654
        //  5791: ldc_w           1262392967
        //  5794: ixor           
        //  5795: lookupswitch {
        //          -1700324315: 5820
        //          1019353909: 5788
        //          default: 6811
        //        }
        //  5820: aload           10
        //  5822: getstatic       dev/nuker/pyro/fc.c:I
        //  5825: ifge            5834
        //  5828: ldc_w           396785688
        //  5831: goto            5837
        //  5834: ldc_w           534490463
        //  5837: ldc_w           709784247
        //  5840: ixor           
        //  5841: lookupswitch {
        //          1038617263: 6763
        //          1064401227: 5834
        //          default: 5868
        //        }
        //  5868: astore          7
        //  5870: getstatic       dev/nuker/pyro/fc.0:I
        //  5873: ifeq            5882
        //  5876: ldc_w           448139654
        //  5879: goto            5885
        //  5882: ldc_w           6070436
        //  5885: ldc_w           128734824
        //  5888: ixor           
        //  5889: lookupswitch {
        //          133232332: 5916
        //          488261614: 5882
        //          default: 6697
        //        }
        //  5916: aload_1        
        //  5917: goto            5921
        //  5920: athrow         
        //  5921: invokevirtual   dev/nuker/pyro/f3i.c:()V
        //  5924: goto            5928
        //  5927: athrow         
        //  5928: getstatic       dev/nuker/pyro/fc.0:I
        //  5931: ifeq            5940
        //  5934: ldc_w           -2007660624
        //  5937: goto            5943
        //  5940: ldc_w           758063391
        //  5943: ldc_w           -1711299388
        //  5946: ixor           
        //  5947: lookupswitch {
        //          -1261402661: 5972
        //          296362868: 5940
        //          default: 6755
        //        }
        //  5972: aload           10
        //  5974: goto            5978
        //  5977: athrow         
        //  5978: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //  5981: goto            5985
        //  5984: athrow         
        //  5985: getstatic       dev/nuker/pyro/fc.c:I
        //  5988: ifge            5997
        //  5991: ldc_w           -1169188289
        //  5994: goto            6000
        //  5997: ldc_w           1050785996
        //  6000: ldc_w           -333528844
        //  6003: ixor           
        //  6004: lookupswitch {
        //          739961541: 5997
        //          1448172235: 6791
        //          default: 6032
        //        }
        //  6032: aload           10
        //  6034: getstatic       dev/nuker/pyro/fc.0:I
        //  6037: ifeq            6046
        //  6040: ldc_w           -1752879694
        //  6043: goto            6049
        //  6046: ldc_w           349883538
        //  6049: ldc_w           -664814422
        //  6052: ixor           
        //  6053: lookupswitch {
        //          -863670216: 6080
        //          1339724056: 6046
        //          default: 6817
        //        }
        //  6080: goto            6084
        //  6083: athrow         
        //  6084: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //  6087: goto            6091
        //  6090: athrow         
        //  6091: aload           10
        //  6093: getstatic       dev/nuker/pyro/fc.1:I
        //  6096: ifeq            6105
        //  6099: ldc_w           -862706327
        //  6102: goto            6108
        //  6105: ldc_w           -1044287281
        //  6108: ldc_w           560563157
        //  6111: ixor           
        //  6112: lookupswitch {
        //          -713216151: 6105
        //          -302143812: 6783
        //          default: 6140
        //        }
        //  6140: goto            6144
        //  6143: athrow         
        //  6144: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //  6147: goto            6151
        //  6150: athrow         
        //  6151: getstatic       dev/nuker/pyro/fc.c:I
        //  6154: ifge            6163
        //  6157: ldc_w           -1302014562
        //  6160: goto            6166
        //  6163: ldc_w           299750594
        //  6166: ldc_w           622391788
        //  6169: ixor           
        //  6170: lookupswitch {
        //          -1753471886: 6839
        //          352405056: 6163
        //          default: 6196
        //        }
        //  6196: aload           12
        //  6198: goto            6202
        //  6201: athrow         
        //  6202: invokestatic    dev/nuker/pyro/fby.c:(IIILnet/minecraft/util/EnumFacing;)[F
        //  6205: goto            6209
        //  6208: athrow         
        //  6209: astore          19
        //  6211: getstatic       dev/nuker/pyro/fc.c:I
        //  6214: ifge            6223
        //  6217: ldc_w           503854497
        //  6220: goto            6226
        //  6223: ldc_w           1958399258
        //  6226: ldc_w           597065312
        //  6229: ixor           
        //  6230: lookupswitch {
        //          -613803156: 6223
        //          1033784257: 6857
        //          default: 6256
        //        }
        //  6256: aload_1        
        //  6257: aload           19
        //  6259: iconst_0       
        //  6260: faload         
        //  6261: getstatic       dev/nuker/pyro/fc.0:I
        //  6264: ifeq            6273
        //  6267: ldc_w           -1543593571
        //  6270: goto            6276
        //  6273: ldc_w           -407747265
        //  6276: ldc_w           1404687815
        //  6279: ixor           
        //  6280: lookupswitch {
        //          -1274310408: 6308
        //          -263752614: 6273
        //          default: 6745
        //        }
        //  6308: goto            6312
        //  6311: athrow         
        //  6312: invokevirtual   dev/nuker/pyro/f3i.c:(F)V
        //  6315: goto            6319
        //  6318: athrow         
        //  6319: aload_1        
        //  6320: aload           19
        //  6322: iconst_1       
        //  6323: faload         
        //  6324: getstatic       dev/nuker/pyro/fc.1:I
        //  6327: ifeq            6336
        //  6330: ldc_w           2023665124
        //  6333: goto            6339
        //  6336: ldc_w           -1988285143
        //  6339: ldc_w           -1211763883
        //  6342: ixor           
        //  6343: lookupswitch {
        //          -816095567: 6336
        //          1052302972: 6368
        //          default: 6713
        //        }
        //  6368: goto            6372
        //  6371: athrow         
        //  6372: invokevirtual   dev/nuker/pyro/f3i.0:(F)V
        //  6375: goto            6379
        //  6378: athrow         
        //  6379: iload           6
        //  6381: istore          20
        //  6383: aload           7
        //  6385: astore          21
        //  6387: aload_1        
        //  6388: new             Ldev/nuker/pyro/f5D;
        //  6391: dup            
        //  6392: aload_0        
        //  6393: aload           21
        //  6395: getstatic       dev/nuker/pyro/fc.0:I
        //  6398: ifeq            6407
        //  6401: ldc_w           1613007937
        //  6404: goto            6410
        //  6407: ldc_w           537254065
        //  6410: ldc_w           -1610607998
        //  6413: ixor           
        //  6414: lookupswitch {
        //          -2147104205: 6440
        //          -1071341885: 6407
        //          default: 6751
        //        }
        //  6440: iload           20
        //  6442: getstatic       dev/nuker/pyro/fc.0:I
        //  6445: ifeq            6454
        //  6448: ldc_w           545124281
        //  6451: goto            6457
        //  6454: ldc_w           548520377
        //  6457: ldc_w           2127947905
        //  6460: ixor           
        //  6461: lookupswitch {
        //          942937146: 6454
        //          1588070200: 6715
        //          default: 6488
        //        }
        //  6488: iload           4
        //  6490: goto            6494
        //  6493: athrow         
        //  6494: invokespecial   dev/nuker/pyro/f5D.<init>:(Ldev/nuker/pyro/f5E;Lnet/minecraft/util/math/BlockPos;ZI)V
        //  6497: goto            6501
        //  6500: athrow         
        //  6501: checkcast       Ljava/util/function/Consumer;
        //  6504: goto            6508
        //  6507: athrow         
        //  6508: invokevirtual   dev/nuker/pyro/f3i.c:(Ljava/util/function/Consumer;)V
        //  6511: goto            6515
        //  6514: athrow         
        //  6515: return         
        //  6516: iinc            13, 1
        //  6519: goto            5217
        //  6522: goto            6531
        //  6525: iinc            8, 1
        //  6528: goto            4026
        //  6531: iload           6
        //  6533: ifeq            6542
        //  6536: ldc_w           -1086664602
        //  6539: goto            6545
        //  6542: ldc_w           -1086664601
        //  6545: ldc_w           -367596900
        //  6548: ixor           
        //  6549: tableswitch {
        //          -1437043212: 6572
        //          -1437043211: 6694
        //          default: 6536
        //        }
        //  6572: aload_0        
        //  6573: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  6576: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  6579: getstatic       dev/nuker/pyro/fc.0:I
        //  6582: ifeq            6591
        //  6585: ldc_w           571048288
        //  6588: goto            6594
        //  6591: ldc_w           1986918619
        //  6594: ldc_w           -1541510388
        //  6597: ixor           
        //  6598: lookupswitch {
        //          -2045253012: 6591
        //          -764177449: 6624
        //          default: 6869
        //        }
        //  6624: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  6627: iload           4
        //  6629: putfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //  6632: getstatic       dev/nuker/pyro/fc.0:I
        //  6635: ifeq            6644
        //  6638: ldc_w           -1253803781
        //  6641: goto            6647
        //  6644: ldc_w           1893576893
        //  6647: ldc_w           -1554867979
        //  6650: ixor           
        //  6651: lookupswitch {
        //          370597902: 6785
        //          1269699811: 6644
        //          default: 6676
        //        }
        //  6676: aload_0        
        //  6677: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //  6680: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  6683: goto            6687
        //  6686: athrow         
        //  6687: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78765_e:()V
        //  6690: goto            6694
        //  6693: athrow         
        //  6694: return         
        //  6695: aconst_null    
        //  6696: athrow         
        //  6697: aconst_null    
        //  6698: athrow         
        //  6699: aconst_null    
        //  6700: athrow         
        //  6701: aconst_null    
        //  6702: athrow         
        //  6703: aconst_null    
        //  6704: athrow         
        //  6705: aconst_null    
        //  6706: athrow         
        //  6707: aconst_null    
        //  6708: athrow         
        //  6709: aconst_null    
        //  6710: athrow         
        //  6711: aconst_null    
        //  6712: athrow         
        //  6713: aconst_null    
        //  6714: athrow         
        //  6715: aconst_null    
        //  6716: athrow         
        //  6717: aconst_null    
        //  6718: athrow         
        //  6719: aconst_null    
        //  6720: athrow         
        //  6721: aconst_null    
        //  6722: athrow         
        //  6723: aconst_null    
        //  6724: athrow         
        //  6725: aconst_null    
        //  6726: athrow         
        //  6727: aconst_null    
        //  6728: athrow         
        //  6729: aconst_null    
        //  6730: athrow         
        //  6731: aconst_null    
        //  6732: athrow         
        //  6733: aconst_null    
        //  6734: athrow         
        //  6735: aconst_null    
        //  6736: athrow         
        //  6737: aconst_null    
        //  6738: athrow         
        //  6739: aconst_null    
        //  6740: athrow         
        //  6741: aconst_null    
        //  6742: athrow         
        //  6743: aconst_null    
        //  6744: athrow         
        //  6745: aconst_null    
        //  6746: athrow         
        //  6747: aconst_null    
        //  6748: athrow         
        //  6749: aconst_null    
        //  6750: athrow         
        //  6751: aconst_null    
        //  6752: athrow         
        //  6753: aconst_null    
        //  6754: athrow         
        //  6755: aconst_null    
        //  6756: athrow         
        //  6757: aconst_null    
        //  6758: athrow         
        //  6759: aconst_null    
        //  6760: athrow         
        //  6761: aconst_null    
        //  6762: athrow         
        //  6763: aconst_null    
        //  6764: athrow         
        //  6765: aconst_null    
        //  6766: athrow         
        //  6767: aconst_null    
        //  6768: athrow         
        //  6769: aconst_null    
        //  6770: athrow         
        //  6771: aconst_null    
        //  6772: athrow         
        //  6773: aconst_null    
        //  6774: athrow         
        //  6775: aconst_null    
        //  6776: athrow         
        //  6777: aconst_null    
        //  6778: athrow         
        //  6779: aconst_null    
        //  6780: athrow         
        //  6781: aconst_null    
        //  6782: athrow         
        //  6783: aconst_null    
        //  6784: athrow         
        //  6785: aconst_null    
        //  6786: athrow         
        //  6787: aconst_null    
        //  6788: athrow         
        //  6789: aconst_null    
        //  6790: athrow         
        //  6791: aconst_null    
        //  6792: athrow         
        //  6793: aconst_null    
        //  6794: athrow         
        //  6795: aconst_null    
        //  6796: athrow         
        //  6797: aconst_null    
        //  6798: athrow         
        //  6799: aconst_null    
        //  6800: athrow         
        //  6801: aconst_null    
        //  6802: athrow         
        //  6803: aconst_null    
        //  6804: athrow         
        //  6805: aconst_null    
        //  6806: athrow         
        //  6807: aconst_null    
        //  6808: athrow         
        //  6809: aconst_null    
        //  6810: athrow         
        //  6811: aconst_null    
        //  6812: athrow         
        //  6813: aconst_null    
        //  6814: athrow         
        //  6815: aconst_null    
        //  6816: athrow         
        //  6817: aconst_null    
        //  6818: athrow         
        //  6819: aconst_null    
        //  6820: athrow         
        //  6821: aconst_null    
        //  6822: athrow         
        //  6823: aconst_null    
        //  6824: athrow         
        //  6825: aconst_null    
        //  6826: athrow         
        //  6827: aconst_null    
        //  6828: athrow         
        //  6829: aconst_null    
        //  6830: athrow         
        //  6831: aconst_null    
        //  6832: athrow         
        //  6833: aconst_null    
        //  6834: athrow         
        //  6835: aconst_null    
        //  6836: athrow         
        //  6837: aconst_null    
        //  6838: athrow         
        //  6839: aconst_null    
        //  6840: athrow         
        //  6841: aconst_null    
        //  6842: athrow         
        //  6843: aconst_null    
        //  6844: athrow         
        //  6845: aconst_null    
        //  6846: athrow         
        //  6847: aconst_null    
        //  6848: athrow         
        //  6849: aconst_null    
        //  6850: athrow         
        //  6851: aconst_null    
        //  6852: athrow         
        //  6853: aconst_null    
        //  6854: athrow         
        //  6855: aconst_null    
        //  6856: athrow         
        //  6857: aconst_null    
        //  6858: athrow         
        //  6859: aconst_null    
        //  6860: athrow         
        //  6861: aconst_null    
        //  6862: athrow         
        //  6863: aconst_null    
        //  6864: athrow         
        //  6865: aconst_null    
        //  6866: athrow         
        //  6867: aconst_null    
        //  6868: athrow         
        //  6869: aconst_null    
        //  6870: athrow         
        //  6871: aconst_null    
        //  6872: athrow         
        //  6873: aconst_null    
        //  6874: athrow         
        //  6875: aconst_null    
        //  6876: athrow         
        //  6877: aconst_null    
        //  6878: athrow         
        //  6879: aconst_null    
        //  6880: athrow         
        //  6881: aconst_null    
        //  6882: athrow         
        //  6883: aconst_null    
        //  6884: athrow         
        //  6885: aconst_null    
        //  6886: athrow         
        //  6887: pop            
        //  6888: goto            24
        //  6891: pop            
        //  6892: aconst_null    
        //  6893: goto            6887
        //  6896: dup            
        //  6897: ifnull          6887
        //  6900: checkcast       Ljava/lang/Throwable;
        //  6903: athrow         
        //  6904: dup            
        //  6905: ifnull          6891
        //  6908: checkcast       Ljava/lang/Throwable;
        //  6911: athrow         
        //  6912: aconst_null    
        //  6913: athrow         
        //    StackMapTable: 03 30 43 07 00 41 04 FF 00 0B 00 00 00 01 07 00 41 FD 00 03 07 00 03 07 01 46 0D 42 01 1E 43 07 00 41 40 07 01 46 45 07 00 41 40 07 01 4B 06 0B 42 01 1D FF 00 11 00 02 07 00 03 07 01 46 00 03 07 00 03 07 00 03 07 01 59 FF 00 02 00 02 07 00 03 07 01 46 00 04 07 00 03 07 00 03 07 01 59 01 FF 00 1E 00 02 07 00 03 07 01 46 00 03 07 00 03 07 00 03 07 01 59 4A 07 00 41 FF 00 00 00 02 07 00 03 07 01 46 00 03 07 00 03 07 00 03 07 00 4A 45 07 00 41 FF 00 00 00 02 07 00 03 07 01 46 00 02 07 00 03 07 00 70 0E 42 01 1E 4C 07 00 03 FF 00 02 00 02 07 00 03 07 01 46 00 02 07 00 03 01 5F 07 00 03 FF 00 0A 00 00 00 01 07 00 41 FF 00 00 00 02 07 00 03 07 01 46 00 02 07 00 03 07 00 70 45 07 00 41 FF 00 00 00 02 07 00 03 07 01 46 00 02 07 00 03 07 00 70 FC 00 13 01 42 01 1D 4A 07 00 81 40 07 00 70 45 07 00 41 40 07 00 70 4C 01 FF 00 02 00 03 07 00 03 07 01 46 01 00 02 01 01 5C 01 FC 00 00 01 10 42 01 1E FF 00 16 00 04 07 00 03 07 01 46 01 01 00 02 07 03 BC 07 03 BE FF 00 02 00 04 07 00 03 07 01 46 01 01 00 03 07 03 BC 07 03 BE 01 FF 00 1D 00 04 07 00 03 07 01 46 01 01 00 02 07 03 BC 07 03 BE 42 07 00 30 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 03 BC 07 03 BE 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 03 BC 07 03 BE FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 03 BC 07 03 BE 45 07 00 41 40 07 03 BC 4B 07 03 BC FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 07 03 BC 01 5E 07 03 BC FF 00 0C 00 04 07 00 03 07 01 46 01 01 00 02 07 03 BC 01 FF 00 02 00 04 07 00 03 07 01 46 01 01 00 03 07 03 BC 01 01 FF 00 1F 00 04 07 00 03 07 01 46 01 01 00 02 07 03 BC 01 4A 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 03 07 03 BC 01 07 00 70 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 03 07 03 BC 01 07 00 70 FF 00 0B 00 04 07 00 03 07 01 46 01 01 00 03 07 03 BC 01 07 00 70 FF 00 02 00 04 07 00 03 07 01 46 01 01 00 04 07 03 BC 01 07 00 70 01 FF 00 1D 00 04 07 00 03 07 01 46 01 01 00 03 07 03 BC 01 07 00 70 44 07 00 36 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 03 07 03 BC 01 07 00 43 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 03 07 03 BC 01 01 FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 07 03 BC 01 FF 00 05 00 04 07 00 03 07 01 46 01 01 00 02 07 03 BC 01 FF 00 02 00 04 07 00 03 07 01 46 01 01 00 03 07 03 BC 01 01 FF 00 1A 00 04 07 00 03 07 01 46 01 01 00 02 07 03 BC 01 FF 00 03 00 04 07 00 03 07 01 46 01 01 00 02 07 03 BC 01 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 03 07 03 BC 01 01 06 4F 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 00 03 07 00 4A 45 07 00 41 40 01 02 05 42 01 1B FF 00 06 00 00 00 01 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 01 07 00 9B 45 07 00 41 40 07 01 17 4E 07 00 A0 FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 07 00 A0 01 5E 07 00 A0 FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 01 07 00 A0 45 07 00 41 40 01 02 05 42 01 18 47 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 01 AA 01 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 01 AA 07 00 A0 42 07 00 89 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 01 AA 07 00 A0 45 07 00 41 00 00 12 42 01 1D 4F 07 01 59 FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 07 01 59 01 5C 07 01 59 4E 07 01 BA FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 07 01 BA 01 5D 07 01 BA 05 05 42 01 18 04 12 42 01 1C 4C 07 00 03 FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 07 00 03 01 5F 07 00 03 4E 07 01 59 FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 07 01 59 01 5D 07 01 59 4E 07 01 BA FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 07 01 BA 01 5D 07 01 BA 4C 07 00 41 40 07 00 9B 45 07 00 41 40 07 01 17 45 07 00 41 40 07 00 A0 45 07 00 41 40 01 4A 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 01 AA 01 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 01 AA 07 00 A0 FF 00 0B 00 04 07 00 03 07 01 46 01 01 00 02 07 01 AA 07 00 A0 FF 00 02 00 04 07 00 03 07 01 46 01 01 00 03 07 01 AA 07 00 A0 01 FF 00 1E 00 04 07 00 03 07 01 46 01 01 00 02 07 01 AA 07 00 A0 42 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 01 AA 07 00 A0 45 07 00 41 00 49 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 08 05 DA 08 05 DA 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 01 D3 07 01 D9 FF 00 0E 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 01 DD FF 00 02 00 04 07 00 03 07 01 46 01 01 00 04 07 01 D3 07 01 D9 07 01 DD 01 FF 00 1C 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 01 DD 42 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 01 DD 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 03 BE 42 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 03 BE 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 01 D3 07 01 D9 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 03 BE 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 03 BE FF 00 0B 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 03 BE FF 00 02 00 04 07 00 03 07 01 46 01 01 00 04 07 01 D3 07 01 D9 07 03 BE 01 FF 00 1C 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 03 BE 42 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 03 BE 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 01 D3 07 01 D9 FF 00 0B 00 04 07 00 03 07 01 46 01 01 00 02 07 01 D3 07 01 D9 FF 00 02 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 01 FF 00 1D 00 04 07 00 03 07 01 46 01 01 00 02 07 01 D3 07 01 D9 FF 00 0E 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 01 DD FF 00 02 00 04 07 00 03 07 01 46 01 01 00 04 07 01 D3 07 01 D9 07 01 DD 01 FF 00 1D 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 01 DD 42 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 01 DD 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 01 D3 07 01 D9 45 07 00 36 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 03 BE 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 03 BE 42 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 03 BE 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 01 D3 07 01 D9 42 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 01 D3 07 01 D9 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 01 D3 07 03 BE FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 01 D3 07 03 BE 45 07 00 41 00 00 FF 00 06 00 00 00 01 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 01 07 00 9B 45 07 00 41 40 07 01 17 45 07 00 41 40 07 00 A0 45 07 00 41 40 01 52 07 02 0C FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 07 02 0C 01 5D 07 02 0C 05 05 42 01 18 4F 07 02 0C FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 07 02 0C 01 5C 07 02 0C FF 00 12 00 04 07 00 03 07 01 46 01 01 00 02 03 07 01 59 FF 00 02 00 04 07 00 03 07 01 46 01 01 00 03 03 07 01 59 01 FF 00 1D 00 04 07 00 03 07 01 46 01 01 00 02 03 07 01 59 49 07 00 8B 40 03 45 07 00 41 40 03 FF 00 0C 00 03 07 00 03 07 01 46 03 00 00 42 01 1D 5D 03 FF 00 02 00 03 07 00 03 07 01 46 03 00 02 03 01 5E 03 42 07 00 41 40 03 45 07 00 41 40 03 FC 00 12 03 05 42 01 18 09 FF 00 13 00 04 07 00 03 07 01 46 03 03 00 02 03 07 00 03 FF 00 02 00 04 07 00 03 07 01 46 03 03 00 03 03 07 00 03 01 FF 00 1E 00 04 07 00 03 07 01 46 03 03 00 02 03 07 00 03 55 03 FF 00 02 00 04 07 00 03 07 01 46 03 03 00 02 03 01 5E 03 FF 00 14 00 05 07 00 03 07 01 46 03 03 03 00 01 03 FF 00 02 00 05 07 00 03 07 01 46 03 03 03 00 02 03 01 5F 03 FF 00 12 00 05 07 00 03 07 01 46 03 03 03 00 02 03 07 01 BA FF 00 02 00 05 07 00 03 07 01 46 03 03 03 00 03 03 07 01 BA 01 FF 00 1D 00 05 07 00 03 07 01 46 03 03 03 00 02 03 07 01 BA FC 00 11 03 42 01 1E 4F 07 01 59 FF 00 02 00 06 07 00 03 07 01 46 03 03 03 03 00 02 07 01 59 01 5C 07 01 59 FF 00 22 00 06 07 00 03 07 01 46 03 03 03 03 00 02 07 01 BA 03 FF 00 02 00 06 07 00 03 07 01 46 03 03 03 03 00 03 07 01 BA 03 01 FF 00 1D 00 06 07 00 03 07 01 46 03 03 03 03 00 02 07 01 BA 03 FF 00 02 00 02 07 00 03 07 01 46 00 00 4C 01 FF 00 02 00 02 07 00 03 07 01 46 00 02 01 01 5C 01 FF 00 0D 00 03 07 00 03 07 01 46 01 00 01 01 FF 00 02 00 03 07 00 03 07 01 46 01 00 02 01 01 5E 01 FF 00 10 00 04 07 00 03 07 01 46 01 01 00 01 07 01 59 FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 07 01 59 01 5F 07 01 59 47 07 00 38 40 07 01 BA 45 07 00 41 40 07 02 5E 4D 07 02 5E FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 07 02 5E 01 5E 07 02 5E 42 07 00 8B 40 07 02 5E 45 07 00 41 40 01 02 05 42 01 18 4B 07 00 81 40 07 01 BA 45 07 00 41 40 07 02 5E 44 07 00 41 40 07 02 5E 45 07 00 41 40 07 03 C0 52 07 00 03 FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 07 00 03 01 5C 07 00 03 4A 07 00 41 40 07 01 BA 45 07 00 41 40 07 02 5E 44 07 00 41 40 07 02 5E 45 07 00 41 40 07 03 C0 4D 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 04 07 03 C0 08 0B B0 08 0B B0 07 03 BE 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 04 07 03 C0 08 0B B0 08 0B B0 07 03 BE FF 00 0B 00 04 07 00 03 07 01 46 01 01 00 04 07 03 C0 08 0B B0 08 0B B0 07 03 BE FF 00 02 00 04 07 00 03 07 01 46 01 01 00 05 07 03 C0 08 0B B0 08 0B B0 07 03 BE 01 FF 00 1E 00 04 07 00 03 07 01 46 01 01 00 04 07 03 C0 08 0B B0 08 0B B0 07 03 BE 42 07 00 7D FF 00 00 00 04 07 00 03 07 01 46 01 01 00 04 07 03 C0 08 0B B0 08 0B B0 07 03 BE 45 07 00 41 FF 00 00 00 04 07 00 03 07 01 46 01 01 00 02 07 03 C0 07 02 6F 40 07 03 C0 FF 00 09 00 05 07 00 03 07 01 46 01 01 07 02 6A 00 01 07 00 3A 40 07 02 6A 45 07 00 41 40 07 03 4F 4B 07 03 4F FF 00 02 00 05 07 00 03 07 01 46 01 01 07 02 6A 00 02 07 03 4F 01 5E 07 03 4F 45 07 00 41 FF 00 00 00 05 07 00 03 07 01 46 01 01 07 02 6A 00 02 07 03 4F 07 03 4F 45 07 00 41 40 01 FA 00 04 FD 00 0A 01 01 0B 42 01 1E 56 07 01 59 FF 00 02 00 06 07 00 03 07 01 46 01 01 01 01 00 02 07 01 59 01 5D 07 01 59 51 07 02 99 FF 00 02 00 06 07 00 03 07 01 46 01 01 01 01 00 02 07 02 99 01 5E 07 02 99 FF 00 0D 00 06 07 00 03 07 01 46 01 01 01 01 00 02 07 02 99 01 FF 00 02 00 06 07 00 03 07 01 46 01 01 01 01 00 03 07 02 99 01 01 FF 00 1E 00 06 07 00 03 07 01 46 01 01 01 01 00 02 07 02 99 01 42 07 00 41 FF 00 00 00 06 07 00 03 07 01 46 01 01 01 01 00 02 07 02 99 01 45 07 00 41 40 07 02 5E 44 07 00 7D 40 07 02 5E 45 07 00 41 40 07 03 C0 55 07 01 59 FF 00 02 00 06 07 00 03 07 01 46 01 01 01 01 00 02 07 01 59 01 5E 07 01 59 FF 00 0A 00 00 00 01 07 00 41 FF 00 00 00 06 07 00 03 07 01 46 01 01 01 01 00 02 07 02 99 01 45 07 00 41 40 07 02 5E 44 07 00 41 40 07 02 5E 45 07 00 41 40 07 03 C0 4D 07 00 41 FF 00 00 00 06 07 00 03 07 01 46 01 01 01 01 00 04 07 03 C0 08 0D 98 08 0D 98 07 03 BE 45 07 00 41 FF 00 00 00 06 07 00 03 07 01 46 01 01 01 01 00 04 07 03 C0 08 0D 98 08 0D 98 07 03 BE FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 06 07 00 03 07 01 46 01 01 01 01 00 04 07 03 C0 08 0D 98 08 0D 98 07 03 BE 45 07 00 41 FF 00 00 00 06 07 00 03 07 01 46 01 01 01 01 00 02 07 03 C0 07 02 6F 40 07 03 C0 FF 00 12 00 07 07 00 03 07 01 46 01 01 01 01 07 02 6A 00 01 07 02 6A FF 00 02 00 07 07 00 03 07 01 46 01 01 01 01 07 02 6A 00 02 07 02 6A 01 5F 07 02 6A 42 07 00 7F 40 07 02 6A 45 07 00 41 40 07 03 4F FF 00 0E 00 07 07 00 03 07 01 46 01 01 01 01 07 02 6A 00 02 07 03 4F 07 03 4F FF 00 02 00 07 07 00 03 07 01 46 01 01 01 01 07 02 6A 00 03 07 03 4F 07 03 4F 01 FF 00 1E 00 07 07 00 03 07 01 46 01 01 01 01 07 02 6A 00 02 07 03 4F 07 03 4F 42 07 00 41 FF 00 00 00 07 07 00 03 07 01 46 01 01 01 01 07 02 6A 00 02 07 03 4F 07 03 4F 45 07 00 41 40 01 FA 00 08 05 04 05 42 01 1B F9 00 00 4C 07 00 03 FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 07 00 03 01 5E 07 00 03 4E 07 01 59 FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 07 01 59 01 5D 07 01 59 4E 07 01 BA FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 07 01 BA 01 5D 07 01 BA 51 01 FF 00 02 00 04 07 00 03 07 01 46 01 01 00 02 01 01 5E 01 FC 00 0D 01 42 01 1E FF 00 0F 00 00 00 01 07 00 41 FF 00 00 00 05 07 00 03 07 01 46 01 01 01 00 02 07 00 03 07 00 4A 45 07 00 41 40 07 00 70 FF 00 14 00 07 07 00 03 07 01 46 01 01 01 07 00 70 01 00 01 07 00 43 FF 00 02 00 07 07 00 03 07 01 46 01 01 01 07 00 70 01 00 02 07 00 43 01 5F 07 00 43 FE 00 09 07 00 43 01 01 0B 42 01 1E 12 42 01 1D 4D 07 00 70 FF 00 02 00 0A 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 00 02 07 00 70 01 5E 07 00 70 FF 00 12 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 01 07 00 43 FF 00 02 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 02 07 00 43 01 5D 07 00 43 42 07 00 34 40 07 00 43 45 07 00 41 40 01 4C 03 FF 00 02 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 02 03 01 5C 03 FF 00 0F 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 02 03 07 01 59 FF 00 02 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 03 03 07 01 59 01 FF 00 1C 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 02 03 07 01 59 FF 00 0E 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 02 03 07 01 BA FF 00 02 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 03 03 07 01 BA 01 FF 00 1D 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 02 03 07 01 BA 4B 07 00 7D 40 07 00 43 45 07 00 41 40 07 00 43 42 07 00 41 40 07 00 43 45 07 00 41 40 01 05 0B 42 01 1F 46 07 00 41 40 07 00 9B 45 07 00 41 40 07 01 17 45 07 00 41 40 07 00 A0 45 07 00 41 40 01 4F 07 00 03 FF 00 02 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 02 07 00 03 01 5F 07 00 03 FF 00 0E 00 00 00 01 07 00 41 FF 00 00 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 04 07 02 EA 08 11 C2 08 11 C2 07 00 43 45 07 00 41 FF 00 00 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 02 07 02 EA 07 02 E5 FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 02 07 02 EA 07 02 E5 45 07 00 41 40 01 02 05 42 01 19 02 0B 42 01 1D 44 07 00 41 40 07 00 43 45 07 00 41 40 01 5B 07 01 59 FF 00 02 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 02 07 01 59 01 5F 07 01 59 4E 07 01 BA FF 00 02 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 02 07 01 BA 01 5D 07 01 BA 4E 07 02 99 FF 00 02 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 02 07 02 99 01 5D 07 02 99 4D 07 00 41 40 07 03 03 45 07 00 41 00 02 46 07 00 41 40 07 00 9B 45 07 00 41 40 07 01 17 4E 07 00 A0 FF 00 02 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 02 07 00 A0 01 5D 07 00 A0 42 07 00 41 40 07 00 A0 45 07 00 41 40 01 02 05 42 01 18 49 07 00 2E FF 00 00 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 04 07 00 43 02 01 01 45 07 00 41 40 07 03 C2 03 FF 00 16 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 03 08 13 7E 08 13 7E 07 01 BA FF 00 02 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 04 08 13 7E 08 13 7E 07 01 BA 01 FF 00 1F 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 03 08 13 7E 08 13 7E 07 01 BA FF 00 12 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 04 08 13 7E 08 13 7E 03 07 01 59 FF 00 02 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 05 08 13 7E 08 13 7E 03 07 01 59 01 FF 00 1D 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 04 08 13 7E 08 13 7E 03 07 01 59 4F 07 00 3A FF 00 00 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 05 08 13 7E 08 13 7E 03 03 07 01 BA 45 07 00 41 FF 00 00 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 05 08 13 7E 08 13 7E 03 03 02 FF 00 14 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 05 08 13 7E 08 13 7E 03 03 07 01 BA FF 00 02 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 06 08 13 7E 08 13 7E 03 03 07 01 BA 01 FF 00 1F 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 05 08 13 7E 08 13 7E 03 03 07 01 BA 45 07 00 41 FF 00 00 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 05 08 13 7E 08 13 7E 03 03 03 45 07 00 41 40 07 02 0C FF 00 04 00 0C 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 00 01 07 00 41 00 45 07 00 41 40 07 03 C4 FF 00 09 00 10 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 00 01 07 03 C4 01 00 00 54 07 03 C4 FF 00 02 00 10 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 00 01 07 03 C4 01 00 02 07 03 C4 01 5E 07 03 C4 FF 00 0B 00 10 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 00 01 07 00 2E FF 00 00 00 10 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 00 02 07 00 43 07 03 26 45 07 00 41 40 07 00 43 FF 00 06 00 11 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 00 01 07 00 41 40 07 03 26 45 07 00 41 40 07 03 26 FF 00 16 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 02 EA 07 00 43 FF 00 02 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 03 07 02 EA 07 00 43 01 FF 00 1E 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 02 EA 07 00 43 42 07 00 7F FF 00 00 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 02 EA 07 00 43 45 07 00 41 40 07 03 41 4D 07 03 41 FF 00 02 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 03 41 01 5F 07 03 41 42 07 00 38 40 07 03 41 47 07 00 41 40 07 03 4F FF 00 0C 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 03 4F 07 00 03 FF 00 02 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 03 07 03 4F 07 00 03 01 FF 00 1E 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 03 4F 07 00 03 FF 00 0E 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 03 4F 07 01 59 FF 00 02 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 03 07 03 4F 07 01 59 01 FF 00 1D 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 03 4F 07 01 59 FF 00 07 00 00 00 01 07 00 41 FF 00 00 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 03 07 03 4F 07 02 EA 07 00 43 45 07 00 41 FF 00 00 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 03 4F 07 03 41 FF 00 0C 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 03 07 03 4F 07 03 41 01 FF 00 02 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 04 07 03 4F 07 03 41 01 01 FF 00 1F 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 03 07 03 4F 07 03 41 01 42 07 00 7D FF 00 00 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 03 07 03 4F 07 03 41 01 45 07 00 41 40 01 FF 00 0E 00 00 00 01 07 00 41 FF 00 00 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 03 08 15 EA 08 15 EA 07 03 55 45 07 00 41 40 07 02 0C 4B 07 00 41 FF 00 00 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 04 07 02 0C 03 03 03 45 07 00 41 40 07 02 0C 4A 07 00 41 FF 00 00 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 04 07 02 0C 08 16 12 08 16 12 07 03 26 45 07 00 41 FF 00 00 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 04 07 02 0C 08 16 12 08 16 12 07 03 55 42 07 00 41 FF 00 00 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 04 07 02 0C 08 16 12 08 16 12 07 03 55 45 07 00 41 FF 00 00 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 02 0C 07 02 0C FF 00 05 00 00 00 01 07 00 41 FF 00 00 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 03 07 02 0C 07 02 0C 03 45 07 00 41 FF 00 00 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 02 0C 07 02 0C FF 00 0B 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 02 0C 07 02 0C FF 00 02 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 03 07 02 0C 07 02 0C 01 FF 00 1E 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 02 0C 07 02 0C 42 07 00 30 FF 00 00 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 02 0C 07 02 0C 45 07 00 41 40 07 02 0C FF 00 08 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 01 07 00 7D FF 00 00 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 02 07 02 0C 07 02 0C 45 07 00 41 40 03 13 42 01 1C 4D 07 00 43 FF 00 02 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 02 07 00 43 01 5E 07 00 43 0D 42 01 1E 43 07 00 41 40 07 01 46 45 07 00 41 00 0B 42 01 1C FF 00 04 00 00 00 01 07 00 41 FF 00 00 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 01 07 00 43 45 07 00 41 40 01 4B 01 FF 00 02 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 02 01 01 5F 01 FF 00 0D 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 02 01 07 00 43 FF 00 02 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 03 01 07 00 43 01 FF 00 1E 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 02 01 07 00 43 42 07 00 41 FF 00 00 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 02 01 07 00 43 45 07 00 41 FF 00 00 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 02 01 01 FF 00 0D 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 03 01 01 07 00 43 FF 00 02 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 04 01 01 07 00 43 01 FF 00 1F 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 03 01 01 07 00 43 FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 03 01 01 07 00 43 45 07 00 41 FF 00 00 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 03 01 01 01 FF 00 0B 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 03 01 01 01 FF 00 02 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 04 01 01 01 01 FF 00 1D 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 03 01 01 01 FF 00 04 00 00 00 01 07 00 41 FF 00 00 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 04 01 01 01 07 03 26 45 07 00 41 40 07 03 C6 FC 00 0D 07 03 C6 42 01 1D FF 00 10 00 14 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 00 02 07 01 46 02 FF 00 02 00 14 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 00 03 07 01 46 02 01 FF 00 1F 00 14 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 00 02 07 01 46 02 42 07 00 41 FF 00 00 00 14 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 00 02 07 01 46 02 45 07 00 41 00 FF 00 10 00 14 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 00 02 07 01 46 02 FF 00 02 00 14 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 00 03 07 01 46 02 01 FF 00 1C 00 14 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 00 02 07 01 46 02 42 07 00 41 FF 00 00 00 14 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 00 02 07 01 46 02 45 07 00 41 00 FF 00 1B 00 16 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 01 07 00 43 00 05 07 01 46 08 18 F4 08 18 F4 07 00 03 07 00 43 FF 00 02 00 16 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 01 07 00 43 00 06 07 01 46 08 18 F4 08 18 F4 07 00 03 07 00 43 01 FF 00 1D 00 16 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 01 07 00 43 00 05 07 01 46 08 18 F4 08 18 F4 07 00 03 07 00 43 FF 00 0D 00 16 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 01 07 00 43 00 06 07 01 46 08 18 F4 08 18 F4 07 00 03 07 00 43 01 FF 00 02 00 16 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 01 07 00 43 00 07 07 01 46 08 18 F4 08 18 F4 07 00 03 07 00 43 01 01 FF 00 1E 00 16 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 01 07 00 43 00 06 07 01 46 08 18 F4 08 18 F4 07 00 03 07 00 43 01 44 07 00 41 FF 00 00 00 16 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 01 07 00 43 00 07 07 01 46 08 18 F4 08 18 F4 07 00 03 07 00 43 01 01 45 07 00 41 FF 00 00 00 16 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 01 07 00 43 00 02 07 01 46 07 03 A4 45 07 00 41 FF 00 00 00 16 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 01 07 00 43 00 02 07 01 46 07 03 AF 45 07 00 41 00 FF 00 00 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 00 FF 00 05 00 10 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 00 01 07 03 C4 01 00 00 FF 00 02 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 00 FA 00 05 04 05 42 01 1A 52 07 01 BA FF 00 02 00 0A 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 00 02 07 01 BA 01 5D 07 01 BA 13 42 01 1C 49 07 00 38 40 07 03 03 45 07 00 41 00 FF 00 00 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 01 07 00 43 FF 00 01 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 00 FF 00 01 00 02 07 00 03 07 01 46 00 03 07 00 03 07 00 03 07 01 59 FF 00 01 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 02 0C 07 02 0C FF 00 01 00 0A 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 00 00 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 02 07 01 D3 07 01 D9 FF 00 01 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 01 07 00 03 FF 00 01 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 04 08 13 7E 08 13 7E 03 07 01 59 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 01 07 01 BA FF 00 01 00 14 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 00 02 07 01 46 02 FF 00 01 00 16 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 01 07 00 43 00 06 07 01 46 08 18 F4 08 18 F4 07 00 03 07 00 43 01 FF 00 01 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 02 03 07 01 BA FF 00 01 00 04 07 00 03 07 01 46 01 01 00 02 07 03 BC 01 41 07 00 03 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 03 BE 41 07 01 59 41 01 FF 00 01 00 05 07 00 03 07 01 46 01 01 07 02 6A 00 01 07 03 4F FF 00 01 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 00 FF 00 01 00 02 07 00 03 07 01 46 00 00 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 01 07 02 0C 41 07 00 A0 FF 00 01 00 03 07 00 03 07 01 46 03 00 01 03 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 01 07 00 03 FF 00 01 00 06 07 00 03 07 01 46 03 03 03 03 00 02 07 01 BA 03 FF 00 01 00 14 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 00 02 07 01 46 02 FF 00 01 00 03 07 00 03 07 01 46 03 00 00 FF 00 01 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 01 07 02 99 FF 00 01 00 16 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 07 03 C6 01 07 00 43 00 05 07 01 46 08 18 F4 08 18 F4 07 00 03 07 00 43 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 01 DD FF 00 01 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 00 FF 00 01 00 02 07 00 03 07 01 46 00 01 01 FF 00 01 00 06 07 00 03 07 01 46 01 01 01 01 00 02 07 02 99 01 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 01 07 01 59 FF 00 01 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 01 07 00 43 FF 00 01 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 01 03 FF 00 01 00 06 07 00 03 07 01 46 03 03 03 03 00 00 FF 00 01 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 01 07 01 59 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 00 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 02 07 01 AA 07 00 A0 41 07 01 59 FF 00 01 00 05 07 00 03 07 01 46 03 03 03 00 02 03 07 01 BA FF 00 01 00 06 07 00 03 07 01 46 01 01 01 01 00 01 07 02 99 FF 00 01 00 03 07 00 03 07 01 46 01 00 01 01 FF 00 01 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 03 01 01 07 00 43 FF 00 01 00 0A 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 00 00 FF 00 01 00 02 07 00 03 07 01 46 00 01 07 00 03 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 02 03 07 01 59 FF 00 01 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 01 01 FF 00 01 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 02 03 07 01 59 FF 00 01 00 03 07 00 03 07 01 46 01 00 01 01 FF 00 01 00 06 07 00 03 07 01 46 03 03 03 03 00 01 07 01 59 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 04 07 03 C0 08 0B B0 08 0B B0 07 03 BE FF 00 01 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 03 4F 07 00 03 FF 00 01 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 03 08 13 7E 08 13 7E 07 01 BA FF 00 01 00 04 07 00 03 07 01 46 01 01 00 00 FF 00 01 00 0A 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 00 00 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 01 07 01 BA FF 00 01 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 00 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 00 FF 00 01 00 0A 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 00 01 07 00 70 FF 00 01 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 02 01 07 00 43 FF 00 01 00 02 07 00 03 07 01 46 00 00 FC 00 01 01 FF 00 01 00 04 07 00 03 07 01 46 03 03 00 01 03 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 01 07 03 BC 41 07 02 5E FF 00 01 00 05 07 00 03 07 01 46 03 03 03 00 01 03 FF 00 01 00 06 07 00 03 07 01 46 01 01 01 01 00 01 07 01 59 FF 00 01 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 00 FF 00 01 00 07 07 00 03 07 01 46 01 01 01 01 07 02 6A 00 02 07 03 4F 07 03 4F FF 00 01 00 04 07 00 03 07 01 46 01 01 00 01 07 01 BA FF 00 01 00 13 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 07 02 0C 00 03 01 01 01 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 02 07 03 BC 07 03 BE FF 00 01 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 01 07 00 A0 FF 00 01 00 07 07 00 03 07 01 46 01 01 01 01 07 02 6A 00 01 07 02 6A FF 00 01 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 01 07 01 BA FF 00 01 00 06 07 00 03 07 01 46 01 01 01 01 00 00 FF 00 01 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 03 4F 07 01 59 FF 00 01 00 0B 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 00 05 08 13 7E 08 13 7E 03 03 07 01 BA FF 00 01 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 01 07 03 41 FD 00 01 07 02 0C 07 03 C6 FF 00 01 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 02 07 02 EA 07 00 43 FF 00 01 00 07 07 00 03 07 01 46 01 01 01 07 00 70 01 00 01 07 00 43 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 01 07 02 0C FF 00 01 00 06 07 00 03 07 01 46 01 01 01 01 00 01 07 01 59 FF 00 01 00 02 07 00 03 07 01 46 00 00 FF 00 01 00 0A 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 00 01 07 01 BA FF 00 01 00 04 07 00 03 07 01 46 01 01 00 03 07 03 BC 01 07 00 70 FF 00 01 00 04 07 00 03 07 01 46 03 03 00 02 03 07 00 03 FF 00 01 00 05 07 00 03 07 01 46 01 01 01 00 00 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 01 07 01 59 FF 00 01 00 10 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 00 01 07 03 C4 01 00 01 07 03 C4 FF 00 01 00 04 07 00 03 07 01 46 01 01 00 03 07 01 D3 07 01 D9 07 01 DD 41 07 00 03 FF 00 01 00 12 07 00 03 07 01 46 01 01 01 07 00 70 01 07 00 43 01 01 07 00 43 07 02 0C 07 03 26 01 07 03 C4 01 07 00 43 07 03 26 00 03 07 03 4F 07 03 41 01 FF 00 01 00 02 07 00 03 07 01 46 00 01 07 00 41 43 05 44 07 00 41 47 05 47 07 00 41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     6896   6904   Any
        //  6896   6904   6896   6904   Ljava/util/ConcurrentModificationException;
        //  6912   6914   3      8      Ljava/lang/UnsupportedOperationException;
        //  76     83     83     84     Any
        //  77     83     3      8      Any
        //  76     83     76     77     Any
        //  76     83     83     84     Any
        //  77     83     76     77     Any
        //  199    206    206    207    Any
        //  199    206    199    200    Any
        //  200    206    199    200    Any
        //  199    206    3      8      Ljava/lang/NumberFormatException;
        //  199    206    206    207    Ljava/lang/ClassCastException;
        //  316    322    322    323    Any
        //  316    322    322    323    Any
        //  316    322    3      8      Any
        //  316    322    3      8      Any
        //  316    322    322    323    Ljava/util/ConcurrentModificationException;
        //  387    394    394    395    Any
        //  387    394    3      8      Any
        //  387    394    387    388    Ljava/lang/EnumConstantNotPresentException;
        //  388    394    3      8      Ljava/util/NoSuchElementException;
        //  388    394    394    395    Ljava/lang/RuntimeException;
        //  551    558    558    559    Any
        //  551    558    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  551    558    558    559    Ljava/lang/StringIndexOutOfBoundsException;
        //  551    558    551    552    Ljava/lang/AssertionError;
        //  552    558    558    559    Ljava/lang/NumberFormatException;
        //  563    569    569    570    Any
        //  563    569    3      8      Any
        //  563    569    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  563    569    569    570    Ljava/lang/AssertionError;
        //  563    569    3      8      Any
        //  675    682    682    683    Any
        //  676    682    682    683    Any
        //  676    682    675    676    Any
        //  675    682    675    676    Any
        //  676    682    682    683    Any
        //  733    740    740    741    Any
        //  733    740    733    734    Ljava/lang/NumberFormatException;
        //  734    740    3      8      Ljava/lang/RuntimeException;
        //  733    740    3      8      Ljava/lang/IllegalArgumentException;
        //  733    740    740    741    Any
        //  808    815    815    816    Any
        //  809    815    3      8      Ljava/util/NoSuchElementException;
        //  808    815    808    809    Any
        //  808    815    808    809    Ljava/lang/UnsupportedOperationException;
        //  808    815    815    816    Any
        //  864    870    870    871    Any
        //  864    870    870    871    Any
        //  864    870    870    871    Ljava/lang/IllegalArgumentException;
        //  864    870    3      8      Ljava/lang/ClassCastException;
        //  864    870    870    871    Any
        //  924    930    930    931    Any
        //  924    930    3      8      Ljava/lang/ArithmeticException;
        //  924    930    930    931    Any
        //  924    930    930    931    Ljava/lang/NumberFormatException;
        //  924    930    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  976    983    983    984    Any
        //  976    983    983    984    Ljava/lang/ClassCastException;
        //  977    983    983    984    Any
        //  976    983    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  977    983    976    977    Any
        //  987    994    994    995    Any
        //  987    994    987    988    Ljava/lang/StringIndexOutOfBoundsException;
        //  987    994    3      8      Any
        //  987    994    3      8      Ljava/lang/AssertionError;
        //  988    994    994    995    Ljava/lang/NullPointerException;
        //  1397   1404   1404   1405   Any
        //  1398   1404   1397   1398   Any
        //  1397   1404   1404   1405   Ljava/lang/UnsupportedOperationException;
        //  1397   1404   3      8      Ljava/lang/AssertionError;
        //  1398   1404   1404   1405   Ljava/lang/StringIndexOutOfBoundsException;
        //  1411   1418   1418   1419   Any
        //  1412   1418   1411   1412   Any
        //  1411   1418   1411   1412   Ljava/util/NoSuchElementException;
        //  1411   1418   1411   1412   Any
        //  1412   1418   1418   1419   Ljava/lang/IndexOutOfBoundsException;
        //  1430   1437   1437   1438   Any
        //  1431   1437   1430   1431   Any
        //  1431   1437   1430   1431   Ljava/lang/IllegalStateException;
        //  1431   1437   1437   1438   Ljava/lang/ClassCastException;
        //  1431   1437   3      8      Ljava/lang/IllegalStateException;
        //  1487   1494   1494   1495   Any
        //  1487   1494   1494   1495   Ljava/lang/NegativeArraySizeException;
        //  1488   1494   3      8      Any
        //  1487   1494   1487   1488   Any
        //  1487   1494   3      8      Ljava/lang/ArithmeticException;
        //  1505   1512   1512   1513   Any
        //  1505   1512   3      8      Any
        //  1506   1512   1505   1506   Any
        //  1505   1512   3      8      Any
        //  1506   1512   1505   1506   Ljava/lang/ClassCastException;
        //  1563   1570   1570   1571   Any
        //  1564   1570   3      8      Any
        //  1564   1570   3      8      Any
        //  1564   1570   1563   1564   Any
        //  1564   1570   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1574   1581   1581   1582   Any
        //  1574   1581   1581   1582   Ljava/util/ConcurrentModificationException;
        //  1574   1581   1574   1575   Any
        //  1575   1581   1574   1575   Any
        //  1575   1581   1581   1582   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1588   1595   1595   1596   Any
        //  1588   1595   3      8      Ljava/lang/NullPointerException;
        //  1589   1595   1588   1589   Any
        //  1588   1595   1595   1596   Ljava/util/NoSuchElementException;
        //  1588   1595   1588   1589   Any
        //  1643   1650   1650   1651   Any
        //  1643   1650   3      8      Any
        //  1644   1650   1643   1644   Any
        //  1643   1650   3      8      Ljava/lang/IllegalArgumentException;
        //  1644   1650   1643   1644   Any
        //  1747   1754   1754   1755   Any
        //  1748   1754   1747   1748   Any
        //  1748   1754   1754   1755   Ljava/lang/RuntimeException;
        //  1747   1754   1747   1748   Ljava/lang/IndexOutOfBoundsException;
        //  1747   1754   1754   1755   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1761   1768   1768   1769   Any
        //  1762   1768   1761   1762   Ljava/lang/NumberFormatException;
        //  1762   1768   3      8      Any
        //  1761   1768   3      8      Any
        //  1761   1768   3      8      Any
        //  1772   1779   1779   1780   Any
        //  1772   1779   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1772   1779   3      8      Ljava/lang/NullPointerException;
        //  1772   1779   1772   1773   Ljava/lang/StringIndexOutOfBoundsException;
        //  1773   1779   1772   1773   Any
        //  1783   1790   1790   1791   Any
        //  1784   1790   1783   1784   Any
        //  1784   1790   1790   1791   Ljava/lang/NumberFormatException;
        //  1783   1790   1783   1784   Ljava/lang/StringIndexOutOfBoundsException;
        //  1784   1790   1790   1791   Ljava/lang/EnumConstantNotPresentException;
        //  1795   1801   1801   1802   Any
        //  1795   1801   1801   1802   Ljava/lang/ArithmeticException;
        //  1795   1801   3      8      Any
        //  1795   1801   3      8      Any
        //  1795   1801   3      8      Any
        //  1811   1817   1817   1818   Any
        //  1811   1817   3      8      Any
        //  1811   1817   3      8      Any
        //  1811   1817   3      8      Ljava/lang/AssertionError;
        //  1811   1817   3      8      Any
        //  1824   1831   1831   1832   Any
        //  1824   1831   3      8      Any
        //  1824   1831   1824   1825   Any
        //  1824   1831   1824   1825   Ljava/lang/ArithmeticException;
        //  1825   1831   1831   1832   Any
        //  2034   2041   2041   2042   Any
        //  2035   2041   3      8      Any
        //  2035   2041   2034   2035   Ljava/lang/ArithmeticException;
        //  2034   2041   2041   2042   Ljava/lang/ArithmeticException;
        //  2035   2041   3      8      Any
        //  2155   2162   2162   2163   Any
        //  2155   2162   2155   2156   Any
        //  2155   2162   3      8      Ljava/util/ConcurrentModificationException;
        //  2156   2162   2155   2156   Ljava/lang/IndexOutOfBoundsException;
        //  2156   2162   3      8      Any
        //  2768   2775   2775   2776   Any
        //  2768   2775   2768   2769   Ljava/lang/NullPointerException;
        //  2769   2775   3      8      Ljava/lang/UnsupportedOperationException;
        //  2769   2775   3      8      Ljava/lang/UnsupportedOperationException;
        //  2769   2775   3      8      Any
        //  2827   2834   2834   2835   Any
        //  2827   2834   2827   2828   Ljava/lang/ArithmeticException;
        //  2827   2834   2834   2835   Ljava/lang/NumberFormatException;
        //  2827   2834   3      8      Any
        //  2828   2834   3      8      Any
        //  2884   2891   2891   2892   Any
        //  2885   2891   2884   2885   Ljava/lang/EnumConstantNotPresentException;
        //  2884   2891   2891   2892   Any
        //  2884   2891   2891   2892   Ljava/lang/EnumConstantNotPresentException;
        //  2884   2891   2891   2892   Ljava/lang/UnsupportedOperationException;
        //  2897   2904   2904   2905   Any
        //  2897   2904   2897   2898   Ljava/lang/RuntimeException;
        //  2897   2904   2897   2898   Any
        //  2897   2904   2904   2905   Any
        //  2898   2904   3      8      Ljava/util/NoSuchElementException;
        //  2967   2974   2974   2975   Any
        //  2967   2974   3      8      Ljava/lang/ArithmeticException;
        //  2967   2974   2967   2968   Any
        //  2967   2974   2967   2968   Ljava/lang/RuntimeException;
        //  2967   2974   2967   2968   Any
        //  2980   2987   2987   2988   Any
        //  2980   2987   3      8      Any
        //  2980   2987   3      8      Ljava/lang/ArithmeticException;
        //  2981   2987   2980   2981   Any
        //  2980   2987   2987   2988   Any
        //  3002   3009   3009   3010   Any
        //  3002   3009   3002   3003   Ljava/lang/ClassCastException;
        //  3002   3009   3002   3003   Any
        //  3003   3009   3002   3003   Ljava/lang/ClassCastException;
        //  3002   3009   3009   3010   Any
        //  3059   3066   3066   3067   Any
        //  3059   3066   3059   3060   Ljava/lang/ClassCastException;
        //  3059   3066   3      8      Any
        //  3060   3066   3059   3060   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3060   3066   3059   3060   Ljava/util/NoSuchElementException;
        //  3078   3085   3085   3086   Any
        //  3079   3085   3      8      Ljava/lang/ClassCastException;
        //  3079   3085   3078   3079   Ljava/lang/NegativeArraySizeException;
        //  3078   3085   3085   3086   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3078   3085   3085   3086   Ljava/lang/StringIndexOutOfBoundsException;
        //  3138   3145   3145   3146   Any
        //  3139   3145   3138   3139   Any
        //  3138   3145   3138   3139   Ljava/lang/NullPointerException;
        //  3138   3145   3      8      Ljava/util/ConcurrentModificationException;
        //  3139   3145   3      8      Any
        //  3367   3374   3374   3375   Any
        //  3368   3374   3374   3375   Any
        //  3368   3374   3      8      Ljava/lang/NumberFormatException;
        //  3367   3374   3367   3368   Any
        //  3368   3374   3367   3368   Any
        //  3380   3387   3387   3388   Any
        //  3381   3387   3380   3381   Ljava/lang/ArithmeticException;
        //  3381   3387   3380   3381   Ljava/util/ConcurrentModificationException;
        //  3381   3387   3      8      Any
        //  3380   3387   3380   3381   Ljava/lang/ArithmeticException;
        //  3456   3462   3462   3463   Any
        //  3456   3462   3      8      Any
        //  3456   3462   3462   3463   Ljava/lang/UnsupportedOperationException;
        //  3456   3462   3      8      Any
        //  3456   3462   3      8      Any
        //  3468   3475   3475   3476   Any
        //  3469   3475   3475   3476   Ljava/lang/RuntimeException;
        //  3469   3475   3468   3469   Any
        //  3469   3475   3      8      Any
        //  3469   3475   3      8      Any
        //  3490   3497   3497   3498   Any
        //  3490   3497   3497   3498   Any
        //  3491   3497   3      8      Any
        //  3491   3497   3      8      Any
        //  3490   3497   3490   3491   Any
        //  3502   3508   3508   3509   Any
        //  3502   3508   3508   3509   Any
        //  3502   3508   3508   3509   Ljava/lang/UnsupportedOperationException;
        //  3502   3508   3508   3509   Any
        //  3502   3508   3508   3509   Any
        //  3567   3574   3574   3575   Any
        //  3568   3574   3      8      Ljava/util/NoSuchElementException;
        //  3568   3574   3567   3568   Ljava/lang/IllegalStateException;
        //  3568   3574   3574   3575   Ljava/lang/StringIndexOutOfBoundsException;
        //  3567   3574   3574   3575   Ljava/lang/IllegalStateException;
        //  3627   3634   3634   3635   Any
        //  3627   3634   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  3627   3634   3634   3635   Any
        //  3627   3634   3627   3628   Any
        //  3627   3634   3      8      Any
        //  3953   3959   3959   3960   Any
        //  3953   3959   3959   3960   Ljava/util/ConcurrentModificationException;
        //  3953   3959   3959   3960   Any
        //  3953   3959   3959   3960   Any
        //  3953   3959   3      8      Any
        //  4227   4234   4234   4235   Any
        //  4227   4234   4234   4235   Ljava/lang/NumberFormatException;
        //  4227   4234   3      8      Ljava/lang/ArithmeticException;
        //  4227   4234   4227   4228   Ljava/lang/IllegalArgumentException;
        //  4227   4234   3      8      Any
        //  4388   4395   4395   4396   Any
        //  4388   4395   4388   4389   Ljava/lang/NullPointerException;
        //  4388   4395   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  4388   4395   4388   4389   Ljava/util/ConcurrentModificationException;
        //  4388   4395   3      8      Any
        //  4399   4406   4406   4407   Any
        //  4400   4406   4399   4400   Any
        //  4400   4406   3      8      Ljava/lang/IllegalStateException;
        //  4400   4406   4406   4407   Ljava/lang/IndexOutOfBoundsException;
        //  4399   4406   4406   4407   Any
        //  4467   4474   4474   4475   Any
        //  4468   4474   3      8      Any
        //  4467   4474   4467   4468   Any
        //  4467   4474   4467   4468   Ljava/lang/IndexOutOfBoundsException;
        //  4468   4474   4474   4475   Any
        //  4481   4488   4488   4489   Any
        //  4481   4488   3      8      Ljava/lang/AssertionError;
        //  4482   4488   4481   4482   Any
        //  4481   4488   3      8      Any
        //  4481   4488   3      8      Any
        //  4556   4562   4562   4563   Any
        //  4556   4562   3      8      Ljava/lang/RuntimeException;
        //  4556   4562   3      8      Any
        //  4556   4562   4562   4563   Any
        //  4556   4562   3      8      Any
        //  4567   4573   4573   4574   Any
        //  4567   4573   4573   4574   Ljava/lang/EnumConstantNotPresentException;
        //  4567   4573   4573   4574   Ljava/lang/NumberFormatException;
        //  4567   4573   3      8      Any
        //  4567   4573   4573   4574   Ljava/lang/NegativeArraySizeException;
        //  4665   4672   4672   4673   Any
        //  4666   4672   3      8      Ljava/lang/NullPointerException;
        //  4665   4672   4665   4666   Any
        //  4665   4672   3      8      Any
        //  4666   4672   4672   4673   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4846   4853   4853   4854   Any
        //  4847   4853   4846   4847   Any
        //  4846   4853   3      8      Ljava/lang/IllegalArgumentException;
        //  4847   4853   4846   4847   Ljava/lang/ArithmeticException;
        //  4847   4853   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  4864   4871   4871   4872   Any
        //  4865   4871   4871   4872   Any
        //  4864   4871   4864   4865   Any
        //  4865   4871   4871   4872   Any
        //  4864   4871   4871   4872   Ljava/lang/UnsupportedOperationException;
        //  4923   4930   4930   4931   Any
        //  4923   4930   4923   4924   Ljava/util/NoSuchElementException;
        //  4924   4930   3      8      Any
        //  4924   4930   4930   4931   Any
        //  4923   4930   4923   4924   Ljava/lang/AssertionError;
        //  4978   4985   4985   4986   Any
        //  4978   4985   3      8      Any
        //  4978   4985   4985   4986   Any
        //  4979   4985   3      8      Ljava/util/ConcurrentModificationException;
        //  4978   4985   4978   4979   Ljava/util/ConcurrentModificationException;
        //  5116   5123   5123   5124   Any
        //  5116   5123   3      8      Any
        //  5116   5123   5123   5124   Any
        //  5117   5123   5123   5124   Ljava/lang/NegativeArraySizeException;
        //  5116   5123   5116   5117   Ljava/lang/NegativeArraySizeException;
        //  5186   5193   5193   5194   Any
        //  5187   5193   5186   5187   Any
        //  5186   5193   5186   5187   Any
        //  5187   5193   3      8      Ljava/lang/NegativeArraySizeException;
        //  5186   5193   5186   5187   Any
        //  5199   5206   5206   5207   Any
        //  5200   5206   3      8      Any
        //  5200   5206   3      8      Ljava/lang/AssertionError;
        //  5199   5206   3      8      Any
        //  5200   5206   5199   5200   Any
        //  5284   5291   5291   5292   Any
        //  5284   5291   3      8      Any
        //  5285   5291   3      8      Ljava/lang/NumberFormatException;
        //  5285   5291   5284   5285   Ljava/util/ConcurrentModificationException;
        //  5285   5291   3      8      Any
        //  5299   5306   5306   5307   Any
        //  5300   5306   5306   5307   Any
        //  5300   5306   5299   5300   Any
        //  5299   5306   5299   5300   Any
        //  5300   5306   5299   5300   Ljava/lang/NumberFormatException;
        //  5367   5374   5374   5375   Any
        //  5368   5374   5374   5375   Any
        //  5367   5374   5374   5375   Any
        //  5367   5374   3      8      Ljava/util/NoSuchElementException;
        //  5367   5374   5367   5368   Ljava/lang/IllegalStateException;
        //  5427   5436   5436   5437   Any
        //  5428   5436   5427   5428   Ljava/lang/NullPointerException;
        //  5427   5436   5436   5437   Any
        //  5427   5436   5436   5437   Any
        //  5428   5436   3      8      Any
        //  5541   5547   5547   5548   Any
        //  5541   5547   3      8      Ljava/lang/UnsupportedOperationException;
        //  5541   5547   5547   5548   Any
        //  5541   5547   3      8      Any
        //  5541   5547   3      8      Ljava/lang/ClassCastException;
        //  5599   5606   5606   5607   Any
        //  5600   5606   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  5599   5606   5599   5600   Ljava/lang/NegativeArraySizeException;
        //  5599   5606   5599   5600   Ljava/lang/ArithmeticException;
        //  5600   5606   3      8      Any
        //  5623   5629   5629   5630   Any
        //  5623   5629   3      8      Any
        //  5623   5629   5629   5630   Ljava/lang/ArithmeticException;
        //  5623   5629   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  5623   5629   3      8      Any
        //  5642   5649   5649   5650   Any
        //  5643   5649   5642   5643   Any
        //  5642   5649   3      8      Ljava/lang/UnsupportedOperationException;
        //  5643   5649   3      8      Any
        //  5642   5649   3      8      Ljava/lang/NegativeArraySizeException;
        //  5661   5668   5668   5669   Any
        //  5662   5668   5661   5662   Any
        //  5662   5668   5668   5669   Ljava/lang/NegativeArraySizeException;
        //  5662   5668   3      8      Any
        //  5661   5668   5668   5669   Any
        //  5672   5679   5679   5680   Any
        //  5672   5679   5672   5673   Any
        //  5673   5679   5672   5673   Any
        //  5673   5679   5679   5680   Ljava/lang/NullPointerException;
        //  5673   5679   5672   5673   Ljava/lang/IllegalArgumentException;
        //  5687   5693   5693   5694   Any
        //  5687   5693   3      8      Ljava/lang/AssertionError;
        //  5687   5693   5693   5694   Ljava/lang/NegativeArraySizeException;
        //  5687   5693   5693   5694   Ljava/lang/IndexOutOfBoundsException;
        //  5687   5693   5693   5694   Any
        //  5743   5750   5750   5751   Any
        //  5743   5750   3      8      Ljava/lang/NegativeArraySizeException;
        //  5744   5750   5750   5751   Any
        //  5744   5750   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  5744   5750   5743   5744   Ljava/lang/AssertionError;
        //  5760   5767   5767   5768   Any
        //  5760   5767   5760   5761   Ljava/lang/NegativeArraySizeException;
        //  5760   5767   5760   5761   Ljava/lang/EnumConstantNotPresentException;
        //  5760   5767   3      8      Any
        //  5760   5767   3      8      Any
        //  5920   5927   5927   5928   Any
        //  5921   5927   3      8      Any
        //  5920   5927   5927   5928   Any
        //  5920   5927   5920   5921   Any
        //  5920   5927   5920   5921   Any
        //  5978   5984   5984   5985   Any
        //  5978   5984   5984   5985   Any
        //  5978   5984   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  5978   5984   5984   5985   Ljava/lang/ClassCastException;
        //  5978   5984   3      8      Any
        //  6083   6090   6090   6091   Any
        //  6083   6090   6083   6084   Ljava/lang/UnsupportedOperationException;
        //  6083   6090   6083   6084   Any
        //  6084   6090   3      8      Any
        //  6084   6090   3      8      Any
        //  6144   6150   6150   6151   Any
        //  6144   6150   3      8      Any
        //  6144   6150   3      8      Ljava/lang/RuntimeException;
        //  6144   6150   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  6144   6150   6150   6151   Ljava/lang/NegativeArraySizeException;
        //  6202   6208   6208   6209   Any
        //  6202   6208   3      8      Any
        //  6202   6208   3      8      Ljava/lang/AssertionError;
        //  6202   6208   3      8      Any
        //  6202   6208   6208   6209   Ljava/util/NoSuchElementException;
        //  6311   6318   6318   6319   Any
        //  6312   6318   6311   6312   Any
        //  6312   6318   6311   6312   Any
        //  6312   6318   3      8      Ljava/lang/ClassCastException;
        //  6312   6318   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  6371   6378   6378   6379   Any
        //  6372   6378   6378   6379   Ljava/lang/EnumConstantNotPresentException;
        //  6371   6378   3      8      Any
        //  6372   6378   3      8      Any
        //  6372   6378   6371   6372   Any
        //  6493   6500   6500   6501   Any
        //  6493   6500   3      8      Any
        //  6494   6500   6493   6494   Ljava/lang/ClassCastException;
        //  6493   6500   6500   6501   Ljava/lang/NumberFormatException;
        //  6494   6500   6493   6494   Any
        //  6507   6514   6514   6515   Any
        //  6508   6514   6514   6515   Any
        //  6508   6514   3      8      Any
        //  6508   6514   6507   6508   Any
        //  6508   6514   6514   6515   Any
        //  6686   6693   6693   6694   Any
        //  6687   6693   3      8      Ljava/lang/NumberFormatException;
        //  6686   6693   6693   6694   Any
        //  6686   6693   6686   6687   Ljava/lang/NullPointerException;
        //  6686   6693   3      8      Ljava/lang/EnumConstantNotPresentException;
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
    
    @NotNull
    public f0a 3() {
        return fbS.Z(this, 632112603);
    }
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          767
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            759
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            751
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.0:I
        //    28: ifeq            37
        //    31: ldc_w           -191913517
        //    34: goto            40
        //    37: ldc_w           -1936452127
        //    40: ldc_w           -1121604105
        //    43: ixor           
        //    44: lookupswitch {
        //          1007062663: 37
        //          1235880996: 732
        //          default: 72
        //        }
        //    72: iload_1        
        //    73: aload_2        
        //    74: aload_3        
        //    75: getstatic       dev/nuker/pyro/fc.1:I
        //    78: ifeq            87
        //    81: ldc_w           1283537491
        //    84: goto            90
        //    87: ldc_w           -2123843919
        //    90: ldc_w           1809307369
        //    93: ixor           
        //    94: lookupswitch {
        //          660008122: 724
        //          1101921974: 87
        //          default: 120
        //        }
        //   120: goto            124
        //   123: athrow         
        //   124: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //   127: goto            131
        //   130: athrow         
        //   131: aload_0        
        //   132: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //   135: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   138: ifnonnull       142
        //   141: return         
        //   142: getstatic       dev/nuker/pyro/fc.1:I
        //   145: ifeq            154
        //   148: ldc_w           1799044009
        //   151: goto            157
        //   154: ldc_w           -951816413
        //   157: ldc_w           -1307886712
        //   160: ixor           
        //   161: lookupswitch {
        //          -651165663: 722
        //          1551068802: 154
        //          default: 188
        //        }
        //   188: aload_0        
        //   189: getstatic       dev/nuker/pyro/fc.1:I
        //   192: ifeq            201
        //   195: ldc_w           -197079783
        //   198: goto            204
        //   201: ldc_w           923686911
        //   204: ldc_w           -1570445172
        //   207: ixor           
        //   208: lookupswitch {
        //          -1788166285: 236
        //          1445209493: 201
        //          default: 726
        //        }
        //   236: aload_0        
        //   237: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //   240: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   243: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70122_E:Z
        //   246: ifne            253
        //   249: iconst_1       
        //   250: goto            254
        //   253: iconst_0       
        //   254: putfield        dev/nuker/pyro/f5E.c:Z
        //   257: aload_0        
        //   258: getstatic       dev/nuker/pyro/fc.c:I
        //   261: ifge            270
        //   264: ldc_w           494579178
        //   267: goto            273
        //   270: ldc_w           1628851358
        //   273: ldc_w           -805541043
        //   276: ixor           
        //   277: lookupswitch {
        //          -762919257: 736
        //          2078027411: 270
        //          default: 304
        //        }
        //   304: getfield        dev/nuker/pyro/f5E.0:Ldev/nuker/pyro/f0a;
        //   307: goto            311
        //   310: athrow         
        //   311: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   314: goto            318
        //   317: athrow         
        //   318: checkcast       Ljava/lang/Boolean;
        //   321: getstatic       dev/nuker/pyro/fc.c:I
        //   324: ifge            333
        //   327: ldc_w           1248538832
        //   330: goto            336
        //   333: ldc_w           2133078453
        //   336: ldc_w           604922732
        //   339: ixor           
        //   340: lookupswitch {
        //          1529500377: 368
        //          1852134332: 333
        //          default: 720
        //        }
        //   368: goto            372
        //   371: athrow         
        //   372: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   375: goto            379
        //   378: athrow         
        //   379: ifeq            388
        //   382: ldc_w           1124797098
        //   385: goto            391
        //   388: ldc_w           1124797097
        //   391: ldc_w           1097239215
        //   394: ixor           
        //   395: tableswitch {
        //          81461258: 416
        //          81461259: 668
        //          default: 382
        //        }
        //   416: aload_0        
        //   417: getstatic       dev/nuker/pyro/f5E.c:Ldev/nuker/pyro/f5C;
        //   420: aload_0        
        //   421: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //   424: getstatic       dev/nuker/pyro/fc.0:I
        //   427: ifeq            436
        //   430: ldc_w           -1145605091
        //   433: goto            439
        //   436: ldc_w           501483634
        //   439: ldc_w           1260554999
        //   442: ixor           
        //   443: lookupswitch {
        //          -595785008: 436
        //          -258605334: 740
        //          default: 468
        //        }
        //   468: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   471: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   474: aload_0        
        //   475: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //   478: getstatic       dev/nuker/pyro/fc.0:I
        //   481: ifeq            490
        //   484: ldc_w           -968600454
        //   487: goto            493
        //   490: ldc_w           1649314072
        //   493: ldc_w           896642264
        //   496: ixor           
        //   497: lookupswitch {
        //          -214566750: 728
        //          119758148: 490
        //          default: 524
        //        }
        //   524: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   527: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   530: aload_0        
        //   531: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //   534: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   537: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   540: getstatic       dev/nuker/pyro/fc.0:I
        //   543: ifeq            552
        //   546: ldc_w           309131480
        //   549: goto            555
        //   552: ldc_w           1580093964
        //   555: ldc_w           -14182944
        //   558: ixor           
        //   559: lookupswitch {
        //          -907238393: 552
        //          -313823944: 730
        //          default: 584
        //        }
        //   584: goto            588
        //   587: athrow         
        //   588: invokevirtual   dev/nuker/pyro/f5C.c:(DDD)Lnet/minecraft/util/math/Vec3d;
        //   591: goto            595
        //   594: athrow         
        //   595: putfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/util/math/Vec3d;
        //   598: aload_0        
        //   599: getstatic       dev/nuker/pyro/fc.0:I
        //   602: ifeq            611
        //   605: ldc_w           -221291605
        //   608: goto            614
        //   611: ldc_w           1683628750
        //   614: ldc_w           -730558148
        //   617: ixor           
        //   618: lookupswitch {
        //          -1339116558: 644
        //          649841303: 611
        //          default: 738
        //        }
        //   644: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //   647: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   650: dconst_0       
        //   651: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70159_w:D
        //   654: aload_0        
        //   655: getfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //   658: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   661: dconst_0       
        //   662: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70179_y:D
        //   665: goto            719
        //   668: getstatic       dev/nuker/pyro/fc.1:I
        //   671: ifeq            680
        //   674: ldc_w           593618487
        //   677: goto            683
        //   680: ldc_w           2004190656
        //   683: ldc_w           2073849680
        //   686: ixor           
        //   687: lookupswitch {
        //          1038146347: 680
        //          1493010791: 734
        //          default: 712
        //        }
        //   712: aload_0        
        //   713: getstatic       net/minecraft/util/math/Vec3d.field_186680_a:Lnet/minecraft/util/math/Vec3d;
        //   716: putfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/util/math/Vec3d;
        //   719: return         
        //   720: aconst_null    
        //   721: athrow         
        //   722: aconst_null    
        //   723: athrow         
        //   724: aconst_null    
        //   725: athrow         
        //   726: aconst_null    
        //   727: athrow         
        //   728: aconst_null    
        //   729: athrow         
        //   730: aconst_null    
        //   731: athrow         
        //   732: aconst_null    
        //   733: athrow         
        //   734: aconst_null    
        //   735: athrow         
        //   736: aconst_null    
        //   737: athrow         
        //   738: aconst_null    
        //   739: athrow         
        //   740: aconst_null    
        //   741: athrow         
        //   742: pop            
        //   743: goto            24
        //   746: pop            
        //   747: aconst_null    
        //   748: goto            742
        //   751: dup            
        //   752: ifnull          742
        //   755: checkcast       Ljava/lang/Throwable;
        //   758: athrow         
        //   759: dup            
        //   760: ifnull          746
        //   763: checkcast       Ljava/lang/Throwable;
        //   766: athrow         
        //   767: aconst_null    
        //   768: athrow         
        //    StackMapTable: 00 4E 43 07 00 41 04 FF 00 0B 00 00 00 01 07 00 41 FF 00 03 00 04 07 00 03 01 07 01 BA 07 03 F4 00 00 4C 07 00 03 FF 00 02 00 04 07 00 03 01 07 01 BA 07 03 F4 00 02 07 00 03 01 5F 07 00 03 FF 00 0E 00 04 07 00 03 01 07 01 BA 07 03 F4 00 04 07 00 03 01 07 01 BA 07 03 F4 FF 00 02 00 04 07 00 03 01 07 01 BA 07 03 F4 00 05 07 00 03 01 07 01 BA 07 03 F4 01 FF 00 1D 00 04 07 00 03 01 07 01 BA 07 03 F4 00 04 07 00 03 01 07 01 BA 07 03 F4 42 07 00 41 FF 00 00 00 04 07 00 03 01 07 01 BA 07 03 F4 00 04 07 00 03 01 07 01 BA 07 03 F4 45 07 00 41 00 0A 0B 42 01 1E 4C 07 00 03 FF 00 02 00 04 07 00 03 01 07 01 BA 07 03 F4 00 02 07 00 03 01 5F 07 00 03 50 07 00 03 FF 00 00 00 04 07 00 03 01 07 01 BA 07 03 F4 00 02 07 00 03 01 4F 07 00 03 FF 00 02 00 04 07 00 03 01 07 01 BA 07 03 F4 00 02 07 00 03 01 5E 07 00 03 FF 00 05 00 00 00 01 07 00 41 FF 00 00 00 04 07 00 03 01 07 01 BA 07 03 F4 00 01 07 00 9B 45 07 00 41 40 07 01 17 4E 07 00 A0 FF 00 02 00 04 07 00 03 01 07 01 BA 07 03 F4 00 02 07 00 A0 01 5F 07 00 A0 42 07 00 41 40 07 00 A0 45 07 00 41 40 01 02 05 42 01 18 FF 00 13 00 04 07 00 03 01 07 01 BA 07 03 F4 00 03 07 00 03 07 01 31 07 01 59 FF 00 02 00 04 07 00 03 01 07 01 BA 07 03 F4 00 04 07 00 03 07 01 31 07 01 59 01 FF 00 1C 00 04 07 00 03 01 07 01 BA 07 03 F4 00 03 07 00 03 07 01 31 07 01 59 FF 00 15 00 04 07 00 03 01 07 01 BA 07 03 F4 00 04 07 00 03 07 01 31 03 07 01 59 FF 00 02 00 04 07 00 03 01 07 01 BA 07 03 F4 00 05 07 00 03 07 01 31 03 07 01 59 01 FF 00 1E 00 04 07 00 03 01 07 01 BA 07 03 F4 00 04 07 00 03 07 01 31 03 07 01 59 FF 00 1B 00 04 07 00 03 01 07 01 BA 07 03 F4 00 05 07 00 03 07 01 31 03 03 03 FF 00 02 00 04 07 00 03 01 07 01 BA 07 03 F4 00 06 07 00 03 07 01 31 03 03 03 01 FF 00 1C 00 04 07 00 03 01 07 01 BA 07 03 F4 00 05 07 00 03 07 01 31 03 03 03 42 07 00 36 FF 00 00 00 04 07 00 03 01 07 01 BA 07 03 F4 00 05 07 00 03 07 01 31 03 03 03 45 07 00 41 FF 00 00 00 04 07 00 03 01 07 01 BA 07 03 F4 00 02 07 00 03 07 02 0C 4F 07 00 03 FF 00 02 00 04 07 00 03 01 07 01 BA 07 03 F4 00 02 07 00 03 01 5D 07 00 03 17 0B 42 01 1C 06 40 07 00 A0 01 FF 00 01 00 04 07 00 03 01 07 01 BA 07 03 F4 00 04 07 00 03 01 07 01 BA 07 03 F4 41 07 00 03 FF 00 01 00 04 07 00 03 01 07 01 BA 07 03 F4 00 04 07 00 03 07 01 31 03 07 01 59 FF 00 01 00 04 07 00 03 01 07 01 BA 07 03 F4 00 05 07 00 03 07 01 31 03 03 03 41 07 00 03 01 41 07 00 03 41 07 00 03 FF 00 01 00 04 07 00 03 01 07 01 BA 07 03 F4 00 03 07 00 03 07 01 31 07 01 59 41 07 00 41 43 05 44 07 00 41 47 05 47 07 00 41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     751    759    Ljava/lang/IllegalStateException;
        //  751    759    751    759    Any
        //  767    769    3      8      Any
        //  123    130    130    131    Any
        //  124    130    130    131    Ljava/lang/UnsupportedOperationException;
        //  123    130    123    124    Any
        //  124    130    123    124    Ljava/lang/NegativeArraySizeException;
        //  123    130    3      8      Ljava/lang/NullPointerException;
        //  311    317    317    318    Any
        //  311    317    3      8      Any
        //  311    317    317    318    Ljava/lang/NullPointerException;
        //  311    317    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  311    317    317    318    Ljava/lang/EnumConstantNotPresentException;
        //  371    378    378    379    Any
        //  371    378    378    379    Ljava/lang/IllegalStateException;
        //  372    378    378    379    Any
        //  371    378    378    379    Ljava/lang/ArithmeticException;
        //  371    378    371    372    Any
        //  587    594    594    595    Any
        //  587    594    3      8      Ljava/lang/ClassCastException;
        //  587    594    3      8      Any
        //  587    594    594    595    Any
        //  587    594    587    588    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 213 out of bounds for length 213
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
    
    @NotNull
    public f0a 7() {
        return fbS.0g(this, 1573484312);
    }
    
    public boolean 1() {
        return fbS.eR(this, 1721754268);
    }
    
    @NotNull
    public f0a 0() {
        return fbS.S(this, 1057737690);
    }
    
    @NotNull
    public f0b c() {
        return fbS.1G(this, 72461455);
    }
    
    public f5E() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u23e1\u1486\u8af9\ub3cb\uc9de\uede1\ub22a\ue6c2"
        //     4: invokestatic    invokestatic   !!! ERROR
        //     7: ldc_w           "\u23c1\u1486\u8af9\ub3cb\uc9de\uede1\ub22a\ue6c2"
        //    10: getstatic       dev/nuker/pyro/fc.1:I
        //    13: ifeq            22
        //    16: ldc_w           1960723931
        //    19: goto            25
        //    22: ldc_w           -1611599468
        //    25: ldc_w           -522993129
        //    28: ixor           
        //    29: lookupswitch {
        //          -1811052596: 22
        //          2133013379: 56
        //          default: 1714
        //        }
        //    56: invokestatic    invokestatic   !!! ERROR
        //    59: ldc_w           "\u23d3\u1486\u8aff\ub3d6\uc9dc\uedf5\ub230\ue6cf\ud96b\ue9a3\ua738\u1e40\ue1fb\uc5e7\u8136\u897a\u57b6\u7711\ubd32\uc00b\u2b0e\uc23f\u6a18\u2d16\ud7d9\u3598\u7d3e\u89e8\u8006\u8c8c\u84a6\ufb3a\u7094\u9a19\u1b95\uf166\u4975\u8863\uca8f\uff34\ub6c4\u41b3\ub9e6\ub347\u4c27\u8af7\u7c7b\uce26\u7d58\uead5\ue6c4\u16cc\uee10\u378c\u46bd\ue1e7\u0a19\u86d0\u1995\u0f53\u771d\u7294\uc7ff\ubbae\u9ace\u6a0b\ue2ea\ud037\ua529"
        //    62: invokestatic    invokestatic   !!! ERROR
        //    65: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    68: aload_0        
        //    69: aload_0        
        //    70: new             Ldev/nuker/pyro/f0a;
        //    73: dup            
        //    74: ldc_w           "\u23e6\u149c\u8aec\ub3de\uc9dd\uedf1\ub237"
        //    77: invokestatic    invokestatic   !!! ERROR
        //    80: ldc_w           "\u23c6\u149c\u8aec\ub3de\uc9dd\uedf1"
        //    83: invokestatic    invokestatic   !!! ERROR
        //    86: ldc_w           "\u23c6\u149c\u8aec\ub3de\uc9dd\uedf1\ub237\ue686\ud967\ue9a4\ua732\u1e0c\ue1e3\uc5a1\u8131\u896a\u57b6\u7743\ubd2e\uc00b\u2b12\uc229\u6a04\u2d43\ud7ce\u3593\u7d2e\u89ac"
        //    89: getstatic       dev/nuker/pyro/fc.c:I
        //    92: ifge            101
        //    95: ldc_w           -467430850
        //    98: goto            104
        //   101: ldc_w           -396231018
        //   104: ldc_w           934150818
        //   107: ixor           
        //   108: lookupswitch {
        //          -745697124: 101
        //          -540017612: 136
        //          default: 1670
        //        }
        //   136: invokestatic    invokestatic   !!! ERROR
        //   139: iconst_0       
        //   140: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   143: checkcast       Ldev/nuker/pyro/f0n;
        //   146: invokevirtual   dev/nuker/pyro/f5E.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   149: checkcast       Ldev/nuker/pyro/f0a;
        //   152: getstatic       dev/nuker/pyro/fc.c:I
        //   155: ifge            164
        //   158: ldc_w           477139218
        //   161: goto            167
        //   164: ldc_w           -416952928
        //   167: ldc_w           -1648381616
        //   170: ixor           
        //   171: lookupswitch {
        //          -2117132222: 164
        //          2056944880: 196
        //          default: 1682
        //        }
        //   196: putfield        dev/nuker/pyro/f5E.c:Ldev/nuker/pyro/f0a;
        //   199: getstatic       dev/nuker/pyro/fc.0:I
        //   202: ifeq            211
        //   205: ldc_w           188559206
        //   208: goto            214
        //   211: ldc_w           -1457909228
        //   214: ldc_w           -1072848065
        //   217: ixor           
        //   218: lookupswitch {
        //          -886010791: 211
        //          1763160363: 244
        //          default: 1696
        //        }
        //   244: aload_0        
        //   245: aload_0        
        //   246: new             Ldev/nuker/pyro/f0a;
        //   249: dup            
        //   250: ldc_w           "\u23f1\u1496\u8ae5\ub3cd\uc9d4\uede6"
        //   253: invokestatic    invokestatic   !!! ERROR
        //   256: ldc_w           "\u23d1\u1496\u8ae5\ub3cd\uc9d4\uede6"
        //   259: invokestatic    invokestatic   !!! ERROR
        //   262: ldc_w           "\u23c6\u1481\u8ae2\ub3dc\uc9c2\uedb4\ub230\ue6c9\ud928\ue9a1\ua731\u1e42\ue1f6\uc5a2\u8137\u892f\u57bd\u770c\ubd28\uc05e\u2b09\uc235\u6a4b\u2d42\ud7c8\u3592\u7d6b\u89a5\u8018\u8c81\u84b6\ufb3e\u70d1\u9a56\u1b98\uf173\u493c\u8873\uca8e\uff30\ub68a\u41f1\ub9fe\ub347\u4c64\u8aec"
        //   265: invokestatic    invokestatic   !!! ERROR
        //   268: iconst_1       
        //   269: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   272: checkcast       Ldev/nuker/pyro/f0n;
        //   275: invokevirtual   dev/nuker/pyro/f5E.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   278: checkcast       Ldev/nuker/pyro/f0a;
        //   281: getstatic       dev/nuker/pyro/fc.1:I
        //   284: ifeq            293
        //   287: ldc_w           124220535
        //   290: goto            296
        //   293: ldc_w           -1863585806
        //   296: ldc_w           2011679994
        //   299: ixor           
        //   300: lookupswitch {
        //          -711253513: 293
        //          1887484045: 1686
        //          default: 328
        //        }
        //   328: putfield        dev/nuker/pyro/f5E.0:Ldev/nuker/pyro/f0a;
        //   331: getstatic       dev/nuker/pyro/fc.1:I
        //   334: ifeq            343
        //   337: ldc_w           483895539
        //   340: goto            346
        //   343: ldc_w           -1472910407
        //   346: ldc_w           1492173298
        //   349: ixor           
        //   350: lookupswitch {
        //          -2140769638: 343
        //          1143433473: 1700
        //          default: 376
        //        }
        //   376: aload_0        
        //   377: aload_0        
        //   378: new             Ldev/nuker/pyro/f0a;
        //   381: dup            
        //   382: ldc_w           "\u23e6\u149c\u8aec\ub3de\uc9dd\uedf1\ub20b\ue6c0\ud96e\ue985\ua726\u1e43\ue1f7\uc5a9\u8121"
        //   385: invokestatic    invokestatic   !!! ERROR
        //   388: ldc_w           "\u23c6\u149c\u8aec\ub3de\uc9dd\uedf1\ub20b\ue6c0\ud96e\ue985\ua726\u1e43\ue1f7\uc5a9\u8121"
        //   391: invokestatic    invokestatic   !!! ERROR
        //   394: ldc_w           "\u23c6\u149c\u8aec\ub3de\uc9dd\uedf1\ub237\ue686\ud97f\ue9aa\ua731\u1e42\ue1a2\uc5be\u812a\u897a\u57b6\u7743\ubd32\uc018\u2b06\uc23c\u6a19\u2d59\ud7d5\u3599\u7d2f"
        //   397: invokestatic    invokestatic   !!! ERROR
        //   400: iconst_1       
        //   401: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   404: checkcast       Ldev/nuker/pyro/f0n;
        //   407: invokevirtual   dev/nuker/pyro/f5E.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   410: checkcast       Ldev/nuker/pyro/f0a;
        //   413: getstatic       dev/nuker/pyro/fc.0:I
        //   416: ifeq            425
        //   419: ldc_w           -446167399
        //   422: goto            428
        //   425: ldc_w           1628291867
        //   428: ldc_w           -2120561778
        //   431: ixor           
        //   432: lookupswitch {
        //          -1231323538: 425
        //          1693633815: 1674
        //          default: 460
        //        }
        //   460: putfield        dev/nuker/pyro/f5E.1:Ldev/nuker/pyro/f0a;
        //   463: getstatic       dev/nuker/pyro/fc.0:I
        //   466: ifeq            475
        //   469: ldc_w           1553367929
        //   472: goto            478
        //   475: ldc_w           -461975534
        //   478: ldc_w           1371152721
        //   481: ixor           
        //   482: lookupswitch {
        //          -1512867720: 475
        //          221028904: 1694
        //          default: 508
        //        }
        //   508: aload_0        
        //   509: aload_0        
        //   510: new             Ldev/nuker/pyro/f0a;
        //   513: dup            
        //   514: ldc_w           "\u23e6\u149c\u8aec\ub3de\uc9dd\uedf1\ub20d\ue6c8\ud940\ue9ad\ua738\u1e49"
        //   517: invokestatic    invokestatic   !!! ERROR
        //   520: ldc_w           "\u23d7\u149d\u8aea\ub3db\uc9dd\uedf1\ub20d\ue6c8\ud940\ue9ad\ua738\u1e49"
        //   523: invokestatic    invokestatic   !!! ERROR
        //   526: ldc_w           "\u23d7\u149d\u8aea\ub3db\uc9dd\uedf1\ub237\ue686\ud97b\ue9b7\ua726\u1e5e\ue1ed\uc5b2\u812b\u896b\u57e4\u7714\ubd35\uc01b\u2b0e\uc27b\u6a12\u2d59\ud7d5\u35d7\u7d21\u89bd\u801c\u8c95\u84f2\ufb3b\u70da\u9a56\u1b96\uf135\u4974\u8868\uca8a\uff30"
        //   529: getstatic       dev/nuker/pyro/fc.c:I
        //   532: ifge            541
        //   535: ldc_w           -586621651
        //   538: goto            544
        //   541: ldc_w           -153627215
        //   544: ldc_w           526765747
        //   547: ixor           
        //   548: lookupswitch {
        //          -1033038946: 1690
        //          2102553805: 541
        //          default: 576
        //        }
        //   576: invokestatic    invokestatic   !!! ERROR
        //   579: iconst_0       
        //   580: getstatic       dev/nuker/pyro/fc.1:I
        //   583: ifeq            592
        //   586: ldc_w           -2022625189
        //   589: goto            595
        //   592: ldc_w           -503777552
        //   595: ldc_w           1205594224
        //   598: ixor           
        //   599: lookupswitch {
        //          -1062545365: 1676
        //          786691189: 592
        //          default: 624
        //        }
        //   624: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   627: checkcast       Ldev/nuker/pyro/f0n;
        //   630: invokevirtual   dev/nuker/pyro/f5E.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   633: checkcast       Ldev/nuker/pyro/f0a;
        //   636: putfield        dev/nuker/pyro/f5E.2:Ldev/nuker/pyro/f0a;
        //   639: aload_0        
        //   640: getstatic       dev/nuker/pyro/fc.c:I
        //   643: ifge            652
        //   646: ldc_w           1680064550
        //   649: goto            655
        //   652: ldc_w           2062197119
        //   655: ldc_w           -771602311
        //   658: ixor           
        //   659: lookupswitch {
        //          -1239316385: 1688
        //          1593671497: 652
        //          default: 684
        //        }
        //   684: aload_0        
        //   685: new             Ldev/nuker/pyro/f0a;
        //   688: dup            
        //   689: ldc_w           "\u23f6\u149c\u8afe\ub3db\uc9dd\uedf1\ub237"
        //   692: invokestatic    invokestatic   !!! ERROR
        //   695: ldc_w           "\u23d6\u149c\u8afe\ub3db\uc9dd\uedf1"
        //   698: invokestatic    invokestatic   !!! ERROR
        //   701: ldc_w           "\u23c1\u1486\u8af9\ub3cb\uc9de\uede1\ub22a\ue6c2\ud97b\ue9e2\ua720\u1e5b\ue1ed\uc5e7\u8129\u896e\u57bd\u7706\ubd2f\uc00d"
        //   704: invokestatic    invokestatic   !!! ERROR
        //   707: iconst_0       
        //   708: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   711: checkcast       Ldev/nuker/pyro/f0n;
        //   714: invokevirtual   dev/nuker/pyro/f5E.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   717: checkcast       Ldev/nuker/pyro/f0a;
        //   720: putfield        dev/nuker/pyro/f5E.3:Ldev/nuker/pyro/f0a;
        //   723: getstatic       dev/nuker/pyro/fc.1:I
        //   726: ifeq            735
        //   729: ldc_w           778104552
        //   732: goto            738
        //   735: ldc_w           -1823573443
        //   738: ldc_w           2105176299
        //   741: ixor           
        //   742: lookupswitch {
        //          -1973676006: 735
        //          1394253315: 1698
        //          default: 768
        //        }
        //   768: aload_0        
        //   769: aload_0        
        //   770: new             Ldev/nuker/pyro/f0h;
        //   773: dup            
        //   774: ldc_w           "\u23f6\u149c\u8afe\ub3db\uc9dd\uedf1\ub237"
        //   777: getstatic       dev/nuker/pyro/fc.c:I
        //   780: ifge            789
        //   783: ldc_w           -765811272
        //   786: goto            792
        //   789: ldc_w           -1306681947
        //   792: ldc_w           2042374502
        //   795: ixor           
        //   796: lookupswitch {
        //          -1410954018: 1706
        //          856463175: 789
        //          default: 824
        //        }
        //   824: invokestatic    invokestatic   !!! ERROR
        //   827: ldc_w           "\u23d6\u149c\u8afe\ub3db\uc9dd\uedf1"
        //   830: invokestatic    invokestatic   !!! ERROR
        //   833: ldc_w           "\u23c1\u1486\u8af9\ub3cb\uc9de\uede1\ub22a\ue6c2\ud97b\ue9e2\ua720\u1e5b\ue1ed\uc5e7\u8129\u896e\u57bd\u7706\ubd2f\uc00d"
        //   836: invokestatic    invokestatic   !!! ERROR
        //   839: iconst_m1      
        //   840: invokespecial   dev/nuker/pyro/f0h.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
        //   843: checkcast       Ldev/nuker/pyro/f0n;
        //   846: getstatic       dev/nuker/pyro/fc.c:I
        //   849: ifge            858
        //   852: ldc_w           -1243216946
        //   855: goto            861
        //   858: ldc_w           -1039317826
        //   861: ldc_w           2026248612
        //   864: ixor           
        //   865: lookupswitch {
        //          -853534102: 1678
        //          1548090472: 858
        //          default: 892
        //        }
        //   892: invokevirtual   dev/nuker/pyro/f5E.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   895: checkcast       Ldev/nuker/pyro/f0h;
        //   898: putfield        dev/nuker/pyro/f5E.c:Ldev/nuker/pyro/f0h;
        //   901: aload_0        
        //   902: aload_0        
        //   903: new             Ldev/nuker/pyro/f0b;
        //   906: dup            
        //   907: ldc_w           "\u23e7\u149d\u8afb\ub3d5\uc9d0\uedf7\ub221\ue6c2\ud957\ue9a1\ua73b\u1e40\ue1ed\uc5b5"
        //   910: getstatic       dev/nuker/pyro/fc.c:I
        //   913: ifge            922
        //   916: ldc_w           545885788
        //   919: goto            925
        //   922: ldc_w           -151658393
        //   925: ldc_w           -1591951173
        //   928: ixor           
        //   929: lookupswitch {
        //          -2120921369: 922
        //          1474896092: 956
        //          default: 1708
        //        }
        //   956: invokestatic    invokestatic   !!! ERROR
        //   959: ldc_w           "\u23c7\u149d\u8afb\ub3d5\uc9d0\uedf7\ub221\ue6c2\ud928\ue981\ua73b\u1e40\ue1ed\uc5b5"
        //   962: invokestatic    invokestatic   !!! ERROR
        //   965: aconst_null    
        //   966: new             Ldev/nuker/pyro/fS;
        //   969: dup            
        //   970: fconst_0       
        //   971: fconst_1       
        //   972: fconst_1       
        //   973: ldc_w           0.13636
        //   976: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //   979: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //   982: checkcast       Ldev/nuker/pyro/f0n;
        //   985: invokevirtual   dev/nuker/pyro/f5E.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   988: checkcast       Ldev/nuker/pyro/f0b;
        //   991: getstatic       dev/nuker/pyro/fc.c:I
        //   994: ifge            1003
        //   997: ldc_w           1080121833
        //  1000: goto            1006
        //  1003: ldc_w           791499543
        //  1006: ldc_w           249515690
        //  1009: ixor           
        //  1010: lookupswitch {
        //          569515453: 1036
        //          1321080643: 1003
        //          default: 1712
        //        }
        //  1036: putfield        dev/nuker/pyro/f5E.c:Ldev/nuker/pyro/f0b;
        //  1039: aload_0        
        //  1040: aload_0        
        //  1041: new             Ldev/nuker/pyro/f0b;
        //  1044: dup            
        //  1045: ldc_w           "\u23e2\u149f\u8aea\ub3da\uc9d4\uedf0\ub21b\ue6c5\ud967\ue9ae\ua73b\u1e5e"
        //  1048: getstatic       dev/nuker/pyro/fc.1:I
        //  1051: ifeq            1060
        //  1054: ldc_w           -791508584
        //  1057: goto            1063
        //  1060: ldc_w           -1991885042
        //  1063: ldc_w           -320378209
        //  1066: ixor           
        //  1067: lookupswitch {
        //          -327645431: 1060
        //          1010164487: 1716
        //          default: 1092
        //        }
        //  1092: invokestatic    invokestatic   !!! ERROR
        //  1095: ldc_w           "\u23c2\u149f\u8aea\ub3da\uc9d4\uedf0\ub264\ue6e5\ud967\ue9ae\ua73b\u1e5e"
        //  1098: invokestatic    invokestatic   !!! ERROR
        //  1101: aconst_null    
        //  1102: new             Ldev/nuker/pyro/fS;
        //  1105: dup            
        //  1106: ldc_w           0.35
        //  1109: fconst_1       
        //  1110: ldc_w           0.46666
        //  1113: ldc_w           0.13636
        //  1116: getstatic       dev/nuker/pyro/fc.c:I
        //  1119: ifge            1128
        //  1122: ldc_w           -219800546
        //  1125: goto            1131
        //  1128: ldc_w           -10197533
        //  1131: ldc_w           533113581
        //  1134: ixor           
        //  1135: lookupswitch {
        //          -1200265502: 1128
        //          -316623117: 1718
        //          default: 1160
        //        }
        //  1160: invokespecial   dev/nuker/pyro/fS.<init>:(FFFF)V
        //  1163: invokespecial   dev/nuker/pyro/f0b.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/nuker/pyro/fS;)V
        //  1166: checkcast       Ldev/nuker/pyro/f0n;
        //  1169: invokevirtual   dev/nuker/pyro/f5E.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1172: checkcast       Ldev/nuker/pyro/f0b;
        //  1175: getstatic       dev/nuker/pyro/fc.0:I
        //  1178: ifeq            1187
        //  1181: ldc_w           -295400238
        //  1184: goto            1190
        //  1187: ldc_w           1946896980
        //  1190: ldc_w           -294508471
        //  1193: ixor           
        //  1194: lookupswitch {
        //          1483931: 1672
        //          888884504: 1187
        //          default: 1220
        //        }
        //  1220: putfield        dev/nuker/pyro/f5E.0:Ldev/nuker/pyro/f0b;
        //  1223: getstatic       dev/nuker/pyro/fc.c:I
        //  1226: ifge            1235
        //  1229: ldc_w           -786225080
        //  1232: goto            1238
        //  1235: ldc_w           -1298428784
        //  1238: ldc_w           1157461492
        //  1241: ixor           
        //  1242: lookupswitch {
        //          -1780589124: 1235
        //          -161023644: 1268
        //          default: 1668
        //        }
        //  1268: aload_0        
        //  1269: getstatic       dev/nuker/pyro/fc.1:I
        //  1272: ifeq            1281
        //  1275: ldc_w           2111899943
        //  1278: goto            1284
        //  1281: ldc_w           1360536522
        //  1284: ldc_w           587486448
        //  1287: ixor           
        //  1288: lookupswitch {
        //          655191389: 1281
        //          1592090071: 1702
        //          default: 1316
        //        }
        //  1316: aload_0        
        //  1317: new             Ldev/nuker/pyro/f0a;
        //  1320: dup            
        //  1321: ldc_w           "\u23f1\u149b\u8aee\ub3da\uc9da\uedd7\ub22b\ue6ca\ud964\ue9ab\ua727\u1e45\ue1ed\uc5a9"
        //  1324: invokestatic    invokestatic   !!! ERROR
        //  1327: ldc_w           "\u23d1\u149b\u8aee\ub3da\uc9da\uedd7\ub22b\ue6ca\ud964\ue9ab\ua727\u1e45\ue1ed\uc5a9"
        //  1330: invokestatic    invokestatic   !!! ERROR
        //  1333: ldc_w           "\u23d1\u149b\u8aee\ub3da\uc9da\uede7\ub264\ue6c0\ud967\ue9b0\ua774\u1e49\ue1ec\uc5b3\u812c\u897b\u57bd\u7743\ubd3e\uc011\u2b0c\uc237\u6a02\u2d45\ud7c9\u3598\u7d25\u89e8\u8013\u8c80\u84b4\ufb3d\u70c6\u9a13\u1bd7\uf161\u496e\u887e\uca8f\uff3b\ub6cd\u41b3\ub9e6\ub347\u4c27\u8af7\u7c65\uce22\u7d4d\uead5"
        //  1336: invokestatic    invokestatic   !!! ERROR
        //  1339: iconst_1       
        //  1340: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  1343: checkcast       Ldev/nuker/pyro/f0n;
        //  1346: invokevirtual   dev/nuker/pyro/f5E.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1349: checkcast       Ldev/nuker/pyro/f0a;
        //  1352: getstatic       dev/nuker/pyro/fc.c:I
        //  1355: ifge            1364
        //  1358: ldc_w           1168520891
        //  1361: goto            1367
        //  1364: ldc_w           -740727096
        //  1367: ldc_w           -486969466
        //  1370: ixor           
        //  1371: lookupswitch {
        //          -1486923459: 1364
        //          824183118: 1396
        //          default: 1720
        //        }
        //  1396: putfield        dev/nuker/pyro/f5E.4:Ldev/nuker/pyro/f0a;
        //  1399: getstatic       dev/nuker/pyro/fc.c:I
        //  1402: ifge            1411
        //  1405: ldc_w           779688762
        //  1408: goto            1414
        //  1411: ldc_w           -1225562815
        //  1414: ldc_w           -1958463805
        //  1417: ixor           
        //  1418: lookupswitch {
        //          -1522717191: 1692
        //          1128530882: 1411
        //          default: 1444
        //        }
        //  1444: aload_0        
        //  1445: getstatic       dev/nuker/pyro/fc.1:I
        //  1448: ifeq            1457
        //  1451: ldc_w           102291684
        //  1454: goto            1460
        //  1457: ldc_w           223261818
        //  1460: ldc_w           1458227379
        //  1463: ixor           
        //  1464: lookupswitch {
        //          440914406: 1457
        //          1358041175: 1710
        //          default: 1492
        //        }
        //  1492: aload_0        
        //  1493: new             Ldev/nuker/pyro/f0a;
        //  1496: dup            
        //  1497: ldc_w           "\u23fb\u149d\u8af8\ub3cd\uc9d0\uedfa\ub230"
        //  1500: getstatic       dev/nuker/pyro/fc.c:I
        //  1503: ifge            1512
        //  1506: ldc_w           724737062
        //  1509: goto            1515
        //  1512: ldc_w           -1121721966
        //  1515: ldc_w           490720516
        //  1518: ixor           
        //  1519: lookupswitch {
        //          906842402: 1684
        //          1359441942: 1512
        //          default: 1544
        //        }
        //  1544: invokestatic    invokestatic   !!! ERROR
        //  1547: ldc_w           "\u23db\u149d\u8af8\ub3cd\uc9d0\uedfa\ub230"
        //  1550: invokestatic    invokestatic   !!! ERROR
        //  1553: aconst_null    
        //  1554: iconst_0       
        //  1555: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //  1558: checkcast       Ldev/nuker/pyro/f0n;
        //  1561: invokevirtual   dev/nuker/pyro/f5E.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1564: checkcast       Ldev/nuker/pyro/f0a;
        //  1567: putfield        dev/nuker/pyro/f5E.5:Ldev/nuker/pyro/f0a;
        //  1570: getstatic       dev/nuker/pyro/fc.1:I
        //  1573: ifeq            1582
        //  1576: ldc_w           -1651504896
        //  1579: goto            1585
        //  1582: ldc_w           -1174011950
        //  1585: ldc_w           -523384425
        //  1588: ixor           
        //  1589: lookupswitch {
        //          1523070533: 1616
        //          2103296151: 1582
        //          default: 1680
        //        }
        //  1616: aload_0        
        //  1617: getstatic       net/minecraft/util/math/Vec3d.field_186680_a:Lnet/minecraft/util/math/Vec3d;
        //  1620: getstatic       dev/nuker/pyro/fc.0:I
        //  1623: ifeq            1632
        //  1626: ldc_w           -24553100
        //  1629: goto            1635
        //  1632: ldc_w           -1942081161
        //  1635: ldc_w           -540734939
        //  1638: ixor           
        //  1639: lookupswitch {
        //          558650193: 1632
        //          1408973650: 1664
        //          default: 1704
        //        }
        //  1664: putfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/util/math/Vec3d;
        //  1667: return         
        //  1668: aconst_null    
        //  1669: athrow         
        //  1670: aconst_null    
        //  1671: athrow         
        //  1672: aconst_null    
        //  1673: athrow         
        //  1674: aconst_null    
        //  1675: athrow         
        //  1676: aconst_null    
        //  1677: athrow         
        //  1678: aconst_null    
        //  1679: athrow         
        //  1680: aconst_null    
        //  1681: athrow         
        //  1682: aconst_null    
        //  1683: athrow         
        //  1684: aconst_null    
        //  1685: athrow         
        //  1686: aconst_null    
        //  1687: athrow         
        //  1688: aconst_null    
        //  1689: athrow         
        //  1690: aconst_null    
        //  1691: athrow         
        //  1692: aconst_null    
        //  1693: athrow         
        //  1694: aconst_null    
        //  1695: athrow         
        //  1696: aconst_null    
        //  1697: athrow         
        //  1698: aconst_null    
        //  1699: athrow         
        //  1700: aconst_null    
        //  1701: athrow         
        //  1702: aconst_null    
        //  1703: athrow         
        //  1704: aconst_null    
        //  1705: athrow         
        //  1706: aconst_null    
        //  1707: athrow         
        //  1708: aconst_null    
        //  1709: athrow         
        //  1710: aconst_null    
        //  1711: athrow         
        //  1712: aconst_null    
        //  1713: athrow         
        //  1714: aconst_null    
        //  1715: athrow         
        //  1716: aconst_null    
        //  1717: athrow         
        //  1718: aconst_null    
        //  1719: athrow         
        //  1720: aconst_null    
        //  1721: athrow         
        //    StackMapTable: 00 6C FF 00 16 00 01 06 00 03 06 07 03 BE 07 03 BE FF 00 02 00 01 06 00 04 06 07 03 BE 07 03 BE 01 FF 00 1E 00 01 06 00 03 06 07 03 BE 07 03 BE FF 00 2C 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 46 08 00 46 07 03 BE 07 03 BE 07 03 BE FF 00 02 00 01 07 00 03 00 08 07 00 03 07 00 03 08 00 46 08 00 46 07 03 BE 07 03 BE 07 03 BE 01 FF 00 1F 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 46 08 00 46 07 03 BE 07 03 BE 07 03 BE FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 9B FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 9B 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 9B 0E 42 01 1D FF 00 30 00 01 07 00 03 00 02 07 00 03 07 00 9B FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 9B 01 FF 00 1F 00 01 07 00 03 00 02 07 00 03 07 00 9B 0E 42 01 1D FF 00 30 00 01 07 00 03 00 02 07 00 03 07 00 9B FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 9B 01 FF 00 1F 00 01 07 00 03 00 02 07 00 03 07 00 9B 0E 42 01 1D FF 00 20 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 FE 08 01 FE 07 03 BE 07 03 BE 07 03 BE FF 00 02 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 FE 08 01 FE 07 03 BE 07 03 BE 07 03 BE 01 FF 00 1F 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 FE 08 01 FE 07 03 BE 07 03 BE 07 03 BE FF 00 0F 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 FE 08 01 FE 07 03 BE 07 03 BE 07 03 BE 01 FF 00 02 00 01 07 00 03 00 09 07 00 03 07 00 03 08 01 FE 08 01 FE 07 03 BE 07 03 BE 07 03 BE 01 01 FF 00 1C 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 FE 08 01 FE 07 03 BE 07 03 BE 07 03 BE 01 5B 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 32 42 01 1D FF 00 14 00 01 07 00 03 00 05 07 00 03 07 00 03 08 03 02 08 03 02 07 03 BE FF 00 02 00 01 07 00 03 00 06 07 00 03 07 00 03 08 03 02 08 03 02 07 03 BE 01 FF 00 1F 00 01 07 00 03 00 05 07 00 03 07 00 03 08 03 02 08 03 02 07 03 BE FF 00 21 00 01 07 00 03 00 03 07 00 03 07 00 03 07 04 22 FF 00 02 00 01 07 00 03 00 04 07 00 03 07 00 03 07 04 22 01 FF 00 1E 00 01 07 00 03 00 03 07 00 03 07 00 03 07 04 22 FF 00 1D 00 01 07 00 03 00 05 07 00 03 07 00 03 08 03 87 08 03 87 07 03 BE FF 00 02 00 01 07 00 03 00 06 07 00 03 07 00 03 08 03 87 08 03 87 07 03 BE 01 FF 00 1E 00 01 07 00 03 00 05 07 00 03 07 00 03 08 03 87 08 03 87 07 03 BE FF 00 2E 00 01 07 00 03 00 02 07 00 03 07 04 68 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 04 68 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 04 68 FF 00 17 00 01 07 00 03 00 05 07 00 03 07 00 03 08 04 11 08 04 11 07 03 BE FF 00 02 00 01 07 00 03 00 06 07 00 03 07 00 03 08 04 11 08 04 11 07 03 BE 01 FF 00 1C 00 01 07 00 03 00 05 07 00 03 07 00 03 08 04 11 08 04 11 07 03 BE FF 00 23 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 04 11 08 04 11 07 03 BE 07 03 BE 05 08 04 4E 08 04 4E 02 02 02 02 FF 00 02 00 01 07 00 03 00 0E 07 00 03 07 00 03 08 04 11 08 04 11 07 03 BE 07 03 BE 05 08 04 4E 08 04 4E 02 02 02 02 01 FF 00 1C 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 04 11 08 04 11 07 03 BE 07 03 BE 05 08 04 4E 08 04 4E 02 02 02 02 FF 00 1A 00 01 07 00 03 00 02 07 00 03 07 04 68 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 04 68 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 04 68 0E 42 01 1D 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 FF 00 2F 00 01 07 00 03 00 02 07 00 03 07 00 9B FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 9B 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 9B 0E 42 01 1D 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 FF 00 13 00 01 07 00 03 00 05 07 00 03 07 00 03 08 05 D5 08 05 D5 07 03 BE FF 00 02 00 01 07 00 03 00 06 07 00 03 07 00 03 08 05 D5 08 05 D5 07 03 BE 01 FF 00 1C 00 01 07 00 03 00 05 07 00 03 07 00 03 08 05 D5 08 05 D5 07 03 BE 25 42 01 1E FF 00 0F 00 01 07 00 03 00 02 07 00 03 07 02 0C FF 00 02 00 01 07 00 03 00 03 07 00 03 07 02 0C 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 02 0C 03 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 46 08 00 46 07 03 BE 07 03 BE 07 03 BE FF 00 01 00 01 07 00 03 00 02 07 00 03 07 04 68 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 9B FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 01 FE 08 01 FE 07 03 BE 07 03 BE 07 03 BE 01 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 04 22 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 9B FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 05 D5 08 05 D5 07 03 BE FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 9B 41 07 00 03 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 FE 08 01 FE 07 03 BE 07 03 BE 07 03 BE 01 01 01 01 01 41 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 02 0C FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 03 02 08 03 02 07 03 BE FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 03 87 08 03 87 07 03 BE 41 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 04 68 FF 00 01 00 01 06 00 03 06 07 03 BE 07 03 BE FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 04 11 08 04 11 07 03 BE FF 00 01 00 01 07 00 03 00 0D 07 00 03 07 00 03 08 04 11 08 04 11 07 03 BE 07 03 BE 05 08 04 4E 08 04 4E 02 02 02 02 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 9B
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:881)
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
    
    @NotNull
    public BlockPos[] 0(@NotNull final BlockPos p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          383
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            375
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            367
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: iconst_5       
        //    27: anewarray       Lnet/minecraft/util/math/BlockPos;
        //    30: dup            
        //    31: iconst_0       
        //    32: aload_1        
        //    33: getstatic       dev/nuker/pyro/fc.c:I
        //    36: ifge            45
        //    39: ldc_w           247154491
        //    42: goto            48
        //    45: ldc_w           -482429635
        //    48: ldc_w           -1824325119
        //    51: ixor           
        //    52: lookupswitch {
        //          -1644673734: 350
        //          -1335472334: 45
        //          default: 80
        //        }
        //    80: goto            84
        //    83: athrow         
        //    84: invokevirtual   net/minecraft/util/math/BlockPos.func_177977_b:()Lnet/minecraft/util/math/BlockPos;
        //    87: goto            91
        //    90: athrow         
        //    91: dup            
        //    92: pop            
        //    93: aastore        
        //    94: dup            
        //    95: iconst_1       
        //    96: getstatic       dev/nuker/pyro/fc.c:I
        //    99: ifge            108
        //   102: ldc_w           -1865259880
        //   105: goto            111
        //   108: ldc_w           848764304
        //   111: ldc_w           1274551611
        //   114: ixor           
        //   115: lookupswitch {
        //          -617973341: 108
        //          2037317803: 140
        //          default: 354
        //        }
        //   140: aload_1        
        //   141: goto            145
        //   144: athrow         
        //   145: invokevirtual   net/minecraft/util/math/BlockPos.func_177978_c:()Lnet/minecraft/util/math/BlockPos;
        //   148: goto            152
        //   151: athrow         
        //   152: dup            
        //   153: pop            
        //   154: aastore        
        //   155: dup            
        //   156: iconst_2       
        //   157: getstatic       dev/nuker/pyro/fc.c:I
        //   160: ifge            169
        //   163: ldc_w           254978387
        //   166: goto            172
        //   169: ldc_w           1805591777
        //   172: ldc_w           1474366522
        //   175: ixor           
        //   176: lookupswitch {
        //          1014900955: 204
        //          1490265449: 169
        //          default: 348
        //        }
        //   204: aload_1        
        //   205: goto            209
        //   208: athrow         
        //   209: invokevirtual   net/minecraft/util/math/BlockPos.func_177968_d:()Lnet/minecraft/util/math/BlockPos;
        //   212: goto            216
        //   215: athrow         
        //   216: dup            
        //   217: pop            
        //   218: aastore        
        //   219: dup            
        //   220: iconst_3       
        //   221: getstatic       dev/nuker/pyro/fc.c:I
        //   224: ifge            233
        //   227: ldc_w           1456998147
        //   230: goto            236
        //   233: ldc_w           69528470
        //   236: ldc_w           2075127869
        //   239: ixor           
        //   240: lookupswitch {
        //          -1110590938: 233
        //          762836798: 352
        //          default: 268
        //        }
        //   268: aload_1        
        //   269: getstatic       dev/nuker/pyro/fc.0:I
        //   272: ifeq            281
        //   275: ldc_w           -1371140141
        //   278: goto            284
        //   281: ldc_w           -1606156915
        //   284: ldc_w           1288462129
        //   287: ixor           
        //   288: lookupswitch {
        //          -494251806: 281
        //          -326131012: 316
        //          default: 356
        //        }
        //   316: goto            320
        //   319: athrow         
        //   320: invokevirtual   net/minecraft/util/math/BlockPos.func_177976_e:()Lnet/minecraft/util/math/BlockPos;
        //   323: goto            327
        //   326: athrow         
        //   327: dup            
        //   328: pop            
        //   329: aastore        
        //   330: dup            
        //   331: iconst_4       
        //   332: aload_1        
        //   333: goto            337
        //   336: athrow         
        //   337: invokevirtual   net/minecraft/util/math/BlockPos.func_177974_f:()Lnet/minecraft/util/math/BlockPos;
        //   340: goto            344
        //   343: athrow         
        //   344: dup            
        //   345: pop            
        //   346: aastore        
        //   347: areturn        
        //   348: aconst_null    
        //   349: athrow         
        //   350: aconst_null    
        //   351: athrow         
        //   352: aconst_null    
        //   353: athrow         
        //   354: aconst_null    
        //   355: athrow         
        //   356: aconst_null    
        //   357: athrow         
        //   358: pop            
        //   359: goto            24
        //   362: pop            
        //   363: aconst_null    
        //   364: goto            358
        //   367: dup            
        //   368: ifnull          358
        //   371: checkcast       Ljava/lang/Throwable;
        //   374: athrow         
        //   375: dup            
        //   376: ifnull          362
        //   379: checkcast       Ljava/lang/Throwable;
        //   382: athrow         
        //   383: aconst_null    
        //   384: athrow         
        //    StackMapTable: 00 31 43 07 00 41 04 FF 00 0B 00 00 00 01 07 00 41 FD 00 03 07 00 03 07 00 43 FF 00 14 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 02 00 02 07 00 03 07 00 43 00 05 07 00 70 07 00 70 01 07 00 43 01 FF 00 1F 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 10 00 02 07 00 03 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 02 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 01 FF 00 1C 00 02 07 00 03 07 00 43 00 03 07 00 70 07 00 70 01 43 07 00 41 FF 00 00 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 10 00 02 07 00 03 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 02 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 01 FF 00 1F 00 02 07 00 03 07 00 43 00 03 07 00 70 07 00 70 01 43 07 00 41 FF 00 00 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 10 00 02 07 00 03 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 02 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 01 FF 00 1F 00 02 07 00 03 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 0C 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 02 00 02 07 00 03 07 00 43 00 05 07 00 70 07 00 70 01 07 00 43 01 FF 00 1F 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 42 07 00 7D FF 00 00 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 48 07 00 89 FF 00 00 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 45 07 00 41 FF 00 00 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 03 00 02 07 00 03 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 01 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 FF 00 01 00 02 07 00 03 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 01 00 02 07 00 03 07 00 43 00 03 07 00 70 07 00 70 01 FF 00 01 00 02 07 00 03 07 00 43 00 04 07 00 70 07 00 70 01 07 00 43 41 07 00 41 43 05 44 07 00 41 47 05 47 07 00 41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     367    375    Ljava/lang/IndexOutOfBoundsException;
        //  367    375    367    375    Any
        //  383    385    3      8      Any
        //  84     90     90     91     Any
        //  84     90     90     91     Ljava/util/ConcurrentModificationException;
        //  84     90     90     91     Any
        //  84     90     90     91     Ljava/lang/IllegalArgumentException;
        //  84     90     90     91     Ljava/lang/IllegalStateException;
        //  144    151    151    152    Any
        //  145    151    144    145    Any
        //  145    151    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  145    151    151    152    Any
        //  145    151    3      8      Any
        //  208    215    215    216    Any
        //  209    215    208    209    Any
        //  209    215    215    216    Any
        //  208    215    215    216    Any
        //  208    215    3      8      Ljava/lang/ArithmeticException;
        //  319    326    326    327    Any
        //  320    326    319    320    Ljava/lang/UnsupportedOperationException;
        //  320    326    319    320    Ljava/lang/ClassCastException;
        //  319    326    326    327    Any
        //  319    326    326    327    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  336    343    343    344    Any
        //  336    343    343    344    Ljava/lang/NegativeArraySizeException;
        //  336    343    3      8      Ljava/lang/NullPointerException;
        //  337    343    336    337    Ljava/lang/StringIndexOutOfBoundsException;
        //  336    343    3      8      Any
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
    
    public static void c(final f5E p0, final Minecraft p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.0:I
        //     4: ifgt            39
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            31
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: aload_1        
        //    18: putfield        dev/nuker/pyro/f5E.c:Lnet/minecraft/client/Minecraft;
        //    21: return         
        //    22: pop            
        //    23: goto            16
        //    26: pop            
        //    27: aconst_null    
        //    28: goto            22
        //    31: dup            
        //    32: ifnull          22
        //    35: checkcast       Ljava/lang/Throwable;
        //    38: athrow         
        //    39: dup            
        //    40: ifnull          26
        //    43: checkcast       Ljava/lang/Throwable;
        //    46: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 41 FD 00 03 07 00 03 07 01 59 45 07 00 41 43 05 44 07 00 41 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     31     39     Any
        //  31     39     31     39     Any
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
    
    public boolean 2(@NotNull final Entity entity) {
        return fbS.hr(this, 814237155, entity);
    }
    
    @NotNull
    public f0b 2() {
        return fbS.1D(this, 1675907772);
    }
    
    public boolean 0(@NotNull final Entity entity) {
        return fbS.hf(this, 2097471877, entity);
    }
    
    public boolean c(@NotNull final BlockPos blockPos) {
        return fbS.4G(this, 1062986979, blockPos);
    }
    
    @Override
    public void c(@Nullable final Vec3d p0, final float p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          911
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            903
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            895
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f5E.c:[Lnet/minecraft/util/math/BlockPos;
        //    28: ifnull          861
        //    31: getstatic       dev/nuker/pyro/fc.c:I
        //    34: ifge            43
        //    37: ldc_w           1357199314
        //    40: goto            46
        //    43: ldc_w           1258224651
        //    46: ldc_w           1974420449
        //    49: ixor           
        //    50: lookupswitch {
        //          625636403: 862
        //          1210133154: 43
        //          default: 76
        //        }
        //    76: getstatic       dev/nuker/pyro/fbr.c:Ldev/nuker/pyro/fbr;
        //    79: bipush          7
        //    81: goto            85
        //    84: athrow         
        //    85: invokevirtual   dev/nuker/pyro/fbr.c:(I)V
        //    88: goto            92
        //    91: athrow         
        //    92: iconst_0       
        //    93: getstatic       dev/nuker/pyro/fc.0:I
        //    96: ifeq            105
        //    99: ldc_w           456521930
        //   102: goto            108
        //   105: ldc_w           710894268
        //   108: ldc_w           2130190716
        //   111: ixor           
        //   112: lookupswitch {
        //          1420248000: 140
        //          1707989430: 105
        //          default: 874
        //        }
        //   140: istore_3       
        //   141: getstatic       dev/nuker/pyro/fc.0:I
        //   144: ifeq            153
        //   147: ldc_w           -2077862091
        //   150: goto            156
        //   153: ldc_w           -1375254871
        //   156: ldc_w           92486452
        //   159: ixor           
        //   160: lookupswitch {
        //          -2119865343: 872
        //          711757493: 153
        //          default: 188
        //        }
        //   188: aload_0        
        //   189: getfield        dev/nuker/pyro/f5E.c:[Lnet/minecraft/util/math/BlockPos;
        //   192: dup            
        //   193: ifnonnull       207
        //   196: goto            200
        //   199: athrow         
        //   200: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   203: goto            207
        //   206: athrow         
        //   207: arraylength    
        //   208: istore          4
        //   210: iload_3        
        //   211: getstatic       dev/nuker/pyro/fc.c:I
        //   214: ifge            223
        //   217: ldc_w           -1705749310
        //   220: goto            226
        //   223: ldc_w           -1664883335
        //   226: ldc_w           496554258
        //   229: ixor           
        //   230: lookupswitch {
        //          -2016639536: 866
        //          -1433439628: 223
        //          default: 256
        //        }
        //   256: iload           4
        //   258: if_icmpge       789
        //   261: getstatic       dev/nuker/pyro/fc.0:I
        //   264: ifeq            273
        //   267: ldc_w           -297274421
        //   270: goto            276
        //   273: ldc_w           -302166322
        //   276: ldc_w           327847678
        //   279: ixor           
        //   280: lookupswitch {
        //          -432236067: 273
        //          -36864715: 870
        //          default: 308
        //        }
        //   308: aload_0        
        //   309: getfield        dev/nuker/pyro/f5E.c:[Lnet/minecraft/util/math/BlockPos;
        //   312: dup            
        //   313: ifnonnull       327
        //   316: goto            320
        //   319: athrow         
        //   320: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   323: goto            327
        //   326: athrow         
        //   327: iload_3        
        //   328: aaload         
        //   329: astore          5
        //   331: getstatic       dev/nuker/pyro/fbr.c:Ldev/nuker/pyro/fbr;
        //   334: aload           5
        //   336: goto            340
        //   339: athrow         
        //   340: invokevirtual   net/minecraft/util/math/BlockPos.func_177958_n:()I
        //   343: goto            347
        //   346: athrow         
        //   347: i2f            
        //   348: ldc_w           0.001
        //   351: fsub           
        //   352: aload           5
        //   354: getstatic       dev/nuker/pyro/fc.c:I
        //   357: ifge            366
        //   360: ldc_w           494452116
        //   363: goto            369
        //   366: ldc_w           -1430066149
        //   369: ldc_w           -791801999
        //   372: ixor           
        //   373: lookupswitch {
        //          -1347999124: 366
        //          -843664667: 878
        //          default: 400
        //        }
        //   400: goto            404
        //   403: athrow         
        //   404: invokevirtual   net/minecraft/util/math/BlockPos.func_177956_o:()I
        //   407: goto            411
        //   410: athrow         
        //   411: i2f            
        //   412: ldc_w           0.001
        //   415: fsub           
        //   416: aload           5
        //   418: goto            422
        //   421: athrow         
        //   422: invokevirtual   net/minecraft/util/math/BlockPos.func_177952_p:()I
        //   425: goto            429
        //   428: athrow         
        //   429: i2f            
        //   430: ldc_w           0.001
        //   433: fsub           
        //   434: ldc_w           1.002
        //   437: ldc_w           1.002
        //   440: ldc_w           1.002
        //   443: aload_0        
        //   444: getstatic       dev/nuker/pyro/fc.0:I
        //   447: ifeq            456
        //   450: ldc_w           -1454619734
        //   453: goto            459
        //   456: ldc_w           -256388378
        //   459: ldc_w           886854782
        //   462: ixor           
        //   463: lookupswitch {
        //          -1651501100: 864
        //          755741697: 456
        //          default: 488
        //        }
        //   488: getfield        dev/nuker/pyro/f5E.c:[Z
        //   491: dup            
        //   492: ifnonnull       520
        //   495: ldc_w           "\u23f4\u149a\u8ae7\ub1c4\ucfc5\uedf0\ub205\ue6d4\udb6b"
        //   498: goto            502
        //   501: athrow         
        //   502: invokestatic    invokestatic   !!! ERROR
        //   505: goto            509
        //   508: athrow         
        //   509: goto            513
        //   512: athrow         
        //   513: invokestatic    kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        //   516: goto            520
        //   519: athrow         
        //   520: iload_3        
        //   521: baload         
        //   522: ifeq            604
        //   525: getstatic       dev/nuker/pyro/fc.1:I
        //   528: ifeq            537
        //   531: ldc_w           1690873236
        //   534: goto            540
        //   537: ldc_w           -1415472069
        //   540: ldc_w           -2132264811
        //   543: ixor           
        //   544: lookupswitch {
        //          -467626751: 537
        //          726246574: 572
        //          default: 876
        //        }
        //   572: aload_0        
        //   573: getfield        dev/nuker/pyro/f5E.0:Ldev/nuker/pyro/f0b;
        //   576: goto            580
        //   579: athrow         
        //   580: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //   583: goto            587
        //   586: athrow         
        //   587: checkcast       Ldev/nuker/pyro/fS;
        //   590: goto            594
        //   593: athrow         
        //   594: invokevirtual   dev/nuker/pyro/fS.5:()I
        //   597: goto            601
        //   600: athrow         
        //   601: goto            723
        //   604: aload_0        
        //   605: getfield        dev/nuker/pyro/f5E.c:Ldev/nuker/pyro/f0b;
        //   608: getstatic       dev/nuker/pyro/fc.c:I
        //   611: ifge            620
        //   614: ldc_w           -1354542556
        //   617: goto            623
        //   620: ldc_w           671551623
        //   623: ldc_w           1955986404
        //   626: ixor           
        //   627: lookupswitch {
        //          -2101234628: 620
        //          -606688832: 880
        //          default: 652
        //        }
        //   652: goto            656
        //   655: athrow         
        //   656: invokevirtual   dev/nuker/pyro/f0b.3:()Ljava/lang/Object;
        //   659: goto            663
        //   662: athrow         
        //   663: checkcast       Ldev/nuker/pyro/fS;
        //   666: getstatic       dev/nuker/pyro/fc.1:I
        //   669: ifeq            678
        //   672: ldc_w           -1117835329
        //   675: goto            681
        //   678: ldc_w           -982411639
        //   681: ldc_w           -1656472840
        //   684: ixor           
        //   685: lookupswitch {
        //          538645831: 678
        //          1479912561: 712
        //          default: 882
        //        }
        //   712: goto            716
        //   715: athrow         
        //   716: invokevirtual   dev/nuker/pyro/fS.5:()I
        //   719: goto            723
        //   722: athrow         
        //   723: bipush          63
        //   725: getstatic       dev/nuker/pyro/fc.c:I
        //   728: ifge            737
        //   731: ldc_w           806085885
        //   734: goto            740
        //   737: ldc_w           -307371939
        //   740: ldc_w           997080979
        //   743: ixor           
        //   744: lookupswitch {
        //          -1547503057: 737
        //          191224686: 884
        //          default: 772
        //        }
        //   772: goto            776
        //   775: athrow         
        //   776: invokevirtual   dev/nuker/pyro/fbr.0:(FFFFFFII)V
        //   779: goto            783
        //   782: athrow         
        //   783: iinc            3, 1
        //   786: goto            210
        //   789: getstatic       dev/nuker/pyro/fc.1:I
        //   792: ifeq            801
        //   795: ldc_w           -83600897
        //   798: goto            804
        //   801: ldc_w           443302166
        //   804: ldc_w           1554827196
        //   807: ixor           
        //   808: lookupswitch {
        //          -1482121661: 801
        //          1187022506: 836
        //          default: 868
        //        }
        //   836: goto            840
        //   839: athrow         
        //   840: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179126_j:()V
        //   843: goto            847
        //   846: athrow         
        //   847: getstatic       dev/nuker/pyro/fbr.c:Ldev/nuker/pyro/fbr;
        //   850: goto            854
        //   853: athrow         
        //   854: invokevirtual   dev/nuker/pyro/fbr.2:()V
        //   857: goto            861
        //   860: athrow         
        //   861: return         
        //   862: aconst_null    
        //   863: athrow         
        //   864: aconst_null    
        //   865: athrow         
        //   866: aconst_null    
        //   867: athrow         
        //   868: aconst_null    
        //   869: athrow         
        //   870: aconst_null    
        //   871: athrow         
        //   872: aconst_null    
        //   873: athrow         
        //   874: aconst_null    
        //   875: athrow         
        //   876: aconst_null    
        //   877: athrow         
        //   878: aconst_null    
        //   879: athrow         
        //   880: aconst_null    
        //   881: athrow         
        //   882: aconst_null    
        //   883: athrow         
        //   884: aconst_null    
        //   885: athrow         
        //   886: pop            
        //   887: goto            24
        //   890: pop            
        //   891: aconst_null    
        //   892: goto            886
        //   895: dup            
        //   896: ifnull          886
        //   899: checkcast       Ljava/lang/Throwable;
        //   902: athrow         
        //   903: dup            
        //   904: ifnull          890
        //   907: checkcast       Ljava/lang/Throwable;
        //   910: athrow         
        //   911: aconst_null    
        //   912: athrow         
        //    StackMapTable: 00 78 43 07 00 41 04 FF 00 0B 00 00 00 01 07 00 41 FE 00 03 07 00 03 07 02 0C 02 12 42 01 1D FF 00 07 00 00 00 01 07 00 41 FF 00 00 00 03 07 00 03 07 02 0C 02 00 02 07 04 D7 01 45 07 00 41 00 4C 01 FF 00 02 00 03 07 00 03 07 02 0C 02 00 02 01 01 5F 01 FC 00 0C 01 42 01 1F 4A 07 00 85 40 07 00 70 45 07 00 41 40 07 00 70 FC 00 02 01 4C 01 FF 00 02 00 05 07 00 03 07 02 0C 02 01 01 00 02 01 01 5D 01 10 42 01 1F 4A 07 00 7D 40 07 00 70 45 07 00 41 40 07 00 70 FF 00 0B 00 00 00 01 07 00 41 FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 02 07 04 D7 07 00 43 45 07 00 41 FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 02 07 04 D7 01 FF 00 12 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 03 07 04 D7 02 07 00 43 FF 00 02 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 04 07 04 D7 02 07 00 43 01 FF 00 1E 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 03 07 04 D7 02 07 00 43 42 07 00 7D FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 03 07 04 D7 02 07 00 43 45 07 00 41 FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 03 07 04 D7 02 01 49 07 00 87 FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 04 07 04 D7 02 02 07 00 43 45 07 00 41 FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 04 07 04 D7 02 02 01 FF 00 1A 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 07 00 03 FF 00 02 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 09 07 04 D7 02 02 02 02 02 02 07 00 03 01 FF 00 1C 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 07 00 03 4C 07 00 3A FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 09 07 04 D7 02 02 02 02 02 02 07 03 BC 07 03 BE 45 07 00 41 FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 09 07 04 D7 02 02 02 02 02 02 07 03 BC 07 03 BE 42 07 00 41 FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 09 07 04 D7 02 02 02 02 02 02 07 03 BC 07 03 BE 45 07 00 41 FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 07 03 BC FF 00 10 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 07 07 04 D7 02 02 02 02 02 02 FF 00 02 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 01 FF 00 1F 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 07 07 04 D7 02 02 02 02 02 02 46 07 00 41 FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 07 04 68 45 07 00 41 FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 07 01 17 45 07 00 41 FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 07 04 71 45 07 00 41 FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 01 FF 00 02 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 07 07 04 D7 02 02 02 02 02 02 FF 00 0F 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 07 04 68 FF 00 02 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 09 07 04 D7 02 02 02 02 02 02 07 04 68 01 FF 00 1C 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 07 04 68 42 07 00 7D FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 07 04 68 45 07 00 41 FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 07 01 17 FF 00 0E 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 07 04 71 FF 00 02 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 09 07 04 D7 02 02 02 02 02 02 07 04 71 01 FF 00 1E 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 07 04 71 FF 00 02 00 00 00 01 07 00 41 FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 07 04 71 45 07 00 41 FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 01 FF 00 0D 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 09 07 04 D7 02 02 02 02 02 02 01 01 FF 00 02 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 0A 07 04 D7 02 02 02 02 02 02 01 01 01 FF 00 1F 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 09 07 04 D7 02 02 02 02 02 02 01 01 42 07 00 7D FF 00 00 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 09 07 04 D7 02 02 02 02 02 02 01 01 45 07 00 41 00 FA 00 05 0B 42 01 1F 42 07 00 41 00 45 07 00 41 00 FF 00 05 00 00 00 01 07 00 41 FF 00 00 00 05 07 00 03 07 02 0C 02 01 01 00 01 07 04 D7 45 07 00 41 F9 00 00 00 FF 00 01 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 07 00 03 FF 00 01 00 05 07 00 03 07 02 0C 02 01 01 00 01 01 01 01 FA 00 01 FF 00 01 00 03 07 00 03 07 02 0C 02 00 01 01 FF 00 01 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 07 07 04 D7 02 02 02 02 02 02 FF 00 01 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 03 07 04 D7 02 07 00 43 FF 00 01 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 07 04 68 FF 00 01 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 08 07 04 D7 02 02 02 02 02 02 07 04 71 FF 00 01 00 06 07 00 03 07 02 0C 02 01 01 07 00 43 00 09 07 04 D7 02 02 02 02 02 02 01 01 FF 00 01 00 03 07 00 03 07 02 0C 02 00 01 07 00 41 43 05 44 07 00 41 47 05 47 07 00 41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     895    903    Any
        //  895    903    895    903    Ljava/lang/AssertionError;
        //  911    913    3      8      Any
        //  85     91     91     92     Any
        //  85     91     3      8      Any
        //  85     91     91     92     Any
        //  85     91     91     92     Ljava/lang/RuntimeException;
        //  85     91     91     92     Ljava/lang/IndexOutOfBoundsException;
        //  199    206    206    207    Any
        //  199    206    199    200    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  200    206    206    207    Any
        //  199    206    3      8      Any
        //  200    206    206    207    Ljava/lang/EnumConstantNotPresentException;
        //  319    326    326    327    Any
        //  320    326    326    327    Ljava/lang/RuntimeException;
        //  319    326    319    320    Ljava/lang/RuntimeException;
        //  319    326    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  320    326    326    327    Ljava/lang/EnumConstantNotPresentException;
        //  340    346    346    347    Any
        //  340    346    346    347    Any
        //  340    346    346    347    Any
        //  340    346    346    347    Any
        //  340    346    346    347    Ljava/lang/NumberFormatException;
        //  403    410    410    411    Any
        //  403    410    3      8      Ljava/lang/AssertionError;
        //  404    410    403    404    Ljava/util/ConcurrentModificationException;
        //  404    410    403    404    Ljava/lang/ClassCastException;
        //  403    410    410    411    Any
        //  421    428    428    429    Any
        //  421    428    3      8      Any
        //  422    428    3      8      Any
        //  422    428    421    422    Ljava/lang/IndexOutOfBoundsException;
        //  421    428    428    429    Ljava/lang/ClassCastException;
        //  501    508    508    509    Any
        //  501    508    501    502    Ljava/lang/NegativeArraySizeException;
        //  501    508    508    509    Ljava/lang/RuntimeException;
        //  502    508    508    509    Any
        //  501    508    508    509    Any
        //  512    519    519    520    Any
        //  512    519    512    513    Any
        //  513    519    512    513    Ljava/lang/NegativeArraySizeException;
        //  512    519    3      8      Any
        //  513    519    3      8      Ljava/lang/AssertionError;
        //  579    586    586    587    Any
        //  580    586    579    580    Any
        //  580    586    579    580    Ljava/lang/IllegalStateException;
        //  580    586    3      8      Ljava/util/NoSuchElementException;
        //  580    586    586    587    Any
        //  593    600    600    601    Any
        //  593    600    3      8      Any
        //  593    600    593    594    Ljava/lang/NullPointerException;
        //  593    600    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  593    600    593    594    Any
        //  655    662    662    663    Any
        //  655    662    655    656    Ljava/util/ConcurrentModificationException;
        //  655    662    655    656    Ljava/lang/StringIndexOutOfBoundsException;
        //  656    662    3      8      Ljava/lang/ArithmeticException;
        //  656    662    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  716    722    722    723    Any
        //  716    722    722    723    Ljava/lang/EnumConstantNotPresentException;
        //  716    722    722    723    Ljava/lang/IllegalStateException;
        //  716    722    3      8      Any
        //  716    722    3      8      Any
        //  775    782    782    783    Any
        //  775    782    775    776    Ljava/lang/RuntimeException;
        //  776    782    3      8      Ljava/lang/NegativeArraySizeException;
        //  775    782    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  776    782    775    776    Ljava/lang/IndexOutOfBoundsException;
        //  839    846    846    847    Any
        //  839    846    846    847    Ljava/lang/RuntimeException;
        //  839    846    846    847    Any
        //  840    846    839    840    Any
        //  840    846    3      8      Any
        //  854    860    860    861    Any
        //  854    860    860    861    Any
        //  854    860    3      8      Any
        //  854    860    3      8      Any
        //  854    860    3      8      Ljava/lang/ArithmeticException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0327 (coming from #0902).
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2183)
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
    
    public static Minecraft c(final f5E f5E) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0087:
            while (true) {
                do {
                    Label_0074: {
                        break Label_0074;
                        try {
                            o = null;
                            if (fc.c >= 0) {
                                null;
                                goto Label_0079;
                            }
                            continue Label_0087;
                            while (true) {
                                int n = -675939837;
                                Label_0032: {
                                    break Label_0032;
                                    Label_0064: {
                                        return f5E.c;
                                    }
                                    Label_0029:
                                    n = 240390528;
                                }
                                Label_0068: {
                                    throw null;
                                }
                                continue;
                            }
                        }
                        // switch([Lcom.strobel.decompiler.ast.Label;@3cd52bb, n ^ 0x5BFC2181)
                        // iftrue(Label_0029:, fc.1 == 0)
                        catch (IllegalStateException ex) {}
                    }
                    continue Label_0087;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public void c(@Nullable final BlockPos[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            137
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            129
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getstatic       dev/nuker/pyro/fc.0:I
        //    20: ifeq            29
        //    23: ldc_w           1455061136
        //    26: goto            32
        //    29: ldc_w           -936592575
        //    32: ldc_w           598215392
        //    35: ixor           
        //    36: lookupswitch {
        //          -343625311: 64
        //          1964143216: 29
        //          default: 118
        //        }
        //    64: aload_1        
        //    65: getstatic       dev/nuker/pyro/fc.c:I
        //    68: ifge            77
        //    71: ldc_w           -547207908
        //    74: goto            80
        //    77: ldc_w           -1557288768
        //    80: ldc_w           660762708
        //    83: ixor           
        //    84: lookupswitch {
        //          -2075141996: 112
        //          -134204088: 77
        //          default: 116
        //        }
        //   112: putfield        dev/nuker/pyro/f5E.c:[Lnet/minecraft/util/math/BlockPos;
        //   115: return         
        //   116: aconst_null    
        //   117: athrow         
        //   118: aconst_null    
        //   119: athrow         
        //   120: pop            
        //   121: goto            16
        //   124: pop            
        //   125: aconst_null    
        //   126: goto            120
        //   129: dup            
        //   130: ifnull          120
        //   133: checkcast       Ljava/lang/Throwable;
        //   136: athrow         
        //   137: dup            
        //   138: ifnull          124
        //   141: checkcast       Ljava/lang/Throwable;
        //   144: athrow         
        //    StackMapTable: 00 0E FF 00 0C 00 00 00 01 07 00 41 FD 00 03 07 00 03 07 00 70 4C 07 00 03 FF 00 02 00 02 07 00 03 07 00 70 00 02 07 00 03 01 5F 07 00 03 FF 00 0C 00 02 07 00 03 07 00 70 00 02 07 00 03 07 00 70 FF 00 02 00 02 07 00 03 07 00 70 00 03 07 00 03 07 00 70 01 FF 00 1F 00 02 07 00 03 07 00 70 00 02 07 00 03 07 00 70 FF 00 03 00 02 07 00 03 07 00 70 00 02 07 00 03 07 00 70 41 07 00 03 41 07 00 41 43 05 44 07 00 41 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     129    137    Any
        //  129    137    129    137    Any
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
    
    @NotNull
    public f0a b() {
        return fbS.0F(this, 1255943850);
    }
}
