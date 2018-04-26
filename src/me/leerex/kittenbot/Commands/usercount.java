package me.leerex.kittenbot.Commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;

public class usercount {
    public void action(MessageReceivedEvent e){
        EmbedBuilder builder = new EmbedBuilder();

        builder.setTitle("Meow... Lets see how many members there is here!!");
        builder.setDescription("Looks like there is `" + e.getGuild().getMembers().size() + "` members in this server!!");
        builder.setColor(Color.green);

        Message message = new MessageBuilder()
                .setEmbed(builder.build())
                .build();
        e.getChannel().sendMessage(message).queue();
    }
}
