// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import javax.swing.ImageIcon;
import java.util.Iterator;
import java.awt.image.ImageObserver;
import java.util.Collection;
import com.formdev.flatlaf.util.MultiResolutionImageSupport;
import java.util.ArrayList;
import javax.swing.Icon;
import java.awt.Dimension;
import java.awt.Image;
import java.util.List;
import com.formdev.flatlaf.util.ScaledImageIcon;

public class FlatTitlePaneIcon extends ScaledImageIcon
{
    private final List<Image> images;
    
    public static Icon create(final List<Image> images, final Dimension size) {
        final List<Image> allImages = new ArrayList<Image>();
        for (final Image image3 : images) {
            if (MultiResolutionImageSupport.isMultiResolutionImage(image3)) {
                allImages.addAll(MultiResolutionImageSupport.getResolutionVariants(image3));
            }
            else {
                allImages.add(image3);
            }
        }
        allImages.sort((image1, image2) -> image1.getWidth(null) - image2.getWidth(null));
        return new FlatTitlePaneIcon(allImages, size);
    }
    
    private FlatTitlePaneIcon(final List<Image> images, final Dimension size) {
        super(new ImageIcon(images.get(0)), size.width, size.height);
        this.images = images;
    }
    
    @Override
    protected Image getResolutionVariant(final int destImageWidth, final int destImageHeight) {
        for (final Image image : this.images) {
            if (destImageWidth <= image.getWidth(null) && destImageHeight <= image.getHeight(null)) {
                return image;
            }
        }
        return this.images.get(this.images.size() - 1);
    }
}
