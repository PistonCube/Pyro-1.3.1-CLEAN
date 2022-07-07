// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

public class fbu
{
    public long c;
    
    public void 0() {
        fbS.dM(this, 1856539662);
    }
    
    public void c(final long n) {
        fbS.4Q(this, 1705502468, n);
    }
    
    static {
        throw t;
    }
    
    public fbu() {
        while (true) {
            int n = 0;
            Label_0017: {
                if (fc.1 != 0) {
                    n = -842000189;
                    break Label_0017;
                }
                n = -816074347;
            }
            switch (n ^ 0xB55195E1) {
                case -1658925651: {
                    continue;
                }
                default: {
                    this.c = -1L;
                }
                case 2021756194: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public boolean c(final double p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          77
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            69
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            61
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: goto            28
        //    27: athrow         
        //    28: invokestatic    java/lang/System.currentTimeMillis:()J
        //    31: goto            35
        //    34: athrow         
        //    35: aload_0        
        //    36: getfield        dev/nuker/pyro/fbu.c:J
        //    39: lsub           
        //    40: l2d            
        //    41: dload_1        
        //    42: dcmpl          
        //    43: iflt            50
        //    46: iconst_1       
        //    47: goto            51
        //    50: iconst_0       
        //    51: ireturn        
        //    52: pop            
        //    53: goto            24
        //    56: pop            
        //    57: aconst_null    
        //    58: goto            52
        //    61: dup            
        //    62: ifnull          52
        //    65: checkcast       Ljava/lang/Throwable;
        //    68: athrow         
        //    69: dup            
        //    70: ifnull          56
        //    73: checkcast       Ljava/lang/Throwable;
        //    76: athrow         
        //    77: aconst_null    
        //    78: athrow         
        //    StackMapTable: 00 0F 43 07 00 31 04 FF 00 0B 00 00 00 01 07 00 31 FD 00 03 07 00 03 03 42 07 00 31 00 45 07 00 31 40 04 0E 40 01 40 07 00 31 43 05 44 07 00 31 47 05 47 07 00 31
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  8      20     61     69     Ljava/lang/ClassCastException;
        //  61     69     61     69     Any
        //  77     79     3      8      Any
        //  27     34     34     35     Any
        //  27     34     34     35     Any
        //  27     34     27     28     Any
        //  27     34     3      8      Any
        //  28     34     27     28     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 41 out of bounds for length 41
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
    
    public long c() {
        return fbS.bU(this, 1695937308);
    }
}
