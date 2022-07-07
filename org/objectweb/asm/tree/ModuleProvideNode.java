// 
// Decompiled by Procyon v0.5.36
// 

package org.objectweb.asm.tree;

import org.objectweb.asm.ModuleVisitor;
import java.util.List;

public class ModuleProvideNode
{
    public String service;
    public List<String> providers;
    
    public ModuleProvideNode(final String service, final List<String> providers) {
        this.service = service;
        this.providers = providers;
    }
    
    public void accept(final ModuleVisitor moduleVisitor) {
        moduleVisitor.visitProvide(this.service, (String[])this.providers.toArray(new String[0]));
    }
}
