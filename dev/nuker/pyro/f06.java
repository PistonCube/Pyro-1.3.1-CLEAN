// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface f06 {
    int c() default 0;
    
    default static {
        throw t;
    }
}
