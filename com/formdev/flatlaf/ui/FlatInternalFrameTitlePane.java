// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.beans.PropertyChangeEvent;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.Icon;
import com.formdev.flatlaf.util.ScaledImageIcon;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import com.formdev.flatlaf.util.UIScale;
import java.awt.LayoutManager;
import java.beans.PropertyChangeListener;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class FlatInternalFrameTitlePane extends BasicInternalFrameTitlePane
{
    private JLabel titleLabel;
    private JPanel buttonPanel;
    
    public FlatInternalFrameTitlePane(final JInternalFrame f) {
        super(f);
    }
    
    @Override
    protected void installDefaults() {
        super.installDefaults();
        LookAndFeel.installBorder(this, "InternalFrameTitlePane.border");
    }
    
    @Override
    protected PropertyChangeListener createPropertyChangeListener() {
        return new FlatPropertyChangeHandler();
    }
    
    @Override
    protected LayoutManager createLayout() {
        return new BorderLayout(UIScale.scale(4), 0);
    }
    
    @Override
    protected void createButtons() {
        super.createButtons();
        this.iconButton.setContentAreaFilled(false);
        this.maxButton.setContentAreaFilled(false);
        this.closeButton.setContentAreaFilled(false);
        final Border emptyBorder = BorderFactory.createEmptyBorder();
        this.iconButton.setBorder(emptyBorder);
        this.maxButton.setBorder(emptyBorder);
        this.closeButton.setBorder(emptyBorder);
        this.updateButtonsVisibility();
    }
    
    @Override
    protected void addSubComponents() {
        (this.titleLabel = new JLabel(this.frame.getTitle())).setFont(FlatUIUtils.nonUIResource(this.getFont()));
        this.titleLabel.setMinimumSize(new Dimension(UIScale.scale(32), 1));
        this.updateFrameIcon();
        this.updateColors();
        (this.buttonPanel = new JPanel()).setLayout(new BoxLayout(this.buttonPanel, 2));
        this.buttonPanel.setOpaque(false);
        this.buttonPanel.add(this.iconButton);
        this.buttonPanel.add(this.maxButton);
        this.buttonPanel.add(this.closeButton);
        this.add(this.titleLabel, "Center");
        this.add(this.buttonPanel, "After");
    }
    
    protected void updateFrameIcon() {
        Icon frameIcon = this.frame.getFrameIcon();
        if (frameIcon != null && (frameIcon.getIconWidth() == 0 || frameIcon.getIconHeight() == 0)) {
            frameIcon = null;
        }
        else if (frameIcon instanceof ImageIcon) {
            frameIcon = new ScaledImageIcon((ImageIcon)frameIcon);
        }
        this.titleLabel.setIcon(frameIcon);
    }
    
    protected void updateColors() {
        final Color background = FlatUIUtils.nonUIResource(this.frame.isSelected() ? this.selectedTitleColor : this.notSelectedTitleColor);
        final Color foreground = FlatUIUtils.nonUIResource(this.frame.isSelected() ? this.selectedTextColor : this.notSelectedTextColor);
        this.titleLabel.setForeground(foreground);
        this.iconButton.setBackground(background);
        this.iconButton.setForeground(foreground);
        this.maxButton.setBackground(background);
        this.maxButton.setForeground(foreground);
        this.closeButton.setBackground(background);
        this.closeButton.setForeground(foreground);
    }
    
    protected void updateButtonsVisibility() {
        this.iconButton.setVisible(this.frame.isIconifiable());
        this.maxButton.setVisible(this.frame.isMaximizable());
        this.closeButton.setVisible(this.frame.isClosable());
    }
    
    @Override
    protected void assembleSystemMenu() {
    }
    
    @Override
    protected void showSystemMenu() {
    }
    
    @Override
    public void paintComponent(final Graphics g) {
        this.paintTitleBackground(g);
    }
    
    protected class FlatPropertyChangeHandler extends PropertyChangeHandler
    {
        @Override
        public void propertyChange(final PropertyChangeEvent e) {
            final String propertyName = e.getPropertyName();
            switch (propertyName) {
                case "title": {
                    FlatInternalFrameTitlePane.this.titleLabel.setText(FlatInternalFrameTitlePane.this.frame.getTitle());
                    break;
                }
                case "frameIcon": {
                    FlatInternalFrameTitlePane.this.updateFrameIcon();
                    break;
                }
                case "selected": {
                    FlatInternalFrameTitlePane.this.updateColors();
                    break;
                }
                case "iconable":
                case "maximizable":
                case "closable": {
                    FlatInternalFrameTitlePane.this.updateButtonsVisibility();
                    BasicInternalFrameTitlePane.this.enableActions();
                    FlatInternalFrameTitlePane.this.revalidate();
                    FlatInternalFrameTitlePane.this.repaint();
                    return;
                }
                case "componentOrientation": {
                    FlatInternalFrameTitlePane.this.applyComponentOrientation(FlatInternalFrameTitlePane.this.frame.getComponentOrientation());
                    break;
                }
            }
            super.propertyChange(e);
        }
    }
}
