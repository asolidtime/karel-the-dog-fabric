package net.asolidtime.programmingproject.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class KarelEggItem extends SpawnEggItem {
    public KarelEggItem(EntityType<?> type, int primaryColor, int secondaryColor, Settings settings) {
        super(type, primaryColor, secondaryColor, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(SoundEvents.ENTITY_TURTLE_EGG_CRACK, 1.0F, 1.0F);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}