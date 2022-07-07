// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;

public class faQ extends fH
{
    public f0g c;
    public f0a c;
    public f0h c;
    public f0g 0;
    public f0g 1;
    public boolean c;
    
    @f06
    public void c(final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          581
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            573
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            565
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iconst_1       
        //    25: istore_2       
        //    26: aload_0        
        //    27: getfield        dev/nuker/pyro/faQ.c:Ldev/nuker/pyro/f0a;
        //    30: goto            34
        //    33: athrow         
        //    34: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //    37: goto            41
        //    40: athrow         
        //    41: checkcast       Ljava/lang/Boolean;
        //    44: goto            48
        //    47: athrow         
        //    48: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    51: goto            55
        //    54: athrow         
        //    55: ifeq            403
        //    58: aload_0        
        //    59: getfield        dev/nuker/pyro/faQ.c:Lnet/minecraft/client/Minecraft;
        //    62: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    65: getstatic       dev/nuker/pyro/fc.1:I
        //    68: ifeq            76
        //    71: ldc             148471938
        //    73: goto            78
        //    76: ldc             1321821773
        //    78: ldc             -1141157247
        //    80: ixor           
        //    81: lookupswitch {
        //          -1289563645: 76
        //          -181259060: 108
        //          default: 552
        //        }
        //   108: goto            112
        //   111: athrow         
        //   112: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //   115: goto            119
        //   118: athrow         
        //   119: goto            123
        //   122: athrow         
        //   123: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   126: goto            130
        //   129: athrow         
        //   130: getstatic       dev/nuker/pyro/fc.1:I
        //   133: ifeq            141
        //   136: ldc             -688906445
        //   138: goto            143
        //   141: ldc             -540802274
        //   143: ldc             -1424817168
        //   145: ixor           
        //   146: lookupswitch {
        //          1960247534: 172
        //          2112036035: 141
        //          default: 546
        //        }
        //   172: getstatic       net/minecraft/init/Items.field_151062_by:Lnet/minecraft/item/Item;
        //   175: goto            179
        //   178: athrow         
        //   179: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   182: goto            186
        //   185: athrow         
        //   186: istore_2       
        //   187: aload_0        
        //   188: new             Ljava/lang/StringBuilder;
        //   191: dup            
        //   192: goto            196
        //   195: athrow         
        //   196: invokespecial   java/lang/StringBuilder.<init>:()V
        //   199: goto            203
        //   202: athrow         
        //   203: ldc             "\u292a\u14a3\u8051\ub188"
        //   205: goto            209
        //   208: athrow         
        //   209: invokestatic    invokestatic   !!! ERROR
        //   212: goto            216
        //   215: athrow         
        //   216: goto            220
        //   219: athrow         
        //   220: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   223: goto            227
        //   226: athrow         
        //   227: getstatic       dev/nuker/pyro/fbi.c:Ldev/nuker/pyro/fbi;
        //   230: getstatic       net/minecraft/init/Items.field_151062_by:Lnet/minecraft/item/Item;
        //   233: getstatic       dev/nuker/pyro/fc.1:I
        //   236: ifeq            244
        //   239: ldc             1378791380
        //   241: goto            246
        //   244: ldc             1198227538
        //   246: ldc             625875901
        //   248: ixor           
        //   249: lookupswitch {
        //          1835768222: 244
        //          2002826345: 542
        //          default: 276
        //        }
        //   276: goto            280
        //   279: athrow         
        //   280: invokevirtual   dev/nuker/pyro/fbi.c:(Lnet/minecraft/item/Item;)I
        //   283: goto            287
        //   286: athrow         
        //   287: getstatic       dev/nuker/pyro/fc.c:I
        //   290: ifge            298
        //   293: ldc             2098709488
        //   295: goto            300
        //   298: ldc             472370421
        //   300: ldc             2019813347
        //   302: ixor           
        //   303: lookupswitch {
        //          -134452672: 298
        //          91497491: 548
        //          default: 328
        //        }
        //   328: goto            332
        //   331: athrow         
        //   332: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   335: goto            339
        //   338: athrow         
        //   339: goto            343
        //   342: athrow         
        //   343: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   346: goto            350
        //   349: athrow         
        //   350: getstatic       dev/nuker/pyro/fc.c:I
        //   353: ifge            361
        //   356: ldc             -1918336776
        //   358: goto            363
        //   361: ldc             -514927859
        //   363: ldc             555584867
        //   365: ixor           
        //   366: lookupswitch {
        //          -1397420645: 361
        //          -1068278162: 392
        //          default: 544
        //        }
        //   392: goto            396
        //   395: athrow         
        //   396: invokevirtual   dev/nuker/pyro/faQ.4:(Ljava/lang/String;)V
        //   399: goto            403
        //   402: athrow         
        //   403: iload_2        
        //   404: ifeq            541
        //   407: aload_0        
        //   408: getfield        dev/nuker/pyro/faQ.c:Lnet/minecraft/client/Minecraft;
        //   411: checkcast       Ldev/nuker/pyro/mixin/MinecraftAccessor;
        //   414: getstatic       dev/nuker/pyro/fc.c:I
        //   417: ifge            425
        //   420: ldc             -919299090
        //   422: goto            427
        //   425: ldc             1223183773
        //   427: ldc             2102361606
        //   429: ixor           
        //   430: lookupswitch {
        //          -1266948632: 550
        //          831349936: 425
        //          default: 456
        //        }
        //   456: aload_0        
        //   457: getfield        dev/nuker/pyro/faQ.c:Ldev/nuker/pyro/f0g;
        //   460: goto            464
        //   463: athrow         
        //   464: invokevirtual   dev/nuker/pyro/f0g.3:()Ljava/lang/Object;
        //   467: goto            471
        //   470: athrow         
        //   471: checkcast       Ljava/lang/Integer;
        //   474: goto            478
        //   477: athrow         
        //   478: invokevirtual   java/lang/Integer.intValue:()I
        //   481: goto            485
        //   484: athrow         
        //   485: getstatic       dev/nuker/pyro/fc.1:I
        //   488: ifeq            496
        //   491: ldc             -1531348024
        //   493: goto            498
        //   496: ldc             -461517677
        //   498: ldc             -1721081345
        //   500: ixor           
        //   501: lookupswitch {
        //          1037244983: 496
        //          2098703724: 528
        //          default: 554
        //        }
        //   528: goto            532
        //   531: athrow         
        //   532: invokeinterface dev/nuker/pyro/mixin/MinecraftAccessor.setRightClickDelayTimer:(I)V
        //   537: goto            541
        //   540: athrow         
        //   541: return         
        //   542: aconst_null    
        //   543: athrow         
        //   544: aconst_null    
        //   545: athrow         
        //   546: aconst_null    
        //   547: athrow         
        //   548: aconst_null    
        //   549: athrow         
        //   550: aconst_null    
        //   551: athrow         
        //   552: aconst_null    
        //   553: athrow         
        //   554: aconst_null    
        //   555: athrow         
        //   556: pop            
        //   557: goto            24
        //   560: pop            
        //   561: aconst_null    
        //   562: goto            556
        //   565: dup            
        //   566: ifnull          556
        //   569: checkcast       Ljava/lang/Throwable;
        //   572: athrow         
        //   573: dup            
        //   574: ifnull          560
        //   577: checkcast       Ljava/lang/Throwable;
        //   580: athrow         
        //   581: aconst_null    
        //   582: athrow         
        //    StackMapTable: 00 61 FF 00 03 00 03 07 00 03 07 00 AE 01 00 01 07 00 31 FA 00 04 FF 00 0B 00 00 00 01 07 00 31 FD 00 03 07 00 03 07 00 AE FF 00 08 00 03 07 00 03 07 00 AE 01 00 01 07 00 31 40 07 00 35 45 07 00 31 40 07 00 62 45 07 00 31 40 07 00 3B 45 07 00 31 40 01 54 07 00 4D FF 00 01 00 03 07 00 03 07 00 AE 01 00 02 07 00 4D 01 5D 07 00 4D FF 00 02 00 00 00 01 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 01 07 00 4D 45 07 00 31 40 07 00 53 42 07 00 31 40 07 00 53 45 07 00 31 40 07 00 B0 4A 07 00 B0 FF 00 01 00 03 07 00 03 07 00 AE 01 00 02 07 00 B0 01 5C 07 00 B0 45 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 02 07 00 B0 07 00 B0 45 07 00 31 40 01 FF 00 08 00 00 00 01 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 03 07 00 03 08 00 BC 08 00 BC 45 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 02 07 00 03 07 00 68 44 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 03 07 00 03 07 00 68 07 00 B2 45 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 03 07 00 03 07 00 68 07 00 B2 42 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 03 07 00 03 07 00 68 07 00 B2 45 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 02 07 00 03 07 00 68 FF 00 10 00 03 07 00 03 07 00 AE 01 00 04 07 00 03 07 00 68 07 00 79 07 00 B0 FF 00 01 00 03 07 00 03 07 00 AE 01 00 05 07 00 03 07 00 68 07 00 79 07 00 B0 01 FF 00 1D 00 03 07 00 03 07 00 AE 01 00 04 07 00 03 07 00 68 07 00 79 07 00 B0 FF 00 02 00 00 00 01 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 04 07 00 03 07 00 68 07 00 79 07 00 B0 45 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 03 07 00 03 07 00 68 01 FF 00 0A 00 03 07 00 03 07 00 AE 01 00 03 07 00 03 07 00 68 01 FF 00 01 00 03 07 00 03 07 00 AE 01 00 04 07 00 03 07 00 68 01 01 FF 00 1B 00 03 07 00 03 07 00 AE 01 00 03 07 00 03 07 00 68 01 42 07 00 28 FF 00 00 00 03 07 00 03 07 00 AE 01 00 03 07 00 03 07 00 68 01 45 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 02 07 00 03 07 00 68 42 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 02 07 00 03 07 00 68 45 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 02 07 00 03 07 00 B2 FF 00 0A 00 03 07 00 03 07 00 AE 01 00 02 07 00 03 07 00 B2 FF 00 01 00 03 07 00 03 07 00 AE 01 00 03 07 00 03 07 00 B2 01 FF 00 1C 00 03 07 00 03 07 00 AE 01 00 02 07 00 03 07 00 B2 42 07 00 28 FF 00 00 00 03 07 00 03 07 00 AE 01 00 02 07 00 03 07 00 B2 45 07 00 31 00 55 07 00 97 FF 00 01 00 03 07 00 03 07 00 AE 01 00 02 07 00 97 01 5C 07 00 97 46 07 00 1A FF 00 00 00 03 07 00 03 07 00 AE 01 00 02 07 00 97 07 00 9E 45 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 02 07 00 97 07 00 62 45 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 02 07 00 97 07 00 A1 45 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 02 07 00 97 01 FF 00 0A 00 03 07 00 03 07 00 AE 01 00 02 07 00 97 01 FF 00 01 00 03 07 00 03 07 00 AE 01 00 03 07 00 97 01 01 FF 00 1D 00 03 07 00 03 07 00 AE 01 00 02 07 00 97 01 42 07 00 31 FF 00 00 00 03 07 00 03 07 00 AE 01 00 02 07 00 97 01 47 07 00 31 00 FF 00 00 00 03 07 00 03 07 00 AE 01 00 04 07 00 03 07 00 68 07 00 79 07 00 B0 FF 00 01 00 03 07 00 03 07 00 AE 01 00 02 07 00 03 07 00 B2 41 07 00 B0 FF 00 01 00 03 07 00 03 07 00 AE 01 00 03 07 00 03 07 00 68 01 41 07 00 97 41 07 00 4D FF 00 01 00 03 07 00 03 07 00 AE 01 00 02 07 00 97 01 FF 00 01 00 02 07 00 03 07 00 AE 00 01 07 00 31 43 05 44 07 00 31 47 05 FF 00 07 00 03 07 00 03 07 00 AE 01 00 01 07 00 31
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     565    573    Any
        //  565    573    565    573    Ljava/lang/RuntimeException;
        //  581    583    3      8      Any
        //  33     40     40     41     Any
        //  34     40     33     34     Ljava/lang/RuntimeException;
        //  33     40     3      8      Any
        //  33     40     33     34     Any
        //  33     40     40     41     Ljava/lang/AssertionError;
        //  47     54     54     55     Any
        //  47     54     3      8      Ljava/lang/NegativeArraySizeException;
        //  48     54     47     48     Ljava/lang/RuntimeException;
        //  47     54     54     55     Ljava/lang/IllegalArgumentException;
        //  47     54     47     48     Any
        //  112    118    118    119    Any
        //  112    118    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  112    118    118    119    Ljava/lang/NullPointerException;
        //  112    118    118    119    Any
        //  112    118    118    119    Ljava/lang/AssertionError;
        //  122    129    129    130    Any
        //  123    129    122    123    Ljava/lang/UnsupportedOperationException;
        //  122    129    3      8      Ljava/lang/ClassCastException;
        //  122    129    122    123    Ljava/lang/AssertionError;
        //  123    129    129    130    Any
        //  178    185    185    186    Any
        //  178    185    178    179    Any
        //  179    185    178    179    Any
        //  179    185    178    179    Any
        //  179    185    185    186    Ljava/lang/ClassCastException;
        //  196    202    202    203    Any
        //  196    202    3      8      Ljava/lang/ArithmeticException;
        //  196    202    3      8      Any
        //  196    202    202    203    Ljava/lang/UnsupportedOperationException;
        //  196    202    3      8      Any
        //  208    215    215    216    Any
        //  208    215    208    209    Ljava/util/ConcurrentModificationException;
        //  208    215    3      8      Ljava/lang/IllegalArgumentException;
        //  209    215    3      8      Ljava/lang/NullPointerException;
        //  209    215    208    209    Any
        //  219    226    226    227    Any
        //  220    226    219    220    Any
        //  220    226    219    220    Any
        //  219    226    219    220    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  219    226    219    220    Ljava/lang/NegativeArraySizeException;
        //  280    286    286    287    Any
        //  280    286    286    287    Any
        //  280    286    286    287    Ljava/lang/NumberFormatException;
        //  280    286    3      8      Any
        //  280    286    286    287    Ljava/lang/RuntimeException;
        //  331    338    338    339    Any
        //  331    338    338    339    Any
        //  331    338    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  332    338    338    339    Ljava/lang/EnumConstantNotPresentException;
        //  331    338    331    332    Ljava/lang/StringIndexOutOfBoundsException;
        //  342    349    349    350    Any
        //  343    349    349    350    Ljava/lang/RuntimeException;
        //  343    349    349    350    Any
        //  342    349    349    350    Ljava/util/ConcurrentModificationException;
        //  342    349    342    343    Any
        //  395    402    402    403    Any
        //  395    402    402    403    Ljava/lang/IllegalStateException;
        //  396    402    402    403    Any
        //  396    402    402    403    Any
        //  395    402    395    396    Ljava/lang/StringIndexOutOfBoundsException;
        //  463    470    470    471    Any
        //  464    470    470    471    Any
        //  463    470    470    471    Ljava/lang/ClassCastException;
        //  464    470    463    464    Ljava/lang/NullPointerException;
        //  463    470    3      8      Ljava/lang/AssertionError;
        //  477    484    484    485    Any
        //  478    484    3      8      Ljava/lang/NegativeArraySizeException;
        //  478    484    3      8      Any
        //  478    484    477    478    Any
        //  477    484    477    478    Ljava/lang/IllegalStateException;
        //  531    540    540    541    Any
        //  532    540    540    541    Ljava/lang/NullPointerException;
        //  531    540    531    532    Any
        //  532    540    540    541    Any
        //  531    540    540    541    Any
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
    
    @f06(50)
    public void c(final f3i p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          3228
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            3220
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            3212
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/faQ.c:Lnet/minecraft/client/Minecraft;
        //    28: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //    31: ifnull          90
        //    34: aload_0        
        //    35: getfield        dev/nuker/pyro/faQ.c:Lnet/minecraft/client/Minecraft;
        //    38: getstatic       dev/nuker/pyro/fc.c:I
        //    41: ifge            49
        //    44: ldc             -1572646232
        //    46: goto            51
        //    49: ldc             -523605805
        //    51: ldc             -1470346809
        //    53: ixor           
        //    54: lookupswitch {
        //          169810799: 49
        //          1217798420: 80
        //          default: 3157
        //        }
        //    80: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //    83: instanceof      Lnet/minecraft/client/gui/inventory/GuiInventory;
        //    86: ifne            90
        //    89: return         
        //    90: getstatic       dev/nuker/pyro/fc.c:I
        //    93: ifge            101
        //    96: ldc             -610099265
        //    98: goto            103
        //   101: ldc             481718211
        //   103: ldc             -180084118
        //   105: ixor           
        //   106: lookupswitch {
        //          786873813: 3181
        //          2082585807: 101
        //          default: 132
        //        }
        //   132: aload_1        
        //   133: goto            137
        //   136: athrow         
        //   137: invokevirtual   dev/nuker/pyro/f3i.c:()Ldev/nuker/pyro/f2T;
        //   140: goto            144
        //   143: athrow         
        //   144: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //   147: if_acmpne       3116
        //   150: aload_0        
        //   151: getfield        dev/nuker/pyro/faQ.c:Ldev/nuker/pyro/f0h;
        //   154: getstatic       dev/nuker/pyro/fc.1:I
        //   157: ifeq            165
        //   160: ldc             980781998
        //   162: goto            167
        //   165: ldc             -1440902868
        //   167: ldc             -935928719
        //   169: ixor           
        //   170: lookupswitch {
        //          -1744648038: 165
        //          -230467617: 3149
        //          default: 196
        //        }
        //   196: goto            200
        //   199: athrow         
        //   200: invokevirtual   dev/nuker/pyro/f0h.3:()Ljava/lang/Object;
        //   203: goto            207
        //   206: athrow         
        //   207: checkcast       Ljava/lang/Integer;
        //   210: goto            214
        //   213: athrow         
        //   214: invokevirtual   java/lang/Integer.intValue:()I
        //   217: goto            221
        //   220: athrow         
        //   221: iconst_m1      
        //   222: if_icmpeq       3116
        //   225: aload_0        
        //   226: getfield        dev/nuker/pyro/faQ.c:Ldev/nuker/pyro/f0h;
        //   229: goto            233
        //   232: athrow         
        //   233: invokevirtual   dev/nuker/pyro/f0h.3:()Ljava/lang/Object;
        //   236: goto            240
        //   239: athrow         
        //   240: checkcast       Ljava/lang/Integer;
        //   243: goto            247
        //   246: athrow         
        //   247: invokevirtual   java/lang/Integer.intValue:()I
        //   250: goto            254
        //   253: athrow         
        //   254: ifeq            3116
        //   257: aload_0        
        //   258: getfield        dev/nuker/pyro/faQ.c:Ldev/nuker/pyro/f0h;
        //   261: goto            265
        //   264: athrow         
        //   265: invokevirtual   dev/nuker/pyro/f0h.3:()Ljava/lang/Object;
        //   268: goto            272
        //   271: athrow         
        //   272: checkcast       Ljava/lang/Integer;
        //   275: goto            279
        //   278: athrow         
        //   279: invokevirtual   java/lang/Integer.intValue:()I
        //   282: goto            286
        //   285: athrow         
        //   286: ifle            411
        //   289: aload_0        
        //   290: getfield        dev/nuker/pyro/faQ.c:Ldev/nuker/pyro/f0h;
        //   293: getstatic       dev/nuker/pyro/fc.c:I
        //   296: ifge            304
        //   299: ldc             -361613777
        //   301: goto            306
        //   304: ldc             -1753061414
        //   306: ldc             -282315368
        //   308: ixor           
        //   309: lookupswitch {
        //          -962739999: 304
        //          90047415: 3193
        //          default: 336
        //        }
        //   336: goto            340
        //   339: athrow         
        //   340: invokevirtual   dev/nuker/pyro/f0h.3:()Ljava/lang/Object;
        //   343: goto            347
        //   346: athrow         
        //   347: checkcast       Ljava/lang/Integer;
        //   350: goto            354
        //   353: athrow         
        //   354: invokevirtual   java/lang/Integer.intValue:()I
        //   357: goto            361
        //   360: athrow         
        //   361: goto            365
        //   364: athrow         
        //   365: invokestatic    org/lwjgl/input/Keyboard.isKeyDown:(I)Z
        //   368: goto            372
        //   371: athrow         
        //   372: ifeq            380
        //   375: ldc             -1284026168
        //   377: goto            382
        //   380: ldc             -1284026167
        //   382: ldc             -1039888120
        //   384: ixor           
        //   385: tableswitch {
        //          -488144000: 408
        //          -488143999: 3116
        //          default: 375
        //        }
        //   408: goto            582
        //   411: aload_0        
        //   412: getstatic       dev/nuker/pyro/fc.c:I
        //   415: ifge            423
        //   418: ldc             -606927826
        //   420: goto            425
        //   423: ldc             1283228104
        //   425: ldc             1010023505
        //   427: ixor           
        //   428: lookupswitch {
        //          -404703105: 423
        //          1884241305: 456
        //          default: 3175
        //        }
        //   456: getfield        dev/nuker/pyro/faQ.c:Ldev/nuker/pyro/f0h;
        //   459: getstatic       dev/nuker/pyro/fc.1:I
        //   462: ifeq            470
        //   465: ldc             -1096211302
        //   467: goto            472
        //   470: ldc             -376264231
        //   472: ldc             -1963422934
        //   474: ixor           
        //   475: lookupswitch {
        //          877768624: 3195
        //          1726227646: 470
        //          default: 500
        //        }
        //   500: goto            504
        //   503: athrow         
        //   504: invokevirtual   dev/nuker/pyro/f0h.3:()Ljava/lang/Object;
        //   507: goto            511
        //   510: athrow         
        //   511: checkcast       Ljava/lang/Integer;
        //   514: goto            518
        //   517: athrow         
        //   518: invokevirtual   java/lang/Integer.intValue:()I
        //   521: goto            525
        //   524: athrow         
        //   525: ineg           
        //   526: getstatic       dev/nuker/pyro/fc.1:I
        //   529: ifeq            537
        //   532: ldc             796965029
        //   534: goto            539
        //   537: ldc             -133916539
        //   539: ldc             -1042696715
        //   541: ixor           
        //   542: lookupswitch {
        //          -1020170556: 537
        //          -296153776: 3141
        //          default: 568
        //        }
        //   568: goto            572
        //   571: athrow         
        //   572: invokestatic    org/lwjgl/input/Mouse.isButtonDown:(I)Z
        //   575: goto            579
        //   578: athrow         
        //   579: ifeq            3116
        //   582: iconst_m1      
        //   583: getstatic       dev/nuker/pyro/fc.c:I
        //   586: ifge            594
        //   589: ldc             -2037525176
        //   591: goto            596
        //   594: ldc             -1643499636
        //   596: ldc             -283880721
        //   598: ixor           
        //   599: lookupswitch {
        //          1771669415: 594
        //          1897823587: 624
        //          default: 3187
        //        }
        //   624: istore_2       
        //   625: iconst_0       
        //   626: getstatic       dev/nuker/pyro/fc.c:I
        //   629: ifge            637
        //   632: ldc             -1790860054
        //   634: goto            639
        //   637: ldc             719308288
        //   639: ldc             -1878878576
        //   641: ixor           
        //   642: lookupswitch {
        //          88289914: 3117
        //          192134299: 637
        //          default: 668
        //        }
        //   668: istore_3       
        //   669: iload_3        
        //   670: bipush          9
        //   672: if_icmpge       827
        //   675: aload_0        
        //   676: getfield        dev/nuker/pyro/faQ.c:Lnet/minecraft/client/Minecraft;
        //   679: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   682: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   685: iload_3        
        //   686: goto            690
        //   689: athrow         
        //   690: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70301_a:(I)Lnet/minecraft/item/ItemStack;
        //   693: goto            697
        //   696: athrow         
        //   697: goto            701
        //   700: athrow         
        //   701: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   704: goto            708
        //   707: athrow         
        //   708: getstatic       net/minecraft/init/Items.field_151062_by:Lnet/minecraft/item/Item;
        //   711: getstatic       dev/nuker/pyro/fc.1:I
        //   714: ifeq            723
        //   717: ldc_w           2027838487
        //   720: goto            726
        //   723: ldc_w           -1912933479
        //   726: ldc_w           1478503426
        //   729: ixor           
        //   730: lookupswitch {
        //          -707076197: 756
        //          553545749: 723
        //          default: 3121
        //        }
        //   756: goto            760
        //   759: athrow         
        //   760: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   763: goto            767
        //   766: athrow         
        //   767: ifeq            821
        //   770: getstatic       dev/nuker/pyro/fc.c:I
        //   773: ifge            782
        //   776: ldc_w           2050759933
        //   779: goto            785
        //   782: ldc_w           861063963
        //   785: ldc_w           -682648938
        //   788: ixor           
        //   789: lookupswitch {
        //          -1384937877: 782
        //          -467840627: 816
        //          default: 3189
        //        }
        //   816: iload_3        
        //   817: istore_2       
        //   818: goto            827
        //   821: iinc            3, 1
        //   824: goto            669
        //   827: iload_2        
        //   828: iconst_m1      
        //   829: if_icmpeq       838
        //   832: ldc_w           -1846178237
        //   835: goto            841
        //   838: ldc_w           -1846178180
        //   841: ldc_w           -1639315300
        //   844: ixor           
        //   845: tableswitch {
        //          528420286: 868
        //          528420287: 3116
        //          default: 832
        //        }
        //   868: aload_0        
        //   869: getstatic       dev/nuker/pyro/fc.0:I
        //   872: ifeq            881
        //   875: ldc_w           1383999203
        //   878: goto            884
        //   881: ldc_w           -422999055
        //   884: ldc_w           820081267
        //   887: ixor           
        //   888: lookupswitch {
        //          -701957758: 916
        //          1654609040: 881
        //          default: 3133
        //        }
        //   916: getfield        dev/nuker/pyro/faQ.c:Lnet/minecraft/client/Minecraft;
        //   919: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   922: goto            926
        //   925: athrow         
        //   926: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184193_aE:()Ljava/lang/Iterable;
        //   929: goto            933
        //   932: athrow         
        //   933: goto            937
        //   936: athrow         
        //   937: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   942: goto            946
        //   945: athrow         
        //   946: getstatic       dev/nuker/pyro/fc.0:I
        //   949: ifeq            958
        //   952: ldc_w           -2135235418
        //   955: goto            961
        //   958: ldc_w           -1437524739
        //   961: ldc_w           112903718
        //   964: ixor           
        //   965: lookupswitch {
        //          -2046811520: 958
        //          -1393829157: 992
        //          default: 3197
        //        }
        //   992: astore_3       
        //   993: iconst_0       
        //   994: istore          4
        //   996: bipush          44
        //   998: dup            
        //   999: istore          5
        //  1001: istore          6
        //  1003: getstatic       dev/nuker/pyro/fc.0:I
        //  1006: ifeq            1015
        //  1009: ldc_w           -2107506181
        //  1012: goto            1018
        //  1015: ldc_w           1676692559
        //  1018: ldc_w           498246141
        //  1021: ixor           
        //  1022: lookupswitch {
        //          -1613717498: 1015
        //          2118315442: 1048
        //          default: 3123
        //        }
        //  1048: iload           6
        //  1050: bipush          9
        //  1052: if_icmplt       1061
        //  1055: ldc_w           1059109042
        //  1058: goto            1064
        //  1061: ldc_w           1059109045
        //  1064: ldc_w           -1401989063
        //  1067: ixor           
        //  1068: tableswitch {
        //          648003862: 1092
        //          648003863: 1289
        //          default: 1055
        //        }
        //  1092: getstatic       dev/nuker/pyro/fc.c:I
        //  1095: ifge            1104
        //  1098: ldc_w           -1246268882
        //  1101: goto            1107
        //  1104: ldc_w           2072094391
        //  1107: ldc_w           781211742
        //  1110: ixor           
        //  1111: lookupswitch {
        //          -1691932048: 1104
        //          1427242729: 1136
        //          default: 3169
        //        }
        //  1136: aload_0        
        //  1137: getfield        dev/nuker/pyro/faQ.c:Lnet/minecraft/client/Minecraft;
        //  1140: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1143: getstatic       dev/nuker/pyro/fc.0:I
        //  1146: ifeq            1155
        //  1149: ldc_w           -1390880694
        //  1152: goto            1158
        //  1155: ldc_w           1264969927
        //  1158: ldc_w           -1043546228
        //  1161: ixor           
        //  1162: lookupswitch {
        //          -1968613557: 1188
        //          1825859526: 1155
        //          default: 3125
        //        }
        //  1188: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //  1191: iload           5
        //  1193: getstatic       dev/nuker/pyro/fc.c:I
        //  1196: ifge            1205
        //  1199: ldc_w           203599684
        //  1202: goto            1208
        //  1205: ldc_w           -445565977
        //  1208: ldc_w           -1432855038
        //  1211: ixor           
        //  1212: lookupswitch {
        //          -1893684653: 1205
        //          -1497697978: 3179
        //          default: 1240
        //        }
        //  1240: goto            1244
        //  1243: athrow         
        //  1244: invokevirtual   net/minecraft/inventory/Container.func_75139_a:(I)Lnet/minecraft/inventory/Slot;
        //  1247: goto            1251
        //  1250: athrow         
        //  1251: goto            1255
        //  1254: athrow         
        //  1255: invokevirtual   net/minecraft/inventory/Slot.func_75211_c:()Lnet/minecraft/item/ItemStack;
        //  1258: goto            1262
        //  1261: athrow         
        //  1262: goto            1266
        //  1265: athrow         
        //  1266: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //  1269: goto            1273
        //  1272: athrow         
        //  1273: ifeq            1279
        //  1276: iinc            4, 1
        //  1279: iinc            5, -1
        //  1282: iload           5
        //  1284: istore          6
        //  1286: goto            1003
        //  1289: aload_0        
        //  1290: iconst_0       
        //  1291: putfield        dev/nuker/pyro/faQ.c:Z
        //  1294: new             Ljava/util/LinkedList;
        //  1297: dup            
        //  1298: goto            1302
        //  1301: athrow         
        //  1302: invokespecial   java/util/LinkedList.<init>:()V
        //  1305: goto            1309
        //  1308: athrow         
        //  1309: astore          7
        //  1311: getstatic       dev/nuker/pyro/fc.0:I
        //  1314: ifeq            1323
        //  1317: ldc_w           242049633
        //  1320: goto            1326
        //  1323: ldc_w           -1046975809
        //  1326: ldc_w           -518050323
        //  1329: ixor           
        //  1330: lookupswitch {
        //          -277721204: 1323
        //          545736530: 1356
        //          default: 3129
        //        }
        //  1356: aload_3        
        //  1357: goto            1361
        //  1360: athrow         
        //  1361: invokeinterface java/util/Iterator.hasNext:()Z
        //  1366: goto            1370
        //  1369: athrow         
        //  1370: ifeq            2554
        //  1373: aload_3        
        //  1374: goto            1378
        //  1377: athrow         
        //  1378: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1383: goto            1387
        //  1386: athrow         
        //  1387: checkcast       Lnet/minecraft/item/ItemStack;
        //  1390: astore          8
        //  1392: aload           8
        //  1394: goto            1398
        //  1397: athrow         
        //  1398: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //  1401: goto            1405
        //  1404: athrow         
        //  1405: ifne            2551
        //  1408: aload           8
        //  1410: getstatic       dev/nuker/pyro/fc.1:I
        //  1413: ifeq            1422
        //  1416: ldc_w           1503930799
        //  1419: goto            1425
        //  1422: ldc_w           15172862
        //  1425: ldc_w           -1889377835
        //  1428: ixor           
        //  1429: lookupswitch {
        //          -1887050453: 1456
        //          -691648390: 1422
        //          default: 3151
        //        }
        //  1456: goto            1460
        //  1459: athrow         
        //  1460: invokevirtual   net/minecraft/item/ItemStack.func_77958_k:()I
        //  1463: goto            1467
        //  1466: athrow         
        //  1467: getstatic       dev/nuker/pyro/fc.c:I
        //  1470: ifge            1479
        //  1473: ldc_w           1172172724
        //  1476: goto            1482
        //  1479: ldc_w           660640888
        //  1482: ldc_w           -1993920949
        //  1485: ixor           
        //  1486: lookupswitch {
        //          -1371030989: 1512
        //          -855981569: 1479
        //          default: 3159
        //        }
        //  1512: aload           8
        //  1514: getstatic       dev/nuker/pyro/fc.0:I
        //  1517: ifeq            1526
        //  1520: ldc_w           1962272639
        //  1523: goto            1529
        //  1526: ldc_w           1525987069
        //  1529: ldc_w           -1645000648
        //  1532: ixor           
        //  1533: lookupswitch {
        //          -385437881: 3139
        //          660719344: 1526
        //          default: 1560
        //        }
        //  1560: goto            1564
        //  1563: athrow         
        //  1564: invokevirtual   net/minecraft/item/ItemStack.func_77952_i:()I
        //  1567: goto            1571
        //  1570: athrow         
        //  1571: isub           
        //  1572: i2f            
        //  1573: aload           8
        //  1575: goto            1579
        //  1578: athrow         
        //  1579: invokevirtual   net/minecraft/item/ItemStack.func_77958_k:()I
        //  1582: goto            1586
        //  1585: athrow         
        //  1586: i2f            
        //  1587: fdiv           
        //  1588: ldc_w           100.0
        //  1591: fmul           
        //  1592: fstore          9
        //  1594: getstatic       dev/nuker/pyro/fc.c:I
        //  1597: ifge            1606
        //  1600: ldc_w           1533235873
        //  1603: goto            1609
        //  1606: ldc_w           1954262145
        //  1609: ldc_w           -916173424
        //  1612: ixor           
        //  1613: lookupswitch {
        //          -1845027023: 3163
        //          1224076612: 1606
        //          default: 1640
        //        }
        //  1640: fload           9
        //  1642: aload_0        
        //  1643: getfield        dev/nuker/pyro/faQ.0:Ldev/nuker/pyro/f0g;
        //  1646: goto            1650
        //  1649: athrow         
        //  1650: invokevirtual   dev/nuker/pyro/f0g.3:()Ljava/lang/Object;
        //  1653: goto            1657
        //  1656: athrow         
        //  1657: checkcast       Ljava/lang/Integer;
        //  1660: goto            1664
        //  1663: athrow         
        //  1664: invokevirtual   java/lang/Integer.intValue:()I
        //  1667: goto            1671
        //  1670: athrow         
        //  1671: i2f            
        //  1672: fcmpl          
        //  1673: iflt            2371
        //  1676: iconst_0       
        //  1677: getstatic       dev/nuker/pyro/fc.0:I
        //  1680: ifeq            1689
        //  1683: ldc_w           918359411
        //  1686: goto            1692
        //  1689: ldc_w           940796243
        //  1692: ldc_w           454960987
        //  1695: ixor           
        //  1696: lookupswitch {
        //          -558235988: 1689
        //          765667880: 3161
        //          default: 1724
        //        }
        //  1724: istore          10
        //  1726: aload           8
        //  1728: goto            1732
        //  1731: athrow         
        //  1732: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  1735: goto            1739
        //  1738: athrow         
        //  1739: getstatic       net/minecraft/init/Items.field_185160_cR:Lnet/minecraft/item/Item;
        //  1742: goto            1746
        //  1745: athrow         
        //  1746: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //  1749: goto            1753
        //  1752: athrow         
        //  1753: ifeq            1762
        //  1756: ldc_w           172260479
        //  1759: goto            1765
        //  1762: ldc_w           172260476
        //  1765: ldc_w           1522472442
        //  1768: ixor           
        //  1769: tableswitch {
        //          -1577659638: 1792
        //          -1577659637: 1845
        //          default: 1756
        //        }
        //  1792: bipush          6
        //  1794: getstatic       dev/nuker/pyro/fc.c:I
        //  1797: ifge            1806
        //  1800: ldc_w           1368144077
        //  1803: goto            1809
        //  1806: ldc_w           1036854559
        //  1809: ldc_w           359558384
        //  1812: ixor           
        //  1813: lookupswitch {
        //          -740370053: 1806
        //          1155683389: 3127
        //          default: 1840
        //        }
        //  1840: istore          10
        //  1842: goto            2236
        //  1845: aload           8
        //  1847: goto            1851
        //  1850: athrow         
        //  1851: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  1854: goto            1858
        //  1857: athrow         
        //  1858: instanceof      Lnet/minecraft/item/ItemArmor;
        //  1861: ifeq            2236
        //  1864: getstatic       dev/nuker/pyro/fc.c:I
        //  1867: ifge            1876
        //  1870: ldc_w           -1649902326
        //  1873: goto            1879
        //  1876: ldc_w           767728521
        //  1879: ldc_w           -1243455698
        //  1882: ixor           
        //  1883: lookupswitch {
        //          170120862: 1876
        //          675947044: 3199
        //          default: 1908
        //        }
        //  1908: aload           8
        //  1910: getstatic       dev/nuker/pyro/fc.1:I
        //  1913: ifeq            1922
        //  1916: ldc_w           120295208
        //  1919: goto            1925
        //  1922: ldc_w           2048949520
        //  1925: ldc_w           474878857
        //  1928: ixor           
        //  1929: lookupswitch {
        //          -138726312: 1922
        //          459644065: 3131
        //          default: 1956
        //        }
        //  1956: goto            1960
        //  1959: athrow         
        //  1960: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //  1963: goto            1967
        //  1966: athrow         
        //  1967: checkcast       Lnet/minecraft/item/ItemArmor;
        //  1970: astore          11
        //  1972: getstatic       dev/nuker/pyro/fc.0:I
        //  1975: ifeq            1984
        //  1978: ldc_w           319583041
        //  1981: goto            1987
        //  1984: ldc_w           -1794251852
        //  1987: ldc_w           1818446594
        //  1990: ixor           
        //  1991: lookupswitch {
        //          -765577004: 1984
        //          2137995331: 3143
        //          default: 2016
        //        }
        //  2016: getstatic       dev/nuker/pyro/faP.c:[I
        //  2019: getstatic       dev/nuker/pyro/fc.c:I
        //  2022: ifge            2031
        //  2025: ldc_w           -247716368
        //  2028: goto            2034
        //  2031: ldc_w           565244717
        //  2034: ldc_w           -895194923
        //  2037: ixor           
        //  2038: lookupswitch {
        //          906000521: 2031
        //          999836965: 3119
        //          default: 2064
        //        }
        //  2064: aload           11
        //  2066: getstatic       dev/nuker/pyro/fc.c:I
        //  2069: ifge            2078
        //  2072: ldc_w           -996901561
        //  2075: goto            2081
        //  2078: ldc_w           -1091581839
        //  2081: ldc_w           -70912657
        //  2084: ixor           
        //  2085: lookupswitch {
        //          1062307880: 2078
        //          1160396062: 2112
        //          default: 3183
        //        }
        //  2112: goto            2116
        //  2115: athrow         
        //  2116: invokevirtual   net/minecraft/item/ItemArmor.func_185083_B_:()Lnet/minecraft/inventory/EntityEquipmentSlot;
        //  2119: goto            2123
        //  2122: athrow         
        //  2123: getstatic       dev/nuker/pyro/fc.0:I
        //  2126: ifeq            2135
        //  2129: ldc_w           985558100
        //  2132: goto            2138
        //  2135: ldc_w           837097053
        //  2138: ldc_w           -48488847
        //  2141: ixor           
        //  2142: lookupswitch {
        //          -945655259: 2135
        //          -856094676: 2168
        //          default: 3165
        //        }
        //  2168: goto            2172
        //  2171: athrow         
        //  2172: invokevirtual   net/minecraft/inventory/EntityEquipmentSlot.ordinal:()I
        //  2175: goto            2179
        //  2178: athrow         
        //  2179: iaload         
        //  2180: tableswitch {
        //                2: 2212
        //                3: 2218
        //                4: 2225
        //                5: 2232
        //          default: 2236
        //        }
        //  2212: iconst_5       
        //  2213: istore          10
        //  2215: goto            2236
        //  2218: bipush          6
        //  2220: istore          10
        //  2222: goto            2236
        //  2225: bipush          7
        //  2227: istore          10
        //  2229: goto            2236
        //  2232: bipush          8
        //  2234: istore          10
        //  2236: aload           7
        //  2238: getstatic       dev/nuker/pyro/fc.1:I
        //  2241: ifeq            2250
        //  2244: ldc_w           683499935
        //  2247: goto            2253
        //  2250: ldc_w           138755444
        //  2253: ldc_w           81494529
        //  2256: ixor           
        //  2257: lookupswitch {
        //          -1229982485: 2250
        //          744940446: 3145
        //          default: 2284
        //        }
        //  2284: iload           10
        //  2286: goto            2290
        //  2289: athrow         
        //  2290: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2293: goto            2297
        //  2296: athrow         
        //  2297: goto            2301
        //  2300: athrow         
        //  2301: invokeinterface java/util/Queue.add:(Ljava/lang/Object;)Z
        //  2306: goto            2310
        //  2309: athrow         
        //  2310: pop            
        //  2311: iinc            4, -1
        //  2314: getstatic       dev/nuker/pyro/fc.0:I
        //  2317: ifeq            2326
        //  2320: ldc_w           -332932268
        //  2323: goto            2329
        //  2326: ldc_w           -1022628002
        //  2329: ldc_w           -1612102815
        //  2332: ixor           
        //  2333: lookupswitch {
        //          1558359103: 2360
        //          1942919221: 2326
        //          default: 3201
        //        }
        //  2360: iload           4
        //  2362: ifne            2368
        //  2365: goto            2554
        //  2368: goto            2551
        //  2371: fload           9
        //  2373: getstatic       dev/nuker/pyro/fc.0:I
        //  2376: ifeq            2385
        //  2379: ldc_w           -677549111
        //  2382: goto            2388
        //  2385: ldc_w           63460500
        //  2388: ldc_w           -44659949
        //  2391: ixor           
        //  2392: lookupswitch {
        //          -865138277: 2385
        //          718004442: 3135
        //          default: 2420
        //        }
        //  2420: aload_0        
        //  2421: getfield        dev/nuker/pyro/faQ.1:Ldev/nuker/pyro/f0g;
        //  2424: goto            2428
        //  2427: athrow         
        //  2428: invokevirtual   dev/nuker/pyro/f0g.3:()Ljava/lang/Object;
        //  2431: goto            2435
        //  2434: athrow         
        //  2435: checkcast       Ljava/lang/Integer;
        //  2438: getstatic       dev/nuker/pyro/fc.c:I
        //  2441: ifge            2450
        //  2444: ldc_w           573252010
        //  2447: goto            2453
        //  2450: ldc_w           1452309539
        //  2453: ldc_w           760981619
        //  2456: ixor           
        //  2457: lookupswitch {
        //          -1982855541: 2450
        //          259033561: 3171
        //          default: 2484
        //        }
        //  2484: goto            2488
        //  2487: athrow         
        //  2488: invokevirtual   java/lang/Integer.intValue:()I
        //  2491: goto            2495
        //  2494: athrow         
        //  2495: i2f            
        //  2496: fcmpg          
        //  2497: ifgt            2551
        //  2500: aload_0        
        //  2501: iconst_1       
        //  2502: getstatic       dev/nuker/pyro/fc.0:I
        //  2505: ifeq            2514
        //  2508: ldc_w           -1626075377
        //  2511: goto            2517
        //  2514: ldc_w           863425490
        //  2517: ldc_w           2067378446
        //  2520: ixor           
        //  2521: lookupswitch {
        //          -1429549473: 2514
        //          -466764287: 3185
        //          default: 2548
        //        }
        //  2548: putfield        dev/nuker/pyro/faQ.c:Z
        //  2551: goto            1311
        //  2554: aload_0        
        //  2555: getfield        dev/nuker/pyro/faQ.c:Z
        //  2558: ifne            2562
        //  2561: return         
        //  2562: aload           7
        //  2564: goto            2568
        //  2567: athrow         
        //  2568: invokeinterface java/util/Queue.isEmpty:()Z
        //  2573: goto            2577
        //  2576: athrow         
        //  2577: ifne            2823
        //  2580: getstatic       dev/nuker/pyro/fc.c:I
        //  2583: ifge            2592
        //  2586: ldc_w           -776235290
        //  2589: goto            2595
        //  2592: ldc_w           -482156541
        //  2595: ldc_w           -271173179
        //  2598: ixor           
        //  2599: lookupswitch {
        //          93863615: 2592
        //          1047375651: 3191
        //          default: 2624
        //        }
        //  2624: aload_0        
        //  2625: getfield        dev/nuker/pyro/faQ.c:Lnet/minecraft/client/Minecraft;
        //  2628: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  2631: iconst_0       
        //  2632: aload           7
        //  2634: goto            2638
        //  2637: athrow         
        //  2638: invokeinterface java/util/Queue.poll:()Ljava/lang/Object;
        //  2643: goto            2647
        //  2646: athrow         
        //  2647: checkcast       Ljava/lang/Integer;
        //  2650: goto            2654
        //  2653: athrow         
        //  2654: invokevirtual   java/lang/Integer.intValue:()I
        //  2657: goto            2661
        //  2660: athrow         
        //  2661: iconst_0       
        //  2662: getstatic       dev/nuker/pyro/fc.c:I
        //  2665: ifge            2674
        //  2668: ldc_w           731896075
        //  2671: goto            2677
        //  2674: ldc_w           445481035
        //  2677: ldc_w           -1193375920
        //  2680: ixor           
        //  2681: lookupswitch {
        //          -1824432549: 3173
        //          2093251721: 2674
        //          default: 2708
        //        }
        //  2708: getstatic       net/minecraft/inventory/ClickType.QUICK_MOVE:Lnet/minecraft/inventory/ClickType;
        //  2711: aload_0        
        //  2712: getfield        dev/nuker/pyro/faQ.c:Lnet/minecraft/client/Minecraft;
        //  2715: getstatic       dev/nuker/pyro/fc.c:I
        //  2718: ifge            2727
        //  2721: ldc_w           -360335448
        //  2724: goto            2730
        //  2727: ldc_w           -1207919572
        //  2730: ldc_w           1476176029
        //  2733: ixor           
        //  2734: lookupswitch {
        //          -1116135627: 2727
        //          -268684111: 2760
        //          default: 3167
        //        }
        //  2760: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2763: getstatic       dev/nuker/pyro/fc.1:I
        //  2766: ifeq            2775
        //  2769: ldc_w           -1600577471
        //  2772: goto            2778
        //  2775: ldc_w           911746577
        //  2778: ldc_w           329559558
        //  2781: ixor           
        //  2782: lookupswitch {
        //          -1287811513: 3137
        //          1376680501: 2775
        //          default: 2808
        //        }
        //  2808: goto            2812
        //  2811: athrow         
        //  2812: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_187098_a:(IIILnet/minecraft/inventory/ClickType;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;
        //  2815: goto            2819
        //  2818: athrow         
        //  2819: pop            
        //  2820: goto            2562
        //  2823: iload_2        
        //  2824: aload_0        
        //  2825: getstatic       dev/nuker/pyro/fc.0:I
        //  2828: ifeq            2837
        //  2831: ldc_w           47009722
        //  2834: goto            2840
        //  2837: ldc_w           -1013738184
        //  2840: ldc_w           -2072560367
        //  2843: ixor           
        //  2844: lookupswitch {
        //          -2034601301: 2837
        //          1206167593: 2872
        //          default: 3147
        //        }
        //  2872: getfield        dev/nuker/pyro/faQ.c:Lnet/minecraft/client/Minecraft;
        //  2875: getstatic       dev/nuker/pyro/fc.1:I
        //  2878: ifeq            2887
        //  2881: ldc_w           2012505487
        //  2884: goto            2890
        //  2887: ldc_w           -301264631
        //  2890: ldc_w           -1418113719
        //  2893: ixor           
        //  2894: lookupswitch {
        //          -594728762: 3153
        //          558035892: 2887
        //          default: 2920
        //        }
        //  2920: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2923: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  2926: getfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //  2929: if_icmpeq       2938
        //  2932: ldc_w           47934131
        //  2935: goto            2941
        //  2938: ldc_w           47934132
        //  2941: ldc_w           203077848
        //  2944: ixor           
        //  2945: tableswitch {
        //          495166678: 2968
        //          495166679: 2972
        //          default: 2932
        //        }
        //  2968: iconst_1       
        //  2969: goto            2973
        //  2972: iconst_0       
        //  2973: istore          8
        //  2975: aload_1        
        //  2976: getstatic       dev/nuker/pyro/fc.c:I
        //  2979: ifge            2988
        //  2982: ldc_w           1090633789
        //  2985: goto            2991
        //  2988: ldc_w           -305268317
        //  2991: ldc_w           -2114528941
        //  2994: ixor           
        //  2995: lookupswitch {
        //          -1057547922: 3177
        //          1397979163: 2988
        //          default: 3020
        //        }
        //  3020: goto            3024
        //  3023: athrow         
        //  3024: invokevirtual   dev/nuker/pyro/f3i.c:()V
        //  3027: goto            3031
        //  3030: athrow         
        //  3031: aload_1        
        //  3032: ldc_w           90.0
        //  3035: getstatic       dev/nuker/pyro/fc.0:I
        //  3038: ifeq            3047
        //  3041: ldc_w           -942620640
        //  3044: goto            3050
        //  3047: ldc_w           -1940483818
        //  3050: ldc_w           83402396
        //  3053: ixor           
        //  3054: lookupswitch {
        //          -1791316872: 3047
        //          -1020764484: 3155
        //          default: 3080
        //        }
        //  3080: goto            3084
        //  3083: athrow         
        //  3084: invokevirtual   dev/nuker/pyro/f3i.0:(F)V
        //  3087: goto            3091
        //  3090: athrow         
        //  3091: iload_2        
        //  3092: istore          9
        //  3094: aload_1        
        //  3095: aload_0        
        //  3096: iload           8
        //  3098: iload           9
        //  3100: invokedynamic   BootstrapMethod #0, accept:(Ldev/nuker/pyro/faQ;ZI)Ljava/util/function/Consumer;
        //  3105: goto            3109
        //  3108: athrow         
        //  3109: invokevirtual   dev/nuker/pyro/f3i.c:(Ljava/util/function/Consumer;)V
        //  3112: goto            3116
        //  3115: athrow         
        //  3116: return         
        //  3117: aconst_null    
        //  3118: athrow         
        //  3119: aconst_null    
        //  3120: athrow         
        //  3121: aconst_null    
        //  3122: athrow         
        //  3123: aconst_null    
        //  3124: athrow         
        //  3125: aconst_null    
        //  3126: athrow         
        //  3127: aconst_null    
        //  3128: athrow         
        //  3129: aconst_null    
        //  3130: athrow         
        //  3131: aconst_null    
        //  3132: athrow         
        //  3133: aconst_null    
        //  3134: athrow         
        //  3135: aconst_null    
        //  3136: athrow         
        //  3137: aconst_null    
        //  3138: athrow         
        //  3139: aconst_null    
        //  3140: athrow         
        //  3141: aconst_null    
        //  3142: athrow         
        //  3143: aconst_null    
        //  3144: athrow         
        //  3145: aconst_null    
        //  3146: athrow         
        //  3147: aconst_null    
        //  3148: athrow         
        //  3149: aconst_null    
        //  3150: athrow         
        //  3151: aconst_null    
        //  3152: athrow         
        //  3153: aconst_null    
        //  3154: athrow         
        //  3155: aconst_null    
        //  3156: athrow         
        //  3157: aconst_null    
        //  3158: athrow         
        //  3159: aconst_null    
        //  3160: athrow         
        //  3161: aconst_null    
        //  3162: athrow         
        //  3163: aconst_null    
        //  3164: athrow         
        //  3165: aconst_null    
        //  3166: athrow         
        //  3167: aconst_null    
        //  3168: athrow         
        //  3169: aconst_null    
        //  3170: athrow         
        //  3171: aconst_null    
        //  3172: athrow         
        //  3173: aconst_null    
        //  3174: athrow         
        //  3175: aconst_null    
        //  3176: athrow         
        //  3177: aconst_null    
        //  3178: athrow         
        //  3179: aconst_null    
        //  3180: athrow         
        //  3181: aconst_null    
        //  3182: athrow         
        //  3183: aconst_null    
        //  3184: athrow         
        //  3185: aconst_null    
        //  3186: athrow         
        //  3187: aconst_null    
        //  3188: athrow         
        //  3189: aconst_null    
        //  3190: athrow         
        //  3191: aconst_null    
        //  3192: athrow         
        //  3193: aconst_null    
        //  3194: athrow         
        //  3195: aconst_null    
        //  3196: athrow         
        //  3197: aconst_null    
        //  3198: athrow         
        //  3199: aconst_null    
        //  3200: athrow         
        //  3201: aconst_null    
        //  3202: athrow         
        //  3203: pop            
        //  3204: goto            24
        //  3207: pop            
        //  3208: aconst_null    
        //  3209: goto            3203
        //  3212: dup            
        //  3213: ifnull          3203
        //  3216: checkcast       Ljava/lang/Throwable;
        //  3219: athrow         
        //  3220: dup            
        //  3221: ifnull          3207
        //  3224: checkcast       Ljava/lang/Throwable;
        //  3227: athrow         
        //  3228: aconst_null    
        //  3229: athrow         
        //    StackMapTable: 01 9D 43 07 00 31 04 FF 00 0B 00 00 00 01 07 00 31 FD 00 03 07 00 03 07 00 C7 58 07 00 44 FF 00 01 00 02 07 00 03 07 00 C7 00 02 07 00 44 01 5C 07 00 44 09 0A 41 01 1C FF 00 03 00 00 00 01 07 00 31 FF 00 00 00 02 07 00 03 07 00 C7 00 01 07 00 C7 45 07 00 31 40 07 00 CC 54 07 00 D6 FF 00 01 00 02 07 00 03 07 00 C7 00 02 07 00 D6 01 5C 07 00 D6 42 07 00 31 40 07 00 D6 45 07 00 31 40 07 00 62 FF 00 05 00 00 00 01 07 00 31 FF 00 00 00 02 07 00 03 07 00 C7 00 01 07 00 A1 45 07 00 31 40 01 4A 07 00 31 40 07 00 D6 45 07 00 31 40 07 00 62 45 07 00 31 40 07 00 A1 45 07 00 31 40 01 49 07 00 31 40 07 00 D6 45 07 00 31 40 07 00 62 FF 00 05 00 00 00 01 07 00 31 FF 00 00 00 02 07 00 03 07 00 C7 00 01 07 00 A1 45 07 00 31 40 01 51 07 00 D6 FF 00 01 00 02 07 00 03 07 00 C7 00 02 07 00 D6 01 5D 07 00 D6 42 07 00 31 40 07 00 D6 45 07 00 31 40 07 00 62 45 07 00 31 40 07 00 A1 45 07 00 31 40 01 42 07 00 26 40 01 45 07 00 31 40 01 02 04 41 01 19 02 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 C7 00 02 07 00 03 01 5E 07 00 03 4D 07 00 D6 FF 00 01 00 02 07 00 03 07 00 C7 00 02 07 00 D6 01 5B 07 00 D6 42 07 00 31 40 07 00 D6 45 07 00 31 40 07 00 62 45 07 00 10 40 07 00 A1 45 07 00 31 40 01 4B 01 FF 00 01 00 02 07 00 03 07 00 C7 00 02 01 01 5C 01 42 07 00 1E 40 01 45 07 00 31 40 01 02 4B 01 FF 00 01 00 02 07 00 03 07 00 C7 00 02 01 01 5B 01 FF 00 0C 00 03 07 00 03 07 00 C7 01 00 01 01 FF 00 01 00 03 07 00 03 07 00 C7 01 00 02 01 01 5C 01 FC 00 00 01 53 07 00 31 FF 00 00 00 04 07 00 03 07 00 C7 01 01 00 02 07 00 FD 01 45 07 00 31 40 07 00 53 42 07 00 31 40 07 00 53 45 07 00 31 40 07 00 B0 FF 00 0E 00 04 07 00 03 07 00 C7 01 01 00 02 07 00 B0 07 00 B0 FF 00 02 00 04 07 00 03 07 00 C7 01 01 00 03 07 00 B0 07 00 B0 01 FF 00 1D 00 04 07 00 03 07 00 C7 01 01 00 02 07 00 B0 07 00 B0 42 07 00 31 FF 00 00 00 04 07 00 03 07 00 C7 01 01 00 02 07 00 B0 07 00 B0 45 07 00 31 40 01 0E 42 01 1E 04 05 04 05 42 01 1A 4C 07 00 03 FF 00 02 00 04 07 00 03 07 00 C7 01 01 00 02 07 00 03 01 5F 07 00 03 48 07 00 31 40 07 00 4D 45 07 00 31 40 07 01 15 FF 00 02 00 00 00 01 07 00 31 FF 00 00 00 04 07 00 03 07 00 C7 01 01 00 01 07 01 15 47 07 00 31 40 07 01 47 4B 07 01 47 FF 00 02 00 04 07 00 03 07 00 C7 01 01 00 02 07 01 47 01 5E 07 01 47 FF 00 0A 00 07 07 00 03 07 00 C7 01 07 01 47 01 01 01 00 00 0B 42 01 1D 06 05 42 01 1B 0B 42 01 1C 52 07 00 4D FF 00 02 00 07 07 00 03 07 00 C7 01 07 01 47 01 01 01 00 02 07 00 4D 01 5D 07 00 4D FF 00 10 00 07 07 00 03 07 00 C7 01 07 01 47 01 01 01 00 02 07 01 31 01 FF 00 02 00 07 07 00 03 07 00 C7 01 07 01 47 01 01 01 00 03 07 01 31 01 01 FF 00 1F 00 07 07 00 03 07 00 C7 01 07 01 47 01 01 01 00 02 07 01 31 01 FF 00 02 00 00 00 01 07 00 31 FF 00 00 00 07 07 00 03 07 00 C7 01 07 01 47 01 01 01 00 02 07 01 31 01 45 07 00 31 40 07 01 37 42 07 00 16 40 07 01 37 45 07 00 31 40 07 00 53 42 07 00 31 40 07 00 53 45 07 00 31 40 01 05 09 4B 07 00 1C FF 00 00 00 07 07 00 03 07 00 C7 01 07 01 47 01 01 01 00 02 08 05 0E 08 05 0E 45 07 00 31 40 07 01 41 FC 00 01 07 01 41 0B 42 01 1D FF 00 03 00 00 00 01 07 00 31 FF 00 00 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 01 07 01 47 47 07 00 31 40 01 46 07 00 31 40 07 01 47 47 07 00 31 40 07 00 62 FF 00 09 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 00 01 07 00 31 40 07 00 53 45 07 00 31 40 01 50 07 00 53 FF 00 02 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 00 02 07 00 53 01 5E 07 00 53 FF 00 02 00 00 00 01 07 00 31 FF 00 00 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 00 01 07 00 53 45 07 00 31 40 01 4B 01 FF 00 02 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 00 02 01 01 5D 01 FF 00 0D 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 00 02 01 07 00 53 FF 00 02 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 00 03 01 07 00 53 01 FF 00 1E 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 00 02 01 07 00 53 42 07 00 31 FF 00 00 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 00 02 01 07 00 53 45 07 00 31 FF 00 00 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 00 02 01 01 46 07 00 B7 FF 00 00 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 00 02 02 07 00 53 45 07 00 31 FF 00 00 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 00 02 02 01 FC 00 13 02 42 01 1E 48 07 00 31 FF 00 00 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 02 02 07 00 9E 45 07 00 31 FF 00 00 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 02 02 07 00 62 45 07 00 31 FF 00 00 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 02 02 07 00 A1 45 07 00 31 FF 00 00 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 02 02 01 51 01 FF 00 02 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 02 01 01 5F 01 FF 00 06 00 0B 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 00 01 07 00 31 40 07 00 53 45 07 00 31 40 07 00 B0 45 07 00 31 FF 00 00 00 0B 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 00 02 07 00 B0 07 00 B0 45 07 00 31 40 01 02 05 42 01 1A 4D 01 FF 00 02 00 0B 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 00 02 01 01 5E 01 04 44 07 00 31 40 07 00 53 45 07 00 31 40 07 00 B0 11 42 01 1C 4D 07 00 53 FF 00 02 00 0B 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 00 02 07 00 53 01 5E 07 00 53 FF 00 02 00 00 00 01 07 00 31 FF 00 00 00 0B 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 00 01 07 00 53 45 07 00 31 40 07 00 B0 FC 00 10 07 01 70 42 01 1C 4E 07 01 FB FF 00 02 00 0C 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 07 01 70 00 02 07 01 FB 01 5D 07 01 FB FF 00 0D 00 0C 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 07 01 70 00 02 07 01 FB 07 01 70 FF 00 02 00 0C 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 07 01 70 00 03 07 01 FB 07 01 70 01 FF 00 1E 00 0C 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 07 01 70 00 02 07 01 FB 07 01 70 42 07 00 31 FF 00 00 00 0C 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 07 01 70 00 02 07 01 FB 07 01 70 45 07 00 31 FF 00 00 00 0C 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 07 01 70 00 02 07 01 FB 07 01 8D FF 00 0B 00 0C 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 07 01 70 00 02 07 01 FB 07 01 8D FF 00 02 00 0C 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 07 01 70 00 03 07 01 FB 07 01 8D 01 FF 00 1D 00 0C 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 07 01 70 00 02 07 01 FB 07 01 8D 42 07 00 31 FF 00 00 00 0C 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 07 01 70 00 02 07 01 FB 07 01 8D 45 07 00 31 FF 00 00 00 0C 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 07 01 70 00 02 07 01 FB 01 20 05 06 06 FA 00 03 4D 07 01 41 FF 00 02 00 0B 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 00 02 07 01 41 01 5E 07 01 41 44 07 00 31 FF 00 00 00 0B 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 00 02 07 01 41 01 45 07 00 31 FF 00 00 00 0B 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 00 02 07 01 41 07 00 A1 42 07 00 31 FF 00 00 00 0B 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 00 02 07 01 41 07 00 A1 47 07 00 31 40 01 0F 42 01 1E 07 FA 00 02 4D 02 FF 00 02 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 02 02 01 5F 02 46 07 00 10 FF 00 00 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 02 02 07 00 9E 45 07 00 31 FF 00 00 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 02 02 07 00 62 FF 00 0E 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 02 02 07 00 A1 FF 00 02 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 03 02 07 00 A1 01 FF 00 1E 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 02 02 07 00 A1 42 07 00 1C FF 00 00 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 02 02 07 00 A1 45 07 00 31 FF 00 00 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 02 02 01 FF 00 12 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 02 07 00 03 01 FF 00 02 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 03 07 00 03 01 01 FF 00 1E 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 02 07 00 03 01 FA 00 02 FA 00 02 07 FF 00 04 00 00 00 01 07 00 31 FF 00 00 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 01 07 01 41 47 07 00 31 40 01 0E 42 01 1C 4C 07 00 31 FF 00 00 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 03 07 01 C8 01 07 01 41 47 07 00 31 FF 00 00 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 03 07 01 C8 01 07 00 62 45 07 00 31 FF 00 00 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 03 07 01 C8 01 07 00 A1 45 07 00 31 FF 00 00 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 03 07 01 C8 01 01 FF 00 0C 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 04 07 01 C8 01 01 01 FF 00 02 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 05 07 01 C8 01 01 01 01 FF 00 1E 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 04 07 01 C8 01 01 01 FF 00 12 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 06 07 01 C8 01 01 01 07 01 BC 07 00 44 FF 00 02 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 07 07 01 C8 01 01 01 07 01 BC 07 00 44 01 FF 00 1D 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 06 07 01 C8 01 01 01 07 01 BC 07 00 44 FF 00 0E 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 06 07 01 C8 01 01 01 07 01 BC 07 00 4D FF 00 02 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 07 07 01 C8 01 01 01 07 01 BC 07 00 4D 01 FF 00 1D 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 06 07 01 C8 01 01 01 07 01 BC 07 00 4D 42 07 00 10 FF 00 00 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 06 07 01 C8 01 01 01 07 01 BC 07 00 4D 45 07 00 31 40 07 00 53 03 FF 00 0D 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 02 01 07 00 03 FF 00 02 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 03 01 07 00 03 01 FF 00 1F 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 02 01 07 00 03 FF 00 0E 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 02 01 07 00 44 FF 00 02 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 03 01 07 00 44 01 FF 00 1D 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 02 01 07 00 44 0B 05 42 01 1A 03 40 01 FF 00 0E 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 01 00 01 07 00 C7 FF 00 02 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 01 00 02 07 00 C7 01 5C 07 00 C7 FF 00 02 00 00 00 01 07 00 31 FF 00 00 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 01 00 01 07 00 C7 45 07 00 31 00 FF 00 0F 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 01 00 02 07 00 C7 02 FF 00 02 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 01 00 03 07 00 C7 02 01 FF 00 1D 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 01 00 02 07 00 C7 02 FF 00 02 00 00 00 01 07 00 31 FF 00 00 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 01 00 02 07 00 C7 02 45 07 00 31 00 FF 00 10 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 01 01 00 01 07 00 31 FF 00 00 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 01 01 00 02 07 00 C7 07 01 FD 45 07 00 31 FF 00 00 00 02 07 00 03 07 00 C7 00 00 FF 00 00 00 03 07 00 03 07 00 C7 01 00 01 01 FF 00 01 00 0C 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 07 01 70 00 01 07 01 FB FF 00 01 00 04 07 00 03 07 00 C7 01 01 00 02 07 00 B0 07 00 B0 FF 00 01 00 07 07 00 03 07 00 C7 01 07 01 47 01 01 01 00 00 41 07 00 4D FF 00 01 00 0B 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 00 01 01 F8 00 01 FF 00 01 00 0B 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 00 01 07 00 53 FF 00 01 00 04 07 00 03 07 00 C7 01 01 00 01 07 00 03 FF 00 01 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 01 02 FF 00 01 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 06 07 01 C8 01 01 01 07 01 BC 07 00 4D FF 00 01 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 00 02 01 07 00 53 FF 00 01 00 02 07 00 03 07 00 C7 00 01 01 FF 00 01 00 0C 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 07 01 70 00 00 FF 00 01 00 0B 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 00 01 07 01 41 FF 00 01 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 02 01 07 00 03 FF 00 01 00 02 07 00 03 07 00 C7 00 01 07 00 D6 FF 00 01 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 00 01 07 00 53 FF 00 01 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 02 01 07 00 44 FF 00 01 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 01 00 02 07 00 C7 02 FF 00 01 00 02 07 00 03 07 00 C7 00 01 07 00 44 FF 00 01 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 00 01 01 FF 00 01 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 01 01 01 FF 00 01 00 0C 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 07 01 70 00 02 07 01 FB 07 01 8D FF 00 01 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 06 07 01 C8 01 01 01 07 01 BC 07 00 44 FA 00 01 FF 00 01 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 02 02 07 00 A1 FF 00 01 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 04 07 01 C8 01 01 01 FF 00 01 00 02 07 00 03 07 00 C7 00 01 07 00 03 FF 00 01 00 09 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 01 00 01 07 00 C7 FF 00 01 00 07 07 00 03 07 00 C7 01 07 01 47 01 01 01 00 02 07 01 31 01 FF 00 01 00 02 07 00 03 07 00 C7 00 00 FF 00 01 00 0C 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 07 01 70 00 02 07 01 FB 07 01 70 FF 00 01 00 0A 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 00 02 07 00 03 01 FF 00 01 00 02 07 00 03 07 00 C7 00 01 01 FD 00 01 01 01 FF 00 01 00 08 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 00 00 FF 00 01 00 02 07 00 03 07 00 C7 00 01 07 00 D6 41 07 00 D6 FF 00 01 00 04 07 00 03 07 00 C7 01 01 00 01 07 01 47 FF 00 01 00 0B 07 00 03 07 00 C7 01 07 01 47 01 01 01 07 01 41 07 00 53 02 01 00 00 01 FF 00 01 00 02 07 00 03 07 00 C7 00 01 07 00 10 43 05 44 07 00 10 47 05 47 07 00 31
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     3212   3220   Ljava/lang/UnsupportedOperationException;
        //  3212   3220   3212   3220   Ljava/util/NoSuchElementException;
        //  3228   3230   3      8      Any
        //  137    143    143    144    Any
        //  137    143    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  137    143    3      8      Ljava/lang/UnsupportedOperationException;
        //  137    143    3      8      Any
        //  137    143    143    144    Any
        //  199    206    206    207    Any
        //  200    206    3      8      Ljava/lang/RuntimeException;
        //  199    206    199    200    Ljava/lang/StringIndexOutOfBoundsException;
        //  200    206    199    200    Any
        //  200    206    3      8      Any
        //  214    220    220    221    Any
        //  214    220    220    221    Any
        //  214    220    3      8      Any
        //  214    220    220    221    Any
        //  214    220    3      8      Any
        //  232    239    239    240    Any
        //  232    239    3      8      Any
        //  232    239    232    233    Any
        //  233    239    3      8      Ljava/lang/AssertionError;
        //  232    239    3      8      Any
        //  246    253    253    254    Any
        //  247    253    3      8      Any
        //  246    253    3      8      Ljava/lang/IllegalStateException;
        //  247    253    3      8      Ljava/lang/IllegalStateException;
        //  247    253    246    247    Any
        //  264    271    271    272    Any
        //  264    271    264    265    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  264    271    271    272    Ljava/lang/NullPointerException;
        //  265    271    3      8      Ljava/lang/UnsupportedOperationException;
        //  264    271    264    265    Any
        //  279    285    285    286    Any
        //  279    285    3      8      Any
        //  279    285    285    286    Ljava/lang/StringIndexOutOfBoundsException;
        //  279    285    3      8      Ljava/util/ConcurrentModificationException;
        //  279    285    3      8      Any
        //  339    346    346    347    Any
        //  340    346    339    340    Ljava/lang/RuntimeException;
        //  340    346    3      8      Any
        //  339    346    346    347    Any
        //  339    346    339    340    Ljava/lang/AssertionError;
        //  353    360    360    361    Any
        //  353    360    360    361    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  354    360    360    361    Ljava/lang/EnumConstantNotPresentException;
        //  353    360    360    361    Any
        //  354    360    353    354    Any
        //  364    371    371    372    Any
        //  365    371    3      8      Any
        //  364    371    371    372    Any
        //  364    371    364    365    Ljava/lang/EnumConstantNotPresentException;
        //  364    371    3      8      Any
        //  503    510    510    511    Any
        //  503    510    510    511    Ljava/lang/UnsupportedOperationException;
        //  504    510    503    504    Any
        //  504    510    510    511    Any
        //  503    510    503    504    Ljava/lang/AssertionError;
        //  517    524    524    525    Any
        //  518    524    517    518    Ljava/lang/IndexOutOfBoundsException;
        //  517    524    524    525    Ljava/lang/NumberFormatException;
        //  518    524    517    518    Ljava/lang/NumberFormatException;
        //  517    524    524    525    Ljava/lang/RuntimeException;
        //  571    578    578    579    Any
        //  571    578    571    572    Ljava/lang/ClassCastException;
        //  572    578    3      8      Ljava/lang/AssertionError;
        //  571    578    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  572    578    578    579    Ljava/util/ConcurrentModificationException;
        //  689    696    696    697    Any
        //  689    696    3      8      Any
        //  690    696    689    690    Ljava/lang/AssertionError;
        //  689    696    689    690    Ljava/lang/NullPointerException;
        //  690    696    696    697    Ljava/lang/UnsupportedOperationException;
        //  700    707    707    708    Any
        //  700    707    707    708    Any
        //  701    707    707    708    Ljava/util/NoSuchElementException;
        //  701    707    700    701    Any
        //  701    707    3      8      Ljava/lang/IllegalStateException;
        //  759    766    766    767    Any
        //  759    766    3      8      Ljava/lang/RuntimeException;
        //  760    766    766    767    Ljava/lang/NumberFormatException;
        //  760    766    759    760    Ljava/lang/UnsupportedOperationException;
        //  759    766    759    760    Any
        //  925    932    932    933    Any
        //  925    932    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  926    932    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  925    932    925    926    Any
        //  926    932    925    926    Any
        //  937    945    945    946    Any
        //  937    945    3      8      Any
        //  937    945    3      8      Any
        //  937    945    945    946    Any
        //  937    945    945    946    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1244   1250   1250   1251   Any
        //  1244   1250   1250   1251   Ljava/lang/IllegalStateException;
        //  1244   1250   1250   1251   Any
        //  1244   1250   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1244   1250   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1254   1261   1261   1262   Any
        //  1255   1261   3      8      Any
        //  1255   1261   1254   1255   Ljava/lang/IllegalArgumentException;
        //  1254   1261   3      8      Ljava/lang/AssertionError;
        //  1255   1261   1261   1262   Any
        //  1265   1272   1272   1273   Any
        //  1266   1272   1272   1273   Ljava/lang/ClassCastException;
        //  1265   1272   1265   1266   Any
        //  1265   1272   1272   1273   Ljava/lang/ArithmeticException;
        //  1266   1272   1265   1266   Ljava/lang/ClassCastException;
        //  1301   1308   1308   1309   Any
        //  1302   1308   1308   1309   Any
        //  1302   1308   1308   1309   Ljava/lang/IllegalStateException;
        //  1302   1308   3      8      Any
        //  1301   1308   1301   1302   Ljava/lang/UnsupportedOperationException;
        //  1361   1369   1369   1370   Any
        //  1361   1369   1369   1370   Ljava/lang/NumberFormatException;
        //  1361   1369   1369   1370   Ljava/lang/IllegalArgumentException;
        //  1361   1369   1369   1370   Any
        //  1361   1369   1369   1370   Any
        //  1377   1386   1386   1387   Any
        //  1377   1386   1377   1378   Any
        //  1378   1386   1377   1378   Ljava/lang/IllegalArgumentException;
        //  1377   1386   1377   1378   Ljava/lang/EnumConstantNotPresentException;
        //  1377   1386   3      8      Any
        //  1397   1404   1404   1405   Any
        //  1397   1404   3      8      Any
        //  1397   1404   1397   1398   Any
        //  1398   1404   1404   1405   Ljava/lang/RuntimeException;
        //  1397   1404   1404   1405   Ljava/util/NoSuchElementException;
        //  1460   1466   1466   1467   Any
        //  1460   1466   1466   1467   Any
        //  1460   1466   1466   1467   Any
        //  1460   1466   3      8      Ljava/lang/ArithmeticException;
        //  1460   1466   1466   1467   Any
        //  1563   1570   1570   1571   Any
        //  1564   1570   3      8      Ljava/lang/ArithmeticException;
        //  1563   1570   3      8      Ljava/lang/UnsupportedOperationException;
        //  1563   1570   1563   1564   Any
        //  1564   1570   1563   1564   Ljava/util/ConcurrentModificationException;
        //  1578   1585   1585   1586   Any
        //  1579   1585   1585   1586   Ljava/lang/UnsupportedOperationException;
        //  1578   1585   1578   1579   Ljava/util/NoSuchElementException;
        //  1579   1585   1585   1586   Any
        //  1578   1585   3      8      Ljava/lang/ArithmeticException;
        //  1649   1656   1656   1657   Any
        //  1650   1656   1649   1650   Any
        //  1650   1656   3      8      Any
        //  1650   1656   1649   1650   Any
        //  1649   1656   1649   1650   Ljava/lang/IndexOutOfBoundsException;
        //  1663   1670   1670   1671   Any
        //  1664   1670   1663   1664   Any
        //  1663   1670   1663   1664   Ljava/lang/IndexOutOfBoundsException;
        //  1663   1670   1663   1664   Any
        //  1664   1670   1663   1664   Any
        //  1731   1738   1738   1739   Any
        //  1732   1738   3      8      Any
        //  1731   1738   1731   1732   Any
        //  1731   1738   1738   1739   Ljava/lang/AssertionError;
        //  1731   1738   1738   1739   Ljava/lang/RuntimeException;
        //  1745   1752   1752   1753   Any
        //  1745   1752   1745   1746   Any
        //  1746   1752   1752   1753   Any
        //  1746   1752   3      8      Any
        //  1746   1752   1745   1746   Ljava/lang/RuntimeException;
        //  1850   1857   1857   1858   Any
        //  1850   1857   1850   1851   Ljava/lang/StringIndexOutOfBoundsException;
        //  1851   1857   1850   1851   Any
        //  1851   1857   1850   1851   Ljava/lang/IllegalStateException;
        //  1851   1857   3      8      Any
        //  1960   1966   1966   1967   Any
        //  1960   1966   3      8      Ljava/lang/ArithmeticException;
        //  1960   1966   3      8      Ljava/lang/NullPointerException;
        //  1960   1966   3      8      Any
        //  1960   1966   1966   1967   Any
        //  2115   2122   2122   2123   Any
        //  2115   2122   3      8      Ljava/util/NoSuchElementException;
        //  2115   2122   2115   2116   Ljava/lang/IllegalStateException;
        //  2116   2122   2115   2116   Any
        //  2115   2122   2115   2116   Ljava/util/NoSuchElementException;
        //  2171   2178   2178   2179   Any
        //  2172   2178   2178   2179   Any
        //  2171   2178   2171   2172   Any
        //  2172   2178   2171   2172   Ljava/lang/ClassCastException;
        //  2172   2178   3      8      Any
        //  2289   2296   2296   2297   Any
        //  2290   2296   2289   2290   Ljava/lang/NegativeArraySizeException;
        //  2289   2296   2289   2290   Any
        //  2289   2296   2289   2290   Any
        //  2290   2296   2289   2290   Any
        //  2300   2309   2309   2310   Any
        //  2300   2309   2309   2310   Any
        //  2301   2309   2309   2310   Any
        //  2301   2309   2300   2301   Any
        //  2301   2309   3      8      Any
        //  2427   2434   2434   2435   Any
        //  2428   2434   2434   2435   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2427   2434   3      8      Ljava/lang/ClassCastException;
        //  2427   2434   2427   2428   Ljava/util/NoSuchElementException;
        //  2427   2434   2427   2428   Ljava/util/ConcurrentModificationException;
        //  2487   2494   2494   2495   Any
        //  2488   2494   2487   2488   Ljava/lang/UnsupportedOperationException;
        //  2487   2494   3      8      Ljava/lang/IllegalArgumentException;
        //  2488   2494   3      8      Any
        //  2487   2494   3      8      Any
        //  2568   2576   2576   2577   Any
        //  2568   2576   2576   2577   Ljava/lang/NegativeArraySizeException;
        //  2568   2576   2576   2577   Ljava/lang/StringIndexOutOfBoundsException;
        //  2568   2576   3      8      Any
        //  2568   2576   3      8      Any
        //  2637   2646   2646   2647   Any
        //  2637   2646   2637   2638   Ljava/lang/ArithmeticException;
        //  2637   2646   2646   2647   Ljava/lang/NumberFormatException;
        //  2637   2646   2646   2647   Ljava/lang/AssertionError;
        //  2638   2646   2637   2638   Any
        //  2653   2660   2660   2661   Any
        //  2654   2660   2653   2654   Any
        //  2653   2660   2660   2661   Any
        //  2654   2660   3      8      Any
        //  2654   2660   3      8      Any
        //  2811   2818   2818   2819   Any
        //  2812   2818   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2812   2818   2811   2812   Ljava/lang/NegativeArraySizeException;
        //  2812   2818   2811   2812   Ljava/lang/EnumConstantNotPresentException;
        //  2812   2818   3      8      Any
        //  3024   3030   3030   3031   Any
        //  3024   3030   3      8      Ljava/lang/NumberFormatException;
        //  3024   3030   3      8      Any
        //  3024   3030   3030   3031   Any
        //  3024   3030   3030   3031   Any
        //  3084   3090   3090   3091   Any
        //  3084   3090   3      8      Ljava/lang/ArithmeticException;
        //  3084   3090   3090   3091   Ljava/lang/AssertionError;
        //  3084   3090   3      8      Any
        //  3084   3090   3      8      Any
        //  3108   3115   3115   3116   Any
        //  3108   3115   3108   3109   Ljava/lang/IndexOutOfBoundsException;
        //  3108   3115   3108   3109   Ljava/lang/RuntimeException;
        //  3109   3115   3108   3109   Any
        //  3108   3115   3108   3109   Any
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
    
    public void c(final boolean p0, final int p1, final EntityPlayerSP p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          372
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            364
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            356
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iload_1        
        //    25: ifeq            154
        //    28: aload_0        
        //    29: getfield        dev/nuker/pyro/faQ.c:Lnet/minecraft/client/Minecraft;
        //    32: getstatic       dev/nuker/pyro/fc.c:I
        //    35: ifge            44
        //    38: ldc_w           1872824799
        //    41: goto            47
        //    44: ldc_w           -454086650
        //    47: ldc_w           226238408
        //    50: ixor           
        //    51: lookupswitch {
        //          -376229938: 76
        //          1658656279: 44
        //          default: 343
        //        }
        //    76: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    79: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //    82: new             Lnet/minecraft/network/play/client/CPacketHeldItemChange;
        //    85: dup            
        //    86: iload_2        
        //    87: getstatic       dev/nuker/pyro/fc.0:I
        //    90: ifeq            99
        //    93: ldc_w           646477285
        //    96: goto            102
        //    99: ldc_w           2061560010
        //   102: ldc_w           -930857238
        //   105: ixor           
        //   106: lookupswitch {
        //          -1302014432: 132
        //          -301184241: 99
        //          default: 339
        //        }
        //   132: goto            136
        //   135: athrow         
        //   136: invokespecial   net/minecraft/network/play/client/CPacketHeldItemChange.<init>:(I)V
        //   139: goto            143
        //   142: athrow         
        //   143: goto            147
        //   146: athrow         
        //   147: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   150: goto            154
        //   153: athrow         
        //   154: aload_0        
        //   155: getstatic       dev/nuker/pyro/fc.c:I
        //   158: ifge            167
        //   161: ldc_w           572924185
        //   164: goto            170
        //   167: ldc_w           481458269
        //   170: ldc_w           697212284
        //   173: ixor           
        //   174: lookupswitch {
        //          -408471699: 167
        //          195607653: 345
        //          default: 200
        //        }
        //   200: getfield        dev/nuker/pyro/faQ.c:Lnet/minecraft/client/Minecraft;
        //   203: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   206: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   209: new             Lnet/minecraft/network/play/client/CPacketPlayerTryUseItem;
        //   212: dup            
        //   213: getstatic       dev/nuker/pyro/fc.c:I
        //   216: ifge            225
        //   219: ldc_w           -806069493
        //   222: goto            228
        //   225: ldc_w           1363676719
        //   228: ldc_w           -1723909206
        //   231: ixor           
        //   232: lookupswitch {
        //          240678267: 225
        //          1456169121: 341
        //          default: 260
        //        }
        //   260: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //   263: goto            267
        //   266: athrow         
        //   267: invokespecial   net/minecraft/network/play/client/CPacketPlayerTryUseItem.<init>:(Lnet/minecraft/util/EnumHand;)V
        //   270: goto            274
        //   273: athrow         
        //   274: goto            278
        //   277: athrow         
        //   278: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   281: goto            285
        //   284: athrow         
        //   285: iload_1        
        //   286: ifeq            338
        //   289: aload_0        
        //   290: getfield        dev/nuker/pyro/faQ.c:Lnet/minecraft/client/Minecraft;
        //   293: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   296: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   299: new             Lnet/minecraft/network/play/client/CPacketHeldItemChange;
        //   302: dup            
        //   303: aload_0        
        //   304: getfield        dev/nuker/pyro/faQ.c:Lnet/minecraft/client/Minecraft;
        //   307: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   310: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   313: getfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //   316: goto            320
        //   319: athrow         
        //   320: invokespecial   net/minecraft/network/play/client/CPacketHeldItemChange.<init>:(I)V
        //   323: goto            327
        //   326: athrow         
        //   327: goto            331
        //   330: athrow         
        //   331: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   334: goto            338
        //   337: athrow         
        //   338: return         
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
        //    StackMapTable: 00 31 43 07 00 31 04 FF 00 0B 00 00 00 01 07 00 31 FF 00 03 00 04 07 00 03 01 01 07 00 4D 00 00 53 07 00 44 FF 00 02 00 04 07 00 03 01 01 07 00 4D 00 02 07 00 44 01 5C 07 00 44 FF 00 16 00 04 07 00 03 01 01 07 00 4D 00 04 07 02 0F 08 00 52 08 00 52 01 FF 00 02 00 04 07 00 03 01 01 07 00 4D 00 05 07 02 0F 08 00 52 08 00 52 01 01 FF 00 1D 00 04 07 00 03 01 01 07 00 4D 00 04 07 02 0F 08 00 52 08 00 52 01 42 07 00 31 FF 00 00 00 04 07 00 03 01 01 07 00 4D 00 04 07 02 0F 08 00 52 08 00 52 01 45 07 00 31 FF 00 00 00 04 07 00 03 01 01 07 00 4D 00 02 07 02 0F 07 02 08 FF 00 02 00 00 00 01 07 00 31 FF 00 00 00 04 07 00 03 01 01 07 00 4D 00 02 07 02 0F 07 02 08 45 07 00 31 00 4C 07 00 03 FF 00 02 00 04 07 00 03 01 01 07 00 4D 00 02 07 00 03 01 5D 07 00 03 FF 00 18 00 04 07 00 03 01 01 07 00 4D 00 03 07 02 0F 08 00 D1 08 00 D1 FF 00 02 00 04 07 00 03 01 01 07 00 4D 00 04 07 02 0F 08 00 D1 08 00 D1 01 FF 00 1F 00 04 07 00 03 01 01 07 00 4D 00 03 07 02 0F 08 00 D1 08 00 D1 FF 00 05 00 00 00 01 07 00 31 FF 00 00 00 04 07 00 03 01 01 07 00 4D 00 04 07 02 0F 08 00 D1 08 00 D1 07 02 1D 45 07 00 31 FF 00 00 00 04 07 00 03 01 01 07 00 4D 00 02 07 02 0F 07 02 18 FF 00 02 00 00 00 01 07 00 31 FF 00 00 00 04 07 00 03 01 01 07 00 4D 00 02 07 02 0F 07 02 18 45 07 00 31 00 61 07 00 31 FF 00 00 00 04 07 00 03 01 01 07 00 4D 00 04 07 02 0F 08 01 2B 08 01 2B 01 45 07 00 31 FF 00 00 00 04 07 00 03 01 01 07 00 4D 00 02 07 02 0F 07 02 08 42 07 00 31 FF 00 00 00 04 07 00 03 01 01 07 00 4D 00 02 07 02 0F 07 02 08 45 07 00 31 00 FF 00 00 00 04 07 00 03 01 01 07 00 4D 00 04 07 02 0F 08 00 52 08 00 52 01 FF 00 01 00 04 07 00 03 01 01 07 00 4D 00 03 07 02 0F 08 00 D1 08 00 D1 41 07 00 44 41 07 00 03 41 07 00 10 43 05 44 07 00 10 47 05 47 07 00 31
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     356    364    Ljava/lang/IllegalArgumentException;
        //  356    364    356    364    Ljava/lang/NullPointerException;
        //  372    374    3      8      Any
        //  135    142    142    143    Any
        //  135    142    3      8      Any
        //  136    142    135    136    Ljava/lang/IllegalStateException;
        //  135    142    135    136    Any
        //  136    142    3      8      Any
        //  147    153    153    154    Any
        //  147    153    3      8      Ljava/lang/NullPointerException;
        //  147    153    3      8      Ljava/lang/UnsupportedOperationException;
        //  147    153    3      8      Any
        //  147    153    153    154    Ljava/lang/NegativeArraySizeException;
        //  267    273    273    274    Any
        //  267    273    3      8      Any
        //  267    273    273    274    Any
        //  267    273    3      8      Ljava/lang/IllegalStateException;
        //  267    273    3      8      Any
        //  278    284    284    285    Any
        //  278    284    3      8      Any
        //  278    284    3      8      Ljava/util/NoSuchElementException;
        //  278    284    3      8      Any
        //  278    284    284    285    Any
        //  319    326    326    327    Any
        //  320    326    319    320    Any
        //  319    326    3      8      Ljava/lang/ArithmeticException;
        //  319    326    326    327    Ljava/lang/NumberFormatException;
        //  320    326    3      8      Any
        //  330    337    337    338    Any
        //  330    337    330    331    Any
        //  330    337    337    338    Any
        //  330    337    3      8      Any
        //  331    337    337    338    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 122 out of bounds for length 122
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
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          271
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            263
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            255
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           1179031466
        //    33: goto            39
        //    36: ldc_w           -1974642207
        //    39: ldc_w           -1308145025
        //    42: ixor           
        //    43: lookupswitch {
        //          -204141223: 36
        //          -197009963: 240
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: iload_1        
        //    70: aload_2        
        //    71: aload_3        
        //    72: getstatic       dev/nuker/pyro/fc.0:I
        //    75: ifeq            84
        //    78: ldc_w           -56274442
        //    81: goto            87
        //    84: ldc_w           1498893842
        //    87: ldc_w           -1556729774
        //    90: ixor           
        //    91: lookupswitch {
        //          465983755: 84
        //          1603494308: 242
        //          default: 116
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //   123: goto            127
        //   126: athrow         
        //   127: aload_0        
        //   128: getstatic       dev/nuker/pyro/fc.1:I
        //   131: ifeq            140
        //   134: ldc_w           -1375856224
        //   137: goto            143
        //   140: ldc_w           441609726
        //   143: ldc_w           -1120456970
        //   146: ixor           
        //   147: lookupswitch {
        //          -1861492938: 140
        //          281622358: 244
        //          default: 172
        //        }
        //   172: getfield        dev/nuker/pyro/faQ.c:Lnet/minecraft/client/Minecraft;
        //   175: checkcast       Ldev/nuker/pyro/mixin/MinecraftAccessor;
        //   178: bipush          6
        //   180: getstatic       dev/nuker/pyro/fc.0:I
        //   183: ifeq            192
        //   186: ldc_w           -2023707595
        //   189: goto            195
        //   192: ldc_w           1872419388
        //   195: ldc_w           1634560811
        //   198: ixor           
        //   199: lookupswitch {
        //          -1866157968: 192
        //          -435304674: 238
        //          default: 224
        //        }
        //   224: goto            228
        //   227: athrow         
        //   228: invokeinterface dev/nuker/pyro/mixin/MinecraftAccessor.setRightClickDelayTimer:(I)V
        //   233: goto            237
        //   236: athrow         
        //   237: return         
        //   238: aconst_null    
        //   239: athrow         
        //   240: aconst_null    
        //   241: athrow         
        //   242: aconst_null    
        //   243: athrow         
        //   244: aconst_null    
        //   245: athrow         
        //   246: pop            
        //   247: goto            24
        //   250: pop            
        //   251: aconst_null    
        //   252: goto            246
        //   255: dup            
        //   256: ifnull          246
        //   259: checkcast       Ljava/lang/Throwable;
        //   262: athrow         
        //   263: dup            
        //   264: ifnull          250
        //   267: checkcast       Ljava/lang/Throwable;
        //   270: athrow         
        //   271: aconst_null    
        //   272: athrow         
        //    RuntimeInvisibleTypeAnnotations: 00 02 16 01 00 02 26 00 00 16 02 00 02 26 00 00
        //    StackMapTable: 00 21 43 07 00 31 04 FF 00 0B 00 00 00 01 07 00 31 FF 00 03 00 04 07 00 03 01 07 00 4D 07 02 36 00 00 0B 42 01 1C FF 00 0F 00 04 07 00 03 01 07 00 4D 07 02 36 00 04 07 00 03 01 07 00 4D 07 02 36 FF 00 02 00 04 07 00 03 01 07 00 4D 07 02 36 00 05 07 00 03 01 07 00 4D 07 02 36 01 FF 00 1C 00 04 07 00 03 01 07 00 4D 07 02 36 00 04 07 00 03 01 07 00 4D 07 02 36 42 07 00 24 FF 00 00 00 04 07 00 03 01 07 00 4D 07 02 36 00 04 07 00 03 01 07 00 4D 07 02 36 45 07 00 31 00 4C 07 00 03 FF 00 02 00 04 07 00 03 01 07 00 4D 07 02 36 00 02 07 00 03 01 5C 07 00 03 FF 00 13 00 04 07 00 03 01 07 00 4D 07 02 36 00 02 07 00 97 01 FF 00 02 00 04 07 00 03 01 07 00 4D 07 02 36 00 03 07 00 97 01 01 FF 00 1C 00 04 07 00 03 01 07 00 4D 07 02 36 00 02 07 00 97 01 42 07 00 31 FF 00 00 00 04 07 00 03 01 07 00 4D 07 02 36 00 02 07 00 97 01 47 07 00 31 00 FF 00 00 00 04 07 00 03 01 07 00 4D 07 02 36 00 02 07 00 97 01 01 FF 00 01 00 04 07 00 03 01 07 00 4D 07 02 36 00 04 07 00 03 01 07 00 4D 07 02 36 41 07 00 03 41 07 00 31 43 05 44 07 00 31 47 05 47 07 00 31
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     255    263    Ljava/lang/IllegalStateException;
        //  255    263    255    263    Any
        //  271    273    3      8      Ljava/util/ConcurrentModificationException;
        //  119    126    126    127    Any
        //  120    126    119    120    Ljava/lang/NumberFormatException;
        //  119    126    3      8      Any
        //  119    126    126    127    Ljava/lang/NullPointerException;
        //  119    126    3      8      Ljava/lang/ClassCastException;
        //  227    236    236    237    Any
        //  227    236    227    228    Any
        //  227    236    3      8      Any
        //  228    236    236    237    Any
        //  228    236    236    237    Ljava/lang/EnumConstantNotPresentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 84 out of bounds for length 84
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
    
    public faQ() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "\u2914\u1492\u8018\ub3cd\uc661\ue718\ub225\uec25\ud96d"
        //     4: invokestatic    invokestatic   !!! ERROR
        //     7: ldc_w           "\u2934\u1492\u8018\ub3cd\uc641\ue718\ub225\uec25\ud96d"
        //    10: getstatic       dev/nuker/pyro/fc.c:I
        //    13: ifge            22
        //    16: ldc_w           1883259537
        //    19: goto            25
        //    22: ldc_w           311074070
        //    25: ldc_w           1826552970
        //    28: ixor           
        //    29: lookupswitch {
        //          -181990621: 22
        //          480165403: 731
        //          default: 56
        //        }
        //    56: invokestatic    invokestatic   !!! ERROR
        //    59: ldc_w           "\u2933\u149f\u8007\ub3d6\uc666\ue707\ub264\uec3f\ud967\ue617\uad94\u1e58\ueb0d\uc5e7\u8e86\u8387\u57a5\u7ded\ubd3a\ucfbb\u21a0\uc22f\u60e3\u2d53\ud820\u3f73\u7d2e\u834e\u8010\u8330\u8e5e\ufb26\u7a74\u9a06\u143b\ufb94\u497f\u828e\uca88\uf092\ubc6a\u41f7\ub317\ub344\u43c6\u801e"
        //    62: invokestatic    invokestatic   !!! ERROR
        //    65: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    68: getstatic       dev/nuker/pyro/fc.0:I
        //    71: ifeq            80
        //    74: ldc_w           1741316500
        //    77: goto            83
        //    80: ldc_w           721923341
        //    83: ldc_w           -1061065326
        //    86: ixor           
        //    87: lookupswitch {
        //          -1492448250: 80
        //          -339296097: 112
        //          default: 725
        //        }
        //   112: aload_0        
        //   113: new             Ldev/nuker/pyro/f0g;
        //   116: dup            
        //   117: ldc_w           "\u2916\u1496\u8007\ub3d8\uc668"
        //   120: invokestatic    invokestatic   !!! ERROR
        //   123: ldc_w           "\u2936\u1496\u8007\ub3d8\uc668"
        //   126: getstatic       dev/nuker/pyro/fc.1:I
        //   129: ifeq            138
        //   132: ldc_w           -1025682194
        //   135: goto            141
        //   138: ldc_w           -909101849
        //   141: ldc_w           608395310
        //   144: ixor           
        //   145: lookupswitch {
        //          -441385792: 138
        //          -425839424: 737
        //          default: 172
        //        }
        //   172: invokestatic    invokestatic   !!! ERROR
        //   175: ldc_w           "\u2926\u149b\u800e\ub399\uc670\ue719\ub22b\uec33\ud966\ue616\uad94\u1e43\ueb04\uc5e7\u8e81\u838a\u57a8\u7de2\ubd24\ucffe\u21e2\uc23e\u60ff\u2d41\ud865\u3f72\u7d25\u8308\u8003\u832c\u8e55\ufb3a\u7a20\u9a56\u1434\ufb99\u4975\u8284\uca8d\uf086\ubc64"
        //   178: invokestatic    invokestatic   !!! ERROR
        //   181: iconst_1       
        //   182: iconst_0       
        //   183: bipush          6
        //   185: iconst_1       
        //   186: invokespecial   dev/nuker/pyro/f0g.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIII)V
        //   189: putfield        dev/nuker/pyro/faQ.c:Ldev/nuker/pyro/f0g;
        //   192: aload_0        
        //   193: new             Ldev/nuker/pyro/f0a;
        //   196: dup            
        //   197: ldc_w           "\u290a\u1483"
        //   200: invokestatic    invokestatic   !!! ERROR
        //   203: ldc_w           "\u292a\u14a3"
        //   206: getstatic       dev/nuker/pyro/fc.0:I
        //   209: ifeq            218
        //   212: ldc_w           -1453286350
        //   215: goto            221
        //   218: ldc_w           -1999604858
        //   221: ldc_w           -1072241282
        //   224: ixor           
        //   225: lookupswitch {
        //          1490848548: 218
        //          1769371980: 729
        //          default: 252
        //        }
        //   252: invokestatic    invokestatic   !!! ERROR
        //   255: ldc_w           "\u293d\u149d\u8007\ub3c0\uc631\ue715\ub227\uec32\ud961\ue614\uadd5\u1e58\ueb07\uc5b4\u8ec5\u8380\u57aa\u7da3\ubd05\ucf8e"
        //   258: getstatic       dev/nuker/pyro/fc.c:I
        //   261: ifge            270
        //   264: ldc_w           1475472933
        //   267: goto            273
        //   270: ldc_w           1091512132
        //   273: ldc_w           2137385899
        //   276: ixor           
        //   277: lookupswitch {
        //          680789390: 270
        //          1047186671: 304
        //          default: 719
        //        }
        //   304: invokestatic    invokestatic   !!! ERROR
        //   307: iconst_0       
        //   308: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   311: putfield        dev/nuker/pyro/faQ.c:Ldev/nuker/pyro/f0a;
        //   314: getstatic       dev/nuker/pyro/fc.c:I
        //   317: ifge            326
        //   320: ldc_w           -732932369
        //   323: goto            329
        //   326: ldc_w           282019796
        //   329: ldc_w           2025730667
        //   332: ixor           
        //   333: lookupswitch {
        //          -1393662844: 326
        //          1752266175: 360
        //          default: 721
        //        }
        //   360: aload_0        
        //   361: new             Ldev/nuker/pyro/f0h;
        //   364: dup            
        //   365: ldc_w           "\u2902\u1492\u8008\ub3d2\uc674\ue700\ub21c\uec36"
        //   368: invokestatic    invokestatic   !!! ERROR
        //   371: ldc_w           "\u2922\u1492\u8008\ub3d2\uc674\ue700\ub21c\uec16"
        //   374: invokestatic    invokestatic   !!! ERROR
        //   377: ldc_w           "\u2933\u1486\u801f\ub3d6\uc67c\ue715\ub230\uec2f\ud96b\ue603\uadd8\u1e40\ueb1b\uc5e7\u8e83\u838e\u57a7\u7de6\ubd2e\ucffe\u21e4\uc234\u60fc\u2d58\ud820\u3f76\u7d25\u834c\u8051\u833d\u8e42\ufb21\u7a74\u9a0f\u1438\ufb80\u493c\u8290\uca8f\uf081\ubc22\u41fc\ub307\ub35c\u4387\u8014\u7c7e\uc4ca\u7d5a\ue573\uec22\u16d1\ue4be\u3789\u4958\ueb1a\u0a1f\u8c32\u1995\u00f9\u7dfb\u7288\ucd01\ubbfa\u956c\u60eb\ue2ef\udad7\ua523\u2a6b\u8357\u4fa8\u8193\u140d"
        //   380: invokestatic    invokestatic   !!! ERROR
        //   383: iconst_m1      
        //   384: invokespecial   dev/nuker/pyro/f0h.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
        //   387: putfield        dev/nuker/pyro/faQ.c:Ldev/nuker/pyro/f0h;
        //   390: aload_0        
        //   391: new             Ldev/nuker/pyro/f0g;
        //   394: dup            
        //   395: ldc_w           "\u2900\u1496\u8006\ub3d6\uc667\ue711\ub214\uec2f\ud96d\ue601\uadd1\u1e5f\ueb32\uc5a4\u8e91"
        //   398: invokestatic    invokestatic   !!! ERROR
        //   401: ldc_w           "\u293f\u149c\u801d\ub3dc\uc641\ue717\ub230"
        //   404: invokestatic    invokestatic   !!! ERROR
        //   407: aconst_null    
        //   408: bipush          100
        //   410: iconst_0       
        //   411: bipush          100
        //   413: getstatic       dev/nuker/pyro/fc.1:I
        //   416: ifeq            425
        //   419: ldc_w           -745498330
        //   422: goto            428
        //   425: ldc_w           113314134
        //   428: ldc_w           -335798260
        //   431: ixor           
        //   432: lookupswitch {
        //          -1282941569: 425
        //          946649386: 727
        //          default: 460
        //        }
        //   460: invokespecial   dev/nuker/pyro/f0g.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V
        //   463: putfield        dev/nuker/pyro/faQ.0:Ldev/nuker/pyro/f0g;
        //   466: aload_0        
        //   467: new             Ldev/nuker/pyro/f0g;
        //   470: dup            
        //   471: ldc_w           "\u2907\u149d\u801f\ub3d0\uc67d\ue724\ub227\uec32"
        //   474: invokestatic    invokestatic   !!! ERROR
        //   477: ldc_w           "\u2927\u149d\u801f\ub3d0\uc67d\ue724\ub227\uec32"
        //   480: getstatic       dev/nuker/pyro/fc.0:I
        //   483: ifeq            492
        //   486: ldc_w           -1984902559
        //   489: goto            495
        //   492: ldc_w           -238020981
        //   495: ldc_w           1433912054
        //   498: ixor           
        //   499: lookupswitch {
        //          -1532504963: 524
        //          -590935913: 492
        //          default: 735
        //        }
        //   524: invokestatic    invokestatic   !!! ERROR
        //   527: aconst_null    
        //   528: bipush          100
        //   530: iconst_0       
        //   531: bipush          100
        //   533: getstatic       dev/nuker/pyro/fc.0:I
        //   536: ifeq            545
        //   539: ldc_w           1478050152
        //   542: goto            548
        //   545: ldc_w           2053890176
        //   548: ldc_w           148626464
        //   551: ixor           
        //   552: lookupswitch {
        //          487859010: 545
        //          1354931528: 723
        //          default: 580
        //        }
        //   580: invokespecial   dev/nuker/pyro/f0g.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V
        //   583: putfield        dev/nuker/pyro/faQ.1:Ldev/nuker/pyro/f0g;
        //   586: aload_0        
        //   587: iconst_0       
        //   588: putfield        dev/nuker/pyro/faQ.c:Z
        //   591: aload_0        
        //   592: aload_0        
        //   593: getfield        dev/nuker/pyro/faQ.c:Ldev/nuker/pyro/f0g;
        //   596: invokevirtual   dev/nuker/pyro/faQ.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   599: pop            
        //   600: aload_0        
        //   601: getstatic       dev/nuker/pyro/fc.1:I
        //   604: ifeq            613
        //   607: ldc_w           -1304231795
        //   610: goto            616
        //   613: ldc_w           1356719542
        //   616: ldc_w           -1972799256
        //   619: ixor           
        //   620: lookupswitch {
        //          -625697442: 648
        //          942307429: 613
        //          default: 739
        //        }
        //   648: aload_0        
        //   649: getfield        dev/nuker/pyro/faQ.c:Ldev/nuker/pyro/f0a;
        //   652: invokevirtual   dev/nuker/pyro/faQ.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   655: pop            
        //   656: getstatic       dev/nuker/pyro/fc.0:I
        //   659: ifeq            668
        //   662: ldc_w           495447097
        //   665: goto            671
        //   668: ldc_w           2048535256
        //   671: ldc_w           -1783224492
        //   674: ixor           
        //   675: lookupswitch {
        //          -2010002579: 668
        //          -273937012: 700
        //          default: 733
        //        }
        //   700: aload_0        
        //   701: aload_0        
        //   702: getfield        dev/nuker/pyro/faQ.c:Ldev/nuker/pyro/f0h;
        //   705: invokevirtual   dev/nuker/pyro/faQ.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   708: pop            
        //   709: aload_0        
        //   710: aload_0        
        //   711: getfield        dev/nuker/pyro/faQ.0:Ldev/nuker/pyro/f0g;
        //   714: invokevirtual   dev/nuker/pyro/faQ.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   717: pop            
        //   718: return         
        //   719: aconst_null    
        //   720: athrow         
        //   721: aconst_null    
        //   722: athrow         
        //   723: aconst_null    
        //   724: athrow         
        //   725: aconst_null    
        //   726: athrow         
        //   727: aconst_null    
        //   728: athrow         
        //   729: aconst_null    
        //   730: athrow         
        //   731: aconst_null    
        //   732: athrow         
        //   733: aconst_null    
        //   734: athrow         
        //   735: aconst_null    
        //   736: athrow         
        //   737: aconst_null    
        //   738: athrow         
        //   739: aconst_null    
        //   740: athrow         
        //    StackMapTable: 00 2C FF 00 16 00 01 06 00 03 06 07 00 B2 07 00 B2 FF 00 02 00 01 06 00 04 06 07 00 B2 07 00 B2 01 FF 00 1E 00 01 06 00 03 06 07 00 B2 07 00 B2 FF 00 17 00 01 07 00 03 00 00 42 01 1C FF 00 19 00 01 07 00 03 00 05 07 00 03 08 00 71 08 00 71 07 00 B2 07 00 B2 FF 00 02 00 01 07 00 03 00 06 07 00 03 08 00 71 08 00 71 07 00 B2 07 00 B2 01 FF 00 1E 00 01 07 00 03 00 05 07 00 03 08 00 71 08 00 71 07 00 B2 07 00 B2 FF 00 2D 00 01 07 00 03 00 05 07 00 03 08 00 C1 08 00 C1 07 00 B2 07 00 B2 FF 00 02 00 01 07 00 03 00 06 07 00 03 08 00 C1 08 00 C1 07 00 B2 07 00 B2 01 FF 00 1E 00 01 07 00 03 00 05 07 00 03 08 00 C1 08 00 C1 07 00 B2 07 00 B2 FF 00 11 00 01 07 00 03 00 06 07 00 03 08 00 C1 08 00 C1 07 00 B2 07 00 B2 07 00 B2 FF 00 02 00 01 07 00 03 00 07 07 00 03 08 00 C1 08 00 C1 07 00 B2 07 00 B2 07 00 B2 01 FF 00 1E 00 01 07 00 03 00 06 07 00 03 08 00 C1 08 00 C1 07 00 B2 07 00 B2 07 00 B2 15 42 01 1E FF 00 40 00 01 07 00 03 00 09 07 00 03 08 01 87 08 01 87 07 00 B2 07 00 B2 05 01 01 01 FF 00 02 00 01 07 00 03 00 0A 07 00 03 08 01 87 08 01 87 07 00 B2 07 00 B2 05 01 01 01 01 FF 00 1F 00 01 07 00 03 00 09 07 00 03 08 01 87 08 01 87 07 00 B2 07 00 B2 05 01 01 01 FF 00 1F 00 01 07 00 03 00 05 07 00 03 08 01 D3 08 01 D3 07 00 B2 07 00 B2 FF 00 02 00 01 07 00 03 00 06 07 00 03 08 01 D3 08 01 D3 07 00 B2 07 00 B2 01 FF 00 1C 00 01 07 00 03 00 05 07 00 03 08 01 D3 08 01 D3 07 00 B2 07 00 B2 FF 00 14 00 01 07 00 03 00 09 07 00 03 08 01 D3 08 01 D3 07 00 B2 07 00 B2 05 01 01 01 FF 00 02 00 01 07 00 03 00 0A 07 00 03 08 01 D3 08 01 D3 07 00 B2 07 00 B2 05 01 01 01 01 FF 00 1F 00 01 07 00 03 00 09 07 00 03 08 01 D3 08 01 D3 07 00 B2 07 00 B2 05 01 01 01 60 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 13 42 01 1C FF 00 12 00 01 07 00 03 00 06 07 00 03 08 00 C1 08 00 C1 07 00 B2 07 00 B2 07 00 B2 01 FF 00 01 00 01 07 00 03 00 09 07 00 03 08 01 D3 08 01 D3 07 00 B2 07 00 B2 05 01 01 01 01 FF 00 01 00 01 07 00 03 00 09 07 00 03 08 01 87 08 01 87 07 00 B2 07 00 B2 05 01 01 01 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 C1 08 00 C1 07 00 B2 07 00 B2 FF 00 01 00 01 06 00 03 06 07 00 B2 07 00 B2 FF 00 01 00 01 07 00 03 00 00 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 01 D3 08 01 D3 07 00 B2 07 00 B2 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 71 08 00 71 07 00 B2 07 00 B2 41 07 00 03
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
}
