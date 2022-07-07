// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import javax.annotation.Nullable;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiListExtended$IGuiListEntry;
import java.util.List;
import net.minecraft.client.gui.GuiListExtended;

public class fm extends GuiListExtended
{
    public fl c;
    public List<fn> c;
    public int c;
    
    public GuiListExtended$IGuiListEntry func_148180_b(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          63
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            55
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            47
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: iload_1        
        //    26: goto            30
        //    29: athrow         
        //    30: invokevirtual   dev/nuker/pyro/fm.c:(I)Ldev/nuker/pyro/fn;
        //    33: goto            37
        //    36: athrow         
        //    37: areturn        
        //    38: pop            
        //    39: goto            24
        //    42: pop            
        //    43: aconst_null    
        //    44: goto            38
        //    47: dup            
        //    48: ifnull          38
        //    51: checkcast       Ljava/lang/Throwable;
        //    54: athrow         
        //    55: dup            
        //    56: ifnull          42
        //    59: checkcast       Ljava/lang/Throwable;
        //    62: athrow         
        //    63: aconst_null    
        //    64: athrow         
        //    StackMapTable: 00 0D 43 07 00 19 04 FF 00 0B 00 00 00 01 07 00 19 FD 00 03 07 00 03 01 44 07 00 19 FF 00 00 00 02 07 00 03 01 00 02 07 00 03 01 45 07 00 19 40 07 00 1E 40 07 00 20 43 05 44 07 00 20 47 05 47 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  8      20     47     55     Ljava/lang/NegativeArraySizeException;
        //  47     55     47     55     Ljava/lang/NumberFormatException;
        //  63     65     3      8      Any
        //  29     36     36     37     Any
        //  30     36     3      8      Any
        //  30     36     29     30     Any
        //  29     36     29     30     Any
        //  29     36     36     37     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 33 out of bounds for length 33
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
        //     4: ifnull          393
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            385
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            377
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             -709296579
        //    32: goto            37
        //    35: ldc             -1137538296
        //    37: ldc             -1172811938
        //    39: ixor           
        //    40: lookupswitch {
        //          103466070: 68
        //          1872802147: 35
        //          default: 366
        //        }
        //    68: aload_0        
        //    69: getstatic       dev/nuker/pyro/fc.c:I
        //    72: ifge            80
        //    75: ldc             1082073347
        //    77: goto            82
        //    80: ldc             1449451684
        //    82: ldc             -1050717609
        //    84: ixor           
        //    85: lookupswitch {
        //          -2128579756: 358
        //          2024203355: 80
        //          default: 112
        //        }
        //   112: getfield        dev/nuker/pyro/fm.c:Ljava/util/List;
        //   115: goto            119
        //   118: athrow         
        //   119: invokeinterface java/util/List.clear:()V
        //   124: goto            128
        //   127: athrow         
        //   128: getstatic       dev/nuker/pyro/alt/AltManager.INSTANCE:Ldev/nuker/pyro/alt/AltManager;
        //   131: goto            135
        //   134: athrow         
        //   135: invokevirtual   dev/nuker/pyro/alt/AltManager.getAlts:()Ljava/util/List;
        //   138: goto            142
        //   141: athrow         
        //   142: getstatic       dev/nuker/pyro/fc.c:I
        //   145: ifge            153
        //   148: ldc             -1554414403
        //   150: goto            155
        //   153: ldc             -1622058689
        //   155: ldc             -1637739838
        //   157: ixor           
        //   158: lookupswitch {
        //          -510544328: 153
        //          1027315327: 360
        //          default: 184
        //        }
        //   184: goto            188
        //   187: athrow         
        //   188: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   193: goto            197
        //   196: athrow         
        //   197: astore_1       
        //   198: aload_1        
        //   199: goto            203
        //   202: athrow         
        //   203: invokeinterface java/util/Iterator.hasNext:()Z
        //   208: goto            212
        //   211: athrow         
        //   212: ifeq            357
        //   215: aload_1        
        //   216: goto            220
        //   219: athrow         
        //   220: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   225: goto            229
        //   228: athrow         
        //   229: checkcast       Ldev/nuker/pyro/alt/Alt;
        //   232: getstatic       dev/nuker/pyro/fc.1:I
        //   235: ifeq            243
        //   238: ldc             808060837
        //   240: goto            245
        //   243: ldc             -354717144
        //   245: ldc             -378756306
        //   247: ixor           
        //   248: lookupswitch {
        //          -649681781: 364
        //          1415252641: 243
        //          default: 276
        //        }
        //   276: astore_2       
        //   277: aload_0        
        //   278: getstatic       dev/nuker/pyro/fc.c:I
        //   281: ifge            289
        //   284: ldc             -1825665410
        //   286: goto            291
        //   289: ldc             431884980
        //   291: ldc             -566643722
        //   293: ixor           
        //   294: lookupswitch {
        //          -947406526: 320
        //          1293368712: 289
        //          default: 362
        //        }
        //   320: getfield        dev/nuker/pyro/fm.c:Ljava/util/List;
        //   323: new             Ldev/nuker/pyro/fn;
        //   326: dup            
        //   327: aload_0        
        //   328: aload_2        
        //   329: goto            333
        //   332: athrow         
        //   333: invokespecial   dev/nuker/pyro/fn.<init>:(Ldev/nuker/pyro/fm;Ldev/nuker/pyro/alt/Alt;)V
        //   336: goto            340
        //   339: athrow         
        //   340: goto            344
        //   343: athrow         
        //   344: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   349: goto            353
        //   352: athrow         
        //   353: pop            
        //   354: goto            198
        //   357: return         
        //   358: aconst_null    
        //   359: athrow         
        //   360: aconst_null    
        //   361: athrow         
        //   362: aconst_null    
        //   363: athrow         
        //   364: aconst_null    
        //   365: athrow         
        //   366: aconst_null    
        //   367: athrow         
        //   368: pop            
        //   369: goto            24
        //   372: pop            
        //   373: aconst_null    
        //   374: goto            368
        //   377: dup            
        //   378: ifnull          368
        //   381: checkcast       Ljava/lang/Throwable;
        //   384: athrow         
        //   385: dup            
        //   386: ifnull          372
        //   389: checkcast       Ljava/lang/Throwable;
        //   392: athrow         
        //   393: aconst_null    
        //   394: athrow         
        //    StackMapTable: 00 3B 43 07 00 19 04 FF 00 0B 00 00 00 01 07 00 19 FC 00 03 07 00 03 0A 41 01 1E 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 45 07 00 20 40 07 00 40 47 07 00 19 00 45 07 00 19 40 07 00 45 45 07 00 19 40 07 00 40 4A 07 00 40 FF 00 01 00 01 07 00 03 00 02 07 00 40 01 5C 07 00 40 42 07 00 19 40 07 00 40 47 07 00 19 40 07 00 56 FC 00 00 07 00 56 43 07 00 19 40 07 00 56 47 07 00 19 40 01 46 07 00 19 40 07 00 56 47 07 00 19 40 07 00 70 4D 07 00 60 FF 00 01 00 02 07 00 03 07 00 56 00 02 07 00 60 01 5E 07 00 60 FF 00 0C 00 03 07 00 03 07 00 56 07 00 60 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 00 56 07 00 60 00 02 07 00 03 01 5C 07 00 03 4B 07 00 19 FF 00 00 00 03 07 00 03 07 00 56 07 00 60 00 05 07 00 40 08 01 43 08 01 43 07 00 03 07 00 60 45 07 00 19 FF 00 00 00 03 07 00 03 07 00 56 07 00 60 00 02 07 00 40 07 00 1E 42 07 00 19 FF 00 00 00 03 07 00 03 07 00 56 07 00 60 00 02 07 00 40 07 00 1E 47 07 00 19 40 01 FA 00 03 FF 00 00 00 01 07 00 03 00 01 07 00 03 41 07 00 40 FF 00 01 00 03 07 00 03 07 00 56 07 00 60 00 01 07 00 03 FF 00 01 00 02 07 00 03 07 00 56 00 01 07 00 60 FA 00 01 41 07 00 20 43 05 44 07 00 20 47 05 47 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     377    385    Ljava/lang/UnsupportedOperationException;
        //  377    385    377    385    Ljava/lang/ClassCastException;
        //  393    395    3      8      Ljava/lang/UnsupportedOperationException;
        //  118    127    127    128    Any
        //  118    127    3      8      Any
        //  119    127    118    119    Ljava/lang/RuntimeException;
        //  119    127    3      8      Any
        //  119    127    118    119    Ljava/lang/ArithmeticException;
        //  134    141    141    142    Any
        //  135    141    141    142    Any
        //  134    141    141    142    Ljava/lang/StringIndexOutOfBoundsException;
        //  134    141    3      8      Any
        //  134    141    134    135    Any
        //  187    196    196    197    Any
        //  187    196    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  187    196    196    197    Any
        //  188    196    3      8      Ljava/lang/IllegalArgumentException;
        //  188    196    187    188    Any
        //  202    211    211    212    Any
        //  203    211    3      8      Any
        //  202    211    202    203    Any
        //  202    211    202    203    Any
        //  203    211    202    203    Any
        //  219    228    228    229    Any
        //  219    228    3      8      Any
        //  219    228    219    220    Any
        //  219    228    228    229    Any
        //  219    228    219    220    Any
        //  332    339    339    340    Any
        //  333    339    332    333    Any
        //  333    339    3      8      Any
        //  333    339    332    333    Ljava/util/NoSuchElementException;
        //  333    339    332    333    Any
        //  343    352    352    353    Any
        //  344    352    3      8      Any
        //  344    352    343    344    Any
        //  343    352    352    353    Ljava/lang/IllegalArgumentException;
        //  344    352    3      8      Ljava/lang/AssertionError;
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
    
    public fl 1() {
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
                            if (fc.c >= 0) {
                                null;
                                goto Label_0030;
                            }
                            continue Label_0038;
                            return this.c;
                        }
                        catch (AssertionError assertionError) {}
                    }
                    continue Label_0038;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public fm(final fl c, final Minecraft minecraft, final int n, final int n2, final int n3, final int n4, final int n5) {
        while (true) {
            int n6 = 0;
            Label_0018: {
                if (fc.0 != 0) {
                    n6 = -879647232;
                    break Label_0018;
                }
                n6 = -685559365;
            }
            switch (n6 ^ 0xC43FBCC8) {
                case 263068360: {
                    continue;
                }
                case 320638323: {
                    super(minecraft, n, n2, n3, n4, n5);
                    while (true) {
                        int n7 = 0;
                        Label_0071: {
                            if (fc.1 != 0) {
                                n7 = 695424031;
                                break Label_0071;
                            }
                            n7 = 1059441316;
                        }
                        switch (n7 ^ 0xB2F463B4) {
                            case 466573381: {
                                continue;
                            }
                            default: {
                                final ArrayList arrayList = Lists.newArrayList();
                                while (true) {
                                    int n8 = 0;
                                    Label_0116: {
                                        if (fc.0 != 0) {
                                            n8 = 1246000149;
                                            break Label_0116;
                                        }
                                        n8 = -1837158253;
                                    }
                                    switch (n8 ^ 0x97AEA8D9) {
                                        case -571810612: {
                                            continue;
                                        }
                                        case 97622090: {
                                            this.c = (List<fn>)arrayList;
                                            this.c = -1;
                                            while (true) {
                                                int n9 = 0;
                                                Label_0165: {
                                                    if (fc.0 != 0) {
                                                        n9 = 309204241;
                                                        break Label_0165;
                                                    }
                                                    n9 = 291327628;
                                                }
                                                switch (n9 ^ 0xA29BA317) {
                                                    case -1326074362: {
                                                        continue;
                                                    }
                                                    case -1278808677: {
                                                        this.c = c;
                                                        while (true) {
                                                            int n10 = 0;
                                                            Label_0214: {
                                                                if (fc.c < 0) {
                                                                    n10 = 673179255;
                                                                    break Label_0214;
                                                                }
                                                                n10 = -463686963;
                                                            }
                                                            switch (n10 ^ 0x43838C61) {
                                                                case -1283610904: {
                                                                    continue;
                                                                }
                                                                default: {
                                                                    this.c();
                                                                    return;
                                                                }
                                                                case 1805412886: {
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
                                        default: {
                                            throw null;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            case -1685637205: {
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
    
    public int func_148137_d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          110
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            102
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            94
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            36
        //    31: ldc             43682262
        //    33: goto            38
        //    36: ldc             1486522049
        //    38: ldc             -1043204260
        //    40: ixor           
        //    41: lookupswitch {
        //          -1018462582: 83
        //          -617955373: 36
        //          default: 68
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokespecial   net/minecraft/client/gui/GuiListExtended.func_148137_d:()I
        //    75: goto            79
        //    78: athrow         
        //    79: bipush          20
        //    81: iadd           
        //    82: ireturn        
        //    83: aconst_null    
        //    84: athrow         
        //    85: pop            
        //    86: goto            24
        //    89: pop            
        //    90: aconst_null    
        //    91: goto            85
        //    94: dup            
        //    95: ifnull          85
        //    98: checkcast       Ljava/lang/Throwable;
        //   101: athrow         
        //   102: dup            
        //   103: ifnull          89
        //   106: checkcast       Ljava/lang/Throwable;
        //   109: athrow         
        //   110: aconst_null    
        //   111: athrow         
        //    StackMapTable: 00 11 43 07 00 19 04 FF 00 0B 00 00 00 01 07 00 19 FC 00 03 07 00 03 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 42 07 00 19 40 07 00 03 45 07 00 19 40 01 43 07 00 03 41 07 00 19 43 05 44 07 00 19 47 05 47 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      20     94     102    Ljava/lang/NullPointerException;
        //  94     102    94     102    Any
        //  110    112    3      8      Ljava/lang/UnsupportedOperationException;
        //  71     78     78     79     Any
        //  71     78     3      8      Any
        //  71     78     3      8      Any
        //  71     78     71     72     Any
        //  71     78     71     72     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 44 out of bounds for length 44
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
    
    public boolean func_148131_a(final int n) {
        return fbS.5S(this, 432952731, n);
    }
    
    public int func_148127_b() {
        return fbS.bG(this, 8214553);
    }
    
    public void 0(final int n) {
        fbS.67(this, 1501424310, n);
    }
    
    static {
        throw t;
    }
    
    public int func_148139_c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          65
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            57
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            49
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: goto            29
        //    28: athrow         
        //    29: invokespecial   net/minecraft/client/gui/GuiListExtended.func_148139_c:()I
        //    32: goto            36
        //    35: athrow         
        //    36: bipush          50
        //    38: iadd           
        //    39: ireturn        
        //    40: pop            
        //    41: goto            24
        //    44: pop            
        //    45: aconst_null    
        //    46: goto            40
        //    49: dup            
        //    50: ifnull          40
        //    53: checkcast       Ljava/lang/Throwable;
        //    56: athrow         
        //    57: dup            
        //    58: ifnull          44
        //    61: checkcast       Ljava/lang/Throwable;
        //    64: athrow         
        //    65: aconst_null    
        //    66: athrow         
        //    StackMapTable: 00 0D 43 07 00 19 04 FF 00 0B 00 00 00 01 07 00 19 FC 00 03 07 00 03 43 07 00 19 40 07 00 03 45 07 00 19 40 01 43 07 00 19 43 05 44 07 00 19 47 05 47 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  8      20     49     57     Any
        //  49     57     49     57     Ljava/lang/IndexOutOfBoundsException;
        //  65     67     3      8      Any
        //  28     35     35     36     Any
        //  29     35     3      8      Any
        //  28     35     3      8      Any
        //  28     35     3      8      Any
        //  28     35     28     29     Any
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
    
    public fn c(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          71
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            63
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            55
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/fm.c:Ljava/util/List;
        //    28: iload_1        
        //    29: goto            33
        //    32: athrow         
        //    33: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    38: goto            42
        //    41: athrow         
        //    42: checkcast       Ldev/nuker/pyro/fn;
        //    45: areturn        
        //    46: pop            
        //    47: goto            24
        //    50: pop            
        //    51: aconst_null    
        //    52: goto            46
        //    55: dup            
        //    56: ifnull          46
        //    59: checkcast       Ljava/lang/Throwable;
        //    62: athrow         
        //    63: dup            
        //    64: ifnull          50
        //    67: checkcast       Ljava/lang/Throwable;
        //    70: athrow         
        //    71: aconst_null    
        //    72: athrow         
        //    StackMapTable: 00 0D 43 07 00 19 04 FF 00 0B 00 00 00 01 07 00 19 FD 00 03 07 00 03 01 FF 00 07 00 00 00 01 07 00 19 FF 00 00 00 02 07 00 03 01 00 02 07 00 40 01 47 07 00 19 40 07 00 70 43 07 00 19 43 05 44 07 00 19 47 05 47 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  8      20     55     63     Ljava/lang/NumberFormatException;
        //  55     63     55     63     Any
        //  71     73     3      8      Any
        //  33     41     41     42     Any
        //  33     41     41     42     Ljava/lang/RuntimeException;
        //  33     41     41     42     Ljava/lang/IllegalStateException;
        //  33     41     41     42     Ljava/lang/NegativeArraySizeException;
        //  33     41     3      8      Any
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
    
    @Nullable
    public fn 0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          185
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            177
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            169
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getfield        dev/nuker/pyro/fm.c:I
        //    28: iflt            154
        //    31: aload_0        
        //    32: getfield        dev/nuker/pyro/fm.c:I
        //    35: aload_0        
        //    36: goto            40
        //    39: athrow         
        //    40: invokevirtual   dev/nuker/pyro/fm.func_148127_b:()I
        //    43: goto            47
        //    46: athrow         
        //    47: if_icmpge       154
        //    50: getstatic       dev/nuker/pyro/fc.0:I
        //    53: ifeq            61
        //    56: ldc             901292442
        //    58: goto            63
        //    61: ldc             -1233993207
        //    63: ldc             -293885505
        //    65: ixor           
        //    66: lookupswitch {
        //          -607975387: 61
        //          1477012406: 92
        //          default: 156
        //        }
        //    92: aload_0        
        //    93: getstatic       dev/nuker/pyro/fc.1:I
        //    96: ifeq            104
        //    99: ldc             997577046
        //   101: goto            106
        //   104: ldc             1124011719
        //   106: ldc             -756575331
        //   108: ixor           
        //   109: lookupswitch {
        //          -1877435046: 136
        //          -376290613: 104
        //          default: 158
        //        }
        //   136: aload_0        
        //   137: getfield        dev/nuker/pyro/fm.c:I
        //   140: goto            144
        //   143: athrow         
        //   144: invokevirtual   dev/nuker/pyro/fm.c:(I)Ldev/nuker/pyro/fn;
        //   147: goto            151
        //   150: athrow         
        //   151: goto            155
        //   154: aconst_null    
        //   155: areturn        
        //   156: aconst_null    
        //   157: athrow         
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
        //    StackMapTable: 00 1B 43 07 00 19 04 FF 00 0B 00 00 00 01 07 00 19 FC 00 03 07 00 03 4E 07 00 20 FF 00 00 00 01 07 00 03 00 02 01 07 00 03 45 07 00 19 FF 00 00 00 01 07 00 03 00 02 01 01 0D 41 01 1C 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 46 07 00 19 FF 00 00 00 01 07 00 03 00 02 07 00 03 01 45 07 00 19 40 07 00 1E 02 40 07 00 1E 00 41 07 00 03 41 07 00 20 43 05 44 07 00 20 47 05 47 07 00 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     169    177    Ljava/util/NoSuchElementException;
        //  169    177    169    177    Ljava/lang/IllegalArgumentException;
        //  185    187    3      8      Ljava/lang/NullPointerException;
        //  39     46     46     47     Any
        //  39     46     3      8      Any
        //  40     46     39     40     Ljava/util/ConcurrentModificationException;
        //  39     46     39     40     Ljava/lang/IndexOutOfBoundsException;
        //  39     46     39     40     Ljava/lang/ArithmeticException;
        //  143    150    150    151    Any
        //  144    150    143    144    Any
        //  143    150    3      8      Ljava/lang/RuntimeException;
        //  144    150    3      8      Ljava/util/ConcurrentModificationException;
        //  144    150    150    151    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 68 out of bounds for length 68
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
