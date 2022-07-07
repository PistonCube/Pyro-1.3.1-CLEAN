// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import java.util.List;

public class fbq
{
    public static List<EntityOtherPlayerMP> c;
    public static List<EntityOtherPlayerMP> 0;
    public static fbq c;
    
    @NotNull
    public EntityOtherPlayerMP 0(@NotNull final EntityPlayer p0, final int p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          460
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            452
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            444
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: new             Lnet/minecraft/client/entity/EntityOtherPlayerMP;
        //    29: dup            
        //    30: aload_1        
        //    31: getfield        net/minecraft/entity/player/EntityPlayer.field_70170_p:Lnet/minecraft/world/World;
        //    34: aload_1        
        //    35: getstatic       dev/nuker/pyro/fc.0:I
        //    38: ifeq            46
        //    41: ldc             1435785955
        //    43: goto            48
        //    46: ldc             1061220778
        //    48: ldc             2140338105
        //    50: ixor           
        //    51: lookupswitch {
        //          -1284636285: 46
        //          705080666: 427
        //          default: 76
        //        }
        //    76: goto            80
        //    79: athrow         
        //    80: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_146103_bH:()Lcom/mojang/authlib/GameProfile;
        //    83: goto            87
        //    86: athrow         
        //    87: goto            91
        //    90: athrow         
        //    91: invokespecial   net/minecraft/client/entity/EntityOtherPlayerMP.<init>:(Lnet/minecraft/world/World;Lcom/mojang/authlib/GameProfile;)V
        //    94: goto            98
        //    97: athrow         
        //    98: astore          4
        //   100: aload           4
        //   102: aload_1        
        //   103: checkcast       Lnet/minecraft/entity/Entity;
        //   106: goto            110
        //   109: athrow         
        //   110: invokevirtual   net/minecraft/client/entity/EntityOtherPlayerMP.func_82149_j:(Lnet/minecraft/entity/Entity;)V
        //   113: goto            117
        //   116: athrow         
        //   117: aload           4
        //   119: getstatic       dev/nuker/pyro/fc.1:I
        //   122: ifeq            130
        //   125: ldc             2120252680
        //   127: goto            132
        //   130: ldc             -1940846580
        //   132: ldc             93217860
        //   134: ixor           
        //   135: lookupswitch {
        //          -1621760635: 130
        //          2079201612: 429
        //          default: 160
        //        }
        //   160: aload_1        
        //   161: getfield        net/minecraft/entity/player/EntityPlayer.field_70177_z:F
        //   164: getstatic       dev/nuker/pyro/fc.c:I
        //   167: ifge            175
        //   170: ldc             567112537
        //   172: goto            177
        //   175: ldc             -1990250512
        //   177: ldc             -1333939885
        //   179: ixor           
        //   180: lookupswitch {
        //          -1850686966: 175
        //          958570147: 208
        //          default: 423
        //        }
        //   208: putfield        net/minecraft/client/entity/EntityOtherPlayerMP.field_70177_z:F
        //   211: aload           4
        //   213: aload_1        
        //   214: getfield        net/minecraft/entity/player/EntityPlayer.field_70759_as:F
        //   217: putfield        net/minecraft/client/entity/EntityOtherPlayerMP.field_70759_as:F
        //   220: goto            224
        //   223: athrow         
        //   224: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   227: goto            231
        //   230: athrow         
        //   231: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   234: iload_2        
        //   235: getstatic       dev/nuker/pyro/fc.0:I
        //   238: ifeq            246
        //   241: ldc             1743684352
        //   243: goto            248
        //   246: ldc             -1568180127
        //   248: ldc             -1112884741
        //   250: ixor           
        //   251: lookupswitch {
        //          -633062661: 246
        //          523092378: 276
        //          default: 433
        //        }
        //   276: aload           4
        //   278: checkcast       Lnet/minecraft/entity/Entity;
        //   281: goto            285
        //   284: athrow         
        //   285: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_73027_a:(ILnet/minecraft/entity/Entity;)V
        //   288: goto            292
        //   291: athrow         
        //   292: getstatic       dev/nuker/pyro/fbq.c:Ljava/util/List;
        //   295: aload           4
        //   297: getstatic       dev/nuker/pyro/fc.c:I
        //   300: ifge            308
        //   303: ldc             794224332
        //   305: goto            310
        //   308: ldc             2122492569
        //   310: ldc             -2025440786
        //   312: ixor           
        //   313: lookupswitch {
        //          -1475289310: 308
        //          -104557705: 340
        //          default: 425
        //        }
        //   340: goto            344
        //   343: athrow         
        //   344: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   349: goto            353
        //   352: athrow         
        //   353: pop            
        //   354: iload_3        
        //   355: ifeq            420
        //   358: getstatic       dev/nuker/pyro/fbq.0:Ljava/util/List;
        //   361: getstatic       dev/nuker/pyro/fc.c:I
        //   364: ifge            372
        //   367: ldc             1775422204
        //   369: goto            374
        //   372: ldc             128230876
        //   374: ldc             -535610345
        //   376: ixor           
        //   377: lookupswitch {
        //          -1987159727: 372
        //          -1983777045: 431
        //          default: 404
        //        }
        //   404: aload           4
        //   406: goto            410
        //   409: athrow         
        //   410: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   415: goto            419
        //   418: athrow         
        //   419: pop            
        //   420: aload           4
        //   422: areturn        
        //   423: aconst_null    
        //   424: athrow         
        //   425: aconst_null    
        //   426: athrow         
        //   427: aconst_null    
        //   428: athrow         
        //   429: aconst_null    
        //   430: athrow         
        //   431: aconst_null    
        //   432: athrow         
        //   433: aconst_null    
        //   434: athrow         
        //   435: pop            
        //   436: goto            24
        //   439: pop            
        //   440: aconst_null    
        //   441: goto            435
        //   444: dup            
        //   445: ifnull          435
        //   448: checkcast       Ljava/lang/Throwable;
        //   451: athrow         
        //   452: dup            
        //   453: ifnull          439
        //   456: checkcast       Ljava/lang/Throwable;
        //   459: athrow         
        //   460: aconst_null    
        //   461: athrow         
        //    StackMapTable: 00 3E 43 07 00 2C 04 FF 00 0B 00 00 00 01 07 00 2C FF 00 03 00 04 07 00 03 07 00 30 01 01 00 00 FF 00 15 00 04 07 00 03 07 00 30 01 01 00 04 08 00 1A 08 00 1A 07 00 7D 07 00 30 FF 00 01 00 04 07 00 03 07 00 30 01 01 00 05 08 00 1A 08 00 1A 07 00 7D 07 00 30 01 FF 00 1B 00 04 07 00 03 07 00 30 01 01 00 04 08 00 1A 08 00 1A 07 00 7D 07 00 30 42 07 00 2C FF 00 00 00 04 07 00 03 07 00 30 01 01 00 04 08 00 1A 08 00 1A 07 00 7D 07 00 30 45 07 00 2C FF 00 00 00 04 07 00 03 07 00 30 01 01 00 04 08 00 1A 08 00 1A 07 00 7D 07 00 7F 42 07 00 14 FF 00 00 00 04 07 00 03 07 00 30 01 01 00 04 08 00 1A 08 00 1A 07 00 7D 07 00 7F 45 07 00 2C 40 07 00 2E FF 00 0A 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 01 07 00 2C FF 00 00 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 2E 07 00 43 45 07 00 2C 00 4C 07 00 2E FF 00 01 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 2E 01 5B 07 00 2E FF 00 0E 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 2E 02 FF 00 01 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 03 07 00 2E 02 01 FF 00 1E 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 2E 02 4E 07 00 2C 00 45 07 00 2C 40 07 00 5A FF 00 0E 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 67 01 FF 00 01 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 03 07 00 67 01 01 FF 00 1B 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 67 01 47 07 00 1E FF 00 00 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 03 07 00 67 01 07 00 43 45 07 00 2C 00 FF 00 0F 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 72 07 00 2E FF 00 01 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 03 07 00 72 07 00 2E 01 FF 00 1D 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 72 07 00 2E 42 07 00 2C FF 00 00 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 72 07 00 2E 47 07 00 2C 40 01 52 07 00 72 FF 00 01 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 72 01 5D 07 00 72 44 07 00 2C FF 00 00 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 72 07 00 2E 47 07 00 2C 40 01 00 FF 00 02 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 2E 02 FF 00 01 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 72 07 00 2E FF 00 01 00 04 07 00 03 07 00 30 01 01 00 04 08 00 1A 08 00 1A 07 00 7D 07 00 30 FF 00 01 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 01 07 00 2E 41 07 00 72 FF 00 01 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 67 01 FF 00 01 00 04 07 00 03 07 00 30 01 01 00 01 07 00 2C 43 05 44 07 00 2C 47 05 47 07 00 2C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     444    452    Ljava/lang/UnsupportedOperationException;
        //  444    452    444    452    Any
        //  460    462    3      8      Any
        //  79     86     86     87     Any
        //  80     86     3      8      Ljava/lang/NullPointerException;
        //  79     86     86     87     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  79     86     79     80     Any
        //  80     86     79     80     Ljava/lang/UnsupportedOperationException;
        //  90     97     97     98     Any
        //  91     97     97     98     Any
        //  90     97     97     98     Any
        //  91     97     90     91     Ljava/lang/NumberFormatException;
        //  90     97     97     98     Ljava/util/NoSuchElementException;
        //  109    116    116    117    Any
        //  109    116    109    110    Any
        //  109    116    116    117    Any
        //  110    116    116    117    Any
        //  109    116    116    117    Ljava/lang/IllegalArgumentException;
        //  223    230    230    231    Any
        //  223    230    3      8      Any
        //  224    230    230    231    Ljava/lang/IllegalStateException;
        //  224    230    223    224    Any
        //  224    230    3      8      Ljava/lang/AssertionError;
        //  284    291    291    292    Any
        //  285    291    284    285    Ljava/lang/UnsupportedOperationException;
        //  284    291    284    285    Ljava/lang/NullPointerException;
        //  284    291    291    292    Any
        //  284    291    291    292    Ljava/lang/RuntimeException;
        //  343    352    352    353    Any
        //  343    352    343    344    Any
        //  343    352    343    344    Ljava/lang/ArithmeticException;
        //  343    352    352    353    Ljava/lang/StringIndexOutOfBoundsException;
        //  344    352    352    353    Any
        //  409    418    418    419    Any
        //  410    418    3      8      Any
        //  410    418    409    410    Any
        //  409    418    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  410    418    409    410    Ljava/lang/ClassCastException;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visitVariable(StackMappingVisitor.java:470)
        //     at com.strobel.assembler.ir.Instruction.accept(Instruction.java:556)
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
    
    public void c() {
        fbS.dp(this, 801023311);
    }
    
    public boolean c(@Nullable final EntityPlayer entityPlayer) {
        return fbS.1S(this, 65819922, entityPlayer);
    }
    
    static {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.0 != 0) {
                    n = -77333546;
                    break Label_0017;
                }
                n = 409550057;
            }
            switch (n ^ 0x248D1104) {
                case 1211067749: {
                    continue;
                }
                default: {
                    fbq.c = new fbq();
                    while (true) {
                        int n2 = 0;
                        Label_0075: {
                            if (fc.c < 0) {
                                n2 = -1762405273;
                                break Label_0075;
                            }
                            n2 = -2093924388;
                        }
                        switch (n2 ^ 0x3601FFDE) {
                            case -1594741831: {
                                continue;
                            }
                            case -1255096318: {
                                fbq.c = new ArrayList<EntityOtherPlayerMP>();
                                while (true) {
                                    int n3 = 0;
                                    Label_0132: {
                                        if (fc.c < 0) {
                                            n3 = 95937605;
                                            break Label_0132;
                                        }
                                        n3 = 350635084;
                                    }
                                    switch (n3 ^ 0x4504DA18) {
                                        case 1085488733: {
                                            continue;
                                        }
                                        case 1373806164: {
                                            fbq.0 = new ArrayList<EntityOtherPlayerMP>();
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
                case -537990446: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @NotNull
    public EntityOtherPlayerMP c(@NotNull final EntityPlayer p0, final int p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          773
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            765
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            757
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: new             Lnet/minecraft/client/entity/EntityOtherPlayerMP;
        //    29: dup            
        //    30: getstatic       dev/nuker/pyro/fc.1:I
        //    33: ifeq            41
        //    36: ldc             -1719675160
        //    38: goto            43
        //    41: ldc             -656171066
        //    43: ldc             1746124783
        //    45: ixor           
        //    46: lookupswitch {
        //          -1326440407: 72
        //          -244553465: 41
        //          default: 736
        //        }
        //    72: aload_1        
        //    73: getfield        net/minecraft/entity/player/EntityPlayer.field_70170_p:Lnet/minecraft/world/World;
        //    76: getstatic       dev/nuker/pyro/fc.c:I
        //    79: ifge            87
        //    82: ldc             1457889137
        //    84: goto            89
        //    87: ldc             1785184325
        //    89: ldc             -771613166
        //    91: ixor           
        //    92: lookupswitch {
        //          -2065202845: 742
        //          -1278848656: 87
        //          default: 120
        //        }
        //   120: aload_1        
        //   121: goto            125
        //   124: athrow         
        //   125: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_146103_bH:()Lcom/mojang/authlib/GameProfile;
        //   128: goto            132
        //   131: athrow         
        //   132: goto            136
        //   135: athrow         
        //   136: invokespecial   net/minecraft/client/entity/EntityOtherPlayerMP.<init>:(Lnet/minecraft/world/World;Lcom/mojang/authlib/GameProfile;)V
        //   139: goto            143
        //   142: athrow         
        //   143: astore          4
        //   145: getstatic       dev/nuker/pyro/fc.c:I
        //   148: ifge            156
        //   151: ldc             1291891895
        //   153: goto            158
        //   156: ldc             1889375961
        //   158: ldc             -2125566582
        //   160: ixor           
        //   161: lookupswitch {
        //          -1375852963: 156
        //          -867247811: 744
        //          default: 188
        //        }
        //   188: aload           4
        //   190: aload_1        
        //   191: checkcast       Lnet/minecraft/entity/Entity;
        //   194: goto            198
        //   197: athrow         
        //   198: invokevirtual   net/minecraft/client/entity/EntityOtherPlayerMP.func_82149_j:(Lnet/minecraft/entity/Entity;)V
        //   201: goto            205
        //   204: athrow         
        //   205: aload           4
        //   207: aload_1        
        //   208: getstatic       dev/nuker/pyro/fc.c:I
        //   211: ifge            219
        //   214: ldc             -669836715
        //   216: goto            221
        //   219: ldc             -1997576877
        //   221: ldc             -1346375070
        //   223: ixor           
        //   224: lookupswitch {
        //          840688527: 219
        //          2007820343: 734
        //          default: 252
        //        }
        //   252: getfield        net/minecraft/entity/player/EntityPlayer.field_70177_z:F
        //   255: putfield        net/minecraft/client/entity/EntityOtherPlayerMP.field_70177_z:F
        //   258: aload           4
        //   260: aload_1        
        //   261: getfield        net/minecraft/entity/player/EntityPlayer.field_70759_as:F
        //   264: putfield        net/minecraft/client/entity/EntityOtherPlayerMP.field_70759_as:F
        //   267: getstatic       dev/nuker/pyro/fc.1:I
        //   270: ifeq            278
        //   273: ldc             -269186062
        //   275: goto            280
        //   278: ldc             869949949
        //   280: ldc             1059248794
        //   282: ixor           
        //   283: lookupswitch {
        //          -791260824: 278
        //          217627495: 308
        //          default: 738
        //        }
        //   308: aload           4
        //   310: getfield        net/minecraft/client/entity/EntityOtherPlayerMP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   313: aload_1        
        //   314: getfield        net/minecraft/entity/player/EntityPlayer.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //   317: goto            321
        //   320: athrow         
        //   321: invokevirtual   net/minecraft/entity/player/InventoryPlayer.func_70455_b:(Lnet/minecraft/entity/player/InventoryPlayer;)V
        //   324: goto            328
        //   327: athrow         
        //   328: getstatic       dev/nuker/pyro/fc.0:I
        //   331: ifeq            339
        //   334: ldc             553391169
        //   336: goto            341
        //   339: ldc             1927440428
        //   341: ldc             57431469
        //   343: ixor           
        //   344: lookupswitch {
        //          596656620: 339
        //          1905147265: 372
        //          default: 728
        //        }
        //   372: aload           4
        //   374: checkcast       Ldev/nuker/pyro/mixin/EntityFlagAccessor;
        //   377: bipush          7
        //   379: aload_1        
        //   380: getstatic       dev/nuker/pyro/fc.c:I
        //   383: ifge            391
        //   386: ldc             1516346704
        //   388: goto            393
        //   391: ldc             -2141898275
        //   393: ldc             895708833
        //   395: ixor           
        //   396: lookupswitch {
        //          -1254729860: 424
        //          1862464497: 391
        //          default: 730
        //        }
        //   424: goto            428
        //   427: athrow         
        //   428: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_184613_cA:()Z
        //   431: goto            435
        //   434: athrow         
        //   435: goto            439
        //   438: athrow         
        //   439: invokeinterface dev/nuker/pyro/mixin/EntityFlagAccessor.set:(IZ)V
        //   444: goto            448
        //   447: athrow         
        //   448: goto            452
        //   451: athrow         
        //   452: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   455: goto            459
        //   458: athrow         
        //   459: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   462: iload_2        
        //   463: aload           4
        //   465: checkcast       Lnet/minecraft/entity/Entity;
        //   468: goto            472
        //   471: athrow         
        //   472: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_73027_a:(ILnet/minecraft/entity/Entity;)V
        //   475: goto            479
        //   478: athrow         
        //   479: getstatic       dev/nuker/pyro/fbq.c:Ljava/util/List;
        //   482: aload           4
        //   484: getstatic       dev/nuker/pyro/fc.0:I
        //   487: ifeq            495
        //   490: ldc             1086769450
        //   492: goto            497
        //   495: ldc             972638070
        //   497: ldc             -1690488894
        //   499: ixor           
        //   500: lookupswitch {
        //          -1564186444: 528
        //          -604248344: 495
        //          default: 740
        //        }
        //   528: goto            532
        //   531: athrow         
        //   532: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   537: goto            541
        //   540: athrow         
        //   541: pop            
        //   542: iload_3        
        //   543: ifeq            565
        //   546: getstatic       dev/nuker/pyro/fbq.0:Ljava/util/List;
        //   549: aload           4
        //   551: goto            555
        //   554: athrow         
        //   555: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   560: goto            564
        //   563: athrow         
        //   564: pop            
        //   565: getstatic       dev/nuker/pyro/fc.1:I
        //   568: ifeq            576
        //   571: ldc             1493914626
        //   573: goto            578
        //   576: ldc             804134128
        //   578: ldc             1003684721
        //   580: ixor           
        //   581: lookupswitch {
        //          339550081: 608
        //          1658345331: 576
        //          default: 732
        //        }
        //   608: aload_1        
        //   609: goto            613
        //   612: athrow         
        //   613: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_184187_bx:()Lnet/minecraft/entity/Entity;
        //   616: goto            620
        //   619: athrow         
        //   620: ifnull          628
        //   623: ldc             -1394478837
        //   625: goto            630
        //   628: ldc             -1394478838
        //   630: ldc             816161341
        //   632: ixor           
        //   633: tableswitch {
        //          948479596: 656
        //          948479597: 725
        //          default: 623
        //        }
        //   656: aload           4
        //   658: getstatic       dev/nuker/pyro/fc.0:I
        //   661: ifeq            669
        //   664: ldc             2100190891
        //   666: goto            671
        //   669: ldc             -100231325
        //   671: ldc             1220850352
        //   673: ixor           
        //   674: lookupswitch {
        //          -1295899181: 700
        //          904588315: 669
        //          default: 746
        //        }
        //   700: aload_1        
        //   701: goto            705
        //   704: athrow         
        //   705: invokevirtual   net/minecraft/entity/player/EntityPlayer.func_184187_bx:()Lnet/minecraft/entity/Entity;
        //   708: goto            712
        //   711: athrow         
        //   712: iconst_1       
        //   713: goto            717
        //   716: athrow         
        //   717: invokevirtual   net/minecraft/client/entity/EntityOtherPlayerMP.func_184205_a:(Lnet/minecraft/entity/Entity;Z)Z
        //   720: goto            724
        //   723: athrow         
        //   724: pop            
        //   725: aload           4
        //   727: areturn        
        //   728: aconst_null    
        //   729: athrow         
        //   730: aconst_null    
        //   731: athrow         
        //   732: aconst_null    
        //   733: athrow         
        //   734: aconst_null    
        //   735: athrow         
        //   736: aconst_null    
        //   737: athrow         
        //   738: aconst_null    
        //   739: athrow         
        //   740: aconst_null    
        //   741: athrow         
        //   742: aconst_null    
        //   743: athrow         
        //   744: aconst_null    
        //   745: athrow         
        //   746: aconst_null    
        //   747: athrow         
        //   748: pop            
        //   749: goto            24
        //   752: pop            
        //   753: aconst_null    
        //   754: goto            748
        //   757: dup            
        //   758: ifnull          748
        //   761: checkcast       Ljava/lang/Throwable;
        //   764: athrow         
        //   765: dup            
        //   766: ifnull          752
        //   769: checkcast       Ljava/lang/Throwable;
        //   772: athrow         
        //   773: aconst_null    
        //   774: athrow         
        //    StackMapTable: 00 6B 43 07 00 2C 04 FF 00 0B 00 00 00 01 07 00 2C FF 00 03 00 04 07 00 03 07 00 30 01 01 00 00 FF 00 10 00 04 07 00 03 07 00 30 01 01 00 02 08 00 1A 08 00 1A FF 00 01 00 04 07 00 03 07 00 30 01 01 00 03 08 00 1A 08 00 1A 01 FF 00 1C 00 04 07 00 03 07 00 30 01 01 00 02 08 00 1A 08 00 1A FF 00 0E 00 04 07 00 03 07 00 30 01 01 00 03 08 00 1A 08 00 1A 07 00 7D FF 00 01 00 04 07 00 03 07 00 30 01 01 00 04 08 00 1A 08 00 1A 07 00 7D 01 FF 00 1E 00 04 07 00 03 07 00 30 01 01 00 03 08 00 1A 08 00 1A 07 00 7D 43 07 00 10 FF 00 00 00 04 07 00 03 07 00 30 01 01 00 04 08 00 1A 08 00 1A 07 00 7D 07 00 30 45 07 00 2C FF 00 00 00 04 07 00 03 07 00 30 01 01 00 04 08 00 1A 08 00 1A 07 00 7D 07 00 7F 42 07 00 2C FF 00 00 00 04 07 00 03 07 00 30 01 01 00 04 08 00 1A 08 00 1A 07 00 7D 07 00 7F 45 07 00 2C 40 07 00 2E FC 00 0C 07 00 2E 41 01 1D 48 07 00 2C FF 00 00 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 2E 07 00 43 45 07 00 2C 00 FF 00 0D 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 2E 07 00 30 FF 00 01 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 03 07 00 2E 07 00 30 01 FF 00 1E 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 2E 07 00 30 19 41 01 1B 4B 07 00 16 FF 00 00 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 BD 07 00 BD 45 07 00 2C 00 0A 41 01 1E FF 00 12 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 03 07 00 C6 01 07 00 30 FF 00 01 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 04 07 00 C6 01 07 00 30 01 FF 00 1E 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 03 07 00 C6 01 07 00 30 42 07 00 2C FF 00 00 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 03 07 00 C6 01 07 00 30 45 07 00 2C FF 00 00 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 03 07 00 C6 01 01 42 07 00 2C FF 00 00 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 03 07 00 C6 01 01 47 07 00 2C 00 42 07 00 2C 00 45 07 00 2C 40 07 00 5A 4B 07 00 1E FF 00 00 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 03 07 00 67 01 07 00 43 45 07 00 2C 00 FF 00 0F 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 72 07 00 2E FF 00 01 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 03 07 00 72 07 00 2E 01 FF 00 1E 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 72 07 00 2E FF 00 02 00 00 00 01 07 00 2C FF 00 00 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 72 07 00 2E 47 07 00 2C 40 01 FF 00 0C 00 00 00 01 07 00 2C FF 00 00 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 72 07 00 2E 47 07 00 2C 40 01 00 0A 41 01 1D 43 07 00 2C 40 07 00 30 45 07 00 2C 40 07 00 43 02 04 41 01 19 4C 07 00 2E FF 00 01 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 2E 01 5C 07 00 2E 43 07 00 2C FF 00 00 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 2E 07 00 30 45 07 00 2C FF 00 00 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 2E 07 00 43 FF 00 03 00 00 00 01 07 00 2C FF 00 00 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 03 07 00 2E 07 00 43 01 45 07 00 2C 40 01 00 02 FF 00 01 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 03 07 00 C6 01 07 00 30 01 FF 00 01 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 2E 07 00 30 FF 00 01 00 04 07 00 03 07 00 30 01 01 00 02 08 00 1A 08 00 1A FC 00 01 07 00 2E FF 00 01 00 05 07 00 03 07 00 30 01 01 07 00 2E 00 02 07 00 72 07 00 2E FF 00 01 00 04 07 00 03 07 00 30 01 01 00 03 08 00 1A 08 00 1A 07 00 7D FC 00 01 07 00 2E 41 07 00 2E FF 00 01 00 04 07 00 03 07 00 30 01 01 00 01 07 00 2C 43 05 44 07 00 2C 47 05 47 07 00 2C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     757    765    Any
        //  757    765    757    765    Any
        //  773    775    3      8      Any
        //  124    131    131    132    Any
        //  125    131    131    132    Ljava/util/ConcurrentModificationException;
        //  125    131    124    125    Ljava/lang/NullPointerException;
        //  125    131    3      8      Any
        //  125    131    3      8      Ljava/lang/RuntimeException;
        //  135    142    142    143    Any
        //  136    142    3      8      Any
        //  135    142    3      8      Ljava/lang/RuntimeException;
        //  135    142    135    136    Any
        //  136    142    135    136    Any
        //  197    204    204    205    Any
        //  198    204    204    205    Any
        //  198    204    197    198    Any
        //  197    204    3      8      Ljava/lang/IllegalArgumentException;
        //  197    204    197    198    Any
        //  320    327    327    328    Any
        //  321    327    320    321    Ljava/util/NoSuchElementException;
        //  321    327    3      8      Ljava/lang/IllegalArgumentException;
        //  320    327    327    328    Any
        //  321    327    3      8      Any
        //  427    434    434    435    Any
        //  428    434    434    435    Any
        //  427    434    427    428    Ljava/lang/StringIndexOutOfBoundsException;
        //  428    434    427    428    Any
        //  428    434    434    435    Ljava/lang/IllegalStateException;
        //  438    447    447    448    Any
        //  438    447    438    439    Any
        //  439    447    447    448    Any
        //  438    447    447    448    Ljava/lang/NegativeArraySizeException;
        //  439    447    447    448    Any
        //  451    458    458    459    Any
        //  452    458    451    452    Any
        //  451    458    451    452    Ljava/lang/IndexOutOfBoundsException;
        //  452    458    451    452    Any
        //  451    458    3      8      Ljava/util/ConcurrentModificationException;
        //  471    478    478    479    Any
        //  471    478    471    472    Ljava/lang/UnsupportedOperationException;
        //  472    478    478    479    Any
        //  472    478    471    472    Ljava/lang/IllegalStateException;
        //  472    478    471    472    Ljava/lang/IndexOutOfBoundsException;
        //  532    540    540    541    Any
        //  532    540    540    541    Ljava/lang/IllegalArgumentException;
        //  532    540    3      8      Any
        //  532    540    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  532    540    3      8      Any
        //  555    563    563    564    Any
        //  555    563    563    564    Any
        //  555    563    3      8      Ljava/lang/RuntimeException;
        //  555    563    3      8      Any
        //  555    563    3      8      Any
        //  612    619    619    620    Any
        //  612    619    3      8      Any
        //  612    619    619    620    Any
        //  612    619    619    620    Ljava/lang/NullPointerException;
        //  613    619    612    613    Any
        //  704    711    711    712    Any
        //  704    711    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  704    711    3      8      Ljava/lang/NullPointerException;
        //  705    711    704    705    Any
        //  705    711    711    712    Ljava/lang/AssertionError;
        //  717    723    723    724    Any
        //  717    723    723    724    Ljava/lang/EnumConstantNotPresentException;
        //  717    723    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  717    723    3      8      Ljava/util/NoSuchElementException;
        //  717    723    723    724    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalArgumentException: Argument 'offset' must be in the range [0, 0], but value was: 2.
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
    
    public fbq() {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.1 != 0) {
                    n = 84105283;
                    break Label_0013;
                }
                n = -1037011213;
            }
            switch (n ^ 0x23771B7B) {
                case 645153592: {
                    continue;
                }
                case -515412600: {}
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    @NotNull
    public EntityOtherPlayerMP c(@NotNull final String p0, final int p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          498
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            490
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            482
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            35
        //    30: ldc             -1856745976
        //    32: goto            37
        //    35: ldc             -1362670265
        //    37: ldc             641390334
        //    39: ixor           
        //    40: lookupswitch {
        //          -1996645447: 68
        //          -1217488650: 35
        //          default: 461
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: new             Lnet/minecraft/client/entity/EntityOtherPlayerMP;
        //    73: dup            
        //    74: goto            78
        //    77: athrow         
        //    78: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    81: goto            85
        //    84: athrow         
        //    85: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //    88: checkcast       Lnet/minecraft/world/World;
        //    91: new             Lcom/mojang/authlib/GameProfile;
        //    94: dup            
        //    95: aconst_null    
        //    96: getstatic       dev/nuker/pyro/fc.c:I
        //    99: ifge            107
        //   102: ldc             -952938025
        //   104: goto            109
        //   107: ldc             -1489023978
        //   109: ldc             1441004148
        //   111: ixor           
        //   112: lookupswitch {
        //          -1936915872: 107
        //          -1831818333: 471
        //          default: 140
        //        }
        //   140: aload_1        
        //   141: goto            145
        //   144: athrow         
        //   145: invokespecial   com/mojang/authlib/GameProfile.<init>:(Ljava/util/UUID;Ljava/lang/String;)V
        //   148: goto            152
        //   151: athrow         
        //   152: goto            156
        //   155: athrow         
        //   156: invokespecial   net/minecraft/client/entity/EntityOtherPlayerMP.<init>:(Lnet/minecraft/world/World;Lcom/mojang/authlib/GameProfile;)V
        //   159: goto            163
        //   162: athrow         
        //   163: astore          4
        //   165: goto            169
        //   168: athrow         
        //   169: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   172: goto            176
        //   175: athrow         
        //   176: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   179: getstatic       dev/nuker/pyro/fc.c:I
        //   182: ifge            190
        //   185: ldc             871201278
        //   187: goto            192
        //   190: ldc             856589564
        //   192: ldc             1346261133
        //   194: ixor           
        //   195: lookupswitch {
        //          1360568123: 190
        //          1674783091: 463
        //          default: 220
        //        }
        //   220: iload_2        
        //   221: aload           4
        //   223: checkcast       Lnet/minecraft/entity/Entity;
        //   226: goto            230
        //   229: athrow         
        //   230: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_73027_a:(ILnet/minecraft/entity/Entity;)V
        //   233: goto            237
        //   236: athrow         
        //   237: getstatic       dev/nuker/pyro/fbq.c:Ljava/util/List;
        //   240: getstatic       dev/nuker/pyro/fc.0:I
        //   243: ifeq            251
        //   246: ldc             -1039581894
        //   248: goto            253
        //   251: ldc             381955905
        //   253: ldc             2099268307
        //   255: ixor           
        //   256: lookupswitch {
        //          -1907699609: 251
        //          -1087801367: 467
        //          default: 284
        //        }
        //   284: aload           4
        //   286: goto            290
        //   289: athrow         
        //   290: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   295: goto            299
        //   298: athrow         
        //   299: pop            
        //   300: iload_3        
        //   301: ifeq            410
        //   304: getstatic       dev/nuker/pyro/fc.1:I
        //   307: ifeq            315
        //   310: ldc             -308372518
        //   312: goto            317
        //   315: ldc             -1917612538
        //   317: ldc             -1632939196
        //   319: ixor           
        //   320: lookupswitch {
        //          1044474018: 315
        //          1932904606: 459
        //          default: 348
        //        }
        //   348: getstatic       dev/nuker/pyro/fbq.0:Ljava/util/List;
        //   351: aload           4
        //   353: getstatic       dev/nuker/pyro/fc.1:I
        //   356: ifeq            364
        //   359: ldc             1464089957
        //   361: goto            366
        //   364: ldc             -561567644
        //   366: ldc             564964055
        //   368: ixor           
        //   369: lookupswitch {
        //          -13925709: 396
        //          1994954674: 364
        //          default: 469
        //        }
        //   396: goto            400
        //   399: athrow         
        //   400: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   405: goto            409
        //   408: athrow         
        //   409: pop            
        //   410: getstatic       dev/nuker/pyro/fc.0:I
        //   413: ifeq            422
        //   416: ldc_w           1828915253
        //   419: goto            425
        //   422: ldc_w           -408844349
        //   425: ldc_w           -922022138
        //   428: ixor           
        //   429: lookupswitch {
        //          -1542977741: 465
        //          -174119713: 422
        //          default: 456
        //        }
        //   456: aload           4
        //   458: areturn        
        //   459: aconst_null    
        //   460: athrow         
        //   461: aconst_null    
        //   462: athrow         
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
        //   473: pop            
        //   474: goto            24
        //   477: pop            
        //   478: aconst_null    
        //   479: goto            473
        //   482: dup            
        //   483: ifnull          473
        //   486: checkcast       Ljava/lang/Throwable;
        //   489: athrow         
        //   490: dup            
        //   491: ifnull          477
        //   494: checkcast       Ljava/lang/Throwable;
        //   497: athrow         
        //   498: aconst_null    
        //   499: athrow         
        //    StackMapTable: 00 42 43 07 00 2C 04 FF 00 0B 00 00 00 01 07 00 2C FF 00 03 00 04 07 00 03 07 01 04 01 01 00 00 0A 41 01 1E 48 07 00 1E FF 00 00 00 04 07 00 03 07 01 04 01 01 00 02 08 00 46 08 00 46 45 07 00 2C FF 00 00 00 04 07 00 03 07 01 04 01 01 00 03 08 00 46 08 00 46 07 00 5A FF 00 15 00 04 07 00 03 07 01 04 01 01 00 06 08 00 46 08 00 46 07 00 7D 08 00 5B 08 00 5B 05 FF 00 01 00 04 07 00 03 07 01 04 01 01 00 07 08 00 46 08 00 46 07 00 7D 08 00 5B 08 00 5B 05 01 FF 00 1E 00 04 07 00 03 07 01 04 01 01 00 06 08 00 46 08 00 46 07 00 7D 08 00 5B 08 00 5B 05 43 07 00 2C FF 00 00 00 04 07 00 03 07 01 04 01 01 00 07 08 00 46 08 00 46 07 00 7D 08 00 5B 08 00 5B 05 07 01 04 45 07 00 2C FF 00 00 00 04 07 00 03 07 01 04 01 01 00 04 08 00 46 08 00 46 07 00 7D 07 00 7F 42 07 00 2C FF 00 00 00 04 07 00 03 07 01 04 01 01 00 04 08 00 46 08 00 46 07 00 7D 07 00 7F 45 07 00 2C 40 07 00 2E FF 00 04 00 00 00 01 07 00 2C FF 00 00 00 05 07 00 03 07 01 04 01 01 07 00 2E 00 00 45 07 00 2C 40 07 00 5A 4D 07 00 67 FF 00 01 00 05 07 00 03 07 01 04 01 01 07 00 2E 00 02 07 00 67 01 5B 07 00 67 48 07 00 1E FF 00 00 00 05 07 00 03 07 01 04 01 01 07 00 2E 00 03 07 00 67 01 07 00 43 45 07 00 2C 00 4D 07 00 72 FF 00 01 00 05 07 00 03 07 01 04 01 01 07 00 2E 00 02 07 00 72 01 5E 07 00 72 44 07 00 1E FF 00 00 00 05 07 00 03 07 01 04 01 01 07 00 2E 00 02 07 00 72 07 00 2E 47 07 00 2C 40 01 0F 41 01 1E FF 00 0F 00 05 07 00 03 07 01 04 01 01 07 00 2E 00 02 07 00 72 07 00 2E FF 00 01 00 05 07 00 03 07 01 04 01 01 07 00 2E 00 03 07 00 72 07 00 2E 01 FF 00 1D 00 05 07 00 03 07 01 04 01 01 07 00 2E 00 02 07 00 72 07 00 2E 42 07 00 2C FF 00 00 00 05 07 00 03 07 01 04 01 01 07 00 2E 00 02 07 00 72 07 00 2E 47 07 00 2C 40 01 00 0B 42 01 1E 02 FA 00 01 FF 00 01 00 05 07 00 03 07 01 04 01 01 07 00 2E 00 01 07 00 67 01 41 07 00 72 FF 00 01 00 05 07 00 03 07 01 04 01 01 07 00 2E 00 02 07 00 72 07 00 2E FF 00 01 00 04 07 00 03 07 01 04 01 01 00 06 08 00 46 08 00 46 07 00 7D 08 00 5B 08 00 5B 05 41 07 00 2C 43 05 44 07 00 2C 47 05 47 07 00 2C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     482    490    Any
        //  482    490    482    490    Any
        //  498    500    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  77     84     84     85     Any
        //  77     84     77     78     Ljava/lang/EnumConstantNotPresentException;
        //  77     84     3      8      Any
        //  78     84     3      8      Ljava/lang/NullPointerException;
        //  78     84     77     78     Ljava/lang/ClassCastException;
        //  144    151    151    152    Any
        //  144    151    3      8      Ljava/lang/IllegalArgumentException;
        //  144    151    151    152    Any
        //  145    151    151    152    Ljava/util/ConcurrentModificationException;
        //  145    151    144    145    Any
        //  155    162    162    163    Any
        //  156    162    155    156    Ljava/util/NoSuchElementException;
        //  155    162    162    163    Any
        //  155    162    155    156    Any
        //  155    162    3      8      Ljava/lang/AssertionError;
        //  169    175    175    176    Any
        //  169    175    3      8      Ljava/util/ConcurrentModificationException;
        //  169    175    175    176    Any
        //  169    175    3      8      Ljava/util/ConcurrentModificationException;
        //  169    175    175    176    Any
        //  229    236    236    237    Any
        //  230    236    229    230    Ljava/lang/NegativeArraySizeException;
        //  229    236    229    230    Ljava/lang/UnsupportedOperationException;
        //  229    236    3      8      Ljava/lang/IllegalArgumentException;
        //  230    236    3      8      Ljava/lang/UnsupportedOperationException;
        //  289    298    298    299    Any
        //  290    298    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  289    298    298    299    Any
        //  289    298    289    290    Ljava/lang/RuntimeException;
        //  290    298    289    290    Ljava/lang/NumberFormatException;
        //  399    408    408    409    Any
        //  399    408    408    409    Ljava/lang/EnumConstantNotPresentException;
        //  400    408    399    400    Any
        //  400    408    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  399    408    3      8      Any
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
    
    public void c(@NotNull final EntityOtherPlayerMP p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          381
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            373
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            365
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: goto            30
        //    29: athrow         
        //    30: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    33: goto            37
        //    36: athrow         
        //    37: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //    40: ifnull          219
        //    43: getstatic       dev/nuker/pyro/fc.0:I
        //    46: ifeq            55
        //    49: ldc_w           562442118
        //    52: goto            58
        //    55: ldc_w           310505134
        //    58: ldc_w           1892705939
        //    61: ixor           
        //    62: lookupswitch {
        //          1364609301: 55
        //          1649510461: 88
        //          default: 352
        //        }
        //    88: goto            92
        //    91: athrow         
        //    92: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    95: goto            99
        //    98: athrow         
        //    99: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   102: getstatic       dev/nuker/pyro/fc.0:I
        //   105: ifeq            114
        //   108: ldc_w           1675620923
        //   111: goto            117
        //   114: ldc_w           127750511
        //   117: ldc_w           -597077985
        //   120: ixor           
        //   121: lookupswitch {
        //          -1078549980: 348
        //          1498971407: 114
        //          default: 148
        //        }
        //   148: aload_1        
        //   149: getstatic       dev/nuker/pyro/fc.1:I
        //   152: ifeq            161
        //   155: ldc_w           1716572068
        //   158: goto            164
        //   161: ldc_w           -1127648895
        //   164: ldc_w           -1091222512
        //   167: ixor           
        //   168: lookupswitch {
        //          -660239436: 350
        //          1498548388: 161
        //          default: 196
        //        }
        //   196: goto            200
        //   199: athrow         
        //   200: invokevirtual   net/minecraft/client/entity/EntityOtherPlayerMP.func_145782_y:()I
        //   203: goto            207
        //   206: athrow         
        //   207: goto            211
        //   210: athrow         
        //   211: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_73028_b:(I)Lnet/minecraft/entity/Entity;
        //   214: goto            218
        //   217: athrow         
        //   218: pop            
        //   219: getstatic       dev/nuker/pyro/fc.1:I
        //   222: ifeq            231
        //   225: ldc_w           1173273539
        //   228: goto            234
        //   231: ldc_w           -1469990484
        //   234: ldc_w           286058797
        //   237: ixor           
        //   238: lookupswitch {
        //          -1184018303: 264
        //          1424118510: 231
        //          default: 354
        //        }
        //   264: getstatic       dev/nuker/pyro/fbq.c:Ljava/util/List;
        //   267: getstatic       dev/nuker/pyro/fc.0:I
        //   270: ifeq            279
        //   273: ldc_w           -1951784950
        //   276: goto            282
        //   279: ldc_w           -1724986026
        //   282: ldc_w           1309822786
        //   285: ixor           
        //   286: lookupswitch {
        //          -977768632: 346
        //          295663502: 279
        //          default: 312
        //        }
        //   312: aload_1        
        //   313: goto            317
        //   316: athrow         
        //   317: invokeinterface java/util/List.remove:(Ljava/lang/Object;)Z
        //   322: goto            326
        //   325: athrow         
        //   326: pop            
        //   327: getstatic       dev/nuker/pyro/fbq.0:Ljava/util/List;
        //   330: aload_1        
        //   331: goto            335
        //   334: athrow         
        //   335: invokeinterface java/util/List.remove:(Ljava/lang/Object;)Z
        //   340: goto            344
        //   343: athrow         
        //   344: pop            
        //   345: return         
        //   346: aconst_null    
        //   347: athrow         
        //   348: aconst_null    
        //   349: athrow         
        //   350: aconst_null    
        //   351: athrow         
        //   352: aconst_null    
        //   353: athrow         
        //   354: aconst_null    
        //   355: athrow         
        //   356: pop            
        //   357: goto            24
        //   360: pop            
        //   361: aconst_null    
        //   362: goto            356
        //   365: dup            
        //   366: ifnull          356
        //   369: checkcast       Ljava/lang/Throwable;
        //   372: athrow         
        //   373: dup            
        //   374: ifnull          360
        //   377: checkcast       Ljava/lang/Throwable;
        //   380: athrow         
        //   381: aconst_null    
        //   382: athrow         
        //    StackMapTable: 00 36 43 07 00 2C 04 FF 00 0B 00 00 00 01 07 00 2C FD 00 03 07 00 03 07 00 2E FF 00 04 00 00 00 01 07 00 2C FD 00 00 07 00 03 07 00 2E 45 07 00 2C 40 07 00 5A 11 42 01 1D FF 00 02 00 00 00 01 07 00 2C FD 00 00 07 00 03 07 00 2E 45 07 00 2C 40 07 00 5A 4E 07 00 67 FF 00 02 00 02 07 00 03 07 00 2E 00 02 07 00 67 01 5E 07 00 67 FF 00 0C 00 02 07 00 03 07 00 2E 00 02 07 00 67 07 00 2E FF 00 02 00 02 07 00 03 07 00 2E 00 03 07 00 67 07 00 2E 01 FF 00 1F 00 02 07 00 03 07 00 2E 00 02 07 00 67 07 00 2E FF 00 02 00 00 00 01 07 00 2C FF 00 00 00 02 07 00 03 07 00 2E 00 02 07 00 67 07 00 2E 45 07 00 2C FF 00 00 00 02 07 00 03 07 00 2E 00 02 07 00 67 01 42 07 00 14 FF 00 00 00 02 07 00 03 07 00 2E 00 02 07 00 67 01 45 07 00 2C 40 07 00 43 00 0B 42 01 1D 4E 07 00 72 FF 00 02 00 02 07 00 03 07 00 2E 00 02 07 00 72 01 5D 07 00 72 43 07 00 1E FF 00 00 00 02 07 00 03 07 00 2E 00 02 07 00 72 07 00 2E 47 07 00 2C 40 01 47 07 00 2C FF 00 00 00 02 07 00 03 07 00 2E 00 02 07 00 72 07 00 2E 47 07 00 2C 40 01 41 07 00 72 41 07 00 67 FF 00 01 00 02 07 00 03 07 00 2E 00 02 07 00 67 07 00 2E 01 01 41 07 00 2C 43 05 44 07 00 2C 47 05 47 07 00 2C
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     365    373    Any
        //  365    373    365    373    Any
        //  381    383    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  30     36     36     37     Any
        //  30     36     3      8      Any
        //  30     36     36     37     Ljava/util/ConcurrentModificationException;
        //  30     36     3      8      Ljava/lang/NullPointerException;
        //  30     36     36     37     Any
        //  92     98     98     99     Any
        //  92     98     3      8      Ljava/lang/ArithmeticException;
        //  92     98     3      8      Any
        //  92     98     98     99     Any
        //  92     98     3      8      Any
        //  200    206    206    207    Any
        //  200    206    3      8      Ljava/lang/ClassCastException;
        //  200    206    3      8      Ljava/lang/RuntimeException;
        //  200    206    206    207    Ljava/lang/IllegalArgumentException;
        //  200    206    206    207    Any
        //  210    217    217    218    Any
        //  211    217    210    211    Ljava/lang/NumberFormatException;
        //  210    217    3      8      Any
        //  210    217    217    218    Ljava/lang/UnsupportedOperationException;
        //  210    217    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  316    325    325    326    Any
        //  316    325    316    317    Ljava/lang/StringIndexOutOfBoundsException;
        //  317    325    316    317    Ljava/lang/RuntimeException;
        //  317    325    316    317    Ljava/lang/ClassCastException;
        //  316    325    3      8      Ljava/lang/IllegalStateException;
        //  334    343    343    344    Any
        //  335    343    343    344    Any
        //  335    343    334    335    Any
        //  334    343    3      8      Ljava/lang/NullPointerException;
        //  334    343    334    335    Ljava/lang/NumberFormatException;
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
