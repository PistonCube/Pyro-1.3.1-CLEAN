// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.Arrays;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import kotlin.jvm.JvmName;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\t\u0010\f\u001a~\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u00112(\u0010\u0012\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0013H\u0082\b¢\u0006\u0002\u0010\u0014\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015" }, d2 = { "EMPTY", "", "", "[Ljava/lang/Object;", "MAX_SIZE", "", "collectionToArray", "collection", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "a", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "toArrayImpl", "empty", "Lkotlin/Function0;", "alloc", "Lkotlin/Function1;", "trim", "Lkotlin/Function2;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "kotlin-stdlib" })
@JvmName(name = "CollectionToArray")
public final class CollectionToArray
{
    private static final Object[] EMPTY;
    private static final int MAX_SIZE = 2147483645;
    
    @JvmName(name = "toArray")
    @NotNull
    public static final Object[] toArray(@NotNull final Collection<?> collection) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "collection"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: iconst_0       
        //     7: istore_1        /* $i$f$toArrayImpl */
        //     8: aload_0         /* collection */
        //     9: invokeinterface java/util/Collection.size:()I
        //    14: istore_2        /* size$iv */
        //    15: iload_2         /* size$iv */
        //    16: ifne            27
        //    19: iconst_0       
        //    20: istore_3        /* $i$a$-toArrayImpl-CollectionToArray$collectionToArray$1 */
        //    21: getstatic       kotlin/jvm/internal/CollectionToArray.EMPTY:[Ljava/lang/Object;
        //    24: goto            201
        //    27: aload_0         /* collection */
        //    28: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //    33: astore_3        /* iter$iv */
        //    34: aload_3         /* iter$iv */
        //    35: invokeinterface java/util/Iterator.hasNext:()Z
        //    40: ifne            52
        //    43: iconst_0       
        //    44: istore          $i$a$-toArrayImpl-CollectionToArray$collectionToArray$1
        //    46: getstatic       kotlin/jvm/internal/CollectionToArray.EMPTY:[Ljava/lang/Object;
        //    49: goto            201
        //    52: iload_2         /* size$iv */
        //    53: istore          size
        //    55: iconst_0       
        //    56: istore          $i$a$-toArrayImpl-CollectionToArray$collectionToArray$2
        //    58: iload           size
        //    60: anewarray       Ljava/lang/Object;
        //    63: astore          result$iv
        //    65: iconst_0       
        //    66: istore          i$iv
        //    68: nop            
        //    69: aload           result$iv
        //    71: iload           i$iv
        //    73: iinc            i$iv, 1
        //    76: aload_3         /* iter$iv */
        //    77: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    82: aastore        
        //    83: iload           i$iv
        //    85: aload           result$iv
        //    87: arraylength    
        //    88: if_icmplt       162
        //    91: aload_3         /* iter$iv */
        //    92: invokeinterface java/util/Iterator.hasNext:()Z
        //    97: ifne            105
        //   100: aload           result$iv
        //   102: goto            201
        //   105: iload           i$iv
        //   107: iconst_3       
        //   108: imul           
        //   109: iconst_1       
        //   110: iadd           
        //   111: iconst_1       
        //   112: iushr          
        //   113: istore          newSize$iv
        //   115: iload           newSize$iv
        //   117: iload           i$iv
        //   119: if_icmpgt       144
        //   122: iload           i$iv
        //   124: ldc             2147483645
        //   126: if_icmplt       140
        //   129: new             Ljava/lang/OutOfMemoryError;
        //   132: dup            
        //   133: invokespecial   java/lang/OutOfMemoryError.<init>:()V
        //   136: checkcast       Ljava/lang/Throwable;
        //   139: athrow         
        //   140: ldc             2147483645
        //   142: istore          newSize$iv
        //   144: aload           result$iv
        //   146: iload           newSize$iv
        //   148: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   151: dup            
        //   152: ldc             "Arrays.copyOf(result, newSize)"
        //   154: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   157: astore          result$iv
        //   159: goto            198
        //   162: aload_3         /* iter$iv */
        //   163: invokeinterface java/util/Iterator.hasNext:()Z
        //   168: ifne            198
        //   171: aload           result$iv
        //   173: iload           i$iv
        //   175: istore          7
        //   177: astore          result
        //   179: iconst_0       
        //   180: istore          $i$a$-toArrayImpl-CollectionToArray$collectionToArray$3
        //   182: aload           result
        //   184: iload           size
        //   186: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   189: dup            
        //   190: ldc             "Arrays.copyOf(result, size)"
        //   192: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   195: goto            201
        //   198: goto            68
        //   201: areturn        
        //    Signature:
        //  (Ljava/util/Collection<*>;)[Ljava/lang/Object;
        //    StackMapTable: 00 09 FD 00 1B 01 01 FC 00 18 07 00 3F FD 00 0F 07 00 44 01 24 FC 00 22 01 03 FA 00 11 23 FF 00 02 00 03 07 00 33 01 01 00 01 07 00 44
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmName(name = "toArray")
    @NotNull
    public static final Object[] toArray(@NotNull final Collection<?> collection, @Nullable final Object[] a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "collection"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* a */
        //     7: ifnonnull       21
        //    10: new             Ljava/lang/NullPointerException;
        //    13: dup            
        //    14: invokespecial   java/lang/NullPointerException.<init>:()V
        //    17: checkcast       Ljava/lang/Throwable;
        //    20: athrow         
        //    21: iconst_0       
        //    22: istore_2        /* $i$f$toArrayImpl */
        //    23: aload_0         /* collection */
        //    24: invokeinterface java/util/Collection.size:()I
        //    29: istore_3        /* size$iv */
        //    30: iload_3         /* size$iv */
        //    31: ifne            50
        //    34: iconst_0       
        //    35: istore          $i$a$-toArrayImpl-CollectionToArray$collectionToArray$4
        //    37: aload_1         /* a */
        //    38: arraylength    
        //    39: ifle            46
        //    42: aload_1         /* a */
        //    43: iconst_0       
        //    44: aconst_null    
        //    45: aastore        
        //    46: aload_1         /* a */
        //    47: goto            286
        //    50: aload_0         /* collection */
        //    51: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //    56: astore          iter$iv
        //    58: aload           iter$iv
        //    60: invokeinterface java/util/Iterator.hasNext:()Z
        //    65: ifne            84
        //    68: iconst_0       
        //    69: istore          $i$a$-toArrayImpl-CollectionToArray$collectionToArray$4
        //    71: aload_1         /* a */
        //    72: arraylength    
        //    73: ifle            80
        //    76: aload_1         /* a */
        //    77: iconst_0       
        //    78: aconst_null    
        //    79: aastore        
        //    80: aload_1         /* a */
        //    81: goto            286
        //    84: iload_3         /* size$iv */
        //    85: istore          size
        //    87: iconst_0       
        //    88: istore          $i$a$-toArrayImpl-CollectionToArray$collectionToArray$5
        //    90: iload           size
        //    92: aload_1         /* a */
        //    93: arraylength    
        //    94: if_icmpgt       101
        //    97: aload_1         /* a */
        //    98: goto            130
        //   101: aload_1         /* a */
        //   102: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   105: invokevirtual   java/lang/Class.getComponentType:()Ljava/lang/Class;
        //   108: iload           size
        //   110: invokestatic    java/lang/reflect/Array.newInstance:(Ljava/lang/Class;I)Ljava/lang/Object;
        //   113: dup            
        //   114: ifnonnull       127
        //   117: new             Lkotlin/TypeCastException;
        //   120: dup            
        //   121: ldc             "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
        //   123: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   126: athrow         
        //   127: checkcast       [Ljava/lang/Object;
        //   130: astore          result$iv
        //   132: iconst_0       
        //   133: istore          i$iv
        //   135: nop            
        //   136: aload           result$iv
        //   138: iload           i$iv
        //   140: iinc            i$iv, 1
        //   143: aload           iter$iv
        //   145: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   150: aastore        
        //   151: iload           i$iv
        //   153: aload           result$iv
        //   155: arraylength    
        //   156: if_icmplt       231
        //   159: aload           iter$iv
        //   161: invokeinterface java/util/Iterator.hasNext:()Z
        //   166: ifne            174
        //   169: aload           result$iv
        //   171: goto            286
        //   174: iload           i$iv
        //   176: iconst_3       
        //   177: imul           
        //   178: iconst_1       
        //   179: iadd           
        //   180: iconst_1       
        //   181: iushr          
        //   182: istore          newSize$iv
        //   184: iload           newSize$iv
        //   186: iload           i$iv
        //   188: if_icmpgt       213
        //   191: iload           i$iv
        //   193: ldc             2147483645
        //   195: if_icmplt       209
        //   198: new             Ljava/lang/OutOfMemoryError;
        //   201: dup            
        //   202: invokespecial   java/lang/OutOfMemoryError.<init>:()V
        //   205: checkcast       Ljava/lang/Throwable;
        //   208: athrow         
        //   209: ldc             2147483645
        //   211: istore          newSize$iv
        //   213: aload           result$iv
        //   215: iload           newSize$iv
        //   217: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   220: dup            
        //   221: ldc             "Arrays.copyOf(result, newSize)"
        //   223: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   226: astore          result$iv
        //   228: goto            283
        //   231: aload           iter$iv
        //   233: invokeinterface java/util/Iterator.hasNext:()Z
        //   238: ifne            283
        //   241: aload           result$iv
        //   243: iload           i$iv
        //   245: istore          8
        //   247: astore          result
        //   249: iconst_0       
        //   250: istore          $i$a$-toArrayImpl-CollectionToArray$collectionToArray$6
        //   252: aload           result
        //   254: aload_1         /* a */
        //   255: if_acmpne       267
        //   258: aload_1         /* a */
        //   259: iload           size
        //   261: aconst_null    
        //   262: aastore        
        //   263: aload_1         /* a */
        //   264: goto            280
        //   267: aload           result
        //   269: iload           size
        //   271: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   274: dup            
        //   275: ldc             "Arrays.copyOf(result, size)"
        //   277: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   280: goto            286
        //   283: goto            135
        //   286: areturn        
        //    Signature:
        //  (Ljava/util/Collection<*>;[Ljava/lang/Object;)[Ljava/lang/Object;
        //    StackMapTable: 00 11 15 FE 00 18 01 01 01 FA 00 03 FD 00 1D 01 07 00 3F FF 00 03 00 06 07 00 33 07 00 44 01 01 00 07 00 3F 00 00 FF 00 10 00 07 07 00 33 07 00 44 01 01 01 07 00 3F 01 00 00 59 07 00 04 42 07 00 44 FC 00 04 07 00 44 26 22 03 11 FE 00 23 01 07 00 44 01 4C 07 00 44 F8 00 02 FF 00 02 00 05 07 00 33 07 00 44 01 01 01 00 01 07 00 44
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final Object[] toArrayImpl(final Collection<?> collection, final Function0<Object[]> empty, final Function1<? super Integer, Object[]> alloc, final Function2<? super Object[], ? super Integer, Object[]> trim) {
        final int $i$f$toArrayImpl = 0;
        final int size = collection.size();
        if (size == 0) {
            return empty.invoke();
        }
        final Iterator iter = collection.iterator();
        if (!iter.hasNext()) {
            return empty.invoke();
        }
        Object[] result = alloc.invoke(size);
        int i = 0;
        while (true) {
            result[i++] = iter.next();
            if (i >= result.length) {
                if (!iter.hasNext()) {
                    return result;
                }
                int newSize = i * 3 + 1 >>> 1;
                if (newSize <= i) {
                    if (i >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    newSize = 2147483645;
                }
                final Object[] copy = Arrays.copyOf(result, newSize);
                Intrinsics.checkExpressionValueIsNotNull(copy, "Arrays.copyOf(result, newSize)");
                result = copy;
            }
            else {
                if (!iter.hasNext()) {
                    return trim.invoke(result, i);
                }
                continue;
            }
        }
    }
    
    static {
        EMPTY = new Object[0];
    }
}
