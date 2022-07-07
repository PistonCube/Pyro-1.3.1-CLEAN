// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.hacks.stashfinder;

import java.util.Arrays;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import java.util.List;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR>\u0010\u000f\u001a&\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u0011 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\u00130\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018" }, d2 = { "Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$InterestGroupConfig;", "", "()V", "doFullScan", "", "getDoFullScan", "()Z", "setDoFullScan", "(Z)V", "groupDistance", "", "getGroupDistance", "()I", "setGroupDistance", "(I)V", "scanBlocks", "", "", "kotlin.jvm.PlatformType", "", "getScanBlocks", "()Ljava/util/List;", "setScanBlocks", "(Ljava/util/List;)V", "pyroclient" })
public final class StashFinderConfig$InterestGroupConfig
{
    private int groupDistance;
    private boolean doFullScan;
    private List<String> scanBlocks;
    
    public final int getGroupDistance() {
        return this.groupDistance;
    }
    
    public final void setGroupDistance(final int <set-?>) {
        this.groupDistance = <set-?>;
    }
    
    public final boolean getDoFullScan() {
        return this.doFullScan;
    }
    
    public final void setDoFullScan(final boolean <set-?>) {
        this.doFullScan = <set-?>;
    }
    
    public final List getScanBlocks() {
        return this.scanBlocks;
    }
    
    public final void setScanBlocks(final List <set-?>) {
        this.scanBlocks = (List<String>)<set-?>;
    }
    
    public StashFinderConfig$InterestGroupConfig() {
        this.groupDistance = 25;
        this.scanBlocks = Arrays.asList(((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_150486_ae)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_150447_bR)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190975_dA)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190988_dw)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190989_dx)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190986_du)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190984_ds)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190990_dy)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190980_do)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190985_dt)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190982_dq)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190979_dn)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190978_dm)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190983_dr)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190987_dv)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190991_dz)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190981_dp)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190977_dl)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_150472_an)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_150444_as)).toString(), ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_150474_ac)).toString());
    }
}
