// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf;

import java.util.Hashtable;
import javax.swing.plaf.UIResource;
import java.awt.Component;
import javax.swing.SwingUtilities;
import java.awt.Window;
import java.awt.EventQueue;
import javax.swing.UnsupportedLookAndFeelException;
import java.beans.PropertyChangeEvent;
import java.awt.RenderingHints;
import java.util.Map;
import javax.swing.plaf.ColorUIResource;
import javax.swing.text.StyleContext;
import javax.swing.plaf.FontUIResource;
import java.awt.Font;
import java.util.Properties;
import java.util.Iterator;
import java.util.List;
import com.formdev.flatlaf.util.UIScale;
import javax.swing.BorderFactory;
import java.util.ArrayList;
import java.util.ServiceLoader;
import java.lang.reflect.Method;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.text.html.HTMLEditorKit;
import com.formdev.flatlaf.ui.FlatPopupFactory;
import java.awt.Image;
import java.util.function.Function;
import java.awt.image.ImageProducer;
import com.formdev.flatlaf.util.MultiResolutionImageSupport;
import java.awt.Toolkit;
import java.awt.image.FilteredImageSource;
import com.formdev.flatlaf.util.GrayFilter;
import java.awt.image.ImageFilter;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JComponent;
import com.formdev.flatlaf.ui.JBRCustomDecorations;
import com.formdev.flatlaf.util.SystemInfo;
import java.util.logging.Level;
import javax.swing.UIManager;
import javax.swing.LookAndFeel;
import javax.swing.UIDefaults;
import java.util.function.Consumer;
import javax.swing.PopupFactory;
import java.beans.PropertyChangeListener;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicLookAndFeel;

public abstract class FlatLaf extends BasicLookAndFeel
{
    static final Logger LOG;
    private static final String DESKTOPFONTHINTS = "awt.font.desktophints";
    private String desktopPropertyName;
    private String desktopPropertyName2;
    private PropertyChangeListener desktopPropertyListener;
    private static boolean aquaLoaded;
    private static boolean updateUIPending;
    private PopupFactory oldPopupFactory;
    private MnemonicHandler mnemonicHandler;
    private Consumer<UIDefaults> postInitialization;
    private Boolean oldFrameWindowDecorated;
    private Boolean oldDialogWindowDecorated;
    
    public static boolean install(final LookAndFeel newLookAndFeel) {
        try {
            UIManager.setLookAndFeel(newLookAndFeel);
            return true;
        }
        catch (Exception ex) {
            FlatLaf.LOG.log(Level.SEVERE, "FlatLaf: Failed to initialize look and feel '" + newLookAndFeel.getClass().getName() + "'.", ex);
            return false;
        }
    }
    
    @Override
    public String getID() {
        return "FlatLaf - " + this.getName();
    }
    
    public abstract boolean isDark();
    
    public static boolean isLafDark() {
        final LookAndFeel lookAndFeel = UIManager.getLookAndFeel();
        return lookAndFeel instanceof FlatLaf && ((FlatLaf)lookAndFeel).isDark();
    }
    
    @Override
    public boolean getSupportsWindowDecorations() {
        return (!SystemInfo.IS_JETBRAINS_JVM_11_OR_LATER || !SystemInfo.IS_WINDOWS_10_OR_LATER || !JBRCustomDecorations.isSupported()) && SystemInfo.IS_WINDOWS_10_OR_LATER;
    }
    
    @Override
    public boolean isNativeLookAndFeel() {
        return false;
    }
    
    @Override
    public boolean isSupportedLookAndFeel() {
        return true;
    }
    
    @Override
    public Icon getDisabledIcon(final JComponent component, final Icon icon) {
        if (icon instanceof ImageIcon) {
            final Object grayFilter = UIManager.get("Component.grayFilter");
            final ImageFilter filter = (grayFilter instanceof ImageFilter) ? ((ImageFilter)grayFilter) : GrayFilter.createDisabledIconFilter(this.isDark());
            final ImageProducer producer;
            final Function<Image, Image> mapper = (Function<Image, Image>)(img -> {
                producer = new FilteredImageSource(img.getSource(), filter);
                return Toolkit.getDefaultToolkit().createImage(producer);
            });
            final Image image = ((ImageIcon)icon).getImage();
            return new ImageIconUIResource(MultiResolutionImageSupport.map(image, mapper));
        }
        return null;
    }
    
    @Override
    public void initialize() {
        if (SystemInfo.IS_MAC) {
            this.initializeAqua();
        }
        super.initialize();
        this.oldPopupFactory = PopupFactory.getSharedInstance();
        PopupFactory.setSharedInstance(new FlatPopupFactory());
        (this.mnemonicHandler = new MnemonicHandler()).install();
        if (SystemInfo.IS_WINDOWS) {
            this.desktopPropertyName = "win.messagebox.font";
        }
        else if (SystemInfo.IS_LINUX) {
            this.desktopPropertyName = "gnome.Gtk/FontName";
            this.desktopPropertyName2 = "gnome.Xft/DPI";
        }
        if (this.desktopPropertyName != null) {
            final String propertyName;
            this.desktopPropertyListener = (e -> {
                propertyName = e.getPropertyName();
                if (this.desktopPropertyName.equals(propertyName) || propertyName.equals(this.desktopPropertyName2)) {
                    reSetLookAndFeel();
                }
                else if ("awt.font.desktophints".equals(propertyName) && UIManager.getLookAndFeel() instanceof FlatLaf) {
                    this.putAATextInfo(UIManager.getLookAndFeelDefaults());
                    updateUILater();
                }
                return;
            });
            final Toolkit toolkit = Toolkit.getDefaultToolkit();
            toolkit.addPropertyChangeListener(this.desktopPropertyName, this.desktopPropertyListener);
            if (this.desktopPropertyName2 != null) {
                toolkit.addPropertyChangeListener(this.desktopPropertyName2, this.desktopPropertyListener);
            }
            toolkit.addPropertyChangeListener("awt.font.desktophints", this.desktopPropertyListener);
        }
        final Color linkColor;
        this.postInitialization = (defaults -> {
            linkColor = defaults.getColor("Component.linkColor");
            if (linkColor != null) {
                new HTMLEditorKit().getStyleSheet().addRule(String.format("a { color: #%06x; }", linkColor.getRGB() & 0xFFFFFF));
            }
            return;
        });
        final Boolean useWindowDecorations = FlatSystemProperties.getBooleanStrict("flatlaf.useWindowDecorations", null);
        if (useWindowDecorations != null) {
            this.oldFrameWindowDecorated = JFrame.isDefaultLookAndFeelDecorated();
            this.oldDialogWindowDecorated = JDialog.isDefaultLookAndFeelDecorated();
            JFrame.setDefaultLookAndFeelDecorated(useWindowDecorations);
            JDialog.setDefaultLookAndFeelDecorated(useWindowDecorations);
        }
    }
    
    @Override
    public void uninitialize() {
        if (this.desktopPropertyListener != null) {
            final Toolkit toolkit = Toolkit.getDefaultToolkit();
            toolkit.removePropertyChangeListener(this.desktopPropertyName, this.desktopPropertyListener);
            if (this.desktopPropertyName2 != null) {
                toolkit.removePropertyChangeListener(this.desktopPropertyName2, this.desktopPropertyListener);
            }
            toolkit.removePropertyChangeListener("awt.font.desktophints", this.desktopPropertyListener);
            this.desktopPropertyName = null;
            this.desktopPropertyName2 = null;
            this.desktopPropertyListener = null;
        }
        if (this.oldPopupFactory != null) {
            PopupFactory.setSharedInstance(this.oldPopupFactory);
            this.oldPopupFactory = null;
        }
        if (this.mnemonicHandler != null) {
            this.mnemonicHandler.uninstall();
            this.mnemonicHandler = null;
        }
        new HTMLEditorKit().getStyleSheet().addRule("a { color: blue; }");
        this.postInitialization = null;
        if (this.oldFrameWindowDecorated != null) {
            JFrame.setDefaultLookAndFeelDecorated(this.oldFrameWindowDecorated);
            JDialog.setDefaultLookAndFeelDecorated(this.oldDialogWindowDecorated);
            this.oldFrameWindowDecorated = null;
            this.oldDialogWindowDecorated = null;
        }
        super.uninitialize();
    }
    
    private void initializeAqua() {
        if (FlatLaf.aquaLoaded) {
            return;
        }
        FlatLaf.aquaLoaded = true;
        final String aquaLafClassName = "com.apple.laf.AquaLookAndFeel";
        BasicLookAndFeel aquaLaf;
        try {
            if (SystemInfo.IS_JAVA_9_OR_LATER) {
                final Method m = UIManager.class.getMethod("createLookAndFeel", String.class);
                aquaLaf = (BasicLookAndFeel)m.invoke(null, "Mac OS X");
            }
            else {
                aquaLaf = (BasicLookAndFeel)Class.forName(aquaLafClassName).newInstance();
            }
        }
        catch (Exception ex) {
            FlatLaf.LOG.log(Level.SEVERE, "FlatLaf: Failed to initialize Aqua look and feel '" + aquaLafClassName + "'.", ex);
            throw new IllegalStateException();
        }
        final PopupFactory oldPopupFactory = PopupFactory.getSharedInstance();
        aquaLaf.initialize();
        aquaLaf.uninitialize();
        PopupFactory.setSharedInstance(oldPopupFactory);
    }
    
    @Override
    public UIDefaults getDefaults() {
        final UIDefaults defaults = super.getDefaults();
        defaults.addResourceBundle("com.formdev.flatlaf.resources.Bundle");
        this.putDefaults(defaults, defaults.getColor("control"), "Button.disabledBackground", "EditorPane.disabledBackground", "EditorPane.inactiveBackground", "FormattedTextField.disabledBackground", "PasswordField.disabledBackground", "Spinner.disabledBackground", "TextArea.disabledBackground", "TextArea.inactiveBackground", "TextField.disabledBackground", "TextPane.disabledBackground", "TextPane.inactiveBackground", "ToggleButton.disabledBackground");
        this.putDefaults(defaults, defaults.getColor("textInactiveText"), "Button.disabledText", "CheckBox.disabledText", "CheckBoxMenuItem.disabledForeground", "Menu.disabledForeground", "MenuItem.disabledForeground", "RadioButton.disabledText", "RadioButtonMenuItem.disabledForeground", "Spinner.disabledForeground", "ToggleButton.disabledText");
        this.putDefaults(defaults, defaults.getColor("textText"), "DesktopIcon.foreground");
        this.initFonts(defaults);
        initIconColors(defaults, this.isDark());
        FlatInputMaps.initInputMaps(defaults);
        final ServiceLoader<FlatDefaultsAddon> addonLoader = ServiceLoader.load(FlatDefaultsAddon.class);
        final List<FlatDefaultsAddon> addons = new ArrayList<FlatDefaultsAddon>();
        for (final FlatDefaultsAddon addon3 : addonLoader) {
            addons.add(addon3);
        }
        addons.sort((addon1, addon2) -> addon1.getPriority() - addon2.getPriority());
        final List<Class<?>> lafClassesForDefaultsLoading = this.getLafClassesForDefaultsLoading();
        if (lafClassesForDefaultsLoading != null) {
            UIDefaultsLoader.loadDefaultsFromProperties(lafClassesForDefaultsLoading, addons, this.getAdditionalDefaults(), this.isDark(), defaults);
        }
        else {
            UIDefaultsLoader.loadDefaultsFromProperties(this.getClass(), addons, this.getAdditionalDefaults(), this.isDark(), defaults);
        }
        if (SystemInfo.IS_MAC && Boolean.getBoolean("apple.laf.useScreenMenuBar")) {
            defaults.put("MenuBarUI", "com.apple.laf.AquaMenuBarUI");
            defaults.put("MenuBar.backgroundPainter", BorderFactory.createEmptyBorder());
        }
        this.putAATextInfo(defaults);
        this.applyAdditionalDefaults(defaults);
        for (final FlatDefaultsAddon addon4 : addons) {
            addon4.afterDefaultsLoading(this, defaults);
        }
        defaults.put("laf.scaleFactor", t -> UIScale.getUserScaleFactor());
        if (this.postInitialization != null) {
            this.postInitialization.accept(defaults);
            this.postInitialization = null;
        }
        return defaults;
    }
    
    void applyAdditionalDefaults(final UIDefaults defaults) {
    }
    
    protected List<Class<?>> getLafClassesForDefaultsLoading() {
        return null;
    }
    
    protected Properties getAdditionalDefaults() {
        return null;
    }
    
    private void initFonts(final UIDefaults defaults) {
        FontUIResource uiFont = null;
        if (SystemInfo.IS_WINDOWS) {
            final Font winFont = (Font)Toolkit.getDefaultToolkit().getDesktopProperty("win.messagebox.font");
            if (winFont != null) {
                uiFont = createCompositeFont(winFont.getFamily(), winFont.getStyle(), winFont.getSize());
            }
        }
        else if (SystemInfo.IS_MAC) {
            String fontName;
            if (SystemInfo.IS_MAC_OS_10_15_CATALINA_OR_LATER) {
                fontName = "Helvetica Neue";
            }
            else if (SystemInfo.IS_MAC_OS_10_11_EL_CAPITAN_OR_LATER) {
                fontName = ".SF NS Text";
            }
            else {
                fontName = "Lucida Grande";
            }
            uiFont = createCompositeFont(fontName, 0, 13);
        }
        else if (SystemInfo.IS_LINUX) {
            final Font font = LinuxFontPolicy.getFont();
            uiFont = (FontUIResource)((font instanceof FontUIResource) ? font : new FontUIResource(font));
        }
        if (uiFont == null) {
            uiFont = createCompositeFont("SansSerif", 0, 12);
        }
        uiFont = UIScale.applyCustomScaleFactor(uiFont);
        final Object activeFont = new ActiveFont(1.0f);
        for (final Object key : ((Hashtable<Object, V>)defaults).keySet()) {
            if (key instanceof String && (((String)key).endsWith(".font") || ((String)key).endsWith("Font"))) {
                defaults.put(key, activeFont);
            }
        }
        defaults.put("ProgressBar.font", new ActiveFont(0.85f));
        defaults.put("defaultFont", uiFont);
    }
    
    static FontUIResource createCompositeFont(final String family, final int style, final int size) {
        final Font font = StyleContext.getDefaultStyleContext().getFont(family, style, size);
        return (FontUIResource)((font instanceof FontUIResource) ? font : new FontUIResource(font));
    }
    
    public static void initIconColors(final UIDefaults defaults, final boolean dark) {
        for (final FlatIconColors c : FlatIconColors.values()) {
            if (c.light == !dark || c.dark == dark) {
                defaults.put(c.key, new ColorUIResource(c.rgb));
            }
        }
    }
    
    private void putAATextInfo(final UIDefaults defaults) {
        if (SystemInfo.IS_JAVA_9_OR_LATER) {
            final Object desktopHints = Toolkit.getDefaultToolkit().getDesktopProperty("awt.font.desktophints");
            if (desktopHints instanceof Map) {
                final Map<Object, Object> hints = (Map<Object, Object>)desktopHints;
                final Object aaHint = hints.get(RenderingHints.KEY_TEXT_ANTIALIASING);
                if (aaHint != null && aaHint != RenderingHints.VALUE_TEXT_ANTIALIAS_OFF && aaHint != RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT) {
                    defaults.put(RenderingHints.KEY_TEXT_ANTIALIASING, aaHint);
                    defaults.put(RenderingHints.KEY_TEXT_LCD_CONTRAST, hints.get(RenderingHints.KEY_TEXT_LCD_CONTRAST));
                }
            }
        }
        else {
            try {
                final Object key = Class.forName("sun.swing.SwingUtilities2").getField("AA_TEXT_PROPERTY_KEY").get(null);
                final Object value = Class.forName("sun.swing.SwingUtilities2$AATextInfo").getMethod("getAATextInfo", Boolean.TYPE).invoke(null, true);
                defaults.put(key, value);
            }
            catch (Exception ex) {
                Logger.getLogger(FlatLaf.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException(ex);
            }
        }
    }
    
    private void putDefaults(final UIDefaults defaults, final Object value, final String... keys) {
        for (final String key : keys) {
            defaults.put(key, value);
        }
    }
    
    private static void reSetLookAndFeel() {
        final LookAndFeel lookAndFeel;
        PropertyChangeEvent e;
        final PropertyChangeListener[] array;
        int length;
        int i = 0;
        PropertyChangeListener l;
        EventQueue.invokeLater(() -> {
            lookAndFeel = UIManager.getLookAndFeel();
            try {
                UIManager.setLookAndFeel(lookAndFeel);
                e = new PropertyChangeEvent(UIManager.class, "lookAndFeel", lookAndFeel, lookAndFeel);
                UIManager.getPropertyChangeListeners();
                for (length = array.length; i < length; ++i) {
                    l = array[i];
                    l.propertyChange(e);
                }
                updateUI();
            }
            catch (UnsupportedLookAndFeelException ex) {
                FlatLaf.LOG.log(Level.SEVERE, "FlatLaf: Failed to reinitialize look and feel '" + lookAndFeel.getClass().getName() + "'.", ex);
            }
        });
    }
    
    public static void updateUI() {
        for (final Window w : Window.getWindows()) {
            SwingUtilities.updateComponentTreeUI(w);
        }
    }
    
    public static void updateUILater() {
        synchronized (FlatLaf.class) {
            if (FlatLaf.updateUIPending) {
                return;
            }
            FlatLaf.updateUIPending = true;
        }
        EventQueue.invokeLater(() -> {
            updateUI();
            synchronized (FlatLaf.class) {
                FlatLaf.updateUIPending = false;
            }
        });
    }
    
    public static boolean isShowMnemonics() {
        return MnemonicHandler.isShowMnemonics();
    }
    
    public static void showMnemonics(final Component c) {
        MnemonicHandler.showMnemonics(true, c);
    }
    
    public static void hideMnemonics() {
        MnemonicHandler.showMnemonics(false, null);
    }
    
    static {
        LOG = Logger.getLogger(FlatLaf.class.getName());
    }
    
    private static class ActiveFont implements UIDefaults.ActiveValue
    {
        private final float scaleFactor;
        private Font font;
        private Font lastDefaultFont;
        
        ActiveFont(final float scaleFactor) {
            this.scaleFactor = scaleFactor;
        }
        
        @Override
        public Object createValue(final UIDefaults table) {
            final Font defaultFont = UIManager.getFont("defaultFont");
            if (this.lastDefaultFont != defaultFont) {
                this.lastDefaultFont = defaultFont;
                if (this.scaleFactor != 1.0f) {
                    final int newFontSize = Math.round(defaultFont.getSize() * this.scaleFactor);
                    this.font = new FontUIResource(defaultFont.deriveFont((float)newFontSize));
                }
                else {
                    this.font = ((defaultFont instanceof UIResource) ? defaultFont : new FontUIResource(defaultFont));
                }
            }
            return this.font;
        }
    }
    
    private static class ImageIconUIResource extends ImageIcon implements UIResource
    {
        ImageIconUIResource(final Image image) {
            super(image);
        }
    }
}
