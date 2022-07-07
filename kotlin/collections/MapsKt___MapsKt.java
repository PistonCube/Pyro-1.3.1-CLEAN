// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.sequences.Sequence;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.Nullable;
import java.util.Comparator;
import java.util.Set;
import kotlin.internal.HidesMembers;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.Pair;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000h\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001aG\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\b\u001a$\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\u001aG\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\b\u001a9\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\n\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004H\u0087\b\u001a6\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\u001a'\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004H\u0087\b\u001aG\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\b\u001aY\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0011*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042$\u0010\u0012\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\n0\u0006H\u0086\b\u001ar\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0011\"\u0010\b\u0003\u0010\u0014*\n\u0012\u0006\b\u0000\u0012\u0002H\u00110\u0015*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0016\u001a\u0002H\u00142$\u0010\u0012\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\n0\u0006H\u0086\b¢\u0006\u0002\u0010\u0017\u001aG\u0010\u0018\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u00190\u0006H\u0087\b\u001aS\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0011*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00110\u0006H\u0086\b\u001aY\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0011*\u00020\u001d*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042 \u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\u0006H\u0086\b\u001ar\u0010\u001e\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0011*\u00020\u001d\"\u0010\b\u0003\u0010\u0014*\n\u0012\u0006\b\u0000\u0012\u0002H\u00110\u0015*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0016\u001a\u0002H\u00142 \u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\u0006H\u0086\b¢\u0006\u0002\u0010\u0017\u001al\u0010\u001f\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0011\"\u0010\b\u0003\u0010\u0014*\n\u0012\u0006\b\u0000\u0012\u0002H\u00110\u0015*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0016\u001a\u0002H\u00142\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00110\u0006H\u0086\b¢\u0006\u0002\u0010\u0017\u001ae\u0010 \u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110!*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\"\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00110\u0006H\u0087\b\u001ai\u0010#\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000422\u0010$\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070%j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007`&H\u0087\b\u001ae\u0010'\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110!*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\"\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00110\u0006H\u0086\b\u001af\u0010(\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000422\u0010$\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070%j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007`&\u001a$\u0010)\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\u001aG\u0010)\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\b\u001aV\u0010*\u001a\u0002H+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0016\b\u0002\u0010+*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004*\u0002H+2\u001e\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u00190\u0006H\u0087\b¢\u0006\u0002\u0010,\u001a6\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030.0\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004¨\u0006/" }, d2 = { "all", "", "K", "V", "", "predicate", "Lkotlin/Function1;", "", "any", "asIterable", "", "asSequence", "Lkotlin/sequences/Sequence;", "count", "", "flatMap", "", "R", "transform", "flatMapTo", "C", "", "destination", "(Ljava/util/Map;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "forEach", "", "action", "map", "mapNotNull", "", "mapNotNullTo", "mapTo", "maxBy", "", "selector", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "minBy", "minWith", "none", "onEach", "M", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "toList", "Lkotlin/Pair;", "kotlin-stdlib" }, xs = "kotlin/collections/MapsKt")
class MapsKt___MapsKt extends MapsKt__MapsKt
{
    @NotNull
    public static final <K, V> List<Pair<K, V>> toList(@NotNull final Map<? extends K, ? extends V> $this$toList) {
        Intrinsics.checkParameterIsNotNull($this$toList, "$this$toList");
        if ($this$toList.size() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        final Iterator iterator = $this$toList.entrySet().iterator();
        if (!iterator.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        final Map.Entry first = (Map.Entry)iterator.next();
        if (!iterator.hasNext()) {
            final Map.Entry entry = first;
            return CollectionsKt__CollectionsJVMKt.listOf(new Pair<K, V>(entry.getKey(), entry.getValue()));
        }
        final ArrayList<Pair<Object, V>> list;
        final ArrayList result = list = new ArrayList<Pair<Object, V>>($this$toList.size());
        final Map.Entry entry2 = first;
        list.add((Pair<Object, V>)new Pair<Object, Object>(entry2.getKey(), entry2.getValue()));
        do {
            final ArrayList list2 = result;
            final Map.Entry<Object, V> entry3 = iterator.next();
            list2.add(new Pair<Object, Object>(entry3.getKey(), entry3.getValue()));
        } while (iterator.hasNext());
        return (List<Pair<K, V>>)result;
    }
    
    @NotNull
    public static final <K, V, R> List<R> flatMap(@NotNull final Map<? extends K, ? extends V> $this$flatMap, @NotNull final Function1<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$flatMap */
        //     3: aload_0         /* $this$flatMap */
        //     4: ldc             "$this$flatMap"
        //     6: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     9: aload_1         /* transform */
        //    10: ldc             "transform"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_0         /* $this$flatMap */
        //    16: astore_3       
        //    17: new             Ljava/util/ArrayList;
        //    20: dup            
        //    21: invokespecial   java/util/ArrayList.<init>:()V
        //    24: checkcast       Ljava/util/Collection;
        //    27: astore          destination$iv
        //    29: iconst_0       
        //    30: istore          $i$f$flatMapTo
        //    32: aload_3         /* $this$flatMapTo$iv */
        //    33: astore          6
        //    35: iconst_0       
        //    36: istore          7
        //    38: aload           6
        //    40: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    45: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    50: astore          8
        //    52: aload           8
        //    54: invokeinterface java/util/Iterator.hasNext:()Z
        //    59: ifeq            98
        //    62: aload           8
        //    64: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    69: checkcast       Ljava/util/Map$Entry;
        //    72: astore          element$iv
        //    74: aload_1         /* transform */
        //    75: aload           element$iv
        //    77: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    82: checkcast       Ljava/lang/Iterable;
        //    85: astore          list$iv
        //    87: aload           destination$iv
        //    89: aload           list$iv
        //    91: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
        //    94: pop            
        //    95: goto            52
        //    98: aload           destination$iv
        //   100: checkcast       Ljava/util/List;
        //   103: areturn        
        //    Signature:
        //  <K:Ljava/lang/Object;V:Ljava/lang/Object;R:Ljava/lang/Object;>(Ljava/util/Map<+TK;+TV;>;Lkotlin/jvm/functions/Function1<-Ljava/util/Map$Entry<+TK;+TV;>;+Ljava/lang/Iterable<+TR;>;>;)Ljava/util/List<TR;>;
        //    StackMapTable: 00 02 FF 00 34 00 09 07 00 47 07 00 93 01 07 00 47 07 00 91 01 07 00 95 01 07 00 5D 00 00 2D
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C flatMapTo(@NotNull final Map<? extends K, ? extends V> $this$flatMapTo, @NotNull final C destination, @NotNull final Function1<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
        final int $i$f$flatMapTo = 0;
        Intrinsics.checkParameterIsNotNull($this$flatMapTo, "$this$flatMapTo");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        for (final Map.Entry element : $this$flatMapTo.entrySet()) {
            final Iterable list = (Iterable)transform.invoke((Object)element);
            CollectionsKt__MutableCollectionsKt.addAll((Collection<? super Object>)destination, (Iterable<?>)list);
        }
        return destination;
    }
    
    @NotNull
    public static final <K, V, R> List<R> map(@NotNull final Map<? extends K, ? extends V> $this$map, @NotNull final Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$map */
        //     3: aload_0         /* $this$map */
        //     4: ldc             "$this$map"
        //     6: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     9: aload_1         /* transform */
        //    10: ldc             "transform"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_0         /* $this$map */
        //    16: astore_3       
        //    17: new             Ljava/util/ArrayList;
        //    20: dup            
        //    21: aload_0         /* $this$map */
        //    22: invokeinterface java/util/Map.size:()I
        //    27: invokespecial   java/util/ArrayList.<init>:(I)V
        //    30: checkcast       Ljava/util/Collection;
        //    33: astore          destination$iv
        //    35: iconst_0       
        //    36: istore          $i$f$mapTo
        //    38: aload_3         /* $this$mapTo$iv */
        //    39: astore          6
        //    41: iconst_0       
        //    42: istore          7
        //    44: aload           6
        //    46: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    51: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    56: astore          8
        //    58: aload           8
        //    60: invokeinterface java/util/Iterator.hasNext:()Z
        //    65: ifeq            99
        //    68: aload           8
        //    70: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    75: checkcast       Ljava/util/Map$Entry;
        //    78: astore          item$iv
        //    80: aload           destination$iv
        //    82: aload_1         /* transform */
        //    83: aload           item$iv
        //    85: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    90: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    95: pop            
        //    96: goto            58
        //    99: aload           destination$iv
        //   101: checkcast       Ljava/util/List;
        //   104: areturn        
        //    Signature:
        //  <K:Ljava/lang/Object;V:Ljava/lang/Object;R:Ljava/lang/Object;>(Ljava/util/Map<+TK;+TV;>;Lkotlin/jvm/functions/Function1<-Ljava/util/Map$Entry<+TK;+TV;>;+TR;>;)Ljava/util/List<TR;>;
        //    StackMapTable: 00 02 FF 00 3A 00 09 07 00 47 07 00 93 01 07 00 47 07 00 91 01 07 00 47 01 07 00 5D 00 00 28
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <K, V, R> List<R> mapNotNull(@NotNull final Map<? extends K, ? extends V> $this$mapNotNull, @NotNull final Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$mapNotNull */
        //     3: aload_0         /* $this$mapNotNull */
        //     4: ldc             "$this$mapNotNull"
        //     6: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     9: aload_1         /* transform */
        //    10: ldc             "transform"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_0         /* $this$mapNotNull */
        //    16: astore_3       
        //    17: new             Ljava/util/ArrayList;
        //    20: dup            
        //    21: invokespecial   java/util/ArrayList.<init>:()V
        //    24: checkcast       Ljava/util/Collection;
        //    27: astore          destination$iv
        //    29: iconst_0       
        //    30: istore          $i$f$mapNotNullTo
        //    32: aload_3         /* $this$mapNotNullTo$iv */
        //    33: astore          $this$forEach$iv$iv
        //    35: iconst_0       
        //    36: istore          $i$f$forEach
        //    38: aload           $this$forEach$iv$iv
        //    40: astore          8
        //    42: iconst_0       
        //    43: istore          9
        //    45: aload           8
        //    47: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    52: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    57: astore          10
        //    59: aload           10
        //    61: invokeinterface java/util/Iterator.hasNext:()Z
        //    66: ifeq            133
        //    69: aload           10
        //    71: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    76: checkcast       Ljava/util/Map$Entry;
        //    79: astore          element$iv$iv
        //    81: aload           element$iv$iv
        //    83: astore          element$iv
        //    85: iconst_0       
        //    86: istore          $i$a$-forEach-MapsKt___MapsKt$mapNotNullTo$1$iv
        //    88: aload_1         /* transform */
        //    89: aload           element$iv
        //    91: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    96: dup            
        //    97: ifnull          128
        //   100: astore          14
        //   102: iconst_0       
        //   103: istore          15
        //   105: iconst_0       
        //   106: istore          16
        //   108: aload           14
        //   110: astore          it$iv
        //   112: iconst_0       
        //   113: istore          $i$a$-let-MapsKt___MapsKt$mapNotNullTo$1$1$iv
        //   115: aload           destination$iv
        //   117: aload           it$iv
        //   119: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   124: pop            
        //   125: goto            129
        //   128: pop            
        //   129: nop            
        //   130: goto            59
        //   133: nop            
        //   134: aload           destination$iv
        //   136: checkcast       Ljava/util/List;
        //   139: areturn        
        //    Signature:
        //  <K:Ljava/lang/Object;V:Ljava/lang/Object;R:Ljava/lang/Object;>(Ljava/util/Map<+TK;+TV;>;Lkotlin/jvm/functions/Function1<-Ljava/util/Map$Entry<+TK;+TV;>;+TR;>;)Ljava/util/List<TR;>;
        //    StackMapTable: 00 04 FF 00 3B 00 0B 07 00 47 07 00 93 01 07 00 47 07 00 91 01 07 00 47 01 07 00 47 01 07 00 5D 00 00 FF 00 44 00 0E 07 00 47 07 00 93 01 07 00 47 07 00 91 01 07 00 47 01 07 00 47 01 07 00 5D 07 00 67 07 00 67 01 00 01 07 00 95 00 F8 00 03
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C mapNotNullTo(@NotNull final Map<? extends K, ? extends V> $this$mapNotNullTo, @NotNull final C destination, @NotNull final Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        final int $i$f$mapNotNullTo = 0;
        Intrinsics.checkParameterIsNotNull($this$mapNotNullTo, "$this$mapNotNullTo");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        final Map $this$forEach$iv = $this$mapNotNullTo;
        final int $i$f$forEach = 0;
        for (final Map.Entry element : $this$forEach$iv.entrySet()) {
            final Map.Entry element$iv = element;
            final int n = 0;
            final R invoke = (R)transform.invoke((Object)element);
            if (invoke != null) {
                final Object it = invoke;
                final int n2 = 0;
                destination.add((Object)it);
            }
        }
        return destination;
    }
    
    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C mapTo(@NotNull final Map<? extends K, ? extends V> $this$mapTo, @NotNull final C destination, @NotNull final Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        final int $i$f$mapTo = 0;
        Intrinsics.checkParameterIsNotNull($this$mapTo, "$this$mapTo");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        for (final Map.Entry item : $this$mapTo.entrySet()) {
            destination.add((Object)transform.invoke((Object)item));
        }
        return destination;
    }
    
    public static final <K, V> boolean all(@NotNull final Map<? extends K, ? extends V> $this$all, @NotNull final Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        final int $i$f$all = 0;
        Intrinsics.checkParameterIsNotNull($this$all, "$this$all");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        if ($this$all.isEmpty()) {
            return true;
        }
        for (final Map.Entry element : $this$all.entrySet()) {
            if (!predicate.invoke((Object)element)) {
                return false;
            }
        }
        return true;
    }
    
    public static final <K, V> boolean any(@NotNull final Map<? extends K, ? extends V> $this$any) {
        Intrinsics.checkParameterIsNotNull($this$any, "$this$any");
        return !$this$any.isEmpty();
    }
    
    public static final <K, V> boolean any(@NotNull final Map<? extends K, ? extends V> $this$any, @NotNull final Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        final int $i$f$any = 0;
        Intrinsics.checkParameterIsNotNull($this$any, "$this$any");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        if ($this$any.isEmpty()) {
            return false;
        }
        for (final Map.Entry element : $this$any.entrySet()) {
            if (predicate.invoke((Object)element)) {
                return true;
            }
        }
        return false;
    }
    
    @InlineOnly
    private static final <K, V> int count(@NotNull final Map<? extends K, ? extends V> $this$count) {
        final int $i$f$count = 0;
        return $this$count.size();
    }
    
    public static final <K, V> int count(@NotNull final Map<? extends K, ? extends V> $this$count, @NotNull final Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        final int $i$f$count = 0;
        Intrinsics.checkParameterIsNotNull($this$count, "$this$count");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        if ($this$count.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (final Map.Entry element : $this$count.entrySet()) {
            if (predicate.invoke((Object)element)) {
                ++count;
            }
        }
        return count;
    }
    
    @HidesMembers
    public static final <K, V> void forEach(@NotNull final Map<? extends K, ? extends V> $this$forEach, @NotNull final Function1<? super Map.Entry<? extends K, ? extends V>, Unit> action) {
        final int $i$f$forEach = 0;
        Intrinsics.checkParameterIsNotNull($this$forEach, "$this$forEach");
        Intrinsics.checkParameterIsNotNull(action, "action");
        for (final Map.Entry element : $this$forEach.entrySet()) {
            action.invoke((Object)element);
        }
    }
    
    @InlineOnly
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> maxBy(@NotNull final Map<? extends K, ? extends V> $this$maxBy, final Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        final int $i$f$maxBy = 0;
        final Iterable $this$maxBy$iv = $this$maxBy.entrySet();
        final int $i$f$maxBy2 = 0;
        final Iterator iterator$iv = $this$maxBy$iv.iterator();
        Object o;
        if (!iterator$iv.hasNext()) {
            o = null;
        }
        else {
            Object maxElem$iv = iterator$iv.next();
            if (!iterator$iv.hasNext()) {
                o = maxElem$iv;
            }
            else {
                Comparable maxValue$iv = (Comparable)selector.invoke((Object)maxElem$iv);
                do {
                    final Object e$iv = iterator$iv.next();
                    final Comparable v$iv = (Comparable)selector.invoke((Object)e$iv);
                    if (maxValue$iv.compareTo(v$iv) < 0) {
                        maxElem$iv = e$iv;
                        maxValue$iv = v$iv;
                    }
                } while (iterator$iv.hasNext());
                o = maxElem$iv;
            }
        }
        return (Map.Entry<K, V>)o;
    }
    
    @InlineOnly
    private static final <K, V> Map.Entry<K, V> maxWith(@NotNull final Map<? extends K, ? extends V> $this$maxWith, final Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        final int $i$f$maxWith = 0;
        return (Map.Entry<K, V>)CollectionsKt___CollectionsKt.maxWith((Iterable<? extends Map.Entry>)$this$maxWith.entrySet(), (Comparator<? super Map.Entry>)comparator);
    }
    
    @Nullable
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> minBy(@NotNull final Map<? extends K, ? extends V> $this$minBy, @NotNull final Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        final int $i$f$minBy = 0;
        Intrinsics.checkParameterIsNotNull($this$minBy, "$this$minBy");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        final Iterable $this$minBy$iv = $this$minBy.entrySet();
        final int $i$f$minBy2 = 0;
        final Iterator iterator$iv = $this$minBy$iv.iterator();
        Object o;
        if (!iterator$iv.hasNext()) {
            o = null;
        }
        else {
            Object minElem$iv = iterator$iv.next();
            if (!iterator$iv.hasNext()) {
                o = minElem$iv;
            }
            else {
                Comparable minValue$iv = (Comparable)selector.invoke((Object)minElem$iv);
                do {
                    final Object e$iv = iterator$iv.next();
                    final Comparable v$iv = (Comparable)selector.invoke((Object)e$iv);
                    if (minValue$iv.compareTo(v$iv) > 0) {
                        minElem$iv = e$iv;
                        minValue$iv = v$iv;
                    }
                } while (iterator$iv.hasNext());
                o = minElem$iv;
            }
        }
        return (Map.Entry<K, V>)o;
    }
    
    @Nullable
    public static final <K, V> Map.Entry<K, V> minWith(@NotNull final Map<? extends K, ? extends V> $this$minWith, @NotNull final Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        Intrinsics.checkParameterIsNotNull($this$minWith, "$this$minWith");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return (Map.Entry<K, V>)CollectionsKt___CollectionsKt.minWith((Iterable<? extends Map.Entry>)$this$minWith.entrySet(), (Comparator<? super Map.Entry>)comparator);
    }
    
    public static final <K, V> boolean none(@NotNull final Map<? extends K, ? extends V> $this$none) {
        Intrinsics.checkParameterIsNotNull($this$none, "$this$none");
        return $this$none.isEmpty();
    }
    
    public static final <K, V> boolean none(@NotNull final Map<? extends K, ? extends V> $this$none, @NotNull final Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        final int $i$f$none = 0;
        Intrinsics.checkParameterIsNotNull($this$none, "$this$none");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        if ($this$none.isEmpty()) {
            return true;
        }
        for (final Map.Entry element : $this$none.entrySet()) {
            if (predicate.invoke((Object)element)) {
                return false;
            }
        }
        return true;
    }
    
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K, V, M extends Map<? extends K, ? extends V>> M onEach(@NotNull final M $this$onEach, @NotNull final Function1<? super Map.Entry<? extends K, ? extends V>, Unit> action) {
        final int $i$f$onEach = 0;
        Intrinsics.checkParameterIsNotNull($this$onEach, "$this$onEach");
        Intrinsics.checkParameterIsNotNull(action, "action");
        final Map $this$apply = $this$onEach;
        final int n = 0;
        for (final Map.Entry element : $this$apply.entrySet()) {
            action.invoke((Object)element);
        }
        return $this$onEach;
    }
    
    @InlineOnly
    private static final <K, V> Iterable<Map.Entry<K, V>> asIterable(@NotNull final Map<? extends K, ? extends V> $this$asIterable) {
        final int $i$f$asIterable = 0;
        return (Iterable<Map.Entry<K, V>>)$this$asIterable.entrySet();
    }
    
    @NotNull
    public static final <K, V> Sequence<Map.Entry<K, V>> asSequence(@NotNull final Map<? extends K, ? extends V> $this$asSequence) {
        Intrinsics.checkParameterIsNotNull($this$asSequence, "$this$asSequence");
        return CollectionsKt___CollectionsKt.asSequence((Iterable<? extends Map.Entry<K, V>>)$this$asSequence.entrySet());
    }
    
    public MapsKt___MapsKt() {
    }
}
