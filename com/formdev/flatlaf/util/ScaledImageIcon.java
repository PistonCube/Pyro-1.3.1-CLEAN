// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.util;

import java.awt.image.BufferedImage;
import java.awt.RenderingHints;
import java.awt.image.ImageObserver;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class ScaledImageIcon implements Icon
{
    private final ImageIcon imageIcon;
    private final int iconWidth;
    private final int iconHeight;
    private double lastSystemScaleFactor;
    private float lastUserScaleFactor;
    private Image lastImage;
    
    public ScaledImageIcon(final ImageIcon imageIcon) {
        this(imageIcon, imageIcon.getIconWidth(), imageIcon.getIconHeight());
    }
    
    public ScaledImageIcon(final ImageIcon imageIcon, final int iconWidth, final int iconHeight) {
        this.imageIcon = imageIcon;
        this.iconWidth = iconWidth;
        this.iconHeight = iconHeight;
    }
    
    @Override
    public int getIconWidth() {
        return UIScale.scale(this.iconWidth);
    }
    
    @Override
    public int getIconHeight() {
        return UIScale.scale(this.iconHeight);
    }
    
    @Override
    public void paintIcon(final Component c, final Graphics g, final int x, final int y) {
        final double systemScaleFactor = UIScale.getSystemScaleFactor((Graphics2D)g);
        final float userScaleFactor = UIScale.getUserScaleFactor();
        final double scaleFactor = systemScaleFactor * userScaleFactor;
        if (scaleFactor == 1.0 && this.iconWidth == this.imageIcon.getIconWidth() && this.iconHeight == this.imageIcon.getIconHeight()) {
            this.imageIcon.paintIcon(c, g, x, y);
            return;
        }
        if (systemScaleFactor == this.lastSystemScaleFactor && userScaleFactor == this.lastUserScaleFactor && this.lastImage != null) {
            this.paintLastImage(g, x, y);
            return;
        }
        final int destImageWidth = (int)Math.round(this.iconWidth * scaleFactor);
        final int destImageHeight = (int)Math.round(this.iconHeight * scaleFactor);
        Image image = this.getResolutionVariant(destImageWidth, destImageHeight);
        final int imageWidth = image.getWidth(null);
        final int imageHeight = image.getHeight(null);
        if (imageWidth != destImageWidth || imageHeight != destImageHeight) {
            Object scalingInterpolation = RenderingHints.VALUE_INTERPOLATION_BICUBIC;
            final float imageScaleFactor = destImageWidth / (float)imageWidth;
            if ((int)imageScaleFactor == imageScaleFactor && imageScaleFactor > 1.0f && imageWidth <= 16 && imageHeight <= 16) {
                scalingInterpolation = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
            }
            final BufferedImage bufferedImage = this.image2bufferedImage(image);
            image = this.scaleImage(bufferedImage, destImageWidth, destImageHeight, scalingInterpolation);
        }
        this.lastSystemScaleFactor = systemScaleFactor;
        this.lastUserScaleFactor = userScaleFactor;
        this.lastImage = image;
        this.paintLastImage(g, x, y);
    }
    
    protected Image getResolutionVariant(final int destImageWidth, final int destImageHeight) {
        return MultiResolutionImageSupport.getResolutionVariant(this.imageIcon.getImage(), destImageWidth, destImageHeight);
    }
    
    private void paintLastImage(final Graphics g, final int x, final int y) {
        if (this.lastSystemScaleFactor > 1.0) {
            HiDPIUtils.paintAtScale1x((Graphics2D)g, x, y, 100, 100, (g2, x2, y2, width2, height2, scaleFactor2) -> g2.drawImage(this.lastImage, x2, y2, null));
        }
        else {
            g.drawImage(this.lastImage, x, y, null);
        }
    }
    
    private BufferedImage scaleImage(final BufferedImage image, final int targetWidth, final int targetHeight, final Object scalingInterpolation) {
        final BufferedImage bufferedImage = new BufferedImage(targetWidth, targetHeight, 2);
        final Graphics2D g = bufferedImage.createGraphics();
        try {
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, scalingInterpolation);
            g.drawImage(image, 0, 0, targetWidth, targetHeight, null);
        }
        finally {
            g.dispose();
        }
        return bufferedImage;
    }
    
    private BufferedImage image2bufferedImage(final Image image) {
        if (image instanceof BufferedImage) {
            return (BufferedImage)image;
        }
        final BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), 2);
        final Graphics2D g = bufferedImage.createGraphics();
        try {
            g.drawImage(image, 0, 0, null);
        }
        finally {
            g.dispose();
        }
        return bufferedImage;
    }
}
