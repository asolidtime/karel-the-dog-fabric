package net.asolidtime.programmingproject.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


public class KarelEggItem extends Item {
    public KarelEggItem(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, 1.0F);
        if (!world.isClient) {
            playerEntity.sendMessage(Text.of("If this was implemented, a Karel would spawn!"), false);
        }
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
