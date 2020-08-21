package com.github.johnnyjayjay.metacmd;

import com.google.common.primitives.Doubles;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

/**
 * @author Johnny_JayJay (https://www.github.com/JohnnyJayJay)
 */
public class ChanceCommand implements CommandExecutor {

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (args.length < 2) {
      return false;
    }
    Double chance = Doubles.tryParse(args[0]);
    if (chance == null) {
      sender.sendMessage("§c\"" + args[0] + "\" is not a valid chance. Use a number like \"80\" or \"12.563\".");
    } else if (Math.random() * 100 < chance) {
      String actualCommand = String.join(" ", Arrays.copyOfRange(args, 1, args.length));
      Bukkit.dispatchCommand(sender, actualCommand);
    }
    return true;
  }
}
