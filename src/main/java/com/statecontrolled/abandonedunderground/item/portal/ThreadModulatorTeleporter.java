package com.statecontrolled.abandonedunderground.item.portal;

import java.util.function.Function;

import com.statecontrolled.abandonedunderground.AbandonedUnderground;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.util.ITeleporter;

/**
 * This is not an item, but a helper class for the DimensionalThreadModulatorItem class.<p>
 * This class handles placing the player in the destination dimension and, if necessary, carving out a valid spawn position.
 **/
public class ThreadModulatorTeleporter implements ITeleporter {
    private final int MAX_SEARCH_RADIUS;
    private final BlockPos teleporterPosition;

    /**
     * This ThreadModulatorTeleporter class handles placing the player in the destination dimension and, if necessary, carving out a valid spawn position.
     * It is not a physical item or block and only exists as an abstract object.<p>
     * The {@code pos} parameter is usually the same position where the player will spawn in the destination dimension, but if that location is not safe in
     * the destination a new location will be found or a safe position will be created by replacing some blocks with {@code AIR}.
     * @param pos               a starting block position to start the search for a safe spawn position
     * @param maxSearchRadius   the maximum radius to search for a safe spawn location
     */
    public ThreadModulatorTeleporter(BlockPos pos, int maxSearchRadius) {
        this.teleporterPosition = pos;
        this.MAX_SEARCH_RADIUS = maxSearchRadius;
    }

    @Override
    public Entity placeEntity(Entity entity, ServerLevel currentWorld, ServerLevel destinationWorld, float yaw, Function<Boolean, Entity> repositionEntity) {
        try {
            Entity e = repositionEntity.apply(false);
            if (!(e instanceof ServerPlayer serverPlayer)) {
                AbandonedUnderground.LOGGER.log(java.util.logging.Level.WARNING, "Entity is not a ServerPlayer");
                return e;
            }

            Vec3 playerSpawnPosition;

            playerSpawnPosition = findPlayerSpawnPosition(destinationWorld, serverPlayer.blockPosition());

            if (playerSpawnPosition == null) {
                AbandonedUnderground.LOGGER.log(java.util.logging.Level.WARNING, "Player spawn position is NULL");
                serverPlayer.teleportTo(teleporterPosition.getX() + 0.5, teleporterPosition.getY() + 1, teleporterPosition.getZ() + 0.5);
                return e;
            }
            // Teleport the player to the corresponding coordinates in the destination dimension
            serverPlayer.teleportTo(playerSpawnPosition.x + 0.5, playerSpawnPosition.y + 1, playerSpawnPosition.z + 0.5);
            return e;
        } catch (Exception e) {
            AbandonedUnderground.LOGGER.log(java.util.logging.Level.SEVERE, "Failed to spawn player entity! " + e.getMessage(), e);
            return entity;
        }
    }

    private Vec3 findPlayerSpawnPosition(ServerLevel world, BlockPos position) {
        try {
            BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();

            int min = world.getMinBuildHeight();
            int max = world.getMaxBuildHeight();
            int xPos = position.getX();
            int zPos = position.getZ();

            // Try to find a location to spawn the player.
            for (int y = max - 16; y > min; y--) {
                for (int x = xPos; x < xPos + MAX_SEARCH_RADIUS; x++) {
                    for (int z = zPos; z < zPos + MAX_SEARCH_RADIUS; z++) {
                        pos.set(x, y, z);
                        // Check blocks above and below current position in destination dimension for suitable spawn position
                        // If the position is suitable, spawn the player there
                        if ( world.getBlockState(pos.above(1)).isAir() && world.getBlockState(pos.above(2)).isAir() &&
                                world.getBlockState(pos.above(3)).isAir() && !(world.getBlockState(pos.below(1)).isAir()) ) {

                            return new Vec3(pos.getX(), pos.getY(), pos.getZ());
                        }
                    }
                }
            }

            for (int y = max - 16; y > min; y--) {
                for (int x = xPos; x < xPos + MAX_SEARCH_RADIUS; x++) {
                    for (int z = zPos; z < zPos + MAX_SEARCH_RADIUS; z++) {
                        pos.set(x, y, z);
                        // Check blocks above and below current position in destination dimension for suitable spawn position
                        // If the position is suitable, clear the area, and spawn the player there
                        if ( isReplaceable(world, pos) && isReplaceable(world, pos.above(1)) && isReplaceable(world, pos.above(2))
                                && isReplaceable(world, pos.above(3)) && !(world.getBlockState(pos.below(1)).isAir()) ) {

                            // Clear area for player spawn
                            world.setBlockAndUpdate(pos.above(1), Blocks.AIR.defaultBlockState());
                            world.setBlockAndUpdate(pos.above(2), Blocks.AIR.defaultBlockState());
                            world.setBlockAndUpdate(pos.above(3), Blocks.AIR.defaultBlockState());

                            return new Vec3(pos.getX(), pos.getY(), pos.getZ());
                        }
                    }
                }
            }
        } catch (Exception e) {
            AbandonedUnderground.LOGGER.log(java.util.logging.Level.SEVERE, "FAILED to find a place to spawn the player : " + e.getMessage(), e);
        }
        AbandonedUnderground.LOGGER.log(java.util.logging.Level.SEVERE, "FAILED to find a place to spawn the player!");
        return null;
    }

    private boolean isReplaceable(Level world, BlockPos pos) {
        try {
            BlockState state = world.getBlockState(pos);
            return state.getBlock() == Blocks.STONE     || state.getBlock() == Blocks.GRANITE   ||
                    state.getBlock() == Blocks.ANDESITE || state.getBlock() == Blocks.DIORITE   ||
                    state.getBlock() == Blocks.DIRT     || state.getBlock() == Blocks.GRAVEL    ||
                    state.getBlock() == Blocks.LAVA     || state.getBlock() == Blocks.WATER     ||
                    state.isAir();
        } catch (Exception e) {
            AbandonedUnderground.LOGGER.log(java.util.logging.Level.SEVERE, "Somehow the isReplaceable() method has failed : " + e.getMessage(), e);
            return false;
        }
    }

}