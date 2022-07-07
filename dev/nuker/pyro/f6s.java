// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public class f6s extends fH
{
    public boolean c;
    public boolean 0;
    
    public void 2() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          198
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            190
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            182
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f6s.c:Lnet/minecraft/client/Minecraft;
        //    28: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //    31: dup            
        //    32: ifnonnull       64
        //    35: new             Lkotlin/TypeCastException;
        //    38: dup            
        //    39: ldc             "\u2221\u1486\u8b32\ub195\ucfe4\uec2a\ub225\ue71d\udb26\uefd8\ua6fd\u1e0c\ue035\uc7e2\u8710\u88b1\u57a5\u76c5\ubf69\uc62b\u2ac9\uc234\u6b9e\u2f18\ud1ba\u3444\u7d66\u8873\u8244\u8afc\u8563\ufb72\u7115\u984f\u1df2\uf0ad\u493c\u89b6\uc8c3\uf956\ub759\u41fd\ub832\ub103\u4a17\u8b28\u7c27\ucfe6\u7f17\uecb7\ue718\u1696\uef88\u35c7\u40d5\ue03a\u0a19\u874c\u1ba5\u0929\u76d3\u7294\uc63c\ub9e8\u9c99\u6bd5\ue2e8\ud1f3\ua77f\u23a5\u8875\u4fad\u8aa7\u165a\ua59e\u7135\u5587\u1db3\u638c\u17f8\u89a5\u0525\uf91d\u2422"
        //    41: goto            45
        //    44: athrow         
        //    45: invokestatic    invokestatic   !!! ERROR
        //    48: goto            52
        //    51: athrow         
        //    52: goto            56
        //    55: athrow         
        //    56: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //    59: goto            63
        //    62: athrow         
        //    63: athrow         
        //    64: checkcast       Ldev/nuker/pyro/mixin/PlayerControllerMPAccessor;
        //    67: getstatic       dev/nuker/pyro/fc.c:I
        //    70: ifge            78
        //    73: ldc             1700331358
        //    75: goto            80
        //    78: ldc             660513895
        //    80: ldc             1965180641
        //    82: ixor           
        //    83: lookupswitch {
        //          276478399: 78
        //          1383916166: 108
        //          default: 171
        //        }
        //   108: aload_0        
        //   109: getstatic       dev/nuker/pyro/fc.c:I
        //   112: ifge            120
        //   115: ldc             -1905966829
        //   117: goto            122
        //   120: ldc             -127763044
        //   122: ldc             1381930760
        //   124: ixor           
        //   125: lookupswitch {
        //          -1438848364: 152
        //          -600058341: 120
        //          default: 169
        //        }
        //   152: getfield        dev/nuker/pyro/f6s.c:Z
        //   155: goto            159
        //   158: athrow         
        //   159: invokeinterface dev/nuker/pyro/mixin/PlayerControllerMPAccessor.setIsHittingBlock:(Z)V
        //   164: goto            168
        //   167: athrow         
        //   168: return         
        //   169: aconst_null    
        //   170: athrow         
        //   171: aconst_null    
        //   172: athrow         
        //   173: pop            
        //   174: goto            24
        //   177: pop            
        //   178: aconst_null    
        //   179: goto            173
        //   182: dup            
        //   183: ifnull          173
        //   186: checkcast       Ljava/lang/Throwable;
        //   189: athrow         
        //   190: dup            
        //   191: ifnull          177
        //   194: checkcast       Ljava/lang/Throwable;
        //   197: athrow         
        //   198: aconst_null    
        //   199: athrow         
        //    StackMapTable: 00 1E 43 07 00 19 04 FF 00 0B 00 00 00 01 07 00 19 FC 00 03 07 00 03 53 07 00 19 FF 00 00 00 01 07 00 03 00 04 07 00 3F 08 00 23 08 00 23 07 00 41 45 07 00 19 FF 00 00 00 01 07 00 03 00 04 07 00 3F 08 00 23 08 00 23 07 00 41 42 07 00 19 FF 00 00 00 01 07 00 03 00 04 07 00 3F 08 00 23 08 00 23 07 00 41 45 07 00 19 FF 00 00 00 01 07 00 03 00 02 07 00 3F 07 00 24 40 07 00 3F 4D 07 00 31 FF 00 01 00 01 07 00 03 00 02 07 00 31 01 5B 07 00 31 FF 00 0B 00 01 07 00 03 00 02 07 00 31 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 31 07 00 03 01 FF 00 1D 00 01 07 00 03 00 02 07 00 31 07 00 03 45 07 00 19 FF 00 00 00 01 07 00 03 00 02 07 00 31 01 47 07 00 19 00 FF 00 00 00 01 07 00 03 00 02 07 00 31 07 00 03 41 07 00 31 41 07 00 19 43 05 44 07 00 19 47 05 47 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     182    190    Any
        //  182    190    182    190    Ljava/lang/ClassCastException;
        //  198    200    3      8      Any
        //  44     51     51     52     Any
        //  44     51     44     45     Any
        //  45     51     3      8      Any
        //  44     51     44     45     Any
        //  44     51     44     45     Any
        //  55     62     62     63     Any
        //  56     62     62     63     Ljava/lang/StringIndexOutOfBoundsException;
        //  55     62     55     56     Ljava/util/ConcurrentModificationException;
        //  55     62     55     56     Any
        //  55     62     55     56     Any
        //  158    167    167    168    Any
        //  158    167    167    168    Ljava/lang/NegativeArraySizeException;
        //  159    167    3      8      Any
        //  158    167    158    159    Any
        //  159    167    167    168    Any
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
    
    public void 0(final boolean b) {
        fbS.4t(this, 1916306775, b);
    }
    
    public void 3() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          189
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            181
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            173
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             -1002656770
        //    32: goto            37
        //    35: ldc             1883870884
        //    37: ldc             1234870628
        //    39: ixor           
        //    40: lookupswitch {
        //          -1918498150: 35
        //          970143680: 68
        //          default: 162
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f6s.c:Lnet/minecraft/client/Minecraft;
        //    72: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    75: dup            
        //    76: ifnonnull       84
        //    79: ldc             1225003237
        //    81: goto            86
        //    84: ldc             1225003236
        //    86: ldc             -100293025
        //    88: ixor           
        //    89: tableswitch {
        //          1711500660: 112
        //          1711500661: 141
        //          default: 79
        //        }
        //   112: new             Lkotlin/TypeCastException;
        //   115: dup            
        //   116: ldc             "\u2221\u1486\u8b32\ub194\ucfe3\uec2a\ub225\ue71d\udb27\uefdf\ua6fd\u1e0c\ue035\uc7e3\u8717\u88b1\u57a5\u76c5\ubf68\uc62c\u2ac9\uc234\u6b9e\u2f19\ud1bd\u3444\u7d66\u8873\u8245\u8afb\u8563\ufb72\u7115\u984e\u1df5\uf0ad\u493c\u89b6\uc8c2\uf951\ub759\u41fd\ub832\ub102\u4a10\u8b28\u7c27\ucfe6\u7f16\uecb0\ue718\u1696\uef88\u35c6\u40d2\ue03a\u0a19\u874c\u1bb1\u092c\u76c6\u7284\uc62d\ub9e2\u9c8d\u6bd6\ue2e7\ud1fe\ua769\u23bf\u884a\u4f91\u8a83\u164a\ua5b7\u7100\u55b5\u1da3\u6381\u17e8"
        //   118: goto            122
        //   121: athrow         
        //   122: invokestatic    invokestatic   !!! ERROR
        //   125: goto            129
        //   128: athrow         
        //   129: goto            133
        //   132: athrow         
        //   133: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   136: goto            140
        //   139: athrow         
        //   140: athrow         
        //   141: checkcast       Ldev/nuker/pyro/mixin/EntityPlayerSPAccessor;
        //   144: aload_0        
        //   145: getfield        dev/nuker/pyro/f6s.0:Z
        //   148: goto            152
        //   151: athrow         
        //   152: invokeinterface dev/nuker/pyro/mixin/EntityPlayerSPAccessor.setHandActive:(Z)V
        //   157: goto            161
        //   160: athrow         
        //   161: return         
        //   162: aconst_null    
        //   163: athrow         
        //   164: pop            
        //   165: goto            24
        //   168: pop            
        //   169: aconst_null    
        //   170: goto            164
        //   173: dup            
        //   174: ifnull          164
        //   177: checkcast       Ljava/lang/Throwable;
        //   180: athrow         
        //   181: dup            
        //   182: ifnull          168
        //   185: checkcast       Ljava/lang/Throwable;
        //   188: athrow         
        //   189: aconst_null    
        //   190: athrow         
        //    StackMapTable: 00 1E 43 07 00 19 04 FF 00 0B 00 00 00 01 07 00 19 FC 00 03 07 00 03 0A 41 01 1E 4A 07 00 65 44 07 00 65 FF 00 01 00 01 07 00 03 00 02 07 00 65 01 59 07 00 65 48 07 00 10 FF 00 00 00 01 07 00 03 00 04 07 00 65 08 00 70 08 00 70 07 00 41 45 07 00 19 FF 00 00 00 01 07 00 03 00 04 07 00 65 08 00 70 08 00 70 07 00 41 42 07 00 19 FF 00 00 00 01 07 00 03 00 04 07 00 65 08 00 70 08 00 70 07 00 41 45 07 00 19 FF 00 00 00 01 07 00 03 00 02 07 00 65 07 00 24 40 07 00 65 49 07 00 0C FF 00 00 00 01 07 00 03 00 02 07 00 5E 01 47 07 00 19 00 00 41 07 00 19 43 05 44 07 00 19 47 05 47 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     173    181    Ljava/lang/ClassCastException;
        //  173    181    173    181    Any
        //  189    191    3      8      Ljava/lang/NegativeArraySizeException;
        //  121    128    128    129    Any
        //  121    128    3      8      Any
        //  122    128    3      8      Ljava/lang/NegativeArraySizeException;
        //  121    128    121    122    Ljava/util/ConcurrentModificationException;
        //  121    128    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  132    139    139    140    Any
        //  133    139    3      8      Any
        //  132    139    3      8      Ljava/lang/NullPointerException;
        //  133    139    132    133    Any
        //  133    139    3      8      Any
        //  151    160    160    161    Any
        //  152    160    160    161    Ljava/lang/NullPointerException;
        //  152    160    3      8      Any
        //  151    160    3      8      Any
        //  151    160    151    152    Ljava/lang/ClassCastException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 69 out of bounds for length 69
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
    
    public void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          265
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            257
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            249
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: aload_0        
        //    26: getfield        dev/nuker/pyro/f6s.c:Lnet/minecraft/client/Minecraft;
        //    29: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    32: dup            
        //    33: pop            
        //    34: goto            38
        //    37: athrow         
        //    38: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184587_cr:()Z
        //    41: goto            45
        //    44: athrow         
        //    45: putfield        dev/nuker/pyro/f6s.0:Z
        //    48: aload_0        
        //    49: getstatic       dev/nuker/pyro/fc.0:I
        //    52: ifeq            60
        //    55: ldc             -1069020122
        //    57: goto            62
        //    60: ldc             -520121865
        //    62: ldc             951874355
        //    64: ixor           
        //    65: lookupswitch {
        //          -666639676: 92
        //          -118194411: 60
        //          default: 234
        //        }
        //    92: getfield        dev/nuker/pyro/f6s.c:Lnet/minecraft/client/Minecraft;
        //    95: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    98: dup            
        //    99: ifnonnull       175
        //   102: new             Lkotlin/TypeCastException;
        //   105: dup            
        //   106: ldc             "\u2221\u1486\u8b32\ub1c4\ucfd3\uec2a\ub225\ue71d\udb77\uefef\ua6fd\u1e0c\ue035\uc7b3\u8727\u88b1\u57a5\u76c5\ubf38\uc61c\u2ac9\uc234\u6b9e\u2f49\ud18d\u3444\u7d66\u8873\u8215\u8acb\u8563\ufb72\u7115\u981e\u1dc5\uf0ad\u493c\u89b6\uc892\uf961\ub759\u41fd\ub832\ub152\u4a20\u8b28\u7c27\ucfe6\u7f46\uec80\ue718\u1696\uef88\u3596\u40e2\ue03a\u0a19\u874c\u1be1\u091c\u76c6\u7284\uc62d\ub9b2\u9cbd\u6bd6\ue2e7\ud1fe\ua739\u238f\u884a\u4f91\u8a83\u161a\ua587\u7100\u55b5\u1da3\u63d1\u17d8"
        //   108: getstatic       dev/nuker/pyro/fc.0:I
        //   111: ifeq            119
        //   114: ldc             -739722593
        //   116: goto            121
        //   119: ldc             -512625683
        //   121: ldc             2003020912
        //   123: ixor           
        //   124: lookupswitch {
        //          -1534388497: 236
        //          -464632182: 119
        //          default: 152
        //        }
        //   152: goto            156
        //   155: athrow         
        //   156: invokestatic    invokestatic   !!! ERROR
        //   159: goto            163
        //   162: athrow         
        //   163: goto            167
        //   166: athrow         
        //   167: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   170: goto            174
        //   173: athrow         
        //   174: athrow         
        //   175: checkcast       Ldev/nuker/pyro/mixin/EntityPlayerSPAccessor;
        //   178: iconst_0       
        //   179: getstatic       dev/nuker/pyro/fc.0:I
        //   182: ifeq            190
        //   185: ldc             -450206169
        //   187: goto            192
        //   190: ldc             -1320642085
        //   192: ldc             -975026404
        //   194: ixor           
        //   195: lookupswitch {
        //          549986619: 190
        //          1957355207: 220
        //          default: 238
        //        }
        //   220: goto            224
        //   223: athrow         
        //   224: invokeinterface dev/nuker/pyro/mixin/EntityPlayerSPAccessor.setHandActive:(Z)V
        //   229: goto            233
        //   232: athrow         
        //   233: return         
        //   234: aconst_null    
        //   235: athrow         
        //   236: aconst_null    
        //   237: athrow         
        //   238: aconst_null    
        //   239: athrow         
        //   240: pop            
        //   241: goto            24
        //   244: pop            
        //   245: aconst_null    
        //   246: goto            240
        //   249: dup            
        //   250: ifnull          240
        //   253: checkcast       Ljava/lang/Throwable;
        //   256: athrow         
        //   257: dup            
        //   258: ifnull          244
        //   261: checkcast       Ljava/lang/Throwable;
        //   264: athrow         
        //   265: aconst_null    
        //   266: athrow         
        //    StackMapTable: 00 26 43 07 00 19 04 FF 00 0B 00 00 00 01 07 00 19 FC 00 03 07 00 03 4C 07 00 19 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 65 45 07 00 19 FF 00 00 00 01 07 00 03 00 02 07 00 03 01 4E 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 FF 00 1A 00 01 07 00 03 00 04 07 00 65 08 00 66 08 00 66 07 00 41 FF 00 01 00 01 07 00 03 00 05 07 00 65 08 00 66 08 00 66 07 00 41 01 FF 00 1E 00 01 07 00 03 00 04 07 00 65 08 00 66 08 00 66 07 00 41 42 07 00 69 FF 00 00 00 01 07 00 03 00 04 07 00 65 08 00 66 08 00 66 07 00 41 45 07 00 19 FF 00 00 00 01 07 00 03 00 04 07 00 65 08 00 66 08 00 66 07 00 41 42 07 00 19 FF 00 00 00 01 07 00 03 00 04 07 00 65 08 00 66 08 00 66 07 00 41 45 07 00 19 FF 00 00 00 01 07 00 03 00 02 07 00 65 07 00 24 40 07 00 65 FF 00 0E 00 01 07 00 03 00 02 07 00 5E 01 FF 00 01 00 01 07 00 03 00 03 07 00 5E 01 01 FF 00 1B 00 01 07 00 03 00 02 07 00 5E 01 FF 00 02 00 00 00 01 07 00 19 FF 00 00 00 01 07 00 03 00 02 07 00 5E 01 47 07 00 19 00 40 07 00 03 FF 00 01 00 01 07 00 03 00 04 07 00 65 08 00 66 08 00 66 07 00 41 FF 00 01 00 01 07 00 03 00 02 07 00 5E 01 41 07 00 19 43 05 44 07 00 19 47 05 47 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     249    257    Any
        //  249    257    249    257    Any
        //  265    267    3      8      Any
        //  37     44     44     45     Any
        //  37     44     3      8      Any
        //  37     44     44     45     Any
        //  37     44     37     38     Any
        //  38     44     44     45     Any
        //  155    162    162    163    Any
        //  156    162    162    163    Ljava/lang/UnsupportedOperationException;
        //  156    162    3      8      Any
        //  156    162    155    156    Ljava/lang/ArithmeticException;
        //  155    162    3      8      Ljava/lang/NegativeArraySizeException;
        //  166    173    173    174    Any
        //  166    173    173    174    Any
        //  167    173    166    167    Any
        //  166    173    166    167    Any
        //  166    173    173    174    Any
        //  224    232    232    233    Any
        //  224    232    3      8      Any
        //  224    232    3      8      Any
        //  224    232    3      8      Any
        //  224    232    3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 86 out of bounds for length 86
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
    
    static {
        throw t;
    }
    
    public void 0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          311
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            303
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            295
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             -699473331
        //    32: goto            37
        //    35: ldc             -1222354589
        //    37: ldc             1315394673
        //    39: ixor           
        //    40: lookupswitch {
        //          -1742096836: 278
        //          -840402298: 35
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: aload_0        
        //    70: getstatic       dev/nuker/pyro/fc.1:I
        //    73: ifeq            81
        //    76: ldc             -1480426210
        //    78: goto            83
        //    81: ldc             -871224620
        //    83: ldc             1652850583
        //    85: ixor           
        //    86: lookupswitch {
        //          -985267575: 284
        //          1691652088: 81
        //          default: 112
        //        }
        //   112: getfield        dev/nuker/pyro/f6s.c:Lnet/minecraft/client/Minecraft;
        //   115: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   118: dup            
        //   119: pop            
        //   120: goto            124
        //   123: athrow         
        //   124: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_181040_m:()Z
        //   127: goto            131
        //   130: athrow         
        //   131: putfield        dev/nuker/pyro/f6s.c:Z
        //   134: getstatic       dev/nuker/pyro/fc.c:I
        //   137: ifge            145
        //   140: ldc             1262128829
        //   142: goto            147
        //   145: ldc             -1014159494
        //   147: ldc             100819124
        //   149: ixor           
        //   150: lookupswitch {
        //          928350126: 145
        //          1295576585: 280
        //          default: 176
        //        }
        //   176: aload_0        
        //   177: getfield        dev/nuker/pyro/f6s.c:Lnet/minecraft/client/Minecraft;
        //   180: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   183: dup            
        //   184: ifnonnull       216
        //   187: new             Lkotlin/TypeCastException;
        //   190: dup            
        //   191: ldc             "\u2221\u1486\u8b32\ub197\ucfe6\uec2a\ub225\ue71d\udb24\uefda\ua6fd\u1e0c\ue035\uc7e0\u8712\u88b1\u57a5\u76c5\ubf6b\uc629\u2ac9\uc234\u6b9e\u2f1a\ud1b8\u3444\u7d66\u8873\u8246\u8afe\u8563\ufb72\u7115\u984d\u1df0\uf0ad\u493c\u89b6\uc8c1\uf954\ub759\u41fd\ub832\ub101\u4a15\u8b28\u7c27\ucfe6\u7f15\uecb5\ue718\u1696\uef88\u35c5\u40d7\ue03a\u0a19\u874c\u1ba7\u092b\u76d3\u7294\uc63c\ub9ea\u9c9b\u6bd5\ue2e8\ud1f3\ua77d\u23a7\u8875\u4fad\u8aa7\u1658\ua59c\u7135\u5587\u1db3\u638e\u17fa\u89a5\u0525\uf91d\u2420"
        //   193: goto            197
        //   196: athrow         
        //   197: invokestatic    invokestatic   !!! ERROR
        //   200: goto            204
        //   203: athrow         
        //   204: goto            208
        //   207: athrow         
        //   208: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   211: goto            215
        //   214: athrow         
        //   215: athrow         
        //   216: checkcast       Ldev/nuker/pyro/mixin/PlayerControllerMPAccessor;
        //   219: iconst_0       
        //   220: getstatic       dev/nuker/pyro/fc.0:I
        //   223: ifeq            231
        //   226: ldc             1903476381
        //   228: goto            233
        //   231: ldc             -1647937893
        //   233: ldc             -1407152392
        //   235: ixor           
        //   236: lookupswitch {
        //          -581685147: 282
        //          78016006: 231
        //          default: 264
        //        }
        //   264: goto            268
        //   267: athrow         
        //   268: invokeinterface dev/nuker/pyro/mixin/PlayerControllerMPAccessor.setIsHittingBlock:(Z)V
        //   273: goto            277
        //   276: athrow         
        //   277: return         
        //   278: aconst_null    
        //   279: athrow         
        //   280: aconst_null    
        //   281: athrow         
        //   282: aconst_null    
        //   283: athrow         
        //   284: aconst_null    
        //   285: athrow         
        //   286: pop            
        //   287: goto            24
        //   290: pop            
        //   291: aconst_null    
        //   292: goto            286
        //   295: dup            
        //   296: ifnull          286
        //   299: checkcast       Ljava/lang/Throwable;
        //   302: athrow         
        //   303: dup            
        //   304: ifnull          290
        //   307: checkcast       Ljava/lang/Throwable;
        //   310: athrow         
        //   311: aconst_null    
        //   312: athrow         
        //    StackMapTable: 00 2A 43 07 00 19 04 FF 00 0B 00 00 00 01 07 00 19 FC 00 03 07 00 03 0A 41 01 1E FF 00 0C 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 0A 00 00 00 01 07 00 19 FF 00 00 00 01 07 00 03 00 02 07 00 03 07 00 3F 45 07 00 19 FF 00 00 00 01 07 00 03 00 02 07 00 03 01 0D 41 01 1C FF 00 13 00 00 00 01 07 00 19 FF 00 00 00 01 07 00 03 00 04 07 00 3F 08 00 BB 08 00 BB 07 00 41 45 07 00 19 FF 00 00 00 01 07 00 03 00 04 07 00 3F 08 00 BB 08 00 BB 07 00 41 42 07 00 10 FF 00 00 00 01 07 00 03 00 04 07 00 3F 08 00 BB 08 00 BB 07 00 41 45 07 00 19 FF 00 00 00 01 07 00 03 00 02 07 00 3F 07 00 24 40 07 00 3F FF 00 0E 00 01 07 00 03 00 02 07 00 31 01 FF 00 01 00 01 07 00 03 00 03 07 00 31 01 01 FF 00 1E 00 01 07 00 03 00 02 07 00 31 01 42 07 00 80 FF 00 00 00 01 07 00 03 00 02 07 00 31 01 47 07 00 19 00 00 01 FF 00 01 00 01 07 00 03 00 02 07 00 31 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03 41 07 00 93 43 05 44 07 00 93 47 05 47 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     295    303    Ljava/lang/ArithmeticException;
        //  295    303    295    303    Ljava/lang/IllegalStateException;
        //  311    313    3      8      Any
        //  124    130    130    131    Any
        //  124    130    3      8      Any
        //  124    130    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  124    130    3      8      Any
        //  124    130    130    131    Any
        //  197    203    203    204    Any
        //  197    203    3      8      Any
        //  197    203    203    204    Ljava/lang/ArithmeticException;
        //  197    203    203    204    Any
        //  197    203    3      8      Ljava/lang/NegativeArraySizeException;
        //  207    214    214    215    Any
        //  207    214    214    215    Any
        //  207    214    207    208    Ljava/util/ConcurrentModificationException;
        //  208    214    3      8      Ljava/lang/IllegalStateException;
        //  208    214    214    215    Any
        //  267    276    276    277    Any
        //  268    276    3      8      Ljava/lang/NegativeArraySizeException;
        //  267    276    276    277    Ljava/lang/NullPointerException;
        //  268    276    267    268    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  267    276    3      8      Ljava/lang/ClassCastException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 0], but value was: 1.
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
    
    public f6s() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\u2202\u1486\u8b32\ub3cd\uc96d\uec1d\ub225\ue700\ud963"
        //     3: invokestatic    invokestatic   !!! ERROR
        //     6: ldc             "\u2202\u1486\u8b32\ub3cd\uc96d\uec1d\ub225\ue700\ud963"
        //     8: getstatic       dev/nuker/pyro/fc.c:I
        //    11: ifge            19
        //    14: ldc             -459914733
        //    16: goto            21
        //    19: ldc             260087584
        //    21: ldc             1047500618
        //    23: ixor           
        //    24: lookupswitch {
        //          -621161127: 108
        //          1556851683: 19
        //          default: 52
        //        }
        //    52: invokestatic    invokestatic   !!! ERROR
        //    55: ldc             "\u220e\u149f\u8b32\ub3d6\uc973\uec3a\ub264\ue70a\ud967\ue902\ua6a9\u1e58\ue038\uc5e7\u8193\u88be\u57ad\u76d5\ubd36\uc0eb\u2aca\uc233\u6bd7\u2d5a\ud770\u340a\u7d26\u8874\u801f\u8c39\u8561\ufb35"
        //    57: invokestatic    invokestatic   !!! ERROR
        //    60: getstatic       dev/nuker/pyro/fc.0:I
        //    63: ifeq            71
        //    66: ldc             -1521240802
        //    68: goto            73
        //    71: ldc             791421245
        //    73: ldc             -682893252
        //    75: ixor           
        //    76: lookupswitch {
        //          -127418111: 104
        //          1914197282: 71
        //          default: 110
        //        }
        //   104: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   107: return         
        //   108: aconst_null    
        //   109: athrow         
        //   110: aconst_null    
        //   111: athrow         
        //    StackMapTable: 00 08 FF 00 13 00 01 06 00 03 06 07 00 41 07 00 41 FF 00 01 00 01 06 00 04 06 07 00 41 07 00 41 01 FF 00 1E 00 01 06 00 03 06 07 00 41 07 00 41 FF 00 12 00 01 06 00 04 06 07 00 41 07 00 41 07 00 41 FF 00 01 00 01 06 00 05 06 07 00 41 07 00 41 07 00 41 01 FF 00 1E 00 01 06 00 04 06 07 00 41 07 00 41 07 00 41 FF 00 03 00 01 06 00 03 06 07 00 41 07 00 41 FF 00 01 00 01 06 00 04 06 07 00 41 07 00 41 07 00 41
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
    
    public void c(final boolean b) {
        fbS.4x(this, 816763794, b);
    }
    
    public boolean 4() {
        return fbS.ea(this, 126340805);
    }
    
    public boolean 1() {
        return fbS.e9(this, 1683396546);
    }
}
