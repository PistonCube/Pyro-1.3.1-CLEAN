// 
// Decompiled by Procyon v0.5.36
// 

package org.objectweb.asm.tree;

import org.objectweb.asm.AnnotationVisitor;
import java.util.ArrayList;
import java.util.Map;
import org.objectweb.asm.MethodVisitor;
import java.util.List;

public abstract class AbstractInsnNode
{
    public static final int INSN = 0;
    public static final int INT_INSN = 1;
    public static final int VAR_INSN = 2;
    public static final int TYPE_INSN = 3;
    public static final int FIELD_INSN = 4;
    public static final int METHOD_INSN = 5;
    public static final int INVOKE_DYNAMIC_INSN = 6;
    public static final int JUMP_INSN = 7;
    public static final int LABEL = 8;
    public static final int LDC_INSN = 9;
    public static final int IINC_INSN = 10;
    public static final int TABLESWITCH_INSN = 11;
    public static final int LOOKUPSWITCH_INSN = 12;
    public static final int MULTIANEWARRAY_INSN = 13;
    public static final int FRAME = 14;
    public static final int LINE = 15;
    protected int opcode;
    public List<TypeAnnotationNode> visibleTypeAnnotations;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    AbstractInsnNode previousInsn;
    AbstractInsnNode nextInsn;
    int index;
    
    protected AbstractInsnNode(final int opcode) {
        this.opcode = opcode;
        this.index = -1;
    }
    
    public int getOpcode() {
        return this.opcode;
    }
    
    public abstract int getType();
    
    public AbstractInsnNode getPrevious() {
        return this.previousInsn;
    }
    
    public AbstractInsnNode getNext() {
        return this.nextInsn;
    }
    
    public abstract void accept(final MethodVisitor p0);
    
    protected final void acceptAnnotations(final MethodVisitor methodVisitor) {
        if (this.visibleTypeAnnotations != null) {
            for (int i = 0, n = this.visibleTypeAnnotations.size(); i < n; ++i) {
                final TypeAnnotationNode typeAnnotation = this.visibleTypeAnnotations.get(i);
                typeAnnotation.accept(methodVisitor.visitInsnAnnotation(typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, true));
            }
        }
        if (this.invisibleTypeAnnotations != null) {
            for (int i = 0, n = this.invisibleTypeAnnotations.size(); i < n; ++i) {
                final TypeAnnotationNode typeAnnotation = this.invisibleTypeAnnotations.get(i);
                typeAnnotation.accept(methodVisitor.visitInsnAnnotation(typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, false));
            }
        }
    }
    
    public abstract AbstractInsnNode clone(final Map<LabelNode, LabelNode> p0);
    
    static LabelNode clone(final LabelNode label, final Map<LabelNode, LabelNode> clonedLabels) {
        return clonedLabels.get(label);
    }
    
    static LabelNode[] clone(final List<LabelNode> labels, final Map<LabelNode, LabelNode> clonedLabels) {
        final LabelNode[] clones = new LabelNode[labels.size()];
        for (int i = 0, n = clones.length; i < n; ++i) {
            clones[i] = clonedLabels.get(labels.get(i));
        }
        return clones;
    }
    
    protected final AbstractInsnNode cloneAnnotations(final AbstractInsnNode insnNode) {
        if (insnNode.visibleTypeAnnotations != null) {
            this.visibleTypeAnnotations = new ArrayList<TypeAnnotationNode>();
            for (int i = 0, n = insnNode.visibleTypeAnnotations.size(); i < n; ++i) {
                final TypeAnnotationNode sourceAnnotation = insnNode.visibleTypeAnnotations.get(i);
                final TypeAnnotationNode cloneAnnotation = new TypeAnnotationNode(sourceAnnotation.typeRef, sourceAnnotation.typePath, sourceAnnotation.desc);
                sourceAnnotation.accept(cloneAnnotation);
                this.visibleTypeAnnotations.add(cloneAnnotation);
            }
        }
        if (insnNode.invisibleTypeAnnotations != null) {
            this.invisibleTypeAnnotations = new ArrayList<TypeAnnotationNode>();
            for (int i = 0, n = insnNode.invisibleTypeAnnotations.size(); i < n; ++i) {
                final TypeAnnotationNode sourceAnnotation = insnNode.invisibleTypeAnnotations.get(i);
                final TypeAnnotationNode cloneAnnotation = new TypeAnnotationNode(sourceAnnotation.typeRef, sourceAnnotation.typePath, sourceAnnotation.desc);
                sourceAnnotation.accept(cloneAnnotation);
                this.invisibleTypeAnnotations.add(cloneAnnotation);
            }
        }
        return this;
    }
}
