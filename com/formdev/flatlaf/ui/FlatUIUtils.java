// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.util.function.Consumer;
import java.awt.event.MouseAdapter;
import javax.swing.LookAndFeel;
import com.formdev.flatlaf.util.Graphics2DProxy;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Rectangle2D;
import java.awt.Shape;
import java.awt.geom.Path2D;
import com.formdev.flatlaf.util.HiDPIUtils;
import com.formdev.flatlaf.util.DerivedColor;
import java.awt.RenderingHints;
import java.awt.Graphics2D;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import com.formdev.flatlaf.util.UIScale;
import javax.swing.SwingUtilities;
import java.awt.KeyboardFocusManager;
import java.awt.Component;
import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JComponent;
import java.awt.Font;
import javax.swing.plaf.UIResource;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;

public class FlatUIUtils
{
    public static final boolean MAC_USE_QUARTZ;
    
    public static Rectangle addInsets(final Rectangle r, final Insets insets) {
        return new Rectangle(r.x - insets.left, r.y - insets.top, r.width + insets.left + insets.right, r.height + insets.top + insets.bottom);
    }
    
    public static Rectangle subtractInsets(final Rectangle r, final Insets insets) {
        return new Rectangle(r.x + insets.left, r.y + insets.top, r.width - insets.left - insets.right, r.height - insets.top - insets.bottom);
    }
    
    public static Dimension addInsets(final Dimension dim, final Insets insets) {
        return new Dimension(dim.width + insets.left + insets.right, dim.height + insets.top + insets.bottom);
    }
    
    public static Insets addInsets(final Insets insets1, final Insets insets2) {
        return new Insets(insets1.top + insets2.top, insets1.left + insets2.left, insets1.bottom + insets2.bottom, insets1.right + insets2.right);
    }
    
    public static void setInsets(final Insets dest, final Insets src) {
        dest.top = src.top;
        dest.left = src.left;
        dest.bottom = src.bottom;
        dest.right = src.right;
    }
    
    public static Color getUIColor(final String key, final int defaultColorRGB) {
        final Color color = UIManager.getColor(key);
        return (color != null) ? color : new Color(defaultColorRGB);
    }
    
    public static Color getUIColor(final String key, final Color defaultColor) {
        final Color color = UIManager.getColor(key);
        return (color != null) ? color : defaultColor;
    }
    
    public static Color getUIColor(final String key, final String defaultKey) {
        final Color color = UIManager.getColor(key);
        return (color != null) ? color : UIManager.getColor(defaultKey);
    }
    
    public static int getUIInt(final String key, final int defaultValue) {
        final Object value = UIManager.get(key);
        return (int)((value instanceof Integer) ? value : defaultValue);
    }
    
    public static float getUIFloat(final String key, final float defaultValue) {
        final Object value = UIManager.get(key);
        return (value instanceof Number) ? ((Number)value).floatValue() : defaultValue;
    }
    
    public static Color nonUIResource(final Color c) {
        return (c instanceof UIResource) ? new Color(c.getRGB(), true) : c;
    }
    
    public static Font nonUIResource(final Font font) {
        return (font instanceof UIResource) ? font.deriveFont(font.getStyle()) : font;
    }
    
    public static int minimumWidth(final JComponent c, final int minimumWidth) {
        return FlatClientProperties.clientPropertyInt(c, "JComponent.minimumWidth", minimumWidth);
    }
    
    public static int minimumHeight(final JComponent c, final int minimumHeight) {
        return FlatClientProperties.clientPropertyInt(c, "JComponent.minimumHeight", minimumHeight);
    }
    
    public static boolean isTableCellEditor(final Component c) {
        return c instanceof JComponent && Boolean.TRUE.equals(((JComponent)c).getClientProperty("JComboBox.isTableCellEditor"));
    }
    
    public static boolean isPermanentFocusOwner(final Component c) {
        final KeyboardFocusManager keyboardFocusManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        return keyboardFocusManager.getPermanentFocusOwner() == c && keyboardFocusManager.getActiveWindow() == SwingUtilities.windowForComponent(c);
    }
    
    public static boolean isRoundRect(final Component c) {
        return c instanceof JComponent && FlatClientProperties.clientPropertyBoolean((JComponent)c, "JComponent.roundRect", false);
    }
    
    public static float getBorderFocusWidth(final JComponent c) {
        final FlatBorder border = getOutsideFlatBorder(c);
        return (border != null) ? UIScale.scale((float)border.getFocusWidth(c)) : 0.0f;
    }
    
    public static float getBorderArc(final JComponent c) {
        final FlatBorder border = getOutsideFlatBorder(c);
        return (border != null) ? UIScale.scale((float)border.getArc(c)) : 0.0f;
    }
    
    public static boolean hasRoundBorder(final JComponent c) {
        return getBorderArc(c) >= c.getHeight();
    }
    
    public static FlatBorder getOutsideFlatBorder(final JComponent c) {
        Border border;
        for (border = c.getBorder(); !(border instanceof FlatBorder); border = ((CompoundBorder)border).getOutsideBorder()) {
            if (!(border instanceof CompoundBorder)) {
                return null;
            }
        }
        return (FlatBorder)border;
    }
    
    public static void setRenderingHints(final Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, FlatUIUtils.MAC_USE_QUARTZ ? RenderingHints.VALUE_STROKE_PURE : RenderingHints.VALUE_STROKE_NORMALIZE);
    }
    
    public static Color deriveColor(final Color color, final Color baseColor) {
        return (color instanceof DerivedColor) ? ((DerivedColor)color).derive(baseColor) : color;
    }
    
    public static void paintComponentOuterBorder(final Graphics2D g, final int x, final int y, final int width, final int height, final float focusWidth, final float lineWidth, final float arc) {
        final double systemScaleFactor = UIScale.getSystemScaleFactor(g);
        if (systemScaleFactor != 1.0 && systemScaleFactor != 2.0) {
            HiDPIUtils.paintAtScale1x(g, x, y, width, height, (g2d, x2, y2, width2, height2, scaleFactor) -> paintComponentOuterBorderImpl(g2d, x2, y2, width2, height2, (float)(focusWidth * scaleFactor), (float)(lineWidth * scaleFactor), (float)(arc * scaleFactor)));
            return;
        }
        paintComponentOuterBorderImpl(g, x, y, width, height, focusWidth, lineWidth, arc);
    }
    
    private static void paintComponentOuterBorderImpl(final Graphics2D g, final int x, final int y, final int width, final int height, final float focusWidth, final float lineWidth, final float arc) {
        final float ow = focusWidth + lineWidth;
        float outerArc = arc + focusWidth * 2.0f;
        final float innerArc = arc - lineWidth * 2.0f;
        if (arc > 0.0f && arc < UIScale.scale(10)) {
            outerArc -= UIScale.scale(2.0f);
        }
        final Path2D path = new Path2D.Float(0);
        path.append(createComponentRectangle((float)x, (float)y, (float)width, (float)height, outerArc), false);
        path.append(createComponentRectangle(x + ow, y + ow, width - ow * 2.0f, height - ow * 2.0f, innerArc), false);
        g.fill(path);
    }
    
    public static void paintComponentBorder(final Graphics2D g, final int x, final int y, final int width, final int height, final float focusWidth, final float lineWidth, final float arc) {
        final double systemScaleFactor = UIScale.getSystemScaleFactor(g);
        if (systemScaleFactor != 1.0 && systemScaleFactor != 2.0) {
            HiDPIUtils.paintAtScale1x(g, x, y, width, height, (g2d, x2, y2, width2, height2, scaleFactor) -> paintComponentBorderImpl(g2d, x2, y2, width2, height2, (float)(focusWidth * scaleFactor), (float)(lineWidth * scaleFactor), (float)(arc * scaleFactor)));
            return;
        }
        paintComponentBorderImpl(g, x, y, width, height, focusWidth, lineWidth, arc);
    }
    
    private static void paintComponentBorderImpl(final Graphics2D g, final int x, final int y, final int width, final int height, final float focusWidth, final float lineWidth, final float arc) {
        final float x2 = x + focusWidth;
        final float y2 = y + focusWidth;
        final float width2 = width - focusWidth * 2.0f;
        final float height2 = height - focusWidth * 2.0f;
        final float arc2 = arc - lineWidth * 2.0f;
        final Shape r1 = createComponentRectangle(x2, y2, width2, height2, arc);
        final Shape r2 = createComponentRectangle(x2 + lineWidth, y2 + lineWidth, width2 - lineWidth * 2.0f, height2 - lineWidth * 2.0f, arc2);
        final Path2D border = new Path2D.Float(0);
        border.append(r1, false);
        border.append(r2, false);
        g.fill(border);
    }
    
    public static void paintComponentBackground(final Graphics2D g, final int x, final int y, final int width, final int height, final float focusWidth, final float arc) {
        final double systemScaleFactor = UIScale.getSystemScaleFactor(g);
        if (systemScaleFactor != 1.0 && systemScaleFactor != 2.0) {
            HiDPIUtils.paintAtScale1x(g, x, y, width, height, (g2d, x2, y2, width2, height2, scaleFactor) -> paintComponentBackgroundImpl(g2d, x2, y2, width2, height2, (float)(focusWidth * scaleFactor), (float)(arc * scaleFactor)));
            return;
        }
        paintComponentBackgroundImpl(g, x, y, width, height, focusWidth, arc);
    }
    
    private static void paintComponentBackgroundImpl(final Graphics2D g, final int x, final int y, final int width, final int height, final float focusWidth, final float arc) {
        g.fill(createComponentRectangle(x + focusWidth, y + focusWidth, width - focusWidth * 2.0f, height - focusWidth * 2.0f, arc));
    }
    
    public static Shape createComponentRectangle(final float x, final float y, final float w, final float h, float arc) {
        if (arc <= 0.0f) {
            return new Rectangle2D.Float(x, y, w, h);
        }
        arc = Math.min(arc, Math.min(w, h));
        return new RoundRectangle2D.Float(x, y, w, h, arc, arc);
    }
    
    public static void paintParentBackground(final Graphics g, final JComponent c) {
        final Container parent = findOpaqueParent(c);
        if (parent != null) {
            g.setColor(parent.getBackground());
            g.fillRect(0, 0, c.getWidth(), c.getHeight());
        }
    }
    
    public static Color getParentBackground(final JComponent c) {
        final Container parent = findOpaqueParent(c);
        return (parent != null) ? parent.getBackground() : UIManager.getColor("Panel.background");
    }
    
    private static Container findOpaqueParent(Container c) {
        while ((c = c.getParent()) != null) {
            if (c.isOpaque()) {
                return c;
            }
        }
        return null;
    }
    
    public static Path2D createRectangle(final float x, final float y, final float width, final float height, final float lineWidth) {
        final Path2D path = new Path2D.Float(0);
        path.append(new Rectangle2D.Float(x, y, width, height), false);
        path.append(new Rectangle2D.Float(x + lineWidth, y + lineWidth, width - lineWidth * 2.0f, height - lineWidth * 2.0f), false);
        return path;
    }
    
    public static Path2D createRoundRectangle(final float x, final float y, final float width, final float height, final float lineWidth, final float arcTopLeft, final float arcTopRight, final float arcBottomLeft, final float arcBottomRight) {
        final Path2D path = new Path2D.Float(0);
        path.append(createRoundRectanglePath(x, y, width, height, arcTopLeft, arcTopRight, arcBottomLeft, arcBottomRight), false);
        path.append(createRoundRectanglePath(x + lineWidth, y + lineWidth, width - lineWidth * 2.0f, height - lineWidth * 2.0f, arcTopLeft - lineWidth, arcTopRight - lineWidth, arcBottomLeft - lineWidth, arcBottomRight - lineWidth), false);
        return path;
    }
    
    public static Shape createRoundRectanglePath(final float x, final float y, final float width, final float height, float arcTopLeft, float arcTopRight, float arcBottomLeft, float arcBottomRight) {
        if (arcTopLeft <= 0.0f && arcTopRight <= 0.0f && arcBottomLeft <= 0.0f && arcBottomRight <= 0.0f) {
            return new Rectangle2D.Float(x, y, width, height);
        }
        final float maxArc = Math.min(width, height) / 2.0f;
        arcTopLeft = ((arcTopLeft > 0.0f) ? Math.min(arcTopLeft, maxArc) : 0.0f);
        arcTopRight = ((arcTopRight > 0.0f) ? Math.min(arcTopRight, maxArc) : 0.0f);
        arcBottomLeft = ((arcBottomLeft > 0.0f) ? Math.min(arcBottomLeft, maxArc) : 0.0f);
        arcBottomRight = ((arcBottomRight > 0.0f) ? Math.min(arcBottomRight, maxArc) : 0.0f);
        final float x2 = x + width;
        final float y2 = y + height;
        final Path2D rect = new Path2D.Float();
        rect.moveTo(x2 - arcTopRight, y);
        rect.quadTo(x2, y, x2, y + arcTopRight);
        rect.lineTo(x2, y2 - arcBottomRight);
        rect.quadTo(x2, y2, x2 - arcBottomRight, y2);
        rect.lineTo(x + arcBottomLeft, y2);
        rect.quadTo(x, y2, x, y2 - arcBottomLeft);
        rect.lineTo(x, y + arcTopLeft);
        rect.quadTo(x, y, x + arcTopLeft, y);
        rect.closePath();
        return rect;
    }
    
    public static Path2D createPath(final double... points) {
        return createPath(true, points);
    }
    
    public static Path2D createPath(final boolean close, final double... points) {
        final Path2D path = new Path2D.Float();
        path.moveTo(points[0], points[1]);
        for (int i = 2; i < points.length; i += 2) {
            path.lineTo(points[i], points[i + 1]);
        }
        if (close) {
            path.closePath();
        }
        return path;
    }
    
    public static void drawString(final JComponent c, final Graphics g, final String text, final int x, final int y) {
        HiDPIUtils.drawStringWithYCorrection(c, (Graphics2D)g, text, x, y);
    }
    
    public static void drawStringUnderlineCharAt(final JComponent c, Graphics g, final String text, final int underlinedIndex, final int x, final int y) {
        if (underlinedIndex >= 0 && UIScale.getUserScaleFactor() > 1.0f) {
            g = new Graphics2DProxy((Graphics2D)g) {
                @Override
                public void fillRect(final int x, int y, final int width, int height) {
                    if (height == 1) {
                        height = Math.round(UIScale.scale(0.9f));
                        y += height - 1;
                    }
                    super.fillRect(x, y, width, height);
                }
            };
        }
        HiDPIUtils.drawStringUnderlineCharAtWithYCorrection(c, (Graphics2D)g, text, underlinedIndex, x, y);
    }
    
    public static boolean hasOpaqueBeenExplicitlySet(final JComponent c) {
        final boolean oldOpaque = c.isOpaque();
        LookAndFeel.installProperty(c, "opaque", !oldOpaque);
        final boolean explicitlySet = c.isOpaque() == oldOpaque;
        LookAndFeel.installProperty(c, "opaque", oldOpaque);
        return explicitlySet;
    }
    
    static {
        MAC_USE_QUARTZ = Boolean.getBoolean("apple.awt.graphics.UseQuartz");
    }
    
    public static class HoverListener extends MouseAdapter
    {
        private final Component repaintComponent;
        private final Consumer<Boolean> hoverChanged;
        
        public HoverListener(final Component repaintComponent, final Consumer<Boolean> hoverChanged) {
            this.repaintComponent = repaintComponent;
            this.hoverChanged = hoverChanged;
        }
        
        @Override
        public void mouseEntered(final MouseEvent e) {
            this.hoverChanged.accept(true);
            this.repaint();
        }
        
        @Override
        public void mouseExited(final MouseEvent e) {
            this.hoverChanged.accept(false);
            this.repaint();
        }
        
        private void repaint() {
            if (this.repaintComponent != null && this.repaintComponent.isEnabled()) {
                this.repaintComponent.repaint();
            }
        }
    }
    
    public static class RepaintFocusListener implements FocusListener
    {
        private final Component repaintComponent;
        
        public RepaintFocusListener(final Component repaintComponent) {
            this.repaintComponent = repaintComponent;
        }
        
        @Override
        public void focusGained(final FocusEvent e) {
            this.repaintComponent.repaint();
        }
        
        @Override
        public void focusLost(final FocusEvent e) {
            this.repaintComponent.repaint();
        }
    }
}
