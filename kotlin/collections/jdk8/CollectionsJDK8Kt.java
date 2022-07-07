// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections.jdk8;

import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.internal.InlineOnly;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import org.jetbrains.annotations.NotNull;
import java.util.Map;
import kotlin.jvm.JvmName;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0010%\n\u0002\b\u0003\u001aA\u0010\u0000\u001a\u0002H\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0003\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0001H\u0087\b¢\u0006\u0002\u0010\u0007\u001aH\u0010\b\u001a\u00020\t\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0003\"\t\b\u0001\u0010\u0001¢\u0006\u0002\b\u0003*\u0012\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0006\b\u0001\u0012\u0002H\u00010\n2\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u000b\u001a\u0002H\u0001H\u0087\b¢\u0006\u0002\u0010\f¨\u0006\r" }, d2 = { "getOrDefault", "V", "K", "Lkotlin/internal/OnlyInputTypes;", "", "key", "defaultValue", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "", "", "value", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "kotlin-stdlib-jdk8" }, pn = "kotlin.collections")
@JvmName(name = "CollectionsJDK8Kt")
public final class CollectionsJDK8Kt
{
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final <K, V> V getOrDefault(@NotNull final Map<? extends K, ? extends V> $this$getOrDefault, final K key, final V defaultValue) {
        final int $i$f$getOrDefault = 0;
        if ($this$getOrDefault == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
        }
        return (V)$this$getOrDefault.getOrDefault((Object)key, (V)defaultValue);
    }
    
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final <K, V> boolean remove(@NotNull final Map<? extends K, ? extends V> $this$remove, final K key, final V value) {
        final int $i$f$remove = 0;
        if ($this$remove == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
        return TypeIntrinsics.asMutableMap($this$remove).remove(key, value);
    }
}
