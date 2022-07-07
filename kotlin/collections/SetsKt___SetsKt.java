// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.internal.InlineOnly;
import kotlin.sequences.Sequence;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004\u001a,\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004¨\u0006\r" }, d2 = { "minus", "", "T", "element", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "elements", "", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "Lkotlin/sequences/Sequence;", "minusElement", "plus", "plusElement", "kotlin-stdlib" }, xs = "kotlin/collections/SetsKt")
class SetsKt___SetsKt extends SetsKt__SetsKt
{
    @NotNull
    public static final <T> Set<T> minus(@NotNull final Set<? extends T> $this$minus, final T element) {
        Intrinsics.checkParameterIsNotNull($this$minus, "$this$minus");
        final LinkedHashSet result = new LinkedHashSet(MapsKt__MapsKt.mapCapacity($this$minus.size()));
        boolean removed = false;
        final Iterable $this$filterTo$iv = $this$minus;
        final int $i$f$filterTo = 0;
        for (final Object it : $this$filterTo$iv) {
            final Object element$iv = it;
            final int n = 0;
            boolean b;
            if (!removed && Intrinsics.areEqual(it, element)) {
                removed = true;
                b = false;
            }
            else {
                b = true;
            }
            if (b) {
                result.add(element$iv);
            }
        }
        return (Set<T>)result;
    }
    
    @NotNull
    public static final <T> Set<T> minus(@NotNull final Set<? extends T> $this$minus, @NotNull final T[] elements) {
        Intrinsics.checkParameterIsNotNull($this$minus, "$this$minus");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        final LinkedHashSet result = new LinkedHashSet((Collection<? extends E>)$this$minus);
        CollectionsKt__MutableCollectionsKt.removeAll(result, elements);
        return (Set<T>)result;
    }
    
    @NotNull
    public static final <T> Set<T> minus(@NotNull final Set<? extends T> $this$minus, @NotNull final Iterable<? extends T> elements) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$minus"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* elements */
        //     7: ldc             "elements"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_1         /* elements */
        //    13: aload_0         /* $this$minus */
        //    14: checkcast       Ljava/lang/Iterable;
        //    17: invokestatic    kotlin/collections/CollectionsKt.convertToSetForSetOperationWith:(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Collection;
        //    20: astore_2        /* other */
        //    21: aload_2         /* other */
        //    22: invokeinterface java/util/Collection.isEmpty:()Z
        //    27: ifeq            38
        //    30: aload_0         /* $this$minus */
        //    31: checkcast       Ljava/lang/Iterable;
        //    34: invokestatic    kotlin/collections/CollectionsKt.toSet:(Ljava/lang/Iterable;)Ljava/util/Set;
        //    37: areturn        
        //    38: aload_2         /* other */
        //    39: instanceof      Ljava/util/Set;
        //    42: ifeq            129
        //    45: aload_0         /* $this$minus */
        //    46: checkcast       Ljava/lang/Iterable;
        //    49: astore_3       
        //    50: new             Ljava/util/LinkedHashSet;
        //    53: dup            
        //    54: invokespecial   java/util/LinkedHashSet.<init>:()V
        //    57: checkcast       Ljava/util/Collection;
        //    60: astore          destination$iv
        //    62: iconst_0       
        //    63: istore          $i$f$filterNotTo
        //    65: aload_3         /* $this$filterNotTo$iv */
        //    66: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    71: astore          6
        //    73: aload           6
        //    75: invokeinterface java/util/Iterator.hasNext:()Z
        //    80: ifeq            123
        //    83: aload           6
        //    85: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    90: astore          element$iv
        //    92: aload           element$iv
        //    94: astore          it
        //    96: iconst_0       
        //    97: istore          $i$a$-filterNotTo-SetsKt___SetsKt$minus$2
        //    99: aload_2         /* other */
        //   100: aload           it
        //   102: invokeinterface java/util/Collection.contains:(Ljava/lang/Object;)Z
        //   107: ifne            73
        //   110: aload           destination$iv
        //   112: aload           element$iv
        //   114: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   119: pop            
        //   120: goto            73
        //   123: aload           destination$iv
        //   125: checkcast       Ljava/util/Set;
        //   128: areturn        
        //   129: new             Ljava/util/LinkedHashSet;
        //   132: dup            
        //   133: aload_0         /* $this$minus */
        //   134: checkcast       Ljava/util/Collection;
        //   137: invokespecial   java/util/LinkedHashSet.<init>:(Ljava/util/Collection;)V
        //   140: astore_3        /* result */
        //   141: aload_3         /* result */
        //   142: aload_2         /* other */
        //   143: invokevirtual   java/util/LinkedHashSet.removeAll:(Ljava/util/Collection;)Z
        //   146: pop            
        //   147: aload_3         /* result */
        //   148: checkcast       Ljava/util/Set;
        //   151: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/util/Set<+TT;>;Ljava/lang/Iterable<+TT;>;)Ljava/util/Set<TT;>;
        //    StackMapTable: 00 04 FC 00 26 07 00 53 FF 00 22 00 07 07 00 2D 07 00 3D 07 00 53 07 00 3D 07 00 53 01 07 00 45 00 00 31 FF 00 05 00 03 07 00 2D 07 00 3D 07 00 53 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <T> Set<T> minus(@NotNull final Set<? extends T> $this$minus, @NotNull final Sequence<? extends T> elements) {
        Intrinsics.checkParameterIsNotNull($this$minus, "$this$minus");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        final LinkedHashSet result = new LinkedHashSet((Collection<? extends E>)$this$minus);
        CollectionsKt__MutableCollectionsKt.removeAll((Collection<? super Object>)result, (Sequence<?>)elements);
        return (Set<T>)result;
    }
    
    @InlineOnly
    private static final <T> Set<T> minusElement(@NotNull final Set<? extends T> $this$minusElement, final T element) {
        final int $i$f$minusElement = 0;
        return (Set<T>)minus($this$minusElement, (Object)element);
    }
    
    @NotNull
    public static final <T> Set<T> plus(@NotNull final Set<? extends T> $this$plus, final T element) {
        Intrinsics.checkParameterIsNotNull($this$plus, "$this$plus");
        final LinkedHashSet result = new LinkedHashSet(MapsKt__MapsKt.mapCapacity($this$plus.size() + 1));
        result.addAll($this$plus);
        result.add(element);
        return (Set<T>)result;
    }
    
    @NotNull
    public static final <T> Set<T> plus(@NotNull final Set<? extends T> $this$plus, @NotNull final T[] elements) {
        Intrinsics.checkParameterIsNotNull($this$plus, "$this$plus");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        final LinkedHashSet result = new LinkedHashSet(MapsKt__MapsKt.mapCapacity($this$plus.size() + elements.length));
        result.addAll($this$plus);
        CollectionsKt__MutableCollectionsKt.addAll(result, elements);
        return (Set<T>)result;
    }
    
    @NotNull
    public static final <T> Set<T> plus(@NotNull final Set<? extends T> $this$plus, @NotNull final Iterable<? extends T> elements) {
        Intrinsics.checkParameterIsNotNull($this$plus, "$this$plus");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        final Integer collectionSizeOrNull = CollectionsKt__IterablesKt.collectionSizeOrNull((Iterable<?>)elements);
        int expectedSize;
        if (collectionSizeOrNull != null) {
            final int it = collectionSizeOrNull.intValue();
            final int n = 0;
            expectedSize = $this$plus.size() + it;
        }
        else {
            expectedSize = $this$plus.size() * 2;
        }
        final LinkedHashSet result = new LinkedHashSet(MapsKt__MapsKt.mapCapacity(expectedSize));
        result.addAll($this$plus);
        CollectionsKt__MutableCollectionsKt.addAll((Collection<? super Object>)result, (Iterable<?>)elements);
        return (Set<T>)result;
    }
    
    @NotNull
    public static final <T> Set<T> plus(@NotNull final Set<? extends T> $this$plus, @NotNull final Sequence<? extends T> elements) {
        Intrinsics.checkParameterIsNotNull($this$plus, "$this$plus");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        final LinkedHashSet result = new LinkedHashSet(MapsKt__MapsKt.mapCapacity($this$plus.size() * 2));
        result.addAll($this$plus);
        CollectionsKt__MutableCollectionsKt.addAll((Collection<? super Object>)result, (Sequence<?>)elements);
        return (Set<T>)result;
    }
    
    @InlineOnly
    private static final <T> Set<T> plusElement(@NotNull final Set<? extends T> $this$plusElement, final T element) {
        final int $i$f$plusElement = 0;
        return (Set<T>)plus($this$plusElement, (Object)element);
    }
    
    public SetsKt___SetsKt() {
    }
}
