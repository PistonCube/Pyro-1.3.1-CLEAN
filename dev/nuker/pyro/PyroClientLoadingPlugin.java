// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.util.HashMap;
import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import dev.nuker.pyro.launcher.LoadingPluginImpl;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin$MCVersion;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin$MCVersion("1.12.2")
public class PyroClientLoadingPlugin implements IFMLLoadingPlugin
{
    public static Logger LOG;
    public static Map<String, byte[]> resources;
    public static Thread baseThread;
    
    public static InputStream getResourceAsStream(final String name) {
        if (PyroClientLoadingPlugin.resources.containsKey(name)) {
            return new ByteArrayInputStream(PyroClientLoadingPlugin.resources.get(name));
        }
        return PyroClientLoadingPlugin.class.getResourceAsStream(name);
    }
    
    public static void shutdown() {
        SecManReplace.replaceSecurityManager((SecurityManager)new BetterSecurityManager());
        System.exit(0);
    }
    
    public String[] getASMTransformerClass() {
        return LoadingPluginImpl.getASMTransformerClass();
    }
    
    public String getModContainerClass() {
        return LoadingPluginImpl.getModContainerClass();
    }
    
    @Nullable
    public String getSetupClass() {
        return LoadingPluginImpl.getSetupClass();
    }
    
    public void injectData(final Map data) {
        LoadingPluginImpl.injectData(data);
    }
    
    public String getAccessTransformerClass() {
        return LoadingPluginImpl.getAccessTransformerClass();
    }
    
    static {
        PyroClientLoadingPlugin.LOG = LogManager.getLogger("Pyro Client");
        PyroClientLoadingPlugin.resources = new HashMap<String, byte[]>();
        PyroClientLoadingPlugin.baseThread = Thread.currentThread();
    }
}
