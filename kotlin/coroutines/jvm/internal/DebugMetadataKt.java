// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import org.jetbrains.annotations.Nullable;
import kotlin.jvm.JvmName;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\bH\u0002\u001a\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\bH\u0001¢\u0006\u0002\u0010\r\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\bH\u0001¢\u0006\u0002\b\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011" }, d2 = { "COROUTINES_DEBUG_METADATA_VERSION", "", "checkDebugMetadataVersion", "", "expected", "actual", "getDebugMetadataAnnotation", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getLabel", "getSpilledVariableFieldMapping", "", "", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)[Ljava/lang/String;", "getStackTraceElementImpl", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "kotlin-stdlib" })
public final class DebugMetadataKt
{
    private static final int COROUTINES_DEBUG_METADATA_VERSION = 1;
    
    @SinceKotlin(version = "1.3")
    @JvmName(name = "getStackTraceElement")
    @Nullable
    public static final StackTraceElement getStackTraceElement(@NotNull final BaseContinuationImpl $this$getStackTraceElementImpl) {
        Intrinsics.checkParameterIsNotNull($this$getStackTraceElementImpl, "$this$getStackTraceElementImpl");
        final DebugMetadata debugMetadataAnnotation = getDebugMetadataAnnotation($this$getStackTraceElementImpl);
        if (debugMetadataAnnotation != null) {
            final DebugMetadata debugMetadata = debugMetadataAnnotation;
            checkDebugMetadataVersion(1, debugMetadata.v());
            final int label = getLabel($this$getStackTraceElementImpl);
            final int lineNumber = (label < 0) ? -1 : debugMetadata.l()[label];
            final String moduleName = ModuleNameRetriever.INSTANCE.getModuleName($this$getStackTraceElementImpl);
            final String moduleAndClass = (moduleName == null) ? debugMetadata.c() : (moduleName + '/' + debugMetadata.c());
            return new StackTraceElement(moduleAndClass, debugMetadata.m(), debugMetadata.f(), lineNumber);
        }
        return null;
    }
    
    private static final DebugMetadata getDebugMetadataAnnotation(@NotNull final BaseContinuationImpl $this$getDebugMetadataAnnotation) {
        return $this$getDebugMetadataAnnotation.getClass().getAnnotation(DebugMetadata.class);
    }
    
    private static final int getLabel(@NotNull final BaseContinuationImpl $this$getLabel) {
        int n2;
        try {
            final Field declaredField;
            final Field field = declaredField = $this$getLabel.getClass().getDeclaredField("label");
            Intrinsics.checkExpressionValueIsNotNull(declaredField, "field");
            declaredField.setAccessible(true);
            Object value;
            if (!((value = field.get($this$getLabel)) instanceof Integer)) {
                value = null;
            }
            final Integer n = (Integer)value;
            n2 = ((n != null) ? n : 0) - 1;
        }
        catch (Exception e) {
            n2 = -1;
        }
        return n2;
    }
    
    private static final void checkDebugMetadataVersion(final int expected, final int actual) {
        if (actual > expected) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + expected + ", got " + actual + ". Please update the Kotlin standard library.").toString());
        }
    }
    
    @SinceKotlin(version = "1.3")
    @JvmName(name = "getSpilledVariableFieldMapping")
    @Nullable
    public static final String[] getSpilledVariableFieldMapping(@NotNull final BaseContinuationImpl $this$getSpilledVariableFieldMapping) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$getSpilledVariableFieldMapping"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$getSpilledVariableFieldMapping */
        //     7: invokestatic    kotlin/coroutines/jvm/internal/DebugMetadataKt.getDebugMetadataAnnotation:(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Lkotlin/coroutines/jvm/internal/DebugMetadata;
        //    10: dup            
        //    11: ifnull          17
        //    14: goto            20
        //    17: pop            
        //    18: aconst_null    
        //    19: areturn        
        //    20: astore_1        /* debugMetadata */
        //    21: iconst_1       
        //    22: aload_1         /* debugMetadata */
        //    23: invokeinterface kotlin/coroutines/jvm/internal/DebugMetadata.v:()I
        //    28: invokestatic    kotlin/coroutines/jvm/internal/DebugMetadataKt.checkDebugMetadataVersion:(II)V
        //    31: iconst_0       
        //    32: istore_3       
        //    33: new             Ljava/util/ArrayList;
        //    36: dup            
        //    37: invokespecial   java/util/ArrayList.<init>:()V
        //    40: astore_2        /* res */
        //    41: aload_0         /* $this$getSpilledVariableFieldMapping */
        //    42: invokestatic    kotlin/coroutines/jvm/internal/DebugMetadataKt.getLabel:(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)I
        //    45: istore_3        /* label */
        //    46: aload_1         /* debugMetadata */
        //    47: invokeinterface kotlin/coroutines/jvm/internal/DebugMetadata.i:()[I
        //    52: astore          6
        //    54: aload           6
        //    56: arraylength    
        //    57: istore          7
        //    59: iconst_0       
        //    60: istore          4
        //    62: iload           4
        //    64: iload           7
        //    66: if_icmpge       116
        //    69: aload           6
        //    71: iload           4
        //    73: iaload         
        //    74: istore          labelOfIndex
        //    76: iload           labelOfIndex
        //    78: iload_3         /* label */
        //    79: if_icmpne       110
        //    82: aload_2         /* res */
        //    83: aload_1         /* debugMetadata */
        //    84: invokeinterface kotlin/coroutines/jvm/internal/DebugMetadata.s:()[Ljava/lang/String;
        //    89: iload           i
        //    91: aaload         
        //    92: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    95: pop            
        //    96: aload_2         /* res */
        //    97: aload_1         /* debugMetadata */
        //    98: invokeinterface kotlin/coroutines/jvm/internal/DebugMetadata.n:()[Ljava/lang/String;
        //   103: iload           i
        //   105: aaload         
        //   106: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   109: pop            
        //   110: iinc            i, 1
        //   113: goto            62
        //   116: aload_2         /* res */
        //   117: checkcast       Ljava/util/Collection;
        //   120: astore          $this$toTypedArray$iv
        //   122: iconst_0       
        //   123: istore          $i$f$toTypedArray
        //   125: aload           $this$toTypedArray$iv
        //   127: astore          thisCollection$iv
        //   129: aload           thisCollection$iv
        //   131: iconst_0       
        //   132: anewarray       Ljava/lang/String;
        //   135: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   140: dup            
        //   141: ifnonnull       154
        //   144: new             Lkotlin/TypeCastException;
        //   147: dup            
        //   148: ldc             "null cannot be cast to non-null type kotlin.Array<T>"
        //   150: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   153: athrow         
        //   154: checkcast       [Ljava/lang/String;
        //   157: areturn        
        //    StackMapTable: 00 06 51 07 00 36 42 07 00 36 FF 00 29 00 08 07 00 9A 07 00 36 07 00 B6 01 01 00 07 00 BC 01 00 00 FF 00 2F 00 08 07 00 9A 07 00 36 07 00 B6 01 01 01 07 00 BC 01 00 00 FF 00 05 00 08 07 00 9A 07 00 36 07 00 B6 01 01 00 07 00 BC 01 00 00 FF 00 25 00 08 07 00 9A 07 00 36 07 00 B6 01 07 00 C9 01 07 00 C9 01 00 01 07 00 D4
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
