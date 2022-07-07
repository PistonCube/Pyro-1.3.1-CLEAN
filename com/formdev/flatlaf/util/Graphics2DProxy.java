// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.util;

import java.awt.font.FontRenderContext;
import java.util.Map;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Paint;
import java.awt.Composite;
import java.awt.GraphicsConfiguration;
import java.awt.font.GlyphVector;
import java.text.AttributedCharacterIterator;
import java.awt.image.renderable.RenderableImage;
import java.awt.image.RenderedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.BufferedImage;
import java.awt.geom.AffineTransform;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Rectangle;
import java.awt.FontMetrics;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Graphics2DProxy extends Graphics2D
{
    private final Graphics2D delegate;
    
    public Graphics2DProxy(final Graphics2D delegate) {
        this.delegate = delegate;
    }
    
    @Override
    public Graphics create() {
        return this.delegate.create();
    }
    
    @Override
    public Graphics create(final int x, final int y, final int width, final int height) {
        return this.delegate.create(x, y, width, height);
    }
    
    @Override
    public Color getColor() {
        return this.delegate.getColor();
    }
    
    @Override
    public void setColor(final Color c) {
        this.delegate.setColor(c);
    }
    
    @Override
    public void setPaintMode() {
        this.delegate.setPaintMode();
    }
    
    @Override
    public void setXORMode(final Color c1) {
        this.delegate.setXORMode(c1);
    }
    
    @Override
    public Font getFont() {
        return this.delegate.getFont();
    }
    
    @Override
    public void setFont(final Font font) {
        this.delegate.setFont(font);
    }
    
    @Override
    public FontMetrics getFontMetrics() {
        return this.delegate.getFontMetrics();
    }
    
    @Override
    public FontMetrics getFontMetrics(final Font f) {
        return this.delegate.getFontMetrics(f);
    }
    
    @Override
    public Rectangle getClipBounds() {
        return this.delegate.getClipBounds();
    }
    
    @Override
    public void clipRect(final int x, final int y, final int width, final int height) {
        this.delegate.clipRect(x, y, width, height);
    }
    
    @Override
    public void setClip(final int x, final int y, final int width, final int height) {
        this.delegate.setClip(x, y, width, height);
    }
    
    @Override
    public Shape getClip() {
        return this.delegate.getClip();
    }
    
    @Override
    public void setClip(final Shape clip) {
        this.delegate.setClip(clip);
    }
    
    @Override
    public void copyArea(final int x, final int y, final int width, final int height, final int dx, final int dy) {
        this.delegate.copyArea(x, y, width, height, dx, dy);
    }
    
    @Override
    public void drawLine(final int x1, final int y1, final int x2, final int y2) {
        this.delegate.drawLine(x1, y1, x2, y2);
    }
    
    @Override
    public void fillRect(final int x, final int y, final int width, final int height) {
        this.delegate.fillRect(x, y, width, height);
    }
    
    @Override
    public void drawRect(final int x, final int y, final int width, final int height) {
        this.delegate.drawRect(x, y, width, height);
    }
    
    @Override
    public void clearRect(final int x, final int y, final int width, final int height) {
        this.delegate.clearRect(x, y, width, height);
    }
    
    @Override
    public void drawRoundRect(final int x, final int y, final int width, final int height, final int arcWidth, final int arcHeight) {
        this.delegate.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
    }
    
    @Override
    public void fillRoundRect(final int x, final int y, final int width, final int height, final int arcWidth, final int arcHeight) {
        this.delegate.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
    }
    
    @Override
    public void drawOval(final int x, final int y, final int width, final int height) {
        this.delegate.drawOval(x, y, width, height);
    }
    
    @Override
    public void fillOval(final int x, final int y, final int width, final int height) {
        this.delegate.fillOval(x, y, width, height);
    }
    
    @Override
    public void drawArc(final int x, final int y, final int width, final int height, final int startAngle, final int arcAngle) {
        this.delegate.drawArc(x, y, width, height, startAngle, arcAngle);
    }
    
    @Override
    public void fillArc(final int x, final int y, final int width, final int height, final int startAngle, final int arcAngle) {
        this.delegate.fillArc(x, y, width, height, startAngle, arcAngle);
    }
    
    @Override
    public void drawPolyline(final int[] xPoints, final int[] yPoints, final int nPoints) {
        this.delegate.drawPolyline(xPoints, yPoints, nPoints);
    }
    
    @Override
    public void drawPolygon(final int[] xPoints, final int[] yPoints, final int nPoints) {
        this.delegate.drawPolygon(xPoints, yPoints, nPoints);
    }
    
    @Override
    public void drawPolygon(final Polygon p) {
        this.delegate.drawPolygon(p);
    }
    
    @Override
    public void fillPolygon(final int[] xPoints, final int[] yPoints, final int nPoints) {
        this.delegate.fillPolygon(xPoints, yPoints, nPoints);
    }
    
    @Override
    public void fillPolygon(final Polygon p) {
        this.delegate.fillPolygon(p);
    }
    
    @Override
    public void drawChars(final char[] data, final int offset, final int length, final int x, final int y) {
        this.delegate.drawChars(data, offset, length, x, y);
    }
    
    @Override
    public void drawBytes(final byte[] data, final int offset, final int length, final int x, final int y) {
        this.delegate.drawBytes(data, offset, length, x, y);
    }
    
    @Override
    public boolean drawImage(final Image img, final int x, final int y, final ImageObserver observer) {
        return this.delegate.drawImage(img, x, y, observer);
    }
    
    @Override
    public boolean drawImage(final Image img, final int x, final int y, final int width, final int height, final ImageObserver observer) {
        return this.delegate.drawImage(img, x, y, width, height, observer);
    }
    
    @Override
    public boolean drawImage(final Image img, final int x, final int y, final Color bgcolor, final ImageObserver observer) {
        return this.delegate.drawImage(img, x, y, bgcolor, observer);
    }
    
    @Override
    public boolean drawImage(final Image img, final int x, final int y, final int width, final int height, final Color bgcolor, final ImageObserver observer) {
        return this.delegate.drawImage(img, x, y, width, height, bgcolor, observer);
    }
    
    @Override
    public boolean drawImage(final Image img, final int dx1, final int dy1, final int dx2, final int dy2, final int sx1, final int sy1, final int sx2, final int sy2, final ImageObserver observer) {
        return this.delegate.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, observer);
    }
    
    @Override
    public boolean drawImage(final Image img, final int dx1, final int dy1, final int dx2, final int dy2, final int sx1, final int sy1, final int sx2, final int sy2, final Color bgcolor, final ImageObserver observer) {
        return this.delegate.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, bgcolor, observer);
    }
    
    @Override
    public void dispose() {
        this.delegate.dispose();
    }
    
    @Override
    public void finalize() {
        this.delegate.finalize();
    }
    
    @Override
    public String toString() {
        return this.delegate.toString();
    }
    
    @Override
    public Rectangle getClipRect() {
        return this.delegate.getClipRect();
    }
    
    @Override
    public boolean hitClip(final int x, final int y, final int width, final int height) {
        return this.delegate.hitClip(x, y, width, height);
    }
    
    @Override
    public Rectangle getClipBounds(final Rectangle r) {
        return this.delegate.getClipBounds(r);
    }
    
    @Override
    public void draw3DRect(final int x, final int y, final int width, final int height, final boolean raised) {
        this.delegate.draw3DRect(x, y, width, height, raised);
    }
    
    @Override
    public void fill3DRect(final int x, final int y, final int width, final int height, final boolean raised) {
        this.delegate.fill3DRect(x, y, width, height, raised);
    }
    
    @Override
    public void draw(final Shape s) {
        this.delegate.draw(s);
    }
    
    @Override
    public boolean drawImage(final Image img, final AffineTransform xform, final ImageObserver obs) {
        return this.delegate.drawImage(img, xform, obs);
    }
    
    @Override
    public void drawImage(final BufferedImage img, final BufferedImageOp op, final int x, final int y) {
        this.delegate.drawImage(img, op, x, y);
    }
    
    @Override
    public void drawRenderedImage(final RenderedImage img, final AffineTransform xform) {
        this.delegate.drawRenderedImage(img, xform);
    }
    
    @Override
    public void drawRenderableImage(final RenderableImage img, final AffineTransform xform) {
        this.delegate.drawRenderableImage(img, xform);
    }
    
    @Override
    public void drawString(final String str, final int x, final int y) {
        this.delegate.drawString(str, x, y);
    }
    
    @Override
    public void drawString(final String str, final float x, final float y) {
        this.delegate.drawString(str, x, y);
    }
    
    @Override
    public void drawString(final AttributedCharacterIterator iterator, final int x, final int y) {
        this.delegate.drawString(iterator, x, y);
    }
    
    @Override
    public void drawString(final AttributedCharacterIterator iterator, final float x, final float y) {
        this.delegate.drawString(iterator, x, y);
    }
    
    @Override
    public void drawGlyphVector(final GlyphVector g, final float x, final float y) {
        this.delegate.drawGlyphVector(g, x, y);
    }
    
    @Override
    public void fill(final Shape s) {
        this.delegate.fill(s);
    }
    
    @Override
    public boolean hit(final Rectangle rect, final Shape s, final boolean onStroke) {
        return this.delegate.hit(rect, s, onStroke);
    }
    
    @Override
    public GraphicsConfiguration getDeviceConfiguration() {
        return this.delegate.getDeviceConfiguration();
    }
    
    @Override
    public void setComposite(final Composite comp) {
        this.delegate.setComposite(comp);
    }
    
    @Override
    public void setPaint(final Paint paint) {
        this.delegate.setPaint(paint);
    }
    
    @Override
    public void setStroke(final Stroke s) {
        this.delegate.setStroke(s);
    }
    
    @Override
    public void setRenderingHint(final RenderingHints.Key hintKey, final Object hintValue) {
        this.delegate.setRenderingHint(hintKey, hintValue);
    }
    
    @Override
    public Object getRenderingHint(final RenderingHints.Key hintKey) {
        return this.delegate.getRenderingHint(hintKey);
    }
    
    @Override
    public void setRenderingHints(final Map<?, ?> hints) {
        this.delegate.setRenderingHints(hints);
    }
    
    @Override
    public void addRenderingHints(final Map<?, ?> hints) {
        this.delegate.addRenderingHints(hints);
    }
    
    @Override
    public RenderingHints getRenderingHints() {
        return this.delegate.getRenderingHints();
    }
    
    @Override
    public void translate(final int x, final int y) {
        this.delegate.translate(x, y);
    }
    
    @Override
    public void translate(final double tx, final double ty) {
        this.delegate.translate(tx, ty);
    }
    
    @Override
    public void rotate(final double theta) {
        this.delegate.rotate(theta);
    }
    
    @Override
    public void rotate(final double theta, final double x, final double y) {
        this.delegate.rotate(theta, x, y);
    }
    
    @Override
    public void scale(final double sx, final double sy) {
        this.delegate.scale(sx, sy);
    }
    
    @Override
    public void shear(final double shx, final double shy) {
        this.delegate.shear(shx, shy);
    }
    
    @Override
    public void transform(final AffineTransform Tx) {
        this.delegate.transform(Tx);
    }
    
    @Override
    public void setTransform(final AffineTransform Tx) {
        this.delegate.setTransform(Tx);
    }
    
    @Override
    public AffineTransform getTransform() {
        return this.delegate.getTransform();
    }
    
    @Override
    public Paint getPaint() {
        return this.delegate.getPaint();
    }
    
    @Override
    public Composite getComposite() {
        return this.delegate.getComposite();
    }
    
    @Override
    public void setBackground(final Color color) {
        this.delegate.setBackground(color);
    }
    
    @Override
    public Color getBackground() {
        return this.delegate.getBackground();
    }
    
    @Override
    public Stroke getStroke() {
        return this.delegate.getStroke();
    }
    
    @Override
    public void clip(final Shape s) {
        this.delegate.clip(s);
    }
    
    @Override
    public FontRenderContext getFontRenderContext() {
        return this.delegate.getFontRenderContext();
    }
}
