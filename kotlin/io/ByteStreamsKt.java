// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import kotlin.SinceKotlin;
import kotlin.ReplaceWith;
import kotlin.Deprecated;
import java.io.ByteArrayOutputStream;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import kotlin.text.Charsets;
import kotlin.internal.InlineOnly;
import kotlin.TypeCastException;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.collections.ByteIterator;
import org.jetbrains.annotations.NotNull;
import java.io.BufferedInputStream;
import kotlin.jvm.JvmName;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\u000b\u001a\u00020\f*\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\r\u001a\u00020\u000e*\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u001c\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\r\u0010\u0013\u001a\u00020\u000e*\u00020\u0014H\u0087\b\u001a\u001d\u0010\u0013\u001a\u00020\u000e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0018*\u00020\u0001H\u0086\u0002\u001a\f\u0010\u0019\u001a\u00020\u0014*\u00020\u0002H\u0007\u001a\u0016\u0010\u0019\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007\u001a\u0017\u0010\u001b\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\u001d\u001a\u00020\u001e*\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b¨\u0006\u001f" }, d2 = { "buffered", "Ljava/io/BufferedInputStream;", "Ljava/io/InputStream;", "bufferSize", "", "Ljava/io/BufferedOutputStream;", "Ljava/io/OutputStream;", "bufferedReader", "Ljava/io/BufferedReader;", "charset", "Ljava/nio/charset/Charset;", "bufferedWriter", "Ljava/io/BufferedWriter;", "byteInputStream", "Ljava/io/ByteArrayInputStream;", "", "copyTo", "", "out", "inputStream", "", "offset", "length", "iterator", "Lkotlin/collections/ByteIterator;", "readBytes", "estimatedSize", "reader", "Ljava/io/InputStreamReader;", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib" })
@JvmName(name = "ByteStreamsKt")
public final class ByteStreamsKt
{
    @NotNull
    public static final ByteIterator iterator(@NotNull final BufferedInputStream $this$iterator) {
        Intrinsics.checkParameterIsNotNull($this$iterator, "$this$iterator");
        return (ByteIterator)new ByteStreamsKt$iterator.ByteStreamsKt$iterator$1($this$iterator);
    }
    
    @InlineOnly
    private static final ByteArrayInputStream byteInputStream(@NotNull final String $this$byteInputStream, final Charset charset) {
        final int $i$f$byteInputStream = 0;
        if ($this$byteInputStream == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final byte[] bytes = $this$byteInputStream.getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }
    
    @InlineOnly
    private static final ByteArrayInputStream inputStream(@NotNull final byte[] $this$inputStream) {
        final int $i$f$inputStream = 0;
        return new ByteArrayInputStream($this$inputStream);
    }
    
    @InlineOnly
    private static final ByteArrayInputStream inputStream(@NotNull final byte[] $this$inputStream, final int offset, final int length) {
        final int $i$f$inputStream = 0;
        return new ByteArrayInputStream($this$inputStream, offset, length);
    }
    
    @InlineOnly
    private static final BufferedInputStream buffered(@NotNull final InputStream $this$buffered, final int bufferSize) {
        final int $i$f$buffered = 0;
        return (BufferedInputStream)(($this$buffered instanceof BufferedInputStream) ? $this$buffered : new BufferedInputStream($this$buffered, bufferSize));
    }
    
    @InlineOnly
    private static final InputStreamReader reader(@NotNull final InputStream $this$reader, final Charset charset) {
        final int $i$f$reader = 0;
        return new InputStreamReader($this$reader, charset);
    }
    
    @InlineOnly
    private static final BufferedReader bufferedReader(@NotNull final InputStream $this$bufferedReader, final Charset charset) {
        final int $i$f$bufferedReader = 0;
        final InputStreamReader in = new InputStreamReader($this$bufferedReader, charset);
        final int sz = 8192;
        return (in instanceof BufferedReader) ? in : new BufferedReader(in, sz);
    }
    
    @InlineOnly
    private static final BufferedOutputStream buffered(@NotNull final OutputStream $this$buffered, final int bufferSize) {
        final int $i$f$buffered = 0;
        return (BufferedOutputStream)(($this$buffered instanceof BufferedOutputStream) ? $this$buffered : new BufferedOutputStream($this$buffered, bufferSize));
    }
    
    @InlineOnly
    private static final OutputStreamWriter writer(@NotNull final OutputStream $this$writer, final Charset charset) {
        final int $i$f$writer = 0;
        return new OutputStreamWriter($this$writer, charset);
    }
    
    @InlineOnly
    private static final BufferedWriter bufferedWriter(@NotNull final OutputStream $this$bufferedWriter, final Charset charset) {
        final int $i$f$bufferedWriter = 0;
        final OutputStreamWriter out = new OutputStreamWriter($this$bufferedWriter, charset);
        final int sz = 8192;
        return (out instanceof BufferedWriter) ? out : new BufferedWriter(out, sz);
    }
    
    public static final long copyTo(@NotNull final InputStream $this$copyTo, @NotNull final OutputStream out, final int bufferSize) {
        Intrinsics.checkParameterIsNotNull($this$copyTo, "$this$copyTo");
        Intrinsics.checkParameterIsNotNull(out, "out");
        long bytesCopied = 0L;
        final byte[] buffer = new byte[bufferSize];
        for (int bytes = $this$copyTo.read(buffer); bytes >= 0; bytes = $this$copyTo.read(buffer)) {
            out.write(buffer, 0, bytes);
            bytesCopied += bytes;
        }
        return bytesCopied;
    }
    
    public static /* synthetic */ long copyTo$default(final InputStream $this$copyTo, final OutputStream out, int bufferSize, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            bufferSize = 8192;
        }
        return copyTo($this$copyTo, out, bufferSize);
    }
    
    @Deprecated(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @ReplaceWith(imports = {}, expression = "readBytes()"))
    @NotNull
    @java.lang.Deprecated
    public static final byte[] readBytes(@NotNull final InputStream $this$readBytes, final int estimatedSize) {
        Intrinsics.checkParameterIsNotNull($this$readBytes, "$this$readBytes");
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream(Math.max(estimatedSize, $this$readBytes.available()));
        copyTo$default($this$readBytes, buffer, 0, 2, null);
        final byte[] byteArray = buffer.toByteArray();
        Intrinsics.checkExpressionValueIsNotNull(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
    
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] readBytes(@NotNull final InputStream $this$readBytes) {
        Intrinsics.checkParameterIsNotNull($this$readBytes, "$this$readBytes");
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream(Math.max(8192, $this$readBytes.available()));
        copyTo$default($this$readBytes, buffer, 0, 2, null);
        final byte[] byteArray = buffer.toByteArray();
        Intrinsics.checkExpressionValueIsNotNull(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}
