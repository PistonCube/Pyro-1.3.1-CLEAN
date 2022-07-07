// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.awt.Color;
import java.util.Random;

public class fb5
{
    public static int[] c;
    public static Random c;
    
    public static Color c(final Color p0, final Color p1, final float p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          386
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            378
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            370
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: fload_2        
        //    25: fconst_0       
        //    26: fcmpg          
        //    27: ifge            32
        //    30: aload_1        
        //    31: areturn        
        //    32: fload_2        
        //    33: fconst_1       
        //    34: fcmpl          
        //    35: ifle            82
        //    38: getstatic       dev/nuker/pyro/fc.c:I
        //    41: ifge            49
        //    44: ldc             -1430631237
        //    46: goto            51
        //    49: ldc             1335161632
        //    51: ldc             1737918338
        //    53: ixor           
        //    54: lookupswitch {
        //          -852702407: 355
        //          458758037: 49
        //          default: 80
        //        }
        //    80: aload_0        
        //    81: areturn        
        //    82: fconst_1       
        //    83: fload_2        
        //    84: fsub           
        //    85: fstore_3       
        //    86: iconst_3       
        //    87: newarray        F
        //    89: astore          4
        //    91: iconst_3       
        //    92: newarray        F
        //    94: astore          5
        //    96: aload_0        
        //    97: aload           4
        //    99: goto            103
        //   102: athrow         
        //   103: invokevirtual   java/awt/Color.getColorComponents:([F)[F
        //   106: goto            110
        //   109: athrow         
        //   110: pop            
        //   111: aload_1        
        //   112: aload           5
        //   114: getstatic       dev/nuker/pyro/fc.0:I
        //   117: ifeq            125
        //   120: ldc             -221136384
        //   122: goto            127
        //   125: ldc             1053549569
        //   127: ldc             1807781893
        //   129: ixor           
        //   130: lookupswitch {
        //          -1726928379: 125
        //          1426813956: 156
        //          default: 357
        //        }
        //   156: goto            160
        //   159: athrow         
        //   160: invokevirtual   java/awt/Color.getColorComponents:([F)[F
        //   163: goto            167
        //   166: athrow         
        //   167: pop            
        //   168: new             Ljava/awt/Color;
        //   171: dup            
        //   172: aload           4
        //   174: iconst_0       
        //   175: faload         
        //   176: fload_2        
        //   177: fmul           
        //   178: aload           5
        //   180: iconst_0       
        //   181: faload         
        //   182: getstatic       dev/nuker/pyro/fc.0:I
        //   185: ifeq            193
        //   188: ldc             7193886
        //   190: goto            195
        //   193: ldc             -1567140942
        //   195: ldc             601143920
        //   197: ixor           
        //   198: lookupswitch {
        //          -633111127: 193
        //          599359342: 351
        //          default: 224
        //        }
        //   224: fload_3        
        //   225: fmul           
        //   226: fadd           
        //   227: aload           4
        //   229: iconst_1       
        //   230: faload         
        //   231: fload_2        
        //   232: fmul           
        //   233: getstatic       dev/nuker/pyro/fc.c:I
        //   236: ifge            244
        //   239: ldc             109613131
        //   241: goto            246
        //   244: ldc             -1291391742
        //   246: ldc             1720025821
        //   248: ixor           
        //   249: lookupswitch {
        //          -712806433: 276
        //          1611469462: 244
        //          default: 353
        //        }
        //   276: aload           5
        //   278: iconst_1       
        //   279: faload         
        //   280: fload_3        
        //   281: fmul           
        //   282: fadd           
        //   283: aload           4
        //   285: iconst_2       
        //   286: faload         
        //   287: fload_2        
        //   288: fmul           
        //   289: getstatic       dev/nuker/pyro/fc.1:I
        //   292: ifeq            300
        //   295: ldc             487012353
        //   297: goto            302
        //   300: ldc             -729911330
        //   302: ldc             400860283
        //   304: ixor           
        //   305: lookupswitch {
        //          182688890: 359
        //          1064951205: 300
        //          default: 332
        //        }
        //   332: aload           5
        //   334: iconst_2       
        //   335: faload         
        //   336: fload_3        
        //   337: fmul           
        //   338: fadd           
        //   339: goto            343
        //   342: athrow         
        //   343: invokespecial   java/awt/Color.<init>:(FFF)V
        //   346: goto            350
        //   349: athrow         
        //   350: areturn        
        //   351: aconst_null    
        //   352: athrow         
        //   353: aconst_null    
        //   354: athrow         
        //   355: aconst_null    
        //   356: athrow         
        //   357: aconst_null    
        //   358: athrow         
        //   359: aconst_null    
        //   360: athrow         
        //   361: pop            
        //   362: goto            24
        //   365: pop            
        //   366: aconst_null    
        //   367: goto            361
        //   370: dup            
        //   371: ifnull          361
        //   374: checkcast       Ljava/lang/Throwable;
        //   377: athrow         
        //   378: dup            
        //   379: ifnull          365
        //   382: checkcast       Ljava/lang/Throwable;
        //   385: athrow         
        //   386: aconst_null    
        //   387: athrow         
        //    StackMapTable: 00 2B FF 00 03 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 01 07 00 1B F8 00 04 FF 00 0B 00 00 00 01 07 00 1B FE 00 03 07 00 22 07 00 22 02 07 10 41 01 1C 01 FF 00 13 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 01 07 00 1B FF 00 00 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 02 07 00 22 07 00 3B 45 07 00 1B 40 07 00 3B FF 00 0E 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 02 07 00 22 07 00 3B FF 00 01 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 03 07 00 22 07 00 3B 01 FF 00 1C 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 02 07 00 22 07 00 3B FF 00 02 00 00 00 01 07 00 1B FF 00 00 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 02 07 00 22 07 00 3B 45 07 00 1B 40 07 00 3B FF 00 19 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 04 08 00 A8 08 00 A8 02 02 FF 00 01 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 05 08 00 A8 08 00 A8 02 02 01 FF 00 1C 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 04 08 00 A8 08 00 A8 02 02 FF 00 13 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 04 08 00 A8 08 00 A8 02 02 FF 00 01 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 05 08 00 A8 08 00 A8 02 02 01 FF 00 1D 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 04 08 00 A8 08 00 A8 02 02 FF 00 17 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 05 08 00 A8 08 00 A8 02 02 02 FF 00 01 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 06 08 00 A8 08 00 A8 02 02 02 01 FF 00 1D 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 05 08 00 A8 08 00 A8 02 02 02 49 07 00 1B FF 00 00 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 05 08 00 A8 08 00 A8 02 02 02 45 07 00 1B 40 07 00 22 FF 00 00 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 04 08 00 A8 08 00 A8 02 02 FF 00 01 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 04 08 00 A8 08 00 A8 02 02 F8 00 01 FF 00 01 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 02 07 00 22 07 00 3B FF 00 01 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 05 08 00 A8 08 00 A8 02 02 02 FF 00 01 00 03 07 00 22 07 00 22 02 00 01 07 00 1B 43 05 44 07 00 1B 47 05 FF 00 07 00 06 07 00 22 07 00 22 02 02 07 00 3B 07 00 3B 00 01 07 00 1B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     370    378    Any
        //  370    378    370    378    Any
        //  386    388    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  102    109    109    110    Any
        //  102    109    3      8      Ljava/lang/RuntimeException;
        //  102    109    102    103    Any
        //  102    109    102    103    Ljava/lang/NegativeArraySizeException;
        //  102    109    109    110    Ljava/util/ConcurrentModificationException;
        //  160    166    166    167    Any
        //  160    166    3      8      Any
        //  160    166    166    167    Any
        //  160    166    166    167    Any
        //  160    166    3      8      Ljava/util/ConcurrentModificationException;
        //  342    349    349    350    Any
        //  343    349    3      8      Any
        //  343    349    342    343    Ljava/lang/UnsupportedOperationException;
        //  343    349    342    343    Any
        //  342    349    3      8      Any
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
    
    public static double[] c(final int n) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0204:
            while (true) {
                do {
                    Label_0191: {
                        break Label_0191;
                        try {
                            o = null;
                            if (fc.1 <= 0) {
                                null;
                                goto Label_0196;
                            }
                            continue Label_0204;
                            final double[] array = { (n >> 16 & 0xFF) / 255.0, (n >> 8 & 0xFF) / 255.0, (n & 0xFF) / 255.0, 0.0, 0.0 };
                            final int n2 = 3;
                            // iftrue(Label_0077:, fc.0 == 0)
                            // switch([Lcom.strobel.decompiler.ast.Label;@57de1d9f, n4 ^ 0xDD091BD7)
                            // iftrue(Label_0135:, fc.c >= 0)
                        Label_0137:
                            while (true) {
                                Block_4: {
                                    break Block_4;
                                    Label_0168: {
                                        final int n3;
                                        array[n3] = (n >> 24 & 0xFF) / 255.0;
                                    }
                                    return array;
                                    Label_0077:
                                    final int n4 = 533471738;
                                    Label_0108:
                                    array[n2] = (n >> 24 & 0xFF) / 255.0;
                                    final int n3 = 4;
                                    Block_5: {
                                        break Block_5;
                                        Label_0135:
                                        final int n5 = 29797564;
                                        break Label_0137;
                                        Label_0185:
                                        throw null;
                                    }
                                    final int n5 = 898874762;
                                    break Label_0137;
                                    Label_0183:
                                    throw null;
                                }
                                final int n4 = -466459046;
                                continue;
                            }
                        }
                        // switch([Lcom.strobel.decompiler.ast.Label;@1c727678, n5 ^ 0xDF3D0D53)
                        catch (ArithmeticException ex) {}
                    }
                    continue Label_0204;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public static int c(final String s) {
        return fbS.92(null, 1005652139, s);
    }
    
    public static int 0() {
        return fbS.bO(null, 875550974);
    }
    
    static {
        fb5.c = new int[] { 16711680, 16728064, 16744192, 16776960, 8453888, 65280, 65535, 33023, 255 };
        while (true) {
            int n = 0;
            Label_0073: {
                if (fc.0 != 0) {
                    n = 808259982;
                    break Label_0073;
                }
                n = 220103276;
            }
            switch (n ^ 0x5E56D922) {
                case 46534409: {
                    continue;
                }
                default: {
                    fb5.c = new Random();
                }
                case 1853606060: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public static int c() {
        return fbS.b6(null, 1842186913);
    }
}
