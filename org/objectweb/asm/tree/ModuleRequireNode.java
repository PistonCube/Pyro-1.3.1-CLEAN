// 
// Decompiled by Procyon v0.5.36
// 

package org.objectweb.asm.tree;

import org.objectweb.asm.ModuleVisitor;

public class ModuleRequireNode
{
    public String module;
    public int access;
    public String version;
    
    public ModuleRequireNode(final String module, final int access, final String version) {
        this.module = module;
        this.access = access;
        this.version = version;
    }
    
    public void accept(final ModuleVisitor moduleVisitor) {
        moduleVisitor.visitRequire(this.module, this.access, this.version);
    }
}
