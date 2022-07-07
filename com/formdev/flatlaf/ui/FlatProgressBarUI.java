// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.beans.PropertyChangeEvent;
import com.formdev.flatlaf.util.HiDPIUtils;
import java.awt.geom.Area;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.Graphics2D;
import java.awt.Graphics;
import com.formdev.flatlaf.util.UIScale;
import java.awt.FontMetrics;
import java.awt.Insets;
import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.UIManager;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import java.beans.PropertyChangeListener;
import java.awt.Dimension;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class FlatProgressBarUI extends BasicProgressBarUI
{
    protected int arc;
    protected Dimension horizontalSize;
    protected Dimension verticalSize;
    private PropertyChangeListener propertyChangeListener;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatProgressBarUI();
    }
    
    @Override
    protected void installDefaults() {
        super.installDefaults();
        LookAndFeel.installProperty(this.progressBar, "opaque", false);
        this.arc = UIManager.getInt("ProgressBar.arc");
        this.horizontalSize = UIManager.getDimension("ProgressBar.horizontalSize");
        this.verticalSize = UIManager.getDimension("ProgressBar.verticalSize");
    }
    
    @Override
    protected void installListeners() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   javax/swing/plaf/basic/BasicProgressBarUI.installListeners:()V
        //     4: aload_0         /* this */
        //     5: aload_0         /* this */
        //     6: invokedynamic   BootstrapMethod #0, propertyChange:(Lcom/formdev/flatlaf/ui/FlatProgressBarUI;)Ljava/beans/PropertyChangeListener;
        //    11: putfield        com/formdev/flatlaf/ui/FlatProgressBarUI.propertyChangeListener:Ljava/beans/PropertyChangeListener;
        //    14: aload_0         /* this */
        //    15: getfield        com/formdev/flatlaf/ui/FlatProgressBarUI.progressBar:Ljavax/swing/JProgressBar;
        //    18: aload_0         /* this */
        //    19: getfield        com/formdev/flatlaf/ui/FlatProgressBarUI.propertyChangeListener:Ljava/beans/PropertyChangeListener;
        //    22: invokevirtual   javax/swing/JProgressBar.addPropertyChangeListener:(Ljava/beans/PropertyChangeListener;)V
        //    25: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.NameVariables.generateNameForVariable(NameVariables.java:264)
        //     at com.strobel.decompiler.languages.java.ast.NameVariables.assignNamesToVariables(NameVariables.java:198)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:276)
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
    
    @Override
    protected void uninstallListeners() {
        super.uninstallListeners();
        this.progressBar.removePropertyChangeListener(this.propertyChangeListener);
        this.propertyChangeListener = null;
    }
    
    @Override
    public Dimension getPreferredSize(final JComponent c) {
        final Dimension size = super.getPreferredSize(c);
        if (this.progressBar.isStringPainted() || FlatClientProperties.clientPropertyBoolean(c, "JProgressBar.largeHeight", false)) {
            final Insets insets = this.progressBar.getInsets();
            final FontMetrics fm = this.progressBar.getFontMetrics(this.progressBar.getFont());
            if (this.progressBar.getOrientation() == 0) {
                size.height = Math.max(fm.getHeight() + insets.top + insets.bottom, this.getPreferredInnerHorizontal().height);
            }
            else {
                size.width = Math.max(fm.getHeight() + insets.left + insets.right, this.getPreferredInnerVertical().width);
            }
        }
        return size;
    }
    
    @Override
    protected Dimension getPreferredInnerHorizontal() {
        return UIScale.scale(this.horizontalSize);
    }
    
    @Override
    protected Dimension getPreferredInnerVertical() {
        return UIScale.scale(this.verticalSize);
    }
    
    @Override
    public void update(final Graphics g, final JComponent c) {
        if (c.isOpaque()) {
            FlatUIUtils.paintParentBackground(g, c);
        }
        this.paint(g, c);
    }
    
    @Override
    public void paint(final Graphics g, final JComponent c) {
        final Insets insets = this.progressBar.getInsets();
        final int x = insets.left;
        final int y = insets.top;
        final int width = this.progressBar.getWidth() - (insets.right + insets.left);
        final int height = this.progressBar.getHeight() - (insets.top + insets.bottom);
        if (width <= 0 || height <= 0) {
            return;
        }
        final boolean horizontal = this.progressBar.getOrientation() == 0;
        final int arc = FlatClientProperties.clientPropertyBoolean(c, "JProgressBar.square", false) ? 0 : Math.min(UIScale.scale(this.arc), horizontal ? height : width);
        FlatUIUtils.setRenderingHints((Graphics2D)g);
        final RoundRectangle2D.Float trackShape = new RoundRectangle2D.Float((float)x, (float)y, (float)width, (float)height, (float)arc, (float)arc);
        g.setColor(this.progressBar.getBackground());
        ((Graphics2D)g).fill(trackShape);
        if (this.progressBar.isIndeterminate()) {
            this.boxRect = this.getBox(this.boxRect);
            if (this.boxRect != null) {
                g.setColor(this.progressBar.getForeground());
                ((Graphics2D)g).fill(new RoundRectangle2D.Float((float)this.boxRect.x, (float)this.boxRect.y, (float)this.boxRect.width, (float)this.boxRect.height, (float)arc, (float)arc));
            }
            if (this.progressBar.isStringPainted()) {
                this.paintString(g, x, y, width, height, 0, insets);
            }
        }
        else {
            final int amountFull = this.getAmountFull(insets, width, height);
            final RoundRectangle2D.Float progressShape = horizontal ? new RoundRectangle2D.Float(c.getComponentOrientation().isLeftToRight() ? ((float)x) : ((float)(x + (width - amountFull))), (float)y, (float)amountFull, (float)height, (float)arc, (float)arc) : new RoundRectangle2D.Float((float)x, (float)(y + (height - amountFull)), (float)width, (float)amountFull, (float)arc, (float)arc);
            g.setColor(this.progressBar.getForeground());
            if (amountFull < (horizontal ? height : width)) {
                final Area area = new Area(trackShape);
                area.intersect(new Area(progressShape));
                ((Graphics2D)g).fill(area);
            }
            else {
                ((Graphics2D)g).fill(progressShape);
            }
            if (this.progressBar.isStringPainted()) {
                this.paintString(g, x, y, width, height, amountFull, insets);
            }
        }
    }
    
    @Override
    protected void paintString(final Graphics g, final int x, final int y, final int width, final int height, final int amountFull, final Insets b) {
        super.paintString(HiDPIUtils.createGraphicsTextYCorrection((Graphics2D)g), x, y, width, height, amountFull, b);
    }
    
    @Override
    protected void setAnimationIndex(final int newValue) {
        super.setAnimationIndex(newValue);
        final double systemScaleFactor = UIScale.getSystemScaleFactor(this.progressBar.getGraphicsConfiguration());
        if ((int)systemScaleFactor != systemScaleFactor) {
            this.progressBar.repaint();
        }
    }
}
