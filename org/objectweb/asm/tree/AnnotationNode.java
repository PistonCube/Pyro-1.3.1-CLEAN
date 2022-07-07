// 
// Decompiled by Procyon v0.5.36
// 

package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.AnnotationVisitor;

public class AnnotationNode extends AnnotationVisitor
{
    public String desc;
    public List<Object> values;
    
    public AnnotationNode(final String descriptor) {
        this(524288, descriptor);
        if (this.getClass() != AnnotationNode.class) {
            throw new IllegalStateException();
        }
    }
    
    public AnnotationNode(final int api, final String descriptor) {
        super(api);
        this.desc = descriptor;
    }
    
    AnnotationNode(final List<Object> values) {
        super(524288);
        this.values = values;
    }
    
    @Override
    public void visit(final String name, final Object value) {
        if (this.values == null) {
            this.values = new ArrayList<Object>((this.desc != null) ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(name);
        }
        if (value instanceof byte[]) {
            this.values.add(Util.asArrayList((byte[])value));
        }
        else if (value instanceof boolean[]) {
            this.values.add(Util.asArrayList((boolean[])value));
        }
        else if (value instanceof short[]) {
            this.values.add(Util.asArrayList((short[])value));
        }
        else if (value instanceof char[]) {
            this.values.add(Util.asArrayList((char[])value));
        }
        else if (value instanceof int[]) {
            this.values.add(Util.asArrayList((int[])value));
        }
        else if (value instanceof long[]) {
            this.values.add(Util.asArrayList((long[])value));
        }
        else if (value instanceof float[]) {
            this.values.add(Util.asArrayList((float[])value));
        }
        else if (value instanceof double[]) {
            this.values.add(Util.asArrayList((double[])value));
        }
        else {
            this.values.add(value);
        }
    }
    
    @Override
    public void visitEnum(final String name, final String descriptor, final String value) {
        if (this.values == null) {
            this.values = new ArrayList<Object>((this.desc != null) ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(name);
        }
        this.values.add(new String[] { descriptor, value });
    }
    
    @Override
    public AnnotationVisitor visitAnnotation(final String name, final String descriptor) {
        if (this.values == null) {
            this.values = new ArrayList<Object>((this.desc != null) ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(name);
        }
        final AnnotationNode annotation = new AnnotationNode(descriptor);
        this.values.add(annotation);
        return annotation;
    }
    
    @Override
    public AnnotationVisitor visitArray(final String name) {
        if (this.values == null) {
            this.values = new ArrayList<Object>((this.desc != null) ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(name);
        }
        final List<Object> array = new ArrayList<Object>();
        this.values.add(array);
        return new AnnotationNode(array);
    }
    
    @Override
    public void visitEnd() {
    }
    
    public void check(final int api) {
    }
    
    public void accept(final AnnotationVisitor annotationVisitor) {
        if (annotationVisitor != null) {
            if (this.values != null) {
                for (int i = 0, n = this.values.size(); i < n; i += 2) {
                    final String name = this.values.get(i);
                    final Object value = this.values.get(i + 1);
                    accept(annotationVisitor, name, value);
                }
            }
            annotationVisitor.visitEnd();
        }
    }
    
    static void accept(final AnnotationVisitor annotationVisitor, final String name, final Object value) {
        if (annotationVisitor != null) {
            if (value instanceof String[]) {
                final String[] typeValue = (String[])value;
                annotationVisitor.visitEnum(name, typeValue[0], typeValue[1]);
            }
            else if (value instanceof AnnotationNode) {
                final AnnotationNode annotationValue = (AnnotationNode)value;
                annotationValue.accept(annotationVisitor.visitAnnotation(name, annotationValue.desc));
            }
            else if (value instanceof List) {
                final AnnotationVisitor arrayAnnotationVisitor = annotationVisitor.visitArray(name);
                if (arrayAnnotationVisitor != null) {
                    final List<?> arrayValue = (List<?>)value;
                    for (int i = 0, n = arrayValue.size(); i < n; ++i) {
                        accept(arrayAnnotationVisitor, null, arrayValue.get(i));
                    }
                    arrayAnnotationVisitor.visitEnd();
                }
            }
            else {
                annotationVisitor.visit(name, value);
            }
        }
    }
}
