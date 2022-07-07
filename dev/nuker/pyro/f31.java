// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.network.Packet;

public class f31 extends f2U
{
    public Packet<?> c;
    
    public Packet c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            129
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            121
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: getstatic       dev/nuker/pyro/fc.0:I
        //    19: ifeq            27
        //    22: ldc             -550466105
        //    24: goto            29
        //    27: ldc             -1491142679
        //    29: ldc             1009413177
        //    31: ixor           
        //    32: lookupswitch {
        //          -1491851370: 27
        //          -484777474: 108
        //          default: 60
        //        }
        //    60: aload_0        
        //    61: getstatic       dev/nuker/pyro/fc.c:I
        //    64: ifge            72
        //    67: ldc             -1133194777
        //    69: goto            74
        //    72: ldc             -660524572
        //    74: ldc             -1490611862
        //    76: ixor           
        //    77: lookupswitch {
        //          -744599570: 72
        //          458473613: 110
        //          default: 104
        //        }
        //   104: getfield        dev/nuker/pyro/f31.c:Lnet/minecraft/network/Packet;
        //   107: areturn        
        //   108: aconst_null    
        //   109: athrow         
        //   110: aconst_null    
        //   111: athrow         
        //   112: pop            
        //   113: goto            16
        //   116: pop            
        //   117: aconst_null    
        //   118: goto            112
        //   121: dup            
        //   122: ifnull          112
        //   125: checkcast       Ljava/lang/Throwable;
        //   128: athrow         
        //   129: dup            
        //   130: ifnull          116
        //   133: checkcast       Ljava/lang/Throwable;
        //   136: athrow         
        //    StackMapTable: 00 0E FF 00 0C 00 00 00 01 07 00 11 FC 00 03 07 00 03 0A 41 01 1E 4B 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5D 07 00 03 03 41 07 00 03 41 07 00 11 43 05 44 07 00 11 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     121    129    Any
        //  121    129    121    129    Any
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
    
    public f31(final Packet c, final f2T f2T) {
        super(f2T);
        this.c = (Packet<?>)c;
    }
    
    static {
        throw t;
    }
}
