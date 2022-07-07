// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;

public class fb
{
    @SideOnly(Side.CLIENT)
    public static float c(final EntityLivingBase p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          191
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            183
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            175
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: goto            28
        //    27: athrow         
        //    28: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    31: goto            35
        //    34: athrow         
        //    35: goto            39
        //    38: athrow         
        //    39: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //    42: goto            46
        //    45: athrow         
        //    46: aload_0        
        //    47: goto            51
        //    50: athrow         
        //    51: invokevirtual   net/minecraft/client/renderer/entity/RenderManager.func_78713_a:(Lnet/minecraft/entity/Entity;)Lnet/minecraft/client/renderer/entity/Render;
        //    54: goto            58
        //    57: athrow         
        //    58: getstatic       dev/nuker/pyro/fc.1:I
        //    61: ifeq            69
        //    64: ldc             187413342
        //    66: goto            71
        //    69: ldc             304499129
        //    71: ldc             -1321171907
        //    73: ixor           
        //    74: lookupswitch {
        //          -1553543804: 100
        //          -1167378589: 69
        //          default: 162
        //        }
        //   100: astore_1       
        //   101: getstatic       dev/nuker/pyro/fc.1:I
        //   104: ifeq            112
        //   107: ldc             998682107
        //   109: goto            114
        //   112: ldc             -1831555794
        //   114: ldc             -770916983
        //   116: ixor           
        //   117: lookupswitch {
        //          -376827790: 112
        //          1087901863: 144
        //          default: 164
        //        }
        //   144: aload_1        
        //   145: instanceof      Lnet/minecraft/client/renderer/entity/RenderLivingBase;
        //   148: ifeq            159
        //   151: aload_1        
        //   152: checkcast       Lnet/minecraft/client/renderer/entity/RenderLivingBase;
        //   155: astore_2       
        //   156: goto            159
        //   159: ldc             1.8
        //   161: freturn        
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
        //    StackMapTable: 00 1E 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FC 00 03 07 00 3C FF 00 02 00 00 00 01 07 00 21 FC 00 00 07 00 3C 45 07 00 21 40 07 00 23 FF 00 02 00 00 00 01 07 00 21 FF 00 00 00 01 07 00 3C 00 01 07 00 23 45 07 00 21 40 07 00 2D 43 07 00 21 FF 00 00 00 01 07 00 3C 00 02 07 00 2D 07 00 3C 45 07 00 21 40 07 00 3E 4A 07 00 3E FF 00 01 00 01 07 00 3C 00 02 07 00 3E 01 5C 07 00 3E FC 00 0B 07 00 3E 41 01 1D 0E FF 00 02 00 01 07 00 3C 00 01 07 00 3E FC 00 01 07 00 3E FF 00 01 00 01 07 00 3C 00 01 07 00 21 43 05 44 07 00 21 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     175    183    Ljava/lang/StringIndexOutOfBoundsException;
        //  175    183    175    183    Any
        //  191    193    3      8      Ljava/lang/IllegalStateException;
        //  28     34     34     35     Any
        //  28     34     34     35     Any
        //  28     34     34     35     Any
        //  28     34     34     35     Any
        //  28     34     34     35     Any
        //  39     45     45     46     Any
        //  39     45     3      8      Any
        //  39     45     45     46     Ljava/lang/NegativeArraySizeException;
        //  39     45     45     46     Ljava/lang/ClassCastException;
        //  39     45     45     46     Any
        //  50     57     57     58     Any
        //  51     57     50     51     Ljava/lang/ClassCastException;
        //  50     57     3      8      Ljava/util/ConcurrentModificationException;
        //  51     57     50     51     Any
        //  51     57     3      8      Any
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
    
    public static Class c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          268
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            260
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            252
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       net/minecraftforge/fml/common/registry/ForgeRegistries.ENTITIES:Lnet/minecraftforge/registries/IForgeRegistry;
        //    27: goto            31
        //    30: athrow         
        //    31: invokeinterface net/minecraftforge/registries/IForgeRegistry.iterator:()Ljava/util/Iterator;
        //    36: goto            40
        //    39: athrow         
        //    40: getstatic       dev/nuker/pyro/fc.c:I
        //    43: ifge            51
        //    46: ldc             6405092
        //    48: goto            53
        //    51: ldc             259861207
        //    53: ldc             -1188752525
        //    55: ixor           
        //    56: lookupswitch {
        //          -1235732060: 84
        //          -1186682729: 51
        //          default: 239
        //        }
        //    84: astore_1       
        //    85: aload_1        
        //    86: getstatic       dev/nuker/pyro/fc.0:I
        //    89: ifeq            97
        //    92: ldc             704834731
        //    94: goto            99
        //    97: ldc             1251102576
        //    99: ldc             435275989
        //   101: ixor           
        //   102: lookupswitch {
        //          871572606: 97
        //          1399031717: 128
        //          default: 241
        //        }
        //   128: goto            132
        //   131: athrow         
        //   132: invokeinterface java/util/Iterator.hasNext:()Z
        //   137: goto            141
        //   140: athrow         
        //   141: ifeq            149
        //   144: ldc             -694046642
        //   146: goto            151
        //   149: ldc             -694046641
        //   151: ldc             -640920976
        //   153: ixor           
        //   154: tableswitch {
        //          517719164: 176
        //          517719165: 237
        //          default: 144
        //        }
        //   176: aload_1        
        //   177: goto            181
        //   180: athrow         
        //   181: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   186: goto            190
        //   189: athrow         
        //   190: checkcast       Lnet/minecraftforge/fml/common/registry/EntityEntry;
        //   193: astore_2       
        //   194: aload_2        
        //   195: goto            199
        //   198: athrow         
        //   199: invokevirtual   net/minecraftforge/fml/common/registry/EntityEntry.getName:()Ljava/lang/String;
        //   202: goto            206
        //   205: athrow         
        //   206: aload_0        
        //   207: goto            211
        //   210: athrow         
        //   211: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   214: goto            218
        //   217: athrow         
        //   218: ifeq            234
        //   221: aload_2        
        //   222: goto            226
        //   225: athrow         
        //   226: invokevirtual   net/minecraftforge/fml/common/registry/EntityEntry.getEntityClass:()Ljava/lang/Class;
        //   229: goto            233
        //   232: athrow         
        //   233: areturn        
        //   234: goto            85
        //   237: aconst_null    
        //   238: areturn        
        //   239: aconst_null    
        //   240: athrow         
        //   241: aconst_null    
        //   242: athrow         
        //   243: pop            
        //   244: goto            24
        //   247: pop            
        //   248: aconst_null    
        //   249: goto            243
        //   252: dup            
        //   253: ifnull          243
        //   256: checkcast       Ljava/lang/Throwable;
        //   259: athrow         
        //   260: dup            
        //   261: ifnull          247
        //   264: checkcast       Ljava/lang/Throwable;
        //   267: athrow         
        //   268: aconst_null    
        //   269: athrow         
        //    StackMapTable: 00 30 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FC 00 03 07 00 79 45 07 00 21 40 07 00 57 47 07 00 21 40 07 00 66 4A 07 00 66 FF 00 01 00 01 07 00 79 00 02 07 00 66 01 5E 07 00 66 FC 00 00 07 00 66 4B 07 00 66 FF 00 01 00 02 07 00 79 07 00 66 00 02 07 00 66 01 5C 07 00 66 42 07 00 17 40 07 00 66 47 07 00 21 40 01 02 04 41 01 18 43 07 00 21 40 07 00 66 47 07 00 21 40 07 00 05 FF 00 07 00 03 07 00 79 07 00 66 07 00 73 00 01 07 00 49 40 07 00 73 45 07 00 21 40 07 00 79 43 07 00 4B FF 00 00 00 03 07 00 79 07 00 66 07 00 73 00 02 07 00 79 07 00 79 45 07 00 21 40 01 FF 00 06 00 00 00 01 07 00 21 FF 00 00 00 03 07 00 79 07 00 66 07 00 73 00 01 07 00 73 45 07 00 21 40 07 00 83 00 FA 00 02 FF 00 01 00 01 07 00 79 00 01 07 00 66 FF 00 01 00 02 07 00 79 07 00 66 00 01 07 00 66 FF 00 01 00 01 07 00 79 00 01 07 00 21 43 05 44 07 00 21 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     252    260    Any
        //  252    260    252    260    Any
        //  268    270    3      8      Any
        //  30     39     39     40     Any
        //  30     39     30     31     Any
        //  31     39     30     31     Ljava/lang/UnsupportedOperationException;
        //  31     39     39     40     Ljava/util/NoSuchElementException;
        //  30     39     3      8      Ljava/util/NoSuchElementException;
        //  131    140    140    141    Any
        //  132    140    140    141    Any
        //  131    140    3      8      Any
        //  131    140    131    132    Ljava/lang/ClassCastException;
        //  131    140    140    141    Ljava/lang/IllegalArgumentException;
        //  180    189    189    190    Any
        //  181    189    189    190    Any
        //  181    189    3      8      Any
        //  180    189    3      8      Ljava/lang/AssertionError;
        //  181    189    180    181    Any
        //  198    205    205    206    Any
        //  199    205    205    206    Any
        //  198    205    205    206    Any
        //  198    205    205    206    Ljava/lang/UnsupportedOperationException;
        //  198    205    198    199    Ljava/lang/NumberFormatException;
        //  210    217    217    218    Any
        //  211    217    217    218    Any
        //  210    217    3      8      Any
        //  210    217    217    218    Any
        //  210    217    210    211    Ljava/lang/EnumConstantNotPresentException;
        //  226    232    232    233    Any
        //  226    232    232    233    Any
        //  226    232    3      8      Any
        //  226    232    3      8      Ljava/lang/NullPointerException;
        //  226    232    3      8      Any
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
    
    @SideOnly(Side.CLIENT)
    public static void c(final int p0, final int p1, final float p2, final float p3, final float p4, final EntityLivingBase p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2018
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            2010
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2002
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: goto            28
        //    27: athrow         
        //    28: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179084_k:()V
        //    31: goto            35
        //    34: athrow         
        //    35: iconst_1       
        //    36: goto            40
        //    39: athrow         
        //    40: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179132_a:(Z)V
        //    43: goto            47
        //    46: athrow         
        //    47: getstatic       dev/nuker/pyro/fc.1:I
        //    50: ifeq            58
        //    53: ldc             1008121060
        //    55: goto            60
        //    58: ldc             -939911379
        //    60: ldc             1893009961
        //    62: ixor           
        //    63: lookupswitch {
        //          -1112464039: 58
        //          1287896781: 1943
        //          default: 88
        //        }
        //    88: goto            92
        //    91: athrow         
        //    92: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179126_j:()V
        //    95: goto            99
        //    98: athrow         
        //    99: goto            103
        //   102: athrow         
        //   103: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179141_d:()V
        //   106: goto            110
        //   109: athrow         
        //   110: goto            114
        //   113: athrow         
        //   114: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179142_g:()V
        //   117: goto            121
        //   120: athrow         
        //   121: goto            125
        //   124: athrow         
        //   125: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //   128: goto            132
        //   131: athrow         
        //   132: fconst_1       
        //   133: fconst_1       
        //   134: fconst_1       
        //   135: fconst_1       
        //   136: goto            140
        //   139: athrow         
        //   140: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179131_c:(FFFF)V
        //   143: goto            147
        //   146: athrow         
        //   147: iload_0        
        //   148: i2f            
        //   149: iload_1        
        //   150: i2f            
        //   151: ldc             50.0
        //   153: goto            157
        //   156: athrow         
        //   157: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //   160: goto            164
        //   163: athrow         
        //   164: fload_2        
        //   165: fneg           
        //   166: fload_2        
        //   167: fload_2        
        //   168: goto            172
        //   171: athrow         
        //   172: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179152_a:(FFF)V
        //   175: goto            179
        //   178: athrow         
        //   179: ldc             180.0
        //   181: fconst_0       
        //   182: fconst_0       
        //   183: fconst_1       
        //   184: goto            188
        //   187: athrow         
        //   188: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179114_b:(FFFF)V
        //   191: goto            195
        //   194: athrow         
        //   195: aload           5
        //   197: getstatic       dev/nuker/pyro/fc.0:I
        //   200: ifeq            208
        //   203: ldc             -386371599
        //   205: goto            210
        //   208: ldc             1008464800
        //   210: ldc             549787237
        //   212: ixor           
        //   213: lookupswitch {
        //          -935495276: 208
        //          484369861: 240
        //          default: 1953
        //        }
        //   240: getfield        net/minecraft/entity/EntityLivingBase.field_70761_aq:F
        //   243: fstore          6
        //   245: getstatic       dev/nuker/pyro/fc.c:I
        //   248: ifge            256
        //   251: ldc             270269099
        //   253: goto            258
        //   256: ldc             887114524
        //   258: ldc             -739383294
        //   260: ixor           
        //   261: lookupswitch {
        //          -1007283543: 256
        //          -418536674: 288
        //          default: 1945
        //        }
        //   288: aload           5
        //   290: getfield        net/minecraft/entity/EntityLivingBase.field_70177_z:F
        //   293: fstore          7
        //   295: aload           5
        //   297: getfield        net/minecraft/entity/EntityLivingBase.field_70125_A:F
        //   300: getstatic       dev/nuker/pyro/fc.1:I
        //   303: ifeq            311
        //   306: ldc             -1975992329
        //   308: goto            313
        //   311: ldc             -234936154
        //   313: ldc             1537508165
        //   315: ixor           
        //   316: lookupswitch {
        //          -2046465877: 311
        //          -778289998: 1979
        //          default: 344
        //        }
        //   344: fstore          8
        //   346: aload           5
        //   348: getfield        net/minecraft/entity/EntityLivingBase.field_70758_at:F
        //   351: fstore          9
        //   353: getstatic       dev/nuker/pyro/fc.c:I
        //   356: ifge            364
        //   359: ldc             879730587
        //   361: goto            366
        //   364: ldc             1477528031
        //   366: ldc             -1432374699
        //   368: ixor           
        //   369: lookupswitch {
        //          -1628426802: 1969
        //          -1549825489: 364
        //          default: 396
        //        }
        //   396: aload           5
        //   398: getfield        net/minecraft/entity/EntityLivingBase.field_70759_as:F
        //   401: fstore          10
        //   403: ldc             135.0
        //   405: fconst_0       
        //   406: fconst_1       
        //   407: fconst_0       
        //   408: goto            412
        //   411: athrow         
        //   412: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179114_b:(FFFF)V
        //   415: goto            419
        //   418: athrow         
        //   419: getstatic       dev/nuker/pyro/fc.1:I
        //   422: ifeq            430
        //   425: ldc             -17308850
        //   427: goto            432
        //   430: ldc             -1170470326
        //   432: ldc             324429419
        //   434: ixor           
        //   435: lookupswitch {
        //          -1452643295: 460
        //          -308181723: 430
        //          default: 1971
        //        }
        //   460: goto            464
        //   463: athrow         
        //   464: invokestatic    net/minecraft/client/renderer/RenderHelper.func_74519_b:()V
        //   467: goto            471
        //   470: athrow         
        //   471: ldc             -135.0
        //   473: fconst_0       
        //   474: fconst_1       
        //   475: fconst_0       
        //   476: goto            480
        //   479: athrow         
        //   480: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179114_b:(FFFF)V
        //   483: goto            487
        //   486: athrow         
        //   487: fload           4
        //   489: ldc             40.0
        //   491: fdiv           
        //   492: f2d            
        //   493: goto            497
        //   496: athrow         
        //   497: invokestatic    java/lang/Math.atan:(D)D
        //   500: goto            504
        //   503: athrow         
        //   504: d2f            
        //   505: fneg           
        //   506: ldc             20.0
        //   508: fmul           
        //   509: fconst_1       
        //   510: fconst_0       
        //   511: fconst_0       
        //   512: getstatic       dev/nuker/pyro/fc.c:I
        //   515: ifge            523
        //   518: ldc             909041535
        //   520: goto            525
        //   523: ldc             128964361
        //   525: ldc             408439813
        //   527: ixor           
        //   528: lookupswitch {
        //          259445291: 523
        //          779522938: 1983
        //          default: 556
        //        }
        //   556: goto            560
        //   559: athrow         
        //   560: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179114_b:(FFFF)V
        //   563: goto            567
        //   566: athrow         
        //   567: aload           5
        //   569: fload_3        
        //   570: ldc             40.0
        //   572: fdiv           
        //   573: f2d            
        //   574: goto            578
        //   577: athrow         
        //   578: invokestatic    java/lang/Math.atan:(D)D
        //   581: goto            585
        //   584: athrow         
        //   585: d2f            
        //   586: ldc             20.0
        //   588: fmul           
        //   589: putfield        net/minecraft/entity/EntityLivingBase.field_70761_aq:F
        //   592: aload           5
        //   594: fload_3        
        //   595: ldc             40.0
        //   597: fdiv           
        //   598: f2d            
        //   599: goto            603
        //   602: athrow         
        //   603: invokestatic    java/lang/Math.atan:(D)D
        //   606: goto            610
        //   609: athrow         
        //   610: d2f            
        //   611: ldc             40.0
        //   613: fmul           
        //   614: getstatic       dev/nuker/pyro/fc.0:I
        //   617: ifeq            625
        //   620: ldc             379099835
        //   622: goto            627
        //   625: ldc             1295232113
        //   627: ldc             1663967490
        //   629: ixor           
        //   630: lookupswitch {
        //          773688691: 656
        //          1974909881: 625
        //          default: 1991
        //        }
        //   656: putfield        net/minecraft/entity/EntityLivingBase.field_70177_z:F
        //   659: getstatic       dev/nuker/pyro/fc.0:I
        //   662: ifeq            670
        //   665: ldc             -234108480
        //   667: goto            672
        //   670: ldc             -554006640
        //   672: ldc             740231514
        //   674: ixor           
        //   675: lookupswitch {
        //          -569065318: 670
        //          -219836726: 700
        //          default: 1965
        //        }
        //   700: aload           5
        //   702: fload           4
        //   704: ldc             40.0
        //   706: fdiv           
        //   707: f2d            
        //   708: goto            712
        //   711: athrow         
        //   712: invokestatic    java/lang/Math.atan:(D)D
        //   715: goto            719
        //   718: athrow         
        //   719: d2f            
        //   720: fneg           
        //   721: ldc             20.0
        //   723: fmul           
        //   724: putfield        net/minecraft/entity/EntityLivingBase.field_70125_A:F
        //   727: aload           5
        //   729: aload           5
        //   731: getfield        net/minecraft/entity/EntityLivingBase.field_70177_z:F
        //   734: putfield        net/minecraft/entity/EntityLivingBase.field_70759_as:F
        //   737: aload           5
        //   739: aload           5
        //   741: getstatic       dev/nuker/pyro/fc.1:I
        //   744: ifeq            752
        //   747: ldc             919307890
        //   749: goto            754
        //   752: ldc             -598465764
        //   754: ldc             -1631091899
        //   756: ixor           
        //   757: lookupswitch {
        //          -1475607241: 752
        //          1116971097: 784
        //          default: 1941
        //        }
        //   784: getfield        net/minecraft/entity/EntityLivingBase.field_70177_z:F
        //   787: getstatic       dev/nuker/pyro/fc.1:I
        //   790: ifeq            798
        //   793: ldc             -862015300
        //   795: goto            800
        //   798: ldc             -503719855
        //   800: ldc             -1357944599
        //   802: ixor           
        //   803: lookupswitch {
        //          1324789944: 828
        //          1670502485: 798
        //          default: 1939
        //        }
        //   828: putfield        net/minecraft/entity/EntityLivingBase.field_70758_at:F
        //   831: fconst_0       
        //   832: fconst_0       
        //   833: fconst_0       
        //   834: goto            838
        //   837: athrow         
        //   838: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //   841: goto            845
        //   844: athrow         
        //   845: getstatic       dev/nuker/pyro/fc.c:I
        //   848: ifge            856
        //   851: ldc             -1369924704
        //   853: goto            858
        //   856: ldc             1823377242
        //   858: ldc             313781965
        //   860: ixor           
        //   861: lookupswitch {
        //          -1125419667: 856
        //          2115856791: 888
        //          default: 1957
        //        }
        //   888: aload           5
        //   890: instanceof      Lnet/minecraft/entity/player/EntityPlayer;
        //   893: ifeq            896
        //   896: goto            900
        //   899: athrow         
        //   900: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   903: goto            907
        //   906: athrow         
        //   907: goto            911
        //   910: athrow         
        //   911: invokevirtual   net/minecraft/client/Minecraft.func_175598_ae:()Lnet/minecraft/client/renderer/entity/RenderManager;
        //   914: goto            918
        //   917: athrow         
        //   918: astore          11
        //   920: aload           11
        //   922: ldc             180.0
        //   924: getstatic       dev/nuker/pyro/fc.0:I
        //   927: ifeq            935
        //   930: ldc             992569431
        //   932: goto            937
        //   935: ldc             1336569620
        //   937: ldc             -1022765804
        //   939: ixor           
        //   940: lookupswitch {
        //          -132072125: 1963
        //          1532523236: 935
        //          default: 968
        //        }
        //   968: goto            972
        //   971: athrow         
        //   972: invokevirtual   net/minecraft/client/renderer/entity/RenderManager.func_178631_a:(F)V
        //   975: goto            979
        //   978: athrow         
        //   979: aload           11
        //   981: iconst_0       
        //   982: goto            986
        //   985: athrow         
        //   986: invokevirtual   net/minecraft/client/renderer/entity/RenderManager.func_178633_a:(Z)V
        //   989: goto            993
        //   992: athrow         
        //   993: aload           11
        //   995: getstatic       dev/nuker/pyro/fc.1:I
        //   998: ifeq            1007
        //  1001: ldc_w           -668156773
        //  1004: goto            1010
        //  1007: ldc_w           1274714820
        //  1010: ldc_w           1452078173
        //  1013: ixor           
        //  1014: lookupswitch {
        //          -1902098234: 1981
        //          1939252289: 1007
        //          default: 1040
        //        }
        //  1040: aload           5
        //  1042: dconst_0       
        //  1043: dconst_0       
        //  1044: dconst_0       
        //  1045: fconst_0       
        //  1046: fconst_1       
        //  1047: iconst_1       
        //  1048: goto            1052
        //  1051: athrow         
        //  1052: invokevirtual   net/minecraft/client/renderer/entity/RenderManager.func_188391_a:(Lnet/minecraft/entity/Entity;DDDFFZ)V
        //  1055: goto            1059
        //  1058: athrow         
        //  1059: getstatic       dev/nuker/pyro/fc.c:I
        //  1062: ifge            1071
        //  1065: ldc_w           -1521575932
        //  1068: goto            1074
        //  1071: ldc_w           1236436418
        //  1074: ldc_w           982006067
        //  1077: ixor           
        //  1078: lookupswitch {
        //          -1614372553: 1947
        //          1653776579: 1071
        //          default: 1104
        //        }
        //  1104: aload           11
        //  1106: iconst_1       
        //  1107: goto            1111
        //  1110: athrow         
        //  1111: invokevirtual   net/minecraft/client/renderer/entity/RenderManager.func_178633_a:(Z)V
        //  1114: goto            1118
        //  1117: athrow         
        //  1118: aload           5
        //  1120: fload           6
        //  1122: putfield        net/minecraft/entity/EntityLivingBase.field_70761_aq:F
        //  1125: aload           5
        //  1127: getstatic       dev/nuker/pyro/fc.1:I
        //  1130: ifeq            1139
        //  1133: ldc_w           1214580375
        //  1136: goto            1142
        //  1139: ldc_w           151158471
        //  1142: ldc_w           -1614232806
        //  1145: ixor           
        //  1146: lookupswitch {
        //          -2145143175: 1139
        //          -676477555: 1951
        //          default: 1172
        //        }
        //  1172: fload           7
        //  1174: putfield        net/minecraft/entity/EntityLivingBase.field_70177_z:F
        //  1177: aload           5
        //  1179: getstatic       dev/nuker/pyro/fc.1:I
        //  1182: ifeq            1191
        //  1185: ldc_w           -1316718020
        //  1188: goto            1194
        //  1191: ldc_w           1367434691
        //  1194: ldc_w           -1333884624
        //  1197: ixor           
        //  1198: lookupswitch {
        //          -503321357: 1224
        //          33223436: 1191
        //          default: 1987
        //        }
        //  1224: fload           8
        //  1226: putfield        net/minecraft/entity/EntityLivingBase.field_70125_A:F
        //  1229: aload           5
        //  1231: fload           9
        //  1233: getstatic       dev/nuker/pyro/fc.c:I
        //  1236: ifge            1245
        //  1239: ldc_w           -1149563146
        //  1242: goto            1248
        //  1245: ldc_w           -99578212
        //  1248: ldc_w           1536941021
        //  1251: ixor           
        //  1252: lookupswitch {
        //          -1713158394: 1245
        //          -522136277: 1961
        //          default: 1280
        //        }
        //  1280: putfield        net/minecraft/entity/EntityLivingBase.field_70758_at:F
        //  1283: getstatic       dev/nuker/pyro/fc.0:I
        //  1286: ifeq            1295
        //  1289: ldc_w           1567205748
        //  1292: goto            1298
        //  1295: ldc_w           -368591594
        //  1298: ldc_w           -1621085023
        //  1301: ixor           
        //  1302: lookupswitch {
        //          -1569582221: 1295
        //          -1039557163: 1955
        //          default: 1328
        //        }
        //  1328: aload           5
        //  1330: getstatic       dev/nuker/pyro/fc.c:I
        //  1333: ifge            1342
        //  1336: ldc_w           1515899960
        //  1339: goto            1345
        //  1342: ldc_w           559793144
        //  1345: ldc_w           -2124226498
        //  1348: ixor           
        //  1349: lookupswitch {
        //          -1606474810: 1376
        //          -617075706: 1342
        //          default: 1973
        //        }
        //  1376: fload           10
        //  1378: putfield        net/minecraft/entity/EntityLivingBase.field_70759_as:F
        //  1381: goto            1385
        //  1384: athrow         
        //  1385: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //  1388: goto            1392
        //  1391: athrow         
        //  1392: goto            1396
        //  1395: athrow         
        //  1396: invokestatic    net/minecraft/client/renderer/RenderHelper.func_74518_a:()V
        //  1399: goto            1403
        //  1402: athrow         
        //  1403: goto            1407
        //  1406: athrow         
        //  1407: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179101_C:()V
        //  1410: goto            1414
        //  1413: athrow         
        //  1414: getstatic       net/minecraft/client/renderer/OpenGlHelper.field_77476_b:I
        //  1417: getstatic       dev/nuker/pyro/fc.0:I
        //  1420: ifeq            1429
        //  1423: ldc_w           139795359
        //  1426: goto            1432
        //  1429: ldc_w           705867449
        //  1432: ldc_w           -774759561
        //  1435: ixor           
        //  1436: lookupswitch {
        //          -645463832: 1967
        //          917560557: 1429
        //          default: 1464
        //        }
        //  1464: goto            1468
        //  1467: athrow         
        //  1468: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179138_g:(I)V
        //  1471: goto            1475
        //  1474: athrow         
        //  1475: getstatic       dev/nuker/pyro/fc.c:I
        //  1478: ifge            1487
        //  1481: ldc_w           932047420
        //  1484: goto            1490
        //  1487: ldc_w           -822115536
        //  1490: ldc_w           917713385
        //  1493: ixor           
        //  1494: lookupswitch {
        //          -129191207: 1520
        //          20896725: 1487
        //          default: 1977
        //        }
        //  1520: goto            1524
        //  1523: athrow         
        //  1524: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179090_x:()V
        //  1527: goto            1531
        //  1530: athrow         
        //  1531: getstatic       net/minecraft/client/renderer/OpenGlHelper.field_77478_a:I
        //  1534: getstatic       dev/nuker/pyro/fc.c:I
        //  1537: ifge            1546
        //  1540: ldc_w           -1522236492
        //  1543: goto            1549
        //  1546: ldc_w           545470953
        //  1549: ldc_w           -947143910
        //  1552: ixor           
        //  1553: lookupswitch {
        //          -734483388: 1546
        //          1657747630: 1975
        //          default: 1580
        //        }
        //  1580: goto            1584
        //  1583: athrow         
        //  1584: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179138_g:(I)V
        //  1587: goto            1591
        //  1590: athrow         
        //  1591: fconst_0       
        //  1592: fconst_0       
        //  1593: ldc             20.0
        //  1595: goto            1599
        //  1598: athrow         
        //  1599: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //  1602: goto            1606
        //  1605: athrow         
        //  1606: goto            1610
        //  1609: athrow         
        //  1610: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179117_G:()V
        //  1613: goto            1617
        //  1616: athrow         
        //  1617: goto            1938
        //  1620: getstatic       dev/nuker/pyro/fc.c:I
        //  1623: ifge            1632
        //  1626: ldc_w           1940755917
        //  1629: goto            1635
        //  1632: ldc_w           1121168120
        //  1635: ldc_w           -1203678655
        //  1638: ixor           
        //  1639: lookupswitch {
        //          -881584547: 1632
        //          -873674868: 1959
        //          default: 1664
        //        }
        //  1664: astore          12
        //  1666: aload           5
        //  1668: fload           6
        //  1670: putfield        net/minecraft/entity/EntityLivingBase.field_70761_aq:F
        //  1673: aload           5
        //  1675: fload           7
        //  1677: putfield        net/minecraft/entity/EntityLivingBase.field_70177_z:F
        //  1680: aload           5
        //  1682: fload           8
        //  1684: putfield        net/minecraft/entity/EntityLivingBase.field_70125_A:F
        //  1687: aload           5
        //  1689: fload           9
        //  1691: putfield        net/minecraft/entity/EntityLivingBase.field_70758_at:F
        //  1694: aload           5
        //  1696: fload           10
        //  1698: getstatic       dev/nuker/pyro/fc.1:I
        //  1701: ifeq            1710
        //  1704: ldc_w           -1517505919
        //  1707: goto            1713
        //  1710: ldc_w           530285747
        //  1713: ldc_w           956294551
        //  1716: ixor           
        //  1717: lookupswitch {
        //          -1653385450: 1710
        //          660889892: 1744
        //          default: 1949
        //        }
        //  1744: putfield        net/minecraft/entity/EntityLivingBase.field_70759_as:F
        //  1747: getstatic       dev/nuker/pyro/fc.1:I
        //  1750: ifeq            1759
        //  1753: ldc_w           -2111316414
        //  1756: goto            1762
        //  1759: ldc_w           -1291544743
        //  1762: ldc_w           -840738694
        //  1765: ixor           
        //  1766: lookupswitch {
        //          479808068: 1759
        //          1338279480: 1989
        //          default: 1792
        //        }
        //  1792: goto            1796
        //  1795: athrow         
        //  1796: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //  1799: goto            1803
        //  1802: athrow         
        //  1803: goto            1807
        //  1806: athrow         
        //  1807: invokestatic    net/minecraft/client/renderer/RenderHelper.func_74518_a:()V
        //  1810: goto            1814
        //  1813: athrow         
        //  1814: goto            1818
        //  1817: athrow         
        //  1818: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179101_C:()V
        //  1821: goto            1825
        //  1824: athrow         
        //  1825: getstatic       net/minecraft/client/renderer/OpenGlHelper.field_77476_b:I
        //  1828: goto            1832
        //  1831: athrow         
        //  1832: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179138_g:(I)V
        //  1835: goto            1839
        //  1838: athrow         
        //  1839: getstatic       dev/nuker/pyro/fc.0:I
        //  1842: ifeq            1851
        //  1845: ldc_w           2119204507
        //  1848: goto            1854
        //  1851: ldc_w           -1496180095
        //  1854: ldc_w           -1107109290
        //  1857: ixor           
        //  1858: lookupswitch {
        //          -1068325683: 1851
        //          416334039: 1884
        //          default: 1985
        //        }
        //  1884: goto            1888
        //  1887: athrow         
        //  1888: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179090_x:()V
        //  1891: goto            1895
        //  1894: athrow         
        //  1895: getstatic       net/minecraft/client/renderer/OpenGlHelper.field_77478_a:I
        //  1898: goto            1902
        //  1901: athrow         
        //  1902: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179138_g:(I)V
        //  1905: goto            1909
        //  1908: athrow         
        //  1909: fconst_0       
        //  1910: fconst_0       
        //  1911: ldc             20.0
        //  1913: goto            1917
        //  1916: athrow         
        //  1917: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //  1920: goto            1924
        //  1923: athrow         
        //  1924: goto            1928
        //  1927: athrow         
        //  1928: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179117_G:()V
        //  1931: goto            1935
        //  1934: athrow         
        //  1935: aload           12
        //  1937: athrow         
        //  1938: return         
        //  1939: aconst_null    
        //  1940: athrow         
        //  1941: aconst_null    
        //  1942: athrow         
        //  1943: aconst_null    
        //  1944: athrow         
        //  1945: aconst_null    
        //  1946: athrow         
        //  1947: aconst_null    
        //  1948: athrow         
        //  1949: aconst_null    
        //  1950: athrow         
        //  1951: aconst_null    
        //  1952: athrow         
        //  1953: aconst_null    
        //  1954: athrow         
        //  1955: aconst_null    
        //  1956: athrow         
        //  1957: aconst_null    
        //  1958: athrow         
        //  1959: aconst_null    
        //  1960: athrow         
        //  1961: aconst_null    
        //  1962: athrow         
        //  1963: aconst_null    
        //  1964: athrow         
        //  1965: aconst_null    
        //  1966: athrow         
        //  1967: aconst_null    
        //  1968: athrow         
        //  1969: aconst_null    
        //  1970: athrow         
        //  1971: aconst_null    
        //  1972: athrow         
        //  1973: aconst_null    
        //  1974: athrow         
        //  1975: aconst_null    
        //  1976: athrow         
        //  1977: aconst_null    
        //  1978: athrow         
        //  1979: aconst_null    
        //  1980: athrow         
        //  1981: aconst_null    
        //  1982: athrow         
        //  1983: aconst_null    
        //  1984: athrow         
        //  1985: aconst_null    
        //  1986: athrow         
        //  1987: aconst_null    
        //  1988: athrow         
        //  1989: aconst_null    
        //  1990: athrow         
        //  1991: aconst_null    
        //  1992: athrow         
        //  1993: pop            
        //  1994: goto            24
        //  1997: pop            
        //  1998: aconst_null    
        //  1999: goto            1993
        //  2002: dup            
        //  2003: ifnull          1993
        //  2006: checkcast       Ljava/lang/Throwable;
        //  2009: athrow         
        //  2010: dup            
        //  2011: ifnull          1997
        //  2014: checkcast       Ljava/lang/Throwable;
        //  2017: athrow         
        //  2018: aconst_null    
        //  2019: athrow         
        //    StackMapTable: 01 1C 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FF 00 03 00 06 01 01 02 02 02 07 00 3C 00 00 42 07 00 21 00 45 07 00 21 00 43 07 00 21 40 01 45 07 00 21 00 0A 41 01 1B 42 07 00 21 00 45 07 00 21 00 42 07 00 8C 00 45 07 00 21 00 42 07 00 21 00 45 07 00 21 00 42 07 00 21 00 45 07 00 21 00 46 07 00 21 FF 00 00 00 06 01 01 02 02 02 07 00 3C 00 04 02 02 02 02 45 07 00 21 00 48 07 00 17 FF 00 00 00 06 01 01 02 02 02 07 00 3C 00 03 02 02 02 45 07 00 21 00 46 07 00 4B FF 00 00 00 06 01 01 02 02 02 07 00 3C 00 03 02 02 02 45 07 00 21 00 47 07 00 4D FF 00 00 00 06 01 01 02 02 02 07 00 3C 00 04 02 02 02 02 45 07 00 21 00 4C 07 00 3C FF 00 01 00 06 01 01 02 02 02 07 00 3C 00 02 07 00 3C 01 5D 07 00 3C FC 00 0F 02 41 01 1D FF 00 16 00 08 01 01 02 02 02 07 00 3C 02 02 00 01 02 FF 00 01 00 08 01 01 02 02 02 07 00 3C 02 02 00 02 02 01 5E 02 FD 00 13 02 02 41 01 1D FF 00 0E 00 00 00 01 07 00 21 FF 00 00 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 04 02 02 02 02 45 07 00 21 00 0A 41 01 1B 42 07 00 21 00 45 07 00 21 00 47 07 00 21 FF 00 00 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 04 02 02 02 02 45 07 00 21 00 48 07 00 21 40 03 45 07 00 21 40 03 FF 00 12 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 04 02 02 02 02 FF 00 01 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 05 02 02 02 02 01 FF 00 1E 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 04 02 02 02 02 42 07 00 17 FF 00 00 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 04 02 02 02 02 45 07 00 21 00 49 07 00 21 FF 00 00 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 02 07 00 3C 03 45 07 00 21 FF 00 00 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 02 07 00 3C 03 50 07 00 21 FF 00 00 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 02 07 00 3C 03 45 07 00 21 FF 00 00 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 02 07 00 3C 03 FF 00 0E 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 02 07 00 3C 02 FF 00 01 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 03 07 00 3C 02 01 FF 00 1C 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 02 07 00 3C 02 0D 41 01 1B 4A 07 00 15 FF 00 00 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 02 07 00 3C 03 45 07 00 21 FF 00 00 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 02 07 00 3C 03 FF 00 20 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 02 07 00 3C 07 00 3C FF 00 01 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 03 07 00 3C 07 00 3C 01 FF 00 1D 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 02 07 00 3C 07 00 3C FF 00 0D 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 02 07 00 3C 02 FF 00 01 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 03 07 00 3C 02 01 FF 00 1B 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 02 07 00 3C 02 FF 00 08 00 00 00 01 07 00 21 FF 00 00 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 03 02 02 02 45 07 00 21 00 0A 41 01 1D 07 42 07 00 21 00 45 07 00 21 40 07 00 23 42 07 00 21 40 07 00 23 45 07 00 21 40 07 00 2D FF 00 10 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 02 07 00 2D 02 FF 00 01 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 03 07 00 2D 02 01 FF 00 1E 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 02 07 00 2D 02 42 07 00 21 FF 00 00 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 02 07 00 2D 02 45 07 00 21 00 45 07 00 45 FF 00 00 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 02 07 00 2D 01 45 07 00 21 00 4D 07 00 2D FF 00 02 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 02 07 00 2D 01 5D 07 00 2D 4A 07 00 8C FF 00 00 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 08 07 00 2D 07 00 3C 03 03 03 02 02 01 45 07 00 21 00 0B 42 01 1D 45 07 00 8C FF 00 00 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 02 07 00 2D 01 45 07 00 21 00 54 07 00 3C FF 00 02 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 02 07 00 3C 01 5D 07 00 3C 52 07 00 3C FF 00 02 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 02 07 00 3C 01 5D 07 00 3C FF 00 14 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 02 07 00 3C 02 FF 00 02 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 03 07 00 3C 02 01 FF 00 1F 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 02 07 00 3C 02 0E 42 01 1D 4D 07 00 3C FF 00 02 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 02 07 00 3C 01 5E 07 00 3C 47 07 00 88 00 45 07 00 21 00 FF 00 02 00 00 00 01 07 00 21 FF 00 00 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 00 45 07 00 21 00 42 07 00 21 00 45 07 00 21 00 4E 01 FF 00 02 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 02 01 01 5F 01 42 07 00 21 40 01 45 07 00 21 00 0B 42 01 1D 42 07 00 21 00 45 07 00 21 00 4E 01 FF 00 02 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 02 01 01 5E 01 42 07 00 21 40 01 45 07 00 21 00 FF 00 06 00 00 00 01 07 00 21 FF 00 00 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 03 02 02 02 45 07 00 21 00 42 07 00 21 00 45 07 00 21 00 FF 00 02 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 01 07 00 21 4B 07 00 21 FF 00 02 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 02 07 00 21 01 5C 07 00 21 FF 00 2D 00 0D 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 07 00 21 00 02 07 00 3C 02 FF 00 02 00 0D 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 07 00 21 00 03 07 00 3C 02 01 FF 00 1E 00 0D 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 07 00 21 00 02 07 00 3C 02 0E 42 01 1D 42 07 00 21 00 45 07 00 21 00 42 07 00 8C 00 45 07 00 21 00 42 07 00 86 00 45 07 00 21 00 45 07 00 21 40 01 45 07 00 21 00 0B 42 01 1D 42 07 00 8C 00 45 07 00 21 00 45 07 00 21 40 01 45 07 00 21 00 46 07 00 21 FF 00 00 00 0D 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 07 00 21 00 03 02 02 02 45 07 00 21 00 42 07 00 21 00 45 07 00 21 00 FF 00 02 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 00 FF 00 00 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 02 07 00 3C 02 FF 00 01 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 02 07 00 3C 07 00 3C FF 00 01 00 06 01 01 02 02 02 07 00 3C 00 00 FC 00 01 02 FF 00 01 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 00 FF 00 01 00 0D 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 07 00 21 00 02 07 00 3C 02 FF 00 01 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 01 07 00 3C FF 00 01 00 06 01 01 02 02 02 07 00 3C 00 01 07 00 3C FF 00 01 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 00 FA 00 01 41 07 00 21 FF 00 01 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 02 07 00 3C 02 FF 00 01 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 02 07 00 2D 02 FA 00 01 FF 00 01 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 01 01 F9 00 01 FC 00 01 02 FF 00 01 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 01 07 00 3C 41 01 01 FF 00 01 00 08 01 01 02 02 02 07 00 3C 02 02 00 01 02 FF 00 01 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 01 07 00 2D FF 00 01 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 04 02 02 02 02 FD 00 01 00 07 00 21 FF 00 01 00 0C 01 01 02 02 02 07 00 3C 02 02 02 02 02 07 00 2D 00 01 07 00 3C FF 00 01 00 0D 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 07 00 21 00 00 FF 00 01 00 0B 01 01 02 02 02 07 00 3C 02 02 02 02 02 00 02 07 00 3C 02 FF 00 01 00 06 01 01 02 02 02 07 00 3C 00 01 07 00 21 43 05 44 07 00 21 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  896    1118   1620   1991   Any
        //  1620   1666   1620   1991   Any
        //  8      20     2002   2010   Any
        //  2002   2010   2002   2010   Ljava/lang/NullPointerException;
        //  2018   2020   3      8      Any
        //  27     34     34     35     Any
        //  28     34     3      8      Ljava/lang/ArithmeticException;
        //  28     34     27     28     Any
        //  27     34     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  27     34     34     35     Any
        //  39     46     46     47     Any
        //  39     46     3      8      Ljava/lang/IllegalStateException;
        //  39     46     39     40     Any
        //  40     46     46     47     Any
        //  39     46     3      8      Any
        //  91     98     98     99     Any
        //  92     98     3      8      Any
        //  91     98     91     92     Ljava/lang/IndexOutOfBoundsException;
        //  91     98     91     92     Any
        //  91     98     91     92     Any
        //  102    109    109    110    Any
        //  102    109    102    103    Ljava/lang/NumberFormatException;
        //  102    109    109    110    Ljava/lang/RuntimeException;
        //  102    109    102    103    Ljava/util/NoSuchElementException;
        //  103    109    109    110    Any
        //  113    120    120    121    Any
        //  114    120    120    121    Any
        //  113    120    113    114    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  114    120    113    114    Any
        //  114    120    113    114    Any
        //  124    131    131    132    Any
        //  124    131    3      8      Ljava/lang/AssertionError;
        //  124    131    3      8      Ljava/util/ConcurrentModificationException;
        //  125    131    3      8      Any
        //  125    131    124    125    Any
        //  139    146    146    147    Any
        //  139    146    146    147    Ljava/lang/NullPointerException;
        //  139    146    146    147    Any
        //  140    146    3      8      Ljava/lang/UnsupportedOperationException;
        //  140    146    139    140    Any
        //  156    163    163    164    Any
        //  156    163    156    157    Ljava/lang/ClassCastException;
        //  156    163    163    164    Ljava/lang/IllegalArgumentException;
        //  156    163    3      8      Any
        //  157    163    163    164    Ljava/util/ConcurrentModificationException;
        //  171    178    178    179    Any
        //  172    178    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  171    178    3      8      Ljava/lang/UnsupportedOperationException;
        //  171    178    171    172    Ljava/lang/EnumConstantNotPresentException;
        //  171    178    178    179    Ljava/lang/ClassCastException;
        //  187    194    194    195    Any
        //  187    194    194    195    Any
        //  187    194    194    195    Ljava/lang/ClassCastException;
        //  188    194    194    195    Any
        //  187    194    187    188    Ljava/lang/NullPointerException;
        //  412    418    418    419    Any
        //  412    418    418    419    Ljava/lang/AssertionError;
        //  412    418    418    419    Any
        //  412    418    3      8      Any
        //  412    418    3      8      Ljava/lang/ClassCastException;
        //  463    470    470    471    Any
        //  464    470    470    471    Any
        //  464    470    463    464    Any
        //  463    470    3      8      Ljava/lang/NegativeArraySizeException;
        //  463    470    470    471    Ljava/lang/ArithmeticException;
        //  479    486    486    487    Any
        //  479    486    486    487    Any
        //  480    486    479    480    Any
        //  479    486    3      8      Any
        //  479    486    3      8      Any
        //  496    503    503    504    Any
        //  497    503    503    504    Ljava/lang/IllegalStateException;
        //  496    503    496    497    Any
        //  497    503    496    497    Ljava/lang/StringIndexOutOfBoundsException;
        //  496    503    3      8      Ljava/lang/NegativeArraySizeException;
        //  559    566    566    567    Any
        //  559    566    3      8      Any
        //  559    566    3      8      Any
        //  560    566    566    567    Ljava/lang/EnumConstantNotPresentException;
        //  559    566    559    560    Ljava/lang/ClassCastException;
        //  577    584    584    585    Any
        //  578    584    577    578    Any
        //  578    584    577    578    Ljava/lang/AssertionError;
        //  578    584    3      8      Any
        //  578    584    584    585    Any
        //  602    609    609    610    Any
        //  603    609    3      8      Any
        //  603    609    602    603    Any
        //  602    609    602    603    Any
        //  602    609    602    603    Any
        //  711    718    718    719    Any
        //  712    718    3      8      Ljava/lang/NullPointerException;
        //  711    718    718    719    Any
        //  711    718    711    712    Ljava/lang/NegativeArraySizeException;
        //  711    718    3      8      Any
        //  838    844    844    845    Any
        //  838    844    3      8      Ljava/lang/NullPointerException;
        //  838    844    844    845    Ljava/lang/ClassCastException;
        //  838    844    3      8      Any
        //  838    844    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  899    906    906    907    Any
        //  900    906    906    907    Any
        //  899    906    906    907    Ljava/util/ConcurrentModificationException;
        //  899    906    906    907    Any
        //  899    906    899    900    Any
        //  910    917    917    918    Any
        //  911    917    917    918    Ljava/lang/AssertionError;
        //  911    917    3      8      Any
        //  911    917    910    911    Any
        //  910    917    917    918    Ljava/lang/NegativeArraySizeException;
        //  971    978    978    979    Any
        //  971    978    971    972    Any
        //  971    978    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  972    978    978    979    Ljava/lang/NegativeArraySizeException;
        //  972    978    978    979    Any
        //  985    992    992    993    Any
        //  985    992    985    986    Ljava/lang/IllegalArgumentException;
        //  985    992    992    993    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  985    992    992    993    Any
        //  985    992    3      8      Any
        //  1051   1058   1058   1059   Any
        //  1052   1058   3      8      Ljava/lang/RuntimeException;
        //  1052   1058   3      8      Any
        //  1052   1058   1051   1052   Ljava/lang/RuntimeException;
        //  1051   1058   3      8      Ljava/lang/UnsupportedOperationException;
        //  1110   1117   1117   1118   Any
        //  1111   1117   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1110   1117   1110   1111   Ljava/lang/RuntimeException;
        //  1110   1117   3      8      Any
        //  1110   1117   1110   1111   Ljava/lang/IndexOutOfBoundsException;
        //  1384   1391   1391   1392   Any
        //  1385   1391   3      8      Ljava/util/NoSuchElementException;
        //  1384   1391   1384   1385   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1385   1391   1391   1392   Any
        //  1385   1391   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1396   1402   1402   1403   Any
        //  1396   1402   3      8      Any
        //  1396   1402   3      8      Any
        //  1396   1402   1402   1403   Ljava/lang/IndexOutOfBoundsException;
        //  1396   1402   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1406   1413   1413   1414   Any
        //  1406   1413   1406   1407   Ljava/lang/AssertionError;
        //  1406   1413   1406   1407   Ljava/lang/IndexOutOfBoundsException;
        //  1406   1413   1413   1414   Ljava/lang/EnumConstantNotPresentException;
        //  1407   1413   1413   1414   Any
        //  1467   1474   1474   1475   Any
        //  1467   1474   1474   1475   Any
        //  1468   1474   1474   1475   Ljava/lang/NegativeArraySizeException;
        //  1467   1474   1467   1468   Any
        //  1467   1474   1474   1475   Ljava/lang/NegativeArraySizeException;
        //  1523   1530   1530   1531   Any
        //  1524   1530   1523   1524   Ljava/lang/UnsupportedOperationException;
        //  1524   1530   1530   1531   Any
        //  1524   1530   1523   1524   Any
        //  1523   1530   3      8      Ljava/lang/NumberFormatException;
        //  1583   1590   1590   1591   Any
        //  1583   1590   3      8      Any
        //  1584   1590   1583   1584   Ljava/lang/IndexOutOfBoundsException;
        //  1584   1590   3      8      Any
        //  1584   1590   1583   1584   Any
        //  1599   1605   1605   1606   Any
        //  1599   1605   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1599   1605   3      8      Any
        //  1599   1605   1605   1606   Ljava/lang/ArithmeticException;
        //  1599   1605   1605   1606   Any
        //  1609   1616   1616   1617   Any
        //  1609   1616   1609   1610   Any
        //  1610   1616   1616   1617   Any
        //  1610   1616   1616   1617   Ljava/util/NoSuchElementException;
        //  1609   1616   3      8      Ljava/lang/NegativeArraySizeException;
        //  1795   1802   1802   1803   Any
        //  1795   1802   1802   1803   Ljava/util/NoSuchElementException;
        //  1796   1802   1795   1796   Ljava/lang/AssertionError;
        //  1795   1802   1802   1803   Any
        //  1795   1802   1795   1796   Ljava/lang/IllegalStateException;
        //  1806   1813   1813   1814   Any
        //  1806   1813   1806   1807   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1806   1813   3      8      Any
        //  1807   1813   1813   1814   Any
        //  1807   1813   1806   1807   Ljava/lang/NegativeArraySizeException;
        //  1817   1824   1824   1825   Any
        //  1818   1824   1824   1825   Any
        //  1817   1824   1817   1818   Ljava/lang/ArithmeticException;
        //  1818   1824   1824   1825   Ljava/lang/ArithmeticException;
        //  1818   1824   3      8      Any
        //  1831   1838   1838   1839   Any
        //  1832   1838   1838   1839   Any
        //  1831   1838   1838   1839   Any
        //  1832   1838   1831   1832   Any
        //  1832   1838   3      8      Ljava/lang/NegativeArraySizeException;
        //  1887   1894   1894   1895   Any
        //  1887   1894   1894   1895   Any
        //  1888   1894   1887   1888   Ljava/lang/IllegalStateException;
        //  1888   1894   1887   1888   Ljava/lang/NegativeArraySizeException;
        //  1887   1894   1887   1888   Ljava/lang/IllegalStateException;
        //  1901   1908   1908   1909   Any
        //  1902   1908   1908   1909   Ljava/lang/IndexOutOfBoundsException;
        //  1902   1908   3      8      Any
        //  1902   1908   1901   1902   Any
        //  1901   1908   1901   1902   Any
        //  1916   1923   1923   1924   Any
        //  1917   1923   1923   1924   Any
        //  1916   1923   1923   1924   Ljava/lang/UnsupportedOperationException;
        //  1917   1923   1916   1917   Any
        //  1916   1923   3      8      Ljava/lang/UnsupportedOperationException;
        //  1927   1934   1934   1935   Any
        //  1928   1934   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1927   1934   3      8      Ljava/lang/IllegalStateException;
        //  1928   1934   3      8      Any
        //  1927   1934   1927   1928   Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:590)
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
    
    public static void c(final Minecraft p0, final World p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1763
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1755
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1747
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: fconst_1       
        //    26: goto            30
        //    29: athrow         
        //    30: invokevirtual   net/minecraft/world/World.func_72971_b:(F)F
        //    33: goto            37
        //    36: athrow         
        //    37: getstatic       dev/nuker/pyro/fc.c:I
        //    40: ifge            49
        //    43: ldc_w           -111215955
        //    46: goto            52
        //    49: ldc_w           -1375435332
        //    52: ldc_w           1343225446
        //    55: ixor           
        //    56: lookupswitch {
        //          -1454308149: 49
        //          -32801830: 84
        //          default: 1734
        //        }
        //    84: fstore_2       
        //    85: fload_2        
        //    86: ldc_w           0.95
        //    89: fmul           
        //    90: ldc_w           0.05
        //    93: fadd           
        //    94: fstore_3       
        //    95: iconst_0       
        //    96: istore          4
        //    98: getstatic       dev/nuker/pyro/fc.0:I
        //   101: ifeq            110
        //   104: ldc_w           -1444824553
        //   107: goto            113
        //   110: ldc_w           1942949875
        //   113: ldc_w           -1519531002
        //   116: ixor           
        //   117: lookupswitch {
        //          -693976075: 144
        //          210531857: 110
        //          default: 1730
        //        }
        //   144: iload           4
        //   146: sipush          256
        //   149: if_icmpge       1662
        //   152: aload_1        
        //   153: getstatic       dev/nuker/pyro/fc.1:I
        //   156: ifeq            165
        //   159: ldc_w           1106137227
        //   162: goto            168
        //   165: ldc_w           -1305060688
        //   168: ldc_w           658381279
        //   171: ixor           
        //   172: lookupswitch {
        //          -1794620561: 200
        //          1724926292: 165
        //          default: 1710
        //        }
        //   200: getfield        net/minecraft/world/World.field_73011_w:Lnet/minecraft/world/WorldProvider;
        //   203: goto            207
        //   206: athrow         
        //   207: invokevirtual   net/minecraft/world/WorldProvider.func_177497_p:()[F
        //   210: goto            214
        //   213: athrow         
        //   214: iload           4
        //   216: bipush          16
        //   218: idiv           
        //   219: faload         
        //   220: fload_3        
        //   221: fmul           
        //   222: fstore          5
        //   224: aload_1        
        //   225: getfield        net/minecraft/world/World.field_73011_w:Lnet/minecraft/world/WorldProvider;
        //   228: goto            232
        //   231: athrow         
        //   232: invokevirtual   net/minecraft/world/WorldProvider.func_177497_p:()[F
        //   235: goto            239
        //   238: athrow         
        //   239: getstatic       dev/nuker/pyro/fc.1:I
        //   242: ifeq            251
        //   245: ldc_w           1393994616
        //   248: goto            254
        //   251: ldc_w           1200812546
        //   254: ldc_w           -1414734239
        //   257: ixor           
        //   258: lookupswitch {
        //          -1140496458: 251
        //          -121998055: 1704
        //          default: 284
        //        }
        //   284: iload           4
        //   286: bipush          16
        //   288: irem           
        //   289: faload         
        //   290: fstore          6
        //   292: fload           5
        //   294: fload_2        
        //   295: ldc_w           0.65
        //   298: fmul           
        //   299: ldc_w           0.35
        //   302: fadd           
        //   303: fmul           
        //   304: getstatic       dev/nuker/pyro/fc.c:I
        //   307: ifge            316
        //   310: ldc_w           522039794
        //   313: goto            319
        //   316: ldc_w           973469085
        //   319: ldc_w           -256770529
        //   322: ixor           
        //   323: lookupswitch {
        //          -273920019: 1706
        //          1532253882: 316
        //          default: 348
        //        }
        //   348: fstore          7
        //   350: fload           5
        //   352: fload_2        
        //   353: ldc_w           0.65
        //   356: fmul           
        //   357: ldc_w           0.35
        //   360: fadd           
        //   361: fmul           
        //   362: fstore          8
        //   364: fload           6
        //   366: fload           6
        //   368: ldc_w           0.6
        //   371: fmul           
        //   372: ldc_w           0.4
        //   375: fadd           
        //   376: ldc_w           0.6
        //   379: fmul           
        //   380: ldc_w           0.4
        //   383: fadd           
        //   384: fmul           
        //   385: fstore          9
        //   387: getstatic       dev/nuker/pyro/fc.c:I
        //   390: ifge            399
        //   393: ldc_w           889269258
        //   396: goto            402
        //   399: ldc_w           1521304597
        //   402: ldc_w           1590858403
        //   405: ixor           
        //   406: lookupswitch {
        //          75486902: 432
        //          1809039017: 399
        //          default: 1718
        //        }
        //   432: fload           6
        //   434: fload           6
        //   436: fload           6
        //   438: fmul           
        //   439: ldc_w           0.6
        //   442: fmul           
        //   443: ldc_w           0.4
        //   446: fadd           
        //   447: fmul           
        //   448: getstatic       dev/nuker/pyro/fc.c:I
        //   451: ifge            460
        //   454: ldc_w           1381676276
        //   457: goto            463
        //   460: ldc_w           -316249908
        //   463: ldc_w           -199004124
        //   466: ixor           
        //   467: lookupswitch {
        //          -1501969200: 460
        //          419764456: 492
        //          default: 1694
        //        }
        //   492: fstore          10
        //   494: getstatic       dev/nuker/pyro/fc.0:I
        //   497: ifeq            506
        //   500: ldc_w           -1544924633
        //   503: goto            509
        //   506: ldc_w           -1920139187
        //   509: ldc_w           -1468620764
        //   512: ixor           
        //   513: lookupswitch {
        //          194834947: 1696
        //          1254737789: 506
        //          default: 540
        //        }
        //   540: fload           7
        //   542: fload           6
        //   544: fadd           
        //   545: fstore          11
        //   547: fload           8
        //   549: getstatic       dev/nuker/pyro/fc.1:I
        //   552: ifeq            561
        //   555: ldc_w           -1048473115
        //   558: goto            564
        //   561: ldc_w           1635302731
        //   564: ldc_w           -2034128755
        //   567: ixor           
        //   568: lookupswitch {
        //          1195391336: 1720
        //          1196723946: 561
        //          default: 596
        //        }
        //   596: fload           9
        //   598: fadd           
        //   599: getstatic       dev/nuker/pyro/fc.c:I
        //   602: ifge            611
        //   605: ldc_w           -561067917
        //   608: goto            614
        //   611: ldc_w           -1046509105
        //   614: ldc_w           1533968516
        //   617: ixor           
        //   618: lookupswitch {
        //          -2048898825: 611
        //          -1695479477: 644
        //          default: 1724
        //        }
        //   644: fstore          12
        //   646: fload           5
        //   648: fload           10
        //   650: fadd           
        //   651: fstore          13
        //   653: fload           11
        //   655: ldc_w           0.96
        //   658: fmul           
        //   659: ldc_w           0.03
        //   662: fadd           
        //   663: fstore          11
        //   665: fload           12
        //   667: ldc_w           0.96
        //   670: fmul           
        //   671: ldc_w           0.03
        //   674: fadd           
        //   675: fstore          12
        //   677: getstatic       dev/nuker/pyro/fc.c:I
        //   680: ifge            689
        //   683: ldc_w           -1379513955
        //   686: goto            692
        //   689: ldc_w           709280140
        //   692: ldc_w           -1860695524
        //   695: ixor           
        //   696: lookupswitch {
        //          -1334488826: 689
        //          1021199233: 1712
        //          default: 724
        //        }
        //   724: fload           13
        //   726: ldc_w           0.96
        //   729: fmul           
        //   730: ldc_w           0.03
        //   733: fadd           
        //   734: fstore          13
        //   736: fload           11
        //   738: fconst_1       
        //   739: fcmpl          
        //   740: ifle            746
        //   743: fconst_1       
        //   744: fstore          11
        //   746: fload           12
        //   748: fconst_1       
        //   749: fcmpl          
        //   750: ifle            756
        //   753: fconst_1       
        //   754: fstore          12
        //   756: getstatic       dev/nuker/pyro/fc.c:I
        //   759: ifge            768
        //   762: ldc_w           1886119925
        //   765: goto            771
        //   768: ldc_w           -13357952
        //   771: ldc_w           -218865387
        //   774: ixor           
        //   775: lookupswitch {
        //          -2103474464: 1708
        //          1504504636: 768
        //          default: 800
        //        }
        //   800: fload           13
        //   802: fconst_1       
        //   803: fcmpl          
        //   804: ifle            810
        //   807: fconst_1       
        //   808: fstore          13
        //   810: getstatic       dev/nuker/pyro/fc.c:I
        //   813: ifge            822
        //   816: ldc_w           89655291
        //   819: goto            825
        //   822: ldc_w           2007950208
        //   825: ldc_w           -1470935129
        //   828: ixor           
        //   829: lookupswitch {
        //          -1391769508: 822
        //          -537023449: 856
        //          default: 1722
        //        }
        //   856: aload_0        
        //   857: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //   860: getfield        net/minecraft/client/settings/GameSettings.field_74333_Y:F
        //   863: fstore          14
        //   865: fconst_1       
        //   866: fload           11
        //   868: fsub           
        //   869: fstore          15
        //   871: fconst_1       
        //   872: fload           12
        //   874: fsub           
        //   875: fstore          16
        //   877: fconst_1       
        //   878: getstatic       dev/nuker/pyro/fc.0:I
        //   881: ifeq            890
        //   884: ldc_w           -58216515
        //   887: goto            893
        //   890: ldc_w           -922713493
        //   893: ldc_w           429233623
        //   896: ixor           
        //   897: lookupswitch {
        //          -1241021953: 890
        //          -451790230: 1736
        //          default: 924
        //        }
        //   924: fload           13
        //   926: fsub           
        //   927: getstatic       dev/nuker/pyro/fc.c:I
        //   930: ifge            939
        //   933: ldc_w           1172714502
        //   936: goto            942
        //   939: ldc_w           1260017195
        //   942: ldc_w           1816544221
        //   945: ixor           
        //   946: lookupswitch {
        //          -1549554151: 939
        //          698382299: 1702
        //          default: 972
        //        }
        //   972: fstore          17
        //   974: fconst_1       
        //   975: getstatic       dev/nuker/pyro/fc.1:I
        //   978: ifeq            987
        //   981: ldc_w           2064297244
        //   984: goto            990
        //   987: ldc_w           -1270367247
        //   990: ldc_w           1757082458
        //   993: ixor           
        //   994: lookupswitch {
        //          -1497024574: 987
        //          330325574: 1726
        //          default: 1020
        //        }
        //  1020: fload           15
        //  1022: fload           15
        //  1024: fmul           
        //  1025: fload           15
        //  1027: fmul           
        //  1028: fload           15
        //  1030: fmul           
        //  1031: fsub           
        //  1032: fstore          15
        //  1034: fconst_1       
        //  1035: fload           16
        //  1037: fload           16
        //  1039: fmul           
        //  1040: fload           16
        //  1042: fmul           
        //  1043: fload           16
        //  1045: fmul           
        //  1046: fsub           
        //  1047: fstore          16
        //  1049: fconst_1       
        //  1050: fload           17
        //  1052: fload           17
        //  1054: fmul           
        //  1055: getstatic       dev/nuker/pyro/fc.1:I
        //  1058: ifeq            1067
        //  1061: ldc_w           -1931007710
        //  1064: goto            1070
        //  1067: ldc_w           -864157315
        //  1070: ldc_w           54903980
        //  1073: ixor           
        //  1074: lookupswitch {
        //          -2033773869: 1067
        //          -1885147762: 1716
        //          default: 1100
        //        }
        //  1100: fload           17
        //  1102: fmul           
        //  1103: fload           17
        //  1105: fmul           
        //  1106: fsub           
        //  1107: fstore          17
        //  1109: fload           11
        //  1111: fconst_1       
        //  1112: fload           14
        //  1114: fsub           
        //  1115: fmul           
        //  1116: fload           15
        //  1118: fload           14
        //  1120: fmul           
        //  1121: fadd           
        //  1122: fstore          11
        //  1124: fload           12
        //  1126: fconst_1       
        //  1127: getstatic       dev/nuker/pyro/fc.0:I
        //  1130: ifeq            1139
        //  1133: ldc_w           1808810193
        //  1136: goto            1142
        //  1139: ldc_w           607057808
        //  1142: ldc_w           1560688894
        //  1145: ixor           
        //  1146: lookupswitch {
        //          -848630943: 1139
        //          920025135: 1714
        //          default: 1172
        //        }
        //  1172: fload           14
        //  1174: fsub           
        //  1175: fmul           
        //  1176: fload           16
        //  1178: fload           14
        //  1180: fmul           
        //  1181: fadd           
        //  1182: fstore          12
        //  1184: fload           13
        //  1186: fconst_1       
        //  1187: fload           14
        //  1189: fsub           
        //  1190: fmul           
        //  1191: fload           17
        //  1193: fload           14
        //  1195: fmul           
        //  1196: fadd           
        //  1197: fstore          13
        //  1199: fload           11
        //  1201: ldc_w           0.96
        //  1204: fmul           
        //  1205: ldc_w           0.03
        //  1208: fadd           
        //  1209: fstore          11
        //  1211: fload           12
        //  1213: ldc_w           0.96
        //  1216: fmul           
        //  1217: ldc_w           0.03
        //  1220: fadd           
        //  1221: fstore          12
        //  1223: fload           13
        //  1225: ldc_w           0.96
        //  1228: fmul           
        //  1229: ldc_w           0.03
        //  1232: fadd           
        //  1233: fstore          13
        //  1235: fload           11
        //  1237: fconst_1       
        //  1238: fcmpl          
        //  1239: ifle            1245
        //  1242: fconst_1       
        //  1243: fstore          11
        //  1245: fload           12
        //  1247: fconst_1       
        //  1248: fcmpl          
        //  1249: ifle            1258
        //  1252: ldc_w           1596386701
        //  1255: goto            1261
        //  1258: ldc_w           1596386700
        //  1261: ldc_w           241807061
        //  1264: ixor           
        //  1265: tableswitch {
        //          -1566669136: 1288
        //          -1566669135: 1291
        //          default: 1252
        //        }
        //  1288: fconst_1       
        //  1289: fstore          12
        //  1291: fload           13
        //  1293: fconst_1       
        //  1294: fcmpl          
        //  1295: ifle            1304
        //  1298: ldc_w           -1708699789
        //  1301: goto            1307
        //  1304: ldc_w           -1708699792
        //  1307: ldc_w           1094849318
        //  1310: ixor           
        //  1311: tableswitch {
        //          -1228228438: 1332
        //          -1228228437: 1335
        //          default: 1298
        //        }
        //  1332: fconst_1       
        //  1333: fstore          13
        //  1335: fload           11
        //  1337: fconst_0       
        //  1338: fcmpg          
        //  1339: ifge            1348
        //  1342: ldc_w           -709293873
        //  1345: goto            1351
        //  1348: ldc_w           -709293904
        //  1351: ldc_w           -1612120976
        //  1354: ixor           
        //  1355: tableswitch {
        //          -1801197186: 1376
        //          -1801197185: 1379
        //          default: 1342
        //        }
        //  1376: fconst_0       
        //  1377: fstore          11
        //  1379: fload           12
        //  1381: fconst_0       
        //  1382: fcmpg          
        //  1383: ifge            1389
        //  1386: fconst_0       
        //  1387: fstore          12
        //  1389: fload           13
        //  1391: fconst_0       
        //  1392: fcmpg          
        //  1393: ifge            1446
        //  1396: fconst_0       
        //  1397: getstatic       dev/nuker/pyro/fc.0:I
        //  1400: ifeq            1409
        //  1403: ldc_w           -1320304239
        //  1406: goto            1412
        //  1409: ldc_w           105815246
        //  1412: ldc_w           1342411511
        //  1415: ixor           
        //  1416: lookupswitch {
        //          -675450569: 1409
        //          -514960538: 1698
        //          default: 1444
        //        }
        //  1444: fstore          13
        //  1446: sipush          255
        //  1449: istore          18
        //  1451: fload           11
        //  1453: ldc_w           255.0
        //  1456: fmul           
        //  1457: f2i            
        //  1458: getstatic       dev/nuker/pyro/fc.0:I
        //  1461: ifeq            1470
        //  1464: ldc_w           -4126668
        //  1467: goto            1473
        //  1470: ldc_w           912969275
        //  1473: ldc_w           -940073646
        //  1476: ixor           
        //  1477: lookupswitch {
        //          127180801: 1470
        //          943101286: 1728
        //          default: 1504
        //        }
        //  1504: istore          19
        //  1506: fload           12
        //  1508: ldc_w           255.0
        //  1511: fmul           
        //  1512: f2i            
        //  1513: istore          20
        //  1515: fload           13
        //  1517: ldc_w           255.0
        //  1520: fmul           
        //  1521: f2i            
        //  1522: istore          21
        //  1524: aload_0        
        //  1525: getstatic       dev/nuker/pyro/fc.c:I
        //  1528: ifge            1537
        //  1531: ldc_w           177720354
        //  1534: goto            1540
        //  1537: ldc_w           1657410443
        //  1540: ldc_w           -1046664430
        //  1543: ixor           
        //  1544: lookupswitch {
        //          -1554564967: 1572
        //          -888477904: 1537
        //          default: 1700
        //        }
        //  1572: getfield        net/minecraft/client/Minecraft.field_71460_t:Lnet/minecraft/client/renderer/EntityRenderer;
        //  1575: checkcast       Ldev/nuker/pyro/mixin/EntityRendererAccessor;
        //  1578: goto            1582
        //  1581: athrow         
        //  1582: invokeinterface dev/nuker/pyro/mixin/EntityRendererAccessor.getLightmapColors:()[I
        //  1587: goto            1591
        //  1590: athrow         
        //  1591: iload           4
        //  1593: ldc_w           -16777216
        //  1596: getstatic       dev/nuker/pyro/fc.1:I
        //  1599: ifeq            1608
        //  1602: ldc_w           545693640
        //  1605: goto            1611
        //  1608: ldc_w           -1051981186
        //  1611: ldc_w           -1007021640
        //  1614: ixor           
        //  1615: lookupswitch {
        //          -478376336: 1732
        //          894491823: 1608
        //          default: 1640
        //        }
        //  1640: iload           19
        //  1642: bipush          16
        //  1644: ishl           
        //  1645: ior            
        //  1646: iload           20
        //  1648: bipush          8
        //  1650: ishl           
        //  1651: ior            
        //  1652: iload           21
        //  1654: ior            
        //  1655: iastore        
        //  1656: iinc            4, 1
        //  1659: goto            98
        //  1662: aload_0        
        //  1663: getfield        net/minecraft/client/Minecraft.field_71460_t:Lnet/minecraft/client/renderer/EntityRenderer;
        //  1666: checkcast       Ldev/nuker/pyro/mixin/EntityRendererAccessor;
        //  1669: goto            1673
        //  1672: athrow         
        //  1673: invokeinterface dev/nuker/pyro/mixin/EntityRendererAccessor.getLightmapTexture:()Lnet/minecraft/client/renderer/texture/DynamicTexture;
        //  1678: goto            1682
        //  1681: athrow         
        //  1682: goto            1686
        //  1685: athrow         
        //  1686: invokevirtual   net/minecraft/client/renderer/texture/DynamicTexture.func_110564_a:()V
        //  1689: goto            1693
        //  1692: athrow         
        //  1693: return         
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
        //  1722: aconst_null    
        //  1723: athrow         
        //  1724: aconst_null    
        //  1725: athrow         
        //  1726: aconst_null    
        //  1727: athrow         
        //  1728: aconst_null    
        //  1729: athrow         
        //  1730: aconst_null    
        //  1731: athrow         
        //  1732: aconst_null    
        //  1733: athrow         
        //  1734: aconst_null    
        //  1735: athrow         
        //  1736: aconst_null    
        //  1737: athrow         
        //  1738: pop            
        //  1739: goto            24
        //  1742: pop            
        //  1743: aconst_null    
        //  1744: goto            1738
        //  1747: dup            
        //  1748: ifnull          1738
        //  1751: checkcast       Ljava/lang/Throwable;
        //  1754: athrow         
        //  1755: dup            
        //  1756: ifnull          1742
        //  1759: checkcast       Ljava/lang/Throwable;
        //  1762: athrow         
        //  1763: aconst_null    
        //  1764: athrow         
        //    StackMapTable: 00 90 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FD 00 03 07 00 23 07 01 4E 44 07 00 86 FF 00 00 00 02 07 00 23 07 01 4E 00 02 07 01 4E 02 45 07 00 21 40 02 4B 02 FF 00 02 00 02 07 00 23 07 01 4E 00 02 02 01 5F 02 FE 00 0D 02 02 01 0B 42 01 1E 54 07 01 4E FF 00 02 00 05 07 00 23 07 01 4E 02 02 01 00 02 07 01 4E 01 5F 07 01 4E 45 07 00 21 40 07 01 63 45 07 00 21 40 07 01 CF FF 00 10 00 00 00 01 07 00 21 FF 00 00 00 06 07 00 23 07 01 4E 02 02 01 02 00 01 07 01 63 45 07 00 21 40 07 01 CF 4B 07 01 CF FF 00 02 00 06 07 00 23 07 01 4E 02 02 01 02 00 02 07 01 CF 01 5D 07 01 CF FF 00 1F 00 07 07 00 23 07 01 4E 02 02 01 02 02 00 01 02 FF 00 02 00 07 07 00 23 07 01 4E 02 02 01 02 02 00 02 02 01 5C 02 FE 00 32 02 02 02 42 01 1D 5B 02 FF 00 02 00 0A 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 00 02 02 01 5C 02 FC 00 0D 02 42 01 1E FF 00 14 00 0C 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 00 01 02 FF 00 02 00 0C 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 00 02 02 01 5F 02 4E 02 FF 00 02 00 0C 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 00 02 02 01 5D 02 FD 00 2C 02 02 42 01 1F 15 09 0B 42 01 1C 09 0B 42 01 1E FF 00 21 00 11 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 00 01 02 FF 00 02 00 11 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 00 02 02 01 5E 02 4E 02 FF 00 02 00 11 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 00 02 02 01 5D 02 FF 00 0E 00 12 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 00 01 02 FF 00 02 00 12 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 00 02 02 01 5D 02 FF 00 2E 00 12 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 00 02 02 02 FF 00 02 00 12 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 00 03 02 02 01 FF 00 1D 00 12 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 00 02 02 02 FF 00 26 00 12 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 00 02 02 02 FF 00 02 00 12 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 00 03 02 02 01 FF 00 1D 00 12 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 00 02 02 02 FB 00 48 06 05 42 01 1A 02 06 05 42 01 18 02 06 05 42 01 18 02 09 53 02 FF 00 02 00 12 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 00 02 02 01 5F 02 01 FF 00 17 00 13 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 01 00 01 01 FF 00 02 00 13 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 01 00 02 01 01 5E 01 FF 00 20 00 16 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 01 01 01 01 00 01 07 00 23 FF 00 02 00 16 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 01 01 01 01 00 02 07 00 23 01 5F 07 00 23 48 07 00 21 40 07 01 BC 47 07 00 21 40 07 01 D1 FF 00 10 00 16 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 01 01 01 01 00 03 07 01 D1 01 01 FF 00 02 00 16 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 01 01 01 01 00 04 07 01 D1 01 01 01 FF 00 1C 00 16 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 01 01 01 01 00 03 07 01 D1 01 01 FF 00 15 00 05 07 00 23 07 01 4E 02 02 01 00 00 49 07 00 21 40 07 01 BC 47 07 00 21 40 07 01 CA 42 07 00 21 40 07 01 CA 45 07 00 21 00 FF 00 00 00 0A 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 00 01 02 FC 00 01 02 FF 00 01 00 12 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 00 01 02 FF 00 01 00 16 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 01 01 01 01 00 01 07 00 23 FF 00 01 00 11 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 00 01 02 FF 00 01 00 06 07 00 23 07 01 4E 02 02 01 02 00 01 07 01 CF FF 00 01 00 07 07 00 23 07 01 4E 02 02 01 02 02 00 01 02 FF 00 01 00 0E 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 00 00 FF 00 01 00 05 07 00 23 07 01 4E 02 02 01 00 01 07 01 4E FF 00 01 00 0E 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 00 00 FF 00 01 00 12 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 00 02 02 02 FF 00 01 00 12 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 00 02 02 02 FF 00 01 00 0A 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 00 00 FF 00 01 00 0C 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 00 01 02 FD 00 01 02 02 FF 00 01 00 0C 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 00 01 02 FF 00 01 00 12 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 00 01 02 FF 00 01 00 13 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 01 00 01 01 FF 00 01 00 05 07 00 23 07 01 4E 02 02 01 00 00 FF 00 01 00 16 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 02 01 01 01 01 00 03 07 01 D1 01 01 FF 00 01 00 02 07 00 23 07 01 4E 00 01 02 FF 00 01 00 11 07 00 23 07 01 4E 02 02 01 02 02 02 02 02 02 02 02 02 02 02 02 00 01 02 FF 00 01 00 02 07 00 23 07 01 4E 00 01 07 00 8C 43 05 44 07 00 8C 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1747   1755   Ljava/util/ConcurrentModificationException;
        //  1747   1755   1747   1755   Ljava/lang/IndexOutOfBoundsException;
        //  1763   1765   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  29     36     36     37     Any
        //  29     36     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  29     36     36     37     Any
        //  30     36     36     37     Ljava/lang/AssertionError;
        //  30     36     29     30     Ljava/lang/ArithmeticException;
        //  206    213    213    214    Any
        //  207    213    206    207    Any
        //  207    213    206    207    Any
        //  206    213    206    207    Any
        //  207    213    206    207    Ljava/lang/IndexOutOfBoundsException;
        //  232    238    238    239    Any
        //  232    238    238    239    Ljava/lang/ClassCastException;
        //  232    238    3      8      Any
        //  232    238    3      8      Any
        //  232    238    3      8      Ljava/lang/AssertionError;
        //  1581   1590   1590   1591   Any
        //  1581   1590   1581   1582   Any
        //  1582   1590   1590   1591   Any
        //  1582   1590   1590   1591   Ljava/util/ConcurrentModificationException;
        //  1582   1590   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1672   1681   1681   1682   Any
        //  1673   1681   3      8      Any
        //  1673   1681   3      8      Any
        //  1672   1681   3      8      Any
        //  1672   1681   1672   1673   Any
        //  1685   1692   1692   1693   Any
        //  1686   1692   1685   1686   Any
        //  1685   1692   1685   1686   Any
        //  1686   1692   1692   1693   Any
        //  1685   1692   1685   1686   Ljava/lang/ClassCastException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 577 out of bounds for length 577
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
}
