// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.gui.GuiScreen;
import java.util.ArrayList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.EnumPacketDirection;
import net.minecraft.client.Minecraft;
import javax.annotation.Nullable;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.client.network.NetworkPlayerInfo;
import java.util.List;
import net.minecraft.client.network.NetHandlerPlayClient;

public class fd extends NetHandlerPlayClient
{
    public List<NetworkPlayerInfo> c;
    
    public static boolean c(final UUID p0, final NetworkPlayerInfo p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          174
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            166
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            158
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            36
        //    31: ldc             -520918919
        //    33: goto            38
        //    36: ldc             -2020954925
        //    38: ldc             223368316
        //    40: ixor           
        //    41: lookupswitch {
        //          -1965360977: 68
        //          -308069371: 36
        //          default: 145
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokevirtual   net/minecraft/client/network/NetworkPlayerInfo.func_178845_a:()Lcom/mojang/authlib/GameProfile;
        //    75: goto            79
        //    78: athrow         
        //    79: goto            83
        //    82: athrow         
        //    83: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //    86: goto            90
        //    89: athrow         
        //    90: getstatic       dev/nuker/pyro/fc.0:I
        //    93: ifeq            101
        //    96: ldc             1072158568
        //    98: goto            103
        //   101: ldc             552129184
        //   103: ldc             1124120285
        //   105: ixor           
        //   106: lookupswitch {
        //          1676174461: 132
        //          2095538613: 101
        //          default: 147
        //        }
        //   132: aload_0        
        //   133: goto            137
        //   136: athrow         
        //   137: invokevirtual   java/util/UUID.equals:(Ljava/lang/Object;)Z
        //   140: goto            144
        //   143: athrow         
        //   144: ireturn        
        //   145: aconst_null    
        //   146: athrow         
        //   147: aconst_null    
        //   148: athrow         
        //   149: pop            
        //   150: goto            24
        //   153: pop            
        //   154: aconst_null    
        //   155: goto            149
        //   158: dup            
        //   159: ifnull          149
        //   162: checkcast       Ljava/lang/Throwable;
        //   165: athrow         
        //   166: dup            
        //   167: ifnull          153
        //   170: checkcast       Ljava/lang/Throwable;
        //   173: athrow         
        //   174: aconst_null    
        //   175: athrow         
        //    StackMapTable: 00 1D 43 07 00 1A 04 FF 00 0B 00 00 00 01 07 00 1A FD 00 03 07 00 31 07 00 1F 4B 07 00 1F FF 00 01 00 02 07 00 31 07 00 1F 00 02 07 00 1F 01 5D 07 00 1F 42 07 00 0B 40 07 00 1F 45 07 00 1A 40 07 00 25 42 07 00 1A 40 07 00 25 45 07 00 1A 40 07 00 31 4A 07 00 31 FF 00 01 00 02 07 00 31 07 00 1F 00 02 07 00 31 01 5C 07 00 31 43 07 00 13 FF 00 00 00 02 07 00 31 07 00 1F 00 02 07 00 31 07 00 31 45 07 00 1A 40 01 40 07 00 1F 41 07 00 31 41 07 00 1A 43 05 44 07 00 1A 47 05 47 07 00 1A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     158    166    Any
        //  158    166    158    166    Any
        //  174    176    3      8      Any
        //  71     78     78     79     Any
        //  72     78     3      8      Any
        //  71     78     78     79     Any
        //  71     78     71     72     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  71     78     78     79     Any
        //  82     89     89     90     Any
        //  83     89     89     90     Any
        //  82     89     82     83     Any
        //  82     89     3      8      Ljava/lang/IllegalStateException;
        //  82     89     3      8      Ljava/lang/NullPointerException;
        //  136    143    143    144    Any
        //  137    143    3      8      Ljava/lang/IllegalStateException;
        //  137    143    143    144    Ljava/lang/RuntimeException;
        //  137    143    143    144    Any
        //  136    143    136    137    Ljava/lang/IndexOutOfBoundsException;
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
    
    public void c(final GameProfile p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          502
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            494
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            486
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            35
        //    30: ldc             -862832221
        //    32: goto            37
        //    35: ldc             389324751
        //    37: ldc             -1945312845
        //    39: ixor           
        //    40: lookupswitch {
        //          -235706479: 35
        //          1084151824: 473
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: getstatic       dev/nuker/pyro/fc.1:I
        //    72: ifeq            80
        //    75: ldc             531319068
        //    77: goto            82
        //    80: ldc             -2051648747
        //    82: ldc             -1162016878
        //    84: ixor           
        //    85: lookupswitch {
        //          -1525264754: 80
        //          1057707143: 112
        //          default: 475
        //        }
        //   112: getfield        dev/nuker/pyro/fd.c:Ljava/util/List;
        //   115: getstatic       dev/nuker/pyro/fc.0:I
        //   118: ifeq            126
        //   121: ldc             545400580
        //   123: goto            128
        //   126: ldc             -523879494
        //   128: ldc             1286664669
        //   130: ixor           
        //   131: lookupswitch {
        //          -1401501081: 156
        //          1815271129: 126
        //          default: 469
        //        }
        //   156: aload_0        
        //   157: getfield        dev/nuker/pyro/fd.c:Ljava/util/List;
        //   160: getstatic       dev/nuker/pyro/fc.c:I
        //   163: ifge            171
        //   166: ldc             1119917361
        //   168: goto            173
        //   171: ldc             -1715937231
        //   173: ldc             -2010767771
        //   175: ixor           
        //   176: lookupswitch {
        //          -890860716: 171
        //          295632468: 204
        //          default: 463
        //        }
        //   204: goto            208
        //   207: athrow         
        //   208: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //   213: goto            217
        //   216: athrow         
        //   217: getstatic       dev/nuker/pyro/fc.0:I
        //   220: ifeq            228
        //   223: ldc             1634736348
        //   225: goto            230
        //   228: ldc             628475161
        //   230: ldc             1039124436
        //   232: ixor           
        //   233: lookupswitch {
        //          412746445: 260
        //          1553981192: 228
        //          default: 467
        //        }
        //   260: aload_1        
        //   261: invokedynamic   BootstrapMethod #0, test:(Lcom/mojang/authlib/GameProfile;)Ljava/util/function/Predicate;
        //   266: goto            270
        //   269: athrow         
        //   270: invokeinterface java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        //   275: goto            279
        //   278: athrow         
        //   279: goto            283
        //   282: athrow         
        //   283: invokestatic    java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
        //   286: goto            290
        //   289: athrow         
        //   290: goto            294
        //   293: athrow         
        //   294: invokeinterface java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
        //   299: goto            303
        //   302: athrow         
        //   303: checkcast       Ljava/util/Collection;
        //   306: goto            310
        //   309: athrow         
        //   310: invokeinterface java/util/List.removeAll:(Ljava/util/Collection;)Z
        //   315: goto            319
        //   318: athrow         
        //   319: pop            
        //   320: new             Lnet/minecraft/client/network/NetworkPlayerInfo;
        //   323: dup            
        //   324: aload_1        
        //   325: goto            329
        //   328: athrow         
        //   329: invokespecial   net/minecraft/client/network/NetworkPlayerInfo.<init>:(Lcom/mojang/authlib/GameProfile;)V
        //   332: goto            336
        //   335: athrow         
        //   336: astore_2       
        //   337: aload_0        
        //   338: getstatic       dev/nuker/pyro/fc.c:I
        //   341: ifge            349
        //   344: ldc             349045138
        //   346: goto            351
        //   349: ldc             -744443749
        //   351: ldc             1788476943
        //   353: ixor           
        //   354: lookupswitch {
        //          -1187426668: 380
        //          2119696285: 349
        //          default: 471
        //        }
        //   380: getfield        dev/nuker/pyro/fd.c:Ljava/util/List;
        //   383: aload_2        
        //   384: goto            388
        //   387: athrow         
        //   388: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   393: goto            397
        //   396: athrow         
        //   397: pop            
        //   398: getstatic       dev/nuker/pyro/alt/AltManager.INSTANCE:Ldev/nuker/pyro/alt/AltManager;
        //   401: aload_1        
        //   402: aload_0        
        //   403: getstatic       dev/nuker/pyro/fc.0:I
        //   406: ifeq            414
        //   409: ldc             1156677530
        //   411: goto            416
        //   414: ldc             1767204736
        //   416: ldc             -1137674174
        //   418: ixor           
        //   419: lookupswitch {
        //          -475396719: 414
        //          -121567272: 465
        //          default: 444
        //        }
        //   444: aload_2        
        //   445: invokedynamic   BootstrapMethod #1, accept:(Ldev/nuker/pyro/fd;Lnet/minecraft/client/network/NetworkPlayerInfo;)Ljava/util/function/Consumer;
        //   450: goto            454
        //   453: athrow         
        //   454: invokevirtual   dev/nuker/pyro/alt/AltManager.fillProfileAsync:(Lcom/mojang/authlib/GameProfile;Ljava/util/function/Consumer;)Lcom/mojang/authlib/GameProfile;
        //   457: goto            461
        //   460: athrow         
        //   461: pop            
        //   462: return         
        //   463: aconst_null    
        //   464: athrow         
        //   465: aconst_null    
        //   466: athrow         
        //   467: aconst_null    
        //   468: athrow         
        //   469: aconst_null    
        //   470: athrow         
        //   471: aconst_null    
        //   472: athrow         
        //   473: aconst_null    
        //   474: athrow         
        //   475: aconst_null    
        //   476: athrow         
        //   477: pop            
        //   478: goto            24
        //   481: pop            
        //   482: aconst_null    
        //   483: goto            477
        //   486: dup            
        //   487: ifnull          477
        //   490: checkcast       Ljava/lang/Throwable;
        //   493: athrow         
        //   494: dup            
        //   495: ifnull          481
        //   498: checkcast       Ljava/lang/Throwable;
        //   501: athrow         
        //   502: aconst_null    
        //   503: athrow         
        //    StackMapTable: 00 45 43 07 00 1A 04 FF 00 0B 00 00 00 01 07 00 1A FD 00 03 07 00 03 07 00 25 0A 41 01 1E 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 25 00 02 07 00 03 01 5D 07 00 03 4D 07 00 59 FF 00 01 00 02 07 00 03 07 00 25 00 02 07 00 59 01 5B 07 00 59 FF 00 0E 00 02 07 00 03 07 00 25 00 02 07 00 59 07 00 59 FF 00 01 00 02 07 00 03 07 00 25 00 03 07 00 59 07 00 59 01 FF 00 1E 00 02 07 00 03 07 00 25 00 02 07 00 59 07 00 59 42 07 00 1A FF 00 00 00 02 07 00 03 07 00 25 00 02 07 00 59 07 00 59 47 07 00 1A FF 00 00 00 02 07 00 03 07 00 25 00 02 07 00 59 07 00 74 FF 00 0A 00 02 07 00 03 07 00 25 00 02 07 00 59 07 00 74 FF 00 01 00 02 07 00 03 07 00 25 00 03 07 00 59 07 00 74 01 FF 00 1D 00 02 07 00 03 07 00 25 00 02 07 00 59 07 00 74 48 07 00 1A FF 00 00 00 02 07 00 03 07 00 25 00 03 07 00 59 07 00 74 07 00 AB 47 07 00 1A FF 00 00 00 02 07 00 03 07 00 25 00 02 07 00 59 07 00 74 42 07 00 3C FF 00 00 00 02 07 00 03 07 00 25 00 02 07 00 59 07 00 74 45 07 00 1A FF 00 00 00 02 07 00 03 07 00 25 00 03 07 00 59 07 00 74 07 00 AD 42 07 00 1A FF 00 00 00 02 07 00 03 07 00 25 00 03 07 00 59 07 00 74 07 00 AD 47 07 00 1A FF 00 00 00 02 07 00 03 07 00 25 00 02 07 00 59 07 00 AF 45 07 00 1A FF 00 00 00 02 07 00 03 07 00 25 00 02 07 00 59 07 00 84 47 07 00 1A 40 01 48 07 00 1A FF 00 00 00 02 07 00 03 07 00 25 00 03 08 01 40 08 01 40 07 00 25 45 07 00 1A 40 07 00 1F FF 00 0C 00 03 07 00 03 07 00 25 07 00 1F 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 00 25 07 00 1F 00 02 07 00 03 01 5C 07 00 03 46 07 00 1A FF 00 00 00 03 07 00 03 07 00 25 07 00 1F 00 02 07 00 59 07 00 1F 47 07 00 1A 40 01 FF 00 10 00 03 07 00 03 07 00 25 07 00 1F 00 03 07 00 93 07 00 25 07 00 03 FF 00 01 00 03 07 00 03 07 00 25 07 00 1F 00 04 07 00 93 07 00 25 07 00 03 01 FF 00 1B 00 03 07 00 03 07 00 25 07 00 1F 00 03 07 00 93 07 00 25 07 00 03 48 07 00 1A FF 00 00 00 03 07 00 03 07 00 25 07 00 1F 00 03 07 00 93 07 00 25 07 00 B1 45 07 00 1A 40 07 00 25 FF 00 01 00 02 07 00 03 07 00 25 00 02 07 00 59 07 00 59 FF 00 01 00 03 07 00 03 07 00 25 07 00 1F 00 03 07 00 93 07 00 25 07 00 03 FF 00 01 00 02 07 00 03 07 00 25 00 02 07 00 59 07 00 74 41 07 00 59 FF 00 01 00 03 07 00 03 07 00 25 07 00 1F 00 01 07 00 03 FA 00 01 41 07 00 03 41 07 00 1A 43 05 44 07 00 1A 47 05 47 07 00 1A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     486    494    Any
        //  486    494    486    494    Ljava/lang/EnumConstantNotPresentException;
        //  502    504    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  207    216    216    217    Any
        //  207    216    216    217    Any
        //  208    216    207    208    Any
        //  207    216    207    208    Ljava/lang/ClassCastException;
        //  208    216    207    208    Any
        //  269    278    278    279    Any
        //  269    278    269    270    Any
        //  270    278    278    279    Any
        //  269    278    278    279    Ljava/lang/IndexOutOfBoundsException;
        //  269    278    278    279    Any
        //  282    289    289    290    Any
        //  282    289    289    290    Any
        //  282    289    282    283    Ljava/lang/StringIndexOutOfBoundsException;
        //  283    289    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  283    289    3      8      Any
        //  293    302    302    303    Any
        //  294    302    293    294    Any
        //  294    302    302    303    Ljava/lang/AssertionError;
        //  293    302    3      8      Ljava/lang/AssertionError;
        //  293    302    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  309    318    318    319    Any
        //  309    318    3      8      Any
        //  310    318    309    310    Any
        //  310    318    318    319    Any
        //  310    318    309    310    Ljava/lang/EnumConstantNotPresentException;
        //  328    335    335    336    Any
        //  329    335    335    336    Ljava/util/NoSuchElementException;
        //  329    335    328    329    Any
        //  328    335    335    336    Any
        //  328    335    328    329    Any
        //  387    396    396    397    Any
        //  388    396    396    397    Ljava/util/NoSuchElementException;
        //  387    396    387    388    Any
        //  388    396    396    397    Ljava/lang/ArithmeticException;
        //  388    396    396    397    Any
        //  453    460    460    461    Any
        //  453    460    460    461    Ljava/lang/NumberFormatException;
        //  454    460    460    461    Ljava/lang/RuntimeException;
        //  454    460    3      8      Ljava/util/ConcurrentModificationException;
        //  454    460    453    454    Any
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
    
    public void c(final NetworkPlayerInfo p0, final GameProfile p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          326
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            318
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            310
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/fd.c:Ljava/util/List;
        //    28: getstatic       dev/nuker/pyro/fc.c:I
        //    31: ifge            39
        //    34: ldc             -992881866
        //    36: goto            41
        //    39: ldc             1070818598
        //    41: ldc             -324691863
        //    43: ixor           
        //    44: lookupswitch {
        //          -747176625: 72
        //          678710111: 39
        //          default: 295
        //        }
        //    72: aload_1        
        //    73: goto            77
        //    76: athrow         
        //    77: invokeinterface java/util/List.remove:(Ljava/lang/Object;)Z
        //    82: goto            86
        //    85: athrow         
        //    86: pop            
        //    87: aload_0        
        //    88: getstatic       dev/nuker/pyro/fc.1:I
        //    91: ifeq            99
        //    94: ldc             1035704754
        //    96: goto            101
        //    99: ldc             -1491639805
        //   101: ldc             1352993290
        //   103: ixor           
        //   104: lookupswitch {
        //          -1559710424: 99
        //          1830720440: 299
        //          default: 132
        //        }
        //   132: getfield        dev/nuker/pyro/fd.c:Ljava/util/List;
        //   135: new             Lnet/minecraft/client/network/NetworkPlayerInfo;
        //   138: dup            
        //   139: getstatic       dev/nuker/pyro/fc.c:I
        //   142: ifge            150
        //   145: ldc             114251504
        //   147: goto            152
        //   150: ldc             -1276279328
        //   152: ldc             -2107984758
        //   154: ixor           
        //   155: lookupswitch {
        //          -2070551942: 150
        //          834089322: 180
        //          default: 291
        //        }
        //   180: aload_2        
        //   181: getstatic       dev/nuker/pyro/fc.0:I
        //   184: ifeq            192
        //   187: ldc             112159582
        //   189: goto            194
        //   192: ldc             -1699775917
        //   194: ldc             -680339232
        //   196: ixor           
        //   197: lookupswitch {
        //          -1376279726: 192
        //          -773999682: 297
        //          default: 224
        //        }
        //   224: goto            228
        //   227: athrow         
        //   228: invokespecial   net/minecraft/client/network/NetworkPlayerInfo.<init>:(Lcom/mojang/authlib/GameProfile;)V
        //   231: goto            235
        //   234: athrow         
        //   235: getstatic       dev/nuker/pyro/fc.0:I
        //   238: ifeq            246
        //   241: ldc             -768649277
        //   243: goto            248
        //   246: ldc             666217304
        //   248: ldc             -1615339750
        //   250: ixor           
        //   251: lookupswitch {
        //          -970787293: 246
        //          1301842137: 293
        //          default: 276
        //        }
        //   276: goto            280
        //   279: athrow         
        //   280: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   285: goto            289
        //   288: athrow         
        //   289: pop            
        //   290: return         
        //   291: aconst_null    
        //   292: athrow         
        //   293: aconst_null    
        //   294: athrow         
        //   295: aconst_null    
        //   296: athrow         
        //   297: aconst_null    
        //   298: athrow         
        //   299: aconst_null    
        //   300: athrow         
        //   301: pop            
        //   302: goto            24
        //   305: pop            
        //   306: aconst_null    
        //   307: goto            301
        //   310: dup            
        //   311: ifnull          301
        //   314: checkcast       Ljava/lang/Throwable;
        //   317: athrow         
        //   318: dup            
        //   319: ifnull          305
        //   322: checkcast       Ljava/lang/Throwable;
        //   325: athrow         
        //   326: aconst_null    
        //   327: athrow         
        //    StackMapTable: 00 29 43 07 00 1A 04 FF 00 0B 00 00 00 01 07 00 1A FE 00 03 07 00 03 07 00 1F 07 00 25 4E 07 00 59 FF 00 01 00 03 07 00 03 07 00 1F 07 00 25 00 02 07 00 59 01 5E 07 00 59 43 07 00 1A FF 00 00 00 03 07 00 03 07 00 1F 07 00 25 00 02 07 00 59 07 00 1F 47 07 00 1A 40 01 4C 07 00 03 FF 00 01 00 03 07 00 03 07 00 1F 07 00 25 00 02 07 00 03 01 5E 07 00 03 FF 00 11 00 03 07 00 03 07 00 1F 07 00 25 00 03 07 00 59 08 00 87 08 00 87 FF 00 01 00 03 07 00 03 07 00 1F 07 00 25 00 04 07 00 59 08 00 87 08 00 87 01 FF 00 1B 00 03 07 00 03 07 00 1F 07 00 25 00 03 07 00 59 08 00 87 08 00 87 FF 00 0B 00 03 07 00 03 07 00 1F 07 00 25 00 04 07 00 59 08 00 87 08 00 87 07 00 25 FF 00 01 00 03 07 00 03 07 00 1F 07 00 25 00 05 07 00 59 08 00 87 08 00 87 07 00 25 01 FF 00 1D 00 03 07 00 03 07 00 1F 07 00 25 00 04 07 00 59 08 00 87 08 00 87 07 00 25 42 07 00 B3 FF 00 00 00 03 07 00 03 07 00 1F 07 00 25 00 04 07 00 59 08 00 87 08 00 87 07 00 25 45 07 00 1A FF 00 00 00 03 07 00 03 07 00 1F 07 00 25 00 02 07 00 59 07 00 1F FF 00 0A 00 03 07 00 03 07 00 1F 07 00 25 00 02 07 00 59 07 00 1F FF 00 01 00 03 07 00 03 07 00 1F 07 00 25 00 03 07 00 59 07 00 1F 01 FF 00 1B 00 03 07 00 03 07 00 1F 07 00 25 00 02 07 00 59 07 00 1F 42 07 00 1A FF 00 00 00 03 07 00 03 07 00 1F 07 00 25 00 02 07 00 59 07 00 1F 47 07 00 1A 40 01 FF 00 01 00 03 07 00 03 07 00 1F 07 00 25 00 03 07 00 59 08 00 87 08 00 87 FF 00 01 00 03 07 00 03 07 00 1F 07 00 25 00 02 07 00 59 07 00 1F 41 07 00 59 FF 00 01 00 03 07 00 03 07 00 1F 07 00 25 00 04 07 00 59 08 00 87 08 00 87 07 00 25 41 07 00 03 41 07 00 1A 43 05 44 07 00 1A 47 05 47 07 00 1A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     310    318    Any
        //  310    318    310    318    Any
        //  326    328    3      8      Any
        //  76     85     85     86     Any
        //  76     85     3      8      Any
        //  76     85     76     77     Any
        //  76     85     85     86     Any
        //  76     85     85     86     Any
        //  227    234    234    235    Any
        //  228    234    234    235    Any
        //  227    234    227    228    Ljava/lang/UnsupportedOperationException;
        //  227    234    3      8      Any
        //  228    234    234    235    Ljava/lang/StringIndexOutOfBoundsException;
        //  279    288    288    289    Any
        //  280    288    279    280    Any
        //  279    288    288    289    Any
        //  279    288    288    289    Ljava/lang/UnsupportedOperationException;
        //  280    288    279    280    Any
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
    
    static {
        throw t;
    }
    
    @Nullable
    public NetworkPlayerInfo func_175104_a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          204
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            196
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            188
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/fd.c:Ljava/util/List;
        //    28: goto            32
        //    31: athrow         
        //    32: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //    37: goto            41
        //    40: athrow         
        //    41: aload_1        
        //    42: invokedynamic   BootstrapMethod #2, test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        //    47: goto            51
        //    50: athrow         
        //    51: invokeinterface java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        //    56: goto            60
        //    59: athrow         
        //    60: getstatic       dev/nuker/pyro/fc.0:I
        //    63: ifeq            71
        //    66: ldc             969798303
        //    68: goto            73
        //    71: ldc             -1440455348
        //    73: ldc             -12163324
        //    75: ixor           
        //    76: lookupswitch {
        //          -1308198307: 71
        //          -963930725: 175
        //          default: 104
        //        }
        //   104: goto            108
        //   107: athrow         
        //   108: invokeinterface java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        //   113: goto            117
        //   116: athrow         
        //   117: getstatic       dev/nuker/pyro/fc.0:I
        //   120: ifeq            128
        //   123: ldc             -97038394
        //   125: goto            130
        //   128: ldc             1073128005
        //   130: ldc             1167130113
        //   132: ixor           
        //   133: lookupswitch {
        //          -1079529017: 128
        //          2053528644: 160
        //          default: 177
        //        }
        //   160: goto            164
        //   163: athrow         
        //   164: invokevirtual   java/util/Optional.get:()Ljava/lang/Object;
        //   167: goto            171
        //   170: athrow         
        //   171: checkcast       Lnet/minecraft/client/network/NetworkPlayerInfo;
        //   174: areturn        
        //   175: aconst_null    
        //   176: athrow         
        //   177: aconst_null    
        //   178: athrow         
        //   179: pop            
        //   180: goto            24
        //   183: pop            
        //   184: aconst_null    
        //   185: goto            179
        //   188: dup            
        //   189: ifnull          179
        //   192: checkcast       Ljava/lang/Throwable;
        //   195: athrow         
        //   196: dup            
        //   197: ifnull          183
        //   200: checkcast       Ljava/lang/Throwable;
        //   203: athrow         
        //   204: aconst_null    
        //   205: athrow         
        //    StackMapTable: 00 21 43 07 00 1A 04 FF 00 0B 00 00 00 01 07 00 1A FD 00 03 07 00 03 07 00 E5 46 07 00 1A 40 07 00 59 47 07 00 1A 40 07 00 74 48 07 00 1A FF 00 00 00 02 07 00 03 07 00 E5 00 02 07 00 74 07 00 AB 47 07 00 1A 40 07 00 74 4A 07 00 74 FF 00 01 00 02 07 00 03 07 00 E5 00 02 07 00 74 01 5E 07 00 74 42 07 00 1A 40 07 00 74 47 07 00 1A 40 07 00 DF 4A 07 00 DF FF 00 01 00 02 07 00 03 07 00 E5 00 02 07 00 DF 01 5D 07 00 DF 42 07 00 1A 40 07 00 DF 45 07 00 1A 40 07 00 AF 43 07 00 74 41 07 00 DF 41 07 00 1A 43 05 44 07 00 1A 47 05 47 07 00 1A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     188    196    Any
        //  188    196    188    196    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  204    206    3      8      Ljava/util/NoSuchElementException;
        //  31     40     40     41     Any
        //  32     40     3      8      Any
        //  31     40     31     32     Ljava/util/NoSuchElementException;
        //  32     40     31     32     Ljava/lang/ArithmeticException;
        //  31     40     31     32     Any
        //  50     59     59     60     Any
        //  51     59     3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  50     59     50     51     Any
        //  50     59     59     60     Ljava/lang/IllegalStateException;
        //  50     59     59     60     Ljava/lang/ArithmeticException;
        //  107    116    116    117    Any
        //  107    116    107    108    Any
        //  107    116    116    117    Ljava/lang/NullPointerException;
        //  107    116    107    108    Ljava/lang/NegativeArraySizeException;
        //  108    116    3      8      Ljava/lang/IllegalStateException;
        //  163    170    170    171    Any
        //  163    170    163    164    Any
        //  164    170    170    171    Any
        //  164    170    163    164    Any
        //  163    170    163    164    Any
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
    
    public fd(final Minecraft minecraft) {
        final GuiScreen field_71462_r = minecraft.field_71462_r;
        while (true) {
            int n = 0;
            Label_0023: {
                if (fc.c < 0) {
                    n = -880128877;
                    break Label_0023;
                }
                n = 659375636;
            }
            switch (n ^ 0x9029B345) {
                case 33269448: {
                    continue;
                }
                default: {
                    super(minecraft, field_71462_r, (NetworkManager)new fg(EnumPacketDirection.CLIENTBOUND), minecraft.func_110432_I().func_148256_e());
                    while (true) {
                        int n2 = 0;
                        Label_0083: {
                            if (fc.1 != 0) {
                                n2 = -735390234;
                                break Label_0083;
                            }
                            n2 = 1838938170;
                        }
                        switch (n2 ^ 0x7728C5AA) {
                            case -1560145844: {
                                continue;
                            }
                            case 447954320: {
                                final ArrayList<NetworkPlayerInfo> c = new ArrayList<NetworkPlayerInfo>();
                                while (true) {
                                    int n3 = 0;
                                    Label_0135: {
                                        if (fc.0 != 0) {
                                            n3 = -1711779922;
                                            break Label_0135;
                                        }
                                        n3 = 259638976;
                                    }
                                    switch (n3 ^ 0x9DC34466) {
                                        case 979596223: {
                                            continue;
                                        }
                                        default: {
                                            this.c = c;
                                            this.c(minecraft.func_110432_I().func_148256_e());
                                            return;
                                        }
                                        case 70978504: {
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
                case 1537474518: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public NetworkPlayerInfo func_175102_a(final UUID p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          113
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            105
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            97
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/fd.c:Ljava/util/List;
        //    28: goto            32
        //    31: athrow         
        //    32: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //    37: goto            41
        //    40: athrow         
        //    41: aload_1        
        //    42: invokedynamic   BootstrapMethod #3, test:(Ljava/util/UUID;)Ljava/util/function/Predicate;
        //    47: goto            51
        //    50: athrow         
        //    51: invokeinterface java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        //    56: goto            60
        //    59: athrow         
        //    60: goto            64
        //    63: athrow         
        //    64: invokeinterface java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        //    69: goto            73
        //    72: athrow         
        //    73: goto            77
        //    76: athrow         
        //    77: invokevirtual   java/util/Optional.get:()Ljava/lang/Object;
        //    80: goto            84
        //    83: athrow         
        //    84: checkcast       Lnet/minecraft/client/network/NetworkPlayerInfo;
        //    87: areturn        
        //    88: pop            
        //    89: goto            24
        //    92: pop            
        //    93: aconst_null    
        //    94: goto            88
        //    97: dup            
        //    98: ifnull          88
        //   101: checkcast       Ljava/lang/Throwable;
        //   104: athrow         
        //   105: dup            
        //   106: ifnull          92
        //   109: checkcast       Ljava/lang/Throwable;
        //   112: athrow         
        //   113: aconst_null    
        //   114: athrow         
        //    StackMapTable: 00 19 43 07 00 1A 04 FF 00 0B 00 00 00 01 07 00 1A FD 00 03 07 00 03 07 00 31 46 07 00 1A 40 07 00 59 47 07 00 1A 40 07 00 74 48 07 00 0B FF 00 00 00 02 07 00 03 07 00 31 00 02 07 00 74 07 00 AB 47 07 00 1A 40 07 00 74 42 07 00 1A 40 07 00 74 47 07 00 1A 40 07 00 DF 42 07 00 1A 40 07 00 DF 45 07 00 1A 40 07 00 AF 43 07 00 1A 43 05 44 07 00 1A 47 05 47 07 00 1A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     97     105    Any
        //  97     105    97     105    Ljava/lang/IllegalArgumentException;
        //  113    115    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  31     40     40     41     Any
        //  31     40     40     41     Any
        //  32     40     31     32     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  32     40     31     32     Any
        //  31     40     31     32     Any
        //  50     59     59     60     Any
        //  51     59     59     60     Ljava/lang/IllegalStateException;
        //  51     59     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  50     59     59     60     Any
        //  51     59     50     51     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  63     72     72     73     Any
        //  63     72     63     64     Any
        //  63     72     3      8      Ljava/util/ConcurrentModificationException;
        //  64     72     72     73     Ljava/lang/ArithmeticException;
        //  64     72     3      8      Any
        //  76     83     83     84     Any
        //  77     83     3      8      Any
        //  76     83     83     84     Any
        //  77     83     3      8      Ljava/lang/IllegalStateException;
        //  76     83     76     77     Any
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
    
    public static boolean c(final GameProfile p0, final NetworkPlayerInfo p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          96
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            88
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            80
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   net/minecraft/client/network/NetworkPlayerInfo.func_178845_a:()Lcom/mojang/authlib/GameProfile;
        //    32: goto            36
        //    35: athrow         
        //    36: goto            40
        //    39: athrow         
        //    40: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //    43: goto            47
        //    46: athrow         
        //    47: aload_0        
        //    48: goto            52
        //    51: athrow         
        //    52: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //    55: goto            59
        //    58: athrow         
        //    59: goto            63
        //    62: athrow         
        //    63: invokevirtual   java/util/UUID.equals:(Ljava/lang/Object;)Z
        //    66: goto            70
        //    69: athrow         
        //    70: ireturn        
        //    71: pop            
        //    72: goto            24
        //    75: pop            
        //    76: aconst_null    
        //    77: goto            71
        //    80: dup            
        //    81: ifnull          71
        //    84: checkcast       Ljava/lang/Throwable;
        //    87: athrow         
        //    88: dup            
        //    89: ifnull          75
        //    92: checkcast       Ljava/lang/Throwable;
        //    95: athrow         
        //    96: aconst_null    
        //    97: athrow         
        //    StackMapTable: 00 19 43 07 00 1A 04 FF 00 0B 00 00 00 01 07 00 1A FD 00 03 07 00 25 07 00 1F 43 07 00 1A 40 07 00 1F 45 07 00 1A 40 07 00 25 42 07 00 46 40 07 00 25 45 07 00 1A 40 07 00 31 43 07 00 1A FF 00 00 00 02 07 00 25 07 00 1F 00 02 07 00 31 07 00 25 45 07 00 1A FF 00 00 00 02 07 00 25 07 00 1F 00 02 07 00 31 07 00 31 FF 00 02 00 00 00 01 07 00 1A FF 00 00 00 02 07 00 25 07 00 1F 00 02 07 00 31 07 00 31 45 07 00 1A 40 01 40 07 00 1A 43 05 44 07 00 1A 47 05 47 07 00 1A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     80     88     Ljava/lang/IndexOutOfBoundsException;
        //  80     88     80     88     Any
        //  96     98     3      8      Ljava/lang/IllegalStateException;
        //  28     35     35     36     Any
        //  29     35     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  28     35     3      8      Ljava/lang/ClassCastException;
        //  28     35     28     29     Any
        //  29     35     35     36     Ljava/util/NoSuchElementException;
        //  39     46     46     47     Any
        //  40     46     3      8      Any
        //  40     46     3      8      Any
        //  40     46     39     40     Ljava/util/ConcurrentModificationException;
        //  39     46     3      8      Ljava/lang/UnsupportedOperationException;
        //  51     58     58     59     Any
        //  51     58     51     52     Any
        //  52     58     3      8      Any
        //  51     58     51     52     Ljava/lang/NegativeArraySizeException;
        //  51     58     51     52     Ljava/lang/IllegalArgumentException;
        //  63     69     69     70     Any
        //  63     69     69     70     Any
        //  63     69     69     70     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  63     69     69     70     Ljava/lang/ArithmeticException;
        //  63     69     3      8      Ljava/lang/ArithmeticException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 45 out of bounds for length 45
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
    
    public static boolean c(final String p0, final NetworkPlayerInfo p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          131
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            123
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            115
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   net/minecraft/client/network/NetworkPlayerInfo.func_178845_a:()Lcom/mojang/authlib/GameProfile;
        //    32: goto            36
        //    35: athrow         
        //    36: getstatic       dev/nuker/pyro/fc.1:I
        //    39: ifeq            48
        //    42: ldc_w           1774415174
        //    45: goto            51
        //    48: ldc_w           -680161613
        //    51: ldc_w           383850600
        //    54: ixor           
        //    55: lookupswitch {
        //          735255899: 48
        //          2132964654: 104
        //          default: 80
        //        }
        //    80: goto            84
        //    83: athrow         
        //    84: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //    87: goto            91
        //    90: athrow         
        //    91: aload_0        
        //    92: goto            96
        //    95: athrow         
        //    96: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    99: goto            103
        //   102: athrow         
        //   103: ireturn        
        //   104: aconst_null    
        //   105: athrow         
        //   106: pop            
        //   107: goto            24
        //   110: pop            
        //   111: aconst_null    
        //   112: goto            106
        //   115: dup            
        //   116: ifnull          106
        //   119: checkcast       Ljava/lang/Throwable;
        //   122: athrow         
        //   123: dup            
        //   124: ifnull          110
        //   127: checkcast       Ljava/lang/Throwable;
        //   130: athrow         
        //   131: aconst_null    
        //   132: athrow         
        //    StackMapTable: 00 19 43 07 00 1A 04 FF 00 0B 00 00 00 01 07 00 1A FD 00 03 07 00 E5 07 00 1F 43 07 01 19 40 07 00 1F 45 07 00 1A 40 07 00 25 4B 07 00 25 FF 00 02 00 02 07 00 E5 07 00 1F 00 02 07 00 25 01 5C 07 00 25 42 07 00 1A 40 07 00 25 45 07 00 1A 40 07 00 E5 43 07 00 1A FF 00 00 00 02 07 00 E5 07 00 1F 00 02 07 00 E5 07 00 E5 45 07 00 1A 40 01 40 07 00 25 41 07 00 11 43 05 44 07 00 11 47 05 47 07 00 1A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     115    123    Ljava/lang/EnumConstantNotPresentException;
        //  115    123    115    123    Ljava/lang/NegativeArraySizeException;
        //  131    133    3      8      Ljava/lang/NumberFormatException;
        //  28     35     35     36     Any
        //  29     35     28     29     Ljava/lang/IllegalArgumentException;
        //  28     35     3      8      Ljava/util/ConcurrentModificationException;
        //  28     35     3      8      Any
        //  29     35     3      8      Any
        //  83     90     90     91     Any
        //  84     90     3      8      Ljava/lang/NegativeArraySizeException;
        //  84     90     83     84     Any
        //  84     90     83     84     Any
        //  84     90     83     84     Ljava/util/ConcurrentModificationException;
        //  95     102    102    103    Any
        //  96     102    3      8      Any
        //  96     102    102    103    Ljava/lang/ClassCastException;
        //  95     102    95     96     Any
        //  95     102    3      8      Ljava/util/ConcurrentModificationException;
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
}
