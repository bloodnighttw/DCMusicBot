package com.bloodnight.DCmusicBot;

import com.Bloodnight.JDATool.CommandSystem.CommandManager;
import com.bloodnight.DCmusicBot.command.Join;
import com.bloodnight.DCmusicBot.privacy.privacy;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.security.auth.login.LoginException;

public class Main {

    //private final static Logger logger
    Logger logger= LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws LoginException {

        JDA jda=new JDABuilder(privacy.token).build();
        CommandManager cm=new CommandManager(jda);
        cm.addCommand(new Join());

    }
}
