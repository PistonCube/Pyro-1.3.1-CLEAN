// 
// Decompiled by Procyon v0.5.36
// 

package org.objectweb.asm.tree;

import org.objectweb.asm.ModuleVisitor;
import java.util.List;

public class ModuleExportNode
{
    public String packaze;
    public int access;
    public List<String> modules;
    
    public ModuleExportNode(final String packaze, final int access, final List<String> modules) {
        this.packaze = packaze;
        this.access = access;
        this.modules = modules;
    }
    
    public void accept(final ModuleVisitor moduleVisitor) {
        moduleVisitor.visitExport(this.packaze, this.access, (String[])((this.modules == null) ? null : ((String[])this.modules.toArray(new String[0]))));
    }
}
