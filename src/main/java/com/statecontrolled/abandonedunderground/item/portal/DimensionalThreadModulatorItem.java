package com.statecontrolled.abandonedunderground.item.portal;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;
import com.statecontrolled.abandonedunderground.worldgen.AbandonedUndergroundDimension;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/**
 * The DimensionalThreadModulator item will transport the player between the <i>Overworld</i> and the <i>AbandonedUnderground</i> when right-clicked
 * This item should be set up to stack to 1 and have infinite durability.
 **/
public class DimensionalThreadModulatorItem extends Item {

    public DimensionalThreadModulatorItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        try {
            ItemStack itemStack = player.getItemInHand(interactionHand);
            player.getCooldowns().addCooldown(this, 80);

            if ((player instanceof ServerPlayer serverPlayer) && !player.isPassenger() && !player.isVehicle()) {
                level.playSound(serverPlayer, serverPlayer.getX(), serverPlayer.getY(), serverPlayer.getZ(),
                        SoundEvents.PORTAL_TRAVEL, SoundSource.NEUTRAL, 1.0f, 0.35f);

                handlePortal(serverPlayer, serverPlayer.blockPosition());

                player.awardStat(Stats.ITEM_USED.get(this));

                return InteractionResultHolder.success(itemStack);
            } else {
                AbandonedUnderground.LOGGER.log(java.util.logging.Level.INFO, "Player not teleported");
                return InteractionResultHolder.fail(itemStack);
            }
        } catch (Exception e) {
            AbandonedUnderground.LOGGER.log(java.util.logging.Level.SEVERE, "DimensionalThreadModulatorItem operation FAILED : " + e.getMessage(), e);
            return InteractionResultHolder.fail(player.getItemInHand(interactionHand));
        }
    }

    /**
     * Handles dimension changing.
     */
    private void handlePortal(ServerPlayer player, BlockPos blockPosition) {
        try {
            ResourceKey<Level> currentDimension = player.level().dimension();

            if (currentDimension.equals(AbandonedUndergroundDimension.ABANDONEDUNDERGROUND_LEVEL)) {
                ServerLevel teleportWorld = player.server.getLevel(Level.OVERWORLD);

                if (teleportWorld == null) {
                    AbandonedUnderground.LOGGER.log(java.util.logging.Level.WARNING, "Cannot teleport because destination is null!");
                    return;
                }

                player.changeDimension(teleportWorld, new ThreadModulatorTeleporter(blockPosition, 16));

            } else if (currentDimension.equals(Level.OVERWORLD)) {
                ServerLevel teleportWorld = player.server.getLevel(AbandonedUndergroundDimension.ABANDONEDUNDERGROUND_LEVEL);

                if (teleportWorld == null) {
                    AbandonedUnderground.LOGGER.log(java.util.logging.Level.WARNING, "Cannot teleport because destination is null!");
                    return;
                }

                player.changeDimension(teleportWorld, new ThreadModulatorTeleporter(blockPosition, 16));

            } else {
                player.displayClientMessage(Component.literal("Teleporting from " + currentDimension + " is not supported!"), true);
                AbandonedUnderground.LOGGER.log(java.util.logging.Level.INFO, "Teleporting from " + currentDimension + " is not supported!");
            }
        } catch (Exception e) {
            AbandonedUnderground.LOGGER.log(java.util.logging.Level.SEVERE, "Failed to handle player change dimension : " + e.getMessage(), e);
        }
    }

    @Override
    public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag isAdvanced) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.abandonedunderground.dimensional_thread_modulator.tooltip.shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.abandonedunderground.dimensional_thread_modulator.tooltip"));
        }
        super.appendHoverText(pStack, pLevel, pTooltipComponents, isAdvanced);
    }
}
