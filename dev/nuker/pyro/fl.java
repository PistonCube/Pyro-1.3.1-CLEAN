// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import javax.annotation.Nullable;
import dev.nuker.pyro.alt.Alt;
import org.apache.logging.log4j.LogManager;
import net.minecraft.client.gui.GuiButton;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.gui.GuiScreen;

public class fl extends GuiScreen
{
    public static Logger c;
    public fq c;
    public GuiScreen c;
    public GuiButton c;
    public GuiButton 0;
    public GuiButton 1;
    public fm c;
    public boolean c;
    public boolean 0;
    public String c;
    public fp c;
    
    public void func_73864_a(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          218
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            210
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            202
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: iload_2        
        //    27: getstatic       dev/nuker/pyro/fc.0:I
        //    30: ifeq            38
        //    33: ldc             -1449886205
        //    35: goto            40
        //    38: ldc             797163942
        //    40: ldc             -430893481
        //    42: ixor           
        //    43: lookupswitch {
        //          1338337364: 191
        //          1598414090: 38
        //          default: 68
        //        }
        //    68: iload_3        
        //    69: goto            73
        //    72: athrow         
        //    73: invokespecial   net/minecraft/client/gui/GuiScreen.func_73864_a:(III)V
        //    76: goto            80
        //    79: athrow         
        //    80: getstatic       dev/nuker/pyro/fc.c:I
        //    83: ifge            91
        //    86: ldc             -445051189
        //    88: goto            93
        //    91: ldc             759876099
        //    93: ldc             -2101814000
        //    95: ixor           
        //    96: lookupswitch {
        //          677703743: 91
        //          1740755931: 189
        //          default: 124
        //        }
        //   124: aload_0        
        //   125: getstatic       dev/nuker/pyro/fc.1:I
        //   128: ifeq            136
        //   131: ldc             -1917858897
        //   133: goto            138
        //   136: ldc             847315506
        //   138: ldc             1778751329
        //   140: ixor           
        //   141: lookupswitch {
        //          -408265522: 136
        //          1485083987: 168
        //          default: 187
        //        }
        //   168: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fm;
        //   171: iload_1        
        //   172: iload_2        
        //   173: iload_3        
        //   174: goto            178
        //   177: athrow         
        //   178: invokevirtual   dev/nuker/pyro/fm.func_148179_a:(III)Z
        //   181: goto            185
        //   184: athrow         
        //   185: pop            
        //   186: return         
        //   187: aconst_null    
        //   188: athrow         
        //   189: aconst_null    
        //   190: athrow         
        //   191: aconst_null    
        //   192: athrow         
        //   193: pop            
        //   194: goto            24
        //   197: pop            
        //   198: aconst_null    
        //   199: goto            193
        //   202: dup            
        //   203: ifnull          193
        //   206: checkcast       Ljava/lang/Throwable;
        //   209: athrow         
        //   210: dup            
        //   211: ifnull          197
        //   214: checkcast       Ljava/lang/Throwable;
        //   217: athrow         
        //   218: aconst_null    
        //   219: athrow         
        //    StackMapTable: 00 1D 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FF 00 03 00 04 07 00 03 01 01 01 00 00 FF 00 0D 00 04 07 00 03 01 01 01 00 03 07 00 03 01 01 FF 00 01 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 FF 00 1B 00 04 07 00 03 01 01 01 00 03 07 00 03 01 01 43 07 00 25 FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 45 07 00 25 00 0A 41 01 1E 4B 07 00 03 FF 00 01 00 04 07 00 03 01 01 01 00 02 07 00 03 01 5D 07 00 03 48 07 00 25 FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 38 01 01 01 45 07 00 25 40 01 41 07 00 03 01 FF 00 01 00 04 07 00 03 01 01 01 00 03 07 00 03 01 01 41 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     202    210    Ljava/lang/ClassCastException;
        //  202    210    202    210    Any
        //  218    220    3      8      Any
        //  72     79     79     80     Any
        //  73     79     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  73     79     72     73     Ljava/lang/IndexOutOfBoundsException;
        //  73     79     79     80     Any
        //  73     79     72     73     Any
        //  177    184    184    185    Any
        //  177    184    177    178    Ljava/lang/UnsupportedOperationException;
        //  178    184    177    178    Any
        //  178    184    184    185    Ljava/lang/NegativeArraySizeException;
        //  178    184    184    185    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 76 out of bounds for length 76
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
    
    public void c(final fn fn) {
        fbS.5(this, 545691301, fn);
    }
    
    public static boolean 0(final fn p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          175
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            167
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            159
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/alt/Alt;
        //    28: goto            32
        //    31: athrow         
        //    32: invokevirtual   dev/nuker/pyro/alt/Alt.getGameProfile:()Lcom/mojang/authlib/GameProfile;
        //    35: goto            39
        //    38: athrow         
        //    39: goto            43
        //    42: athrow         
        //    43: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //    46: goto            50
        //    49: athrow         
        //    50: goto            54
        //    53: athrow         
        //    54: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    57: goto            61
        //    60: athrow         
        //    61: goto            65
        //    64: athrow         
        //    65: invokevirtual   net/minecraft/client/Minecraft.func_110432_I:()Lnet/minecraft/util/Session;
        //    68: goto            72
        //    71: athrow         
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   net/minecraft/util/Session.func_148256_e:()Lcom/mojang/authlib/GameProfile;
        //    79: goto            83
        //    82: athrow         
        //    83: goto            87
        //    86: athrow         
        //    87: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //    90: goto            94
        //    93: athrow         
        //    94: getstatic       dev/nuker/pyro/fc.1:I
        //    97: ifeq            105
        //   100: ldc             2031418966
        //   102: goto            107
        //   105: ldc             453085565
        //   107: ldc             504266418
        //   109: ixor           
        //   110: lookupswitch {
        //          84932559: 136
        //          1729790180: 105
        //          default: 148
        //        }
        //   136: goto            140
        //   139: athrow         
        //   140: invokevirtual   java/util/UUID.equals:(Ljava/lang/Object;)Z
        //   143: goto            147
        //   146: athrow         
        //   147: ireturn        
        //   148: aconst_null    
        //   149: athrow         
        //   150: pop            
        //   151: goto            24
        //   154: pop            
        //   155: aconst_null    
        //   156: goto            150
        //   159: dup            
        //   160: ifnull          150
        //   163: checkcast       Ljava/lang/Throwable;
        //   166: athrow         
        //   167: dup            
        //   168: ifnull          154
        //   171: checkcast       Ljava/lang/Throwable;
        //   174: athrow         
        //   175: aconst_null    
        //   176: athrow         
        //    StackMapTable: 00 29 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FC 00 03 07 00 55 46 07 00 49 40 07 00 5A 45 07 00 25 40 07 00 60 42 07 00 25 40 07 00 60 45 07 00 25 40 07 00 78 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 01 07 00 55 00 01 07 00 78 45 07 00 25 FF 00 00 00 01 07 00 55 00 02 07 00 78 07 00 66 42 07 00 25 FF 00 00 00 01 07 00 55 00 02 07 00 78 07 00 66 45 07 00 25 FF 00 00 00 01 07 00 55 00 02 07 00 78 07 00 70 42 07 00 1A FF 00 00 00 01 07 00 55 00 02 07 00 78 07 00 70 45 07 00 25 FF 00 00 00 01 07 00 55 00 02 07 00 78 07 00 60 42 07 00 25 FF 00 00 00 01 07 00 55 00 02 07 00 78 07 00 60 45 07 00 25 FF 00 00 00 01 07 00 55 00 02 07 00 78 07 00 78 FF 00 0A 00 01 07 00 55 00 02 07 00 78 07 00 78 FF 00 01 00 01 07 00 55 00 03 07 00 78 07 00 78 01 FF 00 1C 00 01 07 00 55 00 02 07 00 78 07 00 78 42 07 00 51 FF 00 00 00 01 07 00 55 00 02 07 00 78 07 00 78 45 07 00 25 40 01 FF 00 00 00 01 07 00 55 00 02 07 00 78 07 00 78 41 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     159    167    Ljava/lang/NullPointerException;
        //  159    167    159    167    Any
        //  175    177    3      8      Ljava/lang/AssertionError;
        //  31     38     38     39     Any
        //  32     38     38     39     Ljava/lang/NegativeArraySizeException;
        //  31     38     3      8      Any
        //  32     38     38     39     Ljava/lang/StringIndexOutOfBoundsException;
        //  32     38     31     32     Ljava/lang/AssertionError;
        //  42     49     49     50     Any
        //  43     49     42     43     Any
        //  42     49     42     43     Ljava/lang/NegativeArraySizeException;
        //  42     49     3      8      Any
        //  42     49     49     50     Ljava/lang/IllegalArgumentException;
        //  54     60     60     61     Any
        //  54     60     60     61     Ljava/lang/IllegalArgumentException;
        //  54     60     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  54     60     3      8      Ljava/util/ConcurrentModificationException;
        //  54     60     3      8      Any
        //  64     71     71     72     Any
        //  64     71     64     65     Any
        //  65     71     3      8      Any
        //  65     71     64     65     Ljava/util/NoSuchElementException;
        //  65     71     3      8      Ljava/lang/NumberFormatException;
        //  75     82     82     83     Any
        //  75     82     75     76     Ljava/lang/UnsupportedOperationException;
        //  76     82     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  75     82     82     83     Ljava/lang/IllegalArgumentException;
        //  75     82     82     83     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  86     93     93     94     Any
        //  87     93     86     87     Any
        //  86     93     3      8      Ljava/lang/ClassCastException;
        //  86     93     93     94     Ljava/lang/NullPointerException;
        //  87     93     93     94     Ljava/lang/UnsupportedOperationException;
        //  139    146    146    147    Any
        //  139    146    139    140    Ljava/util/NoSuchElementException;
        //  140    146    3      8      Any
        //  139    146    3      8      Ljava/lang/NegativeArraySizeException;
        //  139    146    146    147    Ljava/util/ConcurrentModificationException;
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
    
    public void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1290
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1282
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1274
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             2087922657
        //    32: goto            37
        //    35: ldc             1672942661
        //    37: ldc             -1148803634
        //    39: ixor           
        //    40: lookupswitch {
        //          -940208593: 35
        //          -667831925: 68
        //          default: 1251
        //        }
        //    68: aload_0        
        //    69: aload_0        
        //    70: new             Lnet/minecraft/client/gui/GuiButton;
        //    73: dup            
        //    74: iconst_1       
        //    75: getstatic       dev/nuker/pyro/fc.c:I
        //    78: ifge            86
        //    81: ldc             1114455768
        //    83: goto            88
        //    86: ldc             1893011391
        //    88: ldc             558930413
        //    90: ixor           
        //    91: lookupswitch {
        //          1367709266: 116
        //          1664984885: 86
        //          default: 1245
        //        }
        //   116: aload_0        
        //   117: getstatic       dev/nuker/pyro/fc.c:I
        //   120: ifge            128
        //   123: ldc             1808149275
        //   125: goto            130
        //   128: ldc             -414294150
        //   130: ldc             -1861447863
        //   132: ixor           
        //   133: lookupswitch {
        //          -87382958: 128
        //          1984090163: 160
        //          default: 1239
        //        }
        //   160: getfield        dev/nuker/pyro/fl.field_146294_l:I
        //   163: iconst_2       
        //   164: idiv           
        //   165: sipush          154
        //   168: isub           
        //   169: getstatic       dev/nuker/pyro/fc.c:I
        //   172: ifge            180
        //   175: ldc             -26785814
        //   177: goto            182
        //   180: ldc             -1880765324
        //   182: ldc             -1669799788
        //   184: ixor           
        //   185: lookupswitch {
        //          329067744: 212
        //          1646241662: 180
        //          default: 1227
        //        }
        //   212: aload_0        
        //   213: getfield        dev/nuker/pyro/fl.field_146295_m:I
        //   216: bipush          52
        //   218: isub           
        //   219: sipush          150
        //   222: bipush          20
        //   224: ldc             "\u10ca\u149c\ub9f0\ub1c1\ufed2"
        //   226: getstatic       dev/nuker/pyro/fc.c:I
        //   229: ifge            237
        //   232: ldc             -789051479
        //   234: goto            239
        //   237: ldc             -1750461846
        //   239: ldc             1337049755
        //   241: ixor           
        //   242: lookupswitch {
        //          -1622555342: 1241
        //          1431492180: 237
        //          default: 268
        //        }
        //   268: goto            272
        //   271: athrow         
        //   272: invokestatic    invokestatic   !!! ERROR
        //   275: goto            279
        //   278: athrow         
        //   279: iconst_0       
        //   280: anewarray       Ljava/lang/Object;
        //   283: goto            287
        //   286: athrow         
        //   287: invokestatic    net/minecraft/client/resources/I18n.func_135052_a:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   290: goto            294
        //   293: athrow         
        //   294: goto            298
        //   297: athrow         
        //   298: invokespecial   net/minecraft/client/gui/GuiButton.<init>:(IIIIILjava/lang/String;)V
        //   301: goto            305
        //   304: athrow         
        //   305: goto            309
        //   308: athrow         
        //   309: invokevirtual   dev/nuker/pyro/fl.func_189646_b:(Lnet/minecraft/client/gui/GuiButton;)Lnet/minecraft/client/gui/GuiButton;
        //   312: goto            316
        //   315: athrow         
        //   316: putfield        dev/nuker/pyro/fl.0:Lnet/minecraft/client/gui/GuiButton;
        //   319: aload_0        
        //   320: new             Lnet/minecraft/client/gui/GuiButton;
        //   323: dup            
        //   324: iconst_3       
        //   325: getstatic       dev/nuker/pyro/fc.1:I
        //   328: ifeq            336
        //   331: ldc             -1394830286
        //   333: goto            338
        //   336: ldc             936135914
        //   338: ldc             -324766275
        //   340: ixor           
        //   341: lookupswitch {
        //          -1899021422: 336
        //          1081663887: 1231
        //          default: 368
        //        }
        //   368: aload_0        
        //   369: getfield        dev/nuker/pyro/fl.field_146294_l:I
        //   372: iconst_2       
        //   373: idiv           
        //   374: iconst_4       
        //   375: iadd           
        //   376: aload_0        
        //   377: getfield        dev/nuker/pyro/fl.field_146295_m:I
        //   380: bipush          52
        //   382: isub           
        //   383: sipush          150
        //   386: bipush          20
        //   388: ldc             "\u10c2\u149a\ub9e5\ub1cd\ufedf\udef4\ub264\ud5f6\udb76\udea8\u9429\u1e42"
        //   390: goto            394
        //   393: athrow         
        //   394: invokestatic    invokestatic   !!! ERROR
        //   397: goto            401
        //   400: athrow         
        //   401: iconst_0       
        //   402: anewarray       Ljava/lang/Object;
        //   405: goto            409
        //   408: athrow         
        //   409: invokestatic    net/minecraft/client/resources/I18n.func_135052_a:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   412: goto            416
        //   415: athrow         
        //   416: goto            420
        //   419: athrow         
        //   420: invokespecial   net/minecraft/client/gui/GuiButton.<init>:(IIIIILjava/lang/String;)V
        //   423: goto            427
        //   426: athrow         
        //   427: getstatic       dev/nuker/pyro/fc.c:I
        //   430: ifge            438
        //   433: ldc             859582002
        //   435: goto            440
        //   438: ldc             -1080551951
        //   440: ldc             -625253251
        //   442: ixor           
        //   443: lookupswitch {
        //          -377009585: 1247
        //          764218736: 438
        //          default: 468
        //        }
        //   468: goto            472
        //   471: athrow         
        //   472: invokevirtual   dev/nuker/pyro/fl.func_189646_b:(Lnet/minecraft/client/gui/GuiButton;)Lnet/minecraft/client/gui/GuiButton;
        //   475: goto            479
        //   478: athrow         
        //   479: pop            
        //   480: aload_0        
        //   481: aload_0        
        //   482: new             Lnet/minecraft/client/gui/GuiButton;
        //   485: dup            
        //   486: iconst_4       
        //   487: getstatic       dev/nuker/pyro/fc.1:I
        //   490: ifeq            498
        //   493: ldc             1854347761
        //   495: goto            500
        //   498: ldc             -1920695519
        //   500: ldc             338186703
        //   502: ixor           
        //   503: lookupswitch {
        //          -1716727058: 528
        //          2058307646: 498
        //          default: 1235
        //        }
        //   528: aload_0        
        //   529: getstatic       dev/nuker/pyro/fc.c:I
        //   532: ifge            540
        //   535: ldc             810716373
        //   537: goto            542
        //   540: ldc             -687430392
        //   542: ldc             -528858630
        //   544: ixor           
        //   545: lookupswitch {
        //          -802632401: 540
        //          930931954: 572
        //          default: 1261
        //        }
        //   572: getfield        dev/nuker/pyro/fl.field_146294_l:I
        //   575: iconst_2       
        //   576: idiv           
        //   577: sipush          154
        //   580: isub           
        //   581: getstatic       dev/nuker/pyro/fc.0:I
        //   584: ifeq            592
        //   587: ldc             -1922125997
        //   589: goto            594
        //   592: ldc             -1800479878
        //   594: ldc             -1063705618
        //   596: ixor           
        //   597: lookupswitch {
        //          1308069053: 592
        //          1412954260: 624
        //          default: 1243
        //        }
        //   624: aload_0        
        //   625: getfield        dev/nuker/pyro/fl.field_146295_m:I
        //   628: bipush          28
        //   630: isub           
        //   631: bipush          72
        //   633: bipush          20
        //   635: ldc             "\u10c7\u1497\ub9f3"
        //   637: getstatic       dev/nuker/pyro/fc.1:I
        //   640: ifeq            648
        //   643: ldc             -1828322609
        //   645: goto            650
        //   648: ldc             585924524
        //   650: ldc             585734010
        //   652: ixor           
        //   653: lookupswitch {
        //          -1309698635: 648
        //           387286: 680
        //          default: 1259
        //        }
        //   680: goto            684
        //   683: athrow         
        //   684: invokestatic    invokestatic   !!! ERROR
        //   687: goto            691
        //   690: athrow         
        //   691: goto            695
        //   694: athrow         
        //   695: invokespecial   net/minecraft/client/gui/GuiButton.<init>:(IIIIILjava/lang/String;)V
        //   698: goto            702
        //   701: athrow         
        //   702: goto            706
        //   705: athrow         
        //   706: invokevirtual   dev/nuker/pyro/fl.func_189646_b:(Lnet/minecraft/client/gui/GuiButton;)Lnet/minecraft/client/gui/GuiButton;
        //   709: goto            713
        //   712: athrow         
        //   713: putfield        dev/nuker/pyro/fl.1:Lnet/minecraft/client/gui/GuiButton;
        //   716: aload_0        
        //   717: aload_0        
        //   718: new             Lnet/minecraft/client/gui/GuiButton;
        //   721: dup            
        //   722: iconst_2       
        //   723: aload_0        
        //   724: getfield        dev/nuker/pyro/fl.field_146294_l:I
        //   727: iconst_2       
        //   728: idiv           
        //   729: bipush          76
        //   731: isub           
        //   732: aload_0        
        //   733: getstatic       dev/nuker/pyro/fc.c:I
        //   736: ifge            744
        //   739: ldc             30364135
        //   741: goto            746
        //   744: ldc             -2009656942
        //   746: ldc             -1547803116
        //   748: ixor           
        //   749: lookupswitch {
        //          -1569638413: 744
        //          730429318: 776
        //          default: 1255
        //        }
        //   776: getfield        dev/nuker/pyro/fl.field_146295_m:I
        //   779: bipush          28
        //   781: isub           
        //   782: bipush          72
        //   784: bipush          20
        //   786: ldc             "\u10d4\u1496\ub9fa\ub1c7\ufeca\udee5"
        //   788: goto            792
        //   791: athrow         
        //   792: invokestatic    invokestatic   !!! ERROR
        //   795: goto            799
        //   798: athrow         
        //   799: goto            803
        //   802: athrow         
        //   803: invokespecial   net/minecraft/client/gui/GuiButton.<init>:(IIIIILjava/lang/String;)V
        //   806: goto            810
        //   809: athrow         
        //   810: getstatic       dev/nuker/pyro/fc.1:I
        //   813: ifeq            821
        //   816: ldc             -2028888174
        //   818: goto            823
        //   821: ldc             -371005226
        //   823: ldc             1650397236
        //   825: ixor           
        //   826: lookupswitch {
        //          -447836250: 1263
        //          2043228927: 821
        //          default: 852
        //        }
        //   852: goto            856
        //   855: athrow         
        //   856: invokevirtual   dev/nuker/pyro/fl.func_189646_b:(Lnet/minecraft/client/gui/GuiButton;)Lnet/minecraft/client/gui/GuiButton;
        //   859: goto            863
        //   862: athrow         
        //   863: putfield        dev/nuker/pyro/fl.c:Lnet/minecraft/client/gui/GuiButton;
        //   866: aload_0        
        //   867: new             Lnet/minecraft/client/gui/GuiButton;
        //   870: dup            
        //   871: iconst_0       
        //   872: aload_0        
        //   873: getfield        dev/nuker/pyro/fl.field_146294_l:I
        //   876: iconst_2       
        //   877: idiv           
        //   878: iconst_4       
        //   879: iadd           
        //   880: aload_0        
        //   881: getstatic       dev/nuker/pyro/fc.1:I
        //   884: ifeq            892
        //   887: ldc             1934211880
        //   889: goto            894
        //   892: ldc             1313422767
        //   894: ldc             -1817460660
        //   896: ixor           
        //   897: lookupswitch {
        //          -2009414379: 892
        //          -522028188: 1229
        //          default: 924
        //        }
        //   924: getfield        dev/nuker/pyro/fl.field_146295_m:I
        //   927: bipush          28
        //   929: isub           
        //   930: sipush          150
        //   933: bipush          20
        //   935: ldc             "\u10e1\u1486\ub9fe\ub186\ufedf\udee1\ub22a\ud5d9\udb7c\udea3"
        //   937: getstatic       dev/nuker/pyro/fc.1:I
        //   940: ifeq            948
        //   943: ldc             297297749
        //   945: goto            950
        //   948: ldc             1628045304
        //   950: ldc             -1340704991
        //   952: ixor           
        //   953: lookupswitch {
        //          -1582428044: 948
        //          -786462503: 980
        //          default: 1257
        //        }
        //   980: goto            984
        //   983: athrow         
        //   984: invokestatic    invokestatic   !!! ERROR
        //   987: goto            991
        //   990: athrow         
        //   991: iconst_0       
        //   992: anewarray       Ljava/lang/Object;
        //   995: goto            999
        //   998: athrow         
        //   999: invokestatic    net/minecraft/client/resources/I18n.func_135052_a:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1002: goto            1006
        //  1005: athrow         
        //  1006: goto            1010
        //  1009: athrow         
        //  1010: invokespecial   net/minecraft/client/gui/GuiButton.<init>:(IIIIILjava/lang/String;)V
        //  1013: goto            1017
        //  1016: athrow         
        //  1017: getstatic       dev/nuker/pyro/fc.0:I
        //  1020: ifeq            1028
        //  1023: ldc             114934179
        //  1025: goto            1030
        //  1028: ldc             1814987129
        //  1030: ldc             36817533
        //  1032: ixor           
        //  1033: lookupswitch {
        //          82316254: 1237
        //          219421408: 1028
        //          default: 1060
        //        }
        //  1060: goto            1064
        //  1063: athrow         
        //  1064: invokevirtual   dev/nuker/pyro/fl.func_189646_b:(Lnet/minecraft/client/gui/GuiButton;)Lnet/minecraft/client/gui/GuiButton;
        //  1067: goto            1071
        //  1070: athrow         
        //  1071: pop            
        //  1072: aload_0        
        //  1073: getstatic       dev/nuker/pyro/fc.c:I
        //  1076: ifge            1084
        //  1079: ldc             -1976557598
        //  1081: goto            1086
        //  1084: ldc             -2055023990
        //  1086: ldc             1421628792
        //  1088: ixor           
        //  1089: lookupswitch {
        //          -784431118: 1116
        //          -561231206: 1084
        //          default: 1249
        //        }
        //  1116: aload_0        
        //  1117: getstatic       dev/nuker/pyro/fc.1:I
        //  1120: ifeq            1128
        //  1123: ldc             -1887020101
        //  1125: goto            1130
        //  1128: ldc             -1568881709
        //  1130: ldc             -1188028525
        //  1132: ixor           
        //  1133: lookupswitch {
        //          459237106: 1128
        //          917914664: 1233
        //          default: 1160
        //        }
        //  1160: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fm;
        //  1163: getstatic       dev/nuker/pyro/fc.0:I
        //  1166: ifeq            1174
        //  1169: ldc             189734058
        //  1171: goto            1176
        //  1174: ldc             -1887595294
        //  1176: ldc             1062680101
        //  1178: ixor           
        //  1179: lookupswitch {
        //          -1339383097: 1204
        //          873998991: 1174
        //          default: 1253
        //        }
        //  1204: goto            1208
        //  1207: athrow         
        //  1208: invokevirtual   dev/nuker/pyro/fm.0:()Ldev/nuker/pyro/fn;
        //  1211: goto            1215
        //  1214: athrow         
        //  1215: goto            1219
        //  1218: athrow         
        //  1219: invokevirtual   dev/nuker/pyro/fl.1:(Ldev/nuker/pyro/fn;)V
        //  1222: goto            1226
        //  1225: athrow         
        //  1226: return         
        //  1227: aconst_null    
        //  1228: athrow         
        //  1229: aconst_null    
        //  1230: athrow         
        //  1231: aconst_null    
        //  1232: athrow         
        //  1233: aconst_null    
        //  1234: athrow         
        //  1235: aconst_null    
        //  1236: athrow         
        //  1237: aconst_null    
        //  1238: athrow         
        //  1239: aconst_null    
        //  1240: athrow         
        //  1241: aconst_null    
        //  1242: athrow         
        //  1243: aconst_null    
        //  1244: athrow         
        //  1245: aconst_null    
        //  1246: athrow         
        //  1247: aconst_null    
        //  1248: athrow         
        //  1249: aconst_null    
        //  1250: athrow         
        //  1251: aconst_null    
        //  1252: athrow         
        //  1253: aconst_null    
        //  1254: athrow         
        //  1255: aconst_null    
        //  1256: athrow         
        //  1257: aconst_null    
        //  1258: athrow         
        //  1259: aconst_null    
        //  1260: athrow         
        //  1261: aconst_null    
        //  1262: athrow         
        //  1263: aconst_null    
        //  1264: athrow         
        //  1265: pop            
        //  1266: goto            24
        //  1269: pop            
        //  1270: aconst_null    
        //  1271: goto            1265
        //  1274: dup            
        //  1275: ifnull          1265
        //  1278: checkcast       Ljava/lang/Throwable;
        //  1281: athrow         
        //  1282: dup            
        //  1283: ifnull          1269
        //  1286: checkcast       Ljava/lang/Throwable;
        //  1289: athrow         
        //  1290: aconst_null    
        //  1291: athrow         
        //    StackMapTable: 00 A5 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FC 00 03 07 00 03 0A 41 01 1E FF 00 11 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 46 08 00 46 01 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 46 08 00 46 01 01 FF 00 1B 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 46 08 00 46 01 FF 00 0B 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 46 08 00 46 01 07 00 03 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 46 08 00 46 01 07 00 03 01 FF 00 1D 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 46 08 00 46 01 07 00 03 FF 00 13 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 46 08 00 46 01 01 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 00 46 08 00 46 01 01 01 FF 00 1D 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 46 08 00 46 01 01 FF 00 18 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 00 46 08 00 46 01 01 01 01 01 07 00 EC FF 00 01 00 01 07 00 03 00 0B 07 00 03 07 00 03 08 00 46 08 00 46 01 01 01 01 01 07 00 EC 01 FF 00 1C 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 00 46 08 00 46 01 01 01 01 01 07 00 EC FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 00 46 08 00 46 01 01 01 01 01 07 00 EC 45 07 00 25 FF 00 00 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 00 46 08 00 46 01 01 01 01 01 07 00 EC 46 07 00 25 FF 00 00 00 01 07 00 03 00 0B 07 00 03 07 00 03 08 00 46 08 00 46 01 01 01 01 01 07 00 EC 07 00 EE 45 07 00 25 FF 00 00 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 00 46 08 00 46 01 01 01 01 01 07 00 EC 42 07 00 25 FF 00 00 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 00 46 08 00 46 01 01 01 01 01 07 00 EC 45 07 00 25 FF 00 00 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 84 42 07 00 25 FF 00 00 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 84 45 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 84 FF 00 13 00 01 07 00 03 00 04 07 00 03 08 01 40 08 01 40 01 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 01 40 08 01 40 01 01 FF 00 1D 00 01 07 00 03 00 04 07 00 03 08 01 40 08 01 40 01 58 07 00 25 FF 00 00 00 01 07 00 03 00 09 07 00 03 08 01 40 08 01 40 01 01 01 01 01 07 00 EC 45 07 00 25 FF 00 00 00 01 07 00 03 00 09 07 00 03 08 01 40 08 01 40 01 01 01 01 01 07 00 EC 46 07 00 25 FF 00 00 00 01 07 00 03 00 0A 07 00 03 08 01 40 08 01 40 01 01 01 01 01 07 00 EC 07 00 EE 45 07 00 25 FF 00 00 00 01 07 00 03 00 09 07 00 03 08 01 40 08 01 40 01 01 01 01 01 07 00 EC 42 07 00 18 FF 00 00 00 01 07 00 03 00 09 07 00 03 08 01 40 08 01 40 01 01 01 01 01 07 00 EC 45 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 84 FF 00 0A 00 01 07 00 03 00 02 07 00 03 07 00 84 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 84 01 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 84 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 84 45 07 00 25 40 07 00 84 FF 00 12 00 01 07 00 03 00 05 07 00 03 07 00 03 08 01 E2 08 01 E2 01 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 E2 08 01 E2 01 01 FF 00 1B 00 01 07 00 03 00 05 07 00 03 07 00 03 08 01 E2 08 01 E2 01 FF 00 0B 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 E2 08 01 E2 01 07 00 03 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 E2 08 01 E2 01 07 00 03 01 FF 00 1D 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 E2 08 01 E2 01 07 00 03 FF 00 13 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 E2 08 01 E2 01 01 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 01 E2 08 01 E2 01 01 01 FF 00 1D 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 E2 08 01 E2 01 01 FF 00 17 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 01 E2 08 01 E2 01 01 01 01 01 07 00 EC FF 00 01 00 01 07 00 03 00 0B 07 00 03 07 00 03 08 01 E2 08 01 E2 01 01 01 01 01 07 00 EC 01 FF 00 1D 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 01 E2 08 01 E2 01 01 01 01 01 07 00 EC 42 07 00 25 FF 00 00 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 01 E2 08 01 E2 01 01 01 01 01 07 00 EC 45 07 00 25 FF 00 00 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 01 E2 08 01 E2 01 01 01 01 01 07 00 EC 42 07 00 25 FF 00 00 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 01 E2 08 01 E2 01 01 01 01 01 07 00 EC 45 07 00 25 FF 00 00 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 84 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 84 45 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 84 FF 00 1E 00 01 07 00 03 00 07 07 00 03 07 00 03 08 02 CE 08 02 CE 01 01 07 00 03 FF 00 01 00 01 07 00 03 00 08 07 00 03 07 00 03 08 02 CE 08 02 CE 01 01 07 00 03 01 FF 00 1D 00 01 07 00 03 00 07 07 00 03 07 00 03 08 02 CE 08 02 CE 01 01 07 00 03 4E 07 00 25 FF 00 00 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 02 CE 08 02 CE 01 01 01 01 01 07 00 EC 45 07 00 25 FF 00 00 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 02 CE 08 02 CE 01 01 01 01 01 07 00 EC 42 07 00 16 FF 00 00 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 02 CE 08 02 CE 01 01 01 01 01 07 00 EC 45 07 00 25 FF 00 00 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 84 FF 00 0A 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 84 FF 00 01 00 01 07 00 03 00 04 07 00 03 07 00 03 07 00 84 01 FF 00 1C 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 84 42 07 00 25 FF 00 00 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 84 45 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 84 FF 00 1C 00 01 07 00 03 00 06 07 00 03 08 03 63 08 03 63 01 01 07 00 03 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 03 63 08 03 63 01 01 07 00 03 01 FF 00 1D 00 01 07 00 03 00 06 07 00 03 08 03 63 08 03 63 01 01 07 00 03 FF 00 17 00 01 07 00 03 00 09 07 00 03 08 03 63 08 03 63 01 01 01 01 01 07 00 EC FF 00 01 00 01 07 00 03 00 0A 07 00 03 08 03 63 08 03 63 01 01 01 01 01 07 00 EC 01 FF 00 1D 00 01 07 00 03 00 09 07 00 03 08 03 63 08 03 63 01 01 01 01 01 07 00 EC 42 07 00 25 FF 00 00 00 01 07 00 03 00 09 07 00 03 08 03 63 08 03 63 01 01 01 01 01 07 00 EC 45 07 00 25 FF 00 00 00 01 07 00 03 00 09 07 00 03 08 03 63 08 03 63 01 01 01 01 01 07 00 EC FF 00 06 00 00 00 01 07 00 25 FF 00 00 00 01 07 00 03 00 0A 07 00 03 08 03 63 08 03 63 01 01 01 01 01 07 00 EC 07 00 EE 45 07 00 25 FF 00 00 00 01 07 00 03 00 09 07 00 03 08 03 63 08 03 63 01 01 01 01 01 07 00 EC 42 07 00 1E FF 00 00 00 01 07 00 03 00 09 07 00 03 08 03 63 08 03 63 01 01 01 01 01 07 00 EC 45 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 84 FF 00 0A 00 01 07 00 03 00 02 07 00 03 07 00 84 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 84 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 84 42 07 00 4B FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 84 45 07 00 25 40 07 00 84 4C 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 FF 00 0B 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 0D 00 01 07 00 03 00 02 07 00 03 07 00 38 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 38 01 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 38 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 38 45 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 55 42 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 55 45 07 00 25 00 FF 00 00 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 46 08 00 46 01 01 FF 00 01 00 01 07 00 03 00 06 07 00 03 08 03 63 08 03 63 01 01 07 00 03 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 01 40 08 01 40 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 01 E2 08 01 E2 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 84 FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 00 46 08 00 46 01 07 00 03 FF 00 01 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 00 46 08 00 46 01 01 01 01 01 07 00 EC FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 E2 08 01 E2 01 01 FF 00 01 00 01 07 00 03 00 05 07 00 03 07 00 03 08 00 46 08 00 46 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 84 41 07 00 03 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 38 FF 00 01 00 01 07 00 03 00 07 07 00 03 07 00 03 08 02 CE 08 02 CE 01 01 07 00 03 FF 00 01 00 01 07 00 03 00 09 07 00 03 08 03 63 08 03 63 01 01 01 01 01 07 00 EC FF 00 01 00 01 07 00 03 00 0A 07 00 03 07 00 03 08 01 E2 08 01 E2 01 01 01 01 01 07 00 EC FF 00 01 00 01 07 00 03 00 06 07 00 03 07 00 03 08 01 E2 08 01 E2 01 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 07 00 84 41 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1274   1282   Any
        //  1274   1282   1274   1282   Ljava/lang/ArithmeticException;
        //  1290   1292   3      8      Any
        //  272    278    278    279    Any
        //  272    278    278    279    Ljava/lang/NegativeArraySizeException;
        //  272    278    3      8      Ljava/lang/RuntimeException;
        //  272    278    278    279    Ljava/util/ConcurrentModificationException;
        //  272    278    3      8      Any
        //  286    293    293    294    Any
        //  286    293    3      8      Any
        //  287    293    3      8      Any
        //  287    293    3      8      Any
        //  286    293    286    287    Any
        //  297    304    304    305    Any
        //  297    304    3      8      Any
        //  297    304    304    305    Any
        //  298    304    297    298    Ljava/lang/NegativeArraySizeException;
        //  297    304    297    298    Any
        //  308    315    315    316    Any
        //  308    315    308    309    Any
        //  309    315    308    309    Any
        //  309    315    315    316    Ljava/util/NoSuchElementException;
        //  308    315    3      8      Ljava/lang/NegativeArraySizeException;
        //  393    400    400    401    Any
        //  394    400    3      8      Any
        //  394    400    393    394    Any
        //  393    400    3      8      Any
        //  394    400    3      8      Ljava/lang/RuntimeException;
        //  408    415    415    416    Any
        //  408    415    408    409    Ljava/lang/IllegalArgumentException;
        //  409    415    408    409    Any
        //  409    415    3      8      Any
        //  409    415    3      8      Any
        //  419    426    426    427    Any
        //  420    426    3      8      Any
        //  420    426    426    427    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  419    426    419    420    Ljava/lang/IndexOutOfBoundsException;
        //  419    426    426    427    Any
        //  472    478    478    479    Any
        //  472    478    478    479    Any
        //  472    478    3      8      Any
        //  472    478    3      8      Ljava/lang/UnsupportedOperationException;
        //  472    478    478    479    Ljava/lang/IndexOutOfBoundsException;
        //  683    690    690    691    Any
        //  684    690    690    691    Any
        //  683    690    683    684    Ljava/lang/RuntimeException;
        //  683    690    683    684    Ljava/lang/AssertionError;
        //  684    690    683    684    Any
        //  694    701    701    702    Any
        //  694    701    701    702    Any
        //  695    701    701    702    Any
        //  694    701    701    702    Ljava/util/ConcurrentModificationException;
        //  695    701    694    695    Any
        //  706    712    712    713    Any
        //  706    712    712    713    Ljava/lang/ArithmeticException;
        //  706    712    3      8      Ljava/lang/RuntimeException;
        //  706    712    712    713    Any
        //  706    712    3      8      Ljava/lang/AssertionError;
        //  791    798    798    799    Any
        //  791    798    791    792    Any
        //  791    798    798    799    Any
        //  791    798    3      8      Any
        //  792    798    798    799    Ljava/lang/NumberFormatException;
        //  802    809    809    810    Any
        //  803    809    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  802    809    3      8      Ljava/lang/UnsupportedOperationException;
        //  803    809    802    803    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  803    809    3      8      Ljava/lang/NegativeArraySizeException;
        //  855    862    862    863    Any
        //  856    862    862    863    Ljava/lang/IllegalArgumentException;
        //  855    862    855    856    Any
        //  855    862    862    863    Ljava/lang/UnsupportedOperationException;
        //  856    862    862    863    Any
        //  983    990    990    991    Any
        //  984    990    3      8      Any
        //  984    990    983    984    Any
        //  984    990    990    991    Ljava/util/ConcurrentModificationException;
        //  983    990    983    984    Any
        //  999    1005   1005   1006   Any
        //  999    1005   1005   1006   Any
        //  999    1005   3      8      Ljava/util/NoSuchElementException;
        //  999    1005   1005   1006   Any
        //  999    1005   1005   1006   Any
        //  1009   1016   1016   1017   Any
        //  1010   1016   1016   1017   Ljava/lang/IllegalArgumentException;
        //  1009   1016   1009   1010   Ljava/lang/RuntimeException;
        //  1010   1016   1016   1017   Any
        //  1010   1016   1016   1017   Ljava/lang/AssertionError;
        //  1063   1070   1070   1071   Any
        //  1063   1070   1063   1064   Ljava/lang/StringIndexOutOfBoundsException;
        //  1064   1070   1070   1071   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1063   1070   3      8      Any
        //  1063   1070   1070   1071   Any
        //  1208   1214   1214   1215   Any
        //  1208   1214   1214   1215   Ljava/lang/NullPointerException;
        //  1208   1214   1214   1215   Any
        //  1208   1214   3      8      Ljava/util/ConcurrentModificationException;
        //  1208   1214   1214   1215   Ljava/lang/AssertionError;
        //  1218   1225   1225   1226   Any
        //  1218   1225   1218   1219   Ljava/lang/ClassCastException;
        //  1218   1225   3      8      Any
        //  1218   1225   1218   1219   Any
        //  1218   1225   3      8      Ljava/lang/RuntimeException;
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
    
    public void func_73866_w_() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          645
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            637
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            629
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             -602513652
        //    32: goto            37
        //    35: ldc             -1960306264
        //    37: ldc             1246877047
        //    39: ixor           
        //    40: lookupswitch {
        //          -1773696389: 614
        //          564348342: 35
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: new             Ldev/nuker/pyro/fm;
        //    72: dup            
        //    73: aload_0        
        //    74: getstatic       dev/nuker/pyro/fc.c:I
        //    77: ifge            85
        //    80: ldc             -1508366993
        //    82: goto            87
        //    85: ldc             -1483735789
        //    87: ldc             1231977258
        //    89: ixor           
        //    90: lookupswitch {
        //          -277455291: 602
        //          1253826668: 85
        //          default: 116
        //        }
        //   116: aload_0        
        //   117: getstatic       dev/nuker/pyro/fc.c:I
        //   120: ifge            128
        //   123: ldc             -1463280410
        //   125: goto            130
        //   128: ldc             -1735997585
        //   130: ldc             212272232
        //   132: ixor           
        //   133: lookupswitch {
        //          -1536223090: 612
        //          -432379303: 128
        //          default: 160
        //        }
        //   160: getfield        dev/nuker/pyro/fl.field_146297_k:Lnet/minecraft/client/Minecraft;
        //   163: aload_0        
        //   164: getstatic       dev/nuker/pyro/fc.c:I
        //   167: ifge            176
        //   170: ldc_w           -789462604
        //   173: goto            179
        //   176: ldc_w           -1322770358
        //   179: ldc_w           925359903
        //   182: ixor           
        //   183: lookupswitch {
        //          -2045771947: 208
        //          -405397845: 176
        //          default: 618
        //        }
        //   208: getfield        dev/nuker/pyro/fl.field_146294_l:I
        //   211: iconst_4       
        //   212: idiv           
        //   213: iconst_3       
        //   214: imul           
        //   215: aload_0        
        //   216: getfield        dev/nuker/pyro/fl.field_146295_m:I
        //   219: bipush          32
        //   221: aload_0        
        //   222: getfield        dev/nuker/pyro/fl.field_146295_m:I
        //   225: bipush          68
        //   227: isub           
        //   228: bipush          46
        //   230: getstatic       dev/nuker/pyro/fc.1:I
        //   233: ifeq            242
        //   236: ldc_w           -828591818
        //   239: goto            245
        //   242: ldc_w           -981456275
        //   245: ldc_w           1982482470
        //   248: ixor           
        //   249: lookupswitch {
        //          -1280679349: 276
        //          -1195968240: 242
        //          default: 604
        //        }
        //   276: goto            280
        //   279: athrow         
        //   280: invokespecial   dev/nuker/pyro/fm.<init>:(Ldev/nuker/pyro/fl;Lnet/minecraft/client/Minecraft;IIIII)V
        //   283: goto            287
        //   286: athrow         
        //   287: putfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fm;
        //   290: aload_0        
        //   291: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fm;
        //   294: getfield        dev/nuker/pyro/fm.c:Ljava/util/List;
        //   297: goto            301
        //   300: athrow         
        //   301: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //   306: goto            310
        //   309: athrow         
        //   310: invokedynamic   BootstrapMethod #0, test:()Ljava/util/function/Predicate;
        //   315: goto            319
        //   318: athrow         
        //   319: invokeinterface java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        //   324: goto            328
        //   327: athrow         
        //   328: goto            332
        //   331: athrow         
        //   332: invokeinterface java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        //   337: goto            341
        //   340: athrow         
        //   341: astore_1       
        //   342: aload_1        
        //   343: aload_0        
        //   344: invokedynamic   BootstrapMethod #1, accept:(Ldev/nuker/pyro/fl;)Ljava/util/function/Consumer;
        //   349: goto            353
        //   352: athrow         
        //   353: invokevirtual   java/util/Optional.ifPresent:(Ljava/util/function/Consumer;)V
        //   356: goto            360
        //   359: athrow         
        //   360: aload_0        
        //   361: getstatic       dev/nuker/pyro/fc.c:I
        //   364: ifge            373
        //   367: ldc_w           1510664342
        //   370: goto            376
        //   373: ldc_w           1334297378
        //   376: ldc_w           -630637938
        //   379: ixor           
        //   380: lookupswitch {
        //          -2140941800: 373
        //          -1779500628: 408
        //          default: 610
        //        }
        //   408: goto            412
        //   411: athrow         
        //   412: invokevirtual   dev/nuker/pyro/fl.c:()V
        //   415: goto            419
        //   418: athrow         
        //   419: getstatic       dev/nuker/pyro/fc.1:I
        //   422: ifeq            431
        //   425: ldc_w           -1135866685
        //   428: goto            434
        //   431: ldc_w           -1697391547
        //   434: ldc_w           -1288776658
        //   437: ixor           
        //   438: lookupswitch {
        //          -1888152663: 431
        //          258136301: 616
        //          default: 464
        //        }
        //   464: aload_0        
        //   465: aload_0        
        //   466: getstatic       dev/nuker/pyro/fc.0:I
        //   469: ifeq            478
        //   472: ldc_w           1062127199
        //   475: goto            481
        //   478: ldc_w           -490050581
        //   481: ldc_w           -979490178
        //   484: ixor           
        //   485: lookupswitch {
        //          -352496354: 478
        //          -86971359: 606
        //          default: 512
        //        }
        //   512: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fq;
        //   515: aload_0        
        //   516: getfield        dev/nuker/pyro/fl.field_146297_k:Lnet/minecraft/client/Minecraft;
        //   519: goto            523
        //   522: athrow         
        //   523: invokevirtual   net/minecraft/client/Minecraft.func_110432_I:()Lnet/minecraft/util/Session;
        //   526: goto            530
        //   529: athrow         
        //   530: getstatic       dev/nuker/pyro/fc.c:I
        //   533: ifge            542
        //   536: ldc_w           -1185485794
        //   539: goto            545
        //   542: ldc_w           2040984062
        //   545: ldc_w           -1518064724
        //   548: ixor           
        //   549: lookupswitch {
        //          -601695662: 576
        //          483575730: 542
        //          default: 608
        //        }
        //   576: goto            580
        //   579: athrow         
        //   580: invokevirtual   net/minecraft/util/Session.func_148256_e:()Lcom/mojang/authlib/GameProfile;
        //   583: goto            587
        //   586: athrow         
        //   587: goto            591
        //   590: athrow         
        //   591: invokevirtual   dev/nuker/pyro/fq.0:(Lcom/mojang/authlib/GameProfile;)Ldev/nuker/pyro/fp;
        //   594: goto            598
        //   597: athrow         
        //   598: putfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fp;
        //   601: return         
        //   602: aconst_null    
        //   603: athrow         
        //   604: aconst_null    
        //   605: athrow         
        //   606: aconst_null    
        //   607: athrow         
        //   608: aconst_null    
        //   609: athrow         
        //   610: aconst_null    
        //   611: athrow         
        //   612: aconst_null    
        //   613: athrow         
        //   614: aconst_null    
        //   615: athrow         
        //   616: aconst_null    
        //   617: athrow         
        //   618: aconst_null    
        //   619: athrow         
        //   620: pop            
        //   621: goto            24
        //   624: pop            
        //   625: aconst_null    
        //   626: goto            620
        //   629: dup            
        //   630: ifnull          620
        //   633: checkcast       Ljava/lang/Throwable;
        //   636: athrow         
        //   637: dup            
        //   638: ifnull          624
        //   641: checkcast       Ljava/lang/Throwable;
        //   644: athrow         
        //   645: aconst_null    
        //   646: athrow         
        //    StackMapTable: 00 51 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FC 00 03 07 00 03 0A 41 01 1E FF 00 10 00 01 07 00 03 00 04 07 00 03 08 00 45 08 00 45 07 00 03 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 45 08 00 45 07 00 03 01 FF 00 1C 00 01 07 00 03 00 04 07 00 03 08 00 45 08 00 45 07 00 03 FF 00 0B 00 01 07 00 03 00 05 07 00 03 08 00 45 08 00 45 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 06 07 00 03 08 00 45 08 00 45 07 00 03 07 00 03 01 FF 00 1D 00 01 07 00 03 00 05 07 00 03 08 00 45 08 00 45 07 00 03 07 00 03 FF 00 0F 00 01 07 00 03 00 06 07 00 03 08 00 45 08 00 45 07 00 03 07 00 66 07 00 03 FF 00 02 00 01 07 00 03 00 07 07 00 03 08 00 45 08 00 45 07 00 03 07 00 66 07 00 03 01 FF 00 1C 00 01 07 00 03 00 06 07 00 03 08 00 45 08 00 45 07 00 03 07 00 66 07 00 03 FF 00 21 00 01 07 00 03 00 0A 07 00 03 08 00 45 08 00 45 07 00 03 07 00 66 01 01 01 01 01 FF 00 02 00 01 07 00 03 00 0B 07 00 03 08 00 45 08 00 45 07 00 03 07 00 66 01 01 01 01 01 01 FF 00 1E 00 01 07 00 03 00 0A 07 00 03 08 00 45 08 00 45 07 00 03 07 00 66 01 01 01 01 01 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 01 07 00 03 00 0A 07 00 03 08 00 45 08 00 45 07 00 03 07 00 66 01 01 01 01 01 45 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 38 4C 07 00 47 40 07 01 0E 47 07 00 25 40 07 01 24 FF 00 07 00 00 00 01 07 00 25 FF 00 00 00 01 07 00 03 00 02 07 01 24 07 01 55 47 07 00 25 40 07 01 24 42 07 00 F3 40 07 01 24 47 07 00 25 40 07 01 38 FF 00 0A 00 02 07 00 03 07 01 38 00 01 07 00 16 FF 00 00 00 02 07 00 03 07 01 38 00 02 07 01 38 07 01 57 45 07 00 25 00 4C 07 00 03 FF 00 02 00 02 07 00 03 07 01 38 00 02 07 00 03 01 5F 07 00 03 42 07 00 25 40 07 00 03 45 07 00 25 00 0B 42 01 1D FF 00 0D 00 02 07 00 03 07 01 38 00 02 07 00 03 07 00 03 FF 00 02 00 02 07 00 03 07 01 38 00 03 07 00 03 07 00 03 01 FF 00 1E 00 02 07 00 03 07 01 38 00 02 07 00 03 07 00 03 49 07 00 25 FF 00 00 00 02 07 00 03 07 01 38 00 03 07 00 03 07 01 4E 07 00 66 45 07 00 25 FF 00 00 00 02 07 00 03 07 01 38 00 03 07 00 03 07 01 4E 07 00 70 FF 00 0B 00 02 07 00 03 07 01 38 00 03 07 00 03 07 01 4E 07 00 70 FF 00 02 00 02 07 00 03 07 01 38 00 04 07 00 03 07 01 4E 07 00 70 01 FF 00 1E 00 02 07 00 03 07 01 38 00 03 07 00 03 07 01 4E 07 00 70 42 07 00 1A FF 00 00 00 02 07 00 03 07 01 38 00 03 07 00 03 07 01 4E 07 00 70 45 07 00 25 FF 00 00 00 02 07 00 03 07 01 38 00 03 07 00 03 07 01 4E 07 00 60 42 07 00 25 FF 00 00 00 02 07 00 03 07 01 38 00 03 07 00 03 07 01 4E 07 00 60 45 07 00 25 FF 00 00 00 02 07 00 03 07 01 38 00 02 07 00 03 07 01 59 FF 00 03 00 01 07 00 03 00 04 07 00 03 08 00 45 08 00 45 07 00 03 FF 00 01 00 01 07 00 03 00 0A 07 00 03 08 00 45 08 00 45 07 00 03 07 00 66 01 01 01 01 01 FF 00 01 00 02 07 00 03 07 01 38 00 02 07 00 03 07 00 03 FF 00 01 00 02 07 00 03 07 01 38 00 03 07 00 03 07 01 4E 07 00 70 41 07 00 03 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 45 08 00 45 07 00 03 07 00 03 01 FC 00 01 07 01 38 FF 00 01 00 01 07 00 03 00 06 07 00 03 08 00 45 08 00 45 07 00 03 07 00 66 07 00 03 41 07 00 F1 43 05 44 07 00 F1 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     629    637    Ljava/lang/EnumConstantNotPresentException;
        //  629    637    629    637    Ljava/lang/EnumConstantNotPresentException;
        //  645    647    3      8      Ljava/lang/NumberFormatException;
        //  280    286    286    287    Any
        //  280    286    3      8      Any
        //  280    286    3      8      Ljava/lang/ClassCastException;
        //  280    286    286    287    Ljava/lang/IllegalArgumentException;
        //  280    286    3      8      Ljava/util/NoSuchElementException;
        //  300    309    309    310    Any
        //  300    309    3      8      Any
        //  301    309    309    310    Any
        //  300    309    300    301    Ljava/lang/NullPointerException;
        //  300    309    300    301    Ljava/lang/NullPointerException;
        //  319    327    327    328    Any
        //  319    327    327    328    Any
        //  319    327    327    328    Ljava/lang/IllegalStateException;
        //  319    327    327    328    Ljava/lang/ClassCastException;
        //  319    327    327    328    Any
        //  331    340    340    341    Any
        //  332    340    3      8      Any
        //  331    340    3      8      Any
        //  332    340    3      8      Any
        //  332    340    331    332    Ljava/lang/IllegalStateException;
        //  352    359    359    360    Any
        //  352    359    352    353    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  352    359    359    360    Any
        //  353    359    359    360    Any
        //  352    359    359    360    Ljava/lang/ClassCastException;
        //  411    418    418    419    Any
        //  411    418    411    412    Ljava/lang/UnsupportedOperationException;
        //  412    418    411    412    Any
        //  412    418    411    412    Any
        //  411    418    411    412    Any
        //  522    529    529    530    Any
        //  523    529    3      8      Ljava/lang/UnsupportedOperationException;
        //  523    529    3      8      Ljava/lang/ArithmeticException;
        //  522    529    522    523    Any
        //  523    529    522    523    Ljava/lang/IndexOutOfBoundsException;
        //  579    586    586    587    Any
        //  579    586    3      8      Any
        //  580    586    3      8      Any
        //  579    586    3      8      Ljava/lang/AssertionError;
        //  580    586    579    580    Ljava/lang/UnsupportedOperationException;
        //  590    597    597    598    Any
        //  591    597    590    591    Any
        //  591    597    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  591    597    597    598    Ljava/lang/ArithmeticException;
        //  590    597    597    598    Ljava/lang/RuntimeException;
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
    
    public void 0() {
        fbS.dN(this, 1326765463);
    }
    
    static {
        fl.c = LogManager.getLogger();
    }
    
    public void func_146284_a(final GuiButton p0) {
        public class fk extends fi
        {
            public fl c;
            
            public fk(final fl c, final GuiScreen guiScreen, final String s) {
                this.c = c;
                super(guiScreen, s);
            }
            
            @Override
            public void c(final String p0, final String p1) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          412
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.c:I
                //    12: iflt            404
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            396
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: getstatic       dev/nuker/pyro/fc.1:I
                //    27: ifeq            35
                //    30: ldc             -1759428486
                //    32: goto            37
                //    35: ldc             635749371
                //    37: ldc             -1678761357
                //    39: ixor           
                //    40: lookupswitch {
                //          59840520: 35
                //          215048713: 385
                //          default: 68
                //        }
                //    68: aload_2        
                //    69: goto            73
                //    72: athrow         
                //    73: invokevirtual   java/lang/String.isEmpty:()Z
                //    76: goto            80
                //    79: athrow         
                //    80: ifeq            88
                //    83: ldc             337169664
                //    85: goto            90
                //    88: ldc             337169665
                //    90: ldc             -41295016
                //    92: ixor           
                //    93: tableswitch {
                //          -752722768: 116
                //          -752722767: 194
                //          default: 83
                //        }
                //   116: aload_1        
                //   117: goto            121
                //   120: athrow         
                //   121: invokestatic    dev/nuker/pyro/alt/AltLogic.loginOffline:(Ljava/lang/String;)Z
                //   124: goto            128
                //   127: athrow         
                //   128: pop            
                //   129: aload_0        
                //   130: getfield        dev/nuker/pyro/fk.field_146297_k:Lnet/minecraft/client/Minecraft;
                //   133: getstatic       dev/nuker/pyro/fc.0:I
                //   136: ifeq            144
                //   139: ldc             1775661974
                //   141: goto            146
                //   144: ldc             -247734235
                //   146: ldc             703960886
                //   148: ixor           
                //   149: lookupswitch {
                //          -657557741: 176
                //          1076094112: 144
                //          default: 381
                //        }
                //   176: aload_0        
                //   177: getfield        dev/nuker/pyro/fk.c:Lnet/minecraft/client/gui/GuiScreen;
                //   180: goto            184
                //   183: athrow         
                //   184: invokevirtual   net/minecraft/client/Minecraft.func_147108_a:(Lnet/minecraft/client/gui/GuiScreen;)V
                //   187: goto            191
                //   190: athrow         
                //   191: goto            378
                //   194: aload_1        
                //   195: aload_2        
                //   196: goto            200
                //   199: athrow         
                //   200: invokestatic    dev/nuker/pyro/alt/AltLogic.login:(Ljava/lang/String;Ljava/lang/String;)I
                //   203: goto            207
                //   206: athrow         
                //   207: tableswitch {
                //                0: 232
                //                1: 297
                //                2: 317
                //          default: 378
                //        }
                //   232: aload_0        
                //   233: getfield        dev/nuker/pyro/fk.field_146297_k:Lnet/minecraft/client/Minecraft;
                //   236: aload_0        
                //   237: getstatic       dev/nuker/pyro/fc.c:I
                //   240: ifge            248
                //   243: ldc             1340547189
                //   245: goto            250
                //   248: ldc             996687257
                //   250: ldc             1328039794
                //   252: ixor           
                //   253: lookupswitch {
                //          13592327: 248
                //          1950382827: 280
                //          default: 379
                //        }
                //   280: getfield        dev/nuker/pyro/fk.c:Lnet/minecraft/client/gui/GuiScreen;
                //   283: goto            287
                //   286: athrow         
                //   287: invokevirtual   net/minecraft/client/Minecraft.func_147108_a:(Lnet/minecraft/client/gui/GuiScreen;)V
                //   290: goto            294
                //   293: athrow         
                //   294: goto            378
                //   297: aload_0        
                //   298: ldc             "\u10c8\u149d\ub9ee\ub1c9\ufed1\udeee\ub220\ud595\udb7c\udea3\u9426\u1e45\ud2fd\uc7f6\ub626\uba6e\u57e4\u4400\ubf2d\uf701\u1800\uc22c\u5917\u2f55\ue0c8"
                //   300: goto            304
                //   303: athrow         
                //   304: invokestatic    invokestatic   !!! ERROR
                //   307: goto            311
                //   310: athrow         
                //   311: putfield        dev/nuker/pyro/fk.0:Ljava/lang/String;
                //   314: goto            378
                //   317: aload_0        
                //   318: ldc             "\u10d4\u149d\ub9f9\ub1ca\ufed1\udee2\ub264\ud5c1\udb76\udeee\u9424\u1e43\ud2ff\uc7b8\ub62c\uba7f\u57b0\u4450\ubf38\uf71d\u1853\uc23a\u590d\u2f53\ue0c4\u0681\u7d25\ubaaf\u8209\ubb8a\ub7a0\ufb26\u43ce\u9808\u2c95\uc226\u496f\ubb71\uc885\uc82f\u85dc\u41e1\u8af2"
                //   320: getstatic       dev/nuker/pyro/fc.c:I
                //   323: ifge            331
                //   326: ldc             1978716566
                //   328: goto            333
                //   331: ldc             1912253456
                //   333: ldc             1737034679
                //   335: ixor           
                //   336: lookupswitch {
                //          -900131121: 331
                //          309975585: 383
                //          default: 364
                //        }
                //   364: goto            368
                //   367: athrow         
                //   368: invokestatic    invokestatic   !!! ERROR
                //   371: goto            375
                //   374: athrow         
                //   375: putfield        dev/nuker/pyro/fk.0:Ljava/lang/String;
                //   378: return         
                //   379: aconst_null    
                //   380: athrow         
                //   381: aconst_null    
                //   382: athrow         
                //   383: aconst_null    
                //   384: athrow         
                //   385: aconst_null    
                //   386: athrow         
                //   387: pop            
                //   388: goto            24
                //   391: pop            
                //   392: aconst_null    
                //   393: goto            387
                //   396: dup            
                //   397: ifnull          387
                //   400: checkcast       Ljava/lang/Throwable;
                //   403: athrow         
                //   404: dup            
                //   405: ifnull          391
                //   408: checkcast       Ljava/lang/Throwable;
                //   411: athrow         
                //   412: aconst_null    
                //   413: athrow         
                //    StackMapTable: 00 3E 43 07 00 2F 04 FF 00 0B 00 00 00 01 07 00 2F FE 00 03 07 00 03 07 00 37 07 00 37 0A 41 01 1E 43 07 00 1A 40 07 00 37 45 07 00 2F 40 01 02 04 41 01 19 FF 00 03 00 00 00 01 07 00 2F FF 00 00 00 03 07 00 03 07 00 37 07 00 37 00 01 07 00 37 45 07 00 2F 40 01 4F 07 00 53 FF 00 01 00 03 07 00 03 07 00 37 07 00 37 00 02 07 00 53 01 5D 07 00 53 46 07 00 2F FF 00 00 00 03 07 00 03 07 00 37 07 00 37 00 02 07 00 53 07 00 6F 45 07 00 2F 00 02 44 07 00 22 FF 00 00 00 03 07 00 03 07 00 37 07 00 37 00 02 07 00 37 07 00 37 45 07 00 2F 40 01 18 FF 00 0F 00 03 07 00 03 07 00 37 07 00 37 00 02 07 00 53 07 00 03 FF 00 01 00 03 07 00 03 07 00 37 07 00 37 00 03 07 00 53 07 00 03 01 FF 00 1D 00 03 07 00 03 07 00 37 07 00 37 00 02 07 00 53 07 00 03 FF 00 05 00 00 00 01 07 00 2F FF 00 00 00 03 07 00 03 07 00 37 07 00 37 00 02 07 00 53 07 00 6F 45 07 00 2F 00 02 45 07 00 2F FF 00 00 00 03 07 00 03 07 00 37 07 00 37 00 02 07 00 03 07 00 37 45 07 00 2F FF 00 00 00 03 07 00 03 07 00 37 07 00 37 00 02 07 00 03 07 00 37 05 FF 00 0D 00 03 07 00 03 07 00 37 07 00 37 00 02 07 00 03 07 00 37 FF 00 01 00 03 07 00 03 07 00 37 07 00 37 00 03 07 00 03 07 00 37 01 FF 00 1E 00 03 07 00 03 07 00 37 07 00 37 00 02 07 00 03 07 00 37 42 07 00 2F FF 00 00 00 03 07 00 03 07 00 37 07 00 37 00 02 07 00 03 07 00 37 45 07 00 2F FF 00 00 00 03 07 00 03 07 00 37 07 00 37 00 02 07 00 03 07 00 37 02 FF 00 00 00 03 07 00 03 07 00 37 07 00 37 00 02 07 00 53 07 00 03 41 07 00 53 FF 00 01 00 03 07 00 03 07 00 37 07 00 37 00 02 07 00 03 07 00 37 01 41 07 00 2F 43 05 44 07 00 2F 47 05 47 07 00 2F
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                       
                //  -----  -----  -----  -----  -------------------------------------------
                //  8      20     396    404    Ljava/lang/NegativeArraySizeException;
                //  396    404    396    404    Any
                //  412    414    3      8      Any
                //  72     79     79     80     Any
                //  73     79     3      8      Ljava/lang/ArithmeticException;
                //  72     79     72     73     Ljava/lang/ArrayIndexOutOfBoundsException;
                //  72     79     3      8      Any
                //  73     79     3      8      Ljava/lang/ClassCastException;
                //  121    127    127    128    Any
                //  121    127    3      8      Any
                //  121    127    127    128    Ljava/lang/ArrayIndexOutOfBoundsException;
                //  121    127    127    128    Any
                //  121    127    3      8      Any
                //  183    190    190    191    Any
                //  184    190    3      8      Any
                //  184    190    183    184    Any
                //  183    190    190    191    Ljava/lang/StringIndexOutOfBoundsException;
                //  183    190    183    184    Any
                //  199    206    206    207    Any
                //  199    206    3      8      Ljava/lang/EnumConstantNotPresentException;
                //  200    206    206    207    Any
                //  199    206    199    200    Ljava/util/ConcurrentModificationException;
                //  199    206    206    207    Any
                //  287    293    293    294    Any
                //  287    293    293    294    Ljava/lang/StringIndexOutOfBoundsException;
                //  287    293    3      8      Ljava/lang/RuntimeException;
                //  287    293    3      8      Any
                //  287    293    293    294    Any
                //  303    310    310    311    Any
                //  304    310    310    311    Ljava/lang/UnsupportedOperationException;
                //  303    310    3      8      Ljava/lang/IndexOutOfBoundsException;
                //  304    310    310    311    Any
                //  303    310    303    304    Any
                //  367    374    374    375    Any
                //  368    374    367    368    Any
                //  368    374    367    368    Ljava/util/ConcurrentModificationException;
                //  367    374    3      8      Any
                //  368    374    367    368    Ljava/lang/EnumConstantNotPresentException;
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
            
            static {
                throw t;
            }
        }
        public class fj extends fi
        {
            public fl c;
            
            public static boolean c(final String s, final Alt alt) {
                return fbS.1V(null, 256005042, s, alt);
            }
            
            public void c(final Alt p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          181
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.0:I
                //    12: ifgt            173
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            165
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: getstatic       dev/nuker/pyro/fc.c:I
                //    27: ifge            35
                //    30: ldc             623440453
                //    32: goto            37
                //    35: ldc             -124427088
                //    37: ldc             -865736165
                //    39: ixor           
                //    40: lookupswitch {
                //          -380823458: 154
                //          202235530: 35
                //          default: 68
                //        }
                //    68: getstatic       dev/nuker/pyro/alt/AltManager.INSTANCE:Ldev/nuker/pyro/alt/AltManager;
                //    71: aload_1        
                //    72: goto            76
                //    75: athrow         
                //    76: invokevirtual   dev/nuker/pyro/alt/AltManager.addAlt:(Ldev/nuker/pyro/alt/Alt;)Z
                //    79: goto            83
                //    82: athrow         
                //    83: pop            
                //    84: aload_0        
                //    85: getfield        dev/nuker/pyro/fj.c:Ldev/nuker/pyro/fl;
                //    88: goto            92
                //    91: athrow         
                //    92: invokestatic    dev/nuker/pyro/fl.c:(Ldev/nuker/pyro/fl;)Ldev/nuker/pyro/fm;
                //    95: goto            99
                //    98: athrow         
                //    99: getstatic       dev/nuker/pyro/fc.0:I
                //   102: ifeq            110
                //   105: ldc             2128976032
                //   107: goto            112
                //   110: ldc             123833171
                //   112: ldc             19175001
                //   114: ixor           
                //   115: lookupswitch {
                //          105192714: 140
                //          2143358713: 110
                //          default: 152
                //        }
                //   140: goto            144
                //   143: athrow         
                //   144: invokevirtual   dev/nuker/pyro/fm.c:()V
                //   147: goto            151
                //   150: athrow         
                //   151: return         
                //   152: aconst_null    
                //   153: athrow         
                //   154: aconst_null    
                //   155: athrow         
                //   156: pop            
                //   157: goto            24
                //   160: pop            
                //   161: aconst_null    
                //   162: goto            156
                //   165: dup            
                //   166: ifnull          156
                //   169: checkcast       Ljava/lang/Throwable;
                //   172: athrow         
                //   173: dup            
                //   174: ifnull          160
                //   177: checkcast       Ljava/lang/Throwable;
                //   180: athrow         
                //   181: aconst_null    
                //   182: athrow         
                //    StackMapTable: 00 1D 43 07 00 27 04 FF 00 0B 00 00 00 01 07 00 27 FD 00 03 07 00 03 07 00 45 0A 41 01 1E 46 07 00 47 FF 00 00 00 02 07 00 03 07 00 45 00 02 07 00 2E 07 00 45 45 07 00 27 40 01 47 07 00 27 40 07 00 07 45 07 00 27 40 07 00 40 4A 07 00 40 FF 00 01 00 02 07 00 03 07 00 45 00 02 07 00 40 01 5B 07 00 40 42 07 00 27 40 07 00 40 45 07 00 27 00 40 07 00 40 01 41 07 00 27 43 05 44 07 00 27 47 05 47 07 00 27
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                  
                //  -----  -----  -----  -----  --------------------------------------
                //  8      20     165    173    Ljava/lang/NegativeArraySizeException;
                //  165    173    165    173    Any
                //  181    183    3      8      Any
                //  75     82     82     83     Any
                //  75     82     82     83     Any
                //  76     82     82     83     Any
                //  75     82     75     76     Ljava/lang/IllegalArgumentException;
                //  75     82     75     76     Ljava/lang/IndexOutOfBoundsException;
                //  91     98     98     99     Any
                //  92     98     98     99     Any
                //  92     98     91     92     Ljava/lang/NullPointerException;
                //  91     98     91     92     Any
                //  92     98     3      8      Any
                //  143    150    150    151    Any
                //  144    150    150    151    Any
                //  143    150    143    144    Any
                //  143    150    3      8      Ljava/lang/ArithmeticException;
                //  144    150    3      8      Any
                // 
                // The error that occurred was:
                // 
                // java.lang.IndexOutOfBoundsException: Index 66 out of bounds for length 66
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
            
            @Override
            public void c(final String p0, final String p1) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          1166
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.1:I
                //    12: ifgt            1158
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            1150
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: aload_2        
                //    25: getstatic       dev/nuker/pyro/fc.1:I
                //    28: ifeq            36
                //    31: ldc             1147397666
                //    33: goto            38
                //    36: ldc             -812105175
                //    38: ldc             2027421498
                //    40: ixor           
                //    41: lookupswitch {
                //          -1219511021: 68
                //          1018435864: 36
                //          default: 1129
                //        }
                //    68: goto            72
                //    71: athrow         
                //    72: invokevirtual   java/lang/String.isEmpty:()Z
                //    75: goto            79
                //    78: athrow         
                //    79: ifeq            414
                //    82: getstatic       dev/nuker/pyro/alt/AltManager.INSTANCE:Ldev/nuker/pyro/alt/AltManager;
                //    85: goto            89
                //    88: athrow         
                //    89: invokevirtual   dev/nuker/pyro/alt/AltManager.getAlts:()Ljava/util/List;
                //    92: goto            96
                //    95: athrow         
                //    96: goto            100
                //    99: athrow         
                //   100: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
                //   105: goto            109
                //   108: athrow         
                //   109: getstatic       dev/nuker/pyro/fc.c:I
                //   112: ifge            120
                //   115: ldc             -326329792
                //   117: goto            122
                //   120: ldc             -91612277
                //   122: ldc             1985652673
                //   124: ixor           
                //   125: lookupswitch {
                //          -1932477366: 152
                //          -1697235583: 120
                //          default: 1119
                //        }
                //   152: aload_1        
                //   153: invokedynamic   BootstrapMethod #0, test:(Ljava/lang/String;)Ljava/util/function/Predicate;
                //   158: goto            162
                //   161: athrow         
                //   162: invokeinterface java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
                //   167: goto            171
                //   170: athrow         
                //   171: ifeq            238
                //   174: aload_0        
                //   175: ldc             "\u10d4\u149b\ub9fc\ub1da\ufedb\udea6\ub22d\ud5c7\udb39\udeac\u942a\u1e5e\ud2f5\uc7b7\ub62e\uba64\u57e4\u4410\ubf22\uf751\u1813\uc238\u591a\u2f48\ue0da\u068b\u7d3f\ubafa\u8217\ubb83\ub7b4\ufb3a\u4386\u9813\u2c90\uc266\u4968\ubb35\uc899\uc83b\u85d5\u41f6"
                //   177: goto            181
                //   180: athrow         
                //   181: invokestatic    invokestatic   !!! ERROR
                //   184: goto            188
                //   187: athrow         
                //   188: getstatic       dev/nuker/pyro/fc.1:I
                //   191: ifeq            199
                //   194: ldc             1273116006
                //   196: goto            201
                //   199: ldc             260817674
                //   201: ldc             -1500725799
                //   203: ixor           
                //   204: lookupswitch {
                //          -311523137: 1139
                //          1881221630: 199
                //          default: 232
                //        }
                //   232: putfield        dev/nuker/pyro/fj.0:Ljava/lang/String;
                //   235: goto            1108
                //   238: aload_0        
                //   239: new             Ldev/nuker/pyro/alt/Alt;
                //   242: dup            
                //   243: getstatic       dev/nuker/pyro/fc.0:I
                //   246: ifeq            254
                //   249: ldc             -424034344
                //   251: goto            256
                //   254: ldc             -1291103307
                //   256: ldc             -2049833850
                //   258: ixor           
                //   259: lookupswitch {
                //          920213299: 284
                //          1668004702: 254
                //          default: 1137
                //        }
                //   284: aload_1        
                //   285: goto            289
                //   288: athrow         
                //   289: invokespecial   dev/nuker/pyro/alt/Alt.<init>:(Ljava/lang/String;)V
                //   292: goto            296
                //   295: athrow         
                //   296: goto            300
                //   299: athrow         
                //   300: invokespecial   dev/nuker/pyro/fj.c:(Ldev/nuker/pyro/alt/Alt;)V
                //   303: goto            307
                //   306: athrow         
                //   307: getstatic       dev/nuker/pyro/fc.c:I
                //   310: ifge            318
                //   313: ldc             538126900
                //   315: goto            320
                //   318: ldc             -2082102830
                //   320: ldc             -1690154854
                //   322: ixor           
                //   323: lookupswitch {
                //          -1152294226: 318
                //          413657416: 348
                //          default: 1125
                //        }
                //   348: aload_0        
                //   349: getfield        dev/nuker/pyro/fj.field_146297_k:Lnet/minecraft/client/Minecraft;
                //   352: aload_0        
                //   353: getfield        dev/nuker/pyro/fj.c:Lnet/minecraft/client/gui/GuiScreen;
                //   356: getstatic       dev/nuker/pyro/fc.1:I
                //   359: ifeq            367
                //   362: ldc             623205889
                //   364: goto            369
                //   367: ldc             -1271953870
                //   369: ldc             2058748773
                //   371: ixor           
                //   372: lookupswitch {
                //          -828799657: 400
                //          1603493220: 367
                //          default: 1123
                //        }
                //   400: goto            404
                //   403: athrow         
                //   404: invokevirtual   net/minecraft/client/Minecraft.func_147108_a:(Lnet/minecraft/client/gui/GuiScreen;)V
                //   407: goto            411
                //   410: athrow         
                //   411: goto            1108
                //   414: aload_1        
                //   415: aload_2        
                //   416: goto            420
                //   419: athrow         
                //   420: invokestatic    dev/nuker/pyro/alt/AltLogic.verifyCredentials:(Ljava/lang/String;Ljava/lang/String;)I
                //   423: goto            427
                //   426: athrow         
                //   427: tableswitch {
                //                0: 452
                //                1: 1069
                //                2: 1090
                //          default: 1108
                //        }
                //   452: getstatic       dev/nuker/pyro/fc.0:I
                //   455: ifeq            463
                //   458: ldc             1152284575
                //   460: goto            465
                //   463: ldc             -238604603
                //   465: ldc             -1885547956
                //   467: ixor           
                //   468: lookupswitch {
                //          -885873197: 1135
                //          -336346096: 463
                //          default: 496
                //        }
                //   496: getstatic       dev/nuker/pyro/alt/AltManager.INSTANCE:Ldev/nuker/pyro/alt/AltManager;
                //   499: goto            503
                //   502: athrow         
                //   503: invokevirtual   dev/nuker/pyro/alt/AltManager.getAlts:()Ljava/util/List;
                //   506: goto            510
                //   509: athrow         
                //   510: goto            514
                //   513: athrow         
                //   514: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
                //   519: goto            523
                //   522: athrow         
                //   523: aload_1        
                //   524: invokedynamic   BootstrapMethod #1, test:(Ljava/lang/String;)Ljava/util/function/Predicate;
                //   529: goto            533
                //   532: athrow         
                //   533: invokeinterface java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
                //   538: goto            542
                //   541: athrow         
                //   542: ifeq            606
                //   545: aload_0        
                //   546: ldc             "\u10d4\u149b\ub9fc\ub1da\ufedb\udea6\ub22d\ud5c7\udb39\udeac\u942a\u1e5e\ud2f5\uc7b7\ub62e\uba64\u57e4\u4410\ubf22\uf751\u1813\uc238\u591a\u2f48\ue0da\u068b\u7d3f\ubafa\u8217\ubb83\ub7b4\ufb3a\u4386\u9813\u2c90\uc266\u4968\ubb35\uc892\uc837\u85d9\u41fa\u8aec"
                //   548: getstatic       dev/nuker/pyro/fc.c:I
                //   551: ifge            559
                //   554: ldc             -483298636
                //   556: goto            561
                //   559: ldc             -785557551
                //   561: ldc             1198111465
                //   563: ixor           
                //   564: lookupswitch {
                //          -1537685411: 1111
                //          124201132: 559
                //          default: 592
                //        }
                //   592: goto            596
                //   595: athrow         
                //   596: invokestatic    invokestatic   !!! ERROR
                //   599: goto            603
                //   602: athrow         
                //   603: putfield        dev/nuker/pyro/fj.0:Ljava/lang/String;
                //   606: aload_0        
                //   607: new             Ldev/nuker/pyro/alt/Alt;
                //   610: dup            
                //   611: getstatic       dev/nuker/pyro/fc.c:I
                //   614: ifge            622
                //   617: ldc             1937898797
                //   619: goto            624
                //   622: ldc             548150035
                //   624: ldc             1483693685
                //   626: ixor           
                //   627: lookupswitch {
                //          -347305308: 622
                //          737059672: 1113
                //          default: 652
                //        }
                //   652: aload_1        
                //   653: getstatic       dev/nuker/pyro/fc.c:I
                //   656: ifge            664
                //   659: ldc             858371076
                //   661: goto            666
                //   664: ldc             -829325014
                //   666: ldc             1172222584
                //   668: ixor           
                //   669: lookupswitch {
                //          -1957743790: 696
                //          1995900540: 664
                //          default: 1117
                //        }
                //   696: getstatic       dev/nuker/pyro/alt/AltLogic.yua:Lcom/mojang/authlib/yggdrasil/YggdrasilUserAuthentication;
                //   699: goto            703
                //   702: athrow         
                //   703: invokevirtual   com/mojang/authlib/yggdrasil/YggdrasilUserAuthentication.getSelectedProfile:()Lcom/mojang/authlib/GameProfile;
                //   706: goto            710
                //   709: athrow         
                //   710: goto            714
                //   713: athrow         
                //   714: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
                //   717: goto            721
                //   720: athrow         
                //   721: getstatic       dev/nuker/pyro/fc.c:I
                //   724: ifge            732
                //   727: ldc             -1570851506
                //   729: goto            734
                //   732: ldc             1866375602
                //   734: ldc             224863702
                //   736: ixor           
                //   737: lookupswitch {
                //          -1355181928: 1109
                //          -398707648: 732
                //          default: 764
                //        }
                //   764: aload_2        
                //   765: getstatic       dev/nuker/pyro/fc.1:I
                //   768: ifeq            776
                //   771: ldc             25727482
                //   773: goto            778
                //   776: ldc             886438937
                //   778: ldc             1160373682
                //   780: ixor           
                //   781: lookupswitch {
                //          924822239: 776
                //          1151431752: 1133
                //          default: 808
                //        }
                //   808: getstatic       dev/nuker/pyro/alt/AltLogic.yua:Lcom/mojang/authlib/yggdrasil/YggdrasilUserAuthentication;
                //   811: goto            815
                //   814: athrow         
                //   815: invokevirtual   com/mojang/authlib/yggdrasil/YggdrasilUserAuthentication.getSelectedProfile:()Lcom/mojang/authlib/GameProfile;
                //   818: goto            822
                //   821: athrow         
                //   822: goto            826
                //   825: athrow         
                //   826: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
                //   829: goto            833
                //   832: athrow         
                //   833: goto            837
                //   836: athrow         
                //   837: invokevirtual   java/util/UUID.toString:()Ljava/lang/String;
                //   840: goto            844
                //   843: athrow         
                //   844: goto            848
                //   847: athrow         
                //   848: invokespecial   dev/nuker/pyro/alt/Alt.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
                //   851: goto            855
                //   854: athrow         
                //   855: getstatic       dev/nuker/pyro/fc.0:I
                //   858: ifeq            866
                //   861: ldc             1251200555
                //   863: goto            868
                //   866: ldc             281805003
                //   868: ldc             643837514
                //   870: ixor           
                //   871: lookupswitch {
                //          -274807949: 866
                //          1827922017: 1121
                //          default: 896
                //        }
                //   896: goto            900
                //   899: athrow         
                //   900: invokespecial   dev/nuker/pyro/fj.c:(Ldev/nuker/pyro/alt/Alt;)V
                //   903: goto            907
                //   906: athrow         
                //   907: getstatic       dev/nuker/pyro/alt/AltLogic.yua:Lcom/mojang/authlib/yggdrasil/YggdrasilUserAuthentication;
                //   910: getstatic       dev/nuker/pyro/fc.1:I
                //   913: ifeq            921
                //   916: ldc             49483807
                //   918: goto            923
                //   921: ldc             -1665819751
                //   923: ldc             1847343022
                //   925: ixor           
                //   926: lookupswitch {
                //          1454639801: 921
                //          1827612593: 1131
                //          default: 952
                //        }
                //   952: goto            956
                //   955: athrow         
                //   956: invokevirtual   com/mojang/authlib/yggdrasil/YggdrasilUserAuthentication.logOut:()V
                //   959: goto            963
                //   962: athrow         
                //   963: getstatic       dev/nuker/pyro/fc.1:I
                //   966: ifeq            974
                //   969: ldc             1856303791
                //   971: goto            976
                //   974: ldc             2136842289
                //   976: ldc             2090845422
                //   978: ixor           
                //   979: lookupswitch {
                //          63071455: 1004
                //          305870401: 974
                //          default: 1115
                //        }
                //  1004: aload_0        
                //  1005: getfield        dev/nuker/pyro/fj.field_146297_k:Lnet/minecraft/client/Minecraft;
                //  1008: aload_0        
                //  1009: getstatic       dev/nuker/pyro/fc.c:I
                //  1012: ifge            1020
                //  1015: ldc             -1266431401
                //  1017: goto            1022
                //  1020: ldc             99864758
                //  1022: ldc             -330394319
                //  1024: ixor           
                //  1025: lookupswitch {
                //          1489854310: 1127
                //          1617787478: 1020
                //          default: 1052
                //        }
                //  1052: getfield        dev/nuker/pyro/fj.c:Lnet/minecraft/client/gui/GuiScreen;
                //  1055: goto            1059
                //  1058: athrow         
                //  1059: invokevirtual   net/minecraft/client/Minecraft.func_147108_a:(Lnet/minecraft/client/gui/GuiScreen;)V
                //  1062: goto            1066
                //  1065: athrow         
                //  1066: goto            1108
                //  1069: aload_0        
                //  1070: ldc_w           "\u10c9\u149d\ub9ef\ub1c9\ufed2\udeef\ub220\ud594\udb7c\udea0\u9427\u1e45\ud2fc\uc7f6\ub625\uba6f\u57e4\u4401\ubf2d\uf702\u1801\uc22c\u5916\u2f55\ue0cb"
                //  1073: goto            1077
                //  1076: athrow         
                //  1077: invokestatic    invokestatic   !!! ERROR
                //  1080: goto            1084
                //  1083: athrow         
                //  1084: putfield        dev/nuker/pyro/fj.0:Ljava/lang/String;
                //  1087: goto            1108
                //  1090: aload_0        
                //  1091: ldc_w           "\u10d5\u149d\ub9f8\ub1ca\ufed2\udee3\ub264\ud5c0\udb76\udeed\u9425\u1e43\ud2fe\uc7b8\ub62f\uba7e\u57b0\u4451\ubf38\uf71e\u1852\uc23a\u590c\u2f53\ue0c7\u0680\u7d25\ubaae\u8209\ubb89\ub7a1\ufb26\u43cf\u9808\u2c96\uc227\u496f\ubb70\uc885\uc82c\u85dd\u41e1\u8af3"
                //  1094: goto            1098
                //  1097: athrow         
                //  1098: invokestatic    invokestatic   !!! ERROR
                //  1101: goto            1105
                //  1104: athrow         
                //  1105: putfield        dev/nuker/pyro/fj.0:Ljava/lang/String;
                //  1108: return         
                //  1109: aconst_null    
                //  1110: athrow         
                //  1111: aconst_null    
                //  1112: athrow         
                //  1113: aconst_null    
                //  1114: athrow         
                //  1115: aconst_null    
                //  1116: athrow         
                //  1117: aconst_null    
                //  1118: athrow         
                //  1119: aconst_null    
                //  1120: athrow         
                //  1121: aconst_null    
                //  1122: athrow         
                //  1123: aconst_null    
                //  1124: athrow         
                //  1125: aconst_null    
                //  1126: athrow         
                //  1127: aconst_null    
                //  1128: athrow         
                //  1129: aconst_null    
                //  1130: athrow         
                //  1131: aconst_null    
                //  1132: athrow         
                //  1133: aconst_null    
                //  1134: athrow         
                //  1135: aconst_null    
                //  1136: athrow         
                //  1137: aconst_null    
                //  1138: athrow         
                //  1139: aconst_null    
                //  1140: athrow         
                //  1141: pop            
                //  1142: goto            24
                //  1145: pop            
                //  1146: aconst_null    
                //  1147: goto            1141
                //  1150: dup            
                //  1151: ifnull          1141
                //  1154: checkcast       Ljava/lang/Throwable;
                //  1157: athrow         
                //  1158: dup            
                //  1159: ifnull          1145
                //  1162: checkcast       Ljava/lang/Throwable;
                //  1165: athrow         
                //  1166: aconst_null    
                //  1167: athrow         
                //    StackMapTable: 00 B0 43 07 00 27 04 FF 00 0B 00 00 00 01 07 00 27 FE 00 03 07 00 03 07 00 64 07 00 64 4B 07 00 64 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 64 01 5D 07 00 64 42 07 00 27 40 07 00 64 45 07 00 27 40 01 48 07 00 47 40 07 00 2E 45 07 00 27 40 07 00 6E FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 01 07 00 6E 47 07 00 27 40 07 00 88 4A 07 00 88 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 88 01 5D 07 00 88 48 07 00 4E FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 88 07 01 04 47 07 00 27 40 01 48 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 64 45 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 64 FF 00 0A 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 64 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 03 07 00 03 07 00 64 01 FF 00 1E 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 64 05 FF 00 0F 00 03 07 00 03 07 00 64 07 00 64 00 03 07 00 03 08 00 EF 08 00 EF FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 04 07 00 03 08 00 EF 08 00 EF 01 FF 00 1B 00 03 07 00 03 07 00 64 07 00 64 00 03 07 00 03 08 00 EF 08 00 EF 43 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 04 07 00 03 08 00 EF 08 00 EF 07 00 64 45 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 45 42 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 45 45 07 00 27 00 0A 41 01 1B FF 00 12 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 B1 07 01 06 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 03 07 00 B1 07 01 06 01 FF 00 1E 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 B1 07 01 06 42 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 B1 07 01 06 45 07 00 27 00 02 44 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 64 07 00 64 45 07 00 27 40 01 18 0A 41 01 1E 45 07 00 27 40 07 00 2E 45 07 00 27 40 07 00 6E FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 01 07 00 6E 47 07 00 27 40 07 00 88 48 07 00 50 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 88 07 01 04 47 07 00 27 40 01 FF 00 10 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 64 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 03 07 00 03 07 00 64 01 FF 00 1E 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 64 42 07 00 56 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 64 45 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 64 02 FF 00 0F 00 03 07 00 03 07 00 64 07 00 64 00 03 07 00 03 08 02 5F 08 02 5F FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 04 07 00 03 08 02 5F 08 02 5F 01 FF 00 1B 00 03 07 00 03 07 00 64 07 00 64 00 03 07 00 03 08 02 5F 08 02 5F FF 00 0B 00 03 07 00 03 07 00 64 07 00 64 00 04 07 00 03 08 02 5F 08 02 5F 07 00 64 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 05 07 00 03 08 02 5F 08 02 5F 07 00 64 01 FF 00 1D 00 03 07 00 03 07 00 64 07 00 64 00 04 07 00 03 08 02 5F 08 02 5F 07 00 64 45 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 05 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 D3 45 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 05 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 D9 42 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 05 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 D9 45 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 05 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 64 FF 00 0A 00 03 07 00 03 07 00 64 07 00 64 00 05 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 64 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 06 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 64 01 FF 00 1D 00 03 07 00 03 07 00 64 07 00 64 00 05 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 64 FF 00 0B 00 03 07 00 03 07 00 64 07 00 64 00 06 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 64 07 00 64 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 07 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 64 07 00 64 01 FF 00 1D 00 03 07 00 03 07 00 64 07 00 64 00 06 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 64 07 00 64 45 07 00 4A FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 07 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 64 07 00 64 07 00 D3 45 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 07 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 64 07 00 64 07 00 D9 FF 00 02 00 00 00 01 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 07 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 64 07 00 64 07 00 D9 45 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 07 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 64 07 00 64 07 00 E9 42 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 07 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 64 07 00 64 07 00 E9 45 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 07 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 64 07 00 64 07 00 64 42 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 07 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 64 07 00 64 07 00 64 45 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 45 FF 00 0A 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 45 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 03 07 00 03 07 00 45 01 FF 00 1B 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 45 42 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 45 45 07 00 27 00 4D 07 00 D3 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 D3 01 5C 07 00 D3 42 07 00 27 40 07 00 D3 45 07 00 27 00 0A 41 01 1B FF 00 0F 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 B1 07 00 03 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 03 07 00 B1 07 00 03 01 FF 00 1D 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 B1 07 00 03 45 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 B1 07 01 06 45 07 00 27 00 02 46 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 64 45 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 64 05 46 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 64 45 07 00 27 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 64 02 FF 00 00 00 03 07 00 03 07 00 64 07 00 64 00 05 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 64 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 64 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 03 07 00 03 08 02 5F 08 02 5F 01 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 04 07 00 03 08 02 5F 08 02 5F 07 00 64 41 07 00 88 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 45 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 B1 07 01 06 01 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 B1 07 00 03 41 07 00 64 41 07 00 D3 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 06 07 00 03 08 02 5F 08 02 5F 07 00 64 07 00 64 07 00 64 01 FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 03 07 00 03 08 00 EF 08 00 EF FF 00 01 00 03 07 00 03 07 00 64 07 00 64 00 02 07 00 03 07 00 64 41 07 00 47 43 05 44 07 00 47 47 05 47 07 00 27
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                       
                //  -----  -----  -----  -----  -------------------------------------------
                //  8      20     1150   1158   Ljava/util/NoSuchElementException;
                //  1150   1158   1150   1158   Ljava/lang/NegativeArraySizeException;
                //  1166   1168   3      8      Ljava/lang/IllegalStateException;
                //  71     78     78     79     Any
                //  71     78     71     72     Any
                //  71     78     3      8      Any
                //  71     78     3      8      Ljava/lang/IndexOutOfBoundsException;
                //  72     78     78     79     Ljava/lang/AssertionError;
                //  88     95     95     96     Any
                //  88     95     3      8      Any
                //  89     95     88     89     Ljava/lang/ArithmeticException;
                //  89     95     88     89     Ljava/lang/IndexOutOfBoundsException;
                //  89     95     95     96     Any
                //  100    108    108    109    Any
                //  100    108    3      8      Any
                //  100    108    108    109    Any
                //  100    108    108    109    Ljava/lang/IllegalStateException;
                //  100    108    3      8      Any
                //  161    170    170    171    Any
                //  161    170    170    171    Ljava/lang/ArithmeticException;
                //  161    170    3      8      Ljava/lang/IndexOutOfBoundsException;
                //  161    170    161    162    Ljava/lang/AssertionError;
                //  162    170    170    171    Ljava/lang/AssertionError;
                //  180    187    187    188    Any
                //  181    187    187    188    Ljava/lang/IndexOutOfBoundsException;
                //  180    187    180    181    Any
                //  180    187    180    181    Any
                //  180    187    180    181    Any
                //  288    295    295    296    Any
                //  289    295    3      8      Any
                //  288    295    288    289    Any
                //  289    295    295    296    Any
                //  289    295    288    289    Ljava/lang/RuntimeException;
                //  299    306    306    307    Any
                //  299    306    299    300    Any
                //  300    306    306    307    Ljava/lang/UnsupportedOperationException;
                //  299    306    3      8      Ljava/util/ConcurrentModificationException;
                //  300    306    3      8      Ljava/lang/RuntimeException;
                //  403    410    410    411    Any
                //  404    410    410    411    Ljava/lang/ClassCastException;
                //  403    410    3      8      Any
                //  403    410    3      8      Any
                //  404    410    403    404    Any
                //  419    426    426    427    Any
                //  419    426    419    420    Any
                //  419    426    419    420    Any
                //  419    426    419    420    Ljava/lang/UnsupportedOperationException;
                //  419    426    419    420    Ljava/util/NoSuchElementException;
                //  502    509    509    510    Any
                //  503    509    3      8      Any
                //  502    509    3      8      Ljava/util/ConcurrentModificationException;
                //  502    509    502    503    Any
                //  502    509    3      8      Any
                //  514    522    522    523    Any
                //  514    522    3      8      Any
                //  514    522    3      8      Any
                //  514    522    522    523    Ljava/lang/EnumConstantNotPresentException;
                //  514    522    3      8      Ljava/lang/UnsupportedOperationException;
                //  532    541    541    542    Any
                //  533    541    532    533    Ljava/lang/UnsupportedOperationException;
                //  533    541    3      8      Ljava/lang/StringIndexOutOfBoundsException;
                //  532    541    541    542    Ljava/lang/NumberFormatException;
                //  533    541    3      8      Ljava/lang/AssertionError;
                //  595    602    602    603    Any
                //  595    602    602    603    Ljava/lang/StringIndexOutOfBoundsException;
                //  595    602    602    603    Ljava/lang/IllegalArgumentException;
                //  595    602    3      8      Any
                //  596    602    595    596    Ljava/lang/EnumConstantNotPresentException;
                //  702    709    709    710    Any
                //  702    709    702    703    Any
                //  703    709    709    710    Ljava/util/NoSuchElementException;
                //  703    709    709    710    Any
                //  703    709    3      8      Ljava/lang/IllegalArgumentException;
                //  713    720    720    721    Any
                //  714    720    3      8      Any
                //  713    720    713    714    Any
                //  714    720    713    714    Ljava/lang/RuntimeException;
                //  713    720    3      8      Ljava/lang/NullPointerException;
                //  814    821    821    822    Any
                //  814    821    821    822    Any
                //  814    821    3      8      Any
                //  815    821    821    822    Ljava/lang/UnsupportedOperationException;
                //  814    821    814    815    Ljava/util/NoSuchElementException;
                //  826    832    832    833    Any
                //  826    832    3      8      Any
                //  826    832    3      8      Any
                //  826    832    832    833    Any
                //  826    832    832    833    Any
                //  836    843    843    844    Any
                //  837    843    3      8      Ljava/lang/IllegalArgumentException;
                //  836    843    836    837    Ljava/lang/ArrayIndexOutOfBoundsException;
                //  837    843    836    837    Any
                //  837    843    843    844    Any
                //  847    854    854    855    Any
                //  848    854    847    848    Ljava/util/NoSuchElementException;
                //  848    854    847    848    Any
                //  847    854    854    855    Ljava/lang/AssertionError;
                //  848    854    854    855    Ljava/lang/IllegalStateException;
                //  899    906    906    907    Any
                //  899    906    899    900    Ljava/lang/IndexOutOfBoundsException;
                //  899    906    899    900    Any
                //  900    906    3      8      Ljava/util/NoSuchElementException;
                //  900    906    906    907    Any
                //  955    962    962    963    Any
                //  955    962    955    956    Any
                //  955    962    3      8      Ljava/lang/IndexOutOfBoundsException;
                //  956    962    3      8      Any
                //  956    962    955    956    Any
                //  1058   1065   1065   1066   Any
                //  1058   1065   1058   1059   Any
                //  1058   1065   1058   1059   Any
                //  1058   1065   1065   1066   Any
                //  1058   1065   3      8      Any
                //  1076   1083   1083   1084   Any
                //  1077   1083   3      8      Ljava/lang/IllegalArgumentException;
                //  1077   1083   1083   1084   Any
                //  1076   1083   1076   1077   Any
                //  1077   1083   1076   1077   Ljava/lang/NumberFormatException;
                //  1097   1104   1104   1105   Any
                //  1098   1104   1097   1098   Any
                //  1098   1104   3      8      Any
                //  1097   1104   3      8      Ljava/lang/UnsupportedOperationException;
                //  1097   1104   1097   1098   Ljava/lang/NumberFormatException;
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
            
            public static boolean 0(final String s, final Alt alt) {
                return fbS.1V(null, 256005043, s, alt);
            }
            
            public fj(final fl c, final GuiScreen guiScreen, final String s) {
                while (true) {
                    int n = 0;
                    Label_0015: {
                        if (fc.c < 0) {
                            n = -1110740370;
                            break Label_0015;
                        }
                        n = 1060736573;
                    }
                    switch (n ^ 0xBAA16C77) {
                        case 124395033: {
                            continue;
                        }
                        case -2053578166: {
                            this.c = c;
                            while (true) {
                                int n2 = 0;
                                Label_0066: {
                                    if (fc.c < 0) {
                                        n2 = 1393892427;
                                        break Label_0066;
                                    }
                                    n2 = 1042478586;
                                }
                                switch (n2 ^ 0x1A467374) {
                                    case -1537719970: {
                                        continue;
                                    }
                                    default: {
                                        while (true) {
                                            int n3 = 0;
                                            Label_0112: {
                                                if (fc.c < 0) {
                                                    n3 = 1199641772;
                                                    break Label_0112;
                                                }
                                                n3 = 894265513;
                                            }
                                            switch (n3 ^ 0x2296AA5) {
                                                case 1168670217: {
                                                    continue;
                                                }
                                                case 929301004: {
                                                    super(guiScreen, s);
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
                                    case 1230204735: {
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
            }
            
            static {
                throw t;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1054
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1046
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1038
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            37
        //    31: ldc_w           1352074769
        //    34: goto            40
        //    37: ldc_w           -1778658655
        //    40: ldc_w           1483847113
        //    43: ixor           
        //    44: lookupswitch {
        //          -1100998894: 37
        //          149337048: 1023
        //          default: 72
        //        }
        //    72: getfield        net/minecraft/client/gui/GuiButton.field_146124_l:Z
        //    75: ifeq            998
        //    78: aload_0        
        //    79: getstatic       dev/nuker/pyro/fc.c:I
        //    82: ifge            91
        //    85: ldc_w           -1633100307
        //    88: goto            94
        //    91: ldc_w           -1274481030
        //    94: ldc_w           1650992783
        //    97: ixor           
        //    98: lookupswitch {
        //          -1763826214: 91
        //          -54461598: 1021
        //          default: 124
        //        }
        //   124: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fm;
        //   127: goto            131
        //   130: athrow         
        //   131: invokevirtual   dev/nuker/pyro/fm.0:()Ldev/nuker/pyro/fn;
        //   134: goto            138
        //   137: athrow         
        //   138: getstatic       dev/nuker/pyro/fc.c:I
        //   141: ifge            150
        //   144: ldc_w           2067340455
        //   147: goto            153
        //   150: ldc_w           -38927055
        //   153: ldc_w           1375416903
        //   156: ixor           
        //   157: lookupswitch {
        //          -1403701386: 184
        //          717369056: 150
        //          default: 1005
        //        }
        //   184: astore_2       
        //   185: aload_1        
        //   186: getstatic       dev/nuker/pyro/fc.c:I
        //   189: ifge            198
        //   192: ldc_w           1282470474
        //   195: goto            201
        //   198: ldc_w           3413020
        //   201: ldc_w           -2011478999
        //   204: ixor           
        //   205: lookupswitch {
        //          -2010165195: 232
        //          -999573917: 198
        //          default: 999
        //        }
        //   232: getfield        net/minecraft/client/gui/GuiButton.field_146127_k:I
        //   235: tableswitch {
        //                0: 268
        //                1: 393
        //                2: 408
        //                3: 810
        //                4: 572
        //          default: 998
        //        }
        //   268: aload_0        
        //   269: getstatic       dev/nuker/pyro/fc.1:I
        //   272: ifeq            281
        //   275: ldc_w           1636085640
        //   278: goto            284
        //   281: ldc_w           -618505892
        //   284: ldc_w           55272788
        //   287: ixor           
        //   288: lookupswitch {
        //          1254791892: 281
        //          1657785052: 1025
        //          default: 316
        //        }
        //   316: getfield        dev/nuker/pyro/fl.field_146297_k:Lnet/minecraft/client/Minecraft;
        //   319: new             Lnet/minecraft/client/gui/GuiMainMenu;
        //   322: dup            
        //   323: getstatic       dev/nuker/pyro/fc.c:I
        //   326: ifge            335
        //   329: ldc_w           1447869121
        //   332: goto            338
        //   335: ldc_w           -985164861
        //   338: ldc_w           1529870940
        //   341: ixor           
        //   342: lookupswitch {
        //          224608413: 1019
        //          1865327804: 335
        //          default: 368
        //        }
        //   368: goto            372
        //   371: athrow         
        //   372: invokespecial   net/minecraft/client/gui/GuiMainMenu.<init>:()V
        //   375: goto            379
        //   378: athrow         
        //   379: goto            383
        //   382: athrow         
        //   383: invokevirtual   net/minecraft/client/Minecraft.func_147108_a:(Lnet/minecraft/client/gui/GuiScreen;)V
        //   386: goto            390
        //   389: athrow         
        //   390: goto            998
        //   393: aload_2        
        //   394: goto            398
        //   397: athrow         
        //   398: invokevirtual   dev/nuker/pyro/fn.0:()V
        //   401: goto            405
        //   404: athrow         
        //   405: goto            998
        //   408: getstatic       dev/nuker/pyro/alt/AltManager.INSTANCE:Ldev/nuker/pyro/alt/AltManager;
        //   411: aload_2        
        //   412: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/alt/Alt;
        //   415: goto            419
        //   418: athrow         
        //   419: invokevirtual   dev/nuker/pyro/alt/AltManager.removeAlt:(Ldev/nuker/pyro/alt/Alt;)V
        //   422: goto            426
        //   425: athrow         
        //   426: aload_0        
        //   427: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fm;
        //   430: getfield        dev/nuker/pyro/fm.c:Ljava/util/List;
        //   433: getstatic       dev/nuker/pyro/fc.1:I
        //   436: ifeq            445
        //   439: ldc_w           1747890583
        //   442: goto            448
        //   445: ldc_w           -1500281608
        //   448: ldc_w           -1404525932
        //   451: ixor           
        //   452: lookupswitch {
        //          -999943421: 1011
        //          697061635: 445
        //          default: 480
        //        }
        //   480: aload_2        
        //   481: goto            485
        //   484: athrow         
        //   485: invokeinterface java/util/List.remove:(Ljava/lang/Object;)Z
        //   490: goto            494
        //   493: athrow         
        //   494: pop            
        //   495: aload_0        
        //   496: aload_0        
        //   497: getstatic       dev/nuker/pyro/fc.1:I
        //   500: ifeq            509
        //   503: ldc_w           -381641663
        //   506: goto            512
        //   509: ldc_w           911192074
        //   512: ldc_w           593767206
        //   515: ixor           
        //   516: lookupswitch {
        //          -903563417: 509
        //          355179308: 544
        //          default: 1001
        //        }
        //   544: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fm;
        //   547: goto            551
        //   550: athrow         
        //   551: invokevirtual   dev/nuker/pyro/fm.0:()Ldev/nuker/pyro/fn;
        //   554: goto            558
        //   557: athrow         
        //   558: goto            562
        //   561: athrow         
        //   562: invokevirtual   dev/nuker/pyro/fl.1:(Ldev/nuker/pyro/fn;)V
        //   565: goto            569
        //   568: athrow         
        //   569: goto            998
        //   572: aload_0        
        //   573: ldc_w           ""
        //   576: putfield        dev/nuker/pyro/fl.c:Ljava/lang/String;
        //   579: aload_0        
        //   580: getstatic       dev/nuker/pyro/fc.1:I
        //   583: ifeq            592
        //   586: ldc_w           1303318519
        //   589: goto            595
        //   592: ldc_w           -558767926
        //   595: ldc_w           961537296
        //   598: ixor           
        //   599: lookupswitch {
        //          -1118764067: 592
        //          1960897255: 1013
        //          default: 624
        //        }
        //   624: getfield        dev/nuker/pyro/fl.field_146297_k:Lnet/minecraft/client/Minecraft;
        //   627: new             Ldev/nuker/pyro/fj;
        //   630: dup            
        //   631: getstatic       dev/nuker/pyro/fc.0:I
        //   634: ifeq            643
        //   637: ldc_w           1747546484
        //   640: goto            646
        //   643: ldc_w           -1056947311
        //   646: ldc_w           1706193673
        //   649: ixor           
        //   650: lookupswitch {
        //          -328182732: 643
        //          228262525: 1015
        //          default: 676
        //        }
        //   676: aload_0        
        //   677: aload_0        
        //   678: ldc_w           "\u10c7\u1497\ub9f3\ua673\ue5b6\udee3\ub227\ud5d5\ucc97\uc5ea\u9434"
        //   681: getstatic       dev/nuker/pyro/fc.c:I
        //   684: ifge            693
        //   687: ldc_w           -1078697127
        //   690: goto            696
        //   693: ldc_w           -1518587302
        //   696: ldc_w           -1029392275
        //   699: ixor           
        //   700: lookupswitch {
        //          1538007683: 693
        //          2098256692: 1027
        //          default: 728
        //        }
        //   728: goto            732
        //   731: athrow         
        //   732: invokestatic    invokestatic   !!! ERROR
        //   735: goto            739
        //   738: athrow         
        //   739: goto            743
        //   742: athrow         
        //   743: invokespecial   dev/nuker/pyro/fj.<init>:(Ldev/nuker/pyro/fl;Lnet/minecraft/client/gui/GuiScreen;Ljava/lang/String;)V
        //   746: goto            750
        //   749: athrow         
        //   750: getstatic       dev/nuker/pyro/fc.1:I
        //   753: ifeq            762
        //   756: ldc_w           181750062
        //   759: goto            765
        //   762: ldc_w           989697796
        //   765: ldc_w           1746097854
        //   768: ixor           
        //   769: lookupswitch {
        //          1391378874: 796
        //          1657151376: 762
        //          default: 1009
        //        }
        //   796: goto            800
        //   799: athrow         
        //   800: invokevirtual   net/minecraft/client/Minecraft.func_147108_a:(Lnet/minecraft/client/gui/GuiScreen;)V
        //   803: goto            807
        //   806: athrow         
        //   807: goto            998
        //   810: aload_0        
        //   811: ldc_w           ""
        //   814: getstatic       dev/nuker/pyro/fc.1:I
        //   817: ifeq            826
        //   820: ldc_w           383164920
        //   823: goto            829
        //   826: ldc_w           313024507
        //   829: ldc_w           -1879320932
        //   832: ixor           
        //   833: lookupswitch {
        //          -1725073564: 1003
        //          -162204295: 826
        //          default: 860
        //        }
        //   860: putfield        dev/nuker/pyro/fl.c:Ljava/lang/String;
        //   863: aload_0        
        //   864: getfield        dev/nuker/pyro/fl.field_146297_k:Lnet/minecraft/client/Minecraft;
        //   867: new             Ldev/nuker/pyro/fk;
        //   870: dup            
        //   871: aload_0        
        //   872: getstatic       dev/nuker/pyro/fc.1:I
        //   875: ifeq            884
        //   878: ldc_w           626927701
        //   881: goto            887
        //   884: ldc_w           1450088561
        //   887: ldc_w           1393970293
        //   890: ixor           
        //   891: lookupswitch {
        //          91804676: 916
        //          1984455712: 884
        //          default: 1007
        //        }
        //   916: aload_0        
        //   917: ldc_w           "\u10ca\u149c\ub9f0\ua63a\ue599"
        //   920: goto            924
        //   923: athrow         
        //   924: invokestatic    invokestatic   !!! ERROR
        //   927: goto            931
        //   930: athrow         
        //   931: getstatic       dev/nuker/pyro/fc.0:I
        //   934: ifeq            943
        //   937: ldc_w           -473032262
        //   940: goto            946
        //   943: ldc_w           -270240292
        //   946: ldc_w           1912725645
        //   949: ixor           
        //   950: lookupswitch {
        //          -1848641225: 943
        //          -1645898415: 976
        //          default: 1017
        //        }
        //   976: goto            980
        //   979: athrow         
        //   980: invokespecial   dev/nuker/pyro/fk.<init>:(Ldev/nuker/pyro/fl;Lnet/minecraft/client/gui/GuiScreen;Ljava/lang/String;)V
        //   983: goto            987
        //   986: athrow         
        //   987: goto            991
        //   990: athrow         
        //   991: invokevirtual   net/minecraft/client/Minecraft.func_147108_a:(Lnet/minecraft/client/gui/GuiScreen;)V
        //   994: goto            998
        //   997: athrow         
        //   998: return         
        //   999: aconst_null    
        //  1000: athrow         
        //  1001: aconst_null    
        //  1002: athrow         
        //  1003: aconst_null    
        //  1004: athrow         
        //  1005: aconst_null    
        //  1006: athrow         
        //  1007: aconst_null    
        //  1008: athrow         
        //  1009: aconst_null    
        //  1010: athrow         
        //  1011: aconst_null    
        //  1012: athrow         
        //  1013: aconst_null    
        //  1014: athrow         
        //  1015: aconst_null    
        //  1016: athrow         
        //  1017: aconst_null    
        //  1018: athrow         
        //  1019: aconst_null    
        //  1020: athrow         
        //  1021: aconst_null    
        //  1022: athrow         
        //  1023: aconst_null    
        //  1024: athrow         
        //  1025: aconst_null    
        //  1026: athrow         
        //  1027: aconst_null    
        //  1028: athrow         
        //  1029: pop            
        //  1030: goto            24
        //  1033: pop            
        //  1034: aconst_null    
        //  1035: goto            1029
        //  1038: dup            
        //  1039: ifnull          1029
        //  1042: checkcast       Ljava/lang/Throwable;
        //  1045: athrow         
        //  1046: dup            
        //  1047: ifnull          1033
        //  1050: checkcast       Ljava/lang/Throwable;
        //  1053: athrow         
        //  1054: aconst_null    
        //  1055: athrow         
        //    StackMapTable: 00 82 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FD 00 03 07 00 03 07 00 84 4C 07 00 84 FF 00 02 00 02 07 00 03 07 00 84 00 02 07 00 84 01 5F 07 00 84 52 07 00 03 FF 00 02 00 02 07 00 03 07 00 84 00 02 07 00 03 01 5D 07 00 03 45 07 00 25 40 07 00 38 45 07 00 25 40 07 00 55 4B 07 00 55 FF 00 02 00 02 07 00 03 07 00 84 00 02 07 00 55 01 5E 07 00 55 FF 00 0D 00 03 07 00 03 07 00 84 07 00 55 00 01 07 00 84 FF 00 02 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 84 01 5E 07 00 84 23 4C 07 00 03 FF 00 02 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 03 01 5F 07 00 03 FF 00 12 00 03 07 00 03 07 00 84 07 00 55 00 03 07 00 66 08 01 3F 08 01 3F FF 00 02 00 03 07 00 03 07 00 84 07 00 55 00 04 07 00 66 08 01 3F 08 01 3F 01 FF 00 1D 00 03 07 00 03 07 00 84 07 00 55 00 03 07 00 66 08 01 3F 08 01 3F 42 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 03 07 00 66 08 01 3F 08 01 3F 45 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 66 07 01 80 42 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 66 07 01 80 45 07 00 25 00 02 43 07 00 25 40 07 00 55 45 07 00 25 00 02 49 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 02 07 01 8D 07 00 5A 45 07 00 25 00 52 07 01 0E FF 00 02 00 03 07 00 03 07 00 84 07 00 55 00 02 07 01 0E 01 5F 07 01 0E 43 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 02 07 01 0E 07 00 55 47 07 00 25 40 01 FF 00 0E 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 03 07 00 03 FF 00 02 00 03 07 00 03 07 00 84 07 00 55 00 03 07 00 03 07 00 03 01 FF 00 1F 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 03 07 00 03 45 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 03 07 00 38 45 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 03 07 00 55 42 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 03 07 00 55 45 07 00 25 00 02 53 07 00 03 FF 00 02 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 03 01 5C 07 00 03 FF 00 12 00 03 07 00 03 07 00 84 07 00 55 00 03 07 00 66 08 02 73 08 02 73 FF 00 02 00 03 07 00 03 07 00 84 07 00 55 00 04 07 00 66 08 02 73 08 02 73 01 FF 00 1D 00 03 07 00 03 07 00 84 07 00 55 00 03 07 00 66 08 02 73 08 02 73 FF 00 10 00 03 07 00 03 07 00 84 07 00 55 00 06 07 00 66 08 02 73 08 02 73 07 00 03 07 00 03 07 00 EC FF 00 02 00 03 07 00 03 07 00 84 07 00 55 00 07 07 00 66 08 02 73 08 02 73 07 00 03 07 00 03 07 00 EC 01 FF 00 1F 00 03 07 00 03 07 00 84 07 00 55 00 06 07 00 66 08 02 73 08 02 73 07 00 03 07 00 03 07 00 EC FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 06 07 00 66 08 02 73 08 02 73 07 00 03 07 00 03 07 00 EC 45 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 06 07 00 66 08 02 73 08 02 73 07 00 03 07 00 03 07 00 EC 42 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 06 07 00 66 08 02 73 08 02 73 07 00 03 07 00 03 07 00 EC 45 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 66 07 01 A7 FF 00 0B 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 66 07 01 A7 FF 00 02 00 03 07 00 03 07 00 84 07 00 55 00 03 07 00 66 07 01 A7 01 FF 00 1E 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 66 07 01 A7 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 66 07 01 A7 45 07 00 25 00 02 FF 00 0F 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 03 07 00 EC FF 00 02 00 03 07 00 03 07 00 84 07 00 55 00 03 07 00 03 07 00 EC 01 FF 00 1E 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 03 07 00 EC FF 00 17 00 03 07 00 03 07 00 84 07 00 55 00 04 07 00 66 08 03 63 08 03 63 07 00 03 FF 00 02 00 03 07 00 03 07 00 84 07 00 55 00 05 07 00 66 08 03 63 08 03 63 07 00 03 01 FF 00 1C 00 03 07 00 03 07 00 84 07 00 55 00 04 07 00 66 08 03 63 08 03 63 07 00 03 46 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 06 07 00 66 08 03 63 08 03 63 07 00 03 07 00 03 07 00 EC 45 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 06 07 00 66 08 03 63 08 03 63 07 00 03 07 00 03 07 00 EC FF 00 0B 00 03 07 00 03 07 00 84 07 00 55 00 06 07 00 66 08 03 63 08 03 63 07 00 03 07 00 03 07 00 EC FF 00 02 00 03 07 00 03 07 00 84 07 00 55 00 07 07 00 66 08 03 63 08 03 63 07 00 03 07 00 03 07 00 EC 01 FF 00 1D 00 03 07 00 03 07 00 84 07 00 55 00 06 07 00 66 08 03 63 08 03 63 07 00 03 07 00 03 07 00 EC 42 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 06 07 00 66 08 03 63 08 03 63 07 00 03 07 00 03 07 00 EC 45 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 66 07 01 BA 42 07 00 25 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 66 07 01 BA 45 07 00 25 FA 00 00 FF 00 00 00 03 07 00 03 07 00 84 07 00 55 00 01 07 00 84 FF 00 01 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 03 07 00 03 FF 00 01 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 03 07 00 EC FF 00 01 00 02 07 00 03 07 00 84 00 01 07 00 55 FF 00 01 00 03 07 00 03 07 00 84 07 00 55 00 04 07 00 66 08 03 63 08 03 63 07 00 03 FF 00 01 00 03 07 00 03 07 00 84 07 00 55 00 02 07 00 66 07 01 A7 41 07 01 0E 41 07 00 03 FF 00 01 00 03 07 00 03 07 00 84 07 00 55 00 03 07 00 66 08 02 73 08 02 73 FF 00 01 00 03 07 00 03 07 00 84 07 00 55 00 06 07 00 66 08 03 63 08 03 63 07 00 03 07 00 03 07 00 EC FF 00 01 00 03 07 00 03 07 00 84 07 00 55 00 03 07 00 66 08 01 3F 08 01 3F FF 00 01 00 02 07 00 03 07 00 84 00 01 07 00 03 41 07 00 84 FF 00 01 00 03 07 00 03 07 00 84 07 00 55 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 00 84 07 00 55 00 06 07 00 66 08 02 73 08 02 73 07 00 03 07 00 03 07 00 EC FF 00 01 00 02 07 00 03 07 00 84 00 01 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1038   1046   Any
        //  1038   1046   1038   1046   Ljava/lang/ArithmeticException;
        //  1054   1056   3      8      Any
        //  130    137    137    138    Any
        //  131    137    3      8      Ljava/lang/AssertionError;
        //  130    137    130    131    Any
        //  131    137    3      8      Ljava/util/NoSuchElementException;
        //  131    137    130    131    Ljava/util/ConcurrentModificationException;
        //  371    378    378    379    Any
        //  372    378    371    372    Ljava/lang/EnumConstantNotPresentException;
        //  372    378    371    372    Any
        //  371    378    3      8      Any
        //  371    378    3      8      Any
        //  382    389    389    390    Any
        //  382    389    382    383    Any
        //  382    389    389    390    Ljava/lang/ArithmeticException;
        //  383    389    389    390    Any
        //  383    389    382    383    Any
        //  397    404    404    405    Any
        //  398    404    397    398    Any
        //  397    404    404    405    Ljava/lang/IllegalArgumentException;
        //  397    404    3      8      Any
        //  398    404    3      8      Any
        //  418    425    425    426    Any
        //  419    425    425    426    Any
        //  419    425    418    419    Any
        //  418    425    3      8      Any
        //  418    425    3      8      Any
        //  484    493    493    494    Any
        //  484    493    484    485    Any
        //  485    493    3      8      Ljava/lang/ArithmeticException;
        //  485    493    493    494    Any
        //  484    493    3      8      Any
        //  550    557    557    558    Any
        //  551    557    557    558    Any
        //  550    557    557    558    Any
        //  550    557    557    558    Ljava/lang/ClassCastException;
        //  551    557    550    551    Any
        //  561    568    568    569    Any
        //  561    568    568    569    Any
        //  561    568    561    562    Any
        //  562    568    568    569    Any
        //  561    568    561    562    Ljava/lang/NegativeArraySizeException;
        //  732    738    738    739    Any
        //  732    738    738    739    Any
        //  732    738    3      8      Ljava/util/ConcurrentModificationException;
        //  732    738    738    739    Ljava/lang/IllegalArgumentException;
        //  732    738    3      8      Any
        //  742    749    749    750    Any
        //  743    749    3      8      Any
        //  742    749    742    743    Any
        //  742    749    742    743    Ljava/util/ConcurrentModificationException;
        //  743    749    742    743    Ljava/lang/EnumConstantNotPresentException;
        //  800    806    806    807    Any
        //  800    806    3      8      Ljava/lang/NumberFormatException;
        //  800    806    806    807    Ljava/lang/IndexOutOfBoundsException;
        //  800    806    806    807    Any
        //  800    806    3      8      Any
        //  923    930    930    931    Any
        //  923    930    923    924    Any
        //  924    930    923    924    Ljava/lang/NegativeArraySizeException;
        //  924    930    3      8      Ljava/lang/IllegalArgumentException;
        //  924    930    930    931    Ljava/lang/NumberFormatException;
        //  979    986    986    987    Any
        //  979    986    3      8      Ljava/lang/UnsupportedOperationException;
        //  979    986    979    980    Ljava/lang/NullPointerException;
        //  979    986    986    987    Ljava/lang/StringIndexOutOfBoundsException;
        //  980    986    979    980    Any
        //  990    997    997    998    Any
        //  990    997    997    998    Ljava/lang/IllegalStateException;
        //  990    997    3      8      Any
        //  991    997    990    991    Ljava/lang/AssertionError;
        //  991    997    990    991    Ljava/lang/NegativeArraySizeException;
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
    
    public fl(final GuiScreen c) {
        while (true) {
            int n = 0;
            Label_0019: {
                if (fc.1 != 0) {
                    n = -806126990;
                    break Label_0019;
                }
                n = 1383681872;
            }
            switch (n ^ 0xA389542) {
                case -1426264442: {
                    continue;
                }
                default: {
                    final fq c2 = new fq();
                    while (true) {
                        int n2 = 0;
                        Label_0071: {
                            if (fc.1 != 0) {
                                n2 = 1390332667;
                                break Label_0071;
                            }
                            n2 = -1179404929;
                        }
                        switch (n2 ^ 0xC8C4508C) {
                            case -2091048541: {
                                continue;
                            }
                            default: {
                                this.c = c2;
                                this.c = "";
                                this.c = c;
                                this.c = false;
                                final boolean 0 = false;
                                while (true) {
                                    int n3 = 0;
                                    Label_0137: {
                                        if (fc.0 != 0) {
                                            n3 = -1281350137;
                                            break Label_0137;
                                        }
                                        n3 = 962527529;
                                    }
                                    switch (n3 ^ 0x1DA4B9A8) {
                                        case -1375428689: {
                                            continue;
                                        }
                                        case 620476545: {
                                            this.0 = 0;
                                            final Thread thread = new Thread(this::0);
                                            while (true) {
                                                int n4 = 0;
                                                Label_0199: {
                                                    if (fc.1 != 0) {
                                                        n4 = 365504359;
                                                        break Label_0199;
                                                    }
                                                    n4 = 1061194285;
                                                }
                                                switch (n4 ^ 0x6C6ECDD1) {
                                                    case 2041047734: {
                                                        continue;
                                                    }
                                                    case 1395542012: {
                                                        thread.start();
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
                                        default: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case -1709532553: {
                                throw null;
                            }
                        }
                        break;
                    }
                    break;
                }
                case -976490704: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static fm c(final fl p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.0:I
        //     4: ifgt            38
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            30
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fm;
        //    20: areturn        
        //    21: pop            
        //    22: goto            16
        //    25: pop            
        //    26: aconst_null    
        //    27: goto            21
        //    30: dup            
        //    31: ifnull          21
        //    34: checkcast       Ljava/lang/Throwable;
        //    37: athrow         
        //    38: dup            
        //    39: ifnull          25
        //    42: checkcast       Ljava/lang/Throwable;
        //    45: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 25 FC 00 03 07 00 03 44 07 00 25 43 05 44 07 00 25 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     30     38     Any
        //  30     38     30     38     Any
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
    
    public void func_146286_b(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          181
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            173
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            165
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            37
        //    31: ldc_w           794663329
        //    34: goto            40
        //    37: ldc_w           223147911
        //    40: ldc_w           -2126653766
        //    43: ixor           
        //    44: lookupswitch {
        //          -1938742979: 72
        //          -1369420005: 37
        //          default: 154
        //        }
        //    72: iload_1        
        //    73: iload_2        
        //    74: iload_3        
        //    75: goto            79
        //    78: athrow         
        //    79: invokespecial   net/minecraft/client/gui/GuiScreen.func_146286_b:(III)V
        //    82: goto            86
        //    85: athrow         
        //    86: aload_0        
        //    87: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fm;
        //    90: getstatic       dev/nuker/pyro/fc.1:I
        //    93: ifeq            102
        //    96: ldc_w           4216907
        //    99: goto            105
        //   102: ldc_w           1552324638
        //   105: ldc_w           -117266196
        //   108: ixor           
        //   109: lookupswitch {
        //          -1193452472: 102
        //          -113053529: 152
        //          default: 136
        //        }
        //   136: iload_1        
        //   137: iload_2        
        //   138: iload_3        
        //   139: goto            143
        //   142: athrow         
        //   143: invokevirtual   dev/nuker/pyro/fm.func_148181_b:(III)Z
        //   146: goto            150
        //   149: athrow         
        //   150: pop            
        //   151: return         
        //   152: aconst_null    
        //   153: athrow         
        //   154: aconst_null    
        //   155: athrow         
        //   156: pop            
        //   157: goto            24
        //   160: pop            
        //   161: aconst_null    
        //   162: goto            156
        //   165: dup            
        //   166: ifnull          156
        //   169: checkcast       Ljava/lang/Throwable;
        //   172: athrow         
        //   173: dup            
        //   174: ifnull          160
        //   177: checkcast       Ljava/lang/Throwable;
        //   180: athrow         
        //   181: aconst_null    
        //   182: athrow         
        //    StackMapTable: 00 19 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FF 00 03 00 04 07 00 03 01 01 01 00 00 4C 07 00 03 FF 00 02 00 04 07 00 03 01 01 01 00 02 07 00 03 01 5F 07 00 03 45 07 00 25 FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 03 01 01 01 45 07 00 25 00 4F 07 00 38 FF 00 02 00 04 07 00 03 01 01 01 00 02 07 00 38 01 5E 07 00 38 FF 00 05 00 00 00 01 07 00 25 FF 00 00 00 04 07 00 03 01 01 01 00 04 07 00 38 01 01 01 45 07 00 25 40 01 41 07 00 38 41 07 00 03 41 07 00 1E 43 05 44 07 00 1E 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     165    173    Ljava/lang/RuntimeException;
        //  165    173    165    173    Ljava/lang/NegativeArraySizeException;
        //  181    183    3      8      Any
        //  78     85     85     86     Any
        //  78     85     78     79     Ljava/lang/IllegalArgumentException;
        //  78     85     78     79     Any
        //  79     85     78     79     Ljava/lang/UnsupportedOperationException;
        //  79     85     3      8      Any
        //  143    149    149    150    Any
        //  143    149    3      8      Any
        //  143    149    149    150    Any
        //  143    149    149    150    Ljava/lang/ArithmeticException;
        //  143    149    3      8      Ljava/util/ConcurrentModificationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 65 out of bounds for length 65
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
    
    public void func_73863_a(final int p0, final int p1, final float p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          4108
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            4100
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            4092
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            36
        //    30: ldc_w           1422133819
        //    33: goto            39
        //    36: ldc_w           -1365157710
        //    39: ldc_w           -1039853254
        //    42: ixor           
        //    43: lookupswitch {
        //          -1765731583: 36
        //          1822704008: 68
        //          default: 4031
        //        }
        //    68: aload_0        
        //    69: goto            73
        //    72: athrow         
        //    73: invokevirtual   dev/nuker/pyro/fl.func_146276_q_:()V
        //    76: goto            80
        //    79: athrow         
        //    80: aload_0        
        //    81: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fm;
        //    84: getstatic       dev/nuker/pyro/fc.1:I
        //    87: ifeq            96
        //    90: ldc_w           81147685
        //    93: goto            99
        //    96: ldc_w           85965160
        //    99: ldc_w           888148844
        //   102: ixor           
        //   103: lookupswitch {
        //          -633053321: 96
        //          807806025: 4047
        //          default: 128
        //        }
        //   128: iload_1        
        //   129: iload_2        
        //   130: fload_3        
        //   131: goto            135
        //   134: athrow         
        //   135: invokevirtual   dev/nuker/pyro/fm.func_148128_a:(IIF)V
        //   138: goto            142
        //   141: athrow         
        //   142: aload_0        
        //   143: aload_0        
        //   144: getstatic       dev/nuker/pyro/fc.1:I
        //   147: ifeq            156
        //   150: ldc_w           -659121511
        //   153: goto            159
        //   156: ldc_w           -2063106993
        //   159: ldc_w           1854759070
        //   162: ixor           
        //   163: lookupswitch {
        //          -1237583353: 4009
        //          951539780: 156
        //          default: 188
        //        }
        //   188: getfield        dev/nuker/pyro/fl.field_146289_q:Lnet/minecraft/client/gui/FontRenderer;
        //   191: ldc_w           "\u10d5\u1496\ub9fb\u926e\u997c\udef4\ub264\ud5db\uf8d9\ub90f\u942f\u1e59\ud2f0\ue401"
        //   194: goto            198
        //   197: athrow         
        //   198: invokestatic    invokestatic   !!! ERROR
        //   201: goto            205
        //   204: athrow         
        //   205: aload_0        
        //   206: getfield        dev/nuker/pyro/fl.field_146294_l:I
        //   209: iconst_2       
        //   210: idiv           
        //   211: bipush          20
        //   213: ldc_w           16777215
        //   216: goto            220
        //   219: athrow         
        //   220: invokevirtual   dev/nuker/pyro/fl.func_73732_a:(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;III)V
        //   223: goto            227
        //   226: athrow         
        //   227: aload_0        
        //   228: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fp;
        //   231: getfield        dev/nuker/pyro/fp.c:Lnet/minecraft/client/entity/EntityOtherPlayerMP;
        //   234: astore          4
        //   236: aconst_null    
        //   237: astore          5
        //   239: getstatic       dev/nuker/pyro/fc.c:I
        //   242: ifge            251
        //   245: ldc_w           -1608470336
        //   248: goto            254
        //   251: ldc_w           1660619127
        //   254: ldc_w           374963499
        //   257: ixor           
        //   258: lookupswitch {
        //          -1233531413: 251
        //          1956803676: 284
        //          default: 4053
        //        }
        //   284: aload_0        
        //   285: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fm;
        //   288: goto            292
        //   291: athrow         
        //   292: invokevirtual   dev/nuker/pyro/fm.0:()Ldev/nuker/pyro/fn;
        //   295: goto            299
        //   298: athrow         
        //   299: ifnull          482
        //   302: aload_0        
        //   303: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fm;
        //   306: goto            310
        //   309: athrow         
        //   310: invokevirtual   dev/nuker/pyro/fm.0:()Ldev/nuker/pyro/fn;
        //   313: goto            317
        //   316: athrow         
        //   317: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/fp;
        //   320: getstatic       dev/nuker/pyro/fc.c:I
        //   323: ifge            332
        //   326: ldc_w           478321946
        //   329: goto            335
        //   332: ldc_w           1341035859
        //   335: ldc_w           964192838
        //   338: ixor           
        //   339: lookupswitch {
        //          637204316: 332
        //          1989607189: 364
        //          default: 4065
        //        }
        //   364: getfield        dev/nuker/pyro/fp.c:Lnet/minecraft/client/entity/EntityOtherPlayerMP;
        //   367: astore          4
        //   369: aload_0        
        //   370: getstatic       dev/nuker/pyro/fc.c:I
        //   373: ifge            382
        //   376: ldc_w           843980808
        //   379: goto            385
        //   382: ldc_w           1821149304
        //   385: ldc_w           -1928166205
        //   388: ixor           
        //   389: lookupswitch {
        //          -1084447541: 382
        //          -509735749: 416
        //          default: 4039
        //        }
        //   416: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fm;
        //   419: goto            423
        //   422: athrow         
        //   423: invokevirtual   dev/nuker/pyro/fm.0:()Ldev/nuker/pyro/fn;
        //   426: goto            430
        //   429: athrow         
        //   430: getfield        dev/nuker/pyro/fn.c:Ldev/nuker/pyro/alt/Alt;
        //   433: getstatic       dev/nuker/pyro/fc.c:I
        //   436: ifge            445
        //   439: ldc_w           -830221503
        //   442: goto            448
        //   445: ldc_w           -2106546196
        //   448: ldc_w           1229393522
        //   451: ixor           
        //   452: lookupswitch {
        //          -2017141453: 445
        //          -885544546: 480
        //          default: 4061
        //        }
        //   480: astore          5
        //   482: getstatic       dev/nuker/pyro/fc.c:I
        //   485: ifge            494
        //   488: ldc_w           -1413776953
        //   491: goto            497
        //   494: ldc_w           508835161
        //   497: ldc_w           928934574
        //   500: ixor           
        //   501: lookupswitch {
        //          -2041900067: 494
        //          -1662708887: 3995
        //          default: 528
        //        }
        //   528: aload_0        
        //   529: getfield        dev/nuker/pyro/fl.field_146294_l:I
        //   532: iconst_4       
        //   533: idiv           
        //   534: iconst_3       
        //   535: imul           
        //   536: aload_0        
        //   537: getstatic       dev/nuker/pyro/fc.0:I
        //   540: ifeq            549
        //   543: ldc_w           -788358557
        //   546: goto            552
        //   549: ldc_w           1303743656
        //   552: ldc_w           1960257071
        //   555: ixor           
        //   556: lookupswitch {
        //          -1512719284: 549
        //          962767495: 584
        //          default: 4003
        //        }
        //   584: getfield        dev/nuker/pyro/fl.field_146294_l:I
        //   587: bipush          8
        //   589: idiv           
        //   590: iadd           
        //   591: getstatic       dev/nuker/pyro/fc.0:I
        //   594: ifeq            603
        //   597: ldc_w           1815608473
        //   600: goto            606
        //   603: ldc_w           -298340559
        //   606: ldc_w           -358034957
        //   609: ixor           
        //   610: lookupswitch {
        //          -2036388502: 603
        //          77561538: 636
        //          default: 3979
        //        }
        //   636: istore          6
        //   638: aload_0        
        //   639: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fq;
        //   642: iload           6
        //   644: aload_0        
        //   645: getfield        dev/nuker/pyro/fl.field_146295_m:I
        //   648: bipush          95
        //   650: isub           
        //   651: aload_0        
        //   652: getfield        dev/nuker/pyro/fl.field_146295_m:I
        //   655: bipush          20
        //   657: idiv           
        //   658: isub           
        //   659: aload_0        
        //   660: getstatic       dev/nuker/pyro/fc.0:I
        //   663: ifeq            672
        //   666: ldc_w           1275089725
        //   669: goto            675
        //   672: ldc_w           -599247277
        //   675: ldc_w           -2036050997
        //   678: ixor           
        //   679: lookupswitch {
        //          -895221514: 4049
        //          1493677819: 672
        //          default: 704
        //        }
        //   704: getfield        dev/nuker/pyro/fl.field_146295_m:I
        //   707: i2d            
        //   708: ldc2_w          4.6
        //   711: ddiv           
        //   712: d2i            
        //   713: aload           4
        //   715: goto            719
        //   718: athrow         
        //   719: invokevirtual   dev/nuker/pyro/fq.c:(IIILnet/minecraft/entity/player/EntityPlayer;)V
        //   722: goto            726
        //   725: athrow         
        //   726: getstatic       dev/nuker/pyro/fc.1:I
        //   729: ifeq            738
        //   732: ldc_w           1173906150
        //   735: goto            741
        //   738: ldc_w           -1894668715
        //   741: ldc_w           663409577
        //   744: ixor           
        //   745: lookupswitch {
        //          -1309236421: 738
        //          1651683663: 4051
        //          default: 772
        //        }
        //   772: aload           4
        //   774: goto            778
        //   777: athrow         
        //   778: invokevirtual   net/minecraft/client/entity/AbstractClientPlayer.func_146103_bH:()Lcom/mojang/authlib/GameProfile;
        //   781: goto            785
        //   784: athrow         
        //   785: goto            789
        //   788: athrow         
        //   789: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //   792: goto            796
        //   795: athrow         
        //   796: astore          7
        //   798: getstatic       dev/nuker/pyro/fc.1:I
        //   801: ifeq            810
        //   804: ldc_w           -1376955319
        //   807: goto            813
        //   810: ldc_w           1831238051
        //   813: ldc_w           901356788
        //   816: ixor           
        //   817: lookupswitch {
        //          -1739274051: 3991
        //          3415457: 810
        //          default: 844
        //        }
        //   844: aload           4
        //   846: getstatic       dev/nuker/pyro/fc.0:I
        //   849: ifeq            858
        //   852: ldc_w           -851640658
        //   855: goto            861
        //   858: ldc_w           -899087873
        //   861: ldc_w           481258166
        //   864: ixor           
        //   865: lookupswitch {
        //          -778857448: 858
        //          -691639479: 892
        //          default: 3999
        //        }
        //   892: aload_0        
        //   893: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fp;
        //   896: getstatic       dev/nuker/pyro/fc.0:I
        //   899: ifeq            908
        //   902: ldc_w           -822555151
        //   905: goto            911
        //   908: ldc_w           839197683
        //   911: ldc_w           1501563051
        //   914: ixor           
        //   915: lookupswitch {
        //          -1838724905: 908
        //          -1753692838: 4027
        //          default: 940
        //        }
        //   940: getfield        dev/nuker/pyro/fp.c:Lnet/minecraft/client/entity/EntityOtherPlayerMP;
        //   943: if_acmpeq       1348
        //   946: aload           5
        //   948: goto            952
        //   951: athrow         
        //   952: invokevirtual   dev/nuker/pyro/alt/Alt.isCracked:()Z
        //   955: goto            959
        //   958: athrow         
        //   959: ifeq            1139
        //   962: aload           5
        //   964: goto            968
        //   967: athrow         
        //   968: invokevirtual   dev/nuker/pyro/alt/Alt.getGameProfile:()Lcom/mojang/authlib/GameProfile;
        //   971: goto            975
        //   974: athrow         
        //   975: goto            979
        //   978: athrow         
        //   979: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //   982: goto            986
        //   985: athrow         
        //   986: getstatic       dev/nuker/pyro/fc.0:I
        //   989: ifeq            998
        //   992: ldc_w           1187202979
        //   995: goto            1001
        //   998: ldc_w           261004756
        //  1001: ldc_w           -1098454652
        //  1004: ixor           
        //  1005: lookupswitch {
        //          -1324846000: 1032
        //          -129651161: 998
        //          default: 3983
        //        }
        //  1032: goto            1036
        //  1035: athrow         
        //  1036: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //  1039: goto            1043
        //  1042: athrow         
        //  1043: goto            1047
        //  1046: athrow         
        //  1047: invokevirtual   net/minecraft/client/Minecraft.func_110432_I:()Lnet/minecraft/util/Session;
        //  1050: goto            1054
        //  1053: athrow         
        //  1054: getstatic       dev/nuker/pyro/fc.1:I
        //  1057: ifeq            1066
        //  1060: ldc_w           -575724823
        //  1063: goto            1069
        //  1066: ldc_w           630977764
        //  1069: ldc_w           709146881
        //  1072: ixor           
        //  1073: lookupswitch {
        //          -135554072: 1066
        //          266292709: 1100
        //          default: 3989
        //        }
        //  1100: goto            1104
        //  1103: athrow         
        //  1104: invokevirtual   net/minecraft/util/Session.func_148256_e:()Lcom/mojang/authlib/GameProfile;
        //  1107: goto            1111
        //  1110: athrow         
        //  1111: goto            1115
        //  1114: athrow         
        //  1115: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //  1118: goto            1122
        //  1121: athrow         
        //  1122: goto            1126
        //  1125: athrow         
        //  1126: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1129: goto            1133
        //  1132: athrow         
        //  1133: ifeq            2193
        //  1136: goto            1348
        //  1139: getstatic       dev/nuker/pyro/fc.1:I
        //  1142: ifeq            1151
        //  1145: ldc_w           -739578014
        //  1148: goto            1154
        //  1151: ldc_w           275583067
        //  1154: ldc_w           708340315
        //  1157: ixor           
        //  1158: lookupswitch {
        //          -540982572: 1151
        //          -103643847: 4005
        //          default: 1184
        //        }
        //  1184: aload           5
        //  1186: goto            1190
        //  1189: athrow         
        //  1190: invokevirtual   dev/nuker/pyro/alt/Alt.getGameProfile:()Lcom/mojang/authlib/GameProfile;
        //  1193: goto            1197
        //  1196: athrow         
        //  1197: goto            1201
        //  1200: athrow         
        //  1201: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //  1204: goto            1208
        //  1207: athrow         
        //  1208: goto            1212
        //  1211: athrow         
        //  1212: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //  1215: goto            1219
        //  1218: athrow         
        //  1219: getstatic       dev/nuker/pyro/fc.c:I
        //  1222: ifge            1231
        //  1225: ldc_w           -678473911
        //  1228: goto            1234
        //  1231: ldc_w           -547331294
        //  1234: ldc_w           2093135644
        //  1237: ixor           
        //  1238: lookupswitch {
        //          -1549609922: 1264
        //          -1420953515: 1231
        //          default: 4011
        //        }
        //  1264: goto            1268
        //  1267: athrow         
        //  1268: invokevirtual   net/minecraft/client/Minecraft.func_110432_I:()Lnet/minecraft/util/Session;
        //  1271: goto            1275
        //  1274: athrow         
        //  1275: goto            1279
        //  1278: athrow         
        //  1279: invokevirtual   net/minecraft/util/Session.func_148256_e:()Lcom/mojang/authlib/GameProfile;
        //  1282: goto            1286
        //  1285: athrow         
        //  1286: goto            1290
        //  1289: athrow         
        //  1290: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //  1293: goto            1297
        //  1296: athrow         
        //  1297: goto            1301
        //  1300: athrow         
        //  1301: invokevirtual   java/util/UUID.equals:(Ljava/lang/Object;)Z
        //  1304: goto            1308
        //  1307: athrow         
        //  1308: ifeq            1317
        //  1311: ldc_w           1114768863
        //  1314: goto            1320
        //  1317: ldc_w           1114768848
        //  1320: ldc_w           464058744
        //  1323: ixor           
        //  1324: tableswitch {
        //          -1279919794: 1348
        //          -1279919793: 2193
        //          default: 1311
        //        }
        //  1348: getstatic       dev/nuker/pyro/fc.0:I
        //  1351: ifeq            1360
        //  1354: ldc_w           -1368107720
        //  1357: goto            1363
        //  1360: ldc_w           -1495583122
        //  1363: ldc_w           -257659940
        //  1366: ixor           
        //  1367: lookupswitch {
        //          1590705892: 3985
        //          1671368237: 1360
        //          default: 1392
        //        }
        //  1392: goto            1396
        //  1395: athrow         
        //  1396: invokestatic    dev/nuker/pyro/alt/AltLogic.isOffline:()Z
        //  1399: goto            1403
        //  1402: athrow         
        //  1403: ifeq            1566
        //  1406: new             Ljava/lang/StringBuilder;
        //  1409: dup            
        //  1410: goto            1414
        //  1413: athrow         
        //  1414: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1417: goto            1421
        //  1420: athrow         
        //  1421: getstatic       dev/nuker/pyro/fc.0:I
        //  1424: ifeq            1433
        //  1427: ldc_w           -1312763782
        //  1430: goto            1436
        //  1433: ldc_w           -482353147
        //  1436: ldc_w           -198823526
        //  1439: ixor           
        //  1440: lookupswitch {
        //          630613165: 1433
        //          1172759008: 4023
        //          default: 1468
        //        }
        //  1468: getstatic       net/minecraft/util/text/TextFormatting.RED:Lnet/minecraft/util/text/TextFormatting;
        //  1471: getstatic       dev/nuker/pyro/fc.1:I
        //  1474: ifeq            1483
        //  1477: ldc_w           1202033318
        //  1480: goto            1486
        //  1483: ldc_w           -601405411
        //  1486: ldc_w           -1334495346
        //  1489: ixor           
        //  1490: lookupswitch {
        //          -137321176: 1483
        //          1817345939: 1516
        //          default: 4055
        //        }
        //  1516: goto            1520
        //  1519: athrow         
        //  1520: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1523: goto            1527
        //  1526: athrow         
        //  1527: ldc_w           "\u10c5\u1481\ub9f6\u9268\u9974\udee5\ub220"
        //  1530: goto            1534
        //  1533: athrow         
        //  1534: invokestatic    invokestatic   !!! ERROR
        //  1537: goto            1541
        //  1540: athrow         
        //  1541: goto            1545
        //  1544: athrow         
        //  1545: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1548: goto            1552
        //  1551: athrow         
        //  1552: goto            1556
        //  1555: athrow         
        //  1556: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1559: goto            1563
        //  1562: athrow         
        //  1563: goto            2526
        //  1566: aload_0        
        //  1567: getstatic       dev/nuker/pyro/fc.1:I
        //  1570: ifeq            1579
        //  1573: ldc_w           -1433749299
        //  1576: goto            1582
        //  1579: ldc_w           913010278
        //  1582: ldc_w           -723539384
        //  1585: ixor           
        //  1586: lookupswitch {
        //          -491469778: 1612
        //          2119504517: 1579
        //          default: 4013
        //        }
        //  1612: getfield        dev/nuker/pyro/fl.0:Z
        //  1615: ifeq            2034
        //  1618: aload_0        
        //  1619: getstatic       dev/nuker/pyro/fc.1:I
        //  1622: ifeq            1631
        //  1625: ldc_w           -2063257851
        //  1628: goto            1634
        //  1631: ldc_w           1280593448
        //  1634: ldc_w           -1056524727
        //  1637: ixor           
        //  1638: lookupswitch {
        //          951637160: 1631
        //          1141086540: 4069
        //          default: 1664
        //        }
        //  1664: getfield        dev/nuker/pyro/fl.c:Z
        //  1667: ifeq            1829
        //  1670: new             Ljava/lang/StringBuilder;
        //  1673: dup            
        //  1674: goto            1678
        //  1677: athrow         
        //  1678: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1681: goto            1685
        //  1684: athrow         
        //  1685: getstatic       dev/nuker/pyro/fc.1:I
        //  1688: ifeq            1697
        //  1691: ldc_w           -1991291731
        //  1694: goto            1700
        //  1697: ldc_w           1397047882
        //  1700: ldc_w           -114374444
        //  1703: ixor           
        //  1704: lookupswitch {
        //          -391594925: 1697
        //          1885439097: 3975
        //          default: 1732
        //        }
        //  1732: getstatic       net/minecraft/util/text/TextFormatting.GREEN:Lnet/minecraft/util/text/TextFormatting;
        //  1735: goto            1739
        //  1738: athrow         
        //  1739: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1742: goto            1746
        //  1745: athrow         
        //  1746: ldc_w           "\u10d6\u1481\ub9f2\u9266\u9976\udef5\ub229"
        //  1749: goto            1753
        //  1752: athrow         
        //  1753: invokestatic    invokestatic   !!! ERROR
        //  1756: goto            1760
        //  1759: athrow         
        //  1760: getstatic       dev/nuker/pyro/fc.c:I
        //  1763: ifge            1772
        //  1766: ldc_w           -1412402720
        //  1769: goto            1775
        //  1772: ldc_w           -980525695
        //  1775: ldc_w           1081311652
        //  1778: ixor           
        //  1779: lookupswitch {
        //          -2046960603: 1804
        //          -341577660: 1772
        //          default: 3977
        //        }
        //  1804: goto            1808
        //  1807: athrow         
        //  1808: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1811: goto            1815
        //  1814: athrow         
        //  1815: goto            1819
        //  1818: athrow         
        //  1819: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1822: goto            1826
        //  1825: athrow         
        //  1826: goto            2526
        //  1829: new             Ljava/lang/StringBuilder;
        //  1832: dup            
        //  1833: goto            1837
        //  1836: athrow         
        //  1837: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1840: goto            1844
        //  1843: athrow         
        //  1844: getstatic       net/minecraft/util/text/TextFormatting.YELLOW:Lnet/minecraft/util/text/TextFormatting;
        //  1847: goto            1851
        //  1850: athrow         
        //  1851: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1854: goto            1858
        //  1857: athrow         
        //  1858: ldc_w           "\u10cf\u149d\ub9e1\u926a\u9973\udee9\ub220\ud59a\uf8e9\ub909\u9433\u1e5f\ud2f7\ue41a\ud185"
        //  1861: getstatic       dev/nuker/pyro/fc.0:I
        //  1864: ifeq            1873
        //  1867: ldc_w           495312446
        //  1870: goto            1876
        //  1873: ldc_w           1113385352
        //  1876: ldc_w           1162471064
        //  1879: ixor           
        //  1880: lookupswitch {
        //          118820624: 1908
        //          1489778854: 1873
        //          default: 4007
        //        }
        //  1908: goto            1912
        //  1911: athrow         
        //  1912: invokestatic    invokestatic   !!! ERROR
        //  1915: goto            1919
        //  1918: athrow         
        //  1919: getstatic       dev/nuker/pyro/fc.0:I
        //  1922: ifeq            1931
        //  1925: ldc_w           -1786815262
        //  1928: goto            1934
        //  1931: ldc_w           -290163070
        //  1934: ldc_w           -1946408634
        //  1937: ixor           
        //  1938: lookupswitch {
        //          -1699408138: 1931
        //          511931812: 4025
        //          default: 1964
        //        }
        //  1964: goto            1968
        //  1967: athrow         
        //  1968: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1971: goto            1975
        //  1974: athrow         
        //  1975: getstatic       dev/nuker/pyro/fc.c:I
        //  1978: ifge            1987
        //  1981: ldc_w           -1333048160
        //  1984: goto            1990
        //  1987: ldc_w           -1427078319
        //  1990: ldc_w           -1451807306
        //  1993: ixor           
        //  1994: lookupswitch {
        //          59223783: 2020
        //          435970326: 1987
        //          default: 4035
        //        }
        //  2020: goto            2024
        //  2023: athrow         
        //  2024: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2027: goto            2031
        //  2030: athrow         
        //  2031: goto            2526
        //  2034: new             Ljava/lang/StringBuilder;
        //  2037: dup            
        //  2038: getstatic       dev/nuker/pyro/fc.1:I
        //  2041: ifeq            2050
        //  2044: ldc_w           -1723688649
        //  2047: goto            2053
        //  2050: ldc_w           2071336713
        //  2053: ldc_w           451304813
        //  2056: ixor           
        //  2057: lookupswitch {
        //          -2086353830: 2050
        //          1636846180: 2084
        //          default: 4015
        //        }
        //  2084: goto            2088
        //  2087: athrow         
        //  2088: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2091: goto            2095
        //  2094: athrow         
        //  2095: getstatic       net/minecraft/util/text/TextFormatting.GRAY:Lnet/minecraft/util/text/TextFormatting;
        //  2098: goto            2102
        //  2101: athrow         
        //  2102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2105: goto            2109
        //  2108: athrow         
        //  2109: ldc_w           "\u10d3\u149d\ub9fc\u9265\u9970\udef7\ub22a\ud59a\uf8e9\ub918\u9421\u1e58\ud2eb\ue406"
        //  2112: goto            2116
        //  2115: athrow         
        //  2116: invokestatic    invokestatic   !!! ERROR
        //  2119: goto            2123
        //  2122: athrow         
        //  2123: getstatic       dev/nuker/pyro/fc.c:I
        //  2126: ifge            2135
        //  2129: ldc_w           -861525841
        //  2132: goto            2138
        //  2135: ldc_w           -609149238
        //  2138: ldc_w           -159958118
        //  2141: ixor           
        //  2142: lookupswitch {
        //          -662551923: 2135
        //          986780469: 4071
        //          default: 2168
        //        }
        //  2168: goto            2172
        //  2171: athrow         
        //  2172: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2175: goto            2179
        //  2178: athrow         
        //  2179: goto            2183
        //  2182: athrow         
        //  2183: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2186: goto            2190
        //  2189: athrow         
        //  2190: goto            2526
        //  2193: aload           5
        //  2195: goto            2199
        //  2198: athrow         
        //  2199: invokevirtual   dev/nuker/pyro/alt/Alt.isCracked:()Z
        //  2202: goto            2206
        //  2205: athrow         
        //  2206: ifeq            2369
        //  2209: new             Ljava/lang/StringBuilder;
        //  2212: dup            
        //  2213: goto            2217
        //  2216: athrow         
        //  2217: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2220: goto            2224
        //  2223: athrow         
        //  2224: getstatic       net/minecraft/util/text/TextFormatting.RED:Lnet/minecraft/util/text/TextFormatting;
        //  2227: goto            2231
        //  2230: athrow         
        //  2231: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2234: goto            2238
        //  2237: athrow         
        //  2238: ldc_w           "\u10c5\u1481\ub9f6\u9268\u9974\udee5\ub220"
        //  2241: getstatic       dev/nuker/pyro/fc.0:I
        //  2244: ifeq            2253
        //  2247: ldc_w           -876411098
        //  2250: goto            2256
        //  2253: ldc_w           846468689
        //  2256: ldc_w           1012551060
        //  2259: ixor           
        //  2260: lookupswitch {
        //          -1813770401: 2253
        //          -140948814: 4067
        //          default: 2288
        //        }
        //  2288: goto            2292
        //  2291: athrow         
        //  2292: invokestatic    invokestatic   !!! ERROR
        //  2295: goto            2299
        //  2298: athrow         
        //  2299: getstatic       dev/nuker/pyro/fc.0:I
        //  2302: ifeq            2311
        //  2305: ldc_w           -2015415188
        //  2308: goto            2314
        //  2311: ldc_w           -390060758
        //  2314: ldc_w           -1610370471
        //  2317: ixor           
        //  2318: lookupswitch {
        //          -942368147: 2311
        //          668763701: 4041
        //          default: 2344
        //        }
        //  2344: goto            2348
        //  2347: athrow         
        //  2348: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2351: goto            2355
        //  2354: athrow         
        //  2355: goto            2359
        //  2358: athrow         
        //  2359: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2362: goto            2366
        //  2365: athrow         
        //  2366: goto            2526
        //  2369: new             Ljava/lang/StringBuilder;
        //  2372: dup            
        //  2373: goto            2377
        //  2376: athrow         
        //  2377: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2380: goto            2384
        //  2383: athrow         
        //  2384: getstatic       net/minecraft/util/text/TextFormatting.GREEN:Lnet/minecraft/util/text/TextFormatting;
        //  2387: getstatic       dev/nuker/pyro/fc.0:I
        //  2390: ifeq            2399
        //  2393: ldc_w           -797126620
        //  2396: goto            2402
        //  2399: ldc_w           1633322300
        //  2402: ldc_w           1235686287
        //  2405: ixor           
        //  2406: lookupswitch {
        //          -1713650773: 2399
        //          687707827: 2432
        //          default: 4017
        //        }
        //  2432: goto            2436
        //  2435: athrow         
        //  2436: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2439: goto            2443
        //  2442: athrow         
        //  2443: ldc_w           "\u10c7\u1486\ub9e3\u9263\u997a\udeee\ub230\ud5d3\uf8d9\ub90d\u9434\u1e49\ud2fa"
        //  2446: goto            2450
        //  2449: athrow         
        //  2450: invokestatic    invokestatic   !!! ERROR
        //  2453: goto            2457
        //  2456: athrow         
        //  2457: getstatic       dev/nuker/pyro/fc.c:I
        //  2460: ifge            2469
        //  2463: ldc_w           -322065006
        //  2466: goto            2472
        //  2469: ldc_w           -496321124
        //  2472: ldc_w           2143568056
        //  2475: ixor           
        //  2476: lookupswitch {
        //          -1828066006: 2469
        //          -1649476316: 2504
        //          default: 4001
        //        }
        //  2504: goto            2508
        //  2507: athrow         
        //  2508: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2511: goto            2515
        //  2514: athrow         
        //  2515: goto            2519
        //  2518: athrow         
        //  2519: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2522: goto            2526
        //  2525: athrow         
        //  2526: astore          8
        //  2528: aload           4
        //  2530: aload_0        
        //  2531: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fp;
        //  2534: getfield        dev/nuker/pyro/fp.c:Lnet/minecraft/client/entity/EntityOtherPlayerMP;
        //  2537: if_acmpeq       2546
        //  2540: ldc_w           1957939935
        //  2543: goto            2549
        //  2546: ldc_w           1957939932
        //  2549: ldc_w           -1003013458
        //  2552: ixor           
        //  2553: tableswitch {
        //          1628037346: 2576
        //          1628037347: 2986
        //          default: 2540
        //        }
        //  2576: getstatic       dev/nuker/pyro/fc.1:I
        //  2579: ifeq            2588
        //  2582: ldc_w           -18442581
        //  2585: goto            2591
        //  2588: ldc_w           1740040885
        //  2591: ldc_w           -208666464
        //  2594: ixor           
        //  2595: lookupswitch {
        //          -1809389035: 2620
        //          225875467: 2588
        //          default: 4079
        //        }
        //  2620: aload           5
        //  2622: goto            2626
        //  2625: athrow         
        //  2626: invokevirtual   dev/nuker/pyro/alt/Alt.isCracked:()Z
        //  2629: goto            2633
        //  2632: athrow         
        //  2633: ifeq            2859
        //  2636: getstatic       dev/nuker/pyro/fc.c:I
        //  2639: ifge            2648
        //  2642: ldc_w           -1605092018
        //  2645: goto            2651
        //  2648: ldc_w           -25819570
        //  2651: ldc_w           469810722
        //  2654: ixor           
        //  2655: lookupswitch {
        //          -1135312020: 4033
        //          1434852295: 2648
        //          default: 2680
        //        }
        //  2680: aload           5
        //  2682: goto            2686
        //  2685: athrow         
        //  2686: invokevirtual   dev/nuker/pyro/alt/Alt.getGameProfile:()Lcom/mojang/authlib/GameProfile;
        //  2689: goto            2693
        //  2692: athrow         
        //  2693: getstatic       dev/nuker/pyro/fc.0:I
        //  2696: ifeq            2705
        //  2699: ldc_w           -911535738
        //  2702: goto            2708
        //  2705: ldc_w           2142123604
        //  2708: ldc_w           -1205050113
        //  2711: ixor           
        //  2712: lookupswitch {
        //          -1083629338: 2705
        //          1904702841: 4081
        //          default: 2740
        //        }
        //  2740: goto            2744
        //  2743: athrow         
        //  2744: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //  2747: goto            2751
        //  2750: athrow         
        //  2751: goto            2755
        //  2754: athrow         
        //  2755: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //  2758: goto            2762
        //  2761: athrow         
        //  2762: goto            2766
        //  2765: athrow         
        //  2766: invokevirtual   net/minecraft/client/Minecraft.func_110432_I:()Lnet/minecraft/util/Session;
        //  2769: goto            2773
        //  2772: athrow         
        //  2773: getstatic       dev/nuker/pyro/fc.1:I
        //  2776: ifeq            2785
        //  2779: ldc_w           449594889
        //  2782: goto            2788
        //  2785: ldc_w           1377360295
        //  2788: ldc_w           2100128002
        //  2791: ixor           
        //  2792: lookupswitch {
        //          1364768319: 2785
        //          1742810891: 4043
        //          default: 2820
        //        }
        //  2820: goto            2824
        //  2823: athrow         
        //  2824: invokevirtual   net/minecraft/util/Session.func_148256_e:()Lcom/mojang/authlib/GameProfile;
        //  2827: goto            2831
        //  2830: athrow         
        //  2831: goto            2835
        //  2834: athrow         
        //  2835: invokevirtual   com/mojang/authlib/GameProfile.getName:()Ljava/lang/String;
        //  2838: goto            2842
        //  2841: athrow         
        //  2842: goto            2846
        //  2845: athrow         
        //  2846: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2849: goto            2853
        //  2852: athrow         
        //  2853: ifeq            3145
        //  2856: goto            2986
        //  2859: aload           5
        //  2861: goto            2865
        //  2864: athrow         
        //  2865: invokevirtual   dev/nuker/pyro/alt/Alt.getGameProfile:()Lcom/mojang/authlib/GameProfile;
        //  2868: goto            2872
        //  2871: athrow         
        //  2872: goto            2876
        //  2875: athrow         
        //  2876: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //  2879: goto            2883
        //  2882: athrow         
        //  2883: goto            2887
        //  2886: athrow         
        //  2887: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //  2890: goto            2894
        //  2893: athrow         
        //  2894: goto            2898
        //  2897: athrow         
        //  2898: invokevirtual   net/minecraft/client/Minecraft.func_110432_I:()Lnet/minecraft/util/Session;
        //  2901: goto            2905
        //  2904: athrow         
        //  2905: goto            2909
        //  2908: athrow         
        //  2909: invokevirtual   net/minecraft/util/Session.func_148256_e:()Lcom/mojang/authlib/GameProfile;
        //  2912: goto            2916
        //  2915: athrow         
        //  2916: goto            2920
        //  2919: athrow         
        //  2920: invokevirtual   com/mojang/authlib/GameProfile.getId:()Ljava/util/UUID;
        //  2923: goto            2927
        //  2926: athrow         
        //  2927: getstatic       dev/nuker/pyro/fc.c:I
        //  2930: ifge            2939
        //  2933: ldc_w           -1590684795
        //  2936: goto            2942
        //  2939: ldc_w           -1399900537
        //  2942: ldc_w           284583931
        //  2945: ixor           
        //  2946: lookupswitch {
        //          -1312394114: 2939
        //          -1132899972: 2972
        //          default: 3993
        //        }
        //  2972: goto            2976
        //  2975: athrow         
        //  2976: invokevirtual   java/util/UUID.equals:(Ljava/lang/Object;)Z
        //  2979: goto            2983
        //  2982: athrow         
        //  2983: ifeq            3145
        //  2986: new             Ljava/lang/StringBuilder;
        //  2989: dup            
        //  2990: getstatic       dev/nuker/pyro/fc.0:I
        //  2993: ifeq            3002
        //  2996: ldc_w           1991564940
        //  2999: goto            3005
        //  3002: ldc_w           500606514
        //  3005: ldc_w           -1140895184
        //  3008: ixor           
        //  3009: lookupswitch {
        //          -1507199998: 3036
        //          -850686788: 3002
        //          default: 4019
        //        }
        //  3036: goto            3040
        //  3039: athrow         
        //  3040: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3043: goto            3047
        //  3046: athrow         
        //  3047: getstatic       dev/nuker/pyro/fc.0:I
        //  3050: ifeq            3059
        //  3053: ldc_w           1587667954
        //  3056: goto            3062
        //  3059: ldc_w           -1874885240
        //  3062: ldc_w           -396391303
        //  3065: ixor           
        //  3066: lookupswitch {
        //          -1224839285: 3059
        //          2019559921: 3092
        //          default: 3987
        //        }
        //  3092: getstatic       net/minecraft/util/text/TextFormatting.BLUE:Lnet/minecraft/util/text/TextFormatting;
        //  3095: goto            3099
        //  3098: athrow         
        //  3099: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3102: goto            3106
        //  3105: athrow         
        //  3106: ldc_w           "\u10cf\u149d\ub9b7\u925e\u996c\udee5"
        //  3109: goto            3113
        //  3112: athrow         
        //  3113: invokestatic    invokestatic   !!! ERROR
        //  3116: goto            3120
        //  3119: athrow         
        //  3120: goto            3124
        //  3123: athrow         
        //  3124: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3127: goto            3131
        //  3130: athrow         
        //  3131: goto            3135
        //  3134: athrow         
        //  3135: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3138: goto            3142
        //  3141: athrow         
        //  3142: goto            3148
        //  3145: ldc_w           ""
        //  3148: getstatic       dev/nuker/pyro/fc.c:I
        //  3151: ifge            3160
        //  3154: ldc_w           1824983560
        //  3157: goto            3163
        //  3160: ldc_w           1089124649
        //  3163: ldc_w           -1641506393
        //  3166: ixor           
        //  3167: lookupswitch {
        //          -557703026: 3192
        //          -219180113: 3160
        //          default: 4063
        //        }
        //  3192: astore          9
        //  3194: aload_0        
        //  3195: getfield        dev/nuker/pyro/fl.field_146289_q:Lnet/minecraft/client/gui/FontRenderer;
        //  3198: aload           7
        //  3200: goto            3204
        //  3203: athrow         
        //  3204: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78256_a:(Ljava/lang/String;)I
        //  3207: goto            3211
        //  3210: athrow         
        //  3211: istore          10
        //  3213: aload_0        
        //  3214: getfield        dev/nuker/pyro/fl.field_146289_q:Lnet/minecraft/client/gui/FontRenderer;
        //  3217: aload           8
        //  3219: goto            3223
        //  3222: athrow         
        //  3223: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78256_a:(Ljava/lang/String;)I
        //  3226: goto            3230
        //  3229: athrow         
        //  3230: istore          11
        //  3232: aload_0        
        //  3233: getfield        dev/nuker/pyro/fl.field_146289_q:Lnet/minecraft/client/gui/FontRenderer;
        //  3236: aload           9
        //  3238: goto            3242
        //  3241: athrow         
        //  3242: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78256_a:(Ljava/lang/String;)I
        //  3245: goto            3249
        //  3248: athrow         
        //  3249: istore          12
        //  3251: aload_0        
        //  3252: getfield        dev/nuker/pyro/fl.field_146289_q:Lnet/minecraft/client/gui/FontRenderer;
        //  3255: aload           7
        //  3257: iload           6
        //  3259: iload           10
        //  3261: iconst_2       
        //  3262: idiv           
        //  3263: isub           
        //  3264: aload_0        
        //  3265: getstatic       dev/nuker/pyro/fc.c:I
        //  3268: ifge            3277
        //  3271: ldc_w           -1049251144
        //  3274: goto            3280
        //  3277: ldc_w           196026733
        //  3280: ldc_w           -1802517206
        //  3283: ixor           
        //  3284: lookupswitch {
        //          -1625234361: 3312
        //          1442477970: 3277
        //          default: 3997
        //        }
        //  3312: getfield        dev/nuker/pyro/fl.field_146295_m:I
        //  3315: bipush          90
        //  3317: isub           
        //  3318: iconst_m1      
        //  3319: goto            3323
        //  3322: athrow         
        //  3323: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78276_b:(Ljava/lang/String;III)I
        //  3326: goto            3330
        //  3329: athrow         
        //  3330: pop            
        //  3331: aload_0        
        //  3332: getfield        dev/nuker/pyro/fl.field_146289_q:Lnet/minecraft/client/gui/FontRenderer;
        //  3335: getstatic       dev/nuker/pyro/fc.0:I
        //  3338: ifeq            3347
        //  3341: ldc_w           -1946678959
        //  3344: goto            3350
        //  3347: ldc_w           134092000
        //  3350: ldc_w           229676018
        //  3353: ixor           
        //  3354: lookupswitch {
        //          -2042062173: 4059
        //          622162749: 3347
        //          default: 3380
        //        }
        //  3380: aload           8
        //  3382: iload           6
        //  3384: iload           11
        //  3386: iconst_2       
        //  3387: idiv           
        //  3388: isub           
        //  3389: aload_0        
        //  3390: getfield        dev/nuker/pyro/fl.field_146295_m:I
        //  3393: bipush          90
        //  3395: isub           
        //  3396: aload_0        
        //  3397: getstatic       dev/nuker/pyro/fc.1:I
        //  3400: ifeq            3409
        //  3403: ldc_w           -843842776
        //  3406: goto            3412
        //  3409: ldc_w           -669999233
        //  3412: ldc_w           -502065037
        //  3415: ixor           
        //  3416: lookupswitch {
        //          799073115: 4073
        //          2054072816: 3409
        //          default: 3444
        //        }
        //  3444: getfield        dev/nuker/pyro/fl.field_146289_q:Lnet/minecraft/client/gui/FontRenderer;
        //  3447: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //  3450: iadd           
        //  3451: iconst_1       
        //  3452: iadd           
        //  3453: iconst_m1      
        //  3454: goto            3458
        //  3457: athrow         
        //  3458: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78276_b:(Ljava/lang/String;III)I
        //  3461: goto            3465
        //  3464: athrow         
        //  3465: pop            
        //  3466: getstatic       dev/nuker/pyro/fc.0:I
        //  3469: ifeq            3478
        //  3472: ldc_w           845432512
        //  3475: goto            3481
        //  3478: ldc_w           860683093
        //  3481: ldc_w           -272916978
        //  3484: ixor           
        //  3485: lookupswitch {
        //          -587766437: 3512
        //          -572532530: 3478
        //          default: 4037
        //        }
        //  3512: aload_0        
        //  3513: getfield        dev/nuker/pyro/fl.field_146289_q:Lnet/minecraft/client/gui/FontRenderer;
        //  3516: aload           9
        //  3518: iload           6
        //  3520: iload           12
        //  3522: iconst_2       
        //  3523: idiv           
        //  3524: isub           
        //  3525: aload_0        
        //  3526: getfield        dev/nuker/pyro/fl.field_146295_m:I
        //  3529: bipush          90
        //  3531: isub           
        //  3532: aload_0        
        //  3533: getfield        dev/nuker/pyro/fl.field_146289_q:Lnet/minecraft/client/gui/FontRenderer;
        //  3536: getstatic       dev/nuker/pyro/fc.1:I
        //  3539: ifeq            3548
        //  3542: ldc_w           -1063162130
        //  3545: goto            3551
        //  3548: ldc_w           1384132755
        //  3551: ldc_w           -1130427457
        //  3554: ixor           
        //  3555: lookupswitch {
        //          -742132886: 3548
        //          2084463953: 4045
        //          default: 3580
        //        }
        //  3580: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //  3583: iconst_2       
        //  3584: imul           
        //  3585: iadd           
        //  3586: iconst_2       
        //  3587: iadd           
        //  3588: iconst_m1      
        //  3589: getstatic       dev/nuker/pyro/fc.1:I
        //  3592: ifeq            3601
        //  3595: ldc_w           1244215972
        //  3598: goto            3604
        //  3601: ldc_w           -725860245
        //  3604: ldc_w           1763684056
        //  3607: ixor           
        //  3608: lookupswitch {
        //          -1113329997: 3636
        //          590779516: 3601
        //          default: 4077
        //        }
        //  3636: goto            3640
        //  3639: athrow         
        //  3640: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78276_b:(Ljava/lang/String;III)I
        //  3643: goto            3647
        //  3646: athrow         
        //  3647: pop            
        //  3648: aload_0        
        //  3649: aload_0        
        //  3650: getfield        dev/nuker/pyro/fl.field_146289_q:Lnet/minecraft/client/gui/FontRenderer;
        //  3653: new             Ljava/lang/StringBuilder;
        //  3656: dup            
        //  3657: goto            3661
        //  3660: athrow         
        //  3661: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3664: goto            3668
        //  3667: athrow         
        //  3668: getstatic       net/minecraft/util/text/TextFormatting.DARK_RED:Lnet/minecraft/util/text/TextFormatting;
        //  3671: goto            3675
        //  3674: athrow         
        //  3675: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3678: goto            3682
        //  3681: athrow         
        //  3682: getstatic       dev/nuker/pyro/fc.c:I
        //  3685: ifge            3694
        //  3688: ldc_w           391675731
        //  3691: goto            3697
        //  3694: ldc_w           444451252
        //  3697: ldc_w           1429336798
        //  3700: ixor           
        //  3701: lookupswitch {
        //          1114213773: 3694
        //          1330396010: 3728
        //          default: 3981
        //        }
        //  3728: aload_0        
        //  3729: getfield        dev/nuker/pyro/fl.c:Ljava/lang/String;
        //  3732: getstatic       dev/nuker/pyro/fc.0:I
        //  3735: ifeq            3744
        //  3738: ldc_w           -1972440706
        //  3741: goto            3747
        //  3744: ldc_w           -1121244898
        //  3747: ldc_w           809568760
        //  3750: ixor           
        //  3751: lookupswitch {
        //          -1922424602: 3776
        //          -1171261306: 3744
        //          default: 4029
        //        }
        //  3776: goto            3780
        //  3779: athrow         
        //  3780: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3783: goto            3787
        //  3786: athrow         
        //  3787: getstatic       dev/nuker/pyro/fc.c:I
        //  3790: ifge            3799
        //  3793: ldc_w           1040592063
        //  3796: goto            3802
        //  3799: ldc_w           -583315052
        //  3802: ldc_w           -488960230
        //  3805: ixor           
        //  3806: lookupswitch {
        //          -1004495665: 3799
        //          -589487195: 4057
        //          default: 3832
        //        }
        //  3832: goto            3836
        //  3835: athrow         
        //  3836: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3839: goto            3843
        //  3842: athrow         
        //  3843: aload_0        
        //  3844: getfield        dev/nuker/pyro/fl.field_146294_l:I
        //  3847: iconst_2       
        //  3848: idiv           
        //  3849: aload_0        
        //  3850: getfield        dev/nuker/pyro/fl.field_146295_m:I
        //  3853: bipush          64
        //  3855: isub           
        //  3856: iconst_m1      
        //  3857: goto            3861
        //  3860: athrow         
        //  3861: invokevirtual   dev/nuker/pyro/fl.func_73732_a:(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;III)V
        //  3864: goto            3868
        //  3867: athrow         
        //  3868: getstatic       dev/nuker/pyro/fc.c:I
        //  3871: ifge            3880
        //  3874: ldc_w           -1476899323
        //  3877: goto            3883
        //  3880: ldc_w           -840914108
        //  3883: ldc_w           1918511843
        //  3886: ixor           
        //  3887: lookupswitch {
        //          -710777626: 4075
        //          321784863: 3880
        //          default: 3912
        //        }
        //  3912: aload_0        
        //  3913: getstatic       dev/nuker/pyro/fc.1:I
        //  3916: ifeq            3925
        //  3919: ldc_w           63180101
        //  3922: goto            3928
        //  3925: ldc_w           -1693157229
        //  3928: ldc_w           2127863370
        //  3931: ixor           
        //  3932: lookupswitch {
        //          -634861201: 3925
        //          2098238223: 4021
        //          default: 3960
        //        }
        //  3960: iload_1        
        //  3961: iload_2        
        //  3962: fload_3        
        //  3963: goto            3967
        //  3966: athrow         
        //  3967: invokespecial   net/minecraft/client/gui/GuiScreen.func_73863_a:(IIF)V
        //  3970: goto            3974
        //  3973: athrow         
        //  3974: return         
        //  3975: aconst_null    
        //  3976: athrow         
        //  3977: aconst_null    
        //  3978: athrow         
        //  3979: aconst_null    
        //  3980: athrow         
        //  3981: aconst_null    
        //  3982: athrow         
        //  3983: aconst_null    
        //  3984: athrow         
        //  3985: aconst_null    
        //  3986: athrow         
        //  3987: aconst_null    
        //  3988: athrow         
        //  3989: aconst_null    
        //  3990: athrow         
        //  3991: aconst_null    
        //  3992: athrow         
        //  3993: aconst_null    
        //  3994: athrow         
        //  3995: aconst_null    
        //  3996: athrow         
        //  3997: aconst_null    
        //  3998: athrow         
        //  3999: aconst_null    
        //  4000: athrow         
        //  4001: aconst_null    
        //  4002: athrow         
        //  4003: aconst_null    
        //  4004: athrow         
        //  4005: aconst_null    
        //  4006: athrow         
        //  4007: aconst_null    
        //  4008: athrow         
        //  4009: aconst_null    
        //  4010: athrow         
        //  4011: aconst_null    
        //  4012: athrow         
        //  4013: aconst_null    
        //  4014: athrow         
        //  4015: aconst_null    
        //  4016: athrow         
        //  4017: aconst_null    
        //  4018: athrow         
        //  4019: aconst_null    
        //  4020: athrow         
        //  4021: aconst_null    
        //  4022: athrow         
        //  4023: aconst_null    
        //  4024: athrow         
        //  4025: aconst_null    
        //  4026: athrow         
        //  4027: aconst_null    
        //  4028: athrow         
        //  4029: aconst_null    
        //  4030: athrow         
        //  4031: aconst_null    
        //  4032: athrow         
        //  4033: aconst_null    
        //  4034: athrow         
        //  4035: aconst_null    
        //  4036: athrow         
        //  4037: aconst_null    
        //  4038: athrow         
        //  4039: aconst_null    
        //  4040: athrow         
        //  4041: aconst_null    
        //  4042: athrow         
        //  4043: aconst_null    
        //  4044: athrow         
        //  4045: aconst_null    
        //  4046: athrow         
        //  4047: aconst_null    
        //  4048: athrow         
        //  4049: aconst_null    
        //  4050: athrow         
        //  4051: aconst_null    
        //  4052: athrow         
        //  4053: aconst_null    
        //  4054: athrow         
        //  4055: aconst_null    
        //  4056: athrow         
        //  4057: aconst_null    
        //  4058: athrow         
        //  4059: aconst_null    
        //  4060: athrow         
        //  4061: aconst_null    
        //  4062: athrow         
        //  4063: aconst_null    
        //  4064: athrow         
        //  4065: aconst_null    
        //  4066: athrow         
        //  4067: aconst_null    
        //  4068: athrow         
        //  4069: aconst_null    
        //  4070: athrow         
        //  4071: aconst_null    
        //  4072: athrow         
        //  4073: aconst_null    
        //  4074: athrow         
        //  4075: aconst_null    
        //  4076: athrow         
        //  4077: aconst_null    
        //  4078: athrow         
        //  4079: aconst_null    
        //  4080: athrow         
        //  4081: aconst_null    
        //  4082: athrow         
        //  4083: pop            
        //  4084: goto            24
        //  4087: pop            
        //  4088: aconst_null    
        //  4089: goto            4083
        //  4092: dup            
        //  4093: ifnull          4083
        //  4096: checkcast       Ljava/lang/Throwable;
        //  4099: athrow         
        //  4100: dup            
        //  4101: ifnull          4087
        //  4104: checkcast       Ljava/lang/Throwable;
        //  4107: athrow         
        //  4108: aconst_null    
        //  4109: athrow         
        //    StackMapTable: 02 58 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FF 00 03 00 04 07 00 03 01 01 02 00 00 0B 42 01 1C FF 00 03 00 00 00 01 07 00 25 FF 00 00 00 04 07 00 03 01 01 02 00 01 07 00 03 45 07 00 25 00 4F 07 00 38 FF 00 02 00 04 07 00 03 01 01 02 00 02 07 00 38 01 5C 07 00 38 45 07 00 1E FF 00 00 00 04 07 00 03 01 01 02 00 04 07 00 38 01 01 02 45 07 00 25 00 FF 00 0D 00 04 07 00 03 01 01 02 00 02 07 00 03 07 00 03 FF 00 02 00 04 07 00 03 01 01 02 00 03 07 00 03 07 00 03 01 FF 00 1C 00 04 07 00 03 01 01 02 00 02 07 00 03 07 00 03 48 07 00 25 FF 00 00 00 04 07 00 03 01 01 02 00 03 07 00 03 07 02 D6 07 00 EC 45 07 00 25 FF 00 00 00 04 07 00 03 01 01 02 00 03 07 00 03 07 02 D6 07 00 EC 4D 07 00 25 FF 00 00 00 04 07 00 03 01 01 02 00 06 07 00 03 07 02 D6 07 00 EC 01 01 01 45 07 00 25 00 FD 00 17 07 03 09 05 42 01 1D 46 07 00 25 40 07 00 38 45 07 00 25 40 07 00 55 FF 00 09 00 00 00 01 07 00 25 FF 00 00 00 06 07 00 03 01 01 02 07 03 09 05 00 01 07 00 38 45 07 00 25 40 07 00 55 4E 07 01 59 FF 00 02 00 06 07 00 03 01 01 02 07 03 09 05 00 02 07 01 59 01 5C 07 01 59 51 07 00 03 FF 00 02 00 06 07 00 03 01 01 02 07 03 09 05 00 02 07 00 03 01 5E 07 00 03 45 07 00 4D 40 07 00 38 45 07 00 25 40 07 00 55 4E 07 00 5A FF 00 02 00 06 07 00 03 01 01 02 07 03 09 05 00 02 07 00 5A 01 5F 07 00 5A FF 00 01 00 06 07 00 03 01 01 02 07 03 09 07 00 5A 00 00 0B 42 01 1E FF 00 14 00 06 07 00 03 01 01 02 07 03 09 07 00 5A 00 02 01 07 00 03 FF 00 02 00 06 07 00 03 01 01 02 07 03 09 07 00 5A 00 03 01 07 00 03 01 FF 00 1F 00 06 07 00 03 01 01 02 07 03 09 07 00 5A 00 02 01 07 00 03 52 01 FF 00 02 00 06 07 00 03 01 01 02 07 03 09 07 00 5A 00 02 01 01 5D 01 FF 00 23 00 07 07 00 03 01 01 02 07 03 09 07 00 5A 01 00 04 07 01 4E 01 01 07 00 03 FF 00 02 00 07 07 00 03 01 01 02 07 03 09 07 00 5A 01 00 05 07 01 4E 01 01 07 00 03 01 FF 00 1C 00 07 07 00 03 01 01 02 07 03 09 07 00 5A 01 00 04 07 01 4E 01 01 07 00 03 FF 00 0D 00 00 00 01 07 00 25 FF 00 00 00 07 07 00 03 01 01 02 07 03 09 07 00 5A 01 00 05 07 01 4E 01 01 01 07 03 09 45 07 00 25 00 0B 42 01 1E 44 07 00 25 40 07 03 09 45 07 00 25 40 07 00 60 42 07 00 16 40 07 00 60 45 07 00 25 40 07 00 EC FC 00 0D 07 00 EC 42 01 1E 4D 07 03 09 FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 03 09 01 5E 07 03 09 FF 00 0F 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 03 09 07 01 59 FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 03 07 03 09 07 01 59 01 FF 00 1C 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 03 09 07 01 59 4A 07 00 53 40 07 00 5A 45 07 00 25 40 01 FF 00 07 00 00 00 01 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 01 07 00 5A 45 07 00 25 40 07 00 60 42 07 00 25 40 07 00 60 45 07 00 25 40 07 00 EC 4B 07 00 EC FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 EC 01 5E 07 00 EC 42 07 00 25 40 07 00 EC 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 EC 07 00 66 42 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 EC 07 00 66 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 EC 07 00 70 FF 00 0B 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 EC 07 00 70 FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 03 07 00 EC 07 00 70 01 FF 00 1E 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 EC 07 00 70 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 EC 07 00 70 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 EC 07 00 60 42 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 EC 07 00 60 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 EC 07 00 EC 42 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 EC 07 00 EC 45 07 00 25 40 01 05 0B 42 01 1D 44 07 00 25 40 07 00 5A 45 07 00 25 40 07 00 60 42 07 00 25 40 07 00 60 45 07 00 25 40 07 00 78 42 07 00 25 40 07 00 78 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 78 07 00 66 FF 00 0B 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 78 07 00 66 FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 03 07 00 78 07 00 66 01 FF 00 1D 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 78 07 00 66 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 78 07 00 66 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 78 07 00 70 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 78 07 00 70 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 78 07 00 60 42 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 78 07 00 60 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 78 07 00 78 42 07 00 4F FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 78 07 00 78 45 07 00 25 40 01 02 05 42 01 1B 0B 42 01 1C 42 07 00 25 00 45 07 00 25 40 01 FF 00 09 00 00 00 01 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 08 05 7E 08 05 7E 45 07 00 25 40 07 02 63 4B 07 02 63 FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 01 5F 07 02 63 FF 00 0E 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 02 69 FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 03 07 02 63 07 02 69 01 FF 00 1D 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 02 69 42 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 02 69 45 07 00 25 40 07 02 63 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 42 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 45 07 00 25 40 07 02 63 42 07 00 25 40 07 02 63 45 07 00 25 40 07 00 EC 02 4C 07 00 03 FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 03 01 5D 07 00 03 52 07 00 03 FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 03 01 5D 07 00 03 4C 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 08 06 86 08 06 86 45 07 00 25 40 07 02 63 4B 07 02 63 FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 01 5F 07 02 63 45 07 00 16 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 02 69 45 07 00 25 40 07 02 63 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 0B 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 03 07 02 63 07 00 EC 01 FF 00 1C 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 45 07 00 25 40 07 02 63 42 07 00 25 40 07 02 63 45 07 00 25 40 07 00 EC 02 46 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 08 07 25 08 07 25 45 07 00 25 40 07 02 63 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 02 69 45 07 00 25 40 07 02 63 FF 00 0E 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 03 07 02 63 07 00 EC 01 FF 00 1F 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 42 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 0B 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 03 07 02 63 07 00 EC 01 FF 00 1D 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 42 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 45 07 00 25 40 07 02 63 4B 07 02 63 FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 01 5D 07 02 63 42 07 00 25 40 07 02 63 45 07 00 25 40 07 00 EC 02 FF 00 0F 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 08 07 F2 08 07 F2 FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 03 08 07 F2 08 07 F2 01 FF 00 1E 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 08 07 F2 08 07 F2 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 08 07 F2 08 07 F2 45 07 00 25 40 07 02 63 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 02 69 45 07 00 25 40 07 02 63 45 07 00 1E FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 0B 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 03 07 02 63 07 00 EC 01 FF 00 1D 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 42 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 45 07 00 25 40 07 02 63 42 07 00 25 40 07 02 63 45 07 00 25 40 07 00 EC 02 FF 00 04 00 00 00 01 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 01 07 00 5A 45 07 00 25 40 01 49 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 08 08 A1 08 08 A1 45 07 00 25 40 07 02 63 45 07 00 47 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 02 69 45 07 00 25 40 07 02 63 FF 00 0E 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 03 07 02 63 07 00 EC 01 FF 00 1F 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 0B 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 03 07 02 63 07 00 EC 01 FF 00 1D 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 42 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 45 07 00 25 40 07 02 63 42 07 00 25 40 07 02 63 45 07 00 25 40 07 00 EC 02 46 07 00 4B FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 08 09 41 08 09 41 45 07 00 25 40 07 02 63 FF 00 0E 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 02 69 FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 03 07 02 63 07 02 69 01 FF 00 1D 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 02 69 42 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 02 69 45 07 00 25 40 07 02 63 45 07 00 1E FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 45 07 00 25 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 0B 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 02 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 03 07 02 63 07 00 EC 01 FF 00 1F 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 42 07 00 4B FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 45 07 00 25 40 07 02 63 42 07 00 25 40 07 02 63 45 07 00 25 40 07 00 EC FC 00 0D 07 00 EC 05 42 01 1A 0B 42 01 1C 44 07 00 1E 40 07 00 5A 45 07 00 25 40 01 0E 42 01 1C 44 07 00 25 40 07 00 5A 45 07 00 25 40 07 00 60 4B 07 00 60 FF 00 02 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 60 01 5F 07 00 60 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 01 07 00 60 45 07 00 25 40 07 00 EC 42 07 00 F1 40 07 00 EC 45 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 EC 07 00 66 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 EC 07 00 66 45 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 EC 07 00 70 FF 00 0B 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 EC 07 00 70 FF 00 02 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 03 07 00 EC 07 00 70 01 FF 00 1F 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 EC 07 00 70 42 07 00 1E FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 EC 07 00 70 45 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 EC 07 00 60 42 07 00 14 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 EC 07 00 60 45 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 EC 07 00 EC 42 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 EC 07 00 EC 45 07 00 25 40 01 05 44 07 00 1E 40 07 00 5A 45 07 00 25 40 07 00 60 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 01 07 00 60 45 07 00 25 40 07 00 78 42 07 00 25 40 07 00 78 45 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 78 07 00 66 42 07 00 51 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 78 07 00 66 45 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 78 07 00 70 42 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 78 07 00 70 45 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 78 07 00 60 FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 78 07 00 60 45 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 78 07 00 78 FF 00 0B 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 78 07 00 78 FF 00 02 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 03 07 00 78 07 00 78 01 FF 00 1D 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 78 07 00 78 42 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 78 07 00 78 45 07 00 25 40 01 02 FF 00 0F 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 08 0B AA 08 0B AA FF 00 02 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 03 08 0B AA 08 0B AA 01 FF 00 1E 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 08 0B AA 08 0B AA FF 00 02 00 00 00 01 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 08 0B AA 08 0B AA 45 07 00 25 40 07 02 63 4B 07 02 63 FF 00 02 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 02 63 01 5D 07 02 63 45 07 00 53 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 02 63 07 02 69 45 07 00 25 40 07 02 63 45 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 02 63 07 00 EC 45 07 00 25 FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 02 63 07 00 EC 42 07 00 4D FF 00 00 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 02 63 07 00 EC 45 07 00 25 40 07 02 63 42 07 00 25 40 07 02 63 45 07 00 25 40 07 00 EC 02 42 07 00 EC 4B 07 00 EC FF 00 02 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 EC 01 5C 07 00 EC FF 00 0A 00 0A 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 00 01 07 00 47 FF 00 00 00 0A 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 00 02 07 02 D6 07 00 EC 45 07 00 25 40 01 FF 00 0A 00 0B 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 00 01 07 00 25 FF 00 00 00 0B 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 00 02 07 02 D6 07 00 EC 45 07 00 25 40 01 FF 00 0A 00 0C 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 00 01 07 00 49 FF 00 00 00 0C 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 00 02 07 02 D6 07 00 EC 45 07 00 25 40 01 FF 00 1B 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 04 07 02 D6 07 00 EC 01 07 00 03 FF 00 02 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 05 07 02 D6 07 00 EC 01 07 00 03 01 FF 00 1F 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 04 07 02 D6 07 00 EC 01 07 00 03 49 07 00 25 FF 00 00 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 05 07 02 D6 07 00 EC 01 01 01 45 07 00 25 40 01 50 07 02 D6 FF 00 02 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 02 07 02 D6 01 5D 07 02 D6 FF 00 1C 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 05 07 02 D6 07 00 EC 01 01 07 00 03 FF 00 02 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 06 07 02 D6 07 00 EC 01 01 07 00 03 01 FF 00 1F 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 05 07 02 D6 07 00 EC 01 01 07 00 03 4C 07 00 1C FF 00 00 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 05 07 02 D6 07 00 EC 01 01 01 45 07 00 25 40 01 0C 42 01 1E FF 00 23 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 05 07 02 D6 07 00 EC 01 01 07 02 D6 FF 00 02 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 06 07 02 D6 07 00 EC 01 01 07 02 D6 01 FF 00 1C 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 05 07 02 D6 07 00 EC 01 01 07 02 D6 FF 00 14 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 05 07 02 D6 07 00 EC 01 01 01 FF 00 02 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 06 07 02 D6 07 00 EC 01 01 01 01 FF 00 1F 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 05 07 02 D6 07 00 EC 01 01 01 42 07 00 25 FF 00 00 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 05 07 02 D6 07 00 EC 01 01 01 45 07 00 25 40 01 4C 07 00 25 FF 00 00 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 04 07 00 03 07 02 D6 08 0E 45 08 0E 45 45 07 00 25 FF 00 00 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 03 07 00 03 07 02 D6 07 02 63 45 07 00 4D FF 00 00 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 04 07 00 03 07 02 D6 07 02 63 07 02 69 45 07 00 25 FF 00 00 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 03 07 00 03 07 02 D6 07 02 63 FF 00 0B 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 03 07 00 03 07 02 D6 07 02 63 FF 00 02 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 04 07 00 03 07 02 D6 07 02 63 01 FF 00 1E 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 03 07 00 03 07 02 D6 07 02 63 FF 00 0F 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 04 07 00 03 07 02 D6 07 02 63 07 00 EC FF 00 02 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 05 07 00 03 07 02 D6 07 02 63 07 00 EC 01 FF 00 1C 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 04 07 00 03 07 02 D6 07 02 63 07 00 EC 42 07 00 25 FF 00 00 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 04 07 00 03 07 02 D6 07 02 63 07 00 EC 45 07 00 25 FF 00 00 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 03 07 00 03 07 02 D6 07 02 63 FF 00 0B 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 03 07 00 03 07 02 D6 07 02 63 FF 00 02 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 04 07 00 03 07 02 D6 07 02 63 01 FF 00 1D 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 03 07 00 03 07 02 D6 07 02 63 42 07 00 14 FF 00 00 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 03 07 00 03 07 02 D6 07 02 63 45 07 00 25 FF 00 00 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 03 07 00 03 07 02 D6 07 00 EC 50 07 00 25 FF 00 00 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 06 07 00 03 07 02 D6 07 00 EC 01 01 01 45 07 00 25 00 0B 42 01 1C 4C 07 00 03 FF 00 02 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 02 07 00 03 01 5F 07 00 03 45 07 00 25 FF 00 00 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 04 07 00 03 01 01 02 45 07 00 25 00 FF 00 00 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 01 07 02 63 FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 01 00 06 07 00 03 01 01 02 07 03 09 07 00 5A 00 01 01 FF 00 01 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 03 07 00 03 07 02 D6 07 02 63 FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 01 07 00 EC 01 FF 00 01 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 01 07 02 63 FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 EC 07 00 70 01 FF 00 01 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 78 07 00 78 F8 00 01 FF 00 01 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 04 07 02 D6 07 00 EC 01 07 00 03 FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 01 07 03 09 FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 01 00 06 07 00 03 01 01 02 07 03 09 07 00 5A 00 02 01 07 00 03 FD 00 01 01 07 00 EC FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 01 00 04 07 00 03 01 01 02 00 02 07 00 03 07 00 03 FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 00 78 07 00 66 41 07 00 03 FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 08 07 F2 08 07 F2 FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 02 69 FF 00 01 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 08 0B AA 08 0B AA FF 00 01 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 01 07 00 03 FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 01 07 02 63 FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 03 09 07 01 59 FF 00 01 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 04 07 00 03 07 02 D6 07 02 63 07 00 EC FF 00 01 00 04 07 00 03 01 01 02 00 00 FF 00 01 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 00 FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 01 07 02 63 FF 00 01 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 00 FF 00 01 00 06 07 00 03 01 01 02 07 03 09 05 00 01 07 00 03 FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 01 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 02 07 00 EC 07 00 70 FF 00 01 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 05 07 02 D6 07 00 EC 01 01 07 02 D6 FF 00 01 00 04 07 00 03 01 01 02 00 01 07 00 38 FF 00 01 00 07 07 00 03 01 01 02 07 03 09 07 00 5A 01 00 04 07 01 4E 01 01 07 00 03 01 FF 00 01 00 06 07 00 03 01 01 02 07 03 09 05 00 00 FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 02 69 FF 00 01 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 03 07 00 03 07 02 D6 07 02 63 41 07 02 D6 FF 00 01 00 06 07 00 03 01 01 02 07 03 09 05 00 01 07 00 5A FF 00 01 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 01 07 00 EC FF 00 01 00 06 07 00 03 01 01 02 07 03 09 05 00 01 07 01 59 FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC 41 07 00 03 FF 00 01 00 08 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 00 02 07 02 63 07 00 EC FF 00 01 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 05 07 02 D6 07 00 EC 01 01 07 00 03 01 FF 00 01 00 0D 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 07 00 EC 01 01 01 00 05 07 02 D6 07 00 EC 01 01 01 FF 00 01 00 09 07 00 03 01 01 02 07 03 09 07 00 5A 01 07 00 EC 07 00 EC 00 00 41 07 00 60 FF 00 01 00 04 07 00 03 01 01 02 00 01 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     4092   4100   Any
        //  4092   4100   4092   4100   Any
        //  4108   4110   3      8      Any
        //  73     79     79     80     Any
        //  73     79     3      8      Ljava/lang/ArithmeticException;
        //  73     79     79     80     Ljava/util/NoSuchElementException;
        //  73     79     79     80     Ljava/util/ConcurrentModificationException;
        //  73     79     3      8      Any
        //  134    141    141    142    Any
        //  135    141    134    135    Ljava/lang/EnumConstantNotPresentException;
        //  134    141    134    135    Ljava/util/ConcurrentModificationException;
        //  135    141    141    142    Any
        //  135    141    134    135    Ljava/lang/ClassCastException;
        //  197    204    204    205    Any
        //  198    204    197    198    Any
        //  198    204    197    198    Ljava/lang/ArithmeticException;
        //  198    204    197    198    Any
        //  198    204    204    205    Ljava/lang/IllegalStateException;
        //  219    226    226    227    Any
        //  220    226    226    227    Ljava/util/ConcurrentModificationException;
        //  220    226    226    227    Any
        //  219    226    3      8      Any
        //  219    226    219    220    Any
        //  291    298    298    299    Any
        //  292    298    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  292    298    3      8      Any
        //  291    298    291    292    Any
        //  292    298    3      8      Any
        //  310    316    316    317    Any
        //  310    316    316    317    Ljava/lang/ClassCastException;
        //  310    316    316    317    Any
        //  310    316    3      8      Ljava/lang/ArithmeticException;
        //  310    316    316    317    Ljava/lang/IndexOutOfBoundsException;
        //  422    429    429    430    Any
        //  423    429    422    423    Ljava/lang/IllegalArgumentException;
        //  423    429    3      8      Any
        //  422    429    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  423    429    3      8      Ljava/lang/NullPointerException;
        //  719    725    725    726    Any
        //  719    725    3      8      Ljava/util/NoSuchElementException;
        //  719    725    3      8      Any
        //  719    725    3      8      Any
        //  719    725    725    726    Ljava/lang/AssertionError;
        //  777    784    784    785    Any
        //  777    784    777    778    Ljava/util/ConcurrentModificationException;
        //  778    784    777    778    Any
        //  777    784    784    785    Any
        //  778    784    3      8      Any
        //  788    795    795    796    Any
        //  788    795    795    796    Ljava/lang/NegativeArraySizeException;
        //  788    795    3      8      Any
        //  788    795    788    789    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  789    795    795    796    Any
        //  951    958    958    959    Any
        //  952    958    3      8      Any
        //  951    958    3      8      Any
        //  951    958    958    959    Ljava/lang/NegativeArraySizeException;
        //  952    958    951    952    Ljava/lang/NumberFormatException;
        //  968    974    974    975    Any
        //  968    974    974    975    Any
        //  968    974    974    975    Ljava/lang/IndexOutOfBoundsException;
        //  968    974    3      8      Any
        //  968    974    3      8      Ljava/lang/UnsupportedOperationException;
        //  978    985    985    986    Any
        //  979    985    978    979    Ljava/lang/StringIndexOutOfBoundsException;
        //  979    985    978    979    Any
        //  978    985    978    979    Ljava/lang/UnsupportedOperationException;
        //  978    985    985    986    Ljava/lang/RuntimeException;
        //  1035   1042   1042   1043   Any
        //  1035   1042   3      8      Any
        //  1036   1042   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1035   1042   1042   1043   Any
        //  1036   1042   1035   1036   Any
        //  1046   1053   1053   1054   Any
        //  1047   1053   1053   1054   Any
        //  1046   1053   3      8      Any
        //  1047   1053   1046   1047   Ljava/lang/IllegalArgumentException;
        //  1047   1053   1046   1047   Any
        //  1104   1110   1110   1111   Any
        //  1104   1110   3      8      Any
        //  1104   1110   1110   1111   Any
        //  1104   1110   3      8      Any
        //  1104   1110   3      8      Any
        //  1114   1121   1121   1122   Any
        //  1114   1121   3      8      Any
        //  1115   1121   1114   1115   Any
        //  1115   1121   1114   1115   Any
        //  1114   1121   1114   1115   Any
        //  1125   1132   1132   1133   Any
        //  1126   1132   1125   1126   Ljava/lang/ArithmeticException;
        //  1125   1132   1125   1126   Any
        //  1125   1132   1125   1126   Any
        //  1126   1132   1132   1133   Any
        //  1189   1196   1196   1197   Any
        //  1190   1196   3      8      Ljava/lang/ClassCastException;
        //  1190   1196   3      8      Any
        //  1189   1196   1189   1190   Any
        //  1190   1196   1196   1197   Ljava/lang/AssertionError;
        //  1200   1207   1207   1208   Any
        //  1201   1207   1207   1208   Any
        //  1200   1207   1200   1201   Ljava/lang/NumberFormatException;
        //  1201   1207   1200   1201   Any
        //  1200   1207   1200   1201   Any
        //  1211   1218   1218   1219   Any
        //  1211   1218   1211   1212   Ljava/lang/NullPointerException;
        //  1212   1218   3      8      Ljava/util/ConcurrentModificationException;
        //  1212   1218   1211   1212   Ljava/lang/AssertionError;
        //  1212   1218   1218   1219   Any
        //  1268   1274   1274   1275   Any
        //  1268   1274   3      8      Any
        //  1268   1274   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1268   1274   1274   1275   Ljava/util/NoSuchElementException;
        //  1268   1274   3      8      Any
        //  1279   1285   1285   1286   Any
        //  1279   1285   1285   1286   Ljava/lang/NegativeArraySizeException;
        //  1279   1285   1285   1286   Ljava/lang/ArithmeticException;
        //  1279   1285   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1279   1285   1285   1286   Any
        //  1289   1296   1296   1297   Any
        //  1290   1296   1296   1297   Any
        //  1289   1296   3      8      Any
        //  1290   1296   1289   1290   Any
        //  1289   1296   1289   1290   Any
        //  1300   1307   1307   1308   Any
        //  1300   1307   1300   1301   Ljava/util/ConcurrentModificationException;
        //  1301   1307   1307   1308   Any
        //  1300   1307   3      8      Ljava/lang/NullPointerException;
        //  1301   1307   3      8      Any
        //  1395   1402   1402   1403   Any
        //  1395   1402   1402   1403   Any
        //  1396   1402   1395   1396   Any
        //  1395   1402   1402   1403   Any
        //  1395   1402   1395   1396   Ljava/lang/NumberFormatException;
        //  1414   1420   1420   1421   Any
        //  1414   1420   1420   1421   Ljava/lang/ClassCastException;
        //  1414   1420   1420   1421   Any
        //  1414   1420   3      8      Any
        //  1414   1420   1420   1421   Any
        //  1519   1526   1526   1527   Any
        //  1520   1526   1526   1527   Any
        //  1519   1526   1526   1527   Any
        //  1520   1526   1519   1520   Any
        //  1520   1526   1526   1527   Ljava/lang/UnsupportedOperationException;
        //  1533   1540   1540   1541   Any
        //  1533   1540   1533   1534   Any
        //  1534   1540   1540   1541   Ljava/lang/EnumConstantNotPresentException;
        //  1533   1540   1533   1534   Any
        //  1533   1540   3      8      Any
        //  1544   1551   1551   1552   Any
        //  1544   1551   1544   1545   Ljava/lang/NullPointerException;
        //  1544   1551   1544   1545   Any
        //  1545   1551   1544   1545   Any
        //  1544   1551   1544   1545   Any
        //  1555   1562   1562   1563   Any
        //  1555   1562   1555   1556   Any
        //  1555   1562   3      8      Ljava/lang/NumberFormatException;
        //  1556   1562   1562   1563   Any
        //  1555   1562   1555   1556   Any
        //  1677   1684   1684   1685   Any
        //  1678   1684   1677   1678   Any
        //  1677   1684   1677   1678   Ljava/lang/IllegalStateException;
        //  1677   1684   3      8      Any
        //  1677   1684   1684   1685   Any
        //  1738   1745   1745   1746   Any
        //  1739   1745   1745   1746   Any
        //  1738   1745   3      8      Ljava/lang/NumberFormatException;
        //  1738   1745   1738   1739   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1739   1745   3      8      Ljava/lang/ClassCastException;
        //  1752   1759   1759   1760   Any
        //  1752   1759   1759   1760   Ljava/lang/EnumConstantNotPresentException;
        //  1752   1759   1752   1753   Ljava/lang/IllegalStateException;
        //  1753   1759   3      8      Ljava/lang/NumberFormatException;
        //  1752   1759   1752   1753   Any
        //  1808   1814   1814   1815   Any
        //  1808   1814   1814   1815   Ljava/lang/ClassCastException;
        //  1808   1814   3      8      Ljava/util/NoSuchElementException;
        //  1808   1814   1814   1815   Ljava/lang/ArithmeticException;
        //  1808   1814   1814   1815   Ljava/lang/RuntimeException;
        //  1818   1825   1825   1826   Any
        //  1818   1825   3      8      Ljava/lang/IllegalArgumentException;
        //  1819   1825   3      8      Ljava/lang/ClassCastException;
        //  1819   1825   3      8      Any
        //  1819   1825   1818   1819   Any
        //  1836   1843   1843   1844   Any
        //  1837   1843   1836   1837   Ljava/lang/AssertionError;
        //  1837   1843   1843   1844   Any
        //  1837   1843   1836   1837   Any
        //  1836   1843   1836   1837   Ljava/lang/IndexOutOfBoundsException;
        //  1850   1857   1857   1858   Any
        //  1850   1857   3      8      Any
        //  1850   1857   3      8      Ljava/lang/AssertionError;
        //  1851   1857   1850   1851   Any
        //  1851   1857   1850   1851   Ljava/lang/AssertionError;
        //  1911   1918   1918   1919   Any
        //  1912   1918   1911   1912   Ljava/lang/StringIndexOutOfBoundsException;
        //  1911   1918   1918   1919   Any
        //  1911   1918   1911   1912   Ljava/lang/IllegalArgumentException;
        //  1912   1918   1911   1912   Any
        //  1967   1974   1974   1975   Any
        //  1967   1974   3      8      Any
        //  1968   1974   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1967   1974   1967   1968   Any
        //  1968   1974   1974   1975   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2023   2030   2030   2031   Any
        //  2023   2030   2023   2024   Ljava/lang/UnsupportedOperationException;
        //  2024   2030   3      8      Ljava/lang/IllegalArgumentException;
        //  2024   2030   2030   2031   Any
        //  2024   2030   2023   2024   Any
        //  2088   2094   2094   2095   Any
        //  2088   2094   2094   2095   Any
        //  2088   2094   3      8      Ljava/lang/IllegalArgumentException;
        //  2088   2094   2094   2095   Ljava/lang/StringIndexOutOfBoundsException;
        //  2088   2094   2094   2095   Any
        //  2101   2108   2108   2109   Any
        //  2101   2108   2108   2109   Any
        //  2102   2108   2101   2102   Ljava/lang/UnsupportedOperationException;
        //  2102   2108   3      8      Any
        //  2101   2108   2101   2102   Any
        //  2115   2122   2122   2123   Any
        //  2115   2122   2115   2116   Ljava/lang/IndexOutOfBoundsException;
        //  2116   2122   2122   2123   Ljava/lang/NegativeArraySizeException;
        //  2115   2122   2115   2116   Ljava/lang/UnsupportedOperationException;
        //  2116   2122   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2171   2178   2178   2179   Any
        //  2171   2178   2171   2172   Any
        //  2172   2178   3      8      Any
        //  2171   2178   2171   2172   Any
        //  2172   2178   2178   2179   Any
        //  2182   2189   2189   2190   Any
        //  2182   2189   2189   2190   Ljava/lang/IllegalArgumentException;
        //  2183   2189   2182   2183   Any
        //  2183   2189   2189   2190   Any
        //  2182   2189   2182   2183   Ljava/util/ConcurrentModificationException;
        //  2199   2205   2205   2206   Any
        //  2199   2205   3      8      Any
        //  2199   2205   2205   2206   Ljava/util/NoSuchElementException;
        //  2199   2205   3      8      Ljava/lang/RuntimeException;
        //  2199   2205   3      8      Ljava/lang/NullPointerException;
        //  2216   2223   2223   2224   Any
        //  2216   2223   2216   2217   Any
        //  2217   2223   3      8      Ljava/lang/NegativeArraySizeException;
        //  2216   2223   2223   2224   Ljava/lang/IllegalStateException;
        //  2216   2223   2223   2224   Ljava/lang/ClassCastException;
        //  2230   2237   2237   2238   Any
        //  2231   2237   3      8      Ljava/lang/AssertionError;
        //  2230   2237   2237   2238   Any
        //  2230   2237   2237   2238   Ljava/lang/IllegalArgumentException;
        //  2231   2237   2230   2231   Ljava/lang/NullPointerException;
        //  2292   2298   2298   2299   Any
        //  2292   2298   2298   2299   Ljava/lang/UnsupportedOperationException;
        //  2292   2298   2298   2299   Ljava/lang/StringIndexOutOfBoundsException;
        //  2292   2298   2298   2299   Ljava/lang/IndexOutOfBoundsException;
        //  2292   2298   3      8      Any
        //  2347   2354   2354   2355   Any
        //  2347   2354   2354   2355   Any
        //  2347   2354   2347   2348   Any
        //  2347   2354   2354   2355   Any
        //  2348   2354   2354   2355   Any
        //  2358   2365   2365   2366   Any
        //  2359   2365   2365   2366   Any
        //  2358   2365   2358   2359   Ljava/lang/StringIndexOutOfBoundsException;
        //  2359   2365   2358   2359   Any
        //  2358   2365   2365   2366   Any
        //  2376   2383   2383   2384   Any
        //  2377   2383   2376   2377   Ljava/lang/StringIndexOutOfBoundsException;
        //  2376   2383   3      8      Ljava/lang/IllegalStateException;
        //  2376   2383   2383   2384   Any
        //  2377   2383   3      8      Any
        //  2435   2442   2442   2443   Any
        //  2436   2442   2442   2443   Ljava/lang/EnumConstantNotPresentException;
        //  2435   2442   3      8      Any
        //  2436   2442   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2435   2442   2435   2436   Any
        //  2449   2456   2456   2457   Any
        //  2449   2456   2449   2450   Ljava/lang/IndexOutOfBoundsException;
        //  2450   2456   3      8      Any
        //  2450   2456   2449   2450   Ljava/lang/IllegalArgumentException;
        //  2450   2456   2456   2457   Any
        //  2507   2514   2514   2515   Any
        //  2508   2514   2514   2515   Ljava/lang/IllegalArgumentException;
        //  2507   2514   3      8      Any
        //  2507   2514   2507   2508   Ljava/lang/StringIndexOutOfBoundsException;
        //  2508   2514   3      8      Ljava/lang/ClassCastException;
        //  2518   2525   2525   2526   Any
        //  2519   2525   3      8      Any
        //  2519   2525   2518   2519   Any
        //  2519   2525   3      8      Ljava/lang/ClassCastException;
        //  2518   2525   2518   2519   Any
        //  2625   2632   2632   2633   Any
        //  2626   2632   2632   2633   Any
        //  2626   2632   2625   2626   Ljava/lang/ArithmeticException;
        //  2626   2632   2625   2626   Ljava/lang/IllegalArgumentException;
        //  2625   2632   2625   2626   Ljava/lang/RuntimeException;
        //  2685   2692   2692   2693   Any
        //  2686   2692   2692   2693   Any
        //  2685   2692   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2685   2692   2685   2686   Ljava/lang/IndexOutOfBoundsException;
        //  2685   2692   2685   2686   Any
        //  2744   2750   2750   2751   Any
        //  2744   2750   2750   2751   Ljava/lang/IllegalArgumentException;
        //  2744   2750   2750   2751   Any
        //  2744   2750   3      8      Any
        //  2744   2750   3      8      Ljava/lang/NullPointerException;
        //  2754   2761   2761   2762   Any
        //  2755   2761   3      8      Ljava/lang/NullPointerException;
        //  2754   2761   2754   2755   Ljava/lang/EnumConstantNotPresentException;
        //  2755   2761   2761   2762   Ljava/lang/AssertionError;
        //  2755   2761   2761   2762   Any
        //  2766   2772   2772   2773   Any
        //  2766   2772   2772   2773   Any
        //  2766   2772   2772   2773   Ljava/lang/EnumConstantNotPresentException;
        //  2766   2772   2772   2773   Ljava/lang/IndexOutOfBoundsException;
        //  2766   2772   3      8      Ljava/lang/AssertionError;
        //  2823   2830   2830   2831   Any
        //  2824   2830   3      8      Any
        //  2824   2830   2823   2824   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2823   2830   2823   2824   Ljava/util/ConcurrentModificationException;
        //  2823   2830   2830   2831   Any
        //  2834   2841   2841   2842   Any
        //  2834   2841   2841   2842   Any
        //  2835   2841   3      8      Ljava/lang/IllegalStateException;
        //  2834   2841   2834   2835   Ljava/lang/ClassCastException;
        //  2834   2841   3      8      Any
        //  2845   2852   2852   2853   Any
        //  2846   2852   2845   2846   Any
        //  2845   2852   3      8      Ljava/lang/IllegalArgumentException;
        //  2845   2852   3      8      Any
        //  2845   2852   2845   2846   Ljava/util/NoSuchElementException;
        //  2864   2871   2871   2872   Any
        //  2865   2871   2864   2865   Ljava/lang/ArithmeticException;
        //  2865   2871   2871   2872   Ljava/lang/ArithmeticException;
        //  2865   2871   2864   2865   Ljava/lang/ClassCastException;
        //  2865   2871   2871   2872   Ljava/lang/EnumConstantNotPresentException;
        //  2876   2882   2882   2883   Any
        //  2876   2882   2882   2883   Any
        //  2876   2882   2882   2883   Ljava/lang/NumberFormatException;
        //  2876   2882   2882   2883   Any
        //  2876   2882   2882   2883   Any
        //  2886   2893   2893   2894   Any
        //  2886   2893   2886   2887   Any
        //  2887   2893   3      8      Any
        //  2887   2893   3      8      Ljava/lang/ArithmeticException;
        //  2886   2893   2893   2894   Any
        //  2897   2904   2904   2905   Any
        //  2897   2904   2904   2905   Any
        //  2897   2904   2904   2905   Any
        //  2897   2904   3      8      Any
        //  2898   2904   2897   2898   Ljava/util/NoSuchElementException;
        //  2908   2915   2915   2916   Any
        //  2908   2915   2915   2916   Any
        //  2908   2915   3      8      Ljava/lang/RuntimeException;
        //  2908   2915   2915   2916   Ljava/lang/AssertionError;
        //  2909   2915   2908   2909   Any
        //  2920   2926   2926   2927   Any
        //  2920   2926   3      8      Any
        //  2920   2926   2926   2927   Any
        //  2920   2926   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2920   2926   2926   2927   Any
        //  2975   2982   2982   2983   Any
        //  2975   2982   2982   2983   Ljava/lang/EnumConstantNotPresentException;
        //  2976   2982   2982   2983   Ljava/lang/NegativeArraySizeException;
        //  2975   2982   2975   2976   Any
        //  2975   2982   3      8      Any
        //  3040   3046   3046   3047   Any
        //  3040   3046   3      8      Any
        //  3040   3046   3046   3047   Any
        //  3040   3046   3046   3047   Ljava/lang/RuntimeException;
        //  3040   3046   3      8      Ljava/lang/IllegalStateException;
        //  3098   3105   3105   3106   Any
        //  3099   3105   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  3098   3105   3105   3106   Any
        //  3098   3105   3105   3106   Any
        //  3098   3105   3098   3099   Ljava/lang/NumberFormatException;
        //  3112   3119   3119   3120   Any
        //  3113   3119   3112   3113   Any
        //  3112   3119   3112   3113   Ljava/util/NoSuchElementException;
        //  3113   3119   3112   3113   Any
        //  3113   3119   3119   3120   Any
        //  3123   3130   3130   3131   Any
        //  3123   3130   3130   3131   Ljava/lang/NullPointerException;
        //  3124   3130   3130   3131   Ljava/lang/AssertionError;
        //  3123   3130   3123   3124   Ljava/lang/IllegalArgumentException;
        //  3123   3130   3      8      Any
        //  3134   3141   3141   3142   Any
        //  3135   3141   3      8      Any
        //  3134   3141   3141   3142   Ljava/util/NoSuchElementException;
        //  3134   3141   3134   3135   Any
        //  3135   3141   3134   3135   Any
        //  3203   3210   3210   3211   Any
        //  3203   3210   3210   3211   Any
        //  3203   3210   3203   3204   Ljava/lang/NullPointerException;
        //  3204   3210   3      8      Any
        //  3203   3210   3210   3211   Ljava/lang/NullPointerException;
        //  3222   3229   3229   3230   Any
        //  3222   3229   3222   3223   Any
        //  3223   3229   3222   3223   Any
        //  3223   3229   3      8      Any
        //  3223   3229   3229   3230   Ljava/util/ConcurrentModificationException;
        //  3241   3248   3248   3249   Any
        //  3241   3248   3241   3242   Ljava/lang/AssertionError;
        //  3241   3248   3248   3249   Any
        //  3241   3248   3      8      Ljava/lang/ClassCastException;
        //  3241   3248   3      8      Ljava/lang/IllegalArgumentException;
        //  3322   3329   3329   3330   Any
        //  3322   3329   3      8      Ljava/lang/ClassCastException;
        //  3322   3329   3329   3330   Any
        //  3323   3329   3322   3323   Ljava/lang/NumberFormatException;
        //  3322   3329   3322   3323   Ljava/lang/AssertionError;
        //  3457   3464   3464   3465   Any
        //  3457   3464   3464   3465   Ljava/lang/NegativeArraySizeException;
        //  3457   3464   3457   3458   Ljava/lang/NegativeArraySizeException;
        //  3458   3464   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  3458   3464   3      8      Any
        //  3639   3646   3646   3647   Any
        //  3640   3646   3639   3640   Any
        //  3639   3646   3      8      Any
        //  3640   3646   3639   3640   Ljava/lang/IllegalArgumentException;
        //  3640   3646   3646   3647   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3660   3667   3667   3668   Any
        //  3660   3667   3667   3668   Ljava/lang/UnsupportedOperationException;
        //  3660   3667   3667   3668   Any
        //  3661   3667   3660   3661   Any
        //  3661   3667   3660   3661   Ljava/lang/StringIndexOutOfBoundsException;
        //  3674   3681   3681   3682   Any
        //  3674   3681   3      8      Any
        //  3674   3681   3681   3682   Ljava/lang/AssertionError;
        //  3674   3681   3      8      Any
        //  3674   3681   3674   3675   Ljava/lang/IllegalArgumentException;
        //  3779   3786   3786   3787   Any
        //  3779   3786   3786   3787   Any
        //  3780   3786   3      8      Any
        //  3779   3786   3786   3787   Ljava/lang/NegativeArraySizeException;
        //  3780   3786   3779   3780   Any
        //  3835   3842   3842   3843   Any
        //  3836   3842   3      8      Any
        //  3835   3842   3835   3836   Ljava/lang/ClassCastException;
        //  3836   3842   3842   3843   Any
        //  3835   3842   3842   3843   Ljava/lang/NegativeArraySizeException;
        //  3860   3867   3867   3868   Any
        //  3860   3867   3867   3868   Any
        //  3860   3867   3860   3861   Any
        //  3860   3867   3867   3868   Any
        //  3860   3867   3      8      Any
        //  3966   3973   3973   3974   Any
        //  3967   3973   3973   3974   Ljava/lang/IndexOutOfBoundsException;
        //  3966   3973   3966   3967   Any
        //  3967   3973   3973   3974   Ljava/lang/EnumConstantNotPresentException;
        //  3967   3973   3      8      Ljava/lang/EnumConstantNotPresentException;
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
    
    public void 1(@Nullable final fn fn) {
        fbS.5(this, 545691300, fn);
    }
    
    public void func_146274_d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          77
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            69
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            61
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: goto            29
        //    28: athrow         
        //    29: invokespecial   net/minecraft/client/gui/GuiScreen.func_146274_d:()V
        //    32: goto            36
        //    35: athrow         
        //    36: aload_0        
        //    37: getfield        dev/nuker/pyro/fl.c:Ldev/nuker/pyro/fm;
        //    40: goto            44
        //    43: athrow         
        //    44: invokevirtual   dev/nuker/pyro/fm.func_178039_p:()V
        //    47: goto            51
        //    50: athrow         
        //    51: return         
        //    52: pop            
        //    53: goto            24
        //    56: pop            
        //    57: aconst_null    
        //    58: goto            52
        //    61: dup            
        //    62: ifnull          52
        //    65: checkcast       Ljava/lang/Throwable;
        //    68: athrow         
        //    69: dup            
        //    70: ifnull          56
        //    73: checkcast       Ljava/lang/Throwable;
        //    76: athrow         
        //    77: aconst_null    
        //    78: athrow         
        //    StackMapTable: 00 11 43 07 00 25 04 FF 00 0B 00 00 00 01 07 00 25 FC 00 03 07 00 03 43 07 00 1C 40 07 00 03 45 07 00 25 00 FF 00 06 00 00 00 01 07 00 25 FF 00 00 00 01 07 00 03 00 01 07 00 38 45 07 00 25 00 40 07 00 25 43 05 44 07 00 25 47 05 47 07 00 25
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     61     69     Any
        //  61     69     61     69     Ljava/lang/NullPointerException;
        //  77     79     3      8      Any
        //  28     35     35     36     Any
        //  28     35     28     29     Ljava/lang/NegativeArraySizeException;
        //  28     35     3      8      Any
        //  28     35     35     36     Any
        //  29     35     35     36     Ljava/lang/IndexOutOfBoundsException;
        //  44     50     50     51     Any
        //  44     50     3      8      Ljava/lang/IllegalStateException;
        //  44     50     50     51     Any
        //  44     50     50     51     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  44     50     50     51     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 31 out of bounds for length 31
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
}
