package org.tittynope.networkController;

import org.bukkit.plugin.java.JavaPlugin;

public class NetworkController extends JavaPlugin {
   @Override
   public void onEnable() {
      getLogger().info("onEnable is called!");
   }
   @Override
   public void onDisable() {
      getLogger().info("onDisable is called!");
   }
}
