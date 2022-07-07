// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.TypeCastException;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import java.util.Iterator;
import kotlin.Metadata;
import java.util.RandomAccess;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0096\u0002J\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0006J\u0015\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0014¢\u0006\u0002\u0010 J'\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0001\u0010\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00010\tH\u0014¢\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0082\bR\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$" }, d2 = { "Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "capacity", "", "(I)V", "buffer", "", "", "[Ljava/lang/Object;", "getCapacity", "()I", "<set-?>", "size", "getSize", "startIndex", "add", "", "element", "(Ljava/lang/Object;)V", "get", "index", "(I)Ljava/lang/Object;", "isFull", "", "iterator", "", "removeFirst", "n", "toArray", "()[Ljava/lang/Object;", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "forward", "kotlin-stdlib" })
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess
{
    private final Object[] buffer;
    private int startIndex;
    private int size;
    private final int capacity;
    
    @Override
    public int getSize() {
        return this.size;
    }
    
    @Override
    public T get(final int index) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: iload_1         /* index */
        //     4: aload_0         /* this */
        //     5: invokevirtual   kotlin/collections/RingBuffer.size:()I
        //     8: invokevirtual   kotlin/collections/AbstractList$Companion.checkElementIndex$kotlin_stdlib:(II)V
        //    11: aload_0         /* this */
        //    12: getfield        kotlin/collections/RingBuffer.buffer:[Ljava/lang/Object;
        //    15: aload_0         /* this */
        //    16: aload_0         /* this */
        //    17: getfield        kotlin/collections/RingBuffer.startIndex:I
        //    20: istore_3       
        //    21: astore_2       
        //    22: astore          5
        //    24: iconst_0       
        //    25: istore          $i$f$forward
        //    27: iload_3         /* $this$forward$iv */
        //    28: iload_1         /* index */
        //    29: iadd           
        //    30: aload_2         /* this_$iv */
        //    31: invokevirtual   kotlin/collections/RingBuffer.getCapacity:()I
        //    34: irem           
        //    35: istore          6
        //    37: aload           5
        //    39: iload           6
        //    41: aaload         
        //    42: areturn        
        //    Signature:
        //  (I)TT;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final boolean isFull() {
        return this.size() == this.capacity;
    }
    
    @NotNull
    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>)new RingBuffer$iterator.RingBuffer$iterator$1(this);
    }
    
    @NotNull
    @Override
    public <T> T[] toArray(@NotNull final T[] array) {
        Intrinsics.checkParameterIsNotNull(array, "array");
        T[] copy;
        if (array.length < this.size()) {
            Intrinsics.checkExpressionValueIsNotNull(copy = Arrays.copyOf(array, this.size()), "java.util.Arrays.copyOf(this, newSize)");
        }
        else {
            copy = array;
        }
        final Object[] result = copy;
        final int size = this.size();
        int widx = 0;
        for (int idx = this.startIndex; widx < size && idx < this.capacity; ++widx, ++idx) {
            result[widx] = this.buffer[idx];
        }
        for (int idx = 0; widx < size; ++widx, ++idx) {
            result[widx] = this.buffer[idx];
        }
        if (result.length > this.size()) {
            result[this.size()] = null;
        }
        final Object[] array2 = result;
        if (array2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        return (T[])array2;
    }
    
    @NotNull
    @Override
    public Object[] toArray() {
        return this.toArray(new Object[this.size()]);
    }
    
    public final void add(final T element) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   kotlin/collections/RingBuffer.isFull:()Z
        //     4: ifeq            20
        //     7: new             Ljava/lang/IllegalStateException;
        //    10: dup            
        //    11: ldc             "ring buffer is full"
        //    13: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    16: checkcast       Ljava/lang/Throwable;
        //    19: athrow         
        //    20: aload_0         /* this */
        //    21: getfield        kotlin/collections/RingBuffer.buffer:[Ljava/lang/Object;
        //    24: aload_0         /* this */
        //    25: aload_0         /* this */
        //    26: getfield        kotlin/collections/RingBuffer.startIndex:I
        //    29: istore_3       
        //    30: astore_2       
        //    31: aload_0         /* this */
        //    32: invokevirtual   kotlin/collections/RingBuffer.size:()I
        //    35: istore          4
        //    37: astore          6
        //    39: iconst_0       
        //    40: istore          $i$f$forward
        //    42: iload_3         /* $this$forward$iv */
        //    43: iload           n$iv
        //    45: iadd           
        //    46: aload_2         /* this_$iv */
        //    47: invokevirtual   kotlin/collections/RingBuffer.getCapacity:()I
        //    50: irem           
        //    51: istore          7
        //    53: aload           6
        //    55: iload           7
        //    57: aload_1         /* element */
        //    58: aastore        
        //    59: aload_0         /* this */
        //    60: dup            
        //    61: invokevirtual   kotlin/collections/RingBuffer.size:()I
        //    64: dup            
        //    65: istore_2       
        //    66: iconst_1       
        //    67: iadd           
        //    68: putfield        kotlin/collections/RingBuffer.size:I
        //    71: return         
        //    Signature:
        //  (TT;)V
        //    StackMapTable: 00 01 14
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void removeFirst(final int n) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iflt            8
        //     4: iconst_1       
        //     5: goto            9
        //     8: iconst_0       
        //     9: istore_2       
        //    10: iconst_0       
        //    11: istore_3       
        //    12: iconst_0       
        //    13: istore          4
        //    15: iload_2        
        //    16: ifne            59
        //    19: iconst_0       
        //    20: istore          $i$a$-require-RingBuffer$removeFirst$1
        //    22: new             Ljava/lang/StringBuilder;
        //    25: dup            
        //    26: invokespecial   java/lang/StringBuilder.<init>:()V
        //    29: ldc             "n shouldn't be negative but it is "
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: iload_1         /* n */
        //    35: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    38: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    41: astore          4
        //    43: new             Ljava/lang/IllegalArgumentException;
        //    46: dup            
        //    47: aload           4
        //    49: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    52: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    55: checkcast       Ljava/lang/Throwable;
        //    58: athrow         
        //    59: iload_1         /* n */
        //    60: aload_0         /* this */
        //    61: invokevirtual   kotlin/collections/RingBuffer.size:()I
        //    64: if_icmpgt       71
        //    67: iconst_1       
        //    68: goto            72
        //    71: iconst_0       
        //    72: istore_2       
        //    73: iconst_0       
        //    74: istore_3       
        //    75: iconst_0       
        //    76: istore          4
        //    78: iload_2        
        //    79: ifne            134
        //    82: iconst_0       
        //    83: istore          $i$a$-require-RingBuffer$removeFirst$2
        //    85: new             Ljava/lang/StringBuilder;
        //    88: dup            
        //    89: invokespecial   java/lang/StringBuilder.<init>:()V
        //    92: ldc             "n shouldn't be greater than the buffer size: n = "
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    97: iload_1         /* n */
        //    98: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   101: ldc             ", size = "
        //   103: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   106: aload_0         /* this */
        //   107: invokevirtual   kotlin/collections/RingBuffer.size:()I
        //   110: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   113: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   116: astore          4
        //   118: new             Ljava/lang/IllegalArgumentException;
        //   121: dup            
        //   122: aload           4
        //   124: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   127: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   130: checkcast       Ljava/lang/Throwable;
        //   133: athrow         
        //   134: iload_1         /* n */
        //   135: ifle            219
        //   138: aload_0         /* this */
        //   139: getfield        kotlin/collections/RingBuffer.startIndex:I
        //   142: istore_2        /* start */
        //   143: aload_0         /* this */
        //   144: iload_2         /* start */
        //   145: istore          5
        //   147: astore          this_$iv
        //   149: iconst_0       
        //   150: istore          $i$f$forward
        //   152: iload           $this$forward$iv
        //   154: iload_1         /* n */
        //   155: iadd           
        //   156: aload           this_$iv
        //   158: invokevirtual   kotlin/collections/RingBuffer.getCapacity:()I
        //   161: irem           
        //   162: istore_3        /* end */
        //   163: iload_2         /* start */
        //   164: iload_3         /* end */
        //   165: if_icmple       194
        //   168: aload_0         /* this */
        //   169: getfield        kotlin/collections/RingBuffer.buffer:[Ljava/lang/Object;
        //   172: aconst_null    
        //   173: iload_2         /* start */
        //   174: aload_0         /* this */
        //   175: getfield        kotlin/collections/RingBuffer.capacity:I
        //   178: invokestatic    kotlin/collections/ArraysKt.fill:([Ljava/lang/Object;Ljava/lang/Object;II)V
        //   181: aload_0         /* this */
        //   182: getfield        kotlin/collections/RingBuffer.buffer:[Ljava/lang/Object;
        //   185: aconst_null    
        //   186: iconst_0       
        //   187: iload_3         /* end */
        //   188: invokestatic    kotlin/collections/ArraysKt.fill:([Ljava/lang/Object;Ljava/lang/Object;II)V
        //   191: goto            204
        //   194: aload_0         /* this */
        //   195: getfield        kotlin/collections/RingBuffer.buffer:[Ljava/lang/Object;
        //   198: aconst_null    
        //   199: iload_2         /* start */
        //   200: iload_3         /* end */
        //   201: invokestatic    kotlin/collections/ArraysKt.fill:([Ljava/lang/Object;Ljava/lang/Object;II)V
        //   204: aload_0         /* this */
        //   205: iload_3         /* end */
        //   206: putfield        kotlin/collections/RingBuffer.startIndex:I
        //   209: aload_0         /* this */
        //   210: dup            
        //   211: invokevirtual   kotlin/collections/RingBuffer.size:()I
        //   214: iload_1         /* n */
        //   215: isub           
        //   216: putfield        kotlin/collections/RingBuffer.size:I
        //   219: return         
        //    StackMapTable: 00 09 08 40 01 FE 00 31 01 01 01 0B 40 01 3D FF 00 3B 00 07 07 00 02 01 01 01 07 00 02 01 01 00 00 09 F8 00 0E
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final int forward(final int $this$forward, final int n) {
        final int $i$f$forward = 0;
        return ($this$forward + n) % this.getCapacity();
    }
    
    public final int getCapacity() {
        return this.capacity;
    }
    
    public RingBuffer(final int capacity) {
        this.capacity = capacity;
        if (this.capacity < 0) {
            final int n = 0;
            throw new IllegalArgumentException(("ring buffer capacity should not be negative but it is " + this.capacity).toString());
        }
        this.buffer = new Object[this.capacity];
    }
}
