package no.dadobug.fabric;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import no.dadobug.Blocks.fabric.BedrockFluid;
import no.dadobug.Blocks.fabric.BedrockOre;
import no.dadobug.Blocks.fabric.XPLeak;

import java.util.Optional;

public class ExpectPlatformBoxImpl {

    public static Block newBedrockOre(AbstractBlock.Settings settings, boolean replaceWithBedrock, int XPmin, int XPmax){
        return new BedrockOre(settings, replaceWithBedrock, XPmin, XPmax);
    }


    public static Block newBedrockFluid(AbstractBlock.Settings settings, boolean replaceWithBedrock, Fluid fluidIn, int XPmin, int XPmax){
        return new BedrockFluid(settings, replaceWithBedrock, fluidIn, XPmin, XPmax);
    }


    public static Block newBedrockFluid(AbstractBlock.Settings settings, boolean replaceWithBedrock, ItemStack bucketIn, Optional<SoundEvent> bucketSoundIn, int XPmin, int XPmax){
        return new BedrockFluid(settings, replaceWithBedrock, bucketIn, bucketSoundIn, XPmin, XPmax);
    }


    public static Block newXPLeak(AbstractBlock.Settings settings, boolean replaceWithBedrock, int XPmin, int XPmax){
        return new XPLeak(settings, replaceWithBedrock, XPmin, XPmax);
    }
}
