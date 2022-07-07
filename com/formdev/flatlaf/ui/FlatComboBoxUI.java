// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.border.AbstractBorder;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.border.Border;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.ListCellRenderer;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.DefaultListCellRenderer;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;
import com.formdev.flatlaf.util.SystemInfo;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.plaf.basic.ComboPopup;
import java.awt.ComponentOrientation;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.Container;
import java.awt.LayoutManager;
import com.formdev.flatlaf.util.UIScale;
import javax.swing.UIManager;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import java.awt.Component;
import java.lang.ref.WeakReference;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class FlatComboBoxUI extends BasicComboBoxUI
{
    protected int minimumWidth;
    protected int editorColumns;
    protected String buttonStyle;
    protected String arrowType;
    protected boolean isIntelliJTheme;
    protected Color borderColor;
    protected Color disabledBorderColor;
    protected Color editableBackground;
    protected Color disabledBackground;
    protected Color disabledForeground;
    protected Color buttonBackground;
    protected Color buttonEditableBackground;
    protected Color buttonArrowColor;
    protected Color buttonDisabledArrowColor;
    protected Color buttonHoverArrowColor;
    private MouseListener hoverListener;
    protected boolean hover;
    private WeakReference<Component> lastRendererComponent;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatComboBoxUI();
    }
    
    @Override
    protected void installListeners() {
        super.installListeners();
        this.hoverListener = new FlatUIUtils.HoverListener(null, h -> {
            if (!this.comboBox.isEditable()) {
                this.hover = h;
                if (this.arrowButton != null) {
                    this.arrowButton.repaint();
                }
            }
            return;
        });
        this.comboBox.addMouseListener(this.hoverListener);
    }
    
    @Override
    protected void uninstallListeners() {
        super.uninstallListeners();
        this.comboBox.removeMouseListener(this.hoverListener);
        this.hoverListener = null;
    }
    
    @Override
    protected void installDefaults() {
        super.installDefaults();
        LookAndFeel.installProperty(this.comboBox, "opaque", false);
        this.minimumWidth = UIManager.getInt("ComboBox.minimumWidth");
        this.editorColumns = UIManager.getInt("ComboBox.editorColumns");
        this.buttonStyle = UIManager.getString("ComboBox.buttonStyle");
        this.arrowType = UIManager.getString("Component.arrowType");
        this.isIntelliJTheme = UIManager.getBoolean("Component.isIntelliJTheme");
        this.borderColor = UIManager.getColor("Component.borderColor");
        this.disabledBorderColor = UIManager.getColor("Component.disabledBorderColor");
        this.editableBackground = UIManager.getColor("ComboBox.editableBackground");
        this.disabledBackground = UIManager.getColor("ComboBox.disabledBackground");
        this.disabledForeground = UIManager.getColor("ComboBox.disabledForeground");
        this.buttonBackground = UIManager.getColor("ComboBox.buttonBackground");
        this.buttonEditableBackground = UIManager.getColor("ComboBox.buttonEditableBackground");
        this.buttonArrowColor = UIManager.getColor("ComboBox.buttonArrowColor");
        this.buttonDisabledArrowColor = UIManager.getColor("ComboBox.buttonDisabledArrowColor");
        this.buttonHoverArrowColor = UIManager.getColor("ComboBox.buttonHoverArrowColor");
        final int maximumRowCount = UIManager.getInt("ComboBox.maximumRowCount");
        if (maximumRowCount > 0 && maximumRowCount != 8 && this.comboBox.getMaximumRowCount() == 8) {
            this.comboBox.setMaximumRowCount(maximumRowCount);
        }
        this.padding = UIScale.scale(this.padding);
        MigLayoutVisualPadding.install(this.comboBox);
    }
    
    @Override
    protected void uninstallDefaults() {
        super.uninstallDefaults();
        this.borderColor = null;
        this.disabledBorderColor = null;
        this.editableBackground = null;
        this.disabledBackground = null;
        this.disabledForeground = null;
        this.buttonBackground = null;
        this.buttonEditableBackground = null;
        this.buttonArrowColor = null;
        this.buttonDisabledArrowColor = null;
        this.buttonHoverArrowColor = null;
        MigLayoutVisualPadding.uninstall(this.comboBox);
    }
    
    @Override
    protected LayoutManager createLayoutManager() {
        return new ComboBoxLayoutManager() {
            @Override
            public void layoutContainer(final Container parent) {
                super.layoutContainer(parent);
                if (FlatComboBoxUI.this.editor != null && FlatComboBoxUI.this.padding != null) {
                    FlatComboBoxUI.this.editor.setBounds(FlatUIUtils.subtractInsets(FlatComboBoxUI.this.editor.getBounds(), FlatComboBoxUI.this.padding));
                }
            }
        };
    }
    
    @Override
    protected FocusListener createFocusListener() {
        return new FocusHandler() {
            @Override
            public void focusGained(final FocusEvent e) {
                super.focusGained(e);
                if (FlatComboBoxUI.this.comboBox != null && FlatComboBoxUI.this.comboBox.isEditable()) {
                    FlatComboBoxUI.this.comboBox.repaint();
                }
            }
            
            @Override
            public void focusLost(final FocusEvent e) {
                super.focusLost(e);
                if (FlatComboBoxUI.this.comboBox != null && FlatComboBoxUI.this.comboBox.isEditable()) {
                    FlatComboBoxUI.this.comboBox.repaint();
                }
            }
        };
    }
    
    @Override
    protected PropertyChangeListener createPropertyChangeListener() {
        return new PropertyChangeHandler() {
            @Override
            public void propertyChange(final PropertyChangeEvent e) {
                super.propertyChange(e);
                final Object source = e.getSource();
                final String propertyName = e.getPropertyName();
                if (FlatComboBoxUI.this.editor != null && ((source == FlatComboBoxUI.this.comboBox && propertyName == "foreground") || (source == FlatComboBoxUI.this.editor && propertyName == "enabled"))) {
                    FlatComboBoxUI.this.updateEditorColors();
                }
                else if (FlatComboBoxUI.this.editor != null && source == FlatComboBoxUI.this.comboBox && propertyName == "componentOrientation") {
                    final ComponentOrientation o = (ComponentOrientation)e.getNewValue();
                    FlatComboBoxUI.this.editor.applyComponentOrientation(o);
                }
                else if (FlatComboBoxUI.this.editor != null && "JTextField.placeholderText".equals(propertyName)) {
                    FlatComboBoxUI.this.editor.repaint();
                }
                else if ("JComponent.roundRect".equals(propertyName)) {
                    FlatComboBoxUI.this.comboBox.repaint();
                }
                else if ("JComponent.minimumWidth".equals(propertyName)) {
                    FlatComboBoxUI.this.comboBox.revalidate();
                }
            }
        };
    }
    
    @Override
    protected ComboPopup createPopup() {
        return new FlatComboPopup(this.comboBox);
    }
    
    @Override
    protected ComboBoxEditor createEditor() {
        final ComboBoxEditor comboBoxEditor = super.createEditor();
        final Component editor = comboBoxEditor.getEditorComponent();
        if (editor instanceof JTextField) {
            final JTextField textField = (JTextField)editor;
            textField.setColumns(this.editorColumns);
            textField.setBorder(BorderFactory.createEmptyBorder());
        }
        return comboBoxEditor;
    }
    
    @Override
    protected void configureEditor() {
        super.configureEditor();
        if (this.editor instanceof JComponent) {
            ((JComponent)this.editor).setOpaque(false);
        }
        this.editor.applyComponentOrientation(this.comboBox.getComponentOrientation());
        this.updateEditorColors();
        if (SystemInfo.IS_MAC && this.editor instanceof JTextComponent) {
            final InputMap inputMap = ((JTextComponent)this.editor).getInputMap();
            new EditorDelegateAction(inputMap, KeyStroke.getKeyStroke("UP"));
            new EditorDelegateAction(inputMap, KeyStroke.getKeyStroke("KP_UP"));
            new EditorDelegateAction(inputMap, KeyStroke.getKeyStroke("DOWN"));
            new EditorDelegateAction(inputMap, KeyStroke.getKeyStroke("KP_DOWN"));
            new EditorDelegateAction(inputMap, KeyStroke.getKeyStroke("HOME"));
            new EditorDelegateAction(inputMap, KeyStroke.getKeyStroke("END"));
        }
    }
    
    private void updateEditorColors() {
        final boolean isTextComponent = this.editor instanceof JTextComponent;
        this.editor.setForeground(FlatUIUtils.nonUIResource(this.getForeground(isTextComponent || this.editor.isEnabled())));
        if (isTextComponent) {
            ((JTextComponent)this.editor).setDisabledTextColor(FlatUIUtils.nonUIResource(this.getForeground(false)));
        }
    }
    
    @Override
    protected JButton createArrowButton() {
        return new FlatComboBoxButton();
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
        final int arrowX = this.arrowButton.getX();
        final int arrowWidth = this.arrowButton.getWidth();
        final boolean paintButton = (this.comboBox.isEditable() || "button".equals(this.buttonStyle)) && !"none".equals(this.buttonStyle);
        final boolean enabled = this.comboBox.isEnabled();
        final boolean isLeftToRight = this.comboBox.getComponentOrientation().isLeftToRight();
        g2.setColor(this.getBackground(enabled));
        FlatUIUtils.paintComponentBackground(g2, 0, 0, width, height, focusWidth, arc);
        if (enabled) {
            g2.setColor(paintButton ? this.buttonEditableBackground : this.buttonBackground);
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
    
    @Override
    public void paintCurrentValue(final Graphics g, Rectangle bounds, final boolean hasFocus) {
        ListCellRenderer<Object> renderer = (ListCellRenderer<Object>)this.comboBox.getRenderer();
        this.uninstallCellPaddingBorder(renderer);
        if (renderer == null) {
            renderer = new DefaultListCellRenderer();
        }
        final Component c = renderer.getListCellRendererComponent(this.listBox, this.comboBox.getSelectedItem(), -1, false, false);
        c.setFont(this.comboBox.getFont());
        c.applyComponentOrientation(this.comboBox.getComponentOrientation());
        this.uninstallCellPaddingBorder(c);
        final boolean enabled = this.comboBox.isEnabled();
        c.setBackground(this.getBackground(enabled));
        c.setForeground(this.getForeground(enabled));
        final boolean shouldValidate = c instanceof JPanel;
        if (this.padding != null) {
            bounds = FlatUIUtils.subtractInsets(bounds, this.padding);
        }
        final Insets rendererInsets = this.getRendererComponentInsets(c);
        if (rendererInsets != null) {
            bounds = FlatUIUtils.addInsets(bounds, rendererInsets);
        }
        this.currentValuePane.paintComponent(g, c, this.comboBox, bounds.x, bounds.y, bounds.width, bounds.height, shouldValidate);
    }
    
    @Override
    public void paintCurrentValueBackground(final Graphics g, final Rectangle bounds, final boolean hasFocus) {
    }
    
    protected Color getBackground(final boolean enabled) {
        return enabled ? ((this.editableBackground != null && this.comboBox.isEditable()) ? this.editableBackground : this.comboBox.getBackground()) : (this.isIntelliJTheme ? FlatUIUtils.getParentBackground(this.comboBox) : this.disabledBackground);
    }
    
    protected Color getForeground(final boolean enabled) {
        return enabled ? this.comboBox.getForeground() : this.disabledForeground;
    }
    
    @Override
    public Dimension getMinimumSize(final JComponent c) {
        final Dimension minimumSize = super.getMinimumSize(c);
        minimumSize.width = Math.max(minimumSize.width, UIScale.scale(FlatUIUtils.minimumWidth(c, this.minimumWidth)));
        return minimumSize;
    }
    
    @Override
    protected Dimension getDefaultSize() {
        final ListCellRenderer<Object> renderer = (ListCellRenderer<Object>)this.comboBox.getRenderer();
        this.uninstallCellPaddingBorder(renderer);
        final Dimension size = super.getDefaultSize();
        this.uninstallCellPaddingBorder(renderer);
        return size;
    }
    
    @Override
    protected Dimension getDisplaySize() {
        final ListCellRenderer<Object> renderer = (ListCellRenderer<Object>)this.comboBox.getRenderer();
        this.uninstallCellPaddingBorder(renderer);
        Dimension displaySize = super.getDisplaySize();
        if (displaySize.width == 100 + this.padding.left + this.padding.right && this.comboBox.isEditable() && this.comboBox.getItemCount() == 0 && this.comboBox.getPrototypeDisplayValue() == null) {
            int width = this.getDefaultSize().width;
            width = Math.max(width, this.editor.getPreferredSize().width);
            width += this.padding.left + this.padding.right;
            displaySize = new Dimension(width, displaySize.height);
        }
        this.uninstallCellPaddingBorder(renderer);
        return displaySize;
    }
    
    @Override
    protected Dimension getSizeForComponent(final Component comp) {
        Dimension size = super.getSizeForComponent(comp);
        final Insets rendererInsets = this.getRendererComponentInsets(comp);
        if (rendererInsets != null) {
            size = new Dimension(size.width, size.height - rendererInsets.top - rendererInsets.bottom);
        }
        return size;
    }
    
    private Insets getRendererComponentInsets(final Component rendererComponent) {
        if (rendererComponent instanceof JComponent) {
            final Border rendererBorder = ((JComponent)rendererComponent).getBorder();
            if (rendererBorder != null) {
                return rendererBorder.getBorderInsets(rendererComponent);
            }
        }
        return null;
    }
    
    private void uninstallCellPaddingBorder(final Object o) {
        CellPaddingBorder.uninstall(o);
        if (this.lastRendererComponent != null) {
            CellPaddingBorder.uninstall(this.lastRendererComponent);
            this.lastRendererComponent = null;
        }
    }
    
    protected class FlatComboBoxButton extends FlatArrowButton
    {
        protected FlatComboBoxButton(final FlatComboBoxUI this$0) {
            this(this$0, 5, this$0.arrowType, this$0.buttonArrowColor, this$0.buttonDisabledArrowColor, this$0.buttonHoverArrowColor, null, null);
        }
        
        protected FlatComboBoxButton(final int direction, final String type, final Color foreground, final Color disabledForeground, final Color hoverForeground, final Color hoverBackground, final Color pressedBackground) {
            super(direction, type, foreground, disabledForeground, hoverForeground, hoverBackground, pressedBackground);
        }
        
        @Override
        protected boolean isHover() {
            return super.isHover() || (!FlatComboBoxUI.this.comboBox.isEditable() && FlatComboBoxUI.this.hover);
        }
    }
    
    protected class FlatComboPopup extends BasicComboPopup
    {
        private CellPaddingBorder paddingBorder;
        
        protected FlatComboPopup(final JComboBox combo) {
            super(combo);
            final ComponentOrientation o = this.comboBox.getComponentOrientation();
            this.list.setComponentOrientation(o);
            this.scroller.setComponentOrientation(o);
            this.setComponentOrientation(o);
        }
        
        @Override
        protected Rectangle computePopupBounds(int px, final int py, int pw, final int ph) {
            final Dimension displaySize = FlatComboBoxUI.this.getDisplaySize();
            if (displaySize.width > pw) {
                final int diff = displaySize.width - pw;
                pw = displaySize.width;
                if (!this.comboBox.getComponentOrientation().isLeftToRight()) {
                    px -= diff;
                }
            }
            return super.computePopupBounds(px, py, pw, ph);
        }
        
        @Override
        protected void configurePopup() {
            super.configurePopup();
            final Border border = UIManager.getBorder("PopupMenu.border");
            if (border != null) {
                this.setBorder(border);
            }
        }
        
        @Override
        protected void configureList() {
            super.configureList();
            this.list.setCellRenderer(new PopupListCellRenderer());
        }
        
        @Override
        protected PropertyChangeListener createPropertyChangeListener() {
            return new BasicComboPopup.PropertyChangeHandler() {
                @Override
                public void propertyChange(final PropertyChangeEvent e) {
                    super.propertyChange(e);
                    if (e.getPropertyName() == "renderer") {
                        FlatComboPopup.this.list.setCellRenderer(new PopupListCellRenderer());
                    }
                }
            };
        }
        
        private class PopupListCellRenderer implements ListCellRenderer
        {
            @Override
            public Component getListCellRendererComponent(final JList list, final Object value, final int index, final boolean isSelected, final boolean cellHasFocus) {
                ListCellRenderer renderer = FlatComboPopup.this.comboBox.getRenderer();
                CellPaddingBorder.uninstall(renderer);
                CellPaddingBorder.uninstall(FlatComboBoxUI.this.lastRendererComponent);
                if (renderer == null) {
                    renderer = new DefaultListCellRenderer();
                }
                final Component c = renderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                c.applyComponentOrientation(FlatComboPopup.this.comboBox.getComponentOrientation());
                if (c instanceof JComponent) {
                    if (FlatComboPopup.this.paddingBorder == null) {
                        FlatComboPopup.this.paddingBorder = new CellPaddingBorder(FlatComboBoxUI.this.padding);
                    }
                    FlatComboPopup.this.paddingBorder.install((JComponent)c);
                }
                FlatComboBoxUI.this.lastRendererComponent = (WeakReference<Component>)((c != renderer) ? new WeakReference((T)c) : null);
                return c;
            }
        }
    }
    
    private static class CellPaddingBorder extends AbstractBorder
    {
        private final Insets padding;
        private Border rendererBorder;
        
        CellPaddingBorder(final Insets padding) {
            this.padding = padding;
        }
        
        void install(final JComponent rendererComponent) {
            final Border oldBorder = rendererComponent.getBorder();
            if (!(oldBorder instanceof CellPaddingBorder)) {
                this.rendererBorder = oldBorder;
                rendererComponent.setBorder(this);
            }
        }
        
        static void uninstall(Object o) {
            if (o instanceof WeakReference) {
                o = ((WeakReference)o).get();
            }
            if (!(o instanceof JComponent)) {
                return;
            }
            final JComponent rendererComponent = (JComponent)o;
            final Border border = rendererComponent.getBorder();
            if (border instanceof CellPaddingBorder) {
                final CellPaddingBorder paddingBorder = (CellPaddingBorder)border;
                rendererComponent.setBorder(paddingBorder.rendererBorder);
                paddingBorder.rendererBorder = null;
            }
        }
        
        @Override
        public Insets getBorderInsets(final Component c, final Insets insets) {
            if (this.rendererBorder != null) {
                final Insets insideInsets = this.rendererBorder.getBorderInsets(c);
                insets.top = Math.max(this.padding.top, insideInsets.top);
                insets.left = Math.max(this.padding.left, insideInsets.left);
                insets.bottom = Math.max(this.padding.bottom, insideInsets.bottom);
                insets.right = Math.max(this.padding.right, insideInsets.right);
            }
            else {
                insets.top = this.padding.top;
                insets.left = this.padding.left;
                insets.bottom = this.padding.bottom;
                insets.right = this.padding.right;
            }
            return insets;
        }
        
        @Override
        public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
            if (this.rendererBorder != null) {
                this.rendererBorder.paintBorder(c, g, x, y, width, height);
            }
        }
    }
    
    private class EditorDelegateAction extends AbstractAction
    {
        private final KeyStroke keyStroke;
        
        EditorDelegateAction(final InputMap inputMap, final KeyStroke keyStroke) {
            inputMap.put(this.keyStroke = keyStroke, this);
        }
        
        @Override
        public void actionPerformed(final ActionEvent e) {
            final ActionListener action = FlatComboBoxUI.this.comboBox.getActionForKeyStroke(this.keyStroke);
            if (action != null) {
                action.actionPerformed(new ActionEvent(FlatComboBoxUI.this.comboBox, e.getID(), e.getActionCommand(), e.getWhen(), e.getModifiers()));
            }
        }
    }
}
