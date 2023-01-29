package de.jochengehtab.jochengehtab;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Jochengehtab extends JavaPlugin {

    private static Jochengehtab instance;
    @Override
    public void onEnable() {
        instance = this;
        registerCommands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void registerCommands(){

    }

    private void registerCommand(String name, CommandExecutor commandExe){
        getCommand(name).setExecutor(commandExe);
    }

    public static Jochengehtab getInstance() {
        return instance;
    }
}
