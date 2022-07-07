// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.jvm.functions.Function1;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000\u001e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00032!\u0010\b\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u0002H\u00010\t\u001aX\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\f2!\u0010\b\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u0002H\u00010\tH\u0007¢\u0006\u0002\b\r¨\u0006\u000e" }, d2 = { "getOrImplicitDefault", "V", "K", "", "key", "getOrImplicitDefaultNullable", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "withDefault", "defaultValue", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "withDefaultMutable", "kotlin-stdlib" }, xs = "kotlin/collections/MapsKt")
class MapsKt__MapWithDefaultKt
{
    @JvmName(name = "getOrImplicitDefaultNullable")
    @PublishedApi
    public static final <K, V> V getOrImplicitDefaultNullable(@NotNull final Map<K, ? extends V> $this$getOrImplicitDefault, final K key) {
        Intrinsics.checkParameterIsNotNull($this$getOrImplicitDefault, "$this$getOrImplicitDefault");
        if ($this$getOrImplicitDefault instanceof MapWithDefault) {
            return $this$getOrImplicitDefault.getOrImplicitDefault(key);
        }
        final Map $this$getOrElseNullable$iv = $this$getOrImplicitDefault;
        final int $i$f$getOrElseNullable = 0;
        final Object value$iv = $this$getOrElseNullable$iv.get(key);
        if (value$iv == null && !$this$getOrElseNullable$iv.containsKey(key)) {
            final int n = 0;
            throw new NoSuchElementException("Key " + key + " is missing in the map.");
        }
        return (V)value$iv;
    }
    
    @NotNull
    public static final <K, V> Map<K, V> withDefault(@NotNull final Map<K, ? extends V> $this$withDefault, @NotNull final Function1<? super K, ? extends V> defaultValue) {
        Intrinsics.checkParameterIsNotNull($this$withDefault, "$this$withDefault");
        Intrinsics.checkParameterIsNotNull(defaultValue, "defaultValue");
        return (Map<K, V>)(($this$withDefault instanceof MapWithDefault) ? withDefault((Map<Object, ?>)((MapWithDefault<K, ? extends V>)$this$withDefault).getMap(), (Function1<? super Object, ?>)defaultValue) : ((MapWithDefaultImpl<Object, Object>)new MapWithDefaultImpl<Object, Object>((Map<Object, ?>)$this$withDefault, (Function1<? super Object, ?>)defaultValue)));
    }
    
    @JvmName(name = "withDefaultMutable")
    @NotNull
    public static final <K, V> Map<K, V> withDefaultMutable(@NotNull final Map<K, V> $this$withDefault, @NotNull final Function1<? super K, ? extends V> defaultValue) {
        Intrinsics.checkParameterIsNotNull($this$withDefault, "$this$withDefault");
        Intrinsics.checkParameterIsNotNull(defaultValue, "defaultValue");
        return (Map<K, V>)(($this$withDefault instanceof MutableMapWithDefault) ? withDefaultMutable((Map<Object, Object>)((MutableMapWithDefault<K, V>)$this$withDefault).getMap(), (Function1<? super Object, ?>)defaultValue) : ((MutableMapWithDefaultImpl<Object, Object>)new MutableMapWithDefaultImpl<Object, Object>((Map<Object, Object>)$this$withDefault, (Function1<? super Object, ?>)defaultValue)));
    }
    
    public MapsKt__MapWithDefaultKt() {
    }
}
