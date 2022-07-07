// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.Map;
import net.minecraftforge.fml.relauncher.IFMLCallHook;

public class f7 implements IFMLCallHook
{
    public f7() {
        while (true) {
            int n = 0;
            Label_0014: {
                if (fc.0 != 0) {
                    n = 1357082137;
                    break Label_0014;
                }
                n = -543903766;
            }
            switch (n ^ 0xE14FD679) {
                case -1314080672: {
                    continue;
                }
                case 1054570899: {}
                default: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void injectData(final Map p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          318
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            310
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            302
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: ldc             "\u109e\u149f\ub98d\u6d63\u228a\udeb7\ub22b\ud5a0\u07c5\u02ef\u9449"
        //    27: getstatic       dev/nuker/pyro/fc.c:I
        //    30: ifge            38
        //    33: ldc             -216902032
        //    35: goto            40
        //    38: ldc             1162188976
        //    40: ldc             1991317419
        //    42: ixor           
        //    43: lookupswitch {
        //          -2052898341: 285
        //          1920411092: 38
        //          default: 68
        //        }
        //    68: goto            72
        //    71: athrow         
        //    72: invokestatic    invokestatic   !!! ERROR
        //    75: goto            79
        //    78: athrow         
        //    79: goto            83
        //    82: athrow         
        //    83: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    88: goto            92
        //    91: athrow         
        //    92: checkcast       Ljava/lang/ClassLoader;
        //    95: astore_2       
        //    96: aload_2        
        //    97: ldc             "\u1093\u1496\ub998\u6d3e\u228a\ude93\ub225\ud5a5\u07ce\u02fd\u945d\u1e4d\ud286\u1b1a\u6a7e\uba4e\u57a2\u446b\u6386\u2b51\u186a\uc237\u5965\uf3f1\u3cc6\u06d3\u7d24\ubadb\u5eb4\u67c4\ub7d3\ufb13\u43b7\u44be\uf0cf\uc20e\u4979\ubb12"
        //    99: getstatic       dev/nuker/pyro/fc.c:I
        //   102: ifge            110
        //   105: ldc             -2121312441
        //   107: goto            112
        //   110: ldc             -1596791609
        //   112: ldc             -788552347
        //   114: ixor           
        //   115: lookupswitch {
        //          975983561: 110
        //          1366356514: 287
        //          default: 140
        //        }
        //   140: goto            144
        //   143: athrow         
        //   144: invokestatic    invokestatic   !!! ERROR
        //   147: goto            151
        //   150: athrow         
        //   151: goto            155
        //   154: athrow         
        //   155: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //   158: goto            162
        //   161: athrow         
        //   162: pop            
        //   163: goto            284
        //   166: astore_3       
        //   167: new             Ljava/lang/RuntimeException;
        //   170: dup            
        //   171: ldc             "\u10be\u149c\ub999\u6d7c\u229d\ude95\ub263\ud5b5\u0781\u02ec\u9452\u1e42\ud281\u1b4e\u6a4b\uba0f\u57b6\u4463\u6391\u2b5a\u1866\uc235\u592c\uf3f3\u3c89\u06f6\u7d2c\ubace\u5ebf\u67d8\ub7d8\ufb72\u43b2\u44bb\uf0de\uc20a\u4968\ubb05\u143d\u1431\u85e5\u41e7\u8a9d\u6de8\ua73c\ub9c8\u7c7a\ufd4c\ua3e8\u018d\ud5a9\u16dc\udd39\ue960\uade4\ud2c1\u0a15\ub5b5\uc73c\ue410\u4461\u729d\uf49b\u6516\u7189\u5961\ue2e8\ue352"
        //   173: getstatic       dev/nuker/pyro/fc.0:I
        //   176: ifeq            184
        //   179: ldc             856962666
        //   181: goto            186
        //   184: ldc             738311755
        //   186: ldc             -1366683194
        //   188: ixor           
        //   189: lookupswitch {
        //          -1650579540: 291
        //          -1033837638: 184
        //          default: 216
        //        }
        //   216: goto            220
        //   219: athrow         
        //   220: invokestatic    invokestatic   !!! ERROR
        //   223: goto            227
        //   226: athrow         
        //   227: aload_3        
        //   228: getstatic       dev/nuker/pyro/fc.1:I
        //   231: ifeq            239
        //   234: ldc             -2110803697
        //   236: goto            241
        //   239: ldc             1790719526
        //   241: ldc             -2139158176
        //   243: ixor           
        //   244: lookupswitch {
        //          -356303034: 272
        //          38844527: 239
        //          default: 289
        //        }
        //   272: goto            276
        //   275: athrow         
        //   276: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   279: goto            283
        //   282: athrow         
        //   283: athrow         
        //   284: return         
        //   285: aconst_null    
        //   286: athrow         
        //   287: aconst_null    
        //   288: athrow         
        //   289: aconst_null    
        //   290: athrow         
        //   291: aconst_null    
        //   292: athrow         
        //   293: pop            
        //   294: goto            24
        //   297: pop            
        //   298: aconst_null    
        //   299: goto            293
        //   302: dup            
        //   303: ifnull          293
        //   306: checkcast       Ljava/lang/Throwable;
        //   309: athrow         
        //   310: dup            
        //   311: ifnull          297
        //   314: checkcast       Ljava/lang/Throwable;
        //   317: athrow         
        //   318: aconst_null    
        //   319: athrow         
        //    StackMapTable: 00 33 43 07 00 33 04 FF 00 0B 00 00 00 01 07 00 33 FD 00 03 07 00 03 07 00 3F FF 00 0D 00 02 07 00 03 07 00 3F 00 02 07 00 3F 07 00 5E FF 00 01 00 02 07 00 03 07 00 3F 00 03 07 00 3F 07 00 5E 01 FF 00 1B 00 02 07 00 03 07 00 3F 00 02 07 00 3F 07 00 5E FF 00 02 00 00 00 01 07 00 33 FF 00 00 00 02 07 00 03 07 00 3F 00 02 07 00 3F 07 00 5E 45 07 00 33 FF 00 00 00 02 07 00 03 07 00 3F 00 02 07 00 3F 07 00 5E 42 07 00 22 FF 00 00 00 02 07 00 03 07 00 3F 00 02 07 00 3F 07 00 5E 47 07 00 33 40 07 00 05 FF 00 11 00 03 07 00 03 07 00 3F 07 00 45 00 02 07 00 45 07 00 5E FF 00 01 00 03 07 00 03 07 00 3F 07 00 45 00 03 07 00 45 07 00 5E 01 FF 00 1B 00 03 07 00 03 07 00 3F 07 00 45 00 02 07 00 45 07 00 5E 42 07 00 33 FF 00 00 00 03 07 00 03 07 00 3F 07 00 45 00 02 07 00 45 07 00 5E 45 07 00 33 FF 00 00 00 03 07 00 03 07 00 3F 07 00 45 00 02 07 00 45 07 00 5E FF 00 02 00 00 00 01 07 00 33 FF 00 00 00 03 07 00 03 07 00 3F 07 00 45 00 02 07 00 45 07 00 5E 45 07 00 33 40 07 00 60 43 07 00 18 FF 00 11 00 04 07 00 03 07 00 3F 07 00 45 07 00 18 00 03 08 00 A7 08 00 A7 07 00 5E FF 00 01 00 04 07 00 03 07 00 3F 07 00 45 07 00 18 00 04 08 00 A7 08 00 A7 07 00 5E 01 FF 00 1D 00 04 07 00 03 07 00 3F 07 00 45 07 00 18 00 03 08 00 A7 08 00 A7 07 00 5E 42 07 00 28 FF 00 00 00 04 07 00 03 07 00 3F 07 00 45 07 00 18 00 03 08 00 A7 08 00 A7 07 00 5E 45 07 00 33 FF 00 00 00 04 07 00 03 07 00 3F 07 00 45 07 00 18 00 03 08 00 A7 08 00 A7 07 00 5E FF 00 0B 00 04 07 00 03 07 00 3F 07 00 45 07 00 18 00 04 08 00 A7 08 00 A7 07 00 5E 07 00 18 FF 00 01 00 04 07 00 03 07 00 3F 07 00 45 07 00 18 00 05 08 00 A7 08 00 A7 07 00 5E 07 00 18 01 FF 00 1E 00 04 07 00 03 07 00 3F 07 00 45 07 00 18 00 04 08 00 A7 08 00 A7 07 00 5E 07 00 18 42 07 00 33 FF 00 00 00 04 07 00 03 07 00 3F 07 00 45 07 00 18 00 04 08 00 A7 08 00 A7 07 00 5E 07 00 18 45 07 00 33 40 07 00 28 FA 00 00 FF 00 00 00 02 07 00 03 07 00 3F 00 02 07 00 3F 07 00 5E FF 00 01 00 03 07 00 03 07 00 3F 07 00 45 00 02 07 00 45 07 00 5E FF 00 01 00 04 07 00 03 07 00 3F 07 00 45 07 00 18 00 04 08 00 A7 08 00 A7 07 00 5E 07 00 18 FF 00 01 00 04 07 00 03 07 00 3F 07 00 45 07 00 18 00 03 08 00 A7 08 00 A7 07 00 5E FF 00 01 00 02 07 00 03 07 00 3F 00 01 07 00 33 43 05 44 07 00 33 47 05 47 07 00 33
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  96     154    166    293    Ljava/lang/ClassNotFoundException;
        //  155    163    166    293    Ljava/lang/ClassNotFoundException;
        //  8      20     302    310    Any
        //  302    310    302    310    Ljava/lang/AssertionError;
        //  318    320    3      8      Any
        //  72     78     78     79     Any
        //  72     78     78     79     Ljava/lang/StringIndexOutOfBoundsException;
        //  72     78     3      8      Ljava/util/ConcurrentModificationException;
        //  72     78     78     79     Any
        //  72     78     3      8      Ljava/util/NoSuchElementException;
        //  82     91     91     92     Any
        //  82     91     3      8      Any
        //  83     91     82     83     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  82     91     3      8      Any
        //  83     91     3      8      Ljava/lang/IllegalStateException;
        //  143    150    150    151    Any
        //  143    150    143    144    Any
        //  143    150    143    144    Any
        //  143    150    3      8      Ljava/lang/ArithmeticException;
        //  144    150    3      8      Any
        //  155    161    161    162    Any
        //  155    161    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  155    161    3      8      Ljava/lang/RuntimeException;
        //  155    161    161    162    Any
        //  155    161    3      8      Any
        //  219    226    226    227    Any
        //  220    226    219    220    Ljava/lang/ClassCastException;
        //  219    226    226    227    Ljava/lang/UnsupportedOperationException;
        //  220    226    219    220    Ljava/lang/EnumConstantNotPresentException;
        //  220    226    3      8      Ljava/lang/AssertionError;
        //  275    282    282    283    Any
        //  275    282    282    283    Any
        //  276    282    275    276    Any
        //  275    282    275    276    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  275    282    282    283    Any
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
    
    static {
        throw t;
    }
    
    public Object call() {
        return fbS.3f(this, 1708264169);
    }
    
    public Void c() {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0035:
            while (true) {
                do {
                    Label_0022: {
                        break Label_0022;
                        try {
                            o = null;
                            if (fc.1 <= 0) {
                                null;
                                goto Label_0027;
                            }
                            continue Label_0035;
                            return null;
                        }
                        catch (ClassCastException ex) {}
                    }
                    continue Label_0035;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
}
