// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.hacks.stashfinder;

import java.util.Arrays;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import kotlin.jvm.internal.Intrinsics;
import java.util.List;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 1, 1, 15 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR>\u0010\r\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00110\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018" }, d2 = { "Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig;", "", "()V", "definitions", "", "Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$StashDefinition;", "[Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$StashDefinition;", "interestGroups", "Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$InterestGroupConfig;", "getInterestGroups", "()Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$InterestGroupConfig;", "setInterestGroups", "(Ldev/nuker/pyro/hacks/stashfinder/StashFinderConfig$InterestGroupConfig;)V", "logBlocks", "", "", "kotlin.jvm.PlatformType", "", "getLogBlocks", "()Ljava/util/List;", "setLogBlocks", "(Ljava/util/List;)V", "InterestGroupConfig", "StashDefinition", "pyroclient" })
public final class StashFinderConfig
{
    @NotNull
    private StashFinderConfig$InterestGroupConfig interestGroups;
    @JvmField
    @NotNull
    public StashFinderConfig$StashDefinition[] definitions;
    private List<String> logBlocks;
    
    @NotNull
    public final StashFinderConfig$InterestGroupConfig getInterestGroups() {
        return this.interestGroups;
    }
    
    public final void setInterestGroups(@NotNull final StashFinderConfig$InterestGroupConfig <set-?>) {
        Intrinsics.checkParameterIsNotNull(<set-?>, "<set-?>");
        this.interestGroups = <set-?>;
    }
    
    public final List getLogBlocks() {
        return this.logBlocks;
    }
    
    public final void setLogBlocks(final List <set-?>) {
        this.logBlocks = (List<String>)<set-?>;
    }
    
    public StashFinderConfig() {
        this.interestGroups = new StashFinderConfig$InterestGroupConfig();
        final StashFinderConfig$StashDefinition[] definitions = { null };
        final int n = 0;
        final String name = "Dupe";
        final boolean downloadChunks = true;
        final boolean saveLargeLog = true;
        final StashFinderConfig$StashDefinition$Qualifier[] blockQualifiers = { null };
        final int n2 = 0;
        final int min = 8;
        final String[] ids = new String[18];
        final int n3 = 0;
        final String string = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_150486_ae)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "Block.REGISTRY.getNameFo\u2026(Blocks.CHEST).toString()");
        ids[n3] = string;
        final int n4 = 1;
        final String string2 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_150447_bR)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string2, "Block.REGISTRY.getNameFo\u2026TRAPPED_CHEST).toString()");
        ids[n4] = string2;
        final int n5 = 2;
        final String string3 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190975_dA)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string3, "Block.REGISTRY.getNameFo\u2026K_SHULKER_BOX).toString()");
        ids[n5] = string3;
        final int n6 = 3;
        final String string4 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190988_dw)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string4, "Block.REGISTRY.getNameFo\u2026E_SHULKER_BOX).toString()");
        ids[n6] = string4;
        final int n7 = 4;
        final String string5 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190989_dx)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string5, "Block.REGISTRY.getNameFo\u2026N_SHULKER_BOX).toString()");
        ids[n7] = string5;
        final int n8 = 5;
        final String string6 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190986_du)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string6, "Block.REGISTRY.getNameFo\u2026N_SHULKER_BOX).toString()");
        ids[n8] = string6;
        final int n9 = 6;
        final String string7 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190984_ds)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string7, "Block.REGISTRY.getNameFo\u2026Y_SHULKER_BOX).toString()");
        ids[n9] = string7;
        final int n10 = 7;
        final String string8 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190990_dy)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string8, "Block.REGISTRY.getNameFo\u2026N_SHULKER_BOX).toString()");
        ids[n10] = string8;
        final int n11 = 8;
        final String string9 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190980_do)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string9, "Block.REGISTRY.getNameFo\u2026E_SHULKER_BOX).toString()");
        ids[n11] = string9;
        final int n12 = 9;
        final String string10 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190985_dt)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string10, "Block.REGISTRY.getNameFo\u2026R_SHULKER_BOX).toString()");
        ids[n12] = string10;
        final int n13 = 10;
        final String string11 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190982_dq)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string11, "Block.REGISTRY.getNameFo\u2026E_SHULKER_BOX).toString()");
        ids[n13] = string11;
        final int n14 = 11;
        final String string12 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190979_dn)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string12, "Block.REGISTRY.getNameFo\u2026A_SHULKER_BOX).toString()");
        ids[n14] = string12;
        final int n15 = 12;
        final String string13 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190978_dm)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string13, "Block.REGISTRY.getNameFo\u2026E_SHULKER_BOX).toString()");
        ids[n15] = string13;
        final int n16 = 13;
        final String string14 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190983_dr)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string14, "Block.REGISTRY.getNameFo\u2026K_SHULKER_BOX).toString()");
        ids[n16] = string14;
        final int n17 = 14;
        final String string15 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190987_dv)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string15, "Block.REGISTRY.getNameFo\u2026E_SHULKER_BOX).toString()");
        ids[n17] = string15;
        final int n18 = 15;
        final String string16 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190991_dz)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string16, "Block.REGISTRY.getNameFo\u2026D_SHULKER_BOX).toString()");
        ids[n18] = string16;
        final int n19 = 16;
        final String string17 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190981_dp)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string17, "Block.REGISTRY.getNameFo\u2026W_SHULKER_BOX).toString()");
        ids[n19] = string17;
        final int n20 = 17;
        final String string18 = ((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_190977_dl)).toString();
        Intrinsics.checkExpressionValueIsNotNull(string18, "Block.REGISTRY.getNameFo\u2026E_SHULKER_BOX).toString()");
        ids[n20] = string18;
        blockQualifiers[n2] = new StashFinderConfig$StashDefinition$Qualifier(min, ids);
        definitions[n] = new StashFinderConfig$StashDefinition(name, downloadChunks, saveLargeLog, blockQualifiers);
        this.definitions = definitions;
        this.logBlocks = Arrays.asList(((ResourceLocation)Block.field_149771_c.func_177774_c((Object)Blocks.field_150324_C)).toString());
    }
}
