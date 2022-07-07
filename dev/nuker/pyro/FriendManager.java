// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import kotlin.jvm.JvmStatic;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011" }, d2 = { "Ldev/nuker/pyro/FriendManager;", "", "()V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "friends", "", "Ldev/nuker/pyro/Friend;", "getFriends", "()Ljava/util/List;", "setFriends", "(Ljava/util/List;)V", "Companion", "pyroclient" })
public final class FriendManager
{
    private boolean enabled;
    @NotNull
    private List<f8> friends;
    @NotNull
    private static FriendManager INSTANCE;
    public static final FriendManager$Companion Companion;
    
    public final boolean getEnabled() {
        return this.enabled;
    }
    
    public final void setEnabled(final boolean <set-?>) {
        this.enabled = <set-?>;
    }
    
    @NotNull
    public final List getFriends() {
        return this.friends;
    }
    
    public final void setFriends(@NotNull final List <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.friends = (List<f8>)<set-?>;
    }
    
    public FriendManager() {
        this.enabled = true;
        this.friends = new ArrayList<f8>();
    }
    
    static {
        Companion = new FriendManager$Companion(null);
        FriendManager.INSTANCE = new FriendManager();
    }
    
    @JvmStatic
    public static final void loadFriends() {
        FriendManager.Companion.loadFriends();
    }
}
