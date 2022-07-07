// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import com.formdev.flatlaf.util.ScaledImageIcon;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.io.File;
import javax.swing.plaf.basic.BasicFileChooserUI;
import javax.swing.filechooser.FileView;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.Box;
import javax.swing.AbstractButton;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFileChooser;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import javax.swing.plaf.metal.MetalFileChooserUI;

public class FlatFileChooserUI extends MetalFileChooserUI
{
    private final FlatFileView fileView;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatFileChooserUI((JFileChooser)c);
    }
    
    public FlatFileChooserUI(final JFileChooser filechooser) {
        super(filechooser);
        this.fileView = new FlatFileView();
    }
    
    @Override
    public void installComponents(final JFileChooser fc) {
        super.installComponents(fc);
        this.patchUI(fc);
    }
    
    private void patchUI(final JFileChooser fc) {
        final Component topPanel = fc.getComponent(0);
        if (topPanel instanceof JPanel && ((JPanel)topPanel).getLayout() instanceof BorderLayout) {
            final Component topButtonPanel = ((JPanel)topPanel).getComponent(0);
            if (topButtonPanel instanceof JPanel && ((JPanel)topButtonPanel).getLayout() instanceof BoxLayout) {
                final Insets margin = UIManager.getInsets("Button.margin");
                final Component[] comps = ((JPanel)topButtonPanel).getComponents();
                for (int i = comps.length - 1; i >= 0; --i) {
                    final Component c = comps[i];
                    if (c instanceof JButton || c instanceof JToggleButton) {
                        final AbstractButton b = (AbstractButton)c;
                        b.putClientProperty("JButton.buttonType", "toolBarButton");
                        b.setMargin(margin);
                        b.setFocusable(false);
                    }
                    else if (c instanceof Box.Filler) {
                        ((JPanel)topButtonPanel).remove(i);
                    }
                }
            }
        }
        try {
            final Component directoryComboBox = ((JPanel)topPanel).getComponent(2);
            if (directoryComboBox instanceof JComboBox) {
                final int maximumRowCount = UIManager.getInt("ComboBox.maximumRowCount");
                if (maximumRowCount > 0) {
                    ((JComboBox)directoryComboBox).setMaximumRowCount(maximumRowCount);
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException ex) {}
    }
    
    @Override
    public Dimension getPreferredSize(final JComponent c) {
        return UIScale.scale(super.getPreferredSize(c));
    }
    
    @Override
    public Dimension getMinimumSize(final JComponent c) {
        return UIScale.scale(super.getMinimumSize(c));
    }
    
    @Override
    public FileView getFileView(final JFileChooser fc) {
        return this.fileView;
    }
    
    @Override
    public void clearIconCache() {
        this.fileView.clearIconCache();
    }
    
    private class FlatFileView extends BasicFileView
    {
        @Override
        public Icon getIcon(final File f) {
            Icon icon = this.getCachedIcon(f);
            if (icon != null) {
                return icon;
            }
            if (f != null) {
                icon = FlatFileChooserUI.this.getFileChooser().getFileSystemView().getSystemIcon(f);
                if (icon != null) {
                    if (icon instanceof ImageIcon) {
                        icon = new ScaledImageIcon((ImageIcon)icon);
                    }
                    this.cacheIcon(f, icon);
                    return icon;
                }
            }
            icon = super.getIcon(f);
            if (icon instanceof ImageIcon) {
                icon = new ScaledImageIcon((ImageIcon)icon);
                this.cacheIcon(f, icon);
            }
            return icon;
        }
    }
}
