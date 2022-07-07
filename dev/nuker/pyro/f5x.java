// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;
import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.item.ItemStack;

public class f5x extends fH
{
    public f0f<f5w> c;
    public f0d c;
    public f0d 0;
    public f0a c;
    public f0a 0;
    public f0d 1;
    public f0a 1;
    public f0a 2;
    public f0a 3;
    public f0h c;
    public boolean c;
    public fbu c;
    public boolean 0;
    public fbu 0;
    
    public boolean c(final ItemStack p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          823
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            815
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            807
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             946520689
        //    32: goto            37
        //    35: ldc             874536729
        //    37: ldc             1248626785
        //    39: ixor           
        //    40: lookupswitch {
        //          1913014800: 35
        //          2118965112: 68
        //          default: 794
        //        }
        //    68: aload_0        
        //    69: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0a;
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //    79: goto            83
        //    82: athrow         
        //    83: checkcast       Ljava/lang/Boolean;
        //    86: goto            90
        //    89: athrow         
        //    90: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    93: goto            97
        //    96: athrow         
        //    97: ifeq            105
        //   100: ldc             -324196212
        //   102: goto            107
        //   105: ldc             -324196211
        //   107: ldc             -1678530456
        //   109: ixor           
        //   110: tableswitch {
        //          -289603128: 132
        //          -289603127: 627
        //          default: 100
        //        }
        //   132: aload_0        
        //   133: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //   136: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   139: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //   142: getstatic       dev/nuker/pyro/fc.0:I
        //   145: ifeq            153
        //   148: ldc             -1052447350
        //   150: goto            155
        //   153: ldc             1023141485
        //   155: ldc             -1083201959
        //   157: ixor           
        //   158: lookupswitch {
        //          1698123880: 153
        //          2116766675: 784
        //          default: 184
        //        }
        //   184: goto            188
        //   187: athrow         
        //   188: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184586_b:(Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
        //   191: goto            195
        //   194: athrow         
        //   195: goto            199
        //   198: athrow         
        //   199: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   202: goto            206
        //   205: athrow         
        //   206: getstatic       net/minecraft/init/Items.field_151048_u:Lnet/minecraft/item/Item;
        //   209: goto            213
        //   212: athrow         
        //   213: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   216: goto            220
        //   219: athrow         
        //   220: ifeq            228
        //   223: ldc             -535026975
        //   225: goto            230
        //   228: ldc             -535026962
        //   230: ldc             -1755074602
        //   232: ixor           
        //   233: tableswitch {
        //          -285271442: 256
        //          -285271441: 627
        //          default: 223
        //        }
        //   256: aload_0        
        //   257: getstatic       dev/nuker/pyro/fc.1:I
        //   260: ifeq            268
        //   263: ldc             1563020984
        //   265: goto            270
        //   268: ldc             -282116039
        //   270: ldc             206699480
        //   272: ixor           
        //   273: lookupswitch {
        //          -244254866: 268
        //          1366832480: 786
        //          default: 300
        //        }
        //   300: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //   303: getstatic       dev/nuker/pyro/fc.1:I
        //   306: ifeq            314
        //   309: ldc             478629001
        //   311: goto            316
        //   314: ldc             -1996333205
        //   316: ldc             1446593376
        //   318: ixor           
        //   319: lookupswitch {
        //          -1027113439: 314
        //          1253969897: 790
        //          default: 344
        //        }
        //   344: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   347: getstatic       dev/nuker/pyro/fc.1:I
        //   350: ifeq            358
        //   353: ldc             1467214274
        //   355: goto            360
        //   358: ldc             -472593064
        //   360: ldc             233289688
        //   362: ixor           
        //   363: lookupswitch {
        //          -1750048286: 358
        //          1519672858: 782
        //          default: 388
        //        }
        //   388: getstatic       net/minecraft/init/MobEffects.field_76420_g:Lnet/minecraft/potion/Potion;
        //   391: goto            395
        //   394: athrow         
        //   395: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70644_a:(Lnet/minecraft/potion/Potion;)Z
        //   398: goto            402
        //   401: athrow         
        //   402: ifne            627
        //   405: getstatic       dev/nuker/pyro/fc.0:I
        //   408: ifeq            416
        //   411: ldc             -742573253
        //   413: goto            418
        //   416: ldc             -290376628
        //   418: ldc             -265174773
        //   420: ixor           
        //   421: lookupswitch {
        //          511767879: 448
        //          596441648: 416
        //          default: 792
        //        }
        //   448: aload_1        
        //   449: goto            453
        //   452: athrow         
        //   453: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   456: goto            460
        //   459: athrow         
        //   460: instanceof      Lnet/minecraft/item/ItemPotion;
        //   463: ifeq            471
        //   466: ldc             1486017449
        //   468: goto            473
        //   471: ldc             1486017462
        //   473: ldc             1436885862
        //   475: ixor           
        //   476: tableswitch {
        //          443539870: 500
        //          443539871: 627
        //          default: 466
        //        }
        //   500: aload_1        
        //   501: goto            505
        //   504: athrow         
        //   505: invokestatic    net/minecraft/potion/PotionUtils.func_185189_a:(Lnet/minecraft/item/ItemStack;)Ljava/util/List;
        //   508: goto            512
        //   511: athrow         
        //   512: goto            516
        //   515: athrow         
        //   516: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   521: goto            525
        //   524: athrow         
        //   525: astore_2       
        //   526: aload_2        
        //   527: goto            531
        //   530: athrow         
        //   531: invokeinterface java/util/Iterator.hasNext:()Z
        //   536: goto            540
        //   539: athrow         
        //   540: ifeq            627
        //   543: aload_2        
        //   544: goto            548
        //   547: athrow         
        //   548: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   553: goto            557
        //   556: athrow         
        //   557: checkcast       Lnet/minecraft/potion/PotionEffect;
        //   560: astore_3       
        //   561: getstatic       dev/nuker/pyro/fc.c:I
        //   564: ifge            572
        //   567: ldc             -2134654368
        //   569: goto            574
        //   572: ldc             509844600
        //   574: ldc             164755712
        //   576: ixor           
        //   577: lookupswitch {
        //          -1995293856: 796
        //          984918784: 572
        //          default: 604
        //        }
        //   604: aload_3        
        //   605: goto            609
        //   608: athrow         
        //   609: invokevirtual   net/minecraft/potion/PotionEffect.func_188419_a:()Lnet/minecraft/potion/Potion;
        //   612: goto            616
        //   615: athrow         
        //   616: getstatic       net/minecraft/init/MobEffects.field_76420_g:Lnet/minecraft/potion/Potion;
        //   619: if_acmpne       624
        //   622: iconst_1       
        //   623: ireturn        
        //   624: goto            526
        //   627: getstatic       dev/nuker/pyro/f5v.c:[I
        //   630: aload_0        
        //   631: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0f;
        //   634: goto            638
        //   637: athrow         
        //   638: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   641: goto            645
        //   644: athrow         
        //   645: checkcast       Ldev/nuker/pyro/f5w;
        //   648: goto            652
        //   651: athrow         
        //   652: invokevirtual   dev/nuker/pyro/f5w.ordinal:()I
        //   655: goto            659
        //   658: athrow         
        //   659: iaload         
        //   660: lookupswitch {
        //                1: 688
        //                2: 712
        //          default: 780
        //        }
        //   688: aload_1        
        //   689: goto            693
        //   692: athrow         
        //   693: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   696: goto            700
        //   699: athrow         
        //   700: getstatic       net/minecraft/init/Items.field_185158_cP:Lnet/minecraft/item/Item;
        //   703: if_acmpne       710
        //   706: iconst_1       
        //   707: goto            711
        //   710: iconst_0       
        //   711: ireturn        
        //   712: aload_1        
        //   713: goto            717
        //   716: athrow         
        //   717: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   720: goto            724
        //   723: athrow         
        //   724: getstatic       dev/nuker/pyro/fc.1:I
        //   727: ifeq            735
        //   730: ldc             1072032458
        //   732: goto            737
        //   735: ldc             447665763
        //   737: ldc             925936781
        //   739: ixor           
        //   740: lookupswitch {
        //          148194887: 735
        //          765360878: 768
        //          default: 788
        //        }
        //   768: getstatic       net/minecraft/init/Items.field_151153_ao:Lnet/minecraft/item/Item;
        //   771: if_acmpne       778
        //   774: iconst_1       
        //   775: goto            779
        //   778: iconst_0       
        //   779: ireturn        
        //   780: iconst_0       
        //   781: ireturn        
        //   782: aconst_null    
        //   783: athrow         
        //   784: aconst_null    
        //   785: athrow         
        //   786: aconst_null    
        //   787: athrow         
        //   788: aconst_null    
        //   789: athrow         
        //   790: aconst_null    
        //   791: athrow         
        //   792: aconst_null    
        //   793: athrow         
        //   794: aconst_null    
        //   795: athrow         
        //   796: aconst_null    
        //   797: athrow         
        //   798: pop            
        //   799: goto            24
        //   802: pop            
        //   803: aconst_null    
        //   804: goto            798
        //   807: dup            
        //   808: ifnull          798
        //   811: checkcast       Ljava/lang/Throwable;
        //   814: athrow         
        //   815: dup            
        //   816: ifnull          802
        //   819: checkcast       Ljava/lang/Throwable;
        //   822: athrow         
        //   823: aconst_null    
        //   824: athrow         
        //    StackMapTable: 00 7F 43 07 00 37 04 FF 00 0B 00 00 00 01 07 00 37 FD 00 03 07 00 03 07 00 66 0A 41 01 1E 46 07 00 37 40 07 00 3E 45 07 00 37 40 07 00 72 FF 00 05 00 00 00 01 07 00 37 FF 00 00 00 02 07 00 03 07 00 66 00 01 07 00 43 45 07 00 37 40 01 02 04 41 01 18 FF 00 14 00 02 07 00 03 07 00 66 00 02 07 00 60 07 00 55 FF 00 01 00 02 07 00 03 07 00 66 00 03 07 00 60 07 00 55 01 FF 00 1C 00 02 07 00 03 07 00 66 00 02 07 00 60 07 00 55 42 07 00 37 FF 00 00 00 02 07 00 03 07 00 66 00 02 07 00 60 07 00 55 45 07 00 37 40 07 00 66 42 07 00 37 40 07 00 66 45 07 00 37 40 07 00 CE FF 00 05 00 00 00 01 07 00 37 FF 00 00 00 02 07 00 03 07 00 66 00 02 07 00 CE 07 00 CE 45 07 00 37 40 01 02 04 41 01 19 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 66 00 02 07 00 03 01 5D 07 00 03 4D 07 00 4F FF 00 01 00 02 07 00 03 07 00 66 00 02 07 00 4F 01 5B 07 00 4F 4D 07 00 60 FF 00 01 00 02 07 00 03 07 00 66 00 02 07 00 60 01 5B 07 00 60 FF 00 05 00 00 00 01 07 00 37 FF 00 00 00 02 07 00 03 07 00 66 00 02 07 00 60 07 00 D0 45 07 00 37 40 01 0D 41 01 1D 43 07 00 37 40 07 00 66 45 07 00 37 40 07 00 CE 05 04 41 01 1A 43 07 00 28 40 07 00 66 45 07 00 37 40 07 00 9C FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 02 07 00 03 07 00 66 00 01 07 00 9C 47 07 00 37 40 07 00 A2 FC 00 00 07 00 A2 FF 00 03 00 00 00 01 07 00 37 FF 00 00 00 03 07 00 03 07 00 66 07 00 A2 00 01 07 00 A2 47 07 00 37 40 01 FF 00 06 00 00 00 01 07 00 37 FF 00 00 00 03 07 00 03 07 00 66 07 00 A2 00 01 07 00 A2 47 07 00 37 40 07 00 72 FC 00 0E 07 00 AA 41 01 1D FF 00 03 00 00 00 01 07 00 37 FF 00 00 00 04 07 00 03 07 00 66 07 00 A2 07 00 AA 00 01 07 00 AA 45 07 00 37 40 07 00 D0 07 F9 00 02 FF 00 09 00 00 00 01 07 00 37 FF 00 00 00 02 07 00 03 07 00 66 00 02 07 00 D1 07 00 BC 45 07 00 37 FF 00 00 00 02 07 00 03 07 00 66 00 02 07 00 D1 07 00 72 45 07 00 14 FF 00 00 00 02 07 00 03 07 00 66 00 02 07 00 D1 07 00 BF 45 07 00 37 FF 00 00 00 02 07 00 03 07 00 66 00 02 07 00 D1 01 1C 43 07 00 37 40 07 00 66 45 07 00 37 40 07 00 CE 09 40 01 00 43 07 00 37 40 07 00 66 45 07 00 37 40 07 00 CE 4A 07 00 CE FF 00 01 00 02 07 00 03 07 00 66 00 02 07 00 CE 01 5E 07 00 CE 09 40 01 00 41 07 00 60 FF 00 01 00 02 07 00 03 07 00 66 00 02 07 00 60 07 00 55 41 07 00 03 41 07 00 CE 41 07 00 4F 01 01 FD 00 01 07 00 A2 07 00 AA FF 00 01 00 02 07 00 03 07 00 66 00 01 07 00 37 43 05 44 07 00 37 47 05 47 07 00 37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     807    815    Any
        //  807    815    807    815    Any
        //  823    825    3      8      Ljava/lang/RuntimeException;
        //  75     82     82     83     Any
        //  75     82     3      8      Any
        //  76     82     82     83     Ljava/lang/NullPointerException;
        //  75     82     82     83     Any
        //  75     82     75     76     Any
        //  90     96     96     97     Any
        //  90     96     3      8      Ljava/lang/NumberFormatException;
        //  90     96     96     97     Ljava/util/ConcurrentModificationException;
        //  90     96     3      8      Ljava/lang/AssertionError;
        //  90     96     3      8      Any
        //  187    194    194    195    Any
        //  188    194    187    188    Ljava/lang/ClassCastException;
        //  187    194    187    188    Ljava/lang/AssertionError;
        //  188    194    194    195    Any
        //  187    194    187    188    Ljava/lang/IndexOutOfBoundsException;
        //  198    205    205    206    Any
        //  198    205    3      8      Ljava/util/ConcurrentModificationException;
        //  199    205    198    199    Any
        //  199    205    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  198    205    3      8      Ljava/lang/UnsupportedOperationException;
        //  213    219    219    220    Any
        //  213    219    3      8      Ljava/lang/UnsupportedOperationException;
        //  213    219    3      8      Ljava/util/NoSuchElementException;
        //  213    219    3      8      Any
        //  213    219    3      8      Ljava/lang/NegativeArraySizeException;
        //  395    401    401    402    Any
        //  395    401    3      8      Ljava/lang/UnsupportedOperationException;
        //  395    401    401    402    Any
        //  395    401    401    402    Ljava/lang/RuntimeException;
        //  395    401    3      8      Ljava/lang/NullPointerException;
        //  452    459    459    460    Any
        //  453    459    452    453    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  452    459    452    453    Ljava/lang/UnsupportedOperationException;
        //  453    459    452    453    Any
        //  452    459    459    460    Any
        //  504    511    511    512    Any
        //  505    511    3      8      Any
        //  504    511    511    512    Any
        //  505    511    511    512    Any
        //  505    511    504    505    Ljava/lang/NegativeArraySizeException;
        //  516    524    524    525    Any
        //  516    524    3      8      Any
        //  516    524    524    525    Any
        //  516    524    524    525    Ljava/lang/EnumConstantNotPresentException;
        //  516    524    3      8      Any
        //  531    539    539    540    Any
        //  531    539    3      8      Ljava/lang/NullPointerException;
        //  531    539    539    540    Ljava/util/NoSuchElementException;
        //  531    539    3      8      Any
        //  531    539    3      8      Any
        //  548    556    556    557    Any
        //  548    556    556    557    Ljava/lang/NullPointerException;
        //  548    556    556    557    Any
        //  548    556    3      8      Any
        //  548    556    3      8      Ljava/lang/NullPointerException;
        //  609    615    615    616    Any
        //  609    615    615    616    Ljava/lang/IndexOutOfBoundsException;
        //  609    615    3      8      Any
        //  609    615    3      8      Ljava/lang/AssertionError;
        //  609    615    3      8      Any
        //  638    644    644    645    Any
        //  638    644    644    645    Any
        //  638    644    3      8      Ljava/lang/IllegalStateException;
        //  638    644    3      8      Any
        //  638    644    644    645    Ljava/lang/NumberFormatException;
        //  651    658    658    659    Any
        //  651    658    658    659    Any
        //  651    658    651    652    Ljava/lang/NullPointerException;
        //  651    658    651    652    Ljava/lang/StringIndexOutOfBoundsException;
        //  652    658    3      8      Ljava/lang/NullPointerException;
        //  692    699    699    700    Any
        //  692    699    3      8      Any
        //  692    699    692    693    Any
        //  693    699    699    700    Any
        //  693    699    692    693    Any
        //  716    723    723    724    Any
        //  717    723    723    724    Any
        //  717    723    716    717    Any
        //  717    723    716    717    Ljava/lang/NumberFormatException;
        //  717    723    723    724    Ljava/lang/ArithmeticException;
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
    
    public f5x() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifge            11
        //     6: ldc             -76375723
        //     8: goto            13
        //    11: ldc             -1459446839
        //    13: ldc             1134838848
        //    15: ixor           
        //    16: lookupswitch {
        //          -1193878251: 1555
        //          927154854: 11
        //          default: 44
        //        }
        //    44: aload_0        
        //    45: ldc             "\u23ce\u1495\u8ade\ub3d1\uc98f\uedc9\ub220"
        //    47: invokestatic    invokestatic   !!! ERROR
        //    50: ldc             "\u23ee\u1495\u8ade\ub3d1\uc98f\uedc9\ub220"
        //    52: invokestatic    invokestatic   !!! ERROR
        //    55: ldc             "\u23e0\u1486\u8acc\ub3d6\uc983\uedc6\ub230\ue6fc\ud96b\ue9fc\ua70b\u1e40\ue1c8\uc5e7\u8169\u894b\u57a5\u7720\ubd2e\uc001\u2b2a\uc234\u6a2d\u2d44\ud7df\u35ab\u7d2d\u899d\u8019\u8cdb\u848f\ufb36\u70a7\u9a02\u1bc7\uf106\u497d\u8814\uca82\uff63\ub6ff\u41f5\ub9c4\ub35a\u4c3d\u8ada\u7c7d\uce50\u7d47\uea9b\ue6fc\u16d5\uee23\u3787\u46e1\ue19d\u0a03\u86ec\u19d4\u0f1b\u777c\u7284\uc7cb\ubbbf\u9a9d\u6a74\ue2ef\ud012\ua56d\u2583\u8982\u4fb3\u8b56\u140d\ua397\u70ff\u55aa\u1c4f\u618f\u11d9\u8857\u0522\uf8b4\u2660\u194a\ub9c8\u7ceb\u4ba3\u1a53\u24d6"
        //    57: invokestatic    invokestatic   !!! ERROR
        //    60: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    63: aload_0        
        //    64: new             Ldev/nuker/pyro/f0f;
        //    67: dup            
        //    68: ldc             "\u23cc\u149c\u8adc\ub3dc"
        //    70: invokestatic    invokestatic   !!! ERROR
        //    73: ldc             "\u23ec\u149c\u8adc\ub3dc"
        //    75: invokestatic    invokestatic   !!! ERROR
        //    78: aconst_null    
        //    79: getstatic       dev/nuker/pyro/f5w.0:Ldev/nuker/pyro/f5w;
        //    82: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //    85: putfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0f;
        //    88: getstatic       dev/nuker/pyro/fc.0:I
        //    91: ifeq            99
        //    94: ldc             -935914414
        //    96: goto            101
        //    99: ldc             1731617818
        //   101: ldc             -1687768142
        //   103: ixor           
        //   104: lookupswitch {
        //          1060083056: 99
        //          1397860320: 1567
        //          default: 132
        //        }
        //   132: aload_0        
        //   133: new             Ldev/nuker/pyro/f0d;
        //   136: dup            
        //   137: ldc             "\u23c5\u1496\u8ad4\ub3d8\uc997"
        //   139: invokestatic    invokestatic   !!! ERROR
        //   142: ldc             "\u23e5\u1496\u8ad4\ub3d8\uc997"
        //   144: invokestatic    invokestatic   !!! ERROR
        //   147: aconst_null    
        //   148: dconst_0       
        //   149: dconst_0       
        //   150: ldc2_w          2.0
        //   153: getstatic       dev/nuker/pyro/fc.1:I
        //   156: ifeq            164
        //   159: ldc             -21875761
        //   161: goto            166
        //   164: ldc             627193154
        //   166: ldc             -1106138477
        //   168: ixor           
        //   169: lookupswitch {
        //          -1686921263: 196
        //          1084463452: 164
        //          default: 1587
        //        }
        //   196: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   199: putfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0d;
        //   202: aload_0        
        //   203: new             Ldev/nuker/pyro/f0d;
        //   206: dup            
        //   207: ldc_w           "\u23c9\u1496\u8ad9\ub3d5\uc99a\uedcf"
        //   210: invokestatic    invokestatic   !!! ERROR
        //   213: ldc_w           "\u23e9\u1496\u8ad9\ub3d5\uc99a\uedcf"
        //   216: invokestatic    invokestatic   !!! ERROR
        //   219: ldc_w           "\u23f6\u149b\u8add\ub3d7\uc9ce\uedde\ub22b\ue6e0\ud928\ue9fb\ua706\u1e40\ue1dd\uc5e7\u8178\u8959\u57a8\u773f\ubd2a\uc001\u2b27\uc233\u6a31\u2d45\ud7df\u35ac\u7d2e\u899a\u801d\u8cce\u8489\ufb72\u70f1\u9a17\u1bc4\uf153\u4979\u8818\ucac6\uff65\ub6ff\u41fb\ub9c0\ub346\u4c3c\u8a94\u7c7e\uce19\u7d42\uea83\ue6b9\u16dc\uee6a\u379d\u46e6\ue1df\u0a1b\u86e1"
        //   222: invokestatic    invokestatic   !!! ERROR
        //   225: ldc2_w          8.0
        //   228: dconst_0       
        //   229: ldc2_w          20.0
        //   232: getstatic       dev/nuker/pyro/fc.0:I
        //   235: ifeq            244
        //   238: ldc_w           954239048
        //   241: goto            247
        //   244: ldc_w           1093443893
        //   247: ldc_w           -1376765895
        //   250: ixor           
        //   251: lookupswitch {
        //          -1794068367: 244
        //          -321087220: 276
        //          default: 1595
        //        }
        //   276: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   279: putfield        dev/nuker/pyro/f5x.0:Ldev/nuker/pyro/f0d;
        //   282: getstatic       dev/nuker/pyro/fc.0:I
        //   285: ifeq            294
        //   288: ldc_w           96470747
        //   291: goto            297
        //   294: ldc_w           -1949560428
        //   297: ldc_w           -2048955459
        //   300: ixor           
        //   301: lookupswitch {
        //          -2145424026: 1601
        //          -368813692: 294
        //          default: 328
        //        }
        //   328: aload_0        
        //   329: new             Ldev/nuker/pyro/f0a;
        //   332: dup            
        //   333: ldc_w           "\u23d2\u1487\u8aca\ub3dc\uc980\uedc0\ub230\ue6fd"
        //   336: invokestatic    invokestatic   !!! ERROR
        //   339: ldc_w           "\u23f2\u1487\u8aca\ub3dc\uc980\uedc0\ub230\ue6fd"
        //   342: invokestatic    invokestatic   !!! ERROR
        //   345: ldc_w           "\u23f1\u1486\u8acc\ub3ca\uc9ce\uedc6\ub264\ue6e6\ud97c\ue9ef\ua702\u1e42\ue1d6\uc5b3\u8172\u891c\u57ad\u773e\ubd7d\uc04e\u2b35\uc23d\u6a30\u2d57\ud791\u35a0\u7d6b\u8992\u8017\u8c9a\u8498\ufb3d\u70f2\u9a56\u1bc0\uf147\u496a\u8851\ucac6\uff6b\ub6b9\u41e0\ub9d6\ub347\u4c2a\u8ad0\u7c29\uce19\u7d40\ueacf\ue6f4\u16d9\uee6a\u3780\u46a7\ue1d5\u0a16\u86ea\u19d1\u0f4f\u773d\u7283\uc7db\ubbfa\u9a94\u6a3b\ue2e8\ud046\ua539\u25c0\u899f\u4fa0\u8b52\u140d\ua3d9\u70ea\u55e6\u1c45\u61db\u11c5\u885d\u0538\uf8f3\u2664\u1950\ub98d\u7cfd\u4ba0\u1a5b\u24c7\uce1f\ub2ea\ued51\u7671\u4e70\uee7b\uf837\u416f\u7151"
        //   348: getstatic       dev/nuker/pyro/fc.1:I
        //   351: ifeq            360
        //   354: ldc_w           -932559564
        //   357: goto            363
        //   360: ldc_w           1019295034
        //   363: ldc_w           -439623611
        //   366: ixor           
        //   367: lookupswitch {
        //          765568369: 1581
        //          976508961: 360
        //          default: 392
        //        }
        //   392: invokestatic    invokestatic   !!! ERROR
        //   395: iconst_0       
        //   396: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   399: putfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0a;
        //   402: aload_0        
        //   403: new             Ldev/nuker/pyro/f0a;
        //   406: dup            
        //   407: ldc_w           "\u23cd\u1496\u8acc\ub3d1\uc98f\uedcb\ub207\ue6e7\ud971\ue9ee\ua713\u1e4d\ue1dd\uc584\u8172\u8959\u57a7\u773b"
        //   410: invokestatic    invokestatic   !!! ERROR
        //   413: ldc_w           "\u23ed\u1496\u8acc\ub3d1\uc98f\uedcb\ub207\ue6e7\ud971\ue9ee\ua713\u1e4d\ue1dd\uc584\u8172\u8959\u57a7\u773b"
        //   416: invokestatic    invokestatic   !!! ERROR
        //   419: ldc_w           "\u23e8\u1495\u8a98\ub3d8\uc9ce\uedc4\ub236\ue6ec\ud97b\ue9e9\ua706\u1e40\ue191\uc5a9\u817f\u895d\u57b6\u7770\ubd24\uc04e\u2b26\uc27b\u6a2f\u2d5f\ud793\u35a8\u7d6b\u8990\u8018\u8cd6\u848d\ufb72\u70fe\u9a19\u1bdd\uf10a\u493c\u885b\uca80\uff6c\ub6f1\u41f2\ub9cf\ub34c\u4c78\u8ac3\u7c60\uce1c\u7d42\ueacf\ue6fd\u16d1\uee70\u378f\u46e5\ue1d1\u0a12\u86a8\u1995\u0f1c\u7733\u72cd\uc7c6\ubbb5\u9a85\u6a74\ue2e5\ud000\ua523\u25c0\u8991\u4fa0\u8b48\u1404\ua3d9\u70e9\u55a7\u1c55\u61c4\u1197\u884c\u0539\uf8b4\u2651\u194d\ub9d9\u7cf7\u4b92\u1a52\u24d6\uce19\ub2f3"
        //   422: invokestatic    invokestatic   !!! ERROR
        //   425: iconst_0       
        //   426: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   429: getstatic       dev/nuker/pyro/fc.0:I
        //   432: ifeq            441
        //   435: ldc_w           -1366272987
        //   438: goto            444
        //   441: ldc_w           -1190678129
        //   444: ldc_w           1529665020
        //   447: ixor           
        //   448: lookupswitch {
        //          -708915703: 441
        //          -172195367: 1553
        //          default: 476
        //        }
        //   476: putfield        dev/nuker/pyro/f5x.0:Ldev/nuker/pyro/f0a;
        //   479: aload_0        
        //   480: new             Ldev/nuker/pyro/f0d;
        //   483: dup            
        //   484: ldc_w           "\u23c7\u1492\u8ad4\ub3d5\uc9aa\uedce\ub237\ue6e1\ud969\ue9f3\ua704\u1e49"
        //   487: getstatic       dev/nuker/pyro/fc.1:I
        //   490: ifeq            499
        //   493: ldc_w           -567815468
        //   496: goto            502
        //   499: ldc_w           -1419389937
        //   502: ldc_w           1642147500
        //   505: ixor           
        //   506: lookupswitch {
        //          -1077478280: 1573
        //          901245531: 499
        //          default: 532
        //        }
        //   532: invokestatic    invokestatic   !!! ERROR
        //   535: ldc_w           "\u23e7\u1492\u8ad4\ub3d5\uc9aa\uedce\ub237\ue6e1\ud969\ue9f3\ua704\u1e49"
        //   538: invokestatic    invokestatic   !!! ERROR
        //   541: aconst_null    
        //   542: ldc2_w          20.0
        //   545: dconst_0       
        //   546: ldc2_w          100.0
        //   549: invokespecial   dev/nuker/pyro/f0d.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
        //   552: getstatic       dev/nuker/pyro/fc.c:I
        //   555: ifge            564
        //   558: ldc_w           1269522861
        //   561: goto            567
        //   564: ldc_w           -1705930166
        //   567: ldc_w           1100452983
        //   570: ixor           
        //   571: lookupswitch {
        //          -607779267: 596
        //          171767258: 564
        //          default: 1557
        //        }
        //   596: putfield        dev/nuker/pyro/f5x.1:Ldev/nuker/pyro/f0d;
        //   599: aload_0        
        //   600: new             Ldev/nuker/pyro/f0a;
        //   603: dup            
        //   604: ldc_w           "\u23c4\u149f\u8ac1\ub3cd\uc99c\uedc6\ub214\ue6f4\ud97d\ue9ee\ua702"
        //   607: invokestatic    invokestatic   !!! ERROR
        //   610: ldc_w           "\u23e4\u149f\u8ac1\ub3cd\uc99c\uedc6\ub214\ue6f4\ud97d\ue9ee\ua702"
        //   613: invokestatic    invokestatic   !!! ERROR
        //   616: aconst_null    
        //   617: iconst_1       
        //   618: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   621: putfield        dev/nuker/pyro/f5x.1:Ldev/nuker/pyro/f0a;
        //   624: aload_0        
        //   625: new             Ldev/nuker/pyro/f0a;
        //   628: dup            
        //   629: ldc_w           "\u23ca\u1496\u8add\ub3c9\uc9ab\uedc9\ub225\ue6f7\ud964\ue9f8\ua703"
        //   632: getstatic       dev/nuker/pyro/fc.1:I
        //   635: ifeq            644
        //   638: ldc_w           -736684999
        //   641: goto            647
        //   644: ldc_w           -1817763229
        //   647: ldc_w           -743621637
        //   650: ixor           
        //   651: lookupswitch {
        //          129642434: 644
        //          1074403736: 676
        //          default: 1583
        //        }
        //   676: invokestatic    invokestatic   !!! ERROR
        //   679: ldc_w           "\u23ea\u1496\u8add\ub3c9\uc9ab\uedc9\ub225\ue6f7\ud964\ue9f8\ua703"
        //   682: invokestatic    invokestatic   !!! ERROR
        //   685: aconst_null    
        //   686: iconst_1       
        //   687: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   690: putfield        dev/nuker/pyro/f5x.2:Ldev/nuker/pyro/f0a;
        //   693: aload_0        
        //   694: new             Ldev/nuker/pyro/f0a;
        //   697: dup            
        //   698: ldc_w           "\u23cf\u149c\u8aeb\ub3ce\uc987\uedd3\ub227\ue6fd\ud95f\ue9f5\ua70e\u1e40\ue1d4\uc582\u817b\u8948\u57ad\u773e\ubd3a"
        //   701: invokestatic    invokestatic   !!! ERROR
        //   704: ldc_w           "\u23f1\u1492\u8acd\ub3ca\uc98b\uedf0\ub22c\ue6fc\ud964\ue9f8\ua722\u1e4d\ue1c5\uc5ae\u8174\u895b"
        //   707: invokestatic    invokestatic   !!! ERROR
        //   710: aconst_null    
        //   711: iconst_1       
        //   712: getstatic       dev/nuker/pyro/fc.c:I
        //   715: ifge            724
        //   718: ldc_w           391652990
        //   721: goto            727
        //   724: ldc_w           -1723892888
        //   727: ldc_w           -1198131868
        //   730: ixor           
        //   731: lookupswitch {
        //          -1345465574: 724
        //          564825612: 756
        //          default: 1559
        //        }
        //   756: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   759: getstatic       dev/nuker/pyro/fc.1:I
        //   762: ifeq            771
        //   765: ldc_w           663369076
        //   768: goto            774
        //   771: ldc_w           865234502
        //   774: ldc_w           -312534568
        //   777: ixor           
        //   778: lookupswitch {
        //          -891999060: 771
        //          -556959842: 804
        //          default: 1591
        //        }
        //   804: putfield        dev/nuker/pyro/f5x.3:Ldev/nuker/pyro/f0a;
        //   807: aload_0        
        //   808: new             Ldev/nuker/pyro/f0h;
        //   811: dup            
        //   812: ldc_w           "\u23d2\u1484\u8ad9\ub3c9\uc9a5\uedc2\ub23d"
        //   815: invokestatic    invokestatic   !!! ERROR
        //   818: ldc_w           "\u23f2\u1484\u8ad9\ub3c9"
        //   821: invokestatic    invokestatic   !!! ERROR
        //   824: ldc_w           "\u23ea\u1496\u8ac1\ub399\uc99a\uedc8\ub264\ue6e6\ud97f\ue9fc\ua717\u1e0c\ue1c5\uc5a8\u813a\u895f\u57b6\u7729\ubd2e\uc055\u2b32\uc237\u6a77\u2d51\ud79e\u35b4"
        //   827: getstatic       dev/nuker/pyro/fc.c:I
        //   830: ifge            839
        //   833: ldc_w           678988407
        //   836: goto            842
        //   839: ldc_w           617062833
        //   842: ldc_w           -1438842088
        //   845: ixor           
        //   846: lookupswitch {
        //          -2109372049: 839
        //          -1896176983: 872
        //          default: 1569
        //        }
        //   872: invokestatic    invokestatic   !!! ERROR
        //   875: iconst_m1      
        //   876: invokespecial   dev/nuker/pyro/f0h.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
        //   879: putfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0h;
        //   882: aload_0        
        //   883: new             Ldev/nuker/pyro/fbu;
        //   886: dup            
        //   887: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   890: putfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/fbu;
        //   893: getstatic       dev/nuker/pyro/fc.c:I
        //   896: ifge            905
        //   899: ldc_w           -320461149
        //   902: goto            908
        //   905: ldc_w           1690807433
        //   908: ldc_w           -720224805
        //   911: ixor           
        //   912: lookupswitch {
        //          -1311403694: 940
        //          972299128: 905
        //          default: 1561
        //        }
        //   940: aload_0        
        //   941: iconst_0       
        //   942: putfield        dev/nuker/pyro/f5x.0:Z
        //   945: aload_0        
        //   946: new             Ldev/nuker/pyro/fbu;
        //   949: dup            
        //   950: invokespecial   dev/nuker/pyro/fbu.<init>:()V
        //   953: putfield        dev/nuker/pyro/f5x.0:Ldev/nuker/pyro/fbu;
        //   956: getstatic       dev/nuker/pyro/fc.c:I
        //   959: ifge            968
        //   962: ldc_w           10220497
        //   965: goto            971
        //   968: ldc_w           -474974126
        //   971: ldc_w           2012028150
        //   974: ixor           
        //   975: lookupswitch {
        //          -1805818716: 1000
        //          2004283175: 968
        //          default: 1579
        //        }
        //  1000: aload_0        
        //  1001: aload_0        
        //  1002: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0f;
        //  1005: invokevirtual   dev/nuker/pyro/f5x.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1008: pop            
        //  1009: getstatic       dev/nuker/pyro/fc.0:I
        //  1012: ifeq            1021
        //  1015: ldc_w           -1322387758
        //  1018: goto            1024
        //  1021: ldc_w           -1730994059
        //  1024: ldc_w           -1967487876
        //  1027: ixor           
        //  1028: lookupswitch {
        //          308913161: 1056
        //          999781038: 1021
        //          default: 1593
        //        }
        //  1056: aload_0        
        //  1057: aload_0        
        //  1058: getstatic       dev/nuker/pyro/fc.1:I
        //  1061: ifeq            1070
        //  1064: ldc_w           253528361
        //  1067: goto            1073
        //  1070: ldc_w           -1126068931
        //  1073: ldc_w           -230507928
        //  1076: ixor           
        //  1077: lookupswitch {
        //          -44158143: 1070
        //          1319319381: 1104
        //          default: 1599
        //        }
        //  1104: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0d;
        //  1107: invokevirtual   dev/nuker/pyro/f5x.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1110: pop            
        //  1111: getstatic       dev/nuker/pyro/fc.0:I
        //  1114: ifeq            1123
        //  1117: ldc_w           -298637784
        //  1120: goto            1126
        //  1123: ldc_w           -1998839677
        //  1126: ldc_w           -1150565016
        //  1129: ixor           
        //  1130: lookupswitch {
        //          867689963: 1156
        //          1431888704: 1123
        //          default: 1575
        //        }
        //  1156: aload_0        
        //  1157: getstatic       dev/nuker/pyro/fc.c:I
        //  1160: ifge            1169
        //  1163: ldc_w           1366347392
        //  1166: goto            1172
        //  1169: ldc_w           -654412364
        //  1172: ldc_w           794696780
        //  1175: ixor           
        //  1176: lookupswitch {
        //          -797650385: 1169
        //          2116997836: 1565
        //          default: 1204
        //        }
        //  1204: aload_0        
        //  1205: getfield        dev/nuker/pyro/f5x.0:Ldev/nuker/pyro/f0d;
        //  1208: invokevirtual   dev/nuker/pyro/f5x.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1211: pop            
        //  1212: aload_0        
        //  1213: aload_0        
        //  1214: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0a;
        //  1217: invokevirtual   dev/nuker/pyro/f5x.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1220: pop            
        //  1221: aload_0        
        //  1222: getstatic       dev/nuker/pyro/fc.0:I
        //  1225: ifeq            1234
        //  1228: ldc_w           1562255622
        //  1231: goto            1237
        //  1234: ldc_w           572267431
        //  1237: ldc_w           1501078738
        //  1240: ixor           
        //  1241: lookupswitch {
        //          73827796: 1571
        //          815971915: 1234
        //          default: 1268
        //        }
        //  1268: aload_0        
        //  1269: getfield        dev/nuker/pyro/f5x.0:Ldev/nuker/pyro/f0a;
        //  1272: invokevirtual   dev/nuker/pyro/f5x.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1275: pop            
        //  1276: aload_0        
        //  1277: getstatic       dev/nuker/pyro/fc.0:I
        //  1280: ifeq            1289
        //  1283: ldc_w           116244595
        //  1286: goto            1292
        //  1289: ldc_w           -153474018
        //  1292: ldc_w           899527330
        //  1295: ixor           
        //  1296: lookupswitch {
        //          -2018508557: 1289
        //          863007441: 1577
        //          default: 1324
        //        }
        //  1324: aload_0        
        //  1325: getfield        dev/nuker/pyro/f5x.1:Ldev/nuker/pyro/f0d;
        //  1328: invokevirtual   dev/nuker/pyro/f5x.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1331: pop            
        //  1332: getstatic       dev/nuker/pyro/fc.1:I
        //  1335: ifeq            1344
        //  1338: ldc_w           -101083108
        //  1341: goto            1347
        //  1344: ldc_w           596448042
        //  1347: ldc_w           405568076
        //  1350: ixor           
        //  1351: lookupswitch {
        //          -506076592: 1597
        //          226271437: 1344
        //          default: 1376
        //        }
        //  1376: aload_0        
        //  1377: aload_0        
        //  1378: getfield        dev/nuker/pyro/f5x.1:Ldev/nuker/pyro/f0a;
        //  1381: invokevirtual   dev/nuker/pyro/f5x.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1384: pop            
        //  1385: getstatic       dev/nuker/pyro/fc.1:I
        //  1388: ifeq            1397
        //  1391: ldc_w           1703435728
        //  1394: goto            1400
        //  1397: ldc_w           1706051960
        //  1400: ldc_w           -902781012
        //  1403: ixor           
        //  1404: lookupswitch {
        //          -1350504748: 1432
        //          -1346831748: 1397
        //          default: 1585
        //        }
        //  1432: aload_0        
        //  1433: aload_0        
        //  1434: getfield        dev/nuker/pyro/f5x.2:Ldev/nuker/pyro/f0a;
        //  1437: invokevirtual   dev/nuker/pyro/f5x.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1440: pop            
        //  1441: aload_0        
        //  1442: aload_0        
        //  1443: getfield        dev/nuker/pyro/f5x.3:Ldev/nuker/pyro/f0a;
        //  1446: invokevirtual   dev/nuker/pyro/f5x.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1449: pop            
        //  1450: getstatic       dev/nuker/pyro/fc.1:I
        //  1453: ifeq            1462
        //  1456: ldc_w           575200720
        //  1459: goto            1465
        //  1462: ldc_w           539457589
        //  1465: ldc_w           2101884170
        //  1468: ixor           
        //  1469: lookupswitch {
        //          1567575359: 1496
        //          1593895130: 1462
        //          default: 1563
        //        }
        //  1496: aload_0        
        //  1497: aload_0        
        //  1498: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0h;
        //  1501: getstatic       dev/nuker/pyro/fc.0:I
        //  1504: ifeq            1513
        //  1507: ldc_w           1497442066
        //  1510: goto            1516
        //  1513: ldc_w           -76846311
        //  1516: ldc_w           -1959717152
        //  1519: ixor           
        //  1520: lookupswitch {
        //          -764399118: 1589
        //          1491547921: 1513
        //          default: 1548
        //        }
        //  1548: invokevirtual   dev/nuker/pyro/f5x.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //  1551: pop            
        //  1552: return         
        //  1553: aconst_null    
        //  1554: athrow         
        //  1555: aconst_null    
        //  1556: athrow         
        //  1557: aconst_null    
        //  1558: athrow         
        //  1559: aconst_null    
        //  1560: athrow         
        //  1561: aconst_null    
        //  1562: athrow         
        //  1563: aconst_null    
        //  1564: athrow         
        //  1565: aconst_null    
        //  1566: athrow         
        //  1567: aconst_null    
        //  1568: athrow         
        //  1569: aconst_null    
        //  1570: athrow         
        //  1571: aconst_null    
        //  1572: athrow         
        //  1573: aconst_null    
        //  1574: athrow         
        //  1575: aconst_null    
        //  1576: athrow         
        //  1577: aconst_null    
        //  1578: athrow         
        //  1579: aconst_null    
        //  1580: athrow         
        //  1581: aconst_null    
        //  1582: athrow         
        //  1583: aconst_null    
        //  1584: athrow         
        //  1585: aconst_null    
        //  1586: athrow         
        //  1587: aconst_null    
        //  1588: athrow         
        //  1589: aconst_null    
        //  1590: athrow         
        //  1591: aconst_null    
        //  1592: athrow         
        //  1593: aconst_null    
        //  1594: athrow         
        //  1595: aconst_null    
        //  1596: athrow         
        //  1597: aconst_null    
        //  1598: athrow         
        //  1599: aconst_null    
        //  1600: athrow         
        //  1601: aconst_null    
        //  1602: athrow         
        //    StackMapTable: 00 64 0B 41 01 1E FF 00 36 00 01 07 00 03 00 00 41 01 1E FF 00 1F 00 01 07 00 03 00 09 07 00 03 08 00 85 08 00 85 07 01 96 07 01 96 05 03 03 03 FF 00 01 00 01 07 00 03 00 0A 07 00 03 08 00 85 08 00 85 07 01 96 07 01 96 05 03 03 03 01 FF 00 1D 00 01 07 00 03 00 09 07 00 03 08 00 85 08 00 85 07 01 96 07 01 96 05 03 03 03 FF 00 2F 00 01 07 00 03 00 09 07 00 03 08 00 CB 08 00 CB 07 01 96 07 01 96 07 01 96 03 03 03 FF 00 02 00 01 07 00 03 00 0A 07 00 03 08 00 CB 08 00 CB 07 01 96 07 01 96 07 01 96 03 03 03 01 FF 00 1C 00 01 07 00 03 00 09 07 00 03 08 00 CB 08 00 CB 07 01 96 07 01 96 07 01 96 03 03 03 11 42 01 1E FF 00 1F 00 01 07 00 03 00 06 07 00 03 08 01 49 08 01 49 07 01 96 07 01 96 07 01 96 FF 00 02 00 01 07 00 03 00 07 07 00 03 08 01 49 08 01 49 07 01 96 07 01 96 07 01 96 01 FF 00 1C 00 01 07 00 03 00 06 07 00 03 08 01 49 08 01 49 07 01 96 07 01 96 07 01 96 FF 00 30 00 01 07 00 03 00 02 07 00 03 07 00 3E FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 3E 01 FF 00 1F 00 01 07 00 03 00 02 07 00 03 07 00 3E FF 00 16 00 01 07 00 03 00 04 07 00 03 08 01 E0 08 01 E0 07 01 96 FF 00 02 00 01 07 00 03 00 05 07 00 03 08 01 E0 08 01 E0 07 01 96 01 FF 00 1D 00 01 07 00 03 00 04 07 00 03 08 01 E0 08 01 E0 07 01 96 FF 00 1F 00 01 07 00 03 00 02 07 00 03 07 00 F3 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 F3 01 FF 00 1C 00 01 07 00 03 00 02 07 00 03 07 00 F3 FF 00 2F 00 01 07 00 03 00 04 07 00 03 08 02 71 08 02 71 07 01 96 FF 00 02 00 01 07 00 03 00 05 07 00 03 08 02 71 08 02 71 07 01 96 01 FF 00 1C 00 01 07 00 03 00 04 07 00 03 08 02 71 08 02 71 07 01 96 FF 00 2F 00 01 07 00 03 00 07 07 00 03 08 02 B6 08 02 B6 07 01 96 07 01 96 05 01 FF 00 02 00 01 07 00 03 00 08 07 00 03 08 02 B6 08 02 B6 07 01 96 07 01 96 05 01 01 FF 00 1C 00 01 07 00 03 00 07 07 00 03 08 02 B6 08 02 B6 07 01 96 07 01 96 05 01 FF 00 0E 00 01 07 00 03 00 02 07 00 03 07 00 3E FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 3E 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 3E FF 00 22 00 01 07 00 03 00 06 07 00 03 08 03 28 08 03 28 07 01 96 07 01 96 07 01 96 FF 00 02 00 01 07 00 03 00 07 07 00 03 08 03 28 08 03 28 07 01 96 07 01 96 07 01 96 01 FF 00 1D 00 01 07 00 03 00 06 07 00 03 08 03 28 08 03 28 07 01 96 07 01 96 07 01 96 20 42 01 1F 1B 42 01 1C 14 42 01 1F FF 00 0D 00 01 07 00 03 00 02 07 00 03 07 00 03 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 03 01 FF 00 1E 00 01 07 00 03 00 02 07 00 03 07 00 03 12 42 01 1D 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 5D 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5E 07 00 03 54 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 13 42 01 1C 14 42 01 1F 1D 42 01 1E FF 00 10 00 01 07 00 03 00 02 07 00 03 07 01 55 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 01 55 01 FF 00 1F 00 01 07 00 03 00 02 07 00 03 07 01 55 FF 00 04 00 01 07 00 03 00 02 07 00 03 07 00 3E FF 00 01 00 01 06 00 00 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 F3 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 02 B6 08 02 B6 07 01 96 07 01 96 05 01 01 01 41 07 00 03 01 FF 00 01 00 01 07 00 03 00 06 07 00 03 08 03 28 08 03 28 07 01 96 07 01 96 07 01 96 41 07 00 03 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 01 E0 08 01 E0 07 01 96 01 41 07 00 03 01 FF 00 01 00 01 07 00 03 00 06 07 00 03 08 01 49 08 01 49 07 01 96 07 01 96 07 01 96 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 02 71 08 02 71 07 01 96 01 FF 00 01 00 01 07 00 03 00 09 07 00 03 08 00 85 08 00 85 07 01 96 07 01 96 05 03 03 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 01 55 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 3E 01 FF 00 01 00 01 07 00 03 00 09 07 00 03 08 00 CB 08 00 CB 07 01 96 07 01 96 07 01 96 03 03 03 01 FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 03 01
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
    
    static {
        throw t;
    }
    
    @f06(3)
    @LauncherEventHide
    public void c(final f3h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          4969
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            4961
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            4953
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: aload_0        
        //    26: getstatic       dev/nuker/pyro/fc.1:I
        //    29: ifeq            38
        //    32: ldc_w           1224713536
        //    35: goto            41
        //    38: ldc_w           -105352704
        //    41: ldc_w           -1092012322
        //    44: ixor           
        //    45: lookupswitch {
        //          -166292578: 4928
        //          882221020: 38
        //          default: 72
        //        }
        //    72: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0f;
        //    75: goto            79
        //    78: athrow         
        //    79: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //    82: goto            86
        //    85: athrow         
        //    86: goto            90
        //    89: athrow         
        //    90: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    93: goto            97
        //    96: athrow         
        //    97: goto            101
        //   100: athrow         
        //   101: invokevirtual   dev/nuker/pyro/f5x.4:(Ljava/lang/String;)V
        //   104: goto            108
        //   107: athrow         
        //   108: aload_0        
        //   109: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0h;
        //   112: goto            116
        //   115: athrow         
        //   116: invokevirtual   dev/nuker/pyro/f0h.c:()Z
        //   119: goto            123
        //   122: athrow         
        //   123: ifeq            528
        //   126: aload_0        
        //   127: getstatic       dev/nuker/pyro/fc.0:I
        //   130: ifeq            139
        //   133: ldc_w           658904632
        //   136: goto            142
        //   139: ldc_w           57351650
        //   142: ldc_w           -1159932320
        //   145: ixor           
        //   146: lookupswitch {
        //          -1650802600: 4890
        //          -1437333225: 139
        //          default: 172
        //        }
        //   172: getfield        dev/nuker/pyro/f5x.0:Ldev/nuker/pyro/fbu;
        //   175: ldc2_w          500.0
        //   178: getstatic       dev/nuker/pyro/fc.1:I
        //   181: ifeq            190
        //   184: ldc_w           -243377565
        //   187: goto            193
        //   190: ldc_w           1600674625
        //   193: ldc_w           971579323
        //   196: ixor           
        //   197: lookupswitch {
        //          -929610280: 190
        //          1719747834: 224
        //          default: 4940
        //        }
        //   224: goto            228
        //   227: athrow         
        //   228: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //   231: goto            235
        //   234: athrow         
        //   235: ifeq            528
        //   238: aload_0        
        //   239: getstatic       dev/nuker/pyro/fc.1:I
        //   242: ifeq            251
        //   245: ldc_w           -98612803
        //   248: goto            254
        //   251: ldc_w           8982081
        //   254: ldc_w           -1968797567
        //   257: ixor           
        //   258: lookupswitch {
        //          -1976596800: 284
        //          1891221820: 251
        //          default: 4864
        //        }
        //   284: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0f;
        //   287: aload_0        
        //   288: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0f;
        //   291: goto            295
        //   294: athrow         
        //   295: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   298: goto            302
        //   301: athrow         
        //   302: getstatic       dev/nuker/pyro/f5w.c:Ldev/nuker/pyro/f5w;
        //   305: if_acmpne       314
        //   308: getstatic       dev/nuker/pyro/f5w.0:Ldev/nuker/pyro/f5w;
        //   311: goto            317
        //   314: getstatic       dev/nuker/pyro/f5w.c:Ldev/nuker/pyro/f5w;
        //   317: getstatic       dev/nuker/pyro/fc.0:I
        //   320: ifeq            329
        //   323: ldc_w           847506746
        //   326: goto            332
        //   329: ldc_w           824498180
        //   332: ldc_w           -79859126
        //   335: ixor           
        //   336: lookupswitch {
        //          -910254224: 329
        //          -904287666: 364
        //          default: 4912
        //        }
        //   364: goto            368
        //   367: athrow         
        //   368: invokevirtual   dev/nuker/pyro/f0f.c:(Ljava/lang/Object;)V
        //   371: goto            375
        //   374: athrow         
        //   375: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //   378: new             Ljava/lang/StringBuilder;
        //   381: dup            
        //   382: goto            386
        //   385: athrow         
        //   386: invokespecial   java/lang/StringBuilder.<init>:()V
        //   389: goto            393
        //   392: athrow         
        //   393: ldc_w           "\u23f2\u1496\u8acc\ub188\ucfa9\uedcf\ub221\ue6b5\udb74\uefc1\ua703\u1e49\ue191\uc7a2\u8746\u891c"
        //   396: goto            400
        //   399: athrow         
        //   400: invokestatic    invokestatic   !!! ERROR
        //   403: goto            407
        //   406: athrow         
        //   407: goto            411
        //   410: athrow         
        //   411: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   414: goto            418
        //   417: athrow         
        //   418: aload_0        
        //   419: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0f;
        //   422: goto            426
        //   425: athrow         
        //   426: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   429: goto            433
        //   432: athrow         
        //   433: getstatic       dev/nuker/pyro/fc.0:I
        //   436: ifeq            445
        //   439: ldc_w           1904970927
        //   442: goto            448
        //   445: ldc_w           282119288
        //   448: ldc_w           -1058124589
        //   451: ixor           
        //   452: lookupswitch {
        //          -1318731652: 445
        //          -801210197: 480
        //          default: 4852
        //        }
        //   480: goto            484
        //   483: athrow         
        //   484: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   487: goto            491
        //   490: athrow         
        //   491: goto            495
        //   494: athrow         
        //   495: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   498: goto            502
        //   501: athrow         
        //   502: goto            506
        //   505: athrow         
        //   506: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //   509: goto            513
        //   512: athrow         
        //   513: aload_0        
        //   514: getfield        dev/nuker/pyro/f5x.0:Ldev/nuker/pyro/fbu;
        //   517: goto            521
        //   520: athrow         
        //   521: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //   524: goto            528
        //   527: athrow         
        //   528: aload_0        
        //   529: getfield        dev/nuker/pyro/f5x.3:Ldev/nuker/pyro/f0a;
        //   532: goto            536
        //   535: athrow         
        //   536: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   539: goto            543
        //   542: athrow         
        //   543: checkcast       Ljava/lang/Boolean;
        //   546: goto            550
        //   549: athrow         
        //   550: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   553: goto            557
        //   556: athrow         
        //   557: ifeq            566
        //   560: ldc_w           1720896848
        //   563: goto            569
        //   566: ldc_w           1720896849
        //   569: ldc_w           -2090038900
        //   572: ixor           
        //   573: tableswitch {
        //          -872642120: 596
        //          -872642119: 701
        //          default: 560
        //        }
        //   596: aload_0        
        //   597: getstatic       dev/nuker/pyro/fc.c:I
        //   600: ifge            609
        //   603: ldc_w           -464224876
        //   606: goto            612
        //   609: ldc_w           1921478521
        //   612: ldc_w           -1299297002
        //   615: ixor           
        //   616: lookupswitch {
        //          244754627: 609
        //          1457139842: 4830
        //          default: 644
        //        }
        //   644: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //   647: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   650: goto            654
        //   653: athrow         
        //   654: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184587_cr:()Z
        //   657: goto            661
        //   660: athrow         
        //   661: ifeq            670
        //   664: ldc_w           1993302781
        //   667: goto            673
        //   670: ldc_w           1993302780
        //   673: ldc_w           198254457
        //   676: ixor           
        //   677: tableswitch {
        //          -96666872: 700
        //          -96666871: 701
        //          default: 664
        //        }
        //   700: return         
        //   701: getstatic       dev/nuker/pyro/f4N.c:Ldev/nuker/pyro/f58;
        //   704: goto            708
        //   707: athrow         
        //   708: invokevirtual   dev/nuker/pyro/f58.c:()I
        //   711: goto            715
        //   714: athrow         
        //   715: getstatic       dev/nuker/pyro/fc.c:I
        //   718: ifge            727
        //   721: ldc_w           -433516661
        //   724: goto            730
        //   727: ldc_w           323681542
        //   730: ldc_w           1738631045
        //   733: ixor           
        //   734: lookupswitch {
        //          -2121766898: 727
        //          1961597571: 760
        //          default: 4870
        //        }
        //   760: istore_2       
        //   761: aload_0        
        //   762: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //   765: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   768: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70143_R:F
        //   771: f2d            
        //   772: getstatic       dev/nuker/pyro/fc.0:I
        //   775: ifeq            784
        //   778: ldc_w           393352093
        //   781: goto            787
        //   784: ldc_w           1313212342
        //   787: ldc_w           -984058954
        //   790: ixor           
        //   791: lookupswitch {
        //          -1960938496: 816
        //          -768974805: 784
        //          default: 4882
        //        }
        //   816: aload_0        
        //   817: getfield        dev/nuker/pyro/f5x.1:Ldev/nuker/pyro/f0d;
        //   820: goto            824
        //   823: athrow         
        //   824: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //   827: goto            831
        //   830: athrow         
        //   831: checkcast       Ljava/lang/Double;
        //   834: goto            838
        //   837: athrow         
        //   838: invokevirtual   java/lang/Double.doubleValue:()D
        //   841: goto            845
        //   844: athrow         
        //   845: dcmpl          
        //   846: ifge            855
        //   849: ldc_w           453980218
        //   852: goto            858
        //   855: ldc_w           453980217
        //   858: ldc_w           -603861625
        //   861: ixor           
        //   862: tableswitch {
        //          -1910637702: 884
        //          -1910637701: 937
        //          default: 849
        //        }
        //   884: aload_0        
        //   885: getfield        dev/nuker/pyro/f5x.1:Ldev/nuker/pyro/f0a;
        //   888: goto            892
        //   891: athrow         
        //   892: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //   895: goto            899
        //   898: athrow         
        //   899: checkcast       Ljava/lang/Boolean;
        //   902: goto            906
        //   905: athrow         
        //   906: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   909: goto            913
        //   912: athrow         
        //   913: ifeq            943
        //   916: aload_0        
        //   917: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //   920: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   923: goto            927
        //   926: athrow         
        //   927: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184613_cA:()Z
        //   930: goto            934
        //   933: athrow         
        //   934: ifeq            943
        //   937: aload_0        
        //   938: iconst_0       
        //   939: putfield        dev/nuker/pyro/f5x.0:Z
        //   942: return         
        //   943: aload_0        
        //   944: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //   947: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   950: getstatic       dev/nuker/pyro/fc.1:I
        //   953: ifeq            962
        //   956: ldc_w           1787187985
        //   959: goto            965
        //   962: ldc_w           -1931872438
        //   965: ldc_w           1872803244
        //   968: ixor           
        //   969: lookupswitch {
        //          -1782144450: 962
        //          86435517: 4920
        //          default: 996
        //        }
        //   996: goto            1000
        //   999: athrow         
        //  1000: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_110143_aJ:()F
        //  1003: goto            1007
        //  1006: athrow         
        //  1007: aload_0        
        //  1008: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  1011: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1014: getstatic       dev/nuker/pyro/fc.c:I
        //  1017: ifge            1026
        //  1020: ldc_w           874176478
        //  1023: goto            1029
        //  1026: ldc_w           -1849273888
        //  1029: ldc_w           1233373554
        //  1032: ixor           
        //  1033: lookupswitch {
        //          -1999594135: 1026
        //          2107184812: 4934
        //          default: 1060
        //        }
        //  1060: goto            1064
        //  1063: athrow         
        //  1064: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_110139_bj:()F
        //  1067: goto            1071
        //  1070: athrow         
        //  1071: fadd           
        //  1072: f2d            
        //  1073: getstatic       dev/nuker/pyro/fc.0:I
        //  1076: ifeq            1085
        //  1079: ldc_w           879579302
        //  1082: goto            1088
        //  1085: ldc_w           1196282335
        //  1088: ldc_w           -67943958
        //  1091: ixor           
        //  1092: lookupswitch {
        //          -1128361931: 1120
        //          -811724468: 1085
        //          default: 4926
        //        }
        //  1120: aload_0        
        //  1121: getfield        dev/nuker/pyro/f5x.0:Ldev/nuker/pyro/f0d;
        //  1124: goto            1128
        //  1127: athrow         
        //  1128: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  1131: goto            1135
        //  1134: athrow         
        //  1135: checkcast       Ljava/lang/Double;
        //  1138: getstatic       dev/nuker/pyro/fc.1:I
        //  1141: ifeq            1150
        //  1144: ldc_w           1023163918
        //  1147: goto            1153
        //  1150: ldc_w           656276389
        //  1153: ldc_w           -755219312
        //  1156: ixor           
        //  1157: lookupswitch {
        //          -301958498: 1150
        //          -169754827: 1184
        //          default: 4818
        //        }
        //  1184: goto            1188
        //  1187: athrow         
        //  1188: invokevirtual   java/lang/Double.doubleValue:()D
        //  1191: goto            1195
        //  1194: athrow         
        //  1195: dcmpg          
        //  1196: ifge            1205
        //  1199: ldc_w           417494914
        //  1202: goto            1208
        //  1205: ldc_w           417494925
        //  1208: ldc_w           -1031473339
        //  1211: ixor           
        //  1212: tableswitch {
        //          -1261633138: 1236
        //          -1261633137: 1429
        //          default: 1199
        //        }
        //  1236: iload_2        
        //  1237: ifle            1429
        //  1240: getstatic       dev/nuker/pyro/fc.0:I
        //  1243: ifeq            1252
        //  1246: ldc_w           -1480809509
        //  1249: goto            1255
        //  1252: ldc_w           -1159633506
        //  1255: ldc_w           -748059897
        //  1258: ixor           
        //  1259: lookupswitch {
        //          1770579609: 1284
        //          1960124636: 1252
        //          default: 4874
        //        }
        //  1284: aload_0        
        //  1285: getfield        dev/nuker/pyro/f5x.0:Z
        //  1288: ifeq            1319
        //  1291: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //  1294: ldc_w           "\u23fa\u14bc\u8ade\ub1ce\ucfb5\uedc6\ub22a\ue6f1\udb44\uef94\ua747\u1e68\ue1d8\uc7a5\u8748\u895e\u57a8\u7739\ubf22\uc675\u2b73\uc23f\u6a2d\u2f42\ud1ec\u35b0\u7d24\u89db\u8208\u8aec\u8480\ufb3e\u70f3\u980f\u1dbb\uf154\u4979\u8845\uc882\uf950\ub6eb\u41f6\ub9cc\ub15c\u4a05\u8ac0"
        //  1297: goto            1301
        //  1300: athrow         
        //  1301: invokestatic    invokestatic   !!! ERROR
        //  1304: goto            1308
        //  1307: athrow         
        //  1308: goto            1312
        //  1311: athrow         
        //  1312: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //  1315: goto            1319
        //  1318: athrow         
        //  1319: aload_0        
        //  1320: getfield        dev/nuker/pyro/f5x.2:Ldev/nuker/pyro/f0a;
        //  1323: goto            1327
        //  1326: athrow         
        //  1327: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1330: goto            1334
        //  1333: athrow         
        //  1334: checkcast       Ljava/lang/Boolean;
        //  1337: goto            1341
        //  1340: athrow         
        //  1341: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1344: goto            1348
        //  1347: athrow         
        //  1348: ifne            1423
        //  1351: getstatic       dev/nuker/pyro/fc.0:I
        //  1354: ifeq            1363
        //  1357: ldc_w           1870946701
        //  1360: goto            1366
        //  1363: ldc_w           -2128638282
        //  1366: ldc_w           -824363948
        //  1369: ixor           
        //  1370: lookupswitch {
        //          -1587980839: 4922
        //          -592665831: 1363
        //          default: 1396
        //        }
        //  1396: aload_0        
        //  1397: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/fw;
        //  1400: iconst_0       
        //  1401: goto            1405
        //  1404: athrow         
        //  1405: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1408: goto            1412
        //  1411: athrow         
        //  1412: goto            1416
        //  1415: athrow         
        //  1416: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //  1419: goto            1423
        //  1422: athrow         
        //  1423: aload_0        
        //  1424: iconst_0       
        //  1425: putfield        dev/nuker/pyro/f5x.0:Z
        //  1428: return         
        //  1429: getstatic       dev/nuker/pyro/fc.0:I
        //  1432: ifeq            1441
        //  1435: ldc_w           -1072176160
        //  1438: goto            1444
        //  1441: ldc_w           878020187
        //  1444: ldc_w           606301427
        //  1447: ixor           
        //  1448: lookupswitch {
        //          -466317549: 4836
        //          2016888707: 1441
        //          default: 1476
        //        }
        //  1476: aload_0        
        //  1477: getfield        dev/nuker/pyro/f5x.0:Ldev/nuker/pyro/f0a;
        //  1480: getstatic       dev/nuker/pyro/fc.c:I
        //  1483: ifge            1492
        //  1486: ldc_w           2103243770
        //  1489: goto            1495
        //  1492: ldc_w           -1800013850
        //  1495: ldc_w           -314077461
        //  1498: ixor           
        //  1499: lookupswitch {
        //          -1877246703: 4942
        //          -1270280741: 1492
        //          default: 1524
        //        }
        //  1524: goto            1528
        //  1527: athrow         
        //  1528: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1531: goto            1535
        //  1534: athrow         
        //  1535: checkcast       Ljava/lang/Boolean;
        //  1538: goto            1542
        //  1541: athrow         
        //  1542: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1545: goto            1549
        //  1548: athrow         
        //  1549: ifeq            2543
        //  1552: iload_2        
        //  1553: ifle            1562
        //  1556: ldc_w           38543581
        //  1559: goto            1565
        //  1562: ldc_w           38543580
        //  1565: ldc_w           1975464589
        //  1568: ixor           
        //  1569: tableswitch {
        //          -270130016: 1592
        //          -270130015: 2543
        //          default: 1556
        //        }
        //  1592: getstatic       dev/nuker/pyro/fc.c:I
        //  1595: ifge            1604
        //  1598: ldc_w           2111018467
        //  1601: goto            1607
        //  1604: ldc_w           -1747054718
        //  1607: ldc_w           -1610338840
        //  1610: ixor           
        //  1611: lookupswitch {
        //          -573065205: 1604
        //          937042538: 1636
        //          default: 4908
        //        }
        //  1636: aload_0        
        //  1637: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  1640: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1643: getfield        net/minecraft/client/multiplayer/WorldClient.field_72996_f:Ljava/util/List;
        //  1646: goto            1650
        //  1649: athrow         
        //  1650: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1655: goto            1659
        //  1658: athrow         
        //  1659: astore_3       
        //  1660: aload_3        
        //  1661: getstatic       dev/nuker/pyro/fc.0:I
        //  1664: ifeq            1673
        //  1667: ldc_w           -1180279884
        //  1670: goto            1676
        //  1673: ldc_w           -479521198
        //  1676: ldc_w           -1616143558
        //  1679: ixor           
        //  1680: lookupswitch {
        //          -1685087493: 1673
        //          638435470: 4868
        //          default: 1708
        //        }
        //  1708: goto            1712
        //  1711: athrow         
        //  1712: invokeinterface java/util/Iterator.hasNext:()Z
        //  1717: goto            1721
        //  1720: athrow         
        //  1721: ifeq            1730
        //  1724: ldc_w           475319426
        //  1727: goto            1733
        //  1730: ldc_w           475319425
        //  1733: ldc_w           920257755
        //  1736: ixor           
        //  1737: tableswitch {
        //          1428000946: 1760
        //          1428000947: 2543
        //          default: 1724
        //        }
        //  1760: getstatic       dev/nuker/pyro/fc.1:I
        //  1763: ifeq            1772
        //  1766: ldc_w           -741679811
        //  1769: goto            1775
        //  1772: ldc_w           1317085444
        //  1775: ldc_w           -2119978497
        //  1778: ixor           
        //  1779: lookupswitch {
        //          563466633: 1772
        //          1382640834: 4854
        //          default: 1804
        //        }
        //  1804: aload_3        
        //  1805: goto            1809
        //  1808: athrow         
        //  1809: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1814: goto            1818
        //  1817: athrow         
        //  1818: checkcast       Lnet/minecraft/entity/Entity;
        //  1821: astore          4
        //  1823: aload           4
        //  1825: instanceof      Lnet/minecraft/entity/item/EntityEnderCrystal;
        //  1828: ifeq            2540
        //  1831: getstatic       dev/nuker/pyro/fc.1:I
        //  1834: ifeq            1843
        //  1837: ldc_w           -1476125560
        //  1840: goto            1846
        //  1843: ldc_w           422066433
        //  1846: ldc_w           451573738
        //  1849: ixor           
        //  1850: lookupswitch {
        //          -1292997790: 4892
        //          -195460576: 1843
        //          default: 1876
        //        }
        //  1876: aload           4
        //  1878: checkcast       Lnet/minecraft/entity/item/EntityEnderCrystal;
        //  1881: aload_0        
        //  1882: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  1885: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1888: goto            1892
        //  1891: athrow         
        //  1892: invokestatic    dev/nuker/pyro/fb7.c:(Lnet/minecraft/entity/item/EntityEnderCrystal;Lnet/minecraft/entity/EntityLivingBase;)F
        //  1895: goto            1899
        //  1898: athrow         
        //  1899: getstatic       dev/nuker/pyro/fc.0:I
        //  1902: ifeq            1911
        //  1905: ldc_w           299672119
        //  1908: goto            1914
        //  1911: ldc_w           -1845736546
        //  1914: ldc_w           -1190770008
        //  1917: ixor           
        //  1918: lookupswitch {
        //          -1462048609: 1911
        //          687472950: 1944
        //          default: 4930
        //        }
        //  1944: aload_0        
        //  1945: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  1948: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1951: goto            1955
        //  1954: athrow         
        //  1955: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_110143_aJ:()F
        //  1958: goto            1962
        //  1961: athrow         
        //  1962: aload_0        
        //  1963: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  1966: getstatic       dev/nuker/pyro/fc.0:I
        //  1969: ifeq            1978
        //  1972: ldc_w           160992271
        //  1975: goto            1981
        //  1978: ldc_w           -1010645959
        //  1981: ldc_w           -891407463
        //  1984: ixor           
        //  1985: lookupswitch {
        //          -1018773610: 4848
        //          1120095718: 1978
        //          default: 2012
        //        }
        //  2012: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2015: getstatic       dev/nuker/pyro/fc.c:I
        //  2018: ifge            2027
        //  2021: ldc_w           -431406050
        //  2024: goto            2030
        //  2027: ldc_w           -57897189
        //  2030: ldc_w           -1725487549
        //  2033: ixor           
        //  2034: lookupswitch {
        //          1525092106: 2027
        //          2137940573: 4844
        //          default: 2060
        //        }
        //  2060: goto            2064
        //  2063: athrow         
        //  2064: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_110139_bj:()F
        //  2067: goto            2071
        //  2070: athrow         
        //  2071: fadd           
        //  2072: fcmpl          
        //  2073: iflt            2540
        //  2076: getstatic       dev/nuker/pyro/fc.1:I
        //  2079: ifeq            2088
        //  2082: ldc_w           -514389597
        //  2085: goto            2091
        //  2088: ldc_w           1674796135
        //  2091: ldc_w           788992820
        //  2094: ixor           
        //  2095: lookupswitch {
        //          -833611113: 4894
        //          2105595794: 2088
        //          default: 2120
        //        }
        //  2120: aload           4
        //  2122: getfield        net/minecraft/entity/Entity.field_70128_L:Z
        //  2125: ifne            2134
        //  2128: ldc_w           -776148339
        //  2131: goto            2137
        //  2134: ldc_w           -776148340
        //  2137: ldc_w           1647384341
        //  2140: ixor           
        //  2141: tableswitch {
        //          1729887024: 2164
        //          1729887025: 2540
        //          default: 2128
        //        }
        //  2164: aload_0        
        //  2165: getstatic       dev/nuker/pyro/fc.c:I
        //  2168: ifge            2177
        //  2171: ldc_w           1966946838
        //  2174: goto            2180
        //  2177: ldc_w           -308608190
        //  2180: ldc_w           1971410171
        //  2183: ixor           
        //  2184: lookupswitch {
        //          -1743104071: 2212
        //          12349165: 2177
        //          default: 4880
        //        }
        //  2212: getfield        dev/nuker/pyro/f5x.0:Z
        //  2215: ifeq            2292
        //  2218: getstatic       dev/nuker/pyro/fc.0:I
        //  2221: ifeq            2230
        //  2224: ldc_w           -436431479
        //  2227: goto            2233
        //  2230: ldc_w           737103280
        //  2233: ldc_w           2031098491
        //  2236: ixor           
        //  2237: lookupswitch {
        //          -1662218254: 4924
        //          -564162673: 2230
        //          default: 2264
        //        }
        //  2264: getstatic       dev/nuker/pyro/Pyro.INSTANCE:Ldev/nuker/pyro/Pyro;
        //  2267: ldc_w           "\u23fa\u14bc\u8ade\ub1ce\ucfb5\uedc6\ub22a\ue6f1\udb44\uef94\ua747\u1e68\ue1d8\uc7a5\u8748\u895e\u57a8\u7739\ubf22\uc675\u2b73\uc23f\u6a2d\u2f42\ud1ec\u35b0\u7d24\u89db\u8204\u8aec\u8495\ufb37\u70e4\u9813\u1df2\uf149\u4972\u8814\uc898\uf95f\ub6b9\u41f2\ub9cf\ub119\u4a0e\u8ada\u7c6d\uce50\u7f5c\uecae\ue6e0\u16cb\uee77\u359e\u40d8\ue19d\u0a13\u86e1\u1bc5\u0930\u7735\u7283\uc7d8\ub9eb\u9caf\u6a31\ue2f2\ud009\ua73d\u23bf\u89d7\u4fa5\u8b45\u1614\ua5ab\u70ec\u55a3\u1c16\u63ca\u17eb\u8818\u052f\uf8fb\u2474\u1f25"
        //  2270: goto            2274
        //  2273: athrow         
        //  2274: invokestatic    invokestatic   !!! ERROR
        //  2277: goto            2281
        //  2280: athrow         
        //  2281: goto            2285
        //  2284: athrow         
        //  2285: invokevirtual   dev/nuker/pyro/Pyro.sendMessage:(Ljava/lang/String;)V
        //  2288: goto            2292
        //  2291: athrow         
        //  2292: getstatic       dev/nuker/pyro/fc.1:I
        //  2295: ifeq            2304
        //  2298: ldc_w           1892169113
        //  2301: goto            2307
        //  2304: ldc_w           -1922266690
        //  2307: ldc_w           -1735049215
        //  2310: ixor           
        //  2311: lookupswitch {
        //          -396528232: 2304
        //          368691647: 2336
        //          default: 4936
        //        }
        //  2336: aload_0        
        //  2337: getfield        dev/nuker/pyro/f5x.2:Ldev/nuker/pyro/f0a;
        //  2340: goto            2344
        //  2343: athrow         
        //  2344: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  2347: goto            2351
        //  2350: athrow         
        //  2351: checkcast       Ljava/lang/Boolean;
        //  2354: getstatic       dev/nuker/pyro/fc.c:I
        //  2357: ifge            2366
        //  2360: ldc_w           1601765671
        //  2363: goto            2369
        //  2366: ldc_w           -1702563502
        //  2369: ldc_w           -681576618
        //  2372: ixor           
        //  2373: lookupswitch {
        //          -2010712463: 2366
        //          1306199556: 2400
        //          default: 4820
        //        }
        //  2400: goto            2404
        //  2403: athrow         
        //  2404: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2407: goto            2411
        //  2410: athrow         
        //  2411: ifne            2441
        //  2414: aload_0        
        //  2415: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/fw;
        //  2418: iconst_0       
        //  2419: goto            2423
        //  2422: athrow         
        //  2423: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2426: goto            2430
        //  2429: athrow         
        //  2430: goto            2434
        //  2433: athrow         
        //  2434: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //  2437: goto            2441
        //  2440: athrow         
        //  2441: getstatic       dev/nuker/pyro/fc.c:I
        //  2444: ifge            2453
        //  2447: ldc_w           -1827291873
        //  2450: goto            2456
        //  2453: ldc_w           -442697851
        //  2456: ldc_w           -908882622
        //  2459: ixor           
        //  2460: lookupswitch {
        //          743406279: 2488
        //          1522937949: 2453
        //          default: 4832
        //        }
        //  2488: aload_0        
        //  2489: iconst_0       
        //  2490: getstatic       dev/nuker/pyro/fc.0:I
        //  2493: ifeq            2502
        //  2496: ldc_w           1893237517
        //  2499: goto            2505
        //  2502: ldc_w           -169924800
        //  2505: ldc_w           -1705885775
        //  2508: ixor           
        //  2509: lookupswitch {
        //          -360006468: 4840
        //          1787711336: 2502
        //          default: 2536
        //        }
        //  2536: putfield        dev/nuker/pyro/f5x.0:Z
        //  2539: return         
        //  2540: goto            1660
        //  2543: aload_0        
        //  2544: iconst_1       
        //  2545: putfield        dev/nuker/pyro/f5x.0:Z
        //  2548: aload_0        
        //  2549: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  2552: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //  2555: instanceof      Lnet/minecraft/client/gui/inventory/GuiContainer;
        //  2558: ifeq            2621
        //  2561: aload_0        
        //  2562: getstatic       dev/nuker/pyro/fc.1:I
        //  2565: ifeq            2574
        //  2568: ldc_w           -1616615117
        //  2571: goto            2577
        //  2574: ldc_w           -1230011608
        //  2577: ldc_w           902622978
        //  2580: ixor           
        //  2581: lookupswitch {
        //          -1920435555: 2574
        //          -1435990479: 4822
        //          default: 2608
        //        }
        //  2608: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  2611: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //  2614: instanceof      Lnet/minecraft/client/gui/inventory/GuiInventory;
        //  2617: ifne            2621
        //  2620: return         
        //  2621: aload_0        
        //  2622: getfield        dev/nuker/pyro/f5x.c:Z
        //  2625: ifne            2643
        //  2628: aload_0        
        //  2629: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/fbu;
        //  2632: goto            2636
        //  2635: athrow         
        //  2636: invokevirtual   dev/nuker/pyro/fbu.0:()V
        //  2639: goto            2643
        //  2642: athrow         
        //  2643: getstatic       dev/nuker/pyro/fc.1:I
        //  2646: ifeq            2655
        //  2649: ldc_w           -120862408
        //  2652: goto            2658
        //  2655: ldc_w           374425093
        //  2658: ldc_w           170592448
        //  2661: ixor           
        //  2662: lookupswitch {
        //          -220151304: 2655
        //          477777605: 2688
        //          default: 4824
        //        }
        //  2688: aload_0        
        //  2689: getstatic       dev/nuker/pyro/fc.c:I
        //  2692: ifge            2701
        //  2695: ldc_w           -1580501087
        //  2698: goto            2704
        //  2701: ldc_w           2045200348
        //  2704: ldc_w           -1894767654
        //  2707: ixor           
        //  2708: lookupswitch {
        //          -566372497: 2701
        //          786125947: 4838
        //          default: 2736
        //        }
        //  2736: aload_0        
        //  2737: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  2740: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2743: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //  2746: goto            2750
        //  2749: athrow         
        //  2750: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184586_b:(Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
        //  2753: goto            2757
        //  2756: athrow         
        //  2757: goto            2761
        //  2760: athrow         
        //  2761: invokevirtual   dev/nuker/pyro/f5x.c:(Lnet/minecraft/item/ItemStack;)Z
        //  2764: goto            2768
        //  2767: athrow         
        //  2768: ifeq            2777
        //  2771: ldc_w           -156446875
        //  2774: goto            2780
        //  2777: ldc_w           -156446876
        //  2780: ldc_w           887921227
        //  2783: ixor           
        //  2784: tableswitch {
        //          -2071942564: 2808
        //          -2071942563: 2809
        //          default: 2771
        //        }
        //  2808: return         
        //  2809: getstatic       dev/nuker/pyro/fc.1:I
        //  2812: ifeq            2821
        //  2815: ldc_w           22978721
        //  2818: goto            2824
        //  2821: ldc_w           1620969752
        //  2824: ldc_w           -1664144917
        //  2827: ixor           
        //  2828: lookupswitch {
        //          -1651406518: 2821
        //          -61792013: 2856
        //          default: 4876
        //        }
        //  2856: aload_0        
        //  2857: getstatic       dev/nuker/pyro/fc.0:I
        //  2860: ifeq            2869
        //  2863: ldc_w           -1784192530
        //  2866: goto            2872
        //  2869: ldc_w           575781196
        //  2872: ldc_w           1436910955
        //  2875: ixor           
        //  2876: lookupswitch {
        //          -1073552251: 4906
        //          1793053534: 2869
        //          default: 2904
        //        }
        //  2904: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  2907: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2910: getstatic       dev/nuker/pyro/fc.0:I
        //  2913: ifeq            2922
        //  2916: ldc_w           777523870
        //  2919: goto            2925
        //  2922: ldc_w           -766588736
        //  2925: ldc_w           348914531
        //  2928: ixor           
        //  2929: lookupswitch {
        //          203924717: 2922
        //          982782461: 4846
        //          default: 2956
        //        }
        //  2956: goto            2960
        //  2959: athrow         
        //  2960: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184812_l_:()Z
        //  2963: goto            2967
        //  2966: athrow         
        //  2967: ifeq            2971
        //  2970: return         
        //  2971: bipush          44
        //  2973: dup            
        //  2974: istore_3       
        //  2975: istore          4
        //  2977: iload           4
        //  2979: bipush          9
        //  2981: if_icmplt       4817
        //  2984: getstatic       dev/nuker/pyro/fc.c:I
        //  2987: ifge            2996
        //  2990: ldc_w           -891817826
        //  2993: goto            2999
        //  2996: ldc_w           -2106602582
        //  2999: ldc_w           -1799055695
        //  3002: ixor           
        //  3003: lookupswitch {
        //          -84965568: 2996
        //          1578329647: 4862
        //          default: 3028
        //        }
        //  3028: aload_0        
        //  3029: aload_0        
        //  3030: getstatic       dev/nuker/pyro/fc.1:I
        //  3033: ifeq            3042
        //  3036: ldc_w           226761208
        //  3039: goto            3045
        //  3042: ldc_w           -1465478292
        //  3045: ldc_w           1698139361
        //  3048: ixor           
        //  3049: lookupswitch {
        //          -846127219: 3076
        //          1756599577: 3042
        //          default: 4888
        //        }
        //  3076: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  3079: getstatic       dev/nuker/pyro/fc.0:I
        //  3082: ifeq            3091
        //  3085: ldc_w           1334661407
        //  3088: goto            3094
        //  3091: ldc_w           -1925777335
        //  3094: ldc_w           -164656693
        //  3097: ixor           
        //  3098: lookupswitch {
        //          -1180509996: 3091
        //          2065265026: 3124
        //          default: 4860
        //        }
        //  3124: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3127: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71069_bz:Lnet/minecraft/inventory/Container;
        //  3130: getstatic       dev/nuker/pyro/fc.c:I
        //  3133: ifge            3142
        //  3136: ldc_w           1777026828
        //  3139: goto            3145
        //  3142: ldc_w           -1580844552
        //  3145: ldc_w           1373909833
        //  3148: ixor           
        //  3149: lookupswitch {
        //          -1951293571: 3142
        //          940536901: 4858
        //          default: 3176
        //        }
        //  3176: iload_3        
        //  3177: goto            3181
        //  3180: athrow         
        //  3181: invokevirtual   net/minecraft/inventory/Container.func_75139_a:(I)Lnet/minecraft/inventory/Slot;
        //  3184: goto            3188
        //  3187: athrow         
        //  3188: goto            3192
        //  3191: athrow         
        //  3192: invokevirtual   net/minecraft/inventory/Slot.func_75211_c:()Lnet/minecraft/item/ItemStack;
        //  3195: goto            3199
        //  3198: athrow         
        //  3199: goto            3203
        //  3202: athrow         
        //  3203: invokevirtual   dev/nuker/pyro/f5x.c:(Lnet/minecraft/item/ItemStack;)Z
        //  3206: goto            3210
        //  3209: athrow         
        //  3210: ifeq            4808
        //  3213: aload_0        
        //  3214: iconst_1       
        //  3215: getstatic       dev/nuker/pyro/fc.0:I
        //  3218: ifeq            3227
        //  3221: ldc_w           1506137101
        //  3224: goto            3230
        //  3227: ldc_w           -939870326
        //  3230: ldc_w           638562458
        //  3233: ixor           
        //  3234: lookupswitch {
        //          1181175487: 3227
        //          2143970455: 4828
        //          default: 3260
        //        }
        //  3260: putfield        dev/nuker/pyro/f5x.c:Z
        //  3263: aload_0        
        //  3264: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/fbu;
        //  3267: getstatic       dev/nuker/pyro/fc.c:I
        //  3270: ifge            3279
        //  3273: ldc_w           837736054
        //  3276: goto            3282
        //  3279: ldc_w           1136782510
        //  3282: ldc_w           -282043776
        //  3285: ixor           
        //  3286: lookupswitch {
        //          -1393445330: 3312
        //          -555840266: 3279
        //          default: 4826
        //        }
        //  3312: aload_0        
        //  3313: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0d;
        //  3316: getstatic       dev/nuker/pyro/fc.1:I
        //  3319: ifeq            3328
        //  3322: ldc_w           580040114
        //  3325: goto            3331
        //  3328: ldc_w           1744644757
        //  3331: ldc_w           -1365168326
        //  3334: ixor           
        //  3335: lookupswitch {
        //          -1942775160: 4834
        //          1894970469: 3328
        //          default: 3360
        //        }
        //  3360: goto            3364
        //  3363: athrow         
        //  3364: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  3367: goto            3371
        //  3370: athrow         
        //  3371: checkcast       Ljava/lang/Double;
        //  3374: goto            3378
        //  3377: athrow         
        //  3378: invokevirtual   java/lang/Double.doubleValue:()D
        //  3381: goto            3385
        //  3384: athrow         
        //  3385: ldc2_w          1000.0
        //  3388: dmul           
        //  3389: goto            3393
        //  3392: athrow         
        //  3393: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //  3396: goto            3400
        //  3399: athrow         
        //  3400: ifeq            3409
        //  3403: ldc_w           -278833281
        //  3406: goto            3412
        //  3409: ldc_w           -278833282
        //  3412: ldc_w           -608466403
        //  3415: ixor           
        //  3416: tableswitch {
        //          1773517508: 3440
        //          1773517509: 3876
        //          default: 3403
        //        }
        //  3440: aload_0        
        //  3441: getstatic       dev/nuker/pyro/fc.c:I
        //  3444: ifge            3453
        //  3447: ldc_w           321868787
        //  3450: goto            3456
        //  3453: ldc_w           998627558
        //  3456: ldc_w           -524921547
        //  3459: ixor           
        //  3460: lookupswitch {
        //          -374393096: 3453
        //          -208075066: 4910
        //          default: 3488
        //        }
        //  3488: aload_0        
        //  3489: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  3492: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3495: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  3498: getstatic       dev/nuker/pyro/fc.0:I
        //  3501: ifeq            3510
        //  3504: ldc_w           -1683804144
        //  3507: goto            3513
        //  3510: ldc_w           1448902779
        //  3513: ldc_w           188398472
        //  3516: ixor           
        //  3517: lookupswitch {
        //          -1868985448: 3510
        //          1566981107: 3544
        //          default: 4886
        //        }
        //  3544: goto            3548
        //  3547: athrow         
        //  3548: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70445_o:()Lnet/minecraft/item/ItemStack;
        //  3551: goto            3555
        //  3554: athrow         
        //  3555: goto            3559
        //  3558: athrow         
        //  3559: invokevirtual   dev/nuker/pyro/f5x.c:(Lnet/minecraft/item/ItemStack;)Z
        //  3562: goto            3566
        //  3565: athrow         
        //  3566: ifne            3876
        //  3569: aload_0        
        //  3570: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  3573: getstatic       dev/nuker/pyro/fc.1:I
        //  3576: ifeq            3585
        //  3579: ldc_w           -496837462
        //  3582: goto            3588
        //  3585: ldc_w           -839121800
        //  3588: ldc_w           1769687105
        //  3591: ixor           
        //  3592: lookupswitch {
        //          -1961257749: 3585
        //          -1534636999: 3620
        //          default: 4896
        //        }
        //  3620: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  3623: iconst_0       
        //  3624: getstatic       dev/nuker/pyro/fc.c:I
        //  3627: ifge            3636
        //  3630: ldc_w           -2025431672
        //  3633: goto            3639
        //  3636: ldc_w           1186809979
        //  3639: ldc_w           637680447
        //  3642: ixor           
        //  3643: lookupswitch {
        //          -1589352777: 3636
        //          1623159620: 3668
        //          default: 4884
        //        }
        //  3668: iload_3        
        //  3669: iconst_0       
        //  3670: getstatic       net/minecraft/inventory/ClickType.PICKUP:Lnet/minecraft/inventory/ClickType;
        //  3673: getstatic       dev/nuker/pyro/fc.1:I
        //  3676: ifeq            3685
        //  3679: ldc_w           -850238557
        //  3682: goto            3688
        //  3685: ldc_w           -2078133785
        //  3688: ldc_w           -899142784
        //  3691: ixor           
        //  3692: lookupswitch {
        //          121260067: 4904
        //          1498980410: 3685
        //          default: 3720
        //        }
        //  3720: aload_0        
        //  3721: getstatic       dev/nuker/pyro/fc.0:I
        //  3724: ifeq            3733
        //  3727: ldc_w           -1245300658
        //  3730: goto            3736
        //  3733: ldc_w           1929863517
        //  3736: ldc_w           470469561
        //  3739: ixor           
        //  3740: lookupswitch {
        //          -1446185993: 4842
        //          1306716303: 3733
        //          default: 3768
        //        }
        //  3768: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  3771: getstatic       dev/nuker/pyro/fc.c:I
        //  3774: ifge            3783
        //  3777: ldc_w           -1276340127
        //  3780: goto            3786
        //  3783: ldc_w           1827732018
        //  3786: ldc_w           1371327813
        //  3789: ixor           
        //  3790: lookupswitch {
        //          -577390058: 3783
        //          -498051804: 4902
        //          default: 3816
        //        }
        //  3816: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  3819: getstatic       dev/nuker/pyro/fc.0:I
        //  3822: ifeq            3831
        //  3825: ldc_w           -1369106559
        //  3828: goto            3834
        //  3831: ldc_w           -862816443
        //  3834: ldc_w           1455323023
        //  3837: ixor           
        //  3838: lookupswitch {
        //          -119840754: 4898
        //          294813484: 3831
        //          default: 3864
        //        }
        //  3864: goto            3868
        //  3867: athrow         
        //  3868: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_187098_a:(IIILnet/minecraft/inventory/ClickType;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;
        //  3871: goto            3875
        //  3874: athrow         
        //  3875: pop            
        //  3876: aload_0        
        //  3877: getstatic       dev/nuker/pyro/fc.1:I
        //  3880: ifeq            3889
        //  3883: ldc_w           2090134662
        //  3886: goto            3892
        //  3889: ldc_w           -1420149092
        //  3892: ldc_w           -757679539
        //  3895: ixor           
        //  3896: lookupswitch {
        //          -1371384117: 4866
        //          -136609291: 3889
        //          default: 3924
        //        }
        //  3924: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/fbu;
        //  3927: aload_0        
        //  3928: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0d;
        //  3931: goto            3935
        //  3934: athrow         
        //  3935: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  3938: goto            3942
        //  3941: athrow         
        //  3942: checkcast       Ljava/lang/Double;
        //  3945: goto            3949
        //  3948: athrow         
        //  3949: invokevirtual   java/lang/Double.doubleValue:()D
        //  3952: goto            3956
        //  3955: athrow         
        //  3956: ldc2_w          2000.0
        //  3959: dmul           
        //  3960: goto            3964
        //  3963: athrow         
        //  3964: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //  3967: goto            3971
        //  3970: athrow         
        //  3971: ifeq            4390
        //  3974: getstatic       dev/nuker/pyro/fc.c:I
        //  3977: ifge            3986
        //  3980: ldc_w           1587027156
        //  3983: goto            3989
        //  3986: ldc_w           1720700478
        //  3989: ldc_w           -56191578
        //  3992: ixor           
        //  3993: lookupswitch {
        //          -1708565608: 4020
        //          -1572959886: 3986
        //          default: 4878
        //        }
        //  4020: aload_0        
        //  4021: aload_0        
        //  4022: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  4025: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4028: getstatic       dev/nuker/pyro/fc.0:I
        //  4031: ifeq            4040
        //  4034: ldc_w           1983391011
        //  4037: goto            4043
        //  4040: ldc_w           498040791
        //  4043: ldc_w           -553862396
        //  4046: ixor           
        //  4047: lookupswitch {
        //          -1463509465: 4040
        //          -1017920301: 4072
        //          default: 4914
        //        }
        //  4072: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  4075: goto            4079
        //  4078: athrow         
        //  4079: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70445_o:()Lnet/minecraft/item/ItemStack;
        //  4082: goto            4086
        //  4085: athrow         
        //  4086: goto            4090
        //  4089: athrow         
        //  4090: invokevirtual   dev/nuker/pyro/f5x.c:(Lnet/minecraft/item/ItemStack;)Z
        //  4093: goto            4097
        //  4096: athrow         
        //  4097: ifeq            4390
        //  4100: aload_0        
        //  4101: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  4104: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  4107: iconst_0       
        //  4108: bipush          45
        //  4110: iconst_0       
        //  4111: getstatic       net/minecraft/inventory/ClickType.PICKUP:Lnet/minecraft/inventory/ClickType;
        //  4114: aload_0        
        //  4115: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  4118: getstatic       dev/nuker/pyro/fc.1:I
        //  4121: ifeq            4130
        //  4124: ldc_w           725442560
        //  4127: goto            4133
        //  4130: ldc_w           -2124702285
        //  4133: ldc_w           -309014113
        //  4136: ixor           
        //  4137: lookupswitch {
        //          -961957473: 4130
        //          1825524780: 4164
        //          default: 4900
        //        }
        //  4164: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4167: getstatic       dev/nuker/pyro/fc.c:I
        //  4170: ifge            4179
        //  4173: ldc_w           -1600695108
        //  4176: goto            4182
        //  4179: ldc_w           1456013965
        //  4182: ldc_w           22864073
        //  4185: ixor           
        //  4186: lookupswitch {
        //          -1580485515: 4179
        //          1469440580: 4212
        //          default: 4932
        //        }
        //  4212: goto            4216
        //  4215: athrow         
        //  4216: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_187098_a:(IIILnet/minecraft/inventory/ClickType;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;
        //  4219: goto            4223
        //  4222: athrow         
        //  4223: pop            
        //  4224: aload_0        
        //  4225: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  4228: getstatic       dev/nuker/pyro/fc.1:I
        //  4231: ifeq            4240
        //  4234: ldc_w           879391170
        //  4237: goto            4243
        //  4240: ldc_w           815491366
        //  4243: ldc_w           -661474138
        //  4246: ixor           
        //  4247: lookupswitch {
        //          -402006656: 4272
        //          -319240860: 4240
        //          default: 4938
        //        }
        //  4272: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4275: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  4278: goto            4282
        //  4281: athrow         
        //  4282: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70445_o:()Lnet/minecraft/item/ItemStack;
        //  4285: goto            4289
        //  4288: athrow         
        //  4289: goto            4293
        //  4292: athrow         
        //  4293: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //  4296: goto            4300
        //  4299: athrow         
        //  4300: ifeq            4309
        //  4303: ldc_w           1042969804
        //  4306: goto            4312
        //  4309: ldc_w           1042969805
        //  4312: ldc_w           -852059094
        //  4315: ixor           
        //  4316: tableswitch {
        //          -432418356: 4340
        //          -432418355: 4390
        //          default: 4303
        //        }
        //  4340: getstatic       dev/nuker/pyro/fc.0:I
        //  4343: ifeq            4352
        //  4346: ldc_w           1310509117
        //  4349: goto            4355
        //  4352: ldc_w           -21963010
        //  4355: ldc_w           -220438249
        //  4358: ixor           
        //  4359: lookupswitch {
        //          -1128224470: 4352
        //          208453609: 4384
        //          default: 4850
        //        }
        //  4384: aload_0        
        //  4385: iconst_0       
        //  4386: putfield        dev/nuker/pyro/f5x.c:Z
        //  4389: return         
        //  4390: aload_0        
        //  4391: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/fbu;
        //  4394: getstatic       dev/nuker/pyro/fc.c:I
        //  4397: ifge            4406
        //  4400: ldc_w           -1950380214
        //  4403: goto            4409
        //  4406: ldc_w           1543626115
        //  4409: ldc_w           1062759290
        //  4412: ixor           
        //  4413: lookupswitch {
        //          -1441310957: 4406
        //          -1259871184: 4856
        //          default: 4440
        //        }
        //  4440: aload_0        
        //  4441: getfield        dev/nuker/pyro/f5x.c:Ldev/nuker/pyro/f0d;
        //  4444: goto            4448
        //  4447: athrow         
        //  4448: invokevirtual   dev/nuker/pyro/f0d.3:()Ljava/lang/Object;
        //  4451: goto            4455
        //  4454: athrow         
        //  4455: checkcast       Ljava/lang/Double;
        //  4458: goto            4462
        //  4461: athrow         
        //  4462: invokevirtual   java/lang/Double.doubleValue:()D
        //  4465: goto            4469
        //  4468: athrow         
        //  4469: ldc2_w          3000.0
        //  4472: dmul           
        //  4473: goto            4477
        //  4476: athrow         
        //  4477: invokevirtual   dev/nuker/pyro/fbu.c:(D)Z
        //  4480: goto            4484
        //  4483: athrow         
        //  4484: ifeq            4493
        //  4487: ldc_w           611666879
        //  4490: goto            4496
        //  4493: ldc_w           611666878
        //  4496: ldc_w           235150041
        //  4499: ixor           
        //  4500: tableswitch {
        //          1424138956: 4524
        //          1424138957: 4808
        //          default: 4487
        //        }
        //  4524: aload_0        
        //  4525: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  4528: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4531: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  4534: goto            4538
        //  4537: athrow         
        //  4538: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70445_o:()Lnet/minecraft/item/ItemStack;
        //  4541: goto            4545
        //  4544: athrow         
        //  4545: getstatic       dev/nuker/pyro/fc.0:I
        //  4548: ifeq            4557
        //  4551: ldc_w           520483113
        //  4554: goto            4560
        //  4557: ldc_w           804340021
        //  4560: ldc_w           -1469513738
        //  4563: ixor           
        //  4564: lookupswitch {
        //          -1932233008: 4557
        //          -1217589537: 4916
        //          default: 4592
        //        }
        //  4592: goto            4596
        //  4595: athrow         
        //  4596: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //  4599: goto            4603
        //  4602: athrow         
        //  4603: ifne            4808
        //  4606: aload_0        
        //  4607: aload_0        
        //  4608: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  4611: getstatic       dev/nuker/pyro/fc.c:I
        //  4614: ifge            4623
        //  4617: ldc_w           -510574689
        //  4620: goto            4626
        //  4623: ldc_w           922571240
        //  4626: ldc_w           -2010065310
        //  4629: ixor           
        //  4630: lookupswitch {
        //          -1093826678: 4656
        //          1772218877: 4623
        //          default: 4872
        //        }
        //  4656: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4659: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //  4662: goto            4666
        //  4665: athrow         
        //  4666: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184586_b:(Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
        //  4669: goto            4673
        //  4672: athrow         
        //  4673: goto            4677
        //  4676: athrow         
        //  4677: invokevirtual   dev/nuker/pyro/f5x.c:(Lnet/minecraft/item/ItemStack;)Z
        //  4680: goto            4684
        //  4683: athrow         
        //  4684: ifeq            4693
        //  4687: ldc_w           1616161365
        //  4690: goto            4696
        //  4693: ldc_w           1616161362
        //  4696: ldc_w           -822642690
        //  4699: ixor           
        //  4700: tableswitch {
        //          1564982102: 4724
        //          1564982103: 4808
        //          default: 4687
        //        }
        //  4724: aload_0        
        //  4725: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  4728: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  4731: iconst_0       
        //  4732: iload_3        
        //  4733: iconst_0       
        //  4734: getstatic       net/minecraft/inventory/ClickType.PICKUP:Lnet/minecraft/inventory/ClickType;
        //  4737: aload_0        
        //  4738: getstatic       dev/nuker/pyro/fc.c:I
        //  4741: ifge            4750
        //  4744: ldc_w           1756386643
        //  4747: goto            4753
        //  4750: ldc_w           -2022467827
        //  4753: ldc_w           -611441341
        //  4756: ixor           
        //  4757: lookupswitch {
        //          -1287753712: 4918
        //          1828504345: 4750
        //          default: 4784
        //        }
        //  4784: getfield        dev/nuker/pyro/f5x.c:Lnet/minecraft/client/Minecraft;
        //  4787: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  4790: goto            4794
        //  4793: athrow         
        //  4794: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_187098_a:(IIILnet/minecraft/inventory/ClickType;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;
        //  4797: goto            4801
        //  4800: athrow         
        //  4801: pop            
        //  4802: aload_0        
        //  4803: iconst_0       
        //  4804: putfield        dev/nuker/pyro/f5x.c:Z
        //  4807: return         
        //  4808: iinc            3, -1
        //  4811: iload_3        
        //  4812: istore          4
        //  4814: goto            2977
        //  4817: return         
        //  4818: aconst_null    
        //  4819: athrow         
        //  4820: aconst_null    
        //  4821: athrow         
        //  4822: aconst_null    
        //  4823: athrow         
        //  4824: aconst_null    
        //  4825: athrow         
        //  4826: aconst_null    
        //  4827: athrow         
        //  4828: aconst_null    
        //  4829: athrow         
        //  4830: aconst_null    
        //  4831: athrow         
        //  4832: aconst_null    
        //  4833: athrow         
        //  4834: aconst_null    
        //  4835: athrow         
        //  4836: aconst_null    
        //  4837: athrow         
        //  4838: aconst_null    
        //  4839: athrow         
        //  4840: aconst_null    
        //  4841: athrow         
        //  4842: aconst_null    
        //  4843: athrow         
        //  4844: aconst_null    
        //  4845: athrow         
        //  4846: aconst_null    
        //  4847: athrow         
        //  4848: aconst_null    
        //  4849: athrow         
        //  4850: aconst_null    
        //  4851: athrow         
        //  4852: aconst_null    
        //  4853: athrow         
        //  4854: aconst_null    
        //  4855: athrow         
        //  4856: aconst_null    
        //  4857: athrow         
        //  4858: aconst_null    
        //  4859: athrow         
        //  4860: aconst_null    
        //  4861: athrow         
        //  4862: aconst_null    
        //  4863: athrow         
        //  4864: aconst_null    
        //  4865: athrow         
        //  4866: aconst_null    
        //  4867: athrow         
        //  4868: aconst_null    
        //  4869: athrow         
        //  4870: aconst_null    
        //  4871: athrow         
        //  4872: aconst_null    
        //  4873: athrow         
        //  4874: aconst_null    
        //  4875: athrow         
        //  4876: aconst_null    
        //  4877: athrow         
        //  4878: aconst_null    
        //  4879: athrow         
        //  4880: aconst_null    
        //  4881: athrow         
        //  4882: aconst_null    
        //  4883: athrow         
        //  4884: aconst_null    
        //  4885: athrow         
        //  4886: aconst_null    
        //  4887: athrow         
        //  4888: aconst_null    
        //  4889: athrow         
        //  4890: aconst_null    
        //  4891: athrow         
        //  4892: aconst_null    
        //  4893: athrow         
        //  4894: aconst_null    
        //  4895: athrow         
        //  4896: aconst_null    
        //  4897: athrow         
        //  4898: aconst_null    
        //  4899: athrow         
        //  4900: aconst_null    
        //  4901: athrow         
        //  4902: aconst_null    
        //  4903: athrow         
        //  4904: aconst_null    
        //  4905: athrow         
        //  4906: aconst_null    
        //  4907: athrow         
        //  4908: aconst_null    
        //  4909: athrow         
        //  4910: aconst_null    
        //  4911: athrow         
        //  4912: aconst_null    
        //  4913: athrow         
        //  4914: aconst_null    
        //  4915: athrow         
        //  4916: aconst_null    
        //  4917: athrow         
        //  4918: aconst_null    
        //  4919: athrow         
        //  4920: aconst_null    
        //  4921: athrow         
        //  4922: aconst_null    
        //  4923: athrow         
        //  4924: aconst_null    
        //  4925: athrow         
        //  4926: aconst_null    
        //  4927: athrow         
        //  4928: aconst_null    
        //  4929: athrow         
        //  4930: aconst_null    
        //  4931: athrow         
        //  4932: aconst_null    
        //  4933: athrow         
        //  4934: aconst_null    
        //  4935: athrow         
        //  4936: aconst_null    
        //  4937: athrow         
        //  4938: aconst_null    
        //  4939: athrow         
        //  4940: aconst_null    
        //  4941: athrow         
        //  4942: aconst_null    
        //  4943: athrow         
        //  4944: pop            
        //  4945: goto            24
        //  4948: pop            
        //  4949: aconst_null    
        //  4950: goto            4944
        //  4953: dup            
        //  4954: ifnull          4944
        //  4957: checkcast       Ljava/lang/Throwable;
        //  4960: athrow         
        //  4961: dup            
        //  4962: ifnull          4948
        //  4965: checkcast       Ljava/lang/Throwable;
        //  4968: athrow         
        //  4969: aconst_null    
        //  4970: athrow         
        //    StackMapTable: 02 7A 43 07 00 37 04 FF 00 0B 00 00 00 01 07 00 37 FD 00 03 07 00 03 07 03 39 FF 00 0D 00 02 07 00 03 07 03 39 00 02 07 00 03 07 00 03 FF 00 02 00 02 07 00 03 07 03 39 00 03 07 00 03 07 00 03 01 FF 00 1E 00 02 07 00 03 07 03 39 00 02 07 00 03 07 00 03 FF 00 05 00 00 00 01 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 02 07 00 03 07 00 BC 45 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 02 07 00 03 07 00 72 FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 02 07 00 03 07 00 72 45 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 02 07 00 03 07 01 96 42 07 00 14 FF 00 00 00 02 07 00 03 07 03 39 00 02 07 00 03 07 01 96 45 07 00 37 00 46 07 00 37 40 07 01 55 45 07 00 37 40 01 4F 07 00 03 FF 00 02 00 02 07 00 03 07 03 39 00 02 07 00 03 01 5D 07 00 03 FF 00 11 00 02 07 00 03 07 03 39 00 02 07 01 65 03 FF 00 02 00 02 07 00 03 07 03 39 00 03 07 01 65 03 01 FF 00 1E 00 02 07 00 03 07 03 39 00 02 07 01 65 03 42 07 00 30 FF 00 00 00 02 07 00 03 07 03 39 00 02 07 01 65 03 45 07 00 37 40 01 4F 07 00 03 FF 00 02 00 02 07 00 03 07 03 39 00 02 07 00 03 01 5D 07 00 03 49 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 02 07 00 BC 07 00 BC 45 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 02 07 00 BC 07 00 72 4B 07 00 BC FF 00 02 00 02 07 00 03 07 03 39 00 02 07 00 BC 07 00 BF FF 00 0B 00 02 07 00 03 07 03 39 00 02 07 00 BC 07 00 BF FF 00 02 00 02 07 00 03 07 03 39 00 03 07 00 BC 07 00 BF 01 FF 00 1F 00 02 07 00 03 07 03 39 00 02 07 00 BC 07 00 BF 42 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 02 07 00 BC 07 00 BF 45 07 00 37 00 49 07 00 2E FF 00 00 00 02 07 00 03 07 03 39 00 03 07 01 C4 08 01 7A 08 01 7A 45 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 02 07 01 C4 07 01 CA 45 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 03 07 01 C4 07 01 CA 07 01 96 45 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 03 07 01 C4 07 01 CA 07 01 96 42 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 03 07 01 C4 07 01 CA 07 01 96 45 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 02 07 01 C4 07 01 CA FF 00 06 00 00 00 01 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 03 07 01 C4 07 01 CA 07 00 BC 45 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 03 07 01 C4 07 01 CA 07 00 72 FF 00 0B 00 02 07 00 03 07 03 39 00 03 07 01 C4 07 01 CA 07 00 72 FF 00 02 00 02 07 00 03 07 03 39 00 04 07 01 C4 07 01 CA 07 00 72 01 FF 00 1F 00 02 07 00 03 07 03 39 00 03 07 01 C4 07 01 CA 07 00 72 FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 03 07 01 C4 07 01 CA 07 00 72 45 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 02 07 01 C4 07 01 CA 42 07 00 24 FF 00 00 00 02 07 00 03 07 03 39 00 02 07 01 C4 07 01 CA 45 07 00 37 FF 00 00 00 02 07 00 03 07 03 39 00 02 07 01 C4 07 01 96 42 07 00 26 FF 00 00 00 02 07 00 03 07 03 39 00 02 07 01 C4 07 01 96 45 07 00 37 00 46 07 00 37 40 07 01 65 45 07 00 37 00 46 07 00 18 40 07 00 3E 45 07 00 37 40 07 00 72 45 07 00 37 40 07 00 43 45 07 00 37 40 01 02 05 42 01 1A 4C 07 00 03 FF 00 02 00 02 07 00 03 07 03 39 00 02 07 00 03 01 5F 07 00 03 48 07 00 37 40 07 00 60 45 07 00 37 40 01 02 05 42 01 1A 00 45 07 00 37 40 07 01 F3 45 07 00 37 40 01 4B 01 FF 00 02 00 02 07 00 03 07 03 39 00 02 01 01 5D 01 FF 00 17 00 03 07 00 03 07 03 39 01 00 01 03 FF 00 02 00 03 07 00 03 07 03 39 01 00 02 03 01 5C 03 46 07 00 37 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 03 07 00 F3 45 07 00 37 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 03 07 00 72 FF 00 05 00 00 00 01 07 00 37 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 03 07 02 02 45 07 00 37 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 03 03 03 05 42 01 19 46 07 00 37 40 07 00 3E 45 07 00 37 40 07 00 72 45 07 00 37 40 07 00 43 45 07 00 37 40 01 4C 07 00 37 40 07 00 60 45 07 00 37 40 01 02 05 52 07 00 60 FF 00 02 00 03 07 00 03 07 03 39 01 00 02 07 00 60 01 5E 07 00 60 42 07 00 37 40 07 00 60 45 07 00 37 40 02 FF 00 12 00 03 07 00 03 07 03 39 01 00 02 02 07 00 60 FF 00 02 00 03 07 00 03 07 03 39 01 00 03 02 07 00 60 01 FF 00 1E 00 03 07 00 03 07 03 39 01 00 02 02 07 00 60 42 07 00 2E FF 00 00 00 03 07 00 03 07 03 39 01 00 02 02 07 00 60 45 07 00 37 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 02 02 4D 03 FF 00 02 00 03 07 00 03 07 03 39 01 00 02 03 01 5F 03 FF 00 06 00 00 00 01 07 00 37 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 03 07 00 F3 45 07 00 37 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 03 07 00 72 FF 00 0E 00 03 07 00 03 07 03 39 01 00 02 03 07 02 02 FF 00 02 00 03 07 00 03 07 03 39 01 00 03 03 07 02 02 01 FF 00 1E 00 03 07 00 03 07 03 39 01 00 02 03 07 02 02 FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 03 07 02 02 45 07 00 37 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 03 03 03 05 42 01 1B 0F 42 01 1C 4F 07 00 37 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 07 01 C4 07 01 96 45 07 00 37 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 07 01 C4 07 01 96 42 07 00 37 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 07 01 C4 07 01 96 45 07 00 37 00 46 07 00 26 40 07 00 3E 45 07 00 37 40 07 00 72 45 07 00 37 40 07 00 43 45 07 00 37 40 01 0E 42 01 1D 47 07 00 26 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 07 02 32 01 45 07 00 37 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 07 02 32 07 00 43 42 07 00 26 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 07 02 32 07 00 43 45 07 00 37 00 05 0B 42 01 1F 4F 07 00 3E FF 00 02 00 03 07 00 03 07 03 39 01 00 02 07 00 3E 01 5C 07 00 3E 42 07 00 37 40 07 00 3E 45 07 00 37 40 07 00 72 45 07 00 14 40 07 00 43 45 07 00 37 40 01 06 05 42 01 1A 0B 42 01 1C 4C 07 00 37 40 07 00 9C 47 07 00 37 40 07 00 A2 FC 00 00 07 00 A2 4C 07 00 A2 FF 00 02 00 04 07 00 03 07 03 39 01 07 00 A2 00 02 07 00 A2 01 5F 07 00 A2 42 07 00 30 40 07 00 A2 47 07 00 37 40 01 02 05 42 01 1A 0B 42 01 1C 43 07 00 37 40 07 00 A2 47 07 00 37 40 07 00 72 FC 00 18 07 02 54 42 01 1D 4E 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 02 07 02 56 07 00 60 45 07 00 37 40 02 4B 02 FF 00 02 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 02 02 01 5D 02 49 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 02 02 07 00 60 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 02 02 02 FF 00 0F 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 03 02 02 07 00 4F FF 00 02 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 04 02 02 07 00 4F 01 FF 00 1E 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 03 02 02 07 00 4F FF 00 0E 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 03 02 02 07 00 60 FF 00 02 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 04 02 02 07 00 60 01 FF 00 1D 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 03 02 02 07 00 60 42 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 03 02 02 07 00 60 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 03 02 02 02 10 42 01 1C 07 05 42 01 1A 4C 07 00 03 FF 00 02 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 02 07 00 03 01 5F 07 00 03 11 42 01 1E FF 00 08 00 00 00 01 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 02 07 01 C4 07 01 96 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 02 07 01 C4 07 01 96 42 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 02 07 01 C4 07 01 96 45 07 00 37 00 0B 42 01 1C 46 07 00 30 40 07 00 3E 45 07 00 37 40 07 00 72 4E 07 00 43 FF 00 02 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 02 07 00 43 01 5E 07 00 43 42 07 00 1E 40 07 00 43 45 07 00 37 40 01 4A 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 02 07 02 32 01 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 02 07 02 32 07 00 43 42 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 02 07 02 32 07 00 43 45 07 00 37 00 0B 42 01 1F FF 00 0D 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 02 07 00 03 01 FF 00 02 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 03 07 00 03 01 01 FF 00 1E 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 02 07 00 03 01 03 F9 00 02 5E 07 00 03 FF 00 02 00 03 07 00 03 07 03 39 01 00 02 07 00 03 01 5E 07 00 03 0C 4D 07 00 37 40 07 01 65 45 07 00 37 00 0B 42 01 1D 4C 07 00 03 FF 00 02 00 03 07 00 03 07 03 39 01 00 02 07 00 03 01 5F 07 00 03 4C 07 00 37 FF 00 00 00 03 07 00 03 07 03 39 01 00 03 07 00 03 07 00 60 07 00 55 45 07 00 37 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 07 00 03 07 00 66 42 07 00 14 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 07 00 03 07 00 66 45 07 00 37 40 01 02 05 42 01 1B 00 0B 42 01 1F 4C 07 00 03 FF 00 02 00 03 07 00 03 07 03 39 01 00 02 07 00 03 01 5F 07 00 03 51 07 00 60 FF 00 02 00 03 07 00 03 07 03 39 01 00 02 07 00 60 01 5E 07 00 60 42 07 00 37 40 07 00 60 45 07 00 37 40 01 03 FD 00 05 01 01 12 42 01 1C FF 00 0D 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 03 FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 03 07 00 03 07 00 03 01 FF 00 1E 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 03 FF 00 0E 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 4F FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 03 07 00 03 07 00 4F 01 FF 00 1D 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 4F FF 00 11 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 02 BD FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 03 07 00 03 07 02 BD 01 FF 00 1E 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 02 BD 43 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 03 07 00 03 07 02 BD 01 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 02 C3 42 07 00 14 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 02 C3 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 66 42 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 66 45 07 00 37 40 01 FF 00 10 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 01 FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 03 07 00 03 01 01 FF 00 1D 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 01 52 07 01 65 FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 01 5D 07 01 65 FF 00 0F 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 07 00 F3 FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 03 07 01 65 07 00 F3 01 FF 00 1C 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 07 00 F3 42 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 07 00 F3 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 07 00 72 45 07 00 1C FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 07 02 02 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 03 46 07 00 2E FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 03 45 07 00 37 40 01 02 05 42 01 1B 4C 07 00 03 FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 01 5F 07 00 03 FF 00 15 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 02 E1 FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 03 07 00 03 07 02 E1 01 FF 00 1E 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 02 E1 42 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 02 E1 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 66 42 07 00 2A FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 66 45 07 00 37 40 01 52 07 00 4F FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 4F 01 5F 07 00 4F FF 00 0F 00 05 07 00 03 07 03 39 01 01 01 00 02 07 03 02 01 FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 03 07 03 02 01 01 FF 00 1C 00 05 07 00 03 07 03 39 01 01 01 00 02 07 03 02 01 FF 00 10 00 05 07 00 03 07 03 39 01 01 01 00 05 07 03 02 01 01 01 07 02 F0 FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 01 FF 00 1F 00 05 07 00 03 07 03 39 01 01 01 00 05 07 03 02 01 01 01 07 02 F0 FF 00 0C 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 03 FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 07 07 03 02 01 01 01 07 02 F0 07 00 03 01 FF 00 1F 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 03 FF 00 0E 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 4F FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 07 07 03 02 01 01 01 07 02 F0 07 00 4F 01 FF 00 1D 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 4F FF 00 0E 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 60 FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 07 07 03 02 01 01 01 07 02 F0 07 00 60 01 FF 00 1D 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 60 42 07 00 14 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 60 45 07 00 37 40 07 00 66 00 4C 07 00 03 FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 01 5F 07 00 03 49 07 00 2A FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 07 00 F3 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 07 00 72 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 07 02 02 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 03 46 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 03 45 07 00 37 40 01 0E 42 01 1E FF 00 13 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 60 FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 03 07 00 03 07 00 60 01 FF 00 1C 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 60 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 02 E1 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 66 42 07 00 14 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 66 45 07 00 37 40 01 FF 00 20 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 4F FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 07 07 03 02 01 01 01 07 02 F0 07 00 4F 01 FF 00 1E 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 4F FF 00 0E 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 60 FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 07 07 03 02 01 01 01 07 02 F0 07 00 60 01 FF 00 1D 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 60 FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 60 45 07 00 37 40 07 00 66 50 07 00 4F FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 4F 01 5C 07 00 4F FF 00 08 00 00 00 01 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 01 07 02 E1 45 07 00 37 40 07 00 66 42 07 00 18 40 07 00 66 45 07 00 37 40 01 02 05 42 01 1B 0B 42 01 1C 05 4F 07 01 65 FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 01 5E 07 01 65 46 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 07 00 F3 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 07 00 72 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 07 02 02 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 03 46 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 03 45 07 00 37 40 01 02 05 42 01 1B 4C 07 00 37 40 07 02 E1 45 07 00 37 40 07 00 66 4B 07 00 66 FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 66 01 5F 07 00 66 42 07 00 37 40 07 00 66 45 07 00 37 40 01 FF 00 13 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 4F FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 03 07 00 03 07 00 4F 01 FF 00 1D 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 4F FF 00 08 00 00 00 01 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 03 07 00 03 07 00 60 07 00 55 45 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 66 FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 66 45 07 00 37 40 01 02 05 42 01 1B FF 00 19 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 03 FF 00 02 00 05 07 00 03 07 03 39 01 01 01 00 07 07 03 02 01 01 01 07 02 F0 07 00 03 01 FF 00 1E 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 03 48 07 00 24 FF 00 00 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 60 45 07 00 37 40 07 00 66 06 08 FF 00 00 00 03 07 00 03 07 03 39 01 00 02 03 07 02 02 FF 00 01 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 01 07 00 43 FF 00 01 00 03 07 00 03 07 03 39 01 00 01 07 00 03 01 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 01 07 01 65 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 01 FF 00 01 00 02 07 00 03 07 03 39 00 01 07 00 03 FE 00 01 01 07 00 A2 07 02 54 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 02 07 01 65 07 00 F3 F9 00 01 41 07 00 03 FF 00 01 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 02 07 00 03 01 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 03 FF 00 01 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 03 02 02 07 00 60 FF 00 01 00 03 07 00 03 07 03 39 01 00 01 07 00 60 FF 00 01 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 03 02 02 07 00 4F FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 00 FF 00 01 00 02 07 00 03 07 03 39 00 03 07 01 C4 07 01 CA 07 00 72 FD 00 01 01 07 00 A2 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 01 07 01 65 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 02 BD FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 4F 01 FF 00 01 00 02 07 00 03 07 03 39 00 01 07 00 03 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 01 07 00 03 FF 00 01 00 04 07 00 03 07 03 39 01 07 00 A2 00 01 07 00 A2 FF 00 01 00 02 07 00 03 07 03 39 00 01 01 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 4F F9 00 01 01 FD 00 01 01 01 FF 00 01 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 03 39 01 00 01 03 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 02 07 03 02 01 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 02 E1 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 03 FF 00 01 00 02 07 00 03 07 03 39 00 01 07 00 03 FE 00 01 01 07 00 A2 07 02 54 01 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 01 07 00 4F FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 60 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 4F FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 4F FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 05 07 03 02 01 01 01 07 02 F0 FF 00 01 00 03 07 00 03 07 03 39 01 00 01 07 00 03 01 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 01 07 00 03 FF 00 01 00 02 07 00 03 07 03 39 00 02 07 00 BC 07 00 BF FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 02 07 00 03 07 00 60 41 07 00 66 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 03 FF 00 01 00 03 07 00 03 07 03 39 01 00 01 07 00 60 01 FD 00 01 07 00 A2 07 02 54 FF 00 01 00 03 07 00 03 07 03 39 01 00 01 03 FF 00 01 00 02 07 00 03 07 03 39 00 02 07 00 03 07 00 03 FF 00 01 00 05 07 00 03 07 03 39 01 07 00 A2 07 02 54 00 01 02 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 06 07 03 02 01 01 01 07 02 F0 07 00 60 FF 00 01 00 03 07 00 03 07 03 39 01 00 02 02 07 00 60 FD 00 01 07 00 A2 07 02 54 FF 00 01 00 05 07 00 03 07 03 39 01 01 01 00 01 07 00 4F FF 00 01 00 02 07 00 03 07 03 39 00 02 07 01 65 03 FF 00 01 00 03 07 00 03 07 03 39 01 00 01 07 00 3E FF 00 01 00 02 07 00 03 07 03 39 00 01 07 00 37 43 05 44 07 00 37 47 05 47 07 00 37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     4953   4961   Any
        //  4953   4961   4953   4961   Any
        //  4969   4971   3      8      Any
        //  79     85     85     86     Any
        //  79     85     85     86     Ljava/lang/RuntimeException;
        //  79     85     3      8      Ljava/lang/UnsupportedOperationException;
        //  79     85     85     86     Ljava/lang/NullPointerException;
        //  79     85     3      8      Any
        //  90     96     96     97     Any
        //  90     96     3      8      Any
        //  90     96     96     97     Ljava/lang/IllegalStateException;
        //  90     96     3      8      Ljava/lang/AssertionError;
        //  90     96     3      8      Any
        //  100    107    107    108    Any
        //  101    107    107    108    Any
        //  101    107    100    101    Ljava/lang/RuntimeException;
        //  100    107    100    101    Ljava/lang/EnumConstantNotPresentException;
        //  101    107    3      8      Ljava/lang/IllegalArgumentException;
        //  115    122    122    123    Any
        //  115    122    3      8      Any
        //  116    122    115    116    Any
        //  115    122    115    116    Ljava/lang/EnumConstantNotPresentException;
        //  115    122    115    116    Ljava/util/ConcurrentModificationException;
        //  227    234    234    235    Any
        //  228    234    3      8      Ljava/lang/IllegalStateException;
        //  228    234    227    228    Ljava/lang/ArithmeticException;
        //  227    234    3      8      Any
        //  227    234    3      8      Any
        //  294    301    301    302    Any
        //  295    301    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  295    301    3      8      Any
        //  295    301    3      8      Ljava/lang/IllegalStateException;
        //  294    301    294    295    Any
        //  367    374    374    375    Any
        //  368    374    374    375    Any
        //  368    374    367    368    Any
        //  367    374    367    368    Ljava/lang/IndexOutOfBoundsException;
        //  368    374    374    375    Ljava/util/ConcurrentModificationException;
        //  385    392    392    393    Any
        //  386    392    3      8      Ljava/lang/IllegalArgumentException;
        //  386    392    3      8      Ljava/lang/NegativeArraySizeException;
        //  385    392    392    393    Any
        //  386    392    385    386    Ljava/lang/StringIndexOutOfBoundsException;
        //  399    406    406    407    Any
        //  399    406    399    400    Ljava/lang/IllegalStateException;
        //  400    406    406    407    Ljava/lang/ArithmeticException;
        //  400    406    399    400    Any
        //  400    406    3      8      Any
        //  410    417    417    418    Any
        //  410    417    410    411    Any
        //  411    417    410    411    Any
        //  411    417    417    418    Ljava/lang/NegativeArraySizeException;
        //  411    417    417    418    Any
        //  426    432    432    433    Any
        //  426    432    3      8      Any
        //  426    432    3      8      Any
        //  426    432    3      8      Ljava/lang/ClassCastException;
        //  426    432    432    433    Any
        //  484    490    490    491    Any
        //  484    490    3      8      Ljava/lang/NullPointerException;
        //  484    490    490    491    Ljava/lang/IndexOutOfBoundsException;
        //  484    490    3      8      Ljava/util/ConcurrentModificationException;
        //  484    490    3      8      Any
        //  494    501    501    502    Any
        //  495    501    494    495    Ljava/lang/UnsupportedOperationException;
        //  494    501    3      8      Any
        //  495    501    501    502    Ljava/lang/IllegalStateException;
        //  495    501    3      8      Ljava/lang/IllegalArgumentException;
        //  505    512    512    513    Any
        //  506    512    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  505    512    512    513    Any
        //  506    512    512    513    Any
        //  506    512    505    506    Ljava/util/NoSuchElementException;
        //  520    527    527    528    Any
        //  520    527    3      8      Any
        //  521    527    520    521    Ljava/lang/EnumConstantNotPresentException;
        //  521    527    520    521    Any
        //  521    527    3      8      Ljava/lang/ClassCastException;
        //  535    542    542    543    Any
        //  535    542    542    543    Any
        //  535    542    3      8      Any
        //  536    542    535    536    Ljava/lang/NumberFormatException;
        //  536    542    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  549    556    556    557    Any
        //  549    556    549    550    Any
        //  550    556    556    557    Ljava/lang/IllegalArgumentException;
        //  550    556    556    557    Any
        //  550    556    549    550    Any
        //  653    660    660    661    Any
        //  654    660    660    661    Ljava/lang/NullPointerException;
        //  654    660    660    661    Any
        //  653    660    653    654    Any
        //  654    660    653    654    Ljava/lang/NegativeArraySizeException;
        //  707    714    714    715    Any
        //  708    714    714    715    Ljava/lang/IllegalArgumentException;
        //  707    714    3      8      Ljava/lang/IllegalArgumentException;
        //  707    714    707    708    Any
        //  707    714    3      8      Ljava/util/NoSuchElementException;
        //  823    830    830    831    Any
        //  823    830    823    824    Any
        //  824    830    823    824    Any
        //  824    830    823    824    Any
        //  823    830    830    831    Any
        //  838    844    844    845    Any
        //  838    844    844    845    Ljava/lang/EnumConstantNotPresentException;
        //  838    844    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  838    844    844    845    Ljava/lang/IllegalStateException;
        //  838    844    844    845    Any
        //  891    898    898    899    Any
        //  891    898    898    899    Any
        //  891    898    891    892    Any
        //  892    898    3      8      Any
        //  892    898    3      8      Ljava/lang/IllegalArgumentException;
        //  905    912    912    913    Any
        //  906    912    912    913    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  905    912    905    906    Ljava/lang/IllegalStateException;
        //  906    912    905    906    Any
        //  906    912    905    906    Any
        //  926    933    933    934    Any
        //  927    933    933    934    Any
        //  927    933    933    934    Ljava/lang/IndexOutOfBoundsException;
        //  927    933    926    927    Any
        //  926    933    926    927    Any
        //  999    1006   1006   1007   Any
        //  999    1006   999    1000   Any
        //  1000   1006   1006   1007   Ljava/lang/RuntimeException;
        //  999    1006   3      8      Any
        //  1000   1006   999    1000   Ljava/lang/AssertionError;
        //  1063   1070   1070   1071   Any
        //  1063   1070   1070   1071   Ljava/lang/IndexOutOfBoundsException;
        //  1064   1070   1070   1071   Ljava/lang/ArithmeticException;
        //  1064   1070   3      8      Ljava/lang/ClassCastException;
        //  1064   1070   1063   1064   Ljava/lang/StringIndexOutOfBoundsException;
        //  1128   1134   1134   1135   Any
        //  1128   1134   3      8      Any
        //  1128   1134   3      8      Ljava/util/NoSuchElementException;
        //  1128   1134   3      8      Any
        //  1128   1134   3      8      Any
        //  1188   1194   1194   1195   Any
        //  1188   1194   1194   1195   Ljava/lang/UnsupportedOperationException;
        //  1188   1194   3      8      Any
        //  1188   1194   1194   1195   Ljava/util/ConcurrentModificationException;
        //  1188   1194   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1300   1307   1307   1308   Any
        //  1301   1307   1300   1301   Ljava/lang/StringIndexOutOfBoundsException;
        //  1301   1307   3      8      Ljava/lang/AssertionError;
        //  1300   1307   3      8      Any
        //  1301   1307   1300   1301   Any
        //  1311   1318   1318   1319   Any
        //  1312   1318   3      8      Ljava/lang/IllegalArgumentException;
        //  1311   1318   1318   1319   Ljava/util/NoSuchElementException;
        //  1311   1318   3      8      Any
        //  1311   1318   1311   1312   Any
        //  1326   1333   1333   1334   Any
        //  1326   1333   3      8      Ljava/lang/ArithmeticException;
        //  1327   1333   1326   1327   Ljava/util/NoSuchElementException;
        //  1327   1333   3      8      Any
        //  1326   1333   3      8      Ljava/lang/ClassCastException;
        //  1340   1347   1347   1348   Any
        //  1340   1347   1340   1341   Any
        //  1340   1347   1340   1341   Any
        //  1340   1347   1340   1341   Ljava/lang/AssertionError;
        //  1341   1347   1340   1341   Any
        //  1404   1411   1411   1412   Any
        //  1405   1411   3      8      Any
        //  1405   1411   3      8      Any
        //  1404   1411   1404   1405   Ljava/util/NoSuchElementException;
        //  1405   1411   1411   1412   Any
        //  1415   1422   1422   1423   Any
        //  1415   1422   1415   1416   Ljava/util/NoSuchElementException;
        //  1416   1422   3      8      Any
        //  1415   1422   1422   1423   Ljava/lang/AssertionError;
        //  1416   1422   1422   1423   Ljava/util/NoSuchElementException;
        //  1527   1534   1534   1535   Any
        //  1527   1534   1534   1535   Any
        //  1528   1534   1527   1528   Any
        //  1527   1534   1534   1535   Any
        //  1527   1534   3      8      Ljava/lang/ArithmeticException;
        //  1541   1548   1548   1549   Any
        //  1541   1548   1541   1542   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1541   1548   3      8      Any
        //  1542   1548   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1542   1548   1541   1542   Ljava/lang/NumberFormatException;
        //  1649   1658   1658   1659   Any
        //  1649   1658   3      8      Ljava/lang/NegativeArraySizeException;
        //  1649   1658   1649   1650   Ljava/lang/StringIndexOutOfBoundsException;
        //  1649   1658   1649   1650   Any
        //  1650   1658   1649   1650   Ljava/lang/IndexOutOfBoundsException;
        //  1711   1720   1720   1721   Any
        //  1712   1720   3      8      Ljava/lang/ClassCastException;
        //  1711   1720   1711   1712   Ljava/lang/ArithmeticException;
        //  1712   1720   1720   1721   Any
        //  1712   1720   3      8      Ljava/lang/ClassCastException;
        //  1808   1817   1817   1818   Any
        //  1809   1817   1808   1809   Ljava/lang/ArithmeticException;
        //  1808   1817   3      8      Any
        //  1808   1817   1817   1818   Any
        //  1809   1817   1808   1809   Any
        //  1891   1898   1898   1899   Any
        //  1891   1898   1891   1892   Any
        //  1892   1898   3      8      Any
        //  1892   1898   3      8      Any
        //  1892   1898   3      8      Ljava/lang/AssertionError;
        //  1954   1961   1961   1962   Any
        //  1954   1961   1961   1962   Ljava/lang/NullPointerException;
        //  1954   1961   1954   1955   Any
        //  1955   1961   1954   1955   Ljava/lang/NegativeArraySizeException;
        //  1955   1961   1954   1955   Any
        //  2063   2070   2070   2071   Any
        //  2064   2070   3      8      Ljava/lang/AssertionError;
        //  2063   2070   3      8      Ljava/lang/ArithmeticException;
        //  2063   2070   2063   2064   Any
        //  2064   2070   2070   2071   Ljava/lang/UnsupportedOperationException;
        //  2274   2280   2280   2281   Any
        //  2274   2280   3      8      Any
        //  2274   2280   3      8      Ljava/lang/NullPointerException;
        //  2274   2280   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2274   2280   2280   2281   Any
        //  2284   2291   2291   2292   Any
        //  2284   2291   2284   2285   Any
        //  2284   2291   2284   2285   Any
        //  2285   2291   2284   2285   Any
        //  2284   2291   3      8      Ljava/lang/ArithmeticException;
        //  2343   2350   2350   2351   Any
        //  2343   2350   2343   2344   Ljava/lang/ArithmeticException;
        //  2344   2350   3      8      Ljava/lang/ClassCastException;
        //  2343   2350   2350   2351   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2343   2350   2350   2351   Ljava/lang/IllegalStateException;
        //  2403   2410   2410   2411   Any
        //  2403   2410   2403   2404   Ljava/lang/ClassCastException;
        //  2403   2410   2410   2411   Any
        //  2404   2410   2410   2411   Any
        //  2404   2410   3      8      Ljava/lang/RuntimeException;
        //  2422   2429   2429   2430   Any
        //  2422   2429   2422   2423   Any
        //  2423   2429   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  2422   2429   3      8      Ljava/lang/NegativeArraySizeException;
        //  2422   2429   2422   2423   Any
        //  2433   2440   2440   2441   Any
        //  2434   2440   2433   2434   Any
        //  2434   2440   2440   2441   Any
        //  2433   2440   2440   2441   Ljava/lang/EnumConstantNotPresentException;
        //  2433   2440   2440   2441   Ljava/lang/IllegalStateException;
        //  2635   2642   2642   2643   Any
        //  2635   2642   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  2635   2642   2635   2636   Any
        //  2636   2642   2635   2636   Ljava/lang/IndexOutOfBoundsException;
        //  2635   2642   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2749   2756   2756   2757   Any
        //  2750   2756   2749   2750   Ljava/lang/NegativeArraySizeException;
        //  2749   2756   2749   2750   Any
        //  2750   2756   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2750   2756   2756   2757   Ljava/lang/RuntimeException;
        //  2760   2767   2767   2768   Any
        //  2760   2767   2760   2761   Ljava/util/NoSuchElementException;
        //  2760   2767   2767   2768   Ljava/lang/UnsupportedOperationException;
        //  2761   2767   3      8      Any
        //  2761   2767   2760   2761   Ljava/lang/NumberFormatException;
        //  2959   2966   2966   2967   Any
        //  2959   2966   2959   2960   Any
        //  2960   2966   3      8      Ljava/lang/ClassCastException;
        //  2960   2966   3      8      Any
        //  2959   2966   2959   2960   Ljava/util/NoSuchElementException;
        //  3180   3187   3187   3188   Any
        //  3181   3187   3      8      Ljava/lang/IllegalArgumentException;
        //  3180   3187   3180   3181   Any
        //  3180   3187   3      8      Ljava/lang/IllegalStateException;
        //  3180   3187   3      8      Ljava/lang/NullPointerException;
        //  3191   3198   3198   3199   Any
        //  3192   3198   3      8      Any
        //  3191   3198   3191   3192   Ljava/lang/NumberFormatException;
        //  3191   3198   3198   3199   Any
        //  3191   3198   3191   3192   Ljava/lang/ArithmeticException;
        //  3202   3209   3209   3210   Any
        //  3203   3209   3      8      Ljava/lang/NumberFormatException;
        //  3203   3209   3      8      Ljava/lang/ArithmeticException;
        //  3203   3209   3      8      Any
        //  3202   3209   3202   3203   Any
        //  3363   3370   3370   3371   Any
        //  3363   3370   3      8      Ljava/lang/IllegalStateException;
        //  3363   3370   3370   3371   Any
        //  3363   3370   3370   3371   Ljava/util/ConcurrentModificationException;
        //  3364   3370   3363   3364   Any
        //  3377   3384   3384   3385   Any
        //  3378   3384   3377   3378   Ljava/lang/AssertionError;
        //  3377   3384   3      8      Any
        //  3377   3384   3384   3385   Any
        //  3377   3384   3      8      Any
        //  3392   3399   3399   3400   Any
        //  3393   3399   3392   3393   Ljava/lang/StringIndexOutOfBoundsException;
        //  3393   3399   3399   3400   Any
        //  3393   3399   3399   3400   Any
        //  3392   3399   3      8      Ljava/lang/IllegalStateException;
        //  3547   3554   3554   3555   Any
        //  3548   3554   3547   3548   Any
        //  3547   3554   3554   3555   Any
        //  3548   3554   3547   3548   Ljava/lang/NegativeArraySizeException;
        //  3548   3554   3      8      Any
        //  3558   3565   3565   3566   Any
        //  3559   3565   3565   3566   Ljava/lang/IllegalStateException;
        //  3559   3565   3558   3559   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3558   3565   3565   3566   Any
        //  3558   3565   3      8      Any
        //  3867   3874   3874   3875   Any
        //  3867   3874   3867   3868   Ljava/lang/IndexOutOfBoundsException;
        //  3867   3874   3867   3868   Ljava/lang/NegativeArraySizeException;
        //  3868   3874   3      8      Any
        //  3867   3874   3      8      Any
        //  3934   3941   3941   3942   Any
        //  3934   3941   3941   3942   Ljava/lang/IllegalStateException;
        //  3934   3941   3      8      Ljava/lang/IllegalStateException;
        //  3935   3941   3934   3935   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3934   3941   3      8      Any
        //  3948   3955   3955   3956   Any
        //  3949   3955   3948   3949   Any
        //  3949   3955   3      8      Ljava/lang/AssertionError;
        //  3948   3955   3955   3956   Any
        //  3949   3955   3955   3956   Any
        //  3963   3970   3970   3971   Any
        //  3964   3970   3970   3971   Ljava/lang/EnumConstantNotPresentException;
        //  3963   3970   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  3963   3970   3963   3964   Any
        //  3964   3970   3963   3964   Any
        //  4078   4085   4085   4086   Any
        //  4078   4085   4085   4086   Any
        //  4079   4085   4085   4086   Ljava/lang/IllegalStateException;
        //  4078   4085   4078   4079   Any
        //  4079   4085   4078   4079   Ljava/lang/UnsupportedOperationException;
        //  4089   4096   4096   4097   Any
        //  4089   4096   4089   4090   Ljava/lang/NumberFormatException;
        //  4089   4096   4089   4090   Ljava/lang/IndexOutOfBoundsException;
        //  4089   4096   4096   4097   Any
        //  4089   4096   4096   4097   Any
        //  4216   4222   4222   4223   Any
        //  4216   4222   4222   4223   Any
        //  4216   4222   3      8      Ljava/lang/NullPointerException;
        //  4216   4222   4222   4223   Any
        //  4216   4222   3      8      Any
        //  4282   4288   4288   4289   Any
        //  4282   4288   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  4282   4288   3      8      Any
        //  4282   4288   3      8      Any
        //  4282   4288   4288   4289   Any
        //  4292   4299   4299   4300   Any
        //  4292   4299   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  4293   4299   4292   4293   Ljava/lang/NumberFormatException;
        //  4293   4299   3      8      Ljava/lang/NullPointerException;
        //  4293   4299   3      8      Any
        //  4447   4454   4454   4455   Any
        //  4448   4454   4454   4455   Ljava/lang/IndexOutOfBoundsException;
        //  4447   4454   4454   4455   Any
        //  4447   4454   4447   4448   Any
        //  4447   4454   4447   4448   Ljava/lang/IllegalStateException;
        //  4461   4468   4468   4469   Any
        //  4461   4468   4461   4462   Any
        //  4461   4468   4461   4462   Ljava/lang/ClassCastException;
        //  4461   4468   4468   4469   Any
        //  4462   4468   4461   4462   Ljava/lang/NegativeArraySizeException;
        //  4476   4483   4483   4484   Any
        //  4476   4483   3      8      Ljava/lang/NegativeArraySizeException;
        //  4476   4483   4483   4484   Ljava/lang/NegativeArraySizeException;
        //  4477   4483   4476   4477   Any
        //  4476   4483   3      8      Ljava/lang/RuntimeException;
        //  4537   4544   4544   4545   Any
        //  4537   4544   3      8      Ljava/lang/UnsupportedOperationException;
        //  4537   4544   4537   4538   Any
        //  4537   4544   4537   4538   Ljava/util/NoSuchElementException;
        //  4538   4544   4537   4538   Any
        //  4595   4602   4602   4603   Any
        //  4596   4602   4595   4596   Any
        //  4596   4602   3      8      Any
        //  4596   4602   4595   4596   Ljava/util/ConcurrentModificationException;
        //  4596   4602   4595   4596   Any
        //  4666   4672   4672   4673   Any
        //  4666   4672   3      8      Any
        //  4666   4672   4672   4673   Ljava/util/ConcurrentModificationException;
        //  4666   4672   3      8      Any
        //  4666   4672   3      8      Ljava/lang/NumberFormatException;
        //  4677   4683   4683   4684   Any
        //  4677   4683   3      8      Ljava/lang/AssertionError;
        //  4677   4683   3      8      Any
        //  4677   4683   3      8      Any
        //  4677   4683   4683   4684   Ljava/util/NoSuchElementException;
        //  4793   4800   4800   4801   Any
        //  4794   4800   3      8      Ljava/lang/NegativeArraySizeException;
        //  4793   4800   4800   4801   Ljava/lang/IllegalArgumentException;
        //  4793   4800   4800   4801   Any
        //  4794   4800   4793   4794   Ljava/lang/UnsupportedOperationException;
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
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
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
        //    12: ifgt            157
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            149
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: getstatic       dev/nuker/pyro/fc.c:I
        //    29: ifge            38
        //    32: ldc_w           221446528
        //    35: goto            41
        //    38: ldc_w           1404471909
        //    41: ldc_w           -1525951913
        //    44: ixor           
        //    45: lookupswitch {
        //          -1472670761: 138
        //          1362498032: 38
        //          default: 72
        //        }
        //    72: aload_2        
        //    73: aload_3        
        //    74: goto            78
        //    77: athrow         
        //    78: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //    81: goto            85
        //    84: athrow         
        //    85: aload_0        
        //    86: iconst_0       
        //    87: getstatic       dev/nuker/pyro/fc.1:I
        //    90: ifeq            99
        //    93: ldc_w           -171837197
        //    96: goto            102
        //    99: ldc_w           322976036
        //   102: ldc_w           -1214956862
        //   105: ixor           
        //   106: lookupswitch {
        //          -1529543706: 132
        //          1112850993: 99
        //          default: 136
        //        }
        //   132: putfield        dev/nuker/pyro/f5x.c:Z
        //   135: return         
        //   136: aconst_null    
        //   137: athrow         
        //   138: aconst_null    
        //   139: athrow         
        //   140: pop            
        //   141: goto            24
        //   144: pop            
        //   145: aconst_null    
        //   146: goto            140
        //   149: dup            
        //   150: ifnull          140
        //   153: checkcast       Ljava/lang/Throwable;
        //   156: athrow         
        //   157: dup            
        //   158: ifnull          144
        //   161: checkcast       Ljava/lang/Throwable;
        //   164: athrow         
        //   165: nop            
        //   166: athrow         
        //    RuntimeInvisibleTypeAnnotations: 00 02 16 01 00 03 3B 00 00 16 02 00 03 3B 00 00
        //    StackMapTable: 00 16 FF 00 03 00 00 00 01 07 00 37 43 07 00 37 FF 00 00 00 04 07 00 03 01 07 00 60 07 03 45 00 00 FF 00 0B 00 00 00 01 07 00 37 FF 00 03 00 04 07 00 03 01 07 00 60 07 03 45 00 00 FF 00 0D 00 04 07 00 03 01 07 00 60 07 03 45 00 02 07 00 03 01 FF 00 02 00 04 07 00 03 01 07 00 60 07 03 45 00 03 07 00 03 01 01 FF 00 1E 00 04 07 00 03 01 07 00 60 07 03 45 00 02 07 00 03 01 44 07 00 37 FF 00 00 00 04 07 00 03 01 07 00 60 07 03 45 00 04 07 00 03 01 07 00 60 07 03 45 45 07 00 37 00 FF 00 0D 00 04 07 00 03 01 07 00 60 07 03 45 00 02 07 00 03 01 FF 00 02 00 04 07 00 03 01 07 00 60 07 03 45 00 03 07 00 03 01 01 FF 00 1D 00 04 07 00 03 01 07 00 60 07 03 45 00 02 07 00 03 01 FF 00 03 00 04 07 00 03 01 07 00 60 07 03 45 00 02 07 00 03 01 FF 00 01 00 04 07 00 03 01 07 00 60 07 03 45 00 02 07 00 03 01 41 07 00 37 43 05 44 07 00 37 47 05 FF 00 07 00 00 00 01 07 00 37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     149    157    Any
        //  149    157    149    157    Any
        //  77     84     84     85     Any
        //  77     84     77     78     Any
        //  77     84     77     78     Any
        //  77     84     84     85     Ljava/lang/StringIndexOutOfBoundsException;
        //  77     84     84     85     Ljava/lang/IllegalStateException;
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
}
