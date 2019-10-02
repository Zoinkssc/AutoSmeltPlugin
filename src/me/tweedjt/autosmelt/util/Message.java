package me.tweedjt.autosmelt.util;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Message {
	// Send a message to a commandsender (player or console)
	public static void toSender(String message, CommandSender sender) {
        if (sender != null)
        {
        	sender.sendMessage(Misc.colorToString("&d[&fAutoSmelt&d] &r" + message));
        }
    }
	// Send a message to a player (no console)
    public static void toPlayer(String message, Player player) {
        if (player != null)
        {
        	player.sendMessage(Misc.colorToString("&d[&fAutoSmelt&d] &r" + message));
        } 
    }
}
