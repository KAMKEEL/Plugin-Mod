package KAMKEEL.PluginMod.Client;

import java.util.Random;

public class ClientEvents {

    private Random random;

    public ClientEvents() {
        this.random = new Random();
    }


    /**
     * Alter FOV for our bows

     @SubscribeEvent
     public void fovUpdate(FOVUpdateEvent event) {
     if (event.entity.isUsingItem() && (event.entity.getItemInUse().getItem() instanceof ItemPluginBowInterface))
     {
     int i = event.entity.getItemInUseDuration();
     float f1 = (float)i / 20.0F;

     if (f1 > 1.0F)
     {
     f1 = 1.0F;
     }
     else
     {
     f1 *= f1;
     }

     event.newfov *= 1.0F - f1 * 0.15F;
     }
     }

     */

}