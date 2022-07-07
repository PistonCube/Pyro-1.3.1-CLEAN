// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.Cursor;
import javax.swing.JButton;
import com.formdev.flatlaf.util.UIScale;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.JComponent;
import java.awt.Color;
import javax.swing.plaf.basic.BasicSplitPaneUI;

public class FlatSplitPaneUI extends BasicSplitPaneUI
{
    protected String arrowType;
    private Boolean continuousLayout;
    private Color oneTouchArrowColor;
    private Color oneTouchHoverArrowColor;
    
    public static ComponentUI createUI(final JComponent c) {
        return new FlatSplitPaneUI();
    }
    
    @Override
    protected void installDefaults() {
        this.arrowType = UIManager.getString("Component.arrowType");
        this.oneTouchArrowColor = UIManager.getColor("SplitPaneDivider.oneTouchArrowColor");
        this.oneTouchHoverArrowColor = UIManager.getColor("SplitPaneDivider.oneTouchHoverArrowColor");
        super.installDefaults();
        this.continuousLayout = (Boolean)UIManager.get("SplitPane.continuousLayout");
    }
    
    @Override
    public boolean isContinuousLayout() {
        return super.isContinuousLayout() || (this.continuousLayout != null && Boolean.TRUE.equals(this.continuousLayout));
    }
    
    @Override
    public BasicSplitPaneDivider createDefaultDivider() {
        return new FlatSplitPaneDivider(this);
    }
    
    protected class FlatSplitPaneDivider extends BasicSplitPaneDivider
    {
        final /* synthetic */ FlatSplitPaneUI this$0;
        
        protected FlatSplitPaneDivider(final BasicSplitPaneUI ui) {
            super(ui);
        }
        
        @Override
        public void setDividerSize(final int newSize) {
            super.setDividerSize(UIScale.scale(newSize));
        }
        
        @Override
        protected JButton createLeftOneTouchButton() {
            return new FlatOneTouchButton(true);
        }
        
        @Override
        protected JButton createRightOneTouchButton() {
            return new FlatOneTouchButton(false);
        }
        
        private class FlatOneTouchButton extends FlatArrowButton
        {
            private final boolean left;
            
            public FlatOneTouchButton(final boolean left) {
                super(1, FlatSplitPaneDivider.this.this$0.arrowType, FlatSplitPaneDivider.this.this$0.oneTouchArrowColor, null, FlatSplitPaneDivider.this.this$0.oneTouchHoverArrowColor, null);
                this.setCursor(Cursor.getPredefinedCursor(0));
                this.left = left;
            }
            
            @Override
            public int getDirection() {
                return (FlatSplitPaneDivider.this.orientation == 0) ? (this.left ? 1 : 5) : (this.left ? 7 : 3);
            }
        }
    }
}
