package de.jochengehtab.jochengehtab.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "You must be a player to use this command.");
        }
        
        sender.sendMessage(ChatColor.BLUE + "Join our" + ChatColor.GREEN + " Discord " + ChatColor.BLUE + "Server" + ChatColor.YELLOW + ChatColor.UNDERLINE + "https://discord.gg/BxHPrvN4" + ChatColor.BLUE + ".");
        
        return true;
    }
}
