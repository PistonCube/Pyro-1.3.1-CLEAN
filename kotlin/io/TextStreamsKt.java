// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import kotlin.text.Charsets;
import java.nio.charset.Charset;
import java.net.URL;
import java.io.StringWriter;
import java.io.StringReader;
import kotlin.sequences.Sequence;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import java.io.BufferedWriter;
import java.io.Writer;
import kotlin.internal.InlineOnly;
import java.io.BufferedReader;
import org.jetbrains.annotations.NotNull;
import java.io.Reader;
import kotlin.jvm.JvmName;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u000e*\u00020\u0002\u001a\u0017\u0010\u0016\u001a\u00020\u000e*\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u001a*\u00020\u000eH\u0087\b\u001a5\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c*\u00020\u00022\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u0002H\u001c0\rH\u0086\b\u00f8\u0001\u0000¢\u0006\u0002\u0010\u001f\u0082\u0002\b\n\u0006\b\u0011(\u001e0\u0001¨\u0006 " }, d2 = { "buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "copyTo", "", "out", "forEachLine", "", "action", "Lkotlin/Function1;", "", "lineSequence", "Lkotlin/sequences/Sequence;", "readBytes", "", "Ljava/net/URL;", "readLines", "", "readText", "charset", "Ljava/nio/charset/Charset;", "reader", "Ljava/io/StringReader;", "useLines", "T", "block", "Requires newer compiler version to be inlined correctly.", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib" })
@JvmName(name = "TextStreamsKt")
public final class TextStreamsKt
{
    @InlineOnly
    private static final BufferedReader buffered(@NotNull final Reader $this$buffered, final int bufferSize) {
        final int $i$f$buffered = 0;
        return (BufferedReader)(($this$buffered instanceof BufferedReader) ? $this$buffered : new BufferedReader($this$buffered, bufferSize));
    }
    
    @InlineOnly
    private static final BufferedWriter buffered(@NotNull final Writer $this$buffered, final int bufferSize) {
        final int $i$f$buffered = 0;
        return (BufferedWriter)(($this$buffered instanceof BufferedWriter) ? $this$buffered : new BufferedWriter($this$buffered, bufferSize));
    }
    
    public static final void forEachLine(@NotNull final Reader $this$forEachLine, @NotNull final Function1<? super String, Unit> action) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$forEachLine"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* action */
        //     7: ldc             "action"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* $this$forEachLine */
        //    13: astore_2        /* $this$useLines$iv */
        //    14: iconst_0       
        //    15: istore_3        /* $i$f$useLines */
        //    16: aload_2         /* $this$useLines$iv */
        //    17: astore          4
        //    19: sipush          8192
        //    22: istore          5
        //    24: iconst_0       
        //    25: istore          6
        //    27: aload           4
        //    29: instanceof      Ljava/io/BufferedReader;
        //    32: ifeq            43
        //    35: aload           4
        //    37: checkcast       Ljava/io/BufferedReader;
        //    40: goto            54
        //    43: new             Ljava/io/BufferedReader;
        //    46: dup            
        //    47: aload           4
        //    49: iload           5
        //    51: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;I)V
        //    54: checkcast       Ljava/io/Closeable;
        //    57: astore          4
        //    59: iconst_0       
        //    60: istore          5
        //    62: aconst_null    
        //    63: checkcast       Ljava/lang/Throwable;
        //    66: astore          6
        //    68: nop            
        //    69: aload           4
        //    71: checkcast       Ljava/io/BufferedReader;
        //    74: astore          it$iv
        //    76: iconst_0       
        //    77: istore          $i$a$-use-TextStreamsKt$useLines$1$iv
        //    79: aload           it$iv
        //    81: invokestatic    kotlin/io/TextStreamsKt.lineSequence:(Ljava/io/BufferedReader;)Lkotlin/sequences/Sequence;
        //    84: astore          it
        //    86: iconst_0       
        //    87: istore          $i$a$-useLines-TextStreamsKt$forEachLine$1
        //    89: aload           it
        //    91: astore          11
        //    93: aload_1         /* action */
        //    94: astore          action$iv
        //    96: iconst_0       
        //    97: istore          $i$f$forEach
        //    99: aload           $this$forEach$iv
        //   101: invokeinterface kotlin/sequences/Sequence.iterator:()Ljava/util/Iterator;
        //   106: astore          14
        //   108: aload           14
        //   110: invokeinterface java/util/Iterator.hasNext:()Z
        //   115: ifeq            140
        //   118: aload           14
        //   120: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   125: astore          element$iv
        //   127: aload           action$iv
        //   129: aload           element$iv
        //   131: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   136: pop            
        //   137: goto            108
        //   140: nop            
        //   141: nop            
        //   142: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   145: astore          null
        //   147: aload           4
        //   149: aload           6
        //   151: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   154: goto            178
        //   157: astore          7
        //   159: aload           7
        //   161: astore          6
        //   163: aload           7
        //   165: athrow         
        //   166: astore          7
        //   168: aload           4
        //   170: aload           6
        //   172: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   175: aload           7
        //   177: athrow         
        //   178: nop            
        //   179: return         
        //    Signature:
        //  (Ljava/io/Reader;Lkotlin/jvm/functions/Function1<-Ljava/lang/String;Lkotlin/Unit;>;)V
        //    StackMapTable: 00 07 FF 00 2B 00 07 07 00 55 07 00 57 07 00 55 01 07 00 55 01 01 00 00 4A 07 00 37 FF 00 35 00 0F 07 00 55 07 00 57 07 00 55 01 07 00 59 01 07 00 4A 07 00 37 01 07 00 5E 01 07 00 5E 07 00 57 01 07 00 64 00 00 1F FF 00 10 00 07 07 00 55 07 00 57 07 00 55 01 07 00 59 01 07 00 4A 00 01 07 00 4A 48 07 00 4A FF 00 0B 00 0F 07 00 55 07 00 57 07 00 55 01 07 00 59 01 07 00 4A 07 00 72 01 07 00 5E 01 07 00 5E 07 00 57 01 07 00 64 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  68     147    157    166    Ljava/lang/Throwable;
        //  68     147    166    178    Any
        //  157    166    166    178    Any
        //  166    168    166    178    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public static final List<String> readLines(@NotNull final Reader $this$readLines) {
        Intrinsics.checkParameterIsNotNull($this$readLines, "$this$readLines");
        final ArrayList result = new ArrayList();
        forEachLine($this$readLines, (Function1<? super String, Unit>)new TextStreamsKt$readLines.TextStreamsKt$readLines$1(result));
        return (List<String>)result;
    }
    
    public static final <T> T useLines(@NotNull final Reader $this$useLines, @NotNull final Function1<? super Sequence<String>, ? extends T> block) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: istore_2        /* $i$f$useLines */
        //     3: aload_0         /* $this$useLines */
        //     4: ldc             "$this$useLines"
        //     6: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     9: aload_1         /* block */
        //    10: ldc             "block"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_0         /* $this$useLines */
        //    16: astore_3       
        //    17: sipush          8192
        //    20: istore          4
        //    22: iconst_0       
        //    23: istore          5
        //    25: aload_3        
        //    26: instanceof      Ljava/io/BufferedReader;
        //    29: ifeq            39
        //    32: aload_3        
        //    33: checkcast       Ljava/io/BufferedReader;
        //    36: goto            49
        //    39: new             Ljava/io/BufferedReader;
        //    42: dup            
        //    43: aload_3        
        //    44: iload           4
        //    46: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;I)V
        //    49: checkcast       Ljava/io/Closeable;
        //    52: astore_3       
        //    53: iconst_0       
        //    54: istore          4
        //    56: aconst_null    
        //    57: checkcast       Ljava/lang/Throwable;
        //    60: astore          5
        //    62: nop            
        //    63: aload_3        
        //    64: checkcast       Ljava/io/BufferedReader;
        //    67: astore          it
        //    69: iconst_0       
        //    70: istore          $i$a$-use-TextStreamsKt$useLines$1
        //    72: aload_1         /* block */
        //    73: aload           it
        //    75: invokestatic    kotlin/io/TextStreamsKt.lineSequence:(Ljava/io/BufferedReader;)Lkotlin/sequences/Sequence;
        //    78: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    83: astore          null
        //    85: iconst_1       
        //    86: invokestatic    kotlin/jvm/internal/InlineMarker.finallyStart:(I)V
        //    89: iconst_1       
        //    90: iconst_1       
        //    91: iconst_0       
        //    92: invokestatic    kotlin/internal/PlatformImplementationsKt.apiVersionIsAtLeast:(III)Z
        //    95: ifeq            107
        //    98: aload_3        
        //    99: aload           5
        //   101: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   104: goto            113
        //   107: aload_3        
        //   108: invokeinterface java/io/Closeable.close:()V
        //   113: iconst_1       
        //   114: invokestatic    kotlin/jvm/internal/InlineMarker.finallyEnd:(I)V
        //   117: aload           6
        //   119: goto            188
        //   122: astore          6
        //   124: aload           6
        //   126: astore          5
        //   128: aload           6
        //   130: athrow         
        //   131: astore          6
        //   133: iconst_1       
        //   134: invokestatic    kotlin/jvm/internal/InlineMarker.finallyStart:(I)V
        //   137: iconst_1       
        //   138: iconst_1       
        //   139: iconst_0       
        //   140: invokestatic    kotlin/internal/PlatformImplementationsKt.apiVersionIsAtLeast:(III)Z
        //   143: ifeq            155
        //   146: aload_3        
        //   147: aload           5
        //   149: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   152: goto            181
        //   155: aload           5
        //   157: ifnonnull       169
        //   160: aload_3        
        //   161: invokeinterface java/io/Closeable.close:()V
        //   166: goto            181
        //   169: nop            
        //   170: aload_3        
        //   171: invokeinterface java/io/Closeable.close:()V
        //   176: goto            181
        //   179: astore          7
        //   181: iconst_1       
        //   182: invokestatic    kotlin/jvm/internal/InlineMarker.finallyEnd:(I)V
        //   185: aload           6
        //   187: athrow         
        //   188: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/io/Reader;Lkotlin/jvm/functions/Function1<-Lkotlin/sequences/Sequence<Ljava/lang/String;>;+TT;>;)TT;
        //    StackMapTable: 00 0B FF 00 27 00 06 07 00 55 07 00 57 01 07 00 55 01 01 00 00 49 07 00 37 FF 00 39 00 08 07 00 55 07 00 57 01 07 00 59 01 07 00 4A 07 00 04 01 00 00 05 FF 00 08 00 06 07 00 55 07 00 57 01 07 00 59 01 07 00 4A 00 01 07 00 4A 48 07 00 4A FC 00 17 07 00 4A 0D 49 07 00 4A 01 FF 00 06 00 08 07 00 55 07 00 57 01 07 00 59 01 07 00 4A 07 00 04 01 00 01 07 00 04
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  62     85     122    131    Ljava/lang/Throwable;
        //  62     85     131    188    Any
        //  122    131    131    188    Any
        //  131    133    131    188    Any
        //  169    176    179    181    Ljava/lang/Throwable;
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
    
    @InlineOnly
    private static final StringReader reader(@NotNull final String $this$reader) {
        final int $i$f$reader = 0;
        return new StringReader($this$reader);
    }
    
    @NotNull
    public static final Sequence<String> lineSequence(@NotNull final BufferedReader $this$lineSequence) {
        Intrinsics.checkParameterIsNotNull($this$lineSequence, "$this$lineSequence");
        return SequencesKt__SequencesKt.constrainOnce((Sequence<? extends String>)new LinesSequence($this$lineSequence));
    }
    
    @NotNull
    public static final String readText(@NotNull final Reader $this$readText) {
        Intrinsics.checkParameterIsNotNull($this$readText, "$this$readText");
        final StringWriter buffer = new StringWriter();
        copyTo$default($this$readText, buffer, 0, 2, null);
        final String string = buffer.toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "buffer.toString()");
        return string;
    }
    
    public static final long copyTo(@NotNull final Reader $this$copyTo, @NotNull final Writer out, final int bufferSize) {
        Intrinsics.checkParameterIsNotNull($this$copyTo, "$this$copyTo");
        Intrinsics.checkParameterIsNotNull(out, "out");
        long charsCopied = 0L;
        final char[] buffer = new char[bufferSize];
        for (int chars = $this$copyTo.read(buffer); chars >= 0; chars = $this$copyTo.read(buffer)) {
            out.write(buffer, 0, chars);
            charsCopied += chars;
        }
        return charsCopied;
    }
    
    public static /* synthetic */ long copyTo$default(final Reader $this$copyTo, final Writer out, int bufferSize, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            bufferSize = 8192;
        }
        return copyTo($this$copyTo, out, bufferSize);
    }
    
    @InlineOnly
    private static final String readText(@NotNull final URL $this$readText, final Charset charset) {
        final int $i$f$readText = 0;
        return new String(readBytes($this$readText), charset);
    }
    
    @NotNull
    public static final byte[] readBytes(@NotNull final URL $this$readBytes) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "$this$readBytes"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0         /* $this$readBytes */
        //     8: invokevirtual   java/net/URL.openStream:()Ljava/io/InputStream;
        //    11: checkcast       Ljava/io/Closeable;
        //    14: astore_1       
        //    15: iconst_0       
        //    16: istore_2       
        //    17: aconst_null    
        //    18: checkcast       Ljava/lang/Throwable;
        //    21: astore_3       
        //    22: nop            
        //    23: aload_1        
        //    24: checkcast       Ljava/io/InputStream;
        //    27: astore          it
        //    29: iconst_0       
        //    30: istore          $i$a$-use-TextStreamsKt$readBytes$1
        //    32: aload           it
        //    34: dup            
        //    35: ldc_w           "it"
        //    38: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    41: invokestatic    kotlin/io/ByteStreamsKt.readBytes:(Ljava/io/InputStream;)[B
        //    44: astore          null
        //    46: aload_1        
        //    47: aload_3        
        //    48: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //    51: aload           4
        //    53: goto            74
        //    56: astore          4
        //    58: aload           4
        //    60: astore_3       
        //    61: aload           4
        //    63: athrow         
        //    64: astore          4
        //    66: aload_1        
        //    67: aload_3        
        //    68: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //    71: aload           4
        //    73: athrow         
        //    74: areturn        
        //    StackMapTable: 00 03 FF 00 38 00 04 07 01 04 07 00 59 01 07 00 4A 00 01 07 00 4A 47 07 00 4A FF 00 09 00 06 07 01 04 07 00 59 01 07 00 4A 07 01 12 01 00 01 07 01 12
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  22     46     56     64     Ljava/lang/Throwable;
        //  22     46     64     74     Any
        //  56     64     64     74     Any
        //  64     66     64     74     Any
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
}
