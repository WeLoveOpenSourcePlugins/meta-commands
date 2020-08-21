package com.github.johnnyjayjay.metacmd;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Johnny_JayJay (https://www.github.com/JohnnyJayJay)
 */
public class MetaCommands extends JavaPlugin {

  @Override
  public void onEnable() {
    getCommand("delay").setExecutor(new DelayCommand());
    getCommand("chance").setExecutor(new ChanceCommand());
  }

}
