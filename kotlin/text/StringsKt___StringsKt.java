// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.collections.CharIterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntProgression;
import kotlin.collections.SlidingWindowKt;
import kotlin.sequences.Sequence;
import java.util.Comparator;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function0;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IndexedValue;
import kotlin.collections.Grouping;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import java.util.Iterator;
import kotlin.ranges.IntRange;
import kotlin.jvm.functions.Function2;
import kotlin.TypeCastException;
import kotlin.SinceKotlin;
import kotlin.random.Random;
import org.jetbrains.annotations.Nullable;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000\u00dc\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u001f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a!\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b*\u00020\u0002\u001a\u0010\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n*\u00020\u0002\u001aE\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\f\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u00020\u00022\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\u00100\u0004H\u0086\b\u001a3\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00050\f\"\u0004\b\u0000\u0010\r*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u0004H\u0086\b\u001aM\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\f\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\u0086\b\u001aN\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\r\"\u0018\b\u0001\u0010\u0015*\u0012\u0012\u0006\b\u0000\u0012\u0002H\r\u0012\u0006\b\u0000\u0012\u00020\u00050\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u0004H\u0086\b¢\u0006\u0002\u0010\u0018\u001ah\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0018\b\u0002\u0010\u0015*\u0012\u0012\u0006\b\u0000\u0012\u0002H\r\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\u0086\b¢\u0006\u0002\u0010\u0019\u001a`\u0010\u001a\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0018\b\u0002\u0010\u0015*\u0012\u0012\u0006\b\u0000\u0012\u0002H\r\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\u00100\u0004H\u0086\b¢\u0006\u0002\u0010\u0018\u001a3\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\f\"\u0004\b\u0000\u0010\u000e*\u00020\u00022\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\u0087\b\u001aN\u0010\u001d\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u000e\"\u0018\b\u0001\u0010\u0015*\u0012\u0012\u0006\b\u0000\u0012\u00020\u0005\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\u0087\b¢\u0006\u0002\u0010\u0018\u001a\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\u00020\u00022\u0006\u0010!\u001a\u00020\"H\u0007\u001a4\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H#0\u0004H\u0007\u001a\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\n*\u00020\u00022\u0006\u0010!\u001a\u00020\"H\u0007\u001a4\u0010$\u001a\b\u0012\u0004\u0012\u0002H#0\n\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H#0\u0004H\u0007\u001a\r\u0010%\u001a\u00020\"*\u00020\u0002H\u0087\b\u001a!\u0010%\u001a\u00020\"*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010'\u001a\u00020\"\u001a\u0012\u0010&\u001a\u00020 *\u00020 2\u0006\u0010'\u001a\u00020\"\u001a\u0012\u0010(\u001a\u00020\u0002*\u00020\u00022\u0006\u0010'\u001a\u00020\"\u001a\u0012\u0010(\u001a\u00020 *\u00020 2\u0006\u0010'\u001a\u00020\"\u001a!\u0010)\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a!\u0010)\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a!\u0010*\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a!\u0010*\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a)\u0010+\u001a\u00020\u0005*\u00020\u00022\u0006\u0010,\u001a\u00020\"2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\b\u001a\u001c\u0010.\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010,\u001a\u00020\"H\u0087\b¢\u0006\u0002\u0010/\u001a!\u00100\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a!\u00100\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a6\u00101\u001a\u00020\u0002*\u00020\u00022'\u0010\u0003\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000102H\u0086\b\u001a6\u00101\u001a\u00020 *\u00020 2'\u0010\u0003\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000102H\u0086\b\u001aQ\u00105\u001a\u0002H6\"\f\b\u0000\u00106*\u000607j\u0002`8*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H62'\u0010\u0003\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000102H\u0086\b¢\u0006\u0002\u00109\u001a!\u0010:\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a!\u0010:\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a<\u0010;\u001a\u0002H6\"\f\b\u0000\u00106*\u000607j\u0002`8*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H62\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b¢\u0006\u0002\u0010<\u001a<\u0010=\u001a\u0002H6\"\f\b\u0000\u00106*\u000607j\u0002`8*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H62\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b¢\u0006\u0002\u0010<\u001a(\u0010>\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0087\b¢\u0006\u0002\u0010?\u001a(\u0010@\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0087\b¢\u0006\u0002\u0010?\u001a\n\u0010A\u001a\u00020\u0005*\u00020\u0002\u001a!\u0010A\u001a\u00020\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a\u0011\u0010B\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010C\u001a(\u0010B\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b¢\u0006\u0002\u0010?\u001a3\u0010D\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H#0\b0\u0004H\u0086\b\u001aL\u0010E\u001a\u0002H6\"\u0004\b\u0000\u0010#\"\u0010\b\u0001\u00106*\n\u0012\u0006\b\u0000\u0012\u0002H#0F*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H62\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H#0\b0\u0004H\u0086\b¢\u0006\u0002\u0010G\u001aI\u0010H\u001a\u0002H#\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010I\u001a\u0002H#2'\u0010J\u001a#\u0012\u0013\u0012\u0011H#¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#02H\u0086\b¢\u0006\u0002\u0010L\u001a^\u0010M\u001a\u0002H#\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010I\u001a\u0002H#2<\u0010J\u001a8\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H#¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#0NH\u0086\b¢\u0006\u0002\u0010O\u001aI\u0010P\u001a\u0002H#\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010I\u001a\u0002H#2'\u0010J\u001a#\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u0011H#¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u0002H#02H\u0086\b¢\u0006\u0002\u0010L\u001a^\u0010Q\u001a\u0002H#\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010I\u001a\u0002H#2<\u0010J\u001a8\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u0011H#¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u0002H#0NH\u0086\b¢\u0006\u0002\u0010O\u001a!\u0010R\u001a\u00020S*\u00020\u00022\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S0\u0004H\u0086\b\u001a6\u0010U\u001a\u00020S*\u00020\u00022'\u0010T\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S02H\u0086\b\u001a)\u0010V\u001a\u00020\u0005*\u00020\u00022\u0006\u0010,\u001a\u00020\"2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\b\u001a\u0019\u0010W\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010,\u001a\u00020\"¢\u0006\u0002\u0010/\u001a9\u0010X\u001a\u0014\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f0\f\"\u0004\b\u0000\u0010\r*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u0004H\u0086\b\u001aS\u0010X\u001a\u0014\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u001f0\f\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\u0086\b\u001aR\u0010Y\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\r\"\u001c\b\u0001\u0010\u0015*\u0016\u0012\u0006\b\u0000\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050Z0\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u0004H\u0086\b¢\u0006\u0002\u0010\u0018\u001al\u0010Y\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u001c\b\u0002\u0010\u0015*\u0016\u0012\u0006\b\u0000\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0Z0\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\u0086\b¢\u0006\u0002\u0010\u0019\u001a5\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\\\"\u0004\b\u0000\u0010\r*\u00020\u00022\u0014\b\u0004\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u0004H\u0087\b\u001a!\u0010]\u001a\u00020\"*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a!\u0010^\u001a\u00020\"*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a\n\u0010_\u001a\u00020\u0005*\u00020\u0002\u001a!\u0010_\u001a\u00020\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a\u0011\u0010`\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010C\u001a(\u0010`\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b¢\u0006\u0002\u0010?\u001a-\u0010a\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#0\u0004H\u0086\b\u001aB\u0010b\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022'\u0010\u000f\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#02H\u0086\b\u001aH\u0010c\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\b\b\u0000\u0010#*\u00020d*\u00020\u00022)\u0010\u000f\u001a%\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u0001H#02H\u0086\b\u001aa\u0010e\u001a\u0002H6\"\b\b\u0000\u0010#*\u00020d\"\u0010\b\u0001\u00106*\n\u0012\u0006\b\u0000\u0012\u0002H#0F*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H62)\u0010\u000f\u001a%\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u0001H#02H\u0086\b¢\u0006\u0002\u0010f\u001a[\u0010g\u001a\u0002H6\"\u0004\b\u0000\u0010#\"\u0010\b\u0001\u00106*\n\u0012\u0006\b\u0000\u0012\u0002H#0F*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H62'\u0010\u000f\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#02H\u0086\b¢\u0006\u0002\u0010f\u001a3\u0010h\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\b\b\u0000\u0010#*\u00020d*\u00020\u00022\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u0001H#0\u0004H\u0086\b\u001aL\u0010i\u001a\u0002H6\"\b\b\u0000\u0010#*\u00020d\"\u0010\b\u0001\u00106*\n\u0012\u0006\b\u0000\u0012\u0002H#0F*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H62\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u0001H#0\u0004H\u0086\b¢\u0006\u0002\u0010G\u001aF\u0010j\u001a\u0002H6\"\u0004\b\u0000\u0010#\"\u0010\b\u0001\u00106*\n\u0012\u0006\b\u0000\u0012\u0002H#0F*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H62\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#0\u0004H\u0086\b¢\u0006\u0002\u0010G\u001a\u0011\u0010k\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010C\u001a8\u0010l\u001a\u0004\u0018\u00010\u0005\"\u000e\b\u0000\u0010#*\b\u0012\u0004\u0012\u0002H#0m*\u00020\u00022\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#0\u0004H\u0086\b¢\u0006\u0002\u0010?\u001a-\u0010o\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u001a\u0010p\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00050qj\n\u0012\u0006\b\u0000\u0012\u00020\u0005`r¢\u0006\u0002\u0010s\u001a\u0011\u0010t\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010C\u001a8\u0010u\u001a\u0004\u0018\u00010\u0005\"\u000e\b\u0000\u0010#*\b\u0012\u0004\u0012\u0002H#0m*\u00020\u00022\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#0\u0004H\u0086\b¢\u0006\u0002\u0010?\u001a-\u0010v\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u001a\u0010p\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00050qj\n\u0012\u0006\b\u0000\u0012\u00020\u0005`r¢\u0006\u0002\u0010s\u001a\n\u0010w\u001a\u00020\u0001*\u00020\u0002\u001a!\u0010w\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a0\u0010x\u001a\u0002Hy\"\b\b\u0000\u0010y*\u00020\u0002*\u0002Hy2\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S0\u0004H\u0087\b¢\u0006\u0002\u0010z\u001a-\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a-\u0010{\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0\u0010*\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a\r\u0010|\u001a\u00020\u0005*\u00020\u0002H\u0087\b\u001a\u0014\u0010|\u001a\u00020\u0005*\u00020\u00022\u0006\u0010|\u001a\u00020}H\u0007\u001a6\u0010~\u001a\u00020\u0005*\u00020\u00022'\u0010J\u001a#\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000502H\u0086\b\u001aK\u0010\u007f\u001a\u00020\u0005*\u00020\u00022<\u0010J\u001a8\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050NH\u0086\b\u001a7\u0010\u0080\u0001\u001a\u00020\u0005*\u00020\u00022'\u0010J\u001a#\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u000502H\u0086\b\u001aL\u0010\u0081\u0001\u001a\u00020\u0005*\u00020\u00022<\u0010J\u001a8\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u00050NH\u0086\b\u001a\u000b\u0010\u0082\u0001\u001a\u00020\u0002*\u00020\u0002\u001a\u000e\u0010\u0082\u0001\u001a\u00020 *\u00020 H\u0087\b\u001a\u000b\u0010\u0083\u0001\u001a\u00020\u0005*\u00020\u0002\u001a\"\u0010\u0083\u0001\u001a\u00020\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a\u0012\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010C\u001a)\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b¢\u0006\u0002\u0010?\u001a\u001a\u0010\u0085\u0001\u001a\u00020\u0002*\u00020\u00022\r\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\b\u001a\u0015\u0010\u0085\u0001\u001a\u00020\u0002*\u00020\u00022\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001\u001a\u001d\u0010\u0085\u0001\u001a\u00020 *\u00020 2\r\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\bH\u0087\b\u001a\u0015\u0010\u0085\u0001\u001a\u00020 *\u00020 2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001\u001a\"\u0010\u0088\u0001\u001a\u00020\"*\u00020\u00022\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"0\u0004H\u0086\b\u001a$\u0010\u0089\u0001\u001a\u00030\u008a\u0001*\u00020\u00022\u0013\u0010n\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0012\u0005\u0012\u00030\u008a\u00010\u0004H\u0086\b\u001a\u0013\u0010\u008b\u0001\u001a\u00020\u0002*\u00020\u00022\u0006\u0010'\u001a\u00020\"\u001a\u0013\u0010\u008b\u0001\u001a\u00020 *\u00020 2\u0006\u0010'\u001a\u00020\"\u001a\u0013\u0010\u008c\u0001\u001a\u00020\u0002*\u00020\u00022\u0006\u0010'\u001a\u00020\"\u001a\u0013\u0010\u008c\u0001\u001a\u00020 *\u00020 2\u0006\u0010'\u001a\u00020\"\u001a\"\u0010\u008d\u0001\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a\"\u0010\u008d\u0001\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a\"\u0010\u008e\u0001\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a\"\u0010\u008e\u0001\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a+\u0010\u008f\u0001\u001a\u0002H6\"\u0010\b\u0000\u00106*\n\u0012\u0006\b\u0000\u0012\u00020\u00050F*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H6¢\u0006\u0003\u0010\u0090\u0001\u001a\u001d\u0010\u0091\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00050\u0092\u0001j\t\u0012\u0004\u0012\u00020\u0005`\u0093\u0001*\u00020\u0002\u001a\u0011\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u001f*\u00020\u0002\u001a\u0011\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050Z*\u00020\u0002\u001a\u0012\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050\u0097\u0001*\u00020\u0002\u001a1\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\t\b\u0002\u0010\u0099\u0001\u001a\u00020\"2\t\b\u0002\u0010\u009a\u0001\u001a\u00020\u0001H\u0007\u001aK\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\t\b\u0002\u0010\u0099\u0001\u001a\u00020\"2\t\b\u0002\u0010\u009a\u0001\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H#0\u0004H\u0007\u001a1\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020 0\n*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\t\b\u0002\u0010\u0099\u0001\u001a\u00020\"2\t\b\u0002\u0010\u009a\u0001\u001a\u00020\u0001H\u0007\u001aK\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u0002H#0\n\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\t\b\u0002\u0010\u0099\u0001\u001a\u00020\"2\t\b\u0002\u0010\u009a\u0001\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H#0\u0004H\u0007\u001a\u0018\u0010\u009c\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00050\u009d\u00010\b*\u00020\u0002\u001a)\u0010\u009e\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00100\u001f*\u00020\u00022\u0007\u0010\u009f\u0001\u001a\u00020\u0002H\u0086\u0004\u001a]\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u001f\"\u0004\b\u0000\u0010\u000e*\u00020\u00022\u0007\u0010\u009f\u0001\u001a\u00020\u000228\u0010\u000f\u001a4\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b3\u0012\t\b4\u0012\u0005\b\b( \u0001\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b3\u0012\t\b4\u0012\u0005\b\b(¡\u0001\u0012\u0004\u0012\u0002H\u000e02H\u0086\b\u001a\u001f\u0010¢\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00100\u001f*\u00020\u0002H\u0007\u001aT\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u000228\u0010\u000f\u001a4\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b3\u0012\t\b4\u0012\u0005\b\b( \u0001\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b3\u0012\t\b4\u0012\u0005\b\b(¡\u0001\u0012\u0004\u0012\u0002H#02H\u0087\b¨\u0006£\u0001" }, d2 = { "all", "", "", "predicate", "Lkotlin/Function1;", "", "any", "asIterable", "", "asSequence", "Lkotlin/sequences/Sequence;", "associate", "", "K", "V", "transform", "Lkotlin/Pair;", "associateBy", "keySelector", "valueTransform", "associateByTo", "M", "", "destination", "(Ljava/lang/CharSequence;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "(Ljava/lang/CharSequence;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "associateTo", "associateWith", "valueSelector", "associateWithTo", "chunked", "", "", "size", "", "R", "chunkedSequence", "count", "drop", "n", "dropLast", "dropLastWhile", "dropWhile", "elementAtOrElse", "index", "defaultValue", "elementAtOrNull", "(Ljava/lang/CharSequence;I)Ljava/lang/Character;", "filter", "filterIndexed", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "filterIndexedTo", "C", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "(Ljava/lang/CharSequence;Ljava/lang/Appendable;Lkotlin/jvm/functions/Function2;)Ljava/lang/Appendable;", "filterNot", "filterNotTo", "(Ljava/lang/CharSequence;Ljava/lang/Appendable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "filterTo", "find", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Character;", "findLast", "first", "firstOrNull", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "flatMap", "flatMapTo", "", "(Ljava/lang/CharSequence;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "fold", "initial", "operation", "acc", "(Ljava/lang/CharSequence;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/CharSequence;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "", "action", "forEachIndexed", "getOrElse", "getOrNull", "groupBy", "groupByTo", "", "groupingBy", "Lkotlin/collections/Grouping;", "indexOfFirst", "indexOfLast", "last", "lastOrNull", "map", "mapIndexed", "mapIndexedNotNull", "", "mapIndexedNotNullTo", "(Ljava/lang/CharSequence;Ljava/util/Collection;Lkotlin/jvm/functions/Function2;)Ljava/util/Collection;", "mapIndexedTo", "mapNotNull", "mapNotNullTo", "mapTo", "max", "maxBy", "", "selector", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/CharSequence;Ljava/util/Comparator;)Ljava/lang/Character;", "min", "minBy", "minWith", "none", "onEach", "S", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;", "partition", "random", "Lkotlin/random/Random;", "reduce", "reduceIndexed", "reduceRight", "reduceRightIndexed", "reversed", "single", "singleOrNull", "slice", "indices", "Lkotlin/ranges/IntRange;", "sumBy", "sumByDouble", "", "take", "takeLast", "takeLastWhile", "takeWhile", "toCollection", "(Ljava/lang/CharSequence;Ljava/util/Collection;)Ljava/util/Collection;", "toHashSet", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "toList", "toMutableList", "toSet", "", "windowed", "step", "partialWindows", "windowedSequence", "withIndex", "Lkotlin/collections/IndexedValue;", "zip", "other", "a", "b", "zipWithNext", "kotlin-stdlib" }, xs = "kotlin/text/StringsKt")
class StringsKt___StringsKt extends StringsKt___StringsJvmKt
{
    @InlineOnly
    private static final char elementAtOrElse(@NotNull final CharSequence $this$elementAtOrElse, final int index, final Function1<? super Integer, Character> defaultValue) {
        final int $i$f$elementAtOrElse = 0;
        return (index >= 0 && index <= StringsKt__StringsKt.getLastIndex($this$elementAtOrElse)) ? $this$elementAtOrElse.charAt(index) : defaultValue.invoke(index);
    }
    
    @InlineOnly
    private static final Character elementAtOrNull(@NotNull final CharSequence $this$elementAtOrNull, final int index) {
        final int $i$f$elementAtOrNull = 0;
        return getOrNull($this$elementAtOrNull, index);
    }
    
    @InlineOnly
    private static final Character find(@NotNull final CharSequence $this$find, final Function1<? super Character, Boolean> predicate) {
        final int $i$f$find = 0;
        final CharSequence $this$firstOrNull$iv = $this$find;
        final int $i$f$firstOrNull = 0;
        final CharSequence charSequence = $this$firstOrNull$iv;
        for (int i = 0; i < charSequence.length(); ++i) {
            final char element$iv = charSequence.charAt(i);
            if (predicate.invoke(element$iv)) {
                return element$iv;
            }
        }
        return null;
    }
    
    @InlineOnly
    private static final Character findLast(@NotNull final CharSequence $this$findLast, final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$findLast */
        //     3: aload_0         /* $this$findLast */
        //     4: astore_3        /* $this$lastOrNull$iv */
        //     5: iconst_0       
        //     6: istore          $i$f$lastOrNull
        //     8: aload_3         /* $this$lastOrNull$iv */
        //     9: invokeinterface java/lang/CharSequence.length:()I
        //    14: istore          5
        //    16: iinc            5, -1
        //    19: iconst_0       
        //    20: istore          6
        //    22: iload           5
        //    24: iflt            71
        //    27: aload_3         /* $this$lastOrNull$iv */
        //    28: iload           index$iv
        //    30: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    35: istore          element$iv
        //    37: aload_1         /* predicate */
        //    38: iload           element$iv
        //    40: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    43: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    48: checkcast       Ljava/lang/Boolean;
        //    51: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    54: ifeq            65
        //    57: iload           element$iv
        //    59: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    62: goto            72
        //    65: iinc            index$iv, -1
        //    68: goto            22
        //    71: aconst_null    
        //    72: areturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)Ljava/lang/Character;
        //    StackMapTable: 00 04 FF 00 16 00 07 07 00 BF 07 00 CB 01 07 00 BF 01 01 01 00 00 FC 00 2A 01 FA 00 05 40 07 00 D1
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final char first(@NotNull final CharSequence $this$first) {
        Intrinsics.checkParameterIsNotNull($this$first, "$this$first");
        if ($this$first.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return $this$first.charAt(0);
    }
    
    public static final char first(@NotNull final CharSequence $this$first, @NotNull final Function1<? super Character, Boolean> predicate) {
        final int $i$f$first = 0;
        Intrinsics.checkParameterIsNotNull($this$first, "$this$first");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for (int i = 0; i < $this$first.length(); ++i) {
            final char element = $this$first.charAt(i);
            if (predicate.invoke(element)) {
                return element;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }
    
    @Nullable
    public static final Character firstOrNull(@NotNull final CharSequence $this$firstOrNull) {
        Intrinsics.checkParameterIsNotNull($this$firstOrNull, "$this$firstOrNull");
        return ($this$firstOrNull.length() == 0) ? null : Character.valueOf($this$firstOrNull.charAt(0));
    }
    
    @Nullable
    public static final Character firstOrNull(@NotNull final CharSequence $this$firstOrNull, @NotNull final Function1<? super Character, Boolean> predicate) {
        final int $i$f$firstOrNull = 0;
        Intrinsics.checkParameterIsNotNull($this$firstOrNull, "$this$firstOrNull");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for (int i = 0; i < $this$firstOrNull.length(); ++i) {
            final char element = $this$firstOrNull.charAt(i);
            if (predicate.invoke(element)) {
                return element;
            }
        }
        return null;
    }
    
    @InlineOnly
    private static final char getOrElse(@NotNull final CharSequence $this$getOrElse, final int index, final Function1<? super Integer, Character> defaultValue) {
        final int $i$f$getOrElse = 0;
        return (index >= 0 && index <= StringsKt__StringsKt.getLastIndex($this$getOrElse)) ? $this$getOrElse.charAt(index) : defaultValue.invoke(index);
    }
    
    @Nullable
    public static final Character getOrNull(@NotNull final CharSequence $this$getOrNull, final int index) {
        Intrinsics.checkParameterIsNotNull($this$getOrNull, "$this$getOrNull");
        return (index >= 0 && index <= StringsKt__StringsKt.getLastIndex($this$getOrNull)) ? Character.valueOf($this$getOrNull.charAt(index)) : null;
    }
    
    public static final int indexOfFirst(@NotNull final CharSequence $this$indexOfFirst, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$indexOfFirst */
        //     3: aload_0         /* $this$indexOfFirst */
        //     4: ldc_w           "$this$indexOfFirst"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: iconst_0       
        //    18: istore_3       
        //    19: aload_0         /* $this$indexOfFirst */
        //    20: invokeinterface java/lang/CharSequence.length:()I
        //    25: istore          4
        //    27: iload_3        
        //    28: iload           4
        //    30: if_icmpge       66
        //    33: aload_1         /* predicate */
        //    34: aload_0         /* $this$indexOfFirst */
        //    35: iload_3         /* index */
        //    36: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    41: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    44: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    49: checkcast       Ljava/lang/Boolean;
        //    52: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    55: ifeq            60
        //    58: iload_3         /* index */
        //    59: ireturn        
        //    60: iinc            index, 1
        //    63: goto            27
        //    66: iconst_m1      
        //    67: ireturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)I
        //    StackMapTable: 00 03 FE 00 1B 01 01 01 20 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final int indexOfLast(@NotNull final CharSequence $this$indexOfLast, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$indexOfLast */
        //     3: aload_0         /* $this$indexOfLast */
        //     4: ldc_w           "$this$indexOfLast"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$indexOfLast */
        //    18: invokeinterface java/lang/CharSequence.length:()I
        //    23: istore_3       
        //    24: iinc            3, -1
        //    27: iconst_0       
        //    28: istore          4
        //    30: iload_3        
        //    31: iflt            67
        //    34: aload_1         /* predicate */
        //    35: aload_0         /* $this$indexOfLast */
        //    36: iload_3         /* index */
        //    37: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    42: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    45: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    50: checkcast       Ljava/lang/Boolean;
        //    53: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    56: ifeq            61
        //    59: iload_3         /* index */
        //    60: ireturn        
        //    61: iinc            index, -1
        //    64: goto            30
        //    67: iconst_m1      
        //    68: ireturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)I
        //    StackMapTable: 00 03 FE 00 1E 01 01 01 1E 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final char last(@NotNull final CharSequence $this$last) {
        Intrinsics.checkParameterIsNotNull($this$last, "$this$last");
        if ($this$last.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return $this$last.charAt(StringsKt__StringsKt.getLastIndex($this$last));
    }
    
    public static final char last(@NotNull final CharSequence $this$last, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$last */
        //     3: aload_0         /* $this$last */
        //     4: ldc_w           "$this$last"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$last */
        //    18: invokeinterface java/lang/CharSequence.length:()I
        //    23: istore_3       
        //    24: iinc            3, -1
        //    27: iconst_0       
        //    28: istore          4
        //    30: iload_3        
        //    31: iflt            72
        //    34: aload_0         /* $this$last */
        //    35: iload_3         /* index */
        //    36: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    41: istore          element
        //    43: aload_1         /* predicate */
        //    44: iload           element
        //    46: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    49: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    54: checkcast       Ljava/lang/Boolean;
        //    57: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    60: ifeq            66
        //    63: iload           element
        //    65: ireturn        
        //    66: iinc            index, -1
        //    69: goto            30
        //    72: new             Ljava/util/NoSuchElementException;
        //    75: dup            
        //    76: ldc_w           "Char sequence contains no character matching the predicate."
        //    79: invokespecial   java/util/NoSuchElementException.<init>:(Ljava/lang/String;)V
        //    82: checkcast       Ljava/lang/Throwable;
        //    85: athrow         
        //    Signature:
        //  (Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)C
        //    StackMapTable: 00 03 FE 00 1E 01 01 01 FC 00 23 01 FA 00 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Nullable
    public static final Character lastOrNull(@NotNull final CharSequence $this$lastOrNull) {
        Intrinsics.checkParameterIsNotNull($this$lastOrNull, "$this$lastOrNull");
        return ($this$lastOrNull.length() == 0) ? null : Character.valueOf($this$lastOrNull.charAt($this$lastOrNull.length() - 1));
    }
    
    @Nullable
    public static final Character lastOrNull(@NotNull final CharSequence $this$lastOrNull, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$lastOrNull */
        //     3: aload_0         /* $this$lastOrNull */
        //     4: ldc_w           "$this$lastOrNull"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$lastOrNull */
        //    18: invokeinterface java/lang/CharSequence.length:()I
        //    23: istore_3       
        //    24: iinc            3, -1
        //    27: iconst_0       
        //    28: istore          4
        //    30: iload_3        
        //    31: iflt            75
        //    34: aload_0         /* $this$lastOrNull */
        //    35: iload_3         /* index */
        //    36: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    41: istore          element
        //    43: aload_1         /* predicate */
        //    44: iload           element
        //    46: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    49: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    54: checkcast       Ljava/lang/Boolean;
        //    57: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    60: ifeq            69
        //    63: iload           element
        //    65: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    68: areturn        
        //    69: iinc            index, -1
        //    72: goto            30
        //    75: aconst_null    
        //    76: areturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)Ljava/lang/Character;
        //    StackMapTable: 00 03 FE 00 1E 01 01 01 FC 00 26 01 FA 00 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char random(@NotNull final CharSequence $this$random) {
        final int $i$f$random = 0;
        return random($this$random, Random.Default);
    }
    
    @SinceKotlin(version = "1.3")
    public static final char random(@NotNull final CharSequence $this$random, @NotNull final Random random) {
        Intrinsics.checkParameterIsNotNull($this$random, "$this$random");
        Intrinsics.checkParameterIsNotNull(random, "random");
        if ($this$random.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return $this$random.charAt(random.nextInt($this$random.length()));
    }
    
    public static final char single(@NotNull final CharSequence $this$single) {
        Intrinsics.checkParameterIsNotNull($this$single, "$this$single");
        switch ($this$single.length()) {
            case 0: {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            case 1: {
                return $this$single.charAt(0);
            }
            default: {
                throw new IllegalArgumentException("Char sequence has more than one element.");
            }
        }
    }
    
    public static final char single(@NotNull final CharSequence $this$single, @NotNull final Function1<? super Character, Boolean> predicate) {
        final int $i$f$single = 0;
        Intrinsics.checkParameterIsNotNull($this$single, "$this$single");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Character single = null;
        boolean found = false;
        for (int i = 0; i < $this$single.length(); ++i) {
            final char element = $this$single.charAt(i);
            if (predicate.invoke(element)) {
                if (found) {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
                single = element;
                found = true;
            }
        }
        if (!found) {
            throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
        }
        final Character c = single;
        if (c == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Char");
        }
        return c;
    }
    
    @Nullable
    public static final Character singleOrNull(@NotNull final CharSequence $this$singleOrNull) {
        Intrinsics.checkParameterIsNotNull($this$singleOrNull, "$this$singleOrNull");
        return ($this$singleOrNull.length() == 1) ? Character.valueOf($this$singleOrNull.charAt(0)) : null;
    }
    
    @Nullable
    public static final Character singleOrNull(@NotNull final CharSequence $this$singleOrNull, @NotNull final Function1<? super Character, Boolean> predicate) {
        final int $i$f$singleOrNull = 0;
        Intrinsics.checkParameterIsNotNull($this$singleOrNull, "$this$singleOrNull");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Character single = null;
        boolean found = false;
        for (int i = 0; i < $this$singleOrNull.length(); ++i) {
            final char element = $this$singleOrNull.charAt(i);
            if (predicate.invoke(element)) {
                if (found) {
                    return null;
                }
                single = element;
                found = true;
            }
        }
        if (!found) {
            return null;
        }
        return single;
    }
    
    @NotNull
    public static final CharSequence drop(@NotNull final CharSequence $this$drop, final int n) {
        Intrinsics.checkParameterIsNotNull($this$drop, "$this$drop");
        if (n < 0) {
            final int n2 = 0;
            throw new IllegalArgumentException(("Requested character count " + n + " is less than zero.").toString());
        }
        return $this$drop.subSequence(RangesKt___RangesKt.coerceAtMost(n, $this$drop.length()), $this$drop.length());
    }
    
    @NotNull
    public static final String drop(@NotNull final String $this$drop, final int n) {
        Intrinsics.checkParameterIsNotNull($this$drop, "$this$drop");
        if (n < 0) {
            final int n2 = 0;
            throw new IllegalArgumentException(("Requested character count " + n + " is less than zero.").toString());
        }
        final String substring = $this$drop.substring(RangesKt___RangesKt.coerceAtMost(n, $this$drop.length()));
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }
    
    @NotNull
    public static final CharSequence dropLast(@NotNull final CharSequence $this$dropLast, final int n) {
        Intrinsics.checkParameterIsNotNull($this$dropLast, "$this$dropLast");
        if (n < 0) {
            final int n2 = 0;
            throw new IllegalArgumentException(("Requested character count " + n + " is less than zero.").toString());
        }
        return take($this$dropLast, RangesKt___RangesKt.coerceAtLeast($this$dropLast.length() - n, 0));
    }
    
    @NotNull
    public static final String dropLast(@NotNull final String $this$dropLast, final int n) {
        Intrinsics.checkParameterIsNotNull($this$dropLast, "$this$dropLast");
        if (n < 0) {
            final int n2 = 0;
            throw new IllegalArgumentException(("Requested character count " + n + " is less than zero.").toString());
        }
        return take($this$dropLast, RangesKt___RangesKt.coerceAtLeast($this$dropLast.length() - n, 0));
    }
    
    @NotNull
    public static final CharSequence dropLastWhile(@NotNull final CharSequence $this$dropLastWhile, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$dropLastWhile */
        //     3: aload_0         /* $this$dropLastWhile */
        //     4: ldc_w           "$this$dropLastWhile"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$dropLastWhile */
        //    18: invokestatic    kotlin/text/StringsKt.getLastIndex:(Ljava/lang/CharSequence;)I
        //    21: istore_3       
        //    22: iconst_0       
        //    23: istore          4
        //    25: iload_3        
        //    26: iflt            71
        //    29: aload_1         /* predicate */
        //    30: aload_0         /* $this$dropLastWhile */
        //    31: iload_3         /* index */
        //    32: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    37: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    40: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    45: checkcast       Ljava/lang/Boolean;
        //    48: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    51: ifne            65
        //    54: aload_0         /* $this$dropLastWhile */
        //    55: iconst_0       
        //    56: iload_3         /* index */
        //    57: iconst_1       
        //    58: iadd           
        //    59: invokeinterface java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
        //    64: areturn        
        //    65: iinc            index, -1
        //    68: goto            25
        //    71: ldc_w           ""
        //    74: checkcast       Ljava/lang/CharSequence;
        //    77: areturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)Ljava/lang/CharSequence;
        //    StackMapTable: 00 03 FE 00 19 01 01 01 27 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final String dropLastWhile(@NotNull final String $this$dropLastWhile, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$dropLastWhile */
        //     3: aload_0         /* $this$dropLastWhile */
        //     4: ldc_w           "$this$dropLastWhile"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$dropLastWhile */
        //    18: checkcast       Ljava/lang/CharSequence;
        //    21: invokestatic    kotlin/text/StringsKt.getLastIndex:(Ljava/lang/CharSequence;)I
        //    24: istore_3       
        //    25: iconst_0       
        //    26: istore          4
        //    28: iload_3        
        //    29: iflt            92
        //    32: aload_1         /* predicate */
        //    33: aload_0         /* $this$dropLastWhile */
        //    34: iload_3         /* index */
        //    35: invokevirtual   java/lang/String.charAt:(I)C
        //    38: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    41: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    46: checkcast       Ljava/lang/Boolean;
        //    49: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    52: ifne            86
        //    55: aload_0         /* $this$dropLastWhile */
        //    56: astore          5
        //    58: iconst_0       
        //    59: istore          6
        //    61: iload_3         /* index */
        //    62: iconst_1       
        //    63: iadd           
        //    64: istore          7
        //    66: iconst_0       
        //    67: istore          8
        //    69: aload           5
        //    71: iload           6
        //    73: iload           7
        //    75: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    78: dup            
        //    79: ldc_w           "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
        //    82: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    85: areturn        
        //    86: iinc            index, -1
        //    89: goto            28
        //    92: ldc_w           ""
        //    95: areturn        
        //    Signature:
        //  (Ljava/lang/String;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)Ljava/lang/String;
        //    StackMapTable: 00 03 FE 00 1C 01 01 01 39 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final CharSequence dropWhile(@NotNull final CharSequence $this$dropWhile, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$dropWhile */
        //     3: aload_0         /* $this$dropWhile */
        //     4: ldc_w           "$this$dropWhile"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: iconst_0       
        //    18: istore_3       
        //    19: aload_0         /* $this$dropWhile */
        //    20: invokeinterface java/lang/CharSequence.length:()I
        //    25: istore          4
        //    27: iload_3        
        //    28: iload           4
        //    30: if_icmpge       78
        //    33: aload_1         /* predicate */
        //    34: aload_0         /* $this$dropWhile */
        //    35: iload_3         /* index */
        //    36: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    41: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    44: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    49: checkcast       Ljava/lang/Boolean;
        //    52: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    55: ifne            72
        //    58: aload_0         /* $this$dropWhile */
        //    59: iload_3         /* index */
        //    60: aload_0         /* $this$dropWhile */
        //    61: invokeinterface java/lang/CharSequence.length:()I
        //    66: invokeinterface java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
        //    71: areturn        
        //    72: iinc            index, 1
        //    75: goto            27
        //    78: ldc_w           ""
        //    81: checkcast       Ljava/lang/CharSequence;
        //    84: areturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)Ljava/lang/CharSequence;
        //    StackMapTable: 00 03 FE 00 1B 01 01 01 2C 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final String dropWhile(@NotNull final String $this$dropWhile, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$dropWhile */
        //     3: aload_0         /* $this$dropWhile */
        //     4: ldc_w           "$this$dropWhile"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: iconst_0       
        //    18: istore_3       
        //    19: aload_0         /* $this$dropWhile */
        //    20: checkcast       Ljava/lang/CharSequence;
        //    23: invokeinterface java/lang/CharSequence.length:()I
        //    28: istore          4
        //    30: iload_3        
        //    31: iload           4
        //    33: if_icmpge       85
        //    36: aload_1         /* predicate */
        //    37: aload_0         /* $this$dropWhile */
        //    38: iload_3         /* index */
        //    39: invokevirtual   java/lang/String.charAt:(I)C
        //    42: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    45: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    50: checkcast       Ljava/lang/Boolean;
        //    53: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    56: ifne            79
        //    59: aload_0         /* $this$dropWhile */
        //    60: astore          5
        //    62: iconst_0       
        //    63: istore          6
        //    65: aload           5
        //    67: iload_3         /* index */
        //    68: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    71: dup            
        //    72: ldc_w           "(this as java.lang.String).substring(startIndex)"
        //    75: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    78: areturn        
        //    79: iinc            index, 1
        //    82: goto            30
        //    85: ldc_w           ""
        //    88: areturn        
        //    Signature:
        //  (Ljava/lang/String;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)Ljava/lang/String;
        //    StackMapTable: 00 03 FE 00 1E 01 01 01 30 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final CharSequence filter(@NotNull final CharSequence $this$filter, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$filter */
        //     3: aload_0         /* $this$filter */
        //     4: ldc_w           "$this$filter"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$filter */
        //    18: astore_3       
        //    19: new             Ljava/lang/StringBuilder;
        //    22: dup            
        //    23: invokespecial   java/lang/StringBuilder.<init>:()V
        //    26: checkcast       Ljava/lang/Appendable;
        //    29: astore          destination$iv
        //    31: iconst_0       
        //    32: istore          $i$f$filterTo
        //    34: iconst_0       
        //    35: istore          6
        //    37: aload_3         /* $this$filterTo$iv */
        //    38: invokeinterface java/lang/CharSequence.length:()I
        //    43: istore          7
        //    45: iload           6
        //    47: iload           7
        //    49: if_icmpge       98
        //    52: aload_3         /* $this$filterTo$iv */
        //    53: iload           index$iv
        //    55: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    60: istore          element$iv
        //    62: aload_1         /* predicate */
        //    63: iload           element$iv
        //    65: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    68: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    73: checkcast       Ljava/lang/Boolean;
        //    76: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    79: ifeq            92
        //    82: aload           destination$iv
        //    84: iload           element$iv
        //    86: invokeinterface java/lang/Appendable.append:(C)Ljava/lang/Appendable;
        //    91: pop            
        //    92: iinc            index$iv, 1
        //    95: goto            45
        //    98: aload           destination$iv
        //   100: checkcast       Ljava/lang/CharSequence;
        //   103: areturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)Ljava/lang/CharSequence;
        //    StackMapTable: 00 03 FF 00 2D 00 08 07 00 BF 07 00 CB 01 07 00 BF 07 01 9B 01 01 01 00 00 FC 00 2E 01 FA 00 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final String filter(@NotNull final String $this$filter, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$filter */
        //     3: aload_0         /* $this$filter */
        //     4: ldc_w           "$this$filter"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$filter */
        //    18: checkcast       Ljava/lang/CharSequence;
        //    21: astore_3       
        //    22: new             Ljava/lang/StringBuilder;
        //    25: dup            
        //    26: invokespecial   java/lang/StringBuilder.<init>:()V
        //    29: checkcast       Ljava/lang/Appendable;
        //    32: astore          destination$iv
        //    34: iconst_0       
        //    35: istore          $i$f$filterTo
        //    37: iconst_0       
        //    38: istore          6
        //    40: aload_3         /* $this$filterTo$iv */
        //    41: invokeinterface java/lang/CharSequence.length:()I
        //    46: istore          7
        //    48: iload           6
        //    50: iload           7
        //    52: if_icmpge       101
        //    55: aload_3         /* $this$filterTo$iv */
        //    56: iload           index$iv
        //    58: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    63: istore          element$iv
        //    65: aload_1         /* predicate */
        //    66: iload           element$iv
        //    68: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    71: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    76: checkcast       Ljava/lang/Boolean;
        //    79: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    82: ifeq            95
        //    85: aload           destination$iv
        //    87: iload           element$iv
        //    89: invokeinterface java/lang/Appendable.append:(C)Ljava/lang/Appendable;
        //    94: pop            
        //    95: iinc            index$iv, 1
        //    98: goto            48
        //   101: aload           destination$iv
        //   103: checkcast       Ljava/lang/StringBuilder;
        //   106: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   109: dup            
        //   110: ldc_w           "filterTo(StringBuilder(), predicate).toString()"
        //   113: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   116: areturn        
        //    Signature:
        //  (Ljava/lang/String;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)Ljava/lang/String;
        //    StackMapTable: 00 03 FF 00 30 00 08 07 01 72 07 00 CB 01 07 00 BF 07 01 9B 01 01 01 00 00 FC 00 2E 01 FA 00 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final CharSequence filterIndexed(@NotNull final CharSequence $this$filterIndexed, @NotNull final Function2<? super Integer, ? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$filterIndexed */
        //     3: aload_0         /* $this$filterIndexed */
        //     4: ldc_w           "$this$filterIndexed"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$filterIndexed */
        //    18: astore_3       
        //    19: new             Ljava/lang/StringBuilder;
        //    22: dup            
        //    23: invokespecial   java/lang/StringBuilder.<init>:()V
        //    26: checkcast       Ljava/lang/Appendable;
        //    29: astore          destination$iv
        //    31: iconst_0       
        //    32: istore          $i$f$filterIndexedTo
        //    34: aload_3         /* $this$filterIndexedTo$iv */
        //    35: astore          $this$forEachIndexed$iv$iv
        //    37: iconst_0       
        //    38: istore          $i$f$forEachIndexed
        //    40: iconst_0       
        //    41: istore          index$iv$iv
        //    43: aload           $this$forEachIndexed$iv$iv
        //    45: astore          9
        //    47: iconst_0       
        //    48: istore          10
        //    50: iload           10
        //    52: aload           9
        //    54: invokeinterface java/lang/CharSequence.length:()I
        //    59: if_icmpge       128
        //    62: aload           9
        //    64: iload           10
        //    66: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    71: istore          item$iv$iv
        //    73: iload           index$iv$iv
        //    75: iinc            index$iv$iv, 1
        //    78: iload           item$iv$iv
        //    80: istore          12
        //    82: istore          index$iv
        //    84: iconst_0       
        //    85: istore          $i$a$-forEachIndexed-StringsKt___StringsKt$filterIndexedTo$1$iv
        //    87: aload_1         /* predicate */
        //    88: iload           index$iv
        //    90: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    93: iload           element$iv
        //    95: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    98: invokeinterface kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   103: checkcast       Ljava/lang/Boolean;
        //   106: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   109: ifeq            122
        //   112: aload           destination$iv
        //   114: iload           element$iv
        //   116: invokeinterface java/lang/Appendable.append:(C)Ljava/lang/Appendable;
        //   121: pop            
        //   122: iinc            10, 1
        //   125: goto            50
        //   128: nop            
        //   129: aload           destination$iv
        //   131: checkcast       Ljava/lang/CharSequence;
        //   134: areturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function2<-Ljava/lang/Integer;-Ljava/lang/Character;Ljava/lang/Boolean;>;)Ljava/lang/CharSequence;
        //    StackMapTable: 00 03 FF 00 32 00 0B 07 00 BF 07 01 A9 01 07 00 BF 07 01 9B 01 07 00 BF 01 01 07 00 BF 01 00 00 FF 00 47 00 0F 07 00 BF 07 01 A9 01 07 00 BF 07 01 9B 01 07 00 BF 01 01 07 00 BF 01 01 01 01 01 00 00 FF 00 05 00 0B 07 00 BF 07 01 A9 01 07 00 BF 07 01 9B 01 07 00 BF 01 01 07 00 BF 01 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final String filterIndexed(@NotNull final String $this$filterIndexed, @NotNull final Function2<? super Integer, ? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$filterIndexed */
        //     3: aload_0         /* $this$filterIndexed */
        //     4: ldc_w           "$this$filterIndexed"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$filterIndexed */
        //    18: checkcast       Ljava/lang/CharSequence;
        //    21: astore_3       
        //    22: new             Ljava/lang/StringBuilder;
        //    25: dup            
        //    26: invokespecial   java/lang/StringBuilder.<init>:()V
        //    29: checkcast       Ljava/lang/Appendable;
        //    32: astore          destination$iv
        //    34: iconst_0       
        //    35: istore          $i$f$filterIndexedTo
        //    37: aload_3         /* $this$filterIndexedTo$iv */
        //    38: astore          $this$forEachIndexed$iv$iv
        //    40: iconst_0       
        //    41: istore          $i$f$forEachIndexed
        //    43: iconst_0       
        //    44: istore          index$iv$iv
        //    46: aload           $this$forEachIndexed$iv$iv
        //    48: astore          9
        //    50: iconst_0       
        //    51: istore          10
        //    53: iload           10
        //    55: aload           9
        //    57: invokeinterface java/lang/CharSequence.length:()I
        //    62: if_icmpge       131
        //    65: aload           9
        //    67: iload           10
        //    69: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    74: istore          item$iv$iv
        //    76: iload           index$iv$iv
        //    78: iinc            index$iv$iv, 1
        //    81: iload           item$iv$iv
        //    83: istore          12
        //    85: istore          index$iv
        //    87: iconst_0       
        //    88: istore          $i$a$-forEachIndexed-StringsKt___StringsKt$filterIndexedTo$1$iv
        //    90: aload_1         /* predicate */
        //    91: iload           index$iv
        //    93: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    96: iload           element$iv
        //    98: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   101: invokeinterface kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   106: checkcast       Ljava/lang/Boolean;
        //   109: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   112: ifeq            125
        //   115: aload           destination$iv
        //   117: iload           element$iv
        //   119: invokeinterface java/lang/Appendable.append:(C)Ljava/lang/Appendable;
        //   124: pop            
        //   125: iinc            10, 1
        //   128: goto            53
        //   131: nop            
        //   132: aload           destination$iv
        //   134: checkcast       Ljava/lang/StringBuilder;
        //   137: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   140: dup            
        //   141: ldc_w           "filterIndexedTo(StringBu\u2026(), predicate).toString()"
        //   144: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   147: areturn        
        //    Signature:
        //  (Ljava/lang/String;Lkotlin/jvm/functions/Function2<-Ljava/lang/Integer;-Ljava/lang/Character;Ljava/lang/Boolean;>;)Ljava/lang/String;
        //    StackMapTable: 00 03 FF 00 35 00 0B 07 01 72 07 01 A9 01 07 00 BF 07 01 9B 01 07 00 BF 01 01 07 00 BF 01 00 00 FF 00 47 00 0F 07 01 72 07 01 A9 01 07 00 BF 07 01 9B 01 07 00 BF 01 01 07 00 BF 01 01 01 01 01 00 00 FF 00 05 00 0B 07 01 72 07 01 A9 01 07 00 BF 07 01 9B 01 07 00 BF 01 01 07 00 BF 01 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <C extends Appendable> C filterIndexedTo(@NotNull final CharSequence $this$filterIndexedTo, @NotNull final C destination, @NotNull final Function2<? super Integer, ? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_3        /* $i$f$filterIndexedTo */
        //     3: aload_0         /* $this$filterIndexedTo */
        //     4: ldc_w           "$this$filterIndexedTo"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* destination */
        //    11: ldc_w           "destination"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_2         /* predicate */
        //    18: ldc_w           "predicate"
        //    21: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    24: aload_0         /* $this$filterIndexedTo */
        //    25: astore          $this$forEachIndexed$iv
        //    27: iconst_0       
        //    28: istore          $i$f$forEachIndexed
        //    30: iconst_0       
        //    31: istore          index$iv
        //    33: aload           $this$forEachIndexed$iv
        //    35: astore          7
        //    37: iconst_0       
        //    38: istore          8
        //    40: iload           8
        //    42: aload           7
        //    44: invokeinterface java/lang/CharSequence.length:()I
        //    49: if_icmpge       117
        //    52: aload           7
        //    54: iload           8
        //    56: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    61: istore          item$iv
        //    63: iload           index$iv
        //    65: iinc            index$iv, 1
        //    68: iload           item$iv
        //    70: istore          10
        //    72: istore          index
        //    74: iconst_0       
        //    75: istore          $i$a$-forEachIndexed-StringsKt___StringsKt$filterIndexedTo$1
        //    77: aload_2         /* predicate */
        //    78: iload           index
        //    80: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    83: iload           element
        //    85: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    88: invokeinterface kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    93: checkcast       Ljava/lang/Boolean;
        //    96: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    99: ifeq            111
        //   102: aload_1         /* destination */
        //   103: iload           element
        //   105: invokeinterface java/lang/Appendable.append:(C)Ljava/lang/Appendable;
        //   110: pop            
        //   111: iinc            8, 1
        //   114: goto            40
        //   117: nop            
        //   118: aload_1         /* destination */
        //   119: areturn        
        //    Signature:
        //  <C::Ljava/lang/Appendable;>(Ljava/lang/CharSequence;TC;Lkotlin/jvm/functions/Function2<-Ljava/lang/Integer;-Ljava/lang/Character;Ljava/lang/Boolean;>;)TC;
        //    StackMapTable: 00 03 FF 00 28 00 09 07 00 BF 07 01 9B 07 01 A9 01 07 00 BF 01 01 07 00 BF 01 00 00 FF 00 46 00 0D 07 00 BF 07 01 9B 07 01 A9 01 07 00 BF 01 01 07 00 BF 01 01 01 01 01 00 00 FF 00 05 00 09 07 00 BF 07 01 9B 07 01 A9 01 07 00 BF 01 01 07 00 BF 01 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final CharSequence filterNot(@NotNull final CharSequence $this$filterNot, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$filterNot */
        //     3: aload_0         /* $this$filterNot */
        //     4: ldc_w           "$this$filterNot"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$filterNot */
        //    18: astore_3       
        //    19: new             Ljava/lang/StringBuilder;
        //    22: dup            
        //    23: invokespecial   java/lang/StringBuilder.<init>:()V
        //    26: checkcast       Ljava/lang/Appendable;
        //    29: astore          destination$iv
        //    31: iconst_0       
        //    32: istore          $i$f$filterNotTo
        //    34: aload_3         /* $this$filterNotTo$iv */
        //    35: astore          6
        //    37: iconst_0       
        //    38: istore          7
        //    40: iload           7
        //    42: aload           6
        //    44: invokeinterface java/lang/CharSequence.length:()I
        //    49: if_icmpge       99
        //    52: aload           6
        //    54: iload           7
        //    56: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    61: istore          element$iv
        //    63: aload_1         /* predicate */
        //    64: iload           element$iv
        //    66: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    69: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    74: checkcast       Ljava/lang/Boolean;
        //    77: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    80: ifne            93
        //    83: aload           destination$iv
        //    85: iload           element$iv
        //    87: invokeinterface java/lang/Appendable.append:(C)Ljava/lang/Appendable;
        //    92: pop            
        //    93: iinc            7, 1
        //    96: goto            40
        //    99: aload           destination$iv
        //   101: checkcast       Ljava/lang/CharSequence;
        //   104: areturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)Ljava/lang/CharSequence;
        //    StackMapTable: 00 03 FF 00 28 00 08 07 00 BF 07 00 CB 01 07 00 BF 07 01 9B 01 07 00 BF 01 00 00 FC 00 34 01 FA 00 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final String filterNot(@NotNull final String $this$filterNot, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$filterNot */
        //     3: aload_0         /* $this$filterNot */
        //     4: ldc_w           "$this$filterNot"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$filterNot */
        //    18: checkcast       Ljava/lang/CharSequence;
        //    21: astore_3       
        //    22: new             Ljava/lang/StringBuilder;
        //    25: dup            
        //    26: invokespecial   java/lang/StringBuilder.<init>:()V
        //    29: checkcast       Ljava/lang/Appendable;
        //    32: astore          destination$iv
        //    34: iconst_0       
        //    35: istore          $i$f$filterNotTo
        //    37: aload_3         /* $this$filterNotTo$iv */
        //    38: astore          6
        //    40: iconst_0       
        //    41: istore          7
        //    43: iload           7
        //    45: aload           6
        //    47: invokeinterface java/lang/CharSequence.length:()I
        //    52: if_icmpge       102
        //    55: aload           6
        //    57: iload           7
        //    59: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    64: istore          element$iv
        //    66: aload_1         /* predicate */
        //    67: iload           element$iv
        //    69: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    72: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    77: checkcast       Ljava/lang/Boolean;
        //    80: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    83: ifne            96
        //    86: aload           destination$iv
        //    88: iload           element$iv
        //    90: invokeinterface java/lang/Appendable.append:(C)Ljava/lang/Appendable;
        //    95: pop            
        //    96: iinc            7, 1
        //    99: goto            43
        //   102: aload           destination$iv
        //   104: checkcast       Ljava/lang/StringBuilder;
        //   107: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   110: dup            
        //   111: ldc_w           "filterNotTo(StringBuilder(), predicate).toString()"
        //   114: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   117: areturn        
        //    Signature:
        //  (Ljava/lang/String;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)Ljava/lang/String;
        //    StackMapTable: 00 03 FF 00 2B 00 08 07 01 72 07 00 CB 01 07 00 BF 07 01 9B 01 07 00 BF 01 00 00 FC 00 34 01 FA 00 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <C extends Appendable> C filterNotTo(@NotNull final CharSequence $this$filterNotTo, @NotNull final C destination, @NotNull final Function1<? super Character, Boolean> predicate) {
        final int $i$f$filterNotTo = 0;
        Intrinsics.checkParameterIsNotNull($this$filterNotTo, "$this$filterNotTo");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for (int i = 0; i < $this$filterNotTo.length(); ++i) {
            final char element = $this$filterNotTo.charAt(i);
            if (!predicate.invoke(element)) {
                destination.append(element);
            }
        }
        return destination;
    }
    
    @NotNull
    public static final <C extends Appendable> C filterTo(@NotNull final CharSequence $this$filterTo, @NotNull final C destination, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_3        /* $i$f$filterTo */
        //     3: aload_0         /* $this$filterTo */
        //     4: ldc_w           "$this$filterTo"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* destination */
        //    11: ldc_w           "destination"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_2         /* predicate */
        //    18: ldc_w           "predicate"
        //    21: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    24: iconst_0       
        //    25: istore          4
        //    27: aload_0         /* $this$filterTo */
        //    28: invokeinterface java/lang/CharSequence.length:()I
        //    33: istore          5
        //    35: iload           4
        //    37: iload           5
        //    39: if_icmpge       87
        //    42: aload_0         /* $this$filterTo */
        //    43: iload           index
        //    45: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    50: istore          element
        //    52: aload_2         /* predicate */
        //    53: iload           element
        //    55: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    58: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    63: checkcast       Ljava/lang/Boolean;
        //    66: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    69: ifeq            81
        //    72: aload_1         /* destination */
        //    73: iload           element
        //    75: invokeinterface java/lang/Appendable.append:(C)Ljava/lang/Appendable;
        //    80: pop            
        //    81: iinc            index, 1
        //    84: goto            35
        //    87: aload_1         /* destination */
        //    88: areturn        
        //    Signature:
        //  <C::Ljava/lang/Appendable;>(Ljava/lang/CharSequence;TC;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)TC;
        //    StackMapTable: 00 03 FE 00 23 01 01 01 FC 00 2D 01 FA 00 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final CharSequence slice(@NotNull final CharSequence $this$slice, @NotNull final IntRange indices) {
        Intrinsics.checkParameterIsNotNull($this$slice, "$this$slice");
        Intrinsics.checkParameterIsNotNull(indices, "indices");
        if (indices.isEmpty()) {
            return "";
        }
        return StringsKt__StringsKt.subSequence($this$slice, indices);
    }
    
    @NotNull
    public static final String slice(@NotNull final String $this$slice, @NotNull final IntRange indices) {
        Intrinsics.checkParameterIsNotNull($this$slice, "$this$slice");
        Intrinsics.checkParameterIsNotNull(indices, "indices");
        if (indices.isEmpty()) {
            return "";
        }
        return StringsKt__StringsKt.substring($this$slice, indices);
    }
    
    @NotNull
    public static final CharSequence slice(@NotNull final CharSequence $this$slice, @NotNull final Iterable<Integer> indices) {
        Intrinsics.checkParameterIsNotNull($this$slice, "$this$slice");
        Intrinsics.checkParameterIsNotNull(indices, "indices");
        final int size = CollectionsKt__IterablesKt.collectionSizeOrDefault((Iterable<?>)indices, 10);
        if (size == 0) {
            return "";
        }
        final StringBuilder result = new StringBuilder(size);
        final Iterator<? extends T> iterator = indices.iterator();
        while (iterator.hasNext()) {
            final int i = ((Number)iterator.next()).intValue();
            result.append($this$slice.charAt(i));
        }
        return result;
    }
    
    @InlineOnly
    private static final String slice(@NotNull final String $this$slice, final Iterable<Integer> indices) {
        final int $i$f$slice = 0;
        if ($this$slice == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        return slice((CharSequence)$this$slice, indices).toString();
    }
    
    @NotNull
    public static final CharSequence take(@NotNull final CharSequence $this$take, final int n) {
        Intrinsics.checkParameterIsNotNull($this$take, "$this$take");
        if (n < 0) {
            final int n2 = 0;
            throw new IllegalArgumentException(("Requested character count " + n + " is less than zero.").toString());
        }
        return $this$take.subSequence(0, RangesKt___RangesKt.coerceAtMost(n, $this$take.length()));
    }
    
    @NotNull
    public static final String take(@NotNull final String $this$take, final int n) {
        Intrinsics.checkParameterIsNotNull($this$take, "$this$take");
        if (n < 0) {
            final int n2 = 0;
            throw new IllegalArgumentException(("Requested character count " + n + " is less than zero.").toString());
        }
        final String substring = $this$take.substring(0, RangesKt___RangesKt.coerceAtMost(n, $this$take.length()));
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return substring;
    }
    
    @NotNull
    public static final CharSequence takeLast(@NotNull final CharSequence $this$takeLast, final int n) {
        Intrinsics.checkParameterIsNotNull($this$takeLast, "$this$takeLast");
        if (n < 0) {
            final int n2 = 0;
            throw new IllegalArgumentException(("Requested character count " + n + " is less than zero.").toString());
        }
        final int length = $this$takeLast.length();
        return $this$takeLast.subSequence(length - RangesKt___RangesKt.coerceAtMost(n, length), length);
    }
    
    @NotNull
    public static final String takeLast(@NotNull final String $this$takeLast, final int n) {
        Intrinsics.checkParameterIsNotNull($this$takeLast, "$this$takeLast");
        if (n < 0) {
            final int n2 = 0;
            throw new IllegalArgumentException(("Requested character count " + n + " is less than zero.").toString());
        }
        final int length = $this$takeLast.length();
        final String substring = $this$takeLast.substring(length - RangesKt___RangesKt.coerceAtMost(n, length));
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }
    
    @NotNull
    public static final CharSequence takeLastWhile(@NotNull final CharSequence $this$takeLastWhile, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$takeLastWhile */
        //     3: aload_0         /* $this$takeLastWhile */
        //     4: ldc_w           "$this$takeLastWhile"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$takeLastWhile */
        //    18: invokestatic    kotlin/text/StringsKt.getLastIndex:(Ljava/lang/CharSequence;)I
        //    21: istore_3       
        //    22: iconst_0       
        //    23: istore          4
        //    25: iload_3        
        //    26: iflt            76
        //    29: aload_1         /* predicate */
        //    30: aload_0         /* $this$takeLastWhile */
        //    31: iload_3         /* index */
        //    32: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    37: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    40: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    45: checkcast       Ljava/lang/Boolean;
        //    48: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    51: ifne            70
        //    54: aload_0         /* $this$takeLastWhile */
        //    55: iload_3         /* index */
        //    56: iconst_1       
        //    57: iadd           
        //    58: aload_0         /* $this$takeLastWhile */
        //    59: invokeinterface java/lang/CharSequence.length:()I
        //    64: invokeinterface java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
        //    69: areturn        
        //    70: iinc            index, -1
        //    73: goto            25
        //    76: aload_0         /* $this$takeLastWhile */
        //    77: iconst_0       
        //    78: aload_0         /* $this$takeLastWhile */
        //    79: invokeinterface java/lang/CharSequence.length:()I
        //    84: invokeinterface java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
        //    89: areturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)Ljava/lang/CharSequence;
        //    StackMapTable: 00 03 FE 00 19 01 01 01 2C 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final String takeLastWhile(@NotNull final String $this$takeLastWhile, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$takeLastWhile */
        //     3: aload_0         /* $this$takeLastWhile */
        //     4: ldc_w           "$this$takeLastWhile"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$takeLastWhile */
        //    18: checkcast       Ljava/lang/CharSequence;
        //    21: invokestatic    kotlin/text/StringsKt.getLastIndex:(Ljava/lang/CharSequence;)I
        //    24: istore_3       
        //    25: iconst_0       
        //    26: istore          4
        //    28: iload_3        
        //    29: iflt            87
        //    32: aload_1         /* predicate */
        //    33: aload_0         /* $this$takeLastWhile */
        //    34: iload_3         /* index */
        //    35: invokevirtual   java/lang/String.charAt:(I)C
        //    38: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    41: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    46: checkcast       Ljava/lang/Boolean;
        //    49: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    52: ifne            81
        //    55: aload_0         /* $this$takeLastWhile */
        //    56: astore          5
        //    58: iload_3         /* index */
        //    59: iconst_1       
        //    60: iadd           
        //    61: istore          6
        //    63: iconst_0       
        //    64: istore          7
        //    66: aload           5
        //    68: iload           6
        //    70: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    73: dup            
        //    74: ldc_w           "(this as java.lang.String).substring(startIndex)"
        //    77: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    80: areturn        
        //    81: iinc            index, -1
        //    84: goto            28
        //    87: aload_0         /* $this$takeLastWhile */
        //    88: areturn        
        //    Signature:
        //  (Ljava/lang/String;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)Ljava/lang/String;
        //    StackMapTable: 00 03 FE 00 1C 01 01 01 34 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final CharSequence takeWhile(@NotNull final CharSequence $this$takeWhile, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$takeWhile */
        //     3: aload_0         /* $this$takeWhile */
        //     4: ldc_w           "$this$takeWhile"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: iconst_0       
        //    18: istore_3       
        //    19: aload_0         /* $this$takeWhile */
        //    20: invokeinterface java/lang/CharSequence.length:()I
        //    25: istore          4
        //    27: iload_3        
        //    28: iload           4
        //    30: if_icmpge       73
        //    33: aload_1         /* predicate */
        //    34: aload_0         /* $this$takeWhile */
        //    35: iload_3         /* index */
        //    36: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    41: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    44: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    49: checkcast       Ljava/lang/Boolean;
        //    52: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    55: ifne            67
        //    58: aload_0         /* $this$takeWhile */
        //    59: iconst_0       
        //    60: iload_3         /* index */
        //    61: invokeinterface java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
        //    66: areturn        
        //    67: iinc            index, 1
        //    70: goto            27
        //    73: aload_0         /* $this$takeWhile */
        //    74: iconst_0       
        //    75: aload_0         /* $this$takeWhile */
        //    76: invokeinterface java/lang/CharSequence.length:()I
        //    81: invokeinterface java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
        //    86: areturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)Ljava/lang/CharSequence;
        //    StackMapTable: 00 03 FE 00 1B 01 01 01 27 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final String takeWhile(@NotNull final String $this$takeWhile, @NotNull final Function1<? super Character, Boolean> predicate) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$takeWhile */
        //     3: aload_0         /* $this$takeWhile */
        //     4: ldc_w           "$this$takeWhile"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* predicate */
        //    11: ldc_w           "predicate"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: iconst_0       
        //    18: istore_3       
        //    19: aload_0         /* $this$takeWhile */
        //    20: invokevirtual   java/lang/String.length:()I
        //    23: istore          4
        //    25: iload_3        
        //    26: iload           4
        //    28: if_icmpge       85
        //    31: aload_1         /* predicate */
        //    32: aload_0         /* $this$takeWhile */
        //    33: iload_3         /* index */
        //    34: invokevirtual   java/lang/String.charAt:(I)C
        //    37: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    40: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    45: checkcast       Ljava/lang/Boolean;
        //    48: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    51: ifne            79
        //    54: aload_0         /* $this$takeWhile */
        //    55: astore          5
        //    57: iconst_0       
        //    58: istore          6
        //    60: iconst_0       
        //    61: istore          7
        //    63: aload           5
        //    65: iload           6
        //    67: iload_3         /* index */
        //    68: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    71: dup            
        //    72: ldc_w           "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
        //    75: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    78: areturn        
        //    79: iinc            index, 1
        //    82: goto            25
        //    85: aload_0         /* $this$takeWhile */
        //    86: areturn        
        //    Signature:
        //  (Ljava/lang/String;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;Ljava/lang/Boolean;>;)Ljava/lang/String;
        //    StackMapTable: 00 03 FE 00 19 01 01 01 35 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final CharSequence reversed(@NotNull final CharSequence $this$reversed) {
        Intrinsics.checkParameterIsNotNull($this$reversed, "$this$reversed");
        final StringBuilder reverse = new StringBuilder($this$reversed).reverse();
        Intrinsics.checkExpressionValueIsNotNull(reverse, "StringBuilder(this).reverse()");
        return reverse;
    }
    
    @InlineOnly
    private static final String reversed(@NotNull final String $this$reversed) {
        final int $i$f$reversed = 0;
        if ($this$reversed == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        return reversed((CharSequence)$this$reversed).toString();
    }
    
    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull final CharSequence $this$associate, @NotNull final Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$associate */
        //     3: aload_0         /* $this$associate */
        //     4: ldc_w           "$this$associate"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* transform */
        //    11: ldc_w           "transform"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$associate */
        //    18: invokeinterface java/lang/CharSequence.length:()I
        //    23: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //    26: bipush          16
        //    28: invokestatic    kotlin/ranges/RangesKt.coerceAtLeast:(II)I
        //    31: istore_3        /* capacity */
        //    32: aload_0         /* $this$associate */
        //    33: astore          4
        //    35: new             Ljava/util/LinkedHashMap;
        //    38: dup            
        //    39: iload_3         /* capacity */
        //    40: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //    43: checkcast       Ljava/util/Map;
        //    46: astore          destination$iv
        //    48: iconst_0       
        //    49: istore          $i$f$associateTo
        //    51: aload           $this$associateTo$iv
        //    53: astore          7
        //    55: iconst_0       
        //    56: istore          8
        //    58: iload           8
        //    60: aload           7
        //    62: invokeinterface java/lang/CharSequence.length:()I
        //    67: if_icmpge       128
        //    70: aload           7
        //    72: iload           8
        //    74: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    79: istore          element$iv
        //    81: aload           destination$iv
        //    83: astore          10
        //    85: aload_1         /* transform */
        //    86: iload           element$iv
        //    88: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    91: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    96: checkcast       Lkotlin/Pair;
        //    99: astore          11
        //   101: iconst_0       
        //   102: istore          12
        //   104: aload           10
        //   106: aload           11
        //   108: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //   111: aload           11
        //   113: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //   116: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   121: pop            
        //   122: iinc            8, 1
        //   125: goto            58
        //   128: aload           destination$iv
        //   130: areturn        
        //    Signature:
        //  <K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;+Lkotlin/Pair<+TK;+TV;>;>;)Ljava/util/Map<TK;TV;>;
        //    StackMapTable: 00 02 FF 00 3A 00 09 07 00 BF 07 00 CB 01 01 07 00 BF 07 02 2E 01 07 00 BF 01 00 00 FB 00 45
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <K> Map<K, Character> associateBy(@NotNull final CharSequence $this$associateBy, @NotNull final Function1<? super Character, ? extends K> keySelector) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$associateBy */
        //     3: aload_0         /* $this$associateBy */
        //     4: ldc_w           "$this$associateBy"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* keySelector */
        //    11: ldc_w           "keySelector"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$associateBy */
        //    18: invokeinterface java/lang/CharSequence.length:()I
        //    23: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //    26: bipush          16
        //    28: invokestatic    kotlin/ranges/RangesKt.coerceAtLeast:(II)I
        //    31: istore_3        /* capacity */
        //    32: aload_0         /* $this$associateBy */
        //    33: astore          4
        //    35: new             Ljava/util/LinkedHashMap;
        //    38: dup            
        //    39: iload_3         /* capacity */
        //    40: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //    43: checkcast       Ljava/util/Map;
        //    46: astore          destination$iv
        //    48: iconst_0       
        //    49: istore          $i$f$associateByTo
        //    51: aload           $this$associateByTo$iv
        //    53: astore          7
        //    55: iconst_0       
        //    56: istore          8
        //    58: iload           8
        //    60: aload           7
        //    62: invokeinterface java/lang/CharSequence.length:()I
        //    67: if_icmpge       111
        //    70: aload           7
        //    72: iload           8
        //    74: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    79: istore          element$iv
        //    81: aload           destination$iv
        //    83: aload_1         /* keySelector */
        //    84: iload           element$iv
        //    86: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    89: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    94: iload           element$iv
        //    96: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    99: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   104: pop            
        //   105: iinc            8, 1
        //   108: goto            58
        //   111: aload           destination$iv
        //   113: areturn        
        //    Signature:
        //  <K:Ljava/lang/Object;>(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;+TK;>;)Ljava/util/Map<TK;Ljava/lang/Character;>;
        //    StackMapTable: 00 02 FF 00 3A 00 09 07 00 BF 07 00 CB 01 01 07 00 BF 07 02 2E 01 07 00 BF 01 00 00 34
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull final CharSequence $this$associateBy, @NotNull final Function1<? super Character, ? extends K> keySelector, @NotNull final Function1<? super Character, ? extends V> valueTransform) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_3        /* $i$f$associateBy */
        //     3: aload_0         /* $this$associateBy */
        //     4: ldc_w           "$this$associateBy"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* keySelector */
        //    11: ldc_w           "keySelector"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_2         /* valueTransform */
        //    18: ldc_w           "valueTransform"
        //    21: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    24: aload_0         /* $this$associateBy */
        //    25: invokeinterface java/lang/CharSequence.length:()I
        //    30: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //    33: bipush          16
        //    35: invokestatic    kotlin/ranges/RangesKt.coerceAtLeast:(II)I
        //    38: istore          capacity
        //    40: aload_0         /* $this$associateBy */
        //    41: astore          5
        //    43: new             Ljava/util/LinkedHashMap;
        //    46: dup            
        //    47: iload           capacity
        //    49: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //    52: checkcast       Ljava/util/Map;
        //    55: astore          destination$iv
        //    57: iconst_0       
        //    58: istore          $i$f$associateByTo
        //    60: aload           $this$associateByTo$iv
        //    62: astore          8
        //    64: iconst_0       
        //    65: istore          9
        //    67: iload           9
        //    69: aload           8
        //    71: invokeinterface java/lang/CharSequence.length:()I
        //    76: if_icmpge       126
        //    79: aload           8
        //    81: iload           9
        //    83: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    88: istore          element$iv
        //    90: aload           destination$iv
        //    92: aload_1         /* keySelector */
        //    93: iload           element$iv
        //    95: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    98: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   103: aload_2         /* valueTransform */
        //   104: iload           element$iv
        //   106: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   109: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   114: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   119: pop            
        //   120: iinc            9, 1
        //   123: goto            67
        //   126: aload           destination$iv
        //   128: areturn        
        //    Signature:
        //  <K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;+TK;>;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;+TV;>;)Ljava/util/Map<TK;TV;>;
        //    StackMapTable: 00 02 FF 00 43 00 0A 07 00 BF 07 00 CB 07 00 CB 01 01 07 00 BF 07 02 2E 01 07 00 BF 01 00 00 3A
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(@NotNull final CharSequence $this$associateByTo, @NotNull final M destination, @NotNull final Function1<? super Character, ? extends K> keySelector) {
        final int $i$f$associateByTo = 0;
        Intrinsics.checkParameterIsNotNull($this$associateByTo, "$this$associateByTo");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        for (int i = 0; i < $this$associateByTo.length(); ++i) {
            final char element = $this$associateByTo.charAt(i);
            ((Map<? super K, Character>)destination).put((Object)keySelector.invoke(element), Character.valueOf(element));
        }
        return destination;
    }
    
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull final CharSequence $this$associateByTo, @NotNull final M destination, @NotNull final Function1<? super Character, ? extends K> keySelector, @NotNull final Function1<? super Character, ? extends V> valueTransform) {
        final int $i$f$associateByTo = 0;
        Intrinsics.checkParameterIsNotNull($this$associateByTo, "$this$associateByTo");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Intrinsics.checkParameterIsNotNull(valueTransform, "valueTransform");
        for (int i = 0; i < $this$associateByTo.length(); ++i) {
            final char element = $this$associateByTo.charAt(i);
            destination.put((Object)keySelector.invoke(element), (Object)valueTransform.invoke(element));
        }
        return destination;
    }
    
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull final CharSequence $this$associateTo, @NotNull final M destination, @NotNull final Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        final int $i$f$associateTo = 0;
        Intrinsics.checkParameterIsNotNull($this$associateTo, "$this$associateTo");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        for (int i = 0; i < $this$associateTo.length(); ++i) {
            final char element = $this$associateTo.charAt(i);
            final Pair pair = (Pair)transform.invoke(element);
            destination.put(pair.getFirst(), (Object)pair.getSecond());
        }
        return destination;
    }
    
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <V> Map<Character, V> associateWith(@NotNull final CharSequence $this$associateWith, @NotNull final Function1<? super Character, ? extends V> valueSelector) {
        final int $i$f$associateWith = 0;
        Intrinsics.checkParameterIsNotNull($this$associateWith, "$this$associateWith");
        Intrinsics.checkParameterIsNotNull(valueSelector, "valueSelector");
        final LinkedHashMap result = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsKt.mapCapacity($this$associateWith.length()), 16));
        final CharSequence $this$associateWithTo$iv = $this$associateWith;
        final int $i$f$associateWithTo = 0;
        final CharSequence charSequence = $this$associateWithTo$iv;
        for (int i = 0; i < charSequence.length(); ++i) {
            final char element$iv = charSequence.charAt(i);
            result.put(element$iv, valueSelector.invoke(element$iv));
        }
        return (Map<Character, V>)result;
    }
    
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(@NotNull final CharSequence $this$associateWithTo, @NotNull final M destination, @NotNull final Function1<? super Character, ? extends V> valueSelector) {
        final int $i$f$associateWithTo = 0;
        Intrinsics.checkParameterIsNotNull($this$associateWithTo, "$this$associateWithTo");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(valueSelector, "valueSelector");
        for (int i = 0; i < $this$associateWithTo.length(); ++i) {
            final char element = $this$associateWithTo.charAt(i);
            ((Map<Character, ? super V>)destination).put(Character.valueOf(element), (Object)valueSelector.invoke(element));
        }
        return destination;
    }
    
    @NotNull
    public static final <C extends Collection<? super Character>> C toCollection(@NotNull final CharSequence $this$toCollection, @NotNull final C destination) {
        Intrinsics.checkParameterIsNotNull($this$toCollection, "$this$toCollection");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        for (int i = 0; i < $this$toCollection.length(); ++i) {
            final char item = $this$toCollection.charAt(i);
            ((Collection<Character>)destination).add(item);
        }
        return destination;
    }
    
    @NotNull
    public static final HashSet<Character> toHashSet(@NotNull final CharSequence $this$toHashSet) {
        Intrinsics.checkParameterIsNotNull($this$toHashSet, "$this$toHashSet");
        return toCollection($this$toHashSet, (HashSet<Character>)new HashSet<Object>(MapsKt__MapsKt.mapCapacity($this$toHashSet.length())));
    }
    
    @NotNull
    public static final List<Character> toList(@NotNull final CharSequence $this$toList) {
        Intrinsics.checkParameterIsNotNull($this$toList, "$this$toList");
        List<Character> list = null;
        switch ($this$toList.length()) {
            case 0: {
                list = CollectionsKt__CollectionsKt.emptyList();
                break;
            }
            case 1: {
                list = CollectionsKt__CollectionsJVMKt.listOf($this$toList.charAt(0));
                break;
            }
            default: {
                list = toMutableList($this$toList);
                break;
            }
        }
        return list;
    }
    
    @NotNull
    public static final List<Character> toMutableList(@NotNull final CharSequence $this$toMutableList) {
        Intrinsics.checkParameterIsNotNull($this$toMutableList, "$this$toMutableList");
        return toCollection($this$toMutableList, (List<Character>)new ArrayList<Object>($this$toMutableList.length()));
    }
    
    @NotNull
    public static final Set<Character> toSet(@NotNull final CharSequence $this$toSet) {
        Intrinsics.checkParameterIsNotNull($this$toSet, "$this$toSet");
        Set<Character> set = null;
        switch ($this$toSet.length()) {
            case 0: {
                set = SetsKt__SetsKt.emptySet();
                break;
            }
            case 1: {
                set = SetsKt__SetsJVMKt.setOf($this$toSet.charAt(0));
                break;
            }
            default: {
                set = toCollection($this$toSet, (LinkedHashSet<Character>)new LinkedHashSet<Object>(MapsKt__MapsKt.mapCapacity($this$toSet.length())));
                break;
            }
        }
        return set;
    }
    
    @NotNull
    public static final <R> List<R> flatMap(@NotNull final CharSequence $this$flatMap, @NotNull final Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$flatMap */
        //     3: aload_0         /* $this$flatMap */
        //     4: ldc_w           "$this$flatMap"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* transform */
        //    11: ldc_w           "transform"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$flatMap */
        //    18: astore_3       
        //    19: new             Ljava/util/ArrayList;
        //    22: dup            
        //    23: invokespecial   java/util/ArrayList.<init>:()V
        //    26: checkcast       Ljava/util/Collection;
        //    29: astore          destination$iv
        //    31: iconst_0       
        //    32: istore          $i$f$flatMapTo
        //    34: aload_3         /* $this$flatMapTo$iv */
        //    35: astore          6
        //    37: iconst_0       
        //    38: istore          7
        //    40: iload           7
        //    42: aload           6
        //    44: invokeinterface java/lang/CharSequence.length:()I
        //    49: if_icmpge       93
        //    52: aload           6
        //    54: iload           7
        //    56: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    61: istore          element$iv
        //    63: aload_1         /* transform */
        //    64: iload           element$iv
        //    66: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    69: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    74: checkcast       Ljava/lang/Iterable;
        //    77: astore          list$iv
        //    79: aload           destination$iv
        //    81: aload           list$iv
        //    83: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
        //    86: pop            
        //    87: iinc            7, 1
        //    90: goto            40
        //    93: aload           destination$iv
        //    95: checkcast       Ljava/util/List;
        //    98: areturn        
        //    Signature:
        //  <R:Ljava/lang/Object;>(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;+Ljava/lang/Iterable<+TR;>;>;)Ljava/util/List<TR;>;
        //    StackMapTable: 00 02 FF 00 28 00 08 07 00 BF 07 00 CB 01 07 00 BF 07 02 57 01 07 00 BF 01 00 00 34
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull final CharSequence $this$flatMapTo, @NotNull final C destination, @NotNull final Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        final int $i$f$flatMapTo = 0;
        Intrinsics.checkParameterIsNotNull($this$flatMapTo, "$this$flatMapTo");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        for (int i = 0; i < $this$flatMapTo.length(); ++i) {
            final char element = $this$flatMapTo.charAt(i);
            final Iterable list = (Iterable)transform.invoke(element);
            CollectionsKt__MutableCollectionsKt.addAll((Collection<? super Object>)destination, (Iterable<?>)list);
        }
        return destination;
    }
    
    @NotNull
    public static final <K> Map<K, List<Character>> groupBy(@NotNull final CharSequence $this$groupBy, @NotNull final Function1<? super Character, ? extends K> keySelector) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$groupBy */
        //     3: aload_0         /* $this$groupBy */
        //     4: ldc_w           "$this$groupBy"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* keySelector */
        //    11: ldc_w           "keySelector"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$groupBy */
        //    18: astore_3       
        //    19: new             Ljava/util/LinkedHashMap;
        //    22: dup            
        //    23: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    26: checkcast       Ljava/util/Map;
        //    29: astore          destination$iv
        //    31: iconst_0       
        //    32: istore          $i$f$groupByTo
        //    34: aload_3         /* $this$groupByTo$iv */
        //    35: astore          6
        //    37: iconst_0       
        //    38: istore          7
        //    40: iload           7
        //    42: aload           6
        //    44: invokeinterface java/lang/CharSequence.length:()I
        //    49: if_icmpge       155
        //    52: aload           6
        //    54: iload           7
        //    56: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    61: istore          element$iv
        //    63: aload_1         /* keySelector */
        //    64: iload           element$iv
        //    66: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    69: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    74: astore          key$iv
        //    76: aload           destination$iv
        //    78: astore          $this$getOrPut$iv$iv
        //    80: iconst_0       
        //    81: istore          $i$f$getOrPut
        //    83: aload           $this$getOrPut$iv$iv
        //    85: aload           key$iv
        //    87: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    92: astore          value$iv$iv
        //    94: aload           value$iv$iv
        //    96: ifnonnull       128
        //    99: iconst_0       
        //   100: istore          $i$a$-getOrPut-StringsKt___StringsKt$groupByTo$list$1$iv
        //   102: new             Ljava/util/ArrayList;
        //   105: dup            
        //   106: invokespecial   java/util/ArrayList.<init>:()V
        //   109: astore          answer$iv$iv
        //   111: aload           $this$getOrPut$iv$iv
        //   113: aload           key$iv
        //   115: aload           answer$iv$iv
        //   117: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   122: pop            
        //   123: aload           answer$iv$iv
        //   125: goto            130
        //   128: aload           value$iv$iv
        //   130: nop            
        //   131: checkcast       Ljava/util/List;
        //   134: astore          list$iv
        //   136: aload           list$iv
        //   138: iload           element$iv
        //   140: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   143: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   148: pop            
        //   149: iinc            7, 1
        //   152: goto            40
        //   155: aload           destination$iv
        //   157: areturn        
        //    Signature:
        //  <K:Ljava/lang/Object;>(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;+TK;>;)Ljava/util/Map<TK;Ljava/util/List<Ljava/lang/Character;>;>;
        //    StackMapTable: 00 04 FF 00 28 00 08 07 00 BF 07 00 CB 01 07 00 BF 07 02 2E 01 07 00 BF 01 00 00 FF 00 57 00 0D 07 00 BF 07 00 CB 01 07 00 BF 07 02 2E 01 07 00 BF 01 01 07 01 63 07 02 2E 01 07 01 63 00 00 41 07 01 63 FF 00 18 00 08 07 00 BF 07 00 CB 01 07 00 BF 07 02 2E 01 07 00 BF 01 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull final CharSequence $this$groupBy, @NotNull final Function1<? super Character, ? extends K> keySelector, @NotNull final Function1<? super Character, ? extends V> valueTransform) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_3        /* $i$f$groupBy */
        //     3: aload_0         /* $this$groupBy */
        //     4: ldc_w           "$this$groupBy"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* keySelector */
        //    11: ldc_w           "keySelector"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_2         /* valueTransform */
        //    18: ldc_w           "valueTransform"
        //    21: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    24: aload_0         /* $this$groupBy */
        //    25: astore          4
        //    27: new             Ljava/util/LinkedHashMap;
        //    30: dup            
        //    31: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    34: checkcast       Ljava/util/Map;
        //    37: astore          destination$iv
        //    39: iconst_0       
        //    40: istore          $i$f$groupByTo
        //    42: aload           $this$groupByTo$iv
        //    44: astore          7
        //    46: iconst_0       
        //    47: istore          8
        //    49: iload           8
        //    51: aload           7
        //    53: invokeinterface java/lang/CharSequence.length:()I
        //    58: if_icmpge       170
        //    61: aload           7
        //    63: iload           8
        //    65: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    70: istore          element$iv
        //    72: aload_1         /* keySelector */
        //    73: iload           element$iv
        //    75: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    78: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    83: astore          key$iv
        //    85: aload           destination$iv
        //    87: astore          $this$getOrPut$iv$iv
        //    89: iconst_0       
        //    90: istore          $i$f$getOrPut
        //    92: aload           $this$getOrPut$iv$iv
        //    94: aload           key$iv
        //    96: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   101: astore          value$iv$iv
        //   103: aload           value$iv$iv
        //   105: ifnonnull       137
        //   108: iconst_0       
        //   109: istore          $i$a$-getOrPut-StringsKt___StringsKt$groupByTo$list$2$iv
        //   111: new             Ljava/util/ArrayList;
        //   114: dup            
        //   115: invokespecial   java/util/ArrayList.<init>:()V
        //   118: astore          answer$iv$iv
        //   120: aload           $this$getOrPut$iv$iv
        //   122: aload           key$iv
        //   124: aload           answer$iv$iv
        //   126: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   131: pop            
        //   132: aload           answer$iv$iv
        //   134: goto            139
        //   137: aload           value$iv$iv
        //   139: nop            
        //   140: checkcast       Ljava/util/List;
        //   143: astore          list$iv
        //   145: aload           list$iv
        //   147: aload_2         /* valueTransform */
        //   148: iload           element$iv
        //   150: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   153: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   158: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   163: pop            
        //   164: iinc            8, 1
        //   167: goto            49
        //   170: aload           destination$iv
        //   172: areturn        
        //    Signature:
        //  <K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;+TK;>;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;+TV;>;)Ljava/util/Map<TK;Ljava/util/List<TV;>;>;
        //    StackMapTable: 00 04 FF 00 31 00 09 07 00 BF 07 00 CB 07 00 CB 01 07 00 BF 07 02 2E 01 07 00 BF 01 00 00 FF 00 57 00 0E 07 00 BF 07 00 CB 07 00 CB 01 07 00 BF 07 02 2E 01 07 00 BF 01 01 07 01 63 07 02 2E 01 07 01 63 00 00 41 07 01 63 FF 00 1E 00 09 07 00 BF 07 00 CB 07 00 CB 01 07 00 BF 07 02 2E 01 07 00 BF 01 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(@NotNull final CharSequence $this$groupByTo, @NotNull final M destination, @NotNull final Function1<? super Character, ? extends K> keySelector) {
        final int $i$f$groupByTo = 0;
        Intrinsics.checkParameterIsNotNull($this$groupByTo, "$this$groupByTo");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        for (int i = 0; i < $this$groupByTo.length(); ++i) {
            final char element = $this$groupByTo.charAt(i);
            final Object key = keySelector.invoke(element);
            final Map $this$getOrPut$iv = destination;
            final int $i$f$getOrPut = 0;
            final Object value$iv = $this$getOrPut$iv.get(key);
            Object o;
            if (value$iv == null) {
                final int n = 0;
                final Object answer$iv = new ArrayList();
                $this$getOrPut$iv.put(key, answer$iv);
                o = answer$iv;
            }
            else {
                o = value$iv;
            }
            final List list = (List)o;
            list.add(element);
        }
        return destination;
    }
    
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull final CharSequence $this$groupByTo, @NotNull final M destination, @NotNull final Function1<? super Character, ? extends K> keySelector, @NotNull final Function1<? super Character, ? extends V> valueTransform) {
        final int $i$f$groupByTo = 0;
        Intrinsics.checkParameterIsNotNull($this$groupByTo, "$this$groupByTo");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Intrinsics.checkParameterIsNotNull(valueTransform, "valueTransform");
        for (int i = 0; i < $this$groupByTo.length(); ++i) {
            final char element = $this$groupByTo.charAt(i);
            final Object key = keySelector.invoke(element);
            final Map $this$getOrPut$iv = destination;
            final int $i$f$getOrPut = 0;
            final Object value$iv = $this$getOrPut$iv.get(key);
            Object o;
            if (value$iv == null) {
                final int n = 0;
                final Object answer$iv = new ArrayList();
                $this$getOrPut$iv.put(key, answer$iv);
                o = answer$iv;
            }
            else {
                o = value$iv;
            }
            final List list = (List)o;
            list.add(valueTransform.invoke(element));
        }
        return destination;
    }
    
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <K> Grouping<Character, K> groupingBy(@NotNull final CharSequence $this$groupingBy, @NotNull final Function1<? super Character, ? extends K> keySelector) {
        final int $i$f$groupingBy = 0;
        Intrinsics.checkParameterIsNotNull($this$groupingBy, "$this$groupingBy");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        return (Grouping<Character, K>)new StringsKt___StringsKt$groupingBy.StringsKt___StringsKt$groupingBy$1($this$groupingBy, (Function1)keySelector);
    }
    
    @NotNull
    public static final <R> List<R> map(@NotNull final CharSequence $this$map, @NotNull final Function1<? super Character, ? extends R> transform) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$map */
        //     3: aload_0         /* $this$map */
        //     4: ldc_w           "$this$map"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* transform */
        //    11: ldc_w           "transform"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$map */
        //    18: astore_3       
        //    19: new             Ljava/util/ArrayList;
        //    22: dup            
        //    23: aload_0         /* $this$map */
        //    24: invokeinterface java/lang/CharSequence.length:()I
        //    29: invokespecial   java/util/ArrayList.<init>:(I)V
        //    32: checkcast       Ljava/util/Collection;
        //    35: astore          destination$iv
        //    37: iconst_0       
        //    38: istore          $i$f$mapTo
        //    40: aload_3         /* $this$mapTo$iv */
        //    41: astore          6
        //    43: iconst_0       
        //    44: istore          7
        //    46: iload           7
        //    48: aload           6
        //    50: invokeinterface java/lang/CharSequence.length:()I
        //    55: if_icmpge       94
        //    58: aload           6
        //    60: iload           7
        //    62: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    67: istore          item$iv
        //    69: aload           destination$iv
        //    71: aload_1         /* transform */
        //    72: iload           item$iv
        //    74: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    77: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    82: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    87: pop            
        //    88: iinc            7, 1
        //    91: goto            46
        //    94: aload           destination$iv
        //    96: checkcast       Ljava/util/List;
        //    99: areturn        
        //    Signature:
        //  <R:Ljava/lang/Object;>(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;+TR;>;)Ljava/util/List<TR;>;
        //    StackMapTable: 00 02 FF 00 2E 00 08 07 00 BF 07 00 CB 01 07 00 BF 07 02 57 01 07 00 BF 01 00 00 2F
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull final CharSequence $this$mapIndexed, @NotNull final Function2<? super Integer, ? super Character, ? extends R> transform) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$mapIndexed */
        //     3: aload_0         /* $this$mapIndexed */
        //     4: ldc_w           "$this$mapIndexed"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* transform */
        //    11: ldc_w           "transform"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$mapIndexed */
        //    18: astore_3       
        //    19: new             Ljava/util/ArrayList;
        //    22: dup            
        //    23: aload_0         /* $this$mapIndexed */
        //    24: invokeinterface java/lang/CharSequence.length:()I
        //    29: invokespecial   java/util/ArrayList.<init>:(I)V
        //    32: checkcast       Ljava/util/Collection;
        //    35: astore          destination$iv
        //    37: iconst_0       
        //    38: istore          $i$f$mapIndexedTo
        //    40: iconst_0       
        //    41: istore          index$iv
        //    43: aload_3         /* $this$mapIndexedTo$iv */
        //    44: astore          7
        //    46: iconst_0       
        //    47: istore          8
        //    49: iload           8
        //    51: aload           7
        //    53: invokeinterface java/lang/CharSequence.length:()I
        //    58: if_icmpge       105
        //    61: aload           7
        //    63: iload           8
        //    65: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    70: istore          item$iv
        //    72: aload           destination$iv
        //    74: aload_1         /* transform */
        //    75: iload           index$iv
        //    77: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    80: iinc            index$iv, 1
        //    83: iload           item$iv
        //    85: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    88: invokeinterface kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    93: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    98: pop            
        //    99: iinc            8, 1
        //   102: goto            49
        //   105: aload           destination$iv
        //   107: checkcast       Ljava/util/List;
        //   110: areturn        
        //    Signature:
        //  <R:Ljava/lang/Object;>(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function2<-Ljava/lang/Integer;-Ljava/lang/Character;+TR;>;)Ljava/util/List<TR;>;
        //    StackMapTable: 00 02 FF 00 31 00 09 07 00 BF 07 01 A9 01 07 00 BF 07 02 57 01 01 07 00 BF 01 00 00 37
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <R> List<R> mapIndexedNotNull(@NotNull final CharSequence $this$mapIndexedNotNull, @NotNull final Function2<? super Integer, ? super Character, ? extends R> transform) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$mapIndexedNotNull */
        //     3: aload_0         /* $this$mapIndexedNotNull */
        //     4: ldc_w           "$this$mapIndexedNotNull"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* transform */
        //    11: ldc_w           "transform"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$mapIndexedNotNull */
        //    18: astore_3       
        //    19: new             Ljava/util/ArrayList;
        //    22: dup            
        //    23: invokespecial   java/util/ArrayList.<init>:()V
        //    26: checkcast       Ljava/util/Collection;
        //    29: astore          destination$iv
        //    31: iconst_0       
        //    32: istore          $i$f$mapIndexedNotNullTo
        //    34: aload_3         /* $this$mapIndexedNotNullTo$iv */
        //    35: astore          $this$forEachIndexed$iv$iv
        //    37: iconst_0       
        //    38: istore          $i$f$forEachIndexed
        //    40: iconst_0       
        //    41: istore          index$iv$iv
        //    43: aload           $this$forEachIndexed$iv$iv
        //    45: astore          9
        //    47: iconst_0       
        //    48: istore          10
        //    50: iload           10
        //    52: aload           9
        //    54: invokeinterface java/lang/CharSequence.length:()I
        //    59: if_icmpge       142
        //    62: aload           9
        //    64: iload           10
        //    66: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    71: istore          item$iv$iv
        //    73: iload           index$iv$iv
        //    75: iinc            index$iv$iv, 1
        //    78: iload           item$iv$iv
        //    80: istore          12
        //    82: istore          index$iv
        //    84: iconst_0       
        //    85: istore          $i$a$-forEachIndexed-StringsKt___StringsKt$mapIndexedNotNullTo$1$iv
        //    87: aload_1         /* transform */
        //    88: iload           index$iv
        //    90: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    93: iload           element$iv
        //    95: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    98: invokeinterface kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   103: dup            
        //   104: ifnull          135
        //   107: astore          15
        //   109: iconst_0       
        //   110: istore          16
        //   112: iconst_0       
        //   113: istore          17
        //   115: aload           15
        //   117: astore          it$iv
        //   119: iconst_0       
        //   120: istore          $i$a$-let-StringsKt___StringsKt$mapIndexedNotNullTo$1$1$iv
        //   122: aload           destination$iv
        //   124: aload           it$iv
        //   126: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   131: pop            
        //   132: goto            136
        //   135: pop            
        //   136: iinc            10, 1
        //   139: goto            50
        //   142: nop            
        //   143: aload           destination$iv
        //   145: checkcast       Ljava/util/List;
        //   148: areturn        
        //    Signature:
        //  <R:Ljava/lang/Object;>(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function2<-Ljava/lang/Integer;-Ljava/lang/Character;+TR;>;)Ljava/util/List<TR;>;
        //    StackMapTable: 00 04 FF 00 32 00 0B 07 00 BF 07 01 A9 01 07 00 BF 07 02 57 01 07 00 BF 01 01 07 00 BF 01 00 00 FF 00 54 00 0F 07 00 BF 07 01 A9 01 07 00 BF 07 02 57 01 07 00 BF 01 01 07 00 BF 01 01 01 01 01 00 01 07 01 63 00 FF 00 05 00 0B 07 00 BF 07 01 A9 01 07 00 BF 07 02 57 01 07 00 BF 01 01 07 00 BF 01 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull final CharSequence $this$mapIndexedNotNullTo, @NotNull final C destination, @NotNull final Function2<? super Integer, ? super Character, ? extends R> transform) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_3        /* $i$f$mapIndexedNotNullTo */
        //     3: aload_0         /* $this$mapIndexedNotNullTo */
        //     4: ldc_w           "$this$mapIndexedNotNullTo"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* destination */
        //    11: ldc_w           "destination"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_2         /* transform */
        //    18: ldc_w           "transform"
        //    21: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    24: aload_0         /* $this$mapIndexedNotNullTo */
        //    25: astore          $this$forEachIndexed$iv
        //    27: iconst_0       
        //    28: istore          $i$f$forEachIndexed
        //    30: iconst_0       
        //    31: istore          index$iv
        //    33: aload           $this$forEachIndexed$iv
        //    35: astore          7
        //    37: iconst_0       
        //    38: istore          8
        //    40: iload           8
        //    42: aload           7
        //    44: invokeinterface java/lang/CharSequence.length:()I
        //    49: if_icmpge       131
        //    52: aload           7
        //    54: iload           8
        //    56: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    61: istore          item$iv
        //    63: iload           index$iv
        //    65: iinc            index$iv, 1
        //    68: iload           item$iv
        //    70: istore          10
        //    72: istore          index
        //    74: iconst_0       
        //    75: istore          $i$a$-forEachIndexed-StringsKt___StringsKt$mapIndexedNotNullTo$1
        //    77: aload_2         /* transform */
        //    78: iload           index
        //    80: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    83: iload           element
        //    85: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    88: invokeinterface kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    93: dup            
        //    94: ifnull          124
        //    97: astore          13
        //    99: iconst_0       
        //   100: istore          14
        //   102: iconst_0       
        //   103: istore          15
        //   105: aload           13
        //   107: astore          it
        //   109: iconst_0       
        //   110: istore          $i$a$-let-StringsKt___StringsKt$mapIndexedNotNullTo$1$1
        //   112: aload_1         /* destination */
        //   113: aload           it
        //   115: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   120: pop            
        //   121: goto            125
        //   124: pop            
        //   125: iinc            8, 1
        //   128: goto            40
        //   131: nop            
        //   132: aload_1         /* destination */
        //   133: areturn        
        //    Signature:
        //  <R:Ljava/lang/Object;C::Ljava/util/Collection<-TR;>;>(Ljava/lang/CharSequence;TC;Lkotlin/jvm/functions/Function2<-Ljava/lang/Integer;-Ljava/lang/Character;+TR;>;)TC;
        //    StackMapTable: 00 04 FF 00 28 00 09 07 00 BF 07 02 57 07 01 A9 01 07 00 BF 01 01 07 00 BF 01 00 00 FF 00 53 00 0D 07 00 BF 07 02 57 07 01 A9 01 07 00 BF 01 01 07 00 BF 01 01 01 01 01 00 01 07 01 63 00 FF 00 05 00 09 07 00 BF 07 02 57 07 01 A9 01 07 00 BF 01 01 07 00 BF 01 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull final CharSequence $this$mapIndexedTo, @NotNull final C destination, @NotNull final Function2<? super Integer, ? super Character, ? extends R> transform) {
        final int $i$f$mapIndexedTo = 0;
        Intrinsics.checkParameterIsNotNull($this$mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        int index = 0;
        for (int i = 0; i < $this$mapIndexedTo.length(); ++i) {
            final char item = $this$mapIndexedTo.charAt(i);
            final Integer value = index;
            ++index;
            destination.add((Object)transform.invoke(value, item));
        }
        return destination;
    }
    
    @NotNull
    public static final <R> List<R> mapNotNull(@NotNull final CharSequence $this$mapNotNull, @NotNull final Function1<? super Character, ? extends R> transform) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$mapNotNull */
        //     3: aload_0         /* $this$mapNotNull */
        //     4: ldc_w           "$this$mapNotNull"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* transform */
        //    11: ldc_w           "transform"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$mapNotNull */
        //    18: astore_3       
        //    19: new             Ljava/util/ArrayList;
        //    22: dup            
        //    23: invokespecial   java/util/ArrayList.<init>:()V
        //    26: checkcast       Ljava/util/Collection;
        //    29: astore          destination$iv
        //    31: iconst_0       
        //    32: istore          $i$f$mapNotNullTo
        //    34: aload_3         /* $this$mapNotNullTo$iv */
        //    35: astore          $this$forEach$iv$iv
        //    37: iconst_0       
        //    38: istore          $i$f$forEach
        //    40: aload           $this$forEach$iv$iv
        //    42: astore          8
        //    44: iconst_0       
        //    45: istore          9
        //    47: iload           9
        //    49: aload           8
        //    51: invokeinterface java/lang/CharSequence.length:()I
        //    56: if_icmpge       127
        //    59: aload           8
        //    61: iload           9
        //    63: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    68: istore          element$iv$iv
        //    70: iload           element$iv$iv
        //    72: istore          element$iv
        //    74: iconst_0       
        //    75: istore          $i$a$-forEach-StringsKt___StringsKt$mapNotNullTo$1$iv
        //    77: aload_1         /* transform */
        //    78: iload           element$iv
        //    80: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    83: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    88: dup            
        //    89: ifnull          120
        //    92: astore          13
        //    94: iconst_0       
        //    95: istore          14
        //    97: iconst_0       
        //    98: istore          15
        //   100: aload           13
        //   102: astore          it$iv
        //   104: iconst_0       
        //   105: istore          $i$a$-let-StringsKt___StringsKt$mapNotNullTo$1$1$iv
        //   107: aload           destination$iv
        //   109: aload           it$iv
        //   111: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   116: pop            
        //   117: goto            121
        //   120: pop            
        //   121: iinc            9, 1
        //   124: goto            47
        //   127: nop            
        //   128: aload           destination$iv
        //   130: checkcast       Ljava/util/List;
        //   133: areturn        
        //    Signature:
        //  <R:Ljava/lang/Object;>(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;+TR;>;)Ljava/util/List<TR;>;
        //    StackMapTable: 00 04 FF 00 2F 00 0A 07 00 BF 07 00 CB 01 07 00 BF 07 02 57 01 07 00 BF 01 07 00 BF 01 00 00 FF 00 48 00 0D 07 00 BF 07 00 CB 01 07 00 BF 07 02 57 01 07 00 BF 01 07 00 BF 01 01 01 01 00 01 07 01 63 00 F8 00 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <R, C extends Collection<? super R>> C mapNotNullTo(@NotNull final CharSequence $this$mapNotNullTo, @NotNull final C destination, @NotNull final Function1<? super Character, ? extends R> transform) {
        final int $i$f$mapNotNullTo = 0;
        Intrinsics.checkParameterIsNotNull($this$mapNotNullTo, "$this$mapNotNullTo");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        final CharSequence $this$forEach$iv = $this$mapNotNullTo;
        final int $i$f$forEach = 0;
        final CharSequence charSequence = $this$forEach$iv;
        for (int i = 0; i < charSequence.length(); ++i) {
            final char element;
            final char element$iv = element = charSequence.charAt(i);
            final int n = 0;
            final R invoke = (R)transform.invoke(element);
            if (invoke != null) {
                final Object it = invoke;
                final int n2 = 0;
                destination.add((Object)it);
            }
        }
        return destination;
    }
    
    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull final CharSequence $this$mapTo, @NotNull final C destination, @NotNull final Function1<? super Character, ? extends R> transform) {
        final int $i$f$mapTo = 0;
        Intrinsics.checkParameterIsNotNull($this$mapTo, "$this$mapTo");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        for (int i = 0; i < $this$mapTo.length(); ++i) {
            final char item = $this$mapTo.charAt(i);
            destination.add((Object)transform.invoke(item));
        }
        return destination;
    }
    
    @NotNull
    public static final Iterable<IndexedValue<Character>> withIndex(@NotNull final CharSequence $this$withIndex) {
        Intrinsics.checkParameterIsNotNull($this$withIndex, "$this$withIndex");
        return (Iterable<IndexedValue<Character>>)new IndexingIterable((Function0<? extends Iterator<?>>)new StringsKt___StringsKt$withIndex.StringsKt___StringsKt$withIndex$1($this$withIndex));
    }
    
    public static final boolean all(@NotNull final CharSequence $this$all, @NotNull final Function1<? super Character, Boolean> predicate) {
        final int $i$f$all = 0;
        Intrinsics.checkParameterIsNotNull($this$all, "$this$all");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for (int i = 0; i < $this$all.length(); ++i) {
            final char element = $this$all.charAt(i);
            if (!predicate.invoke(element)) {
                return false;
            }
        }
        return true;
    }
    
    public static final boolean any(@NotNull final CharSequence $this$any) {
        Intrinsics.checkParameterIsNotNull($this$any, "$this$any");
        return $this$any.length() != 0;
    }
    
    public static final boolean any(@NotNull final CharSequence $this$any, @NotNull final Function1<? super Character, Boolean> predicate) {
        final int $i$f$any = 0;
        Intrinsics.checkParameterIsNotNull($this$any, "$this$any");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for (int i = 0; i < $this$any.length(); ++i) {
            final char element = $this$any.charAt(i);
            if (predicate.invoke(element)) {
                return true;
            }
        }
        return false;
    }
    
    @InlineOnly
    private static final int count(@NotNull final CharSequence $this$count) {
        final int $i$f$count = 0;
        return $this$count.length();
    }
    
    public static final int count(@NotNull final CharSequence $this$count, @NotNull final Function1<? super Character, Boolean> predicate) {
        final int $i$f$count = 0;
        Intrinsics.checkParameterIsNotNull($this$count, "$this$count");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        int count = 0;
        for (int i = 0; i < $this$count.length(); ++i) {
            final char element = $this$count.charAt(i);
            if (predicate.invoke(element)) {
                ++count;
            }
        }
        return count;
    }
    
    public static final <R> R fold(@NotNull final CharSequence $this$fold, final R initial, @NotNull final Function2<? super R, ? super Character, ? extends R> operation) {
        final int $i$f$fold = 0;
        Intrinsics.checkParameterIsNotNull($this$fold, "$this$fold");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        Object accumulator = initial;
        for (int i = 0; i < $this$fold.length(); ++i) {
            final char element = $this$fold.charAt(i);
            accumulator = operation.invoke((Object)accumulator, Character.valueOf(element));
        }
        return (R)accumulator;
    }
    
    public static final <R> R foldIndexed(@NotNull final CharSequence $this$foldIndexed, final R initial, @NotNull final Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        final int $i$f$foldIndexed = 0;
        Intrinsics.checkParameterIsNotNull($this$foldIndexed, "$this$foldIndexed");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        int index = 0;
        Object accumulator = initial;
        for (int i = 0; i < $this$foldIndexed.length(); ++i) {
            final char element = $this$foldIndexed.charAt(i);
            final Integer value = index;
            ++index;
            accumulator = operation.invoke(value, (Object)accumulator, Character.valueOf(element));
        }
        return (R)accumulator;
    }
    
    public static final <R> R foldRight(@NotNull final CharSequence $this$foldRight, final R initial, @NotNull final Function2<? super Character, ? super R, ? extends R> operation) {
        final int $i$f$foldRight = 0;
        Intrinsics.checkParameterIsNotNull($this$foldRight, "$this$foldRight");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        int index;
        Object accumulator;
        for (index = StringsKt__StringsKt.getLastIndex($this$foldRight), accumulator = initial; index >= 0; accumulator = operation.invoke(Character.valueOf($this$foldRight.charAt(index--)), (Object)accumulator)) {}
        return (R)accumulator;
    }
    
    public static final <R> R foldRightIndexed(@NotNull final CharSequence $this$foldRightIndexed, final R initial, @NotNull final Function3<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        final int $i$f$foldRightIndexed = 0;
        Intrinsics.checkParameterIsNotNull($this$foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        int index = StringsKt__StringsKt.getLastIndex($this$foldRightIndexed);
        Object accumulator = initial;
        while (index >= 0) {
            accumulator = operation.invoke(Integer.valueOf(index), Character.valueOf($this$foldRightIndexed.charAt(index)), (Object)accumulator);
            --index;
        }
        return (R)accumulator;
    }
    
    public static final void forEach(@NotNull final CharSequence $this$forEach, @NotNull final Function1<? super Character, Unit> action) {
        final int $i$f$forEach = 0;
        Intrinsics.checkParameterIsNotNull($this$forEach, "$this$forEach");
        Intrinsics.checkParameterIsNotNull(action, "action");
        for (int i = 0; i < $this$forEach.length(); ++i) {
            final char element = $this$forEach.charAt(i);
            action.invoke(element);
        }
    }
    
    public static final void forEachIndexed(@NotNull final CharSequence $this$forEachIndexed, @NotNull final Function2<? super Integer, ? super Character, Unit> action) {
        final int $i$f$forEachIndexed = 0;
        Intrinsics.checkParameterIsNotNull($this$forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkParameterIsNotNull(action, "action");
        int index = 0;
        for (int i = 0; i < $this$forEachIndexed.length(); ++i) {
            final char item = $this$forEachIndexed.charAt(i);
            final Integer value = index;
            ++index;
            action.invoke(value, item);
        }
    }
    
    @Nullable
    public static final Character max(@NotNull final CharSequence $this$max) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "$this$max"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0         /* $this$max */
        //     8: astore_1       
        //     9: iconst_0       
        //    10: istore_2       
        //    11: aload_1        
        //    12: invokeinterface java/lang/CharSequence.length:()I
        //    17: ifne            24
        //    20: iconst_1       
        //    21: goto            25
        //    24: iconst_0       
        //    25: ifeq            30
        //    28: aconst_null    
        //    29: areturn        
        //    30: aload_0         /* $this$max */
        //    31: iconst_0       
        //    32: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    37: istore_1        /* max */
        //    38: iconst_1       
        //    39: istore_2       
        //    40: aload_0         /* $this$max */
        //    41: invokestatic    kotlin/text/StringsKt.getLastIndex:(Ljava/lang/CharSequence;)I
        //    44: istore_3       
        //    45: iload_2        
        //    46: iload_3        
        //    47: if_icmpgt       79
        //    50: aload_0         /* $this$max */
        //    51: iload_2         /* i */
        //    52: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    57: istore          e
        //    59: iload_1         /* max */
        //    60: iload           e
        //    62: if_icmpge       68
        //    65: iload           e
        //    67: istore_1        /* max */
        //    68: iload_2         /* i */
        //    69: iload_3        
        //    70: if_icmpeq       79
        //    73: iinc            i, 1
        //    76: goto            50
        //    79: iload_1         /* max */
        //    80: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    83: areturn        
        //    StackMapTable: 00 06 FD 00 18 07 00 BF 01 40 01 04 FF 00 13 00 04 07 00 BF 01 01 01 00 00 FC 00 11 01 FA 00 0A
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Nullable
    public static final <R extends Comparable<? super R>> Character maxBy(@NotNull final CharSequence $this$maxBy, @NotNull final Function1<? super Character, ? extends R> selector) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$maxBy */
        //     3: aload_0         /* $this$maxBy */
        //     4: ldc_w           "$this$maxBy"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* selector */
        //    11: ldc_w           "selector"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$maxBy */
        //    18: astore_3       
        //    19: iconst_0       
        //    20: istore          4
        //    22: aload_3        
        //    23: invokeinterface java/lang/CharSequence.length:()I
        //    28: ifne            35
        //    31: iconst_1       
        //    32: goto            36
        //    35: iconst_0       
        //    36: ifeq            41
        //    39: aconst_null    
        //    40: areturn        
        //    41: aload_0         /* $this$maxBy */
        //    42: iconst_0       
        //    43: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    48: istore_3        /* maxElem */
        //    49: aload_0         /* $this$maxBy */
        //    50: invokestatic    kotlin/text/StringsKt.getLastIndex:(Ljava/lang/CharSequence;)I
        //    53: istore          lastIndex
        //    55: iload           lastIndex
        //    57: ifne            65
        //    60: iload_3         /* maxElem */
        //    61: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    64: areturn        
        //    65: aload_1         /* selector */
        //    66: iload_3         /* maxElem */
        //    67: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    70: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    75: checkcast       Ljava/lang/Comparable;
        //    78: astore          maxValue
        //    80: iconst_1       
        //    81: istore          6
        //    83: iload           lastIndex
        //    85: istore          7
        //    87: iload           6
        //    89: iload           7
        //    91: if_icmpgt       152
        //    94: aload_0         /* $this$maxBy */
        //    95: iload           i
        //    97: invokeinterface java/lang/CharSequence.charAt:(I)C
        //   102: istore          e
        //   104: aload_1         /* selector */
        //   105: iload           e
        //   107: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   110: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   115: checkcast       Ljava/lang/Comparable;
        //   118: astore          v
        //   120: aload           maxValue
        //   122: aload           v
        //   124: invokeinterface java/lang/Comparable.compareTo:(Ljava/lang/Object;)I
        //   129: ifge            139
        //   132: iload           e
        //   134: istore_3        /* maxElem */
        //   135: aload           v
        //   137: astore          maxValue
        //   139: iload           i
        //   141: iload           7
        //   143: if_icmpeq       152
        //   146: iinc            i, 1
        //   149: goto            94
        //   152: iload_3         /* maxElem */
        //   153: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   156: areturn        
        //    Signature:
        //  <R::Ljava/lang/Comparable<-TR;>;>(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;+TR;>;)Ljava/lang/Character;
        //    StackMapTable: 00 07 FE 00 23 01 07 00 BF 01 40 01 04 FF 00 17 00 05 07 00 BF 07 00 CB 01 01 01 00 00 FE 00 1C 07 03 22 01 01 FD 00 2C 01 07 03 22 F9 00 0C
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Nullable
    public static final Character maxWith(@NotNull final CharSequence $this$maxWith, @NotNull final Comparator<? super Character> comparator) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "$this$maxWith"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_1         /* comparator */
        //     8: ldc_w           "comparator"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload_0         /* $this$maxWith */
        //    15: astore_2       
        //    16: iconst_0       
        //    17: istore_3       
        //    18: aload_2        
        //    19: invokeinterface java/lang/CharSequence.length:()I
        //    24: ifne            31
        //    27: iconst_1       
        //    28: goto            32
        //    31: iconst_0       
        //    32: ifeq            37
        //    35: aconst_null    
        //    36: areturn        
        //    37: aload_0         /* $this$maxWith */
        //    38: iconst_0       
        //    39: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    44: istore_2        /* max */
        //    45: iconst_1       
        //    46: istore_3       
        //    47: aload_0         /* $this$maxWith */
        //    48: invokestatic    kotlin/text/StringsKt.getLastIndex:(Ljava/lang/CharSequence;)I
        //    51: istore          4
        //    53: iload_3        
        //    54: iload           4
        //    56: if_icmpgt       101
        //    59: aload_0         /* $this$maxWith */
        //    60: iload_3         /* i */
        //    61: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    66: istore          e
        //    68: aload_1         /* comparator */
        //    69: iload_2         /* max */
        //    70: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    73: iload           e
        //    75: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    78: invokeinterface java/util/Comparator.compare:(Ljava/lang/Object;Ljava/lang/Object;)I
        //    83: ifge            89
        //    86: iload           e
        //    88: istore_2        /* max */
        //    89: iload_3         /* i */
        //    90: iload           4
        //    92: if_icmpeq       101
        //    95: iinc            i, 1
        //    98: goto            59
        //   101: iload_2         /* max */
        //   102: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   105: areturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;Ljava/util/Comparator<-Ljava/lang/Character;>;)Ljava/lang/Character;
        //    StackMapTable: 00 06 FD 00 1F 07 00 BF 01 40 01 04 FF 00 15 00 05 07 00 BF 07 03 31 01 01 01 00 00 FC 00 1D 01 FA 00 0B
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Nullable
    public static final Character min(@NotNull final CharSequence $this$min) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "$this$min"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0         /* $this$min */
        //     8: astore_1       
        //     9: iconst_0       
        //    10: istore_2       
        //    11: aload_1        
        //    12: invokeinterface java/lang/CharSequence.length:()I
        //    17: ifne            24
        //    20: iconst_1       
        //    21: goto            25
        //    24: iconst_0       
        //    25: ifeq            30
        //    28: aconst_null    
        //    29: areturn        
        //    30: aload_0         /* $this$min */
        //    31: iconst_0       
        //    32: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    37: istore_1        /* min */
        //    38: iconst_1       
        //    39: istore_2       
        //    40: aload_0         /* $this$min */
        //    41: invokestatic    kotlin/text/StringsKt.getLastIndex:(Ljava/lang/CharSequence;)I
        //    44: istore_3       
        //    45: iload_2        
        //    46: iload_3        
        //    47: if_icmpgt       79
        //    50: aload_0         /* $this$min */
        //    51: iload_2         /* i */
        //    52: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    57: istore          e
        //    59: iload_1         /* min */
        //    60: iload           e
        //    62: if_icmple       68
        //    65: iload           e
        //    67: istore_1        /* min */
        //    68: iload_2         /* i */
        //    69: iload_3        
        //    70: if_icmpeq       79
        //    73: iinc            i, 1
        //    76: goto            50
        //    79: iload_1         /* min */
        //    80: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    83: areturn        
        //    StackMapTable: 00 06 FD 00 18 07 00 BF 01 40 01 04 FF 00 13 00 04 07 00 BF 01 01 01 00 00 FC 00 11 01 FA 00 0A
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Nullable
    public static final <R extends Comparable<? super R>> Character minBy(@NotNull final CharSequence $this$minBy, @NotNull final Function1<? super Character, ? extends R> selector) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$minBy */
        //     3: aload_0         /* $this$minBy */
        //     4: ldc_w           "$this$minBy"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* selector */
        //    11: ldc_w           "selector"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$minBy */
        //    18: astore_3       
        //    19: iconst_0       
        //    20: istore          4
        //    22: aload_3        
        //    23: invokeinterface java/lang/CharSequence.length:()I
        //    28: ifne            35
        //    31: iconst_1       
        //    32: goto            36
        //    35: iconst_0       
        //    36: ifeq            41
        //    39: aconst_null    
        //    40: areturn        
        //    41: aload_0         /* $this$minBy */
        //    42: iconst_0       
        //    43: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    48: istore_3        /* minElem */
        //    49: aload_0         /* $this$minBy */
        //    50: invokestatic    kotlin/text/StringsKt.getLastIndex:(Ljava/lang/CharSequence;)I
        //    53: istore          lastIndex
        //    55: iload           lastIndex
        //    57: ifne            65
        //    60: iload_3         /* minElem */
        //    61: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    64: areturn        
        //    65: aload_1         /* selector */
        //    66: iload_3         /* minElem */
        //    67: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    70: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    75: checkcast       Ljava/lang/Comparable;
        //    78: astore          minValue
        //    80: iconst_1       
        //    81: istore          6
        //    83: iload           lastIndex
        //    85: istore          7
        //    87: iload           6
        //    89: iload           7
        //    91: if_icmpgt       152
        //    94: aload_0         /* $this$minBy */
        //    95: iload           i
        //    97: invokeinterface java/lang/CharSequence.charAt:(I)C
        //   102: istore          e
        //   104: aload_1         /* selector */
        //   105: iload           e
        //   107: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   110: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   115: checkcast       Ljava/lang/Comparable;
        //   118: astore          v
        //   120: aload           minValue
        //   122: aload           v
        //   124: invokeinterface java/lang/Comparable.compareTo:(Ljava/lang/Object;)I
        //   129: ifle            139
        //   132: iload           e
        //   134: istore_3        /* minElem */
        //   135: aload           v
        //   137: astore          minValue
        //   139: iload           i
        //   141: iload           7
        //   143: if_icmpeq       152
        //   146: iinc            i, 1
        //   149: goto            94
        //   152: iload_3         /* minElem */
        //   153: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   156: areturn        
        //    Signature:
        //  <R::Ljava/lang/Comparable<-TR;>;>(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1<-Ljava/lang/Character;+TR;>;)Ljava/lang/Character;
        //    StackMapTable: 00 07 FE 00 23 01 07 00 BF 01 40 01 04 FF 00 17 00 05 07 00 BF 07 00 CB 01 01 01 00 00 FE 00 1C 07 03 22 01 01 FD 00 2C 01 07 03 22 F9 00 0C
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Nullable
    public static final Character minWith(@NotNull final CharSequence $this$minWith, @NotNull final Comparator<? super Character> comparator) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "$this$minWith"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_1         /* comparator */
        //     8: ldc_w           "comparator"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload_0         /* $this$minWith */
        //    15: astore_2       
        //    16: iconst_0       
        //    17: istore_3       
        //    18: aload_2        
        //    19: invokeinterface java/lang/CharSequence.length:()I
        //    24: ifne            31
        //    27: iconst_1       
        //    28: goto            32
        //    31: iconst_0       
        //    32: ifeq            37
        //    35: aconst_null    
        //    36: areturn        
        //    37: aload_0         /* $this$minWith */
        //    38: iconst_0       
        //    39: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    44: istore_2        /* min */
        //    45: iconst_1       
        //    46: istore_3       
        //    47: aload_0         /* $this$minWith */
        //    48: invokestatic    kotlin/text/StringsKt.getLastIndex:(Ljava/lang/CharSequence;)I
        //    51: istore          4
        //    53: iload_3        
        //    54: iload           4
        //    56: if_icmpgt       101
        //    59: aload_0         /* $this$minWith */
        //    60: iload_3         /* i */
        //    61: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    66: istore          e
        //    68: aload_1         /* comparator */
        //    69: iload_2         /* min */
        //    70: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    73: iload           e
        //    75: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    78: invokeinterface java/util/Comparator.compare:(Ljava/lang/Object;Ljava/lang/Object;)I
        //    83: ifle            89
        //    86: iload           e
        //    88: istore_2        /* min */
        //    89: iload_3         /* i */
        //    90: iload           4
        //    92: if_icmpeq       101
        //    95: iinc            i, 1
        //    98: goto            59
        //   101: iload_2         /* min */
        //   102: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   105: areturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;Ljava/util/Comparator<-Ljava/lang/Character;>;)Ljava/lang/Character;
        //    StackMapTable: 00 06 FD 00 1F 07 00 BF 01 40 01 04 FF 00 15 00 05 07 00 BF 07 03 31 01 01 01 00 00 FC 00 1D 01 FA 00 0B
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final boolean none(@NotNull final CharSequence $this$none) {
        Intrinsics.checkParameterIsNotNull($this$none, "$this$none");
        return $this$none.length() == 0;
    }
    
    public static final boolean none(@NotNull final CharSequence $this$none, @NotNull final Function1<? super Character, Boolean> predicate) {
        final int $i$f$none = 0;
        Intrinsics.checkParameterIsNotNull($this$none, "$this$none");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for (int i = 0; i < $this$none.length(); ++i) {
            final char element = $this$none.charAt(i);
            if (predicate.invoke(element)) {
                return false;
            }
        }
        return true;
    }
    
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <S extends CharSequence> S onEach(@NotNull final S $this$onEach, @NotNull final Function1<? super Character, Unit> action) {
        final int $i$f$onEach = 0;
        Intrinsics.checkParameterIsNotNull($this$onEach, "$this$onEach");
        Intrinsics.checkParameterIsNotNull(action, "action");
        final CharSequence $this$apply = $this$onEach;
        final int n = 0;
        final CharSequence charSequence = $this$apply;
        for (int i = 0; i < charSequence.length(); ++i) {
            final char element = charSequence.charAt(i);
            action.invoke(element);
        }
        return $this$onEach;
    }
    
    public static final char reduce(@NotNull final CharSequence $this$reduce, @NotNull final Function2<? super Character, ? super Character, Character> operation) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$reduce */
        //     3: aload_0         /* $this$reduce */
        //     4: ldc_w           "$this$reduce"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* operation */
        //    11: ldc_w           "operation"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$reduce */
        //    18: astore_3       
        //    19: iconst_0       
        //    20: istore          4
        //    22: aload_3        
        //    23: invokeinterface java/lang/CharSequence.length:()I
        //    28: ifne            35
        //    31: iconst_1       
        //    32: goto            36
        //    35: iconst_0       
        //    36: ifeq            53
        //    39: new             Ljava/lang/UnsupportedOperationException;
        //    42: dup            
        //    43: ldc_w           "Empty char sequence can't be reduced."
        //    46: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //    49: checkcast       Ljava/lang/Throwable;
        //    52: athrow         
        //    53: aload_0         /* $this$reduce */
        //    54: iconst_0       
        //    55: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    60: istore_3        /* accumulator */
        //    61: iconst_1       
        //    62: istore          4
        //    64: aload_0         /* $this$reduce */
        //    65: invokestatic    kotlin/text/StringsKt.getLastIndex:(Ljava/lang/CharSequence;)I
        //    68: istore          5
        //    70: iload           4
        //    72: iload           5
        //    74: if_icmpgt       118
        //    77: aload_1         /* operation */
        //    78: iload_3         /* accumulator */
        //    79: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    82: aload_0         /* $this$reduce */
        //    83: iload           index
        //    85: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    90: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    93: invokeinterface kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    98: checkcast       Ljava/lang/Character;
        //   101: invokevirtual   java/lang/Character.charValue:()C
        //   104: istore_3        /* accumulator */
        //   105: iload           index
        //   107: iload           5
        //   109: if_icmpeq       118
        //   112: iinc            index, 1
        //   115: goto            77
        //   118: iload_3         /* accumulator */
        //   119: ireturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function2<-Ljava/lang/Character;-Ljava/lang/Character;Ljava/lang/Character;>;)C
        //    StackMapTable: 00 05 FE 00 23 01 07 00 BF 01 40 01 10 FF 00 17 00 06 07 00 BF 07 01 A9 01 01 01 01 00 00 28
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final char reduceIndexed(@NotNull final CharSequence $this$reduceIndexed, @NotNull final Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$reduceIndexed */
        //     3: aload_0         /* $this$reduceIndexed */
        //     4: ldc_w           "$this$reduceIndexed"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* operation */
        //    11: ldc_w           "operation"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$reduceIndexed */
        //    18: astore_3       
        //    19: iconst_0       
        //    20: istore          4
        //    22: aload_3        
        //    23: invokeinterface java/lang/CharSequence.length:()I
        //    28: ifne            35
        //    31: iconst_1       
        //    32: goto            36
        //    35: iconst_0       
        //    36: ifeq            53
        //    39: new             Ljava/lang/UnsupportedOperationException;
        //    42: dup            
        //    43: ldc_w           "Empty char sequence can't be reduced."
        //    46: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //    49: checkcast       Ljava/lang/Throwable;
        //    52: athrow         
        //    53: aload_0         /* $this$reduceIndexed */
        //    54: iconst_0       
        //    55: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    60: istore_3        /* accumulator */
        //    61: iconst_1       
        //    62: istore          4
        //    64: aload_0         /* $this$reduceIndexed */
        //    65: invokestatic    kotlin/text/StringsKt.getLastIndex:(Ljava/lang/CharSequence;)I
        //    68: istore          5
        //    70: iload           4
        //    72: iload           5
        //    74: if_icmpgt       123
        //    77: aload_1         /* operation */
        //    78: iload           index
        //    80: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    83: iload_3         /* accumulator */
        //    84: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    87: aload_0         /* $this$reduceIndexed */
        //    88: iload           index
        //    90: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    95: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    98: invokeinterface kotlin/jvm/functions/Function3.invoke:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   103: checkcast       Ljava/lang/Character;
        //   106: invokevirtual   java/lang/Character.charValue:()C
        //   109: istore_3        /* accumulator */
        //   110: iload           index
        //   112: iload           5
        //   114: if_icmpeq       123
        //   117: iinc            index, 1
        //   120: goto            77
        //   123: iload_3         /* accumulator */
        //   124: ireturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function3<-Ljava/lang/Integer;-Ljava/lang/Character;-Ljava/lang/Character;Ljava/lang/Character;>;)C
        //    StackMapTable: 00 05 FE 00 23 01 07 00 BF 01 40 01 10 FF 00 17 00 06 07 00 BF 07 03 09 01 01 01 01 00 00 2D
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final char reduceRight(@NotNull final CharSequence $this$reduceRight, @NotNull final Function2<? super Character, ? super Character, Character> operation) {
        final int $i$f$reduceRight = 0;
        Intrinsics.checkParameterIsNotNull($this$reduceRight, "$this$reduceRight");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        int index = StringsKt__StringsKt.getLastIndex($this$reduceRight);
        if (index < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char accumulator;
        for (accumulator = $this$reduceRight.charAt(index--); index >= 0; accumulator = operation.invoke($this$reduceRight.charAt(index--), accumulator)) {}
        return accumulator;
    }
    
    public static final char reduceRightIndexed(@NotNull final CharSequence $this$reduceRightIndexed, @NotNull final Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        final int $i$f$reduceRightIndexed = 0;
        Intrinsics.checkParameterIsNotNull($this$reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        int index = StringsKt__StringsKt.getLastIndex($this$reduceRightIndexed);
        if (index < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char accumulator;
        for (accumulator = $this$reduceRightIndexed.charAt(index--); index >= 0; --index) {
            accumulator = operation.invoke(index, $this$reduceRightIndexed.charAt(index), accumulator);
        }
        return accumulator;
    }
    
    public static final int sumBy(@NotNull final CharSequence $this$sumBy, @NotNull final Function1<? super Character, Integer> selector) {
        final int $i$f$sumBy = 0;
        Intrinsics.checkParameterIsNotNull($this$sumBy, "$this$sumBy");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        int sum = 0;
        for (int i = 0; i < $this$sumBy.length(); ++i) {
            final char element = $this$sumBy.charAt(i);
            sum += selector.invoke(element).intValue();
        }
        return sum;
    }
    
    public static final double sumByDouble(@NotNull final CharSequence $this$sumByDouble, @NotNull final Function1<? super Character, Double> selector) {
        final int $i$f$sumByDouble = 0;
        Intrinsics.checkParameterIsNotNull($this$sumByDouble, "$this$sumByDouble");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        double sum = 0.0;
        for (int i = 0; i < $this$sumByDouble.length(); ++i) {
            final char element = $this$sumByDouble.charAt(i);
            sum += selector.invoke(element).doubleValue();
        }
        return sum;
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<String> chunked(@NotNull final CharSequence $this$chunked, final int size) {
        Intrinsics.checkParameterIsNotNull($this$chunked, "$this$chunked");
        return windowed($this$chunked, size, size, true);
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> List<R> chunked(@NotNull final CharSequence $this$chunked, final int size, @NotNull final Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkParameterIsNotNull($this$chunked, "$this$chunked");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        return windowed($this$chunked, size, size, true, transform);
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<String> chunkedSequence(@NotNull final CharSequence $this$chunkedSequence, final int size) {
        Intrinsics.checkParameterIsNotNull($this$chunkedSequence, "$this$chunkedSequence");
        return chunkedSequence($this$chunkedSequence, size, (Function1<? super CharSequence, ? extends String>)StringsKt___StringsKt$chunkedSequence.StringsKt___StringsKt$chunkedSequence$1.INSTANCE);
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> Sequence<R> chunkedSequence(@NotNull final CharSequence $this$chunkedSequence, final int size, @NotNull final Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkParameterIsNotNull($this$chunkedSequence, "$this$chunkedSequence");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        return windowedSequence($this$chunkedSequence, size, size, true, transform);
    }
    
    @NotNull
    public static final Pair<CharSequence, CharSequence> partition(@NotNull final CharSequence $this$partition, @NotNull final Function1<? super Character, Boolean> predicate) {
        final int $i$f$partition = 0;
        Intrinsics.checkParameterIsNotNull($this$partition, "$this$partition");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        final StringBuilder first = new StringBuilder();
        final StringBuilder second = new StringBuilder();
        for (int i = 0; i < $this$partition.length(); ++i) {
            final char element = $this$partition.charAt(i);
            if (predicate.invoke(element)) {
                first.append(element);
            }
            else {
                second.append(element);
            }
        }
        return new Pair<CharSequence, CharSequence>(first, second);
    }
    
    @NotNull
    public static final Pair<String, String> partition(@NotNull final String $this$partition, @NotNull final Function1<? super Character, Boolean> predicate) {
        final int $i$f$partition = 0;
        Intrinsics.checkParameterIsNotNull($this$partition, "$this$partition");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        final StringBuilder first = new StringBuilder();
        final StringBuilder second = new StringBuilder();
        for (int length = $this$partition.length(), i = 0; i < length; ++i) {
            final char element = $this$partition.charAt(i);
            if (predicate.invoke(element)) {
                first.append(element);
            }
            else {
                second.append(element);
            }
        }
        return new Pair<String, String>(first.toString(), second.toString());
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<String> windowed(@NotNull final CharSequence $this$windowed, final int size, final int step, final boolean partialWindows) {
        Intrinsics.checkParameterIsNotNull($this$windowed, "$this$windowed");
        return windowed($this$windowed, size, step, partialWindows, (Function1<? super CharSequence, ? extends String>)StringsKt___StringsKt$windowed.StringsKt___StringsKt$windowed$1.INSTANCE);
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> List<R> windowed(@NotNull final CharSequence $this$windowed, final int size, final int step, final boolean partialWindows, @NotNull final Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkParameterIsNotNull($this$windowed, "$this$windowed");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(size, step);
        final int thisSize = $this$windowed.length();
        final ArrayList result = new ArrayList((thisSize + step - 1) / step);
        for (int index = 0; index < thisSize; index += step) {
            final int end = index + size;
            int n;
            if (end > thisSize) {
                if (!partialWindows) {
                    break;
                }
                n = thisSize;
            }
            else {
                n = end;
            }
            final int coercedEnd = n;
            result.add(transform.invoke($this$windowed.subSequence(index, coercedEnd)));
        }
        return (List<R>)result;
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<String> windowedSequence(@NotNull final CharSequence $this$windowedSequence, final int size, final int step, final boolean partialWindows) {
        Intrinsics.checkParameterIsNotNull($this$windowedSequence, "$this$windowedSequence");
        return windowedSequence($this$windowedSequence, size, step, partialWindows, (Function1<? super CharSequence, ? extends String>)StringsKt___StringsKt$windowedSequence.StringsKt___StringsKt$windowedSequence$1.INSTANCE);
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> Sequence<R> windowedSequence(@NotNull final CharSequence $this$windowedSequence, final int size, final int step, final boolean partialWindows, @NotNull final Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkParameterIsNotNull($this$windowedSequence, "$this$windowedSequence");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(size, step);
        final IntProgression windows = RangesKt___RangesKt.step(partialWindows ? StringsKt__StringsKt.getIndices($this$windowedSequence) : RangesKt___RangesKt.until(0, $this$windowedSequence.length() - size + 1), step);
        return SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence((Iterable<?>)windows), (Function1<? super Object, ? extends R>)new StringsKt___StringsKt$windowedSequence.StringsKt___StringsKt$windowedSequence$2($this$windowedSequence, (Function1)transform, size));
    }
    
    @NotNull
    public static final List<Pair<Character, Character>> zip(@NotNull final CharSequence $this$zip, @NotNull final CharSequence other) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "$this$zip"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_1         /* other */
        //     8: ldc_w           "other"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload_0         /* $this$zip */
        //    15: astore_2        /* $this$zip$iv */
        //    16: iconst_0       
        //    17: istore_3        /* $i$f$zip */
        //    18: aload_2         /* $this$zip$iv */
        //    19: invokeinterface java/lang/CharSequence.length:()I
        //    24: istore          4
        //    26: aload_1         /* other */
        //    27: invokeinterface java/lang/CharSequence.length:()I
        //    32: istore          5
        //    34: iconst_0       
        //    35: istore          6
        //    37: iload           4
        //    39: iload           5
        //    41: invokestatic    java/lang/Math.min:(II)I
        //    44: istore          length$iv
        //    46: new             Ljava/util/ArrayList;
        //    49: dup            
        //    50: iload           length$iv
        //    52: invokespecial   java/util/ArrayList.<init>:(I)V
        //    55: astore          list$iv
        //    57: iconst_0       
        //    58: istore          5
        //    60: iload           length$iv
        //    62: istore          6
        //    64: iload           5
        //    66: iload           6
        //    68: if_icmpge       127
        //    71: aload           list$iv
        //    73: aload_2         /* $this$zip$iv */
        //    74: iload           i$iv
        //    76: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    81: aload_1         /* other */
        //    82: iload           i$iv
        //    84: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    89: istore          8
        //    91: istore          9
        //    93: astore          11
        //    95: iconst_0       
        //    96: istore          $i$a$-zip-StringsKt___StringsKt$zip$1
        //    98: iload           c1
        //   100: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   103: iload           c2
        //   105: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   108: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   111: astore          12
        //   113: aload           11
        //   115: aload           12
        //   117: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   120: pop            
        //   121: iinc            i$iv, 1
        //   124: goto            64
        //   127: aload           list$iv
        //   129: checkcast       Ljava/util/List;
        //   132: areturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/util/List<Lkotlin/Pair<Ljava/lang/Character;Ljava/lang/Character;>;>;
        //    StackMapTable: 00 02 FF 00 40 00 08 07 00 BF 07 00 BF 07 00 BF 01 07 02 78 01 01 01 00 00 3E
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final <V> List<V> zip(@NotNull final CharSequence $this$zip, @NotNull final CharSequence other, @NotNull final Function2<? super Character, ? super Character, ? extends V> transform) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_3        /* $i$f$zip */
        //     3: aload_0         /* $this$zip */
        //     4: ldc_w           "$this$zip"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* other */
        //    11: ldc_w           "other"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_2         /* transform */
        //    18: ldc_w           "transform"
        //    21: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    24: aload_0         /* $this$zip */
        //    25: invokeinterface java/lang/CharSequence.length:()I
        //    30: istore          5
        //    32: aload_1         /* other */
        //    33: invokeinterface java/lang/CharSequence.length:()I
        //    38: istore          6
        //    40: iconst_0       
        //    41: istore          7
        //    43: iload           5
        //    45: iload           6
        //    47: invokestatic    java/lang/Math.min:(II)I
        //    50: istore          length
        //    52: new             Ljava/util/ArrayList;
        //    55: dup            
        //    56: iload           length
        //    58: invokespecial   java/util/ArrayList.<init>:(I)V
        //    61: astore          list
        //    63: iconst_0       
        //    64: istore          6
        //    66: iload           length
        //    68: istore          7
        //    70: iload           6
        //    72: iload           7
        //    74: if_icmpge       117
        //    77: aload           list
        //    79: aload_2         /* transform */
        //    80: aload_0         /* $this$zip */
        //    81: iload           i
        //    83: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    88: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    91: aload_1         /* other */
        //    92: iload           i
        //    94: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    99: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   102: invokeinterface kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   107: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   110: pop            
        //   111: iinc            i, 1
        //   114: goto            70
        //   117: aload           list
        //   119: checkcast       Ljava/util/List;
        //   122: areturn        
        //    Signature:
        //  <V:Ljava/lang/Object;>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function2<-Ljava/lang/Character;-Ljava/lang/Character;+TV;>;)Ljava/util/List<TV;>;
        //    StackMapTable: 00 02 FF 00 46 00 08 07 00 BF 07 00 BF 07 01 A9 01 01 07 02 78 01 01 00 00 2E
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<Pair<Character, Character>> zipWithNext(@NotNull final CharSequence $this$zipWithNext) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "$this$zipWithNext"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0         /* $this$zipWithNext */
        //     8: astore_1        /* $this$zipWithNext$iv */
        //     9: iconst_0       
        //    10: istore_2        /* $i$f$zipWithNext */
        //    11: aload_1         /* $this$zipWithNext$iv */
        //    12: invokeinterface java/lang/CharSequence.length:()I
        //    17: iconst_1       
        //    18: isub           
        //    19: istore_3        /* size$iv */
        //    20: iload_3         /* size$iv */
        //    21: iconst_1       
        //    22: if_icmpge       31
        //    25: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //    28: goto            117
        //    31: new             Ljava/util/ArrayList;
        //    34: dup            
        //    35: iload_3         /* size$iv */
        //    36: invokespecial   java/util/ArrayList.<init>:(I)V
        //    39: astore          result$iv
        //    41: iconst_0       
        //    42: istore          5
        //    44: iload_3         /* size$iv */
        //    45: istore          6
        //    47: iload           5
        //    49: iload           6
        //    51: if_icmpge       112
        //    54: aload           result$iv
        //    56: aload_1         /* $this$zipWithNext$iv */
        //    57: iload           index$iv
        //    59: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    64: aload_1         /* $this$zipWithNext$iv */
        //    65: iload           index$iv
        //    67: iconst_1       
        //    68: iadd           
        //    69: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    74: istore          7
        //    76: istore          8
        //    78: astore          10
        //    80: iconst_0       
        //    81: istore          $i$a$-zipWithNext-StringsKt___StringsKt$zipWithNext$1
        //    83: iload           a
        //    85: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    88: iload           b
        //    90: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    93: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //    96: astore          11
        //    98: aload           10
        //   100: aload           11
        //   102: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   105: pop            
        //   106: iinc            index$iv, 1
        //   109: goto            47
        //   112: aload           result$iv
        //   114: checkcast       Ljava/util/List;
        //   117: areturn        
        //    Signature:
        //  (Ljava/lang/CharSequence;)Ljava/util/List<Lkotlin/Pair<Ljava/lang/Character;Ljava/lang/Character;>;>;
        //    StackMapTable: 00 04 FE 00 1F 07 00 BF 01 01 FE 00 0F 07 02 78 01 01 FB 00 40 FF 00 04 00 04 07 00 BF 07 00 BF 01 01 00 01 07 02 74
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> List<R> zipWithNext(@NotNull final CharSequence $this$zipWithNext, @NotNull final Function2<? super Character, ? super Character, ? extends R> transform) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$zipWithNext */
        //     3: aload_0         /* $this$zipWithNext */
        //     4: ldc_w           "$this$zipWithNext"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* transform */
        //    11: ldc_w           "transform"
        //    14: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    17: aload_0         /* $this$zipWithNext */
        //    18: invokeinterface java/lang/CharSequence.length:()I
        //    23: iconst_1       
        //    24: isub           
        //    25: istore_3        /* size */
        //    26: iload_3         /* size */
        //    27: iconst_1       
        //    28: if_icmpge       35
        //    31: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //    34: areturn        
        //    35: new             Ljava/util/ArrayList;
        //    38: dup            
        //    39: iload_3         /* size */
        //    40: invokespecial   java/util/ArrayList.<init>:(I)V
        //    43: astore          result
        //    45: iconst_0       
        //    46: istore          5
        //    48: iload_3         /* size */
        //    49: istore          6
        //    51: iload           5
        //    53: iload           6
        //    55: if_icmpge       100
        //    58: aload           result
        //    60: aload_1         /* transform */
        //    61: aload_0         /* $this$zipWithNext */
        //    62: iload           index
        //    64: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    69: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    72: aload_0         /* $this$zipWithNext */
        //    73: iload           index
        //    75: iconst_1       
        //    76: iadd           
        //    77: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    82: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //    85: invokeinterface kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    90: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    93: pop            
        //    94: iinc            index, 1
        //    97: goto            51
        //   100: aload           result
        //   102: checkcast       Ljava/util/List;
        //   105: areturn        
        //    Signature:
        //  <R:Ljava/lang/Object;>(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function2<-Ljava/lang/Character;-Ljava/lang/Character;+TR;>;)Ljava/util/List<TR;>;
        //    StackMapTable: 00 03 FD 00 23 01 01 FE 00 0F 07 02 78 01 01 30
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final Iterable<Character> asIterable(@NotNull final CharSequence $this$asIterable) {
        Intrinsics.checkParameterIsNotNull($this$asIterable, "$this$asIterable");
        if ($this$asIterable instanceof String && $this$asIterable.length() == 0) {
            return (Iterable<Character>)CollectionsKt__CollectionsKt.emptyList();
        }
        return new Iterable<Character>($this$asIterable) {
            @NotNull
            @Override
            public Iterator<Character> iterator() {
                final int n = 0;
                return StringsKt__StringsKt.iterator(this.$this_asIterable$inlined);
            }
        };
    }
    
    @NotNull
    public static final Sequence<Character> asSequence(@NotNull final CharSequence $this$asSequence) {
        Intrinsics.checkParameterIsNotNull($this$asSequence, "$this$asSequence");
        if ($this$asSequence instanceof String && $this$asSequence.length() == 0) {
            return SequencesKt__SequencesKt.emptySequence();
        }
        return new Sequence<Character>($this$asSequence) {
            @NotNull
            @Override
            public Iterator<Character> iterator() {
                final int n = 0;
                return StringsKt__StringsKt.iterator(this.$this_asSequence$inlined);
            }
        };
    }
    
    public StringsKt___StringsKt() {
    }
}
