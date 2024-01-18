package net.hungryfox.starmagic.item.wands;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class StarterWand extends Item {
    public StarterWand(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= positionClicked.getY() + 64; i++) {
                BlockState state = context.getWorld().getBlockState(positionClicked.down(i));

                if(state.isOf(Blocks.STONE)) {
                    foundBlock = true;
                    BlockPos BlockPosition = positionClicked.down(i);
                    assert player != null;
                    player.sendMessage(Text.literal("Among us, stone at " + "[" + BlockPosition.getX() + ", " + BlockPosition.getY() + ", " + BlockPosition.getZ() + "]"));
                    break;
                }
            }

            if(!foundBlock) {
                assert player != null;
                player.sendMessage(Text.literal("No among us stone :c"));
            }

            context.getStack().damage(1, context.getPlayer(), playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));

        }
        return ActionResult.SUCCESS;
    }
}
