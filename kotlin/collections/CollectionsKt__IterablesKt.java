// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.TuplesKt;
import kotlin.Pair;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import kotlin.PublishedApi;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.internal.InlineOnly;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000:\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0087\b\u001a \u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u001f\u0010\t\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001¢\u0006\u0002\u0010\n\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a,\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0010\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a\u001d\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\fH\u0002¢\u0006\u0002\b\u0013\u001a@\u0010\u0014\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u00100\u0015\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0016*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00160\u00150\u0001¨\u0006\u0017" }, d2 = { "Iterable", "", "T", "iterator", "Lkotlin/Function0;", "", "collectionSizeOrDefault", "", "default", "collectionSizeOrNull", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "convertToSetForSetOperation", "", "convertToSetForSetOperationWith", "source", "flatten", "", "safeToConvertToSet", "", "safeToConvertToSet$CollectionsKt__IterablesKt", "unzip", "Lkotlin/Pair;", "R", "kotlin-stdlib" }, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__IterablesKt extends CollectionsKt__CollectionsKt
{
    @InlineOnly
    private static final <T> Iterable<T> Iterable(final Function0<? extends Iterator<? extends T>> iterator) {
        final int $i$f$Iterable = 0;
        return (Iterable<T>)new CollectionsKt__IterablesKt$Iterable.CollectionsKt__IterablesKt$Iterable$1((Function0)iterator);
    }
    
    @PublishedApi
    @Nullable
    public static final <T> Integer collectionSizeOrNull(@NotNull final Iterable<? extends T> $this$collectionSizeOrNull) {
        Intrinsics.checkParameterIsNotNull($this$collectionSizeOrNull, "$this$collectionSizeOrNull");
        return ($this$collectionSizeOrNull instanceof Collection) ? Integer.valueOf(((Collection)$this$collectionSizeOrNull).size()) : null;
    }
    
    @PublishedApi
    public static final <T> int collectionSizeOrDefault(@NotNull final Iterable<? extends T> $this$collectionSizeOrDefault, final int default) {
        Intrinsics.checkParameterIsNotNull($this$collectionSizeOrDefault, "$this$collectionSizeOrDefault");
        return ($this$collectionSizeOrDefault instanceof Collection) ? ((Collection)$this$collectionSizeOrDefault).size() : default;
    }
    
    private static final <T> boolean safeToConvertToSet$CollectionsKt__IterablesKt(@NotNull final Collection<? extends T> $this$safeToConvertToSet) {
        return $this$safeToConvertToSet.size() > 2 && $this$safeToConvertToSet instanceof ArrayList;
    }
    
    @NotNull
    public static final <T> Collection<T> convertToSetForSetOperationWith(@NotNull final Iterable<? extends T> $this$convertToSetForSetOperationWith, @NotNull final Iterable<? extends T> source) {
        Intrinsics.checkParameterIsNotNull($this$convertToSetForSetOperationWith, "$this$convertToSetForSetOperationWith");
        Intrinsics.checkParameterIsNotNull(source, "source");
        return (Collection<T>)(($this$convertToSetForSetOperationWith instanceof Set) ? ((Collection<? extends T>)$this$convertToSetForSetOperationWith) : (($this$convertToSetForSetOperationWith instanceof Collection) ? ((source instanceof Collection && ((Collection)source).size() < 2) ? ((Collection<? extends T>)$this$convertToSetForSetOperationWith) : (safeToConvertToSet$CollectionsKt__IterablesKt((Collection<?>)$this$convertToSetForSetOperationWith) ? ((HashSet<Object>)CollectionsKt___CollectionsKt.toHashSet((Iterable<?>)$this$convertToSetForSetOperationWith)) : ((Collection<? extends T>)$this$convertToSetForSetOperationWith))) : ((HashSet<Object>)CollectionsKt___CollectionsKt.toHashSet((Iterable<?>)$this$convertToSetForSetOperationWith))));
    }
    
    @NotNull
    public static final <T> Collection<T> convertToSetForSetOperation(@NotNull final Iterable<? extends T> $this$convertToSetForSetOperation) {
        Intrinsics.checkParameterIsNotNull($this$convertToSetForSetOperation, "$this$convertToSetForSetOperation");
        return (Collection<T>)(($this$convertToSetForSetOperation instanceof Set) ? ((Collection<? extends T>)$this$convertToSetForSetOperation) : (($this$convertToSetForSetOperation instanceof Collection) ? (safeToConvertToSet$CollectionsKt__IterablesKt((Collection<?>)$this$convertToSetForSetOperation) ? ((HashSet<Object>)CollectionsKt___CollectionsKt.toHashSet((Iterable<?>)$this$convertToSetForSetOperation)) : ((Collection<? extends T>)$this$convertToSetForSetOperation)) : ((HashSet<Object>)CollectionsKt___CollectionsKt.toHashSet((Iterable<?>)$this$convertToSetForSetOperation))));
    }
    
    @NotNull
    public static final <T> List<T> flatten(@NotNull final Iterable<? extends Iterable<? extends T>> $this$flatten) {
        Intrinsics.checkParameterIsNotNull($this$flatten, "$this$flatten");
        final ArrayList result = new ArrayList();
        for (final Iterable element : $this$flatten) {
            CollectionsKt__MutableCollectionsKt.addAll((Collection<? super Object>)result, (Iterable<?>)element);
        }
        return (List<T>)result;
    }
    
    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull final Iterable<? extends Pair<? extends T, ? extends R>> $this$unzip) {
        Intrinsics.checkParameterIsNotNull($this$unzip, "$this$unzip");
        final int expectedSize = collectionSizeOrDefault((Iterable<?>)$this$unzip, 10);
        final ArrayList listT = new ArrayList(expectedSize);
        final ArrayList listR = new ArrayList(expectedSize);
        for (final Pair pair : $this$unzip) {
            listT.add(pair.getFirst());
            listR.add(pair.getSecond());
        }
        return TuplesKt.to((List<T>)listT, (List<R>)listR);
    }
    
    public CollectionsKt__IterablesKt() {
    }
}
