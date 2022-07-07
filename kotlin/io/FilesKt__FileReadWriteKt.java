// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import kotlin.sequences.Sequence;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.BufferedReader;
import kotlin.text.Charsets;
import kotlin.internal.InlineOnly;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import java.io.File;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 5, xi = 1, d1 = { "\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a!\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087\b\u001a!\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087\b\u001aB\u0010\u0010\u001a\u00020\u0001*\u00020\u000226\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001aJ\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\r26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001a7\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0002H\u0087\b\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0017\u0010\u001f\u001a\u00020 *\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u001a\n\u0010!\u001a\u00020\u0004*\u00020\u0002\u001a\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0014\u0010$\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010%\u001a\u00020&*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u001a?\u0010'\u001a\u0002H(\"\u0004\b\u0000\u0010(*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070*\u0012\u0004\u0012\u0002H(0\u0019H\u0086\b\u00f8\u0001\u0000¢\u0006\u0002\u0010,\u001a\u0012\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010.\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010/\u001a\u000200*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u0082\u0002\b\n\u0006\b\u0011(+0\u0001¨\u00061" }, d2 = { "appendBytes", "", "Ljava/io/File;", "array", "", "appendText", "text", "", "charset", "Ljava/nio/charset/Charset;", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "bufferedWriter", "Ljava/io/BufferedWriter;", "forEachBlock", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "buffer", "bytesRead", "blockSize", "forEachLine", "Lkotlin/Function1;", "line", "inputStream", "Ljava/io/FileInputStream;", "outputStream", "Ljava/io/FileOutputStream;", "printWriter", "Ljava/io/PrintWriter;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "Requires newer compiler version to be inlined correctly.", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "writeText", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib" }, xs = "kotlin/io/FilesKt")
class FilesKt__FileReadWriteKt extends FilesKt__FilePathComponentsKt
{
    @InlineOnly
    private static final InputStreamReader reader(@NotNull final File $this$reader, final Charset charset) {
        final int $i$f$reader = 0;
        return new InputStreamReader(new FileInputStream($this$reader), charset);
    }
    
    @InlineOnly
    private static final BufferedReader bufferedReader(@NotNull final File $this$bufferedReader, final Charset charset, final int bufferSize) {
        final int $i$f$bufferedReader = 0;
        final InputStreamReader in = new InputStreamReader(new FileInputStream($this$bufferedReader), charset);
        return (in instanceof BufferedReader) ? in : new BufferedReader(in, bufferSize);
    }
    
    @InlineOnly
    private static final OutputStreamWriter writer(@NotNull final File $this$writer, final Charset charset) {
        final int $i$f$writer = 0;
        return new OutputStreamWriter(new FileOutputStream($this$writer), charset);
    }
    
    @InlineOnly
    private static final BufferedWriter bufferedWriter(@NotNull final File $this$bufferedWriter, final Charset charset, final int bufferSize) {
        final int $i$f$bufferedWriter = 0;
        final OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream($this$bufferedWriter), charset);
        return (out instanceof BufferedWriter) ? out : new BufferedWriter(out, bufferSize);
    }
    
    @InlineOnly
    private static final PrintWriter printWriter(@NotNull final File $this$printWriter, final Charset charset) {
        final int $i$f$printWriter = 0;
        final int sz = 8192;
        final OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream($this$printWriter), charset);
        return new PrintWriter((out instanceof BufferedWriter) ? out : new BufferedWriter(out, sz));
    }
    
    @NotNull
    public static final byte[] readBytes(@NotNull final File $this$readBytes) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$readBytes"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* $this$readBytes */
        //     7: astore_1       
        //     8: iconst_0       
        //     9: istore_2       
        //    10: new             Ljava/io/FileInputStream;
        //    13: dup            
        //    14: aload_1        
        //    15: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    18: checkcast       Ljava/io/Closeable;
        //    21: astore_1       
        //    22: iconst_0       
        //    23: istore_2       
        //    24: aconst_null    
        //    25: checkcast       Ljava/lang/Throwable;
        //    28: astore_3       
        //    29: nop            
        //    30: aload_1        
        //    31: checkcast       Ljava/io/FileInputStream;
        //    34: astore          input
        //    36: iconst_0       
        //    37: istore          $i$a$-use-FilesKt__FileReadWriteKt$readBytes$1
        //    39: iconst_0       
        //    40: istore          offset
        //    42: aload_0         /* $this$readBytes */
        //    43: invokevirtual   java/io/File.length:()J
        //    46: lstore          7
        //    48: iconst_0       
        //    49: istore          9
        //    51: iconst_0       
        //    52: istore          10
        //    54: lload           7
        //    56: lstore          length
        //    58: iconst_0       
        //    59: istore          $i$a$-also-FilesKt__FileReadWriteKt$readBytes$1$remaining$1
        //    61: lload           length
        //    63: ldc             2147483647
        //    65: i2l            
        //    66: lcmp           
        //    67: ifle            115
        //    70: new             Ljava/lang/OutOfMemoryError;
        //    73: dup            
        //    74: new             Ljava/lang/StringBuilder;
        //    77: dup            
        //    78: invokespecial   java/lang/StringBuilder.<init>:()V
        //    81: ldc             "File "
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: aload_0         /* $this$readBytes */
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    90: ldc             " is too big ("
        //    92: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    95: lload           length
        //    97: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   100: ldc             " bytes) to fit in memory."
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   108: invokespecial   java/lang/OutOfMemoryError.<init>:(Ljava/lang/String;)V
        //   111: checkcast       Ljava/lang/Throwable;
        //   114: athrow         
        //   115: nop            
        //   116: lload           7
        //   118: l2i            
        //   119: istore          remaining
        //   121: iload           remaining
        //   123: newarray        B
        //   125: astore          result
        //   127: iload           remaining
        //   129: ifle            170
        //   132: aload           input
        //   134: aload           result
        //   136: iload           offset
        //   138: iload           remaining
        //   140: invokevirtual   java/io/FileInputStream.read:([BII)I
        //   143: istore          read
        //   145: iload           read
        //   147: ifge            153
        //   150: goto            170
        //   153: iload           remaining
        //   155: iload           read
        //   157: isub           
        //   158: istore          remaining
        //   160: iload           offset
        //   162: iload           read
        //   164: iadd           
        //   165: istore          offset
        //   167: goto            127
        //   170: iload           remaining
        //   172: ifne            180
        //   175: aload           result
        //   177: goto            200
        //   180: aload           result
        //   182: astore          9
        //   184: iconst_0       
        //   185: istore          10
        //   187: aload           9
        //   189: iload           offset
        //   191: invokestatic    java/util/Arrays.copyOf:([BI)[B
        //   194: dup            
        //   195: ldc             "java.util.Arrays.copyOf(this, newSize)"
        //   197: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   200: nop            
        //   201: astore          null
        //   203: aload_1        
        //   204: aload_3        
        //   205: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   208: aload           4
        //   210: goto            231
        //   213: astore          4
        //   215: aload           4
        //   217: astore_3       
        //   218: aload           4
        //   220: athrow         
        //   221: astore          4
        //   223: aload_1        
        //   224: aload_3        
        //   225: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   228: aload           4
        //   230: athrow         
        //   231: areturn        
        //    StackMapTable: 00 09 FF 00 73 00 0C 07 00 65 07 00 A0 01 07 00 96 07 00 49 01 01 04 01 01 04 01 00 00 FF 00 0B 00 0E 07 00 65 07 00 A0 01 07 00 96 07 00 49 01 01 07 00 C5 00 01 01 04 01 01 00 00 19 10 09 FF 00 13 00 0E 07 00 65 07 00 A0 01 07 00 96 07 00 49 01 01 07 00 C5 00 00 01 04 01 01 00 01 07 00 C5 FF 00 0C 00 04 07 00 65 07 00 A0 01 07 00 96 00 01 07 00 96 47 07 00 96 FF 00 09 00 0E 07 00 65 07 00 A0 01 07 00 96 07 00 C5 01 01 07 00 C5 00 00 01 04 01 01 00 01 07 00 C5
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  29     203    213    221    Ljava/lang/Throwable;
        //  29     203    221    231    Any
        //  213    221    221    231    Any
        //  221    223    221    231    Any
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:595)
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
    
    public static final void writeBytes(@NotNull final File $this$writeBytes, @NotNull final byte[] array) {
        Intrinsics.checkParameterIsNotNull($this$writeBytes, "$this$writeBytes");
        Intrinsics.checkParameterIsNotNull(array, "array");
        final FileOutputStream $this$closeFinally = new FileOutputStream($this$writeBytes);
        Throwable cause = null;
        try {
            final FileOutputStream it = $this$closeFinally;
            final int n = 0;
            it.write(array);
            final Unit instance = Unit.INSTANCE;
        }
        catch (Throwable t) {
            cause = t;
            throw t;
        }
        finally {
            CloseableKt.closeFinally($this$closeFinally, cause);
        }
    }
    
    public static final void appendBytes(@NotNull final File $this$appendBytes, @NotNull final byte[] array) {
        Intrinsics.checkParameterIsNotNull($this$appendBytes, "$this$appendBytes");
        Intrinsics.checkParameterIsNotNull(array, "array");
        final FileOutputStream $this$closeFinally = new FileOutputStream($this$appendBytes, true);
        Throwable cause = null;
        try {
            final FileOutputStream it = $this$closeFinally;
            final int n = 0;
            it.write(array);
            final Unit instance = Unit.INSTANCE;
        }
        catch (Throwable t) {
            cause = t;
            throw t;
        }
        finally {
            CloseableKt.closeFinally($this$closeFinally, cause);
        }
    }
    
    @NotNull
    public static final String readText(@NotNull final File $this$readText, @NotNull final Charset charset) {
        Intrinsics.checkParameterIsNotNull($this$readText, "$this$readText");
        Intrinsics.checkParameterIsNotNull(charset, "charset");
        return new String(readBytes($this$readText), charset);
    }
    
    public static final void writeText(@NotNull final File $this$writeText, @NotNull final String text, @NotNull final Charset charset) {
        Intrinsics.checkParameterIsNotNull($this$writeText, "$this$writeText");
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(charset, "charset");
        final byte[] bytes = text.getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        writeBytes($this$writeText, bytes);
    }
    
    public static final void appendText(@NotNull final File $this$appendText, @NotNull final String text, @NotNull final Charset charset) {
        Intrinsics.checkParameterIsNotNull($this$appendText, "$this$appendText");
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(charset, "charset");
        final byte[] bytes = text.getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        appendBytes($this$appendText, bytes);
    }
    
    public static final void forEachBlock(@NotNull final File $this$forEachBlock, @NotNull final Function2<? super byte[], ? super Integer, Unit> action) {
        Intrinsics.checkParameterIsNotNull($this$forEachBlock, "$this$forEachBlock");
        Intrinsics.checkParameterIsNotNull(action, "action");
        forEachBlock($this$forEachBlock, 4096, action);
    }
    
    public static final void forEachBlock(@NotNull final File $this$forEachBlock, final int blockSize, @NotNull final Function2<? super byte[], ? super Integer, Unit> action) {
        Intrinsics.checkParameterIsNotNull($this$forEachBlock, "$this$forEachBlock");
        Intrinsics.checkParameterIsNotNull(action, "action");
        final byte[] arr = new byte[RangesKt___RangesKt.coerceAtLeast(blockSize, 512)];
        final FileInputStream $this$closeFinally = new FileInputStream($this$forEachBlock);
        Throwable cause = null;
        try {
            final FileInputStream input = $this$closeFinally;
            final int n = 0;
            while (true) {
                final int size = input.read(arr);
                if (size <= 0) {
                    break;
                }
                action.invoke(arr, size);
            }
            final Unit instance = Unit.INSTANCE;
        }
        catch (Throwable t) {
            cause = t;
            throw t;
        }
        finally {
            CloseableKt.closeFinally($this$closeFinally, cause);
        }
    }
    
    public static final void forEachLine(@NotNull final File $this$forEachLine, @NotNull final Charset charset, @NotNull final Function1<? super String, Unit> action) {
        Intrinsics.checkParameterIsNotNull($this$forEachLine, "$this$forEachLine");
        Intrinsics.checkParameterIsNotNull(charset, "charset");
        Intrinsics.checkParameterIsNotNull(action, "action");
        TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream($this$forEachLine), charset)), action);
    }
    
    @InlineOnly
    private static final FileInputStream inputStream(@NotNull final File $this$inputStream) {
        final int $i$f$inputStream = 0;
        return new FileInputStream($this$inputStream);
    }
    
    @InlineOnly
    private static final FileOutputStream outputStream(@NotNull final File $this$outputStream) {
        final int $i$f$outputStream = 0;
        return new FileOutputStream($this$outputStream);
    }
    
    @NotNull
    public static final List<String> readLines(@NotNull final File $this$readLines, @NotNull final Charset charset) {
        Intrinsics.checkParameterIsNotNull($this$readLines, "$this$readLines");
        Intrinsics.checkParameterIsNotNull(charset, "charset");
        final ArrayList result = new ArrayList();
        forEachLine($this$readLines, charset, (Function1<? super String, Unit>)new FilesKt__FileReadWriteKt$readLines.FilesKt__FileReadWriteKt$readLines$1(result));
        return (List<String>)result;
    }
    
    public static final <T> T useLines(@NotNull final File $this$useLines, @NotNull final Charset charset, @NotNull final Function1<? super Sequence<String>, ? extends T> block) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_3        /* $i$f$useLines */
        //     3: aload_0         /* $this$useLines */
        //     4: ldc_w           "$this$useLines"
        //     7: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_1         /* charset */
        //    11: ldc             "charset"
        //    13: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    16: aload_2         /* block */
        //    17: ldc_w           "block"
        //    20: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    23: aload_0         /* $this$useLines */
        //    24: astore          4
        //    26: sipush          8192
        //    29: istore          5
        //    31: iconst_0       
        //    32: istore          6
        //    34: aload           4
        //    36: astore          7
        //    38: iconst_0       
        //    39: istore          8
        //    41: aload           7
        //    43: astore          9
        //    45: iconst_0       
        //    46: istore          10
        //    48: new             Ljava/io/FileInputStream;
        //    51: dup            
        //    52: aload           9
        //    54: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    57: checkcast       Ljava/io/InputStream;
        //    60: astore          9
        //    62: iconst_0       
        //    63: istore          10
        //    65: new             Ljava/io/InputStreamReader;
        //    68: dup            
        //    69: aload           9
        //    71: aload_1         /* charset */
        //    72: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
        //    75: checkcast       Ljava/io/Reader;
        //    78: astore          7
        //    80: iconst_0       
        //    81: istore          8
        //    83: aload           7
        //    85: instanceof      Ljava/io/BufferedReader;
        //    88: ifeq            99
        //    91: aload           7
        //    93: checkcast       Ljava/io/BufferedReader;
        //    96: goto            110
        //    99: new             Ljava/io/BufferedReader;
        //   102: dup            
        //   103: aload           7
        //   105: iload           5
        //   107: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;I)V
        //   110: checkcast       Ljava/io/Closeable;
        //   113: astore          4
        //   115: iconst_0       
        //   116: istore          5
        //   118: aconst_null    
        //   119: checkcast       Ljava/lang/Throwable;
        //   122: astore          6
        //   124: nop            
        //   125: aload           4
        //   127: checkcast       Ljava/io/BufferedReader;
        //   130: astore          it
        //   132: iconst_0       
        //   133: istore          $i$a$-use-FilesKt__FileReadWriteKt$useLines$1
        //   135: aload_2         /* block */
        //   136: aload           it
        //   138: invokestatic    kotlin/io/TextStreamsKt.lineSequence:(Ljava/io/BufferedReader;)Lkotlin/sequences/Sequence;
        //   141: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   146: astore          null
        //   148: iconst_1       
        //   149: invokestatic    kotlin/jvm/internal/InlineMarker.finallyStart:(I)V
        //   152: iconst_1       
        //   153: iconst_1       
        //   154: iconst_0       
        //   155: invokestatic    kotlin/internal/PlatformImplementationsKt.apiVersionIsAtLeast:(III)Z
        //   158: ifeq            171
        //   161: aload           4
        //   163: aload           6
        //   165: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   168: goto            178
        //   171: aload           4
        //   173: invokeinterface java/io/Closeable.close:()V
        //   178: iconst_1       
        //   179: invokestatic    kotlin/jvm/internal/InlineMarker.finallyEnd:(I)V
        //   182: aload           7
        //   184: goto            256
        //   187: astore          7
        //   189: aload           7
        //   191: astore          6
        //   193: aload           7
        //   195: athrow         
        //   196: astore          7
        //   198: iconst_1       
        //   199: invokestatic    kotlin/jvm/internal/InlineMarker.finallyStart:(I)V
        //   202: iconst_1       
        //   203: iconst_1       
        //   204: iconst_0       
        //   205: invokestatic    kotlin/internal/PlatformImplementationsKt.apiVersionIsAtLeast:(III)Z
        //   208: ifeq            221
        //   211: aload           4
        //   213: aload           6
        //   215: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   218: goto            249
        //   221: aload           6
        //   223: ifnonnull       236
        //   226: aload           4
        //   228: invokeinterface java/io/Closeable.close:()V
        //   233: goto            249
        //   236: nop            
        //   237: aload           4
        //   239: invokeinterface java/io/Closeable.close:()V
        //   244: goto            249
        //   247: astore          8
        //   249: iconst_1       
        //   250: invokestatic    kotlin/jvm/internal/InlineMarker.finallyEnd:(I)V
        //   253: aload           7
        //   255: athrow         
        //   256: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1<-Lkotlin/sequences/Sequence<Ljava/lang/String;>;+TT;>;)TT;
        //    StackMapTable: 00 0B FF 00 63 00 0B 07 00 65 07 00 67 07 01 60 01 07 00 65 01 01 07 00 61 01 07 00 4F 01 00 00 4A 07 00 63 FF 00 3C 00 0B 07 00 65 07 00 67 07 01 60 01 07 00 A0 01 07 00 96 07 01 7F 01 07 00 4F 01 00 00 06 48 07 00 96 48 07 00 96 FF 00 18 00 0B 07 00 65 07 00 67 07 01 60 01 07 00 A0 01 07 00 96 07 00 96 01 07 00 4F 01 00 00 0E 4A 07 00 96 FF 00 01 00 0B 07 00 65 07 00 67 07 01 60 01 07 00 A0 01 07 00 96 07 00 96 00 07 00 4F 01 00 00 FF 00 06 00 0B 07 00 65 07 00 67 07 01 60 01 07 00 A0 01 07 00 96 07 01 7F 01 07 00 4F 01 00 01 07 01 7F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  124    148    187    196    Ljava/lang/Throwable;
        //  124    148    196    256    Any
        //  187    196    196    256    Any
        //  196    198    196    256    Any
        //  236    244    247    249    Ljava/lang/Throwable;
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
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:595)
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
    
    public FilesKt__FileReadWriteKt() {
    }
}
