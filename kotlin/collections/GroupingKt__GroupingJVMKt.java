// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.internal.InlineOnly;
import kotlin.PublishedApi;
import java.util.Iterator;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.TypeCastException;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.SinceKotlin;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000&\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\u001a0\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u0005H\u0007\u001aW\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\b*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\u00072\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\f\u0012\u0004\u0012\u0002H\b0\u000bH\u0081\b¨\u0006\r" }, d2 = { "eachCount", "", "K", "", "T", "Lkotlin/collections/Grouping;", "mapValuesInPlace", "", "R", "V", "f", "Lkotlin/Function1;", "", "kotlin-stdlib" }, xs = "kotlin/collections/GroupingKt")
class GroupingKt__GroupingJVMKt
{
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K> Map<K, Integer> eachCount(@NotNull final Grouping<T, ? extends K> $this$eachCount) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$eachCount"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$eachCount */
        //     7: astore_1       
        //     8: iconst_0       
        //     9: istore_2       
        //    10: new             Ljava/util/LinkedHashMap;
        //    13: dup            
        //    14: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    17: checkcast       Ljava/util/Map;
        //    20: astore_2        /* destination$iv */
        //    21: iconst_0       
        //    22: istore_3        /* $i$f$foldTo */
        //    23: aload_1         /* $this$foldTo$iv */
        //    24: astore          $this$aggregateTo$iv$iv
        //    26: iconst_0       
        //    27: istore          $i$f$aggregateTo
        //    29: aload           $this$aggregateTo$iv$iv
        //    31: invokeinterface kotlin/collections/Grouping.sourceIterator:()Ljava/util/Iterator;
        //    36: astore          6
        //    38: iconst_0       
        //    39: istore          7
        //    41: aload           6
        //    43: astore          8
        //    45: aload           8
        //    47: invokeinterface java/util/Iterator.hasNext:()Z
        //    52: ifeq            230
        //    55: aload           8
        //    57: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    62: astore          e$iv$iv
        //    64: aload           $this$aggregateTo$iv$iv
        //    66: aload           e$iv$iv
        //    68: invokeinterface kotlin/collections/Grouping.keyOf:(Ljava/lang/Object;)Ljava/lang/Object;
        //    73: astore          key$iv$iv
        //    75: aload_2         /* destination$iv */
        //    76: aload           key$iv$iv
        //    78: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    83: astore          accumulator$iv$iv
        //    85: aload_2         /* destination$iv */
        //    86: aload           key$iv$iv
        //    88: aload           key$iv$iv
        //    90: aload           accumulator$iv$iv
        //    92: aload           e$iv$iv
        //    94: aload           accumulator$iv$iv
        //    96: ifnonnull       114
        //    99: aload_2         /* destination$iv */
        //   100: aload           key$iv$iv
        //   102: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   107: ifne            114
        //   110: iconst_1       
        //   111: goto            115
        //   114: iconst_0       
        //   115: istore          10
        //   117: astore          11
        //   119: astore          12
        //   121: astore          13
        //   123: astore          14
        //   125: astore          15
        //   127: iconst_0       
        //   128: istore          $i$a$-aggregateTo-GroupingKt__GroupingKt$foldTo$1$iv
        //   130: aload           key$iv
        //   132: iload           first$iv
        //   134: ifeq            166
        //   137: aload           key$iv
        //   139: aload           e$iv
        //   141: astore          17
        //   143: astore          18
        //   145: astore          26
        //   147: iconst_0       
        //   148: istore          $i$a$-foldTo-GroupingKt__GroupingJVMKt$eachCount$1
        //   150: new             Lkotlin/jvm/internal/Ref$IntRef;
        //   153: dup            
        //   154: invokespecial   kotlin/jvm/internal/Ref$IntRef.<init>:()V
        //   157: astore          27
        //   159: aload           26
        //   161: aload           27
        //   163: goto            168
        //   166: aload           acc$iv
        //   168: aload           e$iv
        //   170: astore          19
        //   172: checkcast       Lkotlin/jvm/internal/Ref$IntRef;
        //   175: astore          17
        //   177: astore          $noName_0
        //   179: iconst_0       
        //   180: istore          $i$a$-foldTo-GroupingKt__GroupingJVMKt$eachCount$2
        //   182: aload           acc
        //   184: astore          21
        //   186: iconst_0       
        //   187: istore          22
        //   189: iconst_0       
        //   190: istore          23
        //   192: aload           21
        //   194: astore          $this$apply
        //   196: iconst_0       
        //   197: istore          $i$a$-apply-GroupingKt__GroupingJVMKt$eachCount$2$1
        //   199: aload           $this$apply
        //   201: dup            
        //   202: getfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //   205: iconst_1       
        //   206: iadd           
        //   207: putfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //   210: aload           21
        //   212: nop            
        //   213: astore          18
        //   215: aload           15
        //   217: aload           14
        //   219: aload           18
        //   221: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   226: pop            
        //   227: goto            45
        //   230: aload_2         /* destination$iv */
        //   231: nop            
        //   232: astore_1        /* $this$foldTo$iv */
        //   233: iconst_0       
        //   234: istore_2       
        //   235: aload_1        
        //   236: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   241: checkcast       Ljava/lang/Iterable;
        //   244: astore_3       
        //   245: iconst_0       
        //   246: istore          4
        //   248: aload_3        
        //   249: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   254: astore          5
        //   256: aload           5
        //   258: invokeinterface java/util/Iterator.hasNext:()Z
        //   263: ifeq            344
        //   266: aload           5
        //   268: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   273: astore          6
        //   275: aload           6
        //   277: checkcast       Ljava/util/Map$Entry;
        //   280: astore          7
        //   282: iconst_0       
        //   283: istore          8
        //   285: aload           7
        //   287: dup            
        //   288: ifnonnull       301
        //   291: new             Lkotlin/TypeCastException;
        //   294: dup            
        //   295: ldc             "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K, R>"
        //   297: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   300: athrow         
        //   301: invokestatic    kotlin/jvm/internal/TypeIntrinsics.asMutableMapEntry:(Ljava/lang/Object;)Ljava/util/Map$Entry;
        //   304: aload           7
        //   306: astore          9
        //   308: astore          26
        //   310: iconst_0       
        //   311: istore          $i$a$-mapValuesInPlace-GroupingKt__GroupingJVMKt$eachCount$3
        //   313: aload           it
        //   315: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   320: checkcast       Lkotlin/jvm/internal/Ref$IntRef;
        //   323: getfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //   326: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   329: astore          27
        //   331: aload           26
        //   333: aload           27
        //   335: invokeinterface java/util/Map$Entry.setValue:(Ljava/lang/Object;)Ljava/lang/Object;
        //   340: pop            
        //   341: goto            256
        //   344: aload_1        
        //   345: invokestatic    kotlin/jvm/internal/TypeIntrinsics.asMutableMap:(Ljava/lang/Object;)Ljava/util/Map;
        //   348: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;K:Ljava/lang/Object;>(Lkotlin/collections/Grouping<TT;+TK;>;)Ljava/util/Map<TK;Ljava/lang/Integer;>;
        //    StackMapTable: 00 09 FF 00 2D 00 09 07 00 36 07 00 36 07 00 34 01 07 00 36 01 07 00 04 00 07 00 3C 00 00 FF 00 44 00 0A 07 00 36 07 00 36 07 00 34 01 07 00 36 01 07 00 04 07 00 04 07 00 3C 07 00 04 00 05 07 00 34 07 00 04 07 00 04 07 00 04 07 00 04 FF 00 00 00 0A 07 00 36 07 00 36 07 00 34 01 07 00 36 01 07 00 04 07 00 04 07 00 3C 07 00 04 00 06 07 00 34 07 00 04 07 00 04 07 00 04 07 00 04 01 FF 00 32 00 11 07 00 36 07 00 36 07 00 34 01 07 00 36 01 07 00 04 07 00 04 07 00 3C 07 00 04 01 07 00 04 07 00 04 07 00 04 07 00 04 07 00 34 01 00 01 07 00 04 FF 00 01 00 11 07 00 36 07 00 36 07 00 34 01 07 00 36 01 07 00 04 07 00 04 07 00 3C 07 00 04 01 07 00 04 07 00 04 07 00 04 07 00 04 07 00 34 01 00 02 07 00 04 07 00 04 FF 00 3D 00 09 07 00 36 07 00 36 07 00 34 01 07 00 36 01 07 00 04 00 07 00 3C 00 00 FF 00 19 00 07 07 00 36 07 00 34 01 07 00 60 01 07 00 3C 07 00 04 00 00 FF 00 2C 00 09 07 00 36 07 00 34 01 07 00 60 01 07 00 3C 07 00 04 07 00 65 01 00 01 07 00 65 F9 00 2A
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @PublishedApi
    @InlineOnly
    private static final <K, V, R> Map<K, R> mapValuesInPlace(@NotNull final Map<K, V> $this$mapValuesInPlace, final Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> f) {
        final int $i$f$mapValuesInPlace = 0;
        final Iterable $this$forEach$iv = $this$mapValuesInPlace.entrySet();
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Map.Entry it = (Map.Entry)element$iv;
            final int n = 0;
            final Map.Entry obj = it;
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K, R>");
            }
            TypeIntrinsics.asMutableMapEntry(obj).setValue(f.invoke((Object)it));
        }
        if ($this$mapValuesInPlace == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, R>");
        }
        return (Map<K, R>)TypeIntrinsics.asMutableMap($this$mapValuesInPlace);
    }
    
    public GroupingKt__GroupingJVMKt() {
    }
}
