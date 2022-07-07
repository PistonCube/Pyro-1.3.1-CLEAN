// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.launcher;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import com.google.gson.Gson;
import java.io.File;

public class Config
{
    public static transient Config INSTANCE;
    public String username;
    public String password;
    public String channel;
    
    public Config() {
        this.username = null;
        this.password = null;
        this.channel = null;
    }
    
    public static void load() {
        try {
            if (new File("pyro/launcher.json").exists()) {
                final Gson gson = new Gson();
                final FileReader reader = new FileReader("pyro/launcher.json");
                Config.INSTANCE = (Config)gson.fromJson((Reader)reader, (Class)Config.class);
                reader.close();
            }
            else {
                Config.INSTANCE = new Config();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void save() {
        try {
            final Gson gson = new Gson();
            final FileWriter writer = new FileWriter("pyro/launcher.json");
            gson.toJson((Object)Config.INSTANCE, (Appendable)writer);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    static {
        Config.INSTANCE = new Config();
    }
}
