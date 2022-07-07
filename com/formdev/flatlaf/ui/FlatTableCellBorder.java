// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import javax.swing.SwingUtilities;
import javax.swing.JTable;
import java.awt.Graphics;
import java.awt.Component;
import javax.swing.UIManager;

public class FlatTableCellBorder extends FlatLineBorder
{
    final boolean showCellFocusIndicator;
    
    protected FlatTableCellBorder() {
        super(UIManager.getInsets("Table.cellMargins"), UIManager.getColor("Table.cellFocusColor"));
        this.showCellFocusIndicator = UIManager.getBoolean("Table.showCellFocusIndicator");
    }
    
    public static class Default extends FlatTableCellBorder
    {
        @Override
        public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
        }
    }
    
    public static class Focused extends FlatTableCellBorder
    {
    }
    
    public static class Selected extends FlatTableCellBorder
    {
        @Override
        public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
            if (!this.showCellFocusIndicator) {
                final JTable table = (JTable)SwingUtilities.getAncestorOfClass(JTable.class, c);
                if (table != null && !this.isSelectionEditable(table)) {
                    return;
                }
            }
            super.paintBorder(c, g, x, y, width, height);
        }
        
        protected boolean isSelectionEditable(final JTable table) {
            if (table.getRowSelectionAllowed()) {
                final int columnCount = table.getColumnCount();
                final int[] selectedRows2;
                final int[] selectedRows = selectedRows2 = table.getSelectedRows();
                for (final int selectedRow : selectedRows2) {
                    for (int column = 0; column < columnCount; ++column) {
                        if (table.isCellEditable(selectedRow, column)) {
                            return true;
                        }
                    }
                }
            }
            if (table.getColumnSelectionAllowed()) {
                final int rowCount = table.getRowCount();
                final int[] selectedColumns2;
                final int[] selectedColumns = selectedColumns2 = table.getSelectedColumns();
                for (final int selectedColumn : selectedColumns2) {
                    for (int row = 0; row < rowCount; ++row) {
                        if (table.isCellEditable(row, selectedColumn)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}
