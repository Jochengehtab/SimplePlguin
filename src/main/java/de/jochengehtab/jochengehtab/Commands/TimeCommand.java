package de.jochengehtab.jochengehtab.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

public class TimeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length < 1){
            sender.sendMessage(ChatColor.RED + "You must type your time.");
        }

        int time = Integer.valueOf(Arrays.toString(args));

        for (World world : Bukkit.getWorlds()){
            world.setTime(time);
        }

        return true;
    }
}
