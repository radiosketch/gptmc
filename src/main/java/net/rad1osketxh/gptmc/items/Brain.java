package net.rad1osketxh.gptmc.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.rad1osketxh.gptmc.GPTMC;

public class Brain extends Item {
    /**
     * Brain; give it to Piglins, Villagers, Pillagers, and Illagers for a massive intelligence boost!
     * Dropped by all players, and mobs that have been given one!
     * @param settings Item Settings
     */
    public Brain(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        /*
          Launch the player in the looking direction
          Vec3d velocity = playerEntity.getRotationVector();
          playerEntity.setVelocity(velocity.x * 5, velocity.y * 5, velocity.z * 5);
          playerEntity.playSound(SoundEvents.ENTITY_PLAYER_BURP, 1.0F, 1.5F/(2.0F * RANDOM.nextFloat()) + 0.5F);
         */
        LivingEntity entity = playerEntity.getAttacking();
        GPTMC.LOGGER.info("getAttacking: ");
        GPTMC.LOGGER.info(entity);

        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
