// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.gui;

import java.util.ArrayList;
import dev.nuker.pyro.f0W;
import dev.nuker.pyro.f0X;
import dev.nuker.pyro.f0Y;
import dev.nuker.pyro.f0Z;
import java.util.function.Consumer;
import org.jetbrains.annotations.Nullable;
import dev.nuker.pyro.f0x;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import dev.nuker.pyro.f0A;
import dev.nuker.pyro.f0y;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import dev.nuker.pyro.fw;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002:\u0001EB7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0002\u0010\u000bJ^\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\n2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u001e2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006J\u0018\u00100\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0006\u00101\u001a\u00020\u0018J\u0010\u0010#\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0018H\u0016J\u0010\u0010%\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0018H\u0016J\u0018\u00104\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0007J\u0016\u00108\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0018\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0018H\u0016J\u0010\u0010=\u001a\u00020(2\u0006\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020(H\u0016J\u0018\u0010A\u001a\u00020(2\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0007H\u0016J\u0016\u0010B\u001a\u00020(2\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0007J\u0018\u0010C\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0006\u0010D\u001a\u00020(R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\f\u0018\u00010\u0012R\u00060\u0000R\u00020\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n0\u0012R\u00060\u0000R\u00020\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016¨\u0006F" }, d2 = { "Ldev/nuker/pyro/gui/ClickGui$Window;", "Ldev/nuker/pyro/gui/ClickGui$AbstractWindow;", "Ldev/nuker/pyro/gui/ClickGui;", "name", "", "x", "Ldev/nuker/pyro/api/AbstractHandledValue;", "", "y", "expanded", "", "(Ldev/nuker/pyro/gui/ClickGui;Ljava/lang/String;Ldev/nuker/pyro/api/AbstractHandledValue;Ldev/nuker/pyro/api/AbstractHandledValue;Ldev/nuker/pyro/api/AbstractHandledValue;)V", "captureEvents", "getCaptureEvents", "()Z", "setCaptureEvents", "(Z)V", "capturingModule", "Ldev/nuker/pyro/gui/ClickGui$Window$Module;", "getExpanded", "()Ldev/nuker/pyro/api/AbstractHandledValue;", "setExpanded", "(Ldev/nuker/pyro/api/AbstractHandledValue;)V", "height_", "", "getHeight_", "()I", "setHeight_", "(I)V", "modules", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getX", "setX", "getY", "setY", "addModule", "", "module", "enabled", "controls", "Ldev/nuker/pyro/api/ui/control/UiControl;", "handler", "Ljava/util/function/Consumer;", "hotkey", "contains", "getHeight", "width", "height", "headerContains", "isCapturing", "mouseX", "mouseY", "isOnTop", "keyTyped", "typedChar", "", "keyCode", "mouseEvent", "event", "Ldev/nuker/pyro/api/ui/mouse/MouseEvent;", "onClickedElsewhere", "render", "renderCapture", "setPosition", "updateModulePositions", "Module", "pyroclient" })
public final class ClickGui$Window extends ClickGui$AbstractWindow
{
    private int height_;
    private List<ClickGui$Window$Module> modules;
    private ClickGui$Window$Module capturingModule;
    private boolean captureEvents;
    @NotNull
    private String name;
    @NotNull
    private fw<Double> x;
    @NotNull
    private fw<Double> y;
    @NotNull
    private fw<Boolean> expanded;
    final /* synthetic */ ClickGui this$0;
    
    public final int getHeight_() {
        return this.height_;
    }
    
    public final void setHeight_(final int <set-?>) {
        this.height_ = <set-?>;
    }
    
    public final boolean getCaptureEvents() {
        return this.captureEvents;
    }
    
    public final void setCaptureEvents(final boolean <set-?>) {
        this.captureEvents = <set-?>;
    }
    
    @Override
    public boolean headerContains(final double x, final double y) {
        return this.contains(x, y) && y <= ((Number)this.y.0()).doubleValue() + this.this$0.getSEGHEIGHT();
    }
    
    public final boolean isCapturing(final double mouseX, final double mouseY) {
        for (final ClickGui$Window$Module clickGui$Window$Module : this.modules) {
            final ClickGui$Window$Module module = clickGui$Window$Module;
            final Object 0 = module.getY().0();
            Intrinsics.checkExpressionValueIsNotNull(0, "module.y.value");
            if (clickGui$Window$Module.isCapturing(mouseX, mouseY - ((Number)0).doubleValue())) {
                this.capturingModule = module;
                this.captureEvents = module.getCaptureEvents();
                return true;
            }
        }
        this.capturingModule = null;
        return this.captureEvents = false;
    }
    
    public final void renderCapture(final double mouseX, final double mouseY) {
        if (this.capturingModule != null) {
            GlStateManager.func_179094_E();
            final Object 0 = this.x.0();
            Intrinsics.checkExpressionValueIsNotNull(0, "x.value");
            final double doubleValue = ((Number)0).doubleValue();
            final double doubleValue2 = ((Number)this.y.0()).doubleValue();
            final ClickGui$Window$Module capturingModule = this.capturingModule;
            if (capturingModule == null) {
                Intrinsics.throwNpe();
            }
            final Object 2 = capturingModule.getY().0();
            Intrinsics.checkExpressionValueIsNotNull(2, "capturingModule!!.y.value");
            GlStateManager.func_179137_b(doubleValue, doubleValue2 + ((Number)2).doubleValue(), 0.0);
            final ClickGui$Window$Module capturingModule2 = this.capturingModule;
            if (capturingModule2 == null) {
                Intrinsics.throwNpe();
            }
            final ClickGui$Window$Module capturingModule3 = this.capturingModule;
            if (capturingModule3 == null) {
                Intrinsics.throwNpe();
            }
            final Object 3 = capturingModule3.getY().0();
            Intrinsics.checkExpressionValueIsNotNull(3, "capturingModule!!.y.value");
            capturingModule2.renderCapture(mouseX, mouseY - ((Number)3).doubleValue());
            GlStateManager.func_179121_F();
        }
    }
    
    @Override
    public double getX(final int width) {
        final Object 0 = this.x.0();
        Intrinsics.checkExpressionValueIsNotNull(0, "x.value");
        return ((Number)0).doubleValue();
    }
    
    @Override
    public double getY(final int height) {
        final Object 0 = this.y.0();
        Intrinsics.checkExpressionValueIsNotNull(0, "y.value");
        return ((Number)0).doubleValue();
    }
    
    @Override
    public void setPosition(final double x, final double y) {
        this.x.c(x);
        this.y.c(y);
    }
    
    public final int getHeight() {
        final Object 0 = this.expanded.0();
        Intrinsics.checkExpressionValueIsNotNull(0, "expanded.value");
        return 0 ? (this.height_ + 1) : this.this$0.getSEGHEIGHT();
    }
    
    public final boolean isOnTop(final double x, final double y) {
        return this.this$0.getTopWindow((((Number)this.x.0()).doubleValue() + x) * ClickGui.Companion.getSCALE(), (((Number)this.y.0()).doubleValue() + y) * ClickGui.Companion.getSCALE()) == this;
    }
    
    @Override
    public void keyTyped(final char typedChar, final int keyCode) {
        for (final ClickGui$Window$Module module : this.modules) {
            module.keyTyped(typedChar, keyCode);
        }
    }
    
    @Override
    public void render(final double mouseX, final double mouseY) {
        final ClickGui this$0 = this.this$0;
        final int func_78256_a = ClickGui.access$getFontRenderer$p(this.this$0).func_78256_a(this.name);
        ClickGui.Companion.getSettings();
        this$0.requestModuleWidth(func_78256_a + f0y.c * 2);
        GlStateManager.func_179094_E();
        final Object 0 = this.x.0();
        Intrinsics.checkExpressionValueIsNotNull(0, "x.value");
        final double doubleValue = ((Number)0).doubleValue();
        final Object 2 = this.y.0();
        Intrinsics.checkExpressionValueIsNotNull(2, "y.value");
        GlStateManager.func_179137_b(doubleValue, ((Number)2).doubleValue(), 0.0);
        f0A.c(0, 0, this.this$0.getModuleWidth(), this.getHeight() + 1, ClickGui.Companion.getSettings().2(), ClickGui.Companion.getSettings().6(), 1);
        final f0A c = f0A.c;
        final FontRenderer access$getFontRenderer$p = ClickGui.access$getFontRenderer$p(this.this$0);
        Intrinsics.checkExpressionValueIsNotNull(access$getFontRenderer$p, "fontRenderer");
        final String name = this.name;
        final int n = 0;
        final int n2 = 0;
        final int moduleWidth = this.this$0.getModuleWidth();
        final int segheight = this.this$0.getSEGHEIGHT();
        ClickGui.Companion.getSettings();
        final f0x c2 = f0y.c;
        ClickGui.Companion.getSettings();
        f0A.c(c, access$getFontRenderer$p, name, n, n2, moduleWidth, segheight, c2, f0y.c, ClickGui.Companion.getSettings().0(), false, 512, null);
        final Object 3 = this.expanded.0();
        Intrinsics.checkExpressionValueIsNotNull(3, "expanded.value");
        if (3) {
            Gui.func_73734_a(0, this.this$0.getSEGHEIGHT(), this.this$0.getModuleWidth(), this.this$0.getSEGHEIGHT() + 1, ClickGui.Companion.getSettings().6());
            for (final ClickGui$Window$Module module : this.modules) {
                GlStateManager.func_179094_E();
                GlStateManager.func_179137_b(0.0, (double)((Number)module.getY().0()).intValue(), 0.0);
                final ClickGui$Window$Module clickGui$Window$Module = module;
                final Object 4 = module.getY().0();
                Intrinsics.checkExpressionValueIsNotNull(4, "module.y.value");
                clickGui$Window$Module.render(mouseX, mouseY - ((Number)4).doubleValue());
                GlStateManager.func_179121_F();
            }
        }
        GlStateManager.func_179121_F();
    }
    
    public final void addModule(@Nullable final String module, final boolean enabled, @NotNull final List controls, @NotNull final Consumer handler, @NotNull final fw hotkey, @NotNull final fw expanded, @NotNull final fw y) {
        Intrinsics.checkParameterIsNotNull(controls, "controls");
        Intrinsics.checkParameterIsNotNull(handler, "handler");
        Intrinsics.checkParameterIsNotNull(hotkey, "hotkey");
        Intrinsics.checkParameterIsNotNull(expanded, "expanded");
        Intrinsics.checkParameterIsNotNull(y, "y");
        if (module == null) {
            Intrinsics.throwNpe();
        }
        final ClickGui$Window$Module module2 = new ClickGui$Window$Module(this, module, controls, handler, hotkey, expanded, y);
        module2.setEnabled(enabled);
        this.modules.add(module2);
        this.updateModulePositions();
    }
    
    public final void updateModulePositions() {
        this.height_ = this.this$0.getSEGHEIGHT();
        for (final ClickGui$Window$Module module : this.modules) {
            module.getY().c(this.height_ + 1);
            this.height_ += module.getHeight();
        }
    }
    
    @Override
    public boolean contains(final double x, final double y) {
        final Object 0 = this.x.0();
        Intrinsics.checkExpressionValueIsNotNull(0, "this.x.value");
        if (x >= ((Number)0).doubleValue()) {
            final Object 2 = this.y.0();
            Intrinsics.checkExpressionValueIsNotNull(2, "this.y.value");
            if (y >= ((Number)2).doubleValue() && x <= ((Number)this.x.0()).doubleValue() + this.this$0.getModuleWidth() && y <= ((Number)this.y.0()).doubleValue() + this.getHeight()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void mouseEvent(@NotNull final f0Z event) {
        Intrinsics.checkParameterIsNotNull(event, "event");
        if (event instanceof f0Y) {
            if (((f0Y)event).c() > this.this$0.getSEGHEIGHT()) {
                final Object 0 = this.expanded.0();
                Intrinsics.checkExpressionValueIsNotNull(0, "expanded.value");
                if (0) {
                    Label_0246: {
                        if (this.capturingModule != null && this.captureEvents) {
                            final ClickGui$Window$Module capturingModule = this.capturingModule;
                            if (capturingModule == null) {
                                Intrinsics.throwNpe();
                            }
                            final double 2 = ((f0Y)event).0();
                            final double c = ((f0Y)event).c();
                            final ClickGui$Window$Module capturingModule2 = this.capturingModule;
                            if (capturingModule2 == null) {
                                Intrinsics.throwNpe();
                            }
                            final Object 3 = capturingModule2.getY().0();
                            Intrinsics.checkExpressionValueIsNotNull(3, "capturingModule!!.y.value");
                            if (capturingModule.isCapturing(2, c - ((Number)3).doubleValue())) {
                                final ClickGui$Window$Module capturingModule3 = this.capturingModule;
                                if (capturingModule3 == null) {
                                    Intrinsics.throwNpe();
                                }
                                final double n = 0.0;
                                final ClickGui$Window$Module capturingModule4 = this.capturingModule;
                                if (capturingModule4 == null) {
                                    Intrinsics.throwNpe();
                                }
                                capturingModule3.mouseEvent(event.c(n, ((Number)capturingModule4.getY().0()).intValue()));
                                break Label_0246;
                            }
                        }
                        for (final ClickGui$Window$Module module : this.modules) {
                            if (module.contains(((f0Y)event).c())) {
                                module.mouseEvent(event.c(0.0, ((Number)module.getY().0()).intValue()));
                                return;
                            }
                        }
                    }
                    this.updateModulePositions();
                }
                for (final ClickGui$Window$Module module : this.modules) {
                    module.onClickedElsewhere();
                }
            }
        }
        else if (event instanceof f0X) {
            if (((f0X)event).1() > this.this$0.getSEGHEIGHT()) {
                final Object 4 = this.expanded.0();
                Intrinsics.checkExpressionValueIsNotNull(4, "expanded.value");
                if (4) {
                    Label_0525: {
                        if (this.capturingModule != null && this.captureEvents) {
                            final ClickGui$Window$Module capturingModule5 = this.capturingModule;
                            if (capturingModule5 == null) {
                                Intrinsics.throwNpe();
                            }
                            final double 5 = ((f0X)event).0();
                            final double 6 = ((f0X)event).1();
                            final ClickGui$Window$Module capturingModule6 = this.capturingModule;
                            if (capturingModule6 == null) {
                                Intrinsics.throwNpe();
                            }
                            final Object 7 = capturingModule6.getY().0();
                            Intrinsics.checkExpressionValueIsNotNull(7, "capturingModule!!.y.value");
                            if (capturingModule5.isCapturing(5, 6 - ((Number)7).doubleValue())) {
                                final ClickGui$Window$Module capturingModule7 = this.capturingModule;
                                if (capturingModule7 == null) {
                                    Intrinsics.throwNpe();
                                }
                                final double n2 = 0.0;
                                final ClickGui$Window$Module capturingModule8 = this.capturingModule;
                                if (capturingModule8 == null) {
                                    Intrinsics.throwNpe();
                                }
                                capturingModule7.mouseEvent(event.c(n2, ((Number)capturingModule8.getY().0()).intValue()));
                                break Label_0525;
                            }
                        }
                        for (final ClickGui$Window$Module module : this.modules) {
                            if (module.contains(((f0X)event).1())) {
                                module.mouseEvent(event.c(0.0, ((Number)module.getY().0()).intValue()));
                                return;
                            }
                        }
                    }
                    this.updateModulePositions();
                }
                for (final ClickGui$Window$Module module : this.modules) {
                    module.onClickedElsewhere();
                }
            }
        }
        else if (event.3() <= this.this$0.getSEGHEIGHT()) {
            if (event.c() == 1 && event instanceof f0W) {
                this.expanded.c(!(boolean)this.expanded.0());
            }
        }
        else {
            final Object 8 = this.expanded.0();
            Intrinsics.checkExpressionValueIsNotNull(8, "expanded.value");
            if (8) {
                if (this.capturingModule != null && this.captureEvents) {
                    final ClickGui$Window$Module capturingModule9 = this.capturingModule;
                    if (capturingModule9 == null) {
                        Intrinsics.throwNpe();
                    }
                    final double n3 = 0.0;
                    final ClickGui$Window$Module capturingModule10 = this.capturingModule;
                    if (capturingModule10 == null) {
                        Intrinsics.throwNpe();
                    }
                    capturingModule9.mouseEvent(event.c(n3, ((Number)capturingModule10.getY().0()).intValue()));
                }
                else {
                    for (final ClickGui$Window$Module module : this.modules) {
                        if (module.contains(event.3())) {
                            module.mouseEvent(event.c(0.0, ((Number)module.getY().0()).intValue()));
                            return;
                        }
                        module.onClickedElsewhere();
                    }
                    this.updateModulePositions();
                }
            }
        }
    }
    
    @Override
    public void onClickedElsewhere() {
        for (final ClickGui$Window$Module module : this.modules) {
            module.onClickedElsewhere();
        }
    }
    
    @NotNull
    protected final String getName() {
        return this.name;
    }
    
    protected final void setName(@NotNull final String <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.name = <set-?>;
    }
    
    @NotNull
    public final fw getX() {
        return this.x;
    }
    
    public final void setX(@NotNull final fw <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.x = (fw<Double>)<set-?>;
    }
    
    @NotNull
    public final fw getY() {
        return this.y;
    }
    
    public final void setY(@NotNull final fw <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.y = (fw<Double>)<set-?>;
    }
    
    @NotNull
    protected final fw getExpanded() {
        return this.expanded;
    }
    
    protected final void setExpanded(@NotNull final fw <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.expanded = (fw<Boolean>)<set-?>;
    }
    
    public ClickGui$Window(@NotNull final ClickGui $outer, @NotNull final String name, @NotNull final fw x, @NotNull final fw y, final fw expanded) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(x, "x");
        Intrinsics.checkParameterIsNotNull(y, "y");
        Intrinsics.checkParameterIsNotNull(expanded, "expanded");
        this.this$0 = $outer;
        super($outer);
        this.name = name;
        this.x = (fw<Double>)x;
        this.y = (fw<Double>)y;
        this.expanded = (fw<Boolean>)expanded;
        this.height_ = $outer.getSEGHEIGHT();
        this.modules = new ArrayList<ClickGui$Window$Module>();
    }
}
