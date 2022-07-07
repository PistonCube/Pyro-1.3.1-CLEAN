// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import com.google.gson.JsonElement;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import java.util.function.Consumer;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class f0n
{
    @NotNull
    public fw<Object> c;
    public List<Consumer<f0n<Object>>> c;
    @NotNull
    public String 0;
    @Nullable
    public String 1;
    public c;
    
    public void c(final Object o) {
        fbS.2N(this, 505005663, o);
    }
    
    public static List c(final f0n f0n) {
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
                            if (fc.1 > 0) {
                                continue Label_0038;
                            }
                            null;
                            return f0n.c;
                            return f0n.c;
                        }
                        catch (EnumConstantNotPresentException ex) {
                            if (ex != null) {
                                throw ex;
                            }
                            return f0n.c;
                        }
                    }
                    continue Label_0038;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    @NotNull
    public String 0() {
        return fbS.5f(this, 167725102);
    }
    
    public f0n(@NotNull final String s, final Object o) {
        while (true) {
            int n = 0;
            Label_0013: {
                if (fc.1 != 0) {
                    n = -1927861735;
                    break Label_0013;
                }
                n = -1048169241;
            }
            switch (n ^ 0xDE6BF0D5) {
                case 1400691404: {
                    continue;
                }
                case 535675954: {
                    while (true) {
                        int n2 = 0;
                        Label_0060: {
                            if (fc.c < 0) {
                                n2 = -888752560;
                                break Label_0060;
                            }
                            n2 = -2115688365;
                        }
                        switch (n2 ^ 0xF32E3033) {
                            case 942179939: {
                                continue;
                            }
                            case 1925912672: {
                                this(s, null, o);
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
    }
    
    public void c(@NotNull final fw fw) {
        fbS.3O(this, 1985674215, fw);
    }
    
    public Object 1() {
        return fbS.3q(this, 531465565);
    }
    
    @NotNull
    public fw 5() {
        return fbS.80(this, 1254523115);
    }
    
    public void 0(@Nullable final String s) {
        fbS.9g(this, 1474137395, s);
    }
    
    public f0n(@NotNull final String 0, @Nullable final String 2, final Object c) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: pop            
        //     2: aload_0        
        //     3: invokespecial   java/lang/Object.<init>:()V
        //     6: aload_0        
        //     7: aload_1        
        //     8: putfield        dev/nuker/pyro/f0n.0:Ljava/lang/String;
        //    11: aload_0        
        //    12: aload_2        
        //    13: getstatic       dev/nuker/pyro/fc.0:I
        //    16: ifeq            24
        //    19: ldc             -1080395326
        //    21: goto            26
        //    24: ldc             1826808480
        //    26: ldc             2082602037
        //    28: ixor           
        //    29: lookupswitch {
        //          -1011120649: 24
        //          281222805: 56
        //          default: 236
        //        }
        //    56: putfield        dev/nuker/pyro/f0n.1:Ljava/lang/String;
        //    59: aload_0        
        //    60: aload_3        
        //    61: putfield        dev/nuker/pyro/f0n.c:Ljava/lang/Object;
        //    64: getstatic       dev/nuker/pyro/fc.1:I
        //    67: ifeq            75
        //    70: ldc             -613845021
        //    72: goto            77
        //    75: ldc             23658595
        //    77: ldc             -876967750
        //    79: ixor           
        //    80: lookupswitch {
        //          -892106535: 108
        //          282328921: 75
        //          default: 238
        //        }
        //   108: aload_0        
        //   109: new             Ljava/util/ArrayList;
        //   112: dup            
        //   113: invokespecial   java/util/ArrayList.<init>:()V
        //   116: checkcast       Ljava/util/List;
        //   119: putfield        dev/nuker/pyro/f0n.c:Ljava/util/List;
        //   122: aload_0        
        //   123: new             Ldev/nuker/pyro/fz;
        //   126: dup            
        //   127: aload_0        
        //   128: invokevirtual   dev/nuker/pyro/f0n.1:()Ljava/lang/Object;
        //   131: new             Ldev/nuker/pyro/f0m;
        //   134: dup            
        //   135: getstatic       dev/nuker/pyro/fc.c:I
        //   138: ifge            146
        //   141: ldc             -295824063
        //   143: goto            148
        //   146: ldc             -1001858629
        //   148: ldc             700261607
        //   150: ixor           
        //   151: lookupswitch {
        //          -941411930: 146
        //          -302645924: 176
        //          default: 240
        //        }
        //   176: aload_0        
        //   177: invokespecial   dev/nuker/pyro/f0m.<init>:(Ldev/nuker/pyro/f0n;)V
        //   180: checkcast       Ljava/util/function/Consumer;
        //   183: invokespecial   dev/nuker/pyro/fz.<init>:(Ljava/lang/Object;Ljava/util/function/Consumer;)V
        //   186: checkcast       Ldev/nuker/pyro/fw;
        //   189: getstatic       dev/nuker/pyro/fc.1:I
        //   192: ifeq            200
        //   195: ldc             600495549
        //   197: goto            202
        //   200: ldc             1255805560
        //   202: ldc             390095585
        //   204: ixor           
        //   205: lookupswitch {
        //          -1577496252: 200
        //          881506140: 242
        //          default: 232
        //        }
        //   232: putfield        dev/nuker/pyro/f0n.c:Ldev/nuker/pyro/fw;
        //   235: return         
        //   236: aconst_null    
        //   237: athrow         
        //   238: aconst_null    
        //   239: athrow         
        //   240: aconst_null    
        //   241: athrow         
        //   242: aconst_null    
        //   243: athrow         
        //    StackMapTable: 00 10 FF 00 18 00 04 07 00 03 07 00 3A 07 00 3A 07 00 05 00 02 07 00 03 07 00 3A FF 00 01 00 04 07 00 03 07 00 3A 07 00 3A 07 00 05 00 03 07 00 03 07 00 3A 01 FF 00 1D 00 04 07 00 03 07 00 3A 07 00 3A 07 00 05 00 02 07 00 03 07 00 3A 12 41 01 1E FF 00 25 00 04 07 00 03 07 00 3A 07 00 3A 07 00 05 00 06 07 00 03 08 00 7B 08 00 7B 07 00 05 08 00 83 08 00 83 FF 00 01 00 04 07 00 03 07 00 3A 07 00 3A 07 00 05 00 07 07 00 03 08 00 7B 08 00 7B 07 00 05 08 00 83 08 00 83 01 FF 00 1B 00 04 07 00 03 07 00 3A 07 00 3A 07 00 05 00 06 07 00 03 08 00 7B 08 00 7B 07 00 05 08 00 83 08 00 83 FF 00 17 00 04 07 00 03 07 00 3A 07 00 3A 07 00 05 00 02 07 00 03 07 00 7C FF 00 01 00 04 07 00 03 07 00 3A 07 00 3A 07 00 05 00 03 07 00 03 07 00 7C 01 FF 00 1D 00 04 07 00 03 07 00 3A 07 00 3A 07 00 05 00 02 07 00 03 07 00 7C FF 00 03 00 04 07 00 03 07 00 3A 07 00 3A 07 00 05 00 02 07 00 03 07 00 3A 01 FF 00 01 00 04 07 00 03 07 00 3A 07 00 3A 07 00 05 00 06 07 00 03 08 00 7B 08 00 7B 07 00 05 08 00 83 08 00 83 FF 00 01 00 04 07 00 03 07 00 3A 07 00 3A 07 00 05 00 02 07 00 03 07 00 7C
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:344)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:173)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:169)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:547)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:480)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
    
    public Object 3() {
        return fbS.3p(this, 1825001822);
    }
    
    @NotNull
    public f0V 4() {
        throw new UnsupportedOperationException("Please report this to the binscure obfuscator developers");
    }
    
    @NotNull
    public JsonElement c() {
        throw new UnsupportedOperationException("Please report this to the binscure obfuscator developers");
    }
    
    public void 1(@NotNull final String s) {
        fbS.9k(this, 929435097, s);
    }
    
    public void c(@NotNull final Consumer consumer) {
        fbS.gT(this, 359190711, consumer);
    }
    
    public void c(@NotNull final JsonElement jsonElement) {
        throw new UnsupportedOperationException("Please report this to the binscure obfuscator developers");
    }
    
    @Nullable
    public String 2() {
        return fbS.57(this, 1961990432);
    }
    
    static {
        throw t;
    }
    
    public static void c(final f0n f0n, final List c) {
        Object o = null;
        Block_0: {
            break Block_0;
        Label_0085:
            while (true) {
            Label_0029_Outer:
                do {
                    Label_0072: {
                        break Label_0072;
                        try {
                            o = null;
                            if (fc.0 <= 0) {
                                null;
                                goto Label_0077;
                            }
                            continue Label_0085;
                            // switch([Lcom.strobel.decompiler.ast.Label;@735706b8, n ^ 0x16C4F12)
                            // iftrue(Label_0027:, fc.c >= 0)
                            while (true) {
                                while (true) {
                                    final int n = 1199012748;
                                    continue Label_0029_Outer;
                                }
                                Label_0027: {
                                    final int n = -1811501735;
                                }
                                continue;
                            }
                            Label_0060: {
                                f0n.c = (List<Consumer<f0n<Object>>>)c;
                            }
                            return;
                            Label_0066:
                            throw null;
                        }
                        catch (IllegalArgumentException ex) {}
                    }
                    continue Label_0085;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
    
    public void 0(final Object o) {
        fbS.2D(this, 782411932, o);
    }
}
