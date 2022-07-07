// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.gui;

import java.util.ArrayList;
import dev.nuker.pyro.fw;
import java.util.function.Consumer;
import dev.nuker.pyro.fQ;
import dev.nuker.pyro.f0W;
import dev.nuker.pyro.f42;
import dev.nuker.pyro.f1c;
import dev.nuker.pyro.f0Y;
import dev.nuker.pyro.f0Z;
import dev.nuker.pyro.f0X;
import net.minecraft.client.gui.FontRenderer;
import dev.nuker.pyro.f0x;
import dev.nuker.pyro.f0A;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Iterator;
import net.minecraft.client.settings.KeyBinding;
import dev.nuker.pyro.Pyro;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import dev.nuker.pyro.f0y;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;
import net.minecraft.client.gui.GuiScreen;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 \\2\u00020\u0001:\u0004[\\]^B\u0005¢\u0006\u0002\u0010\u0002JL\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0012\u0010@\u001a\u000e\u0012\n\u0012\b\u0018\u00010\fR\u00020\u00000A2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00190C2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00190C2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\n0CJ\b\u0010F\u001a\u00020\nH\u0016J \u0010G\u001a\u00020=2\u0006\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u00042\u0006\u0010J\u001a\u00020KH\u0016J\u001c\u0010L\u001a\b\u0018\u00010\u000eR\u00020\u00002\u0006\u0010B\u001a\u00020\u00192\u0006\u0010D\u001a\u00020\u0019J\b\u0010M\u001a\u00020=H\u0016J\u0018\u0010N\u001a\u00020=2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u0004H\u0014J(\u0010R\u001a\u00020=2\u0006\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u00042\u0006\u0010T\u001a\u00020UH\u0016J \u0010V\u001a\u00020=2\u0006\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u0004H\u0016J \u0010W\u001a\u00020=2\u0006\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u0004H\u0016J\u0006\u0010X\u001a\u00020=J\u0010\u0010Y\u001a\u00020=2\u0006\u0010Z\u001a\u00020\u0004H\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0018\u00010\u000eR\u00020\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\nX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR$\u0010*\u001a\f\u0012\b\u0012\u00060\fR\u00020\u00000+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR\u001a\u00103\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR\u001a\u00106\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dR$\u00109\u001a\f\u0012\b\u0012\u00060\u000eR\u00020\u00000+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010-\"\u0004\b;\u0010/¨\u0006_" }, d2 = { "Ldev/nuker/pyro/gui/ClickGui;", "Lnet/minecraft/client/gui/GuiScreen;", "()V", "SEGHEIGHT", "", "getSEGHEIGHT", "()I", "setSEGHEIGHT", "(I)V", "captureEvents", "", "capturingWindow", "Ldev/nuker/pyro/gui/ClickGui$Window;", "dragging", "Ldev/nuker/pyro/gui/ClickGui$AbstractWindow;", "getDragging", "()Ldev/nuker/pyro/gui/ClickGui$AbstractWindow;", "setDragging", "(Ldev/nuker/pyro/gui/ClickGui$AbstractWindow;)V", "invisibleOverlays", "getInvisibleOverlays", "()Z", "setInvisibleOverlays", "(Z)V", "lastX", "", "getLastX", "()D", "setLastX", "(D)V", "lastY", "getLastY", "setLastY", "mode", "Ldev/nuker/pyro/gui/ClickGui$OpenMode;", "getMode", "()Ldev/nuker/pyro/gui/ClickGui$OpenMode;", "setMode", "(Ldev/nuker/pyro/gui/ClickGui$OpenMode;)V", "moduleWidth", "getModuleWidth", "setModuleWidth", "moduleWindows", "", "getModuleWindows", "()Ljava/util/List;", "setModuleWindows", "(Ljava/util/List;)V", "startDragButton", "getStartDragButton", "setStartDragButton", "startDragX", "getStartDragX", "setStartDragX", "startDragY", "getStartDragY", "setStartDragY", "windows", "getWindows", "setWindows", "addWindow", "", "name", "", "processor", "Ljava/util/function/Consumer;", "x", "Ldev/nuker/pyro/api/AbstractHandledValue;", "y", "expanded", "doesGuiPauseGame", "drawScreen", "mouseX", "mouseY", "delta", "", "getTopWindow", "initGui", "keyTyped", "typedChar", "", "keyCode", "mouseClickMove", "button", "badmcp", "", "mouseClicked", "mouseReleased", "reloadWindowList", "requestModuleWidth", "width", "AbstractWindow", "Companion", "OpenMode", "Window", "pyroclient" })
public final class ClickGui extends GuiScreen
{
    @NotNull
    private ClickGui$OpenMode mode;
    private int SEGHEIGHT;
    private boolean invisibleOverlays;
    @Nullable
    private ClickGui$AbstractWindow dragging;
    @NotNull
    private List<ClickGui$Window> moduleWindows;
    @NotNull
    private List<ClickGui$AbstractWindow> windows;
    private int moduleWidth;
    private double startDragX;
    private double startDragY;
    private double startDragButton;
    private double lastX;
    private double lastY;
    private ClickGui$Window capturingWindow;
    private boolean captureEvents;
    private static double SCALE;
    private static double DSCALE;
    @NotNull
    private static f0y settings;
    public static final ClickGui$Companion Companion;
    
    @NotNull
    public final ClickGui$OpenMode getMode() {
        return this.mode;
    }
    
    public final void setMode(@NotNull final ClickGui$OpenMode <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.mode = <set-?>;
    }
    
    public final int getSEGHEIGHT() {
        return this.SEGHEIGHT;
    }
    
    public final void setSEGHEIGHT(final int <set-?>) {
        this.SEGHEIGHT = <set-?>;
    }
    
    protected final boolean getInvisibleOverlays() {
        return this.invisibleOverlays;
    }
    
    protected final void setInvisibleOverlays(final boolean <set-?>) {
        this.invisibleOverlays = <set-?>;
    }
    
    @Nullable
    public final ClickGui$AbstractWindow getDragging() {
        return this.dragging;
    }
    
    public final void setDragging(@Nullable final ClickGui$AbstractWindow <set-?>) {
        this.dragging = <set-?>;
    }
    
    @NotNull
    public final List getModuleWindows() {
        return this.moduleWindows;
    }
    
    public final void setModuleWindows(@NotNull final List <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.moduleWindows = (List<ClickGui$Window>)<set-?>;
    }
    
    @NotNull
    public final List getWindows() {
        return this.windows;
    }
    
    public final void setWindows(@NotNull final List <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.windows = (List<ClickGui$AbstractWindow>)<set-?>;
    }
    
    public final int getModuleWidth() {
        return this.moduleWidth;
    }
    
    public final void setModuleWidth(final int <set-?>) {
        this.moduleWidth = <set-?>;
    }
    
    public final double getStartDragX() {
        return this.startDragX;
    }
    
    public final void setStartDragX(final double <set-?>) {
        this.startDragX = <set-?>;
    }
    
    public final double getStartDragY() {
        return this.startDragY;
    }
    
    public final void setStartDragY(final double <set-?>) {
        this.startDragY = <set-?>;
    }
    
    public final double getStartDragButton() {
        return this.startDragButton;
    }
    
    public final void setStartDragButton(final double <set-?>) {
        this.startDragButton = <set-?>;
    }
    
    public final double getLastX() {
        return this.lastX;
    }
    
    public final void setLastX(final double <set-?>) {
        this.lastX = <set-?>;
    }
    
    public final double getLastY() {
        return this.lastY;
    }
    
    public final void setLastY(final double <set-?>) {
        this.lastY = <set-?>;
    }
    
    public boolean func_73868_f() {
        return false;
    }
    
    public final void reloadWindowList() {
        this.windows.clear();
        switch (ClickGui$WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()]) {
            case 1: {
                this.windows.addAll(this.moduleWindows);
                break;
            }
        }
    }
    
    protected void func_73869_a(final char typedChar, final int keyCode) {
        final int n;
        int keyCode2 = n = keyCode;
        final KeyBinding key = Pyro.KEY;
        Intrinsics.checkExpressionValueIsNotNull(key, "Pyro.KEY");
        if (n == key.func_151463_i()) {
            keyCode2 = 1;
        }
        super.func_73869_a(typedChar, keyCode2);
        if (keyCode2 != 1) {
            for (final ClickGui$AbstractWindow window : this.windows) {
                window.keyTyped(typedChar, keyCode2);
            }
        }
    }
    
    public void func_73863_a(final int mouseX, final int mouseY, final float delta) {
        super.func_73863_a(mouseX, mouseY, delta);
        GlStateManager.func_179094_E();
        GlStateManager.func_179139_a(ClickGui.SCALE, ClickGui.SCALE, 1.0);
        for (final ClickGui$AbstractWindow window : this.windows) {
            window.render(mouseX * ClickGui.DSCALE - window.getX((int)(this.field_146294_l * ClickGui.DSCALE)), mouseY * ClickGui.DSCALE - window.getY((int)(this.field_146295_m * ClickGui.DSCALE)));
        }
        if (this.mode == ClickGui$OpenMode.MODULES) {
            this.capturingWindow = null;
            for (final ClickGui$Window window2 : this.moduleWindows) {
                if (window2.isCapturing(mouseX * ClickGui.DSCALE - window2.getX((int)(this.field_146294_l * ClickGui.DSCALE)), mouseY * ClickGui.DSCALE - window2.getY((int)(this.field_146295_m * ClickGui.DSCALE)))) {
                    this.capturingWindow = window2;
                    this.captureEvents = window2.getCaptureEvents();
                    break;
                }
            }
            if (this.capturingWindow != null) {
                final ClickGui$Window capturingWindow = this.capturingWindow;
                if (capturingWindow == null) {
                    Intrinsics.throwNpe();
                }
                final double n = mouseX * ClickGui.DSCALE;
                final ClickGui$Window capturingWindow2 = this.capturingWindow;
                if (capturingWindow2 == null) {
                    Intrinsics.throwNpe();
                }
                final double mouseX2 = n - capturingWindow2.getX((int)(this.field_146294_l * ClickGui.DSCALE));
                final double n2 = mouseY * ClickGui.DSCALE;
                final ClickGui$Window capturingWindow3 = this.capturingWindow;
                if (capturingWindow3 == null) {
                    Intrinsics.throwNpe();
                }
                capturingWindow.renderCapture(mouseX2, n2 - capturingWindow3.getY((int)(this.field_146295_m * ClickGui.DSCALE)));
            }
        }
        f0A.c(0, this.field_146295_m - 16, 64, 16, ClickGui.settings.2(), ClickGui.settings.6(), 1);
        final f0A c = f0A.c;
        final FontRenderer field_146289_q = this.field_146289_q;
        Intrinsics.checkExpressionValueIsNotNull(field_146289_q, "fontRenderer");
        c.c(field_146289_q, (this.mode == ClickGui$OpenMode.OVERLAYS) ? "Modules" : "Overlays", 0, this.field_146295_m - 16, 64, 16, f0x.1, 0, ClickGui.settings.0(), true);
        GlStateManager.func_179121_F();
    }
    
    public void func_146273_a(final int mouseX, final int mouseY, final int button, final long badmcp) {
        if (mouseX > 64 || mouseY < this.field_146295_m - 16) {
            final double deltaX = mouseX - this.lastX;
            final double deltaY = mouseY - this.lastY;
            if (this.startDragX == Integer.MIN_VALUE && this.startDragY == Integer.MIN_VALUE && this.dragging == null) {
                this.dragging = this.getTopWindow(mouseX, mouseY);
                Label_0130: {
                    if (this.dragging != null) {
                        if (button == 0) {
                            final ClickGui$AbstractWindow dragging = this.dragging;
                            if (dragging == null) {
                                Intrinsics.throwNpe();
                            }
                            if (dragging.headerContains(mouseX * ClickGui.DSCALE, mouseY * ClickGui.DSCALE)) {
                                break Label_0130;
                            }
                        }
                        this.startDragX = mouseX;
                        this.startDragY = mouseY;
                    }
                }
                this.startDragButton = button;
            }
            if (button != this.startDragButton) {
                this.dragging = null;
                this.startDragX = Integer.MIN_VALUE;
                this.startDragY = Integer.MIN_VALUE;
            }
            if (this.startDragX != Integer.MIN_VALUE && this.startDragY != Integer.MIN_VALUE) {
                final ClickGui$AbstractWindow dragging2 = this.dragging;
                if (dragging2 == null) {
                    Intrinsics.throwNpe();
                }
                final double n = this.startDragX * ClickGui.DSCALE;
                final ClickGui$AbstractWindow dragging3 = this.dragging;
                if (dragging3 == null) {
                    Intrinsics.throwNpe();
                }
                final double n2 = n - dragging3.getX((int)(this.field_146294_l * ClickGui.DSCALE));
                final double n3 = this.startDragY * ClickGui.DSCALE;
                final ClickGui$AbstractWindow dragging4 = this.dragging;
                if (dragging4 == null) {
                    Intrinsics.throwNpe();
                }
                final double n4 = n3 - dragging4.getY((int)(this.field_146295_m * ClickGui.DSCALE));
                final double n5 = mouseX * ClickGui.DSCALE;
                final ClickGui$AbstractWindow dragging5 = this.dragging;
                if (dragging5 == null) {
                    Intrinsics.throwNpe();
                }
                final double n6 = n5 - dragging5.getX((int)(this.field_146294_l * ClickGui.DSCALE));
                final double n7 = mouseY * ClickGui.DSCALE;
                final ClickGui$AbstractWindow dragging6 = this.dragging;
                if (dragging6 == null) {
                    Intrinsics.throwNpe();
                }
                dragging2.mouseEvent(new f0X(n2, n4, n6, n7 - dragging6.getY((int)(this.field_146295_m * ClickGui.DSCALE)), deltaX * ClickGui.DSCALE, deltaY * ClickGui.DSCALE, button));
            }
            else if (this.dragging != null) {
                final ClickGui$AbstractWindow dragging7 = this.dragging;
                if (dragging7 == null) {
                    Intrinsics.throwNpe();
                }
                final ClickGui$AbstractWindow dragging8 = this.dragging;
                if (dragging8 == null) {
                    Intrinsics.throwNpe();
                }
                final double n8 = dragging8.getX((int)(this.field_146294_l * ClickGui.DSCALE)) + deltaX * ClickGui.DSCALE;
                final ClickGui$AbstractWindow dragging9 = this.dragging;
                if (dragging9 == null) {
                    Intrinsics.throwNpe();
                }
                dragging7.setPosition(n8, dragging9.getY((int)(this.field_146295_m * ClickGui.DSCALE)) + deltaY * ClickGui.DSCALE);
            }
            for (final ClickGui$AbstractWindow window : this.windows) {
                if (window != this.dragging) {
                    window.onClickedElsewhere();
                }
            }
            this.lastX = mouseX;
            this.lastY = mouseY;
        }
    }
    
    public void func_146286_b(final int mouseX, final int mouseY, final int button) {
        if (this.startDragX != Integer.MIN_VALUE && this.startDragY != Integer.MIN_VALUE) {
            final ClickGui$AbstractWindow dragging = this.dragging;
            if (dragging == null) {
                Intrinsics.throwNpe();
            }
            final double n = this.startDragX * ClickGui.DSCALE;
            final ClickGui$AbstractWindow dragging2 = this.dragging;
            if (dragging2 == null) {
                Intrinsics.throwNpe();
            }
            final double n2 = n - dragging2.getX((int)(this.field_146294_l * ClickGui.DSCALE));
            final double n3 = this.startDragY * ClickGui.DSCALE;
            final ClickGui$AbstractWindow dragging3 = this.dragging;
            if (dragging3 == null) {
                Intrinsics.throwNpe();
            }
            final double n4 = n3 - dragging3.getY((int)(this.field_146295_m * ClickGui.DSCALE));
            final double n5 = mouseX * ClickGui.DSCALE;
            final ClickGui$AbstractWindow dragging4 = this.dragging;
            if (dragging4 == null) {
                Intrinsics.throwNpe();
            }
            final double n6 = n5 - dragging4.getX((int)(this.field_146294_l * ClickGui.DSCALE));
            final double n7 = mouseY * ClickGui.DSCALE;
            final ClickGui$AbstractWindow dragging5 = this.dragging;
            if (dragging5 == null) {
                Intrinsics.throwNpe();
            }
            dragging.mouseEvent(new f0Y(n2, n4, n6, n7 - dragging5.getY((int)(this.field_146295_m * ClickGui.DSCALE)), button));
            this.startDragX = Integer.MIN_VALUE;
            this.startDragY = Integer.MIN_VALUE;
        }
        else {
            if (this.dragging == null) {
                this.dragging = this.getTopWindow(mouseX, mouseY);
            }
            if (this.dragging != null) {
                final ClickGui$AbstractWindow dragging6 = this.dragging;
                if (dragging6 == null) {
                    Intrinsics.throwNpe();
                }
                final double n8 = mouseX * ClickGui.DSCALE;
                final ClickGui$AbstractWindow dragging7 = this.dragging;
                if (dragging7 == null) {
                    Intrinsics.throwNpe();
                }
                final double n9 = n8 - dragging7.getX((int)(this.field_146294_l * ClickGui.DSCALE));
                final double n10 = mouseY * ClickGui.DSCALE;
                final ClickGui$AbstractWindow dragging8 = this.dragging;
                if (dragging8 == null) {
                    Intrinsics.throwNpe();
                }
                dragging6.mouseEvent(new f1c(n9, n10 - dragging8.getY((int)(this.field_146295_m * ClickGui.DSCALE)), button));
            }
        }
        for (final ClickGui$AbstractWindow window : this.windows) {
            if (window != this.dragging) {
                window.onClickedElsewhere();
            }
        }
        this.dragging = null;
    }
    
    public void func_73864_a(final int mouseX, final int mouseY, final int button) {
        if (mouseX <= 64 && mouseY >= this.field_146295_m - 16) {
            this.mode = ((this.mode == ClickGui$OpenMode.MODULES) ? ClickGui$OpenMode.OVERLAYS : ClickGui$OpenMode.MODULES);
            this.reloadWindowList();
            if (this.mode == ClickGui$OpenMode.OVERLAYS) {
                this.field_146297_k.func_147108_a((GuiScreen)new f42());
            }
            return;
        }
        final ClickGui$AbstractWindow clicked = this.getTopWindow(mouseX, mouseY);
        if (clicked != null) {
            clicked.mouseEvent(new f0W(mouseX * ClickGui.DSCALE - clicked.getX((int)(this.field_146294_l * ClickGui.DSCALE)), mouseY * ClickGui.DSCALE - clicked.getY((int)(this.field_146295_m * ClickGui.DSCALE)), button));
            this.windows.remove(clicked);
            this.windows.add(clicked);
        }
        for (final ClickGui$AbstractWindow window : this.windows) {
            if (window != clicked) {
                window.onClickedElsewhere();
            }
        }
        this.lastX = mouseX;
        this.lastY = mouseY;
    }
    
    @Nullable
    public final ClickGui$AbstractWindow getTopWindow(final double x, final double y) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dev/nuker/pyro/gui/ClickGui.capturingWindow:Ldev/nuker/pyro/gui/ClickGui$Window;
        //     4: ifnull          32
        //     7: aload_0         /* this */
        //     8: getfield        dev/nuker/pyro/gui/ClickGui.capturingWindow:Ldev/nuker/pyro/gui/ClickGui$Window;
        //    11: dup            
        //    12: ifnonnull       18
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //    18: invokevirtual   dev/nuker/pyro/gui/ClickGui$Window.getCaptureEvents:()Z
        //    21: ifeq            32
        //    24: aload_0         /* this */
        //    25: getfield        dev/nuker/pyro/gui/ClickGui.capturingWindow:Ldev/nuker/pyro/gui/ClickGui$Window;
        //    28: checkcast       Ldev/nuker/pyro/gui/ClickGui$AbstractWindow;
        //    31: areturn        
        //    32: aload_0         /* this */
        //    33: getfield        dev/nuker/pyro/gui/ClickGui.windows:Ljava/util/List;
        //    36: checkcast       Ljava/util/Collection;
        //    39: invokeinterface java/util/Collection.size:()I
        //    44: istore          5
        //    46: iinc            5, -1
        //    49: iconst_0       
        //    50: istore          6
        //    52: iload           5
        //    54: iflt            100
        //    57: aload_0         /* this */
        //    58: getfield        dev/nuker/pyro/gui/ClickGui.windows:Ljava/util/List;
        //    61: iload           i
        //    63: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    68: checkcast       Ldev/nuker/pyro/gui/ClickGui$AbstractWindow;
        //    71: astore          window
        //    73: aload           window
        //    75: dload_1         /* x */
        //    76: getstatic       dev/nuker/pyro/gui/ClickGui.DSCALE:D
        //    79: dmul           
        //    80: dload_3         /* y */
        //    81: getstatic       dev/nuker/pyro/gui/ClickGui.DSCALE:D
        //    84: dmul           
        //    85: invokevirtual   dev/nuker/pyro/gui/ClickGui$AbstractWindow.contains:(DD)Z
        //    88: ifeq            94
        //    91: aload           window
        //    93: areturn        
        //    94: iinc            i, -1
        //    97: goto            52
        //   100: aconst_null    
        //   101: areturn        
        //    StackMapTable: 00 05 52 07 00 FB 0D FD 00 13 01 01 FC 00 29 07 00 D0 FA 00 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void func_73866_w_() {
        super.func_73866_w_();
        this.moduleWindows.clear();
        final int field_78288_b = this.field_146289_q.field_78288_b;
        final f0y settings = ClickGui.settings;
        this.SEGHEIGHT = field_78288_b + f0y.c * 2;
        fQ.c.c(this);
    }
    
    public final void addWindow(@NotNull final String name, @NotNull final Consumer processor, @NotNull final fw x, @NotNull final fw y, @NotNull final fw expanded) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(processor, "processor");
        Intrinsics.checkParameterIsNotNull(x, "x");
        Intrinsics.checkParameterIsNotNull(y, "y");
        Intrinsics.checkParameterIsNotNull(expanded, "expanded");
        final ClickGui$Window window = new ClickGui$Window(this, name, x, y, expanded);
        processor.accept(window);
        this.moduleWindows.add(window);
    }
    
    protected final void requestModuleWidth(final int width) {
        if (width > this.moduleWidth) {
            this.moduleWidth = width;
        }
    }
    
    public ClickGui() {
        this.mode = ClickGui$OpenMode.MODULES;
        this.moduleWindows = new ArrayList<ClickGui$Window>();
        this.windows = new ArrayList<ClickGui$AbstractWindow>();
        this.startDragX = Integer.MIN_VALUE;
        this.startDragY = Integer.MIN_VALUE;
        this.startDragButton = -1.0;
    }
    
    static {
        Companion = new ClickGui$Companion(null);
        ClickGui.SCALE = 1.0;
        ClickGui.DSCALE = 1.0 / ClickGui.SCALE;
        ClickGui.settings = f0y.c;
    }
}
