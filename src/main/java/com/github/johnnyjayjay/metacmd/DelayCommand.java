package com.github.johnnyjayjay.metacmd;

import com.google.common.primitives.Longs;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

/**
 * @author Johnny_JayJay (https://www.github.com/JohnnyJayJay)
 */
public class DelayCommand implements CommandExecutor {

  private final Plugin plugin = JavaPlugin.getPlugin(MetaCommands.class);

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (args.length < 2) {
      return false;
    }
    Long delay = Longs.tryParse(args[0]);
    if (delay == null) {
      sender.sendMessage("§c\"" + args[0] + "\" is not a valid number of ticks. Use a number like \"5\" or \"200\".");
    } else {
      String actualCommand = String.join(" ", Arrays.copyOfRange(args, 1, args.length));
      Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> Bukkit.dispatchCommand(sender, actualCommand), delay);
    }
    return true;
  }

}
