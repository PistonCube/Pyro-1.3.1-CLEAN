// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro;

import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007" }, d2 = { "Ldev/nuker/pyro/TopLayer;", "", "()V", "isLegitJar", "", "loadTopLayer", "", "pyroclient" })
public final class TopLayer
{
    public static final TopLayer INSTANCE;
    
    public final void loadTopLayer() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "backend.nuker.dev"
        //     6: sipush          4242
        //     9: invokespecial   java/net/Socket.<init>:(Ljava/lang/String;I)V
        //    12: astore_1        /* socket */
        //    13: new             Ljava/io/DataInputStream;
        //    16: dup            
        //    17: aload_1         /* socket */
        //    18: invokevirtual   java/net/Socket.getInputStream:()Ljava/io/InputStream;
        //    21: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //    24: astore_2        /* si */
        //    25: new             Ljava/io/DataOutputStream;
        //    28: dup            
        //    29: aload_1         /* socket */
        //    30: invokevirtual   java/net/Socket.getOutputStream:()Ljava/io/OutputStream;
        //    33: invokespecial   java/io/DataOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    36: astore_3        /* so */
        //    37: aload_3         /* so */
        //    38: aload_0         /* this */
        //    39: invokevirtual   dev/nuker/pyro/TopLayer.isLegitJar:()Z
        //    42: invokevirtual   java/io/DataOutputStream.writeBoolean:(Z)V
        //    45: aload_3         /* so */
        //    46: iconst_0       
        //    47: invokevirtual   java/io/DataOutputStream.writeInt:(I)V
        //    50: aload_2         /* si */
        //    51: invokevirtual   java/io/DataInputStream.readInt:()I
        //    54: istore          resourceCount
        //    56: iconst_0       
        //    57: istore          5
        //    59: iload           resourceCount
        //    61: istore          6
        //    63: iload           5
        //    65: iload           6
        //    67: if_icmpge       185
        //    70: getstatic       dev/nuker/pyro/PyroClientLoadingPlugin.resources:Ljava/util/Map;
        //    73: dup            
        //    74: ldc             "PyroClientLoadingPlugin.resources"
        //    76: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    79: aload_2         /* si */
        //    80: invokevirtual   java/io/DataInputStream.readUTF:()Ljava/lang/String;
        //    83: aload_2         /* si */
        //    84: astore          7
        //    86: astore          21
        //    88: astore          20
        //    90: iconst_0       
        //    91: istore          $i$f$readByteArray
        //    93: aload           $this$readByteArray$iv
        //    95: checkcast       Ljava/io/InputStream;
        //    98: astore          9
        //   100: aload           $this$readByteArray$iv
        //   102: invokevirtual   java/io/DataInputStream.readInt:()I
        //   105: istore          length$iv$iv
        //   107: iconst_0       
        //   108: istore          $i$f$readByteArray
        //   110: iload           length$iv$iv
        //   112: newarray        B
        //   114: astore          array$iv$iv
        //   116: iconst_0       
        //   117: istore          bytesRead$iv$iv
        //   119: iload           bytesRead$iv$iv
        //   121: iload           length$iv$iv
        //   123: if_icmpge       162
        //   126: aload           $this$readByteArray$iv$iv
        //   128: aload           array$iv$iv
        //   130: iload           bytesRead$iv$iv
        //   132: aload           array$iv$iv
        //   134: arraylength    
        //   135: iload           bytesRead$iv$iv
        //   137: isub           
        //   138: invokevirtual   java/io/InputStream.read:([BII)I
        //   141: istore          read$iv$iv
        //   143: iload           read$iv$iv
        //   145: iconst_m1      
        //   146: if_icmpne       152
        //   149: goto            162
        //   152: iload           bytesRead$iv$iv
        //   154: iload           read$iv$iv
        //   156: iadd           
        //   157: istore          bytesRead$iv$iv
        //   159: goto            119
        //   162: aload           array$iv$iv
        //   164: nop            
        //   165: astore          22
        //   167: aload           20
        //   169: aload           21
        //   171: aload           22
        //   173: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   178: pop            
        //   179: iinc            i, 1
        //   182: goto            63
        //   185: aload_2         /* si */
        //   186: astore          $this$readByteArray$iv
        //   188: iconst_0       
        //   189: istore          $i$f$readByteArray
        //   191: aload           $this$readByteArray$iv
        //   193: checkcast       Ljava/io/InputStream;
        //   196: astore          8
        //   198: aload           $this$readByteArray$iv
        //   200: invokevirtual   java/io/DataInputStream.readInt:()I
        //   203: istore          length$iv$iv
        //   205: iconst_0       
        //   206: istore          $i$f$readByteArray
        //   208: iload           length$iv$iv
        //   210: newarray        B
        //   212: astore          array$iv$iv
        //   214: iconst_0       
        //   215: istore          bytesRead$iv$iv
        //   217: iload           bytesRead$iv$iv
        //   219: iload           length$iv$iv
        //   221: if_icmpge       260
        //   224: aload           $this$readByteArray$iv$iv
        //   226: aload           array$iv$iv
        //   228: iload           bytesRead$iv$iv
        //   230: aload           array$iv$iv
        //   232: arraylength    
        //   233: iload           bytesRead$iv$iv
        //   235: isub           
        //   236: invokevirtual   java/io/InputStream.read:([BII)I
        //   239: istore          read$iv$iv
        //   241: iload           read$iv$iv
        //   243: iconst_m1      
        //   244: if_icmpne       250
        //   247: goto            260
        //   250: iload           bytesRead$iv$iv
        //   252: iload           read$iv$iv
        //   254: iadd           
        //   255: istore          bytesRead$iv$iv
        //   257: goto            217
        //   260: aload           array$iv$iv
        //   262: nop            
        //   263: astore          nextBytes
        //   265: ldc             Lnet/minecraft/launchwrapper/LaunchClassLoader;.class
        //   267: ldc             "resourceCache"
        //   269: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //   272: astore          field
        //   274: aload           field
        //   276: dup            
        //   277: ldc             "field"
        //   279: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   282: iconst_1       
        //   283: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //   286: aload           field
        //   288: getstatic       net/minecraft/launchwrapper/Launch.classLoader:Lnet/minecraft/launchwrapper/LaunchClassLoader;
        //   291: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   294: dup            
        //   295: ifnonnull       308
        //   298: new             Lkotlin/TypeCastException;
        //   301: dup            
        //   302: ldc             "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.ByteArray>"
        //   304: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   307: athrow         
        //   308: invokestatic    kotlin/jvm/internal/TypeIntrinsics.asMutableMap:(Ljava/lang/Object;)Ljava/util/Map;
        //   311: astore          resourceCache
        //   313: aload           resourceCache
        //   315: astore          20
        //   317: iconst_0       
        //   318: istore          $i$f$dpkgZip
        //   320: iconst_0       
        //   321: istore          9
        //   323: new             Ljava/util/LinkedHashMap;
        //   326: dup            
        //   327: invokespecial   java/util/LinkedHashMap.<init>:()V
        //   330: checkcast       Ljava/util/Map;
        //   333: astore          map$iv
        //   335: new             Ljava/util/zip/ZipInputStream;
        //   338: dup            
        //   339: new             Ljava/io/ByteArrayInputStream;
        //   342: dup            
        //   343: aload           nextBytes
        //   345: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //   348: checkcast       Ljava/io/InputStream;
        //   351: invokespecial   java/util/zip/ZipInputStream.<init>:(Ljava/io/InputStream;)V
        //   354: astore          zipIn$iv
        //   356: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //   359: dup            
        //   360: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //   363: astore          entry$iv
        //   365: aload           zipIn$iv
        //   367: invokevirtual   java/util/zip/ZipInputStream.getNextEntry:()Ljava/util/zip/ZipEntry;
        //   370: astore          12
        //   372: iconst_0       
        //   373: istore          13
        //   375: iconst_0       
        //   376: istore          14
        //   378: aload           12
        //   380: astore          it$iv
        //   382: iconst_0       
        //   383: istore          $i$a$-also-Utils$dpkgZip$1$iv
        //   385: aload           entry$iv
        //   387: aload           it$iv
        //   389: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   392: aload           12
        //   394: ifnull          527
        //   397: sipush          4096
        //   400: newarray        B
        //   402: astore          contents$iv
        //   404: new             Lkotlin/jvm/internal/Ref$IntRef;
        //   407: dup            
        //   408: invokespecial   kotlin/jvm/internal/Ref$IntRef.<init>:()V
        //   411: astore          direct$iv
        //   413: new             Ljava/io/ByteArrayOutputStream;
        //   416: dup            
        //   417: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   420: astore          stream$iv
        //   422: aload           zipIn$iv
        //   424: aload           contents$iv
        //   426: iconst_0       
        //   427: aload           contents$iv
        //   429: arraylength    
        //   430: invokevirtual   java/util/zip/ZipInputStream.read:([BII)I
        //   433: istore          15
        //   435: iconst_0       
        //   436: istore          16
        //   438: iconst_0       
        //   439: istore          17
        //   441: iload           15
        //   443: istore          it$iv
        //   445: iconst_0       
        //   446: istore          $i$a$-also-Utils$dpkgZip$2$iv
        //   448: aload           direct$iv
        //   450: iload           it$iv
        //   452: putfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //   455: iload           15
        //   457: iflt            476
        //   460: aload           stream$iv
        //   462: aload           contents$iv
        //   464: iconst_0       
        //   465: aload           direct$iv
        //   467: getfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //   470: invokevirtual   java/io/ByteArrayOutputStream.write:([BII)V
        //   473: goto            422
        //   476: aload           map$iv
        //   478: aload           entry$iv
        //   480: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   483: checkcast       Ljava/util/zip/ZipEntry;
        //   486: dup            
        //   487: ifnonnull       493
        //   490: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   493: invokevirtual   java/util/zip/ZipEntry.getName:()Ljava/lang/String;
        //   496: dup            
        //   497: ldc             "entry!!.name"
        //   499: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   502: aload           stream$iv
        //   504: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   507: dup            
        //   508: ldc             "stream.toByteArray()"
        //   510: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   513: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   518: pop            
        //   519: aload           zipIn$iv
        //   521: invokevirtual   java/util/zip/ZipInputStream.closeEntry:()V
        //   524: goto            365
        //   527: aload           map$iv
        //   529: astore          21
        //   531: aload           20
        //   533: aload           21
        //   535: astore          8
        //   537: astore          20
        //   539: iconst_0       
        //   540: istore          $i$f$process
        //   542: iconst_0       
        //   543: istore          10
        //   545: new             Ljava/util/LinkedHashMap;
        //   548: dup            
        //   549: invokespecial   java/util/LinkedHashMap.<init>:()V
        //   552: checkcast       Ljava/util/Map;
        //   555: astore          classMap$iv
        //   557: aload           files$iv
        //   559: astore          12
        //   561: iconst_0       
        //   562: istore          13
        //   564: aload           12
        //   566: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   571: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   576: astore          14
        //   578: aload           14
        //   580: invokeinterface java/util/Iterator.hasNext:()Z
        //   585: ifeq            718
        //   588: aload           14
        //   590: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   595: checkcast       Ljava/util/Map$Entry;
        //   598: astore          10
        //   600: aload           10
        //   602: astore          15
        //   604: iconst_0       
        //   605: istore          16
        //   607: aload           15
        //   609: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   614: checkcast       Ljava/lang/String;
        //   617: astore          name$iv
        //   619: aload           10
        //   621: astore          15
        //   623: iconst_0       
        //   624: istore          16
        //   626: aload           15
        //   628: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   633: checkcast       [B
        //   636: astore          bytes$iv
        //   638: aload           name$iv
        //   640: ldc             ".class"
        //   642: iconst_0       
        //   643: iconst_2       
        //   644: aconst_null    
        //   645: invokestatic    kotlin/text/StringsKt.endsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        //   648: ifeq            684
        //   651: aload           classMap$iv
        //   653: aload           name$iv
        //   655: ldc             "/"
        //   657: ldc             "."
        //   659: iconst_0       
        //   660: iconst_4       
        //   661: aconst_null    
        //   662: invokestatic    kotlin/text/StringsKt.replace$default:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
        //   665: ldc             ".class"
        //   667: aconst_null    
        //   668: iconst_2       
        //   669: aconst_null    
        //   670: invokestatic    kotlin/text/StringsKt.substringBefore$default:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
        //   673: aload           bytes$iv
        //   675: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   680: pop            
        //   681: goto            715
        //   684: aload           classMap$iv
        //   686: aload           name$iv
        //   688: aload           bytes$iv
        //   690: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   695: pop            
        //   696: getstatic       dev/nuker/pyro/PyroClientLoadingPlugin.resources:Ljava/util/Map;
        //   699: dup            
        //   700: ldc             "PyroClientLoadingPlugin.resources"
        //   702: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   705: aload           name$iv
        //   707: aload           bytes$iv
        //   709: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   714: pop            
        //   715: goto            578
        //   718: aload           classMap$iv
        //   720: astore          21
        //   722: aload           20
        //   724: aload           21
        //   726: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
        //   731: getstatic       net/minecraft/launchwrapper/Launch.classLoader:Lnet/minecraft/launchwrapper/LaunchClassLoader;
        //   734: ldc             "dev.nuker.pyro.layer.SecondLayer"
        //   736: invokevirtual   net/minecraft/launchwrapper/LaunchClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //   739: ldc             "run"
        //   741: iconst_2       
        //   742: anewarray       Ljava/lang/Class;
        //   745: dup            
        //   746: iconst_0       
        //   747: ldc             Ljava/io/DataInputStream;.class
        //   749: aastore        
        //   750: dup            
        //   751: iconst_1       
        //   752: ldc             Ljava/io/DataOutputStream;.class
        //   754: aastore        
        //   755: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   758: aconst_null    
        //   759: iconst_2       
        //   760: anewarray       Ljava/lang/Object;
        //   763: dup            
        //   764: iconst_0       
        //   765: aload_2         /* si */
        //   766: aastore        
        //   767: dup            
        //   768: iconst_1       
        //   769: aload_3         /* so */
        //   770: aastore        
        //   771: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   774: pop            
        //   775: return         
        //    StackMapTable: 00 12 FF 00 3F 00 07 07 00 03 07 00 19 07 00 21 07 00 2A 01 01 01 00 00 FF 00 37 00 16 07 00 03 07 00 19 07 00 21 07 00 2A 01 01 01 07 00 21 01 07 00 54 01 01 07 00 DD 01 00 00 00 00 00 00 07 00 5A 07 00 D8 00 00 FF 00 20 00 16 07 00 03 07 00 19 07 00 21 07 00 2A 01 01 01 07 00 21 01 07 00 54 01 01 07 00 DD 01 01 00 00 00 00 00 07 00 5A 07 00 D8 00 00 FF 00 09 00 16 07 00 03 07 00 19 07 00 21 07 00 2A 01 01 01 07 00 21 01 07 00 54 01 01 07 00 DD 01 00 00 00 00 00 00 07 00 5A 07 00 D8 00 00 FF 00 16 00 07 07 00 03 07 00 19 07 00 21 07 00 2A 01 01 01 00 00 FF 00 1F 00 0D 07 00 03 07 00 19 07 00 21 07 00 2A 01 01 07 00 21 01 07 00 54 01 01 07 00 DD 01 00 00 FC 00 20 01 FA 00 09 FF 00 2F 00 0D 07 00 03 07 00 19 07 00 21 07 00 2A 01 07 00 DD 07 00 6C 01 07 00 54 01 01 07 00 DD 01 00 01 07 00 05 FF 00 38 00 15 07 00 03 07 00 19 07 00 21 07 00 2A 01 07 00 DD 07 00 6C 07 00 5A 01 07 00 8C 07 00 5A 07 00 94 00 00 00 00 00 00 00 00 07 00 5A 00 00 FF 00 38 00 15 07 00 03 07 00 19 07 00 21 07 00 2A 01 07 00 DD 07 00 6C 07 00 5A 01 07 00 8C 07 00 5A 07 00 94 07 00 DD 07 00 9F 07 00 A2 00 01 00 00 00 07 00 5A 00 00 FF 00 35 00 15 07 00 03 07 00 19 07 00 21 07 00 2A 01 07 00 DD 07 00 6C 07 00 5A 01 07 00 8C 07 00 5A 07 00 94 07 00 DD 07 00 9F 07 00 A2 01 01 01 01 01 07 00 5A 00 00 FF 00 10 00 15 07 00 03 07 00 19 07 00 21 07 00 2A 01 07 00 DD 07 00 6C 07 00 5A 01 07 00 8C 07 00 5A 07 00 94 07 00 DD 07 00 9F 07 00 A2 01 01 01 01 01 07 00 5A 00 02 07 00 5A 07 00 AD FF 00 21 00 15 07 00 03 07 00 19 07 00 21 07 00 2A 01 07 00 DD 07 00 6C 07 00 5A 01 07 00 8C 07 00 5A 07 00 94 07 00 AD 01 01 07 00 AD 01 00 00 00 07 00 5A 00 00 FF 00 32 00 16 07 00 03 07 00 19 07 00 21 07 00 2A 01 07 00 DD 07 00 6C 07 00 5A 07 00 5A 01 00 07 00 5A 07 00 05 00 07 00 CA 07 00 05 01 00 00 00 07 00 5A 07 00 5A 00 00 FF 00 69 00 16 07 00 03 07 00 19 07 00 21 07 00 2A 01 07 00 DD 07 00 6C 07 00 5A 07 00 5A 01 07 00 D3 07 00 5A 07 00 D8 07 00 DD 07 00 CA 07 00 D3 01 00 00 00 07 00 5A 07 00 5A 00 00 1E FF 00 02 00 16 07 00 03 07 00 19 07 00 21 07 00 2A 01 07 00 DD 07 00 6C 07 00 5A 07 00 5A 01 00 07 00 5A 07 00 05 00 07 00 CA 07 00 05 01 00 00 00 07 00 5A 07 00 5A 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
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
    
    public final boolean isLegitJar() {
        return TopLayer.class.getResourceAsStream("dev/nuker/pyro/mixin/") != null;
    }
    
    private TopLayer() {
    }
    
    static {
        INSTANCE = new TopLayer();
    }
}
