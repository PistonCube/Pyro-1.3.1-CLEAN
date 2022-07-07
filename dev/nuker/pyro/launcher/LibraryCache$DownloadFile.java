// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.launcher;

import dev.nuker.pyro.dc;
import java.util.function.Consumer;
import java.io.File;
import java.net.URL;

public class LibraryCache$DownloadFile
{
    public URL url;
    public File save;
    public Consumer<LibraryCache$DownloadFile> completionRunnable;
    public boolean downloaded;
    public boolean downloading;
    public boolean cantDownload;
    public long progress;
    public long byteCount;
    
    static {
        throw t;
    }
    
    public LibraryCache$DownloadFile(final URL url, final File save) {
        this.completionRunnable = null;
        this.downloading = (((int)669042481L ^ 0x27E0C731) != 0x0);
        this.cantDownload = (((int)(-851101522L) ^ 0xCD4538AE) != 0x0);
        while (true) {
            int n = 0;
            Label_0054: {
                if (dc.0 <= 0) {
                    n = ((int)1525973163L ^ 0x5F3EFC94);
                    break Label_0054;
                }
                n = ((int)(-497681018L) ^ 0x9562096D);
            }
            switch (n ^ ((int)1481023713L ^ 0xD169DFEC)) {
                case -1931148494: {
                    continue;
                }
                case -31945754: {
                    this.progress = ((long)242497833 ^ 0xE743929L);
                    while (true) {
                        int n2 = 0;
                        Label_0122: {
                            if (dc.c == 0) {
                                n2 = ((int)(-455662032L) ^ 0xA8755D61);
                                break Label_0122;
                            }
                            n2 = ((int)(-1000434058L) ^ 0xB1F1BECB);
                        }
                        switch (n2 ^ ((int)(-911325258L) ^ 0xFF4B7509)) {
                            case 1781095018: {
                                continue;
                            }
                            default: {
                                final long byteCount = (long)(-1731744961) ^ 0xFFFFFFFF98C7AB3FL;
                                while (true) {
                                    int n3 = 0;
                                    Label_0187: {
                                        if (dc.0 <= 0) {
                                            n3 = ((int)941263293L ^ 0x51B59646);
                                            break Label_0187;
                                        }
                                        n3 = ((int)470306349L ^ 0x1568696);
                                    }
                                    switch (n3 ^ ((int)(-312876364L) ^ 0xC8B3DCC5)) {
                                        case 1279598986: {
                                            continue;
                                        }
                                        case 951383754: {
                                            this.byteCount = byteCount;
                                            while (true) {
                                                int n4 = 0;
                                                Label_0246: {
                                                    if (dc.0 <= 0) {
                                                        n4 = ((int)(-126844192L) ^ 0xCA229B98);
                                                        break Label_0246;
                                                    }
                                                    n4 = ((int)(-1231633529L) ^ 0xC31D4A85);
                                                }
                                                switch (n4 ^ ((int)(-237439147L) ^ 0x40567234)) {
                                                    case -2082694119: {
                                                        continue;
                                                    }
                                                    case -1006302109: {
                                                        this.url = url;
                                                        this.save = save;
                                                        while (true) {
                                                            int n5 = 0;
                                                            Label_0314: {
                                                                if (dc.1 < 0) {
                                                                    n5 = ((int)419214070L ^ 0xF6CDECB3);
                                                                    break Label_0314;
                                                                }
                                                                n5 = ((int)1964640730L ^ 0xDBE0AAC7);
                                                            }
                                                            switch (n5 ^ ((int)(-1911599497L) ^ 0x9E91BC62)) {
                                                                case -22041520: {
                                                                    continue;
                                                                }
                                                                case -1100721912: {
                                                                    final boolean exists = save.exists();
                                                                    while (true) {
                                                                        int n6 = 0;
                                                                        Label_0375: {
                                                                            if (dc.1 < 0) {
                                                                                n6 = ((int)(-2132543337L) ^ 0x6576FF5C);
                                                                                break Label_0375;
                                                                            }
                                                                            n6 = ((int)(-1401808278L) ^ 0xDFF8E1DB);
                                                                        }
                                                                        switch (n6 ^ ((int)(-1993488883L) ^ 0xB7C39B4D)) {
                                                                            case -612672885: {
                                                                                continue;
                                                                            }
                                                                            case 1298441969: {
                                                                                this.downloaded = exists;
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
                            case 2051492334: {
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
    
    public boolean isDownloading() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/dc.0:I
        //     4: ifeq            38
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            30
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0         /* this */
        //    17: getfield        dev/nuker/pyro/launcher/LibraryCache$DownloadFile.downloading:Z
        //    20: ireturn        
        //    21: pop            
        //    22: goto            16
        //    25: pop            
        //    26: aconst_null    
        //    27: goto            21
        //    30: dup            
        //    31: ifnull          21
        //    34: checkcast       Ljava/lang/Throwable;
        //    37: athrow         
        //    38: dup            
        //    39: ifnull          25
        //    42: checkcast       Ljava/lang/Throwable;
        //    45: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 85 FC 00 03 07 00 03 44 07 00 85 43 05 44 07 00 85 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      12     30     38     Any
        //  30     38     30     38     Any
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
    
    public boolean isDownloaded() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/dc.c:I
        //     4: ifeq            38
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            30
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0         /* this */
        //    17: getfield        dev/nuker/pyro/launcher/LibraryCache$DownloadFile.downloaded:Z
        //    20: ireturn        
        //    21: pop            
        //    22: goto            16
        //    25: pop            
        //    26: aconst_null    
        //    27: goto            21
        //    30: dup            
        //    31: ifnull          21
        //    34: checkcast       Ljava/lang/Throwable;
        //    37: athrow         
        //    38: dup            
        //    39: ifnull          25
        //    42: checkcast       Ljava/lang/Throwable;
        //    45: athrow         
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 85 FC 00 03 07 00 03 44 07 00 85 43 05 44 07 00 85 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  0      12     30     38     Any
        //  30     38     30     38     Ljava/lang/AssertionError;
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
    
    public static boolean access$102(final LibraryCache$DownloadFile x0, final boolean x1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/dc.0:I
        //     4: ifeq            98
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            90
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: getstatic       dev/nuker/pyro/dc.0:I
        //    19: ifgt            32
        //    22: ldc2_w          -72225393
        //    25: l2i            
        //    26: ldc             -369576640
        //    28: ixor           
        //    29: goto            39
        //    32: ldc2_w          1271705119
        //    35: l2i            
        //    36: ldc             1189759616
        //    38: ixor           
        //    39: ldc2_w          766054098
        //    42: l2i            
        //    43: ldc             -265928606
        //    45: ixor           
        //    46: ixor           
        //    47: lookupswitch {
        //          -809101697: 32
        //          -794187217: 72
        //          default: 79
        //        }
        //    72: aload_0         /* x0 */
        //    73: iload_1         /* x1 */
        //    74: dup_x1         
        //    75: putfield        dev/nuker/pyro/launcher/LibraryCache$DownloadFile.downloaded:Z
        //    78: ireturn        
        //    79: aconst_null    
        //    80: athrow         
        //    81: pop            
        //    82: goto            16
        //    85: pop            
        //    86: aconst_null    
        //    87: goto            81
        //    90: dup            
        //    91: ifnull          81
        //    94: checkcast       Ljava/lang/Throwable;
        //    97: athrow         
        //    98: dup            
        //    99: ifnull          85
        //   102: checkcast       Ljava/lang/Throwable;
        //   105: athrow         
        //    StackMapTable: 00 0A FF 00 0C 00 00 00 01 07 00 85 FD 00 03 07 00 03 01 0F 46 01 20 06 41 07 00 85 43 05 44 07 00 85 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  0      12     90     98     Any
        //  90     98     90     98     Ljava/lang/ArrayIndexOutOfBoundsException;
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
    
    public void download() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          342
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/dc.0:I
        //    12: ifeq            334
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            326
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0         /* this */
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   dev/nuker/pyro/launcher/LibraryCache$DownloadFile.isDownloaded:()Z
        //    32: goto            36
        //    35: athrow         
        //    36: ifne            49
        //    39: ldc2_w          -1871559745
        //    42: l2i            
        //    43: ldc             445429822
        //    45: ixor           
        //    46: goto            56
        //    49: ldc2_w          -533154584
        //    52: l2i            
        //    53: ldc             1791381352
        //    55: ixor           
        //    56: ldc2_w          -160680439
        //    59: l2i            
        //    60: ldc             225424934
        //    62: ixor           
        //    63: ixor           
        //    64: tableswitch {
        //          -470091940: 88
        //          -470091939: 233
        //          default: 39
        //        }
        //    88: new             Ldev/nuker/pyro/launcher/LibraryCache$DownloadFile$DownloadThread;
        //    91: dup            
        //    92: getstatic       dev/nuker/pyro/dc.1:I
        //    95: ifge            108
        //    98: ldc2_w          774126269
        //   101: l2i            
        //   102: ldc             -1682527922
        //   104: ixor           
        //   105: goto            115
        //   108: ldc2_w          -1041217740
        //   111: l2i            
        //   112: ldc             16276505
        //   114: ixor           
        //   115: ldc2_w          2034481903
        //   118: l2i            
        //   119: ldc             1772613545
        //   121: ixor           
        //   122: ixor           
        //   123: lookupswitch {
        //          -1518942539: 108
        //          -773042581: 148
        //          default: 315
        //        }
        //   148: aload_0         /* this */
        //   149: getstatic       dev/nuker/pyro/dc.0:I
        //   152: ifgt            165
        //   155: ldc2_w          -85777528
        //   158: l2i            
        //   159: ldc             570834030
        //   161: ixor           
        //   162: goto            172
        //   165: ldc2_w          1875409086
        //   168: l2i            
        //   169: ldc             -354858365
        //   171: ixor           
        //   172: ldc2_w          73300886
        //   175: l2i            
        //   176: ldc             -1560843635
        //   178: ixor           
        //   179: ixor           
        //   180: lookupswitch {
        //          16405895: 165
        //          2118913789: 311
        //          default: 208
        //        }
        //   208: goto            212
        //   211: athrow         
        //   212: invokespecial   dev/nuker/pyro/launcher/LibraryCache$DownloadFile$DownloadThread.<init>:(Ldev/nuker/pyro/launcher/LibraryCache$DownloadFile;)V
        //   215: goto            219
        //   218: athrow         
        //   219: goto            223
        //   222: athrow         
        //   223: invokevirtual   dev/nuker/pyro/launcher/LibraryCache$DownloadFile$DownloadThread.start:()V
        //   226: goto            230
        //   229: athrow         
        //   230: goto            310
        //   233: aload_0         /* this */
        //   234: getfield        dev/nuker/pyro/launcher/LibraryCache$DownloadFile.completionRunnable:Ljava/util/function/Consumer;
        //   237: getstatic       dev/nuker/pyro/dc.c:I
        //   240: ifne            253
        //   243: ldc2_w          -826081678
        //   246: l2i            
        //   247: ldc             -2061539447
        //   249: ixor           
        //   250: goto            260
        //   253: ldc2_w          -99169503
        //   256: l2i            
        //   257: ldc             -1290688520
        //   259: ixor           
        //   260: ldc2_w          1975817357
        //   263: l2i            
        //   264: ldc             -1827748933
        //   266: ixor           
        //   267: ixor           
        //   268: lookupswitch {
        //          -1677571823: 253
        //          -1390948659: 313
        //          default: 296
        //        }
        //   296: aload_0         /* this */
        //   297: goto            301
        //   300: athrow         
        //   301: invokeinterface java/util/function/Consumer.accept:(Ljava/lang/Object;)V
        //   306: goto            310
        //   309: athrow         
        //   310: return         
        //   311: aconst_null    
        //   312: athrow         
        //   313: aconst_null    
        //   314: athrow         
        //   315: aconst_null    
        //   316: athrow         
        //   317: pop            
        //   318: goto            24
        //   321: pop            
        //   322: aconst_null    
        //   323: goto            317
        //   326: dup            
        //   327: ifnull          317
        //   330: checkcast       Ljava/lang/Throwable;
        //   333: athrow         
        //   334: dup            
        //   335: ifnull          321
        //   338: checkcast       Ljava/lang/Throwable;
        //   341: athrow         
        //   342: aconst_null    
        //   343: athrow         
        //    StackMapTable: 00 2A 43 07 00 85 04 FF 00 0B 00 00 00 01 07 00 85 FC 00 03 07 00 03 43 07 00 85 40 07 00 03 45 07 00 85 40 01 02 09 46 01 1F FF 00 13 00 01 07 00 03 00 02 08 00 58 08 00 58 FF 00 06 00 01 07 00 03 00 03 08 00 58 08 00 58 01 FF 00 20 00 01 07 00 03 00 02 08 00 58 08 00 58 FF 00 10 00 01 07 00 03 00 03 08 00 58 08 00 58 07 00 03 FF 00 06 00 01 07 00 03 00 04 08 00 58 08 00 58 07 00 03 01 FF 00 23 00 01 07 00 03 00 03 08 00 58 08 00 58 07 00 03 FF 00 02 00 00 00 01 07 00 85 FF 00 00 00 01 07 00 03 00 03 08 00 58 08 00 58 07 00 03 45 07 00 85 40 07 00 AF 42 07 00 A0 40 07 00 AF 45 07 00 85 00 02 53 07 00 D2 FF 00 06 00 01 07 00 03 00 02 07 00 D2 01 63 07 00 D2 43 07 00 85 FF 00 00 00 01 07 00 03 00 02 07 00 D2 07 00 03 47 07 00 85 00 FF 00 00 00 01 07 00 03 00 03 08 00 58 08 00 58 07 00 03 41 07 00 D2 FF 00 01 00 01 07 00 03 00 02 08 00 58 08 00 58 41 07 00 D8 43 05 44 07 00 D8 47 05 47 07 00 85
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     326    334    Ljava/lang/ArithmeticException;
        //  326    334    326    334    Ljava/lang/IndexOutOfBoundsException;
        //  342    344    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  28     35     35     36     Any
        //  28     35     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  28     35     35     36     Any
        //  28     35     28     29     Any
        //  28     35     28     29     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  212    218    218    219    Any
        //  212    218    3      8      Any
        //  212    218    3      8      Ljava/lang/NegativeArraySizeException;
        //  212    218    3      8      Any
        //  212    218    218    219    Ljava/lang/IllegalArgumentException;
        //  222    229    229    230    Any
        //  223    229    3      8      Ljava/lang/ArithmeticException;
        //  223    229    229    230    Ljava/lang/IllegalArgumentException;
        //  223    229    229    230    Ljava/lang/IllegalArgumentException;
        //  222    229    222    223    Ljava/lang/NegativeArraySizeException;
        //  300    309    309    310    Any
        //  300    309    3      8      Any
        //  301    309    309    310    Any
        //  301    309    300    301    Any
        //  300    309    300    301    Ljava/lang/StringIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 126 out of bounds for length 126
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
    
    public static boolean access$002(final LibraryCache$DownloadFile x0, final boolean x1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/dc.c:I
        //     4: ifeq            101
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            93
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0         /* x0 */
        //    17: getstatic       dev/nuker/pyro/dc.0:I
        //    20: ifgt            33
        //    23: ldc2_w          272180838
        //    26: l2i            
        //    27: ldc             -1696777973
        //    29: ixor           
        //    30: goto            40
        //    33: ldc2_w          -901665942
        //    36: l2i            
        //    37: ldc             -1721666783
        //    39: ixor           
        //    40: ldc2_w          -1035396960
        //    43: l2i            
        //    44: ldc             -2101049517
        //    46: ixor           
        //    47: ixor           
        //    48: lookupswitch {
        //          -899055458: 33
        //          330123192: 76
        //          default: 82
        //        }
        //    76: iload_1         /* x1 */
        //    77: dup_x1         
        //    78: putfield        dev/nuker/pyro/launcher/LibraryCache$DownloadFile.downloading:Z
        //    81: ireturn        
        //    82: aconst_null    
        //    83: athrow         
        //    84: pop            
        //    85: goto            16
        //    88: pop            
        //    89: aconst_null    
        //    90: goto            84
        //    93: dup            
        //    94: ifnull          84
        //    97: checkcast       Ljava/lang/Throwable;
        //   100: athrow         
        //   101: dup            
        //   102: ifnull          88
        //   105: checkcast       Ljava/lang/Throwable;
        //   108: athrow         
        //    StackMapTable: 00 0A FF 00 0C 00 00 00 01 07 00 85 FD 00 03 07 00 03 01 50 07 00 03 FF 00 06 00 02 07 00 03 01 00 02 07 00 03 01 63 07 00 03 45 07 00 03 41 07 00 85 43 05 44 07 00 85 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  0      12     93     101    Any
        //  93     101    93     101    Ljava/lang/UnsupportedOperationException;
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
    
    public boolean cantDownload() {
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
                            if (dc.1 >= 0) {
                                null;
                                goto Label_0030;
                            }
                            continue Label_0038;
                            return this.cantDownload;
                        }
                        catch (IllegalArgumentException ex) {}
                    }
                    continue Label_0038;
                } while (o == null);
                break;
            }
        }
        throw (Throwable)o;
    }
}
