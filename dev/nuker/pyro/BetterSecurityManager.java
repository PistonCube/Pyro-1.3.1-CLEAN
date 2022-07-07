// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.security.Permission;

public class BetterSecurityManager extends SecurityManager
{
    @Override
    public void checkPermission(final Permission perm) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/dc.1:I
        //     4: ifgt            34
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            26
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: return         
        //    17: pop            
        //    18: goto            16
        //    21: pop            
        //    22: aconst_null    
        //    23: goto            17
        //    26: dup            
        //    27: ifnull          17
        //    30: checkcast       Ljava/lang/Throwable;
        //    33: athrow         
        //    34: dup            
        //    35: ifnull          21
        //    38: checkcast       Ljava/lang/Throwable;
        //    41: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 0F FD 00 03 07 00 03 07 00 15 40 07 00 0F 43 05 44 07 00 0F 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     26     34     Any
        //  26     34     26     34     Any
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
    
    public BetterSecurityManager() {
        while (true) {
            int n = 0;
            Label_0024: {
                if (dc.0 > 0) {
                    n = ((int)(-1735251485L) ^ 0xC0E8B8E6);
                    break Label_0024;
                }
                n = ((int)737692576L ^ 0x63452B3B);
            }
            switch (n ^ ((int)(-1113239911L) ^ 0xD070A961)) {
                case 477094050: {
                    continue;
                }
                default: {}
                case 900691709: {
                    throw null;
                }
            }
            break;
        }
    }
    
    static {
        throw t;
    }
}
