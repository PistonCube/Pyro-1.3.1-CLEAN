// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class f5t extends fH
{
    @NotNull
    public f0h c;
    @NotNull
    public f0a c;
    
    @NotNull
    public f0a 0() {
        return fbS.0F(this, 1255943851);
    }
    
    public static void c(final f5t f5t, final Minecraft c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0083:
            while (true) {
            Label_0066_Outer:
                do {
                    Label_0070: {
                        break Label_0070;
                        while (true) {
                            try {
                                o = null;
                                if (fc.c < 0) {
                                    continue Label_0083;
                                }
                                null;
                                Label_0029: {
                                    final int n = -1603930824;
                                }
                                // iftrue(Label_0029:, fc.0 == 0)
                                // switch([Lcom.strobel.decompiler.ast.Label;@13fc2a9e, n ^ 0xA09F860A)
                                while (true) {
                                    break Label_0031;
                                    Label_0060:
                                    f5t.c = c;
                                    return;
                                    Block_4: {
                                        break Block_4;
                                    }
                                    final int n = -1179039143;
                                    continue Label_0066_Outer;
                                }
                                continue;
                                Label_0064:
                                throw null;
                            }
                            catch (IllegalArgumentException ex) {
                                if (ex != null) {
                                    throw ex;
                                }
                                continue;
                            }
                            break;
                        }
                    }
                    continue Label_0083;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    @f06
    @LauncherEventHide
    public void c(@Nullable final f3h p0) {
        public class f5s implements Runnable
        {
            public f5t c;
            public int c;
            
            public f5s(final f5t c, final int c2) {
                while (true) {
                    int n = 0;
                    Label_0014: {
                        if (fc.c < 0) {
                            n = 1148742897;
                            break Label_0014;
                        }
                        n = -1070005365;
                    }
                    switch (n ^ 0xAB066F92) {
                        case 1015802761: {
                            continue;
                        }
                        default: {
                            this.c = c;
                            this.c = c2;
                            while (true) {
                                int n2 = 0;
                                Label_0066: {
                                    if (fc.c < 0) {
                                        n2 = 1126068372;
                                        break Label_0066;
                                    }
                                    n2 = -1564924464;
                                }
                                switch (n2 ^ 0xDB20AF66) {
                                    case -1740709902: {
                                        continue;
                                    }
                                    case 2040105654: {
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
                        case -276954269: {
                            throw null;
                        }
                    }
                    break;
                }
            }
            
            static {
                throw t;
            }
            
            @Override
            public void run() {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          611
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.c:I
                //    12: iflt            603
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            595
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: aload_0        
                //    25: getfield        dev/nuker/pyro/f5s.c:Ldev/nuker/pyro/f5t;
                //    28: getstatic       dev/nuker/pyro/fc.c:I
                //    31: ifge            39
                //    34: ldc             152465670
                //    36: goto            41
                //    39: ldc             -1299117424
                //    41: ldc             539595315
                //    43: ixor           
                //    44: lookupswitch {
                //          676967437: 39
                //          692052789: 578
                //          default: 72
                //        }
                //    72: goto            76
                //    75: athrow         
                //    76: invokestatic    dev/nuker/pyro/f5t.c:(Ldev/nuker/pyro/f5t;)Lnet/minecraft/client/Minecraft;
                //    79: goto            83
                //    82: athrow         
                //    83: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
                //    86: iconst_0       
                //    87: bipush          44
                //    89: iconst_0       
                //    90: getstatic       net/minecraft/inventory/ClickType.PICKUP:Lnet/minecraft/inventory/ClickType;
                //    93: aload_0        
                //    94: getfield        dev/nuker/pyro/f5s.c:Ldev/nuker/pyro/f5t;
                //    97: goto            101
                //   100: athrow         
                //   101: invokestatic    dev/nuker/pyro/f5t.c:(Ldev/nuker/pyro/f5t;)Lnet/minecraft/client/Minecraft;
                //   104: goto            108
                //   107: athrow         
                //   108: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
                //   111: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
                //   114: getstatic       dev/nuker/pyro/fc.1:I
                //   117: ifeq            125
                //   120: ldc             -958747161
                //   122: goto            127
                //   125: ldc             1182507251
                //   127: ldc             826015957
                //   129: ixor           
                //   130: lookupswitch {
                //          -135877326: 572
                //          1279573293: 125
                //          default: 156
                //        }
                //   156: goto            160
                //   159: athrow         
                //   160: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_187098_a:(IIILnet/minecraft/inventory/ClickType;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;
                //   163: goto            167
                //   166: athrow         
                //   167: pop            
                //   168: aload_0        
                //   169: getstatic       dev/nuker/pyro/fc.0:I
                //   172: ifeq            180
                //   175: ldc             -1492270659
                //   177: goto            182
                //   180: ldc             -1620092556
                //   182: ldc             7556138
                //   184: ixor           
                //   185: lookupswitch {
                //          -1625549474: 212
                //          -1484878441: 180
                //          default: 580
                //        }
                //   212: getfield        dev/nuker/pyro/f5s.c:Ldev/nuker/pyro/f5t;
                //   215: goto            219
                //   218: athrow         
                //   219: invokestatic    dev/nuker/pyro/f5t.c:(Ldev/nuker/pyro/f5t;)Lnet/minecraft/client/Minecraft;
                //   222: goto            226
                //   225: athrow         
                //   226: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
                //   229: iconst_0       
                //   230: aload_0        
                //   231: getfield        dev/nuker/pyro/f5s.c:I
                //   234: iconst_0       
                //   235: getstatic       net/minecraft/inventory/ClickType.PICKUP:Lnet/minecraft/inventory/ClickType;
                //   238: aload_0        
                //   239: getfield        dev/nuker/pyro/f5s.c:Ldev/nuker/pyro/f5t;
                //   242: getstatic       dev/nuker/pyro/fc.0:I
                //   245: ifeq            253
                //   248: ldc             -2095800800
                //   250: goto            255
                //   253: ldc             -822425941
                //   255: ldc             650963942
                //   257: ixor           
                //   258: lookupswitch {
                //          -1512540730: 582
                //          410010223: 253
                //          default: 284
                //        }
                //   284: goto            288
                //   287: athrow         
                //   288: invokestatic    dev/nuker/pyro/f5t.c:(Ldev/nuker/pyro/f5t;)Lnet/minecraft/client/Minecraft;
                //   291: goto            295
                //   294: athrow         
                //   295: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
                //   298: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
                //   301: goto            305
                //   304: athrow         
                //   305: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_187098_a:(IIILnet/minecraft/inventory/ClickType;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;
                //   308: goto            312
                //   311: athrow         
                //   312: pop            
                //   313: aload_0        
                //   314: getfield        dev/nuker/pyro/f5s.c:Ldev/nuker/pyro/f5t;
                //   317: getstatic       dev/nuker/pyro/fc.c:I
                //   320: ifge            328
                //   323: ldc             910620598
                //   325: goto            330
                //   328: ldc             1150754913
                //   330: ldc             -324327052
                //   332: ixor           
                //   333: lookupswitch {
                //          -1095958852: 328
                //          -621945150: 584
                //          default: 360
                //        }
                //   360: goto            364
                //   363: athrow         
                //   364: invokestatic    dev/nuker/pyro/f5t.c:(Ldev/nuker/pyro/f5t;)Lnet/minecraft/client/Minecraft;
                //   367: goto            371
                //   370: athrow         
                //   371: dup            
                //   372: pop            
                //   373: goto            377
                //   376: athrow         
                //   377: invokevirtual   net/minecraft/client/Minecraft.func_147114_u:()Lnet/minecraft/client/network/NetHandlerPlayClient;
                //   380: goto            384
                //   383: athrow         
                //   384: dup            
                //   385: ifnonnull       399
                //   388: goto            392
                //   391: athrow         
                //   392: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
                //   395: goto            399
                //   398: athrow         
                //   399: new             Lnet/minecraft/network/play/client/CPacketClickWindow;
                //   402: dup            
                //   403: iconst_0       
                //   404: iconst_0       
                //   405: iconst_0       
                //   406: getstatic       net/minecraft/inventory/ClickType.PICKUP:Lnet/minecraft/inventory/ClickType;
                //   409: new             Lnet/minecraft/item/ItemStack;
                //   412: dup            
                //   413: getstatic       dev/nuker/pyro/fc.c:I
                //   416: ifge            424
                //   419: ldc             960551042
                //   421: goto            426
                //   424: ldc             -942863334
                //   426: ldc             77408668
                //   428: ixor           
                //   429: lookupswitch {
                //          890165679: 424
                //          1037955358: 574
                //          default: 456
                //        }
                //   456: getstatic       net/minecraft/init/Items.field_190929_cY:Lnet/minecraft/item/Item;
                //   459: iconst_5       
                //   460: goto            464
                //   463: athrow         
                //   464: invokespecial   net/minecraft/item/ItemStack.<init>:(Lnet/minecraft/item/Item;I)V
                //   467: goto            471
                //   470: athrow         
                //   471: sipush          420
                //   474: goto            478
                //   477: athrow         
                //   478: invokespecial   net/minecraft/network/play/client/CPacketClickWindow.<init>:(IIILnet/minecraft/inventory/ClickType;Lnet/minecraft/item/ItemStack;S)V
                //   481: goto            485
                //   484: athrow         
                //   485: checkcast       Lnet/minecraft/network/Packet;
                //   488: goto            492
                //   491: athrow         
                //   492: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
                //   495: goto            499
                //   498: athrow         
                //   499: aload_0        
                //   500: getfield        dev/nuker/pyro/f5s.c:Ldev/nuker/pyro/f5t;
                //   503: goto            507
                //   506: athrow         
                //   507: invokestatic    dev/nuker/pyro/f5t.c:(Ldev/nuker/pyro/f5t;)Lnet/minecraft/client/Minecraft;
                //   510: goto            514
                //   513: athrow         
                //   514: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
                //   517: getstatic       dev/nuker/pyro/fc.c:I
                //   520: ifge            528
                //   523: ldc             -321421662
                //   525: goto            530
                //   528: ldc             -915447134
                //   530: ldc             2088201413
                //   532: ixor           
                //   533: lookupswitch {
                //          -1868557721: 576
                //          -811553774: 528
                //          default: 560
                //        }
                //   560: goto            564
                //   563: athrow         
                //   564: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78765_e:()V
                //   567: goto            571
                //   570: athrow         
                //   571: return         
                //   572: aconst_null    
                //   573: athrow         
                //   574: aconst_null    
                //   575: athrow         
                //   576: aconst_null    
                //   577: athrow         
                //   578: aconst_null    
                //   579: athrow         
                //   580: aconst_null    
                //   581: athrow         
                //   582: aconst_null    
                //   583: athrow         
                //   584: aconst_null    
                //   585: athrow         
                //   586: pop            
                //   587: goto            24
                //   590: pop            
                //   591: aconst_null    
                //   592: goto            586
                //   595: dup            
                //   596: ifnull          586
                //   599: checkcast       Ljava/lang/Throwable;
                //   602: athrow         
                //   603: dup            
                //   604: ifnull          590
                //   607: checkcast       Ljava/lang/Throwable;
                //   610: athrow         
                //   611: aconst_null    
                //   612: athrow         
                //    StackMapTable: 00 5D 43 07 00 3B 04 FF 00 0B 00 00 00 01 07 00 3B FC 00 03 07 00 03 4E 07 00 09 FF 00 01 00 01 07 00 03 00 02 07 00 09 01 5E 07 00 09 42 07 00 3B 40 07 00 09 45 07 00 3B 40 07 00 43 50 07 00 3B FF 00 00 00 01 07 00 03 00 06 07 00 5B 01 01 01 07 00 49 07 00 09 45 07 00 3B FF 00 00 00 01 07 00 03 00 06 07 00 5B 01 01 01 07 00 49 07 00 43 FF 00 10 00 01 07 00 03 00 06 07 00 5B 01 01 01 07 00 49 07 00 53 FF 00 01 00 01 07 00 03 00 07 07 00 5B 01 01 01 07 00 49 07 00 53 01 FF 00 1C 00 01 07 00 03 00 06 07 00 5B 01 01 01 07 00 49 07 00 53 FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 01 07 00 03 00 06 07 00 5B 01 01 01 07 00 49 07 00 53 45 07 00 3B 40 07 00 78 4C 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 45 07 00 3B 40 07 00 09 45 07 00 3B 40 07 00 43 FF 00 1A 00 01 07 00 03 00 06 07 00 5B 01 01 01 07 00 49 07 00 09 FF 00 01 00 01 07 00 03 00 07 07 00 5B 01 01 01 07 00 49 07 00 09 01 FF 00 1C 00 01 07 00 03 00 06 07 00 5B 01 01 01 07 00 49 07 00 09 42 07 00 3B FF 00 00 00 01 07 00 03 00 06 07 00 5B 01 01 01 07 00 49 07 00 09 45 07 00 3B FF 00 00 00 01 07 00 03 00 06 07 00 5B 01 01 01 07 00 49 07 00 43 48 07 00 3B FF 00 00 00 01 07 00 03 00 06 07 00 5B 01 01 01 07 00 49 07 00 53 45 07 00 3B 40 07 00 78 4F 07 00 09 FF 00 01 00 01 07 00 03 00 02 07 00 09 01 5D 07 00 09 FF 00 02 00 00 00 01 07 00 3B FF 00 00 00 01 07 00 03 00 01 07 00 09 45 07 00 3B 40 07 00 43 44 07 00 3B 40 07 00 43 45 07 00 3B 40 07 00 8B 46 07 00 3B 40 07 00 8B 45 07 00 3B 40 07 00 8B FF 00 18 00 01 07 00 03 00 09 07 00 8B 08 01 8F 08 01 8F 01 01 01 07 00 49 08 01 99 08 01 99 FF 00 01 00 01 07 00 03 00 0A 07 00 8B 08 01 8F 08 01 8F 01 01 01 07 00 49 08 01 99 08 01 99 01 FF 00 1D 00 01 07 00 03 00 09 07 00 8B 08 01 8F 08 01 8F 01 01 01 07 00 49 08 01 99 08 01 99 46 07 00 3B FF 00 00 00 01 07 00 03 00 0B 07 00 8B 08 01 8F 08 01 8F 01 01 01 07 00 49 08 01 99 08 01 99 07 00 97 01 45 07 00 3B FF 00 00 00 01 07 00 03 00 08 07 00 8B 08 01 8F 08 01 8F 01 01 01 07 00 49 07 00 78 45 07 00 99 FF 00 00 00 01 07 00 03 00 09 07 00 8B 08 01 8F 08 01 8F 01 01 01 07 00 49 07 00 78 01 45 07 00 3B FF 00 00 00 01 07 00 03 00 02 07 00 8B 07 00 76 FF 00 05 00 00 00 01 07 00 3B FF 00 00 00 01 07 00 03 00 02 07 00 8B 07 00 89 45 07 00 3B 00 FF 00 06 00 00 00 01 07 00 3B FF 00 00 00 01 07 00 03 00 01 07 00 09 45 07 00 3B 40 07 00 43 4D 07 00 5B FF 00 01 00 01 07 00 03 00 02 07 00 5B 01 5D 07 00 5B 42 07 00 39 40 07 00 5B 45 07 00 3B 00 FF 00 00 00 01 07 00 03 00 06 07 00 5B 01 01 01 07 00 49 07 00 53 FF 00 01 00 01 07 00 03 00 09 07 00 8B 08 01 8F 08 01 8F 01 01 01 07 00 49 08 01 99 08 01 99 41 07 00 5B 41 07 00 09 41 07 00 03 FF 00 01 00 01 07 00 03 00 06 07 00 5B 01 01 01 07 00 49 07 00 09 41 07 00 09 41 07 00 3B 43 05 44 07 00 3B 47 05 47 07 00 3B
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                       
                //  -----  -----  -----  -----  -------------------------------------------
                //  8      20     595    603    Any
                //  595    603    595    603    Any
                //  611    613    3      8      Any
                //  75     82     82     83     Any
                //  76     82     82     83     Any
                //  75     82     75     76     Any
                //  76     82     75     76     Any
                //  75     82     75     76     Any
                //  100    107    107    108    Any
                //  100    107    107    108    Any
                //  100    107    3      8      Ljava/lang/EnumConstantNotPresentException;
                //  100    107    3      8      Any
                //  100    107    100    101    Any
                //  160    166    166    167    Any
                //  160    166    166    167    Ljava/lang/AssertionError;
                //  160    166    166    167    Ljava/lang/ArrayIndexOutOfBoundsException;
                //  160    166    3      8      Any
                //  160    166    3      8      Ljava/lang/NumberFormatException;
                //  218    225    225    226    Any
                //  219    225    218    219    Any
                //  218    225    225    226    Any
                //  219    225    225    226    Ljava/lang/ClassCastException;
                //  218    225    218    219    Any
                //  287    294    294    295    Any
                //  287    294    287    288    Ljava/lang/ArrayIndexOutOfBoundsException;
                //  287    294    3      8      Any
                //  287    294    287    288    Any
                //  287    294    3      8      Any
                //  304    311    311    312    Any
                //  304    311    304    305    Ljava/lang/EnumConstantNotPresentException;
                //  305    311    304    305    Ljava/lang/ArrayIndexOutOfBoundsException;
                //  305    311    304    305    Any
                //  305    311    304    305    Ljava/lang/AssertionError;
                //  364    370    370    371    Any
                //  364    370    370    371    Ljava/lang/ArrayIndexOutOfBoundsException;
                //  364    370    370    371    Ljava/lang/AssertionError;
                //  364    370    3      8      Ljava/lang/ClassCastException;
                //  364    370    370    371    Any
                //  376    383    383    384    Any
                //  377    383    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
                //  376    383    376    377    Any
                //  376    383    3      8      Ljava/lang/NullPointerException;
                //  376    383    376    377    Ljava/lang/IllegalStateException;
                //  391    398    398    399    Any
                //  392    398    3      8      Ljava/util/ConcurrentModificationException;
                //  391    398    398    399    Any
                //  391    398    398    399    Ljava/lang/NumberFormatException;
                //  392    398    391    392    Any
                //  463    470    470    471    Any
                //  464    470    463    464    Ljava/lang/IllegalArgumentException;
                //  463    470    3      8      Any
                //  464    470    463    464    Any
                //  464    470    463    464    Any
                //  477    484    484    485    Any
                //  477    484    484    485    Ljava/lang/UnsupportedOperationException;
                //  477    484    3      8      Ljava/lang/ClassCastException;
                //  477    484    477    478    Ljava/lang/EnumConstantNotPresentException;
                //  477    484    477    478    Ljava/lang/NullPointerException;
                //  492    498    498    499    Any
                //  492    498    3      8      Any
                //  492    498    498    499    Ljava/lang/ClassCastException;
                //  492    498    3      8      Ljava/lang/IllegalStateException;
                //  492    498    498    499    Ljava/lang/EnumConstantNotPresentException;
                //  507    513    513    514    Any
                //  507    513    3      8      Ljava/util/NoSuchElementException;
                //  507    513    513    514    Any
                //  507    513    3      8      Any
                //  507    513    513    514    Any
                //  563    570    570    571    Any
                //  564    570    563    564    Ljava/util/NoSuchElementException;
                //  564    570    570    571    Any
                //  563    570    3      8      Any
                //  564    570    570    571    Ljava/lang/UnsupportedOperationException;
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
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          2432
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            2424
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            2416
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            36
        //    31: ldc             -2120903279
        //    33: goto            38
        //    36: ldc             807197981
        //    38: ldc             -647364469
        //    40: ixor           
        //    41: lookupswitch {
        //          -378085994: 68
        //          1493144858: 36
        //          default: 2383
        //        }
        //    68: getfield        dev/nuker/pyro/f5t.c:Ldev/nuker/pyro/f0h;
        //    71: goto            75
        //    74: athrow         
        //    75: invokevirtual   dev/nuker/pyro/f0h.c:()Z
        //    78: goto            82
        //    81: athrow         
        //    82: ifeq            2328
        //    85: iconst_0       
        //    86: istore_2       
        //    87: bipush          8
        //    89: istore_3       
        //    90: iload_2        
        //    91: getstatic       dev/nuker/pyro/fc.c:I
        //    94: ifge            102
        //    97: ldc             219433084
        //    99: goto            104
        //   102: ldc             563912372
        //   104: ldc             1305940138
        //   106: ixor           
        //   107: lookupswitch {
        //          1086544086: 102
        //          1816890910: 132
        //          default: 2351
        //        }
        //   132: iload_3        
        //   133: if_icmpgt       1003
        //   136: aload_0        
        //   137: getstatic       dev/nuker/pyro/fc.0:I
        //   140: ifeq            148
        //   143: ldc             1381738605
        //   145: goto            150
        //   148: ldc             2146457257
        //   150: ldc             1847216931
        //   152: ixor           
        //   153: lookupswitch {
        //          985404952: 148
        //          1010950990: 2343
        //          default: 180
        //        }
        //   180: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //   183: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   186: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   189: iload_2        
        //   190: goto            194
        //   193: athrow         
        //   194: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70301_a:(I)Lnet/minecraft/item/ItemStack;
        //   197: goto            201
        //   200: athrow         
        //   201: getstatic       dev/nuker/pyro/fc.c:I
        //   204: ifge            212
        //   207: ldc             1888066345
        //   209: goto            214
        //   212: ldc             -598869928
        //   214: ldc             -869878172
        //   216: ixor           
        //   217: lookupswitch {
        //          -1129370291: 212
        //          275467836: 244
        //          default: 2357
        //        }
        //   244: astore          4
        //   246: aload           4
        //   248: dup            
        //   249: pop            
        //   250: goto            254
        //   253: athrow         
        //   254: invokevirtual   net/minecraft/item/ItemStack.func_190926_b:()Z
        //   257: goto            261
        //   260: athrow         
        //   261: ifne            269
        //   264: ldc             1606235654
        //   266: goto            271
        //   269: ldc             1606235673
        //   271: ldc             -2000105847
        //   273: ixor           
        //   274: tableswitch {
        //          -1360269026: 296
        //          -1360269025: 997
        //          default: 264
        //        }
        //   296: aload           4
        //   298: goto            302
        //   301: athrow         
        //   302: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   305: goto            309
        //   308: athrow         
        //   309: getstatic       net/minecraft/init/Items.field_151079_bi:Lnet/minecraft/item/Item;
        //   312: goto            316
        //   315: athrow         
        //   316: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   319: goto            323
        //   322: athrow         
        //   323: ifeq            997
        //   326: aload_0        
        //   327: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //   330: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   333: getstatic       dev/nuker/pyro/fc.1:I
        //   336: ifeq            344
        //   339: ldc             -519862730
        //   341: goto            346
        //   344: ldc             -37840045
        //   346: ldc             1928465363
        //   348: ixor           
        //   349: lookupswitch {
        //          -1812886043: 2385
        //          714674361: 344
        //          default: 376
        //        }
        //   376: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   379: getstatic       dev/nuker/pyro/fc.1:I
        //   382: ifeq            390
        //   385: ldc             174854111
        //   387: goto            392
        //   390: ldc             409842501
        //   392: ldc             -231985507
        //   394: ixor           
        //   395: lookupswitch {
        //          -130014910: 2363
        //          47751273: 390
        //          default: 420
        //        }
        //   420: getfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //   423: iload_2        
        //   424: if_icmpeq       591
        //   427: aload_0        
        //   428: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //   431: getstatic       dev/nuker/pyro/fc.c:I
        //   434: ifge            442
        //   437: ldc             -1370896683
        //   439: goto            444
        //   442: ldc             -741941436
        //   444: ldc             -357781259
        //   446: ixor           
        //   447: lookupswitch {
        //          963276721: 472
        //          1155888672: 442
        //          default: 2397
        //        }
        //   472: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   475: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   478: new             Lnet/minecraft/network/play/client/CPacketHeldItemChange;
        //   481: dup            
        //   482: iload_2        
        //   483: getstatic       dev/nuker/pyro/fc.1:I
        //   486: ifeq            494
        //   489: ldc             918182175
        //   491: goto            496
        //   494: ldc             1006301322
        //   496: ldc             283267869
        //   498: ixor           
        //   499: lookupswitch {
        //          -1572057346: 494
        //          643303938: 2373
        //          default: 524
        //        }
        //   524: goto            528
        //   527: athrow         
        //   528: invokespecial   net/minecraft/network/play/client/CPacketHeldItemChange.<init>:(I)V
        //   531: goto            535
        //   534: athrow         
        //   535: checkcast       Lnet/minecraft/network/Packet;
        //   538: getstatic       dev/nuker/pyro/fc.0:I
        //   541: ifeq            549
        //   544: ldc             1995553047
        //   546: goto            551
        //   549: ldc             -939705723
        //   551: ldc             -1719308319
        //   553: ixor           
        //   554: lookupswitch {
        //          -277555466: 2359
        //          1861494496: 549
        //          default: 580
        //        }
        //   580: goto            584
        //   583: athrow         
        //   584: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   587: goto            591
        //   590: athrow         
        //   591: aload_0        
        //   592: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //   595: getstatic       dev/nuker/pyro/fc.1:I
        //   598: ifeq            606
        //   601: ldc             -1076547534
        //   603: goto            608
        //   606: ldc             -1695803177
        //   608: ldc             -670558992
        //   610: ixor           
        //   611: lookupswitch {
        //          1700405994: 606
        //          1742546114: 2389
        //          default: 636
        //        }
        //   636: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   639: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   642: new             Lnet/minecraft/network/play/client/CPacketPlayerTryUseItem;
        //   645: dup            
        //   646: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //   649: getstatic       dev/nuker/pyro/fc.0:I
        //   652: ifeq            660
        //   655: ldc             -1260973020
        //   657: goto            662
        //   660: ldc             -170103204
        //   662: ldc             -887930615
        //   664: ixor           
        //   665: lookupswitch {
        //          1053765461: 692
        //          2143573293: 660
        //          default: 2341
        //        }
        //   692: goto            696
        //   695: athrow         
        //   696: invokespecial   net/minecraft/network/play/client/CPacketPlayerTryUseItem.<init>:(Lnet/minecraft/util/EnumHand;)V
        //   699: goto            703
        //   702: athrow         
        //   703: checkcast       Lnet/minecraft/network/Packet;
        //   706: goto            710
        //   709: athrow         
        //   710: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   713: goto            717
        //   716: athrow         
        //   717: aload_0        
        //   718: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //   721: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   724: getstatic       dev/nuker/pyro/fc.1:I
        //   727: ifeq            735
        //   730: ldc             1570335046
        //   732: goto            737
        //   735: ldc             2054313670
        //   737: ldc             -1737738812
        //   739: ixor           
        //   740: lookupswitch {
        //          -973775742: 2349
        //          750735379: 735
        //          default: 768
        //        }
        //   768: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   771: getstatic       dev/nuker/pyro/fc.1:I
        //   774: ifeq            782
        //   777: ldc             355516760
        //   779: goto            784
        //   782: ldc             -1021038787
        //   784: ldc             -752397999
        //   786: ixor           
        //   787: lookupswitch {
        //          -971534327: 2391
        //          596429652: 782
        //          default: 812
        //        }
        //   812: getfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //   815: iload_2        
        //   816: if_icmpeq       996
        //   819: aload_0        
        //   820: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //   823: getstatic       dev/nuker/pyro/fc.0:I
        //   826: ifeq            834
        //   829: ldc             -1875782832
        //   831: goto            836
        //   834: ldc             -202339161
        //   836: ldc             1619802265
        //   838: ixor           
        //   839: lookupswitch {
        //          -1820543938: 864
        //          -255988791: 834
        //          default: 2379
        //        }
        //   864: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   867: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   870: new             Lnet/minecraft/network/play/client/CPacketHeldItemChange;
        //   873: dup            
        //   874: aload_0        
        //   875: getstatic       dev/nuker/pyro/fc.c:I
        //   878: ifge            886
        //   881: ldc             -355721148
        //   883: goto            888
        //   886: ldc             1542748980
        //   888: ldc             1070271315
        //   890: ixor           
        //   891: lookupswitch {
        //          -720950505: 886
        //          1681879143: 916
        //          default: 2365
        //        }
        //   916: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //   919: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   922: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   925: getstatic       dev/nuker/pyro/fc.0:I
        //   928: ifeq            936
        //   931: ldc             -1840052180
        //   933: goto            938
        //   936: ldc             -1052504978
        //   938: ldc             284515560
        //   940: ixor           
        //   941: lookupswitch {
        //          -2103028540: 2395
        //          558927777: 936
        //          default: 968
        //        }
        //   968: getfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //   971: goto            975
        //   974: athrow         
        //   975: invokespecial   net/minecraft/network/play/client/CPacketHeldItemChange.<init>:(I)V
        //   978: goto            982
        //   981: athrow         
        //   982: checkcast       Lnet/minecraft/network/Packet;
        //   985: goto            989
        //   988: athrow         
        //   989: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   992: goto            996
        //   995: athrow         
        //   996: return         
        //   997: iinc            2, 1
        //  1000: goto            90
        //  1003: aload_0        
        //  1004: getfield        dev/nuker/pyro/f5t.c:Ldev/nuker/pyro/f0a;
        //  1007: goto            1011
        //  1010: athrow         
        //  1011: invokevirtual   dev/nuker/pyro/f0a.3:()Ljava/lang/Object;
        //  1014: goto            1018
        //  1017: athrow         
        //  1018: checkcast       Ljava/lang/Boolean;
        //  1021: getstatic       dev/nuker/pyro/fc.c:I
        //  1024: ifge            1032
        //  1027: ldc             1336688173
        //  1029: goto            1034
        //  1032: ldc             -1816892228
        //  1034: ldc             -1309183648
        //  1036: ixor           
        //  1037: lookupswitch {
        //          -27570355: 2355
        //          2002930092: 1032
        //          default: 1064
        //        }
        //  1064: goto            1068
        //  1067: athrow         
        //  1068: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1071: goto            1075
        //  1074: athrow         
        //  1075: ifeq            2328
        //  1078: getstatic       dev/nuker/pyro/fbi.c:Ldev/nuker/pyro/fbi;
        //  1081: getstatic       dev/nuker/pyro/fc.1:I
        //  1084: ifeq            1092
        //  1087: ldc             2048837385
        //  1089: goto            1094
        //  1092: ldc             -839629750
        //  1094: ldc             1659944218
        //  1096: ixor           
        //  1097: lookupswitch {
        //          -21199303: 1092
        //          418282003: 2399
        //          default: 1124
        //        }
        //  1124: getstatic       net/minecraft/init/Items.field_151079_bi:Lnet/minecraft/item/Item;
        //  1127: goto            1131
        //  1130: athrow         
        //  1131: invokevirtual   dev/nuker/pyro/fbi.0:(Lnet/minecraft/item/Item;)I
        //  1134: goto            1138
        //  1137: athrow         
        //  1138: istore_2       
        //  1139: iload_2        
        //  1140: iconst_m1      
        //  1141: if_icmpeq       1149
        //  1144: ldc             -629737129
        //  1146: goto            1151
        //  1149: ldc             -629737136
        //  1151: ldc             -733201484
        //  1153: ixor           
        //  1154: tableswitch {
        //          477464006: 1176
        //          477464007: 2328
        //          default: 1144
        //        }
        //  1176: aload_0        
        //  1177: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //  1180: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  1183: iconst_0       
        //  1184: iload_2        
        //  1185: iconst_0       
        //  1186: getstatic       net/minecraft/inventory/ClickType.PICKUP:Lnet/minecraft/inventory/ClickType;
        //  1189: aload_0        
        //  1190: getstatic       dev/nuker/pyro/fc.c:I
        //  1193: ifge            1201
        //  1196: ldc             -1643798681
        //  1198: goto            1203
        //  1201: ldc             1772053953
        //  1203: ldc             -313041882
        //  1205: ixor           
        //  1206: lookupswitch {
        //          -2067252761: 1232
        //          1934803777: 1201
        //          default: 2333
        //        }
        //  1232: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //  1235: getstatic       dev/nuker/pyro/fc.1:I
        //  1238: ifeq            1246
        //  1241: ldc             1562257642
        //  1243: goto            1248
        //  1246: ldc             -454196864
        //  1248: ldc             4830869
        //  1250: ixor           
        //  1251: lookupswitch {
        //          1143602602: 1246
        //          1566023295: 2381
        //          default: 1276
        //        }
        //  1276: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1279: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //  1282: goto            1286
        //  1285: athrow         
        //  1286: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_187098_a:(IIILnet/minecraft/inventory/ClickType;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;
        //  1289: goto            1293
        //  1292: athrow         
        //  1293: pop            
        //  1294: aload_0        
        //  1295: getstatic       dev/nuker/pyro/fc.0:I
        //  1298: ifeq            1307
        //  1301: ldc_w           1686469517
        //  1304: goto            1310
        //  1307: ldc_w           -817121315
        //  1310: ldc_w           -1048065096
        //  1313: ixor           
        //  1314: lookupswitch {
        //          -1526550475: 1307
        //          248282213: 1340
        //          default: 2403
        //        }
        //  1340: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //  1343: getstatic       dev/nuker/pyro/fc.c:I
        //  1346: ifge            1355
        //  1349: ldc_w           -536292266
        //  1352: goto            1358
        //  1355: ldc_w           2131680202
        //  1358: ldc_w           1230556784
        //  1361: ixor           
        //  1362: lookupswitch {
        //          -1454368218: 2353
        //          1725440814: 1355
        //          default: 1388
        //        }
        //  1388: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  1391: iconst_0       
        //  1392: bipush          44
        //  1394: iconst_0       
        //  1395: getstatic       net/minecraft/inventory/ClickType.PICKUP:Lnet/minecraft/inventory/ClickType;
        //  1398: aload_0        
        //  1399: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //  1402: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1405: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //  1408: goto            1412
        //  1411: athrow         
        //  1412: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_187098_a:(IIILnet/minecraft/inventory/ClickType;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;
        //  1415: goto            1419
        //  1418: athrow         
        //  1419: pop            
        //  1420: aload_0        
        //  1421: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //  1424: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1427: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  1430: getstatic       dev/nuker/pyro/fc.0:I
        //  1433: ifeq            1442
        //  1436: ldc_w           -990594415
        //  1439: goto            1445
        //  1442: ldc_w           -1165479559
        //  1445: ldc_w           -773347626
        //  1448: ixor           
        //  1449: lookupswitch {
        //          -841305999: 1442
        //          353573959: 2367
        //          default: 1476
        //        }
        //  1476: getfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //  1479: getstatic       dev/nuker/pyro/fc.1:I
        //  1482: ifeq            1491
        //  1485: ldc_w           -1531044754
        //  1488: goto            1494
        //  1491: ldc_w           1008525783
        //  1494: ldc_w           -351179261
        //  1497: ixor           
        //  1498: lookupswitch {
        //          -686977068: 1524
        //          1336898157: 1491
        //          default: 2339
        //        }
        //  1524: istore_3       
        //  1525: getstatic       dev/nuker/pyro/fc.0:I
        //  1528: ifeq            1537
        //  1531: ldc_w           953026634
        //  1534: goto            1540
        //  1537: ldc_w           1576115155
        //  1540: ldc_w           -1807852537
        //  1543: ixor           
        //  1544: lookupswitch {
        //          -1393535923: 2361
        //          1685740131: 1537
        //          default: 1572
        //        }
        //  1572: iload_3        
        //  1573: bipush          8
        //  1575: if_icmpeq       1684
        //  1578: getstatic       dev/nuker/pyro/fc.c:I
        //  1581: ifge            1590
        //  1584: ldc_w           -933793192
        //  1587: goto            1593
        //  1590: ldc_w           -1137731984
        //  1593: ldc_w           38311404
        //  1596: ixor           
        //  1597: lookupswitch {
        //          -1683203219: 1590
        //          -903878732: 2369
        //          default: 1624
        //        }
        //  1624: aload_0        
        //  1625: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //  1628: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1631: getstatic       dev/nuker/pyro/fc.1:I
        //  1634: ifeq            1643
        //  1637: ldc_w           105148630
        //  1640: goto            1646
        //  1643: ldc_w           -1191653168
        //  1646: ldc_w           157964775
        //  1649: ixor           
        //  1650: lookupswitch {
        //          -270800901: 1643
        //          254683441: 2345
        //          default: 1676
        //        }
        //  1676: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  1679: bipush          8
        //  1681: putfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //  1684: getstatic       dev/nuker/pyro/fc.1:I
        //  1687: ifeq            1696
        //  1690: ldc_w           -851894464
        //  1693: goto            1699
        //  1696: ldc_w           655614822
        //  1699: ldc_w           -1906148251
        //  1702: ixor           
        //  1703: lookupswitch {
        //          1130062629: 2393
        //          1476653581: 1696
        //          default: 1728
        //        }
        //  1728: aload_0        
        //  1729: getstatic       dev/nuker/pyro/fc.0:I
        //  1732: ifeq            1741
        //  1735: ldc_w           -1625993370
        //  1738: goto            1744
        //  1741: ldc_w           -27584726
        //  1744: ldc_w           -1826144308
        //  1747: ixor           
        //  1748: lookupswitch {
        //          -1783909094: 1741
        //          204632234: 2387
        //          default: 1776
        //        }
        //  1776: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //  1779: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //  1782: getstatic       dev/nuker/pyro/fc.c:I
        //  1785: ifge            1794
        //  1788: ldc_w           -1709348482
        //  1791: goto            1797
        //  1794: ldc_w           1817987428
        //  1797: ldc_w           -151315486
        //  1800: ixor           
        //  1801: lookupswitch {
        //          -1700310394: 1828
        //          1827041948: 1794
        //          default: 2329
        //        }
        //  1828: aload_0        
        //  1829: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //  1832: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1835: checkcast       Lnet/minecraft/entity/player/EntityPlayer;
        //  1838: aload_0        
        //  1839: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //  1842: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //  1845: checkcast       Lnet/minecraft/world/World;
        //  1848: getstatic       dev/nuker/pyro/fc.0:I
        //  1851: ifeq            1860
        //  1854: ldc_w           -408861621
        //  1857: goto            1863
        //  1860: ldc_w           401679414
        //  1863: ldc_w           -1530377173
        //  1866: ixor           
        //  1867: lookupswitch {
        //          -2068347975: 1860
        //          1130956896: 2405
        //          default: 1892
        //        }
        //  1892: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //  1895: getstatic       dev/nuker/pyro/fc.0:I
        //  1898: ifeq            1907
        //  1901: ldc_w           1749591294
        //  1904: goto            1910
        //  1907: ldc_w           53188061
        //  1910: ldc_w           -1363319949
        //  1913: ixor           
        //  1914: lookupswitch {
        //          -956971123: 2371
        //          1024889927: 1907
        //          default: 1940
        //        }
        //  1940: goto            1944
        //  1943: athrow         
        //  1944: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_187101_a:(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;
        //  1947: goto            1951
        //  1950: athrow         
        //  1951: pop            
        //  1952: iload_3        
        //  1953: bipush          8
        //  1955: if_icmpeq       2108
        //  1958: aload_0        
        //  1959: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //  1962: getstatic       dev/nuker/pyro/fc.1:I
        //  1965: ifeq            1974
        //  1968: ldc_w           1922898218
        //  1971: goto            1977
        //  1974: ldc_w           908065066
        //  1977: ldc_w           -1207465523
        //  1980: ixor           
        //  1981: lookupswitch {
        //          -895840025: 2335
        //          750948178: 1974
        //          default: 2008
        //        }
        //  2008: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  2011: getstatic       dev/nuker/pyro/fc.0:I
        //  2014: ifeq            2023
        //  2017: ldc_w           -1685825200
        //  2020: goto            2026
        //  2023: ldc_w           -1009098144
        //  2026: ldc_w           -1212532272
        //  2029: ixor           
        //  2030: lookupswitch {
        //          727044426: 2023
        //          742285440: 2375
        //          default: 2056
        //        }
        //  2056: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //  2059: getstatic       dev/nuker/pyro/fc.c:I
        //  2062: ifge            2071
        //  2065: ldc_w           982691759
        //  2068: goto            2074
        //  2071: ldc_w           -491762764
        //  2074: ldc_w           -1090284773
        //  2077: ixor           
        //  2078: lookupswitch {
        //          -2054079308: 2071
        //          1572067503: 2104
        //          default: 2331
        //        }
        //  2104: iload_3        
        //  2105: putfield        net/minecraft/entity/player/InventoryPlayer.field_70461_c:I
        //  2108: aload_0        
        //  2109: getstatic       dev/nuker/pyro/fc.1:I
        //  2112: ifeq            2121
        //  2115: ldc_w           -1206203338
        //  2118: goto            2124
        //  2121: ldc_w           145666733
        //  2124: ldc_w           1111563322
        //  2127: ixor           
        //  2128: lookupswitch {
        //          -94646260: 2347
        //          1255077264: 2121
        //          default: 2156
        //        }
        //  2156: getfield        dev/nuker/pyro/f5t.c:Lnet/minecraft/client/Minecraft;
        //  2159: new             Ldev/nuker/pyro/f5s;
        //  2162: dup            
        //  2163: getstatic       dev/nuker/pyro/fc.c:I
        //  2166: ifge            2175
        //  2169: ldc_w           -609605971
        //  2172: goto            2178
        //  2175: ldc_w           1364566832
        //  2178: ldc_w           691998492
        //  2181: ixor           
        //  2182: lookupswitch {
        //          -225105487: 2175
        //          2020256812: 2208
        //          default: 2377
        //        }
        //  2208: aload_0        
        //  2209: getstatic       dev/nuker/pyro/fc.0:I
        //  2212: ifeq            2221
        //  2215: ldc_w           -121740414
        //  2218: goto            2224
        //  2221: ldc_w           -1479407487
        //  2224: ldc_w           1698902317
        //  2227: ixor           
        //  2228: lookupswitch {
        //          -1644342609: 2401
        //          -1609724186: 2221
        //          default: 2256
        //        }
        //  2256: iload_2        
        //  2257: goto            2261
        //  2260: athrow         
        //  2261: invokespecial   dev/nuker/pyro/f5s.<init>:(Ldev/nuker/pyro/f5t;I)V
        //  2264: goto            2268
        //  2267: athrow         
        //  2268: checkcast       Ljava/lang/Runnable;
        //  2271: getstatic       dev/nuker/pyro/fc.0:I
        //  2274: ifeq            2283
        //  2277: ldc_w           374610340
        //  2280: goto            2286
        //  2283: ldc_w           -615280539
        //  2286: ldc_w           -722216017
        //  2289: ixor           
        //  2290: lookupswitch {
        //          -1029193205: 2337
        //          -470953606: 2283
        //          default: 2316
        //        }
        //  2316: goto            2320
        //  2319: athrow         
        //  2320: invokevirtual   net/minecraft/client/Minecraft.func_152344_a:(Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
        //  2323: goto            2327
        //  2326: athrow         
        //  2327: pop            
        //  2328: return         
        //  2329: aconst_null    
        //  2330: athrow         
        //  2331: aconst_null    
        //  2332: athrow         
        //  2333: aconst_null    
        //  2334: athrow         
        //  2335: aconst_null    
        //  2336: athrow         
        //  2337: aconst_null    
        //  2338: athrow         
        //  2339: aconst_null    
        //  2340: athrow         
        //  2341: aconst_null    
        //  2342: athrow         
        //  2343: aconst_null    
        //  2344: athrow         
        //  2345: aconst_null    
        //  2346: athrow         
        //  2347: aconst_null    
        //  2348: athrow         
        //  2349: aconst_null    
        //  2350: athrow         
        //  2351: aconst_null    
        //  2352: athrow         
        //  2353: aconst_null    
        //  2354: athrow         
        //  2355: aconst_null    
        //  2356: athrow         
        //  2357: aconst_null    
        //  2358: athrow         
        //  2359: aconst_null    
        //  2360: athrow         
        //  2361: aconst_null    
        //  2362: athrow         
        //  2363: aconst_null    
        //  2364: athrow         
        //  2365: aconst_null    
        //  2366: athrow         
        //  2367: aconst_null    
        //  2368: athrow         
        //  2369: aconst_null    
        //  2370: athrow         
        //  2371: aconst_null    
        //  2372: athrow         
        //  2373: aconst_null    
        //  2374: athrow         
        //  2375: aconst_null    
        //  2376: athrow         
        //  2377: aconst_null    
        //  2378: athrow         
        //  2379: aconst_null    
        //  2380: athrow         
        //  2381: aconst_null    
        //  2382: athrow         
        //  2383: aconst_null    
        //  2384: athrow         
        //  2385: aconst_null    
        //  2386: athrow         
        //  2387: aconst_null    
        //  2388: athrow         
        //  2389: aconst_null    
        //  2390: athrow         
        //  2391: aconst_null    
        //  2392: athrow         
        //  2393: aconst_null    
        //  2394: athrow         
        //  2395: aconst_null    
        //  2396: athrow         
        //  2397: aconst_null    
        //  2398: athrow         
        //  2399: aconst_null    
        //  2400: athrow         
        //  2401: aconst_null    
        //  2402: athrow         
        //  2403: aconst_null    
        //  2404: athrow         
        //  2405: aconst_null    
        //  2406: athrow         
        //  2407: pop            
        //  2408: goto            24
        //  2411: pop            
        //  2412: aconst_null    
        //  2413: goto            2407
        //  2416: dup            
        //  2417: ifnull          2407
        //  2420: checkcast       Ljava/lang/Throwable;
        //  2423: athrow         
        //  2424: dup            
        //  2425: ifnull          2411
        //  2428: checkcast       Ljava/lang/Throwable;
        //  2431: athrow         
        //  2432: aconst_null    
        //  2433: athrow         
        //    StackMapTable: 00 FF 43 07 00 1C 04 FF 00 0B 00 00 00 01 07 00 1C FD 00 03 07 00 03 07 01 50 4B 07 00 03 FF 00 01 00 02 07 00 03 07 01 50 00 02 07 00 03 01 5D 07 00 03 45 07 00 1C 40 07 00 52 45 07 00 1C 40 01 FD 00 07 01 01 4B 01 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 02 01 01 5B 01 4F 07 00 03 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 02 07 00 03 01 5D 07 00 03 4C 07 00 1C FF 00 00 00 04 07 00 03 07 01 50 01 01 00 02 07 00 67 01 45 07 00 1C 40 07 00 70 4A 07 00 70 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 02 07 00 70 01 5D 07 00 70 FF 00 08 00 00 00 01 07 00 1C FF 00 00 00 05 07 00 03 07 01 50 01 01 07 00 70 00 01 07 00 70 45 07 00 1C 40 01 02 04 41 01 18 44 07 00 36 40 07 00 70 45 07 00 1C 40 07 01 52 FF 00 05 00 00 00 01 07 00 1C FF 00 00 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 01 52 07 01 52 45 07 00 1C 40 01 54 07 00 61 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 00 61 01 5D 07 00 61 4D 07 00 67 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 00 67 01 5B 07 00 67 55 07 00 26 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 00 26 01 5B 07 00 26 FF 00 15 00 05 07 00 03 07 01 50 01 01 07 00 70 00 04 07 00 A6 08 01 DE 08 01 DE 01 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 05 07 00 A6 08 01 DE 08 01 DE 01 01 FF 00 1B 00 05 07 00 03 07 01 50 01 01 07 00 70 00 04 07 00 A6 08 01 DE 08 01 DE 01 42 07 00 1C FF 00 00 00 05 07 00 03 07 01 50 01 01 07 00 70 00 04 07 00 A6 08 01 DE 08 01 DE 01 45 07 00 1C FF 00 00 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 00 A6 07 00 98 FF 00 0D 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 00 A6 07 00 A1 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 03 07 00 A6 07 00 A1 01 FF 00 1C 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 00 A6 07 00 A1 42 07 00 46 FF 00 00 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 00 A6 07 00 A1 45 07 00 1C 00 4E 07 00 26 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 00 26 01 5B 07 00 26 FF 00 17 00 05 07 00 03 07 01 50 01 01 07 00 70 00 04 07 00 A6 08 02 82 08 02 82 07 00 B1 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 05 07 00 A6 08 02 82 08 02 82 07 00 B1 01 FF 00 1D 00 05 07 00 03 07 01 50 01 01 07 00 70 00 04 07 00 A6 08 02 82 08 02 82 07 00 B1 42 07 00 42 FF 00 00 00 05 07 00 03 07 01 50 01 01 07 00 70 00 04 07 00 A6 08 02 82 08 02 82 07 00 B1 45 07 00 1C FF 00 00 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 00 A6 07 00 AF 45 07 00 1C FF 00 00 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 00 A6 07 00 A1 45 07 00 1C 00 51 07 00 61 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 00 61 01 5E 07 00 61 4D 07 00 67 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 00 67 01 5B 07 00 67 55 07 00 26 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 00 26 01 5B 07 00 26 FF 00 15 00 05 07 00 03 07 01 50 01 01 07 00 70 00 04 07 00 A6 08 03 66 08 03 66 07 00 03 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 05 07 00 A6 08 03 66 08 03 66 07 00 03 01 FF 00 1B 00 05 07 00 03 07 01 50 01 01 07 00 70 00 04 07 00 A6 08 03 66 08 03 66 07 00 03 FF 00 13 00 05 07 00 03 07 01 50 01 01 07 00 70 00 04 07 00 A6 08 03 66 08 03 66 07 00 67 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 05 07 00 A6 08 03 66 08 03 66 07 00 67 01 FF 00 1D 00 05 07 00 03 07 01 50 01 01 07 00 70 00 04 07 00 A6 08 03 66 08 03 66 07 00 67 FF 00 05 00 00 00 01 07 00 1C FF 00 00 00 05 07 00 03 07 01 50 01 01 07 00 70 00 04 07 00 A6 08 03 66 08 03 66 01 45 07 00 1C FF 00 00 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 00 A6 07 00 98 45 07 00 1C FF 00 00 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 00 A6 07 00 A1 45 07 00 1C 00 00 FA 00 05 FF 00 06 00 00 00 01 07 00 1C FF 00 00 00 04 07 00 03 07 01 50 01 01 00 01 07 00 CE 45 07 00 1C 40 07 01 54 4D 07 00 D4 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 02 07 00 D4 01 5D 07 00 D4 FF 00 02 00 00 00 01 07 00 1C FF 00 00 00 04 07 00 03 07 01 50 01 01 00 01 07 00 D4 45 07 00 1C 40 01 50 07 00 DC FF 00 01 00 04 07 00 03 07 01 50 01 01 00 02 07 00 DC 01 5D 07 00 DC 45 07 00 46 FF 00 00 00 04 07 00 03 07 01 50 01 01 00 02 07 00 DC 07 01 52 45 07 00 1C 40 01 05 04 41 01 18 FF 00 18 00 04 07 00 03 07 01 50 01 01 00 06 07 00 FC 01 01 01 07 00 EE 07 00 03 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 07 07 00 FC 01 01 01 07 00 EE 07 00 03 01 FF 00 1C 00 04 07 00 03 07 01 50 01 01 00 06 07 00 FC 01 01 01 07 00 EE 07 00 03 FF 00 0D 00 04 07 00 03 07 01 50 01 01 00 06 07 00 FC 01 01 01 07 00 EE 07 00 26 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 07 07 00 FC 01 01 01 07 00 EE 07 00 26 01 FF 00 1B 00 04 07 00 03 07 01 50 01 01 00 06 07 00 FC 01 01 01 07 00 EE 07 00 26 48 07 00 1C FF 00 00 00 04 07 00 03 07 01 50 01 01 00 06 07 00 FC 01 01 01 07 00 EE 07 00 FA 45 07 00 1C 40 07 00 70 4D 07 00 03 FF 00 02 00 04 07 00 03 07 01 50 01 01 00 02 07 00 03 01 5D 07 00 03 4E 07 00 26 FF 00 02 00 04 07 00 03 07 01 50 01 01 00 02 07 00 26 01 5D 07 00 26 56 07 00 1C FF 00 00 00 04 07 00 03 07 01 50 01 01 00 06 07 00 FC 01 01 01 07 00 EE 07 00 FA 45 07 00 1C 40 07 00 70 56 07 00 67 FF 00 02 00 04 07 00 03 07 01 50 01 01 00 02 07 00 67 01 5E 07 00 67 4E 01 FF 00 02 00 04 07 00 03 07 01 50 01 01 00 02 01 01 5D 01 0C 42 01 1F 11 42 01 1E 52 07 00 61 FF 00 02 00 04 07 00 03 07 01 50 01 01 00 02 07 00 61 01 5D 07 00 61 07 0B 42 01 1C 4C 07 00 03 FF 00 02 00 04 07 00 03 07 01 50 01 01 00 02 07 00 03 01 5F 07 00 03 51 07 00 FC FF 00 02 00 04 07 00 03 07 01 50 01 01 00 02 07 00 FC 01 5E 07 00 FC FF 00 1F 00 04 07 00 03 07 01 50 01 01 00 03 07 00 FC 07 00 FA 07 01 24 FF 00 02 00 04 07 00 03 07 01 50 01 01 00 04 07 00 FC 07 00 FA 07 01 24 01 FF 00 1C 00 04 07 00 03 07 01 50 01 01 00 03 07 00 FC 07 00 FA 07 01 24 FF 00 0E 00 04 07 00 03 07 01 50 01 01 00 04 07 00 FC 07 00 FA 07 01 24 07 00 B1 FF 00 02 00 04 07 00 03 07 01 50 01 01 00 05 07 00 FC 07 00 FA 07 01 24 07 00 B1 01 FF 00 1D 00 04 07 00 03 07 01 50 01 01 00 04 07 00 FC 07 00 FA 07 01 24 07 00 B1 42 07 00 1C FF 00 00 00 04 07 00 03 07 01 50 01 01 00 04 07 00 FC 07 00 FA 07 01 24 07 00 B1 45 07 00 1C 40 07 01 56 56 07 00 26 FF 00 02 00 04 07 00 03 07 01 50 01 01 00 02 07 00 26 01 5E 07 00 26 4E 07 00 61 FF 00 02 00 04 07 00 03 07 01 50 01 01 00 02 07 00 61 01 5D 07 00 61 4E 07 00 67 FF 00 02 00 04 07 00 03 07 01 50 01 01 00 02 07 00 67 01 5D 07 00 67 03 4C 07 00 03 FF 00 02 00 04 07 00 03 07 01 50 01 01 00 02 07 00 03 01 5F 07 00 03 FF 00 12 00 04 07 00 03 07 01 50 01 01 00 03 07 00 26 08 08 6F 08 08 6F FF 00 02 00 04 07 00 03 07 01 50 01 01 00 04 07 00 26 08 08 6F 08 08 6F 01 FF 00 1D 00 04 07 00 03 07 01 50 01 01 00 03 07 00 26 08 08 6F 08 08 6F FF 00 0C 00 04 07 00 03 07 01 50 01 01 00 04 07 00 26 08 08 6F 08 08 6F 07 00 03 FF 00 02 00 04 07 00 03 07 01 50 01 01 00 05 07 00 26 08 08 6F 08 08 6F 07 00 03 01 FF 00 1F 00 04 07 00 03 07 01 50 01 01 00 04 07 00 26 08 08 6F 08 08 6F 07 00 03 43 07 00 1C FF 00 00 00 04 07 00 03 07 01 50 01 01 00 05 07 00 26 08 08 6F 08 08 6F 07 00 03 01 45 07 00 1C FF 00 00 00 04 07 00 03 07 01 50 01 01 00 02 07 00 26 07 01 3C FF 00 0E 00 04 07 00 03 07 01 50 01 01 00 02 07 00 26 07 01 47 FF 00 02 00 04 07 00 03 07 01 50 01 01 00 03 07 00 26 07 01 47 01 FF 00 1D 00 04 07 00 03 07 01 50 01 01 00 02 07 00 26 07 01 47 42 07 00 1C FF 00 00 00 04 07 00 03 07 01 50 01 01 00 02 07 00 26 07 01 47 45 07 00 1C 40 07 01 58 F9 00 00 FF 00 00 00 04 07 00 03 07 01 50 01 01 00 01 07 00 FC 41 07 00 67 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 06 07 00 FC 01 01 01 07 00 EE 07 00 03 41 07 00 26 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 02 07 00 26 07 01 47 41 01 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 04 07 00 A6 08 02 82 08 02 82 07 00 B1 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 01 07 00 03 41 07 00 61 41 07 00 03 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 01 07 00 61 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 01 01 41 07 00 26 41 07 00 D4 41 07 00 70 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 02 07 00 A6 07 00 A1 FA 00 01 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 01 07 00 67 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 04 07 00 A6 08 03 66 08 03 66 07 00 03 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 01 07 00 67 01 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 04 07 00 FC 07 00 FA 07 01 24 07 00 B1 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 04 07 00 A6 08 01 DE 08 01 DE 01 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 01 07 00 61 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 03 07 00 26 08 08 6F 08 08 6F FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 01 07 00 26 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 06 07 00 FC 01 01 01 07 00 EE 07 00 26 FF 00 01 00 02 07 00 03 07 01 50 00 01 07 00 03 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 01 07 00 61 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 01 07 00 03 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 01 07 00 26 41 07 00 67 FA 00 01 FF 00 01 00 05 07 00 03 07 01 50 01 01 07 00 70 00 04 07 00 A6 08 03 66 08 03 66 07 00 67 41 07 00 26 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 01 07 00 DC FF 00 01 00 04 07 00 03 07 01 50 01 01 00 04 07 00 26 08 08 6F 08 08 6F 07 00 03 41 07 00 03 FF 00 01 00 04 07 00 03 07 01 50 01 01 00 03 07 00 FC 07 00 FA 07 01 24 FF 00 01 00 02 07 00 03 07 01 50 00 01 07 00 1C 43 05 44 07 00 1C 47 05 47 07 00 1C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     2416   2424   Ljava/lang/IllegalStateException;
        //  2416   2424   2416   2424   Any
        //  2432   2434   3      8      Ljava/lang/NumberFormatException;
        //  74     81     81     82     Any
        //  74     81     74     75     Any
        //  75     81     81     82     Ljava/util/NoSuchElementException;
        //  75     81     3      8      Any
        //  75     81     3      8      Any
        //  193    200    200    201    Any
        //  194    200    193    194    Any
        //  193    200    200    201    Any
        //  193    200    200    201    Ljava/lang/IndexOutOfBoundsException;
        //  193    200    193    194    Any
        //  254    260    260    261    Any
        //  254    260    3      8      Any
        //  254    260    3      8      Any
        //  254    260    3      8      Any
        //  254    260    3      8      Any
        //  301    308    308    309    Any
        //  301    308    308    309    Ljava/util/ConcurrentModificationException;
        //  301    308    301    302    Ljava/lang/NegativeArraySizeException;
        //  302    308    308    309    Any
        //  302    308    3      8      Any
        //  316    322    322    323    Any
        //  316    322    3      8      Ljava/lang/ClassCastException;
        //  316    322    3      8      Any
        //  316    322    322    323    Any
        //  316    322    3      8      Ljava/lang/ClassCastException;
        //  527    534    534    535    Any
        //  527    534    534    535    Ljava/util/NoSuchElementException;
        //  527    534    527    528    Any
        //  528    534    3      8      Ljava/lang/AssertionError;
        //  527    534    527    528    Any
        //  583    590    590    591    Any
        //  583    590    583    584    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  584    590    583    584    Ljava/lang/IndexOutOfBoundsException;
        //  583    590    590    591    Ljava/lang/UnsupportedOperationException;
        //  584    590    583    584    Ljava/lang/ArithmeticException;
        //  695    702    702    703    Any
        //  696    702    702    703    Ljava/lang/IndexOutOfBoundsException;
        //  695    702    695    696    Ljava/lang/NullPointerException;
        //  696    702    702    703    Any
        //  696    702    702    703    Ljava/lang/UnsupportedOperationException;
        //  709    716    716    717    Any
        //  709    716    709    710    Ljava/lang/IllegalStateException;
        //  709    716    709    710    Any
        //  710    716    709    710    Any
        //  710    716    709    710    Any
        //  975    981    981    982    Any
        //  975    981    3      8      Ljava/lang/IllegalStateException;
        //  975    981    981    982    Any
        //  975    981    3      8      Any
        //  975    981    981    982    Any
        //  988    995    995    996    Any
        //  988    995    988    989    Any
        //  988    995    995    996    Any
        //  988    995    995    996    Ljava/lang/ClassCastException;
        //  989    995    995    996    Ljava/lang/NumberFormatException;
        //  1011   1017   1017   1018   Any
        //  1011   1017   1017   1018   Ljava/lang/IllegalStateException;
        //  1011   1017   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1011   1017   3      8      Ljava/lang/NegativeArraySizeException;
        //  1011   1017   3      8      Ljava/util/NoSuchElementException;
        //  1068   1074   1074   1075   Any
        //  1068   1074   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  1068   1074   3      8      Ljava/lang/EnumConstantNotPresentException;
        //  1068   1074   3      8      Any
        //  1068   1074   1074   1075   Any
        //  1130   1137   1137   1138   Any
        //  1130   1137   1130   1131   Ljava/lang/NegativeArraySizeException;
        //  1130   1137   1137   1138   Any
        //  1131   1137   1137   1138   Ljava/lang/IllegalStateException;
        //  1130   1137   1130   1131   Ljava/lang/NumberFormatException;
        //  1285   1292   1292   1293   Any
        //  1285   1292   1285   1286   Any
        //  1286   1292   1285   1286   Any
        //  1286   1292   1285   1286   Any
        //  1285   1292   1292   1293   Any
        //  1411   1418   1418   1419   Any
        //  1411   1418   1411   1412   Any
        //  1411   1418   1411   1412   Any
        //  1412   1418   1411   1412   Ljava/lang/UnsupportedOperationException;
        //  1412   1418   1411   1412   Any
        //  1943   1950   1950   1951   Any
        //  1944   1950   1943   1944   Ljava/lang/NullPointerException;
        //  1943   1950   1943   1944   Any
        //  1943   1950   3      8      Ljava/lang/ArithmeticException;
        //  1943   1950   3      8      Ljava/lang/NullPointerException;
        //  2260   2267   2267   2268   Any
        //  2261   2267   2267   2268   Ljava/lang/RuntimeException;
        //  2261   2267   2260   2261   Any
        //  2261   2267   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  2261   2267   3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  2319   2326   2326   2327   Any
        //  2320   2326   2326   2327   Ljava/lang/NumberFormatException;
        //  2320   2326   2319   2320   Ljava/lang/ClassCastException;
        //  2320   2326   2319   2320   Ljava/lang/StringIndexOutOfBoundsException;
        //  2320   2326   2319   2320   Any
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
    
    public static Minecraft c(final f5t f5t) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0038:
            while (true) {
                do {
                    Label_0025: {
                        break Label_0025;
                        try {
                            o = null;
                            if (fc.1 <= 0) {
                                null;
                                goto Label_0030;
                            }
                            continue Label_0038;
                            return f5t.c;
                        }
                        catch (RuntimeException ex) {}
                    }
                    continue Label_0038;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public f5t() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifge            12
        //     6: ldc_w           1003984285
        //     9: goto            15
        //    12: ldc_w           1709206407
        //    15: ldc_w           -2065552625
        //    18: ixor           
        //    19: lookupswitch {
        //          -1086996846: 12
        //          -519946104: 44
        //          default: 332
        //        }
        //    44: aload_0        
        //    45: ldc_w           "\u23c6\u1496\u8ac5\ub3e9\uc987\uedca\ub236\ue6fd"
        //    48: invokestatic    invokestatic   !!! ERROR
        //    51: ldc_w           "\u23e6\u1496\u8ac5\ub3e9\uc987\uedca\ub236\ue6fd"
        //    54: invokestatic    invokestatic   !!! ERROR
        //    57: ldc_w           "\u23ec\u149f\u8ad0\ub3d6\uc995\uedd8\ub264\ue6e8\ud967\ue9e4\ua74b\u1e58\ue1da\uc5e7\u8177\u8945\u57b0\u773b\ubd30\uc04c\u2b2b\uc232\u6a3f\u2d57\ud79f\u35a4\u7d32\u89df\u8005\u8cde\u849f\ufb3d\u70f4\u9a56\u1bc5\uf10a\u496c\u8855\uca87\uff74\ub6f9\u41b3\ub9c3\ub35a\u4c3b\u8ad5\u7c29\uce15\u7d40\uea9a\ue6e2\u16d0\uee62\u379c\u46ee\ue191\u0a1e\u86ee\u1995\u0f1a\u773f\u7298\uc7c9\ubbfa\u9a95\u6a36\ue2f0\ud000\ua523\u2598\u8994\u4fb3\u8b59\u1448\ua382\u70ef\u55a3\u1c5c\u618f\u11cf\u885c\u0533\uf8b0\u267b\u1951\ub9d8\u7cb8\u4bb1\u1a58\u24da\uce04\ub2f7\ued1b\u7677\u4e3f\uee6a\uf82d\u413d\u715c\u52b9\u86f0"
        //    60: invokestatic    invokestatic   !!! ERROR
        //    63: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    66: aload_0        
        //    67: new             Ldev/nuker/pyro/f0h;
        //    70: dup            
        //    71: ldc_w           "\u23dd\u1496\u8add\ub3cb\uc98e\uede0\ub221\ue6e8"
        //    74: invokestatic    invokestatic   !!! ERROR
        //    77: ldc_w           "\u23fd\u1496\u8add\ub3cb\uc98e\uede0\ub221\ue6e8"
        //    80: invokestatic    invokestatic   !!! ERROR
        //    83: ldc_w           "\u23f9\u149b\u8ad9\ub399\uc989\uedce\ub23d\ue6b1\ud967\ue9e3\ua74b\u1e41\ue1da\uc5b2\u8165\u8955\u57e4\u7736\ubd28\uc059\u2b2b\uc234\u6a32\u2d16\ud787\u35a7\u7d6b\u898c\u8014\u8cc2"
        //    86: invokestatic    invokestatic   !!! ERROR
        //    89: iconst_m1      
        //    90: getstatic       dev/nuker/pyro/fc.c:I
        //    93: ifge            102
        //    96: ldc_w           1286752326
        //    99: goto            105
        //   102: ldc_w           1020780048
        //   105: ldc_w           792601896
        //   108: ixor           
        //   109: lookupswitch {
        //          -1377636421: 102
        //          1670147438: 328
        //          default: 136
        //        }
        //   136: invokespecial   dev/nuker/pyro/f0h.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
        //   139: getstatic       dev/nuker/pyro/fc.0:I
        //   142: ifeq            151
        //   145: ldc_w           361150038
        //   148: goto            154
        //   151: ldc_w           1949349017
        //   154: ldc_w           -637586736
        //   157: ixor           
        //   158: lookupswitch {
        //          -1378908599: 184
        //          -864451450: 151
        //          default: 336
        //        }
        //   184: putfield        dev/nuker/pyro/f5t.c:Ldev/nuker/pyro/f0h;
        //   187: aload_0        
        //   188: new             Ldev/nuker/pyro/f0a;
        //   191: dup            
        //   192: ldc_w           "\u23c4\u149d\u8aca\ub3dc\uc98c\ueddf\ub22b\ue6e3\ud971"
        //   195: invokestatic    invokestatic   !!! ERROR
        //   198: ldc_w           "\u23e4\u149d\u8aca\ub3dc\uc98c\ueddf\ub22b\ue6e3\ud971"
        //   201: getstatic       dev/nuker/pyro/fc.1:I
        //   204: ifeq            213
        //   207: ldc_w           -1970155468
        //   210: goto            216
        //   213: ldc_w           -1327732916
        //   216: ldc_w           -989259839
        //   219: ixor           
        //   220: lookupswitch {
        //          1335412725: 213
        //          1976922253: 248
        //          default: 334
        //        }
        //   248: invokestatic    invokestatic   !!! ERROR
        //   251: aconst_null    
        //   252: iconst_0       
        //   253: invokespecial   dev/nuker/pyro/f0a.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
        //   256: putfield        dev/nuker/pyro/f5t.c:Ldev/nuker/pyro/f0a;
        //   259: aload_0        
        //   260: getstatic       dev/nuker/pyro/fc.c:I
        //   263: ifge            272
        //   266: ldc_w           -2021905389
        //   269: goto            275
        //   272: ldc_w           483198649
        //   275: ldc_w           -693841600
        //   278: ixor           
        //   279: lookupswitch {
        //          1373175123: 330
        //          1904008385: 272
        //          default: 304
        //        }
        //   304: aload_0        
        //   305: getfield        dev/nuker/pyro/f5t.c:Ldev/nuker/pyro/f0h;
        //   308: checkcast       Ldev/nuker/pyro/f0n;
        //   311: invokevirtual   dev/nuker/pyro/f5t.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   314: pop            
        //   315: aload_0        
        //   316: aload_0        
        //   317: getfield        dev/nuker/pyro/f5t.c:Ldev/nuker/pyro/f0a;
        //   320: checkcast       Ldev/nuker/pyro/f0n;
        //   323: invokevirtual   dev/nuker/pyro/f5t.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   326: pop            
        //   327: return         
        //   328: aconst_null    
        //   329: athrow         
        //   330: aconst_null    
        //   331: athrow         
        //   332: aconst_null    
        //   333: athrow         
        //   334: aconst_null    
        //   335: athrow         
        //   336: aconst_null    
        //   337: athrow         
        //    StackMapTable: 00 14 0C 42 01 1C FF 00 39 00 01 07 00 03 00 07 07 00 03 08 00 43 08 00 43 07 01 8E 07 01 8E 07 01 8E 01 FF 00 02 00 01 07 00 03 00 08 07 00 03 08 00 43 08 00 43 07 01 8E 07 01 8E 07 01 8E 01 01 FF 00 1E 00 01 07 00 03 00 07 07 00 03 08 00 43 08 00 43 07 01 8E 07 01 8E 07 01 8E 01 FF 00 0E 00 01 07 00 03 00 02 07 00 03 07 00 52 FF 00 02 00 01 07 00 03 00 03 07 00 03 07 00 52 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 52 FF 00 1C 00 01 07 00 03 00 05 07 00 03 08 00 BC 08 00 BC 07 01 8E 07 01 8E FF 00 02 00 01 07 00 03 00 06 07 00 03 08 00 BC 08 00 BC 07 01 8E 07 01 8E 01 FF 00 1F 00 01 07 00 03 00 05 07 00 03 08 00 BC 08 00 BC 07 01 8E 07 01 8E 57 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5C 07 00 03 FF 00 17 00 01 07 00 03 00 07 07 00 03 08 00 43 08 00 43 07 01 8E 07 01 8E 07 01 8E 01 41 07 00 03 FF 00 01 00 01 06 00 00 FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 BC 08 00 BC 07 01 8E 07 01 8E FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 52
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
    
    @NotNull
    public f0h c() {
        return fbS.98(this, 1663602845);
    }
    
    static {
        throw t;
    }
}
