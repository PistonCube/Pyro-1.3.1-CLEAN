// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.streams.jdk8;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.StreamSupport;
import java.util.Spliterator;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.PrimitiveIterator;
import java.util.stream.IntStream;
import kotlin.SinceKotlin;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import java.util.stream.Stream;
import kotlin.jvm.JvmName;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0007\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\t\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u0001H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f*\u00020\u0003H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f*\u00020\u0005H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\u0007H\u0007\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0007¨\u0006\r" }, d2 = { "asSequence", "Lkotlin/sequences/Sequence;", "", "Ljava/util/stream/DoubleStream;", "", "Ljava/util/stream/IntStream;", "", "Ljava/util/stream/LongStream;", "T", "Ljava/util/stream/Stream;", "asStream", "toList", "", "kotlin-stdlib-jdk8" }, pn = "kotlin.streams")
@JvmName(name = "StreamsKt")
public final class StreamsKt
{
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> Sequence<T> asSequence(@NotNull final Stream<T> $this$asSequence) {
        Intrinsics.checkParameterIsNotNull($this$asSequence, "$this$asSequence");
        return new Sequence<T>($this$asSequence) {
            @NotNull
            @Override
            public Iterator<T> iterator() {
                final int n = 0;
                return (Iterator<T>)this.$this_asSequence$inlined.iterator();
            }
        };
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<Integer> asSequence(@NotNull final IntStream $this$asSequence) {
        Intrinsics.checkParameterIsNotNull($this$asSequence, "$this$asSequence");
        return new Sequence<Integer>($this$asSequence) {
            @NotNull
            @Override
            public Iterator<Integer> iterator() {
                final int n = 0;
                return this.$this_asSequence$inlined.iterator();
            }
        };
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<Long> asSequence(@NotNull final LongStream $this$asSequence) {
        Intrinsics.checkParameterIsNotNull($this$asSequence, "$this$asSequence");
        return new Sequence<Long>($this$asSequence) {
            @NotNull
            @Override
            public Iterator<Long> iterator() {
                final int n = 0;
                return this.$this_asSequence$inlined.iterator();
            }
        };
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<Double> asSequence(@NotNull final DoubleStream $this$asSequence) {
        Intrinsics.checkParameterIsNotNull($this$asSequence, "$this$asSequence");
        return new Sequence<Double>($this$asSequence) {
            @NotNull
            @Override
            public Iterator<Double> iterator() {
                final int n = 0;
                return this.$this_asSequence$inlined.iterator();
            }
        };
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> Stream<T> asStream(@NotNull final Sequence<? extends T> $this$asStream) {
        Intrinsics.checkParameterIsNotNull($this$asStream, "$this$asStream");
        final Stream<Object> stream = (Stream<Object>)StreamSupport.stream((Supplier<? extends Spliterator<T>>)new StreamsKt$asStream.StreamsKt$asStream$1((Sequence)$this$asStream), 16, false);
        Intrinsics.checkExpressionValueIsNotNull(stream, "StreamSupport.stream({ S\u2026literator.ORDERED, false)");
        return (Stream<T>)stream;
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> List<T> toList(@NotNull final Stream<T> $this$toList) {
        Intrinsics.checkParameterIsNotNull($this$toList, "$this$toList");
        final List<T> collect = $this$toList.collect((Collector<? super T, ?, List<T>>)Collectors.toList());
        Intrinsics.checkExpressionValueIsNotNull(collect, "collect(Collectors.toList<T>())");
        return collect;
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<Integer> toList(@NotNull final IntStream $this$toList) {
        Intrinsics.checkParameterIsNotNull($this$toList, "$this$toList");
        final int[] array = $this$toList.toArray();
        Intrinsics.checkExpressionValueIsNotNull(array, "toArray()");
        return ArraysKt___ArraysJvmKt.asList(array);
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<Long> toList(@NotNull final LongStream $this$toList) {
        Intrinsics.checkParameterIsNotNull($this$toList, "$this$toList");
        final long[] array = $this$toList.toArray();
        Intrinsics.checkExpressionValueIsNotNull(array, "toArray()");
        return ArraysKt___ArraysJvmKt.asList(array);
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<Double> toList(@NotNull final DoubleStream $this$toList) {
        Intrinsics.checkParameterIsNotNull($this$toList, "$this$toList");
        final double[] array = $this$toList.toArray();
        Intrinsics.checkExpressionValueIsNotNull(array, "toArray()");
        return ArraysKt___ArraysJvmKt.asList(array);
    }
}
