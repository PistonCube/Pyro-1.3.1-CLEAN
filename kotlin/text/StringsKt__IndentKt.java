// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import java.util.List;
import kotlin.sequences.Sequence;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0082\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015" }, d2 = { "getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib" }, xs = "kotlin/text/StringsKt")
class StringsKt__IndentKt
{
    @NotNull
    public static final String trimMargin(@NotNull final String $this$trimMargin, @NotNull final String marginPrefix) {
        Intrinsics.checkParameterIsNotNull($this$trimMargin, "$this$trimMargin");
        Intrinsics.checkParameterIsNotNull(marginPrefix, "marginPrefix");
        return replaceIndentByMargin($this$trimMargin, "", marginPrefix);
    }
    
    @NotNull
    public static final String replaceIndentByMargin(@NotNull final String $this$replaceIndentByMargin, @NotNull final String newIndent, @NotNull final String marginPrefix) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$replaceIndentByMargin"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* newIndent */
        //     7: ldc             "newIndent"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_2         /* marginPrefix */
        //    13: ldc             "marginPrefix"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload_2         /* marginPrefix */
        //    19: checkcast       Ljava/lang/CharSequence;
        //    22: astore_3       
        //    23: iconst_0       
        //    24: istore          4
        //    26: aload_3        
        //    27: invokestatic    kotlin/text/StringsKt.isBlank:(Ljava/lang/CharSequence;)Z
        //    30: ifne            37
        //    33: iconst_1       
        //    34: goto            38
        //    37: iconst_0       
        //    38: istore_3       
        //    39: iconst_0       
        //    40: istore          4
        //    42: iconst_0       
        //    43: istore          5
        //    45: iload_3        
        //    46: ifne            72
        //    49: iconst_0       
        //    50: istore          $i$a$-require-StringsKt__IndentKt$replaceIndentByMargin$1
        //    52: ldc             "marginPrefix must be non-blank string."
        //    54: astore          5
        //    56: new             Ljava/lang/IllegalArgumentException;
        //    59: dup            
        //    60: aload           5
        //    62: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    65: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    68: checkcast       Ljava/lang/Throwable;
        //    71: athrow         
        //    72: aload_0         /* $this$replaceIndentByMargin */
        //    73: checkcast       Ljava/lang/CharSequence;
        //    76: invokestatic    kotlin/text/StringsKt.lines:(Ljava/lang/CharSequence;)Ljava/util/List;
        //    79: astore_3        /* lines */
        //    80: aload_3         /* lines */
        //    81: astore          4
        //    83: aload_0         /* $this$replaceIndentByMargin */
        //    84: invokevirtual   java/lang/String.length:()I
        //    87: aload_1         /* newIndent */
        //    88: invokevirtual   java/lang/String.length:()I
        //    91: aload_3         /* lines */
        //    92: invokeinterface java/util/List.size:()I
        //    97: imul           
        //    98: iadd           
        //    99: istore          5
        //   101: aload_1         /* newIndent */
        //   102: invokestatic    kotlin/text/StringsKt__IndentKt.getIndentFunction$StringsKt__IndentKt:(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;
        //   105: astore          indentAddFunction$iv
        //   107: iconst_0       
        //   108: istore          $i$f$reindent$StringsKt__IndentKt
        //   110: aload           $this$reindent$iv
        //   112: invokestatic    kotlin/collections/CollectionsKt.getLastIndex:(Ljava/util/List;)I
        //   115: istore          lastIndex$iv
        //   117: aload           $this$reindent$iv
        //   119: checkcast       Ljava/lang/Iterable;
        //   122: astore          $this$mapIndexedNotNull$iv$iv
        //   124: iconst_0       
        //   125: istore          $i$f$mapIndexedNotNull
        //   127: aload           $this$mapIndexedNotNull$iv$iv
        //   129: astore          11
        //   131: new             Ljava/util/ArrayList;
        //   134: dup            
        //   135: invokespecial   java/util/ArrayList.<init>:()V
        //   138: checkcast       Ljava/util/Collection;
        //   141: astore          destination$iv$iv$iv
        //   143: iconst_0       
        //   144: istore          $i$f$mapIndexedNotNullTo
        //   146: aload           $this$mapIndexedNotNullTo$iv$iv$iv
        //   148: astore          $this$forEachIndexed$iv$iv$iv$iv
        //   150: iconst_0       
        //   151: istore          $i$f$forEachIndexed
        //   153: iconst_0       
        //   154: istore          index$iv$iv$iv$iv
        //   156: aload           $this$forEachIndexed$iv$iv$iv$iv
        //   158: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   163: astore          17
        //   165: aload           17
        //   167: invokeinterface java/util/Iterator.hasNext:()Z
        //   172: ifeq            482
        //   175: aload           17
        //   177: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   182: astore          item$iv$iv$iv$iv
        //   184: iload           index$iv$iv$iv$iv
        //   186: iinc            index$iv$iv$iv$iv, 1
        //   189: istore          19
        //   191: iconst_0       
        //   192: istore          20
        //   194: iload           19
        //   196: ifge            202
        //   199: invokestatic    kotlin/collections/CollectionsKt.throwIndexOverflow:()V
        //   202: iload           19
        //   204: istore          21
        //   206: iload           21
        //   208: aload           item$iv$iv$iv$iv
        //   210: astore          22
        //   212: istore          index$iv$iv$iv
        //   214: iconst_0       
        //   215: istore          $i$a$-forEachIndexed-CollectionsKt___CollectionsKt$mapIndexedNotNullTo$1$iv$iv$iv
        //   217: iload           index$iv$iv$iv
        //   219: aload           element$iv$iv$iv
        //   221: checkcast       Ljava/lang/String;
        //   224: astore          25
        //   226: istore          index$iv
        //   228: iconst_0       
        //   229: istore          $i$a$-mapIndexedNotNull-StringsKt__IndentKt$reindent$1$iv
        //   231: iload           index$iv
        //   233: ifeq            243
        //   236: iload           index$iv
        //   238: iload           lastIndex$iv
        //   240: if_icmpne       258
        //   243: aload           value$iv
        //   245: checkcast       Ljava/lang/CharSequence;
        //   248: invokestatic    kotlin/text/StringsKt.isBlank:(Ljava/lang/CharSequence;)Z
        //   251: ifeq            258
        //   254: aconst_null    
        //   255: goto            445
        //   258: aload           value$iv
        //   260: astore          line
        //   262: iconst_0       
        //   263: istore          $i$a$-reindent-StringsKt__IndentKt$replaceIndentByMargin$2
        //   265: aload           line
        //   267: checkcast       Ljava/lang/CharSequence;
        //   270: astore          $this$indexOfFirst$iv
        //   272: iconst_0       
        //   273: istore          $i$f$indexOfFirst
        //   275: iconst_0       
        //   276: istore          32
        //   278: aload           $this$indexOfFirst$iv
        //   280: invokeinterface java/lang/CharSequence.length:()I
        //   285: istore          33
        //   287: iload           32
        //   289: iload           33
        //   291: if_icmpge       335
        //   294: aload           $this$indexOfFirst$iv
        //   296: iload           index$iv
        //   298: invokeinterface java/lang/CharSequence.charAt:(I)C
        //   303: istore          it
        //   305: iconst_0       
        //   306: istore          $i$a$-indexOfFirst-StringsKt__IndentKt$replaceIndentByMargin$2$firstNonWhitespaceIndex$1
        //   308: iload           it
        //   310: invokestatic    kotlin/text/CharsKt.isWhitespace:(C)Z
        //   313: ifne            320
        //   316: iconst_1       
        //   317: goto            321
        //   320: iconst_0       
        //   321: ifeq            329
        //   324: iload           index$iv
        //   326: goto            336
        //   329: iinc            index$iv, 1
        //   332: goto            287
        //   335: iconst_m1      
        //   336: istore          firstNonWhitespaceIndex
        //   338: nop            
        //   339: iload           firstNonWhitespaceIndex
        //   341: iconst_m1      
        //   342: if_icmpne       349
        //   345: aconst_null    
        //   346: goto            410
        //   349: aload           line
        //   351: aload_2         /* marginPrefix */
        //   352: iload           firstNonWhitespaceIndex
        //   354: iconst_0       
        //   355: iconst_4       
        //   356: aconst_null    
        //   357: invokestatic    kotlin/text/StringsKt.startsWith$default:(Ljava/lang/String;Ljava/lang/String;IZILjava/lang/Object;)Z
        //   360: ifeq            409
        //   363: aload           line
        //   365: astore          30
        //   367: iload           firstNonWhitespaceIndex
        //   369: aload_2         /* marginPrefix */
        //   370: invokevirtual   java/lang/String.length:()I
        //   373: iadd           
        //   374: istore          31
        //   376: iconst_0       
        //   377: istore          32
        //   379: aload           30
        //   381: dup            
        //   382: ifnonnull       395
        //   385: new             Lkotlin/TypeCastException;
        //   388: dup            
        //   389: ldc             "null cannot be cast to non-null type java.lang.String"
        //   391: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   394: athrow         
        //   395: iload           31
        //   397: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   400: dup            
        //   401: ldc             "(this as java.lang.String).substring(startIndex)"
        //   403: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   406: goto            410
        //   409: aconst_null    
        //   410: nop            
        //   411: dup            
        //   412: ifnull          442
        //   415: astore          37
        //   417: iconst_0       
        //   418: istore          38
        //   420: iconst_0       
        //   421: istore          39
        //   423: aload           indentAddFunction$iv
        //   425: aload           37
        //   427: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   432: checkcast       Ljava/lang/String;
        //   435: dup            
        //   436: ifnull          442
        //   439: goto            445
        //   442: pop            
        //   443: aload           value$iv
        //   445: dup            
        //   446: ifnull          477
        //   449: astore          40
        //   451: iconst_0       
        //   452: istore          41
        //   454: iconst_0       
        //   455: istore          42
        //   457: aload           40
        //   459: astore          it$iv$iv$iv
        //   461: iconst_0       
        //   462: istore          $i$a$-let-CollectionsKt___CollectionsKt$mapIndexedNotNullTo$1$1$iv$iv$iv
        //   464: aload           destination$iv$iv$iv
        //   466: aload           it$iv$iv$iv
        //   468: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   473: pop            
        //   474: goto            478
        //   477: pop            
        //   478: nop            
        //   479: goto            165
        //   482: nop            
        //   483: aload           destination$iv$iv$iv
        //   485: checkcast       Ljava/util/List;
        //   488: checkcast       Ljava/lang/Iterable;
        //   491: new             Ljava/lang/StringBuilder;
        //   494: dup            
        //   495: iload           resultSizeEstimate$iv
        //   497: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   500: checkcast       Ljava/lang/Appendable;
        //   503: ldc             "\n"
        //   505: checkcast       Ljava/lang/CharSequence;
        //   508: aconst_null    
        //   509: aconst_null    
        //   510: iconst_0       
        //   511: aconst_null    
        //   512: aconst_null    
        //   513: bipush          124
        //   515: aconst_null    
        //   516: invokestatic    kotlin/collections/CollectionsKt.joinTo$default:(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Appendable;
        //   519: checkcast       Ljava/lang/StringBuilder;
        //   522: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   525: dup            
        //   526: ldc             "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()"
        //   528: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   531: areturn        
        //    StackMapTable: 00 16 FD 00 25 07 00 4A 01 40 01 FF 00 21 00 06 07 00 5E 07 00 5E 07 00 5E 01 01 01 00 00 FF 00 5C 00 12 07 00 5E 07 00 5E 07 00 5E 07 00 68 07 00 68 01 07 00 83 01 01 07 00 76 01 07 00 76 07 00 7D 01 07 00 76 01 01 07 00 85 00 00 FE 00 24 07 00 04 01 01 FF 00 28 00 1C 07 00 5E 07 00 5E 07 00 5E 07 00 68 07 00 68 01 07 00 83 01 01 07 00 76 01 07 00 76 07 00 7D 01 07 00 76 01 01 07 00 85 07 00 04 01 01 01 07 00 04 01 01 07 00 5E 01 01 00 00 0E FF 00 1C 00 22 07 00 5E 07 00 5E 07 00 5E 07 00 68 07 00 68 01 07 00 83 01 01 07 00 76 01 07 00 76 07 00 7D 01 07 00 76 01 01 07 00 85 07 00 04 01 01 01 07 00 04 01 01 07 00 5E 01 01 07 00 5E 01 07 00 4A 01 01 01 00 00 FD 00 20 01 01 40 01 07 F9 00 05 40 01 FE 00 0C 00 00 01 FF 00 2D 00 25 07 00 5E 07 00 5E 07 00 5E 07 00 68 07 00 68 01 07 00 83 01 01 07 00 76 01 07 00 76 07 00 7D 01 07 00 76 01 01 07 00 85 07 00 04 01 01 01 07 00 04 01 01 07 00 5E 01 01 07 00 5E 01 07 00 5E 01 01 01 00 00 01 00 01 07 00 5E FF 00 0D 00 25 07 00 5E 07 00 5E 07 00 5E 07 00 68 07 00 68 01 07 00 83 01 01 07 00 76 01 07 00 76 07 00 7D 01 07 00 76 01 01 07 00 85 07 00 04 01 01 01 07 00 04 01 01 07 00 5E 01 01 07 00 5E 01 07 00 4A 01 01 01 00 00 01 00 00 FF 00 00 00 25 07 00 5E 07 00 5E 07 00 5E 07 00 68 07 00 68 01 07 00 83 01 01 07 00 76 01 07 00 76 07 00 7D 01 07 00 76 01 01 07 00 85 07 00 04 01 01 01 07 00 04 01 01 07 00 5E 01 01 07 00 5E 01 07 00 04 01 01 01 00 00 01 00 01 07 00 5E 5F 07 00 5E FF 00 02 00 1C 07 00 5E 07 00 5E 07 00 5E 07 00 68 07 00 68 01 07 00 83 01 01 07 00 76 01 07 00 76 07 00 7D 01 07 00 76 01 01 07 00 85 07 00 04 01 01 01 07 00 04 01 01 07 00 5E 01 01 00 01 07 00 5E 5F 07 00 5E 00 FF 00 03 00 12 07 00 5E 07 00 5E 07 00 5E 07 00 68 07 00 68 01 07 00 83 01 01 07 00 76 01 07 00 76 07 00 7D 01 07 00 76 01 01 07 00 85 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final String trimIndent(@NotNull final String $this$trimIndent) {
        Intrinsics.checkParameterIsNotNull($this$trimIndent, "$this$trimIndent");
        return replaceIndent($this$trimIndent, "");
    }
    
    @NotNull
    public static final String replaceIndent(@NotNull final String $this$replaceIndent, @NotNull final String newIndent) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$replaceIndent"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* newIndent */
        //     7: ldc             "newIndent"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* $this$replaceIndent */
        //    13: checkcast       Ljava/lang/CharSequence;
        //    16: invokestatic    kotlin/text/StringsKt.lines:(Ljava/lang/CharSequence;)Ljava/util/List;
        //    19: astore_2        /* lines */
        //    20: aload_2         /* lines */
        //    21: checkcast       Ljava/lang/Iterable;
        //    24: astore          $this$filter$iv
        //    26: iconst_0       
        //    27: istore          $i$f$filter
        //    29: aload           $this$filter$iv
        //    31: astore          6
        //    33: new             Ljava/util/ArrayList;
        //    36: dup            
        //    37: invokespecial   java/util/ArrayList.<init>:()V
        //    40: checkcast       Ljava/util/Collection;
        //    43: astore          destination$iv$iv
        //    45: iconst_0       
        //    46: istore          $i$f$filterTo
        //    48: aload           $this$filterTo$iv$iv
        //    50: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    55: astore          9
        //    57: aload           9
        //    59: invokeinterface java/util/Iterator.hasNext:()Z
        //    64: ifeq            125
        //    67: aload           9
        //    69: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    74: astore          element$iv$iv
        //    76: aload           element$iv$iv
        //    78: checkcast       Ljava/lang/String;
        //    81: astore          p1
        //    83: iconst_0       
        //    84: istore          $i$a$-unknown-StringsKt__IndentKt$replaceIndent$minCommonIndent$1
        //    86: aload           p1
        //    88: checkcast       Ljava/lang/CharSequence;
        //    91: astore          13
        //    93: iconst_0       
        //    94: istore          14
        //    96: aload           13
        //    98: invokestatic    kotlin/text/StringsKt.isBlank:(Ljava/lang/CharSequence;)Z
        //   101: ifne            108
        //   104: iconst_1       
        //   105: goto            109
        //   108: iconst_0       
        //   109: ifeq            57
        //   112: aload           destination$iv$iv
        //   114: aload           element$iv$iv
        //   116: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   121: pop            
        //   122: goto            57
        //   125: aload           destination$iv$iv
        //   127: checkcast       Ljava/util/List;
        //   130: checkcast       Ljava/lang/Iterable;
        //   133: astore          $this$map$iv
        //   135: iconst_0       
        //   136: istore          $i$f$map
        //   138: aload           $this$map$iv
        //   140: astore          6
        //   142: new             Ljava/util/ArrayList;
        //   145: dup            
        //   146: aload           $this$map$iv
        //   148: bipush          10
        //   150: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   153: invokespecial   java/util/ArrayList.<init>:(I)V
        //   156: checkcast       Ljava/util/Collection;
        //   159: astore          destination$iv$iv
        //   161: iconst_0       
        //   162: istore          $i$f$mapTo
        //   164: aload           $this$mapTo$iv$iv
        //   166: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   171: astore          9
        //   173: aload           9
        //   175: invokeinterface java/util/Iterator.hasNext:()Z
        //   180: ifeq            229
        //   183: aload           9
        //   185: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   190: astore          item$iv$iv
        //   192: aload           destination$iv$iv
        //   194: aload           item$iv$iv
        //   196: checkcast       Ljava/lang/String;
        //   199: astore          11
        //   201: astore          38
        //   203: iconst_0       
        //   204: istore          $i$a$-unknown-StringsKt__IndentKt$replaceIndent$minCommonIndent$2
        //   206: aload           p1
        //   208: invokestatic    kotlin/text/StringsKt__IndentKt.indentWidth$StringsKt__IndentKt:(Ljava/lang/String;)I
        //   211: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   214: astore          39
        //   216: aload           38
        //   218: aload           39
        //   220: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   225: pop            
        //   226: goto            173
        //   229: aload           destination$iv$iv
        //   231: checkcast       Ljava/util/List;
        //   234: checkcast       Ljava/lang/Iterable;
        //   237: invokestatic    kotlin/collections/CollectionsKt.min:(Ljava/lang/Iterable;)Ljava/lang/Comparable;
        //   240: checkcast       Ljava/lang/Integer;
        //   243: dup            
        //   244: ifnull          253
        //   247: invokevirtual   java/lang/Integer.intValue:()I
        //   250: goto            255
        //   253: pop            
        //   254: iconst_0       
        //   255: istore_3        /* minCommonIndent */
        //   256: aload_2         /* lines */
        //   257: astore          4
        //   259: aload_0         /* $this$replaceIndent */
        //   260: invokevirtual   java/lang/String.length:()I
        //   263: aload_1         /* newIndent */
        //   264: invokevirtual   java/lang/String.length:()I
        //   267: aload_2         /* lines */
        //   268: invokeinterface java/util/List.size:()I
        //   273: imul           
        //   274: iadd           
        //   275: istore          5
        //   277: aload_1         /* newIndent */
        //   278: invokestatic    kotlin/text/StringsKt__IndentKt.getIndentFunction$StringsKt__IndentKt:(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;
        //   281: astore          indentAddFunction$iv
        //   283: iconst_0       
        //   284: istore          $i$f$reindent$StringsKt__IndentKt
        //   286: aload           $this$reindent$iv
        //   288: invokestatic    kotlin/collections/CollectionsKt.getLastIndex:(Ljava/util/List;)I
        //   291: istore          lastIndex$iv
        //   293: aload           $this$reindent$iv
        //   295: checkcast       Ljava/lang/Iterable;
        //   298: astore          $this$mapIndexedNotNull$iv$iv
        //   300: iconst_0       
        //   301: istore          $i$f$mapIndexedNotNull
        //   303: aload           $this$mapIndexedNotNull$iv$iv
        //   305: astore          11
        //   307: new             Ljava/util/ArrayList;
        //   310: dup            
        //   311: invokespecial   java/util/ArrayList.<init>:()V
        //   314: checkcast       Ljava/util/Collection;
        //   317: astore          destination$iv$iv$iv
        //   319: iconst_0       
        //   320: istore          $i$f$mapIndexedNotNullTo
        //   322: aload           $this$mapIndexedNotNullTo$iv$iv$iv
        //   324: astore          $this$forEachIndexed$iv$iv$iv$iv
        //   326: iconst_0       
        //   327: istore          $i$f$forEachIndexed
        //   329: iconst_0       
        //   330: istore          index$iv$iv$iv$iv
        //   332: aload           $this$forEachIndexed$iv$iv$iv$iv
        //   334: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   339: astore          17
        //   341: aload           17
        //   343: invokeinterface java/util/Iterator.hasNext:()Z
        //   348: ifeq            518
        //   351: aload           17
        //   353: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   358: astore          item$iv$iv$iv$iv
        //   360: iload           index$iv$iv$iv$iv
        //   362: iinc            index$iv$iv$iv$iv, 1
        //   365: istore          19
        //   367: iconst_0       
        //   368: istore          20
        //   370: iload           19
        //   372: ifge            378
        //   375: invokestatic    kotlin/collections/CollectionsKt.throwIndexOverflow:()V
        //   378: iload           19
        //   380: istore          21
        //   382: iload           21
        //   384: aload           item$iv$iv$iv$iv
        //   386: astore          22
        //   388: istore          index$iv$iv$iv
        //   390: iconst_0       
        //   391: istore          $i$a$-forEachIndexed-CollectionsKt___CollectionsKt$mapIndexedNotNullTo$1$iv$iv$iv
        //   393: iload           index$iv$iv$iv
        //   395: aload           element$iv$iv$iv
        //   397: checkcast       Ljava/lang/String;
        //   400: astore          25
        //   402: istore          index$iv
        //   404: iconst_0       
        //   405: istore          $i$a$-mapIndexedNotNull-StringsKt__IndentKt$reindent$1$iv
        //   407: iload           index$iv
        //   409: ifeq            419
        //   412: iload           index$iv
        //   414: iload           lastIndex$iv
        //   416: if_icmpne       434
        //   419: aload           value$iv
        //   421: checkcast       Ljava/lang/CharSequence;
        //   424: invokestatic    kotlin/text/StringsKt.isBlank:(Ljava/lang/CharSequence;)Z
        //   427: ifeq            434
        //   430: aconst_null    
        //   431: goto            481
        //   434: aload           value$iv
        //   436: astore          line
        //   438: iconst_0       
        //   439: istore          $i$a$-reindent-StringsKt__IndentKt$replaceIndent$1
        //   441: aload           line
        //   443: iload_3         /* minCommonIndent */
        //   444: invokestatic    kotlin/text/StringsKt.drop:(Ljava/lang/String;I)Ljava/lang/String;
        //   447: dup            
        //   448: ifnull          478
        //   451: astore          30
        //   453: iconst_0       
        //   454: istore          31
        //   456: iconst_0       
        //   457: istore          32
        //   459: aload           indentAddFunction$iv
        //   461: aload           30
        //   463: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   468: checkcast       Ljava/lang/String;
        //   471: dup            
        //   472: ifnull          478
        //   475: goto            481
        //   478: pop            
        //   479: aload           value$iv
        //   481: dup            
        //   482: ifnull          513
        //   485: astore          33
        //   487: iconst_0       
        //   488: istore          34
        //   490: iconst_0       
        //   491: istore          35
        //   493: aload           33
        //   495: astore          it$iv$iv$iv
        //   497: iconst_0       
        //   498: istore          $i$a$-let-CollectionsKt___CollectionsKt$mapIndexedNotNullTo$1$1$iv$iv$iv
        //   500: aload           destination$iv$iv$iv
        //   502: aload           it$iv$iv$iv
        //   504: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   509: pop            
        //   510: goto            514
        //   513: pop            
        //   514: nop            
        //   515: goto            341
        //   518: nop            
        //   519: aload           destination$iv$iv$iv
        //   521: checkcast       Ljava/util/List;
        //   524: checkcast       Ljava/lang/Iterable;
        //   527: new             Ljava/lang/StringBuilder;
        //   530: dup            
        //   531: iload           resultSizeEstimate$iv
        //   533: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   536: checkcast       Ljava/lang/Appendable;
        //   539: ldc             "\n"
        //   541: checkcast       Ljava/lang/CharSequence;
        //   544: aconst_null    
        //   545: aconst_null    
        //   546: iconst_0       
        //   547: aconst_null    
        //   548: aconst_null    
        //   549: bipush          124
        //   551: aconst_null    
        //   552: invokestatic    kotlin/collections/CollectionsKt.joinTo$default:(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Appendable;
        //   555: checkcast       Ljava/lang/StringBuilder;
        //   558: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   561: dup            
        //   562: ldc             "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()"
        //   564: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   567: areturn        
        //    StackMapTable: 00 11 FF 00 39 00 0A 07 00 5E 07 00 5E 07 00 68 00 07 00 76 01 07 00 76 07 00 7D 01 07 00 85 00 00 FF 00 32 00 0F 07 00 5E 07 00 5E 07 00 68 00 07 00 76 01 07 00 76 07 00 7D 01 07 00 85 07 00 04 07 00 5E 01 07 00 4A 01 00 00 40 01 FF 00 0F 00 0A 07 00 5E 07 00 5E 07 00 68 00 07 00 76 01 07 00 76 07 00 7D 01 07 00 85 00 00 2F 37 57 07 00 FE 41 01 FF 00 55 00 12 07 00 5E 07 00 5E 07 00 68 01 07 00 68 01 07 00 83 01 01 07 00 76 01 07 00 76 07 00 7D 01 07 00 76 01 01 07 00 85 00 00 FE 00 24 07 00 04 01 01 FF 00 28 00 1C 07 00 5E 07 00 5E 07 00 68 01 07 00 68 01 07 00 83 01 01 07 00 76 01 07 00 76 07 00 7D 01 07 00 76 01 01 07 00 85 07 00 04 01 01 01 07 00 04 01 01 07 00 5E 01 01 00 00 0E FF 00 2B 00 1E 07 00 5E 07 00 5E 07 00 68 01 07 00 68 01 07 00 83 01 01 07 00 76 01 07 00 76 07 00 7D 01 07 00 76 01 01 07 00 85 07 00 04 01 01 01 07 00 04 01 01 07 00 5E 01 01 07 00 5E 01 00 01 07 00 5E FF 00 02 00 1C 07 00 5E 07 00 5E 07 00 68 01 07 00 68 01 07 00 83 01 01 07 00 76 01 07 00 76 07 00 7D 01 07 00 76 01 01 07 00 85 07 00 04 01 01 01 07 00 04 01 01 07 00 5E 01 01 00 01 07 00 5E 5F 07 00 5E 00 FF 00 03 00 12 07 00 5E 07 00 5E 07 00 68 01 07 00 68 01 07 00 83 01 01 07 00 76 01 07 00 76 07 00 7D 01 07 00 76 01 01 07 00 85 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final String prependIndent(@NotNull final String $this$prependIndent, @NotNull final String indent) {
        Intrinsics.checkParameterIsNotNull($this$prependIndent, "$this$prependIndent");
        Intrinsics.checkParameterIsNotNull(indent, "indent");
        return SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.map((Sequence<?>)StringsKt__StringsKt.lineSequence($this$prependIndent), (Function1<? super Object, ?>)new StringsKt__IndentKt$prependIndent.StringsKt__IndentKt$prependIndent$1(indent)), "\n", null, null, 0, null, null, 62, null);
    }
    
    private static final int indentWidth$StringsKt__IndentKt(@NotNull final String $this$indentWidth) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Ljava/lang/CharSequence;
        //     4: astore_1        /* $this$indexOfFirst$iv */
        //     5: iconst_0       
        //     6: istore_2        /* $i$f$indexOfFirst */
        //     7: iconst_0       
        //     8: istore_3       
        //     9: aload_1         /* $this$indexOfFirst$iv */
        //    10: invokeinterface java/lang/CharSequence.length:()I
        //    15: istore          4
        //    17: iload_3        
        //    18: iload           4
        //    20: if_icmpge       61
        //    23: aload_1         /* $this$indexOfFirst$iv */
        //    24: iload_3         /* index$iv */
        //    25: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    30: istore          it
        //    32: iconst_0       
        //    33: istore          $i$a$-indexOfFirst-StringsKt__IndentKt$indentWidth$1
        //    35: iload           it
        //    37: invokestatic    kotlin/text/CharsKt.isWhitespace:(C)Z
        //    40: ifne            47
        //    43: iconst_1       
        //    44: goto            48
        //    47: iconst_0       
        //    48: ifeq            55
        //    51: iload_3         /* index$iv */
        //    52: goto            62
        //    55: iinc            index$iv, 1
        //    58: goto            17
        //    61: iconst_m1      
        //    62: istore_1        /* $this$indexOfFirst$iv */
        //    63: iconst_0       
        //    64: istore_2       
        //    65: iconst_0       
        //    66: istore_3       
        //    67: iload_1        
        //    68: istore          it
        //    70: iconst_0       
        //    71: istore          $i$a$-let-StringsKt__IndentKt$indentWidth$2
        //    73: iload           it
        //    75: iconst_m1      
        //    76: if_icmpne       86
        //    79: aload_0         /* $this$indentWidth */
        //    80: invokevirtual   java/lang/String.length:()I
        //    83: goto            88
        //    86: iload           it
        //    88: ireturn        
        //    StackMapTable: 00 08 FF 00 11 00 05 07 00 5E 07 00 4A 01 01 01 00 00 FD 00 1D 01 01 40 01 06 F9 00 05 40 01 FF 00 17 00 06 07 00 5E 01 01 01 01 01 00 00 41 01
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(final String indent) {
        return (Function1<String, String>)((indent.length() == 0) ? StringsKt__IndentKt$getIndentFunction.StringsKt__IndentKt$getIndentFunction$1.INSTANCE : ((Function1<String, String>)new StringsKt__IndentKt$getIndentFunction.StringsKt__IndentKt$getIndentFunction$2(indent)));
    }
    
    private static final String reindent$StringsKt__IndentKt(@NotNull final List<String> $this$reindent, final int resultSizeEstimate, final Function1<? super String, String> indentAddFunction, final Function1<? super String, String> indentCutFunction) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore          $i$f$reindent$StringsKt__IndentKt
        //     4: aload_0         /* $this$reindent */
        //     5: invokestatic    kotlin/collections/CollectionsKt.getLastIndex:(Ljava/util/List;)I
        //     8: istore          lastIndex
        //    10: aload_0         /* $this$reindent */
        //    11: checkcast       Ljava/lang/Iterable;
        //    14: astore          $this$mapIndexedNotNull$iv
        //    16: iconst_0       
        //    17: istore          $i$f$mapIndexedNotNull
        //    19: aload           $this$mapIndexedNotNull$iv
        //    21: astore          8
        //    23: new             Ljava/util/ArrayList;
        //    26: dup            
        //    27: invokespecial   java/util/ArrayList.<init>:()V
        //    30: checkcast       Ljava/util/Collection;
        //    33: astore          destination$iv$iv
        //    35: iconst_0       
        //    36: istore          $i$f$mapIndexedNotNullTo
        //    38: aload           $this$mapIndexedNotNullTo$iv$iv
        //    40: astore          $this$forEachIndexed$iv$iv$iv
        //    42: iconst_0       
        //    43: istore          $i$f$forEachIndexed
        //    45: iconst_0       
        //    46: istore          index$iv$iv$iv
        //    48: aload           $this$forEachIndexed$iv$iv$iv
        //    50: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    55: astore          14
        //    57: aload           14
        //    59: invokeinterface java/util/Iterator.hasNext:()Z
        //    64: ifeq            257
        //    67: aload           14
        //    69: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    74: astore          item$iv$iv$iv
        //    76: iload           index$iv$iv$iv
        //    78: iinc            index$iv$iv$iv, 1
        //    81: istore          16
        //    83: iconst_0       
        //    84: istore          17
        //    86: iload           16
        //    88: ifge            120
        //    91: iconst_1       
        //    92: iconst_3       
        //    93: iconst_0       
        //    94: invokestatic    kotlin/internal/PlatformImplementationsKt.apiVersionIsAtLeast:(III)Z
        //    97: ifeq            106
        //   100: invokestatic    kotlin/collections/CollectionsKt.throwIndexOverflow:()V
        //   103: goto            120
        //   106: new             Ljava/lang/ArithmeticException;
        //   109: dup            
        //   110: ldc_w           "Index overflow has happened."
        //   113: invokespecial   java/lang/ArithmeticException.<init>:(Ljava/lang/String;)V
        //   116: checkcast       Ljava/lang/Throwable;
        //   119: athrow         
        //   120: iload           16
        //   122: istore          18
        //   124: iload           18
        //   126: aload           item$iv$iv$iv
        //   128: astore          19
        //   130: istore          index$iv$iv
        //   132: iconst_0       
        //   133: istore          $i$a$-forEachIndexed-CollectionsKt___CollectionsKt$mapIndexedNotNullTo$1$iv$iv
        //   135: iload           index$iv$iv
        //   137: aload           element$iv$iv
        //   139: checkcast       Ljava/lang/String;
        //   142: astore          22
        //   144: istore          index
        //   146: iconst_0       
        //   147: istore          $i$a$-mapIndexedNotNull-StringsKt__IndentKt$reindent$1
        //   149: iload           index
        //   151: ifeq            161
        //   154: iload           index
        //   156: iload           lastIndex
        //   158: if_icmpne       176
        //   161: aload           value
        //   163: checkcast       Ljava/lang/CharSequence;
        //   166: invokestatic    kotlin/text/StringsKt.isBlank:(Ljava/lang/CharSequence;)Z
        //   169: ifeq            176
        //   172: aconst_null    
        //   173: goto            220
        //   176: aload_3         /* indentCutFunction */
        //   177: aload           value
        //   179: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   184: checkcast       Ljava/lang/String;
        //   187: dup            
        //   188: ifnull          217
        //   191: astore          25
        //   193: iconst_0       
        //   194: istore          26
        //   196: iconst_0       
        //   197: istore          27
        //   199: aload_2         /* indentAddFunction */
        //   200: aload           25
        //   202: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   207: checkcast       Ljava/lang/String;
        //   210: dup            
        //   211: ifnull          217
        //   214: goto            220
        //   217: pop            
        //   218: aload           value
        //   220: dup            
        //   221: ifnull          252
        //   224: astore          28
        //   226: iconst_0       
        //   227: istore          29
        //   229: iconst_0       
        //   230: istore          30
        //   232: aload           28
        //   234: astore          it$iv$iv
        //   236: iconst_0       
        //   237: istore          $i$a$-let-CollectionsKt___CollectionsKt$mapIndexedNotNullTo$1$1$iv$iv
        //   239: aload           destination$iv$iv
        //   241: aload           it$iv$iv
        //   243: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   248: pop            
        //   249: goto            253
        //   252: pop            
        //   253: nop            
        //   254: goto            57
        //   257: nop            
        //   258: aload           destination$iv$iv
        //   260: checkcast       Ljava/util/List;
        //   263: checkcast       Ljava/lang/Iterable;
        //   266: new             Ljava/lang/StringBuilder;
        //   269: dup            
        //   270: iload_1         /* resultSizeEstimate */
        //   271: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   274: checkcast       Ljava/lang/Appendable;
        //   277: ldc             "\n"
        //   279: checkcast       Ljava/lang/CharSequence;
        //   282: aconst_null    
        //   283: aconst_null    
        //   284: iconst_0       
        //   285: aconst_null    
        //   286: aconst_null    
        //   287: bipush          124
        //   289: aconst_null    
        //   290: invokestatic    kotlin/collections/CollectionsKt.joinTo$default:(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Appendable;
        //   293: checkcast       Ljava/lang/StringBuilder;
        //   296: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   299: dup            
        //   300: ldc             "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()"
        //   302: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   305: areturn        
        //    Signature:
        //  (Ljava/util/List<Ljava/lang/String;>;ILkotlin/jvm/functions/Function1<-Ljava/lang/String;Ljava/lang/String;>;Lkotlin/jvm/functions/Function1<-Ljava/lang/String;Ljava/lang/String;>;)Ljava/lang/String;
        //    StackMapTable: 00 0A FF 00 39 00 0F 07 00 68 01 07 00 83 07 00 83 01 01 07 00 76 01 07 00 76 07 00 7D 01 07 00 76 01 01 07 00 85 00 00 FE 00 30 07 00 04 01 01 0D FF 00 28 00 19 07 00 68 01 07 00 83 07 00 83 01 01 07 00 76 01 07 00 76 07 00 7D 01 07 00 76 01 01 07 00 85 07 00 04 01 01 01 07 00 04 01 01 07 00 5E 01 01 00 00 0E 68 07 00 5E 42 07 00 5E 5F 07 00 5E 00 FF 00 03 00 0F 07 00 68 01 07 00 83 07 00 83 01 01 07 00 76 01 07 00 76 07 00 7D 01 07 00 76 01 01 07 00 85 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public StringsKt__IndentKt() {
    }
}
