package com.github.alexthe666.alexsmobs.misc;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.util.ResourceLocation;

public class AMAdvancementTriggerRegistry {

    public static AMAdvancementTrigger MOSQUITO_SICK = new AMAdvancementTrigger(new ResourceLocation("alexsmobs:mosquito_sick"));

    public static void init(){
        CriteriaTriggers.register(MOSQUITO_SICK);
    }

}
