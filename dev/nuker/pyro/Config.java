// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import kotlin.jvm.JvmField;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n" }, d2 = { "Ldev/nuker/pyro/Config;", "", "()V", "chatPrefix", "", "rpcLine1", "rpcLine2", "seenInitialScreen", "", "Companion", "pyroclient" })
public final class Config
{
    @JvmField
    @NotNull
    public String chatPrefix;
    @JvmField
    public boolean seenInitialScreen;
    @JvmField
    @Nullable
    public String rpcLine1;
    @JvmField
    @Nullable
    public String rpcLine2;
    @JvmField
    @NotNull
    public static transient Config INSTANCE;
    public static final Config$Companion Companion;
    
    public Config() {
        this.chatPrefix = "$";
    }
    
    static {
        Companion = new Config$Companion(null);
        Config.INSTANCE = new Config();
    }
    
    @JvmStatic
    public static final void load() {
        Config.Companion.load();
    }
}
