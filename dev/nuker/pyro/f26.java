// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import kotlin.jvm.JvmStatic;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.Command;
import org.jetbrains.annotations.NotNull;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class f26
{
    public static SimpleCommandExceptionType c;
    public static f26 c;
    
    public static SimpleCommandExceptionType c(final f26 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       dev/nuker/pyro/fc.1:I
        //     4: ifgt            38
        //     7: pop            
        //     8: aconst_null    
        //     9: goto            30
        //    12: nop            
        //    13: nop            
        //    14: nop            
        //    15: athrow         
        //    16: aload_0        
        //    17: getstatic       dev/nuker/pyro/f26.c:Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;
        //    20: areturn        
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
        //    StackMapTable: 00 06 FF 00 0C 00 00 00 01 07 00 17 FC 00 03 07 00 03 44 07 00 17 43 05 44 07 00 17 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  0      12     30     38     Any
        //  30     38     30     38     Ljava/util/NoSuchElementException;
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
    
    @JvmStatic
    public static void c(@NotNull final CommandDispatcher p0) {
        public class f25 implements Command
        {
            public CommandDispatcher c;
            
            @Override
            public int run(@NotNull final CommandContext p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          1386
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.c:I
                //    12: iflt            1378
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            1370
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: aload_1        
                //    25: pop            
                //    26: aload_0        
                //    27: getfield        dev/nuker/pyro/f25.c:Lcom/mojang/brigadier/CommandDispatcher;
                //    30: aload_1        
                //    31: ldc             "\u2362\u149c\u8a75\u0b2d\u1004\ued69\ub220"
                //    33: getstatic       dev/nuker/pyro/fc.c:I
                //    36: ifge            44
                //    39: ldc             -423295764
                //    41: goto            46
                //    44: ldc             1968687230
                //    46: ldc             946595224
                //    48: ixor           
                //    49: lookupswitch {
                //          -558964364: 44
                //          1295789542: 76
                //          default: 1349
                //        }
                //    76: goto            80
                //    79: athrow         
                //    80: invokestatic    invokestatic   !!! ERROR
                //    83: goto            87
                //    86: athrow         
                //    87: goto            91
                //    90: athrow         
                //    91: invokestatic    com/mojang/brigadier/arguments/StringArgumentType.getString:(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/lang/String;
                //    94: goto            98
                //    97: athrow         
                //    98: getstatic       dev/nuker/pyro/fc.c:I
                //   101: ifge            109
                //   104: ldc             -1484752079
                //   106: goto            111
                //   109: ldc             1391660244
                //   111: ldc             1208491740
                //   113: ixor           
                //   114: lookupswitch {
                //          -1832296829: 109
                //          -276273683: 1353
                //          default: 140
                //        }
                //   140: aload_1        
                //   141: goto            145
                //   144: athrow         
                //   145: invokevirtual   com/mojang/brigadier/context/CommandContext.getSource:()Ljava/lang/Object;
                //   148: goto            152
                //   151: athrow         
                //   152: getstatic       dev/nuker/pyro/fc.c:I
                //   155: ifge            163
                //   158: ldc             -331662642
                //   160: goto            165
                //   163: ldc             1126802484
                //   165: ldc             551090156
                //   167: ixor           
                //   168: lookupswitch {
                //          -857486046: 1329
                //          -730936662: 163
                //          default: 196
                //        }
                //   196: goto            200
                //   199: athrow         
                //   200: invokevirtual   com/mojang/brigadier/CommandDispatcher.parse:(Ljava/lang/String;Ljava/lang/Object;)Lcom/mojang/brigadier/ParseResults;
                //   203: goto            207
                //   206: athrow         
                //   207: astore_2       
                //   208: aload_2        
                //   209: dup            
                //   210: pop            
                //   211: getstatic       dev/nuker/pyro/fc.1:I
                //   214: ifeq            222
                //   217: ldc             1706474423
                //   219: goto            224
                //   222: ldc             1845862393
                //   224: ldc             -2066585460
                //   226: ixor           
                //   227: lookupswitch {
                //          -860592916: 222
                //          -513486021: 1333
                //          default: 252
                //        }
                //   252: goto            256
                //   255: athrow         
                //   256: invokevirtual   com/mojang/brigadier/ParseResults.getContext:()Lcom/mojang/brigadier/context/CommandContextBuilder;
                //   259: goto            263
                //   262: athrow         
                //   263: dup            
                //   264: pop            
                //   265: goto            269
                //   268: athrow         
                //   269: invokevirtual   com/mojang/brigadier/context/CommandContextBuilder.getNodes:()Ljava/util/List;
                //   272: goto            276
                //   275: athrow         
                //   276: goto            280
                //   279: athrow         
                //   280: invokeinterface java/util/List.isEmpty:()Z
                //   285: goto            289
                //   288: athrow         
                //   289: ifeq            323
                //   292: getstatic       dev/nuker/pyro/f26.c:Ldev/nuker/pyro/f26;
                //   295: goto            299
                //   298: athrow         
                //   299: invokestatic    dev/nuker/pyro/f26.c:(Ldev/nuker/pyro/f26;)Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;
                //   302: goto            306
                //   305: athrow         
                //   306: goto            310
                //   309: athrow         
                //   310: invokevirtual   com/mojang/brigadier/exceptions/SimpleCommandExceptionType.create:()Lcom/mojang/brigadier/exceptions/CommandSyntaxException;
                //   313: goto            317
                //   316: athrow         
                //   317: dup            
                //   318: pop            
                //   319: checkcast       Ljava/lang/Throwable;
                //   322: athrow         
                //   323: getstatic       dev/nuker/pyro/fc.1:I
                //   326: ifeq            334
                //   329: ldc             1855260104
                //   331: goto            336
                //   334: ldc             -1298826219
                //   336: ldc             1582580347
                //   338: ixor           
                //   339: lookupswitch {
                //          640928667: 334
                //          817973171: 1335
                //          default: 364
                //        }
                //   364: aload_1        
                //   365: goto            369
                //   368: athrow         
                //   369: invokevirtual   com/mojang/brigadier/context/CommandContext.getSource:()Ljava/lang/Object;
                //   372: goto            376
                //   375: athrow         
                //   376: checkcast       Ldev/nuker/pyro/f16;
                //   379: new             Lnet/minecraft/util/text/TextComponentString;
                //   382: dup            
                //   383: ldc             "\u2354\u1480\u8a79\u0b27\u1000\ued3d\ub264"
                //   385: goto            389
                //   388: athrow         
                //   389: invokestatic    invokestatic   !!! ERROR
                //   392: goto            396
                //   395: athrow         
                //   396: goto            400
                //   399: athrow         
                //   400: invokespecial   net/minecraft/util/text/TextComponentString.<init>:(Ljava/lang/String;)V
                //   403: goto            407
                //   406: athrow         
                //   407: checkcast       Lnet/minecraft/util/text/ITextComponent;
                //   410: goto            414
                //   413: athrow         
                //   414: invokevirtual   dev/nuker/pyro/f16.c:(Lnet/minecraft/util/text/ITextComponent;)V
                //   417: goto            421
                //   420: athrow         
                //   421: getstatic       dev/nuker/pyro/fc.c:I
                //   424: ifge            432
                //   427: ldc             -2037663699
                //   429: goto            434
                //   432: ldc             -1015767340
                //   434: ldc             -1920668679
                //   436: ixor           
                //   437: lookupswitch {
                //          185553876: 1355
                //          792308038: 432
                //          default: 464
                //        }
                //   464: aload_0        
                //   465: getfield        dev/nuker/pyro/f25.c:Lcom/mojang/brigadier/CommandDispatcher;
                //   468: getstatic       dev/nuker/pyro/fc.0:I
                //   471: ifeq            479
                //   474: ldc             -1647815373
                //   476: goto            481
                //   479: ldc             190765714
                //   481: ldc             -524197344
                //   483: ixor           
                //   484: lookupswitch {
                //          -139878090: 479
                //          2097755923: 1327
                //          default: 512
                //        }
                //   512: aload_2        
                //   513: goto            517
                //   516: athrow         
                //   517: invokevirtual   com/mojang/brigadier/ParseResults.getContext:()Lcom/mojang/brigadier/context/CommandContextBuilder;
                //   520: goto            524
                //   523: athrow         
                //   524: dup            
                //   525: pop            
                //   526: goto            530
                //   529: athrow         
                //   530: invokevirtual   com/mojang/brigadier/context/CommandContextBuilder.getNodes:()Ljava/util/List;
                //   533: goto            537
                //   536: athrow         
                //   537: checkcast       Ljava/lang/Iterable;
                //   540: getstatic       dev/nuker/pyro/fc.1:I
                //   543: ifeq            551
                //   546: ldc             -1168891944
                //   548: goto            553
                //   551: ldc             -1683960345
                //   553: ldc             -1200637723
                //   555: ixor           
                //   556: lookupswitch {
                //          37463869: 1351
                //          1750294211: 551
                //          default: 584
                //        }
                //   584: goto            588
                //   587: athrow         
                //   588: invokestatic    com/google/common/collect/Iterables.getLast:(Ljava/lang/Iterable;)Ljava/lang/Object;
                //   591: goto            595
                //   594: athrow         
                //   595: dup            
                //   596: pop            
                //   597: checkcast       Lcom/mojang/brigadier/context/ParsedCommandNode;
                //   600: goto            604
                //   603: athrow         
                //   604: invokevirtual   com/mojang/brigadier/context/ParsedCommandNode.getNode:()Lcom/mojang/brigadier/tree/CommandNode;
                //   607: goto            611
                //   610: athrow         
                //   611: aload_1        
                //   612: getstatic       dev/nuker/pyro/fc.1:I
                //   615: ifeq            623
                //   618: ldc             -1474555489
                //   620: goto            625
                //   623: ldc             267574560
                //   625: ldc             -203599762
                //   627: ixor           
                //   628: lookupswitch {
                //          754917561: 623
                //          1539391985: 1341
                //          default: 656
                //        }
                //   656: goto            660
                //   659: athrow         
                //   660: invokevirtual   com/mojang/brigadier/context/CommandContext.getSource:()Ljava/lang/Object;
                //   663: goto            667
                //   666: athrow         
                //   667: goto            671
                //   670: athrow         
                //   671: invokevirtual   com/mojang/brigadier/CommandDispatcher.getSmartUsage:(Lcom/mojang/brigadier/tree/CommandNode;Ljava/lang/Object;)Ljava/util/Map;
                //   674: goto            678
                //   677: athrow         
                //   678: astore_3       
                //   679: aload_3        
                //   680: goto            684
                //   683: athrow         
                //   684: invokeinterface java/util/Map.values:()Ljava/util/Collection;
                //   689: goto            693
                //   692: athrow         
                //   693: getstatic       dev/nuker/pyro/fc.0:I
                //   696: ifeq            704
                //   699: ldc             343782271
                //   701: goto            706
                //   704: ldc             -980895136
                //   706: ldc             -1789757177
                //   708: ixor           
                //   709: lookupswitch {
                //          -2127574408: 1343
                //          848783140: 704
                //          default: 736
                //        }
                //   736: goto            740
                //   739: athrow         
                //   740: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
                //   745: goto            749
                //   748: athrow         
                //   749: astore          4
                //   751: aload           4
                //   753: getstatic       dev/nuker/pyro/fc.1:I
                //   756: ifeq            764
                //   759: ldc             -288007959
                //   761: goto            766
                //   764: ldc             -422963525
                //   766: ldc             -645260884
                //   768: ixor           
                //   769: lookupswitch {
                //          928989509: 764
                //          1061162775: 796
                //          default: 1345
                //        }
                //   796: goto            800
                //   799: athrow         
                //   800: invokeinterface java/util/Iterator.hasNext:()Z
                //   805: goto            809
                //   808: athrow         
                //   809: ifeq            1268
                //   812: aload           4
                //   814: goto            818
                //   817: athrow         
                //   818: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                //   823: goto            827
                //   826: athrow         
                //   827: dup            
                //   828: ifnonnull       944
                //   831: new             Lkotlin/TypeCastException;
                //   834: dup            
                //   835: ldc             "\u236f\u1486\u8a74\u0b2c\u1045\ued64\ub225\ue65b\u619f\u3079\ua7b3\u1e0c\ue173\u7d5b\u58b1\u89ff\u57a5\u7783\u05d0\u198a\u2b87\uc234\u6ad8\u95a1\u0e1b\u350a\u7d66\u8935\u38fd\u555d\u842d\ufb72\u7053\u22f6\uc253\uf1e3\u493c\u88ff\u7270\u26f5\ub655\u41fa\ub96f\u0bff\u9580\u8a60\u7c7b\uceb9\uc5b9\u3303"
                //   837: getstatic       dev/nuker/pyro/fc.0:I
                //   840: ifeq            848
                //   843: ldc             477612911
                //   845: goto            850
                //   848: ldc             -1582460253
                //   850: ldc             -1657531939
                //   852: ixor           
                //   853: lookupswitch {
                //          -2126259534: 1359
                //          1815668359: 848
                //          default: 880
                //        }
                //   880: goto            884
                //   883: athrow         
                //   884: invokestatic    invokestatic   !!! ERROR
                //   887: goto            891
                //   890: athrow         
                //   891: getstatic       dev/nuker/pyro/fc.c:I
                //   894: ifge            902
                //   897: ldc             -1393968017
                //   899: goto            904
                //   902: ldc             -667589505
                //   904: ldc             1388007491
                //   906: ixor           
                //   907: lookupswitch {
                //          -305397493: 902
                //          -28120020: 1337
                //          default: 932
                //        }
                //   932: goto            936
                //   935: athrow         
                //   936: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
                //   939: goto            943
                //   942: athrow         
                //   943: athrow         
                //   944: checkcast       Ljava/lang/String;
                //   947: astore          5
                //   949: aload_1        
                //   950: goto            954
                //   953: athrow         
                //   954: invokevirtual   com/mojang/brigadier/context/CommandContext.getSource:()Ljava/lang/Object;
                //   957: goto            961
                //   960: athrow         
                //   961: dup            
                //   962: ifnonnull       1036
                //   965: new             Lkotlin/TypeCastException;
                //   968: dup            
                //   969: ldc             "\u236f\u1486\u8a74\u0b2c\u1045\ued64\ub225\ue65b\u619f\u3079\ua7b3\u1e0c\ue173\u7d5b\u58b1\u89ff\u57a5\u7783\u05d0\u198a\u2b87\uc234\u6ad8\u95a1\u0e1b\u350a\u7d66\u8935\u38fd\u555d\u842d\ufb72\u7053\u22f6\uc253\uf1e3\u493c\u88f0\u727a\u26f7\ub617\u41fd\ub974\u0bba\u95b6\u8a66\u7c27\ucea0\uc5ae\u3316\ue656\u1696\ueec0\u8f78\u9f61\ue170\u0a16\u864a\ua128\ud6ca\u77bf\u7282\uc772\u034e\u431a\u6a9a\ue2e2\ud092\u1ddb\ufc1e\u8925\u4fa2\u8be1"
                //   971: goto            975
                //   974: athrow         
                //   975: invokestatic    invokestatic   !!! ERROR
                //   978: goto            982
                //   981: athrow         
                //   982: getstatic       dev/nuker/pyro/fc.1:I
                //   985: ifeq            993
                //   988: ldc             336704919
                //   990: goto            995
                //   993: ldc             -1159321091
                //   995: ldc             -437966990
                //   997: ixor           
                //   998: lookupswitch {
                //          -235629851: 993
                //          1594035855: 1024
                //          default: 1347
                //        }
                //  1024: goto            1028
                //  1027: athrow         
                //  1028: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
                //  1031: goto            1035
                //  1034: athrow         
                //  1035: athrow         
                //  1036: checkcast       Ldev/nuker/pyro/f16;
                //  1039: new             Lnet/minecraft/util/text/TextComponentString;
                //  1042: dup            
                //  1043: new             Ljava/lang/StringBuilder;
                //  1046: dup            
                //  1047: goto            1051
                //  1050: athrow         
                //  1051: invokespecial   java/lang/StringBuilder.<init>:()V
                //  1054: goto            1058
                //  1057: athrow         
                //  1058: getstatic       dev/nuker/pyro/Config.INSTANCE:Ldev/nuker/pyro/Config;
                //  1061: getfield        dev/nuker/pyro/Config.chatPrefix:Ljava/lang/String;
                //  1064: goto            1068
                //  1067: athrow         
                //  1068: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //  1071: goto            1075
                //  1074: athrow         
                //  1075: aload_2        
                //  1076: goto            1080
                //  1079: athrow         
                //  1080: invokevirtual   com/mojang/brigadier/ParseResults.getReader:()Lcom/mojang/brigadier/ImmutableStringReader;
                //  1083: goto            1087
                //  1086: athrow         
                //  1087: dup            
                //  1088: pop            
                //  1089: getstatic       dev/nuker/pyro/fc.c:I
                //  1092: ifge            1100
                //  1095: ldc             -190937844
                //  1097: goto            1102
                //  1100: ldc             -1961772983
                //  1102: ldc             -1751240173
                //  1104: ixor           
                //  1105: lookupswitch {
                //          -866396685: 1100
                //          1660991263: 1331
                //          default: 1132
                //        }
                //  1132: goto            1136
                //  1135: athrow         
                //  1136: invokeinterface com/mojang/brigadier/ImmutableStringReader.getString:()Ljava/lang/String;
                //  1141: goto            1145
                //  1144: athrow         
                //  1145: goto            1149
                //  1148: athrow         
                //  1149: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //  1152: goto            1156
                //  1155: athrow         
                //  1156: ldc             " "
                //  1158: goto            1162
                //  1161: athrow         
                //  1162: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //  1165: goto            1169
                //  1168: athrow         
                //  1169: aload           5
                //  1171: goto            1175
                //  1174: athrow         
                //  1175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //  1178: goto            1182
                //  1181: athrow         
                //  1182: goto            1186
                //  1185: athrow         
                //  1186: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //  1189: goto            1193
                //  1192: athrow         
                //  1193: getstatic       dev/nuker/pyro/fc.c:I
                //  1196: ifge            1205
                //  1199: ldc_w           -1559185345
                //  1202: goto            1208
                //  1205: ldc_w           339649094
                //  1208: ldc_w           950962160
                //  1211: ixor           
                //  1212: lookupswitch {
                //          -1682030641: 1357
                //          1758614724: 1205
                //          default: 1240
                //        }
                //  1240: goto            1244
                //  1243: athrow         
                //  1244: invokespecial   net/minecraft/util/text/TextComponentString.<init>:(Ljava/lang/String;)V
                //  1247: goto            1251
                //  1250: athrow         
                //  1251: checkcast       Lnet/minecraft/util/text/ITextComponent;
                //  1254: goto            1258
                //  1257: athrow         
                //  1258: invokevirtual   dev/nuker/pyro/f16.c:(Lnet/minecraft/util/text/ITextComponent;)V
                //  1261: goto            1265
                //  1264: athrow         
                //  1265: goto            751
                //  1268: getstatic       dev/nuker/pyro/fc.c:I
                //  1271: ifge            1280
                //  1274: ldc_w           -732714529
                //  1277: goto            1283
                //  1280: ldc_w           -723893432
                //  1283: ldc_w           -1788935981
                //  1286: ixor           
                //  1287: lookupswitch {
                //          -1089354362: 1280
                //          1091348748: 1339
                //          default: 1312
                //        }
                //  1312: aload_3        
                //  1313: goto            1317
                //  1316: athrow         
                //  1317: invokeinterface java/util/Map.size:()I
                //  1322: goto            1326
                //  1325: athrow         
                //  1326: ireturn        
                //  1327: aconst_null    
                //  1328: athrow         
                //  1329: aconst_null    
                //  1330: athrow         
                //  1331: aconst_null    
                //  1332: athrow         
                //  1333: aconst_null    
                //  1334: athrow         
                //  1335: aconst_null    
                //  1336: athrow         
                //  1337: aconst_null    
                //  1338: athrow         
                //  1339: aconst_null    
                //  1340: athrow         
                //  1341: aconst_null    
                //  1342: athrow         
                //  1343: aconst_null    
                //  1344: athrow         
                //  1345: aconst_null    
                //  1346: athrow         
                //  1347: aconst_null    
                //  1348: athrow         
                //  1349: aconst_null    
                //  1350: athrow         
                //  1351: aconst_null    
                //  1352: athrow         
                //  1353: aconst_null    
                //  1354: athrow         
                //  1355: aconst_null    
                //  1356: athrow         
                //  1357: aconst_null    
                //  1358: athrow         
                //  1359: aconst_null    
                //  1360: athrow         
                //  1361: pop            
                //  1362: goto            24
                //  1365: pop            
                //  1366: aconst_null    
                //  1367: goto            1361
                //  1370: dup            
                //  1371: ifnull          1361
                //  1374: checkcast       Ljava/lang/Throwable;
                //  1377: athrow         
                //  1378: dup            
                //  1379: ifnull          1365
                //  1382: checkcast       Ljava/lang/Throwable;
                //  1385: athrow         
                //  1386: aconst_null    
                //  1387: athrow         
                //    StackMapTable: 00 EE 43 07 00 37 04 FF 00 0B 00 00 00 01 07 00 37 FD 00 03 07 00 03 07 00 4F FF 00 13 00 02 07 00 03 07 00 4F 00 03 07 00 58 07 00 4F 07 00 D9 FF 00 01 00 02 07 00 03 07 00 4F 00 04 07 00 58 07 00 4F 07 00 D9 01 FF 00 1D 00 02 07 00 03 07 00 4F 00 03 07 00 58 07 00 4F 07 00 D9 42 07 00 16 FF 00 00 00 02 07 00 03 07 00 4F 00 03 07 00 58 07 00 4F 07 00 D9 45 07 00 37 FF 00 00 00 02 07 00 03 07 00 4F 00 03 07 00 58 07 00 4F 07 00 D9 42 07 00 37 FF 00 00 00 02 07 00 03 07 00 4F 00 03 07 00 58 07 00 4F 07 00 D9 45 07 00 37 FF 00 00 00 02 07 00 03 07 00 4F 00 02 07 00 58 07 00 D9 FF 00 0A 00 02 07 00 03 07 00 4F 00 02 07 00 58 07 00 D9 FF 00 01 00 02 07 00 03 07 00 4F 00 03 07 00 58 07 00 D9 01 FF 00 1C 00 02 07 00 03 07 00 4F 00 02 07 00 58 07 00 D9 43 07 00 37 FF 00 00 00 02 07 00 03 07 00 4F 00 03 07 00 58 07 00 D9 07 00 4F 45 07 00 37 FF 00 00 00 02 07 00 03 07 00 4F 00 03 07 00 58 07 00 D9 07 00 05 FF 00 0A 00 02 07 00 03 07 00 4F 00 03 07 00 58 07 00 D9 07 00 05 FF 00 01 00 02 07 00 03 07 00 4F 00 04 07 00 58 07 00 D9 07 00 05 01 FF 00 1E 00 02 07 00 03 07 00 4F 00 03 07 00 58 07 00 D9 07 00 05 FF 00 02 00 00 00 01 07 00 37 FF 00 00 00 02 07 00 03 07 00 4F 00 03 07 00 58 07 00 D9 07 00 05 45 07 00 37 40 07 00 64 FF 00 0E 00 03 07 00 03 07 00 4F 07 00 64 00 01 07 00 64 FF 00 01 00 03 07 00 03 07 00 4F 07 00 64 00 02 07 00 64 01 5B 07 00 64 42 07 00 37 40 07 00 64 45 07 00 37 40 07 00 6A 44 07 00 37 40 07 00 6A 45 07 00 37 40 07 00 70 42 07 00 37 40 07 00 70 47 07 00 37 40 01 48 07 00 37 40 07 00 09 45 07 00 37 40 07 00 7C 42 07 00 37 40 07 00 7C 45 07 00 37 40 07 01 0E 05 0A 41 01 1B 43 07 00 37 40 07 00 4F 45 07 00 37 40 07 00 05 4B 07 00 37 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 04 07 00 85 08 01 7B 08 01 7B 07 00 D9 45 07 00 37 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 04 07 00 85 08 01 7B 08 01 7B 07 00 D9 42 07 00 37 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 04 07 00 85 08 01 7B 08 01 7B 07 00 D9 45 07 00 37 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 02 07 00 85 07 00 87 45 07 00 37 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 02 07 00 85 07 00 8F 45 07 00 37 00 0A 41 01 1D 4E 07 00 58 FF 00 01 00 03 07 00 03 07 00 4F 07 00 64 00 02 07 00 58 01 5E 07 00 58 43 07 00 37 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 02 07 00 58 07 00 64 45 07 00 37 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 02 07 00 58 07 00 6A 44 07 00 37 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 02 07 00 58 07 00 6A 45 07 00 37 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 02 07 00 58 07 00 70 FF 00 0D 00 03 07 00 03 07 00 4F 07 00 64 00 02 07 00 58 07 00 9C FF 00 01 00 03 07 00 03 07 00 4F 07 00 64 00 03 07 00 58 07 00 9C 01 FF 00 1E 00 03 07 00 03 07 00 4F 07 00 64 00 02 07 00 58 07 00 9C 42 07 00 37 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 02 07 00 58 07 00 9C 45 07 00 37 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 02 07 00 58 07 00 05 47 07 00 37 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 02 07 00 58 07 00 A7 45 07 00 37 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 02 07 00 58 07 01 10 FF 00 0B 00 03 07 00 03 07 00 4F 07 00 64 00 03 07 00 58 07 01 10 07 00 4F FF 00 01 00 03 07 00 03 07 00 4F 07 00 64 00 04 07 00 58 07 01 10 07 00 4F 01 FF 00 1E 00 03 07 00 03 07 00 4F 07 00 64 00 03 07 00 58 07 01 10 07 00 4F 42 07 00 37 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 03 07 00 58 07 01 10 07 00 4F 45 07 00 37 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 03 07 00 58 07 01 10 07 00 05 42 07 00 37 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 03 07 00 58 07 01 10 07 00 05 45 07 00 37 40 07 00 B4 FF 00 04 00 04 07 00 03 07 00 4F 07 00 64 07 00 B4 00 01 07 00 1C 40 07 00 B4 47 07 00 37 40 07 00 BD 4A 07 00 BD FF 00 01 00 04 07 00 03 07 00 4F 07 00 64 07 00 B4 00 02 07 00 BD 01 5D 07 00 BD 42 07 00 37 40 07 00 BD 47 07 00 37 40 07 00 C6 FC 00 01 07 00 C6 4C 07 00 C6 FF 00 01 00 05 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 00 02 07 00 C6 01 5D 07 00 C6 42 07 00 20 40 07 00 C6 47 07 00 37 40 01 47 07 00 37 40 07 00 C6 47 07 00 37 40 07 00 05 FF 00 14 00 05 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 00 04 07 00 05 08 03 3F 08 03 3F 07 00 D9 FF 00 01 00 05 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 00 05 07 00 05 08 03 3F 08 03 3F 07 00 D9 01 FF 00 1D 00 05 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 00 04 07 00 05 08 03 3F 08 03 3F 07 00 D9 42 07 00 1E FF 00 00 00 05 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 00 04 07 00 05 08 03 3F 08 03 3F 07 00 D9 45 07 00 37 FF 00 00 00 05 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 00 04 07 00 05 08 03 3F 08 03 3F 07 00 D9 FF 00 0A 00 05 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 00 04 07 00 05 08 03 3F 08 03 3F 07 00 D9 FF 00 01 00 05 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 00 05 07 00 05 08 03 3F 08 03 3F 07 00 D9 01 FF 00 1B 00 05 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 00 04 07 00 05 08 03 3F 08 03 3F 07 00 D9 42 07 00 37 FF 00 00 00 05 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 00 04 07 00 05 08 03 3F 08 03 3F 07 00 D9 45 07 00 37 FF 00 00 00 05 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 00 02 07 00 05 07 00 CE 40 07 00 05 FF 00 08 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 01 07 00 18 40 07 00 4F 45 07 00 37 40 07 00 05 4C 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 05 08 03 C5 08 03 C5 07 00 D9 45 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 05 08 03 C5 08 03 C5 07 00 D9 FF 00 0A 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 05 08 03 C5 08 03 C5 07 00 D9 FF 00 01 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 05 07 00 05 08 03 C5 08 03 C5 07 00 D9 01 FF 00 1C 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 05 08 03 C5 08 03 C5 07 00 D9 42 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 05 08 03 C5 08 03 C5 07 00 D9 45 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 02 07 00 05 07 00 CE 40 07 00 05 4D 07 00 2A FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 05 07 00 85 08 04 0F 08 04 0F 08 04 13 08 04 13 45 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 85 08 04 0F 08 04 0F 07 00 E0 48 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 05 07 00 85 08 04 0F 08 04 0F 07 00 E0 07 00 D9 45 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 85 08 04 0F 08 04 0F 07 00 E0 43 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 05 07 00 85 08 04 0F 08 04 0F 07 00 E0 07 00 64 45 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 05 07 00 85 08 04 0F 08 04 0F 07 00 E0 07 00 FA FF 00 0C 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 05 07 00 85 08 04 0F 08 04 0F 07 00 E0 07 00 FA FF 00 01 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 06 07 00 85 08 04 0F 08 04 0F 07 00 E0 07 00 FA 01 FF 00 1D 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 05 07 00 85 08 04 0F 08 04 0F 07 00 E0 07 00 FA 42 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 05 07 00 85 08 04 0F 08 04 0F 07 00 E0 07 00 FA 47 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 05 07 00 85 08 04 0F 08 04 0F 07 00 E0 07 00 D9 42 07 00 18 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 05 07 00 85 08 04 0F 08 04 0F 07 00 E0 07 00 D9 45 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 85 08 04 0F 08 04 0F 07 00 E0 44 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 05 07 00 85 08 04 0F 08 04 0F 07 00 E0 07 00 D9 45 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 85 08 04 0F 08 04 0F 07 00 E0 44 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 05 07 00 85 08 04 0F 08 04 0F 07 00 E0 07 00 D9 45 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 85 08 04 0F 08 04 0F 07 00 E0 42 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 85 08 04 0F 08 04 0F 07 00 E0 45 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 85 08 04 0F 08 04 0F 07 00 D9 FF 00 0B 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 85 08 04 0F 08 04 0F 07 00 D9 FF 00 02 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 05 07 00 85 08 04 0F 08 04 0F 07 00 D9 01 FF 00 1F 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 85 08 04 0F 08 04 0F 07 00 D9 42 07 00 1C FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 85 08 04 0F 08 04 0F 07 00 D9 45 07 00 37 FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 02 07 00 85 07 00 87 45 07 00 1C FF 00 00 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 02 07 00 85 07 00 8F 45 07 00 37 00 FA 00 02 0B 42 01 1C FF 00 03 00 00 00 01 07 00 37 FF 00 00 00 05 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 00 01 07 00 B4 47 07 00 37 40 01 FF 00 00 00 03 07 00 03 07 00 4F 07 00 64 00 01 07 00 58 FF 00 01 00 02 07 00 03 07 00 4F 00 03 07 00 58 07 00 D9 07 00 05 FF 00 01 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 05 07 00 85 08 04 0F 08 04 0F 07 00 E0 07 00 FA FF 00 01 00 03 07 00 03 07 00 4F 07 00 64 00 01 07 00 64 01 FF 00 01 00 05 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 00 04 07 00 05 08 03 3F 08 03 3F 07 00 D9 01 FF 00 01 00 03 07 00 03 07 00 4F 07 00 64 00 03 07 00 58 07 01 10 07 00 4F FF 00 01 00 04 07 00 03 07 00 4F 07 00 64 07 00 B4 00 01 07 00 BD FF 00 01 00 05 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 00 01 07 00 C6 FF 00 01 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 05 08 03 C5 08 03 C5 07 00 D9 FF 00 01 00 02 07 00 03 07 00 4F 00 03 07 00 58 07 00 4F 07 00 D9 FF 00 01 00 03 07 00 03 07 00 4F 07 00 64 00 02 07 00 58 07 00 9C FF 00 01 00 02 07 00 03 07 00 4F 00 02 07 00 58 07 00 D9 FC 00 01 07 00 64 FF 00 01 00 06 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 07 00 D9 00 04 07 00 85 08 04 0F 08 04 0F 07 00 D9 FF 00 01 00 05 07 00 03 07 00 4F 07 00 64 07 00 B4 07 00 C6 00 04 07 00 05 08 03 3F 08 03 3F 07 00 D9 FF 00 01 00 02 07 00 03 07 00 4F 00 01 07 00 1C 43 05 44 07 00 1C 47 05 47 07 00 37
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                       
                //  -----  -----  -----  -----  -------------------------------------------
                //  8      20     1370   1378   Ljava/lang/EnumConstantNotPresentException;
                //  1370   1378   1370   1378   Ljava/lang/UnsupportedOperationException;
                //  1386   1388   3      8      Any
                //  79     86     86     87     Any
                //  80     86     3      8      Any
                //  79     86     86     87     Ljava/lang/EnumConstantNotPresentException;
                //  79     86     79     80     Ljava/lang/AssertionError;
                //  80     86     86     87     Ljava/lang/ArithmeticException;
                //  90     97     97     98     Any
                //  91     97     90     91     Ljava/lang/IndexOutOfBoundsException;
                //  90     97     90     91     Any
                //  91     97     3      8      Ljava/lang/RuntimeException;
                //  90     97     90     91     Any
                //  144    151    151    152    Any
                //  145    151    3      8      Ljava/lang/IndexOutOfBoundsException;
                //  145    151    151    152    Ljava/lang/IndexOutOfBoundsException;
                //  144    151    144    145    Any
                //  144    151    3      8      Ljava/util/NoSuchElementException;
                //  200    206    206    207    Any
                //  200    206    3      8      Ljava/lang/IllegalArgumentException;
                //  200    206    3      8      Any
                //  200    206    3      8      Ljava/lang/RuntimeException;
                //  200    206    3      8      Ljava/lang/IndexOutOfBoundsException;
                //  255    262    262    263    Any
                //  255    262    3      8      Ljava/lang/UnsupportedOperationException;
                //  256    262    262    263    Ljava/lang/ClassCastException;
                //  256    262    255    256    Any
                //  255    262    262    263    Ljava/lang/IllegalArgumentException;
                //  268    275    275    276    Any
                //  269    275    275    276    Ljava/lang/NullPointerException;
                //  268    275    275    276    Any
                //  269    275    268    269    Any
                //  269    275    275    276    Any
                //  279    288    288    289    Any
                //  279    288    279    280    Any
                //  280    288    279    280    Ljava/lang/NullPointerException;
                //  280    288    288    289    Any
                //  279    288    288    289    Any
                //  298    305    305    306    Any
                //  298    305    305    306    Ljava/lang/ArithmeticException;
                //  298    305    305    306    Ljava/lang/UnsupportedOperationException;
                //  299    305    305    306    Any
                //  299    305    298    299    Any
                //  309    316    316    317    Any
                //  309    316    309    310    Any
                //  310    316    309    310    Ljava/lang/ArrayIndexOutOfBoundsException;
                //  309    316    309    310    Any
                //  309    316    3      8      Ljava/lang/IndexOutOfBoundsException;
                //  368    375    375    376    Any
                //  369    375    368    369    Any
                //  368    375    375    376    Any
                //  368    375    368    369    Ljava/lang/AssertionError;
                //  368    375    368    369    Any
                //  388    395    395    396    Any
                //  389    395    3      8      Ljava/lang/EnumConstantNotPresentException;
                //  388    395    388    389    Any
                //  389    395    3      8      Ljava/lang/ArithmeticException;
                //  389    395    388    389    Ljava/lang/ArithmeticException;
                //  399    406    406    407    Any
                //  400    406    399    400    Any
                //  399    406    406    407    Any
                //  399    406    3      8      Any
                //  400    406    399    400    Any
                //  413    420    420    421    Any
                //  414    420    413    414    Ljava/lang/ArrayIndexOutOfBoundsException;
                //  413    420    413    414    Ljava/lang/AssertionError;
                //  413    420    413    414    Ljava/lang/IllegalStateException;
                //  414    420    420    421    Any
                //  516    523    523    524    Any
                //  517    523    3      8      Any
                //  517    523    3      8      Any
                //  516    523    516    517    Any
                //  517    523    516    517    Ljava/lang/NumberFormatException;
                //  529    536    536    537    Any
                //  529    536    3      8      Any
                //  530    536    536    537    Any
                //  530    536    529    530    Any
                //  529    536    536    537    Any
                //  587    594    594    595    Any
                //  588    594    3      8      Ljava/lang/ArithmeticException;
                //  588    594    3      8      Ljava/lang/NegativeArraySizeException;
                //  587    594    587    588    Ljava/lang/StringIndexOutOfBoundsException;
                //  587    594    587    588    Any
                //  603    610    610    611    Any
                //  604    610    3      8      Any
                //  603    610    603    604    Ljava/lang/IllegalStateException;
                //  603    610    603    604    Any
                //  603    610    3      8      Any
                //  659    666    666    667    Any
                //  660    666    666    667    Any
                //  659    666    659    660    Any
                //  659    666    3      8      Any
                //  660    666    659    660    Ljava/lang/NullPointerException;
                //  670    677    677    678    Any
                //  671    677    670    671    Any
                //  670    677    677    678    Any
                //  670    677    670    671    Any
                //  671    677    677    678    Ljava/lang/ArithmeticException;
                //  683    692    692    693    Any
                //  683    692    3      8      Ljava/util/NoSuchElementException;
                //  683    692    3      8      Any
                //  684    692    683    684    Ljava/lang/IllegalStateException;
                //  684    692    683    684    Ljava/lang/ArithmeticException;
                //  739    748    748    749    Any
                //  739    748    739    740    Any
                //  739    748    739    740    Ljava/lang/NumberFormatException;
                //  739    748    748    749    Ljava/lang/ArrayIndexOutOfBoundsException;
                //  740    748    739    740    Any
                //  799    808    808    809    Any
                //  800    808    3      8      Any
                //  799    808    799    800    Ljava/lang/IllegalArgumentException;
                //  800    808    808    809    Ljava/lang/RuntimeException;
                //  799    808    3      8      Any
                //  817    826    826    827    Any
                //  817    826    817    818    Any
                //  818    826    826    827    Any
                //  817    826    3      8      Ljava/lang/IndexOutOfBoundsException;
                //  817    826    3      8      Ljava/lang/IllegalStateException;
                //  883    890    890    891    Any
                //  883    890    883    884    Ljava/util/NoSuchElementException;
                //  884    890    890    891    Any
                //  883    890    890    891    Any
                //  883    890    890    891    Any
                //  935    942    942    943    Any
                //  936    942    935    936    Ljava/lang/IndexOutOfBoundsException;
                //  936    942    942    943    Ljava/lang/NegativeArraySizeException;
                //  936    942    935    936    Any
                //  936    942    3      8      Ljava/lang/ClassCastException;
                //  953    960    960    961    Any
                //  953    960    953    954    Ljava/lang/ArithmeticException;
                //  953    960    960    961    Ljava/lang/NegativeArraySizeException;
                //  953    960    960    961    Ljava/lang/IllegalStateException;
                //  954    960    960    961    Ljava/lang/NumberFormatException;
                //  974    981    981    982    Any
                //  975    981    3      8      Any
                //  974    981    974    975    Any
                //  974    981    974    975    Any
                //  975    981    3      8      Any
                //  1027   1034   1034   1035   Any
                //  1027   1034   1027   1028   Ljava/lang/ArrayIndexOutOfBoundsException;
                //  1027   1034   1027   1028   Ljava/lang/AssertionError;
                //  1028   1034   1027   1028   Ljava/lang/NullPointerException;
                //  1028   1034   3      8      Any
                //  1050   1057   1057   1058   Any
                //  1050   1057   3      8      Any
                //  1051   1057   1057   1058   Ljava/lang/NullPointerException;
                //  1050   1057   1050   1051   Ljava/lang/NumberFormatException;
                //  1050   1057   1057   1058   Ljava/lang/NumberFormatException;
                //  1067   1074   1074   1075   Any
                //  1067   1074   1067   1068   Any
                //  1067   1074   1074   1075   Any
                //  1068   1074   3      8      Any
                //  1067   1074   1074   1075   Ljava/util/ConcurrentModificationException;
                //  1079   1086   1086   1087   Any
                //  1079   1086   3      8      Ljava/lang/UnsupportedOperationException;
                //  1080   1086   1079   1080   Any
                //  1080   1086   3      8      Ljava/lang/NumberFormatException;
                //  1079   1086   1079   1080   Any
                //  1135   1144   1144   1145   Any
                //  1136   1144   1144   1145   Ljava/lang/StringIndexOutOfBoundsException;
                //  1135   1144   3      8      Any
                //  1136   1144   3      8      Ljava/lang/RuntimeException;
                //  1135   1144   1135   1136   Any
                //  1148   1155   1155   1156   Any
                //  1149   1155   3      8      Ljava/lang/UnsupportedOperationException;
                //  1148   1155   1148   1149   Ljava/lang/ArithmeticException;
                //  1148   1155   1155   1156   Any
                //  1148   1155   3      8      Any
                //  1161   1168   1168   1169   Any
                //  1161   1168   1168   1169   Any
                //  1162   1168   3      8      Any
                //  1161   1168   1161   1162   Any
                //  1161   1168   1168   1169   Ljava/lang/NullPointerException;
                //  1174   1181   1181   1182   Any
                //  1175   1181   1174   1175   Any
                //  1174   1181   3      8      Any
                //  1175   1181   3      8      Any
                //  1175   1181   1181   1182   Ljava/lang/AssertionError;
                //  1185   1192   1192   1193   Any
                //  1185   1192   3      8      Any
                //  1186   1192   3      8      Any
                //  1185   1192   1192   1193   Ljava/lang/EnumConstantNotPresentException;
                //  1185   1192   1185   1186   Any
                //  1243   1250   1250   1251   Any
                //  1243   1250   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
                //  1243   1250   1243   1244   Ljava/lang/NegativeArraySizeException;
                //  1244   1250   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
                //  1243   1250   1243   1244   Ljava/util/ConcurrentModificationException;
                //  1257   1264   1264   1265   Any
                //  1257   1264   3      8      Ljava/util/ConcurrentModificationException;
                //  1258   1264   1264   1265   Any
                //  1258   1264   1257   1258   Ljava/lang/ClassCastException;
                //  1258   1264   1257   1258   Ljava/lang/IllegalStateException;
                //  1317   1325   1325   1326   Any
                //  1317   1325   3      8      Any
                //  1317   1325   3      8      Any
                //  1317   1325   3      8      Any
                //  1317   1325   1325   1326   Ljava/lang/IllegalArgumentException;
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
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:670)
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
            
            public f25(final CommandDispatcher c) {
                this.c = c;
            }
            
            static {
                throw t;
            }
        }
        public class f24 implements SuggestionProvider
        {
            public CommandDispatcher c;
            
            static {
                throw t;
            }
            
            @Override
            public CompletableFuture getSuggestions(@NotNull final CommandContext p0, @NotNull final SuggestionsBuilder p1) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          2152
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.c:I
                //    12: iflt            2144
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            2136
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: aload_1        
                //    25: pop            
                //    26: aload_2        
                //    27: pop            
                //    28: aload_2        
                //    29: goto            33
                //    32: athrow         
                //    33: invokevirtual   com/mojang/brigadier/suggestion/SuggestionsBuilder.getRemaining:()Ljava/lang/String;
                //    36: goto            40
                //    39: athrow         
                //    40: astore_3       
                //    41: getstatic       dev/nuker/pyro/fc.c:I
                //    44: ifge            52
                //    47: ldc             603715078
                //    49: goto            54
                //    52: ldc             -532955704
                //    54: ldc             -582289343
                //    56: ixor           
                //    57: lookupswitch {
                //          -21950905: 52
                //          1030833545: 84
                //          default: 2075
                //        }
                //    84: aload_3        
                //    85: dup            
                //    86: pop            
                //    87: checkcast       Ljava/lang/CharSequence;
                //    90: ldc             " "
                //    92: iconst_0       
                //    93: iconst_0       
                //    94: bipush          6
                //    96: aconst_null    
                //    97: goto            101
                //   100: athrow         
                //   101: invokestatic    kotlin/text/StringsKt.lastIndexOf$default:(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I
                //   104: goto            108
                //   107: athrow         
                //   108: iconst_m1      
                //   109: if_icmpne       117
                //   112: ldc             ""
                //   114: goto            337
                //   117: aload_3        
                //   118: getstatic       dev/nuker/pyro/fc.1:I
                //   121: ifeq            129
                //   124: ldc             1215266713
                //   126: goto            131
                //   129: ldc             2060414877
                //   131: ldc             -1930321361
                //   133: ixor           
                //   134: lookupswitch {
                //          -996221514: 2067
                //          1909715386: 129
                //          default: 160
                //        }
                //   160: astore          4
                //   162: iconst_0       
                //   163: istore          5
                //   165: aload_3        
                //   166: checkcast       Ljava/lang/CharSequence;
                //   169: ldc             " "
                //   171: iconst_0       
                //   172: iconst_0       
                //   173: bipush          6
                //   175: aconst_null    
                //   176: goto            180
                //   179: athrow         
                //   180: invokestatic    kotlin/text/StringsKt.lastIndexOf$default:(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I
                //   183: goto            187
                //   186: athrow         
                //   187: istore          6
                //   189: iconst_0       
                //   190: getstatic       dev/nuker/pyro/fc.1:I
                //   193: ifeq            201
                //   196: ldc             2097734809
                //   198: goto            203
                //   201: ldc             1282713583
                //   203: ldc             -1979646209
                //   205: ixor           
                //   206: lookupswitch {
                //          -667067949: 201
                //          -150463898: 2077
                //          default: 232
                //        }
                //   232: istore          7
                //   234: getstatic       dev/nuker/pyro/fc.c:I
                //   237: ifge            245
                //   240: ldc             978432016
                //   242: goto            247
                //   245: ldc             -1932974750
                //   247: ldc             547905214
                //   249: ixor           
                //   250: lookupswitch {
                //          -1402897444: 276
                //          452587182: 245
                //          default: 2073
                //        }
                //   276: aload           4
                //   278: getstatic       dev/nuker/pyro/fc.1:I
                //   281: ifeq            289
                //   284: ldc             -919159968
                //   286: goto            291
                //   289: ldc             -1328481251
                //   291: ldc             -1554172277
                //   293: ixor           
                //   294: lookupswitch {
                //          328059542: 320
                //          1785433579: 289
                //          default: 2103
                //        }
                //   320: iload           5
                //   322: iload           6
                //   324: goto            328
                //   327: athrow         
                //   328: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
                //   331: goto            335
                //   334: athrow         
                //   335: dup            
                //   336: pop            
                //   337: getstatic       dev/nuker/pyro/fc.0:I
                //   340: ifeq            348
                //   343: ldc             1863817701
                //   345: goto            350
                //   348: ldc             -1389902061
                //   350: ldc             -1075265561
                //   352: ixor           
                //   353: lookupswitch {
                //          -788584958: 2109
                //          -101054717: 348
                //          default: 380
                //        }
                //   380: astore_3       
                //   381: aload_0        
                //   382: getfield        dev/nuker/pyro/f24.c:Lcom/mojang/brigadier/CommandDispatcher;
                //   385: getstatic       dev/nuker/pyro/fc.0:I
                //   388: ifeq            396
                //   391: ldc             -287388225
                //   393: goto            398
                //   396: ldc             1327627749
                //   398: ldc             -1703457789
                //   400: ixor           
                //   401: lookupswitch {
                //          -1182825018: 396
                //          1957265852: 2123
                //          default: 428
                //        }
                //   428: aload_3        
                //   429: aload_1        
                //   430: goto            434
                //   433: athrow         
                //   434: invokevirtual   com/mojang/brigadier/context/CommandContext.getSource:()Ljava/lang/Object;
                //   437: goto            441
                //   440: athrow         
                //   441: getstatic       dev/nuker/pyro/fc.0:I
                //   444: ifeq            452
                //   447: ldc             -216022606
                //   449: goto            454
                //   452: ldc             -46146880
                //   454: ldc             -201571516
                //   456: ixor           
                //   457: lookupswitch {
                //          14910198: 452
                //          247699844: 484
                //          default: 2113
                //        }
                //   484: goto            488
                //   487: athrow         
                //   488: invokevirtual   com/mojang/brigadier/CommandDispatcher.parse:(Ljava/lang/String;Ljava/lang/Object;)Lcom/mojang/brigadier/ParseResults;
                //   491: goto            495
                //   494: athrow         
                //   495: astore          4
                //   497: aload           4
                //   499: dup            
                //   500: pop            
                //   501: goto            505
                //   504: athrow         
                //   505: invokevirtual   com/mojang/brigadier/ParseResults.getContext:()Lcom/mojang/brigadier/context/CommandContextBuilder;
                //   508: goto            512
                //   511: athrow         
                //   512: dup            
                //   513: pop            
                //   514: goto            518
                //   517: athrow         
                //   518: invokevirtual   com/mojang/brigadier/context/CommandContextBuilder.getNodes:()Ljava/util/List;
                //   521: goto            525
                //   524: athrow         
                //   525: goto            529
                //   528: athrow         
                //   529: invokeinterface java/util/List.isEmpty:()Z
                //   534: goto            538
                //   537: athrow         
                //   538: ifeq            733
                //   541: getstatic       dev/nuker/pyro/fc.0:I
                //   544: ifeq            552
                //   547: ldc             645664851
                //   549: goto            554
                //   552: ldc             -995134617
                //   554: ldc             -1131158399
                //   556: ixor           
                //   557: lookupswitch {
                //          -1695550254: 2121
                //          562439377: 552
                //          default: 584
                //        }
                //   584: aload_3        
                //   585: checkcast       Ljava/lang/CharSequence;
                //   588: astore          5
                //   590: iconst_0       
                //   591: istore          6
                //   593: aload           5
                //   595: getstatic       dev/nuker/pyro/fc.c:I
                //   598: ifge            606
                //   601: ldc             -697496618
                //   603: goto            608
                //   606: ldc             -1679439523
                //   608: ldc             -1147820207
                //   610: ixor           
                //   611: lookupswitch {
                //          544239116: 636
                //          1845013639: 606
                //          default: 2095
                //        }
                //   636: goto            640
                //   639: athrow         
                //   640: invokeinterface java/lang/CharSequence.length:()I
                //   645: goto            649
                //   648: athrow         
                //   649: ifne            656
                //   652: iconst_1       
                //   653: goto            657
                //   656: iconst_0       
                //   657: ifne            733
                //   660: getstatic       dev/nuker/pyro/f26.c:Ldev/nuker/pyro/f26;
                //   663: goto            667
                //   666: athrow         
                //   667: invokestatic    dev/nuker/pyro/f26.c:(Ldev/nuker/pyro/f26;)Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;
                //   670: goto            674
                //   673: athrow         
                //   674: getstatic       dev/nuker/pyro/fc.1:I
                //   677: ifeq            685
                //   680: ldc             -1295135539
                //   682: goto            687
                //   685: ldc             -71576182
                //   687: ldc             -1160174831
                //   689: ixor           
                //   690: lookupswitch {
                //          135589852: 685
                //          1097004699: 716
                //          default: 2093
                //        }
                //   716: goto            720
                //   719: athrow         
                //   720: invokevirtual   com/mojang/brigadier/exceptions/SimpleCommandExceptionType.create:()Lcom/mojang/brigadier/exceptions/CommandSyntaxException;
                //   723: goto            727
                //   726: athrow         
                //   727: dup            
                //   728: pop            
                //   729: checkcast       Ljava/lang/Throwable;
                //   732: athrow         
                //   733: getstatic       dev/nuker/pyro/fc.c:I
                //   736: ifge            744
                //   739: ldc             -2130157778
                //   741: goto            746
                //   744: ldc             706009851
                //   746: ldc             420703650
                //   748: ixor           
                //   749: lookupswitch {
                //          -1743048052: 2119
                //          556080647: 744
                //          default: 776
                //        }
                //   776: aload_3        
                //   777: checkcast       Ljava/lang/CharSequence;
                //   780: astore          6
                //   782: iconst_0       
                //   783: getstatic       dev/nuker/pyro/fc.1:I
                //   786: ifeq            794
                //   789: ldc             -2048256886
                //   791: goto            796
                //   794: ldc             -1433814620
                //   796: ldc             100598319
                //   798: ixor           
                //   799: lookupswitch {
                //          -2146101595: 794
                //          -1351173237: 824
                //          default: 2097
                //        }
                //   824: istore          7
                //   826: aload           6
                //   828: getstatic       dev/nuker/pyro/fc.1:I
                //   831: ifeq            839
                //   834: ldc             509575038
                //   836: goto            841
                //   839: ldc             405854526
                //   841: ldc             672427745
                //   843: ixor           
                //   844: lookupswitch {
                //          676054033: 839
                //          910889375: 2089
                //          default: 872
                //        }
                //   872: goto            876
                //   875: athrow         
                //   876: invokeinterface java/lang/CharSequence.length:()I
                //   881: goto            885
                //   884: athrow         
                //   885: ifne            893
                //   888: ldc             1822370427
                //   890: goto            895
                //   893: ldc             1822370428
                //   895: ldc             493721200
                //   897: ixor           
                //   898: tableswitch {
                //          -471500778: 920
                //          -471500777: 924
                //          default: 888
                //        }
                //   920: iconst_1       
                //   921: goto            925
                //   924: iconst_0       
                //   925: ifeq            933
                //   928: ldc             1403881855
                //   930: goto            935
                //   933: ldc             1403881852
                //   935: ldc             1627315702
                //   937: ixor           
                //   938: tableswitch {
                //          1722198290: 960
                //          1722198291: 1026
                //          default: 928
                //        }
                //   960: aload_0        
                //   961: getstatic       dev/nuker/pyro/fc.c:I
                //   964: ifge            972
                //   967: ldc             28330464
                //   969: goto            974
                //   972: ldc             -1684806537
                //   974: ldc             1381483339
                //   976: ixor           
                //   977: lookupswitch {
                //          -909891780: 1004
                //          1407683243: 972
                //          default: 2069
                //        }
                //  1004: getfield        dev/nuker/pyro/f24.c:Lcom/mojang/brigadier/CommandDispatcher;
                //  1007: goto            1011
                //  1010: athrow         
                //  1011: invokevirtual   com/mojang/brigadier/CommandDispatcher.getRoot:()Lcom/mojang/brigadier/tree/RootCommandNode;
                //  1014: goto            1018
                //  1017: athrow         
                //  1018: dup            
                //  1019: pop            
                //  1020: checkcast       Lcom/mojang/brigadier/tree/CommandNode;
                //  1023: goto            1209
                //  1026: getstatic       dev/nuker/pyro/fc.1:I
                //  1029: ifeq            1037
                //  1032: ldc             1085001241
                //  1034: goto            1039
                //  1037: ldc             707138987
                //  1039: ldc             -1464239140
                //  1041: ixor           
                //  1042: lookupswitch {
                //          -401427003: 2125
                //          445664211: 1037
                //          default: 1068
                //        }
                //  1068: aload           4
                //  1070: getstatic       dev/nuker/pyro/fc.0:I
                //  1073: ifeq            1081
                //  1076: ldc             454627602
                //  1078: goto            1083
                //  1081: ldc             -1422032555
                //  1083: ldc             -1220880891
                //  1085: ixor           
                //  1086: lookupswitch {
                //          -1406941417: 1081
                //          470243152: 1112
                //          default: 2081
                //        }
                //  1112: goto            1116
                //  1115: athrow         
                //  1116: invokevirtual   com/mojang/brigadier/ParseResults.getContext:()Lcom/mojang/brigadier/context/CommandContextBuilder;
                //  1119: goto            1123
                //  1122: athrow         
                //  1123: dup            
                //  1124: pop            
                //  1125: goto            1129
                //  1128: athrow         
                //  1129: invokevirtual   com/mojang/brigadier/context/CommandContextBuilder.getNodes:()Ljava/util/List;
                //  1132: goto            1136
                //  1135: athrow         
                //  1136: checkcast       Ljava/lang/Iterable;
                //  1139: getstatic       dev/nuker/pyro/fc.0:I
                //  1142: ifeq            1150
                //  1145: ldc             95934588
                //  1147: goto            1152
                //  1150: ldc             50995069
                //  1152: ldc             951543238
                //  1154: ixor           
                //  1155: lookupswitch {
                //          -1347071292: 1150
                //          1023458746: 2107
                //          default: 1180
                //        }
                //  1180: goto            1184
                //  1183: athrow         
                //  1184: invokestatic    com/google/common/collect/Iterables.getLast:(Ljava/lang/Iterable;)Ljava/lang/Object;
                //  1187: goto            1191
                //  1190: athrow         
                //  1191: dup            
                //  1192: pop            
                //  1193: checkcast       Lcom/mojang/brigadier/context/ParsedCommandNode;
                //  1196: goto            1200
                //  1199: athrow         
                //  1200: invokevirtual   com/mojang/brigadier/context/ParsedCommandNode.getNode:()Lcom/mojang/brigadier/tree/CommandNode;
                //  1203: goto            1207
                //  1206: athrow         
                //  1207: dup            
                //  1208: pop            
                //  1209: getstatic       dev/nuker/pyro/fc.c:I
                //  1212: ifge            1220
                //  1215: ldc             220276368
                //  1217: goto            1222
                //  1220: ldc             -1659390763
                //  1222: ldc             -1734780418
                //  1224: ixor           
                //  1225: lookupswitch {
                //          -1783070866: 2079
                //          -1009528973: 1220
                //          default: 1252
                //        }
                //  1252: astore          5
                //  1254: aload           5
                //  1256: goto            1260
                //  1259: athrow         
                //  1260: invokevirtual   com/mojang/brigadier/tree/CommandNode.getChildren:()Ljava/util/Collection;
                //  1263: goto            1267
                //  1266: athrow         
                //  1267: goto            1271
                //  1270: athrow         
                //  1271: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
                //  1276: goto            1280
                //  1279: athrow         
                //  1280: astore          7
                //  1282: getstatic       dev/nuker/pyro/fc.0:I
                //  1285: ifeq            1293
                //  1288: ldc             759944228
                //  1290: goto            1295
                //  1293: ldc             -1624274717
                //  1295: ldc             -161854389
                //  1297: ixor           
                //  1298: lookupswitch {
                //          -619603857: 1293
                //          1769325736: 1324
                //          default: 2111
                //        }
                //  1324: aload           7
                //  1326: goto            1330
                //  1329: athrow         
                //  1330: invokeinterface java/util/Iterator.hasNext:()Z
                //  1335: goto            1339
                //  1338: athrow         
                //  1339: ifeq            2054
                //  1342: aload           7
                //  1344: getstatic       dev/nuker/pyro/fc.1:I
                //  1347: ifeq            1355
                //  1350: ldc             1491412993
                //  1352: goto            1357
                //  1355: ldc             -637128679
                //  1357: ldc             2024442175
                //  1359: ixor           
                //  1360: lookupswitch {
                //          -1565738714: 1388
                //          542089534: 1355
                //          default: 2083
                //        }
                //  1388: goto            1392
                //  1391: athrow         
                //  1392: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                //  1397: goto            1401
                //  1400: athrow         
                //  1401: checkcast       Lcom/mojang/brigadier/tree/CommandNode;
                //  1404: astore          6
                //  1406: aload           6
                //  1408: dup            
                //  1409: pop            
                //  1410: goto            1414
                //  1413: athrow         
                //  1414: invokevirtual   com/mojang/brigadier/tree/CommandNode.getName:()Ljava/lang/String;
                //  1417: goto            1421
                //  1420: athrow         
                //  1421: dup            
                //  1422: pop            
                //  1423: aload_2        
                //  1424: goto            1428
                //  1427: athrow         
                //  1428: invokevirtual   com/mojang/brigadier/suggestion/SuggestionsBuilder.getRemaining:()Ljava/lang/String;
                //  1431: goto            1435
                //  1434: athrow         
                //  1435: dup            
                //  1436: pop            
                //  1437: getstatic       dev/nuker/pyro/fc.0:I
                //  1440: ifeq            1448
                //  1443: ldc             -1340876898
                //  1445: goto            1450
                //  1448: ldc             -1004995621
                //  1450: ldc             -171242894
                //  1452: ixor           
                //  1453: lookupswitch {
                //          835973545: 1480
                //          1171840492: 1448
                //          default: 2091
                //        }
                //  1480: astore          8
                //  1482: aload_3        
                //  1483: goto            1487
                //  1486: athrow         
                //  1487: invokevirtual   java/lang/String.length:()I
                //  1490: goto            1494
                //  1493: athrow         
                //  1494: aload_3        
                //  1495: checkcast       Ljava/lang/CharSequence;
                //  1498: astore          9
                //  1500: istore          12
                //  1502: astore          11
                //  1504: iconst_0       
                //  1505: istore          10
                //  1507: aload           9
                //  1509: goto            1513
                //  1512: athrow         
                //  1513: invokeinterface java/lang/CharSequence.length:()I
                //  1518: goto            1522
                //  1521: athrow         
                //  1522: ifne            1529
                //  1525: iconst_1       
                //  1526: goto            1530
                //  1529: iconst_0       
                //  1530: istore          13
                //  1532: getstatic       dev/nuker/pyro/fc.0:I
                //  1535: ifeq            1543
                //  1538: ldc             682508634
                //  1540: goto            1545
                //  1543: ldc             -1770600325
                //  1545: ldc             -486411274
                //  1547: ixor           
                //  1548: lookupswitch {
                //          -1079154530: 1543
                //          -877677908: 2071
                //          default: 1576
                //        }
                //  1576: aload           11
                //  1578: iload           12
                //  1580: iload           13
                //  1582: ifeq            1590
                //  1585: ldc             1439331206
                //  1587: goto            1592
                //  1590: ldc             1439331205
                //  1592: ldc             674956243
                //  1594: ixor           
                //  1595: tableswitch {
                //          -69017430: 1616
                //          -69017429: 1620
                //          default: 1585
                //        }
                //  1616: iconst_0       
                //  1617: goto            1621
                //  1620: iconst_1       
                //  1621: iadd           
                //  1622: getstatic       dev/nuker/pyro/fc.1:I
                //  1625: ifeq            1634
                //  1628: ldc_w           -359034430
                //  1631: goto            1637
                //  1634: ldc_w           -320617157
                //  1637: ldc_w           -757339756
                //  1640: ixor           
                //  1641: lookupswitch {
                //          943880278: 1634
                //          1043868847: 1668
                //          default: 2099
                //        }
                //  1668: istore          9
                //  1670: astore          11
                //  1672: iconst_0       
                //  1673: istore          10
                //  1675: aload           8
                //  1677: dup            
                //  1678: ifnonnull       1756
                //  1681: new             Lkotlin/TypeCastException;
                //  1684: dup            
                //  1685: ldc_w           "\u236e\u1486\u8a75\u0c1e\u0ca8\ued65\ub225\ue65a\u66ad\u2c94\ua7b2\u1e0c\ue172\u7a69\u445c\u89fe\u57a5\u7782\u02e2\u0567\u2b86\uc234\u6ad9\u9293\u12f6\u350b\u7d66\u8934\u3fcf\u49b0\u842c\ufb72\u7052\u25c4\udebe\uf1e2\u493c\u88ff\u754c\u3a1a\ub659\u41bd\ub96c\u0c82\u8950\u8a72\u7c27\uce82\uc291\u2ffb\ue651\u16d6\ueec5"
                //  1688: goto            1692
                //  1691: athrow         
                //  1692: invokestatic    invokestatic   !!! ERROR
                //  1695: goto            1699
                //  1698: athrow         
                //  1699: getstatic       dev/nuker/pyro/fc.c:I
                //  1702: ifge            1711
                //  1705: ldc_w           -267456826
                //  1708: goto            1714
                //  1711: ldc_w           -1033414239
                //  1714: ldc_w           -637935512
                //  1717: ixor           
                //  1718: lookupswitch {
                //          46486989: 1711
                //          704057006: 2101
                //          default: 1744
                //        }
                //  1744: goto            1748
                //  1747: athrow         
                //  1748: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
                //  1751: goto            1755
                //  1754: athrow         
                //  1755: athrow         
                //  1756: iload           9
                //  1758: goto            1762
                //  1761: athrow         
                //  1762: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
                //  1765: goto            1769
                //  1768: athrow         
                //  1769: dup            
                //  1770: pop            
                //  1771: astore          12
                //  1773: getstatic       dev/nuker/pyro/fc.c:I
                //  1776: ifge            1785
                //  1779: ldc_w           2112448691
                //  1782: goto            1788
                //  1785: ldc_w           1398867553
                //  1788: ldc_w           -652624170
                //  1791: ixor           
                //  1792: lookupswitch {
                //          -1527720347: 2105
                //          113387962: 1785
                //          default: 1820
                //        }
                //  1820: aload           11
                //  1822: getstatic       dev/nuker/pyro/fc.c:I
                //  1825: ifge            1834
                //  1828: ldc_w           -449964628
                //  1831: goto            1837
                //  1834: ldc_w           -148955864
                //  1837: ldc_w           -1326022896
                //  1840: ixor           
                //  1841: lookupswitch {
                //          1206477368: 1868
                //          1440246460: 1834
                //          default: 2085
                //        }
                //  1868: aload           12
                //  1870: iconst_0       
                //  1871: iconst_2       
                //  1872: aconst_null    
                //  1873: getstatic       dev/nuker/pyro/fc.c:I
                //  1876: ifge            1885
                //  1879: ldc_w           -796545580
                //  1882: goto            1888
                //  1885: ldc_w           -2016516526
                //  1888: ldc_w           1313090032
                //  1891: ixor           
                //  1892: lookupswitch {
                //          -1631484892: 2117
                //          -637035305: 1885
                //          default: 1920
                //        }
                //  1920: goto            1924
                //  1923: athrow         
                //  1924: invokestatic    kotlin/text/StringsKt.startsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
                //  1927: goto            1931
                //  1930: athrow         
                //  1931: ifeq            2051
                //  1934: getstatic       dev/nuker/pyro/fc.1:I
                //  1937: ifeq            1946
                //  1940: ldc_w           -668594501
                //  1943: goto            1949
                //  1946: ldc_w           360728949
                //  1949: ldc_w           -1761717124
                //  1952: ixor           
                //  1953: lookupswitch {
                //          -1496068224: 1946
                //          1322801863: 2115
                //          default: 1980
                //        }
                //  1980: aload_2        
                //  1981: aload           6
                //  1983: getstatic       dev/nuker/pyro/fc.c:I
                //  1986: ifge            1995
                //  1989: ldc_w           222164588
                //  1992: goto            1998
                //  1995: ldc_w           352986098
                //  1998: ldc_w           1132532987
                //  2001: ixor           
                //  2002: lookupswitch {
                //          1321001623: 1995
                //          1451964169: 2028
                //          default: 2087
                //        }
                //  2028: goto            2032
                //  2031: athrow         
                //  2032: invokevirtual   com/mojang/brigadier/tree/CommandNode.getName:()Ljava/lang/String;
                //  2035: goto            2039
                //  2038: athrow         
                //  2039: goto            2043
                //  2042: athrow         
                //  2043: invokevirtual   com/mojang/brigadier/suggestion/SuggestionsBuilder.suggest:(Ljava/lang/String;)Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;
                //  2046: goto            2050
                //  2049: athrow         
                //  2050: pop            
                //  2051: goto            1282
                //  2054: aload_2        
                //  2055: goto            2059
                //  2058: athrow         
                //  2059: invokevirtual   com/mojang/brigadier/suggestion/SuggestionsBuilder.buildFuture:()Ljava/util/concurrent/CompletableFuture;
                //  2062: goto            2066
                //  2065: athrow         
                //  2066: areturn        
                //  2067: aconst_null    
                //  2068: athrow         
                //  2069: aconst_null    
                //  2070: athrow         
                //  2071: aconst_null    
                //  2072: athrow         
                //  2073: aconst_null    
                //  2074: athrow         
                //  2075: aconst_null    
                //  2076: athrow         
                //  2077: aconst_null    
                //  2078: athrow         
                //  2079: aconst_null    
                //  2080: athrow         
                //  2081: aconst_null    
                //  2082: athrow         
                //  2083: aconst_null    
                //  2084: athrow         
                //  2085: aconst_null    
                //  2086: athrow         
                //  2087: aconst_null    
                //  2088: athrow         
                //  2089: aconst_null    
                //  2090: athrow         
                //  2091: aconst_null    
                //  2092: athrow         
                //  2093: aconst_null    
                //  2094: athrow         
                //  2095: aconst_null    
                //  2096: athrow         
                //  2097: aconst_null    
                //  2098: athrow         
                //  2099: aconst_null    
                //  2100: athrow         
                //  2101: aconst_null    
                //  2102: athrow         
                //  2103: aconst_null    
                //  2104: athrow         
                //  2105: aconst_null    
                //  2106: athrow         
                //  2107: aconst_null    
                //  2108: athrow         
                //  2109: aconst_null    
                //  2110: athrow         
                //  2111: aconst_null    
                //  2112: athrow         
                //  2113: aconst_null    
                //  2114: athrow         
                //  2115: aconst_null    
                //  2116: athrow         
                //  2117: aconst_null    
                //  2118: athrow         
                //  2119: aconst_null    
                //  2120: athrow         
                //  2121: aconst_null    
                //  2122: athrow         
                //  2123: aconst_null    
                //  2124: athrow         
                //  2125: aconst_null    
                //  2126: athrow         
                //  2127: pop            
                //  2128: goto            24
                //  2131: pop            
                //  2132: aconst_null    
                //  2133: goto            2127
                //  2136: dup            
                //  2137: ifnull          2127
                //  2140: checkcast       Ljava/lang/Throwable;
                //  2143: athrow         
                //  2144: dup            
                //  2145: ifnull          2131
                //  2148: checkcast       Ljava/lang/Throwable;
                //  2151: athrow         
                //  2152: aconst_null    
                //  2153: athrow         
                //    StackMapTable: 01 22 43 07 00 39 04 FF 00 0B 00 00 00 01 07 00 39 FE 00 03 07 00 03 07 00 70 07 00 3B 47 07 00 39 40 07 00 3B 45 07 00 39 40 07 00 5F FC 00 0B 07 00 5F 41 01 1D 4F 07 00 39 FF 00 00 00 04 07 00 03 07 00 70 07 00 3B 07 00 5F 00 06 07 00 44 07 00 5F 01 01 01 05 45 07 00 39 40 01 08 4B 07 00 5F FF 00 01 00 04 07 00 03 07 00 70 07 00 3B 07 00 5F 00 02 07 00 5F 01 5C 07 00 5F FF 00 12 00 06 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 5F 01 00 01 07 00 18 FF 00 00 00 06 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 5F 01 00 06 07 00 44 07 00 5F 01 01 01 05 45 07 00 39 40 01 FF 00 0D 00 07 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 5F 01 01 00 01 01 FF 00 01 00 07 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 5F 01 01 00 02 01 01 5C 01 FC 00 0C 01 41 01 1C 4C 07 00 5F FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 5F 01 01 01 00 02 07 00 5F 01 5C 07 00 5F 46 07 00 39 FF 00 00 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 5F 01 01 01 00 03 07 00 5F 01 01 45 07 00 39 40 07 00 5F FF 00 01 00 04 07 00 03 07 00 70 07 00 3B 07 00 5F 00 01 07 00 5F 4A 07 00 5F FF 00 01 00 04 07 00 03 07 00 70 07 00 3B 07 00 5F 00 02 07 00 5F 01 5D 07 00 5F 4F 07 00 79 FF 00 01 00 04 07 00 03 07 00 70 07 00 3B 07 00 5F 00 02 07 00 79 01 5D 07 00 79 44 07 00 20 FF 00 00 00 04 07 00 03 07 00 70 07 00 3B 07 00 5F 00 03 07 00 79 07 00 5F 07 00 70 45 07 00 39 FF 00 00 00 04 07 00 03 07 00 70 07 00 3B 07 00 5F 00 03 07 00 79 07 00 5F 07 00 05 FF 00 0A 00 04 07 00 03 07 00 70 07 00 3B 07 00 5F 00 03 07 00 79 07 00 5F 07 00 05 FF 00 01 00 04 07 00 03 07 00 70 07 00 3B 07 00 5F 00 04 07 00 79 07 00 5F 07 00 05 01 FF 00 1D 00 04 07 00 03 07 00 70 07 00 3B 07 00 5F 00 03 07 00 79 07 00 5F 07 00 05 FF 00 02 00 00 00 01 07 00 39 FF 00 00 00 04 07 00 03 07 00 70 07 00 3B 07 00 5F 00 03 07 00 79 07 00 5F 07 00 05 45 07 00 39 40 07 00 7F FF 00 08 00 05 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 01 07 00 39 40 07 00 7F 45 07 00 39 40 07 00 85 FF 00 04 00 00 00 01 07 00 39 FF 00 00 00 05 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 01 07 00 85 45 07 00 39 40 07 00 8B 42 07 00 28 40 07 00 8B 47 07 00 39 40 01 0D 41 01 1D FF 00 15 00 07 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 44 01 00 01 07 00 44 FF 00 01 00 07 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 44 01 00 02 07 00 44 01 5B 07 00 44 42 07 00 39 40 07 00 44 47 07 00 39 40 01 06 40 01 48 07 00 39 40 07 00 09 45 07 00 39 40 07 00 A4 4A 07 00 A4 FF 00 01 00 07 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 44 01 00 02 07 00 A4 01 5C 07 00 A4 42 07 00 39 40 07 00 A4 45 07 00 39 40 07 01 32 F9 00 05 0A 41 01 1D FF 00 11 00 07 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 07 00 44 00 01 01 FF 00 01 00 07 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 07 00 44 00 02 01 01 5B 01 FF 00 0E 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 07 00 44 01 00 01 07 00 44 FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 07 00 44 01 00 02 07 00 44 01 5E 07 00 44 42 07 00 39 40 07 00 44 47 07 00 39 40 01 02 04 41 01 18 03 40 01 02 04 41 01 18 4B 07 00 03 FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 07 00 44 01 00 02 07 00 03 01 5D 07 00 03 45 07 00 16 40 07 00 79 45 07 00 39 40 07 01 34 07 0A 41 01 1C 4C 07 00 7F FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 07 00 44 01 00 02 07 00 7F 01 5C 07 00 7F 42 07 00 22 40 07 00 7F 45 07 00 39 40 07 00 85 44 07 00 16 40 07 00 85 45 07 00 39 40 07 00 8B 4D 07 00 C8 FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 07 00 44 01 00 02 07 00 C8 01 5B 07 00 C8 FF 00 02 00 00 00 01 07 00 39 FF 00 00 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 07 00 44 01 00 01 07 00 C8 45 07 00 39 40 07 00 05 47 07 00 39 40 07 00 D3 45 07 00 39 40 07 00 C0 41 07 00 C0 4A 07 00 C0 FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 07 00 44 01 00 02 07 00 C0 01 5D 07 00 C0 FF 00 06 00 00 00 01 07 00 39 FF 00 00 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 44 01 00 01 07 00 C0 45 07 00 39 40 07 00 E0 42 07 00 39 40 07 00 E0 47 07 00 39 40 07 00 E9 FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 05 07 00 E9 00 00 0A 41 01 1C 44 07 00 39 40 07 00 E9 47 07 00 39 40 01 4F 07 00 E9 FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 05 07 00 E9 00 02 07 00 E9 01 5E 07 00 E9 42 07 00 1E 40 07 00 E9 47 07 00 39 40 07 00 05 FF 00 0B 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 00 01 07 00 28 40 07 00 C0 45 07 00 39 40 07 00 5F FF 00 05 00 00 00 01 07 00 39 FF 00 00 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 00 02 07 00 5F 07 00 3B 45 07 00 39 FF 00 00 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 00 02 07 00 5F 07 00 5F FF 00 0C 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 00 02 07 00 5F 07 00 5F FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 00 03 07 00 5F 07 00 5F 01 FF 00 1D 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 00 02 07 00 5F 07 00 5F FF 00 05 00 00 00 01 07 00 39 FF 00 00 00 09 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 00 02 07 00 5F 07 00 5F 45 07 00 39 FF 00 00 00 09 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 00 02 07 00 5F 01 FF 00 11 00 0D 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 07 00 44 01 07 00 5F 01 00 01 07 00 39 40 07 00 44 47 07 00 39 40 01 06 40 01 FC 00 0C 01 41 01 1E FF 00 08 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 07 00 44 01 07 00 5F 01 01 00 02 07 00 5F 01 FF 00 04 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 07 00 44 01 07 00 5F 01 01 00 02 07 00 5F 01 FF 00 01 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 07 00 44 01 07 00 5F 01 01 00 03 07 00 5F 01 01 FF 00 17 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 07 00 44 01 07 00 5F 01 01 00 02 07 00 5F 01 FF 00 03 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 07 00 44 01 07 00 5F 01 01 00 02 07 00 5F 01 FF 00 00 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 07 00 44 01 07 00 5F 01 01 00 03 07 00 5F 01 01 FF 00 0C 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 07 00 44 01 07 00 5F 01 01 00 02 07 00 5F 01 FF 00 02 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 07 00 44 01 07 00 5F 01 01 00 03 07 00 5F 01 01 FF 00 1E 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 07 00 44 01 07 00 5F 01 01 00 02 07 00 5F 01 FF 00 16 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 01 01 00 01 07 00 2A FF 00 00 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 01 01 00 04 07 00 5F 08 06 91 08 06 91 07 00 5F 45 07 00 39 FF 00 00 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 01 01 00 04 07 00 5F 08 06 91 08 06 91 07 00 5F FF 00 0B 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 01 01 00 04 07 00 5F 08 06 91 08 06 91 07 00 5F FF 00 02 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 01 01 00 05 07 00 5F 08 06 91 08 06 91 07 00 5F 01 FF 00 1D 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 01 01 00 04 07 00 5F 08 06 91 08 06 91 07 00 5F 42 07 00 39 FF 00 00 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 01 01 00 04 07 00 5F 08 06 91 08 06 91 07 00 5F 45 07 00 39 FF 00 00 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 01 01 00 02 07 00 5F 07 01 04 40 07 00 5F 44 07 00 20 FF 00 00 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 01 01 00 02 07 00 5F 01 45 07 00 39 40 07 00 5F FF 00 0F 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 00 42 01 1F 4D 07 00 5F FF 00 02 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 02 07 00 5F 01 5E 07 00 5F FF 00 10 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 05 07 00 5F 07 00 5F 01 01 05 FF 00 02 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 06 07 00 5F 07 00 5F 01 01 05 01 FF 00 1F 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 05 07 00 5F 07 00 5F 01 01 05 42 07 00 14 FF 00 00 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 05 07 00 5F 07 00 5F 01 01 05 45 07 00 39 40 01 0E 42 01 1E FF 00 0E 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 02 07 00 3B 07 00 C0 FF 00 02 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 03 07 00 3B 07 00 C0 01 FF 00 1D 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 02 07 00 3B 07 00 C0 42 07 00 16 FF 00 00 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 02 07 00 3B 07 00 C0 45 07 00 39 FF 00 00 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 02 07 00 3B 07 00 5F 42 07 00 32 FF 00 00 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 02 07 00 3B 07 00 5F 45 07 00 39 40 07 00 3B 00 FF 00 02 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 05 07 00 E9 00 00 FF 00 03 00 00 00 01 07 00 39 FF 00 00 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 05 07 00 E9 00 01 07 00 3B 45 07 00 39 40 07 01 36 FF 00 00 00 04 07 00 03 07 00 70 07 00 3B 07 00 5F 00 01 07 00 5F FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 07 00 44 01 00 01 07 00 03 FF 00 01 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 07 00 44 01 07 00 5F 01 01 00 00 FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 5F 01 01 01 00 00 FF 00 01 00 04 07 00 03 07 00 70 07 00 3B 07 00 5F 00 00 FF 00 01 00 07 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 5F 01 01 00 01 01 FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 07 00 44 01 00 01 07 00 C0 41 07 00 7F FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 05 07 00 E9 00 01 07 00 E9 FF 00 01 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 01 07 00 5F FF 00 01 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 02 07 00 3B 07 00 C0 FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 07 00 44 01 00 01 07 00 44 FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 00 02 07 00 5F 07 00 5F FF 00 01 00 07 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 44 01 00 01 07 00 A4 41 07 00 44 FF 00 01 00 07 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 07 00 44 00 01 01 FF 00 01 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 07 00 44 01 07 00 5F 01 01 00 02 07 00 5F 01 FF 00 01 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 01 01 00 04 07 00 5F 08 06 91 08 06 91 07 00 5F FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 5F 01 01 01 00 01 07 00 5F FF 00 01 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 00 FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 07 00 44 01 00 01 07 00 C8 FF 00 01 00 04 07 00 03 07 00 70 07 00 3B 07 00 5F 00 01 07 00 5F FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 05 07 00 E9 00 00 FF 00 01 00 04 07 00 03 07 00 70 07 00 3B 07 00 5F 00 03 07 00 79 07 00 5F 07 00 05 FF 00 01 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 00 FF 00 01 00 0E 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 07 00 C0 07 00 C0 07 00 E9 07 00 5F 01 01 07 00 5F 07 00 5F 01 00 05 07 00 5F 07 00 5F 01 01 05 FF 00 01 00 05 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 00 01 FF 00 01 00 04 07 00 03 07 00 70 07 00 3B 07 00 5F 00 01 07 00 79 FF 00 01 00 08 07 00 03 07 00 70 07 00 3B 07 00 5F 07 00 7F 00 07 00 44 01 00 00 FF 00 01 00 03 07 00 03 07 00 70 07 00 3B 00 01 07 00 30 43 05 44 07 00 30 47 05 47 07 00 39
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                       
                //  -----  -----  -----  -----  -------------------------------------------
                //  8      20     2136   2144   Ljava/lang/UnsupportedOperationException;
                //  2136   2144   2136   2144   Ljava/lang/IllegalArgumentException;
                //  2152   2154   3      8      Any
                //  32     39     39     40     Any
                //  32     39     39     40     Ljava/lang/IllegalArgumentException;
                //  32     39     3      8      Any
                //  33     39     32     33     Any
                //  33     39     3      8      Ljava/lang/NumberFormatException;
                //  100    107    107    108    Any
                //  101    107    3      8      Any
                //  100    107    100    101    Any
                //  100    107    3      8      Ljava/lang/IllegalArgumentException;
                //  100    107    107    108    Ljava/lang/StringIndexOutOfBoundsException;
                //  179    186    186    187    Any
                //  179    186    186    187    Ljava/lang/ArithmeticException;
                //  180    186    3      8      Any
                //  179    186    186    187    Any
                //  179    186    179    180    Ljava/lang/NumberFormatException;
                //  327    334    334    335    Any
                //  327    334    334    335    Any
                //  328    334    3      8      Any
                //  328    334    3      8      Any
                //  328    334    327    328    Any
                //  433    440    440    441    Any
                //  433    440    440    441    Any
                //  434    440    3      8      Ljava/lang/UnsupportedOperationException;
                //  434    440    440    441    Ljava/lang/NullPointerException;
                //  434    440    433    434    Ljava/lang/IllegalStateException;
                //  488    494    494    495    Any
                //  488    494    494    495    Ljava/lang/IndexOutOfBoundsException;
                //  488    494    494    495    Ljava/lang/NumberFormatException;
                //  488    494    3      8      Any
                //  488    494    494    495    Any
                //  504    511    511    512    Any
                //  505    511    511    512    Any
                //  505    511    504    505    Any
                //  505    511    504    505    Any
                //  505    511    504    505    Any
                //  518    524    524    525    Any
                //  518    524    3      8      Ljava/lang/NegativeArraySizeException;
                //  518    524    3      8      Ljava/lang/IllegalArgumentException;
                //  518    524    524    525    Ljava/lang/NumberFormatException;
                //  518    524    3      8      Any
                //  528    537    537    538    Any
                //  528    537    3      8      Any
                //  529    537    537    538    Ljava/lang/ArrayIndexOutOfBoundsException;
                //  529    537    528    529    Ljava/lang/ClassCastException;
                //  528    537    537    538    Ljava/util/NoSuchElementException;
                //  639    648    648    649    Any
                //  639    648    639    640    Ljava/lang/AssertionError;
                //  639    648    639    640    Ljava/lang/ArrayIndexOutOfBoundsException;
                //  640    648    3      8      Ljava/lang/UnsupportedOperationException;
                //  640    648    639    640    Ljava/lang/AssertionError;
                //  666    673    673    674    Any
                //  666    673    3      8      Ljava/lang/IndexOutOfBoundsException;
                //  666    673    666    667    Any
                //  666    673    3      8      Any
                //  666    673    673    674    Ljava/lang/IllegalStateException;
                //  719    726    726    727    Any
                //  720    726    719    720    Ljava/lang/StringIndexOutOfBoundsException;
                //  719    726    719    720    Any
                //  720    726    719    720    Ljava/lang/UnsupportedOperationException;
                //  719    726    3      8      Any
                //  875    884    884    885    Any
                //  875    884    3      8      Ljava/lang/IllegalArgumentException;
                //  876    884    3      8      Any
                //  875    884    875    876    Any
                //  875    884    3      8      Ljava/util/NoSuchElementException;
                //  1010   1017   1017   1018   Any
                //  1011   1017   3      8      Any
                //  1010   1017   3      8      Ljava/lang/NullPointerException;
                //  1011   1017   1017   1018   Any
                //  1011   1017   1010   1011   Ljava/lang/IllegalArgumentException;
                //  1115   1122   1122   1123   Any
                //  1116   1122   1122   1123   Ljava/lang/UnsupportedOperationException;
                //  1115   1122   1122   1123   Any
                //  1115   1122   1115   1116   Ljava/lang/IndexOutOfBoundsException;
                //  1116   1122   3      8      Any
                //  1128   1135   1135   1136   Any
                //  1129   1135   1135   1136   Ljava/lang/ClassCastException;
                //  1128   1135   1135   1136   Ljava/util/NoSuchElementException;
                //  1129   1135   1135   1136   Ljava/lang/NullPointerException;
                //  1129   1135   1128   1129   Ljava/lang/IllegalArgumentException;
                //  1184   1190   1190   1191   Any
                //  1184   1190   3      8      Ljava/lang/IllegalStateException;
                //  1184   1190   3      8      Ljava/util/ConcurrentModificationException;
                //  1184   1190   1190   1191   Any
                //  1184   1190   3      8      Ljava/lang/NegativeArraySizeException;
                //  1199   1206   1206   1207   Any
                //  1199   1206   1199   1200   Ljava/lang/StringIndexOutOfBoundsException;
                //  1200   1206   1199   1200   Any
                //  1200   1206   1206   1207   Ljava/lang/NullPointerException;
                //  1199   1206   1206   1207   Ljava/util/NoSuchElementException;
                //  1260   1266   1266   1267   Any
                //  1260   1266   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
                //  1260   1266   3      8      Any
                //  1260   1266   3      8      Any
                //  1260   1266   1266   1267   Any
                //  1270   1279   1279   1280   Any
                //  1271   1279   1270   1271   Ljava/lang/StringIndexOutOfBoundsException;
                //  1270   1279   1279   1280   Any
                //  1271   1279   1270   1271   Any
                //  1271   1279   1270   1271   Ljava/lang/ClassCastException;
                //  1329   1338   1338   1339   Any
                //  1330   1338   1329   1330   Any
                //  1329   1338   3      8      Ljava/lang/RuntimeException;
                //  1330   1338   1338   1339   Any
                //  1330   1338   1338   1339   Ljava/util/ConcurrentModificationException;
                //  1391   1400   1400   1401   Any
                //  1391   1400   1400   1401   Any
                //  1391   1400   1391   1392   Ljava/lang/NullPointerException;
                //  1392   1400   3      8      Any
                //  1392   1400   3      8      Ljava/lang/IndexOutOfBoundsException;
                //  1413   1420   1420   1421   Any
                //  1413   1420   1420   1421   Any
                //  1414   1420   3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
                //  1413   1420   1420   1421   Ljava/lang/StringIndexOutOfBoundsException;
                //  1414   1420   1413   1414   Ljava/lang/ClassCastException;
                //  1428   1434   1434   1435   Any
                //  1428   1434   1434   1435   Ljava/lang/ArrayIndexOutOfBoundsException;
                //  1428   1434   1434   1435   Ljava/lang/IllegalStateException;
                //  1428   1434   1434   1435   Any
                //  1428   1434   1434   1435   Any
                //  1487   1493   1493   1494   Any
                //  1487   1493   3      8      Ljava/lang/ClassCastException;
                //  1487   1493   3      8      Any
                //  1487   1493   1493   1494   Any
                //  1487   1493   3      8      Any
                //  1512   1521   1521   1522   Any
                //  1513   1521   3      8      Ljava/lang/NumberFormatException;
                //  1512   1521   3      8      Any
                //  1512   1521   1512   1513   Any
                //  1512   1521   1521   1522   Ljava/lang/RuntimeException;
                //  1691   1698   1698   1699   Any
                //  1692   1698   3      8      Any
                //  1692   1698   3      8      Any
                //  1692   1698   1691   1692   Ljava/util/NoSuchElementException;
                //  1692   1698   3      8      Ljava/lang/UnsupportedOperationException;
                //  1747   1754   1754   1755   Any
                //  1747   1754   1747   1748   Any
                //  1747   1754   1747   1748   Any
                //  1747   1754   3      8      Any
                //  1748   1754   1754   1755   Ljava/lang/IllegalArgumentException;
                //  1761   1768   1768   1769   Any
                //  1761   1768   3      8      Any
                //  1761   1768   1761   1762   Ljava/lang/IllegalStateException;
                //  1761   1768   3      8      Any
                //  1762   1768   3      8      Ljava/lang/NullPointerException;
                //  1923   1930   1930   1931   Any
                //  1923   1930   1930   1931   Any
                //  1924   1930   1923   1924   Ljava/lang/UnsupportedOperationException;
                //  1924   1930   3      8      Any
                //  1923   1930   1930   1931   Any
                //  2031   2038   2038   2039   Any
                //  2032   2038   2031   2032   Ljava/lang/IllegalArgumentException;
                //  2032   2038   3      8      Ljava/util/NoSuchElementException;
                //  2032   2038   3      8      Ljava/lang/IllegalStateException;
                //  2032   2038   2038   2039   Any
                //  2042   2049   2049   2050   Any
                //  2043   2049   3      8      Ljava/lang/AssertionError;
                //  2042   2049   3      8      Ljava/lang/NumberFormatException;
                //  2042   2049   3      8      Ljava/lang/ClassCastException;
                //  2043   2049   2042   2043   Ljava/lang/EnumConstantNotPresentException;
                //  2059   2065   2065   2066   Any
                //  2059   2065   2065   2066   Ljava/util/NoSuchElementException;
                //  2059   2065   2065   2066   Any
                //  2059   2065   3      8      Any
                //  2059   2065   2065   2066   Any
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
                //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:414)
                //     at com.strobel.assembler.ir.Instruction.accept(Instruction.java:490)
                //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:403)
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
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:670)
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
            
            public f24(final CommandDispatcher c) {
                while (true) {
                    int n = 0;
                    Label_0016: {
                        if (fc.c < 0) {
                            n = -943236798;
                            break Label_0016;
                        }
                        n = 990482124;
                    }
                    switch (n ^ 0xEE4FBCF2) {
                        case 696837552: {
                            continue;
                        }
                        case -716819906: {
                            this.c = c;
                        }
                        default: {
                            throw null;
                        }
                    }
                    break;
                }
            }
        }
        public class f23 implements Command
        {
            public CommandDispatcher c;
            
            static {
                throw t;
            }
            
            public f23(final CommandDispatcher c) {
                while (true) {
                    int n = 0;
                    Label_0014: {
                        if (fc.0 != 0) {
                            n = 2021542899;
                            break Label_0014;
                        }
                        n = 2085321129;
                    }
                    switch (n ^ 0xC20DE900) {
                        case 1555566844: {
                            continue;
                        }
                        default: {
                            while (true) {
                                int n2 = 0;
                                Label_0058: {
                                    if (fc.0 != 0) {
                                        n2 = -866579567;
                                        break Label_0058;
                                    }
                                    n2 = 723837571;
                                }
                                switch (n2 ^ 0xAB49EBD8) {
                                    case 1729159241: {
                                        continue;
                                    }
                                    case -2140337829: {
                                        this.c = c;
                                        while (true) {
                                            int n3 = 0;
                                            Label_0105: {
                                                if (fc.c < 0) {
                                                    n3 = 695243097;
                                                    break Label_0105;
                                                }
                                                n3 = -1338722165;
                                            }
                                            switch (n3 ^ 0x88C2CD2A) {
                                                case -1582146445: {
                                                    continue;
                                                }
                                                case 955676065: {
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
                        case -1166826765: {
                            throw null;
                        }
                    }
                    break;
                }
            }
            
            @Override
            public int run(@NotNull final CommandContext p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: ifnull          585
                //     7: athrow         
                //     8: aconst_null    
                //     9: getstatic       dev/nuker/pyro/fc.1:I
                //    12: ifgt            577
                //    15: pop            
                //    16: aconst_null    
                //    17: goto            569
                //    20: nop            
                //    21: nop            
                //    22: nop            
                //    23: athrow         
                //    24: getstatic       dev/nuker/pyro/fc.c:I
                //    27: ifge            35
                //    30: ldc             -1306884356
                //    32: goto            37
                //    35: ldc             -1711944052
                //    37: ldc             667790158
                //    39: ixor           
                //    40: lookupswitch {
                //          -1781060174: 35
                //          -1103600190: 68
                //          default: 554
                //        }
                //    68: aload_1        
                //    69: pop            
                //    70: aload_1        
                //    71: goto            75
                //    74: athrow         
                //    75: invokevirtual   com/mojang/brigadier/context/CommandContext.getSource:()Ljava/lang/Object;
                //    78: goto            82
                //    81: athrow         
                //    82: checkcast       Ldev/nuker/pyro/f16;
                //    85: new             Lnet/minecraft/util/text/TextComponentString;
                //    88: dup            
                //    89: ldc             "\u2353\u148a\u8a68\u0b2f\u1047\ued46\ub22b\ue65a\u619c\u3075\ua7ab\u1e48\ue160\u7d04\u58b3"
                //    91: goto            95
                //    94: athrow         
                //    95: invokestatic    invokestatic   !!! ERROR
                //    98: goto            102
                //   101: athrow         
                //   102: goto            106
                //   105: athrow         
                //   106: invokespecial   net/minecraft/util/text/TextComponentString.<init>:(Ljava/lang/String;)V
                //   109: goto            113
                //   112: athrow         
                //   113: checkcast       Lnet/minecraft/util/text/ITextComponent;
                //   116: goto            120
                //   119: athrow         
                //   120: invokevirtual   dev/nuker/pyro/f16.c:(Lnet/minecraft/util/text/ITextComponent;)V
                //   123: goto            127
                //   126: athrow         
                //   127: getstatic       dev/nuker/pyro/fc.1:I
                //   130: ifeq            138
                //   133: ldc             182202449
                //   135: goto            140
                //   138: ldc             1372556577
                //   140: ldc             -1630117716
                //   142: ixor           
                //   143: lookupswitch {
                //          -1811263235: 558
                //          -1038707266: 138
                //          default: 168
                //        }
                //   168: aload_0        
                //   169: getfield        dev/nuker/pyro/f23.c:Lcom/mojang/brigadier/CommandDispatcher;
                //   172: aload_0        
                //   173: getfield        dev/nuker/pyro/f23.c:Lcom/mojang/brigadier/CommandDispatcher;
                //   176: goto            180
                //   179: athrow         
                //   180: invokevirtual   com/mojang/brigadier/CommandDispatcher.getRoot:()Lcom/mojang/brigadier/tree/RootCommandNode;
                //   183: goto            187
                //   186: athrow         
                //   187: checkcast       Lcom/mojang/brigadier/tree/CommandNode;
                //   190: aload_1        
                //   191: goto            195
                //   194: athrow         
                //   195: invokevirtual   com/mojang/brigadier/context/CommandContext.getSource:()Ljava/lang/Object;
                //   198: goto            202
                //   201: athrow         
                //   202: getstatic       dev/nuker/pyro/fc.c:I
                //   205: ifge            213
                //   208: ldc             1248457149
                //   210: goto            215
                //   213: ldc             -296085035
                //   215: ldc             -789617980
                //   217: ixor           
                //   218: lookupswitch {
                //          -1702456455: 550
                //          1372309350: 213
                //          default: 244
                //        }
                //   244: goto            248
                //   247: athrow         
                //   248: invokevirtual   com/mojang/brigadier/CommandDispatcher.getSmartUsage:(Lcom/mojang/brigadier/tree/CommandNode;Ljava/lang/Object;)Ljava/util/Map;
                //   251: goto            255
                //   254: athrow         
                //   255: goto            259
                //   258: athrow         
                //   259: invokeinterface java/util/Map.values:()Ljava/util/Collection;
                //   264: goto            268
                //   267: athrow         
                //   268: goto            272
                //   271: athrow         
                //   272: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
                //   277: goto            281
                //   280: athrow         
                //   281: astore_3       
                //   282: aload_3        
                //   283: goto            287
                //   286: athrow         
                //   287: invokeinterface java/util/Iterator.hasNext:()Z
                //   292: goto            296
                //   295: athrow         
                //   296: ifeq            546
                //   299: getstatic       dev/nuker/pyro/fc.c:I
                //   302: ifge            310
                //   305: ldc             -813545105
                //   307: goto            312
                //   310: ldc             -1893846441
                //   312: ldc             23567411
                //   314: ixor           
                //   315: lookupswitch {
                //          -1904628124: 340
                //          -823798436: 310
                //          default: 552
                //        }
                //   340: aload_3        
                //   341: goto            345
                //   344: athrow         
                //   345: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                //   350: goto            354
                //   353: athrow         
                //   354: checkcast       Ljava/lang/String;
                //   357: astore_2       
                //   358: aload_1        
                //   359: goto            363
                //   362: athrow         
                //   363: invokevirtual   com/mojang/brigadier/context/CommandContext.getSource:()Ljava/lang/Object;
                //   366: goto            370
                //   369: athrow         
                //   370: checkcast       Ldev/nuker/pyro/f16;
                //   373: new             Lnet/minecraft/util/text/TextComponentString;
                //   376: dup            
                //   377: new             Ljava/lang/StringBuilder;
                //   380: dup            
                //   381: getstatic       dev/nuker/pyro/fc.1:I
                //   384: ifeq            392
                //   387: ldc             732294925
                //   389: goto            394
                //   392: ldc             236031383
                //   394: ldc             -192113881
                //   396: ixor           
                //   397: lookupswitch {
                //          -1342752047: 392
                //          -550929366: 548
                //          default: 424
                //        }
                //   424: goto            428
                //   427: athrow         
                //   428: invokespecial   java/lang/StringBuilder.<init>:()V
                //   431: goto            435
                //   434: athrow         
                //   435: getstatic       dev/nuker/pyro/Config.INSTANCE:Ldev/nuker/pyro/Config;
                //   438: getfield        dev/nuker/pyro/Config.chatPrefix:Ljava/lang/String;
                //   441: goto            445
                //   444: athrow         
                //   445: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   448: goto            452
                //   451: athrow         
                //   452: aload_2        
                //   453: getstatic       dev/nuker/pyro/fc.c:I
                //   456: ifge            464
                //   459: ldc             1078472207
                //   461: goto            466
                //   464: ldc             1665847076
                //   466: ldc             -914117837
                //   468: ixor           
                //   469: lookupswitch {
                //          -1983150788: 464
                //          -1429642217: 496
                //          default: 556
                //        }
                //   496: goto            500
                //   499: athrow         
                //   500: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   503: goto            507
                //   506: athrow         
                //   507: goto            511
                //   510: athrow         
                //   511: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   514: goto            518
                //   517: athrow         
                //   518: goto            522
                //   521: athrow         
                //   522: invokespecial   net/minecraft/util/text/TextComponentString.<init>:(Ljava/lang/String;)V
                //   525: goto            529
                //   528: athrow         
                //   529: checkcast       Lnet/minecraft/util/text/ITextComponent;
                //   532: goto            536
                //   535: athrow         
                //   536: invokevirtual   dev/nuker/pyro/f16.c:(Lnet/minecraft/util/text/ITextComponent;)V
                //   539: goto            543
                //   542: athrow         
                //   543: goto            282
                //   546: iconst_0       
                //   547: ireturn        
                //   548: aconst_null    
                //   549: athrow         
                //   550: aconst_null    
                //   551: athrow         
                //   552: aconst_null    
                //   553: athrow         
                //   554: aconst_null    
                //   555: athrow         
                //   556: aconst_null    
                //   557: athrow         
                //   558: aconst_null    
                //   559: athrow         
                //   560: pop            
                //   561: goto            24
                //   564: pop            
                //   565: aconst_null    
                //   566: goto            560
                //   569: dup            
                //   570: ifnull          560
                //   573: checkcast       Ljava/lang/Throwable;
                //   576: athrow         
                //   577: dup            
                //   578: ifnull          564
                //   581: checkcast       Ljava/lang/Throwable;
                //   584: athrow         
                //   585: aconst_null    
                //   586: athrow         
                //    StackMapTable: 00 6B 43 07 00 4E 04 FF 00 0B 00 00 00 01 07 00 4E FD 00 03 07 00 03 07 00 53 0A 41 01 1E 45 07 00 4E 40 07 00 53 45 07 00 4E 40 07 00 05 FF 00 0B 00 00 00 01 07 00 4E FF 00 00 00 02 07 00 03 07 00 53 00 04 07 00 59 08 00 55 08 00 55 07 00 94 45 07 00 4E FF 00 00 00 02 07 00 03 07 00 53 00 04 07 00 59 08 00 55 08 00 55 07 00 94 FF 00 02 00 00 00 01 07 00 4E FF 00 00 00 02 07 00 03 07 00 53 00 04 07 00 59 08 00 55 08 00 55 07 00 94 45 07 00 4E FF 00 00 00 02 07 00 03 07 00 53 00 02 07 00 59 07 00 5B FF 00 05 00 00 00 01 07 00 4E FF 00 00 00 02 07 00 03 07 00 53 00 02 07 00 59 07 00 67 45 07 00 4E 00 0A 41 01 1B 4A 07 00 4E FF 00 00 00 02 07 00 03 07 00 53 00 02 07 00 28 07 00 28 45 07 00 4E FF 00 00 00 02 07 00 03 07 00 53 00 02 07 00 28 07 00 B1 FF 00 06 00 00 00 01 07 00 4E FF 00 00 00 02 07 00 03 07 00 53 00 03 07 00 28 07 00 73 07 00 53 45 07 00 4E FF 00 00 00 02 07 00 03 07 00 53 00 03 07 00 28 07 00 73 07 00 05 FF 00 0A 00 02 07 00 03 07 00 53 00 03 07 00 28 07 00 73 07 00 05 FF 00 01 00 02 07 00 03 07 00 53 00 04 07 00 28 07 00 73 07 00 05 01 FF 00 1C 00 02 07 00 03 07 00 53 00 03 07 00 28 07 00 73 07 00 05 42 07 00 4E FF 00 00 00 02 07 00 03 07 00 53 00 03 07 00 28 07 00 73 07 00 05 45 07 00 4E 40 07 00 7C FF 00 02 00 00 00 01 07 00 4E FF 00 00 00 02 07 00 03 07 00 53 00 01 07 00 7C 47 07 00 4E 40 07 00 82 FF 00 02 00 00 00 01 07 00 4E FF 00 00 00 02 07 00 03 07 00 53 00 01 07 00 82 47 07 00 4E 40 07 00 88 FD 00 00 00 07 00 88 43 07 00 4E 40 07 00 88 47 07 00 4E 40 01 0D 41 01 1B 43 07 00 41 40 07 00 88 47 07 00 4E 40 07 00 05 FF 00 07 00 00 00 01 07 00 4E FF 00 00 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 01 07 00 53 45 07 00 4E 40 07 00 05 FF 00 15 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 05 07 00 59 08 01 75 08 01 75 08 01 79 08 01 79 FF 00 01 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 06 07 00 59 08 01 75 08 01 75 08 01 79 08 01 79 01 FF 00 1D 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 05 07 00 59 08 01 75 08 01 75 08 01 79 08 01 79 42 07 00 4E FF 00 00 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 05 07 00 59 08 01 75 08 01 75 08 01 79 08 01 79 45 07 00 4E FF 00 00 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 04 07 00 59 08 01 75 08 01 75 07 00 96 FF 00 08 00 00 00 01 07 00 4E FF 00 00 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 05 07 00 59 08 01 75 08 01 75 07 00 96 07 00 94 45 07 00 4E FF 00 00 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 04 07 00 59 08 01 75 08 01 75 07 00 96 FF 00 0B 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 05 07 00 59 08 01 75 08 01 75 07 00 96 07 00 94 FF 00 01 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 06 07 00 59 08 01 75 08 01 75 07 00 96 07 00 94 01 FF 00 1D 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 05 07 00 59 08 01 75 08 01 75 07 00 96 07 00 94 42 07 00 4E FF 00 00 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 05 07 00 59 08 01 75 08 01 75 07 00 96 07 00 94 45 07 00 4E FF 00 00 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 04 07 00 59 08 01 75 08 01 75 07 00 96 FF 00 02 00 00 00 01 07 00 4E FF 00 00 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 04 07 00 59 08 01 75 08 01 75 07 00 96 45 07 00 4E FF 00 00 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 04 07 00 59 08 01 75 08 01 75 07 00 94 42 07 00 47 FF 00 00 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 04 07 00 59 08 01 75 08 01 75 07 00 94 45 07 00 4E FF 00 00 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 02 07 00 59 07 00 5B 45 07 00 49 FF 00 00 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 02 07 00 59 07 00 67 45 07 00 4E 00 FF 00 02 00 04 07 00 03 07 00 53 00 07 00 88 00 00 FF 00 01 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 05 07 00 59 08 01 75 08 01 75 08 01 79 08 01 79 FF 00 01 00 02 07 00 03 07 00 53 00 03 07 00 28 07 00 73 07 00 05 FD 00 01 00 07 00 88 F9 00 01 FF 00 01 00 04 07 00 03 07 00 53 07 00 94 07 00 88 00 05 07 00 59 08 01 75 08 01 75 07 00 96 07 00 94 F9 00 01 41 07 00 4E 43 05 44 07 00 4E 47 05 47 07 00 4E
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                       
                //  -----  -----  -----  -----  -------------------------------------------
                //  8      20     569    577    Any
                //  569    577    569    577    Any
                //  585    587    3      8      Any
                //  74     81     81     82     Any
                //  74     81     3      8      Any
                //  75     81     74     75     Any
                //  75     81     3      8      Any
                //  75     81     3      8      Ljava/lang/ArithmeticException;
                //  95     101    101    102    Any
                //  95     101    3      8      Any
                //  95     101    101    102    Ljava/lang/EnumConstantNotPresentException;
                //  95     101    101    102    Any
                //  95     101    101    102    Any
                //  106    112    112    113    Any
                //  106    112    112    113    Any
                //  106    112    112    113    Ljava/lang/IllegalArgumentException;
                //  106    112    112    113    Any
                //  106    112    112    113    Any
                //  120    126    126    127    Any
                //  120    126    3      8      Any
                //  120    126    126    127    Ljava/util/ConcurrentModificationException;
                //  120    126    3      8      Any
                //  120    126    3      8      Ljava/lang/NegativeArraySizeException;
                //  179    186    186    187    Any
                //  179    186    179    180    Ljava/lang/NumberFormatException;
                //  180    186    179    180    Any
                //  180    186    186    187    Ljava/lang/ArithmeticException;
                //  180    186    3      8      Ljava/lang/IllegalArgumentException;
                //  195    201    201    202    Any
                //  195    201    3      8      Any
                //  195    201    201    202    Ljava/lang/ArithmeticException;
                //  195    201    201    202    Ljava/lang/UnsupportedOperationException;
                //  195    201    201    202    Ljava/lang/NullPointerException;
                //  247    254    254    255    Any
                //  248    254    247    248    Ljava/lang/AssertionError;
                //  247    254    247    248    Ljava/lang/ArithmeticException;
                //  248    254    254    255    Any
                //  248    254    247    248    Any
                //  259    267    267    268    Any
                //  259    267    267    268    Any
                //  259    267    3      8      Any
                //  259    267    267    268    Any
                //  259    267    267    268    Ljava/lang/ArrayIndexOutOfBoundsException;
                //  272    280    280    281    Any
                //  272    280    3      8      Ljava/lang/RuntimeException;
                //  272    280    280    281    Ljava/lang/UnsupportedOperationException;
                //  272    280    3      8      Any
                //  272    280    280    281    Ljava/lang/NumberFormatException;
                //  286    295    295    296    Any
                //  287    295    286    287    Any
                //  287    295    3      8      Any
                //  286    295    286    287    Any
                //  287    295    286    287    Any
                //  344    353    353    354    Any
                //  345    353    344    345    Ljava/lang/StringIndexOutOfBoundsException;
                //  345    353    353    354    Ljava/lang/EnumConstantNotPresentException;
                //  344    353    344    345    Ljava/lang/IllegalArgumentException;
                //  344    353    353    354    Any
                //  363    369    369    370    Any
                //  363    369    3      8      Any
                //  363    369    369    370    Any
                //  363    369    3      8      Any
                //  363    369    3      8      Any
                //  427    434    434    435    Any
                //  428    434    427    428    Any
                //  427    434    427    428    Any
                //  427    434    427    428    Any
                //  427    434    3      8      Any
                //  445    451    451    452    Any
                //  445    451    3      8      Any
                //  445    451    3      8      Any
                //  445    451    451    452    Ljava/lang/RuntimeException;
                //  445    451    3      8      Ljava/lang/NegativeArraySizeException;
                //  499    506    506    507    Any
                //  499    506    499    500    Any
                //  500    506    506    507    Ljava/lang/IndexOutOfBoundsException;
                //  500    506    506    507    Any
                //  499    506    3      8      Any
                //  511    517    517    518    Any
                //  511    517    3      8      Any
                //  511    517    517    518    Any
                //  511    517    3      8      Ljava/lang/AssertionError;
                //  511    517    3      8      Ljava/lang/IllegalArgumentException;
                //  521    528    528    529    Any
                //  522    528    3      8      Any
                //  521    528    528    529    Any
                //  521    528    3      8      Any
                //  522    528    521    522    Ljava/util/NoSuchElementException;
                //  535    542    542    543    Any
                //  535    542    535    536    Ljava/lang/IllegalStateException;
                //  536    542    542    543    Any
                //  535    542    535    536    Ljava/lang/IllegalStateException;
                //  536    542    3      8      Any
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
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:670)
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
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          326
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            318
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            310
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: pop            
        //    26: aload_0        
        //    27: ldc             "\u236e\u1496\u8a7b\ub1d8"
        //    29: goto            33
        //    32: athrow         
        //    33: invokestatic    invokestatic   !!! ERROR
        //    36: goto            40
        //    39: athrow         
        //    40: getstatic       dev/nuker/pyro/fc.c:I
        //    43: ifge            51
        //    46: ldc             -478261080
        //    48: goto            53
        //    51: ldc             -1994974606
        //    53: ldc             -776441191
        //    55: ixor           
        //    56: lookupswitch {
        //          -1951485430: 51
        //          851845681: 299
        //          default: 84
        //        }
        //    84: goto            88
        //    87: athrow         
        //    88: invokestatic    dev/nuker/pyro/f2u.c:(Ljava/lang/String;)Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;
        //    91: goto            95
        //    94: athrow         
        //    95: new             Ldev/nuker/pyro/f23;
        //    98: dup            
        //    99: aload_0        
        //   100: goto            104
        //   103: athrow         
        //   104: invokespecial   dev/nuker/pyro/f23.<init>:(Lcom/mojang/brigadier/CommandDispatcher;)V
        //   107: goto            111
        //   110: athrow         
        //   111: checkcast       Lcom/mojang/brigadier/Command;
        //   114: goto            118
        //   117: athrow         
        //   118: invokevirtual   com/mojang/brigadier/builder/LiteralArgumentBuilder.executes:(Lcom/mojang/brigadier/Command;)Lcom/mojang/brigadier/builder/ArgumentBuilder;
        //   121: goto            125
        //   124: athrow         
        //   125: checkcast       Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;
        //   128: ldc             "\u2365\u149c\u8a7a\ub1c5\uce5d\ued6e\ub220"
        //   130: goto            134
        //   133: athrow         
        //   134: invokestatic    invokestatic   !!! ERROR
        //   137: goto            141
        //   140: athrow         
        //   141: goto            145
        //   144: athrow         
        //   145: invokestatic    com/mojang/brigadier/arguments/StringArgumentType.greedyString:()Lcom/mojang/brigadier/arguments/StringArgumentType;
        //   148: goto            152
        //   151: athrow         
        //   152: checkcast       Lcom/mojang/brigadier/arguments/ArgumentType;
        //   155: goto            159
        //   158: athrow         
        //   159: invokestatic    dev/nuker/pyro/f2u.c:(Ljava/lang/String;Lcom/mojang/brigadier/arguments/ArgumentType;)Lcom/mojang/brigadier/builder/RequiredArgumentBuilder;
        //   162: goto            166
        //   165: athrow         
        //   166: new             Ldev/nuker/pyro/f24;
        //   169: dup            
        //   170: aload_0        
        //   171: goto            175
        //   174: athrow         
        //   175: invokespecial   dev/nuker/pyro/f24.<init>:(Lcom/mojang/brigadier/CommandDispatcher;)V
        //   178: goto            182
        //   181: athrow         
        //   182: checkcast       Lcom/mojang/brigadier/suggestion/SuggestionProvider;
        //   185: goto            189
        //   188: athrow         
        //   189: invokevirtual   com/mojang/brigadier/builder/RequiredArgumentBuilder.suggests:(Lcom/mojang/brigadier/suggestion/SuggestionProvider;)Lcom/mojang/brigadier/builder/RequiredArgumentBuilder;
        //   192: goto            196
        //   195: athrow         
        //   196: new             Ldev/nuker/pyro/f25;
        //   199: dup            
        //   200: getstatic       dev/nuker/pyro/fc.0:I
        //   203: ifeq            211
        //   206: ldc             -1026079979
        //   208: goto            213
        //   211: ldc             -1112247264
        //   213: ldc             1618862875
        //   215: ixor           
        //   216: lookupswitch {
        //          -1565876210: 211
        //          -573991109: 244
        //          default: 297
        //        }
        //   244: aload_0        
        //   245: goto            249
        //   248: athrow         
        //   249: invokespecial   dev/nuker/pyro/f25.<init>:(Lcom/mojang/brigadier/CommandDispatcher;)V
        //   252: goto            256
        //   255: athrow         
        //   256: checkcast       Lcom/mojang/brigadier/Command;
        //   259: goto            263
        //   262: athrow         
        //   263: invokevirtual   com/mojang/brigadier/builder/RequiredArgumentBuilder.executes:(Lcom/mojang/brigadier/Command;)Lcom/mojang/brigadier/builder/ArgumentBuilder;
        //   266: goto            270
        //   269: athrow         
        //   270: goto            274
        //   273: athrow         
        //   274: invokevirtual   com/mojang/brigadier/builder/LiteralArgumentBuilder.then:(Lcom/mojang/brigadier/builder/ArgumentBuilder;)Lcom/mojang/brigadier/builder/ArgumentBuilder;
        //   277: goto            281
        //   280: athrow         
        //   281: checkcast       Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;
        //   284: goto            288
        //   287: athrow         
        //   288: invokevirtual   com/mojang/brigadier/CommandDispatcher.register:(Lcom/mojang/brigadier/builder/LiteralArgumentBuilder;)Lcom/mojang/brigadier/tree/LiteralCommandNode;
        //   291: goto            295
        //   294: athrow         
        //   295: pop            
        //   296: return         
        //   297: aconst_null    
        //   298: athrow         
        //   299: aconst_null    
        //   300: athrow         
        //   301: pop            
        //   302: goto            24
        //   305: pop            
        //   306: aconst_null    
        //   307: goto            301
        //   310: dup            
        //   311: ifnull          301
        //   314: checkcast       Ljava/lang/Throwable;
        //   317: athrow         
        //   318: dup            
        //   319: ifnull          305
        //   322: checkcast       Ljava/lang/Throwable;
        //   325: athrow         
        //   326: aconst_null    
        //   327: athrow         
        //    StackMapTable: 00 45 43 07 00 17 04 FF 00 0B 00 00 00 01 07 00 17 FC 00 03 07 00 77 47 07 00 24 FF 00 00 00 01 07 00 77 00 02 07 00 77 07 00 7D 45 07 00 17 FF 00 00 00 01 07 00 77 00 02 07 00 77 07 00 7D FF 00 0A 00 01 07 00 77 00 02 07 00 77 07 00 7D FF 00 01 00 01 07 00 77 00 03 07 00 77 07 00 7D 01 FF 00 1E 00 01 07 00 77 00 02 07 00 77 07 00 7D 42 07 00 17 FF 00 00 00 01 07 00 77 00 02 07 00 77 07 00 7D 45 07 00 17 FF 00 00 00 01 07 00 77 00 02 07 00 77 07 00 4C FF 00 07 00 00 00 01 07 00 17 FF 00 00 00 01 07 00 77 00 05 07 00 77 07 00 4C 08 00 5F 08 00 5F 07 00 77 45 07 00 17 FF 00 00 00 01 07 00 77 00 03 07 00 77 07 00 4C 07 00 46 45 07 00 17 FF 00 00 00 01 07 00 77 00 03 07 00 77 07 00 4C 07 00 4A 45 07 00 17 FF 00 00 00 01 07 00 77 00 02 07 00 77 07 00 7F 47 07 00 17 FF 00 00 00 01 07 00 77 00 03 07 00 77 07 00 4C 07 00 7D 45 07 00 17 FF 00 00 00 01 07 00 77 00 03 07 00 77 07 00 4C 07 00 7D 42 07 00 17 FF 00 00 00 01 07 00 77 00 03 07 00 77 07 00 4C 07 00 7D 45 07 00 17 FF 00 00 00 01 07 00 77 00 04 07 00 77 07 00 4C 07 00 7D 07 00 54 45 07 00 17 FF 00 00 00 01 07 00 77 00 04 07 00 77 07 00 4C 07 00 7D 07 00 5A 45 07 00 17 FF 00 00 00 01 07 00 77 00 03 07 00 77 07 00 4C 07 00 64 47 07 00 26 FF 00 00 00 01 07 00 77 00 06 07 00 77 07 00 4C 07 00 64 08 00 A6 08 00 A6 07 00 77 45 07 00 17 FF 00 00 00 01 07 00 77 00 04 07 00 77 07 00 4C 07 00 64 07 00 5F 45 07 00 17 FF 00 00 00 01 07 00 77 00 04 07 00 77 07 00 4C 07 00 64 07 00 62 45 07 00 17 FF 00 00 00 01 07 00 77 00 03 07 00 77 07 00 4C 07 00 64 FF 00 0E 00 01 07 00 77 00 05 07 00 77 07 00 4C 07 00 64 08 00 C4 08 00 C4 FF 00 01 00 01 07 00 77 00 06 07 00 77 07 00 4C 07 00 64 08 00 C4 08 00 C4 01 FF 00 1E 00 01 07 00 77 00 05 07 00 77 07 00 4C 07 00 64 08 00 C4 08 00 C4 43 07 00 24 FF 00 00 00 01 07 00 77 00 06 07 00 77 07 00 4C 07 00 64 08 00 C4 08 00 C4 07 00 77 45 07 00 17 FF 00 00 00 01 07 00 77 00 04 07 00 77 07 00 4C 07 00 64 07 00 6A FF 00 05 00 00 00 01 07 00 17 FF 00 00 00 01 07 00 77 00 04 07 00 77 07 00 4C 07 00 64 07 00 4A 45 07 00 17 FF 00 00 00 01 07 00 77 00 03 07 00 77 07 00 4C 07 00 7F 42 07 00 17 FF 00 00 00 01 07 00 77 00 03 07 00 77 07 00 4C 07 00 7F 45 07 00 17 FF 00 00 00 01 07 00 77 00 02 07 00 77 07 00 7F 45 07 00 17 FF 00 00 00 01 07 00 77 00 02 07 00 77 07 00 4C 45 07 00 17 40 07 00 81 FF 00 01 00 01 07 00 77 00 05 07 00 77 07 00 4C 07 00 64 08 00 C4 08 00 C4 FF 00 01 00 01 07 00 77 00 02 07 00 77 07 00 7D 41 07 00 17 43 05 44 07 00 17 47 05 47 07 00 17
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     310    318    Ljava/lang/EnumConstantNotPresentException;
        //  310    318    310    318    Any
        //  326    328    3      8      Ljava/lang/ClassCastException;
        //  32     39     39     40     Any
        //  32     39     3      8      Any
        //  33     39     39     40     Ljava/lang/IllegalStateException;
        //  32     39     32     33     Ljava/lang/UnsupportedOperationException;
        //  32     39     3      8      Ljava/lang/RuntimeException;
        //  87     94     94     95     Any
        //  88     94     94     95     Any
        //  88     94     87     88     Ljava/util/NoSuchElementException;
        //  88     94     87     88     Any
        //  87     94     87     88     Ljava/lang/EnumConstantNotPresentException;
        //  104    110    110    111    Any
        //  104    110    3      8      Ljava/lang/AssertionError;
        //  104    110    3      8      Ljava/lang/AssertionError;
        //  104    110    3      8      Any
        //  104    110    110    111    Any
        //  117    124    124    125    Any
        //  118    124    124    125    Ljava/lang/IllegalStateException;
        //  118    124    117    118    Any
        //  118    124    117    118    Any
        //  118    124    117    118    Ljava/lang/IllegalArgumentException;
        //  133    140    140    141    Any
        //  134    140    140    141    Ljava/lang/UnsupportedOperationException;
        //  133    140    3      8      Any
        //  134    140    133    134    Any
        //  134    140    133    134    Ljava/lang/NumberFormatException;
        //  144    151    151    152    Any
        //  144    151    3      8      Any
        //  145    151    151    152    Ljava/lang/StringIndexOutOfBoundsException;
        //  144    151    151    152    Any
        //  144    151    144    145    Any
        //  158    165    165    166    Any
        //  158    165    3      8      Ljava/util/NoSuchElementException;
        //  158    165    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  158    165    158    159    Any
        //  158    165    3      8      Any
        //  174    181    181    182    Any
        //  175    181    181    182    Ljava/lang/ArithmeticException;
        //  174    181    3      8      Any
        //  175    181    174    175    Ljava/lang/NegativeArraySizeException;
        //  174    181    174    175    Ljava/lang/ArithmeticException;
        //  188    195    195    196    Any
        //  188    195    3      8      Ljava/lang/UnsupportedOperationException;
        //  189    195    195    196    Any
        //  188    195    3      8      Any
        //  188    195    188    189    Any
        //  248    255    255    256    Any
        //  248    255    255    256    Any
        //  249    255    255    256    Ljava/lang/EnumConstantNotPresentException;
        //  248    255    248    249    Ljava/lang/UnsupportedOperationException;
        //  249    255    3      8      Any
        //  263    269    269    270    Any
        //  263    269    269    270    Ljava/lang/IllegalStateException;
        //  263    269    3      8      Any
        //  263    269    269    270    Any
        //  263    269    3      8      Ljava/lang/IllegalStateException;
        //  273    280    280    281    Any
        //  274    280    280    281    Any
        //  274    280    273    274    Any
        //  273    280    280    281    Any
        //  273    280    280    281    Ljava/lang/AssertionError;
        //  287    294    294    295    Any
        //  287    294    294    295    Ljava/lang/StringIndexOutOfBoundsException;
        //  288    294    287    288    Any
        //  287    294    294    295    Any
        //  287    294    3      8      Any
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
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   dev/nuker/pyro/f26.<init>:()V
        //     7: astore_0       
        //     8: aload_0        
        //     9: putstatic       dev/nuker/pyro/f26.c:Ldev/nuker/pyro/f26;
        //    12: new             Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;
        //    15: dup            
        //    16: new             Lcom/mojang/brigadier/LiteralMessage;
        //    19: dup            
        //    20: ldc             "\u2353\u149d\u8a7c\ubf0c\ufde9\ued77\ub22a\ue61a\ud5b0\udd9a\ua7ad\u1e41\ue17f\uc972\ub516\u89a0\u57e4\u779c\ub1e7\uf427\u2b9a\uc234\u6a83\u21cd\ue3e7\u3511\u7d24\u8922\u8cc3\ub8b6\u8423\ufb72\u7040\u96c8\u2fac\uf1f1"
        //    22: invokestatic    invokestatic   !!! ERROR
        //    25: invokespecial   com/mojang/brigadier/LiteralMessage.<init>:(Ljava/lang/String;)V
        //    28: checkcast       Lcom/mojang/brigadier/Message;
        //    31: invokespecial   com/mojang/brigadier/exceptions/SimpleCommandExceptionType.<init>:(Lcom/mojang/brigadier/Message;)V
        //    34: putstatic       dev/nuker/pyro/f26.c:Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;
        //    37: return         
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
