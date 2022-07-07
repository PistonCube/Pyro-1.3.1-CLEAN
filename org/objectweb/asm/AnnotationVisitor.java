// 
// Decompiled by Procyon v0.5.36
// 

package org.objectweb.asm;

public abstract class AnnotationVisitor
{
    protected final int api;
    protected AnnotationVisitor av;
    
    public AnnotationVisitor(final int api) {
        this(api, null);
    }
    
    public AnnotationVisitor(final int api, final AnnotationVisitor annotationVisitor) {
        if (api != 524288 && api != 458752 && api != 393216 && api != 327680 && api != 262144 && api != 17367040) {
            throw new IllegalArgumentException("Unsupported api " + api);
        }
        if (api == 17367040) {
            Constants.checkAsmExperimental(this);
        }
        this.api = api;
        this.av = annotationVisitor;
    }
    
    public void visit(final String name, final Object value) {
        if (this.av != null) {
            this.av.visit(name, value);
        }
    }
    
    public void visitEnum(final String name, final String descriptor, final String value) {
        if (this.av != null) {
            this.av.visitEnum(name, descriptor, value);
        }
    }
    
    public AnnotationVisitor visitAnnotation(final String name, final String descriptor) {
        if (this.av != null) {
            return this.av.visitAnnotation(name, descriptor);
        }
        return null;
    }
    
    public AnnotationVisitor visitArray(final String name) {
        if (this.av != null) {
            return this.av.visitArray(name);
        }
        return null;
    }
    
    public void visitEnd() {
        if (this.av != null) {
            this.av.visitEnd();
        }
    }
}
