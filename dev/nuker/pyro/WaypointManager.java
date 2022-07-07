// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Set;
import java.io.FileWriter;
import java.io.Reader;
import java.io.FileReader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import java.util.Map;
import java.io.File;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\fJ\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016" }, d2 = { "Ldev/nuker/pyro/WaypointManager;", "", "()V", "folder", "Ljava/io/File;", "waypoints", "", "Ldev/nuker/pyro/Waypoint;", "getWaypoints", "()Ljava/util/Collection;", "waypointsMap", "", "", "deleteWaypoint", "", "waypoint", "findNextEmpty", "name", "getExistingFilename", "getFile", "load", "saveWaypoint", "pyroclient" })
public final class WaypointManager
{
    private static File folder;
    private static Map<String, Waypoint> waypointsMap;
    public static final WaypointManager INSTANCE;
    
    @NotNull
    public final Collection getWaypoints() {
        return WaypointManager.waypointsMap.values();
    }
    
    public final void load(@NotNull final String folder) {
        Intrinsics.checkParameterIsNotNull(folder, "folder");
        WaypointManager.folder = new File("pyro/server/" + folder + "/waypoints/");
        final File folder2 = WaypointManager.folder;
        if (folder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("folder");
        }
        folder2.mkdirs();
        WaypointManager.waypointsMap.clear();
        final File folder3 = WaypointManager.folder;
        if (folder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("folder");
        }
        final File[] listFiles = folder3.listFiles();
        Intrinsics.checkExpressionValueIsNotNull(listFiles, "this.folder.listFiles()");
        final Object[] $this$forEach$iv = listFiles;
        final int $i$f$forEach = 0;
        for (final File file : $this$forEach$iv) {
            final Object element$iv = file;
            final int n = 0;
            final FileReader it = new FileReader(file);
            final int n2 = 0;
            final Map<String, Waypoint> waypointsMap = WaypointManager.waypointsMap;
            final File value = file;
            Intrinsics.checkExpressionValueIsNotNull(value, "file");
            final String name = value.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "file.name");
            final Object fromJson = Pyro.GSON.fromJson((Reader)it, (Class)Waypoint.class);
            Intrinsics.checkExpressionValueIsNotNull(fromJson, "Pyro.GSON.fromJson(it, Waypoint::class.java)");
            waypointsMap.put(name, (Waypoint)fromJson);
            it.close();
        }
    }
    
    public final void deleteWaypoint(@NotNull final Waypoint waypoint) {
        Intrinsics.checkParameterIsNotNull(waypoint, "waypoint");
        if (WaypointManager.waypointsMap.containsValue(waypoint)) {
            final String filename = this.getExistingFilename(waypoint);
            if (filename != null) {
                WaypointManager.waypointsMap.remove(filename);
                new File(this.getFile(filename)).delete();
            }
        }
    }
    
    public final void saveWaypoint(@NotNull final Waypoint waypoint) {
        Intrinsics.checkParameterIsNotNull(waypoint, "waypoint");
        String s;
        if (WaypointManager.waypointsMap.containsValue(waypoint)) {
            if ((s = this.getExistingFilename(waypoint)) == null) {
                Intrinsics.throwNpe();
            }
        }
        else {
            s = this.findNextEmpty(waypoint.getName());
        }
        final String name = s;
        if (!WaypointManager.waypointsMap.containsValue(waypoint)) {
            WaypointManager.waypointsMap.put(name, waypoint);
        }
        final FileWriter it = new FileWriter(this.getFile(name));
        final int n = 0;
        Pyro.GSON.toJson((Object)waypoint, (Appendable)it);
        it.close();
    }
    
    private final String getFile(final String name) {
        final StringBuilder sb = new StringBuilder();
        final File folder = WaypointManager.folder;
        if (folder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("folder");
        }
        return sb.append(folder).append('/').append(name).append(".json").toString();
    }
    
    private final String getExistingFilename(final Waypoint waypoint) {
        final Iterable $this$firstOrNull$iv = WaypointManager.waypointsMap.entrySet();
        final int $i$f$firstOrNull = 0;
        while (true) {
            for (final Object element$iv : $this$firstOrNull$iv) {
                final Map.Entry it = (Map.Entry)element$iv;
                final int n = 0;
                if (Intrinsics.areEqual(it.getValue(), waypoint)) {
                    final Object o = element$iv;
                    final Map.Entry it2 = (Map.Entry)o;
                    final int n2 = 0;
                    final Map.Entry entry = it2;
                    return (entry != null) ? entry.getKey() : null;
                }
            }
            final Object o = null;
            continue;
        }
    }
    
    @NotNull
    public final String findNextEmpty(@NotNull final String name) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        String string;
        if (new File(name).exists()) {
            int num;
            for (num = 0; new File(name + '_' + num).exists(); ++num) {}
            string = name + '_' + num;
        }
        else {
            string = name;
        }
        return string;
    }
    
    private WaypointManager() {
    }
    
    static {
        INSTANCE = new WaypointManager();
        WaypointManager.waypointsMap = new LinkedHashMap<String, Waypoint>();
    }
}
