// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Dimension;
import javax.swing.text.JTextComponent;
import java.awt.Toolkit;
import com.formdev.flatlaf.util.HiDPIUtils;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.beans.PropertyChangeEvent;
import javax.swing.text.Caret;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.Component;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import java.awt.event.KeyListener;
import java.awt.event.FocusListener;
import javax.swing.Icon;
import java.awt.Color;
import javax.swing.plaf.basic.BasicPasswordFieldUI;

public class FlatPasswordFieldUI extends BasicPasswordFieldUI
{
    protected int minimumWidth;
    protected boolean isIntelliJTheme;
    protected Color placeholderForeground;
    protected Icon capsLockIcon;
    private FocusListener focusListener;
    private KeyListener capsLockListener;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatPasswordFieldUI();
    }
    
    @Override
    protected void installDefaults() {
        super.installDefaults();
        final String prefix = this.getPropertyPrefix();
        this.minimumWidth = UIManager.getInt("Component.minimumWidth");
        this.isIntelliJTheme = UIManager.getBoolean("Component.isIntelliJTheme");
        this.placeholderForeground = UIManager.getColor(prefix + ".placeholderForeground");
        this.capsLockIcon = UIManager.getIcon("PasswordField.capsLockIcon");
        LookAndFeel.installProperty(this.getComponent(), "opaque", false);
        MigLayoutVisualPadding.install(this.getComponent());
    }
    
    @Override
    protected void uninstallDefaults() {
        super.uninstallDefaults();
        this.placeholderForeground = null;
        this.capsLockIcon = null;
        MigLayoutVisualPadding.uninstall(this.getComponent());
    }
    
    @Override
    protected void installListeners() {
        super.installListeners();
        this.focusListener = new FlatUIUtils.RepaintFocusListener(this.getComponent());
        this.capsLockListener = new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                this.repaint(e);
            }
            
            @Override
            public void keyReleased(final KeyEvent e) {
                this.repaint(e);
            }
            
            private void repaint(final KeyEvent e) {
                if (e.getKeyCode() == 20) {
                    e.getComponent().repaint();
                }
            }
        };
        this.getComponent().addFocusListener(this.focusListener);
        this.getComponent().addKeyListener(this.capsLockListener);
    }
    
    @Override
    protected void uninstallListeners() {
        super.uninstallListeners();
        this.getComponent().removeFocusListener(this.focusListener);
        this.getComponent().removeKeyListener(this.capsLockListener);
        this.focusListener = null;
        this.capsLockListener = null;
    }
    
    @Override
    protected Caret createCaret() {
        return new FlatCaret(UIManager.getString("TextComponent.selectAllOnFocusPolicy"));
    }
    
    @Override
    protected void propertyChange(final PropertyChangeEvent e) {
        super.propertyChange(e);
        FlatTextFieldUI.propertyChange(this.getComponent(), e);
    }
    
    @Override
    protected void paintSafely(final Graphics g) {
        FlatTextFieldUI.paintBackground(g, this.getComponent(), this.isIntelliJTheme);
        FlatTextFieldUI.paintPlaceholder(g, this.getComponent(), this.placeholderForeground);
        this.paintCapsLock(g);
        super.paintSafely(HiDPIUtils.createGraphicsTextYCorrection((Graphics2D)g));
    }
    
    protected void paintCapsLock(final Graphics g) {
        final JTextComponent c = this.getComponent();
        if (!FlatUIUtils.isPermanentFocusOwner(c) || !Toolkit.getDefaultToolkit().getLockingKeyState(20)) {
            return;
        }
        final int y = (c.getHeight() - this.capsLockIcon.getIconHeight()) / 2;
        final int x = c.getWidth() - this.capsLockIcon.getIconWidth() - y;
        this.capsLockIcon.paintIcon(c, g, x, y);
    }
    
    @Override
    protected void paintBackground(final Graphics g) {
    }
    
    @Override
    public Dimension getPreferredSize(final JComponent c) {
        return FlatTextFieldUI.applyMinimumWidth(c, super.getPreferredSize(c), this.minimumWidth);
    }
    
    @Override
    public Dimension getMinimumSize(final JComponent c) {
        return FlatTextFieldUI.applyMinimumWidth(c, super.getMinimumSize(c), this.minimumWidth);
    }
}
