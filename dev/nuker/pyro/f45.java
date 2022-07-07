// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.gui.ScaledResolution;
import java.util.ArrayList;

public class f45 extends fbk
{
    public int c;
    public ArrayList<f43> c;
    public float c;
    public float 0;
    public boolean c;
    public f44 c;
    public f43 c;
    public boolean 0;
    
    public float c() {
        return fbS.au(this, 2132644650);
    }
    
    public f43 c(final f43 p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          513
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            505
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            497
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             1426379026
        //    32: goto            37
        //    35: ldc             66192804
        //    37: ldc             663684912
        //    39: ixor           
        //    40: lookupswitch {
        //          1921766946: 484
        //          2037128702: 35
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f45.c:Ljava/util/ArrayList;
        //    72: getstatic       dev/nuker/pyro/fc.c:I
        //    75: ifge            83
        //    78: ldc             -453112425
        //    80: goto            85
        //    83: ldc             -854537942
        //    85: ldc             -130023605
        //    87: ixor           
        //    88: lookupswitch {
        //          482472668: 482
        //          1561608932: 83
        //          default: 116
        //        }
        //   116: aload_1        
        //   117: goto            121
        //   120: athrow         
        //   121: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   124: goto            128
        //   127: athrow         
        //   128: pop            
        //   129: aload_1        
        //   130: goto            134
        //   133: athrow         
        //   134: invokevirtual   dev/nuker/pyro/f43.e:()V
        //   137: goto            141
        //   140: athrow         
        //   141: getstatic       dev/nuker/pyro/fc.c:I
        //   144: ifge            152
        //   147: ldc             -1806079174
        //   149: goto            154
        //   152: ldc             1782926804
        //   154: ldc             1544592282
        //   156: ixor           
        //   157: lookupswitch {
        //          -934678368: 478
        //          525769509: 152
        //          default: 184
        //        }
        //   184: aload_1        
        //   185: aload_0        
        //   186: getstatic       dev/nuker/pyro/fc.c:I
        //   189: ifge            197
        //   192: ldc             1759406383
        //   194: goto            199
        //   197: ldc             1129439638
        //   199: ldc             1689599935
        //   201: ixor           
        //   202: lookupswitch {
        //          208361104: 197
        //          669310505: 228
        //          default: 474
        //        }
        //   228: goto            232
        //   231: athrow         
        //   232: invokevirtual   dev/nuker/pyro/f43.c:(Ldev/nuker/pyro/f45;)V
        //   235: goto            239
        //   238: athrow         
        //   239: getstatic       dev/nuker/pyro/fc.1:I
        //   242: ifeq            250
        //   245: ldc             -394619582
        //   247: goto            252
        //   250: ldc             -642020572
        //   252: ldc             447689630
        //   254: ixor           
        //   255: lookupswitch {
        //          -2099408997: 250
        //          -220879140: 480
        //          default: 280
        //        }
        //   280: aload_0        
        //   281: iconst_0       
        //   282: putfield        dev/nuker/pyro/f45.c:Z
        //   285: getstatic       dev/nuker/pyro/fc.0:I
        //   288: ifeq            296
        //   291: ldc             -1071626469
        //   293: goto            298
        //   296: ldc             1049586666
        //   298: ldc             2012303053
        //   300: ixor           
        //   301: lookupswitch {
        //          -1211037226: 476
        //          -718052336: 296
        //          default: 328
        //        }
        //   328: aload_1        
        //   329: goto            333
        //   332: athrow         
        //   333: invokevirtual   dev/nuker/pyro/f43.7:()Z
        //   336: goto            340
        //   339: athrow         
        //   340: ifne            408
        //   343: getstatic       dev/nuker/pyro/f45.c:Lnet/minecraft/client/Minecraft;
        //   346: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //   349: instanceof      Ldev/nuker/pyro/f42;
        //   352: ifne            408
        //   355: getstatic       dev/nuker/pyro/fc.1:I
        //   358: ifeq            366
        //   361: ldc             2043788598
        //   363: goto            368
        //   366: ldc             858218458
        //   368: ldc             -219963937
        //   370: ixor           
        //   371: lookupswitch {
        //          -1959649047: 366
        //          -1044069883: 396
        //          default: 486
        //        }
        //   396: aload_1        
        //   397: goto            401
        //   400: athrow         
        //   401: invokevirtual   dev/nuker/pyro/f43.b:()V
        //   404: goto            408
        //   407: athrow         
        //   408: getstatic       dev/nuker/pyro/fA.c:Ldev/nuker/pyro/fA;
        //   411: goto            415
        //   414: athrow         
        //   415: invokevirtual   dev/nuker/pyro/fA.4:()V
        //   418: goto            422
        //   421: athrow         
        //   422: iload_2        
        //   423: ifeq            431
        //   426: ldc             778955321
        //   428: goto            433
        //   431: ldc             778955326
        //   433: ldc             1853338994
        //   435: ixor           
        //   436: tableswitch {
        //          -2144026986: 460
        //          -2144026985: 472
        //          default: 426
        //        }
        //   460: aload_0        
        //   461: goto            465
        //   464: athrow         
        //   465: invokevirtual   dev/nuker/pyro/f45.5:()V
        //   468: goto            472
        //   471: athrow         
        //   472: aload_1        
        //   473: areturn        
        //   474: aconst_null    
        //   475: athrow         
        //   476: aconst_null    
        //   477: athrow         
        //   478: aconst_null    
        //   479: athrow         
        //   480: aconst_null    
        //   481: athrow         
        //   482: aconst_null    
        //   483: athrow         
        //   484: aconst_null    
        //   485: athrow         
        //   486: aconst_null    
        //   487: athrow         
        //   488: pop            
        //   489: goto            24
        //   492: pop            
        //   493: aconst_null    
        //   494: goto            488
        //   497: dup            
        //   498: ifnull          488
        //   501: checkcast       Ljava/lang/Throwable;
        //   504: athrow         
        //   505: dup            
        //   506: ifnull          492
        //   509: checkcast       Ljava/lang/Throwable;
        //   512: athrow         
        //   513: aconst_null    
        //   514: athrow         
        //    StackMapTable: 00 45 43 07 00 33 04 FF 00 0B 00 00 00 01 07 00 33 FE 00 03 07 00 03 07 00 45 01 0A 41 01 1E 4E 07 00 3F FF 00 01 00 03 07 00 03 07 00 45 01 00 02 07 00 3F 01 5E 07 00 3F 43 07 00 1D FF 00 00 00 03 07 00 03 07 00 45 01 00 02 07 00 3F 07 00 45 45 07 00 33 40 01 44 07 00 33 40 07 00 45 45 07 00 33 00 0A 41 01 1D FF 00 0C 00 03 07 00 03 07 00 45 01 00 02 07 00 45 07 00 03 FF 00 01 00 03 07 00 03 07 00 45 01 00 03 07 00 45 07 00 03 01 FF 00 1C 00 03 07 00 03 07 00 45 01 00 02 07 00 45 07 00 03 42 07 00 21 FF 00 00 00 03 07 00 03 07 00 45 01 00 02 07 00 45 07 00 03 45 07 00 33 00 0A 41 01 1B 0F 41 01 1D FF 00 03 00 00 00 01 07 00 33 FF 00 00 00 03 07 00 03 07 00 45 01 00 01 07 00 45 45 07 00 33 40 01 19 41 01 1B 43 07 00 29 40 07 00 45 45 07 00 33 00 45 07 00 23 40 07 00 74 45 07 00 33 00 03 04 41 01 1A 43 07 00 33 40 07 00 03 45 07 00 33 00 FF 00 01 00 03 07 00 03 07 00 45 01 00 02 07 00 45 07 00 03 01 01 01 41 07 00 3F 01 01 41 07 00 33 43 05 44 07 00 33 47 05 47 07 00 33
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     497    505    Any
        //  497    505    497    505    Any
        //  513    515    3      8      Ljava/lang/AssertionError;
        //  120    127    127    128    Any
        //  120    127    127    128    Any
        //  120    127    3      8      Ljava/lang/NumberFormatException;
        //  120    127    127    128    Any
        //  120    127    120    121    Ljava/lang/NegativeArraySizeException;
        //  133    140    140    141    Any
        //  134    140    133    134    Any
        //  133    140    133    134    Any
        //  134    140    133    134    Any
        //  133    140    133    134    Ljava/lang/IndexOutOfBoundsException;
        //  231    238    238    239    Any
        //  231    238    231    232    Ljava/lang/IllegalStateException;
        //  232    238    3      8      Ljava/lang/AssertionError;
        //  231    238    238    239    Ljava/lang/IllegalStateException;
        //  231    238    3      8      Ljava/lang/RuntimeException;
        //  333    339    339    340    Any
        //  333    339    339    340    Any
        //  333    339    339    340    Ljava/lang/NullPointerException;
        //  333    339    3      8      Any
        //  333    339    339    340    Ljava/util/NoSuchElementException;
        //  400    407    407    408    Any
        //  401    407    407    408    Ljava/lang/NullPointerException;
        //  401    407    3      8      Ljava/lang/IllegalStateException;
        //  400    407    400    401    Ljava/lang/UnsupportedOperationException;
        //  401    407    3      8      Any
        //  414    421    421    422    Any
        //  415    421    414    415    Ljava/lang/UnsupportedOperationException;
        //  415    421    414    415    Ljava/lang/IndexOutOfBoundsException;
        //  415    421    3      8      Ljava/lang/ArithmeticException;
        //  415    421    421    422    Ljava/lang/AssertionError;
        //  464    471    471    472    Any
        //  464    471    464    465    Any
        //  465    471    464    465    Any
        //  465    471    3      8      Ljava/util/ConcurrentModificationException;
        //  465    471    471    472    Any
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
    
    public boolean c(final int n, final int n2, final int n3) {
        return fbS.fe(this, 2073427142, n, n2, n3);
    }
    
    public f43 3(final f43 f43) {
        return fbS.gZ(this, 1980957836, f43);
    }
    
    public ArrayList 3() {
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
        //    17: getfield        dev/nuker/pyro/f45.c:Ljava/util/ArrayList;
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
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 33 FC 00 03 07 00 03 44 07 00 33 43 05 44 07 00 33 47 05
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
    
    public float c(final ScaledResolution p0, final int p1, final int p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          3889
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            3881
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            3873
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f45.c:Ljava/util/ArrayList;
        //    28: getstatic       dev/nuker/pyro/fc.c:I
        //    31: ifge            39
        //    34: ldc             815024578
        //    36: goto            41
        //    39: ldc             -1196685388
        //    41: ldc             -677249266
        //    43: ixor           
        //    44: lookupswitch {
        //          -415910196: 39
        //          1863186618: 72
        //          default: 3862
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    79: goto            83
        //    82: athrow         
        //    83: ifeq            88
        //    86: fconst_0       
        //    87: freturn        
        //    88: aload_0        
        //    89: getfield        dev/nuker/pyro/f45.c:Ljava/util/ArrayList;
        //    92: invokedynamic   BootstrapMethod #0, test:()Ljava/util/function/Predicate;
        //    97: getstatic       dev/nuker/pyro/fc.0:I
        //   100: ifeq            108
        //   103: ldc             -1141545562
        //   105: goto            110
        //   108: ldc             1944538203
        //   110: ldc             1192967803
        //   112: ixor           
        //   113: lookupswitch {
        //          -51487779: 108
        //          888959520: 140
        //          default: 3816
        //        }
        //   140: goto            144
        //   143: athrow         
        //   144: invokevirtual   java/util/ArrayList.removeIf:(Ljava/util/function/Predicate;)Z
        //   147: goto            151
        //   150: athrow         
        //   151: pop            
        //   152: iconst_1       
        //   153: istore          5
        //   155: iconst_0       
        //   156: istore          6
        //   158: aload_0        
        //   159: fconst_0       
        //   160: putfield        dev/nuker/pyro/f45.c:F
        //   163: aload_0        
        //   164: fconst_0       
        //   165: putfield        dev/nuker/pyro/f45.0:F
        //   168: getstatic       dev/nuker/pyro/fc.0:I
        //   171: ifeq            179
        //   174: ldc             -1688042843
        //   176: goto            181
        //   179: ldc             1933882310
        //   181: ldc             -1917604907
        //   183: ixor           
        //   184: lookupswitch {
        //          -1795370094: 179
        //          382806384: 3786
        //          default: 212
        //        }
        //   212: aload_0        
        //   213: getfield        dev/nuker/pyro/f45.c:Ljava/util/ArrayList;
        //   216: goto            220
        //   219: athrow         
        //   220: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   223: goto            227
        //   226: athrow         
        //   227: astore          7
        //   229: aload           7
        //   231: getstatic       dev/nuker/pyro/fc.1:I
        //   234: ifeq            242
        //   237: ldc             979577589
        //   239: goto            244
        //   242: ldc             74044952
        //   244: ldc             -763281315
        //   246: ixor           
        //   247: lookupswitch {
        //          -689400251: 272
        //          -387814744: 242
        //          default: 3838
        //        }
        //   272: goto            276
        //   275: athrow         
        //   276: invokeinterface java/util/Iterator.hasNext:()Z
        //   281: goto            285
        //   284: athrow         
        //   285: ifeq            3599
        //   288: aload           7
        //   290: goto            294
        //   293: athrow         
        //   294: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   299: goto            303
        //   302: athrow         
        //   303: checkcast       Ldev/nuker/pyro/f43;
        //   306: astore          8
        //   308: getstatic       dev/nuker/pyro/fc.0:I
        //   311: ifeq            319
        //   314: ldc             -452759094
        //   316: goto            321
        //   319: ldc             -1711899881
        //   321: ldc             -1247552955
        //   323: ixor           
        //   324: lookupswitch {
        //          743809362: 352
        //          1352706959: 319
        //          default: 3764
        //        }
        //   352: aload           8
        //   354: getstatic       dev/nuker/pyro/fc.c:I
        //   357: ifge            365
        //   360: ldc             -67188661
        //   362: goto            367
        //   365: ldc             -24526516
        //   367: ldc             -71834390
        //   369: ixor           
        //   370: lookupswitch {
        //          4795553: 3760
        //          128596988: 365
        //          default: 396
        //        }
        //   396: goto            400
        //   399: athrow         
        //   400: invokevirtual   dev/nuker/pyro/f43.7:()Z
        //   403: goto            407
        //   406: athrow         
        //   407: ifne            923
        //   410: getstatic       dev/nuker/pyro/fc.1:I
        //   413: ifeq            421
        //   416: ldc             1711034670
        //   418: goto            423
        //   421: ldc             929907118
        //   423: ldc             1743481025
        //   425: ixor           
        //   426: lookupswitch {
        //          35076591: 3772
        //          904106202: 421
        //          default: 452
        //        }
        //   452: iload           4
        //   454: ifeq            462
        //   457: ldc             -372905612
        //   459: goto            464
        //   462: ldc             -372905611
        //   464: ldc             -1443384230
        //   466: ixor           
        //   467: tableswitch {
        //          -2140882340: 488
        //          -2140882339: 603
        //          default: 457
        //        }
        //   488: getstatic       dev/nuker/pyro/fc.1:I
        //   491: ifeq            499
        //   494: ldc             639228574
        //   496: goto            501
        //   499: ldc             -1947038537
        //   501: ldc             500388614
        //   503: ixor           
        //   504: lookupswitch {
        //          1003129240: 3812
        //          1777479495: 499
        //          default: 532
        //        }
        //   532: aload           8
        //   534: goto            538
        //   537: athrow         
        //   538: invokevirtual   dev/nuker/pyro/f43.7:()Z
        //   541: goto            545
        //   544: athrow         
        //   545: ifne            603
        //   548: getstatic       dev/nuker/pyro/fc.c:I
        //   551: ifge            559
        //   554: ldc             -1939625308
        //   556: goto            561
        //   559: ldc             259123900
        //   561: ldc             -2007363512
        //   563: ixor           
        //   564: lookupswitch {
        //          -1567162840: 559
        //          70892268: 3780
        //          default: 592
        //        }
        //   592: aload           8
        //   594: instanceof      Ldev/nuker/pyro/f4a;
        //   597: ifne            603
        //   600: goto            229
        //   603: aload_0        
        //   604: getfield        dev/nuker/pyro/f45.0:Z
        //   607: iload           4
        //   609: if_icmpeq       646
        //   612: iload           4
        //   614: ifeq            633
        //   617: aload           8
        //   619: goto            623
        //   622: athrow         
        //   623: invokevirtual   dev/nuker/pyro/f43.e:()V
        //   626: goto            630
        //   629: athrow         
        //   630: goto            646
        //   633: aload           8
        //   635: goto            639
        //   638: athrow         
        //   639: invokevirtual   dev/nuker/pyro/f43.b:()V
        //   642: goto            646
        //   645: athrow         
        //   646: aload           8
        //   648: goto            652
        //   651: athrow         
        //   652: invokevirtual   dev/nuker/pyro/f43.2:()F
        //   655: goto            659
        //   658: athrow         
        //   659: ldc             10.0
        //   661: fcmpl          
        //   662: iflt            670
        //   665: ldc             -982875766
        //   667: goto            672
        //   670: ldc             -982875765
        //   672: ldc             -793517898
        //   674: ixor           
        //   675: tableswitch {
        //          733135480: 696
        //          733135481: 923
        //          default: 665
        //        }
        //   696: iload           4
        //   698: ifeq            229
        //   701: iload           5
        //   703: ifeq            773
        //   706: aload           8
        //   708: aload_0        
        //   709: getfield        dev/nuker/pyro/f45.c:F
        //   712: iconst_1       
        //   713: goto            717
        //   716: athrow         
        //   717: invokevirtual   dev/nuker/pyro/f43.c:(FZ)Z
        //   720: goto            724
        //   723: athrow         
        //   724: getstatic       dev/nuker/pyro/fc.c:I
        //   727: ifge            735
        //   730: ldc             -1528969034
        //   732: goto            737
        //   735: ldc             660189626
        //   737: ldc             1944143110
        //   739: ixor           
        //   740: lookupswitch {
        //          -780051194: 735
        //          -683897424: 3790
        //          default: 768
        //        }
        //   768: istore          5
        //   770: goto            229
        //   773: getstatic       dev/nuker/pyro/fc.c:I
        //   776: ifge            784
        //   779: ldc             1682054524
        //   781: goto            786
        //   784: ldc             -1309156172
        //   786: ldc             -186201017
        //   788: ixor           
        //   789: lookupswitch {
        //          -1868246725: 784
        //          1158746355: 816
        //          default: 3808
        //        }
        //   816: aload           8
        //   818: aload_0        
        //   819: getstatic       dev/nuker/pyro/fc.0:I
        //   822: ifeq            830
        //   825: ldc             1449009233
        //   827: goto            832
        //   830: ldc             -1431711582
        //   832: ldc             -1838513828
        //   834: ixor           
        //   835: lookupswitch {
        //          -1071700172: 830
        //          -1003183859: 3804
        //          default: 860
        //        }
        //   860: getfield        dev/nuker/pyro/f45.c:F
        //   863: iconst_0       
        //   864: getstatic       dev/nuker/pyro/fc.0:I
        //   867: ifeq            875
        //   870: ldc             -1423002254
        //   872: goto            877
        //   875: ldc             -2077655203
        //   877: ldc             414520736
        //   879: ixor           
        //   880: lookupswitch {
        //          -1667470595: 908
        //          -1281646382: 875
        //          default: 3826
        //        }
        //   908: goto            912
        //   911: athrow         
        //   912: invokevirtual   dev/nuker/pyro/f43.c:(FZ)Z
        //   915: goto            919
        //   918: athrow         
        //   919: pop            
        //   920: goto            229
        //   923: iload           5
        //   925: ifeq            992
        //   928: aload           8
        //   930: aload_0        
        //   931: getstatic       dev/nuker/pyro/fc.0:I
        //   934: ifeq            942
        //   937: ldc             2018365402
        //   939: goto            944
        //   942: ldc             -783890660
        //   944: ldc             1612928419
        //   946: ixor           
        //   947: lookupswitch {
        //          409901689: 3840
        //          2058298831: 942
        //          default: 972
        //        }
        //   972: getfield        dev/nuker/pyro/f45.c:F
        //   975: iconst_1       
        //   976: goto            980
        //   979: athrow         
        //   980: invokevirtual   dev/nuker/pyro/f43.c:(FZ)Z
        //   983: goto            987
        //   986: athrow         
        //   987: istore          5
        //   989: goto            1056
        //   992: aload           8
        //   994: aload_0        
        //   995: getfield        dev/nuker/pyro/f45.c:F
        //   998: iconst_0       
        //   999: getstatic       dev/nuker/pyro/fc.c:I
        //  1002: ifge            1010
        //  1005: ldc             -1060383650
        //  1007: goto            1012
        //  1010: ldc             1980931596
        //  1012: ldc_w           -921797291
        //  1015: ixor           
        //  1016: lookupswitch {
        //          -1088625831: 1044
        //          163948811: 1010
        //          default: 3824
        //        }
        //  1044: goto            1048
        //  1047: athrow         
        //  1048: invokevirtual   dev/nuker/pyro/f43.c:(FZ)Z
        //  1051: goto            1055
        //  1054: athrow         
        //  1055: pop            
        //  1056: getstatic       dev/nuker/pyro/fc.1:I
        //  1059: ifeq            1068
        //  1062: ldc_w           -335539789
        //  1065: goto            1071
        //  1068: ldc_w           1432731651
        //  1071: ldc_w           -111827600
        //  1074: ixor           
        //  1075: lookupswitch {
        //          -1148090904: 1068
        //          357938371: 3822
        //          default: 1100
        //        }
        //  1100: aload_1        
        //  1101: goto            1105
        //  1104: athrow         
        //  1105: invokevirtual   net/minecraft/client/gui/ScaledResolution.func_78326_a:()I
        //  1108: goto            1112
        //  1111: athrow         
        //  1112: i2f            
        //  1113: aload           8
        //  1115: getstatic       dev/nuker/pyro/fc.0:I
        //  1118: ifeq            1127
        //  1121: ldc_w           -213977202
        //  1124: goto            1130
        //  1127: ldc_w           -1106248400
        //  1130: ldc_w           -1186821002
        //  1133: ixor           
        //  1134: lookupswitch {
        //          190479413: 1127
        //          1249672184: 3848
        //          default: 1160
        //        }
        //  1160: goto            1164
        //  1163: athrow         
        //  1164: invokevirtual   dev/nuker/pyro/f43.2:()F
        //  1167: goto            1171
        //  1170: athrow         
        //  1171: fadd           
        //  1172: aload           8
        //  1174: goto            1178
        //  1177: athrow         
        //  1178: invokevirtual   dev/nuker/pyro/f43.4:()F
        //  1181: goto            1185
        //  1184: athrow         
        //  1185: fsub           
        //  1186: fstore          9
        //  1188: aload           8
        //  1190: goto            1194
        //  1193: athrow         
        //  1194: invokevirtual   dev/nuker/pyro/f43.a:()F
        //  1197: goto            1201
        //  1200: athrow         
        //  1201: fstore          10
        //  1203: aload_0        
        //  1204: getfield        dev/nuker/pyro/f45.c:I
        //  1207: tableswitch {
        //                2: 1232
        //                3: 1513
        //                4: 1733
        //          default: 1749
        //        }
        //  1232: getstatic       dev/nuker/pyro/fc.1:I
        //  1235: ifeq            1244
        //  1238: ldc_w           -1667856935
        //  1241: goto            1247
        //  1244: ldc_w           149308454
        //  1247: ldc_w           1343234570
        //  1250: ixor           
        //  1251: lookupswitch {
        //          -863590445: 3794
        //          772500269: 1244
        //          default: 1276
        //        }
        //  1276: aload_1        
        //  1277: goto            1281
        //  1280: athrow         
        //  1281: invokevirtual   net/minecraft/client/gui/ScaledResolution.func_78328_b:()I
        //  1284: goto            1288
        //  1287: athrow         
        //  1288: i2f            
        //  1289: getstatic       dev/nuker/pyro/fc.c:I
        //  1292: ifge            1301
        //  1295: ldc_w           -1739766658
        //  1298: goto            1304
        //  1301: ldc_w           1349646476
        //  1304: ldc_w           -893266356
        //  1307: ixor           
        //  1308: lookupswitch {
        //          -1258448622: 1301
        //          1384944178: 3842
        //          default: 1336
        //        }
        //  1336: aload           8
        //  1338: goto            1342
        //  1341: athrow         
        //  1342: invokevirtual   dev/nuker/pyro/f43.a:()F
        //  1345: goto            1349
        //  1348: athrow         
        //  1349: fsub           
        //  1350: aload           8
        //  1352: goto            1356
        //  1355: athrow         
        //  1356: invokevirtual   dev/nuker/pyro/f43.0:()F
        //  1359: goto            1363
        //  1362: athrow         
        //  1363: fsub           
        //  1364: getstatic       dev/nuker/pyro/fc.1:I
        //  1367: ifeq            1376
        //  1370: ldc_w           1970973552
        //  1373: goto            1379
        //  1376: ldc_w           722708439
        //  1379: ldc_w           -1699847682
        //  1382: ixor           
        //  1383: lookupswitch {
        //          -1312963031: 1408
        //          -271267186: 1376
        //          default: 3784
        //        }
        //  1408: getstatic       dev/nuker/pyro/f45.c:Lnet/minecraft/client/Minecraft;
        //  1411: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //  1414: instanceof      Lnet/minecraft/client/gui/GuiChat;
        //  1417: ifeq            1426
        //  1420: ldc_w           822026951
        //  1423: goto            1429
        //  1426: ldc_w           822026948
        //  1429: ldc_w           287125298
        //  1432: ixor           
        //  1433: tableswitch {
        //          1136925674: 1456
        //          1136925675: 1461
        //          default: 1420
        //        }
        //  1456: bipush          16
        //  1458: goto            1462
        //  1461: iconst_0       
        //  1462: i2f            
        //  1463: fsub           
        //  1464: getstatic       dev/nuker/pyro/fc.c:I
        //  1467: ifge            1476
        //  1470: ldc_w           -1185070313
        //  1473: goto            1479
        //  1476: ldc_w           -1864519493
        //  1479: ldc_w           -1724445873
        //  1482: ixor           
        //  1483: lookupswitch {
        //          166378484: 1508
        //          543836248: 1476
        //          default: 3796
        //        }
        //  1508: fstore          10
        //  1510: goto            1749
        //  1513: getstatic       dev/nuker/pyro/fc.1:I
        //  1516: ifeq            1525
        //  1519: ldc_w           -1282507493
        //  1522: goto            1528
        //  1525: ldc_w           2008503777
        //  1528: ldc_w           1297198478
        //  1531: ixor           
        //  1532: lookupswitch {
        //          -18886507: 1525
        //          988215407: 1560
        //          default: 3802
        //        }
        //  1560: aload           8
        //  1562: goto            1566
        //  1565: athrow         
        //  1566: invokevirtual   dev/nuker/pyro/f43.2:()F
        //  1569: goto            1573
        //  1572: athrow         
        //  1573: fneg           
        //  1574: getstatic       dev/nuker/pyro/fc.1:I
        //  1577: ifeq            1586
        //  1580: ldc_w           -1965832353
        //  1583: goto            1589
        //  1586: ldc_w           1177557791
        //  1589: ldc_w           1914887516
        //  1592: ixor           
        //  1593: lookupswitch {
        //          -118416893: 1586
        //          873645635: 1620
        //          default: 3828
        //        }
        //  1620: fstore          9
        //  1622: aload_1        
        //  1623: goto            1627
        //  1626: athrow         
        //  1627: invokevirtual   net/minecraft/client/gui/ScaledResolution.func_78328_b:()I
        //  1630: goto            1634
        //  1633: athrow         
        //  1634: i2f            
        //  1635: aload           8
        //  1637: goto            1641
        //  1640: athrow         
        //  1641: invokevirtual   dev/nuker/pyro/f43.a:()F
        //  1644: goto            1648
        //  1647: athrow         
        //  1648: fsub           
        //  1649: aload           8
        //  1651: goto            1655
        //  1654: athrow         
        //  1655: invokevirtual   dev/nuker/pyro/f43.0:()F
        //  1658: goto            1662
        //  1661: athrow         
        //  1662: fsub           
        //  1663: getstatic       dev/nuker/pyro/f45.c:Lnet/minecraft/client/Minecraft;
        //  1666: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //  1669: instanceof      Lnet/minecraft/client/gui/GuiChat;
        //  1672: ifeq            1680
        //  1675: bipush          20
        //  1677: goto            1681
        //  1680: iconst_0       
        //  1681: i2f            
        //  1682: fsub           
        //  1683: getstatic       dev/nuker/pyro/fc.1:I
        //  1686: ifeq            1695
        //  1689: ldc_w           1333476692
        //  1692: goto            1698
        //  1695: ldc_w           -1114488619
        //  1698: ldc_w           400782845
        //  1701: ixor           
        //  1702: lookupswitch {
        //          -1435421400: 1728
        //          1486375081: 1695
        //          default: 3778
        //        }
        //  1728: fstore          10
        //  1730: goto            1749
        //  1733: aload           8
        //  1735: goto            1739
        //  1738: athrow         
        //  1739: invokevirtual   dev/nuker/pyro/f43.2:()F
        //  1742: goto            1746
        //  1745: athrow         
        //  1746: fneg           
        //  1747: fstore          9
        //  1749: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f9H;
        //  1752: goto            1756
        //  1755: athrow         
        //  1756: invokevirtual   dev/nuker/pyro/f9H.c:()Ldev/nuker/pyro/f0a;
        //  1759: goto            1763
        //  1762: athrow         
        //  1763: getstatic       dev/nuker/pyro/fc.1:I
        //  1766: ifeq            1775
        //  1769: ldc_w           736255528
        //  1772: goto            1778
        //  1775: ldc_w           131632377
        //  1778: ldc_w           -709031805
        //  1781: ixor           
        //  1782: lookupswitch {
        //          -466631833: 1775
        //          -27306325: 3792
        //          default: 1808
        //        }
        //  1808: goto            1812
        //  1811: athrow         
        //  1812: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1815: goto            1819
        //  1818: athrow         
        //  1819: checkcast       Ljava/lang/Boolean;
        //  1822: goto            1826
        //  1825: athrow         
        //  1826: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1829: goto            1833
        //  1832: athrow         
        //  1833: ifeq            2073
        //  1836: aload           8
        //  1838: getstatic       dev/nuker/pyro/fc.0:I
        //  1841: ifeq            1850
        //  1844: ldc_w           833278456
        //  1847: goto            1853
        //  1850: ldc_w           1495667784
        //  1853: ldc_w           1688935197
        //  1856: ixor           
        //  1857: lookupswitch {
        //          1032654677: 1884
        //          1426180837: 1850
        //          default: 3818
        //        }
        //  1884: getfield        dev/nuker/pyro/f43.c:Ldev/nuker/pyro/f49;
        //  1887: getstatic       dev/nuker/pyro/fc.1:I
        //  1890: ifeq            1899
        //  1893: ldc_w           -1191937345
        //  1896: goto            1902
        //  1899: ldc_w           -2099888578
        //  1902: ldc_w           1933126262
        //  1905: ixor           
        //  1906: lookupswitch {
        //          -875736887: 3766
        //          247238163: 1899
        //          default: 1932
        //        }
        //  1932: goto            1936
        //  1935: athrow         
        //  1936: invokevirtual   dev/nuker/pyro/f49.4:()Z
        //  1939: goto            1943
        //  1942: athrow         
        //  1943: ifne            2004
        //  1946: getstatic       dev/nuker/pyro/fc.1:I
        //  1949: ifeq            1958
        //  1952: ldc_w           -299440031
        //  1955: goto            1961
        //  1958: ldc_w           -1998420977
        //  1961: ldc_w           2122674483
        //  1964: ixor           
        //  1965: lookupswitch {
        //          -1868326574: 1958
        //          -160959172: 1992
        //          default: 3800
        //        }
        //  1992: getstatic       dev/nuker/pyro/f45.c:Lnet/minecraft/client/Minecraft;
        //  1995: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //  1998: instanceof      Ldev/nuker/pyro/f42;
        //  2001: ifeq            2073
        //  2004: aload           8
        //  2006: goto            2010
        //  2009: athrow         
        //  2010: invokevirtual   dev/nuker/pyro/f43.7:()Z
        //  2013: goto            2017
        //  2016: athrow         
        //  2017: ifeq            2073
        //  2020: fload           9
        //  2022: fload           10
        //  2024: fload           9
        //  2026: aload           8
        //  2028: goto            2032
        //  2031: athrow         
        //  2032: invokevirtual   dev/nuker/pyro/f43.4:()F
        //  2035: goto            2039
        //  2038: athrow         
        //  2039: fadd           
        //  2040: fload           10
        //  2042: aload           8
        //  2044: goto            2048
        //  2047: athrow         
        //  2048: invokevirtual   dev/nuker/pyro/f43.0:()F
        //  2051: goto            2055
        //  2054: athrow         
        //  2055: fadd           
        //  2056: ldc_w           1963986960
        //  2059: goto            2063
        //  2062: athrow         
        //  2063: invokestatic    dev/nuker/pyro/fbs.c:(FFFFI)V
        //  2066: goto            2070
        //  2069: athrow         
        //  2070: goto            2279
        //  2073: aload           8
        //  2075: goto            2079
        //  2078: athrow         
        //  2079: invokevirtual   dev/nuker/pyro/f43.7:()Z
        //  2082: goto            2086
        //  2085: athrow         
        //  2086: ifne            2279
        //  2089: fload           9
        //  2091: fload           10
        //  2093: fload           9
        //  2095: aload           8
        //  2097: goto            2101
        //  2100: athrow         
        //  2101: invokevirtual   dev/nuker/pyro/f43.4:()F
        //  2104: goto            2108
        //  2107: athrow         
        //  2108: fadd           
        //  2109: getstatic       dev/nuker/pyro/fc.0:I
        //  2112: ifeq            2121
        //  2115: ldc_w           -286456663
        //  2118: goto            2124
        //  2121: ldc_w           -496026561
        //  2124: ldc_w           -1370226153
        //  2127: ixor           
        //  2128: lookupswitch {
        //          1085867710: 2121
        //          1278950952: 2156
        //          default: 3858
        //        }
        //  2156: fload           10
        //  2158: getstatic       dev/nuker/pyro/fc.1:I
        //  2161: ifeq            2170
        //  2164: ldc_w           661169497
        //  2167: goto            2173
        //  2170: ldc_w           -1903156831
        //  2173: ldc_w           -1376373317
        //  2176: ixor           
        //  2177: lookupswitch {
        //          -1969319710: 3798
        //          -1529734177: 2170
        //          default: 2204
        //        }
        //  2204: aload           8
        //  2206: goto            2210
        //  2209: athrow         
        //  2210: invokevirtual   dev/nuker/pyro/f43.0:()F
        //  2213: goto            2217
        //  2216: athrow         
        //  2217: fadd           
        //  2218: ldc_w           1979645952
        //  2221: getstatic       dev/nuker/pyro/fc.1:I
        //  2224: ifeq            2233
        //  2227: ldc_w           -953503488
        //  2230: goto            2236
        //  2233: ldc_w           -574844559
        //  2236: ldc_w           117958404
        //  2239: ixor           
        //  2240: lookupswitch {
        //          -1070770684: 2233
        //          -625248651: 2268
        //          default: 3788
        //        }
        //  2268: goto            2272
        //  2271: athrow         
        //  2272: invokestatic    dev/nuker/pyro/fbs.c:(FFFFI)V
        //  2275: goto            2279
        //  2278: athrow         
        //  2279: iload           6
        //  2281: ifne            2542
        //  2284: iload_2        
        //  2285: i2f            
        //  2286: fload           9
        //  2288: fcmpl          
        //  2289: iflt            2298
        //  2292: ldc_w           -1493164129
        //  2295: goto            2301
        //  2298: ldc_w           -1493164130
        //  2301: ldc_w           2118542445
        //  2304: ixor           
        //  2305: tableswitch {
        //          -1299384348: 2328
        //          -1299384347: 2542
        //          default: 2292
        //        }
        //  2328: iload_2        
        //  2329: i2f            
        //  2330: fload           9
        //  2332: aload           8
        //  2334: goto            2338
        //  2337: athrow         
        //  2338: invokevirtual   dev/nuker/pyro/f43.4:()F
        //  2341: goto            2345
        //  2344: athrow         
        //  2345: fadd           
        //  2346: fcmpg          
        //  2347: ifge            2542
        //  2350: iload_3        
        //  2351: i2f            
        //  2352: fload           10
        //  2354: fcmpl          
        //  2355: iflt            2542
        //  2358: iload_3        
        //  2359: i2f            
        //  2360: getstatic       dev/nuker/pyro/fc.1:I
        //  2363: ifeq            2372
        //  2366: ldc_w           -39244187
        //  2369: goto            2375
        //  2372: ldc_w           -1420049717
        //  2375: ldc_w           -523905412
        //  2378: ixor           
        //  2379: lookupswitch {
        //          493680665: 2372
        //          1268651191: 2404
        //          default: 3768
        //        }
        //  2404: fload           10
        //  2406: aload           8
        //  2408: goto            2412
        //  2411: athrow         
        //  2412: invokevirtual   dev/nuker/pyro/f43.0:()F
        //  2415: goto            2419
        //  2418: athrow         
        //  2419: fadd           
        //  2420: fcmpg          
        //  2421: ifgt            2542
        //  2424: iconst_1       
        //  2425: getstatic       dev/nuker/pyro/fc.c:I
        //  2428: ifge            2437
        //  2431: ldc_w           477958029
        //  2434: goto            2440
        //  2437: ldc_w           81970165
        //  2440: ldc_w           -549566141
        //  2443: ixor           
        //  2444: lookupswitch {
        //          -1019001138: 3782
        //          361633781: 2437
        //          default: 2472
        //        }
        //  2472: istore          6
        //  2474: aload_0        
        //  2475: getstatic       dev/nuker/pyro/fc.1:I
        //  2478: ifeq            2487
        //  2481: ldc_w           1783123159
        //  2484: goto            2490
        //  2487: ldc_w           698903915
        //  2490: ldc_w           -849060777
        //  2493: ixor           
        //  2494: lookupswitch {
        //          -1490284416: 2487
        //          -456380100: 2520
        //          default: 3856
        //        }
        //  2520: aload           8
        //  2522: goto            2526
        //  2525: athrow         
        //  2526: invokevirtual   dev/nuker/pyro/f43.c:()Ldev/nuker/pyro/f44;
        //  2529: goto            2533
        //  2532: athrow         
        //  2533: putfield        dev/nuker/pyro/f45.c:Ldev/nuker/pyro/f44;
        //  2536: aload_0        
        //  2537: aload           8
        //  2539: putfield        dev/nuker/pyro/f45.c:Ldev/nuker/pyro/f43;
        //  2542: aload_0        
        //  2543: getstatic       dev/nuker/pyro/fc.1:I
        //  2546: ifeq            2555
        //  2549: ldc_w           -1742655920
        //  2552: goto            2558
        //  2555: ldc_w           618299797
        //  2558: ldc_w           -565053852
        //  2561: ixor           
        //  2562: lookupswitch {
        //          -91523087: 2588
        //          1181800500: 2555
        //          default: 3836
        //        }
        //  2588: getfield        dev/nuker/pyro/f45.c:Ldev/nuker/pyro/f43;
        //  2591: getstatic       dev/nuker/pyro/fc.1:I
        //  2594: ifeq            2603
        //  2597: ldc_w           943181020
        //  2600: goto            2606
        //  2603: ldc_w           -363529456
        //  2606: ldc_w           -980577099
        //  2609: ixor           
        //  2610: lookupswitch {
        //          -38119319: 3770
        //          913779833: 2603
        //          default: 2636
        //        }
        //  2636: aload           8
        //  2638: if_acmpne       2850
        //  2641: aload_0        
        //  2642: getstatic       dev/nuker/pyro/fc.0:I
        //  2645: ifeq            2654
        //  2648: ldc_w           145644079
        //  2651: goto            2657
        //  2654: ldc_w           -1726024095
        //  2657: ldc_w           239951914
        //  2660: ixor           
        //  2661: lookupswitch {
        //          56459382: 2654
        //          115554821: 3844
        //          default: 2688
        //        }
        //  2688: getfield        dev/nuker/pyro/f45.c:Ldev/nuker/pyro/f43;
        //  2691: getstatic       dev/nuker/pyro/fc.0:I
        //  2694: ifeq            2703
        //  2697: ldc_w           -1627514737
        //  2700: goto            2706
        //  2703: ldc_w           1964498692
        //  2706: ldc_w           -1833829129
        //  2709: ixor           
        //  2710: lookupswitch {
        //          206562424: 3806
        //          1791972262: 2703
        //          default: 2736
        //        }
        //  2736: getfield        dev/nuker/pyro/f43.c:Ldev/nuker/pyro/f49;
        //  2739: goto            2743
        //  2742: athrow         
        //  2743: invokevirtual   dev/nuker/pyro/f49.0:()Z
        //  2746: goto            2750
        //  2749: athrow         
        //  2750: ifeq            2850
        //  2753: fload           9
        //  2755: fload           10
        //  2757: getstatic       dev/nuker/pyro/fc.0:I
        //  2760: ifeq            2769
        //  2763: ldc_w           -812744908
        //  2766: goto            2772
        //  2769: ldc_w           -41021897
        //  2772: ldc_w           1579987225
        //  2775: ixor           
        //  2776: lookupswitch {
        //          -1851601363: 2769
        //          -1549615314: 2804
        //          default: 3820
        //        }
        //  2804: fload           9
        //  2806: aload           8
        //  2808: goto            2812
        //  2811: athrow         
        //  2812: invokevirtual   dev/nuker/pyro/f43.4:()F
        //  2815: goto            2819
        //  2818: athrow         
        //  2819: fadd           
        //  2820: fload           10
        //  2822: aload           8
        //  2824: goto            2828
        //  2827: athrow         
        //  2828: invokevirtual   dev/nuker/pyro/f43.0:()F
        //  2831: goto            2835
        //  2834: athrow         
        //  2835: fadd           
        //  2836: ldc_w           1962934272
        //  2839: goto            2843
        //  2842: athrow         
        //  2843: invokestatic    dev/nuker/pyro/fbs.c:(FFFFI)V
        //  2846: goto            2850
        //  2849: athrow         
        //  2850: goto            2854
        //  2853: athrow         
        //  2854: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //  2857: goto            2861
        //  2860: athrow         
        //  2861: fload           9
        //  2863: fload           10
        //  2865: fconst_0       
        //  2866: goto            2870
        //  2869: athrow         
        //  2870: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //  2873: goto            2877
        //  2876: athrow         
        //  2877: aload           8
        //  2879: getfield        dev/nuker/pyro/f43.c:Ldev/nuker/pyro/f49;
        //  2882: aload_0        
        //  2883: getfield        dev/nuker/pyro/f45.c:I
        //  2886: goto            2890
        //  2889: athrow         
        //  2890: invokestatic    dev/nuker/pyro/f4d.c:(I)Ldev/nuker/pyro/f4d;
        //  2893: goto            2897
        //  2896: athrow         
        //  2897: aload_0        
        //  2898: getstatic       dev/nuker/pyro/fc.1:I
        //  2901: ifeq            2910
        //  2904: ldc_w           1373935329
        //  2907: goto            2913
        //  2910: ldc_w           -1951371311
        //  2913: ldc_w           -642431490
        //  2916: ixor           
        //  2917: lookupswitch {
        //          -2007903457: 3860
        //          1037643779: 2910
        //          default: 2944
        //        }
        //  2944: getfield        dev/nuker/pyro/f45.c:I
        //  2947: aload_1        
        //  2948: iload_2        
        //  2949: i2f            
        //  2950: fload           9
        //  2952: fsub           
        //  2953: iload_3        
        //  2954: i2f            
        //  2955: getstatic       dev/nuker/pyro/fc.0:I
        //  2958: ifeq            2967
        //  2961: ldc_w           1701451874
        //  2964: goto            2970
        //  2967: ldc_w           -1356886003
        //  2970: ldc_w           1749157231
        //  2973: ixor           
        //  2974: lookupswitch {
        //          -950168222: 3000
        //          220732685: 2967
        //          default: 3854
        //        }
        //  3000: fload           10
        //  3002: fsub           
        //  3003: getstatic       dev/nuker/pyro/fc.c:I
        //  3006: ifge            3015
        //  3009: ldc_w           -1708287830
        //  3012: goto            3018
        //  3015: ldc_w           1158912130
        //  3018: ldc_w           -655482393
        //  3021: ixor           
        //  3022: lookupswitch {
        //          -1159263067: 3015
        //          1120123213: 3814
        //          default: 3048
        //        }
        //  3048: goto            3052
        //  3051: athrow         
        //  3052: invokevirtual   dev/nuker/pyro/f49.c:(Ldev/nuker/pyro/f4d;ILnet/minecraft/client/gui/ScaledResolution;FF)V
        //  3055: goto            3059
        //  3058: athrow         
        //  3059: goto            3063
        //  3062: athrow         
        //  3063: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //  3066: goto            3070
        //  3069: athrow         
        //  3070: aload           8
        //  3072: fload           9
        //  3074: goto            3078
        //  3077: athrow         
        //  3078: invokevirtual   dev/nuker/pyro/f43.3:(F)V
        //  3081: goto            3085
        //  3084: athrow         
        //  3085: aload           8
        //  3087: fload           10
        //  3089: goto            3093
        //  3092: athrow         
        //  3093: invokevirtual   dev/nuker/pyro/f43.1:(F)V
        //  3096: goto            3100
        //  3099: athrow         
        //  3100: aload           8
        //  3102: goto            3106
        //  3105: athrow         
        //  3106: invokevirtual   dev/nuker/pyro/f43.4:()F
        //  3109: goto            3113
        //  3112: athrow         
        //  3113: aload_0        
        //  3114: getfield        dev/nuker/pyro/f45.0:F
        //  3117: fcmpl          
        //  3118: ifle            3183
        //  3121: aload_0        
        //  3122: aload           8
        //  3124: goto            3128
        //  3127: athrow         
        //  3128: invokevirtual   dev/nuker/pyro/f43.4:()F
        //  3131: goto            3135
        //  3134: athrow         
        //  3135: getstatic       dev/nuker/pyro/fc.c:I
        //  3138: ifge            3147
        //  3141: ldc_w           -685214823
        //  3144: goto            3150
        //  3147: ldc_w           -644616618
        //  3150: ldc_w           -1332020879
        //  3153: ixor           
        //  3154: lookupswitch {
        //          1739754216: 3147
        //          1762203431: 3180
        //          default: 3830
        //        }
        //  3180: putfield        dev/nuker/pyro/f45.0:F
        //  3183: aload_0        
        //  3184: dup            
        //  3185: getfield        dev/nuker/pyro/f45.c:F
        //  3188: aload           8
        //  3190: getstatic       dev/nuker/pyro/fc.0:I
        //  3193: ifeq            3202
        //  3196: ldc_w           493263915
        //  3199: goto            3205
        //  3202: ldc_w           1691498899
        //  3205: ldc_w           2041141383
        //  3208: ixor           
        //  3209: lookupswitch {
        //          494625044: 3236
        //          1691337900: 3202
        //          default: 3832
        //        }
        //  3236: goto            3240
        //  3239: athrow         
        //  3240: invokevirtual   dev/nuker/pyro/f43.0:()F
        //  3243: goto            3247
        //  3246: athrow         
        //  3247: fadd           
        //  3248: putfield        dev/nuker/pyro/f45.c:F
        //  3251: getstatic       dev/nuker/pyro/fc.1:I
        //  3254: ifeq            3263
        //  3257: ldc_w           -770485329
        //  3260: goto            3266
        //  3263: ldc_w           -142618803
        //  3266: ldc_w           -506478285
        //  3269: ixor           
        //  3270: lookupswitch {
        //          380636798: 3296
        //          870093468: 3263
        //          default: 3762
        //        }
        //  3296: aload_0        
        //  3297: getstatic       dev/nuker/pyro/fc.1:I
        //  3300: ifeq            3309
        //  3303: ldc_w           108435360
        //  3306: goto            3312
        //  3309: ldc_w           455234115
        //  3312: ldc_w           996375107
        //  3315: ixor           
        //  3316: lookupswitch {
        //          541140992: 3344
        //          1024847331: 3309
        //          default: 3810
        //        }
        //  3344: getfield        dev/nuker/pyro/f45.c:Ldev/nuker/pyro/f43;
        //  3347: aload           8
        //  3349: if_acmpne       3358
        //  3352: ldc_w           -1050457344
        //  3355: goto            3361
        //  3358: ldc_w           -1050457343
        //  3361: ldc_w           -34418188
        //  3364: ixor           
        //  3365: tableswitch {
        //          2032350696: 3388
        //          2032350697: 3596
        //          default: 3352
        //        }
        //  3388: aload_0        
        //  3389: getfield        dev/nuker/pyro/f45.c:Ldev/nuker/pyro/f43;
        //  3392: getfield        dev/nuker/pyro/f43.c:Ldev/nuker/pyro/f49;
        //  3395: goto            3399
        //  3398: athrow         
        //  3399: invokevirtual   dev/nuker/pyro/f49.0:()Z
        //  3402: goto            3406
        //  3405: athrow         
        //  3406: ifne            3596
        //  3409: fload           9
        //  3411: getstatic       dev/nuker/pyro/fc.c:I
        //  3414: ifge            3423
        //  3417: ldc_w           -1826590940
        //  3420: goto            3426
        //  3423: ldc_w           1179216864
        //  3426: ldc_w           355604298
        //  3429: ixor           
        //  3430: lookupswitch {
        //          -2045609874: 3834
        //          -1825091841: 3423
        //          default: 3456
        //        }
        //  3456: fload           10
        //  3458: fload           9
        //  3460: aload           8
        //  3462: goto            3466
        //  3465: athrow         
        //  3466: invokevirtual   dev/nuker/pyro/f43.4:()F
        //  3469: goto            3473
        //  3472: athrow         
        //  3473: fadd           
        //  3474: getstatic       dev/nuker/pyro/fc.c:I
        //  3477: ifge            3486
        //  3480: ldc_w           1443164605
        //  3483: goto            3489
        //  3486: ldc_w           -442648971
        //  3489: ldc_w           -715768870
        //  3492: ixor           
        //  3493: lookupswitch {
        //          -2091726233: 3486
        //          818646447: 3520
        //          default: 3774
        //        }
        //  3520: fload           10
        //  3522: getstatic       dev/nuker/pyro/fc.0:I
        //  3525: ifeq            3534
        //  3528: ldc_w           -1232108291
        //  3531: goto            3537
        //  3534: ldc_w           524534065
        //  3537: ldc_w           -1258634558
        //  3540: ixor           
        //  3541: lookupswitch {
        //          -1413938189: 3568
        //          41240127: 3534
        //          default: 3846
        //        }
        //  3568: aload           8
        //  3570: goto            3574
        //  3573: athrow         
        //  3574: invokevirtual   dev/nuker/pyro/f43.0:()F
        //  3577: goto            3581
        //  3580: athrow         
        //  3581: fadd           
        //  3582: ldc_w           1962934272
        //  3585: goto            3589
        //  3588: athrow         
        //  3589: invokestatic    dev/nuker/pyro/fbs.c:(FFFFI)V
        //  3592: goto            3596
        //  3595: athrow         
        //  3596: goto            229
        //  3599: aload_0        
        //  3600: iload           6
        //  3602: getstatic       dev/nuker/pyro/fc.c:I
        //  3605: ifge            3614
        //  3608: ldc_w           276202312
        //  3611: goto            3617
        //  3614: ldc_w           -1390868056
        //  3617: ldc_w           -343098061
        //  3620: ixor           
        //  3621: lookupswitch {
        //          -67486085: 3614
        //          1184216219: 3648
        //          default: 3776
        //        }
        //  3648: goto            3652
        //  3651: athrow         
        //  3652: invokevirtual   dev/nuker/pyro/f45.c:(Z)V
        //  3655: goto            3659
        //  3658: athrow         
        //  3659: aload_0        
        //  3660: getstatic       dev/nuker/pyro/fc.0:I
        //  3663: ifeq            3672
        //  3666: ldc_w           1364848923
        //  3669: goto            3675
        //  3672: ldc_w           -1389236708
        //  3675: ldc_w           -320134730
        //  3678: ixor           
        //  3679: lookupswitch {
        //          -1112354643: 3850
        //          827770769: 3672
        //          default: 3704
        //        }
        //  3704: iload           4
        //  3706: getstatic       dev/nuker/pyro/fc.1:I
        //  3709: ifeq            3718
        //  3712: ldc_w           3710679
        //  3715: goto            3721
        //  3718: ldc_w           -240720376
        //  3721: ldc_w           -1619246390
        //  3724: ixor           
        //  3725: lookupswitch {
        //          -1622877155: 3852
        //          117760630: 3718
        //          default: 3752
        //        }
        //  3752: putfield        dev/nuker/pyro/f45.0:Z
        //  3755: aload_0        
        //  3756: getfield        dev/nuker/pyro/f45.c:F
        //  3759: freturn        
        //  3760: aconst_null    
        //  3761: athrow         
        //  3762: aconst_null    
        //  3763: athrow         
        //  3764: aconst_null    
        //  3765: athrow         
        //  3766: aconst_null    
        //  3767: athrow         
        //  3768: aconst_null    
        //  3769: athrow         
        //  3770: aconst_null    
        //  3771: athrow         
        //  3772: aconst_null    
        //  3773: athrow         
        //  3774: aconst_null    
        //  3775: athrow         
        //  3776: aconst_null    
        //  3777: athrow         
        //  3778: aconst_null    
        //  3779: athrow         
        //  3780: aconst_null    
        //  3781: athrow         
        //  3782: aconst_null    
        //  3783: athrow         
        //  3784: aconst_null    
        //  3785: athrow         
        //  3786: aconst_null    
        //  3787: athrow         
        //  3788: aconst_null    
        //  3789: athrow         
        //  3790: aconst_null    
        //  3791: athrow         
        //  3792: aconst_null    
        //  3793: athrow         
        //  3794: aconst_null    
        //  3795: athrow         
        //  3796: aconst_null    
        //  3797: athrow         
        //  3798: aconst_null    
        //  3799: athrow         
        //  3800: aconst_null    
        //  3801: athrow         
        //  3802: aconst_null    
        //  3803: athrow         
        //  3804: aconst_null    
        //  3805: athrow         
        //  3806: aconst_null    
        //  3807: athrow         
        //  3808: aconst_null    
        //  3809: athrow         
        //  3810: aconst_null    
        //  3811: athrow         
        //  3812: aconst_null    
        //  3813: athrow         
        //  3814: aconst_null    
        //  3815: athrow         
        //  3816: aconst_null    
        //  3817: athrow         
        //  3818: aconst_null    
        //  3819: athrow         
        //  3820: aconst_null    
        //  3821: athrow         
        //  3822: aconst_null    
        //  3823: athrow         
        //  3824: aconst_null    
        //  3825: athrow         
        //  3826: aconst_null    
        //  3827: athrow         
        //  3828: aconst_null    
        //  3829: athrow         
        //  3830: aconst_null    
        //  3831: athrow         
        //  3832: aconst_null    
        //  3833: athrow         
        //  3834: aconst_null    
        //  3835: athrow         
        //  3836: aconst_null    
        //  3837: athrow         
        //  3838: aconst_null    
        //  3839: athrow         
        //  3840: aconst_null    
        //  3841: athrow         
        //  3842: aconst_null    
        //  3843: athrow         
        //  3844: aconst_null    
        //  3845: athrow         
        //  3846: aconst_null    
        //  3847: athrow         
        //  3848: aconst_null    
        //  3849: athrow         
        //  3850: aconst_null    
        //  3851: athrow         
        //  3852: aconst_null    
        //  3853: athrow         
        //  3854: aconst_null    
        //  3855: athrow         
        //  3856: aconst_null    
        //  3857: athrow         
        //  3858: aconst_null    
        //  3859: athrow         
        //  3860: aconst_null    
        //  3861: athrow         
        //  3862: aconst_null    
        //  3863: athrow         
        //  3864: pop            
        //  3865: goto            24
        //  3868: pop            
        //  3869: aconst_null    
        //  3870: goto            3864
        //  3873: dup            
        //  3874: ifnull          3864
        //  3877: checkcast       Ljava/lang/Throwable;
        //  3880: athrow         
        //  3881: dup            
        //  3882: ifnull          3868
        //  3885: checkcast       Ljava/lang/Throwable;
        //  3888: athrow         
        //  3889: aconst_null    
        //  3890: athrow         
        //    StackMapTable: 01 F2 43 07 00 33 04 FF 00 0B 00 00 00 01 07 00 33 FF 00 03 00 05 07 00 03 07 01 05 01 01 01 00 00 4E 07 00 3F FF 00 01 00 05 07 00 03 07 01 05 01 01 01 00 02 07 00 3F 01 5E 07 00 3F FF 00 02 00 00 00 01 07 00 33 FF 00 00 00 05 07 00 03 07 01 05 01 01 01 00 01 07 00 3F 45 07 00 33 40 01 04 FF 00 13 00 05 07 00 03 07 01 05 01 01 01 00 02 07 00 3F 07 01 D4 FF 00 01 00 05 07 00 03 07 01 05 01 01 01 00 03 07 00 3F 07 01 D4 01 FF 00 1D 00 05 07 00 03 07 01 05 01 01 01 00 02 07 00 3F 07 01 D4 42 07 00 33 FF 00 00 00 05 07 00 03 07 01 05 01 01 01 00 02 07 00 3F 07 01 D4 45 07 00 33 40 01 FD 00 1B 01 01 41 01 1E FF 00 06 00 00 00 01 07 00 33 FF 00 00 00 07 07 00 03 07 01 05 01 01 01 01 01 00 01 07 00 3F 45 07 00 33 40 07 00 C8 FC 00 01 07 00 C8 4C 07 00 C8 FF 00 01 00 08 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 00 02 07 00 C8 01 5B 07 00 C8 42 07 00 33 40 07 00 C8 47 07 00 33 40 01 47 07 00 93 40 07 00 C8 47 07 00 33 40 07 01 D6 FC 00 0F 07 00 45 41 01 1E 4C 07 00 45 FF 00 01 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 02 07 00 45 01 5C 07 00 45 42 07 00 25 40 07 00 45 45 07 00 33 40 01 0D 41 01 1C 04 04 41 01 17 0A 41 01 1E 44 07 00 33 40 07 00 45 45 07 00 33 40 01 0D 41 01 1E 0A FF 00 12 00 00 00 01 07 00 33 FF 00 00 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 01 07 00 45 45 07 00 33 00 02 44 07 00 33 40 07 00 45 45 07 00 33 00 44 07 00 23 40 07 00 45 45 07 00 33 40 02 05 04 41 01 17 53 07 00 93 FF 00 00 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 03 07 00 45 02 01 45 07 00 33 40 01 4A 01 FF 00 01 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 02 01 01 5E 01 04 0A 41 01 1D FF 00 0D 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 02 07 00 45 07 00 03 FF 00 01 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 03 07 00 45 07 00 03 01 FF 00 1B 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 02 07 00 45 07 00 03 FF 00 0E 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 03 07 00 45 02 01 FF 00 01 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 04 07 00 45 02 01 01 FF 00 1E 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 03 07 00 45 02 01 FF 00 02 00 00 00 01 07 00 33 FF 00 00 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 03 07 00 45 02 01 45 07 00 33 40 01 03 FF 00 12 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 02 07 00 45 07 00 03 FF 00 01 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 03 07 00 45 07 00 03 01 FF 00 1B 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 02 07 00 45 07 00 03 46 07 00 23 FF 00 00 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 03 07 00 45 02 01 45 07 00 33 40 01 04 FF 00 11 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 03 07 00 45 02 01 FF 00 01 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 04 07 00 45 02 01 01 FF 00 1F 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 03 07 00 45 02 01 FF 00 02 00 00 00 01 07 00 33 FF 00 00 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 03 07 00 45 02 01 45 07 00 33 40 01 00 0B 42 01 1C 43 07 00 33 40 07 01 05 45 07 00 33 40 01 FF 00 0E 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 02 02 07 00 45 FF 00 02 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 03 02 07 00 45 01 FF 00 1D 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 02 02 07 00 45 42 07 00 33 FF 00 00 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 02 02 07 00 45 45 07 00 33 FF 00 00 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 02 02 02 45 07 00 33 FF 00 00 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 02 02 07 00 45 45 07 00 33 FF 00 00 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 02 02 02 FF 00 07 00 00 00 01 07 00 33 FF 00 00 00 0A 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 00 01 07 00 45 45 07 00 33 40 02 FC 00 1E 02 0B 42 01 1C 43 07 00 33 40 07 01 05 45 07 00 33 40 01 4C 02 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 01 5F 02 44 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 02 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 02 4C 02 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 01 5C 02 4B 02 45 02 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 01 5A 02 44 02 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 01 4D 02 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 01 5C 02 04 0B 42 01 1F 44 07 00 33 40 07 00 45 45 07 00 33 40 02 4C 02 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 01 5E 02 45 07 00 33 40 07 01 05 45 07 00 33 40 01 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 02 FF 00 05 00 00 00 01 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 02 51 02 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 01 4D 02 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 01 5D 02 04 44 07 00 33 40 07 00 45 45 07 00 33 40 02 02 45 07 00 33 40 07 01 38 45 07 00 33 40 07 01 40 4B 07 01 40 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 01 40 01 5D 07 01 40 42 07 00 29 40 07 01 40 45 07 00 33 40 07 01 D6 FF 00 05 00 00 00 01 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 01 07 01 44 45 07 00 33 40 01 50 07 00 45 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 00 45 01 5E 07 00 45 4E 07 01 52 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 01 52 01 5D 07 01 52 FF 00 02 00 00 00 01 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 01 07 01 52 45 07 00 33 40 01 0E 42 01 1E 0B FF 00 04 00 00 00 01 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 01 07 00 45 45 07 00 33 40 01 4D 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 02 02 02 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 02 02 02 02 47 07 00 23 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 02 46 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 01 45 07 00 33 00 02 FF 00 04 00 00 00 01 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 01 07 00 45 45 07 00 33 40 01 4D 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 02 02 02 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 02 02 02 02 FF 00 0C 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 02 02 02 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 02 02 02 01 FF 00 1F 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 02 02 02 FF 00 0D 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 02 02 02 02 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 01 FF 00 1E 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 02 02 02 02 44 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 02 FF 00 0F 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 01 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 06 02 02 02 02 01 01 FF 00 1F 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 01 42 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 01 45 07 00 33 00 0C 05 42 01 1A 48 07 00 1B FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 02 02 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 02 02 02 5A 02 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 01 5C 02 46 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 02 02 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 02 02 02 51 01 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 01 01 5F 01 4E 07 00 03 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 00 03 01 5D 07 00 03 FF 00 04 00 00 00 01 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 00 03 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 00 03 07 01 D8 08 4C 07 00 03 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 00 03 01 5D 07 00 03 4E 07 00 45 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 00 45 01 5D 07 00 45 51 07 00 03 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 00 03 01 5E 07 00 03 4E 07 00 45 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 00 45 01 5D 07 00 45 45 07 00 33 40 07 01 52 45 07 00 33 40 01 FF 00 12 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 02 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 02 02 01 FF 00 1F 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 02 46 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 02 02 02 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 02 02 02 02 47 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 02 FF 00 06 00 00 00 01 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 01 45 07 00 33 00 FF 00 02 00 00 00 01 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 00 45 07 00 33 00 47 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 02 02 02 45 07 00 33 00 4B 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 01 52 01 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 01 52 07 01 97 FF 00 0C 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 07 01 52 07 01 97 07 00 03 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 07 01 52 07 01 97 07 00 03 01 FF 00 1E 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 07 01 52 07 01 97 07 00 03 FF 00 16 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 06 07 01 52 07 01 97 01 07 01 05 02 02 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 07 07 01 52 07 01 97 01 07 01 05 02 02 01 FF 00 1D 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 06 07 01 52 07 01 97 01 07 01 05 02 02 FF 00 0E 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 06 07 01 52 07 01 97 01 07 01 05 02 02 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 07 07 01 52 07 01 97 01 07 01 05 02 02 01 FF 00 1D 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 06 07 01 52 07 01 97 01 07 01 05 02 02 42 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 06 07 01 52 07 01 97 01 07 01 05 02 02 45 07 00 33 00 FF 00 02 00 00 00 01 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 00 45 07 00 33 00 FF 00 06 00 00 00 01 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 00 45 02 45 07 00 33 00 FF 00 06 00 00 00 01 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 00 45 02 45 07 00 33 00 44 07 00 33 40 07 00 45 45 07 00 33 40 02 4D 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 00 03 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 00 03 02 FF 00 0B 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 00 03 02 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 07 00 03 02 01 FF 00 1D 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 00 03 02 02 FF 00 12 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 07 00 03 02 07 00 45 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 07 00 03 02 07 00 45 01 FF 00 1E 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 07 00 03 02 07 00 45 FF 00 02 00 00 00 01 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 07 00 03 02 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 07 00 03 02 02 0F 42 01 1D 4C 07 00 03 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 00 03 01 5F 07 00 03 07 05 42 01 1A 49 07 00 1F 40 07 01 52 45 07 00 33 40 01 50 02 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 01 5D 02 48 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 02 02 02 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 02 02 02 02 FF 00 0C 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 02 02 02 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 02 02 02 01 FF 00 1E 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 02 02 02 FF 00 0D 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 02 02 02 02 FF 00 02 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 01 FF 00 1E 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 02 02 02 02 44 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 07 00 45 45 07 00 33 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 02 46 07 00 19 FF 00 00 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 01 45 07 00 33 00 F8 00 02 FF 00 0E 00 08 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 00 02 07 00 03 01 FF 00 02 00 08 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 00 03 07 00 03 01 01 FF 00 1E 00 08 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 00 02 07 00 03 01 42 07 00 2D FF 00 00 00 08 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 00 02 07 00 03 01 45 07 00 33 00 4C 07 00 03 FF 00 02 00 08 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 00 02 07 00 03 01 5C 07 00 03 FF 00 0D 00 08 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 00 02 07 00 03 01 FF 00 02 00 08 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 00 03 07 00 03 01 01 FF 00 1E 00 08 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 00 02 07 00 03 01 FF 00 07 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 01 07 00 45 FD 00 01 02 02 F9 00 01 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 01 07 01 52 41 02 41 07 00 45 F9 00 01 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 02 02 02 FF 00 01 00 08 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 00 02 07 00 03 01 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 01 02 F9 00 01 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 01 01 41 02 FF 00 01 00 07 07 00 03 07 01 05 01 01 01 01 01 00 00 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 05 02 02 02 02 01 FF 00 01 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 01 01 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 01 07 01 40 01 41 02 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 02 02 02 02 01 01 FF 00 01 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 02 07 00 45 07 00 03 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 01 07 00 45 F9 00 01 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 01 07 00 03 F9 00 01 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 06 07 01 52 07 01 97 01 07 01 05 02 02 FF 00 01 00 05 07 00 03 07 01 05 01 01 01 00 02 07 00 3F 07 01 D4 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 01 07 00 45 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 02 02 F9 00 01 FF 00 01 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 03 07 00 45 02 01 FF 00 01 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 03 07 00 45 02 01 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 01 02 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 02 07 00 03 02 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 07 00 03 02 07 00 45 41 02 41 07 00 03 FF 00 01 00 08 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 00 01 07 00 C8 FF 00 01 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 02 07 00 45 07 00 03 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 01 02 41 07 00 03 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 04 02 02 02 02 FF 00 01 00 09 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 00 02 02 07 00 45 FF 00 01 00 08 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 00 01 07 00 03 FF 00 01 00 08 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 00 02 07 00 03 01 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 06 07 01 52 07 01 97 01 07 01 05 02 02 41 07 00 03 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 02 02 02 FF 00 01 00 0B 07 00 03 07 01 05 01 01 01 01 01 07 00 C8 07 00 45 02 02 00 03 07 01 52 07 01 97 07 00 03 FF 00 01 00 05 07 00 03 07 01 05 01 01 01 00 01 07 00 3F 41 07 00 33 43 05 44 07 00 33 47 05 47 07 00 33
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     3873   3881   Any
        //  3873   3881   3873   3881   Ljava/lang/NullPointerException;
        //  3889   3891   3      8      Ljava/lang/AssertionError;
        //  76     82     82     83     Any
        //  76     82     3      8      Any
        //  76     82     3      8      Ljava/util/NoSuchElementException;
        //  76     82     3      8      Any
        //  76     82     3      8      Ljava/lang/NegativeArraySizeException;
        //  143    150    150    151    Any
        //  144    150    150    151    Ljava/lang/UnsupportedOperationException;
        //  144    150    143    144    Any
        //  143    150    143    144    Ljava/lang/ArithmeticException;
        //  143    150    3      8      Ljava/lang/IllegalArgumentException;
        //  220    226    226    227    Any
        //  220    226    226    227    Any
        //  220    226    3      8      Any
        //  220    226    226    227    Ljava/lang/RuntimeException;
        //  220    226    226    227    Any
        //  275    284    284    285    Any
        //  275    284    284    285    Any
        //  276    284    3      8      Ljava/util/NoSuchElementException;
        //  276    284    275    276    Any
        //  275    284    284    285    Any
        //  293    302    302    303    Any
        //  293    302    3      8      Any
        //  293    302    293    294    Ljava/lang/StringIndexOutOfBoundsException;
        //  294    302    302    303    Any
        //  293    302    3      8      Ljava/lang/NumberFormatException;
        //  399    406    406    407    Any
        //  400    406    399    400    Ljava/lang/NullPointerException;
        //  400    406    406    407    Ljava/lang/UnsupportedOperationException;
        //  399    406    406    407    Any
        //  400    406    406    407    Ljava/lang/NumberFormatException;
        //  537    544    544    545    Any
        //  538    544    537    538    Any
        //  538    544    3      8      Any
        //  537    544    537    538    Ljava/lang/NullPointerException;
        //  537    544    3      8      Any
        //  623    629    629    630    Any
        //  623    629    3      8      Any
        //  623    629    629    630    Any
        //  623    629    629    630    Ljava/lang/EnumConstantNotPresentException;
        //  623    629    3      8      Any
        //  638    645    645    646    Any
        //  639    645    638    639    Any
        //  638    645    3      8      Any
        //  639    645    3      8      Any
        //  639    645    645    646    Any
        //  651    658    658    659    Any
        //  652    658    658    659    Any
        //  651    658    651    652    Ljava/lang/RuntimeException;
        //  651    658    651    652    Ljava/lang/IndexOutOfBoundsException;
        //  652    658    3      8      Ljava/lang/IllegalStateException;
        //  716    723    723    724    Any
        //  717    723    716    717    Ljava/lang/StringIndexOutOfBoundsException;
        //  717    723    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  716    723    723    724    Any
        //  717    723    723    724    Ljava/lang/NumberFormatException;
        //  912    918    918    919    Any
        //  912    918    918    919    Any
        //  912    918    3      8      Any
        //  912    918    3      8      Any
        //  912    918    3      8      Any
        //  979    986    986    987    Any
        //  980    986    986    987    Ljava/util/NoSuchElementException;
        //  980    986    986    987    Ljava/lang/ClassCastException;
        //  979    986    979    980    Ljava/lang/UnsupportedOperationException;
        //  979    986    979    980    Ljava/lang/EnumConstantNotPresentException;
        //  1048   1054   1054   1055   Any
        //  1048   1054   3      8      Any
        //  1048   1054   3      8      Ljava/lang/NumberFormatException;
        //  1048   1054   3      8      Ljava/lang/ClassCastException;
        //  1048   1054   3      8      Ljava/lang/IllegalArgumentException;
        //  1104   1111   1111   1112   Any
        //  1104   1111   3      8      Any
        //  1105   1111   1111   1112   Ljava/lang/IllegalStateException;
        //  1104   1111   1111   1112   Ljava/lang/NullPointerException;
        //  1104   1111   1104   1105   Any
        //  1163   1170   1170   1171   Any
        //  1163   1170   1163   1164   Any
        //  1163   1170   1163   1164   Any
        //  1164   1170   1163   1164   Any
        //  1164   1170   1163   1164   Ljava/lang/EnumConstantNotPresentException;
        //  1177   1184   1184   1185   Any
        //  1177   1184   1177   1178   Any
        //  1177   1184   3      8      Any
        //  1178   1184   1184   1185   Ljava/lang/IllegalStateException;
        //  1178   1184   1177   1178   Ljava/lang/UnsupportedOperationException;
        //  1194   1200   1200   1201   Any
        //  1194   1200   3      8      Any
        //  1194   1200   3      8      Any
        //  1194   1200   3      8      Any
        //  1194   1200   3      8      Any
        //  1280   1287   1287   1288   Any
        //  1281   1287   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1281   1287   3      8      Ljava/lang/IllegalArgumentException;
        //  1280   1287   1280   1281   Ljava/lang/IndexOutOfBoundsException;
        //  1281   1287   1280   1281   Any
        //  1341   1348   1348   1349   Any
        //  1341   1348   3      8      Ljava/lang/IllegalArgumentException;
        //  1341   1348   1341   1342   Ljava/lang/ClassCastException;
        //  1341   1348   1341   1342   Ljava/lang/NullPointerException;
        //  1342   1348   1341   1342   Any
        //  1355   1362   1362   1363   Any
        //  1355   1362   1362   1363   Any
        //  1355   1362   1362   1363   Ljava/lang/UnsupportedOperationException;
        //  1356   1362   1355   1356   Any
        //  1355   1362   3      8      Any
        //  1565   1572   1572   1573   Any
        //  1565   1572   1565   1566   Any
        //  1566   1572   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  1565   1572   1565   1566   Any
        //  1566   1572   3      8      Any
        //  1626   1633   1633   1634   Any
        //  1626   1633   1633   1634   Ljava/lang/ClassCastException;
        //  1627   1633   1626   1627   Ljava/lang/AssertionError;
        //  1627   1633   1626   1627   Any
        //  1626   1633   3      8      Any
        //  1640   1647   1647   1648   Any
        //  1641   1647   1640   1641   Any
        //  1640   1647   3      8      Ljava/lang/NumberFormatException;
        //  1640   1647   1640   1641   Ljava/lang/UnsupportedOperationException;
        //  1641   1647   3      8      Ljava/util/ConcurrentModificationException;
        //  1655   1661   1661   1662   Any
        //  1655   1661   1661   1662   Any
        //  1655   1661   3      8      Ljava/lang/NumberFormatException;
        //  1655   1661   3      8      Any
        //  1655   1661   3      8      Any
        //  1738   1745   1745   1746   Any
        //  1739   1745   3      8      Any
        //  1738   1745   1745   1746   Any
        //  1738   1745   1738   1739   Ljava/lang/AssertionError;
        //  1739   1745   1738   1739   Ljava/lang/ArithmeticException;
        //  1755   1762   1762   1763   Any
        //  1755   1762   1755   1756   Any
        //  1756   1762   1762   1763   Ljava/util/ConcurrentModificationException;
        //  1756   1762   1762   1763   Any
        //  1756   1762   1755   1756   Any
        //  1811   1818   1818   1819   Any
        //  1812   1818   1818   1819   Ljava/lang/RuntimeException;
        //  1811   1818   3      8      Any
        //  1811   1818   3      8      Ljava/lang/ArithmeticException;
        //  1812   1818   1811   1812   Ljava/lang/UnsupportedOperationException;
        //  1826   1832   1832   1833   Any
        //  1826   1832   1832   1833   Ljava/lang/ClassCastException;
        //  1826   1832   1832   1833   Ljava/lang/UnsupportedOperationException;
        //  1826   1832   1832   1833   Ljava/lang/UnsupportedOperationException;
        //  1826   1832   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1936   1942   1942   1943   Any
        //  1936   1942   1942   1943   Ljava/lang/ArithmeticException;
        //  1936   1942   1942   1943   Any
        //  1936   1942   3      8      Ljava/lang/NumberFormatException;
        //  1936   1942   1942   1943   Any
        //  2010   2016   2016   2017   Any
        //  2010   2016   2016   2017   Ljava/lang/ArithmeticException;
        //  2010   2016   2016   2017   Any
        //  2010   2016   3      8      Any
        //  2010   2016   3      8      Any
        //  2031   2038   2038   2039   Any
        //  2032   2038   2031   2032   Any
        //  2032   2038   2038   2039   Ljava/lang/NumberFormatException;
        //  2032   2038   2031   2032   Ljava/util/NoSuchElementException;
        //  2032   2038   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2047   2054   2054   2055   Any
        //  2048   2054   2047   2048   Ljava/lang/NullPointerException;
        //  2048   2054   2054   2055   Any
        //  2048   2054   2054   2055   Any
        //  2047   2054   2047   2048   Ljava/lang/UnsupportedOperationException;
        //  2062   2069   2069   2070   Any
        //  2062   2069   2069   2070   Any
        //  2063   2069   3      8      Ljava/lang/NegativeArraySizeException;
        //  2063   2069   3      8      Any
        //  2063   2069   2062   2063   Any
        //  2079   2085   2085   2086   Any
        //  2079   2085   2085   2086   Any
        //  2079   2085   2085   2086   Any
        //  2079   2085   3      8      Ljava/lang/AssertionError;
        //  2079   2085   3      8      Ljava/lang/NullPointerException;
        //  2100   2107   2107   2108   Any
        //  2100   2107   2107   2108   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2101   2107   2100   2101   Any
        //  2100   2107   2107   2108   Any
        //  2101   2107   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2209   2216   2216   2217   Any
        //  2210   2216   2209   2210   Ljava/lang/AssertionError;
        //  2209   2216   3      8      Any
        //  2210   2216   2209   2210   Ljava/lang/IndexOutOfBoundsException;
        //  2209   2216   3      8      Any
        //  2271   2278   2278   2279   Any
        //  2272   2278   2271   2272   Any
        //  2271   2278   2278   2279   Any
        //  2271   2278   2271   2272   Ljava/lang/NullPointerException;
        //  2271   2278   2278   2279   Any
        //  2337   2344   2344   2345   Any
        //  2338   2344   3      8      Any
        //  2337   2344   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2337   2344   3      8      Any
        //  2337   2344   2337   2338   Ljava/lang/NumberFormatException;
        //  2411   2418   2418   2419   Any
        //  2412   2418   2411   2412   Any
        //  2412   2418   2418   2419   Ljava/lang/ArithmeticException;
        //  2411   2418   3      8      Ljava/util/ConcurrentModificationException;
        //  2411   2418   2418   2419   Any
        //  2526   2532   2532   2533   Any
        //  2526   2532   3      8      Any
        //  2526   2532   2532   2533   Any
        //  2526   2532   3      8      Ljava/lang/NumberFormatException;
        //  2526   2532   2532   2533   Ljava/lang/StringIndexOutOfBoundsException;
        //  2742   2749   2749   2750   Any
        //  2743   2749   2742   2743   Any
        //  2742   2749   3      8      Any
        //  2743   2749   2749   2750   Any
        //  2742   2749   2742   2743   Ljava/lang/NumberFormatException;
        //  2811   2818   2818   2819   Any
        //  2812   2818   2811   2812   Ljava/util/ConcurrentModificationException;
        //  2812   2818   2811   2812   Any
        //  2812   2818   3      8      Any
        //  2811   2818   2811   2812   Any
        //  2827   2834   2834   2835   Any
        //  2827   2834   2834   2835   Ljava/lang/ClassCastException;
        //  2827   2834   3      8      Ljava/lang/IllegalArgumentException;
        //  2828   2834   2827   2828   Ljava/lang/IndexOutOfBoundsException;
        //  2827   2834   2827   2828   Any
        //  2843   2849   2849   2850   Any
        //  2843   2849   3      8      Any
        //  2843   2849   3      8      Any
        //  2843   2849   2849   2850   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2843   2849   3      8      Ljava/lang/RuntimeException;
        //  2854   2860   2860   2861   Any
        //  2854   2860   2860   2861   Ljava/lang/RuntimeException;
        //  2854   2860   3      8      Any
        //  2854   2860   3      8      Any
        //  2854   2860   2860   2861   Ljava/lang/UnsupportedOperationException;
        //  2869   2876   2876   2877   Any
        //  2870   2876   2869   2870   Ljava/lang/IndexOutOfBoundsException;
        //  2870   2876   3      8      Ljava/lang/AssertionError;
        //  2869   2876   2876   2877   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2869   2876   2869   2870   Any
        //  2889   2896   2896   2897   Any
        //  2890   2896   2889   2890   Ljava/util/ConcurrentModificationException;
        //  2889   2896   2896   2897   Ljava/lang/NullPointerException;
        //  2889   2896   3      8      Ljava/util/ConcurrentModificationException;
        //  2890   2896   2889   2890   Any
        //  3051   3058   3058   3059   Any
        //  3052   3058   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3052   3058   3051   3052   Ljava/lang/UnsupportedOperationException;
        //  3051   3058   3051   3052   Any
        //  3051   3058   3058   3059   Ljava/lang/RuntimeException;
        //  3063   3069   3069   3070   Any
        //  3063   3069   3069   3070   Any
        //  3063   3069   3      8      Any
        //  3063   3069   3      8      Any
        //  3063   3069   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  3078   3084   3084   3085   Any
        //  3078   3084   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  3078   3084   3084   3085   Any
        //  3078   3084   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3078   3084   3      8      Any
        //  3093   3099   3099   3100   Any
        //  3093   3099   3      8      Ljava/lang/NullPointerException;
        //  3093   3099   3099   3100   Ljava/lang/IndexOutOfBoundsException;
        //  3093   3099   3099   3100   Any
        //  3093   3099   3      8      Ljava/lang/NegativeArraySizeException;
        //  3105   3112   3112   3113   Any
        //  3105   3112   3112   3113   Any
        //  3105   3112   3      8      Ljava/lang/IllegalArgumentException;
        //  3105   3112   3105   3106   Ljava/lang/ArithmeticException;
        //  3106   3112   3105   3106   Any
        //  3127   3134   3134   3135   Any
        //  3128   3134   3134   3135   Any
        //  3127   3134   3127   3128   Ljava/lang/NegativeArraySizeException;
        //  3127   3134   3134   3135   Any
        //  3127   3134   3127   3128   Any
        //  3240   3246   3246   3247   Any
        //  3240   3246   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  3240   3246   3      8      Ljava/lang/NullPointerException;
        //  3240   3246   3      8      Ljava/lang/UnsupportedOperationException;
        //  3240   3246   3246   3247   Any
        //  3398   3405   3405   3406   Any
        //  3399   3405   3      8      Ljava/lang/NumberFormatException;
        //  3399   3405   3398   3399   Ljava/lang/IndexOutOfBoundsException;
        //  3398   3405   3      8      Any
        //  3398   3405   3      8      Any
        //  3465   3472   3472   3473   Any
        //  3465   3472   3465   3466   Any
        //  3465   3472   3472   3473   Ljava/util/ConcurrentModificationException;
        //  3466   3472   3      8      Any
        //  3465   3472   3      8      Any
        //  3573   3580   3580   3581   Any
        //  3573   3580   3573   3574   Any
        //  3573   3580   3      8      Ljava/lang/AssertionError;
        //  3574   3580   3580   3581   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3574   3580   3580   3581   Any
        //  3588   3595   3595   3596   Any
        //  3589   3595   3595   3596   Ljava/lang/NullPointerException;
        //  3588   3595   3595   3596   Ljava/lang/EnumConstantNotPresentException;
        //  3588   3595   3588   3589   Ljava/lang/AssertionError;
        //  3589   3595   3595   3596   Ljava/lang/UnsupportedOperationException;
        //  3651   3658   3658   3659   Any
        //  3652   3658   3651   3652   Ljava/util/ConcurrentModificationException;
        //  3652   3658   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  3652   3658   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  3652   3658   3658   3659   Ljava/lang/StringIndexOutOfBoundsException;
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
    
    public f45(final int c) {
        while (true) {
            int n = 0;
            Label_0016: {
                if (fc.c < 0) {
                    n = -676333952;
                    break Label_0016;
                }
                n = -28416157;
            }
            switch (n ^ 0x4F7E8BF4) {
                case -1339566219: {
                    continue;
                }
                default: {
                    this.c = new ArrayList<f43>();
                    final f44 c2 = null;
                    while (true) {
                        int n2 = 0;
                        Label_0079: {
                            if (fc.0 != 0) {
                                n2 = 1981607083;
                                break Label_0079;
                            }
                            n2 = -906635872;
                        }
                        switch (n2 ^ 0xEC560224) {
                            case -1706365297: {
                                continue;
                            }
                            case 631494532: {
                                this.c = c2;
                                this.c = null;
                                final boolean 0 = false;
                                while (true) {
                                    int n3 = 0;
                                    Label_0133: {
                                        if (fc.c < 0) {
                                            n3 = -119514830;
                                            break Label_0133;
                                        }
                                        n3 = -1950040048;
                                    }
                                    switch (n3 ^ 0x1F260802) {
                                        case -406433488: {
                                            continue;
                                        }
                                        case -1797076974: {
                                            this.0 = 0;
                                            this.c = c;
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
                case -1731101324: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public boolean 0(final f43 f43) {
        return fbS.9t(this, 335218887, f43);
    }
    
    public static boolean 2(final f43 f43) {
        return fbS.9t(null, 335218884, f43);
    }
    
    static {
        throw t;
    }
    
    public boolean 2() {
        return fbS.eb(this, 2116851157);
    }
    
    public void 5() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: nop            
        //     4: nop            
        //     5: nop            
        //     6: athrow         
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            62
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            54
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/f45.c:Ljava/util/ArrayList;
        //    28: invokedynamic   BootstrapMethod #1, compare:()Ljava/util/Comparator;
        //    33: goto            37
        //    36: athrow         
        //    37: invokevirtual   java/util/ArrayList.sort:(Ljava/util/Comparator;)V
        //    40: goto            44
        //    43: athrow         
        //    44: return         
        //    45: pop            
        //    46: goto            24
        //    49: pop            
        //    50: aconst_null    
        //    51: goto            45
        //    54: dup            
        //    55: ifnull          45
        //    58: checkcast       Ljava/lang/Throwable;
        //    61: athrow         
        //    62: dup            
        //    63: ifnull          49
        //    66: checkcast       Ljava/lang/Throwable;
        //    69: athrow         
        //    70: nop            
        //    71: athrow         
        //    StackMapTable: 00 0E FF 00 03 00 00 00 01 07 00 33 43 07 00 33 FC 00 00 07 00 03 FF 00 0B 00 00 00 01 07 00 33 FC 00 03 07 00 03 4B 07 00 97 FF 00 00 00 01 07 00 03 00 02 07 00 3F 07 02 04 45 07 00 33 00 40 07 00 33 43 05 44 07 00 33 47 05 FF 00 07 00 00 00 01 07 00 33
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  8      20     54     62     Any
        //  54     62     54     62     Any
        //  36     43     43     44     Any
        //  36     43     36     37     Ljava/lang/ClassCastException;
        //  36     43     43     44     Ljava/lang/NegativeArraySizeException;
        //  36     43     43     44     Any
        //  36     43     43     44     Any
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
    
    public static int c(final f43 p0, final f43 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          158
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            150
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            142
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   dev/nuker/pyro/f43.4:()F
        //    32: goto            36
        //    35: athrow         
        //    36: aload_0        
        //    37: goto            41
        //    40: athrow         
        //    41: invokevirtual   dev/nuker/pyro/f43.4:()F
        //    44: goto            48
        //    47: athrow         
        //    48: fsub           
        //    49: fstore_2       
        //    50: aload_1        
        //    51: goto            55
        //    54: athrow         
        //    55: invokevirtual   dev/nuker/pyro/f43.4:()F
        //    58: goto            62
        //    61: athrow         
        //    62: aload_0        
        //    63: getstatic       dev/nuker/pyro/fc.1:I
        //    66: ifeq            75
        //    69: ldc_w           -1860101602
        //    72: goto            78
        //    75: ldc_w           1556352253
        //    78: ldc_w           1087192539
        //    81: ixor           
        //    82: lookupswitch {
        //          -773052475: 131
        //          1125456604: 75
        //          default: 108
        //        }
        //   108: goto            112
        //   111: athrow         
        //   112: invokevirtual   dev/nuker/pyro/f43.4:()F
        //   115: goto            119
        //   118: athrow         
        //   119: goto            123
        //   122: athrow         
        //   123: invokestatic    java/lang/Float.compare:(FF)I
        //   126: goto            130
        //   129: athrow         
        //   130: ireturn        
        //   131: aconst_null    
        //   132: athrow         
        //   133: pop            
        //   134: goto            24
        //   137: pop            
        //   138: aconst_null    
        //   139: goto            133
        //   142: dup            
        //   143: ifnull          133
        //   146: checkcast       Ljava/lang/Throwable;
        //   149: athrow         
        //   150: dup            
        //   151: ifnull          137
        //   154: checkcast       Ljava/lang/Throwable;
        //   157: athrow         
        //   158: aconst_null    
        //   159: athrow         
        //    StackMapTable: 00 21 43 07 00 33 04 FF 00 0B 00 00 00 01 07 00 33 FD 00 03 07 00 45 07 00 45 43 07 00 95 40 07 00 45 45 07 00 33 40 02 43 07 00 33 FF 00 00 00 02 07 00 45 07 00 45 00 02 02 07 00 45 45 07 00 33 FF 00 00 00 02 07 00 45 07 00 45 00 02 02 02 FF 00 05 00 03 07 00 45 07 00 45 02 00 01 07 00 23 40 07 00 45 45 07 00 33 40 02 FF 00 0C 00 03 07 00 45 07 00 45 02 00 02 02 07 00 45 FF 00 02 00 03 07 00 45 07 00 45 02 00 03 02 07 00 45 01 FF 00 1D 00 03 07 00 45 07 00 45 02 00 02 02 07 00 45 42 07 00 33 FF 00 00 00 03 07 00 45 07 00 45 02 00 02 02 07 00 45 45 07 00 33 FF 00 00 00 03 07 00 45 07 00 45 02 00 02 02 02 FF 00 02 00 00 00 01 07 00 33 FF 00 00 00 03 07 00 45 07 00 45 02 00 02 02 02 45 07 00 33 40 01 FF 00 00 00 03 07 00 45 07 00 45 02 00 02 02 07 00 45 FF 00 01 00 02 07 00 45 07 00 45 00 01 07 00 33 43 05 44 07 00 33 47 05 47 07 00 33
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     142    150    Any
        //  142    150    142    150    Any
        //  158    160    3      8      Any
        //  28     35     35     36     Any
        //  29     35     28     29     Ljava/lang/EnumConstantNotPresentException;
        //  29     35     3      8      Any
        //  28     35     3      8      Any
        //  28     35     35     36     Ljava/lang/IllegalArgumentException;
        //  40     47     47     48     Any
        //  40     47     40     41     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  41     47     40     41     Any
        //  40     47     40     41     Any
        //  41     47     47     48     Any
        //  54     61     61     62     Any
        //  54     61     54     55     Ljava/lang/IllegalArgumentException;
        //  54     61     61     62     Ljava/lang/StringIndexOutOfBoundsException;
        //  55     61     54     55     Ljava/util/NoSuchElementException;
        //  55     61     61     62     Ljava/lang/IllegalStateException;
        //  111    118    118    119    Any
        //  112    118    118    119    Ljava/lang/NullPointerException;
        //  112    118    111    112    Any
        //  112    118    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  112    118    118    119    Any
        //  123    129    129    130    Any
        //  123    129    3      8      Any
        //  123    129    129    130    Ljava/lang/NumberFormatException;
        //  123    129    129    130    Any
        //  123    129    3      8      Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:618)
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
    
    public float 0() {
        return fbS.ag(this, 1177048205);
    }
    
    public void c(final f43 f43) {
        fbS.99(this, 1112291791, f43);
    }
    
    public f43 1(final f43 f43) {
        return fbS.gZ(this, 1980957839, f43);
    }
    
    public void 4() {
        fbS.dT(this, 781000808);
    }
    
    public void 1() {
        fbS.dE(this, 1062166483);
    }
    
    public void c(final boolean b) {
        fbS.4u(this, 917442725, b);
    }
}
