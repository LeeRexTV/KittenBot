package me.leerex.kittenbot;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.awt.*;

public class Commands extends ListenerAdapter{

    public void onMessageReceived(MessageReceivedEvent e){
        if(e.getMessage().getContentRaw().equalsIgnoreCase("k!invite")){
            EmbedBuilder builder = new EmbedBuilder();

            builder.setTitle("Invite Link");
            builder.setDescription("~~ ~~~~ ~~~~ ~~> [Click Here](https://discordapp.com/oauth2/authorize?client_id=438794476547473409&permissions=499641463&scope=bot) <~~ ~~~~ ~~~~ ~~");
            builder.setColor(Color.CYAN);

            Message message = new MessageBuilder()
                    .setEmbed(builder.build())
                    .build();
            e.getChannel().sendMessage(message).queue();

        }

        if(e.getMessage().getContentRaw().equalsIgnoreCase("k!help")) {
            EmbedBuilder builder = new EmbedBuilder();

            builder.setTitle("Meow... I see you need help!!");
            builder.setDescription("If you are in need of help you can join our discord: [Click Here](https://discord.gg/cnH7EMz)!" +
                    "\nor if you are looking for commands you can check our google docs page for help on those: [Click Here](https://google.com)");
            builder.setColor(Color.green);

            Message message = new MessageBuilder()
                    .setEmbed(builder.build())
                    .build();
            e.getChannel().sendMessage(message).queue();
        }

        if(e.getMessage().getContentRaw().equalsIgnoreCase("k!usercount")) {
            EmbedBuilder builder = new EmbedBuilder();

            builder.setTitle("Meow... Lets see how many members there is here!!");
            builder.setDescription("Looks like there is `" + e.getGuild().getMembers().size() + "` members in this server!!");
            builder.setColor(Color.green);

            Message message = new MessageBuilder()
                    .setEmbed(builder.build())
                    .build();
            e.getChannel().sendMessage(message).queue();
        }

        if(e.getMessage().getContentRaw().equalsIgnoreCase("k!welcome" )) {
            EmbedBuilder builder = new EmbedBuilder();

            builder.setTitle("Meow... Someone wants to send you some welcoming love!!");
            builder.setDescription("Welcome  "  + e.getMember().getAsMention() +  " we are all glad you joined our server!!");
            builder.setColor(Color.green);

            Message message = new MessageBuilder()
                    .setEmbed(builder.build())
                    .build();
            e.getChannel().sendMessage(message).queue();
        }


    }

}
