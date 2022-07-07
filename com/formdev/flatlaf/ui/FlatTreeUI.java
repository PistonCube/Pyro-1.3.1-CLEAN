// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Container;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.CellRendererPane;
import java.awt.Component;
import java.awt.Insets;
import java.awt.Graphics;
import javax.swing.JTree;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.Rectangle;
import javax.swing.tree.TreePath;
import javax.swing.SwingUtilities;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import com.formdev.flatlaf.util.UIScale;
import javax.swing.UIManager;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import java.awt.Color;
import javax.swing.plaf.basic.BasicTreeUI;

public class FlatTreeUI extends BasicTreeUI
{
    protected Color selectionBackground;
    protected Color selectionForeground;
    protected Color selectionInactiveBackground;
    protected Color selectionInactiveForeground;
    protected Color selectionBorderColor;
    protected boolean wideSelection;
    protected boolean showCellFocusIndicator;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatTreeUI();
    }
    
    @Override
    protected void installDefaults() {
        super.installDefaults();
        LookAndFeel.installBorder(this.tree, "Tree.border");
        this.selectionBackground = UIManager.getColor("Tree.selectionBackground");
        this.selectionForeground = UIManager.getColor("Tree.selectionForeground");
        this.selectionInactiveBackground = UIManager.getColor("Tree.selectionInactiveBackground");
        this.selectionInactiveForeground = UIManager.getColor("Tree.selectionInactiveForeground");
        this.selectionBorderColor = UIManager.getColor("Tree.selectionBorderColor");
        this.wideSelection = UIManager.getBoolean("Tree.wideSelection");
        this.showCellFocusIndicator = UIManager.getBoolean("Tree.showCellFocusIndicator");
        final int rowHeight = FlatUIUtils.getUIInt("Tree.rowHeight", 16);
        if (rowHeight > 0) {
            LookAndFeel.installProperty(this.tree, "rowHeight", UIScale.scale(rowHeight));
        }
        this.setLeftChildIndent(UIScale.scale(this.getLeftChildIndent()));
        this.setRightChildIndent(UIScale.scale(this.getRightChildIndent()));
    }
    
    @Override
    protected void uninstallDefaults() {
        super.uninstallDefaults();
        LookAndFeel.uninstallBorder(this.tree);
        this.selectionBackground = null;
        this.selectionForeground = null;
        this.selectionInactiveBackground = null;
        this.selectionInactiveForeground = null;
        this.selectionBorderColor = null;
    }
    
    @Override
    protected MouseListener createMouseListener() {
        if (!this.wideSelection) {
            return super.createMouseListener();
        }
        return new MouseHandler() {
            @Override
            public void mousePressed(final MouseEvent e) {
                super.mousePressed(this.handleWideMouseEvent(e));
            }
            
            @Override
            public void mouseReleased(final MouseEvent e) {
                super.mouseReleased(this.handleWideMouseEvent(e));
            }
            
            @Override
            public void mouseDragged(final MouseEvent e) {
                super.mouseDragged(this.handleWideMouseEvent(e));
            }
            
            private MouseEvent handleWideMouseEvent(final MouseEvent e) {
                if (!FlatTreeUI.this.tree.isEnabled() || !SwingUtilities.isLeftMouseButton(e) || e.isConsumed()) {
                    return e;
                }
                final int x = e.getX();
                final int y = e.getY();
                final TreePath path = FlatTreeUI.this.getClosestPathForLocation(FlatTreeUI.this.tree, x, y);
                if (path == null || BasicTreeUI.this.isLocationInExpandControl(path, x, y)) {
                    return e;
                }
                final Rectangle bounds = FlatTreeUI.this.getPathBounds(FlatTreeUI.this.tree, path);
                if (bounds == null || y < bounds.y || y >= bounds.y + bounds.height) {
                    return e;
                }
                final int newX = Math.max(bounds.x, Math.min(x, bounds.x + bounds.width - 1));
                if (newX == x) {
                    return e;
                }
                return new MouseEvent(e.getComponent(), e.getID(), e.getWhen(), e.getModifiers() | e.getModifiersEx(), newX, e.getY(), e.getClickCount(), e.isPopupTrigger(), e.getButton());
            }
        };
    }
    
    @Override
    protected PropertyChangeListener createPropertyChangeListener() {
        if (!this.wideSelection) {
            return super.createPropertyChangeListener();
        }
        return new PropertyChangeHandler() {
            @Override
            public void propertyChange(final PropertyChangeEvent e) {
                super.propertyChange(e);
                if (e.getSource() == FlatTreeUI.this.tree && e.getPropertyName() == "dropLocation") {
                    final JTree.DropLocation oldValue = (JTree.DropLocation)e.getOldValue();
                    this.repaintWideDropLocation(oldValue);
                    this.repaintWideDropLocation(FlatTreeUI.this.tree.getDropLocation());
                }
            }
            
            private void repaintWideDropLocation(final JTree.DropLocation loc) {
                if (loc == null || BasicTreeUI.this.isDropLine(loc)) {
                    return;
                }
                final Rectangle r = FlatTreeUI.this.tree.getPathBounds(loc.getPath());
                if (r != null) {
                    FlatTreeUI.this.tree.repaint(0, r.y, FlatTreeUI.this.tree.getWidth(), r.height);
                }
            }
        };
    }
    
    @Override
    protected void paintRow(final Graphics g, final Rectangle clipBounds, final Insets insets, final Rectangle bounds, final TreePath path, final int row, final boolean isExpanded, final boolean hasBeenExpanded, final boolean isLeaf) {
        final boolean isEditing = this.editingComponent != null && this.editingRow == row;
        boolean hasFocus = FlatUIUtils.isPermanentFocusOwner(this.tree);
        final boolean cellHasFocus = hasFocus && row == this.getLeadSelectionRow();
        final boolean isSelected = this.tree.isRowSelected(row);
        final boolean isDropRow = this.isDropRow(row);
        if (!hasFocus && isSelected && this.tree.getParent() instanceof CellRendererPane) {
            hasFocus = FlatUIUtils.isPermanentFocusOwner(this.tree.getParent().getParent());
        }
        if (this.wideSelection && (isSelected || isDropRow)) {
            g.setColor(isDropRow ? UIManager.getColor("Tree.dropCellBackground") : (hasFocus ? this.selectionBackground : this.selectionInactiveBackground));
            g.fillRect(0, bounds.y, this.tree.getWidth(), bounds.height);
            if (this.shouldPaintExpandControl(path, row, isExpanded, hasBeenExpanded, isLeaf)) {
                this.paintExpandControl(g, clipBounds, insets, bounds, path, row, isExpanded, hasBeenExpanded, isLeaf);
            }
        }
        if (isEditing) {
            return;
        }
        final Component rendererComponent = this.currentCellRenderer.getTreeCellRendererComponent(this.tree, path.getLastPathComponent(), isSelected, isExpanded, isLeaf, row, cellHasFocus);
        Color oldBackgroundSelectionColor = null;
        if (isSelected && !hasFocus && !isDropRow) {
            if (rendererComponent instanceof DefaultTreeCellRenderer) {
                final DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer)rendererComponent;
                if (renderer.getBackgroundSelectionColor() == this.selectionBackground) {
                    oldBackgroundSelectionColor = renderer.getBackgroundSelectionColor();
                    renderer.setBackgroundSelectionColor(this.selectionInactiveBackground);
                }
            }
            else if (rendererComponent.getBackground() == this.selectionBackground) {
                rendererComponent.setBackground(this.selectionInactiveBackground);
            }
            if (rendererComponent.getForeground() == this.selectionForeground) {
                rendererComponent.setForeground(this.selectionInactiveForeground);
            }
        }
        Color oldBorderSelectionColor = null;
        if (isSelected && hasFocus && (!this.showCellFocusIndicator || this.tree.getMinSelectionRow() == this.tree.getMaxSelectionRow()) && rendererComponent instanceof DefaultTreeCellRenderer) {
            final DefaultTreeCellRenderer renderer2 = (DefaultTreeCellRenderer)rendererComponent;
            if (renderer2.getBorderSelectionColor() == this.selectionBorderColor) {
                oldBorderSelectionColor = renderer2.getBorderSelectionColor();
                renderer2.setBorderSelectionColor(null);
            }
        }
        this.rendererPane.paintComponent(g, rendererComponent, this.tree, bounds.x, bounds.y, bounds.width, bounds.height, true);
        if (oldBackgroundSelectionColor != null) {
            ((DefaultTreeCellRenderer)rendererComponent).setBackgroundSelectionColor(oldBackgroundSelectionColor);
        }
        if (oldBorderSelectionColor != null) {
            ((DefaultTreeCellRenderer)rendererComponent).setBorderSelectionColor(oldBorderSelectionColor);
        }
    }
    
    private boolean isDropRow(final int row) {
        final JTree.DropLocation dropLocation = this.tree.getDropLocation();
        return dropLocation != null && dropLocation.getChildIndex() == -1 && this.tree.getRowForPath(dropLocation.getPath()) == row;
    }
    
    @Override
    protected Rectangle getDropLineRect(final JTree.DropLocation loc) {
        final Rectangle r = super.getDropLineRect(loc);
        return this.wideSelection ? new Rectangle(0, r.y, this.tree.getWidth(), r.height) : r;
    }
}
