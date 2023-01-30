package de.jochengehtab.jochengehtab.Commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameModeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "You must be a player to use this command.");
        }

        Player player = (Player) sender;

        if (args.length < 1){
            player.sendMessage(ChatColor.RED + "You must type your gamemode.");
        }

        switch (args[0]){
            case "creative":
                player.setGameMode(GameMode.CREATIVE);
                break;

            case "survival":
                player.setGameMode(GameMode.SURVIVAL);
                break;

            case "spectator":
                player.setGameMode(GameMode.SPECTATOR);
                break;

            case "adventure":
                player.setGameMode(GameMode.ADVENTURE);
                break;
        }

        return true;
    }
}
