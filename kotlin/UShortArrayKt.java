// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\b\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u001f\u0010\b\u001a\u00020\u00012\n\u0010\t\u001a\u00020\u0001\"\u00020\u0006H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f" }, d2 = { "UShortArray", "Lkotlin/UShortArray;", "size", "", "init", "Lkotlin/Function1;", "Lkotlin/UShort;", "(ILkotlin/jvm/functions/Function1;)[S", "ushortArrayOf", "elements", "ushortArrayOf-rL5Bavg", "([S)[S", "kotlin-stdlib" })
public final class UShortArrayKt
{
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] UShortArray(final int size, final Function1<? super Integer, UShort> init) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$UShortArray */
        //     3: iload_0         /* size */
        //     4: newarray        S
        //     6: astore_3       
        //     7: iconst_0       
        //     8: istore          4
        //    10: iload           4
        //    12: iload_0         /* size */
        //    13: if_icmpge       69
        //    16: aload_3        
        //    17: iload           4
        //    19: iload           4
        //    21: istore          5
        //    23: istore          10
        //    25: astore          9
        //    27: iconst_0       
        //    28: istore          $i$a$-<init>-UShortArrayKt$UShortArray$1
        //    30: aload_1         /* init */
        //    31: iload           index
        //    33: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    36: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    41: checkcast       Lkotlin/UShort;
        //    44: invokevirtual   kotlin/UShort.unbox-impl:()S
        //    47: istore          7
        //    49: iconst_0       
        //    50: istore          8
        //    52: iload           7
        //    54: istore          11
        //    56: aload           9
        //    58: iload           10
        //    60: iload           11
        //    62: sastore        
        //    63: iinc            4, 1
        //    66: goto            10
        //    69: aload_3        
        //    70: invokestatic    kotlin/UShortArray.constructor-impl:([S)[S
        //    73: areturn        
        //    Signature:
        //  (ILkotlin/jvm/functions/Function1<-Ljava/lang/Integer;Lkotlin/UShort;>;)[S
        //    StackMapTable: 00 02 FE 00 0A 01 07 00 25 01 3A
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] ushortArrayOf-rL5Bavg(final short... elements) {
        final int n = 0;
        return elements;
    }
}
