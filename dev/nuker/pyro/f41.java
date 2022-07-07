// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class f41
{
    public List<f40> c;
    
    public static f41 c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          61
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            53
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            45
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: goto            28
        //    27: athrow         
        //    28: invokestatic    dev/nuker/pyro/Pyro.getNotificationManager:()Ldev/nuker/pyro/f41;
        //    31: goto            35
        //    34: athrow         
        //    35: areturn        
        //    36: pop            
        //    37: goto            24
        //    40: pop            
        //    41: aconst_null    
        //    42: goto            36
        //    45: dup            
        //    46: ifnull          36
        //    49: checkcast       Ljava/lang/Throwable;
        //    52: athrow         
        //    53: dup            
        //    54: ifnull          40
        //    57: checkcast       Ljava/lang/Throwable;
        //    60: athrow         
        //    61: aconst_null    
        //    62: athrow         
        //    StackMapTable: 00 0D 43 07 00 14 04 4B 07 00 14 03 42 07 00 0D 00 45 07 00 14 40 07 00 03 40 07 00 14 43 05 44 07 00 14 47 05 47 07 00 14
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     45     53     Any
        //  45     53     45     53     Ljava/lang/ClassCastException;
        //  61     63     3      8      Any
        //  27     34     34     35     Any
        //  28     34     27     28     Ljava/lang/StringIndexOutOfBoundsException;
        //  28     34     3      8      Any
        //  28     34     3      8      Any
        //  27     34     34     35     Any
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
    
    public f41() {
        while (true) {
            int n = 0;
            Label_0022: {
                if (fc.1 != 0) {
                    n = 452646286;
                    break Label_0022;
                }
                n = 273153986;
            }
            switch (n ^ 0xCFD53D4C) {
                case -1254370150: {
                    continue;
                }
                default: {
                    this.c = new CopyOnWriteArrayList<f40>();
                }
                case -718280510: {
                    throw null;
                }
            }
            break;
        }
    }
    
    public void c(final String p0, final String p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          177
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            169
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            161
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.c:I
        //    28: ifge            36
        //    31: ldc             712161673
        //    33: goto            38
        //    36: ldc             -459341776
        //    38: ldc             -142746536
        //    40: ixor           
        //    41: lookupswitch {
        //          -586193455: 150
        //          1609230097: 36
        //          default: 68
        //        }
        //    68: getfield        dev/nuker/pyro/f41.c:Ljava/util/List;
        //    71: new             Ldev/nuker/pyro/f40;
        //    74: dup            
        //    75: aload_0        
        //    76: aload_1        
        //    77: getstatic       dev/nuker/pyro/fc.0:I
        //    80: ifeq            88
        //    83: ldc             239128440
        //    85: goto            90
        //    88: ldc             1275630930
        //    90: ldc             -480165967
        //    92: ixor           
        //    93: lookupswitch {
        //          -316542775: 148
        //          1385874750: 88
        //          default: 120
        //        }
        //   120: aload_2        
        //   121: iload_3        
        //   122: goto            126
        //   125: athrow         
        //   126: invokespecial   dev/nuker/pyro/f40.<init>:(Ldev/nuker/pyro/f41;Ljava/lang/String;Ljava/lang/String;I)V
        //   129: goto            133
        //   132: athrow         
        //   133: goto            137
        //   136: athrow         
        //   137: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   142: goto            146
        //   145: athrow         
        //   146: pop            
        //   147: return         
        //   148: aconst_null    
        //   149: athrow         
        //   150: aconst_null    
        //   151: athrow         
        //   152: pop            
        //   153: goto            24
        //   156: pop            
        //   157: aconst_null    
        //   158: goto            152
        //   161: dup            
        //   162: ifnull          152
        //   165: checkcast       Ljava/lang/Throwable;
        //   168: athrow         
        //   169: dup            
        //   170: ifnull          156
        //   173: checkcast       Ljava/lang/Throwable;
        //   176: athrow         
        //   177: aconst_null    
        //   178: athrow         
        //    StackMapTable: 00 19 43 07 00 14 04 FF 00 0B 00 00 00 01 07 00 14 FF 00 03 00 04 07 00 03 07 00 49 07 00 49 01 00 00 4B 07 00 03 FF 00 01 00 04 07 00 03 07 00 49 07 00 49 01 00 02 07 00 03 01 5D 07 00 03 FF 00 13 00 04 07 00 03 07 00 49 07 00 49 01 00 05 07 00 43 08 00 47 08 00 47 07 00 03 07 00 49 FF 00 01 00 04 07 00 03 07 00 49 07 00 49 01 00 06 07 00 43 08 00 47 08 00 47 07 00 03 07 00 49 01 FF 00 1D 00 04 07 00 03 07 00 49 07 00 49 01 00 05 07 00 43 08 00 47 08 00 47 07 00 03 07 00 49 44 07 00 14 FF 00 00 00 04 07 00 03 07 00 49 07 00 49 01 00 07 07 00 43 08 00 47 08 00 47 07 00 03 07 00 49 07 00 49 01 45 07 00 14 FF 00 00 00 04 07 00 03 07 00 49 07 00 49 01 00 02 07 00 43 07 00 3B 42 07 00 14 FF 00 00 00 04 07 00 03 07 00 49 07 00 49 01 00 02 07 00 43 07 00 3B 47 07 00 14 40 01 FF 00 01 00 04 07 00 03 07 00 49 07 00 49 01 00 05 07 00 43 08 00 47 08 00 47 07 00 03 07 00 49 41 07 00 03 41 07 00 4B 43 05 44 07 00 4B 47 05 47 07 00 14
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     161    169    Ljava/lang/NullPointerException;
        //  161    169    161    169    Ljava/lang/NumberFormatException;
        //  177    179    3      8      Ljava/lang/NumberFormatException;
        //  125    132    132    133    Any
        //  126    132    125    126    Any
        //  125    132    3      8      Any
        //  125    132    132    133    Ljava/lang/NumberFormatException;
        //  126    132    3      8      Any
        //  136    145    145    146    Any
        //  136    145    136    137    Ljava/util/ConcurrentModificationException;
        //  137    145    136    137    Any
        //  137    145    3      8      Any
        //  136    145    3      8      Ljava/lang/EnumConstantNotPresentException;
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
}
