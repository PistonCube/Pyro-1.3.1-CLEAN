// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import dev.nuker.pyro.security.inject.LauncherEventHide;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.entity.EntityPlayerSP;

public class f6w extends fH
{
    public f0f<f6v> c;
    public f0f<f6u> 0;
    public boolean c;
    
    @Override
    public void c(final boolean p0, @Nullable final EntityPlayerSP p1, @Nullable final World p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          154
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            146
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            138
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            35
        //    30: ldc             -882627476
        //    32: goto            37
        //    35: ldc             327728533
        //    37: ldc             -642168403
        //    39: ixor           
        //    40: lookupswitch {
        //          -799367497: 35
        //          316499393: 125
        //          default: 68
        //        }
        //    68: aload_0        
        //    69: iload_1        
        //    70: aload_2        
        //    71: getstatic       dev/nuker/pyro/fc.1:I
        //    74: ifeq            82
        //    77: ldc             1220012261
        //    79: goto            84
        //    82: ldc             -762558722
        //    84: ldc             -127461750
        //    86: ixor           
        //    87: lookupswitch {
        //          -1328480657: 127
        //          1265483438: 82
        //          default: 112
        //        }
        //   112: aload_3        
        //   113: goto            117
        //   116: athrow         
        //   117: invokespecial   dev/nuker/pyro/fH.c:(ZLnet/minecraft/client/entity/EntityPlayerSP;Lnet/minecraft/world/World;)V
        //   120: goto            124
        //   123: athrow         
        //   124: return         
        //   125: aconst_null    
        //   126: athrow         
        //   127: aconst_null    
        //   128: athrow         
        //   129: pop            
        //   130: goto            24
        //   133: pop            
        //   134: aconst_null    
        //   135: goto            129
        //   138: dup            
        //   139: ifnull          129
        //   142: checkcast       Ljava/lang/Throwable;
        //   145: athrow         
        //   146: dup            
        //   147: ifnull          133
        //   150: checkcast       Ljava/lang/Throwable;
        //   153: athrow         
        //   154: aconst_null    
        //   155: athrow         
        //    RuntimeInvisibleTypeAnnotations: 00 02 16 01 00 00 0D 00 00 16 02 00 00 0D 00 00
        //    StackMapTable: 00 15 43 07 00 18 04 FF 00 0B 00 00 00 01 07 00 18 FF 00 03 00 04 07 00 03 01 07 00 27 07 00 29 00 00 0A 41 01 1E FF 00 0D 00 04 07 00 03 01 07 00 27 07 00 29 00 03 07 00 03 01 07 00 27 FF 00 01 00 04 07 00 03 01 07 00 27 07 00 29 00 04 07 00 03 01 07 00 27 01 FF 00 1B 00 04 07 00 03 01 07 00 27 07 00 29 00 03 07 00 03 01 07 00 27 43 07 00 18 FF 00 00 00 04 07 00 03 01 07 00 27 07 00 29 00 04 07 00 03 01 07 00 27 07 00 29 45 07 00 18 00 00 FF 00 01 00 04 07 00 03 01 07 00 27 07 00 29 00 03 07 00 03 01 07 00 27 41 07 00 18 43 05 44 07 00 18 47 05 47 07 00 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     138    146    Any
        //  138    146    138    146    Any
        //  154    156    3      8      Any
        //  116    123    123    124    Any
        //  116    123    116    117    Any
        //  117    123    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  116    123    116    117    Ljava/lang/AssertionError;
        //  116    123    3      8      Any
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
    
    public f6w() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            11
        //     6: ldc             -1171302979
        //     8: goto            13
        //    11: ldc             -1287230274
        //    13: ldc             1148371596
        //    15: ixor           
        //    16: lookupswitch {
        //          -27420879: 351
        //          36886503: 11
        //          default: 44
        //        }
        //    44: aload_0        
        //    45: ldc             "\u222d\u149c\u8b13\ub3d7\uc974\uec20\ub236\ue716\ud96b\ue907"
        //    47: getstatic       dev/nuker/pyro/fc.c:I
        //    50: ifge            58
        //    53: ldc             1813085692
        //    55: goto            60
        //    58: ldc             164039479
        //    60: ldc             -133221278
        //    62: ixor           
        //    63: lookupswitch {
        //          -1809954402: 357
        //          497322910: 58
        //          default: 88
        //        }
        //    88: invokestatic    invokestatic   !!! ERROR
        //    91: ldc             "\u220d\u149c\u8b13\ub3d7\uc974\uec20\ub236\ue716\ud96b\ue907"
        //    93: invokestatic    invokestatic   !!! ERROR
        //    96: ldc             "\u2207\u149a\u8b29\ub3d8\uc96c\uec29\ub22b\ue700\ud97b\ue953\ua6f6\u1e5c\ue036\uc5a4\u819d\u88b8\u57ad\u76d1\ubd7d\uc0bf\u2add\uc23a\u6bc3\u2d53\ud763\u3406\u7d22\u8877\u8005\u8c31\u8571\ufb33\u7106\u9a02\u1b2f\uf0ab\u4972\u89a5"
        //    98: invokestatic    invokestatic   !!! ERROR
        //   101: invokespecial   dev/nuker/pyro/fH.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   104: aload_0        
        //   105: new             Ldev/nuker/pyro/f0f;
        //   108: dup            
        //   109: ldc             "\u222e\u149c\u8b3e\ub3dc"
        //   111: invokestatic    invokestatic   !!! ERROR
        //   114: ldc             "\u220e\u149c\u8b3e\ub3dc"
        //   116: invokestatic    invokestatic   !!! ERROR
        //   119: aconst_null    
        //   120: getstatic       dev/nuker/pyro/f6v.1:Ldev/nuker/pyro/f6v;
        //   123: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   126: putfield        dev/nuker/pyro/f6w.c:Ldev/nuker/pyro/f0f;
        //   129: aload_0        
        //   130: new             Ldev/nuker/pyro/f0f;
        //   133: dup            
        //   134: ldc             "\u222b\u1492\u8b34\ub3dd"
        //   136: getstatic       dev/nuker/pyro/fc.1:I
        //   139: ifeq            147
        //   142: ldc             -1747214231
        //   144: goto            149
        //   147: ldc             1586692305
        //   149: ldc             510935185
        //   151: ixor           
        //   152: lookupswitch {
        //          -1984962312: 353
        //          429825369: 147
        //          default: 180
        //        }
        //   180: invokestatic    invokestatic   !!! ERROR
        //   183: ldc             "\u220b\u1492\u8b34\ub3dd"
        //   185: invokestatic    invokestatic   !!! ERROR
        //   188: aconst_null    
        //   189: getstatic       dev/nuker/pyro/fc.c:I
        //   192: ifge            200
        //   195: ldc             -1689854056
        //   197: goto            202
        //   200: ldc             -1856288459
        //   202: ldc             43367475
        //   204: ixor           
        //   205: lookupswitch {
        //          -1815153402: 232
        //          -1714199637: 200
        //          default: 355
        //        }
        //   232: getstatic       dev/nuker/pyro/f6u.1:Ldev/nuker/pyro/f6u;
        //   235: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   238: putfield        dev/nuker/pyro/f6w.0:Ldev/nuker/pyro/f0f;
        //   241: aload_0        
        //   242: iconst_0       
        //   243: putfield        dev/nuker/pyro/f6w.c:Z
        //   246: aload_0        
        //   247: getstatic       dev/nuker/pyro/fc.1:I
        //   250: ifeq            258
        //   253: ldc             -1262038399
        //   255: goto            260
        //   258: ldc             1730889887
        //   260: ldc             -132631798
        //   262: ixor           
        //   263: lookupswitch {
        //          -1624015979: 288
        //          1289675147: 258
        //          default: 349
        //        }
        //   288: aload_0        
        //   289: getfield        dev/nuker/pyro/f6w.c:Ldev/nuker/pyro/f0f;
        //   292: invokevirtual   dev/nuker/pyro/f6w.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   295: pop            
        //   296: aload_0        
        //   297: aload_0        
        //   298: getfield        dev/nuker/pyro/f6w.0:Ldev/nuker/pyro/f0f;
        //   301: getstatic       dev/nuker/pyro/fc.c:I
        //   304: ifge            312
        //   307: ldc             521238314
        //   309: goto            314
        //   312: ldc             -2076930360
        //   314: ldc             1111739526
        //   316: ixor           
        //   317: lookupswitch {
        //          -965262770: 344
        //          1565703084: 312
        //          default: 359
        //        }
        //   344: invokevirtual   dev/nuker/pyro/f6w.c:(Ldev/nuker/pyro/f0n;)Ldev/nuker/pyro/f0n;
        //   347: pop            
        //   348: return         
        //   349: aconst_null    
        //   350: athrow         
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
        //    StackMapTable: 00 18 0B 41 01 1E FF 00 0D 00 01 06 00 02 06 07 00 6D FF 00 01 00 01 06 00 03 06 07 00 6D 01 FF 00 1B 00 01 06 00 02 06 07 00 6D FF 00 3A 00 01 07 00 03 00 04 07 00 03 08 00 82 08 00 82 07 00 6D FF 00 01 00 01 07 00 03 00 05 07 00 03 08 00 82 08 00 82 07 00 6D 01 FF 00 1E 00 01 07 00 03 00 04 07 00 03 08 00 82 08 00 82 07 00 6D FF 00 13 00 01 07 00 03 00 06 07 00 03 08 00 82 08 00 82 07 00 6D 07 00 6D 05 FF 00 01 00 01 07 00 03 00 07 07 00 03 08 00 82 08 00 82 07 00 6D 07 00 6D 05 01 FF 00 1D 00 01 07 00 03 00 06 07 00 03 08 00 82 08 00 82 07 00 6D 07 00 6D 05 59 07 00 03 FF 00 01 00 01 07 00 03 00 02 07 00 03 01 5B 07 00 03 FF 00 17 00 01 07 00 03 00 02 07 00 03 07 00 41 FF 00 01 00 01 07 00 03 00 03 07 00 03 07 00 41 01 FF 00 1D 00 01 07 00 03 00 02 07 00 03 07 00 41 44 07 00 03 FF 00 01 00 01 06 00 00 FF 00 01 00 01 07 00 03 00 04 07 00 03 08 00 82 08 00 82 07 00 6D FF 00 01 00 01 07 00 03 00 06 07 00 03 08 00 82 08 00 82 07 00 6D 07 00 6D 05 FF 00 01 00 01 06 00 02 06 07 00 6D FF 00 01 00 01 07 00 03 00 02 07 00 03 07 00 41
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Invalid BootstrapMethods attribute entry: 21 additional arguments required for method a.a, but only 0 specified.
        //     at com.strobel.assembler.ir.Error.invalidBootstrapMethodEntry(Error.java:244)
        //     at com.strobel.assembler.ir.MetadataReader.readAttributeCore(MetadataReader.java:280)
        //     at com.strobel.assembler.metadata.ClassFileReader.readAttributeCore(ClassFileReader.java:261)
        //     at com.strobel.assembler.ir.MetadataReader.inflateAttributes(MetadataReader.java:439)
        //     at com.strobel.assembler.metadata.ClassFileReader.visitAttributes(ClassFileReader.java:1134)
        //     at com.strobel.assembler.metadata.ClassFileReader.readClass(ClassFileReader.java:439)
        //     at com.strobel.assembler.metadata.ClassFileReader.readClass(ClassFileReader.java:377)
        //     at com.strobel.assembler.metadata.MetadataSystem.resolveType(MetadataSystem.java:129)
        //     at com.strobel.decompiler.NoRetryMetadataSystem.resolveType(DecompilerDriver.java:476)
        //     at com.strobel.assembler.metadata.MetadataSystem.resolveCore(MetadataSystem.java:81)
        //     at com.strobel.assembler.metadata.MetadataResolver.resolve(MetadataResolver.java:104)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.resolve(CoreMetadataFactory.java:616)
        //     at com.strobel.assembler.metadata.MetadataResolver.resolve(MetadataResolver.java:128)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.resolve(CoreMetadataFactory.java:626)
        //     at com.strobel.assembler.metadata.MethodReference.resolve(MethodReference.java:177)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2438)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2695)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    @f06
    @LauncherEventHide
    public void c(final f3k p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1102
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            1094
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1086
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/f6t.c:[I
        //    27: aload_0        
        //    28: getfield        dev/nuker/pyro/f6w.0:Ldev/nuker/pyro/f0f;
        //    31: getstatic       dev/nuker/pyro/fc.0:I
        //    34: ifeq            42
        //    37: ldc             -377788826
        //    39: goto            44
        //    42: ldc             677302056
        //    44: ldc             -252338168
        //    46: ixor           
        //    47: lookupswitch {
        //          -659853536: 72
        //          428787310: 42
        //          default: 1067
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //    79: goto            83
        //    82: athrow         
        //    83: checkcast       Ldev/nuker/pyro/f6u;
        //    86: goto            90
        //    89: athrow         
        //    90: invokevirtual   dev/nuker/pyro/f6u.ordinal:()I
        //    93: goto            97
        //    96: athrow         
        //    97: iaload         
        //    98: lookupswitch {
        //                1: 124
        //                2: 471
        //          default: 855
        //        }
        //   124: getstatic       dev/nuker/pyro/fc.c:I
        //   127: ifge            135
        //   130: ldc             861431374
        //   132: goto            137
        //   135: ldc             -2121762816
        //   137: ldc             -1212784474
        //   139: ixor           
        //   140: lookupswitch {
        //          -2064775448: 1053
        //          998666528: 135
        //          default: 168
        //        }
        //   168: aload_1        
        //   169: getstatic       dev/nuker/pyro/fc.1:I
        //   172: ifeq            180
        //   175: ldc             589145089
        //   177: goto            182
        //   180: ldc             -755260424
        //   182: ldc             1192763912
        //   184: ixor           
        //   185: lookupswitch {
        //          -1780252176: 212
        //          1678083593: 180
        //          default: 1055
        //        }
        //   212: goto            216
        //   215: athrow         
        //   216: invokevirtual   dev/nuker/pyro/f3k.c:()Lnet/minecraft/util/EnumHand;
        //   219: goto            223
        //   222: athrow         
        //   223: getstatic       dev/nuker/pyro/fc.1:I
        //   226: ifeq            234
        //   229: ldc             1706269124
        //   231: goto            236
        //   234: ldc             1141025860
        //   236: ldc             1235861904
        //   238: ixor           
        //   239: lookupswitch {
        //          229338580: 264
        //          739924052: 234
        //          default: 1057
        //        }
        //   264: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //   267: if_acmpne       1044
        //   270: aload_0        
        //   271: getfield        dev/nuker/pyro/f6w.c:Lnet/minecraft/client/Minecraft;
        //   274: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   277: aload_1        
        //   278: getstatic       dev/nuker/pyro/fc.1:I
        //   281: ifeq            289
        //   284: ldc             732320538
        //   286: goto            291
        //   289: ldc             1436607882
        //   291: ldc             781748629
        //   293: ixor           
        //   294: lookupswitch {
        //          88005263: 289
        //          2067295263: 320
        //          default: 1069
        //        }
        //   320: goto            324
        //   323: athrow         
        //   324: invokevirtual   dev/nuker/pyro/f3k.c:()Lnet/minecraft/util/EnumHand;
        //   327: goto            331
        //   330: athrow         
        //   331: goto            335
        //   334: athrow         
        //   335: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184586_b:(Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
        //   338: goto            342
        //   341: athrow         
        //   342: goto            346
        //   345: athrow         
        //   346: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   349: goto            353
        //   352: athrow         
        //   353: getstatic       net/minecraft/init/Items.field_185158_cP:Lnet/minecraft/item/Item;
        //   356: getstatic       dev/nuker/pyro/fc.0:I
        //   359: ifeq            367
        //   362: ldc             -661666274
        //   364: goto            369
        //   367: ldc             -2103808114
        //   369: ldc             -375475641
        //   371: ixor           
        //   372: lookupswitch {
        //          823227481: 367
        //          1795481033: 400
        //          default: 1049
        //        }
        //   400: goto            404
        //   403: athrow         
        //   404: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   407: goto            411
        //   410: athrow         
        //   411: ifeq            1044
        //   414: getstatic       dev/nuker/pyro/fc.c:I
        //   417: ifge            425
        //   420: ldc             59708129
        //   422: goto            427
        //   425: ldc             2108952907
        //   427: ldc             -1654381235
        //   429: ixor           
        //   430: lookupswitch {
        //          -1628751956: 1071
        //          1626336012: 425
        //          default: 456
        //        }
        //   456: aload_1        
        //   457: goto            461
        //   460: athrow         
        //   461: invokevirtual   dev/nuker/pyro/f3k.c:()V
        //   464: goto            468
        //   467: athrow         
        //   468: goto            1044
        //   471: aload_1        
        //   472: goto            476
        //   475: athrow         
        //   476: invokevirtual   dev/nuker/pyro/f3k.c:()Lnet/minecraft/util/EnumHand;
        //   479: goto            483
        //   482: athrow         
        //   483: getstatic       dev/nuker/pyro/fc.0:I
        //   486: ifeq            494
        //   489: ldc             -160627582
        //   491: goto            496
        //   494: ldc             1310337267
        //   496: ldc             -1115681463
        //   498: ixor           
        //   499: lookupswitch {
        //          -208001606: 524
        //          1273825739: 494
        //          default: 1059
        //        }
        //   524: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //   527: if_acmpne       1044
        //   530: aload_0        
        //   531: getstatic       dev/nuker/pyro/fc.0:I
        //   534: ifeq            542
        //   537: ldc             -1775905193
        //   539: goto            544
        //   542: ldc             -73359837
        //   544: ldc             -613920842
        //   546: ixor           
        //   547: lookupswitch {
        //          550031765: 572
        //          1296931297: 542
        //          default: 1075
        //        }
        //   572: getfield        dev/nuker/pyro/f6w.c:Lnet/minecraft/client/Minecraft;
        //   575: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   578: getstatic       dev/nuker/pyro/fc.c:I
        //   581: ifge            589
        //   584: ldc             1175811246
        //   586: goto            591
        //   589: ldc             1212205773
        //   591: ldc             2022679198
        //   593: ixor           
        //   594: lookupswitch {
        //          818899027: 620
        //          1050334768: 589
        //          default: 1065
        //        }
        //   620: aload_1        
        //   621: getstatic       dev/nuker/pyro/fc.1:I
        //   624: ifeq            632
        //   627: ldc             -403877491
        //   629: goto            634
        //   632: ldc             645579563
        //   634: ldc             -231080154
        //   636: ixor           
        //   637: lookupswitch {
        //          313394584: 632
        //          366259883: 1073
        //          default: 664
        //        }
        //   664: goto            668
        //   667: athrow         
        //   668: invokevirtual   dev/nuker/pyro/f3k.c:()Lnet/minecraft/util/EnumHand;
        //   671: goto            675
        //   674: athrow         
        //   675: goto            679
        //   678: athrow         
        //   679: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184586_b:(Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
        //   682: goto            686
        //   685: athrow         
        //   686: goto            690
        //   689: athrow         
        //   690: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   693: goto            697
        //   696: athrow         
        //   697: getstatic       dev/nuker/pyro/fc.c:I
        //   700: ifge            708
        //   703: ldc             127612482
        //   705: goto            710
        //   708: ldc             413396032
        //   710: ldc             -1896505933
        //   712: ixor           
        //   713: lookupswitch {
        //          -2121508651: 708
        //          -1989235727: 1045
        //          default: 740
        //        }
        //   740: getstatic       net/minecraft/init/Items.field_185158_cP:Lnet/minecraft/item/Item;
        //   743: getstatic       dev/nuker/pyro/fc.1:I
        //   746: ifeq            754
        //   749: ldc             192989182
        //   751: goto            756
        //   754: ldc             1479226736
        //   756: ldc             153888538
        //   758: ixor           
        //   759: lookupswitch {
        //          44884196: 754
        //          1359417962: 784
        //          default: 1061
        //        }
        //   784: goto            788
        //   787: athrow         
        //   788: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   791: goto            795
        //   794: athrow         
        //   795: ifeq            1044
        //   798: getstatic       dev/nuker/pyro/fc.1:I
        //   801: ifeq            809
        //   804: ldc             1222696936
        //   806: goto            811
        //   809: ldc             -2104272371
        //   811: ldc             831185188
        //   813: ixor           
        //   814: lookupswitch {
        //          880657489: 809
        //          2037006028: 1063
        //          default: 840
        //        }
        //   840: aload_1        
        //   841: goto            845
        //   844: athrow         
        //   845: invokevirtual   dev/nuker/pyro/f3k.c:()V
        //   848: goto            852
        //   851: athrow         
        //   852: goto            1044
        //   855: aload_0        
        //   856: getstatic       dev/nuker/pyro/fc.0:I
        //   859: ifeq            867
        //   862: ldc             231846673
        //   864: goto            869
        //   867: ldc             1115992936
        //   869: ldc             1306003863
        //   871: ixor           
        //   872: lookupswitch {
        //          257735423: 900
        //          1074379398: 867
        //          default: 1047
        //        }
        //   900: getfield        dev/nuker/pyro/f6w.c:Lnet/minecraft/client/Minecraft;
        //   903: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   906: aload_1        
        //   907: goto            911
        //   910: athrow         
        //   911: invokevirtual   dev/nuker/pyro/f3k.c:()Lnet/minecraft/util/EnumHand;
        //   914: goto            918
        //   917: athrow         
        //   918: goto            922
        //   921: athrow         
        //   922: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_184586_b:(Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
        //   925: goto            929
        //   928: athrow         
        //   929: goto            933
        //   932: athrow         
        //   933: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   936: goto            940
        //   939: athrow         
        //   940: getstatic       net/minecraft/init/Items.field_185158_cP:Lnet/minecraft/item/Item;
        //   943: getstatic       dev/nuker/pyro/fc.c:I
        //   946: ifge            954
        //   949: ldc             -1503832510
        //   951: goto            956
        //   954: ldc             338266675
        //   956: ldc             -15392008
        //   958: ixor           
        //   959: lookupswitch {
        //          -1049725400: 954
        //          1497920698: 1051
        //          default: 984
        //        }
        //   984: goto            988
        //   987: athrow         
        //   988: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   991: goto            995
        //   994: athrow         
        //   995: ifeq            1003
        //   998: ldc             376598664
        //  1000: goto            1005
        //  1003: ldc             376598665
        //  1005: ldc             1642928860
        //  1007: ixor           
        //  1008: tableswitch {
        //          -281095000: 1032
        //          -281094999: 1044
        //          default: 998
        //        }
        //  1032: aload_1        
        //  1033: goto            1037
        //  1036: athrow         
        //  1037: invokevirtual   dev/nuker/pyro/f3k.c:()V
        //  1040: goto            1044
        //  1043: athrow         
        //  1044: return         
        //  1045: aconst_null    
        //  1046: athrow         
        //  1047: aconst_null    
        //  1048: athrow         
        //  1049: aconst_null    
        //  1050: athrow         
        //  1051: aconst_null    
        //  1052: athrow         
        //  1053: aconst_null    
        //  1054: athrow         
        //  1055: aconst_null    
        //  1056: athrow         
        //  1057: aconst_null    
        //  1058: athrow         
        //  1059: aconst_null    
        //  1060: athrow         
        //  1061: aconst_null    
        //  1062: athrow         
        //  1063: aconst_null    
        //  1064: athrow         
        //  1065: aconst_null    
        //  1066: athrow         
        //  1067: aconst_null    
        //  1068: athrow         
        //  1069: aconst_null    
        //  1070: athrow         
        //  1071: aconst_null    
        //  1072: athrow         
        //  1073: aconst_null    
        //  1074: athrow         
        //  1075: aconst_null    
        //  1076: athrow         
        //  1077: pop            
        //  1078: goto            24
        //  1081: pop            
        //  1082: aconst_null    
        //  1083: goto            1077
        //  1086: dup            
        //  1087: ifnull          1077
        //  1090: checkcast       Ljava/lang/Throwable;
        //  1093: athrow         
        //  1094: dup            
        //  1095: ifnull          1081
        //  1098: checkcast       Ljava/lang/Throwable;
        //  1101: athrow         
        //  1102: aconst_null    
        //  1103: athrow         
        //    StackMapTable: 00 9C 43 07 00 18 04 FF 00 0B 00 00 00 01 07 00 18 FD 00 03 07 00 03 07 00 A0 FF 00 11 00 02 07 00 03 07 00 A0 00 02 07 00 F8 07 00 41 FF 00 01 00 02 07 00 03 07 00 A0 00 03 07 00 F8 07 00 41 01 FF 00 1B 00 02 07 00 03 07 00 A0 00 02 07 00 F8 07 00 41 42 07 00 18 FF 00 00 00 02 07 00 03 07 00 A0 00 02 07 00 F8 07 00 41 45 07 00 18 FF 00 00 00 02 07 00 03 07 00 A0 00 02 07 00 F8 07 00 CD 45 07 00 76 FF 00 00 00 02 07 00 03 07 00 A0 00 02 07 00 F8 07 00 5B 45 07 00 18 FF 00 00 00 02 07 00 03 07 00 A0 00 02 07 00 F8 01 1A 0A 41 01 1E 4B 07 00 A0 FF 00 01 00 02 07 00 03 07 00 A0 00 02 07 00 A0 01 5D 07 00 A0 FF 00 02 00 00 00 01 07 00 18 FF 00 00 00 02 07 00 03 07 00 A0 00 01 07 00 A0 45 07 00 18 40 07 00 A8 4A 07 00 A8 FF 00 01 00 02 07 00 03 07 00 A0 00 02 07 00 A8 01 5B 07 00 A8 FF 00 18 00 02 07 00 03 07 00 A0 00 02 07 00 27 07 00 A0 FF 00 01 00 02 07 00 03 07 00 A0 00 03 07 00 27 07 00 A0 01 FF 00 1C 00 02 07 00 03 07 00 A0 00 02 07 00 27 07 00 A0 42 07 00 18 FF 00 00 00 02 07 00 03 07 00 A0 00 02 07 00 27 07 00 A0 45 07 00 18 FF 00 00 00 02 07 00 03 07 00 A0 00 02 07 00 27 07 00 A8 42 07 00 18 FF 00 00 00 02 07 00 03 07 00 A0 00 02 07 00 27 07 00 A8 45 07 00 18 40 07 00 BE 42 07 00 18 40 07 00 BE 45 07 00 18 40 07 00 FA FF 00 0D 00 02 07 00 03 07 00 A0 00 02 07 00 FA 07 00 FA FF 00 01 00 02 07 00 03 07 00 A0 00 03 07 00 FA 07 00 FA 01 FF 00 1E 00 02 07 00 03 07 00 A0 00 02 07 00 FA 07 00 FA FF 00 02 00 00 00 01 07 00 18 FF 00 00 00 02 07 00 03 07 00 A0 00 02 07 00 FA 07 00 FA 45 07 00 18 40 01 0D 41 01 1C 43 07 00 76 40 07 00 A0 45 07 00 18 00 02 43 07 00 7E 40 07 00 A0 45 07 00 18 40 07 00 A8 4A 07 00 A8 FF 00 01 00 02 07 00 03 07 00 A0 00 02 07 00 A8 01 5B 07 00 A8 51 07 00 03 FF 00 01 00 02 07 00 03 07 00 A0 00 02 07 00 03 01 5B 07 00 03 50 07 00 27 FF 00 01 00 02 07 00 03 07 00 A0 00 02 07 00 27 01 5C 07 00 27 FF 00 0B 00 02 07 00 03 07 00 A0 00 02 07 00 27 07 00 A0 FF 00 01 00 02 07 00 03 07 00 A0 00 03 07 00 27 07 00 A0 01 FF 00 1D 00 02 07 00 03 07 00 A0 00 02 07 00 27 07 00 A0 42 07 00 18 FF 00 00 00 02 07 00 03 07 00 A0 00 02 07 00 27 07 00 A0 45 07 00 18 FF 00 00 00 02 07 00 03 07 00 A0 00 02 07 00 27 07 00 A8 42 07 00 82 FF 00 00 00 02 07 00 03 07 00 A0 00 02 07 00 27 07 00 A8 45 07 00 18 40 07 00 BE 42 07 00 18 40 07 00 BE 45 07 00 18 40 07 00 FA 4A 07 00 FA FF 00 01 00 02 07 00 03 07 00 A0 00 02 07 00 FA 01 5D 07 00 FA FF 00 0D 00 02 07 00 03 07 00 A0 00 02 07 00 FA 07 00 FA FF 00 01 00 02 07 00 03 07 00 A0 00 03 07 00 FA 07 00 FA 01 FF 00 1B 00 02 07 00 03 07 00 A0 00 02 07 00 FA 07 00 FA 42 07 00 76 FF 00 00 00 02 07 00 03 07 00 A0 00 02 07 00 FA 07 00 FA 45 07 00 18 40 01 0D 41 01 1C 43 07 00 76 40 07 00 A0 45 07 00 18 00 02 4B 07 00 03 FF 00 01 00 02 07 00 03 07 00 A0 00 02 07 00 03 01 5E 07 00 03 49 07 00 18 FF 00 00 00 02 07 00 03 07 00 A0 00 02 07 00 27 07 00 A0 45 07 00 18 FF 00 00 00 02 07 00 03 07 00 A0 00 02 07 00 27 07 00 A8 42 07 00 18 FF 00 00 00 02 07 00 03 07 00 A0 00 02 07 00 27 07 00 A8 45 07 00 18 40 07 00 BE 42 07 00 18 40 07 00 BE 45 07 00 18 40 07 00 FA FF 00 0D 00 02 07 00 03 07 00 A0 00 02 07 00 FA 07 00 FA FF 00 01 00 02 07 00 03 07 00 A0 00 03 07 00 FA 07 00 FA 01 FF 00 1B 00 02 07 00 03 07 00 A0 00 02 07 00 FA 07 00 FA 42 07 00 76 FF 00 00 00 02 07 00 03 07 00 A0 00 02 07 00 FA 07 00 FA 45 07 00 18 40 01 02 04 41 01 1A 43 07 00 18 40 07 00 A0 45 07 00 18 00 40 07 00 FA 41 07 00 03 FF 00 01 00 02 07 00 03 07 00 A0 00 02 07 00 FA 07 00 FA FF 00 01 00 02 07 00 03 07 00 A0 00 02 07 00 FA 07 00 FA 01 41 07 00 A0 41 07 00 A8 41 07 00 A8 FF 00 01 00 02 07 00 03 07 00 A0 00 02 07 00 FA 07 00 FA 01 41 07 00 27 FF 00 01 00 02 07 00 03 07 00 A0 00 02 07 00 F8 07 00 41 FF 00 01 00 02 07 00 03 07 00 A0 00 02 07 00 27 07 00 A0 01 FF 00 01 00 02 07 00 03 07 00 A0 00 02 07 00 27 07 00 A0 41 07 00 03 41 07 00 18 43 05 44 07 00 18 47 05 47 07 00 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1086   1094   Any
        //  1086   1094   1086   1094   Any
        //  1102   1104   3      8      Ljava/lang/IndexOutOfBoundsException;
        //  75     82     82     83     Any
        //  76     82     75     76     Any
        //  75     82     82     83     Any
        //  75     82     82     83     Any
        //  76     82     75     76     Any
        //  89     96     96     97     Any
        //  90     96     96     97     Any
        //  89     96     89     90     Ljava/lang/NegativeArraySizeException;
        //  90     96     89     90     Ljava/lang/RuntimeException;
        //  89     96     96     97     Ljava/lang/NullPointerException;
        //  216    222    222    223    Any
        //  216    222    3      8      Any
        //  216    222    3      8      Any
        //  216    222    222    223    Ljava/lang/UnsupportedOperationException;
        //  216    222    222    223    Any
        //  323    330    330    331    Any
        //  323    330    330    331    Ljava/lang/RuntimeException;
        //  324    330    323    324    Ljava/util/ConcurrentModificationException;
        //  323    330    3      8      Any
        //  323    330    323    324    Any
        //  334    341    341    342    Any
        //  334    341    3      8      Ljava/lang/ArithmeticException;
        //  335    341    334    335    Any
        //  334    341    341    342    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  334    341    3      8      Ljava/lang/IllegalArgumentException;
        //  345    352    352    353    Any
        //  345    352    345    346    Any
        //  346    352    352    353    Ljava/lang/StringIndexOutOfBoundsException;
        //  346    352    345    346    Ljava/lang/RuntimeException;
        //  345    352    345    346    Ljava/lang/NullPointerException;
        //  404    410    410    411    Any
        //  404    410    410    411    Any
        //  404    410    3      8      Any
        //  404    410    410    411    Ljava/lang/IndexOutOfBoundsException;
        //  404    410    3      8      Any
        //  460    467    467    468    Any
        //  461    467    3      8      Any
        //  460    467    460    461    Ljava/lang/UnsupportedOperationException;
        //  460    467    460    461    Ljava/lang/IndexOutOfBoundsException;
        //  460    467    467    468    Any
        //  475    482    482    483    Any
        //  475    482    482    483    Ljava/lang/IllegalStateException;
        //  476    482    475    476    Ljava/lang/ArithmeticException;
        //  475    482    3      8      Any
        //  475    482    3      8      Ljava/lang/AssertionError;
        //  667    674    674    675    Any
        //  667    674    3      8      Any
        //  668    674    674    675    Ljava/lang/UnsupportedOperationException;
        //  668    674    667    668    Any
        //  667    674    3      8      Any
        //  678    685    685    686    Any
        //  679    685    685    686    Any
        //  678    685    685    686    Any
        //  678    685    678    679    Ljava/lang/IllegalArgumentException;
        //  679    685    3      8      Any
        //  689    696    696    697    Any
        //  690    696    3      8      Any
        //  690    696    689    690    Any
        //  690    696    689    690    Ljava/lang/IllegalStateException;
        //  690    696    696    697    Ljava/lang/NumberFormatException;
        //  787    794    794    795    Any
        //  788    794    794    795    Any
        //  787    794    787    788    Ljava/lang/ClassCastException;
        //  788    794    787    788    Ljava/lang/StringIndexOutOfBoundsException;
        //  787    794    3      8      Any
        //  844    851    851    852    Any
        //  844    851    844    845    Ljava/lang/NullPointerException;
        //  844    851    844    845    Ljava/lang/StringIndexOutOfBoundsException;
        //  844    851    851    852    Any
        //  845    851    844    845    Ljava/lang/IllegalArgumentException;
        //  910    917    917    918    Any
        //  910    917    3      8      Ljava/lang/IllegalArgumentException;
        //  911    917    3      8      Ljava/lang/NullPointerException;
        //  910    917    3      8      Any
        //  911    917    910    911    Any
        //  921    928    928    929    Any
        //  921    928    928    929    Ljava/lang/ArithmeticException;
        //  922    928    921    922    Any
        //  922    928    921    922    Ljava/lang/IndexOutOfBoundsException;
        //  921    928    3      8      Any
        //  932    939    939    940    Any
        //  932    939    932    933    Any
        //  932    939    939    940    Any
        //  933    939    939    940    Any
        //  933    939    932    933    Ljava/lang/ClassCastException;
        //  987    994    994    995    Any
        //  987    994    994    995    Any
        //  987    994    987    988    Ljava/lang/ArithmeticException;
        //  987    994    3      8      Any
        //  987    994    987    988    Ljava/lang/ClassCastException;
        //  1036   1043   1043   1044   Any
        //  1037   1043   1043   1044   Any
        //  1037   1043   1043   1044   Ljava/lang/IllegalStateException;
        //  1037   1043   1036   1037   Any
        //  1036   1043   1043   1044   Any
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
    
    @f06
    @LauncherEventHide
    public void c(final f30 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1633
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1625
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1617
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: goto            29
        //    28: athrow         
        //    29: invokevirtual   dev/nuker/pyro/f30.c:()Lnet/minecraft/network/Packet;
        //    32: goto            36
        //    35: athrow         
        //    36: instanceof      Lnet/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock;
        //    39: ifeq            1236
        //    42: aload_1        
        //    43: goto            47
        //    46: athrow         
        //    47: invokevirtual   dev/nuker/pyro/f30.c:()Lnet/minecraft/network/Packet;
        //    50: goto            54
        //    53: athrow         
        //    54: checkcast       Lnet/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock;
        //    57: astore_2       
        //    58: getstatic       dev/nuker/pyro/f6t.c:[I
        //    61: aload_0        
        //    62: getfield        dev/nuker/pyro/f6w.0:Ldev/nuker/pyro/f0f;
        //    65: getstatic       dev/nuker/pyro/fc.0:I
        //    68: ifeq            77
        //    71: ldc_w           1265044011
        //    74: goto            80
        //    77: ldc_w           796562719
        //    80: ldc_w           -453279219
        //    83: ixor           
        //    84: lookupswitch {
        //          -1348696026: 1580
        //          300438465: 77
        //          default: 112
        //        }
        //   112: goto            116
        //   115: athrow         
        //   116: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //   119: goto            123
        //   122: athrow         
        //   123: checkcast       Ldev/nuker/pyro/f6u;
        //   126: goto            130
        //   129: athrow         
        //   130: invokevirtual   dev/nuker/pyro/f6u.ordinal:()I
        //   133: goto            137
        //   136: athrow         
        //   137: iaload         
        //   138: lookupswitch {
        //                1: 164
        //                2: 230
        //          default: 285
        //        }
        //   164: aload_2        
        //   165: getstatic       dev/nuker/pyro/fc.c:I
        //   168: ifge            177
        //   171: ldc_w           -1917063906
        //   174: goto            180
        //   177: ldc_w           -2093105713
        //   180: ldc_w           -21757590
        //   183: ixor           
        //   184: lookupswitch {
        //          1930423412: 177
        //          2106178725: 212
        //          default: 1592
        //        }
        //   212: goto            216
        //   215: athrow         
        //   216: invokevirtual   net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock.func_187022_c:()Lnet/minecraft/util/EnumHand;
        //   219: goto            223
        //   222: athrow         
        //   223: getstatic       net/minecraft/util/EnumHand.MAIN_HAND:Lnet/minecraft/util/EnumHand;
        //   226: if_acmpeq       285
        //   229: return         
        //   230: aload_2        
        //   231: goto            235
        //   234: athrow         
        //   235: invokevirtual   net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock.func_187022_c:()Lnet/minecraft/util/EnumHand;
        //   238: goto            242
        //   241: athrow         
        //   242: getstatic       net/minecraft/util/EnumHand.OFF_HAND:Lnet/minecraft/util/EnumHand;
        //   245: if_acmpeq       254
        //   248: ldc_w           -1947297905
        //   251: goto            257
        //   254: ldc_w           -1947297908
        //   257: ldc_w           1093049106
        //   260: ixor           
        //   261: tableswitch {
        //          -1785718470: 284
        //          -1785718469: 285
        //          default: 248
        //        }
        //   284: return         
        //   285: aload_2        
        //   286: getstatic       dev/nuker/pyro/fc.c:I
        //   289: ifge            298
        //   292: ldc_w           -252815341
        //   295: goto            301
        //   298: ldc_w           -1751753258
        //   301: ldc_w           1450389504
        //   304: ixor           
        //   305: lookupswitch {
        //          -1499633645: 1578
        //          363981548: 298
        //          default: 332
        //        }
        //   332: goto            336
        //   335: athrow         
        //   336: invokevirtual   net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock.func_187023_a:()Lnet/minecraft/util/math/BlockPos;
        //   339: goto            343
        //   342: athrow         
        //   343: goto            347
        //   346: athrow         
        //   347: invokestatic    dev/nuker/pyro/fbA.0:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/Block;
        //   350: goto            354
        //   353: athrow         
        //   354: astore_3       
        //   355: aload_3        
        //   356: getstatic       dev/nuker/pyro/fc.0:I
        //   359: ifeq            368
        //   362: ldc_w           932763126
        //   365: goto            371
        //   368: ldc_w           -2005716846
        //   371: ldc_w           617505010
        //   374: ixor           
        //   375: lookupswitch {
        //          -1396879264: 400
        //          324449540: 368
        //          default: 1584
        //        }
        //   400: aload_0        
        //   401: getstatic       dev/nuker/pyro/fc.0:I
        //   404: ifeq            413
        //   407: ldc_w           -301712997
        //   410: goto            416
        //   413: ldc_w           1402544635
        //   416: ldc_w           817108605
        //   419: ixor           
        //   420: lookupswitch {
        //          -558878746: 413
        //          1663907718: 448
        //          default: 1594
        //        }
        //   448: getfield        dev/nuker/pyro/f6w.c:Lnet/minecraft/client/Minecraft;
        //   451: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   454: aload_2        
        //   455: goto            459
        //   458: athrow         
        //   459: invokevirtual   net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock.func_187023_a:()Lnet/minecraft/util/math/BlockPos;
        //   462: goto            466
        //   465: athrow         
        //   466: aload_2        
        //   467: goto            471
        //   470: athrow         
        //   471: invokevirtual   net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock.func_187023_a:()Lnet/minecraft/util/math/BlockPos;
        //   474: goto            478
        //   477: athrow         
        //   478: goto            482
        //   481: athrow         
        //   482: invokestatic    dev/nuker/pyro/fbA.1:(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   485: goto            489
        //   488: athrow         
        //   489: getstatic       dev/nuker/pyro/fc.0:I
        //   492: ifeq            501
        //   495: ldc_w           -1426960561
        //   498: goto            504
        //   501: ldc_w           -173840924
        //   504: ldc_w           -1498741047
        //   507: ixor           
        //   508: lookupswitch {
        //          207178118: 1596
        //          1441182383: 501
        //          default: 536
        //        }
        //   536: aload_0        
        //   537: getfield        dev/nuker/pyro/f6w.c:Lnet/minecraft/client/Minecraft;
        //   540: getstatic       dev/nuker/pyro/fc.1:I
        //   543: ifeq            552
        //   546: ldc_w           -1104205002
        //   549: goto            555
        //   552: ldc_w           -1255732272
        //   555: ldc_w           -747429152
        //   558: ixor           
        //   559: lookupswitch {
        //          1410334278: 552
        //          1834748374: 1598
        //          default: 584
        //        }
        //   584: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   587: aload_2        
        //   588: goto            592
        //   591: athrow         
        //   592: invokevirtual   net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock.func_187022_c:()Lnet/minecraft/util/EnumHand;
        //   595: goto            599
        //   598: athrow         
        //   599: getstatic       dev/nuker/pyro/fc.1:I
        //   602: ifeq            611
        //   605: ldc_w           -1618694702
        //   608: goto            614
        //   611: ldc_w           1763348333
        //   614: ldc_w           -789310579
        //   617: ixor           
        //   618: lookupswitch {
        //          -1175544608: 644
        //          1332788831: 611
        //          default: 1602
        //        }
        //   644: aload_2        
        //   645: getstatic       dev/nuker/pyro/fc.0:I
        //   648: ifeq            657
        //   651: ldc_w           442397077
        //   654: goto            660
        //   657: ldc_w           -1445295321
        //   660: ldc_w           483096245
        //   663: ixor           
        //   664: lookupswitch {
        //          -1257112174: 692
        //          110429984: 657
        //          default: 1600
        //        }
        //   692: goto            696
        //   695: athrow         
        //   696: invokevirtual   net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock.func_187024_b:()Lnet/minecraft/util/EnumFacing;
        //   699: goto            703
        //   702: athrow         
        //   703: fconst_0       
        //   704: fconst_0       
        //   705: fconst_0       
        //   706: goto            710
        //   709: athrow         
        //   710: invokevirtual   net/minecraft/block/Block.func_180639_a:(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Z
        //   713: goto            717
        //   716: athrow         
        //   717: istore          4
        //   719: aload_1        
        //   720: goto            724
        //   723: athrow         
        //   724: invokevirtual   dev/nuker/pyro/f30.c:()Ldev/nuker/pyro/f2T;
        //   727: goto            731
        //   730: athrow         
        //   731: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //   734: if_acmpne       963
        //   737: aload_0        
        //   738: getfield        dev/nuker/pyro/f6w.c:Z
        //   741: ifne            1233
        //   744: getstatic       dev/nuker/pyro/fc.0:I
        //   747: ifeq            756
        //   750: ldc_w           -1662543869
        //   753: goto            759
        //   756: ldc_w           -208777209
        //   759: ldc_w           -22888456
        //   762: ixor           
        //   763: lookupswitch {
        //          -733968818: 756
        //          1648699387: 1576
        //          default: 788
        //        }
        //   788: getstatic       dev/nuker/pyro/fby.c:Ljava/util/List;
        //   791: aload_3        
        //   792: goto            796
        //   795: athrow         
        //   796: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   801: goto            805
        //   804: athrow         
        //   805: ifne            869
        //   808: getstatic       dev/nuker/pyro/fby.0:Ljava/util/List;
        //   811: aload_3        
        //   812: goto            816
        //   815: athrow         
        //   816: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   821: goto            825
        //   824: athrow         
        //   825: ifne            834
        //   828: ldc_w           -751795516
        //   831: goto            837
        //   834: ldc_w           -751795515
        //   837: ldc_w           1993368416
        //   840: ixor           
        //   841: tableswitch {
        //          1270989640: 864
        //          1270989641: 869
        //          default: 828
        //        }
        //   864: iload           4
        //   866: ifeq            1233
        //   869: aload_0        
        //   870: getfield        dev/nuker/pyro/f6w.c:Lnet/minecraft/client/Minecraft;
        //   873: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   876: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   879: new             Lnet/minecraft/network/play/client/CPacketEntityAction;
        //   882: dup            
        //   883: aload_0        
        //   884: getfield        dev/nuker/pyro/f6w.c:Lnet/minecraft/client/Minecraft;
        //   887: getstatic       dev/nuker/pyro/fc.1:I
        //   890: ifeq            899
        //   893: ldc_w           -1373326638
        //   896: goto            902
        //   899: ldc_w           -1958717196
        //   902: ldc_w           -37160893
        //   905: ixor           
        //   906: lookupswitch {
        //          1222324921: 899
        //          1407994513: 1572
        //          default: 932
        //        }
        //   932: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   935: getstatic       net/minecraft/network/play/client/CPacketEntityAction$Action.START_SNEAKING:Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //   938: goto            942
        //   941: athrow         
        //   942: invokespecial   net/minecraft/network/play/client/CPacketEntityAction.<init>:(Lnet/minecraft/entity/Entity;Lnet/minecraft/network/play/client/CPacketEntityAction$Action;)V
        //   945: goto            949
        //   948: athrow         
        //   949: goto            953
        //   952: athrow         
        //   953: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //   956: goto            960
        //   959: athrow         
        //   960: goto            1233
        //   963: aload_0        
        //   964: getfield        dev/nuker/pyro/f6w.c:Z
        //   967: ifeq            1233
        //   970: getstatic       dev/nuker/pyro/fby.c:Ljava/util/List;
        //   973: aload_3        
        //   974: goto            978
        //   977: athrow         
        //   978: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   983: goto            987
        //   986: athrow         
        //   987: ifne            1049
        //   990: getstatic       dev/nuker/pyro/fby.0:Ljava/util/List;
        //   993: aload_3        
        //   994: goto            998
        //   997: athrow         
        //   998: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //  1003: goto            1007
        //  1006: athrow         
        //  1007: ifne            1016
        //  1010: ldc_w           850000412
        //  1013: goto            1019
        //  1016: ldc_w           850000411
        //  1019: ldc_w           1700538215
        //  1022: ixor           
        //  1023: tableswitch {
        //          -1343505674: 1044
        //          -1343505673: 1049
        //          default: 1010
        //        }
        //  1044: iload           4
        //  1046: ifeq            1233
        //  1049: getstatic       dev/nuker/pyro/fc.c:I
        //  1052: ifge            1061
        //  1055: ldc_w           1186581679
        //  1058: goto            1064
        //  1061: ldc_w           -1115461946
        //  1064: ldc_w           -1365267500
        //  1067: ixor           
        //  1068: lookupswitch {
        //          -400136325: 1604
        //          1589777237: 1061
        //          default: 1096
        //        }
        //  1096: aload_0        
        //  1097: getstatic       dev/nuker/pyro/fc.1:I
        //  1100: ifeq            1109
        //  1103: ldc_w           -1853497492
        //  1106: goto            1112
        //  1109: ldc_w           1976451733
        //  1112: ldc_w           1900301852
        //  1115: ixor           
        //  1116: lookupswitch {
        //          -524185232: 1586
        //          252652133: 1109
        //          default: 1144
        //        }
        //  1144: getfield        dev/nuker/pyro/f6w.c:Lnet/minecraft/client/Minecraft;
        //  1147: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1150: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71174_a:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //  1153: new             Lnet/minecraft/network/play/client/CPacketEntityAction;
        //  1156: dup            
        //  1157: aload_0        
        //  1158: getfield        dev/nuker/pyro/f6w.c:Lnet/minecraft/client/Minecraft;
        //  1161: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //  1164: getstatic       dev/nuker/pyro/fc.0:I
        //  1167: ifeq            1176
        //  1170: ldc_w           1249464073
        //  1173: goto            1179
        //  1176: ldc_w           884829457
        //  1179: ldc_w           -1762378037
        //  1182: ixor           
        //  1183: lookupswitch {
        //          -594710078: 1588
        //          812173959: 1176
        //          default: 1208
        //        }
        //  1208: getstatic       net/minecraft/network/play/client/CPacketEntityAction$Action.STOP_SNEAKING:Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //  1211: goto            1215
        //  1214: athrow         
        //  1215: invokespecial   net/minecraft/network/play/client/CPacketEntityAction.<init>:(Lnet/minecraft/entity/Entity;Lnet/minecraft/network/play/client/CPacketEntityAction$Action;)V
        //  1218: goto            1222
        //  1221: athrow         
        //  1222: goto            1226
        //  1225: athrow         
        //  1226: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.func_147297_a:(Lnet/minecraft/network/Packet;)V
        //  1229: goto            1233
        //  1232: athrow         
        //  1233: goto            1569
        //  1236: aload_1        
        //  1237: getstatic       dev/nuker/pyro/fc.c:I
        //  1240: ifge            1249
        //  1243: ldc_w           -1478763444
        //  1246: goto            1252
        //  1249: ldc_w           -630571881
        //  1252: ldc_w           -1998062865
        //  1255: ixor           
        //  1256: lookupswitch {
        //          792471203: 1249
        //          1385023096: 1284
        //          default: 1570
        //        }
        //  1284: goto            1288
        //  1287: athrow         
        //  1288: invokevirtual   dev/nuker/pyro/f30.c:()Ldev/nuker/pyro/f2T;
        //  1291: goto            1295
        //  1294: athrow         
        //  1295: getstatic       dev/nuker/pyro/f2T.c:Ldev/nuker/pyro/f2T;
        //  1298: if_acmpne       1569
        //  1301: getstatic       dev/nuker/pyro/fc.1:I
        //  1304: ifeq            1313
        //  1307: ldc_w           929136252
        //  1310: goto            1316
        //  1313: ldc_w           -1281108165
        //  1316: ldc_w           -2055492589
        //  1319: ixor           
        //  1320: lookupswitch {
        //          -1306865041: 1313
        //          920156968: 1348
        //          default: 1590
        //        }
        //  1348: aload_1        
        //  1349: goto            1353
        //  1352: athrow         
        //  1353: invokevirtual   dev/nuker/pyro/f30.c:()Lnet/minecraft/network/Packet;
        //  1356: goto            1360
        //  1359: athrow         
        //  1360: instanceof      Lnet/minecraft/network/play/client/CPacketEntityAction;
        //  1363: ifeq            1569
        //  1366: aload_1        
        //  1367: goto            1371
        //  1370: athrow         
        //  1371: invokevirtual   dev/nuker/pyro/f30.c:()Lnet/minecraft/network/Packet;
        //  1374: goto            1378
        //  1377: athrow         
        //  1378: checkcast       Lnet/minecraft/network/play/client/CPacketEntityAction;
        //  1381: astore_2       
        //  1382: aload_2        
        //  1383: goto            1387
        //  1386: athrow         
        //  1387: invokevirtual   net/minecraft/network/play/client/CPacketEntityAction.func_180764_b:()Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //  1390: goto            1394
        //  1393: athrow         
        //  1394: getstatic       net/minecraft/network/play/client/CPacketEntityAction$Action.START_SNEAKING:Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //  1397: if_acmpne       1408
        //  1400: aload_0        
        //  1401: iconst_1       
        //  1402: putfield        dev/nuker/pyro/f6w.c:Z
        //  1405: goto            1569
        //  1408: getstatic       dev/nuker/pyro/fc.0:I
        //  1411: ifeq            1420
        //  1414: ldc_w           -615375808
        //  1417: goto            1423
        //  1420: ldc_w           2091251440
        //  1423: ldc_w           -221667712
        //  1426: ixor           
        //  1427: lookupswitch {
        //          -1905498000: 1452
        //          698057408: 1420
        //          default: 1582
        //        }
        //  1452: aload_2        
        //  1453: getstatic       dev/nuker/pyro/fc.1:I
        //  1456: ifeq            1465
        //  1459: ldc_w           -719068286
        //  1462: goto            1468
        //  1465: ldc_w           -1341881502
        //  1468: ldc_w           1576301084
        //  1471: ixor           
        //  1472: lookupswitch {
        //          -1999138402: 1465
        //          -302976642: 1500
        //          default: 1574
        //        }
        //  1500: goto            1504
        //  1503: athrow         
        //  1504: invokevirtual   net/minecraft/network/play/client/CPacketEntityAction.func_180764_b:()Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //  1507: goto            1511
        //  1510: athrow         
        //  1511: getstatic       net/minecraft/network/play/client/CPacketEntityAction$Action.STOP_SNEAKING:Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
        //  1514: if_acmpne       1569
        //  1517: getstatic       dev/nuker/pyro/fc.c:I
        //  1520: ifge            1529
        //  1523: ldc_w           1207897339
        //  1526: goto            1532
        //  1529: ldc_w           -877326430
        //  1532: ldc_w           831773488
        //  1535: ixor           
        //  1536: lookupswitch {
        //          -98118510: 1564
        //          1986844619: 1529
        //          default: 1606
        //        }
        //  1564: aload_0        
        //  1565: iconst_0       
        //  1566: putfield        dev/nuker/pyro/f6w.c:Z
        //  1569: return         
        //  1570: aconst_null    
        //  1571: athrow         
        //  1572: aconst_null    
        //  1573: athrow         
        //  1574: aconst_null    
        //  1575: athrow         
        //  1576: aconst_null    
        //  1577: athrow         
        //  1578: aconst_null    
        //  1579: athrow         
        //  1580: aconst_null    
        //  1581: athrow         
        //  1582: aconst_null    
        //  1583: athrow         
        //  1584: aconst_null    
        //  1585: athrow         
        //  1586: aconst_null    
        //  1587: athrow         
        //  1588: aconst_null    
        //  1589: athrow         
        //  1590: aconst_null    
        //  1591: athrow         
        //  1592: aconst_null    
        //  1593: athrow         
        //  1594: aconst_null    
        //  1595: athrow         
        //  1596: aconst_null    
        //  1597: athrow         
        //  1598: aconst_null    
        //  1599: athrow         
        //  1600: aconst_null    
        //  1601: athrow         
        //  1602: aconst_null    
        //  1603: athrow         
        //  1604: aconst_null    
        //  1605: athrow         
        //  1606: aconst_null    
        //  1607: athrow         
        //  1608: pop            
        //  1609: goto            24
        //  1612: pop            
        //  1613: aconst_null    
        //  1614: goto            1608
        //  1617: dup            
        //  1618: ifnull          1608
        //  1621: checkcast       Ljava/lang/Throwable;
        //  1624: athrow         
        //  1625: dup            
        //  1626: ifnull          1612
        //  1629: checkcast       Ljava/lang/Throwable;
        //  1632: athrow         
        //  1633: aconst_null    
        //  1634: athrow         
        //    StackMapTable: 00 DA 43 07 00 18 04 FF 00 0B 00 00 00 01 07 00 18 FD 00 03 07 00 03 07 01 01 43 07 00 18 40 07 01 01 45 07 00 18 40 07 01 97 49 07 00 18 40 07 01 01 45 07 00 18 40 07 01 97 FF 00 16 00 03 07 00 03 07 01 01 07 01 06 00 02 07 00 F8 07 00 41 FF 00 02 00 03 07 00 03 07 01 01 07 01 06 00 03 07 00 F8 07 00 41 01 FF 00 1F 00 03 07 00 03 07 01 01 07 01 06 00 02 07 00 F8 07 00 41 FF 00 02 00 00 00 01 07 00 18 FF 00 00 00 03 07 00 03 07 01 01 07 01 06 00 02 07 00 F8 07 00 41 45 07 00 18 FF 00 00 00 03 07 00 03 07 01 01 07 01 06 00 02 07 00 F8 07 00 CD FF 00 05 00 00 00 01 07 00 18 FF 00 00 00 03 07 00 03 07 01 01 07 01 06 00 02 07 00 F8 07 00 5B 45 07 00 18 FF 00 00 00 03 07 00 03 07 01 01 07 01 06 00 02 07 00 F8 01 1A 4C 07 01 06 FF 00 02 00 03 07 00 03 07 01 01 07 01 06 00 02 07 01 06 01 5F 07 01 06 42 07 00 18 40 07 01 06 45 07 00 18 40 07 00 A8 06 43 07 00 18 40 07 01 06 45 07 00 18 40 07 00 A8 05 05 42 01 1A 00 4C 07 01 06 FF 00 02 00 03 07 00 03 07 01 01 07 01 06 00 02 07 01 06 01 5E 07 01 06 FF 00 02 00 00 00 01 07 00 18 FF 00 00 00 03 07 00 03 07 01 01 07 01 06 00 01 07 01 06 45 07 00 18 40 07 01 99 42 07 00 18 40 07 01 99 45 07 00 18 40 07 01 3D FF 00 0D 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 01 07 01 3D FF 00 02 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 02 07 01 3D 01 5C 07 01 3D FF 00 0C 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 02 07 01 3D 07 00 03 FF 00 02 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 03 07 01 3D 07 00 03 01 FF 00 1F 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 02 07 01 3D 07 00 03 FF 00 09 00 00 00 01 07 00 18 FF 00 00 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 03 07 01 3D 07 01 9B 07 01 06 45 07 00 18 FF 00 00 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 03 07 01 3D 07 01 9B 07 01 99 43 07 00 18 FF 00 00 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 04 07 01 3D 07 01 9B 07 01 99 07 01 06 45 07 00 18 FF 00 00 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 04 07 01 3D 07 01 9B 07 01 99 07 01 99 42 07 00 18 FF 00 00 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 04 07 01 3D 07 01 9B 07 01 99 07 01 99 45 07 00 18 FF 00 00 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 04 07 01 3D 07 01 9B 07 01 99 07 01 9D FF 00 0B 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 04 07 01 3D 07 01 9B 07 01 99 07 01 9D FF 00 02 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 05 07 01 3D 07 01 9B 07 01 99 07 01 9D 01 FF 00 1F 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 04 07 01 3D 07 01 9B 07 01 99 07 01 9D FF 00 0F 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 05 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 B1 FF 00 02 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 06 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 B1 01 FF 00 1C 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 05 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 B1 46 07 00 18 FF 00 00 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 06 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 27 07 01 06 45 07 00 18 FF 00 00 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 06 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 27 07 00 A8 FF 00 0B 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 06 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 27 07 00 A8 FF 00 02 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 07 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 27 07 00 A8 01 FF 00 1D 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 06 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 27 07 00 A8 FF 00 0C 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 07 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 27 07 00 A8 07 01 06 FF 00 02 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 08 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 27 07 00 A8 07 01 06 01 FF 00 1F 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 07 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 27 07 00 A8 07 01 06 42 07 00 18 FF 00 00 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 07 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 27 07 00 A8 07 01 06 45 07 00 18 FF 00 00 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 07 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 27 07 00 A8 07 01 9F 45 07 00 18 FF 00 00 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 0A 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 27 07 00 A8 07 01 9F 02 02 02 45 07 00 18 40 01 FF 00 05 00 00 00 01 07 00 18 FF 00 00 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 01 07 01 01 45 07 00 18 40 07 01 46 18 42 01 1C 46 07 00 18 FF 00 00 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 02 07 01 53 07 01 3D 47 07 00 18 40 01 49 07 00 76 FF 00 00 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 02 07 01 53 07 01 3D 47 07 00 18 40 01 02 05 42 01 1A 04 FF 00 1D 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 04 07 01 6F 08 03 6F 08 03 6F 07 00 B1 FF 00 02 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 05 07 01 6F 08 03 6F 08 03 6F 07 00 B1 01 FF 00 1D 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 04 07 01 6F 08 03 6F 08 03 6F 07 00 B1 48 07 00 FF FF 00 00 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 05 07 01 6F 08 03 6F 08 03 6F 07 00 27 07 01 66 45 07 00 18 FF 00 00 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 02 07 01 6F 07 01 61 42 07 00 18 FF 00 00 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 02 07 01 6F 07 01 61 45 07 00 18 00 02 4D 07 00 18 FF 00 00 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 02 07 01 53 07 01 3D 47 07 00 18 40 01 FF 00 09 00 00 00 01 07 00 18 FF 00 00 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 02 07 01 53 07 01 3D 47 07 00 18 40 01 02 05 42 01 18 04 0B 42 01 1F 4C 07 00 03 FF 00 02 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 02 07 00 03 01 5F 07 00 03 FF 00 1F 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 04 07 01 6F 08 04 81 08 04 81 07 00 27 FF 00 02 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 05 07 01 6F 08 04 81 08 04 81 07 00 27 01 FF 00 1C 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 04 07 01 6F 08 04 81 08 04 81 07 00 27 45 07 00 11 FF 00 00 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 05 07 01 6F 08 04 81 08 04 81 07 00 27 07 01 66 45 07 00 18 FF 00 00 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 02 07 01 6F 07 01 61 42 07 00 18 FF 00 00 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 02 07 01 6F 07 01 61 45 07 00 18 00 F8 00 02 4C 07 01 01 FF 00 02 00 02 07 00 03 07 01 01 00 02 07 01 01 01 5F 07 01 01 42 07 00 18 40 07 01 01 45 07 00 18 40 07 01 46 11 42 01 1F 43 07 00 84 40 07 01 01 45 07 00 18 40 07 01 97 FF 00 09 00 00 00 01 07 00 18 FF 00 00 00 02 07 00 03 07 01 01 00 01 07 01 01 45 07 00 18 40 07 01 97 FF 00 07 00 03 07 00 03 07 01 01 07 01 61 00 01 07 00 7E 40 07 01 61 45 07 00 18 40 07 01 66 0D 0B 42 01 1C 4C 07 01 61 FF 00 02 00 03 07 00 03 07 01 01 07 01 61 00 02 07 01 61 01 5F 07 01 61 42 07 00 18 40 07 01 61 45 07 00 18 40 07 01 66 11 42 01 1F FA 00 04 40 07 01 01 FF 00 01 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 04 07 01 6F 08 03 6F 08 03 6F 07 00 B1 FF 00 01 00 03 07 00 03 07 01 01 07 01 61 00 01 07 01 61 FF 00 01 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 00 FF 00 01 00 03 07 00 03 07 01 01 07 01 06 00 01 07 01 06 FF 00 01 00 03 07 00 03 07 01 01 07 01 06 00 02 07 00 F8 07 00 41 FF 00 01 00 03 07 00 03 07 01 01 07 01 61 00 00 FF 00 01 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 01 07 01 3D FF 00 01 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 01 07 00 03 FF 00 01 00 05 07 00 03 07 01 01 07 01 06 07 01 3D 01 00 04 07 01 6F 08 04 81 08 04 81 07 00 27 F8 00 01 FF 00 01 00 03 07 00 03 07 01 01 07 01 06 00 01 07 01 06 FF 00 01 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 02 07 01 3D 07 00 03 FF 00 01 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 04 07 01 3D 07 01 9B 07 01 99 07 01 9D FF 00 01 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 05 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 B1 FF 00 01 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 07 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 27 07 00 A8 07 01 06 FF 00 01 00 04 07 00 03 07 01 01 07 01 06 07 01 3D 00 06 07 01 3D 07 01 9B 07 01 99 07 01 9D 07 00 27 07 00 A8 FC 00 01 01 FF 00 01 00 03 07 00 03 07 01 01 07 01 61 00 00 FF 00 01 00 02 07 00 03 07 01 01 00 01 07 00 80 43 05 44 07 00 80 47 05 47 07 00 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1617   1625   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1617   1625   1617   1625   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1633   1635   3      8      Any
        //  28     35     35     36     Any
        //  29     35     35     36     Any
        //  28     35     28     29     Ljava/lang/ClassCastException;
        //  28     35     35     36     Any
        //  29     35     28     29     Ljava/lang/AssertionError;
        //  46     53     53     54     Any
        //  47     53     46     47     Any
        //  46     53     53     54     Any
        //  46     53     53     54     Ljava/lang/AssertionError;
        //  46     53     46     47     Any
        //  116    122    122    123    Any
        //  116    122    122    123    Any
        //  116    122    122    123    Any
        //  116    122    3      8      Any
        //  116    122    3      8      Any
        //  130    136    136    137    Any
        //  130    136    3      8      Any
        //  130    136    136    137    Ljava/lang/ClassCastException;
        //  130    136    3      8      Any
        //  130    136    136    137    Any
        //  215    222    222    223    Any
        //  216    222    222    223    Ljava/util/NoSuchElementException;
        //  215    222    215    216    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  215    222    3      8      Any
        //  216    222    215    216    Any
        //  234    241    241    242    Any
        //  234    241    3      8      Ljava/lang/NullPointerException;
        //  235    241    234    235    Any
        //  235    241    241    242    Any
        //  234    241    241    242    Ljava/lang/ArithmeticException;
        //  336    342    342    343    Any
        //  336    342    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  336    342    3      8      Any
        //  336    342    342    343    Any
        //  336    342    342    343    Any
        //  346    353    353    354    Any
        //  346    353    346    347    Any
        //  347    353    353    354    Any
        //  347    353    353    354    Any
        //  346    353    3      8      Ljava/lang/IllegalStateException;
        //  459    465    465    466    Any
        //  459    465    3      8      Any
        //  459    465    465    466    Any
        //  459    465    3      8      Any
        //  459    465    465    466    Any
        //  470    477    477    478    Any
        //  471    477    470    471    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  470    477    3      8      Ljava/lang/NullPointerException;
        //  471    477    470    471    Any
        //  470    477    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  481    488    488    489    Any
        //  481    488    3      8      Ljava/lang/NumberFormatException;
        //  482    488    481    482    Ljava/lang/EnumConstantNotPresentException;
        //  481    488    481    482    Any
        //  482    488    481    482    Any
        //  591    598    598    599    Any
        //  592    598    591    592    Ljava/lang/AssertionError;
        //  592    598    591    592    Any
        //  591    598    591    592    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  592    598    3      8      Ljava/lang/NumberFormatException;
        //  695    702    702    703    Any
        //  696    702    695    696    Any
        //  695    702    695    696    Any
        //  695    702    695    696    Any
        //  696    702    3      8      Ljava/util/NoSuchElementException;
        //  709    716    716    717    Any
        //  710    716    3      8      Any
        //  709    716    716    717    Ljava/lang/IndexOutOfBoundsException;
        //  710    716    3      8      Any
        //  710    716    709    710    Any
        //  724    730    730    731    Any
        //  724    730    730    731    Ljava/lang/NumberFormatException;
        //  724    730    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  724    730    3      8      Ljava/lang/RuntimeException;
        //  724    730    730    731    Any
        //  795    804    804    805    Any
        //  796    804    795    796    Ljava/lang/AssertionError;
        //  796    804    795    796    Any
        //  796    804    3      8      Ljava/lang/UnsupportedOperationException;
        //  795    804    3      8      Any
        //  815    824    824    825    Any
        //  816    824    815    816    Ljava/lang/NumberFormatException;
        //  815    824    824    825    Any
        //  815    824    3      8      Ljava/util/ConcurrentModificationException;
        //  816    824    815    816    Ljava/lang/IndexOutOfBoundsException;
        //  941    948    948    949    Any
        //  942    948    3      8      Ljava/lang/NegativeArraySizeException;
        //  942    948    948    949    Any
        //  941    948    3      8      Any
        //  942    948    941    942    Ljava/lang/EnumConstantNotPresentException;
        //  952    959    959    960    Any
        //  952    959    959    960    Any
        //  952    959    952    953    Ljava/lang/NullPointerException;
        //  953    959    959    960    Any
        //  953    959    952    953    Any
        //  977    986    986    987    Any
        //  977    986    3      8      Any
        //  978    986    977    978    Any
        //  978    986    3      8      Any
        //  978    986    3      8      Ljava/lang/NumberFormatException;
        //  998    1006   1006   1007   Any
        //  998    1006   1006   1007   Any
        //  998    1006   3      8      Any
        //  998    1006   1006   1007   Any
        //  998    1006   3      8      Any
        //  1214   1221   1221   1222   Any
        //  1214   1221   1221   1222   Any
        //  1215   1221   3      8      Any
        //  1215   1221   1221   1222   Ljava/lang/NumberFormatException;
        //  1214   1221   1214   1215   Ljava/lang/AssertionError;
        //  1225   1232   1232   1233   Any
        //  1225   1232   1225   1226   Ljava/lang/RuntimeException;
        //  1226   1232   1225   1226   Any
        //  1226   1232   1225   1226   Ljava/lang/NullPointerException;
        //  1226   1232   1225   1226   Ljava/util/ConcurrentModificationException;
        //  1287   1294   1294   1295   Any
        //  1287   1294   3      8      Any
        //  1288   1294   1287   1288   Any
        //  1287   1294   3      8      Any
        //  1288   1294   1294   1295   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1352   1359   1359   1360   Any
        //  1353   1359   3      8      Ljava/lang/IllegalArgumentException;
        //  1352   1359   1352   1353   Ljava/lang/IllegalStateException;
        //  1353   1359   1359   1360   Ljava/lang/NumberFormatException;
        //  1353   1359   3      8      Ljava/lang/ClassCastException;
        //  1371   1377   1377   1378   Any
        //  1371   1377   3      8      Ljava/util/ConcurrentModificationException;
        //  1371   1377   3      8      Any
        //  1371   1377   1377   1378   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  1371   1377   3      8      Any
        //  1386   1393   1393   1394   Any
        //  1387   1393   1386   1387   Ljava/lang/ArithmeticException;
        //  1386   1393   1393   1394   Ljava/lang/NegativeArraySizeException;
        //  1387   1393   1393   1394   Any
        //  1386   1393   1393   1394   Any
        //  1503   1510   1510   1511   Any
        //  1503   1510   1503   1504   Ljava/lang/RuntimeException;
        //  1504   1510   1503   1504   Any
        //  1503   1510   3      8      Any
        //  1503   1510   3      8      Ljava/lang/AssertionError;
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
}
