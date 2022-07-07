// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import org.jetbrains.annotations.Nullable;
import java.util.HashSet;
import kotlin.SinceKotlin;
import java.util.LinkedHashSet;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u00000\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a\u001f\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0004j\b\u0012\u0004\u0012\u0002H\u0002`\u0005\"\u0004\b\u0000\u0010\u0002H\u0087\b\u001a5\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0004j\b\u0012\u0004\u0012\u0002H\u0002`\u0005\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0007\"\u0002H\u0002¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\nj\b\u0012\u0004\u0012\u0002H\u0002`\u000b\"\u0004\b\u0000\u0010\u0002H\u0087\b\u001a5\u0010\t\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\nj\b\u0012\u0004\u0012\u0002H\u0002`\u000b\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0007\"\u0002H\u0002¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000e\"\u0004\b\u0000\u0010\u0002H\u0087\b\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0007\"\u0002H\u0002¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u0087\b\u001a+\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0007\"\u0002H\u0002¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a!\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\u0087\b¨\u0006\u0013" }, d2 = { "emptySet", "", "T", "hashSetOf", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "elements", "", "([Ljava/lang/Object;)Ljava/util/HashSet;", "linkedSetOf", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "mutableSetOf", "", "([Ljava/lang/Object;)Ljava/util/Set;", "setOf", "optimizeReadOnlySet", "orEmpty", "kotlin-stdlib" }, xs = "kotlin/collections/SetsKt")
class SetsKt__SetsKt extends SetsKt__SetsJVMKt
{
    @NotNull
    public static final <T> Set<T> emptySet() {
        return (Set<T>)EmptySet.INSTANCE;
    }
    
    @NotNull
    public static final <T> Set<T> setOf(@NotNull final T... elements) {
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return (elements.length > 0) ? ArraysKt___ArraysKt.toSet(elements) : emptySet();
    }
    
    @InlineOnly
    private static final <T> Set<T> setOf() {
        final int $i$f$setOf = 0;
        return (Set<T>)emptySet();
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> Set<T> mutableSetOf() {
        final int $i$f$mutableSetOf = 0;
        return new LinkedHashSet<T>();
    }
    
    @NotNull
    public static final <T> Set<T> mutableSetOf(@NotNull final T... elements) {
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return ArraysKt___ArraysKt.toCollection(elements, (Set<T>)new LinkedHashSet<Object>(MapsKt__MapsKt.mapCapacity(elements.length)));
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> HashSet<T> hashSetOf() {
        final int $i$f$hashSetOf = 0;
        return new HashSet<T>();
    }
    
    @NotNull
    public static final <T> HashSet<T> hashSetOf(@NotNull final T... elements) {
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return ArraysKt___ArraysKt.toCollection(elements, (HashSet<T>)new HashSet<Object>(MapsKt__MapsKt.mapCapacity(elements.length)));
    }
    
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> LinkedHashSet<T> linkedSetOf() {
        final int $i$f$linkedSetOf = 0;
        return new LinkedHashSet<T>();
    }
    
    @NotNull
    public static final <T> LinkedHashSet<T> linkedSetOf(@NotNull final T... elements) {
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return ArraysKt___ArraysKt.toCollection(elements, (LinkedHashSet<T>)new LinkedHashSet<Object>(MapsKt__MapsKt.mapCapacity(elements.length)));
    }
    
    @InlineOnly
    private static final <T> Set<T> orEmpty(@Nullable final Set<? extends T> $this$orEmpty) {
        final int $i$f$orEmpty = 0;
        Set<T> emptySet = (Set<T>)$this$orEmpty;
        if ($this$orEmpty == null) {
            emptySet = emptySet();
        }
        return emptySet;
    }
    
    @NotNull
    public static final <T> Set<T> optimizeReadOnlySet(@NotNull final Set<? extends T> $this$optimizeReadOnlySet) {
        Intrinsics.checkParameterIsNotNull($this$optimizeReadOnlySet, "$this$optimizeReadOnlySet");
        Object o = null;
        switch ($this$optimizeReadOnlySet.size()) {
            case 0: {
                o = emptySet();
                break;
            }
            case 1: {
                o = SetsKt__SetsJVMKt.setOf($this$optimizeReadOnlySet.iterator().next());
                break;
            }
            default: {
                o = $this$optimizeReadOnlySet;
                break;
            }
        }
        return (Set<T>)o;
    }
    
    public SetsKt__SetsKt() {
    }
}
