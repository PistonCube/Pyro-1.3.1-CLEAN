// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.plaf.UIResource;
import javax.swing.border.Border;
import java.awt.Container;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Component;
import javax.swing.table.TableCellRenderer;
import java.awt.Graphics;
import java.util.Objects;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import java.awt.Color;
import javax.swing.plaf.basic.BasicTableHeaderUI;

public class FlatTableHeaderUI extends BasicTableHeaderUI
{
    protected Color separatorColor;
    protected Color bottomSeparatorColor;
    protected int height;
    protected int sortIconPosition;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatTableHeaderUI();
    }
    
    @Override
    protected void installDefaults() {
        super.installDefaults();
        this.separatorColor = UIManager.getColor("TableHeader.separatorColor");
        this.bottomSeparatorColor = UIManager.getColor("TableHeader.bottomSeparatorColor");
        this.height = UIManager.getInt("TableHeader.height");
        final String string = Objects.toString(UIManager.getString("TableHeader.sortIconPosition"), "right");
        switch (string) {
            default: {
                this.sortIconPosition = 4;
                break;
            }
            case "left": {
                this.sortIconPosition = 2;
                break;
            }
            case "top": {
                this.sortIconPosition = 1;
                break;
            }
            case "bottom": {
                this.sortIconPosition = 3;
                break;
            }
        }
    }
    
    @Override
    protected void uninstallDefaults() {
        super.uninstallDefaults();
        this.separatorColor = null;
        this.bottomSeparatorColor = null;
    }
    
    @Override
    public void paint(final Graphics g, final JComponent c) {
        final TableCellRenderer defaultRenderer = this.header.getDefaultRenderer();
        boolean paintBorders = this.isSystemDefaultRenderer(defaultRenderer);
        if (!paintBorders && this.header.getColumnModel().getColumnCount() > 0) {
            final Component rendererComponent = defaultRenderer.getTableCellRendererComponent(this.header.getTable(), "", false, false, -1, 0);
            paintBorders = this.isSystemDefaultRenderer(rendererComponent);
        }
        if (paintBorders) {
            this.paintColumnBorders(g, c);
        }
        FlatTableCellHeaderRenderer sortIconRenderer = null;
        if (this.sortIconPosition != 4) {
            sortIconRenderer = new FlatTableCellHeaderRenderer(this.header.getDefaultRenderer());
            this.header.setDefaultRenderer(sortIconRenderer);
        }
        super.paint(g, c);
        if (sortIconRenderer != null) {
            sortIconRenderer.reset();
            this.header.setDefaultRenderer(sortIconRenderer.delegate);
        }
        if (paintBorders) {
            this.paintDraggedColumnBorders(g, c);
        }
    }
    
    private boolean isSystemDefaultRenderer(final Object headerRenderer) {
        final String rendererClassName = headerRenderer.getClass().getName();
        return rendererClassName.equals("sun.swing.table.DefaultTableCellHeaderRenderer") || rendererClassName.equals("sun.swing.FilePane$AlignableTableHeaderRenderer");
    }
    
    private void paintColumnBorders(final Graphics g, final JComponent c) {
        final int width = c.getWidth();
        final int height = c.getHeight();
        final float topLineIndent;
        final float lineWidth = topLineIndent = UIScale.scale(1.0f);
        final float bottomLineIndent = lineWidth * 3.0f;
        final TableColumnModel columnModel = this.header.getColumnModel();
        final int columnCount = columnModel.getColumnCount();
        final Graphics2D g2 = (Graphics2D)g.create();
        try {
            FlatUIUtils.setRenderingHints(g2);
            g2.setColor(this.bottomSeparatorColor);
            g2.fill(new Rectangle2D.Float(0.0f, height - lineWidth, (float)width, lineWidth));
            g2.setColor(this.separatorColor);
            int sepCount = columnCount;
            if (this.header.getTable().getAutoResizeMode() != 0 && !this.isVerticalScrollBarVisible()) {
                --sepCount;
            }
            if (this.header.getComponentOrientation().isLeftToRight()) {
                int x = 0;
                for (int i = 0; i < sepCount; ++i) {
                    x += columnModel.getColumn(i).getWidth();
                    g2.fill(new Rectangle2D.Float(x - lineWidth, topLineIndent, lineWidth, height - bottomLineIndent));
                }
            }
            else {
                int x = width;
                for (int i = 0; i < sepCount; ++i) {
                    x -= columnModel.getColumn(i).getWidth();
                    g2.fill(new Rectangle2D.Float(x - ((i < sepCount - 1) ? lineWidth : 0.0f), topLineIndent, lineWidth, height - bottomLineIndent));
                }
            }
        }
        finally {
            g2.dispose();
        }
    }
    
    private void paintDraggedColumnBorders(final Graphics g, final JComponent c) {
        final TableColumn draggedColumn = this.header.getDraggedColumn();
        if (draggedColumn == null) {
            return;
        }
        final TableColumnModel columnModel = this.header.getColumnModel();
        final int columnCount = columnModel.getColumnCount();
        int draggedColumnIndex = -1;
        for (int i = 0; i < columnCount; ++i) {
            if (columnModel.getColumn(i) == draggedColumn) {
                draggedColumnIndex = i;
                break;
            }
        }
        if (draggedColumnIndex < 0) {
            return;
        }
        final float topLineIndent;
        final float lineWidth = topLineIndent = UIScale.scale(1.0f);
        final float bottomLineIndent = lineWidth * 3.0f;
        final Rectangle headerRect;
        final Rectangle r = headerRect = this.header.getHeaderRect(draggedColumnIndex);
        headerRect.x += this.header.getDraggedDistance();
        final Graphics2D g2 = (Graphics2D)g.create();
        try {
            FlatUIUtils.setRenderingHints(g2);
            g2.setColor(this.bottomSeparatorColor);
            g2.fill(new Rectangle2D.Float((float)r.x, r.y + r.height - lineWidth, (float)r.width, lineWidth));
            g2.setColor(this.separatorColor);
            g2.fill(new Rectangle2D.Float((float)r.x, topLineIndent, lineWidth, r.height - bottomLineIndent));
            g2.fill(new Rectangle2D.Float(r.x + r.width - lineWidth, r.y + topLineIndent, lineWidth, r.height - bottomLineIndent));
        }
        finally {
            g2.dispose();
        }
    }
    
    @Override
    public Dimension getPreferredSize(final JComponent c) {
        final Dimension size = super.getPreferredSize(c);
        if (size.height > 0) {
            size.height = Math.max(size.height, UIScale.scale(this.height));
        }
        return size;
    }
    
    private boolean isVerticalScrollBarVisible() {
        final JScrollPane scrollPane = this.getScrollPane();
        return scrollPane != null && scrollPane.getVerticalScrollBar() != null && scrollPane.getVerticalScrollBar().isVisible();
    }
    
    private JScrollPane getScrollPane() {
        Container parent = this.header.getParent();
        if (parent == null) {
            return null;
        }
        parent = parent.getParent();
        return (parent instanceof JScrollPane) ? ((JScrollPane)parent) : null;
    }
    
    private class FlatTableCellHeaderRenderer implements TableCellRenderer, Border, UIResource
    {
        private final TableCellRenderer delegate;
        private JLabel l;
        private int oldHorizontalTextPosition;
        private Border origBorder;
        private Icon sortIcon;
        
        FlatTableCellHeaderRenderer(final TableCellRenderer delegate) {
            this.oldHorizontalTextPosition = -1;
            this.delegate = delegate;
        }
        
        @Override
        public Component getTableCellRendererComponent(final JTable table, final Object value, final boolean isSelected, final boolean hasFocus, final int row, final int column) {
            final Component c = this.delegate.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (!(c instanceof JLabel)) {
                return c;
            }
            this.l = (JLabel)c;
            if (FlatTableHeaderUI.this.sortIconPosition == 2) {
                if (this.oldHorizontalTextPosition < 0) {
                    this.oldHorizontalTextPosition = this.l.getHorizontalTextPosition();
                }
                this.l.setHorizontalTextPosition(4);
            }
            else {
                this.sortIcon = this.l.getIcon();
                this.origBorder = this.l.getBorder();
                this.l.setIcon(null);
                this.l.setBorder(this);
            }
            return this.l;
        }
        
        void reset() {
            if (this.l != null && FlatTableHeaderUI.this.sortIconPosition == 2 && this.oldHorizontalTextPosition >= 0) {
                this.l.setHorizontalTextPosition(this.oldHorizontalTextPosition);
            }
        }
        
        @Override
        public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
            if (this.origBorder != null) {
                this.origBorder.paintBorder(c, g, x, y, width, height);
            }
            if (this.sortIcon != null) {
                final int xi = x + (width - this.sortIcon.getIconWidth()) / 2;
                final int yi = (FlatTableHeaderUI.this.sortIconPosition == 1) ? (y + UIScale.scale(1)) : (y + height - this.sortIcon.getIconHeight() - 1 - (int)(1.0f * UIScale.getUserScaleFactor()));
                this.sortIcon.paintIcon(c, g, xi, yi);
            }
        }
        
        @Override
        public Insets getBorderInsets(final Component c) {
            return (this.origBorder != null) ? this.origBorder.getBorderInsets(c) : new Insets(0, 0, 0, 0);
        }
        
        @Override
        public boolean isBorderOpaque() {
            return this.origBorder != null && this.origBorder.isBorderOpaque();
        }
    }
}
