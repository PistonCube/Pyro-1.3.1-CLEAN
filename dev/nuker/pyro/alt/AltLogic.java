// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.alt;

import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import java.net.InetAddress;
import java.util.UUID;
import com.google.common.base.Charsets;
import net.minecraft.util.Session;
import net.minecraft.client.Minecraft;
import dev.nuker.pyro.mixin.MinecraftAccessor;
import com.mojang.util.UUIDTypeAdapter;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;

public class AltLogic
{
    private static final YggdrasilAuthenticationService yas;
    public static final YggdrasilUserAuthentication yua;
    private static final YggdrasilMinecraftSessionService ymss;
    
    public static int login(final String user, final String password) {
        AltLogic.yua.setUsername(user);
        AltLogic.yua.setPassword(password);
        try {
            AltLogic.yua.logIn();
        }
        catch (AuthenticationException e) {
            if (e instanceof AuthenticationUnavailableException) {
                return 2;
            }
            return 1;
        }
        final String username = AltLogic.yua.getSelectedProfile().getName();
        final String uuid = UUIDTypeAdapter.fromUUID(AltLogic.yua.getSelectedProfile().getId());
        final String access = AltLogic.yua.getAuthenticatedToken();
        final String type = AltLogic.yua.getUserType().getName();
        ((MinecraftAccessor)Minecraft.func_71410_x()).setSession(new Session(username, uuid, access, type));
        AltLogic.yua.logOut();
        return 0;
    }
    
    public static int verifyCredentials(final String user, final String password) {
        AltLogic.yua.setUsername(user);
        AltLogic.yua.setPassword(password);
        try {
            AltLogic.yua.logIn();
        }
        catch (AuthenticationException e) {
            if (e instanceof AuthenticationUnavailableException) {
                return 2;
            }
            return 1;
        }
        return 0;
    }
    
    public static boolean loginOffline(final String username) {
        final UUID uuid = UUID.nameUUIDFromBytes(("OfflinePlayer:" + username).getBytes(Charsets.UTF_8));
        ((MinecraftAccessor)Minecraft.func_71410_x()).setSession(new Session(username, uuid.toString(), "invalid", "legacy"));
        return true;
    }
    
    public static boolean isOffline() {
        return Minecraft.func_71410_x().func_110432_I().func_148256_e().getId().equals(UUID.nameUUIDFromBytes(("OfflinePlayer:" + Minecraft.func_71410_x().func_110432_I().func_111285_a()).getBytes(Charsets.UTF_8)));
    }
    
    public static boolean sessionValid() {
        try {
            final GameProfile gp = Minecraft.func_71410_x().func_110432_I().func_148256_e();
            final String token = Minecraft.func_71410_x().func_110432_I().func_148254_d();
            final String id = UUID.randomUUID().toString();
            AltLogic.ymss.joinServer(gp, token, id);
            if (AltLogic.ymss.hasJoinedServer(gp, id, (InetAddress)null).isComplete()) {
                return true;
            }
        }
        catch (Exception e) {
            return false;
        }
        return false;
    }
    
    static {
        yas = new YggdrasilAuthenticationService(Minecraft.func_71410_x().func_110437_J(), UUID.randomUUID().toString());
        yua = (YggdrasilUserAuthentication)AltLogic.yas.createUserAuthentication(Agent.MINECRAFT);
        ymss = (YggdrasilMinecraftSessionService)AltLogic.yas.createMinecraftSessionService();
    }
}
