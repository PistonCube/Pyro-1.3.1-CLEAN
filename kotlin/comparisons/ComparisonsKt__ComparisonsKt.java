// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.comparisons;

import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;
import java.util.Comparator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.jvm.functions.Function1;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\b\u001aY\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\t\u001aW\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\b\u001a;\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\b\u001aW\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\b\u001a-\u0010\r\u001a\u00020\u000e\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u000f\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0010\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0011\u001a>\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\b¢\u0006\u0002\u0010\u0013\u001aY\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0014\u001aZ\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\b¢\u0006\u0002\u0010\u0015\u001aG\u0010\u0016\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022 \u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0014\u001a&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a-\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087\b\u001a@\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a-\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087\b\u001a@\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a&\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a0\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\u001aO\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0086\u0004\u001aO\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\b\u001ak\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\b\u001aO\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\b\u001ak\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\b\u001am\u0010!\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u000328\b\u0004\u0010\"\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000e0#H\u0087\b\u001aO\u0010&\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0086\u0004¨\u0006'" }, d2 = { "compareBy", "Ljava/util/Comparator;", "T", "Lkotlin/Comparator;", "selector", "Lkotlin/Function1;", "", "selectors", "", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "K", "comparator", "compareByDescending", "compareValues", "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "compareValuesBy", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)I", "compareValuesByImpl", "compareValuesByImpl$ComparisonsKt__ComparisonsKt", "naturalOrder", "nullsFirst", "", "nullsLast", "reverseOrder", "reversed", "then", "thenBy", "thenByDescending", "thenComparator", "comparison", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "thenDescending", "kotlin-stdlib" }, xs = "kotlin/comparisons/ComparisonsKt")
class ComparisonsKt__ComparisonsKt
{
    public static final <T> int compareValuesBy(final T a, final T b, @NotNull final Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkParameterIsNotNull(selectors, "selectors");
        if (((Function1<? super Object, ? extends Comparable<?>>[])selectors).length <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return compareValuesByImpl$ComparisonsKt__ComparisonsKt(a, (Object)b, (Function1<? super Object, ? extends Comparable<?>>[])selectors);
    }
    
    private static final <T> int compareValuesByImpl$ComparisonsKt__ComparisonsKt(final T a, final T b, final Function1<? super T, ? extends Comparable<?>>[] selectors) {
        for (final Function1 fn : selectors) {
            final Comparable v1 = fn.invoke(a);
            final Comparable v2 = fn.invoke(b);
            final int diff = compareValues(v1, v2);
            if (diff != 0) {
                return diff;
            }
        }
        return 0;
    }
    
    @InlineOnly
    private static final <T> int compareValuesBy(final T a, final T b, final Function1<? super T, ? extends Comparable<?>> selector) {
        final int $i$f$compareValuesBy = 0;
        return compareValues((Comparable)selector.invoke(a), (Comparable)selector.invoke(b));
    }
    
    @InlineOnly
    private static final <T, K> int compareValuesBy(final T a, final T b, final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector) {
        final int $i$f$compareValuesBy = 0;
        return comparator.compare((Object)selector.invoke(a), (Object)selector.invoke(b));
    }
    
    public static final <T extends Comparable<?>> int compareValues(@Nullable final T a, @Nullable final T b) {
        if (a == b) {
            return 0;
        }
        if (a == null) {
            return -1;
        }
        if (b == null) {
            return 1;
        }
        return a.compareTo(b);
    }
    
    @NotNull
    public static final <T> Comparator<T> compareBy(@NotNull final Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkParameterIsNotNull(selectors, "selectors");
        if (selectors.length <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return (Comparator<T>)new ComparisonsKt__ComparisonsKt$compareBy.ComparisonsKt__ComparisonsKt$compareBy$1((Function1[])selectors);
    }
    
    @InlineOnly
    private static final <T> Comparator<T> compareBy(final Function1<? super T, ? extends Comparable<?>> selector) {
        final int $i$f$compareBy = 0;
        return (Comparator<T>)new ComparisonsKt__ComparisonsKt$compareBy.ComparisonsKt__ComparisonsKt$compareBy$2((Function1)selector);
    }
    
    @InlineOnly
    private static final <T, K> Comparator<T> compareBy(final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector) {
        final int $i$f$compareBy = 0;
        return (Comparator<T>)new ComparisonsKt__ComparisonsKt$compareBy.ComparisonsKt__ComparisonsKt$compareBy$3((Comparator)comparator, (Function1)selector);
    }
    
    @InlineOnly
    private static final <T> Comparator<T> compareByDescending(final Function1<? super T, ? extends Comparable<?>> selector) {
        final int $i$f$compareByDescending = 0;
        return (Comparator<T>)new ComparisonsKt__ComparisonsKt$compareByDescending.ComparisonsKt__ComparisonsKt$compareByDescending$1((Function1)selector);
    }
    
    @InlineOnly
    private static final <T, K> Comparator<T> compareByDescending(final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector) {
        final int $i$f$compareByDescending = 0;
        return (Comparator<T>)new ComparisonsKt__ComparisonsKt$compareByDescending.ComparisonsKt__ComparisonsKt$compareByDescending$2((Comparator)comparator, (Function1)selector);
    }
    
    @InlineOnly
    private static final <T> Comparator<T> thenBy(@NotNull final Comparator<T> $this$thenBy, final Function1<? super T, ? extends Comparable<?>> selector) {
        final int $i$f$thenBy = 0;
        return (Comparator<T>)new ComparisonsKt__ComparisonsKt$thenBy.ComparisonsKt__ComparisonsKt$thenBy$1((Comparator)$this$thenBy, (Function1)selector);
    }
    
    @InlineOnly
    private static final <T, K> Comparator<T> thenBy(@NotNull final Comparator<T> $this$thenBy, final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector) {
        final int $i$f$thenBy = 0;
        return (Comparator<T>)new ComparisonsKt__ComparisonsKt$thenBy.ComparisonsKt__ComparisonsKt$thenBy$2((Comparator)$this$thenBy, (Comparator)comparator, (Function1)selector);
    }
    
    @InlineOnly
    private static final <T> Comparator<T> thenByDescending(@NotNull final Comparator<T> $this$thenByDescending, final Function1<? super T, ? extends Comparable<?>> selector) {
        final int $i$f$thenByDescending = 0;
        return (Comparator<T>)new ComparisonsKt__ComparisonsKt$thenByDescending.ComparisonsKt__ComparisonsKt$thenByDescending$1((Comparator)$this$thenByDescending, (Function1)selector);
    }
    
    @InlineOnly
    private static final <T, K> Comparator<T> thenByDescending(@NotNull final Comparator<T> $this$thenByDescending, final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector) {
        final int $i$f$thenByDescending = 0;
        return (Comparator<T>)new ComparisonsKt__ComparisonsKt$thenByDescending.ComparisonsKt__ComparisonsKt$thenByDescending$2((Comparator)$this$thenByDescending, (Comparator)comparator, (Function1)selector);
    }
    
    @InlineOnly
    private static final <T> Comparator<T> thenComparator(@NotNull final Comparator<T> $this$thenComparator, final Function2<? super T, ? super T, Integer> comparison) {
        final int $i$f$thenComparator = 0;
        return (Comparator<T>)new ComparisonsKt__ComparisonsKt$thenComparator.ComparisonsKt__ComparisonsKt$thenComparator$1((Comparator)$this$thenComparator, (Function2)comparison);
    }
    
    @NotNull
    public static final <T> Comparator<T> then(@NotNull final Comparator<T> $this$then, @NotNull final Comparator<? super T> comparator) {
        Intrinsics.checkParameterIsNotNull($this$then, "$this$then");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return (Comparator<T>)new ComparisonsKt__ComparisonsKt$then.ComparisonsKt__ComparisonsKt$then$1((Comparator)$this$then, (Comparator)comparator);
    }
    
    @NotNull
    public static final <T> Comparator<T> thenDescending(@NotNull final Comparator<T> $this$thenDescending, @NotNull final Comparator<? super T> comparator) {
        Intrinsics.checkParameterIsNotNull($this$thenDescending, "$this$thenDescending");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return (Comparator<T>)new ComparisonsKt__ComparisonsKt$thenDescending.ComparisonsKt__ComparisonsKt$thenDescending$1((Comparator)$this$thenDescending, (Comparator)comparator);
    }
    
    @NotNull
    public static final <T> Comparator<T> nullsFirst(@NotNull final Comparator<? super T> comparator) {
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return (Comparator<T>)new ComparisonsKt__ComparisonsKt$nullsFirst.ComparisonsKt__ComparisonsKt$nullsFirst$1((Comparator)comparator);
    }
    
    @InlineOnly
    private static final <T extends Comparable<? super T>> Comparator<T> nullsFirst() {
        final int $i$f$nullsFirst = 0;
        return nullsFirst(naturalOrder());
    }
    
    @NotNull
    public static final <T> Comparator<T> nullsLast(@NotNull final Comparator<? super T> comparator) {
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return (Comparator<T>)new ComparisonsKt__ComparisonsKt$nullsLast.ComparisonsKt__ComparisonsKt$nullsLast$1((Comparator)comparator);
    }
    
    @InlineOnly
    private static final <T extends Comparable<? super T>> Comparator<T> nullsLast() {
        final int $i$f$nullsLast = 0;
        return nullsLast(naturalOrder());
    }
    
    @NotNull
    public static final <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        final NaturalOrderComparator instance = NaturalOrderComparator.INSTANCE;
        if (instance == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
        }
        return (Comparator<T>)instance;
    }
    
    @NotNull
    public static final <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        final ReverseOrderComparator instance = ReverseOrderComparator.INSTANCE;
        if (instance == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
        }
        return (Comparator<T>)instance;
    }
    
    @NotNull
    public static final <T> Comparator<T> reversed(@NotNull final Comparator<T> $this$reversed) {
        Intrinsics.checkParameterIsNotNull($this$reversed, "$this$reversed");
        Object comparator;
        if ($this$reversed instanceof ReversedComparator) {
            comparator = ((ReversedComparator<T>)$this$reversed).getComparator();
        }
        else if (Intrinsics.areEqual($this$reversed, NaturalOrderComparator.INSTANCE)) {
            final ReverseOrderComparator instance = ReverseOrderComparator.INSTANCE;
            if (instance == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
            }
            comparator = instance;
        }
        else if (Intrinsics.areEqual($this$reversed, ReverseOrderComparator.INSTANCE)) {
            final NaturalOrderComparator instance2 = NaturalOrderComparator.INSTANCE;
            if (instance2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
            }
            comparator = instance2;
        }
        else {
            comparator = new ReversedComparator<Object>($this$reversed);
        }
        return (Comparator<T>)comparator;
    }
    
    public ComparisonsKt__ComparisonsKt() {
    }
}
