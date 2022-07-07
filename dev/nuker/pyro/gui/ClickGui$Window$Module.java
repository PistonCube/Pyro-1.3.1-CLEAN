// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.gui;

import dev.nuker.pyro.f0y;
import dev.nuker.pyro.f0J;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import dev.nuker.pyro.f0W;
import dev.nuker.pyro.f0X;
import net.minecraft.util.Tuple;
import dev.nuker.pyro.f0Y;
import dev.nuker.pyro.f0Z;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import java.util.function.Consumer;
import dev.nuker.pyro.f0w;
import dev.nuker.pyro.f0V;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import dev.nuker.pyro.fw;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\u000fJ\b\u00109\u001a\u00020:H\u0004J\u0011\u0010;\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020<H\u0086\u0002J>\u0010=\u001a \u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u001b0>\u0012\u0004\u0012\u00020\f\u0018\u00010>2\u0006\u0010?\u001a\u00020<2\u0006\u0010\u000e\u001a\u00020<2\u0006\u0010@\u001a\u00020\tH\u0004J\u0006\u0010A\u001a\u00020\fJ\u000e\u0010B\u001a\u00020<2\u0006\u0010C\u001a\u00020\u0006J\u0016\u0010D\u001a\u00020\t2\u0006\u0010E\u001a\u00020<2\u0006\u0010F\u001a\u00020<J\u0016\u0010G\u001a\u00020\t2\u0006\u0010?\u001a\u00020<2\u0006\u0010\u000e\u001a\u00020<J\u0016\u0010H\u001a\u00020:2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\fJ\u000e\u0010L\u001a\u00020:2\u0006\u0010M\u001a\u00020NJ\u0006\u0010O\u001a\u00020:J\u0016\u0010P\u001a\u00020:2\u0006\u0010E\u001a\u00020<2\u0006\u0010F\u001a\u00020<J\u0016\u0010Q\u001a\u00020:2\u0006\u0010E\u001a\u00020<2\u0006\u0010F\u001a\u00020<J\b\u0010R\u001a\u00020:H\u0004R\u001a\u0010\u0010\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010'\"\u0004\b8\u0010)¨\u0006S" }, d2 = { "Ldev/nuker/pyro/gui/ClickGui$Window$Module;", "", "name", "", "controls", "", "Ldev/nuker/pyro/api/ui/control/UiControl;", "handler", "Ljava/util/function/Consumer;", "", "hotkey", "Ldev/nuker/pyro/api/AbstractHandledValue;", "", "expanded", "y", "(Ldev/nuker/pyro/gui/ClickGui$Window;Ljava/lang/String;Ljava/util/List;Ljava/util/function/Consumer;Ldev/nuker/pyro/api/AbstractHandledValue;Ldev/nuker/pyro/api/AbstractHandledValue;Ldev/nuker/pyro/api/AbstractHandledValue;)V", "captureEvents", "getCaptureEvents", "()Z", "setCaptureEvents", "(Z)V", "capturingControl", "getCapturingControl", "()Ldev/nuker/pyro/api/ui/control/UiControl;", "setCapturingControl", "(Ldev/nuker/pyro/api/ui/control/UiControl;)V", "contexts", "Ldev/nuker/pyro/api/ui/GuiContext;", "getContexts", "()Ljava/util/List;", "setContexts", "(Ljava/util/List;)V", "", "getControls", "setControls", "enabled", "getEnabled", "setEnabled", "getExpanded", "()Ldev/nuker/pyro/api/AbstractHandledValue;", "setExpanded", "(Ldev/nuker/pyro/api/AbstractHandledValue;)V", "getHandler", "()Ljava/util/function/Consumer;", "setHandler", "(Ljava/util/function/Consumer;)V", "height_", "getHeight_", "()I", "setHeight_", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getY", "setY", "buildContexts", "", "contains", "", "getControlAt", "Lnet/minecraft/util/Tuple;", "x", "captureCounts", "getHeight", "getYOfControl", "control", "isCapturing", "mouseX", "mouseY", "isOnTop", "keyTyped", "typedChar", "", "keyCode", "mouseEvent", "event", "Ldev/nuker/pyro/api/ui/mouse/MouseEvent;", "onClickedElsewhere", "render", "renderCapture", "updateControlSizes", "pyroclient" })
public final class ClickGui$Window$Module
{
    private boolean enabled;
    @NotNull
    private fw<Boolean> expanded;
    private int height_;
    @NotNull
    private fw<Integer> y;
    @NotNull
    private List<? extends f0V> controls;
    @NotNull
    private List<f0w> contexts;
    @NotNull
    private Consumer<Boolean> handler;
    @Nullable
    private f0V capturingControl;
    private boolean captureEvents;
    @NotNull
    private String name;
    final /* synthetic */ ClickGui$Window this$0;
    
    public final boolean getEnabled() {
        return this.enabled;
    }
    
    public final void setEnabled(final boolean <set-?>) {
        this.enabled = <set-?>;
    }
    
    @NotNull
    public final fw getExpanded() {
        return this.expanded;
    }
    
    public final void setExpanded(@NotNull final fw <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.expanded = (fw<Boolean>)<set-?>;
    }
    
    public final int getHeight_() {
        return this.height_;
    }
    
    public final void setHeight_(final int <set-?>) {
        this.height_ = <set-?>;
    }
    
    @NotNull
    public final fw getY() {
        return this.y;
    }
    
    public final void setY(@NotNull final fw <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.y = (fw<Integer>)<set-?>;
    }
    
    @NotNull
    public final List getControls() {
        return this.controls;
    }
    
    public final void setControls(@NotNull final List <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.controls = (List<? extends f0V>)<set-?>;
    }
    
    @NotNull
    protected final List getContexts() {
        return this.contexts;
    }
    
    protected final void setContexts(@NotNull final List <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.contexts = (List<f0w>)<set-?>;
    }
    
    @NotNull
    protected final Consumer getHandler() {
        return this.handler;
    }
    
    protected final void setHandler(@NotNull final Consumer <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.handler = (Consumer<Boolean>)<set-?>;
    }
    
    @Nullable
    protected final f0V getCapturingControl() {
        return this.capturingControl;
    }
    
    protected final void setCapturingControl(@Nullable final f0V <set-?>) {
        this.capturingControl = <set-?>;
    }
    
    public final boolean getCaptureEvents() {
        return this.captureEvents;
    }
    
    public final void setCaptureEvents(final boolean <set-?>) {
        this.captureEvents = <set-?>;
    }
    
    public final void keyTyped(final char typedChar, final int keyCode) {
        for (final f0V control : this.controls) {
            control.c(typedChar, keyCode);
        }
    }
    
    public final void render(final double mouseX, final double mouseY) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //     4: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //     7: aload_0         /* this */
        //     8: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //    11: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //    14: invokestatic    dev/nuker/pyro/gui/ClickGui.access$getFontRenderer$p:(Ldev/nuker/pyro/gui/ClickGui;)Lnet/minecraft/client/gui/FontRenderer;
        //    17: aload_0         /* this */
        //    18: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.name:Ljava/lang/String;
        //    21: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78256_a:(Ljava/lang/String;)I
        //    24: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //    27: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //    30: pop            
        //    31: getstatic       dev/nuker/pyro/f0y.c:I
        //    34: iconst_2       
        //    35: imul           
        //    36: iadd           
        //    37: invokevirtual   dev/nuker/pyro/gui/ClickGui.requestModuleWidth:(I)V
        //    40: getstatic       dev/nuker/pyro/f0A.c:Ldev/nuker/pyro/f0A;
        //    43: aload_0         /* this */
        //    44: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //    47: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //    50: invokestatic    dev/nuker/pyro/gui/ClickGui.access$getFontRenderer$p:(Ldev/nuker/pyro/gui/ClickGui;)Lnet/minecraft/client/gui/FontRenderer;
        //    53: dup            
        //    54: ldc             "fontRenderer"
        //    56: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    59: aload_0         /* this */
        //    60: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.name:Ljava/lang/String;
        //    63: iconst_0       
        //    64: iconst_0       
        //    65: aload_0         /* this */
        //    66: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //    69: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //    72: invokevirtual   dev/nuker/pyro/gui/ClickGui.getModuleWidth:()I
        //    75: iconst_4       
        //    76: isub           
        //    77: aload_0         /* this */
        //    78: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //    81: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //    84: invokevirtual   dev/nuker/pyro/gui/ClickGui.getSEGHEIGHT:()I
        //    87: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //    90: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //    93: pop            
        //    94: getstatic       dev/nuker/pyro/f0y.c:Ldev/nuker/pyro/f0x;
        //    97: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //   100: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //   103: pop            
        //   104: getstatic       dev/nuker/pyro/f0y.c:I
        //   107: aload_0         /* this */
        //   108: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.enabled:Z
        //   111: ifeq            126
        //   114: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //   117: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //   120: invokevirtual   dev/nuker/pyro/f0y.6:()I
        //   123: goto            135
        //   126: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //   129: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //   132: invokevirtual   dev/nuker/pyro/f0y.0:()I
        //   135: iconst_0       
        //   136: sipush          512
        //   139: aconst_null    
        //   140: invokestatic    dev/nuker/pyro/f0A.c:(Ldev/nuker/pyro/f0A;Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;IIIILdev/nuker/pyro/f0x;IIZILjava/lang/Object;)V
        //   143: aload_0         /* this */
        //   144: dload_1         /* mouseX */
        //   145: dload_3         /* mouseY */
        //   146: invokevirtual   dev/nuker/pyro/gui/ClickGui$Window$Module.isOnTop:(DD)Z
        //   149: ifeq            250
        //   152: dload_3         /* mouseY */
        //   153: aload_0         /* this */
        //   154: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //   157: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //   160: invokevirtual   dev/nuker/pyro/gui/ClickGui.getSEGHEIGHT:()I
        //   163: i2d            
        //   164: dcmpg          
        //   165: ifgt            250
        //   168: dload_3         /* mouseY */
        //   169: iconst_0       
        //   170: i2d            
        //   171: dcmpl          
        //   172: iflt            250
        //   175: aload_0         /* this */
        //   176: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //   179: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //   182: invokevirtual   dev/nuker/pyro/gui/ClickGui.getModuleWidth:()I
        //   185: iconst_3       
        //   186: isub           
        //   187: iconst_1       
        //   188: aload_0         /* this */
        //   189: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //   192: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //   195: invokevirtual   dev/nuker/pyro/gui/ClickGui.getModuleWidth:()I
        //   198: iconst_1       
        //   199: isub           
        //   200: aload_0         /* this */
        //   201: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //   204: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //   207: invokevirtual   dev/nuker/pyro/gui/ClickGui.getSEGHEIGHT:()I
        //   210: iconst_1       
        //   211: isub           
        //   212: aload_0         /* this */
        //   213: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.enabled:Z
        //   216: ifeq            231
        //   219: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //   222: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //   225: invokevirtual   dev/nuker/pyro/f0y.8:()I
        //   228: goto            247
        //   231: new             Ljava/awt/Color;
        //   234: dup            
        //   235: sipush          209
        //   238: bipush          35
        //   240: iconst_0       
        //   241: invokespecial   java/awt/Color.<init>:(III)V
        //   244: invokevirtual   java/awt/Color.getRGB:()I
        //   247: invokestatic    net/minecraft/client/gui/Gui.func_73734_a:(IIIII)V
        //   250: aload_0         /* this */
        //   251: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.expanded:Ldev/nuker/pyro/fw;
        //   254: invokevirtual   dev/nuker/pyro/fw.0:()Ljava/lang/Object;
        //   257: dup            
        //   258: ldc             "expanded.value"
        //   260: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //   263: checkcast       Ljava/lang/Boolean;
        //   266: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   269: ifeq            417
        //   272: aload_0         /* this */
        //   273: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //   276: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //   279: invokevirtual   dev/nuker/pyro/gui/ClickGui.getSEGHEIGHT:()I
        //   282: istore          y
        //   284: iconst_0       
        //   285: istore          6
        //   287: aload_0         /* this */
        //   288: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.controls:Ljava/util/List;
        //   291: checkcast       Ljava/util/Collection;
        //   294: invokeinterface java/util/Collection.size:()I
        //   299: istore          7
        //   301: iload           6
        //   303: iload           7
        //   305: if_icmpge       391
        //   308: aload_0         /* this */
        //   309: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.controls:Ljava/util/List;
        //   312: iload           i
        //   314: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   319: checkcast       Ldev/nuker/pyro/f0V;
        //   322: astore          control
        //   324: aload_0         /* this */
        //   325: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.contexts:Ljava/util/List;
        //   328: iload           i
        //   330: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   335: checkcast       Ldev/nuker/pyro/f0w;
        //   338: astore          context
        //   340: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //   343: fconst_1       
        //   344: iload           y
        //   346: i2f            
        //   347: fconst_0       
        //   348: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //   351: aload           control
        //   353: aload           context
        //   355: dload_1         /* mouseX */
        //   356: dload_3         /* mouseY */
        //   357: iload           y
        //   359: i2d            
        //   360: dsub           
        //   361: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //   364: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //   367: invokeinterface dev/nuker/pyro/f0V.2:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)V
        //   372: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //   375: iload           y
        //   377: aload           context
        //   379: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   382: iadd           
        //   383: istore          y
        //   385: iinc            i, 1
        //   388: goto            301
        //   391: iconst_1       
        //   392: aload_0         /* this */
        //   393: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //   396: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //   399: invokevirtual   dev/nuker/pyro/gui/ClickGui.getSEGHEIGHT:()I
        //   402: iconst_2       
        //   403: iload           y
        //   405: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //   408: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //   411: invokevirtual   dev/nuker/pyro/f0y.6:()I
        //   414: invokestatic    net/minecraft/client/gui/Gui.func_73734_a:(IIIII)V
        //   417: return         
        //    StackMapTable: 00 08 FF 00 7E 00 03 07 00 03 03 03 00 09 07 00 C9 07 00 B2 07 01 28 01 01 01 01 07 01 2A 01 FF 00 08 00 03 07 00 03 03 03 00 0A 07 00 C9 07 00 B2 07 01 28 01 01 01 01 07 01 2A 01 01 FF 00 5F 00 03 07 00 03 03 03 00 04 01 01 01 01 FF 00 0F 00 03 07 00 03 03 03 00 05 01 01 01 01 01 02 FE 00 32 01 01 01 FB 00 59 F8 00 19
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void renderCapture(final double mouseX, final double mouseY) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.capturingControl:Ldev/nuker/pyro/f0V;
        //     4: ifnull          139
        //     7: aload_0         /* this */
        //     8: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //    11: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //    14: invokevirtual   dev/nuker/pyro/gui/ClickGui.getSEGHEIGHT:()I
        //    17: istore          y
        //    19: iconst_0       
        //    20: istore          6
        //    22: aload_0         /* this */
        //    23: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.controls:Ljava/util/List;
        //    26: checkcast       Ljava/util/Collection;
        //    29: invokeinterface java/util/Collection.size:()I
        //    34: istore          7
        //    36: iload           6
        //    38: iload           7
        //    40: if_icmpge       139
        //    43: aload_0         /* this */
        //    44: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.controls:Ljava/util/List;
        //    47: iload           i
        //    49: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    54: checkcast       Ldev/nuker/pyro/f0V;
        //    57: astore          control
        //    59: aload_0         /* this */
        //    60: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.contexts:Ljava/util/List;
        //    63: iload           i
        //    65: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    70: checkcast       Ldev/nuker/pyro/f0w;
        //    73: astore          context
        //    75: iload           y
        //    77: aload           control
        //    79: aload_0         /* this */
        //    80: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.capturingControl:Ldev/nuker/pyro/f0V;
        //    83: if_acmpne       125
        //    86: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //    89: fconst_1       
        //    90: iload           y
        //    92: i2f            
        //    93: fconst_0       
        //    94: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179109_b:(FFF)V
        //    97: aload           control
        //    99: aload           context
        //   101: dload_1         /* mouseX */
        //   102: dload_3         /* mouseY */
        //   103: iload           y
        //   105: i2d            
        //   106: dsub           
        //   107: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //   110: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //   113: invokeinterface dev/nuker/pyro/f0V.c:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)V
        //   118: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //   121: pop            
        //   122: goto            139
        //   125: aload           context
        //   127: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   130: iadd           
        //   131: istore          y
        //   133: iinc            i, 1
        //   136: goto            36
        //   139: return         
        //    StackMapTable: 00 03 FE 00 24 01 01 01 FF 00 58 00 08 07 00 03 03 03 01 01 01 07 00 9C 07 01 0E 00 01 01 FF 00 0D 00 03 07 00 03 03 03 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void mouseEvent(@NotNull final f0Z event) {
        Intrinsics.checkParameterIsNotNull(event, "event");
        if (event instanceof f0Y) {
            if (((f0Y)event).c() > this.this$0.this$0.getSEGHEIGHT()) {
                final Tuple control = this.getControlAt(((f0Y)event).c(), ((f0Y)event).c(), false);
                if (control != null) {
                    if (this.captureEvents) {
                        final Object func_76341_a = control.func_76341_a();
                        Intrinsics.checkExpressionValueIsNotNull(func_76341_a, "control.first");
                        final Object func_76341_a2 = ((Tuple)func_76341_a).func_76341_a();
                        if (func_76341_a2 == null) {
                            Intrinsics.throwNpe();
                        }
                        final f0V f0V = (f0V)func_76341_a2;
                        final Object func_76341_a3 = control.func_76341_a();
                        Intrinsics.checkExpressionValueIsNotNull(func_76341_a3, "control.first");
                        final Object func_76340_b = ((Tuple)func_76341_a3).func_76340_b();
                        if (func_76340_b == null) {
                            Intrinsics.throwNpe();
                        }
                        f0V.c((f0w)func_76340_b, ClickGui.Companion.getSettings(), event.c(1.0, ((Number)control.func_76340_b()).intValue()));
                    }
                    else {
                        final Object func_76341_a4 = control.func_76341_a();
                        Intrinsics.checkExpressionValueIsNotNull(func_76341_a4, "control.first");
                        final Object func_76341_a5 = ((Tuple)func_76341_a4).func_76341_a();
                        if (func_76341_a5 == null) {
                            Intrinsics.throwNpe();
                        }
                        final f0V f0V2 = (f0V)func_76341_a5;
                        final Object func_76341_a6 = control.func_76341_a();
                        Intrinsics.checkExpressionValueIsNotNull(func_76341_a6, "control.first");
                        final Object func_76340_b2 = ((Tuple)func_76341_a6).func_76340_b();
                        if (func_76340_b2 == null) {
                            Intrinsics.throwNpe();
                        }
                        f0V2.0((f0w)func_76340_b2, ClickGui.Companion.getSettings(), event.c(1.0, ((Number)control.func_76340_b()).intValue()));
                    }
                }
            }
        }
        else if (event instanceof f0X) {
            if (((f0X)event).1() > this.this$0.this$0.getSEGHEIGHT()) {
                final Tuple control = this.getControlAt(((f0X)event).0(), ((f0X)event).1(), false);
                if (control != null) {
                    if (this.captureEvents) {
                        final Object func_76341_a7 = control.func_76341_a();
                        Intrinsics.checkExpressionValueIsNotNull(func_76341_a7, "control.first");
                        final Object func_76341_a8 = ((Tuple)func_76341_a7).func_76341_a();
                        if (func_76341_a8 == null) {
                            Intrinsics.throwNpe();
                        }
                        final f0V f0V3 = (f0V)func_76341_a8;
                        final Object func_76341_a9 = control.func_76341_a();
                        Intrinsics.checkExpressionValueIsNotNull(func_76341_a9, "control.first");
                        final Object func_76340_b3 = ((Tuple)func_76341_a9).func_76340_b();
                        if (func_76340_b3 == null) {
                            Intrinsics.throwNpe();
                        }
                        f0V3.c((f0w)func_76340_b3, ClickGui.Companion.getSettings(), event.c(1.0, ((Number)control.func_76340_b()).intValue()));
                    }
                    else {
                        final Object func_76341_a10 = control.func_76341_a();
                        Intrinsics.checkExpressionValueIsNotNull(func_76341_a10, "control.first");
                        final Object func_76341_a11 = ((Tuple)func_76341_a10).func_76341_a();
                        if (func_76341_a11 == null) {
                            Intrinsics.throwNpe();
                        }
                        final f0V f0V4 = (f0V)func_76341_a11;
                        final Object func_76341_a12 = control.func_76341_a();
                        Intrinsics.checkExpressionValueIsNotNull(func_76341_a12, "control.first");
                        final Object func_76340_b4 = ((Tuple)func_76341_a12).func_76340_b();
                        if (func_76340_b4 == null) {
                            Intrinsics.throwNpe();
                        }
                        f0V4.0((f0w)func_76340_b4, ClickGui.Companion.getSettings(), event.c(1.0, ((Number)control.func_76340_b()).intValue()));
                    }
                }
            }
        }
        else if (event.3() > 0 && event.3() <= this.this$0.this$0.getSEGHEIGHT()) {
            if (event instanceof f0W) {
                if (event.c() == 0) {
                    this.enabled = !this.enabled;
                    this.handler.accept(this.enabled);
                }
                else if (event.c() == 1) {
                    this.expanded.c(!(boolean)this.expanded.0());
                    this.updateControlSizes();
                }
            }
        }
        else {
            final Tuple control = this.getControlAt(0.0, event.3(), true);
            if (control != null) {
                if (this.captureEvents) {
                    final Object func_76341_a13 = control.func_76341_a();
                    Intrinsics.checkExpressionValueIsNotNull(func_76341_a13, "control.first");
                    final Object func_76341_a14 = ((Tuple)func_76341_a13).func_76341_a();
                    if (func_76341_a14 == null) {
                        Intrinsics.throwNpe();
                    }
                    final f0V f0V5 = (f0V)func_76341_a14;
                    final Object func_76341_a15 = control.func_76341_a();
                    Intrinsics.checkExpressionValueIsNotNull(func_76341_a15, "control.first");
                    final Object func_76340_b5 = ((Tuple)func_76341_a15).func_76340_b();
                    if (func_76340_b5 == null) {
                        Intrinsics.throwNpe();
                    }
                    f0V5.c((f0w)func_76340_b5, ClickGui.Companion.getSettings(), event.c(1.0, ((Number)control.func_76340_b()).intValue()));
                }
                else {
                    final Object func_76341_a16 = control.func_76341_a();
                    Intrinsics.checkExpressionValueIsNotNull(func_76341_a16, "control.first");
                    final Object func_76341_a17 = ((Tuple)func_76341_a16).func_76341_a();
                    if (func_76341_a17 == null) {
                        Intrinsics.throwNpe();
                    }
                    final f0V f0V6 = (f0V)func_76341_a17;
                    final Object func_76341_a18 = control.func_76341_a();
                    Intrinsics.checkExpressionValueIsNotNull(func_76341_a18, "control.first");
                    final Object func_76340_b6 = ((Tuple)func_76341_a18).func_76340_b();
                    if (func_76340_b6 == null) {
                        Intrinsics.throwNpe();
                    }
                    f0V6.0((f0w)func_76340_b6, ClickGui.Companion.getSettings(), event.c(1.0, ((Number)control.func_76340_b()).intValue()));
                }
            }
        }
    }
    
    @Nullable
    protected final Tuple getControlAt(final double x, final double y, final boolean captureCounts) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.capturingControl:Ldev/nuker/pyro/f0V;
        //     4: ifnull          191
        //     7: aload_0         /* this */
        //     8: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.captureEvents:Z
        //    11: ifeq            191
        //    14: aload_0         /* this */
        //    15: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //    18: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //    21: invokevirtual   dev/nuker/pyro/gui/ClickGui.getSEGHEIGHT:()I
        //    24: istore          cy
        //    26: aconst_null    
        //    27: checkcast       Ldev/nuker/pyro/f0w;
        //    30: astore          context
        //    32: iconst_0       
        //    33: istore          8
        //    35: aload_0         /* this */
        //    36: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.controls:Ljava/util/List;
        //    39: checkcast       Ljava/util/Collection;
        //    42: invokeinterface java/util/Collection.size:()I
        //    47: istore          9
        //    49: iload           8
        //    51: iload           9
        //    53: if_icmpge       191
        //    56: iload           cy
        //    58: aload_0         /* this */
        //    59: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.contexts:Ljava/util/List;
        //    62: iload           i
        //    64: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    69: checkcast       Ldev/nuker/pyro/f0w;
        //    72: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //    75: iadd           
        //    76: istore          cy
        //    78: aload_0         /* this */
        //    79: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.contexts:Ljava/util/List;
        //    82: iload           i
        //    84: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    89: checkcast       Ldev/nuker/pyro/f0w;
        //    92: astore          context
        //    94: aload_0         /* this */
        //    95: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.controls:Ljava/util/List;
        //    98: iload           i
        //   100: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   105: checkcast       Ldev/nuker/pyro/f0V;
        //   108: aload_0         /* this */
        //   109: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.capturingControl:Ldev/nuker/pyro/f0V;
        //   112: if_acmpne       185
        //   115: iload           captureCounts
        //   117: ifne            153
        //   120: aload_0         /* this */
        //   121: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.capturingControl:Ldev/nuker/pyro/f0V;
        //   124: dup            
        //   125: ifnonnull       131
        //   128: invokestatic    kotlin/jvm/internal/Intrinsics.throwNpe:()V
        //   131: aload           context
        //   133: dload_1         /* x */
        //   134: iload           cy
        //   136: i2d            
        //   137: dload_3         /* y */
        //   138: dsub           
        //   139: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //   142: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //   145: invokeinterface dev/nuker/pyro/f0V.0:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)Z
        //   150: ifeq            185
        //   153: new             Lnet/minecraft/util/Tuple;
        //   156: dup            
        //   157: new             Lnet/minecraft/util/Tuple;
        //   160: dup            
        //   161: aload_0         /* this */
        //   162: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.capturingControl:Ldev/nuker/pyro/f0V;
        //   165: aload           context
        //   167: invokespecial   net/minecraft/util/Tuple.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   170: iload           cy
        //   172: aload           context
        //   174: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   177: isub           
        //   178: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   181: invokespecial   net/minecraft/util/Tuple.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   184: areturn        
        //   185: iinc            i, 1
        //   188: goto            49
        //   191: aload_0         /* this */
        //   192: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //   195: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //   198: invokevirtual   dev/nuker/pyro/gui/ClickGui.getSEGHEIGHT:()I
        //   201: istore          cy
        //   203: iconst_0       
        //   204: istore          7
        //   206: aload_0         /* this */
        //   207: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.controls:Ljava/util/List;
        //   210: checkcast       Ljava/util/Collection;
        //   213: invokeinterface java/util/Collection.size:()I
        //   218: istore          8
        //   220: iload           7
        //   222: iload           8
        //   224: if_icmpge       306
        //   227: aload_0         /* this */
        //   228: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.contexts:Ljava/util/List;
        //   231: iload           i
        //   233: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   238: checkcast       Ldev/nuker/pyro/f0w;
        //   241: astore          context
        //   243: iload           cy
        //   245: aload           context
        //   247: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   250: iadd           
        //   251: istore          cy
        //   253: dload_3         /* y */
        //   254: iload           cy
        //   256: i2d            
        //   257: dcmpg          
        //   258: ifgt            300
        //   261: new             Lnet/minecraft/util/Tuple;
        //   264: dup            
        //   265: new             Lnet/minecraft/util/Tuple;
        //   268: dup            
        //   269: aload_0         /* this */
        //   270: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.controls:Ljava/util/List;
        //   273: iload           i
        //   275: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   280: aload           context
        //   282: invokespecial   net/minecraft/util/Tuple.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   285: iload           cy
        //   287: aload           context
        //   289: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   292: isub           
        //   293: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   296: invokespecial   net/minecraft/util/Tuple.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   299: areturn        
        //   300: iinc            i, 1
        //   303: goto            220
        //   306: aconst_null    
        //   307: areturn        
        //    StackMapTable: 00 08 FF 00 31 00 08 07 00 03 03 03 01 01 07 01 0E 01 01 00 00 F7 00 51 07 00 9C 15 1F FF 00 05 00 04 07 00 03 03 03 01 00 00 FE 00 1C 01 01 01 FC 00 4F 07 01 0E FA 00 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final double getYOfControl(@NotNull final f0V control) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "control"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0         /* this */
        //     8: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //    11: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //    14: invokevirtual   dev/nuker/pyro/gui/ClickGui.getSEGHEIGHT:()I
        //    17: istore_2        /* y */
        //    18: iconst_0       
        //    19: istore_3       
        //    20: aload_0         /* this */
        //    21: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.controls:Ljava/util/List;
        //    24: checkcast       Ljava/util/Collection;
        //    27: invokeinterface java/util/Collection.size:()I
        //    32: istore          4
        //    34: iload_3        
        //    35: iload           4
        //    37: if_icmpge       66
        //    40: aload_0         /* this */
        //    41: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.controls:Ljava/util/List;
        //    44: iload_3         /* i */
        //    45: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    50: checkcast       Ldev/nuker/pyro/f0V;
        //    53: aload_1         /* control */
        //    54: if_acmpne       60
        //    57: iload_2         /* y */
        //    58: i2d            
        //    59: dreturn        
        //    60: iinc            i, 1
        //    63: goto            34
        //    66: dconst_0       
        //    67: dreturn        
        //    StackMapTable: 00 03 FE 00 22 01 01 01 19 05
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected final void buildContexts() {
        @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "x", "", "y", "apply" })
        final class ClickGui$Window$Module$buildContexts$3 implements BiFunction
        {
            final /* synthetic */ ClickGui$Window$Module this$0;
            final /* synthetic */ int $i;
            
            public final boolean apply(final double x, final double y) {
                return this.this$0.isOnTop(x, y) && y > 0 && y < this.this$0.getContexts().get(this.$i).4();
            }
            
            ClickGui$Window$Module$buildContexts$3(final ClickGui$Window$Module this$0, final int $i) {
                this.this$0 = this$0;
                this.$i = $i;
            }
        }
        @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
        final class ClickGui$Window$Module$buildContexts$2 implements Runnable
        {
            final /* synthetic */ ClickGui$Window$Module this$0;
            
            @Override
            public final void run() {
                this.this$0.updateControlSizes();
            }
            
            ClickGui$Window$Module$buildContexts$2(final ClickGui$Window$Module this$0) {
                this.this$0 = this$0;
            }
        }
        @Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
        final class ClickGui$Window$Module$buildContexts$1 implements Supplier
        {
            final /* synthetic */ ClickGui$Window$Module this$0;
            
            @Override
            public final int get() {
                return this.this$0.this$0.this$0.getModuleWidth() - 1;
            }
            
            ClickGui$Window$Module$buildContexts$1(final ClickGui$Window$Module this$0) {
                this.this$0 = this$0;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.contexts:Ljava/util/List;
        //     4: invokeinterface java/util/List.clear:()V
        //     9: iconst_0       
        //    10: istore_1       
        //    11: aload_0         /* this */
        //    12: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.controls:Ljava/util/List;
        //    15: checkcast       Ljava/util/Collection;
        //    18: invokeinterface java/util/Collection.size:()I
        //    23: istore_2       
        //    24: iload_1        
        //    25: iload_2        
        //    26: if_icmpge       103
        //    29: aload_0         /* this */
        //    30: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.contexts:Ljava/util/List;
        //    33: new             Ldev/nuker/pyro/f0w;
        //    36: dup            
        //    37: new             Ldev/nuker/pyro/gui/ClickGui$Window$Module$buildContexts$1;
        //    40: dup            
        //    41: aload_0         /* this */
        //    42: invokespecial   dev/nuker/pyro/gui/ClickGui$Window$Module$buildContexts$1.<init>:(Ldev/nuker/pyro/gui/ClickGui$Window$Module;)V
        //    45: checkcast       Ljava/util/function/Supplier;
        //    48: new             Ldev/nuker/pyro/gui/ClickGui$Window$Module$buildContexts$2;
        //    51: dup            
        //    52: aload_0         /* this */
        //    53: invokespecial   dev/nuker/pyro/gui/ClickGui$Window$Module$buildContexts$2.<init>:(Ldev/nuker/pyro/gui/ClickGui$Window$Module;)V
        //    56: checkcast       Ljava/lang/Runnable;
        //    59: iconst_0       
        //    60: new             Ldev/nuker/pyro/gui/ClickGui$Window$Module$buildContexts$3;
        //    63: dup            
        //    64: aload_0         /* this */
        //    65: iload_1         /* i */
        //    66: invokespecial   dev/nuker/pyro/gui/ClickGui$Window$Module$buildContexts$3.<init>:(Ldev/nuker/pyro/gui/ClickGui$Window$Module;I)V
        //    69: checkcast       Ljava/util/function/BiFunction;
        //    72: aload_0         /* this */
        //    73: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //    76: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //    79: invokestatic    dev/nuker/pyro/gui/ClickGui.access$getFontRenderer$p:(Ldev/nuker/pyro/gui/ClickGui;)Lnet/minecraft/client/gui/FontRenderer;
        //    82: dup            
        //    83: ldc             "fontRenderer"
        //    85: invokestatic    kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        //    88: invokespecial   dev/nuker/pyro/f0w.<init>:(Ljava/util/function/Supplier;Ljava/lang/Runnable;ILjava/util/function/BiFunction;Lnet/minecraft/client/gui/FontRenderer;)V
        //    91: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    96: pop            
        //    97: iinc            i, 1
        //   100: goto            24
        //   103: return         
        //    StackMapTable: 00 02 FD 00 18 01 01 FB 00 4E
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected final void updateControlSizes() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0         /* this */
        //     2: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //     5: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //     8: invokevirtual   dev/nuker/pyro/gui/ClickGui.getSEGHEIGHT:()I
        //    11: putfield        dev/nuker/pyro/gui/ClickGui$Window$Module.height_:I
        //    14: iconst_0       
        //    15: istore_1       
        //    16: aload_0         /* this */
        //    17: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.controls:Ljava/util/List;
        //    20: checkcast       Ljava/util/Collection;
        //    23: invokeinterface java/util/Collection.size:()I
        //    28: istore_2       
        //    29: iload_1        
        //    30: iload_2        
        //    31: if_icmpge       146
        //    34: aload_0         /* this */
        //    35: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.controls:Ljava/util/List;
        //    38: iload_1         /* i */
        //    39: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    44: checkcast       Ldev/nuker/pyro/f0V;
        //    47: astore_3        /* control */
        //    48: aload_0         /* this */
        //    49: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.contexts:Ljava/util/List;
        //    52: iload_1         /* i */
        //    53: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    58: checkcast       Ldev/nuker/pyro/f0w;
        //    61: astore          context
        //    63: aload_3         /* control */
        //    64: aload           context
        //    66: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //    69: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //    72: invokeinterface dev/nuker/pyro/f0V.c:(Ldev/nuker/pyro/f0w;Ldev/nuker/pyro/f0y;)I
        //    77: istore          controlHeight
        //    79: aload           context
        //    81: iload           controlHeight
        //    83: invokevirtual   dev/nuker/pyro/f0w.c:(I)V
        //    86: aload_3         /* control */
        //    87: aload           context
        //    89: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //    92: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //    95: invokeinterface dev/nuker/pyro/f0V.0:(Ldev/nuker/pyro/f0w;Ldev/nuker/pyro/f0y;)I
        //   100: istore          controlWidth
        //   102: iload           controlWidth
        //   104: aload_0         /* this */
        //   105: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //   108: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //   111: invokevirtual   dev/nuker/pyro/gui/ClickGui.getModuleWidth:()I
        //   114: if_icmple       129
        //   117: aload_0         /* this */
        //   118: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //   121: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //   124: iload           controlWidth
        //   126: invokevirtual   dev/nuker/pyro/gui/ClickGui.setModuleWidth:(I)V
        //   129: aload_0         /* this */
        //   130: dup            
        //   131: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.height_:I
        //   134: iload           controlHeight
        //   136: iadd           
        //   137: putfield        dev/nuker/pyro/gui/ClickGui$Window$Module.height_:I
        //   140: iinc            i, 1
        //   143: goto            29
        //   146: aload_0         /* this */
        //   147: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //   150: invokevirtual   dev/nuker/pyro/gui/ClickGui$Window.updateModulePositions:()V
        //   153: return         
        //    StackMapTable: 00 03 FD 00 1D 01 01 FF 00 63 00 07 07 00 03 01 01 07 00 9C 07 01 0E 01 01 00 00 FF 00 10 00 03 07 00 03 01 01 00 00
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final int getHeight() {
        final Object 0 = this.expanded.0();
        Intrinsics.checkExpressionValueIsNotNull(0, "expanded.value");
        return 0 ? this.height_ : this.this$0.this$0.getSEGHEIGHT();
    }
    
    public final boolean contains(final double y) {
        final Object 0 = this.y.0();
        Intrinsics.checkExpressionValueIsNotNull(0, "this.y.value");
        return Double.compare(y, ((Number)0).doubleValue()) >= 0 && y <= ((Number)this.y.0()).intValue() + this.getHeight();
    }
    
    public final boolean isOnTop(final double x, final double y) {
        return this.this$0.isOnTop(x, ((Number)this.y.0()).doubleValue() + y);
    }
    
    public final void onClickedElsewhere() {
        for (final f0V control : this.controls) {
            control.1();
        }
    }
    
    public final boolean isCapturing(final double mouseX, final double mouseY) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.this$0:Ldev/nuker/pyro/gui/ClickGui$Window;
        //     4: getfield        dev/nuker/pyro/gui/ClickGui$Window.this$0:Ldev/nuker/pyro/gui/ClickGui;
        //     7: invokevirtual   dev/nuker/pyro/gui/ClickGui.getSEGHEIGHT:()I
        //    10: istore          y
        //    12: iconst_0       
        //    13: istore          6
        //    15: aload_0         /* this */
        //    16: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.controls:Ljava/util/List;
        //    19: checkcast       Ljava/util/Collection;
        //    22: invokeinterface java/util/Collection.size:()I
        //    27: istore          7
        //    29: iload           6
        //    31: iload           7
        //    33: if_icmpge       141
        //    36: aload_0         /* this */
        //    37: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.controls:Ljava/util/List;
        //    40: iload           i
        //    42: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    47: checkcast       Ldev/nuker/pyro/f0V;
        //    50: astore          control
        //    52: aload_0         /* this */
        //    53: getfield        dev/nuker/pyro/gui/ClickGui$Window$Module.contexts:Ljava/util/List;
        //    56: iload           i
        //    58: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    63: checkcast       Ldev/nuker/pyro/f0w;
        //    66: astore          context
        //    68: aload           control
        //    70: aload           context
        //    72: dload_1         /* mouseX */
        //    73: dload_3         /* mouseY */
        //    74: iload           y
        //    76: i2d            
        //    77: dsub           
        //    78: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //    81: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //    84: invokeinterface dev/nuker/pyro/f0V.1:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)Z
        //    89: ifeq            125
        //    92: aload_0         /* this */
        //    93: aload           control
        //    95: putfield        dev/nuker/pyro/gui/ClickGui$Window$Module.capturingControl:Ldev/nuker/pyro/f0V;
        //    98: aload_0         /* this */
        //    99: aload           control
        //   101: aload           context
        //   103: dload_1         /* mouseX */
        //   104: dload_3         /* mouseY */
        //   105: iload           y
        //   107: i2d            
        //   108: dsub           
        //   109: getstatic       dev/nuker/pyro/gui/ClickGui.Companion:Ldev/nuker/pyro/gui/ClickGui$Companion;
        //   112: invokevirtual   dev/nuker/pyro/gui/ClickGui$Companion.getSettings:()Ldev/nuker/pyro/f0y;
        //   115: invokeinterface dev/nuker/pyro/f0V.0:(Ldev/nuker/pyro/f0w;DDLdev/nuker/pyro/f0y;)Z
        //   120: putfield        dev/nuker/pyro/gui/ClickGui$Window$Module.captureEvents:Z
        //   123: iconst_1       
        //   124: ireturn        
        //   125: iload           y
        //   127: aload           context
        //   129: invokevirtual   dev/nuker/pyro/f0w.4:()I
        //   132: iadd           
        //   133: istore          y
        //   135: iinc            i, 1
        //   138: goto            29
        //   141: aload_0         /* this */
        //   142: aconst_null    
        //   143: checkcast       Ldev/nuker/pyro/f0V;
        //   146: putfield        dev/nuker/pyro/gui/ClickGui$Window$Module.capturingControl:Ldev/nuker/pyro/f0V;
        //   149: aload_0         /* this */
        //   150: iconst_0       
        //   151: putfield        dev/nuker/pyro/gui/ClickGui$Window$Module.captureEvents:Z
        //   154: iconst_0       
        //   155: ireturn        
        //    StackMapTable: 00 03 FE 00 1D 01 01 01 FD 00 5F 07 00 9C 07 01 0E F9 00 0F
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final String getName() {
        return this.name;
    }
    
    public final void setName(@NotNull final String <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.name = <set-?>;
    }
    
    public ClickGui$Window$Module(@NotNull final ClickGui$Window $outer, @NotNull final String name, @NotNull final List controls, @NotNull final Consumer handler, @NotNull final fw hotkey, @NotNull final fw expanded, final fw y) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(controls, "controls");
        Intrinsics.checkParameterIsNotNull(handler, "handler");
        Intrinsics.checkParameterIsNotNull(hotkey, "hotkey");
        Intrinsics.checkParameterIsNotNull(expanded, "expanded");
        Intrinsics.checkParameterIsNotNull(y, "y");
        this.this$0 = $outer;
        this.name = name;
        this.height_ = $outer.this$0.getSEGHEIGHT();
        this.controls = (List<? extends f0V>)controls;
        this.contexts = new ArrayList<f0w>();
        this.handler = (Consumer<Boolean>)handler;
        this.expanded = (fw<Boolean>)expanded;
        this.y = (fw<Integer>)y;
        controls.add(new f0J("Key", hotkey));
        this.buildContexts();
        final int func_78256_a = ClickGui.access$getFontRenderer$p($outer.this$0).func_78256_a(this.name);
        ClickGui.Companion.getSettings();
        if (func_78256_a + f0y.c * 2 > $outer.this$0.getModuleWidth()) {
            final ClickGui this$0 = $outer.this$0;
            final int func_78256_a2 = ClickGui.access$getFontRenderer$p($outer.this$0).func_78256_a(this.name);
            ClickGui.Companion.getSettings();
            this$0.setModuleWidth(func_78256_a2 + f0y.c * 2);
        }
        this.updateControlSizes();
    }
}
