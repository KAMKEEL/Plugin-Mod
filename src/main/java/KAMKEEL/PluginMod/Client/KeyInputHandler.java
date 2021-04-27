package KAMKEEL.PluginMod.Client;

import KAMKEEL.PluginMod.Network.MessageSwitchOrientation;
import KAMKEEL.PluginMod.Network.MessageTransformItem;
import KAMKEEL.PluginMod.Network.NetworkHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputHandler{
    private Keybindings getPressedKey(){
        for(Keybindings key : Keybindings.values()) {
            if(key.isPressed()) return key;
        }
        return null;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event){
        Keybindings key = getPressedKey();
        if(key != null) {
            switch(key){
                case ORIENT:
                    NetworkHandler.sendToServer(new MessageSwitchOrientation());
                    break;
                case TRANSFORM:
                    NetworkHandler.sendToServer(new MessageTransformItem());
                    break;
            }
        }
    }
}
