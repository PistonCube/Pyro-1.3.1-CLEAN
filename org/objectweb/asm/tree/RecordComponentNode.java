// 
// Decompiled by Procyon v0.5.36
// 

package org.objectweb.asm.tree;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import java.util.List;
import org.objectweb.asm.RecordComponentVisitor;

public class RecordComponentNode extends RecordComponentVisitor
{
    public String name;
    public String descriptor;
    public String signature;
    public List<AnnotationNode> visibleAnnotations;
    public List<AnnotationNode> invisibleAnnotations;
    public List<TypeAnnotationNode> visibleTypeAnnotations;
    public List<TypeAnnotationNode> invisibleTypeAnnotations;
    public List<Attribute> attrs;
    
    public RecordComponentNode(final String name, final String descriptor, final String signature) {
        this(524288, name, descriptor, signature);
        if (this.getClass() != RecordComponentNode.class) {
            throw new IllegalStateException();
        }
    }
    
    public RecordComponentNode(final int api, final String name, final String descriptor, final String signature) {
        super(api);
        this.name = name;
        this.descriptor = descriptor;
        this.signature = signature;
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
    public void visitAttribute(final Attribute attribute) {
        this.attrs = Util.add(this.attrs, attribute);
    }
    
    @Override
    public void visitEnd() {
    }
    
    public void check(final int api) {
        if (api < 524288) {
            throw new UnsupportedClassVersionException();
        }
    }
    
    public void accept(final ClassVisitor classVisitor) {
        final RecordComponentVisitor recordComponentVisitor = classVisitor.visitRecordComponent(this.name, this.descriptor, this.signature);
        if (recordComponentVisitor == null) {
            return;
        }
        if (this.visibleAnnotations != null) {
            for (int i = 0, n = this.visibleAnnotations.size(); i < n; ++i) {
                final AnnotationNode annotation = this.visibleAnnotations.get(i);
                annotation.accept(recordComponentVisitor.visitAnnotation(annotation.desc, true));
            }
        }
        if (this.invisibleAnnotations != null) {
            for (int i = 0, n = this.invisibleAnnotations.size(); i < n; ++i) {
                final AnnotationNode annotation = this.invisibleAnnotations.get(i);
                annotation.accept(recordComponentVisitor.visitAnnotation(annotation.desc, false));
            }
        }
        if (this.visibleTypeAnnotations != null) {
            for (int i = 0, n = this.visibleTypeAnnotations.size(); i < n; ++i) {
                final TypeAnnotationNode typeAnnotation = this.visibleTypeAnnotations.get(i);
                typeAnnotation.accept(recordComponentVisitor.visitTypeAnnotation(typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, true));
            }
        }
        if (this.invisibleTypeAnnotations != null) {
            for (int i = 0, n = this.invisibleTypeAnnotations.size(); i < n; ++i) {
                final TypeAnnotationNode typeAnnotation = this.invisibleTypeAnnotations.get(i);
                typeAnnotation.accept(recordComponentVisitor.visitTypeAnnotation(typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, false));
            }
        }
        if (this.attrs != null) {
            for (int i = 0, n = this.attrs.size(); i < n; ++i) {
                recordComponentVisitor.visitAttribute(this.attrs.get(i));
            }
        }
        recordComponentVisitor.visitEnd();
    }
}
