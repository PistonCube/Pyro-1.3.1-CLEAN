// 
// Decompiled by Procyon v0.5.36
// 

package dev.nuker.pyro.mixin;

import net.minecraft.block.SoundType;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickBlock;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraft.block.BlockStructure;
import net.minecraft.block.BlockCommandBlock;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.eventhandler.Event$Result;
import net.minecraft.world.IBlockAccess;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.common.ForgeHooks;
import net.minecraft.util.EnumActionResult;
import dev.nuker.pyro.f3k;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketClickWindow;
import dev.nuker.pyro.f35;
import net.minecraft.inventory.ClickType;
import dev.nuker.pyro.f3f;
import dev.nuker.pyro.f39;
import net.minecraft.util.EnumFacing;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.minecraft.init.Blocks;
import dev.nuker.pyro.f4N;
import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import dev.nuker.pyro.f37;
import dev.nuker.pyro.f2T;
import dev.nuker.pyro.Pyro;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameType;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ PlayerControllerMP.class })
public abstract class PlayerControllerMPMixin
{
    @Shadow
    @Final
    private Minecraft field_78776_a;
    @Shadow
    private GameType field_78779_k;
    @Shadow
    private BlockPos field_178895_c;
    @Shadow
    @Final
    private NetHandlerPlayClient field_78774_b;
    
    @Shadow
    private void func_78750_j() {
    }
    
    @Shadow
    public abstract float func_78757_d();
    
    @Inject(method = { "attackEntity" }, at = { @At("HEAD") })
    public void attackEntityPre(final EntityPlayer playerIn, final Entity targetEntity, final CallbackInfo info) {
        Pyro.getEventManager().c(new f37(f2T.c, targetEntity));
    }
    
    @Inject(method = { "attackEntity" }, at = { @At("RETURN") })
    public void attackEntityPost(final EntityPlayer playerIn, final Entity targetEntity, final CallbackInfo info) {
        Pyro.getEventManager().c(new f37(f2T.0, targetEntity));
    }
    
    @Redirect(method = { "onPlayerDestroyBlock" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/block/Block;removedByPlayer(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;Z)Z"))
    public boolean removedByPlayer(final Block block, final IBlockState state, final World world, final BlockPos pos, final EntityPlayer player, final boolean willHarvest) {
        block.func_176208_a(world, pos, state, player);
        return (!(boolean)f4N.c.c.0() || !(boolean)f4N.c.0.3()) && world.func_180501_a(pos, Blocks.field_150350_a.func_176223_P(), world.field_72995_K ? 11 : 3);
    }
    
    @Inject(method = { "getBlockReachDistance" }, at = { @At("HEAD") }, cancellable = true)
    public void getBlockReachDistance(final CallbackInfoReturnable info) {
        if (f4N.c.c.0()) {
            info.cancel();
            final float attrib = (float)this.field_78776_a.field_71439_g.func_110148_a(EntityPlayer.REACH_DISTANCE).func_111126_e();
            info.setReturnValue((float)(double)f4N.c.0().3() + (this.field_78779_k.func_77145_d() ? attrib : (attrib - 0.5f)));
        }
    }
    
    @Inject(method = { "onPlayerDamageBlock" }, at = { @At("HEAD") }, cancellable = true)
    public void onPlayerDamageBlock(final BlockPos posBlock, final EnumFacing directionFacing, final CallbackInfoReturnable info) {
        final f39 event = new f39(f2T.c, posBlock, directionFacing);
        Pyro.getEventManager().c(event);
        if (event.0()) {
            info.cancel();
            info.setReturnValue(false);
        }
    }
    
    @Inject(method = { "onPlayerDamageBlock" }, at = { @At("RETURN") })
    public void onPlayerDamageBlockPost(final BlockPos posBlock, final EnumFacing directionFacing, final CallbackInfoReturnable info) {
        Pyro.getEventManager().c(new f39(f2T.0, posBlock, directionFacing));
    }
    
    @Inject(method = { "onStoppedUsingItem" }, at = { @At("HEAD") }, cancellable = true)
    public void onStoppedUsingItem(final CallbackInfo info) {
        final f3f event = new f3f();
        Pyro.getEventManager().c(event);
        if (event.0()) {
            info.cancel();
        }
        if (f4N.c.c.0()) {
            info.cancel();
        }
    }
    
    @Inject(method = { "windowClick" }, at = { @At("HEAD") }, cancellable = true)
    public void windowClick(final int windowId, final int slotId, final int mouseButton, final ClickType type, final EntityPlayer player, final CallbackInfoReturnable callback) {
        final f35 event = new f35(windowId, slotId, mouseButton, type);
        Pyro.getEventManager().c(event);
        if (event.0()) {
            callback.cancel();
            if (event.2() != slotId) {
                final short short1 = player.field_71070_bA.func_75136_a(player.field_71071_by);
                final ItemStack itemstack = player.field_71070_bA.func_184996_a(slotId, mouseButton, type, player);
                this.field_78774_b.func_147297_a((Packet)new CPacketClickWindow(windowId, slotId, mouseButton, type, itemstack, short1));
                callback.setReturnValue(itemstack);
            }
            else {
                callback.setReturnValue(ItemStack.field_190927_a);
            }
        }
    }
    
    @Inject(method = { "processRightClickBlock" }, at = { @At("HEAD") }, cancellable = true)
    private void processRightClickBlock(final EntityPlayerSP player, final WorldClient worldIn, final BlockPos pos, final EnumFacing direction, final Vec3d vec, final EnumHand hand, final CallbackInfoReturnable info) {
        final f3k event2 = new f3k(hand);
        Pyro.getEventManager().c(event2);
        if (event2.0()) {
            info.setReturnValue(EnumActionResult.FAIL);
            return;
        }
        if ((boolean)f4N.c.c.0() && (boolean)f4N.c.c.3()) {
            info.cancel();
            this.func_78750_j();
            final ItemStack itemstack = player.func_184586_b(hand);
            final float f = (float)(vec.field_72450_a - pos.func_177958_n());
            final float f2 = (float)(vec.field_72448_b - pos.func_177956_o());
            final float f3 = (float)(vec.field_72449_c - pos.func_177952_p());
            boolean flag = false;
            if (!this.field_78776_a.field_71441_e.func_175723_af().func_177746_a(pos)) {
                info.setReturnValue(EnumActionResult.FAIL);
            }
            else {
                final PlayerInteractEvent$RightClickBlock event3 = ForgeHooks.onRightClickBlock((EntityPlayer)player, hand, pos, direction, ForgeHooks.rayTraceEyeHitVec((EntityLivingBase)player, (double)(this.func_78757_d() + 1.0f)));
                if (event3.isCanceled()) {
                    this.field_78774_b.func_147297_a((Packet)new CPacketPlayerTryUseItemOnBlock(pos, direction, hand, f, f2, f3));
                    info.setReturnValue(event3.getCancellationResult());
                }
                EnumActionResult result = EnumActionResult.PASS;
                if (this.field_78779_k != GameType.SPECTATOR) {
                    final EnumActionResult ret = itemstack.onItemUseFirst((EntityPlayer)player, (World)worldIn, pos, hand, direction, f, f2, f3);
                    if (ret != EnumActionResult.PASS) {
                        this.field_78774_b.func_147297_a((Packet)new CPacketPlayerTryUseItemOnBlock(pos, direction, hand, f, f2, f3));
                        info.setReturnValue(ret);
                    }
                    final IBlockState iblockstate = worldIn.func_180495_p(pos);
                    final boolean bypass = player.func_184614_ca().doesSneakBypassUse((IBlockAccess)worldIn, pos, (EntityPlayer)player) && player.func_184592_cb().doesSneakBypassUse((IBlockAccess)worldIn, pos, (EntityPlayer)player);
                    if (!player.func_70093_af() || bypass || event3.getUseBlock() == Event$Result.ALLOW) {
                        if (event3.getUseBlock() != Event$Result.DENY) {
                            flag = iblockstate.func_177230_c().func_180639_a((World)worldIn, pos, iblockstate, (EntityPlayer)player, hand, direction, f, f2, f3);
                        }
                        if (flag) {
                            result = EnumActionResult.SUCCESS;
                        }
                    }
                    if (!flag && itemstack.func_77973_b() instanceof ItemBlock) {
                        final ItemBlock itemblock = (ItemBlock)itemstack.func_77973_b();
                        if (!itemblock.func_179222_a((World)worldIn, pos, direction, (EntityPlayer)player, itemstack)) {
                            info.setReturnValue(EnumActionResult.FAIL);
                        }
                    }
                }
                this.field_78774_b.func_147297_a((Packet)new CPacketPlayerTryUseItemOnBlock(pos, direction, hand, f, f2, f3));
                if ((!flag && this.field_78779_k != GameType.SPECTATOR) || event3.getUseItem() == Event$Result.ALLOW) {
                    if (itemstack.func_190926_b()) {
                        info.setReturnValue(EnumActionResult.PASS);
                    }
                    else if (player.func_184811_cZ().func_185141_a(itemstack.func_77973_b())) {
                        info.setReturnValue(EnumActionResult.PASS);
                    }
                    else {
                        if (itemstack.func_77973_b() instanceof ItemBlock && !player.func_189808_dh()) {
                            final Block block = ((ItemBlock)itemstack.func_77973_b()).func_179223_d();
                            if (block instanceof BlockCommandBlock || block instanceof BlockStructure) {
                                info.setReturnValue(EnumActionResult.FAIL);
                            }
                        }
                        if (this.field_78779_k.func_77145_d()) {
                            final int i = itemstack.func_77960_j();
                            final int j = itemstack.func_190916_E();
                            if (event3.getUseItem() != Event$Result.DENY) {
                                final EnumActionResult enumactionresult = (itemstack.func_77973_b() instanceof ItemBlock) ? this.onItemUse((ItemBlock)itemstack.func_77973_b(), (EntityPlayer)player, (World)worldIn, pos, hand, direction, f, f2, f3) : itemstack.func_179546_a((EntityPlayer)player, (World)worldIn, pos, hand, direction, f, f2, f3);
                                itemstack.func_77964_b(i);
                                itemstack.func_190920_e(j);
                                info.setReturnValue(enumactionresult);
                            }
                            else {
                                info.setReturnValue(result);
                            }
                        }
                        else {
                            final ItemStack copyForUse = itemstack.func_77946_l();
                            if (event3.getUseItem() != Event$Result.DENY) {
                                result = ((itemstack.func_77973_b() instanceof ItemBlock) ? this.onItemUse((ItemBlock)itemstack.func_77973_b(), (EntityPlayer)player, (World)worldIn, pos, hand, direction, f, f2, f3) : itemstack.func_179546_a((EntityPlayer)player, (World)worldIn, pos, hand, direction, f, f2, f3));
                            }
                            if (itemstack.func_190926_b()) {
                                ForgeEventFactory.onPlayerDestroyItem((EntityPlayer)player, copyForUse, hand);
                            }
                            info.setReturnValue(result);
                        }
                    }
                }
                else {
                    info.setReturnValue(EnumActionResult.SUCCESS);
                }
            }
        }
    }
    
    public EnumActionResult onItemUse(final ItemBlock stack, final EntityPlayer player, final World worldIn, BlockPos pos, final EnumHand hand, final EnumFacing facing, final float hitX, final float hitY, final float hitZ) {
        final IBlockState iblockstate = worldIn.func_180495_p(pos);
        final Block block = iblockstate.func_177230_c();
        if (!block.func_176200_f((IBlockAccess)worldIn, pos)) {
            pos = pos.func_177972_a(facing);
        }
        final ItemStack itemstack = player.func_184586_b(hand);
        if (!itemstack.func_190926_b() && player.func_175151_a(pos, facing, itemstack) && worldIn.func_190527_a(stack.func_179223_d(), pos, false, facing, (Entity)null)) {
            final int i = stack.func_77647_b(itemstack.func_77960_j());
            final IBlockState iblockstate2 = worldIn.func_180495_p(pos);
            final SoundType soundtype = iblockstate2.func_177230_c().getSoundType(iblockstate2, worldIn, pos, (Entity)player);
            worldIn.func_184133_a(player, pos, soundtype.func_185841_e(), SoundCategory.BLOCKS, (soundtype.func_185843_a() + 1.0f) / 2.0f, soundtype.func_185847_b() * 0.8f);
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.FAIL;
    }
}
