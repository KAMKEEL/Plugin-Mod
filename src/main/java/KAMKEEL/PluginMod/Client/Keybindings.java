package KAMKEEL.PluginMod.Client;

import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public enum Keybindings{

    ORIENT("key.plug.orient", Keyboard.KEY_P),
    TRANSFORM("key.plug.transform", Keyboard.KEY_L);

    private final KeyBinding keybinding;

    private Keybindings(String keyName, int defaultKeyCode){
        keybinding = new KeyBinding(keyName, defaultKeyCode, "key.categories.plugin");
    }

    public KeyBinding getKeybind(){
        return keybinding;
    }

    public boolean isPressed(){
        return keybinding.isPressed();
    }

}