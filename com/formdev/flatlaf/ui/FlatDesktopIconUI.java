// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Container;
import javax.swing.JInternalFrame;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Graphics2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.EventQueue;
import java.awt.Point;
import javax.swing.JRootPane;
import com.formdev.flatlaf.util.UIScale;
import javax.swing.JLayeredPane;
import javax.swing.SwingUtilities;
import java.beans.PropertyVetoException;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseListener;
import javax.swing.LookAndFeel;
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import javax.swing.event.MouseInputListener;
import java.awt.event.ActionListener;
import javax.swing.JToolTip;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.plaf.basic.BasicDesktopIconUI;

public class FlatDesktopIconUI extends BasicDesktopIconUI
{
    private Dimension iconSize;
    private Dimension closeSize;
    private JLabel dockIcon;
    private JButton closeButton;
    private JToolTip titleTip;
    private ActionListener closeListener;
    private MouseInputListener mouseInputListener;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatDesktopIconUI();
    }
    
    @Override
    public void uninstallUI(final JComponent c) {
        super.uninstallUI(c);
        this.dockIcon = null;
        this.closeButton = null;
    }
    
    @Override
    protected void installComponents() {
        (this.dockIcon = new JLabel()).setHorizontalAlignment(0);
        (this.closeButton = new JButton()).setIcon(UIManager.getIcon("DesktopIcon.closeIcon"));
        this.closeButton.setFocusable(false);
        this.closeButton.setBorder(BorderFactory.createEmptyBorder());
        this.closeButton.setOpaque(true);
        this.closeButton.setBackground(FlatUIUtils.nonUIResource(this.desktopIcon.getBackground()));
        this.closeButton.setForeground(FlatUIUtils.nonUIResource(this.desktopIcon.getForeground()));
        this.closeButton.setVisible(false);
        this.desktopIcon.setLayout(new FlatDesktopIconLayout());
        this.desktopIcon.add(this.closeButton);
        this.desktopIcon.add(this.dockIcon);
    }
    
    @Override
    protected void uninstallComponents() {
        this.hideTitleTip();
        this.desktopIcon.remove(this.dockIcon);
        this.desktopIcon.remove(this.closeButton);
        this.desktopIcon.setLayout(null);
    }
    
    @Override
    protected void installDefaults() {
        super.installDefaults();
        LookAndFeel.installColors(this.desktopIcon, "DesktopIcon.background", "DesktopIcon.foreground");
        this.iconSize = UIManager.getDimension("DesktopIcon.iconSize");
        this.closeSize = UIManager.getDimension("DesktopIcon.closeSize");
    }
    
    @Override
    protected void installListeners() {
        super.installListeners();
        this.closeListener = (e -> {
            if (this.frame.isClosable()) {
                this.frame.doDefaultCloseAction();
            }
            return;
        });
        this.closeButton.addActionListener(this.closeListener);
        this.closeButton.addMouseListener(this.mouseInputListener);
    }
    
    @Override
    protected void uninstallListeners() {
        super.uninstallListeners();
        this.closeButton.removeActionListener(this.closeListener);
        this.closeButton.removeMouseListener(this.mouseInputListener);
        this.closeListener = null;
        this.mouseInputListener = null;
    }
    
    @Override
    protected MouseInputListener createMouseInputListener() {
        return this.mouseInputListener = new MouseInputAdapter() {
            @Override
            public void mouseReleased(final MouseEvent e) {
                if (FlatDesktopIconUI.this.frame.isIcon() && FlatDesktopIconUI.this.desktopIcon.contains(e.getX(), e.getY())) {
                    FlatDesktopIconUI.this.hideTitleTip();
                    FlatDesktopIconUI.this.closeButton.setVisible(false);
                    try {
                        FlatDesktopIconUI.this.frame.setIcon(false);
                    }
                    catch (PropertyVetoException ex) {}
                }
            }
            
            @Override
            public void mouseEntered(final MouseEvent e) {
                FlatDesktopIconUI.this.showTitleTip();
                if (FlatDesktopIconUI.this.frame.isClosable()) {
                    FlatDesktopIconUI.this.closeButton.setVisible(true);
                }
            }
            
            @Override
            public void mouseExited(final MouseEvent e) {
                FlatDesktopIconUI.this.hideTitleTip();
                FlatDesktopIconUI.this.closeButton.setVisible(false);
            }
        };
    }
    
    private void showTitleTip() {
        final JRootPane rootPane = SwingUtilities.getRootPane(this.desktopIcon);
        if (rootPane == null) {
            return;
        }
        if (this.titleTip == null) {
            this.titleTip = new JToolTip();
            rootPane.getLayeredPane().add(this.titleTip, JLayeredPane.POPUP_LAYER);
        }
        this.titleTip.setTipText(this.frame.getTitle());
        this.titleTip.setSize(this.titleTip.getPreferredSize());
        final int tx = (this.desktopIcon.getWidth() - this.titleTip.getWidth()) / 2;
        final int ty = -(this.titleTip.getHeight() + UIScale.scale(4));
        final Point pt = SwingUtilities.convertPoint(this.desktopIcon, tx, ty, this.titleTip.getParent());
        if (pt.x + this.titleTip.getWidth() > rootPane.getWidth()) {
            pt.x = rootPane.getWidth() - this.titleTip.getWidth();
        }
        if (pt.x < 0) {
            pt.x = 0;
        }
        this.titleTip.setLocation(pt);
        this.titleTip.repaint();
    }
    
    private void hideTitleTip() {
        if (this.titleTip == null) {
            return;
        }
        this.titleTip.setVisible(false);
        this.titleTip.getParent().remove(this.titleTip);
        this.titleTip = null;
    }
    
    @Override
    public Dimension getPreferredSize(final JComponent c) {
        return UIScale.scale(this.iconSize);
    }
    
    @Override
    public Dimension getMinimumSize(final JComponent c) {
        return this.getPreferredSize(c);
    }
    
    @Override
    public Dimension getMaximumSize(final JComponent c) {
        return this.getPreferredSize(c);
    }
    
    void updateDockIcon() {
        EventQueue.invokeLater(() -> {
            if (this.dockIcon != null) {
                this.updateDockIconLater();
            }
        });
    }
    
    private void updateDockIconLater() {
        if (this.frame.isSelected()) {
            try {
                this.frame.setSelected(false);
            }
            catch (PropertyVetoException ex) {}
        }
        final int frameWidth = Math.max(this.frame.getWidth(), 1);
        final int frameHeight = Math.max(this.frame.getHeight(), 1);
        final BufferedImage frameImage = new BufferedImage(frameWidth, frameHeight, 2);
        final Graphics2D g = frameImage.createGraphics();
        try {
            this.frame.paint(g);
        }
        finally {
            g.dispose();
        }
        final Insets insets = this.desktopIcon.getInsets();
        int previewWidth = UIScale.scale(this.iconSize.width) - insets.left - insets.right;
        int previewHeight = UIScale.scale(this.iconSize.height) - insets.top - insets.bottom;
        final float frameRatio = frameHeight / (float)frameWidth;
        if (previewWidth / (float)frameWidth > previewHeight / (float)frameHeight) {
            previewWidth = Math.round(previewHeight / frameRatio);
        }
        else {
            previewHeight = Math.round(previewWidth * frameRatio);
        }
        final Image previewImage = frameImage.getScaledInstance(previewWidth, previewHeight, 4);
        this.dockIcon.setIcon(new ImageIcon(previewImage));
    }
    
    private class FlatDesktopIconLayout implements LayoutManager
    {
        @Override
        public void addLayoutComponent(final String name, final Component comp) {
        }
        
        @Override
        public void removeLayoutComponent(final Component comp) {
        }
        
        @Override
        public Dimension preferredLayoutSize(final Container parent) {
            return FlatDesktopIconUI.this.dockIcon.getPreferredSize();
        }
        
        @Override
        public Dimension minimumLayoutSize(final Container parent) {
            return FlatDesktopIconUI.this.dockIcon.getMinimumSize();
        }
        
        @Override
        public void layoutContainer(final Container parent) {
            final Insets insets = parent.getInsets();
            FlatDesktopIconUI.this.dockIcon.setBounds(insets.left, insets.top, parent.getWidth() - insets.left - insets.right, parent.getHeight() - insets.top - insets.bottom);
            final Dimension cSize = UIScale.scale(FlatDesktopIconUI.this.closeSize);
            FlatDesktopIconUI.this.closeButton.setBounds(parent.getWidth() - cSize.width, 0, cSize.width, cSize.height);
        }
    }
}
