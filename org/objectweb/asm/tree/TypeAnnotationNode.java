// 
// Decompiled by Procyon v0.5.36
// 

package org.objectweb.asm.tree;

import org.objectweb.asm.TypePath;

public class TypeAnnotationNode extends AnnotationNode
{
    public int typeRef;
    public TypePath typePath;
    
    public TypeAnnotationNode(final int typeRef, final TypePath typePath, final String descriptor) {
        this(524288, typeRef, typePath, descriptor);
        if (this.getClass() != TypeAnnotationNode.class) {
            throw new IllegalStateException();
        }
    }
    
    public TypeAnnotationNode(final int api, final int typeRef, final TypePath typePath, final String descriptor) {
        super(api, descriptor);
        this.typeRef = typeRef;
        this.typePath = typePath;
    }
}
