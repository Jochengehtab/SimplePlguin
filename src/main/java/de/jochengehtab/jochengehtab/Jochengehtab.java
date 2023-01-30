package de.jochengehtab.jochengehtab;

import de.jochengehtab.jochengehtab.Commands.*;
import de.jochengehtab.jochengehtab.TabCompleter.GameModeTabCompleter;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

@SuppressWarnings("unused")
public final class Jochengehtab extends JavaPlugin {

    private static Jochengehtab instance;
    @Override
    public void onEnable() {
        instance = this;
        registerCommands();
        registerEvents();
        registerTabCompleters();
    }

    @Override
    public void onDisable() {}

    private void registerEvents() {

    }

    private void registerCommands(){
        registerCommand("heal", new HealCommand());
        registerCommand("feed", new FeedCommand());
        registerCommand("gm", new GameModeCommand());
        registerCommand("discord", new DiscordCommand());
        registerCommand("time", new TimeCommand());
    }

    private void registerTabCompleters(){
        registerTabCompleter("gm", new GameModeTabCompleter());
    }

    private void registerTabCompleter(String name, TabCompleter tabCompleter){
        Objects.requireNonNull(getCommand(name)).setTabCompleter(tabCompleter);
    }

    private void registerCommand(String name, CommandExecutor commandExe){
        Objects.requireNonNull(getCommand(name)).setExecutor(commandExe);
    }

    private void registerEvent(Listener listener){
        this.getServer().getPluginManager().registerEvents(listener, this);
    }

    public static Jochengehtab getInstance() {
        return instance;
    }
}
