// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.alt;

import org.jetbrains.annotations.Nullable;
import java.nio.charset.Charset;
import kotlin.TypeCastException;
import com.google.common.base.Charsets;
import kotlin.jvm.internal.Intrinsics;
import java.util.UUID;
import com.mojang.authlib.GameProfile;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B%\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\u0004¨\u0006#" }, d2 = { "Ldev/nuker/pyro/alt/Alt;", "", "username", "", "(Ljava/lang/String;)V", "email", "password", "uuid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "gameProfile", "Lcom/mojang/authlib/GameProfile;", "getGameProfile", "()Lcom/mojang/authlib/GameProfile;", "isCracked", "", "()Z", "getPassword", "setPassword", "getUsername", "setUsername", "getUuid", "setUuid", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "pyroclient" })
public final class Alt
{
    @NotNull
    private String email;
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String uuid;
    
    public final boolean isCracked() {
        return this.password.length() == 0;
    }
    
    @NotNull
    public final GameProfile getGameProfile() {
        return new GameProfile((this.uuid.length() == 0) ? null : UUID.fromString(this.uuid), this.username);
    }
    
    @NotNull
    public final String getEmail() {
        return this.email;
    }
    
    public final void setEmail(@NotNull final String <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.email = <set-?>;
    }
    
    @NotNull
    public final String getUsername() {
        return this.username;
    }
    
    public final void setUsername(@NotNull final String <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.username = <set-?>;
    }
    
    @NotNull
    public final String getPassword() {
        return this.password;
    }
    
    public final void setPassword(@NotNull final String <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.password = <set-?>;
    }
    
    @NotNull
    public final String getUuid() {
        return this.uuid;
    }
    
    public final void setUuid(@NotNull final String <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.uuid = <set-?>;
    }
    
    public Alt(@NotNull final String email, @NotNull final String username, @NotNull final String password, @NotNull final String uuid) {
        Intrinsics.checkParameterIsNotNull(email, "email");
        Intrinsics.checkParameterIsNotNull(username, "username");
        Intrinsics.checkParameterIsNotNull(password, "password");
        Intrinsics.checkParameterIsNotNull(uuid, "uuid");
        this.email = email;
        this.username = username;
        this.password = password;
        this.uuid = uuid;
    }
    
    public Alt(@NotNull final String username) {
        Intrinsics.checkParameterIsNotNull(username, "username");
        final String s = "";
        final String s2 = "";
        final String string = "OfflinePlayer:" + username;
        final Charset utf_8 = Charsets.UTF_8;
        Intrinsics.checkExpressionValueIsNotNull(utf_8, "Charsets.UTF_8");
        final Charset charset = utf_8;
        final String s3 = s2;
        final String s4 = s;
        final String s5 = string;
        if (s5 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final byte[] bytes = s5.getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        final byte[] name = bytes;
        final String email = s4;
        final String password = s3;
        final String string2 = UUID.nameUUIDFromBytes(name).toString();
        Intrinsics.checkExpressionValueIsNotNull(string2, "UUID.nameUUIDFromBytes(\"\u2026arsets.UTF_8)).toString()");
        this(email, username, password, string2);
    }
    
    @NotNull
    public final String component1() {
        return this.email;
    }
    
    @NotNull
    public final String component2() {
        return this.username;
    }
    
    @NotNull
    public final String component3() {
        return this.password;
    }
    
    @NotNull
    public final String component4() {
        return this.uuid;
    }
    
    @NotNull
    public final Alt copy(@NotNull final String email, @NotNull final String username, @NotNull final String password, @NotNull final String uuid) {
        Intrinsics.checkParameterIsNotNull(email, "email");
        Intrinsics.checkParameterIsNotNull(username, "username");
        Intrinsics.checkParameterIsNotNull(password, "password");
        Intrinsics.checkParameterIsNotNull(uuid, "uuid");
        return new Alt(email, username, password, uuid);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Alt(email=" + this.email + ", username=" + this.username + ", password=" + this.password + ", uuid=" + this.uuid + ")";
    }
    
    @Override
    public int hashCode() {
        final String email = this.email;
        final int n = ((email != null) ? email.hashCode() : 0) * 31;
        final String username = this.username;
        final int n2 = (n + ((username != null) ? username.hashCode() : 0)) * 31;
        final String password = this.password;
        final int n3 = (n2 + ((password != null) ? password.hashCode() : 0)) * 31;
        final String uuid = this.uuid;
        return n3 + ((uuid != null) ? uuid.hashCode() : 0);
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        if (this != o) {
            if (o instanceof Alt) {
                final Alt alt = (Alt)o;
                if (Intrinsics.areEqual(this.email, alt.email) && Intrinsics.areEqual(this.username, alt.username) && Intrinsics.areEqual(this.password, alt.password) && Intrinsics.areEqual(this.uuid, alt.uuid)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
