// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.KVariance;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.Nullable;
import java.lang.annotation.Annotation;
import kotlin.reflect.KTypeProjection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import kotlin.reflect.KClassifier;
import kotlin.SinceKotlin;
import kotlin.Metadata;
import kotlin.reflect.KType;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\f\u0010\u0017\u001a\u00020\u0013*\u00020\u0006H\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e" }, d2 = { "Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "classifier", "Lkotlin/reflect/KClassifier;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "isMarkedNullable", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "annotations", "", "getAnnotations", "()Ljava/util/List;", "getArguments", "getClassifier", "()Lkotlin/reflect/KClassifier;", "()Z", "arrayClassName", "", "Ljava/lang/Class;", "getArrayClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "asString", "equals", "other", "", "hashCode", "", "toString", "kotlin-stdlib" })
@SinceKotlin(version = "1.4")
public final class TypeReference implements KType
{
    @NotNull
    private final KClassifier classifier;
    @NotNull
    private final List<KTypeProjection> arguments;
    private final boolean isMarkedNullable;
    
    @NotNull
    @Override
    public List<Annotation> getAnnotations() {
        return CollectionsKt__CollectionsKt.emptyList();
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return other instanceof TypeReference && Intrinsics.areEqual(this.getClassifier(), ((TypeReference)other).getClassifier()) && Intrinsics.areEqual(this.getArguments(), ((TypeReference)other).getArguments()) && this.isMarkedNullable() == ((TypeReference)other).isMarkedNullable();
    }
    
    @Override
    public int hashCode() {
        return (this.getClassifier().hashCode() * 31 + this.getArguments().hashCode()) * 31 + Boolean.valueOf(this.isMarkedNullable()).hashCode();
    }
    
    @NotNull
    @Override
    public String toString() {
        return this.asString() + " (Kotlin reflection is not available)";
    }
    
    private final String asString() {
        KClassifier classifier;
        if (!((classifier = this.getClassifier()) instanceof KClass)) {
            classifier = null;
        }
        final KClass<Object> $this$java = (KClass<Object>)classifier;
        final Class javaClass = ($this$java != null) ? JvmClassMappingKt.getJavaClass($this$java) : null;
        final String klass = (javaClass == null) ? this.getClassifier().toString() : (javaClass.isArray() ? this.getArrayClassName(javaClass) : javaClass.getName());
        final String args = this.getArguments().isEmpty() ? "" : CollectionsKt___CollectionsKt.joinToString$default(this.getArguments(), ", ", "<", ">", 0, null, (Function1)new TypeReference$asString$args.TypeReference$asString$args$1(this), 24, null);
        final String nullable = this.isMarkedNullable() ? "?" : "";
        return klass + args + nullable;
    }
    
    private final String getArrayClassName(@NotNull final Class<?> $this$arrayClassName) {
        return Intrinsics.areEqual($this$arrayClassName, boolean[].class) ? "kotlin.BooleanArray" : (Intrinsics.areEqual($this$arrayClassName, char[].class) ? "kotlin.CharArray" : (Intrinsics.areEqual($this$arrayClassName, byte[].class) ? "kotlin.ByteArray" : (Intrinsics.areEqual($this$arrayClassName, short[].class) ? "kotlin.ShortArray" : (Intrinsics.areEqual($this$arrayClassName, int[].class) ? "kotlin.IntArray" : (Intrinsics.areEqual($this$arrayClassName, float[].class) ? "kotlin.FloatArray" : (Intrinsics.areEqual($this$arrayClassName, long[].class) ? "kotlin.LongArray" : (Intrinsics.areEqual($this$arrayClassName, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array")))))));
    }
    
    private final String asString(@NotNull final KTypeProjection $this$asString) {
        if ($this$asString.getVariance() == null) {
            return "*";
        }
        KType type;
        if (!((type = $this$asString.getType()) instanceof TypeReference)) {
            type = null;
        }
        final TypeReference typeReference = (TypeReference)type;
        String s;
        if (typeReference == null || (s = typeReference.asString()) == null) {
            s = String.valueOf($this$asString.getType());
        }
        final String typeString = s;
        final KVariance variance = $this$asString.getVariance();
        if (variance != null) {
            String s2 = null;
            switch (TypeReference$WhenMappings.$EnumSwitchMapping$0[variance.ordinal()]) {
                case 1: {
                    s2 = typeString;
                    break;
                }
                case 2: {
                    s2 = "in " + typeString;
                    break;
                }
                case 3: {
                    s2 = "out " + typeString;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return s2;
        }
        throw new NoWhenBranchMatchedException();
    }
    
    @NotNull
    @Override
    public KClassifier getClassifier() {
        return this.classifier;
    }
    
    @NotNull
    @Override
    public List<KTypeProjection> getArguments() {
        return this.arguments;
    }
    
    @Override
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }
    
    public TypeReference(@NotNull final KClassifier classifier, @NotNull final List<KTypeProjection> arguments, final boolean isMarkedNullable) {
        Intrinsics.checkParameterIsNotNull(classifier, "classifier");
        Intrinsics.checkParameterIsNotNull(arguments, "arguments");
        this.classifier = classifier;
        this.arguments = arguments;
        this.isMarkedNullable = isMarkedNullable;
    }
}
