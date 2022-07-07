// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.alt;

import java.util.ArrayList;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.Reader;
import java.io.FileReader;
import java.io.File;
import com.google.gson.Gson;
import java.io.IOException;
import dev.nuker.pyro.Pyro;
import java.io.FileWriter;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.net.URL;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.AuthenticationException;
import java.lang.reflect.InvocationTargetException;
import com.google.common.collect.Multimap;
import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;
import com.mojang.authlib.yggdrasil.response.MinecraftProfilePropertiesResponse;
import kotlin.TypeCastException;
import net.minecraft.client.Minecraft;
import com.mojang.authlib.HttpAuthenticationService;
import com.mojang.util.UUIDTypeAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Intrinsics;
import java.util.function.Predicate;
import org.jetbrains.annotations.Nullable;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import com.mojang.authlib.GameProfile;
import java.util.List;
import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J \u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014J \u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00052\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\u0017R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001c" }, d2 = { "Ldev/nuker/pyro/alt/AltManager;", "", "()V", "alts", "", "Ldev/nuker/pyro/alt/Alt;", "getAlts", "()Ljava/util/List;", "filledProfiles", "Lcom/mojang/authlib/GameProfile;", "makeRequestMethod", "Ljava/lang/reflect/Method;", "storage", "Ldev/nuker/pyro/alt/AltManager$AltStorage;", "addAlt", "", "alt", "fillProfileAsync", "profile", "callback", "Ljava/util/function/Consumer;", "getAltProfile", "loadAlts", "", "makeFirst", "removeAlt", "saveAlts", "AltStorage", "pyroclient" })
public final class AltManager
{
    private static final Method makeRequestMethod;
    private static final List<GameProfile> filledProfiles;
    private static AltManager$AltStorage storage;
    public static final AltManager INSTANCE;
    
    @NotNull
    public final GameProfile fillProfileAsync(@NotNull final GameProfile profile, @Nullable final Consumer callback) {
        @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003" }, d2 = { "<anonymous>", "", "invoke", "dev/nuker/pyro/alt/AltManager$fillProfileAsync$1$4" })
        final class AltManager$fillProfileAsync$$inlined$synchronized$lambda$4 extends Lambda implements Function0
        {
            final /* synthetic */ GameProfile $profile$inlined;
            final /* synthetic */ Consumer $callback$inlined;
            
            AltManager$fillProfileAsync$$inlined$synchronized$lambda$4(final GameProfile $profile$inlined, final Consumer $callback$inlined) {
                this.$profile$inlined = $profile$inlined;
                this.$callback$inlined = $callback$inlined;
                super(0);
            }
            
            @Override
            public final void invoke() {
                try {
                    URL url = HttpAuthenticationService.constantURL("https://sessionserver.mojang.com/session/minecraft/profile/" + UUIDTypeAdapter.fromUUID(this.$profile$inlined.getId()));
                    url = HttpAuthenticationService.concatenateURL(url, "unsigned=false");
                    final Method access$getMakeRequestMethod$p = AltManager.access$getMakeRequestMethod$p(AltManager.INSTANCE);
                    final Minecraft func_71410_x = Minecraft.func_71410_x();
                    Intrinsics.checkExpressionValueIsNotNull(func_71410_x, "Minecraft.getMinecraft()");
                    final MinecraftSessionService func_152347_ac = func_71410_x.func_152347_ac();
                    if (func_152347_ac == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService");
                    }
                    final MinecraftProfilePropertiesResponse response = (MinecraftProfilePropertiesResponse)access$getMakeRequestMethod$p.invoke(((YggdrasilMinecraftSessionService)func_152347_ac).getAuthenticationService(), url, null, MinecraftProfilePropertiesResponse.class);
                    if (response != null) {
                        final GameProfile result = new GameProfile(response.getId(), response.getName());
                        result.getProperties().putAll((Multimap)response.getProperties());
                        this.$profile$inlined.getProperties().putAll((Multimap)response.getProperties());
                        AltManager.access$getFilledProfiles$p(AltManager.INSTANCE).add(result);
                        final Consumer $callback$inlined = this.$callback$inlined;
                        if ($callback$inlined != null) {
                            $callback$inlined.accept(this.$profile$inlined);
                        }
                    }
                }
                catch (InvocationTargetException ex) {}
                catch (AuthenticationException ex2) {}
                catch (AuthenticationUnavailableException ex3) {}
                final Minecraft func_71410_x2 = Minecraft.func_71410_x();
                Intrinsics.checkExpressionValueIsNotNull(func_71410_x2, "Minecraft.getMinecraft()");
                func_71410_x2.func_152347_ac().fillProfileProperties(this.$profile$inlined, true);
                AltManager.access$getFilledProfiles$p(AltManager.INSTANCE).add(this.$profile$inlined);
            }
        }
        @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006" }, d2 = { "<anonymous>", "", "it", "Lcom/mojang/authlib/GameProfile;", "kotlin.jvm.PlatformType", "test", "dev/nuker/pyro/alt/AltManager$fillProfileAsync$1$3" })
        final class AltManager$fillProfileAsync$$inlined$synchronized$lambda$3 implements Predicate
        {
            final /* synthetic */ GameProfile $profile$inlined;
            final /* synthetic */ Consumer $callback$inlined;
            
            AltManager$fillProfileAsync$$inlined$synchronized$lambda$3(final GameProfile $profile$inlined, final Consumer $callback$inlined) {
                this.$profile$inlined = $profile$inlined;
                this.$callback$inlined = $callback$inlined;
            }
            
            public final boolean test(final GameProfile it) {
                Intrinsics.checkExpressionValueIsNotNull(it, "it");
                return Intrinsics.areEqual(it.getId(), this.$profile$inlined.getId());
            }
        }
        @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006" }, d2 = { "<anonymous>", "", "it", "Lcom/mojang/authlib/GameProfile;", "kotlin.jvm.PlatformType", "test", "dev/nuker/pyro/alt/AltManager$fillProfileAsync$1$2" })
        final class AltManager$fillProfileAsync$$inlined$synchronized$lambda$2 implements Predicate
        {
            final /* synthetic */ GameProfile $profile$inlined;
            final /* synthetic */ Consumer $callback$inlined;
            
            AltManager$fillProfileAsync$$inlined$synchronized$lambda$2(final GameProfile $profile$inlined, final Consumer $callback$inlined) {
                this.$profile$inlined = $profile$inlined;
                this.$callback$inlined = $callback$inlined;
            }
            
            public final boolean test(final GameProfile it) {
                Intrinsics.checkExpressionValueIsNotNull(it, "it");
                return Intrinsics.areEqual(it.getId(), this.$profile$inlined.getId());
            }
        }
        @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006" }, d2 = { "<anonymous>", "", "it", "Lcom/mojang/authlib/GameProfile;", "kotlin.jvm.PlatformType", "test", "dev/nuker/pyro/alt/AltManager$fillProfileAsync$1$1" })
        final class AltManager$fillProfileAsync$$inlined$synchronized$lambda$1 implements Predicate
        {
            final /* synthetic */ GameProfile $profile$inlined;
            final /* synthetic */ Consumer $callback$inlined;
            
            AltManager$fillProfileAsync$$inlined$synchronized$lambda$1(final GameProfile $profile$inlined, final Consumer $callback$inlined) {
                this.$profile$inlined = $profile$inlined;
                this.$callback$inlined = $callback$inlined;
            }
            
            public final boolean test(final GameProfile it) {
                return it != null && Intrinsics.areEqual(it.getId(), this.$profile$inlined.getId());
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "profile"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: getstatic       dev/nuker/pyro/alt/AltManager.filledProfiles:Ljava/util/List;
        //     9: astore_3       
        //    10: iconst_0       
        //    11: istore          4
        //    13: iconst_0       
        //    14: istore          5
        //    16: aload_3        
        //    17: monitorenter   
        //    18: nop            
        //    19: iconst_0       
        //    20: istore          $i$a$-synchronized-AltManager$fillProfileAsync$1
        //    22: getstatic       dev/nuker/pyro/alt/AltManager.filledProfiles:Ljava/util/List;
        //    25: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //    30: new             Ldev/nuker/pyro/alt/AltManager$fillProfileAsync$$inlined$synchronized$lambda$1;
        //    33: dup            
        //    34: aload_1         /* profile */
        //    35: aload_2         /* callback */
        //    36: invokespecial   dev/nuker/pyro/alt/AltManager$fillProfileAsync$$inlined$synchronized$lambda$1.<init>:(Lcom/mojang/authlib/GameProfile;Ljava/util/function/Consumer;)V
        //    39: checkcast       Ljava/util/function/Predicate;
        //    42: invokeinterface java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
        //    47: ifeq            146
        //    50: aload_2         /* callback */
        //    51: dup            
        //    52: ifnull          96
        //    55: getstatic       dev/nuker/pyro/alt/AltManager.filledProfiles:Ljava/util/List;
        //    58: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //    63: new             Ldev/nuker/pyro/alt/AltManager$fillProfileAsync$$inlined$synchronized$lambda$2;
        //    66: dup            
        //    67: aload_1         /* profile */
        //    68: aload_2         /* callback */
        //    69: invokespecial   dev/nuker/pyro/alt/AltManager$fillProfileAsync$$inlined$synchronized$lambda$2.<init>:(Lcom/mojang/authlib/GameProfile;Ljava/util/function/Consumer;)V
        //    72: checkcast       Ljava/util/function/Predicate;
        //    75: invokeinterface java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        //    80: invokeinterface java/util/stream/Stream.findAny:()Ljava/util/Optional;
        //    85: invokevirtual   java/util/Optional.get:()Ljava/lang/Object;
        //    88: invokeinterface java/util/function/Consumer.accept:(Ljava/lang/Object;)V
        //    93: goto            97
        //    96: pop            
        //    97: getstatic       dev/nuker/pyro/alt/AltManager.filledProfiles:Ljava/util/List;
        //   100: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //   105: new             Ldev/nuker/pyro/alt/AltManager$fillProfileAsync$$inlined$synchronized$lambda$3;
        //   108: dup            
        //   109: aload_1         /* profile */
        //   110: aload_2         /* callback */
        //   111: invokespecial   dev/nuker/pyro/alt/AltManager$fillProfileAsync$$inlined$synchronized$lambda$3.<init>:(Lcom/mojang/authlib/GameProfile;Ljava/util/function/Consumer;)V
        //   114: checkcast       Ljava/util/function/Predicate;
        //   117: invokeinterface java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        //   122: invokeinterface java/util/stream/Stream.findAny:()Ljava/util/Optional;
        //   127: invokevirtual   java/util/Optional.get:()Ljava/lang/Object;
        //   130: dup            
        //   131: ldc             "filledProfiles.stream().\u2026file.id }.findAny().get()"
        //   133: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   136: checkcast       Lcom/mojang/authlib/GameProfile;
        //   139: astore          8
        //   141: aload_3        
        //   142: monitorexit    
        //   143: aload           8
        //   145: areturn        
        //   146: iconst_1       
        //   147: iconst_0       
        //   148: aconst_null    
        //   149: aconst_null    
        //   150: iconst_0       
        //   151: new             Ldev/nuker/pyro/alt/AltManager$fillProfileAsync$$inlined$synchronized$lambda$4;
        //   154: dup            
        //   155: aload_1         /* profile */
        //   156: aload_2         /* callback */
        //   157: invokespecial   dev/nuker/pyro/alt/AltManager$fillProfileAsync$$inlined$synchronized$lambda$4.<init>:(Lcom/mojang/authlib/GameProfile;Ljava/util/function/Consumer;)V
        //   160: checkcast       Lkotlin/jvm/functions/Function0;
        //   163: bipush          30
        //   165: aconst_null    
        //   166: invokestatic    kotlin/concurrent/ThreadsKt.thread$default:(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;
        //   169: pop            
        //   170: aload_1         /* profile */
        //   171: astore          7
        //   173: aload_3        
        //   174: monitorexit    
        //   175: aload           7
        //   177: areturn        
        //   178: astore          5
        //   180: aload_3        
        //   181: monitorexit    
        //   182: aload           5
        //   184: athrow         
        //    StackMapTable: 00 04 FF 00 60 00 07 07 00 03 07 00 6E 07 00 60 07 00 3B 01 01 01 00 01 07 00 60 00 30 FF 00 1F 00 05 07 00 03 07 00 6E 07 00 60 07 00 3B 01 00 01 07 00 7E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  18     141    178    185    Any
        //  146    173    178    185    Any
        //  178    180    178    185    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:344)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:173)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:169)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:547)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:439)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformSynchronized(AstMethodBodyBuilder.java:529)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:375)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final GameProfile getAltProfile(@NotNull final Alt alt, @Nullable final Consumer callback) {
        @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "it", "Lcom/mojang/authlib/GameProfile;", "accept" })
        final class AltManager$getAltProfile$1 implements Consumer
        {
            final /* synthetic */ Consumer $callback;
            final /* synthetic */ Alt $alt;
            
            public final void accept(@NotNull final GameProfile it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                final Consumer $callback = this.$callback;
                if ($callback != null) {
                    $callback.accept(it);
                }
                if (AltManager.INSTANCE.getAlts().contains(this.$alt) && !this.$alt.isCracked() && (Intrinsics.areEqual(this.$alt.getUsername(), it.getName()) ^ true)) {
                    final Alt $alt = this.$alt;
                    final String name = it.getName();
                    Intrinsics.checkExpressionValueIsNotNull(name, "it.name");
                    $alt.setUsername(name);
                    AltManager.INSTANCE.saveAlts();
                }
            }
            
            AltManager$getAltProfile$1(final Consumer $callback, final Alt $alt) {
                this.$callback = $callback;
                this.$alt = $alt;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "alt"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: aload_1         /* alt */
        //     8: invokevirtual   dev/nuker/pyro/alt/Alt.getGameProfile:()Lcom/mojang/authlib/GameProfile;
        //    11: new             Ldev/nuker/pyro/alt/AltManager$getAltProfile$1;
        //    14: dup            
        //    15: aload_2         /* callback */
        //    16: aload_1         /* alt */
        //    17: invokespecial   dev/nuker/pyro/alt/AltManager$getAltProfile$1.<init>:(Ljava/util/function/Consumer;Ldev/nuker/pyro/alt/Alt;)V
        //    20: checkcast       Ljava/util/function/Consumer;
        //    23: invokevirtual   dev/nuker/pyro/alt/AltManager.fillProfileAsync:(Lcom/mojang/authlib/GameProfile;Ljava/util/function/Consumer;)Lcom/mojang/authlib/GameProfile;
        //    26: areturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:344)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:173)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:169)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:547)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final List getAlts() {
        final AltManager$AltStorage storage = AltManager.storage;
        if (storage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storage");
        }
        return storage.getAlts();
    }
    
    public final boolean addAlt(@NotNull final Alt alt) {
        Intrinsics.checkParameterIsNotNull(alt, "alt");
        boolean b;
        if (this.getAlts().contains(alt)) {
            b = false;
        }
        else {
            this.getAlts().add(alt);
            this.saveAlts();
            b = true;
        }
        return b;
    }
    
    public final void removeAlt(@NotNull final Alt alt) {
        Intrinsics.checkParameterIsNotNull(alt, "alt");
        this.getAlts().remove(alt);
        this.saveAlts();
    }
    
    public final void makeFirst(@NotNull final Alt alt) {
        Intrinsics.checkParameterIsNotNull(alt, "alt");
        this.getAlts().remove(alt);
        this.getAlts().add(0, alt);
        this.saveAlts();
    }
    
    public final void saveAlts() {
        try {
            final FileWriter writer = new FileWriter("pyro/alts.json");
            final Gson gson = Pyro.GSON;
            final AltManager$AltStorage storage = AltManager.storage;
            if (storage == null) {
                Intrinsics.throwUninitializedPropertyAccessException("storage");
            }
            gson.toJson((Object)storage, (Appendable)writer);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public final void loadAlts() {
        if (new File("pyro/alts.json").exists()) {
            try {
                final FileReader reader = new FileReader("pyro/alts.json");
                final Object fromJson = Pyro.GSON.fromJson((Reader)reader, (Class)AltManager$AltStorage.class);
                Intrinsics.checkExpressionValueIsNotNull(fromJson, "Pyro.GSON.fromJson(reader, AltStorage::class.java)");
                AltManager.storage = (AltManager$AltStorage)fromJson;
                reader.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            AltManager.storage = new AltManager$AltStorage();
        }
    }
    
    private AltManager() {
    }
    
    static {
        final AltManager altManager = INSTANCE = new AltManager();
        final Method declaredMethod;
        final Method method = declaredMethod = YggdrasilAuthenticationService.class.getDeclaredMethod("makeRequest", URL.class, Object.class, Class.class);
        Intrinsics.checkExpressionValueIsNotNull(declaredMethod, "method");
        declaredMethod.setAccessible(true);
        makeRequestMethod = method;
        altManager.loadAlts();
        filledProfiles = new ArrayList<GameProfile>();
    }
    
    public static final /* synthetic */ Method access$getMakeRequestMethod$p(final AltManager $this) {
        return AltManager.makeRequestMethod;
    }
    
    public static final /* synthetic */ List access$getFilledProfiles$p(final AltManager $this) {
        return AltManager.filledProfiles;
    }
}
