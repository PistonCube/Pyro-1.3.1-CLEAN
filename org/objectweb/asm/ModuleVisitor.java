// 
// Decompiled by Procyon v0.5.36
// 

package org.objectweb.asm;

public abstract class ModuleVisitor
{
    protected final int api;
    protected ModuleVisitor mv;
    
    public ModuleVisitor(final int api) {
        this(api, null);
    }
    
    public ModuleVisitor(final int api, final ModuleVisitor moduleVisitor) {
        if (api != 524288 && api != 458752 && api != 393216 && api != 327680 && api != 262144 && api != 17367040) {
            throw new IllegalArgumentException("Unsupported api " + api);
        }
        if (api == 17367040) {
            Constants.checkAsmExperimental(this);
        }
        this.api = api;
        this.mv = moduleVisitor;
    }
    
    public void visitMainClass(final String mainClass) {
        if (this.mv != null) {
            this.mv.visitMainClass(mainClass);
        }
    }
    
    public void visitPackage(final String packaze) {
        if (this.mv != null) {
            this.mv.visitPackage(packaze);
        }
    }
    
    public void visitRequire(final String module, final int access, final String version) {
        if (this.mv != null) {
            this.mv.visitRequire(module, access, version);
        }
    }
    
    public void visitExport(final String packaze, final int access, final String... modules) {
        if (this.mv != null) {
            this.mv.visitExport(packaze, access, modules);
        }
    }
    
    public void visitOpen(final String packaze, final int access, final String... modules) {
        if (this.mv != null) {
            this.mv.visitOpen(packaze, access, modules);
        }
    }
    
    public void visitUse(final String service) {
        if (this.mv != null) {
            this.mv.visitUse(service);
        }
    }
    
    public void visitProvide(final String service, final String... providers) {
        if (this.mv != null) {
            this.mv.visitProvide(service, providers);
        }
    }
    
    public void visitEnd() {
        if (this.mv != null) {
            this.mv.visitEnd();
        }
    }
}
