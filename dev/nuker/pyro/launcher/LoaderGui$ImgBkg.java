// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.launcher;

import javax.imageio.ImageIO;
import dev.nuker.pyro.PyroClientLoadingPlugin;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.image.BufferedImageOp;
import java.awt.RenderingHints;
import java.awt.image.RescaleOp;
import java.awt.Shape;
import java.awt.Rectangle;
import kotlin.TypeCastException;
import org.jetbrains.annotations.Nullable;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.ImageObserver;
import java.awt.Image;
import kotlin.jvm.internal.Intrinsics;
import javax.swing.JProgressBar;
import org.jetbrains.annotations.NotNull;
import java.awt.image.BufferedImage;
import kotlin.Metadata;
import javax.swing.JPanel;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010,\u001a\u00020-H\u0016J\u0006\u0010.\u001a\u00020/J\u0012\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\u000e\u00103\u001a\u00020/2\u0006\u0010 \u001a\u00020!R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00064" }, d2 = { "Ldev/nuker/pyro/launcher/LoaderGui$ImgBkg;", "Ljavax/swing/JPanel;", "(Ldev/nuker/pyro/launcher/LoaderGui;)V", "image", "Ljava/awt/image/BufferedImage;", "getImage", "()Ljava/awt/image/BufferedImage;", "setImage", "(Ljava/awt/image/BufferedImage;)V", "lightness", "", "getLightness", "()F", "setLightness", "(F)V", "oImage", "getOImage", "pbar", "Ljavax/swing/JProgressBar;", "getPbar", "()Ljavax/swing/JProgressBar;", "setPbar", "(Ljavax/swing/JProgressBar;)V", "percent", "", "getPercent", "()D", "setPercent", "(D)V", "redLightness", "getRedLightness", "setRedLightness", "size", "", "getSize", "()I", "setSize", "(I)V", "usePBar", "", "getUsePBar", "()Z", "setUsePBar", "(Z)V", "getPreferredSize", "Ljava/awt/Dimension;", "onProgress", "", "paintComponent", "g", "Ljava/awt/Graphics;", "setImgSize", "pyroclient" })
public final class LoaderGui$ImgBkg extends JPanel
{
    @NotNull
    public BufferedImage image;
    @NotNull
    private final BufferedImage oImage;
    private double percent;
    private float lightness;
    private int size;
    private float redLightness;
    private boolean usePBar;
    @NotNull
    public JProgressBar pbar;
    final /* synthetic */ LoaderGui this$0;
    
    @NotNull
    public final BufferedImage getImage() {
        final BufferedImage image = this.image;
        if (image == null) {
            Intrinsics.throwUninitializedPropertyAccessException("image");
        }
        return image;
    }
    
    public final void setImage(@NotNull final BufferedImage <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.image = <set-?>;
    }
    
    @NotNull
    public final BufferedImage getOImage() {
        return this.oImage;
    }
    
    public final double getPercent() {
        return this.percent;
    }
    
    public final void setPercent(final double <set-?>) {
        this.percent = <set-?>;
    }
    
    public final float getLightness() {
        return this.lightness;
    }
    
    public final void setLightness(final float <set-?>) {
        this.lightness = <set-?>;
    }
    
    public final int getSize() {
        return this.size;
    }
    
    public final void setSize(final int <set-?>) {
        this.size = <set-?>;
    }
    
    public final float getRedLightness() {
        return this.redLightness;
    }
    
    public final void setRedLightness(final float <set-?>) {
        this.redLightness = <set-?>;
    }
    
    public final boolean getUsePBar() {
        return this.usePBar;
    }
    
    public final void setUsePBar(final boolean <set-?>) {
        this.usePBar = <set-?>;
    }
    
    @NotNull
    public final JProgressBar getPbar() {
        final JProgressBar pbar = this.pbar;
        if (pbar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pbar");
        }
        return pbar;
    }
    
    public final void setPbar(@NotNull final JProgressBar <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.pbar = <set-?>;
    }
    
    public final void setImgSize(final int size) {
        this.image = new BufferedImage(size, size, 2);
        final BufferedImage image = this.image;
        if (image == null) {
            Intrinsics.throwUninitializedPropertyAccessException("image");
        }
        final Graphics2D g = image.createGraphics();
        g.drawImage(this.oImage, 0, 0, size, size, null);
        g.dispose();
        this.size = size;
    }
    
    @Override
    protected void paintComponent(@Nullable final Graphics g) {
        super.paintComponent(g);
        if (!this.usePBar) {
            try {
                final int x = this.getWidth() / 2 - this.size / 2;
                if (g == null) {
                    Intrinsics.throwNpe();
                }
                if (g == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.awt.Graphics2D");
                }
                final Graphics2D graphics2D = (Graphics2D)g;
                final BufferedImage image = this.image;
                if (image == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("image");
                }
                graphics2D.drawImage(image, x, 0, null);
                final Shape oldClip = g.getClip();
                g.setClip(new Rectangle(x, 0, this.size, (int)((1.0 - this.percent) * this.size)));
                if (this.redLightness != 0.0f) {
                    final Graphics2D graphics2D2 = (Graphics2D)g;
                    final BufferedImage image2 = this.image;
                    if (image2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("image");
                    }
                    graphics2D2.drawImage(image2, new RescaleOp(new float[] { this.redLightness, this.lightness, this.lightness }, new float[] { 0.0f, 0.0f, 0.0f }, null), x, 0);
                }
                else {
                    final Graphics2D graphics2D3 = (Graphics2D)g;
                    final BufferedImage image3 = this.image;
                    if (image3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("image");
                    }
                    graphics2D3.drawImage(image3, new RescaleOp(this.lightness, 0.0f, null), x, 0);
                }
                ((Graphics2D)g).setClip(oldClip);
            }
            catch (Throwable e) {
                if (!this.usePBar) {
                    this.usePBar = true;
                    EventQueue.invokeLater((Runnable)new LoaderGui$ImgBkg$paintComponent$1(this));
                }
            }
        }
    }
    
    public final void onProgress() {
        if (this.pbar != null) {
            EventQueue.invokeAndWait((Runnable)new LoaderGui$ImgBkg$onProgress$2(this));
        }
    }
    
    @NotNull
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(this.size, this.usePBar ? 100 : this.size);
    }
    
    public LoaderGui$ImgBkg(final LoaderGui $outer) {
        this.this$0 = $outer;
        this.lightness = 0.6f;
        this.setBackground(new Color(0, 0, 0, 0));
        this.setLayout(new BorderLayout());
        System.out.println(PyroClientLoadingPlugin.getResourceAsStream("logo.png"));
        final BufferedImage read;
        final BufferedImage img = read = ImageIO.read(PyroClientLoadingPlugin.getResourceAsStream("logo.png"));
        Intrinsics.checkExpressionValueIsNotNull(read, "img");
        this.oImage = read;
        this.setImgSize(200);
    }
}
