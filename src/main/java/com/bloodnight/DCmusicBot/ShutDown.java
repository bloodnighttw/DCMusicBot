package com.bloodnight.DCmusicBot;

import com.Bloodnight.JDATool.CommandSystem.Command;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

public class ShutDown  extends Command {
    public String getCommandName() {
        return "=sd";
    }

    public String getDescription() {
        return "nothing";
    }

    public void onCommand(GuildMessageReceivedEvent guildMessageReceivedEvent, String[] strings) {

        //guildMessageReceivedEvent.getJDA().shutdownNow();

    }
}
