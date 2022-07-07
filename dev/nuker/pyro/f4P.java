// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.client.gui.ScaledResolution;

public class f4p extends f4C
{
    public String 0;
    public String 1;
    public int c;
    public f4g c;
    
    @Override
    public int c(final ScaledResolution scaledResolution, final float n, final float n2) {
        return fbS.9C(this, 2010991473, scaledResolution, n, n2);
    }
    
    public f4p(final String 0, final String 2, final int c, final f4g c2) {
        final String s = "";
        while (true) {
            int n = 0;
            Label_0016: {
                if (fc.c < 0) {
                    n = 2074979954;
                    break Label_0016;
                }
                n = 800212002;
            }
            switch (n ^ 0x7628C18F) {
                case 1330407202: {
                    continue;
                }
                default: {
                    super(s);
                    this.0 = 0;
                    while (true) {
                        int n2 = 0;
                        Label_0066: {
                            if (fc.1 != 0) {
                                n2 = 1236019757;
                                break Label_0066;
                            }
                            n2 = -49052019;
                        }
                        switch (n2 ^ 0xEB638ECD) {
                            case -1563450144: {
                                continue;
                            }
                            case 376440896: {
                                this.1 = 2;
                                this.c = c;
                                this.c = c2;
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
                case 226848765: {
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
    public String 2() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          345
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            337
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            329
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ljava/lang/StringBuilder;
        //    27: dup            
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   java/lang/StringBuilder.<init>:()V
        //    35: goto            39
        //    38: athrow         
        //    39: getstatic       dev/nuker/pyro/fc.0:I
        //    42: ifeq            50
        //    45: ldc             -1233453870
        //    47: goto            52
        //    50: ldc             1505586515
        //    52: ldc             899597748
        //    54: ixor           
        //    55: lookupswitch {
        //          -2082195098: 314
        //          -2071037576: 50
        //          default: 80
        //        }
        //    80: aload_0        
        //    81: getfield        dev/nuker/pyro/f4p.0:Ljava/lang/String;
        //    84: getstatic       dev/nuker/pyro/fc.1:I
        //    87: ifeq            95
        //    90: ldc             2053326674
        //    92: goto            97
        //    95: ldc             -1382683586
        //    97: ldc             1275390999
        //    99: ixor           
        //   100: lookupswitch {
        //          -1014987033: 95
        //          912763717: 318
        //          default: 128
        //        }
        //   128: goto            132
        //   131: athrow         
        //   132: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   135: goto            139
        //   138: athrow         
        //   139: getstatic       dev/nuker/pyro/fc.0:I
        //   142: ifeq            150
        //   145: ldc             -1155311109
        //   147: goto            152
        //   150: ldc             212678433
        //   152: ldc             464008311
        //   154: ixor           
        //   155: lookupswitch {
        //          -1601475188: 150
        //          386204502: 180
        //          default: 316
        //        }
        //   180: getstatic       com/mojang/realmsclient/gui/ChatFormatting.GRAY:Lcom/mojang/realmsclient/gui/ChatFormatting;
        //   183: goto            187
        //   186: athrow         
        //   187: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   190: goto            194
        //   193: athrow         
        //   194: aload_0        
        //   195: getfield        dev/nuker/pyro/f4p.1:Ljava/lang/String;
        //   198: ifnonnull       206
        //   201: ldc             -1856335441
        //   203: goto            208
        //   206: ldc             -1856335442
        //   208: ldc             2140730177
        //   210: ixor           
        //   211: tableswitch {
        //          -578501156: 232
        //          -578501155: 237
        //          default: 201
        //        }
        //   232: ldc             ""
        //   234: goto            291
        //   237: new             Ljava/lang/StringBuilder;
        //   240: dup            
        //   241: goto            245
        //   244: athrow         
        //   245: invokespecial   java/lang/StringBuilder.<init>:()V
        //   248: goto            252
        //   251: athrow         
        //   252: ldc             " "
        //   254: goto            258
        //   257: athrow         
        //   258: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   261: goto            265
        //   264: athrow         
        //   265: aload_0        
        //   266: getfield        dev/nuker/pyro/f4p.1:Ljava/lang/String;
        //   269: goto            273
        //   272: athrow         
        //   273: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   276: goto            280
        //   279: athrow         
        //   280: goto            284
        //   283: athrow         
        //   284: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   287: goto            291
        //   290: athrow         
        //   291: goto            295
        //   294: athrow         
        //   295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   298: goto            302
        //   301: athrow         
        //   302: goto            306
        //   305: athrow         
        //   306: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   309: goto            313
        //   312: athrow         
        //   313: areturn        
        //   314: aconst_null    
        //   315: athrow         
        //   316: aconst_null    
        //   317: athrow         
        //   318: aconst_null    
        //   319: athrow         
        //   320: pop            
        //   321: goto            24
        //   324: pop            
        //   325: aconst_null    
        //   326: goto            320
        //   329: dup            
        //   330: ifnull          320
        //   333: checkcast       Ljava/lang/Throwable;
        //   336: athrow         
        //   337: dup            
        //   338: ifnull          324
        //   341: checkcast       Ljava/lang/Throwable;
        //   344: athrow         
        //   345: aconst_null    
        //   346: athrow         
        //    StackMapTable: 00 3E 43 07 00 4B 04 FF 00 0B 00 00 00 01 07 00 4B FC 00 03 07 00 03 46 07 00 4B FF 00 00 00 01 07 00 03 00 02 08 00 18 08 00 18 45 07 00 4B 40 07 00 4D 4A 07 00 4D FF 00 01 00 01 07 00 03 00 02 07 00 4D 01 5B 07 00 4D FF 00 0E 00 01 07 00 03 00 02 07 00 4D 07 00 2F FF 00 01 00 01 07 00 03 00 03 07 00 4D 07 00 2F 01 FF 00 1E 00 01 07 00 03 00 02 07 00 4D 07 00 2F FF 00 02 00 00 00 01 07 00 4B FF 00 00 00 01 07 00 03 00 02 07 00 4D 07 00 2F 45 07 00 4B 40 07 00 4D 4A 07 00 4D FF 00 01 00 01 07 00 03 00 02 07 00 4D 01 5B 07 00 4D 45 07 00 4B FF 00 00 00 01 07 00 03 00 02 07 00 4D 07 00 61 45 07 00 4B 40 07 00 4D 46 07 00 4D 44 07 00 4D FF 00 01 00 01 07 00 03 00 02 07 00 4D 01 57 07 00 4D 44 07 00 4D 46 07 00 72 FF 00 00 00 01 07 00 03 00 03 07 00 4D 08 00 ED 08 00 ED 45 07 00 4B FF 00 00 00 01 07 00 03 00 02 07 00 4D 07 00 4D 44 07 00 43 FF 00 00 00 01 07 00 03 00 03 07 00 4D 07 00 4D 07 00 2F 45 07 00 4B FF 00 00 00 01 07 00 03 00 02 07 00 4D 07 00 4D 46 07 00 4B FF 00 00 00 01 07 00 03 00 03 07 00 4D 07 00 4D 07 00 2F 45 07 00 4B FF 00 00 00 01 07 00 03 00 02 07 00 4D 07 00 4D 42 07 00 4B FF 00 00 00 01 07 00 03 00 02 07 00 4D 07 00 4D 45 07 00 4B FF 00 00 00 01 07 00 03 00 02 07 00 4D 07 00 2F 42 07 00 47 FF 00 00 00 01 07 00 03 00 02 07 00 4D 07 00 2F 45 07 00 4B 40 07 00 4D FF 00 02 00 00 00 01 07 00 4B FF 00 00 00 01 07 00 03 00 01 07 00 4D 45 07 00 4B 40 07 00 2F 40 07 00 4D 41 07 00 4D FF 00 01 00 01 07 00 03 00 02 07 00 4D 07 00 2F 41 07 00 4B 43 05 44 07 00 4B 47 05 47 07 00 4B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     329    337    Ljava/lang/EnumConstantNotPresentException;
        //  329    337    329    337    Any
        //  345    347    3      8      Any
        //  31     38     38     39     Any
        //  32     38     38     39     Ljava/lang/EnumConstantNotPresentException;
        //  31     38     3      8      Ljava/lang/NullPointerException;
        //  31     38     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  31     38     31     32     Any
        //  132    138    138    139    Any
        //  132    138    138    139    Any
        //  132    138    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  132    138    3      8      Ljava/lang/NumberFormatException;
        //  132    138    138    139    Any
        //  186    193    193    194    Any
        //  187    193    186    187    Any
        //  186    193    3      8      Any
        //  187    193    193    194    Any
        //  186    193    3      8      Any
        //  244    251    251    252    Any
        //  245    251    251    252    Any
        //  244    251    244    245    Ljava/lang/NumberFormatException;
        //  244    251    244    245    Ljava/lang/NegativeArraySizeException;
        //  244    251    244    245    Ljava/lang/NullPointerException;
        //  257    264    264    265    Any
        //  258    264    264    265    Ljava/lang/NumberFormatException;
        //  258    264    257    258    Ljava/lang/AssertionError;
        //  258    264    3      8      Any
        //  257    264    264    265    Any
        //  272    279    279    280    Any
        //  273    279    279    280    Ljava/lang/IndexOutOfBoundsException;
        //  273    279    272    273    Any
        //  273    279    279    280    Ljava/lang/NegativeArraySizeException;
        //  272    279    279    280    Any
        //  283    290    290    291    Any
        //  283    290    290    291    Any
        //  283    290    283    284    Any
        //  283    290    290    291    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  283    290    290    291    Ljava/util/ConcurrentModificationException;
        //  294    301    301    302    Any
        //  294    301    3      8      Ljava/lang/IllegalArgumentException;
        //  294    301    3      8      Ljava/lang/IllegalArgumentException;
        //  295    301    301    302    Ljava/lang/NegativeArraySizeException;
        //  294    301    294    295    Ljava/util/ConcurrentModificationException;
        //  306    312    312    313    Any
        //  306    312    312    313    Ljava/lang/IllegalArgumentException;
        //  306    312    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  306    312    312    313    Ljava/lang/NullPointerException;
        //  306    312    3      8      Any
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
}
