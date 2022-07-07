// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;

public class f58 extends fH
{
    public f0d c;
    public boolean c;
    public fbu c;
    public boolean 0;
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          113
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            105
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            97
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: aload_2        
        //    27: getstatic       dev/nuker/pyro/fc.c:I
        //    30: ifge            38
        //    33: ldc             1180753931
        //    35: goto            40
        //    38: ldc             -2000812812
        //    40: ldc             -241312801
        //    42: ixor           
        //    43: lookupswitch {
        //          -1208140844: 86
        //          -461419535: 38
        //          default: 68
        //        }
        //    68: aload_3        
        //    69: goto            73
        //    72: athrow         
        //    73: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //    76: goto            80
        //    79: athrow         
        //    80: aload_0        
        //    81: iconst_0       
        //    82: putfield        dev/nuker/pyro/f58.c:Z
        //    85: return         
        //    86: aconst_null    
        //    87: athrow         
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
        //    RuntimeInvisibleTypeAnnotations: 00 02 16 01 00 00 0C 00 00 16 02 00 00 0C 00 00
        //    StackMapTable: 00 11 43 07 00 1A 04 FF 00 0B 00 00 00 01 07 00 1A FF 00 03 00 04 07 00 03 01 07 00 25 07 00 27 00 00 FF 00 0D 00 04 07 00 03 01 07 00 25 07 00 27 00 03 07 00 03 01 07 00 25 FF 00 01 00 04 07 00 03 01 07 00 25 07 00 27 00 04 07 00 03 01 07 00 25 01 FF 00 1B 00 04 07 00 03 01 07 00 25 07 00 27 00 03 07 00 03 01 07 00 25 43 07 00 1A FF 00 00 00 04 07 00 03 01 07 00 25 07 00 27 00 04 07 00 03 01 07 00 25 07 00 27 45 07 00 1A 00 FF 00 05 00 04 07 00 03 01 07 00 25 07 00 27 00 03 07 00 03 01 07 00 25 41 07 00 1A 43 05 44 07 00 1A 47 05 47 07 00 1A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  8      20     97     105    Ljava/lang/NegativeArraySizeException;
        //  97     105    97     105    Any
        //  113    115    3      8      Any
        //  72     79     79     80     Any
        //  73     79     72     73     Ljava/lang/RuntimeException;
        //  72     79     72     73     Any
        //  72     79     79     80     Ljava/lang/RuntimeException;
        //  73     79     3      8      Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 46 out of bounds for length 46
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
    
    public int c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          589
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            581
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            573
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: iconst_0       
        //    25: istore_1       
        //    26: iconst_1       
        //    27: getstatic       dev/nuker/pyro/fc.c:I
        //    30: ifge            38
        //    33: ldc             1277068240
        //    35: goto            40
        //    38: ldc             1070150727
        //    40: ldc             793810764
        //    42: ixor           
        //    43: lookupswitch {
        //          131247337: 38
        //          1666061468: 556
        //          default: 68
        //        }
        //    68: istore_2       
        //    69: iload_2        
        //    70: bipush          45
        //    72: if_icmpge       462
        //    75: aload_0        
        //    76: getstatic       dev/nuker/pyro/fc.0:I
        //    79: ifeq            87
        //    82: ldc             -424634790
        //    84: goto            89
        //    87: ldc             -1823501609
        //    89: ldc             502206783
        //    91: ixor           
        //    92: lookupswitch {
        //          -1902083096: 120
        //          -77625499: 87
        //          default: 554
        //        }
        //   120: getfield        dev/nuker/pyro/f58.c:Lnet/minecraft/client/Minecraft;
        //   123: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   126: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //   129: getstatic       dev/nuker/pyro/fc.c:I
        //   132: ifge            140
        //   135: ldc             1906643105
        //   137: goto            142
        //   140: ldc             -1006244909
        //   142: ldc             1551439566
        //   144: ixor           
        //   145: lookupswitch {
        //          -1736639203: 172
        //          769394287: 140
        //          default: 550
        //        }
        //   172: iload_2        
        //   173: goto            177
        //   176: athrow         
        //   177: invokevirtual   net/minecraft/inventory/Container.func_75139_a:(I)Lnet/minecraft/inventory/Slot;
        //   180: goto            184
        //   183: athrow         
        //   184: getstatic       dev/nuker/pyro/fc.1:I
        //   187: ifeq            195
        //   190: ldc             432127940
        //   192: goto            197
        //   195: ldc             1616309926
        //   197: ldc             1093629150
        //   199: ixor           
        //   200: lookupswitch {
        //          -1025655748: 195
        //          1492044570: 558
        //          default: 228
        //        }
        //   228: goto            232
        //   231: athrow         
        //   232: invokevirtual   net/minecraft/inventory/Slot.func_75216_d:()Z
        //   235: goto            239
        //   238: athrow         
        //   239: ifeq            456
        //   242: aload_0        
        //   243: getfield        dev/nuker/pyro/f58.c:Lnet/minecraft/client/Minecraft;
        //   246: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   249: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //   252: getstatic       dev/nuker/pyro/fc.1:I
        //   255: ifeq            263
        //   258: ldc             301655139
        //   260: goto            265
        //   263: ldc             827114451
        //   265: ldc             352583482
        //   267: ixor           
        //   268: lookupswitch {
        //          83434329: 548
        //          1351661637: 263
        //          default: 296
        //        }
        //   296: iload_2        
        //   297: getstatic       dev/nuker/pyro/fc.c:I
        //   300: ifge            308
        //   303: ldc             262655640
        //   305: goto            310
        //   308: ldc             -1311143151
        //   310: ldc             -1544717374
        //   312: ixor           
        //   313: lookupswitch {
        //          -1404390054: 560
        //          -788936606: 308
        //          default: 340
        //        }
        //   340: goto            344
        //   343: athrow         
        //   344: invokevirtual   net/minecraft/inventory/Container.func_75139_a:(I)Lnet/minecraft/inventory/Slot;
        //   347: goto            351
        //   350: athrow         
        //   351: goto            355
        //   354: athrow         
        //   355: invokevirtual   net/minecraft/inventory/Slot.func_75211_c:()Lnet/minecraft/item/ItemStack;
        //   358: goto            362
        //   361: athrow         
        //   362: astore_3       
        //   363: aload_3        
        //   364: goto            368
        //   367: athrow         
        //   368: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //   371: goto            375
        //   374: athrow         
        //   375: ifeq            381
        //   378: goto            456
        //   381: aload_3        
        //   382: goto            386
        //   385: athrow         
        //   386: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   389: goto            393
        //   392: athrow         
        //   393: getstatic       dev/nuker/pyro/fc.0:I
        //   396: ifeq            404
        //   399: ldc             1036177641
        //   401: goto            406
        //   404: ldc             -887350694
        //   406: ldc             1084310388
        //   408: ixor           
        //   409: lookupswitch {
        //          1883323889: 404
        //          2103677853: 562
        //          default: 436
        //        }
        //   436: getstatic       net/minecraft/init/Items.field_190929_cY:Lnet/minecraft/item/Item;
        //   439: goto            443
        //   442: athrow         
        //   443: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   446: goto            450
        //   449: athrow         
        //   450: ifeq            456
        //   453: iinc            1, 1
        //   456: iinc            2, 1
        //   459: goto            69
        //   462: aload_0        
        //   463: getfield        dev/nuker/pyro/f58.c:Lnet/minecraft/client/Minecraft;
        //   466: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   469: getstatic       dev/nuker/pyro/fc.1:I
        //   472: ifeq            480
        //   475: ldc             1304682830
        //   477: goto            482
        //   480: ldc             -1563916535
        //   482: ldc             1043985975
        //   484: ixor           
        //   485: lookupswitch {
        //          -1661898434: 512
        //          1945769849: 480
        //          default: 552
        //        }
        //   512: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //   515: goto            519
        //   518: athrow         
        //   519: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184586_b:(Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
        //   522: goto            526
        //   525: athrow         
        //   526: goto            530
        //   529: athrow         
        //   530: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   533: goto            537
        //   536: athrow         
        //   537: getstatic       net/minecraft/init/Items.field_190929_cY:Lnet/minecraft/item/Item;
        //   540: if_acmpne       546
        //   543: iinc            1, 1
        //   546: iload_1        
        //   547: ireturn        
        //   548: aconst_null    
        //   549: athrow         
        //   550: aconst_null    
        //   551: athrow         
        //   552: aconst_null    
        //   553: athrow         
        //   554: aconst_null    
        //   555: athrow         
        //   556: aconst_null    
        //   557: athrow         
        //   558: aconst_null    
        //   559: athrow         
        //   560: aconst_null    
        //   561: athrow         
        //   562: aconst_null    
        //   563: athrow         
        //   564: pop            
        //   565: goto            24
        //   568: pop            
        //   569: aconst_null    
        //   570: goto            564
        //   573: dup            
        //   574: ifnull          564
        //   577: checkcast       Ljava/lang/Throwable;
        //   580: athrow         
        //   581: dup            
        //   582: ifnull          568
        //   585: checkcast       Ljava/lang/Throwable;
        //   588: athrow         
        //   589: aconst_null    
        //   590: athrow         
        //    StackMapTable: 00 52 FF 00 03 00 03 07 00 03 01 01 00 01 07 00 1A F9 00 04 FF 00 0B 00 00 00 01 07 00 1A FC 00 03 07 00 03 FF 00 0D 00 02 07 00 03 01 00 01 01 FF 00 01 00 02 07 00 03 01 00 02 01 01 5B 01 FC 00 00 01 51 07 00 03 FF 00 01 00 03 07 00 03 01 01 00 02 07 00 03 01 5E 07 00 03 53 07 00 56 FF 00 01 00 03 07 00 03 01 01 00 02 07 00 56 01 5D 07 00 56 43 07 00 1A FF 00 00 00 03 07 00 03 01 01 00 02 07 00 56 01 45 07 00 1A 40 07 00 5F 4A 07 00 5F FF 00 01 00 03 07 00 03 01 01 00 02 07 00 5F 01 5E 07 00 5F 42 07 00 1A 40 07 00 5F 45 07 00 1A 40 01 57 07 00 56 FF 00 01 00 03 07 00 03 01 01 00 02 07 00 56 01 5E 07 00 56 FF 00 0B 00 03 07 00 03 01 01 00 02 07 00 56 01 FF 00 01 00 03 07 00 03 01 01 00 03 07 00 56 01 01 FF 00 1D 00 03 07 00 03 01 01 00 02 07 00 56 01 42 07 00 32 FF 00 00 00 03 07 00 03 01 01 00 02 07 00 56 01 45 07 00 1A 40 07 00 5F 42 07 00 1A 40 07 00 5F 45 07 00 1A 40 07 00 6F FF 00 04 00 04 07 00 03 01 01 07 00 6F 00 01 07 00 10 40 07 00 6F 45 07 00 1A 40 01 05 43 07 00 1A 40 07 00 6F 45 07 00 1A 40 07 00 94 4A 07 00 94 FF 00 01 00 04 07 00 03 01 01 07 00 6F 00 02 07 00 94 01 5D 07 00 94 45 07 00 12 FF 00 00 00 04 07 00 03 01 01 07 00 6F 00 02 07 00 94 07 00 94 45 07 00 1A 40 01 FA 00 05 05 51 07 00 25 FF 00 01 00 03 07 00 03 01 01 00 02 07 00 25 01 5D 07 00 25 45 07 00 1A FF 00 00 00 03 07 00 03 01 01 00 02 07 00 25 07 00 8A 45 07 00 1A 40 07 00 6F FF 00 02 00 00 00 01 07 00 1A FF 00 00 00 03 07 00 03 01 01 00 01 07 00 6F 45 07 00 1A 40 07 00 94 08 41 07 00 56 41 07 00 56 41 07 00 25 41 07 00 03 FF 00 01 00 02 07 00 03 01 00 01 01 FF 00 01 00 03 07 00 03 01 01 00 01 07 00 5F FF 00 01 00 03 07 00 03 01 01 00 02 07 00 56 01 FF 00 01 00 04 07 00 03 01 01 07 00 6F 00 01 07 00 94 FF 00 01 00 01 07 00 03 00 01 07 00 1A 43 05 44 07 00 1A 47 05 FF 00 07 00 03 07 00 03 01 01 00 01 07 00 1A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     573    581    Ljava/lang/EnumConstantNotPresentException;
        //  573    581    573    581    Any
        //  589    591    3      8      Any
        //  176    183    183    184    Any
        //  177    183    176    177    Any
        //  177    183    176    177    Any
        //  177    183    3      8      Ljava/lang/RuntimeException;
        //  176    183    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  231    238    238    239    Any
        //  232    238    231    232    Ljava/lang/IllegalStateException;
        //  231    238    231    232    Any
        //  232    238    3      8      Any
        //  231    238    3      8      Ljava/lang/UnsupportedOperationException;
        //  343    350    350    351    Any
        //  343    350    343    344    Ljava/lang/AssertionError;
        //  344    350    3      8      Any
        //  344    350    3      8      Ljava/lang/NumberFormatException;
        //  344    350    350    351    Any
        //  354    361    361    362    Any
        //  354    361    361    362    Ljava/lang/AssertionError;
        //  354    361    3      8      Ljava/lang/AssertionError;
        //  354    361    354    355    Any
        //  355    361    354    355    Ljava/util/ConcurrentModificationException;
        //  367    374    374    375    Any
        //  367    374    367    368    Ljava/lang/IllegalStateException;
        //  368    374    374    375    Ljava/lang/AssertionError;
        //  367    374    367    368    Ljava/lang/UnsupportedOperationException;
        //  368    374    3      8      Ljava/lang/UnsupportedOperationException;
        //  385    392    392    393    Any
        //  386    392    385    386    Any
        //  386    392    385    386    Ljava/lang/IndexOutOfBoundsException;
        //  385    392    392    393    Any
        //  385    392    385    386    Any
        //  442    449    449    450    Any
        //  443    449    3      8      Ljava/lang/NegativeArraySizeException;
        //  443    449    449    450    Any
        //  443    449    442    443    Ljava/lang/NumberFormatException;
        //  442    449    449    450    Ljava/util/NoSuchElementException;
        //  518    525    525    526    Any
        //  518    525    525    526    Any
        //  519    525    3      8      Any
        //  518    525    525    526    Any
        //  519    525    518    519    Any
        //  530    536    536    537    Any
        //  530    536    536    537    Any
        //  530    536    536    537    Any
        //  530    536    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  530    536    536    537    Ljava/lang/ArithmeticException;
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
    @LauncherEventHide
    public void c(final f3h f3h) {
        fbS.hE(this, 1072038452, f3h);
    }
    
    static {
        throw t;
    }
    
    public f58() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifge            11
        //     6: ldc             -758892145
        //     8: goto            13
        //    11: ldc             1788579144
        //    13: ldc             -1725022735
        //    15: ixor           
        //    16: lookupswitch {
        //          1273627774: 244
        //          1476230136: 11
        //          default: 44
        //        }
        //    44: aload_0        
        //    45: ldc             "\u2380\u1486\u8a8c\ub3d6\uc9da\ued88\ub230\ue6b0\ud965"
        //    47: invokestatic    invokestatic   !!! ERROR
        //    50: ldc             "\u23a0\u1486\u8a8c\ub3d6\uc9fa\ued88\ub230\ue6b0\ud965"
        //    52: invokestatic    invokestatic   !!! ERROR
        //    55: ldc             "\u23a0\u1486\u8a8c\ub3d6\uc9c3\ued86\ub230\ue6bc\ud96b\ue9bc\ua74b\u1e40\ue188\uc5e7\u8129\u890b\u57a5\u7760\ubd2e\uc041\u2b6a\uc234\u6a6d\u2d44\ud79f\u35eb\u7d2d\u89dd\u8019\u8c9b\u84cf\ufb36\u70e7\u9a02\u1b87\uf146\u497d\u8854\uca92\uff25\ub6ad\u41f6\ub98c\ub308\u4c71\u8a92\u7c29\uce5f\u7d40\ueaca\ue6f9\u16d1\uee30\u37ce\u46a4\ue188\u0a05\u86b6\u19d0\u0f41\u7768\u7281\uc786\ubbfa\u9ade\u6a7b\ue2f2\ud001\ua53d\u25d2\u89d2\u4fb2\u8b01\u1406\ua3cd"
        //    57: invokestatic    invokestatic   !!! ERROR
        //    60: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    63: aload_0        
        //    64: new             Ldev/nuker/pyro/f0d;
        //    67: dup            
        //    68: ldc             "\u2385\u1496\u8a94\ub3d8\uc9d7"
        //    70: getstatic       dev/nuker/pyro/fc.1:I
        //    73: ifeq            81
        //    76: ldc             582636460
        //    78: goto            83
        //    81: ldc             768471545
        //    83: ldc             -647361114
        //    85: ixor           
        //    86: lookupswitch {
        //          -190317473: 112
        //          -70230518: 81
        //          default: 248
        //        }
        //   112: invokestatic    invokestatic   !!! ERROR
        //   115: ldc             "\u23a5\u1496\u8a94\ub3d8\uc9d7"
        //   117: invokestatic    invokestatic   !!! ERROR
        //   120: aconst_null    
        //   121: dconst_0       
        //   122: dconst_0       
        //   123: ldc2_w          2.0
        //   126: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   129: putfield        dev/nuker/pyro/f58.c:Ldev/nuker/pyro/f0d;
        //   132: aload_0        
        //   133: new             Ldev/nuker/pyro/fbu;
        //   136: dup            
        //   137: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   140: putfield        dev/nuker/pyro/f58.c:Ldev/nuker/pyro/fbu;
        //   143: aload_0        
        //   144: iconst_0       
        //   145: putfield        dev/nuker/pyro/f58.0:Z
        //   148: getstatic       dev/nuker/pyro/fc.c:I
        //   151: ifge            159
        //   154: ldc             -1897747658
        //   156: goto            161
        //   159: ldc             -76622111
        //   161: ldc             674040933
        //   163: ixor           
        //   164: lookupswitch {
        //          -1496340653: 246
        //          -1394936837: 159
        //          default: 192
        //        }
        //   192: aload_0        
        //   193: aload_0        
        //   194: getstatic       dev/nuker/pyro/fc.c:I
        //   197: ifge            205
        //   200: ldc             -340131293
        //   202: goto            207
        //   205: ldc             -2000770776
        //   207: ldc             -1742887074
        //   209: ixor           
        //   210: lookupswitch {
        //          -133690388: 205
        //          1940366717: 250
        //          default: 236
        //        }
        //   236: getfield        dev/nuker/pyro/f58.c:Ldev/nuker/pyro/f0d;
        //   239: invokevirtual   dev/nuker/pyro/f58.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   242: pop            
        //   243: return         
        //   244: aconst_null    
        //   245: athrow         
        //   246: aconst_null    
        //   247: athrow         
        //   248: aconst_null    
        //   249: athrow         
        //   250: aconst_null    
        //   251: athrow         
        //    StackMapTable: 00 10 0B 41 01 1E FF 00 24 00 01 07 00 03 00 04 07 00 03 08 00 40 08 00 40 07 00 D6 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 40 08 00 40 07 00 D6 01 FF 00 1C 00 01 07 00 03 00 04 07 00 03 08 00 40 08 00 40 07 00 D6 2E 41 01 1E FF 00 0C 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 07 00 01 06 00 00 FF 00 01 00 01 07 00 03 00 00 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 00 40 08 00 40 07 00 D6 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03
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
