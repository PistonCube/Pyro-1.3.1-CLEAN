// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.network.play.server.SPacketPlayerListItem$AddPlayerData;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public class f6a extends fH
{
    public CopyOnWriteArrayList<UUID> c;
    public fbt c;
    public fbu c;
    
    public boolean 0(final UUID p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          185
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            177
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            169
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f6a.c:Ljava/util/concurrent/CopyOnWriteArrayList;
        //    28: getstatic       dev/nuker/pyro/fc.0:I
        //    31: ifeq            39
        //    34: ldc             693577774
        //    36: goto            41
        //    39: ldc             1558263737
        //    41: ldc             -295111982
        //    43: ixor           
        //    44: lookupswitch {
        //          -952116484: 158
        //          -117928233: 39
        //          default: 72
        //        }
        //    72: aload_1        
        //    73: goto            77
        //    76: athrow         
        //    77: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.contains:(Ljava/lang/Object;)Z
        //    80: goto            84
        //    83: athrow         
        //    84: ifeq            92
        //    87: ldc             -840167600
        //    89: goto            94
        //    92: ldc             -840167599
        //    94: ldc             -12782108
        //    96: ixor           
        //    97: tableswitch {
        //          1705112936: 120
        //          1705112937: 139
        //          default: 87
        //        }
        //   120: aload_0        
        //   121: getfield        dev/nuker/pyro/f6a.c:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   124: aload_1        
        //   125: goto            129
        //   128: athrow         
        //   129: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.remove:(Ljava/lang/Object;)Z
        //   132: goto            136
        //   135: athrow         
        //   136: pop            
        //   137: iconst_1       
        //   138: ireturn        
        //   139: aload_0        
        //   140: getfield        dev/nuker/pyro/f6a.c:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   143: aload_1        
        //   144: goto            148
        //   147: athrow         
        //   148: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.add:(Ljava/lang/Object;)Z
        //   151: goto            155
        //   154: athrow         
        //   155: pop            
        //   156: iconst_0       
        //   157: ireturn        
        //   158: aconst_null    
        //   159: athrow         
        //   160: pop            
        //   161: goto            24
        //   164: pop            
        //   165: aconst_null    
        //   166: goto            160
        //   169: dup            
        //   170: ifnull          160
        //   173: checkcast       Ljava/lang/Throwable;
        //   176: athrow         
        //   177: dup            
        //   178: ifnull          164
        //   181: checkcast       Ljava/lang/Throwable;
        //   184: athrow         
        //   185: aconst_null    
        //   186: athrow         
        //    StackMapTable: 00 1E 43 07 00 1F 04 FF 00 0B 00 00 00 01 07 00 1F FD 00 03 07 00 03 07 00 37 4E 07 00 28 FF 00 01 00 02 07 00 03 07 00 37 00 02 07 00 28 01 5E 07 00 28 43 07 00 1F FF 00 00 00 02 07 00 03 07 00 37 00 02 07 00 28 07 00 37 45 07 00 1F 40 01 02 04 41 01 19 47 07 00 10 FF 00 00 00 02 07 00 03 07 00 37 00 02 07 00 28 07 00 37 45 07 00 1F 40 01 02 47 07 00 18 FF 00 00 00 02 07 00 03 07 00 37 00 02 07 00 28 07 00 37 45 07 00 1F 40 01 42 07 00 28 41 07 00 1F 43 05 44 07 00 1F 47 05 47 07 00 1F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     169    177    Any
        //  169    177    169    177    Any
        //  185    187    3      8      Any
        //  76     83     83     84     Any
        //  77     83     3      8      Any
        //  77     83     76     77     Any
        //  77     83     3      8      Any
        //  77     83     83     84     Ljava/lang/NullPointerException;
        //  128    135    135    136    Any
        //  129    135    128    129    Ljava/lang/StringIndexOutOfBoundsException;
        //  128    135    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  128    135    135    136    Ljava/lang/IndexOutOfBoundsException;
        //  129    135    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  147    154    154    155    Any
        //  147    154    154    155    Ljava/lang/StringIndexOutOfBoundsException;
        //  147    154    3      8      Ljava/lang/IllegalArgumentException;
        //  147    154    154    155    Ljava/lang/NullPointerException;
        //  148    154    147    148    Ljava/lang/ArrayIndexOutOfBoundsException;
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
    
    static {
        throw t;
    }
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          169
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            161
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            153
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.1:I
        //    28: ifeq            36
        //    31: ldc             1805577114
        //    33: goto            38
        //    36: ldc             1131127175
        //    38: ldc             978792335
        //    40: ixor           
        //    41: lookupswitch {
        //          1372177429: 140
        //          1551525691: 36
        //          default: 68
        //        }
        //    68: iload_1        
        //    69: aload_2        
        //    70: getstatic       dev/nuker/pyro/fc.0:I
        //    73: ifeq            81
        //    76: ldc             -97457398
        //    78: goto            83
        //    81: ldc             -738847067
        //    83: ldc             -1852719523
        //    85: ixor           
        //    86: lookupswitch {
        //          1144208825: 81
        //          1805735255: 142
        //          default: 112
        //        }
        //   112: aload_3        
        //   113: goto            117
        //   116: athrow         
        //   117: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //   120: goto            124
        //   123: athrow         
        //   124: aload_0        
        //   125: getfield        dev/nuker/pyro/f6a.c:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   128: goto            132
        //   131: athrow         
        //   132: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.clear:()V
        //   135: goto            139
        //   138: athrow         
        //   139: return         
        //   140: aconst_null    
        //   141: athrow         
        //   142: aconst_null    
        //   143: athrow         
        //   144: pop            
        //   145: goto            24
        //   148: pop            
        //   149: aconst_null    
        //   150: goto            144
        //   153: dup            
        //   154: ifnull          144
        //   157: checkcast       Ljava/lang/Throwable;
        //   160: athrow         
        //   161: dup            
        //   162: ifnull          148
        //   165: checkcast       Ljava/lang/Throwable;
        //   168: athrow         
        //   169: aconst_null    
        //   170: athrow         
        //    RuntimeInvisibleTypeAnnotations: 00 02 16 01 00 00 3B 00 00 16 02 00 00 3B 00 00
        //    StackMapTable: 00 19 43 07 00 1F 04 FF 00 0B 00 00 00 01 07 00 1F FF 00 03 00 04 07 00 03 01 07 00 52 07 00 54 00 00 4B 07 00 03 FF 00 01 00 04 07 00 03 01 07 00 52 07 00 54 00 02 07 00 03 01 5D 07 00 03 FF 00 0C 00 04 07 00 03 01 07 00 52 07 00 54 00 03 07 00 03 01 07 00 52 FF 00 01 00 04 07 00 03 01 07 00 52 07 00 54 00 04 07 00 03 01 07 00 52 01 FF 00 1C 00 04 07 00 03 01 07 00 52 07 00 54 00 03 07 00 03 01 07 00 52 43 07 00 1F FF 00 00 00 04 07 00 03 01 07 00 52 07 00 54 00 04 07 00 03 01 07 00 52 07 00 54 45 07 00 1F 00 46 07 00 3F 40 07 00 28 45 07 00 1F 00 40 07 00 03 FF 00 01 00 04 07 00 03 01 07 00 52 07 00 54 00 03 07 00 03 01 07 00 52 41 07 00 1F 43 05 44 07 00 1F 47 05 47 07 00 1F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     153    161    Any
        //  153    161    153    161    Any
        //  169    171    3      8      Ljava/lang/RuntimeException;
        //  116    123    123    124    Any
        //  117    123    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  117    123    123    124    Any
        //  116    123    116    117    Any
        //  117    123    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  131    138    138    139    Any
        //  131    138    131    132    Ljava/lang/NumberFormatException;
        //  132    138    3      8      Any
        //  132    138    3      8      Any
        //  132    138    138    139    Ljava/lang/ArithmeticException;
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
    
    public String c(final UUID p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          135
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            127
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            119
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/f03.c:Ldev/nuker/pyro/f03;
        //    27: aload_1        
        //    28: goto            32
        //    31: athrow         
        //    32: invokevirtual   java/util/UUID.toString:()Ljava/lang/String;
        //    35: goto            39
        //    38: athrow         
        //    39: ldc             "-"
        //    41: ldc             ""
        //    43: goto            47
        //    46: athrow         
        //    47: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //    50: goto            54
        //    53: athrow         
        //    54: getstatic       dev/nuker/pyro/fc.1:I
        //    57: ifeq            65
        //    60: ldc             -1015135494
        //    62: goto            67
        //    65: ldc             36184686
        //    67: ldc             -4344468
        //    69: ixor           
        //    70: lookupswitch {
        //          1019475862: 108
        //          1736248732: 65
        //          default: 96
        //        }
        //    96: goto            100
        //    99: athrow         
        //   100: invokevirtual   dev/nuker/pyro/f03.0:(Ljava/lang/String;)Ljava/lang/String;
        //   103: goto            107
        //   106: athrow         
        //   107: areturn        
        //   108: aconst_null    
        //   109: athrow         
        //   110: pop            
        //   111: goto            24
        //   114: pop            
        //   115: aconst_null    
        //   116: goto            110
        //   119: dup            
        //   120: ifnull          110
        //   123: checkcast       Ljava/lang/Throwable;
        //   126: athrow         
        //   127: dup            
        //   128: ifnull          114
        //   131: checkcast       Ljava/lang/Throwable;
        //   134: athrow         
        //   135: aconst_null    
        //   136: athrow         
        //    StackMapTable: 00 19 43 07 00 1F 04 FF 00 0B 00 00 00 01 07 00 1F FD 00 03 07 00 03 07 00 37 46 07 00 1F FF 00 00 00 02 07 00 03 07 00 37 00 02 07 00 5D 07 00 37 45 07 00 1F FF 00 00 00 02 07 00 03 07 00 37 00 02 07 00 5D 07 00 6A FF 00 06 00 00 00 01 07 00 1F FF 00 00 00 02 07 00 03 07 00 37 00 04 07 00 5D 07 00 6A 07 00 6A 07 00 6A 45 07 00 1F FF 00 00 00 02 07 00 03 07 00 37 00 02 07 00 5D 07 00 6A FF 00 0A 00 02 07 00 03 07 00 37 00 02 07 00 5D 07 00 6A FF 00 01 00 02 07 00 03 07 00 37 00 03 07 00 5D 07 00 6A 01 FF 00 1C 00 02 07 00 03 07 00 37 00 02 07 00 5D 07 00 6A 42 07 00 1F FF 00 00 00 02 07 00 03 07 00 37 00 02 07 00 5D 07 00 6A 45 07 00 1F 40 07 00 6A FF 00 00 00 02 07 00 03 07 00 37 00 02 07 00 5D 07 00 6A 41 07 00 1F 43 05 44 07 00 1F 47 05 47 07 00 1F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     119    127    Any
        //  119    127    119    127    Ljava/lang/IndexOutOfBoundsException;
        //  135    137    3      8      Any
        //  31     38     38     39     Any
        //  32     38     31     32     Any
        //  32     38     3      8      Any
        //  31     38     31     32     Ljava/lang/AssertionError;
        //  31     38     31     32     Any
        //  47     53     53     54     Any
        //  47     53     3      8      Any
        //  47     53     3      8      Ljava/lang/RuntimeException;
        //  47     53     3      8      Any
        //  47     53     3      8      Any
        //  99     106    106    107    Any
        //  100    106    99     100    Ljava/util/NoSuchElementException;
        //  100    106    106    107    Ljava/lang/UnsupportedOperationException;
        //  100    106    99     100    Any
        //  100    106    99     100    Ljava/lang/RuntimeException;
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
    
    public void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          665
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            657
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            649
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             -748990885
        //    32: goto            37
        //    35: ldc             1802011046
        //    37: ldc             1972683832
        //    39: ixor           
        //    40: lookupswitch {
        //          -1496348061: 624
        //          -1153787743: 35
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f6a.c:Ljava/util/concurrent/CopyOnWriteArrayList;
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
        //    79: goto            83
        //    82: athrow         
        //    83: astore_1       
        //    84: aload_1        
        //    85: getstatic       dev/nuker/pyro/fc.1:I
        //    88: ifeq            96
        //    91: ldc             713924213
        //    93: goto            98
        //    96: ldc             -1790921308
        //    98: ldc             -1836384651
        //   100: ixor           
        //   101: lookupswitch {
        //          -1805186414: 96
        //          -1207476224: 628
        //          default: 128
        //        }
        //   128: goto            132
        //   131: athrow         
        //   132: invokeinterface java/util/Iterator.hasNext:()Z
        //   137: goto            141
        //   140: athrow         
        //   141: ifeq            149
        //   144: ldc             363636916
        //   146: goto            151
        //   149: ldc             363636917
        //   151: ldc             473552404
        //   153: ixor           
        //   154: tableswitch {
        //          321584448: 176
        //          321584449: 623
        //          default: 144
        //        }
        //   176: aload_1        
        //   177: goto            181
        //   180: athrow         
        //   181: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   186: goto            190
        //   189: athrow         
        //   190: checkcast       Ljava/util/UUID;
        //   193: astore_2       
        //   194: aload_0        
        //   195: getfield        dev/nuker/pyro/f6a.c:Lnet/minecraft/client/Minecraft;
        //   198: getstatic       dev/nuker/pyro/fc.1:I
        //   201: ifeq            209
        //   204: ldc             -275030665
        //   206: goto            211
        //   209: ldc             147412513
        //   211: ldc             950179573
        //   213: ixor           
        //   214: lookupswitch {
        //          -1517593010: 209
        //          -684078206: 630
        //          default: 240
        //        }
        //   240: goto            244
        //   243: athrow         
        //   244: invokevirtual   net/minecraft/client/Minecraft.func_147114_u:()Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   247: goto            251
        //   250: athrow         
        //   251: aload_2        
        //   252: goto            256
        //   255: athrow         
        //   256: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_175102_a:(Ljava/util/UUID;)Lnet/minecraft/client/network/NetworkPlayerInfo;
        //   259: goto            263
        //   262: athrow         
        //   263: ifnull          620
        //   266: aload_0        
        //   267: getfield        dev/nuker/pyro/f6a.c:Ldev/nuker/pyro/fbt;
        //   270: ldc2_w          1000
        //   273: goto            277
        //   276: athrow         
        //   277: invokevirtual   dev/nuker/pyro/fbt.c:(J)Z
        //   280: goto            284
        //   283: athrow         
        //   284: ifeq            562
        //   287: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //   290: new             Ljava/lang/StringBuilder;
        //   293: dup            
        //   294: goto            298
        //   297: athrow         
        //   298: invokespecial   java/lang/StringBuilder.<init>:()V
        //   301: goto            305
        //   304: athrow         
        //   305: getstatic       dev/nuker/pyro/fc.0:I
        //   308: ifeq            316
        //   311: ldc             379375424
        //   313: goto            318
        //   316: ldc             700360291
        //   318: ldc             -964713395
        //   320: ixor           
        //   321: lookupswitch {
        //          -2050034474: 316
        //          -790402291: 638
        //          default: 348
        //        }
        //   348: aload_0        
        //   349: getstatic       dev/nuker/pyro/fc.c:I
        //   352: ifge            360
        //   355: ldc             -1342998554
        //   357: goto            362
        //   360: ldc             1860986054
        //   362: ldc             -1534833924
        //   364: ixor           
        //   365: lookupswitch {
        //          -899142086: 392
        //          192363802: 360
        //          default: 634
        //        }
        //   392: aload_2        
        //   393: getstatic       dev/nuker/pyro/fc.1:I
        //   396: ifeq            404
        //   399: ldc             -2135427884
        //   401: goto            406
        //   404: ldc             -1715606670
        //   406: ldc             -1667924584
        //   408: ixor           
        //   409: lookupswitch {
        //          472025420: 636
        //          1321048587: 404
        //          default: 436
        //        }
        //   436: goto            440
        //   439: athrow         
        //   440: invokevirtual   dev/nuker/pyro/f6a.c:(Ljava/util/UUID;)Ljava/lang/String;
        //   443: goto            447
        //   446: athrow         
        //   447: goto            451
        //   450: athrow         
        //   451: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   454: goto            458
        //   457: athrow         
        //   458: ldc             "\u2279\u149a\u8ac3\ub188\ucf8b\uec30\ub264\ue6f1\udb76\ueff8\ua6f8\u1e49\ue1cb\uc7f6\u8767\u88a5\u57aa\u7731\ubf3f\uc642\u2ace\uc23f\u6a7e"
        //   460: goto            464
        //   463: athrow         
        //   464: invokestatic    invokestatic   !!! ERROR
        //   467: goto            471
        //   470: athrow         
        //   471: goto            475
        //   474: athrow         
        //   475: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   478: goto            482
        //   481: athrow         
        //   482: goto            486
        //   485: athrow         
        //   486: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   489: goto            493
        //   492: athrow         
        //   493: goto            497
        //   496: athrow         
        //   497: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //   500: goto            504
        //   503: athrow         
        //   504: aload_0        
        //   505: getstatic       dev/nuker/pyro/fc.0:I
        //   508: ifeq            516
        //   511: ldc             -820082191
        //   513: goto            518
        //   516: ldc             203336872
        //   518: ldc             1333257126
        //   520: ixor           
        //   521: lookupswitch {
        //          -2140575145: 632
        //          -1662984356: 516
        //          default: 548
        //        }
        //   548: getfield        dev/nuker/pyro/f6a.c:Ldev/nuker/pyro/fbt;
        //   551: goto            555
        //   554: athrow         
        //   555: invokevirtual   dev/nuker/pyro/fbt.c:()V
        //   558: goto            562
        //   561: athrow         
        //   562: aload_0        
        //   563: getstatic       dev/nuker/pyro/fc.c:I
        //   566: ifge            574
        //   569: ldc             -588356916
        //   571: goto            576
        //   574: ldc             599725578
        //   576: ldc             -1668713133
        //   578: ixor           
        //   579: lookupswitch {
        //          1080498079: 626
        //          1984806705: 574
        //          default: 604
        //        }
        //   604: getfield        dev/nuker/pyro/f6a.c:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   607: aload_2        
        //   608: goto            612
        //   611: athrow         
        //   612: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.remove:(Ljava/lang/Object;)Z
        //   615: goto            619
        //   618: athrow         
        //   619: pop            
        //   620: goto            84
        //   623: return         
        //   624: aconst_null    
        //   625: athrow         
        //   626: aconst_null    
        //   627: athrow         
        //   628: aconst_null    
        //   629: athrow         
        //   630: aconst_null    
        //   631: athrow         
        //   632: aconst_null    
        //   633: athrow         
        //   634: aconst_null    
        //   635: athrow         
        //   636: aconst_null    
        //   637: athrow         
        //   638: aconst_null    
        //   639: athrow         
        //   640: pop            
        //   641: goto            24
        //   644: pop            
        //   645: aconst_null    
        //   646: goto            640
        //   649: dup            
        //   650: ifnull          640
        //   653: checkcast       Ljava/lang/Throwable;
        //   656: athrow         
        //   657: dup            
        //   658: ifnull          644
        //   661: checkcast       Ljava/lang/Throwable;
        //   664: athrow         
        //   665: aconst_null    
        //   666: athrow         
        //    StackMapTable: 00 6C 43 07 00 1F 04 FF 00 0B 00 00 00 01 07 00 1F FC 00 03 07 00 03 0A 41 01 1E 46 07 00 3D 40 07 00 28 45 07 00 1F 40 07 00 88 FC 00 00 07 00 88 4B 07 00 88 FF 00 01 00 02 07 00 03 07 00 88 00 02 07 00 88 01 5D 07 00 88 42 07 00 1F 40 07 00 88 47 07 00 1F 40 01 02 04 41 01 18 43 07 00 1F 40 07 00 88 47 07 00 1F 40 07 00 DC FF 00 12 00 03 07 00 03 07 00 88 07 00 37 00 01 07 00 9B FF 00 01 00 03 07 00 03 07 00 88 07 00 37 00 02 07 00 9B 01 5C 07 00 9B 42 07 00 3D 40 07 00 9B 45 07 00 1F 40 07 00 A1 43 07 00 1F FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 02 07 00 A1 07 00 37 45 07 00 1F 40 07 00 DE 4C 07 00 1F FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 02 07 00 AB 04 45 07 00 1F 40 01 4C 07 00 3D FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 03 07 00 B0 08 01 22 08 01 22 45 07 00 1F FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 02 07 00 B0 07 00 B6 FF 00 0A 00 03 07 00 03 07 00 88 07 00 37 00 02 07 00 B0 07 00 B6 FF 00 01 00 03 07 00 03 07 00 88 07 00 37 00 03 07 00 B0 07 00 B6 01 FF 00 1D 00 03 07 00 03 07 00 88 07 00 37 00 02 07 00 B0 07 00 B6 FF 00 0B 00 03 07 00 03 07 00 88 07 00 37 00 03 07 00 B0 07 00 B6 07 00 03 FF 00 01 00 03 07 00 03 07 00 88 07 00 37 00 04 07 00 B0 07 00 B6 07 00 03 01 FF 00 1D 00 03 07 00 03 07 00 88 07 00 37 00 03 07 00 B0 07 00 B6 07 00 03 FF 00 0B 00 03 07 00 03 07 00 88 07 00 37 00 04 07 00 B0 07 00 B6 07 00 03 07 00 37 FF 00 01 00 03 07 00 03 07 00 88 07 00 37 00 05 07 00 B0 07 00 B6 07 00 03 07 00 37 01 FF 00 1D 00 03 07 00 03 07 00 88 07 00 37 00 04 07 00 B0 07 00 B6 07 00 03 07 00 37 42 07 00 14 FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 04 07 00 B0 07 00 B6 07 00 03 07 00 37 45 07 00 1F FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 03 07 00 B0 07 00 B6 07 00 6A FF 00 02 00 00 00 01 07 00 1F FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 03 07 00 B0 07 00 B6 07 00 6A 45 07 00 1F FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 02 07 00 B0 07 00 B6 44 07 00 1F FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 03 07 00 B0 07 00 B6 07 00 6A 45 07 00 1F FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 03 07 00 B0 07 00 B6 07 00 6A 42 07 00 14 FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 03 07 00 B0 07 00 B6 07 00 6A 45 07 00 1F FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 02 07 00 B0 07 00 B6 42 07 00 1F FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 02 07 00 B0 07 00 B6 45 07 00 1F FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 02 07 00 B0 07 00 6A 42 07 00 0E FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 02 07 00 B0 07 00 6A 45 07 00 1F 00 4B 07 00 03 FF 00 01 00 03 07 00 03 07 00 88 07 00 37 00 02 07 00 03 01 5D 07 00 03 FF 00 05 00 00 00 01 07 00 1F FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 01 07 00 AB 45 07 00 1F 00 4B 07 00 03 FF 00 01 00 03 07 00 03 07 00 88 07 00 37 00 02 07 00 03 01 5B 07 00 03 46 07 00 1F FF 00 00 00 03 07 00 03 07 00 88 07 00 37 00 02 07 00 28 07 00 37 45 07 00 1F 40 01 00 FA 00 02 FA 00 00 FF 00 01 00 03 07 00 03 07 00 88 07 00 37 00 01 07 00 03 FF 00 01 00 02 07 00 03 07 00 88 00 01 07 00 88 FF 00 01 00 03 07 00 03 07 00 88 07 00 37 00 01 07 00 9B 41 07 00 03 FF 00 01 00 03 07 00 03 07 00 88 07 00 37 00 03 07 00 B0 07 00 B6 07 00 03 FF 00 01 00 03 07 00 03 07 00 88 07 00 37 00 04 07 00 B0 07 00 B6 07 00 03 07 00 37 FF 00 01 00 03 07 00 03 07 00 88 07 00 37 00 02 07 00 B0 07 00 B6 FF 00 01 00 01 07 00 03 00 01 07 00 3D 43 05 44 07 00 3D 47 05 47 07 00 1F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     649    657    Ljava/lang/NegativeArraySizeException;
        //  649    657    649    657    Ljava/lang/IllegalStateException;
        //  665    667    3      8      Any
        //  75     82     82     83     Any
        //  76     82     75     76     Ljava/lang/IllegalArgumentException;
        //  76     82     75     76     Ljava/lang/ArithmeticException;
        //  76     82     82     83     Any
        //  76     82     3      8      Ljava/lang/ClassCastException;
        //  131    140    140    141    Any
        //  132    140    131    132    Any
        //  132    140    140    141    Any
        //  131    140    131    132    Ljava/lang/RuntimeException;
        //  132    140    140    141    Any
        //  180    189    189    190    Any
        //  181    189    180    181    Ljava/lang/IllegalArgumentException;
        //  181    189    189    190    Any
        //  180    189    180    181    Any
        //  181    189    189    190    Ljava/lang/NumberFormatException;
        //  243    250    250    251    Any
        //  244    250    3      8      Any
        //  243    250    243    244    Ljava/lang/IllegalArgumentException;
        //  243    250    243    244    Ljava/lang/IllegalStateException;
        //  243    250    250    251    Ljava/lang/ArithmeticException;
        //  255    262    262    263    Any
        //  256    262    262    263    Any
        //  256    262    255    256    Ljava/util/ConcurrentModificationException;
        //  255    262    262    263    Ljava/lang/ClassCastException;
        //  256    262    255    256    Any
        //  276    283    283    284    Any
        //  276    283    3      8      Any
        //  276    283    283    284    Ljava/lang/NumberFormatException;
        //  277    283    276    277    Any
        //  276    283    3      8      Ljava/lang/NegativeArraySizeException;
        //  297    304    304    305    Any
        //  298    304    297    298    Ljava/lang/IllegalStateException;
        //  298    304    304    305    Any
        //  297    304    297    298    Ljava/util/NoSuchElementException;
        //  298    304    297    298    Ljava/lang/RuntimeException;
        //  439    446    446    447    Any
        //  439    446    439    440    Ljava/lang/EnumConstantNotPresentException;
        //  439    446    446    447    Ljava/util/ConcurrentModificationException;
        //  439    446    446    447    Ljava/lang/ClassCastException;
        //  440    446    3      8      Any
        //  451    457    457    458    Any
        //  451    457    457    458    Any
        //  451    457    457    458    Ljava/util/ConcurrentModificationException;
        //  451    457    3      8      Ljava/lang/RuntimeException;
        //  451    457    3      8      Ljava/lang/IllegalArgumentException;
        //  463    470    470    471    Any
        //  463    470    463    464    Any
        //  464    470    3      8      Any
        //  464    470    463    464    Ljava/lang/UnsupportedOperationException;
        //  463    470    463    464    Ljava/lang/UnsupportedOperationException;
        //  474    481    481    482    Any
        //  474    481    474    475    Ljava/lang/EnumConstantNotPresentException;
        //  475    481    481    482    Ljava/lang/UnsupportedOperationException;
        //  474    481    481    482    Ljava/lang/ArithmeticException;
        //  474    481    3      8      Any
        //  485    492    492    493    Any
        //  486    492    485    486    Any
        //  485    492    3      8      Ljava/lang/RuntimeException;
        //  485    492    485    486    Any
        //  486    492    492    493    Any
        //  496    503    503    504    Any
        //  496    503    496    497    Ljava/lang/NullPointerException;
        //  497    503    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  496    503    3      8      Ljava/lang/UnsupportedOperationException;
        //  497    503    503    504    Any
        //  555    561    561    562    Any
        //  555    561    561    562    Any
        //  555    561    3      8      Any
        //  555    561    561    562    Any
        //  555    561    561    562    Ljava/lang/NumberFormatException;
        //  611    618    618    619    Any
        //  612    618    611    612    Any
        //  611    618    618    619    Ljava/util/NoSuchElementException;
        //  612    618    611    612    Any
        //  612    618    618    619    Ljava/lang/UnsupportedOperationException;
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
    
    public f6a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u2238\u149d\u8ac4\ub3d0\uc980\uec3e\ub22a\ue6f4\ud97b\ue9ed"
        //     3: getstatic       dev/nuker/pyro/fc.c:I
        //     6: ifge            14
        //     9: ldc             1413246627
        //    11: goto            16
        //    14: ldc             1324127403
        //    16: ldc             2021718005
        //    18: ixor           
        //    19: lookupswitch {
        //          750557526: 14
        //          913072990: 44
        //          default: 179
        //        }
        //    44: invokestatic    invokestatic   !!! ERROR
        //    47: ldc             "\u2218\u149d\u8ac4\ub3d0\uc9a0\uec3e\ub22a\ue6f4\ud97b\ue9ed"
        //    49: invokestatic    invokestatic   !!! ERROR
        //    52: ldc             "\u2217\u149c\u8ac4\ub3d0\uc990\uec36\ub221\ue6ee\ud928\ue9fc\ua6f0\u1e59\ue199\uc5b0\u816a\u88a1\u57aa\u7778\ubd3c\uc019\u2adb\uc237\u6a31\u2d4f\ud782\u344e\u7d6b\u8996\u801f\u8cd6\u857c\ufb20\u70fc\u9a56\u1bc6\uf0bf\u4972\u8855\uca95\uff7a\ub741\u41fe\ub9c6\ub34c\u4c25\u8b62"
        //    54: invokestatic    invokestatic   !!! ERROR
        //    57: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    60: getstatic       dev/nuker/pyro/fc.1:I
        //    63: ifeq            71
        //    66: ldc             -242249993
        //    68: goto            73
        //    71: ldc             -1829176571
        //    73: ldc             909370592
        //    75: ixor           
        //    76: lookupswitch {
        //          -943953385: 181
        //          375505879: 71
        //          default: 104
        //        }
        //   104: aload_0        
        //   105: new             Ljava/util/concurrent/CopyOnWriteArrayList;
        //   108: dup            
        //   109: invokespecial   java/util/concurrent/CopyOnWriteArrayList.<init>:()V
        //   112: putfield        dev/nuker/pyro/f6a.c:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   115: aload_0        
        //   116: new             Ldev/nuker/pyro/fbt;
        //   119: dup            
        //   120: invokespecial   dev/nuker/pyro/fbt.<init>:()V
        //   123: getstatic       dev/nuker/pyro/fc.c:I
        //   126: ifge            134
        //   129: ldc             -48960994
        //   131: goto            136
        //   134: ldc             -1621968306
        //   136: ldc             -1740790784
        //   138: ixor           
        //   139: lookupswitch {
        //          124722766: 164
        //          1697205790: 134
        //          default: 183
        //        }
        //   164: putfield        dev/nuker/pyro/f6a.c:Ldev/nuker/pyro/fbt;
        //   167: aload_0        
        //   168: new             Ldev/nuker/pyro/fbu;
        //   171: dup            
        //   172: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   175: putfield        dev/nuker/pyro/f6a.c:Ldev/nuker/pyro/fbu;
        //   178: return         
        //   179: aconst_null    
        //   180: athrow         
        //   181: aconst_null    
        //   182: athrow         
        //   183: aconst_null    
        //   184: athrow         
        //    StackMapTable: 00 0C FF 00 0E 00 01 06 00 02 06 07 00 6A FF 00 01 00 01 06 00 03 06 07 00 6A 01 FF 00 1B 00 01 06 00 02 06 07 00 6A FF 00 1A 00 01 07 00 03 00 00 41 01 1E FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 AB FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 AB 01 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 AB FF 00 0E 00 01 06 00 02 06 07 00 6A FF 00 01 00 01 07 00 03 00 00 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 AB
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
    public void c(final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          338
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            330
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            322
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: aload_0        
        //    26: getfield        dev/nuker/pyro/f6a.c:Ljava/util/concurrent/CopyOnWriteArrayList;
        //    29: goto            33
        //    32: athrow         
        //    33: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.size:()I
        //    36: goto            40
        //    39: athrow         
        //    40: goto            44
        //    43: athrow         
        //    44: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    47: goto            51
        //    50: athrow         
        //    51: goto            55
        //    54: athrow         
        //    55: invokevirtual   dev/nuker/pyro/f6a.4:(Ljava/lang/String;)V
        //    58: goto            62
        //    61: athrow         
        //    62: aload_0        
        //    63: getstatic       dev/nuker/pyro/fc.0:I
        //    66: ifeq            75
        //    69: ldc_w           943628122
        //    72: goto            78
        //    75: ldc_w           152868819
        //    78: ldc_w           -1966899032
        //    81: ixor           
        //    82: lookupswitch {
        //          -2082531461: 108
        //          -1292034062: 75
        //          default: 309
        //        }
        //   108: getfield        dev/nuker/pyro/f6a.c:Ldev/nuker/pyro/fbu;
        //   111: ldc2_w          1000.0
        //   114: goto            118
        //   117: athrow         
        //   118: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //   121: goto            125
        //   124: athrow         
        //   125: ifne            129
        //   128: return         
        //   129: getstatic       dev/nuker/pyro/fc.0:I
        //   132: ifeq            141
        //   135: ldc_w           1679438574
        //   138: goto            144
        //   141: ldc_w           242924344
        //   144: ldc_w           -968310359
        //   147: ixor           
        //   148: lookupswitch {
        //          -1571622073: 141
        //          -936215919: 176
        //          default: 307
        //        }
        //   176: aload_0        
        //   177: getstatic       dev/nuker/pyro/fc.c:I
        //   180: ifge            189
        //   183: ldc_w           -103518480
        //   186: goto            192
        //   189: ldc_w           1392998833
        //   192: ldc_w           -233822690
        //   195: ixor           
        //   196: lookupswitch {
        //          -301795126: 189
        //          197413102: 305
        //          default: 224
        //        }
        //   224: getfield        dev/nuker/pyro/f6a.c:Ldev/nuker/pyro/fbu;
        //   227: goto            231
        //   230: athrow         
        //   231: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //   234: goto            238
        //   237: athrow         
        //   238: aload_0        
        //   239: getfield        dev/nuker/pyro/f6a.c:Lnet/minecraft/client/Minecraft;
        //   242: aload_0        
        //   243: invokedynamic   BootstrapMethod #0, run:(Ldev/nuker/pyro/f6a;)Ljava/lang/Runnable;
        //   248: getstatic       dev/nuker/pyro/fc.1:I
        //   251: ifeq            260
        //   254: ldc_w           1529366268
        //   257: goto            263
        //   260: ldc_w           1073194412
        //   263: ldc_w           -738311088
        //   266: ixor           
        //   267: lookupswitch {
        //          -1999240532: 311
        //          573289521: 260
        //          default: 292
        //        }
        //   292: goto            296
        //   295: athrow         
        //   296: invokevirtual   net/minecraft/client/Minecraft.func_152344_a:(Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   299: goto            303
        //   302: athrow         
        //   303: pop            
        //   304: return         
        //   305: aconst_null    
        //   306: athrow         
        //   307: aconst_null    
        //   308: athrow         
        //   309: aconst_null    
        //   310: athrow         
        //   311: aconst_null    
        //   312: athrow         
        //   313: pop            
        //   314: goto            24
        //   317: pop            
        //   318: aconst_null    
        //   319: goto            313
        //   322: dup            
        //   323: ifnull          313
        //   326: checkcast       Ljava/lang/Throwable;
        //   329: athrow         
        //   330: dup            
        //   331: ifnull          317
        //   334: checkcast       Ljava/lang/Throwable;
        //   337: athrow         
        //   338: aconst_null    
        //   339: athrow         
        //    StackMapTable: 00 32 43 07 00 1F 04 FF 00 0B 00 00 00 01 07 00 1F FD 00 03 07 00 03 07 01 2C 47 07 00 3F FF 00 00 00 02 07 00 03 07 01 2C 00 02 07 00 03 07 00 28 45 07 00 1F FF 00 00 00 02 07 00 03 07 01 2C 00 02 07 00 03 01 42 07 00 1F FF 00 00 00 02 07 00 03 07 01 2C 00 02 07 00 03 01 45 07 00 1F FF 00 00 00 02 07 00 03 07 01 2C 00 02 07 00 03 07 00 6A 42 07 00 5B FF 00 00 00 02 07 00 03 07 01 2C 00 02 07 00 03 07 00 6A 45 07 00 1F 00 4C 07 00 03 FF 00 02 00 02 07 00 03 07 01 2C 00 02 07 00 03 01 5D 07 00 03 48 07 00 1F FF 00 00 00 02 07 00 03 07 01 2C 00 02 07 00 F4 03 45 07 00 1F 40 01 03 0B 42 01 1F 4C 07 00 03 FF 00 02 00 02 07 00 03 07 01 2C 00 02 07 00 03 01 5F 07 00 03 45 07 00 18 40 07 00 F4 45 07 00 1F 00 FF 00 15 00 02 07 00 03 07 01 2C 00 02 07 00 9B 07 01 2E FF 00 02 00 02 07 00 03 07 01 2C 00 03 07 00 9B 07 01 2E 01 FF 00 1C 00 02 07 00 03 07 01 2C 00 02 07 00 9B 07 01 2E 42 07 00 1F FF 00 00 00 02 07 00 03 07 01 2C 00 02 07 00 9B 07 01 2E 45 07 00 1F 40 07 01 30 41 07 00 03 01 41 07 00 03 FF 00 01 00 02 07 00 03 07 01 2C 00 02 07 00 9B 07 01 2E 41 07 00 3D 43 05 44 07 00 3D 47 05 47 07 00 1F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     322    330    Ljava/lang/IndexOutOfBoundsException;
        //  322    330    322    330    Ljava/lang/NegativeArraySizeException;
        //  338    340    3      8      Ljava/util/NoSuchElementException;
        //  32     39     39     40     Any
        //  32     39     3      8      Any
        //  32     39     39     40     Ljava/lang/ArithmeticException;
        //  33     39     32     33     Ljava/lang/NumberFormatException;
        //  33     39     39     40     Ljava/lang/IndexOutOfBoundsException;
        //  43     50     50     51     Any
        //  43     50     43     44     Any
        //  43     50     3      8      Ljava/lang/IllegalStateException;
        //  43     50     50     51     Any
        //  44     50     43     44     Ljava/lang/AssertionError;
        //  54     61     61     62     Any
        //  54     61     61     62     Any
        //  54     61     54     55     Ljava/lang/UnsupportedOperationException;
        //  54     61     61     62     Ljava/lang/NumberFormatException;
        //  55     61     3      8      Ljava/lang/EnumConstantNotPresentException;
        //  117    124    124    125    Any
        //  118    124    124    125    Any
        //  118    124    117    118    Any
        //  118    124    117    118    Any
        //  117    124    124    125    Any
        //  230    237    237    238    Any
        //  231    237    237    238    Ljava/lang/EnumConstantNotPresentException;
        //  230    237    3      8      Any
        //  230    237    237    238    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  231    237    230    231    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  295    302    302    303    Any
        //  296    302    302    303    Any
        //  295    302    295    296    Any
        //  295    302    3      8      Any
        //  296    302    302    303    Any
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
    
    public void c(final SPacketPlayerListItem$AddPlayerData p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          207
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            199
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            191
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //    27: new             Ljava/lang/StringBuilder;
        //    30: dup            
        //    31: goto            35
        //    34: athrow         
        //    35: invokespecial   java/lang/StringBuilder.<init>:()V
        //    38: goto            42
        //    41: athrow         
        //    42: aload_0        
        //    43: aload_1        
        //    44: getstatic       dev/nuker/pyro/fc.1:I
        //    47: ifeq            56
        //    50: ldc_w           1173582621
        //    53: goto            59
        //    56: ldc_w           -1682206189
        //    59: ldc_w           -2020672259
        //    62: ixor           
        //    63: lookupswitch {
        //          -1031958560: 56
        //          473263854: 88
        //          default: 180
        //        }
        //    88: goto            92
        //    91: athrow         
        //    92: invokevirtual   net/minecraft/network/play/server/SPacketPlayerListItem$AddPlayerData.func_179962_a:()Lcom/mojang/authlib/GameProfile;
        //    95: goto            99
        //    98: athrow         
        //    99: goto            103
        //   102: athrow         
        //   103: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //   106: goto            110
        //   109: athrow         
        //   110: goto            114
        //   113: athrow         
        //   114: invokevirtual   dev/nuker/pyro/f6a.c:(Ljava/util/UUID;)Ljava/lang/String;
        //   117: goto            121
        //   120: athrow         
        //   121: goto            125
        //   124: athrow         
        //   125: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   128: goto            132
        //   131: athrow         
        //   132: ldc_w           "\u2279\u149a\u8ac3\ub188\ucf93\uec3e\ub22a\ue6f4\udb6a\ueffe\ua6fa\u1e48\ue197"
        //   135: goto            139
        //   138: athrow         
        //   139: invokestatic    invokestatic   !!! ERROR
        //   142: goto            146
        //   145: athrow         
        //   146: goto            150
        //   149: athrow         
        //   150: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   153: goto            157
        //   156: athrow         
        //   157: goto            161
        //   160: athrow         
        //   161: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   164: goto            168
        //   167: athrow         
        //   168: goto            172
        //   171: athrow         
        //   172: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //   175: goto            179
        //   178: athrow         
        //   179: return         
        //   180: aconst_null    
        //   181: athrow         
        //   182: pop            
        //   183: goto            24
        //   186: pop            
        //   187: aconst_null    
        //   188: goto            182
        //   191: dup            
        //   192: ifnull          182
        //   195: checkcast       Ljava/lang/Throwable;
        //   198: athrow         
        //   199: dup            
        //   200: ifnull          186
        //   203: checkcast       Ljava/lang/Throwable;
        //   206: athrow         
        //   207: aconst_null    
        //   208: athrow         
        //    StackMapTable: 00 31 43 07 00 1F 04 FF 00 0B 00 00 00 01 07 00 1F FD 00 03 07 00 03 07 01 36 FF 00 09 00 00 00 01 07 00 1F FF 00 00 00 02 07 00 03 07 01 36 00 03 07 00 B0 08 00 1B 08 00 1B 45 07 00 1F FF 00 00 00 02 07 00 03 07 01 36 00 02 07 00 B0 07 00 B6 FF 00 0D 00 02 07 00 03 07 01 36 00 04 07 00 B0 07 00 B6 07 00 03 07 01 36 FF 00 02 00 02 07 00 03 07 01 36 00 05 07 00 B0 07 00 B6 07 00 03 07 01 36 01 FF 00 1C 00 02 07 00 03 07 01 36 00 04 07 00 B0 07 00 B6 07 00 03 07 01 36 42 07 00 1F FF 00 00 00 02 07 00 03 07 01 36 00 04 07 00 B0 07 00 B6 07 00 03 07 01 36 45 07 00 1F FF 00 00 00 02 07 00 03 07 01 36 00 04 07 00 B0 07 00 B6 07 00 03 07 01 3C 42 07 00 1F FF 00 00 00 02 07 00 03 07 01 36 00 04 07 00 B0 07 00 B6 07 00 03 07 01 3C 45 07 00 1F FF 00 00 00 02 07 00 03 07 01 36 00 04 07 00 B0 07 00 B6 07 00 03 07 00 37 42 07 00 1F FF 00 00 00 02 07 00 03 07 01 36 00 04 07 00 B0 07 00 B6 07 00 03 07 00 37 45 07 00 1F FF 00 00 00 02 07 00 03 07 01 36 00 03 07 00 B0 07 00 B6 07 00 6A 42 07 00 1F FF 00 00 00 02 07 00 03 07 01 36 00 03 07 00 B0 07 00 B6 07 00 6A 45 07 00 1F FF 00 00 00 02 07 00 03 07 01 36 00 02 07 00 B0 07 00 B6 45 07 00 3D FF 00 00 00 02 07 00 03 07 01 36 00 03 07 00 B0 07 00 B6 07 00 6A 45 07 00 1F FF 00 00 00 02 07 00 03 07 01 36 00 03 07 00 B0 07 00 B6 07 00 6A 42 07 00 1F FF 00 00 00 02 07 00 03 07 01 36 00 03 07 00 B0 07 00 B6 07 00 6A 45 07 00 1F FF 00 00 00 02 07 00 03 07 01 36 00 02 07 00 B0 07 00 B6 42 07 00 3D FF 00 00 00 02 07 00 03 07 01 36 00 02 07 00 B0 07 00 B6 45 07 00 1F FF 00 00 00 02 07 00 03 07 01 36 00 02 07 00 B0 07 00 6A FF 00 02 00 00 00 01 07 00 1F FF 00 00 00 02 07 00 03 07 01 36 00 02 07 00 B0 07 00 6A 45 07 00 1F 00 FF 00 00 00 02 07 00 03 07 01 36 00 04 07 00 B0 07 00 B6 07 00 03 07 01 36 41 07 00 1F 43 05 44 07 00 1F 47 05 47 07 00 1F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     191    199    Any
        //  191    199    191    199    Any
        //  207    209    3      8      Any
        //  35     41     41     42     Any
        //  35     41     3      8      Any
        //  35     41     3      8      Any
        //  35     41     3      8      Any
        //  35     41     41     42     Ljava/lang/AssertionError;
        //  91     98     98     99     Any
        //  91     98     91     92     Any
        //  91     98     98     99     Any
        //  91     98     98     99     Any
        //  91     98     3      8      Ljava/lang/IllegalStateException;
        //  102    109    109    110    Any
        //  102    109    102    103    Any
        //  102    109    109    110    Any
        //  102    109    3      8      Ljava/lang/AssertionError;
        //  102    109    3      8      Ljava/lang/RuntimeException;
        //  113    120    120    121    Any
        //  113    120    120    121    Ljava/lang/IndexOutOfBoundsException;
        //  114    120    3      8      Ljava/lang/IllegalArgumentException;
        //  114    120    3      8      Any
        //  113    120    113    114    Any
        //  124    131    131    132    Any
        //  124    131    3      8      Any
        //  125    131    131    132    Ljava/lang/ClassCastException;
        //  125    131    124    125    Any
        //  124    131    131    132    Ljava/lang/UnsupportedOperationException;
        //  138    145    145    146    Any
        //  138    145    138    139    Ljava/lang/ArithmeticException;
        //  138    145    3      8      Ljava/lang/IllegalArgumentException;
        //  138    145    138    139    Ljava/lang/ClassCastException;
        //  139    145    3      8      Any
        //  149    156    156    157    Any
        //  150    156    156    157    Ljava/lang/NullPointerException;
        //  150    156    3      8      Any
        //  149    156    149    150    Any
        //  150    156    3      8      Any
        //  160    167    167    168    Any
        //  161    167    160    161    Ljava/lang/ArithmeticException;
        //  160    167    167    168    Any
        //  161    167    160    161    Ljava/lang/IndexOutOfBoundsException;
        //  160    167    167    168    Any
        //  172    178    178    179    Any
        //  172    178    3      8      Any
        //  172    178    3      8      Any
        //  172    178    178    179    Ljava/lang/NegativeArraySizeException;
        //  172    178    3      8      Ljava/lang/EnumConstantNotPresentException;
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
    
    @f06
    @LauncherEventHide
    public void c(final f34 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1035
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1027
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1019
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           893518345
        //    33: goto            39
        //    36: ldc_w           545211896
        //    39: ldc_w           1329015246
        //    42: ixor           
        //    43: lookupswitch {
        //          2054499271: 986
        //          2096772283: 36
        //          default: 68
        //        }
        //    68: aload_1        
        //    69: getstatic       dev/nuker/pyro/fc.1:I
        //    72: ifeq            81
        //    75: ldc_w           -1587652705
        //    78: goto            84
        //    81: ldc_w           -1070748478
        //    84: ldc_w           964152654
        //    87: ixor           
        //    88: lookupswitch {
        //          -1742103855: 81
        //          -111517300: 116
        //          default: 996
        //        }
        //   116: goto            120
        //   119: athrow         
        //   120: invokevirtual   dev/nuker/pyro/f34.c:()Ldev/nuker/pyro/f2T;
        //   123: goto            127
        //   126: athrow         
        //   127: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //   130: if_acmpne       981
        //   133: aload_1        
        //   134: getstatic       dev/nuker/pyro/fc.0:I
        //   137: ifeq            146
        //   140: ldc_w           -1829251652
        //   143: goto            149
        //   146: ldc_w           -2111089995
        //   149: ldc_w           -172328649
        //   152: ixor           
        //   153: lookupswitch {
        //          1733143691: 146
        //          2006002562: 180
        //          default: 1000
        //        }
        //   180: goto            184
        //   183: athrow         
        //   184: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //   187: goto            191
        //   190: athrow         
        //   191: instanceof      Lnet/minecraft/network/play/server/SPacketPlayerListItem;
        //   194: ifeq            203
        //   197: ldc_w           759436715
        //   200: goto            206
        //   203: ldc_w           759436714
        //   206: ldc_w           -1394925277
        //   209: ixor           
        //   210: tableswitch {
        //          54421776: 232
        //          54421777: 981
        //          default: 197
        //        }
        //   232: aload_1        
        //   233: goto            237
        //   236: athrow         
        //   237: invokevirtual   dev/nuker/pyro/f34.c:()Lnet/minecraft/network/Packet;
        //   240: goto            244
        //   243: athrow         
        //   244: checkcast       Lnet/minecraft/network/play/server/SPacketPlayerListItem;
        //   247: astore_2       
        //   248: getstatic       dev/nuker/pyro/fc.1:I
        //   251: ifeq            260
        //   254: ldc_w           581435754
        //   257: goto            263
        //   260: ldc_w           2117991638
        //   263: ldc_w           287840279
        //   266: ixor           
        //   267: lookupswitch {
        //          864033149: 260
        //          1863705793: 292
        //          default: 988
        //        }
        //   292: aload_2        
        //   293: getstatic       dev/nuker/pyro/fc.c:I
        //   296: ifge            305
        //   299: ldc_w           292134258
        //   302: goto            308
        //   305: ldc_w           2102482045
        //   308: ldc_w           1513858059
        //   311: ixor           
        //   312: lookupswitch {
        //          661319798: 340
        //          1263679865: 305
        //          default: 1006
        //        }
        //   340: goto            344
        //   343: athrow         
        //   344: invokevirtual   net/minecraft/network/play/server/SPacketPlayerListItem.func_179768_b:()Lnet/minecraft/network/play/server/SPacketPlayerListItem$Action;
        //   347: goto            351
        //   350: athrow         
        //   351: getstatic       net/minecraft/network/play/server/SPacketPlayerListItem$Action.UPDATE_LATENCY:Lnet/minecraft/network/play/server/SPacketPlayerListItem$Action;
        //   354: if_acmpne       981
        //   357: aload_2        
        //   358: goto            362
        //   361: athrow         
        //   362: invokevirtual   net/minecraft/network/play/server/SPacketPlayerListItem.func_179767_a:()Ljava/util/List;
        //   365: goto            369
        //   368: athrow         
        //   369: goto            373
        //   372: athrow         
        //   373: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   378: goto            382
        //   381: athrow         
        //   382: astore_3       
        //   383: getstatic       dev/nuker/pyro/fc.c:I
        //   386: ifge            395
        //   389: ldc_w           -1813881231
        //   392: goto            398
        //   395: ldc_w           -755970996
        //   398: ldc_w           1083995421
        //   401: ixor           
        //   402: lookupswitch {
        //          -746706068: 992
        //          -269379982: 395
        //          default: 428
        //        }
        //   428: aload_3        
        //   429: goto            433
        //   432: athrow         
        //   433: invokeinterface java/util/Iterator.hasNext:()Z
        //   438: goto            442
        //   441: athrow         
        //   442: ifeq            981
        //   445: aload_3        
        //   446: getstatic       dev/nuker/pyro/fc.1:I
        //   449: ifeq            458
        //   452: ldc_w           1199552314
        //   455: goto            461
        //   458: ldc_w           -1582375556
        //   461: ldc_w           1987519299
        //   464: ixor           
        //   465: lookupswitch {
        //          -673579457: 492
        //          822645881: 458
        //          default: 994
        //        }
        //   492: goto            496
        //   495: athrow         
        //   496: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   501: goto            505
        //   504: athrow         
        //   505: checkcast       Lnet/minecraft/network/play/server/SPacketPlayerListItem$AddPlayerData;
        //   508: astore          4
        //   510: aload_0        
        //   511: getstatic       dev/nuker/pyro/fc.1:I
        //   514: ifeq            523
        //   517: ldc_w           -321674726
        //   520: goto            526
        //   523: ldc_w           667545966
        //   526: ldc_w           -778599215
        //   529: ixor           
        //   530: lookupswitch {
        //          -161581633: 556
        //          1027876555: 523
        //          default: 1002
        //        }
        //   556: getfield        dev/nuker/pyro/f6a.c:Lnet/minecraft/client/Minecraft;
        //   559: goto            563
        //   562: athrow         
        //   563: invokevirtual   net/minecraft/client/Minecraft.func_147114_u:()Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   566: goto            570
        //   569: athrow         
        //   570: aload           4
        //   572: getstatic       dev/nuker/pyro/fc.1:I
        //   575: ifeq            584
        //   578: ldc_w           -1802432538
        //   581: goto            587
        //   584: ldc_w           -137247287
        //   587: ldc_w           1920471302
        //   590: ixor           
        //   591: lookupswitch {
        //          -2052467505: 616
        //          -420929824: 584
        //          default: 990
        //        }
        //   616: goto            620
        //   619: athrow         
        //   620: invokevirtual   net/minecraft/network/play/server/SPacketPlayerListItem$AddPlayerData.func_179962_a:()Lcom/mojang/authlib/GameProfile;
        //   623: goto            627
        //   626: athrow         
        //   627: goto            631
        //   630: athrow         
        //   631: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //   634: goto            638
        //   637: athrow         
        //   638: goto            642
        //   641: athrow         
        //   642: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_175102_a:(Ljava/util/UUID;)Lnet/minecraft/client/network/NetworkPlayerInfo;
        //   645: goto            649
        //   648: athrow         
        //   649: ifnonnull       978
        //   652: aload_0        
        //   653: getstatic       dev/nuker/pyro/fc.c:I
        //   656: ifge            665
        //   659: ldc_w           95998503
        //   662: goto            668
        //   665: ldc_w           1851132266
        //   668: ldc_w           -973813451
        //   671: ixor           
        //   672: lookupswitch {
        //          -1415397281: 700
        //          -1068754158: 665
        //          default: 982
        //        }
        //   700: aload           4
        //   702: getstatic       dev/nuker/pyro/fc.c:I
        //   705: ifge            714
        //   708: ldc_w           988605127
        //   711: goto            717
        //   714: ldc_w           -742406916
        //   717: ldc_w           -758051950
        //   720: ixor           
        //   721: lookupswitch {
        //          -398597803: 984
        //          1282623641: 714
        //          default: 748
        //        }
        //   748: goto            752
        //   751: athrow         
        //   752: invokevirtual   net/minecraft/network/play/server/SPacketPlayerListItem$AddPlayerData.func_179962_a:()Lcom/mojang/authlib/GameProfile;
        //   755: goto            759
        //   758: athrow         
        //   759: getstatic       dev/nuker/pyro/fc.1:I
        //   762: ifeq            771
        //   765: ldc_w           -1624167725
        //   768: goto            774
        //   771: ldc_w           -1693045373
        //   774: ldc_w           1234719306
        //   777: ixor           
        //   778: lookupswitch {
        //          -762413111: 804
        //          -693536615: 771
        //          default: 998
        //        }
        //   804: goto            808
        //   807: athrow         
        //   808: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //   811: goto            815
        //   814: athrow         
        //   815: getstatic       dev/nuker/pyro/fc.0:I
        //   818: ifeq            827
        //   821: ldc_w           1084277737
        //   824: goto            830
        //   827: ldc_w           -1033986212
        //   830: ldc_w           -986032672
        //   833: ixor           
        //   834: lookupswitch {
        //          -2053466615: 1008
        //          1843902284: 827
        //          default: 860
        //        }
        //   860: goto            864
        //   863: athrow         
        //   864: invokevirtual   dev/nuker/pyro/f6a.0:(Ljava/util/UUID;)Z
        //   867: goto            871
        //   870: athrow         
        //   871: ifne            978
        //   874: aload_0        
        //   875: getfield        dev/nuker/pyro/f6a.c:Ldev/nuker/pyro/fbt;
        //   878: ldc2_w          1000
        //   881: goto            885
        //   884: athrow         
        //   885: invokevirtual   dev/nuker/pyro/fbt.c:(J)Z
        //   888: goto            892
        //   891: athrow         
        //   892: ifeq            978
        //   895: aload_0        
        //   896: getfield        dev/nuker/pyro/f6a.c:Lnet/minecraft/client/Minecraft;
        //   899: aload_0        
        //   900: aload           4
        //   902: invokedynamic   BootstrapMethod #1, run:(Ldev/nuker/pyro/f6a;Lnet/minecraft/network/play/server/SPacketPlayerListItem$AddPlayerData;)Ljava/lang/Runnable;
        //   907: goto            911
        //   910: athrow         
        //   911: invokevirtual   net/minecraft/client/Minecraft.func_152344_a:(Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   914: goto            918
        //   917: athrow         
        //   918: pop            
        //   919: aload_0        
        //   920: getstatic       dev/nuker/pyro/fc.1:I
        //   923: ifeq            932
        //   926: ldc_w           -1734250959
        //   929: goto            935
        //   932: ldc_w           -1716548077
        //   935: ldc_w           13784138
        //   938: ixor           
        //   939: lookupswitch {
        //          -1737278853: 932
        //          -1719805351: 964
        //          default: 1004
        //        }
        //   964: getfield        dev/nuker/pyro/f6a.c:Ldev/nuker/pyro/fbt;
        //   967: goto            971
        //   970: athrow         
        //   971: invokevirtual   dev/nuker/pyro/fbt.c:()V
        //   974: goto            978
        //   977: athrow         
        //   978: goto            383
        //   981: return         
        //   982: aconst_null    
        //   983: athrow         
        //   984: aconst_null    
        //   985: athrow         
        //   986: aconst_null    
        //   987: athrow         
        //   988: aconst_null    
        //   989: athrow         
        //   990: aconst_null    
        //   991: athrow         
        //   992: aconst_null    
        //   993: athrow         
        //   994: aconst_null    
        //   995: athrow         
        //   996: aconst_null    
        //   997: athrow         
        //   998: aconst_null    
        //   999: athrow         
        //  1000: aconst_null    
        //  1001: athrow         
        //  1002: aconst_null    
        //  1003: athrow         
        //  1004: aconst_null    
        //  1005: athrow         
        //  1006: aconst_null    
        //  1007: athrow         
        //  1008: aconst_null    
        //  1009: athrow         
        //  1010: pop            
        //  1011: goto            24
        //  1014: pop            
        //  1015: aconst_null    
        //  1016: goto            1010
        //  1019: dup            
        //  1020: ifnull          1010
        //  1023: checkcast       Ljava/lang/Throwable;
        //  1026: athrow         
        //  1027: dup            
        //  1028: ifnull          1014
        //  1031: checkcast       Ljava/lang/Throwable;
        //  1034: athrow         
        //  1035: aconst_null    
        //  1036: athrow         
        //    StackMapTable: 00 8F 43 07 00 1F 04 FF 00 0B 00 00 00 01 07 00 1F FD 00 03 07 00 03 07 01 4B 0B 42 01 1C 4C 07 01 4B FF 00 02 00 02 07 00 03 07 01 4B 00 02 07 01 4B 01 5F 07 01 4B 42 07 00 1F 40 07 01 4B 45 07 00 1F 40 07 01 50 52 07 01 4B FF 00 02 00 02 07 00 03 07 01 4B 00 02 07 01 4B 01 5E 07 01 4B 42 07 00 1F 40 07 01 4B 45 07 00 1F 40 07 01 9A 05 05 42 01 19 43 07 00 1F 40 07 01 4B 45 07 00 1F 40 07 01 9A FC 00 0F 07 01 5B 42 01 1C 4C 07 01 5B FF 00 02 00 03 07 00 03 07 01 4B 07 01 5B 00 02 07 01 5B 01 5F 07 01 5B 42 07 00 1F 40 07 01 5B 45 07 00 1F 40 07 01 6A FF 00 09 00 00 00 01 07 00 1F FF 00 00 00 03 07 00 03 07 01 4B 07 01 5B 00 01 07 01 5B 45 07 00 1F 40 07 01 74 42 07 00 18 40 07 01 74 47 07 00 1F 40 07 00 88 FC 00 00 07 00 88 0B 42 01 1D 43 07 00 0E 40 07 00 88 47 07 00 1F 40 01 4F 07 00 88 FF 00 02 00 04 07 00 03 07 01 4B 07 01 5B 07 00 88 00 02 07 00 88 01 5E 07 00 88 42 07 00 1F 40 07 00 88 47 07 00 1F 40 07 00 DC FF 00 11 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 01 07 00 03 FF 00 02 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 01 5D 07 00 03 45 07 00 1F 40 07 00 9B 45 07 00 1F 40 07 00 A1 FF 00 0D 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 A1 07 01 36 FF 00 02 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 03 07 00 A1 07 01 36 01 FF 00 1C 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 A1 07 01 36 42 07 00 1F FF 00 00 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 A1 07 01 36 45 07 00 1F FF 00 00 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 A1 07 01 3C 42 07 00 1F FF 00 00 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 A1 07 01 3C 45 07 00 1F FF 00 00 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 A1 07 00 37 42 07 00 7C FF 00 00 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 A1 07 00 37 45 07 00 1F 40 07 00 DE 4F 07 00 03 FF 00 02 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 01 5F 07 00 03 FF 00 0D 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 07 01 36 FF 00 02 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 03 07 00 03 07 01 36 01 FF 00 1E 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 07 01 36 42 07 00 5B FF 00 00 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 07 01 36 45 07 00 1F FF 00 00 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 07 01 3C FF 00 0B 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 07 01 3C FF 00 02 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 03 07 00 03 07 01 3C 01 FF 00 1D 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 07 01 3C 42 07 00 59 FF 00 00 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 07 01 3C 45 07 00 1F FF 00 00 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 07 00 37 FF 00 0B 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 07 00 37 FF 00 02 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 03 07 00 03 07 00 37 01 FF 00 1D 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 07 00 37 42 07 00 1F FF 00 00 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 07 00 37 45 07 00 1F 40 01 4C 07 00 14 FF 00 00 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 AB 04 45 07 00 1F 40 01 FF 00 11 00 00 00 01 07 00 1F FF 00 00 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 9B 07 01 2E 45 07 00 1F 40 07 01 30 4D 07 00 03 FF 00 02 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 01 5C 07 00 03 45 07 00 3D 40 07 00 AB 45 07 00 1F 00 F8 00 02 FF 00 00 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 01 07 00 03 FF 00 01 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 07 01 36 F8 00 01 FC 00 01 07 01 5B FF 00 01 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 A1 07 01 36 FA 00 01 41 07 00 88 FF 00 01 00 02 07 00 03 07 01 4B 00 01 07 01 4B FF 00 01 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 07 01 3C FF 00 01 00 02 07 00 03 07 01 4B 00 01 07 01 4B FF 00 01 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 01 07 00 03 41 07 00 03 FF 00 01 00 03 07 00 03 07 01 4B 07 01 5B 00 01 07 01 5B FF 00 01 00 05 07 00 03 07 01 4B 07 01 5B 07 00 88 07 01 36 00 02 07 00 03 07 00 37 FF 00 01 00 02 07 00 03 07 01 4B 00 01 07 00 3D 43 05 44 07 00 3D 47 05 47 07 00 1F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1019   1027   Ljava/lang/StringIndexOutOfBoundsException;
        //  1019   1027   1019   1027   Ljava/util/NoSuchElementException;
        //  1035   1037   3      8      Any
        //  119    126    126    127    Any
        //  119    126    3      8      Ljava/lang/ArithmeticException;
        //  119    126    119    120    Any
        //  119    126    126    127    Any
        //  120    126    126    127    Ljava/lang/IllegalStateException;
        //  183    190    190    191    Any
        //  184    190    3      8      Any
        //  183    190    3      8      Any
        //  184    190    3      8      Any
        //  184    190    183    184    Any
        //  236    243    243    244    Any
        //  237    243    3      8      Any
        //  237    243    236    237    Ljava/lang/StringIndexOutOfBoundsException;
        //  237    243    3      8      Any
        //  237    243    236    237    Any
        //  343    350    350    351    Any
        //  344    350    350    351    Ljava/lang/EnumConstantNotPresentException;
        //  343    350    343    344    Any
        //  343    350    350    351    Ljava/lang/IllegalArgumentException;
        //  344    350    343    344    Ljava/lang/ClassCastException;
        //  362    368    368    369    Any
        //  362    368    3      8      Any
        //  362    368    368    369    Ljava/util/ConcurrentModificationException;
        //  362    368    3      8      Any
        //  362    368    3      8      Ljava/lang/IllegalStateException;
        //  372    381    381    382    Any
        //  372    381    372    373    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  373    381    381    382    Any
        //  373    381    381    382    Ljava/lang/NegativeArraySizeException;
        //  373    381    3      8      Any
        //  432    441    441    442    Any
        //  432    441    432    433    Ljava/lang/NullPointerException;
        //  433    441    441    442    Ljava/lang/ArithmeticException;
        //  433    441    3      8      Any
        //  433    441    441    442    Any
        //  495    504    504    505    Any
        //  496    504    495    496    Ljava/lang/UnsupportedOperationException;
        //  496    504    495    496    Ljava/lang/IllegalArgumentException;
        //  495    504    495    496    Any
        //  496    504    3      8      Any
        //  562    569    569    570    Any
        //  562    569    562    563    Ljava/lang/EnumConstantNotPresentException;
        //  563    569    569    570    Ljava/lang/ArithmeticException;
        //  563    569    562    563    Any
        //  562    569    569    570    Any
        //  619    626    626    627    Any
        //  619    626    619    620    Any
        //  620    626    626    627    Any
        //  620    626    619    620    Ljava/lang/NullPointerException;
        //  619    626    626    627    Ljava/lang/IllegalArgumentException;
        //  630    637    637    638    Any
        //  631    637    637    638    Ljava/lang/IndexOutOfBoundsException;
        //  631    637    637    638    Ljava/lang/EnumConstantNotPresentException;
        //  631    637    3      8      Any
        //  631    637    630    631    Any
        //  641    648    648    649    Any
        //  641    648    3      8      Ljava/lang/UnsupportedOperationException;
        //  642    648    648    649    Ljava/lang/EnumConstantNotPresentException;
        //  642    648    641    642    Ljava/util/ConcurrentModificationException;
        //  642    648    3      8      Ljava/lang/AssertionError;
        //  751    758    758    759    Any
        //  752    758    751    752    Ljava/lang/UnsupportedOperationException;
        //  751    758    758    759    Any
        //  751    758    758    759    Any
        //  751    758    3      8      Any
        //  807    814    814    815    Any
        //  808    814    3      8      Ljava/lang/IllegalStateException;
        //  808    814    807    808    Ljava/util/NoSuchElementException;
        //  808    814    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  808    814    3      8      Any
        //  863    870    870    871    Any
        //  863    870    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  864    870    863    864    Ljava/lang/IllegalStateException;
        //  864    870    3      8      Ljava/lang/RuntimeException;
        //  863    870    863    864    Any
        //  884    891    891    892    Any
        //  885    891    891    892    Ljava/lang/NumberFormatException;
        //  884    891    891    892    Ljava/lang/UnsupportedOperationException;
        //  885    891    3      8      Any
        //  884    891    884    885    Ljava/lang/EnumConstantNotPresentException;
        //  911    917    917    918    Any
        //  911    917    917    918    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  911    917    917    918    Ljava/lang/IllegalArgumentException;
        //  911    917    3      8      Any
        //  911    917    917    918    Any
        //  970    977    977    978    Any
        //  971    977    970    971    Ljava/lang/IllegalStateException;
        //  971    977    977    978    Any
        //  971    977    970    971    Ljava/util/NoSuchElementException;
        //  970    977    3      8      Ljava/lang/RuntimeException;
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
