// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.internal.jdk8;

import kotlin.random.jdk8.PlatformThreadLocalRandom;
import kotlin.random.Random;
import org.jetbrains.annotations.Nullable;
import kotlin.ranges.IntRange;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import org.jetbrains.annotations.NotNull;
import java.util.regex.MatchResult;
import kotlin.Metadata;
import kotlin.internal.jdk7.JDK7PlatformImplementations;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b" }, d2 = { "Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "()V", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "kotlin-stdlib-jdk8" })
public class JDK8PlatformImplementations extends JDK7PlatformImplementations
{
    @Nullable
    public MatchGroup getMatchResultNamedGroup(@NotNull final MatchResult matchResult, @NotNull final String name) {
        Intrinsics.checkParameterIsNotNull(matchResult, "matchResult");
        Intrinsics.checkParameterIsNotNull(name, "name");
        MatchResult matchResult2 = matchResult;
        if (!(matchResult instanceof Matcher)) {
            matchResult2 = null;
        }
        final Matcher matcher2 = (Matcher)matchResult2;
        if (matcher2 != null) {
            final Matcher matcher = matcher2;
            final IntRange range = new IntRange(matcher.start(name), matcher.end(name) - 1);
            MatchGroup matchGroup;
            if (range.getStart() >= 0) {
                final String group;
                matchGroup = new MatchGroup(group, range);
                group = matcher.group(name);
                Intrinsics.checkExpressionValueIsNotNull(group, "matcher.group(name)");
            }
            else {
                matchGroup = null;
            }
            return matchGroup;
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
    
    @NotNull
    public Random defaultPlatformRandom() {
        return new PlatformThreadLocalRandom();
    }
}
