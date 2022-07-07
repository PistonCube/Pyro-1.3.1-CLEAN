// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.Style;
import com.google.gson.GsonBuilder;
import java.util.Map;
import net.minecraftforge.fml.client.config.GuiUtils;
import net.minecraft.client.renderer.GlStateManager;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod$EventHandler;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import com.google.gson.Gson;
import net.minecraft.client.settings.KeyBinding;
import java.io.File;
import net.minecraftforge.fml.common.Mod;

@Mod(modid = "pyroclient", name = "Pyro Client", version = "1.3.1", acceptedMinecraftVersions = "[1.12.2]")
public class Pyro
{
    public static final String MODID = "pyroclient";
    public static final String NAME = "Pyro Client";
    public static final String VERSION = "1.3.1";
    public static final String VERSIONTYPE = "Release";
    public static final File FOLDER;
    public static final File MODULESFOLDER;
    public static final File HUDMODULESFOLDER;
    public static final KeyBinding KEY;
    public static final Gson GSON;
    public static final ITextComponent prefix;
    public static Pyro INSTANCE;
    public static final f07 eventManager;
    public static final fU rotationManager;
    public static final fbP rotationUtils;
    public static final f41 notificationManager;
    private int lastChatLine;
    private static ResourceLocation WATERMARK;
    
    public Pyro() {
        this.lastChatLine = 420;
        Pyro.INSTANCE = this;
    }
    
    public static final f05 getEventManager() {
        return Pyro.eventManager;
    }
    
    public static final fU getRotationManager() {
        return Pyro.rotationManager;
    }
    
    public static fbP getRotationUtils() {
        return Pyro.rotationUtils;
    }
    
    public static f41 getNotificationManager() {
        return Pyro.notificationManager;
    }
    
    @Mod$EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        Pyro.INSTANCE = this;
        ClientRegistry.registerKeyBinding(Pyro.KEY);
        fy.c.3();
        fy.c.2();
        fA.c.1();
        fQ.c.3();
        this.register("Combat", f4N.c, 16721152);
        this.register("Combat", f4N.c, 7811649);
        this.register("Combat", f4N.c, 16590080);
        this.register("Combat", f4N.c, 10602124);
        this.register("Combat", f4N.c, 16065792);
        this.register("Combat", f4N.c, 10724261);
        this.register("Combat", f4N.c, 16396851);
        this.register("Combat", f4N.c, 10927747);
        this.register("Combat", f4N.c, 8912640);
        this.register("Combat", f4N.c, 13221015);
        this.register("Combat", f4N.c, 15018947);
        this.register("Combat", f4N.c, 6159434);
        this.register("Combat", f4N.c, 3657984);
        this.register("Combat", f4N.c, -1234904);
        this.register("Combat", f4N.c, 15925503);
        this.register("Combat", f4N.c, 11150242);
        this.register("Combat", f4N.c, 16281856);
        this.register("Combat", f4N.c, 16747264);
        this.register("Combat", f4N.c, 16749312);
        this.register("Combat", f4N.c, 65492);
        this.register("Combat", f4N.c, 6226575);
        this.register("Combat", f4N.c, 12136682);
        this.register("Combat", f4N.c, 7439241);
        this.register("Exploit", f4N.c, 5518690);
        this.register("Exploit", f4N.c, 187367);
        this.register("Exploit", f4N.c, 8645950);
        this.register("Exploit", f4N.c, 10323010);
        this.register("Exploit", f4N.c, 589568);
        this.register("Exploit", f4N.c, 15481627);
        this.register("Exploit", f4N.c, 1819821);
        this.register("Exploit", f4N.c, 4509108);
        this.register("Exploit", f4N.c, 711865);
        this.register("Exploit", f4N.c, 15658128);
        this.register("Movement", f4N.c, 14310417);
        this.register("Movement", f4N.c, 10066346);
        this.register("Movement", f4N.c, 3269598);
        this.register("Movement", f4N.c, 9154952);
        this.register("Movement", f4N.c, 9741652);
        this.register("Movement", f4N.c, 6618880);
        this.register("Movement", f4N.c, 3513281);
        this.register("Movement", f4N.c, 3513281);
        this.register("Movement", f4N.c, 1283104);
        this.register("Movement", f4N.c, 4431382);
        this.register("Movement", f4N.c, 16721152);
        this.register("Movement", f4N.c, 52221);
        this.register("Movement", f4N.c, 12034479);
        this.register("Movement", f4N.c, 5189976);
        this.register("Movement", f4N.c, 2212086);
        this.register("Movement", f4N.c, 1288070);
        this.register("Movement", f4N.c, 8639971);
        this.register("Movement", f4N.c, 4411349);
        this.register("Movement", f4N.c, 1832568);
        this.register("Movement", f4N.c, 4434825);
        this.register("Movement", f4N.c, 9425602);
        this.register("Movement", f4N.c, 4903164);
        this.register("Movement", f4N.c, 4508975);
        this.register("Movement", f4N.c, 3446712);
        this.register("Movement", f4N.c, 9153926);
        this.register("Movement", f4N.c, 9425609);
        this.register("Movement", f4N.c, 3716936);
        this.register("Movement", f4N.c, 2806225);
        this.register("Movement", f4N.c, 7155593);
        if (f4N.c.5()) {
            this.register("Movement", f4N.c);
        }
        this.register("Misc", f4N.c);
        this.register("Misc", f4N.c);
        this.register("Misc", f4N.c, 2538920);
        this.register("Misc", f4N.c, 5179488);
        this.register("Misc", f4N.c, 5329312);
        this.register("Misc", f4N.c, 8994454);
        this.register("Misc", f4N.c, 15442996);
        this.register("Misc", f4N.c, 5131916);
        this.register("Misc", f4N.c, 65396);
        this.register("Misc", f4N.c, 1135767);
        this.register("Misc", f4N.c, 511963);
        this.register("Misc", f4N.c, 5147629);
        this.register("Misc", f4N.c, 3461335);
        this.register("Misc", f4N.c, 16026208);
        this.register("Misc", f4N.c, 3461335);
        this.register("Misc", f4N.c, 3784010);
        this.register("Misc", f4N.c, 10363943);
        this.register("Misc", f4N.c, 48821);
        this.register("Misc", f4N.c, 65396);
        this.register("Misc", f4N.c, 1832677);
        this.register("Misc", f4N.c, 14344989);
        this.register("Misc", f4N.c, 15217925);
        this.register("Misc", f4N.c, 4501901);
        this.register("Misc", f4N.c, 11093169);
        this.register("Misc", f4N.c, 1171435);
        this.register("Misc", f4N.c, 9197478);
        this.register("Misc", f4N.c, 11995954);
        this.register("Render", f4N.c, 3251683);
        this.register("Render", f4N.c, 11016216);
        this.register("Render", f4N.c, 1893181);
        this.register("Render", f4N.c, 16228715);
        this.register("Render", f4N.c, -1);
        this.register("Render", f4N.c, 1832657);
        this.register("Render", f4N.c, 16751360);
        this.register("Render", f4N.c, 36863);
        this.register("Render", f4N.c, 16128841);
        this.register("Render", f4N.c, 16128920);
        this.register("Render", f4N.c, 10317736);
        this.register("Render", f4N.c, 12901754);
        this.register("Render", f4N.c);
        this.register("Render", f4N.c, 12662784);
        this.register("Render", f4N.c, 16128795);
        this.register("Render", f4N.c, -1);
        this.register("Render", f4N.c, 4372703);
        this.register("Render", f4N.c, -1);
        this.register("Render", f4N.c, 6048976);
        this.register("Render", f4N.c, 6115270);
        this.register("Render", f4N.c, 9569541);
        this.register("Render", f4N.c, 13290186);
        this.register("Render", f4N.c, 9361846);
        this.register("Render", f4N.c, 16711935);
        this.register("Render", f4N.c, 15755368);
        this.register("Render", f4N.c, 2111174);
        this.register("Render", f4N.c, 15755368);
        this.register("Render", f4N.c, 15755368);
        this.register("Render", f4N.c, 1498794);
        this.register("Render", f4N.c, 15025963);
        this.register("Render", f4N.c, 14128996);
        this.register("World", f4N.c, 6214907);
        this.register("World", f4N.c, 6466756);
        this.register("World", f4N.c, 1332280);
        this.register("World", f4N.c, 14120230);
        this.register("World", f4N.c, 11757871);
        this.register("World", f4N.c, 9543702);
        this.register("World", f4N.c, 9741652);
        this.register("World", f4N.c, 10004081);
        this.register("World", f4N.c, 15695380);
        this.register("World", f4N.c, 13398053);
        this.register("World", f4N.c, 13398053);
        this.register("World", f4N.c, 9498350);
        Config.load();
        FriendManager.loadFriends();
        fQ.c.2();
        Pyro.rotationManager.c();
        Pyro.rotationUtils.c();
        f4M.c.c();
        faG.c.0().2();
        f4.c.5();
        f6.c.c();
    }
    
    public void register(final String category, final fH module, final int color) {
        module.2(color);
        module.5(category);
        fQ.c.c(category).c(module);
    }
    
    public void register(final String category, final fH module) {
        this.register(category, module, -1);
    }
    
    public void sendAndKeepMessage(final String s) {
        Minecraft.func_71410_x().field_71456_v.func_146158_b().func_146234_a(new TextComponentString("").func_150257_a(Pyro.prefix).func_150257_a((ITextComponent)new TextComponentString(s)), 0);
    }
    
    public void sendMessage(final String s, final boolean clean) {
        if (clean) {
            this.sendMessage(s);
        }
        else {
            this.sendAndKeepMessage(s);
        }
    }
    
    public void sendMessage(final String s) {
        if (Minecraft.func_71410_x().field_71456_v != null) {
            Minecraft.func_71410_x().field_71456_v.func_146158_b().func_146242_c(this.lastChatLine);
            Minecraft.func_71410_x().field_71456_v.func_146158_b().func_146234_a(new TextComponentString("").func_150257_a(Pyro.prefix).func_150257_a((ITextComponent)new TextComponentString(s)), this.lastChatLine++);
            if (this.lastChatLine > 423) {
                this.lastChatLine = 420;
            }
        }
    }
    
    public static InputStream getResourceAsStream(final String resource) {
        if (PyroClientLoadingPlugin.resources.containsKey(resource)) {
            return new ByteArrayInputStream(PyroClientLoadingPlugin.resources.get(resource));
        }
        System.out.println("No resource found: " + resource + " - Searching classpath");
        System.out.println("Resource cache: " + PyroClientLoadingPlugin.resources.keySet());
        return Pyro.class.getResourceAsStream("/" + resource);
    }
    
    public static void drawWMMain() {
        GlStateManager.func_179094_E();
        GlStateManager.func_179147_l();
        GlStateManager.func_179141_d();
        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.func_179152_a(0.7f, 0.7f, 1.0f);
        GlStateManager.func_179094_E();
        GlStateManager.func_179139_a(0.5, 0.25, 0.0);
        Minecraft.func_71410_x().func_110434_K().func_110577_a(Pyro.WATERMARK);
        GuiUtils.drawTexturedModalRect(0, 0, 0, 0, 256, 256, 0.0f);
        GlStateManager.func_179121_F();
        fbs.1("Release 1.3.1", 56.0f, 43.0f, 15492635);
        GlStateManager.func_179121_F();
    }
    
    static Class getMapArrayClass() {
        return Map[].class;
    }
    
    static Class getMapClass() {
        return Map.class;
    }
    
    static {
        FOLDER = new File("pyro");
        MODULESFOLDER = new File("pyro/modules");
        HUDMODULESFOLDER = new File("pyro/hud");
        KEY = new KeyBinding("Open Pyro Gui", Minecraft.field_142025_a ? 43 : 157, "Pyro Client");
        GSON = new GsonBuilder().setPrettyPrinting().create();
        prefix = new TextComponentString("").func_150257_a(new TextComponentString("[").func_150255_a(new Style().func_150238_a(TextFormatting.DARK_RED).func_150227_a(Boolean.valueOf(true)))).func_150257_a(new TextComponentString("Pyro").func_150255_a(new Style().func_150238_a(TextFormatting.DARK_RED))).func_150257_a(new TextComponentString("] ").func_150255_a(new Style().func_150238_a(TextFormatting.DARK_RED).func_150227_a(Boolean.valueOf(true))));
        eventManager = new f07();
        rotationManager = new fU();
        rotationUtils = new fbP();
        notificationManager = new f41();
        Pyro.WATERMARK = new ResourceLocation("pyro:assets/textures/logotext.png");
    }
}
