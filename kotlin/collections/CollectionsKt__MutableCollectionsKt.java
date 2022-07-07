// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.SinceKotlin;
import kotlin.random.Random;
import java.util.HashSet;
import kotlin.jvm.functions.Function1;
import java.util.Iterator;
import kotlin.sequences.Sequence;
import kotlin.jvm.internal.Intrinsics;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.Deprecated;
import java.util.List;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.TypeCastException;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000^\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a-\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a9\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u000e\u001a9\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u000e\u001a(\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u0006\u0010\u0012\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0013\u001a.\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\n¢\u0006\u0002\u0010\u0014\u001a)\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0087\n\u001a)\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0087\n\u001a(\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u0006\u0010\u0012\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0013\u001a.\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\n¢\u0006\u0002\u0010\u0014\u001a)\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0087\n\u001a)\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0087\n\u001a-\u0010\u0016\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0017*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u0006\u0010\u0012\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0018\u001a&\u0010\u0016\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0087\b¢\u0006\u0002\u0010\u001b\u001a-\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a.\u0010\u001c\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0017*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001dH\u0087\b\u001a*\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f\u001a*\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f\u001a-\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a.\u0010\u001e\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0017*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001dH\u0087\b\u001a*\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f\u001a*\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f\u001a\u0015\u0010\u001f\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0002\b \u001a \u0010!\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0006\u0010\"\u001a\u00020#H\u0007\u001a&\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00020%\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0006\u0010\"\u001a\u00020#H\u0007¨\u0006&" }, d2 = { "addAll", "", "T", "", "elements", "", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "Lkotlin/sequences/Sequence;", "filterInPlace", "", "predicate", "Lkotlin/Function1;", "predicateResultToRemove", "filterInPlace$CollectionsKt__MutableCollectionsKt", "", "minusAssign", "", "element", "(Ljava/util/Collection;Ljava/lang/Object;)V", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "plusAssign", "remove", "Lkotlin/internal/OnlyInputTypes;", "(Ljava/util/Collection;Ljava/lang/Object;)Z", "index", "", "(Ljava/util/List;I)Ljava/lang/Object;", "removeAll", "", "retainAll", "retainNothing", "retainNothing$CollectionsKt__MutableCollectionsKt", "shuffle", "random", "Lkotlin/random/Random;", "shuffled", "", "kotlin-stdlib" }, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__MutableCollectionsKt extends CollectionsKt__MutableCollectionsJVMKt
{
    @InlineOnly
    private static final <T> boolean remove(@NotNull final Collection<? extends T> $this$remove, final T element) {
        final int $i$f$remove = 0;
        if ($this$remove == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }
        return TypeIntrinsics.asMutableCollection($this$remove).remove(element);
    }
    
    @InlineOnly
    private static final <T> boolean removeAll(@NotNull final Collection<? extends T> $this$removeAll, final Collection<? extends T> elements) {
        final int $i$f$removeAll = 0;
        if ($this$removeAll == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }
        return TypeIntrinsics.asMutableCollection($this$removeAll).removeAll(elements);
    }
    
    @InlineOnly
    private static final <T> boolean retainAll(@NotNull final Collection<? extends T> $this$retainAll, final Collection<? extends T> elements) {
        final int $i$f$retainAll = 0;
        if ($this$retainAll == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }
        return TypeIntrinsics.asMutableCollection($this$retainAll).retainAll(elements);
    }
    
    @Deprecated(message = "Use removeAt(index) instead.", replaceWith = @ReplaceWith(imports = {}, expression = "removeAt(index)"), level = DeprecationLevel.ERROR)
    @InlineOnly
    @java.lang.Deprecated
    private static final <T> T remove(@NotNull final List<T> $this$remove, final int index) {
        final int $i$f$remove = 0;
        return $this$remove.remove(index);
    }
    
    @InlineOnly
    private static final <T> void plusAssign(@NotNull final Collection<? super T> $this$plusAssign, final T element) {
        final int $i$f$plusAssign = 0;
        Intrinsics.checkParameterIsNotNull($this$plusAssign, "$this$plusAssign");
        $this$plusAssign.add(element);
    }
    
    @InlineOnly
    private static final <T> void plusAssign(@NotNull final Collection<? super T> $this$plusAssign, final Iterable<? extends T> elements) {
        final int $i$f$plusAssign = 0;
        Intrinsics.checkParameterIsNotNull($this$plusAssign, "$this$plusAssign");
        addAll((Collection<? super Object>)$this$plusAssign, (Iterable<?>)elements);
    }
    
    @InlineOnly
    private static final <T> void plusAssign(@NotNull final Collection<? super T> $this$plusAssign, final T[] elements) {
        final int $i$f$plusAssign = 0;
        Intrinsics.checkParameterIsNotNull($this$plusAssign, "$this$plusAssign");
        addAll($this$plusAssign, elements);
    }
    
    @InlineOnly
    private static final <T> void plusAssign(@NotNull final Collection<? super T> $this$plusAssign, final Sequence<? extends T> elements) {
        final int $i$f$plusAssign = 0;
        Intrinsics.checkParameterIsNotNull($this$plusAssign, "$this$plusAssign");
        addAll((Collection<? super Object>)$this$plusAssign, (Sequence<?>)elements);
    }
    
    @InlineOnly
    private static final <T> void minusAssign(@NotNull final Collection<? super T> $this$minusAssign, final T element) {
        final int $i$f$minusAssign = 0;
        Intrinsics.checkParameterIsNotNull($this$minusAssign, "$this$minusAssign");
        $this$minusAssign.remove(element);
    }
    
    @InlineOnly
    private static final <T> void minusAssign(@NotNull final Collection<? super T> $this$minusAssign, final Iterable<? extends T> elements) {
        final int $i$f$minusAssign = 0;
        Intrinsics.checkParameterIsNotNull($this$minusAssign, "$this$minusAssign");
        removeAll((Collection<? super Object>)$this$minusAssign, (Iterable<?>)elements);
    }
    
    @InlineOnly
    private static final <T> void minusAssign(@NotNull final Collection<? super T> $this$minusAssign, final T[] elements) {
        final int $i$f$minusAssign = 0;
        Intrinsics.checkParameterIsNotNull($this$minusAssign, "$this$minusAssign");
        removeAll($this$minusAssign, elements);
    }
    
    @InlineOnly
    private static final <T> void minusAssign(@NotNull final Collection<? super T> $this$minusAssign, final Sequence<? extends T> elements) {
        final int $i$f$minusAssign = 0;
        Intrinsics.checkParameterIsNotNull($this$minusAssign, "$this$minusAssign");
        removeAll((Collection<? super Object>)$this$minusAssign, (Sequence<?>)elements);
    }
    
    public static final <T> boolean addAll(@NotNull final Collection<? super T> $this$addAll, @NotNull final Iterable<? extends T> elements) {
        Intrinsics.checkParameterIsNotNull($this$addAll, "$this$addAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        if (elements instanceof Collection) {
            return $this$addAll.addAll((Collection<? extends T>)elements);
        }
        boolean result = false;
        for (final Object item : elements) {
            if ($this$addAll.add((Object)item)) {
                result = true;
            }
        }
        return result;
    }
    
    public static final <T> boolean addAll(@NotNull final Collection<? super T> $this$addAll, @NotNull final Sequence<? extends T> elements) {
        Intrinsics.checkParameterIsNotNull($this$addAll, "$this$addAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        boolean result = false;
        for (final Object item : elements) {
            if ($this$addAll.add((Object)item)) {
                result = true;
            }
        }
        return result;
    }
    
    public static final <T> boolean addAll(@NotNull final Collection<? super T> $this$addAll, @NotNull final T[] elements) {
        Intrinsics.checkParameterIsNotNull($this$addAll, "$this$addAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return $this$addAll.addAll((Collection<? extends T>)ArraysKt___ArraysJvmKt.asList(elements));
    }
    
    public static final <T> boolean removeAll(@NotNull final Iterable<? extends T> $this$removeAll, @NotNull final Function1<? super T, Boolean> predicate) {
        Intrinsics.checkParameterIsNotNull($this$removeAll, "$this$removeAll");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((Iterable<?>)$this$removeAll, (Function1<? super Object, Boolean>)predicate, true);
    }
    
    public static final <T> boolean retainAll(@NotNull final Iterable<? extends T> $this$retainAll, @NotNull final Function1<? super T, Boolean> predicate) {
        Intrinsics.checkParameterIsNotNull($this$retainAll, "$this$retainAll");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((Iterable<?>)$this$retainAll, (Function1<? super Object, Boolean>)predicate, false);
    }
    
    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(@NotNull final Iterable<? extends T> $this$filterInPlace, final Function1<? super T, Boolean> predicate, final boolean predicateResultToRemove) {
        boolean result = false;
        final Iterator $this$with = $this$filterInPlace.iterator();
        final int n = 0;
        while ($this$with.hasNext()) {
            if (predicate.invoke($this$with.next()) == predicateResultToRemove) {
                $this$with.remove();
                result = true;
            }
        }
        return result;
    }
    
    public static final <T> boolean removeAll(@NotNull final List<T> $this$removeAll, @NotNull final Function1<? super T, Boolean> predicate) {
        Intrinsics.checkParameterIsNotNull($this$removeAll, "$this$removeAll");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt($this$removeAll, predicate, true);
    }
    
    public static final <T> boolean retainAll(@NotNull final List<T> $this$retainAll, @NotNull final Function1<? super T, Boolean> predicate) {
        Intrinsics.checkParameterIsNotNull($this$retainAll, "$this$retainAll");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt($this$retainAll, predicate, false);
    }
    
    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(@NotNull final List<T> $this$filterInPlace, final Function1<? super T, Boolean> predicate, final boolean predicateResultToRemove) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Ljava/util/RandomAccess;
        //     4: ifne            31
        //     7: aload_0         /* $this$filterInPlace */
        //     8: dup            
        //     9: ifnonnull       22
        //    12: new             Lkotlin/TypeCastException;
        //    15: dup            
        //    16: ldc             "null cannot be cast to non-null type kotlin.collections.MutableIterable<T>"
        //    18: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //    21: athrow         
        //    22: invokestatic    kotlin/jvm/internal/TypeIntrinsics.asMutableIterable:(Ljava/lang/Object;)Ljava/lang/Iterable;
        //    25: aload_1         /* predicate */
        //    26: iload_2         /* predicateResultToRemove */
        //    27: invokestatic    kotlin/collections/CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt:(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;Z)Z
        //    30: ireturn        
        //    31: iconst_0       
        //    32: istore_3        /* writeIndex */
        //    33: iconst_0       
        //    34: istore          4
        //    36: aload_0         /* $this$filterInPlace */
        //    37: invokestatic    kotlin/collections/CollectionsKt.getLastIndex:(Ljava/util/List;)I
        //    40: istore          5
        //    42: iload           4
        //    44: iload           5
        //    46: if_icmpgt       112
        //    49: aload_0         /* $this$filterInPlace */
        //    50: iload           readIndex
        //    52: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    57: astore          element
        //    59: aload_1         /* predicate */
        //    60: aload           element
        //    62: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    67: checkcast       Ljava/lang/Boolean;
        //    70: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    73: iload_2         /* predicateResultToRemove */
        //    74: if_icmpne       80
        //    77: goto            99
        //    80: iload_3         /* writeIndex */
        //    81: iload           readIndex
        //    83: if_icmpeq       96
        //    86: aload_0         /* $this$filterInPlace */
        //    87: iload_3         /* writeIndex */
        //    88: aload           element
        //    90: invokeinterface java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
        //    95: pop            
        //    96: iinc            writeIndex, 1
        //    99: iload           readIndex
        //   101: iload           5
        //   103: if_icmpeq       112
        //   106: iinc            readIndex, 1
        //   109: goto            49
        //   112: iload_3         /* writeIndex */
        //   113: aload_0         /* $this$filterInPlace */
        //   114: invokeinterface java/util/List.size:()I
        //   119: if_icmpge       162
        //   122: aload_0         /* $this$filterInPlace */
        //   123: invokestatic    kotlin/collections/CollectionsKt.getLastIndex:(Ljava/util/List;)I
        //   126: istore          4
        //   128: iload_3         /* writeIndex */
        //   129: istore          5
        //   131: iload           4
        //   133: iload           5
        //   135: if_icmplt       160
        //   138: aload_0         /* $this$filterInPlace */
        //   139: iload           removeIndex
        //   141: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
        //   146: pop            
        //   147: iload           removeIndex
        //   149: iload           5
        //   151: if_icmpeq       160
        //   154: iinc            removeIndex, -1
        //   157: goto            138
        //   160: iconst_1       
        //   161: ireturn        
        //   162: iconst_0       
        //   163: ireturn        
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/util/List<TT;>;Lkotlin/jvm/functions/Function1<-TT;Ljava/lang/Boolean;>;Z)Z
        //    StackMapTable: 00 0A 56 07 00 65 08 FE 00 11 01 01 01 FC 00 1E 07 00 40 0F 02 FA 00 0C 19 15 01
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final <T> boolean removeAll(@NotNull final Collection<? super T> $this$removeAll, @NotNull final Iterable<? extends T> elements) {
        Intrinsics.checkParameterIsNotNull($this$removeAll, "$this$removeAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return TypeIntrinsics.asMutableCollection($this$removeAll).removeAll(CollectionsKt__IterablesKt.convertToSetForSetOperationWith((Iterable<?>)elements, (Iterable<?>)$this$removeAll));
    }
    
    public static final <T> boolean removeAll(@NotNull final Collection<? super T> $this$removeAll, @NotNull final Sequence<? extends T> elements) {
        Intrinsics.checkParameterIsNotNull($this$removeAll, "$this$removeAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        final HashSet set = SequencesKt___SequencesKt.toHashSet((Sequence<?>)elements);
        return !set.isEmpty() && $this$removeAll.removeAll(set);
    }
    
    public static final <T> boolean removeAll(@NotNull final Collection<? super T> $this$removeAll, @NotNull final T[] elements) {
        Intrinsics.checkParameterIsNotNull($this$removeAll, "$this$removeAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return elements.length != 0 && $this$removeAll.removeAll(ArraysKt___ArraysKt.toHashSet(elements));
    }
    
    public static final <T> boolean retainAll(@NotNull final Collection<? super T> $this$retainAll, @NotNull final Iterable<? extends T> elements) {
        Intrinsics.checkParameterIsNotNull($this$retainAll, "$this$retainAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return TypeIntrinsics.asMutableCollection($this$retainAll).retainAll(CollectionsKt__IterablesKt.convertToSetForSetOperationWith((Iterable<?>)elements, (Iterable<?>)$this$retainAll));
    }
    
    public static final <T> boolean retainAll(@NotNull final Collection<? super T> $this$retainAll, @NotNull final T[] elements) {
        Intrinsics.checkParameterIsNotNull($this$retainAll, "$this$retainAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        if (elements.length != 0) {
            return $this$retainAll.retainAll(ArraysKt___ArraysKt.toHashSet(elements));
        }
        return retainNothing$CollectionsKt__MutableCollectionsKt($this$retainAll);
    }
    
    public static final <T> boolean retainAll(@NotNull final Collection<? super T> $this$retainAll, @NotNull final Sequence<? extends T> elements) {
        Intrinsics.checkParameterIsNotNull($this$retainAll, "$this$retainAll");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        final HashSet set = SequencesKt___SequencesKt.toHashSet((Sequence<?>)elements);
        if (!set.isEmpty()) {
            return $this$retainAll.retainAll(set);
        }
        return retainNothing$CollectionsKt__MutableCollectionsKt($this$retainAll);
    }
    
    private static final boolean retainNothing$CollectionsKt__MutableCollectionsKt(@NotNull final Collection<?> $this$retainNothing) {
        final boolean result = !$this$retainNothing.isEmpty();
        $this$retainNothing.clear();
        return result;
    }
    
    @SinceKotlin(version = "1.3")
    public static final <T> void shuffle(@NotNull final List<T> $this$shuffle, @NotNull final Random random) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "$this$shuffle"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_1         /* random */
        //     8: ldc_w           "random"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload_0         /* $this$shuffle */
        //    15: invokestatic    kotlin/collections/CollectionsKt.getLastIndex:(Ljava/util/List;)I
        //    18: istore_2       
        //    19: iconst_1       
        //    20: istore_3       
        //    21: iload_2        
        //    22: iload_3        
        //    23: if_icmplt       77
        //    26: aload_1         /* random */
        //    27: iload_2         /* i */
        //    28: iconst_1       
        //    29: iadd           
        //    30: invokevirtual   kotlin/random/Random.nextInt:(I)I
        //    33: istore          j
        //    35: aload_0         /* $this$shuffle */
        //    36: iload_2         /* i */
        //    37: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    42: astore          copy
        //    44: aload_0         /* $this$shuffle */
        //    45: iload_2         /* i */
        //    46: aload_0         /* $this$shuffle */
        //    47: iload           j
        //    49: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    54: invokeinterface java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
        //    59: pop            
        //    60: aload_0         /* $this$shuffle */
        //    61: iload           j
        //    63: aload           copy
        //    65: invokeinterface java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
        //    70: pop            
        //    71: iinc            i, -1
        //    74: goto            21
        //    77: return         
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/util/List<TT;>;Lkotlin/random/Random;)V
        //    StackMapTable: 00 02 FD 00 15 01 01 37
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> List<T> shuffled(@NotNull final Iterable<? extends T> $this$shuffled, @NotNull final Random random) {
        Intrinsics.checkParameterIsNotNull($this$shuffled, "$this$shuffled");
        Intrinsics.checkParameterIsNotNull(random, "random");
        final List $this$apply;
        final List list = $this$apply = CollectionsKt___CollectionsKt.toMutableList((Iterable<?>)$this$shuffled);
        final int n = 0;
        shuffle((List<Object>)$this$apply, random);
        return (List<T>)list;
    }
    
    public CollectionsKt__MutableCollectionsKt() {
    }
}
