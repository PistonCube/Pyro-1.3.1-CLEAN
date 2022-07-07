// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public class f68 extends fH
{
    public f0f<f67> c;
    public boolean c;
    public int 1;
    
    static {
        throw t;
    }
    
    @f06
    public void c(final f3b p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          315
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            307
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            299
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             1597763897
        //    32: goto            37
        //    35: ldc             104476493
        //    37: ldc             -2017346029
        //    39: ixor           
        //    40: lookupswitch {
        //          -2114219682: 68
        //          -654684374: 35
        //          default: 288
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f68.c:Lnet/minecraft/client/Minecraft;
        //    72: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    75: goto            79
        //    78: athrow         
        //    79: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //    82: goto            86
        //    85: athrow         
        //    86: getstatic       dev/nuker/pyro/fc.1:I
        //    89: ifeq            97
        //    92: ldc             1992037256
        //    94: goto            99
        //    97: ldc             308605661
        //    99: ldc             -374982740
        //   101: ixor           
        //   102: lookupswitch {
        //          -2143283360: 97
        //          -1625676764: 282
        //          default: 128
        //        }
        //   128: goto            132
        //   131: athrow         
        //   132: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   135: goto            139
        //   138: athrow         
        //   139: getstatic       net/minecraft/init/Items.field_151153_ao:Lnet/minecraft/item/Item;
        //   142: goto            146
        //   145: athrow         
        //   146: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   149: goto            153
        //   152: athrow         
        //   153: ifne            157
        //   156: return         
        //   157: aload_0        
        //   158: getfield        dev/nuker/pyro/f68.c:Ldev/nuker/pyro/f0f;
        //   161: getstatic       dev/nuker/pyro/fc.0:I
        //   164: ifeq            172
        //   167: ldc             -1106021454
        //   169: goto            174
        //   172: ldc             -443860322
        //   174: ldc             -509273535
        //   176: ixor           
        //   177: lookupswitch {
        //          70131935: 204
        //          1605790195: 172
        //          default: 284
        //        }
        //   204: goto            208
        //   207: athrow         
        //   208: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   211: goto            215
        //   214: athrow         
        //   215: checkcast       Ldev/nuker/pyro/f67;
        //   218: getstatic       dev/nuker/pyro/f67.c:Ldev/nuker/pyro/f67;
        //   221: goto            225
        //   224: athrow         
        //   225: invokevirtual   dev/nuker/pyro/f67.equals:(Ljava/lang/Object;)Z
        //   228: goto            232
        //   231: athrow         
        //   232: ifeq            281
        //   235: getstatic       dev/nuker/pyro/fc.0:I
        //   238: ifeq            246
        //   241: ldc             85887262
        //   243: goto            248
        //   246: ldc             -1157539632
        //   248: ldc             1525184849
        //   250: ixor           
        //   251: lookupswitch {
        //          -1353313954: 246
        //          1610018895: 286
        //          default: 276
        //        }
        //   276: aload_0        
        //   277: iconst_1       
        //   278: putfield        dev/nuker/pyro/f68.c:Z
        //   281: return         
        //   282: aconst_null    
        //   283: athrow         
        //   284: aconst_null    
        //   285: athrow         
        //   286: aconst_null    
        //   287: athrow         
        //   288: aconst_null    
        //   289: athrow         
        //   290: pop            
        //   291: goto            24
        //   294: pop            
        //   295: aconst_null    
        //   296: goto            290
        //   299: dup            
        //   300: ifnull          290
        //   303: checkcast       Ljava/lang/Throwable;
        //   306: athrow         
        //   307: dup            
        //   308: ifnull          294
        //   311: checkcast       Ljava/lang/Throwable;
        //   314: athrow         
        //   315: aconst_null    
        //   316: athrow         
        //    StackMapTable: 00 2F 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FD 00 03 07 00 03 07 00 63 0A 41 01 1E 49 07 00 21 40 07 00 2F 45 07 00 21 40 07 00 38 4A 07 00 38 FF 00 01 00 02 07 00 03 07 00 63 00 02 07 00 38 01 5C 07 00 38 42 07 00 21 40 07 00 38 45 07 00 21 40 07 00 65 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 63 00 02 07 00 65 07 00 65 45 07 00 21 40 01 03 4E 07 00 52 FF 00 01 00 02 07 00 03 07 00 63 00 02 07 00 52 01 5D 07 00 52 42 07 00 21 40 07 00 52 45 07 00 21 40 07 00 44 48 07 00 19 FF 00 00 00 02 07 00 03 07 00 63 00 02 07 00 58 07 00 58 45 07 00 21 40 01 0D 41 01 1B 04 40 07 00 38 41 07 00 52 01 01 41 07 00 21 43 05 44 07 00 21 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     299    307    Any
        //  299    307    299    307    Any
        //  315    317    3      8      Any
        //  78     85     85     86     Any
        //  78     85     85     86     Ljava/lang/EnumConstantNotPresentException;
        //  78     85     78     79     Any
        //  79     85     3      8      Ljava/lang/ClassCastException;
        //  79     85     85     86     Ljava/lang/ArithmeticException;
        //  131    138    138    139    Any
        //  132    138    131    132    Any
        //  131    138    131    132    Any
        //  131    138    131    132    Any
        //  131    138    138    139    Ljava/util/NoSuchElementException;
        //  145    152    152    153    Any
        //  145    152    152    153    Ljava/lang/NumberFormatException;
        //  145    152    3      8      Any
        //  145    152    145    146    Any
        //  145    152    145    146    Any
        //  207    214    214    215    Any
        //  207    214    214    215    Any
        //  208    214    3      8      Any
        //  207    214    207    208    Any
        //  208    214    3      8      Any
        //  224    231    231    232    Any
        //  225    231    3      8      Any
        //  224    231    231    232    Any
        //  224    231    224    225    Ljava/lang/NumberFormatException;
        //  224    231    231    232    Ljava/lang/ArrayIndexOutOfBoundsException;
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
    
    @f06
    public void c(final f3f p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          303
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            295
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            287
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f68.c:Lnet/minecraft/client/Minecraft;
        //    28: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    31: goto            35
        //    34: athrow         
        //    35: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184614_ca:()Lnet/minecraft/item/ItemStack;
        //    38: goto            42
        //    41: athrow         
        //    42: getstatic       dev/nuker/pyro/fc.c:I
        //    45: ifge            53
        //    48: ldc             -2099157669
        //    50: goto            55
        //    53: ldc             704752718
        //    55: ldc             1453010404
        //    57: ixor           
        //    58: lookupswitch {
        //          -730183489: 276
        //          848459312: 53
        //          default: 84
        //        }
        //    84: goto            88
        //    87: athrow         
        //    88: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //    91: goto            95
        //    94: athrow         
        //    95: getstatic       net/minecraft/init/Items.field_151153_ao:Lnet/minecraft/item/Item;
        //    98: goto            102
        //   101: athrow         
        //   102: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   105: goto            109
        //   108: athrow         
        //   109: ifne            117
        //   112: ldc             806925811
        //   114: goto            119
        //   117: ldc             806925812
        //   119: ldc             -1263371912
        //   121: ixor           
        //   122: tableswitch {
        //          156604694: 144
        //          156604695: 145
        //          default: 112
        //        }
        //   144: return         
        //   145: aload_0        
        //   146: getfield        dev/nuker/pyro/f68.c:Ldev/nuker/pyro/f0f;
        //   149: goto            153
        //   152: athrow         
        //   153: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   156: goto            160
        //   159: athrow         
        //   160: checkcast       Ldev/nuker/pyro/f67;
        //   163: getstatic       dev/nuker/pyro/f67.c:Ldev/nuker/pyro/f67;
        //   166: goto            170
        //   169: athrow         
        //   170: invokevirtual   dev/nuker/pyro/f67.equals:(Ljava/lang/Object;)Z
        //   173: goto            177
        //   176: athrow         
        //   177: ifeq            271
        //   180: getstatic       dev/nuker/pyro/fc.1:I
        //   183: ifeq            191
        //   186: ldc             2024445699
        //   188: goto            193
        //   191: ldc             2055079744
        //   193: ldc             1818725762
        //   195: ixor           
        //   196: lookupswitch {
        //          348985985: 191
        //          370772674: 224
        //          default: 272
        //        }
        //   224: aload_0        
        //   225: iconst_1       
        //   226: getstatic       dev/nuker/pyro/fc.0:I
        //   229: ifeq            237
        //   232: ldc             1239812698
        //   234: goto            239
        //   237: ldc             -174515429
        //   239: ldc             -1331460082
        //   241: ixor           
        //   242: lookupswitch {
        //          -112885164: 237
        //          1161466645: 268
        //          default: 274
        //        }
        //   268: putfield        dev/nuker/pyro/f68.c:Z
        //   271: return         
        //   272: aconst_null    
        //   273: athrow         
        //   274: aconst_null    
        //   275: athrow         
        //   276: aconst_null    
        //   277: athrow         
        //   278: pop            
        //   279: goto            24
        //   282: pop            
        //   283: aconst_null    
        //   284: goto            278
        //   287: dup            
        //   288: ifnull          278
        //   291: checkcast       Ljava/lang/Throwable;
        //   294: athrow         
        //   295: dup            
        //   296: ifnull          282
        //   299: checkcast       Ljava/lang/Throwable;
        //   302: athrow         
        //   303: aconst_null    
        //   304: athrow         
        //    StackMapTable: 00 2F 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FD 00 03 07 00 03 07 00 7E FF 00 09 00 00 00 01 07 00 21 FF 00 00 00 02 07 00 03 07 00 7E 00 01 07 00 2F 45 07 00 21 40 07 00 38 4A 07 00 38 FF 00 01 00 02 07 00 03 07 00 7E 00 02 07 00 38 01 5C 07 00 38 FF 00 02 00 00 00 01 07 00 21 FF 00 00 00 02 07 00 03 07 00 7E 00 01 07 00 38 45 07 00 21 40 07 00 65 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 7E 00 02 07 00 65 07 00 65 45 07 00 21 40 01 02 04 41 01 18 00 46 07 00 19 40 07 00 52 45 07 00 21 40 07 00 44 48 07 00 21 FF 00 00 00 02 07 00 03 07 00 7E 00 02 07 00 58 07 00 58 45 07 00 21 40 01 0D 41 01 1E FF 00 0C 00 02 07 00 03 07 00 7E 00 02 07 00 03 01 FF 00 01 00 02 07 00 03 07 00 7E 00 03 07 00 03 01 01 FF 00 1C 00 02 07 00 03 07 00 7E 00 02 07 00 03 01 02 00 FF 00 01 00 02 07 00 03 07 00 7E 00 02 07 00 03 01 41 07 00 38 41 07 00 21 43 05 44 07 00 21 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     287    295    Any
        //  287    295    287    295    Ljava/lang/IllegalArgumentException;
        //  303    305    3      8      Any
        //  35     41     41     42     Any
        //  35     41     41     42     Ljava/lang/ClassCastException;
        //  35     41     41     42     Any
        //  35     41     3      8      Any
        //  35     41     41     42     Ljava/lang/EnumConstantNotPresentException;
        //  88     94     94     95     Any
        //  88     94     3      8      Any
        //  88     94     94     95     Ljava/lang/StringIndexOutOfBoundsException;
        //  88     94     94     95     Ljava/lang/NumberFormatException;
        //  88     94     94     95     Ljava/lang/NegativeArraySizeException;
        //  101    108    108    109    Any
        //  101    108    101    102    Ljava/lang/ArithmeticException;
        //  102    108    101    102    Ljava/lang/ArithmeticException;
        //  102    108    3      8      Ljava/lang/NullPointerException;
        //  102    108    101    102    Any
        //  152    159    159    160    Any
        //  152    159    3      8      Ljava/lang/NegativeArraySizeException;
        //  153    159    152    153    Ljava/lang/NumberFormatException;
        //  153    159    3      8      Any
        //  153    159    159    160    Any
        //  169    176    176    177    Any
        //  170    176    3      8      Any
        //  169    176    3      8      Ljava/lang/NumberFormatException;
        //  170    176    3      8      Ljava/lang/NumberFormatException;
        //  170    176    169    170    Any
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
    
    @f06
    public void c(final f3h f3h) {
        fbS.hH(this, 594014795, f3h);
    }
    
    public f68() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u23e1\u149d\u8aed\ub3d0\uc9a8\uede7\ub234\ue6d0\ud961\ue9cf\ua723\u1e4d\ue1e3\uc5a2"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u23c1\u149d\u8aed\ub3d0\uc988\uede7\ub234\ue6f0\ud961\ue9cf\ua723\u1e4d\ue1e3\uc5a2"
        //     8: invokestatic    invokestatic   !!! ERROR
        //    11: ldc             "\u23c1\u1487\u8aed\ub3dc\uc9a2\uedf6\ub230\ue6c7\ud928\ue9c8\ua729\u1e0c\ue1f7\uc5a2\u814f\u893d\u57b6\u7718\ubd39\uc020\u2b1d\uc23d\u6a59\u2d51\ud7bf\u3595\u7d3b\u89b6\u8014\u8cbb\u84a4\ufb3b\u70d5\u9a13\u1be8\uf174\u4979\u883b"
        //    13: invokestatic    invokestatic   !!! ERROR
        //    16: iconst_0       
        //    17: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //    20: aload_0        
        //    21: new             Ldev/nuker/pyro/f0f;
        //    24: dup            
        //    25: ldc             "\u23ed\u149c\u8afd\ub3dc"
        //    27: invokestatic    invokestatic   !!! ERROR
        //    30: ldc             "\u23cd\u149c\u8afd\ub3dc"
        //    32: invokestatic    invokestatic   !!! ERROR
        //    35: aconst_null    
        //    36: getstatic       dev/nuker/pyro/f67.c:Ldev/nuker/pyro/f67;
        //    39: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //    42: getstatic       dev/nuker/pyro/fc.c:I
        //    45: ifge            53
        //    48: ldc             -1487004956
        //    50: goto            55
        //    53: ldc             -1816227905
        //    55: ldc             -481881868
        //    57: ixor           
        //    58: lookupswitch {
        //          1142491664: 53
        //          1895407435: 84
        //          default: 277
        //        }
        //    84: putfield        dev/nuker/pyro/f68.c:Ldev/nuker/pyro/f0f;
        //    87: getstatic       dev/nuker/pyro/fc.0:I
        //    90: ifeq            98
        //    93: ldc             1174898236
        //    95: goto            100
        //    98: ldc             -809325517
        //   100: ldc             733427587
        //   102: ixor           
        //   103: lookupswitch {
        //          -462054480: 128
        //          1840296383: 98
        //          default: 273
        //        }
        //   128: aload_0        
        //   129: iconst_0       
        //   130: getstatic       dev/nuker/pyro/fc.c:I
        //   133: ifge            141
        //   136: ldc             2063396187
        //   138: goto            143
        //   141: ldc             -560007933
        //   143: ldc             -1636393146
        //   145: ixor           
        //   146: lookupswitch {
        //          -460688867: 141
        //          1088973381: 172
        //          default: 275
        //        }
        //   172: putfield        dev/nuker/pyro/f68.c:Z
        //   175: aload_0        
        //   176: iconst_0       
        //   177: putfield        dev/nuker/pyro/f68.1:I
        //   180: aload_0        
        //   181: aload_0        
        //   182: getstatic       dev/nuker/pyro/fc.c:I
        //   185: ifge            193
        //   188: ldc             -849103913
        //   190: goto            195
        //   193: ldc             146700101
        //   195: ldc             -833431088
        //   197: ixor           
        //   198: lookupswitch {
        //          -957567339: 224
        //          53570055: 193
        //          default: 281
        //        }
        //   224: getfield        dev/nuker/pyro/f68.c:Ldev/nuker/pyro/f0f;
        //   227: getstatic       dev/nuker/pyro/fc.1:I
        //   230: ifeq            238
        //   233: ldc             -1551265596
        //   235: goto            240
        //   238: ldc             -153856601
        //   240: ldc             -855921456
        //   242: ixor           
        //   243: lookupswitch {
        //          -1034783099: 238
        //          1869757460: 279
        //          default: 268
        //        }
        //   268: invokevirtual   dev/nuker/pyro/f68.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   271: pop            
        //   272: return         
        //   273: aconst_null    
        //   274: athrow         
        //   275: aconst_null    
        //   276: athrow         
        //   277: aconst_null    
        //   278: athrow         
        //   279: aconst_null    
        //   280: athrow         
        //   281: aconst_null    
        //   282: athrow         
        //    StackMapTable: 00 14 FF 00 35 00 01 07 00 03 00 02 07 00 03 07 00 52 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 52 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 52 0D 41 01 1B FF 00 0C 00 01 07 00 03 00 02 07 00 03 01 FF 00 01 00 01 07 00 03 00 03 07 00 03 01 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 01 FF 00 14 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 0D 00 01 07 00 03 00 02 07 00 03 07 00 52 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 52 01 FF 00 1B 00 01 07 00 03 00 02 07 00 03 07 00 52 04 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 52 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 52 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03
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
}
