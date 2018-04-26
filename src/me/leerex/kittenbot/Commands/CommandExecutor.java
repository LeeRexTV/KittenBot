package me.leerex.kittenbot.Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class CommandExecutor extends ListenerAdapter {
    public static help help = new help();
    public static invite invite = new invite();
    public static usercount usercount = new usercount();
    public static welcome welcome = new welcome();

    public static String[] args;


    public void onMessageReceived(MessageReceivedEvent e){

        if(e.getMessage().getContentRaw().equalsIgnoreCase("k!invite")){
            invite.action(e);
        }


        if(e.getMessage().getContentRaw().equalsIgnoreCase("k!usercount")){
            usercount.action(e);
        }


        if(e.getMessage().getContentRaw().equalsIgnoreCase("k!help")){
            help.action(e);
        }


        if(e.getMessage().getContentRaw().equalsIgnoreCase("k!welcome")){

            welcome.action(e);

            //e.getChannel().sendMessage("\\❌ Not enough arguments!").queue();
        }
    }
}
