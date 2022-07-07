// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.ui;

import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.awt.event.WindowAdapter;
import javax.swing.border.AbstractBorder;
import java.awt.event.ActionEvent;
import java.awt.Point;
import java.util.ArrayList;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;
import java.awt.geom.AffineTransform;
import java.awt.GraphicsConfiguration;
import com.formdev.flatlaf.util.SystemInfo;
import java.util.Objects;
import java.awt.Graphics;
import java.awt.EventQueue;
import java.awt.Rectangle;
import com.formdev.flatlaf.FlatSystemProperties;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.event.ComponentListener;
import java.awt.event.WindowStateListener;
import java.awt.event.WindowListener;
import java.beans.PropertyChangeListener;
import java.awt.Dialog;
import javax.swing.SwingUtilities;
import javax.swing.Icon;
import java.awt.Image;
import java.util.List;
import com.formdev.flatlaf.util.ScaledImageIcon;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import java.awt.event.ActionListener;
import java.awt.Frame;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.BoxLayout;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import javax.swing.border.Border;
import javax.swing.UIManager;
import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JComponent;

public class FlatTitlePane extends JComponent
{
    protected final Color activeBackground;
    protected final Color inactiveBackground;
    protected final Color activeForeground;
    protected final Color inactiveForeground;
    protected final Color embeddedForeground;
    protected final Insets menuBarMargins;
    protected final Dimension iconSize;
    protected final int buttonMaximizedHeight;
    protected final JRootPane rootPane;
    protected JPanel leftPanel;
    protected JLabel iconLabel;
    protected JComponent menuBarPlaceholder;
    protected JLabel titleLabel;
    protected JPanel buttonPanel;
    protected JButton iconifyButton;
    protected JButton maximizeButton;
    protected JButton restoreButton;
    protected JButton closeButton;
    protected Window window;
    private final Handler handler;
    
    public FlatTitlePane(final JRootPane rootPane) {
        this.activeBackground = UIManager.getColor("TitlePane.background");
        this.inactiveBackground = UIManager.getColor("TitlePane.inactiveBackground");
        this.activeForeground = UIManager.getColor("TitlePane.foreground");
        this.inactiveForeground = UIManager.getColor("TitlePane.inactiveForeground");
        this.embeddedForeground = UIManager.getColor("TitlePane.embeddedForeground");
        this.menuBarMargins = UIManager.getInsets("TitlePane.menuBarMargins");
        this.iconSize = UIManager.getDimension("TitlePane.iconSize");
        this.buttonMaximizedHeight = UIManager.getInt("TitlePane.buttonMaximizedHeight");
        this.rootPane = rootPane;
        this.handler = this.createHandler();
        this.setBorder(this.createTitlePaneBorder());
        this.addSubComponents();
        this.activeChanged(true);
        this.addMouseListener(this.handler);
        this.addMouseMotionListener(this.handler);
        this.iconLabel.addMouseListener(this.handler);
    }
    
    protected FlatTitlePaneBorder createTitlePaneBorder() {
        return new FlatTitlePaneBorder();
    }
    
    protected Handler createHandler() {
        return new Handler();
    }
    
    protected void addSubComponents() {
        this.leftPanel = new JPanel();
        this.iconLabel = new JLabel();
        this.titleLabel = new JLabel();
        this.iconLabel.setBorder(new FlatEmptyBorder(UIManager.getInsets("TitlePane.iconMargins")));
        this.titleLabel.setBorder(new FlatEmptyBorder(UIManager.getInsets("TitlePane.titleMargins")));
        this.leftPanel.setLayout(new BoxLayout(this.leftPanel, 2));
        this.leftPanel.setOpaque(false);
        this.leftPanel.add(this.iconLabel);
        this.menuBarPlaceholder = new JComponent() {
            @Override
            public Dimension getPreferredSize() {
                final JMenuBar menuBar = FlatTitlePane.this.rootPane.getJMenuBar();
                return (menuBar != null && FlatTitlePane.this.isMenuBarEmbedded()) ? FlatUIUtils.addInsets(menuBar.getPreferredSize(), UIScale.scale(FlatTitlePane.this.menuBarMargins)) : new Dimension();
            }
        };
        this.leftPanel.add(this.menuBarPlaceholder);
        this.createButtons();
        this.setLayout(new BorderLayout());
        this.add(this.leftPanel, "Before");
        this.add(this.titleLabel, "Center");
        this.add(this.buttonPanel, "After");
    }
    
    protected void createButtons() {
        this.iconifyButton = this.createButton("TitlePane.iconifyIcon", "Iconify", e -> this.iconify());
        this.maximizeButton = this.createButton("TitlePane.maximizeIcon", "Maximize", e -> this.maximize());
        this.restoreButton = this.createButton("TitlePane.restoreIcon", "Restore", e -> this.restore());
        this.closeButton = this.createButton("TitlePane.closeIcon", "Close", e -> this.close());
        (this.buttonPanel = new JPanel() {
            @Override
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                if (FlatTitlePane.this.buttonMaximizedHeight > 0 && FlatTitlePane.this.window instanceof Frame && (((Frame)FlatTitlePane.this.window).getExtendedState() & 0x6) != 0x0) {
                    size = new Dimension(size.width, Math.min(size.height, UIScale.scale(FlatTitlePane.this.buttonMaximizedHeight)));
                }
                return size;
            }
        }).setOpaque(false);
        this.buttonPanel.setLayout(new BoxLayout(this.buttonPanel, 2));
        if (this.rootPane.getWindowDecorationStyle() == 1) {
            this.restoreButton.setVisible(false);
            this.buttonPanel.add(this.iconifyButton);
            this.buttonPanel.add(this.maximizeButton);
            this.buttonPanel.add(this.restoreButton);
        }
        this.buttonPanel.add(this.closeButton);
    }
    
    protected JButton createButton(final String iconKey, final String accessibleName, final ActionListener action) {
        final JButton button = new JButton(UIManager.getIcon(iconKey));
        button.setFocusable(false);
        button.setContentAreaFilled(false);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.putClientProperty("AccessibleName", accessibleName);
        button.addActionListener(action);
        return button;
    }
    
    protected void activeChanged(final boolean active) {
        final boolean hasEmbeddedMenuBar = this.rootPane.getJMenuBar() != null && this.isMenuBarEmbedded();
        final Color background = FlatUIUtils.nonUIResource(active ? this.activeBackground : this.inactiveBackground);
        final Color foreground = FlatUIUtils.nonUIResource(active ? (hasEmbeddedMenuBar ? this.embeddedForeground : this.activeForeground) : this.inactiveForeground);
        this.setBackground(background);
        this.titleLabel.setForeground(foreground);
        this.titleLabel.setHorizontalAlignment(hasEmbeddedMenuBar ? 0 : 10);
        this.iconifyButton.setBackground(background);
        this.maximizeButton.setBackground(background);
        this.restoreButton.setBackground(background);
        this.closeButton.setBackground(background);
    }
    
    protected void frameStateChanged() {
        if (this.window == null || this.rootPane.getWindowDecorationStyle() != 1) {
            return;
        }
        if (this.window instanceof Frame) {
            final Frame frame = (Frame)this.window;
            final boolean resizable = frame.isResizable();
            final boolean maximized = (frame.getExtendedState() & 0x6) != 0x0;
            this.iconifyButton.setVisible(true);
            this.maximizeButton.setVisible(resizable && !maximized);
            this.restoreButton.setVisible(resizable && maximized);
        }
        else {
            this.iconifyButton.setVisible(false);
            this.maximizeButton.setVisible(false);
            this.restoreButton.setVisible(false);
            this.revalidate();
            this.repaint();
        }
    }
    
    protected void updateIcon() {
        List<Image> images = this.window.getIconImages();
        if (images.isEmpty()) {
            for (Window owner = this.window.getOwner(); owner != null; owner = owner.getOwner()) {
                images = owner.getIconImages();
                if (!images.isEmpty()) {
                    break;
                }
            }
        }
        boolean hasIcon = true;
        if (!images.isEmpty()) {
            this.iconLabel.setIcon(FlatTitlePaneIcon.create(images, this.iconSize));
        }
        else {
            Icon defaultIcon = UIManager.getIcon("InternalFrame.icon");
            if (defaultIcon != null && (defaultIcon.getIconWidth() == 0 || defaultIcon.getIconHeight() == 0)) {
                defaultIcon = null;
            }
            if (defaultIcon != null) {
                if (defaultIcon instanceof ImageIcon) {
                    defaultIcon = new ScaledImageIcon((ImageIcon)defaultIcon, this.iconSize.width, this.iconSize.height);
                }
                this.iconLabel.setIcon(defaultIcon);
            }
            else {
                hasIcon = false;
            }
        }
        this.iconLabel.setVisible(hasIcon);
        this.updateJBRHitTestSpotsAndTitleBarHeightLater();
    }
    
    @Override
    public void addNotify() {
        super.addNotify();
        this.uninstallWindowListeners();
        this.window = SwingUtilities.getWindowAncestor(this);
        if (this.window != null) {
            this.frameStateChanged();
            this.activeChanged(this.window.isActive());
            this.updateIcon();
            this.titleLabel.setText(this.getWindowTitle());
            this.installWindowListeners();
        }
        this.updateJBRHitTestSpotsAndTitleBarHeightLater();
    }
    
    @Override
    public void removeNotify() {
        super.removeNotify();
        this.uninstallWindowListeners();
        this.window = null;
    }
    
    protected String getWindowTitle() {
        if (this.window instanceof Frame) {
            return ((Frame)this.window).getTitle();
        }
        if (this.window instanceof Dialog) {
            return ((Dialog)this.window).getTitle();
        }
        return null;
    }
    
    protected void installWindowListeners() {
        if (this.window == null) {
            return;
        }
        this.window.addPropertyChangeListener(this.handler);
        this.window.addWindowListener(this.handler);
        this.window.addWindowStateListener(this.handler);
        this.window.addComponentListener(this.handler);
    }
    
    protected void uninstallWindowListeners() {
        if (this.window == null) {
            return;
        }
        this.window.removePropertyChangeListener(this.handler);
        this.window.removeWindowListener(this.handler);
        this.window.removeWindowStateListener(this.handler);
        this.window.removeComponentListener(this.handler);
    }
    
    protected boolean isMenuBarEmbedded() {
        return UIManager.getBoolean("TitlePane.menuBarEmbedded") && FlatClientProperties.clientPropertyBoolean(this.rootPane, "JRootPane.menuBarEmbedded", true) && FlatSystemProperties.getBoolean("flatlaf.menuBarEmbedded", true);
    }
    
    protected Rectangle getMenuBarBounds() {
        final Insets insets = this.rootPane.getInsets();
        final Rectangle bounds = new Rectangle(SwingUtilities.convertPoint(this.menuBarPlaceholder, -insets.left, -insets.top, this.rootPane), this.menuBarPlaceholder.getSize());
        final Insets borderInsets = this.getBorder().getBorderInsets(this);
        final Rectangle rectangle = bounds;
        rectangle.height += borderInsets.bottom;
        return FlatUIUtils.subtractInsets(bounds, UIScale.scale(this.getMenuBarMargins()));
    }
    
    protected void menuBarChanged() {
        this.menuBarPlaceholder.invalidate();
        EventQueue.invokeLater(() -> this.activeChanged(this.window == null || this.window.isActive()));
    }
    
    protected Insets getMenuBarMargins() {
        return this.getComponentOrientation().isLeftToRight() ? this.menuBarMargins : new Insets(this.menuBarMargins.top, this.menuBarMargins.right, this.menuBarMargins.bottom, this.menuBarMargins.left);
    }
    
    @Override
    protected void paintComponent(final Graphics g) {
        g.setColor(this.getBackground());
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
    
    protected void repaintWindowBorder() {
        final int width = this.rootPane.getWidth();
        final int height = this.rootPane.getHeight();
        final Insets insets = this.rootPane.getInsets();
        this.rootPane.repaint(0, 0, width, insets.top);
        this.rootPane.repaint(0, 0, insets.left, height);
        this.rootPane.repaint(0, height - insets.bottom, width, insets.bottom);
        this.rootPane.repaint(width - insets.right, 0, insets.right, height);
    }
    
    protected void iconify() {
        if (this.window instanceof Frame) {
            final Frame frame = (Frame)this.window;
            frame.setExtendedState(frame.getExtendedState() | 0x1);
        }
    }
    
    protected void maximize() {
        if (!(this.window instanceof Frame)) {
            return;
        }
        final Frame frame = (Frame)this.window;
        if (!this.hasJBRCustomDecoration() && (frame.getMaximizedBounds() == null || Objects.equals(frame.getMaximizedBounds(), this.rootPane.getClientProperty("_flatlaf.maximizedBounds")))) {
            final GraphicsConfiguration gc = this.window.getGraphicsConfiguration();
            final Rectangle screenBounds = gc.getBounds();
            int maximizedX = screenBounds.x;
            int maximizedY = screenBounds.y;
            int maximizedWidth = screenBounds.width;
            int maximizedHeight = screenBounds.height;
            if (!SystemInfo.IS_JAVA_15_OR_LATER) {
                maximizedX = 0;
                maximizedY = 0;
                final AffineTransform defaultTransform = gc.getDefaultTransform();
                maximizedWidth *= (int)defaultTransform.getScaleX();
                maximizedHeight *= (int)defaultTransform.getScaleY();
            }
            final Insets screenInsets = this.window.getToolkit().getScreenInsets(gc);
            final Rectangle maximizedBounds = new Rectangle(maximizedX + screenInsets.left, maximizedY + screenInsets.top, maximizedWidth - screenInsets.left - screenInsets.right, maximizedHeight - screenInsets.top - screenInsets.bottom);
            frame.setMaximizedBounds(maximizedBounds);
            this.rootPane.putClientProperty("_flatlaf.maximizedBounds", maximizedBounds);
        }
        frame.setExtendedState(frame.getExtendedState() | 0x6);
    }
    
    protected void restore() {
        if (this.window instanceof Frame) {
            final Frame frame = (Frame)this.window;
            final int state = frame.getExtendedState();
            frame.setExtendedState(((state & 0x1) != 0x0) ? (state & 0xFFFFFFFE) : (state & 0xFFFFFFF9));
        }
    }
    
    protected void close() {
        if (this.window != null) {
            this.window.dispatchEvent(new WindowEvent(this.window, 201));
        }
    }
    
    protected boolean hasJBRCustomDecoration() {
        return FlatRootPaneUI.canUseJBRCustomDecorations && this.window != null && JBRCustomDecorations.hasCustomDecoration(this.window);
    }
    
    protected void updateJBRHitTestSpotsAndTitleBarHeightLater() {
        EventQueue.invokeLater(() -> this.updateJBRHitTestSpotsAndTitleBarHeight());
    }
    
    protected void updateJBRHitTestSpotsAndTitleBarHeight() {
        if (!this.isDisplayable()) {
            return;
        }
        if (!this.hasJBRCustomDecoration()) {
            return;
        }
        final List<Rectangle> hitTestSpots = new ArrayList<Rectangle>();
        if (this.iconLabel.isVisible()) {
            this.addJBRHitTestSpot(this.iconLabel, false, hitTestSpots);
        }
        this.addJBRHitTestSpot(this.buttonPanel, false, hitTestSpots);
        this.addJBRHitTestSpot(this.menuBarPlaceholder, true, hitTestSpots);
        int titleBarHeight = this.getHeight();
        if (titleBarHeight > 0) {
            --titleBarHeight;
        }
        JBRCustomDecorations.setHitTestSpotsAndTitleBarHeight(this.window, hitTestSpots, titleBarHeight);
    }
    
    protected void addJBRHitTestSpot(final JComponent c, final boolean subtractMenuBarMargins, final List<Rectangle> hitTestSpots) {
        final Dimension size = c.getSize();
        if (size.width <= 0 || size.height <= 0) {
            return;
        }
        final Point location = SwingUtilities.convertPoint(c, 0, 0, this.window);
        Rectangle r = new Rectangle(location, size);
        if (subtractMenuBarMargins) {
            r = FlatUIUtils.subtractInsets(r, UIScale.scale(this.getMenuBarMargins()));
        }
        r.grow(2, 2);
        hitTestSpots.add(r);
    }
    
    protected class FlatTitlePaneBorder extends AbstractBorder
    {
        @Override
        public Insets getBorderInsets(final Component c, Insets insets) {
            super.getBorderInsets(c, insets);
            final Border menuBarBorder = this.getMenuBarBorder();
            if (menuBarBorder != null) {
                final Insets menuBarInsets = menuBarBorder.getBorderInsets(c);
                final Insets insets2 = insets;
                insets2.bottom += menuBarInsets.bottom;
            }
            if (FlatTitlePane.this.hasJBRCustomDecoration()) {
                insets = FlatUIUtils.addInsets(insets, JBRCustomDecorations.JBRWindowTopBorder.getInstance().getBorderInsets());
            }
            return insets;
        }
        
        @Override
        public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
            final Border menuBarBorder = this.getMenuBarBorder();
            if (menuBarBorder != null) {
                menuBarBorder.paintBorder(c, g, x, y, width, height);
            }
            if (FlatTitlePane.this.hasJBRCustomDecoration()) {
                JBRCustomDecorations.JBRWindowTopBorder.getInstance().paintBorder(c, g, x, y, width, height);
            }
        }
        
        protected Border getMenuBarBorder() {
            final JMenuBar menuBar = FlatTitlePane.this.rootPane.getJMenuBar();
            return (menuBar != null && FlatTitlePane.this.isMenuBarEmbedded()) ? menuBar.getBorder() : null;
        }
    }
    
    protected class Handler extends WindowAdapter implements PropertyChangeListener, MouseListener, MouseMotionListener, ComponentListener
    {
        private int lastXOnScreen;
        private int lastYOnScreen;
        
        @Override
        public void propertyChange(final PropertyChangeEvent e) {
            final String propertyName = e.getPropertyName();
            switch (propertyName) {
                case "title": {
                    FlatTitlePane.this.titleLabel.setText(FlatTitlePane.this.getWindowTitle());
                    break;
                }
                case "resizable": {
                    if (FlatTitlePane.this.window instanceof Frame) {
                        FlatTitlePane.this.frameStateChanged();
                        break;
                    }
                    break;
                }
                case "iconImage": {
                    FlatTitlePane.this.updateIcon();
                    break;
                }
                case "componentOrientation": {
                    FlatTitlePane.this.updateJBRHitTestSpotsAndTitleBarHeightLater();
                    break;
                }
            }
        }
        
        @Override
        public void windowActivated(final WindowEvent e) {
            FlatTitlePane.this.activeChanged(true);
            FlatTitlePane.this.updateJBRHitTestSpotsAndTitleBarHeight();
            if (FlatTitlePane.this.hasJBRCustomDecoration()) {
                JBRCustomDecorations.JBRWindowTopBorder.getInstance().repaintBorder(FlatTitlePane.this);
            }
            FlatTitlePane.this.repaintWindowBorder();
        }
        
        @Override
        public void windowDeactivated(final WindowEvent e) {
            FlatTitlePane.this.activeChanged(false);
            FlatTitlePane.this.updateJBRHitTestSpotsAndTitleBarHeight();
            if (FlatTitlePane.this.hasJBRCustomDecoration()) {
                JBRCustomDecorations.JBRWindowTopBorder.getInstance().repaintBorder(FlatTitlePane.this);
            }
            FlatTitlePane.this.repaintWindowBorder();
        }
        
        @Override
        public void windowStateChanged(final WindowEvent e) {
            FlatTitlePane.this.frameStateChanged();
            FlatTitlePane.this.updateJBRHitTestSpotsAndTitleBarHeight();
        }
        
        @Override
        public void mouseClicked(final MouseEvent e) {
            if (e.getClickCount() == 2 && SwingUtilities.isLeftMouseButton(e)) {
                if (e.getSource() == FlatTitlePane.this.iconLabel) {
                    FlatTitlePane.this.close();
                }
                else if (!FlatTitlePane.this.hasJBRCustomDecoration() && FlatTitlePane.this.window instanceof Frame && ((Frame)FlatTitlePane.this.window).isResizable()) {
                    final Frame frame = (Frame)FlatTitlePane.this.window;
                    if ((frame.getExtendedState() & 0x6) != 0x0) {
                        FlatTitlePane.this.restore();
                    }
                    else {
                        FlatTitlePane.this.maximize();
                    }
                }
            }
        }
        
        @Override
        public void mousePressed(final MouseEvent e) {
            this.lastXOnScreen = e.getXOnScreen();
            this.lastYOnScreen = e.getYOnScreen();
        }
        
        @Override
        public void mouseReleased(final MouseEvent e) {
        }
        
        @Override
        public void mouseEntered(final MouseEvent e) {
        }
        
        @Override
        public void mouseExited(final MouseEvent e) {
        }
        
        @Override
        public void mouseDragged(final MouseEvent e) {
            if (FlatTitlePane.this.hasJBRCustomDecoration()) {
                return;
            }
            final int xOnScreen = e.getXOnScreen();
            final int yOnScreen = e.getYOnScreen();
            if (this.lastXOnScreen == xOnScreen && this.lastYOnScreen == yOnScreen) {
                return;
            }
            if (FlatTitlePane.this.window instanceof Frame) {
                final Frame frame = (Frame)FlatTitlePane.this.window;
                final int state = frame.getExtendedState();
                if ((state & 0x6) != 0x0) {
                    final int maximizedX = FlatTitlePane.this.window.getX();
                    final int maximizedY = FlatTitlePane.this.window.getY();
                    frame.setExtendedState(state & 0xFFFFFFF9);
                    final int restoredWidth = FlatTitlePane.this.window.getWidth();
                    int newX = maximizedX;
                    final JComponent rightComp = FlatTitlePane.this.getComponentOrientation().isLeftToRight() ? FlatTitlePane.this.buttonPanel : FlatTitlePane.this.leftPanel;
                    if (xOnScreen >= maximizedX + restoredWidth - rightComp.getWidth() - 10) {
                        newX = xOnScreen + rightComp.getWidth() + 10 - restoredWidth;
                    }
                    FlatTitlePane.this.window.setLocation(newX, maximizedY);
                    return;
                }
            }
            final int newX2 = FlatTitlePane.this.window.getX() + (xOnScreen - this.lastXOnScreen);
            final int newY = FlatTitlePane.this.window.getY() + (yOnScreen - this.lastYOnScreen);
            FlatTitlePane.this.window.setLocation(newX2, newY);
            this.lastXOnScreen = xOnScreen;
            this.lastYOnScreen = yOnScreen;
        }
        
        @Override
        public void mouseMoved(final MouseEvent e) {
        }
        
        @Override
        public void componentResized(final ComponentEvent e) {
            FlatTitlePane.this.updateJBRHitTestSpotsAndTitleBarHeightLater();
        }
        
        @Override
        public void componentMoved(final ComponentEvent e) {
        }
        
        @Override
        public void componentShown(final ComponentEvent e) {
        }
        
        @Override
        public void componentHidden(final ComponentEvent e) {
        }
    }
}
