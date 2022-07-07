// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.gui;

import org.jetbrains.annotations.NotNull;
import dev.nuker.pyro.f0Z;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b¦\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nH&J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH&J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H&J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u001b" }, d2 = { "Ldev/nuker/pyro/gui/ClickGui$AbstractWindow;", "", "(Ldev/nuker/pyro/gui/ClickGui;)V", "contains", "", "x", "", "y", "getX", "width", "", "getY", "height", "headerContains", "keyTyped", "", "typedChar", "", "keyCode", "mouseEvent", "event", "Ldev/nuker/pyro/api/ui/mouse/MouseEvent;", "onClickedElsewhere", "render", "mouseX", "mouseY", "setPosition", "pyroclient" })
public abstract class ClickGui$AbstractWindow
{
    final /* synthetic */ ClickGui this$0;
    
    public abstract boolean contains(final double p0, final double p1);
    
    public abstract boolean headerContains(final double p0, final double p1);
    
    public abstract double getX(final int p0);
    
    public abstract double getY(final int p0);
    
    public abstract void setPosition(final double p0, final double p1);
    
    public abstract void mouseEvent(@NotNull final f0Z p0);
    
    public void onClickedElsewhere() {
    }
    
    public abstract void keyTyped(final char p0, final int p1);
    
    public abstract void render(final double p0, final double p1);
    
    public ClickGui$AbstractWindow(final ClickGui $outer) {
        this.this$0 = $outer;
    }
}
