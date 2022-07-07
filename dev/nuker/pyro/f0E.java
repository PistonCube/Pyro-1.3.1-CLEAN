// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import kotlin.Unit;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.gson.JsonElement;

public class f0e extends f0l
{
    @NotNull
    @Override
    public JsonElement c() {
        return fbS.b(this, 1899728893);
    }
    
    static {
        throw t;
    }
    
    @NotNull
    @Override
    public f0V 4() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          115
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            107
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            99
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Ldev/nuker/pyro/f0E;
        //    27: dup            
        //    28: getstatic       dev/nuker/pyro/fc.0:I
        //    31: ifeq            39
        //    34: ldc             884111288
        //    36: goto            41
        //    39: ldc             881005656
        //    41: ldc             259023133
        //    43: ixor           
        //    44: lookupswitch {
        //          1002575525: 88
        //          1759427224: 39
        //          default: 72
        //        }
        //    72: aload_0        
        //    73: goto            77
        //    76: athrow         
        //    77: invokespecial   dev/nuker/pyro/f0E.<init>:(Ldev/nuker/pyro/f0e;)V
        //    80: goto            84
        //    83: athrow         
        //    84: checkcast       Ldev/nuker/pyro/f0V;
        //    87: areturn        
        //    88: aconst_null    
        //    89: athrow         
        //    90: pop            
        //    91: goto            24
        //    94: pop            
        //    95: aconst_null    
        //    96: goto            90
        //    99: dup            
        //   100: ifnull          90
        //   103: checkcast       Ljava/lang/Throwable;
        //   106: athrow         
        //   107: dup            
        //   108: ifnull          94
        //   111: checkcast       Ljava/lang/Throwable;
        //   114: athrow         
        //   115: aconst_null    
        //   116: athrow         
        //    StackMapTable: 00 11 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FC 00 03 07 00 03 FF 00 0E 00 01 07 00 03 00 02 08 00 18 08 00 18 FF 00 01 00 01 07 00 03 00 03 08 00 18 08 00 18 01 FF 00 1E 00 01 07 00 03 00 02 08 00 18 08 00 18 43 07 00 21 FF 00 00 00 01 07 00 03 00 03 08 00 18 08 00 18 07 00 03 45 07 00 21 40 07 00 23 FF 00 03 00 01 07 00 03 00 02 08 00 18 08 00 18 41 07 00 21 43 05 44 07 00 21 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     99     107    Ljava/lang/NullPointerException;
        //  99     107    99     107    Any
        //  115    117    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  76     83     83     84     Any
        //  76     83     3      8      Ljava/lang/NumberFormatException;
        //  77     83     3      8      Any
        //  76     83     76     77     Any
        //  76     83     3      8      Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 45 out of bounds for length 45
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
    
    public f0e(@NotNull final String s, @NotNull final String s2, @Nullable final String s3) {
        while (true) {
            int n = 0;
            Label_0015: {
                if (fc.c < 0) {
                    n = 1852851154;
                    break Label_0015;
                }
                n = 182459480;
            }
            switch (n ^ 0xC10637F8) {
                case -1351191510: {
                    continue;
                }
                case -874108000: {
                    while (true) {
                        int n2 = 0;
                        Label_0061: {
                            if (fc.c < 0) {
                                n2 = 1797329011;
                                break Label_0061;
                            }
                            n2 = -927361130;
                        }
                        switch (n2 ^ 0xE8763B6D) {
                            case 1187524756: {
                                continue;
                            }
                            default: {
                                while (true) {
                                    int n3 = 0;
                                    Label_0106: {
                                        if (fc.1 != 0) {
                                            n3 = -929069055;
                                            break Label_0106;
                                        }
                                        n3 = 1202433145;
                                    }
                                    switch (n3 ^ 0x5E86AB6E) {
                                        case -1776737425: {
                                            continue;
                                        }
                                        case 422381335: {
                                            super(s, s2, s3, Unit.INSTANCE);
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
                            case -2091439330: {
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
    
    @Override
    public void c(@NotNull final JsonElement jsonElement) {
        fbS.6X(this, 1646137404, jsonElement);
    }
}
