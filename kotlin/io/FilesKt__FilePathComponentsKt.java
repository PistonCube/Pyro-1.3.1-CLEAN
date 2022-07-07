// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u000b\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0002\b\r\u001a\u001c\u0010\u000e\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0002H\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0002*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013" }, d2 = { "isRooted", "", "Ljava/io/File;", "(Ljava/io/File;)Z", "root", "getRoot", "(Ljava/io/File;)Ljava/io/File;", "rootName", "", "getRootName", "(Ljava/io/File;)Ljava/lang/String;", "getRootLength", "", "getRootLength$FilesKt__FilePathComponentsKt", "subPath", "beginIndex", "endIndex", "toComponents", "Lkotlin/io/FilePathComponents;", "kotlin-stdlib" }, xs = "kotlin/io/FilesKt")
class FilesKt__FilePathComponentsKt
{
    private static final int getRootLength$FilesKt__FilePathComponentsKt(@NotNull final String $this$getRootLength) {
        int first = StringsKt__StringsKt.indexOf$default($this$getRootLength, File.separatorChar, 0, false, 4, null);
        if (first == 0) {
            if ($this$getRootLength.length() > 1 && $this$getRootLength.charAt(1) == File.separatorChar) {
                first = StringsKt__StringsKt.indexOf$default($this$getRootLength, File.separatorChar, 2, false, 4, null);
                if (first >= 0) {
                    first = StringsKt__StringsKt.indexOf$default($this$getRootLength, File.separatorChar, first + 1, false, 4, null);
                    if (first >= 0) {
                        return first + 1;
                    }
                    return $this$getRootLength.length();
                }
            }
            return 1;
        }
        if (first > 0 && $this$getRootLength.charAt(first - 1) == ':') {
            return ++first;
        }
        if (first == -1 && StringsKt__StringsKt.endsWith$default($this$getRootLength, ':', false, 2, null)) {
            return $this$getRootLength.length();
        }
        return 0;
    }
    
    @NotNull
    public static final String getRootName(@NotNull final File $this$rootName) {
        Intrinsics.checkParameterIsNotNull($this$rootName, "$this$rootName");
        final String path = $this$rootName.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "path");
        final String s = path;
        final int beginIndex = 0;
        final String path2 = $this$rootName.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path2, "path");
        final int rootLength$FilesKt__FilePathComponentsKt = getRootLength$FilesKt__FilePathComponentsKt(path2);
        final String s2 = s;
        if (s2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final String substring = s2.substring(beginIndex, rootLength$FilesKt__FilePathComponentsKt);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return substring;
    }
    
    @NotNull
    public static final File getRoot(@NotNull final File $this$root) {
        Intrinsics.checkParameterIsNotNull($this$root, "$this$root");
        return new File(getRootName($this$root));
    }
    
    public static final boolean isRooted(@NotNull final File $this$isRooted) {
        Intrinsics.checkParameterIsNotNull($this$isRooted, "$this$isRooted");
        final String path = $this$isRooted.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "path");
        return getRootLength$FilesKt__FilePathComponentsKt(path) > 0;
    }
    
    @NotNull
    public static final FilePathComponents toComponents(@NotNull final File $this$toComponents) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$toComponents"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$toComponents */
        //     7: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //    10: astore_1        /* path */
        //    11: aload_1         /* path */
        //    12: dup            
        //    13: ldc             "path"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: invokestatic    kotlin/io/FilesKt__FilePathComponentsKt.getRootLength$FilesKt__FilePathComponentsKt:(Ljava/lang/String;)I
        //    21: istore_2        /* rootLength */
        //    22: aload_1         /* path */
        //    23: astore          4
        //    25: iconst_0       
        //    26: istore          5
        //    28: iconst_0       
        //    29: istore          6
        //    31: aload           4
        //    33: iload           5
        //    35: iload_2         /* rootLength */
        //    36: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    39: dup            
        //    40: ldc             "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
        //    42: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    45: astore_3        /* rootName */
        //    46: aload_1         /* path */
        //    47: astore          5
        //    49: iconst_0       
        //    50: istore          6
        //    52: aload           5
        //    54: iload_2         /* rootLength */
        //    55: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    58: dup            
        //    59: ldc             "(this as java.lang.String).substring(startIndex)"
        //    61: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    64: astore          subPath
        //    66: aload           subPath
        //    68: checkcast       Ljava/lang/CharSequence;
        //    71: astore          6
        //    73: iconst_0       
        //    74: istore          7
        //    76: aload           6
        //    78: invokeinterface java/lang/CharSequence.length:()I
        //    83: ifne            90
        //    86: iconst_1       
        //    87: goto            91
        //    90: iconst_0       
        //    91: ifeq            103
        //    94: iconst_0       
        //    95: istore          6
        //    97: invokestatic    kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        //   100: goto            230
        //   103: aload           subPath
        //   105: checkcast       Ljava/lang/CharSequence;
        //   108: iconst_1       
        //   109: newarray        C
        //   111: dup            
        //   112: iconst_0       
        //   113: getstatic       java/io/File.separatorChar:C
        //   116: castore        
        //   117: iconst_0       
        //   118: iconst_0       
        //   119: bipush          6
        //   121: aconst_null    
        //   122: invokestatic    kotlin/text/StringsKt.split$default:(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;
        //   125: checkcast       Ljava/lang/Iterable;
        //   128: astore          $this$map$iv
        //   130: iconst_0       
        //   131: istore          $i$f$map
        //   133: aload           $this$map$iv
        //   135: astore          8
        //   137: new             Ljava/util/ArrayList;
        //   140: dup            
        //   141: aload           $this$map$iv
        //   143: bipush          10
        //   145: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   148: invokespecial   java/util/ArrayList.<init>:(I)V
        //   151: checkcast       Ljava/util/Collection;
        //   154: astore          destination$iv$iv
        //   156: iconst_0       
        //   157: istore          $i$f$mapTo
        //   159: aload           $this$mapTo$iv$iv
        //   161: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   166: astore          11
        //   168: aload           11
        //   170: invokeinterface java/util/Iterator.hasNext:()Z
        //   175: ifeq            225
        //   178: aload           11
        //   180: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   185: astore          item$iv$iv
        //   187: aload           destination$iv$iv
        //   189: aload           item$iv$iv
        //   191: checkcast       Ljava/lang/String;
        //   194: astore          13
        //   196: astore          15
        //   198: iconst_0       
        //   199: istore          $i$a$-unknown-FilesKt__FilePathComponentsKt$toComponents$list$1
        //   201: new             Ljava/io/File;
        //   204: dup            
        //   205: aload           p1
        //   207: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   210: astore          16
        //   212: aload           15
        //   214: aload           16
        //   216: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   221: pop            
        //   222: goto            168
        //   225: aload           destination$iv$iv
        //   227: checkcast       Ljava/util/List;
        //   230: astore          list
        //   232: new             Lkotlin/io/FilePathComponents;
        //   235: dup            
        //   236: new             Ljava/io/File;
        //   239: dup            
        //   240: aload_3         /* rootName */
        //   241: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   244: aload           list
        //   246: invokespecial   kotlin/io/FilePathComponents.<init>:(Ljava/io/File;Ljava/util/List;)V
        //   249: areturn        
        //    StackMapTable: 00 06 FF 00 5A 00 08 07 00 2C 07 00 38 01 07 00 38 07 00 38 07 00 38 07 00 2A 01 00 00 40 01 0B FF 00 40 00 0C 07 00 2C 07 00 38 01 07 00 38 07 00 38 07 00 38 07 00 86 01 07 00 86 07 00 91 01 07 00 97 00 00 38 FF 00 04 00 08 07 00 2C 07 00 38 01 07 00 38 07 00 38 07 00 38 00 01 00 01 07 00 A5
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final File subPath(@NotNull final File $this$subPath, final int beginIndex, final int endIndex) {
        Intrinsics.checkParameterIsNotNull($this$subPath, "$this$subPath");
        return toComponents($this$subPath).subPath(beginIndex, endIndex);
    }
    
    public FilesKt__FilePathComponentsKt() {
    }
}
