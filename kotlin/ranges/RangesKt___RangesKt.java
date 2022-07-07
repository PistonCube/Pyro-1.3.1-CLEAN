// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import org.jetbrains.annotations.Nullable;
import kotlin.Deprecated;
import kotlin.jvm.JvmName;
import java.util.NoSuchElementException;
import kotlin.random.RandomKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.internal.InlineOnly;
import kotlin.SinceKotlin;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000n\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a'\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007\u001a\u0012\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b\u001a\u0012\u0010\u0000\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t\u001a\u0012\u0010\u0000\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n\u001a'\u0010\u000b\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u0012\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u0012\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a3\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00012\b\u0010\f\u001a\u0004\u0018\u0001H\u0001¢\u0006\u0002\u0010\u000e\u001a/\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a-\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012¢\u0006\u0002\u0010\u0013\u001a\u001a\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u001a\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u001a\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u001a\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0018\u0010\r\u001a\u00020\b*\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0012\u001a\u001a\u0010\r\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0018\u0010\r\u001a\u00020\t*\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u001a\u001a\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0087\n¢\u0006\u0002\u0010\u0019\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b \u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020!2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0087\n¢\u0006\u0002\u0010\"\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0087\n¢\u0006\u0002\u0010$\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\u00052\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020)*\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\b2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\n2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\r\u0010*\u001a\u00020\u0018*\u00020\u0016H\u0087\b\u001a\u0014\u0010*\u001a\u00020\u0018*\u00020\u00162\u0006\u0010*\u001a\u00020+H\u0007\u001a\r\u0010*\u001a\u00020\b*\u00020!H\u0087\b\u001a\u0014\u0010*\u001a\u00020\b*\u00020!2\u0006\u0010*\u001a\u00020+H\u0007\u001a\r\u0010*\u001a\u00020\t*\u00020#H\u0087\b\u001a\u0014\u0010*\u001a\u00020\t*\u00020#2\u0006\u0010*\u001a\u00020+H\u0007\u001a\n\u0010,\u001a\u00020)*\u00020)\u001a\n\u0010,\u001a\u00020&*\u00020&\u001a\n\u0010,\u001a\u00020(*\u00020(\u001a\u0015\u0010-\u001a\u00020)*\u00020)2\u0006\u0010-\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010-\u001a\u00020&*\u00020&2\u0006\u0010-\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010-\u001a\u00020(*\u00020(2\u0006\u0010-\u001a\u00020\tH\u0086\u0004\u001a\u0013\u0010.\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0000¢\u0006\u0002\u0010/\u001a\u0013\u0010.\u001a\u0004\u0018\u00010\u0005*\u00020\u0007H\u0000¢\u0006\u0002\u00100\u001a\u0013\u0010.\u001a\u0004\u0018\u00010\u0005*\u00020\bH\u0000¢\u0006\u0002\u00101\u001a\u0013\u0010.\u001a\u0004\u0018\u00010\u0005*\u00020\tH\u0000¢\u0006\u0002\u00102\u001a\u0013\u0010.\u001a\u0004\u0018\u00010\u0005*\u00020\nH\u0000¢\u0006\u0002\u00103\u001a\u0013\u00104\u001a\u0004\u0018\u00010\b*\u00020\u0006H\u0000¢\u0006\u0002\u00105\u001a\u0013\u00104\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0000¢\u0006\u0002\u00106\u001a\u0013\u00104\u001a\u0004\u0018\u00010\b*\u00020\tH\u0000¢\u0006\u0002\u00107\u001a\u0013\u00108\u001a\u0004\u0018\u00010\t*\u00020\u0006H\u0000¢\u0006\u0002\u00109\u001a\u0013\u00108\u001a\u0004\u0018\u00010\t*\u00020\u0007H\u0000¢\u0006\u0002\u0010:\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0000¢\u0006\u0002\u0010<\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\n*\u00020\u0007H\u0000¢\u0006\u0002\u0010=\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\n*\u00020\bH\u0000¢\u0006\u0002\u0010>\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\n*\u00020\tH\u0000¢\u0006\u0002\u0010?\u001a\u0015\u0010@\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010@\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010@\u001a\u00020#*\u00020\u00052\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010@\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010@\u001a\u00020\u0016*\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010@\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010@\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010@\u001a\u00020#*\u00020\b2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010@\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010@\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010@\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010@\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010@\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010@\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010@\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010@\u001a\u00020#*\u00020\n2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010@\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0086\u0004¨\u0006A" }, d2 = { "coerceAtLeast", "T", "", "minimumValue", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "coerceAtMost", "maximumValue", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "Lkotlin/ranges/ClosedRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "contains", "", "Lkotlin/ranges/CharRange;", "element", "", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", "value", "byteRangeContains", "doubleRangeContains", "floatRangeContains", "intRangeContains", "longRangeContains", "shortRangeContains", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "Lkotlin/ranges/LongRange;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "downTo", "Lkotlin/ranges/IntProgression;", "to", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/CharProgression;", "random", "Lkotlin/random/Random;", "reversed", "step", "toByteExactOrNull", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "toIntExactOrNull", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "(J)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "until", "kotlin-stdlib" }, xs = "kotlin/ranges/RangesKt")
class RangesKt___RangesKt extends RangesKt__RangesKt
{
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final int random(@NotNull final IntRange $this$random) {
        final int $i$f$random = 0;
        return random($this$random, Random.Default);
    }
    
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final long random(@NotNull final LongRange $this$random) {
        final int $i$f$random = 0;
        return random($this$random, Random.Default);
    }
    
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char random(@NotNull final CharRange $this$random) {
        final int $i$f$random = 0;
        return random($this$random, Random.Default);
    }
    
    @SinceKotlin(version = "1.3")
    public static final int random(@NotNull final IntRange $this$random, @NotNull final Random random) {
        Intrinsics.checkParameterIsNotNull($this$random, "$this$random");
        Intrinsics.checkParameterIsNotNull(random, "random");
        try {
            return RandomKt.nextInt(random, $this$random);
        }
        catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
    
    @SinceKotlin(version = "1.3")
    public static final long random(@NotNull final LongRange $this$random, @NotNull final Random random) {
        Intrinsics.checkParameterIsNotNull($this$random, "$this$random");
        Intrinsics.checkParameterIsNotNull(random, "random");
        try {
            return RandomKt.nextLong(random, $this$random);
        }
        catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
    
    @SinceKotlin(version = "1.3")
    public static final char random(@NotNull final CharRange $this$random, @NotNull final Random random) {
        Intrinsics.checkParameterIsNotNull($this$random, "$this$random");
        Intrinsics.checkParameterIsNotNull(random, "random");
        try {
            return (char)random.nextInt($this$random.getFirst(), $this$random.getLast() + '\u0001');
        }
        catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
    
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(@NotNull final IntRange $this$contains, final Integer element) {
        final int $i$f$contains = 0;
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return element != null && $this$contains.contains((int)element);
    }
    
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(@NotNull final LongRange $this$contains, final Long element) {
        final int $i$f$contains = 0;
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return element != null && $this$contains.contains((long)element);
    }
    
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(@NotNull final CharRange $this$contains, final Character element) {
        final int $i$f$contains = 0;
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return element != null && $this$contains.contains((char)element);
    }
    
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull final ClosedRange<Integer> $this$contains, final byte value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains((int)value);
    }
    
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull final ClosedRange<Long> $this$contains, final byte value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains((long)value);
    }
    
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull final ClosedRange<Short> $this$contains, final byte value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains((short)value);
    }
    
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "doubleRangeContains")
    @java.lang.Deprecated
    public static final boolean doubleRangeContains(@NotNull final ClosedRange<Double> $this$contains, final byte value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains((double)value);
    }
    
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "floatRangeContains")
    @java.lang.Deprecated
    public static final boolean floatRangeContains(@NotNull final ClosedRange<Float> $this$contains, final byte value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains((float)value);
    }
    
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "intRangeContains")
    @java.lang.Deprecated
    public static final boolean intRangeContains(@NotNull final ClosedRange<Integer> $this$contains, final double value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        final Integer it = toIntExactOrNull(value);
        final int n = 0;
        return it != null && $this$contains.contains(it);
    }
    
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "longRangeContains")
    @java.lang.Deprecated
    public static final boolean longRangeContains(@NotNull final ClosedRange<Long> $this$contains, final double value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        final Long it = toLongExactOrNull(value);
        final int n = 0;
        return it != null && $this$contains.contains(it);
    }
    
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "byteRangeContains")
    @java.lang.Deprecated
    public static final boolean byteRangeContains(@NotNull final ClosedRange<Byte> $this$contains, final double value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        final Byte it = toByteExactOrNull(value);
        final int n = 0;
        return it != null && $this$contains.contains(it);
    }
    
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "shortRangeContains")
    @java.lang.Deprecated
    public static final boolean shortRangeContains(@NotNull final ClosedRange<Short> $this$contains, final double value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        final Short it = toShortExactOrNull(value);
        final int n = 0;
        return it != null && $this$contains.contains(it);
    }
    
    @JvmName(name = "floatRangeContains")
    public static final boolean floatRangeContains(@NotNull final ClosedRange<Float> $this$contains, final double value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains((float)value);
    }
    
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "intRangeContains")
    @java.lang.Deprecated
    public static final boolean intRangeContains(@NotNull final ClosedRange<Integer> $this$contains, final float value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        final Integer it = toIntExactOrNull(value);
        final int n = 0;
        return it != null && $this$contains.contains(it);
    }
    
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "longRangeContains")
    @java.lang.Deprecated
    public static final boolean longRangeContains(@NotNull final ClosedRange<Long> $this$contains, final float value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        final Long it = toLongExactOrNull(value);
        final int n = 0;
        return it != null && $this$contains.contains(it);
    }
    
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "byteRangeContains")
    @java.lang.Deprecated
    public static final boolean byteRangeContains(@NotNull final ClosedRange<Byte> $this$contains, final float value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        final Byte it = toByteExactOrNull(value);
        final int n = 0;
        return it != null && $this$contains.contains(it);
    }
    
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "shortRangeContains")
    @java.lang.Deprecated
    public static final boolean shortRangeContains(@NotNull final ClosedRange<Short> $this$contains, final float value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        final Short it = toShortExactOrNull(value);
        final int n = 0;
        return it != null && $this$contains.contains(it);
    }
    
    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(@NotNull final ClosedRange<Double> $this$contains, final float value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains((double)value);
    }
    
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull final ClosedRange<Long> $this$contains, final int value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains((long)value);
    }
    
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull final ClosedRange<Byte> $this$contains, final int value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        final Byte it = toByteExactOrNull(value);
        final int n = 0;
        return it != null && $this$contains.contains(it);
    }
    
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull final ClosedRange<Short> $this$contains, final int value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        final Short it = toShortExactOrNull(value);
        final int n = 0;
        return it != null && $this$contains.contains(it);
    }
    
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "doubleRangeContains")
    @java.lang.Deprecated
    public static final boolean doubleRangeContains(@NotNull final ClosedRange<Double> $this$contains, final int value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains((double)value);
    }
    
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "floatRangeContains")
    @java.lang.Deprecated
    public static final boolean floatRangeContains(@NotNull final ClosedRange<Float> $this$contains, final int value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains(Float.valueOf(value));
    }
    
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull final ClosedRange<Integer> $this$contains, final long value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        final Integer it = toIntExactOrNull(value);
        final int n = 0;
        return it != null && $this$contains.contains(it);
    }
    
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull final ClosedRange<Byte> $this$contains, final long value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        final Byte it = toByteExactOrNull(value);
        final int n = 0;
        return it != null && $this$contains.contains(it);
    }
    
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull final ClosedRange<Short> $this$contains, final long value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        final Short it = toShortExactOrNull(value);
        final int n = 0;
        return it != null && $this$contains.contains(it);
    }
    
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "doubleRangeContains")
    @java.lang.Deprecated
    public static final boolean doubleRangeContains(@NotNull final ClosedRange<Double> $this$contains, final long value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains(Double.valueOf(value));
    }
    
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "floatRangeContains")
    @java.lang.Deprecated
    public static final boolean floatRangeContains(@NotNull final ClosedRange<Float> $this$contains, final long value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains(Float.valueOf(value));
    }
    
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull final ClosedRange<Integer> $this$contains, final short value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains((int)value);
    }
    
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull final ClosedRange<Long> $this$contains, final short value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains((long)value);
    }
    
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull final ClosedRange<Byte> $this$contains, final short value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        final Byte it = toByteExactOrNull(value);
        final int n = 0;
        return it != null && $this$contains.contains(it);
    }
    
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "doubleRangeContains")
    @java.lang.Deprecated
    public static final boolean doubleRangeContains(@NotNull final ClosedRange<Double> $this$contains, final short value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains((double)value);
    }
    
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name = "floatRangeContains")
    @java.lang.Deprecated
    public static final boolean floatRangeContains(@NotNull final ClosedRange<Float> $this$contains, final short value) {
        Intrinsics.checkParameterIsNotNull($this$contains, "$this$contains");
        return $this$contains.contains((float)value);
    }
    
    @NotNull
    public static final IntProgression downTo(final int $this$downTo, final byte to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }
    
    @NotNull
    public static final LongProgression downTo(final long $this$downTo, final byte to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1L);
    }
    
    @NotNull
    public static final IntProgression downTo(final byte $this$downTo, final byte to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }
    
    @NotNull
    public static final IntProgression downTo(final short $this$downTo, final byte to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }
    
    @NotNull
    public static final CharProgression downTo(final char $this$downTo, final char to) {
        return CharProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }
    
    @NotNull
    public static final IntProgression downTo(final int $this$downTo, final int to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }
    
    @NotNull
    public static final LongProgression downTo(final long $this$downTo, final int to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1L);
    }
    
    @NotNull
    public static final IntProgression downTo(final byte $this$downTo, final int to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }
    
    @NotNull
    public static final IntProgression downTo(final short $this$downTo, final int to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }
    
    @NotNull
    public static final LongProgression downTo(final int $this$downTo, final long to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1L);
    }
    
    @NotNull
    public static final LongProgression downTo(final long $this$downTo, final long to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1L);
    }
    
    @NotNull
    public static final LongProgression downTo(final byte $this$downTo, final long to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1L);
    }
    
    @NotNull
    public static final LongProgression downTo(final short $this$downTo, final long to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1L);
    }
    
    @NotNull
    public static final IntProgression downTo(final int $this$downTo, final short to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }
    
    @NotNull
    public static final LongProgression downTo(final long $this$downTo, final short to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1L);
    }
    
    @NotNull
    public static final IntProgression downTo(final byte $this$downTo, final short to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }
    
    @NotNull
    public static final IntProgression downTo(final short $this$downTo, final short to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }
    
    @NotNull
    public static final IntProgression reversed(@NotNull final IntProgression $this$reversed) {
        Intrinsics.checkParameterIsNotNull($this$reversed, "$this$reversed");
        return IntProgression.Companion.fromClosedRange($this$reversed.getLast(), $this$reversed.getFirst(), -$this$reversed.getStep());
    }
    
    @NotNull
    public static final LongProgression reversed(@NotNull final LongProgression $this$reversed) {
        Intrinsics.checkParameterIsNotNull($this$reversed, "$this$reversed");
        return LongProgression.Companion.fromClosedRange($this$reversed.getLast(), $this$reversed.getFirst(), -$this$reversed.getStep());
    }
    
    @NotNull
    public static final CharProgression reversed(@NotNull final CharProgression $this$reversed) {
        Intrinsics.checkParameterIsNotNull($this$reversed, "$this$reversed");
        return CharProgression.Companion.fromClosedRange($this$reversed.getLast(), $this$reversed.getFirst(), -$this$reversed.getStep());
    }
    
    @NotNull
    public static final IntProgression step(@NotNull final IntProgression $this$step, final int step) {
        Intrinsics.checkParameterIsNotNull($this$step, "$this$step");
        RangesKt__RangesKt.checkStepIsPositive(step > 0, step);
        return IntProgression.Companion.fromClosedRange($this$step.getFirst(), $this$step.getLast(), ($this$step.getStep() > 0) ? step : (-step));
    }
    
    @NotNull
    public static final LongProgression step(@NotNull final LongProgression $this$step, final long step) {
        Intrinsics.checkParameterIsNotNull($this$step, "$this$step");
        RangesKt__RangesKt.checkStepIsPositive(step > 0L, step);
        return LongProgression.Companion.fromClosedRange($this$step.getFirst(), $this$step.getLast(), ($this$step.getStep() > 0L) ? step : (-step));
    }
    
    @NotNull
    public static final CharProgression step(@NotNull final CharProgression $this$step, final int step) {
        Intrinsics.checkParameterIsNotNull($this$step, "$this$step");
        RangesKt__RangesKt.checkStepIsPositive(step > 0, step);
        return CharProgression.Companion.fromClosedRange($this$step.getFirst(), $this$step.getLast(), ($this$step.getStep() > 0) ? step : (-step));
    }
    
    @Nullable
    public static final Byte toByteExactOrNull(final int $this$toByteExactOrNull) {
        final int n = 127;
        if (-128 <= $this$toByteExactOrNull) {
            if (n >= $this$toByteExactOrNull) {
                return (byte)$this$toByteExactOrNull;
            }
        }
        return null;
    }
    
    @Nullable
    public static final Byte toByteExactOrNull(final long $this$toByteExactOrNull) {
        final long n = -128;
        final long n2 = 127;
        if (n <= $this$toByteExactOrNull) {
            if (n2 >= $this$toByteExactOrNull) {
                return (byte)$this$toByteExactOrNull;
            }
        }
        return null;
    }
    
    @Nullable
    public static final Byte toByteExactOrNull(final short $this$toByteExactOrNull) {
        final short n = -128;
        final short n2 = 127;
        if (n <= $this$toByteExactOrNull) {
            if (n2 >= $this$toByteExactOrNull) {
                return (byte)$this$toByteExactOrNull;
            }
        }
        return null;
    }
    
    @Nullable
    public static final Byte toByteExactOrNull(final double $this$toByteExactOrNull) {
        final double n = -128;
        final double n2 = 127;
        return ($this$toByteExactOrNull >= n && $this$toByteExactOrNull <= n2) ? Byte.valueOf((byte)$this$toByteExactOrNull) : null;
    }
    
    @Nullable
    public static final Byte toByteExactOrNull(final float $this$toByteExactOrNull) {
        final float n = -128;
        final float n2 = 127;
        return ($this$toByteExactOrNull >= n && $this$toByteExactOrNull <= n2) ? Byte.valueOf((byte)$this$toByteExactOrNull) : null;
    }
    
    @Nullable
    public static final Integer toIntExactOrNull(final long $this$toIntExactOrNull) {
        final long n = Integer.MIN_VALUE;
        final long n2 = Integer.MAX_VALUE;
        if (n <= $this$toIntExactOrNull) {
            if (n2 >= $this$toIntExactOrNull) {
                return (int)$this$toIntExactOrNull;
            }
        }
        return null;
    }
    
    @Nullable
    public static final Integer toIntExactOrNull(final double $this$toIntExactOrNull) {
        final double n = Integer.MIN_VALUE;
        final double n2 = Integer.MAX_VALUE;
        return ($this$toIntExactOrNull >= n && $this$toIntExactOrNull <= n2) ? Integer.valueOf((int)$this$toIntExactOrNull) : null;
    }
    
    @Nullable
    public static final Integer toIntExactOrNull(final float $this$toIntExactOrNull) {
        final float n = Integer.MIN_VALUE;
        final float n2 = Integer.MAX_VALUE;
        return ($this$toIntExactOrNull >= n && $this$toIntExactOrNull <= n2) ? Integer.valueOf((int)$this$toIntExactOrNull) : null;
    }
    
    @Nullable
    public static final Long toLongExactOrNull(final double $this$toLongExactOrNull) {
        final double n = Long.MIN_VALUE;
        final double n2 = Long.MAX_VALUE;
        return ($this$toLongExactOrNull >= n && $this$toLongExactOrNull <= n2) ? Long.valueOf((long)$this$toLongExactOrNull) : null;
    }
    
    @Nullable
    public static final Long toLongExactOrNull(final float $this$toLongExactOrNull) {
        final float n = Long.MIN_VALUE;
        final float n2 = Long.MAX_VALUE;
        return ($this$toLongExactOrNull >= n && $this$toLongExactOrNull <= n2) ? Long.valueOf((long)$this$toLongExactOrNull) : null;
    }
    
    @Nullable
    public static final Short toShortExactOrNull(final int $this$toShortExactOrNull) {
        final int n = 32767;
        if (-32768 <= $this$toShortExactOrNull) {
            if (n >= $this$toShortExactOrNull) {
                return (short)$this$toShortExactOrNull;
            }
        }
        return null;
    }
    
    @Nullable
    public static final Short toShortExactOrNull(final long $this$toShortExactOrNull) {
        final long n = -32768;
        final long n2 = 32767;
        if (n <= $this$toShortExactOrNull) {
            if (n2 >= $this$toShortExactOrNull) {
                return (short)$this$toShortExactOrNull;
            }
        }
        return null;
    }
    
    @Nullable
    public static final Short toShortExactOrNull(final double $this$toShortExactOrNull) {
        final double n = -32768;
        final double n2 = 32767;
        return ($this$toShortExactOrNull >= n && $this$toShortExactOrNull <= n2) ? Short.valueOf((short)$this$toShortExactOrNull) : null;
    }
    
    @Nullable
    public static final Short toShortExactOrNull(final float $this$toShortExactOrNull) {
        final float n = -32768;
        final float n2 = 32767;
        return ($this$toShortExactOrNull >= n && $this$toShortExactOrNull <= n2) ? Short.valueOf((short)$this$toShortExactOrNull) : null;
    }
    
    @NotNull
    public static final IntRange until(final int $this$until, final byte to) {
        return new IntRange($this$until, to - 1);
    }
    
    @NotNull
    public static final LongRange until(final long $this$until, final byte to) {
        return new LongRange($this$until, to - 1L);
    }
    
    @NotNull
    public static final IntRange until(final byte $this$until, final byte to) {
        return new IntRange($this$until, to - 1);
    }
    
    @NotNull
    public static final IntRange until(final short $this$until, final byte to) {
        return new IntRange($this$until, to - 1);
    }
    
    @NotNull
    public static final CharRange until(final char $this$until, final char to) {
        if (to <= '\0') {
            return CharRange.Companion.getEMPTY();
        }
        return new CharRange($this$until, (char)(to - '\u0001'));
    }
    
    @NotNull
    public static final IntRange until(final int $this$until, final int to) {
        if (to <= Integer.MIN_VALUE) {
            return IntRange.Companion.getEMPTY();
        }
        return new IntRange($this$until, to - 1);
    }
    
    @NotNull
    public static final LongRange until(final long $this$until, final int to) {
        return new LongRange($this$until, to - 1L);
    }
    
    @NotNull
    public static final IntRange until(final byte $this$until, final int to) {
        if (to <= Integer.MIN_VALUE) {
            return IntRange.Companion.getEMPTY();
        }
        return new IntRange($this$until, to - 1);
    }
    
    @NotNull
    public static final IntRange until(final short $this$until, final int to) {
        if (to <= Integer.MIN_VALUE) {
            return IntRange.Companion.getEMPTY();
        }
        return new IntRange($this$until, to - 1);
    }
    
    @NotNull
    public static final LongRange until(final int $this$until, final long to) {
        if (to <= Long.MIN_VALUE) {
            return LongRange.Companion.getEMPTY();
        }
        return new LongRange($this$until, to - 1L);
    }
    
    @NotNull
    public static final LongRange until(final long $this$until, final long to) {
        if (to <= Long.MIN_VALUE) {
            return LongRange.Companion.getEMPTY();
        }
        return new LongRange($this$until, to - 1L);
    }
    
    @NotNull
    public static final LongRange until(final byte $this$until, final long to) {
        if (to <= Long.MIN_VALUE) {
            return LongRange.Companion.getEMPTY();
        }
        return new LongRange($this$until, to - 1L);
    }
    
    @NotNull
    public static final LongRange until(final short $this$until, final long to) {
        if (to <= Long.MIN_VALUE) {
            return LongRange.Companion.getEMPTY();
        }
        return new LongRange($this$until, to - 1L);
    }
    
    @NotNull
    public static final IntRange until(final int $this$until, final short to) {
        return new IntRange($this$until, to - 1);
    }
    
    @NotNull
    public static final LongRange until(final long $this$until, final short to) {
        return new LongRange($this$until, to - 1L);
    }
    
    @NotNull
    public static final IntRange until(final byte $this$until, final short to) {
        return new IntRange($this$until, to - 1);
    }
    
    @NotNull
    public static final IntRange until(final short $this$until, final short to) {
        return new IntRange($this$until, to - 1);
    }
    
    @NotNull
    public static final <T extends Comparable<? super T>> T coerceAtLeast(@NotNull final T $this$coerceAtLeast, @NotNull final T minimumValue) {
        Intrinsics.checkParameterIsNotNull($this$coerceAtLeast, "$this$coerceAtLeast");
        Intrinsics.checkParameterIsNotNull(minimumValue, "minimumValue");
        return ($this$coerceAtLeast.compareTo((Object)minimumValue) < 0) ? minimumValue : $this$coerceAtLeast;
    }
    
    public static final byte coerceAtLeast(final byte $this$coerceAtLeast, final byte minimumValue) {
        return ($this$coerceAtLeast < minimumValue) ? minimumValue : $this$coerceAtLeast;
    }
    
    public static final short coerceAtLeast(final short $this$coerceAtLeast, final short minimumValue) {
        return ($this$coerceAtLeast < minimumValue) ? minimumValue : $this$coerceAtLeast;
    }
    
    public static final int coerceAtLeast(final int $this$coerceAtLeast, final int minimumValue) {
        return ($this$coerceAtLeast < minimumValue) ? minimumValue : $this$coerceAtLeast;
    }
    
    public static final long coerceAtLeast(final long $this$coerceAtLeast, final long minimumValue) {
        return ($this$coerceAtLeast < minimumValue) ? minimumValue : $this$coerceAtLeast;
    }
    
    public static final float coerceAtLeast(final float $this$coerceAtLeast, final float minimumValue) {
        return ($this$coerceAtLeast < minimumValue) ? minimumValue : $this$coerceAtLeast;
    }
    
    public static final double coerceAtLeast(final double $this$coerceAtLeast, final double minimumValue) {
        return ($this$coerceAtLeast < minimumValue) ? minimumValue : $this$coerceAtLeast;
    }
    
    @NotNull
    public static final <T extends Comparable<? super T>> T coerceAtMost(@NotNull final T $this$coerceAtMost, @NotNull final T maximumValue) {
        Intrinsics.checkParameterIsNotNull($this$coerceAtMost, "$this$coerceAtMost");
        Intrinsics.checkParameterIsNotNull(maximumValue, "maximumValue");
        return ($this$coerceAtMost.compareTo((Object)maximumValue) > 0) ? maximumValue : $this$coerceAtMost;
    }
    
    public static final byte coerceAtMost(final byte $this$coerceAtMost, final byte maximumValue) {
        return ($this$coerceAtMost > maximumValue) ? maximumValue : $this$coerceAtMost;
    }
    
    public static final short coerceAtMost(final short $this$coerceAtMost, final short maximumValue) {
        return ($this$coerceAtMost > maximumValue) ? maximumValue : $this$coerceAtMost;
    }
    
    public static final int coerceAtMost(final int $this$coerceAtMost, final int maximumValue) {
        return ($this$coerceAtMost > maximumValue) ? maximumValue : $this$coerceAtMost;
    }
    
    public static final long coerceAtMost(final long $this$coerceAtMost, final long maximumValue) {
        return ($this$coerceAtMost > maximumValue) ? maximumValue : $this$coerceAtMost;
    }
    
    public static final float coerceAtMost(final float $this$coerceAtMost, final float maximumValue) {
        return ($this$coerceAtMost > maximumValue) ? maximumValue : $this$coerceAtMost;
    }
    
    public static final double coerceAtMost(final double $this$coerceAtMost, final double maximumValue) {
        return ($this$coerceAtMost > maximumValue) ? maximumValue : $this$coerceAtMost;
    }
    
    @NotNull
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull final T $this$coerceIn, @Nullable final T minimumValue, @Nullable final T maximumValue) {
        Intrinsics.checkParameterIsNotNull($this$coerceIn, "$this$coerceIn");
        if (minimumValue != null && maximumValue != null) {
            if (minimumValue.compareTo((Object)maximumValue) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
            }
            if ($this$coerceIn.compareTo((Object)minimumValue) < 0) {
                return minimumValue;
            }
            if ($this$coerceIn.compareTo((Object)maximumValue) > 0) {
                return maximumValue;
            }
        }
        else {
            if (minimumValue != null && $this$coerceIn.compareTo((Object)minimumValue) < 0) {
                return minimumValue;
            }
            if (maximumValue != null && $this$coerceIn.compareTo((Object)maximumValue) > 0) {
                return maximumValue;
            }
        }
        return $this$coerceIn;
    }
    
    public static final byte coerceIn(final byte $this$coerceIn, final byte minimumValue, final byte maximumValue) {
        if (minimumValue > maximumValue) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
        }
        if ($this$coerceIn < minimumValue) {
            return minimumValue;
        }
        if ($this$coerceIn > maximumValue) {
            return maximumValue;
        }
        return $this$coerceIn;
    }
    
    public static final short coerceIn(final short $this$coerceIn, final short minimumValue, final short maximumValue) {
        if (minimumValue > maximumValue) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
        }
        if ($this$coerceIn < minimumValue) {
            return minimumValue;
        }
        if ($this$coerceIn > maximumValue) {
            return maximumValue;
        }
        return $this$coerceIn;
    }
    
    public static final int coerceIn(final int $this$coerceIn, final int minimumValue, final int maximumValue) {
        if (minimumValue > maximumValue) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
        }
        if ($this$coerceIn < minimumValue) {
            return minimumValue;
        }
        if ($this$coerceIn > maximumValue) {
            return maximumValue;
        }
        return $this$coerceIn;
    }
    
    public static final long coerceIn(final long $this$coerceIn, final long minimumValue, final long maximumValue) {
        if (minimumValue > maximumValue) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
        }
        if ($this$coerceIn < minimumValue) {
            return minimumValue;
        }
        if ($this$coerceIn > maximumValue) {
            return maximumValue;
        }
        return $this$coerceIn;
    }
    
    public static final float coerceIn(final float $this$coerceIn, final float minimumValue, final float maximumValue) {
        if (minimumValue > maximumValue) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
        }
        if ($this$coerceIn < minimumValue) {
            return minimumValue;
        }
        if ($this$coerceIn > maximumValue) {
            return maximumValue;
        }
        return $this$coerceIn;
    }
    
    public static final double coerceIn(final double $this$coerceIn, final double minimumValue, final double maximumValue) {
        if (minimumValue > maximumValue) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
        }
        if ($this$coerceIn < minimumValue) {
            return minimumValue;
        }
        if ($this$coerceIn > maximumValue) {
            return maximumValue;
        }
        return $this$coerceIn;
    }
    
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull final T $this$coerceIn, @NotNull final ClosedFloatingPointRange<T> range) {
        Intrinsics.checkParameterIsNotNull($this$coerceIn, "$this$coerceIn");
        Intrinsics.checkParameterIsNotNull(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return (range.lessThanOrEquals((Comparable<? super T>)$this$coerceIn, range.getStart()) && !range.lessThanOrEquals(range.getStart(), $this$coerceIn)) ? range.getStart() : ((range.lessThanOrEquals(range.getEndInclusive(), (Comparable<? super T>)$this$coerceIn) && !range.lessThanOrEquals((Comparable<? super T>)$this$coerceIn, range.getEndInclusive())) ? range.getEndInclusive() : $this$coerceIn);
    }
    
    @NotNull
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull final T $this$coerceIn, @NotNull final ClosedRange<T> range) {
        Intrinsics.checkParameterIsNotNull($this$coerceIn, "$this$coerceIn");
        Intrinsics.checkParameterIsNotNull(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return coerceIn($this$coerceIn, (ClosedFloatingPointRange<T>)range);
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return ($this$coerceIn.compareTo((Object)range.getStart()) < 0) ? range.getStart() : (($this$coerceIn.compareTo((Object)range.getEndInclusive()) > 0) ? range.getEndInclusive() : $this$coerceIn);
    }
    
    public static final int coerceIn(final int $this$coerceIn, @NotNull final ClosedRange<Integer> range) {
        Intrinsics.checkParameterIsNotNull(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return coerceIn(Integer.valueOf($this$coerceIn), (ClosedFloatingPointRange<Integer>)range).intValue();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return ($this$coerceIn < range.getStart().intValue()) ? range.getStart().intValue() : (($this$coerceIn > range.getEndInclusive().intValue()) ? range.getEndInclusive().intValue() : $this$coerceIn);
    }
    
    public static final long coerceIn(final long $this$coerceIn, @NotNull final ClosedRange<Long> range) {
        Intrinsics.checkParameterIsNotNull(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return coerceIn(Long.valueOf($this$coerceIn), (ClosedFloatingPointRange<Long>)range).longValue();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return ($this$coerceIn < range.getStart().longValue()) ? range.getStart().longValue() : (($this$coerceIn > range.getEndInclusive().longValue()) ? range.getEndInclusive().longValue() : $this$coerceIn);
    }
    
    public RangesKt___RangesKt() {
    }
}
