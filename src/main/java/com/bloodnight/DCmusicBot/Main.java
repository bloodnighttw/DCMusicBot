package com.bloodnight.DCmusicBot;

import com.Bloodnight.JDATool.CommandSystem.CommandManager;
import com.bloodnight.DCmusicBot.command.Join;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.security.auth.login.LoginException;

public class Main {

    //private final static Logger logger
    Logger logger= LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws LoginException {

        //BasicConfigurator.configure();

        JDA jda=new JDABuilder("NDc5OTg1NDI1MTUxNDI2NTcz.Xb5U-g.fLM4MZo5ZHJizrX8yeVXcNO856c").build();
        //toolLoader tl=new toolLoader(jda);
        CommandManager cm=new CommandManager(jda);
        cm.addCommand(new Join());
        //cm.addCommand(new ShutDown());
        ;




    }
}
