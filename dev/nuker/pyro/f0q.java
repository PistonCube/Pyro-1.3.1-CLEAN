// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.List;
import com.google.gson.JsonElement;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class f0q extends f0l
{
    @NotNull
    public f0f<Object> c;
    @NotNull
    public fw<Boolean> 0;
    
    @Nullable
    public f0n c(@NotNull final Enum p0, @NotNull final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          123
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            115
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            107
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_2        
        //    27: pop            
        //    28: aload_0        
        //    29: aload_1        
        //    30: getstatic       dev/nuker/pyro/fc.c:I
        //    33: ifge            41
        //    36: ldc             -1257820056
        //    38: goto            43
        //    41: ldc             -394056853
        //    43: ldc             1968389925
        //    45: ixor           
        //    46: lookupswitch {
        //          -1647307698: 72
        //          -1068232883: 41
        //          default: 96
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   java/lang/Enum.ordinal:()I
        //    79: goto            83
        //    82: athrow         
        //    83: aload_2        
        //    84: goto            88
        //    87: athrow         
        //    88: invokevirtual   dev/nuker/pyro/f0q.c:(ILjava/lang/String;)Ldev/nuker/pyro/f0n;
        //    91: goto            95
        //    94: athrow         
        //    95: areturn        
        //    96: aconst_null    
        //    97: athrow         
        //    98: pop            
        //    99: goto            24
        //   102: pop            
        //   103: aconst_null    
        //   104: goto            98
        //   107: dup            
        //   108: ifnull          98
        //   111: checkcast       Ljava/lang/Throwable;
        //   114: athrow         
        //   115: dup            
        //   116: ifnull          102
        //   119: checkcast       Ljava/lang/Throwable;
        //   122: athrow         
        //   123: aconst_null    
        //   124: athrow         
        //    StackMapTable: 00 15 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FE 00 03 07 00 03 07 00 26 07 00 2F FF 00 10 00 03 07 00 03 07 00 26 07 00 2F 00 02 07 00 03 07 00 26 FF 00 01 00 03 07 00 03 07 00 26 07 00 2F 00 03 07 00 03 07 00 26 01 FF 00 1C 00 03 07 00 03 07 00 26 07 00 2F 00 02 07 00 03 07 00 26 42 07 00 14 FF 00 00 00 03 07 00 03 07 00 26 07 00 2F 00 02 07 00 03 07 00 26 45 07 00 21 FF 00 00 00 03 07 00 03 07 00 26 07 00 2F 00 02 07 00 03 01 43 07 00 1A FF 00 00 00 03 07 00 03 07 00 26 07 00 2F 00 03 07 00 03 01 07 00 2F 45 07 00 21 40 07 00 31 FF 00 00 00 03 07 00 03 07 00 26 07 00 2F 00 02 07 00 03 07 00 26 41 07 00 33 43 05 44 07 00 33 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     107    115    Ljava/lang/NumberFormatException;
        //  107    115    107    115    Ljava/lang/NegativeArraySizeException;
        //  123    125    3      8      Any
        //  75     82     82     83     Any
        //  75     82     82     83     Any
        //  76     82     75     76     Ljava/lang/ClassCastException;
        //  75     82     82     83     Any
        //  75     82     82     83     Ljava/lang/AssertionError;
        //  87     94     94     95     Any
        //  88     94     94     95     Ljava/lang/NegativeArraySizeException;
        //  87     94     94     95     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  88     94     87     88     Ljava/lang/IllegalStateException;
        //  88     94     3      8      Any
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
    
    @Override
    public void c(@NotNull final JsonElement p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1141
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            1133
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1125
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.c:I
        //    27: ifge            35
        //    30: ldc             -1178581465
        //    32: goto            37
        //    35: ldc             -2133824303
        //    37: ldc             2120271200
        //    39: ixor           
        //    40: lookupswitch {
        //          -945781945: 35
        //          -21976655: 68
        //          default: 1100
        //        }
        //    68: aload_1        
        //    69: pop            
        //    70: aload_1        
        //    71: checkcast       Lcom/google/gson/JsonObject;
        //    74: astore_2       
        //    75: aload_0        
        //    76: getfield        dev/nuker/pyro/f0q.0:Ldev/nuker/pyro/fw;
        //    79: aload_2        
        //    80: ldc             "\u2366\u148b\u8a6a\ub1c9\uce51\ued61\ub221\ue653"
        //    82: goto            86
        //    85: athrow         
        //    86: invokestatic    invokestatic   !!! ERROR
        //    89: goto            93
        //    92: athrow         
        //    93: goto            97
        //    96: athrow         
        //    97: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   100: goto            104
        //   103: athrow         
        //   104: dup            
        //   105: pop            
        //   106: goto            110
        //   109: athrow         
        //   110: invokevirtual   com/google/gson/JsonElement.getAsBoolean:()Z
        //   113: goto            117
        //   116: athrow         
        //   117: getstatic       dev/nuker/pyro/fc.0:I
        //   120: ifeq            128
        //   123: ldc             662877159
        //   125: goto            130
        //   128: ldc             1553313421
        //   130: ldc             -2117482339
        //   132: ixor           
        //   133: lookupswitch {
        //          -1505002630: 1098
        //          1896641916: 128
        //          default: 160
        //        }
        //   160: goto            164
        //   163: athrow         
        //   164: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   167: goto            171
        //   170: athrow         
        //   171: goto            175
        //   174: athrow         
        //   175: invokevirtual   dev/nuker/pyro/fw.c:(Ljava/lang/Object;)V
        //   178: goto            182
        //   181: athrow         
        //   182: aload_2        
        //   183: ldc             "\u2360\u149b\u8a73\ub1c4\uce5b\ued77\ub221\ue659"
        //   185: goto            189
        //   188: athrow         
        //   189: invokestatic    invokestatic   !!! ERROR
        //   192: goto            196
        //   195: athrow         
        //   196: getstatic       dev/nuker/pyro/fc.1:I
        //   199: ifeq            207
        //   202: ldc             1109808364
        //   204: goto            209
        //   207: ldc             -832232111
        //   209: ldc             1702852396
        //   211: ixor           
        //   212: lookupswitch {
        //          -1424338307: 240
        //          660153280: 207
        //          default: 1090
        //        }
        //   240: goto            244
        //   243: athrow         
        //   244: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   247: goto            251
        //   250: athrow         
        //   251: dup            
        //   252: pop            
        //   253: goto            257
        //   256: athrow         
        //   257: invokevirtual   com/google/gson/JsonElement.getAsJsonArray:()Lcom/google/gson/JsonArray;
        //   260: goto            264
        //   263: athrow         
        //   264: astore_3       
        //   265: aload_0        
        //   266: getfield        dev/nuker/pyro/f0q.c:Ldev/nuker/pyro/f0f;
        //   269: getstatic       dev/nuker/pyro/fc.1:I
        //   272: ifeq            280
        //   275: ldc             988047836
        //   277: goto            282
        //   280: ldc             -1725687387
        //   282: ldc             -1096399348
        //   284: ixor           
        //   285: lookupswitch {
        //          -2076037168: 1108
        //          139134264: 280
        //          default: 312
        //        }
        //   312: aload_3        
        //   313: iconst_0       
        //   314: goto            318
        //   317: athrow         
        //   318: invokevirtual   com/google/gson/JsonArray.get:(I)Lcom/google/gson/JsonElement;
        //   321: goto            325
        //   324: athrow         
        //   325: dup            
        //   326: pop            
        //   327: goto            331
        //   330: athrow         
        //   331: invokevirtual   dev/nuker/pyro/f0f.c:(Lcom/google/gson/JsonElement;)V
        //   334: goto            338
        //   337: athrow         
        //   338: iconst_1       
        //   339: istore          4
        //   341: aload_0        
        //   342: goto            346
        //   345: athrow         
        //   346: invokevirtual   dev/nuker/pyro/f0q.5:()Ldev/nuker/pyro/fw;
        //   349: goto            353
        //   352: athrow         
        //   353: goto            357
        //   356: athrow         
        //   357: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   360: goto            364
        //   363: athrow         
        //   364: checkcast       [Ljava/lang/Object;
        //   367: arraylength    
        //   368: getstatic       dev/nuker/pyro/fc.0:I
        //   371: ifeq            379
        //   374: ldc             1590601984
        //   376: goto            381
        //   379: ldc             187505887
        //   381: ldc             -1315839570
        //   383: ixor           
        //   384: lookupswitch {
        //          -1162019471: 412
        //          -278968146: 379
        //          default: 1102
        //        }
        //   412: istore          5
        //   414: getstatic       dev/nuker/pyro/fc.c:I
        //   417: ifge            425
        //   420: ldc             -1906667781
        //   422: goto            427
        //   425: ldc             461376554
        //   427: ldc             1456889593
        //   429: ixor           
        //   430: lookupswitch {
        //          -661860350: 425
        //          1297502931: 456
        //          default: 1094
        //        }
        //   456: iload           4
        //   458: iload           5
        //   460: if_icmpge       1087
        //   463: aload_3        
        //   464: iload           4
        //   466: getstatic       dev/nuker/pyro/fc.c:I
        //   469: ifge            477
        //   472: ldc             -573260183
        //   474: goto            479
        //   477: ldc             -498972158
        //   479: ldc             -1857842072
        //   481: ixor           
        //   482: lookupswitch {
        //          -519588615: 477
        //          1284975105: 1106
        //          default: 508
        //        }
        //   508: goto            512
        //   511: athrow         
        //   512: invokevirtual   com/google/gson/JsonArray.get:(I)Lcom/google/gson/JsonElement;
        //   515: goto            519
        //   518: athrow         
        //   519: dup            
        //   520: ifnonnull       552
        //   523: new             Lkotlin/TypeCastException;
        //   526: dup            
        //   527: ldc             "\u236d\u1486\u8a76\ub1c4\uce1f\ued66\ub225\ue659\udb77\uee23\ua7b1\u1e0c\ue171\uc7b3\u86eb\u89fd\u57a5\u7781\ubf38\uc7d0\u2b85\uc234\u6ada\u2f49\ud041\u3508\u7d66\u8937\u8215\u8b07\u842f\ufb72\u7051\u981e\u1c09\uf1e1\u493c\u88f5\uc898\uf8b6\ub615\u41f4\ub96c\ub156\u4bee\u8a7a\u7c6c\ucefc\u7f58\ued4d\ue654\u16d6\uee8f\u35b5\u4125\ue170\u0a19\u8669\u1bc6\u08d4\u779b\u728e\uc769"
        //   529: goto            533
        //   532: athrow         
        //   533: invokestatic    invokestatic   !!! ERROR
        //   536: goto            540
        //   539: athrow         
        //   540: goto            544
        //   543: athrow         
        //   544: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   547: goto            551
        //   550: athrow         
        //   551: athrow         
        //   552: checkcast       Lcom/google/gson/JsonObject;
        //   555: astore          6
        //   557: aload_0        
        //   558: getstatic       dev/nuker/pyro/fc.1:I
        //   561: ifeq            569
        //   564: ldc             -1605889236
        //   566: goto            571
        //   569: ldc             -933623678
        //   571: ldc             360918123
        //   573: ixor           
        //   574: lookupswitch {
        //          -1244971193: 569
        //          -572971799: 600
        //          default: 1088
        //        }
        //   600: goto            604
        //   603: athrow         
        //   604: invokevirtual   dev/nuker/pyro/f0q.5:()Ldev/nuker/pyro/fw;
        //   607: goto            611
        //   610: athrow         
        //   611: getstatic       dev/nuker/pyro/fc.0:I
        //   614: ifeq            622
        //   617: ldc             558103737
        //   619: goto            624
        //   622: ldc             1659307021
        //   624: ldc             -1171325242
        //   626: ixor           
        //   627: lookupswitch {
        //          -1687354753: 1112
        //          799623205: 622
        //          default: 652
        //        }
        //   652: goto            656
        //   655: athrow         
        //   656: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   659: goto            663
        //   662: athrow         
        //   663: dup            
        //   664: ifnonnull       672
        //   667: ldc             1773817656
        //   669: goto            674
        //   672: ldc             1773817607
        //   674: ldc             1896179815
        //   676: ixor           
        //   677: tableswitch {
        //          830361278: 700
        //          830361279: 711
        //          default: 667
        //        }
        //   700: goto            704
        //   703: athrow         
        //   704: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   707: goto            711
        //   710: athrow         
        //   711: checkcast       [Ljava/util/List;
        //   714: iload           4
        //   716: iconst_1       
        //   717: isub           
        //   718: aaload         
        //   719: astore          7
        //   721: getstatic       dev/nuker/pyro/fc.1:I
        //   724: ifeq            732
        //   727: ldc             701768305
        //   729: goto            734
        //   732: ldc             2147062392
        //   734: ldc             1210726236
        //   736: ixor           
        //   737: lookupswitch {
        //          1148349074: 732
        //          1644041517: 1114
        //          default: 764
        //        }
        //   764: aload           7
        //   766: goto            770
        //   769: athrow         
        //   770: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   775: goto            779
        //   778: athrow         
        //   779: astore          9
        //   781: aload           9
        //   783: goto            787
        //   786: athrow         
        //   787: invokeinterface java/util/Iterator.hasNext:()Z
        //   792: goto            796
        //   795: athrow         
        //   796: ifeq            1081
        //   799: aload           9
        //   801: goto            805
        //   804: athrow         
        //   805: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   810: goto            814
        //   813: athrow         
        //   814: checkcast       Ldev/nuker/pyro/f0n;
        //   817: astore          8
        //   819: nop            
        //   820: getstatic       dev/nuker/pyro/fc.c:I
        //   823: ifge            831
        //   826: ldc             -1788858620
        //   828: goto            833
        //   831: ldc             -1565624572
        //   833: ldc             679141233
        //   835: ixor           
        //   836: lookupswitch {
        //          -1965774731: 864
        //          -1122307979: 831
        //          default: 1096
        //        }
        //   864: aload           6
        //   866: aload           8
        //   868: goto            872
        //   871: athrow         
        //   872: invokevirtual   dev/nuker/pyro/f0n.0:()Ljava/lang/String;
        //   875: goto            879
        //   878: athrow         
        //   879: goto            883
        //   882: athrow         
        //   883: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //   886: goto            890
        //   889: athrow         
        //   890: ifeq            1078
        //   893: getstatic       dev/nuker/pyro/fc.1:I
        //   896: ifeq            904
        //   899: ldc             -372252690
        //   901: goto            906
        //   904: ldc             779065326
        //   906: ldc             585369538
        //   908: ixor           
        //   909: lookupswitch {
        //          -886319060: 904
        //          210473004: 936
        //          default: 1104
        //        }
        //   936: aload           8
        //   938: aload           6
        //   940: aload           8
        //   942: getstatic       dev/nuker/pyro/fc.c:I
        //   945: ifge            953
        //   948: ldc             2054094840
        //   950: goto            955
        //   953: ldc             -1048438430
        //   955: ldc             93335333
        //   957: ixor           
        //   958: lookupswitch {
        //          -1005439417: 984
        //          2147406045: 953
        //          default: 1110
        //        }
        //   984: goto            988
        //   987: athrow         
        //   988: invokevirtual   dev/nuker/pyro/f0n.0:()Ljava/lang/String;
        //   991: goto            995
        //   994: athrow         
        //   995: getstatic       dev/nuker/pyro/fc.0:I
        //   998: ifeq            1006
        //  1001: ldc             -1087064286
        //  1003: goto            1008
        //  1006: ldc             559598136
        //  1008: ldc             -1707810726
        //  1010: ixor           
        //  1011: lookupswitch {
        //          -1150408094: 1036
        //          620779384: 1006
        //          default: 1092
        //        }
        //  1036: goto            1040
        //  1039: athrow         
        //  1040: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //  1043: goto            1047
        //  1046: athrow         
        //  1047: dup            
        //  1048: pop            
        //  1049: goto            1053
        //  1052: athrow         
        //  1053: invokevirtual   dev/nuker/pyro/f0n.c:(Lcom/google/gson/JsonElement;)V
        //  1056: goto            1060
        //  1059: athrow         
        //  1060: goto            1078
        //  1063: astore          10
        //  1065: aload           10
        //  1067: goto            1071
        //  1070: athrow         
        //  1071: invokevirtual   java/lang/Throwable.printStackTrace:()V
        //  1074: goto            1078
        //  1077: athrow         
        //  1078: goto            781
        //  1081: iinc            4, 1
        //  1084: goto            414
        //  1087: return         
        //  1088: aconst_null    
        //  1089: athrow         
        //  1090: aconst_null    
        //  1091: athrow         
        //  1092: aconst_null    
        //  1093: athrow         
        //  1094: aconst_null    
        //  1095: athrow         
        //  1096: aconst_null    
        //  1097: athrow         
        //  1098: aconst_null    
        //  1099: athrow         
        //  1100: aconst_null    
        //  1101: athrow         
        //  1102: aconst_null    
        //  1103: athrow         
        //  1104: aconst_null    
        //  1105: athrow         
        //  1106: aconst_null    
        //  1107: athrow         
        //  1108: aconst_null    
        //  1109: athrow         
        //  1110: aconst_null    
        //  1111: athrow         
        //  1112: aconst_null    
        //  1113: athrow         
        //  1114: aconst_null    
        //  1115: athrow         
        //  1116: pop            
        //  1117: goto            24
        //  1120: pop            
        //  1121: aconst_null    
        //  1122: goto            1116
        //  1125: dup            
        //  1126: ifnull          1116
        //  1129: checkcast       Ljava/lang/Throwable;
        //  1132: athrow         
        //  1133: dup            
        //  1134: ifnull          1120
        //  1137: checkcast       Ljava/lang/Throwable;
        //  1140: athrow         
        //  1141: aconst_null    
        //  1142: athrow         
        //    StackMapTable: 00 B7 FF 00 03 00 03 07 00 03 07 00 5A 07 00 4B 00 01 07 00 21 FA 00 04 FF 00 0B 00 00 00 01 07 00 21 FD 00 03 07 00 03 07 00 5A 0A 41 01 1E FF 00 10 00 03 07 00 03 07 00 5A 07 00 4B 00 01 07 00 33 FF 00 00 00 03 07 00 03 07 00 5A 07 00 4B 00 03 07 00 6B 07 00 4B 07 00 2F 45 07 00 21 FF 00 00 00 03 07 00 03 07 00 5A 07 00 4B 00 03 07 00 6B 07 00 4B 07 00 2F 42 07 00 3A FF 00 00 00 03 07 00 03 07 00 5A 07 00 4B 00 03 07 00 6B 07 00 4B 07 00 2F 45 07 00 21 FF 00 00 00 03 07 00 03 07 00 5A 07 00 4B 00 02 07 00 6B 07 00 5A FF 00 04 00 00 00 01 07 00 21 FF 00 00 00 03 07 00 03 07 00 5A 07 00 4B 00 02 07 00 6B 07 00 5A 45 07 00 21 FF 00 00 00 03 07 00 03 07 00 5A 07 00 4B 00 02 07 00 6B 01 FF 00 0A 00 03 07 00 03 07 00 5A 07 00 4B 00 02 07 00 6B 01 FF 00 01 00 03 07 00 03 07 00 5A 07 00 4B 00 03 07 00 6B 01 01 FF 00 1D 00 03 07 00 03 07 00 5A 07 00 4B 00 02 07 00 6B 01 42 07 00 21 FF 00 00 00 03 07 00 03 07 00 5A 07 00 4B 00 02 07 00 6B 01 45 07 00 21 FF 00 00 00 03 07 00 03 07 00 5A 07 00 4B 00 02 07 00 6B 07 00 65 42 07 00 21 FF 00 00 00 03 07 00 03 07 00 5A 07 00 4B 00 02 07 00 6B 07 00 65 45 07 00 21 00 45 07 00 21 FF 00 00 00 03 07 00 03 07 00 5A 07 00 4B 00 02 07 00 4B 07 00 2F 45 07 00 21 FF 00 00 00 03 07 00 03 07 00 5A 07 00 4B 00 02 07 00 4B 07 00 2F FF 00 0A 00 03 07 00 03 07 00 5A 07 00 4B 00 02 07 00 4B 07 00 2F FF 00 01 00 03 07 00 03 07 00 5A 07 00 4B 00 03 07 00 4B 07 00 2F 01 FF 00 1E 00 03 07 00 03 07 00 5A 07 00 4B 00 02 07 00 4B 07 00 2F 42 07 00 21 FF 00 00 00 03 07 00 03 07 00 5A 07 00 4B 00 02 07 00 4B 07 00 2F 45 07 00 21 40 07 00 5A 44 07 00 21 40 07 00 5A 45 07 00 21 40 07 00 81 FF 00 0F 00 04 07 00 03 07 00 5A 07 00 4B 07 00 81 00 01 07 00 86 FF 00 01 00 04 07 00 03 07 00 5A 07 00 4B 07 00 81 00 02 07 00 86 01 5D 07 00 86 44 07 00 21 FF 00 00 00 04 07 00 03 07 00 5A 07 00 4B 07 00 81 00 03 07 00 86 07 00 81 01 45 07 00 21 FF 00 00 00 04 07 00 03 07 00 5A 07 00 4B 07 00 81 00 02 07 00 86 07 00 5A 44 07 00 21 FF 00 00 00 04 07 00 03 07 00 5A 07 00 4B 07 00 81 00 02 07 00 86 07 00 5A 45 07 00 21 00 FF 00 06 00 05 07 00 03 07 00 5A 07 00 4B 07 00 81 01 00 01 07 00 21 40 07 00 03 45 07 00 21 40 07 00 6B 42 07 00 21 40 07 00 6B 45 07 00 21 40 07 00 DD 4E 01 FF 00 01 00 05 07 00 03 07 00 5A 07 00 4B 07 00 81 01 00 02 01 01 5E 01 FC 00 01 01 0A 41 01 1C FF 00 14 00 06 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 00 02 07 00 81 01 FF 00 01 00 06 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 00 03 07 00 81 01 01 FF 00 1C 00 06 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 00 02 07 00 81 01 42 07 00 16 FF 00 00 00 06 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 00 02 07 00 81 01 45 07 00 21 40 07 00 5A 4C 07 00 33 FF 00 00 00 06 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 00 04 07 00 5A 08 02 0B 08 02 0B 07 00 2F 45 07 00 21 FF 00 00 00 06 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 00 04 07 00 5A 08 02 0B 08 02 0B 07 00 2F 42 07 00 21 FF 00 00 00 06 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 00 04 07 00 5A 08 02 0B 08 02 0B 07 00 2F 45 07 00 21 FF 00 00 00 06 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 00 02 07 00 5A 07 00 9C 40 07 00 5A FF 00 10 00 07 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 00 01 07 00 03 FF 00 01 00 07 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 00 02 07 00 03 01 5C 07 00 03 42 07 00 21 40 07 00 03 45 07 00 21 40 07 00 6B 4A 07 00 6B FF 00 01 00 07 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 00 02 07 00 6B 01 5B 07 00 6B 42 07 00 33 40 07 00 6B 45 07 00 21 40 07 00 DD 43 07 00 DD 44 07 00 DD FF 00 01 00 07 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 00 02 07 00 DD 01 59 07 00 DD 42 07 00 33 40 07 00 DD 45 07 00 21 40 07 00 DD FC 00 14 07 00 B8 41 01 1D 44 07 00 21 40 07 00 B8 47 07 00 21 40 07 00 BE FD 00 01 00 07 00 BE 44 07 00 3E 40 07 00 BE 47 07 00 21 40 01 47 07 00 16 40 07 00 BE 47 07 00 21 40 07 00 DD FF 00 10 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 00 41 01 1E 46 07 00 21 FF 00 00 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 02 07 00 4B 07 00 31 45 07 00 21 FF 00 00 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 02 07 00 4B 07 00 2F 42 07 00 21 FF 00 00 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 02 07 00 4B 07 00 2F 45 07 00 21 40 01 0D 41 01 1D FF 00 10 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 03 07 00 31 07 00 4B 07 00 31 FF 00 01 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 04 07 00 31 07 00 4B 07 00 31 01 FF 00 1C 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 03 07 00 31 07 00 4B 07 00 31 42 07 00 21 FF 00 00 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 03 07 00 31 07 00 4B 07 00 31 45 07 00 21 FF 00 00 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 03 07 00 31 07 00 4B 07 00 2F FF 00 0A 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 03 07 00 31 07 00 4B 07 00 2F FF 00 01 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 04 07 00 31 07 00 4B 07 00 2F 01 FF 00 1B 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 03 07 00 31 07 00 4B 07 00 2F FF 00 02 00 00 00 01 07 00 21 FF 00 00 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 03 07 00 31 07 00 4B 07 00 2F 45 07 00 21 FF 00 00 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 02 07 00 31 07 00 5A 44 07 00 21 FF 00 00 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 02 07 00 31 07 00 5A 45 07 00 21 00 42 07 00 21 FF 00 06 00 0B 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 07 00 21 00 01 07 00 16 40 07 00 21 45 07 00 21 FA 00 00 FF 00 02 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 00 07 00 BE 00 00 FF 00 05 00 06 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 00 00 FF 00 00 00 07 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 00 01 07 00 03 FF 00 01 00 03 07 00 03 07 00 5A 07 00 4B 00 02 07 00 4B 07 00 2F FF 00 01 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 03 07 00 31 07 00 4B 07 00 2F FF 00 01 00 06 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 00 00 FF 00 01 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 00 FF 00 01 00 03 07 00 03 07 00 5A 07 00 4B 00 02 07 00 6B 01 FA 00 01 FF 00 01 00 05 07 00 03 07 00 5A 07 00 4B 07 00 81 01 00 01 01 FF 00 01 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 00 FF 00 01 00 06 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 00 02 07 00 81 01 FF 00 01 00 04 07 00 03 07 00 5A 07 00 4B 07 00 81 00 01 07 00 86 FF 00 01 00 0A 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 07 00 B8 07 00 31 07 00 BE 00 03 07 00 31 07 00 4B 07 00 31 FF 00 01 00 07 07 00 03 07 00 5A 07 00 4B 07 00 81 01 01 07 00 4B 00 01 07 00 6B FC 00 01 07 00 B8 FF 00 01 00 02 07 00 03 07 00 5A 00 01 07 00 21 43 05 44 07 00 21 47 05 FF 00 07 00 03 07 00 03 07 00 5A 07 00 4B 00 01 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  819    1039   1063   1078   Ljava/lang/Throwable;
        //  1040   1060   1063   1078   Ljava/lang/Throwable;
        //  8      20     1125   1133   Any
        //  1125   1133   1125   1133   Ljava/lang/RuntimeException;
        //  1141   1143   3      8      Any
        //  85     92     92     93     Any
        //  86     92     85     86     Ljava/lang/RuntimeException;
        //  86     92     92     93     Ljava/lang/EnumConstantNotPresentException;
        //  86     92     85     86     Ljava/util/NoSuchElementException;
        //  86     92     3      8      Ljava/lang/NumberFormatException;
        //  96     103    103    104    Any
        //  96     103    96     97     Ljava/lang/IndexOutOfBoundsException;
        //  97     103    103    104    Ljava/lang/NullPointerException;
        //  97     103    96     97     Ljava/lang/StringIndexOutOfBoundsException;
        //  96     103    3      8      Any
        //  110    116    116    117    Any
        //  110    116    3      8      Ljava/lang/ClassCastException;
        //  110    116    3      8      Ljava/lang/RuntimeException;
        //  110    116    116    117    Ljava/lang/AssertionError;
        //  110    116    116    117    Any
        //  163    170    170    171    Any
        //  163    170    170    171    Any
        //  163    170    3      8      Ljava/util/NoSuchElementException;
        //  163    170    3      8      Ljava/lang/UnsupportedOperationException;
        //  163    170    163    164    Any
        //  174    181    181    182    Any
        //  175    181    174    175    Any
        //  175    181    174    175    Any
        //  175    181    174    175    Ljava/lang/NegativeArraySizeException;
        //  175    181    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  188    195    195    196    Any
        //  188    195    3      8      Any
        //  188    195    188    189    Any
        //  189    195    195    196    Any
        //  188    195    195    196    Ljava/lang/IllegalStateException;
        //  243    250    250    251    Any
        //  243    250    243    244    Any
        //  244    250    3      8      Ljava/lang/IllegalArgumentException;
        //  244    250    3      8      Ljava/lang/RuntimeException;
        //  243    250    250    251    Any
        //  256    263    263    264    Any
        //  257    263    256    257    Any
        //  257    263    263    264    Any
        //  256    263    256    257    Any
        //  257    263    263    264    Ljava/lang/ArithmeticException;
        //  317    324    324    325    Any
        //  318    324    3      8      Ljava/util/NoSuchElementException;
        //  317    324    324    325    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  318    324    317    318    Ljava/lang/AssertionError;
        //  317    324    317    318    Any
        //  330    337    337    338    Any
        //  330    337    337    338    Any
        //  330    337    330    331    Any
        //  330    337    337    338    Any
        //  331    337    337    338    Any
        //  345    352    352    353    Any
        //  345    352    3      8      Any
        //  345    352    352    353    Ljava/lang/UnsupportedOperationException;
        //  345    352    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  346    352    345    346    Any
        //  356    363    363    364    Any
        //  357    363    356    357    Any
        //  356    363    3      8      Ljava/lang/NumberFormatException;
        //  357    363    363    364    Ljava/util/NoSuchElementException;
        //  357    363    363    364    Any
        //  511    518    518    519    Any
        //  512    518    3      8      Any
        //  511    518    518    519    Ljava/lang/NegativeArraySizeException;
        //  511    518    3      8      Any
        //  512    518    511    512    Ljava/lang/AssertionError;
        //  532    539    539    540    Any
        //  533    539    532    533    Ljava/util/NoSuchElementException;
        //  533    539    532    533    Ljava/lang/ClassCastException;
        //  532    539    539    540    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  532    539    3      8      Any
        //  543    550    550    551    Any
        //  543    550    550    551    Any
        //  544    550    550    551    Any
        //  543    550    550    551    Any
        //  544    550    543    544    Any
        //  603    610    610    611    Any
        //  603    610    610    611    Ljava/util/ConcurrentModificationException;
        //  604    610    610    611    Any
        //  604    610    603    604    Any
        //  604    610    603    604    Ljava/lang/NullPointerException;
        //  655    662    662    663    Any
        //  655    662    3      8      Any
        //  656    662    655    656    Ljava/lang/StringIndexOutOfBoundsException;
        //  655    662    662    663    Ljava/lang/StringIndexOutOfBoundsException;
        //  656    662    655    656    Ljava/util/NoSuchElementException;
        //  703    710    710    711    Any
        //  704    710    710    711    Any
        //  704    710    703    704    Ljava/util/ConcurrentModificationException;
        //  703    710    703    704    Ljava/lang/NullPointerException;
        //  704    710    710    711    Any
        //  769    778    778    779    Any
        //  769    778    769    770    Any
        //  770    778    769    770    Any
        //  769    778    769    770    Any
        //  769    778    769    770    Ljava/lang/NegativeArraySizeException;
        //  786    795    795    796    Any
        //  787    795    786    787    Ljava/lang/StringIndexOutOfBoundsException;
        //  787    795    795    796    Ljava/lang/EnumConstantNotPresentException;
        //  787    795    795    796    Ljava/lang/IndexOutOfBoundsException;
        //  786    795    795    796    Ljava/lang/ClassCastException;
        //  804    813    813    814    Any
        //  805    813    3      8      Any
        //  805    813    3      8      Any
        //  805    813    804    805    Ljava/lang/AssertionError;
        //  805    813    813    814    Any
        //  871    878    878    879    Any
        //  872    878    871    872    Any
        //  871    878    878    879    Ljava/lang/RuntimeException;
        //  871    878    871    872    Any
        //  872    878    871    872    Ljava/util/NoSuchElementException;
        //  882    889    889    890    Any
        //  882    889    882    883    Any
        //  882    889    889    890    Ljava/lang/EnumConstantNotPresentException;
        //  883    889    889    890    Ljava/lang/NegativeArraySizeException;
        //  882    889    889    890    Any
        //  987    994    994    995    Any
        //  988    994    994    995    Any
        //  988    994    994    995    Any
        //  987    994    994    995    Ljava/lang/UnsupportedOperationException;
        //  988    994    987    988    Any
        //  1040   1046   1046   1047   Any
        //  1040   1046   3      8      Any
        //  1040   1046   1046   1047   Ljava/lang/IllegalArgumentException;
        //  1040   1046   3      8      Ljava/util/ConcurrentModificationException;
        //  1040   1046   1046   1047   Any
        //  1052   1059   1059   1060   Any
        //  1052   1059   1052   1053   Ljava/lang/IllegalStateException;
        //  1052   1059   3      8      Any
        //  1052   1059   1052   1053   Any
        //  1052   1059   1052   1053   Ljava/lang/EnumConstantNotPresentException;
        //  1070   1077   1077   1078   Any
        //  1070   1077   3      8      Ljava/util/NoSuchElementException;
        //  1071   1077   1077   1078   Any
        //  1071   1077   1070   1071   Ljava/lang/AssertionError;
        //  1071   1077   1077   1078   Ljava/util/NoSuchElementException;
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
    
    @Nullable
    public f0n c(@NotNull final String p0, @NotNull final Class p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: nop            
        //     4: nop            
        //     5: nop            
        //     6: athrow         
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            59
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            51
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_2        
        //    27: pop            
        //    28: aload_0        
        //    29: aload_1        
        //    30: goto            34
        //    33: athrow         
        //    34: invokevirtual   dev/nuker/pyro/f0q.c:(Ljava/lang/String;)Ldev/nuker/pyro/f0n;
        //    37: goto            41
        //    40: athrow         
        //    41: areturn        
        //    42: pop            
        //    43: goto            24
        //    46: pop            
        //    47: aconst_null    
        //    48: goto            42
        //    51: dup            
        //    52: ifnull          42
        //    55: checkcast       Ljava/lang/Throwable;
        //    58: athrow         
        //    59: dup            
        //    60: ifnull          46
        //    63: checkcast       Ljava/lang/Throwable;
        //    66: athrow         
        //    67: nop            
        //    68: athrow         
        //    StackMapTable: 00 0E FF 00 03 00 00 00 01 07 00 21 43 07 00 21 FE 00 00 07 00 03 07 00 2F 07 00 E3 FF 00 0B 00 00 00 01 07 00 21 FE 00 03 07 00 03 07 00 2F 07 00 E3 48 07 00 21 FF 00 00 00 03 07 00 03 07 00 2F 07 00 E3 00 02 07 00 03 07 00 2F 45 07 00 21 40 07 00 31 40 07 00 33 43 05 44 07 00 33 47 05 FF 00 07 00 00 00 01 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  8      20     51     59     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  51     59     51     59     Ljava/lang/IllegalStateException;
        //  33     40     40     41     Any
        //  33     40     33     34     Any
        //  33     40     40     41     Ljava/lang/IndexOutOfBoundsException;
        //  33     40     33     34     Ljava/lang/IndexOutOfBoundsException;
        //  33     40     40     41     Ljava/lang/NegativeArraySizeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 32 out of bounds for length 32
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
    
    @Nullable
    public f0n c(final int p0, @NotNull final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          592
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            584
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            576
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.1:I
        //    27: ifeq            35
        //    30: ldc             -638284331
        //    32: goto            37
        //    35: ldc             -1105630430
        //    37: ldc             -715628470
        //    39: ixor           
        //    40: lookupswitch {
        //          212659615: 35
        //          1799424872: 68
        //          default: 565
        //        }
        //    68: aload_2        
        //    69: pop            
        //    70: aload_0        
        //    71: getstatic       dev/nuker/pyro/fc.0:I
        //    74: ifeq            82
        //    77: ldc             -1990078467
        //    79: goto            84
        //    82: ldc             2141764767
        //    84: ldc             688342877
        //    86: ixor           
        //    87: lookupswitch {
        //          -1603893088: 555
        //          863157845: 82
        //          default: 112
        //        }
        //   112: goto            116
        //   115: athrow         
        //   116: invokevirtual   dev/nuker/pyro/f0q.5:()Ldev/nuker/pyro/fw;
        //   119: goto            123
        //   122: athrow         
        //   123: goto            127
        //   126: athrow         
        //   127: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   130: goto            134
        //   133: athrow         
        //   134: dup            
        //   135: ifnonnull       191
        //   138: getstatic       dev/nuker/pyro/fc.1:I
        //   141: ifeq            149
        //   144: ldc             1707033602
        //   146: goto            151
        //   149: ldc             173582282
        //   151: ldc             1743361605
        //   153: ixor           
        //   154: lookupswitch {
        //          39244359: 149
        //          1840329103: 180
        //          default: 553
        //        }
        //   180: goto            184
        //   183: athrow         
        //   184: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   187: goto            191
        //   190: athrow         
        //   191: checkcast       [Ljava/util/List;
        //   194: iload_1        
        //   195: aaload         
        //   196: goto            200
        //   199: athrow         
        //   200: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   205: goto            209
        //   208: athrow         
        //   209: astore          4
        //   211: aload           4
        //   213: goto            217
        //   216: athrow         
        //   217: invokeinterface java/util/Iterator.hasNext:()Z
        //   222: goto            226
        //   225: athrow         
        //   226: ifeq            234
        //   229: ldc             1903075529
        //   231: goto            236
        //   234: ldc             1903075528
        //   236: ldc             -242415645
        //   238: ixor           
        //   239: tableswitch {
        //          29838932: 260
        //          29838933: 551
        //          default: 229
        //        }
        //   260: aload           4
        //   262: getstatic       dev/nuker/pyro/fc.1:I
        //   265: ifeq            273
        //   268: ldc             1255314987
        //   270: goto            275
        //   273: ldc             -899827506
        //   275: ldc             1968061988
        //   277: ixor           
        //   278: lookupswitch {
        //          -1477297230: 273
        //          1067231247: 563
        //          default: 304
        //        }
        //   304: goto            308
        //   307: athrow         
        //   308: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   313: goto            317
        //   316: athrow         
        //   317: checkcast       Ldev/nuker/pyro/f0n;
        //   320: getstatic       dev/nuker/pyro/fc.0:I
        //   323: ifeq            331
        //   326: ldc             869991411
        //   328: goto            333
        //   331: ldc             -1457958654
        //   333: ldc             -1346509497
        //   335: ixor           
        //   336: lookupswitch {
        //          -1670977868: 331
        //          111457349: 364
        //          default: 557
        //        }
        //   364: astore_3       
        //   365: getstatic       dev/nuker/pyro/fc.0:I
        //   368: ifeq            376
        //   371: ldc             1714880513
        //   373: goto            378
        //   376: ldc             651861433
        //   378: ldc             2103814978
        //   380: ixor           
        //   381: lookupswitch {
        //          -1463926513: 376
        //          458402627: 561
        //          default: 408
        //        }
        //   408: aload_3        
        //   409: goto            413
        //   412: athrow         
        //   413: invokevirtual   dev/nuker/pyro/f0n.0:()Ljava/lang/String;
        //   416: goto            420
        //   419: athrow         
        //   420: aload_2        
        //   421: goto            425
        //   424: athrow         
        //   425: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   428: goto            432
        //   431: athrow         
        //   432: ifeq            548
        //   435: aload_3        
        //   436: dup            
        //   437: ifnonnull       445
        //   440: ldc             -709565900
        //   442: goto            447
        //   445: ldc             -709565897
        //   447: ldc             -1508336707
        //   449: ixor           
        //   450: tableswitch {
        //          -413601006: 472
        //          -413601005: 547
        //          default: 440
        //        }
        //   472: new             Lkotlin/TypeCastException;
        //   475: dup            
        //   476: ldc_w           "\u236d\u1486\u8a76\ub1c4\uce1f\ued66\ub225\ue659\udb77\uee23\ua7b1\u1e0c\ue171\uc7b3\u86eb\u89fd\u57a5\u7781\ubf38\uc7d0\u2b85\uc234\u6ada\u2f49\ud041\u3508\u7d66\u8937\u8215\u8b07\u842f\ufb72\u7051\u981e\u1c09\uf1e1\u493c\u88c2"
        //   479: getstatic       dev/nuker/pyro/fc.0:I
        //   482: ifeq            491
        //   485: ldc_w           1188369992
        //   488: goto            494
        //   491: ldc_w           -335674175
        //   494: ldc_w           61659651
        //   497: ixor           
        //   498: lookupswitch {
        //          -1870769214: 491
        //          1165610059: 559
        //          default: 524
        //        }
        //   524: goto            528
        //   527: athrow         
        //   528: invokestatic    invokestatic   !!! ERROR
        //   531: goto            535
        //   534: athrow         
        //   535: goto            539
        //   538: athrow         
        //   539: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   542: goto            546
        //   545: athrow         
        //   546: athrow         
        //   547: areturn        
        //   548: goto            211
        //   551: aconst_null    
        //   552: areturn        
        //   553: aconst_null    
        //   554: athrow         
        //   555: aconst_null    
        //   556: athrow         
        //   557: aconst_null    
        //   558: athrow         
        //   559: aconst_null    
        //   560: athrow         
        //   561: aconst_null    
        //   562: athrow         
        //   563: aconst_null    
        //   564: athrow         
        //   565: aconst_null    
        //   566: athrow         
        //   567: pop            
        //   568: goto            24
        //   571: pop            
        //   572: aconst_null    
        //   573: goto            567
        //   576: dup            
        //   577: ifnull          567
        //   580: checkcast       Ljava/lang/Throwable;
        //   583: athrow         
        //   584: dup            
        //   585: ifnull          571
        //   588: checkcast       Ljava/lang/Throwable;
        //   591: athrow         
        //   592: aconst_null    
        //   593: athrow         
        //    StackMapTable: 00 59 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FE 00 03 07 00 03 01 07 00 2F 0A 41 01 1E 4D 07 00 03 FF 00 01 00 03 07 00 03 01 07 00 2F 00 02 07 00 03 01 5B 07 00 03 FF 00 02 00 00 00 01 07 00 21 FF 00 00 00 03 07 00 03 01 07 00 2F 00 01 07 00 03 45 07 00 21 40 07 00 6B 42 07 00 21 40 07 00 6B 45 07 00 21 40 07 00 DD 4E 07 00 DD FF 00 01 00 03 07 00 03 01 07 00 2F 00 02 07 00 DD 01 5C 07 00 DD 42 07 00 21 40 07 00 DD 45 07 00 21 40 07 00 DD 47 07 00 21 40 07 00 B8 47 07 00 21 40 07 00 BE FD 00 01 00 07 00 BE 44 07 00 21 40 07 00 BE 47 07 00 21 40 01 02 04 41 01 17 4C 07 00 BE FF 00 01 00 05 07 00 03 01 07 00 2F 00 07 00 BE 00 02 07 00 BE 01 5C 07 00 BE 42 07 00 18 40 07 00 BE 47 07 00 21 40 07 00 DD 4D 07 00 31 FF 00 01 00 05 07 00 03 01 07 00 2F 00 07 00 BE 00 02 07 00 31 01 5E 07 00 31 FF 00 0B 00 05 07 00 03 01 07 00 2F 07 00 31 07 00 BE 00 00 41 01 1D 43 07 00 21 40 07 00 31 45 07 00 21 40 07 00 2F 43 07 00 14 FF 00 00 00 05 07 00 03 01 07 00 2F 07 00 31 07 00 BE 00 02 07 00 2F 07 00 2F 45 07 00 21 40 01 47 07 00 31 44 07 00 31 FF 00 01 00 05 07 00 03 01 07 00 2F 07 00 31 07 00 BE 00 02 07 00 31 01 58 07 00 31 FF 00 12 00 05 07 00 03 01 07 00 2F 07 00 31 07 00 BE 00 04 07 00 31 08 01 D8 08 01 D8 07 00 2F FF 00 02 00 05 07 00 03 01 07 00 2F 07 00 31 07 00 BE 00 05 07 00 31 08 01 D8 08 01 D8 07 00 2F 01 FF 00 1D 00 05 07 00 03 01 07 00 2F 07 00 31 07 00 BE 00 04 07 00 31 08 01 D8 08 01 D8 07 00 2F 42 07 00 21 FF 00 00 00 05 07 00 03 01 07 00 2F 07 00 31 07 00 BE 00 04 07 00 31 08 01 D8 08 01 D8 07 00 2F 45 07 00 21 FF 00 00 00 05 07 00 03 01 07 00 2F 07 00 31 07 00 BE 00 04 07 00 31 08 01 D8 08 01 D8 07 00 2F 42 07 00 21 FF 00 00 00 05 07 00 03 01 07 00 2F 07 00 31 07 00 BE 00 04 07 00 31 08 01 D8 08 01 D8 07 00 2F 45 07 00 21 FF 00 00 00 05 07 00 03 01 07 00 2F 07 00 31 07 00 BE 00 02 07 00 31 07 00 9C 40 07 00 31 00 FF 00 02 00 05 07 00 03 01 07 00 2F 00 07 00 BE 00 00 FF 00 01 00 03 07 00 03 01 07 00 2F 00 01 07 00 DD 41 07 00 03 FF 00 01 00 05 07 00 03 01 07 00 2F 00 07 00 BE 00 01 07 00 31 FF 00 01 00 05 07 00 03 01 07 00 2F 07 00 31 07 00 BE 00 04 07 00 31 08 01 D8 08 01 D8 07 00 2F 01 FF 00 01 00 05 07 00 03 01 07 00 2F 00 07 00 BE 00 01 07 00 BE F9 00 01 41 07 00 33 43 05 44 07 00 33 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     576    584    Ljava/lang/NegativeArraySizeException;
        //  576    584    576    584    Ljava/lang/NullPointerException;
        //  592    594    3      8      Any
        //  116    122    122    123    Any
        //  116    122    122    123    Ljava/lang/IndexOutOfBoundsException;
        //  116    122    122    123    Ljava/lang/RuntimeException;
        //  116    122    122    123    Any
        //  116    122    3      8      Any
        //  126    133    133    134    Any
        //  126    133    126    127    Any
        //  126    133    133    134    Ljava/lang/RuntimeException;
        //  126    133    126    127    Ljava/lang/NegativeArraySizeException;
        //  127    133    126    127    Ljava/lang/ArithmeticException;
        //  183    190    190    191    Any
        //  184    190    3      8      Ljava/lang/NegativeArraySizeException;
        //  183    190    183    184    Ljava/lang/IllegalStateException;
        //  184    190    183    184    Any
        //  183    190    190    191    Any
        //  199    208    208    209    Any
        //  200    208    208    209    Any
        //  200    208    199    200    Any
        //  200    208    199    200    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  199    208    199    200    Any
        //  216    225    225    226    Any
        //  217    225    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  217    225    216    217    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  217    225    216    217    Any
        //  217    225    3      8      Any
        //  307    316    316    317    Any
        //  308    316    3      8      Ljava/lang/AssertionError;
        //  307    316    307    308    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  307    316    3      8      Ljava/lang/RuntimeException;
        //  307    316    316    317    Ljava/util/ConcurrentModificationException;
        //  412    419    419    420    Any
        //  412    419    419    420    Any
        //  413    419    412    413    Any
        //  412    419    412    413    Any
        //  413    419    412    413    Ljava/lang/AssertionError;
        //  424    431    431    432    Any
        //  425    431    424    425    Ljava/lang/ClassCastException;
        //  424    431    431    432    Any
        //  425    431    3      8      Any
        //  424    431    431    432    Any
        //  527    534    534    535    Any
        //  528    534    3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  528    534    527    528    Any
        //  528    534    534    535    Any
        //  527    534    527    528    Ljava/lang/NumberFormatException;
        //  538    545    545    546    Any
        //  539    545    538    539    Ljava/util/ConcurrentModificationException;
        //  539    545    545    546    Ljava/lang/ArithmeticException;
        //  538    545    538    539    Any
        //  539    545    545    546    Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:776)
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
    
    @NotNull
    @Override
    public f0V 4() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          761
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            753
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            745
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       dev/nuker/pyro/fc.0:I
        //    28: ifeq            37
        //    31: ldc_w           -1061484406
        //    34: goto            40
        //    37: ldc_w           1984431640
        //    40: ldc_w           -549452489
        //    43: ixor           
        //    44: lookupswitch {
        //          536546749: 730
        //          689769620: 37
        //          default: 72
        //        }
        //    72: goto            76
        //    75: athrow         
        //    76: invokevirtual   dev/nuker/pyro/f0q.5:()Ldev/nuker/pyro/fw;
        //    79: goto            83
        //    82: athrow         
        //    83: goto            87
        //    86: athrow         
        //    87: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //    90: goto            94
        //    93: athrow         
        //    94: checkcast       [Ljava/lang/Object;
        //    97: arraylength    
        //    98: anewarray       Ljava/util/List;
        //   101: astore_1       
        //   102: iconst_0       
        //   103: istore_2       
        //   104: aload_0        
        //   105: goto            109
        //   108: athrow         
        //   109: invokevirtual   dev/nuker/pyro/f0q.5:()Ldev/nuker/pyro/fw;
        //   112: goto            116
        //   115: athrow         
        //   116: goto            120
        //   119: athrow         
        //   120: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   123: goto            127
        //   126: athrow         
        //   127: dup            
        //   128: ifnonnull       137
        //   131: ldc_w           -235254106
        //   134: goto            140
        //   137: ldc_w           -235254111
        //   140: ldc_w           -935093227
        //   143: ixor           
        //   144: tableswitch {
        //          1936958822: 168
        //          1936958823: 179
        //          default: 131
        //        }
        //   168: goto            172
        //   171: athrow         
        //   172: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   175: goto            179
        //   178: athrow         
        //   179: checkcast       [Ljava/util/List;
        //   182: arraylength    
        //   183: istore_3       
        //   184: iload_2        
        //   185: iload_3        
        //   186: if_icmpge       195
        //   189: ldc_w           459960153
        //   192: goto            198
        //   195: ldc_w           459960152
        //   198: ldc_w           -1998414895
        //   201: ixor           
        //   202: tableswitch {
        //          655485200: 224
        //          655485201: 559
        //          default: 189
        //        }
        //   224: aload_0        
        //   225: goto            229
        //   228: athrow         
        //   229: invokevirtual   dev/nuker/pyro/f0q.5:()Ldev/nuker/pyro/fw;
        //   232: goto            236
        //   235: athrow         
        //   236: goto            240
        //   239: athrow         
        //   240: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   243: goto            247
        //   246: athrow         
        //   247: dup            
        //   248: ifnonnull       257
        //   251: ldc_w           -1062591019
        //   254: goto            260
        //   257: ldc_w           -1062591020
        //   260: ldc_w           -715099131
        //   263: ixor           
        //   264: tableswitch {
        //          731161504: 288
        //          731161505: 299
        //          default: 251
        //        }
        //   288: goto            292
        //   291: athrow         
        //   292: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   295: goto            299
        //   298: athrow         
        //   299: checkcast       [Ljava/util/List;
        //   302: iload_2        
        //   303: aaload         
        //   304: astore          4
        //   306: new             Ljava/util/ArrayList;
        //   309: dup            
        //   310: goto            314
        //   313: athrow         
        //   314: invokespecial   java/util/ArrayList.<init>:()V
        //   317: goto            321
        //   320: athrow         
        //   321: checkcast       Ljava/util/List;
        //   324: astore          5
        //   326: iconst_0       
        //   327: istore          6
        //   329: aload           4
        //   331: checkcast       Ljava/util/Collection;
        //   334: goto            338
        //   337: athrow         
        //   338: invokeinterface java/util/Collection.size:()I
        //   343: goto            347
        //   346: athrow         
        //   347: istore          7
        //   349: iload           6
        //   351: iload           7
        //   353: if_icmpge       548
        //   356: aload           5
        //   358: getstatic       dev/nuker/pyro/fc.c:I
        //   361: ifge            370
        //   364: ldc_w           -11006112
        //   367: goto            373
        //   370: ldc_w           -255949586
        //   373: ldc_w           555534105
        //   376: ixor           
        //   377: lookupswitch {
        //          -777894921: 404
        //          -565917575: 370
        //          default: 722
        //        }
        //   404: aload           4
        //   406: getstatic       dev/nuker/pyro/fc.c:I
        //   409: ifge            418
        //   412: ldc_w           1151988607
        //   415: goto            421
        //   418: ldc_w           134031155
        //   421: ldc_w           -524609754
        //   424: ixor           
        //   425: lookupswitch {
        //          -1542265767: 728
        //          -445375647: 418
        //          default: 452
        //        }
        //   452: iload           6
        //   454: goto            458
        //   457: athrow         
        //   458: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   463: goto            467
        //   466: athrow         
        //   467: checkcast       Ldev/nuker/pyro/f0n;
        //   470: goto            474
        //   473: athrow         
        //   474: invokevirtual   dev/nuker/pyro/f0n.4:()Ldev/nuker/pyro/f0V;
        //   477: goto            481
        //   480: athrow         
        //   481: getstatic       dev/nuker/pyro/fc.c:I
        //   484: ifge            493
        //   487: ldc_w           -639435688
        //   490: goto            496
        //   493: ldc_w           -1555129690
        //   496: ldc_w           1465100724
        //   499: ixor           
        //   500: lookupswitch {
        //          -1900980756: 493
        //          -199412974: 528
        //          default: 732
        //        }
        //   528: goto            532
        //   531: athrow         
        //   532: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   537: goto            541
        //   540: athrow         
        //   541: pop            
        //   542: iinc            6, 1
        //   545: goto            349
        //   548: aload_1        
        //   549: iload_2        
        //   550: aload           5
        //   552: aastore        
        //   553: iinc            2, 1
        //   556: goto            184
        //   559: new             Ldev/nuker/pyro/f0T;
        //   562: dup            
        //   563: aload_0        
        //   564: getstatic       dev/nuker/pyro/fc.1:I
        //   567: ifeq            576
        //   570: ldc_w           1174014693
        //   573: goto            579
        //   576: ldc_w           -1717290411
        //   579: ldc_w           -2086070714
        //   582: ixor           
        //   583: lookupswitch {
        //          -967631709: 576
        //          437070867: 608
        //          default: 734
        //        }
        //   608: getfield        dev/nuker/pyro/f0q.c:Ldev/nuker/pyro/f0f;
        //   611: aload_1        
        //   612: getstatic       dev/nuker/pyro/fc.1:I
        //   615: ifeq            624
        //   618: ldc_w           1902595123
        //   621: goto            627
        //   624: ldc_w           249302758
        //   627: ldc_w           -954921122
        //   630: ixor           
        //   631: lookupswitch {
        //          -1234025619: 624
        //          -909573704: 656
        //          default: 726
        //        }
        //   656: aload_0        
        //   657: getstatic       dev/nuker/pyro/fc.0:I
        //   660: ifeq            669
        //   663: ldc_w           1701231666
        //   666: goto            672
        //   669: ldc_w           747293021
        //   672: ldc_w           -360152715
        //   675: ixor           
        //   676: lookupswitch {
        //          -1880212153: 724
        //          -1273157255: 669
        //          default: 704
        //        }
        //   704: getfield        dev/nuker/pyro/f0q.0:Ldev/nuker/pyro/fw;
        //   707: goto            711
        //   710: athrow         
        //   711: invokespecial   dev/nuker/pyro/f0T.<init>:(Ldev/nuker/pyro/f0f;[Ljava/util/List;Ldev/nuker/pyro/fw;)V
        //   714: goto            718
        //   717: athrow         
        //   718: checkcast       Ldev/nuker/pyro/f0V;
        //   721: areturn        
        //   722: aconst_null    
        //   723: athrow         
        //   724: aconst_null    
        //   725: athrow         
        //   726: aconst_null    
        //   727: athrow         
        //   728: aconst_null    
        //   729: athrow         
        //   730: aconst_null    
        //   731: athrow         
        //   732: aconst_null    
        //   733: athrow         
        //   734: aconst_null    
        //   735: athrow         
        //   736: pop            
        //   737: goto            24
        //   740: pop            
        //   741: aconst_null    
        //   742: goto            736
        //   745: dup            
        //   746: ifnull          736
        //   749: checkcast       Ljava/lang/Throwable;
        //   752: athrow         
        //   753: dup            
        //   754: ifnull          740
        //   757: checkcast       Ljava/lang/Throwable;
        //   760: athrow         
        //   761: aconst_null    
        //   762: athrow         
        //    StackMapTable: 00 6D 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FC 00 03 07 00 03 4C 07 00 03 FF 00 02 00 01 07 00 03 00 02 07 00 03 01 5F 07 00 03 42 07 00 3A 40 07 00 03 45 07 00 21 40 07 00 6B 42 07 00 21 40 07 00 6B 45 07 00 21 40 07 00 DD FF 00 0D 00 00 00 01 07 00 21 FF 00 00 00 03 07 00 03 07 00 B3 01 00 01 07 00 03 45 07 00 21 40 07 00 6B 42 07 00 21 40 07 00 6B 45 07 00 21 40 07 00 DD 43 07 00 DD 45 07 00 DD FF 00 02 00 03 07 00 03 07 00 B3 01 00 02 07 00 DD 01 5B 07 00 DD 42 07 00 21 40 07 00 DD 45 07 00 21 40 07 00 DD FC 00 04 01 04 05 42 01 19 FF 00 03 00 00 00 01 07 00 21 FF 00 00 00 04 07 00 03 07 00 B3 01 01 00 01 07 00 03 45 07 00 21 40 07 00 6B 42 07 00 33 40 07 00 6B 45 07 00 21 40 07 00 DD 43 07 00 DD 45 07 00 DD FF 00 02 00 04 07 00 03 07 00 B3 01 01 00 02 07 00 DD 01 5B 07 00 DD 42 07 00 21 40 07 00 DD 45 07 00 21 40 07 00 DD FF 00 0D 00 05 07 00 03 07 00 B3 01 01 07 00 B8 00 01 07 00 12 FF 00 00 00 05 07 00 03 07 00 B3 01 01 07 00 B8 00 02 08 01 32 08 01 32 45 07 00 21 40 07 01 14 FF 00 0F 00 00 00 01 07 00 21 FF 00 00 00 07 07 00 03 07 00 B3 01 01 07 00 B8 07 00 B8 01 00 01 07 01 18 47 07 00 21 40 01 FC 00 01 01 54 07 00 B8 FF 00 02 00 08 07 00 03 07 00 B3 01 01 07 00 B8 07 00 B8 01 01 00 02 07 00 B8 01 5E 07 00 B8 FF 00 0D 00 08 07 00 03 07 00 B3 01 01 07 00 B8 07 00 B8 01 01 00 02 07 00 B8 07 00 B8 FF 00 02 00 08 07 00 03 07 00 B3 01 01 07 00 B8 07 00 B8 01 01 00 03 07 00 B8 07 00 B8 01 FF 00 1E 00 08 07 00 03 07 00 B3 01 01 07 00 B8 07 00 B8 01 01 00 02 07 00 B8 07 00 B8 44 07 00 12 FF 00 00 00 08 07 00 03 07 00 B3 01 01 07 00 B8 07 00 B8 01 01 00 03 07 00 B8 07 00 B8 01 47 07 00 21 FF 00 00 00 08 07 00 03 07 00 B3 01 01 07 00 B8 07 00 B8 01 01 00 02 07 00 B8 07 00 DD 45 07 00 21 FF 00 00 00 08 07 00 03 07 00 B3 01 01 07 00 B8 07 00 B8 01 01 00 02 07 00 B8 07 00 31 45 07 00 21 FF 00 00 00 08 07 00 03 07 00 B3 01 01 07 00 B8 07 00 B8 01 01 00 02 07 00 B8 07 01 3D FF 00 0B 00 08 07 00 03 07 00 B3 01 01 07 00 B8 07 00 B8 01 01 00 02 07 00 B8 07 01 3D FF 00 02 00 08 07 00 03 07 00 B3 01 01 07 00 B8 07 00 B8 01 01 00 03 07 00 B8 07 01 3D 01 FF 00 1F 00 08 07 00 03 07 00 B3 01 01 07 00 B8 07 00 B8 01 01 00 02 07 00 B8 07 01 3D FF 00 02 00 00 00 01 07 00 21 FF 00 00 00 08 07 00 03 07 00 B3 01 01 07 00 B8 07 00 B8 01 01 00 02 07 00 B8 07 01 3D 47 07 00 21 40 01 06 FF 00 0A 00 04 07 00 03 07 00 B3 01 01 00 00 FF 00 10 00 04 07 00 03 07 00 B3 01 01 00 03 08 02 2F 08 02 2F 07 00 03 FF 00 02 00 04 07 00 03 07 00 B3 01 01 00 04 08 02 2F 08 02 2F 07 00 03 01 FF 00 1C 00 04 07 00 03 07 00 B3 01 01 00 03 08 02 2F 08 02 2F 07 00 03 FF 00 0F 00 04 07 00 03 07 00 B3 01 01 00 04 08 02 2F 08 02 2F 07 00 86 07 00 B3 FF 00 02 00 04 07 00 03 07 00 B3 01 01 00 05 08 02 2F 08 02 2F 07 00 86 07 00 B3 01 FF 00 1C 00 04 07 00 03 07 00 B3 01 01 00 04 08 02 2F 08 02 2F 07 00 86 07 00 B3 FF 00 0C 00 04 07 00 03 07 00 B3 01 01 00 05 08 02 2F 08 02 2F 07 00 86 07 00 B3 07 00 03 FF 00 02 00 04 07 00 03 07 00 B3 01 01 00 06 08 02 2F 08 02 2F 07 00 86 07 00 B3 07 00 03 01 FF 00 1F 00 04 07 00 03 07 00 B3 01 01 00 05 08 02 2F 08 02 2F 07 00 86 07 00 B3 07 00 03 45 07 00 21 FF 00 00 00 04 07 00 03 07 00 B3 01 01 00 05 08 02 2F 08 02 2F 07 00 86 07 00 B3 07 00 6B 45 07 00 21 40 07 01 2F FF 00 03 00 08 07 00 03 07 00 B3 01 01 07 00 B8 07 00 B8 01 01 00 01 07 00 B8 FF 00 01 00 04 07 00 03 07 00 B3 01 01 00 05 08 02 2F 08 02 2F 07 00 86 07 00 B3 07 00 03 FF 00 01 00 04 07 00 03 07 00 B3 01 01 00 04 08 02 2F 08 02 2F 07 00 86 07 00 B3 FF 00 01 00 08 07 00 03 07 00 B3 01 01 07 00 B8 07 00 B8 01 01 00 02 07 00 B8 07 00 B8 FF 00 01 00 01 07 00 03 00 01 07 00 03 FF 00 01 00 08 07 00 03 07 00 B3 01 01 07 00 B8 07 00 B8 01 01 00 02 07 00 B8 07 01 3D FF 00 01 00 04 07 00 03 07 00 B3 01 01 00 03 08 02 2F 08 02 2F 07 00 03 FF 00 01 00 01 07 00 03 00 01 07 00 21 43 05 44 07 00 21 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     745    753    Ljava/lang/IllegalArgumentException;
        //  745    753    745    753    Any
        //  761    763    3      8      Any
        //  75     82     82     83     Any
        //  76     82     82     83     Ljava/lang/AssertionError;
        //  76     82     75     76     Ljava/lang/IndexOutOfBoundsException;
        //  75     82     82     83     Ljava/lang/RuntimeException;
        //  75     82     3      8      Any
        //  86     93     93     94     Any
        //  86     93     3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  86     93     93     94     Ljava/lang/IndexOutOfBoundsException;
        //  86     93     86     87     Any
        //  87     93     86     87     Any
        //  109    115    115    116    Any
        //  109    115    3      8      Ljava/lang/NullPointerException;
        //  109    115    3      8      Any
        //  109    115    115    116    Any
        //  109    115    115    116    Any
        //  119    126    126    127    Any
        //  119    126    119    120    Any
        //  120    126    126    127    Any
        //  119    126    119    120    Ljava/lang/NullPointerException;
        //  119    126    3      8      Ljava/lang/AssertionError;
        //  171    178    178    179    Any
        //  171    178    178    179    Ljava/lang/NegativeArraySizeException;
        //  171    178    171    172    Any
        //  172    178    178    179    Ljava/util/NoSuchElementException;
        //  171    178    178    179    Any
        //  229    235    235    236    Any
        //  229    235    3      8      Ljava/lang/ClassCastException;
        //  229    235    3      8      Any
        //  229    235    3      8      Ljava/lang/NullPointerException;
        //  229    235    235    236    Any
        //  239    246    246    247    Any
        //  239    246    239    240    Ljava/lang/UnsupportedOperationException;
        //  240    246    3      8      Any
        //  240    246    246    247    Ljava/lang/ArithmeticException;
        //  239    246    239    240    Ljava/lang/NegativeArraySizeException;
        //  291    298    298    299    Any
        //  291    298    291    292    Ljava/lang/RuntimeException;
        //  291    298    291    292    Any
        //  291    298    298    299    Ljava/lang/NullPointerException;
        //  292    298    291    292    Ljava/util/NoSuchElementException;
        //  313    320    320    321    Any
        //  314    320    313    314    Ljava/lang/NegativeArraySizeException;
        //  314    320    320    321    Any
        //  314    320    320    321    Any
        //  313    320    320    321    Ljava/lang/NegativeArraySizeException;
        //  338    346    346    347    Any
        //  338    346    3      8      Any
        //  338    346    346    347    Any
        //  338    346    3      8      Any
        //  338    346    346    347    Ljava/lang/IllegalStateException;
        //  457    466    466    467    Any
        //  457    466    3      8      Any
        //  457    466    457    458    Ljava/lang/NegativeArraySizeException;
        //  458    466    466    467    Ljava/util/NoSuchElementException;
        //  458    466    466    467    Any
        //  473    480    480    481    Any
        //  473    480    473    474    Any
        //  473    480    473    474    Ljava/util/NoSuchElementException;
        //  474    480    3      8      Ljava/util/NoSuchElementException;
        //  473    480    473    474    Any
        //  532    540    540    541    Any
        //  532    540    540    541    Any
        //  532    540    3      8      Any
        //  532    540    540    541    Any
        //  532    540    3      8      Ljava/lang/NullPointerException;
        //  710    717    717    718    Any
        //  710    717    710    711    Any
        //  710    717    717    718    Ljava/lang/IllegalArgumentException;
        //  711    717    717    718    Ljava/lang/IllegalArgumentException;
        //  710    717    3      8      Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:776)
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
    
    public f0q(@NotNull final String p0, @NotNull final String p1, @Nullable final String p2, @NotNull final Enum p3, @NotNull final List[] p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: pop            
        //     2: getstatic       dev/nuker/pyro/fc.c:I
        //     5: ifge            14
        //     8: ldc_w           2107657271
        //    11: goto            17
        //    14: ldc_w           1685349350
        //    17: ldc_w           1947675842
        //    20: ixor           
        //    21: lookupswitch {
        //          163012853: 14
        //          274943780: 48
        //          default: 859
        //        }
        //    48: aload_2        
        //    49: pop            
        //    50: getstatic       dev/nuker/pyro/fc.c:I
        //    53: ifge            62
        //    56: ldc_w           515858797
        //    59: goto            65
        //    62: ldc_w           -720834632
        //    65: ldc_w           -1698364347
        //    68: ixor           
        //    69: lookupswitch {
        //          -2072353496: 62
        //          1338895357: 96
        //          default: 857
        //        }
        //    96: aload           4
        //    98: pop            
        //    99: aload           5
        //   101: pop            
        //   102: aload_0        
        //   103: getstatic       dev/nuker/pyro/fc.1:I
        //   106: ifeq            115
        //   109: ldc_w           -1701416851
        //   112: goto            118
        //   115: ldc_w           -2146686011
        //   118: ldc_w           -818656013
        //   121: ixor           
        //   122: lookupswitch {
        //          1329096502: 148
        //          1436695710: 115
        //          default: 855
        //        }
        //   148: aload_1        
        //   149: aload_2        
        //   150: aload           5
        //   152: invokespecial   dev/nuker/pyro/f0l.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
        //   155: aload_0        
        //   156: new             Ldev/nuker/pyro/f0f;
        //   159: dup            
        //   160: aload_1        
        //   161: aload_2        
        //   162: aload_3        
        //   163: aload           4
        //   165: getstatic       dev/nuker/pyro/fc.0:I
        //   168: ifeq            177
        //   171: ldc_w           -1987846256
        //   174: goto            180
        //   177: ldc_w           227252033
        //   180: ldc_w           -1359957175
        //   183: ixor           
        //   184: lookupswitch {
        //          -1552210936: 212
        //          661875929: 177
        //          default: 863
        //        }
        //   212: invokespecial   dev/nuker/pyro/f0f.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Enum;)V
        //   215: putfield        dev/nuker/pyro/f0q.c:Ldev/nuker/pyro/f0f;
        //   218: aload_0        
        //   219: getfield        dev/nuker/pyro/f0q.c:Ldev/nuker/pyro/f0f;
        //   222: new             Ldev/nuker/pyro/f0o;
        //   225: dup            
        //   226: aload_0        
        //   227: invokespecial   dev/nuker/pyro/f0o.<init>:(Ldev/nuker/pyro/f0q;)V
        //   230: checkcast       Ljava/util/function/Consumer;
        //   233: invokevirtual   dev/nuker/pyro/f0f.c:(Ljava/util/function/Consumer;)V
        //   236: aload_0        
        //   237: invokevirtual   dev/nuker/pyro/f0q.5:()Ldev/nuker/pyro/fw;
        //   240: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   243: checkcast       [Ljava/util/List;
        //   246: astore          8
        //   248: aload           8
        //   250: arraylength    
        //   251: istore          9
        //   253: iconst_0       
        //   254: getstatic       dev/nuker/pyro/fc.c:I
        //   257: ifge            266
        //   260: ldc_w           -1848630261
        //   263: goto            269
        //   266: ldc_w           -1375036601
        //   269: ldc_w           498375213
        //   272: ixor           
        //   273: lookupswitch {
        //          -1939554778: 266
        //          -1279393430: 300
        //          default: 873
        //        }
        //   300: istore          7
        //   302: iload           7
        //   304: iload           9
        //   306: if_icmpge       790
        //   309: aload           8
        //   311: getstatic       dev/nuker/pyro/fc.c:I
        //   314: ifge            323
        //   317: ldc_w           -1011436765
        //   320: goto            326
        //   323: ldc_w           477937627
        //   326: ldc_w           579830759
        //   329: ixor           
        //   330: lookupswitch {
        //          -516345660: 323
        //          1056128060: 356
        //          default: 871
        //        }
        //   356: iload           7
        //   358: aaload         
        //   359: getstatic       dev/nuker/pyro/fc.1:I
        //   362: ifeq            371
        //   365: ldc_w           1825792051
        //   368: goto            374
        //   371: ldc_w           1890735746
        //   374: ldc_w           563035747
        //   377: ixor           
        //   378: lookupswitch {
        //          1174220108: 371
        //          1297899088: 875
        //          default: 404
        //        }
        //   404: astore          6
        //   406: getstatic       dev/nuker/pyro/fc.1:I
        //   409: ifeq            418
        //   412: ldc_w           -1663759877
        //   415: goto            421
        //   418: ldc_w           -805542463
        //   421: ldc_w           555502238
        //   424: ixor           
        //   425: lookupswitch {
        //          -2082618691: 418
        //          -1110883483: 853
        //          default: 452
        //        }
        //   452: aload           6
        //   454: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   459: getstatic       dev/nuker/pyro/fc.0:I
        //   462: ifeq            471
        //   465: ldc_w           -804341811
        //   468: goto            474
        //   471: ldc_w           1042926208
        //   474: ldc_w           298458113
        //   477: ixor           
        //   478: lookupswitch {
        //          -1044075572: 471
        //          803460737: 504
        //          default: 865
        //        }
        //   504: astore          11
        //   506: getstatic       dev/nuker/pyro/fc.1:I
        //   509: ifeq            518
        //   512: ldc_w           -411025475
        //   515: goto            521
        //   518: ldc_w           -564668124
        //   521: ldc_w           1875566495
        //   524: ixor           
        //   525: lookupswitch {
        //          -2008358878: 518
        //          -1315109189: 552
        //          default: 879
        //        }
        //   552: aload           11
        //   554: getstatic       dev/nuker/pyro/fc.1:I
        //   557: ifeq            566
        //   560: ldc_w           -612441238
        //   563: goto            569
        //   566: ldc_w           -1449885850
        //   569: ldc_w           -72753575
        //   572: ixor           
        //   573: lookupswitch {
        //          550976819: 566
        //          1379770687: 600
        //          default: 867
        //        }
        //   600: invokeinterface java/util/Iterator.hasNext:()Z
        //   605: ifeq            614
        //   608: ldc_w           1701293278
        //   611: goto            617
        //   614: ldc_w           1701293277
        //   617: ldc_w           -1645787269
        //   620: ixor           
        //   621: tableswitch {
        //          -251537590: 644
        //          -251537589: 784
        //          default: 608
        //        }
        //   644: aload           11
        //   646: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   651: checkcast       Ldev/nuker/pyro/f0n;
        //   654: getstatic       dev/nuker/pyro/fc.0:I
        //   657: ifeq            666
        //   660: ldc_w           516249685
        //   663: goto            669
        //   666: ldc_w           -562029114
        //   669: ldc_w           875062693
        //   672: ixor           
        //   673: lookupswitch {
        //          -907462992: 666
        //          720190960: 861
        //          default: 700
        //        }
        //   700: astore          10
        //   702: aload           10
        //   704: dup            
        //   705: ifnonnull       722
        //   708: new             Lkotlin/TypeCastException;
        //   711: dup            
        //   712: ldc_w           "\u236d\u1486\u8a76\ub3d5\uc860\ued66\ub225\ue659\ud966\ue85c\ua7b1\u1e0c\ue171\uc5a2\u8094\u89fd\u57a5\u7781\ubd29\uc1af\u2b85\uc234\u6ada\u2d58\ud63e\u3508\u7d66\u8937\u8004\u8d78\u842f\ufb72\u7051\u9a0f\u1a76\uf1e1\u493c\u88f2\uca83\ufed2\ub615\u41fd\ub976\ub343\u4d93\u8a64\u7c27\ucea2\u7d57\ueb33\ue654\u1696\ueec0\u379e\u4740\ue131\u0a04\u8643\u19c1\u0eb5\u7797\u7283\uc77a\ubbf4\u9b0d\u6a93\ue2f2\ud0b7\ua524\u2420\u8932\u4ffd\u8bed\u1407\ua223\u7045\u55af\u1cfa\u6181\u1058\u88f4\u052f\uf808"
        //   715: invokestatic    invokestatic   !!! ERROR
        //   718: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   721: athrow         
        //   722: new             Ldev/nuker/pyro/f0p;
        //   725: dup            
        //   726: aload_0        
        //   727: getstatic       dev/nuker/pyro/fc.0:I
        //   730: ifeq            739
        //   733: ldc_w           -1862078318
        //   736: goto            742
        //   739: ldc_w           1025405131
        //   742: ldc_w           -1163041603
        //   745: ixor           
        //   746: lookupswitch {
        //          -1671256395: 739
        //          732927023: 877
        //          default: 772
        //        }
        //   772: invokespecial   dev/nuker/pyro/f0p.<init>:(Ldev/nuker/pyro/f0q;)V
        //   775: checkcast       Ljava/util/function/Consumer;
        //   778: invokevirtual   dev/nuker/pyro/f0n.c:(Ljava/util/function/Consumer;)V
        //   781: goto            506
        //   784: iinc            7, 1
        //   787: goto            302
        //   790: aload_0        
        //   791: new             Ldev/nuker/pyro/fz;
        //   794: dup            
        //   795: iconst_0       
        //   796: getstatic       dev/nuker/pyro/fc.0:I
        //   799: ifeq            808
        //   802: ldc_w           -1467114251
        //   805: goto            811
        //   808: ldc_w           283047645
        //   811: ldc_w           -40010587
        //   814: ixor           
        //   815: lookupswitch {
        //          -408099906: 808
        //          1427169360: 869
        //          default: 840
        //        }
        //   840: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   843: invokespecial   dev/nuker/pyro/fz.<init>:(Ljava/lang/Object;)V
        //   846: checkcast       Ldev/nuker/pyro/fw;
        //   849: putfield        dev/nuker/pyro/f0q.0:Ldev/nuker/pyro/fw;
        //   852: return         
        //   853: aconst_null    
        //   854: athrow         
        //   855: aconst_null    
        //   856: athrow         
        //   857: aconst_null    
        //   858: athrow         
        //   859: aconst_null    
        //   860: athrow         
        //   861: aconst_null    
        //   862: athrow         
        //   863: aconst_null    
        //   864: athrow         
        //   865: aconst_null    
        //   866: athrow         
        //   867: aconst_null    
        //   868: athrow         
        //   869: aconst_null    
        //   870: athrow         
        //   871: aconst_null    
        //   872: athrow         
        //   873: aconst_null    
        //   874: athrow         
        //   875: aconst_null    
        //   876: athrow         
        //   877: aconst_null    
        //   878: athrow         
        //   879: aconst_null    
        //   880: athrow         
        //    StackMapTable: 00 41 0E 42 01 1E 0D 42 01 1E 52 06 FF 00 02 00 06 06 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 02 06 01 5D 06 FF 00 1C 00 06 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 07 07 00 03 08 00 9C 08 00 9C 07 00 2F 07 00 2F 07 00 2F 07 00 26 FF 00 02 00 06 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 08 07 00 03 08 00 9C 08 00 9C 07 00 2F 07 00 2F 07 00 2F 07 00 26 01 FF 00 1F 00 06 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 07 07 00 03 08 00 9C 08 00 9C 07 00 2F 07 00 2F 07 00 2F 07 00 26 FF 00 35 00 0A 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 00 07 00 B3 01 00 01 01 FF 00 02 00 0A 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 00 07 00 B3 01 00 02 01 01 5E 01 FF 00 01 00 0A 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 01 07 00 B3 01 00 00 54 07 00 B3 FF 00 02 00 0A 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 01 07 00 B3 01 00 02 07 00 B3 01 5D 07 00 B3 4E 07 00 B8 FF 00 02 00 0A 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 01 07 00 B3 01 00 02 07 00 B8 01 5D 07 00 B8 FF 00 0D 00 0A 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 07 00 B8 01 07 00 B3 01 00 00 42 01 1E 52 07 00 BE FF 00 02 00 0A 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 07 00 B8 01 07 00 B3 01 00 02 07 00 BE 01 5D 07 00 BE FD 00 01 00 07 00 BE 0B 42 01 1E 4D 07 00 BE FF 00 02 00 0C 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 07 00 B8 01 07 00 B3 01 00 07 00 BE 00 02 07 00 BE 01 5E 07 00 BE 07 05 42 01 1A 55 07 00 31 FF 00 02 00 0C 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 07 00 B8 01 07 00 B3 01 00 07 00 BE 00 02 07 00 31 01 5E 07 00 31 FF 00 15 00 0C 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 07 00 B8 01 07 00 B3 01 07 00 31 07 00 BE 00 01 07 00 31 FF 00 10 00 0C 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 07 00 B8 01 07 00 B3 01 07 00 31 07 00 BE 00 04 07 00 31 08 02 D2 08 02 D2 07 00 03 FF 00 02 00 0C 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 07 00 B8 01 07 00 B3 01 07 00 31 07 00 BE 00 05 07 00 31 08 02 D2 08 02 D2 07 00 03 01 FF 00 1D 00 0C 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 07 00 B8 01 07 00 B3 01 07 00 31 07 00 BE 00 04 07 00 31 08 02 D2 08 02 D2 07 00 03 FF 00 0B 00 0C 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 07 00 B8 01 07 00 B3 01 00 07 00 BE 00 00 FF 00 05 00 0A 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 01 07 00 B3 01 00 00 FF 00 11 00 0A 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 01 07 00 B3 01 00 04 07 00 03 08 03 17 08 03 17 01 FF 00 02 00 0A 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 01 07 00 B3 01 00 05 07 00 03 08 03 17 08 03 17 01 01 FF 00 1C 00 0A 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 01 07 00 B3 01 00 04 07 00 03 08 03 17 08 03 17 01 FF 00 0C 00 0A 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 07 00 B8 01 07 00 B3 01 00 00 FF 00 01 00 06 06 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 01 06 01 01 FF 00 01 00 0C 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 07 00 B8 01 07 00 B3 01 00 07 00 BE 00 01 07 00 31 FF 00 01 00 06 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 07 07 00 03 08 00 9C 08 00 9C 07 00 2F 07 00 2F 07 00 2F 07 00 26 FF 00 01 00 0A 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 07 00 B8 01 07 00 B3 01 00 01 07 00 BE FF 00 01 00 0C 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 07 00 B8 01 07 00 B3 01 00 07 00 BE 00 01 07 00 BE FF 00 01 00 0A 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 01 07 00 B3 01 00 04 07 00 03 08 03 17 08 03 17 01 41 07 00 B3 FF 00 01 00 0A 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 00 07 00 B3 01 00 01 01 FF 00 01 00 0A 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 00 01 07 00 B3 01 00 01 07 00 B8 FF 00 01 00 0C 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 07 00 B8 01 07 00 B3 01 07 00 31 07 00 BE 00 04 07 00 31 08 02 D2 08 02 D2 07 00 03 FF 00 01 00 0C 07 00 03 07 00 2F 07 00 2F 07 00 2F 07 00 26 07 00 B3 07 00 B8 01 07 00 B3 01 00 07 00 BE 00 00
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
    
    static {
        throw t;
    }
    
    @NotNull
    @Override
    public JsonElement c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          1020
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.0:I
        //    12: ifgt            1012
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            1004
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: new             Lcom/google/gson/JsonObject;
        //    27: dup            
        //    28: goto            32
        //    31: athrow         
        //    32: invokespecial   com/google/gson/JsonObject.<init>:()V
        //    35: goto            39
        //    38: athrow         
        //    39: getstatic       dev/nuker/pyro/fc.0:I
        //    42: ifeq            51
        //    45: ldc_w           -40311407
        //    48: goto            54
        //    51: ldc_w           953785761
        //    54: ldc_w           -724219078
        //    57: ixor           
        //    58: lookupswitch {
        //          -2055866039: 51
        //          692956843: 991
        //          default: 84
        //        }
        //    84: astore_1       
        //    85: aload_1        
        //    86: ldc             "\u2366\u148b\u8a6a\ub1c9\uce51\ued61\ub221\ue653"
        //    88: goto            92
        //    91: athrow         
        //    92: invokestatic    invokestatic   !!! ERROR
        //    95: goto            99
        //    98: athrow         
        //    99: new             Lcom/google/gson/JsonPrimitive;
        //   102: dup            
        //   103: aload_0        
        //   104: getfield        dev/nuker/pyro/f0q.0:Ldev/nuker/pyro/fw;
        //   107: getstatic       dev/nuker/pyro/fc.c:I
        //   110: ifge            119
        //   113: ldc_w           -900900215
        //   116: goto            122
        //   119: ldc_w           -137308865
        //   122: ldc_w           406535181
        //   125: ixor           
        //   126: lookupswitch {
        //          -763992444: 983
        //          1168511698: 119
        //          default: 152
        //        }
        //   152: goto            156
        //   155: athrow         
        //   156: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   159: goto            163
        //   162: athrow         
        //   163: checkcast       Ljava/lang/Boolean;
        //   166: goto            170
        //   169: athrow         
        //   170: invokespecial   com/google/gson/JsonPrimitive.<init>:(Ljava/lang/Boolean;)V
        //   173: goto            177
        //   176: athrow         
        //   177: checkcast       Lcom/google/gson/JsonElement;
        //   180: getstatic       dev/nuker/pyro/fc.1:I
        //   183: ifeq            192
        //   186: ldc_w           1026487761
        //   189: goto            195
        //   192: ldc_w           1794354039
        //   195: ldc_w           1116390503
        //   198: ixor           
        //   199: lookupswitch {
        //          679046928: 224
        //          2141467062: 192
        //          default: 969
        //        }
        //   224: goto            228
        //   227: athrow         
        //   228: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   231: goto            235
        //   234: athrow         
        //   235: new             Lcom/google/gson/JsonArray;
        //   238: dup            
        //   239: getstatic       dev/nuker/pyro/fc.c:I
        //   242: ifge            251
        //   245: ldc_w           -2000517074
        //   248: goto            254
        //   251: ldc_w           -1768570146
        //   254: ldc_w           134893389
        //   257: ixor           
        //   258: lookupswitch {
        //          -2134325405: 251
        //          -1633710701: 284
        //          default: 993
        //        }
        //   284: goto            288
        //   287: athrow         
        //   288: invokespecial   com/google/gson/JsonArray.<init>:()V
        //   291: goto            295
        //   294: athrow         
        //   295: astore_2       
        //   296: getstatic       dev/nuker/pyro/fc.0:I
        //   299: ifeq            308
        //   302: ldc_w           1805390361
        //   305: goto            311
        //   308: ldc_w           -103755425
        //   311: ldc_w           587623548
        //   314: ixor           
        //   315: lookupswitch {
        //          -1177938602: 308
        //          1218084453: 977
        //          default: 340
        //        }
        //   340: aload_2        
        //   341: aload_0        
        //   342: getstatic       dev/nuker/pyro/fc.0:I
        //   345: ifeq            354
        //   348: ldc_w           1109195017
        //   351: goto            357
        //   354: ldc_w           -828120147
        //   357: ldc_w           718979926
        //   360: ixor           
        //   361: lookupswitch {
        //          943736316: 354
        //          1757821535: 989
        //          default: 388
        //        }
        //   388: getfield        dev/nuker/pyro/f0q.c:Ldev/nuker/pyro/f0f;
        //   391: goto            395
        //   394: athrow         
        //   395: invokevirtual   dev/nuker/pyro/f0f.c:()Lcom/google/gson/JsonElement;
        //   398: goto            402
        //   401: athrow         
        //   402: goto            406
        //   405: athrow         
        //   406: invokevirtual   com/google/gson/JsonArray.add:(Lcom/google/gson/JsonElement;)V
        //   409: goto            413
        //   412: athrow         
        //   413: aload_0        
        //   414: goto            418
        //   417: athrow         
        //   418: invokevirtual   dev/nuker/pyro/f0q.5:()Ldev/nuker/pyro/fw;
        //   421: goto            425
        //   424: athrow         
        //   425: goto            429
        //   428: athrow         
        //   429: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   432: goto            436
        //   435: athrow         
        //   436: dup            
        //   437: ifnonnull       451
        //   440: goto            444
        //   443: athrow         
        //   444: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   447: goto            451
        //   450: athrow         
        //   451: checkcast       [Ljava/util/List;
        //   454: astore          5
        //   456: aload           5
        //   458: arraylength    
        //   459: getstatic       dev/nuker/pyro/fc.1:I
        //   462: ifeq            471
        //   465: ldc_w           -1802147816
        //   468: goto            474
        //   471: ldc_w           1620089175
        //   474: ldc_w           1830946751
        //   477: ixor           
        //   478: lookupswitch {
        //          -105418841: 975
        //          574480418: 471
        //          default: 504
        //        }
        //   504: istore          6
        //   506: iconst_0       
        //   507: istore          4
        //   509: iload           4
        //   511: iload           6
        //   513: if_icmpge       889
        //   516: aload           5
        //   518: getstatic       dev/nuker/pyro/fc.c:I
        //   521: ifge            530
        //   524: ldc_w           1600873534
        //   527: goto            533
        //   530: ldc_w           -40634383
        //   533: ldc_w           1353667246
        //   536: ixor           
        //   537: lookupswitch {
        //          -1482539838: 530
        //          264517264: 971
        //          default: 564
        //        }
        //   564: iload           4
        //   566: aaload         
        //   567: astore_3       
        //   568: new             Lcom/google/gson/JsonObject;
        //   571: dup            
        //   572: goto            576
        //   575: athrow         
        //   576: invokespecial   com/google/gson/JsonObject.<init>:()V
        //   579: goto            583
        //   582: athrow         
        //   583: astore          7
        //   585: getstatic       dev/nuker/pyro/fc.c:I
        //   588: ifge            597
        //   591: ldc_w           -1704608217
        //   594: goto            600
        //   597: ldc_w           1511224175
        //   600: ldc_w           1517263262
        //   603: ixor           
        //   604: lookupswitch {
        //          -1073076295: 985
        //          -1037287334: 597
        //          default: 632
        //        }
        //   632: aload_3        
        //   633: goto            637
        //   636: athrow         
        //   637: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   642: goto            646
        //   645: athrow         
        //   646: astore          9
        //   648: aload           9
        //   650: getstatic       dev/nuker/pyro/fc.0:I
        //   653: ifeq            662
        //   656: ldc_w           -300682193
        //   659: goto            665
        //   662: ldc_w           -663394947
        //   665: ldc_w           529767378
        //   668: ixor           
        //   669: lookupswitch {
        //          -1284940262: 662
        //          -243240963: 979
        //          default: 696
        //        }
        //   696: goto            700
        //   699: athrow         
        //   700: invokeinterface java/util/Iterator.hasNext:()Z
        //   705: goto            709
        //   708: athrow         
        //   709: ifeq            774
        //   712: aload           9
        //   714: goto            718
        //   717: athrow         
        //   718: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   723: goto            727
        //   726: athrow         
        //   727: checkcast       Ldev/nuker/pyro/f0n;
        //   730: astore          8
        //   732: aload           7
        //   734: aload           8
        //   736: goto            740
        //   739: athrow         
        //   740: invokevirtual   dev/nuker/pyro/f0n.0:()Ljava/lang/String;
        //   743: goto            747
        //   746: athrow         
        //   747: aload           8
        //   749: goto            753
        //   752: athrow         
        //   753: invokevirtual   dev/nuker/pyro/f0n.c:()Lcom/google/gson/JsonElement;
        //   756: goto            760
        //   759: athrow         
        //   760: goto            764
        //   763: athrow         
        //   764: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   767: goto            771
        //   770: athrow         
        //   771: goto            648
        //   774: aload_2        
        //   775: getstatic       dev/nuker/pyro/fc.1:I
        //   778: ifeq            787
        //   781: ldc_w           1643160968
        //   784: goto            790
        //   787: ldc_w           484935050
        //   790: ldc_w           1086481150
        //   793: ixor           
        //   794: lookupswitch {
        //          556975990: 787
        //          1545987956: 820
        //          default: 987
        //        }
        //   820: aload           7
        //   822: checkcast       Lcom/google/gson/JsonElement;
        //   825: getstatic       dev/nuker/pyro/fc.c:I
        //   828: ifge            837
        //   831: ldc_w           -1999822479
        //   834: goto            840
        //   837: ldc_w           1989860159
        //   840: ldc_w           980497488
        //   843: ixor           
        //   844: lookupswitch {
        //          -1296296671: 837
        //          1290530671: 872
        //          default: 973
        //        }
        //   872: goto            876
        //   875: athrow         
        //   876: invokevirtual   com/google/gson/JsonArray.add:(Lcom/google/gson/JsonElement;)V
        //   879: goto            883
        //   882: athrow         
        //   883: iinc            4, 1
        //   886: goto            509
        //   889: aload_1        
        //   890: ldc             "\u2360\u149b\u8a73\ub1c4\uce5b\ued77\ub221\ue659"
        //   892: goto            896
        //   895: athrow         
        //   896: invokestatic    invokestatic   !!! ERROR
        //   899: goto            903
        //   902: athrow         
        //   903: aload_2        
        //   904: checkcast       Lcom/google/gson/JsonElement;
        //   907: goto            911
        //   910: athrow         
        //   911: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   914: goto            918
        //   917: athrow         
        //   918: getstatic       dev/nuker/pyro/fc.0:I
        //   921: ifeq            930
        //   924: ldc_w           -576958858
        //   927: goto            933
        //   930: ldc_w           -765392370
        //   933: ldc_w           -365640391
        //   936: ixor           
        //   937: lookupswitch {
        //          82666678: 930
        //          933792591: 981
        //          default: 964
        //        }
        //   964: aload_1        
        //   965: checkcast       Lcom/google/gson/JsonElement;
        //   968: areturn        
        //   969: aconst_null    
        //   970: athrow         
        //   971: aconst_null    
        //   972: athrow         
        //   973: aconst_null    
        //   974: athrow         
        //   975: aconst_null    
        //   976: athrow         
        //   977: aconst_null    
        //   978: athrow         
        //   979: aconst_null    
        //   980: athrow         
        //   981: aconst_null    
        //   982: athrow         
        //   983: aconst_null    
        //   984: athrow         
        //   985: aconst_null    
        //   986: athrow         
        //   987: aconst_null    
        //   988: athrow         
        //   989: aconst_null    
        //   990: athrow         
        //   991: aconst_null    
        //   992: athrow         
        //   993: aconst_null    
        //   994: athrow         
        //   995: pop            
        //   996: goto            24
        //   999: pop            
        //  1000: aconst_null    
        //  1001: goto            995
        //  1004: dup            
        //  1005: ifnull          995
        //  1008: checkcast       Ljava/lang/Throwable;
        //  1011: athrow         
        //  1012: dup            
        //  1013: ifnull          999
        //  1016: checkcast       Ljava/lang/Throwable;
        //  1019: athrow         
        //  1020: aconst_null    
        //  1021: athrow         
        //    StackMapTable: 00 95 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FC 00 03 07 00 03 FF 00 06 00 00 00 01 07 00 21 FF 00 00 00 01 07 00 03 00 02 08 00 18 08 00 18 45 07 00 21 40 07 00 4B 4B 07 00 4B FF 00 02 00 01 07 00 03 00 02 07 00 4B 01 5D 07 00 4B FF 00 06 00 02 07 00 03 07 00 4B 00 01 07 00 21 FF 00 00 00 02 07 00 03 07 00 4B 00 02 07 00 4B 07 00 2F 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 4B 00 02 07 00 4B 07 00 2F FF 00 13 00 02 07 00 03 07 00 4B 00 05 07 00 4B 07 00 2F 08 00 63 08 00 63 07 00 6B FF 00 02 00 02 07 00 03 07 00 4B 00 06 07 00 4B 07 00 2F 08 00 63 08 00 63 07 00 6B 01 FF 00 1D 00 02 07 00 03 07 00 4B 00 05 07 00 4B 07 00 2F 08 00 63 08 00 63 07 00 6B 42 07 00 46 FF 00 00 00 02 07 00 03 07 00 4B 00 05 07 00 4B 07 00 2F 08 00 63 08 00 63 07 00 6B 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 4B 00 05 07 00 4B 07 00 2F 08 00 63 08 00 63 07 00 DD 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 4B 00 05 07 00 4B 07 00 2F 08 00 63 08 00 63 07 00 65 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 4B 00 03 07 00 4B 07 00 2F 07 01 8E FF 00 0E 00 02 07 00 03 07 00 4B 00 03 07 00 4B 07 00 2F 07 00 5A FF 00 02 00 02 07 00 03 07 00 4B 00 04 07 00 4B 07 00 2F 07 00 5A 01 FF 00 1C 00 02 07 00 03 07 00 4B 00 03 07 00 4B 07 00 2F 07 00 5A FF 00 02 00 00 00 01 07 00 21 FF 00 00 00 02 07 00 03 07 00 4B 00 03 07 00 4B 07 00 2F 07 00 5A 45 07 00 21 00 FF 00 0F 00 02 07 00 03 07 00 4B 00 02 08 00 EB 08 00 EB FF 00 02 00 02 07 00 03 07 00 4B 00 03 08 00 EB 08 00 EB 01 FF 00 1D 00 02 07 00 03 07 00 4B 00 02 08 00 EB 08 00 EB FF 00 02 00 00 00 01 07 00 21 FF 00 00 00 02 07 00 03 07 00 4B 00 02 08 00 EB 08 00 EB 45 07 00 21 40 07 00 81 FC 00 0C 07 00 81 42 01 1C FF 00 0D 00 03 07 00 03 07 00 4B 07 00 81 00 02 07 00 81 07 00 03 FF 00 02 00 03 07 00 03 07 00 4B 07 00 81 00 03 07 00 81 07 00 03 01 FF 00 1E 00 03 07 00 03 07 00 4B 07 00 81 00 02 07 00 81 07 00 03 FF 00 05 00 00 00 01 07 00 21 FF 00 00 00 03 07 00 03 07 00 4B 07 00 81 00 02 07 00 81 07 00 86 45 07 00 21 FF 00 00 00 03 07 00 03 07 00 4B 07 00 81 00 02 07 00 81 07 00 5A FF 00 02 00 00 00 01 07 00 21 FF 00 00 00 03 07 00 03 07 00 4B 07 00 81 00 02 07 00 81 07 00 5A 45 07 00 21 00 43 07 00 21 40 07 00 03 45 07 00 21 40 07 00 6B 42 07 00 3A 40 07 00 6B 45 07 00 21 40 07 00 DD 46 07 00 33 40 07 00 DD 45 07 00 21 40 07 00 DD FF 00 13 00 06 07 00 03 07 00 4B 07 00 81 00 00 07 00 B3 00 01 01 FF 00 02 00 06 07 00 03 07 00 4B 07 00 81 00 00 07 00 B3 00 02 01 01 5D 01 FF 00 04 00 07 07 00 03 07 00 4B 07 00 81 00 01 07 00 B3 01 00 00 54 07 00 B3 FF 00 02 00 07 07 00 03 07 00 4B 07 00 81 00 01 07 00 B3 01 00 02 07 00 B3 01 5E 07 00 B3 FF 00 0A 00 00 00 01 07 00 21 FF 00 00 00 07 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 00 02 08 02 38 08 02 38 45 07 00 21 40 07 00 4B FC 00 0D 07 00 4B 42 01 1F 43 07 00 3A 40 07 00 B8 47 07 00 21 40 07 00 BE FD 00 01 00 07 00 BE 4D 07 00 BE FF 00 02 00 0A 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 07 00 4B 00 07 00 BE 00 02 07 00 BE 01 5E 07 00 BE 42 07 00 21 40 07 00 BE 47 07 00 21 40 01 47 07 00 18 40 07 00 BE 47 07 00 21 40 07 00 DD FF 00 0B 00 00 00 01 07 00 21 FF 00 00 00 0A 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 07 00 4B 07 00 31 07 00 BE 00 02 07 00 4B 07 00 31 45 07 00 21 FF 00 00 00 0A 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 07 00 4B 07 00 31 07 00 BE 00 02 07 00 4B 07 00 2F 44 07 00 18 FF 00 00 00 0A 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 07 00 4B 07 00 31 07 00 BE 00 03 07 00 4B 07 00 2F 07 00 31 45 07 00 21 FF 00 00 00 0A 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 07 00 4B 07 00 31 07 00 BE 00 03 07 00 4B 07 00 2F 07 00 5A 42 07 00 21 FF 00 00 00 0A 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 07 00 4B 07 00 31 07 00 BE 00 03 07 00 4B 07 00 2F 07 00 5A 45 07 00 21 00 FF 00 02 00 0A 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 07 00 4B 00 07 00 BE 00 00 4C 07 00 81 FF 00 02 00 0A 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 07 00 4B 00 07 00 BE 00 02 07 00 81 01 5D 07 00 81 FF 00 10 00 0A 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 07 00 4B 00 07 00 BE 00 02 07 00 81 07 00 5A FF 00 02 00 0A 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 07 00 4B 00 07 00 BE 00 03 07 00 81 07 00 5A 01 FF 00 1F 00 0A 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 07 00 4B 00 07 00 BE 00 02 07 00 81 07 00 5A 42 07 00 21 FF 00 00 00 0A 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 07 00 4B 00 07 00 BE 00 02 07 00 81 07 00 5A 45 07 00 21 00 FF 00 05 00 07 07 00 03 07 00 4B 07 00 81 00 01 07 00 B3 01 00 00 FF 00 05 00 00 00 01 07 00 21 FF 00 00 00 07 07 00 03 07 00 4B 07 00 81 00 01 07 00 B3 01 00 02 07 00 4B 07 00 2F 45 07 00 21 FF 00 00 00 07 07 00 03 07 00 4B 07 00 81 00 01 07 00 B3 01 00 02 07 00 4B 07 00 2F 46 07 00 21 FF 00 00 00 07 07 00 03 07 00 4B 07 00 81 00 01 07 00 B3 01 00 03 07 00 4B 07 00 2F 07 00 5A 45 07 00 21 00 0B 42 01 1E FF 00 04 00 02 07 00 03 07 00 4B 00 03 07 00 4B 07 00 2F 07 00 5A FF 00 01 00 07 07 00 03 07 00 4B 07 00 81 00 01 07 00 B3 01 00 01 07 00 B3 FF 00 01 00 0A 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 07 00 4B 00 07 00 BE 00 02 07 00 81 07 00 5A FF 00 01 00 06 07 00 03 07 00 4B 07 00 81 00 00 07 00 B3 00 01 01 F8 00 01 FF 00 01 00 0A 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 07 00 4B 00 07 00 BE 00 01 07 00 BE FF 00 01 00 07 07 00 03 07 00 4B 07 00 81 00 01 07 00 B3 01 00 00 FF 00 01 00 02 07 00 03 07 00 4B 00 05 07 00 4B 07 00 2F 08 00 63 08 00 63 07 00 6B FF 00 01 00 08 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 07 00 4B 00 00 FF 00 01 00 0A 07 00 03 07 00 4B 07 00 81 07 00 B8 01 07 00 B3 01 07 00 4B 00 07 00 BE 00 01 07 00 81 FF 00 01 00 03 07 00 03 07 00 4B 07 00 81 00 02 07 00 81 07 00 03 FF 00 01 00 01 07 00 03 00 01 07 00 4B FF 00 01 00 02 07 00 03 07 00 4B 00 02 08 00 EB 08 00 EB FF 00 01 00 01 07 00 03 00 01 07 00 21 43 05 44 07 00 21 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     1004   1012   Any
        //  1004   1012   1004   1012   Ljava/lang/AssertionError;
        //  1020   1022   3      8      Any
        //  32     38     38     39     Any
        //  32     38     3      8      Any
        //  32     38     3      8      Any
        //  32     38     3      8      Ljava/lang/NegativeArraySizeException;
        //  32     38     3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  91     98     98     99     Any
        //  92     98     3      8      Ljava/lang/IndexOutOfBoundsException;
        //  92     98     3      8      Any
        //  92     98     3      8      Any
        //  91     98     91     92     Any
        //  155    162    162    163    Any
        //  156    162    162    163    Any
        //  156    162    3      8      Any
        //  156    162    155    156    Ljava/util/ConcurrentModificationException;
        //  156    162    3      8      Ljava/lang/IllegalStateException;
        //  169    176    176    177    Any
        //  169    176    169    170    Ljava/lang/NumberFormatException;
        //  170    176    169    170    Ljava/lang/EnumConstantNotPresentException;
        //  169    176    169    170    Ljava/lang/StringIndexOutOfBoundsException;
        //  169    176    169    170    Ljava/lang/AssertionError;
        //  228    234    234    235    Any
        //  228    234    234    235    Ljava/lang/AssertionError;
        //  228    234    234    235    Ljava/lang/ArithmeticException;
        //  228    234    3      8      Ljava/util/ConcurrentModificationException;
        //  228    234    234    235    Any
        //  288    294    294    295    Any
        //  288    294    3      8      Any
        //  288    294    294    295    Any
        //  288    294    294    295    Any
        //  288    294    294    295    Any
        //  395    401    401    402    Any
        //  395    401    3      8      Any
        //  395    401    3      8      Any
        //  395    401    401    402    Ljava/lang/RuntimeException;
        //  395    401    401    402    Any
        //  406    412    412    413    Any
        //  406    412    3      8      Ljava/util/ConcurrentModificationException;
        //  406    412    3      8      Any
        //  406    412    3      8      Any
        //  406    412    3      8      Any
        //  417    424    424    425    Any
        //  418    424    417    418    Ljava/lang/EnumConstantNotPresentException;
        //  418    424    3      8      Any
        //  418    424    417    418    Any
        //  417    424    3      8      Ljava/lang/ArrayIndexOutOfBoundsException;
        //  428    435    435    436    Any
        //  428    435    435    436    Ljava/lang/EnumConstantNotPresentException;
        //  428    435    428    429    Ljava/lang/IndexOutOfBoundsException;
        //  429    435    435    436    Ljava/lang/NegativeArraySizeException;
        //  429    435    435    436    Any
        //  443    450    450    451    Any
        //  444    450    450    451    Any
        //  443    450    443    444    Ljava/lang/NumberFormatException;
        //  443    450    3      8      Any
        //  443    450    443    444    Ljava/lang/ClassCastException;
        //  576    582    582    583    Any
        //  576    582    3      8      Ljava/lang/IllegalArgumentException;
        //  576    582    3      8      Ljava/lang/IllegalArgumentException;
        //  576    582    3      8      Any
        //  576    582    3      8      Ljava/lang/IllegalStateException;
        //  636    645    645    646    Any
        //  637    645    645    646    Any
        //  637    645    645    646    Ljava/lang/ClassCastException;
        //  636    645    645    646    Ljava/util/NoSuchElementException;
        //  636    645    636    637    Ljava/lang/IndexOutOfBoundsException;
        //  699    708    708    709    Any
        //  700    708    708    709    Ljava/lang/IllegalArgumentException;
        //  699    708    3      8      Ljava/lang/IndexOutOfBoundsException;
        //  700    708    699    700    Any
        //  700    708    3      8      Any
        //  717    726    726    727    Any
        //  717    726    726    727    Ljava/lang/ClassCastException;
        //  718    726    3      8      Any
        //  717    726    3      8      Ljava/util/NoSuchElementException;
        //  718    726    717    718    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  740    746    746    747    Any
        //  740    746    3      8      Any
        //  740    746    3      8      Ljava/util/ConcurrentModificationException;
        //  740    746    746    747    Ljava/lang/IllegalArgumentException;
        //  740    746    746    747    Any
        //  752    759    759    760    Any
        //  753    759    752    753    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  752    759    759    760    Any
        //  752    759    3      8      Any
        //  753    759    3      8      Ljava/lang/EnumConstantNotPresentException;
        //  763    770    770    771    Any
        //  764    770    763    764    Any
        //  763    770    763    764    Any
        //  764    770    3      8      Ljava/util/ConcurrentModificationException;
        //  764    770    3      8      Ljava/lang/AssertionError;
        //  875    882    882    883    Any
        //  876    882    882    883    Ljava/util/NoSuchElementException;
        //  876    882    875    876    Ljava/lang/IllegalArgumentException;
        //  876    882    875    876    Any
        //  876    882    875    876    Ljava/lang/IllegalStateException;
        //  896    902    902    903    Any
        //  896    902    3      8      Ljava/lang/UnsupportedOperationException;
        //  896    902    902    903    Any
        //  896    902    902    903    Ljava/util/NoSuchElementException;
        //  896    902    902    903    Any
        //  910    917    917    918    Any
        //  911    917    910    911    Any
        //  911    917    910    911    Any
        //  911    917    917    918    Ljava/lang/ArithmeticException;
        //  911    917    917    918    Any
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
    
    @NotNull
    public fw c() {
        return fbS.82(this, 1737311724);
    }
    
    @NotNull
    public List c(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          176
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.1:I
        //    12: ifgt            168
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            160
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: getstatic       dev/nuker/pyro/fc.0:I
        //    27: ifeq            36
        //    30: ldc_w           135208368
        //    33: goto            39
        //    36: ldc_w           1991243425
        //    39: ldc_w           1740779612
        //    42: ixor           
        //    43: lookupswitch {
        //          292407037: 68
        //          1875717612: 36
        //          default: 149
        //        }
        //    68: aload_0        
        //    69: goto            73
        //    72: athrow         
        //    73: invokevirtual   dev/nuker/pyro/f0q.5:()Ldev/nuker/pyro/fw;
        //    76: goto            80
        //    79: athrow         
        //    80: goto            84
        //    83: athrow         
        //    84: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //    87: goto            91
        //    90: athrow         
        //    91: dup            
        //    92: ifnonnull       101
        //    95: ldc_w           -1325898118
        //    98: goto            104
        //   101: ldc_w           -1325898139
        //   104: ldc_w           -2047896971
        //   107: ixor           
        //   108: tableswitch {
        //          1781524510: 132
        //          1781524511: 143
        //          default: 95
        //        }
        //   132: goto            136
        //   135: athrow         
        //   136: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   139: goto            143
        //   142: athrow         
        //   143: checkcast       [Ljava/util/List;
        //   146: iload_1        
        //   147: aaload         
        //   148: areturn        
        //   149: aconst_null    
        //   150: athrow         
        //   151: pop            
        //   152: goto            24
        //   155: pop            
        //   156: aconst_null    
        //   157: goto            151
        //   160: dup            
        //   161: ifnull          151
        //   164: checkcast       Ljava/lang/Throwable;
        //   167: athrow         
        //   168: dup            
        //   169: ifnull          155
        //   172: checkcast       Ljava/lang/Throwable;
        //   175: athrow         
        //   176: aconst_null    
        //   177: athrow         
        //    StackMapTable: 00 1D 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FD 00 03 07 00 03 01 0B 42 01 1C FF 00 03 00 00 00 01 07 00 21 FF 00 00 00 02 07 00 03 01 00 01 07 00 03 45 07 00 21 40 07 00 6B 42 07 00 33 40 07 00 6B 45 07 00 21 40 07 00 DD 43 07 00 DD 45 07 00 DD FF 00 02 00 02 07 00 03 01 00 02 07 00 DD 01 5B 07 00 DD 42 07 00 21 40 07 00 DD 45 07 00 21 40 07 00 DD 05 41 07 00 33 43 05 44 07 00 33 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     160    168    Ljava/lang/IllegalArgumentException;
        //  160    168    160    168    Ljava/lang/RuntimeException;
        //  176    178    3      8      Any
        //  73     79     79     80     Any
        //  73     79     79     80     Ljava/lang/IllegalArgumentException;
        //  73     79     3      8      Any
        //  73     79     79     80     Any
        //  73     79     79     80     Any
        //  83     90     90     91     Any
        //  83     90     90     91     Ljava/lang/NumberFormatException;
        //  84     90     3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  84     90     83     84     Ljava/lang/StringIndexOutOfBoundsException;
        //  83     90     83     84     Ljava/lang/NumberFormatException;
        //  135    142    142    143    Any
        //  136    142    142    143    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  135    142    3      8      Ljava/lang/ClassCastException;
        //  135    142    135    136    Any
        //  135    142    142    143    Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:776)
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
    
    public void 0(@NotNull final fw fw) {
        fbS.3K(this, 2047167675, fw);
    }
    
    @NotNull
    public f0f 0() {
        return fbS.h7(this, 2126754455);
    }
    
    @Nullable
    public f0n c(@NotNull final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ifnull          308
        //     7: athrow         
        //     8: aconst_null    
        //     9: getstatic       dev/nuker/pyro/fc.c:I
        //    12: iflt            300
        //    15: pop            
        //    16: aconst_null    
        //    17: goto            292
        //    20: nop            
        //    21: nop            
        //    22: nop            
        //    23: athrow         
        //    24: aload_1        
        //    25: pop            
        //    26: aload_0        
        //    27: aload_0        
        //    28: getfield        dev/nuker/pyro/f0q.c:Ldev/nuker/pyro/f0f;
        //    31: goto            35
        //    34: athrow         
        //    35: invokevirtual   dev/nuker/pyro/f0f.3:()Ljava/lang/Object;
        //    38: goto            42
        //    41: athrow         
        //    42: checkcast       Ljava/lang/Enum;
        //    45: getstatic       dev/nuker/pyro/fc.1:I
        //    48: ifeq            57
        //    51: ldc_w           -545526915
        //    54: goto            60
        //    57: ldc_w           -496075171
        //    60: ldc_w           1190245487
        //    63: ixor           
        //    64: lookupswitch {
        //          -1718984942: 277
        //          1146859547: 57
        //          default: 92
        //        }
        //    92: goto            96
        //    95: athrow         
        //    96: invokevirtual   java/lang/Enum.ordinal:()I
        //    99: goto            103
        //   102: athrow         
        //   103: aload_1        
        //   104: goto            108
        //   107: athrow         
        //   108: invokevirtual   dev/nuker/pyro/f0q.c:(ILjava/lang/String;)Ldev/nuker/pyro/f0n;
        //   111: goto            115
        //   114: athrow         
        //   115: dup            
        //   116: ifnonnull       125
        //   119: ldc_w           1620275811
        //   122: goto            128
        //   125: ldc_w           1620275808
        //   128: ldc_w           -1016753854
        //   131: ixor           
        //   132: tableswitch {
        //          1206765122: 156
        //          1206765123: 276
        //          default: 119
        //        }
        //   156: new             Lkotlin/TypeCastException;
        //   159: dup            
        //   160: ldc_w           "\u236d\u1486\u8a76\ub1c4\uce1f\ued66\ub225\ue659\udb77\uee23\ua7b1\u1e0c\ue171\uc7b3\u86eb\u89fd\u57a5\u7781\ubf38\uc7d0\u2b85\uc234\u6ada\u2f49\ud041\u3508\u7d66\u8937\u8215\u8b07\u842f\ufb72\u7051\u981e\u1c09\uf1e1\u493c\u88c2"
        //   163: getstatic       dev/nuker/pyro/fc.1:I
        //   166: ifeq            175
        //   169: ldc_w           -2117809802
        //   172: goto            178
        //   175: ldc_w           1125284353
        //   178: ldc_w           1776473143
        //   181: ixor           
        //   182: lookupswitch {
        //          -400155327: 279
        //          1237373211: 175
        //          default: 208
        //        }
        //   208: goto            212
        //   211: athrow         
        //   212: invokestatic    invokestatic   !!! ERROR
        //   215: goto            219
        //   218: athrow         
        //   219: getstatic       dev/nuker/pyro/fc.1:I
        //   222: ifeq            231
        //   225: ldc_w           -298643995
        //   228: goto            234
        //   231: ldc_w           1784913937
        //   234: ldc_w           1879185100
        //   237: ixor           
        //   238: lookupswitch {
        //          -1640948951: 281
        //          157230293: 231
        //          default: 264
        //        }
        //   264: goto            268
        //   267: athrow         
        //   268: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   271: goto            275
        //   274: athrow         
        //   275: athrow         
        //   276: areturn        
        //   277: aconst_null    
        //   278: athrow         
        //   279: aconst_null    
        //   280: athrow         
        //   281: aconst_null    
        //   282: athrow         
        //   283: pop            
        //   284: goto            24
        //   287: pop            
        //   288: aconst_null    
        //   289: goto            283
        //   292: dup            
        //   293: ifnull          283
        //   296: checkcast       Ljava/lang/Throwable;
        //   299: athrow         
        //   300: dup            
        //   301: ifnull          287
        //   304: checkcast       Ljava/lang/Throwable;
        //   307: athrow         
        //   308: aconst_null    
        //   309: athrow         
        //    StackMapTable: 00 2E 43 07 00 21 04 FF 00 0B 00 00 00 01 07 00 21 FD 00 03 07 00 03 07 00 2F 49 07 00 21 FF 00 00 00 02 07 00 03 07 00 2F 00 02 07 00 03 07 00 86 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 2F 00 02 07 00 03 07 00 DD FF 00 0E 00 02 07 00 03 07 00 2F 00 02 07 00 03 07 00 26 FF 00 02 00 02 07 00 03 07 00 2F 00 03 07 00 03 07 00 26 01 FF 00 1F 00 02 07 00 03 07 00 2F 00 02 07 00 03 07 00 26 FF 00 02 00 00 00 01 07 00 21 FF 00 00 00 02 07 00 03 07 00 2F 00 02 07 00 03 07 00 26 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 2F 00 02 07 00 03 01 43 07 00 10 FF 00 00 00 02 07 00 03 07 00 2F 00 03 07 00 03 01 07 00 2F 45 07 00 21 40 07 00 31 43 07 00 31 45 07 00 31 FF 00 02 00 02 07 00 03 07 00 2F 00 02 07 00 31 01 5B 07 00 31 FF 00 12 00 02 07 00 03 07 00 2F 00 04 07 00 31 08 00 9C 08 00 9C 07 00 2F FF 00 02 00 02 07 00 03 07 00 2F 00 05 07 00 31 08 00 9C 08 00 9C 07 00 2F 01 FF 00 1D 00 02 07 00 03 07 00 2F 00 04 07 00 31 08 00 9C 08 00 9C 07 00 2F 42 07 00 36 FF 00 00 00 02 07 00 03 07 00 2F 00 04 07 00 31 08 00 9C 08 00 9C 07 00 2F 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 2F 00 04 07 00 31 08 00 9C 08 00 9C 07 00 2F FF 00 0B 00 02 07 00 03 07 00 2F 00 04 07 00 31 08 00 9C 08 00 9C 07 00 2F FF 00 02 00 02 07 00 03 07 00 2F 00 05 07 00 31 08 00 9C 08 00 9C 07 00 2F 01 FF 00 1D 00 02 07 00 03 07 00 2F 00 04 07 00 31 08 00 9C 08 00 9C 07 00 2F 42 07 00 21 FF 00 00 00 02 07 00 03 07 00 2F 00 04 07 00 31 08 00 9C 08 00 9C 07 00 2F 45 07 00 21 FF 00 00 00 02 07 00 03 07 00 2F 00 02 07 00 31 07 00 9C 40 07 00 31 FF 00 00 00 02 07 00 03 07 00 2F 00 02 07 00 03 07 00 26 FF 00 01 00 02 07 00 03 07 00 2F 00 04 07 00 31 08 00 9C 08 00 9C 07 00 2F FF 00 01 00 02 07 00 03 07 00 2F 00 04 07 00 31 08 00 9C 08 00 9C 07 00 2F 41 07 00 33 43 05 44 07 00 33 47 05 47 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      20     292    300    Ljava/lang/ClassCastException;
        //  292    300    292    300    Ljava/lang/IndexOutOfBoundsException;
        //  308    310    3      8      Any
        //  34     41     41     42     Any
        //  34     41     34     35     Any
        //  35     41     3      8      Any
        //  34     41     3      8      Ljava/lang/StringIndexOutOfBoundsException;
        //  35     41     34     35     Any
        //  96     102    102    103    Any
        //  96     102    102    103    Ljava/lang/AssertionError;
        //  96     102    102    103    Ljava/lang/NumberFormatException;
        //  96     102    3      8      Ljava/lang/ArithmeticException;
        //  96     102    102    103    Any
        //  107    114    114    115    Any
        //  107    114    3      8      Ljava/lang/NumberFormatException;
        //  108    114    107    108    Ljava/lang/NumberFormatException;
        //  108    114    3      8      Ljava/util/ConcurrentModificationException;
        //  107    114    3      8      Ljava/util/NoSuchElementException;
        //  211    218    218    219    Any
        //  211    218    218    219    Any
        //  212    218    218    219    Any
        //  211    218    211    212    Ljava/lang/EnumConstantNotPresentException;
        //  211    218    218    219    Any
        //  267    274    274    275    Any
        //  267    274    3      8      Any
        //  268    274    267    268    Any
        //  267    274    267    268    Any
        //  267    274    274    275    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 99 out of bounds for length 99
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
}
