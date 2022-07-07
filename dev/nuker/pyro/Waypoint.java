// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import org.jetbrains.annotations.Nullable;
import kotlin.jvm.internal.Intrinsics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003JA\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\nH\u00d6\u0001J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006'" }, d2 = { "Ldev/nuker/pyro/Waypoint;", "", "name", "", "x", "", "y", "z", "dimensions", "", "", "(Ljava/lang/String;DDDLjava/util/List;)V", "getDimensions", "()Ljava/util/List;", "setDimensions", "(Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getX", "()D", "setX", "(D)V", "getY", "setY", "getZ", "setZ", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "pyroclient" })
public final class Waypoint
{
    @NotNull
    private String name;
    private double x;
    private double y;
    private double z;
    @NotNull
    private List<Integer> dimensions;
    
    @NotNull
    public final String getName() {
        return this.name;
    }
    
    public final void setName(@NotNull final String <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.name = <set-?>;
    }
    
    public final double getX() {
        return this.x;
    }
    
    public final void setX(final double <set-?>) {
        this.x = <set-?>;
    }
    
    public final double getY() {
        return this.y;
    }
    
    public final void setY(final double <set-?>) {
        this.y = <set-?>;
    }
    
    public final double getZ() {
        return this.z;
    }
    
    public final void setZ(final double <set-?>) {
        this.z = <set-?>;
    }
    
    @NotNull
    public final List getDimensions() {
        return this.dimensions;
    }
    
    public final void setDimensions(@NotNull final List <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.dimensions = (List<Integer>)<set-?>;
    }
    
    public Waypoint(@NotNull final String name, final double x, final double y, final double z, @NotNull final List dimensions) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(dimensions, "dimensions");
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.dimensions = (List<Integer>)dimensions;
    }
    
    @NotNull
    public final String component1() {
        return this.name;
    }
    
    public final double component2() {
        return this.x;
    }
    
    public final double component3() {
        return this.y;
    }
    
    public final double component4() {
        return this.z;
    }
    
    @NotNull
    public final List component5() {
        return this.dimensions;
    }
    
    @NotNull
    public final Waypoint copy(@NotNull final String name, final double x, final double y, final double z, @NotNull final List dimensions) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(dimensions, "dimensions");
        return new Waypoint(name, x, y, z, dimensions);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Waypoint(name=" + this.name + ", x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", dimensions=" + this.dimensions + ")";
    }
    
    @Override
    public int hashCode() {
        final String name = this.name;
        final int n = (((((name != null) ? name.hashCode() : 0) * 31 + Double.hashCode(this.x)) * 31 + Double.hashCode(this.y)) * 31 + Double.hashCode(this.z)) * 31;
        final List<Integer> dimensions = this.dimensions;
        return n + ((dimensions != null) ? dimensions.hashCode() : 0);
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        if (this != o) {
            if (o instanceof Waypoint) {
                final Waypoint waypoint = (Waypoint)o;
                if (Intrinsics.areEqual(this.name, waypoint.name) && Double.compare(this.x, waypoint.x) == 0 && Double.compare(this.y, waypoint.y) == 0 && Double.compare(this.z, waypoint.z) == 0 && Intrinsics.areEqual(this.dimensions, waypoint.dimensions)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
