// 
// Decompiled by Procyon v0.5.36
// 

package org.objectweb.asm.tree;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.TypePath;
import java.util.List;

public class LocalVariableAnnotationNode extends TypeAnnotationNode
{
    public List<LabelNode> start;
    public List<LabelNode> end;
    public List<Integer> index;
    
    public LocalVariableAnnotationNode(final int typeRef, final TypePath typePath, final LabelNode[] start, final LabelNode[] end, final int[] index, final String descriptor) {
        this(524288, typeRef, typePath, start, end, index, descriptor);
    }
    
    public LocalVariableAnnotationNode(final int api, final int typeRef, final TypePath typePath, final LabelNode[] start, final LabelNode[] end, final int[] index, final String descriptor) {
        super(api, typeRef, typePath, descriptor);
        this.start = Util.asArrayList(start);
        this.end = Util.asArrayList(end);
        this.index = Util.asArrayList(index);
    }
    
    public void accept(final MethodVisitor methodVisitor, final boolean visible) {
        final Label[] startLabels = new Label[this.start.size()];
        final Label[] endLabels = new Label[this.end.size()];
        final int[] indices = new int[this.index.size()];
        for (int i = 0, n = startLabels.length; i < n; ++i) {
            startLabels[i] = this.start.get(i).getLabel();
            endLabels[i] = this.end.get(i).getLabel();
            indices[i] = this.index.get(i);
        }
        this.accept(methodVisitor.visitLocalVariableAnnotation(this.typeRef, this.typePath, startLabels, endLabels, indices, this.desc, visible));
    }
}
