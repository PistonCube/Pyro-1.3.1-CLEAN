// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.beans.PropertyChangeEvent;
import java.awt.event.FocusEvent;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import java.beans.PropertyChangeListener;
import java.awt.event.FocusListener;
import com.formdev.flatlaf.util.UIScale;
import javax.swing.UIManager;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.plaf.basic.BasicSpinnerUI;

public class FlatSpinnerUI extends BasicSpinnerUI
{
    private Handler handler;
    protected int minimumWidth;
    protected String buttonStyle;
    protected String arrowType;
    protected boolean isIntelliJTheme;
    protected Color borderColor;
    protected Color disabledBorderColor;
    protected Color disabledBackground;
    protected Color disabledForeground;
    protected Color buttonBackground;
    protected Color buttonArrowColor;
    protected Color buttonDisabledArrowColor;
    protected Color buttonHoverArrowColor;
    protected Insets padding;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatSpinnerUI();
    }
    
    @Override
    protected void installDefaults() {
        super.installDefaults();
        LookAndFeel.installProperty(this.spinner, "opaque", false);
        this.minimumWidth = UIManager.getInt("Component.minimumWidth");
        this.buttonStyle = UIManager.getString("Spinner.buttonStyle");
        this.arrowType = UIManager.getString("Component.arrowType");
        this.isIntelliJTheme = UIManager.getBoolean("Component.isIntelliJTheme");
        this.borderColor = UIManager.getColor("Component.borderColor");
        this.disabledBorderColor = UIManager.getColor("Component.disabledBorderColor");
        this.disabledBackground = UIManager.getColor("Spinner.disabledBackground");
        this.disabledForeground = UIManager.getColor("Spinner.disabledForeground");
        this.buttonBackground = UIManager.getColor("Spinner.buttonBackground");
        this.buttonArrowColor = UIManager.getColor("Spinner.buttonArrowColor");
        this.buttonDisabledArrowColor = UIManager.getColor("Spinner.buttonDisabledArrowColor");
        this.buttonHoverArrowColor = UIManager.getColor("Spinner.buttonHoverArrowColor");
        this.padding = UIManager.getInsets("Spinner.padding");
        this.padding = UIScale.scale(this.padding);
        MigLayoutVisualPadding.install(this.spinner);
    }
    
    @Override
    protected void uninstallDefaults() {
        super.uninstallDefaults();
        this.borderColor = null;
        this.disabledBorderColor = null;
        this.disabledBackground = null;
        this.disabledForeground = null;
        this.buttonBackground = null;
        this.buttonArrowColor = null;
        this.buttonDisabledArrowColor = null;
        this.buttonHoverArrowColor = null;
        this.padding = null;
        MigLayoutVisualPadding.uninstall(this.spinner);
    }
    
    @Override
    protected void installListeners() {
        super.installListeners();
        this.addEditorFocusListener(this.spinner.getEditor());
        this.spinner.addFocusListener(this.getHandler());
        this.spinner.addPropertyChangeListener(this.getHandler());
    }
    
    @Override
    protected void uninstallListeners() {
        super.uninstallListeners();
        this.removeEditorFocusListener(this.spinner.getEditor());
        this.spinner.removeFocusListener(this.getHandler());
        this.spinner.removePropertyChangeListener(this.getHandler());
        this.handler = null;
    }
    
    private Handler getHandler() {
        if (this.handler == null) {
            this.handler = new Handler();
        }
        return this.handler;
    }
    
    @Override
    protected JComponent createEditor() {
        final JComponent editor = super.createEditor();
        editor.setOpaque(false);
        final JTextField textField = getEditorTextField(editor);
        if (textField != null) {
            textField.setOpaque(false);
        }
        this.updateEditorColors();
        return editor;
    }
    
    @Override
    protected void replaceEditor(final JComponent oldEditor, final JComponent newEditor) {
        super.replaceEditor(oldEditor, newEditor);
        this.removeEditorFocusListener(oldEditor);
        this.addEditorFocusListener(newEditor);
        this.updateEditorColors();
    }
    
    private void addEditorFocusListener(final JComponent editor) {
        final JTextField textField = getEditorTextField(editor);
        if (textField != null) {
            textField.addFocusListener(this.getHandler());
        }
    }
    
    private void removeEditorFocusListener(final JComponent editor) {
        final JTextField textField = getEditorTextField(editor);
        if (textField != null) {
            textField.removeFocusListener(this.getHandler());
        }
    }
    
    private void updateEditorColors() {
        final JTextField textField = getEditorTextField(this.spinner.getEditor());
        if (textField != null) {
            textField.setForeground(FlatUIUtils.nonUIResource(this.getForeground(true)));
            textField.setDisabledTextColor(FlatUIUtils.nonUIResource(this.getForeground(false)));
        }
    }
    
    private static JTextField getEditorTextField(final JComponent editor) {
        return (editor instanceof JSpinner.DefaultEditor) ? ((JSpinner.DefaultEditor)editor).getTextField() : null;
    }
    
    protected Color getBackground(final boolean enabled) {
        return enabled ? this.spinner.getBackground() : (this.isIntelliJTheme ? FlatUIUtils.getParentBackground(this.spinner) : this.disabledBackground);
    }
    
    protected Color getForeground(final boolean enabled) {
        return enabled ? this.spinner.getForeground() : this.disabledForeground;
    }
    
    @Override
    protected LayoutManager createLayout() {
        return this.getHandler();
    }
    
    @Override
    protected Component createNextButton() {
        return this.createArrowButton(1, "Spinner.nextButton");
    }
    
    @Override
    protected Component createPreviousButton() {
        return this.createArrowButton(5, "Spinner.previousButton");
    }
    
    private Component createArrowButton(final int direction, final String name) {
        final FlatArrowButton button = new FlatArrowButton(direction, this.arrowType, this.buttonArrowColor, this.buttonDisabledArrowColor, this.buttonHoverArrowColor, null);
        button.setName(name);
        button.setYOffset((direction == 1) ? 1 : -1);
        if (direction == 1) {
            this.installNextButtonListeners(button);
        }
        else {
            this.installPreviousButtonListeners(button);
        }
        return button;
    }
    
    @Override
    public void update(final Graphics g, final JComponent c) {
        final float focusWidth = FlatUIUtils.getBorderFocusWidth(c);
        final float arc = FlatUIUtils.getBorderArc(c);
        if (c.isOpaque() && (focusWidth > 0.0f || arc > 0.0f)) {
            FlatUIUtils.paintParentBackground(g, c);
        }
        final Graphics2D g2 = (Graphics2D)g;
        FlatUIUtils.setRenderingHints(g2);
        final int width = c.getWidth();
        final int height = c.getHeight();
        final Component nextButton = this.getHandler().nextButton;
        final int arrowX = nextButton.getX();
        final int arrowWidth = nextButton.getWidth();
        final boolean paintButton = !"none".equals(this.buttonStyle);
        final boolean enabled = this.spinner.isEnabled();
        final boolean isLeftToRight = this.spinner.getComponentOrientation().isLeftToRight();
        g2.setColor(this.getBackground(enabled));
        FlatUIUtils.paintComponentBackground(g2, 0, 0, width, height, focusWidth, arc);
        if (paintButton && enabled) {
            g2.setColor(this.buttonBackground);
            final Shape oldClip = g2.getClip();
            if (isLeftToRight) {
                g2.clipRect(arrowX, 0, width - arrowX, height);
            }
            else {
                g2.clipRect(0, 0, arrowX + arrowWidth, height);
            }
            FlatUIUtils.paintComponentBackground(g2, 0, 0, width, height, focusWidth, arc);
            g2.setClip(oldClip);
        }
        if (paintButton) {
            g2.setColor(enabled ? this.borderColor : this.disabledBorderColor);
            final float lw = UIScale.scale(1.0f);
            final float lx = isLeftToRight ? ((float)arrowX) : (arrowX + arrowWidth - lw);
            g2.fill(new Rectangle2D.Float(lx, focusWidth, lw, height - 1 - focusWidth * 2.0f));
        }
        this.paint(g, c);
    }
    
    private class Handler implements LayoutManager, FocusListener, PropertyChangeListener
    {
        private Component editor;
        private Component nextButton;
        private Component previousButton;
        
        private Handler() {
            this.editor = null;
        }
        
        @Override
        public void addLayoutComponent(final String name, final Component c) {
            switch (name) {
                case "Editor": {
                    this.editor = c;
                    break;
                }
                case "Next": {
                    this.nextButton = c;
                    break;
                }
                case "Previous": {
                    this.previousButton = c;
                    break;
                }
            }
        }
        
        @Override
        public void removeLayoutComponent(final Component c) {
            if (c == this.editor) {
                this.editor = null;
            }
            else if (c == this.nextButton) {
                this.nextButton = null;
            }
            else if (c == this.previousButton) {
                this.previousButton = null;
            }
        }
        
        @Override
        public Dimension preferredLayoutSize(final Container parent) {
            final Insets insets = parent.getInsets();
            final Dimension editorSize = (this.editor != null) ? this.editor.getPreferredSize() : new Dimension(0, 0);
            final int minimumWidth = FlatUIUtils.minimumWidth(FlatSpinnerUI.this.spinner, FlatSpinnerUI.this.minimumWidth);
            final int innerHeight = editorSize.height + FlatSpinnerUI.this.padding.top + FlatSpinnerUI.this.padding.bottom;
            final float focusWidth = FlatUIUtils.getBorderFocusWidth(FlatSpinnerUI.this.spinner);
            return new Dimension(Math.max(insets.left + insets.right + editorSize.width + FlatSpinnerUI.this.padding.left + FlatSpinnerUI.this.padding.right + innerHeight, UIScale.scale(minimumWidth) + Math.round(focusWidth * 2.0f)), insets.top + insets.bottom + innerHeight);
        }
        
        @Override
        public Dimension minimumLayoutSize(final Container parent) {
            return this.preferredLayoutSize(parent);
        }
        
        @Override
        public void layoutContainer(final Container parent) {
            final Dimension size = parent.getSize();
            final Insets insets = parent.getInsets();
            final Rectangle r = FlatUIUtils.subtractInsets(new Rectangle(size), insets);
            if (this.nextButton == null && this.previousButton == null) {
                if (this.editor != null) {
                    this.editor.setBounds(r);
                }
                return;
            }
            final Rectangle editorRect = new Rectangle(r);
            final Rectangle buttonsRect = new Rectangle(r);
            final int buttonsWidth = r.height;
            buttonsRect.width = buttonsWidth;
            if (parent.getComponentOrientation().isLeftToRight()) {
                final Rectangle rectangle = editorRect;
                rectangle.width -= buttonsWidth;
                final Rectangle rectangle2 = buttonsRect;
                rectangle2.x += editorRect.width;
            }
            else {
                final Rectangle rectangle3 = editorRect;
                rectangle3.x += buttonsWidth;
                final Rectangle rectangle4 = editorRect;
                rectangle4.width -= buttonsWidth;
            }
            if (this.editor != null) {
                this.editor.setBounds(FlatUIUtils.subtractInsets(editorRect, FlatSpinnerUI.this.padding));
            }
            final int nextHeight = buttonsRect.height / 2 + buttonsRect.height % 2;
            if (this.nextButton != null) {
                this.nextButton.setBounds(buttonsRect.x, buttonsRect.y, buttonsRect.width, nextHeight);
            }
            if (this.previousButton != null) {
                final int previousY = buttonsRect.y + buttonsRect.height - nextHeight;
                this.previousButton.setBounds(buttonsRect.x, previousY, buttonsRect.width, nextHeight);
            }
        }
        
        @Override
        public void focusGained(final FocusEvent e) {
            FlatSpinnerUI.this.spinner.repaint();
            if (e.getComponent() == FlatSpinnerUI.this.spinner) {
                final JTextField textField = getEditorTextField(FlatSpinnerUI.this.spinner.getEditor());
                if (textField != null) {
                    textField.requestFocusInWindow();
                }
            }
        }
        
        @Override
        public void focusLost(final FocusEvent e) {
            FlatSpinnerUI.this.spinner.repaint();
        }
        
        @Override
        public void propertyChange(final PropertyChangeEvent e) {
            final String propertyName = e.getPropertyName();
            switch (propertyName) {
                case "foreground":
                case "enabled": {
                    FlatSpinnerUI.this.updateEditorColors();
                    break;
                }
                case "JComponent.roundRect": {
                    FlatSpinnerUI.this.spinner.repaint();
                    break;
                }
                case "JComponent.minimumWidth": {
                    FlatSpinnerUI.this.spinner.revalidate();
                    break;
                }
            }
        }
    }
}
