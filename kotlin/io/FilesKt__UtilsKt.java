// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import java.util.List;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import java.io.File;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a(\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u001a(\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+" }, d2 = { "extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", "target", "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", "other", "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib" }, xs = "kotlin/io/FilesKt")
class FilesKt__UtilsKt extends FilesKt__FileTreeWalkKt
{
    @NotNull
    public static final File createTempDir(@NotNull final String prefix, @Nullable final String suffix, @Nullable final File directory) {
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        final File dir = File.createTempFile(prefix, suffix, directory);
        dir.delete();
        if (dir.mkdir()) {
            final File value = dir;
            Intrinsics.checkExpressionValueIsNotNull(value, "dir");
            return value;
        }
        throw new IOException("Unable to create temporary directory " + dir + '.');
    }
    
    @NotNull
    public static final File createTempFile(@NotNull final String prefix, @Nullable final String suffix, @Nullable final File directory) {
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        final File tempFile = File.createTempFile(prefix, suffix, directory);
        Intrinsics.checkExpressionValueIsNotNull(tempFile, "File.createTempFile(prefix, suffix, directory)");
        return tempFile;
    }
    
    @NotNull
    public static final String getExtension(@NotNull final File $this$extension) {
        Intrinsics.checkParameterIsNotNull($this$extension, "$this$extension");
        final String name = $this$extension.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "name");
        return StringsKt__StringsKt.substringAfterLast(name, '.', "");
    }
    
    @NotNull
    public static final String getInvariantSeparatorsPath(@NotNull final File $this$invariantSeparatorsPath) {
        Intrinsics.checkParameterIsNotNull($this$invariantSeparatorsPath, "$this$invariantSeparatorsPath");
        String s;
        if (File.separatorChar != '/') {
            final String path = $this$invariantSeparatorsPath.getPath();
            Intrinsics.checkExpressionValueIsNotNull(path, "path");
            s = StringsKt__StringsJVMKt.replace$default(path, File.separatorChar, '/', false, 4, null);
        }
        else {
            Intrinsics.checkExpressionValueIsNotNull(s = $this$invariantSeparatorsPath.getPath(), "path");
        }
        return s;
    }
    
    @NotNull
    public static final String getNameWithoutExtension(@NotNull final File $this$nameWithoutExtension) {
        Intrinsics.checkParameterIsNotNull($this$nameWithoutExtension, "$this$nameWithoutExtension");
        final String name = $this$nameWithoutExtension.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "name");
        return StringsKt__StringsKt.substringBeforeLast$default(name, ".", null, 2, null);
    }
    
    @NotNull
    public static final String toRelativeString(@NotNull final File $this$toRelativeString, @NotNull final File base) {
        Intrinsics.checkParameterIsNotNull($this$toRelativeString, "$this$toRelativeString");
        Intrinsics.checkParameterIsNotNull(base, "base");
        final String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt($this$toRelativeString, base);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return relativeStringOrNull$FilesKt__UtilsKt;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + $this$toRelativeString + " and " + base + '.');
    }
    
    @NotNull
    public static final File relativeTo(@NotNull final File $this$relativeTo, @NotNull final File base) {
        Intrinsics.checkParameterIsNotNull($this$relativeTo, "$this$relativeTo");
        Intrinsics.checkParameterIsNotNull(base, "base");
        return new File(toRelativeString($this$relativeTo, base));
    }
    
    @NotNull
    public static final File relativeToOrSelf(@NotNull final File $this$relativeToOrSelf, @NotNull final File base) {
        Intrinsics.checkParameterIsNotNull($this$relativeToOrSelf, "$this$relativeToOrSelf");
        Intrinsics.checkParameterIsNotNull(base, "base");
        final String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt($this$relativeToOrSelf, base);
        File file;
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            final String p1 = relativeStringOrNull$FilesKt__UtilsKt;
            final int n = 0;
            file = new File(p1);
        }
        else {
            file = $this$relativeToOrSelf;
        }
        return file;
    }
    
    @Nullable
    public static final File relativeToOrNull(@NotNull final File $this$relativeToOrNull, @NotNull final File base) {
        Intrinsics.checkParameterIsNotNull($this$relativeToOrNull, "$this$relativeToOrNull");
        Intrinsics.checkParameterIsNotNull(base, "base");
        final String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt($this$relativeToOrNull, base);
        File file;
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            final String p1 = relativeStringOrNull$FilesKt__UtilsKt;
            final int n = 0;
            file = new File(p1);
        }
        else {
            file = null;
        }
        return file;
    }
    
    private static final String toRelativeStringOrNull$FilesKt__UtilsKt(@NotNull final File $this$toRelativeStringOrNull, final File base) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    kotlin/io/FilesKt.toComponents:(Ljava/io/File;)Lkotlin/io/FilePathComponents;
        //     4: invokestatic    kotlin/io/FilesKt__UtilsKt.normalize$FilesKt__UtilsKt:(Lkotlin/io/FilePathComponents;)Lkotlin/io/FilePathComponents;
        //     7: astore_2        /* thisComponents */
        //     8: aload_1         /* base */
        //     9: invokestatic    kotlin/io/FilesKt.toComponents:(Ljava/io/File;)Lkotlin/io/FilePathComponents;
        //    12: invokestatic    kotlin/io/FilesKt__UtilsKt.normalize$FilesKt__UtilsKt:(Lkotlin/io/FilePathComponents;)Lkotlin/io/FilePathComponents;
        //    15: astore_3        /* baseComponents */
        //    16: aload_2         /* thisComponents */
        //    17: invokevirtual   kotlin/io/FilePathComponents.getRoot:()Ljava/io/File;
        //    20: aload_3         /* baseComponents */
        //    21: invokevirtual   kotlin/io/FilePathComponents.getRoot:()Ljava/io/File;
        //    24: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    27: iconst_1       
        //    28: ixor           
        //    29: ifeq            34
        //    32: aconst_null    
        //    33: areturn        
        //    34: aload_3         /* baseComponents */
        //    35: invokevirtual   kotlin/io/FilePathComponents.getSize:()I
        //    38: istore          baseCount
        //    40: aload_2         /* thisComponents */
        //    41: invokevirtual   kotlin/io/FilePathComponents.getSize:()I
        //    44: istore          thisCount
        //    46: aload_0         /* $this$toRelativeStringOrNull */
        //    47: astore          7
        //    49: iconst_0       
        //    50: istore          8
        //    52: iconst_0       
        //    53: istore          9
        //    55: aload           7
        //    57: astore          $this$countSame
        //    59: iconst_0       
        //    60: istore          $i$a$-run-FilesKt__UtilsKt$toRelativeStringOrNull$sameCount$1
        //    62: iconst_0       
        //    63: istore          i
        //    65: iload           thisCount
        //    67: istore          13
        //    69: iload           baseCount
        //    71: istore          14
        //    73: iconst_0       
        //    74: istore          15
        //    76: iload           13
        //    78: iload           14
        //    80: invokestatic    java/lang/Math.min:(II)I
        //    83: istore          maxSameCount
        //    85: iload           i
        //    87: iload           maxSameCount
        //    89: if_icmpge       132
        //    92: aload_2         /* thisComponents */
        //    93: invokevirtual   kotlin/io/FilePathComponents.getSegments:()Ljava/util/List;
        //    96: iload           i
        //    98: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   103: checkcast       Ljava/io/File;
        //   106: aload_3         /* baseComponents */
        //   107: invokevirtual   kotlin/io/FilePathComponents.getSegments:()Ljava/util/List;
        //   110: iload           i
        //   112: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   117: checkcast       Ljava/io/File;
        //   120: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   123: ifeq            132
        //   126: iinc            i, 1
        //   129: goto            85
        //   132: iload           i
        //   134: istore          sameCount
        //   136: new             Ljava/lang/StringBuilder;
        //   139: dup            
        //   140: invokespecial   java/lang/StringBuilder.<init>:()V
        //   143: astore          res
        //   145: iload           baseCount
        //   147: iconst_1       
        //   148: isub           
        //   149: istore          8
        //   151: iload           sameCount
        //   153: istore          9
        //   155: iload           8
        //   157: iload           9
        //   159: if_icmplt       226
        //   162: aload_3         /* baseComponents */
        //   163: invokevirtual   kotlin/io/FilePathComponents.getSegments:()Ljava/util/List;
        //   166: iload           i
        //   168: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   173: checkcast       Ljava/io/File;
        //   176: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   179: ldc             ".."
        //   181: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   184: ifeq            189
        //   187: aconst_null    
        //   188: areturn        
        //   189: aload           res
        //   191: ldc             ".."
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: pop            
        //   197: iload           i
        //   199: iload           sameCount
        //   201: if_icmpeq       213
        //   204: aload           res
        //   206: getstatic       java/io/File.separatorChar:C
        //   209: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   212: pop            
        //   213: iload           i
        //   215: iload           9
        //   217: if_icmpeq       226
        //   220: iinc            i, -1
        //   223: goto            162
        //   226: iload           sameCount
        //   228: iload           thisCount
        //   230: if_icmpge       293
        //   233: iload           sameCount
        //   235: iload           baseCount
        //   237: if_icmpge       249
        //   240: aload           res
        //   242: getstatic       java/io/File.separatorChar:C
        //   245: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   248: pop            
        //   249: aload_2         /* thisComponents */
        //   250: invokevirtual   kotlin/io/FilePathComponents.getSegments:()Ljava/util/List;
        //   253: checkcast       Ljava/lang/Iterable;
        //   256: iload           sameCount
        //   258: invokestatic    kotlin/collections/CollectionsKt.drop:(Ljava/lang/Iterable;I)Ljava/util/List;
        //   261: checkcast       Ljava/lang/Iterable;
        //   264: aload           res
        //   266: checkcast       Ljava/lang/Appendable;
        //   269: getstatic       java/io/File.separator:Ljava/lang/String;
        //   272: dup            
        //   273: ldc             "File.separator"
        //   275: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   278: checkcast       Ljava/lang/CharSequence;
        //   281: aconst_null    
        //   282: aconst_null    
        //   283: iconst_0       
        //   284: aconst_null    
        //   285: aconst_null    
        //   286: bipush          124
        //   288: aconst_null    
        //   289: invokestatic    kotlin/collections/CollectionsKt.joinTo$default:(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Appendable;
        //   292: pop            
        //   293: aload           res
        //   295: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   298: areturn        
        //    StackMapTable: 00 09 FD 00 22 07 00 CF 07 00 CF FF 00 32 00 11 07 00 4D 07 00 4D 07 00 CF 07 00 CF 01 01 00 07 00 4D 01 01 07 00 4D 01 01 01 01 01 01 00 00 2E FF 00 1D 00 11 07 00 4D 07 00 4D 07 00 CF 07 00 CF 01 01 01 07 00 5F 01 01 07 00 4D 01 01 01 01 01 01 00 00 1A 17 0C 16 2B
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final File copyTo(@NotNull final File $this$copyTo, @NotNull final File target, final boolean overwrite, final int bufferSize) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "$this$copyTo"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_1         /* target */
        //     8: ldc_w           "target"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload_0         /* $this$copyTo */
        //    15: invokevirtual   java/io/File.exists:()Z
        //    18: ifne            39
        //    21: new             Lkotlin/io/NoSuchFileException;
        //    24: dup            
        //    25: aload_0         /* $this$copyTo */
        //    26: aconst_null    
        //    27: ldc_w           "The source file doesn't exist."
        //    30: iconst_2       
        //    31: aconst_null    
        //    32: invokespecial   kotlin/io/NoSuchFileException.<init>:(Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    35: checkcast       Ljava/lang/Throwable;
        //    38: athrow         
        //    39: aload_1         /* target */
        //    40: invokevirtual   java/io/File.exists:()Z
        //    43: ifeq            89
        //    46: iload_2         /* overwrite */
        //    47: ifne            54
        //    50: iconst_1       
        //    51: goto            66
        //    54: aload_1         /* target */
        //    55: invokevirtual   java/io/File.delete:()Z
        //    58: ifne            65
        //    61: iconst_1       
        //    62: goto            66
        //    65: iconst_0       
        //    66: istore          stillExists
        //    68: iload           stillExists
        //    70: ifeq            89
        //    73: new             Lkotlin/io/FileAlreadyExistsException;
        //    76: dup            
        //    77: aload_0         /* $this$copyTo */
        //    78: aload_1         /* target */
        //    79: ldc_w           "The destination file already exists."
        //    82: invokespecial   kotlin/io/FileAlreadyExistsException.<init>:(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
        //    85: checkcast       Ljava/lang/Throwable;
        //    88: athrow         
        //    89: aload_0         /* $this$copyTo */
        //    90: invokevirtual   java/io/File.isDirectory:()Z
        //    93: ifeq            119
        //    96: aload_1         /* target */
        //    97: invokevirtual   java/io/File.mkdirs:()Z
        //   100: ifne            301
        //   103: new             Lkotlin/io/FileSystemException;
        //   106: dup            
        //   107: aload_0         /* $this$copyTo */
        //   108: aload_1         /* target */
        //   109: ldc_w           "Failed to create target directory."
        //   112: invokespecial   kotlin/io/FileSystemException.<init>:(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
        //   115: checkcast       Ljava/lang/Throwable;
        //   118: athrow         
        //   119: aload_1         /* target */
        //   120: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //   123: dup            
        //   124: ifnull          134
        //   127: invokevirtual   java/io/File.mkdirs:()Z
        //   130: pop            
        //   131: goto            135
        //   134: pop            
        //   135: aload_0         /* $this$copyTo */
        //   136: astore          4
        //   138: iconst_0       
        //   139: istore          5
        //   141: new             Ljava/io/FileInputStream;
        //   144: dup            
        //   145: aload           4
        //   147: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   150: checkcast       Ljava/io/Closeable;
        //   153: astore          4
        //   155: iconst_0       
        //   156: istore          5
        //   158: aconst_null    
        //   159: checkcast       Ljava/lang/Throwable;
        //   162: astore          6
        //   164: nop            
        //   165: aload           4
        //   167: checkcast       Ljava/io/FileInputStream;
        //   170: astore          input
        //   172: iconst_0       
        //   173: istore          $i$a$-use-FilesKt__UtilsKt$copyTo$1
        //   175: aload_1         /* target */
        //   176: astore          10
        //   178: iconst_0       
        //   179: istore          11
        //   181: new             Ljava/io/FileOutputStream;
        //   184: dup            
        //   185: aload           10
        //   187: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   190: checkcast       Ljava/io/Closeable;
        //   193: astore          10
        //   195: iconst_0       
        //   196: istore          11
        //   198: aconst_null    
        //   199: checkcast       Ljava/lang/Throwable;
        //   202: astore          12
        //   204: nop            
        //   205: aload           10
        //   207: checkcast       Ljava/io/FileOutputStream;
        //   210: astore          output
        //   212: iconst_0       
        //   213: istore          $i$a$-use-FilesKt__UtilsKt$copyTo$1$1
        //   215: aload           input
        //   217: checkcast       Ljava/io/InputStream;
        //   220: aload           output
        //   222: checkcast       Ljava/io/OutputStream;
        //   225: iload_3         /* bufferSize */
        //   226: invokestatic    kotlin/io/ByteStreamsKt.copyTo:(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
        //   229: lstore          null
        //   231: aload           10
        //   233: aload           12
        //   235: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   238: lload           13
        //   240: goto            264
        //   243: astore          13
        //   245: aload           13
        //   247: astore          12
        //   249: aload           13
        //   251: athrow         
        //   252: astore          13
        //   254: aload           10
        //   256: aload           12
        //   258: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   261: aload           13
        //   263: athrow         
        //   264: nop            
        //   265: lstore          null
        //   267: aload           4
        //   269: aload           6
        //   271: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   274: lload           7
        //   276: goto            300
        //   279: astore          7
        //   281: aload           7
        //   283: astore          6
        //   285: aload           7
        //   287: athrow         
        //   288: astore          7
        //   290: aload           4
        //   292: aload           6
        //   294: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   297: aload           7
        //   299: athrow         
        //   300: pop2           
        //   301: aload_1         /* target */
        //   302: areturn        
        //    StackMapTable: 00 0F 27 0E 0A 40 01 16 1D 4E 07 00 4D 00 FF 00 6B 00 0D 07 00 4D 07 00 4D 01 01 07 01 38 01 07 00 78 07 01 33 00 01 07 01 38 01 07 00 78 00 01 07 00 78 48 07 00 78 FF 00 0B 00 0F 07 00 4D 07 00 4D 01 01 07 01 38 01 07 00 78 07 01 33 00 01 07 01 38 01 07 00 78 04 01 00 01 04 FF 00 0E 00 07 07 00 4D 07 00 4D 01 01 07 01 38 01 07 00 78 00 01 07 00 78 48 07 00 78 FF 00 0B 00 0E 07 00 4D 07 00 4D 01 01 07 01 38 01 07 00 78 04 01 07 01 38 01 07 00 78 04 01 00 01 04 FF 00 00 00 04 07 00 4D 07 00 4D 01 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  204    231    243    252    Ljava/lang/Throwable;
        //  204    231    252    264    Any
        //  243    252    252    264    Any
        //  252    254    252    264    Any
        //  164    267    279    288    Ljava/lang/Throwable;
        //  164    267    288    300    Any
        //  279    288    288    300    Any
        //  288    290    288    300    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.remove(ArrayList.java:535)
        //     at com.strobel.assembler.ir.StackMappingVisitor.pop(StackMappingVisitor.java:267)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:548)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static /* synthetic */ File copyTo$default(final File $this$copyTo, final File target, boolean overwrite, int bufferSize, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            overwrite = false;
        }
        if ((n & 0x4) != 0x0) {
            bufferSize = 8192;
        }
        return copyTo($this$copyTo, target, overwrite, bufferSize);
    }
    
    public static final boolean copyRecursively(@NotNull final File $this$copyRecursively, @NotNull final File target, final boolean overwrite, @NotNull final Function2<? super File, ? super IOException, ? extends OnErrorAction> onError) {
        Intrinsics.checkParameterIsNotNull($this$copyRecursively, "$this$copyRecursively");
        Intrinsics.checkParameterIsNotNull(target, "target");
        Intrinsics.checkParameterIsNotNull(onError, "onError");
        if (!$this$copyRecursively.exists()) {
            return (OnErrorAction)onError.invoke($this$copyRecursively, new NoSuchFileException($this$copyRecursively, null, "The source file doesn't exist.", 2, null)) != OnErrorAction.TERMINATE;
        }
        try {
            for (final File src : FilesKt__FileTreeWalkKt.walkTopDown($this$copyRecursively).onFail((Function2<? super File, ? super IOException, Unit>)new FilesKt__UtilsKt$copyRecursively.FilesKt__UtilsKt$copyRecursively$2((Function2)onError))) {
                if (!src.exists()) {
                    if ((OnErrorAction)onError.invoke(src, new NoSuchFileException(src, null, "The source file doesn't exist.", 2, null)) == OnErrorAction.TERMINATE) {
                        return false;
                    }
                    continue;
                }
                else {
                    final String relPath = toRelativeString(src, $this$copyRecursively);
                    final File dstFile = new File(target, relPath);
                    if (dstFile.exists() && (!src.isDirectory() || !dstFile.isDirectory())) {
                        final boolean stillExists = !overwrite || (dstFile.isDirectory() ? (!deleteRecursively(dstFile)) : (!dstFile.delete()));
                        if (stillExists) {
                            if ((OnErrorAction)onError.invoke(dstFile, new FileAlreadyExistsException(src, dstFile, "The destination file already exists.")) == OnErrorAction.TERMINATE) {
                                return false;
                            }
                            continue;
                        }
                    }
                    if (src.isDirectory()) {
                        dstFile.mkdirs();
                    }
                    else {
                        if (copyTo$default(src, dstFile, overwrite, 0, 4, null).length() != src.length() && (OnErrorAction)onError.invoke(src, new IOException("Source file wasn't copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE) {
                            return false;
                        }
                        continue;
                    }
                }
            }
            return true;
        }
        catch (TerminateException e) {
            return false;
        }
    }
    
    public static final boolean deleteRecursively(@NotNull final File $this$deleteRecursively) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "$this$deleteRecursively"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0         /* $this$deleteRecursively */
        //     8: invokestatic    kotlin/io/FilesKt.walkBottomUp:(Ljava/io/File;)Lkotlin/io/FileTreeWalk;
        //    11: checkcast       Lkotlin/sequences/Sequence;
        //    14: astore_1       
        //    15: iconst_1       
        //    16: istore_2        /* initial$iv */
        //    17: iconst_0       
        //    18: istore_3        /* $i$f$fold */
        //    19: iload_2         /* initial$iv */
        //    20: istore          accumulator$iv
        //    22: aload_1         /* $this$fold$iv */
        //    23: invokeinterface kotlin/sequences/Sequence.iterator:()Ljava/util/Iterator;
        //    28: astore          5
        //    30: aload           5
        //    32: invokeinterface java/util/Iterator.hasNext:()Z
        //    37: ifeq            94
        //    40: aload           5
        //    42: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    47: astore          element$iv
        //    49: iload           accumulator$iv
        //    51: aload           element$iv
        //    53: checkcast       Ljava/io/File;
        //    56: astore          7
        //    58: istore          res
        //    60: iconst_0       
        //    61: istore          $i$a$-fold-FilesKt__UtilsKt$deleteRecursively$1
        //    63: aload           it
        //    65: invokevirtual   java/io/File.delete:()Z
        //    68: ifne            79
        //    71: aload           it
        //    73: invokevirtual   java/io/File.exists:()Z
        //    76: ifne            88
        //    79: iload           res
        //    81: ifeq            88
        //    84: iconst_1       
        //    85: goto            89
        //    88: iconst_0       
        //    89: istore          accumulator$iv
        //    91: goto            30
        //    94: iload           accumulator$iv
        //    96: ireturn        
        //    StackMapTable: 00 05 FF 00 1E 00 06 07 00 4D 07 01 A4 01 01 01 07 01 7A 00 00 FF 00 30 00 0A 07 00 4D 07 01 A4 01 01 01 07 01 7A 07 01 A7 07 00 4D 01 01 00 00 08 40 01 FF 00 04 00 06 07 00 4D 07 01 A4 01 01 01 07 01 7A 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final boolean startsWith(@NotNull final File $this$startsWith, @NotNull final File other) {
        Intrinsics.checkParameterIsNotNull($this$startsWith, "$this$startsWith");
        Intrinsics.checkParameterIsNotNull(other, "other");
        final FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents($this$startsWith);
        final FilePathComponents otherComponents = FilesKt__FilePathComponentsKt.toComponents(other);
        return !(Intrinsics.areEqual(components.getRoot(), otherComponents.getRoot()) ^ true) && components.getSize() >= otherComponents.getSize() && components.getSegments().subList(0, otherComponents.getSize()).equals(otherComponents.getSegments());
    }
    
    public static final boolean startsWith(@NotNull final File $this$startsWith, @NotNull final String other) {
        Intrinsics.checkParameterIsNotNull($this$startsWith, "$this$startsWith");
        Intrinsics.checkParameterIsNotNull(other, "other");
        return startsWith($this$startsWith, new File(other));
    }
    
    public static final boolean endsWith(@NotNull final File $this$endsWith, @NotNull final File other) {
        Intrinsics.checkParameterIsNotNull($this$endsWith, "$this$endsWith");
        Intrinsics.checkParameterIsNotNull(other, "other");
        final FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents($this$endsWith);
        final FilePathComponents otherComponents = FilesKt__FilePathComponentsKt.toComponents(other);
        if (otherComponents.isRooted()) {
            return Intrinsics.areEqual($this$endsWith, other);
        }
        final int shift = components.getSize() - otherComponents.getSize();
        return shift >= 0 && components.getSegments().subList(shift, components.getSize()).equals(otherComponents.getSegments());
    }
    
    public static final boolean endsWith(@NotNull final File $this$endsWith, @NotNull final String other) {
        Intrinsics.checkParameterIsNotNull($this$endsWith, "$this$endsWith");
        Intrinsics.checkParameterIsNotNull(other, "other");
        return endsWith($this$endsWith, new File(other));
    }
    
    @NotNull
    public static final File normalize(@NotNull final File $this$normalize) {
        Intrinsics.checkParameterIsNotNull($this$normalize, "$this$normalize");
        final FilePathComponents $this$with = FilesKt__FilePathComponentsKt.toComponents($this$normalize);
        final int n = 0;
        final File root = $this$with.getRoot();
        final List<File> list = normalize$FilesKt__UtilsKt($this$with.getSegments());
        final String separator = File.separator;
        Intrinsics.checkExpressionValueIsNotNull(separator, "File.separator");
        return resolve(root, CollectionsKt___CollectionsKt.joinToString$default(list, separator, null, null, 0, null, null, 62, null));
    }
    
    private static final FilePathComponents normalize$FilesKt__UtilsKt(@NotNull final FilePathComponents $this$normalize) {
        return new FilePathComponents($this$normalize.getRoot(), normalize$FilesKt__UtilsKt($this$normalize.getSegments()));
    }
    
    private static final List<File> normalize$FilesKt__UtilsKt(@NotNull final List<? extends File> $this$normalize) {
        final List list = new ArrayList($this$normalize.size());
        for (final File file : $this$normalize) {
            final String name = file.getName();
            if (name != null) {
                final String s = name;
                switch (s.hashCode()) {
                    case 1472: {
                        if (!s.equals("..")) {
                            break;
                        }
                        if (!list.isEmpty() && (Intrinsics.areEqual(CollectionsKt___CollectionsKt.last((List<? extends File>)list).getName(), "..") ^ true)) {
                            list.remove(list.size() - 1);
                            continue;
                        }
                        list.add(file);
                        continue;
                    }
                    case 46: {
                        if (s.equals(".")) {
                            continue;
                        }
                        break;
                    }
                }
            }
            list.add(file);
        }
        return (List<File>)list;
    }
    
    @NotNull
    public static final File resolve(@NotNull final File $this$resolve, @NotNull final File relative) {
        Intrinsics.checkParameterIsNotNull($this$resolve, "$this$resolve");
        Intrinsics.checkParameterIsNotNull(relative, "relative");
        if (FilesKt__FilePathComponentsKt.isRooted(relative)) {
            return relative;
        }
        final String string = $this$resolve.toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "this.toString()");
        final String baseName = string;
        return (baseName.length() == 0 || StringsKt__StringsKt.endsWith$default(baseName, File.separatorChar, false, 2, null)) ? new File(baseName + relative) : new File(baseName + File.separatorChar + relative);
    }
    
    @NotNull
    public static final File resolve(@NotNull final File $this$resolve, @NotNull final String relative) {
        Intrinsics.checkParameterIsNotNull($this$resolve, "$this$resolve");
        Intrinsics.checkParameterIsNotNull(relative, "relative");
        return resolve($this$resolve, new File(relative));
    }
    
    @NotNull
    public static final File resolveSibling(@NotNull final File $this$resolveSibling, @NotNull final File relative) {
        Intrinsics.checkParameterIsNotNull($this$resolveSibling, "$this$resolveSibling");
        Intrinsics.checkParameterIsNotNull(relative, "relative");
        final FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents($this$resolveSibling);
        final File parentSubPath = (components.getSize() == 0) ? new File("..") : components.subPath(0, components.getSize() - 1);
        return resolve(resolve(components.getRoot(), parentSubPath), relative);
    }
    
    @NotNull
    public static final File resolveSibling(@NotNull final File $this$resolveSibling, @NotNull final String relative) {
        Intrinsics.checkParameterIsNotNull($this$resolveSibling, "$this$resolveSibling");
        Intrinsics.checkParameterIsNotNull(relative, "relative");
        return resolveSibling($this$resolveSibling, new File(relative));
    }
    
    public FilesKt__UtilsKt() {
    }
}
