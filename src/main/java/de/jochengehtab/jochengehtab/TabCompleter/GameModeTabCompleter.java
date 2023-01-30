package de.jochengehtab.jochengehtab.TabCompleter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class GameModeTabCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {

        List<String> completes = new ArrayList<>();

        completes.add("creative");
        completes.add("survival");
        completes.add("spectator");
        completes.add("adventure");

        if (args.length == 1){
            return completes;
        }

        return new ArrayList<>();
    }
}
