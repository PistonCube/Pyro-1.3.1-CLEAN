// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function2;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.SinceKotlin;
import java.util.Map;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000@\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u009b\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052b\u0010\u0006\u001a^\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00030\u0007H\u0087\b\u001a´\u0001\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102b\u0010\u0006\u001a^\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00030\u0007H\u0087\b¢\u0006\u0002\u0010\u0013\u001aI\u0010\u0014\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0016\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00150\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u0010H\u0007¢\u0006\u0002\u0010\u0016\u001a¼\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u000526\u0010\u0018\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u00192K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u001aH\u0087\b\u001a|\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u001b\u001a\u0002H\u000326\u0010\u0006\u001a2\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u0019H\u0087\b¢\u0006\u0002\u0010\u001c\u001a\u00d5\u0001\u0010\u001d\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u001026\u0010\u0018\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u00192K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u001aH\u0087\b¢\u0006\u0002\u0010\u001e\u001a\u0090\u0001\u0010\u001d\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102\u0006\u0010\u001b\u001a\u0002H\u000326\u0010\u0006\u001a2\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u0019H\u0087\b¢\u0006\u0002\u0010\u001f\u001a\u0088\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0\u0001\"\u0004\b\u0000\u0010!\"\b\b\u0001\u0010\u0004*\u0002H!\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H!¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H!0\u001aH\u0087\b\u001a¡\u0001\u0010\"\u001a\u0002H\u0010\"\u0004\b\u0000\u0010!\"\b\b\u0001\u0010\u0004*\u0002H!\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H!¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H!0\u001aH\u0087\b¢\u0006\u0002\u0010#¨\u0006$" }, d2 = { "aggregate", "", "K", "R", "T", "Lkotlin/collections/Grouping;", "operation", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "key", "accumulator", "element", "", "first", "aggregateTo", "M", "", "destination", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function4;)Ljava/util/Map;", "eachCountTo", "", "(Lkotlin/collections/Grouping;Ljava/util/Map;)Ljava/util/Map;", "fold", "initialValueSelector", "Lkotlin/Function2;", "Lkotlin/Function3;", "initialValue", "(Lkotlin/collections/Grouping;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "foldTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "(Lkotlin/collections/Grouping;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "reduce", "S", "reduceTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "kotlin-stdlib" }, xs = "kotlin/collections/GroupingKt")
class GroupingKt__GroupingKt extends GroupingKt__GroupingJVMKt
{
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> aggregate(@NotNull final Grouping<T, ? extends K> $this$aggregate, @NotNull final Function4<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$aggregate */
        //     3: aload_0         /* $this$aggregate */
        //     4: ldc             "$this$aggregate"
        //     6: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     9: aload_1         /* operation */
        //    10: ldc             "operation"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_0         /* $this$aggregate */
        //    16: astore_3       
        //    17: iconst_0       
        //    18: istore          4
        //    20: new             Ljava/util/LinkedHashMap;
        //    23: dup            
        //    24: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    27: checkcast       Ljava/util/Map;
        //    30: astore          destination$iv
        //    32: iconst_0       
        //    33: istore          $i$f$aggregateTo
        //    35: aload_3         /* $this$aggregateTo$iv */
        //    36: invokeinterface kotlin/collections/Grouping.sourceIterator:()Ljava/util/Iterator;
        //    41: astore          6
        //    43: iconst_0       
        //    44: istore          7
        //    46: aload           6
        //    48: astore          8
        //    50: aload           8
        //    52: invokeinterface java/util/Iterator.hasNext:()Z
        //    57: ifeq            140
        //    60: aload           8
        //    62: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    67: astore          e$iv
        //    69: aload_3         /* $this$aggregateTo$iv */
        //    70: aload           e$iv
        //    72: invokeinterface kotlin/collections/Grouping.keyOf:(Ljava/lang/Object;)Ljava/lang/Object;
        //    77: astore          key$iv
        //    79: aload           destination$iv
        //    81: aload           key$iv
        //    83: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    88: astore          accumulator$iv
        //    90: aload           destination$iv
        //    92: aload           key$iv
        //    94: aload_1         /* operation */
        //    95: aload           key$iv
        //    97: aload           accumulator$iv
        //    99: aload           e$iv
        //   101: aload           accumulator$iv
        //   103: ifnonnull       122
        //   106: aload           destination$iv
        //   108: aload           key$iv
        //   110: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   115: ifne            122
        //   118: iconst_1       
        //   119: goto            123
        //   122: iconst_0       
        //   123: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   126: invokeinterface kotlin/jvm/functions/Function4.invoke:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   131: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   136: pop            
        //   137: goto            50
        //   140: aload           destination$iv
        //   142: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;K:Ljava/lang/Object;R:Ljava/lang/Object;>(Lkotlin/collections/Grouping<TT;+TK;>;Lkotlin/jvm/functions/Function4<-TK;-TR;-TT;-Ljava/lang/Boolean;+TR;>;)Ljava/util/Map<TK;TR;>;
        //    StackMapTable: 00 04 FF 00 32 00 09 07 00 4E 07 00 54 01 07 00 4E 07 00 4C 01 07 00 56 00 07 00 58 00 00 FF 00 47 00 0A 07 00 4E 07 00 54 01 07 00 4E 07 00 4C 01 07 00 56 07 00 56 07 00 58 07 00 56 00 06 07 00 4C 07 00 56 07 00 54 07 00 56 07 00 56 07 00 56 FF 00 00 00 0A 07 00 4E 07 00 54 01 07 00 4E 07 00 4C 01 07 00 56 07 00 56 07 00 58 07 00 56 00 07 07 00 4C 07 00 56 07 00 54 07 00 56 07 00 56 07 00 56 01 FF 00 10 00 09 07 00 4E 07 00 54 01 07 00 4E 07 00 4C 01 07 00 56 00 07 00 58 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M aggregateTo(@NotNull final Grouping<T, ? extends K> $this$aggregateTo, @NotNull final M destination, @NotNull final Function4<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        final int $i$f$aggregateTo = 0;
        Intrinsics.checkParameterIsNotNull($this$aggregateTo, "$this$aggregateTo");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        final Iterator<T> sourceIterator = $this$aggregateTo.sourceIterator();
        while (sourceIterator.hasNext()) {
            final Object e = sourceIterator.next();
            final Object key = $this$aggregateTo.keyOf((T)e);
            final Object accumulator = ((Map<K, Object>)destination).get(key);
            destination.put((Object)key, (R)operation.invoke((Object)key, (Object)accumulator, (Object)e, Boolean.valueOf(accumulator == null && !destination.containsKey(key))));
        }
        return destination;
    }
    
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> fold(@NotNull final Grouping<T, ? extends K> $this$fold, @NotNull final Function2<? super K, ? super T, ? extends R> initialValueSelector, @NotNull final Function3<? super K, ? super R, ? super T, ? extends R> operation) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_3        /* $i$f$fold */
        //     3: aload_0         /* $this$fold */
        //     4: ldc             "$this$fold"
        //     6: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     9: aload_1         /* initialValueSelector */
        //    10: ldc             "initialValueSelector"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_2         /* operation */
        //    16: ldc             "operation"
        //    18: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    21: aload_0         /* $this$fold */
        //    22: astore          $this$aggregate$iv
        //    24: iconst_0       
        //    25: istore          $i$f$aggregate
        //    27: aload           $this$aggregate$iv
        //    29: astore          6
        //    31: iconst_0       
        //    32: istore          7
        //    34: new             Ljava/util/LinkedHashMap;
        //    37: dup            
        //    38: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    41: checkcast       Ljava/util/Map;
        //    44: astore          destination$iv$iv
        //    46: iconst_0       
        //    47: istore          $i$f$aggregateTo
        //    49: aload           $this$aggregateTo$iv$iv
        //    51: invokeinterface kotlin/collections/Grouping.sourceIterator:()Ljava/util/Iterator;
        //    56: astore          9
        //    58: iconst_0       
        //    59: istore          10
        //    61: aload           9
        //    63: astore          11
        //    65: aload           11
        //    67: invokeinterface java/util/Iterator.hasNext:()Z
        //    72: ifeq            200
        //    75: aload           11
        //    77: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    82: astore          e$iv$iv
        //    84: aload           $this$aggregateTo$iv$iv
        //    86: aload           e$iv$iv
        //    88: invokeinterface kotlin/collections/Grouping.keyOf:(Ljava/lang/Object;)Ljava/lang/Object;
        //    93: astore          key$iv$iv
        //    95: aload           destination$iv$iv
        //    97: aload           key$iv$iv
        //    99: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   104: astore          accumulator$iv$iv
        //   106: aload           destination$iv$iv
        //   108: aload           key$iv$iv
        //   110: aload           key$iv$iv
        //   112: aload           accumulator$iv$iv
        //   114: aload           e$iv$iv
        //   116: aload           accumulator$iv$iv
        //   118: ifnonnull       137
        //   121: aload           destination$iv$iv
        //   123: aload           key$iv$iv
        //   125: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   130: ifne            137
        //   133: iconst_1       
        //   134: goto            138
        //   137: iconst_0       
        //   138: istore          13
        //   140: astore          14
        //   142: astore          15
        //   144: astore          16
        //   146: astore          19
        //   148: astore          18
        //   150: iconst_0       
        //   151: istore          $i$a$-aggregate-GroupingKt__GroupingKt$fold$1
        //   153: aload_2         /* operation */
        //   154: aload           key
        //   156: iload           first
        //   158: ifeq            174
        //   161: aload_1         /* initialValueSelector */
        //   162: aload           key
        //   164: aload           e
        //   166: invokeinterface kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   171: goto            176
        //   174: aload           acc
        //   176: aload           e
        //   178: invokeinterface kotlin/jvm/functions/Function3.invoke:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   183: astore          20
        //   185: aload           18
        //   187: aload           19
        //   189: aload           20
        //   191: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   196: pop            
        //   197: goto            65
        //   200: aload           destination$iv$iv
        //   202: nop            
        //   203: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;K:Ljava/lang/Object;R:Ljava/lang/Object;>(Lkotlin/collections/Grouping<TT;+TK;>;Lkotlin/jvm/functions/Function2<-TK;-TT;+TR;>;Lkotlin/jvm/functions/Function3<-TK;-TR;-TT;+TR;>;)Ljava/util/Map<TK;TR;>;
        //    StackMapTable: 00 06 FF 00 41 00 0C 07 00 4E 07 00 8E 07 00 90 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 00 07 00 58 00 00 FF 00 47 00 0D 07 00 4E 07 00 8E 07 00 90 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 07 00 56 07 00 58 07 00 56 00 05 07 00 4C 07 00 56 07 00 56 07 00 56 07 00 56 FF 00 00 00 0D 07 00 4E 07 00 8E 07 00 90 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 07 00 56 07 00 58 07 00 56 00 06 07 00 4C 07 00 56 07 00 56 07 00 56 07 00 56 01 FF 00 23 00 14 07 00 4E 07 00 8E 07 00 90 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 07 00 56 07 00 58 07 00 56 01 07 00 56 07 00 56 07 00 56 01 07 00 4C 07 00 56 00 02 07 00 90 07 00 56 FF 00 01 00 14 07 00 4E 07 00 8E 07 00 90 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 07 00 56 07 00 58 07 00 56 01 07 00 56 07 00 56 07 00 56 01 07 00 4C 07 00 56 00 03 07 00 90 07 00 56 07 00 56 FF 00 17 00 0C 07 00 4E 07 00 8E 07 00 90 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 00 07 00 58 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M foldTo(@NotNull final Grouping<T, ? extends K> $this$foldTo, @NotNull final M destination, @NotNull final Function2<? super K, ? super T, ? extends R> initialValueSelector, @NotNull final Function3<? super K, ? super R, ? super T, ? extends R> operation) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore          $i$f$foldTo
        //     4: aload_0         /* $this$foldTo */
        //     5: ldc             "$this$foldTo"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* destination */
        //    11: ldc             "destination"
        //    13: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    16: aload_2         /* initialValueSelector */
        //    17: ldc             "initialValueSelector"
        //    19: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    22: aload_3         /* operation */
        //    23: ldc             "operation"
        //    25: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    28: aload_0         /* $this$foldTo */
        //    29: astore          $this$aggregateTo$iv
        //    31: iconst_0       
        //    32: istore          $i$f$aggregateTo
        //    34: aload           $this$aggregateTo$iv
        //    36: invokeinterface kotlin/collections/Grouping.sourceIterator:()Ljava/util/Iterator;
        //    41: astore          7
        //    43: iconst_0       
        //    44: istore          8
        //    46: aload           7
        //    48: astore          9
        //    50: aload           9
        //    52: invokeinterface java/util/Iterator.hasNext:()Z
        //    57: ifeq            182
        //    60: aload           9
        //    62: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    67: astore          e$iv
        //    69: aload           $this$aggregateTo$iv
        //    71: aload           e$iv
        //    73: invokeinterface kotlin/collections/Grouping.keyOf:(Ljava/lang/Object;)Ljava/lang/Object;
        //    78: astore          key$iv
        //    80: aload_1         /* destination */
        //    81: aload           key$iv
        //    83: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    88: astore          accumulator$iv
        //    90: aload_1         /* destination */
        //    91: aload           key$iv
        //    93: aload           key$iv
        //    95: aload           accumulator$iv
        //    97: aload           e$iv
        //    99: aload           accumulator$iv
        //   101: ifnonnull       119
        //   104: aload_1         /* destination */
        //   105: aload           key$iv
        //   107: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   112: ifne            119
        //   115: iconst_1       
        //   116: goto            120
        //   119: iconst_0       
        //   120: istore          11
        //   122: astore          12
        //   124: astore          13
        //   126: astore          14
        //   128: astore          17
        //   130: astore          16
        //   132: iconst_0       
        //   133: istore          $i$a$-aggregateTo-GroupingKt__GroupingKt$foldTo$1
        //   135: aload_3         /* operation */
        //   136: aload           key
        //   138: iload           first
        //   140: ifeq            156
        //   143: aload_2         /* initialValueSelector */
        //   144: aload           key
        //   146: aload           e
        //   148: invokeinterface kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   153: goto            158
        //   156: aload           acc
        //   158: aload           e
        //   160: invokeinterface kotlin/jvm/functions/Function3.invoke:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   165: astore          18
        //   167: aload           16
        //   169: aload           17
        //   171: aload           18
        //   173: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   178: pop            
        //   179: goto            50
        //   182: aload_1         /* destination */
        //   183: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;K:Ljava/lang/Object;R:Ljava/lang/Object;M::Ljava/util/Map<-TK;TR;>;>(Lkotlin/collections/Grouping<TT;+TK;>;TM;Lkotlin/jvm/functions/Function2<-TK;-TT;+TR;>;Lkotlin/jvm/functions/Function3<-TK;-TR;-TT;+TR;>;)TM;
        //    StackMapTable: 00 06 FF 00 32 00 0A 07 00 4E 07 00 4C 07 00 8E 07 00 90 01 07 00 4E 01 07 00 56 00 07 00 58 00 00 FF 00 44 00 0B 07 00 4E 07 00 4C 07 00 8E 07 00 90 01 07 00 4E 01 07 00 56 07 00 56 07 00 58 07 00 56 00 05 07 00 4C 07 00 56 07 00 56 07 00 56 07 00 56 FF 00 00 00 0B 07 00 4E 07 00 4C 07 00 8E 07 00 90 01 07 00 4E 01 07 00 56 07 00 56 07 00 58 07 00 56 00 06 07 00 4C 07 00 56 07 00 56 07 00 56 07 00 56 01 FF 00 23 00 12 07 00 4E 07 00 4C 07 00 8E 07 00 90 01 07 00 4E 01 07 00 56 07 00 56 07 00 58 07 00 56 01 07 00 56 07 00 56 07 00 56 01 07 00 4C 07 00 56 00 02 07 00 90 07 00 56 FF 00 01 00 12 07 00 4E 07 00 4C 07 00 8E 07 00 90 01 07 00 4E 01 07 00 56 07 00 56 07 00 58 07 00 56 01 07 00 56 07 00 56 07 00 56 01 07 00 4C 07 00 56 00 03 07 00 90 07 00 56 07 00 56 FF 00 17 00 0A 07 00 4E 07 00 4C 07 00 8E 07 00 90 01 07 00 4E 01 07 00 56 00 07 00 58 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> fold(@NotNull final Grouping<T, ? extends K> $this$fold, final R initialValue, @NotNull final Function2<? super R, ? super T, ? extends R> operation) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_3        /* $i$f$fold */
        //     3: aload_0         /* $this$fold */
        //     4: ldc             "$this$fold"
        //     6: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     9: aload_2         /* operation */
        //    10: ldc             "operation"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_0         /* $this$fold */
        //    16: astore          $this$aggregate$iv
        //    18: iconst_0       
        //    19: istore          $i$f$aggregate
        //    21: aload           $this$aggregate$iv
        //    23: astore          6
        //    25: iconst_0       
        //    26: istore          7
        //    28: new             Ljava/util/LinkedHashMap;
        //    31: dup            
        //    32: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    35: checkcast       Ljava/util/Map;
        //    38: astore          destination$iv$iv
        //    40: iconst_0       
        //    41: istore          $i$f$aggregateTo
        //    43: aload           $this$aggregateTo$iv$iv
        //    45: invokeinterface kotlin/collections/Grouping.sourceIterator:()Ljava/util/Iterator;
        //    50: astore          9
        //    52: iconst_0       
        //    53: istore          10
        //    55: aload           9
        //    57: astore          11
        //    59: aload           11
        //    61: invokeinterface java/util/Iterator.hasNext:()Z
        //    66: ifeq            183
        //    69: aload           11
        //    71: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    76: astore          e$iv$iv
        //    78: aload           $this$aggregateTo$iv$iv
        //    80: aload           e$iv$iv
        //    82: invokeinterface kotlin/collections/Grouping.keyOf:(Ljava/lang/Object;)Ljava/lang/Object;
        //    87: astore          key$iv$iv
        //    89: aload           destination$iv$iv
        //    91: aload           key$iv$iv
        //    93: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    98: astore          accumulator$iv$iv
        //   100: aload           destination$iv$iv
        //   102: aload           key$iv$iv
        //   104: aload           key$iv$iv
        //   106: aload           accumulator$iv$iv
        //   108: aload           e$iv$iv
        //   110: aload           accumulator$iv$iv
        //   112: ifnonnull       131
        //   115: aload           destination$iv$iv
        //   117: aload           key$iv$iv
        //   119: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   124: ifne            131
        //   127: iconst_1       
        //   128: goto            132
        //   131: iconst_0       
        //   132: istore          13
        //   134: astore          14
        //   136: astore          15
        //   138: astore          16
        //   140: astore          19
        //   142: astore          18
        //   144: iconst_0       
        //   145: istore          $i$a$-aggregate-GroupingKt__GroupingKt$fold$2
        //   147: aload_2         /* operation */
        //   148: iload           first
        //   150: ifeq            157
        //   153: aload_1         /* initialValue */
        //   154: goto            159
        //   157: aload           acc
        //   159: aload           e
        //   161: invokeinterface kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   166: astore          20
        //   168: aload           18
        //   170: aload           19
        //   172: aload           20
        //   174: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   179: pop            
        //   180: goto            59
        //   183: aload           destination$iv$iv
        //   185: nop            
        //   186: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;K:Ljava/lang/Object;R:Ljava/lang/Object;>(Lkotlin/collections/Grouping<TT;+TK;>;TR;Lkotlin/jvm/functions/Function2<-TR;-TT;+TR;>;)Ljava/util/Map<TK;TR;>;
        //    StackMapTable: 00 06 FF 00 3B 00 0C 07 00 4E 07 00 56 07 00 8E 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 00 07 00 58 00 00 FF 00 47 00 0D 07 00 4E 07 00 56 07 00 8E 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 07 00 56 07 00 58 07 00 56 00 05 07 00 4C 07 00 56 07 00 56 07 00 56 07 00 56 FF 00 00 00 0D 07 00 4E 07 00 56 07 00 8E 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 07 00 56 07 00 58 07 00 56 00 06 07 00 4C 07 00 56 07 00 56 07 00 56 07 00 56 01 FF 00 18 00 14 07 00 4E 07 00 56 07 00 8E 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 07 00 56 07 00 58 07 00 56 01 07 00 56 07 00 56 07 00 56 01 07 00 4C 07 00 56 00 01 07 00 8E FF 00 01 00 14 07 00 4E 07 00 56 07 00 8E 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 07 00 56 07 00 58 07 00 56 01 07 00 56 07 00 56 07 00 56 01 07 00 4C 07 00 56 00 02 07 00 8E 07 00 56 FF 00 17 00 0C 07 00 4E 07 00 56 07 00 8E 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 00 07 00 58 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M foldTo(@NotNull final Grouping<T, ? extends K> $this$foldTo, @NotNull final M destination, final R initialValue, @NotNull final Function2<? super R, ? super T, ? extends R> operation) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore          $i$f$foldTo
        //     4: aload_0         /* $this$foldTo */
        //     5: ldc             "$this$foldTo"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* destination */
        //    11: ldc             "destination"
        //    13: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    16: aload_3         /* operation */
        //    17: ldc             "operation"
        //    19: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    22: aload_0         /* $this$foldTo */
        //    23: astore          $this$aggregateTo$iv
        //    25: iconst_0       
        //    26: istore          $i$f$aggregateTo
        //    28: aload           $this$aggregateTo$iv
        //    30: invokeinterface kotlin/collections/Grouping.sourceIterator:()Ljava/util/Iterator;
        //    35: astore          7
        //    37: iconst_0       
        //    38: istore          8
        //    40: aload           7
        //    42: astore          9
        //    44: aload           9
        //    46: invokeinterface java/util/Iterator.hasNext:()Z
        //    51: ifeq            165
        //    54: aload           9
        //    56: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    61: astore          e$iv
        //    63: aload           $this$aggregateTo$iv
        //    65: aload           e$iv
        //    67: invokeinterface kotlin/collections/Grouping.keyOf:(Ljava/lang/Object;)Ljava/lang/Object;
        //    72: astore          key$iv
        //    74: aload_1         /* destination */
        //    75: aload           key$iv
        //    77: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    82: astore          accumulator$iv
        //    84: aload_1         /* destination */
        //    85: aload           key$iv
        //    87: aload           key$iv
        //    89: aload           accumulator$iv
        //    91: aload           e$iv
        //    93: aload           accumulator$iv
        //    95: ifnonnull       113
        //    98: aload_1         /* destination */
        //    99: aload           key$iv
        //   101: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   106: ifne            113
        //   109: iconst_1       
        //   110: goto            114
        //   113: iconst_0       
        //   114: istore          11
        //   116: astore          12
        //   118: astore          13
        //   120: astore          14
        //   122: astore          17
        //   124: astore          16
        //   126: iconst_0       
        //   127: istore          $i$a$-aggregateTo-GroupingKt__GroupingKt$foldTo$2
        //   129: aload_3         /* operation */
        //   130: iload           first
        //   132: ifeq            139
        //   135: aload_2         /* initialValue */
        //   136: goto            141
        //   139: aload           acc
        //   141: aload           e
        //   143: invokeinterface kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   148: astore          18
        //   150: aload           16
        //   152: aload           17
        //   154: aload           18
        //   156: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   161: pop            
        //   162: goto            44
        //   165: aload_1         /* destination */
        //   166: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;K:Ljava/lang/Object;R:Ljava/lang/Object;M::Ljava/util/Map<-TK;TR;>;>(Lkotlin/collections/Grouping<TT;+TK;>;TM;TR;Lkotlin/jvm/functions/Function2<-TR;-TT;+TR;>;)TM;
        //    StackMapTable: 00 06 FF 00 2C 00 0A 07 00 4E 07 00 4C 07 00 56 07 00 8E 01 07 00 4E 01 07 00 56 00 07 00 58 00 00 FF 00 44 00 0B 07 00 4E 07 00 4C 07 00 56 07 00 8E 01 07 00 4E 01 07 00 56 07 00 56 07 00 58 07 00 56 00 05 07 00 4C 07 00 56 07 00 56 07 00 56 07 00 56 FF 00 00 00 0B 07 00 4E 07 00 4C 07 00 56 07 00 8E 01 07 00 4E 01 07 00 56 07 00 56 07 00 58 07 00 56 00 06 07 00 4C 07 00 56 07 00 56 07 00 56 07 00 56 01 FF 00 18 00 12 07 00 4E 07 00 4C 07 00 56 07 00 8E 01 07 00 4E 01 07 00 56 07 00 56 07 00 58 07 00 56 01 07 00 56 07 00 56 07 00 56 01 07 00 4C 07 00 56 00 01 07 00 8E FF 00 01 00 12 07 00 4E 07 00 4C 07 00 56 07 00 8E 01 07 00 4E 01 07 00 56 07 00 56 07 00 58 07 00 56 01 07 00 56 07 00 56 07 00 56 01 07 00 4C 07 00 56 00 02 07 00 8E 07 00 56 FF 00 17 00 0A 07 00 4E 07 00 4C 07 00 56 07 00 8E 01 07 00 4E 01 07 00 56 00 07 00 58 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <S, T extends S, K> Map<K, S> reduce(@NotNull final Grouping<T, ? extends K> $this$reduce, @NotNull final Function3<? super K, ? super S, ? super T, ? extends S> operation) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$reduce */
        //     3: aload_0         /* $this$reduce */
        //     4: ldc             "$this$reduce"
        //     6: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     9: aload_1         /* operation */
        //    10: ldc             "operation"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_0         /* $this$reduce */
        //    16: astore_3        /* $this$aggregate$iv */
        //    17: iconst_0       
        //    18: istore          $i$f$aggregate
        //    20: aload_3         /* $this$aggregate$iv */
        //    21: astore          5
        //    23: iconst_0       
        //    24: istore          6
        //    26: new             Ljava/util/LinkedHashMap;
        //    29: dup            
        //    30: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    33: checkcast       Ljava/util/Map;
        //    36: astore          destination$iv$iv
        //    38: iconst_0       
        //    39: istore          $i$f$aggregateTo
        //    41: aload           $this$aggregateTo$iv$iv
        //    43: invokeinterface kotlin/collections/Grouping.sourceIterator:()Ljava/util/Iterator;
        //    48: astore          8
        //    50: iconst_0       
        //    51: istore          9
        //    53: aload           8
        //    55: astore          10
        //    57: aload           10
        //    59: invokeinterface java/util/Iterator.hasNext:()Z
        //    64: ifeq            184
        //    67: aload           10
        //    69: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    74: astore          e$iv$iv
        //    76: aload           $this$aggregateTo$iv$iv
        //    78: aload           e$iv$iv
        //    80: invokeinterface kotlin/collections/Grouping.keyOf:(Ljava/lang/Object;)Ljava/lang/Object;
        //    85: astore          key$iv$iv
        //    87: aload           destination$iv$iv
        //    89: aload           key$iv$iv
        //    91: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    96: astore          accumulator$iv$iv
        //    98: aload           destination$iv$iv
        //   100: aload           key$iv$iv
        //   102: aload           key$iv$iv
        //   104: aload           accumulator$iv$iv
        //   106: aload           e$iv$iv
        //   108: aload           accumulator$iv$iv
        //   110: ifnonnull       129
        //   113: aload           destination$iv$iv
        //   115: aload           key$iv$iv
        //   117: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   122: ifne            129
        //   125: iconst_1       
        //   126: goto            130
        //   129: iconst_0       
        //   130: istore          12
        //   132: astore          13
        //   134: astore          14
        //   136: astore          15
        //   138: astore          18
        //   140: astore          17
        //   142: iconst_0       
        //   143: istore          $i$a$-aggregate-GroupingKt__GroupingKt$reduce$1
        //   145: iload           first
        //   147: ifeq            155
        //   150: aload           e
        //   152: goto            167
        //   155: aload_1         /* operation */
        //   156: aload           key
        //   158: aload           acc
        //   160: aload           e
        //   162: invokeinterface kotlin/jvm/functions/Function3.invoke:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   167: astore          19
        //   169: aload           17
        //   171: aload           18
        //   173: aload           19
        //   175: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   180: pop            
        //   181: goto            57
        //   184: aload           destination$iv$iv
        //   186: nop            
        //   187: areturn        
        //    Signature:
        //  <S:Ljava/lang/Object;T:TS;K:Ljava/lang/Object;>(Lkotlin/collections/Grouping<TT;+TK;>;Lkotlin/jvm/functions/Function3<-TK;-TS;-TT;+TS;>;)Ljava/util/Map<TK;TS;>; [from metadata: <S:Ljava/lang/Object;T::TS;K:Ljava/lang/Object;>(Lkotlin/collections/Grouping<TT;+TK;>;Lkotlin/jvm/functions/Function3<-TK;-TS;-TT;+TS;>;)Ljava/util/Map<TK;TS;>;]
        //  
        //    StackMapTable: 00 06 FF 00 39 00 0B 07 00 4E 07 00 90 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 00 07 00 58 00 00 FF 00 47 00 0C 07 00 4E 07 00 90 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 07 00 56 07 00 58 07 00 56 00 05 07 00 4C 07 00 56 07 00 56 07 00 56 07 00 56 FF 00 00 00 0C 07 00 4E 07 00 90 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 07 00 56 07 00 58 07 00 56 00 06 07 00 4C 07 00 56 07 00 56 07 00 56 07 00 56 01 FF 00 18 00 13 07 00 4E 07 00 90 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 07 00 56 07 00 58 07 00 56 01 07 00 56 07 00 56 07 00 56 01 07 00 4C 07 00 56 00 00 4B 07 00 56 FF 00 10 00 0B 07 00 4E 07 00 90 01 07 00 4E 01 07 00 4E 07 00 4C 01 07 00 56 00 07 00 58 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <S, T extends S, K, M extends Map<? super K, S>> M reduceTo(@NotNull final Grouping<T, ? extends K> $this$reduceTo, @NotNull final M destination, @NotNull final Function3<? super K, ? super S, ? super T, ? extends S> operation) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_3        /* $i$f$reduceTo */
        //     3: aload_0         /* $this$reduceTo */
        //     4: ldc             "$this$reduceTo"
        //     6: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     9: aload_1         /* destination */
        //    10: ldc             "destination"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_2         /* operation */
        //    16: ldc             "operation"
        //    18: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    21: aload_0         /* $this$reduceTo */
        //    22: astore          $this$aggregateTo$iv
        //    24: iconst_0       
        //    25: istore          $i$f$aggregateTo
        //    27: aload           $this$aggregateTo$iv
        //    29: invokeinterface kotlin/collections/Grouping.sourceIterator:()Ljava/util/Iterator;
        //    34: astore          6
        //    36: iconst_0       
        //    37: istore          7
        //    39: aload           6
        //    41: astore          8
        //    43: aload           8
        //    45: invokeinterface java/util/Iterator.hasNext:()Z
        //    50: ifeq            167
        //    53: aload           8
        //    55: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    60: astore          e$iv
        //    62: aload           $this$aggregateTo$iv
        //    64: aload           e$iv
        //    66: invokeinterface kotlin/collections/Grouping.keyOf:(Ljava/lang/Object;)Ljava/lang/Object;
        //    71: astore          key$iv
        //    73: aload_1         /* destination */
        //    74: aload           key$iv
        //    76: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    81: astore          accumulator$iv
        //    83: aload_1         /* destination */
        //    84: aload           key$iv
        //    86: aload           key$iv
        //    88: aload           accumulator$iv
        //    90: aload           e$iv
        //    92: aload           accumulator$iv
        //    94: ifnonnull       112
        //    97: aload_1         /* destination */
        //    98: aload           key$iv
        //   100: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   105: ifne            112
        //   108: iconst_1       
        //   109: goto            113
        //   112: iconst_0       
        //   113: istore          10
        //   115: astore          11
        //   117: astore          12
        //   119: astore          13
        //   121: astore          16
        //   123: astore          15
        //   125: iconst_0       
        //   126: istore          $i$a$-aggregateTo-GroupingKt__GroupingKt$reduceTo$1
        //   128: iload           first
        //   130: ifeq            138
        //   133: aload           e
        //   135: goto            150
        //   138: aload_2         /* operation */
        //   139: aload           key
        //   141: aload           acc
        //   143: aload           e
        //   145: invokeinterface kotlin/jvm/functions/Function3.invoke:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   150: astore          17
        //   152: aload           15
        //   154: aload           16
        //   156: aload           17
        //   158: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   163: pop            
        //   164: goto            43
        //   167: aload_1         /* destination */
        //   168: areturn        
        //    Signature:
        //  <S:Ljava/lang/Object;T:TS;K:Ljava/lang/Object;M::Ljava/util/Map<-TK;TS;>;>(Lkotlin/collections/Grouping<TT;+TK;>;TM;Lkotlin/jvm/functions/Function3<-TK;-TS;-TT;+TS;>;)TM; [from metadata: <S:Ljava/lang/Object;T::TS;K:Ljava/lang/Object;M::Ljava/util/Map<-TK;TS;>;>(Lkotlin/collections/Grouping<TT;+TK;>;TM;Lkotlin/jvm/functions/Function3<-TK;-TS;-TT;+TS;>;)TM;]
        //  
        //    StackMapTable: 00 06 FF 00 2B 00 09 07 00 4E 07 00 4C 07 00 90 01 07 00 4E 01 07 00 56 00 07 00 58 00 00 FF 00 44 00 0A 07 00 4E 07 00 4C 07 00 90 01 07 00 4E 01 07 00 56 07 00 56 07 00 58 07 00 56 00 05 07 00 4C 07 00 56 07 00 56 07 00 56 07 00 56 FF 00 00 00 0A 07 00 4E 07 00 4C 07 00 90 01 07 00 4E 01 07 00 56 07 00 56 07 00 58 07 00 56 00 06 07 00 4C 07 00 56 07 00 56 07 00 56 07 00 56 01 FF 00 18 00 11 07 00 4E 07 00 4C 07 00 90 01 07 00 4E 01 07 00 56 07 00 56 07 00 58 07 00 56 01 07 00 56 07 00 56 07 00 56 01 07 00 4C 07 00 56 00 00 4B 07 00 56 FF 00 10 00 09 07 00 4E 07 00 4C 07 00 90 01 07 00 4E 01 07 00 56 00 07 00 58 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, M extends Map<? super K, Integer>> M eachCountTo(@NotNull final Grouping<T, ? extends K> $this$eachCountTo, @NotNull final M destination) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$eachCountTo"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* destination */
        //     7: ldc             "destination"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* $this$eachCountTo */
        //    13: astore_2       
        //    14: iconst_0       
        //    15: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    18: astore_3        /* initialValue$iv */
        //    19: iconst_0       
        //    20: istore          $i$f$foldTo
        //    22: aload_2         /* $this$foldTo$iv */
        //    23: astore          $this$aggregateTo$iv$iv
        //    25: iconst_0       
        //    26: istore          $i$f$aggregateTo
        //    28: aload           $this$aggregateTo$iv$iv
        //    30: invokeinterface kotlin/collections/Grouping.sourceIterator:()Ljava/util/Iterator;
        //    35: astore          7
        //    37: iconst_0       
        //    38: istore          8
        //    40: aload           7
        //    42: astore          9
        //    44: aload           9
        //    46: invokeinterface java/util/Iterator.hasNext:()Z
        //    51: ifeq            179
        //    54: aload           9
        //    56: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    61: astore          e$iv$iv
        //    63: aload           $this$aggregateTo$iv$iv
        //    65: aload           e$iv$iv
        //    67: invokeinterface kotlin/collections/Grouping.keyOf:(Ljava/lang/Object;)Ljava/lang/Object;
        //    72: astore          key$iv$iv
        //    74: aload_1         /* destination */
        //    75: aload           key$iv$iv
        //    77: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    82: astore          accumulator$iv$iv
        //    84: aload_1         /* destination */
        //    85: aload           key$iv$iv
        //    87: aload           key$iv$iv
        //    89: aload           accumulator$iv$iv
        //    91: aload           e$iv$iv
        //    93: aload           accumulator$iv$iv
        //    95: ifnonnull       113
        //    98: aload_1         /* destination */
        //    99: aload           key$iv$iv
        //   101: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   106: ifne            113
        //   109: iconst_1       
        //   110: goto            114
        //   113: iconst_0       
        //   114: istore          11
        //   116: astore          12
        //   118: astore          13
        //   120: astore          14
        //   122: astore          15
        //   124: astore          16
        //   126: iconst_0       
        //   127: istore          $i$a$-aggregateTo-GroupingKt__GroupingKt$foldTo$2$iv
        //   129: iload           first$iv
        //   131: ifeq            138
        //   134: aload_3         /* initialValue$iv */
        //   135: goto            140
        //   138: aload           acc$iv
        //   140: aload           e$iv
        //   142: astore          18
        //   144: checkcast       Ljava/lang/Number;
        //   147: invokevirtual   java/lang/Number.intValue:()I
        //   150: istore          acc
        //   152: iconst_0       
        //   153: istore          $i$a$-foldTo-GroupingKt__GroupingKt$eachCountTo$1
        //   155: iload           acc
        //   157: iconst_1       
        //   158: iadd           
        //   159: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   162: astore          19
        //   164: aload           16
        //   166: aload           15
        //   168: aload           19
        //   170: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   175: pop            
        //   176: goto            44
        //   179: aload_1         /* destination */
        //   180: nop            
        //   181: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;K:Ljava/lang/Object;M::Ljava/util/Map<-TK;Ljava/lang/Integer;>;>(Lkotlin/collections/Grouping<TT;+TK;>;TM;)TM;
        //    StackMapTable: 00 06 FF 00 2C 00 0A 07 00 4E 07 00 4C 07 00 4E 07 00 B5 01 07 00 4E 01 07 00 56 00 07 00 58 00 00 FF 00 44 00 0B 07 00 4E 07 00 4C 07 00 4E 07 00 B5 01 07 00 4E 01 07 00 56 07 00 56 07 00 58 07 00 56 00 05 07 00 4C 07 00 56 07 00 56 07 00 56 07 00 56 FF 00 00 00 0B 07 00 4E 07 00 4C 07 00 4E 07 00 B5 01 07 00 4E 01 07 00 56 07 00 56 07 00 58 07 00 56 00 06 07 00 4C 07 00 56 07 00 56 07 00 56 07 00 56 01 FF 00 17 00 12 07 00 4E 07 00 4C 07 00 4E 07 00 B5 01 07 00 4E 01 07 00 56 07 00 56 07 00 58 07 00 56 01 07 00 56 07 00 56 07 00 56 07 00 56 07 00 4C 01 00 00 41 07 00 56 FF 00 26 00 0A 07 00 4E 07 00 4C 07 00 4E 07 00 B5 01 07 00 4E 01 07 00 56 00 07 00 58 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public GroupingKt__GroupingKt() {
    }
}
