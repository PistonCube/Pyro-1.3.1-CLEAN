// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.UShort;
import kotlin.UByte;
import kotlin.ULong;
import kotlin.UInt;
import kotlin.jvm.functions.Function1;
import java.util.Arrays;
import kotlin.UShortArray;
import kotlin.UByteArray;
import kotlin.ULongArray;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.jvm.JvmStatic;
import java.util.NoSuchElementException;
import kotlin.UIntArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;
import kotlin.DeprecationLevel;
import kotlin.Deprecated;

@Deprecated(message = "Provided for binary compatibility", level = DeprecationLevel.HIDDEN)
@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0003\u001a\u00020\u0004*\u00020\t2\u0006\u0010\u0006\u001a\u00020\tH\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0003\u001a\u00020\u0004*\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0003\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u0013*\u00020\u0005H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0012\u001a\u00020\u0013*\u00020\tH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0012\u001a\u00020\u0013*\u00020\fH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0012\u001a\u00020\u0013*\u00020\u000fH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\u0005H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\tH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b \u0010!J\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\fH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\u000fH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001e\u0010&\u001a\u00020'*\u00020\u00052\u0006\u0010&\u001a\u00020(H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001e\u0010&\u001a\u00020+*\u00020\t2\u0006\u0010&\u001a\u00020(H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001e\u0010&\u001a\u00020.*\u00020\f2\u0006\u0010&\u001a\u00020(H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b/\u00100J\u001e\u0010&\u001a\u000201*\u00020\u000f2\u0006\u0010&\u001a\u00020(H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b2\u00103J\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020'05*\u00020\u0005H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b6\u00107J\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020+05*\u00020\tH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b8\u00109J\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020.05*\u00020\fH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020105*\u00020\u000fH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b<\u0010=\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>" }, d2 = { "Lkotlin/collections/UArraysKt;", "", "()V", "contentEquals", "", "Lkotlin/UByteArray;", "other", "contentEquals-kdPth3s", "([B[B)Z", "Lkotlin/UIntArray;", "contentEquals-ctEhBpI", "([I[I)Z", "Lkotlin/ULongArray;", "contentEquals-us8wMrg", "([J[J)Z", "Lkotlin/UShortArray;", "contentEquals-mazbYpA", "([S[S)Z", "contentHashCode", "", "contentHashCode-GBYM_sE", "([B)I", "contentHashCode--ajY-9A", "([I)I", "contentHashCode-QwZRm1k", "([J)I", "contentHashCode-rL5Bavg", "([S)I", "contentToString", "", "contentToString-GBYM_sE", "([B)Ljava/lang/String;", "contentToString--ajY-9A", "([I)Ljava/lang/String;", "contentToString-QwZRm1k", "([J)Ljava/lang/String;", "contentToString-rL5Bavg", "([S)Ljava/lang/String;", "random", "Lkotlin/UByte;", "Lkotlin/random/Random;", "random-oSF2wD8", "([BLkotlin/random/Random;)B", "Lkotlin/UInt;", "random-2D5oskM", "([ILkotlin/random/Random;)I", "Lkotlin/ULong;", "random-JzugnMA", "([JLkotlin/random/Random;)J", "Lkotlin/UShort;", "random-s5X_as8", "([SLkotlin/random/Random;)S", "toTypedArray", "", "toTypedArray-GBYM_sE", "([B)[Lkotlin/UByte;", "toTypedArray--ajY-9A", "([I)[Lkotlin/UInt;", "toTypedArray-QwZRm1k", "([J)[Lkotlin/ULong;", "toTypedArray-rL5Bavg", "([S)[Lkotlin/UShort;", "kotlin-stdlib" })
public final class UArraysKt
{
    public static final UArraysKt INSTANCE;
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    public static final int random-2D5oskM(@NotNull final int[] $this$random, @NotNull final Random random) {
        Intrinsics.checkParameterIsNotNull($this$random, "$this$random");
        Intrinsics.checkParameterIsNotNull(random, "random");
        if (UIntArray.isEmpty-impl($this$random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UIntArray.get-impl($this$random, random.nextInt(UIntArray.getSize-impl($this$random)));
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    public static final long random-JzugnMA(@NotNull final long[] $this$random, @NotNull final Random random) {
        Intrinsics.checkParameterIsNotNull($this$random, "$this$random");
        Intrinsics.checkParameterIsNotNull(random, "random");
        if (ULongArray.isEmpty-impl($this$random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return ULongArray.get-impl($this$random, random.nextInt(ULongArray.getSize-impl($this$random)));
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    public static final byte random-oSF2wD8(@NotNull final byte[] $this$random, @NotNull final Random random) {
        Intrinsics.checkParameterIsNotNull($this$random, "$this$random");
        Intrinsics.checkParameterIsNotNull(random, "random");
        if (UByteArray.isEmpty-impl($this$random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UByteArray.get-impl($this$random, random.nextInt(UByteArray.getSize-impl($this$random)));
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    public static final short random-s5X_as8(@NotNull final short[] $this$random, @NotNull final Random random) {
        Intrinsics.checkParameterIsNotNull($this$random, "$this$random");
        Intrinsics.checkParameterIsNotNull(random, "random");
        if (UShortArray.isEmpty-impl($this$random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UShortArray.get-impl($this$random, random.nextInt(UShortArray.getSize-impl($this$random)));
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    public static final boolean contentEquals-ctEhBpI(@NotNull final int[] $this$contentEquals, @NotNull final int[] other) {
        Intrinsics.checkParameterIsNotNull($this$contentEquals, "$this$contentEquals");
        Intrinsics.checkParameterIsNotNull(other, "other");
        return Arrays.equals($this$contentEquals, other);
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    public static final boolean contentEquals-us8wMrg(@NotNull final long[] $this$contentEquals, @NotNull final long[] other) {
        Intrinsics.checkParameterIsNotNull($this$contentEquals, "$this$contentEquals");
        Intrinsics.checkParameterIsNotNull(other, "other");
        return Arrays.equals($this$contentEquals, other);
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    public static final boolean contentEquals-kdPth3s(@NotNull final byte[] $this$contentEquals, @NotNull final byte[] other) {
        Intrinsics.checkParameterIsNotNull($this$contentEquals, "$this$contentEquals");
        Intrinsics.checkParameterIsNotNull(other, "other");
        return Arrays.equals($this$contentEquals, other);
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    public static final boolean contentEquals-mazbYpA(@NotNull final short[] $this$contentEquals, @NotNull final short[] other) {
        Intrinsics.checkParameterIsNotNull($this$contentEquals, "$this$contentEquals");
        Intrinsics.checkParameterIsNotNull(other, "other");
        return Arrays.equals($this$contentEquals, other);
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    public static final int contentHashCode--ajY-9A(@NotNull final int[] $this$contentHashCode) {
        Intrinsics.checkParameterIsNotNull($this$contentHashCode, "$this$contentHashCode");
        return Arrays.hashCode($this$contentHashCode);
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    public static final int contentHashCode-QwZRm1k(@NotNull final long[] $this$contentHashCode) {
        Intrinsics.checkParameterIsNotNull($this$contentHashCode, "$this$contentHashCode");
        return Arrays.hashCode($this$contentHashCode);
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    public static final int contentHashCode-GBYM_sE(@NotNull final byte[] $this$contentHashCode) {
        Intrinsics.checkParameterIsNotNull($this$contentHashCode, "$this$contentHashCode");
        return Arrays.hashCode($this$contentHashCode);
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    public static final int contentHashCode-rL5Bavg(@NotNull final short[] $this$contentHashCode) {
        Intrinsics.checkParameterIsNotNull($this$contentHashCode, "$this$contentHashCode");
        return Arrays.hashCode($this$contentHashCode);
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    @NotNull
    public static final String contentToString--ajY-9A(@NotNull final int[] $this$contentToString) {
        Intrinsics.checkParameterIsNotNull($this$contentToString, "$this$contentToString");
        return CollectionsKt___CollectionsKt.joinToString$default(UIntArray.box-impl($this$contentToString), ", ", "[", "]", 0, null, null, 56, null);
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    @NotNull
    public static final String contentToString-QwZRm1k(@NotNull final long[] $this$contentToString) {
        Intrinsics.checkParameterIsNotNull($this$contentToString, "$this$contentToString");
        return CollectionsKt___CollectionsKt.joinToString$default(ULongArray.box-impl($this$contentToString), ", ", "[", "]", 0, null, null, 56, null);
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    @NotNull
    public static final String contentToString-GBYM_sE(@NotNull final byte[] $this$contentToString) {
        Intrinsics.checkParameterIsNotNull($this$contentToString, "$this$contentToString");
        return CollectionsKt___CollectionsKt.joinToString$default(UByteArray.box-impl($this$contentToString), ", ", "[", "]", 0, null, null, 56, null);
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    @NotNull
    public static final String contentToString-rL5Bavg(@NotNull final short[] $this$contentToString) {
        Intrinsics.checkParameterIsNotNull($this$contentToString, "$this$contentToString");
        return CollectionsKt___CollectionsKt.joinToString$default(UShortArray.box-impl($this$contentToString), ", ", "[", "]", 0, null, null, 56, null);
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    @NotNull
    public static final UInt[] toTypedArray--ajY-9A(@NotNull final int[] $this$toTypedArray) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$toTypedArray"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$toTypedArray */
        //     7: invokestatic    kotlin/UIntArray.getSize-impl:([I)I
        //    10: istore_1       
        //    11: iload_1        
        //    12: anewarray       Lkotlin/UInt;
        //    15: astore_2       
        //    16: iconst_0       
        //    17: istore_3       
        //    18: iload_3        
        //    19: iload_1        
        //    20: if_icmpge       59
        //    23: aload_2        
        //    24: iload_3        
        //    25: iload_3        
        //    26: istore          4
        //    28: istore          7
        //    30: astore          6
        //    32: iconst_0       
        //    33: istore          $i$a$-<init>-UArraysKt$toTypedArray$1
        //    35: aload_0         /* $this$toTypedArray */
        //    36: iload           index
        //    38: invokestatic    kotlin/UIntArray.get-impl:([II)I
        //    41: invokestatic    kotlin/UInt.box-impl:(I)Lkotlin/UInt;
        //    44: astore          8
        //    46: aload           6
        //    48: iload           7
        //    50: aload           8
        //    52: aastore        
        //    53: iinc            3, 1
        //    56: goto            18
        //    59: aload_2        
        //    60: areturn        
        //    StackMapTable: 00 02 FE 00 12 01 07 00 D9 01 28
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    @NotNull
    public static final ULong[] toTypedArray-QwZRm1k(@NotNull final long[] $this$toTypedArray) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$toTypedArray"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$toTypedArray */
        //     7: invokestatic    kotlin/ULongArray.getSize-impl:([J)I
        //    10: istore_1       
        //    11: iload_1        
        //    12: anewarray       Lkotlin/ULong;
        //    15: astore_2       
        //    16: iconst_0       
        //    17: istore_3       
        //    18: iload_3        
        //    19: iload_1        
        //    20: if_icmpge       59
        //    23: aload_2        
        //    24: iload_3        
        //    25: iload_3        
        //    26: istore          4
        //    28: istore          7
        //    30: astore          6
        //    32: iconst_0       
        //    33: istore          $i$a$-<init>-UArraysKt$toTypedArray$2
        //    35: aload_0         /* $this$toTypedArray */
        //    36: iload           index
        //    38: invokestatic    kotlin/ULongArray.get-impl:([JI)J
        //    41: invokestatic    kotlin/ULong.box-impl:(J)Lkotlin/ULong;
        //    44: astore          8
        //    46: aload           6
        //    48: iload           7
        //    50: aload           8
        //    52: aastore        
        //    53: iinc            3, 1
        //    56: goto            18
        //    59: aload_2        
        //    60: areturn        
        //    StackMapTable: 00 02 FE 00 12 01 07 00 E3 01 28
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    @NotNull
    public static final UByte[] toTypedArray-GBYM_sE(@NotNull final byte[] $this$toTypedArray) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$toTypedArray"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$toTypedArray */
        //     7: invokestatic    kotlin/UByteArray.getSize-impl:([B)I
        //    10: istore_1       
        //    11: iload_1        
        //    12: anewarray       Lkotlin/UByte;
        //    15: astore_2       
        //    16: iconst_0       
        //    17: istore_3       
        //    18: iload_3        
        //    19: iload_1        
        //    20: if_icmpge       59
        //    23: aload_2        
        //    24: iload_3        
        //    25: iload_3        
        //    26: istore          4
        //    28: istore          7
        //    30: astore          6
        //    32: iconst_0       
        //    33: istore          $i$a$-<init>-UArraysKt$toTypedArray$3
        //    35: aload_0         /* $this$toTypedArray */
        //    36: iload           index
        //    38: invokestatic    kotlin/UByteArray.get-impl:([BI)B
        //    41: invokestatic    kotlin/UByte.box-impl:(B)Lkotlin/UByte;
        //    44: astore          8
        //    46: aload           6
        //    48: iload           7
        //    50: aload           8
        //    52: aastore        
        //    53: iinc            3, 1
        //    56: goto            18
        //    59: aload_2        
        //    60: areturn        
        //    StackMapTable: 00 02 FE 00 12 01 07 00 EB 01 28
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @JvmStatic
    @ExperimentalUnsignedTypes
    @NotNull
    public static final UShort[] toTypedArray-rL5Bavg(@NotNull final short[] $this$toTypedArray) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$toTypedArray"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$toTypedArray */
        //     7: invokestatic    kotlin/UShortArray.getSize-impl:([S)I
        //    10: istore_1       
        //    11: iload_1        
        //    12: anewarray       Lkotlin/UShort;
        //    15: astore_2       
        //    16: iconst_0       
        //    17: istore_3       
        //    18: iload_3        
        //    19: iload_1        
        //    20: if_icmpge       59
        //    23: aload_2        
        //    24: iload_3        
        //    25: iload_3        
        //    26: istore          4
        //    28: istore          7
        //    30: astore          6
        //    32: iconst_0       
        //    33: istore          $i$a$-<init>-UArraysKt$toTypedArray$4
        //    35: aload_0         /* $this$toTypedArray */
        //    36: iload           index
        //    38: invokestatic    kotlin/UShortArray.get-impl:([SI)S
        //    41: invokestatic    kotlin/UShort.box-impl:(S)Lkotlin/UShort;
        //    44: astore          8
        //    46: aload           6
        //    48: iload           7
        //    50: aload           8
        //    52: aastore        
        //    53: iinc            3, 1
        //    56: goto            18
        //    59: aload_2        
        //    60: areturn        
        //    StackMapTable: 00 02 FE 00 12 01 07 00 F3 01 28
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private UArraysKt() {
    }
    
    static {
        INSTANCE = new UArraysKt();
    }
}
