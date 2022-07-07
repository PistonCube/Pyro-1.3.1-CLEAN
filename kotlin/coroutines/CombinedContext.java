// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines;

import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.SinceKotlin;
import kotlin.Metadata;
import java.io.Serializable;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001!B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002J\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J5\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u0002H\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018H\u0096\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\"" }, d2 = { "Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "contains", "", "containsAll", "context", "equals", "other", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "hashCode", "", "minusKey", "size", "toString", "", "writeReplace", "Serialized", "kotlin-stdlib" })
@SinceKotlin(version = "1.3")
public final class CombinedContext implements CoroutineContext, Serializable
{
    private final CoroutineContext left;
    private final Element element;
    
    @Nullable
    @Override
    public <E extends Element> E get(@NotNull final Key<E> key) {
        Intrinsics.checkParameterIsNotNull(key, "key");
        CombinedContext cur = this;
        while (true) {
            final Element value = cur.element.get(key);
            if (value != null) {
                final Element it = value;
                final int n = 0;
                return (E)it;
            }
            final CoroutineContext next = cur.left;
            if (!(next instanceof CombinedContext)) {
                return next.get(key);
            }
            cur = (CombinedContext)next;
        }
    }
    
    @Override
    public <R> R fold(final R initial, @NotNull final Function2<? super R, ? super Element, ? extends R> operation) {
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        return (R)operation.invoke(this.left.fold(initial, operation), this.element);
    }
    
    @NotNull
    @Override
    public CoroutineContext minusKey(@NotNull final Key<?> key) {
        Intrinsics.checkParameterIsNotNull(key, "key");
        final Element value = this.element.get(key);
        if (value != null) {
            final Element it = value;
            final int n = 0;
            return this.left;
        }
        final CoroutineContext newLeft = this.left.minusKey(key);
        return (CoroutineContext)((newLeft == this.left) ? ((CombinedContext)this) : ((newLeft == EmptyCoroutineContext.INSTANCE) ? ((Element)this.element) : ((CombinedContext)new CombinedContext(newLeft, this.element))));
    }
    
    private final int size() {
        CombinedContext cur = this;
        int size = 2;
        while (true) {
            CoroutineContext left;
            if (!((left = cur.left) instanceof CombinedContext)) {
                left = null;
            }
            final CombinedContext combinedContext = (CombinedContext)left;
            if (combinedContext == null) {
                break;
            }
            cur = combinedContext;
            ++size;
        }
        return size;
    }
    
    private final boolean contains(final Element element) {
        return Intrinsics.areEqual(this.get(element.getKey()), element);
    }
    
    private final boolean containsAll(final CombinedContext context) {
        CombinedContext cur = context;
        while (this.contains(cur.element)) {
            final CoroutineContext next = cur.left;
            if (next instanceof CombinedContext) {
                cur = (CombinedContext)next;
            }
            else {
                final CoroutineContext coroutineContext = next;
                if (coroutineContext == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                }
                return this.contains((Element)coroutineContext);
            }
        }
        return false;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return this == other || (other instanceof CombinedContext && ((CombinedContext)other).size() == this.size() && ((CombinedContext)other).containsAll(this));
    }
    
    @Override
    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }
    
    @NotNull
    @Override
    public String toString() {
        return "[" + this.fold("", (Function2<? super String, ? super Element, ? extends String>)CombinedContext$toString.CombinedContext$toString$1.INSTANCE) + "]";
    }
    
    private final Object writeReplace() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   kotlin/coroutines/CombinedContext.size:()I
        //     4: istore_1        /* n */
        //     5: iload_1         /* n */
        //     6: anewarray       Lkotlin/coroutines/CoroutineContext;
        //     9: astore_2        /* elements */
        //    10: new             Lkotlin/jvm/internal/Ref$IntRef;
        //    13: dup            
        //    14: invokespecial   kotlin/jvm/internal/Ref$IntRef.<init>:()V
        //    17: astore_3       
        //    18: aload_3        
        //    19: iconst_0       
        //    20: putfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //    23: aload_0         /* this */
        //    24: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //    27: new             Lkotlin/coroutines/CombinedContext$writeReplace$1;
        //    30: dup            
        //    31: aload_2         /* elements */
        //    32: aload_3         /* index */
        //    33: invokespecial   kotlin/coroutines/CombinedContext$writeReplace$1.<init>:([Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/internal/Ref$IntRef;)V
        //    36: checkcast       Lkotlin/jvm/functions/Function2;
        //    39: invokevirtual   kotlin/coroutines/CombinedContext.fold:(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
        //    42: pop            
        //    43: aload_3         /* index */
        //    44: getfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //    47: iload_1         /* n */
        //    48: if_icmpne       55
        //    51: iconst_1       
        //    52: goto            56
        //    55: iconst_0       
        //    56: istore          4
        //    58: iconst_0       
        //    59: istore          5
        //    61: iconst_0       
        //    62: istore          6
        //    64: iconst_0       
        //    65: istore          6
        //    67: iconst_0       
        //    68: istore          7
        //    70: iload           4
        //    72: ifne            98
        //    75: iconst_0       
        //    76: istore          8
        //    78: ldc             "Check failed."
        //    80: astore          7
        //    82: new             Ljava/lang/IllegalStateException;
        //    85: dup            
        //    86: aload           7
        //    88: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    91: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    94: checkcast       Ljava/lang/Throwable;
        //    97: athrow         
        //    98: new             Lkotlin/coroutines/CombinedContext$Serialized;
        //   101: dup            
        //   102: aload_2         /* elements */
        //   103: invokespecial   kotlin/coroutines/CombinedContext$Serialized.<init>:([Lkotlin/coroutines/CoroutineContext;)V
        //   106: areturn        
        //    StackMapTable: 00 03 FE 00 37 01 07 00 B1 07 00 A4 40 01 FF 00 29 00 08 07 00 02 01 07 00 B1 07 00 A4 01 01 01 01 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public CombinedContext(@NotNull final CoroutineContext left, @NotNull final Element element) {
        Intrinsics.checkParameterIsNotNull(left, "left");
        Intrinsics.checkParameterIsNotNull(element, "element");
        this.left = left;
        this.element = element;
    }
    
    @NotNull
    @Override
    public CoroutineContext plus(@NotNull final CoroutineContext context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return DefaultImpls.plus(this, context);
    }
    
    @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\r" }, d2 = { "Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", "", "Lkotlin/coroutines/CoroutineContext;", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", "", "Companion", "kotlin-stdlib" })
    private static final class Serialized implements Serializable
    {
        @NotNull
        private final CoroutineContext[] elements;
        private static final long serialVersionUID = 0L;
        public static final Companion Companion;
        
        private final Object readResolve() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        kotlin/coroutines/CombinedContext$Serialized.elements:[Lkotlin/coroutines/CoroutineContext;
            //     4: astore_1       
            //     5: getstatic       kotlin/coroutines/EmptyCoroutineContext.INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;
            //     8: astore_2        /* initial$iv */
            //     9: iconst_0       
            //    10: istore_3        /* $i$f$fold */
            //    11: aload_2         /* initial$iv */
            //    12: astore          accumulator$iv
            //    14: aload_1         /* $this$fold$iv */
            //    15: astore          5
            //    17: aload           5
            //    19: arraylength    
            //    20: istore          6
            //    22: iconst_0       
            //    23: istore          7
            //    25: iload           7
            //    27: iload           6
            //    29: if_icmpge       70
            //    32: aload           5
            //    34: iload           7
            //    36: aaload         
            //    37: astore          element$iv
            //    39: aload           accumulator$iv
            //    41: aload           element$iv
            //    43: astore          9
            //    45: checkcast       Lkotlin/coroutines/CoroutineContext;
            //    48: astore          p1
            //    50: iconst_0       
            //    51: istore          $i$a$-unknown-CombinedContext$Serialized$readResolve$1
            //    53: aload           p1
            //    55: aload           p2
            //    57: invokeinterface kotlin/coroutines/CoroutineContext.plus:(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;
            //    62: astore          accumulator$iv
            //    64: iinc            7, 1
            //    67: goto            25
            //    70: aload           accumulator$iv
            //    72: areturn        
            //    StackMapTable: 00 02 FF 00 19 00 08 07 00 02 07 00 34 07 00 2F 01 07 00 04 07 00 34 01 01 00 00 2C
            // 
            // The error that occurred was:
            // 
            // java.lang.NullPointerException
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @NotNull
        public final CoroutineContext[] getElements() {
            return this.elements;
        }
        
        public Serialized(@NotNull final CoroutineContext[] elements) {
            Intrinsics.checkParameterIsNotNull(elements, "elements");
            this.elements = elements;
        }
        
        static {
            Companion = new Companion(null);
        }
        
        @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lkotlin/coroutines/CombinedContext$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib" })
        public static final class Companion
        {
            private Companion() {
            }
        }
    }
}
