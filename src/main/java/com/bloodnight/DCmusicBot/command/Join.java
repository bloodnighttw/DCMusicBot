package com.bloodnight.DCmusicBot.command;

import com.Bloodnight.JDATool.CommandSystem.Command;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.GuildVoiceState;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.VoiceChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.managers.AudioManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Join extends Command {

    public String getCommandName() {
        return "=join";
    }

    public String getDescription() {
        return "Join Command";
    }

    public void onCommand(GuildMessageReceivedEvent guildMessageReceivedEvent, String[] strings) {

        //System.out.println("heyeeg");

        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("hekko");

        TextChannel textChannel=guildMessageReceivedEvent.getChannel();
        AudioManager audioManager=guildMessageReceivedEvent.getGuild().getAudioManager();

        if(audioManager.isConnected()) {
            textChannel.sendMessage("``WARM:`` I'm already connected").queue();
            return;
        }

        GuildVoiceState guildVoiceState= guildMessageReceivedEvent.getMember().getVoiceState();

        if(!guildVoiceState.inVoiceChannel()){
            textChannel.sendMessage("``WARM:`` Pls Join A Voice Channel").queue();
            return;
        }

        VoiceChannel vc= guildVoiceState.getChannel();
        Member member= guildMessageReceivedEvent.getGuild().getSelfMember();

        if (!member.hasPermission(vc, Permission.VOICE_CONNECT)) {
            textChannel.sendMessageFormat("I am missing permission to join %s", vc).queue();
            return;
        }

        audioManager.openAudioConnection(vc);
        textChannel.sendMessage("Joining your voice channel").queue();


    }
}
