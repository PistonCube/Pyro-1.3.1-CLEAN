// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.EventQueue;
import javax.swing.JFormattedTextField;
import java.awt.event.MouseEvent;
import java.awt.event.FocusEvent;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.plaf.UIResource;
import javax.swing.text.DefaultCaret;

public class FlatCaret extends DefaultCaret implements UIResource
{
    private final String selectAllOnFocusPolicy;
    private boolean wasFocused;
    private boolean wasTemporaryLost;
    private boolean isMousePressed;
    
    public FlatCaret(final String selectAllOnFocusPolicy) {
        this.selectAllOnFocusPolicy = selectAllOnFocusPolicy;
    }
    
    @Override
    public void install(final JTextComponent c) {
        super.install(c);
        final Document doc = c.getDocument();
        if (doc != null && this.getDot() == 0 && this.getMark() == 0) {
            final int length = doc.getLength();
            if (length > 0) {
                this.setDot(length);
            }
        }
    }
    
    @Override
    public void focusGained(final FocusEvent e) {
        if (!this.wasTemporaryLost && !this.isMousePressed) {
            this.selectAllOnFocusGained();
        }
        this.wasTemporaryLost = false;
        this.wasFocused = true;
        super.focusGained(e);
    }
    
    @Override
    public void focusLost(final FocusEvent e) {
        this.wasTemporaryLost = e.isTemporary();
        super.focusLost(e);
    }
    
    @Override
    public void mousePressed(final MouseEvent e) {
        this.isMousePressed = true;
        super.mousePressed(e);
    }
    
    @Override
    public void mouseReleased(final MouseEvent e) {
        this.isMousePressed = false;
        super.mouseReleased(e);
    }
    
    protected void selectAllOnFocusGained() {
        final JTextComponent c = this.getComponent();
        final Document doc = c.getDocument();
        if (doc == null || !c.isEnabled() || !c.isEditable()) {
            return;
        }
        Object selectAllOnFocusPolicy = c.getClientProperty("JTextField.selectAllOnFocusPolicy");
        if (selectAllOnFocusPolicy == null) {
            selectAllOnFocusPolicy = this.selectAllOnFocusPolicy;
        }
        if ("never".equals(selectAllOnFocusPolicy)) {
            return;
        }
        if (!"always".equals(selectAllOnFocusPolicy)) {
            if (this.wasFocused) {
                return;
            }
            final int dot = this.getDot();
            final int mark = this.getMark();
            if (dot != mark || dot != doc.getLength()) {
                return;
            }
        }
        if (c instanceof JFormattedTextField) {
            final Document document;
            EventQueue.invokeLater(() -> {
                this.setDot(0);
                this.moveDot(document.getLength());
            });
        }
        else {
            this.setDot(0);
            this.moveDot(doc.getLength());
        }
    }
}
