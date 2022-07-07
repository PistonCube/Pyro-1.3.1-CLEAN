// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.launcher;

import java.awt.BorderLayout;
import java.util.Set;
import java.text.AttributedCharacterIterator;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import javax.swing.Box;
import kotlin.TypeCastException;
import org.jetbrains.annotations.Nullable;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import kotlin.jvm.functions.Function0;
import java.util.Map;
import java.net.URI;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.BoxLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.jvm.functions.Function2;
import javax.swing.JPanel;
import kotlin.Metadata;
import javax.swing.JFrame;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002JP\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160\u0018J\u001e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cJ*\u0010\u001d\u001a\u00020\u00042\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u0010J\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006$" }, d2 = { "Ldev/nuker/pyro/launcher/LoaderGui;", "Ljavax/swing/JFrame;", "()V", "currentPanel", "Ljavax/swing/JPanel;", "lDir", "", "parentPanel", "progress", "", "getProgress", "()D", "setProgress", "(D)V", "getDownloadPanel", "text", "", "versionmap", "", "", "stopCallback", "Lkotlin/Function0;", "", "selectCallback", "Lkotlin/Function2;", "getLinkedPanel", "linktext", "link", "Ljava/net/URI;", "getLoginPanel", "callback", "failure", "getTextPanel", "setUI", "panel", "ImgBkg", "pyroclient" })
public final class LoaderGui extends JFrame
{
    private double progress;
    private JPanel currentPanel;
    private int lDir;
    private final JPanel parentPanel;
    
    public final double getProgress() {
        return this.progress;
    }
    
    public final void setProgress(final double <set-?>) {
        this.progress = <set-?>;
    }
    
    @NotNull
    public final JPanel getLoginPanel(@NotNull final Function2 callback, @NotNull final String failure) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "callback"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* failure */
        //     7: ldc             "failure"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: new             Ljavax/swing/JPanel;
        //    15: dup            
        //    16: invokespecial   javax/swing/JPanel.<init>:()V
        //    19: astore_3       
        //    20: iconst_0       
        //    21: istore          4
        //    23: iconst_0       
        //    24: istore          5
        //    26: aload_3        
        //    27: astore          $this$apply
        //    29: iconst_0       
        //    30: istore          $i$a$-apply-LoaderGui$getLoginPanel$1
        //    32: aload           $this$apply
        //    34: new             Ljavax/swing/BoxLayout;
        //    37: dup            
        //    38: aload           $this$apply
        //    40: checkcast       Ljava/awt/Container;
        //    43: iconst_1       
        //    44: invokespecial   javax/swing/BoxLayout.<init>:(Ljava/awt/Container;I)V
        //    47: checkcast       Ljava/awt/LayoutManager;
        //    50: invokevirtual   javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
        //    53: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //    56: dup            
        //    57: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //    60: astore          8
        //    62: aload           8
        //    64: aconst_null    
        //    65: checkcast       Ljavax/swing/JTextField;
        //    68: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //    71: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //    74: dup            
        //    75: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //    78: astore          9
        //    80: aload           9
        //    82: aconst_null    
        //    83: checkcast       Ljavax/swing/JPasswordField;
        //    86: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //    89: aload           $this$apply
        //    91: new             Ljavax/swing/JPanel;
        //    94: dup            
        //    95: invokespecial   javax/swing/JPanel.<init>:()V
        //    98: astore          10
        //   100: astore          11
        //   102: iconst_0       
        //   103: istore          12
        //   105: iconst_0       
        //   106: istore          13
        //   108: aload           10
        //   110: astore          $this$apply
        //   112: iconst_0       
        //   113: istore          $i$a$-apply-LoaderGui$getLoginPanel$1$1
        //   115: aload           $this$apply
        //   117: new             Ljava/awt/Color;
        //   120: dup            
        //   121: iconst_0       
        //   122: iconst_0       
        //   123: iconst_0       
        //   124: iconst_0       
        //   125: invokespecial   java/awt/Color.<init>:(IIII)V
        //   128: invokevirtual   javax/swing/JPanel.setBackground:(Ljava/awt/Color;)V
        //   131: aload           $this$apply
        //   133: new             Ljavax/swing/BoxLayout;
        //   136: dup            
        //   137: aload           $this$apply
        //   139: checkcast       Ljava/awt/Container;
        //   142: iconst_0       
        //   143: invokespecial   javax/swing/BoxLayout.<init>:(Ljava/awt/Container;I)V
        //   146: checkcast       Ljava/awt/LayoutManager;
        //   149: invokevirtual   javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
        //   152: aload           $this$apply
        //   154: bipush          20
        //   156: invokestatic    javax/swing/Box.createHorizontalStrut:(I)Ljava/awt/Component;
        //   159: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   162: pop            
        //   163: aload           $this$apply
        //   165: new             Ljavax/swing/JPanel;
        //   168: dup            
        //   169: invokespecial   javax/swing/JPanel.<init>:()V
        //   172: astore          16
        //   174: astore          17
        //   176: iconst_0       
        //   177: istore          18
        //   179: iconst_0       
        //   180: istore          19
        //   182: aload           16
        //   184: astore          $this$apply
        //   186: iconst_0       
        //   187: istore          $i$a$-apply-LoaderGui$getLoginPanel$1$1$1
        //   189: aload           $this$apply
        //   191: new             Ljavax/swing/BoxLayout;
        //   194: dup            
        //   195: aload           $this$apply
        //   197: checkcast       Ljava/awt/Container;
        //   200: iconst_1       
        //   201: invokespecial   javax/swing/BoxLayout.<init>:(Ljava/awt/Container;I)V
        //   204: checkcast       Ljava/awt/LayoutManager;
        //   207: invokevirtual   javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
        //   210: aload           $this$apply
        //   212: new             Ljavax/swing/JLabel;
        //   215: dup            
        //   216: ldc             "Username"
        //   218: invokespecial   javax/swing/JLabel.<init>:(Ljava/lang/String;)V
        //   221: astore          22
        //   223: astore          23
        //   225: iconst_0       
        //   226: istore          24
        //   228: iconst_0       
        //   229: istore          25
        //   231: aload           22
        //   233: astore          $this$apply
        //   235: iconst_0       
        //   236: istore          $i$a$-apply-LoaderGui$getLoginPanel$1$1$1$1
        //   238: aload           $this$apply
        //   240: new             Ljava/awt/Font;
        //   243: dup            
        //   244: ldc             "Arial"
        //   246: iconst_0       
        //   247: bipush          16
        //   249: invokespecial   java/awt/Font.<init>:(Ljava/lang/String;II)V
        //   252: invokevirtual   javax/swing/JLabel.setFont:(Ljava/awt/Font;)V
        //   255: aload           22
        //   257: astore          28
        //   259: aload           23
        //   261: aload           28
        //   263: checkcast       Ljava/awt/Component;
        //   266: ldc             "South"
        //   268: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
        //   271: aload           $this$apply
        //   273: new             Ljavax/swing/JTextField;
        //   276: dup            
        //   277: invokespecial   javax/swing/JTextField.<init>:()V
        //   280: astore          22
        //   282: astore          23
        //   284: iconst_0       
        //   285: istore          24
        //   287: iconst_0       
        //   288: istore          25
        //   290: aload           22
        //   292: astore          it
        //   294: iconst_0       
        //   295: istore          $i$a$-also-LoaderGui$getLoginPanel$1$1$1$2
        //   297: aload           uBox
        //   299: aload           it
        //   301: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   304: aload           22
        //   306: astore          28
        //   308: aload           23
        //   310: aload           28
        //   312: checkcast       Ljava/awt/Component;
        //   315: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   318: pop            
        //   319: nop            
        //   320: aload           16
        //   322: astore          29
        //   324: aload           17
        //   326: aload           29
        //   328: checkcast       Ljava/awt/Component;
        //   331: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   334: pop            
        //   335: aload           $this$apply
        //   337: bipush          10
        //   339: invokestatic    javax/swing/Box.createHorizontalStrut:(I)Ljava/awt/Component;
        //   342: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   345: pop            
        //   346: aload           $this$apply
        //   348: new             Ljavax/swing/JPanel;
        //   351: dup            
        //   352: invokespecial   javax/swing/JPanel.<init>:()V
        //   355: astore          16
        //   357: astore          17
        //   359: iconst_0       
        //   360: istore          18
        //   362: iconst_0       
        //   363: istore          19
        //   365: aload           16
        //   367: astore          $this$apply
        //   369: iconst_0       
        //   370: istore          $i$a$-apply-LoaderGui$getLoginPanel$1$1$2
        //   372: aload           $this$apply
        //   374: new             Ljavax/swing/BoxLayout;
        //   377: dup            
        //   378: aload           $this$apply
        //   380: checkcast       Ljava/awt/Container;
        //   383: iconst_1       
        //   384: invokespecial   javax/swing/BoxLayout.<init>:(Ljava/awt/Container;I)V
        //   387: checkcast       Ljava/awt/LayoutManager;
        //   390: invokevirtual   javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
        //   393: aload           $this$apply
        //   395: new             Ljavax/swing/JLabel;
        //   398: dup            
        //   399: ldc             "Password"
        //   401: invokespecial   javax/swing/JLabel.<init>:(Ljava/lang/String;)V
        //   404: astore          22
        //   406: astore          23
        //   408: iconst_0       
        //   409: istore          24
        //   411: iconst_0       
        //   412: istore          25
        //   414: aload           22
        //   416: astore          $this$apply
        //   418: iconst_0       
        //   419: istore          $i$a$-apply-LoaderGui$getLoginPanel$1$1$2$1
        //   421: aload           $this$apply
        //   423: new             Ljava/awt/Font;
        //   426: dup            
        //   427: ldc             "Arial"
        //   429: iconst_0       
        //   430: bipush          16
        //   432: invokespecial   java/awt/Font.<init>:(Ljava/lang/String;II)V
        //   435: invokevirtual   javax/swing/JLabel.setFont:(Ljava/awt/Font;)V
        //   438: aload           22
        //   440: astore          28
        //   442: aload           23
        //   444: aload           28
        //   446: checkcast       Ljava/awt/Component;
        //   449: ldc             "South"
        //   451: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
        //   454: aload           $this$apply
        //   456: new             Ljavax/swing/JPasswordField;
        //   459: dup            
        //   460: invokespecial   javax/swing/JPasswordField.<init>:()V
        //   463: astore          22
        //   465: astore          23
        //   467: iconst_0       
        //   468: istore          24
        //   470: iconst_0       
        //   471: istore          25
        //   473: aload           22
        //   475: astore          it
        //   477: iconst_0       
        //   478: istore          $i$a$-also-LoaderGui$getLoginPanel$1$1$2$2
        //   480: aload           pBox
        //   482: aload           it
        //   484: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   487: aload           22
        //   489: astore          28
        //   491: aload           23
        //   493: aload           28
        //   495: checkcast       Ljava/awt/Component;
        //   498: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   501: pop            
        //   502: nop            
        //   503: aload           16
        //   505: astore          29
        //   507: aload           17
        //   509: aload           29
        //   511: checkcast       Ljava/awt/Component;
        //   514: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   517: pop            
        //   518: aload           $this$apply
        //   520: bipush          20
        //   522: invokestatic    javax/swing/Box.createHorizontalStrut:(I)Ljava/awt/Component;
        //   525: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   528: pop            
        //   529: nop            
        //   530: aload           10
        //   532: astore          30
        //   534: aload           11
        //   536: aload           30
        //   538: checkcast       Ljava/awt/Component;
        //   541: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   544: pop            
        //   545: aload_2         /* failure */
        //   546: checkcast       Ljava/lang/CharSequence;
        //   549: astore          10
        //   551: iconst_0       
        //   552: istore          12
        //   554: aload           10
        //   556: invokeinterface java/lang/CharSequence.length:()I
        //   561: ifne            568
        //   564: iconst_1       
        //   565: goto            569
        //   568: iconst_0       
        //   569: ifeq            586
        //   572: aload           $this$apply
        //   574: bipush          25
        //   576: invokestatic    javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
        //   579: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   582: pop            
        //   583: goto            704
        //   586: aload           $this$apply
        //   588: iconst_5       
        //   589: invokestatic    javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
        //   592: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   595: pop            
        //   596: aload           $this$apply
        //   598: new             Ljavax/swing/JPanel;
        //   601: dup            
        //   602: invokespecial   javax/swing/JPanel.<init>:()V
        //   605: astore          10
        //   607: astore          11
        //   609: iconst_0       
        //   610: istore          12
        //   612: iconst_0       
        //   613: istore          13
        //   615: aload           10
        //   617: astore          $this$apply
        //   619: iconst_0       
        //   620: istore          $i$a$-apply-LoaderGui$getLoginPanel$1$2
        //   622: aload           $this$apply
        //   624: new             Ljavax/swing/BoxLayout;
        //   627: dup            
        //   628: aload           $this$apply
        //   630: checkcast       Ljava/awt/Container;
        //   633: iconst_0       
        //   634: invokespecial   javax/swing/BoxLayout.<init>:(Ljava/awt/Container;I)V
        //   637: checkcast       Ljava/awt/LayoutManager;
        //   640: invokevirtual   javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
        //   643: aload           $this$apply
        //   645: invokestatic    javax/swing/Box.createHorizontalGlue:()Ljava/awt/Component;
        //   648: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   651: pop            
        //   652: aload           $this$apply
        //   654: new             Ljavax/swing/JLabel;
        //   657: dup            
        //   658: aload_2         /* failure */
        //   659: invokespecial   javax/swing/JLabel.<init>:(Ljava/lang/String;)V
        //   662: checkcast       Ljava/awt/Component;
        //   665: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   668: pop            
        //   669: aload           $this$apply
        //   671: invokestatic    javax/swing/Box.createHorizontalGlue:()Ljava/awt/Component;
        //   674: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   677: pop            
        //   678: nop            
        //   679: aload           10
        //   681: astore          30
        //   683: aload           11
        //   685: aload           30
        //   687: checkcast       Ljava/awt/Component;
        //   690: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   693: pop            
        //   694: aload           $this$apply
        //   696: iconst_5       
        //   697: invokestatic    javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
        //   700: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   703: pop            
        //   704: aload           $this$apply
        //   706: new             Ljavax/swing/JPanel;
        //   709: dup            
        //   710: invokespecial   javax/swing/JPanel.<init>:()V
        //   713: astore          10
        //   715: astore          11
        //   717: iconst_0       
        //   718: istore          12
        //   720: iconst_0       
        //   721: istore          13
        //   723: aload           10
        //   725: astore          $this$apply
        //   727: iconst_0       
        //   728: istore          $i$a$-apply-LoaderGui$getLoginPanel$1$3
        //   730: aload           $this$apply
        //   732: new             Ljavax/swing/BoxLayout;
        //   735: dup            
        //   736: aload           $this$apply
        //   738: checkcast       Ljava/awt/Container;
        //   741: iconst_0       
        //   742: invokespecial   javax/swing/BoxLayout.<init>:(Ljava/awt/Container;I)V
        //   745: checkcast       Ljava/awt/LayoutManager;
        //   748: invokevirtual   javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
        //   751: aload           $this$apply
        //   753: invokestatic    javax/swing/Box.createHorizontalGlue:()Ljava/awt/Component;
        //   756: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   759: pop            
        //   760: aload           $this$apply
        //   762: new             Ljavax/swing/JButton;
        //   765: dup            
        //   766: ldc             "Login"
        //   768: invokespecial   javax/swing/JButton.<init>:(Ljava/lang/String;)V
        //   771: astore          16
        //   773: astore          17
        //   775: iconst_0       
        //   776: istore          18
        //   778: iconst_0       
        //   779: istore          19
        //   781: aload           16
        //   783: astore          $this$apply
        //   785: iconst_0       
        //   786: istore          $i$a$-apply-LoaderGui$getLoginPanel$1$3$1
        //   788: aload           $this$apply
        //   790: new             Ljava/awt/Dimension;
        //   793: dup            
        //   794: sipush          200
        //   797: bipush          25
        //   799: invokespecial   java/awt/Dimension.<init>:(II)V
        //   802: invokevirtual   javax/swing/JButton.setPreferredSize:(Ljava/awt/Dimension;)V
        //   805: aload           $this$apply
        //   807: new             Ldev/nuker/pyro/launcher/LoaderGui$getLoginPanel$$inlined$apply$lambda$1;
        //   810: dup            
        //   811: aload           uBox
        //   813: aload           pBox
        //   815: aload_2         /* failure */
        //   816: aload_1         /* callback */
        //   817: invokespecial   dev/nuker/pyro/launcher/LoaderGui$getLoginPanel$$inlined$apply$lambda$1.<init>:(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
        //   820: checkcast       Ljava/awt/event/ActionListener;
        //   823: invokevirtual   javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
        //   826: nop            
        //   827: aload           16
        //   829: astore          22
        //   831: aload           17
        //   833: aload           22
        //   835: checkcast       Ljava/awt/Component;
        //   838: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   841: pop            
        //   842: aload           $this$apply
        //   844: invokestatic    javax/swing/Box.createHorizontalGlue:()Ljava/awt/Component;
        //   847: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   850: pop            
        //   851: nop            
        //   852: aload           10
        //   854: astore          30
        //   856: aload           11
        //   858: aload           30
        //   860: checkcast       Ljava/awt/Component;
        //   863: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   866: pop            
        //   867: nop            
        //   868: nop            
        //   869: aload_3        
        //   870: areturn        
        //    StackMapTable: 00 04 FF 02 38 00 1F 07 00 03 07 00 CB 07 00 CD 07 00 42 01 01 07 00 42 01 07 00 54 07 00 54 07 00 8F 07 00 42 01 01 07 00 42 01 07 00 42 07 00 42 01 01 07 00 42 01 07 00 5D 07 00 42 01 01 07 00 5D 01 07 00 5D 07 00 42 07 00 42 00 00 40 01 10 FF 00 75 00 1F 07 00 03 07 00 CB 07 00 CD 07 00 42 01 01 07 00 42 01 07 00 54 07 00 54 07 00 CF 07 00 42 01 01 07 00 42 01 07 00 42 07 00 42 01 01 07 00 42 01 07 00 5D 07 00 42 01 01 07 00 5D 01 07 00 5D 07 00 42 07 00 42 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final JPanel getTextPanel(@NotNull final String text) {
        Intrinsics.checkParameterIsNotNull(text, "text");
        final JPanel $this$apply;
        final JPanel panel = $this$apply = new JPanel();
        final int n = 0;
        $this$apply.setLayout(new BoxLayout($this$apply, 0));
        final JPanel panel2 = $this$apply;
        final JLabel label = new JLabel(text);
        final JPanel panel3 = panel2;
        final JLabel $this$apply2 = label;
        final int n2 = 0;
        $this$apply2.setFont(new Font("Arial", 0, 26));
        panel3.add(label);
        return panel;
    }
    
    @NotNull
    public final JPanel getLinkedPanel(@NotNull final String text, @NotNull final String linktext, @NotNull final URI link) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "text"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* linktext */
        //     7: ldc             "linktext"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* link */
        //    13: ldc             "link"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: new             Ljavax/swing/JPanel;
        //    21: dup            
        //    22: invokespecial   javax/swing/JPanel.<init>:()V
        //    25: astore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: aload           4
        //    35: astore          $this$apply
        //    37: iconst_0       
        //    38: istore          $i$a$-apply-LoaderGui$getLinkedPanel$1
        //    40: aload           $this$apply
        //    42: new             Ljavax/swing/BoxLayout;
        //    45: dup            
        //    46: aload           $this$apply
        //    48: checkcast       Ljava/awt/Container;
        //    51: iconst_1       
        //    52: invokespecial   javax/swing/BoxLayout.<init>:(Ljava/awt/Container;I)V
        //    55: checkcast       Ljava/awt/LayoutManager;
        //    58: invokevirtual   javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
        //    61: aload           $this$apply
        //    63: new             Ljavax/swing/JPanel;
        //    66: dup            
        //    67: invokespecial   javax/swing/JPanel.<init>:()V
        //    70: astore          9
        //    72: astore          10
        //    74: iconst_0       
        //    75: istore          11
        //    77: iconst_0       
        //    78: istore          12
        //    80: aload           9
        //    82: astore          $this$apply
        //    84: iconst_0       
        //    85: istore          $i$a$-apply-LoaderGui$getLinkedPanel$1$1
        //    87: aload           $this$apply
        //    89: new             Ljavax/swing/BoxLayout;
        //    92: dup            
        //    93: aload           $this$apply
        //    95: checkcast       Ljava/awt/Container;
        //    98: iconst_0       
        //    99: invokespecial   javax/swing/BoxLayout.<init>:(Ljava/awt/Container;I)V
        //   102: checkcast       Ljava/awt/LayoutManager;
        //   105: invokevirtual   javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
        //   108: aload           $this$apply
        //   110: new             Ljavax/swing/JLabel;
        //   113: dup            
        //   114: aload_1         /* text */
        //   115: invokespecial   javax/swing/JLabel.<init>:(Ljava/lang/String;)V
        //   118: astore          15
        //   120: astore          16
        //   122: iconst_0       
        //   123: istore          17
        //   125: iconst_0       
        //   126: istore          18
        //   128: aload           15
        //   130: astore          $this$apply
        //   132: iconst_0       
        //   133: istore          $i$a$-apply-LoaderGui$getLinkedPanel$1$1$1
        //   135: aload           $this$apply
        //   137: new             Ljava/awt/Font;
        //   140: dup            
        //   141: ldc             "Arial"
        //   143: iconst_0       
        //   144: bipush          26
        //   146: invokespecial   java/awt/Font.<init>:(Ljava/lang/String;II)V
        //   149: invokevirtual   javax/swing/JLabel.setFont:(Ljava/awt/Font;)V
        //   152: aload           15
        //   154: astore          21
        //   156: aload           16
        //   158: aload           21
        //   160: checkcast       Ljava/awt/Component;
        //   163: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   166: pop            
        //   167: nop            
        //   168: aload           9
        //   170: astore          22
        //   172: aload           10
        //   174: aload           22
        //   176: checkcast       Ljava/awt/Component;
        //   179: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   182: pop            
        //   183: aload           $this$apply
        //   185: bipush          20
        //   187: invokestatic    javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
        //   190: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   193: pop            
        //   194: aload           $this$apply
        //   196: new             Ljavax/swing/JPanel;
        //   199: dup            
        //   200: invokespecial   javax/swing/JPanel.<init>:()V
        //   203: astore          9
        //   205: astore          10
        //   207: iconst_0       
        //   208: istore          11
        //   210: iconst_0       
        //   211: istore          12
        //   213: aload           9
        //   215: astore          $this$apply
        //   217: iconst_0       
        //   218: istore          $i$a$-apply-LoaderGui$getLinkedPanel$1$2
        //   220: aload           $this$apply
        //   222: new             Ljavax/swing/BoxLayout;
        //   225: dup            
        //   226: aload           $this$apply
        //   228: checkcast       Ljava/awt/Container;
        //   231: iconst_0       
        //   232: invokespecial   javax/swing/BoxLayout.<init>:(Ljava/awt/Container;I)V
        //   235: checkcast       Ljava/awt/LayoutManager;
        //   238: invokevirtual   javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
        //   241: new             Lkotlin/jvm/internal/Ref$ObjectRef;
        //   244: dup            
        //   245: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
        //   248: astore          15
        //   250: aload           15
        //   252: new             Ljava/awt/Font;
        //   255: dup            
        //   256: ldc             "Arial"
        //   258: iconst_0       
        //   259: bipush          16
        //   261: invokespecial   java/awt/Font.<init>:(Ljava/lang/String;II)V
        //   264: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   267: new             Ljava/util/HashMap;
        //   270: dup            
        //   271: aload           fnt
        //   273: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   276: checkcast       Ljava/awt/Font;
        //   279: invokevirtual   java/awt/Font.getAttributes:()Ljava/util/Map;
        //   282: dup            
        //   283: ifnonnull       296
        //   286: new             Lkotlin/TypeCastException;
        //   289: dup            
        //   290: ldc             "null cannot be cast to non-null type kotlin.collections.Map<java.awt.font.TextAttribute, kotlin.Any?>"
        //   292: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   295: athrow         
        //   296: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //   299: astore          attributes
        //   301: aload           attributes
        //   303: checkcast       Ljava/util/Map;
        //   306: getstatic       java/awt/font/TextAttribute.UNDERLINE:Ljava/awt/font/TextAttribute;
        //   309: dup            
        //   310: ldc             "TextAttribute.UNDERLINE"
        //   312: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   315: getstatic       java/awt/font/TextAttribute.UNDERLINE_ON:Ljava/lang/Integer;
        //   318: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   323: pop            
        //   324: aload           fnt
        //   326: aload           fnt
        //   328: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   331: checkcast       Ljava/awt/Font;
        //   334: aload           attributes
        //   336: checkcast       Ljava/util/Map;
        //   339: invokevirtual   java/awt/Font.deriveFont:(Ljava/util/Map;)Ljava/awt/Font;
        //   342: dup            
        //   343: ldc_w           "fnt.deriveFont(attributes)"
        //   346: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   349: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   352: aload           $this$apply
        //   354: new             Ljavax/swing/JLabel;
        //   357: dup            
        //   358: aload_2         /* linktext */
        //   359: invokespecial   javax/swing/JLabel.<init>:(Ljava/lang/String;)V
        //   362: astore          17
        //   364: astore          18
        //   366: iconst_0       
        //   367: istore          19
        //   369: iconst_0       
        //   370: istore          20
        //   372: aload           17
        //   374: astore          $this$apply
        //   376: iconst_0       
        //   377: istore          $i$a$-apply-LoaderGui$getLinkedPanel$1$2$1
        //   379: aload           $this$apply
        //   381: aload           fnt
        //   383: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
        //   386: checkcast       Ljava/awt/Font;
        //   389: invokevirtual   javax/swing/JLabel.setFont:(Ljava/awt/Font;)V
        //   392: aload           $this$apply
        //   394: bipush          12
        //   396: invokestatic    java/awt/Cursor.getPredefinedCursor:(I)Ljava/awt/Cursor;
        //   399: invokevirtual   javax/swing/JLabel.setCursor:(Ljava/awt/Cursor;)V
        //   402: aload           $this$apply
        //   404: new             Ldev/nuker/pyro/launcher/LoaderGui$getLinkedPanel$$inlined$apply$lambda$1;
        //   407: dup            
        //   408: aload           fnt
        //   410: aload_1         /* text */
        //   411: aload_2         /* linktext */
        //   412: aload_3         /* link */
        //   413: invokespecial   dev/nuker/pyro/launcher/LoaderGui$getLinkedPanel$$inlined$apply$lambda$1.<init>:(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;)V
        //   416: checkcast       Ljava/awt/event/MouseListener;
        //   419: invokevirtual   javax/swing/JLabel.addMouseListener:(Ljava/awt/event/MouseListener;)V
        //   422: nop            
        //   423: aload           17
        //   425: astore          24
        //   427: aload           18
        //   429: aload           24
        //   431: checkcast       Ljava/awt/Component;
        //   434: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   437: pop            
        //   438: nop            
        //   439: nop            
        //   440: aload           9
        //   442: astore          22
        //   444: aload           10
        //   446: aload           22
        //   448: checkcast       Ljava/awt/Component;
        //   451: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   454: pop            
        //   455: nop            
        //   456: aload           4
        //   458: areturn        
        //    StackMapTable: 00 01 FF 01 28 00 17 07 00 03 07 00 CD 07 00 CD 07 01 23 07 00 42 01 01 07 00 42 01 07 00 42 07 00 42 01 01 07 00 42 01 07 00 54 07 00 42 01 01 07 00 72 01 07 00 72 07 00 42 00 03 08 01 0B 08 01 0B 07 00 EB
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final JPanel getDownloadPanel(@NotNull final String text, @NotNull final Map versionmap, @NotNull final Function0 stopCallback, @NotNull final Function2 selectCallback) {
        @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007" }, d2 = { "<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "kotlin.jvm.PlatformType", "actionPerformed", "dev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$1$1$8", "dev/nuker/pyro/launcher/LoaderGui$$special$$inlined$apply$lambda$10" })
        final class LoaderGui$getDownloadPanel$$inlined$apply$lambda$6 implements ActionListener
        {
            final /* synthetic */ JComboBox $channelBox$inlined;
            final /* synthetic */ JComboBox $versionBox$inlined;
            final /* synthetic */ JButton $button$inlined;
            final /* synthetic */ Map $versionmap$inlined;
            final /* synthetic */ Function0 $stopCallback$inlined;
            final /* synthetic */ Function2 $selectCallback$inlined;
            
            LoaderGui$getDownloadPanel$$inlined$apply$lambda$6(final JComboBox $channelBox$inlined, final JComboBox $versionBox$inlined, final JButton $button$inlined, final Map $versionmap$inlined, final Function0 $stopCallback$inlined, final Function2 $selectCallback$inlined) {
                this.$channelBox$inlined = $channelBox$inlined;
                this.$versionBox$inlined = $versionBox$inlined;
                this.$button$inlined = $button$inlined;
                this.$versionmap$inlined = $versionmap$inlined;
                this.$stopCallback$inlined = $stopCallback$inlined;
                this.$selectCallback$inlined = $selectCallback$inlined;
            }
            
            @Override
            public final void actionPerformed(final ActionEvent it) {
                final Function2 $selectCallback$inlined = this.$selectCallback$inlined;
                final Object selectedItem = this.$channelBox$inlined.getSelectedItem();
                if (selectedItem == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
                final String s = (String)selectedItem;
                final Object selectedItem2 = this.$versionBox$inlined.getSelectedItem();
                if (selectedItem2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
                $selectCallback$inlined.invoke(s, selectedItem2);
                this.$button$inlined.setEnabled(false);
            }
        }
        @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\b" }, d2 = { "dev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$1$1$7", "Ljava/awt/event/FocusListener;", "focusGained", "", "e", "Ljava/awt/event/FocusEvent;", "focusLost", "pyroclient", "dev/nuker/pyro/launcher/LoaderGui$$special$$inlined$apply$lambda$9" })
        public final class LoaderGui$getDownloadPanel$$inlined$apply$lambda$5 implements FocusListener
        {
            final /* synthetic */ JComboBox $channelBox$inlined;
            final /* synthetic */ JComboBox $versionBox$inlined;
            final /* synthetic */ JButton $button$inlined;
            final /* synthetic */ Map $versionmap$inlined;
            final /* synthetic */ Function0 $stopCallback$inlined;
            final /* synthetic */ Function2 $selectCallback$inlined;
            
            LoaderGui$getDownloadPanel$$inlined$apply$lambda$5(final JComboBox $channelBox$inlined, final JComboBox $versionBox$inlined, final JButton $button$inlined, final Map $versionmap$inlined, final Function0 $stopCallback$inlined, final Function2 $selectCallback$inlined) {
                this.$channelBox$inlined = $channelBox$inlined;
                this.$versionBox$inlined = $versionBox$inlined;
                this.$button$inlined = $button$inlined;
                this.$versionmap$inlined = $versionmap$inlined;
                this.$stopCallback$inlined = $stopCallback$inlined;
                this.$selectCallback$inlined = $selectCallback$inlined;
            }
            
            @Override
            public void focusLost(@Nullable final FocusEvent e) {
            }
            
            @Override
            public void focusGained(@Nullable final FocusEvent e) {
                this.$stopCallback$inlined.invoke();
                this.$button$inlined.setEnabled(true);
            }
        }
        @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\b" }, d2 = { "dev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$1$1$6", "Ljava/awt/event/FocusListener;", "focusGained", "", "e", "Ljava/awt/event/FocusEvent;", "focusLost", "pyroclient", "dev/nuker/pyro/launcher/LoaderGui$$special$$inlined$apply$lambda$8" })
        public final class LoaderGui$getDownloadPanel$$inlined$apply$lambda$4 implements FocusListener
        {
            final /* synthetic */ JComboBox $channelBox$inlined;
            final /* synthetic */ JComboBox $versionBox$inlined;
            final /* synthetic */ JButton $button$inlined;
            final /* synthetic */ Map $versionmap$inlined;
            final /* synthetic */ Function0 $stopCallback$inlined;
            final /* synthetic */ Function2 $selectCallback$inlined;
            
            LoaderGui$getDownloadPanel$$inlined$apply$lambda$4(final JComboBox $channelBox$inlined, final JComboBox $versionBox$inlined, final JButton $button$inlined, final Map $versionmap$inlined, final Function0 $stopCallback$inlined, final Function2 $selectCallback$inlined) {
                this.$channelBox$inlined = $channelBox$inlined;
                this.$versionBox$inlined = $versionBox$inlined;
                this.$button$inlined = $button$inlined;
                this.$versionmap$inlined = $versionmap$inlined;
                this.$stopCallback$inlined = $stopCallback$inlined;
                this.$selectCallback$inlined = $selectCallback$inlined;
            }
            
            @Override
            public void focusLost(@Nullable final FocusEvent e) {
            }
            
            @Override
            public void focusGained(@Nullable final FocusEvent e) {
                this.$stopCallback$inlined.invoke();
                this.$button$inlined.setEnabled(true);
            }
        }
        @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007" }, d2 = { "<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "kotlin.jvm.PlatformType", "actionPerformed", "dev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$1$1$5", "dev/nuker/pyro/launcher/LoaderGui$$special$$inlined$apply$lambda$7" })
        final class LoaderGui$getDownloadPanel$$inlined$apply$lambda$3 implements ActionListener
        {
            final /* synthetic */ JComboBox $channelBox$inlined;
            final /* synthetic */ JComboBox $versionBox$inlined;
            final /* synthetic */ JButton $button$inlined;
            final /* synthetic */ Map $versionmap$inlined;
            final /* synthetic */ Function0 $stopCallback$inlined;
            final /* synthetic */ Function2 $selectCallback$inlined;
            
            LoaderGui$getDownloadPanel$$inlined$apply$lambda$3(final JComboBox $channelBox$inlined, final JComboBox $versionBox$inlined, final JButton $button$inlined, final Map $versionmap$inlined, final Function0 $stopCallback$inlined, final Function2 $selectCallback$inlined) {
                this.$channelBox$inlined = $channelBox$inlined;
                this.$versionBox$inlined = $versionBox$inlined;
                this.$button$inlined = $button$inlined;
                this.$versionmap$inlined = $versionmap$inlined;
                this.$stopCallback$inlined = $stopCallback$inlined;
                this.$selectCallback$inlined = $selectCallback$inlined;
            }
            
            @Override
            public final void actionPerformed(final ActionEvent it) {
                this.$stopCallback$inlined.invoke();
                this.$button$inlined.setEnabled(true);
            }
        }
        @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007" }, d2 = { "<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "kotlin.jvm.PlatformType", "actionPerformed", "dev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$1$1$4", "dev/nuker/pyro/launcher/LoaderGui$$special$$inlined$apply$lambda$6" })
        final class LoaderGui$getDownloadPanel$$inlined$apply$lambda$2 implements ActionListener
        {
            final /* synthetic */ JComboBox $channelBox$inlined;
            final /* synthetic */ JComboBox $versionBox$inlined;
            final /* synthetic */ JButton $button$inlined;
            final /* synthetic */ Map $versionmap$inlined;
            final /* synthetic */ Function0 $stopCallback$inlined;
            final /* synthetic */ Function2 $selectCallback$inlined;
            
            LoaderGui$getDownloadPanel$$inlined$apply$lambda$2(final JComboBox $channelBox$inlined, final JComboBox $versionBox$inlined, final JButton $button$inlined, final Map $versionmap$inlined, final Function0 $stopCallback$inlined, final Function2 $selectCallback$inlined) {
                this.$channelBox$inlined = $channelBox$inlined;
                this.$versionBox$inlined = $versionBox$inlined;
                this.$button$inlined = $button$inlined;
                this.$versionmap$inlined = $versionmap$inlined;
                this.$stopCallback$inlined = $stopCallback$inlined;
                this.$selectCallback$inlined = $selectCallback$inlined;
            }
            
            @Override
            public final void actionPerformed(final ActionEvent it) {
                this.$stopCallback$inlined.invoke();
            }
        }
        @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007" }, d2 = { "<anonymous>", "", "it", "Ljava/awt/event/ItemEvent;", "kotlin.jvm.PlatformType", "itemStateChanged", "dev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$1$1$2", "dev/nuker/pyro/launcher/LoaderGui$$special$$inlined$apply$lambda$5" })
        final class LoaderGui$getDownloadPanel$$inlined$apply$lambda$1 implements ItemListener
        {
            final /* synthetic */ JComboBox $channelBox$inlined;
            final /* synthetic */ JComboBox $versionBox$inlined;
            final /* synthetic */ JButton $button$inlined;
            final /* synthetic */ Map $versionmap$inlined;
            final /* synthetic */ Function0 $stopCallback$inlined;
            final /* synthetic */ Function2 $selectCallback$inlined;
            
            LoaderGui$getDownloadPanel$$inlined$apply$lambda$1(final JComboBox $channelBox$inlined, final JComboBox $versionBox$inlined, final JButton $button$inlined, final Map $versionmap$inlined, final Function0 $stopCallback$inlined, final Function2 $selectCallback$inlined) {
                this.$channelBox$inlined = $channelBox$inlined;
                this.$versionBox$inlined = $versionBox$inlined;
                this.$button$inlined = $button$inlined;
                this.$versionmap$inlined = $versionmap$inlined;
                this.$stopCallback$inlined = $stopCallback$inlined;
                this.$selectCallback$inlined = $selectCallback$inlined;
            }
            
            @Override
            public final void itemStateChanged(final ItemEvent it) {
                this.$versionBox$inlined.removeAllItems();
                final Object[] value = this.$versionmap$inlined.get(this.$channelBox$inlined.getSelectedItem());
                if (value == null) {
                    Intrinsics.throwNpe();
                }
                final Object[] $this$forEach$iv = value;
                final int $i$f$forEach = 0;
                for (final Object element$iv : $this$forEach$iv) {
                    final String it2 = (String)element$iv;
                    final int n = 0;
                    this.$versionBox$inlined.addItem(it2);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "text"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* versionmap */
        //     7: ldc_w           "versionmap"
        //    10: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    13: aload_3         /* stopCallback */
        //    14: ldc_w           "stopCallback"
        //    17: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    20: aload           selectCallback
        //    22: ldc_w           "selectCallback"
        //    25: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    28: new             Ljavax/swing/JPanel;
        //    31: dup            
        //    32: invokespecial   javax/swing/JPanel.<init>:()V
        //    35: astore          5
        //    37: iconst_0       
        //    38: istore          6
        //    40: iconst_0       
        //    41: istore          7
        //    43: aload           5
        //    45: astore          $this$apply
        //    47: iconst_0       
        //    48: istore          $i$a$-apply-LoaderGui$getDownloadPanel$1
        //    50: aload           $this$apply
        //    52: new             Ljavax/swing/BoxLayout;
        //    55: dup            
        //    56: aload           $this$apply
        //    58: checkcast       Ljava/awt/Container;
        //    61: iconst_1       
        //    62: invokespecial   javax/swing/BoxLayout.<init>:(Ljava/awt/Container;I)V
        //    65: checkcast       Ljava/awt/LayoutManager;
        //    68: invokevirtual   javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
        //    71: aload           $this$apply
        //    73: bipush          20
        //    75: invokestatic    javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
        //    78: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //    81: pop            
        //    82: new             Ljavax/swing/JComboBox;
        //    85: dup            
        //    86: invokespecial   javax/swing/JComboBox.<init>:()V
        //    89: astore          channelBox
        //    91: new             Ljavax/swing/JComboBox;
        //    94: dup            
        //    95: invokespecial   javax/swing/JComboBox.<init>:()V
        //    98: astore          versionBox
        //   100: new             Ljavax/swing/JButton;
        //   103: dup            
        //   104: ldc_w           "Run"
        //   107: invokespecial   javax/swing/JButton.<init>:(Ljava/lang/String;)V
        //   110: astore          button
        //   112: aload           button
        //   114: iconst_0       
        //   115: invokevirtual   javax/swing/JButton.setEnabled:(Z)V
        //   118: aload           $this$apply
        //   120: new             Ljavax/swing/JPanel;
        //   123: dup            
        //   124: invokespecial   javax/swing/JPanel.<init>:()V
        //   127: astore          13
        //   129: astore          14
        //   131: iconst_0       
        //   132: istore          15
        //   134: iconst_0       
        //   135: istore          16
        //   137: aload           13
        //   139: astore          $this$apply
        //   141: iconst_0       
        //   142: istore          $i$a$-apply-LoaderGui$getDownloadPanel$1$1
        //   144: aload           $this$apply
        //   146: new             Ljavax/swing/BoxLayout;
        //   149: dup            
        //   150: aload           $this$apply
        //   152: checkcast       Ljava/awt/Container;
        //   155: iconst_0       
        //   156: invokespecial   javax/swing/BoxLayout.<init>:(Ljava/awt/Container;I)V
        //   159: checkcast       Ljava/awt/LayoutManager;
        //   162: invokevirtual   javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
        //   165: aload           $this$apply
        //   167: invokestatic    javax/swing/Box.createHorizontalGlue:()Ljava/awt/Component;
        //   170: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   173: pop            
        //   174: new             Ljava/awt/Font;
        //   177: dup            
        //   178: ldc             "Arial"
        //   180: iconst_0       
        //   181: bipush          16
        //   183: invokespecial   java/awt/Font.<init>:(Ljava/lang/String;II)V
        //   186: astore          fnt
        //   188: new             Ljava/util/HashMap;
        //   191: dup            
        //   192: aload           fnt
        //   194: invokevirtual   java/awt/Font.getAttributes:()Ljava/util/Map;
        //   197: dup            
        //   198: ifnonnull       211
        //   201: new             Lkotlin/TypeCastException;
        //   204: dup            
        //   205: ldc             "null cannot be cast to non-null type kotlin.collections.Map<java.awt.font.TextAttribute, kotlin.Any?>"
        //   207: invokespecial   kotlin/TypeCastException.<init>:(Ljava/lang/String;)V
        //   210: athrow         
        //   211: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //   214: astore          attributes
        //   216: aload           attributes
        //   218: checkcast       Ljava/util/Map;
        //   221: getstatic       java/awt/font/TextAttribute.UNDERLINE:Ljava/awt/font/TextAttribute;
        //   224: dup            
        //   225: ldc             "TextAttribute.UNDERLINE"
        //   227: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   230: getstatic       java/awt/font/TextAttribute.UNDERLINE_ON:Ljava/lang/Integer;
        //   233: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   238: pop            
        //   239: aload           fnt
        //   241: aload           attributes
        //   243: checkcast       Ljava/util/Map;
        //   246: invokevirtual   java/awt/Font.deriveFont:(Ljava/util/Map;)Ljava/awt/Font;
        //   249: dup            
        //   250: ldc_w           "fnt.deriveFont(attributes)"
        //   253: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   256: astore          fnt
        //   258: aload_2         /* versionmap */
        //   259: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   264: checkcast       Ljava/lang/Iterable;
        //   267: astore          $this$forEach$iv
        //   269: iconst_0       
        //   270: istore          $i$f$forEach
        //   272: aload           $this$forEach$iv
        //   274: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   279: astore          23
        //   281: aload           23
        //   283: invokeinterface java/util/Iterator.hasNext:()Z
        //   288: ifeq            321
        //   291: aload           23
        //   293: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   298: astore          element$iv
        //   300: aload           element$iv
        //   302: checkcast       Ljava/lang/String;
        //   305: astore          it
        //   307: iconst_0       
        //   308: istore          $i$a$-forEach-LoaderGui$getDownloadPanel$1$1$1
        //   310: aload           channelBox
        //   312: aload           it
        //   314: invokevirtual   javax/swing/JComboBox.addItem:(Ljava/lang/Object;)V
        //   317: nop            
        //   318: goto            281
        //   321: nop            
        //   322: aload           channelBox
        //   324: new             Ldev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$$inlined$apply$lambda$1;
        //   327: dup            
        //   328: aload           channelBox
        //   330: aload           versionBox
        //   332: aload           button
        //   334: aload_2         /* versionmap */
        //   335: aload_3         /* stopCallback */
        //   336: aload           selectCallback
        //   338: invokespecial   dev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$$inlined$apply$lambda$1.<init>:(Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JButton;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V
        //   341: checkcast       Ljava/awt/event/ItemListener;
        //   344: invokevirtual   javax/swing/JComboBox.addItemListener:(Ljava/awt/event/ItemListener;)V
        //   347: aload           versionBox
        //   349: invokevirtual   javax/swing/JComboBox.removeAllItems:()V
        //   352: aload_2         /* versionmap */
        //   353: astore          21
        //   355: aload           channelBox
        //   357: invokevirtual   javax/swing/JComboBox.getSelectedItem:()Ljava/lang/Object;
        //   360: astore          22
        //   362: iconst_0       
        //   363: istore          23
        //   365: aload           21
        //   367: aload           22
        //   369: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   374: dup            
        //   375: ifnonnull       381
        //   378: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   381: checkcast       [Ljava/lang/Object;
        //   384: astore          $this$forEach$iv
        //   386: iconst_0       
        //   387: istore          $i$f$forEach
        //   389: aload           $this$forEach$iv
        //   391: astore          23
        //   393: aload           23
        //   395: arraylength    
        //   396: istore          24
        //   398: iconst_0       
        //   399: istore          25
        //   401: iload           25
        //   403: iload           24
        //   405: if_icmpge       438
        //   408: aload           23
        //   410: iload           25
        //   412: aaload         
        //   413: astore          element$iv
        //   415: aload           element$iv
        //   417: checkcast       Ljava/lang/String;
        //   420: astore          it
        //   422: iconst_0       
        //   423: istore          $i$a$-forEach-LoaderGui$getDownloadPanel$1$1$3
        //   425: aload           versionBox
        //   427: aload           it
        //   429: invokevirtual   javax/swing/JComboBox.addItem:(Ljava/lang/Object;)V
        //   432: iinc            25, 1
        //   435: goto            401
        //   438: nop            
        //   439: aload           channelBox
        //   441: new             Ldev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$$inlined$apply$lambda$2;
        //   444: dup            
        //   445: aload           channelBox
        //   447: aload           versionBox
        //   449: aload           button
        //   451: aload_2         /* versionmap */
        //   452: aload_3         /* stopCallback */
        //   453: aload           selectCallback
        //   455: invokespecial   dev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$$inlined$apply$lambda$2.<init>:(Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JButton;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V
        //   458: checkcast       Ljava/awt/event/ActionListener;
        //   461: invokevirtual   javax/swing/JComboBox.addActionListener:(Ljava/awt/event/ActionListener;)V
        //   464: aload           versionBox
        //   466: new             Ldev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$$inlined$apply$lambda$3;
        //   469: dup            
        //   470: aload           channelBox
        //   472: aload           versionBox
        //   474: aload           button
        //   476: aload_2         /* versionmap */
        //   477: aload_3         /* stopCallback */
        //   478: aload           selectCallback
        //   480: invokespecial   dev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$$inlined$apply$lambda$3.<init>:(Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JButton;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V
        //   483: checkcast       Ljava/awt/event/ActionListener;
        //   486: invokevirtual   javax/swing/JComboBox.addActionListener:(Ljava/awt/event/ActionListener;)V
        //   489: aload           channelBox
        //   491: new             Ldev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$$inlined$apply$lambda$4;
        //   494: dup            
        //   495: aload           channelBox
        //   497: aload           versionBox
        //   499: aload           button
        //   501: aload_2         /* versionmap */
        //   502: aload_3         /* stopCallback */
        //   503: aload           selectCallback
        //   505: invokespecial   dev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$$inlined$apply$lambda$4.<init>:(Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JButton;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V
        //   508: checkcast       Ljava/awt/event/FocusListener;
        //   511: invokevirtual   javax/swing/JComboBox.addFocusListener:(Ljava/awt/event/FocusListener;)V
        //   514: aload           versionBox
        //   516: new             Ldev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$$inlined$apply$lambda$5;
        //   519: dup            
        //   520: aload           channelBox
        //   522: aload           versionBox
        //   524: aload           button
        //   526: aload_2         /* versionmap */
        //   527: aload_3         /* stopCallback */
        //   528: aload           selectCallback
        //   530: invokespecial   dev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$$inlined$apply$lambda$5.<init>:(Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JButton;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V
        //   533: checkcast       Ljava/awt/event/FocusListener;
        //   536: invokevirtual   javax/swing/JComboBox.addFocusListener:(Ljava/awt/event/FocusListener;)V
        //   539: aload           $this$apply
        //   541: aload           channelBox
        //   543: checkcast       Ljava/awt/Component;
        //   546: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   549: pop            
        //   550: aload           $this$apply
        //   552: aload           versionBox
        //   554: checkcast       Ljava/awt/Component;
        //   557: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   560: pop            
        //   561: aload           button
        //   563: new             Ldev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$$inlined$apply$lambda$6;
        //   566: dup            
        //   567: aload           channelBox
        //   569: aload           versionBox
        //   571: aload           button
        //   573: aload_2         /* versionmap */
        //   574: aload_3         /* stopCallback */
        //   575: aload           selectCallback
        //   577: invokespecial   dev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$$inlined$apply$lambda$6.<init>:(Ljavax/swing/JComboBox;Ljavax/swing/JComboBox;Ljavax/swing/JButton;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V
        //   580: checkcast       Ljava/awt/event/ActionListener;
        //   583: invokevirtual   javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
        //   586: aload           $this$apply
        //   588: aload           button
        //   590: checkcast       Ljava/awt/Component;
        //   593: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   596: pop            
        //   597: aload           $this$apply
        //   599: invokestatic    javax/swing/Box.createHorizontalGlue:()Ljava/awt/Component;
        //   602: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   605: pop            
        //   606: nop            
        //   607: nop            
        //   608: aload           13
        //   610: astore          29
        //   612: aload           14
        //   614: aload           29
        //   616: checkcast       Ljava/awt/Component;
        //   619: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   622: pop            
        //   623: nop            
        //   624: nop            
        //   625: aload           5
        //   627: areturn        
        //    StackMapTable: 00 06 FF 00 D3 00 14 07 00 03 07 00 CD 07 00 EB 07 01 89 07 00 CB 07 00 42 01 01 07 00 42 01 07 01 29 07 01 29 07 00 9C 07 00 42 07 00 42 01 01 07 00 42 01 07 00 79 00 03 08 00 BC 08 00 BC 07 00 EB FF 00 45 00 18 07 00 03 07 00 CD 07 00 EB 07 01 89 07 00 CB 07 00 42 01 01 07 00 42 01 07 01 29 07 01 29 07 00 9C 07 00 42 07 00 42 01 01 07 00 42 01 07 00 79 07 00 DD 07 01 36 01 07 01 3C 00 00 27 FF 00 3B 00 18 07 00 03 07 00 CD 07 00 EB 07 01 89 07 00 CB 07 00 42 01 01 07 00 42 01 07 01 29 07 01 29 07 00 9C 07 00 42 07 00 42 01 01 07 00 42 01 07 00 79 07 00 DD 07 00 EB 07 00 CF 01 00 01 07 00 CF FF 00 13 00 1A 07 00 03 07 00 CD 07 00 EB 07 01 89 07 00 CB 07 00 42 01 01 07 00 42 01 07 01 29 07 01 29 07 00 9C 07 00 42 07 00 42 01 01 07 00 42 01 07 00 79 07 00 DD 07 01 62 01 07 01 62 01 01 00 00 24
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:344)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:173)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:169)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:547)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
    
    public final void setUI(@NotNull final JPanel panel) {
        Intrinsics.checkParameterIsNotNull(panel, "panel");
        this.parentPanel.remove(this.currentPanel);
        this.currentPanel = panel;
        this.parentPanel.add(this.currentPanel);
        this.parentPanel.revalidate();
    }
    
    public LoaderGui() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "Pyro Loader"
        //     4: invokespecial   javax/swing/JFrame.<init>:(Ljava/lang/String;)V
        //     7: aload_0         /* this */
        //     8: ldc2_w          -1.0
        //    11: putfield        dev/nuker/pyro/launcher/LoaderGui.progress:D
        //    14: aload_0         /* this */
        //    15: aload_0         /* this */
        //    16: ldc_w           "Initializing"
        //    19: invokevirtual   dev/nuker/pyro/launcher/LoaderGui.getTextPanel:(Ljava/lang/String;)Ljavax/swing/JPanel;
        //    22: putfield        dev/nuker/pyro/launcher/LoaderGui.currentPanel:Ljavax/swing/JPanel;
        //    25: aload_0         /* this */
        //    26: iconst_1       
        //    27: putfield        dev/nuker/pyro/launcher/LoaderGui.lDir:I
        //    30: aload_0         /* this */
        //    31: iconst_1       
        //    32: invokevirtual   dev/nuker/pyro/launcher/LoaderGui.setUndecorated:(Z)V
        //    35: aload_0         /* this */
        //    36: sipush          400
        //    39: sipush          400
        //    42: invokevirtual   dev/nuker/pyro/launcher/LoaderGui.setSize:(II)V
        //    45: aload_0         /* this */
        //    46: aconst_null    
        //    47: invokevirtual   dev/nuker/pyro/launcher/LoaderGui.setLocationRelativeTo:(Ljava/awt/Component;)V
        //    50: aload_0         /* this */
        //    51: checkcast       Ldev/nuker/pyro/launcher/LoaderGui;
        //    54: astore_1        /* base */
        //    55: aload_0         /* this */
        //    56: new             Ljava/awt/BorderLayout;
        //    59: dup            
        //    60: invokespecial   java/awt/BorderLayout.<init>:()V
        //    63: checkcast       Ljava/awt/LayoutManager;
        //    66: invokevirtual   dev/nuker/pyro/launcher/LoaderGui.setLayout:(Ljava/awt/LayoutManager;)V
        //    69: aload_0         /* this */
        //    70: new             Ljavax/swing/JPanel;
        //    73: dup            
        //    74: invokespecial   javax/swing/JPanel.<init>:()V
        //    77: astore_2       
        //    78: astore          14
        //    80: iconst_0       
        //    81: istore_3       
        //    82: iconst_0       
        //    83: istore          4
        //    85: aload_2        
        //    86: astore          $this$apply
        //    88: iconst_0       
        //    89: istore          $i$a$-apply-LoaderGui$1
        //    91: aload_0         /* this */
        //    92: aload           $this$apply
        //    94: putfield        dev/nuker/pyro/launcher/LoaderGui.parentPanel:Ljavax/swing/JPanel;
        //    97: aload           $this$apply
        //    99: new             Ljavax/swing/BoxLayout;
        //   102: dup            
        //   103: aload           $this$apply
        //   105: checkcast       Ljava/awt/Container;
        //   108: iconst_1       
        //   109: invokespecial   javax/swing/BoxLayout.<init>:(Ljava/awt/Container;I)V
        //   112: checkcast       Ljava/awt/LayoutManager;
        //   115: invokevirtual   javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
        //   118: aload           $this$apply
        //   120: bipush          50
        //   122: invokestatic    javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
        //   125: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   128: pop            
        //   129: new             Ldev/nuker/pyro/launcher/LoaderGui$ImgBkg;
        //   132: dup            
        //   133: aload_0         /* this */
        //   134: invokespecial   dev/nuker/pyro/launcher/LoaderGui$ImgBkg.<init>:(Ldev/nuker/pyro/launcher/LoaderGui;)V
        //   137: astore          img
        //   139: aload           $this$apply
        //   141: aload           img
        //   143: checkcast       Ljava/awt/Component;
        //   146: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   149: pop            
        //   150: aload           $this$apply
        //   152: bipush          20
        //   154: invokestatic    javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
        //   157: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   160: pop            
        //   161: aload           $this$apply
        //   163: aload_0         /* this */
        //   164: getfield        dev/nuker/pyro/launcher/LoaderGui.currentPanel:Ljavax/swing/JPanel;
        //   167: checkcast       Ljava/awt/Component;
        //   170: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   173: pop            
        //   174: iconst_1       
        //   175: iconst_0       
        //   176: aconst_null    
        //   177: aconst_null    
        //   178: iconst_0       
        //   179: new             Ldev/nuker/pyro/launcher/LoaderGui$$special$$inlined$apply$lambda$11;
        //   182: dup            
        //   183: aload           img
        //   185: aload_0         /* this */
        //   186: aload_1         /* base */
        //   187: invokespecial   dev/nuker/pyro/launcher/LoaderGui$$special$$inlined$apply$lambda$11.<init>:(Ldev/nuker/pyro/launcher/LoaderGui$ImgBkg;Ldev/nuker/pyro/launcher/LoaderGui;Ldev/nuker/pyro/launcher/LoaderGui;)V
        //   190: checkcast       Lkotlin/jvm/functions/Function0;
        //   193: bipush          30
        //   195: aconst_null    
        //   196: invokestatic    kotlin/concurrent/ThreadsKt.thread$default:(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;
        //   199: pop            
        //   200: nop            
        //   201: nop            
        //   202: aload_2        
        //   203: astore          15
        //   205: aload           14
        //   207: aload           15
        //   209: checkcast       Ljava/awt/Component;
        //   212: ldc_w           "North"
        //   215: invokevirtual   dev/nuker/pyro/launcher/LoaderGui.add:(Ljava/awt/Component;Ljava/lang/Object;)V
        //   218: aload_0         /* this */
        //   219: new             Ljavax/swing/JPanel;
        //   222: dup            
        //   223: invokespecial   javax/swing/JPanel.<init>:()V
        //   226: astore_2       
        //   227: astore          14
        //   229: iconst_0       
        //   230: istore_3       
        //   231: iconst_0       
        //   232: istore          4
        //   234: aload_2        
        //   235: astore          $this$apply
        //   237: iconst_0       
        //   238: istore          $i$a$-apply-LoaderGui$2
        //   240: aload           $this$apply
        //   242: new             Ljavax/swing/JButton;
        //   245: dup            
        //   246: ldc_w           "Close"
        //   249: invokespecial   javax/swing/JButton.<init>:(Ljava/lang/String;)V
        //   252: astore          7
        //   254: astore          8
        //   256: iconst_0       
        //   257: istore          9
        //   259: iconst_0       
        //   260: istore          10
        //   262: aload           7
        //   264: astore          $this$apply
        //   266: iconst_0       
        //   267: istore          $i$a$-apply-LoaderGui$2$1
        //   269: aload           $this$apply
        //   271: getstatic       dev/nuker/pyro/launcher/LoaderGui$2$1$1.INSTANCE:Ldev/nuker/pyro/launcher/LoaderGui$2$1$1;
        //   274: checkcast       Ljava/awt/event/ActionListener;
        //   277: invokevirtual   javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
        //   280: nop            
        //   281: aload           7
        //   283: astore          13
        //   285: aload           8
        //   287: aload           13
        //   289: checkcast       Ljava/awt/Component;
        //   292: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   295: pop            
        //   296: nop            
        //   297: aload_2        
        //   298: astore          15
        //   300: aload           14
        //   302: aload           15
        //   304: checkcast       Ljava/awt/Component;
        //   307: ldc             "South"
        //   309: invokevirtual   dev/nuker/pyro/launcher/LoaderGui.add:(Ljava/awt/Component;Ljava/lang/Object;)V
        //   312: aload_0         /* this */
        //   313: iconst_1       
        //   314: invokevirtual   dev/nuker/pyro/launcher/LoaderGui.setVisible:(Z)V
        //   317: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:344)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:173)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:169)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:547)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
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
