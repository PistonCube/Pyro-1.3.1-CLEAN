// 
// Decompiled by Procyon v0.5.36
// 

package org.objectweb.asm.tree;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Label;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.AnnotationVisitor;
import java.util.ArrayList;
import org.objectweb.asm.Attribute;
import java.util.List;
import org.objectweb.asm.MethodVisitor;

public class MethodNode extends MethodVisitor
{
    public int access;
    public String name;
    public String desc;
    public String signature;
    public List<String> exceptions;
    public List<ParameterNode> parameters;
    public List<AnnotationNode> visibleAnnotations;
    public List<AnnotationNode> invisibleAnnotations;
    public List<TypeAnnotationNode> visibleTypeAnnotations;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    public List<Attribute> attrs;
    public Object annotationDefault;
    public int visibleAnnotableParameterCount;
    public List<AnnotationNode>[] visibleParameterAnnotations;
    public int invisibleAnnotableParameterCount;
    public List<AnnotationNode>[] invisibleParameterAnnotations;
    public InsnList instructions;
    public List<TryCatchBlockNode> tryCatchBlocks;
    public int maxStack;
    public int maxLocals;
    public List<LocalVariableNode> localVariables;
    public List<LocalVariableAnnotationNode> visibleLocalVariableAnnotations;
    public List<LocalVariableAnnotationNode> invisibleLocalVariableAnnotations;
    private boolean visited;
    
    public MethodNode() {
        this(524288);
        if (this.getClass() != MethodNode.class) {
            throw new IllegalStateException();
        }
    }
    
    public MethodNode(final int api) {
        super(api);
        this.instructions = new InsnList();
    }
    
    public MethodNode(final int access, final String name, final String descriptor, final String signature, final String[] exceptions) {
        this(524288, access, name, descriptor, signature, exceptions);
        if (this.getClass() != MethodNode.class) {
            throw new IllegalStateException();
        }
    }
    
    public MethodNode(final int api, final int access, final String name, final String descriptor, final String signature, final String[] exceptions) {
        super(api);
        this.access = access;
        this.name = name;
        this.desc = descriptor;
        this.signature = signature;
        this.exceptions = Util.asArrayList(exceptions);
        if ((access & 0x400) == 0x0) {
            this.localVariables = new ArrayList<LocalVariableNode>(5);
        }
        this.tryCatchBlocks = new ArrayList<TryCatchBlockNode>();
        this.instructions = new InsnList();
    }
    
    @Override
    public void visitParameter(final String name, final int access) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<ParameterNode>(5);
        }
        this.parameters.add(new ParameterNode(name, access));
    }
    
    @Override
    public AnnotationVisitor visitAnnotationDefault() {
        return new AnnotationNode(new ArrayList<Object>(0) {
            @Override
            public boolean add(final Object o) {
                MethodNode.this.annotationDefault = o;
                return super.add(o);
            }
        });
    }
    
    @Override
    public AnnotationVisitor visitAnnotation(final String descriptor, final boolean visible) {
        final AnnotationNode annotation = new AnnotationNode(descriptor);
        if (visible) {
            this.visibleAnnotations = Util.add(this.visibleAnnotations, annotation);
        }
        else {
            this.invisibleAnnotations = Util.add(this.invisibleAnnotations, annotation);
        }
        return annotation;
    }
    
    @Override
    public AnnotationVisitor visitTypeAnnotation(final int typeRef, final TypePath typePath, final String descriptor, final boolean visible) {
        final TypeAnnotationNode typeAnnotation = new TypeAnnotationNode(typeRef, typePath, descriptor);
        if (visible) {
            this.visibleTypeAnnotations = Util.add(this.visibleTypeAnnotations, typeAnnotation);
        }
        else {
            this.invisibleTypeAnnotations = Util.add(this.invisibleTypeAnnotations, typeAnnotation);
        }
        return typeAnnotation;
    }
    
    @Override
    public void visitAnnotableParameterCount(final int parameterCount, final boolean visible) {
        if (visible) {
            this.visibleAnnotableParameterCount = parameterCount;
        }
        else {
            this.invisibleAnnotableParameterCount = parameterCount;
        }
    }
    
    @Override
    public AnnotationVisitor visitParameterAnnotation(final int parameter, final String descriptor, final boolean visible) {
        final AnnotationNode annotation = new AnnotationNode(descriptor);
        if (visible) {
            if (this.visibleParameterAnnotations == null) {
                final int params = Type.getArgumentTypes(this.desc).length;
                this.visibleParameterAnnotations = (List<AnnotationNode>[])new List[params];
            }
            this.visibleParameterAnnotations[parameter] = Util.add(this.visibleParameterAnnotations[parameter], annotation);
        }
        else {
            if (this.invisibleParameterAnnotations == null) {
                final int params = Type.getArgumentTypes(this.desc).length;
                this.invisibleParameterAnnotations = (List<AnnotationNode>[])new List[params];
            }
            this.invisibleParameterAnnotations[parameter] = Util.add(this.invisibleParameterAnnotations[parameter], annotation);
        }
        return annotation;
    }
    
    @Override
    public void visitAttribute(final Attribute attribute) {
        this.attrs = Util.add(this.attrs, attribute);
    }
    
    @Override
    public void visitCode() {
    }
    
    @Override
    public void visitFrame(final int type, final int numLocal, final Object[] local, final int numStack, final Object[] stack) {
        this.instructions.add(new FrameNode(type, numLocal, (Object[])((local == null) ? null : this.getLabelNodes(local)), numStack, (Object[])((stack == null) ? null : this.getLabelNodes(stack))));
    }
    
    @Override
    public void visitInsn(final int opcode) {
        this.instructions.add(new InsnNode(opcode));
    }
    
    @Override
    public void visitIntInsn(final int opcode, final int operand) {
        this.instructions.add(new IntInsnNode(opcode, operand));
    }
    
    @Override
    public void visitVarInsn(final int opcode, final int var) {
        this.instructions.add(new VarInsnNode(opcode, var));
    }
    
    @Override
    public void visitTypeInsn(final int opcode, final String type) {
        this.instructions.add(new TypeInsnNode(opcode, type));
    }
    
    @Override
    public void visitFieldInsn(final int opcode, final String owner, final String name, final String descriptor) {
        this.instructions.add(new FieldInsnNode(opcode, owner, name, descriptor));
    }
    
    @Override
    public void visitMethodInsn(final int opcodeAndSource, final String owner, final String name, final String descriptor, final boolean isInterface) {
        if (this.api < 327680 && (opcodeAndSource & 0x100) == 0x0) {
            super.visitMethodInsn(opcodeAndSource, owner, name, descriptor, isInterface);
            return;
        }
        final int opcode = opcodeAndSource & 0xFFFFFEFF;
        this.instructions.add(new MethodInsnNode(opcode, owner, name, descriptor, isInterface));
    }
    
    @Override
    public void visitInvokeDynamicInsn(final String name, final String descriptor, final Handle bootstrapMethodHandle, final Object... bootstrapMethodArguments) {
        this.instructions.add(new InvokeDynamicInsnNode(name, descriptor, bootstrapMethodHandle, bootstrapMethodArguments));
    }
    
    @Override
    public void visitJumpInsn(final int opcode, final Label label) {
        this.instructions.add(new JumpInsnNode(opcode, this.getLabelNode(label)));
    }
    
    @Override
    public void visitLabel(final Label label) {
        this.instructions.add(this.getLabelNode(label));
    }
    
    @Override
    public void visitLdcInsn(final Object value) {
        this.instructions.add(new LdcInsnNode(value));
    }
    
    @Override
    public void visitIincInsn(final int var, final int increment) {
        this.instructions.add(new IincInsnNode(var, increment));
    }
    
    @Override
    public void visitTableSwitchInsn(final int min, final int max, final Label dflt, final Label... labels) {
        this.instructions.add(new TableSwitchInsnNode(min, max, this.getLabelNode(dflt), this.getLabelNodes(labels)));
    }
    
    @Override
    public void visitLookupSwitchInsn(final Label dflt, final int[] keys, final Label[] labels) {
        this.instructions.add(new LookupSwitchInsnNode(this.getLabelNode(dflt), keys, this.getLabelNodes(labels)));
    }
    
    @Override
    public void visitMultiANewArrayInsn(final String descriptor, final int numDimensions) {
        this.instructions.add(new MultiANewArrayInsnNode(descriptor, numDimensions));
    }
    
    @Override
    public AnnotationVisitor visitInsnAnnotation(final int typeRef, final TypePath typePath, final String descriptor, final boolean visible) {
        AbstractInsnNode currentInsn;
        for (currentInsn = this.instructions.getLast(); currentInsn.getOpcode() == -1; currentInsn = currentInsn.getPrevious()) {}
        final TypeAnnotationNode typeAnnotation = new TypeAnnotationNode(typeRef, typePath, descriptor);
        if (visible) {
            currentInsn.visibleTypeAnnotations = Util.add(currentInsn.visibleTypeAnnotations, typeAnnotation);
        }
        else {
            currentInsn.invisibleTypeAnnotations = Util.add(currentInsn.invisibleTypeAnnotations, typeAnnotation);
        }
        return typeAnnotation;
    }
    
    @Override
    public void visitTryCatchBlock(final Label start, final Label end, final Label handler, final String type) {
        final TryCatchBlockNode tryCatchBlock = new TryCatchBlockNode(this.getLabelNode(start), this.getLabelNode(end), this.getLabelNode(handler), type);
        this.tryCatchBlocks = Util.add(this.tryCatchBlocks, tryCatchBlock);
    }
    
    @Override
    public AnnotationVisitor visitTryCatchAnnotation(final int typeRef, final TypePath typePath, final String descriptor, final boolean visible) {
        final TryCatchBlockNode tryCatchBlock = this.tryCatchBlocks.get((typeRef & 0xFFFF00) >> 8);
        final TypeAnnotationNode typeAnnotation = new TypeAnnotationNode(typeRef, typePath, descriptor);
        if (visible) {
            tryCatchBlock.visibleTypeAnnotations = Util.add(tryCatchBlock.visibleTypeAnnotations, typeAnnotation);
        }
        else {
            tryCatchBlock.invisibleTypeAnnotations = Util.add(tryCatchBlock.invisibleTypeAnnotations, typeAnnotation);
        }
        return typeAnnotation;
    }
    
    @Override
    public void visitLocalVariable(final String name, final String descriptor, final String signature, final Label start, final Label end, final int index) {
        final LocalVariableNode localVariable = new LocalVariableNode(name, descriptor, signature, this.getLabelNode(start), this.getLabelNode(end), index);
        this.localVariables = Util.add(this.localVariables, localVariable);
    }
    
    @Override
    public AnnotationVisitor visitLocalVariableAnnotation(final int typeRef, final TypePath typePath, final Label[] start, final Label[] end, final int[] index, final String descriptor, final boolean visible) {
        final LocalVariableAnnotationNode localVariableAnnotation = new LocalVariableAnnotationNode(typeRef, typePath, this.getLabelNodes(start), this.getLabelNodes(end), index, descriptor);
        if (visible) {
            this.visibleLocalVariableAnnotations = Util.add(this.visibleLocalVariableAnnotations, localVariableAnnotation);
        }
        else {
            this.invisibleLocalVariableAnnotations = Util.add(this.invisibleLocalVariableAnnotations, localVariableAnnotation);
        }
        return localVariableAnnotation;
    }
    
    @Override
    public void visitLineNumber(final int line, final Label start) {
        this.instructions.add(new LineNumberNode(line, this.getLabelNode(start)));
    }
    
    @Override
    public void visitMaxs(final int maxStack, final int maxLocals) {
        this.maxStack = maxStack;
        this.maxLocals = maxLocals;
    }
    
    @Override
    public void visitEnd() {
    }
    
    protected LabelNode getLabelNode(final Label label) {
        if (!(label.info instanceof LabelNode)) {
            label.info = new LabelNode();
        }
        return (LabelNode)label.info;
    }
    
    private LabelNode[] getLabelNodes(final Label[] labels) {
        final LabelNode[] labelNodes = new LabelNode[labels.length];
        for (int i = 0, n = labels.length; i < n; ++i) {
            labelNodes[i] = this.getLabelNode(labels[i]);
        }
        return labelNodes;
    }
    
    private Object[] getLabelNodes(final Object[] objects) {
        final Object[] labelNodes = new Object[objects.length];
        for (int i = 0, n = objects.length; i < n; ++i) {
            Object o = objects[i];
            if (o instanceof Label) {
                o = this.getLabelNode((Label)o);
            }
            labelNodes[i] = o;
        }
        return labelNodes;
    }
    
    public void check(final int api) {
        if (api == 262144) {
            if (this.parameters != null && !this.parameters.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            if (this.visibleTypeAnnotations != null && !this.visibleTypeAnnotations.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            if (this.invisibleTypeAnnotations != null && !this.invisibleTypeAnnotations.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            if (this.tryCatchBlocks != null) {
                for (int i = this.tryCatchBlocks.size() - 1; i >= 0; --i) {
                    final TryCatchBlockNode tryCatchBlock = this.tryCatchBlocks.get(i);
                    if (tryCatchBlock.visibleTypeAnnotations != null && !tryCatchBlock.visibleTypeAnnotations.isEmpty()) {
                        throw new UnsupportedClassVersionException();
                    }
                    if (tryCatchBlock.invisibleTypeAnnotations != null && !tryCatchBlock.invisibleTypeAnnotations.isEmpty()) {
                        throw new UnsupportedClassVersionException();
                    }
                }
            }
            for (int i = this.instructions.size() - 1; i >= 0; --i) {
                final AbstractInsnNode insn = this.instructions.get(i);
                if (insn.visibleTypeAnnotations != null && !insn.visibleTypeAnnotations.isEmpty()) {
                    throw new UnsupportedClassVersionException();
                }
                if (insn.invisibleTypeAnnotations != null && !insn.invisibleTypeAnnotations.isEmpty()) {
                    throw new UnsupportedClassVersionException();
                }
                if (insn instanceof MethodInsnNode) {
                    final boolean isInterface = ((MethodInsnNode)insn).itf;
                    if (isInterface != (insn.opcode == 185)) {
                        throw new UnsupportedClassVersionException();
                    }
                }
                else if (insn instanceof LdcInsnNode) {
                    final Object value = ((LdcInsnNode)insn).cst;
                    if (value instanceof Handle || (value instanceof Type && ((Type)value).getSort() == 11)) {
                        throw new UnsupportedClassVersionException();
                    }
                }
            }
            if (this.visibleLocalVariableAnnotations != null && !this.visibleLocalVariableAnnotations.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
            if (this.invisibleLocalVariableAnnotations != null && !this.invisibleLocalVariableAnnotations.isEmpty()) {
                throw new UnsupportedClassVersionException();
            }
        }
        if (api < 458752) {
            for (int i = this.instructions.size() - 1; i >= 0; --i) {
                final AbstractInsnNode insn = this.instructions.get(i);
                if (insn instanceof LdcInsnNode) {
                    final Object value = ((LdcInsnNode)insn).cst;
                    if (value instanceof ConstantDynamic) {
                        throw new UnsupportedClassVersionException();
                    }
                }
            }
        }
    }
    
    public void accept(final ClassVisitor classVisitor) {
        final String[] exceptionsArray = (String[])((this.exceptions == null) ? null : ((String[])this.exceptions.toArray(new String[0])));
        final MethodVisitor methodVisitor = classVisitor.visitMethod(this.access, this.name, this.desc, this.signature, exceptionsArray);
        if (methodVisitor != null) {
            this.accept(methodVisitor);
        }
    }
    
    public void accept(final MethodVisitor methodVisitor) {
        if (this.parameters != null) {
            for (int i = 0, n = this.parameters.size(); i < n; ++i) {
                this.parameters.get(i).accept(methodVisitor);
            }
        }
        if (this.annotationDefault != null) {
            final AnnotationVisitor annotationVisitor = methodVisitor.visitAnnotationDefault();
            AnnotationNode.accept(annotationVisitor, null, this.annotationDefault);
            if (annotationVisitor != null) {
                annotationVisitor.visitEnd();
            }
        }
        if (this.visibleAnnotations != null) {
            for (int i = 0, n = this.visibleAnnotations.size(); i < n; ++i) {
                final AnnotationNode annotation = this.visibleAnnotations.get(i);
                annotation.accept(methodVisitor.visitAnnotation(annotation.desc, true));
            }
        }
        if (this.invisibleAnnotations != null) {
            for (int i = 0, n = this.invisibleAnnotations.size(); i < n; ++i) {
                final AnnotationNode annotation = this.invisibleAnnotations.get(i);
                annotation.accept(methodVisitor.visitAnnotation(annotation.desc, false));
            }
        }
        if (this.visibleTypeAnnotations != null) {
            for (int i = 0, n = this.visibleTypeAnnotations.size(); i < n; ++i) {
                final TypeAnnotationNode typeAnnotation = this.visibleTypeAnnotations.get(i);
                typeAnnotation.accept(methodVisitor.visitTypeAnnotation(typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, true));
            }
        }
        if (this.invisibleTypeAnnotations != null) {
            for (int i = 0, n = this.invisibleTypeAnnotations.size(); i < n; ++i) {
                final TypeAnnotationNode typeAnnotation = this.invisibleTypeAnnotations.get(i);
                typeAnnotation.accept(methodVisitor.visitTypeAnnotation(typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, false));
            }
        }
        if (this.visibleAnnotableParameterCount > 0) {
            methodVisitor.visitAnnotableParameterCount(this.visibleAnnotableParameterCount, true);
        }
        if (this.visibleParameterAnnotations != null) {
            for (int i = 0, n = this.visibleParameterAnnotations.length; i < n; ++i) {
                final List<AnnotationNode> parameterAnnotations = this.visibleParameterAnnotations[i];
                if (parameterAnnotations != null) {
                    for (int j = 0, m = parameterAnnotations.size(); j < m; ++j) {
                        final AnnotationNode annotation2 = parameterAnnotations.get(j);
                        annotation2.accept(methodVisitor.visitParameterAnnotation(i, annotation2.desc, true));
                    }
                }
            }
        }
        if (this.invisibleAnnotableParameterCount > 0) {
            methodVisitor.visitAnnotableParameterCount(this.invisibleAnnotableParameterCount, false);
        }
        if (this.invisibleParameterAnnotations != null) {
            for (int i = 0, n = this.invisibleParameterAnnotations.length; i < n; ++i) {
                final List<AnnotationNode> parameterAnnotations = this.invisibleParameterAnnotations[i];
                if (parameterAnnotations != null) {
                    for (int j = 0, m = parameterAnnotations.size(); j < m; ++j) {
                        final AnnotationNode annotation2 = parameterAnnotations.get(j);
                        annotation2.accept(methodVisitor.visitParameterAnnotation(i, annotation2.desc, false));
                    }
                }
            }
        }
        if (this.visited) {
            this.instructions.resetLabels();
        }
        if (this.attrs != null) {
            for (int i = 0, n = this.attrs.size(); i < n; ++i) {
                methodVisitor.visitAttribute(this.attrs.get(i));
            }
        }
        if (this.instructions.size() > 0) {
            methodVisitor.visitCode();
            if (this.tryCatchBlocks != null) {
                for (int i = 0, n = this.tryCatchBlocks.size(); i < n; ++i) {
                    this.tryCatchBlocks.get(i).updateIndex(i);
                    this.tryCatchBlocks.get(i).accept(methodVisitor);
                }
            }
            this.instructions.accept(methodVisitor);
            if (this.localVariables != null) {
                for (int i = 0, n = this.localVariables.size(); i < n; ++i) {
                    this.localVariables.get(i).accept(methodVisitor);
                }
            }
            if (this.visibleLocalVariableAnnotations != null) {
                for (int i = 0, n = this.visibleLocalVariableAnnotations.size(); i < n; ++i) {
                    this.visibleLocalVariableAnnotations.get(i).accept(methodVisitor, true);
                }
            }
            if (this.invisibleLocalVariableAnnotations != null) {
                for (int i = 0, n = this.invisibleLocalVariableAnnotations.size(); i < n; ++i) {
                    this.invisibleLocalVariableAnnotations.get(i).accept(methodVisitor, false);
                }
            }
            methodVisitor.visitMaxs(this.maxStack, this.maxLocals);
            this.visited = true;
        }
        methodVisitor.visitEnd();
    }
}
